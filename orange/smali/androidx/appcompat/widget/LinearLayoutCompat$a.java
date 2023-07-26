public class androidx.appcompat.widget.LinearLayoutCompat$a extends android.view.ViewGroup$MarginLayoutParams {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/LinearLayoutCompat; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public Float a;
public Integer b;
/* # direct methods */
public androidx.appcompat.widget.LinearLayoutCompat$a ( ) {
/* .locals 0 */
/* .line 8 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V */
int p1 = -1; // const/4 p1, -0x1
/* .line 9 */
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
int p1 = 0; // const/4 p1, 0x0
/* .line 10 */
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
return;
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat$a ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = -1; // const/4 v0, -0x1
/* .line 2 */
/* iput v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
/* .line 3 */
v1 = c.b.j.LinearLayoutCompat_Layout;
/* .line 4 */
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 5 */
int v1 = 0; // const/4 v1, 0x0
p2 = (( android.content.res.TypedArray ) p1 ).getFloat ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F
/* iput p2, p0, Landroidx/appcompat/widget/LinearLayoutCompat$a;->a:F */
/* .line 6 */
p2 = (( android.content.res.TypedArray ) p1 ).getInt ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput p2, p0, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
/* .line 7 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
public androidx.appcompat.widget.LinearLayoutCompat$a ( ) {
/* .locals 0 */
/* .line 11 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
int p1 = -1; // const/4 p1, -0x1
/* .line 12 */
/* iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat$a;->b:I */
return;
} // .end method
