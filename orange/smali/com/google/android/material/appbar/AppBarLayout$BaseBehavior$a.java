public class com.google.android.material.appbar.AppBarLayout$BaseBehavior$a implements android.animation.ValueAnimator$AnimatorUpdateListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;II)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.coordinatorlayout.widget.CoordinatorLayout a; //synthetic
public final com.google.android.material.appbar.AppBarLayout b; //synthetic
public final com.google.android.material.appbar.AppBarLayout$BaseBehavior c; //synthetic
/* # direct methods */
public com.google.android.material.appbar.AppBarLayout$BaseBehavior$a ( ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
this.a = p2;
this.b = p3;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onAnimationUpdate ( android.animation.ValueAnimator p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
v1 = this.a;
v2 = this.b;
/* .line 2 */
(( android.animation.ValueAnimator ) p1 ).getAnimatedValue ( ); // invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Integer; */
p1 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
/* .line 3 */
(( e.f.a.c.k.b ) v0 ).c ( v1, v2, p1 ); // invoke-virtual {v0, v1, v2, p1}, Le/f/a/c/k/b;->c(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)I
return;
} // .end method
