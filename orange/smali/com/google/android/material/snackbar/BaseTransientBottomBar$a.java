public class com.google.android.material.snackbar.BaseTransientBottomBar$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/android/material/snackbar/BaseTransientBottomBar; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public e.f.a.c.s.t a;
/* # direct methods */
public com.google.android.material.snackbar.BaseTransientBottomBar$a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/android/material/behavior/SwipeDismissBehavior<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* const v0, 0x3dcccccd # 0.1f */
/* .line 2 */
(( com.google.android.material.behavior.SwipeDismissBehavior ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->b(F)V
/* const v0, 0x3f19999a # 0.6f */
/* .line 3 */
(( com.google.android.material.behavior.SwipeDismissBehavior ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a(F)V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
(( com.google.android.material.behavior.SwipeDismissBehavior ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a(I)V
return;
} // .end method
/* # virtual methods */
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.MotionEvent p2 ) {
/* .locals 1 */
/* .line 3 */
v0 = (( android.view.MotionEvent ) p3 ).getActionMasked ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I
if ( v0 != null) { // if-eqz v0, :cond_1
int p1 = 1; // const/4 p1, 0x1
/* if-eq v0, p1, :cond_0 */
int p1 = 3; // const/4 p1, 0x3
/* if-eq v0, p1, :cond_0 */
/* .line 4 */
} // :cond_0
e.f.a.c.s.v .b ( );
p2 = this.a;
(( e.f.a.c.s.v ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Le/f/a/c/s/v;->g(Le/f/a/c/s/t;)V
/* .line 5 */
} // :cond_1
v0 = (( android.view.MotionEvent ) p3 ).getX ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v0, v0 */
p3 = (( android.view.MotionEvent ) p3 ).getY ( ); // invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F
/* float-to-int p3, p3 */
p1 = (( androidx.coordinatorlayout.widget.CoordinatorLayout ) p1 ).a ( p2, v0, p3 ); // invoke-virtual {p1, p2, v0, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;II)Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 6 */
e.f.a.c.s.v .b ( );
p2 = this.a;
(( e.f.a.c.s.v ) p1 ).f ( p2 ); // invoke-virtual {p1, p2}, Le/f/a/c/s/v;->f(Le/f/a/c/s/t;)V
} // :cond_2
} // :goto_0
return;
} // .end method
public void a ( com.google.android.material.snackbar.BaseTransientBottomBar p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/android/material/snackbar/BaseTransientBottomBar<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 1 */
p1 = this.i;
this.a = p1;
return;
} // .end method
public Boolean a ( android.view.View p0 ) {
/* .locals 0 */
/* .line 2 */
/* instance-of p1, p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b; */
} // .end method
