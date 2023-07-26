public abstract class c.b.p.o.w implements c.b.p.o.c0 implements c.b.p.o.z implements android.widget.AdapterView$OnItemClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.graphics.Rect b;
	 /* # direct methods */
	 public c.b.p.o.w ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer a ( android.widget.ListAdapter p0, android.view.ViewGroup p1, android.content.Context p2, Integer p3 ) {
		 /* .locals 9 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 v1 = 		 android.view.View$MeasureSpec .makeMeasureSpec ( v0,v0 );
		 /* .line 3 */
		 v2 = 		 android.view.View$MeasureSpec .makeMeasureSpec ( v0,v0 );
		 v3 = 		 /* .line 4 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* move-object v7, v4 */
		 int v5 = 0; // const/4 v5, 0x0
		 int v6 = 0; // const/4 v6, 0x0
	 } // :goto_0
	 /* if-ge v0, v3, :cond_4 */
	 v8 = 	 /* .line 5 */
	 /* if-eq v8, v6, :cond_0 */
	 /* move-object v7, v4 */
	 /* move v6, v8 */
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 6 */
/* new-instance p1, Landroid/widget/FrameLayout; */
/* invoke-direct {p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
/* .line 7 */
} // :cond_1
/* .line 8 */
(( android.view.View ) v7 ).measure ( v1, v2 ); // invoke-virtual {v7, v1, v2}, Landroid/view/View;->measure(II)V
/* .line 9 */
v8 = (( android.view.View ) v7 ).getMeasuredWidth ( ); // invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I
/* if-lt v8, p3, :cond_2 */
} // :cond_2
/* if-le v8, v5, :cond_3 */
/* move v5, v8 */
} // :cond_3
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_4
} // .end method
public static c.b.p.o.l a ( android.widget.ListAdapter p0 ) {
/* .locals 1 */
/* .line 10 */
/* instance-of v0, p0, Landroid/widget/HeaderViewListAdapter; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
/* check-cast p0, Landroid/widget/HeaderViewListAdapter; */
(( android.widget.HeaderViewListAdapter ) p0 ).getWrappedAdapter ( ); // invoke-virtual {p0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;
/* check-cast p0, Lc/b/p/o/l; */
/* .line 12 */
} // :cond_0
/* check-cast p0, Lc/b/p/o/l; */
} // .end method
public static Boolean b ( Object p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = (( c.b.p.o.m ) p0 ).size ( ); // invoke-virtual {p0}, Lc/b/p/o/m;->size()I
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 2 */
(( c.b.p.o.m ) p0 ).getItem ( v2 ); // invoke-virtual {p0, v2}, Lc/b/p/o/m;->getItem(I)Landroid/view/MenuItem;
v4 = /* .line 3 */
if ( v4 != null) { // if-eqz v4, :cond_0
if ( v3 != null) { // if-eqz v3, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // :goto_1
} // .end method
/* # virtual methods */
public abstract void a ( Integer p0 ) {
} // .end method
public void a ( android.content.Context p0, Object p1 ) {
/* .locals 0 */
return;
} // .end method
public void a ( android.graphics.Rect p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
public abstract void a ( android.view.View p0 ) {
} // .end method
public abstract void a ( android.widget.PopupWindow$OnDismissListener p0 ) {
} // .end method
public abstract void a ( Object p0 ) {
} // .end method
public Boolean a ( Object p0, Object p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public abstract void b ( Integer p0 ) {
} // .end method
public abstract void b ( Boolean p0 ) {
} // .end method
public Boolean b ( Object p0, Object p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public abstract void c ( Integer p0 ) {
} // .end method
public abstract void c ( Boolean p0 ) {
} // .end method
public Boolean d ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public android.graphics.Rect e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public void onItemClick ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView<", */
/* "*>;", */
/* "Landroid/view/View;", */
/* "IJ)V" */
/* } */
} // .end annotation
/* .line 1 */
(( android.widget.AdapterView ) p1 ).getAdapter ( ); // invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;
/* check-cast p1, Landroid/widget/ListAdapter; */
/* .line 2 */
c.b.p.o.w .a ( p1 );
/* .line 3 */
p2 = this.b;
/* .line 4 */
/* check-cast p1, Landroid/view/MenuItem; */
/* .line 5 */
p3 = (( c.b.p.o.w ) p0 ).d ( ); // invoke-virtual {p0}, Lc/b/p/o/w;->d()Z
if ( p3 != null) { // if-eqz p3, :cond_0
int p3 = 0; // const/4 p3, 0x0
} // :cond_0
int p3 = 4; // const/4 p3, 0x4
/* .line 6 */
} // :goto_0
(( c.b.p.o.m ) p2 ).a ( p1, p0, p3 ); // invoke-virtual {p2, p1, p0, p3}, Lc/b/p/o/m;->a(Landroid/view/MenuItem;Lc/b/p/o/z;I)Z
return;
} // .end method
