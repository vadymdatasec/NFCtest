public class c.n.t extends android.app.Fragment {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lc/n/t$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public c.n.s b;
/* # direct methods */
public c.n.t ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroid/app/Fragment;-><init>()V */
	 return;
} // .end method
public static void a ( android.app.Activity p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* const/16 v1, 0x1d */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 2 */
	 c.n.t$a .registerIn ( p0 );
	 /* .line 3 */
} // :cond_0
(( android.app.Activity ) p0 ).getFragmentManager ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;
final String v0 = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"; // const-string v0, "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag"
/* .line 4 */
(( android.app.FragmentManager ) p0 ).findFragmentByTag ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;
/* if-nez v1, :cond_1 */
/* .line 5 */
(( android.app.FragmentManager ) p0 ).beginTransaction ( ); // invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;
/* new-instance v2, Lc/n/t; */
/* invoke-direct {v2}, Lc/n/t;-><init>()V */
(( android.app.FragmentTransaction ) v1 ).add ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;
(( android.app.FragmentTransaction ) v0 ).commit ( ); // invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I
/* .line 6 */
(( android.app.FragmentManager ) p0 ).executePendingTransactions ( ); // invoke-virtual {p0}, Landroid/app/FragmentManager;->executePendingTransactions()Z
} // :cond_1
return;
} // .end method
public static void a ( android.app.Activity p0, c.n.g$a p1 ) {
/* .locals 1 */
/* .line 7 */
/* instance-of v0, p0, Lc/n/j; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
/* check-cast p0, Lc/n/j; */
/* .line 9 */
/* instance-of v0, p0, Lc/n/l; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 10 */
	 /* check-cast p0, Lc/n/l; */
	 (( c.n.l ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/n/l;->a(Lc/n/g$a;)V
} // :cond_0
return;
} // .end method
/* # virtual methods */
public final void a ( c.n.g$a p0 ) {
/* .locals 2 */
/* .line 12 */
/* const/16 v1, 0x1d */
/* if-ge v0, v1, :cond_0 */
/* .line 13 */
(( android.app.Fragment ) p0 ).getActivity ( ); // invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;
c.n.t .a ( v0,p1 );
} // :cond_0
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 11 */
} // :cond_0
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
} // :cond_0
return;
} // .end method
public final void c ( Object p0 ) {
/* .locals 0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
} // :cond_0
return;
} // .end method
public void onActivityCreated ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V */
/* .line 2 */
p1 = this.b;
(( c.n.t ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/n/t;->a(Lc/n/s;)V
/* .line 3 */
p1 = c.n.g$a.ON_CREATE;
(( c.n.t ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/n/t;->a(Lc/n/g$a;)V
return;
} // .end method
public void onDestroy ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V */
/* .line 2 */
v0 = c.n.g$a.ON_DESTROY;
(( c.n.t ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.b = v0;
return;
} // .end method
public void onPause ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Fragment;->onPause()V */
/* .line 2 */
v0 = c.n.g$a.ON_PAUSE;
(( c.n.t ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V
return;
} // .end method
public void onResume ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Fragment;->onResume()V */
/* .line 2 */
v0 = this.b;
(( c.n.t ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/n/t;->b(Lc/n/s;)V
/* .line 3 */
v0 = c.n.g$a.ON_RESUME;
(( c.n.t ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V
return;
} // .end method
public void onStart ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Fragment;->onStart()V */
/* .line 2 */
v0 = this.b;
(( c.n.t ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lc/n/t;->c(Lc/n/s;)V
/* .line 3 */
v0 = c.n.g$a.ON_START;
(( c.n.t ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V
return;
} // .end method
public void onStop ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Fragment;->onStop()V */
/* .line 2 */
v0 = c.n.g$a.ON_STOP;
(( c.n.t ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/n/t;->a(Lc/n/g$a;)V
return;
} // .end method
