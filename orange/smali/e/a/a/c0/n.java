public abstract class e.a.a.c0.n extends e.a.a.c0.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.a.a.c0.m a;
	 public final javax.net.ssl.SSLSocketFactory b;
	 /* # direct methods */
	 public e.a.a.c0.n ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Le/a/a/c0/n;-><init>(Le/a/a/c0/m;)V */
		 return;
	 } // .end method
	 public e.a.a.c0.n ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, v0}, Le/a/a/c0/n;-><init>(Le/a/a/c0/m;Ljavax/net/ssl/SSLSocketFactory;)V */
		 return;
	 } // .end method
	 public e.a.a.c0.n ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Le/a/a/c0/a;-><init>()V */
		 /* .line 4 */
		 this.a = p1;
		 /* .line 5 */
		 this.b = p2;
		 return;
	 } // .end method
	 public static java.io.InputStream a ( java.net.HttpURLConnection p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 e.a.a.c0.n .b ( p0 );
	 } // .end method
	 public static java.util.List a ( java.util.Map p0 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/Map<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/lang/String;", */
		 /* ">;>;)", */
		 /* "Ljava/util/List<", */
		 /* "Le/a/a/i;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 24 */
	 v1 = 	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
	 /* .line 25 */
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* check-cast v1, Ljava/util/Map$Entry; */
	 /* .line 26 */
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* .line 27 */
		 /* check-cast v2, Ljava/util/List; */
	 v3 = 	 } // :goto_0
	 if ( v3 != null) { // if-eqz v3, :cond_0
		 /* check-cast v3, Ljava/lang/String; */
		 /* .line 28 */
		 /* new-instance v4, Le/a/a/i; */
		 /* check-cast v5, Ljava/lang/String; */
		 /* invoke-direct {v4, v5, v3}, Le/a/a/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 } // :cond_1
} // .end method
public static Boolean a ( Integer p0, Integer p1 ) {
	 /* .locals 1 */
	 int v0 = 4; // const/4 v0, 0x4
	 /* if-eq p0, v0, :cond_1 */
	 /* const/16 p0, 0x64 */
	 /* if-gt p0, p1, :cond_0 */
	 /* const/16 p0, 0xc8 */
	 /* if-lt p1, p0, :cond_1 */
} // :cond_0
/* const/16 p0, 0xcc */
/* if-eq p1, p0, :cond_1 */
/* const/16 p0, 0x130 */
/* if-eq p1, p0, :cond_1 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static java.io.InputStream b ( java.net.HttpURLConnection p0 ) {
/* .locals 0 */
/* .line 1 */
try { // :try_start_0
(( java.net.HttpURLConnection ) p0 ).getInputStream ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 2 */
/* :catch_0 */
(( java.net.HttpURLConnection ) p0 ).getErrorStream ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;
} // :goto_0
} // .end method
/* # virtual methods */
public e.a.a.c0.k a ( Object p0, java.util.Map p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Le/a/a/c0/k;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lcom/android/volley/AuthFailureError; */
/* } */
} // .end annotation
/* .line 2 */
(( e.a.a.p ) p1 ).p ( ); // invoke-virtual {p1}, Le/a/a/p;->p()Ljava/lang/String;
/* .line 3 */
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
/* .line 4 */
(( java.util.HashMap ) v1 ).putAll ( p2 ); // invoke-virtual {v1, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
/* .line 5 */
(( e.a.a.p ) p1 ).e ( ); // invoke-virtual {p1}, Le/a/a/p;->e()Ljava/util/Map;
(( java.util.HashMap ) v1 ).putAll ( p2 ); // invoke-virtual {v1, p2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
/* .line 6 */
p2 = this.a;
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 7 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* move-object v0, p2 */
/* .line 8 */
} // :cond_0
/* new-instance p1, Ljava/io/IOException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "URL blocked by rewriter: "; // const-string v1, "URL blocked by rewriter: "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 9 */
} // :cond_1
} // :goto_0
/* new-instance p2, Ljava/net/URL; */
/* invoke-direct {p2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 10 */
(( e.a.a.c0.n ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/a/a/c0/n;->a(Ljava/net/URL;Le/a/a/p;)Ljava/net/HttpURLConnection;
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
try { // :try_start_0
(( java.util.HashMap ) v1 ).keySet ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v3, Ljava/lang/String; */
/* .line 12 */
(( java.util.HashMap ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/String; */
(( java.net.HttpURLConnection ) p2 ).setRequestProperty ( v3, v4 ); // invoke-virtual {p2, v3, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 13 */
} // :cond_2
(( e.a.a.c0.n ) p0 ).b ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/a/a/c0/n;->b(Ljava/net/HttpURLConnection;Le/a/a/p;)V
/* .line 14 */
v1 = (( java.net.HttpURLConnection ) p2 ).getResponseCode ( ); // invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getResponseCode()I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_4 */
/* .line 15 */
v2 = (( e.a.a.p ) p1 ).f ( ); // invoke-virtual {p1}, Le/a/a/p;->f()I
v2 = e.a.a.c0.n .a ( v2,v1 );
/* if-nez v2, :cond_3 */
/* .line 16 */
/* new-instance p1, Le/a/a/c0/k; */
(( java.net.HttpURLConnection ) p2 ).getHeaderFields ( ); // invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;
e.a.a.c0.n .a ( v2 );
/* invoke-direct {p1, v1, v2}, Le/a/a/c0/k;-><init>(ILjava/util/List;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 17 */
(( java.net.HttpURLConnection ) p2 ).disconnect ( ); // invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
/* .line 18 */
try { // :try_start_1
/* new-instance v2, Le/a/a/c0/k; */
/* .line 19 */
(( java.net.HttpURLConnection ) p2 ).getHeaderFields ( ); // invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;
e.a.a.c0.n .a ( v3 );
/* .line 20 */
v4 = (( java.net.HttpURLConnection ) p2 ).getContentLength ( ); // invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getContentLength()I
/* .line 21 */
(( e.a.a.c0.n ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/a/a/c0/n;->a(Le/a/a/p;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
/* invoke-direct {v2, v1, v3, v4, p1}, Le/a/a/c0/k;-><init>(ILjava/util/List;ILjava/io/InputStream;)V */
/* .line 22 */
} // :cond_4
/* new-instance p1, Ljava/io/IOException; */
final String v1 = "Could not retrieve response code from HttpUrlConnection."; // const-string v1, "Could not retrieve response code from HttpUrlConnection."
/* invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception p1 */
/* if-nez v0, :cond_5 */
/* .line 23 */
(( java.net.HttpURLConnection ) p2 ).disconnect ( ); // invoke-virtual {p2}, Ljava/net/HttpURLConnection;->disconnect()V
} // :cond_5
/* throw p1 */
} // .end method
public java.io.InputStream a ( Object p0, java.net.HttpURLConnection p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;", */
/* "Ljava/net/HttpURLConnection;", */
/* ")", */
/* "Ljava/io/InputStream;" */
/* } */
} // .end annotation
/* .line 29 */
/* new-instance p1, Le/a/a/c0/l; */
/* invoke-direct {p1, p2}, Le/a/a/c0/l;-><init>(Ljava/net/HttpURLConnection;)V */
} // .end method
public java.io.OutputStream a ( Object p0, java.net.HttpURLConnection p1, Integer p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;", */
/* "Ljava/net/HttpURLConnection;", */
/* "I)", */
/* "Ljava/io/OutputStream;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 50 */
(( java.net.HttpURLConnection ) p2 ).getOutputStream ( ); // invoke-virtual {p2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
} // .end method
public java.net.HttpURLConnection a ( java.net.URL p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 30 */
(( java.net.URL ) p1 ).openConnection ( ); // invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* check-cast p1, Ljava/net/HttpURLConnection; */
/* .line 31 */
v0 = java.net.HttpURLConnection .getFollowRedirects ( );
(( java.net.HttpURLConnection ) p1 ).setInstanceFollowRedirects ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
} // .end method
public final java.net.HttpURLConnection a ( java.net.URL p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/net/URL;", */
/* "Le/a/a/p<", */
/* "*>;)", */
/* "Ljava/net/HttpURLConnection;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 32 */
(( e.a.a.c0.n ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/n;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
/* .line 33 */
p2 = (( e.a.a.p ) p2 ).n ( ); // invoke-virtual {p2}, Le/a/a/p;->n()I
/* .line 34 */
(( java.net.HttpURLConnection ) v0 ).setConnectTimeout ( p2 ); // invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
/* .line 35 */
(( java.net.HttpURLConnection ) v0 ).setReadTimeout ( p2 ); // invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
int p2 = 0; // const/4 p2, 0x0
/* .line 36 */
(( java.net.HttpURLConnection ) v0 ).setUseCaches ( p2 ); // invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V
int p2 = 1; // const/4 p2, 0x1
/* .line 37 */
(( java.net.HttpURLConnection ) v0 ).setDoInput ( p2 ); // invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
/* .line 38 */
(( java.net.URL ) p1 ).getProtocol ( ); // invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;
final String p2 = "https"; // const-string p2, "https"
p1 = (( java.lang.String ) p2 ).equals ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 39 */
/* move-object p2, v0 */
/* check-cast p2, Ljavax/net/ssl/HttpsURLConnection; */
(( javax.net.ssl.HttpsURLConnection ) p2 ).setSSLSocketFactory ( p1 ); // invoke-virtual {p2, p1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
} // :cond_0
} // .end method
public final void a ( java.net.HttpURLConnection p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/net/HttpURLConnection;", */
/* "Le/a/a/p<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lcom/android/volley/AuthFailureError; */
/* } */
} // .end annotation
/* .line 40 */
(( e.a.a.p ) p2 ).a ( ); // invoke-virtual {p2}, Le/a/a/p;->a()[B
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 41 */
(( e.a.a.c0.n ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/a/a/c0/n;->a(Ljava/net/HttpURLConnection;Le/a/a/p;[B)V
} // :cond_0
return;
} // .end method
public final void a ( java.net.HttpURLConnection p0, Object p1, Object[] p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/net/HttpURLConnection;", */
/* "Le/a/a/p<", */
/* "*>;[B)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 42 */
(( java.net.HttpURLConnection ) p1 ).setDoOutput ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
/* .line 43 */
(( java.net.HttpURLConnection ) p1 ).getRequestProperties ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getRequestProperties()Ljava/util/Map;
v0 = final String v1 = "Content-Type"; // const-string v1, "Content-Type"
/* if-nez v0, :cond_0 */
/* .line 44 */
(( e.a.a.p ) p2 ).b ( ); // invoke-virtual {p2}, Le/a/a/p;->b()Ljava/lang/String;
/* .line 45 */
(( java.net.HttpURLConnection ) p1 ).setRequestProperty ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 46 */
} // :cond_0
/* new-instance v0, Ljava/io/DataOutputStream; */
/* array-length v1, p3 */
/* .line 47 */
(( e.a.a.c0.n ) p0 ).a ( p2, p1, v1 ); // invoke-virtual {p0, p2, p1, v1}, Le/a/a/c0/n;->a(Le/a/a/p;Ljava/net/HttpURLConnection;I)Ljava/io/OutputStream;
/* invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 48 */
(( java.io.DataOutputStream ) v0 ).write ( p3 ); // invoke-virtual {v0, p3}, Ljava/io/DataOutputStream;->write([B)V
/* .line 49 */
(( java.io.DataOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
return;
} // .end method
public void b ( java.net.HttpURLConnection p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/net/HttpURLConnection;", */
/* "Le/a/a/p<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Lcom/android/volley/AuthFailureError; */
/* } */
} // .end annotation
/* .line 3 */
v0 = (( e.a.a.p ) p2 ).f ( ); // invoke-virtual {p2}, Le/a/a/p;->f()I
final String v1 = "POST"; // const-string v1, "POST"
/* packed-switch v0, :pswitch_data_0 */
/* .line 4 */
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Unknown method type."; // const-string p2, "Unknown method type."
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :pswitch_0 */
final String v0 = "PATCH"; // const-string v0, "PATCH"
/* .line 5 */
(( java.net.HttpURLConnection ) p1 ).setRequestMethod ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 6 */
(( e.a.a.c0.n ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/a/a/c0/n;->a(Ljava/net/HttpURLConnection;Le/a/a/p;)V
/* :pswitch_1 */
final String p2 = "TRACE"; // const-string p2, "TRACE"
/* .line 7 */
(( java.net.HttpURLConnection ) p1 ).setRequestMethod ( p2 ); // invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* :pswitch_2 */
final String p2 = "OPTIONS"; // const-string p2, "OPTIONS"
/* .line 8 */
(( java.net.HttpURLConnection ) p1 ).setRequestMethod ( p2 ); // invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* :pswitch_3 */
final String p2 = "HEAD"; // const-string p2, "HEAD"
/* .line 9 */
(( java.net.HttpURLConnection ) p1 ).setRequestMethod ( p2 ); // invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* :pswitch_4 */
final String p2 = "DELETE"; // const-string p2, "DELETE"
/* .line 10 */
(( java.net.HttpURLConnection ) p1 ).setRequestMethod ( p2 ); // invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* :pswitch_5 */
final String v0 = "PUT"; // const-string v0, "PUT"
/* .line 11 */
(( java.net.HttpURLConnection ) p1 ).setRequestMethod ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 12 */
(( e.a.a.c0.n ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/a/a/c0/n;->a(Ljava/net/HttpURLConnection;Le/a/a/p;)V
/* .line 13 */
/* :pswitch_6 */
(( java.net.HttpURLConnection ) p1 ).setRequestMethod ( v1 ); // invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 14 */
(( e.a.a.c0.n ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/a/a/c0/n;->a(Ljava/net/HttpURLConnection;Le/a/a/p;)V
/* :pswitch_7 */
final String p2 = "GET"; // const-string p2, "GET"
/* .line 15 */
(( java.net.HttpURLConnection ) p1 ).setRequestMethod ( p2 ); // invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 16 */
/* :pswitch_8 */
(( e.a.a.p ) p2 ).i ( ); // invoke-virtual {p2}, Le/a/a/p;->i()[B
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 17 */
(( java.net.HttpURLConnection ) p1 ).setRequestMethod ( v1 ); // invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 18 */
(( e.a.a.c0.n ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/a/a/c0/n;->a(Ljava/net/HttpURLConnection;Le/a/a/p;[B)V
} // :cond_0
} // :goto_0
return;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch -0x1 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
