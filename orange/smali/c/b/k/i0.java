public abstract class c.b.k.i0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.content.BroadcastReceiver a;
	 public final c.b.k.n0 b; //synthetic
	 /* # direct methods */
	 public c.b.k.i0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 try { // :try_start_0
				 v1 = this.b;
				 v1 = this.f;
				 (( android.content.Context ) v1 ).unregisterReceiver ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
				 /* :try_end_0 */
				 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 int v0 = 0; // const/4 v0, 0x0
				 /* .line 3 */
				 this.a = v0;
			 } // :cond_0
			 return;
		 } // .end method
		 public abstract android.content.IntentFilter b ( ) {
		 } // .end method
		 public abstract Integer c ( ) {
		 } // .end method
		 public abstract void d ( ) {
		 } // .end method
		 public void e ( ) {
			 /* .locals 3 */
			 /* .line 1 */
			 (( c.b.k.i0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/i0;->a()V
			 /* .line 2 */
			 (( c.b.k.i0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/k/i0;->b()Landroid/content/IntentFilter;
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 /* .line 3 */
				 v1 = 				 (( android.content.IntentFilter ) v0 ).countActions ( ); // invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I
				 /* if-nez v1, :cond_0 */
				 /* .line 4 */
			 } // :cond_0
			 v1 = this.a;
			 /* if-nez v1, :cond_1 */
			 /* .line 5 */
			 /* new-instance v1, Lc/b/k/h0; */
			 /* invoke-direct {v1, p0}, Lc/b/k/h0;-><init>(Lc/b/k/i0;)V */
			 this.a = v1;
			 /* .line 6 */
		 } // :cond_1
		 v1 = this.b;
		 v1 = this.f;
		 v2 = this.a;
		 (( android.content.Context ) v1 ).registerReceiver ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
	 } // :cond_2
} // :goto_0
return;
} // .end method
