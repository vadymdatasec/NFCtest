public abstract class e.f.b.b.g extends e.f.b.b.e implements java.util.List implements java.util.RandomAccess {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/f/b/b/g$a; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Le/f/b/b/e<", */
/* "TE;>;", */
/* "Ljava/util/List<", */
/* "TE;>;", */
/* "Ljava/util/RandomAccess;" */
/* } */
} // .end annotation
/* # static fields */
public static final e.f.b.b.v0 c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/b/v0<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.b.b.g ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Le/f/b/b/f; */
v1 = e.f.b.b.q0.f;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Le/f/b/b/f;-><init>(Le/f/b/b/g;I)V */
return;
} // .end method
public e.f.b.b.g ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Le/f/b/b/e;-><init>()V */
return;
} // .end method
public static e.f.b.b.g a ( java.lang.Object[] p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">([", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 1 */
/* array-length v0, p0 */
e.f.b.b.g .b ( p0,v0 );
} // .end method
public static e.f.b.b.g b ( java.lang.Object...p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">([", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.b.b.o0 .a ( p0 );
e.f.b.b.g .a ( p0 );
} // .end method
public static e.f.b.b.g b ( java.lang.Object[] p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">([", */
/* "Ljava/lang/Object;", */
/* "I)", */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
/* .line 2 */
e.f.b.b.g .of ( );
/* .line 3 */
} // :cond_0
/* new-instance v0, Le/f/b/b/q0; */
/* invoke-direct {v0, p0, p1}, Le/f/b/b/q0;-><init>([Ljava/lang/Object;I)V */
} // .end method
public static e.f.b.b.g of ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">()", */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.b.b.q0.f;
} // .end method
public static e.f.b.b.g of ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">(TE;)", */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* aput-object p0, v0, v1 */
/* .line 2 */
e.f.b.b.g .b ( v0 );
} // .end method
/* # virtual methods */
public Integer a ( java.lang.Object[] p0, Integer p1 ) {
/* .locals 4 */
/* .line 3 */
v0 = (( java.util.AbstractCollection ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* add-int v2, p2, v1 */
/* .line 4 */
/* aput-object v3, p1, v2 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* add-int/2addr p2, v0 */
} // .end method
public e.f.b.b.g a ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(II)", */
/* "Le/f/b/b/g<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 2 */
/* new-instance v0, Le/f/b/b/g$a; */
/* sub-int/2addr p2, p1 */
/* invoke-direct {v0, p0, p1, p2}, Le/f/b/b/g$a;-><init>(Le/f/b/b/g;II)V */
} // .end method
public final void add ( Integer p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(ITE;)V" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public final Boolean addAll ( Integer p0, java.util.Collection p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Ljava/util/Collection<", */
/* "+TE;>;)Z" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public Boolean contains ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( e.f.b.b.g ) p0 ).indexOf ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/g;->indexOf(Ljava/lang/Object;)I
/* if-ltz p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = e.f.b.b.k .a ( p0,p1 );
} // .end method
public Integer hashCode ( ) {
/* .locals 4 */
/* .line 1 */
v0 = (( java.util.AbstractCollection ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
/* mul-int/lit8 v1, v1, 0x1f */
/* .line 2 */
v3 = (( java.lang.Object ) v3 ).hashCode ( ); // invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I
/* add-int/2addr v1, v3 */
/* not-int v1, v1 */
/* not-int v1, v1 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
} // .end method
public Integer indexOf ( java.lang.Object p0 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
/* .line 1 */
} // :cond_0
p1 = e.f.b.b.k .b ( p0,p1 );
} // :goto_0
} // .end method
public e.f.b.b.u0 iterator ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/b/b/u0<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 2 */
(( e.f.b.b.g ) p0 ).listIterator ( ); // invoke-virtual {p0}, Le/f/b/b/g;->listIterator()Le/f/b/b/v0;
} // .end method
public java.util.Iterator iterator ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( e.f.b.b.g ) p0 ).iterator ( ); // invoke-virtual {p0}, Le/f/b/b/g;->iterator()Le/f/b/b/u0;
} // .end method
public Integer lastIndexOf ( java.lang.Object p0 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
/* .line 1 */
} // :cond_0
p1 = e.f.b.b.k .d ( p0,p1 );
} // :goto_0
} // .end method
public e.f.b.b.v0 listIterator ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/b/b/v0<", */
/* "TE;>;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( e.f.b.b.g ) p0 ).listIterator ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/g;->listIterator(I)Le/f/b/b/v0;
} // .end method
public e.f.b.b.v0 listIterator ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)", */
/* "Le/f/b/b/v0<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 4 */
v0 = (( java.util.AbstractCollection ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I
e.f.b.a.p .b ( p1,v0 );
/* .line 5 */
v0 = (( java.util.AbstractCollection ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
p1 = e.f.b.b.g.c;
/* .line 7 */
} // :cond_0
/* new-instance v0, Le/f/b/b/f; */
/* invoke-direct {v0, p0, p1}, Le/f/b/b/f;-><init>(Le/f/b/b/g;I)V */
} // .end method
public java.util.ListIterator listIterator ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( e.f.b.b.g ) p0 ).listIterator ( ); // invoke-virtual {p0}, Le/f/b/b/g;->listIterator()Le/f/b/b/v0;
} // .end method
public java.util.ListIterator listIterator ( Integer p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
(( e.f.b.b.g ) p0 ).listIterator ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/g;->listIterator(I)Le/f/b/b/v0;
} // .end method
public final java.lang.Object remove ( Integer p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)TE;" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public final java.lang.Object set ( Integer p0, java.lang.Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(ITE;)TE;" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
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
v0 = (( java.util.AbstractCollection ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I
e.f.b.a.p .b ( p1,p2,v0 );
/* sub-int v0, p2, p1 */
/* .line 3 */
v1 = (( java.util.AbstractCollection ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I
/* if-ne v0, v1, :cond_0 */
} // :cond_0
/* if-nez v0, :cond_1 */
/* .line 4 */
e.f.b.b.g .of ( );
/* .line 5 */
} // :cond_1
(( e.f.b.b.g ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/b/b/g;->a(II)Le/f/b/b/g;
} // .end method
public java.util.List subList ( Integer p0, Integer p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.f.b.b.g ) p0 ).subList ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/b/b/g;->subList(II)Le/f/b/b/g;
} // .end method
