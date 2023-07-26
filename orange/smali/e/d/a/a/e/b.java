public class e.d.a.a.e.b extends android.os.AsyncTask {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/AsyncTask<", */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Void;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final javax.net.ssl.SSLSocketFactory a;
/* # direct methods */
public static e.d.a.a.e.b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 e.d.a.a.e.b .a ( );
	 return;
} // .end method
public e.d.a.a.e.b ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
	 return;
} // .end method
public static javax.net.ssl.SSLSocketFactory a ( ) {
	 /* .locals 5 */
	 final String v0 = "Should never happen"; // const-string v0, "Should never happen"
	 try { // :try_start_0
		 final String v1 = "TLS"; // const-string v1, "TLS"
		 /* .line 1 */
		 javax.net.ssl.SSLContext .getInstance ( v1 );
		 /* :try_end_0 */
		 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_1 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int v2 = 1; // const/4 v2, 0x1
			 try { // :try_start_1
				 /* new-array v2, v2, [Ljavax/net/ssl/TrustManager; */
				 int v3 = 0; // const/4 v3, 0x0
				 /* .line 2 */
				 e.d.a.a.d.f .a ( );
				 /* aput-object v4, v2, v3 */
				 int v3 = 0; // const/4 v3, 0x0
				 (( javax.net.ssl.SSLContext ) v1 ).init ( v3, v2, v3 ); // invoke-virtual {v1, v3, v2, v3}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
				 /* :try_end_1 */
				 /* .catch Ljava/security/KeyManagementException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .line 3 */
				 (( javax.net.ssl.SSLContext ) v1 ).getSocketFactory ( ); // invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
				 /* .line 4 */
				 /* :catch_0 */
				 /* new-instance v1, Ljava/lang/IllegalStateException; */
				 /* invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
				 /* throw v1 */
				 /* .line 5 */
			 } // :cond_0
			 /* new-instance v1, Ljava/lang/IllegalStateException; */
			 /* invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
			 /* throw v1 */
			 /* .line 6 */
			 /* :catch_1 */
			 /* new-instance v1, Ljava/lang/IllegalStateException; */
			 /* invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
			 /* throw v1 */
		 } // .end method
		 /* # virtual methods */
		 public final java.lang.Integer doInBackground ( java.lang.Object...p0 ) {
			 /* .locals 10 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 2 */
			 /* aget-object v1, p1, v0 */
			 /* check-cast v1, Le/d/a/a/e/c; */
			 int v2 = 0; // const/4 v2, 0x0
			 int v3 = 1; // const/4 v3, 0x1
			 /* move-object v5, v2 */
			 int v4 = 1; // const/4 v4, 0x1
			 /* .line 3 */
		 } // :goto_0
		 /* array-length v6, p1 */
		 /* if-ge v4, v6, :cond_4 */
		 /* .line 4 */
		 /* aget-object v6, p1, v4 */
		 /* check-cast v6, Ljava/net/URL; */
		 /* .line 5 */
		 try { // :try_start_0
			 (( java.net.URL ) v6 ).openConnection ( ); // invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
			 /* check-cast v7, Ljava/net/HttpURLConnection; */
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 try { // :try_start_1
				 final String v8 = "POST"; // const-string v8, "POST"
				 /* .line 6 */
				 (( java.net.HttpURLConnection ) v7 ).setRequestMethod ( v8 ); // invoke-virtual {v7, v8}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
				 final String v8 = "Content-Type"; // const-string v8, "Content-Type"
				 final String v9 = "application/json"; // const-string v9, "application/json"
				 /* .line 7 */
				 (( java.net.HttpURLConnection ) v7 ).setRequestProperty ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
				 /* .line 8 */
				 (( java.net.HttpURLConnection ) v7 ).setDoOutput ( v3 ); // invoke-virtual {v7, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
				 /* .line 9 */
				 (( java.net.HttpURLConnection ) v7 ).setChunkedStreamingMode ( v0 ); // invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V
				 /* .line 10 */
				 (( java.net.URL ) v6 ).getUserInfo ( ); // invoke-virtual {v6}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;
				 if ( v8 != null) { // if-eqz v8, :cond_0
					 /* .line 11 */
					 /* new-instance v8, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v9 = "Basic "; // const-string v9, "Basic "
					 (( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 /* new-instance v9, Ljava/lang/String; */
					 (( java.net.URL ) v6 ).getUserInfo ( ); // invoke-virtual {v6}, Ljava/net/URL;->getUserInfo()Ljava/lang/String;
					 (( java.lang.String ) v6 ).getBytes ( ); // invoke-virtual {v6}, Ljava/lang/String;->getBytes()[B
					 android.util.Base64 .encode ( v6,v0 );
					 /* invoke-direct {v9, v6}, Ljava/lang/String;-><init>([B)V */
					 (( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 final String v8 = "Authorization"; // const-string v8, "Authorization"
					 /* .line 12 */
					 (( java.net.HttpURLConnection ) v7 ).setRequestProperty ( v8, v6 ); // invoke-virtual {v7, v8, v6}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
					 /* .line 13 */
				 } // :cond_0
				 /* instance-of v6, v7, Ljavax/net/ssl/HttpsURLConnection; */
				 if ( v6 != null) { // if-eqz v6, :cond_1
					 /* .line 14 */
					 /* move-object v6, v7 */
					 /* check-cast v6, Ljavax/net/ssl/HttpsURLConnection; */
					 /* .line 15 */
					 v8 = e.d.a.a.e.b.a;
					 (( javax.net.ssl.HttpsURLConnection ) v6 ).setSSLSocketFactory ( v8 ); // invoke-virtual {v6, v8}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
					 /* .line 16 */
				 } // :cond_1
				 (( java.net.HttpURLConnection ) v7 ).connect ( ); // invoke-virtual {v7}, Ljava/net/HttpURLConnection;->connect()V
				 /* .line 17 */
				 /* new-instance v6, Ljava/io/BufferedOutputStream; */
				 (( java.net.HttpURLConnection ) v7 ).getOutputStream ( ); // invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
				 /* invoke-direct {v6, v8}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V */
				 /* .line 18 */
				 (( e.d.a.a.e.c ) v1 ).f ( ); // invoke-virtual {v1}, Le/d/a/a/e/c;->f()Lorg/json/JSONObject;
				 (( org.json.JSONObject ) v8 ).toString ( ); // invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
				 final String v9 = "UTF-8"; // const-string v9, "UTF-8"
				 (( java.lang.String ) v8 ).getBytes ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
				 (( java.io.OutputStream ) v6 ).write ( v8 ); // invoke-virtual {v6, v8}, Ljava/io/OutputStream;->write([B)V
				 /* .line 19 */
				 (( java.io.OutputStream ) v6 ).flush ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->flush()V
				 /* .line 20 */
				 (( java.io.OutputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
				 /* .line 21 */
				 v6 = 				 (( java.net.HttpURLConnection ) v7 ).getResponseCode ( ); // invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I
				 java.lang.Integer .valueOf ( v6 );
				 /* :try_end_1 */
				 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
				 if ( v7 != null) { // if-eqz v7, :cond_2
					 /* .line 22 */
				 } // :goto_1
				 (( java.net.HttpURLConnection ) v7 ).disconnect ( ); // invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V
				 /* :catch_0 */
				 /* move-exception v6 */
				 /* :catchall_0 */
				 /* move-exception p1 */
				 /* :catch_1 */
				 /* move-exception v6 */
				 /* move-object v7, v2 */
				 /* .line 23 */
			 } // :goto_2
			 try { // :try_start_2
				 /* new-instance v8, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v9 = "Background upload - task completed with error:"; // const-string v9, "Background upload - task completed with error:"
				 (( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.io.IOException ) v6 ).getMessage ( ); // invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 e.d.a.a.f.a .a ( v6 );
				 /* :try_end_2 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
				 if ( v7 != null) { // if-eqz v7, :cond_2
				 } // :cond_2
			 } // :goto_3
			 /* add-int/lit8 v4, v4, 0x1 */
			 /* goto/16 :goto_0 */
			 /* :catchall_1 */
			 /* move-exception p1 */
			 /* move-object v2, v7 */
		 } // :goto_4
		 if ( v2 != null) { // if-eqz v2, :cond_3
			 /* .line 24 */
			 (( java.net.HttpURLConnection ) v2 ).disconnect ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
			 /* .line 25 */
		 } // :cond_3
		 /* throw p1 */
	 } // :cond_4
} // .end method
public java.lang.Object doInBackground ( java.lang.Object[] p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 (( e.d.a.a.e.b ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Le/d/a/a/e/b;->doInBackground([Ljava/lang/Object;)Ljava/lang/Integer;
} // .end method
