public abstract class e.f.e.o.i {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.f.e.o.i a;
	 /* # direct methods */
	 public static e.f.e.o.i ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/e/o/f; */
		 /* invoke-direct {v0}, Le/f/e/o/f;-><init>()V */
		 return;
	 } // .end method
	 public e.f.e.o.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static e.f.e.o.i a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.e.o.i.a;
	 } // .end method
	 public static void a ( Object p0, Float[] p1 ) {
		 /* .locals 9 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/zxing/NotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 v0 = 	 (( e.f.e.o.b ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/e/o/b;->f()I
	 /* .line 3 */
	 p0 = 	 (( e.f.e.o.b ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/e/o/b;->d()I
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 1; // const/4 v2, 0x1
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 1; // const/4 v4, 0x1
	 /* .line 4 */
} // :goto_0
/* array-length v5, p1 */
int v6 = 0; // const/4 v6, 0x0
int v7 = -1; // const/4 v7, -0x1
/* if-ge v3, v5, :cond_5 */
if ( v4 != null) { // if-eqz v4, :cond_5
	 /* .line 5 */
	 /* aget v4, p1, v3 */
	 /* float-to-int v4, v4 */
	 /* add-int/lit8 v5, v3, 0x1 */
	 /* .line 6 */
	 /* aget v8, p1, v5 */
	 /* float-to-int v8, v8 */
	 /* if-lt v4, v7, :cond_4 */
	 /* if-gt v4, v0, :cond_4 */
	 /* if-lt v8, v7, :cond_4 */
	 /* if-gt v8, p0, :cond_4 */
	 /* if-ne v4, v7, :cond_0 */
	 /* .line 7 */
	 /* aput v6, p1, v3 */
} // :goto_1
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
/* if-ne v4, v0, :cond_1 */
/* add-int/lit8 v4, v0, -0x1 */
/* int-to-float v4, v4 */
/* .line 8 */
/* aput v4, p1, v3 */
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
} // :goto_2
/* if-ne v8, v7, :cond_2 */
/* .line 9 */
/* aput v6, p1, v5 */
} // :goto_3
int v4 = 1; // const/4 v4, 0x1
} // :cond_2
/* if-ne v8, p0, :cond_3 */
/* add-int/lit8 v4, p0, -0x1 */
/* int-to-float v4, v4 */
/* .line 10 */
/* aput v4, p1, v5 */
} // :cond_3
} // :goto_4
/* add-int/lit8 v3, v3, 0x2 */
/* .line 11 */
} // :cond_4
com.google.zxing.NotFoundException .a ( );
/* throw p0 */
/* .line 12 */
} // :cond_5
/* array-length v3, p1 */
/* add-int/lit8 v3, v3, -0x2 */
int v4 = 1; // const/4 v4, 0x1
} // :goto_5
/* if-ltz v3, :cond_b */
if ( v4 != null) { // if-eqz v4, :cond_b
/* .line 13 */
/* aget v4, p1, v3 */
/* float-to-int v4, v4 */
/* add-int/lit8 v5, v3, 0x1 */
/* .line 14 */
/* aget v8, p1, v5 */
/* float-to-int v8, v8 */
/* if-lt v4, v7, :cond_a */
/* if-gt v4, v0, :cond_a */
/* if-lt v8, v7, :cond_a */
/* if-gt v8, p0, :cond_a */
/* if-ne v4, v7, :cond_6 */
/* .line 15 */
/* aput v6, p1, v3 */
} // :goto_6
int v4 = 1; // const/4 v4, 0x1
} // :cond_6
/* if-ne v4, v0, :cond_7 */
/* add-int/lit8 v4, v0, -0x1 */
/* int-to-float v4, v4 */
/* .line 16 */
/* aput v4, p1, v3 */
} // :cond_7
int v4 = 0; // const/4 v4, 0x0
} // :goto_7
/* if-ne v8, v7, :cond_8 */
/* .line 17 */
/* aput v6, p1, v5 */
} // :goto_8
int v4 = 1; // const/4 v4, 0x1
} // :cond_8
/* if-ne v8, p0, :cond_9 */
/* add-int/lit8 v4, p0, -0x1 */
/* int-to-float v4, v4 */
/* .line 18 */
/* aput v4, p1, v5 */
} // :cond_9
} // :goto_9
/* add-int/lit8 v3, v3, -0x2 */
/* .line 19 */
} // :cond_a
com.google.zxing.NotFoundException .a ( );
/* throw p0 */
} // :cond_b
return;
} // .end method
/* # virtual methods */
public abstract e.f.e.o.b a ( Object p0, Integer p1, Integer p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Float p10, Float p11, Float p12, Float p13, Float p14, Float p15, Float p16, Float p17, Float p18 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
} // .end method
public abstract e.f.e.o.b a ( Object p0, Integer p1, Integer p2, Object p3 ) {
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/zxing/NotFoundException; */
/* } */
} // .end annotation
} // .end method
