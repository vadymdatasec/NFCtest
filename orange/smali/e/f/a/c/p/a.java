public abstract class e.f.a.c.p.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.ThreadLocal a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ThreadLocal<", */
	 /* "Landroid/graphics/Matrix;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.lang.ThreadLocal b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ThreadLocal<", */
/* "Landroid/graphics/RectF;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.a.c.p.a ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
return;
} // .end method
public static void a ( android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
v1 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
int v2 = 0; // const/4 v2, 0x0
(( android.graphics.Rect ) p2 ).set ( v2, v2, v0, v1 ); // invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V
/* .line 2 */
e.f.a.c.p.a .b ( p0,p1,p2 );
return;
} // .end method
public static void a ( android.view.ViewParent p0, android.view.View p1, android.graphics.Matrix p2 ) {
/* .locals 2 */
/* .line 3 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* .line 4 */
/* instance-of v1, v0, Landroid/view/View; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-eq v0, p0, :cond_0 */
/* .line 5 */
/* check-cast v0, Landroid/view/View; */
/* .line 6 */
e.f.a.c.p.a .a ( p0,v0,p2 );
/* .line 7 */
p0 = (( android.view.View ) v0 ).getScrollX ( ); // invoke-virtual {v0}, Landroid/view/View;->getScrollX()I
/* neg-int p0, p0 */
/* int-to-float p0, p0 */
v0 = (( android.view.View ) v0 ).getScrollY ( ); // invoke-virtual {v0}, Landroid/view/View;->getScrollY()I
/* neg-int v0, v0 */
/* int-to-float v0, v0 */
(( android.graphics.Matrix ) p2 ).preTranslate ( p0, v0 ); // invoke-virtual {p2, p0, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 8 */
} // :cond_0
p0 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* int-to-float p0, p0 */
v0 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* int-to-float v0, v0 */
(( android.graphics.Matrix ) p2 ).preTranslate ( p0, v0 ); // invoke-virtual {p2, p0, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 9 */
(( android.view.View ) p1 ).getMatrix ( ); // invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;
p0 = (( android.graphics.Matrix ) p0 ).isIdentity ( ); // invoke-virtual {p0}, Landroid/graphics/Matrix;->isIdentity()Z
/* if-nez p0, :cond_1 */
/* .line 10 */
(( android.view.View ) p1 ).getMatrix ( ); // invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;
(( android.graphics.Matrix ) p2 ).preConcat ( p0 ); // invoke-virtual {p2, p0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z
} // :cond_1
return;
} // .end method
public static void b ( android.view.ViewGroup p0, android.view.View p1, android.graphics.Rect p2 ) {
/* .locals 3 */
/* .line 1 */
v0 = e.f.a.c.p.a.a;
(( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Matrix; */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
/* .line 3 */
v1 = e.f.a.c.p.a.a;
(( java.lang.ThreadLocal ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
/* .line 4 */
} // :cond_0
(( android.graphics.Matrix ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V
/* .line 5 */
} // :goto_0
e.f.a.c.p.a .a ( p0,p1,v0 );
/* .line 6 */
p0 = e.f.a.c.p.a.b;
(( java.lang.ThreadLocal ) p0 ).get ( ); // invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast p0, Landroid/graphics/RectF; */
/* if-nez p0, :cond_1 */
/* .line 7 */
/* new-instance p0, Landroid/graphics/RectF; */
/* invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V */
/* .line 8 */
p1 = e.f.a.c.p.a.b;
(( java.lang.ThreadLocal ) p1 ).set ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
/* .line 9 */
} // :cond_1
(( android.graphics.RectF ) p0 ).set ( p2 ); // invoke-virtual {p0, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V
/* .line 10 */
(( android.graphics.Matrix ) v0 ).mapRect ( p0 ); // invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z
/* .line 11 */
/* iget p1, p0, Landroid/graphics/RectF;->left:F */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* add-float/2addr p1, v0 */
/* float-to-int p1, p1 */
/* iget v1, p0, Landroid/graphics/RectF;->top:F */
/* add-float/2addr v1, v0 */
/* float-to-int v1, v1 */
/* iget v2, p0, Landroid/graphics/RectF;->right:F */
/* add-float/2addr v2, v0 */
/* float-to-int v2, v2 */
/* iget p0, p0, Landroid/graphics/RectF;->bottom:F */
/* add-float/2addr p0, v0 */
/* float-to-int p0, p0 */
(( android.graphics.Rect ) p2 ).set ( p1, v1, v2, p0 ); // invoke-virtual {p2, p1, v1, v2, p0}, Landroid/graphics/Rect;->set(IIII)V
return;
} // .end method
