public class e.b.a.y.w.u extends e.b.a.y.w.b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/b/a/y/w/b<", */
	 /* "Ljava/io/InputStream;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.b.a.y.w.u ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2}, Le/b/a/y/w/b;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V */
	 return;
} // .end method
/* # virtual methods */
public java.io.InputStream a ( android.content.res.AssetManager p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 3 */
(( android.content.res.AssetManager ) p1 ).open ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
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
public java.lang.Object a ( android.content.res.AssetManager p0, java.lang.String p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.b.a.y.w.u ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/w/u;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/InputStream;
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
(( e.b.a.y.w.u ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/w/u;->a(Ljava/io/InputStream;)V
return;
} // .end method
