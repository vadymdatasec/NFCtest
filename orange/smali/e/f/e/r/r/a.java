public abstract class e.f.e.r.r.a extends e.f.e.r.k {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final a;
	 public final b;
	 public final c;
	 public final d;
	 public final e;
	 public final f;
	 /* # direct methods */
	 public e.f.e.r.r.a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/f/e/r/k;-><init>()V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v1, v0, [I */
		 /* .line 2 */
		 this.a = v1;
		 /* const/16 v1, 0x8 */
		 /* new-array v1, v1, [I */
		 /* .line 3 */
		 this.b = v1;
		 /* new-array v2, v0, [F */
		 /* .line 4 */
		 this.c = v2;
		 /* new-array v0, v0, [F */
		 /* .line 5 */
		 this.d = v0;
		 /* .line 6 */
		 /* array-length v0, v1 */
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* new-array v0, v0, [I */
		 this.e = v0;
		 /* .line 7 */
		 /* array-length v0, v1 */
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* new-array v0, v0, [I */
		 this.f = v0;
		 return;
	 } // .end method
	 public static Integer a ( Integer[] p0, Integer[] p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/zxing/NotFoundException; */
		 /* } */
	 } // .end annotation
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 1 */
} // :goto_0
/* array-length v1, p1 */
/* if-ge v0, v1, :cond_1 */
/* .line 2 */
/* aget-object v1, p1, v0 */
/* const v2, 0x3ee66666 # 0.45f */
v1 = e.f.e.r.k .a ( p0,v1,v2 );
/* const v2, 0x3e4ccccd # 0.2f */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_0 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 3 */
} // :cond_1
com.google.zxing.NotFoundException .a ( );
/* throw p0 */
} // .end method
public static void a ( Integer[] p0, Float[] p1 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* aget v1, p1, v0 */
int v2 = 1; // const/4 v2, 0x1
int v3 = 1; // const/4 v3, 0x1
/* .line 5 */
} // :goto_0
/* array-length v4, p0 */
/* if-ge v3, v4, :cond_1 */
/* .line 6 */
/* aget v4, p1, v3 */
/* cmpg-float v4, v4, v1 */
/* if-gez v4, :cond_0 */
/* .line 7 */
/* aget v0, p1, v3 */
/* move v1, v0 */
/* move v0, v3 */
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
/* .line 8 */
} // :cond_1
/* aget p1, p0, v0 */
/* sub-int/2addr p1, v2 */
/* aput p1, p0, v0 */
return;
} // .end method
public static Boolean a ( Integer[] p0 ) {
/* .locals 7 */
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
/* aget v1, p0, v0 */
int v2 = 1; // const/4 v2, 0x1
/* aget v3, p0, v2 */
/* add-int/2addr v1, v3 */
int v3 = 2; // const/4 v3, 0x2
/* .line 10 */
/* aget v3, p0, v3 */
/* add-int/2addr v3, v1 */
int v4 = 3; // const/4 v4, 0x3
/* aget v4, p0, v4 */
/* add-int/2addr v3, v4 */
/* int-to-float v1, v1 */
/* int-to-float v3, v3 */
/* div-float/2addr v1, v3 */
/* const v3, 0x3f4aaaab */
/* cmpl-float v3, v1, v3 */
/* if-ltz v3, :cond_3 */
/* const v3, 0x3f649249 */
/* cmpg-float v1, v1, v3 */
/* if-gtz v1, :cond_3 */
/* const v1, 0x7fffffff */
/* const/high16 v3, -0x80000000 */
/* .line 11 */
/* array-length v4, p0 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v4, :cond_2 */
/* aget v6, p0, v5 */
/* if-le v6, v3, :cond_0 */
/* move v3, v6 */
} // :cond_0
/* if-ge v6, v1, :cond_1 */
/* move v1, v6 */
} // :cond_1
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_2
/* mul-int/lit8 v1, v1, 0xa */
/* if-ge v3, v1, :cond_3 */
} // :cond_3
} // .end method
public static void b ( Integer[] p0, Float[] p1 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* aget v1, p1, v0 */
int v2 = 1; // const/4 v2, 0x1
int v3 = 1; // const/4 v3, 0x1
/* .line 3 */
} // :goto_0
/* array-length v4, p0 */
/* if-ge v3, v4, :cond_1 */
/* .line 4 */
/* aget v4, p1, v3 */
/* cmpl-float v4, v4, v1 */
/* if-lez v4, :cond_0 */
/* .line 5 */
/* aget v0, p1, v3 */
/* move v1, v0 */
/* move v0, v3 */
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
/* .line 6 */
} // :cond_1
/* aget p1, p0, v0 */
/* add-int/2addr p1, v2 */
/* aput p1, p0, v0 */
return;
} // .end method
/* # virtual methods */
public final b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public final c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public final d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public final e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public final f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public final g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
