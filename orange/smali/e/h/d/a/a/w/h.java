public abstract class e.h.d.a.a.w.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 final String v0 = "connectivity"; // const-string v0, "connectivity"
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast p0, Landroid/net/ConnectivityManager; */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 (( android.net.ConnectivityManager ) p0 ).getActiveNetworkInfo ( ); // invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
	 if ( p0 != null) { // if-eqz p0, :cond_1
		 /* .line 3 */
		 p0 = 		 (( android.net.NetworkInfo ) p0 ).isConnected ( ); // invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_1
	 } // .end method
