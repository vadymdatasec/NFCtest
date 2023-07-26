public class e.f.c.l.e.m.d0 implements java.util.Comparator {
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
public e.f.c.l.e.m.d0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( java.io.File p0, java.io.File p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 (( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
	 (( java.io.File ) p2 ).getName ( ); // invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;
	 p1 = 	 (( java.lang.String ) p1 ).compareTo ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p1, Ljava/io/File; */
	 /* check-cast p2, Ljava/io/File; */
	 p1 = 	 (( e.f.c.l.e.m.d0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/c/l/e/m/d0;->a(Ljava/io/File;Ljava/io/File;)I
} // .end method
