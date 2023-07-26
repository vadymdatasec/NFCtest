public class e.h.d.a.a.n.d extends e.a.a.c0.n {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.n.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/a/a/c0/n;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.net.HttpURLConnection a ( java.net.URL p0 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Le/a/a/c0/n;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 2 */
	 (( java.net.HttpURLConnection ) v0 ).setInstanceFollowRedirects ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
	 /* .line 3 */
	 /* instance-of v1, v0, Ljavax/net/ssl/HttpsURLConnection; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 4 */
		 e.d.a.a.b .b ( );
		 (( java.net.URL ) p1 ).getHost ( ); // invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;
		 (( e.d.a.a.b ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/d/a/a/b;->a(Ljava/lang/String;)Ljavax/net/ssl/SSLSocketFactory;
		 /* .line 5 */
		 /* move-object v1, v0 */
		 /* check-cast v1, Ljavax/net/ssl/HttpsURLConnection; */
		 (( javax.net.ssl.HttpsURLConnection ) v1 ).setSSLSocketFactory ( p1 ); // invoke-virtual {v1, p1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
		 /* .line 6 */
	 } // :cond_0
	 p1 = com.orange.business.packid.android.lib.PackIdPreferences.INSTANCE;
	 p1 = 	 (( com.orange.business.packid.android.lib.PackIdPreferences ) p1 ).isHttpAccepted ( ); // invoke-virtual {p1}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->isHttpAccepted()Z
	 if ( p1 != null) { // if-eqz p1, :cond_1
	 } // :goto_0
	 /* .line 7 */
} // :cond_1
/* new-instance p1, Ljavax/net/ssl/SSLException; */
final String v0 = "HTTPS required!"; // const-string v0, "HTTPS required!"
/* invoke-direct {p1, v0}, Ljavax/net/ssl/SSLException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
