public class e.h.d.a.a.s.k0.j extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Landroid/database/sqlite/SQLiteDatabase;", */
		 /* ")TT;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.a;
	 final String v1 = "id"; // const-string v1, "id"
	 (( e.h.d.a.a.s.k0.d ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
	 v1 = this.a;
	 (( e.h.d.a.a.s.k0.d ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;)[Ljava/lang/String;
	 final String v2 = "user"; // const-string v2, "user"
	 (( android.database.sqlite.SQLiteDatabase ) p1 ).delete ( v2, v0, v1 ); // invoke-virtual {p1, v2, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
	 /* .line 2 */
	 v0 = this.a;
	 final String v1 = "userId"; // const-string v1, "userId"
	 (( e.h.d.a.a.s.k0.d ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
	 v1 = this.a;
	 (( e.h.d.a.a.s.k0.d ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;)[Ljava/lang/String;
	 final String v2 = "badge"; // const-string v2, "badge"
	 (( android.database.sqlite.SQLiteDatabase ) p1 ).delete ( v2, v0, v1 ); // invoke-virtual {p1, v2, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
