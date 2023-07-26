public class c.b.q.d0 extends android.widget.SeekBar {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.q.e0 b;
	 /* # direct methods */
	 public c.b.q.d0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Lc/b/q/d0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public c.b.q.d0 ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 3 */
		 /* new-instance p1, Lc/b/q/e0; */
		 /* invoke-direct {p1, p0}, Lc/b/q/e0;-><init>(Landroid/widget/SeekBar;)V */
		 this.b = p1;
		 /* .line 4 */
		 (( c.b.q.e0 ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/b/q/e0;->a(Landroid/util/AttributeSet;I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void drawableStateChanged ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Landroid/widget/SeekBar;->drawableStateChanged()V */
		 /* .line 2 */
		 v0 = this.b;
		 (( c.b.q.e0 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/q/e0;->d()V
		 return;
	 } // .end method
	 public void jumpDrawablesToCurrentState ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Landroid/widget/SeekBar;->jumpDrawablesToCurrentState()V */
		 /* .line 2 */
		 v0 = this.b;
		 (( c.b.q.e0 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/q/e0;->e()V
		 return;
	 } // .end method
	 public synchronized void onDraw ( android.graphics.Canvas p0 ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 /* .line 1 */
		 try { // :try_start_0
			 /* invoke-super {p0, p1}, Landroid/widget/SeekBar;->onDraw(Landroid/graphics/Canvas;)V */
			 /* .line 2 */
			 v0 = this.b;
			 (( c.b.q.e0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/e0;->a(Landroid/graphics/Canvas;)V
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 3 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
