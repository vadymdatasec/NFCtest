public class e.f.b.b.i extends e.f.b.b.u0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/b/b/u0<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public Boolean b;
public final java.lang.Object c; //synthetic
/* # direct methods */
public e.f.b.b.i ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.c = p1;
	 /* invoke-direct {p0}, Le/f/b/b/u0;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public Boolean hasNext ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Le/f/b/b/i;->b:Z */
	 /* xor-int/lit8 v0, v0, 0x1 */
} // .end method
public java.lang.Object next ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()TT;" */
	 /* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Le/f/b/b/i;->b:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Le/f/b/b/i;->b:Z */
/* .line 3 */
v0 = this.c;
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/util/NoSuchElementException; */
/* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
/* throw v0 */
} // .end method
