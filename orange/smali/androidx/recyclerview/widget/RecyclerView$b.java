public class androidx.recyclerview.widget.RecyclerView$b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.recyclerview.widget.RecyclerView b; //synthetic
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$b ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v0 = this.N;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( androidx.recyclerview.widget.RecyclerView$l ) v0 ).i ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$l;->i()V
	 /* .line 3 */
} // :cond_0
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->o0:Z */
return;
} // .end method
