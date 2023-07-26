public class e.b.a.y.x.a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Runnable b; //synthetic
	 /* # direct methods */
	 public e.b.a.y.x.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0xa */
		 /* .line 1 */
		 android.os.Process .setThreadPriority ( v0 );
		 /* .line 2 */
		 v0 = this.b;
		 return;
	 } // .end method
