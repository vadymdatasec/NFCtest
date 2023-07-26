public class e.b.a.x.f implements e.b.a.x.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String u;
	 /* # instance fields */
	 public a;
	 public final b;
	 public final e.b.a.x.a c;
	 public java.nio.ByteBuffer d;
	 public e;
	 public f;
	 public g;
	 public h;
	 public i;
	 public j;
	 public Integer k;
	 public e.b.a.x.d l;
	 public android.graphics.Bitmap m;
	 public Boolean n;
	 public Integer o;
	 public Integer p;
	 public Integer q;
	 public Integer r;
	 public java.lang.Boolean s;
	 public android.graphics.Bitmap$Config t;
	 /* # direct methods */
	 public static e.b.a.x.f ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public e.b.a.x.f ( ) {
		 /* .locals 1 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/16 v0, 0x100 */
		 /* new-array v0, v0, [I */
		 /* .line 4 */
		 this.b = v0;
		 /* .line 5 */
		 v0 = android.graphics.Bitmap$Config.ARGB_8888;
		 this.t = v0;
		 /* .line 6 */
		 this.c = p1;
		 /* .line 7 */
		 /* new-instance p1, Le/b/a/x/d; */
		 /* invoke-direct {p1}, Le/b/a/x/d;-><init>()V */
		 this.l = p1;
		 return;
	 } // .end method
	 public e.b.a.x.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Le/b/a/x/f;-><init>(Le/b/a/x/a;)V */
		 /* .line 2 */
		 (( e.b.a.x.f ) p0 ).a ( p2, p3, p4 ); // invoke-virtual {p0, p2, p3, p4}, Le/b/a/x/f;->a(Le/b/a/x/d;Ljava/nio/ByteBuffer;I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 1 */
		 /* .line 3 */
		 /* iget v0, p0, Le/b/a/x/f;->k:I */
	 } // .end method
	 public Integer a ( Integer p0 ) {
		 /* .locals 2 */
		 /* if-ltz p1, :cond_0 */
		 /* .line 1 */
		 v0 = this.l;
		 /* iget v1, v0, Le/b/a/x/d;->c:I */
		 /* if-ge p1, v1, :cond_0 */
		 /* .line 2 */
		 v0 = this.e;
		 /* check-cast p1, Le/b/a/x/c; */
		 /* iget p1, p1, Le/b/a/x/c;->i:I */
	 } // :cond_0
	 int p1 = -1; // const/4 p1, -0x1
} // :goto_0
} // .end method
public final Integer a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, p1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* .line 78 */
} // :goto_0
/* iget v7, p0, Le/b/a/x/f;->p:I */
/* add-int/2addr v7, p1 */
/* if-ge v1, v7, :cond_1 */
v7 = this.i;
/* array-length v8, v7 */
/* if-ge v1, v8, :cond_1 */
/* if-ge v1, p2, :cond_1 */
/* .line 79 */
/* aget-byte v7, v7, v1 */
/* and-int/lit16 v7, v7, 0xff */
/* .line 80 */
v8 = this.a;
/* aget v7, v8, v7 */
if ( v7 != null) { // if-eqz v7, :cond_0
/* shr-int/lit8 v8, v7, 0x18 */
/* and-int/lit16 v8, v8, 0xff */
/* add-int/2addr v2, v8 */
/* shr-int/lit8 v8, v7, 0x10 */
/* and-int/lit16 v8, v8, 0xff */
/* add-int/2addr v3, v8 */
/* shr-int/lit8 v8, v7, 0x8 */
/* and-int/lit16 v8, v8, 0xff */
/* add-int/2addr v4, v8 */
/* and-int/lit16 v7, v7, 0xff */
/* add-int/2addr v5, v7 */
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* add-int/2addr p1, p3 */
/* move p3, p1 */
/* .line 81 */
} // :goto_1
/* iget v1, p0, Le/b/a/x/f;->p:I */
/* add-int/2addr v1, p1 */
/* if-ge p3, v1, :cond_3 */
v1 = this.i;
/* array-length v7, v1 */
/* if-ge p3, v7, :cond_3 */
/* if-ge p3, p2, :cond_3 */
/* .line 82 */
/* aget-byte v1, v1, p3 */
/* and-int/lit16 v1, v1, 0xff */
/* .line 83 */
v7 = this.a;
/* aget v1, v7, v1 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* shr-int/lit8 v7, v1, 0x18 */
/* and-int/lit16 v7, v7, 0xff */
/* add-int/2addr v2, v7 */
/* shr-int/lit8 v7, v1, 0x10 */
/* and-int/lit16 v7, v7, 0xff */
/* add-int/2addr v3, v7 */
/* shr-int/lit8 v7, v1, 0x8 */
/* and-int/lit16 v7, v7, 0xff */
/* add-int/2addr v4, v7 */
/* and-int/lit16 v1, v1, 0xff */
/* add-int/2addr v5, v1 */
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_2
/* add-int/lit8 p3, p3, 0x1 */
} // :cond_3
/* if-nez v6, :cond_4 */
/* .line 84 */
} // :cond_4
/* div-int/2addr v2, v6 */
/* shl-int/lit8 p1, v2, 0x18 */
/* div-int/2addr v3, v6 */
/* shl-int/lit8 p2, v3, 0x10 */
/* or-int/2addr p1, p2 */
/* div-int/2addr v4, v6 */
/* shl-int/lit8 p2, v4, 0x8 */
/* or-int/2addr p1, p2 */
/* div-int/2addr v5, v6 */
/* or-int/2addr p1, v5 */
} // .end method
public final android.graphics.Bitmap a ( Object p0, Object p1 ) {
/* .locals 9 */
/* .line 25 */
v8 = this.j;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p2, :cond_1 */
/* .line 26 */
v1 = this.m;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 27 */
v2 = this.c;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 28 */
this.m = v1;
/* .line 29 */
java.util.Arrays .fill ( v8,v0 );
} // :cond_1
int v1 = 3; // const/4 v1, 0x3
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 30 */
/* iget v2, p2, Le/b/a/x/c;->g:I */
/* if-ne v2, v1, :cond_2 */
v2 = this.m;
/* if-nez v2, :cond_2 */
/* .line 31 */
java.util.Arrays .fill ( v8,v0 );
} // :cond_2
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 32 */
/* iget v2, p2, Le/b/a/x/c;->g:I */
/* if-lez v2, :cond_7 */
int v3 = 2; // const/4 v3, 0x2
/* if-ne v2, v3, :cond_6 */
/* .line 33 */
/* iget-boolean v1, p1, Le/b/a/x/c;->f:Z */
/* if-nez v1, :cond_4 */
/* .line 34 */
v1 = this.l;
/* iget v2, v1, Le/b/a/x/d;->l:I */
/* .line 35 */
v3 = this.k;
if ( v3 != null) { // if-eqz v3, :cond_3
/* iget v1, v1, Le/b/a/x/d;->j:I */
/* iget v3, p1, Le/b/a/x/c;->h:I */
/* if-ne v1, v3, :cond_3 */
} // :cond_3
/* move v0, v2 */
/* .line 36 */
} // :cond_4
} // :goto_0
/* iget v1, p2, Le/b/a/x/c;->d:I */
/* iget v2, p0, Le/b/a/x/f;->p:I */
/* div-int/2addr v1, v2 */
/* .line 37 */
/* iget v3, p2, Le/b/a/x/c;->b:I */
/* div-int/2addr v3, v2 */
/* .line 38 */
/* iget v4, p2, Le/b/a/x/c;->c:I */
/* div-int/2addr v4, v2 */
/* .line 39 */
/* iget p2, p2, Le/b/a/x/c;->a:I */
/* div-int/2addr p2, v2 */
/* .line 40 */
/* iget v2, p0, Le/b/a/x/f;->r:I */
/* mul-int v3, v3, v2 */
/* add-int/2addr v3, p2 */
/* mul-int v1, v1, v2 */
/* add-int/2addr v1, v3 */
} // :goto_1
/* if-ge v3, v1, :cond_7 */
/* add-int p2, v3, v4 */
/* move v2, v3 */
} // :goto_2
/* if-ge v2, p2, :cond_5 */
/* .line 41 */
/* aput v0, v8, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 42 */
} // :cond_5
/* iget p2, p0, Le/b/a/x/f;->r:I */
/* add-int/2addr v3, p2 */
} // :cond_6
/* if-ne v2, v1, :cond_7 */
/* .line 43 */
v0 = this.m;
if ( v0 != null) { // if-eqz v0, :cond_7
int v2 = 0; // const/4 v2, 0x0
/* .line 44 */
/* iget v6, p0, Le/b/a/x/f;->r:I */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* iget v7, p0, Le/b/a/x/f;->q:I */
/* move-object v1, v8 */
/* move v3, v6 */
/* invoke-virtual/range {v0 ..v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
/* .line 45 */
} // :cond_7
(( e.b.a.x.f ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/x/f;->c(Le/b/a/x/c;)V
/* .line 46 */
/* iget-boolean p2, p1, Le/b/a/x/c;->e:Z */
int v0 = 1; // const/4 v0, 0x1
/* if-nez p2, :cond_9 */
/* iget p2, p0, Le/b/a/x/f;->p:I */
/* if-eq p2, v0, :cond_8 */
/* .line 47 */
} // :cond_8
(( e.b.a.x.f ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/x/f;->b(Le/b/a/x/c;)V
/* .line 48 */
} // :cond_9
} // :goto_3
(( e.b.a.x.f ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/x/f;->a(Le/b/a/x/c;)V
/* .line 49 */
} // :goto_4
/* iget-boolean p2, p0, Le/b/a/x/f;->n:Z */
if ( p2 != null) { // if-eqz p2, :cond_c
/* iget p1, p1, Le/b/a/x/c;->g:I */
if ( p1 != null) { // if-eqz p1, :cond_a
/* if-ne p1, v0, :cond_c */
/* .line 50 */
} // :cond_a
p1 = this.m;
/* if-nez p1, :cond_b */
/* .line 51 */
(( e.b.a.x.f ) p0 ).i ( ); // invoke-virtual {p0}, Le/b/a/x/f;->i()Landroid/graphics/Bitmap;
this.m = p1;
/* .line 52 */
} // :cond_b
v0 = this.m;
int v2 = 0; // const/4 v2, 0x0
/* iget v6, p0, Le/b/a/x/f;->r:I */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* iget v7, p0, Le/b/a/x/f;->q:I */
/* move-object v1, v8 */
/* move v3, v6 */
/* invoke-virtual/range {v0 ..v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V */
/* .line 53 */
} // :cond_c
(( e.b.a.x.f ) p0 ).i ( ); // invoke-virtual {p0}, Le/b/a/x/f;->i()Landroid/graphics/Bitmap;
int v2 = 0; // const/4 v2, 0x0
/* .line 54 */
/* iget v6, p0, Le/b/a/x/f;->r:I */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* iget v7, p0, Le/b/a/x/f;->q:I */
/* move-object v0, p1 */
/* move-object v1, v8 */
/* move v3, v6 */
/* invoke-virtual/range {v0 ..v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V */
} // .end method
public void a ( android.graphics.Bitmap$Config p0 ) {
/* .locals 3 */
/* .line 22 */
v0 = android.graphics.Bitmap$Config.ARGB_8888;
/* if-eq p1, v0, :cond_1 */
v0 = android.graphics.Bitmap$Config.RGB_565;
/* if-ne p1, v0, :cond_0 */
/* .line 23 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unsupported format: "; // const-string v2, "Unsupported format: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = ", must be one of "; // const-string p1, ", must be one of "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = android.graphics.Bitmap$Config.ARGB_8888;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " or "; // const-string p1, " or "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = android.graphics.Bitmap$Config.RGB_565;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 24 */
} // :cond_1
} // :goto_0
this.t = p1;
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 24 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* .line 55 */
v2 = this.j;
/* .line 56 */
/* iget v3, v1, Le/b/a/x/c;->d:I */
/* iget v4, v0, Le/b/a/x/f;->p:I */
/* div-int/2addr v3, v4 */
/* .line 57 */
/* iget v5, v1, Le/b/a/x/c;->b:I */
/* div-int/2addr v5, v4 */
/* .line 58 */
/* iget v6, v1, Le/b/a/x/c;->c:I */
/* div-int/2addr v6, v4 */
/* .line 59 */
/* iget v7, v1, Le/b/a/x/c;->a:I */
/* div-int/2addr v7, v4 */
/* .line 60 */
/* iget v4, v0, Le/b/a/x/f;->k:I */
int v9 = 1; // const/4 v9, 0x1
/* .line 61 */
java.lang.Boolean .valueOf ( v9 );
/* if-nez v4, :cond_0 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
/* .line 62 */
} // :goto_0
/* iget v11, v0, Le/b/a/x/f;->p:I */
/* .line 63 */
/* iget v12, v0, Le/b/a/x/f;->r:I */
/* .line 64 */
/* iget v13, v0, Le/b/a/x/f;->q:I */
/* .line 65 */
v14 = this.i;
/* .line 66 */
v15 = this.a;
/* .line 67 */
v8 = this.s;
/* const/16 v16, 0x8 */
/* move-object/from16 v18, v10 */
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
/* const/16 v19, 0x1 */
} // :goto_1
/* if-ge v9, v3, :cond_10 */
/* move-object/from16 v20, v8 */
/* .line 68 */
/* iget-boolean v8, v1, Le/b/a/x/c;->e:Z */
if ( v8 != null) { // if-eqz v8, :cond_5
int v8 = 2; // const/4 v8, 0x2
/* if-lt v10, v3, :cond_4 */
/* move/from16 v22, v3 */
/* add-int/lit8 v3, v19, 0x1 */
/* if-eq v3, v8, :cond_3 */
int v8 = 3; // const/4 v8, 0x3
/* if-eq v3, v8, :cond_2 */
int v8 = 4; // const/4 v8, 0x4
/* if-eq v3, v8, :cond_1 */
/* move/from16 v19, v3 */
} // :cond_1
/* move/from16 v19, v3 */
int v10 = 1; // const/4 v10, 0x1
/* const/16 v16, 0x2 */
} // :cond_2
int v8 = 4; // const/4 v8, 0x4
/* move/from16 v19, v3 */
int v10 = 2; // const/4 v10, 0x2
/* const/16 v16, 0x4 */
} // :cond_3
int v8 = 4; // const/4 v8, 0x4
/* move/from16 v19, v3 */
int v10 = 4; // const/4 v10, 0x4
} // :cond_4
/* move/from16 v22, v3 */
} // :goto_2
/* add-int v3, v10, v16 */
} // :cond_5
/* move/from16 v22, v3 */
/* move v3, v10 */
/* move v10, v9 */
} // :goto_3
/* add-int/2addr v10, v5 */
int v8 = 1; // const/4 v8, 0x1
/* if-ne v11, v8, :cond_6 */
/* const/16 v17, 0x1 */
} // :cond_6
/* const/16 v17, 0x0 */
} // :goto_4
/* if-ge v10, v13, :cond_d */
/* mul-int v10, v10, v12 */
/* add-int v21, v10, v7 */
/* add-int v8, v21, v6 */
/* add-int/2addr v10, v12 */
/* if-ge v10, v8, :cond_7 */
/* move v8, v10 */
} // :cond_7
/* mul-int v10, v9, v11 */
/* move/from16 v23, v3 */
/* .line 69 */
/* iget v3, v1, Le/b/a/x/c;->c:I */
/* mul-int v10, v10, v3 */
if ( v17 != null) { // if-eqz v17, :cond_a
/* move/from16 v3, v21 */
} // :goto_5
/* if-ge v3, v8, :cond_e */
/* move/from16 v17, v5 */
/* .line 70 */
/* aget-byte v5, v14, v10 */
/* and-int/lit16 v5, v5, 0xff */
/* .line 71 */
/* aget v5, v15, v5 */
if ( v5 != null) { // if-eqz v5, :cond_8
/* .line 72 */
/* aput v5, v2, v3 */
} // :cond_8
if ( v4 != null) { // if-eqz v4, :cond_9
/* if-nez v20, :cond_9 */
/* move-object/from16 v20, v18 */
} // :cond_9
} // :goto_6
/* add-int/2addr v10, v11 */
/* add-int/lit8 v3, v3, 0x1 */
/* move/from16 v5, v17 */
} // :cond_a
/* move/from16 v17, v5 */
/* sub-int v3, v8, v21 */
/* mul-int v3, v3, v11 */
/* add-int/2addr v3, v10 */
/* move/from16 v5, v21 */
} // :goto_7
/* move/from16 v21, v6 */
/* if-ge v5, v8, :cond_f */
/* .line 73 */
/* iget v6, v1, Le/b/a/x/c;->c:I */
v6 = (( e.b.a.x.f ) v0 ).a ( v10, v3, v6 ); // invoke-virtual {v0, v10, v3, v6}, Le/b/a/x/f;->a(III)I
if ( v6 != null) { // if-eqz v6, :cond_b
/* .line 74 */
/* aput v6, v2, v5 */
} // :cond_b
if ( v4 != null) { // if-eqz v4, :cond_c
/* if-nez v20, :cond_c */
/* move-object/from16 v20, v18 */
} // :cond_c
} // :goto_8
/* add-int/2addr v10, v11 */
/* add-int/lit8 v5, v5, 0x1 */
/* move/from16 v6, v21 */
} // :cond_d
/* move/from16 v23, v3 */
} // :cond_e
/* move/from16 v17, v5 */
/* move/from16 v21, v6 */
} // :cond_f
/* move-object/from16 v8, v20 */
/* add-int/lit8 v9, v9, 0x1 */
/* move/from16 v5, v17 */
/* move/from16 v6, v21 */
/* move/from16 v3, v22 */
/* move/from16 v10, v23 */
/* goto/16 :goto_1 */
} // :cond_10
/* move-object/from16 v20, v8 */
/* .line 75 */
v1 = this.s;
/* if-nez v1, :cond_12 */
/* if-nez v20, :cond_11 */
int v8 = 0; // const/4 v8, 0x0
/* .line 76 */
} // :cond_11
v8 = /* invoke-virtual/range {v20 ..v20}, Ljava/lang/Boolean;->booleanValue()Z */
/* .line 77 */
} // :goto_9
java.lang.Boolean .valueOf ( v8 );
this.s = v1;
} // :cond_12
return;
} // .end method
public synchronized void a ( Object p0, java.nio.ByteBuffer p1, Integer p2 ) {
/* .locals 2 */
/* monitor-enter p0 */
/* if-lez p3, :cond_2 */
/* .line 4 */
try { // :try_start_0
p3 = java.lang.Integer .highestOneBit ( p3 );
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput v0, p0, Le/b/a/x/f;->o:I */
/* .line 6 */
this.l = p1;
int v1 = -1; // const/4 v1, -0x1
/* .line 7 */
/* iput v1, p0, Le/b/a/x/f;->k:I */
/* .line 8 */
(( java.nio.ByteBuffer ) p2 ).asReadOnlyBuffer ( ); // invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;
this.d = p2;
/* .line 9 */
(( java.nio.ByteBuffer ) p2 ).position ( v0 ); // invoke-virtual {p2, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
/* .line 10 */
p2 = this.d;
v1 = java.nio.ByteOrder.LITTLE_ENDIAN;
(( java.nio.ByteBuffer ) p2 ).order ( v1 ); // invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
/* .line 11 */
/* iput-boolean v0, p0, Le/b/a/x/f;->n:Z */
/* .line 12 */
p2 = this.e;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Le/b/a/x/c; */
/* .line 13 */
/* iget v0, v0, Le/b/a/x/c;->g:I */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_0 */
int p2 = 1; // const/4 p2, 0x1
/* .line 14 */
/* iput-boolean p2, p0, Le/b/a/x/f;->n:Z */
/* .line 15 */
} // :cond_1
/* iput p3, p0, Le/b/a/x/f;->p:I */
/* .line 16 */
/* iget p2, p1, Le/b/a/x/d;->f:I */
/* div-int/2addr p2, p3 */
/* iput p2, p0, Le/b/a/x/f;->r:I */
/* .line 17 */
/* iget p2, p1, Le/b/a/x/d;->g:I */
/* div-int/2addr p2, p3 */
/* iput p2, p0, Le/b/a/x/f;->q:I */
/* .line 18 */
p2 = this.c;
/* iget p3, p1, Le/b/a/x/d;->f:I */
/* iget p1, p1, Le/b/a/x/d;->g:I */
/* mul-int p3, p3, p1 */
this.i = p1;
/* .line 19 */
p1 = this.c;
/* iget p2, p0, Le/b/a/x/f;->r:I */
/* iget p3, p0, Le/b/a/x/f;->q:I */
/* mul-int p2, p2, p3 */
this.j = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 20 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 21 */
} // :cond_2
try { // :try_start_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Sample size must be >=0, not: "; // const-string v0, "Sample size must be >=0, not: "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public Integer b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.d;
v0 = (( java.nio.ByteBuffer ) v0 ).limit ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I
v1 = this.i;
/* array-length v1, v1 */
/* add-int/2addr v0, v1 */
v1 = this.j;
/* array-length v1, v1 */
/* mul-int/lit8 v1, v1, 0x4 */
/* add-int/2addr v0, v1 */
} // .end method
public final void b ( Object p0 ) {
/* .locals 18 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
/* .line 2 */
v2 = this.j;
/* .line 3 */
/* iget v3, v1, Le/b/a/x/c;->d:I */
/* .line 4 */
/* iget v4, v1, Le/b/a/x/c;->b:I */
/* .line 5 */
/* iget v5, v1, Le/b/a/x/c;->c:I */
/* .line 6 */
/* iget v6, v1, Le/b/a/x/c;->a:I */
/* .line 7 */
/* iget v7, v0, Le/b/a/x/f;->k:I */
/* if-nez v7, :cond_0 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
/* .line 8 */
} // :goto_0
/* iget v10, v0, Le/b/a/x/f;->r:I */
/* .line 9 */
v11 = this.i;
/* .line 10 */
v12 = this.a;
int v14 = 0; // const/4 v14, 0x0
int v15 = -1; // const/4 v15, -0x1
} // :goto_1
/* if-ge v14, v3, :cond_5 */
/* add-int v16, v14, v4 */
/* mul-int v16, v16, v10 */
/* add-int v17, v16, v6 */
/* add-int v8, v17, v5 */
/* add-int v9, v16, v10 */
/* if-ge v9, v8, :cond_1 */
/* move v8, v9 */
/* .line 11 */
} // :cond_1
/* iget v9, v1, Le/b/a/x/c;->c:I */
/* mul-int v9, v9, v14 */
/* move/from16 v13, v17 */
} // :goto_2
/* if-ge v13, v8, :cond_4 */
/* .line 12 */
/* aget-byte v1, v11, v9 */
/* move/from16 v17, v3 */
/* and-int/lit16 v3, v1, 0xff */
/* if-eq v3, v15, :cond_3 */
/* .line 13 */
/* aget v3, v12, v3 */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 14 */
/* aput v3, v2, v13 */
} // :cond_2
/* move v15, v1 */
} // :cond_3
} // :goto_3
/* add-int/lit8 v9, v9, 0x1 */
/* add-int/lit8 v13, v13, 0x1 */
/* move-object/from16 v1, p1 */
/* move/from16 v3, v17 */
} // :cond_4
/* move/from16 v17, v3 */
/* add-int/lit8 v14, v14, 0x1 */
/* move-object/from16 v1, p1 */
/* .line 15 */
} // :cond_5
v1 = this.s;
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 16 */
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v1, :cond_7 */
} // :cond_6
v1 = this.s;
/* if-nez v1, :cond_8 */
if ( v7 != null) { // if-eqz v7, :cond_8
int v1 = -1; // const/4 v1, -0x1
/* if-eq v15, v1, :cond_8 */
} // :cond_7
int v8 = 1; // const/4 v8, 0x1
} // :cond_8
int v8 = 0; // const/4 v8, 0x0
} // :goto_4
java.lang.Boolean .valueOf ( v8 );
this.s = v1;
return;
} // .end method
public synchronized android.graphics.Bitmap c ( ) {
/* .locals 8 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.l;
/* iget v0, v0, Le/b/a/x/d;->c:I */
int v1 = 3; // const/4 v1, 0x3
int v2 = 1; // const/4 v2, 0x1
/* if-lez v0, :cond_0 */
/* iget v0, p0, Le/b/a/x/f;->k:I */
/* if-gez v0, :cond_2 */
/* .line 2 */
} // :cond_0
v0 = e.b.a.x.f.u;
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v0 = e.b.a.x.f.u;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unable to decode frame, frameCount="; // const-string v4, "Unable to decode frame, frameCount="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.l;
/* iget v4, v4, Le/b/a/x/d;->c:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ", framePointer="; // const-string v4, ", framePointer="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v4, p0, Le/b/a/x/f;->k:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v3 );
/* .line 4 */
} // :cond_1
/* iput v2, p0, Le/b/a/x/f;->o:I */
/* .line 5 */
} // :cond_2
/* iget v0, p0, Le/b/a/x/f;->o:I */
int v3 = 0; // const/4 v3, 0x0
/* if-eq v0, v2, :cond_a */
/* iget v0, p0, Le/b/a/x/f;->o:I */
int v4 = 2; // const/4 v4, 0x2
/* if-ne v0, v4, :cond_3 */
/* goto/16 :goto_2 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* iput v0, p0, Le/b/a/x/f;->o:I */
/* .line 7 */
v5 = this.e;
/* if-nez v5, :cond_4 */
/* .line 8 */
v5 = this.c;
/* const/16 v6, 0xff */
this.e = v5;
/* .line 9 */
} // :cond_4
v5 = this.l;
v5 = this.e;
/* iget v6, p0, Le/b/a/x/f;->k:I */
/* check-cast v5, Le/b/a/x/c; */
/* .line 10 */
/* iget v6, p0, Le/b/a/x/f;->k:I */
/* sub-int/2addr v6, v2 */
/* if-ltz v6, :cond_5 */
/* .line 11 */
v7 = this.l;
v7 = this.e;
/* check-cast v6, Le/b/a/x/c; */
} // :cond_5
/* move-object v6, v3 */
/* .line 12 */
} // :goto_0
v7 = this.k;
if ( v7 != null) { // if-eqz v7, :cond_6
v7 = this.k;
} // :cond_6
v7 = this.l;
v7 = this.a;
} // :goto_1
this.a = v7;
/* if-nez v7, :cond_8 */
/* .line 13 */
v0 = e.b.a.x.f.u;
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 14 */
v0 = e.b.a.x.f.u;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "No valid color table found for frame #"; // const-string v4, "No valid color table found for frame #"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v4, p0, Le/b/a/x/f;->k:I */
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 15 */
} // :cond_7
/* iput v2, p0, Le/b/a/x/f;->o:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 16 */
/* monitor-exit p0 */
/* .line 17 */
} // :cond_8
try { // :try_start_1
/* iget-boolean v1, v5, Le/b/a/x/c;->f:Z */
if ( v1 != null) { // if-eqz v1, :cond_9
/* .line 18 */
v1 = this.b;
/* array-length v3, v7 */
java.lang.System .arraycopy ( v7,v0,v1,v0,v3 );
/* .line 19 */
v1 = this.b;
this.a = v1;
/* .line 20 */
/* iget v3, v5, Le/b/a/x/c;->h:I */
/* aput v0, v1, v3 */
/* .line 21 */
/* iget v0, v5, Le/b/a/x/c;->g:I */
/* if-ne v0, v4, :cond_9 */
/* iget v0, p0, Le/b/a/x/f;->k:I */
/* if-nez v0, :cond_9 */
/* .line 22 */
java.lang.Boolean .valueOf ( v2 );
this.s = v0;
/* .line 23 */
} // :cond_9
(( e.b.a.x.f ) p0 ).a ( v5, v6 ); // invoke-virtual {p0, v5, v6}, Le/b/a/x/f;->a(Le/b/a/x/c;Le/b/a/x/c;)Landroid/graphics/Bitmap;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
/* .line 24 */
} // :cond_a
} // :goto_2
try { // :try_start_2
v0 = e.b.a.x.f.u;
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 25 */
v0 = e.b.a.x.f.u;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unable to decode frame, status="; // const-string v2, "Unable to decode frame, status="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Le/b/a/x/f;->o:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 26 */
} // :cond_b
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final void c ( Object p0 ) {
/* .locals 28 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, p1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 27 */
v2 = this.d;
/* iget v3, v1, Le/b/a/x/c;->j:I */
(( java.nio.ByteBuffer ) v2 ).position ( v3 ); // invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
} // :cond_0
/* if-nez v1, :cond_1 */
/* .line 28 */
v1 = this.l;
/* iget v2, v1, Le/b/a/x/d;->f:I */
/* iget v1, v1, Le/b/a/x/d;->g:I */
} // :cond_1
/* iget v2, v1, Le/b/a/x/c;->c:I */
/* iget v1, v1, Le/b/a/x/c;->d:I */
} // :goto_0
/* mul-int v2, v2, v1 */
/* .line 29 */
v1 = this.i;
if ( v1 != null) { // if-eqz v1, :cond_2
/* array-length v1, v1 */
/* if-ge v1, v2, :cond_3 */
/* .line 30 */
} // :cond_2
v1 = this.c;
this.i = v1;
/* .line 31 */
} // :cond_3
v1 = this.i;
/* .line 32 */
v3 = this.f;
/* const/16 v4, 0x1000 */
/* if-nez v3, :cond_4 */
/* new-array v3, v4, [S */
/* .line 33 */
this.f = v3;
/* .line 34 */
} // :cond_4
v3 = this.f;
/* .line 35 */
v5 = this.g;
/* if-nez v5, :cond_5 */
/* new-array v5, v4, [B */
/* .line 36 */
this.g = v5;
/* .line 37 */
} // :cond_5
v5 = this.g;
/* .line 38 */
v6 = this.h;
/* if-nez v6, :cond_6 */
/* const/16 v6, 0x1001 */
/* new-array v6, v6, [B */
/* .line 39 */
this.h = v6;
/* .line 40 */
} // :cond_6
v6 = this.h;
/* .line 41 */
v7 = /* invoke-virtual/range {p0 ..p0}, Le/b/a/x/f;->k()I */
int v8 = 1; // const/4 v8, 0x1
/* shl-int v9, v8, v7 */
/* add-int/lit8 v10, v9, 0x1 */
/* add-int/lit8 v11, v9, 0x2 */
/* add-int/2addr v7, v8 */
/* shl-int v12, v8, v7 */
/* sub-int/2addr v12, v8 */
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
} // :goto_1
/* if-ge v14, v9, :cond_7 */
/* .line 42 */
/* aput-short v13, v3, v14 */
/* int-to-byte v15, v14 */
/* .line 43 */
/* aput-byte v15, v5, v14 */
/* add-int/lit8 v14, v14, 0x1 */
/* .line 44 */
} // :cond_7
v14 = this.e;
int v15 = -1; // const/4 v15, -0x1
/* move/from16 v23, v7 */
/* move/from16 v21, v11 */
/* move/from16 v22, v12 */
/* const/16 v16, 0x0 */
/* const/16 v17, 0x0 */
/* const/16 v18, 0x0 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x0 */
/* const/16 v24, -0x1 */
/* const/16 v25, 0x0 */
/* const/16 v26, 0x0 */
} // :goto_2
/* if-ge v13, v2, :cond_12 */
/* if-nez v16, :cond_9 */
/* .line 45 */
v16 = /* invoke-virtual/range {p0 ..p0}, Le/b/a/x/f;->j()I */
/* if-gtz v16, :cond_8 */
int v3 = 3; // const/4 v3, 0x3
/* .line 46 */
/* iput v3, v0, Le/b/a/x/f;->o:I */
/* goto/16 :goto_6 */
} // :cond_8
/* const/16 v17, 0x0 */
/* .line 47 */
} // :cond_9
/* aget-byte v4, v14, v17 */
/* and-int/lit16 v4, v4, 0xff */
/* shl-int v4, v4, v18 */
/* add-int v19, v19, v4 */
/* add-int/lit8 v18, v18, 0x8 */
/* add-int/lit8 v17, v17, 0x1 */
/* add-int/lit8 v16, v16, -0x1 */
/* move/from16 v4, v18 */
/* move/from16 v8, v21 */
/* move/from16 v15, v23 */
/* move/from16 v0, v24 */
/* move/from16 v23, v7 */
/* move/from16 v7, v25 */
} // :goto_3
/* if-lt v4, v15, :cond_11 */
/* move/from16 v24, v11 */
/* and-int v11, v19, v22 */
/* shr-int v19, v19, v15 */
/* sub-int/2addr v4, v15 */
/* if-ne v11, v9, :cond_a */
/* move/from16 v22, v12 */
/* move/from16 v15, v23 */
/* move/from16 v8, v24 */
/* move v11, v8 */
int v0 = -1; // const/4 v0, -0x1
} // :cond_a
/* if-ne v11, v10, :cond_b */
/* move/from16 v18, v4 */
/* move/from16 v25, v7 */
/* move/from16 v21, v8 */
/* move/from16 v7, v23 */
/* move/from16 v11, v24 */
/* const/16 v4, 0x1000 */
int v8 = 1; // const/4 v8, 0x1
/* move/from16 v24, v0 */
/* move/from16 v23, v15 */
int v15 = -1; // const/4 v15, -0x1
/* move-object/from16 v0, p0 */
} // :cond_b
/* move/from16 v25, v4 */
int v4 = -1; // const/4 v4, -0x1
/* if-ne v0, v4, :cond_c */
/* .line 48 */
/* aget-byte v0, v5, v11 */
/* aput-byte v0, v1, v20 */
/* add-int/lit8 v20, v20, 0x1 */
/* add-int/lit8 v13, v13, 0x1 */
/* move v0, v11 */
/* move v7, v0 */
/* move/from16 v11, v24 */
/* move/from16 v4, v25 */
} // :cond_c
/* if-lt v11, v8, :cond_d */
/* int-to-byte v7, v7 */
/* .line 49 */
/* aput-byte v7, v6, v26 */
/* add-int/lit8 v26, v26, 0x1 */
/* move v7, v0 */
} // :cond_d
/* move v7, v11 */
} // :goto_4
/* if-lt v7, v9, :cond_e */
/* .line 50 */
/* aget-byte v21, v5, v7 */
/* aput-byte v21, v6, v26 */
/* add-int/lit8 v26, v26, 0x1 */
/* .line 51 */
/* aget-short v7, v3, v7 */
/* .line 52 */
} // :cond_e
/* aget-byte v7, v5, v7 */
/* and-int/lit16 v7, v7, 0xff */
/* int-to-byte v4, v7 */
/* .line 53 */
/* aput-byte v4, v1, v20 */
} // :goto_5
/* add-int/lit8 v20, v20, 0x1 */
/* add-int/lit8 v13, v13, 0x1 */
/* if-lez v26, :cond_f */
/* add-int/lit8 v26, v26, -0x1 */
/* .line 54 */
/* aget-byte v27, v6, v26 */
/* aput-byte v27, v1, v20 */
} // :cond_f
/* move-object/from16 v27, v6 */
/* const/16 v6, 0x1000 */
/* if-ge v8, v6, :cond_10 */
/* int-to-short v0, v0 */
/* .line 55 */
/* aput-short v0, v3, v8 */
/* .line 56 */
/* aput-byte v4, v5, v8 */
/* add-int/lit8 v8, v8, 0x1 */
/* and-int v0, v8, v22 */
/* if-nez v0, :cond_10 */
/* if-ge v8, v6, :cond_10 */
/* add-int/lit8 v15, v15, 0x1 */
/* add-int v22, v22, v8 */
} // :cond_10
/* move v0, v11 */
/* move/from16 v11, v24 */
/* move/from16 v4, v25 */
/* move-object/from16 v6, v27 */
/* goto/16 :goto_3 */
} // :cond_11
/* move/from16 v25, v4 */
/* move-object/from16 v27, v6 */
/* move/from16 v24, v0 */
/* move/from16 v21, v8 */
/* move/from16 v18, v25 */
/* const/16 v4, 0x1000 */
int v8 = 1; // const/4 v8, 0x1
/* move-object/from16 v0, p0 */
/* move/from16 v25, v7 */
/* move/from16 v7, v23 */
/* move/from16 v23, v15 */
int v15 = -1; // const/4 v15, -0x1
/* goto/16 :goto_2 */
} // :cond_12
} // :goto_6
/* move/from16 v13, v20 */
int v0 = 0; // const/4 v0, 0x0
/* .line 57 */
java.util.Arrays .fill ( v1,v13,v2,v0 );
return;
} // .end method
public void clear ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.l = v0;
/* .line 2 */
v1 = this.i;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
v2 = this.c;
/* .line 4 */
} // :cond_0
v1 = this.j;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 5 */
v2 = this.c;
/* .line 6 */
} // :cond_1
v1 = this.m;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 7 */
v2 = this.c;
/* .line 8 */
} // :cond_2
this.m = v0;
/* .line 9 */
this.d = v0;
/* .line 10 */
this.s = v0;
/* .line 11 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 12 */
v1 = this.c;
} // :cond_3
return;
} // .end method
public void d ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/b/a/x/f;->k:I */
/* add-int/lit8 v0, v0, 0x1 */
v1 = this.l;
/* iget v1, v1, Le/b/a/x/d;->c:I */
/* rem-int/2addr v0, v1 */
/* iput v0, p0, Le/b/a/x/f;->k:I */
return;
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
/* iget v0, v0, Le/b/a/x/d;->c:I */
} // .end method
public Integer f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
/* iget v0, v0, Le/b/a/x/d;->c:I */
/* if-lez v0, :cond_1 */
/* iget v0, p0, Le/b/a/x/f;->k:I */
/* if-gez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = (( e.b.a.x.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/x/f;->a(I)I
} // :cond_1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.nio.ByteBuffer g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public void h ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
/* iput v0, p0, Le/b/a/x/f;->k:I */
return;
} // .end method
public final android.graphics.Bitmap i ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.s;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.t;
} // :cond_1
} // :goto_0
v0 = android.graphics.Bitmap$Config.ARGB_8888;
/* .line 3 */
} // :goto_1
v1 = this.c;
/* iget v2, p0, Le/b/a/x/f;->r:I */
/* iget v3, p0, Le/b/a/x/f;->q:I */
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( android.graphics.Bitmap ) v0 ).setHasAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V
} // .end method
public final Integer j ( ) {
/* .locals 5 */
/* .line 1 */
v0 = (( e.b.a.x.f ) p0 ).k ( ); // invoke-virtual {p0}, Le/b/a/x/f;->k()I
/* if-gtz v0, :cond_0 */
/* .line 2 */
} // :cond_0
v1 = this.d;
v2 = this.e;
int v3 = 0; // const/4 v3, 0x0
v4 = (( java.nio.ByteBuffer ) v1 ).remaining ( ); // invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I
v4 = java.lang.Math .min ( v0,v4 );
(( java.nio.ByteBuffer ) v1 ).get ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
} // .end method
public final Integer k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
v0 = (( java.nio.ByteBuffer ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
/* and-int/lit16 v0, v0, 0xff */
} // .end method
