public class c.h.f.i.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Float a;
	 public final Float b;
	 public final Float c;
	 public final Float d;
	 public final Float e;
	 public final Float f;
	 /* # direct methods */
	 public c.h.f.i.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Lc/h/f/i/a;->a:F */
		 /* .line 3 */
		 /* iput p2, p0, Lc/h/f/i/a;->b:F */
		 /* .line 4 */
		 /* iput p3, p0, Lc/h/f/i/a;->c:F */
		 /* .line 5 */
		 /* iput p7, p0, Lc/h/f/i/a;->d:F */
		 /* .line 6 */
		 /* iput p8, p0, Lc/h/f/i/a;->e:F */
		 /* .line 7 */
		 /* iput p9, p0, Lc/h/f/i/a;->f:F */
		 return;
	 } // .end method
	 public static c.h.f.i.a a ( Float p0, Float p1, Float p2 ) {
		 /* .locals 12 */
		 /* const/high16 v0, 0x447a0000 # 1000.0f */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/high16 v2, 0x42c80000 # 100.0f */
		 int v3 = 0; // const/4 v3, 0x0
		 /* move-object v4, v3 */
		 /* const/high16 v2, 0x447a0000 # 1000.0f */
		 /* const/high16 v3, 0x42c80000 # 100.0f */
		 int v5 = 0; // const/4 v5, 0x0
	 } // :goto_0
	 /* sub-float v6, v5, v3 */
	 /* .line 85 */
	 v6 = 	 java.lang.Math .abs ( v6 );
	 /* const v7, 0x3c23d70a # 0.01f */
	 /* cmpl-float v6, v6, v7 */
	 /* if-lez v6, :cond_3 */
	 /* sub-float v6, v3, v5 */
	 /* const/high16 v7, 0x40000000 # 2.0f */
	 /* div-float/2addr v6, v7 */
	 /* add-float/2addr v6, v5 */
	 /* .line 86 */
	 c.h.f.i.a .b ( v6,p1,p0 );
	 /* .line 87 */
	 v7 = 	 (( c.h.f.i.a ) v7 ).g ( ); // invoke-virtual {v7}, Lc/h/f/i/a;->g()I
	 /* .line 88 */
	 v8 = 	 c.h.f.i.b .a ( v7 );
	 /* sub-float v9, p2, v8 */
	 /* .line 89 */
	 v9 = 	 java.lang.Math .abs ( v9 );
	 /* const v10, 0x3e4ccccd # 0.2f */
	 /* cmpg-float v10, v9, v10 */
	 /* if-gez v10, :cond_0 */
	 /* .line 90 */
	 c.h.f.i.a .a ( v7 );
	 /* .line 91 */
	 v10 = 	 (( c.h.f.i.a ) v7 ).e ( ); // invoke-virtual {v7}, Lc/h/f/i/a;->e()F
	 v11 = 	 (( c.h.f.i.a ) v7 ).c ( ); // invoke-virtual {v7}, Lc/h/f/i/a;->c()F
	 c.h.f.i.a .b ( v10,v11,p0 );
	 /* .line 92 */
	 v10 = 	 (( c.h.f.i.a ) v7 ).a ( v10 ); // invoke-virtual {v7, v10}, Lc/h/f/i/a;->a(Lc/h/f/i/a;)F
	 /* const/high16 v11, 0x3f800000 # 1.0f */
	 /* cmpg-float v11, v10, v11 */
	 /* if-gtz v11, :cond_0 */
	 /* move-object v4, v7 */
	 /* move v0, v9 */
	 /* move v2, v10 */
} // :cond_0
/* cmpl-float v7, v0, v1 */
/* if-nez v7, :cond_1 */
/* cmpl-float v7, v2, v1 */
/* if-nez v7, :cond_1 */
} // :cond_1
/* cmpg-float v7, v8, p2 */
/* if-gez v7, :cond_2 */
/* move v5, v6 */
} // :cond_2
/* move v3, v6 */
} // :cond_3
} // :goto_1
} // .end method
public static c.h.f.i.a a ( Float p0, Float p1, Float p2, Object p3 ) {
/* .locals 13 */
/* move v3, p0 */
/* .line 40 */
v0 = /* invoke-virtual/range {p3 ..p3}, Lc/h/f/i/u;->b()F */
/* const/high16 v1, 0x40800000 # 4.0f */
/* div-float v0, v1, v0 */
/* float-to-double v4, v3 */
/* const-wide/high16 v6, 0x4059000000000000L # 100.0 */
/* div-double/2addr v4, v6 */
/* .line 41 */
java.lang.Math .sqrt ( v4,v5 );
/* move-result-wide v6 */
/* double-to-float v2, v6 */
/* mul-float v0, v0, v2 */
/* .line 42 */
v2 = /* invoke-virtual/range {p3 ..p3}, Lc/h/f/i/u;->a()F */
/* add-float/2addr v2, v1 */
/* mul-float v0, v0, v2 */
/* .line 43 */
v2 = /* invoke-virtual/range {p3 ..p3}, Lc/h/f/i/u;->d()F */
/* mul-float v6, v0, v2 */
/* .line 44 */
v0 = /* invoke-virtual/range {p3 ..p3}, Lc/h/f/i/u;->d()F */
/* mul-float v7, p1, v0 */
/* .line 45 */
java.lang.Math .sqrt ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v0, v4 */
/* div-float v0, p1, v0 */
/* .line 46 */
v2 = /* invoke-virtual/range {p3 ..p3}, Lc/h/f/i/u;->b()F */
/* mul-float v0, v0, v2 */
/* .line 47 */
v2 = /* invoke-virtual/range {p3 ..p3}, Lc/h/f/i/u;->a()F */
/* add-float/2addr v2, v1 */
/* div-float/2addr v0, v2 */
/* float-to-double v0, v0 */
/* .line 48 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* const/high16 v1, 0x42480000 # 50.0f */
/* mul-float v8, v0, v1 */
/* const v0, 0x40490fdb # (float)Math.PI */
/* mul-float v0, v0, p2 */
/* const/high16 v1, 0x43340000 # 180.0f */
/* div-float/2addr v0, v1 */
/* const v1, 0x3fd9999a # 1.7f */
/* mul-float v1, v1, v3 */
/* const v2, 0x3be56042 # 0.007f */
/* mul-float v2, v2, v3 */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* add-float/2addr v2, v4 */
/* div-float v9, v1, v2 */
/* float-to-double v1, v7 */
/* const-wide v4, 0x3f9758e219652bd4L # 0.0228 */
/* mul-double v1, v1, v4 */
/* const-wide/high16 v4, 0x3ff0000000000000L # 1.0 */
/* add-double/2addr v1, v4 */
/* .line 49 */
java.lang.Math .log ( v1,v2 );
/* move-result-wide v1 */
/* double-to-float v1, v1 */
/* const v2, 0x422f7048 */
/* mul-float v1, v1, v2 */
/* float-to-double v4, v0 */
/* .line 50 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v10 */
/* double-to-float v0, v10 */
/* mul-float v10, v1, v0 */
/* .line 51 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v0, v4 */
/* mul-float v11, v1, v0 */
/* .line 52 */
/* new-instance v12, Lc/h/f/i/a; */
/* move-object v0, v12 */
/* move v1, p2 */
/* move v2, p1 */
/* move v4, v6 */
/* move v5, v7 */
/* move v6, v8 */
/* move v7, v9 */
/* move v8, v10 */
/* move v9, v11 */
/* invoke-direct/range {v0 ..v9}, Lc/h/f/i/a;-><init>(FFFFFFFFF)V */
} // .end method
public static c.h.f.i.a a ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = c.h.f.i.u.k;
c.h.f.i.a .a ( p0,v0 );
} // .end method
public static c.h.f.i.a a ( Integer p0, Object p1 ) {
/* .locals 23 */
/* .line 3 */
/* invoke-static/range {p0 ..p0}, Lc/h/f/i/b;->c(I)[F */
/* .line 4 */
v1 = c.h.f.i.b.a;
int v2 = 0; // const/4 v2, 0x0
/* .line 5 */
/* aget v3, v0, v2 */
/* aget-object v4, v1, v2 */
/* aget v4, v4, v2 */
/* mul-float v3, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
/* aget v5, v0, v4 */
/* aget-object v6, v1, v2 */
/* aget v6, v6, v4 */
/* mul-float v5, v5, v6 */
/* add-float/2addr v3, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v6, v0, v5 */
/* aget-object v7, v1, v2 */
/* aget v7, v7, v5 */
/* mul-float v6, v6, v7 */
/* add-float/2addr v3, v6 */
/* .line 6 */
/* aget v6, v0, v2 */
/* aget-object v7, v1, v4 */
/* aget v7, v7, v2 */
/* mul-float v6, v6, v7 */
/* aget v7, v0, v4 */
/* aget-object v8, v1, v4 */
/* aget v8, v8, v4 */
/* mul-float v7, v7, v8 */
/* add-float/2addr v6, v7 */
/* aget v7, v0, v5 */
/* aget-object v8, v1, v4 */
/* aget v8, v8, v5 */
/* mul-float v7, v7, v8 */
/* add-float/2addr v6, v7 */
/* .line 7 */
/* aget v7, v0, v2 */
/* aget-object v8, v1, v5 */
/* aget v8, v8, v2 */
/* mul-float v7, v7, v8 */
/* aget v8, v0, v4 */
/* aget-object v9, v1, v5 */
/* aget v9, v9, v4 */
/* mul-float v8, v8, v9 */
/* add-float/2addr v7, v8 */
/* aget v0, v0, v5 */
/* aget-object v1, v1, v5 */
/* aget v1, v1, v5 */
/* mul-float v0, v0, v1 */
/* add-float/2addr v7, v0 */
/* .line 8 */
/* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->i()[F */
/* aget v0, v0, v2 */
/* mul-float v0, v0, v3 */
/* .line 9 */
/* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->i()[F */
/* aget v1, v1, v4 */
/* mul-float v1, v1, v6 */
/* .line 10 */
/* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->i()[F */
/* aget v2, v2, v5 */
/* mul-float v2, v2, v7 */
/* .line 11 */
v3 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->c()F */
v4 = java.lang.Math .abs ( v0 );
/* mul-float v3, v3, v4 */
/* float-to-double v3, v3 */
/* const-wide/high16 v5, 0x4059000000000000L # 100.0 */
/* div-double/2addr v3, v5 */
/* const-wide v7, 0x3fdae147ae147ae1L # 0.42 */
java.lang.Math .pow ( v3,v4,v7,v8 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* .line 12 */
v4 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->c()F */
v9 = java.lang.Math .abs ( v1 );
/* mul-float v4, v4, v9 */
/* float-to-double v9, v4 */
/* div-double/2addr v9, v5 */
java.lang.Math .pow ( v9,v10,v7,v8 );
/* move-result-wide v9 */
/* double-to-float v4, v9 */
/* .line 13 */
v9 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->c()F */
v10 = java.lang.Math .abs ( v2 );
/* mul-float v9, v9, v10 */
/* float-to-double v9, v9 */
/* div-double/2addr v9, v5 */
java.lang.Math .pow ( v9,v10,v7,v8 );
/* move-result-wide v7 */
/* double-to-float v7, v7 */
/* .line 14 */
v0 = java.lang.Math .signum ( v0 );
/* const/high16 v8, 0x43c80000 # 400.0f */
/* mul-float v0, v0, v8 */
/* mul-float v0, v0, v3 */
/* const v9, 0x41d90a3d # 27.13f */
/* add-float/2addr v3, v9 */
/* div-float/2addr v0, v3 */
/* .line 15 */
v1 = java.lang.Math .signum ( v1 );
/* mul-float v1, v1, v8 */
/* mul-float v1, v1, v4 */
/* add-float/2addr v4, v9 */
/* div-float/2addr v1, v4 */
/* .line 16 */
v2 = java.lang.Math .signum ( v2 );
/* mul-float v2, v2, v8 */
/* mul-float v2, v2, v7 */
/* add-float/2addr v7, v9 */
/* div-float/2addr v2, v7 */
/* float-to-double v3, v0 */
/* const-wide/high16 v7, 0x4026000000000000L # 11.0 */
/* mul-double v3, v3, v7 */
/* float-to-double v7, v1 */
/* const-wide/high16 v9, -0x3fd8000000000000L # -12.0 */
/* mul-double v7, v7, v9 */
/* add-double/2addr v3, v7 */
/* float-to-double v7, v2 */
/* add-double/2addr v3, v7 */
/* double-to-float v3, v3 */
/* const/high16 v4, 0x41300000 # 11.0f */
/* div-float/2addr v3, v4 */
/* add-float v4, v0, v1 */
/* float-to-double v9, v4 */
/* const-wide/high16 v11, 0x4000000000000000L # 2.0 */
/* mul-double v7, v7, v11 */
/* sub-double/2addr v9, v7 */
/* double-to-float v4, v9 */
/* const/high16 v7, 0x41100000 # 9.0f */
/* div-float/2addr v4, v7 */
/* const/high16 v7, 0x41a00000 # 20.0f */
/* mul-float v8, v0, v7 */
/* mul-float v1, v1, v7 */
/* add-float/2addr v8, v1 */
/* const/high16 v9, 0x41a80000 # 21.0f */
/* mul-float v9, v9, v2 */
/* add-float/2addr v8, v9 */
/* div-float/2addr v8, v7 */
/* const/high16 v9, 0x42200000 # 40.0f */
/* mul-float v0, v0, v9 */
/* add-float/2addr v0, v1 */
/* add-float/2addr v0, v2 */
/* div-float/2addr v0, v7 */
/* float-to-double v1, v4 */
/* float-to-double v9, v3 */
/* .line 17 */
java.lang.Math .atan2 ( v1,v2,v9,v10 );
/* move-result-wide v1 */
/* double-to-float v1, v1 */
/* const/high16 v2, 0x43340000 # 180.0f */
/* mul-float v1, v1, v2 */
/* const v7, 0x40490fdb # (float)Math.PI */
/* div-float/2addr v1, v7 */
/* const/high16 v9, 0x43b40000 # 360.0f */
int v10 = 0; // const/4 v10, 0x0
/* cmpg-float v10, v1, v10 */
/* if-gez v10, :cond_1 */
/* add-float/2addr v1, v9 */
} // :cond_0
} // :goto_0
/* move v14, v1 */
} // :cond_1
/* cmpl-float v10, v1, v9 */
/* if-ltz v10, :cond_0 */
/* sub-float/2addr v1, v9 */
} // :goto_1
/* mul-float v7, v7, v14 */
/* div-float/2addr v7, v2 */
/* .line 18 */
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->f()F */
/* mul-float v0, v0, v1 */
/* .line 19 */
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->a()F */
/* div-float/2addr v0, v1 */
/* float-to-double v0, v0 */
/* .line 20 */
v2 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->b()F */
v10 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->j()F */
/* mul-float v2, v2, v10 */
/* float-to-double v5, v2 */
/* .line 21 */
java.lang.Math .pow ( v0,v1,v5,v6 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* const/high16 v1, 0x42c80000 # 100.0f */
/* mul-float v0, v0, v1 */
/* .line 22 */
v2 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->b()F */
/* const/high16 v5, 0x40800000 # 4.0f */
/* div-float v2, v5, v2 */
/* div-float v1, v0, v1 */
/* float-to-double v11, v1 */
/* .line 23 */
java.lang.Math .sqrt ( v11,v12 );
/* move-result-wide v10 */
/* double-to-float v1, v10 */
/* mul-float v2, v2, v1 */
/* .line 24 */
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->a()F */
/* add-float/2addr v1, v5 */
/* mul-float v2, v2, v1 */
/* .line 25 */
v1 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->d()F */
/* mul-float v1, v1, v2 */
/* float-to-double v10, v14 */
/* const-wide v12, 0x403423d70a3d70a4L # 20.14 */
/* cmpg-double v2, v10, v12 */
/* if-gez v2, :cond_2 */
/* add-float/2addr v9, v14 */
} // :cond_2
/* move v9, v14 */
} // :goto_2
/* const/high16 v2, 0x3e800000 # 0.25f */
/* float-to-double v9, v9 */
/* const-wide v11, 0x400921fb54442d18L # Math.PI */
/* mul-double v9, v9, v11 */
/* const-wide v11, 0x4066800000000000L # 180.0 */
/* div-double/2addr v9, v11 */
/* const-wide/high16 v11, 0x4000000000000000L # 2.0 */
/* add-double/2addr v9, v11 */
/* .line 26 */
java.lang.Math .cos ( v9,v10 );
/* move-result-wide v9 */
/* const-wide v11, 0x400e666666666666L # 3.8 */
/* add-double/2addr v9, v11 */
/* double-to-float v6, v9 */
/* mul-float v6, v6, v2 */
/* const v2, 0x45706276 */
/* mul-float v6, v6, v2 */
/* .line 27 */
v2 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->g()F */
/* mul-float v6, v6, v2 */
v2 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->h()F */
/* mul-float v6, v6, v2 */
/* mul-float v3, v3, v3 */
/* mul-float v4, v4, v4 */
/* add-float/2addr v3, v4 */
/* float-to-double v2, v3 */
/* .line 28 */
java.lang.Math .sqrt ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* mul-float v6, v6, v2 */
/* const v2, 0x3e9c28f6 # 0.305f */
/* add-float/2addr v8, v2 */
/* div-float/2addr v6, v8 */
/* const-wide v2, 0x3ffa3d70a3d70a3dL # 1.64 */
/* const-wide v8, 0x3fd28f5c28f5c28fL # 0.29 */
/* .line 29 */
v4 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->e()F */
/* float-to-double v10, v4 */
java.lang.Math .pow ( v8,v9,v10,v11 );
/* move-result-wide v8 */
/* sub-double/2addr v2, v8 */
/* const-wide v8, 0x3fe75c28f5c28f5cL # 0.73 */
java.lang.Math .pow ( v2,v3,v8,v9 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* float-to-double v3, v6 */
/* const-wide v8, 0x3feccccccccccccdL # 0.9 */
/* .line 30 */
java.lang.Math .pow ( v3,v4,v8,v9 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* mul-float v2, v2, v3 */
/* float-to-double v3, v0 */
/* const-wide/high16 v8, 0x4059000000000000L # 100.0 */
/* div-double/2addr v3, v8 */
/* .line 31 */
java.lang.Math .sqrt ( v3,v4 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* mul-float v15, v2, v3 */
/* .line 32 */
v3 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->d()F */
/* mul-float v18, v15, v3 */
/* const/high16 v3, 0x42480000 # 50.0f */
/* .line 33 */
v4 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->b()F */
/* mul-float v2, v2, v4 */
/* .line 34 */
v4 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->a()F */
/* add-float/2addr v4, v5 */
/* div-float/2addr v2, v4 */
/* float-to-double v4, v2 */
/* .line 35 */
java.lang.Math .sqrt ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v2, v4 */
/* mul-float v19, v2, v3 */
/* const v2, 0x3fd9999a # 1.7f */
/* mul-float v2, v2, v0 */
/* const v3, 0x3be56042 # 0.007f */
/* mul-float v3, v3, v0 */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* add-float/2addr v3, v4 */
/* div-float v20, v2, v3 */
/* const v2, 0x422f7048 */
/* const v3, 0x3cbac711 # 0.0228f */
/* mul-float v3, v3, v18 */
/* add-float/2addr v3, v4 */
/* float-to-double v3, v3 */
/* .line 36 */
java.lang.Math .log ( v3,v4 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* mul-float v3, v3, v2 */
/* float-to-double v4, v7 */
/* .line 37 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v6 */
/* double-to-float v2, v6 */
/* mul-float v21, v3, v2 */
/* .line 38 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v2, v4 */
/* mul-float v22, v3, v2 */
/* .line 39 */
/* new-instance v2, Lc/h/f/i/a; */
/* move-object v13, v2 */
/* move/from16 v16, v0 */
/* move/from16 v17, v1 */
/* invoke-direct/range {v13 ..v22}, Lc/h/f/i/a;-><init>(FFFFFFFFF)V */
} // .end method
public static Integer b ( Float p0, Float p1, Float p2, Object p3 ) {
/* .locals 6 */
/* float-to-double v0, p1 */
/* const-wide/high16 v2, 0x3ff0000000000000L # 1.0 */
/* cmpg-double v4, v0, v2 */
/* if-ltz v4, :cond_7 */
/* .line 3 */
v0 = java.lang.Math .round ( p2 );
/* int-to-double v0, v0 */
/* const-wide/16 v2, 0x0 */
/* cmpg-double v4, v0, v2 */
/* if-lez v4, :cond_7 */
v0 = java.lang.Math .round ( p2 );
/* int-to-double v0, v0 */
/* const-wide/high16 v2, 0x4059000000000000L # 100.0 */
/* cmpl-double v4, v0, v2 */
/* if-ltz v4, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* cmpg-float v1, p0, v0 */
/* if-gez v1, :cond_1 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
/* const/high16 v1, 0x43b40000 # 360.0f */
/* .line 4 */
p0 = java.lang.Math .min ( v1,p0 );
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* move v0, p1 */
/* move-object v3, v2 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
} // :goto_1
/* sub-float v4, v1, p1 */
/* .line 5 */
v4 = java.lang.Math .abs ( v4 );
/* const v5, 0x3ecccccd # 0.4f */
/* cmpl-float v4, v4, v5 */
/* if-ltz v4, :cond_5 */
/* .line 6 */
c.h.f.i.a .a ( p0,v0,p2 );
/* const/high16 v5, 0x40000000 # 2.0f */
if ( v2 != null) { // if-eqz v2, :cond_3
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 7 */
p0 = (( c.h.f.i.a ) v4 ).a ( p3 ); // invoke-virtual {v4, p3}, Lc/h/f/i/a;->a(Lc/h/f/i/u;)I
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :goto_2
/* sub-float v0, p1, v1 */
/* div-float/2addr v0, v5 */
/* add-float/2addr v0, v1 */
} // :cond_3
/* if-nez v4, :cond_4 */
/* move p1, v0 */
} // :cond_4
/* move v1, v0 */
/* move-object v3, v4 */
} // :cond_5
/* if-nez v3, :cond_6 */
/* .line 8 */
p0 = c.h.f.i.b .a ( p2 );
/* .line 9 */
} // :cond_6
p0 = (( c.h.f.i.a ) v3 ).a ( p3 ); // invoke-virtual {v3, p3}, Lc/h/f/i/a;->a(Lc/h/f/i/u;)I
/* .line 10 */
} // :cond_7
} // :goto_3
p0 = c.h.f.i.b .a ( p2 );
} // .end method
public static c.h.f.i.a b ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .line 2 */
v0 = c.h.f.i.u.k;
c.h.f.i.a .a ( p0,p1,p2,v0 );
} // .end method
public static Integer c ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .line 2 */
v0 = c.h.f.i.u.k;
p0 = c.h.f.i.a .b ( p0,p1,p2,v0 );
} // .end method
/* # virtual methods */
public Float a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/h/f/i/a;->e:F */
} // .end method
public Float a ( Object p0 ) {
/* .locals 4 */
/* .line 53 */
v0 = (( c.h.f.i.a ) p0 ).f ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->f()F
v1 = (( c.h.f.i.a ) p1 ).f ( ); // invoke-virtual {p1}, Lc/h/f/i/a;->f()F
/* sub-float/2addr v0, v1 */
/* .line 54 */
v1 = (( c.h.f.i.a ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->a()F
v2 = (( c.h.f.i.a ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/f/i/a;->a()F
/* sub-float/2addr v1, v2 */
/* .line 55 */
v2 = (( c.h.f.i.a ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->b()F
p1 = (( c.h.f.i.a ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/f/i/a;->b()F
/* sub-float/2addr v2, p1 */
/* mul-float v0, v0, v0 */
/* mul-float v1, v1, v1 */
/* add-float/2addr v0, v1 */
/* mul-float v2, v2, v2 */
/* add-float/2addr v0, v2 */
/* float-to-double v0, v0 */
/* .line 56 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* const-wide v2, 0x3fe428f5c28f5c29L # 0.63 */
/* .line 57 */
java.lang.Math .pow ( v0,v1,v2,v3 );
/* move-result-wide v0 */
/* const-wide v2, 0x3ff68f5c28f5c28fL # 1.41 */
/* mul-double v0, v0, v2 */
/* double-to-float p1, v0 */
} // .end method
public Integer a ( Object p0 ) {
/* .locals 15 */
/* .line 58 */
v0 = (( c.h.f.i.a ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->c()F
/* float-to-double v0, v0 */
/* const-wide/high16 v2, 0x4059000000000000L # 100.0 */
/* const-wide/16 v4, 0x0 */
/* cmpl-double v6, v0, v4 */
if ( v6 != null) { // if-eqz v6, :cond_1
v0 = (( c.h.f.i.a ) p0 ).e ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->e()F
/* float-to-double v0, v0 */
/* cmpl-double v6, v0, v4 */
/* if-nez v6, :cond_0 */
/* .line 59 */
} // :cond_0
v0 = (( c.h.f.i.a ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->c()F
v1 = (( c.h.f.i.a ) p0 ).e ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->e()F
/* float-to-double v6, v1 */
/* div-double/2addr v6, v2 */
java.lang.Math .sqrt ( v6,v7 );
/* move-result-wide v6 */
/* double-to-float v1, v6 */
/* div-float/2addr v0, v1 */
} // :cond_1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* float-to-double v0, v0 */
/* const-wide v6, 0x3ffa3d70a3d70a3dL # 1.64 */
/* const-wide v8, 0x3fd28f5c28f5c28fL # 0.29 */
/* .line 60 */
v10 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->e()F */
/* float-to-double v10, v10 */
java.lang.Math .pow ( v8,v9,v10,v11 );
/* move-result-wide v8 */
/* sub-double/2addr v6, v8 */
/* const-wide v8, 0x3fe75c28f5c28f5cL # 0.73 */
/* .line 61 */
java.lang.Math .pow ( v6,v7,v8,v9 );
/* move-result-wide v6 */
/* div-double/2addr v0, v6 */
/* const-wide v6, 0x3ff1c71c71c71c72L # 1.1111111111111112 */
java.lang.Math .pow ( v0,v1,v6,v7 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* .line 62 */
v1 = (( c.h.f.i.a ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->d()F
/* const v6, 0x40490fdb # (float)Math.PI */
/* mul-float v1, v1, v6 */
/* const/high16 v6, 0x43340000 # 180.0f */
/* div-float/2addr v1, v6 */
/* const/high16 v6, 0x3e800000 # 0.25f */
/* float-to-double v7, v1 */
/* const-wide/high16 v9, 0x4000000000000000L # 2.0 */
/* add-double/2addr v9, v7 */
/* .line 63 */
java.lang.Math .cos ( v9,v10 );
/* move-result-wide v9 */
/* const-wide v11, 0x400e666666666666L # 3.8 */
/* add-double/2addr v9, v11 */
/* double-to-float v1, v9 */
/* mul-float v1, v1, v6 */
/* .line 64 */
v6 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->a()F */
v9 = (( c.h.f.i.a ) p0 ).e ( ); // invoke-virtual {p0}, Lc/h/f/i/a;->e()F
/* float-to-double v9, v9 */
/* div-double/2addr v9, v2 */
/* const-wide/high16 v2, 0x3ff0000000000000L # 1.0 */
/* .line 65 */
v11 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->b()F */
/* float-to-double v11, v11 */
/* div-double/2addr v2, v11 */
v11 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->j()F */
/* float-to-double v11, v11 */
/* div-double/2addr v2, v11 */
/* .line 66 */
java.lang.Math .pow ( v9,v10,v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* mul-float v6, v6, v2 */
/* const v2, 0x45706276 */
/* mul-float v1, v1, v2 */
/* .line 67 */
v2 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->g()F */
/* mul-float v1, v1, v2 */
v2 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->h()F */
/* mul-float v1, v1, v2 */
/* .line 68 */
v2 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->f()F */
/* div-float/2addr v6, v2 */
/* .line 69 */
java.lang.Math .sin ( v7,v8 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* .line 70 */
java.lang.Math .cos ( v7,v8 );
/* move-result-wide v7 */
/* double-to-float v3, v7 */
/* const v7, 0x3e9c28f6 # 0.305f */
/* add-float/2addr v7, v6 */
/* const/high16 v8, 0x41b80000 # 23.0f */
/* mul-float v7, v7, v8 */
/* mul-float v7, v7, v0 */
/* mul-float v1, v1, v8 */
/* const/high16 v8, 0x41300000 # 11.0f */
/* mul-float v8, v8, v0 */
/* mul-float v8, v8, v3 */
/* add-float/2addr v1, v8 */
/* const/high16 v8, 0x42d80000 # 108.0f */
/* mul-float v0, v0, v8 */
/* mul-float v0, v0, v2 */
/* add-float/2addr v1, v0 */
/* div-float/2addr v7, v1 */
/* mul-float v3, v3, v7 */
/* mul-float v7, v7, v2 */
/* const/high16 v0, 0x43e60000 # 460.0f */
/* mul-float v6, v6, v0 */
/* const v0, 0x43e18000 # 451.0f */
/* mul-float v0, v0, v3 */
/* add-float/2addr v0, v6 */
/* const/high16 v1, 0x43900000 # 288.0f */
/* mul-float v1, v1, v7 */
/* add-float/2addr v0, v1 */
/* const v1, 0x44af6000 # 1403.0f */
/* div-float/2addr v0, v1 */
/* const v2, 0x445ec000 # 891.0f */
/* mul-float v2, v2, v3 */
/* sub-float v2, v6, v2 */
/* const v8, 0x43828000 # 261.0f */
/* mul-float v8, v8, v7 */
/* sub-float/2addr v2, v8 */
/* div-float/2addr v2, v1 */
/* const/high16 v8, 0x435c0000 # 220.0f */
/* mul-float v3, v3, v8 */
/* sub-float/2addr v6, v3 */
/* const v3, 0x45c4e000 # 6300.0f */
/* mul-float v7, v7, v3 */
/* sub-float/2addr v6, v7 */
/* div-float/2addr v6, v1 */
/* .line 71 */
v1 = java.lang.Math .abs ( v0 );
/* float-to-double v7, v1 */
/* const-wide v9, 0x403b2147ae147ae1L # 27.13 */
/* mul-double v7, v7, v9 */
v1 = java.lang.Math .abs ( v0 );
/* float-to-double v11, v1 */
/* const-wide/high16 v13, 0x4079000000000000L # 400.0 */
/* sub-double v11, v13, v11 */
/* div-double/2addr v7, v11 */
java.lang.Math .max ( v4,v5,v7,v8 );
/* move-result-wide v7 */
/* double-to-float v1, v7 */
/* .line 72 */
v0 = java.lang.Math .signum ( v0 );
v3 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->c()F */
/* const/high16 v7, 0x42c80000 # 100.0f */
/* div-float v3, v7, v3 */
/* mul-float v0, v0, v3 */
/* float-to-double v11, v1 */
/* const-wide v7, 0x40030c30c30c30c3L # 2.380952380952381 */
java.lang.Math .pow ( v11,v12,v7,v8 );
/* move-result-wide v11 */
/* double-to-float v3, v11 */
/* mul-float v0, v0, v3 */
/* .line 73 */
v3 = java.lang.Math .abs ( v2 );
/* float-to-double v11, v3 */
/* mul-double v11, v11, v9 */
v3 = java.lang.Math .abs ( v2 );
/* float-to-double v9, v3 */
/* sub-double v9, v13, v9 */
/* div-double/2addr v11, v9 */
java.lang.Math .max ( v4,v5,v11,v12 );
/* move-result-wide v9 */
/* double-to-float v3, v9 */
/* .line 74 */
v2 = java.lang.Math .signum ( v2 );
v9 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->c()F */
/* const/high16 v1, 0x42c80000 # 100.0f */
/* div-float v9, v1, v9 */
/* mul-float v2, v2, v9 */
/* float-to-double v9, v3 */
java.lang.Math .pow ( v9,v10,v7,v8 );
/* move-result-wide v9 */
/* double-to-float v3, v9 */
/* mul-float v2, v2, v3 */
/* .line 75 */
v3 = java.lang.Math .abs ( v6 );
/* float-to-double v9, v3 */
/* const-wide v11, 0x403b2147ae147ae1L # 27.13 */
/* mul-double v9, v9, v11 */
v3 = java.lang.Math .abs ( v6 );
/* float-to-double v11, v3 */
/* sub-double/2addr v13, v11 */
/* div-double/2addr v9, v13 */
java.lang.Math .max ( v4,v5,v9,v10 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* .line 76 */
v4 = java.lang.Math .signum ( v6 );
v5 = /* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->c()F */
/* const/high16 v1, 0x42c80000 # 100.0f */
/* div-float/2addr v1, v5 */
/* mul-float v4, v4, v1 */
/* float-to-double v5, v3 */
java.lang.Math .pow ( v5,v6,v7,v8 );
/* move-result-wide v5 */
/* double-to-float v1, v5 */
/* mul-float v4, v4, v1 */
/* .line 77 */
/* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->i()[F */
int v3 = 0; // const/4 v3, 0x0
/* aget v1, v1, v3 */
/* div-float/2addr v0, v1 */
/* .line 78 */
/* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->i()[F */
int v5 = 1; // const/4 v5, 0x1
/* aget v1, v1, v5 */
/* div-float/2addr v2, v1 */
/* .line 79 */
/* invoke-virtual/range {p1 ..p1}, Lc/h/f/i/u;->i()[F */
int v6 = 2; // const/4 v6, 0x2
/* aget v1, v1, v6 */
/* div-float/2addr v4, v1 */
/* .line 80 */
v1 = c.h.f.i.b.b;
/* .line 81 */
/* aget-object v7, v1, v3 */
/* aget v7, v7, v3 */
/* mul-float v7, v7, v0 */
/* aget-object v8, v1, v3 */
/* aget v8, v8, v5 */
/* mul-float v8, v8, v2 */
/* add-float/2addr v7, v8 */
/* aget-object v8, v1, v3 */
/* aget v8, v8, v6 */
/* mul-float v8, v8, v4 */
/* add-float/2addr v7, v8 */
/* .line 82 */
/* aget-object v8, v1, v5 */
/* aget v8, v8, v3 */
/* mul-float v8, v8, v0 */
/* aget-object v9, v1, v5 */
/* aget v9, v9, v5 */
/* mul-float v9, v9, v2 */
/* add-float/2addr v8, v9 */
/* aget-object v9, v1, v5 */
/* aget v9, v9, v6 */
/* mul-float v9, v9, v4 */
/* add-float/2addr v8, v9 */
/* .line 83 */
/* aget-object v9, v1, v6 */
/* aget v3, v9, v3 */
/* mul-float v0, v0, v3 */
/* aget-object v3, v1, v6 */
/* aget v3, v3, v5 */
/* mul-float v2, v2, v3 */
/* add-float/2addr v0, v2 */
/* aget-object v1, v1, v6 */
/* aget v1, v1, v6 */
/* mul-float v4, v4, v1 */
/* add-float/2addr v0, v4 */
/* float-to-double v1, v7 */
/* float-to-double v3, v8 */
/* float-to-double v5, v0 */
/* .line 84 */
v0 = /* invoke-static/range {v1 ..v6}, Lc/h/g/a;->a(DDD)I */
} // .end method
public Float b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/h/f/i/a;->f:F */
} // .end method
public Float c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/h/f/i/a;->b:F */
} // .end method
public Float d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/h/f/i/a;->a:F */
} // .end method
public Float e ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/h/f/i/a;->c:F */
} // .end method
public Float f ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/h/f/i/a;->d:F */
} // .end method
public Integer g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = c.h.f.i.u.k;
v0 = (( c.h.f.i.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/h/f/i/a;->a(Lc/h/f/i/u;)I
} // .end method
