public abstract class c.h.e.p extends android.app.Activity implements c.n.j implements c.h.n.j {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.n.l b;
	 /* # direct methods */
	 public c.h.e.p ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/e/i; */
		 /* invoke-direct {v0}, Lc/e/i;-><init>()V */
		 /* .line 3 */
		 /* new-instance v0, Lc/n/l; */
		 /* invoke-direct {v0, p0}, Lc/n/l;-><init>(Lc/n/j;)V */
		 this.b = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( android.view.KeyEvent p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = 		 /* invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
	 } // .end method
	 public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
		 (( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v1 = 			 c.h.n.k .a ( v0,p1 );
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 int p1 = 1; // const/4 p1, 0x1
				 /* .line 3 */
			 } // :cond_0
			 p1 = 			 c.h.n.k .a ( p0,v0,p0,p1 );
		 } // .end method
		 public Boolean dispatchKeyShortcutEvent ( android.view.KeyEvent p0 ) {
			 /* .locals 1 */
			 /* .line 1 */
			 (( android.app.Activity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
			 (( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 v0 = 				 c.h.n.k .a ( v0,p1 );
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 int p1 = 1; // const/4 p1, 0x1
					 /* .line 3 */
				 } // :cond_0
				 p1 = 				 /* invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z */
			 } // .end method
			 public void onCreate ( android.os.Bundle p0 ) {
				 /* .locals 0 */
				 /* .annotation build Landroid/annotation/SuppressLint; */
				 /* value = { */
				 /* "RestrictedApi" */
				 /* } */
			 } // .end annotation
			 /* .line 1 */
			 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
			 /* .line 2 */
			 c.n.t .a ( p0 );
			 return;
		 } // .end method
		 public void onSaveInstanceState ( android.os.Bundle p0 ) {
			 /* .locals 2 */
			 /* .line 1 */
			 v0 = this.b;
			 v1 = c.n.g$b.d;
			 (( c.n.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/l;->a(Lc/n/g$b;)V
			 /* .line 2 */
			 /* invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V */
			 return;
		 } // .end method
