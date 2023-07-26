public class c.v.d1 extends android.view.ViewGroup {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.view.ViewGroup b;
	 public android.view.View c;
	 public java.util.ArrayList d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Landroid/graphics/drawable/Drawable;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public c.v.e1 e;
/* # direct methods */
public static c.v.d1 ( ) {
/* .locals 5 */
/* .line 1 */
try { // :try_start_0
	 /* const-class v0, Landroid/view/ViewGroup; */
	 final String v1 = "invalidateChildInParentFast"; // const-string v1, "invalidateChildInParentFast"
	 int v2 = 3; // const/4 v2, 0x3
	 /* new-array v2, v2, [Ljava/lang/Class; */
	 int v3 = 0; // const/4 v3, 0x0
	 v4 = java.lang.Integer.TYPE;
	 /* aput-object v4, v2, v3 */
	 int v3 = 1; // const/4 v3, 0x1
	 v4 = java.lang.Integer.TYPE;
	 /* aput-object v4, v2, v3 */
	 int v3 = 2; // const/4 v3, 0x2
	 /* const-class v4, Landroid/graphics/Rect; */
	 /* aput-object v4, v2, v3 */
	 (( java.lang.Class ) v0 ).getDeclaredMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 return;
} // .end method
public c.v.d1 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 2 */
	 this.d = p1;
	 /* .line 3 */
	 this.b = p2;
	 /* .line 4 */
	 this.c = p3;
	 /* .line 5 */
	 p1 = 	 (( android.view.ViewGroup ) p2 ).getWidth ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getWidth()I
	 (( android.view.ViewGroup ) p0 ).setRight ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setRight(I)V
	 /* .line 6 */
	 p1 = 	 (( android.view.ViewGroup ) p2 ).getHeight ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getHeight()I
	 (( android.view.ViewGroup ) p0 ).setBottom ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setBottom(I)V
	 /* .line 7 */
	 (( android.view.ViewGroup ) p2 ).addView ( p0 ); // invoke-virtual {p2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
	 /* .line 8 */
	 this.e = p4;
	 return;
} // .end method
/* # virtual methods */
public void a ( android.graphics.drawable.Drawable p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 this.d = v0;
	 /* .line 3 */
} // :cond_0
v0 = this.d;
v0 = (( java.util.ArrayList ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 4 */
v0 = this.d;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 5 */
(( android.graphics.drawable.Drawable ) p1 ).getBounds ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
(( android.view.ViewGroup ) p0 ).invalidate ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->invalidate(Landroid/graphics/Rect;)V
/* .line 6 */
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_1
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 6 */
/* .line 7 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* instance-of v0, v0, Landroid/view/ViewGroup; */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
(( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 9 */
v2 = this.b;
/* if-eq v0, v2, :cond_0 */
(( android.view.ViewGroup ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 10 */
	 v2 = 	 c.h.n.v0 .C ( v0 );
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 int v2 = 2; // const/4 v2, 0x2
		 /* new-array v3, v2, [I */
		 /* new-array v2, v2, [I */
		 /* .line 11 */
		 (( android.view.ViewGroup ) v0 ).getLocationOnScreen ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V
		 /* .line 12 */
		 v4 = this.b;
		 (( android.view.ViewGroup ) v4 ).getLocationOnScreen ( v2 ); // invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 13 */
		 /* aget v5, v3, v4 */
		 /* aget v4, v2, v4 */
		 /* sub-int/2addr v5, v4 */
		 c.h.n.v0 .d ( p1,v5 );
		 /* .line 14 */
		 /* aget v3, v3, v1 */
		 /* aget v2, v2, v1 */
		 /* sub-int/2addr v3, v2 */
		 c.h.n.v0 .e ( p1,v3 );
		 /* .line 15 */
	 } // :cond_0
	 (( android.view.ViewGroup ) v0 ).removeView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
	 /* .line 16 */
	 (( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 17 */
		 (( android.view.ViewGroup ) v0 ).removeView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
		 /* .line 18 */
	 } // :cond_1
	 v0 = 	 (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
	 /* sub-int/2addr v0, v1 */
	 /* invoke-super {p0, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V */
	 return;
} // .end method
public final void a ( Integer[] p0 ) {
	 /* .locals 5 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* new-array v1, v0, [I */
	 /* new-array v0, v0, [I */
	 /* .line 21 */
	 v2 = this.b;
	 (( android.view.ViewGroup ) v2 ).getLocationOnScreen ( v1 ); // invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V
	 /* .line 22 */
	 v2 = this.c;
	 (( android.view.View ) v2 ).getLocationOnScreen ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->getLocationOnScreen([I)V
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 23 */
	 /* aget v3, v0, v2 */
	 /* aget v4, v1, v2 */
	 /* sub-int/2addr v3, v4 */
	 /* aput v3, p1, v2 */
	 int v2 = 1; // const/4 v2, 0x1
	 /* .line 24 */
	 /* aget v0, v0, v2 */
	 /* aget v1, v1, v2 */
	 /* sub-int/2addr v0, v1 */
	 /* aput v0, p1, v2 */
	 return;
} // .end method
public Boolean a ( ) {
	 /* .locals 1 */
	 /* .line 19 */
	 v0 = 	 (( android.view.ViewGroup ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I
	 /* if-nez v0, :cond_1 */
	 v0 = this.d;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 20 */
		 v0 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 /* if-nez v0, :cond_1 */
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void b ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 3 */
(( android.graphics.drawable.Drawable ) p1 ).getBounds ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
(( android.view.ViewGroup ) p0 ).invalidate ( v0 ); // invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->invalidate(Landroid/graphics/Rect;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
(( android.graphics.drawable.Drawable ) p1 ).setCallback ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
} // :cond_0
return;
} // .end method
public void b ( android.view.View p0 ) {
/* .locals 0 */
/* .line 5 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V */
/* .line 6 */
p1 = (( c.v.d1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/v/d1;->a()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 7 */
p1 = this.b;
(( android.view.ViewGroup ) p1 ).removeView ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
} // :cond_0
return;
} // .end method
public void dispatchDraw ( android.graphics.Canvas p0 ) {
/* .locals 5 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v1, v0, [I */
/* new-array v0, v0, [I */
/* .line 1 */
v2 = this.b;
(( android.view.ViewGroup ) v2 ).getLocationOnScreen ( v1 ); // invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V
/* .line 2 */
v2 = this.c;
(( android.view.View ) v2 ).getLocationOnScreen ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->getLocationOnScreen([I)V
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
/* aget v3, v0, v2 */
/* aget v4, v1, v2 */
/* sub-int/2addr v3, v4 */
/* int-to-float v3, v3 */
int v4 = 1; // const/4 v4, 0x1
/* aget v0, v0, v4 */
/* aget v1, v1, v4 */
/* sub-int/2addr v0, v1 */
/* int-to-float v0, v0 */
(( android.graphics.Canvas ) p1 ).translate ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 4 */
/* new-instance v0, Landroid/graphics/Rect; */
v1 = this.c;
/* .line 5 */
v1 = (( android.view.View ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/view/View;->getWidth()I
v3 = this.c;
v3 = (( android.view.View ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/view/View;->getHeight()I
/* invoke-direct {v0, v2, v2, v1, v3}, Landroid/graphics/Rect;-><init>(IIII)V */
/* .line 6 */
(( android.graphics.Canvas ) p1 ).clipRect ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z
/* .line 7 */
/* invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V */
/* .line 8 */
v0 = this.d;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 9 */
v1 = this.d;
(( java.util.ArrayList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/drawable/Drawable; */
(( android.graphics.drawable.Drawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
return;
} // .end method
public Boolean dispatchTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.view.ViewParent invalidateChildInParent ( Integer[] p0, android.graphics.Rect p1 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* aget v1, p1, v0 */
int v2 = 1; // const/4 v2, 0x1
/* aget v3, p1, v2 */
(( android.graphics.Rect ) p2 ).offset ( v1, v3 ); // invoke-virtual {p2, v1, v3}, Landroid/graphics/Rect;->offset(II)V
/* .line 3 */
v1 = this.b;
/* instance-of v1, v1, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
/* aput v0, p1, v0 */
/* .line 5 */
/* aput v0, p1, v2 */
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [I */
/* .line 6 */
(( c.v.d1 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/v/d1;->a([I)V
/* .line 7 */
/* aget v0, v1, v0 */
/* aget v1, v1, v2 */
(( android.graphics.Rect ) p2 ).offset ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Landroid/graphics/Rect;->offset(II)V
/* .line 8 */
/* invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent; */
/* .line 9 */
} // :cond_0
(( android.view.ViewGroup ) p0 ).invalidate ( p2 ); // invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->invalidate(Landroid/graphics/Rect;)V
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void invalidateDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* .line 1 */
(( android.graphics.drawable.Drawable ) p1 ).getBounds ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
(( android.view.ViewGroup ) p0 ).invalidate ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->invalidate(Landroid/graphics/Rect;)V
return;
} // .end method
public void onLayout ( Boolean p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
return;
} // .end method
public Boolean verifyDrawable ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z */
/* if-nez v0, :cond_1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( java.util.ArrayList ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
