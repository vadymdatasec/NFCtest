public class inal extends c.b.p.o.w implements c.b.p.o.z implements android.view.View$OnKeyListener implements android.widget.PopupWindow$OnDismissListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer C;
	 /* # instance fields */
	 public android.widget.PopupWindow$OnDismissListener A;
	 public Boolean B;
	 public final android.content.Context c;
	 public final Integer d;
	 public final Integer e;
	 public final Integer f;
	 public final Boolean g;
	 public final android.os.Handler h;
	 public final java.util.List i;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Lc/b/p/o/m;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.List j;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Lc/b/p/o/h;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final android.view.ViewTreeObserver$OnGlobalLayoutListener k;
public final android.view.View$OnAttachStateChangeListener l;
public final c.b.q.q1 m;
public Integer n;
public Integer o;
public android.view.View p;
public android.view.View q;
public Integer r;
public Boolean s;
public Boolean t;
public Integer u;
public Integer v;
public Boolean w;
public Boolean x;
public c.b.p.o.z$a y;
public android.view.ViewTreeObserver z;
/* # direct methods */
public static inal ( ) {
/* .locals 1 */
/* .line 1 */
return;
} // .end method
public inal ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lc/b/p/o/w;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.i = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.j = v0;
/* .line 4 */
/* new-instance v0, Lc/b/p/o/d; */
/* invoke-direct {v0, p0}, Lc/b/p/o/d;-><init>(Lc/b/p/o/i;)V */
this.k = v0;
/* .line 5 */
/* new-instance v0, Lc/b/p/o/e; */
/* invoke-direct {v0, p0}, Lc/b/p/o/e;-><init>(Lc/b/p/o/i;)V */
this.l = v0;
/* .line 6 */
/* new-instance v0, Lc/b/p/o/g; */
/* invoke-direct {v0, p0}, Lc/b/p/o/g;-><init>(Lc/b/p/o/i;)V */
this.m = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
/* iput v0, p0, Lc/b/p/o/i;->n:I */
/* .line 8 */
/* iput v0, p0, Lc/b/p/o/i;->o:I */
/* .line 9 */
this.c = p1;
/* .line 10 */
this.p = p2;
/* .line 11 */
/* iput p3, p0, Lc/b/p/o/i;->e:I */
/* .line 12 */
/* iput p4, p0, Lc/b/p/o/i;->f:I */
/* .line 13 */
/* iput-boolean p5, p0, Lc/b/p/o/i;->g:Z */
/* .line 14 */
/* iput-boolean v0, p0, Lc/b/p/o/i;->w:Z */
/* .line 15 */
p2 = (( c.b.p.o.i ) p0 ).h ( ); // invoke-virtual {p0}, Lc/b/p/o/i;->h()I
/* iput p2, p0, Lc/b/p/o/i;->r:I */
/* .line 16 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 17 */
(( android.content.res.Resources ) p1 ).getDisplayMetrics ( ); // invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I */
/* div-int/lit8 p2, p2, 0x2 */
/* .line 18 */
p1 = (( android.content.res.Resources ) p1 ).getDimensionPixelSize ( p3 ); // invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
/* .line 19 */
p1 = java.lang.Math .max ( p2,p1 );
/* iput p1, p0, Lc/b/p/o/i;->d:I */
/* .line 20 */
/* new-instance p1, Landroid/os/Handler; */
/* invoke-direct {p1}, Landroid/os/Handler;-><init>()V */
this.h = p1;
return;
} // .end method
/* # virtual methods */
public final android.view.MenuItem a ( Object p0, Object p1 ) {
/* .locals 4 */
/* .line 14 */
v0 = (( c.b.p.o.m ) p1 ).size ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 15 */
(( c.b.p.o.m ) p1 ).getItem ( v1 ); // invoke-virtual {p1, v1}, Lc/b/p/o/m;->getItem(I)Landroid/view/MenuItem;
v3 = /* .line 16 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* if-ne p2, v3, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final android.view.View a ( Object p0, Object p1 ) {
/* .locals 7 */
/* .line 17 */
v0 = this.b;
(( c.b.p.o.i ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lc/b/p/o/i;->a(Lc/b/p/o/m;Lc/b/p/o/m;)Landroid/view/MenuItem;
int v0 = 0; // const/4 v0, 0x0
/* if-nez p2, :cond_0 */
/* .line 18 */
} // :cond_0
(( c.b.p.o.h ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/p/o/h;->a()Landroid/widget/ListView;
/* .line 19 */
(( android.widget.ListView ) p1 ).getAdapter ( ); // invoke-virtual {p1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;
/* .line 20 */
/* instance-of v2, v1, Landroid/widget/HeaderViewListAdapter; */
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 21 */
/* check-cast v1, Landroid/widget/HeaderViewListAdapter; */
/* .line 22 */
v2 = (( android.widget.HeaderViewListAdapter ) v1 ).getHeadersCount ( ); // invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I
/* .line 23 */
(( android.widget.HeaderViewListAdapter ) v1 ).getWrappedAdapter ( ); // invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;
/* check-cast v1, Lc/b/p/o/l; */
/* .line 24 */
} // :cond_1
/* check-cast v1, Lc/b/p/o/l; */
int v2 = 0; // const/4 v2, 0x0
/* .line 25 */
} // :goto_0
v4 = (( c.b.p.o.l ) v1 ).getCount ( ); // invoke-virtual {v1}, Lc/b/p/o/l;->getCount()I
} // :goto_1
int v5 = -1; // const/4 v5, -0x1
/* if-ge v3, v4, :cond_3 */
/* .line 26 */
(( c.b.p.o.l ) v1 ).getItem ( v3 ); // invoke-virtual {v1, v3}, Lc/b/p/o/l;->getItem(I)Lc/b/p/o/p;
/* if-ne p2, v6, :cond_2 */
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
int v3 = -1; // const/4 v3, -0x1
} // :goto_2
/* if-ne v3, v5, :cond_4 */
} // :cond_4
/* add-int/2addr v3, v2 */
/* .line 27 */
p2 = (( android.widget.ListView ) p1 ).getFirstVisiblePosition ( ); // invoke-virtual {p1}, Landroid/widget/ListView;->getFirstVisiblePosition()I
/* sub-int/2addr v3, p2 */
/* if-ltz v3, :cond_6 */
/* .line 28 */
p2 = (( android.widget.ListView ) p1 ).getChildCount ( ); // invoke-virtual {p1}, Landroid/widget/ListView;->getChildCount()I
/* if-lt v3, p2, :cond_5 */
/* .line 29 */
} // :cond_5
(( android.widget.ListView ) p1 ).getChildAt ( v3 ); // invoke-virtual {p1, v3}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
} // :cond_6
} // :goto_3
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = (( c.b.p.o.i ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/p/o/i;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
v0 = this.i;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lc/b/p/o/m; */
/* .line 3 */
(( c.b.p.o.i ) p0 ).d ( v1 ); // invoke-virtual {p0, v1}, Lc/b/p/o/i;->d(Lc/b/p/o/m;)V
/* .line 4 */
} // :cond_1
v0 = this.i;
/* .line 5 */
v0 = this.p;
this.q = v0;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 6 */
v0 = this.z;
/* if-nez v0, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
} // :goto_1
v1 = this.q;
(( android.view.View ) v1 ).getViewTreeObserver ( ); // invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
this.z = v1;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 8 */
v0 = this.k;
(( android.view.ViewTreeObserver ) v1 ).addOnGlobalLayoutListener ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
/* .line 9 */
} // :cond_3
v0 = this.q;
v1 = this.l;
(( android.view.View ) v0 ).addOnAttachStateChangeListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
} // :cond_4
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 64 */
/* iget v0, p0, Lc/b/p/o/i;->n:I */
/* if-eq v0, p1, :cond_0 */
/* .line 65 */
/* iput p1, p0, Lc/b/p/o/i;->n:I */
/* .line 66 */
v0 = this.p;
/* .line 67 */
v0 = c.h.n.v0 .o ( v0 );
/* .line 68 */
p1 = c.h.n.i .a ( p1,v0 );
/* iput p1, p0, Lc/b/p/o/i;->o:I */
} // :cond_0
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 69 */
v0 = this.p;
/* if-eq v0, p1, :cond_0 */
/* .line 70 */
this.p = p1;
/* .line 71 */
/* iget v0, p0, Lc/b/p/o/i;->n:I */
/* .line 72 */
p1 = c.h.n.v0 .o ( p1 );
/* .line 73 */
p1 = c.h.n.i .a ( v0,p1 );
/* iput p1, p0, Lc/b/p/o/i;->o:I */
} // :cond_0
return;
} // .end method
public void a ( android.widget.PopupWindow$OnDismissListener p0 ) {
/* .locals 0 */
/* .line 74 */
this.A = p1;
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.c;
(( c.b.p.o.m ) p1 ).a ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Lc/b/p/o/m;->a(Lc/b/p/o/z;Landroid/content/Context;)V
/* .line 11 */
v0 = (( c.b.p.o.i ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/p/o/i;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
(( c.b.p.o.i ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/i;->d(Lc/b/p/o/m;)V
/* .line 13 */
} // :cond_0
v0 = this.i;
} // :goto_0
return;
} // .end method
public void a ( Object p0, Boolean p1 ) {
/* .locals 5 */
/* .line 40 */
v0 = (( c.b.p.o.i ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/i;->c(Lc/b/p/o/m;)I
/* if-gez v0, :cond_0 */
return;
} // :cond_0
/* add-int/lit8 v1, v0, 0x1 */
/* .line 41 */
v2 = v2 = this.j;
int v3 = 0; // const/4 v3, 0x0
/* if-ge v1, v2, :cond_1 */
/* .line 42 */
v2 = this.j;
/* check-cast v1, Lc/b/p/o/h; */
/* .line 43 */
v1 = this.b;
(( c.b.p.o.m ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lc/b/p/o/m;->a(Z)V
/* .line 44 */
} // :cond_1
v1 = this.j;
/* check-cast v0, Lc/b/p/o/h; */
/* .line 45 */
v1 = this.b;
(( c.b.p.o.m ) v1 ).b ( p0 ); // invoke-virtual {v1, p0}, Lc/b/p/o/m;->b(Lc/b/p/o/z;)V
/* .line 46 */
/* iget-boolean v1, p0, Lc/b/p/o/i;->B:Z */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 47 */
v1 = this.a;
(( c.b.q.s1 ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Lc/b/q/s1;->b(Ljava/lang/Object;)V
/* .line 48 */
v1 = this.a;
(( c.b.q.p1 ) v1 ).d ( v3 ); // invoke-virtual {v1, v3}, Lc/b/q/p1;->d(I)V
/* .line 49 */
} // :cond_2
v0 = this.a;
(( c.b.q.p1 ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lc/b/q/p1;->dismiss()V
/* .line 50 */
v0 = v0 = this.j;
/* if-lez v0, :cond_3 */
/* .line 51 */
v1 = this.j;
/* add-int/lit8 v4, v0, -0x1 */
/* check-cast v1, Lc/b/p/o/h; */
/* iget v1, v1, Lc/b/p/o/h;->c:I */
/* iput v1, p0, Lc/b/p/o/i;->r:I */
/* .line 52 */
} // :cond_3
v1 = (( c.b.p.o.i ) p0 ).h ( ); // invoke-virtual {p0}, Lc/b/p/o/i;->h()I
/* iput v1, p0, Lc/b/p/o/i;->r:I */
} // :goto_0
/* if-nez v0, :cond_7 */
/* .line 53 */
(( c.b.p.o.i ) p0 ).dismiss ( ); // invoke-virtual {p0}, Lc/b/p/o/i;->dismiss()V
/* .line 54 */
p2 = this.y;
if ( p2 != null) { // if-eqz p2, :cond_4
int v0 = 1; // const/4 v0, 0x1
/* .line 55 */
/* .line 56 */
} // :cond_4
p1 = this.z;
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 57 */
p1 = (( android.view.ViewTreeObserver ) p1 ).isAlive ( ); // invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 58 */
p1 = this.z;
p2 = this.k;
(( android.view.ViewTreeObserver ) p1 ).removeGlobalOnLayoutListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
/* .line 59 */
} // :cond_5
this.z = v2;
/* .line 60 */
} // :cond_6
p1 = this.q;
p2 = this.l;
(( android.view.View ) p1 ).removeOnAttachStateChangeListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
/* .line 61 */
p1 = this.A;
} // :cond_7
if ( p2 != null) { // if-eqz p2, :cond_8
/* .line 62 */
p1 = this.j;
/* check-cast p1, Lc/b/p/o/h; */
/* .line 63 */
p1 = this.b;
(( c.b.p.o.m ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Lc/b/p/o/m;->a(Z)V
} // :cond_8
} // :goto_1
return;
} // .end method
public void a ( c.b.p.o.z$a p0 ) {
/* .locals 0 */
/* .line 32 */
this.y = p1;
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 30 */
p1 = this.j;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Lc/b/p/o/h; */
/* .line 31 */
(( c.b.p.o.h ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/o/h;->a()Landroid/widget/ListView;
(( android.widget.ListView ) v0 ).getAdapter ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;
c.b.p.o.w .a ( v0 );
(( c.b.p.o.l ) v0 ).notifyDataSetChanged ( ); // invoke-virtual {v0}, Lc/b/p/o/l;->notifyDataSetChanged()V
} // :cond_0
return;
} // .end method
public Boolean a ( c.b.p.o.g0 p0 ) {
/* .locals 4 */
/* .line 33 */
v0 = this.j;
v1 = } // :cond_0
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lc/b/p/o/h; */
/* .line 34 */
v3 = this.b;
/* if-ne p1, v3, :cond_0 */
/* .line 35 */
(( c.b.p.o.h ) v1 ).a ( ); // invoke-virtual {v1}, Lc/b/p/o/h;->a()Landroid/widget/ListView;
(( android.widget.ListView ) p1 ).requestFocus ( ); // invoke-virtual {p1}, Landroid/widget/ListView;->requestFocus()Z
/* .line 36 */
} // :cond_1
v0 = (( c.b.p.o.m ) p1 ).hasVisibleItems ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->hasVisibleItems()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 37 */
(( c.b.p.o.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/i;->a(Lc/b/p/o/m;)V
/* .line 38 */
v0 = this.y;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 39 */
} // :cond_2
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void b ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Lc/b/p/o/i;->s:Z */
/* .line 4 */
/* iput p1, p0, Lc/b/p/o/i;->u:I */
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lc/b/p/o/i;->w:Z */
return;
} // .end method
public Boolean b ( ) {
/* .locals 2 */
/* .line 2 */
v0 = v0 = this.j;
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_0 */
v0 = this.j;
/* check-cast v0, Lc/b/p/o/h; */
v0 = this.a;
v0 = (( c.b.q.p1 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/q/p1;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
public final Integer c ( Object p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = v0 = this.j;
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 2 */
v2 = this.j;
/* check-cast v2, Lc/b/p/o/h; */
/* .line 3 */
v2 = this.b;
/* if-ne p1, v2, :cond_0 */
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int p1 = -1; // const/4 p1, -0x1
} // .end method
public void c ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Lc/b/p/o/i;->t:Z */
/* .line 5 */
/* iput p1, p0, Lc/b/p/o/i;->v:I */
return;
} // .end method
public void c ( Boolean p0 ) {
/* .locals 0 */
/* .line 6 */
/* iput-boolean p1, p0, Lc/b/p/o/i;->x:Z */
return;
} // .end method
public Boolean c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Integer d ( Integer p0 ) {
/* .locals 6 */
/* .line 1 */
v1 = v0 = this.j;
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* check-cast v0, Lc/b/p/o/h; */
(( c.b.p.o.h ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/o/h;->a()Landroid/widget/ListView;
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [I */
/* .line 2 */
(( android.widget.ListView ) v0 ).getLocationOnScreen ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ListView;->getLocationOnScreen([I)V
/* .line 3 */
/* new-instance v3, Landroid/graphics/Rect; */
/* invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V */
/* .line 4 */
v4 = this.q;
(( android.view.View ) v4 ).getWindowVisibleDisplayFrame ( v3 ); // invoke-virtual {v4, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
/* .line 5 */
/* iget v4, p0, Lc/b/p/o/i;->r:I */
int v5 = 0; // const/4 v5, 0x0
/* if-ne v4, v2, :cond_1 */
/* .line 6 */
/* aget v1, v1, v5 */
v0 = (( android.widget.ListView ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/widget/ListView;->getWidth()I
/* add-int/2addr v1, v0 */
/* add-int/2addr v1, p1 */
/* .line 7 */
/* iget p1, v3, Landroid/graphics/Rect;->right:I */
/* if-le v1, p1, :cond_0 */
} // :cond_0
/* .line 8 */
} // :cond_1
/* aget v0, v1, v5 */
/* sub-int/2addr v0, p1 */
/* if-gez v0, :cond_2 */
} // :cond_2
} // .end method
public final void d ( Object p0 ) {
/* .locals 14 */
/* .line 9 */
v0 = this.c;
android.view.LayoutInflater .from ( v0 );
/* .line 10 */
/* new-instance v1, Lc/b/p/o/l; */
/* iget-boolean v2, p0, Lc/b/p/o/i;->g:Z */
/* invoke-direct {v1, p1, v0, v2, v3}, Lc/b/p/o/l;-><init>(Lc/b/p/o/m;Landroid/view/LayoutInflater;ZI)V */
/* .line 11 */
v2 = (( c.b.p.o.i ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/p/o/i;->b()Z
int v3 = 1; // const/4 v3, 0x1
/* if-nez v2, :cond_0 */
/* iget-boolean v2, p0, Lc/b/p/o/i;->w:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 12 */
(( c.b.p.o.l ) v1 ).a ( v3 ); // invoke-virtual {v1, v3}, Lc/b/p/o/l;->a(Z)V
/* .line 13 */
} // :cond_0
v2 = (( c.b.p.o.i ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/p/o/i;->b()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 14 */
v2 = c.b.p.o.w .b ( p1 );
(( c.b.p.o.l ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/b/p/o/l;->a(Z)V
/* .line 15 */
} // :cond_1
} // :goto_0
v2 = this.c;
/* iget v4, p0, Lc/b/p/o/i;->d:I */
int v5 = 0; // const/4 v5, 0x0
v2 = c.b.p.o.w .a ( v1,v5,v2,v4 );
/* .line 16 */
(( c.b.p.o.i ) p0 ).f ( ); // invoke-virtual {p0}, Lc/b/p/o/i;->f()Lc/b/q/s1;
/* .line 17 */
(( c.b.q.p1 ) v4 ).a ( v1 ); // invoke-virtual {v4, v1}, Lc/b/q/p1;->a(Landroid/widget/ListAdapter;)V
/* .line 18 */
(( c.b.q.p1 ) v4 ).e ( v2 ); // invoke-virtual {v4, v2}, Lc/b/q/p1;->e(I)V
/* .line 19 */
/* iget v1, p0, Lc/b/p/o/i;->o:I */
(( c.b.q.p1 ) v4 ).f ( v1 ); // invoke-virtual {v4, v1}, Lc/b/q/p1;->f(I)V
/* .line 20 */
v1 = v1 = this.j;
/* if-lez v1, :cond_2 */
/* .line 21 */
v6 = v1 = this.j;
/* sub-int/2addr v6, v3 */
/* check-cast v1, Lc/b/p/o/h; */
/* .line 22 */
(( c.b.p.o.i ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lc/b/p/o/i;->a(Lc/b/p/o/h;Lc/b/p/o/m;)Landroid/view/View;
} // :cond_2
/* move-object v1, v5 */
/* move-object v6, v1 */
} // :goto_1
int v7 = 0; // const/4 v7, 0x0
if ( v6 != null) { // if-eqz v6, :cond_9
/* .line 23 */
(( c.b.q.s1 ) v4 ).d ( v7 ); // invoke-virtual {v4, v7}, Lc/b/q/s1;->d(Z)V
/* .line 24 */
(( c.b.q.s1 ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Lc/b/q/s1;->a(Ljava/lang/Object;)V
/* .line 25 */
v8 = (( c.b.p.o.i ) p0 ).d ( v2 ); // invoke-virtual {p0, v2}, Lc/b/p/o/i;->d(I)I
/* if-ne v8, v3, :cond_3 */
int v9 = 1; // const/4 v9, 0x1
} // :cond_3
int v9 = 0; // const/4 v9, 0x0
/* .line 26 */
} // :goto_2
/* iput v8, p0, Lc/b/p/o/i;->r:I */
/* .line 27 */
/* const/16 v10, 0x1a */
int v11 = 5; // const/4 v11, 0x5
/* if-lt v8, v10, :cond_4 */
/* .line 28 */
(( c.b.q.p1 ) v4 ).a ( v6 ); // invoke-virtual {v4, v6}, Lc/b/q/p1;->a(Landroid/view/View;)V
int v8 = 0; // const/4 v8, 0x0
int v12 = 0; // const/4 v12, 0x0
} // :cond_4
int v8 = 2; // const/4 v8, 0x2
/* new-array v10, v8, [I */
/* .line 29 */
v12 = this.p;
(( android.view.View ) v12 ).getLocationOnScreen ( v10 ); // invoke-virtual {v12, v10}, Landroid/view/View;->getLocationOnScreen([I)V
/* new-array v8, v8, [I */
/* .line 30 */
(( android.view.View ) v6 ).getLocationOnScreen ( v8 ); // invoke-virtual {v6, v8}, Landroid/view/View;->getLocationOnScreen([I)V
/* .line 31 */
/* iget v12, p0, Lc/b/p/o/i;->o:I */
/* and-int/lit8 v12, v12, 0x7 */
/* if-ne v12, v11, :cond_5 */
/* .line 32 */
/* aget v12, v10, v7 */
v13 = this.p;
v13 = (( android.view.View ) v13 ).getWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getWidth()I
/* add-int/2addr v12, v13 */
/* aput v12, v10, v7 */
/* .line 33 */
/* aget v12, v8, v7 */
v13 = (( android.view.View ) v6 ).getWidth ( ); // invoke-virtual {v6}, Landroid/view/View;->getWidth()I
/* add-int/2addr v12, v13 */
/* aput v12, v8, v7 */
/* .line 34 */
} // :cond_5
/* aget v12, v8, v7 */
/* aget v13, v10, v7 */
/* sub-int/2addr v12, v13 */
/* .line 35 */
/* aget v8, v8, v3 */
/* aget v10, v10, v3 */
/* sub-int/2addr v8, v10 */
/* .line 36 */
} // :goto_3
/* iget v10, p0, Lc/b/p/o/i;->o:I */
/* and-int/2addr v10, v11 */
/* if-ne v10, v11, :cond_7 */
if ( v9 != null) { // if-eqz v9, :cond_6
/* .line 37 */
} // :cond_6
v2 = (( android.view.View ) v6 ).getWidth ( ); // invoke-virtual {v6}, Landroid/view/View;->getWidth()I
} // :cond_7
if ( v9 != null) { // if-eqz v9, :cond_8
/* .line 38 */
v2 = (( android.view.View ) v6 ).getWidth ( ); // invoke-virtual {v6}, Landroid/view/View;->getWidth()I
} // :goto_4
/* add-int/2addr v12, v2 */
} // :cond_8
} // :goto_5
/* sub-int/2addr v12, v2 */
/* .line 39 */
} // :goto_6
(( c.b.q.p1 ) v4 ).a ( v12 ); // invoke-virtual {v4, v12}, Lc/b/q/p1;->a(I)V
/* .line 40 */
(( c.b.q.p1 ) v4 ).b ( v3 ); // invoke-virtual {v4, v3}, Lc/b/q/p1;->b(Z)V
/* .line 41 */
(( c.b.q.p1 ) v4 ).b ( v8 ); // invoke-virtual {v4, v8}, Lc/b/q/p1;->b(I)V
/* .line 42 */
} // :cond_9
/* iget-boolean v2, p0, Lc/b/p/o/i;->s:Z */
if ( v2 != null) { // if-eqz v2, :cond_a
/* .line 43 */
/* iget v2, p0, Lc/b/p/o/i;->u:I */
(( c.b.q.p1 ) v4 ).a ( v2 ); // invoke-virtual {v4, v2}, Lc/b/q/p1;->a(I)V
/* .line 44 */
} // :cond_a
/* iget-boolean v2, p0, Lc/b/p/o/i;->t:Z */
if ( v2 != null) { // if-eqz v2, :cond_b
/* .line 45 */
/* iget v2, p0, Lc/b/p/o/i;->v:I */
(( c.b.q.p1 ) v4 ).b ( v2 ); // invoke-virtual {v4, v2}, Lc/b/q/p1;->b(I)V
/* .line 46 */
} // :cond_b
(( c.b.p.o.w ) p0 ).e ( ); // invoke-virtual {p0}, Lc/b/p/o/w;->e()Landroid/graphics/Rect;
/* .line 47 */
(( c.b.q.p1 ) v4 ).a ( v2 ); // invoke-virtual {v4, v2}, Lc/b/q/p1;->a(Landroid/graphics/Rect;)V
/* .line 48 */
} // :goto_7
/* new-instance v2, Lc/b/p/o/h; */
/* iget v3, p0, Lc/b/p/o/i;->r:I */
/* invoke-direct {v2, v4, p1, v3}, Lc/b/p/o/h;-><init>(Lc/b/q/s1;Lc/b/p/o/m;I)V */
/* .line 49 */
v3 = this.j;
/* .line 50 */
(( c.b.q.p1 ) v4 ).a ( ); // invoke-virtual {v4}, Lc/b/q/p1;->a()V
/* .line 51 */
(( c.b.q.p1 ) v4 ).g ( ); // invoke-virtual {v4}, Lc/b/q/p1;->g()Landroid/widget/ListView;
/* .line 52 */
(( android.widget.ListView ) v2 ).setOnKeyListener ( p0 ); // invoke-virtual {v2, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
/* if-nez v1, :cond_c */
/* .line 53 */
/* iget-boolean v1, p0, Lc/b/p/o/i;->x:Z */
if ( v1 != null) { // if-eqz v1, :cond_c
(( c.b.p.o.m ) p1 ).h ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->h()Ljava/lang/CharSequence;
if ( v1 != null) { // if-eqz v1, :cond_c
/* .line 54 */
(( android.view.LayoutInflater ) v0 ).inflate ( v1, v2, v7 ); // invoke-virtual {v0, v1, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
/* check-cast v0, Landroid/widget/FrameLayout; */
/* const v1, 0x1020016 */
/* .line 55 */
(( android.widget.FrameLayout ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/TextView; */
/* .line 56 */
(( android.widget.FrameLayout ) v0 ).setEnabled ( v7 ); // invoke-virtual {v0, v7}, Landroid/widget/FrameLayout;->setEnabled(Z)V
/* .line 57 */
(( c.b.p.o.m ) p1 ).h ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->h()Ljava/lang/CharSequence;
(( android.widget.TextView ) v1 ).setText ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 58 */
(( android.widget.ListView ) v2 ).addHeaderView ( v0, v5, v7 ); // invoke-virtual {v2, v0, v5, v7}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V
/* .line 59 */
(( c.b.q.p1 ) v4 ).a ( ); // invoke-virtual {v4}, Lc/b/q/p1;->a()V
} // :cond_c
return;
} // .end method
public Boolean d ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void dismiss ( ) {
/* .locals 4 */
/* .line 1 */
v0 = v0 = this.j;
/* if-lez v0, :cond_1 */
/* .line 2 */
v1 = this.j;
/* new-array v2, v0, [Lc/b/p/o/h; */
/* .line 3 */
/* check-cast v1, [Lc/b/p/o/h; */
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_0
/* if-ltz v0, :cond_1 */
/* .line 4 */
/* aget-object v2, v1, v0 */
/* .line 5 */
v3 = this.a;
v3 = (( c.b.q.p1 ) v3 ).b ( ); // invoke-virtual {v3}, Lc/b/q/p1;->b()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
v2 = this.a;
(( c.b.q.p1 ) v2 ).dismiss ( ); // invoke-virtual {v2}, Lc/b/q/p1;->dismiss()V
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
return;
} // .end method
public final c.b.q.s1 f ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Lc/b/q/s1; */
v1 = this.c;
/* iget v2, p0, Lc/b/p/o/i;->e:I */
/* iget v3, p0, Lc/b/p/o/i;->f:I */
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {v0, v1, v4, v2, v3}, Lc/b/q/s1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V */
/* .line 2 */
v1 = this.m;
(( c.b.q.s1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/s1;->a(Lc/b/q/q1;)V
/* .line 3 */
(( c.b.q.p1 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/b/q/p1;->a(Landroid/widget/AdapterView$OnItemClickListener;)V
/* .line 4 */
(( c.b.q.p1 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/b/q/p1;->a(Landroid/widget/PopupWindow$OnDismissListener;)V
/* .line 5 */
v1 = this.p;
(( c.b.q.p1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/p1;->a(Landroid/view/View;)V
/* .line 6 */
/* iget v1, p0, Lc/b/p/o/i;->o:I */
(( c.b.q.p1 ) v0 ).f ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/p1;->f(I)V
int v1 = 1; // const/4 v1, 0x1
/* .line 7 */
(( c.b.q.p1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/p1;->a(Z)V
int v1 = 2; // const/4 v1, 0x2
/* .line 8 */
(( c.b.q.p1 ) v0 ).g ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/p1;->g(I)V
} // .end method
public android.widget.ListView g ( ) {
/* .locals 2 */
/* .line 1 */
v0 = v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = this.j;
v1 = /* .line 2 */
/* add-int/lit8 v1, v1, -0x1 */
/* check-cast v0, Lc/b/p/o/h; */
(( c.b.p.o.h ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/o/h;->a()Landroid/widget/ListView;
} // :goto_0
} // .end method
public final Integer h ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.p;
v0 = c.h.n.v0 .o ( v0 );
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
} // :cond_0
} // .end method
public void onDismiss ( ) {
/* .locals 5 */
/* .line 1 */
v0 = v0 = this.j;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* .line 2 */
v3 = this.j;
/* check-cast v3, Lc/b/p/o/h; */
/* .line 3 */
v4 = this.a;
v4 = (( c.b.q.p1 ) v4 ).b ( ); // invoke-virtual {v4}, Lc/b/q/p1;->b()Z
/* if-nez v4, :cond_0 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 4 */
v0 = this.b;
(( c.b.p.o.m ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/m;->a(Z)V
} // :cond_2
return;
} // .end method
public Boolean onKey ( android.view.View p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 0 */
/* .line 1 */
p1 = (( android.view.KeyEvent ) p3 ).getAction ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
int p3 = 1; // const/4 p3, 0x1
/* if-ne p1, p3, :cond_0 */
/* const/16 p1, 0x52 */
/* if-ne p2, p1, :cond_0 */
/* .line 2 */
(( c.b.p.o.i ) p0 ).dismiss ( ); // invoke-virtual {p0}, Lc/b/p/o/i;->dismiss()V
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
