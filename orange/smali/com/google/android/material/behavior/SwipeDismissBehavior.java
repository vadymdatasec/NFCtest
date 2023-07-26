public class com.google.android.material.behavior.SwipeDismissBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/android/material/behavior/SwipeDismissBehavior$c;, */
	 /* Lcom/google/android/material/behavior/SwipeDismissBehavior$b; */
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
public c.j.b.c a;
public com.google.android.material.behavior.SwipeDismissBehavior$b b;
public Boolean c;
public Float d;
public Boolean e;
public Integer f;
public Float g;
public Float h;
public Float i;
public final c.j.b.c$a j;
/* # direct methods */
public com.google.android.material.behavior.SwipeDismissBehavior ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:F */
int v1 = 2; // const/4 v1, 0x2
/* .line 3 */
/* iput v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->f:I */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* .line 4 */
/* iput v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->g:F */
/* .line 5 */
/* iput v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->h:F */
/* .line 6 */
/* iput v1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->i:F */
/* .line 7 */
/* new-instance v0, Lcom/google/android/material/behavior/SwipeDismissBehavior$a; */
/* invoke-direct {v0, p0}, Lcom/google/android/material/behavior/SwipeDismissBehavior$a;-><init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;)V */
this.j = v0;
return;
} // .end method
public static Float a ( Float p0, Float p1, Float p2 ) {
/* .locals 0 */
/* .line 14 */
p0 = java.lang.Math .max ( p0,p1 );
p0 = java.lang.Math .min ( p0,p2 );
} // .end method
public static Integer a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 15 */
p0 = java.lang.Math .max ( p0,p1 );
p0 = java.lang.Math .min ( p0,p2 );
} // .end method
public static Float b ( Float p0, Float p1, Float p2 ) {
/* .locals 0 */
/* sub-float/2addr p2, p0 */
/* sub-float/2addr p1, p0 */
/* div-float/2addr p2, p1 */
} // .end method
/* # virtual methods */
public void a ( Float p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* const/high16 v1, 0x3f800000 # 1.0f */
/* .line 3 */
p1 = com.google.android.material.behavior.SwipeDismissBehavior .a ( v0,p1,v1 );
/* iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->i:F */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* .line 2 */
/* iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->f:I */
return;
} // .end method
public final void a ( android.view.ViewGroup p0 ) {
/* .locals 2 */
/* .line 10 */
v0 = this.a;
/* if-nez v0, :cond_1 */
/* .line 11 */
/* iget-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:F */
	 v1 = this.j;
	 /* .line 12 */
	 c.j.b.c .a ( p1,v0,v1 );
} // :cond_0
v0 = this.j;
/* .line 13 */
c.j.b.c .a ( p1,v0 );
} // :goto_0
this.a = p1;
} // :cond_1
return;
} // .end method
public void a ( com.google.android.material.behavior.SwipeDismissBehavior$b p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
public Boolean a ( android.view.View p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.MotionEvent p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", */
/* "TV;", */
/* "Landroid/view/MotionEvent;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 4 */
/* iget-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->c:Z */
/* .line 5 */
v1 = (( android.view.MotionEvent ) p3 ).getActionMasked ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
int p2 = 1; // const/4 p2, 0x1
/* if-eq v1, p2, :cond_0 */
int p2 = 3; // const/4 p2, 0x3
/* if-eq v1, p2, :cond_0 */
/* .line 6 */
} // :cond_0
/* iput-boolean v2, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->c:Z */
/* .line 7 */
} // :cond_1
v0 = (( android.view.MotionEvent ) p3 ).getX ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
v1 = (( android.view.MotionEvent ) p3 ).getY ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v1, v1 */
v0 = (( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).a ( p2, v0, v1 ); // invoke-virtual {p1, p2, v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;II)Z
/* iput-boolean v0, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->c:Z */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 8 */
(( com.google.android.material.behavior.SwipeDismissBehavior ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a(Landroid/view/ViewGroup;)V
/* .line 9 */
p1 = this.a;
p1 = (( c.j.b.c ) p1 ).c ( p3 ); // invoke-virtual {p1, p3}, Lc/j/b/c;->c(Landroid/view/MotionEvent;)Z
} // :cond_2
} // .end method
public void b ( Float p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* const/high16 v1, 0x3f800000 # 1.0f */
/* .line 1 */
p1 = com.google.android.material.behavior.SwipeDismissBehavior .a ( v0,p1,v1 );
/* iput p1, p0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->h:F */
return;
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.MotionEvent p2 ) {
/* .locals 0 */
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
p1 = this.a;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.j.b.c ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Lc/j/b/c;->a(Landroid/view/MotionEvent;)V
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
