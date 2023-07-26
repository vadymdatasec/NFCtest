public class c.v.r extends c.v.r1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public c.v.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/v/r1;-><init>()V */
		 /* .line 2 */
		 (( c.v.r1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/v/r1;->a(I)V
		 return;
	 } // .end method
	 public static Float a ( c.v.u0 p0, Float p1 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 8 */
			 p0 = this.a;
			 final String v0 = "android:fade:transitionAlpha"; // const-string v0, "android:fade:transitionAlpha"
			 /* check-cast p0, Ljava/lang/Float; */
			 if ( p0 != null) { // if-eqz p0, :cond_0
				 /* .line 9 */
				 p1 = 				 (( java.lang.Float ) p0 ).floatValue ( ); // invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F
			 } // :cond_0
		 } // .end method
		 /* # virtual methods */
		 public final android.animation.Animator a ( android.view.View p0, Float p1, Float p2 ) {
			 /* .locals 2 */
			 /* cmpl-float v0, p2, p3 */
			 /* if-nez v0, :cond_0 */
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 1 */
		 } // :cond_0
		 c.v.j1 .a ( p1,p2 );
		 /* .line 2 */
		 p2 = c.v.j1.d;
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [F */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput p3, v0, v1 */
		 android.animation.ObjectAnimator .ofFloat ( p1,p2,v0 );
		 /* .line 3 */
		 /* new-instance p3, Lc/v/q; */
		 /* invoke-direct {p3, p1}, Lc/v/q;-><init>(Landroid/view/View;)V */
		 /* .line 4 */
		 (( android.animation.ObjectAnimator ) p2 ).addListener ( p3 ); // invoke-virtual {p2, p3}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
		 /* .line 5 */
		 /* new-instance p3, Lc/v/p; */
		 /* invoke-direct {p3, p0, p1}, Lc/v/p;-><init>(Lc/v/r;Landroid/view/View;)V */
		 (( c.v.k0 ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Lc/v/k0;->a(Lc/v/j0;)Lc/v/k0;
	 } // .end method
	 public android.animation.Animator a ( android.view.ViewGroup p0, android.view.View p1, c.v.u0 p2, c.v.u0 p3 ) {
		 /* .locals 1 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 6 */
		 p3 = 		 c.v.r .a ( p3,p1 );
		 /* const/high16 p4, 0x3f800000 # 1.0f */
		 /* cmpl-float v0, p3, p4 */
		 /* if-nez v0, :cond_0 */
	 } // :cond_0
	 /* move p1, p3 */
	 /* .line 7 */
} // :goto_0
(( c.v.r ) p0 ).a ( p2, p1, p4 ); // invoke-virtual {p0, p2, p1, p4}, Lc/v/r;->a(Landroid/view/View;FF)Landroid/animation/Animator;
} // .end method
public android.animation.Animator b ( android.view.ViewGroup p0, android.view.View p1, c.v.u0 p2, c.v.u0 p3 ) {
/* .locals 0 */
/* .line 1 */
c.v.j1 .e ( p2 );
/* const/high16 p1, 0x3f800000 # 1.0f */
/* .line 2 */
p1 = c.v.r .a ( p3,p1 );
int p3 = 0; // const/4 p3, 0x0
/* .line 3 */
(( c.v.r ) p0 ).a ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Lc/v/r;->a(Landroid/view/View;FF)Landroid/animation/Animator;
} // .end method
public void c ( c.v.u0 p0 ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/v/r1;->c(Lc/v/u0;)V */
/* .line 2 */
v0 = this.a;
p1 = this.b;
/* .line 3 */
p1 = c.v.j1 .c ( p1 );
java.lang.Float .valueOf ( p1 );
final String v1 = "android:fade:transitionAlpha"; // const-string v1, "android:fade:transitionAlpha"
/* .line 4 */
return;
} // .end method
