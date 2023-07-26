public class k.e1.c implements java.util.Comparator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Comparator<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public k.e1.c ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p1 = 	 (( java.lang.String ) p1 ).compareTo ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p1, Ljava/lang/String; */
	 /* check-cast p2, Ljava/lang/String; */
	 p1 = 	 (( k.e1.c ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lk/e1/c;->a(Ljava/lang/String;Ljava/lang/String;)I
} // .end method
