public abstract class k.x0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public k.x0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static k.x0 a ( k.i0 p0, java.io.File p1 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 11 */
			 /* new-instance v0, Lk/w0; */
			 /* invoke-direct {v0, p0, p1}, Lk/w0;-><init>(Lk/i0;Ljava/io/File;)V */
			 /* .line 12 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/NullPointerException; */
		 final String p1 = "file == null"; // const-string p1, "file == null"
		 /* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 public static k.x0 a ( k.i0 p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = k.e1.e.i;
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 2 */
			 (( k.i0 ) p0 ).a ( ); // invoke-virtual {p0}, Lk/i0;->a()Ljava/nio/charset/Charset;
			 /* if-nez v0, :cond_0 */
			 /* .line 3 */
			 v0 = k.e1.e.i;
			 /* .line 4 */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 final String p0 = "; charset=utf-8"; // const-string p0, "; charset=utf-8"
			 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 k.i0 .b ( p0 );
			 /* .line 5 */
		 } // :cond_0
		 (( java.lang.String ) p1 ).getBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
		 /* .line 6 */
		 k.x0 .a ( p0,p1 );
	 } // .end method
	 public static k.x0 a ( k.i0 p0, Object[] p1 ) {
		 /* .locals 2 */
		 /* .line 7 */
		 /* array-length v0, p1 */
		 int v1 = 0; // const/4 v1, 0x0
		 k.x0 .a ( p0,p1,v1,v0 );
	 } // .end method
	 public static k.x0 a ( k.i0 p0, Object[] p1, Integer p2, Integer p3 ) {
		 /* .locals 7 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 8 */
			 /* array-length v0, p1 */
			 /* int-to-long v1, v0 */
			 /* int-to-long v3, p2 */
			 /* int-to-long v5, p3 */
			 /* invoke-static/range {v1 ..v6}, Lk/e1/e;->a(JJJ)V */
			 /* .line 9 */
			 /* new-instance v0, Lk/v0; */
			 /* invoke-direct {v0, p0, p3, p1, p2}, Lk/v0;-><init>(Lk/i0;I[BI)V */
			 /* .line 10 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/NullPointerException; */
		 final String p1 = "content == null"; // const-string p1, "content == null"
		 /* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 /* # virtual methods */
	 public abstract Long a ( ) {
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
} // .end method
public abstract void a ( Object p0 ) {
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
} // .end method
public abstract k.i0 b ( ) {
} // .end method
