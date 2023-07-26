public class e.f.c.u.x implements java.io.Closeable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.net.URL b;
	 public e.f.a.b.h.g c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/a/b/h/g<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public volatile java.io.InputStream d;
/* # direct methods */
public e.f.c.u.x ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
return;
} // .end method
public static e.f.c.u.x b ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = android.text.TextUtils .isEmpty ( p0 );
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
} // :cond_0
try { // :try_start_0
	 /* new-instance v0, Le/f/c/u/x; */
	 /* new-instance v2, Ljava/net/URL; */
	 /* invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
	 /* invoke-direct {v0, v2}, Le/f/c/u/x;-><init>(Ljava/net/URL;)V */
	 /* :try_end_0 */
	 /* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* nop */
	 final String v0 = "Not downloading image, bad URL: "; // const-string v0, "Not downloading image, bad URL: "
	 /* .line 3 */
	 java.lang.String .valueOf ( p0 );
	 v2 = 	 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 (( java.lang.String ) v0 ).concat ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
	 } // :cond_1
	 /* new-instance p0, Ljava/lang/String; */
	 /* invoke-direct {p0, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_0
final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
android.util.Log .w ( v0,p0 );
} // .end method
/* # virtual methods */
public void a ( java.util.concurrent.Executor p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/c/u/w; */
/* invoke-direct {v0, p0}, Le/f/c/u/w;-><init>(Le/f/c/u/x;)V */
e.f.a.b.h.n .a ( p1,v0 );
this.c = p1;
return;
} // .end method
public android.graphics.Bitmap c ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
java.lang.String .valueOf ( v0 );
java.lang.String .valueOf ( v0 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x16 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "Starting download of: "; // const-string v1, "Starting download of: "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "FirebaseMessaging"; // const-string v1, "FirebaseMessaging"
android.util.Log .i ( v1,v0 );
/* .line 2 */
(( e.f.c.u.x ) p0 ).l ( ); // invoke-virtual {p0}, Le/f/c/u/x;->l()[B
/* .line 3 */
/* array-length v2, v0 */
int v3 = 0; // const/4 v3, 0x0
android.graphics.BitmapFactory .decodeByteArray ( v0,v3,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
int v2 = 3; // const/4 v2, 0x3
/* .line 4 */
v2 = android.util.Log .isLoggable ( v1,v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 5 */
	 v2 = this.b;
	 java.lang.String .valueOf ( v2 );
	 java.lang.String .valueOf ( v2 );
	 v3 = 	 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
	 /* add-int/lit8 v3, v3, 0x1f */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
	 final String v3 = "Successfully downloaded image: "; // const-string v3, "Successfully downloaded image: "
	 (( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v1,v2 );
} // :cond_0
/* .line 6 */
} // :cond_1
/* new-instance v0, Ljava/io/IOException; */
v1 = this.b;
java.lang.String .valueOf ( v1 );
java.lang.String .valueOf ( v1 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x18 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "Failed to decode image: "; // const-string v2, "Failed to decode image: "
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void close ( ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
v0 = this.d;
e.f.a.b.e.d.i .a ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FirebaseMessaging"; // const-string v1, "FirebaseMessaging"
final String v2 = "Failed to close the image download stream."; // const-string v2, "Failed to close the image download stream."
/* .line 2 */
android.util.Log .e ( v1,v2,v0 );
return;
} // .end method
public final l ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
(( java.net.URL ) v0 ).openConnection ( ); // invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* .line 2 */
v1 = (( java.net.URLConnection ) v0 ).getContentLength ( ); // invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I
/* const/high16 v2, 0x100000 */
/* if-gt v1, v2, :cond_4 */
/* .line 3 */
(( java.net.URLConnection ) v0 ).getInputStream ( ); // invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
/* .line 4 */
try { // :try_start_0
this.d = v0;
/* const-wide/32 v3, 0x100001 */
/* .line 5 */
e.f.a.b.e.d.h .a ( v0,v3,v4 );
/* .line 6 */
e.f.a.b.e.d.h .a ( v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 7 */
	 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
final String v3 = "FirebaseMessaging"; // const-string v3, "FirebaseMessaging"
/* .line 8 */
v0 = android.util.Log .isLoggable ( v3,v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 9 */
	 /* array-length v0, v1 */
	 v4 = this.b;
	 java.lang.String .valueOf ( v4 );
	 java.lang.String .valueOf ( v4 );
	 v5 = 	 (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
	 /* add-int/lit8 v5, v5, 0x22 */
	 /* new-instance v6, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V */
	 final String v5 = "Downloaded "; // const-string v5, "Downloaded "
	 (( java.lang.StringBuilder ) v6 ).append ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v0 = " bytes from "; // const-string v0, " bytes from "
	 (( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .v ( v3,v0 );
	 /* .line 10 */
} // :cond_1
/* array-length v0, v1 */
/* if-gt v0, v2, :cond_2 */
/* .line 11 */
} // :cond_2
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Image exceeds max size of 1048576"; // const-string v1, "Image exceeds max size of 1048576"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :catchall_0 */
/* move-exception v1 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 12 */
try { // :try_start_1
	 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
	 /* :catchall_1 */
	 /* move-exception v0 */
	 e.f.a.b.e.d.l .a ( v1,v0 );
} // :cond_3
} // :goto_0
/* throw v1 */
/* .line 13 */
} // :cond_4
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Content-Length exceeds max size of 1048576"; // const-string v1, "Content-Length exceeds max size of 1048576"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public e.f.a.b.h.g m ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
e.f.a.b.c.m.h .a ( v0 );
/* check-cast v0, Le/f/a/b/h/g; */
} // .end method
