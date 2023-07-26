public class androidx.recyclerview.widget.RecyclerView$l$b {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView$l; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # instance fields */
public Integer a;
public Integer b;
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$l$b ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public androidx.recyclerview.widget.RecyclerView$l$b a ( androidx.recyclerview.widget.RecyclerView$d0 p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$l$b ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$l$b;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroidx/recyclerview/widget/RecyclerView$l$b;
} // .end method
public androidx.recyclerview.widget.RecyclerView$l$b a ( androidx.recyclerview.widget.RecyclerView$d0 p0, Integer p1 ) {
/* .locals 0 */
/* .line 2 */
p1 = this.a;
/* .line 3 */
p2 = (( android.view.View ) p1 ).getLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getLeft()I
/* iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$l$b;->a:I */
/* .line 4 */
p2 = (( android.view.View ) p1 ).getTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getTop()I
/* iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$l$b;->b:I */
/* .line 5 */
(( android.view.View ) p1 ).getRight ( ); // invoke-virtual {p1}, Landroid/view/View;->getRight()I
/* .line 6 */
(( android.view.View ) p1 ).getBottom ( ); // invoke-virtual {p1}, Landroid/view/View;->getBottom()I
} // .end method
