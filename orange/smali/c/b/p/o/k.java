public class c.b.p.o.k implements c.b.p.o.z implements android.widget.AdapterView$OnItemClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.content.Context b;
	 public android.view.LayoutInflater c;
	 public c.b.p.o.m d;
	 public androidx.appcompat.view.menu.ExpandedMenuView e;
	 public Integer f;
	 public Integer g;
	 public Integer h;
	 public c.b.p.o.z$a i;
	 public c.b.p.o.j j;
	 /* # direct methods */
	 public c.b.p.o.k ( ) {
		 /* .locals 0 */
		 /* .line 4 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 5 */
		 /* iput p1, p0, Lc/b/p/o/k;->h:I */
		 /* .line 6 */
		 /* iput p2, p0, Lc/b/p/o/k;->g:I */
		 return;
	 } // .end method
	 public c.b.p.o.k ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p2, v0}, Lc/b/p/o/k;-><init>(II)V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 android.view.LayoutInflater .from ( p1 );
		 this.c = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.widget.ListAdapter a ( ) {
		 /* .locals 1 */
		 /* .line 18 */
		 v0 = this.j;
		 /* if-nez v0, :cond_0 */
		 /* .line 19 */
		 /* new-instance v0, Lc/b/p/o/j; */
		 /* invoke-direct {v0, p0}, Lc/b/p/o/j;-><init>(Lc/b/p/o/k;)V */
		 this.j = v0;
		 /* .line 20 */
	 } // :cond_0
	 v0 = this.j;
} // .end method
public c.b.p.o.a0 a ( android.view.ViewGroup p0 ) {
	 /* .locals 3 */
	 /* .line 11 */
	 v0 = this.e;
	 /* if-nez v0, :cond_1 */
	 /* .line 12 */
	 v0 = this.c;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.view.LayoutInflater ) v0 ).inflate ( v1, p1, v2 ); // invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
	 /* check-cast p1, Landroidx/appcompat/view/menu/ExpandedMenuView; */
	 this.e = p1;
	 /* .line 13 */
	 p1 = this.j;
	 /* if-nez p1, :cond_0 */
	 /* .line 14 */
	 /* new-instance p1, Lc/b/p/o/j; */
	 /* invoke-direct {p1, p0}, Lc/b/p/o/j;-><init>(Lc/b/p/o/k;)V */
	 this.j = p1;
	 /* .line 15 */
} // :cond_0
p1 = this.e;
v0 = this.j;
(( android.widget.ListView ) p1 ).setAdapter ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V
/* .line 16 */
p1 = this.e;
(( android.widget.ListView ) p1 ).setOnItemClickListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
/* .line 17 */
} // :cond_1
p1 = this.e;
} // .end method
public void a ( android.content.Context p0, Object p1 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/b/p/o/k;->g:I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Landroid/view/ContextThemeWrapper; */
/* iget v1, p0, Lc/b/p/o/k;->g:I */
/* invoke-direct {v0, p1, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
this.b = v0;
/* .line 3 */
android.view.LayoutInflater .from ( v0 );
this.c = p1;
/* .line 4 */
} // :cond_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
this.b = p1;
/* .line 6 */
v0 = this.c;
/* if-nez v0, :cond_1 */
/* .line 7 */
android.view.LayoutInflater .from ( p1 );
this.c = p1;
/* .line 8 */
} // :cond_1
} // :goto_0
this.d = p2;
/* .line 9 */
p1 = this.j;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 10 */
(( c.b.p.o.j ) p1 ).notifyDataSetChanged ( ); // invoke-virtual {p1}, Lc/b/p/o/j;->notifyDataSetChanged()V
} // :cond_2
return;
} // .end method
public void a ( Object p0, Boolean p1 ) {
/* .locals 1 */
/* .line 27 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 28 */
} // :cond_0
return;
} // .end method
public void a ( c.b.p.o.z$a p0 ) {
/* .locals 0 */
/* .line 22 */
this.i = p1;
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .line 21 */
p1 = this.j;
if ( p1 != null) { // if-eqz p1, :cond_0
(( c.b.p.o.j ) p1 ).notifyDataSetChanged ( ); // invoke-virtual {p1}, Lc/b/p/o/j;->notifyDataSetChanged()V
} // :cond_0
return;
} // .end method
public Boolean a ( c.b.p.o.g0 p0 ) {
/* .locals 2 */
/* .line 23 */
v0 = (( c.b.p.o.m ) p1 ).hasVisibleItems ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->hasVisibleItems()Z
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 24 */
} // :cond_0
/* new-instance v0, Lc/b/p/o/n; */
/* invoke-direct {v0, p1}, Lc/b/p/o/n;-><init>(Lc/b/p/o/m;)V */
int v1 = 0; // const/4 v1, 0x0
(( c.b.p.o.n ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/n;->a(Landroid/os/IBinder;)V
/* .line 25 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 26 */
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( Object p0, Object p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean b ( Object p0, Object p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
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
p1 = this.d;
p2 = this.j;
(( c.b.p.o.j ) p2 ).getItem ( p3 ); // invoke-virtual {p2, p3}, Lc/b/p/o/j;->getItem(I)Lc/b/p/o/p;
int p3 = 0; // const/4 p3, 0x0
(( c.b.p.o.m ) p1 ).a ( p2, p0, p3 ); // invoke-virtual {p1, p2, p0, p3}, Lc/b/p/o/m;->a(Landroid/view/MenuItem;Lc/b/p/o/z;I)Z
return;
} // .end method
