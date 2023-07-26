public class e.f.e.t.c.c {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.e.o.b a;
	 public e.f.e.m b;
	 /* # direct methods */
	 public e.f.e.t.c.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static Integer a ( Object p0, Object p1, Object p2, Float p3 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/zxing/NotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 36 */
	 p1 = 	 e.f.e.l .a ( p0,p1 );
	 /* div-float/2addr p1, p3 */
	 p1 = 	 e.f.e.o.m.a .a ( p1 );
	 /* .line 37 */
	 p0 = 	 e.f.e.l .a ( p0,p2 );
	 /* div-float/2addr p0, p3 */
	 p0 = 	 e.f.e.o.m.a .a ( p0 );
	 /* add-int/2addr p1, p0 */
	 int p0 = 2; // const/4 p0, 0x2
	 /* .line 38 */
	 /* div-int/2addr p1, p0 */
	 /* add-int/lit8 p1, p1, 0x7 */
	 /* and-int/lit8 p2, p1, 0x3 */
	 if ( p2 != null) { // if-eqz p2, :cond_2
		 /* if-eq p2, p0, :cond_1 */
		 int p0 = 3; // const/4 p0, 0x3
		 /* if-eq p2, p0, :cond_0 */
		 /* .line 39 */
	 } // :cond_0
	 com.google.zxing.NotFoundException .a ( );
	 /* throw p0 */
} // :cond_1
/* add-int/lit8 p1, p1, -0x1 */
} // :cond_2
/* add-int/lit8 p1, p1, 0x1 */
} // :goto_0
} // .end method
public static e.f.e.o.b a ( Object p0, Object p1, Integer p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* .line 34 */
e.f.e.o.i .a ( );
/* .line 35 */
(( e.f.e.o.i ) v0 ).a ( p0, p2, p2, p1 ); // invoke-virtual {v0, p0, p2, p2, p1}, Le/f/e/o/i;->a(Le/f/e/o/b;IILe/f/e/o/k;)Le/f/e/o/b;
} // .end method
public static e.f.e.o.k a ( Object p0, Object p1, Object p2, Object p3, Integer p4 ) {
/* .locals 18 */
/* move/from16 v0, p4 */
/* int-to-float v0, v0 */
/* const/high16 v1, 0x40600000 # 3.5f */
/* sub-float v9, v0, v1 */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 23 */
v0 = /* invoke-virtual/range {p3 ..p3}, Le/f/e/l;->a()F */
/* .line 24 */
v1 = /* invoke-virtual/range {p3 ..p3}, Le/f/e/l;->b()F */
/* const/high16 v2, 0x40400000 # 3.0f */
/* sub-float v2, v9, v2 */
/* move v14, v0 */
/* move v15, v1 */
/* move v7, v2 */
/* .line 25 */
} // :cond_0
v0 = /* invoke-virtual/range {p1 ..p1}, Le/f/e/l;->a()F */
v1 = /* invoke-virtual/range {p0 ..p0}, Le/f/e/l;->a()F */
/* sub-float/2addr v0, v1 */
v1 = /* invoke-virtual/range {p2 ..p2}, Le/f/e/l;->a()F */
/* add-float/2addr v0, v1 */
/* .line 26 */
v1 = /* invoke-virtual/range {p1 ..p1}, Le/f/e/l;->b()F */
v2 = /* invoke-virtual/range {p0 ..p0}, Le/f/e/l;->b()F */
/* sub-float/2addr v1, v2 */
v2 = /* invoke-virtual/range {p2 ..p2}, Le/f/e/l;->b()F */
/* add-float/2addr v1, v2 */
/* move v14, v0 */
/* move v15, v1 */
/* move v7, v9 */
} // :goto_0
/* const/high16 v2, 0x40600000 # 3.5f */
/* const/high16 v3, 0x40600000 # 3.5f */
/* const/high16 v5, 0x40600000 # 3.5f */
/* const/high16 v8, 0x40600000 # 3.5f */
/* .line 27 */
v10 = /* invoke-virtual/range {p0 ..p0}, Le/f/e/l;->a()F */
/* .line 28 */
v11 = /* invoke-virtual/range {p0 ..p0}, Le/f/e/l;->b()F */
/* .line 29 */
v12 = /* invoke-virtual/range {p1 ..p1}, Le/f/e/l;->a()F */
/* .line 30 */
v13 = /* invoke-virtual/range {p1 ..p1}, Le/f/e/l;->b()F */
/* .line 31 */
v16 = /* invoke-virtual/range {p2 ..p2}, Le/f/e/l;->a()F */
/* .line 32 */
v17 = /* invoke-virtual/range {p2 ..p2}, Le/f/e/l;->b()F */
/* move v4, v9 */
/* move v6, v7 */
/* .line 33 */
/* invoke-static/range {v2 ..v17}, Le/f/e/o/k;->a(FFFFFFFFFFFFFFFF)Le/f/e/o/k; */
} // .end method
/* # virtual methods */
public final Float a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 17 */
/* sub-int v0, p4, p2 */
/* .line 54 */
v0 = java.lang.Math .abs ( v0 );
/* sub-int v1, p3, p1 */
v1 = java.lang.Math .abs ( v1 );
int v3 = 1; // const/4 v3, 0x1
/* if-le v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* move/from16 v4, p1 */
/* move/from16 v1, p2 */
/* move/from16 v6, p3 */
/* move/from16 v5, p4 */
} // :cond_1
/* move/from16 v1, p1 */
/* move/from16 v4, p2 */
/* move/from16 v5, p3 */
/* move/from16 v6, p4 */
} // :goto_1
/* sub-int v7, v5, v1 */
/* .line 55 */
v7 = java.lang.Math .abs ( v7 );
/* sub-int v8, v6, v4 */
/* .line 56 */
v8 = java.lang.Math .abs ( v8 );
/* neg-int v9, v7 */
int v10 = 2; // const/4 v10, 0x2
/* .line 57 */
/* div-int/2addr v9, v10 */
int v11 = -1; // const/4 v11, -0x1
/* if-ge v1, v5, :cond_2 */
int v12 = 1; // const/4 v12, 0x1
} // :cond_2
int v12 = -1; // const/4 v12, -0x1
} // :goto_2
/* if-ge v4, v6, :cond_3 */
int v11 = 1; // const/4 v11, 0x1
} // :cond_3
/* add-int/2addr v5, v12 */
/* move v13, v1 */
/* move v14, v4 */
int v15 = 0; // const/4 v15, 0x0
} // :goto_3
/* if-eq v13, v5, :cond_a */
if ( v0 != null) { // if-eqz v0, :cond_4
/* move v2, v14 */
} // :cond_4
/* move v2, v13 */
} // :goto_4
if ( v0 != null) { // if-eqz v0, :cond_5
/* move v10, v13 */
} // :cond_5
/* move v10, v14 */
} // :goto_5
/* if-ne v15, v3, :cond_6 */
/* move-object/from16 v3, p0 */
/* move/from16 v16, v0 */
/* move/from16 p2, v5 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_6
/* move-object/from16 v3, p0 */
/* move/from16 v16, v0 */
/* move/from16 p2, v5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 58 */
} // :goto_6
v5 = this.a;
v2 = (( e.f.e.o.b ) v5 ).b ( v2, v10 ); // invoke-virtual {v5, v2, v10}, Le/f/e/o/b;->b(II)Z
/* if-ne v0, v2, :cond_8 */
int v0 = 2; // const/4 v0, 0x2
/* if-ne v15, v0, :cond_7 */
/* .line 59 */
v0 = e.f.e.o.m.a .a ( v13,v14,v1,v4 );
} // :cond_7
/* add-int/lit8 v15, v15, 0x1 */
} // :cond_8
/* add-int/2addr v9, v8 */
/* if-lez v9, :cond_9 */
/* if-eq v14, v6, :cond_b */
/* add-int/2addr v14, v11 */
/* sub-int/2addr v9, v7 */
} // :cond_9
/* add-int/2addr v13, v12 */
/* move/from16 v5, p2 */
/* move/from16 v0, v16 */
int v3 = 1; // const/4 v3, 0x1
int v10 = 2; // const/4 v10, 0x2
} // :cond_a
/* move-object/from16 v3, p0 */
/* move/from16 p2, v5 */
} // :cond_b
int v0 = 2; // const/4 v0, 0x2
/* if-ne v15, v0, :cond_c */
/* move/from16 v5, p2 */
/* .line 60 */
v0 = e.f.e.o.m.a .a ( v5,v6,v1,v4 );
} // :cond_c
/* const/high16 v0, 0x7fc00000 # Float.NaN */
} // .end method
public final Float a ( Object p0, Object p1 ) {
/* .locals 4 */
/* .line 42 */
v0 = (( e.f.e.l ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/e/l;->a()F
/* float-to-int v0, v0 */
/* .line 43 */
v1 = (( e.f.e.l ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/e/l;->b()F
/* float-to-int v1, v1 */
/* .line 44 */
v2 = (( e.f.e.l ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/e/l;->a()F
/* float-to-int v2, v2 */
/* .line 45 */
v3 = (( e.f.e.l ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/e/l;->b()F
/* float-to-int v3, v3 */
/* .line 46 */
v0 = (( e.f.e.t.c.c ) p0 ).b ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Le/f/e/t/c/c;->b(IIII)F
/* .line 47 */
v1 = (( e.f.e.l ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/e/l;->a()F
/* float-to-int v1, v1 */
/* .line 48 */
p2 = (( e.f.e.l ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/e/l;->b()F
/* float-to-int p2, p2 */
/* .line 49 */
v2 = (( e.f.e.l ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/e/l;->a()F
/* float-to-int v2, v2 */
/* .line 50 */
p1 = (( e.f.e.l ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/e/l;->b()F
/* float-to-int p1, p1 */
/* .line 51 */
p1 = (( e.f.e.t.c.c ) p0 ).b ( v1, p2, v2, p1 ); // invoke-virtual {p0, v1, p2, v2, p1}, Le/f/e/t/c/c;->b(IIII)F
/* .line 52 */
p2 = java.lang.Float .isNaN ( v0 );
/* const/high16 v1, 0x40e00000 # 7.0f */
if ( p2 != null) { // if-eqz p2, :cond_0
/* div-float/2addr p1, v1 */
/* .line 53 */
} // :cond_0
p2 = java.lang.Float .isNaN ( p1 );
if ( p2 != null) { // if-eqz p2, :cond_1
/* div-float/2addr v0, v1 */
} // :cond_1
/* add-float/2addr v0, p1 */
/* const/high16 p1, 0x41600000 # 14.0f */
/* div-float/2addr v0, p1 */
} // .end method
public final Float a ( Object p0, Object p1, Object p2 ) {
/* .locals 0 */
/* .line 40 */
p2 = (( e.f.e.t.c.c ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/e/t/c/c;->a(Le/f/e/l;Le/f/e/l;)F
/* .line 41 */
p1 = (( e.f.e.t.c.c ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Le/f/e/t/c/c;->a(Le/f/e/l;Le/f/e/l;)F
/* add-float/2addr p2, p1 */
/* const/high16 p1, 0x40000000 # 2.0f */
/* div-float/2addr p2, p1 */
} // .end method
public final e.f.e.o.g a ( Object p0 ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException;, */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* .line 6 */
(( e.f.e.t.c.i ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/e/t/c/i;->b()Le/f/e/t/c/d;
/* .line 7 */
(( e.f.e.t.c.i ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/e/t/c/i;->c()Le/f/e/t/c/d;
/* .line 8 */
(( e.f.e.t.c.i ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/e/t/c/i;->a()Le/f/e/t/c/d;
/* .line 9 */
v2 = (( e.f.e.t.c.c ) p0 ).a ( v0, v1, p1 ); // invoke-virtual {p0, v0, v1, p1}, Le/f/e/t/c/c;->a(Le/f/e/l;Le/f/e/l;Le/f/e/l;)F
/* const/high16 v3, 0x3f800000 # 1.0f */
/* cmpg-float v4, v2, v3 */
/* if-ltz v4, :cond_2 */
/* .line 10 */
v4 = e.f.e.t.c.c .a ( v0,v1,p1,v2 );
/* .line 11 */
e.f.e.t.b.t .b ( v4 );
/* .line 12 */
v6 = (( e.f.e.t.b.t ) v5 ).c ( ); // invoke-virtual {v5}, Le/f/e/t/b/t;->c()I
/* add-int/lit8 v6, v6, -0x7 */
int v7 = 0; // const/4 v7, 0x0
/* .line 13 */
(( e.f.e.t.b.t ) v5 ).b ( ); // invoke-virtual {v5}, Le/f/e/t/b/t;->b()[I
/* array-length v5, v5 */
int v8 = 4; // const/4 v8, 0x4
/* if-lez v5, :cond_0 */
/* .line 14 */
v5 = (( e.f.e.l ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/e/l;->a()F
v9 = (( e.f.e.l ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/e/l;->a()F
/* sub-float/2addr v5, v9 */
v9 = (( e.f.e.l ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/e/l;->a()F
/* add-float/2addr v5, v9 */
/* .line 15 */
v9 = (( e.f.e.l ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/e/l;->b()F
v10 = (( e.f.e.l ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/e/l;->b()F
/* sub-float/2addr v9, v10 */
v10 = (( e.f.e.l ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/e/l;->b()F
/* add-float/2addr v9, v10 */
/* const/high16 v10, 0x40400000 # 3.0f */
/* int-to-float v6, v6 */
/* div-float/2addr v10, v6 */
/* sub-float/2addr v3, v10 */
/* .line 16 */
v6 = (( e.f.e.l ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/e/l;->a()F
v10 = (( e.f.e.l ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/e/l;->a()F
/* sub-float/2addr v5, v10 */
/* mul-float v5, v5, v3 */
/* add-float/2addr v6, v5 */
/* float-to-int v5, v6 */
/* .line 17 */
v6 = (( e.f.e.l ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/e/l;->b()F
v10 = (( e.f.e.l ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/e/l;->b()F
/* sub-float/2addr v9, v10 */
/* mul-float v3, v3, v9 */
/* add-float/2addr v6, v3 */
/* float-to-int v3, v6 */
int v6 = 4; // const/4 v6, 0x4
} // :goto_0
/* const/16 v9, 0x10 */
/* if-gt v6, v9, :cond_0 */
/* int-to-float v9, v6 */
/* .line 18 */
try { // :try_start_0
(( e.f.e.t.c.c ) p0 ).a ( v2, v5, v3, v9 ); // invoke-virtual {p0, v2, v5, v3, v9}, Le/f/e/t/c/c;->a(FIIF)Le/f/e/t/c/a;
/* :try_end_0 */
/* .catch Lcom/google/zxing/NotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* shl-int/lit8 v6, v6, 0x1 */
/* .line 19 */
} // :cond_0
} // :goto_1
e.f.e.t.c.c .a ( v0,v1,p1,v7,v4 );
/* .line 20 */
v3 = this.a;
e.f.e.t.c.c .a ( v3,v2,v4 );
int v3 = 3; // const/4 v3, 0x3
int v4 = 2; // const/4 v4, 0x2
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* if-nez v7, :cond_1 */
/* new-array v3, v3, [Le/f/e/l; */
/* aput-object p1, v3, v5 */
/* aput-object v0, v3, v6 */
/* aput-object v1, v3, v4 */
} // :cond_1
/* new-array v8, v8, [Le/f/e/l; */
/* aput-object p1, v8, v5 */
/* aput-object v0, v8, v6 */
/* aput-object v1, v8, v4 */
/* aput-object v7, v8, v3 */
/* move-object v3, v8 */
/* .line 21 */
} // :goto_2
/* new-instance p1, Le/f/e/o/g; */
/* invoke-direct {p1, v2, v3}, Le/f/e/o/g;-><init>(Le/f/e/o/b;[Le/f/e/l;)V */
/* .line 22 */
} // :cond_2
com.google.zxing.NotFoundException .a ( );
/* throw p1 */
} // .end method
public final e.f.e.o.g a ( java.util.Map p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Le/f/e/d;", */
/* "*>;)", */
/* "Le/f/e/o/g;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException;, */
/* Lcom/google/zxing/FormatException; */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :cond_0
v0 = e.f.e.d.k;
/* .line 2 */
/* check-cast v0, Le/f/e/m; */
} // :goto_0
this.b = v0;
/* .line 3 */
/* new-instance v1, Le/f/e/t/c/h; */
v2 = this.a;
/* invoke-direct {v1, v2, v0}, Le/f/e/t/c/h;-><init>(Le/f/e/o/b;Le/f/e/m;)V */
/* .line 4 */
(( e.f.e.t.c.h ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/f/e/t/c/h;->a(Ljava/util/Map;)Le/f/e/t/c/i;
/* .line 5 */
(( e.f.e.t.c.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/e/t/c/c;->a(Le/f/e/t/c/i;)Le/f/e/o/g;
} // .end method
public final e.f.e.t.c.a a ( Float p0, Integer p1, Integer p2, Float p3 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* mul-float p4, p4, p1 */
/* float-to-int p4, p4 */
/* sub-int v0, p2, p4 */
int v1 = 0; // const/4 v1, 0x0
/* .line 61 */
v4 = java.lang.Math .max ( v1,v0 );
/* .line 62 */
v0 = this.a;
v0 = (( e.f.e.o.b ) v0 ).f ( ); // invoke-virtual {v0}, Le/f/e/o/b;->f()I
/* add-int/lit8 v0, v0, -0x1 */
/* add-int/2addr p2, p4 */
p2 = java.lang.Math .min ( v0,p2 );
/* sub-int v6, p2, v4 */
/* int-to-float p2, v6 */
/* const/high16 v0, 0x40400000 # 3.0f */
/* mul-float v0, v0, p1 */
/* cmpg-float p2, p2, v0 */
/* if-ltz p2, :cond_1 */
/* sub-int p2, p3, p4 */
/* .line 63 */
v5 = java.lang.Math .max ( v1,p2 );
/* .line 64 */
p2 = this.a;
p2 = (( e.f.e.o.b ) p2 ).d ( ); // invoke-virtual {p2}, Le/f/e/o/b;->d()I
/* add-int/lit8 p2, p2, -0x1 */
/* add-int/2addr p3, p4 */
p2 = java.lang.Math .min ( p2,p3 );
/* sub-int v7, p2, v5 */
/* int-to-float p2, v7 */
/* cmpg-float p2, p2, v0 */
/* if-ltz p2, :cond_0 */
/* .line 65 */
/* new-instance p2, Le/f/e/t/c/b; */
v3 = this.a;
v9 = this.b;
/* move-object v2, p2 */
/* move v8, p1 */
/* invoke-direct/range {v2 ..v9}, Le/f/e/t/c/b;-><init>(Le/f/e/o/b;IIIIFLe/f/e/m;)V */
/* .line 66 */
(( e.f.e.t.c.b ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/e/t/c/b;->a()Le/f/e/t/c/a;
/* .line 67 */
} // :cond_0
com.google.zxing.NotFoundException .a ( );
/* throw p1 */
/* .line 68 */
} // :cond_1
com.google.zxing.NotFoundException .a ( );
/* throw p1 */
} // .end method
public final Float b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 5 */
/* .line 1 */
v0 = (( e.f.e.t.c.c ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/f/e/t/c/c;->a(IIII)F
/* sub-int/2addr p3, p1 */
/* sub-int p3, p1, p3 */
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v2, 0x3f800000 # 1.0f */
/* if-gez p3, :cond_0 */
/* int-to-float v3, p1 */
/* sub-int p3, p1, p3 */
/* int-to-float p3, p3 */
/* div-float/2addr v3, p3 */
int p3 = 0; // const/4 p3, 0x0
/* .line 2 */
} // :cond_0
v3 = this.a;
v3 = (( e.f.e.o.b ) v3 ).f ( ); // invoke-virtual {v3}, Le/f/e/o/b;->f()I
/* if-lt p3, v3, :cond_1 */
/* .line 3 */
v3 = this.a;
v3 = (( e.f.e.o.b ) v3 ).f ( ); // invoke-virtual {v3}, Le/f/e/o/b;->f()I
/* add-int/lit8 v3, v3, -0x1 */
/* sub-int/2addr v3, p1 */
/* int-to-float v3, v3 */
/* sub-int/2addr p3, p1 */
/* int-to-float p3, p3 */
/* div-float/2addr v3, p3 */
/* .line 4 */
p3 = this.a;
p3 = (( e.f.e.o.b ) p3 ).f ( ); // invoke-virtual {p3}, Le/f/e/o/b;->f()I
/* add-int/lit8 p3, p3, -0x1 */
} // :cond_1
/* const/high16 v3, 0x3f800000 # 1.0f */
} // :goto_0
/* int-to-float v4, p2 */
/* sub-int/2addr p4, p2 */
/* int-to-float p4, p4 */
/* mul-float p4, p4, v3 */
/* sub-float p4, v4, p4 */
/* float-to-int p4, p4 */
/* if-gez p4, :cond_2 */
/* sub-int p4, p2, p4 */
/* int-to-float p4, p4 */
/* div-float/2addr v4, p4 */
/* .line 5 */
} // :cond_2
v1 = this.a;
v1 = (( e.f.e.o.b ) v1 ).d ( ); // invoke-virtual {v1}, Le/f/e/o/b;->d()I
/* if-lt p4, v1, :cond_3 */
/* .line 6 */
v1 = this.a;
v1 = (( e.f.e.o.b ) v1 ).d ( ); // invoke-virtual {v1}, Le/f/e/o/b;->d()I
/* add-int/lit8 v1, v1, -0x1 */
/* sub-int/2addr v1, p2 */
/* int-to-float v1, v1 */
/* sub-int/2addr p4, p2 */
/* int-to-float p4, p4 */
/* div-float v4, v1, p4 */
/* .line 7 */
p4 = this.a;
p4 = (( e.f.e.o.b ) p4 ).d ( ); // invoke-virtual {p4}, Le/f/e/o/b;->d()I
/* add-int/lit8 v1, p4, -0x1 */
} // :cond_3
/* move v1, p4 */
/* const/high16 v4, 0x3f800000 # 1.0f */
} // :goto_1
/* int-to-float p4, p1 */
/* sub-int/2addr p3, p1 */
/* int-to-float p3, p3 */
/* mul-float p3, p3, v4 */
/* add-float/2addr p4, p3 */
/* float-to-int p3, p4 */
/* .line 8 */
p1 = (( e.f.e.t.c.c ) p0 ).a ( p1, p2, p3, v1 ); // invoke-virtual {p0, p1, p2, p3, v1}, Le/f/e/t/c/c;->a(IIII)F
/* add-float/2addr v0, p1 */
/* sub-float/2addr v0, v2 */
} // .end method
