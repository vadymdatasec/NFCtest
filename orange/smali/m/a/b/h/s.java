public class m.a.b.h.s extends org.xml.sax.helpers.DefaultHandler {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final m.a.b.h.r a;
	 public Integer b;
	 public Long c;
	 public org.apache.log4j.Level d;
	 public java.lang.String e;
	 public java.lang.String f;
	 public java.lang.String g;
	 public java.lang.String h;
	 public java.lang.String i;
	 public java.lang.String j;
	 public final java.lang.StringBuffer k;
	 /* # direct methods */
	 public m.a.b.h.s ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 this.k = v0;
		 /* .line 3 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 12 */
		 /* .line 1 */
		 v0 = this.a;
		 /* new-instance v11, Lm/a/b/h/j; */
		 /* iget-wide v2, p0, Lm/a/b/h/s;->c:J */
		 v4 = this.d;
		 v5 = this.e;
		 v6 = this.f;
		 v7 = this.g;
		 v8 = this.h;
		 v9 = this.i;
		 v10 = this.j;
		 /* move-object v1, v11 */
		 /* invoke-direct/range {v1 ..v10}, Lm/a/b/h/j;-><init>(JLorg/apache/log4j/Priority;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
		 (( m.a.b.h.r ) v0 ).a ( v11 ); // invoke-virtual {v0, v11}, Lm/a/b/h/r;->a(Lm/a/b/h/j;)V
		 /* .line 2 */
		 /* iget v0, p0, Lm/a/b/h/s;->b:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lm/a/b/h/s;->b:I */
		 return;
	 } // .end method
	 public final void b ( ) {
		 /* .locals 2 */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 1 */
		 /* iput-wide v0, p0, Lm/a/b/h/s;->c:J */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.d = v0;
		 /* .line 3 */
		 this.e = v0;
		 /* .line 4 */
		 this.f = v0;
		 /* .line 5 */
		 this.g = v0;
		 /* .line 6 */
		 this.h = v0;
		 /* .line 7 */
		 this.i = v0;
		 /* .line 8 */
		 this.j = v0;
		 return;
	 } // .end method
	 public void characters ( Object[] p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.k;
		 java.lang.String .valueOf ( p1,p2,p3 );
		 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 return;
	 } // .end method
	 public void endElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 final String p1 = "log4j:event"; // const-string p1, "log4j:event"
		 /* .line 1 */
		 p1 = 		 (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 (( m.a.b.h.s ) p0 ).a ( ); // invoke-virtual {p0}, Lm/a/b/h/s;->a()V
			 /* .line 3 */
			 (( m.a.b.h.s ) p0 ).b ( ); // invoke-virtual {p0}, Lm/a/b/h/s;->b()V
		 } // :cond_0
		 final String p1 = "log4j:NDC"; // const-string p1, "log4j:NDC"
		 /* .line 4 */
		 p1 = 		 (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 5 */
			 p1 = this.k;
			 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 this.f = p1;
		 } // :cond_1
		 final String p1 = "log4j:message"; // const-string p1, "log4j:message"
		 /* .line 6 */
		 p1 = 		 (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 7 */
			 p1 = this.k;
			 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 this.h = p1;
		 } // :cond_2
		 final String p1 = "log4j:throwable"; // const-string p1, "log4j:throwable"
		 /* .line 8 */
		 p1 = 		 (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_3
			 /* .line 9 */
			 /* new-instance p1, Ljava/util/StringTokenizer; */
			 p2 = this.k;
			 (( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 final String p3 = "\n\t"; // const-string p3, "\n\t"
			 /* invoke-direct {p1, p2, p3}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
			 /* .line 10 */
			 p2 = 			 (( java.util.StringTokenizer ) p1 ).countTokens ( ); // invoke-virtual {p1}, Ljava/util/StringTokenizer;->countTokens()I
			 /* new-array p2, p2, [Ljava/lang/String; */
			 this.i = p2;
			 /* .line 11 */
			 /* array-length p3, p2 */
			 /* if-lez p3, :cond_3 */
			 int p3 = 0; // const/4 p3, 0x0
			 /* .line 12 */
			 (( java.util.StringTokenizer ) p1 ).nextToken ( ); // invoke-virtual {p1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
			 /* aput-object v0, p2, p3 */
			 int p2 = 1; // const/4 p2, 0x1
			 /* .line 13 */
		 } // :goto_0
		 p3 = this.i;
		 /* array-length v0, p3 */
		 /* if-ge p2, v0, :cond_3 */
		 /* .line 14 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v1 = "\t"; // const-string v1, "\t"
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.util.StringTokenizer ) p1 ).nextToken ( ); // invoke-virtual {p1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 /* aput-object v0, p3, p2 */
		 /* add-int/lit8 p2, p2, 0x1 */
	 } // :cond_3
} // :goto_1
return;
} // .end method
public void startDocument ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Lm/a/b/h/s;->b:I */
return;
} // .end method
public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
/* .locals 0 */
/* .line 1 */
p1 = this.k;
int p2 = 0; // const/4 p2, 0x0
(( java.lang.StringBuffer ) p1 ).setLength ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->setLength(I)V
final String p1 = "log4j:event"; // const-string p1, "log4j:event"
/* .line 2 */
p1 = (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "thread"; // const-string p1, "thread"
/* .line 3 */
this.g = p1;
final String p1 = "timestamp"; // const-string p1, "timestamp"
/* .line 4 */
java.lang.Long .parseLong ( p1 );
/* move-result-wide p1 */
/* iput-wide p1, p0, Lm/a/b/h/s;->c:J */
final String p1 = "logger"; // const-string p1, "logger"
/* .line 5 */
this.e = p1;
final String p1 = "level"; // const-string p1, "level"
/* .line 6 */
org.apache.log4j.Level .toLevel ( p1 );
this.d = p1;
} // :cond_0
final String p1 = "log4j:locationInfo"; // const-string p1, "log4j:locationInfo"
/* .line 7 */
p1 = (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 8 */
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
final String p2 = "class"; // const-string p2, "class"
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "."; // const-string p2, "."
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "method"; // const-string p2, "method"
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "("; // const-string p2, "("
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "file"; // const-string p2, "file"
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = ":"; // const-string p2, ":"
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "line"; // const-string p2, "line"
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = ")"; // const-string p2, ")"
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
this.j = p1;
} // :cond_1
} // :goto_0
return;
} // .end method
