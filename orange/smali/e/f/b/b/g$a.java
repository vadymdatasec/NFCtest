public class e.f.b.b.g$a extends e.f.b.b.g {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/f/b/b/g; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* # instance fields */
public final transient Integer d;
public final transient Integer e;
public final e.f.b.b.g f; //synthetic
/* # direct methods */
public e.f.b.b.g$a ( ) {
/* .locals 0 */
/* .line 1 */
this.f = p1;
/* invoke-direct {p0}, Le/f/b/b/g;-><init>()V */
/* .line 2 */
/* iput p2, p0, Le/f/b/b/g$a;->d:I */
/* .line 3 */
/* iput p3, p0, Le/f/b/b/g$a;->e:I */
return;
} // .end method
/* # virtual methods */
public java.lang.Object a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
(( e.f.b.b.e ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/b/b/e;->a()[Ljava/lang/Object;
} // .end method
public Integer b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.f;
v0 = (( e.f.b.b.e ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/b/b/e;->c()I
/* iget v1, p0, Le/f/b/b/g$a;->d:I */
/* add-int/2addr v0, v1 */
/* iget v1, p0, Le/f/b/b/g$a;->e:I */
/* add-int/2addr v0, v1 */
} // .end method
public Integer c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.f;
v0 = (( e.f.b.b.e ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/b/b/e;->c()I
/* iget v1, p0, Le/f/b/b/g$a;->d:I */
/* add-int/2addr v0, v1 */
} // .end method
public java.lang.Object get ( Integer p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TE;" */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Le/f/b/b/g$a;->e:I */
e.f.b.a.p .a ( p1,v0 );
/* .line 2 */
v0 = this.f;
/* iget v1, p0, Le/f/b/b/g$a;->d:I */
/* add-int/2addr p1, v1 */
} // .end method
public java.util.Iterator iterator ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Le/f/b/b/g;->iterator()Le/f/b/b/u0; */
} // .end method
public java.util.ListIterator listIterator ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Le/f/b/b/g;->listIterator()Le/f/b/b/v0; */
} // .end method
public java.util.ListIterator listIterator ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* invoke-super {p0, p1}, Le/f/b/b/g;->listIterator(I)Le/f/b/b/v0; */
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/b/b/g$a;->e:I */
} // .end method
public e.f.b.b.g subList ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(II)", */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 2 */
/* iget v0, p0, Le/f/b/b/g$a;->e:I */
e.f.b.a.p .b ( p1,p2,v0 );
/* .line 3 */
v0 = this.f;
/* iget v1, p0, Le/f/b/b/g$a;->d:I */
/* add-int/2addr p1, v1 */
/* add-int/2addr p2, v1 */
(( e.f.b.b.g ) v0 ).subList ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/b/b/g;->subList(II)Le/f/b/b/g;
} // .end method
public java.util.List subList ( Integer p0, Integer p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.f.b.b.g$a ) p0 ).subList ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/b/b/g$a;->subList(II)Le/f/b/b/g;
} // .end method
