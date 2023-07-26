public class c.w.a.a.d implements android.graphics.drawable.Drawable$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.w.a.a.g b; //synthetic
	 /* # direct methods */
	 public c.w.a.a.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void invalidateDrawable ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.b;
		 (( android.graphics.drawable.Drawable ) p1 ).invalidateSelf ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
		 return;
	 } // .end method
	 public void scheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1, Long p2 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.b;
		 (( android.graphics.drawable.Drawable ) p1 ).scheduleSelf ( p2, p3, p4 ); // invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V
		 return;
	 } // .end method
	 public void unscheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.b;
		 (( android.graphics.drawable.Drawable ) p1 ).unscheduleSelf ( p2 ); // invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
