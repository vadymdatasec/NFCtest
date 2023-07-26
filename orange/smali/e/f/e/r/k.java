public abstract class e.f.e.r.k implements e.f.e.i {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.e.r.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Float a ( Integer[] p0, Integer[] p1, Float p2 ) {
		 /* .locals 9 */
		 /* .line 25 */
		 /* array-length v0, p0 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
	 } // :goto_0
	 /* if-ge v2, v0, :cond_0 */
	 /* .line 26 */
	 /* aget v5, p0, v2 */
	 /* add-int/2addr v3, v5 */
	 /* .line 27 */
	 /* aget v5, p1, v2 */
	 /* add-int/2addr v4, v5 */
	 /* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
/* const/high16 v2, 0x7f800000 # Float.POSITIVE_INFINITY */
/* if-ge v3, v4, :cond_1 */
} // :cond_1
/* int-to-float v3, v3 */
/* int-to-float v4, v4 */
/* div-float v4, v3, v4 */
/* mul-float p2, p2, v4 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* if-ge v1, v0, :cond_4 */
/* .line 28 */
/* aget v6, p0, v1 */
/* .line 29 */
/* aget v7, p1, v1 */
/* int-to-float v7, v7 */
/* mul-float v7, v7, v4 */
/* int-to-float v6, v6 */
/* cmpl-float v8, v6, v7 */
/* if-lez v8, :cond_2 */
/* sub-float/2addr v6, v7 */
} // :cond_2
/* sub-float v6, v7, v6 */
} // :goto_2
/* cmpl-float v7, v6, p2 */
/* if-lez v7, :cond_3 */
} // :cond_3
/* add-float/2addr v5, v6 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_4
/* div-float/2addr v5, v3 */
} // .end method
public static void a ( Object p0, Integer p1, Integer[] p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* .line 16 */
/* array-length v0, p2 */
int v1 = 0; // const/4 v1, 0x0
/* .line 17 */
java.util.Arrays .fill ( p2,v1,v0,v1 );
/* .line 18 */
v2 = (( e.f.e.o.a ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/e/o/a;->d()I
/* if-ge p1, v2, :cond_4 */
/* .line 19 */
v3 = (( e.f.e.o.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/o/a;->a(I)Z
int v4 = 1; // const/4 v4, 0x1
/* xor-int/2addr v3, v4 */
} // :goto_0
/* if-ge p1, v2, :cond_1 */
/* .line 20 */
v5 = (( e.f.e.o.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/o/a;->a(I)Z
/* xor-int/2addr v5, v3 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 21 */
/* aget v5, p2, v1 */
/* add-int/2addr v5, v4 */
/* aput v5, p2, v1 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* if-eq v1, v0, :cond_1 */
/* .line 22 */
/* aput v4, p2, v1 */
/* xor-int/lit8 v3, v3, 0x1 */
} // :goto_1
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_1
/* if-eq v1, v0, :cond_3 */
/* sub-int/2addr v0, v4 */
/* if-ne v1, v0, :cond_2 */
/* if-ne p1, v2, :cond_2 */
/* .line 23 */
} // :cond_2
com.google.zxing.NotFoundException .a ( );
/* throw p0 */
} // :cond_3
} // :goto_2
return;
/* .line 24 */
} // :cond_4
com.google.zxing.NotFoundException .a ( );
/* throw p0 */
} // .end method
public static void b ( Object p0, Integer p1, Integer[] p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* .line 19 */
/* array-length v0, p2 */
/* .line 20 */
v1 = (( e.f.e.o.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/o/a;->a(I)Z
} // :cond_0
} // :goto_0
/* if-lez p1, :cond_1 */
/* if-ltz v0, :cond_1 */
/* add-int/lit8 p1, p1, -0x1 */
/* .line 21 */
v2 = (( e.f.e.o.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/o/a;->a(I)Z
/* if-eq v2, v1, :cond_0 */
/* add-int/lit8 v0, v0, -0x1 */
/* xor-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* if-gez v0, :cond_2 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 22 */
e.f.e.r.k .a ( p0,p1,p2 );
return;
/* .line 23 */
} // :cond_2
com.google.zxing.NotFoundException .a ( );
/* throw p0 */
} // .end method
/* # virtual methods */
public abstract e.f.e.j a ( Integer p0, Object p1, java.util.Map p2 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Le/f/e/o/a;", */
/* "Ljava/util/Map<", */
/* "Le/f/e/d;", */
/* "*>;)", */
/* "Le/f/e/j;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException;, */
/* Lcom/google/zxing/ChecksumException;, */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
} // .end method
public e.f.e.j a ( Object p0, java.util.Map p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/e/c;", */
/* "Ljava/util/Map<", */
/* "Le/f/e/d;", */
/* "*>;)", */
/* "Le/f/e/j;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException;, */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
(( e.f.e.r.k ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/e/r/k;->b(Le/f/e/c;Ljava/util/Map;)Le/f/e/j;
/* :try_end_0 */
/* .catch Lcom/google/zxing/NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
int v1 = 0; // const/4 v1, 0x0
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 2 */
v2 = v2 = e.f.e.d.e;
if ( v2 != null) { // if-eqz v2, :cond_0
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 3 */
v2 = (( e.f.e.c ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/e/c;->d()Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 4 */
(( e.f.e.c ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/e/c;->e()Le/f/e/c;
/* .line 5 */
(( e.f.e.r.k ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/e/r/k;->b(Le/f/e/c;Ljava/util/Map;)Le/f/e/j;
/* .line 6 */
(( e.f.e.j ) p2 ).c ( ); // invoke-virtual {p2}, Le/f/e/j;->c()Ljava/util/Map;
/* const/16 v2, 0x10e */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
v3 = v3 = e.f.e.k.c;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 8 */
v3 = e.f.e.k.c;
/* .line 9 */
/* check-cast v0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* add-int/2addr v0, v2 */
/* rem-int/lit16 v2, v0, 0x168 */
/* .line 10 */
} // :cond_1
v0 = e.f.e.k.c;
java.lang.Integer .valueOf ( v2 );
(( e.f.e.j ) p2 ).a ( v0, v2 ); // invoke-virtual {p2, v0, v2}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V
/* .line 11 */
(( e.f.e.j ) p2 ).d ( ); // invoke-virtual {p2}, Le/f/e/j;->d()[Le/f/e/l;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 12 */
p1 = (( e.f.e.c ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/e/c;->b()I
/* .line 13 */
} // :goto_1
/* array-length v2, v0 */
/* if-ge v1, v2, :cond_2 */
/* .line 14 */
/* new-instance v2, Le/f/e/l; */
/* int-to-float v3, p1 */
/* aget-object v4, v0, v1 */
v4 = (( e.f.e.l ) v4 ).b ( ); // invoke-virtual {v4}, Le/f/e/l;->b()F
/* sub-float/2addr v3, v4 */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* sub-float/2addr v3, v4 */
/* aget-object v4, v0, v1 */
v4 = (( e.f.e.l ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/e/l;->a()F
/* invoke-direct {v2, v3, v4}, Le/f/e/l;-><init>(FF)V */
/* aput-object v2, v0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
/* .line 15 */
} // :cond_3
/* throw v0 */
} // .end method
public void a ( ) {
/* .locals 0 */
return;
} // .end method
public final e.f.e.j b ( Object p0, java.util.Map p1 ) {
/* .locals 21 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/e/c;", */
/* "Ljava/util/Map<", */
/* "Le/f/e/d;", */
/* "*>;)", */
/* "Le/f/e/j;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* move-object/from16 v0, p2 */
/* .line 1 */
v1 = /* invoke-virtual/range {p1 ..p1}, Le/f/e/c;->c()I */
/* .line 2 */
v2 = /* invoke-virtual/range {p1 ..p1}, Le/f/e/c;->b()I */
/* .line 3 */
/* new-instance v3, Le/f/e/o/a; */
/* invoke-direct {v3, v1}, Le/f/e/o/a;-><init>(I)V */
/* shr-int/lit8 v4, v2, 0x1 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v7 = v7 = e.f.e.d.e;
if ( v7 != null) { // if-eqz v7, :cond_0
int v7 = 1; // const/4 v7, 0x1
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
} // :goto_0
if ( v7 != null) { // if-eqz v7, :cond_1
/* const/16 v8, 0x8 */
} // :cond_1
int v8 = 5; // const/4 v8, 0x5
} // :goto_1
/* shr-int v8, v2, v8 */
/* .line 5 */
v8 = java.lang.Math .max ( v6,v8 );
if ( v7 != null) { // if-eqz v7, :cond_2
/* move v7, v2 */
} // :cond_2
/* const/16 v7, 0xf */
} // :goto_2
int v9 = 0; // const/4 v9, 0x0
} // :goto_3
/* if-ge v9, v7, :cond_8 */
/* add-int/lit8 v10, v9, 0x1 */
/* .line 6 */
/* div-int/lit8 v11, v10, 0x2 */
/* and-int/lit8 v9, v9, 0x1 */
/* if-nez v9, :cond_3 */
int v9 = 1; // const/4 v9, 0x1
} // :cond_3
int v9 = 0; // const/4 v9, 0x0
} // :goto_4
if ( v9 != null) { // if-eqz v9, :cond_4
} // :cond_4
/* neg-int v11, v11 */
} // :goto_5
/* mul-int v11, v11, v8 */
/* add-int/2addr v11, v4 */
/* if-ltz v11, :cond_8 */
/* if-ge v11, v2, :cond_8 */
/* move-object/from16 v9, p1 */
/* .line 7 */
try { // :try_start_0
(( e.f.e.c ) v9 ).a ( v11, v3 ); // invoke-virtual {v9, v11, v3}, Le/f/e/c;->a(ILe/f/e/o/a;)Le/f/e/o/a;
/* :try_end_0 */
/* .catch Lcom/google/zxing/NotFoundException; {:try_start_0 ..:try_end_0} :catch_4 */
int v12 = 0; // const/4 v12, 0x0
} // :goto_6
int v13 = 2; // const/4 v13, 0x2
/* if-ge v12, v13, :cond_7 */
/* if-ne v12, v6, :cond_5 */
/* .line 8 */
(( e.f.e.o.a ) v3 ).e ( ); // invoke-virtual {v3}, Le/f/e/o/a;->e()V
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 9 */
v13 = v13 = e.f.e.d.k;
if ( v13 != null) { // if-eqz v13, :cond_5
/* .line 10 */
/* new-instance v13, Ljava/util/EnumMap; */
/* const-class v14, Le/f/e/d; */
/* invoke-direct {v13, v14}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V */
/* .line 11 */
/* .line 12 */
v0 = e.f.e.d.k;
/* move-object v0, v13 */
} // :cond_5
/* move-object/from16 v13, p0 */
/* .line 13 */
try { // :try_start_1
(( e.f.e.r.k ) v13 ).a ( v11, v3, v0 ); // invoke-virtual {v13, v11, v3, v0}, Le/f/e/r/k;->a(ILe/f/e/o/a;Ljava/util/Map;)Le/f/e/j;
/* if-ne v12, v6, :cond_6 */
/* .line 14 */
v15 = e.f.e.k.c;
/* const/16 v16, 0xb4 */
/* invoke-static/range {v16 ..v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer; */
(( e.f.e.j ) v14 ).a ( v15, v6 ); // invoke-virtual {v14, v15, v6}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V
/* .line 15 */
(( e.f.e.j ) v14 ).d ( ); // invoke-virtual {v14}, Le/f/e/j;->d()[Le/f/e/l;
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 16 */
/* new-instance v15, Le/f/e/l; */
/* :try_end_1 */
/* .catch Lcom/google/zxing/ReaderException; {:try_start_1 ..:try_end_1} :catch_0 */
/* move-object/from16 v16, v0 */
/* int-to-float v0, v1 */
try { // :try_start_2
/* aget-object v18, v6, v5 */
v18 = /* invoke-virtual/range {v18 ..v18}, Le/f/e/l;->a()F */
/* :try_end_2 */
/* .catch Lcom/google/zxing/ReaderException; {:try_start_2 ..:try_end_2} :catch_1 */
/* sub-float v18, v0, v18 */
/* const/high16 v19, 0x3f800000 # 1.0f */
/* move/from16 v20, v1 */
/* sub-float v1, v18, v19 */
try { // :try_start_3
/* aget-object v18, v6, v5 */
v5 = /* invoke-virtual/range {v18 ..v18}, Le/f/e/l;->b()F */
/* invoke-direct {v15, v1, v5}, Le/f/e/l;-><init>(FF)V */
int v1 = 0; // const/4 v1, 0x0
/* aput-object v15, v6, v1 */
/* .line 17 */
/* new-instance v5, Le/f/e/l; */
/* :try_end_3 */
/* .catch Lcom/google/zxing/ReaderException; {:try_start_3 ..:try_end_3} :catch_2 */
int v15 = 1; // const/4 v15, 0x1
try { // :try_start_4
/* aget-object v17, v6, v15 */
v17 = /* invoke-virtual/range {v17 ..v17}, Le/f/e/l;->a()F */
/* sub-float v0, v0, v17 */
/* sub-float v0, v0, v19 */
/* aget-object v17, v6, v15 */
v1 = /* invoke-virtual/range {v17 ..v17}, Le/f/e/l;->b()F */
/* invoke-direct {v5, v0, v1}, Le/f/e/l;-><init>(FF)V */
/* aput-object v5, v6, v15 */
/* :try_end_4 */
/* .catch Lcom/google/zxing/ReaderException; {:try_start_4 ..:try_end_4} :catch_3 */
} // :cond_6
/* :catch_0 */
/* move-object/from16 v16, v0 */
/* :catch_1 */
/* move/from16 v20, v1 */
/* :catch_2 */
int v15 = 1; // const/4 v15, 0x1
/* :catch_3 */
/* add-int/lit8 v12, v12, 0x1 */
/* move-object/from16 v0, v16 */
/* move/from16 v1, v20 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* goto/16 :goto_6 */
/* :catch_4 */
} // :cond_7
int v15 = 1; // const/4 v15, 0x1
/* move-object/from16 v13, p0 */
/* move/from16 v20, v1 */
/* move v9, v10 */
/* move/from16 v1, v20 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* goto/16 :goto_3 */
} // :cond_8
/* move-object/from16 v13, p0 */
/* .line 18 */
com.google.zxing.NotFoundException .a ( );
/* throw v0 */
} // .end method
