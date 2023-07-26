public class c.b.q.c0 extends android.widget.RatingBar {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.q.a0 b;
	 /* # direct methods */
	 public c.b.q.c0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Lc/b/q/c0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public c.b.q.c0 ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/RatingBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 /* new-instance p1, Lc/b/q/a0; */
		 /* invoke-direct {p1, p0}, Lc/b/q/a0;-><init>(Landroid/widget/ProgressBar;)V */
		 this.b = p1;
		 /* .line 4 */
		 (( c.b.q.a0 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/a0;->a(Landroid/util/AttributeSet;I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 /* .line 1 */
		 try { // :try_start_0
			 /* invoke-super {p0, p1, p2}, Landroid/widget/RatingBar;->onMeasure(II)V */
			 /* .line 2 */
			 p2 = this.b;
			 (( c.b.q.a0 ) p2 ).b ( ); // invoke-virtual {p2}, Lc/b/q/a0;->b()Landroid/graphics/Bitmap;
			 if ( p2 != null) { // if-eqz p2, :cond_0
				 /* .line 3 */
				 p2 = 				 (( android.graphics.Bitmap ) p2 ).getWidth ( ); // invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I
				 v0 = 				 (( android.widget.RatingBar ) p0 ).getNumStars ( ); // invoke-virtual {p0}, Landroid/widget/RatingBar;->getNumStars()I
				 /* mul-int p2, p2, v0 */
				 int v0 = 0; // const/4 v0, 0x0
				 /* .line 4 */
				 p1 = 				 android.view.View .resolveSizeAndState ( p2,p1,v0 );
				 /* .line 5 */
				 p2 = 				 (( android.widget.RatingBar ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/widget/RatingBar;->getMeasuredHeight()I
				 /* .line 6 */
				 (( android.widget.RatingBar ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/widget/RatingBar;->setMeasuredDimension(II)V
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 7 */
			 } // :cond_0
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
