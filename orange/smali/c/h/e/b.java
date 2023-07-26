public class c.h.e.b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.app.Activity b; //synthetic
	 /* # direct methods */
	 public c.h.e.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( android.app.Activity ) v0 ).isFinishing ( ); // invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 v0 = this.b;
		 v0 = 		 c.h.e.k .a ( v0 );
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
		 v0 = this.b;
		 (( android.app.Activity ) v0 ).recreate ( ); // invoke-virtual {v0}, Landroid/app/Activity;->recreate()V
	 } // :cond_0
	 return;
} // .end method
