public class androidx.recyclerview.widget.RecyclerView$x extends androidx.recyclerview.widget.RecyclerView$i {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "x" */
} // .end annotation
/* # instance fields */
public final androidx.recyclerview.widget.RecyclerView a; //synthetic
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$x ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$i;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( androidx.recyclerview.widget.RecyclerView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->a(Ljava/lang/String;)V
/* .line 2 */
v0 = this.a;
v1 = this.i0;
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView$a0;->g:Z */
/* .line 3 */
(( androidx.recyclerview.widget.RecyclerView ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->b(Z)V
/* .line 4 */
v0 = this.a;
v0 = this.e;
v0 = (( c.r.d.a ) v0 ).c ( ); // invoke-virtual {v0}, Lc/r/d/a;->c()Z
/* if-nez v0, :cond_0 */
/* .line 5 */
v0 = this.a;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V
} // :cond_0
return;
} // .end method
public void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
/* .locals 2 */
/* .line 6 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( androidx.recyclerview.widget.RecyclerView ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->a(Ljava/lang/String;)V
/* .line 7 */
v0 = this.a;
v0 = this.e;
p1 = (( c.r.d.a ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/r/d/a;->a(IILjava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 8 */
(( androidx.recyclerview.widget.RecyclerView$x ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$x;->b()V
} // :cond_0
return;
} // .end method
public void b ( ) {
/* .locals 2 */
/* .line 1 */
/* sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->C0:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
/* iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->t:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->s:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 2 */
		 v1 = this.i;
		 c.h.n.v0 .a ( v0,v1 );
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.a;
	 int v1 = 1; // const/4 v1, 0x1
	 /* iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Z */
	 /* .line 4 */
	 (( androidx.recyclerview.widget.RecyclerView ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V
} // :goto_0
return;
} // .end method
