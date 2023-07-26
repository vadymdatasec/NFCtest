public class e.b.a.y.z.i.c implements e.b.a.y.t {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/t<", */
	 /* "Ljava/nio/ByteBuffer;", */
	 /* "Le/b/a/y/z/i/f;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.b.a.y.z.i.a f;
public static final e.b.a.y.z.i.b g;
/* # instance fields */
public final android.content.Context a;
public final java.util.List b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.z.i.b c;
public final e.b.a.y.z.i.a d;
public final e.b.a.y.z.i.d e;
/* # direct methods */
public static e.b.a.y.z.i.c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/b/a/y/z/i/a; */
/* invoke-direct {v0}, Le/b/a/y/z/i/a;-><init>()V */
/* .line 2 */
/* new-instance v0, Le/b/a/y/z/i/b; */
/* invoke-direct {v0}, Le/b/a/y/z/i/b;-><init>()V */
return;
} // .end method
public e.b.a.y.z.i.c ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Le/b/a/y/x/f1/g;", */
/* "Le/b/a/y/x/f1/b;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
v5 = e.b.a.y.z.i.c.g;
v6 = e.b.a.y.z.i.c.f;
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* invoke-direct/range {v0 ..v6}, Le/b/a/y/z/i/c;-><init>(Landroid/content/Context;Ljava/util/List;Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;Le/b/a/y/z/i/b;Le/b/a/y/z/i/a;)V */
return;
} // .end method
public e.b.a.y.z.i.c ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Le/b/a/y/x/f1/g;", */
/* "Le/b/a/y/x/f1/b;", */
/* "Le/b/a/y/z/i/b;", */
/* "Le/b/a/y/z/i/a;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.a = p1;
/* .line 4 */
this.b = p2;
/* .line 5 */
this.d = p6;
/* .line 6 */
/* new-instance p1, Le/b/a/y/z/i/d; */
/* invoke-direct {p1, p3, p4}, Le/b/a/y/z/i/d;-><init>(Le/b/a/y/x/f1/g;Le/b/a/y/x/f1/b;)V */
this.e = p1;
/* .line 7 */
this.c = p5;
return;
} // .end method
public static Integer a ( Object p0, Integer p1, Integer p2 ) {
/* .locals 4 */
/* .line 32 */
v0 = (( e.b.a.x.d ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/x/d;->a()I
/* div-int/2addr v0, p2 */
v1 = (( e.b.a.x.d ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/d;->d()I
/* div-int/2addr v1, p1 */
v0 = java.lang.Math .min ( v0,v1 );
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 33 */
} // :cond_0
v0 = java.lang.Integer .highestOneBit ( v0 );
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
/* .line 34 */
v0 = java.lang.Math .max ( v1,v0 );
int v2 = 2; // const/4 v2, 0x2
final String v3 = "BufferGifDecoder"; // const-string v3, "BufferGifDecoder"
/* .line 35 */
v2 = android.util.Log .isLoggable ( v3,v2 );
if ( v2 != null) { // if-eqz v2, :cond_1
/* if-le v0, v1, :cond_1 */
/* .line 36 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Downsampling GIF, sampleSize: "; // const-string v2, "Downsampling GIF, sampleSize: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ", target dimens: ["; // const-string v2, ", target dimens: ["
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = "x"; // const-string p1, "x"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p2 = "], actual dimens: ["; // const-string p2, "], actual dimens: ["
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 37 */
p2 = (( e.b.a.x.d ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/x/d;->d()I
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 38 */
p0 = (( e.b.a.x.d ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/x/d;->a()I
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p0 = "]"; // const-string p0, "]"
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 39 */
android.util.Log .v ( v3,p0 );
} // :cond_1
} // .end method
/* # virtual methods */
public e.b.a.y.x.y0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Ljava/nio/ByteBuffer; */
(( e.b.a.y.z.i.c ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/i/c;->a(Ljava/nio/ByteBuffer;IILe/b/a/y/r;)Le/b/a/y/z/i/h;
} // .end method
public final e.b.a.y.z.i.h a ( java.nio.ByteBuffer p0, Integer p1, Integer p2, Object p3, Object p4 ) {
/* .locals 16 */
/* move-object/from16 v1, p0 */
final String v2 = "Decoded GIF from stream in "; // const-string v2, "Decoded GIF from stream in "
final String v3 = "BufferGifDecoder"; // const-string v3, "BufferGifDecoder"
/* .line 9 */
e.b.a.e0.m .a ( );
/* move-result-wide v4 */
int v6 = 2; // const/4 v6, 0x2
/* .line 10 */
try { // :try_start_0
/* invoke-virtual/range {p4 ..p4}, Le/b/a/x/e;->c()Le/b/a/x/d; */
/* .line 11 */
v7 = (( e.b.a.x.d ) v0 ).b ( ); // invoke-virtual {v0}, Le/b/a/x/d;->b()I
int v8 = 0; // const/4 v8, 0x0
/* if-lez v7, :cond_5 */
v7 = (( e.b.a.x.d ) v0 ).c ( ); // invoke-virtual {v0}, Le/b/a/x/d;->c()I
if ( v7 != null) { // if-eqz v7, :cond_0
/* goto/16 :goto_1 */
/* .line 12 */
} // :cond_0
v7 = e.b.a.y.z.i.p.a;
/* move-object/from16 v9, p5 */
(( e.b.a.y.r ) v9 ).a ( v7 ); // invoke-virtual {v9, v7}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
v9 = e.b.a.y.b.c;
/* if-ne v7, v9, :cond_1 */
/* .line 13 */
v7 = android.graphics.Bitmap$Config.RGB_565;
/* .line 14 */
} // :cond_1
v7 = android.graphics.Bitmap$Config.ARGB_8888;
} // :goto_0
/* move/from16 v13, p2 */
/* move/from16 v14, p3 */
/* .line 15 */
v9 = e.b.a.y.z.i.c .a ( v0,v13,v14 );
/* .line 16 */
v10 = this.d;
v11 = this.e;
/* move-object/from16 v12, p1 */
(( e.b.a.y.z.i.a ) v10 ).a ( v11, v0, v12, v9 ); // invoke-virtual {v10, v11, v0, v12, v9}, Le/b/a/y/z/i/a;->a(Le/b/a/x/a;Le/b/a/x/d;Ljava/nio/ByteBuffer;I)Le/b/a/x/b;
/* .line 17 */
/* .line 18 */
/* .line 19 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v15, :cond_3 */
/* .line 20 */
v0 = android.util.Log .isLoggable ( v3,v6 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 21 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.b.a.e0.m .a ( v4,v5 );
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v0 ).append ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v0 );
} // :cond_2
/* .line 22 */
} // :cond_3
try { // :try_start_1
e.b.a.y.z.d .a ( );
/* .line 23 */
/* new-instance v0, Le/b/a/y/z/i/f; */
v10 = this.a;
/* move-object v9, v0 */
/* move/from16 v13, p2 */
/* move/from16 v14, p3 */
/* invoke-direct/range {v9 ..v15}, Le/b/a/y/z/i/f;-><init>(Landroid/content/Context;Le/b/a/x/b;Le/b/a/y/v;IILandroid/graphics/Bitmap;)V */
/* .line 24 */
/* new-instance v7, Le/b/a/y/z/i/h; */
/* invoke-direct {v7, v0}, Le/b/a/y/z/i/h;-><init>(Le/b/a/y/z/i/f;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 25 */
v0 = android.util.Log .isLoggable ( v3,v6 );
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 26 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.b.a.e0.m .a ( v4,v5 );
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v0 ).append ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v0 );
} // :cond_4
/* .line 27 */
} // :cond_5
} // :goto_1
v0 = android.util.Log .isLoggable ( v3,v6 );
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 28 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.b.a.e0.m .a ( v4,v5 );
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v0 ).append ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v0 );
} // :cond_6
/* :catchall_0 */
/* move-exception v0 */
/* .line 29 */
v6 = android.util.Log .isLoggable ( v3,v6 );
if ( v6 != null) { // if-eqz v6, :cond_7
/* .line 30 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.b.a.e0.m .a ( v4,v5 );
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v6 ).append ( v4, v5 ); // invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v2 );
/* .line 31 */
} // :cond_7
/* throw v0 */
} // .end method
public e.b.a.y.z.i.h a ( java.nio.ByteBuffer p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 7 */
/* .line 5 */
v0 = this.c;
(( e.b.a.y.z.i.b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/y/z/i/b;->a(Ljava/nio/ByteBuffer;)Le/b/a/x/e;
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move-object v5, v0 */
/* move-object v6, p4 */
/* .line 6 */
try { // :try_start_0
/* invoke-virtual/range {v1 ..v6}, Le/b/a/y/z/i/c;->a(Ljava/nio/ByteBuffer;IILe/b/a/x/e;Le/b/a/y/r;)Le/b/a/y/z/i/h; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 7 */
p2 = this.c;
(( e.b.a.y.z.i.b ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/b/a/y/z/i/b;->a(Le/b/a/x/e;)V
/* :catchall_0 */
/* move-exception p1 */
p2 = this.c;
(( e.b.a.y.z.i.b ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/b/a/y/z/i/b;->a(Le/b/a/x/e;)V
/* .line 8 */
/* throw p1 */
} // .end method
public Boolean a ( java.lang.Object p0, Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p1, Ljava/nio/ByteBuffer; */
p1 = (( e.b.a.y.z.i.c ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/z/i/c;->a(Ljava/nio/ByteBuffer;Le/b/a/y/r;)Z
} // .end method
public Boolean a ( java.nio.ByteBuffer p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
v0 = e.b.a.y.z.i.p.b;
(( e.b.a.y.r ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
/* check-cast p2, Ljava/lang/Boolean; */
p2 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p2, :cond_0 */
p2 = this.b;
/* .line 4 */
e.b.a.y.m .a ( p2,p1 );
p2 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF;
/* if-ne p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
