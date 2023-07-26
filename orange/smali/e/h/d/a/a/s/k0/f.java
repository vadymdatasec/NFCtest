public class e.h.d.a.a.s.k0.f extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( e.h.d.a.a.s.k0.f ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/f;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
	 } // .end method
	 public java.lang.Void a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 final String v1 = "badge"; // const-string v1, "badge"
		 /* .line 2 */
		 (( android.database.sqlite.SQLiteDatabase ) p1 ).delete ( v1, v0, v0 ); // invoke-virtual {p1, v1, v0, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
		 final String v1 = "user"; // const-string v1, "user"
		 /* .line 3 */
		 (( android.database.sqlite.SQLiteDatabase ) p1 ).delete ( v1, v0, v0 ); // invoke-virtual {p1, v1, v0, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
	 } // .end method
