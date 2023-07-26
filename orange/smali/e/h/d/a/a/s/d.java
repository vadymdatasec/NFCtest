public class e.h.d.a.a.s.d extends e.h.d.a.a.s.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 final String v1 = "update user set contactlessId = \'00000001\' where contactlessId is null"; // const-string v1, "update user set contactlessId = \'00000001\' where contactlessId is null"
		 (( android.database.sqlite.SQLiteDatabase ) v0 ).execSQL ( v1 ); // invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [Ljava/lang/String; */
		 final String v1 = "CREATE TABLE user (contactlessId TEXT UNIQUE NOT NULL,email TEXT,firstname TEXT,lastname TEXT,walletId TEXT,cipheredUri TEXT PRIMARY KEY,simCentric BOOLEAN DEFAULT 0,id TEXT UNIQUE);"; // const-string v1, "CREATE TABLE user (contactlessId TEXT UNIQUE NOT NULL,email TEXT,firstname TEXT,lastname TEXT,walletId TEXT,cipheredUri TEXT PRIMARY KEY,simCentric BOOLEAN DEFAULT 0,id TEXT UNIQUE);"
		 final String v2 = "user"; // const-string v2, "user"
		 /* .line 2 */
		 (( e.h.d.a.a.s.h0 ) p0 ).a ( v1, v2, v0 ); // invoke-virtual {p0, v1, v2, v0}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
		 return;
	 } // .end method
