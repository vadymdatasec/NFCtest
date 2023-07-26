public abstract class e.f.a.b.e.d.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.a.b.e.d.h ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/a/b/e/d/g; */
		 /* invoke-direct {v0}, Le/f/a/b/e/d/g;-><init>()V */
		 return;
	 } // .end method
	 public static java.io.InputStream a ( java.io.InputStream p0, Long p1 ) {
		 /* .locals 2 */
		 /* .line 15 */
		 /* new-instance p1, Le/f/a/b/e/d/j; */
		 /* const-wide/32 v0, 0x100001 */
		 /* invoke-direct {p1, p0, v0, v1}, Le/f/a/b/e/d/j;-><init>(Ljava/io/InputStream;J)V */
	 } // .end method
	 public static a ( java.io.InputStream p0 ) {
		 /* .locals 9 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 5 */
	 e.f.a.b.e.d.e .a ( p0 );
	 /* .line 6 */
	 /* new-instance v0, Ljava/util/ArrayDeque; */
	 /* const/16 v1, 0x14 */
	 /* invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V */
	 int v1 = 0; // const/4 v1, 0x0
	 /* const/16 v2, 0x2000 */
	 int v3 = 0; // const/4 v3, 0x0
} // :goto_0
int v4 = -1; // const/4 v4, -0x1
/* const v5, 0x7ffffff7 */
/* if-ge v3, v5, :cond_2 */
/* sub-int/2addr v5, v3 */
/* .line 7 */
v5 = java.lang.Math .min ( v2,v5 );
/* new-array v6, v5, [B */
/* .line 8 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_1
/* if-ge v7, v5, :cond_1 */
/* sub-int v8, v5, v7 */
/* .line 9 */
v8 = (( java.io.InputStream ) p0 ).read ( v6, v7, v8 ); // invoke-virtual {p0, v6, v7, v8}, Ljava/io/InputStream;->read([BII)I
/* if-ne v8, v4, :cond_0 */
/* .line 10 */
e.f.a.b.e.d.h .a ( v0,v3 );
} // :cond_0
/* add-int/2addr v7, v8 */
/* add-int/2addr v3, v8 */
} // :cond_1
int v4 = 2; // const/4 v4, 0x2
/* .line 11 */
v2 = e.f.a.b.e.d.m .a ( v2,v4 );
/* .line 12 */
} // :cond_2
p0 = (( java.io.InputStream ) p0 ).read ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->read()I
/* if-ne p0, v4, :cond_3 */
/* .line 13 */
e.f.a.b.e.d.h .a ( v0,v5 );
/* .line 14 */
} // :cond_3
/* new-instance p0, Ljava/lang/OutOfMemoryError; */
final String v0 = "input is too large to fit in a byte array"; // const-string v0, "input is too large to fit in a byte array"
/* invoke-direct {p0, v0}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static a ( java.util.Queue p0, Integer p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Queue<", */
/* "[B>;I)[B" */
/* } */
} // .end annotation
/* .line 1 */
/* new-array v0, p1, [B */
/* move v1, p1 */
} // :goto_0
/* if-lez v1, :cond_0 */
/* .line 2 */
/* check-cast v2, [B */
/* .line 3 */
/* array-length v3, v2 */
v3 = java.lang.Math .min ( v1,v3 );
/* sub-int v4, p1, v1 */
int v5 = 0; // const/4 v5, 0x0
/* .line 4 */
java.lang.System .arraycopy ( v2,v5,v0,v4,v3 );
/* sub-int/2addr v1, v3 */
} // :cond_0
} // .end method
