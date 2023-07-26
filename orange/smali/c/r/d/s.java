public class c.r.d.s extends androidx.recyclerview.widget.RecyclerView$n implements androidx.recyclerview.widget.RecyclerView$s {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final D;
	 public static final E;
	 /* # instance fields */
	 public Integer A;
	 public final java.lang.Runnable B;
	 public final androidx.recyclerview.widget.RecyclerView$t C;
	 public final Integer a;
	 public final Integer b;
	 public final android.graphics.drawable.StateListDrawable c;
	 public final android.graphics.drawable.Drawable d;
	 public final Integer e;
	 public final Integer f;
	 public final android.graphics.drawable.StateListDrawable g;
	 public final android.graphics.drawable.Drawable h;
	 public final Integer i;
	 public final Integer j;
	 public Integer k;
	 public Integer l;
	 public Float m;
	 public Integer n;
	 public Integer o;
	 public Float p;
	 public Integer q;
	 public Integer r;
	 public androidx.recyclerview.widget.RecyclerView s;
	 public Boolean t;
	 public Boolean u;
	 public Integer v;
	 public Integer w;
	 public final x;
	 public final y;
	 public final android.animation.ValueAnimator z;
	 /* # direct methods */
	 public static c.r.d.s ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 /* const v1, 0x10100a7 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput v1, v0, v2 */
		 /* .line 1 */
		 /* new-array v0, v2, [I */
		 /* .line 2 */
		 return;
	 } // .end method
	 public c.r.d.s ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$n;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lc/r/d/s;->q:I */
		 /* .line 3 */
		 /* iput v0, p0, Lc/r/d/s;->r:I */
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lc/r/d/s;->t:Z */
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lc/r/d/s;->u:Z */
		 /* .line 6 */
		 /* iput v0, p0, Lc/r/d/s;->v:I */
		 /* .line 7 */
		 /* iput v0, p0, Lc/r/d/s;->w:I */
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-array v2, v1, [I */
		 /* .line 8 */
		 this.x = v2;
		 /* new-array v2, v1, [I */
		 /* .line 9 */
		 this.y = v2;
		 /* new-array v1, v1, [F */
		 /* .line 10 */
		 /* fill-array-data v1, :array_0 */
		 /* .line 11 */
		 android.animation.ValueAnimator .ofFloat ( v1 );
		 this.z = v1;
		 /* .line 12 */
		 /* iput v0, p0, Lc/r/d/s;->A:I */
		 /* .line 13 */
		 /* new-instance v0, Lc/r/d/o; */
		 /* invoke-direct {v0, p0}, Lc/r/d/o;-><init>(Lc/r/d/s;)V */
		 this.B = v0;
		 /* .line 14 */
		 /* new-instance v0, Lc/r/d/p; */
		 /* invoke-direct {v0, p0}, Lc/r/d/p;-><init>(Lc/r/d/s;)V */
		 this.C = v0;
		 /* .line 15 */
		 this.c = p2;
		 /* .line 16 */
		 this.d = p3;
		 /* .line 17 */
		 this.g = p4;
		 /* .line 18 */
		 this.h = p5;
		 /* .line 19 */
		 p2 = 		 (( android.graphics.drawable.StateListDrawable ) p2 ).getIntrinsicWidth ( ); // invoke-virtual {p2}, Landroid/graphics/drawable/StateListDrawable;->getIntrinsicWidth()I
		 p2 = 		 java.lang.Math .max ( p6,p2 );
		 /* iput p2, p0, Lc/r/d/s;->e:I */
		 /* .line 20 */
		 p2 = 		 (( android.graphics.drawable.Drawable ) p3 ).getIntrinsicWidth ( ); // invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
		 p2 = 		 java.lang.Math .max ( p6,p2 );
		 /* iput p2, p0, Lc/r/d/s;->f:I */
		 /* .line 21 */
		 p2 = 		 (( android.graphics.drawable.StateListDrawable ) p4 ).getIntrinsicWidth ( ); // invoke-virtual {p4}, Landroid/graphics/drawable/StateListDrawable;->getIntrinsicWidth()I
		 p2 = 		 java.lang.Math .max ( p6,p2 );
		 /* iput p2, p0, Lc/r/d/s;->i:I */
		 /* .line 22 */
		 p2 = 		 (( android.graphics.drawable.Drawable ) p5 ).getIntrinsicWidth ( ); // invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
		 p2 = 		 java.lang.Math .max ( p6,p2 );
		 /* iput p2, p0, Lc/r/d/s;->j:I */
		 /* .line 23 */
		 /* iput p7, p0, Lc/r/d/s;->a:I */
		 /* .line 24 */
		 /* iput p8, p0, Lc/r/d/s;->b:I */
		 /* .line 25 */
		 p2 = this.c;
		 /* const/16 p3, 0xff */
		 (( android.graphics.drawable.StateListDrawable ) p2 ).setAlpha ( p3 ); // invoke-virtual {p2, p3}, Landroid/graphics/drawable/StateListDrawable;->setAlpha(I)V
		 /* .line 26 */
		 p2 = this.d;
		 (( android.graphics.drawable.Drawable ) p2 ).setAlpha ( p3 ); // invoke-virtual {p2, p3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
		 /* .line 27 */
		 p2 = this.z;
		 /* new-instance p3, Lc/r/d/q; */
		 /* invoke-direct {p3, p0}, Lc/r/d/q;-><init>(Lc/r/d/s;)V */
		 (( android.animation.ValueAnimator ) p2 ).addListener ( p3 ); // invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
		 /* .line 28 */
		 p2 = this.z;
		 /* new-instance p3, Lc/r/d/r; */
		 /* invoke-direct {p3, p0}, Lc/r/d/r;-><init>(Lc/r/d/s;)V */
		 (( android.animation.ValueAnimator ) p2 ).addUpdateListener ( p3 ); // invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
		 /* .line 29 */
		 (( c.r.d.s ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/s;->a(Landroidx/recyclerview/widget/RecyclerView;)V
		 return;
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x0 */
		 /* 0x3f800000 # 1.0f */
	 } // .end array-data
} // .end method
/* # virtual methods */
public final Integer a ( Float p0, Float p1, Integer[] p2, Integer p3, Integer p4, Integer p5 ) {
	 /* .locals 2 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 58 */
	 /* aget v0, p3, v0 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* aget p3, p3, v1 */
	 /* sub-int/2addr v0, p3 */
	 /* if-nez v0, :cond_0 */
} // :cond_0
/* sub-float/2addr p2, p1 */
/* int-to-float p1, v0 */
/* div-float/2addr p2, p1 */
/* sub-int/2addr p4, p6 */
/* int-to-float p1, p4 */
/* mul-float p2, p2, p1 */
/* float-to-int p1, p2 */
/* add-int/2addr p5, p1 */
/* if-ge p5, p4, :cond_1 */
/* if-ltz p5, :cond_1 */
} // :cond_1
} // .end method
public final void a ( ) {
/* .locals 2 */
/* .line 11 */
v0 = this.s;
v1 = this.B;
(( android.view.ViewGroup ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
return;
} // .end method
public final void a ( Float p0 ) {
/* .locals 8 */
/* .line 49 */
(( c.r.d.s ) p0 ).c ( ); // invoke-virtual {p0}, Lc/r/d/s;->c()[I
int v7 = 0; // const/4 v7, 0x0
/* .line 50 */
/* aget v0, v3, v7 */
/* int-to-float v0, v0 */
int v1 = 1; // const/4 v1, 0x1
/* aget v1, v3, v1 */
/* int-to-float v1, v1 */
p1 = java.lang.Math .min ( v1,p1 );
p1 = java.lang.Math .max ( v0,p1 );
/* .line 51 */
/* iget v0, p0, Lc/r/d/s;->o:I */
/* int-to-float v0, v0 */
/* sub-float/2addr v0, p1 */
v0 = java.lang.Math .abs ( v0 );
/* const/high16 v1, 0x40000000 # 2.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
return;
/* .line 52 */
} // :cond_0
/* iget v1, p0, Lc/r/d/s;->p:F */
v0 = this.s;
/* .line 53 */
v4 = (( androidx.recyclerview.widget.RecyclerView ) v0 ).computeHorizontalScrollRange ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I
v0 = this.s;
/* .line 54 */
v5 = (( androidx.recyclerview.widget.RecyclerView ) v0 ).computeHorizontalScrollOffset ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I
/* iget v6, p0, Lc/r/d/s;->q:I */
/* move-object v0, p0 */
/* move v2, p1 */
/* .line 55 */
v0 = /* invoke-virtual/range {v0 ..v6}, Lc/r/d/s;->a(FF[IIII)I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 56 */
v1 = this.s;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).scrollBy ( v0, v7 ); // invoke-virtual {v1, v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V
/* .line 57 */
} // :cond_1
/* iput p1, p0, Lc/r/d/s;->p:F */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 5 */
/* .line 5 */
/* iget v0, p0, Lc/r/d/s;->A:I */
int v1 = 2; // const/4 v1, 0x2
int v2 = 1; // const/4 v2, 0x1
/* if-eq v0, v2, :cond_0 */
/* if-eq v0, v1, :cond_1 */
/* .line 6 */
} // :cond_0
v0 = this.z;
(( android.animation.ValueAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V
} // :cond_1
int v0 = 3; // const/4 v0, 0x3
/* .line 7 */
/* iput v0, p0, Lc/r/d/s;->A:I */
/* .line 8 */
v0 = this.z;
/* new-array v1, v1, [F */
int v3 = 0; // const/4 v3, 0x0
(( android.animation.ValueAnimator ) v0 ).getAnimatedValue ( ); // invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;
/* check-cast v4, Ljava/lang/Float; */
v4 = (( java.lang.Float ) v4 ).floatValue ( ); // invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F
/* aput v4, v1, v3 */
int v3 = 0; // const/4 v3, 0x0
/* aput v3, v1, v2 */
(( android.animation.ValueAnimator ) v0 ).setFloatValues ( v1 ); // invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setFloatValues([F)V
/* .line 9 */
v0 = this.z;
/* int-to-long v1, p1 */
(( android.animation.ValueAnimator ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;
/* .line 10 */
p1 = this.z;
(( android.animation.ValueAnimator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V
} // :goto_0
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 8 */
/* .line 23 */
v0 = this.s;
v0 = (( androidx.recyclerview.widget.RecyclerView ) v0 ).computeVerticalScrollRange ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I
/* .line 24 */
/* iget v1, p0, Lc/r/d/s;->r:I */
/* sub-int v2, v0, v1 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
/* if-lez v2, :cond_0 */
/* .line 25 */
/* iget v2, p0, Lc/r/d/s;->a:I */
/* if-lt v1, v2, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* iput-boolean v2, p0, Lc/r/d/s;->t:Z */
/* .line 26 */
v2 = this.s;
v2 = (( androidx.recyclerview.widget.RecyclerView ) v2 ).computeHorizontalScrollRange ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I
/* .line 27 */
/* iget v5, p0, Lc/r/d/s;->q:I */
/* sub-int v6, v2, v5 */
/* if-lez v6, :cond_1 */
/* .line 28 */
/* iget v6, p0, Lc/r/d/s;->a:I */
/* if-lt v5, v6, :cond_1 */
int v6 = 1; // const/4 v6, 0x1
} // :cond_1
int v6 = 0; // const/4 v6, 0x0
} // :goto_1
/* iput-boolean v6, p0, Lc/r/d/s;->u:Z */
/* .line 29 */
/* iget-boolean v7, p0, Lc/r/d/s;->t:Z */
/* if-nez v7, :cond_3 */
/* if-nez v6, :cond_3 */
/* .line 30 */
/* iget p1, p0, Lc/r/d/s;->v:I */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 31 */
(( c.r.d.s ) p0 ).c ( v3 ); // invoke-virtual {p0, v3}, Lc/r/d/s;->c(I)V
} // :cond_2
return;
/* .line 32 */
} // :cond_3
/* iget-boolean v3, p0, Lc/r/d/s;->t:Z */
/* const/high16 v6, 0x40000000 # 2.0f */
if ( v3 != null) { // if-eqz v3, :cond_4
/* int-to-float p2, p2 */
/* int-to-float v3, v1 */
/* div-float v7, v3, v6 */
/* add-float/2addr p2, v7 */
/* mul-float v3, v3, p2 */
/* int-to-float p2, v0 */
/* div-float/2addr v3, p2 */
/* float-to-int p2, v3 */
/* .line 33 */
/* iput p2, p0, Lc/r/d/s;->l:I */
/* mul-int p2, v1, v1 */
/* .line 34 */
/* div-int/2addr p2, v0 */
p2 = java.lang.Math .min ( v1,p2 );
/* iput p2, p0, Lc/r/d/s;->k:I */
/* .line 35 */
} // :cond_4
/* iget-boolean p2, p0, Lc/r/d/s;->u:Z */
if ( p2 != null) { // if-eqz p2, :cond_5
/* int-to-float p1, p1 */
/* int-to-float p2, v5 */
/* div-float v0, p2, v6 */
/* add-float/2addr p1, v0 */
/* mul-float p2, p2, p1 */
/* int-to-float p1, v2 */
/* div-float/2addr p2, p1 */
/* float-to-int p1, p2 */
/* .line 36 */
/* iput p1, p0, Lc/r/d/s;->o:I */
/* mul-int p1, v5, v5 */
/* .line 37 */
/* div-int/2addr p1, v2 */
p1 = java.lang.Math .min ( v5,p1 );
/* iput p1, p0, Lc/r/d/s;->n:I */
/* .line 38 */
} // :cond_5
/* iget p1, p0, Lc/r/d/s;->v:I */
if ( p1 != null) { // if-eqz p1, :cond_6
/* if-ne p1, v4, :cond_7 */
/* .line 39 */
} // :cond_6
(( c.r.d.s ) p0 ).c ( v4 ); // invoke-virtual {p0, v4}, Lc/r/d/s;->c(I)V
} // :cond_7
return;
} // .end method
public final void a ( android.graphics.Canvas p0 ) {
/* .locals 6 */
/* .line 12 */
/* iget v0, p0, Lc/r/d/s;->r:I */
/* .line 13 */
/* iget v1, p0, Lc/r/d/s;->i:I */
/* sub-int/2addr v0, v1 */
/* .line 14 */
/* iget v2, p0, Lc/r/d/s;->o:I */
/* iget v3, p0, Lc/r/d/s;->n:I */
/* div-int/lit8 v4, v3, 0x2 */
/* sub-int/2addr v2, v4 */
/* .line 15 */
v4 = this.g;
int v5 = 0; // const/4 v5, 0x0
(( android.graphics.drawable.StateListDrawable ) v4 ).setBounds ( v5, v5, v3, v1 ); // invoke-virtual {v4, v5, v5, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->setBounds(IIII)V
/* .line 16 */
v1 = this.h;
/* iget v3, p0, Lc/r/d/s;->q:I */
/* iget v4, p0, Lc/r/d/s;->j:I */
/* .line 17 */
(( android.graphics.drawable.Drawable ) v1 ).setBounds ( v5, v5, v3, v4 ); // invoke-virtual {v1, v5, v5, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* int-to-float v1, v0 */
int v3 = 0; // const/4 v3, 0x0
/* .line 18 */
(( android.graphics.Canvas ) p1 ).translate ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 19 */
v1 = this.h;
(( android.graphics.drawable.Drawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* int-to-float v1, v2 */
/* .line 20 */
(( android.graphics.Canvas ) p1 ).translate ( v1, v3 ); // invoke-virtual {p1, v1, v3}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 21 */
v1 = this.g;
(( android.graphics.drawable.StateListDrawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/StateListDrawable;->draw(Landroid/graphics/Canvas;)V
/* neg-int v1, v2 */
/* int-to-float v1, v1 */
/* neg-int v0, v0 */
/* int-to-float v0, v0 */
/* .line 22 */
(( android.graphics.Canvas ) p1 ).translate ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.s;
/* if-ne v0, p1, :cond_0 */
return;
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
(( c.r.d.s ) p0 ).b ( ); // invoke-virtual {p0}, Lc/r/d/s;->b()V
/* .line 3 */
} // :cond_1
this.s = p1;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 4 */
(( c.r.d.s ) p0 ).g ( ); // invoke-virtual {p0}, Lc/r/d/s;->g()V
} // :cond_2
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean a ( Float p0, Float p1 ) {
/* .locals 2 */
/* .line 59 */
/* iget v0, p0, Lc/r/d/s;->r:I */
/* iget v1, p0, Lc/r/d/s;->i:I */
/* sub-int/2addr v0, v1 */
/* int-to-float v0, v0 */
/* cmpl-float p2, p2, v0 */
/* if-ltz p2, :cond_0 */
/* iget p2, p0, Lc/r/d/s;->o:I */
/* iget v0, p0, Lc/r/d/s;->n:I */
/* div-int/lit8 v1, v0, 0x2 */
/* sub-int v1, p2, v1 */
/* int-to-float v1, v1 */
/* cmpl-float v1, p1, v1 */
/* if-ltz v1, :cond_0 */
/* div-int/lit8 v0, v0, 0x2 */
/* add-int/2addr p2, v0 */
/* int-to-float p2, p2 */
/* cmpg-float p1, p1, p2 */
/* if-gtz p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView p0, android.view.MotionEvent p1 ) {
/* .locals 5 */
/* .line 40 */
/* iget p1, p0, Lc/r/d/s;->v:I */
int v0 = 0; // const/4 v0, 0x0
int v1 = 2; // const/4 v1, 0x2
int v2 = 1; // const/4 v2, 0x1
/* if-ne p1, v2, :cond_3 */
/* .line 41 */
p1 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
v3 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
p1 = (( c.r.d.s ) p0 ).b ( p1, v3 ); // invoke-virtual {p0, p1, v3}, Lc/r/d/s;->b(FF)Z
/* .line 42 */
v3 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
v4 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
v3 = (( c.r.d.s ) p0 ).a ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lc/r/d/s;->a(FF)Z
/* .line 43 */
v4 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v4, :cond_4 */
/* if-nez p1, :cond_0 */
if ( v3 != null) { // if-eqz v3, :cond_4
} // :cond_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 44 */
/* iput v2, p0, Lc/r/d/s;->w:I */
/* .line 45 */
p1 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
/* float-to-int p1, p1 */
/* int-to-float p1, p1 */
/* iput p1, p0, Lc/r/d/s;->p:F */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 46 */
/* iput v1, p0, Lc/r/d/s;->w:I */
/* .line 47 */
p1 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
/* float-to-int p1, p1 */
/* int-to-float p1, p1 */
/* iput p1, p0, Lc/r/d/s;->m:F */
/* .line 48 */
} // :cond_2
} // :goto_0
(( c.r.d.s ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lc/r/d/s;->c(I)V
} // :cond_3
/* if-ne p1, v1, :cond_4 */
} // :goto_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_4
} // .end method
public final void b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.s;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->b(Landroidx/recyclerview/widget/RecyclerView$n;)V
/* .line 2 */
v0 = this.s;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->b(Landroidx/recyclerview/widget/RecyclerView$s;)V
/* .line 3 */
v0 = this.s;
v1 = this.C;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->b(Landroidx/recyclerview/widget/RecyclerView$t;)V
/* .line 4 */
(( c.r.d.s ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/s;->a()V
return;
} // .end method
public final void b ( Float p0 ) {
/* .locals 8 */
/* .line 55 */
(( c.r.d.s ) p0 ).d ( ); // invoke-virtual {p0}, Lc/r/d/s;->d()[I
int v7 = 0; // const/4 v7, 0x0
/* .line 56 */
/* aget v0, v3, v7 */
/* int-to-float v0, v0 */
int v1 = 1; // const/4 v1, 0x1
/* aget v1, v3, v1 */
/* int-to-float v1, v1 */
p1 = java.lang.Math .min ( v1,p1 );
p1 = java.lang.Math .max ( v0,p1 );
/* .line 57 */
/* iget v0, p0, Lc/r/d/s;->l:I */
/* int-to-float v0, v0 */
/* sub-float/2addr v0, p1 */
v0 = java.lang.Math .abs ( v0 );
/* const/high16 v1, 0x40000000 # 2.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
return;
/* .line 58 */
} // :cond_0
/* iget v1, p0, Lc/r/d/s;->m:F */
v0 = this.s;
/* .line 59 */
v4 = (( androidx.recyclerview.widget.RecyclerView ) v0 ).computeVerticalScrollRange ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I
v0 = this.s;
/* .line 60 */
v5 = (( androidx.recyclerview.widget.RecyclerView ) v0 ).computeVerticalScrollOffset ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I
/* iget v6, p0, Lc/r/d/s;->r:I */
/* move-object v0, p0 */
/* move v2, p1 */
/* .line 61 */
v0 = /* invoke-virtual/range {v0 ..v6}, Lc/r/d/s;->a(FF[IIII)I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 62 */
v1 = this.s;
(( androidx.recyclerview.widget.RecyclerView ) v1 ).scrollBy ( v7, v0 ); // invoke-virtual {v1, v7, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V
/* .line 63 */
} // :cond_1
/* iput p1, p0, Lc/r/d/s;->m:F */
return;
} // .end method
public final void b ( Integer p0 ) {
/* .locals 4 */
/* .line 5 */
(( c.r.d.s ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/s;->a()V
/* .line 6 */
v0 = this.s;
v1 = this.B;
/* int-to-long v2, p1 */
(( android.view.ViewGroup ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
public final void b ( android.graphics.Canvas p0 ) {
/* .locals 6 */
/* .line 17 */
/* iget v0, p0, Lc/r/d/s;->q:I */
/* .line 18 */
/* iget v1, p0, Lc/r/d/s;->e:I */
/* sub-int/2addr v0, v1 */
/* .line 19 */
/* iget v2, p0, Lc/r/d/s;->l:I */
/* iget v3, p0, Lc/r/d/s;->k:I */
/* div-int/lit8 v4, v3, 0x2 */
/* sub-int/2addr v2, v4 */
/* .line 20 */
v4 = this.c;
int v5 = 0; // const/4 v5, 0x0
(( android.graphics.drawable.StateListDrawable ) v4 ).setBounds ( v5, v5, v1, v3 ); // invoke-virtual {v4, v5, v5, v1, v3}, Landroid/graphics/drawable/StateListDrawable;->setBounds(IIII)V
/* .line 21 */
v1 = this.d;
/* iget v3, p0, Lc/r/d/s;->f:I */
/* iget v4, p0, Lc/r/d/s;->r:I */
/* .line 22 */
(( android.graphics.drawable.Drawable ) v1 ).setBounds ( v5, v5, v3, v4 ); // invoke-virtual {v1, v5, v5, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 23 */
v1 = (( c.r.d.s ) p0 ).e ( ); // invoke-virtual {p0}, Lc/r/d/s;->e()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 24 */
v0 = this.d;
(( android.graphics.drawable.Drawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* .line 25 */
/* iget v0, p0, Lc/r/d/s;->e:I */
/* int-to-float v0, v0 */
/* int-to-float v1, v2 */
(( android.graphics.Canvas ) p1 ).translate ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V
/* const/high16 v0, -0x40800000 # -1.0f */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* .line 26 */
(( android.graphics.Canvas ) p1 ).scale ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V
/* .line 27 */
v0 = this.c;
(( android.graphics.drawable.StateListDrawable ) v0 ).draw ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/StateListDrawable;->draw(Landroid/graphics/Canvas;)V
/* .line 28 */
(( android.graphics.Canvas ) p1 ).scale ( v1, v1 ); // invoke-virtual {p1, v1, v1}, Landroid/graphics/Canvas;->scale(FF)V
/* .line 29 */
/* iget v0, p0, Lc/r/d/s;->e:I */
/* neg-int v0, v0 */
/* int-to-float v0, v0 */
/* neg-int v1, v2 */
/* int-to-float v1, v1 */
(( android.graphics.Canvas ) p1 ).translate ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V
} // :cond_0
/* int-to-float v1, v0 */
int v3 = 0; // const/4 v3, 0x0
/* .line 30 */
(( android.graphics.Canvas ) p1 ).translate ( v1, v3 ); // invoke-virtual {p1, v1, v3}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 31 */
v1 = this.d;
(( android.graphics.drawable.Drawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* int-to-float v1, v2 */
/* .line 32 */
(( android.graphics.Canvas ) p1 ).translate ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 33 */
v1 = this.c;
(( android.graphics.drawable.StateListDrawable ) v1 ).draw ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/StateListDrawable;->draw(Landroid/graphics/Canvas;)V
/* neg-int v0, v0 */
/* int-to-float v0, v0 */
/* neg-int v1, v2 */
/* int-to-float v1, v1 */
/* .line 34 */
(( android.graphics.Canvas ) p1 ).translate ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V
} // :goto_0
return;
} // .end method
public void b ( android.graphics.Canvas p0, androidx.recyclerview.widget.RecyclerView p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
/* .locals 0 */
/* .line 7 */
/* iget p2, p0, Lc/r/d/s;->q:I */
p3 = this.s;
p3 = (( android.view.ViewGroup ) p3 ).getWidth ( ); // invoke-virtual {p3}, Landroid/view/ViewGroup;->getWidth()I
/* if-ne p2, p3, :cond_3 */
/* iget p2, p0, Lc/r/d/s;->r:I */
p3 = this.s;
/* .line 8 */
p3 = (( android.view.ViewGroup ) p3 ).getHeight ( ); // invoke-virtual {p3}, Landroid/view/ViewGroup;->getHeight()I
/* if-eq p2, p3, :cond_0 */
/* .line 9 */
} // :cond_0
/* iget p2, p0, Lc/r/d/s;->A:I */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 10 */
/* iget-boolean p2, p0, Lc/r/d/s;->t:Z */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 11 */
(( c.r.d.s ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/s;->b(Landroid/graphics/Canvas;)V
/* .line 12 */
} // :cond_1
/* iget-boolean p2, p0, Lc/r/d/s;->u:Z */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 13 */
(( c.r.d.s ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/s;->a(Landroid/graphics/Canvas;)V
} // :cond_2
return;
/* .line 14 */
} // :cond_3
} // :goto_0
p1 = this.s;
p1 = (( android.view.ViewGroup ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I
/* iput p1, p0, Lc/r/d/s;->q:I */
/* .line 15 */
p1 = this.s;
p1 = (( android.view.ViewGroup ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getHeight()I
/* iput p1, p0, Lc/r/d/s;->r:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 16 */
(( c.r.d.s ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/s;->c(I)V
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView p0, android.view.MotionEvent p1 ) {
/* .locals 4 */
/* .line 35 */
/* iget p1, p0, Lc/r/d/s;->v:I */
/* if-nez p1, :cond_0 */
return;
/* .line 36 */
} // :cond_0
p1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
int v0 = 1; // const/4 v0, 0x1
int v1 = 2; // const/4 v1, 0x2
/* if-nez p1, :cond_4 */
/* .line 37 */
p1 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
v2 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
p1 = (( c.r.d.s ) p0 ).b ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Lc/r/d/s;->b(FF)Z
/* .line 38 */
v2 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
v3 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
v2 = (( c.r.d.s ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lc/r/d/s;->a(FF)Z
/* if-nez p1, :cond_1 */
if ( v2 != null) { // if-eqz v2, :cond_7
} // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 39 */
/* iput v0, p0, Lc/r/d/s;->w:I */
/* .line 40 */
p1 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
/* float-to-int p1, p1 */
/* int-to-float p1, p1 */
/* iput p1, p0, Lc/r/d/s;->p:F */
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 41 */
/* iput v1, p0, Lc/r/d/s;->w:I */
/* .line 42 */
p1 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
/* float-to-int p1, p1 */
/* int-to-float p1, p1 */
/* iput p1, p0, Lc/r/d/s;->m:F */
/* .line 43 */
} // :cond_3
} // :goto_0
(( c.r.d.s ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lc/r/d/s;->c(I)V
/* .line 44 */
} // :cond_4
p1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne p1, v0, :cond_5 */
/* iget p1, p0, Lc/r/d/s;->v:I */
/* if-ne p1, v1, :cond_5 */
int p1 = 0; // const/4 p1, 0x0
/* .line 45 */
/* iput p1, p0, Lc/r/d/s;->m:F */
/* .line 46 */
/* iput p1, p0, Lc/r/d/s;->p:F */
/* .line 47 */
(( c.r.d.s ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/s;->c(I)V
int p1 = 0; // const/4 p1, 0x0
/* .line 48 */
/* iput p1, p0, Lc/r/d/s;->w:I */
/* .line 49 */
} // :cond_5
p1 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne p1, v1, :cond_7 */
/* iget p1, p0, Lc/r/d/s;->v:I */
/* if-ne p1, v1, :cond_7 */
/* .line 50 */
(( c.r.d.s ) p0 ).h ( ); // invoke-virtual {p0}, Lc/r/d/s;->h()V
/* .line 51 */
/* iget p1, p0, Lc/r/d/s;->w:I */
/* if-ne p1, v0, :cond_6 */
/* .line 52 */
p1 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
(( c.r.d.s ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/s;->a(F)V
/* .line 53 */
} // :cond_6
/* iget p1, p0, Lc/r/d/s;->w:I */
/* if-ne p1, v1, :cond_7 */
/* .line 54 */
p1 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
(( c.r.d.s ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/s;->b(F)V
} // :cond_7
} // :goto_1
return;
} // .end method
public Boolean b ( Float p0, Float p1 ) {
/* .locals 2 */
/* .line 64 */
v0 = (( c.r.d.s ) p0 ).e ( ); // invoke-virtual {p0}, Lc/r/d/s;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lc/r/d/s;->e:I */
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* cmpg-float p1, p1, v0 */
/* if-gtz p1, :cond_1 */
} // :cond_0
/* iget v0, p0, Lc/r/d/s;->q:I */
/* iget v1, p0, Lc/r/d/s;->e:I */
/* sub-int/2addr v0, v1 */
/* int-to-float v0, v0 */
/* cmpl-float p1, p1, v0 */
/* if-ltz p1, :cond_1 */
} // :goto_0
/* iget p1, p0, Lc/r/d/s;->l:I */
/* iget v0, p0, Lc/r/d/s;->k:I */
/* div-int/lit8 v1, v0, 0x2 */
/* sub-int v1, p1, v1 */
/* int-to-float v1, v1 */
/* cmpl-float v1, p2, v1 */
/* if-ltz v1, :cond_1 */
/* div-int/lit8 v0, v0, 0x2 */
/* add-int/2addr p1, v0 */
/* int-to-float p1, p1 */
/* cmpg-float p1, p2, p1 */
/* if-gtz p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
} // .end method
public void c ( Integer p0 ) {
/* .locals 3 */
int v0 = 2; // const/4 v0, 0x2
/* if-ne p1, v0, :cond_0 */
/* .line 1 */
/* iget v1, p0, Lc/r/d/s;->v:I */
/* if-eq v1, v0, :cond_0 */
/* .line 2 */
v1 = this.c;
v2 = c.r.d.s.D;
(( android.graphics.drawable.StateListDrawable ) v1 ).setState ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/drawable/StateListDrawable;->setState([I)Z
/* .line 3 */
(( c.r.d.s ) p0 ).a ( ); // invoke-virtual {p0}, Lc/r/d/s;->a()V
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 4 */
(( c.r.d.s ) p0 ).f ( ); // invoke-virtual {p0}, Lc/r/d/s;->f()V
/* .line 5 */
} // :cond_1
(( c.r.d.s ) p0 ).h ( ); // invoke-virtual {p0}, Lc/r/d/s;->h()V
/* .line 6 */
} // :goto_0
/* iget v1, p0, Lc/r/d/s;->v:I */
/* if-ne v1, v0, :cond_2 */
/* if-eq p1, v0, :cond_2 */
/* .line 7 */
v0 = this.c;
v1 = c.r.d.s.E;
(( android.graphics.drawable.StateListDrawable ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/drawable/StateListDrawable;->setState([I)Z
/* const/16 v0, 0x4b0 */
/* .line 8 */
(( c.r.d.s ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/s;->b(I)V
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_3 */
/* const/16 v0, 0x5dc */
/* .line 9 */
(( c.r.d.s ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/r/d/s;->b(I)V
/* .line 10 */
} // :cond_3
} // :goto_1
/* iput p1, p0, Lc/r/d/s;->v:I */
return;
} // .end method
public final c ( ) {
/* .locals 3 */
/* .line 11 */
v0 = this.y;
/* iget v1, p0, Lc/r/d/s;->b:I */
int v2 = 0; // const/4 v2, 0x0
/* aput v1, v0, v2 */
/* .line 12 */
/* iget v2, p0, Lc/r/d/s;->q:I */
/* sub-int/2addr v2, v1 */
int v1 = 1; // const/4 v1, 0x1
/* aput v2, v0, v1 */
} // .end method
public final d ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.x;
/* iget v1, p0, Lc/r/d/s;->b:I */
int v2 = 0; // const/4 v2, 0x0
/* aput v1, v0, v2 */
/* .line 2 */
/* iget v2, p0, Lc/r/d/s;->r:I */
/* sub-int/2addr v2, v1 */
int v1 = 1; // const/4 v1, 0x1
/* aput v2, v0, v1 */
} // .end method
public final Boolean e ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.s;
v0 = c.h.n.v0 .o ( v0 );
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public void f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.s;
(( android.view.ViewGroup ) v0 ).invalidate ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V
return;
} // .end method
public final void g ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.s;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView$n;)V
/* .line 2 */
v0 = this.s;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView$s;)V
/* .line 3 */
v0 = this.s;
v1 = this.C;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView$t;)V
return;
} // .end method
public void h ( ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Lc/r/d/s;->A:I */
if ( v0 != null) { // if-eqz v0, :cond_1
int v1 = 3; // const/4 v1, 0x3
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.z;
(( android.animation.ValueAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput v0, p0, Lc/r/d/s;->A:I */
/* .line 4 */
v1 = this.z;
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [F */
int v3 = 0; // const/4 v3, 0x0
(( android.animation.ValueAnimator ) v1 ).getAnimatedValue ( ); // invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;
/* check-cast v4, Ljava/lang/Float; */
v4 = (( java.lang.Float ) v4 ).floatValue ( ); // invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F
/* aput v4, v2, v3 */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* aput v3, v2, v0 */
(( android.animation.ValueAnimator ) v1 ).setFloatValues ( v2 ); // invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V
/* .line 5 */
v0 = this.z;
/* const-wide/16 v1, 0x1f4 */
(( android.animation.ValueAnimator ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;
/* .line 6 */
v0 = this.z;
/* const-wide/16 v1, 0x0 */
(( android.animation.ValueAnimator ) v0 ).setStartDelay ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setStartDelay(J)V
/* .line 7 */
v0 = this.z;
(( android.animation.ValueAnimator ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V
} // :goto_0
return;
} // .end method
