public class k.e1.l.d extends k.e1.l.j {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final k.e1.l.i c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lk/e1/l/i<", */
	 /* "Ljava/net/Socket;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final k.e1.l.i d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lk/e1/l/i<", */
/* "Ljava/net/Socket;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final k.e1.l.i e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lk/e1/l/i<", */
/* "Ljava/net/Socket;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final k.e1.l.i f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lk/e1/l/i<", */
/* "Ljava/net/Socket;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final k.e1.l.c g;
/* # direct methods */
public k.e1.l.d ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Lk/e1/l/i<", */
/* "Ljava/net/Socket;", */
/* ">;", */
/* "Lk/e1/l/i<", */
/* "Ljava/net/Socket;", */
/* ">;", */
/* "Lk/e1/l/i<", */
/* "Ljava/net/Socket;", */
/* ">;", */
/* "Lk/e1/l/i<", */
/* "Ljava/net/Socket;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Lk/e1/l/j;-><init>()V */
/* .line 2 */
k.e1.l.c .a ( );
this.g = p1;
/* .line 3 */
this.c = p2;
/* .line 4 */
this.d = p3;
/* .line 5 */
this.e = p4;
/* .line 6 */
this.f = p5;
return;
} // .end method
public static k.e1.l.j e ( ) {
/* .locals 10 */
/* .line 1 */
/* const-class v0, [B */
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
final String v2 = "com.android.org.conscrypt.SSLParametersImpl"; // const-string v2, "com.android.org.conscrypt.SSLParametersImpl"
java.lang.Class .forName ( v2 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* move-object v4, v2 */
/* :catch_0 */
try { // :try_start_1
final String v2 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"; // const-string v2, "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
/* .line 2 */
java.lang.Class .forName ( v2 );
/* .line 3 */
} // :goto_1
/* new-instance v5, Lk/e1/l/i; */
final String v2 = "setUseSessionTickets"; // const-string v2, "setUseSessionTickets"
int v3 = 1; // const/4 v3, 0x1
/* new-array v6, v3, [Ljava/lang/Class; */
v7 = java.lang.Boolean.TYPE;
int v8 = 0; // const/4 v8, 0x0
/* aput-object v7, v6, v8 */
/* invoke-direct {v5, v1, v2, v6}, Lk/e1/l/i;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V */
/* .line 4 */
/* new-instance v6, Lk/e1/l/i; */
final String v2 = "setHostname"; // const-string v2, "setHostname"
/* new-array v7, v3, [Ljava/lang/Class; */
/* const-class v9, Ljava/lang/String; */
/* aput-object v9, v7, v8 */
/* invoke-direct {v6, v1, v2, v7}, Lk/e1/l/i;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V */
/* .line 5 */
v2 = k.e1.l.d .f ( );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 6 */
/* new-instance v2, Lk/e1/l/i; */
final String v7 = "getAlpnSelectedProtocol"; // const-string v7, "getAlpnSelectedProtocol"
/* new-array v9, v8, [Ljava/lang/Class; */
/* invoke-direct {v2, v0, v7, v9}, Lk/e1/l/i;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V */
/* .line 7 */
/* new-instance v7, Lk/e1/l/i; */
final String v9 = "setAlpnProtocols"; // const-string v9, "setAlpnProtocols"
/* new-array v3, v3, [Ljava/lang/Class; */
/* aput-object v0, v3, v8 */
/* invoke-direct {v7, v1, v9, v3}, Lk/e1/l/i;-><init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)V */
/* move-object v8, v7 */
/* move-object v7, v2 */
} // :cond_0
/* move-object v7, v1 */
/* move-object v8, v7 */
/* .line 8 */
} // :goto_2
/* new-instance v0, Lk/e1/l/d; */
/* move-object v3, v0 */
/* invoke-direct/range {v3 ..v8}, Lk/e1/l/d;-><init>(Ljava/lang/Class;Lk/e1/l/i;Lk/e1/l/i;Lk/e1/l/i;Lk/e1/l/i;)V */
/* :try_end_1 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
} // .end method
public static Boolean f ( ) {
/* .locals 2 */
final String v0 = "GMSCore_OpenSSL"; // const-string v0, "GMSCore_OpenSSL"
/* .line 1 */
java.security.Security .getProvider ( v0 );
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
try { // :try_start_0
final String v0 = "android.net.Network"; // const-string v0, "android.net.Network"
/* .line 2 */
java.lang.Class .forName ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public java.lang.Object a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 22 */
v0 = this.g;
(( k.e1.l.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lk/e1/l/c;->a(Ljava/lang/String;)Ljava/lang/Object;
} // .end method
public javax.net.ssl.SSLContext a ( ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* .line 34 */
try { // :try_start_0
/* const/16 v2, 0x10 */
/* if-lt v1, v2, :cond_0 */
/* :try_end_0 */
/* .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 ..:try_end_0} :catch_0 */
/* const/16 v2, 0x16 */
/* if-ge v1, v2, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* :catch_0 */
/* nop */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
try { // :try_start_1
final String v0 = "TLSv1.2"; // const-string v0, "TLSv1.2"
/* .line 35 */
javax.net.ssl.SSLContext .getInstance ( v0 );
/* :try_end_1 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
} // :cond_1
try { // :try_start_2
final String v0 = "TLS"; // const-string v0, "TLS"
/* .line 36 */
javax.net.ssl.SSLContext .getInstance ( v0 );
/* :try_end_2 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
/* move-exception v0 */
/* .line 37 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
final String v2 = "No TLS provider"; // const-string v2, "No TLS provider"
/* invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public k.e1.n.c a ( javax.net.ssl.X509TrustManager p0 ) {
/* .locals 8 */
/* .line 28 */
/* const-class v0, Ljava/lang/String; */
try { // :try_start_0
final String v1 = "android.net.http.X509TrustManagerExtensions"; // const-string v1, "android.net.http.X509TrustManagerExtensions"
java.lang.Class .forName ( v1 );
int v2 = 1; // const/4 v2, 0x1
/* new-array v3, v2, [Ljava/lang/Class; */
/* .line 29 */
/* const-class v4, Ljavax/net/ssl/X509TrustManager; */
int v5 = 0; // const/4 v5, 0x0
/* aput-object v4, v3, v5 */
(( java.lang.Class ) v1 ).getConstructor ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* new-array v4, v2, [Ljava/lang/Object; */
/* aput-object p1, v4, v5 */
/* .line 30 */
(( java.lang.reflect.Constructor ) v3 ).newInstance ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
final String v4 = "checkServerTrusted"; // const-string v4, "checkServerTrusted"
int v6 = 3; // const/4 v6, 0x3
/* new-array v6, v6, [Ljava/lang/Class; */
/* .line 31 */
/* const-class v7, [Ljava/security/cert/X509Certificate; */
/* aput-object v7, v6, v5 */
/* aput-object v0, v6, v2 */
int v2 = 2; // const/4 v2, 0x2
/* aput-object v0, v6, v2 */
(( java.lang.Class ) v1 ).getMethod ( v4, v6 ); // invoke-virtual {v1, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 32 */
/* new-instance v1, Lk/e1/l/a; */
/* invoke-direct {v1, v3, v0}, Lk/e1/l/a;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 33 */
/* :catch_0 */
/* invoke-super {p0, p1}, Lk/e1/l/j;->a(Ljavax/net/ssl/X509TrustManager;)Lk/e1/n/c; */
} // .end method
public void a ( Integer p0, java.lang.String p1, java.lang.Throwable p2 ) {
/* .locals 5 */
int v0 = 5; // const/4 v0, 0x5
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int v0 = 3; // const/4 v0, 0x3
} // :goto_0
/* const/16 p1, 0xa */
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 17 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
android.util.Log .getStackTraceString ( p3 );
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_1
int p3 = 0; // const/4 p3, 0x0
/* .line 18 */
v1 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
} // :goto_1
/* if-ge p3, v1, :cond_4 */
/* .line 19 */
v2 = (( java.lang.String ) p2 ).indexOf ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Ljava/lang/String;->indexOf(II)I
int v3 = -1; // const/4 v3, -0x1
/* if-eq v2, v3, :cond_2 */
} // :cond_2
/* move v2, v1 */
} // :goto_2
/* add-int/lit16 v3, p3, 0xfa0 */
/* .line 20 */
v3 = java.lang.Math .min ( v2,v3 );
/* .line 21 */
(( java.lang.String ) p2 ).substring ( p3, v3 ); // invoke-virtual {p2, p3, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
final String v4 = "OkHttp"; // const-string v4, "OkHttp"
android.util.Log .println ( v0,v4,p3 );
/* if-lt v3, v2, :cond_3 */
/* add-int/lit8 p3, v3, 0x1 */
} // :cond_3
/* move p3, v3 */
} // :cond_4
return;
} // .end method
public void a ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .line 23 */
v0 = this.g;
p2 = (( k.e1.l.c ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lk/e1/l/c;->a(Ljava/lang/Object;)Z
/* if-nez p2, :cond_0 */
int p2 = 5; // const/4 p2, 0x5
int v0 = 0; // const/4 v0, 0x0
/* .line 24 */
(( k.e1.l.d ) p0 ).a ( p2, p1, v0 ); // invoke-virtual {p0, p2, p1, v0}, Lk/e1/l/d;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
} // :cond_0
return;
} // .end method
public void a ( java.net.Socket p0, java.net.InetSocketAddress p1, Integer p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "Exception in connect"; // const-string v0, "Exception in connect"
/* .line 1 */
try { // :try_start_0
(( java.net.Socket ) p1 ).connect ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
/* :try_end_0 */
/* .catch Ljava/lang/AssertionError; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
/* .line 2 */
/* const/16 p3, 0x1a */
/* if-ne p2, p3, :cond_0 */
/* .line 3 */
/* new-instance p2, Ljava/io/IOException; */
/* invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* .line 4 */
(( java.io.IOException ) p2 ).initCause ( p1 ); // invoke-virtual {p2, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 5 */
/* throw p2 */
/* .line 6 */
} // :cond_0
/* throw p1 */
/* :catch_1 */
/* move-exception p1 */
/* .line 7 */
/* new-instance p2, Ljava/io/IOException; */
/* invoke-direct {p2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* .line 8 */
(( java.io.IOException ) p2 ).initCause ( p1 ); // invoke-virtual {p2, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 9 */
/* throw p2 */
/* :catch_2 */
/* move-exception p1 */
/* .line 10 */
p2 = k.e1.e .a ( p1 );
if ( p2 != null) { // if-eqz p2, :cond_1
/* new-instance p2, Ljava/io/IOException; */
/* invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V */
/* throw p2 */
/* .line 11 */
} // :cond_1
/* throw p1 */
} // .end method
public void a ( javax.net.ssl.SSLSocket p0, java.lang.String p1, java.util.List p2 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljavax/net/ssl/SSLSocket;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List<", */
/* "Lk/p0;", */
/* ">;)V" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 12 */
v2 = this.c;
/* new-array v3, v1, [Ljava/lang/Object; */
java.lang.Boolean .valueOf ( v1 );
/* aput-object v4, v3, v0 */
(( k.e1.l.i ) v2 ).c ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Lk/e1/l/i;->c(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 13 */
v2 = this.d;
/* new-array v3, v1, [Ljava/lang/Object; */
/* aput-object p2, v3, v0 */
(( k.e1.l.i ) v2 ).c ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Lk/e1/l/i;->c(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 14 */
} // :cond_0
p2 = this.f;
if ( p2 != null) { // if-eqz p2, :cond_1
p2 = (( k.e1.l.i ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lk/e1/l/i;->a(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* new-array p2, v1, [Ljava/lang/Object; */
/* .line 15 */
k.e1.l.j .b ( p3 );
/* aput-object p3, p2, v0 */
/* .line 16 */
p3 = this.f;
(( k.e1.l.i ) p3 ).d ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Lk/e1/l/i;->d(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
return;
} // .end method
public final Boolean a ( java.lang.String p0, java.lang.Class p1, java.lang.Object p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Object;", */
/* ")Z" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/reflect/InvocationTargetException;, */
/* Ljava/lang/IllegalAccessException; */
/* } */
} // .end annotation
try { // :try_start_0
final String v0 = "isCleartextTrafficPermitted"; // const-string v0, "isCleartextTrafficPermitted"
int v1 = 0; // const/4 v1, 0x0
/* new-array v2, v1, [Ljava/lang/Class; */
/* .line 25 */
(( java.lang.Class ) p2 ).getMethod ( v0, v2 ); // invoke-virtual {p2, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* new-array v0, v1, [Ljava/lang/Object; */
/* .line 26 */
(( java.lang.reflect.Method ) p2 ).invoke ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p2, Ljava/lang/Boolean; */
p1 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 27 */
/* :catch_0 */
p1 = /* invoke-super {p0, p1}, Lk/e1/l/j;->b(Ljava/lang/String;)Z */
} // .end method
public java.lang.String b ( javax.net.ssl.SSLSocket p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.e;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( k.e1.l.i ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lk/e1/l/i;->a(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 3 */
} // :cond_1
v0 = this.e;
int v2 = 0; // const/4 v2, 0x0
/* new-array v2, v2, [Ljava/lang/Object; */
(( k.e1.l.i ) v0 ).d ( p1, v2 ); // invoke-virtual {v0, p1, v2}, Lk/e1/l/i;->d(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, [B */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 4 */
/* new-instance v1, Ljava/lang/String; */
v0 = k.e1.e.i;
/* invoke-direct {v1, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
} // :cond_2
} // .end method
public k.e1.n.e b ( javax.net.ssl.X509TrustManager p0 ) {
/* .locals 6 */
/* .line 15 */
try { // :try_start_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
final String v1 = "findTrustAnchorByIssuerAndSignature"; // const-string v1, "findTrustAnchorByIssuerAndSignature"
int v2 = 1; // const/4 v2, 0x1
/* new-array v3, v2, [Ljava/lang/Class; */
int v4 = 0; // const/4 v4, 0x0
/* const-class v5, Ljava/security/cert/X509Certificate; */
/* aput-object v5, v3, v4 */
(( java.lang.Class ) v0 ).getDeclaredMethod ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 16 */
(( java.lang.reflect.Method ) v0 ).setAccessible ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
/* .line 17 */
/* new-instance v1, Lk/e1/l/b; */
/* invoke-direct {v1, p1, v0}, Lk/e1/l/b;-><init>(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 18 */
/* :catch_0 */
/* invoke-super {p0, p1}, Lk/e1/l/j;->b(Ljavax/net/ssl/X509TrustManager;)Lk/e1/n/e; */
} // .end method
public Boolean b ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
final String v0 = "android.security.NetworkSecurityPolicy"; // const-string v0, "android.security.NetworkSecurityPolicy"
/* .line 5 */
java.lang.Class .forName ( v0 );
final String v1 = "getInstance"; // const-string v1, "getInstance"
int v2 = 0; // const/4 v2, 0x0
/* new-array v3, v2, [Ljava/lang/Class; */
/* .line 6 */
(( java.lang.Class ) v0 ).getMethod ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
int v3 = 0; // const/4 v3, 0x0
/* new-array v2, v2, [Ljava/lang/Object; */
/* .line 7 */
(( java.lang.reflect.Method ) v1 ).invoke ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 8 */
p1 = (( k.e1.l.d ) p0 ).b ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lk/e1/l/d;->b(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
/* :catch_2 */
/* move-exception p1 */
} // :goto_0
final String v0 = "unable to determine cleartext support"; // const-string v0, "unable to determine cleartext support"
/* .line 9 */
k.e1.e .a ( v0,p1 );
/* throw p1 */
/* .line 10 */
/* :catch_3 */
p1 = /* invoke-super {p0, p1}, Lk/e1/l/j;->b(Ljava/lang/String;)Z */
} // .end method
public final Boolean b ( java.lang.String p0, java.lang.Class p1, java.lang.Object p2 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Object;", */
/* ")Z" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/reflect/InvocationTargetException;, */
/* Ljava/lang/IllegalAccessException; */
/* } */
} // .end annotation
try { // :try_start_0
final String v0 = "isCleartextTrafficPermitted"; // const-string v0, "isCleartextTrafficPermitted"
int v1 = 1; // const/4 v1, 0x1
/* new-array v2, v1, [Ljava/lang/Class; */
/* .line 11 */
/* const-class v3, Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object v3, v2, v4 */
/* .line 12 */
(( java.lang.Class ) p2 ).getMethod ( v0, v2 ); // invoke-virtual {p2, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* new-array v1, v1, [Ljava/lang/Object; */
/* aput-object p1, v1, v4 */
/* .line 13 */
(( java.lang.reflect.Method ) v0 ).invoke ( p3, v1 ); // invoke-virtual {v0, p3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Boolean; */
p1 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 14 */
/* :catch_0 */
p1 = (( k.e1.l.d ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lk/e1/l/d;->a(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Z
} // .end method
