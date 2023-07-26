public class c.d.f.j extends android.graphics.drawable.Drawable {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Double q;
	 public static c.d.f.i r;
	 /* # instance fields */
	 public final Integer a;
	 public android.graphics.Paint b;
	 public android.graphics.Paint c;
	 public android.graphics.Paint d;
	 public final android.graphics.RectF e;
	 public Float f;
	 public android.graphics.Path g;
	 public Float h;
	 public Float i;
	 public Float j;
	 public android.content.res.ColorStateList k;
	 public Boolean l;
	 public final Integer m;
	 public final Integer n;
	 public Boolean o;
	 public Boolean p;
	 /* # direct methods */
	 public static c.d.f.j ( ) {
		 /* .locals 2 */
		 /* const-wide v0, 0x4046800000000000L # 45.0 */
		 /* .line 1 */
		 java.lang.Math .toRadians ( v0,v1 );
		 /* move-result-wide v0 */
		 java.lang.Math .cos ( v0,v1 );
		 /* move-result-wide v0 */
		 /* sput-wide v0, Lc/d/f/j;->q:D */
		 return;
	 } // .end method
	 public c.d.f.j ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/d/f/j;->l:Z */
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lc/d/f/j;->o:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lc/d/f/j;->p:Z */
		 /* .line 5 */
		 v1 = 		 (( android.content.res.Resources ) p1 ).getColor ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I
		 /* iput v1, p0, Lc/d/f/j;->m:I */
		 /* .line 6 */
		 v1 = 		 (( android.content.res.Resources ) p1 ).getColor ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I
		 /* iput v1, p0, Lc/d/f/j;->n:I */
		 /* .line 7 */
		 p1 = 		 (( android.content.res.Resources ) p1 ).getDimensionPixelSize ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
		 /* iput p1, p0, Lc/d/f/j;->a:I */
		 /* .line 8 */
		 /* new-instance p1, Landroid/graphics/Paint; */
		 int v1 = 5; // const/4 v1, 0x5
		 /* invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V */
		 this.b = p1;
		 /* .line 9 */
		 (( c.d.f.j ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/d/f/j;->a(Landroid/content/res/ColorStateList;)V
		 /* .line 10 */
		 /* new-instance p1, Landroid/graphics/Paint; */
		 /* invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V */
		 this.c = p1;
		 /* .line 11 */
		 p2 = android.graphics.Paint$Style.FILL;
		 (( android.graphics.Paint ) p1 ).setStyle ( p2 ); // invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 /* const/high16 p1, 0x3f000000 # 0.5f */
		 /* add-float/2addr p3, p1 */
		 /* float-to-int p1, p3 */
		 /* int-to-float p1, p1 */
		 /* .line 12 */
		 /* iput p1, p0, Lc/d/f/j;->f:F */
		 /* .line 13 */
		 /* new-instance p1, Landroid/graphics/RectF; */
		 /* invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V */
		 this.e = p1;
		 /* .line 14 */
		 /* new-instance p1, Landroid/graphics/Paint; */
		 p2 = this.c;
		 /* invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V */
		 this.d = p1;
		 /* .line 15 */
		 (( android.graphics.Paint ) p1 ).setAntiAlias ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 16 */
		 (( c.d.f.j ) p0 ).a ( p4, p5 ); // invoke-virtual {p0, p4, p5}, Lc/d/f/j;->a(FF)V
		 return;
	 } // .end method
	 public static Float a ( Float p0, Float p1, Boolean p2 ) {
		 /* .locals 6 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* float-to-double v0, p0 */
			 /* const-wide/high16 v2, 0x3ff0000000000000L # 1.0 */
			 /* .line 17 */
			 /* sget-wide v4, Lc/d/f/j;->q:D */
			 /* sub-double/2addr v2, v4 */
			 /* float-to-double p0, p1 */
			 /* mul-double v2, v2, p0 */
			 /* add-double/2addr v0, v2 */
			 /* double-to-float p0, v0 */
		 } // :cond_0
	 } // .end method
	 public static Float b ( Float p0, Float p1, Boolean p2 ) {
		 /* .locals 6 */
		 /* const/high16 v0, 0x3fc00000 # 1.5f */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* mul-float p0, p0, v0 */
			 /* float-to-double v0, p0 */
			 /* const-wide/high16 v2, 0x3ff0000000000000L # 1.0 */
			 /* .line 1 */
			 /* sget-wide v4, Lc/d/f/j;->q:D */
			 /* sub-double/2addr v2, v4 */
			 /* float-to-double p0, p1 */
			 /* mul-double v2, v2, p0 */
			 /* add-double/2addr v0, v2 */
			 /* double-to-float p0, v0 */
		 } // :cond_0
		 /* mul-float p0, p0, v0 */
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 25 */
		 /* move-object/from16 v0, p0 */
		 /* .line 58 */
		 /* new-instance v1, Landroid/graphics/RectF; */
		 /* iget v2, v0, Lc/d/f/j;->f:F */
		 /* neg-float v3, v2 */
		 /* neg-float v4, v2 */
		 /* invoke-direct {v1, v3, v4, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V */
		 /* .line 59 */
		 /* new-instance v2, Landroid/graphics/RectF; */
		 /* invoke-direct {v2, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V */
		 /* .line 60 */
		 /* iget v3, v0, Lc/d/f/j;->i:F */
		 /* neg-float v4, v3 */
		 /* neg-float v3, v3 */
		 (( android.graphics.RectF ) v2 ).inset ( v4, v3 ); // invoke-virtual {v2, v4, v3}, Landroid/graphics/RectF;->inset(FF)V
		 /* .line 61 */
		 v3 = this.g;
		 /* if-nez v3, :cond_0 */
		 /* .line 62 */
		 /* new-instance v3, Landroid/graphics/Path; */
		 /* invoke-direct {v3}, Landroid/graphics/Path;-><init>()V */
		 this.g = v3;
		 /* .line 63 */
	 } // :cond_0
	 (( android.graphics.Path ) v3 ).reset ( ); // invoke-virtual {v3}, Landroid/graphics/Path;->reset()V
	 /* .line 64 */
} // :goto_0
v3 = this.g;
v4 = android.graphics.Path$FillType.EVEN_ODD;
(( android.graphics.Path ) v3 ).setFillType ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V
/* .line 65 */
v3 = this.g;
/* iget v4, v0, Lc/d/f/j;->f:F */
/* neg-float v4, v4 */
int v5 = 0; // const/4 v5, 0x0
(( android.graphics.Path ) v3 ).moveTo ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 66 */
v3 = this.g;
/* iget v4, v0, Lc/d/f/j;->i:F */
/* neg-float v4, v4 */
(( android.graphics.Path ) v3 ).rLineTo ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/graphics/Path;->rLineTo(FF)V
/* .line 67 */
v3 = this.g;
/* const/high16 v4, 0x43340000 # 180.0f */
/* const/high16 v6, 0x42b40000 # 90.0f */
int v7 = 0; // const/4 v7, 0x0
(( android.graphics.Path ) v3 ).arcTo ( v2, v4, v6, v7 ); // invoke-virtual {v3, v2, v4, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V
/* .line 68 */
v2 = this.g;
/* const/high16 v3, 0x43870000 # 270.0f */
/* const/high16 v4, -0x3d4c0000 # -90.0f */
(( android.graphics.Path ) v2 ).arcTo ( v1, v3, v4, v7 ); // invoke-virtual {v2, v1, v3, v4, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V
/* .line 69 */
v1 = this.g;
(( android.graphics.Path ) v1 ).close ( ); // invoke-virtual {v1}, Landroid/graphics/Path;->close()V
/* .line 70 */
/* iget v1, v0, Lc/d/f/j;->f:F */
/* iget v2, v0, Lc/d/f/j;->i:F */
/* add-float/2addr v2, v1 */
/* div-float/2addr v1, v2 */
/* .line 71 */
v2 = this.c;
/* new-instance v3, Landroid/graphics/RadialGradient; */
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
/* iget v4, v0, Lc/d/f/j;->f:F */
/* iget v6, v0, Lc/d/f/j;->i:F */
/* add-float v11, v4, v6 */
int v4 = 3; // const/4 v4, 0x3
/* new-array v12, v4, [I */
/* iget v6, v0, Lc/d/f/j;->m:I */
/* aput v6, v12, v7 */
int v15 = 1; // const/4 v15, 0x1
/* aput v6, v12, v15 */
/* iget v6, v0, Lc/d/f/j;->n:I */
/* const/16 v16, 0x2 */
/* aput v6, v12, v16 */
/* new-array v13, v4, [F */
/* aput v5, v13, v7 */
/* aput v1, v13, v15 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* aput v1, v13, v16 */
v14 = android.graphics.Shader$TileMode.CLAMP;
/* move-object v8, v3 */
/* invoke-direct/range {v8 ..v14}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V */
(( android.graphics.Paint ) v2 ).setShader ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
/* .line 72 */
v1 = this.d;
/* new-instance v2, Landroid/graphics/LinearGradient; */
/* const/16 v18, 0x0 */
/* iget v3, v0, Lc/d/f/j;->f:F */
/* neg-float v5, v3 */
/* iget v6, v0, Lc/d/f/j;->i:F */
/* add-float v19, v5, v6 */
/* const/16 v20, 0x0 */
/* neg-float v3, v3 */
/* sub-float v21, v3, v6 */
/* new-array v3, v4, [I */
/* iget v5, v0, Lc/d/f/j;->m:I */
/* aput v5, v3, v7 */
/* aput v5, v3, v15 */
/* iget v5, v0, Lc/d/f/j;->n:I */
/* aput v5, v3, v16 */
/* new-array v4, v4, [F */
/* fill-array-data v4, :array_0 */
v24 = android.graphics.Shader$TileMode.CLAMP;
/* move-object/from16 v17, v2 */
/* move-object/from16 v22, v3 */
/* move-object/from16 v23, v4 */
/* invoke-direct/range {v17 ..v24}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V */
(( android.graphics.Paint ) v1 ).setShader ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
/* .line 73 */
v1 = this.d;
(( android.graphics.Paint ) v1 ).setAntiAlias ( v7 ); // invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V
return;
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x3f000000 # 0.5f */
/* 0x3f800000 # 1.0f */
} // .end array-data
} // .end method
public void a ( Float p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* cmpg-float v0, p1, v0 */
/* if-ltz v0, :cond_1 */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* add-float/2addr p1, v0 */
/* float-to-int p1, p1 */
/* int-to-float p1, p1 */
/* .line 18 */
/* iget v0, p0, Lc/d/f/j;->f:F */
/* cmpl-float v0, v0, p1 */
/* if-nez v0, :cond_0 */
return;
/* .line 19 */
} // :cond_0
/* iput p1, p0, Lc/d/f/j;->f:F */
int p1 = 1; // const/4 p1, 0x1
/* .line 20 */
/* iput-boolean p1, p0, Lc/d/f/j;->l:Z */
/* .line 21 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
/* .line 22 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid radius "; // const-string v2, "Invalid radius "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String p1 = ".Must be >= 0"; // const-string p1, ".Must be >= 0"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final void a ( Float p0, Float p1 ) {
/* .locals 3 */
final String v0 = ".Must be >= 0"; // const-string v0, ".Must be >= 0"
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v2, p1, v1 */
/* if-ltz v2, :cond_4 */
/* cmpg-float v1, p2, v1 */
/* if-ltz v1, :cond_3 */
/* .line 5 */
p1 = (( c.d.f.j ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/d/f/j;->d(F)I
/* int-to-float p1, p1 */
/* .line 6 */
p2 = (( c.d.f.j ) p0 ).d ( p2 ); // invoke-virtual {p0, p2}, Lc/d/f/j;->d(F)I
/* int-to-float p2, p2 */
int v0 = 1; // const/4 v0, 0x1
/* cmpl-float v1, p1, p2 */
/* if-lez v1, :cond_1 */
/* .line 7 */
/* iget-boolean p1, p0, Lc/d/f/j;->p:Z */
/* if-nez p1, :cond_0 */
/* .line 8 */
/* iput-boolean v0, p0, Lc/d/f/j;->p:Z */
} // :cond_0
/* move p1, p2 */
/* .line 9 */
} // :cond_1
/* iget v1, p0, Lc/d/f/j;->j:F */
/* cmpl-float v1, v1, p1 */
/* if-nez v1, :cond_2 */
/* iget v1, p0, Lc/d/f/j;->h:F */
/* cmpl-float v1, v1, p2 */
/* if-nez v1, :cond_2 */
return;
/* .line 10 */
} // :cond_2
/* iput p1, p0, Lc/d/f/j;->j:F */
/* .line 11 */
/* iput p2, p0, Lc/d/f/j;->h:F */
/* const/high16 p2, 0x3fc00000 # 1.5f */
/* mul-float p1, p1, p2 */
/* .line 12 */
/* iget p2, p0, Lc/d/f/j;->a:I */
/* int-to-float p2, p2 */
/* add-float/2addr p1, p2 */
/* const/high16 p2, 0x3f000000 # 0.5f */
/* add-float/2addr p1, p2 */
/* float-to-int p1, p1 */
/* int-to-float p1, p1 */
/* iput p1, p0, Lc/d/f/j;->i:F */
/* .line 13 */
/* iput-boolean v0, p0, Lc/d/f/j;->l:Z */
/* .line 14 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
/* .line 15 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid max shadow size "; // const-string v2, "Invalid max shadow size "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 16 */
} // :cond_4
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid shadow size "; // const-string v2, "Invalid shadow size "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public final void a ( android.content.res.ColorStateList p0 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
android.content.res.ColorStateList .valueOf ( p1 );
} // :cond_0
this.k = p1;
/* .line 2 */
v0 = this.b;
(( android.graphics.drawable.Drawable ) p0 ).getState ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I
v2 = this.k;
v2 = (( android.content.res.ColorStateList ) v2 ).getDefaultColor ( ); // invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I
p1 = (( android.content.res.ColorStateList ) p1 ).getColorForState ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I
(( android.graphics.Paint ) v0 ).setColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
return;
} // .end method
public final void a ( android.graphics.Canvas p0 ) {
/* .locals 12 */
/* .line 23 */
/* iget v0, p0, Lc/d/f/j;->f:F */
/* neg-float v1, v0 */
/* iget v2, p0, Lc/d/f/j;->i:F */
/* sub-float/2addr v1, v2 */
/* .line 24 */
/* iget v2, p0, Lc/d/f/j;->a:I */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lc/d/f/j;->j:F */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
/* add-float/2addr v0, v2 */
/* .line 25 */
v2 = this.e;
v2 = (( android.graphics.RectF ) v2 ).width ( ); // invoke-virtual {v2}, Landroid/graphics/RectF;->width()F
/* mul-float v9, v0, v3 */
/* sub-float/2addr v2, v9 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* cmpl-float v2, v2, v5 */
/* if-lez v2, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 26 */
} // :goto_0
v6 = this.e;
v6 = (( android.graphics.RectF ) v6 ).height ( ); // invoke-virtual {v6}, Landroid/graphics/RectF;->height()F
/* sub-float/2addr v6, v9 */
/* cmpl-float v5, v6, v5 */
/* if-lez v5, :cond_1 */
int v10 = 1; // const/4 v10, 0x1
} // :cond_1
int v10 = 0; // const/4 v10, 0x0
/* .line 27 */
} // :goto_1
v11 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 28 */
v3 = this.e;
/* iget v4, v3, Landroid/graphics/RectF;->left:F */
/* add-float/2addr v4, v0 */
/* iget v3, v3, Landroid/graphics/RectF;->top:F */
/* add-float/2addr v3, v0 */
(( android.graphics.Canvas ) p1 ).translate ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 29 */
v3 = this.g;
v4 = this.c;
(( android.graphics.Canvas ) p1 ).drawPath ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
if ( v2 != null) { // if-eqz v2, :cond_2
int v4 = 0; // const/4 v4, 0x0
/* .line 30 */
v3 = this.e;
/* .line 31 */
v3 = (( android.graphics.RectF ) v3 ).width ( ); // invoke-virtual {v3}, Landroid/graphics/RectF;->width()F
/* sub-float v6, v3, v9 */
/* iget v3, p0, Lc/d/f/j;->f:F */
/* neg-float v7, v3 */
v8 = this.d;
/* move-object v3, p1 */
/* move v5, v1 */
/* .line 32 */
/* invoke-virtual/range {v3 ..v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 33 */
} // :cond_2
(( android.graphics.Canvas ) p1 ).restoreToCount ( v11 ); // invoke-virtual {p1, v11}, Landroid/graphics/Canvas;->restoreToCount(I)V
/* .line 34 */
v11 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 35 */
v3 = this.e;
/* iget v4, v3, Landroid/graphics/RectF;->right:F */
/* sub-float/2addr v4, v0 */
/* iget v3, v3, Landroid/graphics/RectF;->bottom:F */
/* sub-float/2addr v3, v0 */
(( android.graphics.Canvas ) p1 ).translate ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V
/* const/high16 v3, 0x43340000 # 180.0f */
/* .line 36 */
(( android.graphics.Canvas ) p1 ).rotate ( v3 ); // invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V
/* .line 37 */
v3 = this.g;
v4 = this.c;
(( android.graphics.Canvas ) p1 ).drawPath ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
if ( v2 != null) { // if-eqz v2, :cond_3
int v4 = 0; // const/4 v4, 0x0
/* .line 38 */
v2 = this.e;
/* .line 39 */
v2 = (( android.graphics.RectF ) v2 ).width ( ); // invoke-virtual {v2}, Landroid/graphics/RectF;->width()F
/* sub-float v6, v2, v9 */
/* iget v2, p0, Lc/d/f/j;->f:F */
/* neg-float v2, v2 */
/* iget v3, p0, Lc/d/f/j;->i:F */
/* add-float v7, v2, v3 */
v8 = this.d;
/* move-object v3, p1 */
/* move v5, v1 */
/* .line 40 */
/* invoke-virtual/range {v3 ..v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 41 */
} // :cond_3
(( android.graphics.Canvas ) p1 ).restoreToCount ( v11 ); // invoke-virtual {p1, v11}, Landroid/graphics/Canvas;->restoreToCount(I)V
/* .line 42 */
v2 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 43 */
v3 = this.e;
/* iget v4, v3, Landroid/graphics/RectF;->left:F */
/* add-float/2addr v4, v0 */
/* iget v3, v3, Landroid/graphics/RectF;->bottom:F */
/* sub-float/2addr v3, v0 */
(( android.graphics.Canvas ) p1 ).translate ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V
/* const/high16 v3, 0x43870000 # 270.0f */
/* .line 44 */
(( android.graphics.Canvas ) p1 ).rotate ( v3 ); // invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V
/* .line 45 */
v3 = this.g;
v4 = this.c;
(( android.graphics.Canvas ) p1 ).drawPath ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
if ( v10 != null) { // if-eqz v10, :cond_4
int v4 = 0; // const/4 v4, 0x0
/* .line 46 */
v3 = this.e;
/* .line 47 */
v3 = (( android.graphics.RectF ) v3 ).height ( ); // invoke-virtual {v3}, Landroid/graphics/RectF;->height()F
/* sub-float v6, v3, v9 */
/* iget v3, p0, Lc/d/f/j;->f:F */
/* neg-float v7, v3 */
v8 = this.d;
/* move-object v3, p1 */
/* move v5, v1 */
/* .line 48 */
/* invoke-virtual/range {v3 ..v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 49 */
} // :cond_4
(( android.graphics.Canvas ) p1 ).restoreToCount ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V
/* .line 50 */
v2 = (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 51 */
v3 = this.e;
/* iget v4, v3, Landroid/graphics/RectF;->right:F */
/* sub-float/2addr v4, v0 */
/* iget v3, v3, Landroid/graphics/RectF;->top:F */
/* add-float/2addr v3, v0 */
(( android.graphics.Canvas ) p1 ).translate ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V
/* const/high16 v0, 0x42b40000 # 90.0f */
/* .line 52 */
(( android.graphics.Canvas ) p1 ).rotate ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V
/* .line 53 */
v0 = this.g;
v3 = this.c;
(( android.graphics.Canvas ) p1 ).drawPath ( v0, v3 ); // invoke-virtual {p1, v0, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
if ( v10 != null) { // if-eqz v10, :cond_5
int v4 = 0; // const/4 v4, 0x0
/* .line 54 */
v0 = this.e;
/* .line 55 */
v0 = (( android.graphics.RectF ) v0 ).height ( ); // invoke-virtual {v0}, Landroid/graphics/RectF;->height()F
/* sub-float v6, v0, v9 */
/* iget v0, p0, Lc/d/f/j;->f:F */
/* neg-float v7, v0 */
v8 = this.d;
/* move-object v3, p1 */
/* move v5, v1 */
/* .line 56 */
/* invoke-virtual/range {v3 ..v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 57 */
} // :cond_5
(( android.graphics.Canvas ) p1 ).restoreToCount ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V
return;
} // .end method
public final void a ( android.graphics.Rect p0 ) {
/* .locals 6 */
/* .line 74 */
/* iget v0, p0, Lc/d/f/j;->h:F */
/* const/high16 v1, 0x3fc00000 # 1.5f */
/* mul-float v1, v1, v0 */
/* .line 75 */
v2 = this.e;
/* iget v3, p1, Landroid/graphics/Rect;->left:I */
/* int-to-float v3, v3 */
/* add-float/2addr v3, v0 */
/* iget v4, p1, Landroid/graphics/Rect;->top:I */
/* int-to-float v4, v4 */
/* add-float/2addr v4, v1 */
/* iget v5, p1, Landroid/graphics/Rect;->right:I */
/* int-to-float v5, v5 */
/* sub-float/2addr v5, v0 */
/* iget p1, p1, Landroid/graphics/Rect;->bottom:I */
/* int-to-float p1, p1 */
/* sub-float/2addr p1, v1 */
(( android.graphics.RectF ) v2 ).set ( v3, v4, v5, p1 ); // invoke-virtual {v2, v3, v4, v5, p1}, Landroid/graphics/RectF;->set(FFFF)V
/* .line 76 */
(( c.d.f.j ) p0 ).a ( ); // invoke-virtual {p0}, Lc/d/f/j;->a()V
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .line 3 */
/* iput-boolean p1, p0, Lc/d/f/j;->o:Z */
/* .line 4 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public android.content.res.ColorStateList b ( ) {
/* .locals 1 */
/* .line 6 */
v0 = this.k;
} // .end method
public void b ( Float p0 ) {
/* .locals 1 */
/* .line 3 */
/* iget v0, p0, Lc/d/f/j;->j:F */
(( c.d.f.j ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/d/f/j;->a(FF)V
return;
} // .end method
public void b ( android.content.res.ColorStateList p0 ) {
/* .locals 0 */
/* .line 4 */
(( c.d.f.j ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/d/f/j;->a(Landroid/content/res/ColorStateList;)V
/* .line 5 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
return;
} // .end method
public void b ( android.graphics.Rect p0 ) {
/* .locals 0 */
/* .line 2 */
(( c.d.f.j ) p0 ).getPadding ( p1 ); // invoke-virtual {p0, p1}, Lc/d/f/j;->getPadding(Landroid/graphics/Rect;)Z
return;
} // .end method
public Float c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/d/f/j;->f:F */
} // .end method
public void c ( Float p0 ) {
/* .locals 1 */
/* .line 2 */
/* iget v0, p0, Lc/d/f/j;->h:F */
(( c.d.f.j ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/d/f/j;->a(FF)V
return;
} // .end method
public Float d ( ) {
/* .locals 1 */
/* .line 2 */
/* iget v0, p0, Lc/d/f/j;->h:F */
} // .end method
public final Integer d ( Float p0 ) {
/* .locals 2 */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* add-float/2addr p1, v0 */
/* float-to-int p1, p1 */
/* .line 1 */
/* rem-int/lit8 v0, p1, 0x2 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* sub-int/2addr p1, v1 */
} // :cond_0
} // .end method
public void draw ( android.graphics.Canvas p0 ) {
/* .locals 4 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/d/f/j;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.graphics.drawable.Drawable ) p0 ).getBounds ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
(( c.d.f.j ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/d/f/j;->a(Landroid/graphics/Rect;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Lc/d/f/j;->l:Z */
/* .line 4 */
} // :cond_0
/* iget v0, p0, Lc/d/f/j;->j:F */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
int v2 = 0; // const/4 v2, 0x0
(( android.graphics.Canvas ) p1 ).translate ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 5 */
(( c.d.f.j ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/d/f/j;->a(Landroid/graphics/Canvas;)V
/* .line 6 */
/* iget v0, p0, Lc/d/f/j;->j:F */
/* neg-float v0, v0 */
/* div-float/2addr v0, v1 */
(( android.graphics.Canvas ) p1 ).translate ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 7 */
v0 = c.d.f.j.r;
v1 = this.e;
/* iget v2, p0, Lc/d/f/j;->f:F */
v3 = this.b;
return;
} // .end method
public Float e ( ) {
/* .locals 5 */
/* .line 1 */
/* iget v0, p0, Lc/d/f/j;->h:F */
/* iget v1, p0, Lc/d/f/j;->f:F */
/* iget v2, p0, Lc/d/f/j;->a:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x3fc00000 # 1.5f */
/* mul-float v3, v0, v2 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
/* add-float/2addr v1, v3 */
v0 = java.lang.Math .max ( v0,v1 );
/* mul-float v0, v0, v4 */
/* .line 2 */
/* iget v1, p0, Lc/d/f/j;->h:F */
/* mul-float v1, v1, v2 */
/* iget v2, p0, Lc/d/f/j;->a:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* mul-float v1, v1, v4 */
/* add-float/2addr v0, v1 */
} // .end method
public Float f ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Lc/d/f/j;->h:F */
/* iget v1, p0, Lc/d/f/j;->f:F */
/* iget v2, p0, Lc/d/f/j;->a:I */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float v3, v0, v2 */
/* add-float/2addr v1, v3 */
/* .line 2 */
v0 = java.lang.Math .max ( v0,v1 );
/* mul-float v0, v0, v2 */
/* .line 3 */
/* iget v1, p0, Lc/d/f/j;->h:F */
/* iget v3, p0, Lc/d/f/j;->a:I */
/* int-to-float v3, v3 */
/* add-float/2addr v1, v3 */
/* mul-float v1, v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public Float g ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/d/f/j;->j:F */
} // .end method
public Integer getOpacity ( ) {
/* .locals 1 */
int v0 = -3; // const/4 v0, -0x3
} // .end method
public Boolean getPadding ( android.graphics.Rect p0 ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Lc/d/f/j;->h:F */
/* iget v1, p0, Lc/d/f/j;->f:F */
/* iget-boolean v2, p0, Lc/d/f/j;->o:Z */
v0 = c.d.f.j .b ( v0,v1,v2 );
/* float-to-double v0, v0 */
java.lang.Math .ceil ( v0,v1 );
/* move-result-wide v0 */
/* double-to-int v0, v0 */
/* .line 2 */
/* iget v1, p0, Lc/d/f/j;->h:F */
/* iget v2, p0, Lc/d/f/j;->f:F */
/* iget-boolean v3, p0, Lc/d/f/j;->o:Z */
v1 = c.d.f.j .a ( v1,v2,v3 );
/* float-to-double v1, v1 */
java.lang.Math .ceil ( v1,v2 );
/* move-result-wide v1 */
/* double-to-int v1, v1 */
/* .line 3 */
(( android.graphics.Rect ) p1 ).set ( v1, v0, v1, v0 ); // invoke-virtual {p1, v1, v0, v1, v0}, Landroid/graphics/Rect;->set(IIII)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean isStateful ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.content.res.ColorStateList ) v0 ).isStateful ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z
/* if-nez v0, :cond_1 */
} // :cond_0
v0 = /* invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z */
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void onBoundsChange ( android.graphics.Rect p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
/* iput-boolean p1, p0, Lc/d/f/j;->l:Z */
return;
} // .end method
public Boolean onStateChange ( Integer[] p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.k;
v1 = (( android.content.res.ColorStateList ) v0 ).getDefaultColor ( ); // invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I
p1 = (( android.content.res.ColorStateList ) v0 ).getColorForState ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I
/* .line 2 */
v0 = this.b;
v0 = (( android.graphics.Paint ) v0 ).getColor ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I
/* if-ne v0, p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :cond_0
v0 = this.b;
(( android.graphics.Paint ) v0 ).setColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V
int p1 = 1; // const/4 p1, 0x1
/* .line 4 */
/* iput-boolean p1, p0, Lc/d/f/j;->l:Z */
/* .line 5 */
(( android.graphics.drawable.Drawable ) p0 ).invalidateSelf ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
} // .end method
public void setAlpha ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( android.graphics.Paint ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V
/* .line 2 */
v0 = this.c;
(( android.graphics.Paint ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V
/* .line 3 */
v0 = this.d;
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
