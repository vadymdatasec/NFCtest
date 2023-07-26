public class androidx.recyclerview.widget.StaggeredGridLayoutManager$f {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "f" */
} // .end annotation
/* # instance fields */
public java.util.ArrayList a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer b;
public Integer c;
public Integer d;
public final Integer e;
public final androidx.recyclerview.widget.StaggeredGridLayoutManager f; //synthetic
/* # direct methods */
public androidx.recyclerview.widget.StaggeredGridLayoutManager$f ( ) {
/* .locals 0 */
/* .line 1 */
this.f = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance p1, Ljava/util/ArrayList; */
/* invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V */
this.a = p1;
/* const/high16 p1, -0x80000000 */
/* .line 3 */
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* .line 4 */
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
/* .line 6 */
/* iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
return;
} // .end method
/* # virtual methods */
public Integer a ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_1 */
/* .line 3 */
} // :cond_1
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a()V
/* .line 4 */
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
} // .end method
public Integer a ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 6 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move v1, p1 */
/* move v2, p2 */
/* move v5, p3 */
/* .line 35 */
p1 = /* invoke-virtual/range {v0 ..v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(IIZZZ)I */
} // .end method
public Integer a ( Integer p0, Integer p1, Boolean p2, Boolean p3, Boolean p4 ) {
/* .locals 10 */
/* .line 27 */
v0 = this.f;
v0 = this.t;
v0 = (( c.r.d.c0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/r/d/c0;->f()I
/* .line 28 */
v1 = this.f;
v1 = this.t;
v1 = (( c.r.d.c0 ) v1 ).b ( ); // invoke-virtual {v1}, Lc/r/d/c0;->b()I
int v2 = -1; // const/4 v2, -0x1
int v3 = 1; // const/4 v3, 0x1
/* if-le p2, p1, :cond_0 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_0
int v4 = -1; // const/4 v4, -0x1
} // :goto_0
/* if-eq p1, p2, :cond_9 */
/* .line 29 */
v5 = this.a;
(( java.util.ArrayList ) v5 ).get ( p1 ); // invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v5, Landroid/view/View; */
/* .line 30 */
v6 = this.f;
v6 = this.t;
v6 = (( c.r.d.c0 ) v6 ).d ( v5 ); // invoke-virtual {v6, v5}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* .line 31 */
v7 = this.f;
v7 = this.t;
v7 = (( c.r.d.c0 ) v7 ).a ( v5 ); // invoke-virtual {v7, v5}, Lc/r/d/c0;->a(Landroid/view/View;)I
int v8 = 0; // const/4 v8, 0x0
if ( p5 != null) { // if-eqz p5, :cond_1
/* if-gt v6, v1, :cond_2 */
} // :cond_1
/* if-ge v6, v1, :cond_2 */
} // :goto_1
int v9 = 1; // const/4 v9, 0x1
} // :cond_2
int v9 = 0; // const/4 v9, 0x0
} // :goto_2
if ( p5 != null) { // if-eqz p5, :cond_3
/* if-lt v7, v0, :cond_4 */
} // :cond_3
/* if-le v7, v0, :cond_4 */
} // :goto_3
int v8 = 1; // const/4 v8, 0x1
} // :cond_4
if ( v9 != null) { // if-eqz v9, :cond_8
if ( v8 != null) { // if-eqz v8, :cond_8
if ( p3 != null) { // if-eqz p3, :cond_5
if ( p4 != null) { // if-eqz p4, :cond_5
/* if-lt v6, v0, :cond_8 */
/* if-gt v7, v1, :cond_8 */
/* .line 32 */
p1 = this.f;
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p1 ).l ( v5 ); // invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
} // :cond_5
if ( p4 != null) { // if-eqz p4, :cond_6
/* .line 33 */
p1 = this.f;
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p1 ).l ( v5 ); // invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
} // :cond_6
/* if-lt v6, v0, :cond_7 */
/* if-le v7, v1, :cond_8 */
/* .line 34 */
} // :cond_7
p1 = this.f;
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) p1 ).l ( v5 ); // invoke-virtual {p1, v5}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
} // :cond_8
/* add-int/2addr p1, v4 */
} // :cond_9
} // .end method
public android.view.View a ( Integer p0, Integer p1 ) {
/* .locals 5 */
int v0 = -1; // const/4 v0, -0x1
int v1 = 0; // const/4 v1, 0x0
/* if-ne p2, v0, :cond_2 */
/* .line 36 */
p2 = this.a;
p2 = (( java.util.ArrayList ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, p2, :cond_5 */
/* .line 37 */
v2 = this.a;
(( java.util.ArrayList ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/view/View; */
/* .line 38 */
v3 = this.f;
/* iget-boolean v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) v3 ).l ( v2 ); // invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* if-le v3, p1, :cond_5 */
} // :cond_0
v3 = this.f;
/* iget-boolean v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
/* if-nez v4, :cond_1 */
/* .line 39 */
v3 = (( androidx.recyclerview.widget.RecyclerView$o ) v3 ).l ( v2 ); // invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* if-lt v3, p1, :cond_1 */
/* .line 40 */
} // :cond_1
v3 = (( android.view.View ) v2 ).hasFocusable ( ); // invoke-virtual {v2}, Landroid/view/View;->hasFocusable()Z
if ( v3 != null) { // if-eqz v3, :cond_5
/* add-int/lit8 v0, v0, 0x1 */
/* move-object v1, v2 */
/* .line 41 */
} // :cond_2
p2 = this.a;
p2 = (( java.util.ArrayList ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 p2, p2, -0x1 */
} // :goto_1
/* if-ltz p2, :cond_5 */
/* .line 42 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 43 */
v2 = this.f;
/* iget-boolean v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
if ( v3 != null) { // if-eqz v3, :cond_3
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) v2 ).l ( v0 ); // invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* if-ge v2, p1, :cond_5 */
} // :cond_3
v2 = this.f;
/* iget-boolean v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
/* if-nez v3, :cond_4 */
/* .line 44 */
v2 = (( androidx.recyclerview.widget.RecyclerView$o ) v2 ).l ( v0 ); // invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->l(Landroid/view/View;)I
/* if-gt v2, p1, :cond_4 */
/* .line 45 */
} // :cond_4
v2 = (( android.view.View ) v0 ).hasFocusable ( ); // invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z
if ( v2 != null) { // if-eqz v2, :cond_5
/* add-int/lit8 p2, p2, -0x1 */
/* move-object v1, v0 */
} // :cond_5
} // :goto_2
} // .end method
public void a ( ) {
/* .locals 4 */
/* .line 5 */
v0 = this.a;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 6 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
/* .line 7 */
v3 = this.f;
v3 = this.t;
v0 = (( c.r.d.c0 ) v3 ).a ( v0 ); // invoke-virtual {v3, v0}, Lc/r/d/c0;->a(Landroid/view/View;)I
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
/* .line 8 */
/* iget-boolean v0, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
v0 = this.f;
v0 = this.D;
/* .line 10 */
v1 = (( androidx.recyclerview.widget.RecyclerView$p ) v1 ).a ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->c(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
/* iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->c:I */
/* if-ne v1, v2, :cond_0 */
/* .line 12 */
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->a(I)I
/* add-int/2addr v1, v0 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 4 */
/* .line 13 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
/* .line 14 */
this.e = p0;
/* .line 15 */
v1 = this.a;
(( java.util.ArrayList ) v1 ).add ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* const/high16 v1, -0x80000000 */
/* .line 16 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
/* .line 17 */
v2 = this.a;
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_0 */
/* .line 18 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* .line 19 */
} // :cond_0
v1 = (( androidx.recyclerview.widget.RecyclerView$p ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z
/* if-nez v1, :cond_1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$p ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$p;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 20 */
} // :cond_1
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
v1 = this.f;
v1 = this.t;
p1 = (( c.r.d.c0 ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* add-int/2addr v0, p1 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
} // :cond_2
return;
} // .end method
public void a ( Boolean p0, Integer p1 ) {
/* .locals 3 */
/* const/high16 v0, -0x80000000 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 21 */
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(I)I
/* .line 22 */
} // :cond_0
v1 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(I)I
/* .line 23 */
} // :goto_0
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c()V
/* if-ne v1, v0, :cond_1 */
return;
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 24 */
v2 = this.f;
v2 = this.t;
v2 = (( c.r.d.c0 ) v2 ).b ( ); // invoke-virtual {v2}, Lc/r/d/c0;->b()I
/* if-lt v1, v2, :cond_3 */
} // :cond_2
/* if-nez p1, :cond_4 */
p1 = this.f;
p1 = this.t;
/* .line 25 */
p1 = (( c.r.d.c0 ) p1 ).f ( ); // invoke-virtual {p1}, Lc/r/d/c0;->f()I
/* if-le v1, p1, :cond_4 */
} // :cond_3
return;
} // :cond_4
/* if-eq p2, v0, :cond_5 */
/* add-int/2addr v1, p2 */
/* .line 26 */
} // :cond_5
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
return;
} // .end method
public Integer b ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_1 */
/* .line 3 */
} // :cond_1
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b()V
/* .line 4 */
/* iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
} // .end method
public androidx.recyclerview.widget.StaggeredGridLayoutManager$c b ( android.view.View p0 ) {
/* .locals 0 */
/* .line 13 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c; */
} // .end method
public void b ( ) {
/* .locals 3 */
/* .line 5 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 6 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
/* .line 7 */
v2 = this.f;
v2 = this.t;
v0 = (( c.r.d.c0 ) v2 ).d ( v0 ); // invoke-virtual {v2, v0}, Lc/r/d/c0;->d(Landroid/view/View;)I
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* .line 8 */
/* iget-boolean v0, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
v0 = this.f;
v0 = this.D;
/* .line 10 */
v1 = (( androidx.recyclerview.widget.RecyclerView$p ) v1 ).a ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$d ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d;->c(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
/* iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->c:I */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_0 */
/* .line 12 */
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->e:I */
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$d$a;->a(I)I
/* sub-int/2addr v1, v0 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
} // :cond_0
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 9 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 10 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).i ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->i()V
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
return;
} // .end method
public void c ( Integer p0 ) {
/* .locals 2 */
/* .line 12 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_0 */
/* add-int/2addr v0, p1 */
/* .line 13 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* .line 14 */
} // :cond_0
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
/* if-eq v0, v1, :cond_1 */
/* add-int/2addr v0, p1 */
/* .line 15 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
} // :cond_1
return;
} // .end method
public void c ( android.view.View p0 ) {
/* .locals 4 */
/* .line 1 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
/* .line 2 */
this.e = p0;
/* .line 3 */
v1 = this.a;
int v2 = 0; // const/4 v2, 0x0
(( java.util.ArrayList ) v1 ).add ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
/* const/high16 v1, -0x80000000 */
/* .line 4 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* .line 5 */
v2 = this.a;
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_0 */
/* .line 6 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
/* .line 7 */
} // :cond_0
v1 = (( androidx.recyclerview.widget.RecyclerView$p ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z
/* if-nez v1, :cond_1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$p ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$p;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 8 */
} // :cond_1
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
v1 = this.f;
v1 = this.t;
p1 = (( c.r.d.c0 ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* add-int/2addr v0, p1 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
} // :cond_2
return;
} // .end method
public Integer d ( ) {
/* .locals 3 */
/* .line 2 */
v0 = this.f;
/* iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
/* .line 3 */
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v0, v1 */
int v2 = -1; // const/4 v2, -0x1
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).a ( v0, v2, v1 ); // invoke-virtual {p0, v0, v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(IIZ)I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
v2 = this.a;
/* .line 4 */
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).a ( v0, v2, v1 ); // invoke-virtual {p0, v0, v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(IIZ)I
} // :goto_0
} // .end method
public void d ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
return;
} // .end method
public Integer e ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.f;
/* iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->y:Z */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
v2 = this.a;
/* .line 2 */
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).a ( v0, v2, v1 ); // invoke-virtual {p0, v0, v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(IIZ)I
} // :cond_0
v0 = this.a;
/* .line 3 */
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* sub-int/2addr v0, v1 */
int v2 = -1; // const/4 v2, -0x1
v0 = (( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).a ( v0, v2, v1 ); // invoke-virtual {p0, v0, v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a(IIZ)I
} // :goto_0
} // .end method
public Integer f ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
} // .end method
public Integer g ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->a()V
/* .line 3 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
} // .end method
public Integer h ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* const/high16 v1, -0x80000000 */
/* if-eq v0, v1, :cond_0 */
/* .line 2 */
} // :cond_0
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b()V
/* .line 3 */
/* iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
} // .end method
public void i ( ) {
/* .locals 1 */
/* const/high16 v0, -0x80000000 */
/* .line 1 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* .line 2 */
/* iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
return;
} // .end method
public void j ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* .line 2 */
v1 = this.a;
/* add-int/lit8 v2, v0, -0x1 */
(( java.util.ArrayList ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* check-cast v1, Landroid/view/View; */
/* .line 3 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
int v3 = 0; // const/4 v3, 0x0
/* .line 4 */
this.e = v3;
/* .line 5 */
v3 = (( androidx.recyclerview.widget.RecyclerView$p ) v2 ).c ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z
/* if-nez v3, :cond_0 */
v2 = (( androidx.recyclerview.widget.RecyclerView$p ) v2 ).b ( ); // invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$p;->b()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 6 */
} // :cond_0
/* iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
v3 = this.f;
v3 = this.t;
v1 = (( c.r.d.c0 ) v3 ).b ( v1 ); // invoke-virtual {v3, v1}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* sub-int/2addr v2, v1 */
/* iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
} // :cond_1
/* const/high16 v1, -0x80000000 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_2 */
/* .line 7 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
/* .line 8 */
} // :cond_2
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
return;
} // .end method
public void k ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
/* .line 2 */
(( androidx.recyclerview.widget.StaggeredGridLayoutManager$f ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$c;
int v2 = 0; // const/4 v2, 0x0
/* .line 3 */
this.e = v2;
/* .line 4 */
v2 = this.a;
v2 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* const/high16 v3, -0x80000000 */
/* if-nez v2, :cond_0 */
/* .line 5 */
/* iput v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->c:I */
/* .line 6 */
} // :cond_0
v2 = (( androidx.recyclerview.widget.RecyclerView$p ) v1 ).c ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z
/* if-nez v2, :cond_1 */
v1 = (( androidx.recyclerview.widget.RecyclerView$p ) v1 ).b ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$p;->b()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 7 */
} // :cond_1
/* iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
v2 = this.f;
v2 = this.t;
v0 = (( c.r.d.c0 ) v2 ).b ( v0 ); // invoke-virtual {v2, v0}, Lc/r/d/c0;->b(Landroid/view/View;)I
/* sub-int/2addr v1, v0 */
/* iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->d:I */
/* .line 8 */
} // :cond_2
/* iput v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$f;->b:I */
return;
} // .end method
