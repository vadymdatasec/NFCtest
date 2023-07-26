public abstract class e.f.b.b.e extends java.util.AbstractCollection implements java.io.Serializable {
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
	 /* "Ljava/io/Serializable;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.Object b;
/* # direct methods */
public static e.f.b.b.e ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array v0, v0, [Ljava/lang/Object; */
	 /* .line 1 */
	 return;
} // .end method
public e.f.b.b.e ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public abstract Integer a ( java.lang.Object[] p0, Integer p1 ) {
} // .end method
public java.lang.Object a ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Boolean add ( java.lang.Object p0 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(TE;)Z" */
	 /* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public final Boolean addAll ( java.util.Collection p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
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
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw v0 */
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw v0 */
} // .end method
public final void clear ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw v0 */
} // .end method
public abstract Boolean contains ( java.lang.Object p0 ) {
} // .end method
public final Boolean remove ( java.lang.Object p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public final Boolean removeAll ( java.util.Collection p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public final Boolean retainAll ( java.util.Collection p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "*>;)Z" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
/* invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V */
/* throw p1 */
} // .end method
public final java.lang.Object toArray ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.f.b.b.e.b;
(( e.f.b.b.e ) p0 ).toArray ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/e;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
} // .end method
public final java.lang.Object toArray ( java.lang.Object[] p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">([TT;)[TT;" */
/* } */
} // .end annotation
/* .line 2 */
e.f.b.a.p .a ( p1 );
/* .line 3 */
v0 = (( java.util.AbstractCollection ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I
/* .line 4 */
/* array-length v1, p1 */
/* if-ge v1, v0, :cond_1 */
/* .line 5 */
(( e.f.b.b.e ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/b/b/e;->a()[Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 6 */
v0 = (( e.f.b.b.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/b/b/e;->c()I
v2 = (( e.f.b.b.e ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/b/b/e;->b()I
e.f.b.b.p0 .a ( v1,v0,v2,p1 );
/* .line 7 */
} // :cond_0
e.f.b.b.o0 .b ( p1,v0 );
/* .line 8 */
} // :cond_1
/* array-length v1, p1 */
/* if-le v1, v0, :cond_2 */
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
/* aput-object v1, p1, v0 */
} // :cond_2
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
(( e.f.b.b.e ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/b/b/e;->a([Ljava/lang/Object;I)I
} // .end method
