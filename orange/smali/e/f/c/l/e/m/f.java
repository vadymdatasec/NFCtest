public class e.f.c.l.e.m.f implements e.f.c.l.e.m.u1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final a;
	 public final java.lang.String b;
	 public final java.lang.String c;
	 /* # direct methods */
	 public e.f.c.l.e.m.f ( ) {
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
		 (( e.f.c.l.e.m.f ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/f;->d()[B
		 /* if-nez v0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
	 } // :cond_0
	 e.f.c.l.e.o.g2 .c ( );
	 /* .line 3 */
	 (( e.f.c.l.e.o.f2 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/l/e/o/f2;->a([B)Le/f/c/l/e/o/f2;
	 v0 = this.b;
	 /* .line 4 */
	 (( e.f.c.l.e.o.f2 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/l/e/o/f2;->a(Ljava/lang/String;)Le/f/c/l/e/o/f2;
	 /* .line 5 */
	 (( e.f.c.l.e.o.f2 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/o/f2;->a()Le/f/c/l/e/o/g2;
} // :goto_0
} // .end method
public java.io.InputStream c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( e.f.c.l.e.m.f ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/f;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* new-instance v0, Ljava/io/ByteArrayInputStream; */
v1 = this.a;
/* invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
} // :goto_0
} // .end method
public final d ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( e.f.c.l.e.m.f ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/f;->e()Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
try { // :try_start_0
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3 */
try { // :try_start_1
	 /* new-instance v2, Ljava/util/zip/GZIPOutputStream; */
	 /* invoke-direct {v2, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
	 /* .line 4 */
	 try { // :try_start_2
		 v3 = this.a;
		 (( java.util.zip.GZIPOutputStream ) v2 ).write ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/zip/GZIPOutputStream;->write([B)V
		 /* .line 5 */
		 (( java.util.zip.GZIPOutputStream ) v2 ).finish ( ); // invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->finish()V
		 /* .line 6 */
		 (( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* .line 7 */
		 try { // :try_start_3
			 (( java.util.zip.GZIPOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->close()V
			 /* :try_end_3 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
			 try { // :try_start_4
				 (( java.io.ByteArrayOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
				 /* :try_end_4 */
				 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
				 /* :catchall_0 */
				 /* move-exception v3 */
				 /* .line 8 */
				 try { // :try_start_5
					 (( java.util.zip.GZIPOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->close()V
					 /* :try_end_5 */
					 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
					 /* :catchall_1 */
					 try { // :try_start_6
						 /* throw v3 */
						 /* :try_end_6 */
						 /* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
						 /* :catchall_2 */
						 /* move-exception v2 */
						 try { // :try_start_7
							 (( java.io.ByteArrayOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
							 /* :try_end_7 */
							 /* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
							 /* :catchall_3 */
							 try { // :try_start_8
								 /* throw v2 */
								 /* :try_end_8 */
								 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_0 */
								 /* :catch_0 */
							 } // .end method
							 public final Boolean e ( ) {
								 /* .locals 1 */
								 /* .line 1 */
								 v0 = this.a;
								 if ( v0 != null) { // if-eqz v0, :cond_1
									 /* array-length v0, v0 */
									 /* if-nez v0, :cond_0 */
								 } // :cond_0
								 int v0 = 0; // const/4 v0, 0x0
							 } // :cond_1
						 } // :goto_0
						 int v0 = 1; // const/4 v0, 0x1
					 } // :goto_1
				 } // .end method
