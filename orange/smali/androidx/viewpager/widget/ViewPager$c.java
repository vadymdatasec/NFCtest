public class androidx.viewpager.widget.ViewPager$c implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/viewpager/widget/ViewPager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.viewpager.widget.ViewPager b; //synthetic
/* # direct methods */
public androidx.viewpager.widget.ViewPager$c ( ) {
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
int v1 = 0; // const/4 v1, 0x0
(( androidx.viewpager.widget.ViewPager ) v0 ).setScrollState ( v1 ); // invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V
/* .line 2 */
v0 = this.b;
(( androidx.viewpager.widget.ViewPager ) v0 ).g ( ); // invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->g()V
return;
} // .end method
