public abstract class org.apache.log4j.pattern.PatternConverter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final java.lang.String b;
	 /* # direct methods */
	 public org.apache.log4j.pattern.PatternConverter ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract void format ( java.lang.Object p0, java.lang.StringBuffer p1 ) {
	 } // .end method
	 public final java.lang.String getName ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public java.lang.String getStyleClass ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.b;
	 } // .end method
