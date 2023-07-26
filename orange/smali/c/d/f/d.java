public class c.d.f.d implements c.d.f.i {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.d.f.e a; //synthetic
	 /* # direct methods */
	 public c.d.f.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.Canvas p0, android.graphics.RectF p1, Float p2, android.graphics.Paint p3 ) {
		 /* .locals 16 */
		 /* move-object/from16 v0, p0 */
		 /* move-object/from16 v7, p1 */
		 /* move-object/from16 v8, p2 */
		 /* const/high16 v1, 0x40000000 # 2.0f */
		 /* mul-float v1, v1, p3 */
		 /* .line 1 */
		 v2 = 		 /* invoke-virtual/range {p2 ..p2}, Landroid/graphics/RectF;->width()F */
		 /* sub-float/2addr v2, v1 */
		 /* const/high16 v9, 0x3f800000 # 1.0f */
		 /* sub-float v10, v2, v9 */
		 /* .line 2 */
		 v2 = 		 /* invoke-virtual/range {p2 ..p2}, Landroid/graphics/RectF;->height()F */
		 /* sub-float/2addr v2, v1 */
		 /* sub-float v11, v2, v9 */
		 /* cmpl-float v1, p3, v9 */
		 /* if-ltz v1, :cond_0 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* add-float v12, p3, v1 */
		 /* .line 3 */
		 v1 = this.a;
		 v1 = this.a;
		 /* neg-float v2, v12 */
		 (( android.graphics.RectF ) v1 ).set ( v2, v2, v12, v12 ); // invoke-virtual {v1, v2, v2, v12, v12}, Landroid/graphics/RectF;->set(FFFF)V
		 /* .line 4 */
		 v13 = 		 /* invoke-virtual/range {p1 ..p1}, Landroid/graphics/Canvas;->save()I */
		 /* .line 5 */
		 /* iget v1, v8, Landroid/graphics/RectF;->left:F */
		 /* add-float/2addr v1, v12 */
		 /* iget v2, v8, Landroid/graphics/RectF;->top:F */
		 /* add-float/2addr v2, v12 */
		 (( android.graphics.Canvas ) v7 ).translate ( v1, v2 ); // invoke-virtual {v7, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V
		 /* .line 6 */
		 v1 = this.a;
		 v2 = this.a;
		 /* const/high16 v3, 0x43340000 # 180.0f */
		 /* const/high16 v4, 0x42b40000 # 90.0f */
		 int v5 = 1; // const/4 v5, 0x1
		 /* move-object/from16 v1, p1 */
		 /* move-object/from16 v6, p4 */
		 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V */
		 int v14 = 0; // const/4 v14, 0x0
		 /* .line 7 */
		 (( android.graphics.Canvas ) v7 ).translate ( v10, v14 ); // invoke-virtual {v7, v10, v14}, Landroid/graphics/Canvas;->translate(FF)V
		 /* const/high16 v15, 0x42b40000 # 90.0f */
		 /* .line 8 */
		 (( android.graphics.Canvas ) v7 ).rotate ( v15 ); // invoke-virtual {v7, v15}, Landroid/graphics/Canvas;->rotate(F)V
		 /* .line 9 */
		 v1 = this.a;
		 v2 = this.a;
		 /* move-object/from16 v1, p1 */
		 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V */
		 /* .line 10 */
		 (( android.graphics.Canvas ) v7 ).translate ( v11, v14 ); // invoke-virtual {v7, v11, v14}, Landroid/graphics/Canvas;->translate(FF)V
		 /* .line 11 */
		 (( android.graphics.Canvas ) v7 ).rotate ( v15 ); // invoke-virtual {v7, v15}, Landroid/graphics/Canvas;->rotate(F)V
		 /* .line 12 */
		 v1 = this.a;
		 v2 = this.a;
		 /* move-object/from16 v1, p1 */
		 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V */
		 /* .line 13 */
		 (( android.graphics.Canvas ) v7 ).translate ( v10, v14 ); // invoke-virtual {v7, v10, v14}, Landroid/graphics/Canvas;->translate(FF)V
		 /* .line 14 */
		 (( android.graphics.Canvas ) v7 ).rotate ( v15 ); // invoke-virtual {v7, v15}, Landroid/graphics/Canvas;->rotate(F)V
		 /* .line 15 */
		 v1 = this.a;
		 v2 = this.a;
		 /* move-object/from16 v1, p1 */
		 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V */
		 /* .line 16 */
		 (( android.graphics.Canvas ) v7 ).restoreToCount ( v13 ); // invoke-virtual {v7, v13}, Landroid/graphics/Canvas;->restoreToCount(I)V
		 /* .line 17 */
		 /* iget v1, v8, Landroid/graphics/RectF;->left:F */
		 /* add-float/2addr v1, v12 */
		 /* sub-float v2, v1, v9 */
		 /* iget v3, v8, Landroid/graphics/RectF;->top:F */
		 /* iget v1, v8, Landroid/graphics/RectF;->right:F */
		 /* sub-float/2addr v1, v12 */
		 /* add-float v4, v1, v9 */
		 /* add-float v5, v3, v12 */
		 /* move-object/from16 v1, p1 */
		 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
		 /* .line 18 */
		 /* iget v1, v8, Landroid/graphics/RectF;->left:F */
		 /* add-float/2addr v1, v12 */
		 /* sub-float v2, v1, v9 */
		 /* iget v5, v8, Landroid/graphics/RectF;->bottom:F */
		 /* sub-float v3, v5, v12 */
		 /* iget v1, v8, Landroid/graphics/RectF;->right:F */
		 /* sub-float/2addr v1, v12 */
		 /* add-float v4, v1, v9 */
		 /* move-object/from16 v1, p1 */
		 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
		 /* .line 19 */
	 } // :cond_0
	 /* iget v2, v8, Landroid/graphics/RectF;->left:F */
	 /* iget v1, v8, Landroid/graphics/RectF;->top:F */
	 /* add-float v3, v1, p3 */
	 /* iget v4, v8, Landroid/graphics/RectF;->right:F */
	 /* iget v1, v8, Landroid/graphics/RectF;->bottom:F */
	 /* sub-float v5, v1, p3 */
	 /* move-object/from16 v1, p1 */
	 /* move-object/from16 v6, p4 */
	 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
	 return;
} // .end method
