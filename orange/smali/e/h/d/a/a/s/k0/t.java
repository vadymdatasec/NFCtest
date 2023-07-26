public class e.h.d.a.a.s.k0.t extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final fr.mbs.binary.Octets a;
	 public final fr.mbs.binary.Octets b;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.t ( ) {
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
		 (( e.h.d.a.a.s.k0.t ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/t;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
	 } // .end method
	 public java.util.List a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/database/sqlite/SQLiteDatabase;", */
		 /* ")", */
		 /* "Ljava/util/List<", */
		 /* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 v0 = this.a;
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 1; // const/4 v2, 0x1
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v3 = 2; // const/4 v3, 0x2
		 /* new-array v3, v3, [Ljava/lang/String; */
		 /* .line 3 */
		 (( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 /* aput-object v0, v3, v1 */
		 v0 = this.b;
		 (( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 /* aput-object v0, v3, v2 */
		 final String v0 = "cipheredUri != ? AND contactlessId = ?"; // const-string v0, "cipheredUri != ? AND contactlessId = ?"
	 } // :cond_0
	 /* new-array v3, v2, [Ljava/lang/String; */
	 /* .line 4 */
	 v0 = this.b;
	 (( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 /* aput-object v0, v3, v1 */
	 final String v0 = "cipheredUri IS NOT NULL AND contactlessId = ?"; // const-string v0, "cipheredUri IS NOT NULL AND contactlessId = ?"
	 /* .line 5 */
} // :goto_0
/* new-instance v1, Le/h/d/a/a/s/k0/w; */
/* invoke-direct {v1, v0, v3}, Le/h/d/a/a/s/k0/w;-><init>(Ljava/lang/String;[Ljava/lang/String;)V */
(( e.h.d.a.a.s.k0.w ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
} // .end method
