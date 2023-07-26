public class e.b.a.y.z.i.g implements e.b.a.y.u {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/u<", */
	 /* "Le/b/a/y/z/i/f;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.b.a.y.z.i.g ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public e.b.a.y.c a ( Object p0 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 p1 = e.b.a.y.c.b;
} // .end method
public Boolean a ( e.b.a.y.x.y0 p0, java.io.File p1, Object p2 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "Le/b/a/y/z/i/f;", */
	 /* ">;", */
	 /* "Ljava/io/File;", */
	 /* "Le/b/a/y/r;", */
	 /* ")Z" */
	 /* } */
} // .end annotation
/* .line 3 */
/* check-cast p1, Le/b/a/y/z/i/f; */
/* .line 4 */
try { // :try_start_0
	 (( e.b.a.y.z.i.f ) p1 ).c ( ); // invoke-virtual {p1}, Le/b/a/y/z/i/f;->c()Ljava/nio/ByteBuffer;
	 e.b.a.e0.c .a ( p1,p2 );
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 int p1 = 1; // const/4 p1, 0x1
	 /* :catch_0 */
	 /* move-exception p1 */
	 int p2 = 5; // const/4 p2, 0x5
	 final String p3 = "GifEncoder"; // const-string p3, "GifEncoder"
	 /* .line 5 */
	 p2 = 	 android.util.Log .isLoggable ( p3,p2 );
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 final String p2 = "Failed to encode GIF drawable data"; // const-string p2, "Failed to encode GIF drawable data"
		 /* .line 6 */
		 android.util.Log .w ( p3,p2,p1 );
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean a ( java.lang.Object p0, java.io.File p1, Object p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Le/b/a/y/x/y0; */
p1 = (( e.b.a.y.z.i.g ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/z/i/g;->a(Le/b/a/y/x/y0;Ljava/io/File;Le/b/a/y/r;)Z
} // .end method
