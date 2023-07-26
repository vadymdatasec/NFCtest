public class e.h.d.a.a.s.k0.c extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge a;
	 public final fr.mbs.binary.Octets b;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Boolean a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 6 */
		 /* .line 2 */
		 /* new-instance v0, Landroid/content/ContentValues; */
		 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
		 /* .line 3 */
		 v1 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredTokenDataSignature ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 final String v2 = "cipheredTokenDataSignature"; // const-string v2, "cipheredTokenDataSignature"
		 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 4 */
		 v1 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getTokenData ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
		 (( com.orange.oab.contactless.packid.hce.user.TokenData ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toHexa()Ljava/lang/String;
		 final String v2 = "tokenData"; // const-string v2, "tokenData"
		 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 5 */
		 v1 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getRegenerationDate ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRegenerationDate()Ljava/util/Date;
		 /* if-nez v1, :cond_0 */
		 int v1 = 0; // const/4 v1, 0x0
	 } // :cond_0
	 v1 = this.a;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getRegenerationDate ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRegenerationDate()Ljava/util/Date;
	 (( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
	 /* move-result-wide v1 */
	 java.lang.Long .valueOf ( v1,v2 );
} // :goto_0
final String v2 = "regenerationDate"; // const-string v2, "regenerationDate"
(( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
final String v1 = "cipheredId = ? AND zoneId = ?"; // const-string v1, "cipheredId = ? AND zoneId = ?"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/String; */
/* .line 6 */
v3 = this.a;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getCipheredId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v3 ).toHexa ( ); // invoke-virtual {v3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
/* aput-object v3, v2, v4 */
v3 = this.a;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getZoneId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v3 ).toHexa ( ); // invoke-virtual {v3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
int v5 = 1; // const/4 v5, 0x1
/* aput-object v3, v2, v5 */
e.f.b.b.k .a ( v2 );
/* .line 7 */
v3 = this.b;
if ( v3 != null) { // if-eqz v3, :cond_1
	 /* .line 8 */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = " AND cipheredTokenDataSignature = ?"; // const-string v1, " AND cipheredTokenDataSignature = ?"
	 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 9 */
	 v3 = this.b;
	 (( fr.mbs.binary.Octets ) v3 ).toHexa ( ); // invoke-virtual {v3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 /* .line 10 */
v3 = } // :cond_1
/* new-array v3, v3, [Ljava/lang/String; */
/* check-cast v2, [Ljava/lang/String; */
final String v3 = "badge"; // const-string v3, "badge"
p1 = (( android.database.sqlite.SQLiteDatabase ) p1 ).update ( v3, v0, v1, v2 ); // invoke-virtual {p1, v3, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
/* if-lez p1, :cond_2 */
int v4 = 1; // const/4 v4, 0x1
/* .line 11 */
} // :cond_2
java.lang.Boolean .valueOf ( v4 );
} // .end method
public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.k0.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/c;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;
} // .end method
