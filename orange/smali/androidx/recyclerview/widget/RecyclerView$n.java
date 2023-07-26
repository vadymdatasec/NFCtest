public abstract class androidx.recyclerview.widget.RecyclerView$n {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/recyclerview/widget/RecyclerView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "n" */
} // .end annotation
/* # direct methods */
public androidx.recyclerview.widget.RecyclerView$n ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( android.graphics.Canvas p0, androidx.recyclerview.widget.RecyclerView p1 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
return;
} // .end method
public void a ( android.graphics.Canvas p0, androidx.recyclerview.widget.RecyclerView p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
/* .locals 0 */
/* .line 1 */
(( androidx.recyclerview.widget.RecyclerView$n ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$n;->a(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V
return;
} // .end method
public void a ( android.graphics.Rect p0, Integer p1, androidx.recyclerview.widget.RecyclerView p2 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int p2 = 0; // const/4 p2, 0x0
/* .line 2 */
(( android.graphics.Rect ) p1 ).set ( p2, p2, p2, p2 ); // invoke-virtual {p1, p2, p2, p2, p2}, Landroid/graphics/Rect;->set(IIII)V
return;
} // .end method
public void a ( android.graphics.Rect p0, android.view.View p1, androidx.recyclerview.widget.RecyclerView p2, androidx.recyclerview.widget.RecyclerView$a0 p3 ) {
/* .locals 0 */
/* .line 3 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p2, Landroidx/recyclerview/widget/RecyclerView$p; */
p2 = (( androidx.recyclerview.widget.RecyclerView$p ) p2 ).a ( ); // invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I
(( androidx.recyclerview.widget.RecyclerView$n ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$n;->a(Landroid/graphics/Rect;ILandroidx/recyclerview/widget/RecyclerView;)V
return;
} // .end method
public abstract void b ( android.graphics.Canvas p0, androidx.recyclerview.widget.RecyclerView p1, androidx.recyclerview.widget.RecyclerView$a0 p2 ) {
} // .end method
