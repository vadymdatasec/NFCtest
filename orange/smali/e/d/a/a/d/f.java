public abstract class e.d.a.a.d.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final javax.net.ssl.X509TrustManager a;
	 /* # direct methods */
	 public static e.d.a.a.d.f ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 e.d.a.a.d.f .b ( );
		 return;
	 } // .end method
	 public static javax.net.ssl.X509TrustManager a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.d.a.a.d.f.a;
	 } // .end method
	 public static javax.net.ssl.X509TrustManager b ( ) {
		 /* .locals 7 */
		 final String v0 = "Should never happen"; // const-string v0, "Should never happen"
		 /* .line 1 */
		 try { // :try_start_0
			 javax.net.ssl.TrustManagerFactory .getDefaultAlgorithm ( );
			 /* .line 2 */
			 javax.net.ssl.TrustManagerFactory .getInstance ( v1 );
			 /* :try_end_0 */
			 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_1 */
			 int v2 = 0; // const/4 v2, 0x0
			 /* .line 3 */
			 try { // :try_start_1
				 (( javax.net.ssl.TrustManagerFactory ) v1 ).init ( v2 ); // invoke-virtual {v1, v2}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V
				 /* :try_end_1 */
				 /* .catch Ljava/security/KeyStoreException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .line 4 */
				 (( javax.net.ssl.TrustManagerFactory ) v1 ).getTrustManagers ( ); // invoke-virtual {v1}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;
				 /* array-length v3, v1 */
				 int v4 = 0; // const/4 v4, 0x0
			 } // :goto_0
			 /* if-ge v4, v3, :cond_1 */
			 /* aget-object v5, v1, v4 */
			 /* .line 5 */
			 /* instance-of v6, v5, Ljavax/net/ssl/X509TrustManager; */
			 if ( v6 != null) { // if-eqz v6, :cond_0
				 /* .line 6 */
				 /* check-cast v5, Ljavax/net/ssl/X509TrustManager; */
				 /* move-object v2, v5 */
			 } // :cond_0
			 /* add-int/lit8 v4, v4, 0x1 */
		 } // :cond_1
		 if ( v2 != null) { // if-eqz v2, :cond_2
			 /* .line 7 */
		 } // :cond_2
		 /* new-instance v1, Ljava/lang/IllegalStateException; */
		 /* invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
		 /* .line 8 */
		 /* :catch_0 */
		 /* new-instance v1, Ljava/lang/IllegalStateException; */
		 /* invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
		 /* .line 9 */
		 /* :catch_1 */
		 /* new-instance v1, Ljava/lang/IllegalStateException; */
		 /* invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
	 } // .end method
