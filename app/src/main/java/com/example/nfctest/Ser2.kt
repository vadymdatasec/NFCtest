package com.example.nfctest

import android.nfc.cardemulation.HostApduService
import android.nfc.cardemulation.HostNfcFService
import android.os.Bundle
import android.util.Log

class MyHostNfcFService : HostNfcFService() {



    companion object {
        val TAG = "Host Card Emulator"
        val STATUS_SUCCESS = "9000"
        val STATUS_FAILED = "6F00"
        val CLA_NOT_SUPPORTED = "6E00"
        val INS_NOT_SUPPORTED = "6D00"
        val AID = "A0000002471001"
        val SELECT_INS = "A4"
        val DEFAULT_CLA = "00"
        val MIN_APDU_LENGTH = 12
    }

    override fun processNfcFPacket(commandPacket: ByteArray?, extras: Bundle?): ByteArray {
        Log.d("atatata", "commandPacket = $commandPacket")
        return  commandPacket!!
    }

    override fun onDeactivated(reason: Int) {
        Log.d("atatata", "onDeactivated = $reason")
    }
}
