public class inal implements e.b.a.y.w.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<DataT:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/w/e<", */
	 /* "TDataT;>;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String l;
/* # instance fields */
public final android.content.Context b;
public final e.b.a.y.y.w0 c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/w0<", */
/* "Ljava/io/File;", */
/* "TDataT;>;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.y.w0 d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/w0<", */
/* "Landroid/net/Uri;", */
/* "TDataT;>;" */
/* } */
} // .end annotation
} // .end field
public final android.net.Uri e;
public final Integer f;
public final Integer g;
public final e.b.a.y.r h;
public final java.lang.Class i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "TDataT;>;" */
/* } */
} // .end annotation
} // .end field
public volatile Boolean j;
public volatile e.b.a.y.w.e k;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/w/e<", */
/* "TDataT;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static inal ( ) {
/* .locals 1 */
final String v0 = "_data"; // const-string v0, "_data"
/* .line 1 */
/* filled-new-array {v0}, [Ljava/lang/String; */
return;
} // .end method
public inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Le/b/a/y/y/w0<", */
/* "Ljava/io/File;", */
/* "TDataT;>;", */
/* "Le/b/a/y/y/w0<", */
/* "Landroid/net/Uri;", */
/* "TDataT;>;", */
/* "Landroid/net/Uri;", */
/* "II", */
/* "Le/b/a/y/r;", */
/* "Ljava/lang/Class<", */
/* "TDataT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.b = p1;
/* .line 3 */
this.c = p2;
/* .line 4 */
this.d = p3;
/* .line 5 */
this.e = p4;
/* .line 6 */
/* iput p5, p0, Le/b/a/y/y/d2/j;->f:I */
/* .line 7 */
/* iput p6, p0, Le/b/a/y/y/d2/j;->g:I */
/* .line 8 */
this.h = p7;
/* .line 9 */
this.i = p8;
return;
} // .end method
/* # virtual methods */
public final java.io.File a ( android.net.Uri p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
try { // :try_start_0
v1 = this.b;
/* .line 10 */
(( android.content.Context ) v1 ).getContentResolver ( ); // invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
v4 = e.b.a.y.y.d2.j.l;
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
/* move-object v3, p1 */
/* .line 11 */
/* invoke-virtual/range {v2 ..v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
if ( v0 != null) { // if-eqz v0, :cond_2
v1 = /* .line 12 */
if ( v1 != null) { // if-eqz v1, :cond_2
final String v1 = "_data"; // const-string v1, "_data"
v1 = /* .line 13 */
/* .line 14 */
v2 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v2, :cond_1 */
/* .line 15 */
/* new-instance p1, Ljava/io/File; */
/* invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 16 */
} // :cond_0
/* .line 17 */
} // :cond_1
try { // :try_start_1
/* new-instance v1, Ljava/io/FileNotFoundException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "File path was empty in media store for: "; // const-string v3, "File path was empty in media store for: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 18 */
} // :cond_2
/* new-instance v1, Ljava/io/FileNotFoundException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to media store entry for: "; // const-string v3, "Failed to media store entry for: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception p1 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 19 */
/* .line 20 */
} // :cond_3
/* throw p1 */
} // .end method
public java.lang.Class a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "TDataT;>;" */
/* } */
} // .end annotation
/* .line 8 */
v0 = this.i;
} // .end method
public void a ( Object p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/n;", */
/* "Le/b/a/y/w/d<", */
/* "-TDataT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
(( e.b.a.y.y.d2.j ) p0 ).e ( ); // invoke-virtual {p0}, Le/b/a/y/y/d2/j;->e()Le/b/a/y/w/e;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Failed to build fetcher for: "; // const-string v1, "Failed to build fetcher for: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
return;
/* .line 3 */
} // :cond_0
this.k = v0;
/* .line 4 */
/* iget-boolean v1, p0, Le/b/a/y/y/d2/j;->j:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 5 */
(( e.b.a.y.y.d2.j ) p0 ).cancel ( ); // invoke-virtual {p0}, Le/b/a/y/y/d2/j;->cancel()V
/* .line 6 */
} // :cond_1
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 7 */
} // :goto_0
return;
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
return;
} // .end method
public e.b.a.y.a c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.y.a.b;
} // .end method
public void cancel ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/b/a/y/y/d2/j;->j:Z */
/* .line 2 */
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
return;
} // .end method
public final e.b.a.y.y.v0 d ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/b/a/y/y/v0<", */
/* "TDataT;>;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = android.os.Environment .isExternalStorageLegacy ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.c;
v1 = this.e;
(( e.b.a.y.y.d2.j ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/b/a/y/y/d2/j;->a(Landroid/net/Uri;)Ljava/io/File;
/* iget v2, p0, Le/b/a/y/y/d2/j;->f:I */
/* iget v3, p0, Le/b/a/y/y/d2/j;->g:I */
v4 = this.h;
/* .line 3 */
} // :cond_0
v0 = (( e.b.a.y.y.d2.j ) p0 ).f ( ); // invoke-virtual {p0}, Le/b/a/y/y/d2/j;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.e;
android.provider.MediaStore .setRequireOriginal ( v0 );
} // :cond_1
v0 = this.e;
/* .line 4 */
} // :goto_0
v1 = this.d;
/* iget v2, p0, Le/b/a/y/y/d2/j;->f:I */
/* iget v3, p0, Le/b/a/y/y/d2/j;->g:I */
v4 = this.h;
} // .end method
public final e.b.a.y.w.e e ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/b/a/y/w/e<", */
/* "TDataT;>;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.b.a.y.y.d2.j ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/y/y/d2/j;->d()Le/b/a/y/y/v0;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.c;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean f ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
final String v1 = "android.permission.ACCESS_MEDIA_LOCATION"; // const-string v1, "android.permission.ACCESS_MEDIA_LOCATION"
v0 = (( android.content.Context ) v0 ).checkSelfPermission ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
