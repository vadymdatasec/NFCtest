public abstract class androidx.recyclerview.widget.RecyclerView$l {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "l" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Landroidx/recyclerview/widget/RecyclerView$l$b;, */
/* Landroidx/recyclerview/widget/RecyclerView$l$a; */
/* } */
} // .end annotation
/* # instance fields */
public androidx.recyclerview.widget.RecyclerView$l$a a;
public java.util.ArrayList b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList<", */
/* "Lc/r/d/d0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Long c;
public Long d;
public Long e;
public Long f;
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$l ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.b = v0;
/* const-wide/16 v0, 0x78 */
/* .line 4 */
/* iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->c:J */
/* .line 5 */
/* iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->d:J */
/* const-wide/16 v0, 0xfa */
/* .line 6 */
/* iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->e:J */
/* .line 7 */
/* iput-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->f:J */
return;
} // .end method
public static Integer e ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 3 */
/* .line 2 */
/* iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$d0;->j:I */
/* and-int/lit8 v0, v0, 0xe */
/* .line 3 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).p ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->p()Z
if ( v1 != null) { // if-eqz v1, :cond_0
int p0 = 4; // const/4 p0, 0x4
} // :cond_0
/* and-int/lit8 v1, v0, 0x4 */
/* if-nez v1, :cond_1 */
/* .line 4 */
v1 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).k ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->k()I
/* .line 5 */
p0 = (( androidx.recyclerview.widget.RecyclerView$d0 ) p0 ).g ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$d0;->g()I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_1 */
/* if-eq p0, v2, :cond_1 */
/* if-eq v1, p0, :cond_1 */
/* or-int/lit16 v0, v0, 0x800 */
} // :cond_1
} // .end method
/* # virtual methods */
public androidx.recyclerview.widget.RecyclerView$l$b a ( androidx.recyclerview.widget.RecyclerView$a0 p0, androidx.recyclerview.widget.RecyclerView$d0 p1 ) {
/* .locals 0 */
/* .line 3 */
(( androidx.recyclerview.widget.RecyclerView$l ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->h()Landroidx/recyclerview/widget/RecyclerView$l$b;
(( androidx.recyclerview.widget.RecyclerView$l$b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$l$b;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)Landroidx/recyclerview/widget/RecyclerView$l$b;
} // .end method
public androidx.recyclerview.widget.RecyclerView$l$b a ( androidx.recyclerview.widget.RecyclerView$a0 p0, androidx.recyclerview.widget.RecyclerView$d0 p1, Integer p2, java.util.List p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/recyclerview/widget/RecyclerView$a0;", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* "I", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Landroidx/recyclerview/widget/RecyclerView$l$b;" */
/* } */
} // .end annotation
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView$l ) p0 ).h ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$l;->h()Landroidx/recyclerview/widget/RecyclerView$l$b;
(( androidx.recyclerview.widget.RecyclerView$l$b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$l$b;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)Landroidx/recyclerview/widget/RecyclerView$l$b;
} // .end method
public final void a ( ) {
/* .locals 3 */
/* .line 5 */
v0 = this.b;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 6 */
v2 = this.b;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/r/d/d0; */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 7 */
} // :cond_0
v0 = this.b;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public void a ( androidx.recyclerview.widget.RecyclerView$l$a p0 ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
return;
} // .end method
public abstract Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
} // .end method
public abstract Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$d0 p1, androidx.recyclerview.widget.RecyclerView$l$b p2, androidx.recyclerview.widget.RecyclerView$l$b p3 ) {
} // .end method
public abstract Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$l$b p1, androidx.recyclerview.widget.RecyclerView$l$b p2 ) {
} // .end method
public Boolean a ( androidx.recyclerview.widget.RecyclerView$d0 p0, java.util.List p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroidx/recyclerview/widget/RecyclerView$d0;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Object;", */
/* ">;)Z" */
/* } */
} // .end annotation
/* .line 4 */
p1 = (( androidx.recyclerview.widget.RecyclerView$l ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
} // .end method
public abstract void b ( ) {
} // .end method
public final void b ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$l ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$l;->d(Landroidx/recyclerview/widget/RecyclerView$d0;)V
/* .line 2 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
return;
} // .end method
public abstract Boolean b ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$l$b p1, androidx.recyclerview.widget.RecyclerView$l$b p2 ) {
} // .end method
public Long c ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->c:J */
/* return-wide v0 */
} // .end method
public abstract void c ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
} // .end method
public abstract Boolean c ( androidx.recyclerview.widget.RecyclerView$d0 p0, androidx.recyclerview.widget.RecyclerView$l$b p1, androidx.recyclerview.widget.RecyclerView$l$b p2 ) {
} // .end method
public Long d ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->f:J */
/* return-wide v0 */
} // .end method
public void d ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 0 */
return;
} // .end method
public Long e ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->e:J */
/* return-wide v0 */
} // .end method
public Long f ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Landroidx/recyclerview/widget/RecyclerView$l;->d:J */
/* return-wide v0 */
} // .end method
public abstract Boolean g ( ) {
} // .end method
public androidx.recyclerview.widget.RecyclerView$l$b h ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Landroidx/recyclerview/widget/RecyclerView$l$b; */
/* invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView$l$b;-><init>()V */
} // .end method
public abstract void i ( ) {
} // .end method
