public class e.f.c.f implements java.util.concurrent.Executor {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Handler a;
	 /* # direct methods */
	 public static e.f.c.f ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/os/Handler; */
		 android.os.Looper .getMainLooper ( );
		 /* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
		 return;
	 } // .end method
	 public e.f.c.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public e.f.c.f ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Le/f/c/f;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void execute ( java.lang.Runnable p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.c.f.a;
		 (( android.os.Handler ) v0 ).post ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
