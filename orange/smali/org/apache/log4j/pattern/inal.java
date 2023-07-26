public class inal extends org.apache.log4j.pattern.LoggingEventPatternConverter {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final org.apache.log4j.pattern.LevelPatternConverter c;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/pattern/LevelPatternConverter; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/pattern/LevelPatternConverter;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 2 */
		 final String v0 = "Level"; // const-string v0, "Level"
		 final String v1 = "level"; // const-string v1, "level"
		 /* .line 1 */
		 /* invoke-direct {p0, v0, v1}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public static org.apache.log4j.pattern.LevelPatternConverter newInstance ( java.lang.String[] p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = org.apache.log4j.pattern.LevelPatternConverter.c;
	 } // .end method
	 /* # virtual methods */
	 public void format ( org.apache.log4j.spi.LoggingEvent p0, java.lang.StringBuffer p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
		 (( org.apache.log4j.Priority ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;
		 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 return;
	 } // .end method
	 public java.lang.String getStyleClass ( java.lang.Object p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* instance-of v0, p1, Lorg/apache/log4j/spi/LoggingEvent; */
		 if ( v0 != null) { // if-eqz v0, :cond_6
			 /* .line 2 */
			 /* check-cast p1, Lorg/apache/log4j/spi/LoggingEvent; */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
			 v0 = 			 (( org.apache.log4j.Priority ) v0 ).toInt ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Priority;->toInt()I
			 /* const/16 v1, 0x1388 */
			 /* if-eq v0, v1, :cond_5 */
			 /* const/16 v1, 0x2710 */
			 /* if-eq v0, v1, :cond_4 */
			 /* const/16 v1, 0x4e20 */
			 /* if-eq v0, v1, :cond_3 */
			 /* const/16 v1, 0x7530 */
			 /* if-eq v0, v1, :cond_2 */
			 /* const v1, 0x9c40 */
			 /* if-eq v0, v1, :cond_1 */
			 /* const v1, 0xc350 */
			 /* if-eq v0, v1, :cond_0 */
			 /* .line 3 */
			 /* new-instance v0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v1 = "level "; // const-string v1, "level "
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
			 (( org.apache.log4j.Priority ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;
			 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 } // :cond_0
		 final String p1 = "level fatal"; // const-string p1, "level fatal"
	 } // :cond_1
	 final String p1 = "level error"; // const-string p1, "level error"
} // :cond_2
final String p1 = "level warn"; // const-string p1, "level warn"
} // :cond_3
final String p1 = "level info"; // const-string p1, "level info"
} // :cond_4
final String p1 = "level debug"; // const-string p1, "level debug"
} // :cond_5
final String p1 = "level trace"; // const-string p1, "level trace"
} // :cond_6
final String p1 = "level"; // const-string p1, "level"
} // .end method
