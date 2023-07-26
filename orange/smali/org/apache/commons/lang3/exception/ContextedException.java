public class org.apache.commons.lang3.exception.ContextedException extends java.lang.Exception implements m.a.a.c.f.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final m.a.a.c.f.b b;
	 /* # direct methods */
	 public org.apache.commons.lang3.exception.ContextedException ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Exception;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lm/a/a/c/f/a; */
		 /* invoke-direct {v0}, Lm/a/a/c/f/a;-><init>()V */
		 this.b = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public java.lang.String getMessage ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String; */
		 (( org.apache.commons.lang3.exception.ContextedException ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/commons/lang3/exception/ContextedException;->a(Ljava/lang/String;)Ljava/lang/String;
	 } // .end method
