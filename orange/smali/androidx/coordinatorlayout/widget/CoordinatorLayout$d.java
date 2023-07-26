public class androidx.coordinatorlayout.widget.CoordinatorLayout$d implements android.view.ViewGroup$OnHierarchyChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/coordinatorlayout/widget/CoordinatorLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "d" */
} // .end annotation
/* # instance fields */
public final androidx.coordinatorlayout.widget.CoordinatorLayout b; //synthetic
/* # direct methods */
public androidx.coordinatorlayout.widget.CoordinatorLayout$d ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onChildViewAdded ( android.view.View p0, android.view.View p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
} // :cond_0
return;
} // .end method
public void onChildViewRemoved ( android.view.View p0, android.view.View p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
int v1 = 2; // const/4 v1, 0x2
(( androidx.coordinatorlayout.widget.CoordinatorLayout ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->b(I)V
/* .line 2 */
v0 = this.b;
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
} // :cond_0
return;
} // .end method
