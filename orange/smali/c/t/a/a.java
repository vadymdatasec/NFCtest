public class c.t.a.a extends android.graphics.drawable.shapes.OvalShape {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.graphics.RadialGradient b;
	 public android.graphics.Paint c;
	 public final c.t.a.b d; //synthetic
	 /* # direct methods */
	 public c.t.a.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 this.d = p1;
		 /* .line 2 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V */
		 /* .line 3 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.c = v0;
		 /* .line 4 */
		 /* iput p2, p1, Lc/t/a/b;->c:I */
		 /* .line 5 */
		 (( android.graphics.drawable.shapes.OvalShape ) p0 ).rect ( ); // invoke-virtual {p0}, Landroid/graphics/drawable/shapes/OvalShape;->rect()Landroid/graphics/RectF;
		 p1 = 		 (( android.graphics.RectF ) p1 ).width ( ); // invoke-virtual {p1}, Landroid/graphics/RectF;->width()F
		 /* float-to-int p1, p1 */
		 (( c.t.a.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/t/a/a;->a(I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Integer p0 ) {
		 /* .locals 8 */
		 /* .line 1 */
		 /* new-instance v7, Landroid/graphics/RadialGradient; */
		 int v0 = 2; // const/4 v0, 0x2
		 /* div-int/2addr p1, v0 */
		 /* int-to-float v2, p1 */
		 p1 = this.d;
		 /* iget p1, p1, Lc/t/a/b;->c:I */
		 /* int-to-float v3, p1 */
		 /* new-array v4, v0, [I */
		 /* fill-array-data v4, :array_0 */
		 v6 = android.graphics.Shader$TileMode.CLAMP;
		 int v5 = 0; // const/4 v5, 0x0
		 /* move-object v0, v7 */
		 /* move v1, v2 */
		 /* invoke-direct/range {v0 ..v6}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V */
		 this.b = v7;
		 /* .line 2 */
		 p1 = this.c;
		 (( android.graphics.Paint ) p1 ).setShader ( v7 ); // invoke-virtual {p1, v7}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x3d000000 # 0.03125f */
		 /* 0x0 */
	 } // .end array-data
} // .end method
public void draw ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
	 /* .locals 4 */
	 /* .line 1 */
	 v0 = this.d;
	 v0 = 	 (( android.widget.ImageView ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I
	 /* .line 2 */
	 v1 = this.d;
	 v1 = 	 (( android.widget.ImageView ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/widget/ImageView;->getHeight()I
	 /* .line 3 */
	 /* div-int/lit8 v0, v0, 0x2 */
	 /* int-to-float v2, v0 */
	 /* div-int/lit8 v1, v1, 0x2 */
	 /* int-to-float v1, v1 */
	 v3 = this.c;
	 (( android.graphics.Canvas ) p1 ).drawCircle ( v2, v1, v2, v3 ); // invoke-virtual {p1, v2, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
	 /* .line 4 */
	 v3 = this.d;
	 /* iget v3, v3, Lc/t/a/b;->c:I */
	 /* sub-int/2addr v0, v3 */
	 /* int-to-float v0, v0 */
	 (( android.graphics.Canvas ) p1 ).drawCircle ( v2, v1, v0, p2 ); // invoke-virtual {p1, v2, v1, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
	 return;
} // .end method
public void onResize ( Float p0, Float p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1, p2}, Landroid/graphics/drawable/shapes/OvalShape;->onResize(FF)V */
	 /* float-to-int p1, p1 */
	 /* .line 2 */
	 (( c.t.a.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/t/a/a;->a(I)V
	 return;
} // .end method
