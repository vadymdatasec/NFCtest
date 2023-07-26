public class c.h.n.p1 extends c.h.n.o1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.h.g.b n;
	 public c.h.g.b o;
	 public c.h.g.b p;
	 /* # direct methods */
	 public c.h.n.p1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lc/h/n/o1;-><init>(Lc/h/n/u1;Landroid/view/WindowInsets;)V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 this.n = p1;
		 /* .line 3 */
		 this.o = p1;
		 /* .line 4 */
		 this.p = p1;
		 return;
	 } // .end method
	 public c.h.n.p1 ( ) {
		 /* .locals 0 */
		 /* .line 5 */
		 /* invoke-direct {p0, p1, p2}, Lc/h/n/o1;-><init>(Lc/h/n/u1;Lc/h/n/o1;)V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 6 */
		 this.n = p1;
		 /* .line 7 */
		 this.o = p1;
		 /* .line 8 */
		 this.p = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public c.h.g.b e ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.o;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 v0 = this.c;
		 /* .line 3 */
		 (( android.view.WindowInsets ) v0 ).getMandatorySystemGestureInsets ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;
		 c.h.g.b .a ( v0 );
		 this.o = v0;
		 /* .line 4 */
	 } // :cond_0
	 v0 = this.o;
} // .end method
public c.h.g.b g ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.n;
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 v0 = this.c;
	 (( android.view.WindowInsets ) v0 ).getSystemGestureInsets ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemGestureInsets()Landroid/graphics/Insets;
	 c.h.g.b .a ( v0 );
	 this.n = v0;
	 /* .line 3 */
} // :cond_0
v0 = this.n;
} // .end method
public c.h.g.b i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.p;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.c;
(( android.view.WindowInsets ) v0 ).getTappableElementInsets ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets;->getTappableElementInsets()Landroid/graphics/Insets;
c.h.g.b .a ( v0 );
this.p = v0;
/* .line 3 */
} // :cond_0
v0 = this.p;
} // .end method
