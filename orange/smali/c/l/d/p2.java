public class c.l.d.p2 implements android.transition.Transition$TransitionListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.View a; //synthetic
	 public final java.util.ArrayList b; //synthetic
	 /* # direct methods */
	 public c.l.d.p2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 this.b = p3;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onTransitionCancel ( android.transition.Transition p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onTransitionEnd ( android.transition.Transition p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( android.transition.Transition ) p1 ).removeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/transition/Transition;->removeListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
		 /* .line 2 */
		 p1 = this.a;
		 /* const/16 v0, 0x8 */
		 (( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
		 /* .line 3 */
		 p1 = this.b;
		 p1 = 		 (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-ge v1, p1, :cond_0 */
	 /* .line 4 */
	 v2 = this.b;
	 (( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v2, Landroid/view/View; */
	 (( android.view.View ) v2 ).setVisibility ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public void onTransitionPause ( android.transition.Transition p0 ) {
/* .locals 0 */
return;
} // .end method
public void onTransitionResume ( android.transition.Transition p0 ) {
/* .locals 0 */
return;
} // .end method
public void onTransitionStart ( android.transition.Transition p0 ) {
/* .locals 0 */
/* .line 1 */
(( android.transition.Transition ) p1 ).removeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/transition/Transition;->removeListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
/* .line 2 */
(( android.transition.Transition ) p1 ).addListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/transition/Transition;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
return;
} // .end method
