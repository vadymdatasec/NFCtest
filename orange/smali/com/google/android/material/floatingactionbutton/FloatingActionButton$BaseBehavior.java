public class com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/floatingactionbutton/FloatingActionButton; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "BaseBehavior" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", */
/* ">", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout$b<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* # instance fields */
public android.graphics.Rect a;
public com.google.android.material.floatingactionbutton.FloatingActionButton$a b;
public Boolean c;
/* # direct methods */
public com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->c:Z */
return;
} // .end method
public com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ( ) {
/* .locals 1 */
/* .line 3 */
/* invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 4 */
v0 = e.f.a.c.i.FloatingActionButton_Behavior_Layout;
/* .line 5 */
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 6 */
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
p2 = (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* iput-boolean p2, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->c:Z */
/* .line 8 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
public static Boolean a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 9 */
(( android.view.View ) p0 ).getLayoutParams ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 10 */
/* instance-of v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
/* check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
(( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) p0 ).d ( ); // invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d()Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;
/* instance-of p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior; */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout$e p0 ) {
/* .locals 1 */
/* .line 3 */
/* iget v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
/* if-nez v0, :cond_0 */
/* const/16 v0, 0x50 */
/* .line 4 */
/* iput v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
} // :cond_0
return;
} // .end method
public final void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.floatingactionbutton.FloatingActionButton p1 ) {
/* .locals 6 */
/* .line 39 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 40 */
v1 = (( android.graphics.Rect ) v0 ).centerX ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I
/* if-lez v1, :cond_5 */
v1 = (( android.graphics.Rect ) v0 ).centerY ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I
/* if-lez v1, :cond_5 */
/* .line 41 */
(( android.widget.ImageButton ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
/* .line 42 */
v2 = (( android.widget.ImageButton ) p2 ).getRight ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getRight()I
v3 = (( android.view.ViewGroup ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I
/* iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* sub-int/2addr v3, v4 */
int v4 = 0; // const/4 v4, 0x0
/* if-lt v2, v3, :cond_0 */
/* .line 43 */
/* iget v2, v0, Landroid/graphics/Rect;->right:I */
/* .line 44 */
} // :cond_0
v2 = (( android.widget.ImageButton ) p2 ).getLeft ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getLeft()I
/* iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
/* if-gt v2, v3, :cond_1 */
/* .line 45 */
/* iget v2, v0, Landroid/graphics/Rect;->left:I */
/* neg-int v2, v2 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 46 */
} // :goto_0
v3 = (( android.widget.ImageButton ) p2 ).getBottom ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getBottom()I
p1 = (( android.view.ViewGroup ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I
/* iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* sub-int/2addr p1, v5 */
/* if-lt v3, p1, :cond_2 */
/* .line 47 */
/* iget v4, v0, Landroid/graphics/Rect;->bottom:I */
/* .line 48 */
} // :cond_2
p1 = (( android.widget.ImageButton ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getTop()I
/* iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* if-gt p1, v1, :cond_3 */
/* .line 49 */
/* iget p1, v0, Landroid/graphics/Rect;->top:I */
/* neg-int v4, p1 */
} // :cond_3
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 50 */
c.h.n.v0 .e ( p2,v4 );
} // :cond_4
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 51 */
c.h.n.v0 .d ( p2,v2 );
} // :cond_5
return;
} // .end method
public final Boolean a ( android.view.View p0, com.google.android.material.floatingactionbutton.FloatingActionButton p1 ) {
/* .locals 3 */
/* .line 12 */
(( android.widget.ImageButton ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
/* .line 13 */
/* iget-boolean v1, p0, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->c:Z */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_0 */
/* .line 14 */
} // :cond_0
v0 = (( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->c()I
p1 = (( android.view.View ) p1 ).getId ( ); // invoke-virtual {p1}, Landroid/view/View;->getId()I
/* if-eq v0, p1, :cond_1 */
/* .line 15 */
} // :cond_1
p1 = (( e.f.a.c.p.e ) p2 ).getUserSetVisibility ( ); // invoke-virtual {p2}, Le/f/a/c/p/e;->getUserSetVisibility()I
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_2
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton; */
p1 = (( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;I)Z
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.graphics.Rect p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton; */
p1 = (( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/Rect;)Z
} // .end method
public final Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, com.google.android.material.floatingactionbutton.FloatingActionButton p2 ) {
/* .locals 2 */
/* .line 16 */
v0 = (( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a(Landroid/view/View;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 17 */
} // :cond_0
v0 = this.a;
/* if-nez v0, :cond_1 */
/* .line 18 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.a = v0;
/* .line 19 */
} // :cond_1
v0 = this.a;
/* .line 20 */
e.f.a.c.p.a .a ( p1,p2,v0 );
/* .line 21 */
/* iget p1, v0, Landroid/graphics/Rect;->bottom:I */
p2 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getMinimumHeightForVisibleOverlappingContent ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getMinimumHeightForVisibleOverlappingContent()I
/* if-gt p1, p2, :cond_2 */
/* .line 22 */
p1 = this.b;
(( com.google.android.material.floatingactionbutton.FloatingActionButton ) p3 ).a ( p1, v1 ); // invoke-virtual {p3, p1, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->a(Lcom/google/android/material/floatingactionbutton/FloatingActionButton$a;Z)V
/* .line 23 */
} // :cond_2
p1 = this.b;
(( com.google.android.material.floatingactionbutton.FloatingActionButton ) p3 ).b ( p1, v1 ); // invoke-virtual {p3, p1, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b(Lcom/google/android/material/floatingactionbutton/FloatingActionButton$a;Z)V
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.floatingactionbutton.FloatingActionButton p1, Integer p2 ) {
/* .locals 5 */
/* .line 24 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->b(Landroid/view/View;)Ljava/util/List;
v1 = /* .line 25 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_2 */
/* .line 26 */
/* check-cast v3, Landroid/view/View; */
/* .line 27 */
/* instance-of v4, v3, Lcom/google/android/material/appbar/AppBarLayout; */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 28 */
/* check-cast v3, Lcom/google/android/material/appbar/AppBarLayout; */
v3 = (( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).a ( p1, v3, p2 ); // invoke-virtual {p0, p1, v3, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 29 */
} // :cond_0
v4 = com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior .a ( v3 );
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 30 */
v3 = (( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).b ( v3, p2 ); // invoke-virtual {p0, v3, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->b(Landroid/view/View;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 31 */
} // :cond_2
} // :goto_1
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).d ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->d(Landroid/view/View;I)V
/* .line 32 */
(( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.floatingactionbutton.FloatingActionButton p1, android.graphics.Rect p2 ) {
/* .locals 4 */
/* .line 33 */
p1 = this.b;
/* .line 34 */
v0 = (( android.widget.ImageButton ) p2 ).getLeft ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getLeft()I
/* iget v1, p1, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v0, v1 */
/* .line 35 */
v1 = (( android.widget.ImageButton ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getTop()I
/* iget v2, p1, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v1, v2 */
/* .line 36 */
v2 = (( android.widget.ImageButton ) p2 ).getRight ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getRight()I
/* iget v3, p1, Landroid/graphics/Rect;->right:I */
/* sub-int/2addr v2, v3 */
/* .line 37 */
p2 = (( android.widget.ImageButton ) p2 ).getBottom ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getBottom()I
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
/* sub-int/2addr p2, p1 */
/* .line 38 */
(( android.graphics.Rect ) p3 ).set ( v0, v1, v2, p2 ); // invoke-virtual {p3, v0, v1, v2, p2}, Landroid/graphics/Rect;->set(IIII)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.floatingactionbutton.FloatingActionButton p1, android.view.View p2 ) {
/* .locals 1 */
/* .line 5 */
/* instance-of v0, p3, Lcom/google/android/material/appbar/AppBarLayout; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
/* check-cast p3, Lcom/google/android/material/appbar/AppBarLayout; */
(( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).a ( p1, p3, p2 ); // invoke-virtual {p0, p1, p3, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z
/* .line 7 */
} // :cond_0
p1 = com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior .a ( p3 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 8 */
(( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).b ( p3, p2 ); // invoke-virtual {p0, p3, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->b(Landroid/view/View;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean b ( android.view.View p0, com.google.android.material.floatingactionbutton.FloatingActionButton p1 ) {
/* .locals 3 */
/* .line 2 */
v0 = (( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a(Landroid/view/View;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
(( android.widget.ImageButton ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
/* .line 4 */
p1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
v2 = (( android.widget.ImageButton ) p2 ).getHeight ( ); // invoke-virtual {p2}, Landroid/widget/ImageButton;->getHeight()I
/* div-int/lit8 v2, v2, 0x2 */
/* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
/* add-int/2addr v2, v0 */
/* if-ge p1, v2, :cond_1 */
/* .line 5 */
p1 = this.b;
(( com.google.android.material.floatingactionbutton.FloatingActionButton ) p2 ).a ( p1, v1 ); // invoke-virtual {p2, p1, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->a(Lcom/google/android/material/floatingactionbutton/FloatingActionButton$a;Z)V
/* .line 6 */
} // :cond_1
p1 = this.b;
(( com.google.android.material.floatingactionbutton.FloatingActionButton ) p2 ).b ( p1, v1 ); // invoke-virtual {p2, p1, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b(Lcom/google/android/material/floatingactionbutton/FloatingActionButton$a;Z)V
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton; */
p1 = (( com.google.android.material.floatingactionbutton.FloatingActionButton$BaseBehavior ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/view/View;)Z
} // .end method
