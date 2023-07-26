public class e.b.a.y.w.m extends e.b.a.y.w.s {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/b/a/y/w/s<", */
	 /* "Landroid/os/ParcelFileDescriptor;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.b.a.y.w.m ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2}, Le/b/a/y/w/s;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;)V */
	 return;
} // .end method
/* # virtual methods */
public android.os.ParcelFileDescriptor a ( android.net.Uri p0, android.content.ContentResolver p1 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/FileNotFoundException; */
	 /* } */
} // .end annotation
final String v0 = "r"; // const-string v0, "r"
/* .line 3 */
(( android.content.ContentResolver ) p2 ).openAssetFileDescriptor ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 4 */
	 (( android.content.res.AssetFileDescriptor ) p2 ).getParcelFileDescriptor ( ); // invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;
	 /* .line 5 */
} // :cond_0
/* new-instance p2, Ljava/io/FileNotFoundException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "FileDescriptor is null for: "; // const-string v1, "FileDescriptor is null for: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public java.lang.Class a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "Landroid/os/ParcelFileDescriptor;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 7 */
/* const-class v0, Landroid/os/ParcelFileDescriptor; */
} // .end method
public java.lang.Object a ( android.net.Uri p0, android.content.ContentResolver p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.b.a.y.w.m ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/w/m;->a(Landroid/net/Uri;Landroid/content/ContentResolver;)Landroid/os/ParcelFileDescriptor;
} // .end method
public void a ( android.os.ParcelFileDescriptor p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 6 */
(( android.os.ParcelFileDescriptor ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
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
/* check-cast p1, Landroid/os/ParcelFileDescriptor; */
(( e.b.a.y.w.m ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/w/m;->a(Landroid/os/ParcelFileDescriptor;)V
return;
} // .end method
