public abstract class e.h.d.a.a.s.r0 extends e.h.d.a.a.s.k0.o {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/h/d/a/a/s/k0/o<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.h.d.a.a.s.r0 ( ) {
	 /* .locals 6 */
	 final String v1 = "badge"; // const-string v1, "badge"
	 final String v2 = "description"; // const-string v2, "description"
	 /* move-object v0, p0 */
	 /* move-object v3, p2 */
	 /* move-object v4, p3 */
	 /* move-object v5, p4 */
	 /* .line 1 */
	 /* invoke-direct/range {v0 ..v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
/* # virtual methods */
public com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( android.database.Cursor p0 ) {
	 /* .locals 7 */
	 final String v0 = "cipheredId"; // const-string v0, "cipheredId"
	 /* .line 5 */
	 v0 = 	 e.h.d.a.a.m .a ( v0,p1 );
	 fr.mbs.binary.Octets .createOctets ( v0 );
	 final String v0 = "zoneId"; // const-string v0, "zoneId"
	 /* .line 6 */
	 v0 = 	 e.h.d.a.a.m .a ( v0,p1 );
	 fr.mbs.binary.Octets .createOctets ( v0 );
	 final String v0 = "cipheredWalletKey"; // const-string v0, "cipheredWalletKey"
	 /* .line 7 */
	 (( e.h.d.a.a.s.r0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
	 final String v0 = "description"; // const-string v0, "description"
	 /* .line 8 */
	 v0 = 	 e.h.d.a.a.m .a ( v0,p1 );
	 final String v0 = "maskedId"; // const-string v0, "maskedId"
	 /* .line 9 */
	 v0 = 	 e.h.d.a.a.m .a ( v0,p1 );
	 /* .line 10 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
	 /* move-object v1, v0 */
	 /* invoke-direct/range {v1 ..v6}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;)V */
	 final String v1 = "logoFile"; // const-string v1, "logoFile"
	 /* .line 11 */
	 v1 = 	 e.h.d.a.a.m .a ( v1,p1 );
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setLogoFile ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLogoFile(Ljava/lang/String;)V
	 final String v1 = "cipheredTokenDataSignature"; // const-string v1, "cipheredTokenDataSignature"
	 /* .line 12 */
	 (( e.h.d.a.a.s.r0 ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setCipheredTokenDataSignature ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V
	 final String v1 = "tokenData"; // const-string v1, "tokenData"
	 /* .line 13 */
	 (( e.h.d.a.a.s.r0 ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
	 /* if-nez v1, :cond_0 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 14 */
} // :cond_0
com.orange.oab.contactless.packid.hce.user.TokenData .parse ( v1 );
} // :goto_0
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setTokenData ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V
final String v1 = "cipheredUrl"; // const-string v1, "cipheredUrl"
/* .line 15 */
(( e.h.d.a.a.s.r0 ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setCipheredUrl ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredUrl(Lfr/mbs/binary/Octets;)V
/* .line 16 */
/* new-instance v1, Ljava/util/Date; */
final String v2 = "regenerationDate"; // const-string v2, "regenerationDate"
v2 = e.h.d.a.a.m .a ( v2,p1 );
/* move-result-wide v2 */
/* invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setRegenerationDate ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRegenerationDate(Ljava/util/Date;)V
final String v1 = "isTransactionAllowed"; // const-string v1, "isTransactionAllowed"
/* .line 17 */
v1 = v1 = e.h.d.a.a.m .a ( v1,p1 );
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_1 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setTransactionAllowed ( v2 ); // invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTransactionAllowed(Z)V
final String v1 = "rssi"; // const-string v1, "rssi"
/* .line 18 */
v1 = v1 = e.h.d.a.a.m .a ( v1,p1 );
/* int-to-byte v1, v1 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setRssi ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssi(B)V
final String v1 = "rssiButtonInterval"; // const-string v1, "rssiButtonInterval"
/* .line 19 */
p1 = v1 = e.h.d.a.a.m .a ( v1,p1 );
/* int-to-byte p1, p1 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setRssiButtonInterval ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssiButtonInterval(B)V
} // .end method
public final fr.mbs.binary.Octets a ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 1 */
p2 = /* .line 2 */
v0 = /* .line 3 */
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
} // :cond_0
fr.mbs.binary.Octets .createOctets ( p1 );
} // .end method
public java.lang.Object a ( android.database.Cursor p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.r0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
} // .end method
