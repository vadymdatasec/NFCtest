public class inal extends e.f.e.o.h {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public e.f.e.o.b e;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Le/f/e/o/h;-><init>(Le/f/e/f;)V */
		 return;
	 } // .end method
	 public static Integer a ( Integer p0, Integer p1, Integer p2 ) {
		 /* .locals 0 */
		 /* if-ge p0, p1, :cond_0 */
	 } // :cond_0
	 /* if-le p0, p2, :cond_1 */
} // :cond_1
} // .end method
public static void a ( Object[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Object p5 ) {
/* .locals 7 */
/* mul-int v0, p2, p4 */
/* add-int/2addr v0, p1 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* const/16 v3, 0x8 */
/* if-ge v2, v3, :cond_2 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
/* if-ge v4, v3, :cond_1 */
/* add-int v5, v0, v4 */
/* .line 19 */
/* aget-byte v5, p0, v5 */
/* and-int/lit16 v5, v5, 0xff */
/* if-gt v5, p3, :cond_0 */
/* add-int v5, p1, v4 */
/* add-int v6, p2, v2 */
/* .line 20 */
(( e.f.e.o.b ) p5 ).c ( v5, v6 ); // invoke-virtual {p5, v5, v6}, Le/f/e/o/b;->c(II)V
} // :cond_0
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
/* add-int/2addr v0, p4 */
} // :cond_2
return;
} // .end method
public static void a ( Object[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer[] p5, Object p6 ) {
/* .locals 15 */
/* move/from16 v0, p1 */
/* move/from16 v1, p2 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_4 */
/* shl-int/lit8 v4, v3, 0x3 */
/* add-int/lit8 v5, p4, -0x8 */
/* if-le v4, v5, :cond_0 */
/* move v4, v5 */
} // :cond_0
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* if-ge v5, v0, :cond_3 */
/* shl-int/lit8 v6, v5, 0x3 */
/* add-int/lit8 v7, p3, -0x8 */
/* if-le v6, v7, :cond_1 */
} // :cond_1
/* move v7, v6 */
} // :goto_2
/* add-int/lit8 v6, v0, -0x3 */
int v8 = 2; // const/4 v8, 0x2
/* .line 13 */
v6 = e.f.e.o.j .a ( v5,v8,v6 );
/* add-int/lit8 v9, v1, -0x3 */
/* .line 14 */
v9 = e.f.e.o.j .a ( v3,v8,v9 );
int v10 = -2; // const/4 v10, -0x2
int v11 = 0; // const/4 v11, 0x0
} // :goto_3
/* if-gt v10, v8, :cond_2 */
/* add-int v12, v9, v10 */
/* .line 15 */
/* aget-object v12, p5, v12 */
/* add-int/lit8 v13, v6, -0x2 */
/* .line 16 */
/* aget v13, v12, v13 */
/* add-int/lit8 v14, v6, -0x1 */
/* aget v14, v12, v14 */
/* add-int/2addr v13, v14 */
/* aget v14, v12, v6 */
/* add-int/2addr v13, v14 */
/* add-int/lit8 v14, v6, 0x1 */
/* aget v14, v12, v14 */
/* add-int/2addr v13, v14 */
/* add-int/lit8 v14, v6, 0x2 */
/* aget v12, v12, v14 */
/* add-int/2addr v13, v12 */
/* add-int/2addr v11, v13 */
/* add-int/lit8 v10, v10, 0x1 */
/* .line 17 */
} // :cond_2
/* div-int/lit8 v9, v11, 0x19 */
/* move-object v6, p0 */
/* move v8, v4 */
/* move/from16 v10, p3 */
/* move-object/from16 v11, p6 */
/* .line 18 */
/* invoke-static/range {v6 ..v11}, Le/f/e/o/j;->a([BIIIILe/f/e/o/b;)V */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
return;
} // .end method
public static I a ( Object[] p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 17 */
/* move/from16 v0, p1 */
/* move/from16 v1, p2 */
int v2 = 2; // const/4 v2, 0x2
/* new-array v3, v2, [I */
int v4 = 1; // const/4 v4, 0x1
/* aput v0, v3, v4 */
int v5 = 0; // const/4 v5, 0x0
/* aput v1, v3, v5 */
/* .line 21 */
/* const-class v6, I */
java.lang.reflect.Array .newInstance ( v6,v3 );
/* check-cast v3, [[I */
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-ge v6, v1, :cond_b */
/* shl-int/lit8 v7, v6, 0x3 */
/* const/16 v8, 0x8 */
/* add-int/lit8 v9, p4, -0x8 */
/* if-le v7, v9, :cond_0 */
/* move v7, v9 */
} // :cond_0
int v9 = 0; // const/4 v9, 0x0
} // :goto_1
/* if-ge v9, v0, :cond_a */
/* shl-int/lit8 v10, v9, 0x3 */
/* add-int/lit8 v11, p3, -0x8 */
/* if-le v10, v11, :cond_1 */
/* move v10, v11 */
} // :cond_1
/* mul-int v11, v7, p3 */
/* add-int/2addr v11, v10 */
/* const/16 v10, 0xff */
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
/* const/16 v15, 0xff */
} // :goto_2
/* const/16 v5, 0x18 */
/* if-ge v12, v8, :cond_7 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_3
/* if-ge v2, v8, :cond_4 */
/* add-int v16, v11, v2 */
/* .line 22 */
/* aget-byte v4, p0, v16 */
/* and-int/2addr v4, v10 */
/* add-int/2addr v13, v4 */
/* if-ge v4, v15, :cond_2 */
/* move v15, v4 */
} // :cond_2
/* if-le v4, v14, :cond_3 */
/* move v14, v4 */
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_4
/* sub-int v2, v14, v15 */
/* if-le v2, v5, :cond_6 */
} // :cond_5
/* add-int/lit8 v12, v12, 0x1 */
/* add-int v11, v11, p3 */
/* if-ge v12, v8, :cond_6 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_4
/* if-ge v2, v8, :cond_5 */
/* add-int v4, v11, v2 */
/* .line 23 */
/* aget-byte v4, p0, v4 */
/* and-int/2addr v4, v10 */
/* add-int/2addr v13, v4 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_6
int v2 = 1; // const/4 v2, 0x1
/* add-int/2addr v12, v2 */
/* add-int v11, v11, p3 */
int v2 = 2; // const/4 v2, 0x2
int v4 = 1; // const/4 v4, 0x1
} // :cond_7
int v2 = 1; // const/4 v2, 0x1
/* shr-int/lit8 v4, v13, 0x6 */
/* sub-int/2addr v14, v15 */
/* if-gt v14, v5, :cond_8 */
/* .line 24 */
/* div-int/lit8 v4, v15, 0x2 */
/* if-lez v6, :cond_8 */
/* if-lez v9, :cond_8 */
/* add-int/lit8 v5, v6, -0x1 */
/* .line 25 */
/* aget-object v10, v3, v5 */
/* aget v10, v10, v9 */
/* aget-object v11, v3, v6 */
/* add-int/lit8 v12, v9, -0x1 */
/* aget v11, v11, v12 */
int v13 = 2; // const/4 v13, 0x2
/* mul-int/lit8 v11, v11, 0x2 */
/* add-int/2addr v10, v11 */
/* aget-object v5, v3, v5 */
/* aget v5, v5, v12 */
/* add-int/2addr v10, v5 */
/* div-int/lit8 v5, v10, 0x4 */
/* if-ge v15, v5, :cond_9 */
/* move v4, v5 */
} // :cond_8
int v13 = 2; // const/4 v13, 0x2
/* .line 26 */
} // :cond_9
} // :goto_5
/* aget-object v5, v3, v6 */
/* aput v4, v5, v9 */
/* add-int/lit8 v9, v9, 0x1 */
int v2 = 2; // const/4 v2, 0x2
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
} // :cond_a
int v2 = 1; // const/4 v2, 0x1
int v13 = 2; // const/4 v13, 0x2
/* add-int/lit8 v6, v6, 0x1 */
int v2 = 2; // const/4 v2, 0x2
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* goto/16 :goto_0 */
} // :cond_b
} // .end method
/* # virtual methods */
public e.f.e.b a ( Object p0 ) {
/* .locals 1 */
/* .line 12 */
/* new-instance v0, Le/f/e/o/j; */
/* invoke-direct {v0, p1}, Le/f/e/o/j;-><init>(Le/f/e/f;)V */
} // .end method
public e.f.e.o.b a ( ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
(( e.f.e.b ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/e/b;->c()Le/f/e/f;
/* .line 3 */
v4 = (( e.f.e.f ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/e/f;->c()I
/* .line 4 */
v5 = (( e.f.e.f ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/e/f;->a()I
/* const/16 v1, 0x28 */
/* if-lt v4, v1, :cond_3 */
/* if-lt v5, v1, :cond_3 */
/* .line 5 */
(( e.f.e.f ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/e/f;->b()[B
/* shr-int/lit8 v0, v4, 0x3 */
/* and-int/lit8 v2, v4, 0x7 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* move v2, v0 */
/* shr-int/lit8 v0, v5, 0x3 */
/* and-int/lit8 v3, v5, 0x7 */
if ( v3 != null) { // if-eqz v3, :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* move v3, v0 */
/* .line 6 */
e.f.e.o.j .a ( v1,v2,v3,v4,v5 );
/* .line 7 */
/* new-instance v0, Le/f/e/o/b; */
/* invoke-direct {v0, v4, v5}, Le/f/e/o/b;-><init>(II)V */
/* move-object v7, v0 */
/* .line 8 */
/* invoke-static/range {v1 ..v7}, Le/f/e/o/j;->a([BIIII[[ILe/f/e/o/b;)V */
/* .line 9 */
this.e = v0;
/* .line 10 */
} // :cond_3
/* invoke-super {p0}, Le/f/e/o/h;->a()Le/f/e/o/b; */
this.e = v0;
/* .line 11 */
} // :goto_0
v0 = this.e;
} // .end method
<init>(FFFFFFFFF)V */
} // .end method
public void a ( Float[] p0 ) {
	 /* .locals 19 */
	 /* move-object/from16 v0, p0 */
	 /* move-object/from16 v1, p1 */
	 /* .line 4 */
	 /* array-length v2, v1 */
	 /* .line 5 */
	 /* iget v3, v0, Le/f/e/o/k;->a:F */
	 /* .line 6 */
	 /* iget v4, v0, Le/f/e/o/k;->b:F */
	 /* .line 7 */
	 /* iget v5, v0, Le/f/e/o/k;->c:F */
	 /* .line 8 */
	 /* iget v6, v0, Le/f/e/o/k;->d:F */
	 /* .line 9 */
	 /* iget v7, v0, Le/f/e/o/k;->e:F */
	 /* .line 10 */
	 /* iget v8, v0, Le/f/e/o/k;->f:F */
	 /* .line 11 */
	 /* iget v9, v0, Le/f/e/o/k;->g:F */
	 /* .line 12 */
	 /* iget v10, v0, Le/f/e/o/k;->h:F */
	 /* .line 13 */
	 /* iget v11, v0, Le/f/e/o/k;->i:F */
	 int v12 = 0; // const/4 v12, 0x0
} // :goto_0
/* if-ge v12, v2, :cond_0 */
/* .line 14 */
/* aget v13, v1, v12 */
/* add-int/lit8 v14, v12, 0x1 */
/* .line 15 */
/* aget v15, v1, v14 */
/* mul-float v16, v5, v13 */
/* mul-float v17, v8, v15 */
/* add-float v16, v16, v17 */
/* add-float v16, v16, v11 */
/* mul-float v17, v3, v13 */
/* mul-float v18, v6, v15 */
/* add-float v17, v17, v18 */
/* add-float v17, v17, v9 */
/* div-float v17, v17, v16 */
/* .line 16 */
/* aput v17, v1, v12 */
/* mul-float v13, v13, v4 */
/* mul-float v15, v15, v7 */
/* add-float/2addr v13, v15 */
/* add-float/2addr v13, v10 */
/* div-float v13, v13, v16 */
/* .line 17 */
/* aput v13, v1, v14 */
/* add-int/lit8 v12, v12, 0x2 */
} // :cond_0
return;
} // .end method
