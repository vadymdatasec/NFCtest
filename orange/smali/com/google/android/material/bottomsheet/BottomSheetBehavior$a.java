public class com.google.android.material.bottomsheet.BottomSheetBehavior$a extends c.j.b.c$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/bottomsheet/BottomSheetBehavior; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final com.google.android.material.bottomsheet.BottomSheetBehavior a; //synthetic
/* # direct methods */
public com.google.android.material.bottomsheet.BottomSheetBehavior$a ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Lc/j/b/c$a;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 29 */
p1 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
} // .end method
public void a ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 7 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v2 = 4; // const/4 v2, 0x4
int v3 = 6; // const/4 v3, 0x6
int v4 = 3; // const/4 v4, 0x3
/* cmpg-float v5, p3, v1 */
/* if-gez v5, :cond_2 */
/* .line 2 */
p2 = this.a;
p2 = com.google.android.material.bottomsheet.BottomSheetBehavior .a ( p2 );
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 3 */
	 p2 = this.a;
	 /* iget p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:I */
	 int v2 = 3; // const/4 v2, 0x3
	 /* goto/16 :goto_4 */
	 /* .line 4 */
} // :cond_0
p2 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* .line 5 */
p3 = this.a;
/* iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I */
/* if-le p2, p3, :cond_1 */
/* move v0, p3 */
} // :goto_0
int v2 = 6; // const/4 v2, 0x6
} // :cond_1
} // :goto_1
int v2 = 3; // const/4 v2, 0x3
} // :goto_2
/* move p2, v0 */
/* goto/16 :goto_4 */
/* .line 6 */
} // :cond_2
v5 = this.a;
/* iget-boolean v6, v5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:Z */
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 7 */
v5 = (( com.google.android.material.bottomsheet.BottomSheetBehavior ) v5 ).a ( p1, p3 ); // invoke-virtual {v5, p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a(Landroid/view/View;F)Z
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 8 */
v5 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
v6 = this.a;
/* iget v6, v6, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* if-gt v5, v6, :cond_3 */
v5 = java.lang.Math .abs ( p2 );
v6 = java.lang.Math .abs ( p3 );
/* cmpg-float v5, v5, v6 */
/* if-gez v5, :cond_4 */
/* .line 9 */
} // :cond_3
p2 = this.a;
/* iget p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
int v2 = 5; // const/4 v2, 0x5
/* goto/16 :goto_4 */
} // :cond_4
/* cmpl-float v1, p3, v1 */
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 10 */
p2 = java.lang.Math .abs ( p2 );
p3 = java.lang.Math .abs ( p3 );
/* cmpl-float p2, p2, p3 */
/* if-lez p2, :cond_5 */
/* .line 11 */
} // :cond_5
p2 = this.a;
/* iget p2, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* .line 12 */
} // :cond_6
} // :goto_3
p2 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* .line 13 */
p3 = this.a;
p3 = com.google.android.material.bottomsheet.BottomSheetBehavior .a ( p3 );
if ( p3 != null) { // if-eqz p3, :cond_8
/* .line 14 */
p3 = this.a;
/* iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:I */
/* sub-int p3, p2, p3 */
p3 = java.lang.Math .abs ( p3 );
v0 = this.a;
/* iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* sub-int/2addr p2, v0 */
/* .line 15 */
p2 = java.lang.Math .abs ( p2 );
/* if-ge p3, p2, :cond_7 */
/* .line 16 */
p2 = this.a;
/* iget v0, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->g:I */
/* .line 17 */
} // :cond_7
p2 = this.a;
/* iget v0, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* .line 18 */
} // :cond_8
p3 = this.a;
/* iget v1, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I */
/* if-ge p2, v1, :cond_a */
/* .line 19 */
/* iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* sub-int p3, p2, p3 */
p3 = java.lang.Math .abs ( p3 );
/* if-ge p2, p3, :cond_9 */
/* .line 20 */
} // :cond_9
p2 = this.a;
/* iget v0, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I */
/* goto/16 :goto_0 */
} // :cond_a
/* sub-int p3, p2, v1 */
/* .line 21 */
p3 = java.lang.Math .abs ( p3 );
v0 = this.a;
/* iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* sub-int/2addr p2, v0 */
/* .line 22 */
p2 = java.lang.Math .abs ( p2 );
/* if-ge p3, p2, :cond_b */
/* .line 23 */
p2 = this.a;
/* iget v0, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h:I */
/* goto/16 :goto_0 */
/* .line 24 */
} // :cond_b
p2 = this.a;
/* iget v0, p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* goto/16 :goto_2 */
/* .line 25 */
} // :goto_4
p3 = this.a;
p3 = this.m;
v0 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
p2 = (( c.j.b.c ) p3 ).d ( v0, p2 ); // invoke-virtual {p3, v0, p2}, Lc/j/b/c;->d(II)Z
if ( p2 != null) { // if-eqz p2, :cond_c
/* .line 26 */
p2 = this.a;
int p3 = 2; // const/4 p3, 0x2
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p2 ).c ( p3 ); // invoke-virtual {p2, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
/* .line 27 */
/* new-instance p2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$d; */
p3 = this.a;
/* invoke-direct {p2, p3, p1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$d;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;I)V */
c.h.n.v0 .a ( p1,p2 );
/* .line 28 */
} // :cond_c
p1 = this.a;
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p1 ).c ( v2 ); // invoke-virtual {p1, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
} // :goto_5
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 1 */
p1 = this.a;
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->a(I)V
return;
} // .end method
public Integer b ( android.view.View p0 ) {
/* .locals 1 */
/* .line 10 */
p1 = this.a;
/* iget-boolean v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
/* iget p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
/* .line 12 */
} // :cond_0
/* iget p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
} // .end method
public Integer b ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .line 7 */
p1 = this.a;
/* .line 8 */
p1 = com.google.android.material.bottomsheet.BottomSheetBehavior .b ( p1 );
p3 = this.a;
/* iget-boolean v0, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:I */
} // :cond_0
/* iget p3, p3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:I */
/* .line 9 */
} // :goto_0
p1 = c.h.i.a .a ( p2,p1,p3 );
} // .end method
public Boolean b ( android.view.View p0, Integer p1 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.a;
/* iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I */
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* if-ne v1, v2, :cond_0 */
/* .line 2 */
} // :cond_0
/* iget-boolean v4, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->x:Z */
if ( v4 != null) { // if-eqz v4, :cond_1
} // :cond_1
int v4 = 3; // const/4 v4, 0x3
/* if-ne v1, v4, :cond_2 */
/* .line 3 */
/* iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I */
/* if-ne v1, p2, :cond_2 */
/* .line 4 */
p2 = this.s;
(( java.lang.ref.WeakReference ) p2 ).get ( ); // invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast p2, Landroid/view/View; */
if ( p2 != null) { // if-eqz p2, :cond_2
int v0 = -1; // const/4 v0, -0x1
/* .line 5 */
p2 = (( android.view.View ) p2 ).canScrollVertically ( v0 ); // invoke-virtual {p2, v0}, Landroid/view/View;->canScrollVertically(I)Z
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 6 */
} // :cond_2
p2 = this.a;
p2 = this.r;
if ( p2 != null) { // if-eqz p2, :cond_3
(( java.lang.ref.WeakReference ) p2 ).get ( ); // invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* if-ne p2, p1, :cond_3 */
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
} // .end method
public void c ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
/* .line 1 */
p1 = this.a;
(( com.google.android.material.bottomsheet.BottomSheetBehavior ) p1 ).c ( v0 ); // invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c(I)V
} // :cond_0
return;
} // .end method
