public abstract class c.b.k.r extends c.l.d.f0 implements c.b.k.s implements c.h.e.j0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.k.t o;
	 public android.content.res.Resources p;
	 /* # direct methods */
	 public c.b.k.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/l/d/f0;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.b.p.c a ( Object p0 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public void a ( android.content.Intent p0 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 c.h.e.r .a ( p0,p1 );
		 return;
	 } // .end method
	 public void a ( androidx.appcompat.widget.Toolbar p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
		 (( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroidx/appcompat/widget/Toolbar;)V
		 return;
	 } // .end method
	 public void a ( Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void a ( c.h.e.k0 p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( c.h.e.k0 ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/h/e/k0;->a(Landroid/app/Activity;)Lc/h/e/k0;
		 return;
	 } // .end method
	 public final Boolean a ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 /* const/16 v0, 0x1a */
		 /* if-ge p1, v0, :cond_0 */
		 p1 = 		 (( android.view.KeyEvent ) p2 ).isCtrlPressed ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z
		 /* if-nez p1, :cond_0 */
		 /* .line 5 */
		 p1 = 		 (( android.view.KeyEvent ) p2 ).getMetaState ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I
		 p1 = 		 android.view.KeyEvent .metaStateHasNoModifiers ( p1 );
		 /* if-nez p1, :cond_0 */
		 /* .line 6 */
		 p1 = 		 (( android.view.KeyEvent ) p2 ).getRepeatCount ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I
		 /* if-nez p1, :cond_0 */
		 /* .line 7 */
		 p1 = 		 (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
		 p1 = 		 android.view.KeyEvent .isModifierKey ( p1 );
		 /* if-nez p1, :cond_0 */
		 /* .line 8 */
		 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 9 */
			 (( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 10 */
				 (( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
				 /* .line 11 */
				 p1 = 				 (( android.view.View ) p1 ).dispatchKeyShortcutEvent ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
				 if ( p1 != null) { // if-eqz p1, :cond_0
					 int p1 = 1; // const/4 p1, 0x1
				 } // :cond_0
				 int p1 = 0; // const/4 p1, 0x0
			 } // .end method
			 public void addContentView ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
				 (( c.b.k.t ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/k/t;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
				 return;
			 } // .end method
			 public void attachBaseContext ( android.content.Context p0 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 /* invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V */
				 /* .line 2 */
				 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
				 (( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/content/Context;)V
				 return;
			 } // .end method
			 public void b ( Object p0 ) {
				 /* .locals 0 */
				 return;
			 } // .end method
			 public void b ( c.h.e.k0 p0 ) {
				 /* .locals 0 */
				 return;
			 } // .end method
			 public Boolean b ( android.content.Intent p0 ) {
				 /* .locals 0 */
				 /* .line 1 */
				 p1 = 				 c.h.e.r .b ( p0,p1 );
			 } // .end method
			 public void closeOptionsMenu ( ) {
				 /* .locals 3 */
				 /* .line 1 */
				 (( c.b.k.r ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;
				 /* .line 2 */
				 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
				 int v2 = 0; // const/4 v2, 0x0
				 v1 = 				 (( android.view.Window ) v1 ).hasFeature ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 /* .line 3 */
						 v0 = 						 (( c.b.k.a ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/k/a;->e()Z
						 /* if-nez v0, :cond_1 */
						 /* .line 4 */
					 } // :cond_0
					 /* invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V */
				 } // :cond_1
				 return;
			 } // .end method
			 public void d ( Integer p0 ) {
				 /* .locals 0 */
				 return;
			 } // .end method
			 public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
				 /* .locals 3 */
				 /* .line 1 */
				 v0 = 				 (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
				 /* .line 2 */
				 (( c.b.k.r ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;
				 /* const/16 v2, 0x52 */
				 /* if-ne v0, v2, :cond_0 */
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* .line 3 */
					 v0 = 					 (( c.b.k.a ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lc/b/k/a;->a(Landroid/view/KeyEvent;)Z
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 int p1 = 1; // const/4 p1, 0x1
						 /* .line 4 */
					 } // :cond_0
					 p1 = 					 /* invoke-super {p0, p1}, Lc/h/e/p;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
				 } // .end method
				 public android.content.Intent e ( ) {
					 /* .locals 1 */
					 /* .line 1 */
					 c.h.e.r .a ( p0 );
				 } // .end method
				 public android.view.View findViewById ( Integer p0 ) {
					 /* .locals 1 */
					 /* .annotation system Ldalvik/annotation/Signature; */
					 /* value = { */
					 /* "<T:", */
					 /* "Landroid/view/View;", */
					 /* ">(I)TT;" */
					 /* } */
				 } // .end annotation
				 /* .line 1 */
				 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
				 (( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(I)Landroid/view/View;
			 } // .end method
			 public android.view.MenuInflater getMenuInflater ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
				 (( c.b.k.t ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/k/t;->b()Landroid/view/MenuInflater;
			 } // .end method
			 public android.content.res.Resources getResources ( ) {
				 /* .locals 2 */
				 /* .line 1 */
				 v0 = this.p;
				 /* if-nez v0, :cond_0 */
				 v0 = 				 c.b.q.u2 .b ( );
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 2 */
					 /* new-instance v0, Lc/b/q/u2; */
					 /* invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources; */
					 /* invoke-direct {v0, p0, v1}, Lc/b/q/u2;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V */
					 this.p = v0;
					 /* .line 3 */
				 } // :cond_0
				 v0 = this.p;
				 /* if-nez v0, :cond_1 */
				 /* invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources; */
			 } // :cond_1
		 } // .end method
		 public void invalidateOptionsMenu ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
			 (( c.b.k.t ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/k/t;->e()V
			 return;
		 } // .end method
		 public void n ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
			 (( c.b.k.t ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/k/t;->e()V
			 return;
		 } // .end method
		 public c.b.k.t o ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.o;
			 /* if-nez v0, :cond_0 */
			 /* .line 2 */
			 c.b.k.t .a ( p0,p0 );
			 this.o = v0;
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.o;
	 } // .end method
	 public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-super {p0, p1}, Lc/l/d/f0;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
		 /* .line 2 */
		 v0 = this.p;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 /* invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources; */
			 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
			 /* .line 4 */
			 v1 = this.p;
			 (( android.content.res.Resources ) v1 ).updateConfiguration ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
			 /* .line 5 */
		 } // :cond_0
		 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
		 (( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/content/res/Configuration;)V
		 return;
	 } // .end method
	 public void onContentChanged ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( c.b.k.r ) p0 ).q ( ); // invoke-virtual {p0}, Lc/b/k/r;->q()V
		 return;
	 } // .end method
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
		 /* .line 2 */
		 (( c.b.k.t ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/k/t;->d()V
		 /* .line 3 */
		 (( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/os/Bundle;)V
		 /* .line 4 */
		 /* invoke-super {p0, p1}, Lc/l/d/f0;->onCreate(Landroid/os/Bundle;)V */
		 return;
	 } // .end method
	 public void onDestroy ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Lc/l/d/f0;->onDestroy()V */
		 /* .line 2 */
		 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
		 (( c.b.k.t ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/k/t;->f()V
		 return;
	 } // .end method
	 public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 (( c.b.k.r ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/b/k/r;->a(ILandroid/view/KeyEvent;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
			 /* .line 2 */
		 } // :cond_0
		 p1 = 		 /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
	 } // .end method
	 public final Boolean onMenuItemSelected ( Integer p0, android.view.MenuItem p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 /* invoke-super {p0, p1, p2}, Lc/l/d/f0;->onMenuItemSelected(ILandroid/view/MenuItem;)Z */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
			 /* .line 2 */
		 } // :cond_0
		 (( c.b.k.r ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;
		 p2 = 		 /* .line 3 */
		 /* const v0, 0x102002c */
		 /* if-ne p2, v0, :cond_1 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 4 */
			 p1 = 			 (( c.b.k.a ) p1 ).g ( ); // invoke-virtual {p1}, Lc/b/k/a;->g()I
			 /* and-int/lit8 p1, p1, 0x4 */
			 if ( p1 != null) { // if-eqz p1, :cond_1
				 /* .line 5 */
				 p1 = 				 (( c.b.k.r ) p0 ).r ( ); // invoke-virtual {p0}, Lc/b/k/r;->r()Z
			 } // :cond_1
			 int p1 = 0; // const/4 p1, 0x0
		 } // .end method
		 public Boolean onMenuOpened ( Integer p0, android.view.Menu p1 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 p1 = 			 /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z */
		 } // .end method
		 public void onPanelClosed ( Integer p0, android.view.Menu p1 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 /* invoke-super {p0, p1, p2}, Lc/l/d/f0;->onPanelClosed(ILandroid/view/Menu;)V */
			 return;
		 } // .end method
		 public void onPostCreate ( android.os.Bundle p0 ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V */
			 /* .line 2 */
			 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
			 (( c.b.k.t ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->b(Landroid/os/Bundle;)V
			 return;
		 } // .end method
		 public void onPostResume ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* invoke-super {p0}, Lc/l/d/f0;->onPostResume()V */
			 /* .line 2 */
			 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
			 (( c.b.k.t ) v0 ).g ( ); // invoke-virtual {v0}, Lc/b/k/t;->g()V
			 return;
		 } // .end method
		 public void onSaveInstanceState ( android.os.Bundle p0 ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V */
			 /* .line 2 */
			 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
			 (( c.b.k.t ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->c(Landroid/os/Bundle;)V
			 return;
		 } // .end method
		 public void onStart ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* invoke-super {p0}, Lc/l/d/f0;->onStart()V */
			 /* .line 2 */
			 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
			 (( c.b.k.t ) v0 ).h ( ); // invoke-virtual {v0}, Lc/b/k/t;->h()V
			 return;
		 } // .end method
		 public void onStop ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* invoke-super {p0}, Lc/l/d/f0;->onStop()V */
			 /* .line 2 */
			 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
			 (( c.b.k.t ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/k/t;->i()V
			 return;
		 } // .end method
		 public void onTitleChanged ( java.lang.CharSequence p0, Integer p1 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V */
			 /* .line 2 */
			 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
			 (( c.b.k.t ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/b/k/t;->a(Ljava/lang/CharSequence;)V
			 return;
		 } // .end method
		 public void openOptionsMenu ( ) {
			 /* .locals 3 */
			 /* .line 1 */
			 (( c.b.k.r ) p0 ).p ( ); // invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;
			 /* .line 2 */
			 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
			 int v2 = 0; // const/4 v2, 0x0
			 v1 = 			 (( android.view.Window ) v1 ).hasFeature ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 3 */
					 v0 = 					 (( c.b.k.a ) v0 ).k ( ); // invoke-virtual {v0}, Lc/b/k/a;->k()Z
					 /* if-nez v0, :cond_1 */
					 /* .line 4 */
				 } // :cond_0
				 /* invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V */
			 } // :cond_1
			 return;
		 } // .end method
		 public c.b.k.a p ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
			 (( c.b.k.t ) v0 ).c ( ); // invoke-virtual {v0}, Lc/b/k/t;->c()Lc/b/k/a;
		 } // .end method
		 public void q ( ) {
			 /* .locals 0 */
			 /* .annotation runtime Ljava/lang/Deprecated; */
		 } // .end annotation
		 return;
	 } // .end method
	 public Boolean r ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( c.b.k.r ) p0 ).e ( ); // invoke-virtual {p0}, Lc/b/k/r;->e()Landroid/content/Intent;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 2 */
			 v1 = 			 (( c.b.k.r ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->b(Landroid/content/Intent;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 3 */
				 c.h.e.k0 .a ( p0 );
				 /* .line 4 */
				 (( c.b.k.r ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->a(Lc/h/e/k0;)V
				 /* .line 5 */
				 (( c.b.k.r ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->b(Lc/h/e/k0;)V
				 /* .line 6 */
				 (( c.h.e.k0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/e/k0;->a()V
				 /* .line 7 */
				 try { // :try_start_0
					 c.h.e.f .a ( p0 );
					 /* :try_end_0 */
					 /* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* .line 8 */
					 /* :catch_0 */
					 (( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
					 /* .line 9 */
				 } // :cond_0
				 (( c.b.k.r ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/r;->a(Landroid/content/Intent;)V
			 } // :goto_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_1
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public void setContentView ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
		 (( c.b.k.t ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->c(I)V
		 return;
	 } // .end method
	 public void setContentView ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
		 (( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/view/View;)V
		 return;
	 } // .end method
	 public void setContentView ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
		 /* .locals 1 */
		 /* .line 3 */
		 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
		 (( c.b.k.t ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/k/t;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 return;
	 } // .end method
	 public void setTheme ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V */
		 /* .line 2 */
		 (( c.b.k.r ) p0 ).o ( ); // invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;
		 (( c.b.k.t ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->d(I)V
		 return;
	 } // .end method
