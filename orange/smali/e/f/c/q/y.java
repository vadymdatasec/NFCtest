public class e.f.c.q.y extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public e.f.c.q.z a;
	 /* # direct methods */
	 public e.f.c.q.y ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = 		 com.google.firebase.iid.FirebaseInstanceId .n ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
			 final String v1 = "Connectivity change received registered"; // const-string v1, "Connectivity change received registered"
			 /* .line 2 */
			 android.util.Log .d ( v0,v1 );
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance v0, Landroid/content/IntentFilter; */
		 final String v1 = "android.net.conn.CONNECTIVITY_CHANGE"; // const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"
		 /* invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
		 /* .line 4 */
		 v1 = this.a;
		 (( e.f.c.q.z ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/q/z;->a()Landroid/content/Context;
		 (( android.content.Context ) v1 ).registerReceiver ( p0, v0 ); // invoke-virtual {v1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
		 return;
	 } // .end method
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = this.a;
		 /* if-nez p1, :cond_0 */
		 return;
		 /* .line 2 */
	 } // :cond_0
	 p1 = 	 (( e.f.c.q.z ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/q/z;->b()Z
	 /* if-nez p1, :cond_1 */
	 return;
	 /* .line 3 */
} // :cond_1
p1 = com.google.firebase.iid.FirebaseInstanceId .n ( );
if ( p1 != null) { // if-eqz p1, :cond_2
	 final String p1 = "FirebaseInstanceId"; // const-string p1, "FirebaseInstanceId"
	 final String p2 = "Connectivity changed.Starting background sync."; // const-string p2, "Connectivity changed.Starting background sync."
	 /* .line 4 */
	 android.util.Log .d ( p1,p2 );
	 /* .line 5 */
} // :cond_2
p1 = this.a;
e.f.c.q.z .a ( p1 );
p2 = this.a;
/* const-wide/16 v0, 0x0 */
(( com.google.firebase.iid.FirebaseInstanceId ) p1 ).a ( p2, v0, v1 ); // invoke-virtual {p1, p2, v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Ljava/lang/Runnable;J)V
/* .line 6 */
p1 = this.a;
(( e.f.c.q.z ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/q/z;->a()Landroid/content/Context;
(( android.content.Context ) p1 ).unregisterReceiver ( p0 ); // invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
this.a = p1;
return;
} // .end method
