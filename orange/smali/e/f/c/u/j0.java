public class e.f.c.u.j0 extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public e.f.c.u.k0 a;
	 public final e.f.c.u.k0 b; //synthetic
	 /* # direct methods */
	 public e.f.c.u.j0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 /* .line 2 */
		 this.a = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = 		 e.f.c.u.k0 .b ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
			 final String v1 = "Connectivity change received registered"; // const-string v1, "Connectivity change received registered"
			 /* .line 2 */
			 android.util.Log .d ( v0,v1 );
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.b;
		 e.f.c.u.k0 .c ( v0 );
		 /* new-instance v1, Landroid/content/IntentFilter; */
		 final String v2 = "android.net.conn.CONNECTIVITY_CHANGE"; // const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"
		 /* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
		 (( android.content.Context ) v0 ).registerReceiver ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
		 return;
	 } // .end method
	 public synchronized void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 3 */
		 /* monitor-enter p0 */
		 /* .line 1 */
		 try { // :try_start_0
			 p2 = this.a;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* if-nez p2, :cond_0 */
			 /* .line 2 */
			 /* monitor-exit p0 */
			 return;
			 /* .line 3 */
		 } // :cond_0
		 try { // :try_start_1
			 p2 = this.a;
			 p2 = 			 e.f.c.u.k0 .a ( p2 );
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* if-nez p2, :cond_1 */
			 /* .line 4 */
			 /* monitor-exit p0 */
			 return;
			 /* .line 5 */
		 } // :cond_1
		 try { // :try_start_2
			 p2 = 			 e.f.c.u.k0 .b ( );
			 if ( p2 != null) { // if-eqz p2, :cond_2
				 final String p2 = "FirebaseMessaging"; // const-string p2, "FirebaseMessaging"
				 final String v0 = "Connectivity changed.Starting background sync."; // const-string v0, "Connectivity changed.Starting background sync."
				 /* .line 6 */
				 android.util.Log .d ( p2,v0 );
				 /* .line 7 */
			 } // :cond_2
			 p2 = this.a;
			 e.f.c.u.k0 .b ( p2 );
			 v0 = this.a;
			 /* const-wide/16 v1, 0x0 */
			 (( e.f.c.u.i0 ) p2 ).a ( v0, v1, v2 ); // invoke-virtual {p2, v0, v1, v2}, Le/f/c/u/i0;->a(Ljava/lang/Runnable;J)V
			 /* .line 8 */
			 (( android.content.Context ) p1 ).unregisterReceiver ( p0 ); // invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 9 */
			 this.a = p1;
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 /* .line 10 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
