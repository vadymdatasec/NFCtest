public class c.c.a.b.e implements java.lang.Iterable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/c/a/b/e$a; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Iterable<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* # instance fields */
public c.c.a.b.d b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
public c.c.a.b.d c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
} // .end field
public java.util.WeakHashMap d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/WeakHashMap<", */
/* "Lc/c/a/b/g<", */
/* "TK;TV;>;", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer e;
/* # direct methods */
public c.c.a.b.e ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/WeakHashMap; */
/* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
this.d = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Lc/c/a/b/e;->e:I */
return;
} // .end method
/* # virtual methods */
public c.c.a.b.d a ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v1 = this.b;
v1 = (( java.lang.Object ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
} // :cond_0
v0 = this.d;
} // :cond_1
} // :goto_1
} // .end method
public c.c.a.b.d a ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Lc/c/a/b/d; */
/* invoke-direct {v0, p1, p2}, Lc/c/a/b/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V */
/* .line 5 */
/* iget p1, p0, Lc/c/a/b/e;->e:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Lc/c/a/b/e;->e:I */
/* .line 6 */
p1 = this.c;
/* if-nez p1, :cond_0 */
/* .line 7 */
this.b = v0;
/* .line 8 */
this.c = v0;
/* .line 9 */
} // :cond_0
this.d = v0;
/* .line 10 */
this.e = p1;
/* .line 11 */
this.c = v0;
} // .end method
public java.util.Iterator a ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* .line 12 */
/* new-instance v0, Lc/c/a/b/c; */
v1 = this.c;
v2 = this.b;
/* invoke-direct {v0, v1, v2}, Lc/c/a/b/c;-><init>(Lc/c/a/b/d;Lc/c/a/b/d;)V */
/* .line 13 */
v1 = this.d;
int v2 = 0; // const/4 v2, 0x0
java.lang.Boolean .valueOf ( v2 );
(( java.util.WeakHashMap ) v1 ).put ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public java.lang.Object b ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
(( c.c.a.b.e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/c/a/b/e;->a(Ljava/lang/Object;)Lc/c/a/b/d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = this.c;
/* .line 3 */
} // :cond_0
(( c.c.a.b.e ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/c/a/b/e;->a(Ljava/lang/Object;Ljava/lang/Object;)Lc/c/a/b/d;
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.util.Map$Entry b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.b;
} // .end method
public c.c.a.b.e$a c ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Lc/c/a/b/e<", */
/* "TK;TV;>.a;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lc/c/a/b/e$a; */
/* invoke-direct {v0, p0}, Lc/c/a/b/e$a;-><init>(Lc/c/a/b/e;)V */
/* .line 2 */
v1 = this.d;
int v2 = 0; // const/4 v2, 0x0
java.lang.Boolean .valueOf ( v2 );
(( java.util.WeakHashMap ) v1 ).put ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public java.util.Map$Entry d ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, p0, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Lc/c/a/b/e; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Lc/c/a/b/e; */
/* .line 3 */
v1 = (( c.c.a.b.e ) p0 ).size ( ); // invoke-virtual {p0}, Lc/c/a/b/e;->size()I
v3 = (( c.c.a.b.e ) p1 ).size ( ); // invoke-virtual {p1}, Lc/c/a/b/e;->size()I
/* if-eq v1, v3, :cond_2 */
/* .line 4 */
} // :cond_2
(( c.c.a.b.e ) p0 ).iterator ( ); // invoke-virtual {p0}, Lc/c/a/b/e;->iterator()Ljava/util/Iterator;
/* .line 5 */
(( c.c.a.b.e ) p1 ).iterator ( ); // invoke-virtual {p1}, Lc/c/a/b/e;->iterator()Ljava/util/Iterator;
/* .line 6 */
v3 = } // :cond_3
v3 = if ( v3 != null) { // if-eqz v3, :cond_6
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 7 */
/* check-cast v3, Ljava/util/Map$Entry; */
/* .line 8 */
/* if-nez v3, :cond_4 */
/* if-nez v4, :cond_5 */
} // :cond_4
if ( v3 != null) { // if-eqz v3, :cond_3
v3 = /* .line 9 */
/* if-nez v3, :cond_3 */
} // :cond_5
/* .line 10 */
v1 = } // :cond_6
p1 = /* if-nez v1, :cond_7 */
/* if-nez p1, :cond_7 */
} // :cond_7
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
/* .line 1 */
(( c.c.a.b.e ) p0 ).iterator ( ); // invoke-virtual {p0}, Lc/c/a/b/e;->iterator()Ljava/util/Iterator;
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
v2 = /* check-cast v2, Ljava/util/Map$Entry; */
/* add-int/2addr v1, v2 */
} // :cond_0
} // .end method
public java.util.Iterator iterator ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lc/c/a/b/b; */
v1 = this.b;
v2 = this.c;
/* invoke-direct {v0, v1, v2}, Lc/c/a/b/b;-><init>(Lc/c/a/b/d;Lc/c/a/b/d;)V */
/* .line 2 */
v1 = this.d;
int v2 = 0; // const/4 v2, 0x0
java.lang.Boolean .valueOf ( v2 );
(( java.util.WeakHashMap ) v1 ).put ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public java.lang.Object remove ( java.lang.Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
(( c.c.a.b.e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/c/a/b/e;->a(Ljava/lang/Object;)Lc/c/a/b/d;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 2 */
} // :cond_0
/* iget v1, p0, Lc/c/a/b/e;->e:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, p0, Lc/c/a/b/e;->e:I */
/* .line 3 */
v1 = this.d;
v1 = (( java.util.WeakHashMap ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/WeakHashMap;->isEmpty()Z
/* if-nez v1, :cond_1 */
/* .line 4 */
v1 = this.d;
(( java.util.WeakHashMap ) v1 ).keySet ( ); // invoke-virtual {v1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lc/c/a/b/g; */
/* .line 5 */
/* .line 6 */
} // :cond_1
v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 7 */
v2 = this.d;
this.d = v2;
/* .line 8 */
} // :cond_2
v1 = this.d;
this.b = v1;
/* .line 9 */
} // :goto_1
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 10 */
v2 = this.e;
this.e = v2;
/* .line 11 */
} // :cond_3
v1 = this.e;
this.c = v1;
/* .line 12 */
} // :goto_2
this.d = v0;
/* .line 13 */
this.e = v0;
/* .line 14 */
p1 = this.c;
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/c/a/b/e;->e:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "["; // const-string v1, "["
/* .line 2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
(( c.c.a.b.e ) p0 ).iterator ( ); // invoke-virtual {p0}, Lc/c/a/b/e;->iterator()Ljava/util/Iterator;
/* .line 4 */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 5 */
/* check-cast v2, Ljava/util/Map$Entry; */
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = /* .line 6 */
if ( v2 != null) { // if-eqz v2, :cond_0
final String v2 = ", "; // const-string v2, ", "
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_1
final String v1 = "]"; // const-string v1, "]"
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
