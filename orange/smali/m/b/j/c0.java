public class m.b.j.c0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public java.lang.String b;
	 /* # direct methods */
	 public m.b.j.c0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Lm/b/j/c0;->a:I */
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 public m.b.j.c0 ( ) {
		 /* .locals 0 */
		 /* .line 4 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 5 */
		 java.lang.String .format ( p2,p3 );
		 this.b = p2;
		 /* .line 6 */
		 /* iput p1, p0, Lm/b/j/c0;->a:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 /* iget v1, p0, Lm/b/j/c0;->a:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ": "; // const-string v1, ": "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.b;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
