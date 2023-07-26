public class c.l.d.q2 implements android.transition.Transition$TransitionListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.Object a; //synthetic
	 public final java.util.ArrayList b; //synthetic
	 public final java.lang.Object c; //synthetic
	 public final java.util.ArrayList d; //synthetic
	 public final java.lang.Object e; //synthetic
	 public final java.util.ArrayList f; //synthetic
	 public final c.l.d.t2 g; //synthetic
	 /* # direct methods */
	 public c.l.d.q2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.g = p1;
		 this.a = p2;
		 this.b = p3;
		 this.c = p4;
		 this.d = p5;
		 this.e = p6;
		 this.f = p7;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onTransitionCancel ( android.transition.Transition p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onTransitionEnd ( android.transition.Transition p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.transition.Transition ) p1 ).removeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/transition/Transition;->removeListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;
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
		 /* .locals 3 */
		 /* .line 1 */
		 p1 = this.a;
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 v1 = this.g;
			 v2 = this.b;
			 (( c.l.d.t2 ) v1 ).a ( p1, v2, v0 ); // invoke-virtual {v1, p1, v2, v0}, Lc/l/d/t2;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
			 /* .line 3 */
		 } // :cond_0
		 p1 = this.c;
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 4 */
			 v1 = this.g;
			 v2 = this.d;
			 (( c.l.d.t2 ) v1 ).a ( p1, v2, v0 ); // invoke-virtual {v1, p1, v2, v0}, Lc/l/d/t2;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
			 /* .line 5 */
		 } // :cond_1
		 p1 = this.e;
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 6 */
			 v1 = this.g;
			 v2 = this.f;
			 (( c.l.d.t2 ) v1 ).a ( p1, v2, v0 ); // invoke-virtual {v1, p1, v2, v0}, Lc/l/d/t2;->a(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
		 } // :cond_2
		 return;
	 } // .end method
