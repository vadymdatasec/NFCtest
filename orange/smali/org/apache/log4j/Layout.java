public abstract class org.apache.log4j.Layout implements org.apache.log4j.spi.OptionHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String LINE_SEP;
	 public static final Integer LINE_SEP_LEN;
	 /* # direct methods */
	 public static org.apache.log4j.Layout ( ) {
		 /* .locals 1 */
		 final String v0 = "line.separator"; // const-string v0, "line.separator"
		 /* .line 1 */
		 java.lang.System .getProperty ( v0 );
		 /* .line 2 */
		 v0 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 return;
	 } // .end method
	 public org.apache.log4j.Layout ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract java.lang.String format ( org.apache.log4j.spi.LoggingEvent p0 ) {
	 } // .end method
	 public java.lang.String getContentType ( ) {
		 /* .locals 1 */
		 final String v0 = "text/plain"; // const-string v0, "text/plain"
	 } // .end method
	 public java.lang.String getFooter ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public java.lang.String getHeader ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public abstract Boolean ignoresThrowable ( ) {
	 } // .end method
