public class e.f.c.k.e$a {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/f/c/k/e; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* # instance fields */
public final java.util.Set a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Ljava/lang/Class<", */
/* "-TT;>;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.Set b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Le/f/c/k/u;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer c;
public Integer d;
public e.f.c.k.k e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/c/k/k<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public java.util.Set f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Ljava/lang/Class<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.k.e$a ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "TT;>;[", */
/* "Ljava/lang/Class<", */
/* "-TT;>;)V" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/SafeVarargs; */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.a = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.b = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput v0, p0, Le/f/c/k/e$a;->c:I */
/* .line 6 */
/* iput v0, p0, Le/f/c/k/e$a;->d:I */
/* .line 7 */
/* new-instance v1, Ljava/util/HashSet; */
/* invoke-direct {v1}, Ljava/util/HashSet;-><init>()V */
this.f = v1;
final String v1 = "Null interface"; // const-string v1, "Null interface"
/* .line 8 */
e.f.c.k.y .a ( p1,v1 );
/* .line 9 */
v2 = this.a;
/* .line 10 */
/* array-length p1, p2 */
} // :goto_0
/* if-ge v0, p1, :cond_0 */
/* aget-object v2, p2, v0 */
/* .line 11 */
e.f.c.k.y .a ( v2,v1 );
/* add-int/lit8 v0, v0, 0x1 */
/* .line 12 */
} // :cond_0
p1 = this.a;
java.util.Collections .addAll ( p1,p2 );
return;
} // .end method
public e.f.c.k.e$a ( ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Le/f/c/k/e$a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V */
return;
} // .end method
public static e.f.c.k.e$a a ( e.f.c.k.e$a p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( e.f.c.k.e$a ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/k/e$a;->d()Le/f/c/k/e$a;
} // .end method
/* # virtual methods */
public e.f.c.k.e$a a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/c/k/e$a<", */
/* "TT;>;" */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
(( e.f.c.k.e$a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/k/e$a;->a(I)Le/f/c/k/e$a;
} // .end method
public final e.f.c.k.e$a a ( Integer p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I)", */
/* "Le/f/c/k/e$a<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 6 */
/* iget v0, p0, Le/f/c/k/e$a;->c:I */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
final String v1 = "Instantiation type has already been set."; // const-string v1, "Instantiation type has already been set."
e.f.c.k.y .b ( v0,v1 );
/* .line 7 */
/* iput p1, p0, Le/f/c/k/e$a;->c:I */
} // .end method
public e.f.c.k.e$a a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/k/k<", */
/* "TT;>;)", */
/* "Le/f/c/k/e$a<", */
/* "TT;>;" */
/* } */
} // .end annotation
final String v0 = "Null factory"; // const-string v0, "Null factory"
/* .line 11 */
e.f.c.k.y .a ( p1,v0 );
/* check-cast p1, Le/f/c/k/k; */
this.e = p1;
} // .end method
public e.f.c.k.e$a a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/k/u;", */
/* ")", */
/* "Le/f/c/k/e$a<", */
/* "TT;>;" */
/* } */
} // .end annotation
final String v0 = "Null dependency"; // const-string v0, "Null dependency"
/* .line 2 */
e.f.c.k.y .a ( p1,v0 );
/* .line 3 */
(( e.f.c.k.u ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/k/u;->a()Ljava/lang/Class;
(( e.f.c.k.e$a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/k/e$a;->a(Ljava/lang/Class;)V
/* .line 4 */
v0 = this.b;
} // .end method
public final void a ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 8 */
v0 = this.a;
p1 = /* .line 9 */
/* xor-int/lit8 p1, p1, 0x1 */
final String v0 = "Components are not allowed to depend on interfaces they themselves provide."; // const-string v0, "Components are not allowed to depend on interfaces they themselves provide."
/* .line 10 */
e.f.c.k.y .a ( p1,v0 );
return;
} // .end method
public e.f.c.k.e b ( ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/c/k/e<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
final String v1 = "Missing required property: factory."; // const-string v1, "Missing required property: factory."
e.f.c.k.y .b ( v0,v1 );
/* .line 2 */
/* new-instance v0, Le/f/c/k/e; */
/* new-instance v3, Ljava/util/HashSet; */
v1 = this.a;
/* invoke-direct {v3, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
/* new-instance v4, Ljava/util/HashSet; */
v1 = this.b;
/* invoke-direct {v4, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
/* iget v5, p0, Le/f/c/k/e$a;->c:I */
/* iget v6, p0, Le/f/c/k/e$a;->d:I */
v7 = this.e;
v8 = this.f;
int v9 = 0; // const/4 v9, 0x0
/* move-object v2, v0 */
/* invoke-direct/range {v2 ..v9}, Le/f/c/k/e;-><init>(Ljava/util/Set;Ljava/util/Set;IILe/f/c/k/k;Ljava/util/Set;Le/f/c/k/d;)V */
} // .end method
public e.f.c.k.e$a c ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/c/k/e$a<", */
/* "TT;>;" */
/* } */
} // .end annotation
int v0 = 2; // const/4 v0, 0x2
/* .line 1 */
(( e.f.c.k.e$a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/k/e$a;->a(I)Le/f/c/k/e$a;
} // .end method
public final e.f.c.k.e$a d ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/c/k/e$a<", */
/* "TT;>;" */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput v0, p0, Le/f/c/k/e$a;->d:I */
} // .end method
