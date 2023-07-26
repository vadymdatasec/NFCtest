public abstract class k.b1 implements java.io.Closeable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public k.b1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static k.b1 a ( k.i0 p0, Long p1, Object p2 ) {
		 /* .locals 1 */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* .line 3 */
			 /* new-instance v0, Lk/a1; */
			 /* invoke-direct {v0, p0, p1, p2, p3}, Lk/a1;-><init>(Lk/i0;JLl/h;)V */
			 /* .line 4 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/NullPointerException; */
		 final String p1 = "source == null"; // const-string p1, "source == null"
		 /* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
	 } // .end method
	 public static k.b1 a ( k.i0 p0, Object[] p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ll/f; */
		 /* invoke-direct {v0}, Ll/f;-><init>()V */
		 (( l.f ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ll/f;->write([B)Ll/f;
		 /* .line 2 */
		 /* array-length p1, p1 */
		 /* int-to-long v1, p1 */
		 k.b1 .a ( p0,v1,v2,v0 );
	 } // .end method
	 /* # virtual methods */
	 public final java.nio.charset.Charset c ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( k.b1 ) p0 ).m ( ); // invoke-virtual {p0}, Lk/b1;->m()Lk/i0;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v1 = k.e1.e.i;
			 (( k.i0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk/i0;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
		 } // :cond_0
		 v0 = k.e1.e.i;
	 } // :goto_0
} // .end method
public void close ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( k.b1 ) p0 ).n ( ); // invoke-virtual {p0}, Lk/b1;->n()Ll/h;
	 k.e1.e .a ( v0 );
	 return;
} // .end method
public abstract Long l ( ) {
} // .end method
public abstract k.i0 m ( ) {
} // .end method
public abstract l.h n ( ) {
} // .end method
public final java.lang.String o ( ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
(( k.b1 ) p0 ).n ( ); // invoke-virtual {p0}, Lk/b1;->n()Ll/h;
/* .line 2 */
try { // :try_start_0
	 (( k.b1 ) p0 ).c ( ); // invoke-virtual {p0}, Lk/b1;->c()Ljava/nio/charset/Charset;
	 k.e1.e .a ( v0,v1 );
	 /* .line 3 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 4 */
	 k.e1.e .a ( v0 );
	 /* :catchall_0 */
	 /* move-exception v1 */
	 k.e1.e .a ( v0 );
	 /* throw v1 */
} // .end method
