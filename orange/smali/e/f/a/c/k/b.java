public abstract class e.f.a.c.k.b extends e.f.a.c.k.d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/f/a/c/k/b$a; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<V:", */
/* "Landroid/view/View;", */
/* ">", */
/* "Le/f/a/c/k/d<", */
/* "TV;>;" */
/* } */
} // .end annotation
/* # instance fields */
public java.lang.Runnable d;
public android.widget.OverScroller e;
public Boolean f;
public Integer g;
public Integer h;
public Integer i;
public android.view.VelocityTracker j;
/* # direct methods */
public e.f.a.c.k.b ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Le/f/a/c/k/d;-><init>()V */
int v0 = -1; // const/4 v0, -0x1
/* .line 2 */
/* iput v0, p0, Le/f/a/c/k/b;->g:I */
/* .line 3 */
/* iput v0, p0, Le/f/a/c/k/b;->i:I */
return;
} // .end method
public e.f.a.c.k.b ( ) {
/* .locals 0 */
/* .line 4 */
/* invoke-direct {p0, p1, p2}, Le/f/a/c/k/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int p1 = -1; // const/4 p1, -0x1
/* .line 5 */
/* iput p1, p0, Le/f/a/c/k/b;->g:I */
/* .line 6 */
/* iput p1, p0, Le/f/a/c/k/b;->i:I */
return;
} // .end method
/* # virtual methods */
public final Integer a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;III)I" */
/* } */
} // .end annotation
/* .line 28 */
v0 = (( e.f.a.c.k.b ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/c/k/b;->d()I
/* sub-int v4, v0, p3 */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move v5, p4 */
/* move v6, p5 */
/* .line 29 */
p1 = /* invoke-virtual/range {v1 ..v6}, Le/f/a/c/k/b;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I */
} // .end method
public abstract Boolean a ( android.view.View p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TV;)Z" */
/* } */
} // .end annotation
} // .end method
public final Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2, Integer p3, Float p4 ) {
/* .locals 13 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;IIF)Z" */
/* } */
} // .end annotation
/* move-object v0, p0 */
/* move-object v1, p2 */
/* .line 30 */
v2 = this.d;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 31 */
(( android.view.View ) p2 ).removeCallbacks ( v2 ); // invoke-virtual {p2, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
int v2 = 0; // const/4 v2, 0x0
/* .line 32 */
this.d = v2;
/* .line 33 */
} // :cond_0
v2 = this.e;
/* if-nez v2, :cond_1 */
/* .line 34 */
/* new-instance v2, Landroid/widget/OverScroller; */
(( android.view.View ) p2 ).getContext ( ); // invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;
/* invoke-direct {v2, v3}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V */
this.e = v2;
/* .line 35 */
} // :cond_1
v4 = this.e;
int v5 = 0; // const/4 v5, 0x0
/* .line 36 */
v6 = (( e.f.a.c.k.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/k/d;->b()I
int v7 = 0; // const/4 v7, 0x0
/* .line 37 */
v8 = /* invoke-static/range {p5 ..p5}, Ljava/lang/Math;->round(F)I */
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
/* move/from16 v11, p3 */
/* move/from16 v12, p4 */
/* .line 38 */
/* invoke-virtual/range {v4 ..v12}, Landroid/widget/OverScroller;->fling(IIIIIIII)V */
/* .line 39 */
v2 = this.e;
v2 = (( android.widget.OverScroller ) v2 ).computeScrollOffset ( ); // invoke-virtual {v2}, Landroid/widget/OverScroller;->computeScrollOffset()Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 40 */
/* new-instance v2, Le/f/a/c/k/b$a; */
/* move-object v3, p1 */
/* invoke-direct {v2, p0, p1, p2}, Le/f/a/c/k/b$a;-><init>(Le/f/a/c/k/b;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V */
this.d = v2;
/* .line 41 */
c.h.n.v0 .a ( p2,v2 );
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
/* move-object v3, p1 */
/* .line 42 */
(( e.f.a.c.k.b ) p0 ).e ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/c/k/b;->e(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V
int v1 = 0; // const/4 v1, 0x0
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.MotionEvent p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/MotionEvent;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Le/f/a/c/k/b;->i:I */
/* if-gez v0, :cond_0 */
/* .line 2 */
(( android.view.ViewGroup ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
android.view.ViewConfiguration .get ( v0 );
v0 = (( android.view.ViewConfiguration ) v0 ).getScaledTouchSlop ( ); // invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
/* iput v0, p0, Le/f/a/c/k/b;->i:I */
/* .line 3 */
} // :cond_0
v0 = (( android.view.MotionEvent ) p3 ).getAction ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I
int v1 = 2; // const/4 v1, 0x2
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v1, :cond_1 */
/* .line 4 */
/* iget-boolean v0, p0, Le/f/a/c/k/b;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
} // :cond_1
v0 = (( android.view.MotionEvent ) p3 ).getActionMasked ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_6
int p1 = -1; // const/4 p1, -0x1
/* if-eq v0, v2, :cond_5 */
/* if-eq v0, v1, :cond_2 */
int p2 = 3; // const/4 p2, 0x3
/* if-eq v0, p2, :cond_5 */
/* .line 6 */
} // :cond_2
/* iget p2, p0, Le/f/a/c/k/b;->g:I */
/* if-ne p2, p1, :cond_3 */
/* .line 7 */
} // :cond_3
p2 = (( android.view.MotionEvent ) p3 ).findPointerIndex ( p2 ); // invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-ne p2, p1, :cond_4 */
/* .line 8 */
} // :cond_4
p1 = (( android.view.MotionEvent ) p3 ).getY ( p2 ); // invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int p1, p1 */
/* .line 9 */
/* iget p2, p0, Le/f/a/c/k/b;->h:I */
/* sub-int p2, p1, p2 */
p2 = java.lang.Math .abs ( p2 );
/* .line 10 */
/* iget v0, p0, Le/f/a/c/k/b;->i:I */
/* if-le p2, v0, :cond_7 */
/* .line 11 */
/* iput-boolean v2, p0, Le/f/a/c/k/b;->f:Z */
/* .line 12 */
/* iput p1, p0, Le/f/a/c/k/b;->h:I */
/* .line 13 */
} // :cond_5
/* iput-boolean v3, p0, Le/f/a/c/k/b;->f:Z */
/* .line 14 */
/* iput p1, p0, Le/f/a/c/k/b;->g:I */
/* .line 15 */
p1 = this.j;
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 16 */
(( android.view.VelocityTracker ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V
int p1 = 0; // const/4 p1, 0x0
/* .line 17 */
this.j = p1;
/* .line 18 */
} // :cond_6
/* iput-boolean v3, p0, Le/f/a/c/k/b;->f:Z */
/* .line 19 */
v0 = (( android.view.MotionEvent ) p3 ).getX ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
/* .line 20 */
v1 = (( android.view.MotionEvent ) p3 ).getY ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v1, v1 */
/* .line 21 */
v2 = (( e.f.a.c.k.b ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/a/c/k/b;->a(Landroid/view/View;)Z
if ( v2 != null) { // if-eqz v2, :cond_7
p1 = (( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).a ( p2, v0, v1 ); // invoke-virtual {p1, p2, v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;II)Z
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 22 */
/* iput v1, p0, Le/f/a/c/k/b;->h:I */
/* .line 23 */
p1 = (( android.view.MotionEvent ) p3 ).getPointerId ( v3 ); // invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Le/f/a/c/k/b;->g:I */
/* .line 24 */
(( e.f.a.c.k.b ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/k/b;->c()V
/* .line 25 */
} // :cond_7
} // :goto_0
p1 = this.j;
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 26 */
(( android.view.VelocityTracker ) p1 ).addMovement ( p3 ); // invoke-virtual {p1, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
/* .line 27 */
} // :cond_8
/* iget-boolean p1, p0, Le/f/a/c/k/b;->f:Z */
} // .end method
public abstract Integer b ( android.view.View p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TV;)I" */
/* } */
} // .end annotation
} // .end method
public abstract Integer b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2, Integer p3, Integer p4 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;III)I" */
/* } */
} // .end annotation
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.MotionEvent p2 ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/MotionEvent;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Le/f/a/c/k/b;->i:I */
/* if-gez v0, :cond_0 */
/* .line 2 */
(( android.view.ViewGroup ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
android.view.ViewConfiguration .get ( v0 );
v0 = (( android.view.ViewConfiguration ) v0 ).getScaledTouchSlop ( ); // invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
/* iput v0, p0, Le/f/a/c/k/b;->i:I */
/* .line 3 */
} // :cond_0
v0 = (( android.view.MotionEvent ) p3 ).getActionMasked ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_7
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v1, :cond_5 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq v0, v4, :cond_1 */
int p1 = 3; // const/4 p1, 0x3
/* if-eq v0, p1, :cond_6 */
/* goto/16 :goto_1 */
/* .line 4 */
} // :cond_1
/* iget v0, p0, Le/f/a/c/k/b;->g:I */
v0 = (( android.view.MotionEvent ) p3 ).findPointerIndex ( v0 ); // invoke-virtual {p3, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-ne v0, v3, :cond_2 */
/* .line 5 */
} // :cond_2
v0 = (( android.view.MotionEvent ) p3 ).getY ( v0 ); // invoke-virtual {p3, v0}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v0, v0 */
/* .line 6 */
/* iget v2, p0, Le/f/a/c/k/b;->h:I */
/* sub-int/2addr v2, v0 */
/* .line 7 */
/* iget-boolean v3, p0, Le/f/a/c/k/b;->f:Z */
/* if-nez v3, :cond_4 */
v3 = java.lang.Math .abs ( v2 );
/* iget v4, p0, Le/f/a/c/k/b;->i:I */
/* if-le v3, v4, :cond_4 */
/* .line 8 */
/* iput-boolean v1, p0, Le/f/a/c/k/b;->f:Z */
/* if-lez v2, :cond_3 */
/* sub-int/2addr v2, v4 */
} // :cond_3
/* add-int/2addr v2, v4 */
} // :cond_4
} // :goto_0
/* move v6, v2 */
/* .line 9 */
/* iget-boolean v2, p0, Le/f/a/c/k/b;->f:Z */
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 10 */
/* iput v0, p0, Le/f/a/c/k/b;->h:I */
/* .line 11 */
v7 = (( e.f.a.c.k.b ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/f/a/c/k/b;->b(Landroid/view/View;)I
int v8 = 0; // const/4 v8, 0x0
/* move-object v3, p0 */
/* move-object v4, p1 */
/* move-object v5, p2 */
/* invoke-virtual/range {v3 ..v8}, Le/f/a/c/k/b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I */
/* .line 12 */
} // :cond_5
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 13 */
(( android.view.VelocityTracker ) v0 ).addMovement ( p3 ); // invoke-virtual {v0, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
/* .line 14 */
v0 = this.j;
/* const/16 v4, 0x3e8 */
(( android.view.VelocityTracker ) v0 ).computeCurrentVelocity ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V
/* .line 15 */
v0 = this.j;
/* iget v4, p0, Le/f/a/c/k/b;->g:I */
v10 = (( android.view.VelocityTracker ) v0 ).getYVelocity ( v4 ); // invoke-virtual {v0, v4}, Landroid/view/VelocityTracker;->getYVelocity(I)F
/* .line 16 */
v0 = (( e.f.a.c.k.b ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/f/a/c/k/b;->c(Landroid/view/View;)I
/* neg-int v8, v0 */
int v9 = 0; // const/4 v9, 0x0
/* move-object v5, p0 */
/* move-object v6, p1 */
/* move-object v7, p2 */
/* invoke-virtual/range {v5 ..v10}, Le/f/a/c/k/b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIF)Z */
/* .line 17 */
} // :cond_6
/* iput-boolean v2, p0, Le/f/a/c/k/b;->f:Z */
/* .line 18 */
/* iput v3, p0, Le/f/a/c/k/b;->g:I */
/* .line 19 */
p1 = this.j;
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 20 */
(( android.view.VelocityTracker ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V
int p1 = 0; // const/4 p1, 0x0
/* .line 21 */
this.j = p1;
/* .line 22 */
} // :cond_7
v0 = (( android.view.MotionEvent ) p3 ).getX ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
/* .line 23 */
v3 = (( android.view.MotionEvent ) p3 ).getY ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v3, v3 */
/* .line 24 */
p1 = (( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).a ( p2, v0, v3 ); // invoke-virtual {p1, p2, v0, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;II)Z
if ( p1 != null) { // if-eqz p1, :cond_a
p1 = (( e.f.a.c.k.b ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/a/c/k/b;->a(Landroid/view/View;)Z
if ( p1 != null) { // if-eqz p1, :cond_a
/* .line 25 */
/* iput v3, p0, Le/f/a/c/k/b;->h:I */
/* .line 26 */
p1 = (( android.view.MotionEvent ) p3 ).getPointerId ( v2 ); // invoke-virtual {p3, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Le/f/a/c/k/b;->g:I */
/* .line 27 */
(( e.f.a.c.k.b ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/c/k/b;->c()V
/* .line 28 */
} // :cond_8
} // :goto_1
p1 = this.j;
if ( p1 != null) { // if-eqz p1, :cond_9
/* .line 29 */
(( android.view.VelocityTracker ) p1 ).addMovement ( p3 ); // invoke-virtual {p1, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
} // :cond_9
} // :cond_a
} // .end method
public abstract Integer c ( android.view.View p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TV;)I" */
/* } */
} // .end annotation
} // .end method
public Integer c ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;I)I" */
/* } */
} // .end annotation
/* const/high16 v4, -0x80000000 */
/* const v5, 0x7fffffff */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move v3, p3 */
/* .line 1 */
p1 = /* invoke-virtual/range {v0 ..v5}, Le/f/a/c/k/b;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I */
} // .end method
public final void c ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.j;
/* if-nez v0, :cond_0 */
/* .line 3 */
android.view.VelocityTracker .obtain ( );
this.j = v0;
} // :cond_0
return;
} // .end method
public abstract Integer d ( ) {
} // .end method
public abstract void e ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;)V" */
/* } */
} // .end annotation
} // .end method
