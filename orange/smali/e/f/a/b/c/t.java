public abstract class e.f.a.b.c.t {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static android.content.Context a;
	 /* # direct methods */
	 public static e.f.a.b.c.t ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public static synchronized void a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* const-class v0, Le/f/a/b/c/t; */
		 /* monitor-enter v0 */
		 /* .line 1 */
		 try { // :try_start_0
			 v1 = e.f.a.b.c.t.a;
			 /* if-nez v1, :cond_0 */
			 if ( p0 != null) { // if-eqz p0, :cond_1
				 /* .line 2 */
				 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit v0 */
				 return;
			 } // :cond_0
			 try { // :try_start_1
				 final String p0 = "GoogleCertificates"; // const-string p0, "GoogleCertificates"
				 final String v1 = "GoogleCertificates has been initialized already"; // const-string v1, "GoogleCertificates has been initialized already"
				 /* .line 3 */
				 android.util.Log .w ( p0,v1 );
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* .line 4 */
			 } // :cond_1
			 /* monitor-exit v0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p0 */
			 /* monitor-exit v0 */
			 /* throw p0 */
		 } // .end method
