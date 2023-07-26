public class j.a.a.a.d extends android.os.HandlerThread {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public j.a.a.a.a b;
	 /* # direct methods */
	 public j.a.a.a.d ( ) {
		 /* .locals 1 */
		 final String v0 = "CameraHandlerThread"; // const-string v0, "CameraHandlerThread"
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 (( android.os.HandlerThread ) p0 ).start ( ); // invoke-virtual {p0}, Landroid/os/HandlerThread;->start()V
		 return;
	 } // .end method
	 public static j.a.a.a.a a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.b;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* new-instance v0, Landroid/os/Handler; */
		 (( android.os.HandlerThread ) p0 ).getLooper ( ); // invoke-virtual {p0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
		 /* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 /* .line 3 */
		 /* new-instance v1, Lj/a/a/a/c; */
		 /* invoke-direct {v1, p0, p1}, Lj/a/a/a/c;-><init>(Lj/a/a/a/d;I)V */
		 (( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
