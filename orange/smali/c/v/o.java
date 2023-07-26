public class c.v.o extends c.v.k0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String N;
	 public static final android.util.Property O;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/util/Property<", */
	 /* "Landroid/graphics/drawable/Drawable;", */
	 /* "Landroid/graphics/PointF;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final android.util.Property P;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/Property<", */
/* "Lc/v/n;", */
/* "Landroid/graphics/PointF;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final android.util.Property Q;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/Property<", */
/* "Lc/v/n;", */
/* "Landroid/graphics/PointF;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final android.util.Property R;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/Property<", */
/* "Landroid/view/View;", */
/* "Landroid/graphics/PointF;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final android.util.Property S;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/Property<", */
/* "Landroid/view/View;", */
/* "Landroid/graphics/PointF;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final android.util.Property T;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/Property<", */
/* "Landroid/view/View;", */
/* "Landroid/graphics/PointF;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static c.v.c0 U;
/* # instance fields */
public K;
public Boolean L;
public Boolean M;
/* # direct methods */
public static c.v.o ( ) {
/* .locals 5 */
final String v0 = "android:changeBounds:bounds"; // const-string v0, "android:changeBounds:bounds"
final String v1 = "android:changeBounds:clip"; // const-string v1, "android:changeBounds:clip"
final String v2 = "android:changeBounds:parent"; // const-string v2, "android:changeBounds:parent"
final String v3 = "android:changeBounds:windowX"; // const-string v3, "android:changeBounds:windowX"
final String v4 = "android:changeBounds:windowY"; // const-string v4, "android:changeBounds:windowY"
/* .line 1 */
/* filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String; */
/* .line 2 */
/* new-instance v0, Lc/v/e; */
/* const-class v1, Landroid/graphics/PointF; */
final String v2 = "boundsOrigin"; // const-string v2, "boundsOrigin"
/* invoke-direct {v0, v1, v2}, Lc/v/e;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
/* .line 3 */
/* new-instance v0, Lc/v/f; */
/* const-class v1, Landroid/graphics/PointF; */
final String v2 = "topLeft"; // const-string v2, "topLeft"
/* invoke-direct {v0, v1, v2}, Lc/v/f;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
/* .line 4 */
/* new-instance v0, Lc/v/g; */
/* const-class v1, Landroid/graphics/PointF; */
final String v3 = "bottomRight"; // const-string v3, "bottomRight"
/* invoke-direct {v0, v1, v3}, Lc/v/g;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
/* .line 5 */
/* new-instance v0, Lc/v/h; */
/* const-class v1, Landroid/graphics/PointF; */
/* invoke-direct {v0, v1, v3}, Lc/v/h;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
/* .line 6 */
/* new-instance v0, Lc/v/i; */
/* const-class v1, Landroid/graphics/PointF; */
/* invoke-direct {v0, v1, v2}, Lc/v/i;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
/* .line 7 */
/* new-instance v0, Lc/v/j; */
/* const-class v1, Landroid/graphics/PointF; */
final String v2 = "position"; // const-string v2, "position"
/* invoke-direct {v0, v1, v2}, Lc/v/j;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
/* .line 8 */
/* new-instance v0, Lc/v/c0; */
/* invoke-direct {v0}, Lc/v/c0;-><init>()V */
return;
} // .end method
public c.v.o ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lc/v/k0;-><init>()V */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [I */
/* .line 2 */
this.K = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Lc/v/o;->L:Z */
/* .line 4 */
/* iput-boolean v0, p0, Lc/v/o;->M:Z */
return;
} // .end method
/* # virtual methods */
public android.animation.Animator a ( android.view.ViewGroup p0, c.v.u0 p1, c.v.u0 p2 ) {
/* .locals 18 */
/* move-object/from16 v8, p0 */
/* move-object/from16 v0, p2 */
/* move-object/from16 v1, p3 */
if ( v0 != null) { // if-eqz v0, :cond_1b
/* if-nez v1, :cond_0 */
/* goto/16 :goto_c */
/* .line 5 */
} // :cond_0
v3 = this.a;
/* .line 6 */
v4 = this.a;
final String v5 = "android:changeBounds:parent"; // const-string v5, "android:changeBounds:parent"
/* .line 7 */
/* check-cast v3, Landroid/view/ViewGroup; */
/* .line 8 */
/* check-cast v4, Landroid/view/ViewGroup; */
if ( v3 != null) { // if-eqz v3, :cond_1a
/* if-nez v4, :cond_1 */
/* goto/16 :goto_b */
/* .line 9 */
} // :cond_1
v9 = this.b;
/* .line 10 */
v3 = (( c.v.o ) v8 ).a ( v3, v4 ); // invoke-virtual {v8, v3, v4}, Lc/v/o;->a(Landroid/view/View;Landroid/view/View;)Z
if ( v3 != null) { // if-eqz v3, :cond_17
/* .line 11 */
v3 = this.a;
final String v5 = "android:changeBounds:bounds"; // const-string v5, "android:changeBounds:bounds"
/* check-cast v3, Landroid/graphics/Rect; */
/* .line 12 */
v6 = this.a;
/* check-cast v5, Landroid/graphics/Rect; */
/* .line 13 */
/* iget v6, v3, Landroid/graphics/Rect;->left:I */
/* .line 14 */
/* iget v7, v5, Landroid/graphics/Rect;->left:I */
/* .line 15 */
/* iget v11, v3, Landroid/graphics/Rect;->top:I */
/* .line 16 */
/* iget v12, v5, Landroid/graphics/Rect;->top:I */
/* .line 17 */
/* iget v13, v3, Landroid/graphics/Rect;->right:I */
/* .line 18 */
/* iget v14, v5, Landroid/graphics/Rect;->right:I */
/* .line 19 */
/* iget v3, v3, Landroid/graphics/Rect;->bottom:I */
/* .line 20 */
/* iget v15, v5, Landroid/graphics/Rect;->bottom:I */
/* sub-int v5, v13, v6 */
/* sub-int v2, v3, v11 */
/* sub-int v10, v14, v7 */
/* sub-int v4, v15, v12 */
/* .line 21 */
v0 = this.a;
/* move-object/from16 v16, v9 */
final String v9 = "android:changeBounds:clip"; // const-string v9, "android:changeBounds:clip"
/* check-cast v0, Landroid/graphics/Rect; */
/* .line 22 */
v1 = this.a;
/* move-object v9, v1 */
/* check-cast v9, Landroid/graphics/Rect; */
if ( v5 != null) { // if-eqz v5, :cond_2
/* if-nez v2, :cond_3 */
} // :cond_2
if ( v10 != null) { // if-eqz v10, :cond_7
if ( v4 != null) { // if-eqz v4, :cond_7
} // :cond_3
/* if-ne v6, v7, :cond_5 */
/* if-eq v11, v12, :cond_4 */
} // :cond_4
int v1 = 0; // const/4 v1, 0x0
} // :cond_5
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
} // :goto_1
/* if-ne v13, v14, :cond_6 */
/* if-eq v3, v15, :cond_8 */
} // :cond_6
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
int v1 = 0; // const/4 v1, 0x0
} // :cond_8
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 23 */
v17 = (( android.graphics.Rect ) v0 ).equals ( v9 ); // invoke-virtual {v0, v9}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z
if ( v17 != null) { // if-eqz v17, :cond_a
} // :cond_9
/* if-nez v0, :cond_b */
if ( v9 != null) { // if-eqz v9, :cond_b
} // :cond_a
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_b
/* if-lez v1, :cond_18 */
/* move-object/from16 p1, v9 */
/* .line 24 */
/* iget-boolean v9, v8, Lc/v/o;->L:Z */
/* move-object/from16 p2, v0 */
int v0 = 2; // const/4 v0, 0x2
/* if-nez v9, :cond_10 */
/* move-object/from16 v9, v16 */
/* .line 25 */
c.v.j1 .a ( v9,v6,v11,v13,v3 );
/* if-ne v1, v0, :cond_d */
/* if-ne v5, v10, :cond_c */
/* if-ne v2, v4, :cond_c */
/* .line 26 */
/* invoke-virtual/range {p0 ..p0}, Lc/v/k0;->g()Lc/v/y; */
/* int-to-float v1, v6 */
/* int-to-float v2, v11 */
/* int-to-float v3, v7 */
/* int-to-float v4, v12 */
(( c.v.y ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lc/v/y;->a(FFFF)Landroid/graphics/Path;
/* .line 27 */
v1 = c.v.o.T;
c.v.x .a ( v9,v1,v0 );
/* goto/16 :goto_9 */
/* .line 28 */
} // :cond_c
/* new-instance v1, Lc/v/n; */
/* invoke-direct {v1, v9}, Lc/v/n;-><init>(Landroid/view/View;)V */
/* .line 29 */
/* invoke-virtual/range {p0 ..p0}, Lc/v/k0;->g()Lc/v/y; */
/* int-to-float v4, v6 */
/* int-to-float v5, v11 */
/* int-to-float v6, v7 */
/* int-to-float v7, v12 */
(( c.v.y ) v2 ).a ( v4, v5, v6, v7 ); // invoke-virtual {v2, v4, v5, v6, v7}, Lc/v/y;->a(FFFF)Landroid/graphics/Path;
/* .line 30 */
v4 = c.v.o.P;
/* .line 31 */
c.v.x .a ( v1,v4,v2 );
/* .line 32 */
/* invoke-virtual/range {p0 ..p0}, Lc/v/k0;->g()Lc/v/y; */
/* int-to-float v5, v13 */
/* int-to-float v3, v3 */
/* int-to-float v6, v14 */
/* int-to-float v7, v15 */
(( c.v.y ) v4 ).a ( v5, v3, v6, v7 ); // invoke-virtual {v4, v5, v3, v6, v7}, Lc/v/y;->a(FFFF)Landroid/graphics/Path;
/* .line 33 */
v4 = c.v.o.Q;
c.v.x .a ( v1,v4,v3 );
/* .line 34 */
/* new-instance v4, Landroid/animation/AnimatorSet; */
/* invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V */
/* new-array v0, v0, [Landroid/animation/Animator; */
int v5 = 0; // const/4 v5, 0x0
/* aput-object v2, v0, v5 */
int v2 = 1; // const/4 v2, 0x1
/* aput-object v3, v0, v2 */
/* .line 35 */
(( android.animation.AnimatorSet ) v4 ).playTogether ( v0 ); // invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V
/* .line 36 */
/* new-instance v0, Lc/v/k; */
/* invoke-direct {v0, v8, v1}, Lc/v/k;-><init>(Lc/v/o;Lc/v/n;)V */
(( android.animation.AnimatorSet ) v4 ).addListener ( v0 ); // invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V
/* move-object v0, v4 */
/* goto/16 :goto_9 */
} // :cond_d
/* if-ne v6, v7, :cond_f */
/* if-eq v11, v12, :cond_e */
/* .line 37 */
} // :cond_e
/* invoke-virtual/range {p0 ..p0}, Lc/v/k0;->g()Lc/v/y; */
/* int-to-float v1, v13 */
/* int-to-float v2, v3 */
/* int-to-float v3, v14 */
/* int-to-float v4, v15 */
(( c.v.y ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lc/v/y;->a(FFFF)Landroid/graphics/Path;
/* .line 38 */
v1 = c.v.o.R;
c.v.x .a ( v9,v1,v0 );
/* goto/16 :goto_9 */
/* .line 39 */
} // :cond_f
} // :goto_3
/* invoke-virtual/range {p0 ..p0}, Lc/v/k0;->g()Lc/v/y; */
/* int-to-float v1, v6 */
/* int-to-float v2, v11 */
/* int-to-float v3, v7 */
/* int-to-float v4, v12 */
(( c.v.y ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lc/v/y;->a(FFFF)Landroid/graphics/Path;
/* .line 40 */
v1 = c.v.o.S;
c.v.x .a ( v9,v1,v0 );
/* goto/16 :goto_9 */
} // :cond_10
/* move-object/from16 v9, v16 */
/* .line 41 */
v1 = java.lang.Math .max ( v5,v10 );
/* .line 42 */
v3 = java.lang.Math .max ( v2,v4 );
/* add-int/2addr v1, v6 */
/* add-int/2addr v3, v11 */
/* .line 43 */
c.v.j1 .a ( v9,v6,v11,v1,v3 );
/* if-ne v6, v7, :cond_12 */
/* if-eq v11, v12, :cond_11 */
} // :cond_11
int v11 = 0; // const/4 v11, 0x0
/* .line 44 */
} // :cond_12
} // :goto_4
/* invoke-virtual/range {p0 ..p0}, Lc/v/k0;->g()Lc/v/y; */
/* int-to-float v3, v6 */
/* int-to-float v6, v11 */
/* int-to-float v11, v7 */
/* int-to-float v13, v12 */
(( c.v.y ) v1 ).a ( v3, v6, v11, v13 ); // invoke-virtual {v1, v3, v6, v11, v13}, Lc/v/y;->a(FFFF)Landroid/graphics/Path;
/* .line 45 */
v3 = c.v.o.T;
c.v.x .a ( v9,v3,v1 );
/* move-object v11, v1 */
} // :goto_5
/* if-nez p2, :cond_13 */
/* .line 46 */
/* new-instance v1, Landroid/graphics/Rect; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v1, v3, v3, v5, v2}, Landroid/graphics/Rect;-><init>(IIII)V */
} // :cond_13
int v3 = 0; // const/4 v3, 0x0
/* move-object/from16 v1, p2 */
} // :goto_6
/* if-nez p1, :cond_14 */
/* .line 47 */
/* new-instance v2, Landroid/graphics/Rect; */
/* invoke-direct {v2, v3, v3, v10, v4}, Landroid/graphics/Rect;-><init>(IIII)V */
} // :cond_14
/* move-object/from16 v2, p1 */
/* .line 48 */
} // :goto_7
v4 = (( android.graphics.Rect ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_15 */
/* .line 49 */
c.h.n.v0 .a ( v9,v1 );
/* .line 50 */
v4 = c.v.o.U;
/* new-array v0, v0, [Ljava/lang/Object; */
/* aput-object v1, v0, v3 */
int v1 = 1; // const/4 v1, 0x1
/* aput-object v2, v0, v1 */
final String v1 = "clipBounds"; // const-string v1, "clipBounds"
android.animation.ObjectAnimator .ofObject ( v9,v1,v4,v0 );
/* .line 51 */
/* new-instance v13, Lc/v/l; */
/* move-object v0, v13 */
/* move-object/from16 v1, p0 */
/* move-object v2, v9 */
/* move-object/from16 v3, p1 */
/* move v4, v7 */
/* move v5, v12 */
/* move v6, v14 */
/* move v7, v15 */
/* invoke-direct/range {v0 ..v7}, Lc/v/l;-><init>(Lc/v/o;Landroid/view/View;Landroid/graphics/Rect;IIII)V */
(( android.animation.ObjectAnimator ) v10 ).addListener ( v13 ); // invoke-virtual {v10, v13}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
/* move-object v2, v10 */
} // :cond_15
int v2 = 0; // const/4 v2, 0x0
/* .line 52 */
} // :goto_8
c.v.t0 .a ( v11,v2 );
/* .line 53 */
} // :goto_9
(( android.view.View ) v9 ).getParent ( ); // invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* instance-of v1, v1, Landroid/view/ViewGroup; */
if ( v1 != null) { // if-eqz v1, :cond_16
/* .line 54 */
(( android.view.View ) v9 ).getParent ( ); // invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast v1, Landroid/view/ViewGroup; */
int v2 = 1; // const/4 v2, 0x1
/* .line 55 */
c.v.z0 .a ( v1,v2 );
/* .line 56 */
/* new-instance v2, Lc/v/m; */
/* invoke-direct {v2, v8, v1}, Lc/v/m;-><init>(Lc/v/o;Landroid/view/ViewGroup;)V */
/* .line 57 */
(( c.v.k0 ) v8 ).a ( v2 ); // invoke-virtual {v8, v2}, Lc/v/k0;->a(Lc/v/j0;)Lc/v/k0;
} // :cond_16
/* .line 58 */
} // :cond_17
v2 = this.a;
final String v3 = "android:changeBounds:windowX"; // const-string v3, "android:changeBounds:windowX"
/* check-cast v2, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* .line 59 */
v0 = this.a;
final String v4 = "android:changeBounds:windowY"; // const-string v4, "android:changeBounds:windowY"
/* check-cast v0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* .line 60 */
v5 = this.a;
/* check-cast v3, Ljava/lang/Integer; */
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 61 */
v1 = this.a;
/* check-cast v1, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* if-ne v2, v3, :cond_19 */
/* if-eq v0, v1, :cond_18 */
} // :cond_18
int v0 = 0; // const/4 v0, 0x0
/* .line 62 */
} // :cond_19
} // :goto_a
v4 = this.K;
/* move-object/from16 v5, p1 */
(( android.view.ViewGroup ) v5 ).getLocationInWindow ( v4 ); // invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->getLocationInWindow([I)V
/* .line 63 */
v4 = (( android.view.View ) v9 ).getWidth ( ); // invoke-virtual {v9}, Landroid/view/View;->getWidth()I
v6 = (( android.view.View ) v9 ).getHeight ( ); // invoke-virtual {v9}, Landroid/view/View;->getHeight()I
v7 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v4,v6,v7 );
/* .line 64 */
/* new-instance v6, Landroid/graphics/Canvas; */
/* invoke-direct {v6, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 65 */
(( android.view.View ) v9 ).draw ( v6 ); // invoke-virtual {v9, v6}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
/* .line 66 */
/* new-instance v6, Landroid/graphics/drawable/BitmapDrawable; */
/* invoke-direct {v6, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 67 */
v7 = c.v.j1 .c ( v9 );
int v4 = 0; // const/4 v4, 0x0
/* .line 68 */
c.v.j1 .a ( v9,v4 );
/* .line 69 */
/* invoke-static/range {p1 ..p1}, Lc/v/j1;->b(Landroid/view/View;)Lc/v/g1; */
/* .line 70 */
/* invoke-virtual/range {p0 ..p0}, Lc/v/k0;->g()Lc/v/y; */
v10 = this.K;
int v11 = 0; // const/4 v11, 0x0
/* aget v12, v10, v11 */
/* sub-int/2addr v2, v12 */
/* int-to-float v2, v2 */
int v12 = 1; // const/4 v12, 0x1
/* aget v13, v10, v12 */
/* sub-int/2addr v0, v13 */
/* int-to-float v0, v0 */
/* aget v13, v10, v11 */
/* sub-int/2addr v3, v13 */
/* int-to-float v3, v3 */
/* aget v10, v10, v12 */
/* sub-int/2addr v1, v10 */
/* int-to-float v1, v1 */
(( c.v.y ) v4 ).a ( v2, v0, v3, v1 ); // invoke-virtual {v4, v2, v0, v3, v1}, Lc/v/y;->a(FFFF)Landroid/graphics/Path;
/* .line 71 */
v1 = c.v.o.O;
c.v.a0 .a ( v1,v0 );
/* new-array v1, v12, [Landroid/animation/PropertyValuesHolder; */
/* aput-object v0, v1, v11 */
/* .line 72 */
android.animation.ObjectAnimator .ofPropertyValuesHolder ( v6,v1 );
/* .line 73 */
/* new-instance v11, Lc/v/d; */
/* move-object v0, v11 */
/* move-object/from16 v1, p0 */
/* move-object/from16 v2, p1 */
/* move-object v3, v6 */
/* move-object v4, v9 */
/* move v5, v7 */
/* invoke-direct/range {v0 ..v5}, Lc/v/d;-><init>(Lc/v/o;Landroid/view/ViewGroup;Landroid/graphics/drawable/BitmapDrawable;Landroid/view/View;F)V */
(( android.animation.ObjectAnimator ) v10 ).addListener ( v11 ); // invoke-virtual {v10, v11}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V
} // :cond_1a
} // :goto_b
int v0 = 0; // const/4 v0, 0x0
} // :cond_1b
} // :goto_c
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void a ( c.v.u0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.v.o ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/v/o;->d(Lc/v/u0;)V
return;
} // .end method
public final Boolean a ( android.view.View p0, android.view.View p1 ) {
/* .locals 3 */
/* .line 2 */
/* iget-boolean v0, p0, Lc/v/o;->M:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 3 */
(( c.v.k0 ) p0 ).b ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lc/v/k0;->b(Landroid/view/View;Z)Lc/v/u0;
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_1 */
/* if-ne p1, p2, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :cond_1
p1 = this.b;
/* if-ne p2, p1, :cond_0 */
} // :cond_2
} // :goto_0
} // .end method
public void c ( c.v.u0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.v.o ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/v/o;->d(Lc/v/u0;)V
return;
} // .end method
public final void d ( c.v.u0 p0 ) {
/* .locals 7 */
/* .line 1 */
v0 = this.b;
/* .line 2 */
v1 = c.h.n.v0 .D ( v0 );
/* if-nez v1, :cond_0 */
v1 = (( android.view.View ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/View;->getWidth()I
/* if-nez v1, :cond_0 */
v1 = (( android.view.View ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/View;->getHeight()I
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 3 */
} // :cond_0
v1 = this.a;
/* new-instance v2, Landroid/graphics/Rect; */
v3 = (( android.view.View ) v0 ).getLeft ( ); // invoke-virtual {v0}, Landroid/view/View;->getLeft()I
v4 = (( android.view.View ) v0 ).getTop ( ); // invoke-virtual {v0}, Landroid/view/View;->getTop()I
/* .line 4 */
v5 = (( android.view.View ) v0 ).getRight ( ); // invoke-virtual {v0}, Landroid/view/View;->getRight()I
v6 = (( android.view.View ) v0 ).getBottom ( ); // invoke-virtual {v0}, Landroid/view/View;->getBottom()I
/* invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V */
final String v3 = "android:changeBounds:bounds"; // const-string v3, "android:changeBounds:bounds"
/* .line 5 */
/* .line 6 */
v1 = this.a;
v2 = this.b;
(( android.view.View ) v2 ).getParent ( ); // invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
final String v3 = "android:changeBounds:parent"; // const-string v3, "android:changeBounds:parent"
/* .line 7 */
/* iget-boolean v1, p0, Lc/v/o;->M:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 8 */
v1 = this.b;
v2 = this.K;
(( android.view.View ) v1 ).getLocationInWindow ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/View;->getLocationInWindow([I)V
/* .line 9 */
v1 = this.a;
v2 = this.K;
int v3 = 0; // const/4 v3, 0x0
/* aget v2, v2, v3 */
java.lang.Integer .valueOf ( v2 );
final String v3 = "android:changeBounds:windowX"; // const-string v3, "android:changeBounds:windowX"
/* .line 10 */
v1 = this.a;
v2 = this.K;
int v3 = 1; // const/4 v3, 0x1
/* aget v2, v2, v3 */
java.lang.Integer .valueOf ( v2 );
final String v3 = "android:changeBounds:windowY"; // const-string v3, "android:changeBounds:windowY"
/* .line 11 */
} // :cond_1
/* iget-boolean v1, p0, Lc/v/o;->L:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 12 */
p1 = this.a;
c.h.n.v0 .i ( v0 );
final String v1 = "android:changeBounds:clip"; // const-string v1, "android:changeBounds:clip"
} // :cond_2
return;
} // .end method
public java.lang.String n ( ) {
/* .locals 1 */
/* .line 1 */
v0 = c.v.o.N;
} // .end method
