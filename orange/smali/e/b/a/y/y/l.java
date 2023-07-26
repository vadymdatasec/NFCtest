public class e.b.a.y.y.l implements e.b.a.y.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/d<", */
	 /* "Ljava/nio/ByteBuffer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.b.a.y.y.l ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public Boolean a ( java.lang.Object p0, java.io.File p1, Object p2 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p1, Ljava/nio/ByteBuffer; */
	 p1 = 	 (( e.b.a.y.y.l ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/y/l;->a(Ljava/nio/ByteBuffer;Ljava/io/File;Le/b/a/y/r;)Z
} // .end method
public Boolean a ( java.nio.ByteBuffer p0, java.io.File p1, Object p2 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 try { // :try_start_0
		 e.b.a.e0.c .a ( p1,p2 );
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 int p1 = 1; // const/4 p1, 0x1
		 /* :catch_0 */
		 /* move-exception p1 */
		 int p2 = 3; // const/4 p2, 0x3
		 final String p3 = "ByteBufferEncoder"; // const-string p3, "ByteBufferEncoder"
		 /* .line 3 */
		 p2 = 		 android.util.Log .isLoggable ( p3,p2 );
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 final String p2 = "Failed to write data"; // const-string p2, "Failed to write data"
			 /* .line 4 */
			 android.util.Log .d ( p3,p2,p1 );
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :goto_0
} // .end method
