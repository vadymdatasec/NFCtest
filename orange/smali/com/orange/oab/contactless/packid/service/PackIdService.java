public class com.orange.oab.contactless.packid.service.PackIdService extends android.app.Service {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "MissingPermission" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/service/PackIdService$f; */
/* } */
} // .end annotation
/* # instance fields */
public final java.text.SimpleDateFormat b;
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "SimpleDateFormat" */
/* } */
} // .end annotation
} // .end field
public final com.orange.oab.contactless.packid.service.PackIdService$f c;
public final android.content.BroadcastReceiver d;
public final android.content.BroadcastReceiver e;
public final java.util.Map f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Lfr/mbs/binary/Octets;", */
/* "Ljava/util/Date;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final e.h.d.a.a.w.u g;
public final e.h.d.a.a.g.y h;
public e.h.d.a.a.g.k i;
public e.h.d.a.a.n.w.c j;
public java.util.Timer k;
public android.content.BroadcastReceiver l;
public android.content.BroadcastReceiver m;
public Long n;
public com.orange.oab.contactless.packid.service.ZoneDetectionNotification o;
public android.content.BroadcastReceiver p;
public final android.content.BroadcastReceiver q;
/* # direct methods */
public com.orange.oab.contactless.packid.service.PackIdService ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Landroid/app/Service;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/text/SimpleDateFormat; */
final String v1 = "HH:mm:ss.SSS"; // const-string v1, "HH:mm:ss.SSS"
/* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
this.b = v0;
/* .line 3 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$f; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/orange/oab/contactless/packid/service/PackIdService$f;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;Lcom/orange/oab/contactless/packid/service/PackIdService$a;)V */
this.c = v0;
/* .line 4 */
/* new-instance v0, Le/h/d/a/a/g/h; */
/* invoke-direct {v0}, Le/h/d/a/a/g/h;-><init>()V */
this.d = v0;
/* .line 5 */
/* new-instance v0, Le/h/d/a/a/g/q; */
/* invoke-direct {v0}, Le/h/d/a/a/g/q;-><init>()V */
this.e = v0;
/* .line 6 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.f = v0;
/* .line 7 */
/* new-instance v0, Le/h/d/a/a/w/u; */
/* invoke-direct {v0, p0}, Le/h/d/a/a/w/u;-><init>(Landroid/content/Context;)V */
this.g = v0;
/* .line 8 */
/* new-instance v0, Le/h/d/a/a/g/y; */
/* invoke-direct {v0}, Le/h/d/a/a/g/y;-><init>()V */
this.h = v0;
/* .line 9 */
this.k = v1;
/* .line 10 */
e.h.d.a.a.g.r .a ( );
/* .line 11 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$a; */
/* invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$a;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V */
this.l = v0;
/* .line 12 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$b; */
/* invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$b;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V */
this.m = v0;
/* .line 13 */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->n:J */
/* .line 14 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification; */
/* invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;-><init>(Landroid/content/Context;)V */
this.o = v0;
/* .line 15 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$c; */
/* invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$c;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V */
this.p = v0;
/* .line 16 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$d; */
/* invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$d;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V */
this.q = v0;
return;
} // .end method
public static e.h.d.a.a.w.u a ( com.orange.oab.contactless.packid.service.PackIdService p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.g;
} // .end method
public static com.orange.oab.contactless.packid.service.ZoneDetectionNotification b ( com.orange.oab.contactless.packid.service.PackIdService p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.o;
} // .end method
public static void c ( com.orange.oab.contactless.packid.service.PackIdService p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b()V
return;
} // .end method
/* # virtual methods */
public final com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( com.orange.oab.contactless.packid.hce.user.User p0, fr.mbs.binary.Octets p1 ) {
/* .locals 4 */
final String v0 = "packid.Service"; // const-string v0, "packid.Service"
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
try { // :try_start_0
(( com.orange.oab.contactless.packid.hce.user.User ) p1 ).getWallet ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) p1 ).findBadgeByZone ( p2 ); // invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
/* .line 5 */
v2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isBle ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isBle()Z
/* if-nez v2, :cond_0 */
/* .line 6 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Found device for badge "; // const-string v3, "Found device for badge "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " but badge is not compatible with BLE"; // const-string p1, " but badge is not compatible with BLE"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,p1 );
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
/* .line 7 */
/* :catch_0 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unknown zone id "; // const-string v2, "Unknown zone id "
(( java.lang.StringBuilder ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,p1 );
} // .end method
public final e.h.d.a.a.n.w.c a ( Boolean p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 36 */
v0 = this.j;
/* if-nez v0, :cond_0 */
/* .line 37 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b(Z)V
/* .line 38 */
} // :cond_0
p1 = this.j;
} // .end method
public final void a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/ble/d; */
/* } */
} // .end annotation
/* .line 2 */
(( android.app.Service ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/app/Service;->getPackageManager()Landroid/content/pm/PackageManager;
final String v1 = "android.hardware.bluetooth_le"; // const-string v1, "android.hardware.bluetooth_le"
v0 = (( android.content.pm.PackageManager ) v0 ).hasSystemFeature ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 3 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/ble/d; */
final String v1 = "BLE not supported"; // const-string v1, "BLE not supported"
/* invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/ble/d;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final void a ( android.bluetooth.BluetoothDevice p0, com.orange.oab.contactless.packid.hce.user.User p1, com.orange.oab.contactless.packid.hce.user.wallet.Badge p2 ) {
/* .locals 3 */
/* .line 14 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Found device in RSSI range for badge "; // const-string v1, "Found device in RSSI range for badge "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getDescription ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.Service"; // const-string v1, "packid.Service"
android.util.Log .v ( v1,v0 );
/* .line 15 */
(( android.app.Service ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;
v0 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).isConditionToBeginTransactionReached ( v0 ); // invoke-virtual {p3, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isConditionToBeginTransactionReached(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 16 */
try { // :try_start_0
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).b ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 17 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Encryptor not available: "; // const-string v2, "Encryptor not available: "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,p1 );
/* .line 18 */
/* new-instance p1, Le/h/d/a/a/r/a; */
/* invoke-direct {p1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getContactlessId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getZoneId ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( android.app.Service ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Service;->getString(I)Ljava/lang/String;
(( e.h.d.a.a.r.a ) p1 ).a ( p2, p3, v0 ); // invoke-virtual {p1, p2, p3, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V
/* .line 19 */
} // :cond_0
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getContactlessId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).a ( p3, p1 ); // invoke-virtual {p0, p3, p1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)V
} // :goto_0
return;
} // .end method
public final void a ( android.bluetooth.BluetoothDevice p0, com.orange.oab.contactless.packid.hce.user.User p1, com.orange.oab.contactless.packid.hce.user.wallet.Badge p2, Integer p3 ) {
/* .locals 6 */
/* .line 20 */
/* new-instance v0, Le/h/d/a/a/r/a; */
/* invoke-direct {v0, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( android.bluetooth.BluetoothDevice ) p1 ).getName ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getZoneId ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getContactlessId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( android.bluetooth.BluetoothDevice ) p1 ).getAddress ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;
/* move v1, p4 */
/* invoke-virtual/range {v0 ..v5}, Le/h/d/a/a/r/a;->a(ILjava/lang/String;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V */
return;
} // .end method
public final void a ( android.bluetooth.BluetoothDevice p0, com.orange.oab.contactless.packid.hce.user.User p1, fr.mbs.binary.Octets p2, Integer p3 ) {
/* .locals 0 */
/* .line 12 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 13 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).b ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;I)V
} // :cond_0
return;
} // .end method
public void a ( android.bluetooth.BluetoothDevice p0, Object p1, Integer p2 ) {
/* .locals 2 */
/* const/16 v0, 0x543 */
/* .line 8 */
(( e.h.d.a.a.g.d ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/h/d/a/a/g/d;->a(I)Lfr/mbs/binary/Octets;
/* .line 9 */
(( e.h.d.a.a.g.d ) p2 ).c ( v0 ); // invoke-virtual {p2, v0}, Le/h/d/a/a/g/d;->c(I)Lfr/mbs/binary/Octets;
/* .line 10 */
v0 = this.g;
(( e.h.d.a.a.w.u ) v0 ).a ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Le/h/d/a/a/w/u;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).a ( p1, v0, p2, p3 ); // invoke-virtual {p0, p1, v0, p2, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lfr/mbs/binary/Octets;I)V
} // :cond_0
return;
} // .end method
public void a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 3 */
/* .line 33 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDelayAfterBadgeOkMs ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDelayAfterBadgeOkMs()Ljava/lang/Integer;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
e.h.d.a.a.n.t .c ( v0 );
/* .line 34 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Session blocked until: "; // const-string v2, "Session blocked until: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
(( java.text.SimpleDateFormat ) v2 ).format ( v0 ); // invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "packid.Service"; // const-string v2, "packid.Service"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v2,v1 );
/* .line 35 */
v1 = this.f;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
return;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, fr.mbs.binary.Octets p1 ) {
/* .locals 6 */
/* .line 25 */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
/* .line 26 */
/* iget-wide v2, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->n:J */
/* const-wide/16 v4, 0xfa0 */
/* add-long/2addr v2, v4 */
/* cmp-long v4, v2, v0 */
/* if-gez v4, :cond_0 */
/* .line 27 */
/* iput-wide v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->n:J */
/* .line 28 */
/* new-instance v0, Le/h/d/a/a/r/a; */
(( android.app.Service ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.r.a ) v0 ).a ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
} // :cond_0
return;
} // .end method
public final void a ( fr.mbs.binary.Octets p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
/* .locals 1 */
/* .line 21 */
v0 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).isManualConnectionAllowed ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isManualConnectionAllowed()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 22 */
v0 = this.o;
(( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 23 */
p1 = this.o;
(( com.orange.oab.contactless.packid.service.ZoneDetectionNotification ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b()V
/* .line 24 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->c()V
} // :cond_0
return;
} // .end method
public final Boolean a ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
/* .line 29 */
v0 = this.f;
/* check-cast p1, Ljava/util/Date; */
/* .line 30 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_2
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 31 */
e.h.d.a.a.n.t .b ( );
v0 = (( java.util.Date ) p1 ).before ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z
/* if-nez v0, :cond_2 */
} // :cond_0
/* if-nez p1, :cond_1 */
p1 = this.i;
/* .line 32 */
p1 = (( e.h.d.a.a.g.k ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/d/a/a/g/k;->a()Z
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :cond_2
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public final void b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 21 */
this.j = v0;
return;
} // .end method
public synchronized final void b ( android.bluetooth.BluetoothDevice p0, com.orange.oab.contactless.packid.hce.user.User p1, com.orange.oab.contactless.packid.hce.user.wallet.Badge p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 10 */
try { // :try_start_0
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getZoneId ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
v0 = (( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lfr/mbs/binary/Octets;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "Found compatible reader"; // const-string v0, "Found compatible reader"
/* .line 11 */
com.orange.oab.contactless.packid.service.LogManager .start ( p0,v0 );
/* .line 12 */
v0 = (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).isDefault ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z
/* xor-int/lit8 v0, v0, 0x1 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Z)Le/h/d/a/a/n/w/c;
e.h.d.a.a.g.v .a ( v0,p2,p3,p0 );
/* .line 13 */
/* new-instance v1, Le/h/d/a/a/g/k; */
/* invoke-direct {v1, p0, v0}, Le/h/d/a/a/g/k;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;Le/h/d/a/a/g/v;)V */
this.i = v1;
/* .line 14 */
/* new-instance v1, Le/h/d/a/a/r/a; */
/* invoke-direct {v1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getContactlessId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getZoneId ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
v0 = (( e.h.d.a.a.g.v ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/v;->b()I
/* add-int/lit16 v0, v0, 0x3e8 */
(( e.h.d.a.a.r.a ) v1 ).a ( p2, v2, v0 ); // invoke-virtual {v1, p2, v2, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;I)V
/* .line 15 */
p2 = this.i;
(( e.h.d.a.a.g.k ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothDevice;)V
/* .line 16 */
p1 = this.f;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getZoneId ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
} // :cond_0
final String p1 = "packid.Service"; // const-string p1, "packid.Service"
final String p2 = "Ignoring new BLE session, old session still in progress..."; // const-string p2, "Ignoring new BLE session, old session still in progress..."
/* .line 17 */
android.util.Log .v ( p1,p2 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final void b ( android.bluetooth.BluetoothDevice p0, com.orange.oab.contactless.packid.hce.user.User p1, com.orange.oab.contactless.packid.hce.user.wallet.Badge p2, Integer p3 ) {
/* .locals 3 */
/* .line 2 */
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getContactlessId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).a ( v0, p3 ); // invoke-virtual {p0, v0, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 3 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getZoneId ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
v0 = e.h.d.a.a.g.r .a ( p1,v0,p4 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v0 = e.h.d.a.a.v.b.e;
(( android.app.Service ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;
(( e.h.d.a.a.v.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Le/h/d/a/a/v/b; */
(( e.h.d.a.a.v.b ) v0 ).a ( p4, p3, p2, p1 ); // invoke-virtual {v0, p4, p3, p2, p1}, Le/h/d/a/a/v/b;->a(ILcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/bluetooth/BluetoothDevice;)V
/* .line 5 */
v0 = com.orange.business.packid.android.lib.PackIdPreferences.INSTANCE;
v0 = (( com.orange.business.packid.android.lib.PackIdPreferences ) v0 ).isRssiBroadcastEnabled ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->isRssiBroadcastEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;I)V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 7 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getZoneId ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).getSerializedFormat ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->getSerializedFormat()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
final String v1 = "BLE Signal Indicator : Advertising ignored for zoneId %s"; // const-string v1, "BLE Signal Indicator : Advertising ignored for zoneId %s"
java.lang.String .format ( v1,v0 );
final String v1 = "packid.Service"; // const-string v1, "packid.Service"
android.util.Log .d ( v1,v0 );
/* .line 8 */
} // :cond_1
} // :goto_0
v0 = this.h;
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getContactlessId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( android.bluetooth.BluetoothDevice ) p1 ).getAddress ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;
p4 = (( e.h.d.a.a.g.y ) v0 ).a ( p4, p3, v1, v2 ); // invoke-virtual {v0, p4, p3, v1, v2}, Le/h/d/a/a/g/y;->a(ILcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;Ljava/lang/String;)Z
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 9 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
} // :cond_2
return;
} // .end method
public synchronized final void b ( Boolean p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 18 */
try { // :try_start_0
v0 = this.j;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
final String v0 = "packid.Service"; // const-string v0, "packid.Service"
final String v1 = "Initializing BLE service encryptor"; // const-string v1, "Initializing BLE service encryptor"
/* .line 19 */
android.util.Log .i ( v0,v1 );
/* .line 20 */
e.h.d.a.a.n.w.c .a ( p0,p1 );
this.j = p1;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final void c ( ) {
/* .locals 4 */
/* .line 2 */
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/util/Timer; */
/* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
/* .line 5 */
/* new-instance v1, Lcom/orange/oab/contactless/packid/service/PackIdService$e; */
/* invoke-direct {v1, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$e;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V */
/* const-wide/16 v2, 0x1f40 */
(( java.util.Timer ) v0 ).schedule ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 6 */
this.k = v0;
return;
} // .end method
public final void d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = e.h.d.a.a.r.b.f;
(( e.h.d.a.a.r.b ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V
/* .line 2 */
v0 = e.h.d.a.a.r.b.f;
v0 = (( e.h.d.a.a.r.b ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/r/b;->a()I
v1 = e.h.d.a.a.r.b.f;
(( e.h.d.a.a.r.b ) v1 ).a ( p0 ); // invoke-virtual {v1, p0}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;)Landroid/app/Notification;
(( android.app.Service ) p0 ).startForeground ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V
return;
} // .end method
public final void e ( ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a()V
/* .line 2 */
v0 = e.h.d.a.a.g.f.d;
v0 = (( e.h.d.a.a.g.f ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/h/d/a/a/g/f;->a(Landroid/content/Context;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = e.h.d.a.a.g.f.d;
(( e.h.d.a.a.g.f ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/h/d/a/a/g/f;->b(Landroid/content/Context;)V
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/ble/d; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 4 */
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
final String v1 = "packid.Service"; // const-string v1, "packid.Service"
android.util.Log .e ( v1,v0 );
} // :cond_0
} // :goto_0
return;
} // .end method
public android.os.IBinder onBind ( android.content.Intent p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onCreate ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Service;->onCreate()V */
/* .line 2 */
v0 = e.h.d.a.a.g.f.d;
/* new-instance v1, Le/h/d/a/a/g/e; */
/* invoke-direct {v1, p0}, Le/h/d/a/a/g/e;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V */
(( e.h.d.a.a.g.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/g/f;->a(Le/h/d/a/a/g/e;)V
/* .line 3 */
v0 = this.d;
/* new-instance v1, Landroid/content/IntentFilter; */
final String v2 = "android.bluetooth.adapter.action.STATE_CHANGED"; // const-string v2, "android.bluetooth.adapter.action.STATE_CHANGED"
/* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( android.app.Service ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 4 */
v0 = this.e;
/* new-instance v1, Landroid/content/IntentFilter; */
final String v3 = "android.nfc.action.ADAPTER_STATE_CHANGED"; // const-string v3, "android.nfc.action.ADAPTER_STATE_CHANGED"
/* invoke-direct {v1, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( android.app.Service ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 5 */
v0 = this.q;
/* new-instance v1, Landroid/content/IntentFilter; */
/* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( android.app.Service ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 6 */
c.p.a.d .a ( p0 );
v1 = this.l;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.action.USER_UPDATED"; // const-string v3, "com.orange.oab.contactless.packid.action.USER_UPDATED"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 7 */
c.p.a.d .a ( p0 );
v1 = this.c;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.action.ENCRYPTOR_INITIALIZED"; // const-string v3, "com.orange.oab.contactless.packid.action.ENCRYPTOR_INITIALIZED"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 8 */
v0 = this.m;
/* new-instance v1, Landroid/content/IntentFilter; */
final String v2 = "com.orange.oab.contactless.packid.action.START_BADGE_TRANSACTION"; // const-string v2, "com.orange.oab.contactless.packid.action.START_BADGE_TRANSACTION"
/* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( android.app.Service ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 9 */
v0 = this.p;
/* new-instance v1, Landroid/content/IntentFilter; */
final String v2 = "com.orange.oab.contactless.packid.action.DISMISSED_NOTIFICATION"; // const-string v2, "com.orange.oab.contactless.packid.action.DISMISSED_NOTIFICATION"
/* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( android.app.Service ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 10 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->d()V
return;
} // .end method
public void onDestroy ( ) {
/* .locals 2 */
final String v0 = "packid.Service"; // const-string v0, "packid.Service"
final String v1 = "onDestroy"; // const-string v1, "onDestroy"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
v0 = this.d;
(( android.app.Service ) p0 ).unregisterReceiver ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 3 */
v0 = this.e;
(( android.app.Service ) p0 ).unregisterReceiver ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 4 */
v0 = this.q;
(( android.app.Service ) p0 ).unregisterReceiver ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 5 */
v0 = e.h.d.a.a.g.f.d;
(( e.h.d.a.a.g.f ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Le/h/d/a/a/g/f;->c(Landroid/content/Context;)V
/* .line 6 */
v0 = e.h.d.a.a.g.f.d;
(( e.h.d.a.a.g.f ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/f;->a()V
/* .line 7 */
c.p.a.d .a ( p0 );
v1 = this.c;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 8 */
c.p.a.d .a ( p0 );
v1 = this.l;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 9 */
v0 = this.m;
(( android.app.Service ) p0 ).unregisterReceiver ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 10 */
v0 = this.p;
(( android.app.Service ) p0 ).unregisterReceiver ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
/* .line 11 */
v0 = e.h.d.a.a.r.b.g;
(( e.h.d.a.a.r.b ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Le/h/d/a/a/r/b;->c(Landroid/content/Context;)V
return;
} // .end method
public Integer onStartCommand ( android.content.Intent p0, Integer p1, Integer p2 ) {
/* .locals 1 */
final String p2 = "packid.Service"; // const-string p2, "packid.Service"
final String p3 = "Restart PackIdBleService if needed"; // const-string p3, "Restart PackIdBleService if needed"
/* .line 1 */
android.util.Log .i ( p2,p3 );
/* .line 2 */
(( com.orange.oab.contactless.packid.service.PackIdService ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->e()V
if ( p1 != null) { // if-eqz p1, :cond_0
final String p2 = "contactlessId"; // const-string p2, "contactlessId"
/* .line 3 */
p3 = (( android.content.Intent ) p1 ).hasExtra ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
if ( p3 != null) { // if-eqz p3, :cond_0
final String p3 = "zoneId"; // const-string p3, "zoneId"
v0 = (( android.content.Intent ) p1 ).hasExtra ( p3 ); // invoke-virtual {p1, p3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( android.content.Intent ) p1 ).getSerializableExtra ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
/* check-cast p2, Lfr/mbs/binary/Octets; */
/* .line 5 */
(( android.content.Intent ) p1 ).getSerializableExtra ( p3 ); // invoke-virtual {p1, p3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
/* check-cast p1, Lfr/mbs/binary/Octets; */
/* .line 6 */
p3 = this.h;
(( e.h.d.a.a.g.y ) p3 ).a ( p2, p1 ); // invoke-virtual {p3, p2, p1}, Le/h/d/a/a/g/y;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void onTaskRemoved ( android.content.Intent p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/app/Service;->onTaskRemoved(Landroid/content/Intent;)V */
final String p1 = "packid.Service"; // const-string p1, "packid.Service"
final String v0 = "onTaskRemoved"; // const-string v0, "onTaskRemoved"
/* .line 2 */
android.util.Log .d ( p1,v0 );
return;
} // .end method
