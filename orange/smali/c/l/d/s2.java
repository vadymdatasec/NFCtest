public class c.l.d.s2 extends android.transition.Transition$EpicenterCallback {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.graphics.Rect a; //synthetic
	 /* # direct methods */
	 public c.l.d.s2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 /* invoke-direct {p0}, Landroid/transition/Transition$EpicenterCallback;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.Rect onGetEpicenter ( android.transition.Transition p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.a;
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 p1 = 			 (( android.graphics.Rect ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 /* .line 2 */
			 } // :cond_0
			 p1 = this.a;
		 } // :cond_1
	 } // :goto_0
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
