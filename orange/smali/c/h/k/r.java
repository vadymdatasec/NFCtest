public class c.h.k.r extends java.lang.Thread {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer b;
	 /* # direct methods */
	 public c.h.k.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V */
		 /* .line 2 */
		 /* iput p3, p0, Lc/h/k/r;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lc/h/k/r;->b:I */
		 android.os.Process .setThreadPriority ( v0 );
		 /* .line 2 */
		 /* invoke-super {p0}, Ljava/lang/Thread;->run()V */
		 return;
	 } // .end method
