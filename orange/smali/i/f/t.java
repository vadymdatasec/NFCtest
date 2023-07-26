public abstract class i.f.t implements java.util.Iterator implements i.h.c.q.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Iterator<", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;", */
	 /* "Li/h/c/q/a;" */
	 /* } */
} // .end annotation
/* # direct methods */
public i.f.t ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public abstract Integer a ( ) {
} // .end method
public final java.lang.Integer next ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = 	 (( i.f.t ) p0 ).a ( ); // invoke-virtual {p0}, Li/f/t;->a()I
	 java.lang.Integer .valueOf ( v0 );
} // .end method
public java.lang.Object next ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 (( i.f.t ) p0 ).next ( ); // invoke-virtual {p0}, Li/f/t;->next()Ljava/lang/Integer;
} // .end method
public void remove ( ) {
	 /* .locals 2 */
	 /* new-instance v0, Ljava/lang/UnsupportedOperationException; */
	 final String v1 = "Operation is not supported for read-only collection"; // const-string v1, "Operation is not supported for read-only collection"
	 /* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
