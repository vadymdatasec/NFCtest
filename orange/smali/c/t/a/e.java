public class c.t.a.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.graphics.RectF a;
	 public final android.graphics.Paint b;
	 public final android.graphics.Paint c;
	 public final android.graphics.Paint d;
	 public Float e;
	 public Float f;
	 public Float g;
	 public Float h;
	 public i;
	 public Integer j;
	 public Float k;
	 public Float l;
	 public Float m;
	 public Boolean n;
	 public android.graphics.Path o;
	 public Float p;
	 public Float q;
	 public Integer r;
	 public Integer s;
	 public Integer t;
	 public Integer u;
	 /* # direct methods */
	 public c.t.a.e ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Landroid/graphics/RectF; */
		 /* invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V */
		 this.a = v0;
		 /* .line 3 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.b = v0;
		 /* .line 4 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.c = v0;
		 /* .line 5 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.d = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
		 /* iput v0, p0, Lc/t/a/e;->e:F */
		 /* .line 7 */
		 /* iput v0, p0, Lc/t/a/e;->f:F */
		 /* .line 8 */
		 /* iput v0, p0, Lc/t/a/e;->g:F */
		 /* const/high16 v0, 0x40a00000 # 5.0f */
		 /* .line 9 */
		 /* iput v0, p0, Lc/t/a/e;->h:F */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* .line 10 */
		 /* iput v0, p0, Lc/t/a/e;->p:F */
		 /* const/16 v0, 0xff */
		 /* .line 11 */
		 /* iput v0, p0, Lc/t/a/e;->t:I */
		 /* .line 12 */
		 v0 = this.b;
		 v1 = android.graphics.Paint$Cap.SQUARE;
		 (( android.graphics.Paint ) v0 ).setStrokeCap ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
		 /* .line 13 */
		 v0 = this.b;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 14 */
		 v0 = this.b;
		 v2 = android.graphics.Paint$Style.STROKE;
		 (( android.graphics.Paint ) v0 ).setStyle ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 /* .line 15 */
		 v0 = this.c;
		 v2 = android.graphics.Paint$Style.FILL;
		 (( android.graphics.Paint ) v0 ).setStyle ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 /* .line 16 */
		 v0 = this.c;
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 17 */
		 v0 = this.d;
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 1 */
		 /* .line 47 */
		 /* iget v0, p0, Lc/t/a/e;->t:I */
	 } // .end method
	 public void a ( Float p0 ) {
		 /* .locals 1 */
		 /* .line 50 */
		 /* iget v0, p0, Lc/t/a/e;->p:F */
		 /* cmpl-float v0, p1, v0 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 51 */
			 /* iput p1, p0, Lc/t/a/e;->p:F */
		 } // :cond_0
		 return;
	 } // .end method
	 public void a ( Float p0, Float p1 ) {
		 /* .locals 0 */
		 /* float-to-int p1, p1 */
		 /* .line 1 */
		 /* iput p1, p0, Lc/t/a/e;->r:I */
		 /* float-to-int p1, p2 */
		 /* .line 2 */
		 /* iput p1, p0, Lc/t/a/e;->s:I */
		 return;
	 } // .end method
	 public void a ( Integer p0 ) {
		 /* .locals 0 */
		 /* .line 46 */
		 /* iput p1, p0, Lc/t/a/e;->t:I */
		 return;
	 } // .end method
	 public void a ( android.graphics.Canvas p0, Float p1, Float p2, android.graphics.RectF p3 ) {
		 /* .locals 7 */
		 /* .line 21 */
		 /* iget-boolean v0, p0, Lc/t/a/e;->n:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 22 */
			 v0 = this.o;
			 /* if-nez v0, :cond_0 */
			 /* .line 23 */
			 /* new-instance v0, Landroid/graphics/Path; */
			 /* invoke-direct {v0}, Landroid/graphics/Path;-><init>()V */
			 this.o = v0;
			 /* .line 24 */
			 v1 = android.graphics.Path$FillType.EVEN_ODD;
			 (( android.graphics.Path ) v0 ).setFillType ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V
			 /* .line 25 */
		 } // :cond_0
		 (( android.graphics.Path ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/graphics/Path;->reset()V
		 /* .line 26 */
	 } // :goto_0
	 v0 = 	 (( android.graphics.RectF ) p4 ).width ( ); // invoke-virtual {p4}, Landroid/graphics/RectF;->width()F
	 v1 = 	 (( android.graphics.RectF ) p4 ).height ( ); // invoke-virtual {p4}, Landroid/graphics/RectF;->height()F
	 v0 = 	 java.lang.Math .min ( v0,v1 );
	 /* const/high16 v1, 0x40000000 # 2.0f */
	 /* div-float/2addr v0, v1 */
	 /* .line 27 */
	 /* iget v2, p0, Lc/t/a/e;->r:I */
	 /* int-to-float v2, v2 */
	 /* iget v3, p0, Lc/t/a/e;->p:F */
	 /* mul-float v2, v2, v3 */
	 /* div-float/2addr v2, v1 */
	 /* .line 28 */
	 v3 = this.o;
	 int v4 = 0; // const/4 v4, 0x0
	 (( android.graphics.Path ) v3 ).moveTo ( v4, v4 ); // invoke-virtual {v3, v4, v4}, Landroid/graphics/Path;->moveTo(FF)V
	 /* .line 29 */
	 v3 = this.o;
	 /* iget v5, p0, Lc/t/a/e;->r:I */
	 /* int-to-float v5, v5 */
	 /* iget v6, p0, Lc/t/a/e;->p:F */
	 /* mul-float v5, v5, v6 */
	 (( android.graphics.Path ) v3 ).lineTo ( v5, v4 ); // invoke-virtual {v3, v5, v4}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 30 */
	 v3 = this.o;
	 /* iget v4, p0, Lc/t/a/e;->r:I */
	 /* int-to-float v4, v4 */
	 /* iget v5, p0, Lc/t/a/e;->p:F */
	 /* mul-float v4, v4, v5 */
	 /* div-float/2addr v4, v1 */
	 /* iget v6, p0, Lc/t/a/e;->s:I */
	 /* int-to-float v6, v6 */
	 /* mul-float v6, v6, v5 */
	 (( android.graphics.Path ) v3 ).lineTo ( v4, v6 ); // invoke-virtual {v3, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 31 */
	 v3 = this.o;
	 v4 = 	 (( android.graphics.RectF ) p4 ).centerX ( ); // invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F
	 /* add-float/2addr v0, v4 */
	 /* sub-float/2addr v0, v2 */
	 /* .line 32 */
	 v2 = 	 (( android.graphics.RectF ) p4 ).centerY ( ); // invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F
	 /* iget v4, p0, Lc/t/a/e;->h:F */
	 /* div-float/2addr v4, v1 */
	 /* add-float/2addr v2, v4 */
	 /* .line 33 */
	 (( android.graphics.Path ) v3 ).offset ( v0, v2 ); // invoke-virtual {v3, v0, v2}, Landroid/graphics/Path;->offset(FF)V
	 /* .line 34 */
	 v0 = this.o;
	 (( android.graphics.Path ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/graphics/Path;->close()V
	 /* .line 35 */
	 v0 = this.c;
	 /* iget v1, p0, Lc/t/a/e;->u:I */
	 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
	 /* .line 36 */
	 v0 = this.c;
	 /* iget v1, p0, Lc/t/a/e;->t:I */
	 (( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
	 /* .line 37 */
	 (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
	 /* add-float/2addr p2, p3 */
	 /* .line 38 */
	 p3 = 	 (( android.graphics.RectF ) p4 ).centerX ( ); // invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F
	 /* .line 39 */
	 p4 = 	 (( android.graphics.RectF ) p4 ).centerY ( ); // invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F
	 /* .line 40 */
	 (( android.graphics.Canvas ) p1 ).rotate ( p2, p3, p4 ); // invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/Canvas;->rotate(FFF)V
	 /* .line 41 */
	 p2 = this.o;
	 p3 = this.c;
	 (( android.graphics.Canvas ) p1 ).drawPath ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
	 /* .line 42 */
	 (( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
} // :cond_1
return;
} // .end method
public void a ( android.graphics.Canvas p0, android.graphics.Rect p1 ) {
/* .locals 8 */
/* .line 3 */
v6 = this.a;
/* .line 4 */
/* iget v0, p0, Lc/t/a/e;->q:F */
/* iget v1, p0, Lc/t/a/e;->h:F */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* add-float/2addr v1, v0 */
int v3 = 0; // const/4 v3, 0x0
/* cmpg-float v0, v0, v3 */
/* if-gtz v0, :cond_0 */
/* .line 5 */
v0 = (( android.graphics.Rect ) p2 ).width ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->width()I
v1 = (( android.graphics.Rect ) p2 ).height ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->height()I
v0 = java.lang.Math .min ( v0,v1 );
/* int-to-float v0, v0 */
/* div-float/2addr v0, v2 */
/* iget v1, p0, Lc/t/a/e;->r:I */
/* int-to-float v1, v1 */
/* iget v3, p0, Lc/t/a/e;->p:F */
/* mul-float v1, v1, v3 */
/* div-float/2addr v1, v2 */
/* iget v3, p0, Lc/t/a/e;->h:F */
/* div-float/2addr v3, v2 */
v1 = java.lang.Math .max ( v1,v3 );
/* sub-float v1, v0, v1 */
/* .line 6 */
} // :cond_0
v0 = (( android.graphics.Rect ) p2 ).centerX ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I
/* int-to-float v0, v0 */
/* sub-float/2addr v0, v1 */
/* .line 7 */
v3 = (( android.graphics.Rect ) p2 ).centerY ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I
/* int-to-float v3, v3 */
/* sub-float/2addr v3, v1 */
/* .line 8 */
v4 = (( android.graphics.Rect ) p2 ).centerX ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I
/* int-to-float v4, v4 */
/* add-float/2addr v4, v1 */
/* .line 9 */
p2 = (( android.graphics.Rect ) p2 ).centerY ( ); // invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I
/* int-to-float p2, p2 */
/* add-float/2addr p2, v1 */
/* .line 10 */
(( android.graphics.RectF ) v6 ).set ( v0, v3, v4, p2 ); // invoke-virtual {v6, v0, v3, v4, p2}, Landroid/graphics/RectF;->set(FFFF)V
/* .line 11 */
/* iget p2, p0, Lc/t/a/e;->e:F */
/* iget v0, p0, Lc/t/a/e;->g:F */
/* add-float/2addr p2, v0 */
/* const/high16 v1, 0x43b40000 # 360.0f */
/* mul-float p2, p2, v1 */
/* .line 12 */
/* iget v3, p0, Lc/t/a/e;->f:F */
/* add-float/2addr v3, v0 */
/* mul-float v3, v3, v1 */
/* sub-float v7, v3, p2 */
/* .line 13 */
v0 = this.b;
/* iget v1, p0, Lc/t/a/e;->u:I */
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 14 */
v0 = this.b;
/* iget v1, p0, Lc/t/a/e;->t:I */
(( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
/* .line 15 */
/* iget v0, p0, Lc/t/a/e;->h:F */
/* div-float/2addr v0, v2 */
/* .line 16 */
(( android.graphics.RectF ) v6 ).inset ( v0, v0 ); // invoke-virtual {v6, v0, v0}, Landroid/graphics/RectF;->inset(FF)V
/* .line 17 */
v1 = (( android.graphics.RectF ) v6 ).centerX ( ); // invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F
v3 = (( android.graphics.RectF ) v6 ).centerY ( ); // invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F
v4 = (( android.graphics.RectF ) v6 ).width ( ); // invoke-virtual {v6}, Landroid/graphics/RectF;->width()F
/* div-float/2addr v4, v2 */
v2 = this.d;
(( android.graphics.Canvas ) p1 ).drawCircle ( v1, v3, v4, v2 ); // invoke-virtual {p1, v1, v3, v4, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
/* neg-float v0, v0 */
/* .line 18 */
(( android.graphics.RectF ) v6 ).inset ( v0, v0 ); // invoke-virtual {v6, v0, v0}, Landroid/graphics/RectF;->inset(FF)V
int v4 = 0; // const/4 v4, 0x0
/* .line 19 */
v5 = this.b;
/* move-object v0, p1 */
/* move-object v1, v6 */
/* move v2, p2 */
/* move v3, v7 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V */
/* .line 20 */
(( c.t.a.e ) p0 ).a ( p1, p2, v7, v6 ); // invoke-virtual {p0, p1, p2, v7, v6}, Lc/t/a/e;->a(Landroid/graphics/Canvas;FFLandroid/graphics/RectF;)V
return;
} // .end method
public void a ( android.graphics.ColorFilter p0 ) {
/* .locals 1 */
/* .line 45 */
v0 = this.b;
(( android.graphics.Paint ) v0 ).setColorFilter ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 48 */
/* iget-boolean v0, p0, Lc/t/a/e;->n:Z */
/* if-eq v0, p1, :cond_0 */
/* .line 49 */
/* iput-boolean p1, p0, Lc/t/a/e;->n:Z */
} // :cond_0
return;
} // .end method
public void a ( Integer[] p0 ) {
/* .locals 0 */
/* .line 43 */
this.i = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 44 */
(( c.t.a.e ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/t/a/e;->c(I)V
return;
} // .end method
public Float b ( ) {
/* .locals 1 */
/* .line 2 */
/* iget v0, p0, Lc/t/a/e;->f:F */
} // .end method
public void b ( Float p0 ) {
/* .locals 0 */
/* .line 3 */
/* iput p1, p0, Lc/t/a/e;->q:F */
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/t/a/e;->u:I */
return;
} // .end method
public Integer c ( ) {
/* .locals 2 */
/* .line 3 */
v0 = this.i;
v1 = (( c.t.a.e ) p0 ).d ( ); // invoke-virtual {p0}, Lc/t/a/e;->d()I
/* aget v0, v0, v1 */
} // .end method
public void c ( Float p0 ) {
/* .locals 0 */
/* .line 4 */
/* iput p1, p0, Lc/t/a/e;->f:F */
return;
} // .end method
public void c ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lc/t/a/e;->j:I */
/* .line 2 */
v0 = this.i;
/* aget p1, v0, p1 */
/* iput p1, p0, Lc/t/a/e;->u:I */
return;
} // .end method
public Integer d ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/t/a/e;->j:I */
/* add-int/lit8 v0, v0, 0x1 */
v1 = this.i;
/* array-length v1, v1 */
/* rem-int/2addr v0, v1 */
} // .end method
public void d ( Float p0 ) {
/* .locals 0 */
/* .line 2 */
/* iput p1, p0, Lc/t/a/e;->g:F */
return;
} // .end method
public Float e ( ) {
/* .locals 1 */
/* .line 2 */
/* iget v0, p0, Lc/t/a/e;->e:F */
} // .end method
public void e ( Float p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/t/a/e;->e:F */
return;
} // .end method
public Integer f ( ) {
/* .locals 2 */
/* .line 3 */
v0 = this.i;
/* iget v1, p0, Lc/t/a/e;->j:I */
/* aget v0, v0, v1 */
} // .end method
public void f ( Float p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lc/t/a/e;->h:F */
/* .line 2 */
v0 = this.b;
(( android.graphics.Paint ) v0 ).setStrokeWidth ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
return;
} // .end method
public Float g ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/t/a/e;->l:F */
} // .end method
public Float h ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/t/a/e;->m:F */
} // .end method
public Float i ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/t/a/e;->k:F */
} // .end method
public void j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( c.t.a.e ) p0 ).d ( ); // invoke-virtual {p0}, Lc/t/a/e;->d()I
(( c.t.a.e ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lc/t/a/e;->c(I)V
return;
} // .end method
public void k ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Lc/t/a/e;->k:F */
/* .line 2 */
/* iput v0, p0, Lc/t/a/e;->l:F */
/* .line 3 */
/* iput v0, p0, Lc/t/a/e;->m:F */
/* .line 4 */
(( c.t.a.e ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Lc/t/a/e;->e(F)V
/* .line 5 */
(( c.t.a.e ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lc/t/a/e;->c(F)V
/* .line 6 */
(( c.t.a.e ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lc/t/a/e;->d(F)V
return;
} // .end method
public void l ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/t/a/e;->e:F */
/* iput v0, p0, Lc/t/a/e;->k:F */
/* .line 2 */
/* iget v0, p0, Lc/t/a/e;->f:F */
/* iput v0, p0, Lc/t/a/e;->l:F */
/* .line 3 */
/* iget v0, p0, Lc/t/a/e;->g:F */
/* iput v0, p0, Lc/t/a/e;->m:F */
return;
} // .end method
