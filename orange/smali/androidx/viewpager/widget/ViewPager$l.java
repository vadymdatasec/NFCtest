public class androidx.viewpager.widget.ViewPager$l extends android.database.DataSetObserver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/viewpager/widget/ViewPager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "l" */
} // .end annotation
/* # instance fields */
public final androidx.viewpager.widget.ViewPager a; //synthetic
/* # direct methods */
public androidx.viewpager.widget.ViewPager$l ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onChanged ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( androidx.viewpager.widget.ViewPager ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->a()V
return;
} // .end method
public void onInvalidated ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( androidx.viewpager.widget.ViewPager ) v0 ).a ( ); // invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->a()V
return;
} // .end method
