public abstract class e.f.e.r.r.f {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( Integer p0, Integer p1 ) {
		 /* .locals 4 */
		 /* sub-int v0, p0, p1 */
		 /* if-le v0, p1, :cond_0 */
		 /* move v3, v0 */
		 /* move v0, p1 */
		 /* move p1, v3 */
	 } // :cond_0
	 int v1 = 1; // const/4 v1, 0x1
	 int v2 = 1; // const/4 v2, 0x1
} // :goto_0
/* if-le p0, p1, :cond_2 */
/* mul-int v1, v1, p0 */
/* if-gt v2, v0, :cond_1 */
/* .line 7 */
/* div-int/2addr v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* add-int/lit8 p0, p0, -0x1 */
} // :cond_2
} // :goto_1
/* if-gt v2, v0, :cond_3 */
/* .line 8 */
/* div-int/2addr v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_3
} // .end method
public static Integer a ( Integer[] p0, Integer p1, Boolean p2 ) {
/* .locals 17 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p1 */
/* .line 1 */
/* array-length v2, v0 */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v4, v2, :cond_0 */
/* aget v6, v0, v4 */
/* add-int/2addr v5, v6 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 2 */
} // :cond_0
/* array-length v2, v0 */
int v4 = 0; // const/4 v4, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
} // :goto_1
/* add-int/lit8 v8, v2, -0x1 */
/* if-ge v4, v8, :cond_6 */
int v9 = 1; // const/4 v9, 0x1
/* shl-int v10, v9, v4 */
/* or-int/2addr v7, v10 */
int v11 = 1; // const/4 v11, 0x1
/* .line 3 */
} // :goto_2
/* aget v12, v0, v4 */
/* if-ge v11, v12, :cond_5 */
/* sub-int v12, v5, v11 */
/* add-int/lit8 v13, v12, -0x1 */
/* sub-int v14, v2, v4 */
/* add-int/lit8 v15, v14, -0x2 */
/* .line 4 */
v13 = e.f.e.r.r.f .a ( v13,v15 );
if ( p2 != null) { // if-eqz p2, :cond_1
/* if-nez v7, :cond_1 */
/* add-int/lit8 v3, v14, -0x1 */
/* sub-int v9, v12, v3 */
/* if-lt v9, v3, :cond_1 */
/* sub-int v3, v12, v14 */
/* .line 5 */
v3 = e.f.e.r.r.f .a ( v3,v15 );
/* sub-int/2addr v13, v3 */
} // :cond_1
/* add-int/lit8 v3, v14, -0x1 */
int v9 = 1; // const/4 v9, 0x1
/* if-le v3, v9, :cond_3 */
/* sub-int v3, v12, v15 */
int v15 = 0; // const/4 v15, 0x0
} // :goto_3
/* if-le v3, v1, :cond_2 */
/* sub-int v16, v12, v3 */
/* add-int/lit8 v0, v16, -0x1 */
/* add-int/lit8 v9, v14, -0x3 */
/* .line 6 */
v0 = e.f.e.r.r.f .a ( v0,v9 );
/* add-int/2addr v15, v0 */
/* add-int/lit8 v3, v3, -0x1 */
int v9 = 1; // const/4 v9, 0x1
/* move-object/from16 v0, p0 */
} // :cond_2
/* sub-int v0, v8, v4 */
/* mul-int v15, v15, v0 */
/* sub-int/2addr v13, v15 */
} // :cond_3
/* if-le v12, v1, :cond_4 */
/* add-int/lit8 v13, v13, -0x1 */
} // :cond_4
} // :goto_4
/* add-int/2addr v6, v13 */
/* add-int/lit8 v11, v11, 0x1 */
/* not-int v0, v10 */
/* and-int/2addr v7, v0 */
int v9 = 1; // const/4 v9, 0x1
/* move-object/from16 v0, p0 */
} // :cond_5
/* sub-int/2addr v5, v11 */
/* add-int/lit8 v4, v4, 0x1 */
/* move-object/from16 v0, p0 */
} // :cond_6
} // .end method
