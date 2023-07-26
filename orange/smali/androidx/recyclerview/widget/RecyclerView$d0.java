public abstract class androidx.recyclerview.widget.RecyclerView$d0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "d0" */
} // .end annotation
/* # static fields */
public static final java.util.List s;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.view.View a;
public java.lang.ref.WeakReference b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "Landroidx/recyclerview/widget/RecyclerView;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer c;
public Integer d;
public Long e;
public Integer f;
public Integer g;
public androidx.recyclerview.widget.RecyclerView$d0 h;
public androidx.recyclerview.widget.RecyclerView$d0 i;
public Integer j;
public java.util.List k;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.List l;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Integer m;
public androidx.recyclerview.widget.RecyclerView$v n;
public Boolean o;
public Integer p;
public Integer q;
public androidx.recyclerview.widget.RecyclerView r;
/* # direct methods */
public static androidx.recyclerview.widget.RecyclerView$d0 ( ) {
/* .locals 1 */
/* .line 1 */
java.util.Collections .emptyList ( );
return;
} // .end method
public androidx.recyclerview.widget.RecyclerView$d0 ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = -1; // const/4 v0, -0x1
/* .line 2 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* .line 3 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->d:I */
/* const-wide/16 v1, -0x1 */
/* .line 4 */
/* iput-wide v1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->e:J */
/* .line 5 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->f:I */
/* .line 6 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 7 */
this.h = v1;
/* .line 8 */
this.i = v1;
/* .line 9 */
this.k = v1;
/* .line 10 */
this.l = v1;
int v2 = 0; // const/4 v2, 0x0
/* .line 11 */
/* iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->m:I */
/* .line 12 */
this.n = v1;
/* .line 13 */
/* iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->o:Z */
/* .line 14 */
/* iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->p:I */
/* .line 15 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->q:I */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 16 */
this.a = p1;
return;
/* .line 17 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "itemView may not be null"; // const-string v0, "itemView may not be null"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
/* # virtual methods */
public void A ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.n;
(( androidx.recyclerview.widget.RecyclerView$v ) v0 ).e ( p0 ); // invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$v;->e(Landroidx/recyclerview/widget/RecyclerView$d0;)V
return;
} // .end method
public Boolean B ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, 0x20 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void a ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 12 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->d:I */
/* .line 13 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 17 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* or-int/2addr p1, v0 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 16 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* not-int v1, p2 */
/* and-int/2addr v0, v1 */
/* and-int/2addr p1, p2 */
/* or-int/2addr p1, v0 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
return;
} // .end method
public void a ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 1 */
/* const/16 v0, 0x8 */
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(IZ)V
/* .line 3 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
return;
} // .end method
public void a ( Integer p0, Boolean p1 ) {
/* .locals 2 */
/* .line 4 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->d:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* .line 5 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->d:I */
/* .line 6 */
} // :cond_0
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
/* if-ne v0, v1, :cond_1 */
/* .line 7 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 8 */
/* iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
/* add-int/2addr p2, p1 */
/* iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
/* .line 9 */
} // :cond_2
/* iget p2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* add-int/2addr p2, p1 */
/* iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* .line 10 */
p1 = this.a;
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 11 */
p1 = this.a;
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p; */
int p2 = 1; // const/4 p2, 0x1
/* iput-boolean p2, p1, Landroidx/recyclerview/widget/RecyclerView$p;->c:Z */
} // :cond_3
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$v p0, Boolean p1 ) {
/* .locals 0 */
/* .line 14 */
this.n = p1;
/* .line 15 */
/* iput-boolean p2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->o:Z */
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 2 */
/* .line 22 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->q:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* .line 23 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->p:I */
/* .line 24 */
} // :cond_0
v0 = this.a;
/* .line 25 */
v0 = c.h.n.v0 .m ( v0 );
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->p:I */
} // :goto_0
int v0 = 4; // const/4 v0, 0x4
/* .line 26 */
(( androidx.recyclerview.widget.RecyclerView ) p1 ).a ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)Z
return;
} // .end method
public void a ( java.lang.Object p0 ) {
/* .locals 2 */
/* const/16 v0, 0x400 */
/* if-nez p1, :cond_0 */
/* .line 18 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$d0;->a(I)V
/* .line 19 */
} // :cond_0
/* iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/2addr v0, v1 */
/* if-nez v0, :cond_1 */
/* .line 20 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).e ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->e()V
/* .line 21 */
v0 = this.k;
} // :cond_1
} // :goto_0
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 27 */
/* iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->m:I */
if ( p1 != null) { // if-eqz p1, :cond_0
/* sub-int/2addr v1, v0 */
} // :cond_0
/* add-int/2addr v1, v0 */
} // :goto_0
/* iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->m:I */
/* if-gez v1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 28 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->m:I */
/* .line 29 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "; // const-string v0, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "View"; // const-string v0, "View"
android.util.Log .e ( v0,p1 );
} // :cond_1
/* if-nez p1, :cond_2 */
/* if-ne v1, v0, :cond_2 */
/* .line 30 */
/* iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* or-int/lit8 p1, p1, 0x10 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 31 */
/* iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->m:I */
/* if-nez p1, :cond_3 */
/* .line 32 */
/* iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 p1, p1, -0x11 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
} // :cond_3
} // :goto_1
return;
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
/* .line 4 */
} // :cond_0
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit16 v0, v0, -0x401 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
return;
} // .end method
public void b ( androidx.recyclerview.widget.RecyclerView p0 ) {
/* .locals 1 */
/* .line 5 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->p:I */
(( androidx.recyclerview.widget.RecyclerView ) p1 ).a ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)Z
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
/* iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->p:I */
return;
} // .end method
public Boolean b ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/2addr p1, v0 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, -0x21 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
return;
} // .end method
public void d ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit16 v0, v0, -0x101 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
return;
} // .end method
public final void e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.k = v0;
/* .line 3 */
java.util.Collections .unmodifiableList ( v0 );
this.l = v0;
} // :cond_0
return;
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, 0x10 */
/* if-nez v0, :cond_0 */
v0 = this.a;
v0 = c.h.n.v0 .A ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Integer g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.r;
/* if-nez v0, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
/* .line 2 */
} // :cond_0
v0 = (( androidx.recyclerview.widget.RecyclerView ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->c(Landroidx/recyclerview/widget/RecyclerView$d0;)I
} // .end method
public final Long h ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->e:J */
/* return-wide v0 */
} // .end method
public final Integer i ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->f:I */
} // .end method
public final Integer j ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
} // :cond_0
} // .end method
public final Integer k ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->d:I */
} // .end method
public java.util.List l ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit16 v0, v0, 0x400 */
/* if-nez v0, :cond_2 */
/* .line 2 */
v0 = this.k;
v0 = if ( v0 != null) { // if-eqz v0, :cond_1
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
v0 = this.l;
/* .line 4 */
} // :cond_1
} // :goto_0
v0 = androidx.recyclerview.widget.RecyclerView$d0.s;
/* .line 5 */
} // :cond_2
v0 = androidx.recyclerview.widget.RecyclerView$d0.s;
} // .end method
public Boolean m ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit16 v0, v0, 0x200 */
/* if-nez v0, :cond_1 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public Boolean n ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
v1 = this.r;
/* if-eq v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean o ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
int v1 = 1; // const/4 v1, 0x1
/* and-int/2addr v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public Boolean p ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, 0x4 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean q ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, 0x10 */
/* if-nez v0, :cond_0 */
v0 = this.a;
/* .line 2 */
v0 = c.h.n.v0 .A ( v0 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean r ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, 0x8 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean s ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean t ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit16 v0, v0, 0x100 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.String toString ( ) {
/* .locals 5 */
/* .line 1 */
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v0 = (( java.lang.Class ) v0 ).isAnonymousClass ( ); // invoke-virtual {v0}, Ljava/lang/Class;->isAnonymousClass()Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "ViewHolder"; // const-string v0, "ViewHolder"
} // :cond_0
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
/* .line 2 */
} // :goto_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "{"; // const-string v0, "{"
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
v0 = (( java.lang.Object ) p0 ).hashCode ( ); // invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I
java.lang.Integer .toHexString ( v0 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = " position="; // const-string v0, " position="
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v0 = " id="; // const-string v0, " id="
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v3, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->e:J */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v0 = ", oldPos="; // const-string v0, ", oldPos="
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->d:I */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v0 = ", pLpos:"; // const-string v0, ", pLpos:"
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 4 */
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).s ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->s()Z
if ( v0 != null) { // if-eqz v0, :cond_2
final String v0 = " scrap "; // const-string v0, " scrap "
/* .line 5 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "[changeScrap]"; // const-string v0, "[changeScrap]"
} // :cond_1
final String v0 = "[attachedScrap]"; // const-string v0, "[attachedScrap]"
/* .line 6 */
} // :goto_1
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 7 */
} // :cond_2
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
if ( v0 != null) { // if-eqz v0, :cond_3
final String v0 = " invalid"; // const-string v0, " invalid"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 8 */
} // :cond_3
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).o ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->o()Z
/* if-nez v0, :cond_4 */
final String v0 = " unbound"; // const-string v0, " unbound"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
} // :cond_4
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).v ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->v()Z
if ( v0 != null) { // if-eqz v0, :cond_5
final String v0 = " update"; // const-string v0, " update"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 10 */
} // :cond_5
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).r ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->r()Z
if ( v0 != null) { // if-eqz v0, :cond_6
final String v0 = " removed"; // const-string v0, " removed"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 11 */
} // :cond_6
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).z ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->z()Z
if ( v0 != null) { // if-eqz v0, :cond_7
final String v0 = " ignored"; // const-string v0, " ignored"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 12 */
} // :cond_7
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).t ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->t()Z
if ( v0 != null) { // if-eqz v0, :cond_8
final String v0 = " tmpDetached"; // const-string v0, " tmpDetached"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 13 */
} // :cond_8
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).q ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->q()Z
/* if-nez v0, :cond_9 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = " not recyclable("; // const-string v2, " not recyclable("
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->m:I */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 14 */
} // :cond_9
v0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).m ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->m()Z
if ( v0 != null) { // if-eqz v0, :cond_a
final String v0 = " undefined adapter position"; // const-string v0, " undefined adapter position"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 15 */
} // :cond_a
v0 = this.a;
(( android.view.View ) v0 ).getParent ( ); // invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_b */
final String v0 = " no parent"; // const-string v0, " no parent"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_b
final String v0 = "}"; // const-string v0, "}"
/* .line 16 */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 17 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public Boolean u ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, 0x2 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean v ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, 0x2 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void w ( ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
int v1 = -1; // const/4 v1, -0x1
/* .line 2 */
/* iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* .line 3 */
/* iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->d:I */
/* const-wide/16 v2, -0x1 */
/* .line 4 */
/* iput-wide v2, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->e:J */
/* .line 5 */
/* iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->g:I */
/* .line 6 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->m:I */
int v2 = 0; // const/4 v2, 0x0
/* .line 7 */
this.h = v2;
/* .line 8 */
this.i = v2;
/* .line 9 */
(( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->b()V
/* .line 10 */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->p:I */
/* .line 11 */
/* iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->q:I */
/* .line 12 */
androidx.recyclerview.widget.RecyclerView .e ( p0 );
return;
} // .end method
public void x ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->d:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* .line 2 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->c:I */
/* iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->d:I */
} // :cond_0
return;
} // .end method
public Boolean y ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, 0x10 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean z ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit16 v0, v0, 0x80 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
