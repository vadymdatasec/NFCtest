public class org.apache.log4j.pattern.ThrowableInformationPatternConverter extends org.apache.log4j.pattern.LoggingEventPatternConverter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer c;
	 /* # direct methods */
	 public org.apache.log4j.pattern.ThrowableInformationPatternConverter ( ) {
		 /* .locals 3 */
		 final String v0 = "Throwable"; // const-string v0, "Throwable"
		 final String v1 = "throwable"; // const-string v1, "throwable"
		 /* .line 1 */
		 /* invoke-direct {p0, v0, v1}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 /* const v0, 0x7fffffff */
		 /* .line 2 */
		 /* iput v0, p0, Lorg/apache/log4j/pattern/ThrowableInformationPatternConverter;->c:I */
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 3 */
			 /* array-length v0, p1 */
			 /* if-lez v0, :cond_2 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 4 */
			 /* aget-object v1, p1, v0 */
			 final String v2 = "none"; // const-string v2, "none"
			 v1 = 			 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 5 */
				 /* iput v0, p0, Lorg/apache/log4j/pattern/ThrowableInformationPatternConverter;->c:I */
				 /* .line 6 */
			 } // :cond_0
			 /* aget-object v1, p1, v0 */
			 final String v2 = "short"; // const-string v2, "short"
			 v1 = 			 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 int p1 = 1; // const/4 p1, 0x1
				 /* .line 7 */
				 /* iput p1, p0, Lorg/apache/log4j/pattern/ThrowableInformationPatternConverter;->c:I */
				 /* .line 8 */
			 } // :cond_1
			 try { // :try_start_0
				 /* aget-object p1, p1, v0 */
				 p1 = 				 java.lang.Integer .parseInt ( p1 );
				 /* iput p1, p0, Lorg/apache/log4j/pattern/ThrowableInformationPatternConverter;->c:I */
				 /* :try_end_0 */
				 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
			 } // :cond_2
		 } // :goto_0
		 return;
	 } // .end method
	 public static org.apache.log4j.pattern.ThrowableInformationPatternConverter newInstance ( java.lang.String[] p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/pattern/ThrowableInformationPatternConverter; */
		 /* invoke-direct {v0, p0}, Lorg/apache/log4j/pattern/ThrowableInformationPatternConverter;-><init>([Ljava/lang/String;)V */
	 } // .end method
	 /* # virtual methods */
	 public void format ( org.apache.log4j.spi.LoggingEvent p0, java.lang.StringBuffer p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* iget v0, p0, Lorg/apache/log4j/pattern/ThrowableInformationPatternConverter;->c:I */
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 2 */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableInformation()Lorg/apache/log4j/spi/ThrowableInformation;
			 if ( p1 != null) { // if-eqz p1, :cond_2
				 /* .line 3 */
				 (( org.apache.log4j.spi.ThrowableInformation ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/ThrowableInformation;->getThrowableStrRep()[Ljava/lang/String;
				 /* .line 4 */
				 /* array-length v0, p1 */
				 /* .line 5 */
				 /* iget v1, p0, Lorg/apache/log4j/pattern/ThrowableInformationPatternConverter;->c:I */
				 /* if-gez v1, :cond_0 */
				 /* add-int/2addr v0, v1 */
			 } // :cond_0
			 /* if-le v0, v1, :cond_1 */
			 /* move v0, v1 */
		 } // :cond_1
	 } // :goto_0
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-ge v1, v0, :cond_2 */
/* .line 6 */
/* aget-object v2, p1, v1 */
/* .line 7 */
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuffer ) p2 ).append ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
return;
} // .end method
public Boolean handlesThrowable ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
