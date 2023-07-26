public class c.b.q.j implements c.b.p.o.z$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.k b; //synthetic
	 /* # direct methods */
	 public c.b.q.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, Boolean p1 ) {
		 /* .locals 2 */
		 /* .line 4 */
		 /* instance-of v0, p1, Lc/b/p/o/g0; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 5 */
			 (( c.b.p.o.m ) p1 ).m ( ); // invoke-virtual {p1}, Lc/b/p/o/m;->m()Lc/b/p/o/m;
			 int v1 = 0; // const/4 v1, 0x0
			 (( c.b.p.o.m ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/p/o/m;->a(Z)V
			 /* .line 6 */
		 } // :cond_0
		 v0 = this.b;
		 (( c.b.p.o.b ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/p/o/b;->a()Lc/b/p/o/z$a;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 7 */
		 } // :cond_1
		 return;
	 } // .end method
	 public Boolean a ( Object p0 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p1, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 v1 = this.b;
	 /* move-object v2, p1 */
	 /* check-cast v2, Lc/b/p/o/g0; */
	 v2 = 	 (( c.b.p.o.g0 ) v2 ).getItem ( ); // invoke-virtual {v2}, Lc/b/p/o/g0;->getItem()Landroid/view/MenuItem;
	 /* iput v2, v1, Lc/b/q/k;->C:I */
	 /* .line 2 */
	 v1 = this.b;
	 (( c.b.p.o.b ) v1 ).a ( ); // invoke-virtual {v1}, Lc/b/p/o/b;->a()Lc/b/p/o/z$a;
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 v0 = 		 /* .line 3 */
	 } // :cond_1
} // .end method
