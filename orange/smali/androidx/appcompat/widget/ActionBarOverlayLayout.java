public class androidx.appcompat.widget.ActionBarOverlayLayout extends android.view.ViewGroup implements c.b.q.y0 implements c.h.n.v implements c.h.n.t implements c.h.n.u {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/appcompat/widget/ActionBarOverlayLayout$d;, */
	 /* Landroidx/appcompat/widget/ActionBarOverlayLayout$e; */
	 /* } */
} // .end annotation
/* # static fields */
public static final C;
/* # instance fields */
public final java.lang.Runnable A;
public final c.h.n.w B;
public Integer b;
public Integer c;
public androidx.appcompat.widget.ContentFrameLayout d;
public androidx.appcompat.widget.ActionBarContainer e;
public c.b.q.z0 f;
public android.graphics.drawable.Drawable g;
public Boolean h;
public Boolean i;
public Boolean j;
public Boolean k;
public Boolean l;
public Integer m;
public Integer n;
public final android.graphics.Rect o;
public final android.graphics.Rect p;
public final android.graphics.Rect q;
public final android.graphics.Rect r;
public final android.graphics.Rect s;
public final android.graphics.Rect t;
public final android.graphics.Rect u;
public androidx.appcompat.widget.ActionBarOverlayLayout$d v;
public android.widget.OverScroller w;
public android.view.ViewPropertyAnimator x;
public final android.animation.AnimatorListenerAdapter y;
public final java.lang.Runnable z;
/* # direct methods */
public static androidx.appcompat.widget.ActionBarOverlayLayout ( ) {
	 /* .locals 3 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* new-array v0, v0, [I */
	 /* .line 1 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* aput v1, v0, v2 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* const v2, 0x1010059 */
	 /* aput v2, v0, v1 */
	 return;
} // .end method
public androidx.appcompat.widget.ActionBarOverlayLayout ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
	 /* invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 return;
} // .end method
public androidx.appcompat.widget.ActionBarOverlayLayout ( ) {
	 /* .locals 0 */
	 /* .line 2 */
	 /* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 int p2 = 0; // const/4 p2, 0x0
	 /* .line 3 */
	 /* iput p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->c:I */
	 /* .line 4 */
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.o = p2;
	 /* .line 5 */
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.p = p2;
	 /* .line 6 */
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.q = p2;
	 /* .line 7 */
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.r = p2;
	 /* .line 8 */
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.s = p2;
	 /* .line 9 */
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.t = p2;
	 /* .line 10 */
	 /* new-instance p2, Landroid/graphics/Rect; */
	 /* invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V */
	 this.u = p2;
	 /* .line 11 */
	 /* new-instance p2, Landroidx/appcompat/widget/ActionBarOverlayLayout$a; */
	 /* invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$a;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V */
	 this.y = p2;
	 /* .line 12 */
	 /* new-instance p2, Landroidx/appcompat/widget/ActionBarOverlayLayout$b; */
	 /* invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$b;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V */
	 this.z = p2;
	 /* .line 13 */
	 /* new-instance p2, Landroidx/appcompat/widget/ActionBarOverlayLayout$c; */
	 /* invoke-direct {p2, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout$c;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;)V */
	 this.A = p2;
	 /* .line 14 */
	 (( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->a(Landroid/content/Context;)V
	 /* .line 15 */
	 /* new-instance p1, Lc/h/n/w; */
	 /* invoke-direct {p1, p0}, Lc/h/n/w;-><init>(Landroid/view/ViewGroup;)V */
	 this.B = p1;
	 return;
} // .end method
/* # virtual methods */
public final c.b.q.z0 a ( android.view.View p0 ) {
	 /* .locals 3 */
	 /* .line 22 */
	 /* instance-of v0, p1, Lc/b/q/z0; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 23 */
		 /* check-cast p1, Lc/b/q/z0; */
		 /* .line 24 */
	 } // :cond_0
	 /* instance-of v0, p1, Landroidx/appcompat/widget/Toolbar; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 25 */
		 /* check-cast p1, Landroidx/appcompat/widget/Toolbar; */
		 (( androidx.appcompat.widget.Toolbar ) p1 ).getWrapper ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lc/b/q/z0;
		 /* .line 26 */
	 } // :cond_1
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Can\'t make a decor toolbar out of "; // const-string v2, "Can\'t make a decor toolbar out of "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 27 */
	 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) p1 ).getSimpleName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
public void a ( Integer p0 ) {
	 /* .locals 1 */
	 /* .line 31 */
	 (( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
	 int v0 = 2; // const/4 v0, 0x2
	 /* if-eq p1, v0, :cond_2 */
	 int v0 = 5; // const/4 v0, 0x5
	 /* if-eq p1, v0, :cond_1 */
	 /* const/16 v0, 0x6d */
	 /* if-eq p1, v0, :cond_0 */
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
/* .line 32 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).setOverlayMode ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setOverlayMode(Z)V
/* .line 33 */
} // :cond_1
p1 = this.f;
/* .line 34 */
} // :cond_2
p1 = this.f;
} // :goto_0
return;
} // .end method
public final void a ( android.content.Context p0 ) {
/* .locals 4 */
/* .line 1 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getTheme ( ); // invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
v1 = androidx.appcompat.widget.ActionBarOverlayLayout.C;
(( android.content.res.Resources$Theme ) v0 ).obtainStyledAttributes ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
v2 = (( android.content.res.TypedArray ) v0 ).getDimensionPixelSize ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* iput v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->b:I */
int v2 = 1; // const/4 v2, 0x1
/* .line 3 */
(( android.content.res.TypedArray ) v0 ).getDrawable ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
this.g = v3;
/* if-nez v3, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
/* .line 4 */
} // :goto_0
(( android.view.ViewGroup ) p0 ).setWillNotDraw ( v3 ); // invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V
/* .line 5 */
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 6 */
(( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I */
/* const/16 v3, 0x13 */
/* if-ge v0, v3, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
/* iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->h:Z */
/* .line 7 */
/* new-instance v0, Landroid/widget/OverScroller; */
/* invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V */
this.w = v0;
return;
} // .end method
public void a ( android.view.Menu p0, c.b.p.o.z$a p1 ) {
/* .locals 1 */
/* .line 37 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 38 */
v0 = this.f;
return;
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
/* .locals 0 */
/* if-nez p2, :cond_0 */
/* .line 19 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).onStopNestedScroll ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStopNestedScroll(Landroid/view/View;)V
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 0 */
/* if-nez p6, :cond_0 */
/* .line 20 */
/* invoke-virtual/range {p0 ..p5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScroll(Landroid/view/View;IIII)V */
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer[] p6 ) {
/* .locals 0 */
/* .line 17 */
/* invoke-virtual/range {p0 ..p6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->a(Landroid/view/View;IIIII)V */
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer[] p3, Integer p4 ) {
/* .locals 0 */
/* if-nez p5, :cond_0 */
/* .line 21 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).onNestedPreScroll ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedPreScroll(Landroid/view/View;II[I)V
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0, android.view.View p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* if-nez p4, :cond_0 */
/* .line 18 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).onNestedScrollAccepted ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
} // :cond_0
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* .line 35 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 36 */
v0 = v0 = this.f;
} // .end method
public final Boolean a ( Float p0, Float p1 ) {
/* .locals 9 */
/* .line 28 */
v0 = this.w;
/* float-to-int v4, p2 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* const/high16 v7, -0x80000000 */
/* const v8, 0x7fffffff */
/* invoke-virtual/range {v0 ..v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V */
/* .line 29 */
p1 = this.w;
p1 = (( android.widget.OverScroller ) p1 ).getFinalY ( ); // invoke-virtual {p1}, Landroid/widget/OverScroller;->getFinalY()I
/* .line 30 */
p2 = this.e;
p2 = (( android.widget.FrameLayout ) p2 ).getHeight ( ); // invoke-virtual {p2}, Landroid/widget/FrameLayout;->getHeight()I
/* if-le p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean a ( android.view.View p0, android.graphics.Rect p1, Boolean p2, Boolean p3, Boolean p4, Boolean p5 ) {
/* .locals 2 */
/* .line 8 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout$e; */
int v0 = 1; // const/4 v0, 0x1
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 9 */
/* iget p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* iget v1, p2, Landroid/graphics/Rect;->left:I */
/* if-eq p3, v1, :cond_0 */
/* .line 10 */
/* iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
int p3 = 1; // const/4 p3, 0x1
} // :cond_0
int p3 = 0; // const/4 p3, 0x0
} // :goto_0
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 11 */
/* iget p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* iget v1, p2, Landroid/graphics/Rect;->top:I */
/* if-eq p4, v1, :cond_1 */
/* .line 12 */
/* iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
int p3 = 1; // const/4 p3, 0x1
} // :cond_1
if ( p6 != null) { // if-eqz p6, :cond_2
/* .line 13 */
/* iget p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* iget p6, p2, Landroid/graphics/Rect;->right:I */
/* if-eq p4, p6, :cond_2 */
/* .line 14 */
/* iput p6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
int p3 = 1; // const/4 p3, 0x1
} // :cond_2
if ( p5 != null) { // if-eqz p5, :cond_3
/* .line 15 */
/* iget p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* iget p2, p2, Landroid/graphics/Rect;->bottom:I */
/* if-eq p4, p2, :cond_3 */
/* .line 16 */
/* iput p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
} // :cond_3
/* move v0, p3 */
} // :goto_1
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 2 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 3 */
v0 = v0 = this.f;
} // .end method
public Boolean b ( android.view.View p0, android.view.View p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* if-nez p4, :cond_0 */
/* .line 1 */
p1 = (( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).onStartNestedScroll ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = v0 = this.f;
} // .end method
public Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 0 */
/* .line 1 */
/* instance-of p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout$e; */
} // .end method
public Boolean d ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = v0 = this.f;
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 5 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V */
/* .line 2 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->h:Z */
/* if-nez v0, :cond_1 */
/* .line 3 */
v0 = this.e;
v0 = (( android.widget.FrameLayout ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
v0 = this.e;
/* .line 4 */
v0 = (( android.widget.FrameLayout ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBottom()I
/* int-to-float v0, v0 */
v2 = this.e;
v2 = (( android.widget.FrameLayout ) v2 ).getTranslationY ( ); // invoke-virtual {v2}, Landroid/widget/FrameLayout;->getTranslationY()F
/* add-float/2addr v0, v2 */
/* const/high16 v2, 0x3f000000 # 0.5f */
/* add-float/2addr v0, v2 */
/* float-to-int v0, v0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
} // :goto_0
v2 = this.g;
v3 = (( android.view.ViewGroup ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I
v4 = this.g;
/* .line 6 */
v4 = (( android.graphics.drawable.Drawable ) v4 ).getIntrinsicHeight ( ); // invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
/* add-int/2addr v4, v0 */
/* .line 7 */
(( android.graphics.drawable.Drawable ) v2 ).setBounds ( v1, v0, v3, v4 ); // invoke-virtual {v2, v1, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 8 */
v0 = this.g;
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
} // :cond_1
return;
} // .end method
public void e ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = this.f;
return;
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = v0 = this.f;
} // .end method
public Boolean fitSystemWindows ( android.graphics.Rect p0 ) {
/* .locals 8 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = c.h.n.v0 .w ( p0 );
/* and-int/lit16 v0, v0, 0x100 */
/* .line 3 */
v2 = this.e;
int v4 = 1; // const/4 v4, 0x1
int v5 = 1; // const/4 v5, 0x1
int v6 = 0; // const/4 v6, 0x0
int v7 = 1; // const/4 v7, 0x1
/* move-object v1, p0 */
/* move-object v3, p1 */
v0 = /* invoke-virtual/range {v1 ..v7}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->a(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z */
/* .line 4 */
v1 = this.r;
(( android.graphics.Rect ) v1 ).set ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* .line 5 */
p1 = this.r;
v1 = this.o;
c.b.q.v2 .a ( p0,p1,v1 );
/* .line 6 */
p1 = this.s;
v1 = this.r;
p1 = (( android.graphics.Rect ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z
int v1 = 1; // const/4 v1, 0x1
/* if-nez p1, :cond_0 */
/* .line 7 */
p1 = this.s;
v0 = this.r;
(( android.graphics.Rect ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
} // :cond_0
p1 = this.p;
v2 = this.o;
p1 = (( android.graphics.Rect ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_1 */
/* .line 9 */
p1 = this.p;
v0 = this.o;
(( android.graphics.Rect ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 10 */
(( android.view.ViewGroup ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V
} // :cond_2
} // .end method
public void g ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = this.f;
return;
} // .end method
public android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->generateDefaultLayoutParams()Landroidx/appcompat/widget/ActionBarOverlayLayout$e;
} // .end method
public androidx.appcompat.widget.ActionBarOverlayLayout$e generateDefaultLayoutParams ( ) {
/* .locals 2 */
/* .line 2 */
/* new-instance v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$e; */
int v1 = -1; // const/4 v1, -0x1
/* invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$e;-><init>(II)V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->generateLayoutParams(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/ActionBarOverlayLayout$e;
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* .line 3 */
/* new-instance v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$e; */
/* invoke-direct {v0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$e;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public androidx.appcompat.widget.ActionBarOverlayLayout$e generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* .line 2 */
/* new-instance v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$e; */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout$e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public Integer getActionBarHideOffset ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.widget.FrameLayout ) v0 ).getTranslationY ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getTranslationY()F
/* float-to-int v0, v0 */
/* neg-int v0, v0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer getNestedScrollAxes ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
v0 = (( c.h.n.w ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/n/w;->a()I
} // .end method
public java.lang.CharSequence getTitle ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = this.f;
} // .end method
public final void h ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()V
/* .line 2 */
v0 = this.A;
return;
} // .end method
public void i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.z;
(( android.view.ViewGroup ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 2 */
v0 = this.A;
(( android.view.ViewGroup ) p0 ).removeCallbacks ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 3 */
v0 = this.x;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( android.view.ViewPropertyAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V
} // :cond_0
return;
} // .end method
public Boolean j ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i:Z */
} // .end method
public final void k ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()V
/* .line 2 */
v0 = this.A;
/* const-wide/16 v1, 0x258 */
(( android.view.ViewGroup ) p0 ).postDelayed ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
public final void l ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()V
/* .line 2 */
v0 = this.z;
/* const-wide/16 v1, 0x258 */
(( android.view.ViewGroup ) p0 ).postDelayed ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
public void m ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout; */
this.d = v0;
/* .line 3 */
(( android.view.ViewGroup ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/widget/ActionBarContainer; */
this.e = v0;
/* .line 4 */
(( android.view.ViewGroup ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->a(Landroid/view/View;)Lc/b/q/z0;
this.f = v0;
} // :cond_0
return;
} // .end method
public final void n ( ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()V
/* .line 2 */
v0 = this.z;
return;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->a(Landroid/content/Context;)V
/* .line 3 */
c.h.n.v0 .I ( p0 );
return;
} // .end method
public void onDetachedFromWindow ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V */
/* .line 2 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()V
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 4 */
/* .line 1 */
p1 = (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
/* .line 2 */
p2 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
/* .line 3 */
(( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* .line 4 */
p3 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
/* .line 5 */
(( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
int p4 = 0; // const/4 p4, 0x0
} // :goto_0
/* if-ge p4, p1, :cond_1 */
/* .line 6 */
(( android.view.ViewGroup ) p0 ).getChildAt ( p4 ); // invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 7 */
v0 = (( android.view.View ) p5 ).getVisibility ( ); // invoke-virtual {p5}, Landroid/view/View;->getVisibility()I
/* const/16 v1, 0x8 */
/* if-eq v0, v1, :cond_0 */
/* .line 8 */
(( android.view.View ) p5 ).getLayoutParams ( ); // invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$e; */
/* .line 9 */
v1 = (( android.view.View ) p5 ).getMeasuredWidth ( ); // invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I
/* .line 10 */
v2 = (( android.view.View ) p5 ).getMeasuredHeight ( ); // invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I
/* .line 11 */
/* iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v3, p2 */
/* .line 12 */
/* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v0, p3 */
/* add-int/2addr v1, v3 */
/* add-int/2addr v2, v0 */
/* .line 13 */
(( android.view.View ) p5 ).layout ( v3, v0, v1, v2 ); // invoke-virtual {p5, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V
} // :cond_0
/* add-int/lit8 p4, p4, 0x1 */
} // :cond_1
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 13 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v1 = this.e;
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p0 */
/* move v2, p1 */
/* move v4, p2 */
/* invoke-virtual/range {v0 ..v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V */
/* .line 3 */
v0 = this.e;
(( android.widget.FrameLayout ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout$e; */
/* .line 4 */
v1 = this.e;
/* .line 5 */
v1 = (( android.widget.FrameLayout ) v1 ).getMeasuredWidth ( ); // invoke-virtual {v1}, Landroid/widget/FrameLayout;->getMeasuredWidth()I
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v1, v2 */
/* iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v1, v2 */
int v2 = 0; // const/4 v2, 0x0
/* .line 6 */
v1 = java.lang.Math .max ( v2,v1 );
/* .line 7 */
v3 = this.e;
/* .line 8 */
v3 = (( android.widget.FrameLayout ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/widget/FrameLayout;->getMeasuredHeight()I
/* iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v3, v4 */
/* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v3, v0 */
/* .line 9 */
v0 = java.lang.Math .max ( v2,v3 );
/* .line 10 */
v3 = this.e;
v3 = (( android.widget.FrameLayout ) v3 ).getMeasuredState ( ); // invoke-virtual {v3}, Landroid/widget/FrameLayout;->getMeasuredState()I
v3 = android.view.View .combineMeasuredStates ( v2,v3 );
/* .line 11 */
v4 = c.h.n.v0 .w ( p0 );
/* and-int/lit16 v4, v4, 0x100 */
if ( v4 != null) { // if-eqz v4, :cond_0
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 12 */
/* iget v5, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->b:I */
/* .line 13 */
/* iget-boolean v6, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Z */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 14 */
v6 = this.e;
(( androidx.appcompat.widget.ActionBarContainer ) v6 ).getTabContainer ( ); // invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarContainer;->getTabContainer()Landroid/view/View;
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 15 */
/* iget v6, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->b:I */
/* add-int/2addr v5, v6 */
/* .line 16 */
} // :cond_1
v5 = this.e;
v5 = (( android.widget.FrameLayout ) v5 ).getVisibility ( ); // invoke-virtual {v5}, Landroid/widget/FrameLayout;->getVisibility()I
/* const/16 v6, 0x8 */
/* if-eq v5, v6, :cond_2 */
/* .line 17 */
v5 = this.e;
v5 = (( android.widget.FrameLayout ) v5 ).getMeasuredHeight ( ); // invoke-virtual {v5}, Landroid/widget/FrameLayout;->getMeasuredHeight()I
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
/* .line 18 */
} // :cond_3
} // :goto_1
v6 = this.q;
v7 = this.o;
(( android.graphics.Rect ) v6 ).set ( v7 ); // invoke-virtual {v6, v7}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* .line 19 */
v6 = this.t;
v7 = this.r;
(( android.graphics.Rect ) v6 ).set ( v7 ); // invoke-virtual {v6, v7}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* .line 20 */
/* iget-boolean v6, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i:Z */
/* if-nez v6, :cond_4 */
/* if-nez v4, :cond_4 */
/* .line 21 */
v4 = this.q;
/* iget v6, v4, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v6, v5 */
/* iput v6, v4, Landroid/graphics/Rect;->top:I */
/* .line 22 */
/* iget v5, v4, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v5, v2 */
/* iput v5, v4, Landroid/graphics/Rect;->bottom:I */
/* .line 23 */
} // :cond_4
v4 = this.t;
/* iget v6, v4, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v6, v5 */
/* iput v6, v4, Landroid/graphics/Rect;->top:I */
/* .line 24 */
/* iget v5, v4, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v5, v2 */
/* iput v5, v4, Landroid/graphics/Rect;->bottom:I */
/* .line 25 */
} // :goto_2
v7 = this.d;
v8 = this.q;
int v9 = 1; // const/4 v9, 0x1
int v10 = 1; // const/4 v10, 0x1
int v11 = 1; // const/4 v11, 0x1
int v12 = 1; // const/4 v12, 0x1
/* move-object v6, p0 */
/* invoke-virtual/range {v6 ..v12}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->a(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z */
/* .line 26 */
v2 = this.u;
v4 = this.t;
v2 = (( android.graphics.Rect ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_5 */
/* .line 27 */
v2 = this.u;
v4 = this.t;
(( android.graphics.Rect ) v2 ).set ( v4 ); // invoke-virtual {v2, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* .line 28 */
v2 = this.d;
v4 = this.t;
(( androidx.appcompat.widget.ContentFrameLayout ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Landroidx/appcompat/widget/ContentFrameLayout;->a(Landroid/graphics/Rect;)V
/* .line 29 */
} // :cond_5
v6 = this.d;
int v8 = 0; // const/4 v8, 0x0
int v10 = 0; // const/4 v10, 0x0
/* move-object v5, p0 */
/* move v7, p1 */
/* move v9, p2 */
/* invoke-virtual/range {v5 ..v10}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V */
/* .line 30 */
v2 = this.d;
(( android.widget.FrameLayout ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout$e; */
/* .line 31 */
v4 = this.d;
/* .line 32 */
v4 = (( android.widget.FrameLayout ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/widget/FrameLayout;->getMeasuredWidth()I
/* iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* add-int/2addr v4, v5 */
/* iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* add-int/2addr v4, v5 */
/* .line 33 */
v1 = java.lang.Math .max ( v1,v4 );
/* .line 34 */
v4 = this.d;
/* .line 35 */
v4 = (( android.widget.FrameLayout ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/widget/FrameLayout;->getMeasuredHeight()I
/* iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v4, v5 */
/* iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v4, v2 */
/* .line 36 */
v0 = java.lang.Math .max ( v0,v4 );
/* .line 37 */
v2 = this.d;
v2 = (( android.widget.FrameLayout ) v2 ).getMeasuredState ( ); // invoke-virtual {v2}, Landroid/widget/FrameLayout;->getMeasuredState()I
v2 = android.view.View .combineMeasuredStates ( v3,v2 );
/* .line 38 */
v3 = (( android.view.ViewGroup ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingLeft()I
v4 = (( android.view.ViewGroup ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingRight()I
/* add-int/2addr v3, v4 */
/* add-int/2addr v1, v3 */
/* .line 39 */
v3 = (( android.view.ViewGroup ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingTop()I
v4 = (( android.view.ViewGroup ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getPaddingBottom()I
/* add-int/2addr v3, v4 */
/* add-int/2addr v0, v3 */
/* .line 40 */
v3 = (( android.view.ViewGroup ) p0 ).getSuggestedMinimumHeight ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I
v0 = java.lang.Math .max ( v0,v3 );
/* .line 41 */
v3 = (( android.view.ViewGroup ) p0 ).getSuggestedMinimumWidth ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I
v1 = java.lang.Math .max ( v1,v3 );
/* .line 42 */
p1 = android.view.View .resolveSizeAndState ( v1,p1,v2 );
/* shl-int/lit8 v1, v2, 0x10 */
/* .line 43 */
p2 = android.view.View .resolveSizeAndState ( v0,p2,v1 );
/* .line 44 */
(( android.view.ViewGroup ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V
return;
} // .end method
public Boolean onNestedFling ( android.view.View p0, Float p1, Float p2, Boolean p3 ) {
/* .locals 0 */
/* .line 1 */
/* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Z */
if ( p1 != null) { // if-eqz p1, :cond_2
/* if-nez p4, :cond_0 */
/* .line 2 */
} // :cond_0
p1 = (( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->a(FF)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->h()V
/* .line 4 */
} // :cond_1
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n()V
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
/* .line 5 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Z */
} // :cond_2
} // :goto_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean onNestedPreFling ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onNestedPreScroll ( android.view.View p0, Integer p1, Integer p2, Integer[] p3 ) {
/* .locals 0 */
return;
} // .end method
public void onNestedScroll ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 1 */
/* iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:I */
/* add-int/2addr p1, p3 */
/* iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:I */
/* .line 2 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).setActionBarHideOffset ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V
return;
} // .end method
public void onNestedScrollAccepted ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.B;
(( c.h.n.w ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/h/n/w;->a(Landroid/view/View;Landroid/view/View;I)V
/* .line 2 */
p1 = (( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).getActionBarHideOffset ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->getActionBarHideOffset()I
/* iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:I */
/* .line 3 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()V
/* .line 4 */
p1 = this.v;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
} // :cond_0
return;
} // .end method
public Boolean onStartNestedScroll ( android.view.View p0, android.view.View p1, Integer p2 ) {
/* .locals 0 */
/* and-int/lit8 p1, p3, 0x2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 1 */
p1 = this.e;
p1 = (( android.widget.FrameLayout ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getVisibility()I
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
} // :cond_0
/* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Z */
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onStopNestedScroll ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l:Z */
/* if-nez p1, :cond_1 */
/* .line 2 */
/* iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m:I */
v0 = this.e;
v0 = (( android.widget.FrameLayout ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I
/* if-gt p1, v0, :cond_0 */
/* .line 3 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l()V
/* .line 4 */
} // :cond_0
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).k ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V
/* .line 5 */
} // :cond_1
} // :goto_0
p1 = this.v;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 6 */
} // :cond_2
return;
} // .end method
public void onWindowSystemUiVisibilityChanged ( Integer p0 ) {
/* .locals 4 */
/* .line 1 */
/* const/16 v1, 0x10 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowSystemUiVisibilityChanged(I)V */
/* .line 3 */
} // :cond_0
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 4 */
/* iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:I */
/* xor-int/2addr v0, p1 */
/* .line 5 */
/* iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:I */
/* and-int/lit8 v1, p1, 0x4 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-nez v1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* and-int/lit16 p1, p1, 0x100 */
if ( p1 != null) { // if-eqz p1, :cond_2
int v2 = 1; // const/4 v2, 0x1
/* .line 6 */
} // :cond_2
p1 = this.v;
if ( p1 != null) { // if-eqz p1, :cond_5
/* xor-int/lit8 v3, v2, 0x1 */
/* .line 7 */
/* if-nez v1, :cond_4 */
/* if-nez v2, :cond_3 */
/* .line 8 */
} // :cond_3
p1 = this.v;
/* .line 9 */
} // :cond_4
} // :goto_1
p1 = this.v;
} // :cond_5
} // :goto_2
/* and-int/lit16 p1, v0, 0x100 */
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 10 */
p1 = this.v;
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 11 */
c.h.n.v0 .I ( p0 );
} // :cond_6
return;
} // .end method
public void onWindowVisibilityChanged ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowVisibilityChanged(I)V */
/* .line 2 */
/* iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->c:I */
/* .line 3 */
v0 = this.v;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
} // :cond_0
return;
} // .end method
public void setActionBarHideOffset ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()V
/* .line 2 */
v0 = this.e;
v0 = (( android.widget.FrameLayout ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I
/* .line 3 */
p1 = java.lang.Math .min ( p1,v0 );
int v0 = 0; // const/4 v0, 0x0
p1 = java.lang.Math .max ( v0,p1 );
/* .line 4 */
v0 = this.e;
/* neg-int p1, p1 */
/* int-to-float p1, p1 */
(( android.widget.FrameLayout ) v0 ).setTranslationY ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setTranslationY(F)V
return;
} // .end method
public void setActionBarVisibilityCallback ( androidx.appcompat.widget.ActionBarOverlayLayout$d p0 ) {
/* .locals 1 */
/* .line 1 */
this.v = p1;
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getWindowToken ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getWindowToken()Landroid/os/IBinder;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
p1 = this.v;
/* iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->c:I */
/* .line 4 */
/* iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->n:I */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).onWindowSystemUiVisibilityChanged ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onWindowSystemUiVisibilityChanged(I)V
/* .line 6 */
c.h.n.v0 .I ( p0 );
} // :cond_0
return;
} // .end method
public void setHasNonEmbeddedTabs ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j:Z */
return;
} // .end method
public void setHideOnContentScrollEnabled ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Z */
/* if-eq p1, v0, :cond_0 */
/* .line 2 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Z */
/* if-nez p1, :cond_0 */
/* .line 3 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()V
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).setActionBarHideOffset ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V
} // :cond_0
return;
} // .end method
public void setIcon ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = this.f;
return;
} // .end method
public void setIcon ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 3 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 4 */
v0 = this.f;
return;
} // .end method
public void setLogo ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = this.f;
return;
} // .end method
public void setOverlayMode ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( android.view.ViewGroup ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
(( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I */
/* const/16 v0, 0x13 */
/* if-ge p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->h:Z */
return;
} // .end method
public void setShowingForActionMode ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public void setUiOptions ( Integer p0 ) {
/* .locals 0 */
return;
} // .end method
public void setWindowCallback ( android.view.Window$Callback p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = this.f;
return;
} // .end method
public void setWindowTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->m()V
/* .line 2 */
v0 = this.f;
return;
} // .end method
public Boolean shouldDelayChildPressedState ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
