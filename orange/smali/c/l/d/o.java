public class c.l.d.o extends c.l.d.p {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean c;
	 public Boolean d;
	 public c.l.d.k0 e;
	 /* # direct methods */
	 public c.l.d.o ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lc/l/d/p;-><init>(Lc/l/d/h3;Lc/h/j/c;)V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lc/l/d/o;->d:Z */
		 /* .line 3 */
		 /* iput-boolean p3, p0, Lc/l/d/o;->c:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.l.d.k0 a ( android.content.Context p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lc/l/d/o;->d:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 p1 = this.e;
			 /* .line 3 */
		 } // :cond_0
		 (( c.l.d.p ) p0 ).b ( ); // invoke-virtual {p0}, Lc/l/d/p;->b()Lc/l/d/h3;
		 (( c.l.d.h3 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
		 /* .line 4 */
		 (( c.l.d.p ) p0 ).b ( ); // invoke-virtual {p0}, Lc/l/d/p;->b()Lc/l/d/h3;
		 (( c.l.d.h3 ) v1 ).c ( ); // invoke-virtual {v1}, Lc/l/d/h3;->c()Lc/l/d/g3;
		 v2 = c.l.d.g3.c;
		 int v3 = 1; // const/4 v3, 0x1
		 /* if-ne v1, v2, :cond_1 */
		 int v1 = 1; // const/4 v1, 0x1
	 } // :cond_1
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* iget-boolean v2, p0, Lc/l/d/o;->c:Z */
/* .line 5 */
c.l.d.m0 .a ( p1,v0,v1,v2 );
this.e = p1;
/* .line 6 */
/* iput-boolean v3, p0, Lc/l/d/o;->d:Z */
} // .end method
