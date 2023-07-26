public class org.apache.log4j.net.SMTPAppender extends org.apache.log4j.AppenderSkeleton implements org.apache.log4j.xml.UnrecognizedElementHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static java.lang.Class z; //synthetic
	 /* # instance fields */
	 public java.lang.String h;
	 public java.lang.String i;
	 public java.lang.String j;
	 public java.lang.String k;
	 public java.lang.String l;
	 public java.lang.String m;
	 public java.lang.String n;
	 public java.lang.String o;
	 public java.lang.String p;
	 public java.lang.String q;
	 public Integer r;
	 public Boolean s;
	 public Integer t;
	 public Boolean u;
	 public Boolean v;
	 public org.apache.log4j.helpers.CyclicBuffer w;
	 public javax.mail.Message x;
	 public org.apache.log4j.spi.TriggeringEventEvaluator y;
	 /* # direct methods */
	 public org.apache.log4j.net.SMTPAppender ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lm/a/b/k/a; */
		 /* invoke-direct {v0}, Lm/a/b/k/a;-><init>()V */
		 /* invoke-direct {p0, v0}, Lorg/apache/log4j/net/SMTPAppender;-><init>(Lorg/apache/log4j/spi/TriggeringEventEvaluator;)V */
		 return;
	 } // .end method
	 public org.apache.log4j.net.SMTPAppender ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 3 */
		 /* iput v0, p0, Lorg/apache/log4j/net/SMTPAppender;->r:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SMTPAppender;->s:Z */
		 /* const/16 v1, 0x200 */
		 /* .line 5 */
		 /* iput v1, p0, Lorg/apache/log4j/net/SMTPAppender;->t:I */
		 /* .line 6 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SMTPAppender;->u:Z */
		 /* .line 7 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SMTPAppender;->v:Z */
		 /* .line 8 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/CyclicBuffer; */
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/helpers/CyclicBuffer;-><init>(I)V */
		 this.w = v0;
		 /* .line 9 */
		 this.y = p1;
		 return;
	 } // .end method
	 public static java.lang.Class c ( java.lang.String p0 ) { //synthethic
		 /* .locals 1 */
		 /* .line 15 */
		 try { // :try_start_0
			 java.lang.Class .forName ( p0 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p0 */
			 /* new-instance v0, Ljava/lang/NoClassDefFoundError; */
			 /* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
			 (( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
			 /* throw p0 */
		 } // .end method
		 /* # virtual methods */
		 public javax.mail.internet.InternetAddress a ( java.lang.String p0 ) {
			 /* .locals 4 */
			 /* .line 18 */
			 try { // :try_start_0
				 /* new-instance v0, Ljavax/mail/internet/InternetAddress; */
				 /* invoke-direct {v0, p1}, Ljavax/mail/internet/InternetAddress;-><init>(Ljava/lang/String;)V */
				 /* :try_end_0 */
				 /* .catch Ljavax/mail/internet/AddressException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 /* move-exception v0 */
				 /* .line 19 */
				 v1 = this.d;
				 /* new-instance v2, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v3 = "Could not parse address ["; // const-string v3, "Could not parse address ["
				 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 final String p1 = "]."; // const-string p1, "]."
				 (( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 int v2 = 6; // const/4 v2, 0x6
				 int p1 = 0; // const/4 p1, 0x0
			 } // .end method
			 public void a ( javax.mail.Message p0 ) {
				 /* .locals 2 */
				 /* .annotation system Ldalvik/annotation/Throws; */
				 /* value = { */
				 /* Ljavax/mail/MessagingException; */
				 /* } */
			 } // .end annotation
			 /* .line 1 */
			 v0 = this.k;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 (( org.apache.log4j.net.SMTPAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/net/SMTPAppender;->a(Ljava/lang/String;)Ljavax/mail/internet/InternetAddress;
				 (( javax.mail.Message ) p1 ).setFrom ( v0 ); // invoke-virtual {p1, v0}, Ljavax/mail/Message;->setFrom(Ljavax/mail/Address;)V
				 /* .line 3 */
			 } // :cond_0
			 (( javax.mail.Message ) p1 ).setFrom ( ); // invoke-virtual {p1}, Ljavax/mail/Message;->setFrom()V
			 /* .line 4 */
		 } // :goto_0
		 v0 = this.l;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = 			 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
			 /* if-lez v0, :cond_1 */
			 /* .line 5 */
			 v0 = this.l;
			 (( org.apache.log4j.net.SMTPAppender ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/net/SMTPAppender;->b(Ljava/lang/String;)[Ljavax/mail/internet/InternetAddress;
			 (( javax.mail.Message ) p1 ).setReplyTo ( v0 ); // invoke-virtual {p1, v0}, Ljavax/mail/Message;->setReplyTo([Ljavax/mail/Address;)V
			 /* .line 6 */
		 } // :cond_1
		 v0 = this.h;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 v0 = 			 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
			 /* if-lez v0, :cond_2 */
			 /* .line 7 */
			 v0 = javax.mail.Message$RecipientType.TO;
			 v1 = this.h;
			 (( org.apache.log4j.net.SMTPAppender ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/net/SMTPAppender;->b(Ljava/lang/String;)[Ljavax/mail/internet/InternetAddress;
			 (( javax.mail.Message ) p1 ).setRecipients ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljavax/mail/Message;->setRecipients(Ljavax/mail/Message$RecipientType;[Ljavax/mail/Address;)V
			 /* .line 8 */
		 } // :cond_2
		 v0 = this.i;
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 v0 = 			 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
			 /* if-lez v0, :cond_3 */
			 /* .line 9 */
			 v0 = javax.mail.Message$RecipientType.CC;
			 v1 = this.i;
			 (( org.apache.log4j.net.SMTPAppender ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/net/SMTPAppender;->b(Ljava/lang/String;)[Ljavax/mail/internet/InternetAddress;
			 (( javax.mail.Message ) p1 ).setRecipients ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljavax/mail/Message;->setRecipients(Ljavax/mail/Message$RecipientType;[Ljavax/mail/Address;)V
			 /* .line 10 */
		 } // :cond_3
		 v0 = this.j;
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 v0 = 			 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
			 /* if-lez v0, :cond_4 */
			 /* .line 11 */
			 v0 = javax.mail.Message$RecipientType.BCC;
			 v1 = this.j;
			 (( org.apache.log4j.net.SMTPAppender ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/net/SMTPAppender;->b(Ljava/lang/String;)[Ljavax/mail/internet/InternetAddress;
			 (( javax.mail.Message ) p1 ).setRecipients ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljavax/mail/Message;->setRecipients(Ljavax/mail/Message$RecipientType;[Ljavax/mail/Address;)V
		 } // :cond_4
		 return;
	 } // .end method
	 public Boolean a ( ) {
		 /* .locals 5 */
		 /* .line 12 */
		 v0 = this.x;
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 13 */
		 v0 = this.d;
		 final String v2 = "Message object not configured."; // const-string v2, "Message object not configured."
		 /* .line 14 */
	 } // :cond_0
	 v0 = this.y;
	 final String v2 = "]."; // const-string v2, "]."
	 /* if-nez v0, :cond_1 */
	 /* .line 15 */
	 v0 = this.d;
	 /* new-instance v3, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v4 = "No TriggeringEventEvaluator is set for appender ["; // const-string v4, "No TriggeringEventEvaluator is set for appender ["
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v4 = this.b;
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* .line 16 */
} // :cond_1
v0 = this.a;
/* if-nez v0, :cond_2 */
/* .line 17 */
v0 = this.d;
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "No layout set for appender named ["; // const-string v4, "No layout set for appender named ["
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v4 = this.b;
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void activateOptions ( ) {
/* .locals 4 */
/* .line 1 */
(( org.apache.log4j.net.SMTPAppender ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SMTPAppender;->b()Ljavax/mail/Session;
/* .line 2 */
/* new-instance v1, Ljavax/mail/internet/MimeMessage; */
/* invoke-direct {v1, v0}, Ljavax/mail/internet/MimeMessage;-><init>(Ljavax/mail/Session;)V */
this.x = v1;
/* .line 3 */
try { // :try_start_0
(( org.apache.log4j.net.SMTPAppender ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/net/SMTPAppender;->a(Ljavax/mail/Message;)V
/* .line 4 */
v0 = this.m;
/* :try_end_0 */
/* .catch Ljavax/mail/MessagingException; {:try_start_0 ..:try_end_0} :catch_1 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 5 */
	 try { // :try_start_1
		 v0 = this.x;
		 v1 = this.m;
		 final String v2 = "UTF-8"; // const-string v2, "UTF-8"
		 int v3 = 0; // const/4 v3, 0x0
		 javax.mail.internet.MimeUtility .encodeText ( v1,v2,v3 );
		 (( javax.mail.Message ) v0 ).setSubject ( v1 ); // invoke-virtual {v0, v1}, Ljavax/mail/Message;->setSubject(Ljava/lang/String;)V
		 /* :try_end_1 */
		 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* .catch Ljavax/mail/MessagingException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 try { // :try_start_2
			 final String v1 = "Unable to encode SMTP subject"; // const-string v1, "Unable to encode SMTP subject"
			 /* .line 6 */
			 org.apache.log4j.helpers.LogLog .error ( v1,v0 );
			 /* :try_end_2 */
			 /* .catch Ljavax/mail/MessagingException; {:try_start_2 ..:try_end_2} :catch_1 */
			 /* :catch_1 */
			 /* move-exception v0 */
			 final String v1 = "Could not activate SMTPAppender options."; // const-string v1, "Could not activate SMTPAppender options."
			 /* .line 7 */
			 org.apache.log4j.helpers.LogLog .error ( v1,v0 );
			 /* .line 8 */
		 } // :cond_0
	 } // :goto_0
	 v0 = this.y;
	 /* instance-of v1, v0, Lorg/apache/log4j/spi/OptionHandler; */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 9 */
		 /* check-cast v0, Lorg/apache/log4j/spi/OptionHandler; */
	 } // :cond_1
	 return;
} // .end method
public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = 	 (( org.apache.log4j.net.SMTPAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SMTPAppender;->a()Z
	 /* if-nez v0, :cond_0 */
	 return;
	 /* .line 2 */
} // :cond_0
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
/* .line 3 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
/* .line 4 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getMDCCopy ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V
/* .line 5 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SMTPAppender;->u:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 6 */
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
	 /* .line 7 */
} // :cond_1
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
/* .line 8 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
/* .line 9 */
v0 = this.w;
(( org.apache.log4j.helpers.CyclicBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/CyclicBuffer;->add(Lorg/apache/log4j/spi/LoggingEvent;)V
/* .line 10 */
p1 = v0 = this.y;
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 11 */
	 (( org.apache.log4j.net.SMTPAppender ) p0 ).d ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SMTPAppender;->d()V
} // :cond_2
return;
} // .end method
public javax.mail.Session b ( ) {
/* .locals 4 */
/* .line 1 */
try { // :try_start_0
	 /* new-instance v0, Ljava/util/Properties; */
	 java.lang.System .getProperties ( );
	 /* invoke-direct {v0, v1}, Ljava/util/Properties;-><init>(Ljava/util/Properties;)V */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 2 */
	 /* :catch_0 */
	 /* new-instance v0, Ljava/util/Properties; */
	 /* invoke-direct {v0}, Ljava/util/Properties;-><init>()V */
	 /* .line 3 */
} // :goto_0
v1 = this.q;
if ( v1 != null) { // if-eqz v1, :cond_0
	 final String v2 = "mail.transport.protocol"; // const-string v2, "mail.transport.protocol"
	 /* .line 4 */
	 (( java.util.Properties ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 5 */
	 /* new-instance v1, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v2 = "mail."; // const-string v2, "mail."
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v2 = this.q;
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_0
final String v1 = "mail.smtp"; // const-string v1, "mail.smtp"
/* .line 6 */
} // :goto_1
v2 = this.n;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = ".host"; // const-string v3, ".host"
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
v3 = this.n;
(( java.util.Properties ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 8 */
} // :cond_1
/* iget v2, p0, Lorg/apache/log4j/net/SMTPAppender;->r:I */
/* if-lez v2, :cond_2 */
/* .line 9 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = ".port"; // const-string v3, ".port"
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* iget v3, p0, Lorg/apache/log4j/net/SMTPAppender;->r:I */
java.lang.String .valueOf ( v3 );
(( java.util.Properties ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 10 */
v3 = this.p;
if ( v3 != null) { // if-eqz v3, :cond_3
v3 = this.o;
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 11 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = ".auth"; // const-string v1, ".auth"
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
final String v2 = "true"; // const-string v2, "true"
(( java.util.Properties ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 12 */
/* new-instance v2, Lm/a/b/k/b; */
/* invoke-direct {v2, p0}, Lm/a/b/k/b;-><init>(Lorg/apache/log4j/net/SMTPAppender;)V */
/* .line 13 */
} // :cond_3
javax.mail.Session .getInstance ( v0,v2 );
/* .line 14 */
v1 = this.q;
if ( v1 != null) { // if-eqz v1, :cond_4
final String v2 = "rfc822"; // const-string v2, "rfc822"
/* .line 15 */
(( javax.mail.Session ) v0 ).setProtocolForAddress ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljavax/mail/Session;->setProtocolForAddress(Ljava/lang/String;Ljava/lang/String;)V
/* .line 16 */
} // :cond_4
/* iget-boolean v1, p0, Lorg/apache/log4j/net/SMTPAppender;->s:Z */
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 17 */
(( javax.mail.Session ) v0 ).setDebug ( v1 ); // invoke-virtual {v0, v1}, Ljavax/mail/Session;->setDebug(Z)V
} // :cond_5
} // .end method
public javax.mail.internet.InternetAddress b ( java.lang.String p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* .line 18 */
try { // :try_start_0
javax.mail.internet.InternetAddress .parse ( p1,v0 );
/* :try_end_0 */
/* .catch Ljavax/mail/internet/AddressException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 19 */
v1 = this.d;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Could not parse address ["; // const-string v3, "Could not parse address ["
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "]."; // const-string p1, "]."
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
int v2 = 6; // const/4 v2, 0x6
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.String c ( ) {
/* .locals 7 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 2 */
v1 = this.a;
(( org.apache.log4j.Layout ) v1 ).getHeader ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Layout;->getHeader()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 3 */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 4 */
} // :cond_0
v1 = this.w;
v1 = (( org.apache.log4j.helpers.CyclicBuffer ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/CyclicBuffer;->length()I
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_2 */
/* .line 5 */
v4 = this.w;
(( org.apache.log4j.helpers.CyclicBuffer ) v4 ).get ( ); // invoke-virtual {v4}, Lorg/apache/log4j/helpers/CyclicBuffer;->get()Lorg/apache/log4j/spi/LoggingEvent;
/* .line 6 */
v5 = this.a;
(( org.apache.log4j.Layout ) v5 ).format ( v4 ); // invoke-virtual {v5, v4}, Lorg/apache/log4j/Layout;->format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 7 */
v5 = this.a;
v5 = (( org.apache.log4j.Layout ) v5 ).ignoresThrowable ( ); // invoke-virtual {v5}, Lorg/apache/log4j/Layout;->ignoresThrowable()Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 8 */
(( org.apache.log4j.spi.LoggingEvent ) v4 ).getThrowableStrRep ( ); // invoke-virtual {v4}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
if ( v4 != null) { // if-eqz v4, :cond_1
	 int v5 = 0; // const/4 v5, 0x0
	 /* .line 9 */
} // :goto_1
/* array-length v6, v4 */
/* if-ge v5, v6, :cond_1 */
/* .line 10 */
/* aget-object v6, v4, v5 */
(( java.lang.StringBuffer ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 11 */
v6 = org.apache.log4j.Layout.LINE_SEP;
(( java.lang.StringBuffer ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
/* .line 12 */
} // :cond_2
v1 = this.a;
(( org.apache.log4j.Layout ) v1 ).getFooter ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Layout;->getFooter()Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 13 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 14 */
} // :cond_3
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public synchronized void close ( ) {
/* .locals 1 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
try { // :try_start_0
/* iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
/* .line 2 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SMTPAppender;->v:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.w;
v0 = (( org.apache.log4j.helpers.CyclicBuffer ) v0 ).length ( ); // invoke-virtual {v0}, Lorg/apache/log4j/helpers/CyclicBuffer;->length()I
/* if-lez v0, :cond_0 */
/* .line 3 */
(( org.apache.log4j.net.SMTPAppender ) p0 ).d ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SMTPAppender;->d()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void d ( ) {
/* .locals 9 */
final String v0 = "quoted-printable"; // const-string v0, "quoted-printable"
final String v1 = "Error occured while sending e-mail notification."; // const-string v1, "Error occured while sending e-mail notification."
/* .line 1 */
try { // :try_start_0
(( org.apache.log4j.net.SMTPAppender ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SMTPAppender;->c()Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* .line 2 */
} // :goto_0
v7 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* if-ge v5, v7, :cond_1 */
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 3 */
v6 = (( java.lang.String ) v2 ).charAt ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C
/* const/16 v7, 0x7f */
/* if-gt v6, v7, :cond_0 */
int v6 = 1; // const/4 v6, 0x1
} // :cond_0
int v6 = 0; // const/4 v6, 0x0
} // :goto_1
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_1
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 4 */
/* new-instance v0, Ljavax/mail/internet/MimeBodyPart; */
/* invoke-direct {v0}, Ljavax/mail/internet/MimeBodyPart;-><init>()V */
/* .line 5 */
v3 = this.a;
(( org.apache.log4j.Layout ) v3 ).getContentType ( ); // invoke-virtual {v3}, Lorg/apache/log4j/Layout;->getContentType()Ljava/lang/String;
(( javax.mail.internet.MimeBodyPart ) v0 ).setContent ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljavax/mail/internet/MimeBodyPart;->setContent(Ljava/lang/Object;Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljavax/mail/MessagingException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 6 */
} // :cond_2
try { // :try_start_1
/* new-instance v4, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 7 */
/* new-instance v5, Ljava/io/OutputStreamWriter; */
javax.mail.internet.MimeUtility .encode ( v4,v0 );
final String v7 = "UTF-8"; // const-string v7, "UTF-8"
/* invoke-direct {v5, v6, v7}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V */
/* .line 8 */
(( java.io.Writer ) v5 ).write ( v2 ); // invoke-virtual {v5, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V
/* .line 9 */
(( java.io.Writer ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/Writer;->close()V
/* .line 10 */
/* new-instance v5, Ljavax/mail/internet/InternetHeaders; */
/* invoke-direct {v5}, Ljavax/mail/internet/InternetHeaders;-><init>()V */
final String v6 = "Content-Type"; // const-string v6, "Content-Type"
/* .line 11 */
/* new-instance v7, Ljava/lang/StringBuffer; */
/* invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V */
v8 = this.a;
(( org.apache.log4j.Layout ) v8 ).getContentType ( ); // invoke-virtual {v8}, Lorg/apache/log4j/Layout;->getContentType()Ljava/lang/String;
(( java.lang.StringBuffer ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v8 = "; charset=UTF-8"; // const-string v8, "; charset=UTF-8"
(( java.lang.StringBuffer ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( javax.mail.internet.InternetHeaders ) v5 ).setHeader ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljavax/mail/internet/InternetHeaders;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
final String v6 = "Content-Transfer-Encoding"; // const-string v6, "Content-Transfer-Encoding"
/* .line 12 */
(( javax.mail.internet.InternetHeaders ) v5 ).setHeader ( v6, v0 ); // invoke-virtual {v5, v6, v0}, Ljavax/mail/internet/InternetHeaders;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
/* .line 13 */
/* new-instance v0, Ljavax/mail/internet/MimeBodyPart; */
(( java.io.ByteArrayOutputStream ) v4 ).toByteArray ( ); // invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* invoke-direct {v0, v5, v4}, Ljavax/mail/internet/MimeBodyPart;-><init>(Ljavax/mail/internet/InternetHeaders;[B)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljavax/mail/MessagingException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 14 */
/* :catch_0 */
try { // :try_start_2
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 15 */
} // :goto_2
v2 = (( java.lang.StringBuffer ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I
/* if-ge v3, v2, :cond_4 */
/* .line 16 */
v2 = (( java.lang.StringBuffer ) v0 ).charAt ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->charAt(I)C
/* const/16 v4, 0x80 */
/* if-lt v2, v4, :cond_3 */
/* const/16 v2, 0x3f */
/* .line 17 */
(( java.lang.StringBuffer ) v0 ).setCharAt ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Ljava/lang/StringBuffer;->setCharAt(IC)V
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
/* .line 18 */
} // :cond_4
/* new-instance v2, Ljavax/mail/internet/MimeBodyPart; */
/* invoke-direct {v2}, Ljavax/mail/internet/MimeBodyPart;-><init>()V */
/* .line 19 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
v3 = this.a;
(( org.apache.log4j.Layout ) v3 ).getContentType ( ); // invoke-virtual {v3}, Lorg/apache/log4j/Layout;->getContentType()Ljava/lang/String;
(( javax.mail.internet.MimeBodyPart ) v2 ).setContent ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Ljavax/mail/internet/MimeBodyPart;->setContent(Ljava/lang/Object;Ljava/lang/String;)V
/* move-object v0, v2 */
/* .line 20 */
} // :goto_3
/* new-instance v2, Ljavax/mail/internet/MimeMultipart; */
/* invoke-direct {v2}, Ljavax/mail/internet/MimeMultipart;-><init>()V */
/* .line 21 */
(( javax.mail.Multipart ) v2 ).addBodyPart ( v0 ); // invoke-virtual {v2, v0}, Ljavax/mail/Multipart;->addBodyPart(Ljavax/mail/BodyPart;)V
/* .line 22 */
v0 = this.x;
(( javax.mail.Message ) v0 ).setContent ( v2 ); // invoke-virtual {v0, v2}, Ljavax/mail/Message;->setContent(Ljavax/mail/Multipart;)V
/* .line 23 */
v0 = this.x;
/* new-instance v2, Ljava/util/Date; */
/* invoke-direct {v2}, Ljava/util/Date;-><init>()V */
(( javax.mail.Message ) v0 ).setSentDate ( v2 ); // invoke-virtual {v0, v2}, Ljavax/mail/Message;->setSentDate(Ljava/util/Date;)V
/* .line 24 */
v0 = this.x;
javax.mail.Transport .send ( v0 );
/* :try_end_2 */
/* .catch Ljavax/mail/MessagingException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catch Ljava/lang/RuntimeException; {:try_start_2 ..:try_end_2} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
/* .line 25 */
org.apache.log4j.helpers.LogLog .error ( v1,v0 );
/* :catch_2 */
/* move-exception v0 */
/* .line 26 */
org.apache.log4j.helpers.LogLog .error ( v1,v0 );
} // :goto_4
return;
} // .end method
public java.lang.String getBcc ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public Integer getBufferSize ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/net/SMTPAppender;->t:I */
} // .end method
public java.lang.String getCc ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public final org.apache.log4j.spi.TriggeringEventEvaluator getEvaluator ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
} // .end method
public java.lang.String getEvaluatorClass ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
} // :goto_0
} // .end method
public java.lang.String getFrom ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
} // .end method
public Boolean getLocationInfo ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SMTPAppender;->u:Z */
} // .end method
public java.lang.String getReplyTo ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
} // .end method
public Boolean getSMTPDebug ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SMTPAppender;->s:Z */
} // .end method
public java.lang.String getSMTPHost ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.n;
} // .end method
public java.lang.String getSMTPPassword ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.p;
} // .end method
public final Integer getSMTPPort ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/net/SMTPAppender;->r:I */
} // .end method
public final java.lang.String getSMTPProtocol ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
} // .end method
public java.lang.String getSMTPUsername ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.o;
} // .end method
public final Boolean getSendOnClose ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SMTPAppender;->v:Z */
} // .end method
public java.lang.String getSubject ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.m;
} // .end method
public java.lang.String getTo ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public Boolean parseUnrecognizedElement ( org.w3c.dom.Element p0, java.util.Properties p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 1 */
final String v1 = "triggeringPolicy"; // const-string v1, "triggeringPolicy"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
v0 = org.apache.log4j.net.SMTPAppender.z;
/* if-nez v0, :cond_0 */
final String v0 = "org.apache.log4j.spi.TriggeringEventEvaluator"; // const-string v0, "org.apache.log4j.spi.TriggeringEventEvaluator"
org.apache.log4j.net.SMTPAppender .c ( v0 );
} // :cond_0
org.apache.log4j.xml.DOMConfigurator .parseElement ( p1,p2,v0 );
/* .line 3 */
/* instance-of p2, p1, Lorg/apache/log4j/spi/TriggeringEventEvaluator; */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 4 */
/* check-cast p1, Lorg/apache/log4j/spi/TriggeringEventEvaluator; */
(( org.apache.log4j.net.SMTPAppender ) p0 ).setEvaluator ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/net/SMTPAppender;->setEvaluator(Lorg/apache/log4j/spi/TriggeringEventEvaluator;)V
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean requiresLayout ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void setBcc ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.j = p1;
return;
} // .end method
public void setBufferSize ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/net/SMTPAppender;->t:I */
/* .line 2 */
v0 = this.w;
(( org.apache.log4j.helpers.CyclicBuffer ) v0 ).resize ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/CyclicBuffer;->resize(I)V
return;
} // .end method
public void setCc ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
return;
} // .end method
public final void setEvaluator ( org.apache.log4j.spi.TriggeringEventEvaluator p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
this.y = p1;
return;
/* .line 2 */
} // :cond_0
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "trigger"; // const-string v0, "trigger"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void setEvaluatorClass ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = org.apache.log4j.net.SMTPAppender.z;
/* if-nez v0, :cond_0 */
final String v0 = "org.apache.log4j.spi.TriggeringEventEvaluator"; // const-string v0, "org.apache.log4j.spi.TriggeringEventEvaluator"
org.apache.log4j.net.SMTPAppender .c ( v0 );
} // :cond_0
v1 = this.y;
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( p1,v0,v1 );
/* check-cast p1, Lorg/apache/log4j/spi/TriggeringEventEvaluator; */
this.y = p1;
return;
} // .end method
public void setFrom ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.k = p1;
return;
} // .end method
public void setLocationInfo ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SMTPAppender;->u:Z */
return;
} // .end method
public void setReplyTo ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.l = p1;
return;
} // .end method
public void setSMTPDebug ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SMTPAppender;->s:Z */
return;
} // .end method
public void setSMTPHost ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.n = p1;
return;
} // .end method
public void setSMTPPassword ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.p = p1;
return;
} // .end method
public final void setSMTPPort ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/net/SMTPAppender;->r:I */
return;
} // .end method
public final void setSMTPProtocol ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.q = p1;
return;
} // .end method
public void setSMTPUsername ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.o = p1;
return;
} // .end method
public final void setSendOnClose ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SMTPAppender;->v:Z */
return;
} // .end method
public void setSubject ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.m = p1;
return;
} // .end method
public void setTo ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.h = p1;
return;
} // .end method
