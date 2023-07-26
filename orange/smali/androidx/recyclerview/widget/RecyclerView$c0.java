public class androidx.recyclerview.widget.RecyclerView$c0 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "c0" */
} // .end annotation
/* # instance fields */
public Integer b;
public Integer c;
public android.widget.OverScroller d;
public android.view.animation.Interpolator e;
public Boolean f;
public Boolean g;
public final androidx.recyclerview.widget.RecyclerView h; //synthetic
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$c0 ( ) {
/* .locals 2 */
/* .line 1 */
this.h = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
v0 = androidx.recyclerview.widget.RecyclerView.H0;
this.e = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->f:Z */
/* .line 4 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->g:Z */
/* .line 5 */
/* new-instance v0, Landroid/widget/OverScroller; */
(( android.view.ViewGroup ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
v1 = androidx.recyclerview.widget.RecyclerView.H0;
/* invoke-direct {v0, p1, v1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V */
this.d = v0;
return;
} // .end method
/* # virtual methods */
public final Float a ( Float p0 ) {
/* .locals 2 */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* sub-float/2addr p1, v0 */
/* const v0, 0x3ef1463b */
/* mul-float p1, p1, v0 */
/* float-to-double v0, p1 */
/* .line 21 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float p1, v0 */
} // .end method
public final Integer a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* .line 22 */
v0 = java.lang.Math .abs ( p1 );
/* .line 23 */
v1 = java.lang.Math .abs ( p2 );
/* if-le v0, v1, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* mul-int p3, p3, p3 */
/* mul-int p4, p4, p4 */
/* add-int/2addr p3, p4 */
/* int-to-double p3, p3 */
/* .line 24 */
java.lang.Math .sqrt ( p3,p4 );
/* move-result-wide p3 */
/* double-to-int p3, p3 */
/* mul-int p1, p1, p1 */
/* mul-int p2, p2, p2 */
/* add-int/2addr p1, p2 */
/* int-to-double p1, p1 */
/* .line 25 */
java.lang.Math .sqrt ( p1,p2 );
/* move-result-wide p1 */
/* double-to-int p1, p1 */
/* .line 26 */
p2 = this.h;
if ( v2 != null) { // if-eqz v2, :cond_1
p2 = (( android.view.ViewGroup ) p2 ).getWidth ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getWidth()I
} // :cond_1
p2 = (( android.view.ViewGroup ) p2 ).getHeight ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getHeight()I
/* .line 27 */
} // :goto_1
/* div-int/lit8 p4, p2, 0x2 */
/* int-to-float p1, p1 */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* mul-float p1, p1, v3 */
/* int-to-float p2, p2 */
/* div-float/2addr p1, p2 */
/* .line 28 */
p1 = java.lang.Math .min ( v3,p1 );
/* int-to-float p4, p4 */
/* .line 29 */
p1 = (( androidx.recyclerview.widget.RecyclerView$c0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$c0;->a(F)F
/* mul-float p1, p1, p4 */
/* add-float/2addr p4, p1 */
/* if-lez p3, :cond_2 */
/* const/high16 p1, 0x447a0000 # 1000.0f */
/* int-to-float p2, p3 */
/* div-float/2addr p4, p2 */
/* .line 30 */
p2 = java.lang.Math .abs ( p4 );
/* mul-float p2, p2, p1 */
p1 = java.lang.Math .round ( p2 );
/* mul-int/lit8 p1, p1, 0x4 */
} // :cond_2
if ( v2 != null) { // if-eqz v2, :cond_3
} // :cond_3
/* move v0, v1 */
} // :goto_2
/* int-to-float p1, v0 */
/* div-float/2addr p1, p2 */
/* add-float/2addr p1, v3 */
/* const/high16 p2, 0x43960000 # 300.0f */
/* mul-float p1, p1, p2 */
/* float-to-int p1, p1 */
} // :goto_3
/* const/16 p2, 0x7d0 */
/* .line 31 */
p1 = java.lang.Math .min ( p1,p2 );
} // .end method
public final void a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
(( android.view.ViewGroup ) v0 ).removeCallbacks ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 2 */
v0 = this.h;
c.h.n.v0 .a ( v0,p0 );
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 12 */
/* .line 3 */
v0 = this.h;
int v1 = 2; // const/4 v1, 0x2
(( androidx.recyclerview.widget.RecyclerView ) v0 ).setScrollState ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->c:I */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->b:I */
/* .line 5 */
v0 = this.e;
v1 = androidx.recyclerview.widget.RecyclerView.H0;
/* if-eq v0, v1, :cond_0 */
/* .line 6 */
this.e = v1;
/* .line 7 */
/* new-instance v0, Landroid/widget/OverScroller; */
v1 = this.h;
(( android.view.ViewGroup ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
v2 = androidx.recyclerview.widget.RecyclerView.H0;
/* invoke-direct {v0, v1, v2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V */
this.d = v0;
/* .line 8 */
} // :cond_0
v3 = this.d;
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v8, -0x80000000 */
/* const v9, 0x7fffffff */
/* const/high16 v10, -0x80000000 */
/* const v11, 0x7fffffff */
/* move v6, p1 */
/* move v7, p2 */
/* invoke-virtual/range {v3 ..v11}, Landroid/widget/OverScroller;->fling(IIIIIIII)V */
/* .line 9 */
(( androidx.recyclerview.widget.RecyclerView$c0 ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$c0;->b()V
return;
} // .end method
public void a ( Integer p0, Integer p1, Integer p2, android.view.animation.Interpolator p3 ) {
/* .locals 7 */
int v0 = 0; // const/4 v0, 0x0
/* const/high16 v1, -0x80000000 */
/* if-ne p3, v1, :cond_0 */
/* .line 10 */
p3 = (( androidx.recyclerview.widget.RecyclerView$c0 ) p0 ).a ( p1, p2, v0, v0 ); // invoke-virtual {p0, p1, p2, v0, v0}, Landroidx/recyclerview/widget/RecyclerView$c0;->a(IIII)I
} // :cond_0
/* move v6, p3 */
/* if-nez p4, :cond_1 */
/* .line 11 */
p4 = androidx.recyclerview.widget.RecyclerView.H0;
/* .line 12 */
} // :cond_1
p3 = this.e;
/* if-eq p3, p4, :cond_2 */
/* .line 13 */
this.e = p4;
/* .line 14 */
/* new-instance p3, Landroid/widget/OverScroller; */
v1 = this.h;
(( android.view.ViewGroup ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {p3, v1, p4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V */
this.d = p3;
/* .line 15 */
} // :cond_2
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->c:I */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->b:I */
/* .line 16 */
p3 = this.h;
int p4 = 2; // const/4 p4, 0x2
(( androidx.recyclerview.widget.RecyclerView ) p3 ).setScrollState ( p4 ); // invoke-virtual {p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V
/* .line 17 */
v1 = this.d;
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* move v4, p1 */
/* move v5, p2 */
/* invoke-virtual/range {v1 ..v6}, Landroid/widget/OverScroller;->startScroll(IIIII)V */
/* .line 18 */
/* const/16 p2, 0x17 */
/* if-ge p1, p2, :cond_3 */
/* .line 19 */
p1 = this.d;
(( android.widget.OverScroller ) p1 ).computeScrollOffset ( ); // invoke-virtual {p1}, Landroid/widget/OverScroller;->computeScrollOffset()Z
/* .line 20 */
} // :cond_3
(( androidx.recyclerview.widget.RecyclerView$c0 ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$c0;->b()V
return;
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$c0;->g:Z */
/* .line 3 */
} // :cond_0
(( androidx.recyclerview.widget.RecyclerView$c0 ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$c0;->a()V
} // :goto_0
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
(( android.view.ViewGroup ) v0 ).removeCallbacks ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 2 */
v0 = this.d;
(( android.widget.OverScroller ) v0 ).abortAnimation ( ); // invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V
return;
} // .end method
public void run ( ) {
/* .locals 22 */
/* move-object/from16 v0, p0 */
/* .line 1 */
v1 = this.h;
v2 = this.n;
/* if-nez v2, :cond_0 */
/* .line 2 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$c0;->c()V */
return;
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
/* iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$c0;->g:Z */
int v3 = 1; // const/4 v3, 0x1
/* .line 4 */
/* iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView$c0;->f:Z */
/* .line 5 */
(( androidx.recyclerview.widget.RecyclerView ) v1 ).c ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->c()V
/* .line 6 */
v1 = this.d;
/* .line 7 */
v4 = (( android.widget.OverScroller ) v1 ).computeScrollOffset ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z
if ( v4 != null) { // if-eqz v4, :cond_17
/* .line 8 */
v4 = (( android.widget.OverScroller ) v1 ).getCurrX ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I
/* .line 9 */
v5 = (( android.widget.OverScroller ) v1 ).getCurrY ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I
/* .line 10 */
/* iget v6, v0, Landroidx/recyclerview/widget/RecyclerView$c0;->b:I */
/* sub-int v6, v4, v6 */
/* .line 11 */
/* iget v7, v0, Landroidx/recyclerview/widget/RecyclerView$c0;->c:I */
/* sub-int v13, v5, v7 */
/* .line 12 */
/* iput v4, v0, Landroidx/recyclerview/widget/RecyclerView$c0;->b:I */
/* .line 13 */
/* iput v5, v0, Landroidx/recyclerview/widget/RecyclerView$c0;->c:I */
/* .line 14 */
v7 = this.h;
v10 = this.v0;
/* aput v2, v10, v2 */
/* .line 15 */
/* aput v2, v10, v3 */
int v11 = 0; // const/4 v11, 0x0
int v12 = 1; // const/4 v12, 0x1
/* move v8, v6 */
/* move v9, v13 */
/* .line 16 */
v4 = /* invoke-virtual/range {v7 ..v12}, Landroidx/recyclerview/widget/RecyclerView;->a(II[I[II)Z */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 17 */
v4 = this.h;
v4 = this.v0;
/* aget v5, v4, v2 */
/* sub-int/2addr v6, v5 */
/* .line 18 */
/* aget v4, v4, v3 */
/* sub-int/2addr v13, v4 */
/* .line 19 */
} // :cond_1
v4 = this.h;
v4 = (( android.view.ViewGroup ) v4 ).getOverScrollMode ( ); // invoke-virtual {v4}, Landroid/view/ViewGroup;->getOverScrollMode()I
int v5 = 2; // const/4 v5, 0x2
/* if-eq v4, v5, :cond_2 */
/* .line 20 */
v4 = this.h;
(( androidx.recyclerview.widget.RecyclerView ) v4 ).b ( v6, v13 ); // invoke-virtual {v4, v6, v13}, Landroidx/recyclerview/widget/RecyclerView;->b(II)V
/* .line 21 */
} // :cond_2
v4 = this.h;
v7 = this.m;
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 22 */
v7 = this.v0;
/* aput v2, v7, v2 */
/* .line 23 */
/* aput v2, v7, v3 */
/* .line 24 */
(( androidx.recyclerview.widget.RecyclerView ) v4 ).a ( v6, v13, v7 ); // invoke-virtual {v4, v6, v13, v7}, Landroidx/recyclerview/widget/RecyclerView;->a(II[I)V
/* .line 25 */
v4 = this.h;
v7 = this.v0;
/* aget v8, v7, v2 */
/* .line 26 */
/* aget v7, v7, v3 */
/* sub-int/2addr v6, v8 */
/* sub-int/2addr v13, v7 */
/* .line 27 */
v4 = this.n;
v4 = this.g;
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 28 */
v9 = (( androidx.recyclerview.widget.RecyclerView$z ) v4 ).b ( ); // invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$z;->b()Z
/* if-nez v9, :cond_6 */
/* .line 29 */
v9 = (( androidx.recyclerview.widget.RecyclerView$z ) v4 ).c ( ); // invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$z;->c()Z
if ( v9 != null) { // if-eqz v9, :cond_6
/* .line 30 */
v9 = this.h;
v9 = this.i0;
v9 = (( androidx.recyclerview.widget.RecyclerView$a0 ) v9 ).a ( ); // invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-nez v9, :cond_3 */
/* .line 31 */
(( androidx.recyclerview.widget.RecyclerView$z ) v4 ).d ( ); // invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$z;->d()V
/* .line 32 */
} // :cond_3
v10 = (( androidx.recyclerview.widget.RecyclerView$z ) v4 ).a ( ); // invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$z;->a()I
/* if-lt v10, v9, :cond_4 */
/* sub-int/2addr v9, v3 */
/* .line 33 */
(( androidx.recyclerview.widget.RecyclerView$z ) v4 ).a ( v9 ); // invoke-virtual {v4, v9}, Landroidx/recyclerview/widget/RecyclerView$z;->a(I)V
/* .line 34 */
(( androidx.recyclerview.widget.RecyclerView$z ) v4 ).a ( v8, v7 ); // invoke-virtual {v4, v8, v7}, Landroidx/recyclerview/widget/RecyclerView$z;->a(II)V
/* .line 35 */
} // :cond_4
(( androidx.recyclerview.widget.RecyclerView$z ) v4 ).a ( v8, v7 ); // invoke-virtual {v4, v8, v7}, Landroidx/recyclerview/widget/RecyclerView$z;->a(II)V
} // :cond_5
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* .line 36 */
} // :cond_6
} // :goto_0
v4 = this.h;
v4 = this.p;
v4 = (( java.util.ArrayList ) v4 ).isEmpty ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v4, :cond_7 */
/* .line 37 */
v4 = this.h;
(( android.view.ViewGroup ) v4 ).invalidate ( ); // invoke-virtual {v4}, Landroid/view/ViewGroup;->invalidate()V
/* .line 38 */
} // :cond_7
v14 = this.h;
v4 = this.v0;
/* aput v2, v4, v2 */
/* .line 39 */
/* aput v2, v4, v3 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x1 */
/* move v15, v8 */
/* move/from16 v16, v7 */
/* move/from16 v17, v6 */
/* move/from16 v18, v13 */
/* move-object/from16 v21, v4 */
/* .line 40 */
/* invoke-virtual/range {v14 ..v21}, Landroidx/recyclerview/widget/RecyclerView;->a(IIII[II[I)V */
/* .line 41 */
v4 = this.h;
v4 = this.v0;
/* aget v9, v4, v2 */
/* sub-int/2addr v6, v9 */
/* .line 42 */
/* aget v4, v4, v3 */
/* sub-int/2addr v13, v4 */
/* if-nez v8, :cond_8 */
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 43 */
} // :cond_8
v4 = this.h;
(( androidx.recyclerview.widget.RecyclerView ) v4 ).e ( v8, v7 ); // invoke-virtual {v4, v8, v7}, Landroidx/recyclerview/widget/RecyclerView;->e(II)V
/* .line 44 */
} // :cond_9
v4 = this.h;
v4 = androidx.recyclerview.widget.RecyclerView .a ( v4 );
/* if-nez v4, :cond_a */
/* .line 45 */
v4 = this.h;
(( android.view.ViewGroup ) v4 ).invalidate ( ); // invoke-virtual {v4}, Landroid/view/ViewGroup;->invalidate()V
/* .line 46 */
} // :cond_a
v4 = (( android.widget.OverScroller ) v1 ).getCurrX ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrX()I
v9 = (( android.widget.OverScroller ) v1 ).getFinalX ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalX()I
/* if-ne v4, v9, :cond_b */
int v4 = 1; // const/4 v4, 0x1
} // :cond_b
int v4 = 0; // const/4 v4, 0x0
/* .line 47 */
} // :goto_1
v9 = (( android.widget.OverScroller ) v1 ).getCurrY ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I
v10 = (( android.widget.OverScroller ) v1 ).getFinalY ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalY()I
/* if-ne v9, v10, :cond_c */
int v9 = 1; // const/4 v9, 0x1
} // :cond_c
int v9 = 0; // const/4 v9, 0x0
/* .line 48 */
} // :goto_2
v10 = (( android.widget.OverScroller ) v1 ).isFinished ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z
/* if-nez v10, :cond_f */
/* if-nez v4, :cond_d */
if ( v6 != null) { // if-eqz v6, :cond_e
} // :cond_d
/* if-nez v9, :cond_f */
if ( v13 != null) { // if-eqz v13, :cond_e
} // :cond_e
int v4 = 0; // const/4 v4, 0x0
} // :cond_f
} // :goto_3
int v4 = 1; // const/4 v4, 0x1
/* .line 49 */
} // :goto_4
v9 = this.h;
v9 = this.n;
v9 = this.g;
if ( v9 != null) { // if-eqz v9, :cond_10
/* .line 50 */
v9 = (( androidx.recyclerview.widget.RecyclerView$z ) v9 ).b ( ); // invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView$z;->b()Z
if ( v9 != null) { // if-eqz v9, :cond_10
int v9 = 1; // const/4 v9, 0x1
} // :cond_10
int v9 = 0; // const/4 v9, 0x0
} // :goto_5
/* if-nez v9, :cond_16 */
if ( v4 != null) { // if-eqz v4, :cond_16
/* .line 51 */
v4 = this.h;
v4 = (( android.view.ViewGroup ) v4 ).getOverScrollMode ( ); // invoke-virtual {v4}, Landroid/view/ViewGroup;->getOverScrollMode()I
/* if-eq v4, v5, :cond_15 */
/* .line 52 */
v1 = (( android.widget.OverScroller ) v1 ).getCurrVelocity ( ); // invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F
/* float-to-int v1, v1 */
/* if-gez v6, :cond_11 */
/* neg-int v4, v1 */
} // :cond_11
/* if-lez v6, :cond_12 */
/* move v4, v1 */
} // :cond_12
int v4 = 0; // const/4 v4, 0x0
} // :goto_6
/* if-gez v13, :cond_13 */
/* neg-int v1, v1 */
} // :cond_13
/* if-lez v13, :cond_14 */
} // :cond_14
int v1 = 0; // const/4 v1, 0x0
/* .line 53 */
} // :goto_7
v5 = this.h;
(( androidx.recyclerview.widget.RecyclerView ) v5 ).a ( v4, v1 ); // invoke-virtual {v5, v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->a(II)V
/* .line 54 */
} // :cond_15
/* sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->D0:Z */
if ( v1 != null) { // if-eqz v1, :cond_17
/* .line 55 */
v1 = this.h;
v1 = this.h0;
(( c.r.d.u$a ) v1 ).a ( ); // invoke-virtual {v1}, Lc/r/d/u$a;->a()V
/* .line 56 */
} // :cond_16
/* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$c0;->b()V */
/* .line 57 */
v1 = this.h;
v4 = this.g0;
if ( v4 != null) { // if-eqz v4, :cond_17
/* .line 58 */
(( c.r.d.u ) v4 ).a ( v1, v8, v7 ); // invoke-virtual {v4, v1, v8, v7}, Lc/r/d/u;->a(Landroidx/recyclerview/widget/RecyclerView;II)V
/* .line 59 */
} // :cond_17
} // :goto_8
v1 = this.h;
v1 = this.n;
v1 = this.g;
if ( v1 != null) { // if-eqz v1, :cond_18
/* .line 60 */
v4 = (( androidx.recyclerview.widget.RecyclerView$z ) v1 ).b ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$z;->b()Z
if ( v4 != null) { // if-eqz v4, :cond_18
/* .line 61 */
(( androidx.recyclerview.widget.RecyclerView$z ) v1 ).a ( v2, v2 ); // invoke-virtual {v1, v2, v2}, Landroidx/recyclerview/widget/RecyclerView$z;->a(II)V
/* .line 62 */
} // :cond_18
/* iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView$c0;->f:Z */
/* .line 63 */
/* iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView$c0;->g:Z */
if ( v1 != null) { // if-eqz v1, :cond_19
/* .line 64 */
/* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/RecyclerView$c0;->a()V */
/* .line 65 */
} // :cond_19
v1 = this.h;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).setScrollState ( v2 ); // invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V
/* .line 66 */
v1 = this.h;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->a(I)V
} // :goto_9
return;
} // .end method
