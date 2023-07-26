public class androidx.viewpager.widget.ViewPager$n implements java.util.Comparator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/viewpager/widget/ViewPager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "n" */
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
public androidx.viewpager.widget.ViewPager$n ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Integer a ( android.view.View p0, android.view.View p1 ) {
/* .locals 2 */
/* .line 1 */
(( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p1, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 2 */
(( android.view.View ) p2 ).getLayoutParams ( ); // invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* check-cast p2, Landroidx/viewpager/widget/ViewPager$g; */
/* .line 3 */
/* iget-boolean v0, p1, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
/* iget-boolean v1, p2, Landroidx/viewpager/widget/ViewPager$g;->a:Z */
/* if-eq v0, v1, :cond_1 */
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = -1; // const/4 p1, -0x1
} // :goto_0
/* .line 4 */
} // :cond_1
/* iget p1, p1, Landroidx/viewpager/widget/ViewPager$g;->e:I */
/* iget p2, p2, Landroidx/viewpager/widget/ViewPager$g;->e:I */
/* sub-int/2addr p1, p2 */
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/view/View; */
/* check-cast p2, Landroid/view/View; */
p1 = (( androidx.viewpager.widget.ViewPager$n ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager$n;->a(Landroid/view/View;Landroid/view/View;)I
} // .end method
