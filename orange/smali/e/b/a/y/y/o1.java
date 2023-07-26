public class e.b.a.y.y.o1 implements e.b.a.y.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/d<", */
	 /* "Ljava/io/InputStream;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.y.x.f1.b a;
/* # direct methods */
public e.b.a.y.y.o1 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.a = p1;
	 return;
} // .end method
/* # virtual methods */
public Boolean a ( java.io.InputStream p0, java.io.File p1, Object p2 ) {
	 /* .locals 4 */
	 final String p3 = "StreamEncoder"; // const-string p3, "StreamEncoder"
	 /* .line 2 */
	 v0 = this.a;
	 /* const-class v1, [B */
	 /* const/high16 v2, 0x10000 */
	 /* check-cast v0, [B */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 3 */
	 try { // :try_start_0
		 /* new-instance v3, Ljava/io/FileOutputStream; */
		 /* invoke-direct {v3, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
		 /* .line 4 */
	 } // :goto_0
	 try { // :try_start_1
		 p2 = 		 (( java.io.InputStream ) p1 ).read ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I
		 int v2 = -1; // const/4 v2, -0x1
		 /* if-eq p2, v2, :cond_0 */
		 /* .line 5 */
		 (( java.io.OutputStream ) v3 ).write ( v0, v1, p2 ); // invoke-virtual {v3, v0, v1, p2}, Ljava/io/OutputStream;->write([BII)V
		 /* .line 6 */
	 } // :cond_0
	 (( java.io.OutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
	 /* :try_end_1 */
	 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 7 */
	 try { // :try_start_2
		 (( java.io.OutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
		 /* :try_end_2 */
		 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_2 */
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* move-object v2, v3 */
		 /* :catch_0 */
		 /* move-exception p1 */
		 /* move-object v2, v3 */
		 /* :catchall_1 */
		 /* move-exception p1 */
		 /* :catch_1 */
		 /* move-exception p1 */
	 } // :goto_1
	 int p2 = 3; // const/4 p2, 0x3
	 /* .line 8 */
	 try { // :try_start_3
		 p2 = 		 android.util.Log .isLoggable ( p3,p2 );
		 if ( p2 != null) { // if-eqz p2, :cond_1
			 final String p2 = "Failed to encode data onto the OutputStream"; // const-string p2, "Failed to encode data onto the OutputStream"
			 /* .line 9 */
			 android.util.Log .d ( p3,p2,p1 );
			 /* :try_end_3 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
		 } // :cond_1
		 if ( v2 != null) { // if-eqz v2, :cond_2
			 /* .line 10 */
			 try { // :try_start_4
				 (( java.io.OutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
				 /* :try_end_4 */
				 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_2 */
				 /* .line 11 */
				 /* :catch_2 */
			 } // :cond_2
		 } // :goto_2
		 p1 = this.a;
	 } // :goto_3
	 if ( v2 != null) { // if-eqz v2, :cond_3
		 /* .line 12 */
		 try { // :try_start_5
			 (( java.io.OutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
			 /* :try_end_5 */
			 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_3 */
			 /* .line 13 */
			 /* :catch_3 */
		 } // :cond_3
		 p2 = this.a;
		 /* .line 14 */
		 /* throw p1 */
	 } // .end method
	 public Boolean a ( java.lang.Object p0, java.io.File p1, Object p2 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 /* check-cast p1, Ljava/io/InputStream; */
		 p1 = 		 (( e.b.a.y.y.o1 ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/y/o1;->a(Ljava/io/InputStream;Ljava/io/File;Le/b/a/y/r;)Z
	 } // .end method
