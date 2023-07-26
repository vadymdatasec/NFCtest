public class e.b.a.y.z.e.p0 implements e.b.a.y.t {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/t<", */
	 /* "Ljava/io/InputStream;", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.y.z.e.x a;
public final e.b.a.y.x.f1.b b;
/* # direct methods */
public e.b.a.y.z.e.p0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.a = p1;
	 /* .line 3 */
	 this.b = p2;
	 return;
} // .end method
/* # virtual methods */
public e.b.a.y.x.y0 a ( java.io.InputStream p0, Integer p1, Integer p2, Object p3 ) {
	 /* .locals 8 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/io/InputStream;", */
	 /* "II", */
	 /* "Le/b/a/y/r;", */
	 /* ")", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
/* instance-of v0, p1, Le/b/a/y/z/e/m0; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
/* check-cast p1, Le/b/a/y/z/e/m0; */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
} // :cond_0
/* new-instance v0, Le/b/a/y/z/e/m0; */
v1 = this.b;
/* invoke-direct {v0, p1, v1}, Le/b/a/y/z/e/m0;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;)V */
int p1 = 1; // const/4 p1, 0x1
/* move-object p1, v0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
} // :goto_0
e.b.a.e0.f .b ( p1 );
/* .line 8 */
/* new-instance v3, Le/b/a/e0/p; */
/* invoke-direct {v3, v1}, Le/b/a/e0/p;-><init>(Ljava/io/InputStream;)V */
/* .line 9 */
/* new-instance v7, Le/b/a/y/z/e/o0; */
/* invoke-direct {v7, p1, v1}, Le/b/a/y/z/e/o0;-><init>(Le/b/a/y/z/e/m0;Le/b/a/e0/f;)V */
/* .line 10 */
try { // :try_start_0
v2 = this.a;
/* move v4, p2 */
/* move v5, p3 */
/* move-object v6, p4 */
/* invoke-virtual/range {v2 ..v7}, Le/b/a/y/z/e/x;->a(Ljava/io/InputStream;IILe/b/a/y/r;Le/b/a/y/z/e/w;)Le/b/a/y/x/y0; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 11 */
(( e.b.a.e0.f ) v1 ).l ( ); // invoke-virtual {v1}, Le/b/a/e0/f;->l()V
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 12 */
(( e.b.a.y.z.e.m0 ) p1 ).l ( ); // invoke-virtual {p1}, Le/b/a/y/z/e/m0;->l()V
} // :cond_1
/* :catchall_0 */
/* move-exception p2 */
/* .line 13 */
(( e.b.a.e0.f ) v1 ).l ( ); // invoke-virtual {v1}, Le/b/a/e0/f;->l()V
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 14 */
(( e.b.a.y.z.e.m0 ) p1 ).l ( ); // invoke-virtual {p1}, Le/b/a/y/z/e/m0;->l()V
/* .line 15 */
} // :cond_2
/* throw p2 */
} // .end method
public e.b.a.y.x.y0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Ljava/io/InputStream; */
(( e.b.a.y.z.e.p0 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/e/p0;->a(Ljava/io/InputStream;IILe/b/a/y/r;)Le/b/a/y/x/y0;
} // .end method
public Boolean a ( java.io.InputStream p0, Object p1 ) {
/* .locals 0 */
/* .line 3 */
p2 = this.a;
p1 = (( e.b.a.y.z.e.x ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/b/a/y/z/e/x;->a(Ljava/io/InputStream;)Z
} // .end method
public Boolean a ( java.lang.Object p0, Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p1, Ljava/io/InputStream; */
p1 = (( e.b.a.y.z.e.p0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/z/e/p0;->a(Ljava/io/InputStream;Le/b/a/y/r;)Z
} // .end method
