public class c.b.q.r1 extends c.b.q.d1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer p;
	 public final Integer q;
	 public c.b.q.q1 r;
	 public android.view.MenuItem s;
	 /* # direct methods */
	 public c.b.q.r1 ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lc/b/q/d1;-><init>(Landroid/content/Context;Z)V */
		 /* .line 2 */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 /* .line 3 */
		 (( android.content.res.Resources ) p1 ).getConfiguration ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
		 /* .line 4 */
		 /* const/16 v0, 0x15 */
		 /* const/16 v1, 0x16 */
		 /* const/16 v2, 0x11 */
		 /* if-lt p2, v2, :cond_0 */
		 int p2 = 1; // const/4 p2, 0x1
		 /* .line 5 */
		 p1 = 		 (( android.content.res.Configuration ) p1 ).getLayoutDirection ( ); // invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I
		 /* if-ne p2, p1, :cond_0 */
		 /* .line 6 */
		 /* iput v0, p0, Lc/b/q/r1;->p:I */
		 /* .line 7 */
		 /* iput v1, p0, Lc/b/q/r1;->q:I */
		 /* .line 8 */
	 } // :cond_0
	 /* iput v1, p0, Lc/b/q/r1;->p:I */
	 /* .line 9 */
	 /* iput v0, p0, Lc/b/q/r1;->q:I */
} // :goto_0
return;
} // .end method
/* # virtual methods */
public Boolean onHoverEvent ( android.view.MotionEvent p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 2 */
	 (( android.widget.ListView ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;
	 /* .line 3 */
	 /* instance-of v1, v0, Landroid/widget/HeaderViewListAdapter; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 4 */
		 /* check-cast v0, Landroid/widget/HeaderViewListAdapter; */
		 /* .line 5 */
		 v1 = 		 (( android.widget.HeaderViewListAdapter ) v0 ).getHeadersCount ( ); // invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I
		 /* .line 6 */
		 (( android.widget.HeaderViewListAdapter ) v0 ).getWrappedAdapter ( ); // invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;
		 /* check-cast v0, Lc/b/p/o/l; */
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 7 */
	 /* check-cast v0, Lc/b/p/o/l; */
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
/* .line 8 */
v3 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* const/16 v4, 0xa */
/* if-eq v3, v4, :cond_1 */
/* .line 9 */
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v3, v3 */
v4 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v4, v4 */
v3 = (( android.widget.ListView ) p0 ).pointToPosition ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Landroid/widget/ListView;->pointToPosition(II)I
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_1 */
/* sub-int/2addr v3, v1 */
/* if-ltz v3, :cond_1 */
/* .line 10 */
v1 = (( c.b.p.o.l ) v0 ).getCount ( ); // invoke-virtual {v0}, Lc/b/p/o/l;->getCount()I
/* if-ge v3, v1, :cond_1 */
/* .line 11 */
(( c.b.p.o.l ) v0 ).getItem ( v3 ); // invoke-virtual {v0, v3}, Lc/b/p/o/l;->getItem(I)Lc/b/p/o/p;
/* .line 12 */
} // :cond_1
v1 = this.s;
/* if-eq v1, v2, :cond_3 */
/* .line 13 */
(( c.b.p.o.l ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/o/l;->b()Lc/b/p/o/m;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 14 */
v3 = this.r;
/* .line 15 */
} // :cond_2
this.s = v2;
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 16 */
v1 = this.r;
/* .line 17 */
} // :cond_3
p1 = /* invoke-super {p0, p1}, Lc/b/q/d1;->onHoverEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 4 */
/* .line 1 */
(( android.widget.ListView ) p0 ).getSelectedView ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getSelectedView()Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/view/menu/ListMenuItemView; */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* iget v2, p0, Lc/b/q/r1;->p:I */
/* if-ne p1, v2, :cond_1 */
/* .line 3 */
p1 = (( android.widget.LinearLayout ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/widget/LinearLayout;->isEnabled()Z
if ( p1 != null) { // if-eqz p1, :cond_0
	 (( androidx.appcompat.view.menu.ListMenuItemView ) v0 ).getItemData ( ); // invoke-virtual {v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getItemData()Lc/b/p/o/p;
	 p1 = 	 (( c.b.p.o.p ) p1 ).hasSubMenu ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->hasSubMenu()Z
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 4 */
		 p1 = 		 (( android.widget.ListView ) p0 ).getSelectedItemPosition ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getSelectedItemPosition()I
		 /* .line 5 */
		 (( android.widget.ListView ) p0 ).getSelectedItemId ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getSelectedItemId()J
		 /* move-result-wide v2 */
		 /* .line 6 */
		 (( android.widget.ListView ) p0 ).performItemClick ( v0, p1, v2, v3 ); // invoke-virtual {p0, v0, p1, v2, v3}, Landroid/widget/ListView;->performItemClick(Landroid/view/View;IJ)Z
	 } // :cond_0
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 7 */
	 /* iget v0, p0, Lc/b/q/r1;->q:I */
	 /* if-ne p1, v0, :cond_2 */
	 int p1 = -1; // const/4 p1, -0x1
	 /* .line 8 */
	 (( android.widget.ListView ) p0 ).setSelection ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ListView;->setSelection(I)V
	 /* .line 9 */
	 (( android.widget.ListView ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;
	 /* check-cast p1, Lc/b/p/o/l; */
	 (( c.b.p.o.l ) p1 ).b ( ); // invoke-virtual {p1}, Lc/b/p/o/l;->b()Lc/b/p/o/m;
	 int p2 = 0; // const/4 p2, 0x0
	 (( c.b.p.o.m ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/b/p/o/m;->a(Z)V
	 /* .line 10 */
} // :cond_2
p1 = /* invoke-super {p0, p1, p2}, Landroid/widget/ListView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public void setHoverListener ( c.b.q.q1 p0 ) {
/* .locals 0 */
/* .line 1 */
this.r = p1;
return;
} // .end method
public void setSelector ( android.graphics.drawable.Drawable p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/q/d1;->setSelector(Landroid/graphics/drawable/Drawable;)V */
return;
} // .end method
