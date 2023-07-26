public class c.b.q.n1 implements android.view.View$OnTouchListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.p1 b; //synthetic
	 /* # direct methods */
	 public c.b.q.n1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = 		 (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
		 /* .line 2 */
		 v0 = 		 (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
		 /* float-to-int v0, v0 */
		 /* .line 3 */
		 p2 = 		 (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
		 /* float-to-int p2, p2 */
		 /* if-nez p1, :cond_0 */
		 /* .line 4 */
		 v1 = this.b;
		 v1 = this.F;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 5 */
			 v1 = 			 (( android.widget.PopupWindow ) v1 ).isShowing ( ); // invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* if-ltz v0, :cond_0 */
				 v1 = this.b;
				 v1 = this.F;
				 /* .line 6 */
				 v1 = 				 (( android.widget.PopupWindow ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/widget/PopupWindow;->getWidth()I
				 /* if-ge v0, v1, :cond_0 */
				 /* if-ltz p2, :cond_0 */
				 v0 = this.b;
				 v0 = this.F;
				 v0 = 				 (( android.widget.PopupWindow ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->getHeight()I
				 /* if-ge p2, v0, :cond_0 */
				 /* .line 7 */
				 p1 = this.b;
				 p2 = this.B;
				 p1 = this.x;
				 /* const-wide/16 v0, 0xfa */
				 (( android.os.Handler ) p2 ).postDelayed ( p1, v0, v1 ); // invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
			 } // :cond_0
			 int p2 = 1; // const/4 p2, 0x1
			 /* if-ne p1, p2, :cond_1 */
			 /* .line 8 */
			 p1 = this.b;
			 p2 = this.B;
			 p1 = this.x;
			 (( android.os.Handler ) p2 ).removeCallbacks ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
		 } // :cond_1
	 } // :goto_0
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
