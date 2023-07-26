public class e.f.e.r.r.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a;
	 public final Integer b;
	 /* # direct methods */
	 public e.f.e.r.r.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/f/e/r/r/b;->a:I */
		 /* .line 3 */
		 /* iput p2, p0, Le/f/e/r/r/b;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Le/f/e/r/r/b;->b:I */
	 } // .end method
	 public final Integer b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Le/f/e/r/r/b;->a:I */
	 } // .end method
	 public final Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* instance-of v0, p1, Le/f/e/r/r/b; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 /* check-cast p1, Le/f/e/r/r/b; */
	 /* .line 3 */
	 /* iget v0, p0, Le/f/e/r/r/b;->a:I */
	 /* iget v2, p1, Le/f/e/r/r/b;->a:I */
	 /* if-ne v0, v2, :cond_1 */
	 /* iget v0, p0, Le/f/e/r/r/b;->b:I */
	 /* iget p1, p1, Le/f/e/r/r/b;->b:I */
	 /* if-ne v0, p1, :cond_1 */
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_1
} // .end method
public final Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/f/e/r/r/b;->a:I */
/* iget v1, p0, Le/f/e/r/r/b;->b:I */
/* xor-int/2addr v0, v1 */
} // .end method
public final java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Le/f/e/r/r/b;->a:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = "("; // const-string v1, "("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/f/e/r/r/b;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* const/16 v1, 0x29 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
