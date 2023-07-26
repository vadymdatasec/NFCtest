public abstract class e.f.a.d.a.g.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.content.Context a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
	 } // .end method
	 public static java.lang.String a ( Object[] p0 ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 final String v0 = "SHA-256"; // const-string v0, "SHA-256"
			 java.security.MessageDigest .getInstance ( v0 );
			 /* :try_end_0 */
			 /* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
			 (( java.security.MessageDigest ) v0 ).update ( p0 ); // invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V
			 (( java.security.MessageDigest ) v0 ).digest ( ); // invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
			 /* const/16 v0, 0xb */
			 android.util.Base64 .encodeToString ( p0,v0 );
			 /* :catch_0 */
			 final String p0 = ""; // const-string p0, ""
		 } // .end method
