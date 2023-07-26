public class c.h.n.j1 extends c.h.n.l1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.WindowInsets$Builder c;
	 /* # direct methods */
	 public c.h.n.j1 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/h/n/l1;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Landroid/view/WindowInsets$Builder; */
		 /* invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V */
		 this.c = v0;
		 return;
	 } // .end method
	 public c.h.n.j1 ( ) {
		 /* .locals 1 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1}, Lc/h/n/l1;-><init>(Lc/h/n/u1;)V */
		 /* .line 4 */
		 (( c.h.n.u1 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/h/n/u1;->k()Landroid/view/WindowInsets;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 5 */
			 /* new-instance v0, Landroid/view/WindowInsets$Builder; */
			 /* invoke-direct {v0, p1}, Landroid/view/WindowInsets$Builder;-><init>(Landroid/view/WindowInsets;)V */
			 /* .line 6 */
		 } // :cond_0
		 /* new-instance v0, Landroid/view/WindowInsets$Builder; */
		 /* invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V */
	 } // :goto_0
	 this.c = v0;
	 return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 (( c.h.g.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;
	 (( android.view.WindowInsets$Builder ) v0 ).setMandatorySystemGestureInsets ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setMandatorySystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;
	 return;
} // .end method
public c.h.n.u1 b ( ) {
	 /* .locals 2 */
	 /* .line 2 */
	 (( c.h.n.l1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/n/l1;->a()V
	 /* .line 3 */
	 v0 = this.c;
	 /* .line 4 */
	 (( android.view.WindowInsets$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;
	 /* .line 5 */
	 c.h.n.u1 .a ( v0 );
	 /* .line 6 */
	 v1 = this.b;
	 (( c.h.n.u1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/n/u1;->a([Lc/h/g/b;)V
} // .end method
public void b ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 (( c.h.g.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;
	 (( android.view.WindowInsets$Builder ) v0 ).setStableInsets ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setStableInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;
	 return;
} // .end method
public void c ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 (( c.h.g.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;
	 (( android.view.WindowInsets$Builder ) v0 ).setSystemGestureInsets ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemGestureInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;
	 return;
} // .end method
public void d ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 (( c.h.g.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;
	 (( android.view.WindowInsets$Builder ) v0 ).setSystemWindowInsets ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setSystemWindowInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;
	 return;
} // .end method
public void e ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 (( c.h.g.b ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/g/b;->a()Landroid/graphics/Insets;
	 (( android.view.WindowInsets$Builder ) v0 ).setTappableElementInsets ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/WindowInsets$Builder;->setTappableElementInsets(Landroid/graphics/Insets;)Landroid/view/WindowInsets$Builder;
	 return;
} // .end method
