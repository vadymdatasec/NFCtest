public class com.android.volley.AuthFailureError extends com.android.volley.VolleyError {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.content.Intent c;
	 /* # direct methods */
	 public com.android.volley.AuthFailureError ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lcom/android/volley/VolleyError;-><init>()V */
		 return;
	 } // .end method
	 public com.android.volley.AuthFailureError ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1}, Lcom/android/volley/VolleyError;-><init>(Le/a/a/l;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getMessage ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "User needs to (re)enter credentials."; // const-string v0, "User needs to (re)enter credentials."
			 /* .line 2 */
		 } // :cond_0
		 /* invoke-super {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String; */
	 } // .end method
