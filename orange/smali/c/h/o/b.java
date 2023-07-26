public class c.h.o.b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.h.o.c b; //synthetic
	 /* # direct methods */
	 public c.h.o.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.b;
		 /* iget-boolean v1, v0, Lc/h/o/c;->p:Z */
		 /* if-nez v1, :cond_0 */
		 return;
		 /* .line 2 */
	 } // :cond_0
	 /* iget-boolean v1, v0, Lc/h/o/c;->n:Z */
	 int v2 = 0; // const/4 v2, 0x0
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 3 */
		 /* iput-boolean v2, v0, Lc/h/o/c;->n:Z */
		 /* .line 4 */
		 v0 = this.b;
		 (( c.h.o.a ) v0 ).h ( ); // invoke-virtual {v0}, Lc/h/o/a;->h()V
		 /* .line 5 */
	 } // :cond_1
	 v0 = this.b;
	 v0 = this.b;
	 /* .line 6 */
	 v1 = 	 (( c.h.o.a ) v0 ).f ( ); // invoke-virtual {v0}, Lc/h/o/a;->f()Z
	 /* if-nez v1, :cond_4 */
	 v1 = this.b;
	 v1 = 	 (( c.h.o.c ) v1 ).c ( ); // invoke-virtual {v1}, Lc/h/o/c;->c()Z
	 /* if-nez v1, :cond_2 */
	 /* .line 7 */
} // :cond_2
v1 = this.b;
/* iget-boolean v3, v1, Lc/h/o/c;->o:Z */
if ( v3 != null) { // if-eqz v3, :cond_3
	 /* .line 8 */
	 /* iput-boolean v2, v1, Lc/h/o/c;->o:Z */
	 /* .line 9 */
	 (( c.h.o.c ) v1 ).a ( ); // invoke-virtual {v1}, Lc/h/o/c;->a()V
	 /* .line 10 */
} // :cond_3
(( c.h.o.a ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/o/a;->a()V
/* .line 11 */
v1 = (( c.h.o.a ) v0 ).b ( ); // invoke-virtual {v0}, Lc/h/o/a;->b()I
/* .line 12 */
v0 = (( c.h.o.a ) v0 ).c ( ); // invoke-virtual {v0}, Lc/h/o/a;->c()I
/* .line 13 */
v2 = this.b;
(( c.h.o.c ) v2 ).a ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Lc/h/o/c;->a(II)V
/* .line 14 */
v0 = this.b;
v0 = this.d;
c.h.n.v0 .a ( v0,p0 );
return;
/* .line 15 */
} // :cond_4
} // :goto_0
v0 = this.b;
/* iput-boolean v2, v0, Lc/h/o/c;->p:Z */
return;
} // .end method
