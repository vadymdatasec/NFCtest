public class e.b.a.y.w.p implements e.b.a.y.w.e {
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
/* # static fields */
public static final e.b.a.y.w.o h;
/* # instance fields */
public final e.b.a.y.y.i0 b;
public final Integer c;
public final e.b.a.y.w.o d;
public java.net.HttpURLConnection e;
public java.io.InputStream f;
public volatile Boolean g;
/* # direct methods */
public static e.b.a.y.w.p ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Le/b/a/y/w/n; */
	 /* invoke-direct {v0}, Le/b/a/y/w/n;-><init>()V */
	 return;
} // .end method
public e.b.a.y.w.p ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = e.b.a.y.w.p.h;
	 /* invoke-direct {p0, p1, p2, v0}, Le/b/a/y/w/p;-><init>(Le/b/a/y/y/i0;ILe/b/a/y/w/o;)V */
	 return;
} // .end method
public e.b.a.y.w.p ( ) {
	 /* .locals 0 */
	 /* .line 2 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 3 */
	 this.b = p1;
	 /* .line 4 */
	 /* iput p2, p0, Le/b/a/y/w/p;->c:I */
	 /* .line 5 */
	 this.d = p3;
	 return;
} // .end method
public static Boolean a ( Integer p0 ) {
	 /* .locals 1 */
	 /* .line 46 */
	 /* div-int/lit8 p0, p0, 0x64 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* if-ne p0, v0, :cond_0 */
	 int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Integer b ( java.net.HttpURLConnection p0 ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
p0 = (( java.net.HttpURLConnection ) p0 ).getResponseCode ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
int v0 = 3; // const/4 v0, 0x3
final String v1 = "HttpUrlFetcher"; // const-string v1, "HttpUrlFetcher"
/* .line 2 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 final String v0 = "Failed to get a response code"; // const-string v0, "Failed to get a response code"
	 /* .line 3 */
	 android.util.Log .d ( v1,v0,p0 );
} // :cond_0
int p0 = -1; // const/4 p0, -0x1
} // .end method
public static Boolean b ( Integer p0 ) {
/* .locals 1 */
/* .line 4 */
/* div-int/lit8 p0, p0, 0x64 */
int v0 = 3; // const/4 v0, 0x3
/* if-ne p0, v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
/* # virtual methods */
public final java.io.InputStream a ( java.net.HttpURLConnection p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/bumptech/glide/load/HttpException; */
/* } */
} // .end annotation
final String v0 = "HttpUrlFetcher"; // const-string v0, "HttpUrlFetcher"
/* .line 47 */
try { // :try_start_0
(( java.net.HttpURLConnection ) p1 ).getContentEncoding ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;
v1 = android.text.TextUtils .isEmpty ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 48 */
v0 = (( java.net.HttpURLConnection ) p1 ).getContentLength ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentLength()I
/* .line 49 */
(( java.net.HttpURLConnection ) p1 ).getInputStream ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* int-to-long v2, v0 */
e.b.a.e0.e .a ( v1,v2,v3 );
this.f = v0;
} // :cond_0
int v1 = 3; // const/4 v1, 0x3
/* .line 50 */
v1 = android.util.Log .isLoggable ( v0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 51 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Got non empty content encoding: "; // const-string v2, "Got non empty content encoding: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.net.HttpURLConnection ) p1 ).getContentEncoding ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 52 */
} // :cond_1
(( java.net.HttpURLConnection ) p1 ).getInputStream ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
this.f = v0;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 53 */
} // :goto_0
p1 = this.f;
/* :catch_0 */
/* move-exception v0 */
/* .line 54 */
/* new-instance v1, Lcom/bumptech/glide/load/HttpException; */
/* .line 55 */
p1 = e.b.a.y.w.p .b ( p1 );
final String v2 = "Failed to obtain InputStream"; // const-string v2, "Failed to obtain InputStream"
/* invoke-direct {v1, v2, p1, v0}, Lcom/bumptech/glide/load/HttpException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public final java.io.InputStream a ( java.net.URL p0, Integer p1, java.net.URL p2, java.util.Map p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/net/URL;", */
/* "I", */
/* "Ljava/net/URL;", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/io/InputStream;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/bumptech/glide/load/HttpException; */
/* } */
} // .end annotation
int v0 = -1; // const/4 v0, -0x1
int v1 = 5; // const/4 v1, 0x5
/* if-ge p2, v1, :cond_7 */
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 14 */
try { // :try_start_0
(( java.net.URL ) p1 ).toURI ( ); // invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;
(( java.net.URL ) p3 ).toURI ( ); // invoke-virtual {p3}, Ljava/net/URL;->toURI()Ljava/net/URI;
p3 = (( java.net.URI ) v1 ).equals ( p3 ); // invoke-virtual {v1, p3}, Ljava/net/URI;->equals(Ljava/lang/Object;)Z
/* if-nez p3, :cond_0 */
/* .line 15 */
} // :cond_0
/* new-instance p3, Lcom/bumptech/glide/load/HttpException; */
final String v1 = "In re-direct loop"; // const-string v1, "In re-direct loop"
/* invoke-direct {p3, v1, v0}, Lcom/bumptech/glide/load/HttpException;-><init>(Ljava/lang/String;I)V */
/* throw p3 */
/* :try_end_0 */
/* .catch Ljava/net/URISyntaxException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 16 */
/* :catch_0 */
} // :cond_1
} // :goto_0
(( e.b.a.y.w.p ) p0 ).a ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Le/b/a/y/w/p;->a(Ljava/net/URL;Ljava/util/Map;)Ljava/net/HttpURLConnection;
this.e = p3;
/* .line 17 */
try { // :try_start_1
(( java.net.HttpURLConnection ) p3 ).connect ( ); // invoke-virtual {p3}, Ljava/net/HttpURLConnection;->connect()V
/* .line 18 */
p3 = this.e;
(( java.net.HttpURLConnection ) p3 ).getInputStream ( ); // invoke-virtual {p3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
this.f = p3;
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 19 */
/* iget-boolean p3, p0, Le/b/a/y/w/p;->g:Z */
if ( p3 != null) { // if-eqz p3, :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 20 */
} // :cond_2
p3 = this.e;
p3 = e.b.a.y.w.p .b ( p3 );
/* .line 21 */
v1 = e.b.a.y.w.p .a ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 22 */
p1 = this.e;
(( e.b.a.y.w.p ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/w/p;->a(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
/* .line 23 */
} // :cond_3
v1 = e.b.a.y.w.p .b ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 24 */
v0 = this.e;
final String v1 = "Location"; // const-string v1, "Location"
(( java.net.HttpURLConnection ) v0 ).getHeaderField ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 25 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_4 */
/* .line 26 */
try { // :try_start_2
/* new-instance v1, Ljava/net/URL; */
/* invoke-direct {v1, p1, v0}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V */
/* :try_end_2 */
/* .catch Ljava/net/MalformedURLException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 27 */
(( e.b.a.y.w.p ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/w/p;->b()V
/* add-int/lit8 p2, p2, 0x1 */
/* .line 28 */
(( e.b.a.y.w.p ) p0 ).a ( v1, p2, p1, p4 ); // invoke-virtual {p0, v1, p2, p1, p4}, Le/b/a/y/w/p;->a(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;
/* :catch_1 */
/* move-exception p1 */
/* .line 29 */
/* new-instance p2, Lcom/bumptech/glide/load/HttpException; */
/* new-instance p4, Ljava/lang/StringBuilder; */
/* invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Bad redirect url: "; // const-string v1, "Bad redirect url: "
(( java.lang.StringBuilder ) p4 ).append ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( v0 ); // invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p4, p3, p1}, Lcom/bumptech/glide/load/HttpException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V */
/* throw p2 */
/* .line 30 */
} // :cond_4
/* new-instance p1, Lcom/bumptech/glide/load/HttpException; */
final String p2 = "Received empty or null redirect url"; // const-string p2, "Received empty or null redirect url"
/* invoke-direct {p1, p2, p3}, Lcom/bumptech/glide/load/HttpException;-><init>(Ljava/lang/String;I)V */
/* throw p1 */
} // :cond_5
/* if-ne p3, v0, :cond_6 */
/* .line 31 */
/* new-instance p1, Lcom/bumptech/glide/load/HttpException; */
/* invoke-direct {p1, p3}, Lcom/bumptech/glide/load/HttpException;-><init>(I)V */
/* throw p1 */
/* .line 32 */
} // :cond_6
try { // :try_start_3
/* new-instance p1, Lcom/bumptech/glide/load/HttpException; */
p2 = this.e;
(( java.net.HttpURLConnection ) p2 ).getResponseMessage ( ); // invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
/* invoke-direct {p1, p2, p3}, Lcom/bumptech/glide/load/HttpException;-><init>(Ljava/lang/String;I)V */
/* throw p1 */
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
/* :catch_2 */
/* move-exception p1 */
/* .line 33 */
/* new-instance p2, Lcom/bumptech/glide/load/HttpException; */
final String p4 = "Failed to get a response message"; // const-string p4, "Failed to get a response message"
/* invoke-direct {p2, p4, p3, p1}, Lcom/bumptech/glide/load/HttpException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V */
/* throw p2 */
/* :catch_3 */
/* move-exception p1 */
/* .line 34 */
/* new-instance p2, Lcom/bumptech/glide/load/HttpException; */
p3 = this.e;
/* .line 35 */
p3 = e.b.a.y.w.p .b ( p3 );
final String p4 = "Failed to connect or obtain data"; // const-string p4, "Failed to connect or obtain data"
/* invoke-direct {p2, p4, p3, p1}, Lcom/bumptech/glide/load/HttpException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V */
/* throw p2 */
/* .line 36 */
} // :cond_7
/* new-instance p1, Lcom/bumptech/glide/load/HttpException; */
final String p2 = "Too many (> 5) redirects!"; // const-string p2, "Too many (> 5) redirects!"
/* invoke-direct {p1, p2, v0}, Lcom/bumptech/glide/load/HttpException;-><init>(Ljava/lang/String;I)V */
/* throw p1 */
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
/* .line 56 */
/* const-class v0, Ljava/io/InputStream; */
} // .end method
public final java.net.HttpURLConnection a ( java.net.URL p0, java.util.Map p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/net/URL;", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/net/HttpURLConnection;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/bumptech/glide/load/HttpException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 37 */
try { // :try_start_0
v1 = this.d;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 38 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 39 */
/* check-cast v2, Ljava/lang/String; */
/* check-cast v1, Ljava/lang/String; */
(( java.net.HttpURLConnection ) p1 ).addRequestProperty ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 40 */
} // :cond_0
/* iget p2, p0, Le/b/a/y/w/p;->c:I */
(( java.net.HttpURLConnection ) p1 ).setConnectTimeout ( p2 ); // invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
/* .line 41 */
/* iget p2, p0, Le/b/a/y/w/p;->c:I */
(( java.net.HttpURLConnection ) p1 ).setReadTimeout ( p2 ); // invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
/* .line 42 */
(( java.net.HttpURLConnection ) p1 ).setUseCaches ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
int p2 = 1; // const/4 p2, 0x1
/* .line 43 */
(( java.net.HttpURLConnection ) p1 ).setDoInput ( p2 ); // invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
/* .line 44 */
(( java.net.HttpURLConnection ) p1 ).setInstanceFollowRedirects ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
/* :catch_0 */
/* move-exception p1 */
/* .line 45 */
/* new-instance p2, Lcom/bumptech/glide/load/HttpException; */
final String v1 = "URL.openConnection threw"; // const-string v1, "URL.openConnection threw"
/* invoke-direct {p2, v1, v0, p1}, Lcom/bumptech/glide/load/HttpException;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V */
/* throw p2 */
} // .end method
public void a ( Object p0, Object p1 ) {
/* .locals 8 */
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
final String p1 = "Finished http url fetcher fetch in "; // const-string p1, "Finished http url fetcher fetch in "
final String v0 = "HttpUrlFetcher"; // const-string v0, "HttpUrlFetcher"
/* .line 1 */
e.b.a.e0.m .a ( );
/* move-result-wide v1 */
int v3 = 2; // const/4 v3, 0x2
/* .line 2 */
try { // :try_start_0
v4 = this.b;
(( e.b.a.y.y.i0 ) v4 ).f ( ); // invoke-virtual {v4}, Le/b/a/y/y/i0;->f()Ljava/net/URL;
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
v7 = this.b;
(( e.b.a.y.y.i0 ) v7 ).c ( ); // invoke-virtual {v7}, Le/b/a/y/y/i0;->c()Ljava/util/Map;
(( e.b.a.y.w.p ) p0 ).a ( v4, v5, v6, v7 ); // invoke-virtual {p0, v4, v5, v6, v7}, Le/b/a/y/w/p;->a(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;
/* .line 3 */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
p2 = android.util.Log .isLoggable ( v0,v3 );
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 5 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* :catchall_0 */
/* move-exception p2 */
/* :catch_0 */
/* move-exception v4 */
int v5 = 3; // const/4 v5, 0x3
/* .line 6 */
try { // :try_start_1
v5 = android.util.Log .isLoggable ( v0,v5 );
if ( v5 != null) { // if-eqz v5, :cond_0
final String v5 = "Failed to load data for url"; // const-string v5, "Failed to load data for url"
/* .line 7 */
android.util.Log .d ( v0,v5,v4 );
/* .line 8 */
} // :cond_0
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 9 */
p2 = android.util.Log .isLoggable ( v0,v3 );
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 10 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
} // :goto_0
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.b.a.e0.m .a ( v1,v2 );
/* move-result-wide v1 */
(( java.lang.StringBuilder ) p2 ).append ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,p1 );
} // :cond_1
return;
/* .line 11 */
} // :goto_1
v3 = android.util.Log .isLoggable ( v0,v3 );
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 12 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.b.a.e0.m .a ( v1,v2 );
/* move-result-wide v1 */
(( java.lang.StringBuilder ) v3 ).append ( v1, v2 ); // invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,p1 );
/* .line 13 */
} // :cond_2
/* throw p2 */
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 5 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
try { // :try_start_0
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* nop */
/* .line 7 */
} // :cond_0
} // :goto_0
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
(( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
this.e = v0;
return;
} // .end method
public e.b.a.y.a c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.y.a.c;
} // .end method
public void cancel ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/b/a/y/w/p;->g:Z */
return;
} // .end method
