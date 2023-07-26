public abstract class androidx.recyclerview.widget.RecyclerView$g {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "g" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<VH:", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* ">", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* # instance fields */
public final androidx.recyclerview.widget.RecyclerView$h a;
public Boolean b;
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$g ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Landroidx/recyclerview/widget/RecyclerView$h; */
/* invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$g;->b:Z */
return;
} // .end method
/* # virtual methods */
public abstract Integer a ( ) {
} // .end method
public Long a ( Integer p0 ) {
/* .locals 2 */
/* const-wide/16 v0, -0x1 */
/* return-wide v0 */
} // .end method
public final androidx.recyclerview.widget.RecyclerView$d0 a ( android.view.ViewGroup p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/ViewGroup;", */
/* "I)TVH;" */
/* } */
} // .end annotation
try { // :try_start_0
final String v0 = "RV CreateView"; // const-string v0, "RV CreateView"
/* .line 2 */
c.h.j.d .a ( v0 );
/* .line 3 */
(( androidx.recyclerview.widget.RecyclerView$g ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->b(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
/* .line 4 */
v0 = this.a;
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_0 */
/* .line 5 */
/* iput p2, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->f:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
c.h.j.d .a ( );
/* .line 7 */
} // :cond_0
try { // :try_start_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "ViewHolder views must not be attached when created.Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"; // const-string p2, "ViewHolder views must not be attached when created.Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 8 */
c.h.j.d .a ( );
/* .line 9 */
/* throw p1 */
} // .end method
public final void a ( Integer p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .line 22 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( androidx.recyclerview.widget.RecyclerView$h ) v0 ).a ( p1, v1, p2 ); // invoke-virtual {v0, p1, v1, p2}, Landroidx/recyclerview/widget/RecyclerView$h;->a(IILjava/lang/Object;)V
return;
} // .end method
public final void a ( androidx.recyclerview.widget.RecyclerView$d0 p0, Integer p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TVH;I)V" */
/* } */
} // .end annotation
/* .line 10 */
/* iput p2, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* .line 11 */
v0 = (( androidx.recyclerview.widget.RecyclerView$g ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
(( androidx.recyclerview.widget.RecyclerView$g ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->a(I)J
/* move-result-wide v0 */
/* iput-wide v0, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->e:J */
} // :cond_0
/* const/16 v0, 0x207 */
int v1 = 1; // const/4 v1, 0x1
/* .line 13 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).a ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(II)V
final String v0 = "RV OnBindView"; // const-string v0, "RV OnBindView"
/* .line 14 */
c.h.j.d .a ( v0 );
/* .line 15 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).l ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->l()Ljava/util/List;
(( androidx.recyclerview.widget.RecyclerView$g ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView$g;->a(Landroidx/recyclerview/widget/RecyclerView$d0;ILjava/util/List;)V
/* .line 16 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p1 ).b ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->b()V
/* .line 17 */
p1 = this.a;
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 18 */
/* instance-of p2, p1, Landroidx/recyclerview/widget/RecyclerView$p; */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 19 */
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
/* iput-boolean v1, p1, Landroidx/recyclerview/widget/RecyclerView$p;->c:Z */
/* .line 20 */
} // :cond_1
c.h.j.d .a ( );
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$d0 p0, Integer p1, java.util.List p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TVH;I", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Object;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$g ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->b(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$i p0 ) {
/* .locals 1 */
/* .line 21 */
v0 = this.a;
(( android.database.Observable ) v0 ).registerObserver ( p1 ); // invoke-virtual {v0, p1}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TVH;)Z" */
/* } */
} // .end annotation
int p1 = 0; // const/4 p1, 0x0
} // .end method
public abstract Integer b ( Integer p0 ) {
} // .end method
public abstract androidx.recyclerview.widget.RecyclerView$d0 b ( android.view.ViewGroup p0, Integer p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/view/ViewGroup;", */
/* "I)TVH;" */
/* } */
} // .end annotation
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TVH;)V" */
/* } */
} // .end annotation
return;
} // .end method
public abstract void b ( androidx.recyclerview.widget.RecyclerView$d0 p0, Integer p1 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TVH;I)V" */
/* } */
} // .end annotation
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView$i p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.a;
(( android.database.Observable ) v0 ).unregisterObserver ( p1 ); // invoke-virtual {v0, p1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 0 */
return;
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$g;->b:Z */
} // .end method
public final void c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( androidx.recyclerview.widget.RecyclerView$h ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$h;->a()V
return;
} // .end method
public final void c ( Integer p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( androidx.recyclerview.widget.RecyclerView$h ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$h;->a(II)V
return;
} // .end method
public void c ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TVH;)V" */
/* } */
} // .end annotation
return;
} // .end method
public void d ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TVH;)V" */
/* } */
} // .end annotation
return;
} // .end method
