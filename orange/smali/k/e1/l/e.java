public class k.e1.l.e extends k.e1.l.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public k.e1.l.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lk/e1/l/j;-><init>()V */
		 return;
	 } // .end method
	 public static k.e1.l.e f ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 final String v1 = "org.conscrypt.Conscrypt"; // const-string v1, "org.conscrypt.Conscrypt"
			 /* .line 1 */
			 java.lang.Class .forName ( v1 );
			 /* .line 2 */
			 v1 = 			 org.conscrypt.Conscrypt .isAvailable ( );
			 /* if-nez v1, :cond_0 */
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance v1, Lk/e1/l/e; */
		 /* invoke-direct {v1}, Lk/e1/l/e;-><init>()V */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
	 } // .end method
	 /* # virtual methods */
	 public javax.net.ssl.SSLContext a ( ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 final String v0 = "TLSv1.3"; // const-string v0, "TLSv1.3"
			 /* .line 7 */
			 (( k.e1.l.e ) p0 ).e ( ); // invoke-virtual {p0}, Lk/e1/l/e;->e()Ljava/security/Provider;
			 javax.net.ssl.SSLContext .getInstance ( v0,v1 );
			 /* :try_end_0 */
			 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 try { // :try_start_1
				 final String v1 = "TLS"; // const-string v1, "TLS"
				 /* .line 8 */
				 (( k.e1.l.e ) p0 ).e ( ); // invoke-virtual {p0}, Lk/e1/l/e;->e()Ljava/security/Provider;
				 javax.net.ssl.SSLContext .getInstance ( v1,v2 );
				 /* :try_end_1 */
				 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* .line 9 */
				 /* :catch_1 */
				 /* new-instance v1, Ljava/lang/IllegalStateException; */
				 final String v2 = "No TLS provider"; // const-string v2, "No TLS provider"
				 /* invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
				 /* throw v1 */
			 } // .end method
			 public void a ( javax.net.ssl.SSLSocket p0, java.lang.String p1, java.util.List p2 ) {
				 /* .locals 1 */
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
			 /* .line 1 */
			 v0 = 			 org.conscrypt.Conscrypt .isConscrypt ( p1 );
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 if ( p2 != null) { // if-eqz p2, :cond_0
					 int v0 = 1; // const/4 v0, 0x1
					 /* .line 2 */
					 org.conscrypt.Conscrypt .setUseSessionTickets ( p1,v0 );
					 /* .line 3 */
					 org.conscrypt.Conscrypt .setHostname ( p1,p2 );
					 /* .line 4 */
				 } // :cond_0
				 k.e1.l.j .a ( p3 );
				 int p3 = 0; // const/4 p3, 0x0
				 /* new-array p3, p3, [Ljava/lang/String; */
				 /* .line 5 */
				 /* check-cast p2, [Ljava/lang/String; */
				 org.conscrypt.Conscrypt .setApplicationProtocols ( p1,p2 );
				 /* .line 6 */
			 } // :cond_1
			 /* invoke-super {p0, p1, p2, p3}, Lk/e1/l/j;->a(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V */
		 } // :goto_0
		 return;
	 } // .end method
	 public void a ( javax.net.ssl.SSLSocketFactory p0 ) {
		 /* .locals 1 */
		 /* .line 10 */
		 v0 = 		 org.conscrypt.Conscrypt .isConscrypt ( p1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
			 /* .line 11 */
			 org.conscrypt.Conscrypt .setUseEngineSocket ( p1,v0 );
		 } // :cond_0
		 return;
	 } // .end method
	 public java.lang.String b ( javax.net.ssl.SSLSocket p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 org.conscrypt.Conscrypt .isConscrypt ( p1 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 org.conscrypt.Conscrypt .getApplicationProtocol ( p1 );
			 /* .line 3 */
		 } // :cond_0
		 /* invoke-super {p0, p1}, Lk/e1/l/j;->b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String; */
	 } // .end method
	 public final java.security.Provider e ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 org.conscrypt.Conscrypt .newProviderBuilder ( );
		 (( org.conscrypt.Conscrypt$ProviderBuilder ) v0 ).provideTrustManager ( ); // invoke-virtual {v0}, Lorg/conscrypt/Conscrypt$ProviderBuilder;->provideTrustManager()Lorg/conscrypt/Conscrypt$ProviderBuilder;
		 (( org.conscrypt.Conscrypt$ProviderBuilder ) v0 ).build ( ); // invoke-virtual {v0}, Lorg/conscrypt/Conscrypt$ProviderBuilder;->build()Ljava/security/Provider;
	 } // .end method
