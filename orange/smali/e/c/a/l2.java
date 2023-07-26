public class e.c.a.l2 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static l; //synthetic
	 public static m; //synthetic
	 public static n; //synthetic
	 public static o; //synthetic
	 /* # instance fields */
	 public android.graphics.Canvas a;
	 public e.c.a.n b;
	 public Float c;
	 public Boolean d;
	 public e.c.a.a2 e;
	 public e.c.a.h2 f;
	 public java.util.Stack g;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Stack<", */
	 /* "Le/c/a/h2;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.util.Stack h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Stack<", */
/* "Le/c/a/d1;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.Stack i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Stack<", */
/* "Landroid/graphics/Matrix;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.Stack j;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Stack<", */
/* "Landroid/graphics/Canvas;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.Stack k;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Stack<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.c.a.l2 ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
/* iput p3, p0, Le/c/a/l2;->c:F */
/* .line 4 */
this.b = p2;
return;
} // .end method
public static void a ( Float p0, Float p1, Float p2, Float p3, Float p4, Boolean p5, Boolean p6, Float p7, Float p8, e.c.a.j0 p9 ) { //synthethic
/* .locals 0 */
/* .line 513 */
/* invoke-static/range {p0 ..p9}, Le/c/a/l2;->b(FFFFFZZFFLe/c/a/j0;)V */
return;
} // .end method
public static void a ( java.lang.String p0, java.lang.Object[] p1 ) { //synthethic
/* .locals 0 */
/* .line 38 */
e.c.a.l2 .d ( p0,p1 );
return;
} // .end method
public static Boolean a ( e.c.a.l2 p0 ) { //synthethic
/* .locals 0 */
/* .line 344 */
p0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
} // .end method
public static a ( Double p0, Double p1 ) {
/* .locals 21 */
/* .line 514 */
/* invoke-static/range {p2 ..p3}, Ljava/lang/Math;->abs(D)D */
/* move-result-wide v0 */
/* const-wide v2, 0x4056800000000000L # 90.0 */
/* div-double/2addr v0, v2 */
java.lang.Math .ceil ( v0,v1 );
/* move-result-wide v0 */
/* double-to-int v0, v0 */
/* .line 515 */
/* invoke-static/range {p0 ..p1}, Ljava/lang/Math;->toRadians(D)D */
/* move-result-wide v1 */
/* .line 516 */
/* invoke-static/range {p2 ..p3}, Ljava/lang/Math;->toRadians(D)D */
/* move-result-wide v3 */
/* int-to-double v5, v0 */
/* div-double/2addr v3, v5 */
/* double-to-float v3, v3 */
/* float-to-double v4, v3 */
/* const-wide/high16 v6, 0x4000000000000000L # 2.0 */
/* div-double v6, v4, v6 */
/* .line 517 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v8 */
/* const-wide v10, 0x3ff5555555555555L # 1.3333333333333333 */
/* mul-double v8, v8, v10 */
java.lang.Math .cos ( v6,v7 );
/* move-result-wide v6 */
/* const-wide/high16 v10, 0x3ff0000000000000L # 1.0 */
/* add-double/2addr v6, v10 */
/* div-double/2addr v8, v6 */
/* mul-int/lit8 v6, v0, 0x6 */
/* .line 518 */
/* new-array v6, v6, [F */
int v7 = 0; // const/4 v7, 0x0
int v10 = 0; // const/4 v10, 0x0
} // :goto_0
/* if-lt v7, v0, :cond_0 */
} // :cond_0
/* int-to-float v11, v7 */
/* mul-float v11, v11, v3 */
/* float-to-double v11, v11 */
/* add-double/2addr v11, v1 */
/* .line 519 */
java.lang.Math .cos ( v11,v12 );
/* move-result-wide v13 */
/* .line 520 */
java.lang.Math .sin ( v11,v12 );
/* move-result-wide v15 */
/* add-int/lit8 v17, v10, 0x1 */
/* mul-double v18, v8, v15 */
/* move/from16 v20, v0 */
/* move-wide/from16 p0, v1 */
/* sub-double v0, v13, v18 */
/* double-to-float v0, v0 */
/* .line 521 */
/* aput v0, v6, v10 */
/* add-int/lit8 v0, v17, 0x1 */
/* mul-double v13, v13, v8 */
/* add-double v1, v15, v13 */
/* double-to-float v1, v1 */
/* .line 522 */
/* aput v1, v6, v17 */
/* add-double/2addr v11, v4 */
/* .line 523 */
java.lang.Math .cos ( v11,v12 );
/* move-result-wide v1 */
/* .line 524 */
java.lang.Math .sin ( v11,v12 );
/* move-result-wide v10 */
/* add-int/lit8 v12, v0, 0x1 */
/* mul-double v13, v8, v10 */
/* add-double/2addr v13, v1 */
/* double-to-float v13, v13 */
/* .line 525 */
/* aput v13, v6, v0 */
/* add-int/lit8 v0, v12, 0x1 */
/* mul-double v13, v8, v1 */
/* sub-double v13, v10, v13 */
/* double-to-float v13, v13 */
/* .line 526 */
/* aput v13, v6, v12 */
/* add-int/lit8 v12, v0, 0x1 */
/* double-to-float v1, v1 */
/* .line 527 */
/* aput v1, v6, v0 */
/* add-int/lit8 v0, v12, 0x1 */
/* double-to-float v1, v10 */
/* .line 528 */
/* aput v1, v6, v12 */
/* add-int/lit8 v7, v7, 0x1 */
/* move-wide/from16 v1, p0 */
/* move v10, v0 */
/* move/from16 v0, v20 */
} // .end method
public static e.c.a.h2 b ( e.c.a.l2 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.f;
} // .end method
public static void b ( Float p0, Float p1, Float p2, Float p3, Float p4, Boolean p5, Boolean p6, Float p7, Float p8, e.c.a.j0 p9 ) {
/* .locals 31 */
/* move/from16 v0, p4 */
/* move/from16 v1, p6 */
/* move/from16 v2, p7 */
/* move/from16 v3, p8 */
/* cmpl-float v4, p0, v2 */
/* if-nez v4, :cond_0 */
/* cmpl-float v4, p1, v3 */
/* if-nez v4, :cond_0 */
return;
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* cmpl-float v5, p2, v4 */
if ( v5 != null) { // if-eqz v5, :cond_a
/* cmpl-float v4, p3, v4 */
/* if-nez v4, :cond_1 */
/* goto/16 :goto_4 */
/* .line 88 */
} // :cond_1
v4 = /* invoke-static/range {p2 ..p2}, Ljava/lang/Math;->abs(F)F */
/* .line 89 */
v5 = /* invoke-static/range {p3 ..p3}, Ljava/lang/Math;->abs(F)F */
/* float-to-double v6, v0 */
/* const-wide v8, 0x4076800000000000L # 360.0 */
/* rem-double/2addr v6, v8 */
/* .line 90 */
java.lang.Math .toRadians ( v6,v7 );
/* move-result-wide v6 */
/* double-to-float v6, v6 */
/* float-to-double v6, v6 */
/* .line 91 */
java.lang.Math .cos ( v6,v7 );
/* move-result-wide v10 */
/* .line 92 */
java.lang.Math .sin ( v6,v7 );
/* move-result-wide v6 */
/* sub-float v12, p0, v2 */
/* float-to-double v12, v12 */
/* const-wide/high16 v14, 0x4000000000000000L # 2.0 */
/* div-double/2addr v12, v14 */
/* sub-float v8, p1, v3 */
/* float-to-double v8, v8 */
/* div-double/2addr v8, v14 */
/* mul-double v16, v10, v12 */
/* mul-double v18, v6, v8 */
/* add-double v14, v16, v18 */
/* neg-double v2, v6 */
/* mul-double v2, v2, v12 */
/* mul-double v8, v8, v10 */
/* add-double/2addr v2, v8 */
/* mul-float v8, v4, v4 */
/* float-to-double v8, v8 */
/* mul-float v12, v5, v5 */
/* float-to-double v12, v12 */
/* mul-double v16, v14, v14 */
/* mul-double v18, v2, v2 */
/* div-double v22, v16, v8 */
/* div-double v24, v18, v12 */
/* add-double v22, v22, v24 */
/* const-wide/high16 v24, 0x3ff0000000000000L # 1.0 */
/* cmpl-double v26, v22, v24 */
/* if-lez v26, :cond_2 */
/* .line 93 */
/* invoke-static/range {v22 ..v23}, Ljava/lang/Math;->sqrt(D)D */
/* move-result-wide v8 */
/* double-to-float v8, v8 */
/* mul-float v4, v4, v8 */
/* .line 94 */
/* invoke-static/range {v22 ..v23}, Ljava/lang/Math;->sqrt(D)D */
/* move-result-wide v8 */
/* double-to-float v8, v8 */
/* mul-float v5, v5, v8 */
/* mul-float v8, v4, v4 */
/* float-to-double v8, v8 */
/* mul-float v12, v5, v5 */
/* float-to-double v12, v12 */
} // :cond_2
/* const/16 v22, 0x1 */
/* move/from16 v0, p5 */
/* if-ne v0, v1, :cond_3 */
int v0 = -1; // const/4 v0, -0x1
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* int-to-double v0, v0 */
/* mul-double v26, v8, v12 */
/* mul-double v8, v8, v18 */
/* sub-double v26, v26, v8 */
/* mul-double v12, v12, v16 */
/* sub-double v26, v26, v12 */
/* add-double/2addr v8, v12 */
/* div-double v26, v26, v8 */
/* const-wide/16 v8, 0x0 */
/* cmpg-double v12, v26, v8 */
/* if-gez v12, :cond_4 */
/* move-wide/from16 v26, v8 */
/* .line 95 */
} // :cond_4
/* invoke-static/range {v26 ..v27}, Ljava/lang/Math;->sqrt(D)D */
/* move-result-wide v12 */
/* mul-double v0, v0, v12 */
/* float-to-double v12, v4 */
/* mul-double v16, v12, v2 */
/* float-to-double v8, v5 */
/* div-double v16, v16, v8 */
/* mul-double v16, v16, v0 */
/* mul-double v26, v8, v14 */
/* move/from16 v23, v4 */
/* move/from16 v28, v5 */
/* div-double v4, v26, v12 */
/* neg-double v4, v4 */
/* mul-double v0, v0, v4 */
/* move/from16 v4, p7 */
/* add-float v5, p0, v4 */
/* float-to-double v4, v5 */
/* const-wide/high16 v20, 0x4000000000000000L # 2.0 */
/* div-double v4, v4, v20 */
/* move-wide/from16 v26, v8 */
/* move/from16 v8, p8 */
/* add-float v9, p1, v8 */
/* float-to-double v8, v9 */
/* div-double v8, v8, v20 */
/* mul-double v20, v10, v16 */
/* mul-double v29, v6, v0 */
/* sub-double v20, v20, v29 */
/* add-double v4, v4, v20 */
/* mul-double v6, v6, v16 */
/* mul-double v10, v10, v0 */
/* add-double/2addr v6, v10 */
/* add-double/2addr v8, v6 */
/* sub-double v6, v14, v16 */
/* div-double/2addr v6, v12 */
/* sub-double v10, v2, v0 */
/* div-double v10, v10, v26 */
/* neg-double v14, v14 */
/* sub-double v14, v14, v16 */
/* div-double/2addr v14, v12 */
/* neg-double v2, v2 */
/* sub-double/2addr v2, v0 */
/* div-double v2, v2, v26 */
/* mul-double v0, v6, v6 */
/* mul-double v12, v10, v10 */
/* add-double/2addr v0, v12 */
/* .line 96 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v12 */
/* const-wide/high16 v16, -0x4010000000000000L # -1.0 */
/* const-wide/16 v18, 0x0 */
/* cmpg-double v20, v10, v18 */
/* if-gez v20, :cond_5 */
/* move-wide/from16 v20, v16 */
} // :cond_5
/* move-wide/from16 v20, v24 */
} // :goto_1
/* div-double v12, v6, v12 */
/* .line 97 */
java.lang.Math .acos ( v12,v13 );
/* move-result-wide v12 */
/* mul-double v20, v20, v12 */
/* invoke-static/range {v20 ..v21}, Ljava/lang/Math;->toDegrees(D)D */
/* move-result-wide v12 */
/* mul-double v20, v14, v14 */
/* mul-double v26, v2, v2 */
/* add-double v20, v20, v26 */
/* mul-double v0, v0, v20 */
/* .line 98 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* mul-double v20, v6, v14 */
/* mul-double v26, v10, v2 */
/* add-double v20, v20, v26 */
/* mul-double v6, v6, v2 */
/* mul-double v10, v10, v14 */
/* sub-double/2addr v6, v10 */
/* const-wide/16 v2, 0x0 */
/* cmpg-double v10, v6, v2 */
/* if-gez v10, :cond_6 */
/* move-wide/from16 v24, v16 */
} // :cond_6
/* div-double v20, v20, v0 */
/* .line 99 */
/* invoke-static/range {v20 ..v21}, Ljava/lang/Math;->acos(D)D */
/* move-result-wide v0 */
/* mul-double v24, v24, v0 */
/* invoke-static/range {v24 ..v25}, Ljava/lang/Math;->toDegrees(D)D */
/* move-result-wide v0 */
/* if-nez p6, :cond_7 */
/* cmpl-double v6, v0, v2 */
/* if-lez v6, :cond_7 */
/* const-wide v6, 0x4076800000000000L # 360.0 */
/* sub-double/2addr v0, v6 */
} // :cond_7
/* const-wide v6, 0x4076800000000000L # 360.0 */
if ( p6 != null) { // if-eqz p6, :cond_8
/* cmpg-double v10, v0, v2 */
/* if-gez v10, :cond_8 */
/* add-double/2addr v0, v6 */
} // :cond_8
} // :goto_2
/* rem-double/2addr v0, v6 */
/* rem-double/2addr v12, v6 */
/* .line 100 */
e.c.a.l2 .a ( v12,v13,v0,v1 );
/* .line 101 */
/* new-instance v1, Landroid/graphics/Matrix; */
/* invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V */
/* move/from16 v2, v23 */
/* move/from16 v3, v28 */
/* .line 102 */
(( android.graphics.Matrix ) v1 ).postScale ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postScale(FF)Z
/* move/from16 v2, p4 */
/* .line 103 */
(( android.graphics.Matrix ) v1 ).postRotate ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postRotate(F)Z
/* double-to-float v2, v4 */
/* double-to-float v3, v8 */
/* .line 104 */
(( android.graphics.Matrix ) v1 ).postTranslate ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z
/* .line 105 */
(( android.graphics.Matrix ) v1 ).mapPoints ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V
/* .line 106 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x2 */
/* move/from16 v2, p7 */
/* aput v2, v0, v1 */
/* .line 107 */
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* move/from16 v3, p8 */
/* aput v3, v0, v1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 108 */
} // :goto_3
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_9 */
return;
/* .line 109 */
} // :cond_9
/* aget v2, v0, v1 */
/* add-int/lit8 v3, v1, 0x1 */
/* aget v3, v0, v3 */
/* add-int/lit8 v4, v1, 0x2 */
/* aget v4, v0, v4 */
/* add-int/lit8 v5, v1, 0x3 */
/* aget v5, v0, v5 */
/* add-int/lit8 v6, v1, 0x4 */
/* aget v6, v0, v6 */
/* add-int/lit8 v7, v1, 0x5 */
/* aget v7, v0, v7 */
/* move-object/from16 p0, p9 */
/* move/from16 p1, v2 */
/* move/from16 p2, v3 */
/* move/from16 p3, v4 */
/* move/from16 p4, v5 */
/* move/from16 p5, v6 */
/* move/from16 p6, v7 */
/* invoke-interface/range {p0 ..p6}, Le/c/a/j0;->a(FFFFFF)V */
/* add-int/lit8 v1, v1, 0x6 */
} // :cond_a
} // :goto_4
/* move-object/from16 v0, p9 */
/* .line 110 */
return;
} // .end method
public static void b ( java.lang.String p0, java.lang.Object[] p1 ) { //synthethic
/* .locals 0 */
/* .line 17 */
e.c.a.l2 .e ( p0,p1 );
return;
} // .end method
public static android.graphics.Canvas c ( e.c.a.l2 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.a;
} // .end method
public static void c ( java.lang.String p0, java.lang.Object[] p1 ) { //synthethic
/* .locals 0 */
/* .line 32 */
e.c.a.l2 .f ( p0,p1 );
return;
} // .end method
public static void d ( java.lang.String p0, java.lang.Object...p1 ) {
/* .locals 0 */
return;
} // .end method
public static void e ( java.lang.String p0, java.lang.Object...p1 ) {
/* .locals 0 */
/* .line 1 */
java.lang.String .format ( p0,p1 );
final String p1 = "SVGAndroidRenderer"; // const-string p1, "SVGAndroidRenderer"
android.util.Log .e ( p1,p0 );
return;
} // .end method
public static void f ( java.lang.String p0, java.lang.Object...p1 ) {
/* .locals 0 */
/* .line 1 */
java.lang.String .format ( p0,p1 );
final String p1 = "SVGAndroidRenderer"; // const-string p1, "SVGAndroidRenderer"
android.util.Log .w ( p1,p0 );
return;
} // .end method
public static u ( ) { //synthethic
/* .locals 3 */
/* .line 1 */
v0 = e.c.a.l2.l;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
e.c.a.k .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
v1 = e.c.a.k.b;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 1; // const/4 v2, 0x1
/* aput v2, v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
try { // :try_start_1
v1 = e.c.a.k.k;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* const/16 v2, 0xa */
/* aput v2, v0, v1 */
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
try { // :try_start_2
v1 = e.c.a.k.h;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 7; // const/4 v2, 0x7
/* aput v2, v0, v1 */
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
try { // :try_start_3
v1 = e.c.a.k.e;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 4; // const/4 v2, 0x4
/* aput v2, v0, v1 */
/* :try_end_3 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_3 */
/* :catch_3 */
try { // :try_start_4
v1 = e.c.a.k.j;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* const/16 v2, 0x9 */
/* aput v2, v0, v1 */
/* :try_end_4 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_4 ..:try_end_4} :catch_4 */
/* :catch_4 */
try { // :try_start_5
v1 = e.c.a.k.g;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 6; // const/4 v2, 0x6
/* aput v2, v0, v1 */
/* :try_end_5 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_5 ..:try_end_5} :catch_5 */
/* :catch_5 */
try { // :try_start_6
v1 = e.c.a.k.d;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 3; // const/4 v2, 0x3
/* aput v2, v0, v1 */
/* :try_end_6 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_6 ..:try_end_6} :catch_6 */
/* :catch_6 */
try { // :try_start_7
v1 = e.c.a.k.i;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* const/16 v2, 0x8 */
/* aput v2, v0, v1 */
/* :try_end_7 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_7 ..:try_end_7} :catch_7 */
/* :catch_7 */
try { // :try_start_8
v1 = e.c.a.k.f;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 5; // const/4 v2, 0x5
/* aput v2, v0, v1 */
/* :try_end_8 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_8 ..:try_end_8} :catch_8 */
/* :catch_8 */
try { // :try_start_9
v1 = e.c.a.k.c;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 2; // const/4 v2, 0x2
/* aput v2, v0, v1 */
/* :try_end_9 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_9 ..:try_end_9} :catch_9 */
/* :catch_9 */
} // .end method
public static v ( ) { //synthethic
/* .locals 3 */
/* .line 1 */
v0 = e.c.a.l2.o;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
e.c.a.q0 .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
v1 = e.c.a.q0.c;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 2; // const/4 v2, 0x2
/* aput v2, v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
try { // :try_start_1
v1 = e.c.a.q0.b;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 1; // const/4 v2, 0x1
/* aput v2, v0, v1 */
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
} // .end method
public static w ( ) { //synthethic
/* .locals 3 */
/* .line 1 */
v0 = e.c.a.l2.m;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
e.c.a.s0 .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
v1 = e.c.a.s0.b;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 1; // const/4 v2, 0x1
/* aput v2, v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
try { // :try_start_1
v1 = e.c.a.s0.c;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 2; // const/4 v2, 0x2
/* aput v2, v0, v1 */
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
try { // :try_start_2
v1 = e.c.a.s0.d;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 3; // const/4 v2, 0x3
/* aput v2, v0, v1 */
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
} // .end method
public static x ( ) { //synthethic
/* .locals 3 */
/* .line 1 */
v0 = e.c.a.l2.n;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
e.c.a.t0 .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
v1 = e.c.a.t0.d;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 3; // const/4 v2, 0x3
/* aput v2, v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
try { // :try_start_1
v1 = e.c.a.t0.b;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 1; // const/4 v2, 0x1
/* aput v2, v0, v1 */
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
try { // :try_start_2
v1 = e.c.a.t0.c;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
int v2 = 2; // const/4 v2, 0x2
/* aput v2, v0, v1 */
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
} // .end method
/* # virtual methods */
public final Float a ( e.c.a.s1 p0 ) {
/* .locals 2 */
/* .line 275 */
/* new-instance v0, Le/c/a/k2; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Le/c/a/k2;-><init>(Le/c/a/l2;Le/c/a/k2;)V */
/* .line 276 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V
/* .line 277 */
/* iget p1, v0, Le/c/a/k2;->a:F */
} // .end method
public final Integer a ( Float p0 ) {
/* .locals 1 */
/* const/high16 v0, 0x43800000 # 256.0f */
/* mul-float p1, p1, v0 */
/* float-to-int p1, p1 */
/* const/16 v0, 0xff */
/* if-gez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* if-le p1, v0, :cond_1 */
/* const/16 p1, 0xff */
} // :cond_1
} // :goto_0
} // .end method
public final android.graphics.Bitmap a ( java.lang.String p0 ) {
/* .locals 4 */
final String v0 = "data:"; // const-string v0, "data:"
/* .line 338 */
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 339 */
} // :cond_0
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* const/16 v2, 0xe */
/* if-ge v0, v2, :cond_1 */
} // :cond_1
/* const/16 v0, 0x2c */
/* .line 340 */
v0 = (( java.lang.String ) p1 ).indexOf ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v0, v2, :cond_4 */
/* const/16 v2, 0xc */
/* if-ge v0, v2, :cond_2 */
} // :cond_2
/* add-int/lit8 v2, v0, -0x7 */
/* .line 341 */
(( java.lang.String ) p1 ).substring ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
final String v3 = ";base64"; // const-string v3, ";base64"
v2 = (( java.lang.String ) v3 ).equals ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_3 */
} // :cond_3
/* add-int/lit8 v0, v0, 0x1 */
/* .line 342 */
(( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
android.util.Base64 .decode ( p1,v0 );
/* .line 343 */
/* array-length v1, p1 */
android.graphics.BitmapFactory .decodeByteArray ( p1,v0,v1 );
} // :cond_4
} // :goto_0
} // .end method
public final android.graphics.Matrix a ( Object p0, Object p1, Object p2 ) {
/* .locals 9 */
/* .line 345 */
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 346 */
(( e.c.a.m ) p3 ).a ( ); // invoke-virtual {p3}, Le/c/a/m;->a()Le/c/a/k;
/* if-nez v1, :cond_0 */
/* goto/16 :goto_5 */
/* .line 347 */
} // :cond_0
/* iget v1, p1, Le/c/a/n;->d:F */
/* iget v2, p2, Le/c/a/n;->d:F */
/* div-float/2addr v1, v2 */
/* .line 348 */
/* iget v2, p1, Le/c/a/n;->e:F */
/* iget v3, p2, Le/c/a/n;->e:F */
/* div-float/2addr v2, v3 */
/* .line 349 */
/* iget v3, p2, Le/c/a/n;->b:F */
/* neg-float v3, v3 */
/* .line 350 */
/* iget v4, p2, Le/c/a/n;->c:F */
/* neg-float v4, v4 */
/* .line 351 */
v5 = e.c.a.m.c;
v5 = (( e.c.a.m ) p3 ).equals ( v5 ); // invoke-virtual {p3, v5}, Le/c/a/m;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 352 */
/* iget p2, p1, Le/c/a/n;->b:F */
/* iget p1, p1, Le/c/a/n;->c:F */
(( android.graphics.Matrix ) v0 ).preTranslate ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 353 */
(( android.graphics.Matrix ) v0 ).preScale ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preScale(FF)Z
/* .line 354 */
(( android.graphics.Matrix ) v0 ).preTranslate ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 355 */
} // :cond_1
(( e.c.a.m ) p3 ).b ( ); // invoke-virtual {p3}, Le/c/a/m;->b()Le/c/a/l;
v6 = e.c.a.l.c;
/* if-ne v5, v6, :cond_2 */
v1 = java.lang.Math .max ( v1,v2 );
} // :cond_2
v1 = java.lang.Math .min ( v1,v2 );
/* .line 356 */
} // :goto_0
/* iget v2, p1, Le/c/a/n;->d:F */
/* div-float/2addr v2, v1 */
/* .line 357 */
/* iget v5, p1, Le/c/a/n;->e:F */
/* div-float/2addr v5, v1 */
/* .line 358 */
e.c.a.l2 .u ( );
(( e.c.a.m ) p3 ).a ( ); // invoke-virtual {p3}, Le/c/a/m;->a()Le/c/a/k;
v7 = (( java.lang.Enum ) v7 ).ordinal ( ); // invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I
/* aget v6, v6, v7 */
int v7 = 3; // const/4 v7, 0x3
/* const/high16 v8, 0x40000000 # 2.0f */
/* if-eq v6, v7, :cond_4 */
int v7 = 4; // const/4 v7, 0x4
/* if-eq v6, v7, :cond_3 */
int v7 = 6; // const/4 v7, 0x6
/* if-eq v6, v7, :cond_4 */
int v7 = 7; // const/4 v7, 0x7
/* if-eq v6, v7, :cond_3 */
/* const/16 v7, 0x9 */
/* if-eq v6, v7, :cond_4 */
/* const/16 v7, 0xa */
/* if-eq v6, v7, :cond_3 */
/* .line 359 */
} // :cond_3
/* iget v6, p2, Le/c/a/n;->d:F */
/* sub-float/2addr v6, v2 */
/* .line 360 */
} // :cond_4
/* iget v6, p2, Le/c/a/n;->d:F */
/* sub-float/2addr v6, v2 */
/* div-float/2addr v6, v8 */
} // :goto_1
/* sub-float/2addr v3, v6 */
/* .line 361 */
} // :goto_2
e.c.a.l2 .u ( );
/* .line 362 */
(( e.c.a.m ) p3 ).a ( ); // invoke-virtual {p3}, Le/c/a/m;->a()Le/c/a/k;
p3 = (( java.lang.Enum ) p3 ).ordinal ( ); // invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I
/* aget p3, v2, p3 */
/* packed-switch p3, :pswitch_data_0 */
/* .line 363 */
/* :pswitch_0 */
/* iget p2, p2, Le/c/a/n;->e:F */
/* sub-float/2addr p2, v5 */
/* .line 364 */
/* :pswitch_1 */
/* iget p2, p2, Le/c/a/n;->e:F */
/* sub-float/2addr p2, v5 */
/* div-float/2addr p2, v8 */
} // :goto_3
/* sub-float/2addr v4, p2 */
/* .line 365 */
} // :goto_4
/* iget p2, p1, Le/c/a/n;->b:F */
/* iget p1, p1, Le/c/a/n;->c:F */
(( android.graphics.Matrix ) v0 ).preTranslate ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 366 */
(( android.graphics.Matrix ) v0 ).preScale ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->preScale(FF)Z
/* .line 367 */
(( android.graphics.Matrix ) v0 ).preTranslate ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z
} // :cond_5
} // :goto_5
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x5 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public final android.graphics.Path a ( e.c.a.n0 p0 ) {
/* .locals 23 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* .line 865 */
v2 = this.s;
int v3 = 0; // const/4 v3, 0x0
/* if-nez v2, :cond_0 */
v2 = this.t;
/* if-nez v2, :cond_0 */
int v2 = 0; // const/4 v2, 0x0
int v4 = 0; // const/4 v4, 0x0
/* .line 866 */
} // :cond_0
v2 = this.s;
/* if-nez v2, :cond_1 */
/* .line 867 */
v2 = this.t;
v2 = (( e.c.a.b0 ) v2 ).c ( v0 ); // invoke-virtual {v2, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :goto_0
/* move v4, v2 */
/* .line 868 */
} // :cond_1
v4 = this.t;
/* if-nez v4, :cond_2 */
/* .line 869 */
v2 = (( e.c.a.b0 ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* .line 870 */
} // :cond_2
v2 = (( e.c.a.b0 ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* .line 871 */
v4 = this.t;
v4 = (( e.c.a.b0 ) v4 ).c ( v0 ); // invoke-virtual {v4, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 872 */
} // :goto_1
v5 = this.q;
v5 = (( e.c.a.b0 ) v5 ).b ( v0 ); // invoke-virtual {v5, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* const/high16 v6, 0x40000000 # 2.0f */
/* div-float/2addr v5, v6 */
v2 = java.lang.Math .min ( v2,v5 );
/* .line 873 */
v5 = this.r;
v5 = (( e.c.a.b0 ) v5 ).c ( v0 ); // invoke-virtual {v5, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* div-float/2addr v5, v6 */
v4 = java.lang.Math .min ( v4,v5 );
/* .line 874 */
v5 = this.o;
if ( v5 != null) { // if-eqz v5, :cond_3
v5 = (( e.c.a.b0 ) v5 ).b ( v0 ); // invoke-virtual {v5, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_3
int v5 = 0; // const/4 v5, 0x0
/* .line 875 */
} // :goto_2
v6 = this.p;
if ( v6 != null) { // if-eqz v6, :cond_4
v6 = (( e.c.a.b0 ) v6 ).c ( v0 ); // invoke-virtual {v6, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* move v13, v6 */
} // :cond_4
int v13 = 0; // const/4 v13, 0x0
/* .line 876 */
} // :goto_3
v6 = this.q;
v6 = (( e.c.a.b0 ) v6 ).b ( v0 ); // invoke-virtual {v6, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* .line 877 */
v7 = this.r;
v7 = (( e.c.a.b0 ) v7 ).c ( v0 ); // invoke-virtual {v7, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 878 */
v8 = this.h;
/* if-nez v8, :cond_5 */
/* .line 879 */
/* new-instance v8, Le/c/a/n; */
/* invoke-direct {v8, v5, v13, v6, v7}, Le/c/a/n;-><init>(FFFF)V */
this.h = v8;
} // :cond_5
/* add-float v15, v5, v6 */
/* add-float v1, v13, v7 */
/* .line 880 */
/* new-instance v14, Landroid/graphics/Path; */
/* invoke-direct {v14}, Landroid/graphics/Path;-><init>()V */
/* cmpl-float v6, v2, v3 */
if ( v6 != null) { // if-eqz v6, :cond_7
/* cmpl-float v3, v4, v3 */
/* if-nez v3, :cond_6 */
/* goto/16 :goto_4 */
} // :cond_6
/* const v3, 0x3f0d6289 */
/* mul-float v16, v2, v3 */
/* mul-float v3, v3, v4 */
/* add-float v12, v13, v4 */
/* .line 881 */
(( android.graphics.Path ) v14 ).moveTo ( v5, v12 ); // invoke-virtual {v14, v5, v12}, Landroid/graphics/Path;->moveTo(FF)V
/* sub-float v17, v12, v3 */
/* add-float v11, v5, v2 */
/* sub-float v21, v11, v16 */
/* move-object v6, v14 */
/* move v7, v5 */
/* move/from16 v8, v17 */
/* move/from16 v9, v21 */
/* move v10, v13 */
/* move/from16 p1, v11 */
/* move/from16 v22, v12 */
/* move v12, v13 */
/* .line 882 */
/* invoke-virtual/range {v6 ..v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* sub-float v2, v15, v2 */
/* .line 883 */
(( android.graphics.Path ) v14 ).lineTo ( v2, v13 ); // invoke-virtual {v14, v2, v13}, Landroid/graphics/Path;->lineTo(FF)V
/* add-float v6, v2, v16 */
/* move-object v7, v14 */
/* move v8, v6 */
/* move v9, v13 */
/* move v10, v15 */
/* move/from16 v11, v17 */
/* move v12, v15 */
/* move/from16 v13, v22 */
/* .line 884 */
/* invoke-virtual/range {v7 ..v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* sub-float v12, v1, v4 */
/* .line 885 */
(( android.graphics.Path ) v14 ).lineTo ( v15, v12 ); // invoke-virtual {v14, v15, v12}, Landroid/graphics/Path;->lineTo(FF)V
/* add-float v10, v12, v3 */
/* move-object v3, v14 */
/* move/from16 v16, v10 */
/* move/from16 v17, v6 */
/* move/from16 v18, v1 */
/* move/from16 v19, v2 */
/* move/from16 v20, v1 */
/* .line 886 */
/* invoke-virtual/range {v14 ..v20}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* move/from16 v2, p1 */
/* .line 887 */
(( android.graphics.Path ) v3 ).lineTo ( v2, v1 ); // invoke-virtual {v3, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V
/* move-object v6, v3 */
/* move/from16 v7, v21 */
/* move v8, v1 */
/* move v9, v5 */
/* move v11, v5 */
/* .line 888 */
/* invoke-virtual/range {v6 ..v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* .line 889 */
(( android.graphics.Path ) v3 ).lineTo ( v5, v13 ); // invoke-virtual {v3, v5, v13}, Landroid/graphics/Path;->lineTo(FF)V
} // :cond_7
} // :goto_4
/* move-object v3, v14 */
/* .line 890 */
(( android.graphics.Path ) v3 ).moveTo ( v5, v13 ); // invoke-virtual {v3, v5, v13}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 891 */
(( android.graphics.Path ) v3 ).lineTo ( v15, v13 ); // invoke-virtual {v3, v15, v13}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 892 */
(( android.graphics.Path ) v3 ).lineTo ( v15, v1 ); // invoke-virtual {v3, v15, v1}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 893 */
(( android.graphics.Path ) v3 ).lineTo ( v5, v1 ); // invoke-virtual {v3, v5, v1}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 894 */
(( android.graphics.Path ) v3 ).lineTo ( v5, v13 ); // invoke-virtual {v3, v5, v13}, Landroid/graphics/Path;->lineTo(FF)V
/* .line 895 */
} // :goto_5
(( android.graphics.Path ) v3 ).close ( ); // invoke-virtual {v3}, Landroid/graphics/Path;->close()V
} // .end method
public final android.graphics.Path a ( Object p0 ) {
/* .locals 19 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* .line 896 */
v2 = this.o;
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = (( e.c.a.b0 ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 897 */
} // :goto_0
v4 = this.p;
if ( v4 != null) { // if-eqz v4, :cond_1
v3 = (( e.c.a.b0 ) v4 ).c ( v0 ); // invoke-virtual {v4, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 898 */
} // :cond_1
v4 = this.q;
v4 = (( e.c.a.b0 ) v4 ).a ( v0 ); // invoke-virtual {v4, v0}, Le/c/a/b0;->a(Le/c/a/l2;)F
/* sub-float v11, v2, v4 */
/* sub-float v12, v3, v4 */
/* add-float v13, v2, v4 */
/* add-float v14, v3, v4 */
/* .line 899 */
v5 = this.h;
/* if-nez v5, :cond_2 */
/* .line 900 */
/* new-instance v5, Le/c/a/n; */
/* const/high16 v6, 0x40000000 # 2.0f */
/* mul-float v6, v6, v4 */
/* invoke-direct {v5, v11, v12, v6, v6}, Le/c/a/n;-><init>(FFFF)V */
this.h = v5;
} // :cond_2
/* const v1, 0x3f0d6289 */
/* mul-float v1, v1, v4 */
/* .line 901 */
/* new-instance v15, Landroid/graphics/Path; */
/* invoke-direct {v15}, Landroid/graphics/Path;-><init>()V */
/* .line 902 */
(( android.graphics.Path ) v15 ).moveTo ( v2, v12 ); // invoke-virtual {v15, v2, v12}, Landroid/graphics/Path;->moveTo(FF)V
/* add-float v16, v2, v1 */
/* sub-float v17, v3, v1 */
/* move-object v4, v15 */
/* move/from16 v5, v16 */
/* move v6, v12 */
/* move v7, v13 */
/* move/from16 v8, v17 */
/* move v9, v13 */
/* move v10, v3 */
/* .line 903 */
/* invoke-virtual/range {v4 ..v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* add-float v18, v3, v1 */
/* move v5, v13 */
/* move/from16 v6, v18 */
/* move/from16 v7, v16 */
/* move v8, v14 */
/* move v9, v2 */
/* move v10, v14 */
/* .line 904 */
/* invoke-virtual/range {v4 ..v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* sub-float v1, v2, v1 */
/* move v5, v1 */
/* move v6, v14 */
/* move v7, v11 */
/* move/from16 v8, v18 */
/* move v9, v11 */
/* move v10, v3 */
/* .line 905 */
/* invoke-virtual/range {v4 ..v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* move v5, v11 */
/* move/from16 v6, v17 */
/* move v7, v1 */
/* move v8, v12 */
/* move v9, v2 */
/* move v10, v12 */
/* .line 906 */
/* invoke-virtual/range {v4 ..v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* .line 907 */
(( android.graphics.Path ) v15 ).close ( ); // invoke-virtual {v15}, Landroid/graphics/Path;->close()V
} // .end method
public final android.graphics.Path a ( Object p0 ) {
/* .locals 19 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* .line 908 */
v2 = this.o;
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = (( e.c.a.b0 ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 909 */
} // :goto_0
v4 = this.p;
if ( v4 != null) { // if-eqz v4, :cond_1
v3 = (( e.c.a.b0 ) v4 ).c ( v0 ); // invoke-virtual {v4, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 910 */
} // :cond_1
v4 = this.q;
v4 = (( e.c.a.b0 ) v4 ).b ( v0 ); // invoke-virtual {v4, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* .line 911 */
v5 = this.r;
v5 = (( e.c.a.b0 ) v5 ).c ( v0 ); // invoke-virtual {v5, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* sub-float v11, v2, v4 */
/* sub-float v12, v3, v5 */
/* add-float v13, v2, v4 */
/* add-float v14, v3, v5 */
/* .line 912 */
v6 = this.h;
/* if-nez v6, :cond_2 */
/* .line 913 */
/* new-instance v6, Le/c/a/n; */
/* const/high16 v7, 0x40000000 # 2.0f */
/* mul-float v8, v4, v7 */
/* mul-float v7, v7, v5 */
/* invoke-direct {v6, v11, v12, v8, v7}, Le/c/a/n;-><init>(FFFF)V */
this.h = v6;
} // :cond_2
/* const v1, 0x3f0d6289 */
/* mul-float v15, v4, v1 */
/* mul-float v1, v1, v5 */
/* .line 914 */
/* new-instance v10, Landroid/graphics/Path; */
/* invoke-direct {v10}, Landroid/graphics/Path;-><init>()V */
/* .line 915 */
(( android.graphics.Path ) v10 ).moveTo ( v2, v12 ); // invoke-virtual {v10, v2, v12}, Landroid/graphics/Path;->moveTo(FF)V
/* add-float v16, v2, v15 */
/* sub-float v17, v3, v1 */
/* move-object v4, v10 */
/* move/from16 v5, v16 */
/* move v6, v12 */
/* move v7, v13 */
/* move/from16 v8, v17 */
/* move v9, v13 */
/* move-object/from16 v18, v10 */
/* move v10, v3 */
/* .line 916 */
/* invoke-virtual/range {v4 ..v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* add-float/2addr v1, v3 */
/* move-object/from16 v4, v18 */
/* move v5, v13 */
/* move v6, v1 */
/* move/from16 v7, v16 */
/* move v8, v14 */
/* move v9, v2 */
/* move v10, v14 */
/* .line 917 */
/* invoke-virtual/range {v4 ..v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* sub-float v13, v2, v15 */
/* move v5, v13 */
/* move v6, v14 */
/* move v7, v11 */
/* move v8, v1 */
/* move v9, v11 */
/* move v10, v3 */
/* .line 918 */
/* invoke-virtual/range {v4 ..v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* move v5, v11 */
/* move/from16 v6, v17 */
/* move v7, v13 */
/* move v8, v12 */
/* move v9, v2 */
/* move v10, v12 */
/* .line 919 */
/* invoke-virtual/range {v4 ..v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
/* .line 920 */
/* invoke-virtual/range {v18 ..v18}, Landroid/graphics/Path;->close()V */
} // .end method
public final android.graphics.Typeface a ( java.lang.String p0, java.lang.Integer p1, e.c.a.r0 p2 ) {
/* .locals 3 */
/* .line 495 */
v0 = e.c.a.r0.c;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-ne p3, v0, :cond_0 */
int p3 = 1; // const/4 p3, 0x1
} // :cond_0
int p3 = 0; // const/4 p3, 0x0
/* .line 496 */
} // :goto_0
p2 = (( java.lang.Integer ) p2 ).intValue ( ); // invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
/* const/16 v0, 0x1f4 */
/* if-le p2, v0, :cond_1 */
if ( p3 != null) { // if-eqz p3, :cond_3
int v1 = 3; // const/4 v1, 0x3
} // :cond_1
if ( p3 != null) { // if-eqz p3, :cond_2
int v1 = 2; // const/4 v1, 0x2
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :cond_3
} // :goto_1
final String p2 = "serif"; // const-string p2, "serif"
/* .line 497 */
p2 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 498 */
p1 = android.graphics.Typeface.SERIF;
android.graphics.Typeface .create ( p1,v1 );
} // :cond_4
final String p2 = "sans-serif"; // const-string p2, "sans-serif"
/* .line 499 */
p2 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_5
/* .line 500 */
p1 = android.graphics.Typeface.SANS_SERIF;
android.graphics.Typeface .create ( p1,v1 );
} // :cond_5
final String p2 = "monospace"; // const-string p2, "monospace"
/* .line 501 */
p2 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 502 */
p1 = android.graphics.Typeface.MONOSPACE;
android.graphics.Typeface .create ( p1,v1 );
} // :cond_6
final String p2 = "cursive"; // const-string p2, "cursive"
/* .line 503 */
p2 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 504 */
p1 = android.graphics.Typeface.SANS_SERIF;
android.graphics.Typeface .create ( p1,v1 );
} // :cond_7
final String p2 = "fantasy"; // const-string p2, "fantasy"
/* .line 505 */
p1 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 506 */
p1 = android.graphics.Typeface.SANS_SERIF;
android.graphics.Typeface .create ( p1,v1 );
} // :cond_8
int p1 = 0; // const/4 p1, 0x0
} // :goto_2
} // .end method
public final e.c.a.h2 a ( e.c.a.h1 p0, e.c.a.h2 p1 ) {
/* .locals 3 */
/* .line 594 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 595 */
} // :goto_0
/* instance-of v1, p1, Le/c/a/f1; */
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 596 */
/* move-object v2, p1 */
/* check-cast v2, Le/c/a/f1; */
/* .line 597 */
} // :cond_0
p1 = this.b;
/* if-nez p1, :cond_3 */
/* .line 598 */
p1 = } // :goto_1
/* if-nez p1, :cond_2 */
/* .line 599 */
p1 = this.e;
(( e.c.a.a2 ) p1 ).f ( ); // invoke-virtual {p1}, Le/c/a/a2;->f()Le/c/a/z0;
p1 = this.o;
this.h = p1;
/* if-nez p1, :cond_1 */
/* .line 600 */
p1 = this.b;
this.h = p1;
/* .line 601 */
} // :cond_1
p1 = this.b;
this.g = p1;
/* .line 602 */
p1 = this.f;
/* iget-boolean p1, p1, Le/c/a/h2;->j:Z */
/* iput-boolean p1, p2, Le/c/a/h2;->j:Z */
/* .line 603 */
} // :cond_2
/* check-cast p1, Le/c/a/f1; */
/* .line 604 */
(( e.c.a.l2 ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 605 */
} // :cond_3
/* check-cast p1, Le/c/a/h1; */
} // .end method
public final e.c.a.n a ( android.graphics.Path p0 ) {
/* .locals 4 */
/* .line 140 */
/* new-instance v0, Landroid/graphics/RectF; */
/* invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V */
int v1 = 1; // const/4 v1, 0x1
/* .line 141 */
(( android.graphics.Path ) p1 ).computeBounds ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V
/* .line 142 */
/* new-instance p1, Le/c/a/n; */
/* iget v1, v0, Landroid/graphics/RectF;->left:F */
/* iget v2, v0, Landroid/graphics/RectF;->top:F */
v3 = (( android.graphics.RectF ) v0 ).width ( ); // invoke-virtual {v0}, Landroid/graphics/RectF;->width()F
v0 = (( android.graphics.RectF ) v0 ).height ( ); // invoke-virtual {v0}, Landroid/graphics/RectF;->height()F
/* invoke-direct {p1, v1, v2, v3, v0}, Le/c/a/n;-><init>(FFFF)V */
} // .end method
public final java.lang.String a ( java.lang.String p0, Boolean p1, Boolean p2 ) {
/* .locals 3 */
/* .line 285 */
v0 = this.f;
/* iget-boolean v0, v0, Le/c/a/h2;->i:Z */
final String v1 = " "; // const-string v1, " "
if ( v0 != null) { // if-eqz v0, :cond_0
final String p2 = "[\\n\\t]"; // const-string p2, "[\\n\\t]"
/* .line 286 */
(( java.lang.String ) p1 ).replaceAll ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
final String v0 = ""; // const-string v0, ""
final String v2 = "\\n"; // const-string v2, "\\n"
/* .line 287 */
(( java.lang.String ) p1 ).replaceAll ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
final String v2 = "\\t"; // const-string v2, "\\t"
/* .line 288 */
(( java.lang.String ) p1 ).replaceAll ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
if ( p2 != null) { // if-eqz p2, :cond_1
final String p2 = "^\\s+"; // const-string p2, "^\\s+"
/* .line 289 */
(( java.lang.String ) p1 ).replaceAll ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // :cond_1
if ( p3 != null) { // if-eqz p3, :cond_2
final String p2 = "\\s+$"; // const-string p2, "\\s+$"
/* .line 290 */
(( java.lang.String ) p1 ).replaceAll ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // :cond_2
final String p2 = "\\s{2,}"; // const-string p2, "\\s{2,}"
/* .line 291 */
(( java.lang.String ) p1 ).replaceAll ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public final java.util.List a ( e.c.a.c0 p0 ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/c/a/c0;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/c/a/c2;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 143 */
v0 = this.o;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( e.c.a.b0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* move v4, v0 */
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 144 */
} // :goto_0
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( e.c.a.b0 ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* move v5, v0 */
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
/* .line 145 */
} // :goto_1
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = (( e.c.a.b0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* move v8, v0 */
} // :cond_2
int v8 = 0; // const/4 v8, 0x0
/* .line 146 */
} // :goto_2
p1 = this.r;
if ( p1 != null) { // if-eqz p1, :cond_3
v1 = (( e.c.a.b0 ) p1 ).c ( p0 ); // invoke-virtual {p1, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* move v9, v1 */
} // :cond_3
int v9 = 0; // const/4 v9, 0x0
/* .line 147 */
} // :goto_3
/* new-instance p1, Ljava/util/ArrayList; */
int v0 = 2; // const/4 v0, 0x2
/* invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 148 */
/* new-instance v0, Le/c/a/c2; */
/* sub-float v10, v8, v4 */
/* sub-float v11, v9, v5 */
/* move-object v2, v0 */
/* move-object v3, p0 */
/* move v6, v10 */
/* move v7, v11 */
/* invoke-direct/range {v2 ..v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V */
/* .line 149 */
/* new-instance v0, Le/c/a/c2; */
/* move-object v6, v0 */
/* move-object v7, p0 */
/* invoke-direct/range {v6 ..v11}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V */
} // .end method
public final java.util.List a ( e.c.a.l0 p0 ) {
/* .locals 20 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/c/a/l0;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/c/a/c2;", */
/* ">;" */
/* } */
} // .end annotation
/* move-object/from16 v0, p1 */
/* .line 150 */
v1 = this.o;
/* array-length v1, v1 */
int v2 = 2; // const/4 v2, 0x2
/* if-ge v1, v2, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 151 */
} // :cond_0
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
/* .line 152 */
/* new-instance v10, Le/c/a/c2; */
v4 = this.o;
int v11 = 0; // const/4 v11, 0x0
/* aget v6, v4, v11 */
int v12 = 1; // const/4 v12, 0x1
/* aget v7, v4, v12 */
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
/* move-object v4, v10 */
/* move-object/from16 v5, p0 */
/* invoke-direct/range {v4 ..v9}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-lt v2, v1, :cond_3 */
/* .line 153 */
/* instance-of v1, v0, Le/c/a/m0; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 154 */
v0 = this.o;
/* aget v1, v0, v11 */
/* cmpl-float v1, v4, v1 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* aget v1, v0, v12 */
/* cmpl-float v1, v5, v1 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 155 */
/* aget v6, v0, v11 */
/* .line 156 */
/* aget v7, v0, v12 */
/* .line 157 */
(( e.c.a.c2 ) v10 ).a ( v6, v7 ); // invoke-virtual {v10, v6, v7}, Le/c/a/c2;->a(FF)V
/* .line 158 */
/* .line 159 */
/* new-instance v0, Le/c/a/c2; */
/* iget v1, v10, Le/c/a/c2;->a:F */
/* sub-float v8, v6, v1 */
/* iget v1, v10, Le/c/a/c2;->b:F */
/* sub-float v9, v7, v1 */
/* move-object v4, v0 */
/* move-object/from16 v5, p0 */
/* invoke-direct/range {v4 ..v9}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V */
/* .line 160 */
/* check-cast v1, Le/c/a/c2; */
(( e.c.a.c2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/c/a/c2;->a(Le/c/a/c2;)V
/* .line 161 */
/* .line 162 */
/* .line 163 */
} // :cond_1
} // :cond_2
} // :goto_1
/* .line 164 */
} // :cond_3
v4 = this.o;
/* aget v5, v4, v2 */
/* add-int/lit8 v6, v2, 0x1 */
/* .line 165 */
/* aget v4, v4, v6 */
/* .line 166 */
(( e.c.a.c2 ) v10 ).a ( v5, v4 ); // invoke-virtual {v10, v5, v4}, Le/c/a/c2;->a(FF)V
/* .line 167 */
/* .line 168 */
/* new-instance v6, Le/c/a/c2; */
/* iget v7, v10, Le/c/a/c2;->a:F */
/* sub-float v17, v5, v7 */
/* iget v7, v10, Le/c/a/c2;->b:F */
/* sub-float v18, v4, v7 */
/* move-object v13, v6 */
/* move-object/from16 v14, p0 */
/* move v15, v5 */
/* move/from16 v16, v4 */
/* invoke-direct/range {v13 ..v18}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V */
/* add-int/lit8 v2, v2, 0x2 */
/* move-object v10, v6 */
/* move/from16 v19, v5 */
/* move v5, v4 */
/* move/from16 v4, v19 */
} // .end method
public final void a ( ) {
/* .locals 1 */
/* .line 807 */
v0 = this.a;
(( android.graphics.Canvas ) v0 ).restore ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V
/* .line 808 */
v0 = this.g;
(( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* check-cast v0, Le/c/a/h2; */
this.f = v0;
return;
} // .end method
public final void a ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 1 */
/* add-float/2addr p3, p1 */
/* add-float/2addr p4, p2 */
/* .line 507 */
v0 = this.f;
v0 = this.b;
v0 = this.x;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 508 */
v0 = this.d;
v0 = (( e.c.a.b0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* add-float/2addr p1, v0 */
/* .line 509 */
v0 = this.f;
v0 = this.b;
v0 = this.x;
v0 = this.a;
v0 = (( e.c.a.b0 ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* add-float/2addr p2, v0 */
/* .line 510 */
v0 = this.f;
v0 = this.b;
v0 = this.x;
v0 = this.b;
v0 = (( e.c.a.b0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* sub-float/2addr p3, v0 */
/* .line 511 */
v0 = this.f;
v0 = this.b;
v0 = this.x;
v0 = this.c;
v0 = (( e.c.a.b0 ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* sub-float/2addr p4, v0 */
/* .line 512 */
} // :cond_0
v0 = this.a;
(( android.graphics.Canvas ) v0 ).clipRect ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z
return;
} // .end method
public final void a ( e.c.a.a0 p0 ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v1, v0, [Ljava/lang/Object; */
final String v2 = "Image render"; // const-string v2, "Image render"
/* .line 309 */
e.c.a.l2 .d ( v2,v1 );
/* .line 310 */
v1 = this.r;
if ( v1 != null) { // if-eqz v1, :cond_c
v1 = (( e.c.a.b0 ) v1 ).d ( ); // invoke-virtual {v1}, Le/c/a/b0;->d()Z
/* if-nez v1, :cond_c */
/* .line 311 */
v1 = this.s;
if ( v1 != null) { // if-eqz v1, :cond_c
v1 = (( e.c.a.b0 ) v1 ).d ( ); // invoke-virtual {v1}, Le/c/a/b0;->d()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* goto/16 :goto_3 */
/* .line 312 */
} // :cond_0
v1 = this.o;
/* if-nez v1, :cond_1 */
return;
/* .line 313 */
} // :cond_1
v1 = this.n;
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_2
v1 = e.c.a.m.d;
/* .line 314 */
} // :goto_0
v2 = this.o;
(( e.c.a.l2 ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/c/a/l2;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;
/* if-nez v2, :cond_4 */
/* .line 315 */
v2 = this.e;
(( e.c.a.a2 ) v2 ).e ( ); // invoke-virtual {v2}, Le/c/a/a2;->e()Le/c/a/m2;
/* if-nez v2, :cond_3 */
return;
/* .line 316 */
} // :cond_3
v3 = this.o;
(( e.c.a.m2 ) v2 ).b ( v3 ); // invoke-virtual {v2, v3}, Le/c/a/m2;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;
} // :cond_4
/* if-nez v2, :cond_5 */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
/* .line 317 */
p1 = this.o;
/* aput-object p1, v1, v0 */
final String p1 = "Could not locate image \'%s\'"; // const-string p1, "Could not locate image \'%s\'"
e.c.a.l2 .e ( p1,v1 );
return;
/* .line 318 */
} // :cond_5
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 319 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_6 */
return;
/* .line 320 */
} // :cond_6
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_7 */
return;
/* .line 321 */
} // :cond_7
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 322 */
v3 = this.a;
(( android.graphics.Canvas ) v3 ).concat ( v0 ); // invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 323 */
} // :cond_8
v0 = this.p;
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_9
v0 = (( e.c.a.b0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_9
int v0 = 0; // const/4 v0, 0x0
/* .line 324 */
} // :goto_1
v4 = this.q;
if ( v4 != null) { // if-eqz v4, :cond_a
v4 = (( e.c.a.b0 ) v4 ).c ( p0 ); // invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_a
int v4 = 0; // const/4 v4, 0x0
/* .line 325 */
} // :goto_2
v5 = this.r;
v5 = (( e.c.a.b0 ) v5 ).b ( p0 ); // invoke-virtual {v5, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* .line 326 */
v6 = this.s;
v6 = (( e.c.a.b0 ) v6 ).b ( p0 ); // invoke-virtual {v6, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* .line 327 */
v7 = this.f;
/* new-instance v8, Le/c/a/n; */
/* invoke-direct {v8, v0, v4, v5, v6}, Le/c/a/n;-><init>(FFFF)V */
this.g = v8;
/* .line 328 */
v0 = this.f;
v0 = this.b;
v0 = this.w;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v0, :cond_b */
/* .line 329 */
v0 = this.f;
v0 = this.g;
/* iget v4, v0, Le/c/a/n;->b:F */
/* iget v5, v0, Le/c/a/n;->c:F */
/* iget v6, v0, Le/c/a/n;->d:F */
/* iget v0, v0, Le/c/a/n;->e:F */
(( e.c.a.l2 ) p0 ).a ( v4, v5, v6, v0 ); // invoke-virtual {p0, v4, v5, v6, v0}, Le/c/a/l2;->a(FFFF)V
/* .line 330 */
} // :cond_b
/* new-instance v0, Le/c/a/n; */
v4 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v4, v4 */
v5 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v5, v5 */
/* invoke-direct {v0, v3, v3, v4, v5}, Le/c/a/n;-><init>(FFFF)V */
this.h = v0;
/* .line 331 */
v4 = this.a;
v5 = this.f;
v5 = this.g;
(( e.c.a.l2 ) p0 ).a ( v5, v0, v1 ); // invoke-virtual {p0, v5, v0, v1}, Le/c/a/l2;->a(Le/c/a/n;Le/c/a/n;Le/c/a/m;)Landroid/graphics/Matrix;
(( android.graphics.Canvas ) v4 ).concat ( v0 ); // invoke-virtual {v4, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 332 */
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
/* .line 333 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 334 */
v0 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 335 */
(( e.c.a.l2 ) p0 ).s ( ); // invoke-virtual {p0}, Le/c/a/l2;->s()V
/* .line 336 */
v1 = this.a;
v4 = this.f;
v4 = this.e;
(( android.graphics.Canvas ) v1 ).drawBitmap ( v2, v3, v3, v4 ); // invoke-virtual {v1, v2, v3, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 337 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_c
} // :goto_3
return;
} // .end method
public void a ( e.c.a.a2 p0, Object p1, Object p2, Boolean p3 ) {
/* .locals 6 */
/* .line 1 */
this.e = p1;
/* .line 2 */
/* iput-boolean p4, p0, Le/c/a/l2;->d:Z */
/* .line 3 */
(( e.c.a.a2 ) p1 ).f ( ); // invoke-virtual {p1}, Le/c/a/a2;->f()Le/c/a/z0;
/* if-nez v1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* new-array p1, p1, [Ljava/lang/Object; */
final String p2 = "Nothing to render.Document is empty."; // const-string p2, "Nothing to render.Document is empty."
/* .line 4 */
e.c.a.l2 .f ( p2,p1 );
return;
/* .line 5 */
} // :cond_0
(( e.c.a.l2 ) p0 ).p ( ); // invoke-virtual {p0}, Le/c/a/l2;->p()V
/* .line 6 */
(( e.c.a.l2 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/c/a/l2;->a(Le/c/a/h1;)V
/* .line 7 */
v2 = this.r;
v3 = this.s;
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 8 */
} // :cond_1
p2 = this.o;
} // :goto_0
/* move-object v4, p2 */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 9 */
} // :cond_2
p3 = this.n;
} // :goto_1
/* move-object v5, p3 */
/* move-object v0, p0 */
/* .line 10 */
/* invoke-virtual/range {v0 ..v5}, Le/c/a/l2;->a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;Le/c/a/n;Le/c/a/m;)V */
return;
} // .end method
public final void a ( e.c.a.d0 p0, e.c.a.c2 p1 ) {
/* .locals 11 */
/* .line 552 */
(( e.c.a.l2 ) p0 ).r ( ); // invoke-virtual {p0}, Le/c/a/l2;->r()V
/* .line 553 */
v0 = this.u;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 554 */
v0 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
v0 = java.lang.Float .isNaN ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 555 */
/* iget v0, p2, Le/c/a/c2;->c:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
/* iget v0, p2, Le/c/a/c2;->d:F */
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 556 */
} // :cond_0
/* iget v0, p2, Le/c/a/c2;->d:F */
/* float-to-double v2, v0 */
/* iget v0, p2, Le/c/a/c2;->c:F */
/* float-to-double v4, v0 */
java.lang.Math .atan2 ( v2,v3,v4,v5 );
/* move-result-wide v2 */
java.lang.Math .toDegrees ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v0, v2 */
/* .line 557 */
} // :cond_1
v0 = this.u;
v0 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 558 */
} // :goto_0
/* iget-boolean v2, p1, Le/c/a/d0;->p:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
/* const/high16 v2, 0x3f800000 # 1.0f */
} // :cond_3
v2 = this.f;
v2 = this.b;
v2 = this.h;
/* iget v3, p0, Le/c/a/l2;->c:F */
v2 = (( e.c.a.b0 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/c/a/b0;->a(F)F
/* .line 559 */
} // :goto_1
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;
this.f = v3;
/* .line 560 */
/* new-instance v3, Landroid/graphics/Matrix; */
/* invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V */
/* .line 561 */
/* iget v4, p2, Le/c/a/c2;->a:F */
/* iget p2, p2, Le/c/a/c2;->b:F */
(( android.graphics.Matrix ) v3 ).preTranslate ( v4, p2 ); // invoke-virtual {v3, v4, p2}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 562 */
(( android.graphics.Matrix ) v3 ).preRotate ( v0 ); // invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->preRotate(F)Z
/* .line 563 */
(( android.graphics.Matrix ) v3 ).preScale ( v2, v2 ); // invoke-virtual {v3, v2, v2}, Landroid/graphics/Matrix;->preScale(FF)Z
/* .line 564 */
p2 = this.q;
if ( p2 != null) { // if-eqz p2, :cond_4
p2 = (( e.c.a.b0 ) p2 ).b ( p0 ); // invoke-virtual {p2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_4
int p2 = 0; // const/4 p2, 0x0
/* .line 565 */
} // :goto_2
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = (( e.c.a.b0 ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
/* .line 566 */
} // :goto_3
v2 = this.s;
/* const/high16 v4, 0x40400000 # 3.0f */
if ( v2 != null) { // if-eqz v2, :cond_6
v2 = (( e.c.a.b0 ) v2 ).b ( p0 ); // invoke-virtual {v2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_6
/* const/high16 v2, 0x40400000 # 3.0f */
/* .line 567 */
} // :goto_4
v5 = this.t;
if ( v5 != null) { // if-eqz v5, :cond_7
v4 = (( e.c.a.b0 ) v5 ).c ( p0 ); // invoke-virtual {v5, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 568 */
} // :cond_7
v5 = this.o;
if ( v5 != null) { // if-eqz v5, :cond_e
/* .line 569 */
/* iget v6, v5, Le/c/a/n;->d:F */
/* div-float v6, v2, v6 */
/* .line 570 */
/* iget v5, v5, Le/c/a/n;->e:F */
/* div-float v5, v4, v5 */
/* .line 571 */
v7 = this.n;
if ( v7 != null) { // if-eqz v7, :cond_8
} // :cond_8
v7 = e.c.a.m.d;
/* .line 572 */
} // :goto_5
v8 = e.c.a.m.c;
v8 = (( e.c.a.m ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Le/c/a/m;->equals(Ljava/lang/Object;)Z
/* if-nez v8, :cond_a */
/* .line 573 */
(( e.c.a.m ) v7 ).b ( ); // invoke-virtual {v7}, Le/c/a/m;->b()Le/c/a/l;
v9 = e.c.a.l.c;
/* if-ne v8, v9, :cond_9 */
v5 = java.lang.Math .max ( v6,v5 );
} // :cond_9
v5 = java.lang.Math .min ( v6,v5 );
} // :goto_6
/* move v6, v5 */
/* move v5, v6 */
} // :cond_a
/* neg-float p2, p2 */
/* mul-float p2, p2, v6 */
/* neg-float v0, v0 */
/* mul-float v0, v0, v5 */
/* .line 574 */
(( android.graphics.Matrix ) v3 ).preTranslate ( p2, v0 ); // invoke-virtual {v3, p2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 575 */
p2 = this.a;
(( android.graphics.Canvas ) p2 ).concat ( v3 ); // invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 576 */
p2 = this.o;
/* iget v0, p2, Le/c/a/n;->d:F */
/* mul-float v0, v0, v6 */
/* .line 577 */
/* iget p2, p2, Le/c/a/n;->e:F */
/* mul-float p2, p2, v5 */
/* .line 578 */
e.c.a.l2 .u ( );
(( e.c.a.m ) v7 ).a ( ); // invoke-virtual {v7}, Le/c/a/m;->a()Le/c/a/k;
v9 = (( java.lang.Enum ) v9 ).ordinal ( ); // invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I
/* aget v8, v8, v9 */
int v9 = 3; // const/4 v9, 0x3
/* const/high16 v10, 0x40000000 # 2.0f */
/* if-eq v8, v9, :cond_c */
int v9 = 4; // const/4 v9, 0x4
/* if-eq v8, v9, :cond_b */
int v9 = 6; // const/4 v9, 0x6
/* if-eq v8, v9, :cond_c */
int v9 = 7; // const/4 v9, 0x7
/* if-eq v8, v9, :cond_b */
/* const/16 v9, 0x9 */
/* if-eq v8, v9, :cond_c */
/* const/16 v9, 0xa */
/* if-eq v8, v9, :cond_b */
int v0 = 0; // const/4 v0, 0x0
} // :cond_b
/* sub-float v0, v2, v0 */
} // :cond_c
/* sub-float v0, v2, v0 */
/* div-float/2addr v0, v10 */
} // :goto_7
/* sub-float v0, v1, v0 */
/* .line 579 */
} // :goto_8
e.c.a.l2 .u ( );
/* .line 580 */
(( e.c.a.m ) v7 ).a ( ); // invoke-virtual {v7}, Le/c/a/m;->a()Le/c/a/k;
v7 = (( java.lang.Enum ) v7 ).ordinal ( ); // invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I
/* aget v7, v8, v7 */
/* packed-switch v7, :pswitch_data_0 */
/* :pswitch_0 */
/* sub-float p2, v4, p2 */
/* :pswitch_1 */
/* sub-float p2, v4, p2 */
/* div-float/2addr p2, v10 */
} // :goto_9
/* sub-float/2addr v1, p2 */
/* .line 581 */
} // :goto_a
p2 = this.f;
p2 = this.b;
p2 = this.w;
p2 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p2, :cond_d */
/* .line 582 */
(( e.c.a.l2 ) p0 ).a ( v0, v1, v2, v4 ); // invoke-virtual {p0, v0, v1, v2, v4}, Le/c/a/l2;->a(FFFF)V
/* .line 583 */
} // :cond_d
(( android.graphics.Matrix ) v3 ).reset ( ); // invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V
/* .line 584 */
(( android.graphics.Matrix ) v3 ).preScale ( v6, v5 ); // invoke-virtual {v3, v6, v5}, Landroid/graphics/Matrix;->preScale(FF)Z
/* .line 585 */
p2 = this.a;
(( android.graphics.Canvas ) p2 ).concat ( v3 ); // invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
} // :cond_e
/* neg-float p2, p2 */
/* neg-float v0, v0 */
/* .line 586 */
(( android.graphics.Matrix ) v3 ).preTranslate ( p2, v0 ); // invoke-virtual {v3, p2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 587 */
p2 = this.a;
(( android.graphics.Canvas ) p2 ).concat ( v3 ); // invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 588 */
p2 = this.f;
p2 = this.b;
p2 = this.w;
p2 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p2, :cond_f */
/* .line 589 */
(( e.c.a.l2 ) p0 ).a ( v1, v1, v2, v4 ); // invoke-virtual {p0, v1, v1, v2, v4}, Le/c/a/l2;->a(FFFF)V
/* .line 590 */
} // :cond_f
} // :goto_b
p2 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
int v0 = 0; // const/4 v0, 0x0
/* .line 591 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/d1;Z)V
if ( p2 != null) { // if-eqz p2, :cond_10
/* .line 592 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
/* .line 593 */
} // :cond_10
(( e.c.a.l2 ) p0 ).q ( ); // invoke-virtual {p0}, Le/c/a/l2;->q()V
return;
/* :pswitch_data_0 */
/* .packed-switch 0x5 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public final void a ( e.c.a.d1 p0 ) {
/* .locals 1 */
/* .line 16 */
v0 = this.h;
(( java.util.Stack ) v0 ).push ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 17 */
p1 = this.i;
v0 = this.a;
(( android.graphics.Canvas ) v0 ).getMatrix ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;
(( java.util.Stack ) p1 ).push ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public final void a ( e.c.a.d1 p0, Boolean p1 ) {
/* .locals 1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 11 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/d1;)V
/* .line 12 */
} // :cond_0
v0 = } // :goto_0
/* if-nez v0, :cond_2 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 13 */
(( e.c.a.l2 ) p0 ).l ( ); // invoke-virtual {p0}, Le/c/a/l2;->l()V
} // :cond_1
return;
/* .line 14 */
} // :cond_2
/* check-cast v0, Le/c/a/h1; */
/* .line 15 */
(( e.c.a.l2 ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->c(Le/c/a/h1;)V
} // .end method
public final void a ( e.c.a.e0 p0, e.c.a.e1 p1 ) {
/* .locals 8 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v1, v0, [Ljava/lang/Object; */
final String v2 = "Mask render"; // const-string v2, "Mask render"
/* .line 1007 */
e.c.a.l2 .d ( v2,v1 );
/* .line 1008 */
v1 = this.n;
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* const/high16 v3, 0x3f800000 # 1.0f */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 1009 */
v1 = this.r;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = (( e.c.a.b0 ) v1 ).b ( p0 ); // invoke-virtual {v1, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_1
v1 = this.h;
/* iget v1, v1, Le/c/a/n;->d:F */
/* .line 1010 */
} // :goto_1
v4 = this.s;
if ( v4 != null) { // if-eqz v4, :cond_2
v4 = (( e.c.a.b0 ) v4 ).c ( p0 ); // invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_2
v4 = this.h;
/* iget v4, v4, Le/c/a/n;->e:F */
/* .line 1011 */
} // :goto_2
v5 = this.p;
if ( v5 != null) { // if-eqz v5, :cond_3
(( e.c.a.b0 ) v5 ).b ( p0 ); // invoke-virtual {v5, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_3
v5 = this.h;
/* iget v6, v5, Le/c/a/n;->b:F */
/* iget v5, v5, Le/c/a/n;->d:F */
/* .line 1012 */
} // :goto_3
v5 = this.q;
if ( v5 != null) { // if-eqz v5, :cond_4
(( e.c.a.b0 ) v5 ).c ( p0 ); // invoke-virtual {v5, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_4
v5 = this.h;
/* iget v6, v5, Le/c/a/n;->c:F */
/* iget v5, v5, Le/c/a/n;->e:F */
/* .line 1013 */
} // :cond_5
v1 = this.p;
if ( v1 != null) { // if-eqz v1, :cond_6
(( e.c.a.b0 ) v1 ).a ( p0, v3 ); // invoke-virtual {v1, p0, v3}, Le/c/a/b0;->a(Le/c/a/l2;F)F
/* .line 1014 */
} // :cond_6
v1 = this.q;
if ( v1 != null) { // if-eqz v1, :cond_7
(( e.c.a.b0 ) v1 ).a ( p0, v3 ); // invoke-virtual {v1, p0, v3}, Le/c/a/b0;->a(Le/c/a/l2;F)F
/* .line 1015 */
} // :cond_7
v1 = this.r;
/* const v4, 0x3f99999a # 1.2f */
if ( v1 != null) { // if-eqz v1, :cond_8
v1 = (( e.c.a.b0 ) v1 ).a ( p0, v3 ); // invoke-virtual {v1, p0, v3}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_8
/* const v1, 0x3f99999a # 1.2f */
/* .line 1016 */
} // :goto_4
v5 = this.s;
if ( v5 != null) { // if-eqz v5, :cond_9
v4 = (( e.c.a.b0 ) v5 ).a ( p0, v3 ); // invoke-virtual {v5, p0, v3}, Le/c/a/b0;->a(Le/c/a/l2;F)F
/* .line 1017 */
} // :cond_9
v5 = this.h;
/* iget v6, v5, Le/c/a/n;->b:F */
/* iget v6, v5, Le/c/a/n;->d:F */
/* .line 1018 */
/* iget v7, v5, Le/c/a/n;->c:F */
/* iget v5, v5, Le/c/a/n;->e:F */
/* mul-float v1, v1, v6 */
/* mul-float v4, v4, v5 */
} // :goto_5
int v5 = 0; // const/4 v5, 0x0
/* cmpl-float v1, v1, v5 */
if ( v1 != null) { // if-eqz v1, :cond_d
/* cmpl-float v1, v4, v5 */
/* if-nez v1, :cond_a */
/* .line 1019 */
} // :cond_a
(( e.c.a.l2 ) p0 ).r ( ); // invoke-virtual {p0}, Le/c/a/l2;->r()V
/* .line 1020 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;
this.f = v1;
/* .line 1021 */
v1 = this.b;
java.lang.Float .valueOf ( v3 );
this.n = v3;
/* .line 1022 */
v1 = this.o;
if ( v1 != null) { // if-eqz v1, :cond_b
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v1, :cond_b */
int v2 = 0; // const/4 v2, 0x0
} // :cond_b
/* if-nez v2, :cond_c */
/* .line 1023 */
v1 = this.a;
v2 = this.h;
/* iget v3, v2, Le/c/a/n;->b:F */
/* iget v2, v2, Le/c/a/n;->c:F */
(( android.graphics.Canvas ) v1 ).translate ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 1024 */
v1 = this.a;
p2 = this.h;
/* iget v2, p2, Le/c/a/n;->d:F */
/* iget p2, p2, Le/c/a/n;->e:F */
(( android.graphics.Canvas ) v1 ).scale ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/graphics/Canvas;->scale(FF)V
/* .line 1025 */
} // :cond_c
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/d1;Z)V
/* .line 1026 */
(( e.c.a.l2 ) p0 ).q ( ); // invoke-virtual {p0}, Le/c/a/l2;->q()V
} // :cond_d
} // :goto_6
return;
} // .end method
public final void a ( e.c.a.e1 p0 ) {
/* .locals 1 */
/* .line 769 */
v0 = this.h;
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Le/c/a/n;)V
return;
} // .end method
public final void a ( e.c.a.e1 p0, android.graphics.Path p1 ) {
/* .locals 2 */
/* .line 32 */
v0 = this.f;
v0 = this.b;
v0 = this.c;
/* instance-of v1, v0, Le/c/a/g0; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 33 */
v1 = this.e;
/* check-cast v0, Le/c/a/g0; */
v0 = this.b;
(( e.c.a.a2 ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
/* .line 34 */
/* instance-of v1, v0, Le/c/a/k0; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 35 */
/* check-cast v0, Le/c/a/k0; */
/* .line 36 */
(( e.c.a.l2 ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;Le/c/a/k0;)V
return;
/* .line 37 */
} // :cond_0
p1 = this.a;
v0 = this.f;
v0 = this.e;
(( android.graphics.Canvas ) p1 ).drawPath ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
return;
} // .end method
public final void a ( e.c.a.e1 p0, android.graphics.Path p1, e.c.a.k0 p2 ) {
/* .locals 17 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* move-object/from16 v2, p3 */
/* .line 921 */
v3 = this.p;
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = (( java.lang.Boolean ) v3 ).booleanValue ( ); // invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
if ( v3 != null) { // if-eqz v3, :cond_0
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
/* .line 922 */
} // :goto_0
v6 = this.w;
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 923 */
(( e.c.a.l2 ) v0 ).a ( v2, v6 ); // invoke-virtual {v0, v2, v6}, Le/c/a/l2;->a(Le/c/a/k0;Ljava/lang/String;)V
} // :cond_1
int v6 = 0; // const/4 v6, 0x0
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 924 */
v3 = this.s;
if ( v3 != null) { // if-eqz v3, :cond_2
v3 = (( e.c.a.b0 ) v3 ).b ( v0 ); // invoke-virtual {v3, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
/* .line 925 */
} // :goto_1
v7 = this.t;
if ( v7 != null) { // if-eqz v7, :cond_3
v7 = (( e.c.a.b0 ) v7 ).c ( v0 ); // invoke-virtual {v7, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_3
int v7 = 0; // const/4 v7, 0x0
/* .line 926 */
} // :goto_2
v8 = this.u;
if ( v8 != null) { // if-eqz v8, :cond_4
v8 = (( e.c.a.b0 ) v8 ).b ( v0 ); // invoke-virtual {v8, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_4
int v8 = 0; // const/4 v8, 0x0
/* .line 927 */
} // :goto_3
v9 = this.v;
if ( v9 != null) { // if-eqz v9, :cond_5
v9 = (( e.c.a.b0 ) v9 ).c ( v0 ); // invoke-virtual {v9, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_5
int v9 = 0; // const/4 v9, 0x0
/* .line 928 */
} // :cond_6
v3 = this.s;
/* const/high16 v7, 0x3f800000 # 1.0f */
if ( v3 != null) { // if-eqz v3, :cond_7
v3 = (( e.c.a.b0 ) v3 ).a ( v0, v7 ); // invoke-virtual {v3, v0, v7}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_7
int v3 = 0; // const/4 v3, 0x0
/* .line 929 */
} // :goto_4
v8 = this.t;
if ( v8 != null) { // if-eqz v8, :cond_8
v8 = (( e.c.a.b0 ) v8 ).a ( v0, v7 ); // invoke-virtual {v8, v0, v7}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_8
int v8 = 0; // const/4 v8, 0x0
/* .line 930 */
} // :goto_5
v9 = this.u;
if ( v9 != null) { // if-eqz v9, :cond_9
v9 = (( e.c.a.b0 ) v9 ).a ( v0, v7 ); // invoke-virtual {v9, v0, v7}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_9
int v9 = 0; // const/4 v9, 0x0
/* .line 931 */
} // :goto_6
v10 = this.v;
if ( v10 != null) { // if-eqz v10, :cond_a
v7 = (( e.c.a.b0 ) v10 ).a ( v0, v7 ); // invoke-virtual {v10, v0, v7}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_a
int v7 = 0; // const/4 v7, 0x0
/* .line 932 */
} // :goto_7
v10 = this.h;
/* iget v11, v10, Le/c/a/n;->b:F */
/* iget v12, v10, Le/c/a/n;->d:F */
/* mul-float v3, v3, v12 */
/* add-float/2addr v3, v11 */
/* .line 933 */
/* iget v11, v10, Le/c/a/n;->c:F */
/* iget v10, v10, Le/c/a/n;->e:F */
/* mul-float v8, v8, v10 */
/* add-float/2addr v8, v11 */
/* mul-float v9, v9, v12 */
/* mul-float v7, v7, v10 */
/* move/from16 v16, v9 */
/* move v9, v7 */
/* move v7, v8 */
/* move/from16 v8, v16 */
} // :goto_8
/* cmpl-float v10, v8, v6 */
if ( v10 != null) { // if-eqz v10, :cond_1b
/* cmpl-float v10, v9, v6 */
/* if-nez v10, :cond_b */
/* goto/16 :goto_11 */
/* .line 934 */
} // :cond_b
v10 = this.n;
if ( v10 != null) { // if-eqz v10, :cond_c
} // :cond_c
v10 = e.c.a.m.d;
/* .line 935 */
} // :goto_9
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->r()V */
/* .line 936 */
v11 = this.a;
/* move-object/from16 v12, p2 */
(( android.graphics.Canvas ) v11 ).clipPath ( v12 ); // invoke-virtual {v11, v12}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z
/* .line 937 */
/* new-instance v11, Le/c/a/h2; */
/* invoke-direct {v11, v0}, Le/c/a/h2;-><init>(Le/c/a/l2;)V */
/* .line 938 */
e.c.a.y0 .a ( );
(( e.c.a.l2 ) v0 ).a ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V
/* .line 939 */
v12 = this.b;
java.lang.Boolean .valueOf ( v5 );
this.w = v13;
/* .line 940 */
(( e.c.a.l2 ) v0 ).a ( v2, v11 ); // invoke-virtual {v0, v2, v11}, Le/c/a/l2;->a(Le/c/a/h1;Le/c/a/h2;)Le/c/a/h2;
this.f = v11;
/* .line 941 */
v11 = this.h;
/* .line 942 */
v12 = this.r;
if ( v12 != null) { // if-eqz v12, :cond_12
/* .line 943 */
v13 = this.a;
(( android.graphics.Canvas ) v13 ).concat ( v12 ); // invoke-virtual {v13, v12}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 944 */
/* new-instance v12, Landroid/graphics/Matrix; */
/* invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V */
/* .line 945 */
v13 = this.r;
v13 = (( android.graphics.Matrix ) v13 ).invert ( v12 ); // invoke-virtual {v13, v12}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z
if ( v13 != null) { // if-eqz v13, :cond_12
/* const/16 v11, 0x8 */
/* new-array v13, v11, [F */
/* .line 946 */
v11 = this.h;
/* iget v14, v11, Le/c/a/n;->b:F */
/* aput v14, v13, v5 */
/* iget v14, v11, Le/c/a/n;->c:F */
/* aput v14, v13, v4 */
/* .line 947 */
v11 = (( e.c.a.n ) v11 ).a ( ); // invoke-virtual {v11}, Le/c/a/n;->a()F
int v14 = 2; // const/4 v14, 0x2
/* aput v11, v13, v14 */
int v11 = 3; // const/4 v11, 0x3
v15 = this.h;
/* iget v14, v15, Le/c/a/n;->c:F */
/* aput v14, v13, v11 */
int v11 = 4; // const/4 v11, 0x4
/* .line 948 */
v14 = (( e.c.a.n ) v15 ).a ( ); // invoke-virtual {v15}, Le/c/a/n;->a()F
/* aput v14, v13, v11 */
int v11 = 5; // const/4 v11, 0x5
v14 = this.h;
v14 = (( e.c.a.n ) v14 ).b ( ); // invoke-virtual {v14}, Le/c/a/n;->b()F
/* aput v14, v13, v11 */
/* .line 949 */
v11 = this.h;
/* iget v14, v11, Le/c/a/n;->b:F */
int v15 = 6; // const/4 v15, 0x6
/* aput v14, v13, v15 */
int v14 = 7; // const/4 v14, 0x7
v11 = (( e.c.a.n ) v11 ).b ( ); // invoke-virtual {v11}, Le/c/a/n;->b()F
/* aput v11, v13, v14 */
/* .line 950 */
(( android.graphics.Matrix ) v12 ).mapPoints ( v13 ); // invoke-virtual {v12, v13}, Landroid/graphics/Matrix;->mapPoints([F)V
/* .line 951 */
/* new-instance v12, Landroid/graphics/RectF; */
/* aget v11, v13, v5 */
/* aget v14, v13, v4 */
/* aget v6, v13, v5 */
/* aget v5, v13, v4 */
/* invoke-direct {v12, v11, v14, v6, v5}, Landroid/graphics/RectF;-><init>(FFFF)V */
int v14 = 2; // const/4 v14, 0x2
} // :goto_a
/* if-le v14, v15, :cond_d */
/* .line 952 */
/* new-instance v11, Le/c/a/n; */
/* iget v5, v12, Landroid/graphics/RectF;->left:F */
/* iget v6, v12, Landroid/graphics/RectF;->top:F */
/* iget v13, v12, Landroid/graphics/RectF;->right:F */
/* sub-float/2addr v13, v5 */
/* iget v12, v12, Landroid/graphics/RectF;->bottom:F */
/* sub-float/2addr v12, v6 */
/* invoke-direct {v11, v5, v6, v13, v12}, Le/c/a/n;-><init>(FFFF)V */
/* .line 953 */
} // :cond_d
/* aget v5, v13, v14 */
/* iget v6, v12, Landroid/graphics/RectF;->left:F */
/* cmpg-float v5, v5, v6 */
/* if-gez v5, :cond_e */
/* aget v5, v13, v14 */
/* iput v5, v12, Landroid/graphics/RectF;->left:F */
/* .line 954 */
} // :cond_e
/* aget v5, v13, v14 */
/* iget v6, v12, Landroid/graphics/RectF;->right:F */
/* cmpl-float v5, v5, v6 */
/* if-lez v5, :cond_f */
/* aget v5, v13, v14 */
/* iput v5, v12, Landroid/graphics/RectF;->right:F */
} // :cond_f
/* add-int/lit8 v5, v14, 0x1 */
/* .line 955 */
/* aget v6, v13, v5 */
/* iget v11, v12, Landroid/graphics/RectF;->top:F */
/* cmpg-float v6, v6, v11 */
/* if-gez v6, :cond_10 */
/* aget v6, v13, v5 */
/* iput v6, v12, Landroid/graphics/RectF;->top:F */
/* .line 956 */
} // :cond_10
/* aget v6, v13, v5 */
/* iget v11, v12, Landroid/graphics/RectF;->bottom:F */
/* cmpl-float v6, v6, v11 */
/* if-lez v6, :cond_11 */
/* aget v5, v13, v5 */
/* iput v5, v12, Landroid/graphics/RectF;->bottom:F */
} // :cond_11
/* add-int/lit8 v14, v14, 0x2 */
/* .line 957 */
} // :cond_12
} // :goto_b
/* iget v5, v11, Le/c/a/n;->b:F */
/* sub-float/2addr v5, v3 */
/* div-float/2addr v5, v8 */
/* float-to-double v5, v5 */
java.lang.Math .floor ( v5,v6 );
/* move-result-wide v5 */
/* double-to-float v5, v5 */
/* mul-float v5, v5, v8 */
/* add-float/2addr v3, v5 */
/* .line 958 */
/* iget v5, v11, Le/c/a/n;->c:F */
/* sub-float/2addr v5, v7 */
/* div-float/2addr v5, v9 */
/* float-to-double v5, v5 */
java.lang.Math .floor ( v5,v6 );
/* move-result-wide v5 */
/* double-to-float v5, v5 */
/* mul-float v5, v5, v9 */
/* add-float/2addr v7, v5 */
/* .line 959 */
v5 = (( e.c.a.n ) v11 ).a ( ); // invoke-virtual {v11}, Le/c/a/n;->a()F
/* .line 960 */
v6 = (( e.c.a.n ) v11 ).b ( ); // invoke-virtual {v11}, Le/c/a/n;->b()F
/* .line 961 */
/* new-instance v11, Le/c/a/n; */
int v12 = 0; // const/4 v12, 0x0
/* invoke-direct {v11, v12, v12, v8, v9}, Le/c/a/n;-><init>(FFFF)V */
} // :goto_c
/* cmpg-float v12, v7, v6 */
/* if-ltz v12, :cond_13 */
/* .line 962 */
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
return;
} // :cond_13
/* move v12, v3 */
} // :goto_d
/* cmpg-float v13, v12, v5 */
/* if-ltz v13, :cond_14 */
/* add-float/2addr v7, v9 */
/* .line 963 */
} // :cond_14
/* iput v12, v11, Le/c/a/n;->b:F */
/* .line 964 */
/* iput v7, v11, Le/c/a/n;->c:F */
/* .line 965 */
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->r()V */
/* .line 966 */
v13 = this.f;
v13 = this.b;
v13 = this.w;
v13 = (( java.lang.Boolean ) v13 ).booleanValue ( ); // invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v13, :cond_15 */
/* .line 967 */
/* iget v13, v11, Le/c/a/n;->b:F */
/* iget v14, v11, Le/c/a/n;->c:F */
/* iget v15, v11, Le/c/a/n;->d:F */
/* iget v4, v11, Le/c/a/n;->e:F */
(( e.c.a.l2 ) v0 ).a ( v13, v14, v15, v4 ); // invoke-virtual {v0, v13, v14, v15, v4}, Le/c/a/l2;->a(FFFF)V
/* .line 968 */
} // :cond_15
v4 = this.o;
if ( v4 != null) { // if-eqz v4, :cond_16
/* .line 969 */
v13 = this.a;
(( e.c.a.l2 ) v0 ).a ( v11, v4, v10 ); // invoke-virtual {v0, v11, v4, v10}, Le/c/a/l2;->a(Le/c/a/n;Le/c/a/n;Le/c/a/m;)Landroid/graphics/Matrix;
(( android.graphics.Canvas ) v13 ).concat ( v4 ); // invoke-virtual {v13, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 970 */
} // :cond_16
v4 = this.q;
if ( v4 != null) { // if-eqz v4, :cond_17
v4 = (( java.lang.Boolean ) v4 ).booleanValue ( ); // invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v4, :cond_17 */
int v4 = 0; // const/4 v4, 0x0
} // :cond_17
int v4 = 1; // const/4 v4, 0x1
/* .line 971 */
} // :goto_e
v13 = this.a;
(( android.graphics.Canvas ) v13 ).translate ( v12, v7 ); // invoke-virtual {v13, v12, v7}, Landroid/graphics/Canvas;->translate(FF)V
/* if-nez v4, :cond_18 */
/* .line 972 */
v4 = this.a;
v13 = this.h;
/* iget v14, v13, Le/c/a/n;->d:F */
/* iget v13, v13, Le/c/a/n;->e:F */
(( android.graphics.Canvas ) v4 ).scale ( v14, v13 ); // invoke-virtual {v4, v14, v13}, Landroid/graphics/Canvas;->scale(FF)V
/* .line 973 */
} // :cond_18
} // :goto_f
v4 = /* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->n()Z */
/* .line 974 */
v13 = this.i;
v14 = } // :goto_10
/* if-nez v14, :cond_1a */
if ( v4 != null) { // if-eqz v4, :cond_19
/* .line 975 */
(( e.c.a.l2 ) v0 ).c ( v2 ); // invoke-virtual {v0, v2}, Le/c/a/l2;->c(Le/c/a/e1;)V
/* .line 976 */
} // :cond_19
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
/* add-float/2addr v12, v8 */
int v4 = 1; // const/4 v4, 0x1
/* .line 977 */
} // :cond_1a
/* check-cast v14, Le/c/a/h1; */
/* .line 978 */
(( e.c.a.l2 ) v0 ).c ( v14 ); // invoke-virtual {v0, v14}, Le/c/a/l2;->c(Le/c/a/h1;)V
} // :cond_1b
} // :goto_11
return;
} // .end method
public final void a ( e.c.a.e1 p0, Object p1 ) {
/* .locals 5 */
/* .line 770 */
v0 = this.f;
v0 = this.b;
v0 = this.F;
/* if-nez v0, :cond_0 */
return;
/* .line 771 */
} // :cond_0
v1 = this.a;
(( e.c.a.a2 ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_1 */
/* new-array p1, v1, [Ljava/lang/Object; */
/* .line 772 */
p2 = this.f;
p2 = this.b;
p2 = this.F;
/* aput-object p2, p1, v2 */
final String p2 = "ClipPath reference \'%s\' not found"; // const-string p2, "ClipPath reference \'%s\' not found"
e.c.a.l2 .e ( p2,p1 );
return;
/* .line 773 */
} // :cond_1
/* check-cast v0, Le/c/a/q; */
/* .line 774 */
v3 = v3 = this.i;
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 775 */
p1 = this.a;
(( android.graphics.Canvas ) p1 ).clipRect ( v2, v2, v2, v2 ); // invoke-virtual {p1, v2, v2, v2, v2}, Landroid/graphics/Canvas;->clipRect(IIII)Z
return;
/* .line 776 */
} // :cond_2
v3 = this.o;
if ( v3 != null) { // if-eqz v3, :cond_3
v3 = (( java.lang.Boolean ) v3 ).booleanValue ( ); // invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v3, :cond_3 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_3
int v3 = 1; // const/4 v3, 0x1
/* .line 777 */
} // :goto_0
/* instance-of v4, p1, Le/c/a/y; */
if ( v4 != null) { // if-eqz v4, :cond_4
/* if-nez v3, :cond_4 */
/* new-array p2, v1, [Ljava/lang/Object; */
/* .line 778 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p1 ).getSimpleName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
/* aput-object p1, p2, v2 */
final String p1 = "<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)"; // const-string p1, "<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)"
e.c.a.l2 .f ( p1,p2 );
return;
/* .line 779 */
} // :cond_4
(( e.c.a.l2 ) p0 ).b ( ); // invoke-virtual {p0}, Le/c/a/l2;->b()V
/* if-nez v3, :cond_5 */
/* .line 780 */
/* new-instance p1, Landroid/graphics/Matrix; */
/* invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V */
/* .line 781 */
/* iget v2, p2, Le/c/a/n;->b:F */
/* iget v3, p2, Le/c/a/n;->c:F */
(( android.graphics.Matrix ) p1 ).preTranslate ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 782 */
/* iget v2, p2, Le/c/a/n;->d:F */
/* iget p2, p2, Le/c/a/n;->e:F */
(( android.graphics.Matrix ) p1 ).preScale ( v2, p2 ); // invoke-virtual {p1, v2, p2}, Landroid/graphics/Matrix;->preScale(FF)Z
/* .line 783 */
p2 = this.a;
(( android.graphics.Canvas ) p2 ).concat ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 784 */
} // :cond_5
p1 = this.n;
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 785 */
p2 = this.a;
(( android.graphics.Canvas ) p2 ).concat ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 786 */
} // :cond_6
(( e.c.a.l2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;
this.f = p1;
/* .line 787 */
(( e.c.a.l2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 788 */
/* new-instance p1, Landroid/graphics/Path; */
/* invoke-direct {p1}, Landroid/graphics/Path;-><init>()V */
/* .line 789 */
p2 = this.i;
v0 = } // :goto_1
/* if-nez v0, :cond_7 */
/* .line 790 */
p2 = this.a;
(( android.graphics.Canvas ) p2 ).clipPath ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z
/* .line 791 */
(( e.c.a.l2 ) p0 ).a ( ); // invoke-virtual {p0}, Le/c/a/l2;->a()V
return;
/* .line 792 */
} // :cond_7
/* check-cast v0, Le/c/a/h1; */
/* .line 793 */
/* new-instance v2, Landroid/graphics/Matrix; */
/* invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V */
(( e.c.a.l2 ) p0 ).a ( v0, v1, p1, v2 ); // invoke-virtual {p0, v0, v1, p1, v2}, Le/c/a/l2;->a(Le/c/a/h1;ZLandroid/graphics/Path;Landroid/graphics/Matrix;)V
} // .end method
public final void a ( e.c.a.g1 p0, e.c.a.g1 p1 ) {
/* .locals 1 */
/* .line 737 */
v0 = this.m;
/* if-nez v0, :cond_0 */
/* .line 738 */
v0 = this.m;
this.m = v0;
/* .line 739 */
} // :cond_0
v0 = this.n;
/* if-nez v0, :cond_1 */
/* .line 740 */
v0 = this.n;
this.n = v0;
/* .line 741 */
} // :cond_1
v0 = this.o;
/* if-nez v0, :cond_2 */
/* .line 742 */
v0 = this.o;
this.o = v0;
/* .line 743 */
} // :cond_2
v0 = this.p;
/* if-nez v0, :cond_3 */
/* .line 744 */
p2 = this.p;
this.p = p2;
} // :cond_3
return;
} // .end method
public final void a ( e.c.a.h0 p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Path render"; // const-string v1, "Path render"
/* .line 119 */
e.c.a.l2 .d ( v1,v0 );
/* .line 120 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 121 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 122 */
} // :cond_0
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_1 */
return;
/* .line 123 */
} // :cond_1
v0 = this.f;
/* iget-boolean v1, v0, Le/c/a/h2;->d:Z */
/* if-nez v1, :cond_2 */
/* iget-boolean v0, v0, Le/c/a/h2;->c:Z */
/* if-nez v0, :cond_2 */
return;
/* .line 124 */
} // :cond_2
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 125 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 126 */
} // :cond_3
/* new-instance v0, Le/c/a/d2; */
v1 = this.o;
/* invoke-direct {v0, p0, v1}, Le/c/a/d2;-><init>(Le/c/a/l2;Le/c/a/i0;)V */
(( e.c.a.d2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/c/a/d2;->a()Landroid/graphics/Path;
/* .line 127 */
v1 = this.h;
/* if-nez v1, :cond_4 */
/* .line 128 */
(( e.c.a.l2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->a(Landroid/graphics/Path;)Le/c/a/n;
this.h = v1;
/* .line 129 */
} // :cond_4
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
/* .line 130 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 131 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 132 */
v1 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 133 */
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 134 */
(( e.c.a.l2 ) p0 ).k ( ); // invoke-virtual {p0}, Le/c/a/l2;->k()Landroid/graphics/Path$FillType;
(( android.graphics.Path ) v0 ).setFillType ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V
/* .line 135 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V
/* .line 136 */
} // :cond_5
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->d:Z */
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 137 */
(( e.c.a.l2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V
/* .line 138 */
} // :cond_6
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/x;)V
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 139 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_7
return;
} // .end method
public final void a ( e.c.a.h0 p0, android.graphics.Path p1, android.graphics.Matrix p2 ) {
/* .locals 2 */
/* .line 809 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 810 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 811 */
} // :cond_0
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_1 */
return;
/* .line 812 */
} // :cond_1
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 813 */
(( android.graphics.Matrix ) p3 ).preConcat ( v0 ); // invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z
/* .line 814 */
} // :cond_2
/* new-instance v0, Le/c/a/d2; */
v1 = this.o;
/* invoke-direct {v0, p0, v1}, Le/c/a/d2;-><init>(Le/c/a/l2;Le/c/a/i0;)V */
(( e.c.a.d2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/c/a/d2;->a()Landroid/graphics/Path;
/* .line 815 */
v1 = this.h;
/* if-nez v1, :cond_3 */
/* .line 816 */
(( e.c.a.l2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->a(Landroid/graphics/Path;)Le/c/a/n;
this.h = v1;
/* .line 817 */
} // :cond_3
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 818 */
(( e.c.a.l2 ) p0 ).f ( ); // invoke-virtual {p0}, Le/c/a/l2;->f()Landroid/graphics/Path$FillType;
(( android.graphics.Path ) p2 ).setFillType ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V
/* .line 819 */
(( android.graphics.Path ) p2 ).addPath ( v0, p3 ); // invoke-virtual {p2, v0, p3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V
return;
} // .end method
public final void a ( e.c.a.h1 p0 ) {
/* .locals 1 */
/* .line 28 */
/* instance-of v0, p1, Le/c/a/f1; */
/* if-nez v0, :cond_0 */
return;
/* .line 29 */
} // :cond_0
/* check-cast p1, Le/c/a/f1; */
/* .line 30 */
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 31 */
v0 = this.f;
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
/* iput-boolean p1, v0, Le/c/a/h2;->i:Z */
} // :cond_1
return;
} // .end method
public final void a ( e.c.a.h1 p0, e.c.a.j2 p1 ) {
/* .locals 7 */
/* .line 218 */
/* move-object v0, p1 */
/* check-cast v0, Le/c/a/s1; */
v0 = (( e.c.a.j2 ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/c/a/j2;->a(Le/c/a/s1;)Z
/* if-nez v0, :cond_0 */
return;
/* .line 219 */
} // :cond_0
/* instance-of v0, p1, Le/c/a/t1; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 220 */
(( e.c.a.l2 ) p0 ).r ( ); // invoke-virtual {p0}, Le/c/a/l2;->r()V
/* .line 221 */
/* check-cast p1, Le/c/a/t1; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/t1;)V
/* .line 222 */
(( e.c.a.l2 ) p0 ).q ( ); // invoke-virtual {p0}, Le/c/a/l2;->q()V
/* goto/16 :goto_9 */
/* .line 223 */
} // :cond_1
/* instance-of v0, p1, Le/c/a/p1; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_d
/* new-array v0, v1, [Ljava/lang/Object; */
final String v2 = "TSpan render"; // const-string v2, "TSpan render"
/* .line 224 */
e.c.a.l2 .d ( v2,v0 );
/* .line 225 */
(( e.c.a.l2 ) p0 ).r ( ); // invoke-virtual {p0}, Le/c/a/l2;->r()V
/* .line 226 */
/* check-cast p1, Le/c/a/p1; */
/* .line 227 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 228 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 229 */
/* instance-of v0, p2, Le/c/a/f2; */
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 230 */
v3 = this.n;
v3 = if ( v3 != null) { // if-eqz v3, :cond_3
/* if-nez v3, :cond_2 */
} // :cond_2
v3 = this.n;
/* check-cast v3, Le/c/a/b0; */
v3 = (( e.c.a.b0 ) v3 ).b ( p0 ); // invoke-virtual {v3, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_3
} // :goto_0
/* move-object v3, p2 */
/* check-cast v3, Le/c/a/f2; */
/* iget v3, v3, Le/c/a/f2;->a:F */
/* .line 231 */
} // :goto_1
v4 = this.o;
v4 = if ( v4 != null) { // if-eqz v4, :cond_5
/* if-nez v4, :cond_4 */
} // :cond_4
v4 = this.o;
/* check-cast v4, Le/c/a/b0; */
v4 = (( e.c.a.b0 ) v4 ).c ( p0 ); // invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_5
} // :goto_2
/* move-object v4, p2 */
/* check-cast v4, Le/c/a/f2; */
/* iget v4, v4, Le/c/a/f2;->b:F */
/* .line 232 */
} // :goto_3
v5 = this.p;
v5 = if ( v5 != null) { // if-eqz v5, :cond_7
/* if-nez v5, :cond_6 */
} // :cond_6
v5 = this.p;
/* check-cast v5, Le/c/a/b0; */
v5 = (( e.c.a.b0 ) v5 ).b ( p0 ); // invoke-virtual {v5, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_7
} // :goto_4
int v5 = 0; // const/4 v5, 0x0
/* .line 233 */
} // :goto_5
v6 = this.q;
v6 = if ( v6 != null) { // if-eqz v6, :cond_9
/* if-nez v6, :cond_8 */
} // :cond_8
v2 = this.q;
/* check-cast v1, Le/c/a/b0; */
v1 = (( e.c.a.b0 ) v1 ).c ( p0 ); // invoke-virtual {v1, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* move v2, v1 */
} // :cond_9
} // :goto_6
/* move v1, v2 */
/* move v2, v3 */
} // :cond_a
int v1 = 0; // const/4 v1, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 234 */
} // :goto_7
(( e.c.a.p1 ) p1 ).d ( ); // invoke-virtual {p1}, Le/c/a/p1;->d()Le/c/a/v1;
/* check-cast v3, Le/c/a/e1; */
(( e.c.a.l2 ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Le/c/a/l2;->b(Le/c/a/e1;)V
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 235 */
/* move-object v0, p2 */
/* check-cast v0, Le/c/a/f2; */
/* add-float/2addr v2, v5 */
/* iput v2, v0, Le/c/a/f2;->a:F */
/* add-float/2addr v4, v1 */
/* .line 236 */
/* iput v4, v0, Le/c/a/f2;->b:F */
/* .line 237 */
} // :cond_b
v0 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 238 */
(( e.c.a.l2 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 239 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
/* .line 240 */
} // :cond_c
(( e.c.a.l2 ) p0 ).q ( ); // invoke-virtual {p0}, Le/c/a/l2;->q()V
/* .line 241 */
} // :cond_d
/* instance-of v0, p1, Le/c/a/o1; */
if ( v0 != null) { // if-eqz v0, :cond_10
/* .line 242 */
(( e.c.a.l2 ) p0 ).r ( ); // invoke-virtual {p0}, Le/c/a/l2;->r()V
/* .line 243 */
/* move-object v0, p1 */
/* check-cast v0, Le/c/a/o1; */
/* .line 244 */
v2 = this.f;
(( e.c.a.l2 ) p0 ).a ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 245 */
v2 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
if ( v2 != null) { // if-eqz v2, :cond_f
/* .line 246 */
(( e.c.a.o1 ) v0 ).d ( ); // invoke-virtual {v0}, Le/c/a/o1;->d()Le/c/a/v1;
/* check-cast v2, Le/c/a/e1; */
(( e.c.a.l2 ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 247 */
p1 = this.a;
v2 = this.n;
(( e.c.a.a2 ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
if ( p1 != null) { // if-eqz p1, :cond_e
/* .line 248 */
/* instance-of v2, p1, Le/c/a/s1; */
if ( v2 != null) { // if-eqz v2, :cond_e
/* .line 249 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 250 */
/* check-cast p1, Le/c/a/s1; */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/s1;Ljava/lang/StringBuilder;)V
/* .line 251 */
p1 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* if-lez p1, :cond_f */
/* .line 252 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.c.a.j2 ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/c/a/j2;->a(Ljava/lang/String;)V
} // :cond_e
int p1 = 1; // const/4 p1, 0x1
/* new-array p1, p1, [Ljava/lang/Object; */
/* .line 253 */
p2 = this.n;
/* aput-object p2, p1, v1 */
final String p2 = "Tref reference \'%s\' not found"; // const-string p2, "Tref reference \'%s\' not found"
e.c.a.l2 .e ( p2,p1 );
/* .line 254 */
} // :cond_f
} // :goto_8
(( e.c.a.l2 ) p0 ).q ( ); // invoke-virtual {p0}, Le/c/a/l2;->q()V
} // :cond_10
} // :goto_9
return;
} // .end method
public final void a ( e.c.a.h1 p0, Boolean p1, android.graphics.Path p2, android.graphics.Matrix p3 ) {
/* .locals 2 */
/* .line 794 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 795 */
} // :cond_0
(( e.c.a.l2 ) p0 ).b ( ); // invoke-virtual {p0}, Le/c/a/l2;->b()V
/* .line 796 */
/* instance-of v0, p1, Le/c/a/y1; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 797 */
/* check-cast p1, Le/c/a/y1; */
(( e.c.a.l2 ) p0 ).a ( p1, p3, p4 ); // invoke-virtual {p0, p1, p3, p4}, Le/c/a/l2;->a(Le/c/a/y1;Landroid/graphics/Path;Landroid/graphics/Matrix;)V
} // :cond_1
/* new-array p1, v1, [Ljava/lang/Object; */
final String p2 = "<use> elements inside a <clipPath> cannot reference another <use>"; // const-string p2, "<use> elements inside a <clipPath> cannot reference another <use>"
/* .line 798 */
e.c.a.l2 .e ( p2,p1 );
/* .line 799 */
} // :cond_2
/* instance-of p2, p1, Le/c/a/h0; */
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 800 */
/* check-cast p1, Le/c/a/h0; */
(( e.c.a.l2 ) p0 ).a ( p1, p3, p4 ); // invoke-virtual {p0, p1, p3, p4}, Le/c/a/l2;->a(Le/c/a/h0;Landroid/graphics/Path;Landroid/graphics/Matrix;)V
/* .line 801 */
} // :cond_3
/* instance-of p2, p1, Le/c/a/q1; */
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 802 */
/* check-cast p1, Le/c/a/q1; */
(( e.c.a.l2 ) p0 ).a ( p1, p3, p4 ); // invoke-virtual {p0, p1, p3, p4}, Le/c/a/l2;->a(Le/c/a/q1;Landroid/graphics/Path;Landroid/graphics/Matrix;)V
/* .line 803 */
} // :cond_4
/* instance-of p2, p1, Le/c/a/x; */
if ( p2 != null) { // if-eqz p2, :cond_5
/* .line 804 */
/* check-cast p1, Le/c/a/x; */
(( e.c.a.l2 ) p0 ).a ( p1, p3, p4 ); // invoke-virtual {p0, p1, p3, p4}, Le/c/a/l2;->a(Le/c/a/x;Landroid/graphics/Path;Landroid/graphics/Matrix;)V
} // :cond_5
int p2 = 1; // const/4 p2, 0x1
/* new-array p2, p2, [Ljava/lang/Object; */
/* .line 805 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p1 ).getSimpleName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
/* aput-object p1, p2, v1 */
final String p1 = "Invalid %s element found in clipPath definition"; // const-string p1, "Invalid %s element found in clipPath definition"
e.c.a.l2 .e ( p1,p2 );
/* .line 806 */
} // :goto_0
(( e.c.a.l2 ) p0 ).a ( ); // invoke-virtual {p0}, Le/c/a/l2;->a()V
return;
} // .end method
public final void a ( e.c.a.h2 p0, e.c.a.f1 p1 ) {
/* .locals 3 */
/* .line 18 */
v0 = this.b;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 19 */
} // :goto_0
v1 = this.b;
(( e.c.a.y0 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/c/a/y0;->a(Z)V
/* .line 20 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 21 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V
/* .line 22 */
} // :cond_1
v0 = this.e;
v0 = (( e.c.a.a2 ) v0 ).g ( ); // invoke-virtual {v0}, Le/c/a/a2;->g()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 23 */
v0 = this.e;
(( e.c.a.a2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/c/a/a2;->a()Ljava/util/List;
} // :cond_2
v1 = } // :goto_1
/* if-nez v1, :cond_3 */
} // :cond_3
/* check-cast v1, Le/c/a/f; */
/* .line 24 */
v2 = this.a;
v2 = e.c.a.j .a ( v2,p2 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 25 */
v1 = this.b;
(( e.c.a.l2 ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V
/* .line 26 */
} // :cond_4
} // :goto_2
p2 = this.f;
if ( p2 != null) { // if-eqz p2, :cond_5
/* .line 27 */
(( e.c.a.l2 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V
} // :cond_5
return;
} // .end method
public final void a ( e.c.a.h2 p0, e.c.a.y0 p1 ) {
/* .locals 11 */
/* const-wide/16 v0, 0x1000 */
/* .line 369 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 370 */
v0 = this.b;
v1 = this.o;
this.o = v1;
} // :cond_0
/* const-wide/16 v0, 0x800 */
/* .line 371 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 372 */
v0 = this.b;
v1 = this.n;
this.n = v1;
} // :cond_1
/* const-wide/16 v0, 0x1 */
/* .line 373 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 374 */
v0 = this.b;
v3 = this.c;
this.c = v3;
/* .line 375 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iput-boolean v0, p1, Le/c/a/h2;->c:Z */
} // :cond_3
/* const-wide/16 v3, 0x4 */
/* .line 376 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 377 */
v0 = this.b;
v3 = this.e;
this.e = v3;
} // :cond_4
/* const-wide/16 v3, 0x1805 */
/* .line 378 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 379 */
v0 = this.b;
v0 = this.c;
(( e.c.a.l2 ) p0 ).a ( p1, v2, v0 ); // invoke-virtual {p0, p1, v2, v0}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V
} // :cond_5
/* const-wide/16 v3, 0x2 */
/* .line 380 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 381 */
v0 = this.b;
v3 = this.d;
this.d = v3;
} // :cond_6
/* const-wide/16 v3, 0x8 */
/* .line 382 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 383 */
v0 = this.b;
v3 = this.f;
this.f = v3;
/* .line 384 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_7
int v0 = 1; // const/4 v0, 0x1
} // :cond_7
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* iput-boolean v0, p1, Le/c/a/h2;->d:Z */
} // :cond_8
/* const-wide/16 v3, 0x10 */
/* .line 385 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 386 */
v0 = this.b;
v3 = this.g;
this.g = v3;
} // :cond_9
/* const-wide/16 v3, 0x1818 */
/* .line 387 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 388 */
v0 = this.b;
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V
} // :cond_a
/* const-wide v3, 0x800000000L */
/* .line 389 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 390 */
v0 = this.b;
v3 = this.M;
this.M = v3;
} // :cond_b
/* const-wide/16 v3, 0x20 */
/* .line 391 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 392 */
v0 = this.b;
v3 = this.h;
this.h = v3;
/* .line 393 */
v0 = this.f;
v3 = (( e.c.a.b0 ) v3 ).a ( p0 ); // invoke-virtual {v3, p0}, Le/c/a/b0;->a(Le/c/a/l2;)F
(( android.graphics.Paint ) v0 ).setStrokeWidth ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V
} // :cond_c
/* const-wide/16 v3, 0x40 */
/* .line 394 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
int v3 = 3; // const/4 v3, 0x3
int v4 = 2; // const/4 v4, 0x2
if ( v0 != null) { // if-eqz v0, :cond_10
/* .line 395 */
v0 = this.b;
v5 = this.i;
this.i = v5;
/* .line 396 */
e.c.a.l2 .w ( );
v5 = this.i;
v5 = (( java.lang.Enum ) v5 ).ordinal ( ); // invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v5 */
/* if-eq v0, v2, :cond_f */
/* if-eq v0, v4, :cond_e */
/* if-eq v0, v3, :cond_d */
/* .line 397 */
} // :cond_d
v0 = this.f;
v5 = android.graphics.Paint$Cap.SQUARE;
(( android.graphics.Paint ) v0 ).setStrokeCap ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
/* .line 398 */
} // :cond_e
v0 = this.f;
v5 = android.graphics.Paint$Cap.ROUND;
(( android.graphics.Paint ) v0 ).setStrokeCap ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
/* .line 399 */
} // :cond_f
v0 = this.f;
v5 = android.graphics.Paint$Cap.BUTT;
(( android.graphics.Paint ) v0 ).setStrokeCap ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V
} // :cond_10
} // :goto_2
/* const-wide/16 v5, 0x80 */
/* .line 400 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v5, v6 ); // invoke-virtual {p0, p2, v5, v6}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_14
/* .line 401 */
v0 = this.b;
v5 = this.j;
this.j = v5;
/* .line 402 */
e.c.a.l2 .x ( );
v5 = this.j;
v5 = (( java.lang.Enum ) v5 ).ordinal ( ); // invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v5 */
/* if-eq v0, v2, :cond_13 */
/* if-eq v0, v4, :cond_12 */
/* if-eq v0, v3, :cond_11 */
/* .line 403 */
} // :cond_11
v0 = this.f;
v3 = android.graphics.Paint$Join.BEVEL;
(( android.graphics.Paint ) v0 ).setStrokeJoin ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V
/* .line 404 */
} // :cond_12
v0 = this.f;
v3 = android.graphics.Paint$Join.ROUND;
(( android.graphics.Paint ) v0 ).setStrokeJoin ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V
/* .line 405 */
} // :cond_13
v0 = this.f;
v3 = android.graphics.Paint$Join.MITER;
(( android.graphics.Paint ) v0 ).setStrokeJoin ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V
} // :cond_14
} // :goto_3
/* const-wide/16 v3, 0x100 */
/* .line 406 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_15
/* .line 407 */
v0 = this.b;
v3 = this.k;
this.k = v3;
/* .line 408 */
v0 = this.f;
v3 = this.k;
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
(( android.graphics.Paint ) v0 ).setStrokeMiter ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeMiter(F)V
} // :cond_15
/* const-wide/16 v3, 0x200 */
/* .line 409 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_16
/* .line 410 */
v0 = this.b;
v3 = this.l;
this.l = v3;
} // :cond_16
/* const-wide/16 v3, 0x400 */
/* .line 411 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_17
/* .line 412 */
v0 = this.b;
v3 = this.m;
this.m = v3;
} // :cond_17
/* const-wide/16 v3, 0x600 */
/* .line 413 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1d
/* .line 414 */
v0 = this.b;
v0 = this.l;
/* if-nez v0, :cond_18 */
/* .line 415 */
v0 = this.f;
(( android.graphics.Paint ) v0 ).setPathEffect ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;
/* .line 416 */
} // :cond_18
/* array-length v0, v0 */
/* .line 417 */
/* rem-int/lit8 v4, v0, 0x2 */
/* if-nez v4, :cond_19 */
/* move v4, v0 */
} // :cond_19
/* mul-int/lit8 v4, v0, 0x2 */
/* .line 418 */
} // :goto_4
/* new-array v5, v4, [F */
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
} // :goto_5
/* if-lt v7, v4, :cond_1c */
/* cmpl-float v0, v8, v6 */
/* if-nez v0, :cond_1a */
/* .line 419 */
v0 = this.f;
(( android.graphics.Paint ) v0 ).setPathEffect ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;
/* .line 420 */
} // :cond_1a
v0 = this.b;
v0 = this.m;
v0 = (( e.c.a.b0 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->a(Le/c/a/l2;)F
/* cmpg-float v4, v0, v6 */
/* if-gez v4, :cond_1b */
/* rem-float/2addr v0, v8 */
/* add-float/2addr v0, v8 */
/* .line 421 */
} // :cond_1b
v4 = this.f;
/* new-instance v6, Landroid/graphics/DashPathEffect; */
/* invoke-direct {v6, v5, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V */
(( android.graphics.Paint ) v4 ).setPathEffect ( v6 ); // invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;
/* .line 422 */
} // :cond_1c
v9 = this.b;
v9 = this.l;
/* rem-int v10, v7, v0 */
/* aget-object v9, v9, v10 */
v9 = (( e.c.a.b0 ) v9 ).a ( p0 ); // invoke-virtual {v9, p0}, Le/c/a/b0;->a(Le/c/a/l2;)F
/* aput v9, v5, v7 */
/* .line 423 */
/* aget v9, v5, v7 */
/* add-float/2addr v8, v9 */
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_1d
} // :goto_6
/* const-wide/16 v4, 0x4000 */
/* .line 424 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v4, v5 ); // invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_1e
/* .line 425 */
v0 = (( e.c.a.l2 ) p0 ).g ( ); // invoke-virtual {p0}, Le/c/a/l2;->g()F
/* .line 426 */
v4 = this.b;
v5 = this.q;
this.q = v5;
/* .line 427 */
v4 = this.e;
v5 = this.q;
v5 = (( e.c.a.b0 ) v5 ).a ( p0, v0 ); // invoke-virtual {v5, p0, v0}, Le/c/a/b0;->a(Le/c/a/l2;F)F
(( android.graphics.Paint ) v4 ).setTextSize ( v5 ); // invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 428 */
v4 = this.f;
v5 = this.q;
v0 = (( e.c.a.b0 ) v5 ).a ( p0, v0 ); // invoke-virtual {v5, p0, v0}, Le/c/a/b0;->a(Le/c/a/l2;F)F
(( android.graphics.Paint ) v4 ).setTextSize ( v0 ); // invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V
} // :cond_1e
/* const-wide/16 v4, 0x2000 */
/* .line 429 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v4, v5 ); // invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_1f
/* .line 430 */
v0 = this.b;
v4 = this.p;
this.p = v4;
} // :cond_1f
/* const-wide/32 v4, 0x8000 */
/* .line 431 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v4, v5 ); // invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_22
/* .line 432 */
v0 = this.r;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v4 = -1; // const/4 v4, -0x1
/* const/16 v5, 0x64 */
/* if-ne v0, v4, :cond_20 */
v0 = this.b;
v0 = this.r;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* if-le v0, v5, :cond_20 */
/* .line 433 */
v0 = this.b;
v4 = this.r;
v4 = (( java.lang.Integer ) v4 ).intValue ( ); // invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
/* sub-int/2addr v4, v5 */
java.lang.Integer .valueOf ( v4 );
this.r = v4;
/* .line 434 */
} // :cond_20
v0 = this.r;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* if-ne v0, v2, :cond_21 */
v0 = this.b;
v0 = this.r;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* const/16 v4, 0x384 */
/* if-ge v0, v4, :cond_21 */
/* .line 435 */
v0 = this.b;
v4 = this.r;
v4 = (( java.lang.Integer ) v4 ).intValue ( ); // invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
/* add-int/2addr v4, v5 */
java.lang.Integer .valueOf ( v4 );
this.r = v4;
/* .line 436 */
} // :cond_21
v0 = this.b;
v4 = this.r;
this.r = v4;
} // :cond_22
} // :goto_7
/* const-wide/32 v4, 0x10000 */
/* .line 437 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v4, v5 ); // invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_23
/* .line 438 */
v0 = this.b;
v4 = this.s;
this.s = v4;
} // :cond_23
/* const-wide/32 v4, 0x1a000 */
/* .line 439 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v4, v5 ); // invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_29
/* .line 440 */
v0 = this.b;
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_27
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_27
/* .line 441 */
(( e.c.a.a2 ) v0 ).e ( ); // invoke-virtual {v0}, Le/c/a/a2;->e()Le/c/a/m2;
/* .line 442 */
v4 = this.b;
v4 = this.p;
v5 = } // :cond_24
/* if-nez v5, :cond_25 */
} // :cond_25
/* check-cast v3, Ljava/lang/String; */
/* .line 443 */
v5 = this.b;
v6 = this.r;
v5 = this.s;
(( e.c.a.l2 ) p0 ).a ( v3, v6, v5 ); // invoke-virtual {p0, v3, v6, v5}, Le/c/a/l2;->a(Ljava/lang/String;Ljava/lang/Integer;Le/c/a/r0;)Landroid/graphics/Typeface;
/* if-nez v5, :cond_26 */
if ( v0 != null) { // if-eqz v0, :cond_26
/* .line 444 */
v5 = this.b;
v5 = this.r;
v5 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
v6 = this.b;
v6 = this.s;
java.lang.String .valueOf ( v6 );
(( e.c.a.m2 ) v0 ).a ( v3, v5, v6 ); // invoke-virtual {v0, v3, v5, v6}, Le/c/a/m2;->a(Ljava/lang/String;ILjava/lang/String;)Landroid/graphics/Typeface;
} // :cond_26
/* move-object v3, v5 */
} // :goto_8
if ( v3 != null) { // if-eqz v3, :cond_24
} // :cond_27
} // :goto_9
/* if-nez v3, :cond_28 */
/* .line 445 */
v0 = this.b;
v3 = this.r;
v0 = this.s;
final String v4 = "sans-serif"; // const-string v4, "sans-serif"
(( e.c.a.l2 ) p0 ).a ( v4, v3, v0 ); // invoke-virtual {p0, v4, v3, v0}, Le/c/a/l2;->a(Ljava/lang/String;Ljava/lang/Integer;Le/c/a/r0;)Landroid/graphics/Typeface;
/* .line 446 */
} // :cond_28
v0 = this.e;
(( android.graphics.Paint ) v0 ).setTypeface ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 447 */
v0 = this.f;
(( android.graphics.Paint ) v0 ).setTypeface ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
} // :cond_29
/* const-wide/32 v3, 0x20000 */
/* .line 448 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v3, v4 ); // invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_2e
/* .line 449 */
v0 = this.b;
v3 = this.t;
this.t = v3;
/* .line 450 */
v0 = this.e;
v3 = this.t;
v4 = e.c.a.v0.e;
/* if-ne v3, v4, :cond_2a */
int v3 = 1; // const/4 v3, 0x1
} // :cond_2a
int v3 = 0; // const/4 v3, 0x0
} // :goto_a
(( android.graphics.Paint ) v0 ).setStrikeThruText ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrikeThruText(Z)V
/* .line 451 */
v0 = this.e;
v3 = this.t;
v4 = e.c.a.v0.c;
/* if-ne v3, v4, :cond_2b */
int v3 = 1; // const/4 v3, 0x1
} // :cond_2b
int v3 = 0; // const/4 v3, 0x0
} // :goto_b
(( android.graphics.Paint ) v0 ).setUnderlineText ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setUnderlineText(Z)V
/* .line 452 */
/* const/16 v3, 0x11 */
/* if-lt v0, v3, :cond_2e */
/* .line 453 */
v0 = this.f;
v3 = this.t;
v4 = e.c.a.v0.e;
/* if-ne v3, v4, :cond_2c */
int v3 = 1; // const/4 v3, 0x1
} // :cond_2c
int v3 = 0; // const/4 v3, 0x0
} // :goto_c
(( android.graphics.Paint ) v0 ).setStrikeThruText ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrikeThruText(Z)V
/* .line 454 */
v0 = this.f;
v3 = this.t;
v4 = e.c.a.v0.c;
/* if-ne v3, v4, :cond_2d */
int v1 = 1; // const/4 v1, 0x1
} // :cond_2d
(( android.graphics.Paint ) v0 ).setUnderlineText ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setUnderlineText(Z)V
} // :cond_2e
/* const-wide v0, 0x1000000000L */
/* .line 455 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_2f
/* .line 456 */
v0 = this.b;
v1 = this.u;
this.u = v1;
} // :cond_2f
/* const-wide/32 v0, 0x40000 */
/* .line 457 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_30
/* .line 458 */
v0 = this.b;
v1 = this.v;
this.v = v1;
} // :cond_30
/* const-wide/32 v0, 0x80000 */
/* .line 459 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_31
/* .line 460 */
v0 = this.b;
v1 = this.w;
this.w = v1;
} // :cond_31
/* const-wide/32 v0, 0x200000 */
/* .line 461 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_32
/* .line 462 */
v0 = this.b;
v1 = this.y;
this.y = v1;
} // :cond_32
/* const-wide/32 v0, 0x400000 */
/* .line 463 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_33
/* .line 464 */
v0 = this.b;
v1 = this.z;
this.z = v1;
} // :cond_33
/* const-wide/32 v0, 0x800000 */
/* .line 465 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_34
/* .line 466 */
v0 = this.b;
v1 = this.A;
this.A = v1;
} // :cond_34
/* const-wide/32 v0, 0x1000000 */
/* .line 467 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_35
/* .line 468 */
v0 = this.b;
v1 = this.B;
this.B = v1;
} // :cond_35
/* const-wide/32 v0, 0x2000000 */
/* .line 469 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_36
/* .line 470 */
v0 = this.b;
v1 = this.C;
this.C = v1;
} // :cond_36
/* const-wide/32 v0, 0x100000 */
/* .line 471 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_37
/* .line 472 */
v0 = this.b;
v1 = this.x;
this.x = v1;
} // :cond_37
/* const-wide/32 v0, 0x10000000 */
/* .line 473 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_38
/* .line 474 */
v0 = this.b;
v1 = this.F;
this.F = v1;
} // :cond_38
/* const-wide/32 v0, 0x20000000 */
/* .line 475 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_39
/* .line 476 */
v0 = this.b;
v1 = this.G;
this.G = v1;
} // :cond_39
/* const-wide/32 v0, 0x40000000 */
/* .line 477 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_3a
/* .line 478 */
v0 = this.b;
v1 = this.H;
this.H = v1;
} // :cond_3a
/* const-wide/32 v0, 0x4000000 */
/* .line 479 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_3b
/* .line 480 */
v0 = this.b;
v1 = this.D;
this.D = v1;
} // :cond_3b
/* const-wide/32 v0, 0x8000000 */
/* .line 481 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_3c
/* .line 482 */
v0 = this.b;
v1 = this.E;
this.E = v1;
} // :cond_3c
/* const-wide v0, 0x200000000L */
/* .line 483 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_3d
/* .line 484 */
v0 = this.b;
v1 = this.K;
this.K = v1;
} // :cond_3d
/* const-wide v0, 0x400000000L */
/* .line 485 */
v0 = (( e.c.a.l2 ) p0 ).a ( p2, v0, v1 ); // invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_3e
/* .line 486 */
p1 = this.b;
p2 = this.L;
this.L = p2;
} // :cond_3e
return;
} // .end method
public final void a ( e.c.a.h2 p0, Boolean p1, e.c.a.i1 p2 ) {
/* .locals 2 */
/* .line 487 */
v0 = this.b;
if ( p2 != null) { // if-eqz p2, :cond_0
v0 = this.e;
} // :cond_0
v0 = this.g;
} // :goto_0
v0 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
/* .line 488 */
/* instance-of v1, p3, Le/c/a/r; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 489 */
/* check-cast p3, Le/c/a/r; */
/* iget p3, p3, Le/c/a/r;->b:I */
/* .line 490 */
} // :cond_1
/* instance-of p3, p3, Le/c/a/s; */
if ( p3 != null) { // if-eqz p3, :cond_3
/* .line 491 */
p3 = this.b;
p3 = this.o;
/* iget p3, p3, Le/c/a/r;->b:I */
/* .line 492 */
} // :goto_1
v0 = (( e.c.a.l2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->a(F)I
/* shl-int/lit8 v0, v0, 0x18 */
/* or-int/2addr p3, v0 */
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 493 */
p1 = this.e;
(( android.graphics.Paint ) p1 ).setColor ( p3 ); // invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V
/* .line 494 */
} // :cond_2
p1 = this.f;
(( android.graphics.Paint ) p1 ).setColor ( p3 ); // invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V
} // :cond_3
} // :goto_2
return;
} // .end method
public final void a ( e.c.a.k0 p0, java.lang.String p1 ) {
/* .locals 4 */
/* .line 979 */
v0 = this.a;
(( e.c.a.a2 ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_0 */
/* new-array p1, v1, [Ljava/lang/Object; */
/* aput-object p2, p1, v2 */
final String p2 = "Pattern reference \'%s\' not found"; // const-string p2, "Pattern reference \'%s\' not found"
/* .line 980 */
e.c.a.l2 .f ( p2,p1 );
return;
/* .line 981 */
} // :cond_0
/* instance-of v3, v0, Le/c/a/k0; */
/* if-nez v3, :cond_1 */
/* new-array p1, v2, [Ljava/lang/Object; */
final String p2 = "Pattern href attributes must point to other pattern elements"; // const-string p2, "Pattern href attributes must point to other pattern elements"
/* .line 982 */
e.c.a.l2 .e ( p2,p1 );
return;
} // :cond_1
/* if-ne v0, p1, :cond_2 */
/* new-array p1, v1, [Ljava/lang/Object; */
/* aput-object p2, p1, v2 */
final String p2 = "Circular reference in pattern href attribute \'%s\'"; // const-string p2, "Circular reference in pattern href attribute \'%s\'"
/* .line 983 */
e.c.a.l2 .e ( p2,p1 );
return;
/* .line 984 */
} // :cond_2
/* check-cast v0, Le/c/a/k0; */
/* .line 985 */
p2 = this.p;
/* if-nez p2, :cond_3 */
/* .line 986 */
p2 = this.p;
this.p = p2;
/* .line 987 */
} // :cond_3
p2 = this.q;
/* if-nez p2, :cond_4 */
/* .line 988 */
p2 = this.q;
this.q = p2;
/* .line 989 */
} // :cond_4
p2 = this.r;
/* if-nez p2, :cond_5 */
/* .line 990 */
p2 = this.r;
this.r = p2;
/* .line 991 */
} // :cond_5
p2 = this.s;
/* if-nez p2, :cond_6 */
/* .line 992 */
p2 = this.s;
this.s = p2;
/* .line 993 */
} // :cond_6
p2 = this.t;
/* if-nez p2, :cond_7 */
/* .line 994 */
p2 = this.t;
this.t = p2;
/* .line 995 */
} // :cond_7
p2 = this.u;
/* if-nez p2, :cond_8 */
/* .line 996 */
p2 = this.u;
this.u = p2;
/* .line 997 */
} // :cond_8
p2 = this.v;
/* if-nez p2, :cond_9 */
/* .line 998 */
p2 = this.v;
this.v = p2;
/* .line 999 */
} // :cond_9
p2 = p2 = this.i;
if ( p2 != null) { // if-eqz p2, :cond_a
/* .line 1000 */
p2 = this.i;
this.i = p2;
/* .line 1001 */
} // :cond_a
p2 = this.o;
/* if-nez p2, :cond_b */
/* .line 1002 */
p2 = this.o;
this.o = p2;
/* .line 1003 */
} // :cond_b
p2 = this.n;
/* if-nez p2, :cond_c */
/* .line 1004 */
p2 = this.n;
this.n = p2;
/* .line 1005 */
} // :cond_c
p2 = this.w;
if ( p2 != null) { // if-eqz p2, :cond_d
/* .line 1006 */
(( e.c.a.l2 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/k0;Ljava/lang/String;)V
} // :cond_d
return;
} // .end method
public final void a ( e.c.a.k1 p0, e.c.a.k1 p1 ) {
/* .locals 1 */
/* .line 745 */
v0 = this.m;
/* if-nez v0, :cond_0 */
/* .line 746 */
v0 = this.m;
this.m = v0;
/* .line 747 */
} // :cond_0
v0 = this.n;
/* if-nez v0, :cond_1 */
/* .line 748 */
v0 = this.n;
this.n = v0;
/* .line 749 */
} // :cond_1
v0 = this.o;
/* if-nez v0, :cond_2 */
/* .line 750 */
v0 = this.o;
this.o = v0;
/* .line 751 */
} // :cond_2
v0 = this.p;
/* if-nez v0, :cond_3 */
/* .line 752 */
v0 = this.p;
this.p = v0;
/* .line 753 */
} // :cond_3
v0 = this.q;
/* if-nez v0, :cond_4 */
/* .line 754 */
p2 = this.q;
this.q = p2;
} // :cond_4
return;
} // .end method
public final void a ( e.c.a.m0 p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Polygon render"; // const-string v1, "Polygon render"
/* .line 169 */
e.c.a.l2 .d ( v1,v0 );
/* .line 170 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 171 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 172 */
} // :cond_0
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_1 */
return;
/* .line 173 */
} // :cond_1
v0 = this.f;
/* iget-boolean v1, v0, Le/c/a/h2;->d:Z */
/* if-nez v1, :cond_2 */
/* iget-boolean v0, v0, Le/c/a/h2;->c:Z */
/* if-nez v0, :cond_2 */
return;
/* .line 174 */
} // :cond_2
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 175 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 176 */
} // :cond_3
v0 = this.o;
/* array-length v0, v0 */
int v1 = 2; // const/4 v1, 0x2
/* if-ge v0, v1, :cond_4 */
return;
/* .line 177 */
} // :cond_4
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/l0;)Landroid/graphics/Path;
/* .line 178 */
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
/* .line 179 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 180 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 181 */
v1 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 182 */
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 183 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V
/* .line 184 */
} // :cond_5
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->d:Z */
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 185 */
(( e.c.a.l2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V
/* .line 186 */
} // :cond_6
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/x;)V
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 187 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_7
return;
} // .end method
public final void a ( e.c.a.m1 p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Switch render"; // const-string v1, "Switch render"
/* .line 75 */
e.c.a.l2 .d ( v1,v0 );
/* .line 76 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 77 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 78 */
} // :cond_0
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 79 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 80 */
} // :cond_1
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 81 */
v0 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 82 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/m1;)V
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 83 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
/* .line 84 */
} // :cond_2
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
return;
} // .end method
public final void a ( e.c.a.n1 p0, e.c.a.b0 p1, e.c.a.b0 p2 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Symbol render"; // const-string v1, "Symbol render"
/* .line 292 */
e.c.a.l2 .d ( v1,v0 );
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 293 */
v0 = (( e.c.a.b0 ) p2 ).d ( ); // invoke-virtual {p2}, Le/c/a/b0;->d()Z
/* if-nez v0, :cond_1 */
} // :cond_0
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 294 */
v0 = (( e.c.a.b0 ) p3 ).d ( ); // invoke-virtual {p3}, Le/c/a/b0;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
return;
/* .line 295 */
} // :cond_2
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_3
v0 = e.c.a.m.d;
/* .line 296 */
} // :goto_0
v1 = this.f;
(( e.c.a.l2 ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 297 */
p2 = (( e.c.a.b0 ) p2 ).b ( p0 ); // invoke-virtual {p2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_4
p2 = this.f;
p2 = this.g;
/* iget p2, p2, Le/c/a/n;->d:F */
} // :goto_1
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 298 */
p3 = (( e.c.a.b0 ) p3 ).b ( p0 ); // invoke-virtual {p3, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_5
p3 = this.f;
p3 = this.g;
/* iget p3, p3, Le/c/a/n;->e:F */
/* .line 299 */
} // :goto_2
v1 = this.f;
/* new-instance v2, Le/c/a/n; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, v3, v3, p2, p3}, Le/c/a/n;-><init>(FFFF)V */
this.g = v2;
/* .line 300 */
p2 = this.f;
p2 = this.b;
p2 = this.w;
p2 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p2, :cond_6 */
/* .line 301 */
p2 = this.f;
p2 = this.g;
/* iget p3, p2, Le/c/a/n;->b:F */
/* iget v1, p2, Le/c/a/n;->c:F */
/* iget v2, p2, Le/c/a/n;->d:F */
/* iget p2, p2, Le/c/a/n;->e:F */
(( e.c.a.l2 ) p0 ).a ( p3, v1, v2, p2 ); // invoke-virtual {p0, p3, v1, v2, p2}, Le/c/a/l2;->a(FFFF)V
/* .line 302 */
} // :cond_6
p2 = this.o;
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 303 */
p3 = this.a;
v1 = this.f;
v1 = this.g;
(( e.c.a.l2 ) p0 ).a ( v1, p2, v0 ); // invoke-virtual {p0, v1, p2, v0}, Le/c/a/l2;->a(Le/c/a/n;Le/c/a/n;Le/c/a/m;)Landroid/graphics/Matrix;
(( android.graphics.Canvas ) p3 ).concat ( p2 ); // invoke-virtual {p3, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 304 */
p2 = this.f;
p3 = this.o;
this.h = p3;
/* .line 305 */
} // :cond_7
p2 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
int p3 = 1; // const/4 p3, 0x1
/* .line 306 */
(( e.c.a.l2 ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Le/c/a/l2;->a(Le/c/a/d1;Z)V
if ( p2 != null) { // if-eqz p2, :cond_8
/* .line 307 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
/* .line 308 */
} // :cond_8
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
return;
} // .end method
public final void a ( e.c.a.q1 p0 ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v1, v0, [Ljava/lang/Object; */
final String v2 = "Text render"; // const-string v2, "Text render"
/* .line 188 */
e.c.a.l2 .d ( v2,v1 );
/* .line 189 */
v1 = this.f;
(( e.c.a.l2 ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 190 */
v1 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v1, :cond_0 */
return;
/* .line 191 */
} // :cond_0
v1 = this.r;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 192 */
v2 = this.a;
(( android.graphics.Canvas ) v2 ).concat ( v1 ); // invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 193 */
} // :cond_1
v1 = this.n;
int v2 = 0; // const/4 v2, 0x0
v1 = if ( v1 != null) { // if-eqz v1, :cond_3
/* if-nez v1, :cond_2 */
} // :cond_2
v1 = this.n;
/* check-cast v1, Le/c/a/b0; */
v1 = (( e.c.a.b0 ) v1 ).b ( p0 ); // invoke-virtual {v1, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_3
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* .line 194 */
} // :goto_1
v3 = this.o;
v3 = if ( v3 != null) { // if-eqz v3, :cond_5
/* if-nez v3, :cond_4 */
} // :cond_4
v3 = this.o;
/* check-cast v3, Le/c/a/b0; */
v3 = (( e.c.a.b0 ) v3 ).c ( p0 ); // invoke-virtual {v3, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_5
} // :goto_2
int v3 = 0; // const/4 v3, 0x0
/* .line 195 */
} // :goto_3
v4 = this.p;
v4 = if ( v4 != null) { // if-eqz v4, :cond_7
/* if-nez v4, :cond_6 */
} // :cond_6
v4 = this.p;
/* check-cast v4, Le/c/a/b0; */
v4 = (( e.c.a.b0 ) v4 ).b ( p0 ); // invoke-virtual {v4, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_7
} // :goto_4
int v4 = 0; // const/4 v4, 0x0
/* .line 196 */
} // :goto_5
v5 = this.q;
v5 = if ( v5 != null) { // if-eqz v5, :cond_9
/* if-nez v5, :cond_8 */
} // :cond_8
v2 = this.q;
/* check-cast v0, Le/c/a/b0; */
v2 = (( e.c.a.b0 ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 197 */
} // :cond_9
} // :goto_6
(( e.c.a.l2 ) p0 ).e ( ); // invoke-virtual {p0}, Le/c/a/l2;->e()Le/c/a/u0;
/* .line 198 */
v5 = e.c.a.u0.b;
/* if-eq v0, v5, :cond_b */
/* .line 199 */
v5 = (( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/s1;)F
/* .line 200 */
v6 = e.c.a.u0.c;
/* if-ne v0, v6, :cond_a */
/* const/high16 v0, 0x40000000 # 2.0f */
/* div-float/2addr v5, v0 */
} // :cond_a
/* sub-float/2addr v1, v5 */
/* .line 201 */
} // :cond_b
v0 = this.h;
/* if-nez v0, :cond_c */
/* .line 202 */
/* new-instance v0, Le/c/a/i2; */
/* invoke-direct {v0, p0, v1, v3}, Le/c/a/i2;-><init>(Le/c/a/l2;FF)V */
/* .line 203 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V
/* .line 204 */
/* new-instance v5, Le/c/a/n; */
v6 = this.c;
/* iget v7, v6, Landroid/graphics/RectF;->left:F */
/* iget v8, v6, Landroid/graphics/RectF;->top:F */
v6 = (( android.graphics.RectF ) v6 ).width ( ); // invoke-virtual {v6}, Landroid/graphics/RectF;->width()F
v0 = this.c;
v0 = (( android.graphics.RectF ) v0 ).height ( ); // invoke-virtual {v0}, Landroid/graphics/RectF;->height()F
/* invoke-direct {v5, v7, v8, v6, v0}, Le/c/a/n;-><init>(FFFF)V */
this.h = v5;
/* .line 205 */
} // :cond_c
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
/* .line 206 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 207 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 208 */
v0 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 209 */
/* new-instance v5, Le/c/a/f2; */
/* add-float/2addr v1, v4 */
/* add-float/2addr v3, v2 */
/* invoke-direct {v5, p0, v1, v3}, Le/c/a/f2;-><init>(Le/c/a/l2;FF)V */
(( e.c.a.l2 ) p0 ).a ( p1, v5 ); // invoke-virtual {p0, p1, v5}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 210 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_d
return;
} // .end method
public final void a ( e.c.a.q1 p0, android.graphics.Path p1, android.graphics.Matrix p2 ) {
/* .locals 9 */
/* .line 845 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 846 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 847 */
} // :cond_0
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 848 */
(( android.graphics.Matrix ) p3 ).preConcat ( v0 ); // invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z
/* .line 849 */
} // :cond_1
v0 = this.n;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
v0 = if ( v0 != null) { // if-eqz v0, :cond_3
/* if-nez v0, :cond_2 */
} // :cond_2
v0 = this.n;
/* check-cast v0, Le/c/a/b0; */
v0 = (( e.c.a.b0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_3
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 850 */
} // :goto_1
v3 = this.o;
v3 = if ( v3 != null) { // if-eqz v3, :cond_5
/* if-nez v3, :cond_4 */
} // :cond_4
v3 = this.o;
/* check-cast v3, Le/c/a/b0; */
v3 = (( e.c.a.b0 ) v3 ).c ( p0 ); // invoke-virtual {v3, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_5
} // :goto_2
int v3 = 0; // const/4 v3, 0x0
/* .line 851 */
} // :goto_3
v4 = this.p;
v4 = if ( v4 != null) { // if-eqz v4, :cond_7
/* if-nez v4, :cond_6 */
} // :cond_6
v4 = this.p;
/* check-cast v4, Le/c/a/b0; */
v4 = (( e.c.a.b0 ) v4 ).b ( p0 ); // invoke-virtual {v4, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_7
} // :goto_4
int v4 = 0; // const/4 v4, 0x0
/* .line 852 */
} // :goto_5
v5 = this.q;
v5 = if ( v5 != null) { // if-eqz v5, :cond_9
/* if-nez v5, :cond_8 */
} // :cond_8
v2 = this.q;
/* check-cast v1, Le/c/a/b0; */
v2 = (( e.c.a.b0 ) v1 ).c ( p0 ); // invoke-virtual {v1, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 853 */
} // :cond_9
} // :goto_6
v1 = this.f;
v1 = this.b;
v1 = this.v;
v5 = e.c.a.u0.b;
/* if-eq v1, v5, :cond_b */
/* .line 854 */
v1 = (( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/s1;)F
/* .line 855 */
v5 = this.f;
v5 = this.b;
v5 = this.v;
v6 = e.c.a.u0.c;
/* if-ne v5, v6, :cond_a */
/* const/high16 v5, 0x40000000 # 2.0f */
/* div-float/2addr v1, v5 */
} // :cond_a
/* sub-float/2addr v0, v1 */
/* .line 856 */
} // :cond_b
v1 = this.h;
/* if-nez v1, :cond_c */
/* .line 857 */
/* new-instance v1, Le/c/a/i2; */
/* invoke-direct {v1, p0, v0, v3}, Le/c/a/i2;-><init>(Le/c/a/l2;FF)V */
/* .line 858 */
(( e.c.a.l2 ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V
/* .line 859 */
/* new-instance v5, Le/c/a/n; */
v6 = this.c;
/* iget v7, v6, Landroid/graphics/RectF;->left:F */
/* iget v8, v6, Landroid/graphics/RectF;->top:F */
v6 = (( android.graphics.RectF ) v6 ).width ( ); // invoke-virtual {v6}, Landroid/graphics/RectF;->width()F
v1 = this.c;
v1 = (( android.graphics.RectF ) v1 ).height ( ); // invoke-virtual {v1}, Landroid/graphics/RectF;->height()F
/* invoke-direct {v5, v7, v8, v6, v1}, Le/c/a/n;-><init>(FFFF)V */
this.h = v5;
/* .line 860 */
} // :cond_c
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 861 */
/* new-instance v1, Landroid/graphics/Path; */
/* invoke-direct {v1}, Landroid/graphics/Path;-><init>()V */
/* .line 862 */
/* new-instance v5, Le/c/a/g2; */
/* add-float/2addr v0, v4 */
/* add-float/2addr v3, v2 */
/* invoke-direct {v5, p0, v0, v3, v1}, Le/c/a/g2;-><init>(Le/c/a/l2;FFLandroid/graphics/Path;)V */
(( e.c.a.l2 ) p0 ).a ( p1, v5 ); // invoke-virtual {p0, p1, v5}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V
/* .line 863 */
(( e.c.a.l2 ) p0 ).f ( ); // invoke-virtual {p0}, Le/c/a/l2;->f()Landroid/graphics/Path$FillType;
(( android.graphics.Path ) p2 ).setFillType ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V
/* .line 864 */
(( android.graphics.Path ) p2 ).addPath ( v1, p3 ); // invoke-virtual {p2, v1, p3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V
return;
} // .end method
public final void a ( e.c.a.s1 p0, e.c.a.j2 p1 ) {
/* .locals 4 */
/* .line 211 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 212 */
} // :cond_0
p1 = this.i;
int v0 = 1; // const/4 v0, 0x1
int v1 = 1; // const/4 v1, 0x1
/* .line 213 */
v2 = } // :goto_0
/* if-nez v2, :cond_1 */
return;
/* .line 214 */
} // :cond_1
/* check-cast v2, Le/c/a/h1; */
/* .line 215 */
/* instance-of v3, v2, Le/c/a/w1; */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 216 */
/* check-cast v2, Le/c/a/w1; */
v3 = v2 = this.c;
/* xor-int/2addr v3, v0 */
(( e.c.a.l2 ) p0 ).a ( v2, v1, v3 ); // invoke-virtual {p0, v2, v1, v3}, Le/c/a/l2;->a(Ljava/lang/String;ZZ)Ljava/lang/String;
(( e.c.a.j2 ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Le/c/a/j2;->a(Ljava/lang/String;)V
/* .line 217 */
} // :cond_2
(( e.c.a.l2 ) p0 ).a ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Le/c/a/l2;->a(Le/c/a/h1;Le/c/a/j2;)V
} // :goto_1
int v1 = 0; // const/4 v1, 0x0
} // .end method
public final void a ( e.c.a.s1 p0, java.lang.StringBuilder p1 ) {
/* .locals 4 */
/* .line 278 */
p1 = this.i;
int v0 = 1; // const/4 v0, 0x1
int v1 = 1; // const/4 v1, 0x1
/* .line 279 */
v2 = } // :goto_0
/* if-nez v2, :cond_0 */
return;
/* .line 280 */
} // :cond_0
/* check-cast v2, Le/c/a/h1; */
/* .line 281 */
/* instance-of v3, v2, Le/c/a/s1; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 282 */
/* check-cast v2, Le/c/a/s1; */
(( e.c.a.l2 ) p0 ).a ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Le/c/a/l2;->a(Le/c/a/s1;Ljava/lang/StringBuilder;)V
/* .line 283 */
} // :cond_1
/* instance-of v3, v2, Le/c/a/w1; */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 284 */
/* check-cast v2, Le/c/a/w1; */
v3 = v2 = this.c;
/* xor-int/2addr v3, v0 */
(( e.c.a.l2 ) p0 ).a ( v2, v1, v3 ); // invoke-virtual {p0, v2, v1, v3}, Le/c/a/l2;->a(Ljava/lang/String;ZZ)Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_2
} // :goto_1
int v1 = 0; // const/4 v1, 0x0
} // .end method
public final void a ( e.c.a.t1 p0 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v1, v0, [Ljava/lang/Object; */
final String v2 = "TextPath render"; // const-string v2, "TextPath render"
/* .line 255 */
e.c.a.l2 .d ( v2,v1 );
/* .line 256 */
v1 = this.f;
(( e.c.a.l2 ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 257 */
v1 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v1, :cond_0 */
return;
/* .line 258 */
} // :cond_0
v1 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v1, :cond_1 */
return;
/* .line 259 */
} // :cond_1
v1 = this.a;
v2 = this.n;
(( e.c.a.a2 ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
/* if-nez v1, :cond_2 */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
/* .line 260 */
p1 = this.n;
/* aput-object p1, v1, v0 */
final String p1 = "TextPath reference \'%s\' not found"; // const-string p1, "TextPath reference \'%s\' not found"
e.c.a.l2 .e ( p1,v1 );
return;
/* .line 261 */
} // :cond_2
/* check-cast v1, Le/c/a/h0; */
/* .line 262 */
/* new-instance v2, Le/c/a/d2; */
v3 = this.o;
/* invoke-direct {v2, p0, v3}, Le/c/a/d2;-><init>(Le/c/a/l2;Le/c/a/i0;)V */
(( e.c.a.d2 ) v2 ).a ( ); // invoke-virtual {v2}, Le/c/a/d2;->a()Landroid/graphics/Path;
/* .line 263 */
v1 = this.n;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 264 */
(( android.graphics.Path ) v2 ).transform ( v1 ); // invoke-virtual {v2, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V
/* .line 265 */
} // :cond_3
/* new-instance v1, Landroid/graphics/PathMeasure; */
/* invoke-direct {v1, v2, v0}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V */
/* .line 266 */
v0 = this.o;
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_4
v1 = (( android.graphics.PathMeasure ) v1 ).getLength ( ); // invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F
v0 = (( e.c.a.b0 ) v0 ).a ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* .line 267 */
} // :goto_0
(( e.c.a.l2 ) p0 ).e ( ); // invoke-virtual {p0}, Le/c/a/l2;->e()Le/c/a/u0;
/* .line 268 */
v4 = e.c.a.u0.b;
/* if-eq v1, v4, :cond_6 */
/* .line 269 */
v4 = (( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/s1;)F
/* .line 270 */
v5 = e.c.a.u0.c;
/* if-ne v1, v5, :cond_5 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v4, v1 */
} // :cond_5
/* sub-float/2addr v0, v4 */
/* .line 271 */
} // :cond_6
(( e.c.a.t1 ) p1 ).d ( ); // invoke-virtual {p1}, Le/c/a/t1;->d()Le/c/a/v1;
/* check-cast v1, Le/c/a/e1; */
(( e.c.a.l2 ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 272 */
v1 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 273 */
/* new-instance v4, Le/c/a/e2; */
/* invoke-direct {v4, p0, v2, v0, v3}, Le/c/a/e2;-><init>(Le/c/a/l2;Landroid/graphics/Path;FF)V */
(( e.c.a.l2 ) p0 ).a ( p1, v4 ); // invoke-virtual {p0, p1, v4}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 274 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_7
return;
} // .end method
public final void a ( Object p0, java.lang.String p1 ) {
/* .locals 4 */
/* .line 718 */
v0 = this.a;
(( e.c.a.a2 ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-nez v0, :cond_0 */
/* new-array p1, v1, [Ljava/lang/Object; */
/* aput-object p2, p1, v2 */
final String p2 = "Gradient reference \'%s\' not found"; // const-string p2, "Gradient reference \'%s\' not found"
/* .line 719 */
e.c.a.l2 .f ( p2,p1 );
return;
/* .line 720 */
} // :cond_0
/* instance-of v3, v0, Le/c/a/v; */
/* if-nez v3, :cond_1 */
/* new-array p1, v2, [Ljava/lang/Object; */
final String p2 = "Gradient href attributes must point to other gradient elements"; // const-string p2, "Gradient href attributes must point to other gradient elements"
/* .line 721 */
e.c.a.l2 .e ( p2,p1 );
return;
} // :cond_1
/* if-ne v0, p1, :cond_2 */
/* new-array p1, v1, [Ljava/lang/Object; */
/* aput-object p2, p1, v2 */
final String p2 = "Circular reference in gradient href attribute \'%s\'"; // const-string p2, "Circular reference in gradient href attribute \'%s\'"
/* .line 722 */
e.c.a.l2 .e ( p2,p1 );
return;
/* .line 723 */
} // :cond_2
/* move-object p2, v0 */
/* check-cast p2, Le/c/a/v; */
/* .line 724 */
v1 = this.i;
/* if-nez v1, :cond_3 */
/* .line 725 */
v1 = this.i;
this.i = v1;
/* .line 726 */
} // :cond_3
v1 = this.j;
/* if-nez v1, :cond_4 */
/* .line 727 */
v1 = this.j;
this.j = v1;
/* .line 728 */
} // :cond_4
v1 = this.k;
/* if-nez v1, :cond_5 */
/* .line 729 */
v1 = this.k;
this.k = v1;
/* .line 730 */
} // :cond_5
v1 = v1 = this.h;
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 731 */
v1 = this.h;
this.h = v1;
/* .line 732 */
} // :cond_6
try { // :try_start_0
/* instance-of v1, p1, Le/c/a/g1; */
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 733 */
/* move-object v1, p1 */
/* check-cast v1, Le/c/a/g1; */
/* check-cast v0, Le/c/a/g1; */
(( e.c.a.l2 ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/c/a/l2;->a(Le/c/a/g1;Le/c/a/g1;)V
/* .line 734 */
} // :cond_7
/* move-object v1, p1 */
/* check-cast v1, Le/c/a/k1; */
/* check-cast v0, Le/c/a/k1; */
(( e.c.a.l2 ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/c/a/l2;->a(Le/c/a/k1;Le/c/a/k1;)V
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* nop */
/* .line 735 */
} // :goto_0
p2 = this.l;
if ( p2 != null) { // if-eqz p2, :cond_8
/* .line 736 */
(( e.c.a.l2 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/v;Ljava/lang/String;)V
} // :cond_8
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 8 */
/* .line 529 */
v0 = this.f;
v0 = this.b;
v1 = this.y;
/* if-nez v1, :cond_0 */
v1 = this.z;
/* if-nez v1, :cond_0 */
v0 = this.A;
/* if-nez v0, :cond_0 */
return;
/* .line 530 */
} // :cond_0
v0 = this.f;
v0 = this.b;
v0 = this.y;
final String v1 = "Marker reference \'%s\' not found"; // const-string v1, "Marker reference \'%s\' not found"
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 531 */
v5 = this.a;
(( e.c.a.a2 ) v5 ).b ( v0 ); // invoke-virtual {v5, v0}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 532 */
/* check-cast v0, Le/c/a/d0; */
} // :cond_1
/* new-array v0, v4, [Ljava/lang/Object; */
/* .line 533 */
v5 = this.f;
v5 = this.b;
v5 = this.y;
/* aput-object v5, v0, v2 */
e.c.a.l2 .e ( v1,v0 );
} // :cond_2
/* move-object v0, v3 */
/* .line 534 */
} // :goto_0
v5 = this.f;
v5 = this.b;
v5 = this.z;
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 535 */
v6 = this.a;
(( e.c.a.a2 ) v6 ).b ( v5 ); // invoke-virtual {v6, v5}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 536 */
/* check-cast v5, Le/c/a/d0; */
} // :cond_3
/* new-array v5, v4, [Ljava/lang/Object; */
/* .line 537 */
v6 = this.f;
v6 = this.b;
v6 = this.z;
/* aput-object v6, v5, v2 */
e.c.a.l2 .e ( v1,v5 );
} // :cond_4
/* move-object v5, v3 */
/* .line 538 */
} // :goto_1
v6 = this.f;
v6 = this.b;
v6 = this.A;
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 539 */
v7 = this.a;
(( e.c.a.a2 ) v7 ).b ( v6 ); // invoke-virtual {v7, v6}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 540 */
/* check-cast v6, Le/c/a/d0; */
} // :cond_5
/* new-array v6, v4, [Ljava/lang/Object; */
/* .line 541 */
v7 = this.f;
v7 = this.b;
v7 = this.A;
/* aput-object v7, v6, v2 */
e.c.a.l2 .e ( v1,v6 );
} // :cond_6
/* move-object v6, v3 */
/* .line 542 */
} // :goto_2
/* instance-of v1, p1, Le/c/a/h0; */
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 543 */
/* new-instance v1, Le/c/a/b2; */
/* check-cast p1, Le/c/a/h0; */
p1 = this.o;
/* invoke-direct {v1, p0, p1}, Le/c/a/b2;-><init>(Le/c/a/l2;Le/c/a/i0;)V */
(( e.c.a.b2 ) v1 ).a ( ); // invoke-virtual {v1}, Le/c/a/b2;->a()Ljava/util/List;
/* .line 544 */
} // :cond_7
/* instance-of v1, p1, Le/c/a/c0; */
if ( v1 != null) { // if-eqz v1, :cond_8
/* .line 545 */
/* check-cast p1, Le/c/a/c0; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/c0;)Ljava/util/List;
/* .line 546 */
} // :cond_8
/* check-cast p1, Le/c/a/l0; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/l0;)Ljava/util/List;
} // :goto_3
/* if-nez p1, :cond_9 */
return;
/* .line 547 */
v1 = } // :cond_9
/* if-nez v1, :cond_a */
return;
/* .line 548 */
} // :cond_a
v7 = this.f;
v7 = this.b;
this.A = v3;
this.z = v3;
this.y = v3;
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 549 */
/* check-cast v2, Le/c/a/c2; */
(( e.c.a.l2 ) p0 ).a ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Le/c/a/l2;->a(Le/c/a/d0;Le/c/a/c2;)V
} // :cond_b
if ( v5 != null) { // if-eqz v5, :cond_d
int v0 = 1; // const/4 v0, 0x1
} // :goto_4
/* add-int/lit8 v2, v1, -0x1 */
/* if-lt v0, v2, :cond_c */
/* .line 550 */
} // :cond_c
/* check-cast v2, Le/c/a/c2; */
(( e.c.a.l2 ) p0 ).a ( v5, v2 ); // invoke-virtual {p0, v5, v2}, Le/c/a/l2;->a(Le/c/a/d0;Le/c/a/c2;)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_d
} // :goto_5
if ( v6 != null) { // if-eqz v6, :cond_e
/* sub-int/2addr v1, v4 */
/* .line 551 */
/* check-cast p1, Le/c/a/c2; */
(( e.c.a.l2 ) p0 ).a ( v6, p1 ); // invoke-virtual {p0, v6, p1}, Le/c/a/l2;->a(Le/c/a/d0;Le/c/a/c2;)V
} // :cond_e
return;
} // .end method
public final void a ( Object p0, android.graphics.Path p1, android.graphics.Matrix p2 ) {
/* .locals 1 */
/* .line 820 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 821 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 822 */
} // :cond_0
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_1 */
return;
/* .line 823 */
} // :cond_1
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 824 */
(( android.graphics.Matrix ) p3 ).preConcat ( v0 ); // invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z
/* .line 825 */
} // :cond_2
/* instance-of v0, p1, Le/c/a/n0; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 826 */
/* move-object v0, p1 */
/* check-cast v0, Le/c/a/n0; */
(( e.c.a.l2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->a(Le/c/a/n0;)Landroid/graphics/Path;
/* .line 827 */
} // :cond_3
/* instance-of v0, p1, Le/c/a/p; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 828 */
/* move-object v0, p1 */
/* check-cast v0, Le/c/a/p; */
(( e.c.a.l2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->a(Le/c/a/p;)Landroid/graphics/Path;
/* .line 829 */
} // :cond_4
/* instance-of v0, p1, Le/c/a/u; */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 830 */
/* move-object v0, p1 */
/* check-cast v0, Le/c/a/u; */
(( e.c.a.l2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->a(Le/c/a/u;)Landroid/graphics/Path;
/* .line 831 */
} // :cond_5
/* instance-of v0, p1, Le/c/a/l0; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 832 */
/* move-object v0, p1 */
/* check-cast v0, Le/c/a/l0; */
(( e.c.a.l2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->b(Le/c/a/l0;)Landroid/graphics/Path;
/* .line 833 */
} // :goto_0
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 834 */
(( android.graphics.Path ) v0 ).getFillType ( ); // invoke-virtual {v0}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;
(( android.graphics.Path ) p2 ).setFillType ( p1 ); // invoke-virtual {p2, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V
/* .line 835 */
(( android.graphics.Path ) p2 ).addPath ( v0, p3 ); // invoke-virtual {p2, v0, p3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V
} // :cond_6
return;
} // .end method
public final void a ( e.c.a.y1 p0 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v1, v0, [Ljava/lang/Object; */
final String v2 = "Use render"; // const-string v2, "Use render"
/* .line 85 */
e.c.a.l2 .d ( v2,v1 );
/* .line 86 */
v1 = this.r;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = (( e.c.a.b0 ) v1 ).d ( ); // invoke-virtual {v1}, Le/c/a/b0;->d()Z
/* if-nez v1, :cond_1 */
/* .line 87 */
} // :cond_0
v1 = this.s;
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = (( e.c.a.b0 ) v1 ).d ( ); // invoke-virtual {v1}, Le/c/a/b0;->d()Z
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_1
return;
/* .line 88 */
} // :cond_2
v1 = this.f;
(( e.c.a.l2 ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 89 */
v1 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v1, :cond_3 */
return;
/* .line 90 */
} // :cond_3
v1 = this.a;
v2 = this.o;
(( e.c.a.a2 ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
/* if-nez v1, :cond_4 */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
/* .line 91 */
p1 = this.o;
/* aput-object p1, v1, v0 */
final String p1 = "Use reference \'%s\' not found"; // const-string p1, "Use reference \'%s\' not found"
e.c.a.l2 .e ( p1,v1 );
return;
/* .line 92 */
} // :cond_4
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 93 */
v2 = this.a;
(( android.graphics.Canvas ) v2 ).concat ( v0 ); // invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 94 */
} // :cond_5
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
/* .line 95 */
v2 = this.p;
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_6
v2 = (( e.c.a.b0 ) v2 ).b ( p0 ); // invoke-virtual {v2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_6
int v2 = 0; // const/4 v2, 0x0
/* .line 96 */
} // :goto_0
v4 = this.q;
if ( v4 != null) { // if-eqz v4, :cond_7
v3 = (( e.c.a.b0 ) v4 ).c ( p0 ); // invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 97 */
} // :cond_7
(( android.graphics.Matrix ) v0 ).preTranslate ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 98 */
v2 = this.a;
(( android.graphics.Canvas ) v2 ).concat ( v0 ); // invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 99 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 100 */
v0 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 101 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/d1;)V
/* .line 102 */
/* instance-of v2, v1, Le/c/a/z0; */
if ( v2 != null) { // if-eqz v2, :cond_a
/* .line 103 */
(( e.c.a.l2 ) p0 ).r ( ); // invoke-virtual {p0}, Le/c/a/l2;->r()V
/* .line 104 */
/* check-cast v1, Le/c/a/z0; */
/* .line 105 */
v2 = this.r;
if ( v2 != null) { // if-eqz v2, :cond_8
} // :cond_8
v2 = this.r;
/* .line 106 */
} // :goto_1
v3 = this.s;
if ( v3 != null) { // if-eqz v3, :cond_9
} // :cond_9
v3 = this.s;
/* .line 107 */
} // :goto_2
(( e.c.a.l2 ) p0 ).a ( v1, v2, v3 ); // invoke-virtual {p0, v1, v2, v3}, Le/c/a/l2;->a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;)V
/* .line 108 */
(( e.c.a.l2 ) p0 ).q ( ); // invoke-virtual {p0}, Le/c/a/l2;->q()V
/* .line 109 */
} // :cond_a
/* instance-of v2, v1, Le/c/a/n1; */
if ( v2 != null) { // if-eqz v2, :cond_d
/* .line 110 */
v2 = this.r;
/* const/high16 v3, 0x42c80000 # 100.0f */
if ( v2 != null) { // if-eqz v2, :cond_b
} // :cond_b
/* new-instance v2, Le/c/a/b0; */
v4 = e.c.a.x1.j;
/* invoke-direct {v2, v3, v4}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V */
/* .line 111 */
} // :goto_3
v4 = this.s;
if ( v4 != null) { // if-eqz v4, :cond_c
} // :cond_c
/* new-instance v4, Le/c/a/b0; */
v5 = e.c.a.x1.j;
/* invoke-direct {v4, v3, v5}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V */
/* .line 112 */
} // :goto_4
(( e.c.a.l2 ) p0 ).r ( ); // invoke-virtual {p0}, Le/c/a/l2;->r()V
/* .line 113 */
/* check-cast v1, Le/c/a/n1; */
(( e.c.a.l2 ) p0 ).a ( v1, v2, v4 ); // invoke-virtual {p0, v1, v2, v4}, Le/c/a/l2;->a(Le/c/a/n1;Le/c/a/b0;Le/c/a/b0;)V
/* .line 114 */
(( e.c.a.l2 ) p0 ).q ( ); // invoke-virtual {p0}, Le/c/a/l2;->q()V
/* .line 115 */
} // :cond_d
(( e.c.a.l2 ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Le/c/a/l2;->c(Le/c/a/h1;)V
/* .line 116 */
} // :goto_5
(( e.c.a.l2 ) p0 ).l ( ); // invoke-virtual {p0}, Le/c/a/l2;->l()V
if ( v0 != null) { // if-eqz v0, :cond_e
/* .line 117 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
/* .line 118 */
} // :cond_e
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
return;
} // .end method
public final void a ( e.c.a.y1 p0, android.graphics.Path p1, android.graphics.Matrix p2 ) {
/* .locals 2 */
/* .line 836 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 837 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 838 */
} // :cond_0
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_1 */
return;
/* .line 839 */
} // :cond_1
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 840 */
(( android.graphics.Matrix ) p3 ).preConcat ( v0 ); // invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z
/* .line 841 */
} // :cond_2
v0 = this.a;
v1 = this.o;
(( e.c.a.a2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_3 */
int p2 = 1; // const/4 p2, 0x1
/* new-array p2, p2, [Ljava/lang/Object; */
/* .line 842 */
p1 = this.o;
/* aput-object p1, p2, v1 */
final String p1 = "Use reference \'%s\' not found"; // const-string p1, "Use reference \'%s\' not found"
e.c.a.l2 .e ( p1,p2 );
return;
/* .line 843 */
} // :cond_3
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 844 */
(( e.c.a.l2 ) p0 ).a ( v0, v1, p2, p3 ); // invoke-virtual {p0, v0, v1, p2, p3}, Le/c/a/l2;->a(Le/c/a/h1;ZLandroid/graphics/Path;Landroid/graphics/Matrix;)V
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Group render"; // const-string v1, "Group render"
/* .line 65 */
e.c.a.l2 .d ( v1,v0 );
/* .line 66 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 67 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 68 */
} // :cond_0
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 69 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 70 */
} // :cond_1
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 71 */
v0 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
int v1 = 1; // const/4 v1, 0x1
/* .line 72 */
(( e.c.a.l2 ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/c/a/l2;->a(Le/c/a/d1;Z)V
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 73 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
/* .line 74 */
} // :cond_2
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
return;
} // .end method
public final void a ( e.c.a.z0 p0 ) {
/* .locals 2 */
/* .line 39 */
v0 = this.r;
v1 = this.s;
(( e.c.a.l2 ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/c/a/l2;->a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;)V
return;
} // .end method
public final void a ( e.c.a.z0 p0, e.c.a.b0 p1, e.c.a.b0 p2 ) {
/* .locals 6 */
/* .line 40 */
v4 = this.o;
v5 = this.n;
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* invoke-virtual/range {v0 ..v5}, Le/c/a/l2;->a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;Le/c/a/n;Le/c/a/m;)V */
return;
} // .end method
public final void a ( e.c.a.z0 p0, e.c.a.b0 p1, e.c.a.b0 p2, Object p3, Object p4 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Svg render"; // const-string v1, "Svg render"
/* .line 41 */
e.c.a.l2 .d ( v1,v0 );
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 42 */
v0 = (( e.c.a.b0 ) p2 ).d ( ); // invoke-virtual {p2}, Le/c/a/b0;->d()Z
/* if-nez v0, :cond_1 */
} // :cond_0
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 43 */
v0 = (( e.c.a.b0 ) p3 ).d ( ); // invoke-virtual {p3}, Le/c/a/b0;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
return;
} // :cond_2
/* if-nez p5, :cond_4 */
/* .line 44 */
p5 = this.n;
if ( p5 != null) { // if-eqz p5, :cond_3
} // :cond_3
p5 = e.c.a.m.d;
/* .line 45 */
} // :cond_4
} // :goto_0
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 46 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_5 */
return;
/* .line 47 */
} // :cond_5
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 48 */
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = (( e.c.a.b0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_6
int v0 = 0; // const/4 v0, 0x0
/* .line 49 */
} // :goto_1
v2 = this.q;
if ( v2 != null) { // if-eqz v2, :cond_7
v1 = (( e.c.a.b0 ) v2 ).c ( p0 ); // invoke-virtual {v2, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_7
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :cond_8
int v0 = 0; // const/4 v0, 0x0
/* .line 50 */
} // :goto_2
(( e.c.a.l2 ) p0 ).i ( ); // invoke-virtual {p0}, Le/c/a/l2;->i()Le/c/a/n;
if ( p2 != null) { // if-eqz p2, :cond_9
/* .line 51 */
p2 = (( e.c.a.b0 ) p2 ).b ( p0 ); // invoke-virtual {p2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_9
/* iget p2, v2, Le/c/a/n;->d:F */
} // :goto_3
if ( p3 != null) { // if-eqz p3, :cond_a
/* .line 52 */
p3 = (( e.c.a.b0 ) p3 ).c ( p0 ); // invoke-virtual {p3, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_a
/* iget p3, v2, Le/c/a/n;->e:F */
/* .line 53 */
} // :goto_4
v2 = this.f;
/* new-instance v3, Le/c/a/n; */
/* invoke-direct {v3, v1, v0, p2, p3}, Le/c/a/n;-><init>(FFFF)V */
this.g = v3;
/* .line 54 */
p2 = this.f;
p2 = this.b;
p2 = this.w;
p2 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p2, :cond_b */
/* .line 55 */
p2 = this.f;
p2 = this.g;
/* iget p3, p2, Le/c/a/n;->b:F */
/* iget v2, p2, Le/c/a/n;->c:F */
/* iget v3, p2, Le/c/a/n;->d:F */
/* iget p2, p2, Le/c/a/n;->e:F */
(( e.c.a.l2 ) p0 ).a ( p3, v2, v3, p2 ); // invoke-virtual {p0, p3, v2, v3, p2}, Le/c/a/l2;->a(FFFF)V
/* .line 56 */
} // :cond_b
p2 = this.f;
p2 = this.g;
(( e.c.a.l2 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/e1;Le/c/a/n;)V
if ( p4 != null) { // if-eqz p4, :cond_c
/* .line 57 */
p2 = this.a;
p3 = this.f;
p3 = this.g;
(( e.c.a.l2 ) p0 ).a ( p3, p4, p5 ); // invoke-virtual {p0, p3, p4, p5}, Le/c/a/l2;->a(Le/c/a/n;Le/c/a/n;Le/c/a/m;)Landroid/graphics/Matrix;
(( android.graphics.Canvas ) p2 ).concat ( p3 ); // invoke-virtual {p2, p3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 58 */
p2 = this.f;
p3 = this.o;
this.h = p3;
/* .line 59 */
} // :cond_c
p2 = this.a;
(( android.graphics.Canvas ) p2 ).translate ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V
/* .line 60 */
} // :goto_5
p2 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 61 */
(( e.c.a.l2 ) p0 ).s ( ); // invoke-virtual {p0}, Le/c/a/l2;->s()V
int p3 = 1; // const/4 p3, 0x1
/* .line 62 */
(( e.c.a.l2 ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Le/c/a/l2;->a(Le/c/a/d1;Z)V
if ( p2 != null) { // if-eqz p2, :cond_d
/* .line 63 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
/* .line 64 */
} // :cond_d
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
return;
} // .end method
public final void a ( Boolean p0, Object p1, e.c.a.g0 p2 ) {
/* .locals 3 */
/* .line 606 */
v0 = this.e;
v1 = this.b;
(( e.c.a.a2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
/* if-nez v0, :cond_3 */
int p2 = 2; // const/4 p2, 0x2
/* new-array p2, p2, [Ljava/lang/Object; */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v0 = "Fill"; // const-string v0, "Fill"
} // :cond_0
final String v0 = "Stroke"; // const-string v0, "Stroke"
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* aput-object v0, p2, v1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 607 */
v2 = this.b;
/* aput-object v2, p2, v0 */
final String v0 = "%s reference \'%s\' not found"; // const-string v0, "%s reference \'%s\' not found"
e.c.a.l2 .e ( v0,p2 );
/* .line 608 */
p2 = this.c;
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 609 */
p3 = this.f;
(( e.c.a.l2 ) p0 ).a ( p3, p1, p2 ); // invoke-virtual {p0, p3, p1, p2}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 610 */
p1 = this.f;
/* iput-boolean v1, p1, Le/c/a/h2;->c:Z */
/* .line 611 */
} // :cond_2
p1 = this.f;
/* iput-boolean v1, p1, Le/c/a/h2;->d:Z */
} // :goto_1
return;
/* .line 612 */
} // :cond_3
/* instance-of p3, v0, Le/c/a/g1; */
if ( p3 != null) { // if-eqz p3, :cond_4
/* .line 613 */
/* move-object p3, v0 */
/* check-cast p3, Le/c/a/g1; */
(( e.c.a.l2 ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/c/a/l2;->a(ZLe/c/a/n;Le/c/a/g1;)V
/* .line 614 */
} // :cond_4
/* instance-of p3, v0, Le/c/a/k1; */
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 615 */
/* move-object p3, v0 */
/* check-cast p3, Le/c/a/k1; */
(( e.c.a.l2 ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/c/a/l2;->a(ZLe/c/a/n;Le/c/a/k1;)V
/* .line 616 */
} // :cond_5
/* instance-of p2, v0, Le/c/a/o0; */
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 617 */
/* check-cast v0, Le/c/a/o0; */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(ZLe/c/a/o0;)V
} // :cond_6
return;
} // .end method
public final void a ( Boolean p0, Object p1, e.c.a.g1 p2 ) {
/* .locals 20 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p2 */
/* move-object/from16 v2, p3 */
/* .line 618 */
v3 = this.l;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 619 */
(( e.c.a.l2 ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Le/c/a/l2;->a(Le/c/a/v;Ljava/lang/String;)V
/* .line 620 */
} // :cond_0
v3 = this.i;
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
if ( v3 != null) { // if-eqz v3, :cond_1
v3 = (( java.lang.Boolean ) v3 ).booleanValue ( ); // invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
if ( v3 != null) { // if-eqz v3, :cond_1
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 621 */
} // :goto_0
v6 = this.f;
if ( p1 != null) { // if-eqz p1, :cond_2
v6 = this.e;
} // :cond_2
v6 = this.f;
} // :goto_1
int v7 = 0; // const/4 v7, 0x0
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 622 */
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->i()Le/c/a/n; */
/* .line 623 */
v9 = this.m;
if ( v9 != null) { // if-eqz v9, :cond_3
v9 = (( e.c.a.b0 ) v9 ).b ( v0 ); // invoke-virtual {v9, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_3
int v9 = 0; // const/4 v9, 0x0
/* .line 624 */
} // :goto_2
v10 = this.n;
if ( v10 != null) { // if-eqz v10, :cond_4
v10 = (( e.c.a.b0 ) v10 ).c ( v0 ); // invoke-virtual {v10, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_4
int v10 = 0; // const/4 v10, 0x0
/* .line 625 */
} // :goto_3
v11 = this.o;
if ( v11 != null) { // if-eqz v11, :cond_5
v8 = (( e.c.a.b0 ) v11 ).b ( v0 ); // invoke-virtual {v11, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_5
/* iget v8, v8, Le/c/a/n;->d:F */
/* .line 626 */
} // :goto_4
v11 = this.p;
if ( v11 != null) { // if-eqz v11, :cond_6
v7 = (( e.c.a.b0 ) v11 ).c ( v0 ); // invoke-virtual {v11, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_6
/* move/from16 v16, v7 */
/* move v15, v8 */
/* move v13, v9 */
/* move v14, v10 */
/* .line 627 */
} // :cond_7
v8 = this.m;
/* const/high16 v9, 0x3f800000 # 1.0f */
if ( v8 != null) { // if-eqz v8, :cond_8
v8 = (( e.c.a.b0 ) v8 ).a ( v0, v9 ); // invoke-virtual {v8, v0, v9}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_8
int v8 = 0; // const/4 v8, 0x0
/* .line 628 */
} // :goto_5
v10 = this.n;
if ( v10 != null) { // if-eqz v10, :cond_9
v10 = (( e.c.a.b0 ) v10 ).a ( v0, v9 ); // invoke-virtual {v10, v0, v9}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_9
int v10 = 0; // const/4 v10, 0x0
/* .line 629 */
} // :goto_6
v11 = this.o;
if ( v11 != null) { // if-eqz v11, :cond_a
v11 = (( e.c.a.b0 ) v11 ).a ( v0, v9 ); // invoke-virtual {v11, v0, v9}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_a
/* const/high16 v11, 0x3f800000 # 1.0f */
/* .line 630 */
} // :goto_7
v12 = this.p;
if ( v12 != null) { // if-eqz v12, :cond_b
v7 = (( e.c.a.b0 ) v12 ).a ( v0, v9 ); // invoke-virtual {v12, v0, v9}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_b
/* move/from16 v16, v7 */
/* move v13, v8 */
/* move v14, v10 */
/* move v15, v11 */
/* .line 631 */
} // :goto_8
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->r()V */
/* .line 632 */
(( e.c.a.l2 ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;
this.f = v7;
/* .line 633 */
/* new-instance v7, Landroid/graphics/Matrix; */
/* invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V */
/* if-nez v3, :cond_c */
/* .line 634 */
/* iget v3, v1, Le/c/a/n;->b:F */
/* iget v8, v1, Le/c/a/n;->c:F */
(( android.graphics.Matrix ) v7 ).preTranslate ( v3, v8 ); // invoke-virtual {v7, v3, v8}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 635 */
/* iget v3, v1, Le/c/a/n;->d:F */
/* iget v1, v1, Le/c/a/n;->e:F */
(( android.graphics.Matrix ) v7 ).preScale ( v3, v1 ); // invoke-virtual {v7, v3, v1}, Landroid/graphics/Matrix;->preScale(FF)Z
/* .line 636 */
} // :cond_c
v1 = this.j;
if ( v1 != null) { // if-eqz v1, :cond_d
/* .line 637 */
(( android.graphics.Matrix ) v7 ).preConcat ( v1 ); // invoke-virtual {v7, v1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z
/* .line 638 */
} // :cond_d
v1 = v1 = this.h;
/* if-nez v1, :cond_f */
/* .line 639 */
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
if ( p1 != null) { // if-eqz p1, :cond_e
/* .line 640 */
v1 = this.f;
/* iput-boolean v5, v1, Le/c/a/h2;->c:Z */
/* .line 641 */
} // :cond_e
v1 = this.f;
/* iput-boolean v5, v1, Le/c/a/h2;->d:Z */
} // :goto_9
return;
/* .line 642 */
} // :cond_f
/* new-array v3, v1, [I */
/* .line 643 */
/* new-array v8, v1, [F */
/* const/high16 v9, -0x40800000 # -1.0f */
/* .line 644 */
v10 = this.h;
v11 = } // :goto_a
/* if-nez v11, :cond_15 */
/* cmpl-float v5, v13, v15 */
/* if-nez v5, :cond_10 */
/* cmpl-float v5, v14, v16 */
if ( v5 != null) { // if-eqz v5, :cond_11
} // :cond_10
/* if-ne v1, v4, :cond_12 */
/* .line 645 */
} // :cond_11
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
/* sub-int/2addr v1, v4 */
/* .line 646 */
/* aget v1, v3, v1 */
(( android.graphics.Paint ) v6 ).setColor ( v1 ); // invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V
return;
/* .line 647 */
} // :cond_12
v1 = android.graphics.Shader$TileMode.CLAMP;
/* .line 648 */
v2 = this.k;
if ( v2 != null) { // if-eqz v2, :cond_14
/* .line 649 */
v4 = e.c.a.w.c;
/* if-ne v2, v4, :cond_13 */
/* .line 650 */
v1 = android.graphics.Shader$TileMode.MIRROR;
/* .line 651 */
} // :cond_13
v4 = e.c.a.w.d;
/* if-ne v2, v4, :cond_14 */
/* .line 652 */
v1 = android.graphics.Shader$TileMode.REPEAT;
} // :cond_14
} // :goto_b
/* move-object/from16 v19, v1 */
/* .line 653 */
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
/* .line 654 */
/* new-instance v1, Landroid/graphics/LinearGradient; */
/* move-object v12, v1 */
/* move-object/from16 v17, v3 */
/* move-object/from16 v18, v8 */
/* invoke-direct/range {v12 ..v19}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V */
/* .line 655 */
(( android.graphics.LinearGradient ) v1 ).setLocalMatrix ( v7 ); // invoke-virtual {v1, v7}, Landroid/graphics/LinearGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V
/* .line 656 */
(( android.graphics.Paint ) v6 ).setShader ( v1 ); // invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
return;
/* .line 657 */
} // :cond_15
/* check-cast v11, Le/c/a/h1; */
/* .line 658 */
/* check-cast v11, Le/c/a/p0; */
if ( v5 != null) { // if-eqz v5, :cond_17
/* .line 659 */
v12 = this.h;
v12 = (( java.lang.Float ) v12 ).floatValue ( ); // invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F
/* cmpl-float v12, v12, v9 */
/* if-ltz v12, :cond_16 */
/* .line 660 */
} // :cond_16
/* aput v9, v8, v5 */
/* .line 661 */
} // :cond_17
} // :goto_c
v9 = this.h;
v9 = (( java.lang.Float ) v9 ).floatValue ( ); // invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F
/* aput v9, v8, v5 */
/* .line 662 */
v9 = this.h;
v9 = (( java.lang.Float ) v9 ).floatValue ( ); // invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F
/* .line 663 */
} // :goto_d
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->r()V */
/* .line 664 */
v12 = this.f;
(( e.c.a.l2 ) v0 ).a ( v12, v11 ); // invoke-virtual {v0, v12, v11}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 665 */
v11 = this.f;
v11 = this.b;
v11 = this.D;
/* check-cast v11, Le/c/a/r; */
/* if-nez v11, :cond_18 */
/* .line 666 */
v11 = e.c.a.r.c;
/* .line 667 */
} // :cond_18
v12 = this.f;
v12 = this.b;
v12 = this.E;
v12 = (( java.lang.Float ) v12 ).floatValue ( ); // invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F
v12 = (( e.c.a.l2 ) v0 ).a ( v12 ); // invoke-virtual {v0, v12}, Le/c/a/l2;->a(F)I
/* shl-int/lit8 v12, v12, 0x18 */
/* iget v11, v11, Le/c/a/r;->b:I */
/* or-int/2addr v11, v12 */
/* aput v11, v3, v5 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 668 */
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
/* goto/16 :goto_a */
} // .end method
public final void a ( Boolean p0, Object p1, e.c.a.k1 p2 ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p2 */
/* move-object/from16 v2, p3 */
/* .line 669 */
v3 = this.l;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 670 */
(( e.c.a.l2 ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Le/c/a/l2;->a(Le/c/a/v;Ljava/lang/String;)V
/* .line 671 */
} // :cond_0
v3 = this.i;
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
if ( v3 != null) { // if-eqz v3, :cond_1
v3 = (( java.lang.Boolean ) v3 ).booleanValue ( ); // invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z
if ( v3 != null) { // if-eqz v3, :cond_1
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 672 */
} // :goto_0
v6 = this.f;
if ( p1 != null) { // if-eqz p1, :cond_2
v6 = this.e;
} // :cond_2
v6 = this.f;
} // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 673 */
/* new-instance v7, Le/c/a/b0; */
/* const/high16 v8, 0x42480000 # 50.0f */
v9 = e.c.a.x1.j;
/* invoke-direct {v7, v8, v9}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V */
/* .line 674 */
v8 = this.m;
if ( v8 != null) { // if-eqz v8, :cond_3
v8 = (( e.c.a.b0 ) v8 ).b ( v0 ); // invoke-virtual {v8, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
} // :cond_3
v8 = (( e.c.a.b0 ) v7 ).b ( v0 ); // invoke-virtual {v7, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* .line 675 */
} // :goto_2
v9 = this.n;
if ( v9 != null) { // if-eqz v9, :cond_4
v9 = (( e.c.a.b0 ) v9 ).c ( v0 ); // invoke-virtual {v9, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
} // :cond_4
v9 = (( e.c.a.b0 ) v7 ).c ( v0 ); // invoke-virtual {v7, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 676 */
} // :goto_3
v10 = this.o;
if ( v10 != null) { // if-eqz v10, :cond_5
v7 = (( e.c.a.b0 ) v10 ).a ( v0 ); // invoke-virtual {v10, v0}, Le/c/a/b0;->a(Le/c/a/l2;)F
} // :cond_5
v7 = (( e.c.a.b0 ) v7 ).a ( v0 ); // invoke-virtual {v7, v0}, Le/c/a/b0;->a(Le/c/a/l2;)F
} // :goto_4
/* move v14, v7 */
/* move v12, v8 */
/* move v13, v9 */
/* .line 677 */
} // :cond_6
v7 = this.m;
/* const/high16 v8, 0x3f800000 # 1.0f */
/* const/high16 v9, 0x3f000000 # 0.5f */
if ( v7 != null) { // if-eqz v7, :cond_7
v7 = (( e.c.a.b0 ) v7 ).a ( v0, v8 ); // invoke-virtual {v7, v0, v8}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_7
/* const/high16 v7, 0x3f000000 # 0.5f */
/* .line 678 */
} // :goto_5
v10 = this.n;
if ( v10 != null) { // if-eqz v10, :cond_8
v10 = (( e.c.a.b0 ) v10 ).a ( v0, v8 ); // invoke-virtual {v10, v0, v8}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_8
/* const/high16 v10, 0x3f000000 # 0.5f */
/* .line 679 */
} // :goto_6
v11 = this.o;
if ( v11 != null) { // if-eqz v11, :cond_9
v8 = (( e.c.a.b0 ) v11 ).a ( v0, v8 ); // invoke-virtual {v11, v0, v8}, Le/c/a/b0;->a(Le/c/a/l2;F)F
} // :cond_9
/* const/high16 v8, 0x3f000000 # 0.5f */
} // :goto_7
/* move v12, v7 */
/* move v14, v8 */
/* move v13, v10 */
/* .line 680 */
} // :goto_8
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->r()V */
/* .line 681 */
(( e.c.a.l2 ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;
this.f = v7;
/* .line 682 */
/* new-instance v7, Landroid/graphics/Matrix; */
/* invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V */
/* if-nez v3, :cond_a */
/* .line 683 */
/* iget v3, v1, Le/c/a/n;->b:F */
/* iget v8, v1, Le/c/a/n;->c:F */
(( android.graphics.Matrix ) v7 ).preTranslate ( v3, v8 ); // invoke-virtual {v7, v3, v8}, Landroid/graphics/Matrix;->preTranslate(FF)Z
/* .line 684 */
/* iget v3, v1, Le/c/a/n;->d:F */
/* iget v1, v1, Le/c/a/n;->e:F */
(( android.graphics.Matrix ) v7 ).preScale ( v3, v1 ); // invoke-virtual {v7, v3, v1}, Landroid/graphics/Matrix;->preScale(FF)Z
/* .line 685 */
} // :cond_a
v1 = this.j;
if ( v1 != null) { // if-eqz v1, :cond_b
/* .line 686 */
(( android.graphics.Matrix ) v7 ).preConcat ( v1 ); // invoke-virtual {v7, v1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z
/* .line 687 */
} // :cond_b
v1 = v1 = this.h;
/* if-nez v1, :cond_d */
/* .line 688 */
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
if ( p1 != null) { // if-eqz p1, :cond_c
/* .line 689 */
v1 = this.f;
/* iput-boolean v5, v1, Le/c/a/h2;->c:Z */
/* .line 690 */
} // :cond_c
v1 = this.f;
/* iput-boolean v5, v1, Le/c/a/h2;->d:Z */
} // :goto_9
return;
/* .line 691 */
} // :cond_d
/* new-array v15, v1, [I */
/* .line 692 */
/* new-array v3, v1, [F */
/* const/high16 v8, -0x40800000 # -1.0f */
/* .line 693 */
v9 = this.h;
v10 = } // :goto_a
/* if-nez v10, :cond_12 */
int v5 = 0; // const/4 v5, 0x0
/* cmpl-float v5, v14, v5 */
if ( v5 != null) { // if-eqz v5, :cond_11
/* if-ne v1, v4, :cond_e */
/* .line 694 */
} // :cond_e
v1 = android.graphics.Shader$TileMode.CLAMP;
/* .line 695 */
v2 = this.k;
if ( v2 != null) { // if-eqz v2, :cond_10
/* .line 696 */
v4 = e.c.a.w.c;
/* if-ne v2, v4, :cond_f */
/* .line 697 */
v1 = android.graphics.Shader$TileMode.MIRROR;
/* .line 698 */
} // :cond_f
v4 = e.c.a.w.d;
/* if-ne v2, v4, :cond_10 */
/* .line 699 */
v1 = android.graphics.Shader$TileMode.REPEAT;
} // :cond_10
} // :goto_b
/* move-object/from16 v17, v1 */
/* .line 700 */
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
/* .line 701 */
/* new-instance v1, Landroid/graphics/RadialGradient; */
/* move-object v11, v1 */
/* move-object/from16 v16, v3 */
/* invoke-direct/range {v11 ..v17}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V */
/* .line 702 */
(( android.graphics.RadialGradient ) v1 ).setLocalMatrix ( v7 ); // invoke-virtual {v1, v7}, Landroid/graphics/RadialGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V
/* .line 703 */
(( android.graphics.Paint ) v6 ).setShader ( v1 ); // invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
return;
/* .line 704 */
} // :cond_11
} // :goto_c
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
/* sub-int/2addr v1, v4 */
/* .line 705 */
/* aget v1, v15, v1 */
(( android.graphics.Paint ) v6 ).setColor ( v1 ); // invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V
return;
/* .line 706 */
} // :cond_12
/* check-cast v10, Le/c/a/h1; */
/* .line 707 */
/* check-cast v10, Le/c/a/p0; */
if ( v5 != null) { // if-eqz v5, :cond_14
/* .line 708 */
v11 = this.h;
v11 = (( java.lang.Float ) v11 ).floatValue ( ); // invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F
/* cmpl-float v11, v11, v8 */
/* if-ltz v11, :cond_13 */
/* .line 709 */
} // :cond_13
/* aput v8, v3, v5 */
/* .line 710 */
} // :cond_14
} // :goto_d
v8 = this.h;
v8 = (( java.lang.Float ) v8 ).floatValue ( ); // invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F
/* aput v8, v3, v5 */
/* .line 711 */
v8 = this.h;
v8 = (( java.lang.Float ) v8 ).floatValue ( ); // invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F
/* .line 712 */
} // :goto_e
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->r()V */
/* .line 713 */
v11 = this.f;
(( e.c.a.l2 ) v0 ).a ( v11, v10 ); // invoke-virtual {v0, v11, v10}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 714 */
v10 = this.f;
v10 = this.b;
v10 = this.D;
/* check-cast v10, Le/c/a/r; */
/* if-nez v10, :cond_15 */
/* .line 715 */
v10 = e.c.a.r.c;
/* .line 716 */
} // :cond_15
v11 = this.f;
v11 = this.b;
v11 = this.E;
v11 = (( java.lang.Float ) v11 ).floatValue ( ); // invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F
v11 = (( e.c.a.l2 ) v0 ).a ( v11 ); // invoke-virtual {v0, v11}, Le/c/a/l2;->a(F)I
/* shl-int/lit8 v11, v11, 0x18 */
/* iget v10, v10, Le/c/a/r;->b:I */
/* or-int/2addr v10, v11 */
/* aput v10, v15, v5 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 717 */
/* invoke-virtual/range {p0 ..p0}, Le/c/a/l2;->q()V */
/* goto/16 :goto_a */
} // .end method
public final void a ( Boolean p0, e.c.a.o0 p1 ) {
/* .locals 9 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* const-wide v2, 0x180000000L */
/* const-wide v4, 0x100000000L */
/* const-wide v6, 0x80000000L */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 755 */
v8 = this.e;
v6 = (( e.c.a.l2 ) p0 ).a ( v8, v6, v7 ); // invoke-virtual {p0, v8, v6, v7}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 756 */
v6 = this.f;
v7 = this.b;
v8 = this.e;
v8 = this.I;
this.c = v8;
if ( v8 != null) { // if-eqz v8, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 757 */
} // :goto_0
/* iput-boolean v0, v6, Le/c/a/h2;->c:Z */
/* .line 758 */
} // :cond_1
v0 = this.e;
v0 = (( e.c.a.l2 ) p0 ).a ( v0, v4, v5 ); // invoke-virtual {p0, v0, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 759 */
v0 = this.f;
v0 = this.b;
v1 = this.e;
v1 = this.J;
this.e = v1;
/* .line 760 */
} // :cond_2
p2 = this.e;
p2 = (( e.c.a.l2 ) p0 ).a ( p2, v2, v3 ); // invoke-virtual {p0, p2, v2, v3}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 761 */
p2 = this.f;
v0 = this.b;
v0 = this.c;
(( e.c.a.l2 ) p0 ).a ( p2, p1, v0 ); // invoke-virtual {p0, p2, p1, v0}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V
/* .line 762 */
} // :cond_3
v8 = this.e;
v6 = (( e.c.a.l2 ) p0 ).a ( v8, v6, v7 ); // invoke-virtual {p0, v8, v6, v7}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 763 */
v6 = this.f;
v7 = this.b;
v8 = this.e;
v8 = this.I;
this.f = v8;
if ( v8 != null) { // if-eqz v8, :cond_4
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* .line 764 */
} // :goto_1
/* iput-boolean v0, v6, Le/c/a/h2;->d:Z */
/* .line 765 */
} // :cond_5
v0 = this.e;
v0 = (( e.c.a.l2 ) p0 ).a ( v0, v4, v5 ); // invoke-virtual {p0, v0, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 766 */
v0 = this.f;
v0 = this.b;
v1 = this.e;
v1 = this.J;
this.g = v1;
/* .line 767 */
} // :cond_6
p2 = this.e;
p2 = (( e.c.a.l2 ) p0 ).a ( p2, v2, v3 ); // invoke-virtual {p0, p2, v2, v3}, Le/c/a/l2;->a(Le/c/a/y0;J)Z
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 768 */
p2 = this.f;
v0 = this.b;
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( p2, p1, v0 ); // invoke-virtual {p0, p2, p1, v0}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V
} // :cond_7
} // :goto_2
return;
} // .end method
public final Boolean a ( e.c.a.y0 p0, Long p1 ) {
/* .locals 2 */
/* .line 368 */
/* iget-wide v0, p1, Le/c/a/y0;->b:J */
/* and-long p1, v0, p2 */
/* const-wide/16 v0, 0x0 */
/* cmp-long p3, p1, v0 */
if ( p3 != null) { // if-eqz p3, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final android.graphics.Path b ( e.c.a.c0 p0 ) {
/* .locals 9 */
/* .line 121 */
v0 = this.o;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = (( e.c.a.b0 ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* .line 122 */
} // :goto_0
v2 = this.p;
/* if-nez v2, :cond_1 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_1
v2 = (( e.c.a.b0 ) v2 ).c ( p0 ); // invoke-virtual {v2, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 123 */
} // :goto_1
v3 = this.q;
/* if-nez v3, :cond_2 */
int v3 = 0; // const/4 v3, 0x0
} // :cond_2
v3 = (( e.c.a.b0 ) v3 ).b ( p0 ); // invoke-virtual {v3, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F
/* .line 124 */
} // :goto_2
v4 = this.r;
/* if-nez v4, :cond_3 */
} // :cond_3
v1 = (( e.c.a.b0 ) v4 ).c ( p0 ); // invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F
/* .line 125 */
} // :goto_3
v4 = this.h;
/* if-nez v4, :cond_4 */
/* .line 126 */
/* new-instance v4, Le/c/a/n; */
v5 = java.lang.Math .min ( v0,v2 );
v6 = java.lang.Math .min ( v2,v1 );
/* sub-float v7, v3, v0 */
v7 = java.lang.Math .abs ( v7 );
/* sub-float v8, v1, v2 */
v8 = java.lang.Math .abs ( v8 );
/* invoke-direct {v4, v5, v6, v7, v8}, Le/c/a/n;-><init>(FFFF)V */
this.h = v4;
/* .line 127 */
} // :cond_4
/* new-instance p1, Landroid/graphics/Path; */
/* invoke-direct {p1}, Landroid/graphics/Path;-><init>()V */
/* .line 128 */
(( android.graphics.Path ) p1 ).moveTo ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->moveTo(FF)V
/* .line 129 */
(( android.graphics.Path ) p1 ).lineTo ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V
} // .end method
public final android.graphics.Path b ( e.c.a.l0 p0 ) {
/* .locals 5 */
/* .line 130 */
/* new-instance v0, Landroid/graphics/Path; */
/* invoke-direct {v0}, Landroid/graphics/Path;-><init>()V */
/* .line 131 */
v1 = this.o;
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v1, v2 */
int v3 = 1; // const/4 v3, 0x1
/* aget v1, v1, v3 */
(( android.graphics.Path ) v0 ).moveTo ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V
int v1 = 2; // const/4 v1, 0x2
/* .line 132 */
} // :goto_0
v2 = this.o;
/* array-length v3, v2 */
/* if-lt v1, v3, :cond_2 */
/* .line 133 */
/* instance-of v1, p1, Le/c/a/m0; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 134 */
(( android.graphics.Path ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/graphics/Path;->close()V
/* .line 135 */
} // :cond_0
v1 = this.h;
/* if-nez v1, :cond_1 */
/* .line 136 */
(( e.c.a.l2 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->a(Landroid/graphics/Path;)Le/c/a/n;
this.h = v1;
/* .line 137 */
} // :cond_1
(( e.c.a.l2 ) p0 ).f ( ); // invoke-virtual {p0}, Le/c/a/l2;->f()Landroid/graphics/Path$FillType;
(( android.graphics.Path ) v0 ).setFillType ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V
/* .line 138 */
} // :cond_2
/* aget v3, v2, v1 */
/* add-int/lit8 v4, v1, 0x1 */
/* aget v2, v2, v4 */
(( android.graphics.Path ) v0 ).lineTo ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V
/* add-int/lit8 v1, v1, 0x2 */
} // .end method
public final e.c.a.h2 b ( e.c.a.h1 p0 ) {
/* .locals 2 */
/* .line 111 */
/* new-instance v0, Le/c/a/h2; */
/* invoke-direct {v0, p0}, Le/c/a/h2;-><init>(Le/c/a/l2;)V */
/* .line 112 */
e.c.a.y0 .a ( );
(( e.c.a.l2 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V
/* .line 113 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/h1;Le/c/a/h2;)Le/c/a/h2;
} // .end method
public final void b ( ) {
/* .locals 2 */
/* .line 118 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( android.graphics.Canvas ) v0 ).save ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->save(I)I
/* .line 119 */
v0 = this.g;
v1 = this.f;
(( java.util.Stack ) v0 ).push ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 120 */
v0 = this.f;
(( e.c.a.h2 ) v0 ).clone ( ); // invoke-virtual {v0}, Le/c/a/h2;->clone()Ljava/lang/Object;
/* check-cast v0, Le/c/a/h2; */
this.f = v0;
return;
} // .end method
public final void b ( android.graphics.Path p0 ) {
/* .locals 5 */
/* .line 2 */
v0 = this.f;
v1 = this.b;
v1 = this.M;
v2 = e.c.a.x0.c;
/* if-ne v1, v2, :cond_1 */
/* .line 3 */
v0 = this.a;
(( android.graphics.Canvas ) v0 ).getMatrix ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;
/* .line 4 */
/* new-instance v1, Landroid/graphics/Path; */
/* invoke-direct {v1}, Landroid/graphics/Path;-><init>()V */
/* .line 5 */
(( android.graphics.Path ) p1 ).transform ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V
/* .line 6 */
p1 = this.a;
/* new-instance v2, Landroid/graphics/Matrix; */
/* invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V */
(( android.graphics.Canvas ) p1 ).setMatrix ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V
/* .line 7 */
p1 = this.f;
p1 = this.f;
(( android.graphics.Paint ) p1 ).getShader ( ); // invoke-virtual {p1}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;
/* .line 8 */
/* new-instance v2, Landroid/graphics/Matrix; */
/* invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 9 */
(( android.graphics.Shader ) p1 ).getLocalMatrix ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z
/* .line 10 */
/* new-instance v3, Landroid/graphics/Matrix; */
/* invoke-direct {v3, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V */
/* .line 11 */
(( android.graphics.Matrix ) v3 ).postConcat ( v0 ); // invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z
/* .line 12 */
(( android.graphics.Shader ) p1 ).setLocalMatrix ( v3 ); // invoke-virtual {p1, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V
/* .line 13 */
} // :cond_0
v3 = this.a;
v4 = this.f;
v4 = this.f;
(( android.graphics.Canvas ) v3 ).drawPath ( v1, v4 ); // invoke-virtual {v3, v1, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
/* .line 14 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).setMatrix ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 15 */
(( android.graphics.Shader ) p1 ).setLocalMatrix ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V
/* .line 16 */
} // :cond_1
v1 = this.a;
v0 = this.f;
(( android.graphics.Canvas ) v1 ).drawPath ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V
} // :cond_2
} // :goto_0
return;
} // .end method
public final void b ( e.c.a.e1 p0 ) {
/* .locals 3 */
/* .line 114 */
v0 = this.f;
v0 = this.b;
v0 = this.c;
/* instance-of v1, v0, Le/c/a/g0; */
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 115 */
v2 = this.h;
/* check-cast v0, Le/c/a/g0; */
(( e.c.a.l2 ) p0 ).a ( v1, v2, v0 ); // invoke-virtual {p0, v1, v2, v0}, Le/c/a/l2;->a(ZLe/c/a/n;Le/c/a/g0;)V
/* .line 116 */
} // :cond_0
v0 = this.f;
v0 = this.b;
v0 = this.f;
/* instance-of v1, v0, Le/c/a/g0; */
if ( v1 != null) { // if-eqz v1, :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 117 */
p1 = this.h;
/* check-cast v0, Le/c/a/g0; */
(( e.c.a.l2 ) p0 ).a ( v1, p1, v0 ); // invoke-virtual {p0, v1, p1, v0}, Le/c/a/l2;->a(ZLe/c/a/n;Le/c/a/g0;)V
} // :cond_1
return;
} // .end method
public final void b ( e.c.a.m1 p0 ) {
/* .locals 7 */
/* .line 18 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v0 ).getLanguage ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
/* .line 19 */
v1 = this.e;
(( e.c.a.a2 ) v1 ).e ( ); // invoke-virtual {v1}, Le/c/a/a2;->e()Le/c/a/m2;
/* .line 20 */
(( e.c.a.b1 ) p1 ).e ( ); // invoke-virtual {p1}, Le/c/a/b1;->e()Ljava/util/List;
} // :cond_0
v2 = } // :goto_0
/* if-nez v2, :cond_1 */
/* goto/16 :goto_3 */
} // :cond_1
/* check-cast v2, Le/c/a/h1; */
/* .line 21 */
/* instance-of v3, v2, Le/c/a/a1; */
/* if-nez v3, :cond_2 */
/* .line 22 */
} // :cond_2
/* move-object v3, v2 */
/* check-cast v3, Le/c/a/a1; */
/* .line 23 */
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 24 */
} // :cond_3
if ( v4 != null) { // if-eqz v4, :cond_4
v5 = /* .line 25 */
v4 = /* if-nez v5, :cond_0 */
/* if-nez v4, :cond_4 */
/* .line 26 */
} // :cond_4
if ( v4 != null) { // if-eqz v4, :cond_5
v5 = /* .line 27 */
/* if-nez v5, :cond_0 */
v5 = e.c.a.p2.o;
v4 = (( java.util.HashSet ) v5 ).containsAll ( v4 ); // invoke-virtual {v5, v4}, Ljava/util/HashSet;->containsAll(Ljava/util/Collection;)Z
/* if-nez v4, :cond_5 */
/* .line 28 */
} // :cond_5
if ( v4 != null) { // if-eqz v4, :cond_9
v5 = /* .line 29 */
/* if-nez v5, :cond_0 */
/* if-nez v1, :cond_6 */
/* .line 30 */
} // :cond_6
v5 = } // :cond_7
/* if-nez v5, :cond_8 */
} // :cond_8
/* check-cast v5, Ljava/lang/String; */
/* .line 31 */
v5 = (( e.c.a.m2 ) v1 ).a ( v5 ); // invoke-virtual {v1, v5}, Le/c/a/m2;->a(Ljava/lang/String;)Z
/* if-nez v5, :cond_7 */
/* .line 32 */
} // :cond_9
} // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_d
v4 = /* .line 33 */
/* if-nez v4, :cond_0 */
/* if-nez v1, :cond_a */
/* .line 34 */
} // :cond_a
v4 = } // :cond_b
/* if-nez v4, :cond_c */
} // :cond_c
/* check-cast v4, Ljava/lang/String; */
/* .line 35 */
v5 = this.f;
v5 = this.b;
v5 = this.r;
v5 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
v6 = this.f;
v6 = this.b;
v6 = this.s;
java.lang.String .valueOf ( v6 );
(( e.c.a.m2 ) v1 ).a ( v4, v5, v6 ); // invoke-virtual {v1, v4, v5, v6}, Le/c/a/m2;->a(Ljava/lang/String;ILjava/lang/String;)Landroid/graphics/Typeface;
/* if-nez v4, :cond_b */
/* goto/16 :goto_0 */
/* .line 36 */
} // :cond_d
} // :goto_2
(( e.c.a.l2 ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Le/c/a/l2;->c(Le/c/a/h1;)V
} // :goto_3
return;
} // .end method
public final void b ( e.c.a.n0 p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Rect render"; // const-string v1, "Rect render"
/* .line 37 */
e.c.a.l2 .d ( v1,v0 );
/* .line 38 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_6
v1 = this.r;
if ( v1 != null) { // if-eqz v1, :cond_6
v0 = (( e.c.a.b0 ) v0 ).d ( ); // invoke-virtual {v0}, Le/c/a/b0;->d()Z
/* if-nez v0, :cond_6 */
v0 = this.r;
v0 = (( e.c.a.b0 ) v0 ).d ( ); // invoke-virtual {v0}, Le/c/a/b0;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 39 */
} // :cond_0
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 40 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_1 */
return;
/* .line 41 */
} // :cond_1
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_2 */
return;
/* .line 42 */
} // :cond_2
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 43 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 44 */
} // :cond_3
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/n0;)Landroid/graphics/Path;
/* .line 45 */
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
/* .line 46 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 47 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 48 */
v1 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 49 */
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 50 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V
/* .line 51 */
} // :cond_4
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->d:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 52 */
(( e.c.a.l2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V
} // :cond_5
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 53 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_6
} // :goto_0
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Circle render"; // const-string v1, "Circle render"
/* .line 54 */
e.c.a.l2 .d ( v1,v0 );
/* .line 55 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = (( e.c.a.b0 ) v0 ).d ( ); // invoke-virtual {v0}, Le/c/a/b0;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 56 */
} // :cond_0
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 57 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_1 */
return;
/* .line 58 */
} // :cond_1
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_2 */
return;
/* .line 59 */
} // :cond_2
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 60 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 61 */
} // :cond_3
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/p;)Landroid/graphics/Path;
/* .line 62 */
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
/* .line 63 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 64 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 65 */
v1 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 66 */
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 67 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V
/* .line 68 */
} // :cond_4
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->d:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 69 */
(( e.c.a.l2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V
} // :cond_5
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 70 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_6
} // :goto_0
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Ellipse render"; // const-string v1, "Ellipse render"
/* .line 71 */
e.c.a.l2 .d ( v1,v0 );
/* .line 72 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_6
v1 = this.r;
if ( v1 != null) { // if-eqz v1, :cond_6
v0 = (( e.c.a.b0 ) v0 ).d ( ); // invoke-virtual {v0}, Le/c/a/b0;->d()Z
/* if-nez v0, :cond_6 */
v0 = this.r;
v0 = (( e.c.a.b0 ) v0 ).d ( ); // invoke-virtual {v0}, Le/c/a/b0;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 73 */
} // :cond_0
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 74 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_1 */
return;
/* .line 75 */
} // :cond_1
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_2 */
return;
/* .line 76 */
} // :cond_2
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 77 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 78 */
} // :cond_3
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/u;)Landroid/graphics/Path;
/* .line 79 */
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
/* .line 80 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 81 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 82 */
v1 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 83 */
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 84 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V
/* .line 85 */
} // :cond_4
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->d:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 86 */
(( e.c.a.l2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V
} // :cond_5
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 87 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_6
} // :goto_0
return;
} // .end method
public final void c ( e.c.a.c0 p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "Line render"; // const-string v1, "Line render"
/* .line 45 */
e.c.a.l2 .d ( v1,v0 );
/* .line 46 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 47 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 48 */
} // :cond_0
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_1 */
return;
/* .line 49 */
} // :cond_1
v0 = this.f;
/* iget-boolean v0, v0, Le/c/a/h2;->d:Z */
/* if-nez v0, :cond_2 */
return;
/* .line 50 */
} // :cond_2
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 51 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 52 */
} // :cond_3
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/c0;)Landroid/graphics/Path;
/* .line 53 */
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
/* .line 54 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 55 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 56 */
v1 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 57 */
(( e.c.a.l2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V
/* .line 58 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/x;)V
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 59 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_4
return;
} // .end method
public final void c ( e.c.a.e1 p0 ) {
/* .locals 3 */
/* .line 33 */
v0 = this.f;
v1 = this.b;
v1 = this.H;
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget-boolean v0, v0, Le/c/a/h2;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 34 */
v0 = this.e;
(( e.c.a.a2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
/* .line 35 */
(( e.c.a.l2 ) p0 ).d ( ); // invoke-virtual {p0}, Le/c/a/l2;->d()V
/* .line 36 */
/* check-cast v0, Le/c/a/e0; */
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/e0;Le/c/a/e1;)V
/* .line 37 */
(( e.c.a.l2 ) p0 ).m ( ); // invoke-virtual {p0}, Le/c/a/l2;->m()Landroid/graphics/Bitmap;
/* .line 38 */
v0 = this.j;
(( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Canvas; */
this.a = v0;
/* .line 39 */
(( android.graphics.Canvas ) v0 ).save ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I
/* .line 40 */
v0 = this.a;
/* new-instance v1, Landroid/graphics/Matrix; */
/* invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V */
(( android.graphics.Canvas ) v0 ).setMatrix ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V
/* .line 41 */
v0 = this.a;
v1 = this.f;
v1 = this.e;
int v2 = 0; // const/4 v2, 0x0
(( android.graphics.Canvas ) v0 ).drawBitmap ( p1, v2, v2, v1 ); // invoke-virtual {v0, p1, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 42 */
(( android.graphics.Bitmap ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
/* .line 43 */
p1 = this.a;
(( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
/* .line 44 */
} // :cond_0
(( e.c.a.l2 ) p0 ).q ( ); // invoke-virtual {p0}, Le/c/a/l2;->q()V
return;
} // .end method
public final void c ( e.c.a.h1 p0 ) {
/* .locals 1 */
/* .line 2 */
/* instance-of v0, p1, Le/c/a/f0; */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 3 */
} // :cond_0
(( e.c.a.l2 ) p0 ).r ( ); // invoke-virtual {p0}, Le/c/a/l2;->r()V
/* .line 4 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/h1;)V
/* .line 5 */
/* instance-of v0, p1, Le/c/a/z0; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
/* check-cast p1, Le/c/a/z0; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/z0;)V
/* goto/16 :goto_0 */
/* .line 7 */
} // :cond_1
/* instance-of v0, p1, Le/c/a/y1; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 8 */
/* check-cast p1, Le/c/a/y1; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/y1;)V
/* goto/16 :goto_0 */
/* .line 9 */
} // :cond_2
/* instance-of v0, p1, Le/c/a/m1; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 10 */
/* check-cast p1, Le/c/a/m1; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/m1;)V
/* goto/16 :goto_0 */
/* .line 11 */
} // :cond_3
/* instance-of v0, p1, Le/c/a/y; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 12 */
/* check-cast p1, Le/c/a/y; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/y;)V
/* .line 13 */
} // :cond_4
/* instance-of v0, p1, Le/c/a/a0; */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 14 */
/* check-cast p1, Le/c/a/a0; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/a0;)V
/* .line 15 */
} // :cond_5
/* instance-of v0, p1, Le/c/a/h0; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 16 */
/* check-cast p1, Le/c/a/h0; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/h0;)V
/* .line 17 */
} // :cond_6
/* instance-of v0, p1, Le/c/a/n0; */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 18 */
/* check-cast p1, Le/c/a/n0; */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/n0;)V
/* .line 19 */
} // :cond_7
/* instance-of v0, p1, Le/c/a/p; */
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 20 */
/* check-cast p1, Le/c/a/p; */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/p;)V
/* .line 21 */
} // :cond_8
/* instance-of v0, p1, Le/c/a/u; */
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 22 */
/* check-cast p1, Le/c/a/u; */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/u;)V
/* .line 23 */
} // :cond_9
/* instance-of v0, p1, Le/c/a/c0; */
if ( v0 != null) { // if-eqz v0, :cond_a
/* .line 24 */
/* check-cast p1, Le/c/a/c0; */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/c0;)V
/* .line 25 */
} // :cond_a
/* instance-of v0, p1, Le/c/a/m0; */
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 26 */
/* check-cast p1, Le/c/a/m0; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/m0;)V
/* .line 27 */
} // :cond_b
/* instance-of v0, p1, Le/c/a/l0; */
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 28 */
/* check-cast p1, Le/c/a/l0; */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/l0;)V
/* .line 29 */
} // :cond_c
/* instance-of v0, p1, Le/c/a/q1; */
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 30 */
/* check-cast p1, Le/c/a/q1; */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/q1;)V
/* .line 31 */
} // :cond_d
} // :goto_0
(( e.c.a.l2 ) p0 ).q ( ); // invoke-virtual {p0}, Le/c/a/l2;->q()V
return;
} // .end method
public final void c ( e.c.a.l0 p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Object; */
final String v1 = "PolyLine render"; // const-string v1, "PolyLine render"
/* .line 60 */
e.c.a.l2 .d ( v1,v0 );
/* .line 61 */
v0 = this.f;
(( e.c.a.l2 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V
/* .line 62 */
v0 = (( e.c.a.l2 ) p0 ).c ( ); // invoke-virtual {p0}, Le/c/a/l2;->c()Z
/* if-nez v0, :cond_0 */
return;
/* .line 63 */
} // :cond_0
v0 = (( e.c.a.l2 ) p0 ).t ( ); // invoke-virtual {p0}, Le/c/a/l2;->t()Z
/* if-nez v0, :cond_1 */
return;
/* .line 64 */
} // :cond_1
v0 = this.f;
/* iget-boolean v1, v0, Le/c/a/h2;->d:Z */
/* if-nez v1, :cond_2 */
/* iget-boolean v0, v0, Le/c/a/h2;->c:Z */
/* if-nez v0, :cond_2 */
return;
/* .line 65 */
} // :cond_2
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 66 */
v1 = this.a;
(( android.graphics.Canvas ) v1 ).concat ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V
/* .line 67 */
} // :cond_3
v0 = this.o;
/* array-length v0, v0 */
int v1 = 2; // const/4 v1, 0x2
/* if-ge v0, v1, :cond_4 */
return;
/* .line 68 */
} // :cond_4
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/l0;)Landroid/graphics/Path;
/* .line 69 */
(( e.c.a.l2 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V
/* .line 70 */
(( e.c.a.l2 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V
/* .line 71 */
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V
/* .line 72 */
v1 = (( e.c.a.l2 ) p0 ).n ( ); // invoke-virtual {p0}, Le/c/a/l2;->n()Z
/* .line 73 */
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 74 */
(( e.c.a.l2 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V
/* .line 75 */
} // :cond_5
v2 = this.f;
/* iget-boolean v2, v2, Le/c/a/h2;->d:Z */
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 76 */
(( e.c.a.l2 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V
/* .line 77 */
} // :cond_6
(( e.c.a.l2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/x;)V
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 78 */
(( e.c.a.l2 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V
} // :cond_7
return;
} // .end method
public final Boolean c ( ) {
/* .locals 1 */
/* .line 79 */
v0 = this.f;
v0 = this.b;
v0 = this.B;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 80 */
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public final void d ( ) {
/* .locals 3 */
/* .line 20 */
try { // :try_start_0
v0 = this.a;
v0 = (( android.graphics.Canvas ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I
v1 = this.a;
v1 = (( android.graphics.Canvas ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I
v2 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v0,v1,v2 );
/* .line 21 */
v1 = this.k;
(( java.util.Stack ) v1 ).push ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 22 */
/* new-instance v1, Landroid/graphics/Canvas; */
/* invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 23 */
v0 = this.a;
(( android.graphics.Canvas ) v0 ).getMatrix ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;
(( android.graphics.Canvas ) v1 ).setMatrix ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V
/* .line 24 */
this.a = v1;
/* :try_end_0 */
/* .catch Ljava/lang/OutOfMemoryError; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception v0 */
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Object; */
final String v2 = "Not enough memory to create temporary bitmaps for mask processing"; // const-string v2, "Not enough memory to create temporary bitmaps for mask processing"
/* .line 25 */
e.c.a.l2 .e ( v2,v1 );
/* .line 26 */
/* throw v0 */
} // .end method
public final void d ( e.c.a.e1 p0 ) {
/* .locals 8 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
v0 = this.h;
/* if-nez v0, :cond_1 */
return;
/* .line 3 */
} // :cond_1
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
/* .line 4 */
v1 = this.i;
(( java.util.Stack ) v1 ).peek ( ); // invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Matrix; */
v1 = (( android.graphics.Matrix ) v1 ).invert ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z
if ( v1 != null) { // if-eqz v1, :cond_8
/* const/16 v1, 0x8 */
/* new-array v1, v1, [F */
/* .line 5 */
v2 = this.h;
/* iget v3, v2, Le/c/a/n;->b:F */
int v4 = 0; // const/4 v4, 0x0
/* aput v3, v1, v4 */
/* iget v3, v2, Le/c/a/n;->c:F */
int v5 = 1; // const/4 v5, 0x1
/* aput v3, v1, v5 */
/* .line 6 */
v2 = (( e.c.a.n ) v2 ).a ( ); // invoke-virtual {v2}, Le/c/a/n;->a()F
int v3 = 2; // const/4 v3, 0x2
/* aput v2, v1, v3 */
int v2 = 3; // const/4 v2, 0x3
v6 = this.h;
/* iget v7, v6, Le/c/a/n;->c:F */
/* aput v7, v1, v2 */
int v2 = 4; // const/4 v2, 0x4
/* .line 7 */
v6 = (( e.c.a.n ) v6 ).a ( ); // invoke-virtual {v6}, Le/c/a/n;->a()F
/* aput v6, v1, v2 */
int v2 = 5; // const/4 v2, 0x5
v6 = this.h;
v6 = (( e.c.a.n ) v6 ).b ( ); // invoke-virtual {v6}, Le/c/a/n;->b()F
/* aput v6, v1, v2 */
/* .line 8 */
p1 = this.h;
/* iget v2, p1, Le/c/a/n;->b:F */
int v6 = 6; // const/4 v6, 0x6
/* aput v2, v1, v6 */
int v2 = 7; // const/4 v2, 0x7
p1 = (( e.c.a.n ) p1 ).b ( ); // invoke-virtual {p1}, Le/c/a/n;->b()F
/* aput p1, v1, v2 */
/* .line 9 */
p1 = this.a;
(( android.graphics.Canvas ) p1 ).getMatrix ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;
(( android.graphics.Matrix ) v0 ).preConcat ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z
/* .line 10 */
(( android.graphics.Matrix ) v0 ).mapPoints ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapPoints([F)V
/* .line 11 */
/* new-instance p1, Landroid/graphics/RectF; */
/* aget v0, v1, v4 */
/* aget v2, v1, v5 */
/* aget v4, v1, v4 */
/* aget v5, v1, v5 */
/* invoke-direct {p1, v0, v2, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V */
} // :goto_0
/* if-le v3, v6, :cond_3 */
/* .line 12 */
v0 = this.h;
(( java.util.Stack ) v0 ).peek ( ); // invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;
/* check-cast v0, Le/c/a/e1; */
/* .line 13 */
v1 = this.h;
/* if-nez v1, :cond_2 */
/* .line 14 */
/* iget v1, p1, Landroid/graphics/RectF;->left:F */
/* iget v2, p1, Landroid/graphics/RectF;->top:F */
/* iget v3, p1, Landroid/graphics/RectF;->right:F */
/* iget p1, p1, Landroid/graphics/RectF;->bottom:F */
e.c.a.n .a ( v1,v2,v3,p1 );
this.h = p1;
/* .line 15 */
} // :cond_2
/* iget v0, p1, Landroid/graphics/RectF;->left:F */
/* iget v2, p1, Landroid/graphics/RectF;->top:F */
/* iget v3, p1, Landroid/graphics/RectF;->right:F */
/* iget p1, p1, Landroid/graphics/RectF;->bottom:F */
e.c.a.n .a ( v0,v2,v3,p1 );
(( e.c.a.n ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/c/a/n;->a(Le/c/a/n;)V
/* .line 16 */
} // :cond_3
/* aget v0, v1, v3 */
/* iget v2, p1, Landroid/graphics/RectF;->left:F */
/* cmpg-float v0, v0, v2 */
/* if-gez v0, :cond_4 */
/* aget v0, v1, v3 */
/* iput v0, p1, Landroid/graphics/RectF;->left:F */
/* .line 17 */
} // :cond_4
/* aget v0, v1, v3 */
/* iget v2, p1, Landroid/graphics/RectF;->right:F */
/* cmpl-float v0, v0, v2 */
/* if-lez v0, :cond_5 */
/* aget v0, v1, v3 */
/* iput v0, p1, Landroid/graphics/RectF;->right:F */
} // :cond_5
/* add-int/lit8 v0, v3, 0x1 */
/* .line 18 */
/* aget v2, v1, v0 */
/* iget v4, p1, Landroid/graphics/RectF;->top:F */
/* cmpg-float v2, v2, v4 */
/* if-gez v2, :cond_6 */
/* aget v2, v1, v0 */
/* iput v2, p1, Landroid/graphics/RectF;->top:F */
/* .line 19 */
} // :cond_6
/* aget v2, v1, v0 */
/* iget v4, p1, Landroid/graphics/RectF;->bottom:F */
/* cmpl-float v2, v2, v4 */
/* if-lez v2, :cond_7 */
/* aget v0, v1, v0 */
/* iput v0, p1, Landroid/graphics/RectF;->bottom:F */
} // :cond_7
/* add-int/lit8 v3, v3, 0x2 */
} // :cond_8
} // :goto_1
return;
} // .end method
public final e.c.a.u0 e ( ) {
/* .locals 3 */
/* .line 2 */
v0 = this.f;
v0 = this.b;
v1 = this.u;
v2 = e.c.a.w0.b;
/* if-eq v1, v2, :cond_2 */
v0 = this.v;
v1 = e.c.a.u0.c;
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
} // :cond_0
v1 = e.c.a.u0.b;
/* if-ne v0, v1, :cond_1 */
v1 = e.c.a.u0.d;
} // :cond_1
/* .line 4 */
} // :cond_2
} // :goto_0
v0 = this.f;
v0 = this.b;
v0 = this.v;
} // .end method
public final android.graphics.Path$FillType f ( ) {
/* .locals 2 */
/* .line 2 */
v0 = this.f;
v0 = this.b;
v0 = this.G;
/* if-nez v0, :cond_0 */
/* .line 3 */
v0 = android.graphics.Path$FillType.WINDING;
/* .line 4 */
} // :cond_0
e.c.a.l2 .v ( );
v1 = this.f;
v1 = this.b;
v1 = this.G;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_1 */
/* .line 5 */
v0 = android.graphics.Path$FillType.WINDING;
/* .line 6 */
} // :cond_1
v0 = android.graphics.Path$FillType.EVEN_ODD;
} // .end method
public Float g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
v0 = this.e;
v0 = (( android.graphics.Paint ) v0 ).getTextSize ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F
} // .end method
public Float h ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.f;
v0 = this.e;
v0 = (( android.graphics.Paint ) v0 ).getTextSize ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
} // .end method
public e.c.a.n i ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.f;
v1 = this.h;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.g;
} // .end method
public Float j ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/c/a/l2;->c:F */
} // .end method
public final android.graphics.Path$FillType k ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.f;
v0 = this.b;
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = android.graphics.Path$FillType.WINDING;
/* .line 3 */
} // :cond_0
e.c.a.l2 .v ( );
v1 = this.f;
v1 = this.b;
v1 = this.d;
v1 = (( java.lang.Enum ) v1 ).ordinal ( ); // invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I
/* aget v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_1 */
/* .line 4 */
v0 = android.graphics.Path$FillType.WINDING;
/* .line 5 */
} // :cond_1
v0 = android.graphics.Path$FillType.EVEN_ODD;
} // .end method
public final void l ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
(( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* .line 2 */
v0 = this.i;
(( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
return;
} // .end method
public final android.graphics.Bitmap m ( ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
/* .line 1 */
v1 = this.k;
(( java.util.Stack ) v1 ).pop ( ); // invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* .line 2 */
v2 = this.k;
(( java.util.Stack ) v2 ).pop ( ); // invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* move-object v11, v2 */
/* check-cast v11, Landroid/graphics/Bitmap; */
/* .line 3 */
v12 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 4 */
v13 = (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 5 */
/* new-array v14, v12, [I */
/* .line 6 */
/* new-array v15, v12, [I */
/* const/16 v16, 0x0 */
int v10 = 0; // const/4 v10, 0x0
} // :goto_0
/* if-lt v10, v13, :cond_0 */
/* .line 7 */
(( android.graphics.Bitmap ) v1 ).recycle ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
int v6 = 0; // const/4 v6, 0x0
int v9 = 1; // const/4 v9, 0x1
/* move-object v2, v1 */
/* move-object v3, v14 */
/* move v5, v12 */
/* move v7, v10 */
/* move v8, v12 */
/* .line 8 */
/* invoke-virtual/range {v2 ..v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
int v2 = 1; // const/4 v2, 0x1
/* move-object v3, v11 */
/* move-object v4, v15 */
/* move v6, v12 */
/* move v8, v10 */
/* move v9, v12 */
/* move/from16 v17, v10 */
/* move v10, v2 */
/* .line 9 */
/* invoke-virtual/range {v3 ..v10}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* if-lt v2, v12, :cond_1 */
int v5 = 0; // const/4 v5, 0x0
int v7 = 0; // const/4 v7, 0x0
int v10 = 1; // const/4 v10, 0x1
/* move-object v3, v11 */
/* move-object v4, v15 */
/* move v6, v12 */
/* move/from16 v8, v17 */
/* move v9, v12 */
/* .line 10 */
/* invoke-virtual/range {v3 ..v10}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V */
/* add-int/lit8 v10, v17, 0x1 */
/* .line 11 */
} // :cond_1
/* aget v3, v14, v2 */
/* and-int/lit16 v4, v3, 0xff */
/* shr-int/lit8 v5, v3, 0x8 */
/* and-int/lit16 v5, v5, 0xff */
/* shr-int/lit8 v6, v3, 0x10 */
/* and-int/lit16 v6, v6, 0xff */
/* shr-int/lit8 v3, v3, 0x18 */
/* and-int/lit16 v3, v3, 0xff */
/* if-nez v3, :cond_2 */
/* .line 12 */
/* aput v16, v15, v2 */
} // :cond_2
/* mul-int/lit16 v6, v6, 0x1b33 */
/* mul-int/lit16 v5, v5, 0x5b92 */
/* add-int/2addr v6, v5 */
/* mul-int/lit16 v4, v4, 0x93a */
/* add-int/2addr v6, v4 */
/* mul-int v6, v6, v3 */
/* const v3, 0x7f8000 */
/* .line 13 */
/* div-int/2addr v6, v3 */
/* .line 14 */
/* aget v3, v15, v2 */
/* shr-int/lit8 v4, v3, 0x18 */
/* and-int/lit16 v4, v4, 0xff */
/* mul-int v4, v4, v6 */
/* .line 15 */
/* div-int/lit16 v4, v4, 0xff */
/* const v5, 0xffffff */
/* and-int/2addr v3, v5 */
/* shl-int/lit8 v4, v4, 0x18 */
/* or-int/2addr v3, v4 */
/* .line 16 */
/* aput v3, v15, v2 */
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public final Boolean n ( ) {
/* .locals 5 */
/* .line 1 */
v0 = (( e.c.a.l2 ) p0 ).o ( ); // invoke-virtual {p0}, Le/c/a/l2;->o()Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.a;
v2 = this.f;
v2 = this.b;
v2 = this.n;
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = (( e.c.a.l2 ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/c/a/l2;->a(F)I
int v3 = 4; // const/4 v3, 0x4
int v4 = 0; // const/4 v4, 0x0
(( android.graphics.Canvas ) v0 ).saveLayerAlpha ( v4, v2, v3 ); // invoke-virtual {v0, v4, v2, v3}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I
/* .line 3 */
v0 = this.g;
v2 = this.f;
(( java.util.Stack ) v0 ).push ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 4 */
v0 = this.f;
(( e.c.a.h2 ) v0 ).clone ( ); // invoke-virtual {v0}, Le/c/a/h2;->clone()Ljava/lang/Object;
/* check-cast v0, Le/c/a/h2; */
this.f = v0;
/* .line 5 */
v2 = this.b;
v2 = this.H;
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_3
/* iget-boolean v0, v0, Le/c/a/h2;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 6 */
v0 = this.e;
(( e.c.a.a2 ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
/* instance-of v0, v0, Le/c/a/e0; */
/* if-nez v0, :cond_1 */
/* .line 8 */
} // :cond_1
v0 = this.j;
v1 = this.a;
(( java.util.Stack ) v0 ).push ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 9 */
(( e.c.a.l2 ) p0 ).d ( ); // invoke-virtual {p0}, Le/c/a/l2;->d()V
} // :cond_2
} // :goto_0
/* new-array v0, v3, [Ljava/lang/Object; */
/* .line 10 */
v2 = this.f;
v2 = this.b;
v2 = this.H;
/* aput-object v2, v0, v1 */
final String v1 = "Mask reference \'%s\' not found"; // const-string v1, "Mask reference \'%s\' not found"
e.c.a.l2 .e ( v1,v0 );
/* .line 11 */
v0 = this.f;
v0 = this.b;
this.H = v4;
} // :cond_3
} // :goto_1
} // .end method
public final Boolean o ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.f;
v1 = this.b;
v1 = this.H;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget-boolean v0, v0, Le/c/a/h2;->j:Z */
/* if-nez v0, :cond_0 */
/* new-array v0, v2, [Ljava/lang/Object; */
final String v1 = "Masks are not supported when using getPicture()"; // const-string v1, "Masks are not supported when using getPicture()"
/* .line 2 */
e.c.a.l2 .f ( v1,v0 );
/* .line 3 */
} // :cond_0
v0 = this.f;
v0 = this.b;
v0 = this.n;
v0 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpg-float v0, v0, v1 */
/* if-ltz v0, :cond_2 */
/* .line 4 */
v0 = this.f;
v1 = this.b;
v1 = this.H;
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget-boolean v0, v0, Le/c/a/h2;->j:Z */
/* if-nez v0, :cond_2 */
} // :cond_1
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
public final void p ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Le/c/a/h2; */
/* invoke-direct {v0, p0}, Le/c/a/h2;-><init>(Le/c/a/l2;)V */
this.f = v0;
/* .line 2 */
/* new-instance v0, Ljava/util/Stack; */
/* invoke-direct {v0}, Ljava/util/Stack;-><init>()V */
this.g = v0;
/* .line 3 */
v0 = this.f;
e.c.a.y0 .a ( );
(( e.c.a.l2 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V
/* .line 4 */
v0 = this.f;
v1 = this.b;
this.g = v1;
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
/* iput-boolean v1, v0, Le/c/a/h2;->i:Z */
/* .line 6 */
/* iget-boolean v1, p0, Le/c/a/l2;->d:Z */
/* iput-boolean v1, v0, Le/c/a/h2;->j:Z */
/* .line 7 */
v1 = this.g;
(( e.c.a.h2 ) v0 ).clone ( ); // invoke-virtual {v0}, Le/c/a/h2;->clone()Ljava/lang/Object;
/* check-cast v0, Le/c/a/h2; */
(( java.util.Stack ) v1 ).push ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 8 */
/* new-instance v0, Ljava/util/Stack; */
/* invoke-direct {v0}, Ljava/util/Stack;-><init>()V */
this.j = v0;
/* .line 9 */
/* new-instance v0, Ljava/util/Stack; */
/* invoke-direct {v0}, Ljava/util/Stack;-><init>()V */
this.k = v0;
/* .line 10 */
/* new-instance v0, Ljava/util/Stack; */
/* invoke-direct {v0}, Ljava/util/Stack;-><init>()V */
this.i = v0;
/* .line 11 */
/* new-instance v0, Ljava/util/Stack; */
/* invoke-direct {v0}, Ljava/util/Stack;-><init>()V */
this.h = v0;
return;
} // .end method
public final void q ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( android.graphics.Canvas ) v0 ).restore ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V
/* .line 2 */
v0 = this.g;
(( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* check-cast v0, Le/c/a/h2; */
this.f = v0;
return;
} // .end method
public final void r ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
(( android.graphics.Canvas ) v0 ).save ( ); // invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I
/* .line 2 */
v0 = this.g;
v1 = this.f;
(( java.util.Stack ) v0 ).push ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 3 */
v0 = this.f;
(( e.c.a.h2 ) v0 ).clone ( ); // invoke-virtual {v0}, Le/c/a/h2;->clone()Ljava/lang/Object;
/* check-cast v0, Le/c/a/h2; */
this.f = v0;
return;
} // .end method
public final void s ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.f;
v0 = this.b;
v1 = this.K;
/* instance-of v2, v1, Le/c/a/r; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 2 */
/* check-cast v1, Le/c/a/r; */
/* iget v0, v1, Le/c/a/r;->b:I */
/* .line 3 */
} // :cond_0
/* instance-of v1, v1, Le/c/a/s; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 4 */
v0 = this.o;
/* iget v0, v0, Le/c/a/r;->b:I */
/* .line 5 */
} // :goto_0
v1 = this.f;
v1 = this.b;
v1 = this.L;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 6 */
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
v1 = (( e.c.a.l2 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/c/a/l2;->a(F)I
/* shl-int/lit8 v1, v1, 0x18 */
/* or-int/2addr v0, v1 */
/* .line 7 */
} // :cond_1
v1 = this.a;
(( android.graphics.Canvas ) v1 ).drawColor ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->drawColor(I)V
} // :cond_2
return;
} // .end method
public final Boolean t ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
v0 = this.b;
v0 = this.C;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
