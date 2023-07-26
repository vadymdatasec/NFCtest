public abstract class c.b.k.a$a extends android.view.ViewGroup$MarginLayoutParams {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lc/b/k/a; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public Integer a;
/* # direct methods */
public c.b.k.a$a ( ) {
/* .locals 0 */
/* .line 6 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
/* iput p1, p0, Lc/b/k/a$a;->a:I */
/* const p1, 0x800013 */
/* .line 8 */
/* iput p1, p0, Lc/b/k/a$a;->a:I */
return;
} // .end method
public c.b.k.a$a ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Lc/b/k/a$a;->a:I */
/* .line 3 */
v1 = c.b.j.ActionBarLayout;
(( android.content.Context ) p1 ).obtainStyledAttributes ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 4 */
p2 = (( android.content.res.TypedArray ) p1 ).getInt ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I
/* iput p2, p0, Lc/b/k/a$a;->a:I */
/* .line 5 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
} // .end method
public c.b.k.a$a ( ) {
/* .locals 0 */
/* .line 12 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V */
int p1 = 0; // const/4 p1, 0x0
/* .line 13 */
/* iput p1, p0, Lc/b/k/a$a;->a:I */
return;
} // .end method
public c.b.k.a$a ( ) {
/* .locals 1 */
/* .line 9 */
/* invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
/* iput v0, p0, Lc/b/k/a$a;->a:I */
/* .line 11 */
/* iget p1, p1, Lc/b/k/a$a;->a:I */
/* iput p1, p0, Lc/b/k/a$a;->a:I */
return;
} // .end method
