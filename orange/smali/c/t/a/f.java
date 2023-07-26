public class c.t.a.f extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.view.animation.Interpolator h;
	 public static final android.view.animation.Interpolator i;
	 public static final j;
	 /* # instance fields */
	 public final c.t.a.e b;
	 public Float c;
	 public android.content.res.Resources d;
	 public android.animation.Animator e;
	 public Float f;
	 public Boolean g;
	 /* # direct methods */
	 public static c.t.a.f ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/view/animation/LinearInterpolator; */
		 /* invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/m/a/a/b; */
		 /* invoke-direct {v0}, Lc/m/a/a/b;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/high16 v2, -0x1000000 */
		 /* aput v2, v0, v1 */
		 /* .line 3 */
		 return;
	 } // .end method
	 public c.t.a.f ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 /* .line 2 */
		 c.h.m.g .a ( p1 );
		 /* check-cast p1, Landroid/content/Context; */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 this.d = p1;
		 /* .line 3 */
		 /* new-instance p1, Lc/t/a/e; */
		 /* invoke-direct {p1}, Lc/t/a/e;-><init>()V */
		 this.b = p1;
		 /* .line 4 */
		 v0 = c.t.a.f.j;
		 (( c.t.a.e ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/t/a/e;->a([I)V
		 /* const/high16 p1, 0x40200000 # 2.5f */
		 /* .line 5 */
		 (( c.t.a.f ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/t/a/f;->d(F)V
		 /* .line 6 */
		 (( c.t.a.f ) p0 ).a ( ); // invoke-virtual {p0}, Lc/t/a/f;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( Float p0, Integer p1, Integer p2 ) {
		 /* .locals 6 */
		 /* shr-int/lit8 v0, p2, 0x18 */
		 /* and-int/lit16 v0, v0, 0xff */
		 /* shr-int/lit8 v1, p2, 0x10 */
		 /* and-int/lit16 v1, v1, 0xff */
		 /* shr-int/lit8 v2, p2, 0x8 */
		 /* and-int/lit16 v2, v2, 0xff */
		 /* and-int/lit16 p2, p2, 0xff */
		 /* shr-int/lit8 v3, p3, 0x18 */
		 /* and-int/lit16 v3, v3, 0xff */
		 /* shr-int/lit8 v4, p3, 0x10 */
		 /* and-int/lit16 v4, v4, 0xff */
		 /* shr-int/lit8 v5, p3, 0x8 */
		 /* and-int/lit16 v5, v5, 0xff */
		 /* and-int/lit16 p3, p3, 0xff */
		 /* sub-int/2addr v3, v0 */
		 /* int-to-float v3, v3 */
		 /* mul-float v3, v3, p1 */
		 /* float-to-int v3, v3 */
		 /* add-int/2addr v0, v3 */
		 /* shl-int/lit8 v0, v0, 0x18 */
		 /* sub-int/2addr v4, v1 */
		 /* int-to-float v3, v4 */
		 /* mul-float v3, v3, p1 */
		 /* float-to-int v3, v3 */
		 /* add-int/2addr v1, v3 */
		 /* shl-int/lit8 v1, v1, 0x10 */
		 /* or-int/2addr v0, v1 */
		 /* sub-int/2addr v5, v2 */
		 /* int-to-float v1, v5 */
		 /* mul-float v1, v1, p1 */
		 /* float-to-int v1, v1 */
		 /* add-int/2addr v2, v1 */
		 /* shl-int/lit8 v1, v2, 0x8 */
		 /* or-int/2addr v0, v1 */
		 /* sub-int/2addr p3, p2 */
		 /* int-to-float p3, p3 */
		 /* mul-float p1, p1, p3 */
		 /* float-to-int p1, p1 */
		 /* add-int/2addr p2, p1 */
		 /* or-int p1, v0, p2 */
	 } // .end method
	 public final void a ( ) {
		 /* .locals 3 */
		 /* .line 44 */
		 v0 = this.b;
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-array v1, v1, [F */
		 /* .line 45 */
		 /* fill-array-data v1, :array_0 */
		 android.animation.ValueAnimator .ofFloat ( v1 );
		 /* .line 46 */
		 /* new-instance v2, Lc/t/a/c; */
		 /* invoke-direct {v2, p0, v0}, Lc/t/a/c;-><init>(Lc/t/a/f;Lc/t/a/e;)V */
		 (( android.animation.ValueAnimator ) v1 ).addUpdateListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
		 int v2 = -1; // const/4 v2, -0x1
		 /* .line 47 */
		 (( android.animation.ValueAnimator ) v1 ).setRepeatCount ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V
		 int v2 = 1; // const/4 v2, 0x1
		 /* .line 48 */
		 (( android.animation.ValueAnimator ) v1 ).setRepeatMode ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V
		 /* .line 49 */
		 v2 = c.t.a.f.h;
		 (( android.animation.ValueAnimator ) v1 ).setInterpolator ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V
		 /* .line 50 */
		 /* new-instance v2, Lc/t/a/d; */
		 /* invoke-direct {v2, p0, v0}, Lc/t/a/d;-><init>(Lc/t/a/f;Lc/t/a/e;)V */
		 (( android.animation.ValueAnimator ) v1 ).addListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
		 /* .line 51 */
		 this.e = v1;
		 return;
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x0 */
		 /* 0x3f800000 # 1.0f */
	 } // .end array-data
} // .end method
public void a ( Float p0 ) {
	 /* .locals 1 */
	 /* .line 13 */
	 v0 = this.b;
	 (( c.t.a.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->a(F)V
	 /* .line 14 */
	 (( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
	 return;
} // .end method
public void a ( Float p0, Float p1 ) {
	 /* .locals 1 */
	 /* .line 15 */
	 v0 = this.b;
	 (( c.t.a.e ) v0 ).e ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->e(F)V
	 /* .line 16 */
	 p1 = this.b;
	 (( c.t.a.e ) p1 ).c ( p2 ); // invoke-virtual {p1, p2}, Lc/t/a/e;->c(F)V
	 /* .line 17 */
	 (( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
	 return;
} // .end method
public final void a ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.b;
	 /* .line 2 */
	 v1 = this.d;
	 (( android.content.res.Resources ) v1 ).getDisplayMetrics ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* .line 3 */
	 /* iget v1, v1, Landroid/util/DisplayMetrics;->density:F */
	 /* mul-float p2, p2, v1 */
	 /* .line 4 */
	 (( c.t.a.e ) v0 ).f ( p2 ); // invoke-virtual {v0, p2}, Lc/t/a/e;->f(F)V
	 /* mul-float p1, p1, v1 */
	 /* .line 5 */
	 (( c.t.a.e ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->b(F)V
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 6 */
	 (( c.t.a.e ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->c(I)V
	 /* mul-float p3, p3, v1 */
	 /* mul-float p4, p4, v1 */
	 /* .line 7 */
	 (( c.t.a.e ) v0 ).a ( p3, p4 ); // invoke-virtual {v0, p3, p4}, Lc/t/a/e;->a(FF)V
	 return;
} // .end method
public final void a ( Float p0, Object p1 ) {
	 /* .locals 4 */
	 /* .line 21 */
	 (( c.t.a.f ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/t/a/f;->b(FLc/t/a/e;)V
	 /* .line 22 */
	 v0 = 	 (( c.t.a.e ) p2 ).h ( ); // invoke-virtual {p2}, Lc/t/a/e;->h()F
	 /* const v1, 0x3f4ccccd # 0.8f */
	 /* div-float/2addr v0, v1 */
	 /* float-to-double v0, v0 */
	 java.lang.Math .floor ( v0,v1 );
	 /* move-result-wide v0 */
	 /* const-wide/high16 v2, 0x3ff0000000000000L # 1.0 */
	 /* add-double/2addr v0, v2 */
	 /* double-to-float v0, v0 */
	 /* .line 23 */
	 v1 = 	 (( c.t.a.e ) p2 ).i ( ); // invoke-virtual {p2}, Lc/t/a/e;->i()F
	 /* .line 24 */
	 v2 = 	 (( c.t.a.e ) p2 ).g ( ); // invoke-virtual {p2}, Lc/t/a/e;->g()F
	 /* const v3, 0x3c23d70a # 0.01f */
	 /* sub-float/2addr v2, v3 */
	 v3 = 	 (( c.t.a.e ) p2 ).i ( ); // invoke-virtual {p2}, Lc/t/a/e;->i()F
	 /* sub-float/2addr v2, v3 */
	 /* mul-float v2, v2, p1 */
	 /* add-float/2addr v1, v2 */
	 /* .line 25 */
	 (( c.t.a.e ) p2 ).e ( v1 ); // invoke-virtual {p2, v1}, Lc/t/a/e;->e(F)V
	 /* .line 26 */
	 v1 = 	 (( c.t.a.e ) p2 ).g ( ); // invoke-virtual {p2}, Lc/t/a/e;->g()F
	 (( c.t.a.e ) p2 ).c ( v1 ); // invoke-virtual {p2, v1}, Lc/t/a/e;->c(F)V
	 /* .line 27 */
	 v1 = 	 (( c.t.a.e ) p2 ).h ( ); // invoke-virtual {p2}, Lc/t/a/e;->h()F
	 /* .line 28 */
	 v2 = 	 (( c.t.a.e ) p2 ).h ( ); // invoke-virtual {p2}, Lc/t/a/e;->h()F
	 /* sub-float/2addr v0, v2 */
	 /* mul-float v0, v0, p1 */
	 /* add-float/2addr v1, v0 */
	 /* .line 29 */
	 (( c.t.a.e ) p2 ).d ( v1 ); // invoke-virtual {p2, v1}, Lc/t/a/e;->d(F)V
	 return;
} // .end method
public void a ( Float p0, Object p1, Boolean p2 ) {
	 /* .locals 7 */
	 /* .line 30 */
	 /* iget-boolean v0, p0, Lc/t/a/f;->g:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 31 */
		 (( c.t.a.f ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/t/a/f;->a(FLc/t/a/e;)V
	 } // :cond_0
	 /* const/high16 v0, 0x3f800000 # 1.0f */
	 /* cmpl-float v1, p1, v0 */
	 /* if-nez v1, :cond_1 */
	 if ( p3 != null) { // if-eqz p3, :cond_3
		 /* .line 32 */
	 } // :cond_1
	 p3 = 	 (( c.t.a.e ) p2 ).h ( ); // invoke-virtual {p2}, Lc/t/a/e;->h()F
	 /* const v1, 0x3c23d70a # 0.01f */
	 /* const v2, 0x3f4a3d71 # 0.79f */
	 /* const/high16 v3, 0x3f000000 # 0.5f */
	 /* cmpg-float v4, p1, v3 */
	 /* if-gez v4, :cond_2 */
	 /* div-float v0, p1, v3 */
	 /* .line 33 */
	 v3 = 	 (( c.t.a.e ) p2 ).i ( ); // invoke-virtual {p2}, Lc/t/a/e;->i()F
	 /* .line 34 */
	 v4 = c.t.a.f.i;
	 v0 = 	 /* .line 35 */
	 /* mul-float v0, v0, v2 */
	 /* add-float/2addr v0, v1 */
	 /* add-float/2addr v0, v3 */
} // :cond_2
/* sub-float v4, p1, v3 */
/* div-float/2addr v4, v3 */
/* .line 36 */
v3 = (( c.t.a.e ) p2 ).i ( ); // invoke-virtual {p2}, Lc/t/a/e;->i()F
/* add-float/2addr v3, v2 */
/* .line 37 */
v5 = c.t.a.f.i;
v4 = /* .line 38 */
/* sub-float/2addr v0, v4 */
/* mul-float v0, v0, v2 */
/* add-float/2addr v0, v1 */
/* sub-float v0, v3, v0 */
/* move v6, v3 */
/* move v3, v0 */
/* move v0, v6 */
} // :goto_0
/* const v1, 0x3e570a3c # 0.20999998f */
/* mul-float v1, v1, p1 */
/* add-float/2addr p3, v1 */
/* const/high16 v1, 0x43580000 # 216.0f */
/* .line 39 */
/* iget v2, p0, Lc/t/a/f;->f:F */
/* add-float/2addr p1, v2 */
/* mul-float p1, p1, v1 */
/* .line 40 */
(( c.t.a.e ) p2 ).e ( v3 ); // invoke-virtual {p2, v3}, Lc/t/a/e;->e(F)V
/* .line 41 */
(( c.t.a.e ) p2 ).c ( v0 ); // invoke-virtual {p2, v0}, Lc/t/a/e;->c(F)V
/* .line 42 */
(( c.t.a.e ) p2 ).d ( p3 ); // invoke-virtual {p2, p3}, Lc/t/a/e;->d(F)V
/* .line 43 */
(( c.t.a.f ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/t/a/f;->c(F)V
} // :cond_3
} // :goto_1
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
/* const/high16 p1, 0x41300000 # 11.0f */
/* const/high16 v0, 0x40400000 # 3.0f */
/* const/high16 v1, 0x41400000 # 12.0f */
/* const/high16 v2, 0x40c00000 # 6.0f */
/* .line 8 */
(( c.t.a.f ) p0 ).a ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Lc/t/a/f;->a(FFFF)V
} // :cond_0
/* const/high16 p1, 0x40f00000 # 7.5f */
/* const/high16 v0, 0x40200000 # 2.5f */
/* const/high16 v1, 0x41200000 # 10.0f */
/* const/high16 v2, 0x40a00000 # 5.0f */
/* .line 9 */
(( c.t.a.f ) p0 ).a ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Lc/t/a/f;->a(FFFF)V
/* .line 10 */
} // :goto_0
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 11 */
v0 = this.b;
(( c.t.a.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->a(Z)V
/* .line 12 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void a ( Integer...p0 ) {
/* .locals 1 */
/* .line 18 */
v0 = this.b;
(( c.t.a.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->a([I)V
/* .line 19 */
p1 = this.b;
int v0 = 0; // const/4 v0, 0x0
(( c.t.a.e ) p1 ).c ( v0 ); // invoke-virtual {p1, v0}, Lc/t/a/e;->c(I)V
/* .line 20 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void b ( Float p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( c.t.a.e ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->d(F)V
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void b ( Float p0, Object p1 ) {
/* .locals 2 */
/* const/high16 v0, 0x3f400000 # 0.75f */
/* cmpl-float v1, p1, v0 */
/* if-lez v1, :cond_0 */
/* sub-float/2addr p1, v0 */
/* const/high16 v0, 0x3e800000 # 0.25f */
/* div-float/2addr p1, v0 */
/* .line 3 */
v0 = (( c.t.a.e ) p2 ).f ( ); // invoke-virtual {p2}, Lc/t/a/e;->f()I
/* .line 4 */
v1 = (( c.t.a.e ) p2 ).c ( ); // invoke-virtual {p2}, Lc/t/a/e;->c()I
/* .line 5 */
p1 = (( c.t.a.f ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lc/t/a/f;->a(FII)I
(( c.t.a.e ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Lc/t/a/e;->b(I)V
/* .line 6 */
} // :cond_0
p1 = (( c.t.a.e ) p2 ).f ( ); // invoke-virtual {p2}, Lc/t/a/e;->f()I
(( c.t.a.e ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Lc/t/a/e;->b(I)V
} // :goto_0
return;
} // .end method
public final void c ( Float p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/t/a/f;->c:F */
return;
} // .end method
public void d ( Float p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( c.t.a.e ) v0 ).f ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->f(F)V
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 4 */
/* .line 1 */
(( android.graphics.drawable.Drawable ) p0 ).getBounds ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
/* .line 2 */
(( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 3 */
/* iget v1, p0, Lc/t/a/f;->c:F */
v2 = (( android.graphics.Rect ) v0 ).exactCenterX ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F
v3 = (( android.graphics.Rect ) v0 ).exactCenterY ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F
(( android.graphics.Canvas ) p1 ).rotate ( v1, v2, v3 ); // invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V
/* .line 4 */
v1 = this.b;
(( c.t.a.e ) v1 ).a ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/t/a/e;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V
/* .line 5 */
(( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
return;
} // .end method
public Integer getAlpha ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( c.t.a.e ) v0 ).a ( ); // invoke-virtual {v0}, Lc/t/a/e;->a()I
} // .end method
public Integer getOpacity ( ) {
/* .locals 1 */
int v0 = -3; // const/4 v0, -0x3
} // .end method
public Boolean isRunning ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
v0 = (( android.animation.Animator ) v0 ).isRunning ( ); // invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( c.t.a.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->a(I)V
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void setColorFilter ( android.graphics.ColorFilter p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( c.t.a.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/t/a/e;->a(Landroid/graphics/ColorFilter;)V
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void start ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.e;
(( android.animation.Animator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V
/* .line 2 */
v0 = this.b;
(( c.t.a.e ) v0 ).l ( ); // invoke-virtual {v0}, Lc/t/a/e;->l()V
/* .line 3 */
v0 = this.b;
v0 = (( c.t.a.e ) v0 ).b ( ); // invoke-virtual {v0}, Lc/t/a/e;->b()F
v1 = this.b;
v1 = (( c.t.a.e ) v1 ).e ( ); // invoke-virtual {v1}, Lc/t/a/e;->e()F
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Lc/t/a/f;->g:Z */
/* .line 5 */
v0 = this.e;
/* const-wide/16 v1, 0x29a */
(( android.animation.Animator ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;
/* .line 6 */
v0 = this.e;
(( android.animation.Animator ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/animation/Animator;->start()V
/* .line 7 */
} // :cond_0
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
(( c.t.a.e ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lc/t/a/e;->c(I)V
/* .line 8 */
v0 = this.b;
(( c.t.a.e ) v0 ).k ( ); // invoke-virtual {v0}, Lc/t/a/e;->k()V
/* .line 9 */
v0 = this.e;
/* const-wide/16 v1, 0x534 */
(( android.animation.Animator ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;
/* .line 10 */
v0 = this.e;
(( android.animation.Animator ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/animation/Animator;->start()V
} // :goto_0
return;
} // .end method
public void stop ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
(( android.animation.Animator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( c.t.a.f ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lc/t/a/f;->c(F)V
/* .line 3 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
(( c.t.a.e ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/t/a/e;->a(Z)V
/* .line 4 */
v0 = this.b;
(( c.t.a.e ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lc/t/a/e;->c(I)V
/* .line 5 */
v0 = this.b;
(( c.t.a.e ) v0 ).k ( ); // invoke-virtual {v0}, Lc/t/a/e;->k()V
/* .line 6 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
