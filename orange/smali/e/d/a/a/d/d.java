public class e.d.a.a.d.d implements javax.net.ssl.X509TrustManager {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.net.http.X509TrustManagerExtensions a;
	 public final java.lang.String b;
	 public final e.d.a.a.c.b c;
	 /* # direct methods */
	 public e.d.a.a.d.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 this.c = p2;
		 /* .line 4 */
		 /* const/16 p2, 0x11 */
		 /* if-ge p1, p2, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 5 */
		 this.a = p1;
		 /* .line 6 */
	 } // :cond_0
	 /* new-instance p1, Landroid/net/http/X509TrustManagerExtensions; */
	 /* invoke-direct {p1, p3}, Landroid/net/http/X509TrustManagerExtensions;-><init>(Ljavax/net/ssl/X509TrustManager;)V */
	 this.a = p1;
} // :goto_0
return;
} // .end method
public static Boolean a ( java.util.List p0, java.util.Set p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Ljava/security/cert/X509Certificate;", */
/* ">;", */
/* "Ljava/util/Set<", */
/* "Le/d/a/a/c/e;", */
/* ">;)Z" */
/* } */
} // .end annotation
/* .line 1 */
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Ljava/security/cert/Certificate; */
/* .line 2 */
/* new-instance v1, Le/d/a/a/c/e; */
/* invoke-direct {v1, v0}, Le/d/a/a/c/e;-><init>(Ljava/security/cert/Certificate;)V */
v0 = /* .line 3 */
if ( v0 != null) { // if-eqz v0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
/* # virtual methods */
public void checkClientTrusted ( java.security.cert.X509Certificate[] p0, java.lang.String p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/cert/CertificateException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/security/cert/CertificateException; */
final String p2 = "Client certificates not supported!"; // const-string p2, "Client certificates not supported!"
/* invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void checkServerTrusted ( java.security.cert.X509Certificate[] p0, java.lang.String p1 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/security/cert/CertificateException; */
/* } */
} // .end annotation
final String v0 = "Pin verification failed"; // const-string v0, "Pin verification failed"
/* .line 1 */
java.util.Arrays .asList ( p1 );
/* .line 2 */
v1 = e.d.a.a.d.c.a;
v2 = this.b;
int v3 = 0; // const/4 v3, 0x0
/* aget-object v5, p1, v3 */
v1 = (( e.d.a.a.d.c ) v1 ).a ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Le/d/a/a/d/c;->a(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z
int v2 = 1; // const/4 v2, 0x1
/* xor-int/2addr v1, v2 */
/* const/16 v5, 0x18 */
/* .line 3 */
try { // :try_start_0
v6 = this.a;
v7 = this.b;
(( android.net.http.X509TrustManagerExtensions ) v6 ).checkServerTrusted ( p1, p2, v7 ); // invoke-virtual {v6, p1, p2, v7}, Landroid/net/http/X509TrustManagerExtensions;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
/* :try_end_0 */
/* .catch Ljava/security/cert/CertificateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move p2, v1 */
/* :catch_0 */
/* move-exception p1 */
/* .line 4 */
/* if-lt p2, v5, :cond_0 */
/* .line 5 */
(( java.security.cert.CertificateException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/security/cert/CertificateException;->getMessage()Ljava/lang/String;
p1 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* move p2, v1 */
/* move-object p1, v4 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
/* move-object p1, v4 */
int p2 = 1; // const/4 p2, 0x1
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* .line 6 */
} // :goto_1
/* if-ge v6, v5, :cond_2 */
/* if-nez p2, :cond_2 */
/* .line 7 */
v5 = this.c;
(( e.d.a.a.c.b ) v5 ).a ( ); // invoke-virtual {v5}, Le/d/a/a/c/b;->a()Ljava/util/Date;
if ( v5 != null) { // if-eqz v5, :cond_1
v5 = this.c;
/* .line 8 */
(( e.d.a.a.c.b ) v5 ).a ( ); // invoke-virtual {v5}, Le/d/a/a/c/b;->a()Ljava/util/Date;
/* new-instance v6, Ljava/util/Date; */
/* invoke-direct {v6}, Ljava/util/Date;-><init>()V */
v5 = (( java.util.Date ) v5 ).compareTo ( v6 ); // invoke-virtual {v5, v6}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I
/* if-gez v5, :cond_1 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
} // :goto_2
/* if-nez v5, :cond_2 */
/* .line 9 */
v1 = this.c;
/* .line 10 */
(( e.d.a.a.c.b ) v1 ).c ( ); // invoke-virtual {v1}, Le/d/a/a/c/b;->c()Ljava/util/Set;
/* .line 11 */
v1 = e.d.a.a.d.d .a ( p1,v1 );
/* xor-int/2addr v1, v2 */
} // :cond_2
/* move v8, v1 */
/* if-nez p2, :cond_3 */
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 12 */
} // :cond_3
v1 = e.d.a.a.d.e.c;
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 13 */
v1 = e.d.a.a.d.e.d;
} // :cond_4
/* move-object v7, v1 */
/* .line 14 */
e.d.a.a.d.g .a ( );
v2 = this.b;
java.lang.Integer .valueOf ( v3 );
v6 = this.c;
/* move-object v5, p1 */
/* invoke-virtual/range {v1 ..v7}, Le/d/a/a/e/a;->a(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Le/d/a/a/c/b;Le/d/a/a/d/e;)V */
} // :cond_5
/* if-nez p2, :cond_9 */
if ( v8 != null) { // if-eqz v8, :cond_8
/* .line 15 */
p2 = this.c;
p2 = (( e.d.a.a.c.b ) p2 ).e ( ); // invoke-virtual {p2}, Le/d/a/a/c/b;->e()Z
if ( p2 != null) { // if-eqz p2, :cond_8
/* .line 16 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 17 */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "\n Configured pins: "; // const-string v0, "\n Configured pins: "
/* .line 18 */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 19 */
v0 = this.c;
(( e.d.a.a.c.b ) v0 ).c ( ); // invoke-virtual {v0}, Le/d/a/a/c/b;->c()Ljava/util/Set;
v1 = } // :goto_3
if ( v1 != null) { // if-eqz v1, :cond_6
/* check-cast v1, Le/d/a/a/c/e; */
/* .line 20 */
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " "; // const-string v1, " "
/* .line 21 */
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_6
final String v0 = "\n Peer certificate chain: "; // const-string v0, "\n Peer certificate chain: "
/* .line 22 */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 23 */
v0 = } // :goto_4
if ( v0 != null) { // if-eqz v0, :cond_7
/* check-cast v0, Ljava/security/cert/Certificate; */
final String v1 = "\n "; // const-string v1, "\n "
/* .line 24 */
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v1, Le/d/a/a/c/e; */
/* invoke-direct {v1, v0}, Le/d/a/a/c/e;-><init>(Ljava/security/cert/Certificate;)V */
/* .line 25 */
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " - "; // const-string v1, " - "
/* .line 26 */
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v0, Ljava/security/cert/X509Certificate; */
/* .line 27 */
(( java.security.cert.X509Certificate ) v0 ).getSubjectDN ( ); // invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 28 */
} // :cond_7
/* new-instance p1, Ljava/security/cert/CertificateException; */
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_8
return;
/* .line 29 */
} // :cond_9
/* new-instance p1, Ljava/security/cert/CertificateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Certificate validation failed for "; // const-string v0, "Certificate validation failed for "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.b;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public java.security.cert.X509Certificate getAcceptedIssuers ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/security/cert/X509Certificate; */
} // .end method
