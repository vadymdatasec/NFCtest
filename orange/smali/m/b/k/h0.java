public class m.b.k.h0 extends m.b.k.u {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public m.b.k.h0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lm/b/k/u;-><init>(II)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( ) {
		 /* .locals 1 */
		 final String v0 = "nth-last-of-type"; // const-string v0, "nth-last-of-type"
	 } // .end method
	 public Integer b ( Object p0, Object p1 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 (( m.b.i.l ) p2 ).l ( ); // invoke-virtual {p2}, Lm/b/i/l;->l()Lm/b/i/l;
		 (( m.b.i.l ) p1 ).r ( ); // invoke-virtual {p1}, Lm/b/i/l;->r()Lm/b/k/f;
		 /* .line 2 */
		 (( m.b.i.l ) p2 ).t ( ); // invoke-virtual {p2}, Lm/b/i/l;->t()Ljava/lang/Integer;
		 v0 = 		 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 v2 = 	 (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
	 /* if-ge v0, v2, :cond_1 */
	 /* .line 3 */
	 (( java.util.ArrayList ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v2, Lm/b/i/l; */
	 (( m.b.i.l ) v2 ).B ( ); // invoke-virtual {v2}, Lm/b/i/l;->B()Lm/b/j/g0;
	 (( m.b.i.l ) p2 ).B ( ); // invoke-virtual {p2}, Lm/b/i/l;->B()Lm/b/j/g0;
	 v2 = 	 (( m.b.j.g0 ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Lm/b/j/g0;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* add-int/lit8 v1, v1, 0x1 */
	 } // :cond_0
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
} // .end method
