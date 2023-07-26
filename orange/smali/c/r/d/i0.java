public class c.r.d.i0 extends c.h.n.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.r.d.j0 d;
	 public java.util.Map e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Landroid/view/View;", */
	 /* "Lc/h/n/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.r.d.i0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lc/h/n/d;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/WeakHashMap; */
/* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
this.e = v0;
/* .line 3 */
this.d = p1;
return;
} // .end method
/* # virtual methods */
public c.h.n.v1.i a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 26 */
v0 = this.e;
/* check-cast v0, Lc/h/n/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 27 */
	 (( c.h.n.d ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/h/n/d;->a(Landroid/view/View;)Lc/h/n/v1/i;
	 /* .line 28 */
} // :cond_0
/* invoke-super {p0, p1}, Lc/h/n/d;->a(Landroid/view/View;)Lc/h/n/v1/i; */
} // .end method
public void a ( android.view.View p0, Integer p1 ) {
/* .locals 1 */
/* .line 17 */
v0 = this.e;
/* check-cast v0, Lc/h/n/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 18 */
	 (( c.h.n.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;I)V
	 /* .line 19 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;I)V */
} // :goto_0
return;
} // .end method
public void a ( android.view.View p0, Object p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
v0 = (( c.r.d.j0 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/r/d/j0;->c()Z
/* if-nez v0, :cond_1 */
v0 = this.d;
v0 = this.d;
/* .line 2 */
(( androidx.recyclerview.widget.RecyclerView ) v0 ).getLayoutManager ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v0 = this.d;
v0 = this.d;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).getLayoutManager ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
/* .line 4 */
(( androidx.recyclerview.widget.RecyclerView$o ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;Lc/h/n/v1/h;)V
/* .line 5 */
v0 = this.e;
/* check-cast v0, Lc/h/n/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 6 */
	 (( c.h.n.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Lc/h/n/v1/h;)V
	 /* .line 7 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Lc/h/n/v1/h;)V */
/* .line 8 */
} // :cond_1
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Lc/h/n/v1/h;)V */
} // :goto_0
return;
} // .end method
public Boolean a ( android.view.View p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 2 */
/* .line 9 */
v0 = this.d;
v0 = (( c.r.d.j0 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/r/d/j0;->c()Z
/* if-nez v0, :cond_2 */
v0 = this.d;
v0 = this.d;
/* .line 10 */
(( androidx.recyclerview.widget.RecyclerView ) v0 ).getLayoutManager ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 11 */
v0 = this.e;
/* check-cast v0, Lc/h/n/d; */
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
v0 = (( c.h.n.d ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/View;ILandroid/os/Bundle;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 13 */
} // :cond_0
v0 = /* invoke-super {p0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/View;ILandroid/os/Bundle;)Z */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 14 */
} // :cond_1
v0 = this.d;
v0 = this.d;
(( androidx.recyclerview.widget.RecyclerView ) v0 ).getLayoutManager ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
/* .line 15 */
p1 = (( androidx.recyclerview.widget.RecyclerView$o ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/View;ILandroid/os/Bundle;)Z
/* .line 16 */
} // :cond_2
p1 = /* invoke-super {p0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/View;ILandroid/os/Bundle;)Z */
} // .end method
public Boolean a ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 20 */
v0 = this.e;
/* check-cast v0, Lc/h/n/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 21 */
p1 = (( c.h.n.d ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
/* .line 22 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z */
} // .end method
public Boolean a ( android.view.ViewGroup p0, android.view.View p1, android.view.accessibility.AccessibilityEvent p2 ) {
/* .locals 1 */
/* .line 23 */
v0 = this.e;
/* check-cast v0, Lc/h/n/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 24 */
p1 = (( c.h.n.d ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
/* .line 25 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z */
} // .end method
public void b ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
/* check-cast v0, Lc/h/n/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.h.n.d ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/d;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */
} // :goto_0
return;
} // .end method
public c.h.n.d c ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
/* check-cast p1, Lc/h/n/d; */
} // .end method
public void c ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.e;
/* check-cast v0, Lc/h/n/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.h.n.d ) v0 ).c ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/d;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
/* .line 4 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */
} // :goto_0
return;
} // .end method
public void d ( android.view.View p0 ) {
/* .locals 2 */
/* .line 1 */
c.h.n.v0 .b ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-eq v0, p0, :cond_0 */
/* .line 2 */
v1 = this.e;
} // :cond_0
return;
} // .end method
public void d ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.e;
/* check-cast v0, Lc/h/n/d; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( c.h.n.d ) v0 ).d ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/h/n/d;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
/* .line 5 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */
} // :goto_0
return;
} // .end method
