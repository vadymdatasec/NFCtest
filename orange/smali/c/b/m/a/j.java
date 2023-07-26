public class c.b.m.a.j implements android.graphics.drawable.Drawable$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.graphics.drawable.Drawable$Callback b;
	 /* # direct methods */
	 public c.b.m.a.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.drawable.Drawable$Callback a ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 v0 = this.b;
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 3 */
		 this.b = v1;
	 } // .end method
	 public c.b.m.a.j a ( android.graphics.drawable.Drawable$Callback p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
	 } // .end method
	 public void invalidateDrawable ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void scheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1, Long p2 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 return;
	 } // .end method
	 public void unscheduleDrawable ( android.graphics.drawable.Drawable p0, java.lang.Runnable p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 return;
	 } // .end method
