public class androidx.recyclerview.widget.RecyclerView$a implements java.lang.Runnable {
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
public androidx.recyclerview.widget.RecyclerView$a ( ) {
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
/* iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->v:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
	 v0 = 	 (( android.view.ViewGroup ) v0 ).isLayoutRequested ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->isLayoutRequested()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
	 } // :cond_0
	 v0 = this.b;
	 /* iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->s:Z */
	 /* if-nez v1, :cond_1 */
	 /* .line 3 */
	 (( androidx.recyclerview.widget.RecyclerView ) v0 ).requestLayout ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V
	 return;
	 /* .line 4 */
} // :cond_1
/* iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->y:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 5 */
	 /* iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->x:Z */
	 return;
	 /* .line 6 */
} // :cond_2
(( androidx.recyclerview.widget.RecyclerView ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->c()V
} // :cond_3
} // :goto_0
return;
} // .end method
