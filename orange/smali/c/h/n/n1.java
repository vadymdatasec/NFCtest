public class c.h.n.n1 extends c.h.n.m1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.h.g.b m;
	 /* # direct methods */
	 public c.h.n.n1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lc/h/n/m1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 this.m = p1;
		 return;
	 } // .end method
	 public c.h.n.n1 ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2}, Lc/h/n/m1;-><init>(Lc/h/n/u1;Lc/h/n/m1;)V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 4 */
		 this.m = p1;
		 /* .line 5 */
		 p1 = this.m;
		 this.m = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.h.n.u1 b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 (( android.view.WindowInsets ) v0 ).consumeStableInsets ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;
		 c.h.n.u1 .a ( v0 );
	 } // .end method
	 public void b ( Object p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 this.m = p1;
		 return;
	 } // .end method
	 public c.h.n.u1 c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 (( android.view.WindowInsets ) v0 ).consumeSystemWindowInsets ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;
		 c.h.n.u1 .a ( v0 );
	 } // .end method
	 public final c.h.g.b f ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.m;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 v0 = this.c;
		 /* .line 3 */
		 v0 = 		 (( android.view.WindowInsets ) v0 ).getStableInsetLeft ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I
		 v1 = this.c;
		 /* .line 4 */
		 v1 = 		 (( android.view.WindowInsets ) v1 ).getStableInsetTop ( ); // invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I
		 v2 = this.c;
		 /* .line 5 */
		 v2 = 		 (( android.view.WindowInsets ) v2 ).getStableInsetRight ( ); // invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I
		 v3 = this.c;
		 /* .line 6 */
		 v3 = 		 (( android.view.WindowInsets ) v3 ).getStableInsetBottom ( ); // invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I
		 /* .line 7 */
		 c.h.g.b .a ( v0,v1,v2,v3 );
		 this.m = v0;
		 /* .line 8 */
	 } // :cond_0
	 v0 = this.m;
} // .end method
public Boolean j ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 v0 = 	 (( android.view.WindowInsets ) v0 ).isConsumed ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z
} // .end method
