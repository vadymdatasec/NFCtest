public class org.apache.log4j.net.SocketNode implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static org.apache.log4j.Logger e;
	 public static java.lang.Class f; //synthetic
	 /* # instance fields */
	 public java.net.Socket b;
	 public org.apache.log4j.spi.LoggerRepository c;
	 public java.io.ObjectInputStream d;
	 /* # direct methods */
	 public static org.apache.log4j.net.SocketNode ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.net.SocketNode.f;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.net.SocketNode"; // const-string v0, "org.apache.log4j.net.SocketNode"
		 org.apache.log4j.net.SocketNode .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.net.SocketNode ( ) {
	 /* .locals 3 */
	 final String v0 = "Could not open ObjectInputStream to "; // const-string v0, "Could not open ObjectInputStream to "
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.b = p1;
	 /* .line 3 */
	 this.c = p2;
	 /* .line 4 */
	 try { // :try_start_0
		 /* new-instance p2, Ljava/io/ObjectInputStream; */
		 /* new-instance v1, Ljava/io/BufferedInputStream; */
		 (( java.net.Socket ) p1 ).getInputStream ( ); // invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;
		 /* invoke-direct {v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
		 /* invoke-direct {p2, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V */
		 this.d = p2;
		 /* :try_end_0 */
		 /* .catch Ljava/io/InterruptedIOException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p2 */
		 /* .line 5 */
		 v1 = org.apache.log4j.net.SocketNode.e;
		 /* new-instance v2, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( org.apache.log4j.Category ) v1 ).error ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
		 /* :catch_1 */
		 /* move-exception p2 */
		 /* .line 6 */
		 v1 = org.apache.log4j.net.SocketNode.e;
		 /* new-instance v2, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( org.apache.log4j.Category ) v1 ).error ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
		 /* :catch_2 */
		 /* move-exception p2 */
		 /* .line 7 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
		 /* .line 8 */
		 v1 = org.apache.log4j.net.SocketNode.e;
		 /* new-instance v2, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( org.apache.log4j.Category ) v1 ).error ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
	 } // :goto_0
	 return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 try { // :try_start_0
		 java.lang.Class .forName ( p0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* new-instance v0, Ljava/lang/NoClassDefFoundError; */
		 /* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
		 (( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
		 /* throw p0 */
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 6 */
		 final String v0 = "Closing connection."; // const-string v0, "Closing connection."
		 final String v1 = "Could not close connection."; // const-string v1, "Could not close connection."
		 /* .line 1 */
		 try { // :try_start_0
			 v2 = this.d;
			 if ( v2 != null) { // if-eqz v2, :cond_1
				 /* .line 2 */
			 } // :cond_0
		 } // :goto_0
		 v2 = this.d;
		 (( java.io.ObjectInputStream ) v2 ).readObject ( ); // invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
		 /* check-cast v2, Lorg/apache/log4j/spi/LoggingEvent; */
		 /* .line 3 */
		 v3 = this.c;
		 (( org.apache.log4j.spi.LoggingEvent ) v2 ).getLoggerName ( ); // invoke-virtual {v2}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
		 /* .line 4 */
		 (( org.apache.log4j.spi.LoggingEvent ) v2 ).getLevel ( ); // invoke-virtual {v2}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
		 (( org.apache.log4j.Category ) v3 ).getEffectiveLevel ( ); // invoke-virtual {v3}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
		 v4 = 		 (( org.apache.log4j.Priority ) v4 ).isGreaterOrEqual ( v5 ); // invoke-virtual {v4, v5}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 /* .line 5 */
			 (( org.apache.log4j.Category ) v3 ).callAppenders ( v2 ); // invoke-virtual {v3, v2}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
			 /* :try_end_0 */
			 /* .catch Ljava/io/EOFException; {:try_start_0 ..:try_end_0} :catch_a */
			 /* .catch Ljava/net/SocketException; {:try_start_0 ..:try_end_0} :catch_8 */
			 /* .catch Ljava/io/InterruptedIOException; {:try_start_0 ..:try_end_0} :catch_6 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_4 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 6 */
		 } // :cond_1
		 v0 = this.d;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 7 */
			 try { // :try_start_1
				 (( java.io.ObjectInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
				 /* :try_end_1 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* :catch_0 */
				 /* move-exception v0 */
				 /* .line 8 */
				 v2 = org.apache.log4j.net.SocketNode.e;
				 (( org.apache.log4j.Category ) v2 ).info ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V
				 /* .line 9 */
			 } // :cond_2
		 } // :goto_1
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_8
			 /* .line 10 */
		 } // :goto_2
		 try { // :try_start_2
			 (( java.net.Socket ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/net/Socket;->close()V
			 /* :try_end_2 */
			 /* .catch Ljava/io/InterruptedIOException; {:try_start_2 ..:try_end_2} :catch_1 */
			 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_c */
			 /* goto/16 :goto_8 */
			 /* .line 11 */
			 /* :catch_1 */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
			 /* goto/16 :goto_8 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* goto/16 :goto_9 */
			 /* :catch_2 */
			 /* move-exception v0 */
			 /* .line 12 */
			 try { // :try_start_3
				 v2 = org.apache.log4j.net.SocketNode.e;
				 final String v3 = "Unexpected exception.Closing conneciton."; // const-string v3, "Unexpected exception.Closing conneciton."
				 (( org.apache.log4j.Category ) v2 ).error ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
				 /* :try_end_3 */
				 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
				 /* .line 13 */
				 v0 = this.d;
				 if ( v0 != null) { // if-eqz v0, :cond_3
					 /* .line 14 */
					 try { // :try_start_4
						 (( java.io.ObjectInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
						 /* :try_end_4 */
						 /* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_3 */
						 /* :catch_3 */
						 /* move-exception v0 */
						 /* .line 15 */
						 v2 = org.apache.log4j.net.SocketNode.e;
						 (( org.apache.log4j.Category ) v2 ).info ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V
						 /* .line 16 */
					 } // :cond_3
				 } // :goto_3
				 v0 = this.b;
				 if ( v0 != null) { // if-eqz v0, :cond_8
					 /* :catch_4 */
					 /* move-exception v2 */
					 /* .line 17 */
					 try { // :try_start_5
						 v3 = org.apache.log4j.net.SocketNode.e;
						 /* new-instance v4, Ljava/lang/StringBuffer; */
						 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
						 final String v5 = "Caught java.io.IOException: "; // const-string v5, "Caught java.io.IOException: "
						 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
						 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
						 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
						 (( org.apache.log4j.Category ) v3 ).info ( v2 ); // invoke-virtual {v3, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
						 /* .line 18 */
						 v2 = org.apache.log4j.net.SocketNode.e;
						 (( org.apache.log4j.Category ) v2 ).info ( v0 ); // invoke-virtual {v2, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
						 /* :try_end_5 */
						 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
						 /* .line 19 */
						 v0 = this.d;
						 if ( v0 != null) { // if-eqz v0, :cond_4
							 /* .line 20 */
							 try { // :try_start_6
								 (( java.io.ObjectInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
								 /* :try_end_6 */
								 /* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_5 */
								 /* :catch_5 */
								 /* move-exception v0 */
								 /* .line 21 */
								 v2 = org.apache.log4j.net.SocketNode.e;
								 (( org.apache.log4j.Category ) v2 ).info ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V
								 /* .line 22 */
							 } // :cond_4
						 } // :goto_4
						 v0 = this.b;
						 if ( v0 != null) { // if-eqz v0, :cond_8
							 /* :catch_6 */
							 /* move-exception v2 */
							 /* .line 23 */
							 try { // :try_start_7
								 java.lang.Thread .currentThread ( );
								 (( java.lang.Thread ) v3 ).interrupt ( ); // invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
								 /* .line 24 */
								 v3 = org.apache.log4j.net.SocketNode.e;
								 /* new-instance v4, Ljava/lang/StringBuffer; */
								 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
								 final String v5 = "Caught java.io.InterruptedIOException: "; // const-string v5, "Caught java.io.InterruptedIOException: "
								 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
								 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
								 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
								 (( org.apache.log4j.Category ) v3 ).info ( v2 ); // invoke-virtual {v3, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
								 /* .line 25 */
								 v2 = org.apache.log4j.net.SocketNode.e;
								 (( org.apache.log4j.Category ) v2 ).info ( v0 ); // invoke-virtual {v2, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
								 /* :try_end_7 */
								 /* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
								 /* .line 26 */
								 v0 = this.d;
								 if ( v0 != null) { // if-eqz v0, :cond_5
									 /* .line 27 */
									 try { // :try_start_8
										 (( java.io.ObjectInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
										 /* :try_end_8 */
										 /* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_7 */
										 /* :catch_7 */
										 /* move-exception v0 */
										 /* .line 28 */
										 v2 = org.apache.log4j.net.SocketNode.e;
										 (( org.apache.log4j.Category ) v2 ).info ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V
										 /* .line 29 */
									 } // :cond_5
								 } // :goto_5
								 v0 = this.b;
								 if ( v0 != null) { // if-eqz v0, :cond_8
									 /* goto/16 :goto_2 */
									 /* .line 30 */
									 /* :catch_8 */
									 try { // :try_start_9
										 v0 = org.apache.log4j.net.SocketNode.e;
										 final String v2 = "Caught java.net.SocketException closing conneciton."; // const-string v2, "Caught java.net.SocketException closing conneciton."
										 (( org.apache.log4j.Category ) v0 ).info ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
										 /* :try_end_9 */
										 /* .catchall {:try_start_9 ..:try_end_9} :catchall_0 */
										 /* .line 31 */
										 v0 = this.d;
										 if ( v0 != null) { // if-eqz v0, :cond_6
											 /* .line 32 */
											 try { // :try_start_a
												 (( java.io.ObjectInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
												 /* :try_end_a */
												 /* .catch Ljava/lang/Exception; {:try_start_a ..:try_end_a} :catch_9 */
												 /* :catch_9 */
												 /* move-exception v0 */
												 /* .line 33 */
												 v2 = org.apache.log4j.net.SocketNode.e;
												 (( org.apache.log4j.Category ) v2 ).info ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V
												 /* .line 34 */
											 } // :cond_6
										 } // :goto_6
										 v0 = this.b;
										 if ( v0 != null) { // if-eqz v0, :cond_8
											 /* goto/16 :goto_2 */
											 /* .line 35 */
											 /* :catch_a */
											 try { // :try_start_b
												 v0 = org.apache.log4j.net.SocketNode.e;
												 final String v2 = "Caught java.io.EOFException closing conneciton."; // const-string v2, "Caught java.io.EOFException closing conneciton."
												 (( org.apache.log4j.Category ) v0 ).info ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
												 /* :try_end_b */
												 /* .catchall {:try_start_b ..:try_end_b} :catchall_0 */
												 /* .line 36 */
												 v0 = this.d;
												 if ( v0 != null) { // if-eqz v0, :cond_7
													 /* .line 37 */
													 try { // :try_start_c
														 (( java.io.ObjectInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
														 /* :try_end_c */
														 /* .catch Ljava/lang/Exception; {:try_start_c ..:try_end_c} :catch_b */
														 /* :catch_b */
														 /* move-exception v0 */
														 /* .line 38 */
														 v2 = org.apache.log4j.net.SocketNode.e;
														 (( org.apache.log4j.Category ) v2 ).info ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V
														 /* .line 39 */
													 } // :cond_7
												 } // :goto_7
												 v0 = this.b;
												 if ( v0 != null) { // if-eqz v0, :cond_8
													 /* goto/16 :goto_2 */
													 /* :catch_c */
												 } // :cond_8
											 } // :goto_8
											 return;
											 /* .line 40 */
										 } // :goto_9
										 v2 = this.d;
										 if ( v2 != null) { // if-eqz v2, :cond_9
											 /* .line 41 */
											 try { // :try_start_d
												 (( java.io.ObjectInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
												 /* :try_end_d */
												 /* .catch Ljava/lang/Exception; {:try_start_d ..:try_end_d} :catch_d */
												 /* :catch_d */
												 /* move-exception v2 */
												 /* .line 42 */
												 v3 = org.apache.log4j.net.SocketNode.e;
												 (( org.apache.log4j.Category ) v3 ).info ( v1, v2 ); // invoke-virtual {v3, v1, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V
												 /* .line 43 */
											 } // :cond_9
										 } // :goto_a
										 v1 = this.b;
										 if ( v1 != null) { // if-eqz v1, :cond_a
											 /* .line 44 */
											 try { // :try_start_e
												 (( java.net.Socket ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/net/Socket;->close()V
												 /* :try_end_e */
												 /* .catch Ljava/io/InterruptedIOException; {:try_start_e ..:try_end_e} :catch_e */
												 /* .catch Ljava/io/IOException; {:try_start_e ..:try_end_e} :catch_f */
												 /* .line 45 */
												 /* :catch_e */
												 java.lang.Thread .currentThread ( );
												 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
												 /* .line 46 */
												 /* :catch_f */
											 } // :cond_a
										 } // :goto_b
										 /* throw v0 */
									 } // .end method
