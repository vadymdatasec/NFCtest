public abstract class e.b.a.y.w.s implements e.b.a.y.w.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/w/e<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.net.Uri b;
public final android.content.ContentResolver c;
public java.lang.Object d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.w.s ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.c = p1;
/* .line 3 */
this.b = p2;
return;
} // .end method
/* # virtual methods */
public abstract java.lang.Object a ( android.net.Uri p0, android.content.ContentResolver p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/net/Uri;", */
/* "Landroid/content/ContentResolver;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
} // .end method
public final void a ( Object p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/n;", */
/* "Le/b/a/y/w/d<", */
/* "-TT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
p1 = this.b;
v0 = this.c;
(( e.b.a.y.w.s ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/b/a/y/w/s;->a(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/Object;
this.d = p1;
/* .line 2 */
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
int v0 = 3; // const/4 v0, 0x3
final String v1 = "LocalUriFetcher"; // const-string v1, "LocalUriFetcher"
/* .line 3 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "Failed to open Uri"; // const-string v0, "Failed to open Uri"
/* .line 4 */
android.util.Log .d ( v1,v0,p1 );
/* .line 5 */
} // :cond_0
} // :goto_0
return;
} // .end method
public abstract void a ( java.lang.Object p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
try { // :try_start_0
(( e.b.a.y.w.s ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/y/w/s;->a(Ljava/lang/Object;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_0
return;
} // .end method
public e.b.a.y.a c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.y.a.b;
} // .end method
public void cancel ( ) {
/* .locals 0 */
return;
} // .end method
