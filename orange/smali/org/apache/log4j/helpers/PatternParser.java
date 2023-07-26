public class org.apache.log4j.helpers.PatternParser {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/helpers/PatternParser$b;, */
	 /* Lorg/apache/log4j/helpers/PatternParser$c;, */
	 /* Lorg/apache/log4j/helpers/PatternParser$h;, */
	 /* Lorg/apache/log4j/helpers/PatternParser$f;, */
	 /* Lorg/apache/log4j/helpers/PatternParser$g;, */
	 /* Lorg/apache/log4j/helpers/PatternParser$d;, */
	 /* Lorg/apache/log4j/helpers/PatternParser$e;, */
	 /* Lorg/apache/log4j/helpers/PatternParser$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static java.lang.Class i; //synthetic
/* # instance fields */
public Integer a;
public java.lang.StringBuffer b;
public Integer c;
public Integer d;
public org.apache.log4j.helpers.PatternConverter e;
public org.apache.log4j.helpers.PatternConverter f;
public org.apache.log4j.helpers.FormattingInfo g;
public java.lang.String h;
/* # direct methods */
public org.apache.log4j.helpers.PatternParser ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* const/16 v1, 0x20 */
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V */
	 this.b = v0;
	 /* .line 3 */
	 /* new-instance v0, Lorg/apache/log4j/helpers/FormattingInfo; */
	 /* invoke-direct {v0}, Lorg/apache/log4j/helpers/FormattingInfo;-><init>()V */
	 this.g = v0;
	 /* .line 4 */
	 this.h = p1;
	 /* .line 5 */
	 p1 = 	 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
	 /* iput p1, p0, Lorg/apache/log4j/helpers/PatternParser;->c:I */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 6 */
	 /* iput p1, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
	 return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
	 /* .locals 1 */
	 /* .line 6 */
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
	 public java.lang.String a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* iget v0, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
		 /* iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->c:I */
		 /* if-ge v0, v1, :cond_0 */
		 v1 = this.h;
		 v0 = 		 (( java.lang.String ) v1 ).charAt ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C
		 /* const/16 v1, 0x7b */
		 /* if-ne v0, v1, :cond_0 */
		 /* .line 2 */
		 v0 = this.h;
		 /* const/16 v1, 0x7d */
		 /* iget v2, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
		 v0 = 		 (( java.lang.String ) v0 ).indexOf ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(II)I
		 /* .line 3 */
		 /* iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
		 /* if-le v0, v1, :cond_0 */
		 /* .line 4 */
		 v2 = this.h;
		 /* add-int/lit8 v1, v1, 0x1 */
		 (( java.lang.String ) v2 ).substring ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* .line 5 */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public void a ( Object p0 ) {
	 /* .locals 4 */
	 /* const/16 v0, 0x43 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* if-eq p1, v0, :cond_11 */
	 /* const/16 v0, 0x46 */
	 /* if-eq p1, v0, :cond_10 */
	 /* const/16 v0, 0x58 */
	 /* if-eq p1, v0, :cond_f */
	 /* const/16 v0, 0x70 */
	 /* if-eq p1, v0, :cond_e */
	 /* const/16 v0, 0x72 */
	 /* if-eq p1, v0, :cond_d */
	 /* const/16 v0, 0x74 */
	 /* if-eq p1, v0, :cond_c */
	 /* const/16 v0, 0x78 */
	 /* if-eq p1, v0, :cond_b */
	 /* const/16 v0, 0x4c */
	 /* if-eq p1, v0, :cond_a */
	 /* const/16 v0, 0x4d */
	 /* if-eq p1, v0, :cond_9 */
	 /* const/16 v0, 0x63 */
	 /* if-eq p1, v0, :cond_8 */
	 /* const/16 v0, 0x64 */
	 /* if-eq p1, v0, :cond_2 */
	 /* const/16 v0, 0x6c */
	 /* if-eq p1, v0, :cond_1 */
	 /* const/16 v0, 0x6d */
	 /* if-eq p1, v0, :cond_0 */
	 /* .line 7 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v2 = "Unexpected char ["; // const-string v2, "Unexpected char ["
	 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
	 final String p1 = "] at position "; // const-string p1, "] at position "
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* iget p1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
	 final String p1 = " in conversion patterrn."; // const-string p1, " in conversion patterrn."
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .error ( p1 );
	 /* .line 8 */
	 /* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$e; */
	 v0 = this.b;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* invoke-direct {p1, v0}, Lorg/apache/log4j/helpers/PatternParser$e;-><init>(Ljava/lang/String;)V */
	 /* .line 9 */
	 v0 = this.b;
	 (( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
	 /* goto/16 :goto_3 */
	 /* .line 10 */
} // :cond_0
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a; */
v0 = this.g;
/* const/16 v2, 0x7d4 */
/* invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 11 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* goto/16 :goto_3 */
/* .line 12 */
} // :cond_1
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$f; */
v0 = this.g;
/* const/16 v2, 0x3e8 */
/* invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$f;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 13 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* goto/16 :goto_3 */
/* .line 14 */
} // :cond_2
(( org.apache.log4j.helpers.PatternParser ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->a()Ljava/lang/String;
final String v0 = "ISO8601"; // const-string v0, "ISO8601"
if ( p1 != null) { // if-eqz p1, :cond_3
} // :cond_3
/* move-object p1, v0 */
/* .line 15 */
} // :goto_0
v0 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 16 */
/* new-instance p1, Lorg/apache/log4j/helpers/ISO8601DateFormat; */
/* invoke-direct {p1}, Lorg/apache/log4j/helpers/ISO8601DateFormat;-><init>()V */
} // :cond_4
final String v0 = "ABSOLUTE"; // const-string v0, "ABSOLUTE"
/* .line 17 */
v0 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 18 */
/* new-instance p1, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat; */
/* invoke-direct {p1}, Lorg/apache/log4j/helpers/AbsoluteTimeDateFormat;-><init>()V */
} // :cond_5
final String v0 = "DATE"; // const-string v0, "DATE"
/* .line 19 */
v0 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 20 */
/* new-instance p1, Lorg/apache/log4j/helpers/DateTimeDateFormat; */
/* invoke-direct {p1}, Lorg/apache/log4j/helpers/DateTimeDateFormat;-><init>()V */
/* .line 21 */
} // :cond_6
try { // :try_start_0
/* new-instance v0, Ljava/text/SimpleDateFormat; */
/* invoke-direct {v0, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object p1, v0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 22 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Could not instantiate SimpleDateFormat with "; // const-string v3, "Could not instantiate SimpleDateFormat with "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p1,v0 );
/* .line 23 */
p1 = org.apache.log4j.helpers.PatternParser.i;
/* if-nez p1, :cond_7 */
final String p1 = "java.text.DateFormat"; // const-string p1, "java.text.DateFormat"
org.apache.log4j.helpers.PatternParser .a ( p1 );
} // :cond_7
int v0 = 0; // const/4 v0, 0x0
final String v2 = "org.apache.log4j.helpers.ISO8601DateFormat"; // const-string v2, "org.apache.log4j.helpers.ISO8601DateFormat"
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( v2,p1,v0 );
/* check-cast p1, Ljava/text/DateFormat; */
/* .line 24 */
} // :goto_1
/* new-instance v0, Lorg/apache/log4j/helpers/PatternParser$d; */
v2 = this.g;
/* invoke-direct {v0, v2, p1}, Lorg/apache/log4j/helpers/PatternParser$d;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;Ljava/text/DateFormat;)V */
/* .line 25 */
p1 = this.b;
(( java.lang.StringBuffer ) p1 ).setLength ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* goto/16 :goto_2 */
/* .line 26 */
} // :cond_8
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$b; */
v0 = this.g;
v2 = (( org.apache.log4j.helpers.PatternParser ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->b()I
/* invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$b;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 27 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* goto/16 :goto_3 */
/* .line 28 */
} // :cond_9
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$f; */
v0 = this.g;
/* const/16 v2, 0x3e9 */
/* invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$f;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 29 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* goto/16 :goto_3 */
/* .line 30 */
} // :cond_a
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$f; */
v0 = this.g;
/* const/16 v2, 0x3eb */
/* invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$f;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 31 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 32 */
} // :cond_b
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a; */
v0 = this.g;
/* const/16 v2, 0x7d3 */
/* invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 33 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 34 */
} // :cond_c
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a; */
v0 = this.g;
/* const/16 v2, 0x7d1 */
/* invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 35 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 36 */
} // :cond_d
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a; */
v0 = this.g;
/* const/16 v2, 0x7d0 */
/* invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 37 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 38 */
} // :cond_e
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$a; */
v0 = this.g;
/* const/16 v2, 0x7d2 */
/* invoke-direct {p1, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$a;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 39 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 40 */
} // :cond_f
(( org.apache.log4j.helpers.PatternParser ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->a()Ljava/lang/String;
/* .line 41 */
/* new-instance v0, Lorg/apache/log4j/helpers/PatternParser$g; */
v2 = this.g;
/* invoke-direct {v0, v2, p1}, Lorg/apache/log4j/helpers/PatternParser$g;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;Ljava/lang/String;)V */
/* .line 42 */
p1 = this.b;
(( java.lang.StringBuffer ) p1 ).setLength ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->setLength(I)V
} // :goto_2
/* move-object p1, v0 */
/* .line 43 */
} // :cond_10
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$f; */
v0 = this.g;
/* const/16 v2, 0x3ec */
/* invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$f;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 44 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 45 */
} // :cond_11
/* new-instance p1, Lorg/apache/log4j/helpers/PatternParser$c; */
v0 = this.g;
v2 = (( org.apache.log4j.helpers.PatternParser ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->b()I
/* invoke-direct {p1, p0, v0, v2}, Lorg/apache/log4j/helpers/PatternParser$c;-><init>(Lorg/apache/log4j/helpers/PatternParser;Lorg/apache/log4j/helpers/FormattingInfo;I)V */
/* .line 46 */
v0 = this.b;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 47 */
} // :goto_3
(( org.apache.log4j.helpers.PatternParser ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/helpers/PatternParser;->a(Lorg/apache/log4j/helpers/PatternConverter;)V
return;
} // .end method
public void a ( org.apache.log4j.helpers.PatternConverter p0 ) {
/* .locals 2 */
/* .line 48 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 49 */
(( org.apache.log4j.helpers.PatternParser ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/helpers/PatternParser;->b(Lorg/apache/log4j/helpers/PatternConverter;)V
/* .line 50 */
/* iput v1, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
/* .line 51 */
p1 = this.g;
(( org.apache.log4j.helpers.FormattingInfo ) p1 ).a ( ); // invoke-virtual {p1}, Lorg/apache/log4j/helpers/FormattingInfo;->a()V
return;
} // .end method
public Integer b ( ) {
/* .locals 5 */
/* .line 5 */
(( org.apache.log4j.helpers.PatternParser ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/helpers/PatternParser;->a()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
try { // :try_start_0
v2 = java.lang.Integer .parseInt ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_1 */
/* if-gtz v2, :cond_0 */
/* .line 7 */
try { // :try_start_1
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "Precision option ("; // const-string v4, "Precision option ("
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = ") isn\'t a positive integer."; // const-string v4, ") isn\'t a positive integer."
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v3 );
/* :try_end_1 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v2 */
/* move-object v1, v2 */
int v2 = 0; // const/4 v2, 0x0
/* .line 8 */
} // :goto_0
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "Category option \""; // const-string v4, "Category option \""
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "\" not a decimal integer."; // const-string v0, "\" not a decimal integer."
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v0,v1 );
} // :cond_0
/* move v1, v2 */
} // :cond_1
} // :goto_1
} // .end method
public final void b ( org.apache.log4j.helpers.PatternConverter p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
/* if-nez v0, :cond_0 */
/* .line 2 */
this.f = p1;
this.e = p1;
/* .line 3 */
} // :cond_0
v0 = this.f;
this.next = p1;
/* .line 4 */
this.f = p1;
} // :goto_0
return;
} // .end method
public org.apache.log4j.helpers.PatternConverter parse ( ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
/* .line 2 */
} // :goto_0
/* iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
/* iget v2, p0, Lorg/apache/log4j/helpers/PatternParser;->c:I */
/* if-ge v1, v2, :cond_11 */
/* .line 3 */
v2 = this.h;
/* add-int/lit8 v3, v1, 0x1 */
/* iput v3, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
v1 = (( java.lang.String ) v2 ).charAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C
/* .line 4 */
/* iget v2, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
int v3 = 1; // const/4 v3, 0x1
if ( v2 != null) { // if-eqz v2, :cond_b
/* const/16 v4, 0x2e */
int v5 = 4; // const/4 v5, 0x4
int v6 = 3; // const/4 v6, 0x3
/* const/16 v7, 0x39 */
/* const/16 v8, 0x30 */
/* if-eq v2, v3, :cond_7 */
int v3 = 5; // const/4 v3, 0x5
/* if-eq v2, v6, :cond_5 */
/* if-eq v2, v5, :cond_2 */
/* if-eq v2, v3, :cond_0 */
/* .line 5 */
} // :cond_0
v2 = this.b;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* if-lt v1, v8, :cond_1 */
/* if-gt v1, v7, :cond_1 */
/* .line 6 */
v2 = this.g;
/* iget v3, v2, Lorg/apache/log4j/helpers/FormattingInfo;->b:I */
/* mul-int/lit8 v3, v3, 0xa */
/* add-int/lit8 v1, v1, -0x30 */
/* add-int/2addr v3, v1 */
/* iput v3, v2, Lorg/apache/log4j/helpers/FormattingInfo;->b:I */
/* .line 7 */
} // :cond_1
(( org.apache.log4j.helpers.PatternParser ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/helpers/PatternParser;->a(C)V
/* .line 8 */
/* iput v0, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
/* .line 9 */
} // :cond_2
v2 = this.b;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* if-lt v1, v8, :cond_3 */
/* if-gt v1, v7, :cond_3 */
/* .line 10 */
v2 = this.g;
/* iget v3, v2, Lorg/apache/log4j/helpers/FormattingInfo;->a:I */
/* mul-int/lit8 v3, v3, 0xa */
/* add-int/lit8 v1, v1, -0x30 */
/* add-int/2addr v3, v1 */
/* iput v3, v2, Lorg/apache/log4j/helpers/FormattingInfo;->a:I */
} // :cond_3
/* if-ne v1, v4, :cond_4 */
/* .line 11 */
/* iput v6, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
/* .line 12 */
} // :cond_4
(( org.apache.log4j.helpers.PatternParser ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/helpers/PatternParser;->a(C)V
/* .line 13 */
} // :cond_5
v2 = this.b;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* if-lt v1, v8, :cond_6 */
/* if-gt v1, v7, :cond_6 */
/* .line 14 */
v2 = this.g;
/* add-int/lit8 v1, v1, -0x30 */
/* iput v1, v2, Lorg/apache/log4j/helpers/FormattingInfo;->b:I */
/* .line 15 */
/* iput v3, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
/* .line 16 */
} // :cond_6
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Error occured in position "; // const-string v3, "Error occured in position "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* iget v3, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String v3 = ".\n Was expecting digit, instead got char \""; // const-string v3, ".\n Was expecting digit, instead got char \""
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
final String v1 = "\"."; // const-string v1, "\"."
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v1 );
/* .line 17 */
/* iput v0, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
/* goto/16 :goto_0 */
/* .line 18 */
} // :cond_7
v2 = this.b;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* const/16 v2, 0x2d */
/* if-eq v1, v2, :cond_a */
/* if-eq v1, v4, :cond_9 */
/* if-lt v1, v8, :cond_8 */
/* if-gt v1, v7, :cond_8 */
/* .line 19 */
v2 = this.g;
/* add-int/lit8 v1, v1, -0x30 */
/* iput v1, v2, Lorg/apache/log4j/helpers/FormattingInfo;->a:I */
/* .line 20 */
/* iput v5, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
/* goto/16 :goto_0 */
/* .line 21 */
} // :cond_8
(( org.apache.log4j.helpers.PatternParser ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/helpers/PatternParser;->a(C)V
/* goto/16 :goto_0 */
/* .line 22 */
} // :cond_9
/* iput v6, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
/* goto/16 :goto_0 */
/* .line 23 */
} // :cond_a
v1 = this.g;
/* iput-boolean v3, v1, Lorg/apache/log4j/helpers/FormattingInfo;->c:Z */
/* goto/16 :goto_0 */
/* .line 24 */
} // :cond_b
/* iget v2, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
/* iget v4, p0, Lorg/apache/log4j/helpers/PatternParser;->c:I */
/* if-ne v2, v4, :cond_c */
/* .line 25 */
v2 = this.b;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* goto/16 :goto_0 */
} // :cond_c
/* const/16 v4, 0x25 */
/* if-ne v1, v4, :cond_10 */
/* .line 26 */
v5 = this.h;
v2 = (( java.lang.String ) v5 ).charAt ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C
/* if-eq v2, v4, :cond_f */
/* const/16 v4, 0x6e */
/* if-eq v2, v4, :cond_e */
/* .line 27 */
v2 = this.b;
v2 = (( java.lang.StringBuffer ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I
if ( v2 != null) { // if-eqz v2, :cond_d
/* .line 28 */
/* new-instance v2, Lorg/apache/log4j/helpers/PatternParser$e; */
v4 = this.b;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v2, v4}, Lorg/apache/log4j/helpers/PatternParser$e;-><init>(Ljava/lang/String;)V */
(( org.apache.log4j.helpers.PatternParser ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/log4j/helpers/PatternParser;->b(Lorg/apache/log4j/helpers/PatternConverter;)V
/* .line 29 */
} // :cond_d
v2 = this.b;
(( java.lang.StringBuffer ) v2 ).setLength ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 30 */
v2 = this.b;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 31 */
/* iput v3, p0, Lorg/apache/log4j/helpers/PatternParser;->a:I */
/* .line 32 */
v1 = this.g;
(( org.apache.log4j.helpers.FormattingInfo ) v1 ).a ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/FormattingInfo;->a()V
/* goto/16 :goto_0 */
/* .line 33 */
} // :cond_e
v1 = this.b;
v2 = org.apache.log4j.Layout.LINE_SEP;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 34 */
/* iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
/* add-int/2addr v1, v3 */
/* iput v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
/* goto/16 :goto_0 */
/* .line 35 */
} // :cond_f
v2 = this.b;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 36 */
/* iget v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
/* add-int/2addr v1, v3 */
/* iput v1, p0, Lorg/apache/log4j/helpers/PatternParser;->d:I */
/* goto/16 :goto_0 */
/* .line 37 */
} // :cond_10
v2 = this.b;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* goto/16 :goto_0 */
/* .line 38 */
} // :cond_11
v0 = this.b;
v0 = (( java.lang.StringBuffer ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I
if ( v0 != null) { // if-eqz v0, :cond_12
/* .line 39 */
/* new-instance v0, Lorg/apache/log4j/helpers/PatternParser$e; */
v1 = this.b;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lorg/apache/log4j/helpers/PatternParser$e;-><init>(Ljava/lang/String;)V */
(( org.apache.log4j.helpers.PatternParser ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/helpers/PatternParser;->b(Lorg/apache/log4j/helpers/PatternConverter;)V
/* .line 40 */
} // :cond_12
v0 = this.e;
} // .end method
