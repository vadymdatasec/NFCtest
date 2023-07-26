public class org.apache.log4j.xml.XMLLayout extends org.apache.log4j.Layout {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.StringBuffer a;
	 public Boolean b;
	 public Boolean c;
	 /* # direct methods */
	 public org.apache.log4j.xml.XMLLayout ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/Layout;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* const/16 v1, 0x100 */
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V */
		 this.a = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->b:Z */
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->c:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void activateOptions ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public java.lang.String format ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 v0 = this.a;
		 v0 = 		 (( java.lang.StringBuffer ) v0 ).capacity ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->capacity()I
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/16 v2, 0x800 */
		 /* if-le v0, v2, :cond_0 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* const/16 v2, 0x100 */
		 /* invoke-direct {v0, v2}, Ljava/lang/StringBuffer;-><init>(I)V */
		 this.a = v0;
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.a;
	 (( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
	 /* .line 4 */
} // :goto_0
v0 = this.a;
final String v2 = "<log4j:event logger=\""; // const-string v2, "<log4j:event logger=\""
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 5 */
v0 = this.a;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLoggerName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
org.apache.log4j.helpers.Transform .escapeTags ( v2 );
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 6 */
v0 = this.a;
final String v2 = "\" timestamp=\""; // const-string v2, "\" timestamp=\""
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 7 */
v0 = this.a;
/* iget-wide v2, p1, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J */
(( java.lang.StringBuffer ) v0 ).append ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
/* .line 8 */
v0 = this.a;
final String v2 = "\" level=\""; // const-string v2, "\" level=\""
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 9 */
v0 = this.a;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
java.lang.String .valueOf ( v2 );
org.apache.log4j.helpers.Transform .escapeTags ( v2 );
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 10 */
v0 = this.a;
final String v2 = "\" thread=\""; // const-string v2, "\" thread=\""
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 11 */
v0 = this.a;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
org.apache.log4j.helpers.Transform .escapeTags ( v2 );
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 12 */
v0 = this.a;
final String v2 = "\">\r\n"; // const-string v2, "\">\r\n"
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 13 */
v0 = this.a;
final String v2 = "<log4j:message><![CDATA["; // const-string v2, "<log4j:message><![CDATA["
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 14 */
v0 = this.a;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
org.apache.log4j.helpers.Transform .appendEscapingCDATA ( v0,v2 );
/* .line 15 */
v0 = this.a;
final String v2 = "]]></log4j:message>\r\n"; // const-string v2, "]]></log4j:message>\r\n"
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 16 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 17 */
	 v2 = this.a;
	 final String v3 = "<log4j:NDC><![CDATA["; // const-string v3, "<log4j:NDC><![CDATA["
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 18 */
	 v2 = this.a;
	 org.apache.log4j.helpers.Transform .appendEscapingCDATA ( v2,v0 );
	 /* .line 19 */
	 v0 = this.a;
	 final String v2 = "]]></log4j:NDC>\r\n"; // const-string v2, "]]></log4j:NDC>\r\n"
	 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 20 */
} // :cond_1
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 21 */
	 v2 = this.a;
	 final String v3 = "<log4j:throwable><![CDATA["; // const-string v3, "<log4j:throwable><![CDATA["
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 22 */
} // :goto_1
/* array-length v3, v0 */
/* if-ge v2, v3, :cond_2 */
/* .line 23 */
v3 = this.a;
/* aget-object v4, v0, v2 */
org.apache.log4j.helpers.Transform .appendEscapingCDATA ( v3,v4 );
/* .line 24 */
v3 = this.a;
final String v4 = "\r\n"; // const-string v4, "\r\n"
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v2, v2, 0x1 */
/* .line 25 */
} // :cond_2
v0 = this.a;
final String v2 = "]]></log4j:throwable>\r\n"; // const-string v2, "]]></log4j:throwable>\r\n"
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 26 */
} // :cond_3
/* iget-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->b:Z */
final String v2 = "\"/>\r\n"; // const-string v2, "\"/>\r\n"
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 27 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
/* .line 28 */
v3 = this.a;
final String v4 = "<log4j:locationInfo class=\""; // const-string v4, "<log4j:locationInfo class=\""
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 29 */
v3 = this.a;
(( org.apache.log4j.spi.LocationInfo ) v0 ).getClassName ( ); // invoke-virtual {v0}, Lorg/apache/log4j/spi/LocationInfo;->getClassName()Ljava/lang/String;
org.apache.log4j.helpers.Transform .escapeTags ( v4 );
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 30 */
v3 = this.a;
final String v4 = "\" method=\""; // const-string v4, "\" method=\""
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 31 */
v3 = this.a;
(( org.apache.log4j.spi.LocationInfo ) v0 ).getMethodName ( ); // invoke-virtual {v0}, Lorg/apache/log4j/spi/LocationInfo;->getMethodName()Ljava/lang/String;
org.apache.log4j.helpers.Transform .escapeTags ( v4 );
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 32 */
v3 = this.a;
final String v4 = "\" file=\""; // const-string v4, "\" file=\""
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 33 */
v3 = this.a;
(( org.apache.log4j.spi.LocationInfo ) v0 ).getFileName ( ); // invoke-virtual {v0}, Lorg/apache/log4j/spi/LocationInfo;->getFileName()Ljava/lang/String;
org.apache.log4j.helpers.Transform .escapeTags ( v4 );
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 34 */
v3 = this.a;
final String v4 = "\" line=\""; // const-string v4, "\" line=\""
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 35 */
v3 = this.a;
(( org.apache.log4j.spi.LocationInfo ) v0 ).getLineNumber ( ); // invoke-virtual {v0}, Lorg/apache/log4j/spi/LocationInfo;->getLineNumber()Ljava/lang/String;
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 36 */
v0 = this.a;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 37 */
} // :cond_4
/* iget-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 38 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getPropertyKeySet ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getPropertyKeySet()Ljava/util/Set;
v3 = /* .line 39 */
/* if-lez v3, :cond_7 */
/* .line 40 */
v3 = this.a;
final String v4 = "<log4j:properties>\r\n"; // const-string v4, "<log4j:properties>\r\n"
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 41 */
/* .line 42 */
java.util.Arrays .sort ( v0 );
/* .line 43 */
} // :goto_2
/* array-length v3, v0 */
/* if-ge v1, v3, :cond_6 */
/* .line 44 */
/* aget-object v3, v0, v1 */
(( java.lang.Object ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 45 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getMDC ( v3 ); // invoke-virtual {p1, v3}, Lorg/apache/log4j/spi/LoggingEvent;->getMDC(Ljava/lang/String;)Ljava/lang/Object;
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 46 */
v5 = this.a;
final String v6 = "<log4j:data name=\""; // const-string v6, "<log4j:data name=\""
(( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 47 */
v5 = this.a;
org.apache.log4j.helpers.Transform .escapeTags ( v3 );
(( java.lang.StringBuffer ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 48 */
v3 = this.a;
final String v5 = "\" value=\""; // const-string v5, "\" value=\""
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 49 */
v3 = this.a;
java.lang.String .valueOf ( v4 );
org.apache.log4j.helpers.Transform .escapeTags ( v4 );
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 50 */
v3 = this.a;
(( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_5
/* add-int/lit8 v1, v1, 0x1 */
/* .line 51 */
} // :cond_6
p1 = this.a;
final String v0 = "</log4j:properties>\r\n"; // const-string v0, "</log4j:properties>\r\n"
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 52 */
} // :cond_7
p1 = this.a;
final String v0 = "</log4j:event>\r\n\r\n"; // const-string v0, "</log4j:event>\r\n\r\n"
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 53 */
p1 = this.a;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public Boolean getLocationInfo ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->b:Z */
} // .end method
public Boolean getProperties ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/xml/XMLLayout;->c:Z */
} // .end method
public Boolean ignoresThrowable ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setLocationInfo ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/xml/XMLLayout;->b:Z */
return;
} // .end method
public void setProperties ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/xml/XMLLayout;->c:Z */
return;
} // .end method
