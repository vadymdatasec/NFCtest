public abstract class org.apache.log4j.lf5.util.StreamUtils {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer DEFAULT_BUFFER_SIZE;
	 /* # direct methods */
	 public org.apache.log4j.lf5.util.StreamUtils ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void copy ( java.io.InputStream p0, java.io.OutputStream p1 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* const/16 v0, 0x800 */
	 /* .line 1 */
	 org.apache.log4j.lf5.util.StreamUtils .copy ( p0,p1,v0 );
	 return;
} // .end method
public static void copy ( java.io.InputStream p0, java.io.OutputStream p1, Integer p2 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 2 */
/* new-array p2, p2, [B */
/* .line 3 */
v0 = (( java.io.InputStream ) p0 ).read ( p2 ); // invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I
} // :goto_0
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
(( java.io.OutputStream ) p1 ).write ( p2, v1, v0 ); // invoke-virtual {p1, p2, v1, v0}, Ljava/io/OutputStream;->write([BII)V
/* .line 5 */
v0 = (( java.io.InputStream ) p0 ).read ( p2 ); // invoke-virtual {p0, p2}, Ljava/io/InputStream;->read([B)I
/* .line 6 */
} // :cond_0
(( java.io.OutputStream ) p1 ).flush ( ); // invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
return;
} // .end method
public static void copyThenClose ( java.io.InputStream p0, java.io.OutputStream p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
org.apache.log4j.lf5.util.StreamUtils .copy ( p0,p1 );
/* .line 2 */
(( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
/* .line 3 */
(( java.io.OutputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
return;
} // .end method
public static getBytes ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 2 */
org.apache.log4j.lf5.util.StreamUtils .copy ( p0,v0 );
/* .line 3 */
(( java.io.ByteArrayOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 4 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
} // .end method
