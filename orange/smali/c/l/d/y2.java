public class c.l.d.y2 implements c.s.c implements c.n.y {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.n.x b;
	 public c.n.l c;
	 public c.s.b d;
	 /* # direct methods */
	 public c.l.d.y2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 this.c = p1;
		 /* .line 3 */
		 this.d = p1;
		 /* .line 4 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 /* new-instance v0, Lc/n/l; */
		 /* invoke-direct {v0, p0}, Lc/n/l;-><init>(Lc/n/j;)V */
		 this.c = v0;
		 /* .line 3 */
		 c.s.b .a ( p0 );
		 this.d = v0;
	 } // :cond_0
	 return;
} // .end method
public void a ( android.os.Bundle p0 ) {
	 /* .locals 1 */
	 /* .line 6 */
	 v0 = this.d;
	 (( c.s.b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/s/b;->a(Landroid/os/Bundle;)V
	 return;
} // .end method
public void a ( c.n.g$a p0 ) {
	 /* .locals 1 */
	 /* .line 5 */
	 v0 = this.c;
	 (( c.n.l ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/n/l;->a(Lc/n/g$a;)V
	 return;
} // .end method
public void a ( c.n.g$b p0 ) {
	 /* .locals 1 */
	 /* .line 4 */
	 v0 = this.c;
	 (( c.n.l ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lc/n/l;->d(Lc/n/g$b;)V
	 return;
} // .end method
public void b ( android.os.Bundle p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
	 (( c.s.b ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/s/b;->b(Landroid/os/Bundle;)V
	 return;
} // .end method
public androidx.savedstate.SavedStateRegistry c ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( c.l.d.y2 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/l/d/y2;->a()V
	 /* .line 2 */
	 v0 = this.d;
	 (( c.s.b ) v0 ).a ( ); // invoke-virtual {v0}, Lc/s/b;->a()Landroidx/savedstate/SavedStateRegistry;
} // .end method
public Boolean d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public c.n.x f ( ) {
/* .locals 1 */
/* .line 1 */
(( c.l.d.y2 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/l/d/y2;->a()V
/* .line 2 */
v0 = this.b;
} // .end method
public c.n.g g ( ) {
/* .locals 1 */
/* .line 1 */
(( c.l.d.y2 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/l/d/y2;->a()V
/* .line 2 */
v0 = this.c;
} // .end method
