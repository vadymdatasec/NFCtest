public class c.h.n.l1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.h.n.u1 a;
	 public c.h.g.b b;
	 /* # direct methods */
	 public c.h.n.l1 ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Lc/h/n/u1; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Lc/h/n/u1;-><init>(Lc/h/n/u1;)V */
		 /* invoke-direct {p0, v0}, Lc/h/n/l1;-><init>(Lc/h/n/u1;)V */
		 return;
	 } // .end method
	 public c.h.n.l1 ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 3 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 int v1 = 1; // const/4 v1, 0x1
			 /* .line 2 */
			 v2 = 			 c.h.n.s1 .a ( v1 );
			 /* aget-object v0, v0, v2 */
			 /* .line 3 */
			 v2 = this.b;
			 int v3 = 2; // const/4 v3, 0x2
			 v4 = 			 c.h.n.s1 .a ( v3 );
			 /* aget-object v2, v2, v4 */
			 /* if-nez v2, :cond_0 */
			 /* .line 4 */
			 v2 = this.a;
			 (( c.h.n.u1 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lc/h/n/u1;->a(I)Lc/h/g/b;
		 } // :cond_0
		 /* if-nez v0, :cond_1 */
		 /* .line 5 */
		 v0 = this.a;
		 (( c.h.n.u1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/n/u1;->a(I)Lc/h/g/b;
		 /* .line 6 */
	 } // :cond_1
	 c.h.g.b .a ( v0,v2 );
	 (( c.h.n.l1 ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Lc/h/n/l1;->d(Lc/h/g/b;)V
	 /* .line 7 */
	 v0 = this.b;
	 /* const/16 v1, 0x10 */
	 v1 = 	 c.h.n.s1 .a ( v1 );
	 /* aget-object v0, v0, v1 */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 8 */
		 (( c.h.n.l1 ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Lc/h/n/l1;->c(Lc/h/g/b;)V
		 /* .line 9 */
	 } // :cond_2
	 v0 = this.b;
	 /* const/16 v1, 0x20 */
	 v1 = 	 c.h.n.s1 .a ( v1 );
	 /* aget-object v0, v0, v1 */
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 10 */
		 (( c.h.n.l1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/h/n/l1;->a(Lc/h/g/b;)V
		 /* .line 11 */
	 } // :cond_3
	 v0 = this.b;
	 /* const/16 v1, 0x40 */
	 v1 = 	 c.h.n.s1 .a ( v1 );
	 /* aget-object v0, v0, v1 */
	 if ( v0 != null) { // if-eqz v0, :cond_4
		 /* .line 12 */
		 (( c.h.n.l1 ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Lc/h/n/l1;->e(Lc/h/g/b;)V
	 } // :cond_4
	 return;
} // .end method
public void a ( Object p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public c.h.n.u1 b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( c.h.n.l1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/n/l1;->a()V
	 /* .line 2 */
	 v0 = this.a;
} // .end method
public void b ( Object p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void c ( Object p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void d ( Object p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void e ( Object p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
