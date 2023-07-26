public class e.b.a.y.w.l extends e.b.a.y.w.b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/b/a/y/w/b<", */
	 /* "Landroid/content/res/AssetFileDescriptor;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.b.a.y.w.l ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2}, Le/b/a/y/w/b;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;)V */
	 return;
} // .end method
/* # virtual methods */
public android.content.res.AssetFileDescriptor a ( android.content.res.AssetManager p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 3 */
(( android.content.res.AssetManager ) p1 ).openFd ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
} // .end method
public java.lang.Class a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "Landroid/content/res/AssetFileDescriptor;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 5 */
/* const-class v0, Landroid/content/res/AssetFileDescriptor; */
} // .end method
public java.lang.Object a ( android.content.res.AssetManager p0, java.lang.String p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.b.a.y.w.l ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/w/l;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
} // .end method
public void a ( android.content.res.AssetFileDescriptor p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
(( android.content.res.AssetFileDescriptor ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V
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
/* check-cast p1, Landroid/content/res/AssetFileDescriptor; */
(( e.b.a.y.w.l ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/w/l;->a(Landroid/content/res/AssetFileDescriptor;)V
return;
} // .end method
