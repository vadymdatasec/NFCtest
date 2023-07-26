public class m.b.k.v0 extends m.b.k.b1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public m.b.k.v0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lm/b/k/b1;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( Object p0, Object p1 ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-ne p1, p2, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 (( m.b.i.l ) p2 ).l ( ); // invoke-virtual {p2}, Lm/b/i/l;->l()Lm/b/i/l;
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 /* .line 2 */
		 v1 = this.a;
		 p1 = 		 (( m.b.k.q0 ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lm/b/k/q0;->a(Lm/b/i/l;Lm/b/i/l;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_1
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* .line 1 */
		 v1 = this.a;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v1, v0, v2 */
		 final String v1 = ":ImmediateParent%s"; // const-string v1, ":ImmediateParent%s"
		 java.lang.String .format ( v1,v0 );
	 } // .end method
