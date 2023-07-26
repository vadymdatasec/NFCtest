public class c.b.p.h extends android.view.ActionMode {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final c.b.p.c b;
	 /* # direct methods */
	 public c.b.p.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void finish ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/c;->a()V
		 return;
	 } // .end method
	 public android.view.View getCustomView ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/c;->b()Landroid/view/View;
	 } // .end method
	 public android.view.Menu getMenu ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Lc/b/p/o/b0; */
		 v1 = this.a;
		 v2 = this.b;
		 (( c.b.p.c ) v2 ).c ( ); // invoke-virtual {v2}, Lc/b/p/c;->c()Landroid/view/Menu;
		 /* check-cast v2, Lc/h/h/a/a; */
		 /* invoke-direct {v0, v1, v2}, Lc/b/p/o/b0;-><init>(Landroid/content/Context;Lc/h/h/a/a;)V */
	 } // .end method
	 public android.view.MenuInflater getMenuInflater ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).d ( ); // invoke-virtual {v0}, Lc/b/p/c;->d()Landroid/view/MenuInflater;
	 } // .end method
	 public java.lang.CharSequence getSubtitle ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).e ( ); // invoke-virtual {v0}, Lc/b/p/c;->e()Ljava/lang/CharSequence;
	 } // .end method
	 public java.lang.Object getTag ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).f ( ); // invoke-virtual {v0}, Lc/b/p/c;->f()Ljava/lang/Object;
	 } // .end method
	 public java.lang.CharSequence getTitle ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).g ( ); // invoke-virtual {v0}, Lc/b/p/c;->g()Ljava/lang/CharSequence;
	 } // .end method
	 public Boolean getTitleOptionalHint ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( c.b.p.c ) v0 ).h ( ); // invoke-virtual {v0}, Lc/b/p/c;->h()Z
	 } // .end method
	 public void invalidate ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).i ( ); // invoke-virtual {v0}, Lc/b/p/c;->i()V
		 return;
	 } // .end method
	 public Boolean isTitleOptional ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( c.b.p.c ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/p/c;->j()Z
	 } // .end method
	 public void setCustomView ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/c;->a(Landroid/view/View;)V
		 return;
	 } // .end method
	 public void setSubtitle ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/c;->a(I)V
		 return;
	 } // .end method
	 public void setSubtitle ( java.lang.CharSequence p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/c;->a(Ljava/lang/CharSequence;)V
		 return;
	 } // .end method
	 public void setTag ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/c;->a(Ljava/lang/Object;)V
		 return;
	 } // .end method
	 public void setTitle ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/c;->b(I)V
		 return;
	 } // .end method
	 public void setTitle ( java.lang.CharSequence p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/c;->b(Ljava/lang/CharSequence;)V
		 return;
	 } // .end method
	 public void setTitleOptionalHint ( Boolean p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.p.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/b/p/c;->a(Z)V
		 return;
	 } // .end method
