public abstract class e.f.b.b.a extends e.f.b.b.v0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<E:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Le/f/b/b/v0<", */
	 /* "TE;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final Integer b;
public Integer c;
/* # direct methods */
public e.f.b.b.a ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Le/f/b/b/v0;-><init>()V */
	 /* .line 2 */
	 e.f.b.a.p .b ( p2,p1 );
	 /* .line 3 */
	 /* iput p1, p0, Le/f/b/b/a;->b:I */
	 /* .line 4 */
	 /* iput p2, p0, Le/f/b/b/a;->c:I */
	 return;
} // .end method
/* # virtual methods */
public abstract java.lang.Object a ( Integer p0 ) {
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(I)TE;" */
	 /* } */
} // .end annotation
} // .end method
public final Boolean hasNext ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/f/b/b/a;->c:I */
/* iget v1, p0, Le/f/b/b/a;->b:I */
/* if-ge v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean hasPrevious ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/b/b/a;->c:I */
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final java.lang.Object next ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TE;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( e.f.b.b.a ) p0 ).hasNext ( ); // invoke-virtual {p0}, Le/f/b/b/a;->hasNext()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget v0, p0, Le/f/b/b/a;->c:I */
/* add-int/lit8 v1, v0, 0x1 */
/* iput v1, p0, Le/f/b/b/a;->c:I */
(( e.f.b.b.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/a;->a(I)Ljava/lang/Object;
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/util/NoSuchElementException; */
/* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
/* throw v0 */
} // .end method
public final Integer nextIndex ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/b/b/a;->c:I */
} // .end method
public final java.lang.Object previous ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TE;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( e.f.b.b.a ) p0 ).hasPrevious ( ); // invoke-virtual {p0}, Le/f/b/b/a;->hasPrevious()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iget v0, p0, Le/f/b/b/a;->c:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Le/f/b/b/a;->c:I */
(( e.f.b.b.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/a;->a(I)Ljava/lang/Object;
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/util/NoSuchElementException; */
/* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
/* throw v0 */
} // .end method
public final Integer previousIndex ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/b/b/a;->c:I */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
