public class c.p.a.a extends android.os.Handler {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.p.a.d a; //synthetic
	 /* # direct methods */
	 public c.p.a.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void handleMessage ( android.os.Message p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget v0, p1, Landroid/os/Message;->what:I */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-eq v0, v1, :cond_0 */
		 /* .line 2 */
		 /* invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V */
		 /* .line 3 */
	 } // :cond_0
	 p1 = this.a;
	 (( c.p.a.d ) p1 ).a ( ); // invoke-virtual {p1}, Lc/p/a/d;->a()V
} // :goto_0
return;
} // .end method
