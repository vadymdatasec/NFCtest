public class m.a.b.h.m implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.net.Socket b;
	 public final m.a.b.h.n c; //synthetic
	 /* # direct methods */
	 public m.a.b.h.m ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 m.a.b.h.n .a ( );
		 final String v1 = "Starting to get data"; // const-string v1, "Starting to get data"
		 (( org.apache.log4j.Category ) v0 ).debug ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
		 /* .line 2 */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/io/ObjectInputStream; */
			 v1 = this.b;
			 (( java.net.Socket ) v1 ).getInputStream ( ); // invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;
			 /* invoke-direct {v0, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V */
			 /* .line 3 */
		 } // :goto_0
		 (( java.io.ObjectInputStream ) v0 ).readObject ( ); // invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
		 /* check-cast v1, Lorg/apache/log4j/spi/LoggingEvent; */
		 /* .line 4 */
		 v2 = this.c;
		 m.a.b.h.n .a ( v2 );
		 /* new-instance v3, Lm/a/b/h/j; */
		 /* invoke-direct {v3, v1}, Lm/a/b/h/j;-><init>(Lorg/apache/log4j/spi/LoggingEvent;)V */
		 (( m.a.b.h.r ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lm/a/b/h/r;->a(Lm/a/b/h/j;)V
		 /* :try_end_0 */
		 /* .catch Ljava/io/EOFException; {:try_start_0 ..:try_end_0} :catch_3 */
		 /* .catch Ljava/net/SocketException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 5 */
		 m.a.b.h.n .a ( );
		 final String v2 = "Got ClassNotFoundException, closing connection"; // const-string v2, "Got ClassNotFoundException, closing connection"
		 (( org.apache.log4j.Category ) v1 ).warn ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;Ljava/lang/Throwable;)V
		 /* :catch_1 */
		 /* move-exception v0 */
		 /* .line 6 */
		 m.a.b.h.n .a ( );
		 final String v2 = "Got IOException, closing connection"; // const-string v2, "Got IOException, closing connection"
		 (( org.apache.log4j.Category ) v1 ).warn ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;Ljava/lang/Throwable;)V
		 /* .line 7 */
		 /* :catch_2 */
		 m.a.b.h.n .a ( );
		 final String v1 = "Caught SocketException, closing connection"; // const-string v1, "Caught SocketException, closing connection"
		 (( org.apache.log4j.Category ) v0 ).info ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
		 /* .line 8 */
		 /* :catch_3 */
		 m.a.b.h.n .a ( );
		 final String v1 = "Reached EOF, closing connection"; // const-string v1, "Reached EOF, closing connection"
		 (( org.apache.log4j.Category ) v0 ).info ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
		 /* .line 9 */
	 } // :goto_1
	 try { // :try_start_1
		 v0 = this.b;
		 (( java.net.Socket ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/net/Socket;->close()V
		 /* :try_end_1 */
		 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_4 */
		 /* :catch_4 */
		 /* move-exception v0 */
		 /* .line 10 */
		 m.a.b.h.n .a ( );
		 final String v2 = "Error closing connection"; // const-string v2, "Error closing connection"
		 (( org.apache.log4j.Category ) v1 ).warn ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;Ljava/lang/Throwable;)V
	 } // :goto_2
	 return;
} // .end method
