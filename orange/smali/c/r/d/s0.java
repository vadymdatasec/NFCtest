public class c.r.d.s0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/r/d/s0$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.e.i a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/i<", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* "Lc/r/d/r0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final c.e.f b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/f<", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.r.d.s0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/e/i; */
/* invoke-direct {v0}, Lc/e/i;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Lc/e/f; */
/* invoke-direct {v0}, Lc/e/f;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public androidx.recyclerview.widget.RecyclerView$d0 a ( Long p0 ) {
/* .locals 1 */
/* .line 19 */
v0 = this.b;
(( c.e.f ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/e/f;->b(J)Ljava/lang/Object;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$d0; */
} // .end method
public final androidx.recyclerview.widget.RecyclerView$l$b a ( androidx.recyclerview.widget.RecyclerView$d0 p0, Integer p1 ) {
/* .locals 4 */
/* .line 3 */
v0 = this.a;
p1 = (( c.e.i ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->a(Ljava/lang/Object;)I
int v0 = 0; // const/4 v0, 0x0
/* if-gez p1, :cond_0 */
/* .line 4 */
} // :cond_0
v1 = this.a;
(( c.e.i ) v1 ).e ( p1 ); // invoke-virtual {v1, p1}, Lc/e/i;->e(I)Ljava/lang/Object;
/* check-cast v1, Lc/r/d/r0; */
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 5 */
/* iget v2, v1, Lc/r/d/r0;->a:I */
/* and-int v3, v2, p2 */
if ( v3 != null) { // if-eqz v3, :cond_4
/* not-int v0, p2 */
/* and-int/2addr v0, v2 */
/* .line 6 */
/* iput v0, v1, Lc/r/d/r0;->a:I */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p2, v0, :cond_1 */
/* .line 7 */
p2 = this.b;
} // :cond_1
/* const/16 v0, 0x8 */
/* if-ne p2, v0, :cond_3 */
/* .line 8 */
p2 = this.c;
/* .line 9 */
} // :goto_0
/* iget v0, v1, Lc/r/d/r0;->a:I */
/* and-int/lit8 v0, v0, 0xc */
/* if-nez v0, :cond_2 */
/* .line 10 */
v0 = this.a;
(( c.e.i ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->d(I)Ljava/lang/Object;
/* .line 11 */
c.r.d.r0 .a ( v1 );
} // :cond_2
/* .line 12 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Must provide flag PRE or POST"; // const-string p2, "Must provide flag PRE or POST"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_4
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.e.i ) v0 ).clear ( ); // invoke-virtual {v0}, Lc/e/i;->clear()V
/* .line 2 */
v0 = this.b;
(( c.e.f ) v0 ).a ( ); // invoke-virtual {v0}, Lc/e/f;->a()V
return;
} // .end method
public void a ( Long p0, androidx.recyclerview.widget.RecyclerView$d0 p1 ) {
/* .locals 1 */
/* .line 13 */
v0 = this.b;
(( c.e.f ) v0 ).c ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/e/f;->c(JLjava/lang/Object;)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 2 */
/* .line 20 */
v0 = this.a;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lc/r/d/r0; */
/* if-nez v0, :cond_0 */
/* .line 21 */
c.r.d.r0 .b ( );
/* .line 22 */
v1 = this.a;
(( c.e.i ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 23 */
} // :cond_0
/* iget p1, v0, Lc/r/d/r0;->a:I */
/* or-int/lit8 p1, p1, 0x1 */
/* iput p1, v0, Lc/r/d/r0;->a:I */
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$l$b p1 ) {
/* .locals 2 */
/* .line 14 */
v0 = this.a;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lc/r/d/r0; */
/* if-nez v0, :cond_0 */
/* .line 15 */
c.r.d.r0 .b ( );
/* .line 16 */
v1 = this.a;
(( c.e.i ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 17 */
} // :cond_0
/* iget p1, v0, Lc/r/d/r0;->a:I */
/* or-int/lit8 p1, p1, 0x2 */
/* iput p1, v0, Lc/r/d/r0;->a:I */
/* .line 18 */
this.b = p2;
return;
} // .end method
public void a ( c.r.d.s0$a p0 ) {
/* .locals 6 */
/* .line 24 */
v0 = this.a;
v0 = (( c.e.i ) v0 ).size ( ); // invoke-virtual {v0}, Lc/e/i;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_7 */
/* .line 25 */
v1 = this.a;
(( c.e.i ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lc/e/i;->c(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$d0; */
/* .line 26 */
v2 = this.a;
(( c.e.i ) v2 ).d ( v0 ); // invoke-virtual {v2, v0}, Lc/e/i;->d(I)Ljava/lang/Object;
/* check-cast v2, Lc/r/d/r0; */
/* .line 27 */
/* iget v3, v2, Lc/r/d/r0;->a:I */
/* and-int/lit8 v4, v3, 0x3 */
int v5 = 3; // const/4 v5, 0x3
/* if-ne v4, v5, :cond_0 */
/* .line 28 */
} // :cond_0
/* and-int/lit8 v4, v3, 0x1 */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 29 */
v3 = this.b;
/* if-nez v3, :cond_1 */
/* .line 30 */
/* .line 31 */
} // :cond_1
v4 = this.c;
} // :cond_2
/* and-int/lit8 v4, v3, 0xe */
/* const/16 v5, 0xe */
/* if-ne v4, v5, :cond_3 */
/* .line 32 */
v3 = this.b;
v4 = this.c;
} // :cond_3
/* and-int/lit8 v4, v3, 0xc */
/* const/16 v5, 0xc */
/* if-ne v4, v5, :cond_4 */
/* .line 33 */
v3 = this.b;
v4 = this.c;
} // :cond_4
/* and-int/lit8 v4, v3, 0x4 */
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 34 */
v3 = this.b;
int v4 = 0; // const/4 v4, 0x0
} // :cond_5
/* and-int/lit8 v3, v3, 0x8 */
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 35 */
v3 = this.b;
v4 = this.c;
/* .line 36 */
} // :cond_6
} // :goto_1
c.r.d.r0 .a ( v2 );
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_7
return;
} // .end method
public void b ( ) {
/* .locals 0 */
/* .line 8 */
c.r.d.r0 .a ( );
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$l$b p1 ) {
/* .locals 2 */
/* .line 3 */
v0 = this.a;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lc/r/d/r0; */
/* if-nez v0, :cond_0 */
/* .line 4 */
c.r.d.r0 .b ( );
/* .line 5 */
v1 = this.a;
(( c.e.i ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 6 */
} // :cond_0
this.c = p2;
/* .line 7 */
/* iget p1, v0, Lc/r/d/r0;->a:I */
/* or-int/lit8 p1, p1, 0x8 */
/* iput p1, v0, Lc/r/d/r0;->a:I */
return;
} // .end method
public Boolean b ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/r/d/r0; */
int v0 = 1; // const/4 v0, 0x1
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
/* iget p1, p1, Lc/r/d/r0;->a:I */
/* and-int/2addr p1, v0 */
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void c ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$l$b p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lc/r/d/r0; */
/* if-nez v0, :cond_0 */
/* .line 2 */
c.r.d.r0 .b ( );
/* .line 3 */
v1 = this.a;
(( c.e.i ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 4 */
} // :cond_0
this.b = p2;
/* .line 5 */
/* iget p1, v0, Lc/r/d/r0;->a:I */
/* or-int/lit8 p1, p1, 0x4 */
/* iput p1, v0, Lc/r/d/r0;->a:I */
return;
} // .end method
public Boolean c ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
/* .line 6 */
v0 = this.a;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/r/d/r0; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 7 */
/* iget p1, p1, Lc/r/d/r0;->a:I */
/* and-int/lit8 p1, p1, 0x4 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void d ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .line 1 */
(( c.r.d.s0 ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lc/r/d/s0;->g(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public androidx.recyclerview.widget.RecyclerView$l$b e ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
/* const/16 v0, 0x8 */
/* .line 1 */
(( c.r.d.s0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/r/d/s0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroidx/recyclerview/widget/RecyclerView$l$b;
} // .end method
public androidx.recyclerview.widget.RecyclerView$l$b f ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
/* .line 1 */
(( c.r.d.s0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/r/d/s0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroidx/recyclerview/widget/RecyclerView$l$b;
} // .end method
public void g ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.e.i ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/r/d/r0; */
/* if-nez p1, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* iget v0, p1, Lc/r/d/r0;->a:I */
/* and-int/lit8 v0, v0, -0x2 */
/* iput v0, p1, Lc/r/d/r0;->a:I */
return;
} // .end method
public void h ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v0 = (( c.e.f ) v0 ).d ( ); // invoke-virtual {v0}, Lc/e/f;->d()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 2 */
v1 = this.b;
(( c.e.f ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lc/e/f;->c(I)Ljava/lang/Object;
/* if-ne p1, v1, :cond_0 */
/* .line 3 */
v1 = this.b;
(( c.e.f ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lc/e/f;->b(I)V
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
/* .line 4 */
} // :cond_1
} // :goto_1
v0 = this.a;
(( c.e.i ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/r/d/r0; */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
c.r.d.r0 .a ( p1 );
} // :cond_2
return;
} // .end method
