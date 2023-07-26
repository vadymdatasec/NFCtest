public class c.l.d.l0 extends android.view.animation.AnimationSet implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.ViewGroup b;
	 public final android.view.View c;
	 public Boolean d;
	 public Boolean e;
	 public Boolean f;
	 /* # direct methods */
	 public c.l.d.l0 ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/l/d/l0;->f:Z */
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 /* .line 5 */
		 (( android.view.animation.AnimationSet ) p0 ).addAnimation ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
		 /* .line 6 */
		 p1 = this.b;
		 (( android.view.ViewGroup ) p1 ).post ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean getTransformation ( Long p0, android.view.animation.Transformation p1 ) {
		 /* .locals 2 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 1 */
		 /* iput-boolean v0, p0, Lc/l/d/l0;->f:Z */
		 /* .line 2 */
		 /* iget-boolean v1, p0, Lc/l/d/l0;->d:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 3 */
			 /* iget-boolean p1, p0, Lc/l/d/l0;->e:Z */
			 /* xor-int/2addr p1, v0 */
			 /* .line 4 */
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1, p2, p3}, Landroid/view/animation/AnimationSet;->getTransformation(JLandroid/view/animation/Transformation;)Z */
		 /* if-nez p1, :cond_1 */
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lc/l/d/l0;->d:Z */
		 /* .line 6 */
		 p1 = this.b;
		 c.h.n.y .a ( p1,p0 );
	 } // :cond_1
} // .end method
public Boolean getTransformation ( Long p0, android.view.animation.Transformation p1, Float p2 ) {
	 /* .locals 2 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 7 */
	 /* iput-boolean v0, p0, Lc/l/d/l0;->f:Z */
	 /* .line 8 */
	 /* iget-boolean v1, p0, Lc/l/d/l0;->d:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 9 */
		 /* iget-boolean p1, p0, Lc/l/d/l0;->e:Z */
		 /* xor-int/2addr p1, v0 */
		 /* .line 10 */
	 } // :cond_0
	 p1 = 	 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/AnimationSet;->getTransformation(JLandroid/view/animation/Transformation;F)Z */
	 /* if-nez p1, :cond_1 */
	 /* .line 11 */
	 /* iput-boolean v0, p0, Lc/l/d/l0;->d:Z */
	 /* .line 12 */
	 p1 = this.b;
	 c.h.n.y .a ( p1,p0 );
} // :cond_1
} // .end method
public void run ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/l/d/l0;->d:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lc/l/d/l0;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput-boolean v0, p0, Lc/l/d/l0;->f:Z */
	 /* .line 3 */
	 v0 = this.b;
	 (( android.view.ViewGroup ) v0 ).post ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
	 /* .line 4 */
} // :cond_0
v0 = this.b;
v1 = this.c;
(( android.view.ViewGroup ) v0 ).endViewTransition ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Lc/l/d/l0;->e:Z */
} // :goto_0
return;
} // .end method
