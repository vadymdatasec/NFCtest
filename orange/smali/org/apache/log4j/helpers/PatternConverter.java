public abstract class org.apache.log4j.helpers.PatternConverter {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.String d;
	 /* # instance fields */
	 public Integer a;
	 public Integer b;
	 public Boolean c;
	 public org.apache.log4j.helpers.PatternConverter next;
	 /* # direct methods */
	 public static org.apache.log4j.helpers.PatternConverter ( ) {
		 /* .locals 6 */
		 final String v0 = " "; // const-string v0, " "
		 final String v1 = " "; // const-string v1, " "
		 final String v2 = " "; // const-string v2, " "
		 final String v3 = " "; // const-string v3, " "
		 final String v4 = " "; // const-string v4, " "
		 final String v5 = " "; // const-string v5, " "
		 /* .line 1 */
		 /* filled-new-array/range {v0 ..v5}, [Ljava/lang/String; */
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.PatternConverter ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/PatternConverter;->a:I */
		 /* const v0, 0x7fffffff */
		 /* .line 3 */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/PatternConverter;->b:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/helpers/PatternConverter;->c:Z */
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.PatternConverter ( ) {
		 /* .locals 1 */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 6 */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/PatternConverter;->a:I */
		 /* const v0, 0x7fffffff */
		 /* .line 7 */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/PatternConverter;->b:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 8 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/helpers/PatternConverter;->c:Z */
		 /* .line 9 */
		 /* iget v0, p1, Lorg/apache/log4j/helpers/FormattingInfo;->a:I */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/PatternConverter;->a:I */
		 /* .line 10 */
		 /* iget v0, p1, Lorg/apache/log4j/helpers/FormattingInfo;->b:I */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/PatternConverter;->b:I */
		 /* .line 11 */
		 /* iget-boolean p1, p1, Lorg/apache/log4j/helpers/FormattingInfo;->c:Z */
		 /* iput-boolean p1, p0, Lorg/apache/log4j/helpers/PatternConverter;->c:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract java.lang.String a ( org.apache.log4j.spi.LoggingEvent p0 ) {
	 } // .end method
	 public void format ( java.lang.StringBuffer p0, org.apache.log4j.spi.LoggingEvent p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( org.apache.log4j.helpers.PatternConverter ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/log4j/helpers/PatternConverter;->a(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
		 /* if-nez p2, :cond_1 */
		 /* .line 2 */
		 /* iget p2, p0, Lorg/apache/log4j/helpers/PatternConverter;->a:I */
		 /* if-lez p2, :cond_0 */
		 /* .line 3 */
		 (( org.apache.log4j.helpers.PatternConverter ) p0 ).spacePad ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/helpers/PatternConverter;->spacePad(Ljava/lang/StringBuffer;I)V
	 } // :cond_0
	 return;
	 /* .line 4 */
} // :cond_1
v0 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* .line 5 */
/* iget v1, p0, Lorg/apache/log4j/helpers/PatternConverter;->b:I */
/* if-le v0, v1, :cond_2 */
/* sub-int/2addr v0, v1 */
/* .line 6 */
(( java.lang.String ) p2 ).substring ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 7 */
} // :cond_2
/* iget v1, p0, Lorg/apache/log4j/helpers/PatternConverter;->a:I */
/* if-ge v0, v1, :cond_4 */
/* .line 8 */
/* iget-boolean v2, p0, Lorg/apache/log4j/helpers/PatternConverter;->c:Z */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 9 */
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 10 */
/* iget p2, p0, Lorg/apache/log4j/helpers/PatternConverter;->a:I */
/* sub-int/2addr p2, v0 */
(( org.apache.log4j.helpers.PatternConverter ) p0 ).spacePad ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/helpers/PatternConverter;->spacePad(Ljava/lang/StringBuffer;I)V
} // :cond_3
/* sub-int/2addr v1, v0 */
/* .line 11 */
(( org.apache.log4j.helpers.PatternConverter ) p0 ).spacePad ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lorg/apache/log4j/helpers/PatternConverter;->spacePad(Ljava/lang/StringBuffer;I)V
/* .line 12 */
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 13 */
} // :cond_4
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :goto_0
return;
} // .end method
public void spacePad ( java.lang.StringBuffer p0, Integer p1 ) {
/* .locals 2 */
} // :goto_0
/* const/16 v0, 0x20 */
/* if-lt p2, v0, :cond_0 */
/* .line 1 */
v0 = org.apache.log4j.helpers.PatternConverter.d;
int v1 = 5; // const/4 v1, 0x5
/* aget-object v0, v0, v1 */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 p2, p2, -0x20 */
} // :cond_0
int v0 = 4; // const/4 v0, 0x4
} // :goto_1
/* if-ltz v0, :cond_2 */
int v1 = 1; // const/4 v1, 0x1
/* shl-int/2addr v1, v0 */
/* and-int/2addr v1, p2 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 2 */
v1 = org.apache.log4j.helpers.PatternConverter.d;
/* aget-object v1, v1, v0 */
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_1
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_2
return;
} // .end method
