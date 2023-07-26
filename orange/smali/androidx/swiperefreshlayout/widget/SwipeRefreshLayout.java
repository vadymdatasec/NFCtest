public class androidx.swiperefreshlayout.widget.SwipeRefreshLayout extends android.view.ViewGroup implements c.h.n.v implements c.h.n.r {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$i;, */
	 /* Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String P;
public static final Q;
/* # instance fields */
public Integer A;
public Integer B;
public c.t.a.f C;
public android.view.animation.Animation D;
public android.view.animation.Animation E;
public android.view.animation.Animation F;
public android.view.animation.Animation G;
public android.view.animation.Animation H;
public Boolean I;
public Integer J;
public Boolean K;
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i L;
public android.view.animation.Animation$AnimationListener M;
public final android.view.animation.Animation N;
public final android.view.animation.Animation O;
public android.view.View b;
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j c;
public Boolean d;
public Integer e;
public Float f;
public Float g;
public final c.h.n.w h;
public final c.h.n.s i;
public final j;
public final k;
public Boolean l;
public Integer m;
public Integer n;
public Float o;
public Float p;
public Boolean q;
public Integer r;
public Boolean s;
public Boolean t;
public final android.view.animation.DecelerateInterpolator u;
public c.t.a.b v;
public Integer w;
public Integer x;
public Float y;
public Integer z;
/* # direct methods */
public static androidx.swiperefreshlayout.widget.SwipeRefreshLayout ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* const-class v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout; */
	 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [I */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const v2, 0x101000e */
	 /* aput v2, v0, v1 */
	 /* .line 2 */
	 return;
} // .end method
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout ( ) {
	 /* .locals 4 */
	 /* .line 2 */
	 /* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 3 */
	 /* iput-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
	 /* const/high16 v1, -0x40800000 # -1.0f */
	 /* .line 4 */
	 /* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->f:F */
	 int v1 = 2; // const/4 v1, 0x2
	 /* new-array v2, v1, [I */
	 /* .line 5 */
	 this.j = v2;
	 /* new-array v1, v1, [I */
	 /* .line 6 */
	 this.k = v1;
	 int v1 = -1; // const/4 v1, -0x1
	 /* .line 7 */
	 /* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
	 /* .line 8 */
	 /* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->w:I */
	 /* .line 9 */
	 /* new-instance v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$a; */
	 /* invoke-direct {v1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$a;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V */
	 this.M = v1;
	 /* .line 10 */
	 /* new-instance v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f; */
	 /* invoke-direct {v1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V */
	 this.N = v1;
	 /* .line 11 */
	 /* new-instance v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$g; */
	 /* invoke-direct {v1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$g;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V */
	 this.O = v1;
	 /* .line 12 */
	 android.view.ViewConfiguration .get ( p1 );
	 v1 = 	 (( android.view.ViewConfiguration ) v1 ).getScaledTouchSlop ( ); // invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
	 /* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->e:I */
	 /* .line 13 */
	 (( android.view.ViewGroup ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;
	 /* const v2, 0x10e0001 */
	 v1 = 	 (( android.content.res.Resources ) v1 ).getInteger ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I
	 /* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->m:I */
	 /* .line 14 */
	 (( android.view.ViewGroup ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V
	 /* .line 15 */
	 /* new-instance v1, Landroid/view/animation/DecelerateInterpolator; */
	 /* const/high16 v2, 0x40000000 # 2.0f */
	 /* invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V */
	 this.u = v1;
	 /* .line 16 */
	 (( android.view.ViewGroup ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* .line 17 */
	 /* iget v2, v1, Landroid/util/DisplayMetrics;->density:F */
	 /* const/high16 v3, 0x42200000 # 40.0f */
	 /* mul-float v2, v2, v3 */
	 /* float-to-int v2, v2 */
	 /* iput v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->J:I */
	 /* .line 18 */
	 (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->b()V
	 int v2 = 1; // const/4 v2, 0x1
	 /* .line 19 */
	 (( android.view.ViewGroup ) p0 ).setChildrenDrawingOrderEnabled ( v2 ); // invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V
	 /* .line 20 */
	 /* iget v1, v1, Landroid/util/DisplayMetrics;->density:F */
	 /* const/high16 v3, 0x42800000 # 64.0f */
	 /* mul-float v1, v1, v3 */
	 /* float-to-int v1, v1 */
	 /* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->A:I */
	 /* int-to-float v1, v1 */
	 /* .line 21 */
	 /* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->f:F */
	 /* .line 22 */
	 /* new-instance v1, Lc/h/n/w; */
	 /* invoke-direct {v1, p0}, Lc/h/n/w;-><init>(Landroid/view/ViewGroup;)V */
	 this.h = v1;
	 /* .line 23 */
	 /* new-instance v1, Lc/h/n/s; */
	 /* invoke-direct {v1, p0}, Lc/h/n/s;-><init>(Landroid/view/View;)V */
	 this.i = v1;
	 /* .line 24 */
	 (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setNestedScrollingEnabled ( v2 ); // invoke-virtual {p0, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setNestedScrollingEnabled(Z)V
	 /* .line 25 */
	 /* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->J:I */
	 /* neg-int v1, v1 */
	 /* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
	 /* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:I */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 /* .line 26 */
	 (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c(F)V
	 /* .line 27 */
	 v1 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.Q;
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
	 /* .line 28 */
	 p2 = 	 (( android.content.res.TypedArray ) p1 ).getBoolean ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
	 (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setEnabled ( p2 ); // invoke-virtual {p0, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V
	 /* .line 29 */
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 return;
} // .end method
private void setColorViewAlpha ( Integer p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.v;
	 (( android.widget.ImageView ) v0 ).getBackground ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;
	 (( android.graphics.drawable.Drawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
	 /* .line 2 */
	 v0 = this.C;
	 (( c.t.a.f ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/f;->setAlpha(I)V
	 return;
} // .end method
/* # virtual methods */
public final android.view.animation.Animation a ( Integer p0, Integer p1 ) {
	 /* .locals 1 */
	 /* .line 12 */
	 /* new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$d; */
	 /* invoke-direct {v0, p0, p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$d;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;II)V */
	 /* const-wide/16 p1, 0x12c */
	 /* .line 13 */
	 (( android.view.animation.Animation ) v0 ).setDuration ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V
	 /* .line 14 */
	 p1 = this.v;
	 int p2 = 0; // const/4 p2, 0x0
	 (( c.t.a.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/t/a/b;->a(Landroid/view/animation/Animation$AnimationListener;)V
	 /* .line 15 */
	 p1 = this.v;
	 (( android.widget.ImageView ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V
	 /* .line 16 */
	 p1 = this.v;
	 (( android.widget.ImageView ) p1 ).startAnimation ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
} // .end method
public final void a ( Float p0 ) {
	 /* .locals 2 */
	 /* .line 23 */
	 /* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->f:F */
	 /* cmpl-float p1, p1, v0 */
	 /* if-lez p1, :cond_0 */
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 24 */
	 (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(ZZ)V
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 25 */
/* iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
/* .line 26 */
v0 = this.C;
int v1 = 0; // const/4 v1, 0x0
(( c.t.a.f ) v0 ).a ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Lc/t/a/f;->a(FF)V
int v0 = 0; // const/4 v0, 0x0
/* .line 27 */
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->s:Z */
/* if-nez v1, :cond_1 */
/* .line 28 */
/* new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$e; */
/* invoke-direct {v0, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$e;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V */
/* .line 29 */
} // :cond_1
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).b ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->b(ILandroid/view/animation/Animation$AnimationListener;)V
/* .line 30 */
v0 = this.C;
(( c.t.a.f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/f;->a(Z)V
} // :goto_0
return;
} // .end method
public final void a ( Integer p0, android.view.animation.Animation$AnimationListener p1 ) {
/* .locals 2 */
/* .line 31 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->x:I */
/* .line 32 */
p1 = this.N;
(( android.view.animation.Animation ) p1 ).reset ( ); // invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V
/* .line 33 */
p1 = this.N;
/* const-wide/16 v0, 0xc8 */
(( android.view.animation.Animation ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
/* .line 34 */
p1 = this.N;
v0 = this.u;
(( android.view.animation.Animation ) p1 ).setInterpolator ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 35 */
p1 = this.v;
(( c.t.a.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/t/a/b;->a(Landroid/view/animation/Animation$AnimationListener;)V
/* .line 36 */
} // :cond_0
p1 = this.v;
(( android.widget.ImageView ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V
/* .line 37 */
p1 = this.v;
p2 = this.N;
(( android.widget.ImageView ) p1 ).startAnimation ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
return;
} // .end method
public final void a ( android.view.MotionEvent p0 ) {
/* .locals 3 */
/* .line 38 */
v0 = (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
/* .line 39 */
v1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 40 */
/* iget v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
/* if-ne v1, v2, :cond_1 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 41 */
} // :goto_0
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
} // :cond_1
return;
} // .end method
public void a ( android.view.animation.Animation$AnimationListener p0 ) {
/* .locals 3 */
/* .line 7 */
/* new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$c; */
/* invoke-direct {v0, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$c;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V */
this.E = v0;
/* const-wide/16 v1, 0x96 */
/* .line 8 */
(( android.view.animation.Animation ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
/* .line 9 */
v0 = this.v;
(( c.t.a.b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/b;->a(Landroid/view/animation/Animation$AnimationListener;)V
/* .line 10 */
p1 = this.v;
(( android.widget.ImageView ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V
/* .line 11 */
p1 = this.v;
v0 = this.E;
(( android.widget.ImageView ) p1 ).startAnimation ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
return;
} // .end method
public final void a ( Boolean p0, Boolean p1 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
/* if-eq v0, p1, :cond_1 */
/* .line 2 */
/* iput-boolean p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->I:Z */
/* .line 3 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c()V
/* .line 4 */
/* iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
/* iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
p2 = this.M;
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(ILandroid/view/animation/Animation$AnimationListener;)V
/* .line 6 */
} // :cond_0
p1 = this.M;
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(Landroid/view/animation/Animation$AnimationListener;)V
} // :cond_1
} // :goto_0
return;
} // .end method
public Boolean a ( ) {
/* .locals 3 */
/* .line 17 */
v0 = this.L;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 18 */
v0 = v1 = this.b;
/* .line 19 */
} // :cond_0
v0 = this.b;
/* instance-of v1, v0, Landroid/widget/ListView; */
int v2 = -1; // const/4 v2, -0x1
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 20 */
/* check-cast v0, Landroid/widget/ListView; */
v0 = c.h.o.j .a ( v0,v2 );
/* .line 21 */
} // :cond_1
v0 = (( android.view.View ) v0 ).canScrollVertically ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z
} // .end method
public final Boolean a ( android.view.animation.Animation p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 22 */
v0 = (( android.view.animation.Animation ) p1 ).hasStarted ( ); // invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( android.view.animation.Animation ) p1 ).hasEnded ( ); // invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final void b ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Lc/t/a/b; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* const v2, -0x50506 */
/* invoke-direct {v0, v1, v2}, Lc/t/a/b;-><init>(Landroid/content/Context;I)V */
this.v = v0;
/* .line 2 */
/* new-instance v0, Lc/t/a/f; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Lc/t/a/f;-><init>(Landroid/content/Context;)V */
this.C = v0;
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
(( c.t.a.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/t/a/f;->a(I)V
/* .line 4 */
v0 = this.v;
v1 = this.C;
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 5 */
v0 = this.v;
/* const/16 v1, 0x8 */
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 6 */
v0 = this.v;
(( android.view.ViewGroup ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
return;
} // .end method
public final void b ( Float p0 ) {
/* .locals 11 */
/* .line 14 */
v0 = this.C;
int v1 = 1; // const/4 v1, 0x1
(( c.t.a.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/t/a/f;->a(Z)V
/* .line 15 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->f:F */
/* div-float v0, p1, v0 */
/* .line 16 */
v0 = java.lang.Math .abs ( v0 );
/* const/high16 v1, 0x3f800000 # 1.0f */
v0 = java.lang.Math .min ( v1,v0 );
/* float-to-double v2, v0 */
/* const-wide v4, 0x3fd999999999999aL # 0.4 */
/* sub-double/2addr v2, v4 */
/* const-wide/16 v4, 0x0 */
/* .line 17 */
java.lang.Math .max ( v2,v3,v4,v5 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* const/high16 v3, 0x40a00000 # 5.0f */
/* mul-float v2, v2, v3 */
/* const/high16 v3, 0x40400000 # 3.0f */
/* div-float/2addr v2, v3 */
/* .line 18 */
v3 = java.lang.Math .abs ( p1 );
/* iget v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->f:F */
/* sub-float/2addr v3, v4 */
/* .line 19 */
/* iget v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->B:I */
/* if-lez v4, :cond_0 */
} // :goto_0
/* int-to-float v4, v4 */
} // :cond_0
/* iget-boolean v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->K:Z */
if ( v4 != null) { // if-eqz v4, :cond_1
/* iget v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->A:I */
/* iget v5, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:I */
/* sub-int/2addr v4, v5 */
} // :cond_1
/* iget v4, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->A:I */
} // :goto_1
/* const/high16 v5, 0x40000000 # 2.0f */
/* mul-float v6, v4, v5 */
/* .line 20 */
v3 = java.lang.Math .min ( v3,v6 );
/* div-float/2addr v3, v4 */
int v6 = 0; // const/4 v6, 0x0
v3 = java.lang.Math .max ( v6,v3 );
/* const/high16 v7, 0x40800000 # 4.0f */
/* div-float/2addr v3, v7 */
/* float-to-double v7, v3 */
/* const-wide/high16 v9, 0x4000000000000000L # 2.0 */
/* .line 21 */
java.lang.Math .pow ( v7,v8,v9,v10 );
/* move-result-wide v9 */
/* sub-double/2addr v7, v9 */
/* double-to-float v3, v7 */
/* mul-float v3, v3, v5 */
/* mul-float v7, v4, v3 */
/* mul-float v7, v7, v5 */
/* .line 22 */
/* iget v8, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:I */
/* mul-float v4, v4, v0 */
/* add-float/2addr v4, v7 */
/* float-to-int v0, v4 */
/* add-int/2addr v8, v0 */
/* .line 23 */
v0 = this.v;
v0 = (( android.widget.ImageView ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 24 */
v0 = this.v;
int v4 = 0; // const/4 v4, 0x0
(( android.widget.ImageView ) v0 ).setVisibility ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 25 */
} // :cond_2
/* iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->s:Z */
/* if-nez v0, :cond_3 */
/* .line 26 */
v0 = this.v;
(( android.widget.ImageView ) v0 ).setScaleX ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleX(F)V
/* .line 27 */
v0 = this.v;
(( android.widget.ImageView ) v0 ).setScaleY ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleY(F)V
/* .line 28 */
} // :cond_3
/* iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->s:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 29 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->f:F */
/* div-float v0, p1, v0 */
v0 = java.lang.Math .min ( v1,v0 );
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setAnimationProgress ( v0 ); // invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setAnimationProgress(F)V
/* .line 30 */
} // :cond_4
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->f:F */
/* cmpg-float p1, p1, v0 */
/* if-gez p1, :cond_5 */
/* .line 31 */
p1 = this.C;
p1 = (( c.t.a.f ) p1 ).getAlpha ( ); // invoke-virtual {p1}, Lc/t/a/f;->getAlpha()I
/* const/16 v0, 0x4c */
/* if-le p1, v0, :cond_6 */
p1 = this.F;
/* .line 32 */
p1 = (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(Landroid/view/animation/Animation;)Z
/* if-nez p1, :cond_6 */
/* .line 33 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->f()V
/* .line 34 */
} // :cond_5
p1 = this.C;
p1 = (( c.t.a.f ) p1 ).getAlpha ( ); // invoke-virtual {p1}, Lc/t/a/f;->getAlpha()I
/* const/16 v0, 0xff */
/* if-ge p1, v0, :cond_6 */
p1 = this.G;
p1 = (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(Landroid/view/animation/Animation;)Z
/* if-nez p1, :cond_6 */
/* .line 35 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->e()V
} // :cond_6
} // :goto_2
/* const p1, 0x3f4ccccd # 0.8f */
/* mul-float v0, v2, p1 */
/* .line 36 */
v4 = this.C;
p1 = java.lang.Math .min ( p1,v0 );
(( c.t.a.f ) v4 ).a ( v6, p1 ); // invoke-virtual {v4, v6, p1}, Lc/t/a/f;->a(FF)V
/* .line 37 */
p1 = this.C;
v0 = java.lang.Math .min ( v1,v2 );
(( c.t.a.f ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/t/a/f;->a(F)V
/* const/high16 p1, -0x41800000 # -0.25f */
/* const v0, 0x3ecccccd # 0.4f */
/* mul-float v2, v2, v0 */
/* add-float/2addr v2, p1 */
/* mul-float v3, v3, v5 */
/* add-float/2addr v2, v3 */
/* const/high16 p1, 0x3f000000 # 0.5f */
/* mul-float v2, v2, p1 */
/* .line 38 */
p1 = this.C;
(( c.t.a.f ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Lc/t/a/f;->b(F)V
/* .line 39 */
/* iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
/* sub-int/2addr v8, p1 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( v8 ); // invoke-virtual {p0, v8}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
return;
} // .end method
public final void b ( Integer p0, android.view.animation.Animation$AnimationListener p1 ) {
/* .locals 2 */
/* .line 40 */
/* iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->s:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 41 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c(ILandroid/view/animation/Animation$AnimationListener;)V
/* .line 42 */
} // :cond_0
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->x:I */
/* .line 43 */
p1 = this.O;
(( android.view.animation.Animation ) p1 ).reset ( ); // invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V
/* .line 44 */
p1 = this.O;
/* const-wide/16 v0, 0xc8 */
(( android.view.animation.Animation ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
/* .line 45 */
p1 = this.O;
v0 = this.u;
(( android.view.animation.Animation ) p1 ).setInterpolator ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 46 */
p1 = this.v;
(( c.t.a.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/t/a/b;->a(Landroid/view/animation/Animation$AnimationListener;)V
/* .line 47 */
} // :cond_1
p1 = this.v;
(( android.widget.ImageView ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V
/* .line 48 */
p1 = this.v;
p2 = this.O;
(( android.widget.ImageView ) p1 ).startAnimation ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
} // :goto_0
return;
} // .end method
public final void b ( android.view.animation.Animation$AnimationListener p0 ) {
/* .locals 3 */
/* .line 7 */
v0 = this.v;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 8 */
v0 = this.C;
/* const/16 v1, 0xff */
(( c.t.a.f ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Lc/t/a/f;->setAlpha(I)V
/* .line 9 */
/* new-instance v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$b; */
/* invoke-direct {v0, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$b;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V */
this.D = v0;
/* .line 10 */
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->m:I */
/* int-to-long v1, v1 */
(( android.view.animation.Animation ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 11 */
v0 = this.v;
(( c.t.a.b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/b;->a(Landroid/view/animation/Animation$AnimationListener;)V
/* .line 12 */
} // :cond_0
p1 = this.v;
(( android.widget.ImageView ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V
/* .line 13 */
p1 = this.v;
v0 = this.D;
(( android.widget.ImageView ) p1 ).startAnimation ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
return;
} // .end method
public final void c ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :goto_0
v1 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge v0, v1, :cond_1 */
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 4 */
v2 = this.v;
v2 = (( java.lang.Object ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_0 */
/* .line 5 */
this.b = v1;
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
} // :goto_1
return;
} // .end method
public void c ( Float p0 ) {
/* .locals 2 */
/* .line 6 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->x:I */
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:I */
/* sub-int/2addr v1, v0 */
/* int-to-float v1, v1 */
/* mul-float v1, v1, p1 */
/* float-to-int p1, v1 */
/* add-int/2addr v0, p1 */
/* .line 7 */
p1 = this.v;
p1 = (( android.widget.ImageView ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getTop()I
/* sub-int/2addr v0, p1 */
/* .line 8 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( v0 ); // invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
return;
} // .end method
public final void c ( Integer p0, android.view.animation.Animation$AnimationListener p1 ) {
/* .locals 2 */
/* .line 9 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->x:I */
/* .line 10 */
p1 = this.v;
p1 = (( android.widget.ImageView ) p1 ).getScaleX ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleX()F
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->y:F */
/* .line 11 */
/* new-instance p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$h; */
/* invoke-direct {p1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$h;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V */
this.H = p1;
/* const-wide/16 v0, 0x96 */
/* .line 12 */
(( android.view.animation.Animation ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 13 */
p1 = this.v;
(( c.t.a.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/t/a/b;->a(Landroid/view/animation/Animation$AnimationListener;)V
/* .line 14 */
} // :cond_0
p1 = this.v;
(( android.widget.ImageView ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->clearAnimation()V
/* .line 15 */
p1 = this.v;
p2 = this.H;
(( android.widget.ImageView ) p1 ).startAnimation ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
return;
} // .end method
public void d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.v;
(( android.widget.ImageView ) v0 ).clearAnimation ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->clearAnimation()V
/* .line 2 */
v0 = this.C;
(( c.t.a.f ) v0 ).stop ( ); // invoke-virtual {v0}, Lc/t/a/f;->stop()V
/* .line 3 */
v0 = this.v;
/* const/16 v1, 0x8 */
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* const/16 v0, 0xff */
/* .line 4 */
/* invoke-direct {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorViewAlpha(I)V */
/* .line 5 */
/* iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->s:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setAnimationProgress ( v0 ); // invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setAnimationProgress(F)V
/* .line 7 */
} // :cond_0
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:I */
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
/* sub-int/2addr v0, v1 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( v0 ); // invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
/* .line 8 */
} // :goto_0
v0 = this.v;
v0 = (( android.widget.ImageView ) v0 ).getTop ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getTop()I
/* iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
return;
} // .end method
public final void d ( Float p0 ) {
/* .locals 3 */
/* .line 9 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->p:F */
/* sub-float/2addr p1, v0 */
/* .line 10 */
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->e:I */
/* int-to-float v2, v1 */
/* cmpl-float p1, p1, v2 */
/* if-lez p1, :cond_0 */
/* iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->q:Z */
/* if-nez p1, :cond_0 */
/* int-to-float p1, v1 */
/* add-float/2addr v0, p1 */
/* .line 11 */
/* iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->o:F */
int p1 = 1; // const/4 p1, 0x1
/* .line 12 */
/* iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->q:Z */
/* .line 13 */
p1 = this.C;
/* const/16 v0, 0x4c */
(( c.t.a.f ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Lc/t/a/f;->setAlpha(I)V
} // :cond_0
return;
} // .end method
public Boolean dispatchNestedFling ( Float p0, Float p1, Boolean p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
p1 = (( c.h.n.s ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/h/n/s;->a(FFZ)Z
} // .end method
public Boolean dispatchNestedPreFling ( Float p0, Float p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
p1 = (( c.h.n.s ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/s;->a(FF)Z
} // .end method
public Boolean dispatchNestedPreScroll ( Integer p0, Integer p1, Integer[] p2, Integer[] p3 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
p1 = (( c.h.n.s ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/h/n/s;->a(II[I[I)Z
} // .end method
public Boolean dispatchNestedScroll ( Integer p0, Integer p1, Integer p2, Integer p3, Integer[] p4 ) {
/* .locals 6 */
/* .line 1 */
v0 = this.i;
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move-object v5, p5 */
p1 = /* invoke-virtual/range {v0 ..v5}, Lc/h/n/s;->a(IIII[I)Z */
} // .end method
public final void e ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.C;
v0 = (( c.t.a.f ) v0 ).getAlpha ( ); // invoke-virtual {v0}, Lc/t/a/f;->getAlpha()I
/* const/16 v1, 0xff */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(II)Landroid/view/animation/Animation;
this.G = v0;
return;
} // .end method
public final void f ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.C;
v0 = (( c.t.a.f ) v0 ).getAlpha ( ); // invoke-virtual {v0}, Lc/t/a/f;->getAlpha()I
/* const/16 v1, 0x4c */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(II)Landroid/view/animation/Animation;
this.F = v0;
return;
} // .end method
public Integer getChildDrawingOrder ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->w:I */
/* if-gez v0, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, -0x1 */
/* if-ne p2, p1, :cond_1 */
} // :cond_1
/* if-lt p2, v0, :cond_2 */
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_2
} // .end method
public Integer getNestedScrollAxes ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
v0 = (( c.h.n.w ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/n/w;->a()I
} // .end method
public Integer getProgressCircleDiameter ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->J:I */
} // .end method
public Integer getProgressViewEndOffset ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->A:I */
} // .end method
public Integer getProgressViewStartOffset ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:I */
} // .end method
public Boolean hasNestedScrollingParent ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
v0 = (( c.h.n.s ) v0 ).b ( ); // invoke-virtual {v0}, Lc/h/n/s;->b()Z
} // .end method
public Boolean isNestedScrollingEnabled ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
v0 = (( c.h.n.s ) v0 ).c ( ); // invoke-virtual {v0}, Lc/h/n/s;->c()Z
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
/* .line 2 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d()V
return;
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 4 */
/* .line 1 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c()V
/* .line 2 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* .line 3 */
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:Z */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-nez v0, :cond_0 */
/* .line 4 */
/* iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:Z */
/* .line 5 */
} // :cond_0
v1 = (( android.view.ViewGroup ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->isEnabled()Z
if ( v1 != null) { // if-eqz v1, :cond_9
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:Z */
/* if-nez v1, :cond_9 */
v1 = (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a()Z
/* if-nez v1, :cond_9 */
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
/* if-nez v1, :cond_9 */
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->l:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_7
int v1 = 1; // const/4 v1, 0x1
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v1, :cond_6 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_3 */
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_6 */
int v1 = 6; // const/4 v1, 0x6
/* if-eq v0, v1, :cond_2 */
/* .line 6 */
} // :cond_2
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(Landroid/view/MotionEvent;)V
/* .line 7 */
} // :cond_3
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
/* if-ne v0, v3, :cond_4 */
/* .line 8 */
p1 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.P;
final String v0 = "Got ACTION_MOVE event but don\'t have an active pointer id."; // const-string v0, "Got ACTION_MOVE event but don\'t have an active pointer id."
android.util.Log .e ( p1,v0 );
/* .line 9 */
} // :cond_4
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-gez v0, :cond_5 */
/* .line 10 */
} // :cond_5
p1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* .line 11 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d(F)V
/* .line 12 */
} // :cond_6
/* iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->q:Z */
/* .line 13 */
/* iput v3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
/* .line 14 */
} // :cond_7
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:I */
v1 = this.v;
v1 = (( android.widget.ImageView ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/widget/ImageView;->getTop()I
/* sub-int/2addr v0, v1 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( v0 ); // invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
/* .line 15 */
v0 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
/* .line 16 */
/* iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->q:Z */
/* .line 17 */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-gez v0, :cond_8 */
/* .line 18 */
} // :cond_8
p1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->p:F */
/* .line 19 */
} // :goto_0
/* iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->q:Z */
} // :cond_9
} // :goto_1
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 2 */
/* .line 1 */
p1 = (( android.view.ViewGroup ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I
/* .line 2 */
p2 = (( android.view.ViewGroup ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I
/* .line 3 */
p3 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* if-nez p3, :cond_0 */
return;
/* .line 4 */
} // :cond_0
p3 = this.b;
/* if-nez p3, :cond_1 */
/* .line 5 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c()V
/* .line 6 */
} // :cond_1
p3 = this.b;
/* if-nez p3, :cond_2 */
return;
/* .line 7 */
} // :cond_2
p4 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* .line 8 */
p5 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* .line 9 */
v0 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* sub-int v0, p1, v0 */
v1 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr v0, v1 */
/* .line 10 */
v1 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* sub-int/2addr p2, v1 */
v1 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr p2, v1 */
/* add-int/2addr v0, p4 */
/* add-int/2addr p2, p5 */
/* .line 11 */
(( android.view.View ) p3 ).layout ( p4, p5, v0, p2 ); // invoke-virtual {p3, p4, p5, v0, p2}, Landroid/view/View;->layout(IIII)V
/* .line 12 */
p2 = this.v;
p2 = (( android.widget.ImageView ) p2 ).getMeasuredWidth ( ); // invoke-virtual {p2}, Landroid/widget/ImageView;->getMeasuredWidth()I
/* .line 13 */
p3 = this.v;
p3 = (( android.widget.ImageView ) p3 ).getMeasuredHeight ( ); // invoke-virtual {p3}, Landroid/widget/ImageView;->getMeasuredHeight()I
/* .line 14 */
p4 = this.v;
/* div-int/lit8 p1, p1, 0x2 */
/* div-int/lit8 p2, p2, 0x2 */
/* sub-int p5, p1, p2 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
/* add-int/2addr p1, p2 */
/* add-int/2addr p3, v0 */
(( android.widget.ImageView ) p4 ).layout ( p5, v0, p1, p3 ); // invoke-virtual {p4, p5, v0, p1, p3}, Landroid/widget/ImageView;->layout(IIII)V
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V */
/* .line 2 */
p1 = this.b;
/* if-nez p1, :cond_0 */
/* .line 3 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c()V
/* .line 4 */
} // :cond_0
p1 = this.b;
/* if-nez p1, :cond_1 */
return;
/* .line 5 */
} // :cond_1
p2 = (( android.view.ViewGroup ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I
v0 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* sub-int/2addr p2, v0 */
v0 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* sub-int/2addr p2, v0 */
/* const/high16 v0, 0x40000000 # 2.0f */
/* .line 6 */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v0 );
/* .line 7 */
v1 = (( android.view.ViewGroup ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I
v2 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* sub-int/2addr v1, v2 */
v2 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* sub-int/2addr v1, v2 */
/* .line 8 */
v1 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v0 );
/* .line 9 */
(( android.view.View ) p1 ).measure ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/view/View;->measure(II)V
/* .line 10 */
p1 = this.v;
/* iget p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->J:I */
p2 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,v0 );
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->J:I */
/* .line 11 */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v1,v0 );
/* .line 12 */
(( android.widget.ImageView ) p1 ).measure ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/widget/ImageView;->measure(II)V
int p1 = -1; // const/4 p1, -0x1
/* .line 13 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->w:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 14 */
} // :goto_0
p2 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* if-ge p1, p2, :cond_3 */
/* .line 15 */
(( android.view.ViewGroup ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
v0 = this.v;
/* if-ne p2, v0, :cond_2 */
/* .line 16 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->w:I */
} // :cond_2
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_3
} // :goto_1
return;
} // .end method
public Boolean onNestedFling ( android.view.View p0, Float p1, Float p2, Boolean p3 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).dispatchNestedFling ( p2, p3, p4 ); // invoke-virtual {p0, p2, p3, p4}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedFling(FFZ)Z
} // .end method
public Boolean onNestedPreFling ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).dispatchNestedPreFling ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedPreFling(FF)Z
} // .end method
public void onNestedPreScroll ( android.view.View p0, Integer p1, Integer p2, Integer[] p3 ) {
/* .locals 4 */
int p1 = 0; // const/4 p1, 0x0
int v0 = 1; // const/4 v0, 0x1
/* if-lez p3, :cond_1 */
/* .line 1 */
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
/* cmpl-float v2, v1, p1 */
/* if-lez v2, :cond_1 */
/* int-to-float v2, p3 */
/* cmpl-float v3, v2, v1 */
/* if-lez v3, :cond_0 */
/* float-to-int v1, v1 */
/* sub-int v1, p3, v1 */
/* .line 2 */
/* aput v1, p4, v0 */
/* .line 3 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
} // :cond_0
/* sub-float/2addr v1, v2 */
/* .line 4 */
/* iput v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
/* .line 5 */
/* aput p3, p4, v0 */
/* .line 6 */
} // :goto_0
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->b(F)V
/* .line 7 */
} // :cond_1
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->K:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* if-lez p3, :cond_2 */
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
/* cmpl-float p1, v1, p1 */
/* if-nez p1, :cond_2 */
/* aget p1, p4, v0 */
/* sub-int p1, p3, p1 */
/* .line 8 */
p1 = java.lang.Math .abs ( p1 );
/* if-lez p1, :cond_2 */
/* .line 9 */
p1 = this.v;
/* const/16 v1, 0x8 */
(( android.widget.ImageView ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 10 */
} // :cond_2
p1 = this.j;
int v1 = 0; // const/4 v1, 0x0
/* .line 11 */
/* aget v2, p4, v1 */
/* sub-int/2addr p2, v2 */
/* aget v2, p4, v0 */
/* sub-int/2addr p3, v2 */
int v2 = 0; // const/4 v2, 0x0
p2 = (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).dispatchNestedPreScroll ( p2, p3, p1, v2 ); // invoke-virtual {p0, p2, p3, p1, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedPreScroll(II[I[I)Z
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 12 */
/* aget p2, p4, v1 */
/* aget p3, p1, v1 */
/* add-int/2addr p2, p3 */
/* aput p2, p4, v1 */
/* .line 13 */
/* aget p2, p4, v0 */
/* aget p1, p1, v0 */
/* add-int/2addr p2, p1 */
/* aput p2, p4, v0 */
} // :cond_3
return;
} // .end method
public void onNestedScroll ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
/* .line 1 */
v5 = this.k;
/* move-object v0, p0 */
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->dispatchNestedScroll(IIII[I)Z */
/* .line 2 */
p1 = this.k;
int p2 = 1; // const/4 p2, 0x1
/* aget p1, p1, p2 */
/* add-int/2addr p5, p1 */
/* if-gez p5, :cond_0 */
/* .line 3 */
p1 = (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a()Z
/* if-nez p1, :cond_0 */
/* .line 4 */
/* iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
p2 = java.lang.Math .abs ( p5 );
/* int-to-float p2, p2 */
/* add-float/2addr p1, p2 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
/* .line 5 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->b(F)V
} // :cond_0
return;
} // .end method
public void onNestedScrollAccepted ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
(( c.h.n.w ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/h/n/w;->a(Landroid/view/View;Landroid/view/View;I)V
/* and-int/lit8 p1, p3, 0x2 */
/* .line 2 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).startNestedScroll ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->startNestedScroll(I)Z
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
int p1 = 1; // const/4 p1, 0x1
/* .line 4 */
/* iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->l:Z */
return;
} // .end method
public Boolean onStartNestedScroll ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( android.view.ViewGroup ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->isEnabled()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:Z */
/* if-nez p1, :cond_0 */
/* iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
/* if-nez p1, :cond_0 */
/* and-int/lit8 p1, p3, 0x2 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void onStopNestedScroll ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.h;
(( c.h.n.w ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/h/n/w;->a(Landroid/view/View;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->l:Z */
/* .line 3 */
/* iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v1, p1, v0 */
/* if-lez v1, :cond_0 */
/* .line 4 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(F)V
/* .line 5 */
/* iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->g:F */
/* .line 6 */
} // :cond_0
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).stopNestedScroll ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->stopNestedScroll()V
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* .line 2 */
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:Z */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-nez v0, :cond_0 */
/* .line 3 */
/* iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:Z */
/* .line 4 */
} // :cond_0
v1 = (( android.view.ViewGroup ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->isEnabled()Z
if ( v1 != null) { // if-eqz v1, :cond_e
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:Z */
/* if-nez v1, :cond_e */
v1 = (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a()Z
/* if-nez v1, :cond_e */
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
/* if-nez v1, :cond_e */
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->l:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* goto/16 :goto_1 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_c
/* const/high16 v3, 0x3f000000 # 0.5f */
/* if-eq v0, v1, :cond_9 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq v0, v4, :cond_6 */
int v3 = 3; // const/4 v3, 0x3
/* if-eq v0, v3, :cond_5 */
int v3 = 5; // const/4 v3, 0x5
/* if-eq v0, v3, :cond_3 */
int v2 = 6; // const/4 v2, 0x6
/* if-eq v0, v2, :cond_2 */
/* goto/16 :goto_0 */
/* .line 5 */
} // :cond_2
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(Landroid/view/MotionEvent;)V
/* .line 6 */
} // :cond_3
v0 = (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
/* if-gez v0, :cond_4 */
/* .line 7 */
p1 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.P;
final String v0 = "Got ACTION_POINTER_DOWN event but have an invalid action index."; // const-string v0, "Got ACTION_POINTER_DOWN event but have an invalid action index."
android.util.Log .e ( p1,v0 );
/* .line 8 */
} // :cond_4
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
} // :cond_5
/* .line 9 */
} // :cond_6
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-gez v0, :cond_7 */
/* .line 10 */
p1 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.P;
final String v0 = "Got ACTION_MOVE event but have an invalid active pointer id."; // const-string v0, "Got ACTION_MOVE event but have an invalid active pointer id."
android.util.Log .e ( p1,v0 );
/* .line 11 */
} // :cond_7
p1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* .line 12 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d(F)V
/* .line 13 */
/* iget-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 14 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->o:F */
/* sub-float/2addr p1, v0 */
/* mul-float p1, p1, v3 */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p1, v0 */
/* if-lez v0, :cond_8 */
/* .line 15 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->b(F)V
} // :cond_8
/* .line 16 */
} // :cond_9
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-gez v0, :cond_a */
/* .line 17 */
p1 = androidx.swiperefreshlayout.widget.SwipeRefreshLayout.P;
final String v0 = "Got ACTION_UP event but don\'t have an active pointer id."; // const-string v0, "Got ACTION_UP event but don\'t have an active pointer id."
android.util.Log .e ( p1,v0 );
/* .line 18 */
} // :cond_a
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->q:Z */
if ( v1 != null) { // if-eqz v1, :cond_b
/* .line 19 */
p1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* .line 20 */
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->o:F */
/* sub-float/2addr p1, v0 */
/* mul-float p1, p1, v3 */
/* .line 21 */
/* iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->q:Z */
/* .line 22 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(F)V
} // :cond_b
int p1 = -1; // const/4 p1, -0x1
/* .line 23 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
/* .line 24 */
} // :cond_c
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->r:I */
/* .line 25 */
/* iput-boolean v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->q:Z */
} // :cond_d
} // :goto_0
} // :cond_e
} // :goto_1
} // .end method
public void requestDisallowInterceptTouchEvent ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-ge v0, v1, :cond_0 */
v0 = this.b;
/* instance-of v0, v0, Landroid/widget/AbsListView; */
/* if-nez v0, :cond_2 */
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = c.h.n.v0 .E ( v0 );
/* if-nez v0, :cond_1 */
/* .line 3 */
} // :cond_1
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V */
} // :cond_2
} // :goto_0
return;
} // .end method
public void setAnimationProgress ( Float p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.v;
(( android.widget.ImageView ) v0 ).setScaleX ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleX(F)V
/* .line 2 */
v0 = this.v;
(( android.widget.ImageView ) v0 ).setScaleY ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleY(F)V
return;
} // .end method
public void setColorScheme ( Integer...p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setColorSchemeResources ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeResources([I)V
return;
} // .end method
public void setColorSchemeColors ( Integer...p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c()V
/* .line 2 */
v0 = this.C;
(( c.t.a.f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/f;->a([I)V
return;
} // .end method
public void setColorSchemeResources ( Integer...p0 ) {
/* .locals 4 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* .line 2 */
/* array-length v1, p1 */
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
} // :goto_0
/* array-length v3, p1 */
/* if-ge v2, v3, :cond_0 */
/* .line 4 */
/* aget v3, p1, v2 */
v3 = c.h.f.f .a ( v0,v3 );
/* aput v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 5 */
} // :cond_0
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setColorSchemeColors ( v1 ); // invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V
return;
} // .end method
public void setDistanceToTriggerSync ( Integer p0 ) {
/* .locals 0 */
/* int-to-float p1, p1 */
/* .line 1 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->f:F */
return;
} // .end method
public void setEnabled ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->setEnabled(Z)V */
/* if-nez p1, :cond_0 */
/* .line 2 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d()V
} // :cond_0
return;
} // .end method
public void setNestedScrollingEnabled ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
(( c.h.n.s ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/h/n/s;->a(Z)V
return;
} // .end method
public void setOnChildScrollUpCallback ( androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i p0 ) {
/* .locals 0 */
/* .line 1 */
this.L = p1;
return;
} // .end method
public void setOnRefreshListener ( androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j p0 ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
return;
} // .end method
public void setProgressBackgroundColor ( Integer p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setProgressBackgroundColorSchemeResource ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setProgressBackgroundColorSchemeResource(I)V
return;
} // .end method
public void setProgressBackgroundColorSchemeColor ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.v;
(( c.t.a.b ) v0 ).setBackgroundColor ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/b;->setBackgroundColor(I)V
return;
} // .end method
public void setProgressBackgroundColorSchemeResource ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
p1 = c.h.f.f .a ( v0,p1 );
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setProgressBackgroundColorSchemeColor ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setProgressBackgroundColorSchemeColor(I)V
return;
} // .end method
public void setRefreshing ( Boolean p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 1 */
/* iget-boolean v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
/* if-eq v1, p1, :cond_1 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
/* .line 3 */
/* iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->K:Z */
/* if-nez p1, :cond_0 */
/* .line 4 */
/* iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->A:I */
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:I */
/* add-int/2addr p1, v1 */
/* .line 5 */
} // :cond_0
/* iget p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->A:I */
/* .line 6 */
} // :goto_0
/* iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
/* sub-int/2addr p1, v1 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).setTargetOffsetTopAndBottom ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
/* .line 7 */
/* iput-boolean v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->I:Z */
/* .line 8 */
p1 = this.M;
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->b(Landroid/view/animation/Animation$AnimationListener;)V
/* .line 9 */
} // :cond_1
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(ZZ)V
} // :goto_1
return;
} // .end method
public void setSize ( Integer p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* if-eq p1, v0, :cond_0 */
return;
/* .line 1 */
} // :cond_0
(( android.view.ViewGroup ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* if-nez p1, :cond_1 */
/* const/high16 v1, 0x42600000 # 56.0f */
/* .line 2 */
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
/* mul-float v0, v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->J:I */
} // :cond_1
/* const/high16 v1, 0x42200000 # 40.0f */
/* .line 3 */
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
/* mul-float v0, v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->J:I */
/* .line 4 */
} // :goto_0
v0 = this.v;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 5 */
v0 = this.C;
(( c.t.a.f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/f;->a(I)V
/* .line 6 */
p1 = this.v;
v0 = this.C;
(( android.widget.ImageView ) p1 ).setImageDrawable ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void setSlingshotDistance ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->B:I */
return;
} // .end method
public void setTargetOffsetTopAndBottom ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.v;
(( android.widget.ImageView ) v0 ).bringToFront ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->bringToFront()V
/* .line 2 */
v0 = this.v;
c.h.n.v0 .e ( v0,p1 );
/* .line 3 */
p1 = this.v;
p1 = (( android.widget.ImageView ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getTop()I
/* iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
return;
} // .end method
public Boolean startNestedScroll ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
p1 = (( c.h.n.s ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/h/n/s;->c(I)Z
} // .end method
public void stopNestedScroll ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
(( c.h.n.s ) v0 ).d ( ); // invoke-virtual {v0}, Lc/h/n/s;->d()V
return;
} // .end method
