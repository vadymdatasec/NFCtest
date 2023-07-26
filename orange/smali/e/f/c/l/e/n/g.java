public class e.f.c.l.e.n.g {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.f.c.l.e.n.g c;
	 /* # instance fields */
	 public final Integer a;
	 public final Integer b;
	 /* # direct methods */
	 public static e.f.c.l.e.n.g ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/c/l/e/n/g; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1, v1}, Le/f/c/l/e/n/g;-><init>(II)V */
		 return;
	 } // .end method
	 public e.f.c.l.e.n.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/f/c/l/e/n/g;->a:I */
		 /* .line 3 */
		 /* iput p2, p0, Le/f/c/l/e/n/g;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 /* const-class v1, Le/f/c/l/e/n/g; */
		 (( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = "[position = "; // const-string v1, "[position = "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Le/f/c/l/e/n/g;->a:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", length = "; // const-string v1, ", length = "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Le/f/c/l/e/n/g;->b:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = "]"; // const-string v1, "]"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
