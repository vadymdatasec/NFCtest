public class e.f.e.t.c.h {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.e.o.b a;
	 public final java.util.List b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/f/e/t/c/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Boolean c;
public final d;
public final e.f.e.m e;
/* # direct methods */
public e.f.e.t.c.h ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.b = p1;
int p1 = 5; // const/4 p1, 0x5
/* new-array p1, p1, [I */
/* .line 4 */
this.d = p1;
/* .line 5 */
this.e = p2;
return;
} // .end method
public static Float a ( Integer[] p0, Integer p1 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* .line 31 */
/* aget v0, p0, v0 */
/* sub-int/2addr p1, v0 */
int v0 = 3; // const/4 v0, 0x3
/* aget v0, p0, v0 */
/* sub-int/2addr p1, v0 */
/* int-to-float p1, p1 */
int v0 = 2; // const/4 v0, 0x2
/* aget p0, p0, v0 */
/* int-to-float p0, p0 */
/* const/high16 v0, 0x40000000 # 2.0f */
/* div-float/2addr p0, v0 */
/* sub-float/2addr p1, p0 */
} // .end method
public static Boolean a ( Integer[] p0 ) {
/* .locals 7 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
int v3 = 5; // const/4 v3, 0x5
/* if-ge v1, v3, :cond_1 */
/* .line 32 */
/* aget v3, p0, v1 */
/* if-nez v3, :cond_0 */
} // :cond_0
/* add-int/2addr v2, v3 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v1 = 7; // const/4 v1, 0x7
/* if-ge v2, v1, :cond_2 */
} // :cond_2
/* int-to-float v1, v2 */
/* const/high16 v2, 0x40e00000 # 7.0f */
/* div-float/2addr v1, v2 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float v2, v1, v2 */
/* .line 33 */
/* aget v3, p0, v0 */
/* int-to-float v3, v3 */
/* sub-float v3, v1, v3 */
/* .line 34 */
v3 = java.lang.Math .abs ( v3 );
/* cmpg-float v3, v3, v2 */
/* if-gez v3, :cond_3 */
int v3 = 1; // const/4 v3, 0x1
/* aget v4, p0, v3 */
/* int-to-float v4, v4 */
/* sub-float v4, v1, v4 */
/* .line 35 */
v4 = java.lang.Math .abs ( v4 );
/* cmpg-float v4, v4, v2 */
/* if-gez v4, :cond_3 */
/* const/high16 v4, 0x40400000 # 3.0f */
/* mul-float v5, v1, v4 */
int v6 = 2; // const/4 v6, 0x2
/* aget v6, p0, v6 */
/* int-to-float v6, v6 */
/* sub-float/2addr v5, v6 */
/* .line 36 */
v5 = java.lang.Math .abs ( v5 );
/* mul-float v4, v4, v2 */
/* cmpg-float v4, v5, v4 */
/* if-gez v4, :cond_3 */
int v4 = 3; // const/4 v4, 0x3
/* aget v4, p0, v4 */
/* int-to-float v4, v4 */
/* sub-float v4, v1, v4 */
/* .line 37 */
v4 = java.lang.Math .abs ( v4 );
/* cmpg-float v4, v4, v2 */
/* if-gez v4, :cond_3 */
int v4 = 4; // const/4 v4, 0x4
/* aget p0, p0, v4 */
/* int-to-float p0, p0 */
/* sub-float/2addr v1, p0 */
/* .line 38 */
p0 = java.lang.Math .abs ( v1 );
/* cmpg-float p0, p0, v2 */
/* if-gez p0, :cond_3 */
} // :cond_3
} // .end method
/* # virtual methods */
public final Integer a ( ) {
/* .locals 7 */
/* .line 76 */
v0 = v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-gt v0, v2, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 77 */
v3 = this.b;
} // :cond_1
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_3
/* check-cast v4, Le/f/e/t/c/d; */
/* .line 78 */
v5 = (( e.f.e.t.c.d ) v4 ).c ( ); // invoke-virtual {v4}, Le/f/e/t/c/d;->c()I
int v6 = 2; // const/4 v6, 0x2
/* if-lt v5, v6, :cond_1 */
/* if-nez v0, :cond_2 */
/* move-object v0, v4 */
/* .line 79 */
} // :cond_2
/* iput-boolean v2, p0, Le/f/e/t/c/h;->c:Z */
/* .line 80 */
v1 = (( e.f.e.l ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/e/l;->a()F
v2 = (( e.f.e.l ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/e/l;->a()F
/* sub-float/2addr v1, v2 */
v1 = java.lang.Math .abs ( v1 );
/* .line 81 */
v0 = (( e.f.e.l ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/e/l;->b()F
v2 = (( e.f.e.l ) v4 ).b ( ); // invoke-virtual {v4}, Le/f/e/l;->b()F
/* sub-float/2addr v0, v2 */
v0 = java.lang.Math .abs ( v0 );
/* sub-float/2addr v1, v0 */
/* float-to-int v0, v1 */
/* div-int/2addr v0, v6 */
} // :cond_3
} // .end method
public final e.f.e.t.c.i a ( java.util.Map p0 ) {
/* .locals 14 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Le/f/e/d;", */
/* "*>;)", */
/* "Le/f/e/t/c/i;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
v2 = v2 = e.f.e.d.e;
if ( v2 != null) { // if-eqz v2, :cond_0
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 2 */
p1 = v3 = e.f.e.d.c;
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :goto_1
v3 = this.a;
v3 = (( e.f.e.o.b ) v3 ).d ( ); // invoke-virtual {v3}, Le/f/e/o/b;->d()I
/* .line 4 */
v4 = this.a;
v4 = (( e.f.e.o.b ) v4 ).f ( ); // invoke-virtual {v4}, Le/f/e/o/b;->f()I
/* mul-int/lit8 v5, v3, 0x3 */
/* .line 5 */
/* div-int/lit16 v5, v5, 0xe4 */
int v6 = 3; // const/4 v6, 0x3
/* if-lt v5, v6, :cond_2 */
if ( v2 != null) { // if-eqz v2, :cond_3
} // :cond_2
int v5 = 3; // const/4 v5, 0x3
} // :cond_3
int v2 = 5; // const/4 v2, 0x5
/* new-array v2, v2, [I */
/* add-int/lit8 v7, v5, -0x1 */
int v8 = 0; // const/4 v8, 0x0
} // :goto_2
/* if-ge v7, v3, :cond_e */
/* if-nez v8, :cond_e */
/* aput v1, v2, v1 */
/* aput v1, v2, v0 */
int v9 = 2; // const/4 v9, 0x2
/* aput v1, v2, v9 */
/* aput v1, v2, v6 */
int v10 = 4; // const/4 v10, 0x4
/* aput v1, v2, v10 */
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
} // :goto_3
/* if-ge v11, v4, :cond_c */
/* .line 6 */
v13 = this.a;
v13 = (( e.f.e.o.b ) v13 ).b ( v11, v7 ); // invoke-virtual {v13, v11, v7}, Le/f/e/o/b;->b(II)Z
if ( v13 != null) { // if-eqz v13, :cond_5
/* and-int/lit8 v13, v12, 0x1 */
/* if-ne v13, v0, :cond_4 */
/* add-int/lit8 v12, v12, 0x1 */
/* .line 7 */
} // :cond_4
/* aget v13, v2, v12 */
/* add-int/2addr v13, v0 */
/* aput v13, v2, v12 */
} // :cond_5
/* and-int/lit8 v13, v12, 0x1 */
/* if-nez v13, :cond_b */
/* if-ne v12, v10, :cond_a */
/* .line 8 */
v12 = e.f.e.t.c.h .a ( v2 );
if ( v12 != null) { // if-eqz v12, :cond_9
/* .line 9 */
v12 = (( e.f.e.t.c.h ) p0 ).a ( v2, v7, v11, p1 ); // invoke-virtual {p0, v2, v7, v11, p1}, Le/f/e/t/c/h;->a([IIIZ)Z
if ( v12 != null) { // if-eqz v12, :cond_8
/* .line 10 */
/* iget-boolean v5, p0, Le/f/e/t/c/h;->c:Z */
if ( v5 != null) { // if-eqz v5, :cond_6
/* .line 11 */
v8 = (( e.f.e.t.c.h ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/e/t/c/h;->c()Z
/* .line 12 */
} // :cond_6
v5 = (( e.f.e.t.c.h ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/t/c/h;->a()I
/* .line 13 */
/* aget v12, v2, v9 */
/* if-le v5, v12, :cond_7 */
/* .line 14 */
/* aget v11, v2, v9 */
/* sub-int/2addr v5, v11 */
/* sub-int/2addr v5, v9 */
/* add-int/2addr v7, v5 */
/* add-int/lit8 v11, v4, -0x1 */
} // :cond_7
} // :goto_4
/* aput v1, v2, v1 */
/* aput v1, v2, v0 */
/* aput v1, v2, v9 */
/* aput v1, v2, v6 */
/* aput v1, v2, v10 */
int v5 = 2; // const/4 v5, 0x2
int v12 = 0; // const/4 v12, 0x0
/* .line 15 */
} // :cond_8
/* aget v12, v2, v9 */
/* aput v12, v2, v1 */
/* .line 16 */
/* aget v12, v2, v6 */
/* aput v12, v2, v0 */
/* .line 17 */
/* aget v12, v2, v10 */
/* aput v12, v2, v9 */
/* aput v0, v2, v6 */
/* aput v1, v2, v10 */
/* .line 18 */
} // :cond_9
/* aget v12, v2, v9 */
/* aput v12, v2, v1 */
/* .line 19 */
/* aget v12, v2, v6 */
/* aput v12, v2, v0 */
/* .line 20 */
/* aget v12, v2, v10 */
/* aput v12, v2, v9 */
/* aput v0, v2, v6 */
/* aput v1, v2, v10 */
} // :goto_5
int v12 = 3; // const/4 v12, 0x3
} // :cond_a
/* add-int/lit8 v12, v12, 0x1 */
/* .line 21 */
/* aget v13, v2, v12 */
/* add-int/2addr v13, v0 */
/* aput v13, v2, v12 */
/* .line 22 */
} // :cond_b
/* aget v13, v2, v12 */
/* add-int/2addr v13, v0 */
/* aput v13, v2, v12 */
} // :goto_6
/* add-int/2addr v11, v0 */
/* .line 23 */
} // :cond_c
v9 = e.f.e.t.c.h .a ( v2 );
if ( v9 != null) { // if-eqz v9, :cond_d
/* .line 24 */
v9 = (( e.f.e.t.c.h ) p0 ).a ( v2, v7, v4, p1 ); // invoke-virtual {p0, v2, v7, v4, p1}, Le/f/e/t/c/h;->a([IIIZ)Z
if ( v9 != null) { // if-eqz v9, :cond_d
/* .line 25 */
/* aget v5, v2, v1 */
/* .line 26 */
/* iget-boolean v9, p0, Le/f/e/t/c/h;->c:Z */
if ( v9 != null) { // if-eqz v9, :cond_d
/* .line 27 */
v8 = (( e.f.e.t.c.h ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/e/t/c/h;->c()Z
} // :cond_d
/* add-int/2addr v7, v5 */
/* goto/16 :goto_2 */
/* .line 28 */
} // :cond_e
(( e.f.e.t.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/e/t/c/h;->d()[Le/f/e/t/c/d;
/* .line 29 */
e.f.e.l .a ( p1 );
/* .line 30 */
/* new-instance v0, Le/f/e/t/c/i; */
/* invoke-direct {v0, p1}, Le/f/e/t/c/i;-><init>([Le/f/e/t/c/d;)V */
} // .end method
public final Boolean a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 16 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p1 */
/* move/from16 v2, p2 */
/* move/from16 v3, p3 */
/* .line 39 */
/* invoke-virtual/range {p0 ..p0}, Le/f/e/t/c/h;->b()[I */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
int v7 = 2; // const/4 v7, 0x2
int v8 = 1; // const/4 v8, 0x1
/* if-lt v1, v6, :cond_0 */
/* if-lt v2, v6, :cond_0 */
/* .line 40 */
v9 = this.a;
/* sub-int v10, v2, v6 */
/* sub-int v11, v1, v6 */
v9 = (( e.f.e.o.b ) v9 ).b ( v10, v11 ); // invoke-virtual {v9, v10, v11}, Le/f/e/o/b;->b(II)Z
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 41 */
/* aget v9, v4, v7 */
/* add-int/2addr v9, v8 */
/* aput v9, v4, v7 */
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_0
/* if-lt v1, v6, :cond_c */
/* if-ge v2, v6, :cond_1 */
/* goto/16 :goto_6 */
} // :cond_1
} // :goto_1
/* if-lt v1, v6, :cond_2 */
/* if-lt v2, v6, :cond_2 */
/* .line 42 */
v9 = this.a;
/* sub-int v10, v2, v6 */
/* sub-int v11, v1, v6 */
v9 = (( e.f.e.o.b ) v9 ).b ( v10, v11 ); // invoke-virtual {v9, v10, v11}, Le/f/e/o/b;->b(II)Z
/* if-nez v9, :cond_2 */
/* aget v9, v4, v8 */
/* if-gt v9, v3, :cond_2 */
/* .line 43 */
/* aget v9, v4, v8 */
/* add-int/2addr v9, v8 */
/* aput v9, v4, v8 */
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_2
/* if-lt v1, v6, :cond_c */
/* if-lt v2, v6, :cond_c */
/* .line 44 */
/* aget v9, v4, v8 */
/* if-le v9, v3, :cond_3 */
/* goto/16 :goto_6 */
} // :cond_3
} // :goto_2
/* if-lt v1, v6, :cond_4 */
/* if-lt v2, v6, :cond_4 */
/* .line 45 */
v9 = this.a;
/* sub-int v10, v2, v6 */
/* sub-int v11, v1, v6 */
v9 = (( e.f.e.o.b ) v9 ).b ( v10, v11 ); // invoke-virtual {v9, v10, v11}, Le/f/e/o/b;->b(II)Z
if ( v9 != null) { // if-eqz v9, :cond_4
/* aget v9, v4, v5 */
/* if-gt v9, v3, :cond_4 */
/* .line 46 */
/* aget v9, v4, v5 */
/* add-int/2addr v9, v8 */
/* aput v9, v4, v5 */
/* add-int/lit8 v6, v6, 0x1 */
/* .line 47 */
} // :cond_4
/* aget v6, v4, v5 */
/* if-le v6, v3, :cond_5 */
/* .line 48 */
} // :cond_5
v6 = this.a;
v6 = (( e.f.e.o.b ) v6 ).d ( ); // invoke-virtual {v6}, Le/f/e/o/b;->d()I
/* .line 49 */
v9 = this.a;
v9 = (( e.f.e.o.b ) v9 ).f ( ); // invoke-virtual {v9}, Le/f/e/o/b;->f()I
int v10 = 1; // const/4 v10, 0x1
} // :goto_3
/* add-int v11, v1, v10 */
/* if-ge v11, v6, :cond_6 */
/* add-int v12, v2, v10 */
/* if-ge v12, v9, :cond_6 */
/* .line 50 */
v13 = this.a;
v12 = (( e.f.e.o.b ) v13 ).b ( v12, v11 ); // invoke-virtual {v13, v12, v11}, Le/f/e/o/b;->b(II)Z
if ( v12 != null) { // if-eqz v12, :cond_6
/* .line 51 */
/* aget v11, v4, v7 */
/* add-int/2addr v11, v8 */
/* aput v11, v4, v7 */
/* add-int/lit8 v10, v10, 0x1 */
} // :cond_6
/* if-ge v11, v6, :cond_c */
/* add-int v11, v2, v10 */
/* if-lt v11, v9, :cond_7 */
/* goto/16 :goto_6 */
} // :cond_7
} // :goto_4
/* add-int v11, v1, v10 */
int v12 = 3; // const/4 v12, 0x3
/* if-ge v11, v6, :cond_8 */
/* add-int v13, v2, v10 */
/* if-ge v13, v9, :cond_8 */
/* .line 52 */
v14 = this.a;
v13 = (( e.f.e.o.b ) v14 ).b ( v13, v11 ); // invoke-virtual {v14, v13, v11}, Le/f/e/o/b;->b(II)Z
/* if-nez v13, :cond_8 */
/* aget v13, v4, v12 */
/* if-ge v13, v3, :cond_8 */
/* .line 53 */
/* aget v11, v4, v12 */
/* add-int/2addr v11, v8 */
/* aput v11, v4, v12 */
/* add-int/lit8 v10, v10, 0x1 */
} // :cond_8
/* if-ge v11, v6, :cond_c */
/* add-int v11, v2, v10 */
/* if-ge v11, v9, :cond_c */
/* .line 54 */
/* aget v11, v4, v12 */
/* if-lt v11, v3, :cond_9 */
} // :cond_9
} // :goto_5
/* add-int v11, v1, v10 */
int v13 = 4; // const/4 v13, 0x4
/* if-ge v11, v6, :cond_a */
/* add-int v14, v2, v10 */
/* if-ge v14, v9, :cond_a */
/* .line 55 */
v15 = this.a;
v11 = (( e.f.e.o.b ) v15 ).b ( v14, v11 ); // invoke-virtual {v15, v14, v11}, Le/f/e/o/b;->b(II)Z
if ( v11 != null) { // if-eqz v11, :cond_a
/* aget v11, v4, v13 */
/* if-ge v11, v3, :cond_a */
/* .line 56 */
/* aget v11, v4, v13 */
/* add-int/2addr v11, v8 */
/* aput v11, v4, v13 */
/* add-int/lit8 v10, v10, 0x1 */
/* .line 57 */
} // :cond_a
/* aget v1, v4, v13 */
/* if-lt v1, v3, :cond_b */
/* .line 58 */
} // :cond_b
/* aget v1, v4, v5 */
/* aget v2, v4, v8 */
/* add-int/2addr v1, v2 */
/* aget v2, v4, v7 */
/* add-int/2addr v1, v2 */
/* aget v2, v4, v12 */
/* add-int/2addr v1, v2 */
/* aget v2, v4, v13 */
/* add-int/2addr v1, v2 */
/* sub-int v1, v1, p4 */
/* .line 59 */
v1 = java.lang.Math .abs ( v1 );
/* mul-int/lit8 v2, p4, 0x2 */
/* if-ge v1, v2, :cond_c */
/* .line 60 */
v1 = e.f.e.t.c.h .a ( v4 );
if ( v1 != null) { // if-eqz v1, :cond_c
} // :cond_c
} // :goto_6
} // .end method
public final Boolean a ( Integer[] p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* .line 61 */
/* aget v1, p1, v0 */
int v2 = 1; // const/4 v2, 0x1
/* aget v3, p1, v2 */
/* add-int/2addr v1, v3 */
int v3 = 2; // const/4 v3, 0x2
/* aget v4, p1, v3 */
/* add-int/2addr v1, v4 */
int v4 = 3; // const/4 v4, 0x3
/* aget v4, p1, v4 */
/* add-int/2addr v1, v4 */
int v4 = 4; // const/4 v4, 0x4
/* aget v4, p1, v4 */
/* add-int/2addr v1, v4 */
/* .line 62 */
p3 = e.f.e.t.c.h .a ( p1,p3 );
/* float-to-int p3, p3 */
/* .line 63 */
/* aget v4, p1, v3 */
p2 = (( e.f.e.t.c.h ) p0 ).c ( p2, p3, v4, v1 ); // invoke-virtual {p0, p2, p3, v4, v1}, Le/f/e/t/c/h;->c(IIII)F
/* .line 64 */
v4 = java.lang.Float .isNaN ( p2 );
/* if-nez v4, :cond_4 */
/* float-to-int v4, p2 */
/* .line 65 */
/* aget v5, p1, v3 */
p3 = (( e.f.e.t.c.h ) p0 ).b ( p3, v4, v5, v1 ); // invoke-virtual {p0, p3, v4, v5, v1}, Le/f/e/t/c/h;->b(IIII)F
/* .line 66 */
v5 = java.lang.Float .isNaN ( p3 );
/* if-nez v5, :cond_4 */
if ( p4 != null) { // if-eqz p4, :cond_0
/* float-to-int p4, p3 */
/* aget p1, p1, v3 */
/* .line 67 */
p1 = (( e.f.e.t.c.h ) p0 ).a ( v4, p4, p1, v1 ); // invoke-virtual {p0, v4, p4, p1, v1}, Le/f/e/t/c/h;->a(IIII)Z
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_0
/* int-to-float p1, v1 */
/* const/high16 p4, 0x40e00000 # 7.0f */
/* div-float/2addr p1, p4 */
int p4 = 0; // const/4 p4, 0x0
/* .line 68 */
} // :goto_0
v1 = v1 = this.b;
/* if-ge p4, v1, :cond_2 */
/* .line 69 */
v1 = this.b;
/* check-cast v1, Le/f/e/t/c/d; */
/* .line 70 */
v3 = (( e.f.e.t.c.d ) v1 ).a ( p1, p2, p3 ); // invoke-virtual {v1, p1, p2, p3}, Le/f/e/t/c/d;->a(FFF)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 71 */
v0 = this.b;
(( e.f.e.t.c.d ) v1 ).b ( p2, p3, p1 ); // invoke-virtual {v1, p2, p3, p1}, Le/f/e/t/c/d;->b(FFF)Le/f/e/t/c/d;
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* add-int/lit8 p4, p4, 0x1 */
} // :cond_2
} // :goto_1
/* if-nez v0, :cond_3 */
/* .line 72 */
/* new-instance p4, Le/f/e/t/c/d; */
/* invoke-direct {p4, p3, p2, p1}, Le/f/e/t/c/d;-><init>(FFF)V */
/* .line 73 */
p1 = this.b;
/* .line 74 */
p1 = this.e;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 75 */
} // :cond_3
} // :cond_4
} // .end method
public final Float b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 10 */
/* .line 6 */
v0 = this.a;
/* .line 7 */
v1 = (( e.f.e.o.b ) v0 ).f ( ); // invoke-virtual {v0}, Le/f/e/o/b;->f()I
/* .line 8 */
(( e.f.e.t.c.h ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/e/t/c/h;->b()[I
/* move v3, p1 */
} // :goto_0
int v4 = 2; // const/4 v4, 0x2
int v5 = 1; // const/4 v5, 0x1
/* if-ltz v3, :cond_0 */
/* .line 9 */
v6 = (( e.f.e.o.b ) v0 ).b ( v3, p2 ); // invoke-virtual {v0, v3, p2}, Le/f/e/o/b;->b(II)Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 10 */
/* aget v6, v2, v4 */
/* add-int/2addr v6, v5 */
/* aput v6, v2, v4 */
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_0
/* const/high16 v6, 0x7fc00000 # Float.NaN */
/* if-gez v3, :cond_1 */
} // :cond_1
} // :goto_1
/* if-ltz v3, :cond_2 */
/* .line 11 */
v7 = (( e.f.e.o.b ) v0 ).b ( v3, p2 ); // invoke-virtual {v0, v3, p2}, Le/f/e/o/b;->b(II)Z
/* if-nez v7, :cond_2 */
/* aget v7, v2, v5 */
/* if-gt v7, p3, :cond_2 */
/* .line 12 */
/* aget v7, v2, v5 */
/* add-int/2addr v7, v5 */
/* aput v7, v2, v5 */
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_2
/* if-ltz v3, :cond_d */
/* .line 13 */
/* aget v7, v2, v5 */
/* if-le v7, p3, :cond_3 */
/* goto/16 :goto_6 */
} // :cond_3
} // :goto_2
int v7 = 0; // const/4 v7, 0x0
/* if-ltz v3, :cond_4 */
/* .line 14 */
v8 = (( e.f.e.o.b ) v0 ).b ( v3, p2 ); // invoke-virtual {v0, v3, p2}, Le/f/e/o/b;->b(II)Z
if ( v8 != null) { // if-eqz v8, :cond_4
/* aget v8, v2, v7 */
/* if-gt v8, p3, :cond_4 */
/* .line 15 */
/* aget v8, v2, v7 */
/* add-int/2addr v8, v5 */
/* aput v8, v2, v7 */
/* add-int/lit8 v3, v3, -0x1 */
/* .line 16 */
} // :cond_4
/* aget v3, v2, v7 */
/* if-le v3, p3, :cond_5 */
} // :cond_5
/* add-int/2addr p1, v5 */
} // :goto_3
/* if-ge p1, v1, :cond_6 */
/* .line 17 */
v3 = (( e.f.e.o.b ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/e/o/b;->b(II)Z
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 18 */
/* aget v3, v2, v4 */
/* add-int/2addr v3, v5 */
/* aput v3, v2, v4 */
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_6
/* if-ne p1, v1, :cond_7 */
} // :cond_7
} // :goto_4
int v3 = 3; // const/4 v3, 0x3
/* if-ge p1, v1, :cond_8 */
/* .line 19 */
v8 = (( e.f.e.o.b ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/e/o/b;->b(II)Z
/* if-nez v8, :cond_8 */
/* aget v8, v2, v3 */
/* if-ge v8, p3, :cond_8 */
/* .line 20 */
/* aget v8, v2, v3 */
/* add-int/2addr v8, v5 */
/* aput v8, v2, v3 */
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_8
/* if-eq p1, v1, :cond_d */
/* .line 21 */
/* aget v8, v2, v3 */
/* if-lt v8, p3, :cond_9 */
} // :cond_9
} // :goto_5
int v8 = 4; // const/4 v8, 0x4
/* if-ge p1, v1, :cond_a */
/* .line 22 */
v9 = (( e.f.e.o.b ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/e/o/b;->b(II)Z
if ( v9 != null) { // if-eqz v9, :cond_a
/* aget v9, v2, v8 */
/* if-ge v9, p3, :cond_a */
/* .line 23 */
/* aget v9, v2, v8 */
/* add-int/2addr v9, v5 */
/* aput v9, v2, v8 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 24 */
} // :cond_a
/* aget p2, v2, v8 */
/* if-lt p2, p3, :cond_b */
/* .line 25 */
} // :cond_b
/* aget p2, v2, v7 */
/* aget p3, v2, v5 */
/* add-int/2addr p2, p3 */
/* aget p3, v2, v4 */
/* add-int/2addr p2, p3 */
/* aget p3, v2, v3 */
/* add-int/2addr p2, p3 */
/* aget p3, v2, v8 */
/* add-int/2addr p2, p3 */
/* sub-int/2addr p2, p4 */
/* .line 26 */
p2 = java.lang.Math .abs ( p2 );
/* mul-int/lit8 p2, p2, 0x5 */
/* if-lt p2, p4, :cond_c */
/* .line 27 */
} // :cond_c
p2 = e.f.e.t.c.h .a ( v2 );
if ( p2 != null) { // if-eqz p2, :cond_d
p1 = e.f.e.t.c.h .a ( v2,p1 );
} // :cond_d
} // :goto_6
} // .end method
public final b ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
/* aput v1, v0, v1 */
int v2 = 1; // const/4 v2, 0x1
/* .line 2 */
/* aput v1, v0, v2 */
int v2 = 2; // const/4 v2, 0x2
/* .line 3 */
/* aput v1, v0, v2 */
int v2 = 3; // const/4 v2, 0x3
/* .line 4 */
/* aput v1, v0, v2 */
int v2 = 4; // const/4 v2, 0x4
/* .line 5 */
/* aput v1, v0, v2 */
} // .end method
public final Float c ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 10 */
/* .line 1 */
v0 = this.a;
/* .line 2 */
v1 = (( e.f.e.o.b ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/e/o/b;->d()I
/* .line 3 */
(( e.f.e.t.c.h ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/e/t/c/h;->b()[I
/* move v3, p1 */
} // :goto_0
int v4 = 2; // const/4 v4, 0x2
int v5 = 1; // const/4 v5, 0x1
/* if-ltz v3, :cond_0 */
/* .line 4 */
v6 = (( e.f.e.o.b ) v0 ).b ( p2, v3 ); // invoke-virtual {v0, p2, v3}, Le/f/e/o/b;->b(II)Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 5 */
/* aget v6, v2, v4 */
/* add-int/2addr v6, v5 */
/* aput v6, v2, v4 */
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_0
/* const/high16 v6, 0x7fc00000 # Float.NaN */
/* if-gez v3, :cond_1 */
} // :cond_1
} // :goto_1
/* if-ltz v3, :cond_2 */
/* .line 6 */
v7 = (( e.f.e.o.b ) v0 ).b ( p2, v3 ); // invoke-virtual {v0, p2, v3}, Le/f/e/o/b;->b(II)Z
/* if-nez v7, :cond_2 */
/* aget v7, v2, v5 */
/* if-gt v7, p3, :cond_2 */
/* .line 7 */
/* aget v7, v2, v5 */
/* add-int/2addr v7, v5 */
/* aput v7, v2, v5 */
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_2
/* if-ltz v3, :cond_d */
/* .line 8 */
/* aget v7, v2, v5 */
/* if-le v7, p3, :cond_3 */
/* goto/16 :goto_6 */
} // :cond_3
} // :goto_2
int v7 = 0; // const/4 v7, 0x0
/* if-ltz v3, :cond_4 */
/* .line 9 */
v8 = (( e.f.e.o.b ) v0 ).b ( p2, v3 ); // invoke-virtual {v0, p2, v3}, Le/f/e/o/b;->b(II)Z
if ( v8 != null) { // if-eqz v8, :cond_4
/* aget v8, v2, v7 */
/* if-gt v8, p3, :cond_4 */
/* .line 10 */
/* aget v8, v2, v7 */
/* add-int/2addr v8, v5 */
/* aput v8, v2, v7 */
/* add-int/lit8 v3, v3, -0x1 */
/* .line 11 */
} // :cond_4
/* aget v3, v2, v7 */
/* if-le v3, p3, :cond_5 */
} // :cond_5
/* add-int/2addr p1, v5 */
} // :goto_3
/* if-ge p1, v1, :cond_6 */
/* .line 12 */
v3 = (( e.f.e.o.b ) v0 ).b ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Le/f/e/o/b;->b(II)Z
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 13 */
/* aget v3, v2, v4 */
/* add-int/2addr v3, v5 */
/* aput v3, v2, v4 */
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_6
/* if-ne p1, v1, :cond_7 */
} // :cond_7
} // :goto_4
int v3 = 3; // const/4 v3, 0x3
/* if-ge p1, v1, :cond_8 */
/* .line 14 */
v8 = (( e.f.e.o.b ) v0 ).b ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Le/f/e/o/b;->b(II)Z
/* if-nez v8, :cond_8 */
/* aget v8, v2, v3 */
/* if-ge v8, p3, :cond_8 */
/* .line 15 */
/* aget v8, v2, v3 */
/* add-int/2addr v8, v5 */
/* aput v8, v2, v3 */
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_8
/* if-eq p1, v1, :cond_d */
/* .line 16 */
/* aget v8, v2, v3 */
/* if-lt v8, p3, :cond_9 */
} // :cond_9
} // :goto_5
int v8 = 4; // const/4 v8, 0x4
/* if-ge p1, v1, :cond_a */
/* .line 17 */
v9 = (( e.f.e.o.b ) v0 ).b ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Le/f/e/o/b;->b(II)Z
if ( v9 != null) { // if-eqz v9, :cond_a
/* aget v9, v2, v8 */
/* if-ge v9, p3, :cond_a */
/* .line 18 */
/* aget v9, v2, v8 */
/* add-int/2addr v9, v5 */
/* aput v9, v2, v8 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 19 */
} // :cond_a
/* aget p2, v2, v8 */
/* if-lt p2, p3, :cond_b */
/* .line 20 */
} // :cond_b
/* aget p2, v2, v7 */
/* aget p3, v2, v5 */
/* add-int/2addr p2, p3 */
/* aget p3, v2, v4 */
/* add-int/2addr p2, p3 */
/* aget p3, v2, v3 */
/* add-int/2addr p2, p3 */
/* aget p3, v2, v8 */
/* add-int/2addr p2, p3 */
/* sub-int/2addr p2, p4 */
/* .line 21 */
p2 = java.lang.Math .abs ( p2 );
/* mul-int/lit8 p2, p2, 0x5 */
/* mul-int/lit8 p4, p4, 0x2 */
/* if-lt p2, p4, :cond_c */
/* .line 22 */
} // :cond_c
p2 = e.f.e.t.c.h .a ( v2 );
if ( p2 != null) { // if-eqz p2, :cond_d
p1 = e.f.e.t.c.h .a ( v2,p1 );
} // :cond_d
} // :goto_6
} // .end method
public final Boolean c ( ) {
/* .locals 9 */
/* .line 23 */
v0 = v0 = this.b;
/* .line 24 */
v1 = this.b;
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :cond_0
v6 = } // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_1
/* check-cast v6, Le/f/e/t/c/d; */
/* .line 25 */
v7 = (( e.f.e.t.c.d ) v6 ).c ( ); // invoke-virtual {v6}, Le/f/e/t/c/d;->c()I
int v8 = 2; // const/4 v8, 0x2
/* if-lt v7, v8, :cond_0 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 26 */
v6 = (( e.f.e.t.c.d ) v6 ).d ( ); // invoke-virtual {v6}, Le/f/e/t/c/d;->d()F
/* add-float/2addr v5, v6 */
} // :cond_1
int v1 = 3; // const/4 v1, 0x3
/* if-ge v4, v1, :cond_2 */
} // :cond_2
/* int-to-float v0, v0 */
/* div-float v0, v5, v0 */
/* .line 27 */
v1 = this.b;
v4 = } // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_3
/* check-cast v4, Le/f/e/t/c/d; */
/* .line 28 */
v4 = (( e.f.e.t.c.d ) v4 ).d ( ); // invoke-virtual {v4}, Le/f/e/t/c/d;->d()F
/* sub-float/2addr v4, v0 */
v4 = java.lang.Math .abs ( v4 );
/* add-float/2addr v2, v4 */
} // :cond_3
/* const v0, 0x3d4ccccd # 0.05f */
/* mul-float v5, v5, v0 */
/* cmpg-float v0, v2, v5 */
/* if-gtz v0, :cond_4 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_4
} // .end method
public final e.f.e.t.c.d d ( ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = v0 = this.b;
int v1 = 3; // const/4 v1, 0x3
/* if-lt v0, v1, :cond_5 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* if-le v0, v1, :cond_2 */
/* .line 2 */
v6 = this.b;
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
v9 = } // :goto_0
if ( v9 != null) { // if-eqz v9, :cond_0
/* check-cast v9, Le/f/e/t/c/d; */
/* .line 3 */
v9 = (( e.f.e.t.c.d ) v9 ).d ( ); // invoke-virtual {v9}, Le/f/e/t/c/d;->d()F
/* add-float/2addr v7, v9 */
/* mul-float v9, v9, v9 */
/* add-float/2addr v8, v9 */
} // :cond_0
/* int-to-float v0, v0 */
/* div-float/2addr v7, v0 */
/* div-float/2addr v8, v0 */
/* mul-float v0, v7, v7 */
/* sub-float/2addr v8, v0 */
/* float-to-double v8, v8 */
/* .line 4 */
java.lang.Math .sqrt ( v8,v9 );
/* move-result-wide v8 */
/* double-to-float v0, v8 */
/* .line 5 */
v6 = this.b;
/* new-instance v8, Le/f/e/t/c/g; */
/* invoke-direct {v8, v7, v2}, Le/f/e/t/c/g;-><init>(FLe/f/e/t/c/e;)V */
java.util.Collections .sort ( v6,v8 );
/* const v6, 0x3e4ccccd # 0.2f */
/* mul-float v6, v6, v7 */
/* .line 6 */
v0 = java.lang.Math .max ( v6,v0 );
int v6 = 0; // const/4 v6, 0x0
/* .line 7 */
} // :goto_1
v8 = v8 = this.b;
/* if-ge v6, v8, :cond_2 */
v8 = v8 = this.b;
/* if-le v8, v1, :cond_2 */
/* .line 8 */
v8 = this.b;
/* check-cast v8, Le/f/e/t/c/d; */
/* .line 9 */
v8 = (( e.f.e.t.c.d ) v8 ).d ( ); // invoke-virtual {v8}, Le/f/e/t/c/d;->d()F
/* sub-float/2addr v8, v7 */
v8 = java.lang.Math .abs ( v8 );
/* cmpl-float v8, v8, v0 */
/* if-lez v8, :cond_1 */
/* .line 10 */
v8 = this.b;
/* add-int/lit8 v6, v6, -0x1 */
} // :cond_1
/* add-int/2addr v6, v3 */
/* .line 11 */
} // :cond_2
v0 = v0 = this.b;
/* if-le v0, v1, :cond_4 */
/* .line 12 */
v0 = this.b;
v6 = } // :goto_2
if ( v6 != null) { // if-eqz v6, :cond_3
/* check-cast v6, Le/f/e/t/c/d; */
/* .line 13 */
v6 = (( e.f.e.t.c.d ) v6 ).d ( ); // invoke-virtual {v6}, Le/f/e/t/c/d;->d()F
/* add-float/2addr v5, v6 */
/* .line 14 */
} // :cond_3
v0 = v0 = this.b;
/* int-to-float v0, v0 */
/* div-float/2addr v5, v0 */
/* .line 15 */
v0 = this.b;
/* new-instance v6, Le/f/e/t/c/f; */
/* invoke-direct {v6, v5, v2}, Le/f/e/t/c/f;-><init>(FLe/f/e/t/c/e;)V */
java.util.Collections .sort ( v0,v6 );
/* .line 16 */
v2 = v0 = this.b;
} // :cond_4
/* new-array v0, v1, [Le/f/e/t/c/d; */
/* .line 17 */
v1 = this.b;
/* .line 18 */
/* check-cast v1, Le/f/e/t/c/d; */
/* aput-object v1, v0, v4 */
v1 = this.b;
/* .line 19 */
/* check-cast v1, Le/f/e/t/c/d; */
/* aput-object v1, v0, v3 */
v1 = this.b;
int v2 = 2; // const/4 v2, 0x2
/* .line 20 */
/* check-cast v1, Le/f/e/t/c/d; */
/* aput-object v1, v0, v2 */
/* .line 21 */
} // :cond_5
com.google.zxing.NotFoundException .a ( );
/* throw v0 */
} // .end method
