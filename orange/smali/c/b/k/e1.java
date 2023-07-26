public class c.b.k.e1 extends c.b.p.c implements c.b.p.o.m$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.content.Context d;
	 public final c.b.p.o.m e;
	 public c.b.p.b f;
	 public java.lang.ref.WeakReference g;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Landroid/view/View;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final c.b.k.f1 h; //synthetic
/* # direct methods */
public c.b.k.e1 ( ) {
/* .locals 0 */
/* .line 1 */
this.h = p1;
/* invoke-direct {p0}, Lc/b/p/c;-><init>()V */
/* .line 2 */
this.d = p2;
/* .line 3 */
this.f = p3;
/* .line 4 */
/* new-instance p1, Lc/b/p/o/m; */
/* invoke-direct {p1, p2}, Lc/b/p/o/m;-><init>(Landroid/content/Context;)V */
int p2 = 1; // const/4 p2, 0x1
/* .line 5 */
(( c.b.p.o.m ) p1 ).c ( p2 ); // invoke-virtual {p1, p2}, Lc/b/p/o/m;->c(I)Lc/b/p/o/m;
this.e = p1;
/* .line 6 */
(( c.b.p.o.m ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/b/p/o/m;->a(Lc/b/p/o/m$a;)V
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.h;
v1 = this.j;
/* if-eq v1, p0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* iget-boolean v1, v0, Lc/b/k/f1;->r:Z */
/* iget-boolean v0, v0, Lc/b/k/f1;->s:Z */
int v2 = 0; // const/4 v2, 0x0
v0 = c.b.k.f1 .a ( v1,v0,v2 );
/* if-nez v0, :cond_1 */
/* .line 3 */
v0 = this.h;
this.k = p0;
/* .line 4 */
v1 = this.f;
this.l = v1;
/* .line 5 */
} // :cond_1
v0 = this.f;
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
this.f = v0;
/* .line 7 */
v1 = this.h;
(( c.b.k.f1 ) v1 ).f ( v2 ); // invoke-virtual {v1, v2}, Lc/b/k/f1;->f(Z)V
/* .line 8 */
v1 = this.h;
v1 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) v1 ).a ( ); // invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->a()V
/* .line 9 */
v1 = this.h;
v1 = this.e;
/* const/16 v2, 0x20 */
(( android.view.ViewGroup ) v1 ).sendAccessibilityEvent ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V
/* .line 10 */
v1 = this.h;
v2 = this.c;
/* iget-boolean v1, v1, Lc/b/k/f1;->x:Z */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) v2 ).setHideOnContentScrollEnabled ( v1 ); // invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V
/* .line 11 */
v1 = this.h;
this.j = v0;
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 15 */
v0 = this.h;
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( c.b.k.e1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/e1;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 12 */
v0 = this.h;
v0 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).setCustomView ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V
/* .line 13 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.g = v0;
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 20 */
p1 = this.f;
/* if-nez p1, :cond_0 */
return;
/* .line 21 */
} // :cond_0
(( c.b.k.e1 ) p0 ).i ( ); // invoke-virtual {p0}, Lc/b/k/e1;->i()V
/* .line 22 */
p1 = this.h;
p1 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) p1 ).e ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->e()Z
return;
} // .end method
public void a ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 14 */
v0 = this.h;
v0 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).setSubtitle ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 16 */
/* invoke-super {p0, p1}, Lc/b/p/c;->a(Z)V */
/* .line 17 */
v0 = this.h;
v0 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).setTitleOptional ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V
return;
} // .end method
public Boolean a ( Object p0, android.view.MenuItem p1 ) {
/* .locals 0 */
/* .line 18 */
p1 = this.f;
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = /* .line 19 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.view.View b ( ) {
/* .locals 1 */
/* .line 3 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void b ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.h;
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( c.b.k.e1 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/e1;->b(Ljava/lang/CharSequence;)V
return;
} // .end method
public void b ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
v0 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).setTitle ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V
return;
} // .end method
public android.view.Menu c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public android.view.MenuInflater d ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lc/b/p/k; */
v1 = this.d;
/* invoke-direct {v0, v1}, Lc/b/p/k;-><init>(Landroid/content/Context;)V */
} // .end method
public java.lang.CharSequence e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
v0 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).getSubtitle ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;
} // .end method
public java.lang.CharSequence g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
v0 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).getTitle ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;
} // .end method
public void i ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.h;
v0 = this.j;
/* if-eq v0, p0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
v0 = this.e;
(( c.b.p.o.m ) v0 ).s ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->s()V
/* .line 3 */
try { // :try_start_0
v0 = this.f;
v1 = this.e;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
v0 = this.e;
(( c.b.p.o.m ) v0 ).r ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->r()V
return;
/* :catchall_0 */
/* move-exception v0 */
v1 = this.e;
(( c.b.p.o.m ) v1 ).r ( ); // invoke-virtual {v1}, Lc/b/p/o/m;->r()V
/* .line 5 */
/* throw v0 */
} // .end method
public Boolean j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
v0 = this.f;
v0 = (( androidx.appcompat.widget.ActionBarContextView ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->c()Z
} // .end method
public Boolean k ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
(( c.b.p.o.m ) v0 ).s ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->s()V
/* .line 2 */
try { // :try_start_0
v0 = this.f;
v0 = v1 = this.e;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
v1 = this.e;
(( c.b.p.o.m ) v1 ).r ( ); // invoke-virtual {v1}, Lc/b/p/o/m;->r()V
/* :catchall_0 */
/* move-exception v0 */
v1 = this.e;
(( c.b.p.o.m ) v1 ).r ( ); // invoke-virtual {v1}, Lc/b/p/o/m;->r()V
/* .line 4 */
/* throw v0 */
} // .end method
