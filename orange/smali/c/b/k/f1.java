public class c.b.k.f1 extends c.b.k.a implements androidx.appcompat.widget.ActionBarOverlayLayout$d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.view.animation.Interpolator B;
	 public static final android.view.animation.Interpolator C;
	 /* # instance fields */
	 public final c.h.n.f1 A;
	 public android.content.Context a;
	 public android.content.Context b;
	 public androidx.appcompat.widget.ActionBarOverlayLayout c;
	 public androidx.appcompat.widget.ActionBarContainer d;
	 public c.b.q.z0 e;
	 public androidx.appcompat.widget.ActionBarContextView f;
	 public android.view.View g;
	 public c.b.q.c2 h;
	 public Boolean i;
	 public c.b.k.e1 j;
	 public c.b.p.c k;
	 public c.b.p.b l;
	 public Boolean m;
	 public java.util.ArrayList n;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lc/b/k/b;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Boolean o;
public Integer p;
public Boolean q;
public Boolean r;
public Boolean s;
public Boolean t;
public Boolean u;
public c.b.p.m v;
public Boolean w;
public Boolean x;
public final c.h.n.d1 y;
public final c.h.n.d1 z;
/* # direct methods */
public static c.b.k.f1 ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Landroid/view/animation/AccelerateInterpolator; */
/* invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V */
/* .line 2 */
/* new-instance v0, Landroid/view/animation/DecelerateInterpolator; */
/* invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V */
return;
} // .end method
public c.b.k.f1 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lc/b/k/a;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.n = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput v0, p0, Lc/b/k/f1;->p:I */
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Lc/b/k/f1;->q:Z */
/* .line 6 */
/* iput-boolean v0, p0, Lc/b/k/f1;->u:Z */
/* .line 7 */
/* new-instance v0, Lc/b/k/b1; */
/* invoke-direct {v0, p0}, Lc/b/k/b1;-><init>(Lc/b/k/f1;)V */
this.y = v0;
/* .line 8 */
/* new-instance v0, Lc/b/k/c1; */
/* invoke-direct {v0, p0}, Lc/b/k/c1;-><init>(Lc/b/k/f1;)V */
this.z = v0;
/* .line 9 */
/* new-instance v0, Lc/b/k/d1; */
/* invoke-direct {v0, p0}, Lc/b/k/d1;-><init>(Lc/b/k/f1;)V */
this.A = v0;
/* .line 10 */
(( android.app.Activity ) p1 ).getWindow ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
/* .line 11 */
(( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
/* .line 12 */
(( c.b.k.f1 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f1;->b(Landroid/view/View;)V
/* if-nez p2, :cond_0 */
/* const p2, 0x1020002 */
/* .line 13 */
(( android.view.View ) p1 ).findViewById ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
this.g = p1;
} // :cond_0
return;
} // .end method
public c.b.k.f1 ( ) {
/* .locals 1 */
/* .line 14 */
/* invoke-direct {p0}, Lc/b/k/a;-><init>()V */
/* .line 15 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 16 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.n = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 17 */
/* iput v0, p0, Lc/b/k/f1;->p:I */
int v0 = 1; // const/4 v0, 0x1
/* .line 18 */
/* iput-boolean v0, p0, Lc/b/k/f1;->q:Z */
/* .line 19 */
/* iput-boolean v0, p0, Lc/b/k/f1;->u:Z */
/* .line 20 */
/* new-instance v0, Lc/b/k/b1; */
/* invoke-direct {v0, p0}, Lc/b/k/b1;-><init>(Lc/b/k/f1;)V */
this.y = v0;
/* .line 21 */
/* new-instance v0, Lc/b/k/c1; */
/* invoke-direct {v0, p0}, Lc/b/k/c1;-><init>(Lc/b/k/f1;)V */
this.z = v0;
/* .line 22 */
/* new-instance v0, Lc/b/k/d1; */
/* invoke-direct {v0, p0}, Lc/b/k/d1;-><init>(Lc/b/k/f1;)V */
this.A = v0;
/* .line 23 */
(( android.app.Dialog ) p1 ).getWindow ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
(( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
(( c.b.k.f1 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f1;->b(Landroid/view/View;)V
return;
} // .end method
public static Boolean a ( Boolean p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
if ( p2 != null) { // if-eqz p2, :cond_0
} // :cond_0
/* if-nez p0, :cond_2 */
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
} // :cond_2
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public c.b.p.c a ( Object p0 ) {
/* .locals 2 */
/* .line 14 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 15 */
(( c.b.k.e1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/k/e1;->a()V
/* .line 16 */
} // :cond_0
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
(( androidx.appcompat.widget.ActionBarOverlayLayout ) v0 ).setHideOnContentScrollEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V
/* .line 17 */
v0 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->d()V
/* .line 18 */
/* new-instance v0, Lc/b/k/e1; */
v1 = this.f;
(( android.view.ViewGroup ) v1 ).getContext ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
/* invoke-direct {v0, p0, v1, p1}, Lc/b/k/e1;-><init>(Lc/b/k/f1;Landroid/content/Context;Lc/b/p/b;)V */
/* .line 19 */
p1 = (( c.b.k.e1 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/b/k/e1;->k()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 20 */
this.j = v0;
/* .line 21 */
(( c.b.k.e1 ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/k/e1;->i()V
/* .line 22 */
p1 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(Lc/b/p/c;)V
int p1 = 1; // const/4 p1, 0x1
/* .line 23 */
(( c.b.k.f1 ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f1;->f(Z)V
/* .line 24 */
p1 = this.f;
/* const/16 v1, 0x20 */
(( android.view.ViewGroup ) p1 ).sendAccessibilityEvent ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final c.b.q.z0 a ( android.view.View p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Lc/b/q/z0; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Lc/b/q/z0; */
/* .line 3 */
} // :cond_0
/* instance-of v0, p1, Landroidx/appcompat/widget/Toolbar; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* check-cast p1, Landroidx/appcompat/widget/Toolbar; */
(( androidx.appcompat.widget.Toolbar ) p1 ).getWrapper ( ); // invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lc/b/q/z0;
/* .line 5 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Can\'t make a decor toolbar out of "; // const-string v2, "Can\'t make a decor toolbar out of "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 6 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p1 ).getSimpleName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
} // :cond_2
final String p1 = "null"; // const-string p1, "null"
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 26 */
/* iget-boolean v0, p0, Lc/b/k/f1;->s:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 27 */
/* iput-boolean v0, p0, Lc/b/k/f1;->s:Z */
int v0 = 1; // const/4 v0, 0x1
/* .line 28 */
(( c.b.k.f1 ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/f1;->l(Z)V
} // :cond_0
return;
} // .end method
public void a ( Float p0 ) {
/* .locals 1 */
/* .line 7 */
v0 = this.d;
c.h.n.v0 .a ( v0,p1 );
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* .line 9 */
/* iput p1, p0, Lc/b/k/f1;->p:I */
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 11 */
v0 = v0 = this.e;
/* and-int/lit8 v1, p2, 0x4 */
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 12 */
/* iput-boolean v1, p0, Lc/b/k/f1;->i:Z */
/* .line 13 */
} // :cond_0
v1 = this.e;
/* and-int/2addr p1, p2 */
/* not-int p2, p2 */
/* and-int/2addr p2, v0 */
/* or-int/2addr p1, p2 */
return;
} // .end method
public void a ( android.content.res.Configuration p0 ) {
/* .locals 0 */
/* .line 8 */
p1 = this.a;
c.b.p.a .a ( p1 );
p1 = (( c.b.p.a ) p1 ).d ( ); // invoke-virtual {p1}, Lc/b/p/a;->d()Z
(( c.b.k.f1 ) p0 ).i ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f1;->i(Z)V
return;
} // .end method
public void a ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.e;
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .line 25 */
/* iput-boolean p1, p0, Lc/b/k/f1;->q:Z */
return;
} // .end method
public Boolean a ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 4 */
/* .line 29 */
v0 = this.j;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 30 */
} // :cond_0
(( c.b.k.e1 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/k/e1;->c()Landroid/view/Menu;
if ( v0 != null) { // if-eqz v0, :cond_3
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 31 */
v2 = (( android.view.KeyEvent ) p2 ).getDeviceId ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I
} // :cond_1
int v2 = -1; // const/4 v2, -0x1
/* .line 32 */
} // :goto_0
android.view.KeyCharacterMap .load ( v2 );
/* .line 33 */
v2 = (( android.view.KeyCharacterMap ) v2 ).getKeyboardType ( ); // invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I
int v3 = 1; // const/4 v3, 0x1
/* if-eq v2, v3, :cond_2 */
} // :cond_2
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
p1 = /* .line 34 */
} // :cond_3
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 25 */
v0 = this.v;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 26 */
(( c.b.p.m ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/m;->a()V
int v0 = 0; // const/4 v0, 0x0
/* .line 27 */
this.v = v0;
} // :cond_0
return;
} // .end method
public final void b ( android.view.View p0 ) {
/* .locals 5 */
/* .line 1 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout; */
this.c = v0;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) v0 ).setActionBarVisibilityCallback ( p0 ); // invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Landroidx/appcompat/widget/ActionBarOverlayLayout$d;)V
/* .line 3 */
} // :cond_0
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
(( c.b.k.f1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/f1;->a(Landroid/view/View;)Lc/b/q/z0;
this.e = v0;
/* .line 4 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroidx/appcompat/widget/ActionBarContextView; */
this.f = v0;
/* .line 5 */
(( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
/* check-cast p1, Landroidx/appcompat/widget/ActionBarContainer; */
this.d = p1;
/* .line 6 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_7
v1 = this.f;
if ( v1 != null) { // if-eqz v1, :cond_7
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 7 */
this.a = p1;
/* .line 8 */
p1 = p1 = this.e;
/* and-int/lit8 p1, p1, 0x4 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 9 */
/* iput-boolean v0, p0, Lc/b/k/f1;->i:Z */
/* .line 10 */
} // :cond_2
v2 = this.a;
c.b.p.a .a ( v2 );
/* .line 11 */
v3 = (( c.b.p.a ) v2 ).a ( ); // invoke-virtual {v2}, Lc/b/p/a;->a()Z
/* if-nez v3, :cond_4 */
if ( p1 != null) { // if-eqz p1, :cond_3
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
} // :cond_4
} // :goto_1
int p1 = 1; // const/4 p1, 0x1
} // :goto_2
(( c.b.k.f1 ) p0 ).k ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f1;->k(Z)V
/* .line 12 */
p1 = (( c.b.p.a ) v2 ).d ( ); // invoke-virtual {v2}, Lc/b/p/a;->d()Z
(( c.b.k.f1 ) p0 ).i ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f1;->i(Z)V
/* .line 13 */
p1 = this.a;
int v2 = 0; // const/4 v2, 0x0
v3 = c.b.j.ActionBar;
(( android.content.Context ) p1 ).obtainStyledAttributes ( v2, v3, v4, v1 ); // invoke-virtual {p1, v2, v3, v4, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
/* .line 14 */
v2 = (( android.content.res.TypedArray ) p1 ).getBoolean ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 15 */
(( c.b.k.f1 ) p0 ).j ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/f1;->j(Z)V
/* .line 16 */
} // :cond_5
v0 = (( android.content.res.TypedArray ) p1 ).getDimensionPixelSize ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
if ( v0 != null) { // if-eqz v0, :cond_6
/* int-to-float v0, v0 */
/* .line 17 */
(( c.b.k.f1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/f1;->a(F)V
/* .line 18 */
} // :cond_6
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
return;
/* .line 19 */
} // :cond_7
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* const-class v1, Lc/b/k/f1; */
(( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " can only be used with a compatible window decor layout"; // const-string v1, " can only be used with a compatible window decor layout"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void b ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 24 */
v0 = this.e;
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 3 */
/* .line 20 */
/* iget-boolean v0, p0, Lc/b/k/f1;->m:Z */
/* if-ne p1, v0, :cond_0 */
return;
/* .line 21 */
} // :cond_0
/* iput-boolean p1, p0, Lc/b/k/f1;->m:Z */
/* .line 22 */
v0 = this.n;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 23 */
v2 = this.n;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/b/k/b; */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/k/f1;->s:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Lc/b/k/f1;->s:Z */
/* .line 3 */
(( c.b.k.f1 ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/f1;->l(Z)V
} // :cond_0
return;
} // .end method
public void c ( Boolean p0 ) {
/* .locals 1 */
/* .line 4 */
/* iget-boolean v0, p0, Lc/b/k/f1;->i:Z */
/* if-nez v0, :cond_0 */
/* .line 5 */
(( c.b.k.f1 ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f1;->d(Z)V
} // :cond_0
return;
} // .end method
public void d ( ) {
/* .locals 0 */
return;
} // .end method
public void d ( Boolean p0 ) {
/* .locals 1 */
int v0 = 4; // const/4 v0, 0x4
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 4; // const/4 p1, 0x4
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :goto_0
(( c.b.k.f1 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/k/f1;->a(II)V
return;
} // .end method
public void e ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lc/b/k/f1;->w:Z */
/* if-nez p1, :cond_0 */
/* .line 2 */
p1 = this.v;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
(( c.b.p.m ) p1 ).a ( ); // invoke-virtual {p1}, Lc/b/p/m;->a()V
} // :cond_0
return;
} // .end method
public void f ( Boolean p0 ) {
/* .locals 8 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( c.b.k.f1 ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/f1;->p()V
/* .line 2 */
} // :cond_0
(( c.b.k.f1 ) p0 ).n ( ); // invoke-virtual {p0}, Lc/b/k/f1;->n()V
/* .line 3 */
} // :goto_0
v0 = (( c.b.k.f1 ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/f1;->o()Z
int v1 = 4; // const/4 v1, 0x4
/* const/16 v2, 0x8 */
int v3 = 0; // const/4 v3, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
/* const-wide/16 v4, 0x64 */
/* const-wide/16 v6, 0xc8 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
p1 = this.e;
/* .line 5 */
v0 = this.f;
(( c.b.q.b ) v0 ).a ( v3, v6, v7 ); // invoke-virtual {v0, v3, v6, v7}, Lc/b/q/b;->a(IJ)Lc/h/n/c1;
/* .line 6 */
} // :cond_1
p1 = this.e;
/* .line 7 */
p1 = this.f;
(( c.b.q.b ) p1 ).a ( v2, v4, v5 ); // invoke-virtual {p1, v2, v4, v5}, Lc/b/q/b;->a(IJ)Lc/h/n/c1;
/* .line 8 */
} // :goto_1
/* new-instance v1, Lc/b/p/m; */
/* invoke-direct {v1}, Lc/b/p/m;-><init>()V */
/* .line 9 */
(( c.b.p.m ) v1 ).a ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lc/b/p/m;->a(Lc/h/n/c1;Lc/h/n/c1;)Lc/b/p/m;
/* .line 10 */
(( c.b.p.m ) v1 ).c ( ); // invoke-virtual {v1}, Lc/b/p/m;->c()V
} // :cond_2
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 11 */
p1 = this.e;
/* .line 12 */
p1 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) p1 ).setVisibility ( v3 ); // invoke-virtual {p1, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V
/* .line 13 */
} // :cond_3
p1 = this.e;
/* .line 14 */
p1 = this.f;
(( androidx.appcompat.widget.ActionBarContextView ) p1 ).setVisibility ( v2 ); // invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V
} // :goto_2
return;
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 15 */
v0 = this.e;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 16 */
v0 = this.e;
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.e;
} // .end method
public void g ( Boolean p0 ) {
/* .locals 4 */
/* .line 2 */
v0 = this.v;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.b.p.m ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/m;->a()V
/* .line 4 */
} // :cond_0
/* iget v0, p0, Lc/b/k/f1;->p:I */
/* if-nez v0, :cond_4 */
/* iget-boolean v0, p0, Lc/b/k/f1;->w:Z */
/* if-nez v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 5 */
} // :cond_1
v0 = this.d;
/* const/high16 v1, 0x3f800000 # 1.0f */
(( android.widget.FrameLayout ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setAlpha(F)V
/* .line 6 */
v0 = this.d;
int v1 = 1; // const/4 v1, 0x1
(( androidx.appcompat.widget.ActionBarContainer ) v0 ).setTransitioning ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V
/* .line 7 */
/* new-instance v0, Lc/b/p/m; */
/* invoke-direct {v0}, Lc/b/p/m;-><init>()V */
/* .line 8 */
v2 = this.d;
v2 = (( android.widget.FrameLayout ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/widget/FrameLayout;->getHeight()I
/* neg-int v2, v2 */
/* int-to-float v2, v2 */
if ( p1 != null) { // if-eqz p1, :cond_2
int p1 = 2; // const/4 p1, 0x2
/* new-array p1, p1, [I */
/* .line 9 */
/* fill-array-data p1, :array_0 */
/* .line 10 */
v3 = this.d;
(( android.widget.FrameLayout ) v3 ).getLocationInWindow ( p1 ); // invoke-virtual {v3, p1}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V
/* .line 11 */
/* aget p1, p1, v1 */
/* int-to-float p1, p1 */
/* sub-float/2addr v2, p1 */
/* .line 12 */
} // :cond_2
p1 = this.d;
c.h.n.v0 .a ( p1 );
(( c.h.n.c1 ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Lc/h/n/c1;->b(F)Lc/h/n/c1;
/* .line 13 */
v1 = this.A;
(( c.h.n.c1 ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/h/n/c1;->a(Lc/h/n/f1;)Lc/h/n/c1;
/* .line 14 */
(( c.b.p.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/m;->a(Lc/h/n/c1;)Lc/b/p/m;
/* .line 15 */
/* iget-boolean p1, p0, Lc/b/k/f1;->q:Z */
if ( p1 != null) { // if-eqz p1, :cond_3
p1 = this.g;
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 16 */
c.h.n.v0 .a ( p1 );
(( c.h.n.c1 ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Lc/h/n/c1;->b(F)Lc/h/n/c1;
(( c.b.p.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/m;->a(Lc/h/n/c1;)Lc/b/p/m;
/* .line 17 */
} // :cond_3
p1 = c.b.k.f1.B;
(( c.b.p.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/m;->a(Landroid/view/animation/Interpolator;)Lc/b/p/m;
/* const-wide/16 v1, 0xfa */
/* .line 18 */
(( c.b.p.m ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/b/p/m;->a(J)Lc/b/p/m;
/* .line 19 */
p1 = this.y;
(( c.b.p.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/m;->a(Lc/h/n/d1;)Lc/b/p/m;
/* .line 20 */
this.v = v0;
/* .line 21 */
(( c.b.p.m ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/p/m;->c()V
/* .line 22 */
} // :cond_4
p1 = this.y;
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
return;
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
} // .end array-data
} // .end method
public android.content.Context h ( ) {
/* .locals 4 */
/* .line 30 */
v0 = this.b;
/* if-nez v0, :cond_1 */
/* .line 31 */
/* new-instance v0, Landroid/util/TypedValue; */
/* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
/* .line 32 */
v1 = this.a;
(( android.content.Context ) v1 ).getTheme ( ); // invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
/* .line 33 */
int v3 = 1; // const/4 v3, 0x1
(( android.content.res.Resources$Theme ) v1 ).resolveAttribute ( v2, v0, v3 ); // invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
/* .line 34 */
/* iget v0, v0, Landroid/util/TypedValue;->resourceId:I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 35 */
/* new-instance v1, Landroid/view/ContextThemeWrapper; */
v2 = this.a;
/* invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V */
this.b = v1;
/* .line 36 */
} // :cond_0
v0 = this.a;
this.b = v0;
/* .line 37 */
} // :cond_1
} // :goto_0
v0 = this.b;
} // .end method
public void h ( Boolean p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.v;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( c.b.p.m ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/m;->a()V
/* .line 3 */
} // :cond_0
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
(( androidx.appcompat.widget.ActionBarContainer ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V
/* .line 4 */
/* iget v0, p0, Lc/b/k/f1;->p:I */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_4 */
/* iget-boolean v0, p0, Lc/b/k/f1;->w:Z */
/* if-nez v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 5 */
} // :cond_1
v0 = this.d;
(( android.widget.FrameLayout ) v0 ).setTranslationY ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V
/* .line 6 */
v0 = this.d;
v0 = (( android.widget.FrameLayout ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I
/* neg-int v0, v0 */
/* int-to-float v0, v0 */
if ( p1 != null) { // if-eqz p1, :cond_2
int p1 = 2; // const/4 p1, 0x2
/* new-array p1, p1, [I */
/* .line 7 */
/* fill-array-data p1, :array_0 */
/* .line 8 */
v2 = this.d;
(( android.widget.FrameLayout ) v2 ).getLocationInWindow ( p1 ); // invoke-virtual {v2, p1}, Landroid/widget/FrameLayout;->getLocationInWindow([I)V
int v2 = 1; // const/4 v2, 0x1
/* .line 9 */
/* aget p1, p1, v2 */
/* int-to-float p1, p1 */
/* sub-float/2addr v0, p1 */
/* .line 10 */
} // :cond_2
p1 = this.d;
(( android.widget.FrameLayout ) p1 ).setTranslationY ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V
/* .line 11 */
/* new-instance p1, Lc/b/p/m; */
/* invoke-direct {p1}, Lc/b/p/m;-><init>()V */
/* .line 12 */
v2 = this.d;
c.h.n.v0 .a ( v2 );
(( c.h.n.c1 ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Lc/h/n/c1;->b(F)Lc/h/n/c1;
/* .line 13 */
v3 = this.A;
(( c.h.n.c1 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lc/h/n/c1;->a(Lc/h/n/f1;)Lc/h/n/c1;
/* .line 14 */
(( c.b.p.m ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Lc/b/p/m;->a(Lc/h/n/c1;)Lc/b/p/m;
/* .line 15 */
/* iget-boolean v2, p0, Lc/b/k/f1;->q:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
v2 = this.g;
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 16 */
(( android.view.View ) v2 ).setTranslationY ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->setTranslationY(F)V
/* .line 17 */
v0 = this.g;
c.h.n.v0 .a ( v0 );
(( c.h.n.c1 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/h/n/c1;->b(F)Lc/h/n/c1;
(( c.b.p.m ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/p/m;->a(Lc/h/n/c1;)Lc/b/p/m;
/* .line 18 */
} // :cond_3
v0 = c.b.k.f1.C;
(( c.b.p.m ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/p/m;->a(Landroid/view/animation/Interpolator;)Lc/b/p/m;
/* const-wide/16 v0, 0xfa */
/* .line 19 */
(( c.b.p.m ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lc/b/p/m;->a(J)Lc/b/p/m;
/* .line 20 */
v0 = this.z;
(( c.b.p.m ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/p/m;->a(Lc/h/n/d1;)Lc/b/p/m;
/* .line 21 */
this.v = p1;
/* .line 22 */
(( c.b.p.m ) p1 ).c ( ); // invoke-virtual {p1}, Lc/b/p/m;->c()V
/* .line 23 */
} // :cond_4
p1 = this.d;
/* const/high16 v0, 0x3f800000 # 1.0f */
(( android.widget.FrameLayout ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setAlpha(F)V
/* .line 24 */
p1 = this.d;
(( android.widget.FrameLayout ) p1 ).setTranslationY ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V
/* .line 25 */
/* iget-boolean p1, p0, Lc/b/k/f1;->q:Z */
if ( p1 != null) { // if-eqz p1, :cond_5
p1 = this.g;
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 26 */
(( android.view.View ) p1 ).setTranslationY ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V
/* .line 27 */
} // :cond_5
p1 = this.z;
int v0 = 0; // const/4 v0, 0x0
/* .line 28 */
} // :goto_0
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 29 */
c.h.n.v0 .I ( p1 );
} // :cond_6
return;
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
} // .end array-data
} // .end method
public final void i ( Boolean p0 ) {
/* .locals 4 */
/* .line 1 */
/* iput-boolean p1, p0, Lc/b/k/f1;->o:Z */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 2 */
p1 = this.e;
/* .line 3 */
p1 = this.d;
v0 = this.h;
(( androidx.appcompat.widget.ActionBarContainer ) p1 ).setTabContainer ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lc/b/q/c2;)V
/* .line 4 */
} // :cond_0
p1 = this.d;
(( androidx.appcompat.widget.ActionBarContainer ) p1 ).setTabContainer ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lc/b/q/c2;)V
/* .line 5 */
p1 = this.e;
v0 = this.h;
/* .line 6 */
} // :goto_0
p1 = (( c.b.k.f1 ) p0 ).m ( ); // invoke-virtual {p0}, Lc/b/k/f1;->m()I
int v0 = 2; // const/4 v0, 0x2
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-ne p1, v0, :cond_1 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
} // :goto_1
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_3
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 8 */
(( android.widget.HorizontalScrollView ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V
/* .line 9 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 10 */
c.h.n.v0 .I ( v0 );
} // :cond_2
/* const/16 v3, 0x8 */
/* .line 11 */
(( android.widget.HorizontalScrollView ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V
/* .line 12 */
} // :cond_3
} // :goto_2
v0 = this.e;
/* iget-boolean v3, p0, Lc/b/k/f1;->o:Z */
/* if-nez v3, :cond_4 */
if ( p1 != null) { // if-eqz p1, :cond_4
int v3 = 1; // const/4 v3, 0x1
} // :cond_4
int v3 = 0; // const/4 v3, 0x0
} // :goto_3
/* .line 13 */
v0 = this.c;
/* iget-boolean v3, p0, Lc/b/k/f1;->o:Z */
/* if-nez v3, :cond_5 */
if ( p1 != null) { // if-eqz p1, :cond_5
} // :cond_5
int v1 = 0; // const/4 v1, 0x0
} // :goto_4
(( androidx.appcompat.widget.ActionBarOverlayLayout ) v0 ).setHasNonEmbeddedTabs ( v1 ); // invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V
return;
} // .end method
public void j ( Boolean p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 1 */
v0 = this.c;
v0 = (( androidx.appcompat.widget.ActionBarOverlayLayout ) v0 ).j ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"; // const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 3 */
} // :cond_1
} // :goto_0
/* iput-boolean p1, p0, Lc/b/k/f1;->x:Z */
/* .line 4 */
v0 = this.c;
(( androidx.appcompat.widget.ActionBarOverlayLayout ) v0 ).setHideOnContentScrollEnabled ( p1 ); // invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V
return;
} // .end method
public void k ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
return;
} // .end method
public void l ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = this.k;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.k = v0;
/* .line 4 */
this.l = v0;
} // :cond_0
return;
} // .end method
public final void l ( Boolean p0 ) {
/* .locals 3 */
/* .line 5 */
/* iget-boolean v0, p0, Lc/b/k/f1;->r:Z */
/* iget-boolean v1, p0, Lc/b/k/f1;->s:Z */
/* iget-boolean v2, p0, Lc/b/k/f1;->t:Z */
v0 = c.b.k.f1 .a ( v0,v1,v2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
/* iget-boolean v0, p0, Lc/b/k/f1;->u:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
/* iput-boolean v0, p0, Lc/b/k/f1;->u:Z */
/* .line 8 */
(( c.b.k.f1 ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f1;->h(Z)V
/* .line 9 */
} // :cond_0
/* iget-boolean v0, p0, Lc/b/k/f1;->u:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 10 */
/* iput-boolean v0, p0, Lc/b/k/f1;->u:Z */
/* .line 11 */
(( c.b.k.f1 ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f1;->g(Z)V
} // :cond_1
} // :goto_0
return;
} // .end method
public Integer m ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.e;
} // .end method
public final void n ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/k/f1;->t:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Lc/b/k/f1;->t:Z */
/* .line 3 */
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) v1 ).setShowingForActionMode ( v0 ); // invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V
/* .line 5 */
} // :cond_0
(( c.b.k.f1 ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/f1;->l(Z)V
} // :cond_1
return;
} // .end method
public final Boolean o ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
v0 = c.h.n.v0 .D ( v0 );
} // .end method
public final void p ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/k/f1;->t:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Lc/b/k/f1;->t:Z */
/* .line 3 */
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( androidx.appcompat.widget.ActionBarOverlayLayout ) v1 ).setShowingForActionMode ( v0 ); // invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
(( c.b.k.f1 ) p0 ).l ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/f1;->l(Z)V
} // :cond_1
return;
} // .end method
