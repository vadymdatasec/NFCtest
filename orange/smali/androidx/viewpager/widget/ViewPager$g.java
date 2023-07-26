public class androidx.viewpager.widget.ViewPager$g extends android.view.ViewGroup$LayoutParams {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/viewpager/widget/ViewPager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "g" */
} // .end annotation
/* # instance fields */
public Boolean a;
public Integer b;
public Float c;
public Boolean d;
public Integer e;
public Integer f;
/* # direct methods */
public androidx.viewpager.widget.ViewPager$g ( ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1 */
/* invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager$g;->c:F */
return;
} // .end method
public androidx.viewpager.widget.ViewPager$g ( ) {
/* .locals 1 */
/* .line 3 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput v0, p0, Landroidx/viewpager/widget/ViewPager$g;->c:F */
/* .line 5 */
v0 = androidx.viewpager.widget.ViewPager.g0;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
int p2 = 0; // const/4 p2, 0x0
/* const/16 v0, 0x30 */
/* .line 6 */
p2 = (( android.content.res.TypedArray ) p1 ).getInteger ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I
/* iput p2, p0, Landroidx/viewpager/widget/ViewPager$g;->b:I */
/* .line 7 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
