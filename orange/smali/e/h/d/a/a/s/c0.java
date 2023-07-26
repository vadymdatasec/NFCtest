public class e.h.d.a.a.s.c0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public e.h.d.a.a.s.q a;
	 /* # direct methods */
	 public e.h.d.a.a.s.c0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static void a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 1 */
		 final String v0 = "CREATE TABLE tokenTransaction (id TEXT PRIMARY KEY, zoneId TEXT, transactionDate NUMERIC, amountInCents INTEGER, description TEXT);"; // const-string v0, "CREATE TABLE tokenTransaction (id TEXT PRIMARY KEY, zoneId TEXT, transactionDate NUMERIC, amountInCents INTEGER, description TEXT);"
		 /* .line 1 */
		 (( android.database.sqlite.SQLiteDatabase ) p0 ).execSQL ( v0 ); // invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.util.List a ( fr.mbs.binary.Octets p0, Integer p1 ) {
		 /* .locals 8 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Lfr/mbs/binary/Octets;", */
		 /* "I)", */
		 /* "Ljava/util/List<", */
		 /* "Lcom/orange/oab/contactless/packid/domain/Transaction;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v6, v0, [Ljava/lang/String; */
	 /* .line 3 */
	 (( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 int v0 = 0; // const/4 v0, 0x0
	 /* aput-object p1, v6, v0 */
	 /* .line 4 */
	 /* new-instance p1, Le/h/d/a/a/s/a0; */
	 java.lang.String .valueOf ( p2 );
	 final String v3 = "tokenTransaction"; // const-string v3, "tokenTransaction"
	 final String v4 = "ROWID desc"; // const-string v4, "ROWID desc"
	 final String v5 = "zoneId = ?"; // const-string v5, "zoneId = ?"
	 /* move-object v1, p1 */
	 /* move-object v2, p0 */
	 /* invoke-direct/range {v1 ..v7}, Le/h/d/a/a/s/a0;-><init>(Le/h/d/a/a/s/c0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 5 */
	 p2 = this.a;
	 (( e.h.d.a.a.s.q ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
	 /* check-cast p1, Ljava/util/List; */
} // .end method
public void a ( com.orange.oab.contactless.packid.domain.Transaction p0 ) {
	 /* .locals 3 */
	 /* .line 2 */
	 v0 = this.a;
	 /* new-instance v1, Le/h/d/a/a/s/y; */
	 final String v2 = "tokenTransaction"; // const-string v2, "tokenTransaction"
	 /* invoke-direct {v1, p0, p1, v2, p1}, Le/h/d/a/a/s/y;-><init>(Le/h/d/a/a/s/c0;Lcom/orange/oab/contactless/packid/domain/Transaction;Ljava/lang/String;Lcom/orange/oab/contactless/packid/domain/Transaction;)V */
	 (( e.h.d.a.a.s.q ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;
	 return;
} // .end method
