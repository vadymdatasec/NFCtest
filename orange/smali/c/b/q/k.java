public class c.b.q.k extends c.b.p.o.b implements c.h.n.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.q.e A;
	 public final c.b.q.j B;
	 public Integer C;
	 public c.b.q.h j;
	 public android.graphics.drawable.Drawable k;
	 public Boolean l;
	 public Boolean m;
	 public Boolean n;
	 public Integer o;
	 public Integer p;
	 public Integer q;
	 public Boolean r;
	 public Boolean s;
	 public Boolean t;
	 public Boolean u;
	 public Integer v;
	 public final android.util.SparseBooleanArray w;
	 public c.b.q.i x;
	 public c.b.q.d y;
	 public c.b.q.f z;
	 /* # direct methods */
	 public c.b.q.k ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0, v1}, Lc/b/p/o/b;-><init>(Landroid/content/Context;II)V */
		 /* .line 2 */
		 /* new-instance p1, Landroid/util/SparseBooleanArray; */
		 /* invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V */
		 this.w = p1;
		 /* .line 3 */
		 /* new-instance p1, Lc/b/q/j; */
		 /* invoke-direct {p1, p0}, Lc/b/q/j;-><init>(Lc/b/q/k;)V */
		 this.B = p1;
		 return;
	 } // .end method
	 public static c.b.p.o.m a ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.d;
	 } // .end method
	 public static c.b.p.o.m b ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.d;
	 } // .end method
	 public static c.b.p.o.a0 c ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.i;
	 } // .end method
	 public static c.b.p.o.m d ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.d;
	 } // .end method
	 public static c.b.p.o.m e ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.d;
	 } // .end method
	 public static c.b.p.o.a0 f ( Object p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = this.i;
	 } // .end method
	 /* # virtual methods */
	 public final android.view.View a ( android.view.MenuItem p0 ) {
		 /* .locals 6 */
		 /* .line 85 */
		 v0 = this.i;
		 /* check-cast v0, Landroid/view/ViewGroup; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 86 */
	 } // :cond_0
	 v2 = 	 (( android.view.ViewGroup ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I
	 int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_2 */
/* .line 87 */
(( android.view.ViewGroup ) v0 ).getChildAt ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
/* .line 88 */
/* instance-of v5, v4, Lc/b/p/o/a0$a; */
if ( v5 != null) { // if-eqz v5, :cond_1
	 /* move-object v5, v4 */
	 /* check-cast v5, Lc/b/p/o/a0$a; */
	 /* .line 89 */
	 /* if-ne v5, p1, :cond_1 */
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
} // .end method
public android.view.View a ( Object p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 2 */
/* .line 33 */
(( c.b.p.o.p ) p1 ).getActionView ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->getActionView()Landroid/view/View;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 34 */
v1 = (( c.b.p.o.p ) p1 ).f ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->f()Z
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 35 */
} // :cond_0
/* invoke-super {p0, p1, p2, p3}, Lc/b/p/o/b;->a(Lc/b/p/o/p;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View; */
/* .line 36 */
} // :cond_1
p1 = (( c.b.p.o.p ) p1 ).isActionViewExpanded ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isActionViewExpanded()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* const/16 p1, 0x8 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( android.view.View ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V
/* .line 37 */
/* check-cast p3, Landroidx/appcompat/widget/ActionMenuView; */
/* .line 38 */
(( android.view.View ) v0 ).getLayoutParams ( ); // invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
/* .line 39 */
p2 = (( androidx.appcompat.widget.ActionMenuView ) p3 ).checkLayoutParams ( p1 ); // invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
/* if-nez p2, :cond_3 */
/* .line 40 */
(( androidx.appcompat.widget.ActionMenuView ) p3 ).generateLayoutParams ( p1 ); // invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$c;
(( android.view.View ) v0 ).setLayoutParams ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
} // :cond_3
} // .end method
public void a ( android.content.Context p0, Object p1 ) {
/* .locals 4 */
/* .line 2 */
/* invoke-super {p0, p1, p2}, Lc/b/p/o/b;->a(Landroid/content/Context;Lc/b/p/o/m;)V */
/* .line 3 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 4 */
c.b.p.a .a ( p1 );
/* .line 5 */
/* iget-boolean v0, p0, Lc/b/q/k;->n:Z */
/* if-nez v0, :cond_0 */
/* .line 6 */
v0 = (( c.b.p.a ) p1 ).e ( ); // invoke-virtual {p1}, Lc/b/p/a;->e()Z
/* iput-boolean v0, p0, Lc/b/q/k;->m:Z */
/* .line 7 */
} // :cond_0
/* iget-boolean v0, p0, Lc/b/q/k;->t:Z */
/* if-nez v0, :cond_1 */
/* .line 8 */
v0 = (( c.b.p.a ) p1 ).b ( ); // invoke-virtual {p1}, Lc/b/p/a;->b()I
/* iput v0, p0, Lc/b/q/k;->o:I */
/* .line 9 */
} // :cond_1
/* iget-boolean v0, p0, Lc/b/q/k;->r:Z */
/* if-nez v0, :cond_2 */
/* .line 10 */
p1 = (( c.b.p.a ) p1 ).c ( ); // invoke-virtual {p1}, Lc/b/p/a;->c()I
/* iput p1, p0, Lc/b/q/k;->q:I */
/* .line 11 */
} // :cond_2
/* iget p1, p0, Lc/b/q/k;->o:I */
/* .line 12 */
/* iget-boolean v0, p0, Lc/b/q/k;->m:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 13 */
v0 = this.j;
/* if-nez v0, :cond_4 */
/* .line 14 */
/* new-instance v0, Lc/b/q/h; */
v2 = this.b;
/* invoke-direct {v0, p0, v2}, Lc/b/q/h;-><init>(Lc/b/q/k;Landroid/content/Context;)V */
this.j = v0;
/* .line 15 */
/* iget-boolean v2, p0, Lc/b/q/k;->l:Z */
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 16 */
v2 = this.k;
(( c.b.q.x ) v0 ).setImageDrawable ( v2 ); // invoke-virtual {v0, v2}, Lc/b/q/x;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 17 */
this.k = v1;
/* .line 18 */
/* iput-boolean v3, p0, Lc/b/q/k;->l:Z */
/* .line 19 */
} // :cond_3
v0 = android.view.View$MeasureSpec .makeMeasureSpec ( v3,v3 );
/* .line 20 */
v1 = this.j;
(( android.widget.ImageView ) v1 ).measure ( v0, v0 ); // invoke-virtual {v1, v0, v0}, Landroid/widget/ImageView;->measure(II)V
/* .line 21 */
} // :cond_4
v0 = this.j;
v0 = (( android.widget.ImageView ) v0 ).getMeasuredWidth ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredWidth()I
/* sub-int/2addr p1, v0 */
/* .line 22 */
} // :cond_5
this.j = v1;
/* .line 23 */
} // :goto_0
/* iput p1, p0, Lc/b/q/k;->p:I */
/* const/high16 p1, 0x42600000 # 56.0f */
/* .line 24 */
(( android.content.res.Resources ) p2 ).getDisplayMetrics ( ); // invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget p2, p2, Landroid/util/DisplayMetrics;->density:F */
/* mul-float p2, p2, p1 */
/* float-to-int p1, p2 */
/* iput p1, p0, Lc/b/q/k;->v:I */
return;
} // .end method
public void a ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* .line 25 */
/* iget-boolean p1, p0, Lc/b/q/k;->r:Z */
/* if-nez p1, :cond_0 */
/* .line 26 */
p1 = this.c;
c.b.p.a .a ( p1 );
p1 = (( c.b.p.a ) p1 ).c ( ); // invoke-virtual {p1}, Lc/b/p/a;->c()I
/* iput p1, p0, Lc/b/q/k;->q:I */
/* .line 27 */
} // :cond_0
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 28 */
(( c.b.p.o.m ) p1 ).c ( v0 ); // invoke-virtual {p1, v0}, Lc/b/p/o/m;->c(Z)V
} // :cond_1
return;
} // .end method
public void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 29 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 30 */
(( c.b.q.x ) v0 ).setImageDrawable ( p1 ); // invoke-virtual {v0, p1}, Lc/b/q/x;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 31 */
/* iput-boolean v0, p0, Lc/b/q/k;->l:Z */
/* .line 32 */
this.k = p1;
} // :goto_0
return;
} // .end method
public void a ( androidx.appcompat.widget.ActionMenuView p0 ) {
/* .locals 1 */
/* .line 92 */
this.i = p1;
/* .line 93 */
v0 = this.d;
(( androidx.appcompat.widget.ActionMenuView ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->a(Lc/b/p/o/m;)V
return;
} // .end method
public void a ( Object p0, Boolean p1 ) {
/* .locals 0 */
/* .line 90 */
(( c.b.q.k ) p0 ).b ( ); // invoke-virtual {p0}, Lc/b/q/k;->b()Z
/* .line 91 */
/* invoke-super {p0, p1, p2}, Lc/b/p/o/b;->a(Lc/b/p/o/m;Z)V */
return;
} // .end method
public void a ( Object p0, c.b.p.o.a0$a p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 41 */
/* .line 42 */
p1 = this.i;
/* check-cast p1, Landroidx/appcompat/widget/ActionMenuView; */
/* .line 43 */
/* check-cast p2, Landroidx/appcompat/view/menu/ActionMenuItemView; */
/* .line 44 */
(( androidx.appcompat.view.menu.ActionMenuItemView ) p2 ).setItemInvoker ( p1 ); // invoke-virtual {p2, p1}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setItemInvoker(Lc/b/p/o/m$b;)V
/* .line 45 */
p1 = this.A;
/* if-nez p1, :cond_0 */
/* .line 46 */
/* new-instance p1, Lc/b/q/e; */
/* invoke-direct {p1, p0}, Lc/b/q/e;-><init>(Lc/b/q/k;)V */
this.A = p1;
/* .line 47 */
} // :cond_0
p1 = this.A;
(( androidx.appcompat.view.menu.ActionMenuItemView ) p2 ).setPopupCallback ( p1 ); // invoke-virtual {p2, p1}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setPopupCallback(Landroidx/appcompat/view/menu/ActionMenuItemView$b;)V
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 4 */
/* .line 49 */
/* invoke-super {p0, p1}, Lc/b/p/o/b;->a(Z)V */
/* .line 50 */
p1 = this.i;
/* check-cast p1, Landroid/view/View; */
(( android.view.View ) p1 ).requestLayout ( ); // invoke-virtual {p1}, Landroid/view/View;->requestLayout()V
/* .line 51 */
p1 = this.d;
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 52 */
(( c.b.p.o.m ) p1 ).c ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->c()Ljava/util/ArrayList;
/* .line 53 */
v1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* .line 54 */
(( java.util.ArrayList ) p1 ).get ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Lc/b/p/o/p; */
(( c.b.p.o.p ) v3 ).a ( ); // invoke-virtual {v3}, Lc/b/p/o/p;->a()Lc/h/n/g;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 55 */
(( c.h.n.g ) v3 ).a ( p0 ); // invoke-virtual {v3, p0}, Lc/h/n/g;->a(Lc/h/n/e;)V
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* .line 56 */
} // :cond_1
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 57 */
(( c.b.p.o.m ) p1 ).j ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 58 */
} // :goto_1
/* iget-boolean v1, p0, Lc/b/q/k;->m:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 59 */
v1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_3 */
/* .line 60 */
(( java.util.ArrayList ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p1, Lc/b/p/o/p; */
p1 = (( c.b.p.o.p ) p1 ).isActionViewExpanded ( ); // invoke-virtual {p1}, Lc/b/p/o/p;->isActionViewExpanded()Z
/* xor-int/lit8 v0, p1, 0x1 */
} // :cond_3
/* if-lez v1, :cond_4 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_4
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 61 */
p1 = this.j;
/* if-nez p1, :cond_5 */
/* .line 62 */
/* new-instance p1, Lc/b/q/h; */
v0 = this.b;
/* invoke-direct {p1, p0, v0}, Lc/b/q/h;-><init>(Lc/b/q/k;Landroid/content/Context;)V */
this.j = p1;
/* .line 63 */
} // :cond_5
p1 = this.j;
(( android.widget.ImageView ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;
/* check-cast p1, Landroid/view/ViewGroup; */
/* .line 64 */
v0 = this.i;
/* if-eq p1, v0, :cond_8 */
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 65 */
v0 = this.j;
(( android.view.ViewGroup ) p1 ).removeView ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 66 */
} // :cond_6
p1 = this.i;
/* check-cast p1, Landroidx/appcompat/widget/ActionMenuView; */
/* .line 67 */
v0 = this.j;
(( androidx.appcompat.widget.ActionMenuView ) p1 ).e ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuView;->e()Landroidx/appcompat/widget/ActionMenuView$c;
(( android.view.ViewGroup ) p1 ).addView ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 68 */
} // :cond_7
p1 = this.j;
if ( p1 != null) { // if-eqz p1, :cond_8
(( android.widget.ImageView ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;
v0 = this.i;
/* if-ne p1, v0, :cond_8 */
/* .line 69 */
/* check-cast v0, Landroid/view/ViewGroup; */
p1 = this.j;
(( android.view.ViewGroup ) v0 ).removeView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
/* .line 70 */
} // :cond_8
} // :goto_3
p1 = this.i;
/* check-cast p1, Landroidx/appcompat/widget/ActionMenuView; */
/* iget-boolean v0, p0, Lc/b/q/k;->m:Z */
(( androidx.appcompat.widget.ActionMenuView ) p1 ).setOverflowReserved ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowReserved(Z)V
return;
} // .end method
public Boolean a ( Integer p0, Object p1 ) {
/* .locals 0 */
/* .line 48 */
p1 = (( c.b.p.o.p ) p2 ).h ( ); // invoke-virtual {p2}, Lc/b/p/o/p;->h()Z
} // .end method
public Boolean a ( android.view.ViewGroup p0, Integer p1 ) {
/* .locals 2 */
/* .line 71 */
(( android.view.ViewGroup ) p1 ).getChildAt ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
v1 = this.j;
/* if-ne v0, v1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 72 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2}, Lc/b/p/o/b;->a(Landroid/view/ViewGroup;I)Z */
} // .end method
public Boolean a ( c.b.p.o.g0 p0 ) {
/* .locals 7 */
/* .line 73 */
v0 = (( c.b.p.o.m ) p1 ).hasVisibleItems ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->hasVisibleItems()Z
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
} // :cond_0
/* move-object v0, p1 */
/* .line 74 */
} // :goto_0
(( c.b.p.o.g0 ) v0 ).t ( ); // invoke-virtual {v0}, Lc/b/p/o/g0;->t()Landroid/view/Menu;
v3 = this.d;
/* if-eq v2, v3, :cond_1 */
/* .line 75 */
(( c.b.p.o.g0 ) v0 ).t ( ); // invoke-virtual {v0}, Lc/b/p/o/g0;->t()Landroid/view/Menu;
/* check-cast v0, Lc/b/p/o/g0; */
/* .line 76 */
} // :cond_1
(( c.b.p.o.g0 ) v0 ).getItem ( ); // invoke-virtual {v0}, Lc/b/p/o/g0;->getItem()Landroid/view/MenuItem;
(( c.b.q.k ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/q/k;->a(Landroid/view/MenuItem;)Landroid/view/View;
/* if-nez v0, :cond_2 */
/* .line 77 */
} // :cond_2
(( c.b.p.o.g0 ) p1 ).getItem ( ); // invoke-virtual {p1}, Lc/b/p/o/g0;->getItem()Landroid/view/MenuItem;
/* .line 78 */
v2 = (( c.b.p.o.m ) p1 ).size ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->size()I
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
int v4 = 1; // const/4 v4, 0x1
/* if-ge v3, v2, :cond_4 */
/* .line 79 */
(( c.b.p.o.m ) p1 ).getItem ( v3 ); // invoke-virtual {p1, v3}, Lc/b/p/o/m;->getItem(I)Landroid/view/MenuItem;
v6 = /* .line 80 */
if ( v6 != null) { // if-eqz v6, :cond_3
if ( v5 != null) { // if-eqz v5, :cond_3
int v1 = 1; // const/4 v1, 0x1
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
/* .line 81 */
} // :cond_4
} // :goto_2
/* new-instance v2, Lc/b/q/d; */
v3 = this.c;
/* invoke-direct {v2, p0, v3, p1, v0}, Lc/b/q/d;-><init>(Lc/b/q/k;Landroid/content/Context;Lc/b/p/o/g0;Landroid/view/View;)V */
this.y = v2;
/* .line 82 */
(( c.b.p.o.y ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lc/b/p/o/y;->a(Z)V
/* .line 83 */
v0 = this.y;
(( c.b.p.o.y ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/p/o/y;->f()V
/* .line 84 */
/* invoke-super {p0, p1}, Lc/b/p/o/b;->a(Lc/b/p/o/g0;)Z */
} // .end method
public c.b.p.o.a0 b ( android.view.ViewGroup p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.i;
/* .line 4 */
/* invoke-super {p0, p1}, Lc/b/p/o/b;->b(Landroid/view/ViewGroup;)Lc/b/p/o/a0; */
/* if-eq v0, p1, :cond_0 */
/* .line 5 */
/* move-object v0, p1 */
/* check-cast v0, Landroidx/appcompat/widget/ActionMenuView; */
(( androidx.appcompat.widget.ActionMenuView ) v0 ).setPresenter ( p0 ); // invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Lc/b/q/k;)V
} // :cond_0
} // .end method
public void b ( Boolean p0 ) {
/* .locals 0 */
/* .line 2 */
/* iput-boolean p1, p0, Lc/b/q/k;->u:Z */
return;
} // .end method
public Boolean b ( ) {
/* .locals 2 */
/* .line 6 */
v0 = (( c.b.q.k ) p0 ).e ( ); // invoke-virtual {p0}, Lc/b/q/k;->e()Z
/* .line 7 */
v1 = (( c.b.q.k ) p0 ).f ( ); // invoke-virtual {p0}, Lc/b/q/k;->f()Z
/* or-int/2addr v0, v1 */
} // .end method
public void c ( Boolean p0 ) {
/* .locals 0 */
/* .line 2 */
/* iput-boolean p1, p0, Lc/b/q/k;->m:Z */
int p1 = 1; // const/4 p1, 0x1
/* .line 3 */
/* iput-boolean p1, p0, Lc/b/q/k;->n:Z */
return;
} // .end method
public Boolean c ( ) {
/* .locals 20 */
/* move-object/from16 v0, p0 */
/* .line 4 */
v1 = this.d;
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
(( c.b.p.o.m ) v1 ).n ( ); // invoke-virtual {v1}, Lc/b/p/o/m;->n()Ljava/util/ArrayList;
/* .line 6 */
v4 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
} // :cond_0
/* move-object v1, v2 */
int v4 = 0; // const/4 v4, 0x0
/* .line 7 */
} // :goto_0
/* iget v5, v0, Lc/b/q/k;->q:I */
/* .line 8 */
/* iget v6, v0, Lc/b/q/k;->p:I */
/* .line 9 */
v7 = android.view.View$MeasureSpec .makeMeasureSpec ( v3,v3 );
/* .line 10 */
v8 = this.i;
/* check-cast v8, Landroid/view/ViewGroup; */
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
} // :goto_1
/* if-ge v9, v4, :cond_4 */
/* .line 11 */
(( java.util.ArrayList ) v1 ).get ( v9 ); // invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v14, Lc/b/p/o/p; */
/* .line 12 */
v15 = (( c.b.p.o.p ) v14 ).k ( ); // invoke-virtual {v14}, Lc/b/p/o/p;->k()Z
if ( v15 != null) { // if-eqz v15, :cond_1
/* add-int/lit8 v11, v11, 0x1 */
/* .line 13 */
} // :cond_1
v15 = (( c.b.p.o.p ) v14 ).j ( ); // invoke-virtual {v14}, Lc/b/p/o/p;->j()Z
if ( v15 != null) { // if-eqz v15, :cond_2
/* add-int/lit8 v12, v12, 0x1 */
} // :cond_2
int v10 = 1; // const/4 v10, 0x1
/* .line 14 */
} // :goto_2
/* iget-boolean v13, v0, Lc/b/q/k;->u:Z */
if ( v13 != null) { // if-eqz v13, :cond_3
v13 = (( c.b.p.o.p ) v14 ).isActionViewExpanded ( ); // invoke-virtual {v14}, Lc/b/p/o/p;->isActionViewExpanded()Z
if ( v13 != null) { // if-eqz v13, :cond_3
int v5 = 0; // const/4 v5, 0x0
} // :cond_3
/* add-int/lit8 v9, v9, 0x1 */
/* .line 15 */
} // :cond_4
/* iget-boolean v9, v0, Lc/b/q/k;->m:Z */
if ( v9 != null) { // if-eqz v9, :cond_6
/* if-nez v10, :cond_5 */
/* add-int/2addr v12, v11 */
/* if-le v12, v5, :cond_6 */
} // :cond_5
/* add-int/lit8 v5, v5, -0x1 */
} // :cond_6
/* sub-int/2addr v5, v11 */
/* .line 16 */
v9 = this.w;
/* .line 17 */
(( android.util.SparseBooleanArray ) v9 ).clear ( ); // invoke-virtual {v9}, Landroid/util/SparseBooleanArray;->clear()V
/* .line 18 */
/* iget-boolean v10, v0, Lc/b/q/k;->s:Z */
if ( v10 != null) { // if-eqz v10, :cond_7
/* .line 19 */
/* iget v10, v0, Lc/b/q/k;->v:I */
/* div-int v11, v6, v10 */
/* .line 20 */
/* rem-int v12, v6, v10 */
/* .line 21 */
/* div-int/2addr v12, v11 */
/* add-int/2addr v10, v12 */
} // :cond_7
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
} // :goto_3
int v12 = 0; // const/4 v12, 0x0
int v14 = 0; // const/4 v14, 0x0
} // :goto_4
/* if-ge v12, v4, :cond_1b */
/* .line 22 */
(( java.util.ArrayList ) v1 ).get ( v12 ); // invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v15, Lc/b/p/o/p; */
/* .line 23 */
v16 = (( c.b.p.o.p ) v15 ).k ( ); // invoke-virtual {v15}, Lc/b/p/o/p;->k()Z
if ( v16 != null) { // if-eqz v16, :cond_b
/* .line 24 */
(( c.b.q.k ) v0 ).a ( v15, v2, v8 ); // invoke-virtual {v0, v15, v2, v8}, Lc/b/q/k;->a(Lc/b/p/o/p;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
/* .line 25 */
/* iget-boolean v2, v0, Lc/b/q/k;->s:Z */
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 26 */
v2 = androidx.appcompat.widget.ActionMenuView .b ( v13,v10,v11,v7,v3 );
/* sub-int/2addr v11, v2 */
/* .line 27 */
} // :cond_8
(( android.view.View ) v13 ).measure ( v7, v7 ); // invoke-virtual {v13, v7, v7}, Landroid/view/View;->measure(II)V
/* .line 28 */
} // :goto_5
v2 = (( android.view.View ) v13 ).getMeasuredWidth ( ); // invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I
/* sub-int/2addr v6, v2 */
/* if-nez v14, :cond_9 */
/* move v14, v2 */
/* .line 29 */
} // :cond_9
v2 = (( c.b.p.o.p ) v15 ).getGroupId ( ); // invoke-virtual {v15}, Lc/b/p/o/p;->getGroupId()I
int v13 = 1; // const/4 v13, 0x1
if ( v2 != null) { // if-eqz v2, :cond_a
/* .line 30 */
(( android.util.SparseBooleanArray ) v9 ).put ( v2, v13 ); // invoke-virtual {v9, v2, v13}, Landroid/util/SparseBooleanArray;->put(IZ)V
/* .line 31 */
} // :cond_a
(( c.b.p.o.p ) v15 ).d ( v13 ); // invoke-virtual {v15, v13}, Lc/b/p/o/p;->d(Z)V
/* move/from16 v17, v4 */
} // :goto_6
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_d */
/* .line 32 */
} // :cond_b
v2 = (( c.b.p.o.p ) v15 ).j ( ); // invoke-virtual {v15}, Lc/b/p/o/p;->j()Z
if ( v2 != null) { // if-eqz v2, :cond_1a
/* .line 33 */
v2 = (( c.b.p.o.p ) v15 ).getGroupId ( ); // invoke-virtual {v15}, Lc/b/p/o/p;->getGroupId()I
/* .line 34 */
v13 = (( android.util.SparseBooleanArray ) v9 ).get ( v2 ); // invoke-virtual {v9, v2}, Landroid/util/SparseBooleanArray;->get(I)Z
/* if-gtz v5, :cond_c */
if ( v13 != null) { // if-eqz v13, :cond_e
} // :cond_c
/* if-lez v6, :cond_e */
/* .line 35 */
/* iget-boolean v3, v0, Lc/b/q/k;->s:Z */
if ( v3 != null) { // if-eqz v3, :cond_d
/* if-lez v11, :cond_e */
} // :cond_d
int v3 = 1; // const/4 v3, 0x1
} // :cond_e
int v3 = 0; // const/4 v3, 0x0
} // :goto_7
/* move/from16 v18, v3 */
/* move/from16 v17, v4 */
if ( v3 != null) { // if-eqz v3, :cond_14
int v3 = 0; // const/4 v3, 0x0
/* .line 36 */
(( c.b.q.k ) v0 ).a ( v15, v3, v8 ); // invoke-virtual {v0, v15, v3, v8}, Lc/b/q/k;->a(Lc/b/p/o/p;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
/* .line 37 */
/* iget-boolean v3, v0, Lc/b/q/k;->s:Z */
if ( v3 != null) { // if-eqz v3, :cond_f
int v3 = 0; // const/4 v3, 0x0
/* .line 38 */
v19 = androidx.appcompat.widget.ActionMenuView .b ( v4,v10,v11,v7,v3 );
/* sub-int v11, v11, v19 */
/* if-nez v19, :cond_10 */
/* const/16 v18, 0x0 */
/* .line 39 */
} // :cond_f
(( android.view.View ) v4 ).measure ( v7, v7 ); // invoke-virtual {v4, v7, v7}, Landroid/view/View;->measure(II)V
} // :cond_10
} // :goto_8
/* move/from16 v3, v18 */
/* .line 40 */
v4 = (( android.view.View ) v4 ).getMeasuredWidth ( ); // invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
/* sub-int/2addr v6, v4 */
/* if-nez v14, :cond_11 */
/* move v14, v4 */
/* .line 41 */
} // :cond_11
/* iget-boolean v4, v0, Lc/b/q/k;->s:Z */
if ( v4 != null) { // if-eqz v4, :cond_12
/* if-ltz v6, :cond_13 */
} // :cond_12
/* add-int v4, v6, v14 */
/* if-lez v4, :cond_13 */
} // :goto_9
int v4 = 1; // const/4 v4, 0x1
} // :cond_13
int v4 = 0; // const/4 v4, 0x0
} // :goto_a
/* and-int/2addr v3, v4 */
} // :cond_14
if ( v3 != null) { // if-eqz v3, :cond_15
if ( v2 != null) { // if-eqz v2, :cond_15
int v4 = 1; // const/4 v4, 0x1
/* .line 42 */
(( android.util.SparseBooleanArray ) v9 ).put ( v2, v4 ); // invoke-virtual {v9, v2, v4}, Landroid/util/SparseBooleanArray;->put(IZ)V
} // :cond_15
if ( v13 != null) { // if-eqz v13, :cond_18
int v4 = 0; // const/4 v4, 0x0
/* .line 43 */
(( android.util.SparseBooleanArray ) v9 ).put ( v2, v4 ); // invoke-virtual {v9, v2, v4}, Landroid/util/SparseBooleanArray;->put(IZ)V
int v4 = 0; // const/4 v4, 0x0
} // :goto_b
/* if-ge v4, v12, :cond_18 */
/* .line 44 */
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v13, Lc/b/p/o/p; */
/* .line 45 */
v0 = (( c.b.p.o.p ) v13 ).getGroupId ( ); // invoke-virtual {v13}, Lc/b/p/o/p;->getGroupId()I
/* if-ne v0, v2, :cond_17 */
/* .line 46 */
v0 = (( c.b.p.o.p ) v13 ).h ( ); // invoke-virtual {v13}, Lc/b/p/o/p;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_16
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_16
int v0 = 0; // const/4 v0, 0x0
/* .line 47 */
(( c.b.p.o.p ) v13 ).d ( v0 ); // invoke-virtual {v13, v0}, Lc/b/p/o/p;->d(Z)V
} // :cond_17
/* add-int/lit8 v4, v4, 0x1 */
/* move-object/from16 v0, p0 */
} // :cond_18
} // :goto_c
if ( v3 != null) { // if-eqz v3, :cond_19
/* add-int/lit8 v5, v5, -0x1 */
/* .line 48 */
} // :cond_19
(( c.b.p.o.p ) v15 ).d ( v3 ); // invoke-virtual {v15, v3}, Lc/b/p/o/p;->d(Z)V
/* goto/16 :goto_6 */
} // :cond_1a
/* move/from16 v17, v4 */
int v0 = 0; // const/4 v0, 0x0
/* .line 49 */
(( c.b.p.o.p ) v15 ).d ( v0 ); // invoke-virtual {v15, v0}, Lc/b/p/o/p;->d(Z)V
} // :goto_d
/* add-int/lit8 v12, v12, 0x1 */
/* move/from16 v4, v17 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* move-object/from16 v0, p0 */
/* goto/16 :goto_4 */
} // :cond_1b
int v2 = 1; // const/4 v2, 0x1
} // .end method
public android.graphics.drawable.Drawable d ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( android.widget.ImageView ) v0 ).getDrawable ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;
/* .line 4 */
} // :cond_0
/* iget-boolean v0, p0, Lc/b/q/k;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v0 = this.k;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean e ( ) {
/* .locals 3 */
/* .line 2 */
v0 = this.z;
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
v2 = this.i;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
/* check-cast v2, Landroid/view/View; */
(( android.view.View ) v2 ).removeCallbacks ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
this.z = v0;
/* .line 5 */
} // :cond_0
v0 = this.x;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
(( c.b.p.o.y ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/o/y;->b()V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.y;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.p.o.y ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/o/y;->b()V
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.z;
/* if-nez v0, :cond_1 */
v0 = (( c.b.q.k ) p0 ).h ( ); // invoke-virtual {p0}, Lc/b/q/k;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public Boolean h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.x;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.p.o.y ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/p/o/y;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean i ( ) {
/* .locals 7 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/q/k;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( c.b.q.k ) p0 ).h ( ); // invoke-virtual {p0}, Lc/b/q/k;->h()Z
/* if-nez v0, :cond_0 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = this.i;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.z;
/* if-nez v1, :cond_0 */
/* .line 2 */
(( c.b.p.o.m ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;
v0 = (( java.util.ArrayList ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v0, :cond_0 */
/* .line 3 */
/* new-instance v0, Lc/b/q/i; */
v3 = this.c;
v4 = this.d;
v5 = this.j;
int v6 = 1; // const/4 v6, 0x1
/* move-object v1, v0 */
/* move-object v2, p0 */
/* invoke-direct/range {v1 ..v6}, Lc/b/q/i;-><init>(Lc/b/q/k;Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;Z)V */
/* .line 4 */
/* new-instance v1, Lc/b/q/f; */
/* invoke-direct {v1, p0, v0}, Lc/b/q/f;-><init>(Lc/b/q/k;Lc/b/q/i;)V */
this.z = v1;
/* .line 5 */
v0 = this.i;
/* check-cast v0, Landroid/view/View; */
(( android.view.View ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
/* invoke-super {p0, v0}, Lc/b/p/o/b;->a(Lc/b/p/o/g0;)Z */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
