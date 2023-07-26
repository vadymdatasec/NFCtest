public class org.apache.log4j.net.SyslogAppender extends org.apache.log4j.AppenderSkeleton {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer LOG_AUTH;
	 public static final Integer LOG_AUTHPRIV;
	 public static final Integer LOG_CRON;
	 public static final Integer LOG_DAEMON;
	 public static final Integer LOG_FTP;
	 public static final Integer LOG_KERN;
	 public static final Integer LOG_LOCAL0;
	 public static final Integer LOG_LOCAL1;
	 public static final Integer LOG_LOCAL2;
	 public static final Integer LOG_LOCAL3;
	 public static final Integer LOG_LOCAL4;
	 public static final Integer LOG_LOCAL5;
	 public static final Integer LOG_LOCAL6;
	 public static final Integer LOG_LOCAL7;
	 public static final Integer LOG_LPR;
	 public static final Integer LOG_MAIL;
	 public static final Integer LOG_NEWS;
	 public static final Integer LOG_SYSLOG;
	 public static final Integer LOG_USER;
	 public static final Integer LOG_UUCP;
	 /* # instance fields */
	 public Integer h;
	 public java.lang.String i;
	 public Boolean j;
	 public org.apache.log4j.helpers.SyslogQuietWriter k;
	 public java.lang.String l;
	 public Boolean m;
	 public final java.text.SimpleDateFormat n;
	 public java.lang.String o;
	 public Boolean p;
	 /* # direct methods */
	 public org.apache.log4j.net.SyslogAppender ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
		 /* const/16 v0, 0x8 */
		 /* .line 2 */
		 /* iput v0, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->j:Z */
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->m:Z */
		 /* .line 5 */
		 /* new-instance v1, Ljava/text/SimpleDateFormat; */
		 v2 = java.util.Locale.ENGLISH;
		 final String v3 = "MMM dd HH:mm:ss "; // const-string v3, "MMM dd HH:mm:ss "
		 /* invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
		 this.n = v1;
		 /* .line 6 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->p:Z */
		 /* .line 7 */
		 (( org.apache.log4j.net.SyslogAppender ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SyslogAppender;->b()V
		 return;
	 } // .end method
	 public org.apache.log4j.net.SyslogAppender ( ) {
		 /* .locals 4 */
		 /* .line 8 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
		 /* const/16 v0, 0x8 */
		 /* .line 9 */
		 /* iput v0, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 10 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->j:Z */
		 /* .line 11 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->m:Z */
		 /* .line 12 */
		 /* new-instance v1, Ljava/text/SimpleDateFormat; */
		 v2 = java.util.Locale.ENGLISH;
		 final String v3 = "MMM dd HH:mm:ss "; // const-string v3, "MMM dd HH:mm:ss "
		 /* invoke-direct {v1, v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
		 this.n = v1;
		 /* .line 13 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->p:Z */
		 /* .line 14 */
		 this.a = p1;
		 /* .line 15 */
		 /* iput p2, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
		 /* .line 16 */
		 (( org.apache.log4j.net.SyslogAppender ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SyslogAppender;->b()V
		 return;
	 } // .end method
	 public org.apache.log4j.net.SyslogAppender ( ) {
		 /* .locals 0 */
		 /* .line 17 */
		 /* invoke-direct {p0, p1, p3}, Lorg/apache/log4j/net/SyslogAppender;-><init>(Lorg/apache/log4j/Layout;I)V */
		 /* .line 18 */
		 (( org.apache.log4j.net.SyslogAppender ) p0 ).setSyslogHost ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/log4j/net/SyslogAppender;->setSyslogHost(Ljava/lang/String;)V
		 return;
	 } // .end method
	 public static Integer getFacility ( java.lang.String p0 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 1 */
			 (( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
		 } // :cond_0
		 final String v0 = "KERN"; // const-string v0, "KERN"
		 /* .line 2 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 int p0 = 0; // const/4 p0, 0x0
		 } // :cond_1
		 final String v0 = "USER"; // const-string v0, "USER"
		 /* .line 3 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* const/16 p0, 0x8 */
		 } // :cond_2
		 final String v0 = "MAIL"; // const-string v0, "MAIL"
		 /* .line 4 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* const/16 p0, 0x10 */
		 } // :cond_3
		 final String v0 = "DAEMON"; // const-string v0, "DAEMON"
		 /* .line 5 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 /* const/16 p0, 0x18 */
		 } // :cond_4
		 final String v0 = "AUTH"; // const-string v0, "AUTH"
		 /* .line 6 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_5
			 /* const/16 p0, 0x20 */
		 } // :cond_5
		 final String v0 = "SYSLOG"; // const-string v0, "SYSLOG"
		 /* .line 7 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_6
			 /* const/16 p0, 0x28 */
		 } // :cond_6
		 final String v0 = "LPR"; // const-string v0, "LPR"
		 /* .line 8 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_7
			 /* const/16 p0, 0x30 */
		 } // :cond_7
		 final String v0 = "NEWS"; // const-string v0, "NEWS"
		 /* .line 9 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_8
			 /* const/16 p0, 0x38 */
		 } // :cond_8
		 final String v0 = "UUCP"; // const-string v0, "UUCP"
		 /* .line 10 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_9
			 /* const/16 p0, 0x40 */
		 } // :cond_9
		 final String v0 = "CRON"; // const-string v0, "CRON"
		 /* .line 11 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_a
			 /* const/16 p0, 0x48 */
		 } // :cond_a
		 final String v0 = "AUTHPRIV"; // const-string v0, "AUTHPRIV"
		 /* .line 12 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_b
			 /* const/16 p0, 0x50 */
		 } // :cond_b
		 final String v0 = "FTP"; // const-string v0, "FTP"
		 /* .line 13 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_c
			 /* const/16 p0, 0x58 */
		 } // :cond_c
		 final String v0 = "LOCAL0"; // const-string v0, "LOCAL0"
		 /* .line 14 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_d
			 /* const/16 p0, 0x80 */
		 } // :cond_d
		 final String v0 = "LOCAL1"; // const-string v0, "LOCAL1"
		 /* .line 15 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_e
			 /* const/16 p0, 0x88 */
		 } // :cond_e
		 final String v0 = "LOCAL2"; // const-string v0, "LOCAL2"
		 /* .line 16 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_f
			 /* const/16 p0, 0x90 */
		 } // :cond_f
		 final String v0 = "LOCAL3"; // const-string v0, "LOCAL3"
		 /* .line 17 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_10
			 /* const/16 p0, 0x98 */
		 } // :cond_10
		 final String v0 = "LOCAL4"; // const-string v0, "LOCAL4"
		 /* .line 18 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_11
			 /* const/16 p0, 0xa0 */
		 } // :cond_11
		 final String v0 = "LOCAL5"; // const-string v0, "LOCAL5"
		 /* .line 19 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_12
			 /* const/16 p0, 0xa8 */
		 } // :cond_12
		 final String v0 = "LOCAL6"; // const-string v0, "LOCAL6"
		 /* .line 20 */
		 v0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_13
			 /* const/16 p0, 0xb0 */
		 } // :cond_13
		 final String v0 = "LOCAL7"; // const-string v0, "LOCAL7"
		 /* .line 21 */
		 p0 = 		 (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_14
			 /* const/16 p0, 0xb8 */
		 } // :cond_14
		 int p0 = -1; // const/4 p0, -0x1
	 } // .end method
	 public static java.lang.String getFacilityString ( Integer p0 ) {
		 /* .locals 0 */
		 /* sparse-switch p0, :sswitch_data_0 */
		 int p0 = 0; // const/4 p0, 0x0
		 /* :sswitch_0 */
		 final String p0 = "local7"; // const-string p0, "local7"
		 /* :sswitch_1 */
		 final String p0 = "local6"; // const-string p0, "local6"
		 /* :sswitch_2 */
		 final String p0 = "local5"; // const-string p0, "local5"
		 /* :sswitch_3 */
		 final String p0 = "local4"; // const-string p0, "local4"
		 /* :sswitch_4 */
		 final String p0 = "local3"; // const-string p0, "local3"
		 /* :sswitch_5 */
		 final String p0 = "local2"; // const-string p0, "local2"
		 /* :sswitch_6 */
		 final String p0 = "local1"; // const-string p0, "local1"
		 /* :sswitch_7 */
		 final String p0 = "local0"; // const-string p0, "local0"
		 /* :sswitch_8 */
		 final String p0 = "ftp"; // const-string p0, "ftp"
		 /* :sswitch_9 */
		 final String p0 = "authpriv"; // const-string p0, "authpriv"
		 /* :sswitch_a */
		 final String p0 = "cron"; // const-string p0, "cron"
		 /* :sswitch_b */
		 final String p0 = "uucp"; // const-string p0, "uucp"
		 /* :sswitch_c */
		 final String p0 = "news"; // const-string p0, "news"
		 /* :sswitch_d */
		 final String p0 = "lpr"; // const-string p0, "lpr"
		 /* :sswitch_e */
		 final String p0 = "syslog"; // const-string p0, "syslog"
		 /* :sswitch_f */
		 final String p0 = "auth"; // const-string p0, "auth"
		 /* :sswitch_10 */
		 final String p0 = "daemon"; // const-string p0, "daemon"
		 /* :sswitch_11 */
		 final String p0 = "mail"; // const-string p0, "mail"
		 /* :sswitch_12 */
		 final String p0 = "user"; // const-string p0, "user"
		 /* :sswitch_13 */
		 final String p0 = "kern"; // const-string p0, "kern"
		 /* nop */
		 /* :sswitch_data_0 */
		 /* .sparse-switch */
		 /* 0x0 -> :sswitch_13 */
		 /* 0x8 -> :sswitch_12 */
		 /* 0x10 -> :sswitch_11 */
		 /* 0x18 -> :sswitch_10 */
		 /* 0x20 -> :sswitch_f */
		 /* 0x28 -> :sswitch_e */
		 /* 0x30 -> :sswitch_d */
		 /* 0x38 -> :sswitch_c */
		 /* 0x40 -> :sswitch_b */
		 /* 0x48 -> :sswitch_a */
		 /* 0x50 -> :sswitch_9 */
		 /* 0x58 -> :sswitch_8 */
		 /* 0x80 -> :sswitch_7 */
		 /* 0x88 -> :sswitch_6 */
		 /* 0x90 -> :sswitch_5 */
		 /* 0x98 -> :sswitch_4 */
		 /* 0xa0 -> :sswitch_3 */
		 /* 0xa8 -> :sswitch_2 */
		 /* 0xb0 -> :sswitch_1 */
		 /* 0xb8 -> :sswitch_0 */
	 } // .end sparse-switch
} // .end method
/* # virtual methods */
public final java.lang.String a ( ) {
	 /* .locals 1 */
	 /* .line 6 */
	 v0 = this.o;
	 /* if-nez v0, :cond_0 */
	 /* .line 7 */
	 try { // :try_start_0
		 java.net.InetAddress .getLocalHost ( );
		 /* .line 8 */
		 (( java.net.InetAddress ) v0 ).getHostName ( ); // invoke-virtual {v0}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;
		 this.o = v0;
		 /* :try_end_0 */
		 /* .catch Ljava/net/UnknownHostException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 final String v0 = "UNKNOWN_HOST"; // const-string v0, "UNKNOWN_HOST"
		 /* .line 9 */
		 this.o = v0;
		 /* .line 10 */
	 } // :cond_0
} // :goto_0
v0 = this.o;
} // .end method
public final java.lang.String a ( Long p0 ) {
/* .locals 3 */
/* .line 11 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 12 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 v1 = this.n;
	 /* new-instance v2, Ljava/util/Date; */
	 /* invoke-direct {v2, p1, p2}, Ljava/util/Date;-><init>(J)V */
	 (( java.text.SimpleDateFormat ) v1 ).format ( v2 ); // invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
	 /* invoke-direct {v0, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
	 int p1 = 4; // const/4 p1, 0x4
	 /* .line 13 */
	 p2 = 	 (( java.lang.StringBuffer ) v0 ).charAt ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->charAt(I)C
	 /* const/16 v1, 0x30 */
	 /* const/16 v2, 0x20 */
	 /* if-ne p2, v1, :cond_0 */
	 /* .line 14 */
	 (( java.lang.StringBuffer ) v0 ).setCharAt ( p1, v2 ); // invoke-virtual {v0, p1, v2}, Ljava/lang/StringBuffer;->setCharAt(IC)V
	 /* .line 15 */
} // :cond_0
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SyslogAppender;->a()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 16 */
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 17 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_1
final String p1 = ""; // const-string p1, ""
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 18 */
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 19 */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/apache/log4j/net/SyslogAppender;->a(J)Ljava/lang/String;
/* .line 20 */
/* iget-boolean v1, p0, Lorg/apache/log4j/net/SyslogAppender;->j:Z */
/* if-nez v1, :cond_0 */
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_2 */
/* .line 21 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 22 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->j:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 23 */
v0 = this.i;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 24 */
} // :cond_1
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 25 */
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 26 */
} // :cond_2
v0 = this.k;
int v1 = 6; // const/4 v1, 0x6
(( org.apache.log4j.helpers.SyslogQuietWriter ) v0 ).setLevel ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/helpers/SyslogQuietWriter;->setLevel(I)V
/* .line 27 */
v0 = this.k;
(( org.apache.log4j.helpers.SyslogQuietWriter ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/SyslogQuietWriter;->write(Ljava/lang/String;)V
} // :cond_3
return;
} // .end method
public final void a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
/* .line 1 */
(( java.lang.String ) p2 ).getBytes ( ); // invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B
/* array-length v0, v0 */
/* const/16 v1, 0x3fb */
/* if-gt v0, v1, :cond_0 */
/* .line 2 */
p1 = this.k;
(( org.apache.log4j.helpers.SyslogQuietWriter ) p1 ).write ( p2 ); // invoke-virtual {p1, p2}, Lorg/apache/log4j/helpers/SyslogQuietWriter;->write(Ljava/lang/String;)V
/* .line 3 */
} // :cond_0
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
v1 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
v2 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* sub-int/2addr v1, v2 */
/* div-int/lit8 v1, v1, 0x2 */
/* add-int/2addr v0, v1 */
/* .line 4 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
int v2 = 0; // const/4 v2, 0x0
(( java.lang.String ) p2 ).substring ( v2, v0 ); // invoke-virtual {p2, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "..."; // const-string v2, "..."
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/apache/log4j/net/SyslogAppender;->a(Ljava/lang/String;Ljava/lang/String;)V
/* .line 5 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.String ) p2 ).substring ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/net/SyslogAppender;->a(Ljava/lang/String;Ljava/lang/String;)V
} // :goto_0
return;
} // .end method
public void activateOptions ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SyslogAppender;->a()Ljava/lang/String;
/* .line 3 */
} // :cond_0
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
(( org.apache.log4j.Layout ) v0 ).getHeader ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Layout;->getHeader()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
v0 = this.a;
(( org.apache.log4j.Layout ) v0 ).getHeader ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Layout;->getHeader()Ljava/lang/String;
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/net/SyslogAppender;->a(Ljava/lang/String;)V
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->p:Z */
return;
} // .end method
public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 6 */
/* .line 1 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.AppenderSkeleton ) p0 ).isAsSevereAsThreshold ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/AppenderSkeleton;->isAsSevereAsThreshold(Lorg/apache/log4j/Priority;)Z
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
v0 = this.k;
/* if-nez v0, :cond_1 */
/* .line 3 */
p1 = this.d;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "No syslog host is set for SyslogAppedender named \""; // const-string v1, "No syslog host is set for SyslogAppedender named \""
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.b;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "\"."; // const-string v1, "\"."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
return;
/* .line 4 */
} // :cond_1
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->p:Z */
int v1 = 1; // const/4 v1, 0x1
/* if-nez v0, :cond_3 */
/* .line 5 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
(( org.apache.log4j.Layout ) v0 ).getHeader ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Layout;->getHeader()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
v0 = this.a;
(( org.apache.log4j.Layout ) v0 ).getHeader ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Layout;->getHeader()Ljava/lang/String;
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/net/SyslogAppender;->a(Ljava/lang/String;)V
/* .line 7 */
} // :cond_2
/* iput-boolean v1, p0, Lorg/apache/log4j/net/SyslogAppender;->p:Z */
/* .line 8 */
} // :cond_3
/* iget-wide v2, p1, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J */
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/apache/log4j/net/SyslogAppender;->a(J)Ljava/lang/String;
/* .line 9 */
v2 = this.a;
/* if-nez v2, :cond_4 */
/* .line 10 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMessage()Ljava/lang/Object;
java.lang.String .valueOf ( v2 );
/* .line 11 */
} // :cond_4
(( org.apache.log4j.Layout ) v2 ).format ( p1 ); // invoke-virtual {v2, p1}, Lorg/apache/log4j/Layout;->format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
/* .line 12 */
} // :goto_0
/* iget-boolean v3, p0, Lorg/apache/log4j/net/SyslogAppender;->j:Z */
/* if-nez v3, :cond_5 */
v3 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v3, :cond_7 */
/* .line 13 */
} // :cond_5
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 14 */
/* iget-boolean v4, p0, Lorg/apache/log4j/net/SyslogAppender;->j:Z */
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 15 */
v4 = this.i;
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 16 */
} // :cond_6
(( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 17 */
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 18 */
} // :cond_7
v3 = this.k;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
v4 = (( org.apache.log4j.Priority ) v4 ).getSyslogEquivalent ( ); // invoke-virtual {v4}, Lorg/apache/log4j/Priority;->getSyslogEquivalent()I
(( org.apache.log4j.helpers.SyslogQuietWriter ) v3 ).setLevel ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/helpers/SyslogQuietWriter;->setLevel(I)V
/* .line 19 */
v3 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* const/16 v4, 0x100 */
/* if-le v3, v4, :cond_8 */
/* .line 20 */
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Lorg/apache/log4j/net/SyslogAppender;->a(Ljava/lang/String;Ljava/lang/String;)V
/* .line 21 */
} // :cond_8
v3 = this.k;
(( org.apache.log4j.helpers.SyslogQuietWriter ) v3 ).write ( v2 ); // invoke-virtual {v3, v2}, Lorg/apache/log4j/helpers/SyslogQuietWriter;->write(Ljava/lang/String;)V
/* .line 22 */
} // :goto_1
v2 = this.a;
if ( v2 != null) { // if-eqz v2, :cond_9
v2 = (( org.apache.log4j.Layout ) v2 ).ignoresThrowable ( ); // invoke-virtual {v2}, Lorg/apache/log4j/Layout;->ignoresThrowable()Z
if ( v2 != null) { // if-eqz v2, :cond_b
/* .line 23 */
} // :cond_9
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_b
int v2 = 0; // const/4 v2, 0x0
/* .line 24 */
} // :goto_2
/* array-length v3, p1 */
/* if-ge v2, v3, :cond_b */
/* .line 25 */
/* aget-object v3, p1, v2 */
final String v4 = "\t"; // const-string v4, "\t"
v3 = (( java.lang.String ) v3 ).startsWith ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_a
/* .line 26 */
v3 = this.k;
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v5 = " "; // const-string v5, " "
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* aget-object v5, p1, v2 */
(( java.lang.String ) v5 ).substring ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.helpers.SyslogQuietWriter ) v3 ).write ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/helpers/SyslogQuietWriter;->write(Ljava/lang/String;)V
/* .line 27 */
} // :cond_a
v3 = this.k;
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* aget-object v5, p1, v2 */
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.helpers.SyslogQuietWriter ) v3 ).write ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/helpers/SyslogQuietWriter;->write(Ljava/lang/String;)V
} // :goto_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_b
return;
} // .end method
public final void b ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
org.apache.log4j.net.SyslogAppender .getFacilityString ( v0 );
this.i = v0;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = java.lang.System.err;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "\""; // const-string v2, "\""
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* iget v2, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String v2 = "\" is an unknown syslog facility.Defaulting to \"USER\"."; // const-string v2, "\" is an unknown syslog facility.Defaulting to \"USER\"."
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* const/16 v0, 0x8 */
/* .line 3 */
/* iput v0, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
final String v0 = "user:"; // const-string v0, "user:"
/* .line 4 */
this.i = v0;
/* .line 5 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
v1 = this.i;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = ":"; // const-string v1, ":"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
this.i = v0;
} // :goto_0
return;
} // .end method
public synchronized void close ( ) {
/* .locals 2 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
try { // :try_start_0
/* iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
/* .line 2 */
v0 = this.k;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
try { // :try_start_1
/* iget-boolean v1, p0, Lorg/apache/log4j/net/SyslogAppender;->p:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.a;
(( org.apache.log4j.Layout ) v1 ).getFooter ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Layout;->getFooter()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
v1 = this.a;
(( org.apache.log4j.Layout ) v1 ).getFooter ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Layout;->getFooter()Ljava/lang/String;
(( org.apache.log4j.net.SyslogAppender ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/net/SyslogAppender;->a(Ljava/lang/String;)V
/* .line 5 */
} // :cond_0
v1 = this.k;
(( java.io.FilterWriter ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/FilterWriter;->close()V
/* .line 6 */
this.k = v0;
/* :try_end_1 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 7 */
/* :catch_0 */
try { // :try_start_2
this.k = v0;
/* .line 8 */
/* :catch_1 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
/* .line 9 */
this.k = v0;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 10 */
} // :cond_1
} // :goto_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public java.lang.String getFacility ( ) {
/* .locals 1 */
/* .line 22 */
/* iget v0, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
org.apache.log4j.net.SyslogAppender .getFacilityString ( v0 );
} // .end method
public Boolean getFacilityPrinting ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->j:Z */
} // .end method
public final Boolean getHeader ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SyslogAppender;->m:Z */
} // .end method
public java.lang.String getSyslogHost ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
} // .end method
public Boolean requiresLayout ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void setFacility ( java.lang.String p0 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
return;
/* .line 1 */
} // :cond_0
v0 = org.apache.log4j.net.SyslogAppender .getFacility ( p1 );
/* iput v0, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_1 */
/* .line 2 */
v0 = java.lang.System.err;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "["; // const-string v2, "["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "] is an unknown syslog facility.Defaulting to [USER]."; // const-string p1, "] is an unknown syslog facility.Defaulting to [USER]."
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v0 ).println ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* const/16 p1, 0x8 */
/* .line 3 */
/* iput p1, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
/* .line 4 */
} // :cond_1
(( org.apache.log4j.net.SyslogAppender ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SyslogAppender;->b()V
/* .line 5 */
p1 = this.k;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 6 */
/* iget v0, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
(( org.apache.log4j.helpers.SyslogQuietWriter ) p1 ).setSyslogFacility ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/helpers/SyslogQuietWriter;->setSyslogFacility(I)V
} // :cond_2
return;
} // .end method
public void setFacilityPrinting ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SyslogAppender;->j:Z */
return;
} // .end method
public final void setHeader ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SyslogAppender;->m:Z */
return;
} // .end method
public void setSyslogHost ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/helpers/SyslogQuietWriter; */
/* new-instance v1, Lorg/apache/log4j/helpers/SyslogWriter; */
/* invoke-direct {v1, p1}, Lorg/apache/log4j/helpers/SyslogWriter;-><init>(Ljava/lang/String;)V */
/* iget v2, p0, Lorg/apache/log4j/net/SyslogAppender;->h:I */
v3 = this.d;
/* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/helpers/SyslogQuietWriter;-><init>(Ljava/io/Writer;ILorg/apache/log4j/spi/ErrorHandler;)V */
this.k = v0;
/* .line 2 */
this.l = p1;
return;
} // .end method
