public class org.apache.log4j.varia.FallbackErrorHandler implements org.apache.log4j.spi.ErrorHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public org.apache.log4j.Appender a;
	 public org.apache.log4j.Appender b;
	 public java.util.Vector c;
	 /* # direct methods */
	 public org.apache.log4j.varia.FallbackErrorHandler ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void activateOptions ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void error ( java.lang.String p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void error ( java.lang.String p0, java.lang.Exception p1, Integer p2 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 (( org.apache.log4j.varia.FallbackErrorHandler ) p0 ).error ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/log4j/varia/FallbackErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;ILorg/apache/log4j/spi/LoggingEvent;)V
		 return;
	 } // .end method
	 public void error ( java.lang.String p0, java.lang.Exception p1, Integer p2, org.apache.log4j.spi.LoggingEvent p3 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* instance-of p3, p2, Ljava/io/InterruptedIOException; */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* .line 3 */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) p3 ).interrupt ( ); // invoke-virtual {p3}, Ljava/lang/Thread;->interrupt()V
			 /* .line 4 */
		 } // :cond_0
		 /* new-instance p3, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V */
		 final String p4 = "FB: The following error reported: "; // const-string p4, "FB: The following error reported: "
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .debug ( p1,p2 );
		 final String p1 = "FB: INITIATING FALLBACK PROCEDURE."; // const-string p1, "FB: INITIATING FALLBACK PROCEDURE."
		 /* .line 5 */
		 org.apache.log4j.helpers.LogLog .debug ( p1 );
		 /* .line 6 */
		 p1 = this.c;
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 7 */
		 } // :goto_0
		 p2 = this.c;
		 p2 = 		 (( java.util.Vector ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/Vector;->size()I
		 /* if-ge p1, p2, :cond_1 */
		 /* .line 8 */
		 p2 = this.c;
		 (( java.util.Vector ) p2 ).elementAt ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
		 /* check-cast p2, Lorg/apache/log4j/Logger; */
		 /* .line 9 */
		 /* new-instance p3, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V */
		 final String p4 = "FB: Searching for ["; // const-string p4, "FB: Searching for ["
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 p4 = this.b;
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String p4 = "] in logger ["; // const-string p4, "] in logger ["
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
		 (( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v0 = "]."; // const-string v0, "]."
		 (( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .debug ( p3 );
		 /* .line 10 */
		 /* new-instance p3, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v1 = "FB: Replacing ["; // const-string v1, "FB: Replacing ["
		 (( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 v1 = this.b;
		 (( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v1 = "] by ["; // const-string v1, "] by ["
		 (( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 v1 = this.a;
		 (( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .debug ( p3 );
		 /* .line 11 */
		 p3 = this.b;
		 (( org.apache.log4j.Category ) p2 ).removeAppender ( p3 ); // invoke-virtual {p2, p3}, Lorg/apache/log4j/Category;->removeAppender(Lorg/apache/log4j/Appender;)V
		 /* .line 12 */
		 /* new-instance p3, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V */
		 final String p4 = "FB: Adding appender ["; // const-string p4, "FB: Adding appender ["
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 p4 = this.a;
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String p4 = "] to logger "; // const-string p4, "] to logger "
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
		 (( java.lang.StringBuffer ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .debug ( p3 );
		 /* .line 13 */
		 p3 = this.a;
		 (( org.apache.log4j.Category ) p2 ).addAppender ( p3 ); // invoke-virtual {p2, p3}, Lorg/apache/log4j/Category;->addAppender(Lorg/apache/log4j/Appender;)V
		 /* add-int/lit8 p1, p1, 0x1 */
		 /* goto/16 :goto_0 */
	 } // :cond_1
	 return;
} // .end method
public void setAppender ( org.apache.log4j.Appender p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v1 = "FB: Setting primary appender to ["; // const-string v1, "FB: Setting primary appender to ["
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = "]."; // const-string v1, "]."
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .debug ( v0 );
	 /* .line 2 */
	 this.b = p1;
	 return;
} // .end method
public void setBackupAppender ( org.apache.log4j.Appender p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v1 = "FB: Setting backup appender to ["; // const-string v1, "FB: Setting backup appender to ["
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = "]."; // const-string v1, "]."
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .debug ( v0 );
	 /* .line 2 */
	 this.a = p1;
	 return;
} // .end method
public void setLogger ( org.apache.log4j.Logger p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v1 = "FB: Adding logger ["; // const-string v1, "FB: Adding logger ["
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( org.apache.log4j.Category ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = "]."; // const-string v1, "]."
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .debug ( v0 );
	 /* .line 2 */
	 v0 = this.c;
	 /* if-nez v0, :cond_0 */
	 /* .line 3 */
	 /* new-instance v0, Ljava/util/Vector; */
	 /* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
	 this.c = v0;
	 /* .line 4 */
} // :cond_0
v0 = this.c;
(( java.util.Vector ) v0 ).addElement ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
return;
} // .end method
