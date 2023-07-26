public class e.f.c.l.e.m.p1 implements e.f.c.l.e.m.u1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.io.File a;
	 public final java.lang.String b;
	 public final java.lang.String c;
	 /* # direct methods */
	 public e.f.c.l.e.m.p1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 this.c = p2;
		 /* .line 4 */
		 this.a = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
	 } // .end method
	 public e.f.c.l.e.o.g2 b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( e.f.c.l.e.m.p1 ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/p1;->d()[B
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 e.f.c.l.e.o.g2 .c ( );
			 /* .line 3 */
			 (( e.f.c.l.e.o.f2 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/l/e/o/f2;->a([B)Le/f/c/l/e/o/f2;
			 v0 = this.b;
			 /* .line 4 */
			 (( e.f.c.l.e.o.f2 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/l/e/o/f2;->a(Ljava/lang/String;)Le/f/c/l/e/o/f2;
			 /* .line 5 */
			 (( e.f.c.l.e.o.f2 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/o/f2;->a()Le/f/c/l/e/o/g2;
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // .end method
public java.io.InputStream c ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 v0 = this.a;
	 v0 = 	 (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.a;
		 v0 = 		 (( java.io.File ) v0 ).isFile ( ); // invoke-virtual {v0}, Ljava/io/File;->isFile()Z
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 try { // :try_start_0
		 /* new-instance v0, Ljava/io/FileInputStream; */
		 v2 = this.a;
		 /* invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
		 /* :try_end_0 */
		 /* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
	 } // :cond_1
} // :goto_0
} // .end method
public final d ( ) {
/* .locals 7 */
/* const/16 v0, 0x2000 */
/* new-array v0, v0, [B */
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
try { // :try_start_0
	 (( e.f.c.l.e.m.p1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/p1;->c()Ljava/io/InputStream;
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 2 */
	 try { // :try_start_1
		 /* new-instance v3, Ljava/io/ByteArrayOutputStream; */
		 /* invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_4 */
		 /* .line 3 */
		 try { // :try_start_2
			 /* new-instance v4, Ljava/util/zip/GZIPOutputStream; */
			 /* invoke-direct {v4, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V */
			 /* if-nez v2, :cond_1 */
			 /* .line 4 */
			 (( java.util.zip.GZIPOutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/util/zip/GZIPOutputStream;->close()V
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
			 try { // :try_start_3
				 (( java.io.ByteArrayOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
				 /* :try_end_3 */
				 /* .catchall {:try_start_3 ..:try_end_3} :catchall_4 */
				 if ( v2 != null) { // if-eqz v2, :cond_0
					 try { // :try_start_4
						 (( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
						 /* :try_end_4 */
						 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
					 } // :cond_0
					 /* .line 5 */
				 } // :cond_1
			 } // :goto_0
			 try { // :try_start_5
				 v5 = 				 (( java.io.InputStream ) v2 ).read ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I
				 /* if-lez v5, :cond_2 */
				 int v6 = 0; // const/4 v6, 0x0
				 /* .line 6 */
				 (( java.util.zip.GZIPOutputStream ) v4 ).write ( v0, v6, v5 ); // invoke-virtual {v4, v0, v6, v5}, Ljava/util/zip/GZIPOutputStream;->write([BII)V
				 /* .line 7 */
			 } // :cond_2
			 (( java.util.zip.GZIPOutputStream ) v4 ).finish ( ); // invoke-virtual {v4}, Ljava/util/zip/GZIPOutputStream;->finish()V
			 /* .line 8 */
			 (( java.io.ByteArrayOutputStream ) v3 ).toByteArray ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
			 /* :try_end_5 */
			 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
			 /* .line 9 */
			 try { // :try_start_6
				 (( java.util.zip.GZIPOutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/util/zip/GZIPOutputStream;->close()V
				 /* :try_end_6 */
				 /* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
				 try { // :try_start_7
					 (( java.io.ByteArrayOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
					 /* :try_end_7 */
					 /* .catchall {:try_start_7 ..:try_end_7} :catchall_4 */
					 if ( v2 != null) { // if-eqz v2, :cond_3
						 try { // :try_start_8
							 (( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
							 /* :try_end_8 */
							 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_0 */
						 } // :cond_3
						 /* :catchall_0 */
						 /* move-exception v0 */
						 /* .line 10 */
						 try { // :try_start_9
							 (( java.util.zip.GZIPOutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/util/zip/GZIPOutputStream;->close()V
							 /* :try_end_9 */
							 /* .catchall {:try_start_9 ..:try_end_9} :catchall_1 */
							 /* :catchall_1 */
							 try { // :try_start_a
								 /* throw v0 */
								 /* :try_end_a */
								 /* .catchall {:try_start_a ..:try_end_a} :catchall_2 */
								 /* :catchall_2 */
								 /* move-exception v0 */
								 try { // :try_start_b
									 (( java.io.ByteArrayOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V
									 /* :try_end_b */
									 /* .catchall {:try_start_b ..:try_end_b} :catchall_3 */
									 /* :catchall_3 */
									 try { // :try_start_c
										 /* throw v0 */
										 /* :try_end_c */
										 /* .catchall {:try_start_c ..:try_end_c} :catchall_4 */
										 /* :catchall_4 */
										 /* move-exception v0 */
										 if ( v2 != null) { // if-eqz v2, :cond_4
											 try { // :try_start_d
												 (( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
												 /* :try_end_d */
												 /* .catchall {:try_start_d ..:try_end_d} :catchall_5 */
												 /* :catchall_5 */
											 } // :cond_4
											 try { // :try_start_e
												 /* throw v0 */
												 /* :try_end_e */
												 /* .catch Ljava/io/IOException; {:try_start_e ..:try_end_e} :catch_0 */
												 /* :catch_0 */
											 } // .end method
