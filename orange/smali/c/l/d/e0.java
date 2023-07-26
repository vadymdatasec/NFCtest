public class c.l.d.e0 extends c.l.d.r0 implements c.n.y implements c.a.i implements c.a.k.h implements c.l.d.u1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/l/d/r0<", */
	 /* "Lc/l/d/f0;", */
	 /* ">;", */
	 /* "Lc/n/y;", */
	 /* "Lc/a/i;", */
	 /* "Lc/a/k/h;", */
	 /* "Lc/l/d/u1;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final c.l.d.f0 f; //synthetic
/* # direct methods */
public c.l.d.e0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.f = p1;
	 /* .line 2 */
	 /* invoke-direct {p0, p1}, Lc/l/d/r0;-><init>(Lc/l/d/f0;)V */
	 return;
} // .end method
/* # virtual methods */
public android.view.View a ( Integer p0 ) {
	 /* .locals 1 */
	 /* .line 4 */
	 v0 = this.f;
	 (( android.app.Activity ) v0 ).findViewById ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;
} // .end method
public void a ( c.l.d.o1 p0, androidx.fragment.app.Fragment p1 ) {
	 /* .locals 0 */
	 /* .line 3 */
	 p1 = this.f;
	 (( c.l.d.f0 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lc/l/d/f0;->a(Landroidx/fragment/app/Fragment;)V
	 return;
} // .end method
public void a ( java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.f;
	 (( c.l.d.f0 ) v0 ).dump ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Lc/l/d/f0;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
	 return;
} // .end method
public Boolean a ( ) {
	 /* .locals 1 */
	 /* .line 5 */
	 v0 = this.f;
	 (( android.app.Activity ) v0 ).getWindow ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 6 */
		 (( android.view.Window ) v0 ).peekDecorView ( ); // invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // .end method
public Boolean a ( androidx.fragment.app.Fragment p0 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 p1 = this.f;
	 p1 = 	 (( android.app.Activity ) p1 ).isFinishing ( ); // invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z
	 /* xor-int/lit8 p1, p1, 0x1 */
} // .end method
public androidx.activity.OnBackPressedDispatcher b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.f;
	 (( androidx.activity.ComponentActivity ) v0 ).b ( ); // invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->b()Landroidx/activity/OnBackPressedDispatcher;
} // .end method
public c.a.k.f d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.f;
	 (( androidx.activity.ComponentActivity ) v0 ).d ( ); // invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->d()Lc/a/k/f;
} // .end method
public c.n.x f ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.f;
	 (( androidx.activity.ComponentActivity ) v0 ).f ( ); // invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->f()Lc/n/x;
} // .end method
public c.n.g g ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.f;
	 v0 = this.k;
} // .end method
public c.l.d.f0 j ( ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = this.f;
} // .end method
public java.lang.Object j ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 (( c.l.d.e0 ) p0 ).j ( ); // invoke-virtual {p0}, Lc/l/d/e0;->j()Lc/l/d/f0;
} // .end method
public android.view.LayoutInflater k ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.f;
	 (( android.app.Activity ) v0 ).getLayoutInflater ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;
	 v1 = this.f;
	 (( android.view.LayoutInflater ) v0 ).cloneInContext ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;
} // .end method
public void l ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.f;
	 (( c.l.d.f0 ) v0 ).n ( ); // invoke-virtual {v0}, Lc/l/d/f0;->n()V
	 return;
} // .end method
