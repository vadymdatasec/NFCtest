public class c.l.d.p0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.l.d.r0 a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/l/d/r0<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.l.d.p0 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/r0<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
public static c.l.d.p0 a ( c.l.d.r0 p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lc/l/d/r0<", */
/* "*>;)", */
/* "Lc/l/d/p0;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lc/l/d/p0; */
final String v1 = "callbacks == null"; // const-string v1, "callbacks == null"
c.h.m.g .a ( p0,v1 );
/* check-cast p0, Lc/l/d/r0; */
/* invoke-direct {v0, p0}, Lc/l/d/p0;-><init>(Lc/l/d/r0;)V */
} // .end method
/* # virtual methods */
public android.view.View a ( android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).B ( ); // invoke-virtual {v0}, Lc/l/d/o1;->B()Landroid/view/LayoutInflater$Factory2;
/* .line 4 */
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 8 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).g ( ); // invoke-virtual {v0}, Lc/l/d/o1;->g()V
return;
} // .end method
public void a ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/content/res/Configuration;)V
return;
} // .end method
public void a ( android.os.Parcelable p0 ) {
/* .locals 2 */
/* .line 5 */
v0 = this.a;
/* instance-of v1, v0, Lc/n/y; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 6 */
v0 = this.e;
(( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/os/Parcelable;)V
return;
/* .line 7 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState().Call restoreAllState() if you\'re still using retainNestedNonConfig()."; // const-string v0, "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState().Call restoreAllState() if you\'re still using retainNestedNonConfig()."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( android.view.Menu p0 ) {
/* .locals 1 */
/* .line 13 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/view/Menu;)V
return;
} // .end method
public void a ( androidx.fragment.app.Fragment p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.a;
v1 = this.e;
(( c.l.d.o1 ) v1 ).a ( v0, v0, p1 ); // invoke-virtual {v1, v0, v0, p1}, Lc/l/d/o1;->a(Lc/l/d/r0;Lc/l/d/n0;Landroidx/fragment/app/Fragment;)V
return;
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 9 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Z)V
return;
} // .end method
public Boolean a ( android.view.Menu p0, android.view.MenuInflater p1 ) {
/* .locals 1 */
/* .line 11 */
v0 = this.a;
v0 = this.e;
p1 = (( c.l.d.o1 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/l/d/o1;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
} // .end method
public Boolean a ( android.view.MenuItem p0 ) {
/* .locals 1 */
/* .line 12 */
v0 = this.a;
v0 = this.e;
p1 = (( c.l.d.o1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/view/MenuItem;)Z
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).i ( ); // invoke-virtual {v0}, Lc/l/d/o1;->i()V
return;
} // .end method
public void b ( Boolean p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->b(Z)V
return;
} // .end method
public Boolean b ( android.view.Menu p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.a;
v0 = this.e;
p1 = (( c.l.d.o1 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->b(Landroid/view/Menu;)Z
} // .end method
public Boolean b ( android.view.MenuItem p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.a;
v0 = this.e;
p1 = (( c.l.d.o1 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/o1;->b(Landroid/view/MenuItem;)Z
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).j ( ); // invoke-virtual {v0}, Lc/l/d/o1;->j()V
return;
} // .end method
public void d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).l ( ); // invoke-virtual {v0}, Lc/l/d/o1;->l()V
return;
} // .end method
public void e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).m ( ); // invoke-virtual {v0}, Lc/l/d/o1;->m()V
return;
} // .end method
public void f ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).o ( ); // invoke-virtual {v0}, Lc/l/d/o1;->o()V
return;
} // .end method
public void g ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).p ( ); // invoke-virtual {v0}, Lc/l/d/o1;->p()V
return;
} // .end method
public void h ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).q ( ); // invoke-virtual {v0}, Lc/l/d/o1;->q()V
return;
} // .end method
public Boolean i ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
int v1 = 1; // const/4 v1, 0x1
v0 = (( c.l.d.o1 ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/o1;->d(Z)Z
} // .end method
public c.l.d.o1 j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
} // .end method
public void k ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).J ( ); // invoke-virtual {v0}, Lc/l/d/o1;->J()V
return;
} // .end method
public android.os.Parcelable l ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = this.e;
(( c.l.d.o1 ) v0 ).M ( ); // invoke-virtual {v0}, Lc/l/d/o1;->M()Landroid/os/Parcelable;
} // .end method
