public class c.t.a.b extends android.widget.ImageView {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.view.animation.Animation$AnimationListener b;
	 public Integer c;
	 /* # direct methods */
	 public c.t.a.b ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 /* .line 2 */
		 (( android.widget.ImageView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget p1, p1, Landroid/util/DisplayMetrics;->density:F */
		 /* const/high16 v0, 0x3fe00000 # 1.75f */
		 /* mul-float v0, v0, p1 */
		 /* float-to-int v0, v0 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* mul-float v1, v1, p1 */
		 /* float-to-int v1, v1 */
		 /* const/high16 v2, 0x40600000 # 3.5f */
		 /* mul-float v2, v2, p1 */
		 /* float-to-int v2, v2 */
		 /* .line 3 */
		 /* iput v2, p0, Lc/t/a/b;->c:I */
		 /* .line 4 */
		 v2 = 		 (( c.t.a.b ) p0 ).a ( ); // invoke-virtual {p0}, Lc/t/a/b;->a()Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 5 */
			 /* new-instance v0, Landroid/graphics/drawable/ShapeDrawable; */
			 /* new-instance v1, Landroid/graphics/drawable/shapes/OvalShape; */
			 /* invoke-direct {v1}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V */
			 /* invoke-direct {v0, v1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V */
			 /* const/high16 v1, 0x40800000 # 4.0f */
			 /* mul-float p1, p1, v1 */
			 /* .line 6 */
			 c.h.n.v0 .a ( p0,p1 );
			 /* .line 7 */
		 } // :cond_0
		 /* new-instance p1, Lc/t/a/a; */
		 /* iget v2, p0, Lc/t/a/b;->c:I */
		 /* invoke-direct {p1, p0, v2}, Lc/t/a/a;-><init>(Lc/t/a/b;I)V */
		 /* .line 8 */
		 /* new-instance v2, Landroid/graphics/drawable/ShapeDrawable; */
		 /* invoke-direct {v2, p1}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 9 */
		 (( android.graphics.drawable.ShapeDrawable ) v2 ).getPaint ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
		 (( android.widget.ImageView ) p0 ).setLayerType ( p1, v3 ); // invoke-virtual {p0, p1, v3}, Landroid/widget/ImageView;->setLayerType(ILandroid/graphics/Paint;)V
		 /* .line 10 */
		 (( android.graphics.drawable.ShapeDrawable ) v2 ).getPaint ( ); // invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
		 /* iget v3, p0, Lc/t/a/b;->c:I */
		 /* int-to-float v3, v3 */
		 /* int-to-float v1, v1 */
		 /* int-to-float v0, v0 */
		 /* const/high16 v4, 0x1e000000 */
		 (( android.graphics.Paint ) p1 ).setShadowLayer ( v3, v1, v0, v4 ); // invoke-virtual {p1, v3, v1, v0, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V
		 /* .line 11 */
		 /* iget p1, p0, Lc/t/a/b;->c:I */
		 /* .line 12 */
		 (( android.widget.ImageView ) p0 ).setPadding ( p1, p1, p1, p1 ); // invoke-virtual {p0, p1, p1, p1, p1}, Landroid/widget/ImageView;->setPadding(IIII)V
		 /* move-object v0, v2 */
		 /* .line 13 */
	 } // :goto_0
	 (( android.graphics.drawable.ShapeDrawable ) v0 ).getPaint ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
	 (( android.graphics.Paint ) p1 ).setColor ( p2 ); // invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V
	 /* .line 14 */
	 c.h.n.v0 .a ( p0,v0 );
	 return;
} // .end method
/* # virtual methods */
public void a ( android.view.animation.Animation$AnimationListener p0 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 this.b = p1;
	 return;
} // .end method
public final Boolean a ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* const/16 v1, 0x15 */
	 /* if-lt v0, v1, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void onAnimationEnd ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/ImageView;->onAnimationEnd()V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.widget.ImageView ) p0 ).getAnimation ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;
} // :cond_0
return;
} // .end method
public void onAnimationStart ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/widget/ImageView;->onAnimationStart()V */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.widget.ImageView ) p0 ).getAnimation ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getAnimation()Landroid/view/animation/Animation;
} // :cond_0
return;
} // .end method
public void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V */
/* .line 2 */
p1 = (( c.t.a.b ) p0 ).a ( ); // invoke-virtual {p0}, Lc/t/a/b;->a()Z
/* if-nez p1, :cond_0 */
/* .line 3 */
p1 = (( android.widget.ImageView ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getMeasuredWidth()I
/* iget p2, p0, Lc/t/a/b;->c:I */
/* mul-int/lit8 p2, p2, 0x2 */
/* add-int/2addr p1, p2 */
p2 = (( android.widget.ImageView ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getMeasuredHeight()I
/* iget v0, p0, Lc/t/a/b;->c:I */
/* mul-int/lit8 v0, v0, 0x2 */
/* add-int/2addr p2, v0 */
(( android.widget.ImageView ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/widget/ImageView;->setMeasuredDimension(II)V
} // :cond_0
return;
} // .end method
public void setBackgroundColor ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( android.widget.ImageView ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;
/* instance-of v0, v0, Landroid/graphics/drawable/ShapeDrawable; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.widget.ImageView ) p0 ).getBackground ( ); // invoke-virtual {p0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;
/* check-cast v0, Landroid/graphics/drawable/ShapeDrawable; */
(( android.graphics.drawable.ShapeDrawable ) v0 ).getPaint ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
(( android.graphics.Paint ) v0 ).setColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
} // :cond_0
return;
} // .end method
