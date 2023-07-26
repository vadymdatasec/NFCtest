public class c.b.k.k0 extends androidx.appcompat.widget.ContentFrameLayout {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.k.n0 j; //synthetic
	 /* # direct methods */
	 public c.b.k.k0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.j = p1;
		 /* .line 2 */
		 /* invoke-direct {p0, p2}, Landroidx/appcompat/widget/ContentFrameLayout;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Boolean a ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 int v0 = -5; // const/4 v0, -0x5
		 /* if-lt p1, v0, :cond_1 */
		 /* if-lt p2, v0, :cond_1 */
		 /* .line 1 */
		 v0 = 		 (( android.widget.FrameLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I
		 /* add-int/lit8 v0, v0, 0x5 */
		 /* if-gt p1, v0, :cond_1 */
		 p1 = 		 (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
		 /* add-int/lit8 p1, p1, 0x5 */
		 /* if-le p2, p1, :cond_0 */
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
v0 = (( c.b.k.n0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/n0;->a(Landroid/view/KeyEvent;)Z
/* if-nez v0, :cond_1 */
/* .line 2 */
p1 = /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
/* .line 3 */
v1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v1, v1 */
/* .line 4 */
v0 = (( c.b.k.k0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/b/k/k0;->a(II)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
p1 = this.j;
int v0 = 0; // const/4 v0, 0x0
(( c.b.k.n0 ) p1 ).e ( v0 ); // invoke-virtual {p1, v0}, Lc/b/k/n0;->e(I)V
int p1 = 1; // const/4 p1, 0x1
/* .line 6 */
} // :cond_0
p1 = /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void setBackgroundResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.widget.FrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;
c.b.l.a.b .c ( v0,p1 );
(( android.widget.FrameLayout ) p0 ).setBackgroundDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
