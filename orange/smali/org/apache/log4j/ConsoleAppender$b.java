public class org.apache.log4j.ConsoleAppender$b extends java.io.OutputStream {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/ConsoleAppender; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # direct methods */
public org.apache.log4j.ConsoleAppender$b ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 0 */
return;
} // .end method
public void flush ( ) {
/* .locals 1 */
/* .line 1 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V
return;
} // .end method
public void write ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/PrintStream;->write(I)V
return;
} // .end method
public void write ( Object[] p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/PrintStream;->write([B)V
return;
} // .end method
public void write ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
v0 = java.lang.System.out;
(( java.io.PrintStream ) v0 ).write ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/io/PrintStream;->write([BII)V
return;
} // .end method
