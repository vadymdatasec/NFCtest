public class com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior extends e.f.a.c.k.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/appbar/AppBarLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "ScrollingViewBehavior" */
} // .end annotation
/* # direct methods */
public com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Le/f/a/c/k/c;-><init>()V */
return;
} // .end method
public com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Le/f/a/c/k/c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 3 */
v0 = e.f.a.c.i.ScrollingViewBehavior_Layout;
/* .line 4 */
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
p2 = (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* .line 7 */
(( e.f.a.c.k.c ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/f/a/c/k/c;->b(I)V
/* .line 8 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
public static Integer a ( com.google.android.material.appbar.AppBarLayout p0 ) {
/* .locals 1 */
/* .line 17 */
(( android.widget.LinearLayout ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
(( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d()Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;
/* .line 18 */
/* instance-of v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 19 */
	 /* check-cast p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior; */
	 p0 = 	 (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->d()I
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public android.view.View a ( java.util.List p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;->a(Ljava/util/List;)Lcom/google/android/material/appbar/AppBarLayout;
} // .end method
public com.google.android.material.appbar.AppBarLayout a ( java.util.List p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Landroid/view/View;", */
/* ">;)", */
/* "Lcom/google/android/material/appbar/AppBarLayout;" */
/* } */
} // .end annotation
v0 = /* .line 20 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 21 */
/* check-cast v2, Landroid/view/View; */
/* .line 22 */
/* instance-of v3, v2, Lcom/google/android/material/appbar/AppBarLayout; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 23 */
/* check-cast v2, Lcom/google/android/material/appbar/AppBarLayout; */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void a ( android.view.View p0, android.view.View p1 ) {
/* .locals 3 */
/* .line 9 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
(( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d()Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;
/* .line 10 */
/* instance-of v1, v0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 11 */
/* check-cast v0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior; */
/* .line 12 */
v1 = (( android.view.View ) p2 ).getBottom ( ); // invoke-virtual {p2}, Landroid/view/View;->getBottom()I
v2 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* sub-int/2addr v1, v2 */
/* .line 13 */
v0 = com.google.android.material.appbar.AppBarLayout$BaseBehavior .a ( v0 );
/* add-int/2addr v1, v0 */
/* .line 14 */
v0 = (( e.f.a.c.k.c ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/c/k/c;->d()I
/* add-int/2addr v1, v0 */
/* .line 15 */
p2 = (( e.f.a.c.k.c ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/a/c/k/c;->a(Landroid/view/View;)I
/* sub-int/2addr v1, p2 */
/* .line 16 */
c.h.n.v0 .e ( p1,v1 );
} // :cond_0
return;
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.graphics.Rect p2, Boolean p3 ) {
/* .locals 3 */
/* .line 3 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->b(Landroid/view/View;)Ljava/util/List;
(( com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;->a(Ljava/util/List;)Lcom/google/android/material/appbar/AppBarLayout;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v2 = (( android.view.View ) p2 ).getLeft ( ); // invoke-virtual {p2}, Landroid/view/View;->getLeft()I
p2 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
(( android.graphics.Rect ) p3 ).offset ( v2, p2 ); // invoke-virtual {p3, v2, p2}, Landroid/graphics/Rect;->offset(II)V
/* .line 5 */
p2 = this.d;
/* .line 6 */
v2 = (( android.view.ViewGroup ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I
p1 = (( android.view.ViewGroup ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I
(( android.graphics.Rect ) p2 ).set ( v1, v1, v2, p1 ); // invoke-virtual {p2, v1, v1, v2, p1}, Landroid/graphics/Rect;->set(IIII)V
/* .line 7 */
p1 = (( android.graphics.Rect ) p2 ).contains ( p3 ); // invoke-virtual {p2, p3}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* xor-int/lit8 p2, p4, 0x1 */
/* .line 8 */
(( com.google.android.material.appbar.AppBarLayout ) v0 ).a ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Lcom/google/android/material/appbar/AppBarLayout;->a(ZZ)V
} // :cond_0
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2 ) {
/* .locals 0 */
/* .line 2 */
/* instance-of p1, p3, Lcom/google/android/material/appbar/AppBarLayout; */
} // .end method
public Float b ( android.view.View p0 ) {
/* .locals 4 */
/* .line 3 */
/* instance-of v0, p1, Lcom/google/android/material/appbar/AppBarLayout; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* check-cast p1, Lcom/google/android/material/appbar/AppBarLayout; */
/* .line 5 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p1 ).getTotalScrollRange ( ); // invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I
/* .line 6 */
v2 = (( com.google.android.material.appbar.AppBarLayout ) p1 ).getDownNestedPreScrollRange ( ); // invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedPreScrollRange()I
/* .line 7 */
p1 = com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior .a ( p1 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* add-int v3, v0, p1 */
/* if-gt v3, v2, :cond_0 */
} // :cond_0
/* sub-int/2addr v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* const/high16 v1, 0x3f800000 # 1.0f */
/* int-to-float p1, p1 */
/* int-to-float v0, v0 */
/* div-float/2addr p1, v0 */
/* add-float/2addr p1, v1 */
} // :cond_1
} // .end method
public final void b ( android.view.View p0, android.view.View p1 ) {
/* .locals 1 */
/* .line 8 */
/* instance-of v0, p2, Lcom/google/android/material/appbar/AppBarLayout; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 9 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
/* .line 10 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).e ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 11 */
p1 = (( android.view.View ) p1 ).getScrollY ( ); // invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
/* if-lez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( com.google.android.material.appbar.AppBarLayout ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Lcom/google/android/material/appbar/AppBarLayout;->b(Z)Z
} // :cond_1
return;
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2 ) {
/* .locals 0 */
/* .line 1 */
(( com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;->a(Landroid/view/View;Landroid/view/View;)V
/* .line 2 */
(( com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior ) p0 ).b ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;->b(Landroid/view/View;Landroid/view/View;)V
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer c ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Lcom/google/android/material/appbar/AppBarLayout; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Lcom/google/android/material/appbar/AppBarLayout; */
p1 = (( com.google.android.material.appbar.AppBarLayout ) p1 ).getTotalScrollRange ( ); // invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I
/* .line 3 */
} // :cond_0
p1 = /* invoke-super {p0, p1}, Le/f/a/c/k/c;->c(Landroid/view/View;)I */
} // .end method
