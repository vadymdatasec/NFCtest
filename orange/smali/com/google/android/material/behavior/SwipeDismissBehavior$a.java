public class com.google.android.material.behavior.SwipeDismissBehavior$a extends c.j.b.c$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/behavior/SwipeDismissBehavior; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public Integer a;
public Integer b;
public final com.google.android.material.behavior.SwipeDismissBehavior c; //synthetic
/* # direct methods */
public com.google.android.material.behavior.SwipeDismissBehavior$a ( ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
/* invoke-direct {p0}, Lc/j/b/c$a;-><init>()V */
int p1 = -1; // const/4 p1, -0x1
/* .line 2 */
/* iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->b:I */
return;
} // .end method
/* # virtual methods */
public Integer a ( android.view.View p0 ) {
/* .locals 0 */
/* .line 19 */
p1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
} // .end method
public Integer a ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .line 20 */
p3 = c.h.n.v0 .o ( p1 );
int v0 = 1; // const/4 v0, 0x1
/* if-ne p3, v0, :cond_0 */
int p3 = 1; // const/4 p3, 0x1
} // :cond_0
int p3 = 0; // const/4 p3, 0x0
/* .line 21 */
} // :goto_0
v1 = this.c;
/* iget v1, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->f:I */
/* if-nez v1, :cond_2 */
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 22 */
/* iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
p1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* sub-int/2addr p3, p1 */
/* .line 23 */
/* iget p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
/* .line 24 */
} // :cond_1
/* iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
/* .line 25 */
p1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
} // :goto_1
/* add-int/2addr p1, p3 */
} // :cond_2
/* if-ne v1, v0, :cond_4 */
if ( p3 != null) { // if-eqz p3, :cond_3
/* .line 26 */
/* iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
/* .line 27 */
p1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* .line 28 */
} // :cond_3
/* iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
p1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* sub-int/2addr p3, p1 */
/* .line 29 */
/* iget p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
/* .line 30 */
} // :cond_4
/* iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
v0 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* sub-int/2addr p3, v0 */
/* .line 31 */
/* iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
p1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* add-int/2addr p1, v0 */
/* .line 32 */
} // :goto_2
p1 = com.google.android.material.behavior.SwipeDismissBehavior .a ( p3,p2,p1 );
} // .end method
public void a ( android.view.View p0, Float p1, Float p2 ) {
/* .locals 2 */
int p3 = -1; // const/4 p3, -0x1
/* .line 5 */
/* iput p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->b:I */
/* .line 6 */
p3 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* .line 7 */
p2 = (( com.google.android.material.behavior.SwipeDismissBehavior$a ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a(Landroid/view/View;F)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 8 */
p2 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
/* if-ge p2, v0, :cond_0 */
/* sub-int/2addr v0, p3 */
} // :cond_0
/* add-int/2addr v0, p3 */
} // :goto_0
int p2 = 1; // const/4 p2, 0x1
/* .line 9 */
} // :cond_1
/* iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
int p2 = 0; // const/4 p2, 0x0
/* .line 10 */
} // :goto_1
p3 = this.c;
p3 = this.a;
v1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
p3 = (( c.j.b.c ) p3 ).d ( v0, v1 ); // invoke-virtual {p3, v0, v1}, Lc/j/b/c;->d(II)Z
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 11 */
/* new-instance p3, Lcom/google/android/material/behavior/SwipeDismissBehavior$c; */
v0 = this.c;
/* invoke-direct {p3, v0, p1, p2}, Lcom/google/android/material/behavior/SwipeDismissBehavior$c;-><init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V */
c.h.n.v0 .a ( p1,p3 );
} // :cond_2
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 12 */
p2 = this.c;
p2 = this.b;
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 13 */
} // :cond_3
} // :goto_2
return;
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* iput p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->b:I */
/* .line 2 */
p2 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* iput p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
/* .line 3 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
if ( p1 != null) { // if-eqz p1, :cond_0
int p2 = 1; // const/4 p2, 0x1
/* .line 4 */
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 2 */
/* .line 33 */
/* iget p3, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
/* int-to-float p3, p3 */
/* .line 34 */
p4 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* int-to-float p4, p4 */
p5 = this.c;
/* iget p5, p5, Lcom/google/android/material/behavior/SwipeDismissBehavior;->h:F */
/* mul-float p4, p4, p5 */
/* add-float/2addr p3, p4 */
/* .line 35 */
/* iget p4, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
/* int-to-float p4, p4 */
/* .line 36 */
p5 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* int-to-float p5, p5 */
v0 = this.c;
/* iget v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->i:F */
/* mul-float p5, p5, v0 */
/* add-float/2addr p4, p5 */
/* int-to-float p2, p2 */
/* const/high16 p5, 0x3f800000 # 1.0f */
/* cmpg-float v0, p2, p3 */
/* if-gtz v0, :cond_0 */
/* .line 37 */
(( android.view.View ) p1 ).setAlpha ( p5 ); // invoke-virtual {p1, p5}, Landroid/view/View;->setAlpha(F)V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v1, p2, p4 */
/* if-ltz v1, :cond_1 */
/* .line 38 */
(( android.view.View ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V
/* .line 39 */
} // :cond_1
p2 = com.google.android.material.behavior.SwipeDismissBehavior .b ( p3,p4,p2 );
/* sub-float p2, p5, p2 */
/* .line 40 */
p2 = com.google.android.material.behavior.SwipeDismissBehavior .a ( v0,p2,p5 );
(( android.view.View ) p1 ).setAlpha ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V
} // :goto_0
return;
} // .end method
public final Boolean a ( android.view.View p0, Float p1 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* cmpl-float v3, p2, v0 */
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 14 */
p1 = c.h.n.v0 .o ( p1 );
/* if-ne p1, v2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 15 */
} // :goto_0
v4 = this.c;
/* iget v4, v4, Lcom/google/android/material/behavior/SwipeDismissBehavior;->f:I */
int v5 = 2; // const/4 v5, 0x2
/* if-ne v4, v5, :cond_1 */
} // :cond_1
/* if-nez v4, :cond_4 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* cmpg-float p1, p2, v0 */
/* if-gez p1, :cond_3 */
} // :cond_2
/* if-lez v3, :cond_3 */
} // :goto_1
int v1 = 1; // const/4 v1, 0x1
} // :cond_3
} // :cond_4
/* if-ne v4, v2, :cond_6 */
if ( p1 != null) { // if-eqz p1, :cond_5
/* if-lez v3, :cond_6 */
} // :cond_5
/* cmpg-float p1, p2, v0 */
/* if-gez p1, :cond_6 */
} // :goto_2
int v1 = 1; // const/4 v1, 0x1
} // :cond_6
/* .line 16 */
} // :cond_7
p2 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->a:I */
/* sub-int/2addr p2, v0 */
/* .line 17 */
p1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* int-to-float p1, p1 */
v0 = this.c;
/* iget v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->g:F */
/* mul-float p1, p1, v0 */
p1 = java.lang.Math .round ( p1 );
/* .line 18 */
p2 = java.lang.Math .abs ( p2 );
/* if-lt p2, p1, :cond_8 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_8
} // .end method
public Integer b ( android.view.View p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 2 */
p1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
} // .end method
public Boolean b ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* iget p2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;->b:I */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p2, v0, :cond_0 */
p2 = this.c;
p1 = (( com.google.android.material.behavior.SwipeDismissBehavior ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a(Landroid/view/View;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void c ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
return;
} // .end method
