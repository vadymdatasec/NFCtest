public class e.b.a.z.f0 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.z.j0 b; //synthetic
	 /* # direct methods */
	 public e.b.a.z.f0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = 		 (( e.b.a.z.j0 ) v0 ).c ( ); // invoke-virtual {v0}, Le/b/a/z/j0;->c()Z
		 /* iput-boolean v1, v0, Le/b/a/z/j0;->d:Z */
		 /* .line 2 */
		 try { // :try_start_0
			 v0 = this.b;
			 v0 = this.a;
			 v1 = this.b;
			 v1 = this.f;
			 /* new-instance v2, Landroid/content/IntentFilter; */
			 final String v3 = "android.net.conn.CONNECTIVITY_CHANGE"; // const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"
			 /* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
			 (( android.content.Context ) v0 ).registerReceiver ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
			 /* .line 3 */
			 v0 = this.b;
			 int v1 = 1; // const/4 v1, 0x1
			 /* iput-boolean v1, v0, Le/b/a/z/j0;->e:Z */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 int v1 = 5; // const/4 v1, 0x5
			 final String v2 = "ConnectivityMonitor"; // const-string v2, "ConnectivityMonitor"
			 /* .line 4 */
			 v1 = 			 android.util.Log .isLoggable ( v2,v1 );
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 final String v1 = "Failed to register"; // const-string v1, "Failed to register"
				 /* .line 5 */
				 android.util.Log .w ( v2,v1,v0 );
				 /* .line 6 */
			 } // :cond_0
			 v0 = this.b;
			 int v1 = 0; // const/4 v1, 0x0
			 /* iput-boolean v1, v0, Le/b/a/z/j0;->e:Z */
		 } // :goto_0
		 return;
	 } // .end method
