public class c.j.b.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/j/b/c$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final android.view.animation.Interpolator w;
/* # instance fields */
public Integer a;
public Integer b;
public Integer c;
public d;
public e;
public f;
public g;
public h;
public i;
public j;
public Integer k;
public android.view.VelocityTracker l;
public Float m;
public Float n;
public Integer o;
public Integer p;
public android.widget.OverScroller q;
public final c.j.b.c$a r;
public android.view.View s;
public Boolean t;
public final android.view.ViewGroup u;
public final java.lang.Runnable v;
/* # direct methods */
public static c.j.b.c ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lc/j/b/a; */
	 /* invoke-direct {v0}, Lc/j/b/a;-><init>()V */
	 return;
} // .end method
public c.j.b.c ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = -1; // const/4 v0, -0x1
	 /* .line 2 */
	 /* iput v0, p0, Lc/j/b/c;->c:I */
	 /* .line 3 */
	 /* new-instance v0, Lc/j/b/b; */
	 /* invoke-direct {v0, p0}, Lc/j/b/b;-><init>(Lc/j/b/c;)V */
	 this.v = v0;
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* .line 4 */
			 this.u = p2;
			 /* .line 5 */
			 this.r = p3;
			 /* .line 6 */
			 android.view.ViewConfiguration .get ( p1 );
			 /* .line 7 */
			 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
			 (( android.content.res.Resources ) p3 ).getDisplayMetrics ( ); // invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
			 /* iget p3, p3, Landroid/util/DisplayMetrics;->density:F */
			 /* const/high16 v0, 0x41a00000 # 20.0f */
			 /* mul-float p3, p3, v0 */
			 /* const/high16 v0, 0x3f000000 # 0.5f */
			 /* add-float/2addr p3, v0 */
			 /* float-to-int p3, p3 */
			 /* .line 8 */
			 /* iput p3, p0, Lc/j/b/c;->o:I */
			 /* .line 9 */
			 p3 = 			 (( android.view.ViewConfiguration ) p2 ).getScaledTouchSlop ( ); // invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
			 /* iput p3, p0, Lc/j/b/c;->b:I */
			 /* .line 10 */
			 p3 = 			 (( android.view.ViewConfiguration ) p2 ).getScaledMaximumFlingVelocity ( ); // invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
			 /* int-to-float p3, p3 */
			 /* iput p3, p0, Lc/j/b/c;->m:F */
			 /* .line 11 */
			 p2 = 			 (( android.view.ViewConfiguration ) p2 ).getScaledMinimumFlingVelocity ( ); // invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
			 /* int-to-float p2, p2 */
			 /* iput p2, p0, Lc/j/b/c;->n:F */
			 /* .line 12 */
			 /* new-instance p2, Landroid/widget/OverScroller; */
			 p3 = c.j.b.c.w;
			 /* invoke-direct {p2, p1, p3}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V */
			 this.q = p2;
			 return;
			 /* .line 13 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String p2 = "Callback may not be null"; // const-string p2, "Callback may not be null"
		 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
		 /* .line 14 */
	 } // :cond_1
	 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
	 final String p2 = "Parent view may not be null"; // const-string p2, "Parent view may not be null"
	 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
public static c.j.b.c a ( android.view.ViewGroup p0, Float p1, c.j.b.c$a p2 ) {
	 /* .locals 1 */
	 /* .line 2 */
	 c.j.b.c .a ( p0,p2 );
	 /* .line 3 */
	 /* iget p2, p0, Lc/j/b/c;->b:I */
	 /* int-to-float p2, p2 */
	 /* const/high16 v0, 0x3f800000 # 1.0f */
	 /* div-float/2addr v0, p1 */
	 /* mul-float p2, p2, v0 */
	 /* float-to-int p1, p2 */
	 /* iput p1, p0, Lc/j/b/c;->b:I */
} // .end method
public static c.j.b.c a ( android.view.ViewGroup p0, c.j.b.c$a p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Lc/j/b/c; */
	 (( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
	 /* invoke-direct {v0, v1, p0, p1}, Lc/j/b/c;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Lc/j/b/c$a;)V */
} // .end method
/* # virtual methods */
public final Float a ( Float p0 ) {
	 /* .locals 2 */
	 /* const/high16 v0, 0x3f000000 # 0.5f */
	 /* sub-float/2addr p1, v0 */
	 /* const v0, 0x3ef1463b */
	 /* mul-float p1, p1, v0 */
	 /* float-to-double v0, p1 */
	 /* .line 25 */
	 java.lang.Math .sin ( v0,v1 );
	 /* move-result-wide v0 */
	 /* double-to-float p1, v0 */
} // .end method
public final Float a ( Float p0, Float p1, Float p2 ) {
	 /* .locals 2 */
	 /* .line 24 */
	 v0 = 	 java.lang.Math .abs ( p1 );
	 int v1 = 0; // const/4 v1, 0x0
	 /* cmpg-float p2, v0, p2 */
	 /* if-gez p2, :cond_0 */
} // :cond_0
/* cmpl-float p2, v0, p3 */
/* if-lez p2, :cond_2 */
/* cmpl-float p1, p1, v1 */
/* if-lez p1, :cond_1 */
} // :cond_1
/* neg-float p3, p3 */
} // :goto_0
} // :cond_2
} // .end method
public final Integer a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .line 23 */
v0 = java.lang.Math .abs ( p1 );
/* if-ge v0, p2, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* if-le v0, p3, :cond_2 */
/* if-lez p1, :cond_1 */
} // :cond_1
/* neg-int p3, p3 */
} // :goto_0
} // :cond_2
} // .end method
public final Integer a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
/* .line 15 */
/* iget v0, p0, Lc/j/b/c;->n:F */
/* float-to-int v0, v0 */
/* iget v1, p0, Lc/j/b/c;->m:F */
/* float-to-int v1, v1 */
p4 = (( c.j.b.c ) p0 ).a ( p4, v0, v1 ); // invoke-virtual {p0, p4, v0, v1}, Lc/j/b/c;->a(III)I
/* .line 16 */
/* iget v0, p0, Lc/j/b/c;->n:F */
/* float-to-int v0, v0 */
/* iget v1, p0, Lc/j/b/c;->m:F */
/* float-to-int v1, v1 */
p5 = (( c.j.b.c ) p0 ).a ( p5, v0, v1 ); // invoke-virtual {p0, p5, v0, v1}, Lc/j/b/c;->a(III)I
/* .line 17 */
v0 = java.lang.Math .abs ( p2 );
/* .line 18 */
v1 = java.lang.Math .abs ( p3 );
/* .line 19 */
v2 = java.lang.Math .abs ( p4 );
/* .line 20 */
v3 = java.lang.Math .abs ( p5 );
/* add-int v4, v2, v3 */
/* add-int v5, v0, v1 */
if ( p4 != null) { // if-eqz p4, :cond_0
/* int-to-float v0, v2 */
/* int-to-float v2, v4 */
} // :cond_0
/* int-to-float v0, v0 */
/* int-to-float v2, v5 */
} // :goto_0
/* div-float/2addr v0, v2 */
if ( p5 != null) { // if-eqz p5, :cond_1
/* int-to-float v1, v3 */
/* int-to-float v2, v4 */
} // :cond_1
/* int-to-float v1, v1 */
/* int-to-float v2, v5 */
} // :goto_1
/* div-float/2addr v1, v2 */
/* .line 21 */
v2 = this.r;
v2 = (( c.j.b.c$a ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lc/j/b/c$a;->a(Landroid/view/View;)I
p2 = (( c.j.b.c ) p0 ).b ( p2, p4, v2 ); // invoke-virtual {p0, p2, p4, v2}, Lc/j/b/c;->b(III)I
/* .line 22 */
p4 = this.r;
p1 = (( c.j.b.c$a ) p4 ).b ( p1 ); // invoke-virtual {p4, p1}, Lc/j/b/c$a;->b(Landroid/view/View;)I
p1 = (( c.j.b.c ) p0 ).b ( p3, p5, p1 ); // invoke-virtual {p0, p3, p5, p1}, Lc/j/b/c;->b(III)I
/* int-to-float p2, p2 */
/* mul-float p2, p2, v0 */
/* int-to-float p1, p1 */
/* mul-float p1, p1, v1 */
/* add-float/2addr p2, p1 */
/* float-to-int p1, p2 */
} // .end method
public android.view.View a ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 149 */
v0 = this.u;
v0 = (( android.view.ViewGroup ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 150 */
v1 = this.u;
v2 = this.r;
(( c.j.b.c$a ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Lc/j/b/c$a;->a(I)I
(( android.view.ViewGroup ) v1 ).getChildAt ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 151 */
v2 = (( android.view.View ) v1 ).getLeft ( ); // invoke-virtual {v1}, Landroid/view/View;->getLeft()I
/* if-lt p1, v2, :cond_0 */
v2 = (( android.view.View ) v1 ).getRight ( ); // invoke-virtual {v1}, Landroid/view/View;->getRight()I
/* if-ge p1, v2, :cond_0 */
/* .line 152 */
v2 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
/* if-lt p2, v2, :cond_0 */
v2 = (( android.view.View ) v1 ).getBottom ( ); // invoke-virtual {v1}, Landroid/view/View;->getBottom()I
/* if-ge p2, v2, :cond_0 */
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 10 */
/* iput v0, p0, Lc/j/b/c;->c:I */
/* .line 11 */
(( c.j.b.c ) p0 ).b ( ); // invoke-virtual {p0}, Lc/j/b/c;->b()V
/* .line 12 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 13 */
(( android.view.VelocityTracker ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
int v0 = 0; // const/4 v0, 0x0
/* .line 14 */
this.l = v0;
} // :cond_0
return;
} // .end method
public final void a ( Float p0, Float p1 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* .line 40 */
/* iput-boolean v0, p0, Lc/j/b/c;->t:Z */
/* .line 41 */
v1 = this.r;
v2 = this.s;
(( c.j.b.c$a ) v1 ).a ( v2, p1, p2 ); // invoke-virtual {v1, v2, p1, p2}, Lc/j/b/c$a;->a(Landroid/view/View;FF)V
int p1 = 0; // const/4 p1, 0x0
/* .line 42 */
/* iput-boolean p1, p0, Lc/j/b/c;->t:Z */
/* .line 43 */
/* iget p2, p0, Lc/j/b/c;->a:I */
/* if-ne p2, v0, :cond_0 */
/* .line 44 */
(( c.j.b.c ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/j/b/c;->e(I)V
} // :cond_0
return;
} // .end method
public final void a ( Float p0, Float p1, Integer p2 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 121 */
v1 = (( c.j.b.c ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lc/j/b/c;->a(FFII)Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
int v1 = 4; // const/4 v1, 0x4
/* .line 122 */
v1 = (( c.j.b.c ) p0 ).a ( p2, p1, p3, v1 ); // invoke-virtual {p0, p2, p1, p3, v1}, Lc/j/b/c;->a(FFII)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* or-int/lit8 v0, v0, 0x4 */
} // :cond_1
int v1 = 2; // const/4 v1, 0x2
/* .line 123 */
v1 = (( c.j.b.c ) p0 ).a ( p1, p2, p3, v1 ); // invoke-virtual {p0, p1, p2, p3, v1}, Lc/j/b/c;->a(FFII)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* or-int/lit8 v0, v0, 0x2 */
} // :cond_2
/* const/16 v1, 0x8 */
/* .line 124 */
p1 = (( c.j.b.c ) p0 ).a ( p2, p1, p3, v1 ); // invoke-virtual {p0, p2, p1, p3, v1}, Lc/j/b/c;->a(FFII)Z
if ( p1 != null) { // if-eqz p1, :cond_3
/* or-int/lit8 v0, v0, 0x8 */
} // :cond_3
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 125 */
p1 = this.i;
/* aget p2, p1, p3 */
/* or-int/2addr p2, v0 */
/* aput p2, p1, p3 */
/* .line 126 */
p1 = this.r;
(( c.j.b.c$a ) p1 ).a ( v0, p3 ); // invoke-virtual {p1, v0, p3}, Lc/j/b/c$a;->a(II)V
} // :cond_4
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 2 */
/* .line 45 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( c.j.b.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/j/b/c;->c(I)Z
/* if-nez v0, :cond_0 */
/* .line 46 */
} // :cond_0
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
/* aput v1, v0, p1 */
/* .line 47 */
v0 = this.e;
/* aput v1, v0, p1 */
/* .line 48 */
v0 = this.f;
/* aput v1, v0, p1 */
/* .line 49 */
v0 = this.g;
/* aput v1, v0, p1 */
/* .line 50 */
v0 = this.h;
int v1 = 0; // const/4 v1, 0x0
/* aput v1, v0, p1 */
/* .line 51 */
v0 = this.i;
/* aput v1, v0, p1 */
/* .line 52 */
v0 = this.j;
/* aput v1, v0, p1 */
/* .line 53 */
/* iget v0, p0, Lc/j/b/c;->k:I */
int v1 = 1; // const/4 v1, 0x1
/* shl-int p1, v1, p1 */
/* not-int p1, p1 */
/* and-int/2addr p1, v0 */
/* iput p1, p0, Lc/j/b/c;->k:I */
} // :cond_1
} // :goto_0
return;
} // .end method
public final void a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 10 */
/* .line 138 */
v0 = this.s;
v0 = (( android.view.View ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getLeft()I
/* .line 139 */
v1 = this.s;
v1 = (( android.view.View ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/View;->getTop()I
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 140 */
v2 = this.r;
v3 = this.s;
p1 = (( c.j.b.c$a ) v2 ).a ( v3, p1, p3 ); // invoke-virtual {v2, v3, p1, p3}, Lc/j/b/c$a;->a(Landroid/view/View;II)I
/* .line 141 */
v2 = this.s;
/* sub-int v3, p1, v0 */
c.h.n.v0 .d ( v2,v3 );
} // :cond_0
/* move v6, p1 */
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 142 */
p1 = this.r;
v2 = this.s;
p2 = (( c.j.b.c$a ) p1 ).b ( v2, p2, p4 ); // invoke-virtual {p1, v2, p2, p4}, Lc/j/b/c$a;->b(Landroid/view/View;II)I
/* .line 143 */
p1 = this.s;
/* sub-int v2, p2, v1 */
c.h.n.v0 .e ( p1,v2 );
} // :cond_1
/* move v7, p2 */
/* if-nez p3, :cond_2 */
if ( p4 != null) { // if-eqz p4, :cond_3
} // :cond_2
/* sub-int v8, v6, v0 */
/* sub-int v9, v7, v1 */
/* .line 144 */
v4 = this.r;
v5 = this.s;
/* invoke-virtual/range {v4 ..v9}, Lc/j/b/c$a;->a(Landroid/view/View;IIII)V */
} // :cond_3
return;
} // .end method
public void a ( android.view.MotionEvent p0 ) {
/* .locals 9 */
/* .line 54 */
v0 = (( android.view.MotionEvent ) p1 ).getActionMasked ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I
/* .line 55 */
v1 = (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
/* if-nez v0, :cond_0 */
/* .line 56 */
(( c.j.b.c ) p0 ).a ( ); // invoke-virtual {p0}, Lc/j/b/c;->a()V
/* .line 57 */
} // :cond_0
v2 = this.l;
/* if-nez v2, :cond_1 */
/* .line 58 */
android.view.VelocityTracker .obtain ( );
this.l = v2;
/* .line 59 */
} // :cond_1
v2 = this.l;
(( android.view.VelocityTracker ) v2 ).addMovement ( p1 ); // invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_14
int v3 = 1; // const/4 v3, 0x1
/* if-eq v0, v3, :cond_12 */
int v4 = 2; // const/4 v4, 0x2
/* if-eq v0, v4, :cond_b */
int v4 = 3; // const/4 v4, 0x3
/* if-eq v0, v4, :cond_9 */
int v4 = 5; // const/4 v4, 0x5
/* if-eq v0, v4, :cond_7 */
int v4 = 6; // const/4 v4, 0x6
/* if-eq v0, v4, :cond_2 */
/* goto/16 :goto_6 */
/* .line 60 */
} // :cond_2
v0 = (( android.view.MotionEvent ) p1 ).getPointerId ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 61 */
/* iget v1, p0, Lc/j/b/c;->a:I */
/* if-ne v1, v3, :cond_6 */
/* iget v1, p0, Lc/j/b/c;->c:I */
/* if-ne v0, v1, :cond_6 */
/* .line 62 */
v1 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
} // :goto_0
int v3 = -1; // const/4 v3, -0x1
/* if-ge v2, v1, :cond_5 */
/* .line 63 */
v4 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 64 */
/* iget v5, p0, Lc/j/b/c;->c:I */
/* if-ne v4, v5, :cond_3 */
/* .line 65 */
} // :cond_3
v5 = (( android.view.MotionEvent ) p1 ).getX ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F
/* .line 66 */
v6 = (( android.view.MotionEvent ) p1 ).getY ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v5, v5 */
/* float-to-int v6, v6 */
/* .line 67 */
(( c.j.b.c ) p0 ).a ( v5, v6 ); // invoke-virtual {p0, v5, v6}, Lc/j/b/c;->a(II)Landroid/view/View;
v6 = this.s;
/* if-ne v5, v6, :cond_4 */
/* .line 68 */
v4 = (( c.j.b.c ) p0 ).b ( v6, v4 ); // invoke-virtual {p0, v6, v4}, Lc/j/b/c;->b(Landroid/view/View;I)Z
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 69 */
/* iget p1, p0, Lc/j/b/c;->c:I */
} // :cond_4
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_5
int p1 = -1; // const/4 p1, -0x1
} // :goto_2
/* if-ne p1, v3, :cond_6 */
/* .line 70 */
(( c.j.b.c ) p0 ).d ( ); // invoke-virtual {p0}, Lc/j/b/c;->d()V
/* .line 71 */
} // :cond_6
(( c.j.b.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/j/b/c;->a(I)V
/* goto/16 :goto_6 */
/* .line 72 */
} // :cond_7
v0 = (( android.view.MotionEvent ) p1 ).getPointerId ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 73 */
v2 = (( android.view.MotionEvent ) p1 ).getX ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F
/* .line 74 */
p1 = (( android.view.MotionEvent ) p1 ).getY ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F
/* .line 75 */
(( c.j.b.c ) p0 ).b ( v2, p1, v0 ); // invoke-virtual {p0, v2, p1, v0}, Lc/j/b/c;->b(FFI)V
/* .line 76 */
/* iget v1, p0, Lc/j/b/c;->a:I */
/* if-nez v1, :cond_8 */
/* float-to-int v1, v2 */
/* float-to-int p1, p1 */
/* .line 77 */
(( c.j.b.c ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lc/j/b/c;->a(II)Landroid/view/View;
/* .line 78 */
(( c.j.b.c ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/j/b/c;->b(Landroid/view/View;I)Z
/* .line 79 */
p1 = this.h;
/* aget p1, p1, v0 */
/* .line 80 */
/* iget v1, p0, Lc/j/b/c;->p:I */
/* and-int v2, p1, v1 */
if ( v2 != null) { // if-eqz v2, :cond_15
/* .line 81 */
v2 = this.r;
/* and-int/2addr p1, v1 */
(( c.j.b.c$a ) v2 ).b ( p1, v0 ); // invoke-virtual {v2, p1, v0}, Lc/j/b/c$a;->b(II)V
/* goto/16 :goto_6 */
} // :cond_8
/* float-to-int v1, v2 */
/* float-to-int p1, p1 */
/* .line 82 */
p1 = (( c.j.b.c ) p0 ).c ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lc/j/b/c;->c(II)Z
if ( p1 != null) { // if-eqz p1, :cond_15
/* .line 83 */
p1 = this.s;
(( c.j.b.c ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/j/b/c;->b(Landroid/view/View;I)Z
/* goto/16 :goto_6 */
/* .line 84 */
} // :cond_9
/* iget p1, p0, Lc/j/b/c;->a:I */
/* if-ne p1, v3, :cond_a */
int p1 = 0; // const/4 p1, 0x0
/* .line 85 */
(( c.j.b.c ) p0 ).a ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lc/j/b/c;->a(FF)V
/* .line 86 */
} // :cond_a
(( c.j.b.c ) p0 ).a ( ); // invoke-virtual {p0}, Lc/j/b/c;->a()V
/* goto/16 :goto_6 */
/* .line 87 */
} // :cond_b
/* iget v0, p0, Lc/j/b/c;->a:I */
/* if-ne v0, v3, :cond_d */
/* .line 88 */
/* iget v0, p0, Lc/j/b/c;->c:I */
v0 = (( c.j.b.c ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lc/j/b/c;->d(I)Z
/* if-nez v0, :cond_c */
/* goto/16 :goto_6 */
/* .line 89 */
} // :cond_c
/* iget v0, p0, Lc/j/b/c;->c:I */
v0 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* .line 90 */
v1 = (( android.view.MotionEvent ) p1 ).getX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
/* .line 91 */
v0 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* .line 92 */
v2 = this.f;
/* iget v3, p0, Lc/j/b/c;->c:I */
/* aget v2, v2, v3 */
/* sub-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* .line 93 */
v2 = this.g;
/* aget v2, v2, v3 */
/* sub-float/2addr v0, v2 */
/* float-to-int v0, v0 */
/* .line 94 */
v2 = this.s;
v2 = (( android.view.View ) v2 ).getLeft ( ); // invoke-virtual {v2}, Landroid/view/View;->getLeft()I
/* add-int/2addr v2, v1 */
v3 = this.s;
v3 = (( android.view.View ) v3 ).getTop ( ); // invoke-virtual {v3}, Landroid/view/View;->getTop()I
/* add-int/2addr v3, v0 */
(( c.j.b.c ) p0 ).a ( v2, v3, v1, v0 ); // invoke-virtual {p0, v2, v3, v1, v0}, Lc/j/b/c;->a(IIII)V
/* .line 95 */
(( c.j.b.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/j/b/c;->b(Landroid/view/MotionEvent;)V
/* goto/16 :goto_6 */
/* .line 96 */
} // :cond_d
v0 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
} // :goto_3
/* if-ge v2, v0, :cond_11 */
/* .line 97 */
v1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 98 */
v4 = (( c.j.b.c ) p0 ).d ( v1 ); // invoke-virtual {p0, v1}, Lc/j/b/c;->d(I)Z
/* if-nez v4, :cond_e */
/* .line 99 */
} // :cond_e
v4 = (( android.view.MotionEvent ) p1 ).getX ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F
/* .line 100 */
v5 = (( android.view.MotionEvent ) p1 ).getY ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F
/* .line 101 */
v6 = this.d;
/* aget v6, v6, v1 */
/* sub-float v6, v4, v6 */
/* .line 102 */
v7 = this.e;
/* aget v7, v7, v1 */
/* sub-float v7, v5, v7 */
/* .line 103 */
(( c.j.b.c ) p0 ).a ( v6, v7, v1 ); // invoke-virtual {p0, v6, v7, v1}, Lc/j/b/c;->a(FFI)V
/* .line 104 */
/* iget v8, p0, Lc/j/b/c;->a:I */
/* if-ne v8, v3, :cond_f */
} // :cond_f
/* float-to-int v4, v4 */
/* float-to-int v5, v5 */
/* .line 105 */
(( c.j.b.c ) p0 ).a ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lc/j/b/c;->a(II)Landroid/view/View;
/* .line 106 */
v5 = (( c.j.b.c ) p0 ).a ( v4, v6, v7 ); // invoke-virtual {p0, v4, v6, v7}, Lc/j/b/c;->a(Landroid/view/View;FF)Z
if ( v5 != null) { // if-eqz v5, :cond_10
/* .line 107 */
v1 = (( c.j.b.c ) p0 ).b ( v4, v1 ); // invoke-virtual {p0, v4, v1}, Lc/j/b/c;->b(Landroid/view/View;I)Z
if ( v1 != null) { // if-eqz v1, :cond_10
} // :cond_10
} // :goto_4
/* add-int/lit8 v2, v2, 0x1 */
/* .line 108 */
} // :cond_11
} // :goto_5
(( c.j.b.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/j/b/c;->b(Landroid/view/MotionEvent;)V
/* .line 109 */
} // :cond_12
/* iget p1, p0, Lc/j/b/c;->a:I */
/* if-ne p1, v3, :cond_13 */
/* .line 110 */
(( c.j.b.c ) p0 ).d ( ); // invoke-virtual {p0}, Lc/j/b/c;->d()V
/* .line 111 */
} // :cond_13
(( c.j.b.c ) p0 ).a ( ); // invoke-virtual {p0}, Lc/j/b/c;->a()V
/* .line 112 */
} // :cond_14
v0 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* .line 113 */
v1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* .line 114 */
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I
/* float-to-int v2, v0 */
/* float-to-int v3, v1 */
/* .line 115 */
(( c.j.b.c ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lc/j/b/c;->a(II)Landroid/view/View;
/* .line 116 */
(( c.j.b.c ) p0 ).b ( v0, v1, p1 ); // invoke-virtual {p0, v0, v1, p1}, Lc/j/b/c;->b(FFI)V
/* .line 117 */
(( c.j.b.c ) p0 ).b ( v2, p1 ); // invoke-virtual {p0, v2, p1}, Lc/j/b/c;->b(Landroid/view/View;I)Z
/* .line 118 */
v0 = this.h;
/* aget v0, v0, p1 */
/* .line 119 */
/* iget v1, p0, Lc/j/b/c;->p:I */
/* and-int v2, v0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_15
/* .line 120 */
v2 = this.r;
/* and-int/2addr v0, v1 */
(( c.j.b.c$a ) v2 ).b ( v0, p1 ); // invoke-virtual {v2, v0, p1}, Lc/j/b/c$a;->b(II)V
} // :cond_15
} // :goto_6
return;
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
/* .locals 2 */
/* .line 4 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
v1 = this.u;
/* if-ne v0, v1, :cond_0 */
/* .line 5 */
this.s = p1;
/* .line 6 */
/* iput p2, p0, Lc/j/b/c;->c:I */
/* .line 7 */
v0 = this.r;
(( c.j.b.c$a ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/j/b/c$a;->a(Landroid/view/View;I)V
int p1 = 1; // const/4 p1, 0x1
/* .line 8 */
(( c.j.b.c ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/j/b/c;->e(I)V
return;
/* .line 9 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("; // const-string v0, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.u;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v0 = ")"; // const-string v0, ")"
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final Boolean a ( Float p0, Float p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .line 127 */
p1 = java.lang.Math .abs ( p1 );
/* .line 128 */
p2 = java.lang.Math .abs ( p2 );
/* .line 129 */
v0 = this.h;
/* aget v0, v0, p3 */
/* and-int/2addr v0, p4 */
int v1 = 0; // const/4 v1, 0x0
/* if-ne v0, p4, :cond_2 */
/* iget v0, p0, Lc/j/b/c;->p:I */
/* and-int/2addr v0, p4 */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.j;
/* aget v0, v0, p3 */
/* and-int/2addr v0, p4 */
/* if-eq v0, p4, :cond_2 */
v0 = this.i;
/* aget v0, v0, p3 */
/* and-int/2addr v0, p4 */
/* if-eq v0, p4, :cond_2 */
/* iget v0, p0, Lc/j/b/c;->b:I */
/* int-to-float v2, v0 */
/* cmpg-float v2, p1, v2 */
/* if-gtz v2, :cond_0 */
/* int-to-float v0, v0 */
/* cmpg-float v0, p2, v0 */
/* if-gtz v0, :cond_0 */
} // :cond_0
/* const/high16 v0, 0x3f000000 # 0.5f */
/* mul-float p2, p2, v0 */
/* cmpg-float p2, p1, p2 */
/* if-gez p2, :cond_1 */
/* .line 130 */
p2 = this.r;
p2 = (( c.j.b.c$a ) p2 ).b ( p4 ); // invoke-virtual {p2, p4}, Lc/j/b/c$a;->b(I)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 131 */
p1 = this.j;
/* aget p2, p1, p3 */
/* or-int/2addr p2, p4 */
/* aput p2, p1, p3 */
/* .line 132 */
} // :cond_1
p2 = this.i;
/* aget p2, p2, p3 */
/* and-int/2addr p2, p4 */
/* if-nez p2, :cond_2 */
/* iget p2, p0, Lc/j/b/c;->b:I */
/* int-to-float p2, p2 */
/* cmpl-float p1, p1, p2 */
/* if-lez p1, :cond_2 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
} // :goto_0
} // .end method
public final Boolean a ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 133 */
} // :cond_0
v1 = this.r;
v1 = (( c.j.b.c$a ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lc/j/b/c$a;->a(Landroid/view/View;)I
int v2 = 1; // const/4 v2, 0x1
/* if-lez v1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 134 */
} // :goto_0
v3 = this.r;
p1 = (( c.j.b.c$a ) v3 ).b ( p1 ); // invoke-virtual {v3, p1}, Lc/j/b/c$a;->b(Landroid/view/View;)I
/* if-lez p1, :cond_2 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_4
if ( p1 != null) { // if-eqz p1, :cond_4
/* mul-float p2, p2, p2 */
/* mul-float p3, p3, p3 */
/* add-float/2addr p2, p3 */
/* .line 135 */
/* iget p1, p0, Lc/j/b/c;->b:I */
/* mul-int p1, p1, p1 */
/* int-to-float p1, p1 */
/* cmpl-float p1, p2, p1 */
/* if-lez p1, :cond_3 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
} // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 136 */
p1 = java.lang.Math .abs ( p2 );
/* iget p2, p0, Lc/j/b/c;->b:I */
/* int-to-float p2, p2 */
/* cmpl-float p1, p1, p2 */
/* if-lez p1, :cond_5 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_5
} // :cond_6
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 137 */
p1 = java.lang.Math .abs ( p3 );
/* iget p2, p0, Lc/j/b/c;->b:I */
/* int-to-float p2, p2 */
/* cmpl-float p1, p1, p2 */
/* if-lez p1, :cond_7 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_7
} // .end method
public Boolean a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 145 */
} // :cond_0
v1 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* if-lt p2, v1, :cond_1 */
/* .line 146 */
v1 = (( android.view.View ) p1 ).getRight ( ); // invoke-virtual {p1}, Landroid/view/View;->getRight()I
/* if-ge p2, v1, :cond_1 */
/* .line 147 */
p2 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* if-lt p3, p2, :cond_1 */
/* .line 148 */
p1 = (( android.view.View ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/View;->getBottom()I
/* if-ge p3, p1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
} // .end method
public Boolean a ( Boolean p0 ) {
/* .locals 11 */
/* .line 26 */
/* iget v0, p0, Lc/j/b/c;->a:I */
int v1 = 2; // const/4 v1, 0x2
int v2 = 0; // const/4 v2, 0x0
/* if-ne v0, v1, :cond_6 */
/* .line 27 */
v0 = this.q;
v0 = (( android.widget.OverScroller ) v0 ).computeScrollOffset ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z
/* .line 28 */
v3 = this.q;
v3 = (( android.widget.OverScroller ) v3 ).getCurrX ( ); // invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrX()I
/* .line 29 */
v4 = this.q;
v10 = (( android.widget.OverScroller ) v4 ).getCurrY ( ); // invoke-virtual {v4}, Landroid/widget/OverScroller;->getCurrY()I
/* .line 30 */
v4 = this.s;
v4 = (( android.view.View ) v4 ).getLeft ( ); // invoke-virtual {v4}, Landroid/view/View;->getLeft()I
/* sub-int v8, v3, v4 */
/* .line 31 */
v4 = this.s;
v4 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
/* sub-int v9, v10, v4 */
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 32 */
v4 = this.s;
c.h.n.v0 .d ( v4,v8 );
} // :cond_0
if ( v9 != null) { // if-eqz v9, :cond_1
/* .line 33 */
v4 = this.s;
c.h.n.v0 .e ( v4,v9 );
} // :cond_1
/* if-nez v8, :cond_2 */
if ( v9 != null) { // if-eqz v9, :cond_3
/* .line 34 */
} // :cond_2
v4 = this.r;
v5 = this.s;
/* move v6, v3 */
/* move v7, v10 */
/* invoke-virtual/range {v4 ..v9}, Lc/j/b/c$a;->a(Landroid/view/View;IIII)V */
} // :cond_3
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 35 */
v4 = this.q;
v4 = (( android.widget.OverScroller ) v4 ).getFinalX ( ); // invoke-virtual {v4}, Landroid/widget/OverScroller;->getFinalX()I
/* if-ne v3, v4, :cond_4 */
v3 = this.q;
v3 = (( android.widget.OverScroller ) v3 ).getFinalY ( ); // invoke-virtual {v3}, Landroid/widget/OverScroller;->getFinalY()I
/* if-ne v10, v3, :cond_4 */
/* .line 36 */
v0 = this.q;
(( android.widget.OverScroller ) v0 ).abortAnimation ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V
int v0 = 0; // const/4 v0, 0x0
} // :cond_4
/* if-nez v0, :cond_6 */
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 37 */
p1 = this.u;
v0 = this.v;
(( android.view.ViewGroup ) p1 ).post ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
/* .line 38 */
} // :cond_5
(( c.j.b.c ) p0 ).e ( v2 ); // invoke-virtual {p0, v2}, Lc/j/b/c;->e(I)V
/* .line 39 */
} // :cond_6
} // :goto_0
/* iget p1, p0, Lc/j/b/c;->a:I */
/* if-ne p1, v1, :cond_7 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_7
} // .end method
public final Integer b ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 69 */
v0 = this.u;
v0 = (( android.view.ViewGroup ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getLeft()I
/* iget v1, p0, Lc/j/b/c;->o:I */
/* add-int/2addr v0, v1 */
/* if-ge p1, v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 70 */
} // :goto_0
v1 = this.u;
v1 = (( android.view.ViewGroup ) v1 ).getTop ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getTop()I
/* iget v2, p0, Lc/j/b/c;->o:I */
/* add-int/2addr v1, v2 */
/* if-ge p2, v1, :cond_1 */
/* or-int/lit8 v0, v0, 0x4 */
/* .line 71 */
} // :cond_1
v1 = this.u;
v1 = (( android.view.ViewGroup ) v1 ).getRight ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getRight()I
/* iget v2, p0, Lc/j/b/c;->o:I */
/* sub-int/2addr v1, v2 */
/* if-le p1, v1, :cond_2 */
/* or-int/lit8 v0, v0, 0x2 */
/* .line 72 */
} // :cond_2
p1 = this.u;
p1 = (( android.view.ViewGroup ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getBottom()I
/* iget v1, p0, Lc/j/b/c;->o:I */
/* sub-int/2addr p1, v1 */
/* if-le p2, p1, :cond_3 */
/* or-int/lit8 v0, v0, 0x8 */
} // :cond_3
} // .end method
public final Integer b ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 13 */
} // :cond_0
v0 = this.u;
v0 = (( android.view.ViewGroup ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getWidth()I
/* .line 14 */
/* div-int/lit8 v1, v0, 0x2 */
/* .line 15 */
v2 = java.lang.Math .abs ( p1 );
/* int-to-float v2, v2 */
/* int-to-float v0, v0 */
/* div-float/2addr v2, v0 */
/* const/high16 v0, 0x3f800000 # 1.0f */
v2 = java.lang.Math .min ( v0,v2 );
/* int-to-float v1, v1 */
/* .line 16 */
v2 = (( c.j.b.c ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lc/j/b/c;->a(F)F
/* mul-float v2, v2, v1 */
/* add-float/2addr v1, v2 */
/* .line 17 */
p2 = java.lang.Math .abs ( p2 );
/* if-lez p2, :cond_1 */
/* const/high16 p1, 0x447a0000 # 1000.0f */
/* int-to-float p2, p2 */
/* div-float/2addr v1, p2 */
/* .line 18 */
p2 = java.lang.Math .abs ( v1 );
/* mul-float p2, p2, p1 */
p1 = java.lang.Math .round ( p2 );
/* mul-int/lit8 p1, p1, 0x4 */
/* .line 19 */
} // :cond_1
p1 = java.lang.Math .abs ( p1 );
/* int-to-float p1, p1 */
/* int-to-float p2, p3 */
/* div-float/2addr p1, p2 */
/* add-float/2addr p1, v0 */
/* const/high16 p2, 0x43800000 # 256.0f */
/* mul-float p1, p1, p2 */
/* float-to-int p1, p1 */
} // :goto_0
/* const/16 p2, 0x258 */
/* .line 20 */
p1 = java.lang.Math .min ( p1,p2 );
} // .end method
public final void b ( ) {
/* .locals 2 */
/* .line 21 */
v0 = this.d;
/* if-nez v0, :cond_0 */
return;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 22 */
java.util.Arrays .fill ( v0,v1 );
/* .line 23 */
v0 = this.e;
java.util.Arrays .fill ( v0,v1 );
/* .line 24 */
v0 = this.f;
java.util.Arrays .fill ( v0,v1 );
/* .line 25 */
v0 = this.g;
java.util.Arrays .fill ( v0,v1 );
/* .line 26 */
v0 = this.h;
int v1 = 0; // const/4 v1, 0x0
java.util.Arrays .fill ( v0,v1 );
/* .line 27 */
v0 = this.i;
java.util.Arrays .fill ( v0,v1 );
/* .line 28 */
v0 = this.j;
java.util.Arrays .fill ( v0,v1 );
/* .line 29 */
/* iput v1, p0, Lc/j/b/c;->k:I */
return;
} // .end method
public final void b ( Float p0, Float p1, Integer p2 ) {
/* .locals 2 */
/* .line 53 */
(( c.j.b.c ) p0 ).b ( p3 ); // invoke-virtual {p0, p3}, Lc/j/b/c;->b(I)V
/* .line 54 */
v0 = this.d;
v1 = this.f;
/* aput p1, v1, p3 */
/* aput p1, v0, p3 */
/* .line 55 */
v0 = this.e;
v1 = this.g;
/* aput p2, v1, p3 */
/* aput p2, v0, p3 */
/* .line 56 */
v0 = this.h;
/* float-to-int p1, p1 */
/* float-to-int p2, p2 */
p1 = (( c.j.b.c ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/j/b/c;->b(II)I
/* aput p1, v0, p3 */
/* .line 57 */
/* iget p1, p0, Lc/j/b/c;->k:I */
int p2 = 1; // const/4 p2, 0x1
/* shl-int/2addr p2, p3 */
/* or-int/2addr p1, p2 */
/* iput p1, p0, Lc/j/b/c;->k:I */
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 9 */
/* .line 30 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* array-length v0, v0 */
/* if-gt v0, p1, :cond_2 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
/* .line 31 */
/* new-array v0, p1, [F */
/* .line 32 */
/* new-array v1, p1, [F */
/* .line 33 */
/* new-array v2, p1, [F */
/* .line 34 */
/* new-array v3, p1, [F */
/* .line 35 */
/* new-array v4, p1, [I */
/* .line 36 */
/* new-array v5, p1, [I */
/* .line 37 */
/* new-array p1, p1, [I */
/* .line 38 */
v6 = this.d;
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 39 */
/* array-length v7, v6 */
int v8 = 0; // const/4 v8, 0x0
java.lang.System .arraycopy ( v6,v8,v0,v8,v7 );
/* .line 40 */
v6 = this.e;
/* array-length v7, v6 */
java.lang.System .arraycopy ( v6,v8,v1,v8,v7 );
/* .line 41 */
v6 = this.f;
/* array-length v7, v6 */
java.lang.System .arraycopy ( v6,v8,v2,v8,v7 );
/* .line 42 */
v6 = this.g;
/* array-length v7, v6 */
java.lang.System .arraycopy ( v6,v8,v3,v8,v7 );
/* .line 43 */
v6 = this.h;
/* array-length v7, v6 */
java.lang.System .arraycopy ( v6,v8,v4,v8,v7 );
/* .line 44 */
v6 = this.i;
/* array-length v7, v6 */
java.lang.System .arraycopy ( v6,v8,v5,v8,v7 );
/* .line 45 */
v6 = this.j;
/* array-length v7, v6 */
java.lang.System .arraycopy ( v6,v8,p1,v8,v7 );
/* .line 46 */
} // :cond_1
this.d = v0;
/* .line 47 */
this.e = v1;
/* .line 48 */
this.f = v2;
/* .line 49 */
this.g = v3;
/* .line 50 */
this.h = v4;
/* .line 51 */
this.i = v5;
/* .line 52 */
this.j = p1;
} // :cond_2
return;
} // .end method
public final void b ( android.view.MotionEvent p0 ) {
/* .locals 6 */
/* .line 58 */
v0 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 59 */
v2 = (( android.view.MotionEvent ) p1 ).getPointerId ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 60 */
v3 = (( c.j.b.c ) p0 ).d ( v2 ); // invoke-virtual {p0, v2}, Lc/j/b/c;->d(I)Z
/* if-nez v3, :cond_0 */
/* .line 61 */
} // :cond_0
v3 = (( android.view.MotionEvent ) p1 ).getX ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F
/* .line 62 */
v4 = (( android.view.MotionEvent ) p1 ).getY ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F
/* .line 63 */
v5 = this.f;
/* aput v3, v5, v2 */
/* .line 64 */
v3 = this.g;
/* aput v4, v3, v2 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public final Boolean b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 10 */
/* .line 6 */
v0 = this.s;
v2 = (( android.view.View ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getLeft()I
/* .line 7 */
v0 = this.s;
v3 = (( android.view.View ) v0 ).getTop ( ); // invoke-virtual {v0}, Landroid/view/View;->getTop()I
/* sub-int/2addr p1, v2 */
/* sub-int/2addr p2, v3 */
/* if-nez p1, :cond_0 */
/* if-nez p2, :cond_0 */
/* .line 8 */
p1 = this.q;
(( android.widget.OverScroller ) p1 ).abortAnimation ( ); // invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V
int p1 = 0; // const/4 p1, 0x0
/* .line 9 */
(( c.j.b.c ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/j/b/c;->e(I)V
/* .line 10 */
} // :cond_0
v5 = this.s;
/* move-object v4, p0 */
/* move v6, p1 */
/* move v7, p2 */
/* move v8, p3 */
/* move v9, p4 */
v6 = /* invoke-virtual/range {v4 ..v9}, Lc/j/b/c;->a(Landroid/view/View;IIII)I */
/* .line 11 */
v1 = this.q;
/* move v4, p1 */
/* move v5, p2 */
/* invoke-virtual/range {v1 ..v6}, Landroid/widget/OverScroller;->startScroll(IIIII)V */
int p1 = 2; // const/4 p1, 0x2
/* .line 12 */
(( c.j.b.c ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lc/j/b/c;->e(I)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean b ( android.view.View p0, Integer p1 ) {
/* .locals 2 */
/* .line 65 */
v0 = this.s;
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v0, :cond_0 */
/* iget v0, p0, Lc/j/b/c;->c:I */
/* if-ne v0, p2, :cond_0 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 66 */
v0 = this.r;
v0 = (( c.j.b.c$a ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/j/b/c$a;->b(Landroid/view/View;I)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 67 */
/* iput p2, p0, Lc/j/b/c;->c:I */
/* .line 68 */
(( c.j.b.c ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/j/b/c;->a(Landroid/view/View;I)V
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean b ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 1 */
this.s = p1;
int p1 = -1; // const/4 p1, -0x1
/* .line 2 */
/* iput p1, p0, Lc/j/b/c;->c:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
p1 = (( c.j.b.c ) p0 ).b ( p2, p3, p1, p1 ); // invoke-virtual {p0, p2, p3, p1, p1}, Lc/j/b/c;->b(IIII)Z
/* if-nez p1, :cond_0 */
/* .line 4 */
/* iget p2, p0, Lc/j/b/c;->a:I */
/* if-nez p2, :cond_0 */
p2 = this.s;
if ( p2 != null) { // if-eqz p2, :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 5 */
this.s = p2;
} // :cond_0
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/j/b/c;->b:I */
} // .end method
public Boolean c ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
/* iget v0, p0, Lc/j/b/c;->k:I */
int v1 = 1; // const/4 v1, 0x1
/* shl-int p1, v1, p1 */
/* and-int/2addr p1, v0 */
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public Boolean c ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 54 */
v0 = this.s;
p1 = (( c.j.b.c ) p0 ).a ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Lc/j/b/c;->a(Landroid/view/View;II)Z
} // .end method
public Boolean c ( android.view.MotionEvent p0 ) {
/* .locals 16 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* .line 3 */
v2 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getActionMasked()I */
/* .line 4 */
v3 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getActionIndex()I */
/* if-nez v2, :cond_0 */
/* .line 5 */
/* invoke-virtual/range {p0 ..p0}, Lc/j/b/c;->a()V */
/* .line 6 */
} // :cond_0
v4 = this.l;
/* if-nez v4, :cond_1 */
/* .line 7 */
android.view.VelocityTracker .obtain ( );
this.l = v4;
/* .line 8 */
} // :cond_1
v4 = this.l;
(( android.view.VelocityTracker ) v4 ).addMovement ( v1 ); // invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
int v4 = 2; // const/4 v4, 0x2
int v6 = 1; // const/4 v6, 0x1
if ( v2 != null) { // if-eqz v2, :cond_10
/* if-eq v2, v6, :cond_f */
/* if-eq v2, v4, :cond_6 */
int v7 = 3; // const/4 v7, 0x3
/* if-eq v2, v7, :cond_f */
int v7 = 5; // const/4 v7, 0x5
/* if-eq v2, v7, :cond_4 */
int v4 = 6; // const/4 v4, 0x6
/* if-eq v2, v4, :cond_3 */
} // :cond_2
} // :goto_0
int v5 = 0; // const/4 v5, 0x0
/* goto/16 :goto_5 */
/* .line 9 */
} // :cond_3
v1 = (( android.view.MotionEvent ) v1 ).getPointerId ( v3 ); // invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 10 */
(( c.j.b.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/j/b/c;->a(I)V
/* .line 11 */
} // :cond_4
v2 = (( android.view.MotionEvent ) v1 ).getPointerId ( v3 ); // invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 12 */
v7 = (( android.view.MotionEvent ) v1 ).getX ( v3 ); // invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F
/* .line 13 */
v1 = (( android.view.MotionEvent ) v1 ).getY ( v3 ); // invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F
/* .line 14 */
(( c.j.b.c ) v0 ).b ( v7, v1, v2 ); // invoke-virtual {v0, v7, v1, v2}, Lc/j/b/c;->b(FFI)V
/* .line 15 */
/* iget v3, v0, Lc/j/b/c;->a:I */
/* if-nez v3, :cond_5 */
/* .line 16 */
v1 = this.h;
/* aget v1, v1, v2 */
/* .line 17 */
/* iget v3, v0, Lc/j/b/c;->p:I */
/* and-int v4, v1, v3 */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 18 */
v4 = this.r;
/* and-int/2addr v1, v3 */
(( c.j.b.c$a ) v4 ).b ( v1, v2 ); // invoke-virtual {v4, v1, v2}, Lc/j/b/c$a;->b(II)V
} // :cond_5
/* if-ne v3, v4, :cond_2 */
/* float-to-int v3, v7 */
/* float-to-int v1, v1 */
/* .line 19 */
(( c.j.b.c ) v0 ).a ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Lc/j/b/c;->a(II)Landroid/view/View;
/* .line 20 */
v3 = this.s;
/* if-ne v1, v3, :cond_2 */
/* .line 21 */
(( c.j.b.c ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/j/b/c;->b(Landroid/view/View;I)Z
/* .line 22 */
} // :cond_6
v2 = this.d;
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.e;
/* if-nez v2, :cond_7 */
/* .line 23 */
} // :cond_7
v2 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getPointerCount()I */
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-ge v3, v2, :cond_e */
/* .line 24 */
v4 = (( android.view.MotionEvent ) v1 ).getPointerId ( v3 ); // invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 25 */
v7 = (( c.j.b.c ) v0 ).d ( v4 ); // invoke-virtual {v0, v4}, Lc/j/b/c;->d(I)Z
/* if-nez v7, :cond_8 */
/* goto/16 :goto_3 */
/* .line 26 */
} // :cond_8
v7 = (( android.view.MotionEvent ) v1 ).getX ( v3 ); // invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F
/* .line 27 */
v8 = (( android.view.MotionEvent ) v1 ).getY ( v3 ); // invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F
/* .line 28 */
v9 = this.d;
/* aget v9, v9, v4 */
/* sub-float v9, v7, v9 */
/* .line 29 */
v10 = this.e;
/* aget v10, v10, v4 */
/* sub-float v10, v8, v10 */
/* float-to-int v7, v7 */
/* float-to-int v8, v8 */
/* .line 30 */
(( c.j.b.c ) v0 ).a ( v7, v8 ); // invoke-virtual {v0, v7, v8}, Lc/j/b/c;->a(II)Landroid/view/View;
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 31 */
v8 = (( c.j.b.c ) v0 ).a ( v7, v9, v10 ); // invoke-virtual {v0, v7, v9, v10}, Lc/j/b/c;->a(Landroid/view/View;FF)Z
if ( v8 != null) { // if-eqz v8, :cond_9
int v8 = 1; // const/4 v8, 0x1
} // :cond_9
int v8 = 0; // const/4 v8, 0x0
} // :goto_2
if ( v8 != null) { // if-eqz v8, :cond_b
/* .line 32 */
v11 = (( android.view.View ) v7 ).getLeft ( ); // invoke-virtual {v7}, Landroid/view/View;->getLeft()I
/* float-to-int v12, v9 */
/* add-int v13, v11, v12 */
/* .line 33 */
v14 = this.r;
v12 = (( c.j.b.c$a ) v14 ).a ( v7, v13, v12 ); // invoke-virtual {v14, v7, v13, v12}, Lc/j/b/c$a;->a(Landroid/view/View;II)I
/* .line 34 */
v13 = (( android.view.View ) v7 ).getTop ( ); // invoke-virtual {v7}, Landroid/view/View;->getTop()I
/* float-to-int v14, v10 */
/* add-int v15, v13, v14 */
/* .line 35 */
v5 = this.r;
v5 = (( c.j.b.c$a ) v5 ).b ( v7, v15, v14 ); // invoke-virtual {v5, v7, v15, v14}, Lc/j/b/c$a;->b(Landroid/view/View;II)I
/* .line 36 */
v14 = this.r;
v14 = (( c.j.b.c$a ) v14 ).a ( v7 ); // invoke-virtual {v14, v7}, Lc/j/b/c$a;->a(Landroid/view/View;)I
/* .line 37 */
v15 = this.r;
v15 = (( c.j.b.c$a ) v15 ).b ( v7 ); // invoke-virtual {v15, v7}, Lc/j/b/c$a;->b(Landroid/view/View;)I
if ( v14 != null) { // if-eqz v14, :cond_a
/* if-lez v14, :cond_b */
/* if-ne v12, v11, :cond_b */
} // :cond_a
if ( v15 != null) { // if-eqz v15, :cond_e
/* if-lez v15, :cond_b */
/* if-ne v5, v13, :cond_b */
/* .line 38 */
} // :cond_b
(( c.j.b.c ) v0 ).a ( v9, v10, v4 ); // invoke-virtual {v0, v9, v10, v4}, Lc/j/b/c;->a(FFI)V
/* .line 39 */
/* iget v5, v0, Lc/j/b/c;->a:I */
/* if-ne v5, v6, :cond_c */
} // :cond_c
if ( v8 != null) { // if-eqz v8, :cond_d
/* .line 40 */
v4 = (( c.j.b.c ) v0 ).b ( v7, v4 ); // invoke-virtual {v0, v7, v4}, Lc/j/b/c;->b(Landroid/view/View;I)Z
if ( v4 != null) { // if-eqz v4, :cond_d
} // :cond_d
} // :goto_3
/* add-int/lit8 v3, v3, 0x1 */
/* .line 41 */
} // :cond_e
} // :goto_4
/* invoke-virtual/range {p0 ..p1}, Lc/j/b/c;->b(Landroid/view/MotionEvent;)V */
/* goto/16 :goto_0 */
/* .line 42 */
} // :cond_f
/* invoke-virtual/range {p0 ..p0}, Lc/j/b/c;->a()V */
/* goto/16 :goto_0 */
/* .line 43 */
} // :cond_10
v2 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getX()F */
/* .line 44 */
v3 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getY()F */
int v5 = 0; // const/4 v5, 0x0
/* .line 45 */
v1 = (( android.view.MotionEvent ) v1 ).getPointerId ( v5 ); // invoke-virtual {v1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 46 */
(( c.j.b.c ) v0 ).b ( v2, v3, v1 ); // invoke-virtual {v0, v2, v3, v1}, Lc/j/b/c;->b(FFI)V
/* float-to-int v2, v2 */
/* float-to-int v3, v3 */
/* .line 47 */
(( c.j.b.c ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lc/j/b/c;->a(II)Landroid/view/View;
/* .line 48 */
v3 = this.s;
/* if-ne v2, v3, :cond_11 */
/* iget v3, v0, Lc/j/b/c;->a:I */
/* if-ne v3, v4, :cond_11 */
/* .line 49 */
(( c.j.b.c ) v0 ).b ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lc/j/b/c;->b(Landroid/view/View;I)Z
/* .line 50 */
} // :cond_11
v2 = this.h;
/* aget v2, v2, v1 */
/* .line 51 */
/* iget v3, v0, Lc/j/b/c;->p:I */
/* and-int v4, v2, v3 */
if ( v4 != null) { // if-eqz v4, :cond_12
/* .line 52 */
v4 = this.r;
/* and-int/2addr v2, v3 */
(( c.j.b.c$a ) v4 ).b ( v2, v1 ); // invoke-virtual {v4, v2, v1}, Lc/j/b/c$a;->b(II)V
/* .line 53 */
} // :cond_12
} // :goto_5
/* iget v1, v0, Lc/j/b/c;->a:I */
/* if-ne v1, v6, :cond_13 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_13
} // .end method
public final void d ( ) {
/* .locals 4 */
/* .line 7 */
v0 = this.l;
/* iget v1, p0, Lc/j/b/c;->m:F */
/* const/16 v2, 0x3e8 */
(( android.view.VelocityTracker ) v0 ).computeCurrentVelocity ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
/* .line 8 */
v0 = this.l;
/* iget v1, p0, Lc/j/b/c;->c:I */
/* .line 9 */
v0 = (( android.view.VelocityTracker ) v0 ).getXVelocity ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F
/* iget v1, p0, Lc/j/b/c;->n:F */
/* iget v2, p0, Lc/j/b/c;->m:F */
/* .line 10 */
v0 = (( c.j.b.c ) p0 ).a ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lc/j/b/c;->a(FFF)F
/* .line 11 */
v1 = this.l;
/* iget v2, p0, Lc/j/b/c;->c:I */
/* .line 12 */
v1 = (( android.view.VelocityTracker ) v1 ).getYVelocity ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F
/* iget v2, p0, Lc/j/b/c;->n:F */
/* iget v3, p0, Lc/j/b/c;->m:F */
/* .line 13 */
v1 = (( c.j.b.c ) p0 ).a ( v1, v2, v3 ); // invoke-virtual {p0, v1, v2, v3}, Lc/j/b/c;->a(FFF)F
/* .line 14 */
(( c.j.b.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lc/j/b/c;->a(FF)V
return;
} // .end method
public final Boolean d ( Integer p0 ) {
/* .locals 2 */
/* .line 15 */
v0 = (( c.j.b.c ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/j/b/c;->c(I)Z
/* if-nez v0, :cond_0 */
/* .line 16 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Ignoring pointerId="; // const-string v1, "Ignoring pointerId="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " because ACTION_DOWN was not received "; // const-string p1, " because ACTION_DOWN was not received "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "for this pointer before ACTION_MOVE.It likely happened because "; // const-string p1, "for this pointer before ACTION_MOVE.It likely happened because "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " ViewDragHelper did not receive all the events in the event stream."; // const-string p1, " ViewDragHelper did not receive all the events in the event stream."
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "ViewDragHelper"; // const-string v0, "ViewDragHelper"
android.util.Log .e ( v0,p1 );
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean d ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/j/b/c;->t:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.l;
/* iget v1, p0, Lc/j/b/c;->c:I */
/* .line 3 */
v0 = (( android.view.VelocityTracker ) v0 ).getXVelocity ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F
/* float-to-int v0, v0 */
v1 = this.l;
/* iget v2, p0, Lc/j/b/c;->c:I */
/* .line 4 */
v1 = (( android.view.VelocityTracker ) v1 ).getYVelocity ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F
/* float-to-int v1, v1 */
/* .line 5 */
p1 = (( c.j.b.c ) p0 ).b ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Lc/j/b/c;->b(IIII)Z
/* .line 6 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"; // const-string p2, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void e ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.u;
v1 = this.v;
(( android.view.ViewGroup ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 2 */
/* iget v0, p0, Lc/j/b/c;->a:I */
/* if-eq v0, p1, :cond_0 */
/* .line 3 */
/* iput p1, p0, Lc/j/b/c;->a:I */
/* .line 4 */
v0 = this.r;
(( c.j.b.c$a ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/j/b/c$a;->c(I)V
/* .line 5 */
/* iget p1, p0, Lc/j/b/c;->a:I */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
this.s = p1;
} // :cond_0
return;
} // .end method
