public class org.apache.log4j.config.PropertySetterException extends java.lang.Exception {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.Throwable b;
	 /* # direct methods */
	 public org.apache.log4j.config.PropertySetterException ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public org.apache.log4j.config.PropertySetterException ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Ljava/lang/Exception;-><init>()V */
		 /* .line 3 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getMessage ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-super {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String; */
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 v1 = this.b;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 3 */
			 (( java.lang.Throwable ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
		 } // :cond_0
	 } // .end method
