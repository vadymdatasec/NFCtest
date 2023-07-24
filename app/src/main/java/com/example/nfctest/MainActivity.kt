package com.example.nfctest

import android.app.PendingIntent
import android.content.ComponentName
import android.content.Intent
import android.content.IntentFilter
import android.nfc.NdefMessage
import android.nfc.NdefRecord
import android.nfc.NfcAdapter
import android.nfc.NfcAdapter.ACTION_NDEF_DISCOVERED
import android.nfc.Tag
import android.nfc.cardemulation.CardEmulation
import android.nfc.cardemulation.CardEmulation.CATEGORY_OTHER
import android.nfc.tech.IsoDep
import android.nfc.tech.MifareClassic
import android.nfc.tech.Ndef
import android.nfc.tech.NdefFormatable
import android.nfc.tech.NfcA
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nfctest.ui.theme.NFCTestTheme
import java.io.UnsupportedEncodingException
import java.nio.charset.Charset
import kotlin.experimental.and


class MainActivity : ComponentActivity() {
    var pendingIntent: PendingIntent? = null
    val nfcAdapter: NfcAdapter by lazy {
        NfcAdapter.getDefaultAdapter(this)
    }

    private var ndefTechnology: Ndef? = null

    var filters = arrayOf(
        IntentFilter(NfcAdapter.ACTION_TECH_DISCOVERED),
        IntentFilter(ACTION_NDEF_DISCOVERED),
        IntentFilter(NfcAdapter.ACTION_TAG_DISCOVERED)
    )
    var techList = arrayOf(
//        arrayOf(IsoDep::class.java.name),
        arrayOf(NdefFormatable::class.java.name),
        arrayOf(MifareClassic::class.java.name),
//        arrayOf(MifareUltralight::class.java.name),
        arrayOf(NfcA::class.java.name),
//        arrayOf(NfcB::class.java.name),
//        arrayOf(NfcF::class.java.name),
//        arrayOf(NfcV::class.java.name),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NFCTestTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
//                    Button(modifier = Modifier.height(100.dp), onClick = {
//
//
//                        val message: NdefMessage = createNdefMessage("12341324244")
//                        ndefTechnology?.writeNdefMessage(message)
//
//                    }) {
//                        Text("Send data", modifier = Modifier.height(100.dp))
//                    }
                }
            }
        }

        val cardEmulation = CardEmulation.getInstance(nfcAdapter)
        cardEmulation.registerAidsForService(
            ComponentName(applicationContext, MyHostApduService::class.java),
            CATEGORY_OTHER,
            listOf("A00000050000000000000000", "F00000000A0101", "F7080400626364")
        )

        return
        readFromIntent(intent)

        pendingIntent = PendingIntent.getActivity(
            this,
            0,
            Intent(this, javaClass).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP),
            PendingIntent.FLAG_IMMUTABLE
        )
        val tagDetected = IntentFilter(NfcAdapter.ACTION_TAG_DISCOVERED)
        tagDetected.addCategory(Intent.CATEGORY_DEFAULT)
    }


    private fun createNdefMessage(data: String): NdefMessage {
        val record =
            NdefRecord.createMime("application/vnd.example.android.nfc", data.toByteArray(Charset.forName("US-ASCII")))
        return NdefMessage(arrayOf(record))
    }

    override fun onResume() {
        super.onResume()
        return
//        nfcAdapter.disableReaderMode(this)
        nfcAdapter.enableForegroundDispatch(this, pendingIntent, filters, techList)
        nfcAdapter.enableReaderMode(
            this, {
                val isoDep = IsoDep.get(it)
                isoDep.connect()
                val response = isoDep.transceive(
                    Utils.hexStringToByteArray(
                        "00A4040007A0000002471001"
                    )
                )

                runOnUiThread {
                    Toast.makeText(this, "Card Response: ${Utils.toHex(response)}", Toast.LENGTH_LONG).show()

                    Log.d("atatata", "Card Response: ${Utils.toHex(response)}")
                }

                isoDep.close()
            },
            NfcAdapter.FLAG_READER_NFC_A or
                NfcAdapter.FLAG_READER_SKIP_NDEF_CHECK,
            null
        )


        return


        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_RECEIVER_REPLACE_PENDING)

        val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)
        val intentFilters = filters


        nfcAdapter.enableForegroundDispatch(this, pendingIntent, intentFilters, techList)


        nfcAdapter.enableReaderMode(
            this,
            { tag ->
                Log.d("atatata", "enableReaderMode = $tag")

                // detect ndef
                if (tag.techList.contains(Ndef::class.java.name)) {
                    val ndefTag = Ndef.get(tag)
                    ndefTechnology = ndefTag
                }
            },

            NfcAdapter.FLAG_READER_NFC_A or NfcAdapter.FLAG_READER_SKIP_NDEF_CHECK,
//            NfcAdapter.FLAG_READER_SKIP_NDEF_CHECK,
//            NfcAdapter.FLAG_READER_NFC_A,
//                or
//                NfcAdapter.FLAG_READER_NFC_B or
//                NfcAdapter.FLAG_READER_NFC_F
//                or NfcAdapter.FLAG_READER_NFC_V
            null,
        )
    }

    public override fun onPause() {
        super.onPause()
        nfcAdapter.disableReaderMode(this)
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        readFromIntent(intent)
    }

    private fun readFromIntent(intent: Intent) {
        val action = intent.action
        if (NfcAdapter.ACTION_TAG_DISCOVERED == action || NfcAdapter.ACTION_TECH_DISCOVERED == action || NfcAdapter.ACTION_NDEF_DISCOVERED == action) {
            val myTag = intent.getParcelableExtra<Parcelable>(NfcAdapter.EXTRA_TAG) as Tag?
            val rawMsgs = intent.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES)
            var msgs = mutableListOf<NdefMessage>()
            if (rawMsgs != null) {
                for (i in rawMsgs.indices) {
                    msgs.add(i, rawMsgs[i] as NdefMessage)
                }
                buildTagViews(msgs.toTypedArray())
            }
        }
    }

    private fun buildTagViews(msgs: Array<NdefMessage>) {

        var text = ""
        val payload = msgs[0].records[0].payload
        val textEncoding: Charset =
            if ((payload[0] and 128.toByte()).toInt() == 0) Charsets.UTF_8 else Charsets.UTF_16 // Get the Text Encoding
        val languageCodeLength: Int = (payload[0] and 51).toInt() // Get the Language Code, e.g. "en"
        try {
            // Get the Text
            text = String(
                payload,
                languageCodeLength + 1,
                payload.size - languageCodeLength - 1,
                textEncoding
            )
        } catch (e: UnsupportedEncodingException) {
            Log.e("UnsupportedEncoding", e.toString())
        }
        Log.d("atatata", "messabe = $text")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

fun String.decodeHex(): ByteArray {
    check(length % 2 == 0) { "Must have an even length" }

    return chunked(2)
        .map { it.toInt(16).toByte() }
        .toByteArray()
}
