public class m.b.h.g extends m.b.h.c implements m.b.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lm/b/h/c<", */
	 /* "Lm/b/e;", */
	 /* ">;", */
	 /* "Lm/b/e;" */
	 /* } */
} // .end annotation
/* # static fields */
public static javax.net.ssl.SSLSocketFactory k;
public static final java.util.regex.Pattern l;
/* # instance fields */
public java.nio.ByteBuffer e;
public java.lang.String f;
public java.lang.String g;
public Boolean h;
public Integer i;
public m.b.d j;
/* # direct methods */
public static m.b.h.g ( ) {
	 /* .locals 1 */
	 final String v0 = "(application|text)/\\w*\\+?xml.*"; // const-string v0, "(application|text)/\\w*\\+?xml.*"
	 /* .line 1 */
	 java.util.regex.Pattern .compile ( v0 );
	 return;
} // .end method
public m.b.h.g ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, v0}, Lm/b/h/c;-><init>(Lm/b/h/b;)V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput-boolean v0, p0, Lm/b/h/g;->h:Z */
	 /* .line 3 */
	 /* iput v0, p0, Lm/b/h/g;->i:I */
	 return;
} // .end method
public m.b.h.g ( ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* invoke-direct {p0, v0}, Lm/b/h/c;-><init>(Lm/b/h/b;)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput-boolean v0, p0, Lm/b/h/g;->h:Z */
/* .line 6 */
/* iput v0, p0, Lm/b/h/g;->i:I */
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* .line 7 */
	 /* iget v1, p1, Lm/b/h/g;->i:I */
	 int v2 = 1; // const/4 v2, 0x1
	 /* add-int/2addr v1, v2 */
	 /* iput v1, p0, Lm/b/h/g;->i:I */
	 /* const/16 v3, 0x14 */
	 /* if-ge v1, v3, :cond_0 */
	 /* .line 8 */
} // :cond_0
/* new-instance v1, Ljava/io/IOException; */
/* new-array v2, v2, [Ljava/lang/Object; */
(( m.b.h.c ) p1 ).d ( ); // invoke-virtual {p1}, Lm/b/h/c;->d()Ljava/net/URL;
/* aput-object p1, v2, v0 */
final String p1 = "Too many redirects occurred trying to load URL %s"; // const-string p1, "Too many redirects occurred trying to load URL %s"
java.lang.String .format ( p1,v2 );
/* invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // :cond_1
} // :goto_0
return;
} // .end method
public static java.net.HttpURLConnection a ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 53 */
/* if-nez v0, :cond_0 */
/* .line 54 */
(( java.net.URL ) v0 ).openConnection ( ); // invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* .line 55 */
} // :cond_0
(( java.net.URL ) v0 ).openConnection ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
} // :goto_0
/* check-cast v0, Ljava/net/HttpURLConnection; */
/* .line 56 */
(( java.lang.Enum ) v1 ).name ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;
(( java.net.HttpURLConnection ) v0 ).setRequestMethod ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
int v1 = 0; // const/4 v1, 0x0
/* .line 57 */
(( java.net.HttpURLConnection ) v0 ).setInstanceFollowRedirects ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
v1 = /* .line 58 */
(( java.net.HttpURLConnection ) v0 ).setConnectTimeout ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
v1 = /* .line 59 */
(( java.net.HttpURLConnection ) v0 ).setReadTimeout ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
/* .line 60 */
/* instance-of v1, v0, Ljavax/net/ssl/HttpsURLConnection; */
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = /* .line 61 */
/* if-nez v1, :cond_1 */
/* .line 62 */
m.b.h.g .s ( );
/* .line 63 */
/* move-object v1, v0 */
/* check-cast v1, Ljavax/net/ssl/HttpsURLConnection; */
v2 = m.b.h.g.k;
(( javax.net.ssl.HttpsURLConnection ) v1 ).setSSLSocketFactory ( v2 ); // invoke-virtual {v1, v2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
/* .line 64 */
m.b.h.g .r ( );
(( javax.net.ssl.HttpsURLConnection ) v1 ).setHostnameVerifier ( v2 ); // invoke-virtual {v1, v2}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
/* .line 65 */
} // :cond_1
v1 = (( m.b.c ) v1 ).a ( ); // invoke-virtual {v1}, Lm/b/c;->a()Z
if ( v1 != null) { // if-eqz v1, :cond_2
int v1 = 1; // const/4 v1, 0x1
/* .line 66 */
(( java.net.HttpURLConnection ) v0 ).setDoOutput ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
/* .line 67 */
v1 = } // :cond_2
/* if-lez v1, :cond_3 */
/* .line 68 */
m.b.h.g .c ( p0 );
final String v2 = "Cookie"; // const-string v2, "Cookie"
(( java.net.HttpURLConnection ) v0 ).addRequestProperty ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 69 */
} // :cond_3
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_4
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 70 */
/* check-cast v2, Ljava/lang/String; */
/* check-cast v1, Ljava/lang/String; */
(( java.net.HttpURLConnection ) v0 ).addRequestProperty ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
} // :cond_4
} // .end method
public static java.util.LinkedHashMap a ( java.net.HttpURLConnection p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/net/HttpURLConnection;", */
/* ")", */
/* "Ljava/util/LinkedHashMap<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;>;" */
/* } */
} // .end annotation
/* .line 81 */
/* new-instance v0, Ljava/util/LinkedHashMap; */
/* invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
/* .line 82 */
} // :cond_0
} // :goto_0
(( java.net.HttpURLConnection ) p0 ).getHeaderFieldKey ( v1 ); // invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;
/* .line 83 */
(( java.net.HttpURLConnection ) p0 ).getHeaderField ( v1 ); // invoke-virtual {p0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;
/* if-nez v2, :cond_1 */
/* if-nez v3, :cond_1 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* if-nez v3, :cond_2 */
/* .line 84 */
} // :cond_2
v4 = (( java.util.LinkedHashMap ) v0 ).containsKey ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 85 */
(( java.util.LinkedHashMap ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/util/List; */
/* .line 86 */
} // :cond_3
/* new-instance v4, Ljava/util/ArrayList; */
/* invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V */
/* .line 87 */
(( java.util.ArrayList ) v4 ).add ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 88 */
(( java.util.LinkedHashMap ) v0 ).put ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public static m.b.h.g a ( Object p0, Object p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "Location"; // const-string v0, "Location"
final String v1 = "Request must not be null"; // const-string v1, "Request must not be null"
/* .line 1 */
m.b.h.j .a ( p0,v1 );
/* .line 2 */
(( java.net.URL ) v1 ).getProtocol ( ); // invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;
final String v2 = "http"; // const-string v2, "http"
/* .line 3 */
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_1 */
final String v2 = "https"; // const-string v2, "https"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
} // :cond_0
/* new-instance p0, Ljava/net/MalformedURLException; */
final String p1 = "Only http & https protocols supported"; // const-string p1, "Only http & https protocols supported"
/* invoke-direct {p0, p1}, Ljava/net/MalformedURLException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 5 */
} // :cond_1
} // :goto_0
v1 = (( m.b.c ) v1 ).a ( ); // invoke-virtual {v1}, Lm/b/c;->a()Z
/* .line 6 */
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_2
int v2 = 1; // const/4 v2, 0x1
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* if-nez v1, :cond_3 */
/* .line 7 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Cannot set a request body for HTTP method "; // const-string v5, "Cannot set a request body for HTTP method "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
m.b.h.j .a ( v2,v4 );
/* .line 8 */
v4 = } // :cond_3
int v5 = 0; // const/4 v5, 0x0
/* if-lez v4, :cond_5 */
if ( v1 != null) { // if-eqz v1, :cond_4
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 9 */
} // :cond_4
m.b.h.g .d ( p0 );
} // :cond_5
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 10 */
m.b.h.g .e ( p0 );
} // :cond_6
} // :goto_2
/* move-object v1, v5 */
/* .line 11 */
} // :goto_3
m.b.h.g .a ( p0 );
/* .line 12 */
try { // :try_start_0
(( java.net.HttpURLConnection ) v2 ).connect ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V
/* .line 13 */
v4 = (( java.net.HttpURLConnection ) v2 ).getDoOutput ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getDoOutput()Z
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 14 */
(( java.net.HttpURLConnection ) v2 ).getOutputStream ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
m.b.h.g .a ( p0,v4,v1 );
/* .line 15 */
} // :cond_7
v1 = (( java.net.HttpURLConnection ) v2 ).getResponseCode ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
/* .line 16 */
/* new-instance v4, Lm/b/h/g; */
/* invoke-direct {v4, p1}, Lm/b/h/g;-><init>(Lm/b/h/g;)V */
/* .line 17 */
(( m.b.h.g ) v4 ).a ( v2, p1 ); // invoke-virtual {v4, v2, p1}, Lm/b/h/g;->a(Ljava/net/HttpURLConnection;Lm/b/e;)V
/* .line 18 */
this.j = p0;
/* .line 19 */
p1 = (( m.b.h.c ) v4 ).a ( v0 ); // invoke-virtual {v4, v0}, Lm/b/h/c;->a(Ljava/lang/String;)Z
p1 = if ( p1 != null) { // if-eqz p1, :cond_b
if ( p1 != null) { // if-eqz p1, :cond_b
/* const/16 p1, 0x133 */
/* if-eq v1, p1, :cond_8 */
/* .line 20 */
p1 = m.b.c.c;
/* .line 21 */
/* .line 22 */
} // :cond_8
(( m.b.h.c ) v4 ).d ( v0 ); // invoke-virtual {v4, v0}, Lm/b/h/c;->d(Ljava/lang/String;)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_9
final String v0 = "http:/"; // const-string v0, "http:/"
/* .line 23 */
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_9
int v0 = 6; // const/4 v0, 0x6
v1 = (( java.lang.String ) p1 ).charAt ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v3, 0x2f */
/* if-eq v1, v3, :cond_9 */
/* .line 24 */
(( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 25 */
} // :cond_9
m.b.h.i .a ( v0,p1 );
/* .line 26 */
m.b.h.h .a ( p1 );
/* .line 27 */
p1 = this.d;
v0 = } // :goto_4
if ( v0 != null) { // if-eqz v0, :cond_a
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 28 */
/* check-cast v1, Ljava/lang/String; */
/* check-cast v0, Ljava/lang/String; */
/* .line 29 */
} // :cond_a
m.b.h.g .a ( p0,v4 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 30 */
(( java.net.HttpURLConnection ) v2 ).disconnect ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
} // :cond_b
/* const/16 p1, 0xc8 */
/* if-lt v1, p1, :cond_c */
/* const/16 p1, 0x190 */
/* if-lt v1, p1, :cond_d */
/* .line 31 */
} // :cond_c
p1 = try { // :try_start_1
if ( p1 != null) { // if-eqz p1, :cond_16
/* .line 32 */
} // :cond_d
(( m.b.h.g ) v4 ).q ( ); // invoke-virtual {v4}, Lm/b/h/g;->q()Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_f
v0 = /* .line 33 */
/* if-nez v0, :cond_f */
final String v0 = "text/"; // const-string v0, "text/"
/* .line 34 */
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_f */
v0 = m.b.h.g.l;
/* .line 35 */
(( java.util.regex.Pattern ) v0 ).matcher ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).matches ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
if ( v0 != null) { // if-eqz v0, :cond_e
/* .line 36 */
} // :cond_e
/* new-instance v0, Lorg/jsoup/UnsupportedMimeTypeException; */
final String v1 = "Unhandled content type.Must be text/*, application/xml, or application/xhtml+xml"; // const-string v1, "Unhandled content type.Must be text/*, application/xml, or application/xhtml+xml"
/* .line 37 */
(( java.net.URL ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/net/URL;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, p1, p0}, Lorg/jsoup/UnsupportedMimeTypeException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* throw v0 */
} // :cond_f
} // :goto_5
if ( p1 != null) { // if-eqz p1, :cond_10
/* .line 38 */
v0 = m.b.h.g.l;
(( java.util.regex.Pattern ) v0 ).matcher ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
p1 = (( java.util.regex.Matcher ) p1 ).matches ( ); // invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z
if ( p1 != null) { // if-eqz p1, :cond_10
/* .line 39 */
/* instance-of p1, p0, Lm/b/h/d; */
if ( p1 != null) { // if-eqz p1, :cond_10
/* move-object p1, p0 */
/* check-cast p1, Lm/b/h/d; */
p1 = m.b.h.d .a ( p1 );
/* if-nez p1, :cond_10 */
/* .line 40 */
m.b.j.f0 .c ( );
/* .line 41 */
} // :cond_10
p1 = this.g;
m.b.h.a .a ( p1 );
this.f = p1;
/* .line 42 */
p1 = (( java.net.HttpURLConnection ) v2 ).getContentLength ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentLength()I
if ( p1 != null) { // if-eqz p1, :cond_14
v0 = m.b.c.h;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* if-eq p1, v0, :cond_14 */
/* .line 43 */
try { // :try_start_2
(( java.net.HttpURLConnection ) v2 ).getErrorStream ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;
if ( p1 != null) { // if-eqz p1, :cond_11
(( java.net.HttpURLConnection ) v2 ).getErrorStream ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;
} // :cond_11
(( java.net.HttpURLConnection ) v2 ).getInputStream ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
} // :goto_6
/* move-object v5, p1 */
final String p1 = "Content-Encoding"; // const-string p1, "Content-Encoding"
final String v0 = "gzip"; // const-string v0, "gzip"
/* .line 44 */
p1 = (( m.b.h.c ) v4 ).c ( p1, v0 ); // invoke-virtual {v4, p1, v0}, Lm/b/h/c;->c(Ljava/lang/String;Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_12
/* .line 45 */
/* new-instance p1, Ljava/util/zip/GZIPInputStream; */
/* invoke-direct {p1, v5}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V */
/* move-object v5, p1 */
/* .line 46 */
p0 = } // :cond_12
m.b.h.a .a ( v5,p0 );
this.e = p0;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
if ( v5 != null) { // if-eqz v5, :cond_15
/* .line 47 */
try { // :try_start_3
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :catchall_0 */
/* move-exception p0 */
if ( v5 != null) { // if-eqz v5, :cond_13
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
} // :cond_13
/* throw p0 */
/* .line 48 */
} // :cond_14
m.b.h.a .a ( );
this.e = p0;
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* .line 49 */
} // :cond_15
} // :goto_7
(( java.net.HttpURLConnection ) v2 ).disconnect ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
/* .line 50 */
/* iput-boolean v3, v4, Lm/b/h/g;->h:Z */
/* .line 51 */
} // :cond_16
try { // :try_start_4
/* new-instance p1, Lorg/jsoup/HttpStatusException; */
final String v0 = "HTTP error fetching URL"; // const-string v0, "HTTP error fetching URL"
(( java.net.URL ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/net/URL;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0, v1, p0}, Lorg/jsoup/HttpStatusException;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* throw p1 */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* :catchall_1 */
/* move-exception p0 */
/* .line 52 */
(( java.net.HttpURLConnection ) v2 ).disconnect ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
/* throw p0 */
} // .end method
public static void a ( Object p0, java.io.OutputStream p1, java.lang.String p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 108 */
/* .line 109 */
/* new-instance v1, Ljava/io/BufferedWriter; */
/* new-instance v2, Ljava/io/OutputStreamWriter; */
/* invoke-direct {v2, p1, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V */
/* invoke-direct {v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 110 */
v0 = } // :goto_0
final String v2 = "--"; // const-string v2, "--"
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lm/b/b; */
/* .line 111 */
(( java.io.BufferedWriter ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 112 */
(( java.io.BufferedWriter ) v1 ).write ( p2 ); // invoke-virtual {v1, p2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
final String v2 = "\r\n"; // const-string v2, "\r\n"
/* .line 113 */
(( java.io.BufferedWriter ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
final String v3 = "Content-Disposition: form-data; name=\""; // const-string v3, "Content-Disposition: form-data; name=\""
/* .line 114 */
(( java.io.BufferedWriter ) v1 ).write ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 115 */
m.b.h.h .d ( v3 );
(( java.io.BufferedWriter ) v1 ).write ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
final String v3 = "\""; // const-string v3, "\""
/* .line 116 */
(( java.io.BufferedWriter ) v1 ).write ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
v3 = /* .line 117 */
if ( v3 != null) { // if-eqz v3, :cond_0
final String v3 = "; filename=\""; // const-string v3, "; filename=\""
/* .line 118 */
(( java.io.BufferedWriter ) v1 ).write ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 119 */
m.b.h.h .d ( v3 );
(( java.io.BufferedWriter ) v1 ).write ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
final String v3 = "\"\r\nContent-Type: application/octet-stream\r\n\r\n"; // const-string v3, "\"\r\nContent-Type: application/octet-stream\r\n\r\n"
/* .line 120 */
(( java.io.BufferedWriter ) v1 ).write ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 121 */
(( java.io.BufferedWriter ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->flush()V
/* .line 122 */
m.b.h.a .a ( v0,p1 );
/* .line 123 */
(( java.io.OutputStream ) p1 ).flush ( ); // invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
} // :cond_0
final String v3 = "\r\n\r\n"; // const-string v3, "\r\n\r\n"
/* .line 124 */
(( java.io.BufferedWriter ) v1 ).write ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 125 */
(( java.io.BufferedWriter ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 126 */
} // :goto_1
(( java.io.BufferedWriter ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 127 */
} // :cond_1
(( java.io.BufferedWriter ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 128 */
(( java.io.BufferedWriter ) v1 ).write ( p2 ); // invoke-virtual {v1, p2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 129 */
(( java.io.BufferedWriter ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 130 */
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 131 */
(( java.io.BufferedWriter ) v1 ).write ( p0 ); // invoke-virtual {v1, p0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
} // :cond_3
int p1 = 1; // const/4 p1, 0x1
/* .line 132 */
v0 = } // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_5
/* check-cast v0, Lm/b/b; */
/* if-nez p1, :cond_4 */
/* const/16 v2, 0x26 */
/* .line 133 */
(( java.io.BufferedWriter ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->append(C)Ljava/io/Writer;
} // :cond_4
int p1 = 0; // const/4 p1, 0x0
/* .line 134 */
} // :goto_3
java.net.URLEncoder .encode ( v2,v3 );
(( java.io.BufferedWriter ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* const/16 v2, 0x3d */
/* .line 135 */
(( java.io.BufferedWriter ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/BufferedWriter;->write(I)V
/* .line 136 */
java.net.URLEncoder .encode ( v0,v2 );
(( java.io.BufferedWriter ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V
/* .line 137 */
} // :cond_5
} // :goto_4
(( java.io.BufferedWriter ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedWriter;->close()V
return;
} // .end method
public static m.b.h.g b ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
m.b.h.g .a ( p0,v0 );
} // .end method
public static java.lang.String c ( Object p0 ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 2 */
int v1 = 1; // const/4 v1, 0x1
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/util/Map$Entry; */
/* if-nez v1, :cond_0 */
final String v3 = "; "; // const-string v3, "; "
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_1
/* check-cast v3, Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v3, 0x3d */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* check-cast v2, Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
} // :cond_1
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static void d ( Object p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 3 */
(( java.net.URL ) v0 ).getProtocol ( ); // invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "://"; // const-string v2, "://"
/* .line 4 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
(( java.net.URL ) v0 ).getAuthority ( ); // invoke-virtual {v0}, Ljava/net/URL;->getAuthority()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
(( java.net.URL ) v0 ).getPath ( ); // invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "?"; // const-string v2, "?"
/* .line 7 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 8 */
(( java.net.URL ) v0 ).getQuery ( ); // invoke-virtual {v0}, Ljava/net/URL;->getQuery()Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 9 */
(( java.net.URL ) v0 ).getQuery ( ); // invoke-virtual {v0}, Ljava/net/URL;->getQuery()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 10 */
} // :goto_0
v4 = } // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_2
/* check-cast v4, Lm/b/b; */
v5 = /* .line 11 */
final String v6 = "InputStream data not supported in URL query string."; // const-string v6, "InputStream data not supported in URL query string."
m.b.h.j .a ( v5,v6 );
/* if-nez v0, :cond_1 */
/* const/16 v5, 0x26 */
/* .line 12 */
(( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 13 */
} // :goto_2
final String v6 = "UTF-8"; // const-string v6, "UTF-8"
java.net.URLEncoder .encode ( v5,v6 );
(( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v5, 0x3d */
/* .line 14 */
(( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 15 */
java.net.URLEncoder .encode ( v4,v6 );
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 16 */
} // :cond_2
/* new-instance v0, Ljava/net/URL; */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 17 */
return;
} // .end method
public static java.lang.String e ( Object p0 ) {
/* .locals 4 */
final String v0 = "Content-Type"; // const-string v0, "Content-Type"
v1 = /* .line 1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
} // :cond_0
v1 = m.b.h.h .a ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
m.b.h.a .b ( );
/* .line 4 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "multipart/form-data; boundary="; // const-string v3, "multipart/form-data; boundary="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 5 */
} // :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "application/x-www-form-urlencoded; charset="; // const-string v2, "application/x-www-form-urlencoded; charset="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
} // .end method
public static javax.net.ssl.HostnameVerifier r ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lm/b/h/e; */
/* invoke-direct {v0}, Lm/b/h/e;-><init>()V */
} // .end method
public static synchronized void s ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-class v0, Lm/b/h/g; */
/* monitor-enter v0 */
/* .line 1 */
try { // :try_start_0
v1 = m.b.h.g.k;
/* if-nez v1, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljavax/net/ssl/TrustManager; */
int v2 = 0; // const/4 v2, 0x0
/* .line 2 */
/* new-instance v3, Lm/b/h/f; */
/* invoke-direct {v3}, Lm/b/h/f;-><init>()V */
/* aput-object v3, v1, v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
try { // :try_start_1
final String v2 = "SSL"; // const-string v2, "SSL"
/* .line 3 */
javax.net.ssl.SSLContext .getInstance ( v2 );
int v3 = 0; // const/4 v3, 0x0
/* .line 4 */
/* new-instance v4, Ljava/security/SecureRandom; */
/* invoke-direct {v4}, Ljava/security/SecureRandom;-><init>()V */
(( javax.net.ssl.SSLContext ) v2 ).init ( v3, v1, v4 ); // invoke-virtual {v2, v3, v1, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
/* .line 5 */
(( javax.net.ssl.SSLContext ) v2 ).getSocketFactory ( ); // invoke-virtual {v2}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
/* :try_end_1 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/security/KeyManagementException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 6 */
/* :catch_0 */
try { // :try_start_2
/* new-instance v1, Ljava/io/IOException; */
final String v2 = "Can\'t create unsecure trust manager"; // const-string v2, "Can\'t create unsecure trust manager"
/* invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 7 */
/* :catch_1 */
/* new-instance v1, Ljava/io/IOException; */
final String v2 = "Can\'t create unsecure trust manager"; // const-string v2, "Can\'t create unsecure trust manager"
/* invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 8 */
} // :cond_0
} // :goto_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* throw v1 */
} // .end method
/* # virtual methods */
public final void a ( java.net.HttpURLConnection p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 71 */
(( java.net.HttpURLConnection ) p1 ).getRequestMethod ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;
m.b.c .valueOf ( v0 );
this.b = v0;
/* .line 72 */
(( java.net.HttpURLConnection ) p1 ).getURL ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;
this.a = v0;
/* .line 73 */
(( java.net.HttpURLConnection ) p1 ).getResponseCode ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I
/* .line 74 */
(( java.net.HttpURLConnection ) p1 ).getResponseMessage ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
/* .line 75 */
(( java.net.HttpURLConnection ) p1 ).getContentType ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;
this.g = v0;
/* .line 76 */
m.b.h.g .a ( p1 );
/* .line 77 */
(( m.b.h.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/g;->a(Ljava/util/Map;)V
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 78 */
} // :cond_0
p2 = } // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* check-cast p2, Ljava/util/Map$Entry; */
/* .line 79 */
/* check-cast v0, Ljava/lang/String; */
v0 = (( m.b.h.c ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lm/b/h/c;->c(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
/* .line 80 */
/* check-cast v0, Ljava/lang/String; */
/* check-cast p2, Ljava/lang/String; */
(( m.b.h.c ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lm/b/h/c;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/a;
} // :cond_1
return;
} // .end method
public void a ( java.util.Map p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;>;)V" */
/* } */
} // .end annotation
/* .line 89 */
} // :cond_0
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_8
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 90 */
/* check-cast v1, Ljava/lang/String; */
/* if-nez v1, :cond_1 */
/* .line 91 */
} // :cond_1
/* check-cast v0, Ljava/util/List; */
final String v2 = "Set-Cookie"; // const-string v2, "Set-Cookie"
/* .line 92 */
v2 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 93 */
} // :cond_2
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/lang/String; */
/* if-nez v1, :cond_3 */
/* .line 94 */
} // :cond_3
/* new-instance v2, Lm/b/j/r0; */
/* invoke-direct {v2, v1}, Lm/b/j/r0;-><init>(Ljava/lang/String;)V */
final String v1 = "="; // const-string v1, "="
/* .line 95 */
(( m.b.j.r0 ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lm/b/j/r0;->a(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v3 = ";"; // const-string v3, ";"
/* .line 96 */
(( m.b.j.r0 ) v2 ).c ( v3 ); // invoke-virtual {v2, v3}, Lm/b/j/r0;->c(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.String ) v2 ).trim ( ); // invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 97 */
v3 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-lez v3, :cond_2 */
/* .line 98 */
(( m.b.h.c ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lm/b/h/c;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/a;
/* .line 99 */
v2 = } // :cond_4
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
/* if-ne v2, v4, :cond_5 */
/* .line 100 */
/* check-cast v0, Ljava/lang/String; */
(( m.b.h.c ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lm/b/h/c;->b(Ljava/lang/String;Ljava/lang/String;)Lm/b/a;
/* .line 101 */
v2 = } // :cond_5
/* if-le v2, v4, :cond_0 */
/* .line 102 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 103 */
v4 = } // :goto_2
/* if-ge v3, v4, :cond_7 */
/* .line 104 */
/* check-cast v4, Ljava/lang/String; */
if ( v3 != null) { // if-eqz v3, :cond_6
final String v5 = ", "; // const-string v5, ", "
/* .line 105 */
(( java.lang.StringBuilder ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 106 */
} // :cond_6
(( java.lang.StringBuilder ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 107 */
} // :cond_7
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( m.b.h.c ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lm/b/h/c;->b(Ljava/lang/String;Ljava/lang/String;)Lm/b/a;
/* goto/16 :goto_0 */
} // :cond_8
return;
} // .end method
public m.b.i.i j ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Lm/b/h/g;->h:Z */
final String v1 = "Request must be executed (with .execute(), .get(), or .post() before parsing response"; // const-string v1, "Request must be executed (with .execute(), .get(), or .post() before parsing response"
m.b.h.j .b ( v0,v1 );
/* .line 2 */
v0 = this.e;
v1 = this.f;
v2 = this.a;
(( java.net.URL ) v2 ).toExternalForm ( ); // invoke-virtual {v2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;
v3 = this.j;
m.b.h.a .a ( v0,v1,v2,v3 );
/* .line 3 */
v1 = this.e;
(( java.nio.ByteBuffer ) v1 ).rewind ( ); // invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
/* .line 4 */
(( m.b.i.i ) v0 ).E ( ); // invoke-virtual {v0}, Lm/b/i/i;->E()Lm/b/i/g;
(( m.b.i.g ) v1 ).a ( ); // invoke-virtual {v1}, Lm/b/i/g;->a()Ljava/nio/charset/Charset;
(( java.nio.charset.Charset ) v1 ).name ( ); // invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
this.f = v1;
} // .end method
public java.lang.String q ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
} // .end method
