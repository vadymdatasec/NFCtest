public class org.apache.log4j.helpers.ISO8601DateFormat extends org.apache.log4j.helpers.AbsoluteTimeDateFormat {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Long d;
	 public static e;
	 /* # direct methods */
	 public static org.apache.log4j.helpers.ISO8601DateFormat ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x14 */
		 /* new-array v0, v0, [C */
		 /* .line 1 */
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.ISO8601DateFormat ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;-><init>()V */
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.ISO8601DateFormat ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1}, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;-><init>(Ljava/util/TimeZone;)V */
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
		 /* sget-wide v2, Lorg/apache/log4j/helpers/ISO8601DateFormat;->d:J */
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/16 v5, 0xa */
		 /* const/16 v6, 0x30 */
		 /* cmp-long v7, v0, v2 */
		 /* if-nez v7, :cond_1 */
		 v2 = org.apache.log4j.helpers.ISO8601DateFormat.e;
		 /* aget-char v3, v2, v4 */
		 /* if-nez v3, :cond_0 */
		 /* .line 4 */
	 } // :cond_0
	 (( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append([C)Ljava/lang/StringBuffer;
	 /* goto/16 :goto_2 */
	 /* .line 5 */
} // :cond_1
} // :goto_0
v2 = this.calendar;
(( java.util.Calendar ) v2 ).setTime ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
/* .line 6 */
p1 = (( java.lang.StringBuffer ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I
/* .line 7 */
v2 = this.calendar;
int v3 = 1; // const/4 v3, 0x1
v2 = (( java.util.Calendar ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
/* .line 8 */
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* .line 9 */
v2 = this.calendar;
int v3 = 2; // const/4 v3, 0x2
v2 = (( java.util.Calendar ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
/* packed-switch v2, :pswitch_data_0 */
final String v2 = "-NA-"; // const-string v2, "-NA-"
/* :pswitch_0 */
final String v2 = "-12-"; // const-string v2, "-12-"
/* :pswitch_1 */
final String v2 = "-11-"; // const-string v2, "-11-"
/* :pswitch_2 */
final String v2 = "-10-"; // const-string v2, "-10-"
/* :pswitch_3 */
final String v2 = "-09-"; // const-string v2, "-09-"
/* :pswitch_4 */
final String v2 = "-08-"; // const-string v2, "-08-"
/* :pswitch_5 */
final String v2 = "-07-"; // const-string v2, "-07-"
/* :pswitch_6 */
final String v2 = "-06-"; // const-string v2, "-06-"
/* :pswitch_7 */
final String v2 = "-05-"; // const-string v2, "-05-"
/* :pswitch_8 */
final String v2 = "-04-"; // const-string v2, "-04-"
/* :pswitch_9 */
final String v2 = "-03-"; // const-string v2, "-03-"
/* :pswitch_a */
final String v2 = "-02-"; // const-string v2, "-02-"
/* :pswitch_b */
final String v2 = "-01-"; // const-string v2, "-01-"
/* .line 10 */
} // :goto_1
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 11 */
v2 = this.calendar;
int v3 = 5; // const/4 v3, 0x5
v2 = (( java.util.Calendar ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
/* if-ge v2, v5, :cond_2 */
/* .line 12 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 13 */
} // :cond_2
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* const/16 v2, 0x20 */
/* .line 14 */
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 15 */
v2 = this.calendar;
/* const/16 v3, 0xb */
v2 = (( java.util.Calendar ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
/* if-ge v2, v5, :cond_3 */
/* .line 16 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 17 */
} // :cond_3
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* const/16 v2, 0x3a */
/* .line 18 */
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 19 */
v3 = this.calendar;
/* const/16 v7, 0xc */
v3 = (( java.util.Calendar ) v3 ).get ( v7 ); // invoke-virtual {v3, v7}, Ljava/util/Calendar;->get(I)I
/* if-ge v3, v5, :cond_4 */
/* .line 20 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 21 */
} // :cond_4
(( java.lang.StringBuffer ) p2 ).append ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* .line 22 */
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 23 */
v2 = this.calendar;
/* const/16 v3, 0xd */
v2 = (( java.util.Calendar ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I
/* if-ge v2, v5, :cond_5 */
/* .line 24 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 25 */
} // :cond_5
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* const/16 v2, 0x2c */
/* .line 26 */
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 27 */
v2 = (( java.lang.StringBuffer ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I
v3 = org.apache.log4j.helpers.ISO8601DateFormat.e;
(( java.lang.StringBuffer ) p2 ).getChars ( p1, v2, v3, v4 ); // invoke-virtual {p2, p1, v2, v3, v4}, Ljava/lang/StringBuffer;->getChars(II[CI)V
/* .line 28 */
/* sput-wide v0, Lorg/apache/log4j/helpers/ISO8601DateFormat;->d:J */
} // :goto_2
/* const/16 p1, 0x64 */
/* if-ge p3, p1, :cond_6 */
/* .line 29 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :cond_6
/* if-ge p3, v5, :cond_7 */
/* .line 30 */
(( java.lang.StringBuffer ) p2 ).append ( v6 ); // invoke-virtual {p2, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 31 */
} // :cond_7
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_b */
/* :pswitch_a */
/* :pswitch_9 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public java.util.Date parse ( java.lang.String p0, java.text.ParsePosition p1 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
