public class j.a.a.a.n extends android.view.View implements j.a.a.a.k {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final p;
	 /* # instance fields */
	 public android.graphics.Rect b;
	 public Integer c;
	 public final Integer d;
	 public final Integer e;
	 public final Integer f;
	 public final Integer g;
	 public final Integer h;
	 public android.graphics.Paint i;
	 public android.graphics.Paint j;
	 public android.graphics.Paint k;
	 public Integer l;
	 public Boolean m;
	 public Boolean n;
	 public Integer o;
	 /* # direct methods */
	 public static j.a.a.a.n ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x8 */
		 /* new-array v0, v0, [I */
		 /* .line 1 */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x0 */
		 /* 0x40 */
		 /* 0x80 */
		 /* 0xc0 */
		 /* 0xff */
		 /* 0xc0 */
		 /* 0x80 */
		 /* 0x40 */
	 } // .end array-data
} // .end method
public j.a.a.a.n ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
	 /* .line 2 */
	 (( android.view.View ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
	 p1 = 	 (( android.content.res.Resources ) p1 ).getColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I
	 /* iput p1, p0, Lj/a/a/a/n;->d:I */
	 /* .line 3 */
	 (( android.view.View ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
	 p1 = 	 (( android.content.res.Resources ) p1 ).getColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I
	 /* iput p1, p0, Lj/a/a/a/n;->e:I */
	 /* .line 4 */
	 (( android.view.View ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
	 p1 = 	 (( android.content.res.Resources ) p1 ).getColor ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I
	 /* iput p1, p0, Lj/a/a/a/n;->f:I */
	 /* .line 5 */
	 (( android.view.View ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
	 p1 = 	 (( android.content.res.Resources ) p1 ).getInteger ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I
	 /* iput p1, p0, Lj/a/a/a/n;->g:I */
	 /* .line 6 */
	 (( android.view.View ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;
	 p1 = 	 (( android.content.res.Resources ) p1 ).getInteger ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I
	 /* iput p1, p0, Lj/a/a/a/n;->h:I */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 7 */
	 /* iput p1, p0, Lj/a/a/a/n;->o:I */
	 /* .line 8 */
	 (( j.a.a.a.n ) p0 ).b ( ); // invoke-virtual {p0}, Lj/a/a/a/n;->b()V
	 return;
} // .end method
/* # virtual methods */
public void a ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 (( j.a.a.a.n ) p0 ).c ( ); // invoke-virtual {p0}, Lj/a/a/a/n;->c()V
	 /* .line 2 */
	 (( android.view.View ) p0 ).invalidate ( ); // invoke-virtual {p0}, Landroid/view/View;->invalidate()V
	 return;
} // .end method
public void a ( android.graphics.Canvas p0 ) {
	 /* .locals 9 */
	 /* .line 3 */
	 (( j.a.a.a.n ) p0 ).getFramingRect ( ); // invoke-virtual {p0}, Lj/a/a/a/n;->getFramingRect()Landroid/graphics/Rect;
	 /* .line 4 */
	 v1 = this.i;
	 v2 = j.a.a.a.n.p;
	 /* iget v3, p0, Lj/a/a/a/n;->c:I */
	 /* aget v2, v2, v3 */
	 (( android.graphics.Paint ) v1 ).setAlpha ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V
	 /* .line 5 */
	 /* iget v1, p0, Lj/a/a/a/n;->c:I */
	 /* add-int/lit8 v1, v1, 0x1 */
	 v2 = j.a.a.a.n.p;
	 /* array-length v2, v2 */
	 /* rem-int/2addr v1, v2 */
	 /* iput v1, p0, Lj/a/a/a/n;->c:I */
	 /* .line 6 */
	 v1 = 	 (( android.graphics.Rect ) v0 ).height ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->height()I
	 /* div-int/lit8 v1, v1, 0x2 */
	 /* iget v2, v0, Landroid/graphics/Rect;->top:I */
	 /* add-int/2addr v1, v2 */
	 /* .line 7 */
	 /* iget v2, v0, Landroid/graphics/Rect;->left:I */
	 /* add-int/lit8 v2, v2, 0x2 */
	 /* int-to-float v4, v2 */
	 /* add-int/lit8 v2, v1, -0x1 */
	 /* int-to-float v5, v2 */
	 /* iget v2, v0, Landroid/graphics/Rect;->right:I */
	 /* add-int/lit8 v2, v2, -0x1 */
	 /* int-to-float v6, v2 */
	 /* add-int/lit8 v1, v1, 0x2 */
	 /* int-to-float v7, v1 */
	 v8 = this.i;
	 /* move-object v3, p1 */
	 /* invoke-virtual/range {v3 ..v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
	 /* .line 8 */
	 /* iget p1, v0, Landroid/graphics/Rect;->left:I */
	 /* add-int/lit8 v4, p1, -0xa */
	 /* iget p1, v0, Landroid/graphics/Rect;->top:I */
	 /* add-int/lit8 v5, p1, -0xa */
	 /* iget p1, v0, Landroid/graphics/Rect;->right:I */
	 /* add-int/lit8 v6, p1, 0xa */
	 /* iget p1, v0, Landroid/graphics/Rect;->bottom:I */
	 /* add-int/lit8 v7, p1, 0xa */
	 /* const-wide/16 v2, 0x50 */
	 /* move-object v1, p0 */
	 /* invoke-virtual/range {v1 ..v7}, Landroid/view/View;->postInvalidateDelayed(JIIII)V */
	 return;
} // .end method
public final void b ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.i = v0;
	 /* .line 2 */
	 /* iget v1, p0, Lj/a/a/a/n;->d:I */
	 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
	 /* .line 3 */
	 v0 = this.i;
	 v1 = android.graphics.Paint$Style.FILL;
	 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
	 /* .line 4 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.j = v0;
	 /* .line 5 */
	 /* iget v1, p0, Lj/a/a/a/n;->e:I */
	 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
	 /* .line 6 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.k = v0;
	 /* .line 7 */
	 /* iget v1, p0, Lj/a/a/a/n;->f:I */
	 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
	 /* .line 8 */
	 v0 = this.k;
	 v1 = android.graphics.Paint$Style.STROKE;
	 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
	 /* .line 9 */
	 v0 = this.k;
	 /* iget v1, p0, Lj/a/a/a/n;->g:I */
	 /* int-to-float v1, v1 */
	 (( android.graphics.Paint ) v0 ).setStrokeWidth ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
	 /* .line 10 */
	 v0 = this.k;
	 int v1 = 1; // const/4 v1, 0x1
	 (( android.graphics.Paint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
	 /* .line 11 */
	 /* iget v0, p0, Lj/a/a/a/n;->h:I */
	 /* iput v0, p0, Lj/a/a/a/n;->l:I */
	 return;
} // .end method
public void b ( android.graphics.Canvas p0 ) {
	 /* .locals 5 */
	 /* .line 12 */
	 (( j.a.a.a.n ) p0 ).getFramingRect ( ); // invoke-virtual {p0}, Lj/a/a/a/n;->getFramingRect()Landroid/graphics/Rect;
	 /* .line 13 */
	 /* new-instance v1, Landroid/graphics/Path; */
	 /* invoke-direct {v1}, Landroid/graphics/Path;-><init>()V */
	 /* .line 14 */
	 /* iget v2, v0, Landroid/graphics/Rect;->left:I */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->top:I */
	 /* iget v4, p0, Lj/a/a/a/n;->l:I */
	 /* add-int/2addr v3, v4 */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).moveTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V
	 /* .line 15 */
	 /* iget v2, v0, Landroid/graphics/Rect;->left:I */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->top:I */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).lineTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 16 */
	 /* iget v2, v0, Landroid/graphics/Rect;->left:I */
	 /* iget v3, p0, Lj/a/a/a/n;->l:I */
	 /* add-int/2addr v2, v3 */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->top:I */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).lineTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 17 */
	 v2 = this.k;
	 (( android.graphics.Canvas ) p1 ).drawPath ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
	 /* .line 18 */
	 /* iget v2, v0, Landroid/graphics/Rect;->right:I */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->top:I */
	 /* iget v4, p0, Lj/a/a/a/n;->l:I */
	 /* add-int/2addr v3, v4 */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).moveTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V
	 /* .line 19 */
	 /* iget v2, v0, Landroid/graphics/Rect;->right:I */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->top:I */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).lineTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 20 */
	 /* iget v2, v0, Landroid/graphics/Rect;->right:I */
	 /* iget v3, p0, Lj/a/a/a/n;->l:I */
	 /* sub-int/2addr v2, v3 */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->top:I */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).lineTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 21 */
	 v2 = this.k;
	 (( android.graphics.Canvas ) p1 ).drawPath ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
	 /* .line 22 */
	 /* iget v2, v0, Landroid/graphics/Rect;->right:I */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->bottom:I */
	 /* iget v4, p0, Lj/a/a/a/n;->l:I */
	 /* sub-int/2addr v3, v4 */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).moveTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V
	 /* .line 23 */
	 /* iget v2, v0, Landroid/graphics/Rect;->right:I */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->bottom:I */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).lineTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 24 */
	 /* iget v2, v0, Landroid/graphics/Rect;->right:I */
	 /* iget v3, p0, Lj/a/a/a/n;->l:I */
	 /* sub-int/2addr v2, v3 */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->bottom:I */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).lineTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 25 */
	 v2 = this.k;
	 (( android.graphics.Canvas ) p1 ).drawPath ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
	 /* .line 26 */
	 /* iget v2, v0, Landroid/graphics/Rect;->left:I */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->bottom:I */
	 /* iget v4, p0, Lj/a/a/a/n;->l:I */
	 /* sub-int/2addr v3, v4 */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).moveTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V
	 /* .line 27 */
	 /* iget v2, v0, Landroid/graphics/Rect;->left:I */
	 /* int-to-float v2, v2 */
	 /* iget v3, v0, Landroid/graphics/Rect;->bottom:I */
	 /* int-to-float v3, v3 */
	 (( android.graphics.Path ) v1 ).lineTo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 28 */
	 /* iget v2, v0, Landroid/graphics/Rect;->left:I */
	 /* iget v3, p0, Lj/a/a/a/n;->l:I */
	 /* add-int/2addr v2, v3 */
	 /* int-to-float v2, v2 */
	 /* iget v0, v0, Landroid/graphics/Rect;->bottom:I */
	 /* int-to-float v0, v0 */
	 (( android.graphics.Path ) v1 ).lineTo ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V
	 /* .line 29 */
	 v0 = this.k;
	 (( android.graphics.Canvas ) p1 ).drawPath ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
	 return;
} // .end method
public synchronized void c ( ) {
	 /* .locals 8 */
	 /* monitor-enter p0 */
	 /* .line 8 */
	 try { // :try_start_0
		 /* new-instance v0, Landroid/graphics/Point; */
		 v1 = 		 (( android.view.View ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getWidth()I
		 v2 = 		 (( android.view.View ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getHeight()I
		 /* invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V */
		 /* .line 9 */
		 (( android.view.View ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;
		 v1 = 		 j.a.a.a.j .a ( v1 );
		 /* .line 10 */
		 /* iget-boolean v2, p0, Lj/a/a/a/n;->m:Z */
		 int v3 = 1; // const/4 v3, 0x1
		 /* const/high16 v4, 0x3f200000 # 0.625f */
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* if-eq v1, v3, :cond_0 */
			 /* .line 11 */
			 v1 = 			 (( android.view.View ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getHeight()I
			 /* .line 12 */
		 } // :cond_0
		 v1 = 		 (( android.view.View ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getWidth()I
	 } // :goto_0
	 /* int-to-float v1, v1 */
	 /* mul-float v1, v1, v4 */
	 /* float-to-int v1, v1 */
	 /* move v2, v1 */
} // :cond_1
/* if-eq v1, v3, :cond_2 */
/* .line 13 */
v1 = (( android.view.View ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getHeight()I
/* int-to-float v1, v1 */
/* mul-float v1, v1, v4 */
/* float-to-int v1, v1 */
/* const v2, 0x3fb33333 # 1.4f */
/* int-to-float v3, v1 */
/* mul-float v3, v3, v2 */
/* float-to-int v2, v3 */
/* move v7, v2 */
/* move v2, v1 */
/* move v1, v7 */
/* .line 14 */
} // :cond_2
v1 = (( android.view.View ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getWidth()I
/* int-to-float v1, v1 */
/* const/high16 v2, 0x3f400000 # 0.75f */
/* mul-float v1, v1, v2 */
/* float-to-int v1, v1 */
/* int-to-float v3, v1 */
/* mul-float v3, v3, v2 */
/* float-to-int v2, v3 */
/* .line 15 */
} // :goto_1
v3 = (( android.view.View ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getWidth()I
/* if-le v1, v3, :cond_3 */
/* .line 16 */
v1 = (( android.view.View ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getWidth()I
/* add-int/lit8 v1, v1, -0x32 */
/* .line 17 */
} // :cond_3
v3 = (( android.view.View ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getHeight()I
/* if-le v2, v3, :cond_4 */
/* .line 18 */
v2 = (( android.view.View ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getHeight()I
/* add-int/lit8 v2, v2, -0x32 */
/* .line 19 */
} // :cond_4
/* iget v3, v0, Landroid/graphics/Point;->x:I */
/* sub-int/2addr v3, v1 */
/* div-int/lit8 v3, v3, 0x2 */
/* .line 20 */
/* iget v0, v0, Landroid/graphics/Point;->y:I */
/* sub-int/2addr v0, v2 */
/* div-int/lit8 v0, v0, 0x2 */
/* .line 21 */
/* new-instance v4, Landroid/graphics/Rect; */
/* iget v5, p0, Lj/a/a/a/n;->o:I */
/* add-int/2addr v5, v3 */
/* iget v6, p0, Lj/a/a/a/n;->o:I */
/* add-int/2addr v6, v0 */
/* add-int/2addr v3, v1 */
/* iget v1, p0, Lj/a/a/a/n;->o:I */
/* sub-int/2addr v3, v1 */
/* add-int/2addr v0, v2 */
/* iget v1, p0, Lj/a/a/a/n;->o:I */
/* sub-int/2addr v0, v1 */
/* invoke-direct {v4, v5, v6, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V */
this.b = v4;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 22 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void c ( android.graphics.Canvas p0 ) {
/* .locals 10 */
/* .line 1 */
v0 = (( android.graphics.Canvas ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I
/* .line 2 */
v1 = (( android.graphics.Canvas ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I
/* .line 3 */
(( j.a.a.a.n ) p0 ).getFramingRect ( ); // invoke-virtual {p0}, Lj/a/a/a/n;->getFramingRect()Landroid/graphics/Rect;
/* int-to-float v0, v0 */
/* .line 4 */
/* iget v3, v2, Landroid/graphics/Rect;->top:I */
/* int-to-float v7, v3 */
v8 = this.j;
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* move-object v3, p1 */
/* move v6, v0 */
/* invoke-virtual/range {v3 ..v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 5 */
/* iget v3, v2, Landroid/graphics/Rect;->top:I */
/* int-to-float v6, v3 */
/* iget v3, v2, Landroid/graphics/Rect;->left:I */
/* int-to-float v7, v3 */
/* iget v3, v2, Landroid/graphics/Rect;->bottom:I */
/* add-int/lit8 v3, v3, 0x1 */
/* int-to-float v8, v3 */
v9 = this.j;
/* move-object v4, p1 */
/* invoke-virtual/range {v4 ..v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 6 */
/* iget v3, v2, Landroid/graphics/Rect;->right:I */
/* add-int/lit8 v3, v3, 0x1 */
/* int-to-float v4, v3 */
/* iget v3, v2, Landroid/graphics/Rect;->top:I */
/* int-to-float v5, v3 */
/* iget v3, v2, Landroid/graphics/Rect;->bottom:I */
/* add-int/lit8 v3, v3, 0x1 */
/* int-to-float v7, v3 */
v8 = this.j;
/* move-object v3, p1 */
/* move v6, v0 */
/* invoke-virtual/range {v3 ..v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 7 */
/* iget v2, v2, Landroid/graphics/Rect;->bottom:I */
/* add-int/lit8 v2, v2, 0x1 */
/* int-to-float v5, v2 */
/* int-to-float v7, v1 */
v8 = this.j;
int v4 = 0; // const/4 v4, 0x0
/* invoke-virtual/range {v3 ..v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
return;
} // .end method
public android.graphics.Rect getFramingRect ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 1 */
/* .line 1 */
(( j.a.a.a.n ) p0 ).getFramingRect ( ); // invoke-virtual {p0}, Lj/a/a/a/n;->getFramingRect()Landroid/graphics/Rect;
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
(( j.a.a.a.n ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lj/a/a/a/n;->c(Landroid/graphics/Canvas;)V
/* .line 3 */
(( j.a.a.a.n ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lj/a/a/a/n;->b(Landroid/graphics/Canvas;)V
/* .line 4 */
/* iget-boolean v0, p0, Lj/a/a/a/n;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
(( j.a.a.a.n ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lj/a/a/a/n;->a(Landroid/graphics/Canvas;)V
} // :cond_1
return;
} // .end method
public void onSizeChanged ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 1 */
(( j.a.a.a.n ) p0 ).c ( ); // invoke-virtual {p0}, Lj/a/a/a/n;->c()V
return;
} // .end method
public void setBorderAlpha ( Float p0 ) {
/* .locals 1 */
/* const/high16 v0, 0x437f0000 # 255.0f */
/* mul-float p1, p1, v0 */
/* float-to-int p1, p1 */
/* .line 1 */
v0 = this.k;
(( android.graphics.Paint ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V
return;
} // .end method
public void setBorderColor ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
(( android.graphics.Paint ) v0 ).setColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
return;
} // .end method
public void setBorderCornerRadius ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.k;
/* new-instance v1, Landroid/graphics/CornerPathEffect; */
/* int-to-float p1, p1 */
/* invoke-direct {v1, p1}, Landroid/graphics/CornerPathEffect;-><init>(F)V */
(( android.graphics.Paint ) v0 ).setPathEffect ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;
return;
} // .end method
public void setBorderCornerRounded ( Boolean p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
p1 = this.k;
v0 = android.graphics.Paint$Join.ROUND;
(( android.graphics.Paint ) p1 ).setStrokeJoin ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V
/* .line 2 */
} // :cond_0
p1 = this.k;
v0 = android.graphics.Paint$Join.BEVEL;
(( android.graphics.Paint ) p1 ).setStrokeJoin ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V
} // :goto_0
return;
} // .end method
public void setBorderLineLength ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/n;->l:I */
return;
} // .end method
public void setBorderStrokeWidth ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
/* int-to-float p1, p1 */
(( android.graphics.Paint ) v0 ).setStrokeWidth ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
return;
} // .end method
public void setLaserColor ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
(( android.graphics.Paint ) v0 ).setColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
return;
} // .end method
public void setLaserEnabled ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/n;->n:Z */
return;
} // .end method
public void setMaskColor ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( android.graphics.Paint ) v0 ).setColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
return;
} // .end method
public void setSquareViewFinder ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lj/a/a/a/n;->m:Z */
return;
} // .end method
public void setViewFinderOffset ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lj/a/a/a/n;->o:I */
return;
} // .end method
