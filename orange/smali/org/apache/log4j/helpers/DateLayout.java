public abstract class org.apache.log4j.helpers.DateLayout extends org.apache.log4j.Layout {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String DATE_FORMAT_OPTION;
	 public static final java.lang.String NULL_DATE_FORMAT;
	 public static final java.lang.String RELATIVE_TIME_DATE_FORMAT;
	 public static final java.lang.String TIMEZONE_OPTION;
	 /* # instance fields */
	 public java.text.FieldPosition a;
	 public java.lang.String b;
	 public java.lang.String c;
	 public java.text.DateFormat d;
	 public java.util.Date e;
	 /* # direct methods */
	 public org.apache.log4j.helpers.DateLayout ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/Layout;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/text/FieldPosition; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Ljava/text/FieldPosition;-><init>(I)V */
		 this.a = v0;
		 /* .line 3 */
		 /* new-instance v0, Ljava/util/Date; */
		 /* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
		 this.e = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void activateOptions ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.c;
		 (( org.apache.log4j.helpers.DateLayout ) p0 ).setDateFormat ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/helpers/DateLayout;->setDateFormat(Ljava/lang/String;)V
		 /* .line 2 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v1 = this.d;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 3 */
				 java.util.TimeZone .getTimeZone ( v0 );
				 (( java.text.DateFormat ) v1 ).setTimeZone ( v0 ); // invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
			 } // :cond_0
			 return;
		 } // .end method
		 public void dateFormat ( java.lang.StringBuffer p0, org.apache.log4j.spi.LoggingEvent p1 ) {
			 /* .locals 3 */
			 /* .line 1 */
			 v0 = this.d;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 v0 = this.e;
				 /* iget-wide v1, p2, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J */
				 (( java.util.Date ) v0 ).setTime ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Date;->setTime(J)V
				 /* .line 3 */
				 p2 = this.d;
				 v0 = this.e;
				 v1 = this.a;
				 (( java.text.DateFormat ) p2 ).format ( v0, p1, v1 ); // invoke-virtual {p2, v0, p1, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;
				 /* const/16 p2, 0x20 */
				 /* .line 4 */
				 (( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
			 } // :cond_0
			 return;
		 } // .end method
		 public java.lang.String getDateFormat ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.c;
		 } // .end method
		 public java.lang.String getOptionStrings ( ) {
			 /* .locals 2 */
			 final String v0 = "DateFormat"; // const-string v0, "DateFormat"
			 final String v1 = "TimeZone"; // const-string v1, "TimeZone"
			 /* .line 1 */
			 /* filled-new-array {v0, v1}, [Ljava/lang/String; */
		 } // .end method
		 public java.lang.String getTimeZone ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.b;
		 } // .end method
		 public void setDateFormat ( java.lang.String p0 ) {
			 /* .locals 1 */
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 /* .line 1 */
				 this.c = p1;
				 /* .line 2 */
			 } // :cond_0
			 p1 = this.c;
			 java.util.TimeZone .getDefault ( );
			 (( org.apache.log4j.helpers.DateLayout ) p0 ).setDateFormat ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/log4j/helpers/DateLayout;->setDateFormat(Ljava/lang/String;Ljava/util/TimeZone;)V
			 return;
		 } // .end method
		 public void setDateFormat ( java.lang.String p0, java.util.TimeZone p1 ) {
			 /* .locals 2 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* if-nez p1, :cond_0 */
			 /* .line 5 */
			 this.d = v0;
			 return;
		 } // :cond_0
		 final String v1 = "NULL"; // const-string v1, "NULL"
		 /* .line 6 */
		 v1 = 		 (( java.lang.String ) p1 ).equalsIgnoreCase ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 7 */
			 this.d = v0;
		 } // :cond_1
		 final String v0 = "RELATIVE"; // const-string v0, "RELATIVE"
		 /* .line 8 */
		 v0 = 		 (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 9 */
			 /* new-instance p1, Lorg/apache/log4j/helpers/RelativeTimeDateFormat; */
			 /* invoke-direct {p1}, Lorg/apache/log4j/helpers/RelativeTimeDateFormat;-><init>()V */
			 this.d = p1;
		 } // :cond_2
		 final String v0 = "ABSOLUTE"; // const-string v0, "ABSOLUTE"
		 /* .line 10 */
		 v0 = 		 (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 11 */
			 /* new-instance p1, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat; */
			 /* invoke-direct {p1, p2}, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;-><init>(Ljava/util/TimeZone;)V */
			 this.d = p1;
		 } // :cond_3
		 final String v0 = "DATE"; // const-string v0, "DATE"
		 /* .line 12 */
		 v0 = 		 (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 /* .line 13 */
			 /* new-instance p1, Lorg/apache/log4j/helpers/DateTimeDateFormat; */
			 /* invoke-direct {p1, p2}, Lorg/apache/log4j/helpers/DateTimeDateFormat;-><init>(Ljava/util/TimeZone;)V */
			 this.d = p1;
		 } // :cond_4
		 final String v0 = "ISO8601"; // const-string v0, "ISO8601"
		 /* .line 14 */
		 v0 = 		 (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_5
			 /* .line 15 */
			 /* new-instance p1, Lorg/apache/log4j/helpers/ISO8601DateFormat; */
			 /* invoke-direct {p1, p2}, Lorg/apache/log4j/helpers/ISO8601DateFormat;-><init>(Ljava/util/TimeZone;)V */
			 this.d = p1;
			 /* .line 16 */
		 } // :cond_5
		 /* new-instance v0, Ljava/text/SimpleDateFormat; */
		 /* invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
		 this.d = v0;
		 /* .line 17 */
		 (( java.text.DateFormat ) v0 ).setTimeZone ( p2 ); // invoke-virtual {v0, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
	 } // :goto_0
	 return;
} // .end method
public void setDateFormat ( java.text.DateFormat p0, java.util.TimeZone p1 ) {
	 /* .locals 0 */
	 /* .line 3 */
	 this.d = p1;
	 /* .line 4 */
	 (( java.text.DateFormat ) p1 ).setTimeZone ( p2 ); // invoke-virtual {p1, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
	 return;
} // .end method
public void setOption ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 1 */
	 final String v0 = "DateFormat"; // const-string v0, "DateFormat"
	 /* .line 1 */
	 v0 = 	 (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( java.lang.String ) p2 ).toUpperCase ( ); // invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
		 this.c = p1;
	 } // :cond_0
	 final String v0 = "TimeZone"; // const-string v0, "TimeZone"
	 /* .line 3 */
	 p1 = 	 (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* .line 4 */
		 this.b = p2;
	 } // :cond_1
} // :goto_0
return;
} // .end method
public void setTimeZone ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
