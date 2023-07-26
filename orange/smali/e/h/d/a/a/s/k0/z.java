public abstract class e.h.d.a.a.s.k0.z extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Le/h/d/a/a/s/k0/d;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Object a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
public final java.lang.String b;
/* # direct methods */
public e.h.d.a.a.s.k0.z ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
return;
} // .end method
/* # virtual methods */
public abstract android.content.ContentValues a ( java.lang.Object p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)", */
/* "Landroid/content/ContentValues;" */
/* } */
} // .end annotation
} // .end method
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
v0 = this.b;
v1 = this.a;
(( e.h.d.a.a.s.k0.z ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/s/k0/z;->a(Ljava/lang/Object;)Landroid/content/ContentValues;
int v2 = 0; // const/4 v2, 0x0
(( android.database.sqlite.SQLiteDatabase ) p1 ).insertOrThrow ( v0, v2, v1 ); // invoke-virtual {p1, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
} // .end method
