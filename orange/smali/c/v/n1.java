public class c.v.n1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public c.v.n1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0 ) {
		 /* .locals 2 */
		 /* .line 4 */
		 v0 = 		 (( android.view.View ) p1 ).getVisibility ( ); // invoke-virtual {p1}, Landroid/view/View;->getVisibility()I
		 /* if-nez v0, :cond_0 */
		 /* .line 5 */
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.view.View ) p1 ).setTag ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
	 } // :cond_0
	 return;
} // .end method
public void a ( android.view.View p0, Float p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( android.view.View ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/Float; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 v0 = 		 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
		 /* mul-float v0, v0, p2 */
		 (( android.view.View ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V
		 /* .line 3 */
	 } // :cond_0
	 (( android.view.View ) p1 ).setAlpha ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V
} // :goto_0
return;
} // .end method
public void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 15 */
(( android.view.View ) p1 ).setLeft ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->setLeft(I)V
/* .line 16 */
(( android.view.View ) p1 ).setTop ( p3 ); // invoke-virtual {p1, p3}, Landroid/view/View;->setTop(I)V
/* .line 17 */
(( android.view.View ) p1 ).setRight ( p4 ); // invoke-virtual {p1, p4}, Landroid/view/View;->setRight(I)V
/* .line 18 */
(( android.view.View ) p1 ).setBottom ( p5 ); // invoke-virtual {p1, p5}, Landroid/view/View;->setBottom(I)V
return;
} // .end method
public void a ( android.view.View p0, android.graphics.Matrix p1 ) {
/* .locals 2 */
/* .line 6 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 7 */
/* instance-of v1, v0, Landroid/view/View; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 8 */
	 /* check-cast v0, Landroid/view/View; */
	 /* .line 9 */
	 (( c.v.n1 ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lc/v/n1;->a(Landroid/view/View;Landroid/graphics/Matrix;)V
	 /* .line 10 */
	 v1 = 	 (( android.view.View ) v0 ).getScrollX ( ); // invoke-virtual {v0}, Landroid/view/View;->getScrollX()I
	 /* neg-int v1, v1 */
	 /* int-to-float v1, v1 */
	 v0 = 	 (( android.view.View ) v0 ).getScrollY ( ); // invoke-virtual {v0}, Landroid/view/View;->getScrollY()I
	 /* neg-int v0, v0 */
	 /* int-to-float v0, v0 */
	 (( android.graphics.Matrix ) p2 ).preTranslate ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z
	 /* .line 11 */
} // :cond_0
v0 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* int-to-float v0, v0 */
v1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* int-to-float v1, v1 */
(( android.graphics.Matrix ) p2 ).preTranslate ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 12 */
(( android.view.View ) p1 ).getMatrix ( ); // invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;
/* .line 13 */
v0 = (( android.graphics.Matrix ) p1 ).isIdentity ( ); // invoke-virtual {p1}, Landroid/graphics/Matrix;->isIdentity()Z
/* if-nez v0, :cond_1 */
/* .line 14 */
(( android.graphics.Matrix ) p2 ).preConcat ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z
} // :cond_1
return;
} // .end method
public Float b ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.view.View ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Float; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = (( android.view.View ) p1 ).getAlpha ( ); // invoke-virtual {p1}, Landroid/view/View;->getAlpha()F
v0 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
/* div-float/2addr p1, v0 */
/* .line 3 */
} // :cond_0
p1 = (( android.view.View ) p1 ).getAlpha ( ); // invoke-virtual {p1}, Landroid/view/View;->getAlpha()F
} // .end method
public void b ( android.view.View p0, android.graphics.Matrix p1 ) {
/* .locals 2 */
/* .line 4 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 5 */
/* instance-of v1, v0, Landroid/view/View; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 6 */
/* check-cast v0, Landroid/view/View; */
/* .line 7 */
(( c.v.n1 ) p0 ).b ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lc/v/n1;->b(Landroid/view/View;Landroid/graphics/Matrix;)V
/* .line 8 */
v1 = (( android.view.View ) v0 ).getScrollX ( ); // invoke-virtual {v0}, Landroid/view/View;->getScrollX()I
/* int-to-float v1, v1 */
v0 = (( android.view.View ) v0 ).getScrollY ( ); // invoke-virtual {v0}, Landroid/view/View;->getScrollY()I
/* int-to-float v0, v0 */
(( android.graphics.Matrix ) p2 ).postTranslate ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z
/* .line 9 */
} // :cond_0
v0 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* int-to-float v0, v0 */
v1 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* int-to-float v1, v1 */
(( android.graphics.Matrix ) p2 ).postTranslate ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z
/* .line 10 */
(( android.view.View ) p1 ).getMatrix ( ); // invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;
/* .line 11 */
v0 = (( android.graphics.Matrix ) p1 ).isIdentity ( ); // invoke-virtual {p1}, Landroid/graphics/Matrix;->isIdentity()Z
/* if-nez v0, :cond_1 */
/* .line 12 */
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
/* .line 13 */
p1 = (( android.graphics.Matrix ) p1 ).invert ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 14 */
(( android.graphics.Matrix ) p2 ).postConcat ( v0 ); // invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z
} // :cond_1
return;
} // .end method
public void c ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.view.View ) p1 ).getTag ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;
/* if-nez v0, :cond_0 */
/* .line 2 */
v1 = (( android.view.View ) p1 ).getAlpha ( ); // invoke-virtual {p1}, Landroid/view/View;->getAlpha()F
java.lang.Float .valueOf ( v1 );
(( android.view.View ) p1 ).setTag ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
} // :cond_0
return;
} // .end method
