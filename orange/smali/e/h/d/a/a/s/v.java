public class e.h.d.a.a.s.v extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public e.h.d.a.a.s.z a;
	 public final fr.mbs.binary.Octets b;
	 /* # direct methods */
	 public e.h.d.a.a.s.v ( ) {
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
	 public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( e.h.d.a.a.s.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/v;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
	 } // .end method
	 public java.util.List a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/database/sqlite/SQLiteDatabase;", */
		 /* ")", */
		 /* "Ljava/util/List<", */
		 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 /* new-instance v0, Landroid/content/ContentValues; */
	 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
	 /* .line 3 */
	 v1 = this.b;
	 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 final String v2 = "cipheredId"; // const-string v2, "cipheredId"
	 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 4 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 v2 = this.a;
	 v2 = this.b;
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 2; // const/4 v4, 0x2
	 (( fr.mbs.binary.Octets ) v2 ).get ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "XXXXXXXXXXXX"; // const-string v2, "XXXXXXXXXXXX"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v2 = this.a;
	 v2 = this.b;
	 v5 = 	 (( fr.mbs.binary.Octets ) v2 ).size ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->size()I
	 /* sub-int/2addr v5, v4 */
	 (( fr.mbs.binary.Octets ) v2 ).get ( v5, v4 ); // invoke-virtual {v2, v5, v4}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v2 = "maskedId"; // const-string v2, "maskedId"
	 /* .line 5 */
	 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* new-array v1, v4, [Ljava/lang/String; */
	 /* .line 6 */
	 v2 = this.a;
	 v2 = this.b;
	 (( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 /* aput-object v2, v1, v3 */
	 v2 = this.a;
	 v2 = this.a;
	 (( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 int v3 = 1; // const/4 v3, 0x1
	 /* aput-object v2, v1, v3 */
	 final String v2 = "badge"; // const-string v2, "badge"
	 final String v3 = "badgeId = ? AND zoneId = ?"; // const-string v3, "badgeId = ? AND zoneId = ?"
	 /* .line 7 */
	 (( android.database.sqlite.SQLiteDatabase ) p1 ).update ( v2, v0, v3, v1 ); // invoke-virtual {p1, v2, v0, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
	 /* .line 8 */
	 java.util.Collections .emptyList ( );
} // .end method
