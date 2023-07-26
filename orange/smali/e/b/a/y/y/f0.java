public class e.b.a.y.y.f0 implements e.b.a.y.y.e0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/y/e0<", */
	 /* "Ljava/io/InputStream;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.b.a.y.y.f0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public java.io.InputStream a ( java.io.File p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/FileNotFoundException; */
	 /* } */
} // .end annotation
/* .line 3 */
/* new-instance v0, Ljava/io/FileInputStream; */
/* invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
} // .end method
public java.lang.Class a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "Ljava/io/InputStream;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 5 */
/* const-class v0, Ljava/io/InputStream; */
} // .end method
public java.lang.Object a ( java.io.File p0 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.b.a.y.y.f0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/f0;->a(Ljava/io/File;)Ljava/io/InputStream;
} // .end method
public void a ( java.io.InputStream p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
(( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
return;
} // .end method
public void a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Ljava/io/InputStream; */
(( e.b.a.y.y.f0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/f0;->a(Ljava/io/InputStream;)V
return;
} // .end method
