public class e.h.d.a.a.s.k0.n extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public java.lang.String b;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.n ( ) {
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
		 (( e.h.d.a.a.s.k0.n ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/n;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
	 } // .end method
	 public java.util.List a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 5 */
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
	 v0 = this.a;
	 final String v1 = "unlockableByZoneID"; // const-string v1, "unlockableByZoneID"
	 (( e.h.d.a.a.s.k0.d ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
	 /* .line 3 */
	 v1 = this.b;
	 final String v2 = "userId"; // const-string v2, "userId"
	 (( e.h.d.a.a.s.k0.d ) p0 ).a ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
	 /* .line 4 */
	 /* new-instance v2, Le/h/d/a/a/s/k0/m; */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 int v1 = 2; // const/4 v1, 0x2
	 /* new-array v1, v1, [Ljava/lang/String; */
	 v3 = this.a;
	 int v4 = 0; // const/4 v4, 0x0
	 /* aput-object v3, v1, v4 */
	 v3 = this.b;
	 int v4 = 1; // const/4 v4, 0x1
	 /* aput-object v3, v1, v4 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* invoke-direct {v2, v0, v1, v3}, Le/h/d/a/a/s/k0/m;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
	 (( e.h.d.a.a.s.k0.o ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
} // .end method
