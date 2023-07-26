public class e.a.a.f implements java.util.concurrent.Executor {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.os.Handler a; //synthetic
	 /* # direct methods */
	 public e.a.a.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void execute ( java.lang.Runnable p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.os.Handler ) v0 ).post ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
