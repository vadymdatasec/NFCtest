public class c.k.a.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Long a;
	 public final Long b;
	 /* # direct methods */
	 public c.k.a.e ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/16 v0, 0x0 */
		 /* cmp-long v2, p3, v0 */
		 /* if-nez v2, :cond_0 */
		 /* .line 2 */
		 /* iput-wide v0, p0, Lc/k/a/e;->a:J */
		 /* const-wide/16 p1, 0x1 */
		 /* .line 3 */
		 /* iput-wide p1, p0, Lc/k/a/e;->b:J */
		 return;
		 /* .line 4 */
	 } // :cond_0
	 /* iput-wide p1, p0, Lc/k/a/e;->a:J */
	 /* .line 5 */
	 /* iput-wide p3, p0, Lc/k/a/e;->b:J */
	 return;
} // .end method
/* # virtual methods */
public Double a ( ) {
	 /* .locals 4 */
	 /* .line 1 */
	 /* iget-wide v0, p0, Lc/k/a/e;->a:J */
	 /* long-to-double v0, v0 */
	 /* iget-wide v2, p0, Lc/k/a/e;->b:J */
	 /* long-to-double v2, v2 */
	 /* div-double/2addr v0, v2 */
	 /* return-wide v0 */
} // .end method
public java.lang.String toString ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 /* iget-wide v1, p0, Lc/k/a/e;->a:J */
	 (( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 final String v1 = "/"; // const-string v1, "/"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget-wide v1, p0, Lc/k/a/e;->b:J */
	 (( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
