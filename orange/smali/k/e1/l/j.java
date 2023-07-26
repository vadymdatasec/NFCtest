public class k.e1.l.j {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final k.e1.l.j a;
	 public static final java.util.logging.Logger b;
	 /* # direct methods */
	 public static k.e1.l.j ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 k.e1.l.j .b ( );
		 /* .line 2 */
		 /* const-class v0, Lk/o0; */
		 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 java.util.logging.Logger .getLogger ( v0 );
		 return;
	 } // .end method
	 public k.e1.l.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.util.List a ( java.util.List p0 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Lk/p0;", */
		 /* ">;)", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/lang/String;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 8 */
	 v1 = 	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
	 v1 = 	 /* .line 9 */
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* .line 10 */
/* check-cast v3, Lk/p0; */
/* .line 11 */
v4 = k.p0.c;
/* if-ne v3, v4, :cond_0 */
/* .line 12 */
} // :cond_0
(( k.p0 ) v3 ).toString ( ); // invoke-virtual {v3}, Lk/p0;->toString()Ljava/lang/String;
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public static k.e1.l.j b ( ) {
/* .locals 1 */
/* .line 1 */
k.e1.l.d .e ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = k.e1.l.j .d ( );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
k.e1.l.e .f ( );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
} // :cond_1
k.e1.l.f .e ( );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
} // :cond_2
k.e1.l.h .e ( );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 6 */
} // :cond_3
/* new-instance v0, Lk/e1/l/j; */
/* invoke-direct {v0}, Lk/e1/l/j;-><init>()V */
} // .end method
public static b ( java.util.List p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lk/p0;", */
/* ">;)[B" */
/* } */
} // .end annotation
/* .line 7 */
/* new-instance v0, Ll/f; */
/* invoke-direct {v0}, Ll/f;-><init>()V */
v1 = /* .line 8 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* .line 9 */
/* check-cast v3, Lk/p0; */
/* .line 10 */
v4 = k.p0.c;
/* if-ne v3, v4, :cond_0 */
/* .line 11 */
} // :cond_0
(( k.p0 ) v3 ).toString ( ); // invoke-virtual {v3}, Lk/p0;->toString()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
(( l.f ) v0 ).writeByte ( v4 ); // invoke-virtual {v0, v4}, Ll/f;->writeByte(I)Ll/f;
/* .line 12 */
(( k.p0 ) v3 ).toString ( ); // invoke-virtual {v3}, Lk/p0;->toString()Ljava/lang/String;
(( l.f ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Ll/f;->a(Ljava/lang/String;)Ll/f;
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 13 */
} // :cond_1
(( l.f ) v0 ).n ( ); // invoke-virtual {v0}, Ll/f;->n()[B
} // .end method
public static k.e1.l.j c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = k.e1.l.j.a;
} // .end method
public static Boolean d ( ) {
/* .locals 2 */
final String v0 = "okhttp.platform"; // const-string v0, "okhttp.platform"
/* .line 1 */
java.lang.System .getProperty ( v0 );
final String v1 = "conscrypt"; // const-string v1, "conscrypt"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
} // :cond_0
java.security.Security .getProviders ( );
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
(( java.security.Provider ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/security/Provider;->getName()Ljava/lang/String;
final String v1 = "Conscrypt"; // const-string v1, "Conscrypt"
/* .line 3 */
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
/* # virtual methods */
public java.lang.Object a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 4 */
v0 = k.e1.l.j.b;
v1 = java.util.logging.Level.FINE;
v0 = (( java.util.logging.Logger ) v0 ).isLoggable ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
/* new-instance v0, Ljava/lang/Throwable; */
/* invoke-direct {v0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public javax.net.ssl.SSLContext a ( ) {
/* .locals 3 */
final String v0 = "java.specification.version"; // const-string v0, "java.specification.version"
/* .line 14 */
java.lang.System .getProperty ( v0 );
final String v1 = "1.7"; // const-string v1, "1.7"
/* .line 15 */
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
try { // :try_start_0
final String v0 = "TLSv1.2"; // const-string v0, "TLSv1.2"
/* .line 16 */
javax.net.ssl.SSLContext .getInstance ( v0 );
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_0
try { // :try_start_1
final String v0 = "TLS"; // const-string v0, "TLS"
/* .line 17 */
javax.net.ssl.SSLContext .getInstance ( v0 );
/* :try_end_1 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
/* .line 18 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
final String v2 = "No TLS provider"; // const-string v2, "No TLS provider"
/* invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public k.e1.n.c a ( javax.net.ssl.X509TrustManager p0 ) {
/* .locals 1 */
/* .line 13 */
/* new-instance v0, Lk/e1/n/a; */
(( k.e1.l.j ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lk/e1/l/j;->b(Ljavax/net/ssl/X509TrustManager;)Lk/e1/n/e;
/* invoke-direct {v0, p1}, Lk/e1/n/a;-><init>(Lk/e1/n/e;)V */
} // .end method
public void a ( Integer p0, java.lang.String p1, java.lang.Throwable p2 ) {
/* .locals 1 */
int v0 = 5; // const/4 v0, 0x5
/* if-ne p1, v0, :cond_0 */
/* .line 2 */
p1 = java.util.logging.Level.WARNING;
} // :cond_0
p1 = java.util.logging.Level.INFO;
/* .line 3 */
} // :goto_0
v0 = k.e1.l.j.b;
(( java.util.logging.Logger ) v0 ).log ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
return;
} // .end method
public void a ( java.lang.String p0, java.lang.Object p1 ) {
/* .locals 1 */
/* if-nez p2, :cond_0 */
/* .line 6 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"; // const-string p1, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);"
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
int v0 = 5; // const/4 v0, 0x5
/* .line 7 */
/* check-cast p2, Ljava/lang/Throwable; */
(( k.e1.l.j ) p0 ).a ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Lk/e1/l/j;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
return;
} // .end method
public void a ( java.net.Socket p0, java.net.InetSocketAddress p1, Integer p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( java.net.Socket ) p1 ).connect ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
return;
} // .end method
public void a ( javax.net.ssl.SSLSocket p0 ) {
/* .locals 0 */
return;
} // .end method
public void a ( javax.net.ssl.SSLSocket p0, java.lang.String p1, java.util.List p2 ) {
/* .locals 0 */
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
return;
} // .end method
public void a ( javax.net.ssl.SSLSocketFactory p0 ) {
/* .locals 0 */
return;
} // .end method
public java.lang.String b ( javax.net.ssl.SSLSocket p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public k.e1.n.e b ( javax.net.ssl.X509TrustManager p0 ) {
/* .locals 1 */
/* .line 14 */
/* new-instance v0, Lk/e1/n/b; */
/* invoke-direct {v0, p1}, Lk/e1/n/b;-><init>([Ljava/security/cert/X509Certificate;)V */
} // .end method
public Boolean b ( java.lang.String p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
} // .end method
