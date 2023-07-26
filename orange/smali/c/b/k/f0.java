public class c.b.k.f0 extends c.b.p.n {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.k.n0 c; //synthetic
	 /* # direct methods */
	 public c.b.k.f0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* .line 2 */
		 /* invoke-direct {p0, p2}, Lc/b/p/n;-><init>(Landroid/view/Window$Callback;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final android.view.ActionMode a ( android.view.ActionMode$Callback p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Lc/b/p/g; */
		 v1 = this.c;
		 v1 = this.f;
		 /* invoke-direct {v0, v1, p1}, Lc/b/p/g;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V */
		 /* .line 2 */
		 p1 = this.c;
		 /* .line 3 */
		 (( c.b.k.n0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/b/k/n0;->a(Lc/b/p/b;)Lc/b/p/c;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 4 */
			 (( c.b.p.g ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/g;->b(Lc/b/p/c;)Landroid/view/ActionMode;
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 v0 = 		 (( c.b.k.n0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/n0;->a(Landroid/view/KeyEvent;)Z
		 /* if-nez v0, :cond_1 */
		 /* .line 2 */
		 p1 = 		 /* invoke-super {p0, p1}, Lc/b/p/n;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
		 if ( p1 != null) { // if-eqz p1, :cond_0
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean dispatchKeyShortcutEvent ( android.view.KeyEvent p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = /* invoke-super {p0, p1}, Lc/b/p/n;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z */
/* if-nez v0, :cond_1 */
v0 = this.c;
/* .line 2 */
v1 = (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
p1 = (( c.b.k.n0 ) v0 ).c ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lc/b/k/n0;->c(ILandroid/view/KeyEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public void onContentChanged ( ) {
/* .locals 0 */
return;
} // .end method
public Boolean onCreatePanelMenu ( Integer p0, android.view.Menu p1 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* .line 1 */
/* instance-of v0, p2, Lc/b/p/o/m; */
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
p1 = /* invoke-super {p0, p1, p2}, Lc/b/p/n;->onCreatePanelMenu(ILandroid/view/Menu;)Z */
} // .end method
public Boolean onMenuOpened ( Integer p0, android.view.Menu p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/b/p/n;->onMenuOpened(ILandroid/view/Menu;)Z */
/* .line 2 */
p2 = this.c;
(( c.b.k.n0 ) p2 ).i ( p1 ); // invoke-virtual {p2, p1}, Lc/b/k/n0;->i(I)V
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void onPanelClosed ( Integer p0, android.view.Menu p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/b/p/n;->onPanelClosed(ILandroid/view/Menu;)V */
/* .line 2 */
p2 = this.c;
(( c.b.k.n0 ) p2 ).j ( p1 ); // invoke-virtual {p2, p1}, Lc/b/k/n0;->j(I)V
return;
} // .end method
public Boolean onPreparePanel ( Integer p0, android.view.View p1, android.view.Menu p2 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p3, Lc/b/p/o/m; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move-object v0, p3 */
/* check-cast v0, Lc/b/p/o/m; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_1 */
/* if-nez v0, :cond_1 */
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
int v2 = 1; // const/4 v2, 0x1
/* .line 2 */
(( c.b.p.o.m ) v0 ).d ( v2 ); // invoke-virtual {v0, v2}, Lc/b/p/o/m;->d(Z)V
/* .line 3 */
} // :cond_2
p1 = /* invoke-super {p0, p1, p2, p3}, Lc/b/p/n;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 4 */
(( c.b.p.o.m ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/m;->d(Z)V
} // :cond_3
} // .end method
public void onProvideKeyboardShortcuts ( java.util.List p0, android.view.Menu p1, Integer p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Landroid/view/KeyboardShortcutGroup;", */
/* ">;", */
/* "Landroid/view/Menu;", */
/* "I)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
(( c.b.k.n0 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/b/k/n0;->a(IZ)Lc/b/k/l0;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
/* invoke-super {p0, p1, v0, p3}, Lc/b/p/n;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V */
/* .line 4 */
} // :cond_0
/* invoke-super {p0, p1, p2, p3}, Lc/b/p/n;->onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V */
} // :goto_0
return;
} // .end method
public android.view.ActionMode onWindowStartingActionMode ( android.view.ActionMode$Callback p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
v0 = this.c;
v0 = (( c.b.k.n0 ) v0 ).A ( ); // invoke-virtual {v0}, Lc/b/k/n0;->A()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
(( c.b.k.f0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f0;->a(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
/* .line 4 */
} // :cond_1
/* invoke-super {p0, p1}, Lc/b/p/n;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode; */
} // .end method
public android.view.ActionMode onWindowStartingActionMode ( android.view.ActionMode$Callback p0, Integer p1 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.c;
v0 = (( c.b.k.n0 ) v0 ).A ( ); // invoke-virtual {v0}, Lc/b/k/n0;->A()Z
if ( v0 != null) { // if-eqz v0, :cond_1
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 6 */
} // :cond_0
(( c.b.k.f0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/f0;->a(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
/* .line 7 */
} // :cond_1
} // :goto_0
/* invoke-super {p0, p1, p2}, Lc/b/p/n;->onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode; */
} // .end method
