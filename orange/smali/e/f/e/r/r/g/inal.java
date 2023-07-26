public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/f/e/r/r/g/b;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final Integer b;
public final Boolean c;
/* # direct methods */
public inal ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/f/e/r/r/g/b;", */
/* ">;IZ)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
this.a = v0;
/* .line 3 */
/* iput p2, p0, Le/f/e/r/r/g/c;->b:I */
/* .line 4 */
/* iput-boolean p3, p0, Le/f/e/r/r/g/c;->c:Z */
return;
} // .end method
/* # virtual methods */
public java.util.List a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Le/f/e/r/r/g/b;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
} // .end method
public Boolean a ( java.util.List p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/f/e/r/r/g/b;", */
/* ">;)Z" */
/* } */
} // .end annotation
/* .line 2 */
p1 = v0 = this.a;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/f/e/r/r/g/c;->b:I */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Le/f/e/r/r/g/c; */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* check-cast p1, Le/f/e/r/r/g/c; */
/* .line 3 */
v0 = this.a;
v0 = (( e.f.e.r.r.g.c ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/e/r/r/g/c;->a()Ljava/util/List;
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget-boolean v0, p0, Le/f/e/r/r/g/c;->c:Z */
/* iget-boolean p1, p1, Le/f/e/r/r/g/c;->c:Z */
/* if-ne v0, p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
v0 = v0 = this.a;
/* iget-boolean v1, p0, Le/f/e/r/r/g/c;->c:Z */
java.lang.Boolean .valueOf ( v1 );
v1 = (( java.lang.Boolean ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I
/* xor-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "{ "; // const-string v1, "{ "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " }"; // const-string v1, " }"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
