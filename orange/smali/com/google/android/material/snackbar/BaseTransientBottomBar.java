public abstract class com.google.android.material.snackbar.BaseTransientBottomBar {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/android/material/snackbar/BaseTransientBottomBar$a;, */
	 /* Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;, */
	 /* Lcom/google/android/material/snackbar/BaseTransientBottomBar$b; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<B:", */
/* "Lcom/google/android/material/snackbar/BaseTransientBottomBar<", */
/* "TB;>;>", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* # static fields */
public static final android.os.Handler j;
public static final Boolean k;
public static final l;
/* # instance fields */
public final android.view.ViewGroup a;
public final android.content.Context b;
public final com.google.android.material.snackbar.BaseTransientBottomBar$b c;
public final e.f.a.c.s.q d;
public Integer e;
public java.util.List f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/f/a/c/s/m<", */
/* "TB;>;>;" */
/* } */
} // .end annotation
} // .end field
public com.google.android.material.snackbar.BaseTransientBottomBar$Behavior g;
public final android.view.accessibility.AccessibilityManager h;
public final e.f.a.c.s.t i;
/* # direct methods */
public static com.google.android.material.snackbar.BaseTransientBottomBar ( ) {
/* .locals 4 */
/* .line 1 */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x10 */
/* if-lt v0, v3, :cond_0 */
/* const/16 v3, 0x13 */
/* if-gt v0, v3, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
com.google.android.material.snackbar.BaseTransientBottomBar.k = (v0!= 0);
/* new-array v0, v1, [I */
/* .line 2 */
/* aput v1, v0, v2 */
/* .line 3 */
/* new-instance v0, Landroid/os/Handler; */
/* .line 4 */
android.os.Looper .getMainLooper ( );
/* new-instance v2, Le/f/a/c/s/c; */
/* invoke-direct {v2}, Le/f/a/c/s/c;-><init>()V */
/* invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V */
return;
} // .end method
public com.google.android.material.snackbar.BaseTransientBottomBar ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Le/f/a/c/s/f; */
/* invoke-direct {v0, p0}, Le/f/a/c/s/f;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V */
this.i = v0;
if ( p1 != null) { // if-eqz p1, :cond_2
if ( p2 != null) { // if-eqz p2, :cond_1
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 3 */
this.a = p1;
/* .line 4 */
this.d = p3;
/* .line 5 */
(( android.view.ViewGroup ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
this.b = p1;
/* .line 6 */
e.f.a.c.p.c .a ( p1 );
/* .line 7 */
p1 = this.b;
android.view.LayoutInflater .from ( p1 );
/* .line 8 */
p3 = (( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->f()I
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.view.LayoutInflater ) p1 ).inflate ( p3, v0, v1 ); // invoke-virtual {p1, p3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* check-cast p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b; */
this.c = p1;
/* .line 9 */
(( android.widget.FrameLayout ) p1 ).addView ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 10 */
p1 = this.c;
int p2 = 1; // const/4 p2, 0x1
c.h.n.v0 .f ( p1,p2 );
/* .line 11 */
p1 = this.c;
c.h.n.v0 .g ( p1,p2 );
/* .line 12 */
p1 = this.c;
c.h.n.v0 .a ( p1,p2 );
/* .line 13 */
p1 = this.c;
/* new-instance p2, Le/f/a/c/s/d; */
/* invoke-direct {p2, p0}, Le/f/a/c/s/d;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V */
c.h.n.v0 .a ( p1,p2 );
/* .line 14 */
p1 = this.c;
/* new-instance p2, Le/f/a/c/s/e; */
/* invoke-direct {p2, p0}, Le/f/a/c/s/e;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V */
c.h.n.v0 .a ( p1,p2 );
/* .line 15 */
p1 = this.b;
final String p2 = "accessibility"; // const-string p2, "accessibility"
/* .line 16 */
(( android.content.Context ) p1 ).getSystemService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/view/accessibility/AccessibilityManager; */
this.h = p1;
return;
/* .line 17 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Transient bottom bar must have non-null callback"; // const-string p2, "Transient bottom bar must have non-null callback"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 18 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Transient bottom bar must have non-null content"; // const-string p2, "Transient bottom bar must have non-null content"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 19 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Transient bottom bar must have non-null parent"; // const-string p2, "Transient bottom bar must have non-null parent"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public static e.f.a.c.s.q a ( com.google.android.material.snackbar.BaseTransientBottomBar p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.d;
} // .end method
public static Boolean n ( ) { //synthethic
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->k:Z */
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 5 */
/* .line 2 */
v0 = (( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).g ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g()I
/* .line 3 */
/* sget-boolean v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->k:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
v1 = this.c;
c.h.n.v0 .e ( v1,v0 );
/* .line 5 */
} // :cond_0
v1 = this.c;
/* int-to-float v2, v0 */
(( android.widget.FrameLayout ) v1 ).setTranslationY ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setTranslationY(F)V
/* .line 6 */
} // :goto_0
/* new-instance v1, Landroid/animation/ValueAnimator; */
/* invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [I */
int v3 = 0; // const/4 v3, 0x0
/* aput v0, v2, v3 */
int v4 = 1; // const/4 v4, 0x1
/* aput v3, v2, v4 */
/* .line 7 */
(( android.animation.ValueAnimator ) v1 ).setIntValues ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setIntValues([I)V
/* .line 8 */
v2 = e.f.a.c.j.a.a;
(( android.animation.ValueAnimator ) v1 ).setInterpolator ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V
/* const-wide/16 v2, 0xfa */
/* .line 9 */
(( android.animation.ValueAnimator ) v1 ).setDuration ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;
/* .line 10 */
/* new-instance v2, Le/f/a/c/s/k; */
/* invoke-direct {v2, p0}, Le/f/a/c/s/k;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V */
(( android.animation.ValueAnimator ) v1 ).addListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
/* .line 11 */
/* new-instance v2, Le/f/a/c/s/l; */
/* invoke-direct {v2, p0, v0}, Le/f/a/c/s/l;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)V */
(( android.animation.ValueAnimator ) v1 ).addUpdateListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
/* .line 12 */
(( android.animation.ValueAnimator ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 4 */
/* .line 13 */
/* new-instance v0, Landroid/animation/ValueAnimator; */
/* invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V */
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [I */
int v2 = 0; // const/4 v2, 0x0
/* aput v2, v1, v2 */
/* .line 14 */
v2 = (( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).g ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g()I
int v3 = 1; // const/4 v3, 0x1
/* aput v2, v1, v3 */
(( android.animation.ValueAnimator ) v0 ).setIntValues ( v1 ); // invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setIntValues([I)V
/* .line 15 */
v1 = e.f.a.c.j.a.a;
(( android.animation.ValueAnimator ) v0 ).setInterpolator ( v1 ); // invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V
/* const-wide/16 v1, 0xfa */
/* .line 16 */
(( android.animation.ValueAnimator ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;
/* .line 17 */
/* new-instance v1, Le/f/a/c/s/a; */
/* invoke-direct {v1, p0, p1}, Le/f/a/c/s/a;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)V */
(( android.animation.ValueAnimator ) v0 ).addListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
/* .line 18 */
/* new-instance p1, Le/f/a/c/s/b; */
/* invoke-direct {p1, p0}, Le/f/a/c/s/b;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V */
(( android.animation.ValueAnimator ) v0 ).addUpdateListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
/* .line 19 */
(( android.animation.ValueAnimator ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V
return;
} // .end method
public void b ( ) {
/* .locals 1 */
int v0 = 3; // const/4 v0, 0x3
/* .line 1 */
(( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
e.f.a.c.s.v .b ( );
v1 = this.i;
(( e.f.a.c.s.v ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/f/a/c/s/v;->a(Le/f/a/c/s/t;I)V
return;
} // .end method
public android.content.Context c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public final void c ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = (( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).k ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c;
v0 = (( android.widget.FrameLayout ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I
/* if-nez v0, :cond_0 */
/* .line 3 */
(( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->a(I)V
/* .line 4 */
} // :cond_0
(( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d(I)V
} // :goto_0
return;
} // .end method
public Integer d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e:I */
} // .end method
public void d ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
e.f.a.c.s.v .b ( );
v1 = this.i;
(( e.f.a.c.s.v ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/c/s/v;->d(Le/f/a/c/s/t;)V
/* .line 3 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* .line 4 */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 5 */
v1 = this.f;
/* check-cast v1, Le/f/a/c/s/m; */
(( e.f.a.c.s.m ) v1 ).a ( p0, p1 ); // invoke-virtual {v1, p0, p1}, Le/f/a/c/s/m;->a(Ljava/lang/Object;I)V
/* add-int/lit8 v0, v0, -0x1 */
/* .line 6 */
} // :cond_0
p1 = this.c;
(( android.widget.FrameLayout ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;
/* .line 7 */
/* instance-of v0, p1, Landroid/view/ViewGroup; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
/* check-cast p1, Landroid/view/ViewGroup; */
v0 = this.c;
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
} // :cond_1
return;
} // .end method
public com.google.android.material.behavior.SwipeDismissBehavior e ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lcom/google/android/material/behavior/SwipeDismissBehavior<", */
/* "+", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 2 */
/* new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior; */
/* invoke-direct {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;-><init>()V */
} // .end method
public com.google.android.material.snackbar.BaseTransientBottomBar e ( Integer p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TB;" */
/* } */
} // .end annotation
/* .line 1 */
/* iput p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e:I */
} // .end method
public Integer f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).h ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
} // :goto_0
} // .end method
public final Integer g ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
v0 = (( android.widget.FrameLayout ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I
/* .line 2 */
v1 = this.c;
(( android.widget.FrameLayout ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 3 */
/* instance-of v2, v1, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 4 */
/* check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* add-int/2addr v0, v1 */
} // :cond_0
} // .end method
public Boolean h ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
v1 = com.google.android.material.snackbar.BaseTransientBottomBar.l;
(( android.content.Context ) v0 ).obtainStyledAttributes ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
int v1 = -1; // const/4 v1, -0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 2 */
v3 = (( android.content.res.TypedArray ) v0 ).getResourceId ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 3 */
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* if-eq v3, v1, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
} // .end method
public Boolean i ( ) {
/* .locals 2 */
/* .line 1 */
e.f.a.c.s.v .b ( );
v1 = this.i;
v0 = (( e.f.a.c.s.v ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/c/s/v;->a(Le/f/a/c/s/t;)Z
} // .end method
public void j ( ) {
/* .locals 2 */
/* .line 1 */
e.f.a.c.s.v .b ( );
v1 = this.i;
(( e.f.a.c.s.v ) v0 ).e ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/c/s/v;->e(Le/f/a/c/s/t;)V
/* .line 2 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* .line 3 */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 4 */
v1 = this.f;
/* check-cast v1, Le/f/a/c/s/m; */
(( e.f.a.c.s.m ) v1 ).a ( p0 ); // invoke-virtual {v1, p0}, Le/f/a/c/s/m;->a(Ljava/lang/Object;)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
public Boolean k ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.h;
int v1 = 1; // const/4 v1, 0x1
/* .line 2 */
(( android.view.accessibility.AccessibilityManager ) v0 ).getEnabledAccessibilityServiceList ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = /* .line 3 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public void l ( ) {
/* .locals 3 */
/* .line 1 */
e.f.a.c.s.v .b ( );
v1 = (( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d()I
v2 = this.i;
(( e.f.a.c.s.v ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/c/s/v;->a(ILe/f/a/c/s/t;)V
return;
} // .end method
public final void m ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
(( android.widget.FrameLayout ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_3 */
/* .line 2 */
v0 = this.c;
(( android.widget.FrameLayout ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 3 */
/* instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 4 */
/* check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e; */
/* .line 5 */
v1 = this.g;
/* if-nez v1, :cond_0 */
/* .line 6 */
(( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e()Lcom/google/android/material/behavior/SwipeDismissBehavior;
/* .line 7 */
} // :cond_0
/* instance-of v2, v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 8 */
/* move-object v2, v1 */
/* check-cast v2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior; */
com.google.android.material.snackbar.BaseTransientBottomBar$Behavior .a ( v2,p0 );
/* .line 9 */
} // :cond_1
/* new-instance v2, Le/f/a/c/s/g; */
/* invoke-direct {v2, p0}, Le/f/a/c/s/g;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V */
(( com.google.android.material.behavior.SwipeDismissBehavior ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a(Lcom/google/android/material/behavior/SwipeDismissBehavior$b;)V
/* .line 10 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout$e ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;)V
/* const/16 v1, 0x50 */
/* .line 11 */
/* iput v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->g:I */
/* .line 12 */
} // :cond_2
v0 = this.a;
v1 = this.c;
(( android.view.ViewGroup ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
/* .line 13 */
} // :cond_3
v0 = this.c;
/* new-instance v1, Le/f/a/c/s/i; */
/* invoke-direct {v1, p0}, Le/f/a/c/s/i;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V */
(( com.google.android.material.snackbar.BaseTransientBottomBar$b ) v0 ).setOnAttachStateChangeListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->setOnAttachStateChangeListener(Le/f/a/c/s/n;)V
/* .line 14 */
v0 = this.c;
v0 = c.h.n.v0 .D ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 15 */
v0 = (( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).k ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 16 */
(( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->a()V
/* .line 17 */
} // :cond_4
(( com.google.android.material.snackbar.BaseTransientBottomBar ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->j()V
/* .line 18 */
} // :cond_5
v0 = this.c;
/* new-instance v1, Le/f/a/c/s/j; */
/* invoke-direct {v1, p0}, Le/f/a/c/s/j;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V */
(( com.google.android.material.snackbar.BaseTransientBottomBar$b ) v0 ).setOnLayoutChangeListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->setOnLayoutChangeListener(Le/f/a/c/s/o;)V
} // :goto_0
return;
} // .end method
