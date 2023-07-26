public abstract class e.f.e.o.h extends e.f.e.b {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final d;
	 /* # instance fields */
	 public b;
	 public final c;
	 /* # direct methods */
	 public static e.f.e.o.h ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [B */
		 /* .line 1 */
		 return;
	 } // .end method
	 public e.f.e.o.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Le/f/e/b;-><init>(Le/f/e/f;)V */
		 /* .line 2 */
		 p1 = e.f.e.o.h.d;
		 this.b = p1;
		 /* const/16 p1, 0x20 */
		 /* new-array p1, p1, [I */
		 /* .line 3 */
		 this.c = p1;
		 return;
	 } // .end method
	 public static Integer a ( Integer[] p0 ) {
		 /* .locals 9 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/zxing/NotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 37 */
	 /* array-length v0, p0 */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 0; // const/4 v2, 0x0
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_2 */
/* .line 38 */
/* aget v6, p0, v2 */
/* if-le v6, v3, :cond_0 */
/* .line 39 */
/* aget v3, p0, v2 */
/* move v5, v2 */
/* .line 40 */
} // :cond_0
/* aget v6, p0, v2 */
/* if-le v6, v4, :cond_1 */
/* .line 41 */
/* aget v4, p0, v2 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-ge v1, v0, :cond_4 */
/* sub-int v6, v1, v5 */
/* .line 42 */
/* aget v7, p0, v1 */
/* mul-int v7, v7, v6 */
/* mul-int v7, v7, v6 */
/* if-le v7, v3, :cond_3 */
/* move v2, v1 */
/* move v3, v7 */
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_4
/* if-le v5, v2, :cond_5 */
} // :cond_5
/* move v8, v5 */
/* move v5, v2 */
/* move v2, v8 */
} // :goto_2
/* sub-int v1, v5, v2 */
/* .line 43 */
/* div-int/lit8 v0, v0, 0x10 */
/* if-le v1, v0, :cond_8 */
/* add-int/lit8 v0, v5, -0x1 */
int v1 = -1; // const/4 v1, -0x1
/* move v1, v0 */
int v3 = -1; // const/4 v3, -0x1
} // :goto_3
/* if-le v0, v2, :cond_7 */
/* sub-int v6, v0, v2 */
/* mul-int v6, v6, v6 */
/* sub-int v7, v5, v0 */
/* mul-int v6, v6, v7 */
/* .line 44 */
/* aget v7, p0, v0 */
/* sub-int v7, v4, v7 */
/* mul-int v6, v6, v7 */
/* if-le v6, v3, :cond_6 */
/* move v1, v0 */
/* move v3, v6 */
} // :cond_6
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_7
/* shl-int/lit8 p0, v1, 0x3 */
/* .line 45 */
} // :cond_8
com.google.zxing.NotFoundException .a ( );
/* throw p0 */
} // .end method
/* # virtual methods */
public e.f.e.o.a a ( Integer p0, Object p1 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.e.b ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/e/b;->c()Le/f/e/f;
/* .line 2 */
v1 = (( e.f.e.f ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/e/f;->c()I
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 3 */
v2 = (( e.f.e.o.a ) p2 ).d ( ); // invoke-virtual {p2}, Le/f/e/o/a;->d()I
/* if-ge v2, v1, :cond_0 */
/* .line 4 */
} // :cond_0
(( e.f.e.o.a ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/e/o/a;->a()V
/* .line 5 */
} // :cond_1
} // :goto_0
/* new-instance p2, Le/f/e/o/a; */
/* invoke-direct {p2, v1}, Le/f/e/o/a;-><init>(I)V */
/* .line 6 */
} // :goto_1
(( e.f.e.o.h ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/e/o/h;->a(I)V
/* .line 7 */
v2 = this.b;
(( e.f.e.f ) v0 ).a ( p1, v2 ); // invoke-virtual {v0, p1, v2}, Le/f/e/f;->a(I[B)[B
/* .line 8 */
v0 = this.c;
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
int v4 = 3; // const/4 v4, 0x3
int v5 = 1; // const/4 v5, 0x1
/* if-ge v3, v1, :cond_2 */
/* .line 9 */
/* aget-byte v6, p1, v3 */
/* and-int/lit16 v6, v6, 0xff */
/* shr-int/lit8 v4, v6, 0x3 */
/* aget v6, v0, v4 */
/* add-int/2addr v6, v5 */
/* aput v6, v0, v4 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 10 */
} // :cond_2
v0 = e.f.e.o.h .a ( v0 );
/* if-ge v1, v4, :cond_4 */
} // :goto_3
/* if-ge v2, v1, :cond_6 */
/* .line 11 */
/* aget-byte v3, p1, v2 */
/* and-int/lit16 v3, v3, 0xff */
/* if-ge v3, v0, :cond_3 */
/* .line 12 */
(( e.f.e.o.a ) p2 ).d ( v2 ); // invoke-virtual {p2, v2}, Le/f/e/o/a;->d(I)V
} // :cond_3
/* add-int/lit8 v2, v2, 0x1 */
/* .line 13 */
} // :cond_4
/* aget-byte v2, p1, v2 */
/* and-int/lit16 v2, v2, 0xff */
/* .line 14 */
/* aget-byte v3, p1, v5 */
/* and-int/lit16 v3, v3, 0xff */
int v4 = 1; // const/4 v4, 0x1
/* move v9, v3 */
/* move v3, v2 */
/* move v2, v9 */
} // :goto_4
/* add-int/lit8 v6, v1, -0x1 */
/* if-ge v4, v6, :cond_6 */
/* add-int/lit8 v6, v4, 0x1 */
/* .line 15 */
/* aget-byte v7, p1, v6 */
/* and-int/lit16 v7, v7, 0xff */
/* shl-int/lit8 v8, v2, 0x2 */
/* sub-int/2addr v8, v3 */
/* sub-int/2addr v8, v7 */
/* .line 16 */
/* div-int/lit8 v8, v8, 0x2 */
/* if-ge v8, v0, :cond_5 */
/* .line 17 */
(( e.f.e.o.a ) p2 ).d ( v4 ); // invoke-virtual {p2, v4}, Le/f/e/o/a;->d(I)V
} // :cond_5
/* move v3, v2 */
/* move v4, v6 */
/* move v2, v7 */
} // :cond_6
} // .end method
public e.f.e.o.b a ( ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
/* .line 18 */
(( e.f.e.b ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/e/b;->c()Le/f/e/f;
/* .line 19 */
v1 = (( e.f.e.f ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/e/f;->c()I
/* .line 20 */
v2 = (( e.f.e.f ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/e/f;->a()I
/* .line 21 */
/* new-instance v3, Le/f/e/o/b; */
/* invoke-direct {v3, v1, v2}, Le/f/e/o/b;-><init>(II)V */
/* .line 22 */
(( e.f.e.o.h ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/e/o/h;->a(I)V
/* .line 23 */
v4 = this.c;
int v5 = 1; // const/4 v5, 0x1
int v6 = 1; // const/4 v6, 0x1
} // :goto_0
int v7 = 5; // const/4 v7, 0x5
/* if-ge v6, v7, :cond_1 */
/* mul-int v8, v2, v6 */
/* .line 24 */
/* div-int/2addr v8, v7 */
/* .line 25 */
v9 = this.b;
(( e.f.e.f ) v0 ).a ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Le/f/e/f;->a(I[B)[B
/* shl-int/lit8 v9, v1, 0x2 */
/* .line 26 */
/* div-int/2addr v9, v7 */
/* .line 27 */
/* div-int/lit8 v7, v1, 0x5 */
} // :goto_1
/* if-ge v7, v9, :cond_0 */
/* .line 28 */
/* aget-byte v10, v8, v7 */
/* and-int/lit16 v10, v10, 0xff */
/* shr-int/lit8 v10, v10, 0x3 */
/* .line 29 */
/* aget v11, v4, v10 */
/* add-int/2addr v11, v5 */
/* aput v11, v4, v10 */
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_0
/* add-int/lit8 v6, v6, 0x1 */
/* .line 30 */
} // :cond_1
v4 = e.f.e.o.h .a ( v4 );
/* .line 31 */
(( e.f.e.f ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/e/f;->b()[B
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
} // :goto_2
/* if-ge v6, v2, :cond_4 */
/* mul-int v7, v6, v1 */
int v8 = 0; // const/4 v8, 0x0
} // :goto_3
/* if-ge v8, v1, :cond_3 */
/* add-int v9, v7, v8 */
/* .line 32 */
/* aget-byte v9, v0, v9 */
/* and-int/lit16 v9, v9, 0xff */
/* if-ge v9, v4, :cond_2 */
/* .line 33 */
(( e.f.e.o.b ) v3 ).c ( v8, v6 ); // invoke-virtual {v3, v8, v6}, Le/f/e/o/b;->c(II)V
} // :cond_2
/* add-int/lit8 v8, v8, 0x1 */
} // :cond_3
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_4
} // .end method
public final void a ( Integer p0 ) {
/* .locals 2 */
/* .line 34 */
v0 = this.b;
/* array-length v0, v0 */
/* if-ge v0, p1, :cond_0 */
/* .line 35 */
/* new-array p1, p1, [B */
this.b = p1;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* const/16 v1, 0x20 */
/* if-ge v0, v1, :cond_1 */
/* .line 36 */
v1 = this.c;
/* aput p1, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
