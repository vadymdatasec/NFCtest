public class m.a.a.a.b.b extends java.util.AbstractCollection implements java.util.Queue implements m.a.a.a.a implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<E:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/util/AbstractCollection<", */
	 /* "TE;>;", */
	 /* "Ljava/util/Queue<", */
	 /* "TE;>;", */
	 /* "Lm/a/a/a/a<", */
	 /* "TE;>;", */
	 /* "Ljava/io/Serializable;" */
	 /* } */
} // .end annotation
/* # instance fields */
public transient java.lang.Object b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "[TE;" */
/* } */
} // .end annotation
} // .end field
public transient Integer c;
public transient Integer d;
public transient Boolean e;
public final Integer f;
/* # direct methods */
public m.a.a.a.b.b ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Lm/a/a/a/b/b;->c:I */
/* .line 3 */
/* iput v0, p0, Lm/a/a/a/b/b;->d:I */
/* .line 4 */
/* iput-boolean v0, p0, Lm/a/a/a/b/b;->e:Z */
/* if-lez p1, :cond_0 */
/* .line 5 */
/* new-array p1, p1, [Ljava/lang/Object; */
this.b = p1;
/* .line 6 */
/* array-length p1, p1 */
/* iput p1, p0, Lm/a/a/a/b/b;->f:I */
return;
/* .line 7 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "The size must be greater than 0"; // const-string v0, "The size must be greater than 0"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public static Integer a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget p0, p0, Lm/a/a/a/b/b;->c:I */
} // .end method
public static Integer a ( Object p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 3 */
/* iput p1, p0, Lm/a/a/a/b/b;->d:I */
} // .end method
public static Boolean a ( Object p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .line 2 */
/* iput-boolean p1, p0, Lm/a/a/a/b/b;->e:Z */
} // .end method
public static Integer b ( Object p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 2 */
p0 = (( m.a.a.a.b.b ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lm/a/a/a/b/b;->b(I)I
} // .end method
public static Boolean b ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget-boolean p0, p0, Lm/a/a/a/b/b;->e:Z */
} // .end method
public static Integer c ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget p0, p0, Lm/a/a/a/b/b;->d:I */
} // .end method
public static Integer c ( Object p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 2 */
p0 = (( m.a.a.a.b.b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/a/a/a/b/b;->a(I)I
} // .end method
public static java.lang.Object d ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.b;
} // .end method
public static Integer e ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* iget p0, p0, Lm/a/a/a/b/b;->f:I */
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0 ) {
/* .locals 0 */
/* add-int/lit8 p1, p1, -0x1 */
/* if-gez p1, :cond_0 */
/* .line 5 */
/* iget p1, p0, Lm/a/a/a/b/b;->f:I */
/* add-int/lit8 p1, p1, -0x1 */
} // :cond_0
} // .end method
public Boolean a ( ) {
/* .locals 2 */
/* .line 4 */
v0 = (( m.a.a.a.b.b ) p0 ).size ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->size()I
/* iget v1, p0, Lm/a/a/a/b/b;->f:I */
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean add ( java.lang.Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;)Z" */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 1 */
v0 = (( m.a.a.a.b.b ) p0 ).a ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( m.a.a.a.b.b ) p0 ).remove ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->remove()Ljava/lang/Object;
/* .line 3 */
} // :cond_0
v0 = this.b;
/* iget v1, p0, Lm/a/a/a/b/b;->d:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Lm/a/a/a/b/b;->d:I */
/* aput-object p1, v0, v1 */
/* .line 4 */
/* iget p1, p0, Lm/a/a/a/b/b;->f:I */
/* if-lt v2, p1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
/* iput p1, p0, Lm/a/a/a/b/b;->d:I */
/* .line 6 */
} // :cond_1
/* iget p1, p0, Lm/a/a/a/b/b;->d:I */
/* iget v0, p0, Lm/a/a/a/b/b;->c:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne p1, v0, :cond_2 */
/* .line 7 */
/* iput-boolean v1, p0, Lm/a/a/a/b/b;->e:Z */
} // :cond_2
/* .line 8 */
} // :cond_3
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "Attempted to add null object to queue"; // const-string v0, "Attempted to add null object to queue"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final Integer b ( Integer p0 ) {
/* .locals 1 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 3 */
/* iget v0, p0, Lm/a/a/a/b/b;->f:I */
/* if-lt p1, v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
} // .end method
public void clear ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Lm/a/a/a/b/b;->e:Z */
/* .line 2 */
/* iput v0, p0, Lm/a/a/a/b/b;->c:I */
/* .line 3 */
/* iput v0, p0, Lm/a/a/a/b/b;->d:I */
/* .line 4 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
java.util.Arrays .fill ( v0,v1 );
return;
} // .end method
public java.lang.Object element ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TE;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( m.a.a.a.b.b ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->isEmpty()Z
/* if-nez v0, :cond_0 */
/* .line 2 */
(( m.a.a.a.b.b ) p0 ).peek ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->peek()Ljava/lang/Object;
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/util/NoSuchElementException; */
final String v1 = "queue is empty"; // const-string v1, "queue is empty"
/* invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public java.lang.Object get ( Integer p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TE;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( m.a.a.a.b.b ) p0 ).size ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->size()I
/* if-ltz p1, :cond_0 */
/* if-ge p1, v0, :cond_0 */
/* .line 2 */
/* iget v0, p0, Lm/a/a/a/b/b;->c:I */
/* add-int/2addr v0, p1 */
/* iget p1, p0, Lm/a/a/a/b/b;->f:I */
/* rem-int/2addr v0, p1 */
/* .line 3 */
p1 = this.b;
/* aget-object p1, p1, v0 */
/* .line 4 */
} // :cond_0
/* new-instance v1, Ljava/util/NoSuchElementException; */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* .line 5 */
java.lang.Integer .valueOf ( p1 );
/* aput-object p1, v2, v3 */
int p1 = 1; // const/4 p1, 0x1
java.lang.Integer .valueOf ( v0 );
/* aput-object v0, v2, p1 */
final String p1 = "The specified index (%1$d) is outside the available range [0, %2$d)"; // const-string p1, "The specified index (%1$d) is outside the available range [0, %2$d)"
/* .line 6 */
java.lang.String .format ( p1,v2 );
/* invoke-direct {v1, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
} // .end method
public Boolean isEmpty ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( m.a.a.a.b.b ) p0 ).size ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->size()I
/* if-nez v0, :cond_0 */
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
/* new-instance v0, Lm/a/a/a/b/a; */
/* invoke-direct {v0, p0}, Lm/a/a/a/b/a;-><init>(Lm/a/a/a/b/b;)V */
} // .end method
public Boolean offer ( java.lang.Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;)Z" */
/* } */
} // .end annotation
/* .line 1 */
p1 = (( m.a.a.a.b.b ) p0 ).add ( p1 ); // invoke-virtual {p0, p1}, Lm/a/a/a/b/b;->add(Ljava/lang/Object;)Z
} // .end method
public java.lang.Object peek ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TE;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( m.a.a.a.b.b ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = this.b;
/* iget v1, p0, Lm/a/a/a/b/b;->c:I */
/* aget-object v0, v0, v1 */
} // .end method
public java.lang.Object poll ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TE;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( m.a.a.a.b.b ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
(( m.a.a.a.b.b ) p0 ).remove ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->remove()Ljava/lang/Object;
} // .end method
public java.lang.Object remove ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TE;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( m.a.a.a.b.b ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Lm/a/a/a/b/b;->isEmpty()Z
/* if-nez v0, :cond_2 */
/* .line 2 */
v0 = this.b;
/* iget v1, p0, Lm/a/a/a/b/b;->c:I */
/* aget-object v2, v0, v1 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* add-int/lit8 v3, v1, 0x1 */
/* .line 3 */
/* iput v3, p0, Lm/a/a/a/b/b;->c:I */
int v4 = 0; // const/4 v4, 0x0
/* aput-object v4, v0, v1 */
/* .line 4 */
/* iget v0, p0, Lm/a/a/a/b/b;->f:I */
int v1 = 0; // const/4 v1, 0x0
/* if-lt v3, v0, :cond_0 */
/* .line 5 */
/* iput v1, p0, Lm/a/a/a/b/b;->c:I */
/* .line 6 */
} // :cond_0
/* iput-boolean v1, p0, Lm/a/a/a/b/b;->e:Z */
} // :cond_1
/* .line 7 */
} // :cond_2
/* new-instance v0, Ljava/util/NoSuchElementException; */
final String v1 = "queue is empty"; // const-string v1, "queue is empty"
/* invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer size ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Lm/a/a/a/b/b;->d:I */
/* iget v1, p0, Lm/a/a/a/b/b;->c:I */
/* if-ge v0, v1, :cond_0 */
/* .line 2 */
/* iget v2, p0, Lm/a/a/a/b/b;->f:I */
/* sub-int/2addr v2, v1 */
/* add-int/2addr v2, v0 */
} // :cond_0
/* if-ne v0, v1, :cond_2 */
/* .line 3 */
/* iget-boolean v0, p0, Lm/a/a/a/b/b;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p0, Lm/a/a/a/b/b;->f:I */
/* move v2, v0 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :cond_2
/* sub-int v2, v0, v1 */
} // :goto_0
} // .end method
