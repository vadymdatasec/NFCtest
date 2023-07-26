public class e.b.a.z.g0 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.z.j0 b; //synthetic
	 /* # direct methods */
	 public e.b.a.z.g0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 /* iget-boolean v0, v0, Le/b/a/z/j0;->e:Z */
		 /* if-nez v0, :cond_0 */
		 return;
		 /* .line 2 */
	 } // :cond_0
	 v0 = this.b;
	 int v1 = 0; // const/4 v1, 0x0
	 /* iput-boolean v1, v0, Le/b/a/z/j0;->e:Z */
	 /* .line 3 */
	 v0 = this.b;
	 v1 = this.a;
	 v0 = this.f;
	 (( android.content.Context ) v1 ).unregisterReceiver ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
	 return;
} // .end method
