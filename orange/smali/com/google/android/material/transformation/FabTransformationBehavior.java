public abstract class com.google.android.material.transformation.FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/android/material/transformation/FabTransformationBehavior$b; */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.graphics.Rect c;
public final android.graphics.RectF d;
public final android.graphics.RectF e;
public final f;
/* # direct methods */
public com.google.android.material.transformation.FabTransformationBehavior ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Landroid/graphics/Rect; */
	 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
	 this.c = v0;
	 /* .line 3 */
	 /* new-instance v0, Landroid/graphics/RectF; */
	 /* invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V */
	 this.d = v0;
	 /* .line 4 */
	 /* new-instance v0, Landroid/graphics/RectF; */
	 /* invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V */
	 this.e = v0;
	 int v0 = 2; // const/4 v0, 0x2
	 /* new-array v0, v0, [I */
	 /* .line 5 */
	 this.f = v0;
	 return;
} // .end method
public com.google.android.material.transformation.FabTransformationBehavior ( ) {
	 /* .locals 0 */
	 /* .line 6 */
	 /* invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 /* .line 7 */
	 /* new-instance p1, Landroid/graphics/Rect; */
	 /* invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V */
	 this.c = p1;
	 /* .line 8 */
	 /* new-instance p1, Landroid/graphics/RectF; */
	 /* invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V */
	 this.d = p1;
	 /* .line 9 */
	 /* new-instance p1, Landroid/graphics/RectF; */
	 /* invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V */
	 this.e = p1;
	 int p1 = 2; // const/4 p1, 0x2
	 /* new-array p1, p1, [I */
	 /* .line 10 */
	 this.f = p1;
	 return;
} // .end method
/* # virtual methods */
public final Float a ( android.view.View p0, android.view.View p1, Object p2 ) {
	 /* .locals 2 */
	 /* .line 34 */
	 v0 = this.d;
	 /* .line 35 */
	 v1 = this.e;
	 /* .line 36 */
	 (( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V
	 /* .line 37 */
	 (( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).a ( p2, v1 ); // invoke-virtual {p0, p2, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V
	 /* .line 38 */
	 /* iget p1, p3, Le/f/a/c/j/f;->a:I */
	 /* and-int/lit8 p1, p1, 0x7 */
	 int p2 = 1; // const/4 p2, 0x1
	 /* if-eq p1, p2, :cond_2 */
	 int p2 = 3; // const/4 p2, 0x3
	 /* if-eq p1, p2, :cond_1 */
	 int p2 = 5; // const/4 p2, 0x5
	 /* if-eq p1, p2, :cond_0 */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 39 */
} // :cond_0
/* iget p1, v1, Landroid/graphics/RectF;->right:F */
/* iget p2, v0, Landroid/graphics/RectF;->right:F */
/* .line 40 */
} // :cond_1
/* iget p1, v1, Landroid/graphics/RectF;->left:F */
/* iget p2, v0, Landroid/graphics/RectF;->left:F */
/* .line 41 */
} // :cond_2
p1 = (( android.graphics.RectF ) v1 ).centerX ( ); // invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F
p2 = (( android.graphics.RectF ) v0 ).centerX ( ); // invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F
} // :goto_0
/* sub-float/2addr p1, p2 */
/* .line 42 */
} // :goto_1
/* iget p2, p3, Le/f/a/c/j/f;->b:F */
/* add-float/2addr p1, p2 */
} // .end method
public final Float a ( com.google.android.material.transformation.FabTransformationBehavior$b p0, Object p1, Float p2, Float p3 ) {
/* .locals 8 */
/* .line 59 */
(( e.f.a.c.j.e ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/a/c/j/e;->a()J
/* move-result-wide v0 */
/* .line 60 */
(( e.f.a.c.j.e ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/a/c/j/e;->b()J
/* move-result-wide v2 */
/* .line 61 */
p1 = this.a;
final String v4 = "expansion"; // const-string v4, "expansion"
(( e.f.a.c.j.d ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;
/* .line 62 */
(( e.f.a.c.j.e ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/c/j/e;->a()J
/* move-result-wide v4 */
(( e.f.a.c.j.e ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/c/j/e;->b()J
/* move-result-wide v6 */
/* add-long/2addr v4, v6 */
/* const-wide/16 v6, 0x11 */
/* add-long/2addr v4, v6 */
/* sub-long/2addr v4, v0 */
/* long-to-float p1, v4 */
/* long-to-float v0, v2 */
/* div-float/2addr p1, v0 */
/* .line 63 */
p1 = (( e.f.a.c.j.e ) p2 ).c ( ); // invoke-virtual {p2}, Le/f/a/c/j/e;->c()Landroid/animation/TimeInterpolator;
/* .line 64 */
p1 = e.f.a.c.j.a .a ( p3,p4,p1 );
} // .end method
public final android.view.ViewGroup a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 65 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 66 */
(( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->b(Landroid/view/View;)Landroid/view/ViewGroup;
/* .line 67 */
} // :cond_0
(( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->b(Landroid/view/View;)Landroid/view/ViewGroup;
} // .end method
public abstract com.google.android.material.transformation.FabTransformationBehavior$b a ( android.content.Context p0, Boolean p1 ) {
} // .end method
public final void a ( android.view.View p0, android.graphics.RectF p1 ) {
/* .locals 3 */
/* .line 43 */
v0 = (( android.view.View ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/view/View;->getWidth()I
/* int-to-float v0, v0 */
v1 = (( android.view.View ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/view/View;->getHeight()I
/* int-to-float v1, v1 */
int v2 = 0; // const/4 v2, 0x0
(( android.graphics.RectF ) p2 ).set ( v2, v2, v0, v1 ); // invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V
/* .line 44 */
v0 = this.f;
/* .line 45 */
(( android.view.View ) p1 ).getLocationInWindow ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V
int v1 = 0; // const/4 v1, 0x0
/* .line 46 */
/* aget v1, v0, v1 */
/* int-to-float v1, v1 */
int v2 = 1; // const/4 v2, 0x1
/* aget v0, v0, v2 */
/* int-to-float v0, v0 */
(( android.graphics.RectF ) p2 ).offsetTo ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Landroid/graphics/RectF;->offsetTo(FF)V
/* .line 47 */
v0 = (( android.view.View ) p1 ).getTranslationX ( ); // invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F
/* neg-float v0, v0 */
/* float-to-int v0, v0 */
/* int-to-float v0, v0 */
p1 = (( android.view.View ) p1 ).getTranslationY ( ); // invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F
/* neg-float p1, p1 */
/* float-to-int p1, p1 */
/* int-to-float p1, p1 */
(( android.graphics.RectF ) p2 ).offset ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Landroid/graphics/RectF;->offset(FF)V
return;
} // .end method
public final void a ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3, com.google.android.material.transformation.FabTransformationBehavior$b p4, Float p5, Float p6, java.util.List p7, java.util.List p8 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/View;", */
/* "Landroid/view/View;", */
/* "ZZ", */
/* "Lcom/google/android/material/transformation/FabTransformationBehavior$b;", */
/* "FF", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator$AnimatorListener;", */
/* ">;)V" */
/* } */
} // .end annotation
return;
} // .end method
public final void a ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3, com.google.android.material.transformation.FabTransformationBehavior$b p4, java.util.List p5, java.util.List p6 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/View;", */
/* "Landroid/view/View;", */
/* "ZZ", */
/* "Lcom/google/android/material/transformation/FabTransformationBehavior$b;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator$AnimatorListener;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 24 */
/* instance-of p1, p2, Landroid/view/ViewGroup; */
/* if-nez p1, :cond_0 */
return;
/* .line 25 */
} // :cond_0
(( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;)Landroid/view/ViewGroup;
/* if-nez p1, :cond_1 */
return;
} // :cond_1
int p2 = 0; // const/4 p2, 0x0
int p7 = 0; // const/4 p7, 0x0
int v0 = 1; // const/4 v0, 0x1
if ( p3 != null) { // if-eqz p3, :cond_3
/* if-nez p4, :cond_2 */
/* .line 26 */
p3 = e.f.a.c.j.c.a;
java.lang.Float .valueOf ( p2 );
(( android.util.Property ) p3 ).set ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Landroid/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V
/* .line 27 */
} // :cond_2
p2 = e.f.a.c.j.c.a;
/* new-array p3, v0, [F */
/* const/high16 p4, 0x3f800000 # 1.0f */
/* aput p4, p3, p7 */
/* .line 28 */
android.animation.ObjectAnimator .ofFloat ( p1,p2,p3 );
/* .line 29 */
} // :cond_3
p3 = e.f.a.c.j.c.a;
/* new-array p4, v0, [F */
/* aput p2, p4, p7 */
/* .line 30 */
android.animation.ObjectAnimator .ofFloat ( p1,p3,p4 );
/* .line 31 */
} // :goto_0
p2 = this.a;
final String p3 = "contentFade"; // const-string p3, "contentFade"
(( e.f.a.c.j.d ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;
/* .line 32 */
(( e.f.a.c.j.e ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/f/a/c/j/e;->a(Landroid/animation/Animator;)V
/* .line 33 */
return;
} // .end method
public final void a ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3, com.google.android.material.transformation.FabTransformationBehavior$b p4, java.util.List p5, java.util.List p6, android.graphics.RectF p7 ) {
/* .locals 16 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/View;", */
/* "Landroid/view/View;", */
/* "ZZ", */
/* "Lcom/google/android/material/transformation/FabTransformationBehavior$b;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator$AnimatorListener;", */
/* ">;", */
/* "Landroid/graphics/RectF;", */
/* ")V" */
/* } */
} // .end annotation
/* move-object/from16 v10, p0 */
/* move-object/from16 v0, p1 */
/* move-object/from16 v1, p2 */
/* move-object/from16 v2, p5 */
/* move-object/from16 v11, p6 */
/* .line 5 */
v3 = this.b;
v3 = (( com.google.android.material.transformation.FabTransformationBehavior ) v10 ).a ( v0, v1, v3 ); // invoke-virtual {v10, v0, v1, v3}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/view/View;Le/f/a/c/j/f;)F
/* .line 6 */
v4 = this.b;
v0 = (( com.google.android.material.transformation.FabTransformationBehavior ) v10 ).b ( v0, v1, v4 ); // invoke-virtual {v10, v0, v1, v4}, Lcom/google/android/material/transformation/FabTransformationBehavior;->b(Landroid/view/View;Landroid/view/View;Le/f/a/c/j/f;)F
int v4 = 0; // const/4 v4, 0x0
/* cmpl-float v5, v3, v4 */
if ( v5 != null) { // if-eqz v5, :cond_4
/* cmpl-float v5, v0, v4 */
/* if-nez v5, :cond_0 */
} // :cond_0
if ( p3 != null) { // if-eqz p3, :cond_1
/* cmpg-float v6, v0, v4 */
/* if-ltz v6, :cond_2 */
} // :cond_1
/* if-nez p3, :cond_3 */
/* if-lez v5, :cond_3 */
/* .line 7 */
} // :cond_2
v5 = this.a;
final String v6 = "translationXCurveUpwards"; // const-string v6, "translationXCurveUpwards"
(( e.f.a.c.j.d ) v5 ).a ( v6 ); // invoke-virtual {v5, v6}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;
/* .line 8 */
v6 = this.a;
final String v7 = "translationYCurveUpwards"; // const-string v7, "translationYCurveUpwards"
(( e.f.a.c.j.d ) v6 ).a ( v7 ); // invoke-virtual {v6, v7}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;
/* .line 9 */
} // :cond_3
v5 = this.a;
final String v6 = "translationXCurveDownwards"; // const-string v6, "translationXCurveDownwards"
(( e.f.a.c.j.d ) v5 ).a ( v6 ); // invoke-virtual {v5, v6}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;
/* .line 10 */
v6 = this.a;
final String v7 = "translationYCurveDownwards"; // const-string v7, "translationYCurveDownwards"
(( e.f.a.c.j.d ) v6 ).a ( v7 ); // invoke-virtual {v6, v7}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;
/* .line 11 */
} // :cond_4
} // :goto_0
v5 = this.a;
final String v6 = "translationXLinear"; // const-string v6, "translationXLinear"
(( e.f.a.c.j.d ) v5 ).a ( v6 ); // invoke-virtual {v5, v6}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;
/* .line 12 */
v6 = this.a;
final String v7 = "translationYLinear"; // const-string v7, "translationYLinear"
(( e.f.a.c.j.d ) v6 ).a ( v7 ); // invoke-virtual {v6, v7}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;
} // :goto_1
/* move-object v12, v5 */
/* move-object v13, v6 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
if ( p3 != null) { // if-eqz p3, :cond_6
/* if-nez p4, :cond_5 */
/* neg-float v7, v3 */
/* .line 13 */
(( android.view.View ) v1 ).setTranslationX ( v7 ); // invoke-virtual {v1, v7}, Landroid/view/View;->setTranslationX(F)V
/* neg-float v7, v0 */
/* .line 14 */
(( android.view.View ) v1 ).setTranslationY ( v7 ); // invoke-virtual {v1, v7}, Landroid/view/View;->setTranslationY(F)V
/* .line 15 */
} // :cond_5
v7 = android.view.View.TRANSLATION_X;
/* new-array v8, v6, [F */
/* aput v4, v8, v5 */
android.animation.ObjectAnimator .ofFloat ( v1,v7,v8 );
/* .line 16 */
v7 = android.view.View.TRANSLATION_Y;
/* new-array v6, v6, [F */
/* aput v4, v6, v5 */
android.animation.ObjectAnimator .ofFloat ( v1,v7,v6 );
/* neg-float v5, v3 */
/* neg-float v6, v0 */
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p2 */
/* move-object/from16 v2, p5 */
/* move-object v3, v12 */
/* move-object v4, v13 */
/* move-object/from16 v9, p8 */
/* .line 17 */
/* invoke-virtual/range {v0 ..v9}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Lcom/google/android/material/transformation/FabTransformationBehavior$b;Le/f/a/c/j/e;Le/f/a/c/j/e;FFFFLandroid/graphics/RectF;)V */
/* .line 18 */
} // :cond_6
v2 = android.view.View.TRANSLATION_X;
/* new-array v4, v6, [F */
/* neg-float v3, v3 */
/* aput v3, v4, v5 */
android.animation.ObjectAnimator .ofFloat ( v1,v2,v4 );
/* .line 19 */
v2 = android.view.View.TRANSLATION_Y;
/* new-array v3, v6, [F */
/* neg-float v0, v0 */
/* aput v0, v3, v5 */
android.animation.ObjectAnimator .ofFloat ( v1,v2,v3 );
/* .line 20 */
} // :goto_2
(( e.f.a.c.j.e ) v12 ).a ( v14 ); // invoke-virtual {v12, v14}, Le/f/a/c/j/e;->a(Landroid/animation/Animator;)V
/* .line 21 */
(( e.f.a.c.j.e ) v13 ).a ( v15 ); // invoke-virtual {v13, v15}, Le/f/a/c/j/e;->a(Landroid/animation/Animator;)V
/* .line 22 */
/* .line 23 */
return;
} // .end method
public final void a ( android.view.View p0, com.google.android.material.transformation.FabTransformationBehavior$b p1, Object p2, Object p3, Float p4, Float p5, Float p6, Float p7, android.graphics.RectF p8 ) {
/* .locals 0 */
/* .line 48 */
p3 = (( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).a ( p2, p3, p5, p7 ); // invoke-virtual {p0, p2, p3, p5, p7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Lcom/google/android/material/transformation/FabTransformationBehavior$b;Le/f/a/c/j/e;FF)F
/* .line 49 */
p2 = (( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).a ( p2, p4, p6, p8 ); // invoke-virtual {p0, p2, p4, p6, p8}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Lcom/google/android/material/transformation/FabTransformationBehavior$b;Le/f/a/c/j/e;FF)F
/* .line 50 */
p4 = this.c;
/* .line 51 */
(( android.view.View ) p1 ).getWindowVisibleDisplayFrame ( p4 ); // invoke-virtual {p1, p4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
/* .line 52 */
p5 = this.d;
/* .line 53 */
(( android.graphics.RectF ) p5 ).set ( p4 ); // invoke-virtual {p5, p4}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V
/* .line 54 */
p4 = this.e;
/* .line 55 */
(( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).a ( p1, p4 ); // invoke-virtual {p0, p1, p4}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V
/* .line 56 */
(( android.graphics.RectF ) p4 ).offset ( p3, p2 ); // invoke-virtual {p4, p3, p2}, Landroid/graphics/RectF;->offset(FF)V
/* .line 57 */
(( android.graphics.RectF ) p4 ).intersect ( p5 ); // invoke-virtual {p4, p5}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z
/* .line 58 */
(( android.graphics.RectF ) p9 ).set ( p4 ); // invoke-virtual {p9, p4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V
return;
} // .end method
public void a ( androidx.coordinatorlayout.widget.CoordinatorLayout$e p0 ) {
/* .locals 1 */
/* .line 3 */
/* iget v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
/* if-nez v0, :cond_0 */
/* const/16 v0, 0x50 */
/* .line 4 */
/* iput v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I */
} // :cond_0
return;
} // .end method
public Boolean a ( androidx.coordinatorlayout.widget.CoordinatorLayout p0, android.view.View p1, android.view.View p2 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( android.view.View ) p2 ).getVisibility ( ); // invoke-virtual {p2}, Landroid/view/View;->getVisibility()I
/* const/16 p2, 0x8 */
/* if-eq p1, p2, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "This behavior cannot be attached to a GONE view.Set the view to INVISIBLE instead."; // const-string p2, "This behavior cannot be attached to a GONE view.Set the view to INVISIBLE instead."
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final Float b ( android.view.View p0, android.view.View p1, Object p2 ) {
/* .locals 2 */
/* .line 19 */
v0 = this.d;
/* .line 20 */
v1 = this.e;
/* .line 21 */
(( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V
/* .line 22 */
(( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).a ( p2, v1 ); // invoke-virtual {p0, p2, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V
/* .line 23 */
/* iget p1, p3, Le/f/a/c/j/f;->a:I */
/* and-int/lit8 p1, p1, 0x70 */
/* const/16 p2, 0x10 */
/* if-eq p1, p2, :cond_2 */
/* const/16 p2, 0x30 */
/* if-eq p1, p2, :cond_1 */
/* const/16 p2, 0x50 */
/* if-eq p1, p2, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 24 */
} // :cond_0
/* iget p1, v1, Landroid/graphics/RectF;->bottom:F */
/* iget p2, v0, Landroid/graphics/RectF;->bottom:F */
/* .line 25 */
} // :cond_1
/* iget p1, v1, Landroid/graphics/RectF;->top:F */
/* iget p2, v0, Landroid/graphics/RectF;->top:F */
/* .line 26 */
} // :cond_2
p1 = (( android.graphics.RectF ) v1 ).centerY ( ); // invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F
p2 = (( android.graphics.RectF ) v0 ).centerY ( ); // invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F
} // :goto_0
/* sub-float/2addr p1, p2 */
/* .line 27 */
} // :goto_1
/* iget p2, p3, Le/f/a/c/j/f;->c:F */
/* add-float/2addr p1, p2 */
} // .end method
public android.animation.AnimatorSet b ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3 ) {
/* .locals 15 */
/* move-object v10, p0 */
/* move/from16 v11, p3 */
/* .line 1 */
/* invoke-virtual/range {p2 ..p2}, Landroid/view/View;->getContext()Landroid/content/Context; */
(( com.google.android.material.transformation.FabTransformationBehavior ) p0 ).a ( v0, v11 ); // invoke-virtual {p0, v0, v11}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/content/Context;Z)Lcom/google/android/material/transformation/FabTransformationBehavior$b;
/* .line 2 */
/* new-instance v13, Ljava/util/ArrayList; */
/* invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V */
/* .line 3 */
/* new-instance v14, Ljava/util/ArrayList; */
/* invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V */
/* .line 4 */
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_0 */
/* move-object v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p2 */
/* move/from16 v3, p3 */
/* move/from16 v4, p4 */
/* move-object v5, v12 */
/* move-object v6, v13 */
/* move-object v7, v14 */
/* .line 5 */
/* invoke-virtual/range {v0 ..v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->c(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V */
/* .line 6 */
} // :cond_0
v9 = this.d;
/* move-object v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p2 */
/* move/from16 v3, p3 */
/* move/from16 v4, p4 */
/* move-object v5, v12 */
/* move-object v6, v13 */
/* move-object v7, v14 */
/* move-object v8, v9 */
/* .line 7 */
/* invoke-virtual/range {v0 ..v8}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;Landroid/graphics/RectF;)V */
/* .line 8 */
v8 = (( android.graphics.RectF ) v9 ).width ( ); // invoke-virtual {v9}, Landroid/graphics/RectF;->width()F
/* .line 9 */
v9 = (( android.graphics.RectF ) v9 ).height ( ); // invoke-virtual {v9}, Landroid/graphics/RectF;->height()F
/* .line 10 */
/* invoke-virtual/range {v0 ..v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->d(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V */
/* move v6, v8 */
/* move v7, v9 */
/* move-object v8, v13 */
/* move-object v9, v14 */
/* .line 11 */
/* invoke-virtual/range {v0 ..v9}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;FFLjava/util/List;Ljava/util/List;)V */
/* move-object v6, v13 */
/* move-object v7, v14 */
/* .line 12 */
/* invoke-virtual/range {v0 ..v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->b(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V */
/* .line 13 */
/* invoke-virtual/range {v0 ..v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V */
/* .line 14 */
/* new-instance v0, Landroid/animation/AnimatorSet; */
/* invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V */
/* .line 15 */
e.f.a.c.j.b .a ( v0,v13 );
/* .line 16 */
/* new-instance v1, Lcom/google/android/material/transformation/FabTransformationBehavior$a; */
/* move-object/from16 v2, p1 */
/* move-object/from16 v3, p2 */
/* invoke-direct {v1, p0, v11, v3, v2}, Lcom/google/android/material/transformation/FabTransformationBehavior$a;-><init>(Lcom/google/android/material/transformation/FabTransformationBehavior;ZLandroid/view/View;Landroid/view/View;)V */
(( android.animation.AnimatorSet ) v0 ).addListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V
int v1 = 0; // const/4 v1, 0x0
v2 = /* .line 17 */
} // :goto_0
/* if-ge v1, v2, :cond_1 */
/* .line 18 */
/* check-cast v3, Landroid/animation/Animator$AnimatorListener; */
(( android.animation.AnimatorSet ) v0 ).addListener ( v3 ); // invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public final android.view.ViewGroup b ( android.view.View p0 ) {
/* .locals 1 */
/* .line 28 */
/* instance-of v0, p1, Landroid/view/ViewGroup; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 29 */
/* check-cast p1, Landroid/view/ViewGroup; */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void b ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3, com.google.android.material.transformation.FabTransformationBehavior$b p4, java.util.List p5, java.util.List p6 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/View;", */
/* "Landroid/view/View;", */
/* "ZZ", */
/* "Lcom/google/android/material/transformation/FabTransformationBehavior$b;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator$AnimatorListener;", */
/* ">;)V" */
/* } */
} // .end annotation
return;
} // .end method
public final void c ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3, com.google.android.material.transformation.FabTransformationBehavior$b p4, java.util.List p5, java.util.List p6 ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x15 */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/View;", */
/* "Landroid/view/View;", */
/* "ZZ", */
/* "Lcom/google/android/material/transformation/FabTransformationBehavior$b;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator$AnimatorListener;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
p7 = c.h.n.v0 .k ( p2 );
p1 = c.h.n.v0 .k ( p1 );
/* sub-float/2addr p7, p1 */
int p1 = 0; // const/4 p1, 0x0
int v0 = 1; // const/4 v0, 0x1
if ( p3 != null) { // if-eqz p3, :cond_1
/* if-nez p4, :cond_0 */
/* neg-float p3, p7 */
/* .line 2 */
(( android.view.View ) p2 ).setTranslationZ ( p3 ); // invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationZ(F)V
/* .line 3 */
} // :cond_0
p3 = android.view.View.TRANSLATION_Z;
/* new-array p4, v0, [F */
int p7 = 0; // const/4 p7, 0x0
/* aput p7, p4, p1 */
android.animation.ObjectAnimator .ofFloat ( p2,p3,p4 );
/* .line 4 */
} // :cond_1
p3 = android.view.View.TRANSLATION_Z;
/* new-array p4, v0, [F */
/* neg-float p7, p7 */
/* aput p7, p4, p1 */
android.animation.ObjectAnimator .ofFloat ( p2,p3,p4 );
/* .line 5 */
} // :goto_0
p2 = this.a;
final String p3 = "elevation"; // const-string p3, "elevation"
(( e.f.a.c.j.d ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;
/* .line 6 */
(( e.f.a.c.j.e ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/f/a/c/j/e;->a(Landroid/animation/Animator;)V
/* .line 7 */
return;
} // .end method
public final void d ( android.view.View p0, android.view.View p1, Boolean p2, Boolean p3, com.google.android.material.transformation.FabTransformationBehavior$b p4, java.util.List p5, java.util.List p6 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/View;", */
/* "Landroid/view/View;", */
/* "ZZ", */
/* "Lcom/google/android/material/transformation/FabTransformationBehavior$b;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator;", */
/* ">;", */
/* "Ljava/util/List<", */
/* "Landroid/animation/Animator$AnimatorListener;", */
/* ">;)V" */
/* } */
} // .end annotation
return;
} // .end method
