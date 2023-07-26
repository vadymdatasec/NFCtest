public class inal implements java.util.Set {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lc/e/h; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x11 */
/* name = "b" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Set<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* # instance fields */
public final c.e.h b; //synthetic
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean a ( java.util.Map$Entry p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;)Z" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public Boolean add ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Ljava/util/Map$Entry; */
(( c.e.h$b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/e/h$b;->a(Ljava/util/Map$Entry;)Z
int p1 = 0; // const/4 p1, 0x0
/* throw p1 */
} // .end method
public Boolean addAll ( java.util.Collection p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "+", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;)Z" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v0 = (( c.e.h ) v0 ).c ( ); // invoke-virtual {v0}, Lc/e/h;->c()I
/* .line 2 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 3 */
v2 = this.b;
(( c.e.h ) v2 ).a ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Lc/e/h;->a(Ljava/lang/Object;Ljava/lang/Object;)V
/* .line 4 */
} // :cond_0
p1 = this.b;
p1 = (( c.e.h ) p1 ).c ( ); // invoke-virtual {p1}, Lc/e/h;->c()I
/* if-eq v0, p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
} // .end method
public void clear ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( c.e.h ) v0 ).a ( ); // invoke-virtual {v0}, Lc/e/h;->a()V
return;
} // .end method
public Boolean contains ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Ljava/util/Map$Entry; */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* check-cast p1, Ljava/util/Map$Entry; */
/* .line 3 */
v0 = this.b;
v0 = (( c.e.h ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lc/e/h;->a(Ljava/lang/Object;)I
/* if-gez v0, :cond_1 */
/* .line 4 */
} // :cond_1
v1 = this.b;
int v2 = 1; // const/4 v2, 0x1
(( c.e.h ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lc/e/h;->a(II)Ljava/lang/Object;
/* .line 5 */
p1 = c.e.e .a ( v0,p1 );
} // .end method
public Boolean containsAll ( java.util.Collection p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .line 1 */
/* .line 2 */
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v0 = (( c.e.h$b ) p0 ).contains ( v0 ); // invoke-virtual {p0, v0}, Lc/e/h$b;->contains(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = c.e.h .a ( p0,p1 );
} // .end method
public Integer hashCode ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.b;
v0 = (( c.e.h ) v0 ).c ( ); // invoke-virtual {v0}, Lc/e/h;->c()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ltz v0,String;)V */
/* throw v0 */
} // .end method
public Boolean hasNext ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/e/h$d;->c:I */
/* iget v1, p0, Lc/e/h$d;->b:I */
/* if-ge v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 5 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/e/h$d;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
v0 = this.e;
/* iget v1, p0, Lc/e/h$d;->c:I */
int v2 = 0; // const/4 v2, 0x0
(( c.e.h ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/e/h;->a(II)Ljava/lang/Object;
/* .line 3 */
v1 = this.e;
/* iget v3, p0, Lc/e/h$d;->c:I */
int v4 = 1; // const/4 v4, 0x1
(( c.e.h ) v1 ).a ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Lc/e/h;->a(II)Ljava/lang/Object;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :cond_0
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
} // :goto_0
/* if-nez v1, :cond_1 */
/* .line 5 */
} // :cond_1
v2 = (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
} // :goto_1
/* xor-int/2addr v0, v2 */
/* .line 6 */
} // :cond_2
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "This container does not support retaining Map.Entry objects"; // const-string v1, "This container does not support retaining Map.Entry objects"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.Object next ( ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( c.e.h$d ) p0 ).next ( ); // invoke-virtual {p0}, Lc/e/h$d;->next()Ljava/util/Map$Entry;
} // .end method
public java.util.Map$Entry next ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = (( c.e.h$d ) p0 ).hasNext ( ); // invoke-virtual {p0}, Lc/e/h$d;->hasNext()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
/* iget v0, p0, Lc/e/h$d;->c:I */
int v1 = 1; // const/4 v1, 0x1
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lc/e/h$d;->c:I */
/* .line 4 */
/* iput-boolean v1, p0, Lc/e/h$d;->d:Z */
/* .line 5 */
} // :cond_0
/* new-instance v0, Ljava/util/NoSuchElementException; */
/* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
/* throw v0 */
} // .end method
public void remove ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/e/h$d;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.e;
/* iget v1, p0, Lc/e/h$d;->c:I */
(( c.e.h ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/e/h;->a(I)V
/* .line 3 */
/* iget v0, p0, Lc/e/h$d;->c:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lc/e/h$d;->c:I */
/* .line 4 */
/* iget v0, p0, Lc/e/h$d;->b:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lc/e/h$d;->b:I */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput-boolean v0, p0, Lc/e/h$d;->d:Z */
return;
/* .line 6 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V */
/* throw v0 */
} // .end method
public java.lang.Object setValue ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Lc/e/h$d;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.e;
/* iget v1, p0, Lc/e/h$d;->c:I */
(( c.e.h ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lc/e/h;->a(ILjava/lang/Object;)Ljava/lang/Object;
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "This container does not support retaining Map.Entry objects"; // const-string v0, "This container does not support retaining Map.Entry objects"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( c.e.h$d ) p0 ).getKey ( ); // invoke-virtual {p0}, Lc/e/h$d;->getKey()Ljava/lang/Object;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "="; // const-string v1, "="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( c.e.h$d ) p0 ).getValue ( ); // invoke-virtual {p0}, Lc/e/h$d;->getValue()Ljava/lang/Object;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ch_0 */
} // :cond_4
} // .end method
public Integer hashCode ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.b;
/* .line 2 */
/* iget v1, p0, Lc/e/d;->d:I */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* .line 3 */
/* aget v4, v0, v2 */
/* add-int/2addr v3, v4 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
} // .end method
public Integer indexOf ( java.lang.Object p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* .line 1 */
p1 = (( c.e.d ) p0 ).b ( ); // invoke-virtual {p0}, Lc/e/d;->b()I
} // :cond_0
v0 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
p1 = (( c.e.d ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/e/d;->a(Ljava/lang/Object;I)I
} // :goto_0
} // .end method
public Boolean isEmpty ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/e/d;->d:I */
/* if-gtz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.util.Iterator iterator ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 1 */
(( c.e.d ) p0 ).a ( ); // invoke-virtual {p0}, Lc/e/d;->a()Lc/e/h;
(( c.e.h ) v0 ).e ( ); // invoke-virtual {v0}, Lc/e/h;->e()Ljava/util/Set;
} // .end method
public Boolean remove ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( c.e.d ) p0 ).indexOf ( p1 ); // invoke-virtual {p0, p1}, Lc/e/d;->indexOf(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
/* .line 2 */
(( c.e.d ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/e/d;->c(I)Ljava/lang/Object;
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean removeAll ( java.util.Collection p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .line 1 */
int v0 = 0; // const/4 v0, 0x0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
v1 = (( c.e.d ) p0 ).remove ( v1 ); // invoke-virtual {p0, v1}, Lc/e/d;->remove(Ljava/lang/Object;)Z
/* or-int/2addr v0, v1 */
} // :cond_0
} // .end method
public Boolean retainAll ( java.util.Collection p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/e/d;->d:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 2 */
v3 = this.c;
v3 = /* aget-object v3, v3, v0 */
/* if-nez v3, :cond_0 */
/* .line 3 */
(( c.e.d ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lc/e/d;->c(I)Ljava/lang/Object;
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/e/d;->d:I */
} // .end method
public java.lang.Object toArray ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Lc/e/d;->d:I */
/* new-array v1, v0, [Ljava/lang/Object; */
/* .line 2 */
v2 = this.c;
int v3 = 0; // const/4 v3, 0x0
java.lang.System .arraycopy ( v2,v3,v1,v3,v0 );
} // .end method
public java.lang.Object toArray ( java.lang.Object[] p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">([TT;)[TT;" */
/* } */
} // .end annotation
/* .line 3 */
/* array-length v0, p1 */
/* iget v1, p0, Lc/e/d;->d:I */
/* if-ge v0, v1, :cond_0 */
/* .line 4 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p1 ).getComponentType ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
/* iget v0, p0, Lc/e/d;->d:I */
java.lang.reflect.Array .newInstance ( p1,v0 );
/* check-cast p1, [Ljava/lang/Object; */
/* .line 5 */
} // :cond_0
v0 = this.c;
/* iget v1, p0, Lc/e/d;->d:I */
int v2 = 0; // const/4 v2, 0x0
java.lang.System .arraycopy ( v0,v2,p1,v2,v1 );
/* .line 6 */
/* array-length v0, p1 */
/* iget v1, p0, Lc/e/d;->d:I */
/* if-le v0, v1, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
/* aput-object v0, p1, v1 */
} // :cond_1
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
v0 = (( c.e.d ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Lc/e/d;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "{}"; // const-string v0, "{}"
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* iget v1, p0, Lc/e/d;->d:I */
/* mul-int/lit8 v1, v1, 0xe */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* const/16 v1, 0x7b */
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
} // :goto_0
/* iget v2, p0, Lc/e/d;->d:I */
/* if-ge v1, v2, :cond_3 */
/* if-lez v1, :cond_1 */
final String v2 = ", "; // const-string v2, ", "
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
} // :cond_1
(( c.e.d ) p0 ).d ( v1 ); // invoke-virtual {p0, v1}, Lc/e/d;->d(I)Ljava/lang/Object;
/* if-eq v2, p0, :cond_2 */
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // :cond_2
final String v2 = "(this Set)"; // const-string v2, "(this Set)"
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
/* const/16 v1, 0x7d */
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
