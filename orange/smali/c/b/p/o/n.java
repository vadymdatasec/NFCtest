public class c.b.p.o.n implements android.content.DialogInterface$OnKeyListener implements android.content.DialogInterface$OnClickListener implements android.content.DialogInterface$OnDismissListener implements c.b.p.o.z$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.p.o.m b;
	 public c.b.k.q c;
	 public c.b.p.o.k d;
	 public c.b.p.o.z$a e;
	 /* # direct methods */
	 public c.b.p.o.n ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 /* .line 18 */
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 19 */
			 (( android.app.Dialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
		 } // :cond_0
		 return;
	 } // .end method
	 public void a ( android.os.IBinder p0 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 /* .line 2 */
		 /* new-instance v1, Lc/b/k/p; */
		 (( c.b.p.o.m ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->e()Landroid/content/Context;
		 /* invoke-direct {v1, v2}, Lc/b/k/p;-><init>(Landroid/content/Context;)V */
		 /* .line 3 */
		 /* new-instance v2, Lc/b/p/o/k; */
		 (( c.b.k.p ) v1 ).b ( ); // invoke-virtual {v1}, Lc/b/k/p;->b()Landroid/content/Context;
		 /* invoke-direct {v2, v3, v4}, Lc/b/p/o/k;-><init>(Landroid/content/Context;I)V */
		 this.d = v2;
		 /* .line 4 */
		 (( c.b.p.o.k ) v2 ).a ( p0 ); // invoke-virtual {v2, p0}, Lc/b/p/o/k;->a(Lc/b/p/o/z$a;)V
		 /* .line 5 */
		 v2 = this.b;
		 v3 = this.d;
		 (( c.b.p.o.m ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lc/b/p/o/m;->a(Lc/b/p/o/z;)V
		 /* .line 6 */
		 v2 = this.d;
		 (( c.b.p.o.k ) v2 ).a ( ); // invoke-virtual {v2}, Lc/b/p/o/k;->a()Landroid/widget/ListAdapter;
		 (( c.b.k.p ) v1 ).a ( v2, p0 ); // invoke-virtual {v1, v2, p0}, Lc/b/k/p;->a(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;
		 /* .line 7 */
		 (( c.b.p.o.m ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->i()Landroid/view/View;
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 8 */
			 (( c.b.k.p ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/b/k/p;->a(Landroid/view/View;)Lc/b/k/p;
			 /* .line 9 */
		 } // :cond_0
		 (( c.b.p.o.m ) v0 ).g ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->g()Landroid/graphics/drawable/Drawable;
		 (( c.b.k.p ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/b/k/p;->a(Landroid/graphics/drawable/Drawable;)Lc/b/k/p;
		 (( c.b.p.o.m ) v0 ).h ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->h()Ljava/lang/CharSequence;
		 (( c.b.k.p ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lc/b/k/p;->a(Ljava/lang/CharSequence;)Lc/b/k/p;
		 /* .line 10 */
	 } // :goto_0
	 (( c.b.k.p ) v1 ).a ( p0 ); // invoke-virtual {v1, p0}, Lc/b/k/p;->a(Landroid/content/DialogInterface$OnKeyListener;)Lc/b/k/p;
	 /* .line 11 */
	 (( c.b.k.p ) v1 ).a ( ); // invoke-virtual {v1}, Lc/b/k/p;->a()Lc/b/k/q;
	 this.c = v0;
	 /* .line 12 */
	 (( android.app.Dialog ) v0 ).setOnDismissListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
	 /* .line 13 */
	 v0 = this.c;
	 (( android.app.Dialog ) v0 ).getWindow ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
	 (( android.view.Window ) v0 ).getAttributes ( ); // invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
	 /* const/16 v1, 0x3eb */
	 /* .line 14 */
	 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I */
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* .line 15 */
		 this.token = p1;
		 /* .line 16 */
	 } // :cond_1
	 /* iget p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I */
	 /* const/high16 v1, 0x20000 */
	 /* or-int/2addr p1, v1 */
	 /* iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I */
	 /* .line 17 */
	 p1 = this.c;
	 (( android.app.Dialog ) p1 ).show ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->show()V
	 return;
} // .end method
public void a ( Object p0, Boolean p1 ) {
	 /* .locals 1 */
	 /* if-nez p2, :cond_0 */
	 /* .line 20 */
	 v0 = this.b;
	 /* if-ne p1, v0, :cond_1 */
	 /* .line 21 */
} // :cond_0
(( c.b.p.o.n ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/p/o/n;->a()V
/* .line 22 */
} // :cond_1
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 23 */
} // :cond_2
return;
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 1 */
/* .line 24 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = /* .line 25 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 1 */
/* .line 1 */
p1 = this.b;
v0 = this.d;
(( c.b.p.o.k ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/o/k;->a()Landroid/widget/ListAdapter;
/* check-cast p2, Lc/b/p/o/p; */
int v0 = 0; // const/4 v0, 0x0
(( c.b.p.o.m ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Lc/b/p/o/m;->a(Landroid/view/MenuItem;I)Z
return;
} // .end method
public void onDismiss ( android.content.DialogInterface p0 ) {
/* .locals 2 */
/* .line 1 */
p1 = this.d;
v0 = this.b;
int v1 = 1; // const/4 v1, 0x1
(( c.b.p.o.k ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lc/b/p/o/k;->a(Lc/b/p/o/m;Z)V
return;
} // .end method
public Boolean onKey ( android.content.DialogInterface p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 2 */
/* const/16 v0, 0x52 */
/* if-eq p2, v0, :cond_0 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p2, v0, :cond_2 */
/* .line 1 */
} // :cond_0
v0 = (( android.view.KeyEvent ) p3 ).getAction ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
int v1 = 1; // const/4 v1, 0x1
/* if-nez v0, :cond_1 */
/* .line 2 */
v0 = (( android.view.KeyEvent ) p3 ).getRepeatCount ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->getRepeatCount()I
/* if-nez v0, :cond_1 */
/* .line 3 */
p1 = this.c;
(( android.app.Dialog ) p1 ).getWindow ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 4 */
(( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
(( android.view.View ) p1 ).getKeyDispatcherState ( ); // invoke-virtual {p1}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 6 */
	 (( android.view.KeyEvent$DispatcherState ) p1 ).startTracking ( p3, p0 ); // invoke-virtual {p1, p3, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V
	 /* .line 7 */
} // :cond_1
v0 = (( android.view.KeyEvent ) p3 ).getAction ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
/* if-ne v0, v1, :cond_2 */
v0 = (( android.view.KeyEvent ) p3 ).isCanceled ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->isCanceled()Z
/* if-nez v0, :cond_2 */
/* .line 8 */
v0 = this.c;
(( android.app.Dialog ) v0 ).getWindow ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 9 */
	 (( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 10 */
		 (( android.view.View ) v0 ).getKeyDispatcherState ( ); // invoke-virtual {v0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 11 */
			 v0 = 			 (( android.view.KeyEvent$DispatcherState ) v0 ).isTracking ( p3 ); // invoke-virtual {v0, p3}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 /* .line 12 */
				 p2 = this.b;
				 (( c.b.p.o.m ) p2 ).a ( v1 ); // invoke-virtual {p2, v1}, Lc/b/p/o/m;->a(Z)V
				 /* .line 13 */
				 /* .line 14 */
			 } // :cond_2
			 p1 = this.b;
			 int v0 = 0; // const/4 v0, 0x0
			 p1 = 			 (( c.b.p.o.m ) p1 ).performShortcut ( p2, p3, v0 ); // invoke-virtual {p1, p2, p3, v0}, Lc/b/p/o/m;->performShortcut(ILandroid/view/KeyEvent;I)Z
		 } // .end method
