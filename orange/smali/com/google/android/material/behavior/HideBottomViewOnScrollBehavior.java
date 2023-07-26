public class com.google.android.material.behavior.HideBottomViewOnScrollBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<V:", */
	 /* "Landroid/view/View;", */
	 /* ">", */
	 /* "Landroidx/coordinatorlayout/widget/CoordinatorLayout$b<", */
	 /* "TV;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public Integer a;
public Integer b;
public android.view.ViewPropertyAnimator c;
/* # direct methods */
public com.google.android.material.behavior.HideBottomViewOnScrollBehavior ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->a:I */
	 int v0 = 2; // const/4 v0, 0x2
	 /* .line 3 */
	 /* iput v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->b:I */
	 return;
} // .end method
public com.google.android.material.behavior.HideBottomViewOnScrollBehavior ( ) {
	 /* .locals 0 */
	 /* .line 4 */
	 /* invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 5 */
	 /* iput p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->a:I */
	 int p1 = 2; // const/4 p1, 0x2
	 /* .line 6 */
	 /* iput p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->b:I */
	 return;
} // .end method
public static android.view.ViewPropertyAnimator a ( com.google.android.material.behavior.HideBottomViewOnScrollBehavior p0, android.view.ViewPropertyAnimator p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 this.c = p1;
} // .end method
/* # virtual methods */
public void a ( android.view.View p0 ) {
	 /* .locals 7 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(TV;)V" */
	 /* } */
} // .end annotation
/* .line 8 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 9 */
	 (( android.view.ViewPropertyAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V
	 /* .line 10 */
	 (( android.view.View ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 11 */
/* iput v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->b:I */
/* .line 12 */
/* iget v3, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->a:I */
/* const-wide/16 v4, 0xaf */
v6 = e.f.a.c.j.a.b;
/* move-object v1, p0 */
/* move-object v2, p1 */
/* invoke-virtual/range {v1 ..v6}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->a(Landroid/view/View;IJLandroid/animation/TimeInterpolator;)V */
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Long p2, android.animation.TimeInterpolator p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TV;IJ", */
/* "Landroid/animation/TimeInterpolator;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 13 */
(( android.view.View ) p1 ).animate ( ); // invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
/* int-to-float p2, p2 */
/* .line 14 */
(( android.view.ViewPropertyAnimator ) p1 ).translationY ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;
/* .line 15 */
(( android.view.ViewPropertyAnimator ) p1 ).setInterpolator ( p5 ); // invoke-virtual {p1, p5}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;
/* .line 16 */
(( android.view.ViewPropertyAnimator ) p1 ).setDuration ( p3, p4 ); // invoke-virtual {p1, p3, p4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;
/* new-instance p2, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior$a; */
/* invoke-direct {p2, p0}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior$a;-><init>(Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;)V */
/* .line 17 */
(( android.view.ViewPropertyAnimator ) p1 ).setListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
this.c = p1;
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/View;", */
/* "IIII)V" */
/* } */
} // .end annotation
/* .line 4 */
/* iget p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->b:I */
int p3 = 1; // const/4 p3, 0x1
/* if-eq p1, p3, :cond_0 */
/* if-lez p5, :cond_0 */
/* .line 5 */
(( com.google.android.material.behavior.HideBottomViewOnScrollBehavior ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->a(Landroid/view/View;)V
/* .line 6 */
} // :cond_0
/* iget p1, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->b:I */
int p3 = 2; // const/4 p3, 0x2
/* if-eq p1, p3, :cond_1 */
/* if-gez p5, :cond_1 */
/* .line 7 */
(( com.google.android.material.behavior.HideBottomViewOnScrollBehavior ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->b(Landroid/view/View;)V
} // :cond_1
} // :goto_0
return;
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;I)Z" */
/* } */
} // .end annotation
/* .line 2 */
v0 = (( android.view.View ) p2 ).getMeasuredHeight ( ); // invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I
/* iput v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->a:I */
/* .line 3 */
p1 = /* invoke-super {p0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
} // .end method
public void b ( android.view.View p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TV;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.view.ViewPropertyAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V
/* .line 3 */
(( android.view.View ) p1 ).clearAnimation ( ); // invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V
} // :cond_0
int v0 = 2; // const/4 v0, 0x2
/* .line 4 */
/* iput v0, p0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->b:I */
int v3 = 0; // const/4 v3, 0x0
/* const-wide/16 v4, 0xe1 */
/* .line 5 */
v6 = e.f.a.c.j.a.c;
/* move-object v1, p0 */
/* move-object v2, p1 */
/* invoke-virtual/range {v1 ..v6}, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->a(Landroid/view/View;IJLandroid/animation/TimeInterpolator;)V */
return;
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, android.view.View p3, Integer p4 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/View;", */
/* "Landroid/view/View;", */
/* "I)Z" */
/* } */
} // .end annotation
int p1 = 2; // const/4 p1, 0x2
/* if-ne p5, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
