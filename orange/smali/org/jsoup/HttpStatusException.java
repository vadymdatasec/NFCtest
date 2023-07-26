public class org.jsoup.HttpStatusException extends java.io.IOException {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer b;
	 public java.lang.String c;
	 /* # direct methods */
	 public org.jsoup.HttpStatusException ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 /* iput p2, p0, Lorg/jsoup/HttpStatusException;->b:I */
		 /* .line 3 */
		 this.c = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 /* invoke-super {p0}, Ljava/io/IOException;->toString()Ljava/lang/String; */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = ".Status="; // const-string v1, ".Status="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/jsoup/HttpStatusException;->b:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ", URL="; // const-string v1, ", URL="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.c;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
