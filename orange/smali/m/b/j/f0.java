public class m.b.j.f0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public m.b.j.j3 a;
	 public Integer b;
	 public m.b.j.d0 c;
	 public m.b.j.e0 d;
	 /* # direct methods */
	 public m.b.j.f0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lm/b/j/f0;->b:I */
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 (( m.b.j.j3 ) p1 ).b ( ); // invoke-virtual {p1}, Lm/b/j/j3;->b()Lm/b/j/e0;
		 this.d = p1;
		 return;
	 } // .end method
	 public static m.b.j.f0 b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Lm/b/j/f0; */
		 /* new-instance v1, Lm/b/j/b; */
		 /* invoke-direct {v1}, Lm/b/j/b;-><init>()V */
		 /* invoke-direct {v0, v1}, Lm/b/j/f0;-><init>(Lm/b/j/j3;)V */
	 } // .end method
	 public static m.b.j.f0 c ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Lm/b/j/f0; */
		 /* new-instance v1, Lm/b/j/l3; */
		 /* invoke-direct {v1}, Lm/b/j/l3;-><init>()V */
		 /* invoke-direct {v0, v1}, Lm/b/j/f0;-><init>(Lm/b/j/j3;)V */
	 } // .end method
	 /* # virtual methods */
	 public m.b.i.i a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = 		 (( m.b.j.f0 ) p0 ).a ( ); // invoke-virtual {p0}, Lm/b/j/f0;->a()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget v0, p0, Lm/b/j/f0;->b:I */
			 m.b.j.d0 .a ( v0 );
		 } // :cond_0
		 m.b.j.d0 .b ( );
	 } // :goto_0
	 this.c = v0;
	 /* .line 2 */
	 v1 = this.a;
	 v2 = this.d;
	 (( m.b.j.j3 ) v1 ).b ( p1, p2, v0, v2 ); // invoke-virtual {v1, p1, p2, v0, v2}, Lm/b/j/j3;->b(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)Lm/b/i/i;
} // .end method
public Boolean a ( ) {
	 /* .locals 1 */
	 /* .line 3 */
	 /* iget v0, p0, Lm/b/j/f0;->b:I */
	 /* if-lez v0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
