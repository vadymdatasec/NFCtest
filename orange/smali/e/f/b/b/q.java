public class e.f.b.b.q extends java.util.AbstractMap implements java.util.concurrent.ConcurrentMap implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Le/f/b/b/q$b;, */
	 /* Le/f/b/b/q$g;, */
	 /* Le/f/b/b/q$e;, */
	 /* Le/f/b/b/q$a;, */
	 /* Le/f/b/b/q$h;, */
	 /* Le/f/b/b/q$f;, */
	 /* Le/f/b/b/q$d;, */
	 /* Le/f/b/b/q$c; */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* "E::", */
/* "Le/f/b/b/r<", */
/* "TK;TV;TE;>;S:", */
/* "Le/f/b/b/u<", */
/* "TK;TV;TE;TS;>;>", */
/* "Ljava/util/AbstractMap<", */
/* "TK;TV;>;", */
/* "Ljava/util/concurrent/ConcurrentMap<", */
/* "TK;TV;>;", */
/* "Ljava/io/Serializable;" */
/* } */
} // .end annotation
/* # static fields */
public static final e.f.b.b.m0 k;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/b/m0<", */
/* "Ljava/lang/Object;", */
/* "Ljava/lang/Object;", */
/* "Le/f/b/b/p;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final transient Integer b;
public final transient Integer c;
public final transient e.f.b.b.u d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "[", */
/* "Le/f/b/b/u<", */
/* "TK;TV;TE;TS;>;" */
/* } */
} // .end annotation
} // .end field
public final Integer e;
public final e.f.b.a.d f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/a/d<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final transient e.f.b.b.s g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/b/s<", */
/* "TK;TV;TE;TS;>;" */
/* } */
} // .end annotation
} // .end field
public transient java.util.Set h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "TK;>;" */
/* } */
} // .end annotation
} // .end field
public transient java.util.Collection i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Collection<", */
/* "TV;>;" */
/* } */
} // .end annotation
} // .end field
public transient java.util.Set j;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.b.b.q ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/b/b/m; */
/* invoke-direct {v0}, Le/f/b/b/m;-><init>()V */
return;
} // .end method
public e.f.b.b.q ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/b/b/l;", */
/* "Le/f/b/b/s<", */
/* "TK;TV;TE;TS;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V */
/* .line 2 */
v0 = (( e.f.b.b.l ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/b/b/l;->a()I
/* const/high16 v1, 0x10000 */
v0 = java.lang.Math .min ( v0,v1 );
/* iput v0, p0, Le/f/b/b/q;->e:I */
/* .line 3 */
(( e.f.b.b.l ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/b/b/l;->c()Le/f/b/a/d;
this.f = v0;
/* .line 4 */
this.g = p2;
/* .line 5 */
p1 = (( e.f.b.b.l ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/b/b/l;->b()I
/* const/high16 p2, 0x40000000 # 2.0f */
p1 = java.lang.Math .min ( p1,p2 );
int p2 = 0; // const/4 p2, 0x0
int v0 = 1; // const/4 v0, 0x1
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 6 */
} // :goto_0
/* iget v3, p0, Le/f/b/b/q;->e:I */
/* if-ge v1, v3, :cond_0 */
/* add-int/lit8 v2, v2, 0x1 */
/* shl-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* rsub-int/lit8 v2, v2, 0x20 */
/* .line 7 */
/* iput v2, p0, Le/f/b/b/q;->c:I */
/* add-int/lit8 v2, v1, -0x1 */
/* .line 8 */
/* iput v2, p0, Le/f/b/b/q;->b:I */
/* .line 9 */
(( e.f.b.b.q ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/b/b/q;->a(I)[Le/f/b/b/u;
this.d = v2;
/* .line 10 */
/* div-int v2, p1, v1 */
/* mul-int v1, v1, v2 */
/* if-ge v1, p1, :cond_1 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // :goto_1
/* if-ge v0, v2, :cond_2 */
/* shl-int/lit8 v0, v0, 0x1 */
/* .line 11 */
} // :cond_2
} // :goto_2
p1 = this.d;
/* array-length v1, p1 */
/* if-ge p2, v1, :cond_3 */
int v1 = -1; // const/4 v1, -0x1
/* .line 12 */
(( e.f.b.b.q ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/f/b/b/q;->a(II)Le/f/b/b/u;
/* aput-object v1, p1, p2 */
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_3
return;
} // .end method
public static e.f.b.b.q a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/b/b/l;", */
/* ")", */
/* "Le/f/b/b/q<", */
/* "TK;TV;+", */
/* "Le/f/b/b/r<", */
/* "TK;TV;*>;*>;" */
/* } */
} // .end annotation
/* .line 2 */
(( e.f.b.b.l ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/b/b/l;->d()Le/f/b/b/x;
v1 = e.f.b.b.x.b;
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
(( e.f.b.b.l ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/l;->e()Le/f/b/b/x;
v1 = e.f.b.b.x.b;
/* if-ne v0, v1, :cond_0 */
/* .line 4 */
/* new-instance v0, Le/f/b/b/q; */
e.f.b.b.y .b ( );
/* invoke-direct {v0, p0, v1}, Le/f/b/b/q;-><init>(Le/f/b/b/l;Le/f/b/b/s;)V */
/* .line 5 */
} // :cond_0
(( e.f.b.b.l ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/b/b/l;->d()Le/f/b/b/x;
v1 = e.f.b.b.x.b;
/* if-ne v0, v1, :cond_1 */
/* .line 6 */
(( e.f.b.b.l ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/l;->e()Le/f/b/b/x;
v1 = e.f.b.b.x.c;
/* if-ne v0, v1, :cond_1 */
/* .line 7 */
/* new-instance v0, Le/f/b/b/q; */
e.f.b.b.b0 .b ( );
/* invoke-direct {v0, p0, v1}, Le/f/b/b/q;-><init>(Le/f/b/b/l;Le/f/b/b/s;)V */
/* .line 8 */
} // :cond_1
(( e.f.b.b.l ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/b/b/l;->d()Le/f/b/b/x;
v1 = e.f.b.b.x.c;
/* if-ne v0, v1, :cond_2 */
/* .line 9 */
(( e.f.b.b.l ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/l;->e()Le/f/b/b/x;
v1 = e.f.b.b.x.b;
/* if-ne v0, v1, :cond_2 */
/* .line 10 */
/* new-instance v0, Le/f/b/b/q; */
e.f.b.b.f0 .b ( );
/* invoke-direct {v0, p0, v1}, Le/f/b/b/q;-><init>(Le/f/b/b/l;Le/f/b/b/s;)V */
/* .line 11 */
} // :cond_2
(( e.f.b.b.l ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/b/b/l;->d()Le/f/b/b/x;
v1 = e.f.b.b.x.c;
/* if-ne v0, v1, :cond_3 */
(( e.f.b.b.l ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/b/b/l;->e()Le/f/b/b/x;
v1 = e.f.b.b.x.c;
/* if-ne v0, v1, :cond_3 */
/* .line 12 */
/* new-instance v0, Le/f/b/b/q; */
e.f.b.b.i0 .b ( );
/* invoke-direct {v0, p0, v1}, Le/f/b/b/q;-><init>(Le/f/b/b/l;Le/f/b/b/s;)V */
/* .line 13 */
} // :cond_3
/* new-instance p0, Ljava/lang/AssertionError; */
/* invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V */
/* throw p0 */
} // .end method
public static java.util.ArrayList a ( java.util.Collection p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
e.f.b.b.q .b ( p0 );
} // .end method
public static e.f.b.b.m0 b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<K:", */
/* "Ljava/lang/Object;", */
/* "V:", */
/* "Ljava/lang/Object;", */
/* "E::", */
/* "Le/f/b/b/r<", */
/* "TK;TV;TE;>;>()", */
/* "Le/f/b/b/m0<", */
/* "TK;TV;TE;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.b.b.q.k;
} // .end method
public static java.util.ArrayList b ( java.util.Collection p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<E:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/Collection<", */
/* "TE;>;)", */
/* "Ljava/util/ArrayList<", */
/* "TE;>;" */
/* } */
} // .end annotation
/* .line 5 */
v1 = /* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 6 */
e.f.b.b.j .a ( v0,p0 );
} // .end method
public static Integer c ( Integer p0 ) {
/* .locals 2 */
/* shl-int/lit8 v0, p0, 0xf */
/* xor-int/lit16 v0, v0, -0x3283 */
/* add-int/2addr p0, v0 */
/* ushr-int/lit8 v0, p0, 0xa */
/* xor-int/2addr p0, v0 */
/* shl-int/lit8 v0, p0, 0x3 */
/* add-int/2addr p0, v0 */
/* ushr-int/lit8 v0, p0, 0x6 */
/* xor-int/2addr p0, v0 */
/* shl-int/lit8 v0, p0, 0x2 */
/* shl-int/lit8 v1, p0, 0xe */
/* add-int/2addr v0, v1 */
/* add-int/2addr p0, v0 */
/* ushr-int/lit8 v0, p0, 0x10 */
/* xor-int/2addr p0, v0 */
} // .end method
/* # virtual methods */
public Integer a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 14 */
v0 = this.f;
p1 = (( e.f.b.a.d ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/b/a/d;->b(Ljava/lang/Object;)I
/* .line 15 */
p1 = e.f.b.b.q .c ( p1 );
} // .end method
public e.f.b.a.d a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/b/a/d<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 23 */
v0 = this.g;
(( e.f.b.b.x ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/b/b/x;->a()Le/f/b/a/d;
} // .end method
public e.f.b.b.u a ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(II)", */
/* "Le/f/b/b/u<", */
/* "TK;TV;TE;TS;>;" */
/* } */
} // .end annotation
/* .line 19 */
v0 = this.g;
} // .end method
public java.lang.Object a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;)TV;" */
/* } */
} // .end annotation
/* .line 20 */
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 21 */
} // :cond_0
} // .end method
public void a ( e.f.b.b.m0 p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/b/b/m0<", */
/* "TK;TV;TE;>;)V" */
/* } */
} // .end annotation
/* .line 16 */
v1 = /* .line 17 */
/* .line 18 */
(( e.f.b.b.q ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
(( e.f.b.b.u ) v2 ).a ( v0, v1, p1 ); // invoke-virtual {v2, v0, v1, p1}, Le/f/b/b/u;->a(Ljava/lang/Object;ILe/f/b/b/m0;)Z
return;
} // .end method
public final e.f.b.b.u a ( Integer p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)[", */
/* "Le/f/b/b/u<", */
/* "TK;TV;TE;TS;>;" */
/* } */
} // .end annotation
/* .line 22 */
/* new-array p1, p1, [Le/f/b/b/u; */
} // .end method
public e.f.b.b.u b ( Integer p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)", */
/* "Le/f/b/b/u<", */
/* "TK;TV;TE;TS;>;" */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.d;
/* iget v1, p0, Le/f/b/b/q;->c:I */
/* ushr-int/2addr p1, v1 */
/* iget v1, p0, Le/f/b/b/q;->b:I */
/* and-int/2addr p1, v1 */
/* aget-object p1, v0, p1 */
} // .end method
public void b ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;)V" */
/* } */
} // .end annotation
v0 = /* .line 2 */
/* .line 3 */
(( e.f.b.b.q ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
(( e.f.b.b.u ) v1 ).a ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Le/f/b/b/u;->a(Le/f/b/b/r;I)Z
return;
} // .end method
public void clear ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.d;
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
/* .line 2 */
(( e.f.b.b.u ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/b/b/u;->a()V
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public Boolean containsKey ( java.lang.Object p0 ) {
/* .locals 2 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :cond_0
v0 = (( e.f.b.b.q ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I
/* .line 2 */
(( e.f.b.b.q ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
p1 = (( e.f.b.b.u ) v1 ).a ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Le/f/b/b/u;->a(Ljava/lang/Object;I)Z
} // .end method
public Boolean containsValue ( java.lang.Object p0 ) {
/* .locals 16 */
/* move-object/from16 v0, p1 */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
} // :cond_0
/* move-object/from16 v2, p0 */
/* .line 1 */
v3 = this.d;
/* const-wide/16 v4, -0x1 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
int v7 = 3; // const/4 v7, 0x3
/* if-ge v6, v7, :cond_6 */
/* const-wide/16 v7, 0x0 */
/* .line 2 */
/* array-length v9, v3 */
int v10 = 0; // const/4 v10, 0x0
} // :goto_1
/* if-ge v10, v9, :cond_4 */
/* aget-object v11, v3, v10 */
/* .line 3 */
/* iget v12, v11, Le/f/b/b/u;->c:I */
/* .line 4 */
v12 = this.f;
int v13 = 0; // const/4 v13, 0x0
/* .line 5 */
} // :goto_2
v14 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v12 ).length ( ); // invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* if-ge v13, v14, :cond_3 */
/* .line 6 */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v12 ).get ( v13 ); // invoke-virtual {v12, v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v14, Le/f/b/b/r; */
} // :goto_3
if ( v14 != null) { // if-eqz v14, :cond_2
/* .line 7 */
(( e.f.b.b.u ) v11 ).a ( v14 ); // invoke-virtual {v11, v14}, Le/f/b/b/u;->a(Le/f/b/b/r;)Ljava/lang/Object;
if ( v15 != null) { // if-eqz v15, :cond_1
/* .line 8 */
/* invoke-virtual/range {p0 ..p0}, Le/f/b/b/q;->a()Le/f/b/a/d; */
v1 = (( e.f.b.a.d ) v1 ).b ( v0, v15 ); // invoke-virtual {v1, v0, v15}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 9 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :cond_2
/* add-int/lit8 v13, v13, 0x1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 10 */
} // :cond_3
/* iget v1, v11, Le/f/b/b/u;->d:I */
/* int-to-long v11, v1 */
/* add-long/2addr v7, v11 */
/* add-int/lit8 v10, v10, 0x1 */
int v1 = 0; // const/4 v1, 0x0
} // :cond_4
/* cmp-long v1, v7, v4 */
/* if-nez v1, :cond_5 */
} // :cond_5
/* add-int/lit8 v6, v6, 0x1 */
/* move-wide v4, v7 */
int v1 = 0; // const/4 v1, 0x0
} // :cond_6
} // :goto_4
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.util.Set entrySet ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Le/f/b/b/q$b; */
/* invoke-direct {v0, p0}, Le/f/b/b/q$b;-><init>(Le/f/b/b/q;)V */
this.j = v0;
} // :goto_0
} // .end method
public java.lang.Object get ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* ")TV;" */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :cond_0
v0 = (( e.f.b.b.q ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I
/* .line 2 */
(( e.f.b.b.q ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
(( e.f.b.b.u ) v1 ).b ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Le/f/b/b/u;->b(Ljava/lang/Object;I)Ljava/lang/Object;
} // .end method
public Boolean isEmpty ( ) {
/* .locals 10 */
/* .line 1 */
v0 = this.d;
/* const-wide/16 v1, 0x0 */
int v3 = 0; // const/4 v3, 0x0
/* move-wide v5, v1 */
int v4 = 0; // const/4 v4, 0x0
/* .line 2 */
} // :goto_0
/* array-length v7, v0 */
/* if-ge v4, v7, :cond_1 */
/* .line 3 */
/* aget-object v7, v0, v4 */
/* iget v7, v7, Le/f/b/b/u;->c:I */
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 4 */
} // :cond_0
/* aget-object v7, v0, v4 */
/* iget v7, v7, Le/f/b/b/u;->d:I */
/* int-to-long v7, v7 */
/* add-long/2addr v5, v7 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
int v4 = 1; // const/4 v4, 0x1
/* cmp-long v7, v5, v1 */
if ( v7 != null) { // if-eqz v7, :cond_5
int v7 = 0; // const/4 v7, 0x0
/* .line 5 */
} // :goto_1
/* array-length v8, v0 */
/* if-ge v7, v8, :cond_3 */
/* .line 6 */
/* aget-object v8, v0, v7 */
/* iget v8, v8, Le/f/b/b/u;->c:I */
if ( v8 != null) { // if-eqz v8, :cond_2
/* .line 7 */
} // :cond_2
/* aget-object v8, v0, v7 */
/* iget v8, v8, Le/f/b/b/u;->d:I */
/* int-to-long v8, v8 */
/* sub-long/2addr v5, v8 */
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_3
/* cmp-long v0, v5, v1 */
/* if-nez v0, :cond_4 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_4
} // :cond_5
} // .end method
public java.util.Set keySet ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "TK;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Le/f/b/b/q$e; */
/* invoke-direct {v0, p0}, Le/f/b/b/q$e;-><init>(Le/f/b/b/q;)V */
this.h = v0;
} // :goto_0
} // .end method
public java.lang.Object put ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.b.a.p .a ( p1 );
/* .line 2 */
e.f.b.a.p .a ( p2 );
/* .line 3 */
v0 = (( e.f.b.b.q ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I
/* .line 4 */
(( e.f.b.b.q ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
int v2 = 0; // const/4 v2, 0x0
(( e.f.b.b.u ) v1 ).a ( p1, v0, p2, v2 ); // invoke-virtual {v1, p1, v0, p2, v2}, Le/f/b/b/u;->a(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;
} // .end method
public void putAll ( java.util.Map p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "+TK;+TV;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 2 */
(( e.f.b.b.q ) p0 ).put ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/f/b/b/q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
return;
} // .end method
public java.lang.Object putIfAbsent ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.b.a.p .a ( p1 );
/* .line 2 */
e.f.b.a.p .a ( p2 );
/* .line 3 */
v0 = (( e.f.b.b.q ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I
/* .line 4 */
(( e.f.b.b.q ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
int v2 = 1; // const/4 v2, 0x1
(( e.f.b.b.u ) v1 ).a ( p1, v0, p2, v2 ); // invoke-virtual {v1, p1, v0, p2, v2}, Le/f/b/b/u;->a(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;
} // .end method
public java.lang.Object remove ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Object;", */
/* ")TV;" */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :cond_0
v0 = (( e.f.b.b.q ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I
/* .line 2 */
(( e.f.b.b.q ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
(( e.f.b.b.u ) v1 ).e ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Le/f/b/b/u;->e(Ljava/lang/Object;I)Ljava/lang/Object;
} // .end method
public Boolean remove ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* if-nez p2, :cond_0 */
/* .line 3 */
} // :cond_0
v0 = (( e.f.b.b.q ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I
/* .line 4 */
(( e.f.b.b.q ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
p1 = (( e.f.b.b.u ) v1 ).a ( p1, v0, p2 ); // invoke-virtual {v1, p1, v0, p2}, Le/f/b/b/u;->a(Ljava/lang/Object;ILjava/lang/Object;)Z
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.Object replace ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
/* .line 5 */
e.f.b.a.p .a ( p1 );
/* .line 6 */
e.f.b.a.p .a ( p2 );
/* .line 7 */
v0 = (( e.f.b.b.q ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I
/* .line 8 */
(( e.f.b.b.q ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
(( e.f.b.b.u ) v1 ).b ( p1, v0, p2 ); // invoke-virtual {v1, p1, v0, p2}, Le/f/b/b/u;->b(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;
} // .end method
public Boolean replace ( java.lang.Object p0, java.lang.Object p1, java.lang.Object p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;TV;)Z" */
/* } */
} // .end annotation
/* .line 1 */
e.f.b.a.p .a ( p1 );
/* .line 2 */
e.f.b.a.p .a ( p3 );
/* if-nez p2, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :cond_0
v0 = (( e.f.b.b.q ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I
/* .line 4 */
(( e.f.b.b.q ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;
p1 = (( e.f.b.b.u ) v1 ).a ( p1, v0, p2, p3 ); // invoke-virtual {v1, p1, v0, p2, p3}, Le/f/b/b/u;->a(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Z
} // .end method
public Integer size ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.d;
/* const-wide/16 v1, 0x0 */
int v3 = 0; // const/4 v3, 0x0
/* .line 2 */
} // :goto_0
/* array-length v4, v0 */
/* if-ge v3, v4, :cond_0 */
/* .line 3 */
/* aget-object v4, v0, v3 */
/* iget v4, v4, Le/f/b/b/u;->c:I */
/* int-to-long v4, v4 */
/* add-long/2addr v1, v4 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 4 */
} // :cond_0
v0 = e.f.b.e.c .a ( v1,v2 );
} // .end method
public java.util.Collection values ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Collection<", */
/* "TV;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Le/f/b/b/q$g; */
/* invoke-direct {v0, p0}, Le/f/b/b/q$g;-><init>(Le/f/b/b/q;)V */
this.i = v0;
} // :goto_0
} // .end method
