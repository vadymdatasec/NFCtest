public class com.orange.business.packid.android.lib.PackIdUtility {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer a;
	 /* # direct methods */
	 public static com.orange.business.packid.android.lib.PackIdUtility ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 return;
	 } // .end method
	 public static Boolean canUseBleForBadge ( android.content.Context p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 e.h.d.a.a.i .a ( p0,p1 );
	 } // .end method
	 public static Boolean canUseNfcForBadge ( android.content.Context p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 e.h.d.a.a.i .b ( p0,p1 );
	 } // .end method
	 public static android.bluetooth.BluetoothAdapter getBluetoothAdapter ( android.content.Context p0 ) {
		 /* .locals 1 */
		 final String v0 = "bluetooth"; // const-string v0, "bluetooth"
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p0, Landroid/bluetooth/BluetoothManager; */
		 /* .line 2 */
		 (( android.bluetooth.BluetoothManager ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;
	 } // .end method
	 public static Integer getBluetoothState ( android.content.Context p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 com.orange.business.packid.android.lib.PackIdUtility .getBluetoothAdapter ( p0 );
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 2 */
			 p0 = 			 (( android.bluetooth.BluetoothAdapter ) p0 ).getState ( ); // invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->getState()I
		 } // :cond_0
		 /* const/16 p0, 0xa */
	 } // .end method
	 public static Boolean isAccessCoarseLocationEnabled ( android.content.Context p0 ) {
		 /* .locals 1 */
		 final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
		 /* .line 1 */
		 p0 = 		 c.h.f.f .a ( p0,v0 );
		 int v0 = -1; // const/4 v0, -0x1
		 /* if-eq p0, v0, :cond_0 */
		 int p0 = 1; // const/4 p0, 0x1
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean isBlePermissionsAccepted ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = com.orange.business.packid.android.lib.PackIdUtility .isBluetoothEnabled ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 v0 = 	 com.orange.business.packid.android.lib.PackIdUtility .isAccessCoarseLocationEnabled ( p0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 p0 = 		 com.orange.business.packid.android.lib.PackIdUtility .isPowerOptimisationDisabled ( p0 );
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 int p0 = 1; // const/4 p0, 0x1
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // :goto_0
} // .end method
public static Boolean isBluetoothEnabled ( android.content.Context p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 com.orange.business.packid.android.lib.PackIdUtility .getBluetoothAdapter ( p0 );
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 2 */
		 p0 = 		 (( android.bluetooth.BluetoothAdapter ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 int p0 = 1; // const/4 p0, 0x1
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // :goto_0
} // .end method
public static Boolean isNfcEnabled ( android.content.Context p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 android.nfc.NfcAdapter .getDefaultAdapter ( p0 );
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 2 */
		 p0 = 		 (( android.nfc.NfcAdapter ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/nfc/NfcAdapter;->isEnabled()Z
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 int p0 = 1; // const/4 p0, 0x1
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // :goto_0
} // .end method
public static Boolean isPowerOptimisationDisabled ( android.content.Context p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* const/16 v2, 0x17 */
	 /* if-lt v0, v2, :cond_1 */
	 final String v0 = "power"; // const-string v0, "power"
	 /* .line 2 */
	 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/os/PowerManager; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 p0 = 		 (( android.os.PowerManager ) v0 ).isIgnoringBatteryOptimizations ( p0 ); // invoke-virtual {v0, p0}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_0
		 } // :cond_0
		 int v1 = 0; // const/4 v1, 0x0
	 } // :cond_1
} // :goto_0
} // .end method
public static Boolean isUWBAvaible ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
final String v0 = "android.hardware.uwb"; // const-string v0, "android.hardware.uwb"
p0 = (( android.content.pm.PackageManager ) p0 ).hasSystemFeature ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
} // .end method
public static void startBluetooth ( android.content.Context p0 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "MissingPermission" */
/* } */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x1f */
/* if-lt v0, v1, :cond_0 */
final String v0 = "android.permission.BLUETOOTH_CONNECT"; // const-string v0, "android.permission.BLUETOOTH_CONNECT"
v0 = c.h.f.f .a ( p0,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String p0 = "PackIdUtility"; // const-string p0, "PackIdUtility"
final String v0 = "Unable to start BLE : android.permission.BLUETOOTH_CONNECT is obligatory"; // const-string v0, "Unable to start BLE : android.permission.BLUETOOTH_CONNECT is obligatory"
/* .line 2 */
android.util.Log .d ( p0,v0 );
return;
/* .line 3 */
} // :cond_0
com.orange.business.packid.android.lib.PackIdUtility .getBluetoothAdapter ( p0 );
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 4 */
(( android.bluetooth.BluetoothAdapter ) p0 ).enable ( ); // invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z
} // :cond_1
return;
} // .end method
