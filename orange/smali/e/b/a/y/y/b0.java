public class e.b.a.y.y.b0 implements e.b.a.y.y.e0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/y/e0<", */
	 /* "Landroid/os/ParcelFileDescriptor;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.b.a.y.y.b0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public android.os.ParcelFileDescriptor a ( java.io.File p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/FileNotFoundException; */
	 /* } */
} // .end annotation
/* const/high16 v0, 0x10000000 */
/* .line 3 */
android.os.ParcelFileDescriptor .open ( p1,v0 );
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
/* .line 5 */
/* const-class v0, Landroid/os/ParcelFileDescriptor; */
} // .end method
public java.lang.Object a ( java.io.File p0 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.b.a.y.y.b0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/b0;->a(Ljava/io/File;)Landroid/os/ParcelFileDescriptor;
} // .end method
public void a ( android.os.ParcelFileDescriptor p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
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
(( e.b.a.y.y.b0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/b0;->a(Landroid/os/ParcelFileDescriptor;)V
return;
} // .end method
