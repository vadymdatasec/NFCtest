public abstract class c.v.t0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Boolean a;
	 public static final Boolean b;
	 public static final Boolean c;
	 /* # direct methods */
	 public static c.v.t0 ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/16 v3, 0x13 */
		 /* if-lt v0, v3, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
c.v.t0.a = (v0!= 0);
/* .line 2 */
/* const/16 v3, 0x12 */
/* if-lt v0, v3, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
c.v.t0.b = (v0!= 0);
/* .line 3 */
/* const/16 v3, 0x1c */
/* if-lt v0, v3, :cond_2 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :goto_2
c.v.t0.c = (v1!= 0);
return;
} // .end method
public static android.animation.Animator a ( android.animation.Animator p0, android.animation.Animator p1 ) {
/* .locals 3 */
/* if-nez p0, :cond_0 */
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 47 */
} // :cond_1
/* new-instance v0, Landroid/animation/AnimatorSet; */
/* invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V */
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Landroid/animation/Animator; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p0, v1, v2 */
int p0 = 1; // const/4 p0, 0x1
/* aput-object p1, v1, p0 */
/* .line 48 */
(( android.animation.AnimatorSet ) v0 ).playTogether ( v1 ); // invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V
} // .end method
public static android.graphics.Bitmap a ( android.view.View p0, android.graphics.Matrix p1, android.graphics.RectF p2, android.view.ViewGroup p3 ) {
/* .locals 8 */
/* .line 19 */
/* sget-boolean v0, Lc/v/t0;->a:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 20 */
v0 = (( android.view.View ) p0 ).isAttachedToWindow ( ); // invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z
/* xor-int/lit8 v0, v0, 0x1 */
/* if-nez p3, :cond_0 */
/* .line 21 */
} // :cond_0
v2 = (( android.view.ViewGroup ) p3 ).isAttachedToWindow ( ); // invoke-virtual {p3}, Landroid/view/ViewGroup;->isAttachedToWindow()Z
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
/* .line 22 */
} // :goto_1
/* sget-boolean v3, Lc/v/t0;->b:Z */
int v4 = 0; // const/4 v4, 0x0
if ( v3 != null) { // if-eqz v3, :cond_3
if ( v0 != null) { // if-eqz v0, :cond_3
/* if-nez v2, :cond_2 */
/* .line 23 */
} // :cond_2
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast v1, Landroid/view/ViewGroup; */
/* .line 24 */
v2 = (( android.view.ViewGroup ) v1 ).indexOfChild ( p0 ); // invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I
/* .line 25 */
(( android.view.ViewGroup ) p3 ).getOverlay ( ); // invoke-virtual {p3}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;
(( android.view.ViewGroupOverlay ) v3 ).add ( p0 ); // invoke-virtual {v3, p0}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V
} // :cond_3
/* move-object v1, v4 */
int v2 = 0; // const/4 v2, 0x0
/* .line 26 */
} // :goto_2
v3 = (( android.graphics.RectF ) p2 ).width ( ); // invoke-virtual {p2}, Landroid/graphics/RectF;->width()F
v3 = java.lang.Math .round ( v3 );
/* .line 27 */
v5 = (( android.graphics.RectF ) p2 ).height ( ); // invoke-virtual {p2}, Landroid/graphics/RectF;->height()F
v5 = java.lang.Math .round ( v5 );
/* if-lez v3, :cond_5 */
/* if-lez v5, :cond_5 */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x49800000 # 1048576.0f */
/* mul-int v7, v3, v5 */
/* int-to-float v7, v7 */
/* div-float/2addr v6, v7 */
/* .line 28 */
v4 = java.lang.Math .min ( v4,v6 );
/* int-to-float v3, v3 */
/* mul-float v3, v3, v4 */
/* .line 29 */
v3 = java.lang.Math .round ( v3 );
/* int-to-float v5, v5 */
/* mul-float v5, v5, v4 */
/* .line 30 */
v5 = java.lang.Math .round ( v5 );
/* .line 31 */
/* iget v6, p2, Landroid/graphics/RectF;->left:F */
/* neg-float v6, v6 */
/* iget p2, p2, Landroid/graphics/RectF;->top:F */
/* neg-float p2, p2 */
(( android.graphics.Matrix ) p1 ).postTranslate ( v6, p2 ); // invoke-virtual {p1, v6, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z
/* .line 32 */
(( android.graphics.Matrix ) p1 ).postScale ( v4, v4 ); // invoke-virtual {p1, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z
/* .line 33 */
/* sget-boolean p2, Lc/v/t0;->c:Z */
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 34 */
/* new-instance p2, Landroid/graphics/Picture; */
/* invoke-direct {p2}, Landroid/graphics/Picture;-><init>()V */
/* .line 35 */
(( android.graphics.Picture ) p2 ).beginRecording ( v3, v5 ); // invoke-virtual {p2, v3, v5}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;
/* .line 36 */
(( android.graphics.Canvas ) v3 ).concat ( p1 ); // invoke-virtual {v3, p1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 37 */
(( android.view.View ) p0 ).draw ( v3 ); // invoke-virtual {p0, v3}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
/* .line 38 */
(( android.graphics.Picture ) p2 ).endRecording ( ); // invoke-virtual {p2}, Landroid/graphics/Picture;->endRecording()V
/* .line 39 */
android.graphics.Bitmap .createBitmap ( p2 );
/* .line 40 */
} // :cond_4
p2 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v3,v5,p2 );
/* .line 41 */
/* new-instance p2, Landroid/graphics/Canvas; */
/* invoke-direct {p2, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 42 */
(( android.graphics.Canvas ) p2 ).concat ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 43 */
(( android.view.View ) p0 ).draw ( p2 ); // invoke-virtual {p0, p2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
/* .line 44 */
} // :cond_5
} // :goto_3
/* sget-boolean p1, Lc/v/t0;->b:Z */
if ( p1 != null) { // if-eqz p1, :cond_6
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 45 */
(( android.view.ViewGroup ) p3 ).getOverlay ( ); // invoke-virtual {p3}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;
(( android.view.ViewGroupOverlay ) p1 ).remove ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V
/* .line 46 */
(( android.view.ViewGroup ) v1 ).addView ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
} // :cond_6
} // .end method
public static android.view.View a ( android.view.ViewGroup p0, android.view.View p1, android.view.View p2 ) {
/* .locals 7 */
/* .line 1 */
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
/* .line 2 */
v1 = (( android.view.View ) p2 ).getScrollX ( ); // invoke-virtual {p2}, Landroid/view/View;->getScrollX()I
/* neg-int v1, v1 */
/* int-to-float v1, v1 */
p2 = (( android.view.View ) p2 ).getScrollY ( ); // invoke-virtual {p2}, Landroid/view/View;->getScrollY()I
/* neg-int p2, p2 */
/* int-to-float p2, p2 */
(( android.graphics.Matrix ) v0 ).setTranslate ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/graphics/Matrix;->setTranslate(FF)V
/* .line 3 */
c.v.j1 .a ( p1,v0 );
/* .line 4 */
c.v.j1 .b ( p0,v0 );
/* .line 5 */
/* new-instance p2, Landroid/graphics/RectF; */
v1 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* int-to-float v1, v1 */
v2 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
/* int-to-float v2, v2 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {p2, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V */
/* .line 6 */
(( android.graphics.Matrix ) v0 ).mapRect ( p2 ); // invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z
/* .line 7 */
/* iget v1, p2, Landroid/graphics/RectF;->left:F */
v1 = java.lang.Math .round ( v1 );
/* .line 8 */
/* iget v2, p2, Landroid/graphics/RectF;->top:F */
v2 = java.lang.Math .round ( v2 );
/* .line 9 */
/* iget v3, p2, Landroid/graphics/RectF;->right:F */
v3 = java.lang.Math .round ( v3 );
/* .line 10 */
/* iget v4, p2, Landroid/graphics/RectF;->bottom:F */
v4 = java.lang.Math .round ( v4 );
/* .line 11 */
/* new-instance v5, Landroid/widget/ImageView; */
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
/* invoke-direct {v5, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
/* .line 12 */
v6 = android.widget.ImageView$ScaleType.CENTER_CROP;
(( android.widget.ImageView ) v5 ).setScaleType ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
/* .line 13 */
c.v.t0 .a ( p1,v0,p2,p0 );
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 14 */
(( android.widget.ImageView ) v5 ).setImageBitmap ( p0 ); // invoke-virtual {v5, p0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
} // :cond_0
/* sub-int p0, v3, v1 */
/* const/high16 p1, 0x40000000 # 2.0f */
/* .line 15 */
p0 = android.view.View$MeasureSpec .makeMeasureSpec ( p0,p1 );
/* sub-int p2, v4, v2 */
/* .line 16 */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p2,p1 );
/* .line 17 */
(( android.widget.ImageView ) v5 ).measure ( p0, p1 ); // invoke-virtual {v5, p0, p1}, Landroid/widget/ImageView;->measure(II)V
/* .line 18 */
(( android.widget.ImageView ) v5 ).layout ( v1, v2, v3, v4 ); // invoke-virtual {v5, v1, v2, v3, v4}, Landroid/widget/ImageView;->layout(IIII)V
} // .end method
