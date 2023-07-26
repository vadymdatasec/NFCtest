public class e.f.c.l.e.m.h implements java.util.Comparator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Comparator<", */
	 /* "Ljava/io/File;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.f.c.l.e.m.h ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( java.io.File p0, java.io.File p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 (( java.io.File ) p1 ).lastModified ( ); // invoke-virtual {p1}, Ljava/io/File;->lastModified()J
	 /* move-result-wide v0 */
	 (( java.io.File ) p2 ).lastModified ( ); // invoke-virtual {p2}, Ljava/io/File;->lastModified()J
	 /* move-result-wide p1 */
	 /* sub-long/2addr v0, p1 */
	 /* long-to-int p1, v0 */
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p1, Ljava/io/File; */
	 /* check-cast p2, Ljava/io/File; */
	 p1 = 	 (( e.f.c.l.e.m.h ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/c/l/e/m/h;->a(Ljava/io/File;Ljava/io/File;)I
} // .end method
