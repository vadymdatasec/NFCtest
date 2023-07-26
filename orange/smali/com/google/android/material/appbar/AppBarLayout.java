public class com.google.android.material.appbar.AppBarLayout extends android.widget.LinearLayout {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation runtime Landroidx/coordinatorlayout/widget/CoordinatorLayout$c; */
	 /* value = Lcom/google/android/material/appbar/AppBarLayout$Behavior; */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;, */
/* Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;, */
/* Lcom/google/android/material/appbar/AppBarLayout$Behavior;, */
/* Lcom/google/android/material/appbar/AppBarLayout$c;, */
/* Lcom/google/android/material/appbar/AppBarLayout$b; */
/* } */
} // .end annotation
/* # instance fields */
public Integer b;
public Integer c;
public Integer d;
public Boolean e;
public Integer f;
public c.h.n.u1 g;
public java.util.List h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Lcom/google/android/material/appbar/AppBarLayout$b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean i;
public Boolean j;
public Boolean k;
public Boolean l;
public m;
/* # direct methods */
public com.google.android.material.appbar.AppBarLayout ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Lcom/google/android/material/appbar/AppBarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public com.google.android.material.appbar.AppBarLayout ( ) {
/* .locals 9 */
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = -1; // const/4 v0, -0x1
/* .line 3 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->b:I */
/* .line 4 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->c:I */
/* .line 5 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->d:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->f:I */
int v1 = 1; // const/4 v1, 0x1
/* .line 7 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).setOrientation ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->setOrientation(I)V
/* .line 8 */
/* const/16 v2, 0x15 */
/* if-lt v1, v2, :cond_0 */
/* .line 9 */
e.f.a.c.k.f .a ( p0 );
/* .line 10 */
e.f.a.c.k.f .a ( p0,p2,v0,v1 );
/* .line 11 */
} // :cond_0
v5 = e.f.a.c.i.AppBarLayout;
int v6 = 0; // const/4 v6, 0x0
/* new-array v8, v0, [I */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* .line 12 */
/* invoke-static/range {v3 ..v8}, Le/f/a/c/p/c;->c(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray; */
/* .line 13 */
(( android.content.res.TypedArray ) p1 ).getDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
c.h.n.v0 .a ( p0,p2 );
/* .line 14 */
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 15 */
/* .line 16 */
p2 = (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* .line 17 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).a ( p2, v0, v0 ); // invoke-virtual {p0, p2, v0, v0}, Lcom/google/android/material/appbar/AppBarLayout;->a(ZZZ)V
/* .line 18 */
} // :cond_1
/* if-lt p2, v2, :cond_2 */
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 19 */
/* .line 20 */
p2 = (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* int-to-float p2, p2 */
/* .line 21 */
e.f.a.c.k.f .a ( p0,p2 );
/* .line 22 */
} // :cond_2
/* const/16 v1, 0x1a */
/* if-lt p2, v1, :cond_4 */
/* .line 23 */
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 24 */
/* .line 25 */
p2 = (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* .line 26 */
(( android.widget.LinearLayout ) p0 ).setKeyboardNavigationCluster ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setKeyboardNavigationCluster(Z)V
/* .line 27 */
} // :cond_3
p2 = (( android.content.res.TypedArray ) p1 ).hasValue ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 28 */
/* .line 29 */
p2 = (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* .line 30 */
(( android.widget.LinearLayout ) p0 ).setTouchscreenBlocksFocus ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/LinearLayout;->setTouchscreenBlocksFocus(Z)V
/* .line 31 */
} // :cond_4
p2 = (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* iput-boolean p2, p0, Lcom/google/android/material/appbar/AppBarLayout;->l:Z */
/* .line 32 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
/* .line 33 */
/* new-instance p1, Lcom/google/android/material/appbar/AppBarLayout$a; */
/* invoke-direct {p1, p0}, Lcom/google/android/material/appbar/AppBarLayout$a;-><init>(Lcom/google/android/material/appbar/AppBarLayout;)V */
c.h.n.v0 .a ( p0,p1 );
return;
} // .end method
/* # virtual methods */
public c.h.n.u1 a ( c.h.n.u1 p0 ) {
/* .locals 2 */
/* .line 12 */
v0 = c.h.n.v0 .l ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* move-object v0, p1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 13 */
} // :goto_0
v1 = this.g;
v1 = c.h.m.c .a ( v1,v0 );
/* if-nez v1, :cond_1 */
/* .line 14 */
this.g = v0;
/* .line 15 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->d()V
} // :cond_1
} // .end method
public void a ( Integer p0 ) {
/* .locals 3 */
/* .line 5 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 0; // const/4 v1, 0x0
v0 = /* .line 6 */
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 7 */
v2 = this.h;
/* check-cast v2, Lcom/google/android/material/appbar/AppBarLayout$b; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 8 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void a ( Boolean p0, Boolean p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/material/appbar/AppBarLayout;->a(ZZZ)V
return;
} // .end method
public final void a ( Boolean p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 2; // const/4 p1, 0x2
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
if ( p2 != null) { // if-eqz p2, :cond_1
int p2 = 4; // const/4 p2, 0x4
} // :cond_1
int p2 = 0; // const/4 p2, 0x0
} // :goto_1
/* or-int/2addr p1, p2 */
if ( p3 != null) { // if-eqz p3, :cond_2
/* const/16 v0, 0x8 */
} // :cond_2
/* or-int/2addr p1, v0 */
/* .line 2 */
/* iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->f:I */
/* .line 3 */
(( android.widget.LinearLayout ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->requestLayout()V
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* .line 4 */
/* iget-boolean v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->e:Z */
} // .end method
public final Boolean a ( Boolean p0 ) {
/* .locals 1 */
/* .line 9 */
/* iget-boolean v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 10 */
/* iput-boolean p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:Z */
/* .line 11 */
(( android.widget.LinearLayout ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->refreshDrawableState()V
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean b ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( android.widget.LinearLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 2 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Lcom/google/android/material/appbar/AppBarLayout$c; */
v3 = (( com.google.android.material.appbar.AppBarLayout$c ) v3 ).c ( ); // invoke-virtual {v3}, Lcom/google/android/material/appbar/AppBarLayout$c;->c()Z
if ( v3 != null) { // if-eqz v3, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public Boolean b ( Boolean p0 ) {
/* .locals 1 */
/* .line 3 */
/* iget-boolean v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->k:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 4 */
/* iput-boolean p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->k:Z */
/* .line 5 */
(( android.widget.LinearLayout ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->refreshDrawableState()V
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p0 ).getTotalScrollRange ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean checkLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 0 */
/* .line 1 */
/* instance-of p1, p1, Lcom/google/android/material/appbar/AppBarLayout$c; */
} // .end method
public final void d ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->b:I */
/* .line 2 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->c:I */
/* .line 3 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->d:I */
return;
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->l:Z */
} // .end method
public void f ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->f:I */
return;
} // .end method
public android.view.ViewGroup$LayoutParams generateDefaultLayoutParams ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->generateDefaultLayoutParams()Lcom/google/android/material/appbar/AppBarLayout$c;
} // .end method
public android.widget.LinearLayout$LayoutParams generateDefaultLayoutParams ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 2 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).generateDefaultLayoutParams ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->generateDefaultLayoutParams()Lcom/google/android/material/appbar/AppBarLayout$c;
} // .end method
public com.google.android.material.appbar.AppBarLayout$c generateDefaultLayoutParams ( ) {
/* .locals 3 */
/* .line 3 */
/* new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$c; */
int v1 = -1; // const/4 v1, -0x1
int v2 = -2; // const/4 v2, -0x2
/* invoke-direct {v0, v1, v2}, Lcom/google/android/material/appbar/AppBarLayout$c;-><init>(II)V */
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout;->generateLayoutParams(Landroid/util/AttributeSet;)Lcom/google/android/material/appbar/AppBarLayout$c;
} // .end method
public android.view.ViewGroup$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Lcom/google/android/material/appbar/AppBarLayout$c;
} // .end method
public android.widget.LinearLayout$LayoutParams generateLayoutParams ( android.util.AttributeSet p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 3 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout;->generateLayoutParams(Landroid/util/AttributeSet;)Lcom/google/android/material/appbar/AppBarLayout$c;
} // .end method
public android.widget.LinearLayout$LayoutParams generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 4 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).generateLayoutParams ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Lcom/google/android/material/appbar/AppBarLayout$c;
} // .end method
public com.google.android.material.appbar.AppBarLayout$c generateLayoutParams ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* .line 5 */
/* new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$c; */
(( android.widget.LinearLayout ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1, p1}, Lcom/google/android/material/appbar/AppBarLayout$c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public com.google.android.material.appbar.AppBarLayout$c generateLayoutParams ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 2 */
/* .line 6 */
/* const/16 v1, 0x13 */
/* if-lt v0, v1, :cond_0 */
/* instance-of v0, p1, Landroid/widget/LinearLayout$LayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 7 */
/* new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* check-cast p1, Landroid/widget/LinearLayout$LayoutParams; */
/* invoke-direct {v0, p1}, Lcom/google/android/material/appbar/AppBarLayout$c;-><init>(Landroid/widget/LinearLayout$LayoutParams;)V */
/* .line 8 */
} // :cond_0
/* instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 9 */
/* new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* invoke-direct {v0, p1}, Lcom/google/android/material/appbar/AppBarLayout$c;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
/* .line 10 */
} // :cond_1
/* new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* invoke-direct {v0, p1}, Lcom/google/android/material/appbar/AppBarLayout$c;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public Integer getDownNestedPreScrollRange ( ) {
/* .locals 9 */
/* .line 1 */
/* iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->c:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( android.widget.LinearLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I
/* add-int/lit8 v0, v0, -0x1 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ltz v0, :cond_5 */
/* .line 3 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 4 */
(( android.view.View ) v3 ).getLayoutParams ( ); // invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* .line 5 */
v5 = (( android.view.View ) v3 ).getMeasuredHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
/* .line 6 */
/* iget v6, v4, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
/* and-int/lit8 v7, v6, 0x5 */
int v8 = 5; // const/4 v8, 0x5
/* if-ne v7, v8, :cond_3 */
/* .line 7 */
/* iget v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* iget v4, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v7, v4 */
/* add-int/2addr v2, v7 */
/* and-int/lit8 v4, v6, 0x8 */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 8 */
v3 = c.h.n.v0 .p ( v3 );
/* add-int/2addr v2, v3 */
} // :cond_1
/* and-int/lit8 v4, v6, 0x2 */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 9 */
v3 = c.h.n.v0 .p ( v3 );
/* .line 10 */
} // :cond_2
v3 = (( com.google.android.material.appbar.AppBarLayout ) p0 ).getTopInset ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
} // :goto_1
/* sub-int/2addr v5, v3 */
/* add-int/2addr v2, v5 */
} // :cond_3
/* if-lez v2, :cond_4 */
} // :cond_4
} // :goto_2
/* add-int/lit8 v0, v0, -0x1 */
/* .line 11 */
} // :cond_5
} // :goto_3
v0 = java.lang.Math .max ( v1,v2 );
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->c:I */
} // .end method
public Integer getDownNestedScrollRange ( ) {
/* .locals 9 */
/* .line 1 */
/* iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->d:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( android.widget.LinearLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 3 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 4 */
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* .line 5 */
v6 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
/* .line 6 */
/* iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* iget v8, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v7, v8 */
/* add-int/2addr v6, v7 */
/* .line 7 */
/* iget v5, v5, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
/* and-int/lit8 v7, v5, 0x1 */
if ( v7 != null) { // if-eqz v7, :cond_2
/* add-int/2addr v3, v6 */
/* and-int/lit8 v5, v5, 0x2 */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 8 */
v0 = c.h.n.v0 .p ( v4 );
v2 = (( com.google.android.material.appbar.AppBarLayout ) p0 ).getTopInset ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
/* add-int/2addr v0, v2 */
/* sub-int/2addr v3, v0 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 9 */
} // :cond_2
} // :goto_1
v0 = java.lang.Math .max ( v1,v3 );
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->d:I */
} // .end method
public final Integer getMinimumHeightForVisibleOverlappingContent ( ) {
/* .locals 3 */
/* .line 1 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p0 ).getTopInset ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
/* .line 2 */
v1 = c.h.n.v0 .p ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_0
} // :goto_0
/* mul-int/lit8 v1, v1, 0x2 */
/* add-int/2addr v1, v0 */
/* .line 3 */
} // :cond_0
v1 = (( android.widget.LinearLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I
int v2 = 1; // const/4 v2, 0x1
/* if-lt v1, v2, :cond_1 */
/* sub-int/2addr v1, v2 */
/* .line 4 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
v1 = c.h.n.v0 .p ( v1 );
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 5 */
} // :cond_2
v0 = (( android.widget.LinearLayout ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getHeight()I
/* div-int/lit8 v0, v0, 0x3 */
} // .end method
public Integer getPendingAction ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->f:I */
} // .end method
public Float getTargetElevation ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Integer getTopInset ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.h.n.u1 ) v0 ).i ( ); // invoke-virtual {v0}, Lc/h/n/u1;->i()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Integer getTotalScrollRange ( ) {
/* .locals 9 */
/* .line 1 */
/* iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->b:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( android.widget.LinearLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 3 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( v2 ); // invoke-virtual {p0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 4 */
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* .line 5 */
v6 = (( android.view.View ) v4 ).getMeasuredHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
/* .line 6 */
/* iget v7, v5, Lcom/google/android/material/appbar/AppBarLayout$c;->a:I */
/* and-int/lit8 v8, v7, 0x1 */
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 7 */
/* iget v8, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v6, v8 */
/* iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v6, v5 */
/* add-int/2addr v3, v6 */
/* and-int/lit8 v5, v7, 0x2 */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 8 */
v0 = c.h.n.v0 .p ( v4 );
/* sub-int/2addr v3, v0 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 9 */
} // :cond_2
} // :goto_1
v0 = (( com.google.android.material.appbar.AppBarLayout ) p0 ).getTopInset ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
/* sub-int/2addr v3, v0 */
v0 = java.lang.Math .max ( v1,v3 );
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->b:I */
} // .end method
public Integer getUpNestedPreScrollRange ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p0 ).getTotalScrollRange ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I
} // .end method
public onCreateDrawableState ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.m;
/* if-nez v0, :cond_0 */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [I */
/* .line 2 */
this.m = v0;
/* .line 3 */
} // :cond_0
v0 = this.m;
/* .line 4 */
/* array-length v1, v0 */
/* add-int/2addr p1, v1 */
/* invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onCreateDrawableState(I)[I */
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
/* iget-boolean v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
} // :cond_1
/* neg-int v2, v2 */
} // :goto_0
/* aput v2, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* .line 6 */
/* iget-boolean v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* iget-boolean v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->k:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
} // :cond_2
/* neg-int v2, v2 */
} // :goto_1
/* aput v2, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* .line 7 */
/* iget-boolean v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
} // :cond_3
/* neg-int v2, v2 */
} // :goto_2
/* aput v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* .line 8 */
/* iget-boolean v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->j:Z */
if ( v2 != null) { // if-eqz v2, :cond_4
/* iget-boolean v2, p0, Lcom/google/android/material/appbar/AppBarLayout;->k:Z */
if ( v2 != null) { // if-eqz v2, :cond_4
} // :cond_4
/* neg-int v2, v2 */
} // :goto_3
/* aput v2, v0, v1 */
/* .line 9 */
android.widget.LinearLayout .mergeDrawableStates ( p1,v0 );
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super/range {p0 ..p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V */
/* .line 2 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->d()V
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* iput-boolean p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->e:Z */
/* .line 4 */
p2 = (( android.widget.LinearLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I
int p3 = 0; // const/4 p3, 0x0
} // :goto_0
int p4 = 1; // const/4 p4, 0x1
/* if-ge p3, p2, :cond_1 */
/* .line 5 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( p3 ); // invoke-virtual {p0, p3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 6 */
(( android.view.View ) p5 ).getLayoutParams ( ); // invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p5, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* .line 7 */
(( com.google.android.material.appbar.AppBarLayout$c ) p5 ).b ( ); // invoke-virtual {p5}, Lcom/google/android/material/appbar/AppBarLayout$c;->b()Landroid/view/animation/Interpolator;
if ( p5 != null) { // if-eqz p5, :cond_0
/* .line 8 */
/* iput-boolean p4, p0, Lcom/google/android/material/appbar/AppBarLayout;->e:Z */
} // :cond_0
/* add-int/lit8 p3, p3, 0x1 */
/* .line 9 */
} // :cond_1
} // :goto_1
/* iget-boolean p2, p0, Lcom/google/android/material/appbar/AppBarLayout;->i:Z */
/* if-nez p2, :cond_4 */
/* .line 10 */
/* iget-boolean p2, p0, Lcom/google/android/material/appbar/AppBarLayout;->l:Z */
/* if-nez p2, :cond_2 */
p2 = (( com.google.android.material.appbar.AppBarLayout ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->b()Z
if ( p2 != null) { // if-eqz p2, :cond_3
} // :cond_2
int p1 = 1; // const/4 p1, 0x1
} // :cond_3
(( com.google.android.material.appbar.AppBarLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout;->a(Z)Z
} // :cond_4
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V */
/* .line 2 */
(( com.google.android.material.appbar.AppBarLayout ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout;->d()V
return;
} // .end method
public void setExpanded ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = c.h.n.v0 .D ( p0 );
(( com.google.android.material.appbar.AppBarLayout ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/android/material/appbar/AppBarLayout;->a(ZZ)V
return;
} // .end method
public void setLiftOnScroll ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/google/android/material/appbar/AppBarLayout;->l:Z */
return;
} // .end method
public void setOrientation ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V */
return;
/* .line 2 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "AppBarLayout is always vertical and does not support horizontal orientation"; // const-string v0, "AppBarLayout is always vertical and does not support horizontal orientation"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void setTargetElevation ( Float p0 ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
e.f.a.c.k.f .a ( p0,p1 );
} // :cond_0
return;
} // .end method
