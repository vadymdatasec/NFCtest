public class inal extends android.widget.ListView implements c.b.p.o.m$b implements c.b.p.o.a0 implements android.widget.AdapterView$OnItemClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final d;
	 /* # instance fields */
	 public c.b.p.o.m b;
	 public Integer c;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 1 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [I */
		 /* .line 1 */
		 /* fill-array-data v0, :array_0 */
		 return;
		 /* nop */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* 0x10100d4 */
		 /* 0x1010129 */
	 } // .end array-data
} // .end method
public inal ( ) {
	 /* .locals 1 */
	 /* const v0, 0x1010074 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/view/menu/ExpandedMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 return;
} // .end method
public inal ( ) {
	 /* .locals 2 */
	 /* .line 2 */
	 /* invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 /* .line 3 */
	 (( android.widget.ListView ) p0 ).setOnItemClickListener ( p0 ); // invoke-virtual {p0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
	 /* .line 4 */
	 v0 = androidx.appcompat.view.menu.ExpandedMenuView.d;
	 int v1 = 0; // const/4 v1, 0x0
	 c.b.q.k2 .a ( p1,p2,v0,p3,v1 );
	 /* .line 5 */
	 p2 = 	 (( c.b.q.k2 ) p1 ).g ( v1 ); // invoke-virtual {p1, v1}, Lc/b/q/k2;->g(I)Z
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 6 */
		 (( c.b.q.k2 ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
		 (( android.widget.ListView ) p0 ).setBackgroundDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/ListView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
	 } // :cond_0
	 int p2 = 1; // const/4 p2, 0x1
	 /* .line 7 */
	 p3 = 	 (( c.b.q.k2 ) p1 ).g ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z
	 if ( p3 != null) { // if-eqz p3, :cond_1
		 /* .line 8 */
		 (( c.b.q.k2 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;
		 (( android.widget.ListView ) p0 ).setDivider ( p2 ); // invoke-virtual {p0, p2}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V
		 /* .line 9 */
	 } // :cond_1
	 (( c.b.q.k2 ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/q/k2;->a()V
	 return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.b = p1;
	 return;
} // .end method
public Boolean a ( Object p0 ) {
	 /* .locals 2 */
	 /* .line 2 */
	 v0 = this.b;
	 int v1 = 0; // const/4 v1, 0x0
	 p1 = 	 (( c.b.p.o.m ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/b/p/o/m;->a(Landroid/view/MenuItem;I)Z
} // .end method
public Integer getWindowAnimations ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Landroidx/appcompat/view/menu/ExpandedMenuView;->c:I */
} // .end method
public void onDetachedFromWindow ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 (( android.widget.ListView ) p0 ).setChildrenDrawingCacheEnabled ( v0 ); // invoke-virtual {p0, v0}, Landroid/widget/ListView;->setChildrenDrawingCacheEnabled(Z)V
	 return;
} // .end method
public void onItemClick ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 (( android.widget.ListView ) p0 ).getAdapter ( ); // invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;
	 /* check-cast p1, Lc/b/p/o/p; */
	 (( androidx.appcompat.view.menu.ExpandedMenuView ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/ExpandedMenuView;->a(Lc/b/p/o/p;)Z
	 return;
} // .end method
