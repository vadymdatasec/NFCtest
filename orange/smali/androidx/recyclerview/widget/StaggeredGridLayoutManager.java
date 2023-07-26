public class androidx.recyclerview.widget.StaggeredGridLayoutManager extends androidx.recyclerview.widget.RecyclerView$o {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;, */
	 /* Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;, */
	 /* Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;, */
	 /* Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;, */
	 /* Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
	 /* } */
} // .end annotation
/* # instance fields */
public java.util.BitSet A;
public Integer B;
public Integer C;
public androidx.recyclerview.widget.StaggeredGridLayoutManager$d D;
public Integer E;
public Boolean F;
public Boolean G;
public androidx.recyclerview.widget.StaggeredGridLayoutManager$e H;
public Integer I;
public final android.graphics.Rect J;
public final androidx.recyclerview.widget.StaggeredGridLayoutManager$b K;
public Boolean L;
public Boolean M;
public N;
public final java.lang.Runnable O;
public Integer r;
public androidx.recyclerview.widget.StaggeredGridLayoutManager$f s;
public c.r.d.c0 t;
public c.r.d.c0 u;
public Integer v;
public Integer w;
public final c.r.d.w x;
public Boolean y;
public Boolean z;
/* # direct methods */
public androidx.recyclerview.widget.StaggeredGridLayoutManager ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$o;-><init>()V */
	 int v0 = -1; // const/4 v0, -0x1
	 /* .line 2 */
	 /* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 3 */
	 /* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
	 /* .line 4 */
	 /* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
	 /* .line 5 */
	 /* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
	 /* const/high16 v0, -0x80000000 */
	 /* .line 6 */
	 /* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C:I */
	 /* .line 7 */
	 /* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d; */
	 /* invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;-><init>()V */
	 this.D = v0;
	 int v0 = 2; // const/4 v0, 0x2
	 /* .line 8 */
	 /* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->E:I */
	 /* .line 9 */
	 /* new-instance v0, Landroid/graphics/Rect; */
	 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
	 this.J = v0;
	 /* .line 10 */
	 /* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b; */
	 /* invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V */
	 this.K = v0;
	 /* .line 11 */
	 /* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L:Z */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 12 */
	 /* iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
	 /* .line 13 */
	 /* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$a; */
	 /* invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$a;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V */
	 this.O = v0;
	 /* .line 14 */
	 androidx.recyclerview.widget.RecyclerView$o .a ( p1,p2,p3,p4 );
	 /* .line 15 */
	 /* iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$o$b;->a:I */
	 (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).t ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->t(I)V
	 /* .line 16 */
	 /* iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$o$b;->b:I */
	 (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).u ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->u(I)V
	 /* .line 17 */
	 /* iget-boolean p1, p1, Landroidx/recyclerview/widget/RecyclerView$o$b;->c:Z */
	 (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d(Z)V
	 /* .line 18 */
	 /* new-instance p1, Lc/r/d/w; */
	 /* invoke-direct {p1}, Lc/r/d/w;-><init>()V */
	 this.x = p1;
	 /* .line 19 */
	 (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).G ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->G()V
	 return;
} // .end method
/* # virtual methods */
public Boolean C ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.H;
	 /* if-nez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean D ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.s;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
/* const/high16 v2, -0x80000000 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
int v3 = 1; // const/4 v3, 0x1
int v4 = 1; // const/4 v4, 0x1
/* .line 2 */
} // :goto_0
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v4, v5, :cond_1 */
/* .line 3 */
v5 = this.s;
/* aget-object v5, v5, v4 */
v5 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v5 ).a ( v2 ); // invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
/* if-eq v5, v0, :cond_0 */
} // :cond_0
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
} // .end method
public Boolean E ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.s;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
/* const/high16 v2, -0x80000000 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
int v3 = 1; // const/4 v3, 0x1
int v4 = 1; // const/4 v4, 0x1
/* .line 2 */
} // :goto_0
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v4, v5, :cond_1 */
/* .line 3 */
v5 = this.s;
/* aget-object v5, v5, v4 */
v5 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v5 ).b ( v2 ); // invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
/* if-eq v5, v0, :cond_0 */
} // :cond_0
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
} // .end method
public Boolean F ( ) {
/* .locals 7 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_7
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->E:I */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).t ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->t()Z
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).J ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()I
/* .line 4 */
v2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I()I
/* .line 5 */
} // :cond_1
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I()I
/* .line 6 */
v2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).J ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()I
} // :goto_0
int v3 = 1; // const/4 v3, 0x1
/* if-nez v0, :cond_2 */
/* .line 7 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).K ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->K()Landroid/view/View;
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 8 */
v0 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a()V
/* .line 9 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).z ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->z()V
/* .line 10 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
/* .line 11 */
} // :cond_2
/* iget-boolean v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L:Z */
/* if-nez v4, :cond_3 */
/* .line 12 */
} // :cond_3
/* iget-boolean v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
int v5 = -1; // const/4 v5, -0x1
if ( v4 != null) { // if-eqz v4, :cond_4
int v4 = -1; // const/4 v4, -0x1
} // :cond_4
int v4 = 1; // const/4 v4, 0x1
/* .line 13 */
} // :goto_1
v6 = this.D;
/* add-int/2addr v2, v3 */
/* .line 14 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v6 ).a ( v0, v2, v4, v3 ); // invoke-virtual {v6, v0, v2, v4, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(IIIZ)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
/* if-nez v6, :cond_5 */
/* .line 15 */
/* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L:Z */
/* .line 16 */
v0 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->b(I)I
/* .line 17 */
} // :cond_5
v1 = this.D;
/* iget v2, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* mul-int/lit8 v4, v4, -0x1 */
/* .line 18 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v1 ).a ( v0, v2, v4, v3 ); // invoke-virtual {v1, v0, v2, v4, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(IIIZ)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
/* if-nez v0, :cond_6 */
/* .line 19 */
v0 = this.D;
/* iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->b(I)I
/* .line 20 */
} // :cond_6
v1 = this.D;
/* iget v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* add-int/2addr v0, v3 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->b(I)I
/* .line 21 */
} // :goto_2
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).z ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->z()V
/* .line 22 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
} // :cond_7
} // :goto_3
} // .end method
public final void G ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
c.r.d.c0 .a ( p0,v0 );
this.t = v0;
/* .line 2 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* rsub-int/lit8 v0, v0, 0x1 */
/* .line 3 */
c.r.d.c0 .a ( p0,v0 );
this.u = v0;
return;
} // .end method
public Integer H ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;
/* .line 2 */
} // :cond_0
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(Z)Landroid/view/View;
} // :goto_0
/* if-nez v0, :cond_1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 3 */
} // :cond_1
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
} // :goto_1
} // .end method
public Integer I ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
} // :goto_0
} // .end method
public Integer J ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
} // :goto_0
} // .end method
public android.view.View K ( ) {
/* .locals 12 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* .line 2 */
/* new-instance v2, Ljava/util/BitSet; */
/* iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V */
/* .line 3 */
/* iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
int v4 = 0; // const/4 v4, 0x0
(( java.util.BitSet ) v2 ).set ( v4, v3, v1 ); // invoke-virtual {v2, v4, v3, v1}, Ljava/util/BitSet;->set(IIZ)V
/* .line 4 */
/* iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
int v5 = -1; // const/4 v5, -0x1
/* if-ne v3, v1, :cond_0 */
v3 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).M ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M()Z
if ( v3 != null) { // if-eqz v3, :cond_0
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = -1; // const/4 v3, -0x1
/* .line 5 */
} // :goto_0
/* iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
if ( v6 != null) { // if-eqz v6, :cond_1
int v6 = -1; // const/4 v6, -0x1
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
/* move v6, v0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* if-ge v0, v6, :cond_2 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_2
} // :goto_2
/* if-eq v0, v6, :cond_d */
/* .line 6 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 7 */
(( android.view.View ) v7 ).getLayoutParams ( ); // invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 8 */
v9 = this.e;
/* iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
v9 = (( java.util.BitSet ) v2 ).get ( v9 ); // invoke-virtual {v2, v9}, Ljava/util/BitSet;->get(I)Z
if ( v9 != null) { // if-eqz v9, :cond_4
/* .line 9 */
v9 = this.e;
v9 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( v9 ); // invoke-virtual {p0, v9}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;)Z
if ( v9 != null) { // if-eqz v9, :cond_3
/* .line 10 */
} // :cond_3
v9 = this.e;
/* iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
(( java.util.BitSet ) v2 ).clear ( v9 ); // invoke-virtual {v2, v9}, Ljava/util/BitSet;->clear(I)V
/* .line 11 */
} // :cond_4
/* iget-boolean v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v9 != null) { // if-eqz v9, :cond_5
} // :cond_5
/* add-int v9, v0, v5 */
/* if-eq v9, v6, :cond_c */
/* .line 12 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v9 ); // invoke-virtual {p0, v9}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 13 */
/* iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
if ( v10 != null) { // if-eqz v10, :cond_7
/* .line 14 */
v10 = this.t;
v10 = (( c.r.d.c0 ) v10 ).a ( v7 ); // invoke-virtual {v10, v7}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* .line 15 */
v11 = this.t;
v11 = (( c.r.d.c0 ) v11 ).a ( v9 ); // invoke-virtual {v11, v9}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* if-ge v10, v11, :cond_6 */
} // :cond_6
/* if-ne v10, v11, :cond_9 */
/* .line 16 */
} // :cond_7
v10 = this.t;
v10 = (( c.r.d.c0 ) v10 ).d ( v7 ); // invoke-virtual {v10, v7}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* .line 17 */
v11 = this.t;
v11 = (( c.r.d.c0 ) v11 ).d ( v9 ); // invoke-virtual {v11, v9}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* if-le v10, v11, :cond_8 */
} // :cond_8
/* if-ne v10, v11, :cond_9 */
} // :goto_3
int v10 = 1; // const/4 v10, 0x1
} // :cond_9
int v10 = 0; // const/4 v10, 0x0
} // :goto_4
if ( v10 != null) { // if-eqz v10, :cond_c
/* .line 18 */
(( android.view.View ) v9 ).getLayoutParams ( ); // invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 19 */
v8 = this.e;
/* iget v8, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
v9 = this.e;
/* iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
/* sub-int/2addr v8, v9 */
/* if-gez v8, :cond_a */
int v8 = 1; // const/4 v8, 0x1
} // :cond_a
int v8 = 0; // const/4 v8, 0x0
} // :goto_5
/* if-gez v3, :cond_b */
int v9 = 1; // const/4 v9, 0x1
} // :cond_b
int v9 = 0; // const/4 v9, 0x0
} // :goto_6
/* if-eq v8, v9, :cond_c */
} // :cond_c
} // :goto_7
/* add-int/2addr v0, v5 */
} // :cond_d
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void L ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a()V
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
return;
} // .end method
public Boolean M ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).j ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j()I
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public final void N ( ) {
/* .locals 9 */
/* .line 1 */
v0 = this.u;
v0 = (( c.r.d.c0 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/r/d/c0;->d()I
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-ne v0, v1, :cond_0 */
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_3 */
/* .line 3 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v3 ); // invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 4 */
v5 = this.u;
v5 = (( c.r.d.c0 ) v5 ).b ( v4 ); // invoke-virtual {v5, v4}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* int-to-float v5, v5 */
/* cmpg-float v6, v5, v0 */
/* if-gez v6, :cond_1 */
/* .line 5 */
} // :cond_1
(( android.view.View ) v4 ).getLayoutParams ( ); // invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 6 */
v4 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$c ) v4 ).f ( ); // invoke-virtual {v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f()Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* const/high16 v4, 0x3f800000 # 1.0f */
/* mul-float v5, v5, v4 */
/* .line 7 */
/* iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* int-to-float v4, v4 */
/* div-float/2addr v5, v4 */
/* .line 8 */
} // :cond_2
v0 = java.lang.Math .max ( v0,v5 );
} // :goto_1
/* add-int/lit8 v3, v3, 0x1 */
/* .line 9 */
} // :cond_3
/* iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* .line 10 */
/* iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* int-to-float v4, v4 */
/* mul-float v0, v0, v4 */
v0 = java.lang.Math .round ( v0 );
/* .line 11 */
v4 = this.u;
v4 = (( c.r.d.c0 ) v4 ).d ( ); // invoke-virtual {v4}, Lc/r/d/c0;->d()I
/* const/high16 v5, -0x80000000 */
/* if-ne v4, v5, :cond_4 */
/* .line 12 */
v4 = this.u;
v4 = (( c.r.d.c0 ) v4 ).g ( ); // invoke-virtual {v4}, Lc/r/d/c0;->g()I
v0 = java.lang.Math .min ( v0,v4 );
/* .line 13 */
} // :cond_4
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).v ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v(I)V
/* .line 14 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* if-ne v0, v3, :cond_5 */
return;
} // :cond_5
} // :goto_2
/* if-ge v2, v1, :cond_9 */
/* .line 15 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 16 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 17 */
/* iget-boolean v5, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v5 != null) { // if-eqz v5, :cond_6
/* .line 18 */
} // :cond_6
v5 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).M ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M()Z
int v6 = 1; // const/4 v6, 0x1
if ( v5 != null) { // if-eqz v5, :cond_7
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne v5, v6, :cond_7 */
/* .line 19 */
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* add-int/lit8 v7, v5, -0x1 */
v4 = this.e;
/* iget v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
/* sub-int/2addr v7, v4 */
/* neg-int v7, v7 */
/* iget v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* mul-int v7, v7, v8 */
/* sub-int/2addr v5, v6 */
/* sub-int/2addr v5, v4 */
/* neg-int v4, v5 */
/* mul-int v4, v4, v3 */
/* sub-int/2addr v7, v4 */
/* .line 20 */
(( android.view.View ) v0 ).offsetLeftAndRight ( v7 ); // invoke-virtual {v0, v7}, Landroid/view/View;->offsetLeftAndRight(I)V
/* .line 21 */
} // :cond_7
v4 = this.e;
/* iget v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* mul-int v5, v5, v4 */
/* mul-int v4, v4, v3 */
/* .line 22 */
/* iget v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne v7, v6, :cond_8 */
/* sub-int/2addr v5, v4 */
/* .line 23 */
(( android.view.View ) v0 ).offsetLeftAndRight ( v5 ); // invoke-virtual {v0, v5}, Landroid/view/View;->offsetLeftAndRight(I)V
} // :cond_8
/* sub-int/2addr v5, v4 */
/* .line 24 */
(( android.view.View ) v0 ).offsetTopAndBottom ( v5 ); // invoke-virtual {v0, v5}, Landroid/view/View;->offsetTopAndBottom(I)V
} // :goto_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_9
return;
} // .end method
public final void O ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_1 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).M ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M()Z
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
/* xor-int/2addr v0, v1 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* .line 3 */
} // :cond_1
} // :goto_0
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
} // :goto_1
return;
} // .end method
public Integer a ( Integer p0, androidx.recyclerview.widget.RecyclerView$v p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
/* .locals 0 */
/* .line 245 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
} // .end method
public Integer a ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 0 */
/* .line 51 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(Landroidx/recyclerview/widget/RecyclerView$a0;)I
} // .end method
public Integer a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 2 */
/* .line 110 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 111 */
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* .line 112 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I */
} // .end method
public final Integer a ( androidx.recyclerview.widget.RecyclerView$v p0, Object p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
/* .locals 16 */
/* move-object/from16 v6, p0 */
/* move-object/from16 v7, p1 */
/* move-object/from16 v8, p2 */
/* .line 119 */
v0 = this.A;
/* iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
int v9 = 0; // const/4 v9, 0x0
int v10 = 1; // const/4 v10, 0x1
(( java.util.BitSet ) v0 ).set ( v9, v1, v10 ); // invoke-virtual {v0, v9, v1, v10}, Ljava/util/BitSet;->set(IIZ)V
/* .line 120 */
v0 = this.x;
/* iget-boolean v0, v0, Lc/r/d/w;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 121 */
/* iget v0, v8, Lc/r/d/w;->e:I */
/* if-ne v0, v10, :cond_0 */
/* const v0, 0x7fffffff */
/* const v11, 0x7fffffff */
} // :cond_0
/* const/high16 v0, -0x80000000 */
/* const/high16 v11, -0x80000000 */
/* .line 122 */
} // :cond_1
/* iget v0, v8, Lc/r/d/w;->e:I */
/* if-ne v0, v10, :cond_2 */
/* .line 123 */
/* iget v0, v8, Lc/r/d/w;->g:I */
/* iget v1, v8, Lc/r/d/w;->b:I */
/* add-int/2addr v0, v1 */
/* .line 124 */
} // :cond_2
/* iget v0, v8, Lc/r/d/w;->f:I */
/* iget v1, v8, Lc/r/d/w;->b:I */
/* sub-int/2addr v0, v1 */
} // :goto_0
/* move v11, v0 */
/* .line 125 */
} // :goto_1
/* iget v0, v8, Lc/r/d/w;->e:I */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).e ( v0, v11 ); // invoke-virtual {v6, v0, v11}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e(II)V
/* .line 126 */
/* iget-boolean v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.t;
/* .line 127 */
v0 = (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
} // :cond_3
v0 = this.t;
/* .line 128 */
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
} // :goto_2
/* move v12, v0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 129 */
} // :goto_3
v1 = /* invoke-virtual/range {p2 ..p3}, Lc/r/d/w;->a(Landroidx/recyclerview/widget/RecyclerView$a0;)Z */
int v2 = -1; // const/4 v2, -0x1
if ( v1 != null) { // if-eqz v1, :cond_19
v1 = this.x;
/* iget-boolean v1, v1, Lc/r/d/w;->i:Z */
/* if-nez v1, :cond_4 */
v1 = this.A;
/* .line 130 */
v1 = (( java.util.BitSet ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/BitSet;->isEmpty()Z
/* if-nez v1, :cond_19 */
/* .line 131 */
} // :cond_4
(( c.r.d.w ) v8 ).a ( v7 ); // invoke-virtual {v8, v7}, Lc/r/d/w;->a(Landroidx/recyclerview/widget/RecyclerView$v;)Landroid/view/View;
/* .line 132 */
(( android.view.View ) v13 ).getLayoutParams ( ); // invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* move-object v14, v0 */
/* check-cast v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 133 */
v0 = (( androidx.recyclerview.widget.RecyclerView$p ) v14 ).a ( ); // invoke-virtual {v14}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
/* .line 134 */
v1 = this.D;
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v1 ).d ( v0 ); // invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->d(I)I
/* if-ne v1, v2, :cond_5 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_5
int v3 = 0; // const/4 v3, 0x0
} // :goto_4
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 135 */
/* iget-boolean v1, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
v1 = this.s;
/* aget-object v1, v1, v9 */
} // :cond_6
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).a ( v8 ); // invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Lc/r/d/w;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;
/* .line 136 */
} // :goto_5
v4 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v4 ).a ( v0, v1 ); // invoke-virtual {v4, v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(ILandroidx/recyclerview/widget/StaggeredGridLayoutManager$f;)V
/* .line 137 */
} // :cond_7
v4 = this.s;
/* aget-object v1, v4, v1 */
} // :goto_6
/* move-object v15, v1 */
/* .line 138 */
this.e = v15;
/* .line 139 */
/* iget v1, v8, Lc/r/d/w;->e:I */
/* if-ne v1, v10, :cond_8 */
/* .line 140 */
(( androidx.recyclerview.widget.RecyclerView$o ) v6 ).b ( v13 ); // invoke-virtual {v6, v13}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroid/view/View;)V
/* .line 141 */
} // :cond_8
(( androidx.recyclerview.widget.RecyclerView$o ) v6 ).b ( v13, v9 ); // invoke-virtual {v6, v13, v9}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroid/view/View;I)V
/* .line 142 */
} // :goto_7
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).a ( v13, v14, v9 ); // invoke-virtual {v6, v13, v14, v9}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;Z)V
/* .line 143 */
/* iget v1, v8, Lc/r/d/w;->e:I */
/* if-ne v1, v10, :cond_b */
/* .line 144 */
/* iget-boolean v1, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v1 != null) { // if-eqz v1, :cond_9
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).n ( v12 ); // invoke-virtual {v6, v12}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n(I)I
/* .line 145 */
} // :cond_9
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v15 ).a ( v12 ); // invoke-virtual {v15, v12}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
/* .line 146 */
} // :goto_8
v4 = this.t;
v4 = (( c.r.d.c0 ) v4 ).b ( v13 ); // invoke-virtual {v4, v13}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* add-int/2addr v4, v1 */
if ( v3 != null) { // if-eqz v3, :cond_a
/* .line 147 */
/* iget-boolean v5, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v5 != null) { // if-eqz v5, :cond_a
/* .line 148 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).j ( v1 ); // invoke-virtual {v6, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
/* .line 149 */
/* iput v2, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->c:I */
/* .line 150 */
/* iput v0, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* .line 151 */
v9 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v9 ).a ( v5 ); // invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;)V
} // :cond_a
/* move v5, v4 */
/* move v4, v1 */
/* .line 152 */
} // :cond_b
/* iget-boolean v1, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v1 != null) { // if-eqz v1, :cond_c
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).q ( v12 ); // invoke-virtual {v6, v12}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q(I)I
/* .line 153 */
} // :cond_c
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v15 ).b ( v12 ); // invoke-virtual {v15, v12}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
/* .line 154 */
} // :goto_9
v4 = this.t;
v4 = (( c.r.d.c0 ) v4 ).b ( v13 ); // invoke-virtual {v4, v13}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* sub-int v4, v1, v4 */
if ( v3 != null) { // if-eqz v3, :cond_d
/* .line 155 */
/* iget-boolean v5, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v5 != null) { // if-eqz v5, :cond_d
/* .line 156 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).k ( v1 ); // invoke-virtual {v6, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
/* .line 157 */
/* iput v10, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->c:I */
/* .line 158 */
/* iput v0, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->b:I */
/* .line 159 */
v9 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v9 ).a ( v5 ); // invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;)V
} // :cond_d
/* move v5, v1 */
/* .line 160 */
} // :goto_a
/* iget-boolean v1, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v1 != null) { // if-eqz v1, :cond_11
/* iget v1, v8, Lc/r/d/w;->d:I */
/* if-ne v1, v2, :cond_11 */
if ( v3 != null) { // if-eqz v3, :cond_e
/* .line 161 */
/* iput-boolean v10, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L:Z */
/* .line 162 */
} // :cond_e
/* iget v1, v8, Lc/r/d/w;->e:I */
/* if-ne v1, v10, :cond_f */
/* .line 163 */
v1 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->D()Z */
/* .line 164 */
} // :cond_f
v1 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->E()Z */
} // :goto_b
/* xor-int/2addr v1, v10 */
if ( v1 != null) { // if-eqz v1, :cond_11
/* .line 165 */
v1 = this.D;
/* .line 166 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->c(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
if ( v0 != null) { // if-eqz v0, :cond_10
/* .line 167 */
/* iput-boolean v10, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->e:Z */
/* .line 168 */
} // :cond_10
/* iput-boolean v10, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L:Z */
/* .line 169 */
} // :cond_11
} // :goto_c
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).a ( v13, v14, v8 ); // invoke-virtual {v6, v13, v14, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;Lc/r/d/w;)V
/* .line 170 */
v0 = /* invoke-virtual/range {p0 ..p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M()Z */
if ( v0 != null) { // if-eqz v0, :cond_13
/* iget v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne v0, v10, :cond_13 */
/* .line 171 */
/* iget-boolean v0, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_12
v0 = this.u;
v0 = (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
} // :cond_12
v0 = this.u;
/* .line 172 */
v0 = (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
/* iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* sub-int/2addr v1, v10 */
/* iget v2, v15, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
/* sub-int/2addr v1, v2 */
/* iget v2, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* mul-int v1, v1, v2 */
/* sub-int/2addr v0, v1 */
/* .line 173 */
} // :goto_d
v1 = this.u;
v1 = (( c.r.d.c0 ) v1 ).b ( v13 ); // invoke-virtual {v1, v13}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* sub-int v1, v0, v1 */
/* move v9, v0 */
/* move v3, v1 */
/* .line 174 */
} // :cond_13
/* iget-boolean v0, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_14
v0 = this.u;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
} // :cond_14
/* iget v0, v15, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
/* iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* mul-int v0, v0, v1 */
v1 = this.u;
/* .line 175 */
v1 = (( c.r.d.c0 ) v1 ).f ( ); // invoke-virtual {v1}, Lc/r/d/c0;->f()I
/* add-int/2addr v0, v1 */
/* .line 176 */
} // :goto_e
v1 = this.u;
v1 = (( c.r.d.c0 ) v1 ).b ( v13 ); // invoke-virtual {v1, v13}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* add-int/2addr v1, v0 */
/* move v3, v0 */
/* move v9, v1 */
/* .line 177 */
} // :goto_f
/* iget v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne v0, v10, :cond_15 */
/* move-object/from16 v0, p0 */
/* move-object v1, v13 */
/* move v2, v3 */
/* move v3, v4 */
/* move v4, v9 */
/* .line 178 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;IIII)V */
} // :cond_15
/* move-object/from16 v0, p0 */
/* move-object v1, v13 */
/* move v2, v4 */
/* move v4, v5 */
/* move v5, v9 */
/* .line 179 */
/* invoke-virtual/range {v0 ..v5}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;IIII)V */
/* .line 180 */
} // :goto_10
/* iget-boolean v0, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_16
/* .line 181 */
v0 = this.x;
/* iget v0, v0, Lc/r/d/w;->e:I */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).e ( v0, v11 ); // invoke-virtual {v6, v0, v11}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->e(II)V
/* .line 182 */
} // :cond_16
v0 = this.x;
/* iget v0, v0, Lc/r/d/w;->e:I */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).a ( v15, v0, v11 ); // invoke-virtual {v6, v15, v0, v11}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;II)V
/* .line 183 */
} // :goto_11
v0 = this.x;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).a ( v7, v0 ); // invoke-virtual {v6, v7, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Lc/r/d/w;)V
/* .line 184 */
v0 = this.x;
/* iget-boolean v0, v0, Lc/r/d/w;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_18
v0 = (( android.view.View ) v13 ).hasFocusable ( ); // invoke-virtual {v13}, Landroid/view/View;->hasFocusable()Z
if ( v0 != null) { // if-eqz v0, :cond_18
/* .line 185 */
/* iget-boolean v0, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_17
/* .line 186 */
v0 = this.A;
(( java.util.BitSet ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/BitSet;->clear()V
/* .line 187 */
} // :cond_17
v0 = this.A;
/* iget v1, v15, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
int v3 = 0; // const/4 v3, 0x0
(( java.util.BitSet ) v0 ).set ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/util/BitSet;->set(IZ)V
} // :cond_18
} // :goto_12
int v3 = 0; // const/4 v3, 0x0
} // :goto_13
int v0 = 1; // const/4 v0, 0x1
int v9 = 0; // const/4 v9, 0x0
/* goto/16 :goto_3 */
} // :cond_19
int v3 = 0; // const/4 v3, 0x0
/* if-nez v0, :cond_1a */
/* .line 188 */
v0 = this.x;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).a ( v7, v0 ); // invoke-virtual {v6, v7, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Lc/r/d/w;)V
/* .line 189 */
} // :cond_1a
v0 = this.x;
/* iget v0, v0, Lc/r/d/w;->e:I */
/* if-ne v0, v2, :cond_1b */
/* .line 190 */
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).q ( v0 ); // invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q(I)I
/* .line 191 */
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).f ( ); // invoke-virtual {v1}, Lc/r/d/c0;->f()I
/* sub-int/2addr v1, v0 */
/* .line 192 */
} // :cond_1b
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) v6 ).n ( v0 ); // invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n(I)I
/* .line 193 */
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/r/d/c0;->b()I
/* sub-int v1, v0, v1 */
} // :goto_14
/* if-lez v1, :cond_1c */
/* .line 194 */
/* iget v0, v8, Lc/r/d/w;->b:I */
v9 = java.lang.Math .min ( v0,v1 );
} // :cond_1c
int v9 = 0; // const/4 v9, 0x0
} // :goto_15
} // .end method
public android.view.View a ( android.view.View p0, Integer p1, androidx.recyclerview.widget.RecyclerView$v p2, androidx.recyclerview.widget.RecyclerView$a0 p3 ) {
/* .locals 8 */
/* .line 272 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 273 */
} // :cond_0
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(Landroid/view/View;)Landroid/view/View;
/* if-nez p1, :cond_1 */
/* .line 274 */
} // :cond_1
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).O ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O()V
/* .line 275 */
p2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).i ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i(I)I
/* const/high16 v0, -0x80000000 */
/* if-ne p2, v0, :cond_2 */
/* .line 276 */
} // :cond_2
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 277 */
/* iget-boolean v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
/* .line 278 */
v0 = this.e;
int v3 = 1; // const/4 v3, 0x1
/* if-ne p2, v3, :cond_3 */
/* .line 279 */
v4 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).J ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()I
/* .line 280 */
} // :cond_3
v4 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I()I
/* .line 281 */
} // :goto_0
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( v4, p4 ); // invoke-virtual {p0, v4, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(ILandroidx/recyclerview/widget/RecyclerView$a0;)V
/* .line 282 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).s ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s(I)V
/* .line 283 */
v5 = this.x;
/* iget v6, v5, Lc/r/d/w;->d:I */
/* add-int/2addr v6, v4 */
/* iput v6, v5, Lc/r/d/w;->c:I */
/* const v6, 0x3eaaaaab */
/* .line 284 */
v7 = this.t;
v7 = (( c.r.d.c0 ) v7 ).g ( ); // invoke-virtual {v7}, Lc/r/d/c0;->g()I
/* int-to-float v7, v7 */
/* mul-float v7, v7, v6 */
/* float-to-int v6, v7 */
/* iput v6, v5, Lc/r/d/w;->b:I */
/* .line 285 */
v5 = this.x;
/* iput-boolean v3, v5, Lc/r/d/w;->h:Z */
int v6 = 0; // const/4 v6, 0x0
/* .line 286 */
/* iput-boolean v6, v5, Lc/r/d/w;->a:Z */
/* .line 287 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p3, v5, p4 ); // invoke-virtual {p0, p3, v5, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Lc/r/d/w;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 288 */
/* iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F:Z */
/* if-nez v2, :cond_4 */
/* .line 289 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).a ( v4, p2 ); // invoke-virtual {v0, v4, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(II)Landroid/view/View;
if ( p3 != null) { // if-eqz p3, :cond_4
/* if-eq p3, p1, :cond_4 */
/* .line 290 */
} // :cond_4
p3 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).r ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r(I)Z
if ( p3 != null) { // if-eqz p3, :cond_6
/* .line 291 */
/* iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* sub-int/2addr p3, v3 */
} // :goto_1
/* if-ltz p3, :cond_8 */
/* .line 292 */
p4 = this.s;
/* aget-object p4, p4, p3 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p4 ).a ( v4, p2 ); // invoke-virtual {p4, v4, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(II)Landroid/view/View;
if ( p4 != null) { // if-eqz p4, :cond_5
/* if-eq p4, p1, :cond_5 */
} // :cond_5
/* add-int/lit8 p3, p3, -0x1 */
} // :cond_6
int p3 = 0; // const/4 p3, 0x0
/* .line 293 */
} // :goto_2
/* iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge p3, p4, :cond_8 */
/* .line 294 */
p4 = this.s;
/* aget-object p4, p4, p3 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p4 ).a ( v4, p2 ); // invoke-virtual {p4, v4, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(II)Landroid/view/View;
if ( p4 != null) { // if-eqz p4, :cond_7
/* if-eq p4, p1, :cond_7 */
} // :cond_7
/* add-int/lit8 p3, p3, 0x1 */
/* .line 295 */
} // :cond_8
/* iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
/* xor-int/2addr p3, v3 */
int p4 = -1; // const/4 p4, -0x1
/* if-ne p2, p4, :cond_9 */
int p4 = 1; // const/4 p4, 0x1
} // :cond_9
int p4 = 0; // const/4 p4, 0x0
} // :goto_3
/* if-ne p3, p4, :cond_a */
int p3 = 1; // const/4 p3, 0x1
} // :cond_a
int p3 = 0; // const/4 p3, 0x0
} // :goto_4
/* if-nez v2, :cond_c */
if ( p3 != null) { // if-eqz p3, :cond_b
/* .line 296 */
p4 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d()I
/* .line 297 */
} // :cond_b
p4 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).e ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e()I
/* .line 298 */
} // :goto_5
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p4 ); // invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/RecyclerView$o;->b(I)Landroid/view/View;
if ( p4 != null) { // if-eqz p4, :cond_c
/* if-eq p4, p1, :cond_c */
/* .line 299 */
} // :cond_c
p2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).r ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r(I)Z
if ( p2 != null) { // if-eqz p2, :cond_10
/* .line 300 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* sub-int/2addr p2, v3 */
} // :goto_6
/* if-ltz p2, :cond_13 */
/* .line 301 */
/* iget p4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
/* if-ne p2, p4, :cond_d */
} // :cond_d
if ( p3 != null) { // if-eqz p3, :cond_e
/* .line 302 */
p4 = this.s;
/* aget-object p4, p4, p2 */
/* .line 303 */
p4 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p4 ).d ( ); // invoke-virtual {p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d()I
} // :cond_e
p4 = this.s;
/* aget-object p4, p4, p2 */
/* .line 304 */
p4 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p4 ).e ( ); // invoke-virtual {p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e()I
/* .line 305 */
} // :goto_7
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p4 ); // invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/RecyclerView$o;->b(I)Landroid/view/View;
if ( p4 != null) { // if-eqz p4, :cond_f
/* if-eq p4, p1, :cond_f */
} // :cond_f
} // :goto_8
/* add-int/lit8 p2, p2, -0x1 */
/* .line 306 */
} // :cond_10
} // :goto_9
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v6, p2, :cond_13 */
if ( p3 != null) { // if-eqz p3, :cond_11
/* .line 307 */
p2 = this.s;
/* aget-object p2, p2, v6 */
/* .line 308 */
p2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p2 ).d ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d()I
} // :cond_11
p2 = this.s;
/* aget-object p2, p2, v6 */
/* .line 309 */
p2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p2 ).e ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e()I
/* .line 310 */
} // :goto_a
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->b(I)Landroid/view/View;
if ( p2 != null) { // if-eqz p2, :cond_12
/* if-eq p2, p1, :cond_12 */
} // :cond_12
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_13
} // .end method
public androidx.recyclerview.widget.RecyclerView$p a ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 1 */
/* .line 267 */
/* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
} // .end method
public androidx.recyclerview.widget.RecyclerView$p a ( android.view.ViewGroup$LayoutParams p0 ) {
/* .locals 1 */
/* .line 268 */
/* instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 269 */
/* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams; */
/* invoke-direct {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
/* .line 270 */
} // :cond_0
/* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* invoke-direct {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
} // .end method
public final androidx.recyclerview.widget.StaggeredGridLayoutManager$f a ( Object p0 ) {
/* .locals 7 */
/* .line 234 */
/* iget v0, p1, Lc/r/d/w;->e:I */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).r ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r(I)Z
int v1 = -1; // const/4 v1, -0x1
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 235 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* sub-int/2addr v0, v2 */
int v3 = -1; // const/4 v3, -0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 236 */
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
int v3 = 1; // const/4 v3, 0x1
/* .line 237 */
} // :goto_0
/* iget p1, p1, Lc/r/d/w;->e:I */
int v4 = 0; // const/4 v4, 0x0
/* if-ne p1, v2, :cond_3 */
/* const p1, 0x7fffffff */
/* .line 238 */
v2 = this.t;
v2 = (( c.r.d.c0 ) v2 ).f ( ); // invoke-virtual {v2}, Lc/r/d/c0;->f()I
} // :goto_1
/* if-eq v0, v1, :cond_2 */
/* .line 239 */
v5 = this.s;
/* aget-object v5, v5, v0 */
/* .line 240 */
v6 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v5 ).a ( v2 ); // invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
/* if-ge v6, p1, :cond_1 */
/* move-object v4, v5 */
/* move p1, v6 */
} // :cond_1
/* add-int/2addr v0, v3 */
} // :cond_2
} // :cond_3
/* const/high16 p1, -0x80000000 */
/* .line 241 */
v2 = this.t;
v2 = (( c.r.d.c0 ) v2 ).b ( ); // invoke-virtual {v2}, Lc/r/d/c0;->b()I
} // :goto_2
/* if-eq v0, v1, :cond_5 */
/* .line 242 */
v5 = this.s;
/* aget-object v5, v5, v0 */
/* .line 243 */
v6 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v5 ).b ( v2 ); // invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
/* if-le v6, p1, :cond_4 */
/* move-object v4, v5 */
/* move p1, v6 */
} // :cond_4
/* add-int/2addr v0, v3 */
} // :cond_5
} // .end method
public void a ( Integer p0, Integer p1, androidx.recyclerview.widget.RecyclerView$a0 p2, androidx.recyclerview.widget.RecyclerView$o$a p3 ) {
/* .locals 4 */
/* .line 246 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-nez v0, :cond_0 */
} // :cond_0
/* move p1, p2 */
/* .line 247 */
} // :goto_0
p2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
if ( p2 != null) { // if-eqz p2, :cond_7
/* if-nez p1, :cond_1 */
/* .line 248 */
} // :cond_1
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(ILandroidx/recyclerview/widget/RecyclerView$a0;)V
/* .line 249 */
p1 = this.N;
if ( p1 != null) { // if-eqz p1, :cond_2
/* array-length p1, p1 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge p1, p2, :cond_3 */
/* .line 250 */
} // :cond_2
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* new-array p1, p1, [I */
this.N = p1;
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
int p2 = 0; // const/4 p2, 0x0
int v0 = 0; // const/4 v0, 0x0
/* .line 251 */
} // :goto_1
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge p2, v1, :cond_6 */
/* .line 252 */
v1 = this.x;
/* iget v2, v1, Lc/r/d/w;->d:I */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_4 */
/* iget v1, v1, Lc/r/d/w;->f:I */
v2 = this.s;
/* aget-object v2, v2, p2 */
/* .line 253 */
v2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
} // :cond_4
v2 = this.s;
/* aget-object v2, v2, p2 */
/* iget v1, v1, Lc/r/d/w;->g:I */
/* .line 254 */
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
v2 = this.x;
/* iget v2, v2, Lc/r/d/w;->g:I */
} // :goto_2
/* sub-int/2addr v1, v2 */
/* if-ltz v1, :cond_5 */
/* .line 255 */
v2 = this.N;
/* aput v1, v2, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_5
/* add-int/lit8 p2, p2, 0x1 */
/* .line 256 */
} // :cond_6
p2 = this.N;
java.util.Arrays .sort ( p2,p1,v0 );
} // :goto_3
/* if-ge p1, v0, :cond_7 */
/* .line 257 */
p2 = this.x;
p2 = (( c.r.d.w ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Lc/r/d/w;->a(Landroidx/recyclerview/widget/RecyclerView$a0;)Z
if ( p2 != null) { // if-eqz p2, :cond_7
/* .line 258 */
p2 = this.x;
/* iget p2, p2, Lc/r/d/w;->c:I */
v1 = this.N;
/* aget v1, v1, p1 */
/* .line 259 */
p2 = this.x;
/* iget v1, p2, Lc/r/d/w;->c:I */
/* iget v2, p2, Lc/r/d/w;->d:I */
/* add-int/2addr v1, v2 */
/* iput v1, p2, Lc/r/d/w;->c:I */
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_7
} // :goto_4
return;
} // .end method
public void a ( Integer p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-lez p1, :cond_0 */
/* .line 260 */
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).J ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()I
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v1 = -1; // const/4 v1, -0x1
/* .line 261 */
v2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I()I
/* move v1, v2 */
int v2 = -1; // const/4 v2, -0x1
/* .line 262 */
} // :goto_0
v3 = this.x;
/* iput-boolean v0, v3, Lc/r/d/w;->a:Z */
/* .line 263 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(ILandroidx/recyclerview/widget/RecyclerView$a0;)V
/* .line 264 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).s ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s(I)V
/* .line 265 */
p2 = this.x;
/* iget v0, p2, Lc/r/d/w;->d:I */
/* add-int/2addr v1, v0 */
/* iput v1, p2, Lc/r/d/w;->c:I */
/* .line 266 */
p1 = java.lang.Math .abs ( p1 );
/* iput p1, p2, Lc/r/d/w;->b:I */
return;
} // .end method
public void a ( android.graphics.Rect p0, Integer p1, Integer p2 ) {
/* .locals 4 */
/* .line 12 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* add-int/2addr v0, v1 */
/* .line 13 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* add-int/2addr v1, v2 */
/* .line 14 */
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_0 */
/* .line 15 */
p1 = (( android.graphics.Rect ) p1 ).height ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->height()I
/* add-int/2addr p1, v1 */
/* .line 16 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).k ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k()I
p1 = androidx.recyclerview.widget.RecyclerView$o .a ( p3,p1,v1 );
/* .line 17 */
/* iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* mul-int p3, p3, v1 */
/* add-int/2addr p3, v0 */
/* .line 18 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->l()I
/* .line 19 */
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( p2,p3,v0 );
/* .line 20 */
} // :cond_0
p1 = (( android.graphics.Rect ) p1 ).width ( ); // invoke-virtual {p1}, Landroid/graphics/Rect;->width()I
/* add-int/2addr p1, v0 */
/* .line 21 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->l()I
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( p2,p1,v0 );
/* .line 22 */
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* mul-int p1, p1, v0 */
/* add-int/2addr p1, v1 */
/* .line 23 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).k ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k()I
/* .line 24 */
p1 = androidx.recyclerview.widget.RecyclerView$o .a ( p3,p1,v0 );
/* .line 25 */
} // :goto_0
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(II)V
return;
} // .end method
public void a ( android.os.Parcelable p0 ) {
/* .locals 1 */
/* .line 88 */
/* instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 89 */
/* check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e; */
this.H = p1;
/* .line 90 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
} // :cond_0
return;
} // .end method
public final void a ( android.view.View p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 4 */
/* .line 81 */
v0 = this.J;
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;Landroid/graphics/Rect;)V
/* .line 82 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 83 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
v2 = this.J;
/* iget v3, v2, Landroid/graphics/Rect;->left:I */
/* add-int/2addr v1, v3 */
/* iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
/* iget v2, v2, Landroid/graphics/Rect;->right:I */
/* add-int/2addr v3, v2 */
p2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).d ( p2, v1, v3 ); // invoke-virtual {p0, p2, v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d(III)I
/* .line 84 */
/* iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I */
v2 = this.J;
/* iget v3, v2, Landroid/graphics/Rect;->top:I */
/* add-int/2addr v1, v3 */
/* iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I */
/* iget v2, v2, Landroid/graphics/Rect;->bottom:I */
/* add-int/2addr v3, v2 */
p3 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).d ( p3, v1, v3 ); // invoke-virtual {p0, p3, v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d(III)I
if ( p4 != null) { // if-eqz p4, :cond_0
/* .line 85 */
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$p;)Z
/* .line 86 */
} // :cond_0
p4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$p;)Z
} // :goto_0
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 87 */
(( android.view.View ) p1 ).measure ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V
} // :cond_1
return;
} // .end method
public final void a ( android.view.View p0, androidx.recyclerview.widget.StaggeredGridLayoutManager$c p1, Object p2 ) {
/* .locals 1 */
/* .line 195 */
/* iget p3, p3, Lc/r/d/w;->e:I */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p3, v0, :cond_1 */
/* .line 196 */
/* iget-boolean p3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 197 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).p ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p(Landroid/view/View;)V
/* .line 198 */
} // :cond_0
p2 = this.e;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(Landroid/view/View;)V
/* .line 199 */
} // :cond_1
/* iget-boolean p3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 200 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).q ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q(Landroid/view/View;)V
/* .line 201 */
} // :cond_2
p2 = this.e;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p2 ).c ( p1 ); // invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c(Landroid/view/View;)V
} // :goto_0
return;
} // .end method
public final void a ( android.view.View p0, androidx.recyclerview.widget.StaggeredGridLayoutManager$c p1, Boolean p2 ) {
/* .locals 6 */
/* .line 52 */
/* iget-boolean v0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 53 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne v0, v1, :cond_0 */
/* .line 54 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I:I */
/* .line 55 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h()I
/* .line 56 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i()I
/* .line 57 */
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
v5 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* add-int/2addr v4, v5 */
/* iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* .line 58 */
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( v2,v3,v4,p2,v1 );
/* .line 59 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, v0, p2, p3 ); // invoke-virtual {p0, p1, v0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;IIZ)V
/* .line 60 */
} // :cond_0
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->q()I
/* .line 61 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->r()I
/* .line 62 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* add-int/2addr v3, v4 */
/* iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 63 */
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( v0,v2,v3,p2,v1 );
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I:I */
/* .line 64 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;IIZ)V
/* .line 65 */
} // :cond_1
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
int v2 = 0; // const/4 v2, 0x0
/* if-ne v0, v1, :cond_2 */
/* .line 66 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* .line 67 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->r()I
/* iget v4, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 68 */
v0 = androidx.recyclerview.widget.RecyclerView$o .a ( v0,v3,v2,v4,v2 );
/* .line 69 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h()I
/* .line 70 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i()I
/* .line 71 */
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->p()I
v5 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->m()I
/* add-int/2addr v4, v5 */
/* iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* .line 72 */
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( v2,v3,v4,p2,v1 );
/* .line 73 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, v0, p2, p3 ); // invoke-virtual {p0, p1, v0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;IIZ)V
/* .line 74 */
} // :cond_2
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->q()I
/* .line 75 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->r()I
/* .line 76 */
v4 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).n ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
v5 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
/* add-int/2addr v4, v5 */
/* iget v5, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I */
/* .line 77 */
v0 = androidx.recyclerview.widget.RecyclerView$o .a ( v0,v3,v4,v5,v1 );
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* .line 78 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i()I
/* iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I */
/* .line 79 */
p2 = androidx.recyclerview.widget.RecyclerView$o .a ( v1,v3,v2,p2,v2 );
/* .line 80 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, v0, p2, p3 ); // invoke-virtual {p0, p1, v0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroid/view/View;IIZ)V
} // :goto_0
return;
} // .end method
public void a ( android.view.accessibility.AccessibilityEvent p0 ) {
/* .locals 2 */
/* .line 100 */
/* invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/accessibility/AccessibilityEvent;)V */
/* .line 101 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-lez v0, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 102 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(Z)Landroid/view/View;
/* .line 103 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;
if ( v1 != null) { // if-eqz v1, :cond_2
/* if-nez v0, :cond_0 */
/* .line 104 */
} // :cond_0
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* .line 105 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* if-ge v1, v0, :cond_1 */
/* .line 106 */
(( android.view.accessibility.AccessibilityEvent ) p1 ).setFromIndex ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V
/* .line 107 */
(( android.view.accessibility.AccessibilityEvent ) p1 ).setToIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V
/* .line 108 */
} // :cond_1
(( android.view.accessibility.AccessibilityEvent ) p1 ).setFromIndex ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V
/* .line 109 */
(( android.view.accessibility.AccessibilityEvent ) p1 ).setToIndex ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V
/* nop */
} // :cond_2
} // :goto_0
return;
} // .end method
public final void a ( androidx.recyclerview.widget.RecyclerView$v p0, Integer p1 ) {
/* .locals 6 */
/* .line 221 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-ltz v0, :cond_5 */
/* .line 222 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 223 */
v3 = this.t;
v3 = (( c.r.d.c0 ) v3 ).d ( v2 ); // invoke-virtual {v3, v2}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* if-lt v3, p2, :cond_5 */
v3 = this.t;
/* .line 224 */
v3 = (( c.r.d.c0 ) v3 ).f ( v2 ); // invoke-virtual {v3, v2}, Lc/r/d/c0;->f(Landroid/view/View;)I
/* if-lt v3, p2, :cond_5 */
/* .line 225 */
(( android.view.View ) v2 ).getLayoutParams ( ); // invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 226 */
/* iget-boolean v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v4 != null) { // if-eqz v4, :cond_2
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* .line 227 */
} // :goto_1
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v4, v5, :cond_1 */
/* .line 228 */
v5 = this.s;
/* aget-object v5, v5, v4 */
v5 = this.a;
v5 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
/* if-ne v5, v1, :cond_0 */
return;
} // :cond_0
/* add-int/lit8 v4, v4, 0x1 */
/* .line 229 */
} // :cond_1
} // :goto_2
/* iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v3, v4, :cond_4 */
/* .line 230 */
v4 = this.s;
/* aget-object v4, v4, v3 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v4 ).j ( ); // invoke-virtual {v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->j()V
/* add-int/lit8 v3, v3, 0x1 */
/* .line 231 */
} // :cond_2
v4 = this.e;
v4 = this.a;
v4 = (( java.util.ArrayList ) v4 ).size ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
/* if-ne v4, v1, :cond_3 */
return;
/* .line 232 */
} // :cond_3
v3 = this.e;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v3 ).j ( ); // invoke-virtual {v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->j()V
/* .line 233 */
} // :cond_4
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( v2, p1 ); // invoke-virtual {p0, v2, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$v;)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_5
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, android.view.View p2, Object p3 ) {
/* .locals 6 */
/* .line 91 */
(( android.view.View ) p3 ).getLayoutParams ( ); // invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 92 */
/* instance-of p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* if-nez p2, :cond_0 */
/* .line 93 */
/* invoke-super {p0, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;Lc/h/n/v1/h;)V */
return;
/* .line 94 */
} // :cond_0
/* check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 95 */
/* iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
int p3 = 1; // const/4 p3, 0x1
/* if-nez p2, :cond_2 */
/* .line 96 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$c ) p1 ).e ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->e()I
/* iget-boolean p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( p1 != null) { // if-eqz p1, :cond_1
/* iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* move v1, p3 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
int v2 = -1; // const/4 v2, -0x1
int v3 = -1; // const/4 v3, -0x1
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 97 */
/* invoke-static/range {v0 ..v5}, Lc/h/n/v1/h$a;->a(IIIIZZ)Lc/h/n/v1/h$a; */
(( c.h.n.v1.h ) p4 ).b ( p1 ); // invoke-virtual {p4, p1}, Lc/h/n/v1/h;->b(Ljava/lang/Object;)V
} // :cond_2
int v0 = -1; // const/4 v0, -0x1
int v1 = -1; // const/4 v1, -0x1
/* .line 98 */
v2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$c ) p1 ).e ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->e()I
/* iget-boolean p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
/* iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* move v3, p3 */
} // :cond_3
int v3 = 1; // const/4 v3, 0x1
} // :goto_1
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 99 */
/* invoke-static/range {v0 ..v5}, Lc/h/n/v1/h$a;->a(IIIIZZ)Lc/h/n/v1/h$a; */
(( c.h.n.v1.h ) p4 ).b ( p1 ); // invoke-virtual {p4, p1}, Lc/h/n/v1/h;->b(Ljava/lang/Object;)V
} // :goto_2
return;
} // .end method
public final void a ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Boolean p2 ) {
/* .locals 2 */
/* const/high16 v0, -0x80000000 */
/* .line 113 */
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).n ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n(I)I
/* if-ne v1, v0, :cond_0 */
return;
/* .line 114 */
} // :cond_0
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
/* sub-int/2addr v0, v1 */
/* if-lez v0, :cond_1 */
/* neg-int v1, v0 */
/* .line 115 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( v1, p1, p2 ); // invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* neg-int p1, p1 */
/* sub-int/2addr v0, p1 */
if ( p3 != null) { // if-eqz p3, :cond_1
/* if-lez v0, :cond_1 */
/* .line 116 */
p1 = this.t;
(( c.r.d.c0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/r/d/c0;->a(I)V
} // :cond_1
return;
} // .end method
public final void a ( androidx.recyclerview.widget.RecyclerView$v p0, Object p1 ) {
/* .locals 2 */
/* .line 202 */
/* iget-boolean v0, p2, Lc/r/d/w;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
/* iget-boolean v0, p2, Lc/r/d/w;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 203 */
} // :cond_0
/* iget v0, p2, Lc/r/d/w;->b:I */
int v1 = -1; // const/4 v1, -0x1
/* if-nez v0, :cond_2 */
/* .line 204 */
/* iget v0, p2, Lc/r/d/w;->e:I */
/* if-ne v0, v1, :cond_1 */
/* .line 205 */
/* iget p2, p2, Lc/r/d/w;->g:I */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;I)V
/* .line 206 */
} // :cond_1
/* iget p2, p2, Lc/r/d/w;->f:I */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;I)V
/* .line 207 */
} // :cond_2
/* iget v0, p2, Lc/r/d/w;->e:I */
/* if-ne v0, v1, :cond_4 */
/* .line 208 */
/* iget v0, p2, Lc/r/d/w;->f:I */
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).o ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o(I)I
/* sub-int/2addr v0, v1 */
/* if-gez v0, :cond_3 */
/* .line 209 */
/* iget p2, p2, Lc/r/d/w;->g:I */
/* .line 210 */
} // :cond_3
/* iget v1, p2, Lc/r/d/w;->g:I */
/* iget p2, p2, Lc/r/d/w;->b:I */
p2 = java.lang.Math .min ( v0,p2 );
/* sub-int p2, v1, p2 */
/* .line 211 */
} // :goto_0
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;I)V
/* .line 212 */
} // :cond_4
/* iget v0, p2, Lc/r/d/w;->g:I */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).p ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p(I)I
/* iget v1, p2, Lc/r/d/w;->g:I */
/* sub-int/2addr v0, v1 */
/* if-gez v0, :cond_5 */
/* .line 213 */
/* iget p2, p2, Lc/r/d/w;->f:I */
/* .line 214 */
} // :cond_5
/* iget v1, p2, Lc/r/d/w;->f:I */
/* iget p2, p2, Lc/r/d/w;->b:I */
p2 = java.lang.Math .min ( v0,p2 );
/* add-int/2addr p2, v1 */
/* .line 215 */
} // :goto_1
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;I)V
} // :cond_6
} // :goto_2
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* const/16 p1, 0x8 */
/* .line 117 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( p2, p3, p1 ); // invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(III)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2, java.lang.Object p3 ) {
/* .locals 0 */
int p1 = 4; // const/4 p1, 0x4
/* .line 118 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( p2, p3, p1 ); // invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(III)V
return;
} // .end method
public final void a ( androidx.recyclerview.widget.StaggeredGridLayoutManager$b p0 ) {
/* .locals 4 */
/* .line 26 */
v0 = this.H;
/* iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
/* if-lez v1, :cond_3 */
/* .line 27 */
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ne v1, v2, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 28 */
} // :goto_0
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v0, v1, :cond_3 */
/* .line 29 */
v1 = this.s;
/* aget-object v1, v1, v0 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v1 ).c ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c()V
/* .line 30 */
v1 = this.H;
v2 = this.e;
/* aget v2, v2, v0 */
/* const/high16 v3, -0x80000000 */
/* if-eq v2, v3, :cond_1 */
/* .line 31 */
/* iget-boolean v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->j:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 32 */
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/r/d/c0;->b()I
/* .line 33 */
} // :cond_0
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).f ( ); // invoke-virtual {v1}, Lc/r/d/c0;->f()I
} // :goto_1
/* add-int/2addr v2, v1 */
/* .line 34 */
} // :cond_1
v1 = this.s;
/* aget-object v1, v1, v0 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v1 ).d ( v2 ); // invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d(I)V
/* add-int/lit8 v0, v0, 0x1 */
/* .line 35 */
} // :cond_2
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$e ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->a()V
/* .line 36 */
v0 = this.H;
/* iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->c:I */
/* iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->b:I */
/* .line 37 */
} // :cond_3
v0 = this.H;
/* iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->k:Z */
/* iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->G:Z */
/* .line 38 */
/* iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->i:Z */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->d(Z)V
/* .line 39 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).O ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O()V
/* .line 40 */
v0 = this.H;
/* iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->b:I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_4 */
/* .line 41 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
/* .line 42 */
/* iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->j:Z */
/* iput-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
/* .line 43 */
} // :cond_4
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* iput-boolean v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
/* .line 44 */
} // :goto_2
p1 = this.H;
/* iget v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->f:I */
int v1 = 1; // const/4 v1, 0x1
/* if-le v0, v1, :cond_5 */
/* .line 45 */
v0 = this.D;
v1 = this.g;
this.a = v1;
/* .line 46 */
p1 = this.h;
this.b = p1;
} // :cond_5
return;
} // .end method
public final void a ( androidx.recyclerview.widget.StaggeredGridLayoutManager$f p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .line 216 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p1 ).f ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->f()I
int v1 = 0; // const/4 v1, 0x0
int v2 = -1; // const/4 v2, -0x1
/* if-ne p2, v2, :cond_0 */
/* .line 217 */
p2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p1 ).h ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->h()I
/* add-int/2addr p2, v0 */
/* if-gt p2, p3, :cond_1 */
/* .line 218 */
p2 = this.A;
/* iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
(( java.util.BitSet ) p2 ).set ( p1, v1 ); // invoke-virtual {p2, p1, v1}, Ljava/util/BitSet;->set(IZ)V
/* .line 219 */
} // :cond_0
p2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p1 ).g ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->g()I
/* sub-int/2addr p2, v0 */
/* if-lt p2, p3, :cond_1 */
/* .line 220 */
p2 = this.A;
/* iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
(( java.util.BitSet ) p2 ).set ( p1, v1 ); // invoke-virtual {p2, p1, v1}, Ljava/util/BitSet;->set(IZ)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.H;
/* if-nez v0, :cond_0 */
/* .line 11 */
/* invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Ljava/lang/String;)V */
} // :cond_0
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* .line 244 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean a ( androidx.recyclerview.widget.RecyclerView$a0 p0, androidx.recyclerview.widget.StaggeredGridLayoutManager$b p1 ) {
/* .locals 1 */
/* .line 47 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 48 */
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).m ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m(I)I
/* .line 49 */
} // :cond_0
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).l ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l(I)I
} // :goto_0
/* iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a:I */
/* const/high16 p1, -0x80000000 */
/* .line 50 */
/* iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$p p0 ) {
/* .locals 0 */
/* .line 271 */
/* instance-of p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
} // .end method
public final Boolean a ( androidx.recyclerview.widget.StaggeredGridLayoutManager$f p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p1 ).g ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->g()I
v2 = this.t;
v2 = (( c.r.d.c0 ) v2 ).b ( ); // invoke-virtual {v2}, Lc/r/d/c0;->b()I
/* if-ge v0, v2, :cond_1 */
/* .line 3 */
v0 = this.a;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v1, v1, -0x1 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 4 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
/* .line 5 */
/* iget-boolean p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
/* xor-int/lit8 p1, p1, 0x1 */
/* .line 6 */
} // :cond_0
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p1 ).h ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->h()I
v2 = this.t;
v2 = (( c.r.d.c0 ) v2 ).f ( ); // invoke-virtual {v2}, Lc/r/d/c0;->f()I
/* if-le v0, v2, :cond_1 */
/* .line 7 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 8 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
/* .line 9 */
/* iget-boolean p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
/* xor-int/lit8 p1, p1, 0x1 */
} // :cond_1
} // .end method
public Integer b ( Integer p0, androidx.recyclerview.widget.RecyclerView$v p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
/* .locals 0 */
/* .line 86 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
} // .end method
public Integer b ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 0 */
/* .line 41 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).i ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i(Landroidx/recyclerview/widget/RecyclerView$a0;)I
} // .end method
public Integer b ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 1 */
/* .line 42 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-nez v0, :cond_0 */
/* .line 43 */
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* .line 44 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I */
} // .end method
public android.view.View b ( Boolean p0 ) {
/* .locals 7 */
/* .line 45 */
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
/* .line 46 */
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/r/d/c0;->b()I
/* .line 47 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* add-int/lit8 v2, v2, -0x1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ltz v2, :cond_4 */
/* .line 48 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 49 */
v5 = this.t;
v5 = (( c.r.d.c0 ) v5 ).d ( v4 ); // invoke-virtual {v5, v4}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* .line 50 */
v6 = this.t;
v6 = (( c.r.d.c0 ) v6 ).a ( v4 ); // invoke-virtual {v6, v4}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* if-le v6, v0, :cond_3 */
/* if-lt v5, v1, :cond_0 */
} // :cond_0
/* if-le v6, v1, :cond_2 */
/* if-nez p1, :cond_1 */
} // :cond_1
/* if-nez v3, :cond_3 */
/* move-object v3, v4 */
} // :cond_2
} // :goto_1
} // :cond_3
} // :goto_2
/* add-int/lit8 v2, v2, -0x1 */
} // :cond_4
} // .end method
public final void b ( Integer p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 4 */
/* .line 55 */
v0 = this.x;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, v0, Lc/r/d/w;->b:I */
/* .line 56 */
/* iput p1, v0, Lc/r/d/w;->c:I */
/* .line 57 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).w ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->w()Z
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 58 */
p2 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).b ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->b()I
int v0 = -1; // const/4 v0, -0x1
/* if-eq p2, v0, :cond_2 */
/* .line 59 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* if-ge p2, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* if-ne v0, p1, :cond_1 */
/* .line 60 */
p1 = this.t;
p1 = (( c.r.d.c0 ) p1 ).g ( ); // invoke-virtual {p1}, Lc/r/d/c0;->g()I
/* .line 61 */
} // :cond_1
p1 = this.t;
p1 = (( c.r.d.c0 ) p1 ).g ( ); // invoke-virtual {p1}, Lc/r/d/c0;->g()I
/* move p2, p1 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
int p2 = 0; // const/4 p2, 0x0
/* .line 62 */
} // :goto_2
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).f ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->f()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 63 */
v0 = this.x;
v3 = this.t;
v3 = (( c.r.d.c0 ) v3 ).f ( ); // invoke-virtual {v3}, Lc/r/d/c0;->f()I
/* sub-int/2addr v3, p2 */
/* iput v3, v0, Lc/r/d/w;->f:I */
/* .line 64 */
p2 = this.x;
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/r/d/c0;->b()I
/* add-int/2addr v0, p1 */
/* iput v0, p2, Lc/r/d/w;->g:I */
/* .line 65 */
} // :cond_3
v0 = this.x;
v3 = this.t;
v3 = (( c.r.d.c0 ) v3 ).a ( ); // invoke-virtual {v3}, Lc/r/d/c0;->a()I
/* add-int/2addr v3, p1 */
/* iput v3, v0, Lc/r/d/w;->g:I */
/* .line 66 */
p1 = this.x;
/* neg-int p2, p2 */
/* iput p2, p1, Lc/r/d/w;->f:I */
/* .line 67 */
} // :goto_3
p1 = this.x;
/* iput-boolean v1, p1, Lc/r/d/w;->h:Z */
/* .line 68 */
/* iput-boolean v2, p1, Lc/r/d/w;->a:Z */
/* .line 69 */
p2 = this.t;
p2 = (( c.r.d.c0 ) p2 ).d ( ); // invoke-virtual {p2}, Lc/r/d/c0;->d()I
/* if-nez p2, :cond_4 */
p2 = this.t;
/* .line 70 */
p2 = (( c.r.d.c0 ) p2 ).a ( ); // invoke-virtual {p2}, Lc/r/d/c0;->a()I
/* if-nez p2, :cond_4 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_4
/* iput-boolean v1, p1, Lc/r/d/w;->i:Z */
return;
} // .end method
public final void b ( androidx.recyclerview.widget.RecyclerView$v p0, Integer p1 ) {
/* .locals 5 */
/* .line 72 */
} // :goto_0
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-lez v0, :cond_5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 73 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 74 */
v2 = this.t;
v2 = (( c.r.d.c0 ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* if-gt v2, p2, :cond_5 */
v2 = this.t;
/* .line 75 */
v2 = (( c.r.d.c0 ) v2 ).e ( v1 ); // invoke-virtual {v2, v1}, Lc/r/d/c0;->e(Landroid/view/View;)I
/* if-gt v2, p2, :cond_5 */
/* .line 76 */
(( android.view.View ) v1 ).getLayoutParams ( ); // invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* .line 77 */
/* iget-boolean v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
int v4 = 1; // const/4 v4, 0x1
if ( v3 != null) { // if-eqz v3, :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 78 */
} // :goto_1
/* iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v2, v3, :cond_1 */
/* .line 79 */
v3 = this.s;
/* aget-object v3, v3, v2 */
v3 = this.a;
v3 = (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
/* if-ne v3, v4, :cond_0 */
return;
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* .line 80 */
} // :cond_1
} // :goto_2
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v0, v2, :cond_4 */
/* .line 81 */
v2 = this.s;
/* aget-object v2, v2, v0 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v2 ).k ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->k()V
/* add-int/lit8 v0, v0, 0x1 */
/* .line 82 */
} // :cond_2
v0 = this.e;
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-ne v0, v4, :cond_3 */
return;
/* .line 83 */
} // :cond_3
v0 = this.e;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).k ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->k()V
/* .line 84 */
} // :cond_4
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$v;)V
} // :cond_5
return;
} // .end method
public final void b ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Boolean p2 ) {
/* .locals 2 */
/* const v0, 0x7fffffff */
/* .line 51 */
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).q ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q(I)I
/* if-ne v1, v0, :cond_0 */
return;
/* .line 52 */
} // :cond_0
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
/* sub-int/2addr v1, v0 */
/* if-lez v1, :cond_1 */
/* .line 53 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( v1, p1, p2 ); // invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* sub-int/2addr v1, p1 */
if ( p3 != null) { // if-eqz p3, :cond_1
/* if-lez v1, :cond_1 */
/* .line 54 */
p1 = this.t;
/* neg-int p2, v1 */
(( c.r.d.c0 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/r/d/c0;->a(I)V
} // :cond_1
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 71 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( p2, p3, p1 ); // invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(III)V
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView p0, androidx.recyclerview.widget.RecyclerView$v p1 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$v;)V */
/* .line 2 */
p2 = this.O;
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Ljava/lang/Runnable;)Z
int p2 = 0; // const/4 p2, 0x0
/* .line 3 */
} // :goto_0
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge p2, v0, :cond_0 */
/* .line 4 */
v0 = this.s;
/* aget-object v0, v0, p2 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c()V
/* add-int/lit8 p2, p2, 0x1 */
/* .line 5 */
} // :cond_0
(( androidx.recyclerview.widget.RecyclerView ) p1 ).requestLayout ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V
return;
} // .end method
public Boolean b ( ) {
/* .locals 2 */
/* .line 85 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public Boolean b ( androidx.recyclerview.widget.RecyclerView$a0 p0, androidx.recyclerview.widget.StaggeredGridLayoutManager$b p1 ) {
/* .locals 5 */
/* .line 6 */
v0 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).d ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_f */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v0, v2, :cond_0 */
/* goto/16 :goto_7 */
} // :cond_0
/* const/high16 v3, -0x80000000 */
/* if-ltz v0, :cond_e */
/* .line 7 */
p1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-lt v0, p1, :cond_1 */
/* goto/16 :goto_6 */
/* .line 8 */
} // :cond_1
p1 = this.H;
int v0 = 1; // const/4 v0, 0x1
if ( p1 != null) { // if-eqz p1, :cond_3
/* iget v4, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->b:I */
/* if-eq v4, v2, :cond_3 */
/* iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
/* if-ge p1, v0, :cond_2 */
/* .line 9 */
} // :cond_2
/* iput v3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
/* .line 10 */
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
/* iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a:I */
/* goto/16 :goto_5 */
/* .line 11 */
} // :cond_3
} // :goto_0
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->b(I)Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_b
/* .line 12 */
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).J ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()I
/* .line 13 */
} // :cond_4
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I()I
} // :goto_1
/* iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a:I */
/* .line 14 */
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C:I */
/* if-eq v1, v3, :cond_6 */
/* .line 15 */
/* iget-boolean v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 16 */
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/r/d/c0;->b()I
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C:I */
/* sub-int/2addr v1, v2 */
/* .line 17 */
v2 = this.t;
p1 = (( c.r.d.c0 ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* sub-int/2addr v1, p1 */
/* iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
/* .line 18 */
} // :cond_5
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).f ( ); // invoke-virtual {v1}, Lc/r/d/c0;->f()I
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C:I */
/* add-int/2addr v1, v2 */
/* .line 19 */
v2 = this.t;
p1 = (( c.r.d.c0 ) v2 ).d ( p1 ); // invoke-virtual {v2, p1}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* sub-int/2addr v1, p1 */
/* iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
} // :goto_2
/* .line 20 */
} // :cond_6
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* .line 21 */
v2 = this.t;
v2 = (( c.r.d.c0 ) v2 ).g ( ); // invoke-virtual {v2}, Lc/r/d/c0;->g()I
/* if-le v1, v2, :cond_8 */
/* .line 22 */
/* iget-boolean p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
if ( p1 != null) { // if-eqz p1, :cond_7
p1 = this.t;
/* .line 23 */
p1 = (( c.r.d.c0 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/r/d/c0;->b()I
} // :cond_7
p1 = this.t;
/* .line 24 */
p1 = (( c.r.d.c0 ) p1 ).f ( ); // invoke-virtual {p1}, Lc/r/d/c0;->f()I
} // :goto_3
/* iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
/* .line 25 */
} // :cond_8
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).d ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/c0;->d(Landroid/view/View;)I
v2 = this.t;
/* .line 26 */
v2 = (( c.r.d.c0 ) v2 ).f ( ); // invoke-virtual {v2}, Lc/r/d/c0;->f()I
/* sub-int/2addr v1, v2 */
/* if-gez v1, :cond_9 */
/* neg-int p1, v1 */
/* .line 27 */
/* iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
/* .line 28 */
} // :cond_9
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/r/d/c0;->b()I
v2 = this.t;
/* .line 29 */
p1 = (( c.r.d.c0 ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* sub-int/2addr v1, p1 */
/* if-gez v1, :cond_a */
/* .line 30 */
/* iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
/* .line 31 */
} // :cond_a
/* iput v3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
/* .line 32 */
} // :cond_b
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
/* iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a:I */
/* .line 33 */
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C:I */
/* if-ne v2, v3, :cond_d */
/* .line 34 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(I)I
/* if-ne p1, v0, :cond_c */
int v1 = 1; // const/4 v1, 0x1
/* .line 35 */
} // :cond_c
/* iput-boolean v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
/* .line 36 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a()V
/* .line 37 */
} // :cond_d
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) p2 ).a ( v2 ); // invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a(I)V
/* .line 38 */
} // :goto_4
/* iput-boolean v0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->d:Z */
} // :goto_5
/* .line 39 */
} // :cond_e
} // :goto_6
/* iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
/* .line 40 */
/* iput v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C:I */
} // :cond_f
} // :goto_7
} // .end method
public Integer c ( Integer p0, androidx.recyclerview.widget.RecyclerView$v p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
/* .locals 2 */
/* .line 88 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_3
/* if-nez p1, :cond_0 */
/* .line 89 */
} // :cond_0
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(ILandroidx/recyclerview/widget/RecyclerView$a0;)V
/* .line 90 */
v0 = this.x;
p3 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p2, v0, p3 ); // invoke-virtual {p0, p2, v0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Lc/r/d/w;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 91 */
v0 = this.x;
/* iget v0, v0, Lc/r/d/w;->b:I */
/* if-ge v0, p3, :cond_1 */
} // :cond_1
/* if-gez p1, :cond_2 */
/* neg-int p1, p3 */
} // :cond_2
/* move p1, p3 */
/* .line 92 */
} // :goto_0
p3 = this.t;
/* neg-int v0, p1 */
(( c.r.d.c0 ) p3 ).a ( v0 ); // invoke-virtual {p3, v0}, Lc/r/d/c0;->a(I)V
/* .line 93 */
/* iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F:Z */
/* .line 94 */
p3 = this.x;
/* iput v1, p3, Lc/r/d/w;->b:I */
/* .line 95 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Lc/r/d/w;)V
} // :cond_3
} // :goto_1
} // .end method
public Integer c ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 0 */
/* .line 72 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).j ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j(Landroidx/recyclerview/widget/RecyclerView$a0;)I
} // .end method
public android.view.View c ( Boolean p0 ) {
/* .locals 8 */
/* .line 73 */
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
/* .line 74 */
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/r/d/c0;->b()I
/* .line 75 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v2, :cond_4 */
/* .line 76 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v4 ); // invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 77 */
v6 = this.t;
v6 = (( c.r.d.c0 ) v6 ).d ( v5 ); // invoke-virtual {v6, v5}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* .line 78 */
v7 = this.t;
v7 = (( c.r.d.c0 ) v7 ).a ( v5 ); // invoke-virtual {v7, v5}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* if-le v7, v0, :cond_3 */
/* if-lt v6, v1, :cond_0 */
} // :cond_0
/* if-ge v6, v0, :cond_2 */
/* if-nez p1, :cond_1 */
} // :cond_1
/* if-nez v3, :cond_3 */
/* move-object v3, v5 */
} // :cond_2
} // :goto_1
} // :cond_3
} // :goto_2
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_4
} // .end method
public androidx.recyclerview.widget.RecyclerView$p c ( ) {
/* .locals 3 */
/* .line 96 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
int v1 = -2; // const/4 v1, -0x2
int v2 = -1; // const/4 v2, -0x1
/* if-nez v0, :cond_0 */
/* .line 97 */
/* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;-><init>(II)V */
/* .line 98 */
} // :cond_0
/* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
/* invoke-direct {v0, v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;-><init>(II)V */
} // .end method
public final void c ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .line 80 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).J ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()I
} // :cond_0
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I()I
} // :goto_0
/* const/16 v1, 0x8 */
/* if-ne p3, v1, :cond_2 */
/* if-ge p1, p2, :cond_1 */
/* add-int/lit8 v2, p2, 0x1 */
} // :cond_1
/* add-int/lit8 v2, p1, 0x1 */
/* move v3, p2 */
} // :cond_2
/* add-int v2, p1, p2 */
} // :goto_1
/* move v3, p1 */
/* .line 81 */
} // :goto_2
v4 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v4 ).e ( v3 ); // invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->e(I)I
int v4 = 1; // const/4 v4, 0x1
/* if-eq p3, v4, :cond_5 */
int v5 = 2; // const/4 v5, 0x2
/* if-eq p3, v5, :cond_4 */
/* if-eq p3, v1, :cond_3 */
/* .line 82 */
} // :cond_3
p3 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p3 ).b ( p1, v4 ); // invoke-virtual {p3, p1, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->b(II)V
/* .line 83 */
p1 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p1 ).a ( p2, v4 ); // invoke-virtual {p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(II)V
/* .line 84 */
} // :cond_4
p3 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p3 ).b ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->b(II)V
/* .line 85 */
} // :cond_5
p3 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p3 ).a ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a(II)V
} // :goto_3
/* if-gt v2, v0, :cond_6 */
return;
/* .line 86 */
} // :cond_6
/* iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
if ( p1 != null) { // if-eqz p1, :cond_7
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I()I
} // :cond_7
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).J ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()I
} // :goto_4
/* if-gt v3, p1, :cond_8 */
/* .line 87 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
} // :cond_8
return;
} // .end method
public void c ( androidx.recyclerview.widget.RecyclerView$a0 p0, androidx.recyclerview.widget.StaggeredGridLayoutManager$b p1 ) {
/* .locals 1 */
/* .line 68 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 69 */
} // :cond_0
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
return;
/* .line 70 */
} // :cond_1
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a()V
int p1 = 0; // const/4 p1, 0x0
/* .line 71 */
/* iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a:I */
return;
} // .end method
public final void c ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1, Boolean p2 ) {
/* .locals 8 */
/* .line 1 */
v0 = this.K;
/* .line 2 */
v1 = this.H;
int v2 = -1; // const/4 v2, -0x1
/* if-nez v1, :cond_0 */
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
/* if-eq v1, v2, :cond_1 */
/* .line 3 */
} // :cond_0
v1 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->a()I
/* if-nez v1, :cond_1 */
/* .line 4 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroidx/recyclerview/widget/RecyclerView$v;)V
/* .line 5 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b()V
return;
/* .line 6 */
} // :cond_1
/* iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->e:Z */
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
if ( v1 != null) { // if-eqz v1, :cond_3
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
/* if-ne v1, v2, :cond_3 */
v1 = this.H;
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :cond_3
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 7 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b()V
/* .line 8 */
v5 = this.H;
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 9 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;)V
/* .line 10 */
} // :cond_4
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).O ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O()V
/* .line 11 */
/* iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* iput-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
/* .line 12 */
} // :goto_2
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(Landroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;)V
/* .line 13 */
/* iput-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->e:Z */
/* .line 14 */
} // :cond_5
v5 = this.H;
/* if-nez v5, :cond_7 */
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
/* if-ne v5, v2, :cond_7 */
/* .line 15 */
/* iget-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
/* iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F:Z */
/* if-ne v5, v6, :cond_6 */
/* .line 16 */
v5 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).M ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M()Z
/* iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->G:Z */
/* if-eq v5, v6, :cond_7 */
/* .line 17 */
} // :cond_6
v5 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v5 ).a ( ); // invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a()V
/* .line 18 */
/* iput-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->d:Z */
/* .line 19 */
} // :cond_7
v5 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-lez v5, :cond_e */
v5 = this.H;
if ( v5 != null) { // if-eqz v5, :cond_8
/* iget v5, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
/* if-ge v5, v4, :cond_e */
/* .line 20 */
} // :cond_8
/* iget-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->d:Z */
if ( v5 != null) { // if-eqz v5, :cond_a
int v1 = 0; // const/4 v1, 0x0
/* .line 21 */
} // :goto_3
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v1, v5, :cond_e */
/* .line 22 */
v5 = this.s;
/* aget-object v5, v5, v1 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v5 ).c ( ); // invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c()V
/* .line 23 */
/* iget v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
/* const/high16 v6, -0x80000000 */
/* if-eq v5, v6, :cond_9 */
/* .line 24 */
v6 = this.s;
/* aget-object v6, v6, v1 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v6 ).d ( v5 ); // invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d(I)V
} // :cond_9
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_a
/* if-nez v1, :cond_c */
/* .line 25 */
v1 = this.K;
v1 = this.f;
/* if-nez v1, :cond_b */
} // :cond_b
int v1 = 0; // const/4 v1, 0x0
/* .line 26 */
} // :goto_4
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v1, v5, :cond_e */
/* .line 27 */
v5 = this.s;
/* aget-object v5, v5, v1 */
/* .line 28 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v5 ).c ( ); // invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c()V
/* .line 29 */
v6 = this.K;
v6 = this.f;
/* aget v6, v6, v1 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v5 ).d ( v6 ); // invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d(I)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_c
} // :goto_5
int v1 = 0; // const/4 v1, 0x0
/* .line 30 */
} // :goto_6
/* iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v1, v5, :cond_d */
/* .line 31 */
v5 = this.s;
/* aget-object v5, v5, v1 */
/* iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* iget v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b:I */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v5 ).a ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(ZI)V
/* add-int/lit8 v1, v1, 0x1 */
/* .line 32 */
} // :cond_d
v1 = this.K;
v5 = this.s;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) v1 ).a ( v5 ); // invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a([Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;)V
/* .line 33 */
} // :cond_e
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroidx/recyclerview/widget/RecyclerView$v;)V
/* .line 34 */
v1 = this.x;
/* iput-boolean v3, v1, Lc/r/d/w;->a:Z */
/* .line 35 */
/* iput-boolean v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L:Z */
/* .line 36 */
v1 = this.u;
v1 = (( c.r.d.c0 ) v1 ).g ( ); // invoke-virtual {v1}, Lc/r/d/c0;->g()I
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).v ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v(I)V
/* .line 37 */
/* iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a:I */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(ILandroidx/recyclerview/widget/RecyclerView$a0;)V
/* .line 38 */
/* iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
if ( v1 != null) { // if-eqz v1, :cond_f
/* .line 39 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).s ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s(I)V
/* .line 40 */
v1 = this.x;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, v1, p2 ); // invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Lc/r/d/w;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 41 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).s ( v4 ); // invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s(I)V
/* .line 42 */
v1 = this.x;
/* iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a:I */
/* iget v5, v1, Lc/r/d/w;->d:I */
/* add-int/2addr v2, v5 */
/* iput v2, v1, Lc/r/d/w;->c:I */
/* .line 43 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, v1, p2 ); // invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Lc/r/d/w;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 44 */
} // :cond_f
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).s ( v4 ); // invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s(I)V
/* .line 45 */
v1 = this.x;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, v1, p2 ); // invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Lc/r/d/w;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 46 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).s ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s(I)V
/* .line 47 */
v1 = this.x;
/* iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->a:I */
/* iget v5, v1, Lc/r/d/w;->d:I */
/* add-int/2addr v2, v5 */
/* iput v2, v1, Lc/r/d/w;->c:I */
/* .line 48 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, v1, p2 ); // invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Lc/r/d/w;Landroidx/recyclerview/widget/RecyclerView$a0;)I
/* .line 49 */
} // :goto_7
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).N ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N()V
/* .line 50 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-lez v1, :cond_11 */
/* .line 51 */
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
if ( v1 != null) { // if-eqz v1, :cond_10
/* .line 52 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, p2, v4 ); // invoke-virtual {p0, p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
/* .line 53 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( p1, p2, v3 ); // invoke-virtual {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
/* .line 54 */
} // :cond_10
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( p1, p2, v4 ); // invoke-virtual {p0, p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
/* .line 55 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( p1, p2, v3 ); // invoke-virtual {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
} // :cond_11
} // :goto_8
if ( p3 != null) { // if-eqz p3, :cond_14
/* .line 56 */
p3 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).d ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
/* if-nez p3, :cond_14 */
/* .line 57 */
/* iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->E:I */
if ( p3 != null) { // if-eqz p3, :cond_13
/* .line 58 */
p3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-lez p3, :cond_13 */
/* iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L:Z */
/* if-nez p3, :cond_12 */
/* .line 59 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).K ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->K()Landroid/view/View;
if ( p3 != null) { // if-eqz p3, :cond_13
} // :cond_12
int p3 = 1; // const/4 p3, 0x1
} // :cond_13
int p3 = 0; // const/4 p3, 0x0
} // :goto_9
if ( p3 != null) { // if-eqz p3, :cond_14
/* .line 60 */
p3 = this.O;
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Ljava/lang/Runnable;)Z
/* .line 61 */
p3 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).F ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F()Z
if ( p3 != null) { // if-eqz p3, :cond_14
} // :cond_14
int v4 = 0; // const/4 v4, 0x0
/* .line 62 */
} // :goto_a
p3 = (( androidx.recyclerview.widget.RecyclerView$a0 ) p2 ).d ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()Z
if ( p3 != null) { // if-eqz p3, :cond_15
/* .line 63 */
p3 = this.K;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) p3 ).b ( ); // invoke-virtual {p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b()V
/* .line 64 */
} // :cond_15
/* iget-boolean p3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->c:Z */
/* iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F:Z */
/* .line 65 */
p3 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).M ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M()Z
/* iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->G:Z */
if ( v4 != null) { // if-eqz v4, :cond_16
/* .line 66 */
p3 = this.K;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) p3 ).b ( ); // invoke-virtual {p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b()V
/* .line 67 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( p1, p2, v3 ); // invoke-virtual {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
} // :cond_16
return;
} // .end method
public void c ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2 ) {
/* .locals 0 */
int p1 = 2; // const/4 p1, 0x2
/* .line 79 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( p2, p3, p1 ); // invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(III)V
return;
} // .end method
public final Integer d ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* if-nez p2, :cond_0 */
/* if-nez p3, :cond_0 */
/* .line 7 */
} // :cond_0
v0 = android.view.View$MeasureSpec .getMode ( p1 );
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_2 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* if-ne v0, v1, :cond_1 */
} // :cond_1
} // :cond_2
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* .line 8 */
p1 = android.view.View$MeasureSpec .getSize ( p1 );
/* sub-int/2addr p1, p2 */
/* sub-int/2addr p1, p3 */
p1 = java.lang.Math .max ( v1,p1 );
/* .line 9 */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v0 );
} // .end method
public Integer d ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 0 */
/* .line 6 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h(Landroidx/recyclerview/widget/RecyclerView$a0;)I
} // .end method
public void d ( Integer p0 ) {
/* .locals 2 */
/* .line 10 */
/* invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->d(I)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
} // :goto_0
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v0, v1, :cond_0 */
/* .line 12 */
v1 = this.s;
/* aget-object v1, v1, v0 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v1 ).c ( p1 ); // invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c(I)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void d ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 0 */
/* .line 13 */
p1 = this.D;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) p1 ).a ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->a()V
/* .line 14 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
return;
} // .end method
public void d ( Boolean p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V
/* .line 2 */
v0 = this.H;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->i:Z */
/* if-eq v1, p1, :cond_0 */
/* .line 3 */
/* iput-boolean p1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->i:Z */
/* .line 4 */
} // :cond_0
/* iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
/* .line 5 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
return;
} // .end method
public Integer e ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 0 */
/* .line 2 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).i ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i(Landroidx/recyclerview/widget/RecyclerView$a0;)I
} // .end method
public void e ( Integer p0 ) {
/* .locals 2 */
/* .line 3 */
/* invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->e(I)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v0, v1, :cond_0 */
/* .line 5 */
v1 = this.s;
/* aget-object v1, v1, v0 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v1 ).c ( p1 ); // invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c(I)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public final void e ( Integer p0, Integer p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
} // :goto_0
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v0, v1, :cond_1 */
/* .line 7 */
v1 = this.s;
/* aget-object v1, v1, v0 */
v1 = this.a;
v1 = (( java.util.ArrayList ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 8 */
} // :cond_0
v1 = this.s;
/* aget-object v1, v1, v0 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( v1, p1, p2 ); // invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;II)V
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
public void e ( androidx.recyclerview.widget.RecyclerView$v p0, androidx.recyclerview.widget.RecyclerView$a0 p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Z)V
return;
} // .end method
public Integer f ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 0 */
/* .line 2 */
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).j ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j(Landroidx/recyclerview/widget/RecyclerView$a0;)I
} // .end method
public void f ( Integer p0 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
/* .line 1 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).F ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F()Z
} // :cond_0
return;
} // .end method
public void g ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->g(Landroidx/recyclerview/widget/RecyclerView$a0;)V */
int p1 = -1; // const/4 p1, -0x1
/* .line 2 */
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->B:I */
/* const/high16 p1, -0x80000000 */
/* .line 3 */
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
this.H = p1;
/* .line 5 */
p1 = this.K;
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$b ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$b;->b()V
return;
} // .end method
public final Integer h ( Integer p0 ) {
/* .locals 3 */
/* .line 6 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = -1; // const/4 v1, -0x1
int v2 = 1; // const/4 v2, 0x1
/* if-nez v0, :cond_1 */
/* .line 7 */
/* iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
/* .line 8 */
} // :cond_1
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I()I
/* if-ge p1, v0, :cond_2 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 9 */
} // :goto_0
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* if-eq p1, v0, :cond_3 */
} // :cond_3
int v1 = 1; // const/4 v1, 0x1
} // :goto_1
} // .end method
public final Integer h ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 6 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
v1 = this.t;
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 3 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(Z)Landroid/view/View;
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 4 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;
/* iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
/* move-object v0, p1 */
/* move-object v4, p0 */
/* .line 5 */
p1 = /* invoke-static/range {v0 ..v5}, Lc/r/d/k0;->a(Landroidx/recyclerview/widget/RecyclerView$a0;Lc/r/d/c0;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$o;Z)I */
} // .end method
public final Integer i ( Integer p0 ) {
/* .locals 4 */
int v0 = -1; // const/4 v0, -0x1
int v1 = 1; // const/4 v1, 0x1
/* if-eq p1, v1, :cond_b */
int v2 = 2; // const/4 v2, 0x2
/* if-eq p1, v2, :cond_8 */
/* const/16 v2, 0x11 */
/* const/high16 v3, -0x80000000 */
/* if-eq p1, v2, :cond_6 */
/* const/16 v2, 0x21 */
/* if-eq p1, v2, :cond_4 */
/* const/16 v0, 0x42 */
/* if-eq p1, v0, :cond_2 */
/* const/16 v0, 0x82 */
/* if-eq p1, v0, :cond_0 */
/* .line 6 */
} // :cond_0
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne p1, v1, :cond_1 */
} // :cond_1
/* const/high16 v1, -0x80000000 */
} // :goto_0
/* .line 7 */
} // :cond_2
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-nez p1, :cond_3 */
} // :cond_3
/* const/high16 v1, -0x80000000 */
} // :goto_1
/* .line 8 */
} // :cond_4
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne p1, v1, :cond_5 */
} // :cond_5
/* const/high16 v0, -0x80000000 */
} // :goto_2
/* .line 9 */
} // :cond_6
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-nez p1, :cond_7 */
} // :cond_7
/* const/high16 v0, -0x80000000 */
} // :goto_3
/* .line 10 */
} // :cond_8
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne p1, v1, :cond_9 */
/* .line 11 */
} // :cond_9
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).M ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M()Z
if ( p1 != null) { // if-eqz p1, :cond_a
} // :cond_a
/* .line 12 */
} // :cond_b
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne p1, v1, :cond_c */
/* .line 13 */
} // :cond_c
p1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).M ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M()Z
if ( p1 != null) { // if-eqz p1, :cond_d
} // :cond_d
} // .end method
public final Integer i ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 7 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
v1 = this.t;
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 3 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(Z)Landroid/view/View;
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 4 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;
/* iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
/* iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* move-object v0, p1 */
/* move-object v4, p0 */
/* .line 5 */
p1 = /* invoke-static/range {v0 ..v6}, Lc/r/d/k0;->a(Landroidx/recyclerview/widget/RecyclerView$a0;Lc/r/d/c0;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$o;ZZ)I */
} // .end method
public final Integer j ( androidx.recyclerview.widget.RecyclerView$a0 p0 ) {
/* .locals 6 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
v1 = this.t;
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 3 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->c(Z)Landroid/view/View;
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
/* xor-int/lit8 v0, v0, 0x1 */
/* .line 4 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->b(Z)Landroid/view/View;
/* iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M:Z */
/* move-object v0, p1 */
/* move-object v4, p0 */
/* .line 5 */
p1 = /* invoke-static/range {v0 ..v5}, Lc/r/d/k0;->b(Landroidx/recyclerview/widget/RecyclerView$a0;Lc/r/d/c0;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$o;Z)I */
} // .end method
public final androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a j ( Integer p0 ) {
/* .locals 4 */
/* .line 6 */
/* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;-><init>()V */
/* .line 7 */
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* new-array v1, v1, [I */
this.d = v1;
int v1 = 0; // const/4 v1, 0x0
/* .line 8 */
} // :goto_0
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v1, v2, :cond_0 */
/* .line 9 */
v2 = this.d;
v3 = this.s;
/* aget-object v3, v3, v1 */
v3 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
/* sub-int v3, p1, v3 */
/* aput v3, v2, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
public final androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a k ( Integer p0 ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a; */
/* invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;-><init>()V */
/* .line 2 */
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* new-array v1, v1, [I */
this.d = v1;
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v1, v2, :cond_0 */
/* .line 4 */
v2 = this.d;
v3 = this.s;
/* aget-object v3, v3, v1 */
v3 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v3 ).b ( p1 ); // invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
/* sub-int/2addr v3, p1 */
/* aput v3, v2, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
public final Integer l ( Integer p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 3 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v3 ); // invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* if-ltz v3, :cond_0 */
/* if-ge v3, p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public final Integer m ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
/* .line 3 */
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).l ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* if-ltz v1, :cond_0 */
/* if-ge v1, p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Integer n ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.s;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
int v1 = 1; // const/4 v1, 0x1
/* .line 2 */
} // :goto_0
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v1, v2, :cond_1 */
/* .line 3 */
v2 = this.s;
/* aget-object v2, v2, v1 */
v2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
/* if-le v2, v0, :cond_0 */
/* move v0, v2 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public final Integer o ( Integer p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.s;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
int v1 = 1; // const/4 v1, 0x1
/* .line 2 */
} // :goto_0
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v1, v2, :cond_1 */
/* .line 3 */
v2 = this.s;
/* aget-object v2, v2, v1 */
v2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v2 ).b ( p1 ); // invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
/* if-le v2, v0, :cond_0 */
/* move v0, v2 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public final Integer p ( Integer p0 ) {
/* .locals 3 */
/* .line 3 */
v0 = this.s;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
} // :goto_0
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v1, v2, :cond_1 */
/* .line 5 */
v2 = this.s;
/* aget-object v2, v2, v1 */
v2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
/* if-ge v2, v0, :cond_0 */
/* move v0, v2 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public final void p ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 2 */
v1 = this.s;
/* aget-object v1, v1, v0 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(Landroid/view/View;)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
public final Integer q ( Integer p0 ) {
/* .locals 3 */
/* .line 3 */
v0 = this.s;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
} // :goto_0
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v1, v2, :cond_1 */
/* .line 5 */
v2 = this.s;
/* aget-object v2, v2, v1 */
v2 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v2 ).b ( p1 ); // invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
/* if-ge v2, v0, :cond_0 */
/* move v0, v2 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
public final void q ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_0 */
/* .line 2 */
v1 = this.s;
/* aget-object v1, v1, v0 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v1 ).c ( p1 ); // invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c(Landroid/view/View;)V
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
return;
} // .end method
public final Boolean r ( Integer p0 ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
int v1 = -1; // const/4 v1, -0x1
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* if-nez v0, :cond_2 */
/* if-ne p1, v1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :goto_0
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* if-eq p1, v0, :cond_1 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
} // :cond_2
/* if-ne p1, v1, :cond_3 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
} // :goto_2
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
/* if-ne p1, v0, :cond_4 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_4
int p1 = 0; // const/4 p1, 0x0
} // :goto_3
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).M ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->M()Z
/* if-ne p1, v0, :cond_5 */
} // :cond_5
int v2 = 0; // const/4 v2, 0x0
} // :goto_4
} // .end method
public final void s ( Integer p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.x;
/* iput p1, v0, Lc/r/d/w;->e:I */
/* .line 2 */
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->z:Z */
int v2 = 1; // const/4 v2, 0x1
int v3 = -1; // const/4 v3, -0x1
/* if-ne p1, v3, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* if-ne v1, p1, :cond_1 */
} // :cond_1
int v2 = -1; // const/4 v2, -0x1
} // :goto_1
/* iput v2, v0, Lc/r/d/w;->d:I */
return;
} // .end method
public void t ( Integer p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
/* .line 1 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "invalid orientation."; // const-string v0, "invalid orientation."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V
/* .line 3 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* if-ne p1, v0, :cond_2 */
return;
/* .line 4 */
} // :cond_2
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->v:I */
/* .line 5 */
p1 = this.t;
/* .line 6 */
v0 = this.u;
this.t = v0;
/* .line 7 */
this.u = p1;
/* .line 8 */
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
return;
} // .end method
public void u ( Integer p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V
/* .line 3 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-eq p1, v0, :cond_1 */
/* .line 4 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).L ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->L()V
/* .line 5 */
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* .line 6 */
/* new-instance p1, Ljava/util/BitSet; */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V */
this.A = p1;
/* .line 7 */
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* new-array p1, p1, [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f; */
this.s = p1;
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
} // :goto_0
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge p1, v0, :cond_0 */
/* .line 9 */
v0 = this.s;
/* new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f; */
/* invoke-direct {v1, p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V */
/* aput-object v1, v0, p1 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 10 */
} // :cond_0
(( androidx.recyclerview.widget.RecyclerView$o ) p0 ).y ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->y()V
} // :cond_1
return;
} // .end method
public Boolean u ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->E:I */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void v ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* div-int v0, p1, v0 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:I */
/* .line 2 */
v0 = this.u;
/* .line 3 */
v0 = (( c.r.d.c0 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/r/d/c0;->d()I
/* .line 4 */
p1 = android.view.View$MeasureSpec .makeMeasureSpec ( p1,v0 );
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I:I */
return;
} // .end method
public android.os.Parcelable x ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.H;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e; */
v1 = this.H;
/* invoke-direct {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;)V */
/* .line 3 */
} // :cond_0
/* new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e; */
/* invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;-><init>()V */
/* .line 4 */
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
/* iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->i:Z */
/* .line 5 */
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F:Z */
/* iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->j:Z */
/* .line 6 */
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->G:Z */
/* iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->k:Z */
/* .line 7 */
v1 = this.D;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_1
v3 = this.a;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 8 */
this.g = v3;
/* .line 9 */
/* array-length v3, v3 */
/* iput v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->f:I */
/* .line 10 */
v1 = this.b;
this.h = v1;
/* .line 11 */
} // :cond_1
/* iput v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->f:I */
/* .line 12 */
} // :goto_0
v1 = (( androidx.recyclerview.widget.RecyclerView$o ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->e()I
/* if-lez v1, :cond_5 */
/* .line 13 */
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).J ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->J()I
/* .line 14 */
} // :cond_2
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).I ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->I()I
} // :goto_1
/* iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->b:I */
/* .line 15 */
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager ) p0 ).H ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->H()I
/* iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->c:I */
/* .line 16 */
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
/* .line 17 */
/* new-array v1, v1, [I */
this.e = v1;
/* .line 18 */
} // :goto_2
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:I */
/* if-ge v2, v1, :cond_6 */
/* .line 19 */
/* iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F:Z */
/* const/high16 v3, -0x80000000 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 20 */
v1 = this.s;
/* aget-object v1, v1, v2 */
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
/* if-eq v1, v3, :cond_4 */
/* .line 21 */
v3 = this.t;
v3 = (( c.r.d.c0 ) v3 ).b ( ); // invoke-virtual {v3}, Lc/r/d/c0;->b()I
/* .line 22 */
} // :cond_3
v1 = this.s;
/* aget-object v1, v1, v2 */
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) v1 ).b ( v3 ); // invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
/* if-eq v1, v3, :cond_4 */
/* .line 23 */
v3 = this.t;
v3 = (( c.r.d.c0 ) v3 ).f ( ); // invoke-virtual {v3}, Lc/r/d/c0;->f()I
} // :goto_3
/* sub-int/2addr v1, v3 */
/* .line 24 */
} // :cond_4
v3 = this.e;
/* aput v1, v3, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_5
int v1 = -1; // const/4 v1, -0x1
/* .line 25 */
/* iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->b:I */
/* .line 26 */
/* iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->c:I */
/* .line 27 */
/* iput v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$e;->d:I */
} // :cond_6
} // .end method
