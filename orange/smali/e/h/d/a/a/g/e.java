public class e.h.d.a.a.g.e extends android.bluetooth.le.ScanCallback {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public com.orange.oab.contactless.packid.service.PackIdService a;
	 /* # direct methods */
	 public e.h.d.a.a.g.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onScanResult ( Integer p0, android.bluetooth.le.ScanResult p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = 		 (( android.bluetooth.le.ScanResult ) p2 ).getRssi ( ); // invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getRssi()I
		 final String v0 = "packid.scan"; // const-string v0, "packid.scan"
		 /* const/16 v1, 0x7f */
		 /* if-ne p1, v1, :cond_0 */
		 final String p1 = "Advertising without tx power, ignoring advertising"; // const-string p1, "Advertising without tx power, ignoring advertising"
		 /* .line 2 */
		 android.util.Log .v ( v0,p1 );
		 return;
		 /* .line 3 */
	 } // :cond_0
	 (( android.bluetooth.le.ScanResult ) p2 ).getScanRecord ( ); // invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;
	 /* .line 4 */
	 (( android.bluetooth.le.ScanResult ) p2 ).getDevice ( ); // invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;
	 /* if-nez v1, :cond_1 */
	 /* .line 5 */
	 /* new-instance p1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Missing scan record, ignoring scan result for device "; // const-string v1, "Missing scan record, ignoring scan result for device "
	 (( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( android.bluetooth.BluetoothDevice ) p2 ).getAddress ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;
	 (( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .v ( v0,p1 );
	 return;
	 /* .line 6 */
} // :cond_1
(( android.bluetooth.le.ScanRecord ) v1 ).getBytes ( ); // invoke-virtual {v1}, Landroid/bluetooth/le/ScanRecord;->getBytes()[B
e.h.d.a.a.g.d .a ( v0 );
/* .line 7 */
v1 = this.a;
(( com.orange.oab.contactless.packid.service.PackIdService ) v1 ).a ( p2, v0, p1 ); // invoke-virtual {v1, p2, v0, p1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Landroid/bluetooth/BluetoothDevice;Le/h/d/a/a/g/d;I)V
return;
} // .end method
