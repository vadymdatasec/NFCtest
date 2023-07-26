public class c.b.p.f extends c.b.p.c implements c.b.p.o.m$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.content.Context d;
	 public androidx.appcompat.widget.ActionBarContextView e;
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
public Boolean h;
public c.b.p.o.m i;
/* # direct methods */
public c.b.p.f ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lc/b/p/c;-><init>()V */
/* .line 2 */
this.d = p1;
/* .line 3 */
this.e = p2;
/* .line 4 */
this.f = p3;
/* .line 5 */
/* new-instance p1, Lc/b/p/o/m; */
(( android.view.ViewGroup ) p2 ).getContext ( ); // invoke-virtual {p2}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {p1, p2}, Lc/b/p/o/m;-><init>(Landroid/content/Context;)V */
int p2 = 1; // const/4 p2, 0x1
(( c.b.p.o.m ) p1 ).c ( p2 ); // invoke-virtual {p1, p2}, Lc/b/p/o/m;->c(I)Lc/b/p/o/m;
this.i = p1;
/* .line 6 */
(( c.b.p.o.m ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/b/p/o/m;->a(Lc/b/p/o/m$a;)V
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
/* .line 7 */
/* iget-boolean v0, p0, Lc/b/p/f;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 8 */
/* iput-boolean v0, p0, Lc/b/p/f;->h:Z */
/* .line 9 */
v0 = this.e;
/* const/16 v1, 0x20 */
(( android.view.ViewGroup ) v0 ).sendAccessibilityEvent ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V
/* .line 10 */
v0 = this.f;
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
(( android.content.Context ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( c.b.p.f ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/f;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public void a ( android.view.View p0 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.e;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).setCustomView ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 6 */
	 /* new-instance v0, Ljava/lang/ref/WeakReference; */
	 /* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
this.g = v0;
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 12 */
(( c.b.p.f ) p0 ).i ( ); // invoke-virtual {p0}, Lc/b/p/f;->i()V
/* .line 13 */
p1 = this.e;
(( androidx.appcompat.widget.ActionBarContextView ) p1 ).e ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->e()Z
return;
} // .end method
public void a ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).setSubtitle ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 3 */
/* invoke-super {p0, p1}, Lc/b/p/c;->a(Z)V */
/* .line 4 */
v0 = this.e;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).setTitleOptional ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V
return;
} // .end method
public Boolean a ( Object p0, android.view.MenuItem p1 ) {
/* .locals 0 */
/* .line 11 */
p1 = p1 = this.f;
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
v0 = this.d;
(( android.content.Context ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( c.b.p.f ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/f;->b(Ljava/lang/CharSequence;)V
return;
} // .end method
public void b ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).setTitle ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V
return;
} // .end method
public android.view.Menu c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public android.view.MenuInflater d ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lc/b/p/k; */
v1 = this.e;
(( android.view.ViewGroup ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Lc/b/p/k;-><init>(Landroid/content/Context;)V */
} // .end method
public java.lang.CharSequence e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).getSubtitle ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;
} // .end method
public java.lang.CharSequence g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).getTitle ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;
} // .end method
public void i ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.f;
v1 = this.i;
return;
} // .end method
public Boolean j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
v0 = (( androidx.appcompat.widget.ActionBarContextView ) v0 ).c ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->c()Z
} // .end method
