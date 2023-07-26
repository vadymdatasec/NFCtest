public class c.c.a.b.d implements java.util.Map$Entry {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<K:", */
	 /* "Ljava/lang/Object;", */
	 /* "V:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Map$Entry<", */
	 /* "TK;TV;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Object b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TK;" */
/* } */
} // .end annotation
} // .end field
public final java.lang.Object c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TV;" */
/* } */
} // .end annotation
} // .end field
public c.c.a.b.d d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
public c.c.a.b.d e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.c.a.b.d ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
this.c = p2;
return;
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, p0, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Lc/c/a/b/d; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Lc/c/a/b/d; */
/* .line 3 */
v1 = this.b;
v3 = this.b;
v1 = (( java.lang.Object ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.c;
p1 = this.c;
p1 = (( java.lang.Object ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.Object getKey ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TK;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
} // .end method
public java.lang.Object getValue ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TV;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
v1 = this.c;
v1 = (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
/* xor-int/2addr v0, v1 */
} // .end method
public java.lang.Object setValue ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String v0 = "An entry modification is not supported"; // const-string v0, "An entry modification is not supported"
/* invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "="; // const-string v1, "="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
