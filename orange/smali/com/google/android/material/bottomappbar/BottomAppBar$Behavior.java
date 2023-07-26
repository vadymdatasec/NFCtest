public class com.google.android.material.bottomappbar.BottomAppBar$Behavior extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/bottomappbar/BottomAppBar; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "Behavior" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior<", */
/* "Lcom/google/android/material/bottomappbar/BottomAppBar;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
public final android.graphics.Rect d;
/* # direct methods */
public com.google.android.material.bottomappbar.BottomAppBar$Behavior ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;-><init>()V */
/* .line 2 */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
this.d = v0;
return;
} // .end method
public com.google.android.material.bottomappbar.BottomAppBar$Behavior ( ) {
/* .locals 0 */
/* .line 3 */
/* invoke-direct {p0, p1, p2}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 4 */
/* new-instance p1, Landroid/graphics/Rect; */
/* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
this.d = p1;
return;
} // .end method
/* # virtual methods */
public void a ( android.view.View p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Lcom/google/android/material/bottomappbar/BottomAppBar; */
(( com.google.android.material.bottomappbar.BottomAppBar$Behavior ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->a(Lcom/google/android/material/bottomappbar/BottomAppBar;)V
return;
} // .end method
public void a ( com.google.android.material.bottomappbar.BottomAppBar p0 ) {
/* .locals 2 */
/* .line 16 */
/* invoke-super {p0, p1}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->a(Landroid/view/View;)V */
/* .line 17 */
com.google.android.material.bottomappbar.BottomAppBar .a ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 18 */
v0 = this.d;
(( com.google.android.material.floatingactionbutton.FloatingActionButton ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->a(Landroid/graphics/Rect;)Z
/* .line 19 */
v0 = (( android.widget.ImageButton ) p1 ).getMeasuredHeight ( ); // invoke-virtual {p1}, Landroid/widget/ImageButton;->getMeasuredHeight()I
v1 = this.d;
v1 = (( android.graphics.Rect ) v1 ).height ( ); // invoke-virtual {v1}, Landroid/graphics/Rect;->height()I
/* sub-int/2addr v0, v1 */
/* int-to-float v0, v0 */
/* .line 20 */
(( android.widget.ImageButton ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Landroid/widget/ImageButton;->clearAnimation()V
/* .line 21 */
(( android.widget.ImageButton ) p1 ).animate ( ); // invoke-virtual {p1}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;
/* .line 22 */
p1 = (( android.widget.ImageButton ) p1 ).getPaddingBottom ( ); // invoke-virtual {p1}, Landroid/widget/ImageButton;->getPaddingBottom()I
/* neg-int p1, p1 */
/* int-to-float p1, p1 */
/* add-float/2addr p1, v0 */
(( android.view.ViewPropertyAnimator ) v1 ).translationY ( p1 ); // invoke-virtual {v1, p1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;
v0 = e.f.a.c.j.a.b;
/* .line 23 */
(( android.view.ViewPropertyAnimator ) p1 ).setInterpolator ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;
/* const-wide/16 v0, 0xaf */
/* .line 24 */
(( android.view.ViewPropertyAnimator ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;
} // :cond_0
return;
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p2, Lcom/google/android/material/bottomappbar/BottomAppBar; */
p1 = (( com.google.android.material.bottomappbar.BottomAppBar$Behavior ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/bottomappbar/BottomAppBar;I)Z
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.bottomappbar.BottomAppBar p1, Integer p2 ) {
/* .locals 2 */
/* .line 6 */
com.google.android.material.bottomappbar.BottomAppBar .a ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 7 */
(( com.google.android.material.bottomappbar.BottomAppBar$Behavior ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->a(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Lcom/google/android/material/bottomappbar/BottomAppBar;)Z
/* .line 8 */
v1 = this.d;
(( com.google.android.material.floatingactionbutton.FloatingActionButton ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->b(Landroid/graphics/Rect;)V
/* .line 9 */
v0 = this.d;
v0 = (( android.graphics.Rect ) v0 ).height ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->height()I
(( com.google.android.material.bottomappbar.BottomAppBar ) p2 ).setFabDiameter ( v0 ); // invoke-virtual {p2, v0}, Lcom/google/android/material/bottomappbar/BottomAppBar;->setFabDiameter(I)V
/* .line 10 */
} // :cond_0
v0 = com.google.android.material.bottomappbar.BottomAppBar .b ( p2 );
/* if-nez v0, :cond_1 */
/* .line 11 */
com.google.android.material.bottomappbar.BottomAppBar .c ( p2 );
/* .line 12 */
} // :cond_1
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).d ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->d(Landroid/view/View;I)V
/* .line 13 */
p1 = /* invoke-super {p0, p1, p2, p3}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.bottomappbar.BottomAppBar p1, android.view.View p2, android.view.View p3, Integer p4, Integer p5 ) {
/* .locals 1 */
/* .line 14 */
v0 = (( com.google.android.material.bottomappbar.BottomAppBar ) p2 ).getHideOnScroll ( ); // invoke-virtual {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->getHideOnScroll()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 15 */
p1 = /* invoke-super/range {p0 ..p6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean a ( com.google.android.material.floatingactionbutton.FloatingActionButton p0, com.google.android.material.bottomappbar.BottomAppBar p1 ) {
/* .locals 2 */
/* .line 3 */
(( android.widget.ImageButton ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/widget/ImageButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
/* const/16 v1, 0x11 */
/* .line 4 */
/* iput v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d:I */
/* .line 5 */
com.google.android.material.bottomappbar.BottomAppBar .a ( p2,p1 );
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void b ( android.view.View p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Lcom/google/android/material/bottomappbar/BottomAppBar; */
(( com.google.android.material.bottomappbar.BottomAppBar$Behavior ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->b(Lcom/google/android/material/bottomappbar/BottomAppBar;)V
return;
} // .end method
public void b ( com.google.android.material.bottomappbar.BottomAppBar p0 ) {
/* .locals 2 */
/* .line 3 */
/* invoke-super {p0, p1}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->b(Landroid/view/View;)V */
/* .line 4 */
com.google.android.material.bottomappbar.BottomAppBar .a ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
(( android.widget.ImageButton ) v0 ).clearAnimation ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->clearAnimation()V
/* .line 6 */
(( android.widget.ImageButton ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;
/* .line 7 */
p1 = com.google.android.material.bottomappbar.BottomAppBar .d ( p1 );
(( android.view.ViewPropertyAnimator ) v0 ).translationY ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;
v0 = e.f.a.c.j.a.c;
/* .line 8 */
(( android.view.ViewPropertyAnimator ) p1 ).setInterpolator ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;
/* const-wide/16 v0, 0xe1 */
/* .line 9 */
(( android.view.ViewPropertyAnimator ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;
} // :cond_0
return;
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, android.view.View p3, Integer p4, Integer p5 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p2, Lcom/google/android/material/bottomappbar/BottomAppBar; */
p1 = /* invoke-virtual/range {p0 ..p6}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/bottomappbar/BottomAppBar;Landroid/view/View;Landroid/view/View;II)Z */
} // .end method
