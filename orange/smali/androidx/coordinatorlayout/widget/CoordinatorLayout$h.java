public class androidx.coordinatorlayout.widget.CoordinatorLayout$h implements java.util.Comparator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/coordinatorlayout/widget/CoordinatorLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "h" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Ljava/util/Comparator<", */
/* "Landroid/view/View;", */
/* ">;" */
/* } */
} // .end annotation
/* # direct methods */
public androidx.coordinatorlayout.widget.CoordinatorLayout$h ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer a ( android.view.View p0, android.view.View p1 ) {
/* .locals 1 */
/* .line 1 */
p1 = c.h.n.v0 .x ( p1 );
/* .line 2 */
p2 = c.h.n.v0 .x ( p2 );
/* cmpl-float v0, p1, p2 */
/* if-lez v0, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
} // :cond_0
/* cmpg-float p1, p1, p2 */
/* if-gez p1, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/view/View; */
/* check-cast p2, Landroid/view/View; */
p1 = (( androidx.coordinatorlayout.widget.CoordinatorLayout$h ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$h;->a(Landroid/view/View;Landroid/view/View;)I
} // .end method
