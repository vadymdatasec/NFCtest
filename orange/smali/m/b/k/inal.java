public class inal extends m.b.k.q0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String a;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lm/b/k/q0;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( Object p0, Object p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.a;
		 p1 = 		 (( m.b.i.l ) p2 ).f ( p1 ); // invoke-virtual {p2, p1}, Lm/b/i/l;->f(Ljava/lang/String;)Z
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* .line 1 */
		 v1 = this.a;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v1, v0, v2 */
		 final String v1 = ".%s"; // const-string v1, ".%s"
		 java.lang.String .format ( v1,v0 );
	 } // .end method
