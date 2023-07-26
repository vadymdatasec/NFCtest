public class c.r.d.u$a implements androidx.recyclerview.widget.RecyclerView$o$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "VisibleForTests" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/EnclosingClass; */
/* value = Lc/r/d/u; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public Integer a;
public Integer b;
public c;
public Integer d;
/* # direct methods */
public c.r.d.u$a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 30 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = -1; // const/4 v1, -0x1
/* .line 31 */
java.util.Arrays .fill ( v0,v1 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 32 */
/* iput v0, p0, Lc/r/d/u$a;->d:I */
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* if-ltz p1, :cond_3 */
/* if-ltz p2, :cond_2 */
/* .line 15 */
/* iget v0, p0, Lc/r/d/u$a;->d:I */
/* mul-int/lit8 v0, v0, 0x2 */
/* .line 16 */
v1 = this.c;
/* if-nez v1, :cond_0 */
int v1 = 4; // const/4 v1, 0x4
/* new-array v1, v1, [I */
/* .line 17 */
this.c = v1;
int v2 = -1; // const/4 v2, -0x1
/* .line 18 */
java.util.Arrays .fill ( v1,v2 );
/* .line 19 */
} // :cond_0
/* array-length v2, v1 */
/* if-lt v0, v2, :cond_1 */
/* mul-int/lit8 v2, v0, 0x2 */
/* .line 20 */
/* new-array v2, v2, [I */
this.c = v2;
/* .line 21 */
/* array-length v3, v1 */
int v4 = 0; // const/4 v4, 0x0
java.lang.System .arraycopy ( v1,v4,v2,v4,v3 );
/* .line 22 */
} // :cond_1
} // :goto_0
v1 = this.c;
/* aput p1, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 23 */
/* aput p2, v1, v0 */
/* .line 24 */
/* iget p1, p0, Lc/r/d/u$a;->d:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Lc/r/d/u$a;->d:I */
return;
/* .line 25 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Pixel distance must be non-negative"; // const-string p2, "Pixel distance must be non-negative"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 26 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "Layout positions must be non-negative"; // const-string p2, "Layout positions must be non-negative"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0, Boolean p1 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Lc/r/d/u$a;->d:I */
/* .line 2 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = -1; // const/4 v1, -0x1
/* .line 3 */
java.util.Arrays .fill ( v0,v1 );
/* .line 4 */
} // :cond_0
v0 = this.n;
/* .line 5 */
v1 = this.m;
if ( v1 != null) { // if-eqz v1, :cond_3
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 6 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) v0 ).v ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$o;->v()Z
if ( v1 != null) { // if-eqz v1, :cond_3
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 7 */
v1 = this.e;
v1 = (( c.r.d.a ) v1 ).c ( ); // invoke-virtual {v1}, Lc/r/d/a;->c()Z
/* if-nez v1, :cond_2 */
/* .line 8 */
v1 = this.m;
v1 = (( androidx.recyclerview.widget.RecyclerView$g ) v1 ).a ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$g;->a()I
(( androidx.recyclerview.widget.RecyclerView$o ) v0 ).a ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(ILandroidx/recyclerview/widget/RecyclerView$o$a;)V
/* .line 9 */
} // :cond_1
v1 = (( androidx.recyclerview.widget.RecyclerView ) p1 ).p ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->p()Z
/* if-nez v1, :cond_2 */
/* .line 10 */
/* iget v1, p0, Lc/r/d/u$a;->a:I */
/* iget v2, p0, Lc/r/d/u$a;->b:I */
v3 = this.i0;
(( androidx.recyclerview.widget.RecyclerView$o ) v0 ).a ( v1, v2, v3, p0 ); // invoke-virtual {v0, v1, v2, v3, p0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(IILandroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/RecyclerView$o$a;)V
/* .line 11 */
} // :cond_2
} // :goto_0
/* iget v1, p0, Lc/r/d/u$a;->d:I */
/* iget v2, v0, Landroidx/recyclerview/widget/RecyclerView$o;->l:I */
/* if-le v1, v2, :cond_3 */
/* .line 12 */
/* iput v1, v0, Landroidx/recyclerview/widget/RecyclerView$o;->l:I */
/* .line 13 */
/* iput-boolean p2, v0, Landroidx/recyclerview/widget/RecyclerView$o;->m:Z */
/* .line 14 */
p1 = this.c;
(( androidx.recyclerview.widget.RecyclerView$v ) p1 ).j ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$v;->j()V
} // :cond_3
return;
} // .end method
public Boolean a ( Integer p0 ) {
/* .locals 4 */
/* .line 27 */
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 28 */
/* iget v0, p0, Lc/r/d/u$a;->d:I */
/* mul-int/lit8 v0, v0, 0x2 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 29 */
v3 = this.c;
/* aget v3, v3, v2 */
/* if-ne v3, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x2 */
} // :cond_1
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lc/r/d/u$a;->a:I */
/* .line 2 */
/* iput p2, p0, Lc/r/d/u$a;->b:I */
return;
} // .end method
