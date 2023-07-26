public class org.apache.log4j.TTCCLayout extends org.apache.log4j.helpers.DateLayout {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean f;
	 public Boolean g;
	 public Boolean h;
	 public final java.lang.StringBuffer i;
	 /* # direct methods */
	 public org.apache.log4j.TTCCLayout ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/helpers/DateLayout;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->f:Z */
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->g:Z */
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->h:Z */
		 /* .line 5 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* const/16 v1, 0x100 */
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V */
		 this.i = v0;
		 final String v0 = "RELATIVE"; // const-string v0, "RELATIVE"
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 6 */
		 (( org.apache.log4j.helpers.DateLayout ) p0 ).setDateFormat ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/apache/log4j/helpers/DateLayout;->setDateFormat(Ljava/lang/String;Ljava/util/TimeZone;)V
		 return;
	 } // .end method
	 public org.apache.log4j.TTCCLayout ( ) {
		 /* .locals 2 */
		 /* .line 7 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/helpers/DateLayout;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 8 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->f:Z */
		 /* .line 9 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->g:Z */
		 /* .line 10 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->h:Z */
		 /* .line 11 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* const/16 v1, 0x100 */
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V */
		 this.i = v0;
		 /* .line 12 */
		 (( org.apache.log4j.helpers.DateLayout ) p0 ).setDateFormat ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/helpers/DateLayout;->setDateFormat(Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String format ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.i;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
		 /* .line 2 */
		 v0 = this.i;
		 (( org.apache.log4j.helpers.DateLayout ) p0 ).dateFormat ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/helpers/DateLayout;->dateFormat(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V
		 /* .line 3 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->f:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 4 */
			 v0 = this.i;
			 /* const/16 v1, 0x5b */
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
			 /* .line 5 */
			 v0 = this.i;
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* .line 6 */
			 v0 = this.i;
			 final String v1 = "] "; // const-string v1, "] "
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* .line 7 */
		 } // :cond_0
		 v0 = this.i;
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
		 (( org.apache.log4j.Priority ) v1 ).toString ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 8 */
		 v0 = this.i;
		 /* const/16 v1, 0x20 */
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
		 /* .line 9 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->g:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 10 */
			 v0 = this.i;
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLoggerName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
			 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* .line 11 */
			 v0 = this.i;
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
			 /* .line 12 */
		 } // :cond_1
		 /* iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->h:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 13 */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 /* .line 14 */
				 v2 = this.i;
				 (( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 /* .line 15 */
				 v0 = this.i;
				 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
				 /* .line 16 */
			 } // :cond_2
			 v0 = this.i;
			 final String v1 = "- "; // const-string v1, "- "
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* .line 17 */
			 v0 = this.i;
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
			 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* .line 18 */
			 p1 = this.i;
			 v0 = org.apache.log4j.Layout.LINE_SEP;
			 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* .line 19 */
			 p1 = this.i;
			 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 } // .end method
		 public Boolean getCategoryPrefixing ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->g:Z */
		 } // .end method
		 public Boolean getContextPrinting ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->h:Z */
		 } // .end method
		 public Boolean getThreadPrinting ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget-boolean v0, p0, Lorg/apache/log4j/TTCCLayout;->f:Z */
		 } // .end method
		 public Boolean ignoresThrowable ( ) {
			 /* .locals 1 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // .end method
		 public void setCategoryPrefixing ( Boolean p0 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 /* iput-boolean p1, p0, Lorg/apache/log4j/TTCCLayout;->g:Z */
			 return;
		 } // .end method
		 public void setContextPrinting ( Boolean p0 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 /* iput-boolean p1, p0, Lorg/apache/log4j/TTCCLayout;->h:Z */
			 return;
		 } // .end method
		 public void setThreadPrinting ( Boolean p0 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 /* iput-boolean p1, p0, Lorg/apache/log4j/TTCCLayout;->f:Z */
			 return;
		 } // .end method
