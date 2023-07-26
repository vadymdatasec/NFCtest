public class c.f.a.l.t {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.f.a.l.g a;
	 public c.f.a.l.g b;
	 public Integer c;
	 public c.f.a.l.g$a d;
	 public Integer e;
	 /* # direct methods */
	 public c.f.a.l.t ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 (( c.f.a.l.g ) p1 ).g ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->g()Lc/f/a/l/g;
		 this.b = v0;
		 /* .line 4 */
		 v0 = 		 (( c.f.a.l.g ) p1 ).b ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->b()I
		 /* iput v0, p0, Lc/f/a/l/t;->c:I */
		 /* .line 5 */
		 (( c.f.a.l.g ) p1 ).f ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->f()Lc/f/a/l/g$a;
		 this.d = v0;
		 /* .line 6 */
		 p1 = 		 (( c.f.a.l.g ) p1 ).a ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->a()I
		 /* iput p1, p0, Lc/f/a/l/t;->e:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.a;
		 (( c.f.a.l.g ) v0 ).h ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->h()Lc/f/a/l/g$b;
		 (( c.f.a.l.i ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
		 /* .line 2 */
		 v0 = this.b;
		 /* iget v1, p0, Lc/f/a/l/t;->c:I */
		 v2 = this.d;
		 /* iget v3, p0, Lc/f/a/l/t;->e:I */
		 (( c.f.a.l.g ) p1 ).a ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Lc/f/a/l/g;->a(Lc/f/a/l/g;ILc/f/a/l/g$a;I)Z
		 return;
	 } // .end method
	 public void b ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( c.f.a.l.g ) v0 ).h ( ); // invoke-virtual {v0}, Lc/f/a/l/g;->h()Lc/f/a/l/g$b;
		 (( c.f.a.l.i ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/l/i;->a(Lc/f/a/l/g$b;)Lc/f/a/l/g;
		 this.a = p1;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 (( c.f.a.l.g ) p1 ).g ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->g()Lc/f/a/l/g;
			 this.b = p1;
			 /* .line 3 */
			 p1 = this.a;
			 p1 = 			 (( c.f.a.l.g ) p1 ).b ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->b()I
			 /* iput p1, p0, Lc/f/a/l/t;->c:I */
			 /* .line 4 */
			 p1 = this.a;
			 (( c.f.a.l.g ) p1 ).f ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->f()Lc/f/a/l/g$a;
			 this.d = p1;
			 /* .line 5 */
			 p1 = this.a;
			 p1 = 			 (( c.f.a.l.g ) p1 ).a ( ); // invoke-virtual {p1}, Lc/f/a/l/g;->a()I
			 /* iput p1, p0, Lc/f/a/l/t;->e:I */
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 6 */
		 this.b = p1;
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 7 */
		 /* iput p1, p0, Lc/f/a/l/t;->c:I */
		 /* .line 8 */
		 v0 = c.f.a.l.g$a.c;
		 this.d = v0;
		 /* .line 9 */
		 /* iput p1, p0, Lc/f/a/l/t;->e:I */
	 } // :goto_0
	 return;
} // .end method
