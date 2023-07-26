public class com.google.android.material.bottomsheet.BottomSheetBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;, */
	 /* Lcom/google/android/material/bottomsheet/BottomSheetBehavior$d;, */
	 /* Lcom/google/android/material/bottomsheet/BottomSheetBehavior$b; */
	 /* } */
} // .end annotation
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
public Boolean a;
public Float b;
public Integer c;
public Boolean d;
public Integer e;
public Integer f;
public Integer g;
public Integer h;
public Integer i;
public Boolean j;
public Boolean k;
public Integer l;
public c.j.b.c m;
public Boolean n;
public Integer o;
public Boolean p;
public Integer q;
public java.lang.ref.WeakReference r;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "TV;>;" */
/* } */
} // .end annotation
} // .end field
public java.lang.ref.WeakReference s;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public com.google.android.material.bottomsheet.BottomSheetBehavior$b t;
public android.view.VelocityTracker u;
public Integer v;
public Integer w;
public Boolean x;
public java.util.Map y;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Landroid/view/View;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final c.j.b.c$a z;
/* # direct methods */
public com.google.android.material.bottomsheet.BottomSheetBehavior ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:Z */
int v0 = 4; // const/4 v0, 0x4
/* .line 3 */
/* iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
/* .line 4 */
/* new-instance v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$a; */
/* invoke-direct {v0, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$a;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V */
this.z = v0;
return;
} // .end method
public com.google.android.material.bottomsheet.BottomSheetBehavior ( ) {
/* .locals 3 */
/* .line 5 */
/* invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = 1; // const/4 v0, 0x1
/* .line 6 */
/* iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:Z */
int v1 = 4; // const/4 v1, 0x4
/* .line 7 */
/* iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
/* .line 8 */
/* new-instance v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$a; */
/* invoke-direct {v1, p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$a;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V */
this.z = v1;
/* .line 9 */
v1 = e.f.a.c.i.BottomSheetBehavior_Layout;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 10 */
(( android.content.res.TypedArray ) p2 ).peekValue ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
int v2 = -1; // const/4 v2, -0x1
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 11 */
/* iget v1, v1, Landroid/util/TypedValue;->data:I */
/* if-ne v1, v2, :cond_0 */
/* .line 12 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b(I)V
/* .line 13 */
} // :cond_0
/* .line 14 */
v1 = (( android.content.res.TypedArray ) p2 ).getDimensionPixelSize ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
/* .line 15 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b(I)V
/* .line 16 */
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
v1 = (( android.content.res.TypedArray ) p2 ).getBoolean ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b(Z)V
/* .line 17 */
/* .line 18 */
v0 = (( android.content.res.TypedArray ) p2 ).getBoolean ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* .line 19 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a(Z)V
/* .line 20 */
/* .line 21 */
v0 = (( android.content.res.TypedArray ) p2 ).getBoolean ( v0, v2 ); // invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* .line 22 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(Z)V
/* .line 23 */
(( android.content.res.TypedArray ) p2 ).recycle ( ); // invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V
/* .line 24 */
android.view.ViewConfiguration .get ( p1 );
/* .line 25 */
p1 = (( android.view.ViewConfiguration ) p1 ).getScaledMaximumFlingVelocity ( ); // invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
/* int-to-float p1, p1 */
/* iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:F */
return;
} // .end method
public static Boolean a ( com.google.android.material.bottomsheet.BottomSheetBehavior p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget-boolean p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:Z */
} // .end method
public static Integer b ( com.google.android.material.bottomsheet.BottomSheetBehavior p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c()I
} // .end method
/* # virtual methods */
public android.view.View a ( android.view.View p0 ) {
/* .locals 3 */
/* .line 114 */
v0 = c.h.n.v0 .E ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 115 */
} // :cond_0
/* instance-of v0, p1, Landroid/view/ViewGroup; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 116 */
/* check-cast p1, Landroid/view/ViewGroup; */
int v0 = 0; // const/4 v0, 0x0
/* .line 117 */
v1 = (( android.view.ViewGroup ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I
} // :goto_0
/* if-ge v0, v1, :cond_2 */
/* .line 118 */
(( android.view.ViewGroup ) p1 ).getChildAt ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a(Landroid/view/View;)Landroid/view/View;
if ( v2 != null) { // if-eqz v2, :cond_1
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( Integer p0 ) {
/* .locals 4 */
/* .line 119 */
v0 = this.r;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 120 */
v1 = this.t;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 121 */
/* iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* if-le p1, v2, :cond_0 */
/* sub-int p1, v2, p1 */
/* int-to-float p1, p1 */
/* .line 122 */
/* iget v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
/* sub-int/2addr v3, v2 */
/* int-to-float v2, v3 */
/* div-float/2addr p1, v2 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior$b ) v1 ).a ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$b;->a(Landroid/view/View;F)V
} // :cond_0
/* sub-int p1, v2, p1 */
/* int-to-float p1, p1 */
/* .line 123 */
v3 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c()I
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* div-float/2addr p1, v2 */
/* .line 124 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior$b ) v1 ).a ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$b;->a(Landroid/view/View;F)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.os.Parcelable p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/os/Parcelable;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c; */
/* .line 3 */
(( c.j.a.c ) p3 ).a ( ); // invoke-virtual {p3}, Lc/j/a/c;->a()Landroid/os/Parcelable;
/* invoke-super {p0, p1, p2, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V */
/* .line 4 */
/* iget p1, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;->d:I */
int p2 = 1; // const/4 p2, 0x1
/* if-eq p1, p2, :cond_1 */
int p2 = 2; // const/4 p2, 0x2
/* if-ne p1, p2, :cond_0 */
/* .line 5 */
} // :cond_0
/* iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
} // :cond_1
} // :goto_0
int p1 = 4; // const/4 p1, 0x4
/* .line 6 */
/* iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
} // :goto_1
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, Integer p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/View;", */
/* "I)V" */
/* } */
} // .end annotation
/* .line 78 */
p1 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
p4 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c()I
int v0 = 3; // const/4 v0, 0x3
/* if-ne p1, p4, :cond_0 */
/* .line 79 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
return;
/* .line 80 */
} // :cond_0
p1 = this.s;
(( java.lang.ref.WeakReference ) p1 ).get ( ); // invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* if-ne p3, p1, :cond_b */
/* iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z */
/* if-nez p1, :cond_1 */
/* goto/16 :goto_4 */
/* .line 81 */
} // :cond_1
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:I */
int p3 = 0; // const/4 p3, 0x0
int p4 = 4; // const/4 p4, 0x4
/* if-lez p1, :cond_2 */
/* .line 82 */
p1 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c()I
/* .line 83 */
} // :cond_2
/* iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d()F
p1 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a(Landroid/view/View;F)Z
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 84 */
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
int v0 = 5; // const/4 v0, 0x5
/* .line 85 */
} // :cond_3
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:I */
/* if-nez p1, :cond_9 */
/* .line 86 */
p1 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
/* .line 87 */
/* iget-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:Z */
int v2 = 6; // const/4 v2, 0x6
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 88 */
/* iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:I */
/* sub-int v1, p1, v1 */
v1 = java.lang.Math .abs ( v1 );
/* iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* sub-int/2addr p1, v2 */
p1 = java.lang.Math .abs ( p1 );
/* if-ge v1, p1, :cond_4 */
/* .line 89 */
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:I */
/* .line 90 */
} // :cond_4
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* .line 91 */
} // :cond_5
/* iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I */
/* if-ge p1, v1, :cond_7 */
/* .line 92 */
/* iget p4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* sub-int p4, p1, p4 */
p4 = java.lang.Math .abs ( p4 );
/* if-ge p1, p4, :cond_6 */
int p1 = 0; // const/4 p1, 0x0
/* .line 93 */
} // :cond_6
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I */
} // :cond_7
/* sub-int v0, p1, v1 */
/* .line 94 */
v0 = java.lang.Math .abs ( v0 );
/* iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* sub-int/2addr p1, v1 */
p1 = java.lang.Math .abs ( p1 );
/* if-ge v0, p1, :cond_8 */
/* .line 95 */
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I */
} // :goto_0
int v0 = 6; // const/4 v0, 0x6
/* .line 96 */
} // :cond_8
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* .line 97 */
} // :cond_9
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
} // :goto_1
int v0 = 4; // const/4 v0, 0x4
/* .line 98 */
} // :goto_2
p4 = this.m;
v1 = (( android.view.View ) p2 ).getLeft ( ); // invoke-virtual {p2}, Landroid/view/View;->getLeft()I
p1 = (( c.j.b.c ) p4 ).b ( p2, v1, p1 ); // invoke-virtual {p4, p2, v1, p1}, Lc/j/b/c;->b(Landroid/view/View;II)Z
if ( p1 != null) { // if-eqz p1, :cond_a
int p1 = 2; // const/4 p1, 0x2
/* .line 99 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
/* .line 100 */
/* new-instance p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$d; */
/* invoke-direct {p1, p0, p2, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$d;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V */
c.h.n.v0 .a ( p2,p1 );
/* .line 101 */
} // :cond_a
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
/* .line 102 */
} // :goto_3
/* iput-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z */
} // :cond_b
} // :goto_4
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, Integer p3, Integer p4, Integer[] p5, Integer p6 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/View;", */
/* "II[II)V" */
/* } */
} // .end annotation
int p1 = 1; // const/4 p1, 0x1
/* if-ne p7, p1, :cond_0 */
return;
/* .line 58 */
} // :cond_0
p4 = this.s;
(( java.lang.ref.WeakReference ) p4 ).get ( ); // invoke-virtual {p4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast p4, Landroid/view/View; */
/* if-eq p3, p4, :cond_1 */
return;
/* .line 59 */
} // :cond_1
p4 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
/* sub-int p7, p4, p5 */
/* if-lez p5, :cond_3 */
/* .line 60 */
p3 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c()I
/* if-ge p7, p3, :cond_2 */
/* .line 61 */
p3 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c()I
/* sub-int/2addr p4, p3 */
/* aput p4, p6, p1 */
/* .line 62 */
/* aget p3, p6, p1 */
/* neg-int p3, p3 */
c.h.n.v0 .e ( p2,p3 );
int p3 = 3; // const/4 p3, 0x3
/* .line 63 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( p3 ); // invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
/* .line 64 */
} // :cond_2
/* aput p5, p6, p1 */
/* neg-int p3, p5 */
/* .line 65 */
c.h.n.v0 .e ( p2,p3 );
/* .line 66 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
} // :cond_3
/* if-gez p5, :cond_6 */
int v0 = -1; // const/4 v0, -0x1
/* .line 67 */
p3 = (( android.view.View ) p3 ).canScrollVertically ( v0 ); // invoke-virtual {p3, v0}, Landroid/view/View;->canScrollVertically(I)Z
/* if-nez p3, :cond_6 */
/* .line 68 */
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* if-le p7, p3, :cond_5 */
/* iget-boolean p7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:Z */
if ( p7 != null) { // if-eqz p7, :cond_4
} // :cond_4
/* sub-int/2addr p4, p3 */
/* .line 69 */
/* aput p4, p6, p1 */
/* .line 70 */
/* aget p3, p6, p1 */
/* neg-int p3, p3 */
c.h.n.v0 .e ( p2,p3 );
int p3 = 4; // const/4 p3, 0x4
/* .line 71 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( p3 ); // invoke-virtual {p0, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
/* .line 72 */
} // :cond_5
} // :goto_0
/* aput p5, p6, p1 */
/* neg-int p3, p5 */
/* .line 73 */
c.h.n.v0 .e ( p2,p3 );
/* .line 74 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
/* .line 75 */
} // :cond_6
} // :goto_1
p2 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a(I)V
/* .line 76 */
/* iput p5, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:I */
/* .line 77 */
/* iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z */
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 105 */
/* iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:Z */
/* if-ne v0, p1, :cond_0 */
return;
/* .line 106 */
} // :cond_0
/* iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:Z */
/* .line 107 */
p1 = this.r;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 108 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b()V
/* .line 109 */
} // :cond_1
/* iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_2
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
int v0 = 6; // const/4 v0, 0x6
/* if-ne p1, v0, :cond_2 */
int p1 = 3; // const/4 p1, 0x3
} // :cond_2
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
} // :goto_0
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
return;
} // .end method
public Boolean a ( android.view.View p0, Float p1 ) {
/* .locals 4 */
/* .line 110 */
/* iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 111 */
} // :cond_0
v0 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
int v3 = 0; // const/4 v3, 0x0
/* if-ge v0, v2, :cond_1 */
/* .line 112 */
} // :cond_1
p1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* int-to-float p1, p1 */
/* const v0, 0x3dcccccd # 0.1f */
/* mul-float p2, p2, v0 */
/* add-float/2addr p1, p2 */
/* .line 113 */
/* iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* int-to-float p2, p2 */
/* sub-float/2addr p1, p2 */
p1 = java.lang.Math .abs ( p1 );
/* iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c:I */
/* int-to-float p2, p2 */
/* div-float/2addr p1, p2 */
/* const/high16 p2, 0x3f000000 # 0.5f */
/* cmpl-float p1, p1, p2 */
/* if-lez p1, :cond_2 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, Integer p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;I)Z" */
/* } */
} // .end annotation
/* .line 7 */
v0 = c.h.n.v0 .l ( p1 );
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = c.h.n.v0 .l ( p2 );
/* if-nez v0, :cond_0 */
/* .line 8 */
(( android.view.View ) p2 ).setFitsSystemWindows ( v1 ); // invoke-virtual {p2, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V
/* .line 9 */
} // :cond_0
v0 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
/* .line 10 */
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).d ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->d(Landroid/view/View;I)V
/* .line 11 */
p3 = (( android.view.ViewGroup ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I
/* iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
/* .line 12 */
/* iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d:Z */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 13 */
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e:I */
/* if-nez p3, :cond_1 */
/* .line 14 */
(( android.view.ViewGroup ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;
/* .line 15 */
p3 = (( android.content.res.Resources ) p3 ).getDimensionPixelSize ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
/* iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e:I */
/* .line 16 */
} // :cond_1
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e:I */
/* iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
v3 = (( android.view.ViewGroup ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I
/* mul-int/lit8 v3, v3, 0x9 */
/* div-int/lit8 v3, v3, 0x10 */
/* sub-int/2addr v2, v3 */
p3 = java.lang.Math .max ( p3,v2 );
/* iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f:I */
/* .line 17 */
} // :cond_2
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c:I */
/* iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f:I */
} // :goto_0
int p3 = 0; // const/4 p3, 0x0
/* .line 18 */
/* iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
v3 = (( android.view.View ) p2 ).getHeight ( ); // invoke-virtual {p2}, Landroid/view/View;->getHeight()I
/* sub-int/2addr v2, v3 */
p3 = java.lang.Math .max ( p3,v2 );
/* iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:I */
/* .line 19 */
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
int v2 = 2; // const/4 v2, 0x2
/* div-int/2addr p3, v2 */
/* iput p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I */
/* .line 20 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b()V
/* .line 21 */
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
int v3 = 3; // const/4 v3, 0x3
/* if-ne p3, v3, :cond_3 */
/* .line 22 */
p3 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c()I
c.h.n.v0 .e ( p2,p3 );
} // :cond_3
int v3 = 6; // const/4 v3, 0x6
/* if-ne p3, v3, :cond_4 */
/* .line 23 */
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I */
c.h.n.v0 .e ( p2,p3 );
/* .line 24 */
} // :cond_4
/* iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:Z */
if ( v3 != null) { // if-eqz v3, :cond_5
int v3 = 5; // const/4 v3, 0x5
/* if-ne p3, v3, :cond_5 */
/* .line 25 */
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
c.h.n.v0 .e ( p2,p3 );
/* .line 26 */
} // :cond_5
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
int v3 = 4; // const/4 v3, 0x4
/* if-ne p3, v3, :cond_6 */
/* .line 27 */
/* iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
c.h.n.v0 .e ( p2,p3 );
} // :cond_6
/* if-eq p3, v1, :cond_7 */
/* if-ne p3, v2, :cond_8 */
/* .line 28 */
} // :cond_7
p3 = (( android.view.View ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/view/View;->getTop()I
/* sub-int/2addr v0, p3 */
c.h.n.v0 .e ( p2,v0 );
/* .line 29 */
} // :cond_8
} // :goto_1
p3 = this.m;
/* if-nez p3, :cond_9 */
/* .line 30 */
p3 = this.z;
c.j.b.c .a ( p1,p3 );
this.m = p1;
/* .line 31 */
} // :cond_9
/* new-instance p1, Ljava/lang/ref/WeakReference; */
/* invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.r = p1;
/* .line 32 */
/* new-instance p1, Ljava/lang/ref/WeakReference; */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a(Landroid/view/View;)Landroid/view/View;
/* invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.s = p1;
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.MotionEvent p2 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/MotionEvent;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 33 */
v0 = (( android.view.View ) p2 ).isShown ( ); // invoke-virtual {p2}, Landroid/view/View;->isShown()Z
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-nez v0, :cond_0 */
/* .line 34 */
/* iput-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z */
/* .line 35 */
} // :cond_0
v0 = (( android.view.MotionEvent ) p3 ).getActionMasked ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I
/* if-nez v0, :cond_1 */
/* .line 36 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e()V
/* .line 37 */
} // :cond_1
v3 = this.u;
/* if-nez v3, :cond_2 */
/* .line 38 */
android.view.VelocityTracker .obtain ( );
this.u = v3;
/* .line 39 */
} // :cond_2
v3 = this.u;
(( android.view.VelocityTracker ) v3 ).addMovement ( p3 ); // invoke-virtual {v3, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
int v3 = 0; // const/4 v3, 0x0
int v4 = -1; // const/4 v4, -0x1
if ( v0 != null) { // if-eqz v0, :cond_4
/* if-eq v0, v2, :cond_3 */
int p2 = 3; // const/4 p2, 0x3
/* if-eq v0, p2, :cond_3 */
/* .line 40 */
} // :cond_3
/* iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x:Z */
/* .line 41 */
/* iput v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I */
/* .line 42 */
/* iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z */
if ( p2 != null) { // if-eqz p2, :cond_8
/* .line 43 */
/* iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z */
/* .line 44 */
} // :cond_4
v5 = (( android.view.MotionEvent ) p3 ).getX ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v5, v5 */
/* .line 45 */
v6 = (( android.view.MotionEvent ) p3 ).getY ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v6, v6 */
/* iput v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I */
/* .line 46 */
v6 = this.s;
if ( v6 != null) { // if-eqz v6, :cond_5
(( java.lang.ref.WeakReference ) v6 ).get ( ); // invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v6, Landroid/view/View; */
} // :cond_5
/* move-object v6, v3 */
} // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 47 */
/* iget v7, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I */
v6 = (( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).a ( v6, v5, v7 ); // invoke-virtual {p1, v6, v5, v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;II)Z
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 48 */
v6 = (( android.view.MotionEvent ) p3 ).getActionIndex ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionIndex()I
v6 = (( android.view.MotionEvent ) p3 ).getPointerId ( v6 ); // invoke-virtual {p3, v6}, Landroid/view/MotionEvent;->getPointerId(I)I
/* iput v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I */
/* .line 49 */
/* iput-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x:Z */
/* .line 50 */
} // :cond_6
/* iget v6, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I */
/* if-ne v6, v4, :cond_7 */
/* iget v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I */
/* .line 51 */
p2 = (( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).a ( p2, v5, v4 ); // invoke-virtual {p1, p2, v5, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;II)Z
/* if-nez p2, :cond_7 */
int p2 = 1; // const/4 p2, 0x1
} // :cond_7
int p2 = 0; // const/4 p2, 0x0
} // :goto_1
/* iput-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z */
/* .line 52 */
} // :cond_8
} // :goto_2
/* iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z */
/* if-nez p2, :cond_9 */
p2 = this.m;
if ( p2 != null) { // if-eqz p2, :cond_9
/* .line 53 */
p2 = (( c.j.b.c ) p2 ).c ( p3 ); // invoke-virtual {p2, p3}, Lc/j/b/c;->c(Landroid/view/MotionEvent;)Z
if ( p2 != null) { // if-eqz p2, :cond_9
/* .line 54 */
} // :cond_9
p2 = this.s;
if ( p2 != null) { // if-eqz p2, :cond_a
(( java.lang.ref.WeakReference ) p2 ).get ( ); // invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* move-object v3, p2 */
/* check-cast v3, Landroid/view/View; */
} // :cond_a
int p2 = 2; // const/4 p2, 0x2
/* if-ne v0, p2, :cond_b */
if ( v3 != null) { // if-eqz v3, :cond_b
/* .line 55 */
/* iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z */
/* if-nez p2, :cond_b */
/* iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
/* if-eq p2, v2, :cond_b */
/* .line 56 */
p2 = (( android.view.MotionEvent ) p3 ).getX ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F
/* float-to-int p2, p2 */
v0 = (( android.view.MotionEvent ) p3 ).getY ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v0, v0 */
p1 = (( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).a ( v3, p2, v0 ); // invoke-virtual {p1, v3, p2, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;II)Z
/* if-nez p1, :cond_b */
p1 = this.m;
if ( p1 != null) { // if-eqz p1, :cond_b
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I */
/* int-to-float p1, p1 */
/* .line 57 */
p2 = (( android.view.MotionEvent ) p3 ).getY ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F
/* sub-float/2addr p1, p2 */
p1 = java.lang.Math .abs ( p1 );
p2 = this.m;
p2 = (( c.j.b.c ) p2 ).c ( ); // invoke-virtual {p2}, Lc/j/b/c;->c()I
/* int-to-float p2, p2 */
/* cmpl-float p1, p1, p2 */
/* if-lez p1, :cond_b */
int v1 = 1; // const/4 v1, 0x1
} // :cond_b
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, Float p3, Float p4 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/View;", */
/* "FF)Z" */
/* } */
} // .end annotation
/* .line 103 */
v0 = this.s;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* if-ne p3, v0, :cond_1 */
/* iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_0 */
/* .line 104 */
p1 = /* invoke-super/range {p0 ..p5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z */
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final void b ( ) {
/* .locals 2 */
/* .line 27 */
/* iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 28 */
/* iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
/* iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f:I */
/* sub-int/2addr v0, v1 */
/* iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:I */
v0 = java.lang.Math .max ( v0,v1 );
/* iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* .line 29 */
} // :cond_0
/* iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
/* iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->f:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
} // :goto_0
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
int v2 = -1; // const/4 v2, -0x1
/* if-ne p1, v2, :cond_0 */
/* .line 17 */
/* iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d:Z */
/* if-nez p1, :cond_1 */
/* .line 18 */
/* iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d:Z */
/* .line 19 */
} // :cond_0
/* iget-boolean v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d:Z */
/* if-nez v2, :cond_2 */
/* iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c:I */
/* if-eq v2, p1, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 20 */
} // :cond_2
} // :goto_0
/* iput-boolean v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d:Z */
/* .line 21 */
v1 = java.lang.Math .max ( v1,p1 );
/* iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c:I */
/* .line 22 */
/* iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
/* sub-int/2addr v1, p1 */
/* iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 23 */
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_3 */
p1 = this.r;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 24 */
(( java.lang.ref.WeakReference ) p1 ).get ( ); // invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast p1, Landroid/view/View; */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 25 */
(( android.view.View ) p1 ).requestLayout ( ); // invoke-virtual {p1}, Landroid/view/View;->requestLayout()V
} // :cond_3
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 0 */
/* .line 26 */
/* iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:Z */
return;
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.MotionEvent p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/MotionEvent;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 2 */
p1 = (( android.view.View ) p2 ).isShown ( ); // invoke-virtual {p2}, Landroid/view/View;->isShown()Z
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :cond_0
p1 = (( android.view.MotionEvent ) p3 ).getActionMasked ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I
/* .line 4 */
/* iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
/* if-nez p1, :cond_1 */
/* .line 5 */
} // :cond_1
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
(( c.j.b.c ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Lc/j/b/c;->a(Landroid/view/MotionEvent;)V
} // :cond_2
/* if-nez p1, :cond_3 */
/* .line 7 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e()V
/* .line 8 */
} // :cond_3
v0 = this.u;
/* if-nez v0, :cond_4 */
/* .line 9 */
android.view.VelocityTracker .obtain ( );
this.u = v0;
/* .line 10 */
} // :cond_4
v0 = this.u;
(( android.view.VelocityTracker ) v0 ).addMovement ( p3 ); // invoke-virtual {v0, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_5 */
/* .line 11 */
/* iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z */
/* if-nez p1, :cond_5 */
/* .line 12 */
/* iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I */
/* int-to-float p1, p1 */
v0 = (( android.view.MotionEvent ) p3 ).getY ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F
/* sub-float/2addr p1, v0 */
p1 = java.lang.Math .abs ( p1 );
v0 = this.m;
v0 = (( c.j.b.c ) v0 ).c ( ); // invoke-virtual {v0}, Lc/j/b/c;->c()I
/* int-to-float v0, v0 */
/* cmpl-float p1, p1, v0 */
/* if-lez p1, :cond_5 */
/* .line 13 */
p1 = this.m;
v0 = (( android.view.MotionEvent ) p3 ).getActionIndex ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionIndex()I
p3 = (( android.view.MotionEvent ) p3 ).getPointerId ( v0 ); // invoke-virtual {p3, v0}, Landroid/view/MotionEvent;->getPointerId(I)I
(( c.j.b.c ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lc/j/b/c;->a(Landroid/view/View;I)V
/* .line 14 */
} // :cond_5
/* iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z */
/* xor-int/2addr p1, v1 */
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2, android.view.View p3, Integer p4, Integer p5 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/View;", */
/* "Landroid/view/View;", */
/* "II)Z" */
/* } */
} // .end annotation
int p1 = 0; // const/4 p1, 0x0
/* .line 15 */
/* iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:I */
/* .line 16 */
/* iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z */
/* and-int/lit8 p2, p5, 0x2 */
if ( p2 != null) { // if-eqz p2, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
} // .end method
public final Integer c ( ) {
/* .locals 1 */
/* .line 9 */
/* iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:I */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void c ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
/* iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
/* if-ne v0, p1, :cond_0 */
return;
/* .line 3 */
} // :cond_0
/* iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
int v0 = 6; // const/4 v0, 0x6
/* if-eq p1, v0, :cond_3 */
int v0 = 3; // const/4 v0, 0x3
/* if-ne p1, v0, :cond_1 */
} // :cond_1
int v0 = 5; // const/4 v0, 0x5
/* if-eq p1, v0, :cond_2 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_4 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d(Z)V
} // :cond_3
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d(Z)V
/* .line 6 */
} // :cond_4
} // :goto_1
v0 = this.r;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 7 */
v1 = this.t;
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 8 */
(( com.google.android.material.bottomsheet.BottomSheetBehavior$b ) v1 ).a ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$b;->a(Landroid/view/View;I)V
} // :cond_5
return;
} // .end method
public void c ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k:Z */
return;
} // .end method
public final Float d ( ) {
/* .locals 3 */
/* .line 2 */
v0 = this.u;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* const/16 v1, 0x3e8 */
/* .line 3 */
/* iget v2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->b:F */
(( android.view.VelocityTracker ) v0 ).computeCurrentVelocity ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
/* .line 4 */
v0 = this.u;
/* iget v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I */
v0 = (( android.view.VelocityTracker ) v0 ).getYVelocity ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getYVelocity(I)F
} // .end method
public android.os.Parcelable d ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;)", */
/* "Landroid/os/Parcelable;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c; */
/* invoke-super {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->d(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable; */
/* iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
/* invoke-direct {v0, p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;-><init>(Landroid/os/Parcelable;I)V */
} // .end method
public final void d ( Boolean p0 ) {
/* .locals 7 */
/* .line 5 */
v0 = this.r;
/* if-nez v0, :cond_0 */
return;
/* .line 6 */
} // :cond_0
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 7 */
/* instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout; */
/* if-nez v1, :cond_1 */
return;
/* .line 8 */
} // :cond_1
/* check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout; */
/* .line 9 */
v1 = (( android.view.ViewGroup ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I
/* .line 10 */
/* const/16 v3, 0x10 */
/* if-lt v2, v3, :cond_3 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 11 */
v2 = this.y;
/* if-nez v2, :cond_2 */
/* .line 12 */
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V */
this.y = v2;
} // :cond_2
return;
} // :cond_3
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* if-ge v2, v1, :cond_8 */
/* .line 13 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 14 */
v5 = this.r;
(( java.lang.ref.WeakReference ) v5 ).get ( ); // invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* if-ne v4, v5, :cond_4 */
} // :cond_4
/* if-nez p1, :cond_5 */
/* .line 15 */
v5 = this.y;
if ( v5 != null) { // if-eqz v5, :cond_7
v5 = /* .line 16 */
if ( v5 != null) { // if-eqz v5, :cond_7
/* .line 17 */
v5 = this.y;
/* check-cast v5, Ljava/lang/Integer; */
v5 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
c.h.n.v0 .g ( v4,v5 );
/* .line 18 */
} // :cond_5
/* if-lt v5, v3, :cond_6 */
/* .line 19 */
v5 = this.y;
v6 = (( android.view.View ) v4 ).getImportantForAccessibility ( ); // invoke-virtual {v4}, Landroid/view/View;->getImportantForAccessibility()I
java.lang.Integer .valueOf ( v6 );
} // :cond_6
int v5 = 4; // const/4 v5, 0x4
/* .line 20 */
c.h.n.v0 .g ( v4,v5 );
} // :cond_7
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_8
/* if-nez p1, :cond_9 */
int p1 = 0; // const/4 p1, 0x0
/* .line 21 */
this.y = p1;
} // :cond_9
return;
} // .end method
public final void e ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
/* iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I */
/* .line 2 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.view.VelocityTracker ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.u = v0;
} // :cond_0
return;
} // .end method
