public class org.apache.log4j.helpers.RelativeTimeDateFormat extends java.text.DateFormat {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Long b;
	 /* # direct methods */
	 public org.apache.log4j.helpers.RelativeTimeDateFormat ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/text/DateFormat;-><init>()V */
		 /* .line 2 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lorg/apache/log4j/helpers/RelativeTimeDateFormat;->b:J */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.StringBuffer format ( java.util.Date p0, java.lang.StringBuffer p1, java.text.FieldPosition p2 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 (( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v0 */
		 /* iget-wide v2, p0, Lorg/apache/log4j/helpers/RelativeTimeDateFormat;->b:J */
		 /* sub-long/2addr v0, v2 */
		 (( java.lang.StringBuffer ) p2 ).append ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
	 } // .end method
	 public java.util.Date parse ( java.lang.String p0, java.text.ParsePosition p1 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
