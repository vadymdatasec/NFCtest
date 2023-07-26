public abstract class c.b.k.p0 extends android.app.Dialog implements c.b.k.s {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.k.t b;
	 public final c.h.n.j c;
	 /* # direct methods */
	 public c.b.k.p0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 c.b.k.p0 .a ( p1,p2 );
		 /* invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V */
		 /* .line 2 */
		 /* new-instance v0, Lc/b/k/o0; */
		 /* invoke-direct {v0, p0}, Lc/b/k/o0;-><init>(Lc/b/k/p0;)V */
		 this.c = v0;
		 /* .line 3 */
		 (( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
		 /* .line 4 */
		 p1 = 		 c.b.k.p0 .a ( p1,p2 );
		 (( c.b.k.t ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->d(I)V
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 5 */
		 (( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/os/Bundle;)V
		 return;
	 } // .end method
	 public static Integer a ( android.content.Context p0, Integer p1 ) {
		 /* .locals 2 */
		 /* if-nez p1, :cond_0 */
		 /* .line 5 */
		 /* new-instance p1, Landroid/util/TypedValue; */
		 /* invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V */
		 /* .line 6 */
		 (( android.content.Context ) p0 ).getTheme ( ); // invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.content.res.Resources$Theme ) p0 ).resolveAttribute ( v0, p1, v1 ); // invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
		 /* .line 7 */
		 /* iget p1, p1, Landroid/util/TypedValue;->resourceId:I */
	 } // :cond_0
} // .end method
/* # virtual methods */
public c.b.k.t a ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = this.b;
	 /* if-nez v0, :cond_0 */
	 /* .line 3 */
	 c.b.k.t .a ( p0,p0 );
	 this.b = v0;
	 /* .line 4 */
} // :cond_0
v0 = this.b;
} // .end method
public c.b.p.c a ( Object p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean a ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
p1 = (( c.b.k.t ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->b(I)Z
} // .end method
public Boolean a ( android.view.KeyEvent p0 ) {
/* .locals 0 */
/* .line 8 */
p1 = /* invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
} // .end method
public void addContentView ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
/* .locals 1 */
/* .line 1 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/k/t;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
/* .locals 2 */
/* .line 1 */
(( android.app.Dialog ) p0 ).getWindow ( ); // invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).getDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;
/* .line 2 */
v1 = this.c;
p1 = c.h.n.k .a ( v1,v0,p0,p1 );
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
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(I)Landroid/view/View;
} // .end method
public void invalidateOptionsMenu ( ) {
/* .locals 1 */
/* .line 1 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/k/t;->e()V
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .line 1 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/k/t;->d()V
/* .line 2 */
/* invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V */
/* .line 3 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/os/Bundle;)V
return;
} // .end method
public void onStop ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0}, Landroid/app/Dialog;->onStop()V */
/* .line 2 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/k/t;->i()V
return;
} // .end method
public void setContentView ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->c(I)V
return;
} // .end method
public void setContentView ( android.view.View p0 ) {
/* .locals 1 */
/* .line 2 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/view/View;)V
return;
} // .end method
public void setContentView ( android.view.View p0, android.view.ViewGroup$LayoutParams p1 ) {
/* .locals 1 */
/* .line 3 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/b/k/t;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public void setTitle ( Integer p0 ) {
/* .locals 2 */
/* .line 3 */
/* invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V */
/* .line 4 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( android.app.Dialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getString ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public void setTitle ( java.lang.CharSequence p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V */
/* .line 2 */
(( c.b.k.p0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/p0;->a()Lc/b/k/t;
(( c.b.k.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/k/t;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
