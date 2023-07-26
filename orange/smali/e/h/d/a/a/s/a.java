public class e.h.d.a.a.s.a extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final fr.mbs.binary.Octets a;
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge b;
	 /* # direct methods */
	 public e.h.d.a.a.s.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p2;
		 /* .line 3 */
		 this.b = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( e.h.d.a.a.s.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
	 } // .end method
	 public java.lang.Void a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 5 */
		 /* .line 2 */
		 /* new-instance v0, Landroid/content/ContentValues; */
		 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
		 /* .line 3 */
		 v1 = this.b;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getDescription ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
		 final String v2 = "description"; // const-string v2, "description"
		 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 4 */
		 v1 = this.b;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getLogoFile ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getLogoFile()Ljava/lang/String;
		 final String v2 = "logoFile"; // const-string v2, "logoFile"
		 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 5 */
		 v1 = this.b;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredWalletKey ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-nez v1, :cond_0 */
		 /* move-object v1, v2 */
	 } // :cond_0
	 v1 = this.b;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredWalletKey ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_0
final String v3 = "cipheredWalletKey"; // const-string v3, "cipheredWalletKey"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 6 */
v1 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredUrl ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredUrl()Lfr/mbs/binary/Octets;
/* if-nez v1, :cond_1 */
/* move-object v1, v2 */
} // :cond_1
v1 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredUrl ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredUrl()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_1
final String v3 = "cipheredUrl"; // const-string v3, "cipheredUrl"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 7 */
v1 = this.b;
v1 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getRssi ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B
java.lang.Byte .valueOf ( v1 );
final String v3 = "rssi"; // const-string v3, "rssi"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Byte;)V
/* .line 8 */
v1 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getUserId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
final String v3 = "userId"; // const-string v3, "userId"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [Ljava/lang/String; */
/* .line 9 */
v3 = this.a;
(( fr.mbs.binary.Octets ) v3 ).toHexa ( ); // invoke-virtual {v3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
/* aput-object v3, v1, v4 */
v3 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getCipheredId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v3 ).toHexa ( ); // invoke-virtual {v3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
int v4 = 1; // const/4 v4, 0x1
/* aput-object v3, v1, v4 */
v3 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getZoneId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v3 ).toHexa ( ); // invoke-virtual {v3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
int v4 = 2; // const/4 v4, 0x2
/* aput-object v3, v1, v4 */
final String v3 = "badge"; // const-string v3, "badge"
final String v4 = "walletId = ? AND cipheredId = ? AND zoneId = ?"; // const-string v4, "walletId = ? AND cipheredId = ? AND zoneId = ?"
/* .line 10 */
(( android.database.sqlite.SQLiteDatabase ) p1 ).update ( v3, v0, v4, v1 ); // invoke-virtual {p1, v3, v0, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
} // .end method
