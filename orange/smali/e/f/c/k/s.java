public class e.f.c.k.s {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.Class a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public final Boolean b;
/* # direct methods */
public e.f.c.k.s ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;Z)V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
this.a = p1;
/* .line 4 */
/* iput-boolean p2, p0, Le/f/c/k/s;->b:Z */
return;
} // .end method
public e.f.c.k.s ( ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Le/f/c/k/s;-><init>(Ljava/lang/Class;Z)V */
return;
} // .end method
public static Boolean a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget-boolean p0, p0, Le/f/c/k/s;->b:Z */
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Le/f/c/k/s; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Le/f/c/k/s; */
/* .line 3 */
v0 = this.a;
v2 = this.a;
v0 = (( java.lang.Object ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget-boolean p1, p1, Le/f/c/k/s;->b:Z */
	 /* iget-boolean v0, p0, Le/f/c/k/s;->b:Z */
	 /* if-ne p1, v0, :cond_0 */
	 int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
/* const v1, 0xf4243 */
/* xor-int/2addr v0, v1 */
/* mul-int v0, v0, v1 */
/* .line 2 */
/* iget-boolean v1, p0, Le/f/c/k/s;->b:Z */
java.lang.Boolean .valueOf ( v1 );
v1 = (( java.lang.Boolean ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->hashCode()I
/* xor-int/2addr v0, v1 */
} // .end method
