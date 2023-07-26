public abstract class l.b0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.nio.charset.Charset a;
	 /* # direct methods */
	 public static l.b0 ( ) {
		 /* .locals 1 */
		 final String v0 = "UTF-8"; // const-string v0, "UTF-8"
		 /* .line 1 */
		 java.nio.charset.Charset .forName ( v0 );
		 return;
	 } // .end method
	 public static Integer a ( Integer p0 ) {
		 /* .locals 2 */
		 /* const/high16 v0, -0x1000000 */
		 /* and-int/2addr v0, p0 */
		 /* ushr-int/lit8 v0, v0, 0x18 */
		 /* const/high16 v1, 0xff0000 */
		 /* and-int/2addr v1, p0 */
		 /* ushr-int/lit8 v1, v1, 0x8 */
		 /* or-int/2addr v0, v1 */
		 /* const v1, 0xff00 */
		 /* and-int/2addr v1, p0 */
		 /* shl-int/lit8 v1, v1, 0x8 */
		 /* or-int/2addr v0, v1 */
		 /* and-int/lit16 p0, p0, 0xff */
		 /* shl-int/lit8 p0, p0, 0x18 */
		 /* or-int/2addr p0, v0 */
	 } // .end method
	 public static Object a ( Object p0 ) {
		 /* .locals 1 */
		 /* const v0, 0xffff */
		 /* and-int/2addr p0, v0 */
		 /* const v0, 0xff00 */
		 /* and-int/2addr v0, p0 */
		 /* ushr-int/lit8 v0, v0, 0x8 */
		 /* and-int/lit16 p0, p0, 0xff */
		 /* shl-int/lit8 p0, p0, 0x8 */
		 /* or-int/2addr p0, v0 */
		 /* int-to-short p0, p0 */
	 } // .end method
	 public static void a ( Long p0, Long p1, Long p2 ) {
		 /* .locals 5 */
		 /* or-long v0, p2, p4 */
		 /* const-wide/16 v2, 0x0 */
		 /* cmp-long v4, v0, v2 */
		 /* if-ltz v4, :cond_0 */
		 /* cmp-long v0, p2, p0 */
		 /* if-gtz v0, :cond_0 */
		 /* sub-long v0, p0, p2 */
		 /* cmp-long v2, v0, p4 */
		 /* if-ltz v2, :cond_0 */
		 return;
		 /* .line 1 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException; */
	 int v1 = 3; // const/4 v1, 0x3
	 /* new-array v1, v1, [Ljava/lang/Object; */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 2 */
	 java.lang.Long .valueOf ( p0,p1 );
	 /* aput-object p0, v1, v2 */
	 int p0 = 1; // const/4 p0, 0x1
	 java.lang.Long .valueOf ( p2,p3 );
	 /* aput-object p1, v1, p0 */
	 int p0 = 2; // const/4 p0, 0x2
	 java.lang.Long .valueOf ( p4,p5 );
	 /* aput-object p1, v1, p0 */
	 final String p0 = "size=%s offset=%s byteCount=%s"; // const-string p0, "size=%s offset=%s byteCount=%s"
	 java.lang.String .format ( p0,v1 );
	 /* invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
public static void a ( java.lang.Throwable p0 ) {
	 /* .locals 0 */
	 /* .line 3 */
	 l.b0 .b ( p0 );
	 int p0 = 0; // const/4 p0, 0x0
	 /* throw p0 */
} // .end method
public static Boolean a ( Object[] p0, Integer p1, Object[] p2, Integer p3, Integer p4 ) {
	 /* .locals 4 */
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p4, :cond_1 */
/* add-int v2, v1, p1 */
/* .line 4 */
/* aget-byte v2, p0, v2 */
/* add-int v3, v1, p3 */
/* aget-byte v3, p2, v3 */
/* if-eq v2, v3, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static void b ( java.lang.Throwable p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Throwable;", */
/* ">(", */
/* "Ljava/lang/Throwable;", */
/* ")V^TT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Throwable; */
/* } */
} // .end annotation
/* .line 1 */
/* throw p0 */
} // .end method
