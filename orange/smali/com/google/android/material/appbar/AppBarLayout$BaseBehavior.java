public class com.google.android.material.appbar.AppBarLayout$BaseBehavior extends e.f.a.c.k.b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/appbar/AppBarLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "BaseBehavior" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;, */
/* Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b; */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Lcom/google/android/material/appbar/AppBarLayout;", */
/* ">", */
/* "Le/f/a/c/k/b<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* # instance fields */
public Integer k;
public Integer l;
public android.animation.ValueAnimator m;
public Integer n;
public Boolean o;
public Float p;
public java.lang.ref.WeakReference q;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public com.google.android.material.appbar.AppBarLayout$BaseBehavior$b r;
/* # direct methods */
public com.google.android.material.appbar.AppBarLayout$BaseBehavior ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Le/f/a/c/k/b;-><init>()V */
int v0 = -1; // const/4 v0, -0x1
/* .line 2 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->n:I */
return;
} // .end method
public com.google.android.material.appbar.AppBarLayout$BaseBehavior ( ) {
/* .locals 0 */
/* .line 3 */
/* invoke-direct {p0, p1, p2}, Le/f/a/c/k/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int p1 = -1; // const/4 p1, -0x1
/* .line 4 */
/* iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->n:I */
return;
} // .end method
public static Integer a ( com.google.android.material.appbar.AppBarLayout$BaseBehavior p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget p0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->k:I */
} // .end method
public static Boolean a ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* and-int/2addr p0, p1 */
/* if-ne p0, p1, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static android.view.View c ( com.google.android.material.appbar.AppBarLayout p0, Integer p1 ) {
/* .locals 4 */
/* .line 10 */
p1 = java.lang.Math .abs ( p1 );
/* .line 11 */
v0 = (( android.widget.LinearLayout ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/widget/LinearLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 12 */
(( android.widget.LinearLayout ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 13 */
v3 = (( android.view.View ) v2 ).getTop ( ); // invoke-virtual {v2}, Landroid/view/View;->getTop()I
/* if-lt p1, v3, :cond_0 */
v3 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
/* if-gt p1, v3, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public Integer a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;III)I" */
/* } */
} // .end annotation
/* .line 88 */
v0 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->d()I
int v1 = 0; // const/4 v1, 0x0
if ( p4 != null) { // if-eqz p4, :cond_3
/* if-lt v0, p4, :cond_3 */
/* if-gt v0, p5, :cond_3 */
/* .line 89 */
v5 = c.h.i.a .a ( p3,p4,p5 );
/* if-eq v0, v5, :cond_4 */
/* .line 90 */
p3 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).a ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->a()Z
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 91 */
p3 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).b ( p2, v5 ); // invoke-virtual {p0, p2, v5}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->b(Lcom/google/android/material/appbar/AppBarLayout;I)I
} // :cond_0
/* move p3, v5 */
/* .line 92 */
} // :goto_0
p4 = (( e.f.a.c.k.d ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Le/f/a/c/k/d;->a(I)Z
/* sub-int v1, v0, v5 */
/* sub-int p3, v5, p3 */
/* .line 93 */
/* iput p3, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->k:I */
/* if-nez p4, :cond_1 */
/* .line 94 */
p3 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).a ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->a()Z
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 95 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;)V
/* .line 96 */
} // :cond_1
p3 = (( e.f.a.c.k.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/k/d;->b()I
(( com.google.android.material.appbar.AppBarLayout ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lcom/google/android/material/appbar/AppBarLayout;->a(I)V
/* if-ge v5, v0, :cond_2 */
int p3 = -1; // const/4 p3, -0x1
int v6 = -1; // const/4 v6, -0x1
} // :cond_2
int p3 = 1; // const/4 p3, 0x1
int v6 = 1; // const/4 v6, 0x1
} // :goto_1
int v7 = 0; // const/4 v7, 0x0
/* move-object v2, p0 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* .line 97 */
/* invoke-virtual/range {v2 ..v7}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;IIZ)V */
/* .line 98 */
} // :cond_3
/* iput v1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->k:I */
} // :cond_4
} // :goto_2
} // .end method
public final Integer a ( com.google.android.material.appbar.AppBarLayout p0, Integer p1 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;I)I" */
/* } */
} // .end annotation
/* .line 47 */
v0 = (( android.widget.LinearLayout ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/widget/LinearLayout;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 48 */
(( android.widget.LinearLayout ) p1 ).getChildAt ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 49 */
v3 = (( android.view.View ) v2 ).getTop ( ); // invoke-virtual {v2}, Landroid/view/View;->getTop()I
/* .line 50 */
v4 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
/* .line 51 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* .line 52 */
v5 = (( com.google.android.material.appbar.AppBarLayout$c ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/google/android/material/appbar/AppBarLayout$c;->a()I
/* const/16 v6, 0x20 */
v5 = com.google.android.material.appbar.AppBarLayout$BaseBehavior .a ( v5,v6 );
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 53 */
/* iget v5, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* sub-int/2addr v3, v5 */
/* .line 54 */
/* iget v2, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v4, v2 */
} // :cond_0
/* neg-int v2, p2 */
/* if-gt v3, v2, :cond_1 */
/* if-lt v4, v2, :cond_1 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
int p1 = -1; // const/4 p1, -0x1
} // .end method
public final android.view.View a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0 ) {
/* .locals 4 */
/* .line 112 */
v0 = (( android.view.ViewGroup ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 113 */
(( android.view.ViewGroup ) p1 ).getChildAt ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 114 */
/* instance-of v3, v2, Lc/h/n/r; */
if ( v3 != null) { // if-eqz v3, :cond_0
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void a ( Integer p0, com.google.android.material.appbar.AppBarLayout p1, android.view.View p2, Integer p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(ITT;", */
/* "Landroid/view/View;", */
/* "I)V" */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* if-ne p4, v0, :cond_2 */
/* .line 25 */
p4 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->d()I
/* if-gez p1, :cond_0 */
if ( p4 != null) { // if-eqz p4, :cond_1
} // :cond_0
/* if-lez p1, :cond_2 */
/* .line 26 */
p1 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getDownNestedScrollRange ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedScrollRange()I
/* neg-int p1, p1 */
/* if-ne p4, p1, :cond_2 */
/* .line 27 */
} // :cond_1
c.h.n.v0 .i ( p3,v0 );
} // :cond_2
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.os.Parcelable p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 7 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/os/Parcelable;)V
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, Integer p3 ) { //bridge//synthethic
/* .locals 0 */
/* .line 8 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;I)V
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7 ) { //bridge//synthethic
/* .locals 0 */
/* .line 6 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
/* invoke-virtual/range {p0 ..p8}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;IIIII)V */
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, Integer p3, Integer p4, Integer[] p5, Integer p6 ) { //bridge//synthethic
/* .locals 0 */
/* .line 5 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
/* invoke-virtual/range {p0 ..p7}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;II[II)V */
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;)V" */
/* } */
} // .end annotation
/* .line 87 */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->d(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V
return;
} // .end method
public final void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, Integer p2, Float p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;IF)V" */
/* } */
} // .end annotation
/* .line 31 */
v0 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->d()I
/* sub-int/2addr v0, p3 */
v0 = java.lang.Math .abs ( v0 );
/* .line 32 */
p4 = java.lang.Math .abs ( p4 );
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, p4, v1 */
/* if-lez v1, :cond_0 */
/* const/high16 v1, 0x447a0000 # 1000.0f */
/* int-to-float v0, v0 */
/* div-float/2addr v0, p4 */
/* mul-float v0, v0, v1 */
/* .line 33 */
p4 = java.lang.Math .round ( v0 );
/* mul-int/lit8 p4, p4, 0x3 */
} // :cond_0
/* int-to-float p4, v0 */
/* .line 34 */
v0 = (( android.widget.LinearLayout ) p2 ).getHeight ( ); // invoke-virtual {p2}, Landroid/widget/LinearLayout;->getHeight()I
/* int-to-float v0, v0 */
/* div-float/2addr p4, v0 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* add-float/2addr p4, v0 */
/* const/high16 v0, 0x43160000 # 150.0f */
/* mul-float p4, p4, v0 */
/* float-to-int p4, p4 */
/* .line 35 */
} // :goto_0
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;II)V
return;
} // .end method
public final void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;II)V" */
/* } */
} // .end annotation
/* .line 36 */
v0 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->d()I
/* if-ne v0, p3, :cond_1 */
/* .line 37 */
p1 = this.m;
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = (( android.animation.ValueAnimator ) p1 ).isRunning ( ); // invoke-virtual {p1}, Landroid/animation/ValueAnimator;->isRunning()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 38 */
p1 = this.m;
(( android.animation.ValueAnimator ) p1 ).cancel ( ); // invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V
} // :cond_0
return;
/* .line 39 */
} // :cond_1
v1 = this.m;
/* if-nez v1, :cond_2 */
/* .line 40 */
/* new-instance v1, Landroid/animation/ValueAnimator; */
/* invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V */
this.m = v1;
/* .line 41 */
v2 = e.f.a.c.j.a.d;
(( android.animation.ValueAnimator ) v1 ).setInterpolator ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V
/* .line 42 */
v1 = this.m;
/* new-instance v2, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$a; */
/* invoke-direct {v2, p0, p1, p2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$a;-><init>(Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V */
(( android.animation.ValueAnimator ) v1 ).addUpdateListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
/* .line 43 */
} // :cond_2
(( android.animation.ValueAnimator ) v1 ).cancel ( ); // invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V
/* .line 44 */
} // :goto_0
p1 = this.m;
/* const/16 p2, 0x258 */
p2 = java.lang.Math .min ( p4,p2 );
/* int-to-long v1, p2 */
(( android.animation.ValueAnimator ) p1 ).setDuration ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;
/* .line 45 */
p1 = this.m;
int p2 = 2; // const/4 p2, 0x2
/* new-array p2, p2, [I */
int p4 = 0; // const/4 p4, 0x0
/* aput v0, p2, p4 */
int p4 = 1; // const/4 p4, 0x1
/* aput p3, p2, p4 */
(( android.animation.ValueAnimator ) p1 ).setIntValues ( p2 ); // invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setIntValues([I)V
/* .line 46 */
p1 = this.m;
(( android.animation.ValueAnimator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V
return;
} // .end method
public final void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, Integer p2, Integer p3, Boolean p4 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;IIZ)V" */
/* } */
} // .end annotation
/* .line 99 */
com.google.android.material.appbar.AppBarLayout$BaseBehavior .c ( p2,p3 );
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 100 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v1, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* .line 101 */
v1 = (( com.google.android.material.appbar.AppBarLayout$c ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/android/material/appbar/AppBarLayout$c;->a()I
/* and-int/lit8 v2, v1, 0x1 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 102 */
v2 = c.h.n.v0 .p ( v0 );
/* if-lez p4, :cond_0 */
/* and-int/lit8 p4, v1, 0xc */
if ( p4 != null) { // if-eqz p4, :cond_0
/* neg-int p3, p3 */
/* .line 103 */
p4 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* sub-int/2addr p4, v2 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getTopInset ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
/* sub-int/2addr p4, v0 */
/* if-lt p3, p4, :cond_1 */
} // :goto_0
int p3 = 1; // const/4 p3, 0x1
} // :cond_0
/* and-int/lit8 p4, v1, 0x2 */
if ( p4 != null) { // if-eqz p4, :cond_1
/* neg-int p3, p3 */
/* .line 104 */
p4 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* sub-int/2addr p4, v2 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getTopInset ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
/* sub-int/2addr p4, v0 */
/* if-lt p3, p4, :cond_1 */
} // :cond_1
int p3 = 0; // const/4 p3, 0x0
/* .line 105 */
} // :goto_1
p4 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).e ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->e()Z
if ( p4 != null) { // if-eqz p4, :cond_3
/* .line 106 */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;
if ( p4 != null) { // if-eqz p4, :cond_3
/* .line 107 */
p3 = (( android.view.View ) p4 ).getScrollY ( ); // invoke-virtual {p4}, Landroid/view/View;->getScrollY()I
/* if-lez p3, :cond_2 */
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
/* move p3, v3 */
/* .line 108 */
} // :cond_3
p3 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lcom/google/android/material/appbar/AppBarLayout;->b(Z)Z
/* .line 109 */
/* const/16 v0, 0xb */
/* if-lt p4, v0, :cond_5 */
/* if-nez p5, :cond_4 */
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 110 */
p1 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->c(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)Z
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 111 */
} // :cond_4
(( android.widget.LinearLayout ) p2 ).jumpDrawablesToCurrentState ( ); // invoke-virtual {p2}, Landroid/widget/LinearLayout;->jumpDrawablesToCurrentState()V
} // :cond_5
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, android.os.Parcelable p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;", */
/* "Landroid/os/Parcelable;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 115 */
/* instance-of v0, p3, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 116 */
/* check-cast p3, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c; */
/* .line 117 */
(( c.j.a.c ) p3 ).a ( ); // invoke-virtual {p3}, Lc/j/a/c;->a()Landroid/os/Parcelable;
/* invoke-super {p0, p1, p2, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V */
/* .line 118 */
/* iget p1, p3, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->d:I */
/* iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->n:I */
/* .line 119 */
/* iget p1, p3, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->e:F */
/* iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->p:F */
/* .line 120 */
/* iget-boolean p1, p3, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->f:Z */
/* iput-boolean p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->o:Z */
/* .line 121 */
} // :cond_0
/* invoke-super {p0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V */
int p1 = -1; // const/4 p1, -0x1
/* .line 122 */
/* iput p1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->n:I */
} // :goto_0
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, android.view.View p2, Integer p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;", */
/* "Landroid/view/View;", */
/* "I)V" */
/* } */
} // .end annotation
/* .line 28 */
/* iget v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:I */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* if-ne p4, v0, :cond_1 */
/* .line 29 */
} // :cond_0
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->d(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V
/* .line 30 */
} // :cond_1
/* new-instance p1, Ljava/lang/ref/WeakReference; */
/* invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.q = p1;
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, android.view.View p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;", */
/* "Landroid/view/View;", */
/* "IIIII)V" */
/* } */
} // .end annotation
/* if-gez p7, :cond_0 */
/* .line 21 */
p4 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getDownNestedScrollRange ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedScrollRange()I
/* neg-int v4, p4 */
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move v3, p7 */
/* invoke-virtual/range {v0 ..v5}, Le/f/a/c/k/b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I */
/* .line 22 */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p7, p2, p3, p8 ); // invoke-virtual {p0, p7, p2, p3, p8}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(ILcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;I)V
/* .line 23 */
} // :cond_0
p1 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).e ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->e()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 24 */
p1 = (( android.view.View ) p3 ).getScrollY ( ); // invoke-virtual {p3}, Landroid/view/View;->getScrollY()I
/* if-lez p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( com.google.android.material.appbar.AppBarLayout ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Lcom/google/android/material/appbar/AppBarLayout;->b(Z)Z
} // :cond_2
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, android.view.View p2, Integer p3, Integer p4, Integer[] p5, Integer p6 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;", */
/* "Landroid/view/View;", */
/* "II[II)V" */
/* } */
} // .end annotation
if ( p5 != null) { // if-eqz p5, :cond_1
/* if-gez p5, :cond_0 */
/* .line 16 */
p4 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getTotalScrollRange ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I
/* neg-int p4, p4 */
/* .line 17 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getDownNestedPreScrollRange ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedPreScrollRange()I
/* add-int/2addr v0, p4 */
/* move v5, p4 */
/* move v6, v0 */
/* .line 18 */
} // :cond_0
p4 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getUpNestedPreScrollRange ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getUpNestedPreScrollRange()I
/* neg-int p4, p4 */
int v0 = 0; // const/4 v0, 0x0
/* move v5, p4 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-eq v5, v6, :cond_1 */
int p4 = 1; // const/4 p4, 0x1
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move v4, p5 */
/* .line 19 */
p1 = /* invoke-virtual/range {v1 ..v6}, Le/f/a/c/k/b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I */
/* aput p1, p6, p4 */
/* .line 20 */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p5, p2, p3, p7 ); // invoke-virtual {p0, p5, p2, p3, p7}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(ILcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;I)V
} // :cond_1
return;
} // .end method
public Boolean a ( android.view.View p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Lcom/google/android/material/appbar/AppBarLayout; */
p1 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Lcom/google/android/material/appbar/AppBarLayout;)Z
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 3 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
p1 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;I)Z
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2, Integer p3, Integer p4, Integer p5 ) { //bridge//synthethic
/* .locals 0 */
/* .line 4 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
p1 = /* invoke-virtual/range {p0 ..p6}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;IIII)Z */
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, Integer p2 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;I)Z" */
/* } */
} // .end annotation
/* .line 60 */
p3 = /* invoke-super {p0, p1, p2, p3}, Le/f/a/c/k/d;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
/* .line 61 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getPendingAction ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getPendingAction()I
/* .line 62 */
/* iget v1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->n:I */
int v2 = 0; // const/4 v2, 0x0
/* if-ltz v1, :cond_1 */
/* and-int/lit8 v3, v0, 0x8 */
/* if-nez v3, :cond_1 */
/* .line 63 */
(( android.widget.LinearLayout ) p2 ).getChildAt ( v1 ); // invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 64 */
v1 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* neg-int v1, v1 */
/* .line 65 */
/* iget-boolean v3, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->o:Z */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 66 */
v0 = c.h.n.v0 .p ( v0 );
v3 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getTopInset ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
/* add-int/2addr v0, v3 */
/* .line 67 */
} // :cond_0
v0 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
/* int-to-float v0, v0 */
/* iget v3, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->p:F */
/* mul-float v0, v0, v3 */
v0 = java.lang.Math .round ( v0 );
} // :goto_0
/* add-int/2addr v1, v0 */
/* .line 68 */
(( e.f.a.c.k.b ) p0 ).c ( p1, p2, v1 ); // invoke-virtual {p0, p1, p2, v1}, Le/f/a/c/k/b;->c(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)I
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_6
/* and-int/lit8 v1, v0, 0x4 */
int v3 = 1; // const/4 v3, 0x1
if ( v1 != null) { // if-eqz v1, :cond_2
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* and-int/lit8 v4, v0, 0x2 */
int v5 = 0; // const/4 v5, 0x0
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 69 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getUpNestedPreScrollRange ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getUpNestedPreScrollRange()I
/* neg-int v0, v0 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 70 */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1, p2, v0, v5 ); // invoke-virtual {p0, p1, p2, v0, v5}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;IF)V
/* .line 71 */
} // :cond_3
(( e.f.a.c.k.b ) p0 ).c ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/f/a/c/k/b;->c(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)I
} // :cond_4
/* and-int/2addr v0, v3 */
if ( v0 != null) { // if-eqz v0, :cond_6
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 72 */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1, p2, v2, v5 ); // invoke-virtual {p0, p1, p2, v2, v5}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;IF)V
/* .line 73 */
} // :cond_5
(( e.f.a.c.k.b ) p0 ).c ( p1, p2, v2 ); // invoke-virtual {p0, p1, p2, v2}, Le/f/a/c/k/b;->c(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)I
/* .line 74 */
} // :cond_6
} // :goto_2
(( com.google.android.material.appbar.AppBarLayout ) p2 ).f ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->f()V
int v0 = -1; // const/4 v0, -0x1
/* .line 75 */
/* iput v0, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->n:I */
/* .line 76 */
v0 = (( e.f.a.c.k.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/k/d;->b()I
v1 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getTotalScrollRange ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I
/* neg-int v1, v1 */
v0 = c.h.i.a .a ( v0,v1,v2 );
/* .line 77 */
(( e.f.a.c.k.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/c/k/d;->a(I)Z
/* .line 78 */
v4 = (( e.f.a.c.k.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/k/d;->b()I
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* .line 79 */
/* invoke-virtual/range {v1 ..v6}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;IIZ)V */
/* .line 80 */
p1 = (( e.f.a.c.k.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/k/d;->b()I
(( com.google.android.material.appbar.AppBarLayout ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lcom/google/android/material/appbar/AppBarLayout;->a(I)V
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;IIII)Z" */
/* } */
} // .end annotation
/* .line 55 */
(( android.widget.LinearLayout ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
/* .line 56 */
/* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
int v1 = -2; // const/4 v1, -0x2
/* if-ne v0, v1, :cond_0 */
int p5 = 0; // const/4 p5, 0x0
/* .line 57 */
v4 = android.view.View$MeasureSpec .makeMeasureSpec ( p5,p5 );
/* move-object v0, p1 */
/* move-object v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v5, p6 */
/* .line 58 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;IIII)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 59 */
} // :cond_0
p1 = /* invoke-super/range {p0 ..p6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;IIII)Z */
} // .end method
public final Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, android.view.View p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;", */
/* "Landroid/view/View;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 14 */
v0 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 15 */
p1 = (( android.view.ViewGroup ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I
p3 = (( android.view.View ) p3 ).getHeight ( ); // invoke-virtual {p3}, Landroid/view/View;->getHeight()I
/* sub-int/2addr p1, p3 */
p2 = (( android.widget.LinearLayout ) p2 ).getHeight ( ); // invoke-virtual {p2}, Landroid/widget/LinearLayout;->getHeight()I
/* if-gt p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1, android.view.View p2, android.view.View p3, Integer p4, Integer p5 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;", */
/* "Landroid/view/View;", */
/* "Landroid/view/View;", */
/* "II)Z" */
/* } */
} // .end annotation
/* and-int/lit8 p4, p5, 0x2 */
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 9 */
p4 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).e ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->e()Z
/* if-nez p4, :cond_0 */
p1 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 10 */
p2 = this.m;
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 11 */
(( android.animation.ValueAnimator ) p2 ).cancel ( ); // invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V
} // :cond_2
int p2 = 0; // const/4 p2, 0x0
/* .line 12 */
this.q = p2;
/* .line 13 */
/* iput p6, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->l:I */
} // .end method
public Boolean a ( com.google.android.material.appbar.AppBarLayout p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)Z" */
/* } */
} // .end annotation
/* .line 81 */
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 82 */
p1 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior$b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$b;->a(Lcom/google/android/material/appbar/AppBarLayout;)Z
/* .line 83 */
} // :cond_0
p1 = this.q;
int v0 = 1; // const/4 v0, 0x1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 84 */
(( java.lang.ref.WeakReference ) p1 ).get ( ); // invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast p1, Landroid/view/View; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 85 */
v1 = (( android.view.View ) p1 ).isShown ( ); // invoke-virtual {p1}, Landroid/view/View;->isShown()Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v1 = -1; // const/4 v1, -0x1
/* .line 86 */
p1 = (( android.view.View ) p1 ).canScrollVertically ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/View;->canScrollVertically(I)Z
/* if-nez p1, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
} // :goto_0
} // .end method
public Integer b ( android.view.View p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Lcom/google/android/material/appbar/AppBarLayout; */
p1 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->b(Lcom/google/android/material/appbar/AppBarLayout;)I
} // .end method
public Integer b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2, Integer p3, Integer p4 ) { //bridge//synthethic
/* .locals 0 */
/* .line 3 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
p1 = /* invoke-virtual/range {p0 ..p5}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;III)I */
} // .end method
public Integer b ( com.google.android.material.appbar.AppBarLayout p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)I" */
/* } */
} // .end annotation
/* .line 4 */
p1 = (( com.google.android.material.appbar.AppBarLayout ) p1 ).getDownNestedScrollRange ( ); // invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedScrollRange()I
/* neg-int p1, p1 */
} // .end method
public final Integer b ( com.google.android.material.appbar.AppBarLayout p0, Integer p1 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;I)I" */
/* } */
} // .end annotation
/* .line 5 */
v0 = java.lang.Math .abs ( p2 );
/* .line 6 */
v1 = (( android.widget.LinearLayout ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/widget/LinearLayout;->getChildCount()I
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_3 */
/* .line 7 */
(( android.widget.LinearLayout ) p1 ).getChildAt ( v3 ); // invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 8 */
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v5, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* .line 9 */
(( com.google.android.material.appbar.AppBarLayout$c ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/google/android/material/appbar/AppBarLayout$c;->b()Landroid/view/animation/Interpolator;
/* .line 10 */
v7 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
/* if-lt v0, v7, :cond_2 */
v7 = (( android.view.View ) v4 ).getBottom ( ); // invoke-virtual {v4}, Landroid/view/View;->getBottom()I
/* if-gt v0, v7, :cond_2 */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 11 */
v1 = (( com.google.android.material.appbar.AppBarLayout$c ) v5 ).a ( ); // invoke-virtual {v5}, Lcom/google/android/material/appbar/AppBarLayout$c;->a()I
/* and-int/lit8 v3, v1, 0x1 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 12 */
v3 = (( android.view.View ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getHeight()I
/* iget v7, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v3, v7 */
/* iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* add-int/2addr v3, v5 */
/* add-int/2addr v2, v3 */
/* and-int/lit8 v1, v1, 0x2 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 13 */
v1 = c.h.n.v0 .p ( v4 );
/* sub-int/2addr v2, v1 */
/* .line 14 */
} // :cond_0
v1 = c.h.n.v0 .l ( v4 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 15 */
p1 = (( com.google.android.material.appbar.AppBarLayout ) p1 ).getTopInset ( ); // invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
/* sub-int/2addr v2, p1 */
} // :cond_1
/* if-lez v2, :cond_3 */
/* .line 16 */
p1 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
/* sub-int/2addr v0, p1 */
/* int-to-float p1, v2 */
/* int-to-float v0, v0 */
/* div-float/2addr v0, p1 */
v0 = /* .line 17 */
/* mul-float p1, p1, v0 */
/* .line 18 */
p1 = java.lang.Math .round ( p1 );
/* .line 19 */
p2 = java.lang.Integer .signum ( p2 );
v0 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
/* add-int/2addr v0, p1 */
/* mul-int p2, p2, v0 */
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
} // .end method
public android.os.Parcelable b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;)", */
/* "Landroid/os/Parcelable;" */
/* } */
} // .end annotation
/* .line 20 */
/* invoke-super {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->d(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable; */
/* .line 21 */
v0 = (( e.f.a.c.k.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/k/d;->b()I
/* .line 22 */
v1 = (( android.widget.LinearLayout ) p2 ).getChildCount ( ); // invoke-virtual {p2}, Landroid/widget/LinearLayout;->getChildCount()I
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_2 */
/* .line 23 */
(( android.widget.LinearLayout ) p2 ).getChildAt ( v3 ); // invoke-virtual {p2, v3}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 24 */
v5 = (( android.view.View ) v4 ).getBottom ( ); // invoke-virtual {v4}, Landroid/view/View;->getBottom()I
/* add-int/2addr v5, v0 */
/* .line 25 */
v6 = (( android.view.View ) v4 ).getTop ( ); // invoke-virtual {v4}, Landroid/view/View;->getTop()I
/* add-int/2addr v6, v0 */
/* if-gtz v6, :cond_1 */
/* if-ltz v5, :cond_1 */
/* .line 26 */
/* new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c; */
/* invoke-direct {v0, p1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;-><init>(Landroid/os/Parcelable;)V */
/* .line 27 */
/* iput v3, v0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->d:I */
/* .line 28 */
p1 = c.h.n.v0 .p ( v4 );
p2 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getTopInset ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
/* add-int/2addr p1, p2 */
/* if-ne v5, p1, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
/* iput-boolean v2, v0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->f:Z */
/* int-to-float p1, v5 */
/* .line 29 */
p2 = (( android.view.View ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/view/View;->getHeight()I
/* int-to-float p2, p2 */
/* div-float/2addr p1, p2 */
/* iput p1, v0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior$c;->e:F */
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, android.view.View p3, Integer p4, Integer p5 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
p1 = /* invoke-virtual/range {p0 ..p6}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/view/View;Landroid/view/View;II)Z */
} // .end method
public Integer c ( android.view.View p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Lcom/google/android/material/appbar/AppBarLayout; */
p1 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->c(Lcom/google/android/material/appbar/AppBarLayout;)I
} // .end method
public Integer c ( com.google.android.material.appbar.AppBarLayout p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)I" */
/* } */
} // .end annotation
/* .line 2 */
p1 = (( com.google.android.material.appbar.AppBarLayout ) p1 ).getTotalScrollRange ( ); // invoke-virtual {p1}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I
} // .end method
public final Boolean c ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;)Z" */
/* } */
} // .end annotation
/* .line 3 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).c ( p2 ); // invoke-virtual {p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->c(Landroid/view/View;)Ljava/util/List;
p2 = /* .line 4 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p2, :cond_2 */
/* .line 5 */
/* check-cast v2, Landroid/view/View; */
/* .line 6 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
/* .line 7 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) v2 ).d ( ); // invoke-virtual {v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->d()Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;
/* .line 8 */
/* instance-of v3, v2, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 9 */
/* check-cast v2, Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior; */
p1 = (( e.f.a.c.k.c ) v2 ).c ( ); // invoke-virtual {v2}, Le/f/a/c/k/c;->c()I
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
} // .end method
public Integer d ( ) {
/* .locals 2 */
/* .line 21 */
v0 = (( e.f.a.c.k.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/c/k/d;->b()I
/* iget v1, p0, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->k:I */
/* add-int/2addr v0, v1 */
} // .end method
public android.os.Parcelable d ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)Landroid/os/Parcelable;
} // .end method
public final void d ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, com.google.android.material.appbar.AppBarLayout p1 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TT;)V" */
/* } */
} // .end annotation
/* .line 2 */
v0 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->d()I
/* .line 3 */
v1 = (( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Lcom/google/android/material/appbar/AppBarLayout;I)I
/* if-ltz v1, :cond_6 */
/* .line 4 */
(( android.widget.LinearLayout ) p2 ).getChildAt ( v1 ); // invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
/* .line 5 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Lcom/google/android/material/appbar/AppBarLayout$c; */
/* .line 6 */
v4 = (( com.google.android.material.appbar.AppBarLayout$c ) v3 ).a ( ); // invoke-virtual {v3}, Lcom/google/android/material/appbar/AppBarLayout$c;->a()I
/* and-int/lit8 v5, v4, 0x11 */
/* const/16 v6, 0x11 */
/* if-ne v5, v6, :cond_6 */
/* .line 7 */
v5 = (( android.view.View ) v2 ).getTop ( ); // invoke-virtual {v2}, Landroid/view/View;->getTop()I
/* neg-int v5, v5 */
/* .line 8 */
v6 = (( android.view.View ) v2 ).getBottom ( ); // invoke-virtual {v2}, Landroid/view/View;->getBottom()I
/* neg-int v6, v6 */
/* .line 9 */
v7 = (( android.widget.LinearLayout ) p2 ).getChildCount ( ); // invoke-virtual {p2}, Landroid/widget/LinearLayout;->getChildCount()I
/* add-int/lit8 v7, v7, -0x1 */
/* if-ne v1, v7, :cond_0 */
/* .line 10 */
v1 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getTopInset ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I
/* add-int/2addr v6, v1 */
} // :cond_0
int v1 = 2; // const/4 v1, 0x2
/* .line 11 */
v7 = com.google.android.material.appbar.AppBarLayout$BaseBehavior .a ( v4,v1 );
if ( v7 != null) { // if-eqz v7, :cond_1
/* .line 12 */
v2 = c.h.n.v0 .p ( v2 );
/* add-int/2addr v6, v2 */
} // :cond_1
int v7 = 5; // const/4 v7, 0x5
/* .line 13 */
v7 = com.google.android.material.appbar.AppBarLayout$BaseBehavior .a ( v4,v7 );
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 14 */
v2 = c.h.n.v0 .p ( v2 );
/* add-int/2addr v2, v6 */
/* if-ge v0, v2, :cond_2 */
/* move v5, v2 */
} // :cond_2
/* move v6, v2 */
} // :cond_3
} // :goto_0
/* const/16 v2, 0x20 */
/* .line 15 */
v2 = com.google.android.material.appbar.AppBarLayout$BaseBehavior .a ( v4,v2 );
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 16 */
/* iget v2, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I */
/* add-int/2addr v5, v2 */
/* .line 17 */
/* iget v2, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I */
/* sub-int/2addr v6, v2 */
} // :cond_4
/* add-int v2, v6, v5 */
/* .line 18 */
/* div-int/2addr v2, v1 */
/* if-ge v0, v2, :cond_5 */
/* move v5, v6 */
/* .line 19 */
} // :cond_5
v0 = (( com.google.android.material.appbar.AppBarLayout ) p2 ).getTotalScrollRange ( ); // invoke-virtual {p2}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I
/* neg-int v0, v0 */
int v1 = 0; // const/4 v1, 0x0
v0 = c.h.i.a .a ( v5,v0,v1 );
int v1 = 0; // const/4 v1, 0x0
/* .line 20 */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;IF)V
} // :cond_6
return;
} // .end method
public void e ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p2, Lcom/google/android/material/appbar/AppBarLayout; */
(( com.google.android.material.appbar.AppBarLayout$BaseBehavior ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V
return;
} // .end method
