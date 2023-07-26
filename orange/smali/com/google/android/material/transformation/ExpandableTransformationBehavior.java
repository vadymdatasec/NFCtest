public abstract class com.google.android.material.transformation.ExpandableTransformationBehavior extends com.google.android.material.transformation.ExpandableBehavior {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.animation.AnimatorSet b;
	 /* # direct methods */
	 public com.google.android.material.transformation.ExpandableTransformationBehavior ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lcom/google/android/material/transformation/ExpandableBehavior;-><init>()V */
		 return;
	 } // .end method
	 public com.google.android.material.transformation.ExpandableTransformationBehavior ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/ExpandableBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public static android.animation.AnimatorSet a ( com.google.android.material.transformation.ExpandableTransformationBehavior p0, android.animation.AnimatorSet p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3 ) {
		 /* .locals 3 */
		 /* .line 2 */
		 v0 = this.b;
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 3 */
		 v2 = this.b;
		 (( android.animation.AnimatorSet ) v2 ).cancel ( ); // invoke-virtual {v2}, Landroid/animation/AnimatorSet;->cancel()V
		 /* .line 4 */
	 } // :cond_1
	 (( com.google.android.material.transformation.ExpandableTransformationBehavior ) p0 ).b ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;->b(Landroid/view/View;Landroid/view/View;ZZ)Landroid/animation/AnimatorSet;
	 this.b = p1;
	 /* .line 5 */
	 /* new-instance p2, Lcom/google/android/material/transformation/ExpandableTransformationBehavior$a; */
	 /* invoke-direct {p2, p0}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior$a;-><init>(Lcom/google/android/material/transformation/ExpandableTransformationBehavior;)V */
	 (( android.animation.AnimatorSet ) p1 ).addListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V
	 /* .line 6 */
	 p1 = this.b;
	 (( android.animation.AnimatorSet ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V
	 /* if-nez p4, :cond_2 */
	 /* .line 7 */
	 p1 = this.b;
	 (( android.animation.AnimatorSet ) p1 ).end ( ); // invoke-virtual {p1}, Landroid/animation/AnimatorSet;->end()V
} // :cond_2
} // .end method
public abstract android.animation.AnimatorSet b ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3 ) {
} // .end method
