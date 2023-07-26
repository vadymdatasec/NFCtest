public class m.b.k.i0 extends m.b.k.u {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public m.b.k.i0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lm/b/k/u;-><init>(II)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( ) {
		 /* .locals 1 */
		 final String v0 = "nth-of-type"; // const-string v0, "nth-of-type"
	 } // .end method
	 public Integer b ( Object p0, Object p1 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 (( m.b.i.l ) p2 ).l ( ); // invoke-virtual {p2}, Lm/b/i/l;->l()Lm/b/i/l;
		 (( m.b.i.l ) p1 ).r ( ); // invoke-virtual {p1}, Lm/b/i/l;->r()Lm/b/k/f;
		 /* .line 2 */
		 (( java.util.ArrayList ) p1 ).iterator ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
		 int v0 = 0; // const/4 v0, 0x0
	 v1 = 	 } // :cond_0
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* check-cast v1, Lm/b/i/l; */
		 /* .line 3 */
		 (( m.b.i.l ) v1 ).B ( ); // invoke-virtual {v1}, Lm/b/i/l;->B()Lm/b/j/g0;
		 (( m.b.i.l ) p2 ).B ( ); // invoke-virtual {p2}, Lm/b/i/l;->B()Lm/b/j/g0;
		 v2 = 		 (( m.b.j.g0 ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Lm/b/j/g0;->equals(Ljava/lang/Object;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* add-int/lit8 v0, v0, 0x1 */
		 } // :cond_1
		 /* if-ne v1, p2, :cond_0 */
	 } // :cond_2
} // .end method
