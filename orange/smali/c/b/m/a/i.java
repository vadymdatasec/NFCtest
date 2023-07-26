public class c.b.m.a.i implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.m.a.l b; //synthetic
	 /* # direct methods */
	 public c.b.m.a.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 int v1 = 1; // const/4 v1, 0x1
		 (( c.b.m.a.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/m/a/l;->a(Z)V
		 /* .line 2 */
		 v0 = this.b;
		 (( android.graphics.drawable.Drawable ) v0 ).invalidateSelf ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
		 return;
	 } // .end method
