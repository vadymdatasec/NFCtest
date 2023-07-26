public class androidx.recyclerview.widget.RecyclerView$u {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "u" */
} // .end annotation
/* # instance fields */
public android.util.SparseArray a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/util/SparseArray<", */
/* "Lc/r/d/g0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer b;
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$u ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Landroid/util/SparseArray; */
/* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$u;->b:I */
return;
} // .end method
/* # virtual methods */
public Long a ( Long p0, Long p1 ) {
/* .locals 4 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p1, v0 */
/* if-nez v2, :cond_0 */
/* return-wide p3 */
} // :cond_0
/* const-wide/16 v0, 0x4 */
/* .line 12 */
/* div-long/2addr p1, v0 */
/* const-wide/16 v2, 0x3 */
/* mul-long p1, p1, v2 */
/* div-long/2addr p3, v0 */
/* add-long/2addr p1, p3 */
/* return-wide p1 */
} // .end method
public androidx.recyclerview.widget.RecyclerView$d0 a ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
(( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast p1, Lc/r/d/g0; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 2 */
v0 = this.a;
v0 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v0, :cond_1 */
/* .line 3 */
p1 = this.a;
/* .line 4 */
v0 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 5 */
(( java.util.ArrayList ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$d0; */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) v1 ).n ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->n()Z
/* if-nez v1, :cond_0 */
/* .line 6 */
(( java.util.ArrayList ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$d0; */
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 16 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$u;->b:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$u;->b:I */
return;
} // .end method
public void a ( Integer p0, Long p1 ) {
/* .locals 2 */
/* .line 13 */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$u;->b(I)Lc/r/d/g0;
/* .line 14 */
/* iget-wide v0, p1, Lc/r/d/g0;->d:J */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).a ( v0, v1, p2, p3 ); // invoke-virtual {p0, v0, v1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$u;->a(JJ)J
/* move-result-wide p2 */
/* iput-wide p2, p1, Lc/r/d/g0;->d:J */
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 3 */
/* .line 7 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).i ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->i()I
/* .line 8 */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$u;->b(I)Lc/r/d/g0;
v1 = this.a;
/* .line 9 */
v2 = this.a;
(( android.util.SparseArray ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lc/r/d/g0; */
/* iget v0, v0, Lc/r/d/g0;->b:I */
v2 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-gt v0, v2, :cond_0 */
return;
/* .line 10 */
} // :cond_0
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).w ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->w()V
/* .line 11 */
(( java.util.ArrayList ) v1 ).add ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$g p0, androidx.recyclerview.widget.RecyclerView$g p1, Boolean p2 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 17 */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$u;->c()V
} // :cond_0
/* if-nez p3, :cond_1 */
/* .line 18 */
/* iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$u;->b:I */
/* if-nez p1, :cond_1 */
/* .line 19 */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$u;->b()V
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 20 */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).a ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$u;->a()V
} // :cond_2
return;
} // .end method
public Boolean a ( Integer p0, Long p1, Long p2 ) {
/* .locals 4 */
/* .line 15 */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$u;->b(I)Lc/r/d/g0;
/* iget-wide v0, p1, Lc/r/d/g0;->d:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long p1, v0, v2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* add-long/2addr p2, v0 */
/* cmp-long p1, p2, p4 */
/* if-gez p1, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public final c.r.d.g0 b ( Integer p0 ) {
/* .locals 2 */
/* .line 7 */
v0 = this.a;
(( android.util.SparseArray ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lc/r/d/g0; */
/* if-nez v0, :cond_0 */
/* .line 8 */
/* new-instance v0, Lc/r/d/g0; */
/* invoke-direct {v0}, Lc/r/d/g0;-><init>()V */
/* .line 9 */
v1 = this.a;
(( android.util.SparseArray ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
} // :cond_0
} // .end method
public void b ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
v1 = this.a;
v1 = (( android.util.SparseArray ) v1 ).size ( ); // invoke-virtual {v1}, Landroid/util/SparseArray;->size()I
/* if-ge v0, v1, :cond_0 */
/* .line 2 */
v1 = this.a;
(( android.util.SparseArray ) v1 ).valueAt ( v0 ); // invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
/* check-cast v1, Lc/r/d/g0; */
/* .line 3 */
v1 = this.a;
(( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void b ( Integer p0, Long p1 ) {
/* .locals 2 */
/* .line 4 */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$u;->b(I)Lc/r/d/g0;
/* .line 5 */
/* iget-wide v0, p1, Lc/r/d/g0;->c:J */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).a ( v0, v1, p2, p3 ); // invoke-virtual {p0, v0, v1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$u;->a(JJ)J
/* move-result-wide p2 */
/* iput-wide p2, p1, Lc/r/d/g0;->c:J */
return;
} // .end method
public Boolean b ( Integer p0, Long p1, Long p2 ) {
/* .locals 4 */
/* .line 6 */
(( androidx.recyclerview.widget.RecyclerView$u ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$u;->b(I)Lc/r/d/g0;
/* iget-wide v0, p1, Lc/r/d/g0;->c:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long p1, v0, v2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* add-long/2addr p2, v0 */
/* cmp-long p1, p2, p4 */
/* if-gez p1, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$u;->b:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$u;->b:I */
return;
} // .end method
