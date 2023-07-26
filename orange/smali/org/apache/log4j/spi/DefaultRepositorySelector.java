public class org.apache.log4j.spi.DefaultRepositorySelector implements org.apache.log4j.spi.RepositorySelector {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final org.apache.log4j.spi.LoggerRepository a;
	 /* # direct methods */
	 public org.apache.log4j.spi.DefaultRepositorySelector ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.apache.log4j.spi.LoggerRepository getLoggerRepository ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
