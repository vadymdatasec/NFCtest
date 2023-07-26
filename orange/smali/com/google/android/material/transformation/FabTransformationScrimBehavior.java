public class com.google.android.material.transformation.FabTransformationScrimBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.a.c.j.e c;
	 public final e.f.a.c.j.e d;
	 /* # direct methods */
	 public com.google.android.material.transformation.FabTransformationScrimBehavior ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Le/f/a/c/j/e; */
		 /* const-wide/16 v1, 0x96 */
		 /* const-wide/16 v3, 0x4b */
		 /* invoke-direct {v0, v3, v4, v1, v2}, Le/f/a/c/j/e;-><init>(JJ)V */
		 this.c = v0;
		 /* .line 3 */
		 /* new-instance v0, Le/f/a/c/j/e; */
		 /* const-wide/16 v3, 0x0 */
		 /* invoke-direct {v0, v3, v4, v1, v2}, Le/f/a/c/j/e;-><init>(JJ)V */
		 this.d = v0;
		 return;
	 } // .end method
	 public com.google.android.material.transformation.FabTransformationScrimBehavior ( ) {
		 /* .locals 4 */
		 /* .line 4 */
		 /* invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 5 */
		 /* new-instance p1, Le/f/a/c/j/e; */
		 /* const-wide/16 v0, 0x96 */
		 /* const-wide/16 v2, 0x4b */
		 /* invoke-direct {p1, v2, v3, v0, v1}, Le/f/a/c/j/e;-><init>(JJ)V */
		 this.c = p1;
		 /* .line 6 */
		 /* new-instance p1, Le/f/a/c/j/e; */
		 /* const-wide/16 v2, 0x0 */
		 /* invoke-direct {p1, v2, v3, v0, v1}, Le/f/a/c/j/e;-><init>(JJ)V */
		 this.d = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( android.view.View p0, Boolean p1, Boolean p2, java.util.List p3, java.util.List p4 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/view/View;", */
		 /* "ZZ", */
		 /* "Ljava/util/List<", */
		 /* "Landroid/animation/Animator;", */
		 /* ">;", */
		 /* "Ljava/util/List<", */
		 /* "Landroid/animation/Animator$AnimatorListener;", */
		 /* ">;)V" */
		 /* } */
	 } // .end annotation
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 1 */
		 p5 = this.c;
	 } // :cond_0
	 p5 = this.d;
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
if ( p2 != null) { // if-eqz p2, :cond_2
	 /* if-nez p3, :cond_1 */
	 /* .line 2 */
	 (( android.view.View ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V
	 /* .line 3 */
} // :cond_1
p2 = android.view.View.ALPHA;
/* new-array p3, v2, [F */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* aput v0, p3, v1 */
android.animation.ObjectAnimator .ofFloat ( p1,p2,p3 );
/* .line 4 */
} // :cond_2
p2 = android.view.View.ALPHA;
/* new-array p3, v2, [F */
/* aput v0, p3, v1 */
android.animation.ObjectAnimator .ofFloat ( p1,p2,p3 );
/* .line 5 */
} // :goto_1
(( e.f.a.c.j.e ) p5 ).a ( p1 ); // invoke-virtual {p5, p1}, Le/f/a/c/j/e;->a(Landroid/animation/Animator;)V
/* .line 6 */
return;
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.animation.AnimatorSet b ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3 ) {
/* .locals 6 */
/* .line 2 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
/* .line 3 */
/* new-instance v5, Ljava/util/ArrayList; */
/* invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V */
/* move-object v0, p0 */
/* move-object v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move-object v4, p1 */
/* .line 4 */
/* invoke-virtual/range {v0 ..v5}, Lcom/google/android/material/transformation/FabTransformationScrimBehavior;->a(Landroid/view/View;ZZLjava/util/List;Ljava/util/List;)V */
/* .line 5 */
/* new-instance p4, Landroid/animation/AnimatorSet; */
/* invoke-direct {p4}, Landroid/animation/AnimatorSet;-><init>()V */
/* .line 6 */
e.f.a.c.j.b .a ( p4,p1 );
/* .line 7 */
/* new-instance p1, Lcom/google/android/material/transformation/FabTransformationScrimBehavior$a; */
/* invoke-direct {p1, p0, p3, p2}, Lcom/google/android/material/transformation/FabTransformationScrimBehavior$a;-><init>(Lcom/google/android/material/transformation/FabTransformationScrimBehavior;ZLandroid/view/View;)V */
(( android.animation.AnimatorSet ) p4 ).addListener ( p1 ); // invoke-virtual {p4, p1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V
} // .end method
public Boolean b ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.MotionEvent p2 ) {
/* .locals 0 */
/* .line 1 */
p1 = /* invoke-super {p0, p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$b;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z */
} // .end method
