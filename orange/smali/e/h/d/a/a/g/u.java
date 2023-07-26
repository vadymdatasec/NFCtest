public class e.h.d.a.a.g.u extends e.h.d.a.a.g.w {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public fr.mbs.binary.Octets m;
	 public Integer n;
	 public Integer o;
	 public fr.mbs.binary.Octets p;
	 public fr.mbs.binary.Octets q;
	 public fr.mbs.binary.Octets r;
	 /* # direct methods */
	 public e.h.d.a.a.g.u ( ) {
		 /* .locals 7 */
		 /* .line 1 */
		 v0 = e.h.d.a.a.g.o.d;
		 (( e.h.d.a.a.g.o ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
		 /* move-object v1, p0 */
		 /* move-object v2, p1 */
		 /* move-object v3, p2 */
		 /* move-object v4, p3 */
		 /* move-object v5, p4 */
		 /* invoke-direct/range {v1 ..v6}, Le/h/d/a/a/g/w;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/UUID;)V */
		 /* .line 2 */
		 fr.mbs.binary.Octets .empty ( );
		 this.p = p1;
		 return;
	 } // .end method
	 private void e ( android.bluetooth.BluetoothGatt p0 ) {
		 /* .locals 2 */
		 /* .line 8 */
		 v0 = this.r;
		 v0 = 		 (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
		 /* const/16 v1, 0x14 */
		 /* if-ge v0, v1, :cond_0 */
		 /* .line 9 */
		 (( e.h.d.a.a.g.u ) p0 ).g ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/u;->g()Lfr/mbs/binary/Octets;
		 /* .line 10 */
		 (( e.h.d.a.a.g.v ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;)V
		 /* .line 11 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "7- updated token part n\u00b0"; // const-string v1, "7- updated token part n\u00b0"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Le/h/d/a/a/g/u;->o:I */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v1 = " read successfully, reading next updated token part"; // const-string v1, " read successfully, reading next updated token part"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v1 = "packid.ble.Token.Secure"; // const-string v1, "packid.ble.Token.Secure"
	 android.util.Log .i ( v1,v0 );
	 /* .line 12 */
	 v0 = e.h.d.a.a.g.o.i;
	 (( e.h.d.a.a.g.v ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
} // :goto_0
return;
} // .end method
private void f ( android.bluetooth.BluetoothGatt p0 ) {
/* .locals 5 */
final String v0 = "packid.ble.Token.Secure"; // const-string v0, "packid.ble.Token.Secure"
/* .line 13 */
try { // :try_start_0
	 (( e.h.d.a.a.g.u ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/u;->e()Le/h/d/a/a/g/o;
	 /* .line 14 */
	 (( e.h.d.a.a.g.u ) p0 ).f ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/u;->f()Lfr/mbs/binary/Octets;
	 /* .line 15 */
	 v3 = e.h.d.a.a.g.o.i;
	 v3 = 	 (( java.lang.Enum ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
	 if ( v3 != null) { // if-eqz v3, :cond_0
		 /* .line 16 */
		 this.q = v2;
		 /* .line 17 */
	 } // :cond_0
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "6- sending "; // const-string v4, "6- sending "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( e.h.d.a.a.g.o ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v4 = " n\u00b0"; // const-string v4, " n\u00b0"
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v4, p0, Le/h/d/a/a/g/u;->n:I */
	 /* add-int/lit8 v4, v4, 0x1 */
	 /* iput v4, p0, Le/h/d/a/a/g/u;->n:I */
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v4 = "/"; // const-string v4, "/"
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v4 = 	 (( e.h.d.a.a.g.u ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/g/u;->c(Lfr/mbs/binary/Octets;)I
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .i ( v0,v3 );
	 /* .line 18 */
	 (( e.h.d.a.a.g.v ) p0 ).a ( p1, v1, v2 ); // invoke-virtual {p0, p1, v1, v2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
	 /* :try_end_0 */
	 /* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 final String p1 = "could not cipher identifier"; // const-string p1, "could not cipher identifier"
	 /* .line 19 */
	 android.util.Log .e ( v0,p1 );
} // :goto_0
return;
} // .end method
private void g ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 1 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getValue ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B
fr.mbs.binary.Octets .createOctets ( p2 );
/* .line 2 */
(( e.h.d.a.a.g.u ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/g/u;->d(Lfr/mbs/binary/Octets;)V
/* .line 3 */
p2 = (( fr.mbs.binary.Octets ) p2 ).size ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->size()I
/* const/16 v0, 0x14 */
/* if-ge p2, v0, :cond_0 */
/* .line 4 */
(( e.h.d.a.a.g.u ) p0 ).g ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/u;->g()Lfr/mbs/binary/Octets;
/* .line 5 */
v0 = e.h.d.a.a.g.o.l;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
} // :cond_0
return;
} // .end method
/* # virtual methods */
public final fr.mbs.binary.Octets a ( fr.mbs.binary.Octets p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getCipheredTokenDataSignature ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
v0 = (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
/* .line 2 */
v1 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
int v2 = 6; // const/4 v2, 0x6
/* sub-int/2addr v1, v2 */
/* sub-int/2addr v1, v0 */
/* .line 3 */
(( fr.mbs.binary.Octets ) p1 ).get ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
/* .line 4 */
(( fr.mbs.binary.Octets ) p1 ).getLast ( v0 ); // invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;
/* .line 5 */
v0 = this.b;
(( e.h.d.a.a.n.w.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).setCipheredTokenDataSignature ( v0 ); // invoke-virtual {p2, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V
/* .line 6 */
com.orange.oab.contactless.packid.hce.user.TokenData .parse ( v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).setTokenData ( v0 ); // invoke-virtual {p2, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V
} // .end method
public void b ( java.lang.String p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getTokenData ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
(( com.orange.oab.contactless.packid.hce.user.TokenData ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getId()Lfr/mbs/binary/Octets;
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "token id is : "; // const-string v2, "token id is : "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "packid.ble.Token.Secure"; // const-string v2, "packid.ble.Token.Secure"
android.util.Log .i ( v2,v1 );
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Start unlocking \u00ab"; // const-string v3, "Start unlocking \u00ab"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "\u00bb"; // const-string v3, "\u00bb"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v1 );
/* .line 4 */
(( e.h.d.a.a.g.u ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/u;->c(Ljava/lang/String;)Ljava/lang/String;
/* .line 5 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "unlocked token id \u00ab"; // const-string v4, "unlocked token id \u00ab"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v1 );
/* .line 6 */
(( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
p1 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_0 */
return;
/* .line 7 */
} // :cond_0
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "zone id = "; // const-string v0, "zone id = "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getZoneId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,p1 );
/* .line 8 */
p1 = this.a;
e.h.d.a.a.s.m .a ( p1 );
v0 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getZoneId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).toString ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;
v1 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getUserId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
(( e.h.d.a.a.s.r ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Le/h/d/a/a/s/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
/* .line 9 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Badge to unlock size "; // const-string v1, "Badge to unlock size "
v1 = (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v0 );
/* .line 10 */
} // :cond_1
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 11 */
e.h.d.a.a.h .c ( );
v2 = this.c;
v1 = (( e.h.d.a.a.h ) v1 ).a ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Le/h/d/a/a/h;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 12 */
e.h.d.a.a.h .c ( );
v2 = this.a;
v3 = this.d;
(( e.h.d.a.a.h ) v1 ).b ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Le/h/d/a/a/h;->b(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
} // :cond_2
return;
} // .end method
public final Boolean b ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
/* .line 13 */
(( e.h.d.a.a.g.w ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/w;->d()Lfr/mbs/binary/Octets;
p1 = (( fr.mbs.binary.Octets ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
} // .end method
public final Integer c ( fr.mbs.binary.Octets p0 ) {
/* .locals 6 */
/* .line 3 */
/* iget v0, p0, Le/h/d/a/a/g/u;->n:I */
/* int-to-double v0, v0 */
p1 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
/* int-to-double v2, p1 */
/* const-wide/high16 v4, 0x4034000000000000L # 20.0 */
java.lang.Double .valueOf ( v4,v5 );
(( java.lang.Double ) p1 ).doubleValue ( ); // invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D
/* move-result-wide v4 */
/* div-double/2addr v2, v4 */
java.lang.Math .ceil ( v2,v3 );
/* move-result-wide v2 */
/* add-double/2addr v0, v2 */
/* double-to-int p1, v0 */
} // .end method
public final java.lang.String c ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Le/h/d/a/a/o/b/a; */
/* invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V */
(( e.h.d.a.a.g.w ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/w;->c()Lfr/mbs/binary/Octets;
fr.mbs.binary.Octets .createOctets ( p1 );
(( e.h.d.a.a.o.b.a ) v0 ).d ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/h/d/a/a/o/b/a;->d(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Error when unciphering \u00ab"; // const-string v2, "Error when unciphering \u00ab"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "\u00bb"; // const-string p1, "\u00bb"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.Token.Secure"; // const-string v1, "packid.ble.Token.Secure"
android.util.Log .e ( v1,p1,v0 );
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void d ( android.bluetooth.BluetoothGatt p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Le/h/d/a/a/g/u;->f(Landroid/bluetooth/BluetoothGatt;)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* iput p1, p0, Le/h/d/a/a/g/u;->n:I */
return;
} // .end method
public void d ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 3 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.i;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
/* invoke-direct {p0, p1, p2}, Le/h/d/a/a/g/u;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
/* .line 5 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Le/h/d/a/a/g/w;->d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
} // :goto_0
return;
} // .end method
public final void d ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
/* .line 6 */
v0 = this.p;
(( fr.mbs.binary.Octets ) v0 ).put ( p1 ); // invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 7 */
/* iget p1, p0, Le/h/d/a/a/g/u;->o:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Le/h/d/a/a/g/u;->o:I */
return;
} // .end method
public final e.h.d.a.a.g.o e ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.m;
/* if-nez v0, :cond_0 */
/* .line 5 */
v0 = this.b;
v1 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredTokenDataSignature ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 6 */
v1 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getTokenData ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
(( com.orange.oab.contactless.packid.hce.user.TokenData ) v1 ).toOctets ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).put ( v0 ); // invoke-virtual {v1, v0}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
int v1 = 1; // const/4 v1, 0x1
(( e.h.d.a.a.g.w ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;Z)Lfr/mbs/binary/Octets;
this.m = v0;
/* .line 7 */
} // :cond_0
v0 = this.m;
v0 = (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
/* const/16 v1, 0x14 */
/* if-le v0, v1, :cond_1 */
v0 = e.h.d.a.a.g.o.i;
} // :cond_1
v0 = e.h.d.a.a.g.o.j;
} // :goto_0
} // .end method
public void e ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.i;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.h.d.a.a.g.u ) p0 ).h ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/u;->h(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Le/h/d/a/a/g/w;->e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
} // :goto_0
return;
} // .end method
public final Boolean e ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
/* .line 13 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( fr.mbs.binary.Octets ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final fr.mbs.binary.Octets f ( ) {
/* .locals 2 */
/* .line 21 */
v0 = this.m;
v0 = (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
/* const/16 v1, 0x14 */
/* if-le v0, v1, :cond_0 */
/* .line 22 */
v0 = this.m;
(( fr.mbs.binary.Octets ) v0 ).pop ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
/* .line 23 */
} // :cond_0
v0 = this.m;
fr.mbs.binary.Octets .createOctets ( v0 );
} // .end method
public void f ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.i;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-direct {p0, p1}, Le/h/d/a/a/g/u;->f(Landroid/bluetooth/BluetoothGatt;)V */
/* .line 3 */
} // :cond_0
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.j;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
final String p2 = "packid.ble.Token.Secure"; // const-string p2, "packid.ble.Token.Secure"
final String v0 = "6- token written successfully, reading updated token"; // const-string v0, "6- token written successfully, reading updated token"
/* .line 4 */
android.util.Log .i ( p2,v0 );
/* .line 5 */
p2 = e.h.d.a.a.g.o.i;
p2 = (( e.h.d.a.a.g.v ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 6 */
p2 = e.h.d.a.a.g.o.i;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
/* .line 7 */
} // :cond_1
p2 = e.h.d.a.a.g.o.i;
(( e.h.d.a.a.g.v ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
/* .line 8 */
} // :cond_2
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.k;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 9 */
/* invoke-direct {p0, p1}, Le/h/d/a/a/g/u;->e(Landroid/bluetooth/BluetoothGatt;)V */
/* .line 10 */
} // :cond_3
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.l;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 11 */
(( e.h.d.a.a.g.v ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;)V
/* .line 12 */
} // :cond_4
/* invoke-super {p0, p1, p2}, Le/h/d/a/a/g/w;->f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
} // :goto_0
return;
} // .end method
public final Boolean f ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
/* .line 20 */
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( fr.mbs.binary.Octets ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final fr.mbs.binary.Octets g ( ) {
/* .locals 5 */
/* .line 12 */
v0 = this.p;
v0 = (( fr.mbs.binary.Octets ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->isEmpty()Z
final String v1 = "packid.ble.Token.Secure"; // const-string v1, "packid.ble.Token.Secure"
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "7- Empty token received from GATT server, reading reader result"; // const-string v0, "7- Empty token received from GATT server, reading reader result"
/* .line 13 */
android.util.Log .w ( v1,v0 );
/* .line 14 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "7- Updated token last part n\u00b0"; // const-string v2, "7- Updated token last part n\u00b0"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Le/h/d/a/a/g/u;->o:I */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " read successfully, reading reader result"; // const-string v2, " read successfully, reading reader result"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v0 );
/* .line 15 */
try { // :try_start_0
/* new-instance v0, Le/h/d/a/a/o/b/a; */
/* invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V */
(( e.h.d.a.a.g.w ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/w;->c()Lfr/mbs/binary/Octets;
v3 = this.p;
(( e.h.d.a.a.o.b.a ) v0 ).d ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Le/h/d/a/a/o/b/a;->d(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 16 */
(( e.h.d.a.a.g.w ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
v2 = (( e.h.d.a.a.g.u ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/g/u;->b(Lfr/mbs/binary/Octets;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 17 */
v2 = this.c;
(( e.h.d.a.a.g.u ) p0 ).a ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Le/h/d/a/a/g/u;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;
/* .line 18 */
v2 = this.a;
e.h.d.a.a.s.m .c ( v2 );
v3 = this.c;
(( e.h.d.a.a.s.g0 ) v2 ).c ( v3 ); // invoke-virtual {v2, v3}, Le/h/d/a/a/s/g0;->c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 19 */
/* new-instance v2, Le/h/d/a/a/n/n; */
v3 = this.a;
v4 = this.c;
/* invoke-direct {v2, v3, v4}, Le/h/d/a/a/n/n;-><init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V */
(( e.h.d.a.a.n.n ) v2 ).a ( ); // invoke-virtual {v2}, Le/h/d/a/a/n/n;->a()V
} // :cond_1
final String v0 = "Received truncated nonce2 is not valid, token could not be written"; // const-string v0, "Received truncated nonce2 is not valid, token could not be written"
/* .line 20 */
android.util.Log .e ( v1,v0 );
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v2 = "could not cipher identifier"; // const-string v2, "could not cipher identifier"
/* .line 21 */
android.util.Log .e ( v1,v2,v0 );
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean g ( fr.mbs.binary.Octets p0 ) {
/* .locals 4 */
/* .line 6 */
v0 = (( e.h.d.a.a.g.u ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/u;->f(Lfr/mbs/binary/Octets;)Z
int v1 = 1; // const/4 v1, 0x1
int v2 = 2; // const/4 v2, 0x2
final String v3 = "packid.ble.Token.Secure"; // const-string v3, "packid.ble.Token.Secure"
if ( v0 != null) { // if-eqz v0, :cond_0
final String p1 = "Read token part is the same as previous part, retrying read"; // const-string p1, "Read token part is the same as previous part, retrying read"
/* .line 7 */
android.util.Log .v ( v3,p1 );
final String p1 = "Part did not change"; // const-string p1, "Part did not change"
/* .line 8 */
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v3,p1,v2 );
/* .line 9 */
} // :cond_0
p1 = (( e.h.d.a.a.g.u ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/u;->e(Lfr/mbs/binary/Octets;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
final String p1 = "Read token part is the same as written part, retrying read"; // const-string p1, "Read token part is the same as written part, retrying read"
/* .line 10 */
android.util.Log .v ( v3,p1 );
final String p1 = "Part is still written value"; // const-string p1, "Part is still written value"
/* .line 11 */
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v3,p1,v2 );
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void h ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 1 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getValue ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B
fr.mbs.binary.Octets .createOctets ( p2 );
/* .line 2 */
v0 = (( e.h.d.a.a.g.u ) p0 ).g ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/g/u;->g(Lfr/mbs/binary/Octets;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
p2 = e.h.d.a.a.g.o.i;
(( e.h.d.a.a.g.v ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
return;
/* .line 4 */
} // :cond_0
(( e.h.d.a.a.g.u ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/g/u;->d(Lfr/mbs/binary/Octets;)V
/* .line 5 */
this.r = p2;
/* .line 6 */
v0 = e.h.d.a.a.g.o.k;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
return;
} // .end method
