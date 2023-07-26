public class c.e.c extends c.e.h {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/h<", */
	 /* "TE;TE;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.e.d d; //synthetic
/* # direct methods */
public c.e.c ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.d = p1;
	 /* invoke-direct {p0}, Lc/e/h;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( java.lang.Object p0 ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = this.d;
	 p1 = 	 (( c.e.d ) v0 ).indexOf ( p1 ); // invoke-virtual {v0, p1}, Lc/e/d;->indexOf(Ljava/lang/Object;)I
} // .end method
public java.lang.Object a ( Integer p0, Integer p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p2 = this.d;
	 p2 = this.c;
	 /* aget-object p1, p2, p1 */
} // .end method
public java.lang.Object a ( Integer p0, java.lang.Object p1 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(ITE;)TE;" */
	 /* } */
} // .end annotation
/* .line 4 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String p2 = "not a map"; // const-string p2, "not a map"
/* invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 6 */
v0 = this.d;
(( c.e.d ) v0 ).clear ( ); // invoke-virtual {v0}, Lc/e/d;->clear()V
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.d;
(( c.e.d ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/e/d;->c(I)Ljava/lang/Object;
return;
} // .end method
public void a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;TE;)V" */
/* } */
} // .end annotation
/* .line 3 */
p2 = this.d;
(( c.e.d ) p2 ).add ( p1 ); // invoke-virtual {p2, p1}, Lc/e/d;->add(Ljava/lang/Object;)Z
return;
} // .end method
public Integer b ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
p1 = (( c.e.d ) v0 ).indexOf ( p1 ); // invoke-virtual {v0, p1}, Lc/e/d;->indexOf(Ljava/lang/Object;)I
} // .end method
public java.util.Map b ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "TE;TE;>;" */
/* } */
} // .end annotation
/* .line 2 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "not a map"; // const-string v1, "not a map"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
/* iget v0, v0, Lc/e/d;->d:I */
} // .end method
