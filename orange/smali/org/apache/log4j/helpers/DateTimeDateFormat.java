public class org.apache.log4j.helpers.DateTimeDateFormat extends org.apache.log4j.helpers.AbsoluteTimeDateFormat {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String d;
	 /* # direct methods */
	 public org.apache.log4j.helpers.DateTimeDateFormat ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/text/DateFormatSymbols; */
		 /* invoke-direct {v0}, Ljava/text/DateFormatSymbols;-><init>()V */
		 (( java.text.DateFormatSymbols ) v0 ).getShortMonths ( ); // invoke-virtual {v0}, Ljava/text/DateFormatSymbols;->getShortMonths()[Ljava/lang/String;
		 this.d = v0;
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.DateTimeDateFormat ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/helpers/DateTimeDateFormat;-><init>()V */
		 /* .line 4 */
		 java.util.Calendar .getInstance ( p1 );
		 (( java.text.DateFormat ) p0 ).setCalendar ( p1 ); // invoke-virtual {p0, p1}, Ljava/text/DateFormat;->setCalendar(Ljava/util/Calendar;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.StringBuffer format ( java.util.Date p0, java.lang.StringBuffer p1, java.text.FieldPosition p2 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.calendar;
		 (( java.util.Calendar ) v0 ).setTime ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
		 /* .line 2 */
		 v0 = this.calendar;
		 int v1 = 5; // const/4 v1, 0x5
		 v0 = 		 (( java.util.Calendar ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I
		 /* const/16 v1, 0xa */
		 /* if-ge v0, v1, :cond_0 */
		 /* const/16 v1, 0x30 */
		 /* .line 3 */
		 (( java.lang.StringBuffer ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
		 /* .line 4 */
	 } // :cond_0
	 (( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
	 /* const/16 v0, 0x20 */
	 /* .line 5 */
	 (( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
	 /* .line 6 */
	 v1 = this.d;
	 v2 = this.calendar;
	 int v3 = 2; // const/4 v3, 0x2
	 v2 = 	 (( java.util.Calendar ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
	 /* aget-object v1, v1, v2 */
	 (( java.lang.StringBuffer ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 7 */
	 (( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
	 /* .line 8 */
	 v1 = this.calendar;
	 int v2 = 1; // const/4 v2, 0x1
	 v1 = 	 (( java.util.Calendar ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I
	 /* .line 9 */
	 (( java.lang.StringBuffer ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
	 /* .line 10 */
	 (( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
	 /* .line 11 */
	 /* invoke-super {p0, p1, p2, p3}, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;->format(Ljava/util/Date;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer; */
} // .end method
public java.util.Date parse ( java.lang.String p0, java.text.ParsePosition p1 ) {
	 /* .locals 0 */
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
