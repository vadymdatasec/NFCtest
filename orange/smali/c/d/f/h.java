public class c.d.f.h extends android.graphics.drawable.Drawable {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Float a;
	 public final android.graphics.Paint b;
	 public final android.graphics.RectF c;
	 public final android.graphics.Rect d;
	 public Float e;
	 public Boolean f;
	 public Boolean g;
	 public android.content.res.ColorStateList h;
	 public android.graphics.PorterDuffColorFilter i;
	 public android.content.res.ColorStateList j;
	 public android.graphics.PorterDuff$Mode k;
	 /* # direct methods */
	 public c.d.f.h ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/d/f/h;->f:Z */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lc/d/f/h;->g:Z */
		 /* .line 4 */
		 v0 = android.graphics.PorterDuff$Mode.SRC_IN;
		 this.k = v0;
		 /* .line 5 */
		 /* iput p2, p0, Lc/d/f/h;->a:F */
		 /* .line 6 */
		 /* new-instance p2, Landroid/graphics/Paint; */
		 int v0 = 5; // const/4 v0, 0x5
		 /* invoke-direct {p2, v0}, Landroid/graphics/Paint;-><init>(I)V */
		 this.b = p2;
		 /* .line 7 */
		 (( c.d.f.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/d/f/h;->a(Landroid/content/res/ColorStateList;)V
		 /* .line 8 */
		 /* new-instance p1, Landroid/graphics/RectF; */
		 /* invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V */
		 this.c = p1;
		 /* .line 9 */
		 /* new-instance p1, Landroid/graphics/Rect; */
		 /* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
		 this.d = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.content.res.ColorStateList a ( ) {
		 /* .locals 1 */
		 /* .line 21 */
		 v0 = this.h;
	 } // .end method
	 public final android.graphics.PorterDuffColorFilter a ( android.content.res.ColorStateList p0, android.graphics.PorterDuff$Mode p1 ) {
		 /* .locals 2 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* if-nez p2, :cond_0 */
			 /* .line 22 */
		 } // :cond_0
		 (( android.graphics.drawable.Drawable ) p0 ).getState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I
		 int v1 = 0; // const/4 v1, 0x0
		 p1 = 		 (( android.content.res.ColorStateList ) p1 ).getColorForState ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I
		 /* .line 23 */
		 /* new-instance v0, Landroid/graphics/PorterDuffColorFilter; */
		 /* invoke-direct {v0, p1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V */
	 } // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( Float p0 ) {
/* .locals 1 */
/* .line 17 */
/* iget v0, p0, Lc/d/f/h;->a:F */
/* cmpl-float v0, p1, v0 */
/* if-nez v0, :cond_0 */
return;
/* .line 18 */
} // :cond_0
/* iput p1, p0, Lc/d/f/h;->a:F */
int p1 = 0; // const/4 p1, 0x0
/* .line 19 */
(( c.d.f.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/d/f/h;->a(Landroid/graphics/Rect;)V
/* .line 20 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void a ( Float p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
/* .line 3 */
/* iget v0, p0, Lc/d/f/h;->e:F */
/* cmpl-float v0, p1, v0 */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lc/d/f/h;->f:Z */
/* if-ne v0, p2, :cond_0 */
/* iget-boolean v0, p0, Lc/d/f/h;->g:Z */
/* if-ne v0, p3, :cond_0 */
return;
/* .line 4 */
} // :cond_0
/* iput p1, p0, Lc/d/f/h;->e:F */
/* .line 5 */
/* iput-boolean p2, p0, Lc/d/f/h;->f:Z */
/* .line 6 */
/* iput-boolean p3, p0, Lc/d/f/h;->g:Z */
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
(( c.d.f.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/d/f/h;->a(Landroid/graphics/Rect;)V
/* .line 8 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public final void a ( android.content.res.ColorStateList p0 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
android.content.res.ColorStateList .valueOf ( p1 );
} // :cond_0
this.h = p1;
/* .line 2 */
v0 = this.b;
(( android.graphics.drawable.Drawable ) p0 ).getState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I
v2 = this.h;
v2 = (( android.content.res.ColorStateList ) v2 ).getDefaultColor ( ); // invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I
p1 = (( android.content.res.ColorStateList ) p1 ).getColorForState ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I
(( android.graphics.Paint ) v0 ).setColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
return;
} // .end method
public final void a ( android.graphics.Rect p0 ) {
/* .locals 5 */
/* if-nez p1, :cond_0 */
/* .line 9 */
(( android.graphics.drawable.Drawable ) p0 ).getBounds ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
/* .line 10 */
} // :cond_0
v0 = this.c;
/* iget v1, p1, Landroid/graphics/Rect;->left:I */
/* int-to-float v1, v1 */
/* iget v2, p1, Landroid/graphics/Rect;->top:I */
/* int-to-float v2, v2 */
/* iget v3, p1, Landroid/graphics/Rect;->right:I */
/* int-to-float v3, v3 */
/* iget v4, p1, Landroid/graphics/Rect;->bottom:I */
/* int-to-float v4, v4 */
(( android.graphics.RectF ) v0 ).set ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V
/* .line 11 */
v0 = this.d;
(( android.graphics.Rect ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V
/* .line 12 */
/* iget-boolean p1, p0, Lc/d/f/h;->f:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 13 */
/* iget p1, p0, Lc/d/f/h;->e:F */
/* iget v0, p0, Lc/d/f/h;->a:F */
/* iget-boolean v1, p0, Lc/d/f/h;->g:Z */
p1 = c.d.f.j .b ( p1,v0,v1 );
/* .line 14 */
/* iget v0, p0, Lc/d/f/h;->e:F */
/* iget v1, p0, Lc/d/f/h;->a:F */
/* iget-boolean v2, p0, Lc/d/f/h;->g:Z */
v0 = c.d.f.j .a ( v0,v1,v2 );
/* .line 15 */
v1 = this.d;
/* float-to-double v2, v0 */
java.lang.Math .ceil ( v2,v3 );
/* move-result-wide v2 */
/* double-to-int v0, v2 */
/* float-to-double v2, p1 */
java.lang.Math .ceil ( v2,v3 );
/* move-result-wide v2 */
/* double-to-int p1, v2 */
(( android.graphics.Rect ) v1 ).inset ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Landroid/graphics/Rect;->inset(II)V
/* .line 16 */
p1 = this.c;
v0 = this.d;
(( android.graphics.RectF ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V
} // :cond_1
return;
} // .end method
public Float b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/d/f/h;->e:F */
} // .end method
public void b ( android.content.res.ColorStateList p0 ) {
/* .locals 0 */
/* .line 2 */
(( c.d.f.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/d/f/h;->a(Landroid/content/res/ColorStateList;)V
/* .line 3 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public Float c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/d/f/h;->a:F */
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
/* .line 2 */
v1 = this.i;
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.graphics.Paint ) v0 ).getColorFilter ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;
/* if-nez v1, :cond_0 */
/* .line 3 */
v1 = this.i;
(( android.graphics.Paint ) v0 ).setColorFilter ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
v2 = this.c;
/* iget v3, p0, Lc/d/f/h;->a:F */
(( android.graphics.Canvas ) p1 ).drawRoundRect ( v2, v3, v3, v0 ); // invoke-virtual {p1, v2, v3, v3, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
if ( v1 != null) { // if-eqz v1, :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
(( android.graphics.Paint ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
} // :cond_1
return;
} // .end method
public Integer getOpacity ( ) {
/* .locals 1 */
int v0 = -3; // const/4 v0, -0x3
} // .end method
public void getOutline ( android.graphics.Outline p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
/* iget v1, p0, Lc/d/f/h;->a:F */
(( android.graphics.Outline ) p1 ).setRoundRect ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V
return;
} // .end method
public Boolean isStateful ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.content.res.ColorStateList ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z
/* if-nez v0, :cond_2 */
} // :cond_0
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = (( android.content.res.ColorStateList ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z
/* if-nez v0, :cond_2 */
} // :cond_1
v0 = /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z */
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void onBoundsChange ( android.graphics.Rect p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V */
/* .line 2 */
(( c.d.f.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/d/f/h;->a(Landroid/graphics/Rect;)V
return;
} // .end method
public Boolean onStateChange ( Integer[] p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.h;
v1 = (( android.content.res.ColorStateList ) v0 ).getDefaultColor ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I
p1 = (( android.content.res.ColorStateList ) v0 ).getColorForState ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I
/* .line 2 */
v0 = this.b;
v0 = (( android.graphics.Paint ) v0 ).getColor ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I
int v1 = 1; // const/4 v1, 0x1
/* if-eq p1, v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v2 = this.b;
(( android.graphics.Paint ) v2 ).setColor ( p1 ); // invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 4 */
} // :cond_1
p1 = this.j;
if ( p1 != null) { // if-eqz p1, :cond_2
v2 = this.k;
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 5 */
(( c.d.f.h ) p0 ).a ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lc/d/f/h;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
this.i = p1;
} // :cond_2
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( android.graphics.Paint ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( android.graphics.Paint ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
return;
} // .end method
public void setTintList ( android.content.res.ColorStateList p0 ) {
/* .locals 1 */
/* .line 1 */
this.j = p1;
/* .line 2 */
v0 = this.k;
(( c.d.f.h ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/d/f/h;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
this.i = p1;
/* .line 3 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void setTintMode ( android.graphics.PorterDuff$Mode p0 ) {
/* .locals 1 */
/* .line 1 */
this.k = p1;
/* .line 2 */
v0 = this.j;
(( c.d.f.h ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/d/f/h;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
this.i = p1;
/* .line 3 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
