public abstract class e.f.b.b.q$c implements java.util.Iterator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Le/f/b/b/q; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x401 */
/* name = "c" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">", */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Iterator<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* # instance fields */
public Integer b;
public Integer c;
public e.f.b.b.u d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/b/u<", */
/* "TK;TV;TE;TS;>;" */
/* } */
} // .end annotation
} // .end field
public java.util.concurrent.atomic.AtomicReferenceArray e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/atomic/AtomicReferenceArray<", */
/* "TE;>;" */
/* } */
} // .end annotation
} // .end field
public e.f.b.b.r f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TE;" */
/* } */
} // .end annotation
} // .end field
public e.f.b.b.q$h g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/b/q<", */
/* "TK;TV;TE;TS;>.h;" */
/* } */
} // .end annotation
} // .end field
public e.f.b.b.q$h h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/b/b/q<", */
/* "TK;TV;TE;TS;>.h;" */
/* } */
} // .end annotation
} // .end field
public final e.f.b.b.q i; //synthetic
/* # direct methods */
public e.f.b.b.q$c ( ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
p1 = this.d;
/* array-length p1, p1 */
/* add-int/lit8 p1, p1, -0x1 */
/* iput p1, p0, Le/f/b/b/q$c;->b:I */
int p1 = -1; // const/4 p1, -0x1
/* .line 3 */
/* iput p1, p0, Le/f/b/b/q$c;->c:I */
/* .line 4 */
(( e.f.b.b.q$c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/b/b/q$c;->a()V
return;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.g = v0;
/* .line 2 */
v0 = (( e.f.b.b.q$c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/b/b/q$c;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 3 */
} // :cond_0
v0 = (( e.f.b.b.q$c ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/b/b/q$c;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_1
return;
/* .line 4 */
} // :cond_1
/* iget v0, p0, Le/f/b/b/q$c;->b:I */
/* if-ltz v0, :cond_2 */
/* .line 5 */
v1 = this.i;
v1 = this.d;
/* add-int/lit8 v2, v0, -0x1 */
/* iput v2, p0, Le/f/b/b/q$c;->b:I */
/* aget-object v0, v1, v0 */
this.d = v0;
/* .line 6 */
/* iget v0, v0, Le/f/b/b/u;->c:I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
v0 = this.d;
v0 = this.f;
this.e = v0;
/* .line 8 */
v0 = (( java.util.concurrent.atomic.AtomicReferenceArray ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Le/f/b/b/q$c;->c:I */
/* .line 9 */
v0 = (( e.f.b.b.q$c ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/b/b/q$c;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_2
return;
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TE;)Z" */
/* } */
} // .end annotation
/* .line 10 */
try { // :try_start_0
/* .line 11 */
v1 = this.i;
(( e.f.b.b.q ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/f/b/b/q;->a(Le/f/b/b/r;)Ljava/lang/Object;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 12 */
/* new-instance v1, Le/f/b/b/q$h; */
v2 = this.i;
/* invoke-direct {v1, v2, v0, p1}, Le/f/b/b/q$h;-><init>(Le/f/b/b/q;Ljava/lang/Object;Ljava/lang/Object;)V */
this.g = v1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 13 */
} // :goto_0
v0 = this.d;
(( e.f.b.b.u ) v0 ).e ( ); // invoke-virtual {v0}, Le/f/b/b/u;->e()V
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* :catchall_0 */
/* move-exception p1 */
v0 = this.d;
(( e.f.b.b.u ) v0 ).e ( ); // invoke-virtual {v0}, Le/f/b/b/u;->e()V
/* .line 14 */
/* throw p1 */
} // .end method
public e.f.b.b.q$h b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/b/b/q<", */
/* "TK;TV;TE;TS;>.h;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
this.h = v0;
/* .line 3 */
(( e.f.b.b.q$c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/b/b/q$c;->a()V
/* .line 4 */
v0 = this.h;
/* .line 5 */
} // :cond_0
/* new-instance v0, Ljava/util/NoSuchElementException; */
/* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
/* throw v0 */
} // .end method
public Boolean c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
} // :goto_0
this.f = v0;
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v0 = (( e.f.b.b.q$c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q$c;->a(Le/f/b/b/r;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
} // :cond_0
v0 = this.f;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean d ( ) {
/* .locals 3 */
/* .line 1 */
} // :cond_0
/* iget v0, p0, Le/f/b/b/q$c;->c:I */
/* if-ltz v0, :cond_2 */
/* .line 2 */
v1 = this.e;
/* add-int/lit8 v2, v0, -0x1 */
/* iput v2, p0, Le/f/b/b/q$c;->c:I */
(( java.util.concurrent.atomic.AtomicReferenceArray ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Le/f/b/b/r; */
this.f = v0;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = (( e.f.b.b.q$c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/b/q$c;->a(Le/f/b/b/r;)Z
/* if-nez v0, :cond_1 */
v0 = (( e.f.b.b.q$c ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/b/b/q$c;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean hasNext ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void remove ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
e.f.b.b.c .a ( v0 );
/* .line 2 */
v0 = this.i;
v1 = this.h;
(( e.f.b.b.q$h ) v1 ).getKey ( ); // invoke-virtual {v1}, Le/f/b/b/q$h;->getKey()Ljava/lang/Object;
(( e.f.b.b.q ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Le/f/b/b/q;->remove(Ljava/lang/Object;)Ljava/lang/Object;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.h = v0;
return;
} // .end method
