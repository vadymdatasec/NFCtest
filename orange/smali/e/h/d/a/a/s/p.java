public class e.h.d.a.a.s.p extends e.h.d.a.a.s.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.p ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 final String v1 = "CREATE TABLE IF NOT EXISTS tenant (name TEXT UNIQUE NOT NULL,logoUrl TEXT);"; // const-string v1, "CREATE TABLE IF NOT EXISTS tenant (name TEXT UNIQUE NOT NULL,logoUrl TEXT);"
		 (( android.database.sqlite.SQLiteDatabase ) v0 ).execSQL ( v1 ); // invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 /* .line 2 */
		 v0 = this.b;
		 final String v1 = "ALTER TABLE user ADD COLUMN tenantName TEXT;"; // const-string v1, "ALTER TABLE user ADD COLUMN tenantName TEXT;"
		 (( android.database.sqlite.SQLiteDatabase ) v0 ).execSQL ( v1 ); // invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
		 return;
	 } // .end method
