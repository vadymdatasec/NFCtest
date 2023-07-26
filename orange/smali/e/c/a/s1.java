public abstract class e.c.a.s1 extends e.c.a.b1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.c.a.s1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/c/a/b1;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( e.c.a.h1 p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/xml/sax/SAXException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* instance-of v0, p1, Le/c/a/r1; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 v0 = this.i;
		 return;
		 /* .line 3 */
	 } // :cond_0
	 /* new-instance v0, Lorg/xml/sax/SAXException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Text content elements cannot contain "; // const-string v2, "Text content elements cannot contain "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 final String p1 = " elements."; // const-string p1, " elements."
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, p1}, Lorg/xml/sax/SAXException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
