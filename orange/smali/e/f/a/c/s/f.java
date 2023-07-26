public class e.f.a.c.s.f implements e.f.a.c.s.t {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.google.android.material.snackbar.BaseTransientBottomBar a; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = com.google.android.material.snackbar.BaseTransientBottomBar.j;
		 v1 = this.a;
		 int v2 = 0; // const/4 v2, 0x0
		 (( android.os.Handler ) v0 ).obtainMessage ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
		 (( android.os.Handler ) v0 ).sendMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
		 return;
	 } // .end method
	 public void a ( Integer p0 ) {
		 /* .locals 4 */
		 /* .line 2 */
		 v0 = com.google.android.material.snackbar.BaseTransientBottomBar.j;
		 v1 = this.a;
		 int v2 = 1; // const/4 v2, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 3 */
		 (( android.os.Handler ) v0 ).obtainMessage ( v2, p1, v3, v1 ); // invoke-virtual {v0, v2, p1, v3, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
		 /* .line 4 */
		 (( android.os.Handler ) v0 ).sendMessage ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
		 return;
	 } // .end method
