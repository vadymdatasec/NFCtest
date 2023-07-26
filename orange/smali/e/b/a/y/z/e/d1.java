public class e.b.a.y.z.e.d1 implements e.b.a.y.t {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/t<", */
	 /* "TT;", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.b.a.y.q d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/q<", */
/* "Ljava/lang/Long;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final e.b.a.y.q e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/q<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final e.b.a.y.z.e.a1 f;
public static final java.util.List g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final e.b.a.y.z.e.z0 a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/z/e/z0<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.x.f1.g b;
public final e.b.a.y.z.e.a1 c;
/* # direct methods */
public static e.b.a.y.z.e.d1 ( ) {
/* .locals 3 */
/* const-wide/16 v0, -0x1 */
/* .line 1 */
java.lang.Long .valueOf ( v0,v1 );
/* new-instance v1, Le/b/a/y/z/e/u0; */
/* invoke-direct {v1}, Le/b/a/y/z/e/u0;-><init>()V */
final String v2 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"; // const-string v2, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame"
/* .line 2 */
e.b.a.y.q .a ( v2,v0,v1 );
int v0 = 2; // const/4 v0, 0x2
/* .line 3 */
java.lang.Integer .valueOf ( v0 );
/* new-instance v1, Le/b/a/y/z/e/v0; */
/* invoke-direct {v1}, Le/b/a/y/z/e/v0;-><init>()V */
final String v2 = "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"; // const-string v2, "com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption"
/* .line 4 */
e.b.a.y.q .a ( v2,v0,v1 );
/* .line 5 */
/* new-instance v0, Le/b/a/y/z/e/a1; */
/* invoke-direct {v0}, Le/b/a/y/z/e/a1;-><init>()V */
final String v0 = "TP1A"; // const-string v0, "TP1A"
final String v1 = "TD1A.220804.031"; // const-string v1, "TD1A.220804.031"
/* .line 6 */
/* filled-new-array {v0, v1}, [Ljava/lang/String; */
/* .line 7 */
java.util.Arrays .asList ( v0 );
java.util.Collections .unmodifiableList ( v0 );
return;
} // .end method
public e.b.a.y.z.e.d1 ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/f1/g;", */
/* "Le/b/a/y/z/e/z0<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.b.a.y.z.e.d1.f;
/* invoke-direct {p0, p1, p2, v0}, Le/b/a/y/z/e/d1;-><init>(Le/b/a/y/x/f1/g;Le/b/a/y/z/e/z0;Le/b/a/y/z/e/a1;)V */
return;
} // .end method
public e.b.a.y.z.e.d1 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/f1/g;", */
/* "Le/b/a/y/z/e/z0<", */
/* "TT;>;", */
/* "Le/b/a/y/z/e/a1;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
this.b = p1;
/* .line 4 */
this.a = p2;
/* .line 5 */
this.c = p3;
return;
} // .end method
public static android.graphics.Bitmap a ( android.media.MediaMetadataRetriever p0, Long p1, Integer p2 ) {
/* .locals 0 */
/* .line 61 */
(( android.media.MediaMetadataRetriever ) p0 ).getFrameAtTime ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;
} // .end method
public static android.graphics.Bitmap a ( android.media.MediaMetadataRetriever p0, Long p1, Integer p2, Integer p3, Integer p4, Object p5 ) {
/* .locals 9 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0x1b */
} // .end annotation
/* const/16 v0, 0x12 */
/* .line 49 */
try { // :try_start_0
(( android.media.MediaMetadataRetriever ) p0 ).extractMetadata ( v0 ); // invoke-virtual {p0, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;
/* .line 50 */
v0 = java.lang.Integer .parseInt ( v0 );
/* const/16 v1, 0x13 */
/* .line 51 */
(( android.media.MediaMetadataRetriever ) p0 ).extractMetadata ( v1 ); // invoke-virtual {p0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;
/* .line 52 */
v1 = java.lang.Integer .parseInt ( v1 );
/* const/16 v2, 0x18 */
/* .line 53 */
(( android.media.MediaMetadataRetriever ) p0 ).extractMetadata ( v2 ); // invoke-virtual {p0, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;
/* .line 54 */
v2 = java.lang.Integer .parseInt ( v2 );
/* const/16 v3, 0x5a */
/* if-eq v2, v3, :cond_0 */
/* const/16 v3, 0x10e */
/* if-ne v2, v3, :cond_1 */
} // :cond_0
/* move v8, v1 */
/* move v1, v0 */
/* move v0, v8 */
/* .line 55 */
} // :cond_1
p4 = (( e.b.a.y.z.e.u ) p6 ).b ( v0, v1, p4, p5 ); // invoke-virtual {p6, v0, v1, p4, p5}, Le/b/a/y/z/e/u;->b(IIII)F
/* int-to-float p5, v0 */
/* mul-float p5, p5, p4 */
/* .line 56 */
v6 = java.lang.Math .round ( p5 );
/* int-to-float p5, v1 */
/* mul-float p4, p4, p5 */
/* .line 57 */
v7 = java.lang.Math .round ( p4 );
/* move-object v2, p0 */
/* move-wide v3, p1 */
/* move v5, p3 */
/* .line 58 */
/* invoke-virtual/range {v2 ..v7}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIII)Landroid/graphics/Bitmap; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception p0 */
int p1 = 3; // const/4 p1, 0x3
final String p2 = "VideoDecoder"; // const-string p2, "VideoDecoder"
/* .line 59 */
p1 = android.util.Log .isLoggable ( p2,p1 );
if ( p1 != null) { // if-eqz p1, :cond_2
final String p1 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"; // const-string p1, "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
/* .line 60 */
android.util.Log .d ( p2,p1,p0 );
} // :cond_2
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static android.graphics.Bitmap a ( android.media.MediaMetadataRetriever p0, android.graphics.Bitmap p1 ) {
/* .locals 8 */
final String v0 = "VideoDecoder"; // const-string v0, "VideoDecoder"
/* .line 27 */
v1 = e.b.a.y.z.e.d1 .a ( );
/* if-nez v1, :cond_0 */
} // :cond_0
int v1 = 3; // const/4 v1, 0x3
int v2 = 0; // const/4 v2, 0x0
/* .line 28 */
try { // :try_start_0
v3 = e.b.a.y.z.e.d1 .a ( p0 );
if ( v3 != null) { // if-eqz v3, :cond_1
/* const/16 v3, 0x18 */
/* .line 29 */
(( android.media.MediaMetadataRetriever ) p0 ).extractMetadata ( v3 ); // invoke-virtual {p0, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;
/* .line 30 */
p0 = java.lang.Integer .parseInt ( p0 );
/* .line 31 */
p0 = java.lang.Math .abs ( p0 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* const/16 v3, 0xb4 */
/* if-ne p0, v3, :cond_1 */
int v2 = 1; // const/4 v2, 0x1
/* :catch_0 */
/* nop */
/* .line 32 */
p0 = android.util.Log .isLoggable ( v0,v1 );
if ( p0 != null) { // if-eqz p0, :cond_1
final String p0 = "Exception trying to extract HDR transfer function or rotation"; // const-string p0, "Exception trying to extract HDR transfer function or rotation"
/* .line 33 */
android.util.Log .d ( v0,p0 );
} // :cond_1
} // :goto_0
/* if-nez v2, :cond_2 */
/* .line 34 */
} // :cond_2
p0 = android.util.Log .isLoggable ( v0,v1 );
if ( p0 != null) { // if-eqz p0, :cond_3
final String p0 = "Applying HDR 180 deg thumbnail correction"; // const-string p0, "Applying HDR 180 deg thumbnail correction"
/* .line 35 */
android.util.Log .d ( v0,p0 );
/* .line 36 */
} // :cond_3
/* new-instance v6, Landroid/graphics/Matrix; */
/* invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V */
/* const/high16 p0, 0x43340000 # 180.0f */
/* .line 37 */
v0 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v0, v0 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
v2 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v2, v2 */
/* div-float/2addr v2, v1 */
/* .line 38 */
(( android.graphics.Matrix ) v6 ).postRotate ( p0, v0, v2 ); // invoke-virtual {v6, p0, v0, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 39 */
v4 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 40 */
v5 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
int v7 = 1; // const/4 v7, 0x1
/* move-object v1, p1 */
/* .line 41 */
/* invoke-static/range {v1 ..v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
} // .end method
public static e.b.a.y.t a ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/f1/g;", */
/* ")", */
/* "Le/b/a/y/t<", */
/* "Landroid/content/res/AssetFileDescriptor;", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/b/a/y/z/e/d1; */
/* new-instance v1, Le/b/a/y/z/e/w0; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, v2}, Le/b/a/y/z/e/w0;-><init>(Le/b/a/y/z/e/u0;)V */
/* invoke-direct {v0, p0, v1}, Le/b/a/y/z/e/d1;-><init>(Le/b/a/y/x/f1/g;Le/b/a/y/z/e/z0;)V */
} // .end method
public static Boolean a ( ) {
/* .locals 3 */
/* .line 46 */
v0 = android.os.Build.MODEL;
final String v1 = "Pixel"; // const-string v1, "Pixel"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* const/16 v1, 0x21 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-ne v0, v1, :cond_0 */
/* .line 47 */
v0 = e.b.a.y.z.e.d1 .b ( );
/* .line 48 */
} // :cond_0
/* const/16 v2, 0x1e */
/* if-lt v0, v2, :cond_1 */
/* if-ge v0, v1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static Boolean a ( android.media.MediaMetadataRetriever p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/NumberFormatException; */
/* } */
} // .end annotation
/* const/16 v0, 0x24 */
/* .line 42 */
(( android.media.MediaMetadataRetriever ) p0 ).extractMetadata ( v0 ); // invoke-virtual {p0, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;
/* const/16 v1, 0x23 */
/* .line 43 */
(( android.media.MediaMetadataRetriever ) p0 ).extractMetadata ( v1 ); // invoke-virtual {p0, v1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;
/* .line 44 */
v0 = java.lang.Integer .parseInt ( v0 );
/* .line 45 */
p0 = java.lang.Integer .parseInt ( p0 );
int v1 = 6; // const/4 v1, 0x6
int v2 = 7; // const/4 v2, 0x7
/* if-eq v0, v2, :cond_0 */
/* if-ne v0, v1, :cond_1 */
} // :cond_0
/* if-ne p0, v1, :cond_1 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static e.b.a.y.t b ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/f1/g;", */
/* ")", */
/* "Le/b/a/y/t<", */
/* "Ljava/nio/ByteBuffer;", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/b/a/y/z/e/d1; */
/* new-instance v1, Le/b/a/y/z/e/y0; */
/* invoke-direct {v1}, Le/b/a/y/z/e/y0;-><init>()V */
/* invoke-direct {v0, p0, v1}, Le/b/a/y/z/e/d1;-><init>(Le/b/a/y/x/f1/g;Le/b/a/y/z/e/z0;)V */
} // .end method
public static Boolean b ( ) {
/* .locals 3 */
/* .line 2 */
v0 = e.b.a.y.z.e.d1.g;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Ljava/lang/String; */
/* .line 3 */
v2 = android.os.Build.ID;
v1 = (( java.lang.String ) v2 ).startsWith ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static e.b.a.y.t c ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/f1/g;", */
/* ")", */
/* "Le/b/a/y/t<", */
/* "Landroid/os/ParcelFileDescriptor;", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/b/a/y/z/e/d1; */
/* new-instance v1, Le/b/a/y/z/e/b1; */
/* invoke-direct {v1}, Le/b/a/y/z/e/b1;-><init>()V */
/* invoke-direct {v0, p0, v1}, Le/b/a/y/z/e/d1;-><init>(Le/b/a/y/x/f1/g;Le/b/a/y/z/e/z0;)V */
} // .end method
/* # virtual methods */
public final android.graphics.Bitmap a ( java.lang.Object p0, android.media.MediaMetadataRetriever p1, Long p2, Integer p3, Integer p4, Integer p5, Object p6 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;", */
/* "Landroid/media/MediaMetadataRetriever;", */
/* "JIII", */
/* "Le/b/a/y/z/e/u;", */
/* ")", */
/* "Landroid/graphics/Bitmap;" */
/* } */
} // .end annotation
/* .line 20 */
p1 = (( e.b.a.y.z.e.d1 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/z/e/d1;->a(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;)Z
/* if-nez p1, :cond_3 */
int p1 = 0; // const/4 p1, 0x0
/* .line 21 */
/* const/16 v1, 0x1b */
/* if-lt v0, v1, :cond_0 */
/* const/high16 v0, -0x80000000 */
/* if-eq p6, v0, :cond_0 */
/* if-eq p7, v0, :cond_0 */
v0 = e.b.a.y.z.e.u.d;
/* if-eq p8, v0, :cond_0 */
/* .line 22 */
/* invoke-static/range {p2 ..p8}, Le/b/a/y/z/e/d1;->a(Landroid/media/MediaMetadataRetriever;JIIILe/b/a/y/z/e/u;)Landroid/graphics/Bitmap; */
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 23 */
e.b.a.y.z.e.d1 .a ( p2,p3,p4,p5 );
/* .line 24 */
} // :cond_1
e.b.a.y.z.e.d1 .a ( p2,p1 );
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 25 */
} // :cond_2
/* new-instance p1, Le/b/a/y/z/e/c1; */
/* invoke-direct {p1}, Le/b/a/y/z/e/c1;-><init>()V */
/* throw p1 */
/* .line 26 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Cannot decode VP8 video on CrOS."; // const-string p2, "Cannot decode VP8 video on CrOS."
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public e.b.a.y.x.y0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;II", */
/* "Le/b/a/y/r;", */
/* ")", */
/* "Le/b/a/y/x/y0<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
v0 = e.b.a.y.z.e.d1.d;
(( e.b.a.y.r ) p4 ).a ( v0 ); // invoke-virtual {p4, v0}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, v4, v0 */
/* if-gez v2, :cond_1 */
/* const-wide/16 v0, -0x1 */
/* cmp-long v2, v4, v0 */
/* if-nez v2, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Requested frame must be non-negative, or DEFAULT_FRAME, given: "; // const-string p3, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v4, v5 ); // invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 4 */
} // :cond_1
} // :goto_0
v0 = e.b.a.y.z.e.d1.e;
(( e.b.a.y.r ) p4 ).a ( v0 ); // invoke-virtual {p4, v0}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
/* if-nez v0, :cond_2 */
int v0 = 2; // const/4 v0, 0x2
/* .line 5 */
java.lang.Integer .valueOf ( v0 );
/* .line 6 */
} // :cond_2
v1 = e.b.a.y.z.e.u.f;
(( e.b.a.y.r ) p4 ).a ( v1 ); // invoke-virtual {p4, v1}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
/* check-cast p4, Le/b/a/y/z/e/u; */
/* if-nez p4, :cond_3 */
/* .line 7 */
p4 = e.b.a.y.z.e.u.e;
} // :cond_3
/* move-object v9, p4 */
/* .line 8 */
p4 = this.c;
(( e.b.a.y.z.e.a1 ) p4 ).a ( ); // invoke-virtual {p4}, Le/b/a/y/z/e/a1;->a()Landroid/media/MediaMetadataRetriever;
/* const/16 v10, 0x1d */
/* .line 9 */
try { // :try_start_0
v1 = this.a;
/* .line 10 */
v6 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p4 */
/* move v7, p2 */
/* move v8, p3 */
/* .line 11 */
/* invoke-virtual/range {v1 ..v9}, Le/b/a/y/z/e/d1;->a(Ljava/lang/Object;Landroid/media/MediaMetadataRetriever;JIIILe/b/a/y/z/e/u;)Landroid/graphics/Bitmap; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 12 */
/* if-lt p2, v10, :cond_4 */
/* .line 13 */
(( android.media.MediaMetadataRetriever ) p4 ).close ( ); // invoke-virtual {p4}, Landroid/media/MediaMetadataRetriever;->close()V
/* .line 14 */
} // :cond_4
(( android.media.MediaMetadataRetriever ) p4 ).release ( ); // invoke-virtual {p4}, Landroid/media/MediaMetadataRetriever;->release()V
/* .line 15 */
} // :goto_1
p2 = this.b;
e.b.a.y.z.e.e .a ( p1,p2 );
/* :catchall_0 */
/* move-exception p1 */
/* .line 16 */
/* if-lt p2, v10, :cond_5 */
/* .line 17 */
(( android.media.MediaMetadataRetriever ) p4 ).close ( ); // invoke-virtual {p4}, Landroid/media/MediaMetadataRetriever;->close()V
/* .line 18 */
} // :cond_5
(( android.media.MediaMetadataRetriever ) p4 ).release ( ); // invoke-virtual {p4}, Landroid/media/MediaMetadataRetriever;->release()V
/* .line 19 */
} // :goto_2
/* throw p1 */
} // .end method
public final Boolean a ( java.lang.Object p0, android.media.MediaMetadataRetriever p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;", */
/* "Landroid/media/MediaMetadataRetriever;", */
/* ")Z" */
/* } */
} // .end annotation
final String v0 = "VideoDecoder"; // const-string v0, "VideoDecoder"
/* .line 62 */
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x10 */
/* if-ge v1, v3, :cond_0 */
/* .line 63 */
} // :cond_0
v1 = android.os.Build.DEVICE;
int v3 = 1; // const/4 v3, 0x1
if ( v1 != null) { // if-eqz v1, :cond_1
final String v4 = ".+_cheets|cheets_.+"; // const-string v4, ".+_cheets|cheets_.+"
v1 = (( java.lang.String ) v1 ).matches ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-nez v1, :cond_2 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
/* const/16 v4, 0xc */
/* .line 64 */
try { // :try_start_0
(( android.media.MediaMetadataRetriever ) p2 ).extractMetadata ( v4 ); // invoke-virtual {p2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;
final String v4 = "video/webm"; // const-string v4, "video/webm"
/* .line 65 */
p2 = (( java.lang.String ) v4 ).equals ( p2 ); // invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez p2, :cond_3 */
/* .line 66 */
} // :cond_3
/* new-instance p2, Landroid/media/MediaExtractor; */
/* invoke-direct {p2}, Landroid/media/MediaExtractor;-><init>()V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 67 */
try { // :try_start_1
v1 = this.a;
/* .line 68 */
p1 = (( android.media.MediaExtractor ) p2 ).getTrackCount ( ); // invoke-virtual {p2}, Landroid/media/MediaExtractor;->getTrackCount()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-ge v1, p1, :cond_5 */
/* .line 69 */
(( android.media.MediaExtractor ) p2 ).getTrackFormat ( v1 ); // invoke-virtual {p2, v1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;
final String v5 = "mime"; // const-string v5, "mime"
/* .line 70 */
(( android.media.MediaFormat ) v4 ).getString ( v5 ); // invoke-virtual {v4, v5}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v5 = "video/x-vnd.on2.vp8"; // const-string v5, "video/x-vnd.on2.vp8"
/* .line 71 */
v4 = (( java.lang.String ) v5 ).equals ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 72 */
(( android.media.MediaExtractor ) p2 ).release ( ); // invoke-virtual {p2}, Landroid/media/MediaExtractor;->release()V
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_5
(( android.media.MediaExtractor ) p2 ).release ( ); // invoke-virtual {p2}, Landroid/media/MediaExtractor;->release()V
/* :catchall_0 */
/* move-exception p1 */
/* move-object v1, p2 */
/* :catchall_1 */
/* move-exception p1 */
} // :goto_2
int p2 = 3; // const/4 p2, 0x3
/* .line 73 */
try { // :try_start_2
p2 = android.util.Log .isLoggable ( v0,p2 );
if ( p2 != null) { // if-eqz p2, :cond_6
final String p2 = "Exception trying to extract track info for a webm video on CrOS."; // const-string p2, "Exception trying to extract track info for a webm video on CrOS."
/* .line 74 */
android.util.Log .d ( v0,p2,p1 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
} // :cond_6
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 75 */
(( android.media.MediaExtractor ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/media/MediaExtractor;->release()V
} // :cond_7
} // :goto_3
/* :catchall_2 */
/* move-exception p1 */
if ( v1 != null) { // if-eqz v1, :cond_8
(( android.media.MediaExtractor ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/media/MediaExtractor;->release()V
/* .line 76 */
} // :cond_8
/* throw p1 */
} // .end method
public Boolean a ( java.lang.Object p0, Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;", */
/* "Le/b/a/y/r;", */
/* ")Z" */
/* } */
} // .end annotation
int p1 = 1; // const/4 p1, 0x1
} // .end method
