public class m.a.b.h.j {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Long a;
	 public final org.apache.log4j.Priority b;
	 public final java.lang.String c;
	 public final java.lang.String d;
	 public final java.lang.String e;
	 public final java.lang.String f;
	 /* # direct methods */
	 public m.a.b.h.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput-wide p1, p0, Lm/a/b/h/j;->a:J */
		 /* .line 3 */
		 this.b = p3;
		 /* .line 4 */
		 this.c = p4;
		 /* .line 5 */
		 this.d = p5;
		 /* .line 6 */
		 this.e = p6;
		 /* .line 7 */
		 this.f = p7;
		 return;
	 } // .end method
	 public m.a.b.h.j ( ) {
		 /* .locals 10 */
		 /* .line 8 */
		 /* iget-wide v1, p1, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J */
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLoggerName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
		 /* if-nez v0, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_0
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
	 p1 = this.fullInfo;
} // :goto_0
/* move-object v9, p1 */
/* move-object v0, p0 */
/* invoke-direct/range {v0 ..v9}, Lm/a/b/h/j;-><init>(JLorg/apache/log4j/Priority;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public java.lang.String b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public java.lang.String c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public org.apache.log4j.Priority d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public java.lang.String e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public Long f ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Lm/a/b/h/j;->a:J */
/* return-wide v0 */
} // .end method
