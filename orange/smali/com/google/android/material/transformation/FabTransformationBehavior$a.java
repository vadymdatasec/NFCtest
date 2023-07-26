public class com.google.android.material.transformation.FabTransformationBehavior$a extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/android/material/transformation/FabTransformationBehavior;->b(Landroid/view/View;Landroid/view/View;ZZ)Landroid/animation/AnimatorSet; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final Boolean a; //synthetic
public final android.view.View b; //synthetic
public final android.view.View c; //synthetic
/* # direct methods */
public com.google.android.material.transformation.FabTransformationBehavior$a ( ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p2, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$a;->a:Z */
this.b = p3;
this.c = p4;
/* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onAnimationEnd ( android.animation.Animator p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$a;->a:Z */
/* if-nez p1, :cond_0 */
/* .line 2 */
p1 = this.b;
int v0 = 4; // const/4 v0, 0x4
(( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
/* .line 3 */
p1 = this.c;
/* const/high16 v0, 0x3f800000 # 1.0f */
(( android.view.View ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V
/* .line 4 */
p1 = this.c;
int v0 = 0; // const/4 v0, 0x0
(( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
} // :cond_0
return;
} // .end method
public void onAnimationStart ( android.animation.Animator p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$a;->a:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
p1 = this.b;
int v0 = 0; // const/4 v0, 0x0
(( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
/* .line 3 */
p1 = this.c;
int v0 = 0; // const/4 v0, 0x0
(( android.view.View ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V
/* .line 4 */
p1 = this.c;
int v0 = 4; // const/4 v0, 0x4
(( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
} // :cond_0
return;
} // .end method
