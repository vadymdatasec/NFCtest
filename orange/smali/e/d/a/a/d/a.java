public abstract class e.d.a.a.d.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static javax.net.ssl.X509TrustManager a ( java.util.Set p0 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/Set<", */
		 /* "Ljava/security/cert/Certificate;", */
		 /* ">;)", */
		 /* "Ljavax/net/ssl/X509TrustManager;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/security/cert/CertificateException;, */
	 /* Ljava/io/IOException;, */
	 /* Ljava/security/KeyStoreException;, */
	 /* Ljava/security/NoSuchAlgorithmException; */
	 /* } */
} // .end annotation
final String v0 = "AndroidCAStore"; // const-string v0, "AndroidCAStore"
/* .line 1 */
java.security.KeyStore .getInstance ( v0 );
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( java.security.KeyStore ) v0 ).load ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
/* .line 3 */
java.security.KeyStore .getDefaultType ( );
java.security.KeyStore .getInstance ( v2 );
/* .line 4 */
(( java.security.KeyStore ) v2 ).load ( v1, v1 ); // invoke-virtual {v2, v1, v1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
/* .line 5 */
(( java.security.KeyStore ) v0 ).aliases ( ); // invoke-virtual {v0}, Ljava/security/KeyStore;->aliases()Ljava/util/Enumeration;
/* .line 6 */
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 7 */
/* check-cast v4, Ljava/lang/String; */
/* .line 8 */
(( java.security.KeyStore ) v0 ).getCertificate ( v4 ); // invoke-virtual {v0, v4}, Ljava/security/KeyStore;->getCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;
/* check-cast v5, Ljava/security/cert/X509Certificate; */
/* .line 9 */
(( java.security.KeyStore ) v2 ).setCertificateEntry ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Ljava/security/KeyStore;->setCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V
/* .line 10 */
} // :cond_0
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Ljava/security/cert/Certificate; */
/* .line 11 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "debug: "; // const-string v4, "debug: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object v4, v0 */
/* check-cast v4, Ljava/security/cert/X509Certificate; */
(( java.security.cert.X509Certificate ) v4 ).getSubjectDN ( ); // invoke-virtual {v4}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 12 */
(( java.security.KeyStore ) v2 ).setCertificateEntry ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Ljava/security/KeyStore;->setCertificateEntry(Ljava/lang/String;Ljava/security/cert/Certificate;)V
/* .line 13 */
} // :cond_1
javax.net.ssl.TrustManagerFactory .getDefaultAlgorithm ( );
/* .line 14 */
javax.net.ssl.TrustManagerFactory .getInstance ( p0 );
/* .line 15 */
(( javax.net.ssl.TrustManagerFactory ) p0 ).init ( v2 ); // invoke-virtual {p0, v2}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V
/* .line 16 */
(( javax.net.ssl.TrustManagerFactory ) p0 ).getTrustManagers ( ); // invoke-virtual {p0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;
/* .line 17 */
(( javax.net.ssl.TrustManagerFactory ) p0 ).getTrustManagers ( ); // invoke-virtual {p0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;
/* array-length v0, p0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_2
/* if-ge v2, v0, :cond_3 */
/* aget-object v3, p0, v2 */
/* .line 18 */
/* instance-of v4, v3, Ljavax/net/ssl/X509TrustManager; */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 19 */
/* check-cast v3, Ljavax/net/ssl/X509TrustManager; */
/* move-object v1, v3 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 20 */
} // :cond_4
/* new-instance p0, Ljava/lang/IllegalStateException; */
final String v0 = "Should never happen"; // const-string v0, "Should never happen"
/* invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
