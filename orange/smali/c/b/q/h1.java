public abstract class c.b.q.h1 implements android.view.View$OnTouchListener implements android.view.View$OnAttachStateChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Float b;
	 public final Integer c;
	 public final Integer d;
	 public final android.view.View e;
	 public java.lang.Runnable f;
	 public java.lang.Runnable g;
	 public Boolean h;
	 public Integer i;
	 public final j;
	 /* # direct methods */
	 public c.b.q.h1 ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v1, v0, [I */
		 /* .line 2 */
		 this.j = v1;
		 /* .line 3 */
		 this.e = p1;
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 4 */
		 (( android.view.View ) p1 ).setLongClickable ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/View;->setLongClickable(Z)V
		 /* .line 5 */
		 (( android.view.View ) p1 ).addOnAttachStateChangeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
		 /* .line 6 */
		 (( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
		 android.view.ViewConfiguration .get ( p1 );
		 p1 = 		 (( android.view.ViewConfiguration ) p1 ).getScaledTouchSlop ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
		 /* int-to-float p1, p1 */
		 /* iput p1, p0, Lc/b/q/h1;->b:F */
		 /* .line 7 */
		 p1 = 		 android.view.ViewConfiguration .getTapTimeout ( );
		 /* iput p1, p0, Lc/b/q/h1;->c:I */
		 /* .line 8 */
		 v1 = 		 android.view.ViewConfiguration .getLongPressTimeout ( );
		 /* add-int/2addr p1, v1 */
		 /* div-int/2addr p1, v0 */
		 /* iput p1, p0, Lc/b/q/h1;->d:I */
		 return;
	 } // .end method
	 public static Boolean a ( android.view.View p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 2 */
		 /* neg-float v0, p3 */
		 /* cmpl-float v1, p1, v0 */
		 /* if-ltz v1, :cond_0 */
		 /* cmpl-float v0, p2, v0 */
		 /* if-ltz v0, :cond_0 */
		 /* .line 16 */
		 v0 = 		 (( android.view.View ) p0 ).getRight ( ); // invoke-virtual {p0}, Landroid/view/View;->getRight()I
		 v1 = 		 (( android.view.View ) p0 ).getLeft ( ); // invoke-virtual {p0}, Landroid/view/View;->getLeft()I
		 /* sub-int/2addr v0, v1 */
		 /* int-to-float v0, v0 */
		 /* add-float/2addr v0, p3 */
		 /* cmpg-float p1, p1, v0 */
		 /* if-gez p1, :cond_0 */
		 /* .line 17 */
		 p1 = 		 (( android.view.View ) p0 ).getBottom ( ); // invoke-virtual {p0}, Landroid/view/View;->getBottom()I
		 p0 = 		 (( android.view.View ) p0 ).getTop ( ); // invoke-virtual {p0}, Landroid/view/View;->getTop()I
		 /* sub-int/2addr p1, p0 */
		 /* int-to-float p0, p1 */
		 /* add-float/2addr p0, p3 */
		 /* cmpg-float p0, p2, p0 */
		 /* if-gez p0, :cond_0 */
		 int p0 = 1; // const/4 p0, 0x1
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 v1 = this.e;
	 (( android.view.View ) v1 ).removeCallbacks ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
	 /* .line 3 */
} // :cond_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 4 */
	 v1 = this.e;
	 (( android.view.View ) v1 ).removeCallbacks ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
} // :cond_1
return;
} // .end method
public final Boolean a ( android.view.MotionEvent p0 ) {
/* .locals 4 */
/* .line 5 */
v0 = this.e;
/* .line 6 */
(( c.b.q.h1 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/h1;->b()Lc/b/p/o/c0;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_3
	 v3 = 	 /* .line 7 */
	 /* if-nez v3, :cond_0 */
	 /* .line 8 */
} // :cond_0
/* check-cast v1, Lc/b/q/d1; */
if ( v1 != null) { // if-eqz v1, :cond_3
	 /* .line 9 */
	 v3 = 	 (( android.widget.ListView ) v1 ).isShown ( ); // invoke-virtual {v1}, Landroid/widget/ListView;->isShown()Z
	 /* if-nez v3, :cond_1 */
	 /* .line 10 */
} // :cond_1
android.view.MotionEvent .obtainNoHistory ( p1 );
/* .line 11 */
(( c.b.q.h1 ) p0 ).a ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Lc/b/q/h1;->a(Landroid/view/View;Landroid/view/MotionEvent;)Z
/* .line 12 */
(( c.b.q.h1 ) p0 ).b ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Lc/b/q/h1;->b(Landroid/view/View;Landroid/view/MotionEvent;)Z
/* .line 13 */
/* iget v0, p0, Lc/b/q/h1;->i:I */
v0 = (( c.b.q.d1 ) v1 ).a ( v3, v0 ); // invoke-virtual {v1, v3, v0}, Lc/b/q/d1;->a(Landroid/view/MotionEvent;I)Z
/* .line 14 */
(( android.view.MotionEvent ) v3 ).recycle ( ); // invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V
/* .line 15 */
p1 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 1; // const/4 v1, 0x1
/* if-eq p1, v1, :cond_2 */
int v3 = 3; // const/4 v3, 0x3
/* if-eq p1, v3, :cond_2 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_3
if ( p1 != null) { // if-eqz p1, :cond_3
int v2 = 1; // const/4 v2, 0x1
} // :cond_3
} // :goto_1
} // .end method
public final Boolean a ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 2 */
/* .line 18 */
v0 = this.j;
/* .line 19 */
(( android.view.View ) p1 ).getLocationOnScreen ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V
int p1 = 0; // const/4 p1, 0x0
/* .line 20 */
/* aget p1, v0, p1 */
/* int-to-float p1, p1 */
int v1 = 1; // const/4 v1, 0x1
/* aget v0, v0, v1 */
/* int-to-float v0, v0 */
(( android.view.MotionEvent ) p2 ).offsetLocation ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V
} // .end method
public abstract c.b.p.o.c0 b ( ) {
} // .end method
public final Boolean b ( android.view.MotionEvent p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.e;
/* .line 2 */
v1 = (( android.view.View ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_0 */
/* .line 3 */
} // :cond_0
v1 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
if ( v1 != null) { // if-eqz v1, :cond_3
int v3 = 1; // const/4 v3, 0x1
/* if-eq v1, v3, :cond_2 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq v1, v4, :cond_1 */
int p1 = 3; // const/4 p1, 0x3
/* if-eq v1, p1, :cond_2 */
/* .line 4 */
} // :cond_1
/* iget v1, p0, Lc/b/q/h1;->i:I */
v1 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-ltz v1, :cond_6 */
/* .line 5 */
v4 = (( android.view.MotionEvent ) p1 ).getX ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F
/* .line 6 */
p1 = (( android.view.MotionEvent ) p1 ).getY ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F
/* .line 7 */
/* iget v1, p0, Lc/b/q/h1;->b:F */
p1 = c.b.q.h1 .a ( v0,v4,p1,v1 );
/* if-nez p1, :cond_6 */
/* .line 8 */
(( c.b.q.h1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/h1;->a()V
/* .line 9 */
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 10 */
} // :cond_2
(( c.b.q.h1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/h1;->a()V
/* .line 11 */
} // :cond_3
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Lc/b/q/h1;->i:I */
/* .line 12 */
p1 = this.f;
/* if-nez p1, :cond_4 */
/* .line 13 */
/* new-instance p1, Lc/b/q/f1; */
/* invoke-direct {p1, p0}, Lc/b/q/f1;-><init>(Lc/b/q/h1;)V */
this.f = p1;
/* .line 14 */
} // :cond_4
p1 = this.f;
/* iget v1, p0, Lc/b/q/h1;->c:I */
/* int-to-long v3, v1 */
(( android.view.View ) v0 ).postDelayed ( p1, v3, v4 ); // invoke-virtual {v0, p1, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 15 */
p1 = this.g;
/* if-nez p1, :cond_5 */
/* .line 16 */
/* new-instance p1, Lc/b/q/g1; */
/* invoke-direct {p1, p0}, Lc/b/q/g1;-><init>(Lc/b/q/h1;)V */
this.g = p1;
/* .line 17 */
} // :cond_5
p1 = this.g;
/* iget v1, p0, Lc/b/q/h1;->d:I */
/* int-to-long v3, v1 */
(( android.view.View ) v0 ).postDelayed ( p1, v3, v4 ); // invoke-virtual {v0, p1, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
} // :cond_6
} // :goto_0
} // .end method
public final Boolean b ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 2 */
/* .line 18 */
v0 = this.j;
/* .line 19 */
(( android.view.View ) p1 ).getLocationOnScreen ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V
int p1 = 0; // const/4 p1, 0x0
/* .line 20 */
/* aget p1, v0, p1 */
/* neg-int p1, p1 */
/* int-to-float p1, p1 */
int v1 = 1; // const/4 v1, 0x1
/* aget v0, v0, v1 */
/* neg-int v0, v0 */
/* int-to-float v0, v0 */
(( android.view.MotionEvent ) p2 ).offsetLocation ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V
} // .end method
public abstract Boolean c ( ) {
} // .end method
public Boolean d ( ) {
/* .locals 2 */
/* .line 1 */
(( c.b.q.h1 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/h1;->b()Lc/b/p/o/c0;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = /* .line 2 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void e ( ) {
/* .locals 11 */
/* .line 1 */
(( c.b.q.h1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/q/h1;->a()V
/* .line 2 */
v0 = this.e;
/* .line 3 */
v1 = (( android.view.View ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = (( android.view.View ) v0 ).isLongClickable ( ); // invoke-virtual {v0}, Landroid/view/View;->isLongClickable()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
} // :cond_0
v1 = (( c.b.q.h1 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/q/h1;->c()Z
/* if-nez v1, :cond_1 */
return;
/* .line 5 */
} // :cond_1
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
int v2 = 1; // const/4 v2, 0x1
/* .line 6 */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v5 */
int v7 = 3; // const/4 v7, 0x3
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
/* move-wide v3, v5 */
/* .line 7 */
/* invoke-static/range {v3 ..v10}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent; */
/* .line 8 */
(( android.view.View ) v0 ).onTouchEvent ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
/* .line 9 */
(( android.view.MotionEvent ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V
/* .line 10 */
/* iput-boolean v2, p0, Lc/b/q/h1;->h:Z */
} // :cond_2
} // :goto_0
return;
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 10 */
/* .line 1 */
/* iget-boolean p1, p0, Lc/b/q/h1;->h:Z */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 2 */
p2 = (( c.b.q.h1 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/h1;->a(Landroid/view/MotionEvent;)Z
/* if-nez p2, :cond_1 */
p2 = (( c.b.q.h1 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/q/h1;->d()Z
/* if-nez p2, :cond_0 */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :cond_1
} // :goto_0
int p2 = 1; // const/4 p2, 0x1
/* .line 3 */
} // :cond_2
p2 = (( c.b.q.h1 ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lc/b/q/h1;->b(Landroid/view/MotionEvent;)Z
if ( p2 != null) { // if-eqz p2, :cond_3
p2 = (( c.b.q.h1 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/q/h1;->c()Z
if ( p2 != null) { // if-eqz p2, :cond_3
int p2 = 1; // const/4 p2, 0x1
} // :cond_3
int p2 = 0; // const/4 p2, 0x0
} // :goto_1
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 4 */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v4 */
int v6 = 3; // const/4 v6, 0x3
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
/* move-wide v2, v4 */
/* .line 5 */
/* invoke-static/range {v2 ..v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent; */
/* .line 6 */
v3 = this.e;
(( android.view.View ) v3 ).onTouchEvent ( v2 ); // invoke-virtual {v3, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
/* .line 7 */
(( android.view.MotionEvent ) v2 ).recycle ( ); // invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V
/* .line 8 */
} // :cond_4
} // :goto_2
/* iput-boolean p2, p0, Lc/b/q/h1;->h:Z */
/* if-nez p2, :cond_6 */
if ( p1 != null) { // if-eqz p1, :cond_5
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // :cond_6
} // :goto_3
} // .end method
public void onViewAttachedToWindow ( android.view.View p0 ) {
/* .locals 0 */
return;
} // .end method
public void onViewDetachedFromWindow ( android.view.View p0 ) {
/* .locals 1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
/* iput-boolean p1, p0, Lc/b/q/h1;->h:Z */
int p1 = -1; // const/4 p1, -0x1
/* .line 2 */
/* iput p1, p0, Lc/b/q/h1;->i:I */
/* .line 3 */
p1 = this.f;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
v0 = this.e;
(( android.view.View ) v0 ).removeCallbacks ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
} // :cond_0
return;
} // .end method
