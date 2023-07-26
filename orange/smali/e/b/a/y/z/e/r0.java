public abstract class e.b.a.y.z.e.r0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.graphics.Paint a;
	 public static final android.graphics.Paint b;
	 public static final java.util.Set c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.util.concurrent.locks.Lock d;
/* # direct methods */
public static e.b.a.y.z.e.r0 ( ) {
/* .locals 31 */
/* .line 1 */
/* new-instance v0, Landroid/graphics/Paint; */
int v1 = 6; // const/4 v1, 0x6
/* invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V */
/* .line 2 */
/* new-instance v0, Landroid/graphics/Paint; */
int v1 = 7; // const/4 v1, 0x7
/* invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V */
/* .line 3 */
/* new-instance v0, Ljava/util/HashSet; */
final String v2 = "XT1085"; // const-string v2, "XT1085"
final String v3 = "XT1092"; // const-string v3, "XT1092"
final String v4 = "XT1093"; // const-string v4, "XT1093"
final String v5 = "XT1094"; // const-string v5, "XT1094"
final String v6 = "XT1095"; // const-string v6, "XT1095"
final String v7 = "XT1096"; // const-string v7, "XT1096"
final String v8 = "XT1097"; // const-string v8, "XT1097"
final String v9 = "XT1098"; // const-string v9, "XT1098"
final String v10 = "XT1031"; // const-string v10, "XT1031"
final String v11 = "XT1028"; // const-string v11, "XT1028"
final String v12 = "XT937C"; // const-string v12, "XT937C"
final String v13 = "XT1032"; // const-string v13, "XT1032"
final String v14 = "XT1008"; // const-string v14, "XT1008"
final String v15 = "XT1033"; // const-string v15, "XT1033"
final String v16 = "XT1035"; // const-string v16, "XT1035"
final String v17 = "XT1034"; // const-string v17, "XT1034"
final String v18 = "XT939G"; // const-string v18, "XT939G"
final String v19 = "XT1039"; // const-string v19, "XT1039"
final String v20 = "XT1040"; // const-string v20, "XT1040"
final String v21 = "XT1042"; // const-string v21, "XT1042"
final String v22 = "XT1045"; // const-string v22, "XT1045"
final String v23 = "XT1063"; // const-string v23, "XT1063"
final String v24 = "XT1064"; // const-string v24, "XT1064"
final String v25 = "XT1068"; // const-string v25, "XT1068"
final String v26 = "XT1069"; // const-string v26, "XT1069"
final String v27 = "XT1072"; // const-string v27, "XT1072"
final String v28 = "XT1077"; // const-string v28, "XT1077"
final String v29 = "XT1078"; // const-string v29, "XT1078"
final String v30 = "XT1079"; // const-string v30, "XT1079"
/* filled-new-array/range {v2 ..v30}, [Ljava/lang/String; */
/* .line 4 */
java.util.Arrays .asList ( v2 );
/* invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
/* .line 5 */
v0 = v2 = android.os.Build.MODEL;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* new-instance v0, Ljava/util/concurrent/locks/ReentrantLock; */
	 /* invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V */
} // :cond_0
/* new-instance v0, Le/b/a/y/z/e/q0; */
/* invoke-direct {v0}, Le/b/a/y/z/e/q0;-><init>()V */
} // :goto_0
/* .line 6 */
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V */
/* .line 7 */
/* new-instance v1, Landroid/graphics/PorterDuffXfermode; */
v2 = android.graphics.PorterDuff$Mode.SRC_IN;
/* invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V */
(( android.graphics.Paint ) v0 ).setXfermode ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
return;
} // .end method
public static Integer a ( Integer p0 ) {
/* .locals 0 */
/* packed-switch p0, :pswitch_data_0 */
int p0 = 0; // const/4 p0, 0x0
/* :pswitch_0 */
/* const/16 p0, 0x10e */
/* :pswitch_1 */
/* const/16 p0, 0x5a */
/* :pswitch_2 */
/* const/16 p0, 0xb4 */
} // :goto_0
/* :pswitch_data_0 */
/* .packed-switch 0x3 */
/* :pswitch_2 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static android.graphics.Bitmap$Config a ( android.graphics.Bitmap p0 ) {
/* .locals 1 */
/* .line 28 */
(( android.graphics.Bitmap ) p0 ).getConfig ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.graphics.Bitmap ) p0 ).getConfig ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
} // :cond_0
p0 = android.graphics.Bitmap$Config.ARGB_8888;
} // :goto_0
} // .end method
public static android.graphics.Bitmap a ( Object p0, android.graphics.Bitmap p1, Integer p2 ) {
/* .locals 4 */
/* .line 15 */
v0 = e.b.a.y.z.e.r0 .b ( p2 );
/* if-nez v0, :cond_0 */
/* .line 16 */
} // :cond_0
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
/* .line 17 */
e.b.a.y.z.e.r0 .a ( p2,v0 );
/* .line 18 */
/* new-instance p2, Landroid/graphics/RectF; */
v1 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v1, v1 */
v2 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v2, v2 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {p2, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V */
/* .line 19 */
(( android.graphics.Matrix ) v0 ).mapRect ( p2 ); // invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z
/* .line 20 */
v1 = (( android.graphics.RectF ) p2 ).width ( ); // invoke-virtual {p2}, Landroid/graphics/RectF;->width()F
v1 = java.lang.Math .round ( v1 );
/* .line 21 */
v2 = (( android.graphics.RectF ) p2 ).height ( ); // invoke-virtual {p2}, Landroid/graphics/RectF;->height()F
v2 = java.lang.Math .round ( v2 );
/* .line 22 */
e.b.a.y.z.e.r0 .a ( p1 );
/* .line 23 */
/* .line 24 */
/* iget v1, p2, Landroid/graphics/RectF;->left:F */
/* neg-float v1, v1 */
/* iget p2, p2, Landroid/graphics/RectF;->top:F */
/* neg-float p2, p2 */
(( android.graphics.Matrix ) v0 ).postTranslate ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z
/* .line 25 */
p2 = (( android.graphics.Bitmap ) p1 ).hasAlpha ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->hasAlpha()Z
(( android.graphics.Bitmap ) p0 ).setHasAlpha ( p2 ); // invoke-virtual {p0, p2}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V
/* .line 26 */
e.b.a.y.z.e.r0 .a ( p1,p0,v0 );
} // .end method
public static android.graphics.Bitmap a ( Object p0, android.graphics.Bitmap p1, Integer p2, Integer p3 ) {
/* .locals 6 */
/* .line 2 */
v0 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* if-ne v0, p2, :cond_0 */
v0 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* if-ne v0, p3, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
/* .line 4 */
v1 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* mul-int v1, v1, p3 */
v2 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* mul-int v2, v2, p2 */
int v3 = 0; // const/4 v3, 0x0
/* const/high16 v4, 0x3f000000 # 0.5f */
/* if-le v1, v2, :cond_1 */
/* int-to-float v1, p3 */
/* .line 5 */
v2 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v2, v2 */
/* div-float/2addr v1, v2 */
/* int-to-float v2, p2 */
/* .line 6 */
v5 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v5, v5 */
/* mul-float v5, v5, v1 */
/* sub-float/2addr v2, v5 */
/* mul-float v2, v2, v4 */
/* move v3, v2 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_1
/* int-to-float v1, p2 */
/* .line 7 */
v2 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v2, v2 */
/* div-float/2addr v1, v2 */
/* int-to-float v2, p3 */
/* .line 8 */
v5 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v5, v5 */
/* mul-float v5, v5, v1 */
/* sub-float/2addr v2, v5 */
/* mul-float v2, v2, v4 */
/* .line 9 */
} // :goto_0
(( android.graphics.Matrix ) v0 ).setScale ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->setScale(FF)V
/* add-float/2addr v3, v4 */
/* float-to-int v1, v3 */
/* int-to-float v1, v1 */
/* add-float/2addr v2, v4 */
/* float-to-int v2, v2 */
/* int-to-float v2, v2 */
/* .line 10 */
(( android.graphics.Matrix ) v0 ).postTranslate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z
/* .line 11 */
e.b.a.y.z.e.r0 .a ( p1 );
/* .line 12 */
e.b.a.y.z.e.r0 .a ( p1,p0 );
/* .line 13 */
e.b.a.y.z.e.r0 .a ( p1,p0,v0 );
} // .end method
public static java.util.concurrent.locks.Lock a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.y.z.e.r0.d;
} // .end method
public static void a ( Integer p0, android.graphics.Matrix p1 ) {
/* .locals 5 */
/* const/high16 v0, -0x3d4c0000 # -90.0f */
/* const/high16 v1, 0x42b40000 # 90.0f */
/* const/high16 v2, 0x43340000 # 180.0f */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* const/high16 v4, -0x40800000 # -1.0f */
/* packed-switch p0, :pswitch_data_0 */
/* .line 35 */
/* :pswitch_0 */
(( android.graphics.Matrix ) p1 ).setRotate ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setRotate(F)V
/* .line 36 */
/* :pswitch_1 */
(( android.graphics.Matrix ) p1 ).setRotate ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setRotate(F)V
/* .line 37 */
(( android.graphics.Matrix ) p1 ).postScale ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z
/* .line 38 */
/* :pswitch_2 */
(( android.graphics.Matrix ) p1 ).setRotate ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->setRotate(F)V
/* .line 39 */
/* :pswitch_3 */
(( android.graphics.Matrix ) p1 ).setRotate ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Matrix;->setRotate(F)V
/* .line 40 */
(( android.graphics.Matrix ) p1 ).postScale ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z
/* .line 41 */
/* :pswitch_4 */
(( android.graphics.Matrix ) p1 ).setRotate ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->setRotate(F)V
/* .line 42 */
(( android.graphics.Matrix ) p1 ).postScale ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Landroid/graphics/Matrix;->postScale(FF)Z
/* .line 43 */
/* :pswitch_5 */
(( android.graphics.Matrix ) p1 ).setRotate ( v2 ); // invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->setRotate(F)V
/* .line 44 */
/* :pswitch_6 */
(( android.graphics.Matrix ) p1 ).setScale ( v4, v3 ); // invoke-virtual {p1, v4, v3}, Landroid/graphics/Matrix;->setScale(FF)V
} // :goto_0
return;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static void a ( android.graphics.Bitmap p0, android.graphics.Bitmap p1 ) {
/* .locals 0 */
/* .line 14 */
p0 = (( android.graphics.Bitmap ) p0 ).hasAlpha ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->hasAlpha()Z
(( android.graphics.Bitmap ) p1 ).setHasAlpha ( p0 ); // invoke-virtual {p1, p0}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V
return;
} // .end method
public static void a ( android.graphics.Bitmap p0, android.graphics.Bitmap p1, android.graphics.Matrix p2 ) {
/* .locals 1 */
/* .line 29 */
v0 = e.b.a.y.z.e.r0.d;
/* .line 30 */
try { // :try_start_0
/* new-instance v0, Landroid/graphics/Canvas; */
/* invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 31 */
p1 = e.b.a.y.z.e.r0.a;
(( android.graphics.Canvas ) v0 ).drawBitmap ( p0, p2, p1 ); // invoke-virtual {v0, p0, p2, p1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* .line 32 */
e.b.a.y.z.e.r0 .a ( v0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 33 */
p0 = e.b.a.y.z.e.r0.d;
return;
/* :catchall_0 */
/* move-exception p0 */
p1 = e.b.a.y.z.e.r0.d;
/* .line 34 */
/* throw p0 */
} // .end method
public static void a ( android.graphics.Canvas p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 27 */
(( android.graphics.Canvas ) p0 ).setBitmap ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
return;
} // .end method
public static android.graphics.Bitmap b ( Object p0, android.graphics.Bitmap p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
int v1 = 2; // const/4 v1, 0x2
final String v2 = "TransformationUtils"; // const-string v2, "TransformationUtils"
/* if-gt v0, p2, :cond_1 */
v0 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* if-gt v0, p3, :cond_1 */
/* .line 2 */
p0 = android.util.Log .isLoggable ( v2,v1 );
if ( p0 != null) { // if-eqz p0, :cond_0
final String p0 = "requested target size larger or equal to input, returning input"; // const-string p0, "requested target size larger or equal to input, returning input"
/* .line 3 */
android.util.Log .v ( v2,p0 );
} // :cond_0
/* .line 4 */
} // :cond_1
v0 = android.util.Log .isLoggable ( v2,v1 );
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = "requested target size too big for input, fit centering instead"; // const-string v0, "requested target size too big for input, fit centering instead"
/* .line 5 */
android.util.Log .v ( v2,v0 );
/* .line 6 */
} // :cond_2
e.b.a.y.z.e.r0 .c ( p0,p1,p2,p3 );
} // .end method
public static Boolean b ( Integer p0 ) {
/* .locals 0 */
/* packed-switch p0, :pswitch_data_0 */
int p0 = 0; // const/4 p0, 0x0
/* :pswitch_0 */
int p0 = 1; // const/4 p0, 0x1
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static android.graphics.Bitmap c ( Object p0, android.graphics.Bitmap p1, Integer p2, Integer p3 ) {
/* .locals 6 */
/* .line 1 */
v0 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
int v1 = 2; // const/4 v1, 0x2
final String v2 = "TransformationUtils"; // const-string v2, "TransformationUtils"
/* if-ne v0, p2, :cond_1 */
v0 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* if-ne v0, p3, :cond_1 */
/* .line 2 */
p0 = android.util.Log .isLoggable ( v2,v1 );
if ( p0 != null) { // if-eqz p0, :cond_0
final String p0 = "requested target size matches input, returning input"; // const-string p0, "requested target size matches input, returning input"
/* .line 3 */
android.util.Log .v ( v2,p0 );
} // :cond_0
} // :cond_1
/* int-to-float v0, p2 */
/* .line 4 */
v3 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v3, v3 */
/* div-float/2addr v0, v3 */
/* int-to-float v3, p3 */
/* .line 5 */
v4 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
/* .line 6 */
v0 = java.lang.Math .min ( v0,v3 );
/* .line 7 */
v3 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v3, v3 */
/* mul-float v3, v3, v0 */
v3 = java.lang.Math .round ( v3 );
/* .line 8 */
v4 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v4, v4 */
/* mul-float v4, v4, v0 */
v4 = java.lang.Math .round ( v4 );
/* .line 9 */
v5 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* if-ne v5, v3, :cond_3 */
v3 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* if-ne v3, v4, :cond_3 */
/* .line 10 */
p0 = android.util.Log .isLoggable ( v2,v1 );
if ( p0 != null) { // if-eqz p0, :cond_2
final String p0 = "adjusted target size matches input, returning input"; // const-string p0, "adjusted target size matches input, returning input"
/* .line 11 */
android.util.Log .v ( v2,p0 );
} // :cond_2
/* .line 12 */
} // :cond_3
v3 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v3, v3 */
/* mul-float v3, v3, v0 */
/* float-to-int v3, v3 */
/* .line 13 */
v4 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v4, v4 */
/* mul-float v4, v4, v0 */
/* float-to-int v4, v4 */
/* .line 14 */
e.b.a.y.z.e.r0 .a ( p1 );
/* .line 15 */
/* .line 16 */
e.b.a.y.z.e.r0 .a ( p1,p0 );
/* .line 17 */
v1 = android.util.Log .isLoggable ( v2,v1 );
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 18 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "request: "; // const-string v3, "request: "
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p2 = "x"; // const-string p2, "x"
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,p3 );
/* .line 19 */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "toFit: "; // const-string v1, "toFit: "
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,p3 );
/* .line 20 */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "toReuse: "; // const-string v1, "toReuse: "
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,p2 );
/* .line 21 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "minPct: "; // const-string p3, "minPct: "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v2,p2 );
/* .line 22 */
} // :cond_4
/* new-instance p2, Landroid/graphics/Matrix; */
/* invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V */
/* .line 23 */
(( android.graphics.Matrix ) p2 ).setScale ( v0, v0 ); // invoke-virtual {p2, v0, v0}, Landroid/graphics/Matrix;->setScale(FF)V
/* .line 24 */
e.b.a.y.z.e.r0 .a ( p1,p0,p2 );
} // .end method
