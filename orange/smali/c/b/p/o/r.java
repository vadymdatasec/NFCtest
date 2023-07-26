public class c.b.p.o.r extends c.b.p.o.q implements android.view.ActionProvider$VisibilityListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.h.n.f d;
	 /* # direct methods */
	 public c.b.p.o.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Lc/b/p/o/q;-><init>(Lc/b/p/o/v;Landroid/content/Context;Landroid/view/ActionProvider;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View a ( android.view.MenuItem p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( android.view.ActionProvider ) v0 ).onCreateActionView ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;
	 } // .end method
	 public void a ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 this.d = p1;
		 /* .line 3 */
		 v0 = this.b;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* move-object p1, p0 */
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :goto_0
	 (( android.view.ActionProvider ) v0 ).setVisibilityListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V
	 return;
} // .end method
public Boolean b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 v0 = 	 (( android.view.ActionProvider ) v0 ).isVisible ( ); // invoke-virtual {v0}, Landroid/view/ActionProvider;->isVisible()Z
} // .end method
public Boolean e ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 v0 = 	 (( android.view.ActionProvider ) v0 ).overridesItemVisibility ( ); // invoke-virtual {v0}, Landroid/view/ActionProvider;->overridesItemVisibility()Z
} // .end method
public void onActionProviderVisibilityChanged ( Boolean p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
	 } // :cond_0
	 return;
} // .end method
