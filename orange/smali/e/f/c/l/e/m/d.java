public abstract class e.f.c.l.e.m.d implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.c.l.e.m.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract void a ( ) {
	 } // .end method
	 public final void run ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0xa */
		 /* .line 1 */
		 android.os.Process .setThreadPriority ( v0 );
		 /* .line 2 */
		 (( e.f.c.l.e.m.d ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/d;->a()V
		 return;
	 } // .end method
