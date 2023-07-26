public class m.b.k.u0 extends m.b.k.b1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public m.b.k.u0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lm/b/k/b1;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( Object p0, Object p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( m.b.i.l ) p2 ).u ( ); // invoke-virtual {p2}, Lm/b/i/l;->u()Lm/b/k/f;
		 (( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
	 v1 = 	 } // :cond_0
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* check-cast v1, Lm/b/i/l; */
		 /* if-eq v1, p2, :cond_0 */
		 /* .line 2 */
		 v2 = this.a;
		 v1 = 		 (( m.b.k.q0 ) v2 ).a ( p1, v1 ); // invoke-virtual {v2, p1, v1}, Lm/b/k/q0;->a(Lm/b/i/l;Lm/b/i/l;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_1
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* .line 1 */
		 v1 = this.a;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v1, v0, v2 */
		 final String v1 = ":has(%s)"; // const-string v1, ":has(%s)"
		 java.lang.String .format ( v1,v0 );
	 } // .end method
