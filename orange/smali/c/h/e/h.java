public class c.h.e.h implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.app.Application b; //synthetic
	 public final c.h.e.j c; //synthetic
	 /* # direct methods */
	 public c.h.e.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.c = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.c;
		 (( android.app.Application ) v0 ).unregisterActivityLifecycleCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
		 return;
	 } // .end method
