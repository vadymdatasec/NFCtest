public class c.b.q.e0 extends c.b.q.a0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.widget.SeekBar d;
	 public android.graphics.drawable.Drawable e;
	 public android.content.res.ColorStateList f;
	 public android.graphics.PorterDuff$Mode g;
	 public Boolean h;
	 public Boolean i;
	 /* # direct methods */
	 public c.b.q.e0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Lc/b/q/a0;-><init>(Landroid/widget/ProgressBar;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.f = v0;
		 /* .line 3 */
		 this.g = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lc/b/q/e0;->h:Z */
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lc/b/q/e0;->i:Z */
		 /* .line 6 */
		 this.d = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.Canvas p0 ) {
		 /* .locals 6 */
		 /* .line 15 */
		 v0 = this.e;
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 16 */
			 v0 = this.d;
			 v0 = 			 (( android.widget.SeekBar ) v0 ).getMax ( ); // invoke-virtual {v0}, Landroid/widget/SeekBar;->getMax()I
			 int v1 = 1; // const/4 v1, 0x1
			 /* if-le v0, v1, :cond_3 */
			 /* .line 17 */
			 v2 = this.e;
			 v2 = 			 (( android.graphics.drawable.Drawable ) v2 ).getIntrinsicWidth ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
			 /* .line 18 */
			 v3 = this.e;
			 v3 = 			 (( android.graphics.drawable.Drawable ) v3 ).getIntrinsicHeight ( ); // invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
			 /* if-ltz v2, :cond_0 */
			 /* .line 19 */
			 /* div-int/lit8 v2, v2, 0x2 */
		 } // :cond_0
		 int v2 = 1; // const/4 v2, 0x1
	 } // :goto_0
	 /* if-ltz v3, :cond_1 */
	 /* .line 20 */
	 /* div-int/lit8 v1, v3, 0x2 */
	 /* .line 21 */
} // :cond_1
v3 = this.e;
/* neg-int v4, v2 */
/* neg-int v5, v1 */
(( android.graphics.drawable.Drawable ) v3 ).setBounds ( v4, v5, v2, v1 ); // invoke-virtual {v3, v4, v5, v2, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 22 */
v1 = this.d;
v1 = (( android.widget.SeekBar ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/widget/SeekBar;->getWidth()I
v2 = this.d;
v2 = (( android.widget.SeekBar ) v2 ).getPaddingLeft ( ); // invoke-virtual {v2}, Landroid/widget/SeekBar;->getPaddingLeft()I
/* sub-int/2addr v1, v2 */
v2 = this.d;
/* .line 23 */
v2 = (( android.widget.SeekBar ) v2 ).getPaddingRight ( ); // invoke-virtual {v2}, Landroid/widget/SeekBar;->getPaddingRight()I
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* int-to-float v2, v0 */
/* div-float/2addr v1, v2 */
/* .line 24 */
v2 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 25 */
v3 = this.d;
v3 = (( android.widget.SeekBar ) v3 ).getPaddingLeft ( ); // invoke-virtual {v3}, Landroid/widget/SeekBar;->getPaddingLeft()I
/* int-to-float v3, v3 */
v4 = this.d;
v4 = (( android.widget.SeekBar ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/widget/SeekBar;->getHeight()I
/* div-int/lit8 v4, v4, 0x2 */
/* int-to-float v4, v4 */
(( android.graphics.Canvas ) p1 ).translate ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-gt v3, v0, :cond_2 */
/* .line 26 */
v4 = this.e;
(( android.graphics.drawable.Drawable ) v4 ).draw ( p1 ); // invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
int v4 = 0; // const/4 v4, 0x0
/* .line 27 */
(( android.graphics.Canvas ) p1 ).translate ( v1, v4 ); // invoke-virtual {p1, v1, v4}, Landroid/graphics/Canvas;->translate(FF)V
/* add-int/lit8 v3, v3, 0x1 */
/* .line 28 */
} // :cond_2
(( android.graphics.Canvas ) p1 ).restoreToCount ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V
} // :cond_3
return;
} // .end method
public void a ( android.util.AttributeSet p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/b/q/a0;->a(Landroid/util/AttributeSet;I)V */
/* .line 2 */
v0 = this.d;
(( android.widget.SeekBar ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/widget/SeekBar;->getContext()Landroid/content/Context;
v1 = c.b.j.AppCompatSeekBar;
int v2 = 0; // const/4 v2, 0x0
c.b.q.k2 .a ( v0,p1,v1,p2,v2 );
/* .line 3 */
(( c.b.q.k2 ) p1 ).c ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->c(I)Landroid/graphics/drawable/Drawable;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 4 */
v0 = this.d;
(( android.widget.SeekBar ) v0 ).setThumb ( p2 ); // invoke-virtual {v0, p2}, Landroid/widget/SeekBar;->setThumb(Landroid/graphics/drawable/Drawable;)V
/* .line 5 */
} // :cond_0
(( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
/* .line 6 */
(( c.b.q.e0 ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/e0;->b(Landroid/graphics/drawable/Drawable;)V
/* .line 7 */
p2 = (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
int v0 = 1; // const/4 v0, 0x1
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 8 */
int v1 = -1; // const/4 v1, -0x1
p2 = (( c.b.q.k2 ) p1 ).d ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/b/q/k2;->d(II)I
v1 = this.g;
c.b.q.a1 .a ( p2,v1 );
this.g = p2;
/* .line 9 */
/* iput-boolean v0, p0, Lc/b/q/e0;->i:Z */
/* .line 10 */
} // :cond_1
p2 = (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 11 */
(( c.b.q.k2 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;
this.f = p2;
/* .line 12 */
/* iput-boolean v0, p0, Lc/b/q/e0;->h:Z */
/* .line 13 */
} // :cond_2
(( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
/* .line 14 */
(( c.b.q.e0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/q/e0;->c()V
return;
} // .end method
public void b ( android.graphics.drawable.Drawable p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( android.graphics.drawable.Drawable ) v0 ).setCallback ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 3 */
} // :cond_0
this.e = p1;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 4 */
v0 = this.d;
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
/* .line 5 */
v0 = this.d;
v0 = c.h.n.v0 .o ( v0 );
c.h.g.r.a .a ( p1,v0 );
/* .line 6 */
v0 = (( android.graphics.drawable.Drawable ) p1 ).isStateful ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
v0 = this.d;
(( android.widget.SeekBar ) v0 ).getDrawableState ( ); // invoke-virtual {v0}, Landroid/widget/SeekBar;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) p1 ).setState ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
/* .line 8 */
} // :cond_1
(( c.b.q.e0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/q/e0;->c()V
/* .line 9 */
} // :cond_2
p1 = this.d;
(( android.widget.SeekBar ) p1 ).invalidate ( ); // invoke-virtual {p1}, Landroid/widget/SeekBar;->invalidate()V
return;
} // .end method
public final void c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget-boolean v0, p0, Lc/b/q/e0;->h:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lc/b/q/e0;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 2 */
} // :cond_0
v0 = this.e;
(( android.graphics.drawable.Drawable ) v0 ).mutate ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;
c.h.g.r.a .h ( v0 );
this.e = v0;
/* .line 3 */
/* iget-boolean v1, p0, Lc/b/q/e0;->h:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
v1 = this.f;
c.h.g.r.a .a ( v0,v1 );
/* .line 5 */
} // :cond_1
/* iget-boolean v0, p0, Lc/b/q/e0;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
v0 = this.e;
v1 = this.g;
c.h.g.r.a .a ( v0,v1 );
/* .line 7 */
} // :cond_2
v0 = this.e;
v0 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 8 */
v0 = this.e;
v1 = this.d;
(( android.widget.SeekBar ) v1 ).getDrawableState ( ); // invoke-virtual {v1}, Landroid/widget/SeekBar;->getDrawableState()[I
(( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
} // :cond_3
return;
} // .end method
public void d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = (( android.graphics.drawable.Drawable ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.d;
/* .line 3 */
(( android.widget.SeekBar ) v1 ).getDrawableState ( ); // invoke-virtual {v1}, Landroid/widget/SeekBar;->getDrawableState()[I
v1 = (( android.graphics.drawable.Drawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 4 */
	 v1 = this.d;
	 (( android.widget.SeekBar ) v1 ).invalidateDrawable ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
return;
} // .end method
public void e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( android.graphics.drawable.Drawable ) v0 ).jumpToCurrentState ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V
} // :cond_0
return;
} // .end method
