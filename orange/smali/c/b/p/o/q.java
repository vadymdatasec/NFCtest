public class c.b.p.o.q extends c.h.n.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.ActionProvider b;
	 public final c.b.p.o.v c; //synthetic
	 /* # direct methods */
	 public c.b.p.o.q ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* .line 2 */
		 /* invoke-direct {p0, p2}, Lc/h/n/g;-><init>(Landroid/content/Context;)V */
		 /* .line 3 */
		 this.b = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.SubMenu p0 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 v0 = this.b;
		 v1 = this.c;
		 (( c.b.p.o.c ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Lc/b/p/o/c;->a(Landroid/view/SubMenu;)Landroid/view/SubMenu;
		 (( android.view.ActionProvider ) v0 ).onPrepareSubMenu ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V
		 return;
	 } // .end method
	 public Boolean a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( android.view.ActionProvider ) v0 ).hasSubMenu ( ); // invoke-virtual {v0}, Landroid/view/ActionProvider;->hasSubMenu()Z
	 } // .end method
	 public android.view.View c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( android.view.ActionProvider ) v0 ).onCreateActionView ( ); // invoke-virtual {v0}, Landroid/view/ActionProvider;->onCreateActionView()Landroid/view/View;
	 } // .end method
	 public Boolean d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( android.view.ActionProvider ) v0 ).onPerformDefaultAction ( ); // invoke-virtual {v0}, Landroid/view/ActionProvider;->onPerformDefaultAction()Z
	 } // .end method
