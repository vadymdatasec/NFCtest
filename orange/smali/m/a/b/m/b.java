public class m.a.b.m.b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.net.Socket b;
	 public java.io.DataInputStream c;
	 public java.io.DataOutputStream d;
	 public org.apache.log4j.varia.ExternallyRolledFileAppender e;
	 /* # direct methods */
	 public m.a.b.m.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 this.e = p2;
		 /* .line 4 */
		 try { // :try_start_0
			 /* new-instance p2, Ljava/io/DataInputStream; */
			 (( java.net.Socket ) p1 ).getInputStream ( ); // invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;
			 /* invoke-direct {p2, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
			 this.c = p2;
			 /* .line 5 */
			 /* new-instance p2, Ljava/io/DataOutputStream; */
			 (( java.net.Socket ) p1 ).getOutputStream ( ); // invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
			 /* invoke-direct {p2, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
			 this.d = p2;
			 /* :try_end_0 */
			 /* .catch Ljava/io/InterruptedIOException; {:try_start_0 ..:try_end_0} :catch_2 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 /* .line 6 */
			 (( java.lang.RuntimeException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/RuntimeException;->printStackTrace()V
			 /* :catch_1 */
			 /* move-exception p1 */
			 /* .line 7 */
			 (( java.io.IOException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V
			 /* :catch_2 */
			 /* move-exception p1 */
			 /* .line 8 */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) p2 ).interrupt ( ); // invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V
			 /* .line 9 */
			 (( java.io.InterruptedIOException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/io/InterruptedIOException;->printStackTrace()V
		 } // :goto_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.c;
			 (( java.io.DataInputStream ) v0 ).readUTF ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 final String v1 = "Got external roll over signal."; // const-string v1, "Got external roll over signal."
			 /* .line 2 */
			 org.apache.log4j.helpers.LogLog .debug ( v1 );
			 final String v1 = "RollOver"; // const-string v1, "RollOver"
			 /* .line 3 */
			 v0 = 			 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 4 */
				 v0 = this.e;
				 /* monitor-enter v0 */
				 /* :try_end_0 */
				 /* .catch Ljava/io/InterruptedIOException; {:try_start_0 ..:try_end_0} :catch_2 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .line 5 */
				 try { // :try_start_1
					 v1 = this.e;
					 (( org.apache.log4j.RollingFileAppender ) v1 ).rollOver ( ); // invoke-virtual {v1}, Lorg/apache/log4j/RollingFileAppender;->rollOver()V
					 /* .line 6 */
					 /* monitor-exit v0 */
					 /* :try_end_1 */
					 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
					 /* .line 7 */
					 try { // :try_start_2
						 v0 = this.d;
						 final String v1 = "OK"; // const-string v1, "OK"
						 (( java.io.DataOutputStream ) v0 ).writeUTF ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
						 /* :try_end_2 */
						 /* .catch Ljava/io/InterruptedIOException; {:try_start_2 ..:try_end_2} :catch_2 */
						 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
						 /* .catch Ljava/lang/RuntimeException; {:try_start_2 ..:try_end_2} :catch_0 */
						 /* :catchall_0 */
						 /* move-exception v1 */
						 /* .line 8 */
						 try { // :try_start_3
							 /* monitor-exit v0 */
							 /* :try_end_3 */
							 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
							 try { // :try_start_4
								 /* throw v1 */
								 /* .line 9 */
							 } // :cond_0
							 v0 = this.d;
							 final String v1 = "Expecting [RollOver] string."; // const-string v1, "Expecting [RollOver] string."
							 (( java.io.DataOutputStream ) v0 ).writeUTF ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
							 /* .line 10 */
						 } // :goto_0
						 v0 = this.d;
						 (( java.io.DataOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V
						 /* :try_end_4 */
						 /* .catch Ljava/io/InterruptedIOException; {:try_start_4 ..:try_end_4} :catch_2 */
						 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
						 /* .catch Ljava/lang/RuntimeException; {:try_start_4 ..:try_end_4} :catch_0 */
						 /* :catch_0 */
						 /* move-exception v0 */
						 final String v1 = "Unexpected exception.Exiting HUPNode."; // const-string v1, "Unexpected exception.Exiting HUPNode."
						 /* .line 11 */
						 org.apache.log4j.helpers.LogLog .error ( v1,v0 );
						 /* :catch_1 */
						 /* move-exception v0 */
						 final String v1 = "Unexpected exception.Exiting HUPNode."; // const-string v1, "Unexpected exception.Exiting HUPNode."
						 /* .line 12 */
						 org.apache.log4j.helpers.LogLog .error ( v1,v0 );
						 /* :catch_2 */
						 /* move-exception v0 */
						 /* .line 13 */
						 java.lang.Thread .currentThread ( );
						 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
						 final String v1 = "Unexpected exception.Exiting HUPNode."; // const-string v1, "Unexpected exception.Exiting HUPNode."
						 /* .line 14 */
						 org.apache.log4j.helpers.LogLog .error ( v1,v0 );
					 } // :goto_1
					 return;
				 } // .end method
