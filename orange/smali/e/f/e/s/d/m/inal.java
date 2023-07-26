public class inal {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.f.e.s.d.m.b f;
	 /* # instance fields */
	 public final a;
	 public final b;
	 public final e.f.e.s.d.m.c c;
	 public final e.f.e.s.d.m.c d;
	 public final Integer e;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/e/s/d/m/b; */
		 /* const/16 v1, 0x3a1 */
		 int v2 = 3; // const/4 v2, 0x3
		 /* invoke-direct {v0, v1, v2}, Le/f/e/s/d/m/b;-><init>(II)V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/f/e/s/d/m/b;->e:I */
		 /* .line 3 */
		 /* new-array v0, p1, [I */
		 this.a = v0;
		 /* .line 4 */
		 /* new-array v0, p1, [I */
		 this.b = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 1; // const/4 v3, 0x1
	 } // :goto_0
	 /* if-ge v2, p1, :cond_0 */
	 /* .line 5 */
	 v4 = this.a;
	 /* aput v3, v4, v2 */
	 /* mul-int v3, v3, p2 */
	 /* .line 6 */
	 /* rem-int/2addr v3, p1 */
	 /* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :goto_1
/* add-int/lit8 v2, p1, -0x1 */
/* if-ge p2, v2, :cond_1 */
/* .line 7 */
v2 = this.b;
v3 = this.a;
/* aget v3, v3, p2 */
/* aput p2, v2, v3 */
/* add-int/lit8 p2, p2, 0x1 */
/* .line 8 */
} // :cond_1
/* new-instance p1, Le/f/e/s/d/m/c; */
/* new-array p2, v1, [I */
/* aput v0, p2, v0 */
/* invoke-direct {p1, p0, p2}, Le/f/e/s/d/m/c;-><init>(Le/f/e/s/d/m/b;[I)V */
this.c = p1;
/* .line 9 */
/* new-instance p1, Le/f/e/s/d/m/c; */
/* new-array p2, v1, [I */
/* aput v1, p2, v0 */
/* invoke-direct {p1, p0, p2}, Le/f/e/s/d/m/c;-><init>(Le/f/e/s/d/m/b;[I)V */
this.d = p1;
return;
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.a;
/* aget p1, v0, p1 */
} // .end method
public Integer a ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* add-int/2addr p1, p2 */
/* .line 2 */
/* iget p2, p0, Le/f/e/s/d/m/b;->e:I */
/* rem-int/2addr p1, p2 */
} // .end method
public e.f.e.s.d.m.c a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 8 */
/* iget v0, p0, Le/f/e/s/d/m/b;->e:I */
} // .end method
public Integer b ( Integer p0 ) {
/* .locals 3 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
v0 = this.a;
/* iget v1, p0, Le/f/e/s/d/m/b;->e:I */
v2 = this.b;
/* aget p1, v2, p1 */
/* sub-int/2addr v1, p1 */
/* add-int/lit8 v1, v1, -0x1 */
/* aget p1, v0, v1 */
/* .line 7 */
} // :cond_0
/* new-instance p1, Ljava/lang/ArithmeticException; */
/* invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V */
/* throw p1 */
} // .end method
public e.f.e.s.d.m.c b ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* if-ltz p1, :cond_1 */
/* if-nez p2, :cond_0 */
/* .line 1 */
p1 = this.c;
} // :cond_0
/* add-int/lit8 p1, p1, 0x1 */
/* .line 2 */
/* new-array p1, p1, [I */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* aput p2, p1, v0 */
/* .line 4 */
/* new-instance p2, Le/f/e/s/d/m/c; */
/* invoke-direct {p2, p0, p1}, Le/f/e/s/d/m/c;-><init>(Le/f/e/s/d/m/b;[I)V */
/* .line 5 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw p1 */
} // .end method
public Integer c ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
v0 = this.b;
/* aget p1, v0, p1 */
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V */
/* throw p1 */
} // .end method
public Integer c ( Integer p0, Integer p1 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* if-nez p2, :cond_0 */
/* .line 4 */
} // :cond_0
v0 = this.a;
v1 = this.b;
/* aget p1, v1, p1 */
/* aget p2, v1, p2 */
/* add-int/2addr p1, p2 */
/* iget p2, p0, Le/f/e/s/d/m/b;->e:I */
/* add-int/lit8 p2, p2, -0x1 */
/* rem-int/2addr p1, p2 */
/* aget p1, v0, p1 */
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public e.f.e.s.d.m.c c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public Integer d ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/e/s/d/m/b;->e:I */
/* add-int/2addr p1, v0 */
/* sub-int/2addr p1, p2 */
/* rem-int/2addr p1, v0 */
} // .end method
