public class org.apache.log4j.helpers.AbsoluteTimeDateFormat extends java.text.DateFormat {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String ABS_TIME_DATE_FORMAT;
	 public static final java.lang.String DATE_AND_TIME_DATE_FORMAT;
	 public static final java.lang.String ISO8601_DATE_FORMAT;
	 public static Long b;
	 public static c;
	 /* # direct methods */
	 public static org.apache.log4j.helpers.AbsoluteTimeDateFormat ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x9 */
		 /* new-array v0, v0, [C */
		 /* .line 1 */
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.AbsoluteTimeDateFormat ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/text/DateFormat;-><init>()V */
		 /* .line 2 */
		 java.util.Calendar .getInstance ( );
		 (( java.text.DateFormat ) p0 ).setCalendar ( v0 ); // invoke-virtual {p0, v0}, Ljava/text/DateFormat;->setCalendar(Ljava/util/Calendar;)V
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.AbsoluteTimeDateFormat ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/text/DateFormat;-><init>()V */
		 /* .line 4 */
		 java.util.Calendar .getInstance ( p1 );
		 (( java.text.DateFormat ) p0 ).setCalendar ( p1 ); // invoke-virtual {p0, p1}, Ljava/text/DateFormat;->setCalendar(Ljava/util/Calendar;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.StringBuffer format ( java.util.Date p0, java.lang.StringBuffer p1, java.text.FieldPosition p2 ) {
		 /* .locals 8 */
		 /* .line 1 */
		 (( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v0 */
		 /* const-wide/16 v2, 0x3e8 */
		 /* .line 2 */
		 /* rem-long v2, v0, v2 */
		 /* long-to-int p3, v2 */
		 /* int-to-long v2, p3 */
		 /* sub-long/2addr v0, v2 */
		 /* .line 3 */
		 /* sget-wide v2, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;->b:J */
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/16 v5, 0xa */
		 /* const/16 v6, 0x30 */
		 /* cmp-long v7, v0, v2 */
		 /* if-nez v7, :cond_1 */
		 v2 = org.apache.log4j.helpers.AbsoluteTimeDateFormat.c;
		 /* aget-char v3, v2, v4 */
		 /* if-nez v3, :cond_0 */
		 /* .line 4 */
	 } // :cond_0
	 (( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append([C)Ljava/lang/StringBuffer;
	 /* .line 5 */
} // :cond_1
} // :goto_0
v2 = this.calendar;
(( java.util.Calendar ) v2 ).setTime ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
/* .line 6 */
p1 = (( java.lang.StringBuffer ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I
/* .line 7 */
v2 = this.calendar;
/* const/16 v3, 0xb */
v2 = (( java.util.Calendar ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
/* if-ge v2, v5, :cond_2 */
/* .line 8 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 9 */
} // :cond_2
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* const/16 v2, 0x3a */
/* .line 10 */
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 11 */
v3 = this.calendar;
/* const/16 v7, 0xc */
v3 = (( java.util.Calendar ) v3 ).get ( v7 ); // invoke-virtual {v3, v7}, Ljava/util/Calendar;->get(I)I
/* if-ge v3, v5, :cond_3 */
/* .line 12 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 13 */
} // :cond_3
(( java.lang.StringBuffer ) p2 ).append ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* .line 14 */
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 15 */
v2 = this.calendar;
/* const/16 v3, 0xd */
v2 = (( java.util.Calendar ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
/* if-ge v2, v5, :cond_4 */
/* .line 16 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 17 */
} // :cond_4
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* const/16 v2, 0x2c */
/* .line 18 */
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 19 */
v2 = (( java.lang.StringBuffer ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I
v3 = org.apache.log4j.helpers.AbsoluteTimeDateFormat.c;
(( java.lang.StringBuffer ) p2 ).getChars ( p1, v2, v3, v4 ); // invoke-virtual {p2, p1, v2, v3, v4}, Ljava/lang/StringBuffer;->getChars(II[CI)V
/* .line 20 */
/* sput-wide v0, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;->b:J */
} // :goto_1
/* const/16 p1, 0x64 */
/* if-ge p3, p1, :cond_5 */
/* .line 21 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :cond_5
/* if-ge p3, v5, :cond_6 */
/* .line 22 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 23 */
} // :cond_6
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
} // .end method
public java.util.Date parse ( java.lang.String p0, java.text.ParsePosition p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
