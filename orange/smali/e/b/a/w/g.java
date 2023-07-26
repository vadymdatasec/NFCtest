public class e.b.a.w.g extends java.io.ByteArrayOutputStream {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.b.a.w.h b; //synthetic
	 /* # direct methods */
	 public e.b.a.w.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0, p2}, Ljava/io/ByteArrayOutputStream;-><init>(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String toString ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* iget v0, p0, Ljava/io/ByteArrayOutputStream;->count:I */
		 /* if-lez v0, :cond_0 */
		 v1 = this.buf;
		 /* add-int/lit8 v2, v0, -0x1 */
		 /* aget-byte v1, v1, v2 */
		 /* const/16 v2, 0xd */
		 /* if-ne v1, v2, :cond_0 */
		 /* add-int/lit8 v0, v0, -0x1 */
	 } // :cond_0
	 /* iget v0, p0, Ljava/io/ByteArrayOutputStream;->count:I */
	 /* .line 2 */
} // :goto_0
try { // :try_start_0
	 /* new-instance v1, Ljava/lang/String; */
	 v2 = this.buf;
	 int v3 = 0; // const/4 v3, 0x0
	 v4 = this.b;
	 e.b.a.w.h .a ( v4 );
	 (( java.nio.charset.Charset ) v4 ).name ( ); // invoke-virtual {v4}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;
	 /* invoke-direct {v1, v2, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V */
	 /* :try_end_0 */
	 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 3 */
	 /* new-instance v1, Ljava/lang/AssertionError; */
	 /* invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
	 /* throw v1 */
} // .end method
