public class e.b.a.y.w.w.e implements e.b.a.y.w.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/w/e<", */
	 /* "Ljava/io/InputStream;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.net.Uri b;
public final e.b.a.y.w.w.g c;
public java.io.InputStream d;
/* # direct methods */
public e.b.a.y.w.w.e ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.b = p1;
	 /* .line 3 */
	 this.c = p2;
	 return;
} // .end method
public static e.b.a.y.w.w.e a ( android.content.Context p0, android.net.Uri p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Le/b/a/y/w/w/c; */
	 (( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
	 /* invoke-direct {v0, v1}, Le/b/a/y/w/w/c;-><init>(Landroid/content/ContentResolver;)V */
	 e.b.a.y.w.w.e .a ( p0,p1,v0 );
} // .end method
public static e.b.a.y.w.w.e a ( android.content.Context p0, android.net.Uri p1, Object p2 ) {
	 /* .locals 3 */
	 /* .line 2 */
	 e.b.a.d .a ( p0 );
	 (( e.b.a.d ) v0 ).b ( ); // invoke-virtual {v0}, Le/b/a/d;->b()Le/b/a/y/x/f1/b;
	 /* .line 3 */
	 /* new-instance v1, Le/b/a/y/w/w/g; */
	 /* .line 4 */
	 e.b.a.d .a ( p0 );
	 (( e.b.a.d ) v2 ).g ( ); // invoke-virtual {v2}, Le/b/a/d;->g()Lcom/bumptech/glide/Registry;
	 (( com.bumptech.glide.Registry ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/bumptech/glide/Registry;->a()Ljava/util/List;
	 /* .line 5 */
	 (( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
	 /* invoke-direct {v1, v2, p2, v0, p0}, Le/b/a/y/w/w/g;-><init>(Ljava/util/List;Le/b/a/y/w/w/f;Le/b/a/y/x/f1/b;Landroid/content/ContentResolver;)V */
	 /* .line 6 */
	 /* new-instance p0, Le/b/a/y/w/w/e; */
	 /* invoke-direct {p0, p1, v1}, Le/b/a/y/w/w/e;-><init>(Landroid/net/Uri;Le/b/a/y/w/w/g;)V */
} // .end method
public static e.b.a.y.w.w.e b ( android.content.Context p0, android.net.Uri p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Le/b/a/y/w/w/d; */
	 (( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
	 /* invoke-direct {v0, v1}, Le/b/a/y/w/w/d;-><init>(Landroid/content/ContentResolver;)V */
	 e.b.a.y.w.w.e .a ( p0,p1,v0 );
} // .end method
/* # virtual methods */
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
/* .line 12 */
/* const-class v0, Ljava/io/InputStream; */
} // .end method
public void a ( Object p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/n;", */
/* "Le/b/a/y/w/d<", */
/* "-", */
/* "Ljava/io/InputStream;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 7 */
try { // :try_start_0
(( e.b.a.y.w.w.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/y/w/w/e;->d()Ljava/io/InputStream;
this.d = p1;
/* .line 8 */
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
int v0 = 3; // const/4 v0, 0x3
final String v1 = "MediaStoreThumbFetcher"; // const-string v1, "MediaStoreThumbFetcher"
/* .line 9 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 final String v0 = "Failed to find thumbnail file"; // const-string v0, "Failed to find thumbnail file"
	 /* .line 10 */
	 android.util.Log .d ( v1,v0,p1 );
	 /* .line 11 */
} // :cond_0
} // :goto_0
return;
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
try { // :try_start_0
	 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
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
public final java.io.InputStream d ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
v1 = this.b;
(( e.b.a.y.w.w.g ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/b/a/y/w/w/g;->c(Landroid/net/Uri;)Ljava/io/InputStream;
int v1 = -1; // const/4 v1, -0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v2 = this.c;
v3 = this.b;
v2 = (( e.b.a.y.w.w.g ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/b/a/y/w/w/g;->a(Landroid/net/Uri;)I
} // :cond_0
int v2 = -1; // const/4 v2, -0x1
} // :goto_0
/* if-eq v2, v1, :cond_1 */
/* .line 3 */
/* new-instance v1, Le/b/a/y/w/k; */
/* invoke-direct {v1, v0, v2}, Le/b/a/y/w/k;-><init>(Ljava/io/InputStream;I)V */
/* move-object v0, v1 */
} // :cond_1
} // .end method
