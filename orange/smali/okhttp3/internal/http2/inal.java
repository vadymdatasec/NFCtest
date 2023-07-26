public class inal extends java.io.IOException {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final k.e1.k.a b;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "stream was reset: "; // const-string v1, "stream was reset: "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 this.b = p1;
		 return;
	 } // .end method
