public class androidx.appcompat.app.AlertController$RecycleListView extends android.widget.ListView {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/app/AlertController; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "RecycleListView" */
} // .end annotation
/* # instance fields */
public final Integer b;
public final Integer c;
/* # direct methods */
public androidx.appcompat.app.AlertController$RecycleListView ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, p1, v0}, Landroidx/appcompat/app/AlertController$RecycleListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
return;
} // .end method
public androidx.appcompat.app.AlertController$RecycleListView ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 3 */
v0 = c.b.j.RecycleListView;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 4 */
int v0 = -1; // const/4 v0, -0x1
p2 = (( android.content.res.TypedArray ) p1 ).getDimensionPixelOffset ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
/* iput p2, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->c:I */
/* .line 5 */
p1 = (( android.content.res.TypedArray ) p1 ).getDimensionPixelOffset ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
/* iput p1, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->b:I */
return;
} // .end method
/* # virtual methods */
public void a ( Boolean p0, Boolean p1 ) {
/* .locals 2 */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* if-nez p1, :cond_3 */
	 /* .line 1 */
} // :cond_0
v0 = (( android.widget.ListView ) p0 ).getPaddingLeft ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getPaddingLeft()I
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* .line 2 */
	 p1 = 	 (( android.widget.ListView ) p0 ).getPaddingTop ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getPaddingTop()I
} // :cond_1
/* iget p1, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->b:I */
/* .line 3 */
} // :goto_0
v1 = (( android.widget.ListView ) p0 ).getPaddingRight ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getPaddingRight()I
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 4 */
p2 = (( android.widget.ListView ) p0 ).getPaddingBottom ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getPaddingBottom()I
} // :cond_2
/* iget p2, p0, Landroidx/appcompat/app/AlertController$RecycleListView;->c:I */
/* .line 5 */
} // :goto_1
(( android.widget.ListView ) p0 ).setPadding ( v0, p1, v1, p2 ); // invoke-virtual {p0, v0, p1, v1, p2}, Landroid/widget/ListView;->setPadding(IIII)V
} // :cond_3
return;
} // .end method
