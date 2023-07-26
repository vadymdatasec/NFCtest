public class androidx.fragment.app.FragmentManager$6 implements c.n.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String a; //synthetic
	 public final c.l.d.v1 b; //synthetic
	 public final c.n.g c; //synthetic
	 public final c.l.d.o1 d; //synthetic
	 /* # virtual methods */
	 public void a ( Object p0, c.n.g$a p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = c.n.g$a.ON_START;
		 /* if-ne p2, p1, :cond_0 */
		 /* .line 2 */
		 p1 = this.d;
		 c.l.d.o1 .a ( p1 );
		 v0 = this.a;
		 /* check-cast p1, Landroid/os/Bundle; */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 3 */
			 v0 = this.b;
			 v1 = this.a;
			 /* .line 4 */
			 p1 = this.d;
			 v0 = this.a;
			 (( c.l.d.o1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/l/d/o1;->a(Ljava/lang/String;)V
			 /* .line 5 */
		 } // :cond_0
		 p1 = c.n.g$a.ON_DESTROY;
		 /* if-ne p2, p1, :cond_1 */
		 /* .line 6 */
		 p1 = this.c;
		 (( c.n.g ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lc/n/g;->b(Lc/n/i;)V
		 /* .line 7 */
		 p1 = this.d;
		 c.l.d.o1 .b ( p1 );
		 p2 = this.a;
	 } // :cond_1
	 return;
} // .end method
