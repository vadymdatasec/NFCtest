public class inal {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/AsyncAppender; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x19 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public org.apache.log4j.spi.LoggingEvent a;
public Integer b;
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
int p1 = 1; // const/4 p1, 0x1
/* .line 3 */
/* iput p1, p0, Lorg/apache/log4j/AsyncAppender$a;->b:I */
return;
} // .end method
/* # virtual methods */
public org.apache.log4j.spi.LoggingEvent a ( ) {
/* .locals 8 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 4 */
/* new-instance v1, Ljava/lang/Integer; */
/* iget v2, p0, Lorg/apache/log4j/AsyncAppender$a;->b:I */
/* invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V */
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
v1 = this.a;
(( org.apache.log4j.spi.LoggingEvent ) v1 ).getMessage ( ); // invoke-virtual {v1}, Lorg/apache/log4j/spi/LoggingEvent;->getMessage()Ljava/lang/Object;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
final String v1 = "Discarded {0} messages due to full event buffer including: {1}"; // const-string v1, "Discarded {0} messages due to full event buffer including: {1}"
java.text.MessageFormat .format ( v1,v0 );
/* .line 5 */
/* new-instance v0, Lorg/apache/log4j/spi/LoggingEvent; */
v1 = this.a;
(( org.apache.log4j.spi.LoggingEvent ) v1 ).getLoggerName ( ); // invoke-virtual {v1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
org.apache.log4j.Logger .getLogger ( v1 );
v1 = this.a;
(( org.apache.log4j.spi.LoggingEvent ) v1 ).getLevel ( ); // invoke-virtual {v1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
final String v3 = "org.apache.log4j.AsyncAppender.DONT_REPORT_LOCATION"; // const-string v3, "org.apache.log4j.AsyncAppender.DONT_REPORT_LOCATION"
int v7 = 0; // const/4 v7, 0x0
/* move-object v2, v0 */
/* invoke-direct/range {v2 ..v7}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
} // .end method
public void a ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 2 */
/* .line 1 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).toInt ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Priority;->toInt()I
v1 = this.a;
(( org.apache.log4j.spi.LoggingEvent ) v1 ).getLevel ( ); // invoke-virtual {v1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
v1 = (( org.apache.log4j.Priority ) v1 ).toInt ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Priority;->toInt()I
/* if-le v0, v1, :cond_0 */
/* .line 2 */
this.a = p1;
/* .line 3 */
} // :cond_0
/* iget p1, p0, Lorg/apache/log4j/AsyncAppender$a;->b:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Lorg/apache/log4j/AsyncAppender$a;->b:I */
return;
} // .end method
