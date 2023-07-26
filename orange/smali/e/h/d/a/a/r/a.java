public class e.h.d.a.a.r.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 /* # direct methods */
	 public e.h.d.a.a.r.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
		 /* .locals 3 */
		 /* .line 57 */
		 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).getZoneId ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).getMaskedId ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getMaskedId()Ljava/lang/String;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).getDescription ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
		 /* invoke-direct {v0, v1, v2, p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;)V */
	 } // .end method
	 /* # virtual methods */
	 public final android.content.Intent a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType p2, java.lang.String p3 ) {
		 /* .locals 2 */
		 /* .line 49 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"; // const-string v1, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"
		 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 final String v1 = "eventType"; // const-string v1, "eventType"
		 /* .line 50 */
		 (( android.content.Intent ) v0 ).putExtra ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
		 final String p3 = "contactlessId"; // const-string p3, "contactlessId"
		 /* .line 51 */
		 (( android.content.Intent ) v0 ).putExtra ( p3, p1 ); // invoke-virtual {v0, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
		 final String p1 = "zoneId"; // const-string p1, "zoneId"
		 /* .line 52 */
		 (( android.content.Intent ) v0 ).putExtra ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
		 if ( p4 != null) { // if-eqz p4, :cond_0
			 final String p1 = "message"; // const-string p1, "message"
			 /* .line 53 */
			 (( android.content.Intent ) v0 ).putExtra ( p1, p4 ); // invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
		 } // :cond_0
	 } // .end method
	 public final android.content.Intent a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2, java.lang.String p3, com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType p4 ) {
		 /* .locals 3 */
		 /* if-nez p3, :cond_0 */
		 /* .line 40 */
		 p3 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object p4, v1, v2 */
		 (( android.content.Context ) p3 ).getString ( v0, v1 ); // invoke-virtual {p3, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
		 /* .line 41 */
	 } // :cond_0
	 (( e.h.d.a.a.r.a ) p0 ).a ( p1, p2, p5, p3 ); // invoke-virtual {p0, p1, p2, p5, p3}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;
	 final String p2 = "badge"; // const-string p2, "badge"
	 /* .line 42 */
	 (( android.content.Intent ) p1 ).putExtra ( p2, p4 ); // invoke-virtual {p1, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
} // .end method
public final android.content.Intent a ( java.lang.String p0, java.lang.Throwable p1 ) {
	 /* .locals 2 */
	 /* .line 10 */
	 /* new-instance v0, Landroid/content/Intent; */
	 final String v1 = "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"; // const-string v1, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"
	 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
	 final String v1 = "message"; // const-string v1, "message"
	 /* .line 11 */
	 (( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 12 */
		 (( java.lang.Throwable ) p2 ).getMessage ( ); // invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
		 final String p2 = "exception"; // const-string p2, "exception"
		 (( android.content.Intent ) v0 ).putExtra ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
	 } // :cond_0
} // .end method
public final java.util.ArrayList a ( java.util.List p0 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/util/List<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;", */
	 /* ">;)", */
	 /* "Ljava/util/ArrayList<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
/* .line 54 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 55 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 56 */
e.h.d.a.a.r.a .a ( v1 );
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 22 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.action.ENCRYPTOR_INITIALIZED"; // const-string v1, "com.orange.oab.contactless.packid.action.ENCRYPTOR_INITIALIZED"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( e.h.d.a.a.r.a ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/r/a;->b(ILjava/lang/Throwable;)Landroid/content/Intent;
/* .line 2 */
v0 = com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason.SERVER_UNREACHABLE;
final String v1 = "reason"; // const-string v1, "reason"
(( android.content.Intent ) p1 ).putExtra ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 3 */
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( Integer p0, java.lang.Exception p1 ) {
/* .locals 1 */
/* .line 4 */
(( e.h.d.a.a.r.a ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/r/a;->b(ILjava/lang/Throwable;)Landroid/content/Intent;
/* .line 5 */
p2 = com.orange.oab.contactless.packid.intent.Intent$UserLoadingErrorReason.ENCRYPTION_ERROR;
final String v0 = "reason"; // const-string v0, "reason"
(( android.content.Intent ) p1 ).putExtra ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 6 */
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( Integer p0, java.lang.String p1, fr.mbs.binary.Octets p2, fr.mbs.binary.Octets p3, java.lang.String p4 ) {
/* .locals 2 */
/* .line 23 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.action.RSSI"; // const-string v1, "com.orange.oab.contactless.packid.action.RSSI"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v1 = "rssi"; // const-string v1, "rssi"
/* .line 24 */
(( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String p1 = "readerName"; // const-string p1, "readerName"
/* .line 25 */
(( android.content.Intent ) v0 ).putExtra ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 26 */
(( fr.mbs.binary.Octets ) p3 ).toHexa ( ); // invoke-virtual {p3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
final String p2 = "zoneId"; // const-string p2, "zoneId"
(( android.content.Intent ) v0 ).putExtra ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 27 */
(( fr.mbs.binary.Octets ) p4 ).toHexa ( ); // invoke-virtual {p4}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
final String p2 = "contactlessId"; // const-string p2, "contactlessId"
(( android.content.Intent ) v0 ).putExtra ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String p1 = "readerAddress"; // const-string p1, "readerAddress"
/* .line 28 */
(( android.content.Intent ) v0 ).putExtra ( p1, p5 ); // invoke-virtual {v0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 29 */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( Integer p0, java.lang.Throwable p1 ) {
/* .locals 1 */
/* .line 7 */
v0 = this.a;
(( android.content.Context ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( e.h.d.a.a.r.a ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/r/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
return;
} // .end method
public void a ( android.bluetooth.BluetoothDevice p0, java.lang.String p1, java.lang.String p2, com.orange.oab.contactless.packid.rssi.RssiLevel p3 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "MissingPermission" */
/* } */
} // .end annotation
/* .line 62 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"; // const-string v1, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 63 */
v1 = (( java.lang.Enum ) p4 ).ordinal ( ); // invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I
final String v2 = "rssiLevel"; // const-string v2, "rssiLevel"
(( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 64 */
(( android.bluetooth.BluetoothDevice ) p1 ).getName ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;
final String v2 = "readerName"; // const-string v2, "readerName"
(( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "zoneId"; // const-string v1, "zoneId"
/* .line 65 */
(( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "contactlessId"; // const-string v1, "contactlessId"
/* .line 66 */
(( android.content.Intent ) v0 ).putExtra ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 67 */
(( android.bluetooth.BluetoothDevice ) p1 ).getAddress ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;
final String v2 = "readerAddress"; // const-string v2, "readerAddress"
(( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 68 */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
/* .line 69 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Broadcast new level for "; // const-string v1, "Broadcast new level for "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.bluetooth.BluetoothDevice ) p1 ).getName ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " zone "; // const-string p1, " zone "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " user "; // const-string p1, " user "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " level "; // const-string p1, " level "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p4 ); // invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "packid.AppBroadcaster"; // const-string p2, "packid.AppBroadcaster"
android.util.Log .d ( p2,p1 );
return;
} // .end method
public final void a ( android.content.Intent p0 ) {
/* .locals 5 */
final String v0 = "exception"; // const-string v0, "exception"
/* .line 58 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 59 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Broadcasting action "; // const-string v2, "Broadcasting action "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "reason"; // const-string v2, "reason"
v3 = (( android.content.Intent ) p1 ).hasExtra ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = " with reason "; // const-string v4, " with reason "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Intent ) p1 ).getSerializableExtra ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
final String v2 = ""; // const-string v2, ""
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 60 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ": "; // const-string v1, ": "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.AppBroadcaster"; // const-string v1, "packid.AppBroadcaster"
android.util.Log .e ( v1,v0 );
/* .line 61 */
} // :cond_1
v0 = this.a;
c.p.a.d .a ( v0 );
(( c.p.a.d ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/p/a/d;->a(Landroid/content/Intent;)Z
return;
} // .end method
public void a ( com.orange.oab.contactless.packid.hce.user.User p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1, android.bluetooth.BluetoothDevice p2, java.lang.String p3 ) {
/* .locals 6 */
/* .line 30 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getDescription ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* .line 31 */
/* invoke-virtual/range {v0 ..v5}, Le/h/d/a/a/r/a;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 32 */
p4 = e.h.d.a.a.v.b.e;
v0 = this.a;
(( e.h.d.a.a.v.g ) p4 ).a ( v0 ); // invoke-virtual {p4, v0}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p4, Le/h/d/a/a/v/b; */
(( e.h.d.a.a.v.b ) p4 ).a ( p1, p2, p3 ); // invoke-virtual {p4, p1, p2, p3}, Le/h/d/a/a/v/b;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
/* .line 33 */
p3 = e.h.d.a.a.v.b.e;
p4 = this.a;
(( e.h.d.a.a.v.g ) p3 ).a ( p4 ); // invoke-virtual {p3, p4}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p3, Le/h/d/a/a/v/b; */
(( e.h.d.a.a.v.b ) p3 ).b ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Le/h/d/a/a/v/b;->b(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
return;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.User p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1, android.bluetooth.BluetoothDevice p2, java.lang.String p3, java.lang.String p4 ) {
/* .locals 7 */
/* .line 34 */
v6 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.DONE;
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* invoke-virtual/range {v0 ..v6}, Le/h/d/a/a/r/a;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V */
return;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.User p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1, android.bluetooth.BluetoothDevice p2, java.lang.String p3, java.lang.String p4, com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType p5 ) {
/* .locals 6 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "MissingPermission" */
/* } */
} // .end annotation
/* .line 35 */
(( com.orange.oab.contactless.packid.hce.user.User ) p1 ).getContactlessId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getZoneId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
/* move-object v0, p0 */
/* move-object v3, p4 */
/* move-object v4, p5 */
/* move-object v5, p6 */
/* invoke-virtual/range {v0 ..v5}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Landroid/content/Intent; */
/* .line 36 */
(( android.bluetooth.BluetoothDevice ) p3 ).getName ( ); // invoke-virtual {p3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;
final String p3 = "deviceName"; // const-string p3, "deviceName"
(( android.content.Intent ) p1 ).putExtra ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 37 */
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 3 */
/* .line 13 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.action.USER_UPDATED"; // const-string v1, "com.orange.oab.contactless.packid.action.USER_UPDATED"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* if-nez p1, :cond_0 */
/* .line 14 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
} // :cond_0
(( e.h.d.a.a.p.a.a.a ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/d/a/a/p/a/a/a;->a()Ljava/util/List;
(( e.h.d.a.a.r.a ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/r/a;->a(Ljava/util/List;)Ljava/util/ArrayList;
} // :goto_0
final String v2 = "addedBadges"; // const-string v2, "addedBadges"
(( android.content.Intent ) v0 ).putExtra ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* if-nez p1, :cond_1 */
/* .line 15 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
} // :cond_1
(( e.h.d.a.a.p.a.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/d/a/a/p/a/a/a;->b()Ljava/util/List;
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Ljava/util/List;)Ljava/util/ArrayList;
} // :goto_1
final String v1 = "removedBadges"; // const-string v1, "removedBadges"
(( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 16 */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 3 */
/* .line 48 */
v0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INSUFFICIENT_SECURITY;
v1 = this.a;
(( android.content.Context ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( e.h.d.a.a.r.a ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, Integer p2 ) {
/* .locals 1 */
/* .line 43 */
v0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.START;
(( e.h.d.a.a.r.a ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V
return;
} // .end method
public final void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, Integer p2, com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType p3 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 44 */
(( e.h.d.a.a.r.a ) p0 ).a ( p1, p2, p4, v0 ); // invoke-virtual {p0, p1, p2, p4, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;
final String p2 = "timeout"; // const-string p2, "timeout"
/* .line 45 */
(( android.content.Intent ) p1 ).putExtra ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 46 */
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 1 */
/* .line 47 */
v0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.ERROR;
(( e.h.d.a.a.r.a ) p0 ).a ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 6 */
/* .line 38 */
v5 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.DONE;
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* invoke-virtual/range {v0 ..v5}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Landroid/content/Intent; */
/* .line 39 */
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 76 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_LOCKED"; // const-string v1, "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_LOCKED"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v1 = "zoneId"; // const-string v1, "zoneId"
/* .line 77 */
(( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String p1 = "contactlessId"; // const-string p1, "contactlessId"
/* .line 78 */
(( android.content.Intent ) v0 ).putExtra ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 79 */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( java.lang.String p0, java.lang.String p1, java.lang.Boolean p2 ) {
/* .locals 2 */
/* .line 70 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_BUTTON_IN_RANGE"; // const-string v1, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_BUTTON_IN_RANGE"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v1 = "zoneId"; // const-string v1, "zoneId"
/* .line 71 */
(( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "contactlessId"; // const-string v1, "contactlessId"
/* .line 72 */
(( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v1 = "button_status"; // const-string v1, "button_status"
/* .line 73 */
(( android.content.Intent ) v0 ).putExtra ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
/* .line 74 */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
/* .line 75 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Manual Button is in range zone "; // const-string v1, "Manual Button is in range zone "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " user "; // const-string p1, " user "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " In Range "; // const-string p1, " In Range "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "packid.AppBroadcaster"; // const-string p2, "packid.AppBroadcaster"
android.util.Log .d ( p2,p1 );
return;
} // .end method
public final void a ( java.lang.Throwable p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 8 */
com.orange.oab.contactless.packid.report.ReportSender .send ( p2,p1 );
/* .line 9 */
(( e.h.d.a.a.r.a ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/r/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Landroid/content/Intent;
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void a ( Boolean p0, Boolean p1, java.lang.String p2 ) {
/* .locals 2 */
/* .line 17 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.action.UPDATE_USERS"; // const-string v1, "com.orange.oab.contactless.packid.action.UPDATE_USERS"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v1 = "alertOnNetworkError"; // const-string v1, "alertOnNetworkError"
/* .line 18 */
(( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
final String p1 = "sendUsersUpdatedIntent"; // const-string p1, "sendUsersUpdatedIntent"
/* .line 19 */
(( android.content.Intent ) v0 ).putExtra ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
final String p1 = "firebaseRegistrationId"; // const-string p1, "firebaseRegistrationId"
/* .line 20 */
(( android.content.Intent ) v0 ).putExtra ( p1, p3 ); // invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 21 */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public final android.content.Intent b ( Integer p0, java.lang.Throwable p1 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.a;
(( android.content.Context ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( e.h.d.a.a.r.a ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/r/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Landroid/content/Intent;
} // .end method
public void b ( ) {
/* .locals 2 */
/* .line 2 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"; // const-string v1, "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( e.h.d.a.a.r.a ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/r/a;->a(ILjava/lang/Throwable;)V
return;
} // .end method
public void b ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 3 */
/* .line 4 */
v0 = this.a;
e.h.a.a.a.a.a .a ( v0 );
/* .line 5 */
v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.ERROR;
(( e.h.a.a.a.a.a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;
(( e.h.d.a.a.r.a ) p0 ).a ( p1, p2, v1, v0 ); // invoke-virtual {p0, p1, p2, v1, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void b ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 6 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_UNLOCKED"; // const-string v1, "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_UNLOCKED"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v1 = "zoneId"; // const-string v1, "zoneId"
/* .line 7 */
(( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String p1 = "contactlessId"; // const-string p1, "contactlessId"
/* .line 8 */
(( android.content.Intent ) v0 ).putExtra ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 9 */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
public void c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( e.h.d.a.a.r.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Le/h/d/a/a/p/a/a/a;)V
return;
} // .end method
public void c ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 3 */
/* .line 2 */
v0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction$EventType.INTERRUPTED;
v1 = this.a;
(( android.content.Context ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( e.h.d.a.a.r.a ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;
(( e.h.d.a.a.r.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V
return;
} // .end method
