public abstract class c.e.e {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a;
	 public static final b;
	 public static final java.lang.Object c;
	 /* # direct methods */
	 public static c.e.e ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v1, v0, [I */
		 /* .line 1 */
		 /* new-array v1, v0, [J */
		 /* .line 2 */
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* .line 3 */
		 return;
	 } // .end method
	 public static Integer a ( Integer p0 ) {
		 /* .locals 2 */
		 int v0 = 4; // const/4 v0, 0x4
	 } // :goto_0
	 /* const/16 v1, 0x20 */
	 /* if-ge v0, v1, :cond_1 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* shl-int/2addr v1, v0 */
	 /* add-int/lit8 v1, v1, -0xc */
	 /* if-gt p0, v1, :cond_0 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
} // .end method
public static Integer a ( Integer[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* add-int/lit8 p1, p1, -0x1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-gt v0, p1, :cond_2 */
/* add-int v1, v0, p1 */
/* ushr-int/lit8 v1, v1, 0x1 */
/* .line 2 */
/* aget v2, p0, v1 */
/* if-ge v2, p2, :cond_0 */
/* add-int/lit8 v1, v1, 0x1 */
/* move v0, v1 */
} // :cond_0
/* if-le v2, p2, :cond_1 */
/* add-int/lit8 v1, v1, -0x1 */
/* move p1, v1 */
} // :cond_1
} // :cond_2
/* not-int p0, v0 */
} // .end method
public static Integer a ( Long[] p0, Integer p1, Long p2 ) {
/* .locals 5 */
/* add-int/lit8 p1, p1, -0x1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-gt v0, p1, :cond_2 */
/* add-int v1, v0, p1 */
/* ushr-int/lit8 v1, v1, 0x1 */
/* .line 3 */
/* aget-wide v2, p0, v1 */
/* cmp-long v4, v2, p2 */
/* if-gez v4, :cond_0 */
/* add-int/lit8 v1, v1, 0x1 */
/* move v0, v1 */
} // :cond_0
/* if-lez v4, :cond_1 */
/* add-int/lit8 v1, v1, -0x1 */
/* move p1, v1 */
} // :cond_1
} // :cond_2
/* not-int p0, v0 */
} // .end method
public static Boolean a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* if-eq p0, p1, :cond_1 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
p0 = (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
public static Integer b ( Integer p0 ) {
/* .locals 0 */
/* mul-int/lit8 p0, p0, 0x4 */
/* .line 1 */
p0 = c.e.e .a ( p0 );
/* div-int/lit8 p0, p0, 0x4 */
} // .end method
public static Integer c ( Integer p0 ) {
/* .locals 0 */
/* mul-int/lit8 p0, p0, 0x8 */
/* .line 1 */
p0 = c.e.e .a ( p0 );
/* div-int/lit8 p0, p0, 0x8 */
} // .end method
