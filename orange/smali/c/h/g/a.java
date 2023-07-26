public abstract class c.h.g.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static c.h.g.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/ThreadLocal; */
		 /* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
		 return;
	 } // .end method
	 public static Integer a ( Double p0, Double p1, Double p2 ) {
		 /* .locals 17 */
		 /* const-wide v0, 0x4009ecbfb15b573fL # 3.2406 */
		 /* mul-double v0, v0, p0 */
		 /* const-wide v2, -0x400767a0f9096bbaL # -1.5372 */
		 /* mul-double v2, v2, p2 */
		 /* add-double/2addr v0, v2 */
		 /* const-wide v2, -0x402016f0068db8bbL # -0.4986 */
		 /* mul-double v2, v2, p4 */
		 /* add-double/2addr v0, v2 */
		 /* const-wide/high16 v2, 0x4059000000000000L # 100.0 */
		 /* div-double/2addr v0, v2 */
		 /* const-wide v4, -0x4010fec56d5cfaadL # -0.9689 */
		 /* mul-double v4, v4, p0 */
		 /* const-wide v6, 0x3ffe0346dc5d6388L # 1.8758 */
		 /* mul-double v6, v6, p2 */
		 /* add-double/2addr v4, v6 */
		 /* const-wide v6, 0x3fa53f7ced916873L # 0.0415 */
		 /* mul-double v6, v6, p4 */
		 /* add-double/2addr v4, v6 */
		 /* div-double/2addr v4, v2 */
		 /* const-wide v6, 0x3fac84b5dcc63f14L # 0.0557 */
		 /* mul-double v6, v6, p0 */
		 /* const-wide v8, -0x4035e353f7ced917L # -0.204 */
		 /* mul-double v8, v8, p2 */
		 /* add-double/2addr v6, v8 */
		 /* const-wide v8, 0x3ff0e978d4fdf3b6L # 1.057 */
		 /* mul-double v8, v8, p4 */
		 /* add-double/2addr v6, v8 */
		 /* div-double/2addr v6, v2 */
		 /* const-wide v2, 0x3fac28f5c28f5c29L # 0.055 */
		 /* const-wide v8, 0x3fdaaaaaaaaaaaabL # 0.4166666666666667 */
		 /* const-wide v10, 0x3ff0e147ae147ae1L # 1.055 */
		 /* const-wide v12, 0x4029d70a3d70a3d7L # 12.92 */
		 /* const-wide v14, 0x3f69a5c37387b719L # 0.0031308 */
		 /* cmpl-double v16, v0, v14 */
		 /* if-lez v16, :cond_0 */
		 /* .line 3 */
		 java.lang.Math .pow ( v0,v1,v8,v9 );
		 /* move-result-wide v0 */
		 /* mul-double v0, v0, v10 */
		 /* sub-double/2addr v0, v2 */
	 } // :cond_0
	 /* mul-double v0, v0, v12 */
} // :goto_0
/* cmpl-double v16, v4, v14 */
/* if-lez v16, :cond_1 */
/* .line 4 */
java.lang.Math .pow ( v4,v5,v8,v9 );
/* move-result-wide v4 */
/* mul-double v4, v4, v10 */
/* sub-double/2addr v4, v2 */
} // :cond_1
/* mul-double v4, v4, v12 */
} // :goto_1
/* cmpl-double v16, v6, v14 */
/* if-lez v16, :cond_2 */
/* .line 5 */
java.lang.Math .pow ( v6,v7,v8,v9 );
/* move-result-wide v6 */
/* mul-double v6, v6, v10 */
/* sub-double/2addr v6, v2 */
} // :cond_2
/* mul-double v6, v6, v12 */
} // :goto_2
/* const-wide v2, 0x406fe00000000000L # 255.0 */
/* mul-double v0, v0, v2 */
/* .line 6 */
java.lang.Math .round ( v0,v1 );
/* move-result-wide v0 */
/* long-to-int v1, v0 */
/* const/16 v0, 0xff */
int v8 = 0; // const/4 v8, 0x0
v1 = c.h.g.a .a ( v1,v8,v0 );
/* mul-double v4, v4, v2 */
/* .line 7 */
java.lang.Math .round ( v4,v5 );
/* move-result-wide v4 */
/* long-to-int v5, v4 */
v4 = c.h.g.a .a ( v5,v8,v0 );
/* mul-double v6, v6, v2 */
/* .line 8 */
java.lang.Math .round ( v6,v7 );
/* move-result-wide v2 */
/* long-to-int v3, v2 */
v0 = c.h.g.a .a ( v3,v8,v0 );
/* .line 9 */
v0 = android.graphics.Color .rgb ( v1,v4,v0 );
} // .end method
public static Integer a ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* rsub-int p1, p1, 0xff */
/* rsub-int p0, p0, 0xff */
/* mul-int p1, p1, p0 */
/* .line 1 */
/* div-int/lit16 p1, p1, 0xff */
/* rsub-int p0, p1, 0xff */
} // .end method
public static Integer a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* if-ge p0, p1, :cond_0 */
/* move p0, p1 */
} // :cond_0
/* if-le p0, p2, :cond_1 */
/* move p0, p2 */
} // :cond_1
} // :goto_0
} // .end method
public static Integer a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* if-nez p4, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
/* mul-int/lit16 p0, p0, 0xff */
/* mul-int p0, p0, p1 */
/* mul-int p2, p2, p3 */
/* rsub-int p1, p1, 0xff */
/* mul-int p2, p2, p1 */
/* add-int/2addr p0, p2 */
/* mul-int/lit16 p4, p4, 0xff */
/* .line 2 */
/* div-int/2addr p0, p4 */
} // .end method
public static Integer b ( Integer p0, Integer p1 ) {
/* .locals 6 */
/* .line 1 */
v0 = android.graphics.Color .alpha ( p1 );
/* .line 2 */
v1 = android.graphics.Color .alpha ( p0 );
/* .line 3 */
v2 = c.h.g.a .a ( v1,v0 );
/* .line 4 */
v3 = android.graphics.Color .red ( p0 );
/* .line 5 */
v4 = android.graphics.Color .red ( p1 );
/* .line 6 */
v3 = c.h.g.a .a ( v3,v1,v4,v0,v2 );
/* .line 7 */
v4 = android.graphics.Color .green ( p0 );
/* .line 8 */
v5 = android.graphics.Color .green ( p1 );
/* .line 9 */
v4 = c.h.g.a .a ( v4,v1,v5,v0,v2 );
/* .line 10 */
p0 = android.graphics.Color .blue ( p0 );
/* .line 11 */
p1 = android.graphics.Color .blue ( p1 );
/* .line 12 */
p0 = c.h.g.a .a ( p0,v1,p1,v0,v2 );
/* .line 13 */
p0 = android.graphics.Color .argb ( v2,v3,v4,p0 );
} // .end method
public static Integer c ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* if-ltz p1, :cond_0 */
/* const/16 v0, 0xff */
/* if-gt p1, v0, :cond_0 */
/* const v0, 0xffffff */
/* and-int/2addr p0, v0 */
/* shl-int/lit8 p1, p1, 0x18 */
/* or-int/2addr p0, p1 */
/* .line 1 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "alpha must be between 0 and 255."; // const-string p1, "alpha must be between 0 and 255."
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
