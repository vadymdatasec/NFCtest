public class j.a.a.a.c implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer b; //synthetic
	 public final j.a.a.a.d c; //synthetic
	 /* # direct methods */
	 public j.a.a.a.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* iput p2, p0, Lj/a/a/a/c;->b:I */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* iget v0, p0, Lj/a/a/a/c;->b:I */
		 j.a.a.a.h .a ( v0 );
		 /* .line 2 */
		 /* new-instance v1, Landroid/os/Handler; */
		 android.os.Looper .getMainLooper ( );
		 /* invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 /* .line 3 */
		 /* new-instance v2, Lj/a/a/a/b; */
		 /* invoke-direct {v2, p0, v0}, Lj/a/a/a/b;-><init>(Lj/a/a/a/c;Landroid/hardware/Camera;)V */
		 (( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
