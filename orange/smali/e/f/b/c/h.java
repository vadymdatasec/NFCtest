public abstract class e.f.b.c.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.b.c.h ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/b/c/g; */
		 /* invoke-direct {v0}, Le/f/b/c/g;-><init>()V */
		 return;
	 } // .end method
	 public static a ( java.io.InputStream p0, Long p1 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 1; // const/4 v1, 0x1
	 /* const-wide/16 v2, 0x0 */
	 /* cmp-long v4, p1, v2 */
	 /* if-ltz v4, :cond_0 */
	 int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
final String v3 = "expectedSize (%s) must be non-negative"; // const-string v3, "expectedSize (%s) must be non-negative"
/* .line 18 */
e.f.b.a.p .a ( v2,v3,p1,p2 );
/* const-wide/32 v2, 0x7ffffff7 */
/* cmp-long v4, p1, v2 */
/* if-gtz v4, :cond_4 */
/* long-to-int p2, p1 */
/* .line 19 */
/* new-array p1, p2, [B */
/* move v2, p2 */
} // :goto_1
int v3 = -1; // const/4 v3, -0x1
/* if-lez v2, :cond_2 */
/* sub-int v4, p2, v2 */
/* .line 20 */
v5 = (( java.io.InputStream ) p0 ).read ( p1, v4, v2 ); // invoke-virtual {p0, p1, v4, v2}, Ljava/io/InputStream;->read([BII)I
/* if-ne v5, v3, :cond_1 */
/* .line 21 */
java.util.Arrays .copyOf ( p1,v4 );
} // :cond_1
/* sub-int/2addr v2, v5 */
/* .line 22 */
} // :cond_2
v2 = (( java.io.InputStream ) p0 ).read ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->read()I
/* if-ne v2, v3, :cond_3 */
/* .line 23 */
} // :cond_3
/* new-instance v3, Ljava/util/ArrayDeque; */
/* const/16 v4, 0x16 */
/* invoke-direct {v3, v4}, Ljava/util/ArrayDeque;-><init>(I)V */
/* .line 24 */
/* new-array p1, v1, [B */
/* int-to-byte v2, v2 */
/* aput-byte v2, p1, v0 */
/* .line 25 */
/* add-int/2addr p2, v1 */
/* .line 26 */
e.f.b.c.h .a ( p0,v3,p2 );
/* .line 27 */
} // :cond_4
/* new-instance p0, Ljava/lang/OutOfMemoryError; */
/* const/16 v0, 0x3e */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
(( java.lang.StringBuilder ) v1 ).append ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String p1 = " bytes is too large to fit in a byte array"; // const-string p1, " bytes is too large to fit in a byte array"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static a ( java.io.InputStream p0, java.util.Queue p1, Integer p2 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/InputStream;", */
/* "Ljava/util/Queue<", */
/* "[B>;I)[B" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = java.lang.Integer .highestOneBit ( p2 );
int v1 = 2; // const/4 v1, 0x2
/* mul-int/lit8 v0, v0, 0x2 */
/* const/16 v2, 0x80 */
v0 = java.lang.Math .max ( v2,v0 );
/* const/16 v2, 0x2000 */
v0 = java.lang.Math .min ( v2,v0 );
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
/* const v3, 0x7ffffff7 */
/* if-ge p2, v3, :cond_3 */
/* sub-int/2addr v3, p2 */
/* .line 2 */
v3 = java.lang.Math .min ( v0,v3 );
/* new-array v4, v3, [B */
/* .line 3 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* if-ge v5, v3, :cond_1 */
/* sub-int v6, v3, v5 */
/* .line 4 */
v6 = (( java.io.InputStream ) p0 ).read ( v4, v5, v6 ); // invoke-virtual {p0, v4, v5, v6}, Ljava/io/InputStream;->read([BII)I
/* if-ne v6, v2, :cond_0 */
/* .line 5 */
e.f.b.c.h .a ( p1,p2 );
} // :cond_0
/* add-int/2addr v5, v6 */
/* add-int/2addr p2, v6 */
} // :cond_1
/* const/16 v2, 0x1000 */
/* if-ge v0, v2, :cond_2 */
int v2 = 4; // const/4 v2, 0x4
} // :cond_2
int v2 = 2; // const/4 v2, 0x2
/* .line 6 */
} // :goto_2
v0 = e.f.b.d.b .b ( v0,v2 );
/* .line 7 */
} // :cond_3
p0 = (( java.io.InputStream ) p0 ).read ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->read()I
/* if-ne p0, v2, :cond_4 */
/* .line 8 */
e.f.b.c.h .a ( p1,v3 );
/* .line 9 */
} // :cond_4
/* new-instance p0, Ljava/lang/OutOfMemoryError; */
final String p1 = "input is too large to fit in a byte array"; // const-string p1, "input is too large to fit in a byte array"
/* invoke-direct {p0, p1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V */
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
v0 = /* .line 10 */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-array p0, v1, [B */
/* .line 11 */
} // :cond_0
/* check-cast v0, [B */
/* .line 12 */
/* array-length v2, v0 */
/* if-ne v2, p1, :cond_1 */
/* .line 13 */
} // :cond_1
/* array-length v2, v0 */
/* sub-int v2, p1, v2 */
/* .line 14 */
java.util.Arrays .copyOf ( v0,p1 );
} // :goto_0
/* if-lez v2, :cond_2 */
/* .line 15 */
/* check-cast v3, [B */
/* .line 16 */
/* array-length v4, v3 */
v4 = java.lang.Math .min ( v2,v4 );
/* sub-int v5, p1, v2 */
/* .line 17 */
java.lang.System .arraycopy ( v3,v1,v0,v5,v4 );
/* sub-int/2addr v2, v4 */
} // :cond_2
} // .end method
