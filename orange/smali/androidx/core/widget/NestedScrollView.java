public class androidx.core.widget.NestedScrollView extends android.widget.FrameLayout implements c.h.n.u implements c.h.n.q {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/core/widget/NestedScrollView$a;, */
	 /* Landroidx/core/widget/NestedScrollView$c;, */
	 /* Landroidx/core/widget/NestedScrollView$b; */
	 /* } */
} // .end annotation
/* # static fields */
public static final androidx.core.widget.NestedScrollView$a B;
public static final C;
/* # instance fields */
public androidx.core.widget.NestedScrollView$b A;
public Long b;
public final android.graphics.Rect c;
public android.widget.OverScroller d;
public android.widget.EdgeEffect e;
public android.widget.EdgeEffect f;
public Integer g;
public Boolean h;
public Boolean i;
public android.view.View j;
public Boolean k;
public android.view.VelocityTracker l;
public Boolean m;
public Boolean n;
public Integer o;
public Integer p;
public Integer q;
public Integer r;
public final s;
public final t;
public Integer u;
public Integer v;
public androidx.core.widget.NestedScrollView$c w;
public final c.h.n.w x;
public final c.h.n.s y;
public Float z;
/* # direct methods */
public static androidx.core.widget.NestedScrollView ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* new-instance v0, Landroidx/core/widget/NestedScrollView$a; */
	 /* invoke-direct {v0}, Landroidx/core/widget/NestedScrollView$a;-><init>()V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [I */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const v2, 0x101017a */
	 /* aput v2, v0, v1 */
	 /* .line 2 */
	 return;
} // .end method
public androidx.core.widget.NestedScrollView ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public androidx.core.widget.NestedScrollView ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 /* invoke-direct {p0, p1, p2, v0}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public androidx.core.widget.NestedScrollView ( ) {
	 /* .locals 4 */
	 /* .line 3 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* .line 4 */
	 /* new-instance v0, Landroid/graphics/Rect; */
	 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
	 this.c = v0;
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 5 */
	 /* iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->h:Z */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 6 */
	 /* iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->i:Z */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 7 */
	 this.j = v2;
	 /* .line 8 */
	 /* iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->k:Z */
	 /* .line 9 */
	 /* iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->n:Z */
	 int v2 = -1; // const/4 v2, -0x1
	 /* .line 10 */
	 /* iput v2, p0, Landroidx/core/widget/NestedScrollView;->r:I */
	 int v2 = 2; // const/4 v2, 0x2
	 /* new-array v3, v2, [I */
	 /* .line 11 */
	 this.s = v3;
	 /* new-array v2, v2, [I */
	 /* .line 12 */
	 this.t = v2;
	 /* .line 13 */
	 c.h.o.g .a ( p1,p2 );
	 this.e = v2;
	 /* .line 14 */
	 c.h.o.g .a ( p1,p2 );
	 this.f = v2;
	 /* .line 15 */
	 (( androidx.core.widget.NestedScrollView ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->e()V
	 /* .line 16 */
	 v2 = androidx.core.widget.NestedScrollView.C;
	 (( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v2, p3, v1 ); // invoke-virtual {p1, p2, v2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
	 /* .line 17 */
	 p2 = 	 (( android.content.res.TypedArray ) p1 ).getBoolean ( v1, v1 ); // invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
	 (( androidx.core.widget.NestedScrollView ) p0 ).setFillViewport ( p2 ); // invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->setFillViewport(Z)V
	 /* .line 18 */
	 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
	 /* .line 19 */
	 /* new-instance p1, Lc/h/n/w; */
	 /* invoke-direct {p1, p0}, Lc/h/n/w;-><init>(Landroid/view/ViewGroup;)V */
	 this.x = p1;
	 /* .line 20 */
	 /* new-instance p1, Lc/h/n/s; */
	 /* invoke-direct {p1, p0}, Lc/h/n/s;-><init>(Landroid/view/View;)V */
	 this.y = p1;
	 /* .line 21 */
	 (( androidx.core.widget.NestedScrollView ) p0 ).setNestedScrollingEnabled ( v0 ); // invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V
	 /* .line 22 */
	 p1 = androidx.core.widget.NestedScrollView.B;
	 c.h.n.v0 .a ( p0,p1 );
	 return;
} // .end method
public static Boolean a ( android.view.View p0, android.view.View p1 ) {
	 /* .locals 2 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* if-ne p0, p1, :cond_0 */
	 /* .line 124 */
} // :cond_0
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 125 */
/* instance-of v1, p0, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* check-cast p0, Landroid/view/View; */
	 p0 = 	 androidx.core.widget.NestedScrollView .a ( p0,p1 );
	 if ( p0 != null) { // if-eqz p0, :cond_1
	 } // :cond_1
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static Integer b ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* if-ge p1, p2, :cond_2 */
/* if-gez p0, :cond_0 */
} // :cond_0
/* add-int v0, p1, p0 */
/* if-le v0, p2, :cond_1 */
/* sub-int/2addr p2, p1 */
} // :cond_1
} // :cond_2
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
private Float getVerticalScrollFactorCompat ( ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Landroidx/core/widget/NestedScrollView;->z:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_1 */
/* .line 2 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 3 */
(( android.widget.FrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;
/* .line 4 */
(( android.content.Context ) v1 ).getTheme ( ); // invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
/* const v3, 0x101004d */
int v4 = 1; // const/4 v4, 0x1
v2 = (( android.content.res.Resources$Theme ) v2 ).resolveAttribute ( v3, v0, v4 ); // invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 5 */
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 6 */
v0 = (( android.util.TypedValue ) v0 ).getDimension ( v1 ); // invoke-virtual {v0, v1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
/* iput v0, p0, Landroidx/core/widget/NestedScrollView;->z:F */
/* .line 7 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Expected theme to define listPreferredItemHeight."; // const-string v1, "Expected theme to define listPreferredItemHeight."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 8 */
} // :cond_1
} // :goto_0
/* iget v0, p0, Landroidx/core/widget/NestedScrollView;->z:F */
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0, Float p1 ) {
/* .locals 3 */
/* .line 84 */
v0 = (( android.widget.FrameLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I
/* int-to-float v0, v0 */
/* div-float/2addr p2, v0 */
/* int-to-float p1, p1 */
/* .line 85 */
v0 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* int-to-float v0, v0 */
/* div-float/2addr p1, v0 */
/* .line 86 */
v0 = this.e;
v0 = c.h.o.g .a ( v0 );
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 87 */
v0 = this.e;
/* neg-float p1, p1 */
p1 = c.h.o.g .b ( v0,p1,p2 );
/* neg-float p1, p1 */
/* .line 88 */
p2 = this.e;
p2 = c.h.o.g .a ( p2 );
/* cmpl-float p2, p2, v1 */
/* if-nez p2, :cond_0 */
/* .line 89 */
p2 = this.e;
(( android.widget.EdgeEffect ) p2 ).onRelease ( ); // invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V
} // :cond_0
} // :goto_0
/* move v1, p1 */
/* .line 90 */
} // :cond_1
v0 = this.f;
v0 = c.h.o.g .a ( v0 );
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 91 */
v0 = this.f;
/* const/high16 v2, 0x3f800000 # 1.0f */
/* sub-float/2addr v2, p2 */
p1 = c.h.o.g .b ( v0,p1,v2 );
/* .line 92 */
p2 = this.f;
p2 = c.h.o.g .a ( p2 );
/* cmpl-float p2, p2, v1 */
/* if-nez p2, :cond_0 */
/* .line 93 */
p2 = this.f;
(( android.widget.EdgeEffect ) p2 ).onRelease ( ); // invoke-virtual {p2}, Landroid/widget/EdgeEffect;->onRelease()V
/* .line 94 */
} // :cond_2
} // :goto_1
p1 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* int-to-float p1, p1 */
/* mul-float v1, v1, p1 */
p1 = java.lang.Math .round ( v1 );
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 95 */
(( android.widget.FrameLayout ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->invalidate()V
} // :cond_3
} // .end method
public Integer a ( android.graphics.Rect p0 ) {
/* .locals 10 */
/* .line 105 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 106 */
} // :cond_0
v0 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* .line 107 */
v2 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* add-int v3, v2, v0 */
/* .line 108 */
v4 = (( android.widget.FrameLayout ) p0 ).getVerticalFadingEdgeLength ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVerticalFadingEdgeLength()I
/* .line 109 */
/* iget v5, p1, Landroid/graphics/Rect;->top:I */
/* if-lez v5, :cond_1 */
/* add-int/2addr v2, v4 */
/* .line 110 */
} // :cond_1
(( android.widget.FrameLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 111 */
(( android.view.View ) v5 ).getLayoutParams ( ); // invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v6, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 112 */
/* iget v7, p1, Landroid/graphics/Rect;->bottom:I */
v8 = (( android.view.View ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/view/View;->getHeight()I
/* iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v8, v9 */
/* iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v8, v9 */
/* if-ge v7, v8, :cond_2 */
/* sub-int v4, v3, v4 */
} // :cond_2
/* move v4, v3 */
/* .line 113 */
} // :goto_0
/* iget v7, p1, Landroid/graphics/Rect;->bottom:I */
/* if-le v7, v4, :cond_4 */
/* iget v7, p1, Landroid/graphics/Rect;->top:I */
/* if-le v7, v2, :cond_4 */
/* .line 114 */
v7 = (( android.graphics.Rect ) p1 ).height ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->height()I
/* if-le v7, v0, :cond_3 */
/* .line 115 */
/* iget p1, p1, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr p1, v2 */
/* .line 116 */
} // :cond_3
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr p1, v4 */
} // :goto_1
/* add-int/2addr p1, v1 */
/* .line 117 */
v0 = (( android.view.View ) v5 ).getBottom ( ); // invoke-virtual {v5}, Landroid/view/View;->getBottom()I
/* iget v1, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
/* sub-int/2addr v0, v3 */
/* .line 118 */
v1 = java.lang.Math .min ( p1,v0 );
/* .line 119 */
} // :cond_4
/* iget v3, p1, Landroid/graphics/Rect;->top:I */
/* if-ge v3, v2, :cond_6 */
/* iget v3, p1, Landroid/graphics/Rect;->bottom:I */
/* if-ge v3, v4, :cond_6 */
/* .line 120 */
v3 = (( android.graphics.Rect ) p1 ).height ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->height()I
/* if-le v3, v0, :cond_5 */
/* .line 121 */
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v4, p1 */
/* sub-int/2addr v1, v4 */
/* .line 122 */
} // :cond_5
/* iget p1, p1, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr v2, p1 */
/* sub-int/2addr v1, v2 */
/* .line 123 */
} // :goto_2
p1 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* neg-int p1, p1 */
v1 = java.lang.Math .max ( v1,p1 );
} // :cond_6
} // :goto_3
} // .end method
public final android.view.View a ( Boolean p0, Integer p1, Integer p2 ) {
/* .locals 12 */
int v0 = 2; // const/4 v0, 0x2
/* .line 51 */
(( android.widget.FrameLayout ) p0 ).getFocusables ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getFocusables(I)Ljava/util/ArrayList;
v1 = /* .line 52 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v4, v1, :cond_8 */
/* .line 53 */
/* check-cast v6, Landroid/view/View; */
/* .line 54 */
v7 = (( android.view.View ) v6 ).getTop ( ); // invoke-virtual {v6}, Landroid/view/View;->getTop()I
/* .line 55 */
v8 = (( android.view.View ) v6 ).getBottom ( ); // invoke-virtual {v6}, Landroid/view/View;->getBottom()I
int v9 = 1; // const/4 v9, 0x1
/* if-ge p2, v8, :cond_7 */
/* if-ge v7, p3, :cond_7 */
/* if-ge p2, v7, :cond_0 */
/* if-ge v8, p3, :cond_0 */
int v10 = 1; // const/4 v10, 0x1
} // :cond_0
int v10 = 0; // const/4 v10, 0x0
} // :goto_1
/* if-nez v3, :cond_1 */
/* move-object v3, v6 */
/* move v5, v10 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 56 */
v11 = (( android.view.View ) v3 ).getTop ( ); // invoke-virtual {v3}, Landroid/view/View;->getTop()I
/* if-lt v7, v11, :cond_3 */
} // :cond_2
/* if-nez p1, :cond_4 */
/* .line 57 */
v7 = (( android.view.View ) v3 ).getBottom ( ); // invoke-virtual {v3}, Landroid/view/View;->getBottom()I
/* if-le v8, v7, :cond_4 */
} // :cond_3
int v7 = 1; // const/4 v7, 0x1
} // :cond_4
int v7 = 0; // const/4 v7, 0x0
} // :goto_2
if ( v5 != null) { // if-eqz v5, :cond_5
if ( v10 != null) { // if-eqz v10, :cond_7
if ( v7 != null) { // if-eqz v7, :cond_7
} // :cond_5
if ( v10 != null) { // if-eqz v10, :cond_6
/* move-object v3, v6 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_6
if ( v7 != null) { // if-eqz v7, :cond_7
} // :goto_3
/* move-object v3, v6 */
} // :cond_7
} // :goto_4
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_8
} // .end method
public final void a ( ) {
/* .locals 1 */
/* .line 100 */
v0 = this.d;
(( android.widget.OverScroller ) v0 ).abortAnimation ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V
int v0 = 1; // const/4 v0, 0x1
/* .line 101 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->a(I)V
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.y;
(( c.h.n.s ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/h/n/s;->d(I)V
return;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer[] p4, Integer p5, Integer[] p6 ) {
/* .locals 8 */
/* .line 1 */
v0 = this.y;
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move-object v5, p5 */
/* move v6, p6 */
/* move-object v7, p7 */
/* invoke-virtual/range {v0 ..v7}, Lc/h/n/s;->a(IIII[II[I)V */
return;
} // .end method
public final void a ( Integer p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 8 */
/* .line 68 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-nez v0, :cond_0 */
return;
/* .line 69 */
} // :cond_0
android.view.animation.AnimationUtils .currentAnimationTimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Landroidx/core/widget/NestedScrollView;->b:J */
/* sub-long/2addr v0, v2 */
/* const-wide/16 v2, 0xfa */
/* cmp-long v4, v0, v2 */
/* if-lez v4, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 70 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 71 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 72 */
v0 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
/* iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v2 */
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
/* .line 73 */
v1 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
v2 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* sub-int/2addr v1, v2 */
v2 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr v1, v2 */
/* .line 74 */
v4 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* sub-int/2addr v0, v1 */
/* .line 75 */
v0 = java.lang.Math .max ( p1,v0 );
/* add-int/2addr p2, v4 */
/* .line 76 */
p2 = java.lang.Math .min ( p2,v0 );
p1 = java.lang.Math .max ( p1,p2 );
/* sub-int v6, p1, v4 */
/* .line 77 */
v2 = this.d;
v3 = (( android.widget.FrameLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollX()I
int v5 = 0; // const/4 v5, 0x0
/* move v7, p3 */
/* invoke-virtual/range {v2 ..v7}, Landroid/widget/OverScroller;->startScroll(IIIII)V */
/* .line 78 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p4 ); // invoke-virtual {p0, p4}, Landroidx/core/widget/NestedScrollView;->a(Z)V
/* .line 79 */
} // :cond_1
p3 = this.d;
p3 = (( android.widget.OverScroller ) p3 ).isFinished ( ); // invoke-virtual {p3}, Landroid/widget/OverScroller;->isFinished()Z
/* if-nez p3, :cond_2 */
/* .line 80 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->a()V
/* .line 81 */
} // :cond_2
(( android.widget.FrameLayout ) p0 ).scrollBy ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollBy(II)V
/* .line 82 */
} // :goto_0
android.view.animation.AnimationUtils .currentAnimationTimeMillis ( );
/* move-result-wide p1 */
/* iput-wide p1, p0, Landroidx/core/widget/NestedScrollView;->b:J */
return;
} // .end method
public void a ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 1 */
/* const/16 v0, 0xfa */
/* .line 83 */
(( androidx.core.widget.NestedScrollView ) p0 ).b ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/core/widget/NestedScrollView;->b(IIIZ)V
return;
} // .end method
public final void a ( Integer p0, Integer p1, Integer[] p2 ) {
/* .locals 10 */
/* .line 5 */
v0 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
int v1 = 0; // const/4 v1, 0x0
/* .line 6 */
(( android.widget.FrameLayout ) p0 ).scrollBy ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Landroid/widget/FrameLayout;->scrollBy(II)V
/* .line 7 */
v1 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* sub-int v4, v1, v0 */
if ( p3 != null) { // if-eqz p3, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
/* aget v1, p3, v0 */
/* add-int/2addr v1, v4 */
/* aput v1, p3, v0 */
} // :cond_0
/* sub-int v6, p1, v4 */
/* .line 9 */
v2 = this.y;
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
/* move v8, p2 */
/* move-object v9, p3 */
/* invoke-virtual/range {v2 ..v9}, Lc/h/n/s;->a(IIII[II[I)V */
return;
} // .end method
public final void a ( android.view.MotionEvent p0 ) {
/* .locals 3 */
/* .line 38 */
v0 = (( android.view.MotionEvent ) p1 ).getActionIndex ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I
/* .line 39 */
v1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 40 */
/* iget v2, p0, Landroidx/core/widget/NestedScrollView;->r:I */
/* if-ne v1, v2, :cond_1 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 41 */
} // :goto_0
v1 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v1, v1 */
/* iput v1, p0, Landroidx/core/widget/NestedScrollView;->g:I */
/* .line 42 */
p1 = (( android.view.MotionEvent ) p1 ).getPointerId ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput p1, p0, Landroidx/core/widget/NestedScrollView;->r:I */
/* .line 43 */
p1 = this.l;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 44 */
(( android.view.VelocityTracker ) p1 ).clear ( ); // invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V
} // :cond_1
return;
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 12 */
v0 = this.x;
(( c.h.n.w ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/w;->a(Landroid/view/View;I)V
/* .line 13 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->a(I)V
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 14 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p5, p6, p1 ); // invoke-virtual {p0, p5, p6, p1}, Landroidx/core/widget/NestedScrollView;->a(II[I)V
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer[] p6 ) {
/* .locals 0 */
/* .line 4 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p5, p6, p7 ); // invoke-virtual {p0, p5, p6, p7}, Landroidx/core/widget/NestedScrollView;->a(II[I)V
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer[] p3, Integer p4 ) {
/* .locals 6 */
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move v1, p2 */
/* move v2, p3 */
/* move-object v3, p4 */
/* move v5, p5 */
/* .line 15 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/core/widget/NestedScrollView;->a(II[I[II)Z */
return;
} // .end method
public void a ( android.view.View p0, android.view.View p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.x;
(( c.h.n.w ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/h/n/w;->a(Landroid/view/View;Landroid/view/View;II)V
int p1 = 2; // const/4 p1, 0x2
/* .line 11 */
(( androidx.core.widget.NestedScrollView ) p0 ).c ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Landroidx/core/widget/NestedScrollView;->c(II)Z
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 2; // const/4 p1, 0x2
/* .line 96 */
(( androidx.core.widget.NestedScrollView ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;->c(II)Z
/* .line 97 */
} // :cond_0
(( androidx.core.widget.NestedScrollView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->a(I)V
/* .line 98 */
} // :goto_0
p1 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* iput p1, p0, Landroidx/core/widget/NestedScrollView;->v:I */
/* .line 99 */
c.h.n.v0 .H ( p0 );
return;
} // .end method
public final Boolean a ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .line 31 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_0 */
/* .line 32 */
v0 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* .line 33 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 34 */
v3 = (( android.view.View ) v2 ).getTop ( ); // invoke-virtual {v2}, Landroid/view/View;->getTop()I
/* sub-int/2addr v3, v0 */
/* if-lt p2, v3, :cond_0 */
/* .line 35 */
v3 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
/* sub-int/2addr v3, v0 */
/* if-ge p2, v3, :cond_0 */
/* .line 36 */
p2 = (( android.view.View ) v2 ).getLeft ( ); // invoke-virtual {v2}, Landroid/view/View;->getLeft()I
/* if-lt p1, p2, :cond_0 */
/* .line 37 */
p2 = (( android.view.View ) v2 ).getRight ( ); // invoke-virtual {v2}, Landroid/view/View;->getRight()I
/* if-ge p1, p2, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
public final Boolean a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .line 58 */
v0 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* .line 59 */
v1 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* add-int/2addr v0, v1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* const/16 v4, 0x21 */
/* if-ne p1, v4, :cond_0 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 60 */
} // :goto_0
(( androidx.core.widget.NestedScrollView ) p0 ).a ( v4, p2, p3 ); // invoke-virtual {p0, v4, p2, p3}, Landroidx/core/widget/NestedScrollView;->a(ZII)Landroid/view/View;
/* if-nez v5, :cond_1 */
/* move-object v5, p0 */
} // :cond_1
/* if-lt p2, v1, :cond_2 */
/* if-gt p3, v0, :cond_2 */
} // :cond_2
if ( v4 != null) { // if-eqz v4, :cond_3
/* sub-int/2addr p2, v1 */
} // :cond_3
/* sub-int p2, p3, v0 */
/* .line 61 */
} // :goto_1
(( androidx.core.widget.NestedScrollView ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->c(I)V
int v2 = 1; // const/4 v2, 0x1
/* .line 62 */
} // :goto_2
(( android.widget.FrameLayout ) p0 ).findFocus ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->findFocus()Landroid/view/View;
/* if-eq v5, p2, :cond_4 */
(( android.view.View ) v5 ).requestFocus ( p1 ); // invoke-virtual {v5, p1}, Landroid/view/View;->requestFocus(I)Z
} // :cond_4
} // .end method
public Boolean a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Boolean p8 ) {
/* .locals 12 */
/* move-object v0, p0 */
/* .line 45 */
v1 = (( android.widget.FrameLayout ) p0 ).getOverScrollMode ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getOverScrollMode()I
/* .line 46 */
v2 = (( androidx.core.widget.NestedScrollView ) p0 ).computeHorizontalScrollRange ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeHorizontalScrollRange()I
v3 = (( androidx.core.widget.NestedScrollView ) p0 ).computeHorizontalScrollExtent ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeHorizontalScrollExtent()I
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* if-le v2, v3, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 47 */
} // :goto_0
v3 = (( androidx.core.widget.NestedScrollView ) p0 ).computeVerticalScrollRange ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollRange()I
v6 = (( androidx.core.widget.NestedScrollView ) p0 ).computeVerticalScrollExtent ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollExtent()I
/* if-le v3, v6, :cond_1 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_3
/* if-ne v1, v5, :cond_2 */
if ( v2 != null) { // if-eqz v2, :cond_2
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :cond_3
} // :goto_2
int v2 = 1; // const/4 v2, 0x1
} // :goto_3
if ( v1 != null) { // if-eqz v1, :cond_5
/* if-ne v1, v5, :cond_4 */
if ( v3 != null) { // if-eqz v3, :cond_4
} // :cond_4
int v1 = 0; // const/4 v1, 0x0
} // :cond_5
} // :goto_4
int v1 = 1; // const/4 v1, 0x1
} // :goto_5
/* add-int v3, p3, p1 */
/* if-nez v2, :cond_6 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_6
/* move/from16 v2, p7 */
} // :goto_6
/* add-int v6, p4, p2 */
/* if-nez v1, :cond_7 */
int v1 = 0; // const/4 v1, 0x0
} // :cond_7
/* move/from16 v1, p8 */
} // :goto_7
/* neg-int v7, v2 */
/* add-int v2, v2, p5 */
/* neg-int v8, v1 */
/* add-int v1, v1, p6 */
/* if-le v3, v2, :cond_8 */
/* move v3, v2 */
} // :goto_8
int v2 = 1; // const/4 v2, 0x1
} // :cond_8
/* if-ge v3, v7, :cond_9 */
/* move v3, v7 */
} // :cond_9
int v2 = 0; // const/4 v2, 0x0
} // :goto_9
/* if-le v6, v1, :cond_a */
/* move v6, v1 */
} // :goto_a
int v1 = 1; // const/4 v1, 0x1
} // :cond_a
/* if-ge v6, v8, :cond_b */
/* move v6, v8 */
} // :cond_b
int v1 = 0; // const/4 v1, 0x0
} // :goto_b
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 48 */
v7 = (( androidx.core.widget.NestedScrollView ) p0 ).g ( v5 ); // invoke-virtual {p0, v5}, Landroidx/core/widget/NestedScrollView;->g(I)Z
/* if-nez v7, :cond_c */
/* .line 49 */
v7 = this.d;
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
v11 = (( androidx.core.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I
/* move-object p1, v7 */
/* move p2, v3 */
/* move p3, v6 */
/* move/from16 p4, v8 */
/* move/from16 p5, v9 */
/* move/from16 p6, v10 */
/* move/from16 p7, v11 */
/* invoke-virtual/range {p1 ..p7}, Landroid/widget/OverScroller;->springBack(IIIIII)Z */
/* .line 50 */
} // :cond_c
(( androidx.core.widget.NestedScrollView ) p0 ).onOverScrolled ( v3, v6, v2, v1 ); // invoke-virtual {p0, v3, v6, v2, v1}, Landroidx/core/widget/NestedScrollView;->onOverScrolled(IIZZ)V
/* if-nez v2, :cond_d */
if ( v1 != null) { // if-eqz v1, :cond_e
} // :cond_d
int v4 = 1; // const/4 v4, 0x1
} // :cond_e
} // .end method
public Boolean a ( Integer p0, Integer p1, Integer[] p2, Integer[] p3, Integer p4 ) {
/* .locals 6 */
/* .line 3 */
v0 = this.y;
/* move v1, p1 */
/* move v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* move v5, p5 */
p1 = /* invoke-virtual/range {v0 ..v5}, Lc/h/n/s;->a(II[I[II)Z */
} // .end method
public final Boolean a ( android.graphics.Rect p0, Boolean p1 ) {
/* .locals 2 */
/* .line 102 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->a(Landroid/graphics/Rect;)I
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 103 */
(( android.widget.FrameLayout ) p0 ).scrollBy ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/widget/FrameLayout;->scrollBy(II)V
/* .line 104 */
} // :cond_1
(( androidx.core.widget.NestedScrollView ) p0 ).b ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroidx/core/widget/NestedScrollView;->b(II)V
} // :cond_2
} // :goto_1
} // .end method
public Boolean a ( android.view.KeyEvent p0 ) {
/* .locals 5 */
/* .line 16 */
v0 = this.c;
(( android.graphics.Rect ) v0 ).setEmpty ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V
/* .line 17 */
v0 = (( androidx.core.widget.NestedScrollView ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->b()Z
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x82 */
/* if-nez v0, :cond_2 */
/* .line 18 */
v0 = (( android.widget.FrameLayout ) p0 ).isFocused ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->isFocused()Z
if ( v0 != null) { // if-eqz v0, :cond_1
p1 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
int v0 = 4; // const/4 v0, 0x4
/* if-eq p1, v0, :cond_1 */
/* .line 19 */
(( android.widget.FrameLayout ) p0 ).findFocus ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->findFocus()Landroid/view/View;
/* if-ne p1, p0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 20 */
} // :cond_0
android.view.FocusFinder .getInstance ( );
(( android.view.FocusFinder ) v0 ).findNextFocus ( p0, p1, v2 ); // invoke-virtual {v0, p0, p1, v2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_1
/* if-eq p1, p0, :cond_1 */
/* .line 21 */
p1 = (( android.view.View ) p1 ).requestFocus ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/View;->requestFocus(I)Z
if ( p1 != null) { // if-eqz p1, :cond_1
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
/* .line 22 */
} // :cond_2
v0 = (( android.view.KeyEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
/* if-nez v0, :cond_9 */
/* .line 23 */
v0 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
/* const/16 v3, 0x13 */
/* const/16 v4, 0x21 */
/* if-eq v0, v3, :cond_7 */
/* const/16 v3, 0x14 */
/* if-eq v0, v3, :cond_5 */
/* const/16 v3, 0x3e */
/* if-eq v0, v3, :cond_3 */
/* .line 24 */
} // :cond_3
p1 = (( android.view.KeyEvent ) p1 ).isShiftPressed ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z
if ( p1 != null) { // if-eqz p1, :cond_4
/* const/16 v2, 0x21 */
} // :cond_4
(( androidx.core.widget.NestedScrollView ) p0 ).h ( v2 ); // invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->h(I)Z
/* .line 25 */
} // :cond_5
p1 = (( android.view.KeyEvent ) p1 ).isAltPressed ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z
/* if-nez p1, :cond_6 */
/* .line 26 */
v1 = (( androidx.core.widget.NestedScrollView ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->b(I)Z
/* .line 27 */
} // :cond_6
v1 = (( androidx.core.widget.NestedScrollView ) p0 ).f ( v2 ); // invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->f(I)Z
/* .line 28 */
} // :cond_7
p1 = (( android.view.KeyEvent ) p1 ).isAltPressed ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z
/* if-nez p1, :cond_8 */
/* .line 29 */
v1 = (( androidx.core.widget.NestedScrollView ) p0 ).b ( v4 ); // invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->b(I)Z
/* .line 30 */
} // :cond_8
v1 = (( androidx.core.widget.NestedScrollView ) p0 ).f ( v4 ); // invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->f(I)Z
} // :cond_9
} // :goto_0
} // .end method
public final Boolean a ( android.view.View p0 ) {
/* .locals 2 */
/* .line 63 */
v0 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
int v1 = 0; // const/4 v1, 0x0
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/View;II)Z
/* xor-int/lit8 p1, p1, 0x1 */
} // .end method
public final Boolean a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .line 64 */
v0 = this.c;
(( android.view.View ) p1 ).getDrawingRect ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V
/* .line 65 */
v0 = this.c;
(( android.widget.FrameLayout ) p0 ).offsetDescendantRectToMyCoords ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/widget/FrameLayout;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 66 */
p1 = this.c;
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr p1, p2 */
v0 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* if-lt p1, v0, :cond_0 */
p1 = this.c;
/* iget p1, p1, Landroid/graphics/Rect;->top:I */
/* sub-int/2addr p1, p2 */
/* .line 67 */
p2 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* add-int/2addr p2, p3 */
/* if-gt p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void addView ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-gtz v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V */
return;
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "ScrollView can host only one direct child"; // const-string v0, "ScrollView can host only one direct child"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void addView ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 4 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-gtz v0, :cond_0 */
/* .line 5 */
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V */
return;
/* .line 6 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "ScrollView can host only one direct child"; // const-string p2, "ScrollView can host only one direct child"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void addView ( android.view.View p0, Integer p1, android.view.ViewGroup$LayoutParams p2 ) {
/* .locals 1 */
/* .line 10 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-gtz v0, :cond_0 */
/* .line 11 */
/* invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V */
return;
/* .line 12 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "ScrollView can host only one direct child"; // const-string p2, "ScrollView can host only one direct child"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void addView ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
/* .locals 1 */
/* .line 7 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-gtz v0, :cond_0 */
/* .line 8 */
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V */
return;
/* .line 9 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "ScrollView can host only one direct child"; // const-string p2, "ScrollView can host only one direct child"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void b ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* const/16 v0, 0xfa */
int v1 = 0; // const/4 v1, 0x0
/* .line 34 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/core/widget/NestedScrollView;->a(IIIZ)V
return;
} // .end method
public void b ( Integer p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 1 */
/* .line 35 */
v0 = (( android.widget.FrameLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollX()I
/* sub-int/2addr p1, v0 */
v0 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* sub-int/2addr p2, v0 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/core/widget/NestedScrollView;->a(IIIZ)V
return;
} // .end method
public final void b ( android.view.View p0 ) {
/* .locals 1 */
/* .line 36 */
v0 = this.c;
(( android.view.View ) p1 ).getDrawingRect ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V
/* .line 37 */
v0 = this.c;
(( android.widget.FrameLayout ) p0 ).offsetDescendantRectToMyCoords ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/widget/FrameLayout;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 38 */
p1 = this.c;
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->a(Landroid/graphics/Rect;)I
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 39 */
(( android.widget.FrameLayout ) p0 ).scrollBy ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Landroid/widget/FrameLayout;->scrollBy(II)V
} // :cond_0
return;
} // .end method
public final Boolean b ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_0 */
/* .line 2 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 3 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 4 */
v0 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
/* iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v3 */
/* iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v2 */
/* .line 5 */
v2 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* sub-int/2addr v2, v3 */
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
/* if-le v0, v2, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
public Boolean b ( Integer p0 ) {
/* .locals 7 */
/* .line 10 */
(( android.widget.FrameLayout ) p0 ).findFocus ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->findFocus()Landroid/view/View;
/* if-ne v0, p0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
} // :cond_0
android.view.FocusFinder .getInstance ( );
(( android.view.FocusFinder ) v1 ).findNextFocus ( p0, v0, p1 ); // invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
/* .line 12 */
v2 = (( androidx.core.widget.NestedScrollView ) p0 ).getMaxScrollAmount ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getMaxScrollAmount()I
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 13 */
v3 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
v3 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( v1, v2, v3 ); // invoke-virtual {p0, v1, v2, v3}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/View;II)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 14 */
v2 = this.c;
(( android.view.View ) v1 ).getDrawingRect ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V
/* .line 15 */
v2 = this.c;
(( android.widget.FrameLayout ) p0 ).offsetDescendantRectToMyCoords ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/widget/FrameLayout;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 16 */
v2 = this.c;
v2 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->a(Landroid/graphics/Rect;)I
/* .line 17 */
(( androidx.core.widget.NestedScrollView ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->c(I)V
/* .line 18 */
(( android.view.View ) v1 ).requestFocus ( p1 ); // invoke-virtual {v1, p1}, Landroid/view/View;->requestFocus(I)Z
} // :cond_1
/* const/16 v1, 0x21 */
int v3 = 0; // const/4 v3, 0x0
/* const/16 v4, 0x82 */
/* if-ne p1, v1, :cond_2 */
/* .line 19 */
v1 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* if-ge v1, v2, :cond_2 */
/* .line 20 */
v2 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
} // :cond_2
/* if-ne p1, v4, :cond_3 */
/* .line 21 */
v1 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-lez v1, :cond_3 */
/* .line 22 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( v3 ); // invoke-virtual {p0, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 23 */
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 24 */
v1 = (( android.view.View ) v1 ).getBottom ( ); // invoke-virtual {v1}, Landroid/view/View;->getBottom()I
/* iget v5, v5, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v1, v5 */
/* .line 25 */
v5 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
v6 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* add-int/2addr v5, v6 */
v6 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr v5, v6 */
/* sub-int/2addr v1, v5 */
/* .line 26 */
v2 = java.lang.Math .min ( v1,v2 );
} // :cond_3
} // :goto_0
/* if-nez v2, :cond_4 */
} // :cond_4
/* if-ne p1, v4, :cond_5 */
} // :cond_5
/* neg-int v2, v2 */
/* .line 27 */
} // :goto_1
(( androidx.core.widget.NestedScrollView ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->c(I)V
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 28 */
p1 = (( android.view.View ) v0 ).isFocused ( ); // invoke-virtual {v0}, Landroid/view/View;->isFocused()Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 29 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/View;)Z
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 30 */
p1 = (( android.widget.FrameLayout ) p0 ).getDescendantFocusability ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDescendantFocusability()I
/* const/high16 v0, 0x20000 */
/* .line 31 */
(( android.widget.FrameLayout ) p0 ).setDescendantFocusability ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setDescendantFocusability(I)V
/* .line 32 */
(( android.widget.FrameLayout ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestFocus()Z
/* .line 33 */
(( android.widget.FrameLayout ) p0 ).setDescendantFocusability ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setDescendantFocusability(I)V
} // :cond_6
int p1 = 1; // const/4 p1, 0x1
} // .end method
public final Boolean b ( android.view.MotionEvent p0 ) {
/* .locals 5 */
/* .line 6 */
v0 = this.e;
v0 = c.h.o.g .a ( v0 );
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* cmpl-float v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 7 */
v0 = this.e;
v3 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
v4 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
c.h.o.g .b ( v0,v2,v3 );
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
} // :goto_0
v3 = this.f;
v3 = c.h.o.g .a ( v3 );
/* cmpl-float v3, v3, v2 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 9 */
v0 = this.f;
/* const/high16 v3, 0x3f800000 # 1.0f */
p1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
v4 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* int-to-float v4, v4 */
/* div-float/2addr p1, v4 */
/* sub-float/2addr v3, p1 */
c.h.o.g .b ( v0,v2,v3 );
} // :cond_1
/* move v1, v0 */
} // :goto_1
} // .end method
public Boolean b ( android.view.View p0, android.view.View p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* and-int/lit8 p1, p3, 0x2 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final void c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->k:Z */
/* .line 6 */
(( androidx.core.widget.NestedScrollView ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->g()V
/* .line 7 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->a(I)V
/* .line 8 */
v0 = this.e;
(( android.widget.EdgeEffect ) v0 ).onRelease ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
/* .line 9 */
v0 = this.f;
(( android.widget.EdgeEffect ) v0 ).onRelease ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
return;
} // .end method
public final void c ( Integer p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 2 */
/* iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->n:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( androidx.core.widget.NestedScrollView ) p0 ).b ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Landroidx/core/widget/NestedScrollView;->b(II)V
/* .line 4 */
} // :cond_0
(( android.widget.FrameLayout ) p0 ).scrollBy ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Landroid/widget/FrameLayout;->scrollBy(II)V
} // :cond_1
} // :goto_0
return;
} // .end method
public Boolean c ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
p1 = (( c.h.n.s ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/s;->a(II)Z
} // .end method
public Integer computeHorizontalScrollExtent ( ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollExtent()I */
} // .end method
public Integer computeHorizontalScrollOffset ( ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollOffset()I */
} // .end method
public Integer computeHorizontalScrollRange ( ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollRange()I */
} // .end method
public void computeScroll ( ) {
/* .locals 16 */
/* move-object/from16 v10, p0 */
/* .line 1 */
v0 = this.d;
v0 = (( android.widget.OverScroller ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
v0 = this.d;
(( android.widget.OverScroller ) v0 ).computeScrollOffset ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z
/* .line 3 */
v0 = this.d;
v0 = (( android.widget.OverScroller ) v0 ).getCurrY ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I
/* .line 4 */
/* iget v1, v10, Landroidx/core/widget/NestedScrollView;->v:I */
/* sub-int v6, v0, v1 */
/* .line 5 */
/* iput v0, v10, Landroidx/core/widget/NestedScrollView;->v:I */
/* .line 6 */
v3 = this.t;
int v11 = 0; // const/4 v11, 0x0
int v12 = 1; // const/4 v12, 0x1
/* aput v11, v3, v12 */
int v1 = 0; // const/4 v1, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 1; // const/4 v5, 0x1
/* move-object/from16 v0, p0 */
/* move v2, v6 */
/* .line 7 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/core/widget/NestedScrollView;->a(II[I[II)Z */
/* .line 8 */
v0 = this.t;
/* aget v0, v0, v12 */
/* sub-int v13, v6, v0 */
/* .line 9 */
v14 = /* invoke-virtual/range {p0 ..p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I */
if ( v13 != null) { // if-eqz v13, :cond_1
/* .line 10 */
v15 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollY()I */
int v1 = 0; // const/4 v1, 0x0
/* .line 11 */
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollX()I */
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
/* move-object/from16 v0, p0 */
/* move v2, v13 */
/* move v4, v15 */
/* move v6, v14 */
/* invoke-virtual/range {v0 ..v9}, Landroidx/core/widget/NestedScrollView;->a(IIIIIIIIZ)Z */
/* .line 12 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollY()I */
/* sub-int v2, v0, v15 */
/* sub-int/2addr v13, v2 */
/* .line 13 */
v7 = this.t;
/* aput v11, v7, v12 */
int v3 = 0; // const/4 v3, 0x0
/* .line 14 */
v5 = this.s;
int v6 = 1; // const/4 v6, 0x1
/* move-object/from16 v0, p0 */
/* move v4, v13 */
/* invoke-virtual/range {v0 ..v7}, Landroidx/core/widget/NestedScrollView;->a(IIII[II[I)V */
/* .line 15 */
v0 = this.t;
/* aget v0, v0, v12 */
/* sub-int/2addr v13, v0 */
} // :cond_1
if ( v13 != null) { // if-eqz v13, :cond_6
/* .line 16 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getOverScrollMode()I */
if ( v0 != null) { // if-eqz v0, :cond_2
/* if-ne v0, v12, :cond_3 */
/* if-lez v14, :cond_3 */
} // :cond_2
int v11 = 1; // const/4 v11, 0x1
} // :cond_3
if ( v11 != null) { // if-eqz v11, :cond_5
/* if-gez v13, :cond_4 */
/* .line 17 */
v0 = this.e;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 18 */
v0 = this.e;
v1 = this.d;
v1 = (( android.widget.OverScroller ) v1 ).getCurrVelocity ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F
/* float-to-int v1, v1 */
(( android.widget.EdgeEffect ) v0 ).onAbsorb ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V
/* .line 19 */
} // :cond_4
v0 = this.f;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 20 */
v0 = this.f;
v1 = this.d;
v1 = (( android.widget.OverScroller ) v1 ).getCurrVelocity ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F
/* float-to-int v1, v1 */
(( android.widget.EdgeEffect ) v0 ).onAbsorb ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V
/* .line 21 */
} // :cond_5
} // :goto_0
/* invoke-virtual/range {p0 ..p0}, Landroidx/core/widget/NestedScrollView;->a()V */
/* .line 22 */
} // :cond_6
v0 = this.d;
v0 = (( android.widget.OverScroller ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z
/* if-nez v0, :cond_7 */
/* .line 23 */
/* invoke-static/range {p0 ..p0}, Lc/h/n/v0;->H(Landroid/view/View;)V */
/* .line 24 */
} // :cond_7
(( androidx.core.widget.NestedScrollView ) v10 ).a ( v12 ); // invoke-virtual {v10, v12}, Landroidx/core/widget/NestedScrollView;->a(I)V
} // :goto_1
return;
} // .end method
public Integer computeVerticalScrollExtent ( ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollExtent()I */
} // .end method
public Integer computeVerticalScrollOffset ( ) {
/* .locals 2 */
/* .line 1 */
v0 = /* invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollOffset()I */
int v1 = 0; // const/4 v1, 0x0
v0 = java.lang.Math .max ( v1,v0 );
} // .end method
public Integer computeVerticalScrollRange ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* .line 2 */
v1 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
v2 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr v1, v2 */
v2 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* sub-int/2addr v1, v2 */
/* if-nez v0, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 4 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 5 */
v2 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
/* iget v3, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v2, v3 */
/* .line 6 */
v3 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* sub-int v1, v2, v1 */
/* .line 7 */
v0 = java.lang.Math .max ( v0,v1 );
/* if-gez v3, :cond_1 */
/* sub-int/2addr v2, v3 */
} // :cond_1
/* if-le v3, v0, :cond_2 */
/* sub-int/2addr v3, v0 */
/* add-int/2addr v2, v3 */
} // :cond_2
} // :goto_0
} // .end method
public final void d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
/* if-nez v0, :cond_0 */
/* .line 2 */
android.view.VelocityTracker .obtain ( );
this.l = v0;
/* .line 3 */
} // :cond_0
(( android.view.VelocityTracker ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
} // :goto_0
return;
} // .end method
public final Boolean d ( Integer p0 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.e;
v0 = c.h.o.g .a ( v0 );
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
v0 = this.e;
(( android.widget.EdgeEffect ) v0 ).onAbsorb ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V
/* .line 6 */
} // :cond_0
v0 = this.f;
v0 = c.h.o.g .a ( v0 );
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
v0 = this.f;
/* neg-int p1, p1 */
(( android.widget.EdgeEffect ) v0 ).onAbsorb ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
} // .end method
public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
/* if-nez v0, :cond_1 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/KeyEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean dispatchNestedFling ( Float p0, Float p1, Boolean p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
p1 = (( c.h.n.s ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/h/n/s;->a(FFZ)Z
} // .end method
public Boolean dispatchNestedPreFling ( Float p0, Float p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
p1 = (( c.h.n.s ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/s;->a(FF)Z
} // .end method
public Boolean dispatchNestedPreScroll ( Integer p0, Integer p1, Integer[] p2, Integer[] p3 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* .line 1 */
p1 = /* invoke-virtual/range {v0 ..v5}, Landroidx/core/widget/NestedScrollView;->a(II[I[II)Z */
} // .end method
public Boolean dispatchNestedScroll ( Integer p0, Integer p1, Integer p2, Integer p3, Integer[] p4 ) {
/* .locals 6 */
/* .line 1 */
v0 = this.y;
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v4, p4 */
/* move-object v5, p5 */
p1 = /* invoke-virtual/range {v0 ..v5}, Lc/h/n/s;->a(IIII[I)Z */
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 10 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V */
/* .line 2 */
v0 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* .line 3 */
v1 = this.e;
v1 = (( android.widget.EdgeEffect ) v1 ).isFinished ( ); // invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x15 */
/* if-nez v1, :cond_4 */
/* .line 4 */
v1 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 5 */
v4 = (( android.widget.FrameLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I
/* .line 6 */
v5 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* .line 7 */
v6 = java.lang.Math .min ( v2,v0 );
/* .line 8 */
/* if-lt v7, v3, :cond_1 */
v7 = (( android.widget.FrameLayout ) p0 ).getClipToPadding ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getClipToPadding()Z
if ( v7 != null) { // if-eqz v7, :cond_0
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
/* .line 9 */
} // :cond_1
} // :goto_0
v7 = (( android.widget.FrameLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingLeft()I
v8 = (( android.widget.FrameLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingRight()I
/* add-int/2addr v7, v8 */
/* sub-int/2addr v4, v7 */
/* .line 10 */
v7 = (( android.widget.FrameLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingLeft()I
/* add-int/2addr v7, v2 */
/* .line 11 */
} // :goto_1
/* if-lt v8, v3, :cond_2 */
v8 = (( android.widget.FrameLayout ) p0 ).getClipToPadding ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getClipToPadding()Z
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 12 */
v8 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
v9 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* add-int/2addr v8, v9 */
/* sub-int/2addr v5, v8 */
/* .line 13 */
v8 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* add-int/2addr v6, v8 */
} // :cond_2
/* int-to-float v7, v7 */
/* int-to-float v6, v6 */
/* .line 14 */
(( android.graphics.Canvas ) p1 ).translate ( v7, v6 ); // invoke-virtual {p1, v7, v6}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 15 */
v6 = this.e;
(( android.widget.EdgeEffect ) v6 ).setSize ( v4, v5 ); // invoke-virtual {v6, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V
/* .line 16 */
v4 = this.e;
v4 = (( android.widget.EdgeEffect ) v4 ).draw ( p1 ); // invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 17 */
c.h.n.v0 .H ( p0 );
/* .line 18 */
} // :cond_3
(( android.graphics.Canvas ) p1 ).restoreToCount ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
/* .line 19 */
} // :cond_4
v1 = this.f;
v1 = (( android.widget.EdgeEffect ) v1 ).isFinished ( ); // invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v1, :cond_9 */
/* .line 20 */
v1 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 21 */
v4 = (( android.widget.FrameLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I
/* .line 22 */
v5 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* .line 23 */
v6 = (( androidx.core.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I
v0 = java.lang.Math .max ( v6,v0 );
/* add-int/2addr v0, v5 */
/* .line 24 */
/* if-lt v6, v3, :cond_5 */
v6 = (( android.widget.FrameLayout ) p0 ).getClipToPadding ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getClipToPadding()Z
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 25 */
} // :cond_5
v6 = (( android.widget.FrameLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingLeft()I
v7 = (( android.widget.FrameLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingRight()I
/* add-int/2addr v6, v7 */
/* sub-int/2addr v4, v6 */
/* .line 26 */
v6 = (( android.widget.FrameLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingLeft()I
/* add-int/2addr v2, v6 */
/* .line 27 */
} // :cond_6
/* if-lt v6, v3, :cond_7 */
v3 = (( android.widget.FrameLayout ) p0 ).getClipToPadding ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getClipToPadding()Z
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 28 */
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
v6 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* add-int/2addr v3, v6 */
/* sub-int/2addr v5, v3 */
/* .line 29 */
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr v0, v3 */
} // :cond_7
/* sub-int/2addr v2, v4 */
/* int-to-float v2, v2 */
/* int-to-float v0, v0 */
/* .line 30 */
(( android.graphics.Canvas ) p1 ).translate ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V
/* const/high16 v0, 0x43340000 # 180.0f */
/* int-to-float v2, v4 */
int v3 = 0; // const/4 v3, 0x0
/* .line 31 */
(( android.graphics.Canvas ) p1 ).rotate ( v0, v2, v3 ); // invoke-virtual {p1, v0, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V
/* .line 32 */
v0 = this.f;
(( android.widget.EdgeEffect ) v0 ).setSize ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V
/* .line 33 */
v0 = this.f;
v0 = (( android.widget.EdgeEffect ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 34 */
c.h.n.v0 .H ( p0 );
/* .line 35 */
} // :cond_8
(( android.graphics.Canvas ) p1 ).restoreToCount ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
} // :cond_9
return;
} // .end method
public final void e ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Landroid/widget/OverScroller; */
(( android.widget.FrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V */
this.d = v0;
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
(( android.widget.FrameLayout ) p0 ).setFocusable ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setFocusable(Z)V
/* const/high16 v0, 0x40000 */
/* .line 3 */
(( android.widget.FrameLayout ) p0 ).setDescendantFocusability ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setDescendantFocusability(I)V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
(( android.widget.FrameLayout ) p0 ).setWillNotDraw ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setWillNotDraw(Z)V
/* .line 5 */
(( android.widget.FrameLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;
android.view.ViewConfiguration .get ( v0 );
/* .line 6 */
v1 = (( android.view.ViewConfiguration ) v0 ).getScaledTouchSlop ( ); // invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
/* iput v1, p0, Landroidx/core/widget/NestedScrollView;->o:I */
/* .line 7 */
v1 = (( android.view.ViewConfiguration ) v0 ).getScaledMinimumFlingVelocity ( ); // invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
/* iput v1, p0, Landroidx/core/widget/NestedScrollView;->p:I */
/* .line 8 */
v0 = (( android.view.ViewConfiguration ) v0 ).getScaledMaximumFlingVelocity ( ); // invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
/* iput v0, p0, Landroidx/core/widget/NestedScrollView;->q:I */
return;
} // .end method
public void e ( Integer p0 ) {
/* .locals 12 */
/* .line 9 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-lez v0, :cond_0 */
/* .line 10 */
v1 = this.d;
v2 = (( android.widget.FrameLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollX()I
v3 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
int v4 = 0; // const/4 v4, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
/* const/high16 v8, -0x80000000 */
/* const v9, 0x7fffffff */
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
/* move v5, p1 */
/* invoke-virtual/range {v1 ..v11}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 11 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->a(Z)V
} // :cond_0
return;
} // .end method
public final void f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
/* if-nez v0, :cond_0 */
/* .line 2 */
android.view.VelocityTracker .obtain ( );
this.l = v0;
} // :cond_0
return;
} // .end method
public Boolean f ( Integer p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x82 */
/* if-ne p1, v2, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
} // :goto_0
v3 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* .line 4 */
v4 = this.c;
/* iput v1, v4, Landroid/graphics/Rect;->top:I */
/* .line 5 */
/* iput v3, v4, Landroid/graphics/Rect;->bottom:I */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 6 */
v1 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-lez v1, :cond_1 */
/* sub-int/2addr v1, v0 */
/* .line 7 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 8 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 9 */
v2 = this.c;
v0 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
v1 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* add-int/2addr v0, v1 */
/* iput v0, v2, Landroid/graphics/Rect;->bottom:I */
/* .line 10 */
v0 = this.c;
/* iget v1, v0, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr v1, v3 */
/* iput v1, v0, Landroid/graphics/Rect;->top:I */
/* .line 11 */
} // :cond_1
v0 = this.c;
/* iget v1, v0, Landroid/graphics/Rect;->top:I */
/* iget v0, v0, Landroid/graphics/Rect;->bottom:I */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Landroidx/core/widget/NestedScrollView;->a(III)Z
} // .end method
public final void g ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.view.VelocityTracker ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.l = v0;
} // :cond_0
return;
} // .end method
public Boolean g ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
p1 = (( c.h.n.s ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/h/n/s;->b(I)Z
} // .end method
public Float getBottomFadingEdgeStrength ( ) {
/* .locals 5 */
/* .line 1 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 3 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 4 */
v2 = (( android.widget.FrameLayout ) p0 ).getVerticalFadingEdgeLength ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVerticalFadingEdgeLength()I
/* .line 5 */
v3 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
v4 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr v3, v4 */
/* .line 6 */
v0 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
v1 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* sub-int/2addr v0, v1 */
/* sub-int/2addr v0, v3 */
/* if-ge v0, v2, :cond_1 */
/* int-to-float v0, v0 */
/* int-to-float v1, v2 */
/* div-float/2addr v0, v1 */
} // :cond_1
/* const/high16 v0, 0x3f800000 # 1.0f */
} // .end method
public Integer getMaxScrollAmount ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
/* int-to-float v0, v0 */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* mul-float v0, v0, v1 */
/* float-to-int v0, v0 */
} // .end method
public Integer getNestedScrollAxes ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.x;
v0 = (( c.h.n.w ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/n/w;->a()I
} // .end method
public Integer getScrollRange ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_0 */
/* .line 2 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 3 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 4 */
v0 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
/* iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v3 */
/* iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v2 */
/* .line 5 */
v2 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* sub-int/2addr v2, v3 */
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
/* sub-int/2addr v0, v2 */
/* .line 6 */
v1 = java.lang.Math .max ( v1,v0 );
} // :cond_0
} // .end method
public Float getTopFadingEdgeStrength ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = (( android.widget.FrameLayout ) p0 ).getVerticalFadingEdgeLength ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getVerticalFadingEdgeLength()I
/* .line 3 */
v1 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* if-ge v1, v0, :cond_1 */
/* int-to-float v1, v1 */
/* int-to-float v0, v0 */
/* div-float/2addr v1, v0 */
} // :cond_1
/* const/high16 v0, 0x3f800000 # 1.0f */
} // .end method
public Boolean h ( Integer p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* const/16 v2, 0x82 */
/* if-ne p1, v2, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 1 */
} // :goto_0
v3 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 2 */
v1 = this.c;
v2 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* add-int/2addr v2, v3 */
/* iput v2, v1, Landroid/graphics/Rect;->top:I */
/* .line 3 */
v1 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-lez v1, :cond_2 */
/* sub-int/2addr v1, v0 */
/* .line 4 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 5 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 6 */
v0 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
v1 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* add-int/2addr v0, v1 */
/* .line 7 */
v1 = this.c;
/* iget v2, v1, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v2, v3 */
/* if-le v2, v0, :cond_2 */
/* sub-int/2addr v0, v3 */
/* .line 8 */
/* iput v0, v1, Landroid/graphics/Rect;->top:I */
/* .line 9 */
} // :cond_1
v0 = this.c;
v2 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* sub-int/2addr v2, v3 */
/* iput v2, v0, Landroid/graphics/Rect;->top:I */
/* .line 10 */
v0 = this.c;
/* iget v2, v0, Landroid/graphics/Rect;->top:I */
/* if-gez v2, :cond_2 */
/* .line 11 */
/* iput v1, v0, Landroid/graphics/Rect;->top:I */
/* .line 12 */
} // :cond_2
} // :goto_1
v0 = this.c;
/* iget v1, v0, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v3, v1 */
/* iput v3, v0, Landroid/graphics/Rect;->bottom:I */
/* .line 13 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( p1, v1, v3 ); // invoke-virtual {p0, p1, v1, v3}, Landroidx/core/widget/NestedScrollView;->a(III)Z
} // .end method
public Boolean hasNestedScrollingParent ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
v0 = (( androidx.core.widget.NestedScrollView ) p0 ).g ( v0 ); // invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->g(I)Z
} // .end method
public Boolean isNestedScrollingEnabled ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
v0 = (( c.h.n.s ) v0 ).c ( ); // invoke-virtual {v0}, Lc/h/n/s;->c()Z
} // .end method
public void measureChild ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .line 1 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 2 */
v0 = (( android.widget.FrameLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingLeft()I
/* .line 3 */
v1 = (( android.widget.FrameLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingRight()I
/* add-int/2addr v0, v1 */
/* iget p3, p3, Landroid/view/ViewGroup$LayoutParams;->width:I */
/* .line 4 */
p2 = android.widget.FrameLayout .getChildMeasureSpec ( p2,v0,p3 );
int p3 = 0; // const/4 p3, 0x0
/* .line 5 */
p3 = android.view.View$MeasureSpec .makeMeasureSpec ( p3,p3 );
/* .line 6 */
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
return;
} // .end method
public void measureChildWithMargins ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p4, Landroid/view/ViewGroup$MarginLayoutParams; */
/* .line 2 */
p5 = (( android.widget.FrameLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingLeft()I
v0 = (( android.widget.FrameLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingRight()I
/* add-int/2addr p5, v0 */
/* iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr p5, v0 */
/* iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr p5, v0 */
/* add-int/2addr p5, p3 */
/* iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 3 */
p2 = android.widget.FrameLayout .getChildMeasureSpec ( p2,p5,p3 );
/* .line 4 */
/* iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* iget p4, p4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr p3, p4 */
int p4 = 0; // const/4 p4, 0x0
p3 = android.view.View$MeasureSpec .makeMeasureSpec ( p3,p4 );
/* .line 5 */
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
return;
} // .end method
public void onAttachedToWindow ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->i:Z */
return;
} // .end method
public Boolean onGenericMotionEvent ( android.view.MotionEvent p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( android.view.MotionEvent ) p1 ).getSource ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I
/* and-int/lit8 v0, v0, 0x2 */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 2 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* const/16 v2, 0x8 */
/* if-eq v0, v2, :cond_0 */
/* .line 3 */
} // :cond_0
/* iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->k:Z */
/* if-nez v0, :cond_3 */
/* const/16 v0, 0x9 */
/* .line 4 */
p1 = (( android.view.MotionEvent ) p1 ).getAxisValue ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p1, v0 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 5 */
v0 = /* invoke-direct {p0}, Landroidx/core/widget/NestedScrollView;->getVerticalScrollFactorCompat()F */
/* mul-float p1, p1, v0 */
/* float-to-int p1, p1 */
/* .line 6 */
v0 = (( androidx.core.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I
/* .line 7 */
v2 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* sub-int p1, v2, p1 */
/* if-gez p1, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
/* if-le p1, v0, :cond_2 */
} // :cond_2
/* move v0, p1 */
} // :goto_0
/* if-eq v0, v2, :cond_3 */
/* .line 8 */
p1 = (( android.widget.FrameLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollX()I
/* invoke-super {p0, p1, v0}, Landroid/widget/FrameLayout;->scrollTo(II)V */
int p1 = 1; // const/4 p1, 0x1
} // :cond_3
} // :goto_1
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 11 */
/* .line 1 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
int v1 = 2; // const/4 v1, 0x2
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
/* iget-boolean v3, p0, Landroidx/core/widget/NestedScrollView;->k:Z */
if ( v3 != null) { // if-eqz v3, :cond_0
} // :cond_0
/* and-int/lit16 v0, v0, 0xff */
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_7
int v4 = -1; // const/4 v4, -0x1
/* if-eq v0, v2, :cond_5 */
/* if-eq v0, v1, :cond_2 */
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_5 */
int v1 = 6; // const/4 v1, 0x6
/* if-eq v0, v1, :cond_1 */
/* goto/16 :goto_2 */
/* .line 3 */
} // :cond_1
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/MotionEvent;)V
/* goto/16 :goto_2 */
/* .line 4 */
} // :cond_2
/* iget v0, p0, Landroidx/core/widget/NestedScrollView;->r:I */
/* if-ne v0, v4, :cond_3 */
/* goto/16 :goto_2 */
/* .line 5 */
} // :cond_3
v5 = (( android.view.MotionEvent ) p1 ).findPointerIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-ne v5, v4, :cond_4 */
/* .line 6 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Invalid pointerId="; // const-string v1, "Invalid pointerId="
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v0 = " in onInterceptTouchEvent"; // const-string v0, " in onInterceptTouchEvent"
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "NestedScrollView"; // const-string v0, "NestedScrollView"
android.util.Log .e ( v0,p1 );
/* goto/16 :goto_2 */
/* .line 7 */
} // :cond_4
v0 = (( android.view.MotionEvent ) p1 ).getY ( v5 ); // invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v0, v0 */
/* .line 8 */
/* iget v4, p0, Landroidx/core/widget/NestedScrollView;->g:I */
/* sub-int v4, v0, v4 */
v4 = java.lang.Math .abs ( v4 );
/* .line 9 */
/* iget v5, p0, Landroidx/core/widget/NestedScrollView;->o:I */
/* if-le v4, v5, :cond_d */
/* .line 10 */
v4 = (( androidx.core.widget.NestedScrollView ) p0 ).getNestedScrollAxes ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getNestedScrollAxes()I
/* and-int/2addr v1, v4 */
/* if-nez v1, :cond_d */
/* .line 11 */
/* iput-boolean v2, p0, Landroidx/core/widget/NestedScrollView;->k:Z */
/* .line 12 */
/* iput v0, p0, Landroidx/core/widget/NestedScrollView;->g:I */
/* .line 13 */
(( androidx.core.widget.NestedScrollView ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->f()V
/* .line 14 */
v0 = this.l;
(( android.view.VelocityTracker ) v0 ).addMovement ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
/* .line 15 */
/* iput v3, p0, Landroidx/core/widget/NestedScrollView;->u:I */
/* .line 16 */
(( android.widget.FrameLayout ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;
if ( p1 != null) { // if-eqz p1, :cond_d
/* .line 17 */
/* goto/16 :goto_2 */
/* .line 18 */
} // :cond_5
/* iput-boolean v3, p0, Landroidx/core/widget/NestedScrollView;->k:Z */
/* .line 19 */
/* iput v4, p0, Landroidx/core/widget/NestedScrollView;->r:I */
/* .line 20 */
(( androidx.core.widget.NestedScrollView ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->g()V
/* .line 21 */
v4 = this.d;
v5 = (( android.widget.FrameLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollX()I
v6 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
v10 = (( androidx.core.widget.NestedScrollView ) p0 ).getScrollRange ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I
p1 = /* invoke-virtual/range {v4 ..v10}, Landroid/widget/OverScroller;->springBack(IIIIII)Z */
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 22 */
c.h.n.v0 .H ( p0 );
/* .line 23 */
} // :cond_6
(( androidx.core.widget.NestedScrollView ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Landroidx/core/widget/NestedScrollView;->a(I)V
/* .line 24 */
} // :cond_7
v0 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v0, v0 */
/* .line 25 */
v4 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v4, v4 */
v4 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( v4, v0 ); // invoke-virtual {p0, v4, v0}, Landroidx/core/widget/NestedScrollView;->a(II)Z
/* if-nez v4, :cond_a */
/* .line 26 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->b(Landroid/view/MotionEvent;)Z
/* if-nez p1, :cond_9 */
p1 = this.d;
p1 = (( android.widget.OverScroller ) p1 ).isFinished ( ); // invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z
/* if-nez p1, :cond_8 */
} // :cond_8
int v2 = 0; // const/4 v2, 0x0
} // :cond_9
} // :goto_0
/* iput-boolean v2, p0, Landroidx/core/widget/NestedScrollView;->k:Z */
/* .line 27 */
(( androidx.core.widget.NestedScrollView ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->g()V
/* .line 28 */
} // :cond_a
/* iput v0, p0, Landroidx/core/widget/NestedScrollView;->g:I */
/* .line 29 */
v0 = (( android.view.MotionEvent ) p1 ).getPointerId ( v3 ); // invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v0, p0, Landroidx/core/widget/NestedScrollView;->r:I */
/* .line 30 */
(( androidx.core.widget.NestedScrollView ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->d()V
/* .line 31 */
v0 = this.l;
(( android.view.VelocityTracker ) v0 ).addMovement ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
/* .line 32 */
v0 = this.d;
(( android.widget.OverScroller ) v0 ).computeScrollOffset ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z
/* .line 33 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->b(Landroid/view/MotionEvent;)Z
/* if-nez p1, :cond_c */
p1 = this.d;
p1 = (( android.widget.OverScroller ) p1 ).isFinished ( ); // invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z
/* if-nez p1, :cond_b */
} // :cond_b
int v2 = 0; // const/4 v2, 0x0
} // :cond_c
} // :goto_1
/* iput-boolean v2, p0, Landroidx/core/widget/NestedScrollView;->k:Z */
/* .line 34 */
(( androidx.core.widget.NestedScrollView ) p0 ).c ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Landroidx/core/widget/NestedScrollView;->c(II)Z
/* .line 35 */
} // :cond_d
} // :goto_2
/* iget-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->k:Z */
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->h:Z */
/* .line 3 */
p2 = this.j;
if ( p2 != null) { // if-eqz p2, :cond_0
p2 = androidx.core.widget.NestedScrollView .a ( p2,p0 );
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 4 */
p2 = this.j;
(( androidx.core.widget.NestedScrollView ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->b(Landroid/view/View;)V
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 5 */
this.j = p2;
/* .line 6 */
/* iget-boolean p4, p0, Landroidx/core/widget/NestedScrollView;->i:Z */
/* if-nez p4, :cond_3 */
/* .line 7 */
p4 = this.w;
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 8 */
p4 = (( android.widget.FrameLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollX()I
v0 = this.w;
/* iget v0, v0, Landroidx/core/widget/NestedScrollView$c;->b:I */
(( androidx.core.widget.NestedScrollView ) p0 ).scrollTo ( p4, v0 ); // invoke-virtual {p0, p4, v0}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V
/* .line 9 */
this.w = p2;
/* .line 10 */
} // :cond_1
p2 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-lez p2, :cond_2 */
/* .line 11 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 12 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p2, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 13 */
p1 = (( android.view.View ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
/* iget p4, p2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr p1, p4 */
/* iget p2, p2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr p1, p2 */
} // :cond_2
/* sub-int/2addr p5, p3 */
/* .line 14 */
p2 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* sub-int/2addr p5, p2 */
p2 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr p5, p2 */
/* .line 15 */
p2 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* .line 16 */
p1 = androidx.core.widget.NestedScrollView .b ( p2,p5,p1 );
/* if-eq p1, p2, :cond_3 */
/* .line 17 */
p2 = (( android.widget.FrameLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollX()I
(( androidx.core.widget.NestedScrollView ) p0 ).scrollTo ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V
/* .line 18 */
} // :cond_3
p1 = (( android.widget.FrameLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollX()I
p2 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
(( androidx.core.widget.NestedScrollView ) p0 ).scrollTo ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V
int p1 = 1; // const/4 p1, 0x1
/* .line 19 */
/* iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->i:Z */
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V */
/* .line 2 */
/* iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->m:Z */
/* if-nez v0, :cond_0 */
return;
/* .line 3 */
} // :cond_0
p2 = android.view.View$MeasureSpec .getMode ( p2 );
/* if-nez p2, :cond_1 */
return;
/* .line 4 */
} // :cond_1
p2 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-lez p2, :cond_2 */
int p2 = 0; // const/4 p2, 0x0
/* .line 5 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 6 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 7 */
v1 = (( android.view.View ) p2 ).getMeasuredHeight ( ); // invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I
/* .line 8 */
v2 = (( android.widget.FrameLayout ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I
/* .line 9 */
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* sub-int/2addr v2, v3 */
/* .line 10 */
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr v2, v3 */
/* iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* sub-int/2addr v2, v3 */
/* iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v2, v3 */
/* if-ge v1, v2, :cond_2 */
/* .line 11 */
v1 = (( android.widget.FrameLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingLeft()I
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingRight()I
/* add-int/2addr v1, v3 */
/* iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I */
/* add-int/2addr v1, v3 */
/* iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v1, v3 */
/* iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I */
/* .line 12 */
p1 = android.widget.FrameLayout .getChildMeasureSpec ( p1,v1,v0 );
/* const/high16 v0, 0x40000000 # 2.0f */
/* .line 13 */
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v2,v0 );
/* .line 14 */
(( android.view.View ) p2 ).measure ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Landroid/view/View;->measure(II)V
} // :cond_2
return;
} // .end method
public Boolean onNestedFling ( android.view.View p0, Float p1, Float p2, Boolean p3 ) {
/* .locals 0 */
/* if-nez p4, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
int p2 = 1; // const/4 p2, 0x1
/* .line 1 */
(( androidx.core.widget.NestedScrollView ) p0 ).dispatchNestedFling ( p1, p3, p2 ); // invoke-virtual {p0, p1, p3, p2}, Landroidx/core/widget/NestedScrollView;->dispatchNestedFling(FFZ)Z
/* float-to-int p1, p3 */
/* .line 2 */
(( androidx.core.widget.NestedScrollView ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->e(I)V
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean onNestedPreFling ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).dispatchNestedPreFling ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroidx/core/widget/NestedScrollView;->dispatchNestedPreFling(FF)Z
} // .end method
public void onNestedPreScroll ( android.view.View p0, Integer p1, Integer p2, Integer[] p3 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move-object v4, p4 */
/* .line 1 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/View;II[II)V */
return;
} // .end method
public void onNestedScroll ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
int p2 = 0; // const/4 p2, 0x0
/* .line 1 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p5, p1, p2 ); // invoke-virtual {p0, p5, p1, p2}, Landroidx/core/widget/NestedScrollView;->a(II[I)V
return;
} // .end method
public void onNestedScrollAccepted ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/View;Landroid/view/View;II)V
return;
} // .end method
public void onOverScrolled ( Integer p0, Integer p1, Boolean p2, Boolean p3 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollTo(II)V */
return;
} // .end method
public Boolean onRequestFocusInDescendants ( Integer p0, android.graphics.Rect p1 ) {
/* .locals 3 */
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_0 */
/* const/16 p1, 0x82 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_1 */
/* const/16 p1, 0x21 */
} // :cond_1
} // :goto_0
/* if-nez p2, :cond_2 */
/* .line 1 */
android.view.FocusFinder .getInstance ( );
int v1 = 0; // const/4 v1, 0x0
(( android.view.FocusFinder ) v0 ).findNextFocus ( p0, v1, p1 ); // invoke-virtual {v0, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
/* .line 2 */
} // :cond_2
android.view.FocusFinder .getInstance ( );
(( android.view.FocusFinder ) v0 ).findNextFocusFromRect ( p0, p2, p1 ); // invoke-virtual {v0, p0, p2, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;
} // :goto_1
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_3 */
/* .line 3 */
} // :cond_3
v2 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/View;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 4 */
} // :cond_4
p1 = (( android.view.View ) v0 ).requestFocus ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z
} // .end method
public void onRestoreInstanceState ( android.os.Parcelable p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Landroidx/core/widget/NestedScrollView$c; */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
return;
/* .line 3 */
} // :cond_0
/* check-cast p1, Landroidx/core/widget/NestedScrollView$c; */
/* .line 4 */
(( android.view.View$BaseSavedState ) p1 ).getSuperState ( ); // invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;
/* invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V */
/* .line 5 */
this.w = p1;
/* .line 6 */
(( androidx.core.widget.NestedScrollView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->requestLayout()V
return;
} // .end method
public android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable; */
/* .line 2 */
/* new-instance v1, Landroidx/core/widget/NestedScrollView$c; */
/* invoke-direct {v1, v0}, Landroidx/core/widget/NestedScrollView$c;-><init>(Landroid/os/Parcelable;)V */
/* .line 3 */
v0 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* iput v0, v1, Landroidx/core/widget/NestedScrollView$c;->b:I */
} // .end method
public void onScrollChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 6 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onScrollChanged(IIII)V */
/* .line 2 */
v0 = this.A;
if ( v0 != null) { // if-eqz v0, :cond_0
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* .line 3 */
/* invoke-interface/range {v0 ..v5}, Landroidx/core/widget/NestedScrollView$b;->a(Landroidx/core/widget/NestedScrollView;IIII)V */
} // :cond_0
return;
} // .end method
public void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V */
/* .line 2 */
(( android.widget.FrameLayout ) p0 ).findFocus ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->findFocus()Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_1
/* if-ne p0, p1, :cond_0 */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
/* .line 3 */
p2 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( p1, p2, p4 ); // invoke-virtual {p0, p1, p2, p4}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/View;II)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 4 */
p2 = this.c;
(( android.view.View ) p1 ).getDrawingRect ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V
/* .line 5 */
p2 = this.c;
(( android.widget.FrameLayout ) p0 ).offsetDescendantRectToMyCoords ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/widget/FrameLayout;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 6 */
p1 = this.c;
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->a(Landroid/graphics/Rect;)I
/* .line 7 */
(( androidx.core.widget.NestedScrollView ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->c(I)V
} // :cond_1
} // :goto_0
return;
} // .end method
public Boolean onStartNestedScroll ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).b ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/core/widget/NestedScrollView;->b(Landroid/view/View;Landroid/view/View;II)Z
} // .end method
public void onStopNestedScroll ( android.view.View p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/View;I)V
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 23 */
/* move-object/from16 v10, p0 */
/* move-object/from16 v11, p1 */
/* .line 1 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/core/widget/NestedScrollView;->f()V */
/* .line 2 */
v0 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getActionMasked()I */
int v12 = 0; // const/4 v12, 0x0
/* if-nez v0, :cond_0 */
/* .line 3 */
/* iput v12, v10, Landroidx/core/widget/NestedScrollView;->u:I */
/* .line 4 */
} // :cond_0
/* invoke-static/range {p1 ..p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent; */
/* .line 5 */
/* iget v1, v10, Landroidx/core/widget/NestedScrollView;->u:I */
/* int-to-float v1, v1 */
int v2 = 0; // const/4 v2, 0x0
(( android.view.MotionEvent ) v13 ).offsetLocation ( v2, v1 ); // invoke-virtual {v13, v2, v1}, Landroid/view/MotionEvent;->offsetLocation(FF)V
int v1 = 2; // const/4 v1, 0x2
int v14 = 1; // const/4 v14, 0x1
if ( v0 != null) { // if-eqz v0, :cond_15
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v14, :cond_12 */
/* if-eq v0, v1, :cond_5 */
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_3 */
int v1 = 5; // const/4 v1, 0x5
/* if-eq v0, v1, :cond_2 */
int v1 = 6; // const/4 v1, 0x6
/* if-eq v0, v1, :cond_1 */
/* goto/16 :goto_7 */
/* .line 6 */
} // :cond_1
/* invoke-virtual/range {p0 ..p1}, Landroidx/core/widget/NestedScrollView;->a(Landroid/view/MotionEvent;)V */
/* .line 7 */
/* iget v0, v10, Landroidx/core/widget/NestedScrollView;->r:I */
v0 = (( android.view.MotionEvent ) v11 ).findPointerIndex ( v0 ); // invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
v0 = (( android.view.MotionEvent ) v11 ).getY ( v0 ); // invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v0, v0 */
/* iput v0, v10, Landroidx/core/widget/NestedScrollView;->g:I */
/* goto/16 :goto_7 */
/* .line 8 */
} // :cond_2
v0 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getActionIndex()I */
/* .line 9 */
v1 = (( android.view.MotionEvent ) v11 ).getY ( v0 ); // invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v1, v1 */
/* iput v1, v10, Landroidx/core/widget/NestedScrollView;->g:I */
/* .line 10 */
v0 = (( android.view.MotionEvent ) v11 ).getPointerId ( v0 ); // invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v0, v10, Landroidx/core/widget/NestedScrollView;->r:I */
/* goto/16 :goto_7 */
/* .line 11 */
} // :cond_3
/* iget-boolean v0, v10, Landroidx/core/widget/NestedScrollView;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getChildCount()I */
/* if-lez v0, :cond_4 */
/* .line 12 */
v15 = this.d;
v16 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollX()I */
v17 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollY()I */
/* const/16 v18, 0x0 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x0 */
/* .line 13 */
v21 = /* invoke-virtual/range {p0 ..p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I */
/* .line 14 */
v0 = /* invoke-virtual/range {v15 ..v21}, Landroid/widget/OverScroller;->springBack(IIIIII)Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 15 */
/* invoke-static/range {p0 ..p0}, Lc/h/n/v0;->H(Landroid/view/View;)V */
/* .line 16 */
} // :cond_4
/* iput v3, v10, Landroidx/core/widget/NestedScrollView;->r:I */
/* .line 17 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/core/widget/NestedScrollView;->c()V */
/* goto/16 :goto_7 */
/* .line 18 */
} // :cond_5
/* iget v0, v10, Landroidx/core/widget/NestedScrollView;->r:I */
v15 = (( android.view.MotionEvent ) v11 ).findPointerIndex ( v0 ); // invoke-virtual {v11, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I
/* if-ne v15, v3, :cond_6 */
/* .line 19 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Invalid pointerId="; // const-string v1, "Invalid pointerId="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, v10, Landroidx/core/widget/NestedScrollView;->r:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " in onTouchEvent"; // const-string v1, " in onTouchEvent"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "NestedScrollView"; // const-string v1, "NestedScrollView"
android.util.Log .e ( v1,v0 );
/* goto/16 :goto_7 */
/* .line 20 */
} // :cond_6
v0 = (( android.view.MotionEvent ) v11 ).getY ( v15 ); // invoke-virtual {v11, v15}, Landroid/view/MotionEvent;->getY(I)F
/* float-to-int v6, v0 */
/* .line 21 */
/* iget v0, v10, Landroidx/core/widget/NestedScrollView;->g:I */
/* sub-int/2addr v0, v6 */
/* .line 22 */
v1 = (( android.view.MotionEvent ) v11 ).getX ( v15 ); // invoke-virtual {v11, v15}, Landroid/view/MotionEvent;->getX(I)F
v1 = (( androidx.core.widget.NestedScrollView ) v10 ).a ( v0, v1 ); // invoke-virtual {v10, v0, v1}, Landroidx/core/widget/NestedScrollView;->a(IF)I
/* sub-int/2addr v0, v1 */
/* .line 23 */
/* iget-boolean v1, v10, Landroidx/core/widget/NestedScrollView;->k:Z */
/* if-nez v1, :cond_9 */
v1 = java.lang.Math .abs ( v0 );
/* iget v2, v10, Landroidx/core/widget/NestedScrollView;->o:I */
/* if-le v1, v2, :cond_9 */
/* .line 24 */
/* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent; */
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 25 */
/* .line 26 */
} // :cond_7
/* iput-boolean v14, v10, Landroidx/core/widget/NestedScrollView;->k:Z */
/* if-lez v0, :cond_8 */
/* .line 27 */
/* iget v1, v10, Landroidx/core/widget/NestedScrollView;->o:I */
/* sub-int/2addr v0, v1 */
/* .line 28 */
} // :cond_8
/* iget v1, v10, Landroidx/core/widget/NestedScrollView;->o:I */
/* add-int/2addr v0, v1 */
} // :cond_9
} // :goto_0
/* move v7, v0 */
/* .line 29 */
/* iget-boolean v0, v10, Landroidx/core/widget/NestedScrollView;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_19
int v1 = 0; // const/4 v1, 0x0
/* .line 30 */
v3 = this.t;
v4 = this.s;
int v5 = 0; // const/4 v5, 0x0
/* move-object/from16 v0, p0 */
/* move v2, v7 */
v0 = /* invoke-virtual/range {v0 ..v5}, Landroidx/core/widget/NestedScrollView;->a(II[I[II)Z */
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 31 */
v0 = this.t;
/* aget v0, v0, v14 */
/* sub-int/2addr v7, v0 */
/* .line 32 */
/* iget v0, v10, Landroidx/core/widget/NestedScrollView;->u:I */
v1 = this.s;
/* aget v1, v1, v14 */
/* add-int/2addr v0, v1 */
/* iput v0, v10, Landroidx/core/widget/NestedScrollView;->u:I */
} // :cond_a
/* move/from16 v16, v7 */
/* .line 33 */
v0 = this.s;
/* aget v0, v0, v14 */
/* sub-int/2addr v6, v0 */
/* iput v6, v10, Landroidx/core/widget/NestedScrollView;->g:I */
/* .line 34 */
v17 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollY()I */
/* .line 35 */
v9 = /* invoke-virtual/range {p0 ..p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I */
/* .line 36 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getOverScrollMode()I */
if ( v0 != null) { // if-eqz v0, :cond_c
/* if-ne v0, v14, :cond_b */
/* if-lez v9, :cond_b */
} // :cond_b
/* const/16 v18, 0x0 */
} // :cond_c
} // :goto_1
/* const/16 v18, 0x1 */
} // :goto_2
int v1 = 0; // const/4 v1, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 37 */
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollY()I */
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* const/16 v19, 0x1 */
/* move-object/from16 v0, p0 */
/* move/from16 v2, v16 */
/* move v6, v9 */
/* move/from16 v22, v9 */
/* move/from16 v9, v19 */
v0 = /* invoke-virtual/range {v0 ..v9}, Landroidx/core/widget/NestedScrollView;->a(IIIIIIIIZ)Z */
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 38 */
v0 = (( androidx.core.widget.NestedScrollView ) v10 ).g ( v12 ); // invoke-virtual {v10, v12}, Landroidx/core/widget/NestedScrollView;->g(I)Z
/* if-nez v0, :cond_d */
int v8 = 1; // const/4 v8, 0x1
} // :cond_d
int v8 = 0; // const/4 v8, 0x0
/* .line 39 */
} // :goto_3
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollY()I */
/* sub-int v2, v0, v17 */
/* sub-int v4, v16, v2 */
/* .line 40 */
v7 = this.t;
/* aput v12, v7, v14 */
int v1 = 0; // const/4 v1, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 41 */
v5 = this.s;
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p0 */
/* invoke-virtual/range {v0 ..v7}, Landroidx/core/widget/NestedScrollView;->a(IIII[II[I)V */
/* .line 42 */
/* iget v0, v10, Landroidx/core/widget/NestedScrollView;->g:I */
v1 = this.s;
/* aget v2, v1, v14 */
/* sub-int/2addr v0, v2 */
/* iput v0, v10, Landroidx/core/widget/NestedScrollView;->g:I */
/* .line 43 */
/* iget v0, v10, Landroidx/core/widget/NestedScrollView;->u:I */
/* aget v1, v1, v14 */
/* add-int/2addr v0, v1 */
/* iput v0, v10, Landroidx/core/widget/NestedScrollView;->u:I */
if ( v18 != null) { // if-eqz v18, :cond_11
/* .line 44 */
v0 = this.t;
/* aget v0, v0, v14 */
/* sub-int v0, v16, v0 */
/* add-int v1, v17, v0 */
/* if-gez v1, :cond_e */
/* .line 45 */
v1 = this.e;
/* neg-int v0, v0 */
/* int-to-float v0, v0 */
/* .line 46 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getHeight()I */
/* int-to-float v2, v2 */
/* div-float/2addr v0, v2 */
/* .line 47 */
v2 = (( android.view.MotionEvent ) v11 ).getX ( v15 ); // invoke-virtual {v11, v15}, Landroid/view/MotionEvent;->getX(I)F
v3 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getWidth()I */
/* int-to-float v3, v3 */
/* div-float/2addr v2, v3 */
/* .line 48 */
c.h.o.g .b ( v1,v0,v2 );
/* .line 49 */
v0 = this.f;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v0, :cond_f */
/* .line 50 */
v0 = this.f;
(( android.widget.EdgeEffect ) v0 ).onRelease ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
} // :cond_e
/* move/from16 v2, v22 */
/* if-le v1, v2, :cond_f */
/* .line 51 */
v1 = this.f;
/* int-to-float v0, v0 */
/* .line 52 */
v2 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getHeight()I */
/* int-to-float v2, v2 */
/* div-float/2addr v0, v2 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* .line 53 */
v3 = (( android.view.MotionEvent ) v11 ).getX ( v15 ); // invoke-virtual {v11, v15}, Landroid/view/MotionEvent;->getX(I)F
v4 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getWidth()I */
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
/* .line 54 */
c.h.o.g .b ( v1,v0,v2 );
/* .line 55 */
v0 = this.e;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v0, :cond_f */
/* .line 56 */
v0 = this.e;
(( android.widget.EdgeEffect ) v0 ).onRelease ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V
/* .line 57 */
} // :cond_f
} // :goto_4
v0 = this.e;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
if ( v0 != null) { // if-eqz v0, :cond_10
v0 = this.f;
v0 = (( android.widget.EdgeEffect ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z
/* if-nez v0, :cond_11 */
/* .line 58 */
} // :cond_10
/* invoke-static/range {p0 ..p0}, Lc/h/n/v0;->H(Landroid/view/View;)V */
} // :cond_11
/* move v12, v8 */
} // :goto_5
if ( v12 != null) { // if-eqz v12, :cond_19
/* .line 59 */
v0 = this.l;
(( android.view.VelocityTracker ) v0 ).clear ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V
/* goto/16 :goto_7 */
/* .line 60 */
} // :cond_12
v0 = this.l;
/* const/16 v1, 0x3e8 */
/* .line 61 */
/* iget v4, v10, Landroidx/core/widget/NestedScrollView;->q:I */
/* int-to-float v4, v4 */
(( android.view.VelocityTracker ) v0 ).computeCurrentVelocity ( v1, v4 ); // invoke-virtual {v0, v1, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
/* .line 62 */
/* iget v1, v10, Landroidx/core/widget/NestedScrollView;->r:I */
v0 = (( android.view.VelocityTracker ) v0 ).getYVelocity ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getYVelocity(I)F
/* float-to-int v0, v0 */
/* .line 63 */
v1 = java.lang.Math .abs ( v0 );
/* iget v4, v10, Landroidx/core/widget/NestedScrollView;->p:I */
/* if-lt v1, v4, :cond_13 */
/* .line 64 */
v1 = (( androidx.core.widget.NestedScrollView ) v10 ).d ( v0 ); // invoke-virtual {v10, v0}, Landroidx/core/widget/NestedScrollView;->d(I)Z
/* if-nez v1, :cond_14 */
/* neg-int v0, v0 */
/* int-to-float v1, v0 */
/* .line 65 */
v4 = (( androidx.core.widget.NestedScrollView ) v10 ).dispatchNestedPreFling ( v2, v1 ); // invoke-virtual {v10, v2, v1}, Landroidx/core/widget/NestedScrollView;->dispatchNestedPreFling(FF)Z
/* if-nez v4, :cond_14 */
/* .line 66 */
(( androidx.core.widget.NestedScrollView ) v10 ).dispatchNestedFling ( v2, v1, v14 ); // invoke-virtual {v10, v2, v1, v14}, Landroidx/core/widget/NestedScrollView;->dispatchNestedFling(FFZ)Z
/* .line 67 */
(( androidx.core.widget.NestedScrollView ) v10 ).e ( v0 ); // invoke-virtual {v10, v0}, Landroidx/core/widget/NestedScrollView;->e(I)V
/* .line 68 */
} // :cond_13
v15 = this.d;
v16 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollX()I */
v17 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getScrollY()I */
/* const/16 v18, 0x0 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x0 */
/* .line 69 */
v21 = /* invoke-virtual/range {p0 ..p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I */
/* .line 70 */
v0 = /* invoke-virtual/range {v15 ..v21}, Landroid/widget/OverScroller;->springBack(IIIIII)Z */
if ( v0 != null) { // if-eqz v0, :cond_14
/* .line 71 */
/* invoke-static/range {p0 ..p0}, Lc/h/n/v0;->H(Landroid/view/View;)V */
/* .line 72 */
} // :cond_14
} // :goto_6
/* iput v3, v10, Landroidx/core/widget/NestedScrollView;->r:I */
/* .line 73 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/core/widget/NestedScrollView;->c()V */
/* .line 74 */
} // :cond_15
v0 = /* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getChildCount()I */
/* if-nez v0, :cond_16 */
/* .line 75 */
} // :cond_16
/* iget-boolean v0, v10, Landroidx/core/widget/NestedScrollView;->k:Z */
if ( v0 != null) { // if-eqz v0, :cond_17
/* .line 76 */
/* invoke-virtual/range {p0 ..p0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent; */
if ( v0 != null) { // if-eqz v0, :cond_17
/* .line 77 */
/* .line 78 */
} // :cond_17
v0 = this.d;
v0 = (( android.widget.OverScroller ) v0 ).isFinished ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z
/* if-nez v0, :cond_18 */
/* .line 79 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/core/widget/NestedScrollView;->a()V */
/* .line 80 */
} // :cond_18
v0 = /* invoke-virtual/range {p1 ..p1}, Landroid/view/MotionEvent;->getY()F */
/* float-to-int v0, v0 */
/* iput v0, v10, Landroidx/core/widget/NestedScrollView;->g:I */
/* .line 81 */
v0 = (( android.view.MotionEvent ) v11 ).getPointerId ( v12 ); // invoke-virtual {v11, v12}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v0, v10, Landroidx/core/widget/NestedScrollView;->r:I */
/* .line 82 */
(( androidx.core.widget.NestedScrollView ) v10 ).c ( v1, v12 ); // invoke-virtual {v10, v1, v12}, Landroidx/core/widget/NestedScrollView;->c(II)Z
/* .line 83 */
} // :cond_19
} // :goto_7
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_1a
/* .line 84 */
(( android.view.VelocityTracker ) v0 ).addMovement ( v13 ); // invoke-virtual {v0, v13}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
/* .line 85 */
} // :cond_1a
(( android.view.MotionEvent ) v13 ).recycle ( ); // invoke-virtual {v13}, Landroid/view/MotionEvent;->recycle()V
} // .end method
public void requestChildFocus ( android.view.View p0, android.view.View p1 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->h:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
(( androidx.core.widget.NestedScrollView ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->b(Landroid/view/View;)V
/* .line 3 */
} // :cond_0
this.j = p2;
/* .line 4 */
} // :goto_0
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V */
return;
} // .end method
public Boolean requestChildRectangleOnScreen ( android.view.View p0, android.graphics.Rect p1, Boolean p2 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
v1 = (( android.view.View ) p1 ).getScrollX ( ); // invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
/* sub-int/2addr v0, v1 */
/* .line 2 */
v1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
p1 = (( android.view.View ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
/* sub-int/2addr v1, p1 */
/* .line 3 */
(( android.graphics.Rect ) p2 ).offset ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/graphics/Rect;->offset(II)V
/* .line 4 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroidx/core/widget/NestedScrollView;->a(Landroid/graphics/Rect;Z)Z
} // .end method
public void requestDisallowInterceptTouchEvent ( Boolean p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( androidx.core.widget.NestedScrollView ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->g()V
/* .line 2 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->requestDisallowInterceptTouchEvent(Z)V */
return;
} // .end method
public void requestLayout ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->h:Z */
/* .line 2 */
/* invoke-super {p0}, Landroid/widget/FrameLayout;->requestLayout()V */
return;
} // .end method
public void scrollTo ( Integer p0, Integer p1 ) {
/* .locals 6 */
/* .line 1 */
v0 = (( android.widget.FrameLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getChildCount()I
/* if-lez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( android.widget.FrameLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;
/* .line 3 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 4 */
v2 = (( android.widget.FrameLayout ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingLeft()I
/* sub-int/2addr v2, v3 */
v3 = (( android.widget.FrameLayout ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingRight()I
/* sub-int/2addr v2, v3 */
/* .line 5 */
v3 = (( android.view.View ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getWidth()I
/* iget v4, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I */
/* add-int/2addr v3, v4 */
/* iget v4, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I */
/* add-int/2addr v3, v4 */
/* .line 6 */
v4 = (( android.widget.FrameLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I
v5 = (( android.widget.FrameLayout ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingTop()I
/* sub-int/2addr v4, v5 */
v5 = (( android.widget.FrameLayout ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getPaddingBottom()I
/* sub-int/2addr v4, v5 */
/* .line 7 */
v0 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
/* iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v0, v5 */
/* iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
/* .line 8 */
p1 = androidx.core.widget.NestedScrollView .b ( p1,v2,v3 );
/* .line 9 */
p2 = androidx.core.widget.NestedScrollView .b ( p2,v4,v0 );
/* .line 10 */
v0 = (( android.widget.FrameLayout ) p0 ).getScrollX ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollX()I
/* if-ne p1, v0, :cond_0 */
v0 = (( android.widget.FrameLayout ) p0 ).getScrollY ( ); // invoke-virtual {p0}, Landroid/widget/FrameLayout;->getScrollY()I
/* if-eq p2, v0, :cond_1 */
/* .line 11 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollTo(II)V */
} // :cond_1
return;
} // .end method
public void setFillViewport ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->m:Z */
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->m:Z */
/* .line 3 */
(( androidx.core.widget.NestedScrollView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->requestLayout()V
} // :cond_0
return;
} // .end method
public void setNestedScrollingEnabled ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
(( c.h.n.s ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/h/n/s;->a(Z)V
return;
} // .end method
public void setOnScrollChangeListener ( androidx.core.widget.NestedScrollView$b p0 ) {
/* .locals 0 */
/* .line 1 */
this.A = p1;
return;
} // .end method
public void setSmoothScrollingEnabled ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->n:Z */
return;
} // .end method
public Boolean shouldDelayChildPressedState ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean startNestedScroll ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
p1 = (( androidx.core.widget.NestedScrollView ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;->c(II)Z
} // .end method
public void stopNestedScroll ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( androidx.core.widget.NestedScrollView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->a(I)V
return;
} // .end method
