public class c.b.k.x0 extends c.b.k.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.b.q.z0 a;
	 public Boolean b;
	 public android.view.Window$Callback c;
	 public Boolean d;
	 public Boolean e;
	 public java.util.ArrayList f;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lc/b/k/b;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.lang.Runnable g;
public final androidx.appcompat.widget.Toolbar$f h;
/* # direct methods */
public c.b.k.x0 ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Lc/b/k/a;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.f = v0;
/* .line 3 */
/* new-instance v0, Lc/b/k/s0; */
/* invoke-direct {v0, p0}, Lc/b/k/s0;-><init>(Lc/b/k/x0;)V */
this.g = v0;
/* .line 4 */
/* new-instance v0, Lc/b/k/t0; */
/* invoke-direct {v0, p0}, Lc/b/k/t0;-><init>(Lc/b/k/x0;)V */
this.h = v0;
/* .line 5 */
/* new-instance v0, Lc/b/q/o2; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p1, v1}, Lc/b/q/o2;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V */
this.a = v0;
/* .line 6 */
/* new-instance v0, Lc/b/k/w0; */
/* invoke-direct {v0, p0, p3}, Lc/b/k/w0;-><init>(Lc/b/k/x0;Landroid/view/Window$Callback;)V */
this.c = v0;
/* .line 7 */
p3 = this.a;
/* .line 8 */
p3 = this.h;
(( androidx.appcompat.widget.Toolbar ) p1 ).setOnMenuItemClickListener ( p3 ); // invoke-virtual {p1, p3}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$f;)V
/* .line 9 */
p1 = this.a;
return;
} // .end method
/* # virtual methods */
public void a ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .line 3 */
v0 = v0 = this.a;
/* .line 4 */
v1 = this.a;
/* and-int/2addr p1, p2 */
/* not-int p2, p2 */
/* and-int/2addr p2, v0 */
/* or-int/2addr p1, p2 */
return;
} // .end method
public void a ( android.content.res.Configuration p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/k/a;->a(Landroid/content/res/Configuration;)V */
return;
} // .end method
public void a ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.a;
return;
} // .end method
public Boolean a ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 4 */
/* .line 7 */
(( c.b.k.x0 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/b/k/x0;->l()Landroid/view/Menu;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_2
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* .line 8 */
		 v2 = 		 (( android.view.KeyEvent ) p2 ).getDeviceId ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I
	 } // :cond_0
	 int v2 = -1; // const/4 v2, -0x1
	 /* .line 9 */
} // :goto_0
android.view.KeyCharacterMap .load ( v2 );
/* .line 10 */
v2 = (( android.view.KeyCharacterMap ) v2 ).getKeyboardType ( ); // invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I
int v3 = 1; // const/4 v3, 0x1
/* if-eq v2, v3, :cond_1 */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
p1 = /* .line 11 */
} // :cond_2
} // .end method
public Boolean a ( android.view.KeyEvent p0 ) {
/* .locals 1 */
/* .line 5 */
p1 = (( android.view.KeyEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
/* .line 6 */
(( c.b.k.x0 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/b/k/x0;->k()Z
} // :cond_0
} // .end method
public void b ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 3 */
/* .line 2 */
/* iget-boolean v0, p0, Lc/b/k/x0;->e:Z */
/* if-ne p1, v0, :cond_0 */
return;
/* .line 3 */
} // :cond_0
/* iput-boolean p1, p0, Lc/b/k/x0;->e:Z */
/* .line 4 */
v0 = this.f;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* .line 5 */
v2 = this.f;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/b/k/b; */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void c ( Boolean p0 ) {
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
(( c.b.k.x0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lc/b/k/x0;->a(II)V
return;
} // .end method
public void e ( Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.a;
} // .end method
public Boolean f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.a;
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.a;
} // .end method
public android.content.Context h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public Boolean i ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v1 = this.g;
(( android.view.ViewGroup ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 2 */
v0 = this.a;
v1 = this.g;
c.h.n.v0 .a ( v0,v1 );
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void j ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v1 = this.g;
(( android.view.ViewGroup ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z
return;
} // .end method
public Boolean k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = v0 = this.a;
} // .end method
public final android.view.Menu l ( ) {
/* .locals 3 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/k/x0;->d:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.a;
/* new-instance v1, Lc/b/k/u0; */
/* invoke-direct {v1, p0}, Lc/b/k/u0;-><init>(Lc/b/k/x0;)V */
/* new-instance v2, Lc/b/k/v0; */
/* invoke-direct {v2, p0}, Lc/b/k/v0;-><init>(Lc/b/k/x0;)V */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Lc/b/k/x0;->d:Z */
/* .line 4 */
} // :cond_0
v0 = this.a;
} // .end method
public android.view.Window$Callback m ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public void n ( ) {
/* .locals 5 */
/* .line 1 */
(( c.b.k.x0 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/b/k/x0;->l()Landroid/view/Menu;
/* .line 2 */
/* instance-of v1, v0, Lc/b/p/o/m; */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* move-object v1, v0 */
/* check-cast v1, Lc/b/p/o/m; */
} // :cond_0
/* move-object v1, v2 */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 3 */
(( c.b.p.o.m ) v1 ).s ( ); // invoke-virtual {v1}, Lc/b/p/o/m;->s()V
/* .line 4 */
} // :cond_1
try { // :try_start_0
/* .line 5 */
v3 = this.c;
v3 = int v4 = 0; // const/4 v4, 0x0
if ( v3 != null) { // if-eqz v3, :cond_2
v3 = this.c;
v2 = /* .line 6 */
/* if-nez v2, :cond_3 */
/* .line 7 */
} // :cond_2
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 8 */
(( c.b.p.o.m ) v1 ).r ( ); // invoke-virtual {v1}, Lc/b/p/o/m;->r()V
} // :cond_4
return;
/* :catchall_0 */
/* move-exception v0 */
if ( v1 != null) { // if-eqz v1, :cond_5
(( c.b.p.o.m ) v1 ).r ( ); // invoke-virtual {v1}, Lc/b/p/o/m;->r()V
/* .line 9 */
} // :cond_5
/* throw v0 */
} // .end method
