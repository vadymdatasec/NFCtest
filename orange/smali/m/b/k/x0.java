public class m.b.k.x0 extends m.b.k.b1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public m.b.k.x0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lm/b/k/b1;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( Object p0, Object p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 p1 = 		 (( m.b.k.q0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lm/b/k/q0;->a(Lm/b/i/l;Lm/b/i/l;)Z
		 /* xor-int/lit8 p1, p1, 0x1 */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* .line 1 */
		 v1 = this.a;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v1, v0, v2 */
		 final String v1 = ":not%s"; // const-string v1, ":not%s"
		 java.lang.String .format ( v1,v0 );
	 } // .end method
