public abstract class c.l.d.f0 extends androidx.activity.ComponentActivity implements c.h.e.c implements c.h.e.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.p0 j;
	 public final c.n.l k;
	 public Boolean l;
	 public Boolean m;
	 public Boolean n;
	 /* # direct methods */
	 public c.l.d.f0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/l/d/e0; */
		 /* invoke-direct {v0, p0}, Lc/l/d/e0;-><init>(Lc/l/d/f0;)V */
		 c.l.d.p0 .a ( v0 );
		 this.j = v0;
		 /* .line 3 */
		 /* new-instance v0, Lc/n/l; */
		 /* invoke-direct {v0, p0}, Lc/n/l;-><init>(Lc/n/j;)V */
		 this.k = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lc/l/d/f0;->n:Z */
		 /* .line 5 */
		 (( c.l.d.f0 ) p0 ).k ( ); // invoke-virtual {p0}, Lc/l/d/f0;->k()V
		 return;
	 } // .end method
	 public static Boolean a ( c.l.d.o1 p0, c.n.g$b p1 ) {
		 /* .locals 5 */
		 /* .line 3 */
		 (( c.l.d.o1 ) p0 ).z ( ); // invoke-virtual {p0}, Lc/l/d/o1;->z()Ljava/util/List;
		 /* .line 4 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_4
	 /* check-cast v1, Landroidx/fragment/app/Fragment; */
	 /* if-nez v1, :cond_1 */
	 /* .line 5 */
} // :cond_1
(( androidx.fragment.app.Fragment ) v1 ).v ( ); // invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->v()Ljava/lang/Object;
if ( v2 != null) { // if-eqz v2, :cond_2
	 /* .line 6 */
	 (( androidx.fragment.app.Fragment ) v1 ).l ( ); // invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->l()Lc/l/d/o1;
	 /* .line 7 */
	 v2 = 	 c.l.d.f0 .a ( v2,p1 );
	 /* or-int/2addr v0, v2 */
	 /* .line 8 */
} // :cond_2
v2 = this.T;
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_3
	 /* .line 9 */
	 (( c.l.d.y2 ) v2 ).g ( ); // invoke-virtual {v2}, Lc/l/d/y2;->g()Lc/n/g;
	 (( c.n.g ) v2 ).a ( ); // invoke-virtual {v2}, Lc/n/g;->a()Lc/n/g$b;
	 v4 = c.n.g$b.e;
	 v2 = 	 (( c.n.g$b ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lc/n/g$b;->a(Lc/n/g$b;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_3
		 /* .line 10 */
		 v0 = this.T;
		 (( c.l.d.y2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/y2;->a(Lc/n/g$b;)V
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 11 */
	 } // :cond_3
	 v2 = this.S;
	 (( c.n.l ) v2 ).a ( ); // invoke-virtual {v2}, Lc/n/l;->a()Lc/n/g$b;
	 v4 = c.n.g$b.e;
	 v2 = 	 (( c.n.g$b ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Lc/n/g$b;->a(Lc/n/g$b;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* .line 12 */
		 v0 = this.S;
		 (( c.n.l ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/n/l;->d(Lc/n/g$b;)V
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_4
} // .end method
/* # virtual methods */
public final android.view.View a ( android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.j;
	 (( c.l.d.p0 ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/l/d/p0;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
} // .end method
public final void a ( Integer p0 ) {
	 /* .locals 0 */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
return;
} // .end method
public void a ( androidx.fragment.app.Fragment p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
return;
} // .end method
public Boolean a ( android.view.View p0, android.view.Menu p1 ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
p1 = /* invoke-super {p0, v0, p1, p2}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z */
} // .end method
public void dump ( java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3 ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V */
/* .line 2 */
(( java.io.PrintWriter ) p3 ).print ( p1 ); // invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = "Local FragmentActivity "; // const-string v0, "Local FragmentActivity "
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 3 */
v0 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( v0 );
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v0 = " State:"; // const-string v0, " State:"
/* .line 4 */
(( java.io.PrintWriter ) p3 ).println ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V
/* .line 5 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 6 */
(( java.io.PrintWriter ) p3 ).print ( v0 ); // invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
final String v1 = "mCreated="; // const-string v1, "mCreated="
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 7 */
/* iget-boolean v1, p0, Lc/l/d/f0;->l:Z */
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
final String v1 = " mResumed="; // const-string v1, " mResumed="
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 8 */
/* iget-boolean v1, p0, Lc/l/d/f0;->m:Z */
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
final String v1 = " mStopped="; // const-string v1, " mStopped="
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
/* .line 9 */
/* iget-boolean v1, p0, Lc/l/d/f0;->n:Z */
(( java.io.PrintWriter ) p3 ).print ( v1 ); // invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V
/* .line 10 */
(( android.app.Activity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 11 */
c.o.a.a .a ( p0 );
(( c.o.a.a ) v1 ).a ( v0, p2, p3, p4 ); // invoke-virtual {v1, v0, p2, p3, p4}, Lc/o/a/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
/* .line 12 */
} // :cond_0
v0 = this.j;
(( c.l.d.p0 ) v0 ).j ( ); // invoke-virtual {v0}, Lc/l/d/p0;->j()Lc/l/d/o1;
(( c.l.d.o1 ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/l/d/o1;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
return;
} // .end method
public c.l.d.o1 j ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).j ( ); // invoke-virtual {v0}, Lc/l/d/p0;->j()Lc/l/d/o1;
} // .end method
public final void k ( ) {
/* .locals 3 */
/* .line 1 */
(( androidx.activity.ComponentActivity ) p0 ).c ( ); // invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->c()Landroidx/savedstate/SavedStateRegistry;
/* new-instance v1, Lc/l/d/c0; */
/* invoke-direct {v1, p0}, Lc/l/d/c0;-><init>(Lc/l/d/f0;)V */
final String v2 = "android:support:fragments"; // const-string v2, "android:support:fragments"
(( androidx.savedstate.SavedStateRegistry ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$b;)V
/* .line 2 */
/* new-instance v0, Lc/l/d/d0; */
/* invoke-direct {v0, p0}, Lc/l/d/d0;-><init>(Lc/l/d/f0;)V */
(( androidx.activity.ComponentActivity ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->a(Lc/a/j/b;)V
return;
} // .end method
public void l ( ) {
/* .locals 2 */
/* .line 1 */
} // :cond_0
(( c.l.d.f0 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/l/d/f0;->j()Lc/l/d/o1;
v1 = c.n.g$b.d;
v0 = c.l.d.f0 .a ( v0,v1 );
/* if-nez v0, :cond_0 */
return;
} // .end method
public void m ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.k;
v1 = c.n.g$a.ON_RESUME;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
/* .line 2 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).f ( ); // invoke-virtual {v0}, Lc/l/d/p0;->f()V
return;
} // .end method
public abstract void n ( ) {
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
} // .end method
public void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/l/d/p0;->k()V
/* .line 2 */
/* invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V */
return;
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/l/d/p0;->k()V
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 3 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/p0;->a(Landroid/content/res/Configuration;)V
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V */
/* .line 2 */
p1 = this.k;
v0 = c.n.g$a.ON_CREATE;
(( c.n.l ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/n/l;->a(Lc/n/g$a;)V
/* .line 3 */
p1 = this.j;
(( c.l.d.p0 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/l/d/p0;->b()V
return;
} // .end method
public Boolean onCreatePanelMenu ( Integer p0, android.view.Menu p1 ) {
/* .locals 2 */
/* if-nez p1, :cond_0 */
/* .line 1 */
p1 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z */
/* .line 2 */
v0 = this.j;
(( android.app.Activity ) p0 ).getMenuInflater ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;
p2 = (( c.l.d.p0 ) v0 ).a ( p2, v1 ); // invoke-virtual {v0, p2, v1}, Lc/l/d/p0;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
/* or-int/2addr p1, p2 */
/* .line 3 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z */
} // .end method
public android.view.View onCreateView ( android.view.View p0, java.lang.String p1, android.content.Context p2, android.util.AttributeSet p3 ) {
/* .locals 1 */
/* .line 1 */
(( c.l.d.f0 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lc/l/d/f0;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View; */
} // :cond_0
} // .end method
public android.view.View onCreateView ( java.lang.String p0, android.content.Context p1, android.util.AttributeSet p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( c.l.d.f0 ) p0 ).a ( v0, p1, p2, p3 ); // invoke-virtual {p0, v0, p1, p2, p3}, Lc/l/d/f0;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
/* if-nez v0, :cond_0 */
/* .line 4 */
/* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View; */
} // :cond_0
} // .end method
public void onDestroy ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 2 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).c ( ); // invoke-virtual {v0}, Lc/l/d/p0;->c()V
/* .line 3 */
v0 = this.k;
v1 = c.n.g$a.ON_DESTROY;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
return;
} // .end method
public void onLowMemory ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V */
/* .line 2 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/l/d/p0;->d()V
return;
} // .end method
public Boolean onMenuItemSelected ( Integer p0, android.view.MenuItem p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
int v0 = 6; // const/4 v0, 0x6
/* if-eq p1, v0, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_1
p1 = this.j;
p1 = (( c.l.d.p0 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/l/d/p0;->a(Landroid/view/MenuItem;)Z
/* .line 3 */
} // :cond_2
p1 = this.j;
p1 = (( c.l.d.p0 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lc/l/d/p0;->b(Landroid/view/MenuItem;)Z
} // .end method
public void onMultiWindowModeChanged ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/p0;->a(Z)V
return;
} // .end method
public void onNewIntent ( android.content.Intent p0 ) {
/* .locals 1 */
/* .param p1 # Landroid/content/Intent; */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "UnknownNullness" */
/* } */
} // .end annotation
} // .end param
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/l/d/p0;->k()V
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V */
return;
} // .end method
public void onPanelClosed ( Integer p0, android.view.Menu p1 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lc/l/d/p0;->a(Landroid/view/Menu;)V
/* .line 2 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V */
return;
} // .end method
public void onPause ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Lc/l/d/f0;->m:Z */
/* .line 3 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).e ( ); // invoke-virtual {v0}, Lc/l/d/p0;->e()V
/* .line 4 */
v0 = this.k;
v1 = c.n.g$a.ON_PAUSE;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
return;
} // .end method
public void onPictureInPictureModeChanged ( Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/l/d/p0;->b(Z)V
return;
} // .end method
public void onPostResume ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onPostResume()V */
/* .line 2 */
(( c.l.d.f0 ) p0 ).m ( ); // invoke-virtual {p0}, Lc/l/d/f0;->m()V
return;
} // .end method
public Boolean onPreparePanel ( Integer p0, android.view.View p1, android.view.Menu p2 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
/* .line 1 */
p1 = (( c.l.d.f0 ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lc/l/d/f0;->a(Landroid/view/View;Landroid/view/Menu;)Z
/* .line 2 */
p2 = this.j;
p2 = (( c.l.d.p0 ) p2 ).b ( p3 ); // invoke-virtual {p2, p3}, Lc/l/d/p0;->b(Landroid/view/Menu;)Z
/* or-int/2addr p1, p2 */
/* .line 3 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z */
} // .end method
public void onRequestPermissionsResult ( Integer p0, java.lang.String[] p1, Integer[] p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/l/d/p0;->k()V
/* .line 2 */
/* invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V */
return;
} // .end method
public void onResume ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/l/d/p0;->k()V
/* .line 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Lc/l/d/f0;->m:Z */
/* .line 4 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).i ( ); // invoke-virtual {v0}, Lc/l/d/p0;->i()Z
return;
} // .end method
public void onStart ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/l/d/p0;->k()V
/* .line 2 */
/* invoke-super {p0}, Landroid/app/Activity;->onStart()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Lc/l/d/f0;->n:Z */
/* .line 4 */
/* iget-boolean v0, p0, Lc/l/d/f0;->l:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Lc/l/d/f0;->l:Z */
/* .line 6 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/l/d/p0;->a()V
/* .line 7 */
} // :cond_0
v0 = this.j;
(( c.l.d.p0 ) v0 ).i ( ); // invoke-virtual {v0}, Lc/l/d/p0;->i()Z
/* .line 8 */
v0 = this.k;
v1 = c.n.g$a.ON_START;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
/* .line 9 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).g ( ); // invoke-virtual {v0}, Lc/l/d/p0;->g()V
return;
} // .end method
public void onStateNotSaved ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).k ( ); // invoke-virtual {v0}, Lc/l/d/p0;->k()V
return;
} // .end method
public void onStop ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Lc/l/d/f0;->n:Z */
/* .line 3 */
(( c.l.d.f0 ) p0 ).l ( ); // invoke-virtual {p0}, Lc/l/d/f0;->l()V
/* .line 4 */
v0 = this.j;
(( c.l.d.p0 ) v0 ).h ( ); // invoke-virtual {v0}, Lc/l/d/p0;->h()V
/* .line 5 */
v0 = this.k;
v1 = c.n.g$a.ON_STOP;
(( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$a;)V
return;
} // .end method
