public abstract class org.apache.log4j.spi.Filter implements org.apache.log4j.spi.OptionHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer ACCEPT;
	 public static final Integer DENY;
	 public static final Integer NEUTRAL;
	 /* # instance fields */
	 public org.apache.log4j.spi.Filter next;
	 /* # direct methods */
	 public org.apache.log4j.spi.Filter ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void activateOptions ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public abstract Integer decide ( org.apache.log4j.spi.LoggingEvent p0 ) {
	 } // .end method
	 public org.apache.log4j.spi.Filter getNext ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.next;
	 } // .end method
	 public void setNext ( org.apache.log4j.spi.Filter p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.next = p1;
		 return;
	 } // .end method
