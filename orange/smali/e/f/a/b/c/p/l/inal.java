public class inal implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Runnable b;
	 public final Integer c;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 /* iput p2, p0, Le/f/a/b/c/p/l/b;->c:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void run ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Le/f/a/b/c/p/l/b;->c:I */
		 android.os.Process .setThreadPriority ( v0 );
		 /* .line 2 */
		 v0 = this.b;
		 return;
	 } // .end method
