public class org.apache.log4j.ConsoleAppender extends org.apache.log4j.WriterAppender {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/ConsoleAppender$b;, */
	 /* Lorg/apache/log4j/ConsoleAppender$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String SYSTEM_ERR;
public static final java.lang.String SYSTEM_OUT;
/* # instance fields */
public java.lang.String k;
public Boolean l;
/* # direct methods */
public org.apache.log4j.ConsoleAppender ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/WriterAppender;-><init>()V */
	 final String v0 = "System.out"; // const-string v0, "System.out"
	 /* .line 2 */
	 this.k = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 3 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z */
	 return;
} // .end method
public org.apache.log4j.ConsoleAppender ( ) {
	 /* .locals 1 */
	 final String v0 = "System.out"; // const-string v0, "System.out"
	 /* .line 4 */
	 /* invoke-direct {p0, p1, v0}, Lorg/apache/log4j/ConsoleAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/lang/String;)V */
	 return;
} // .end method
public org.apache.log4j.ConsoleAppender ( ) {
	 /* .locals 1 */
	 /* .line 5 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/WriterAppender;-><init>()V */
	 final String v0 = "System.out"; // const-string v0, "System.out"
	 /* .line 6 */
	 this.k = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 7 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z */
	 /* .line 8 */
	 (( org.apache.log4j.AppenderSkeleton ) p0 ).setLayout ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/AppenderSkeleton;->setLayout(Lorg/apache/log4j/Layout;)V
	 /* .line 9 */
	 (( org.apache.log4j.ConsoleAppender ) p0 ).setTarget ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/log4j/ConsoleAppender;->setTarget(Ljava/lang/String;)V
	 /* .line 10 */
	 (( org.apache.log4j.ConsoleAppender ) p0 ).activateOptions ( ); // invoke-virtual {p0}, Lorg/apache/log4j/ConsoleAppender;->activateOptions()V
	 return;
} // .end method
/* # virtual methods */
public void a ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v1 = "["; // const-string v1, "["
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String p1 = "] should be System.out or System.err."; // const-string p1, "] should be System.out or System.err."
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .warn ( p1 );
	 final String p1 = "Using previously set target, System.out by default."; // const-string p1, "Using previously set target, System.out by default."
	 /* .line 2 */
	 org.apache.log4j.helpers.LogLog .warn ( p1 );
	 return;
} // .end method
public void activateOptions ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z */
	 final String v1 = "System.err"; // const-string v1, "System.err"
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 2 */
		 v0 = this.k;
		 v0 = 		 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 /* new-instance v0, Lorg/apache/log4j/ConsoleAppender$a; */
			 /* invoke-direct {v0}, Lorg/apache/log4j/ConsoleAppender$a;-><init>()V */
			 (( org.apache.log4j.WriterAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;
			 (( org.apache.log4j.WriterAppender ) p0 ).setWriter ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V
			 /* .line 4 */
		 } // :cond_0
		 /* new-instance v0, Lorg/apache/log4j/ConsoleAppender$b; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/ConsoleAppender$b;-><init>()V */
		 (( org.apache.log4j.WriterAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;
		 (( org.apache.log4j.WriterAppender ) p0 ).setWriter ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V
		 /* .line 5 */
	 } // :cond_1
	 v0 = this.k;
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 6 */
		 v0 = java.lang.System.err;
		 (( org.apache.log4j.WriterAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;
		 (( org.apache.log4j.WriterAppender ) p0 ).setWriter ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V
		 /* .line 7 */
	 } // :cond_2
	 v0 = java.lang.System.out;
	 (( org.apache.log4j.WriterAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;
	 (( org.apache.log4j.WriterAppender ) p0 ).setWriter ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V
	 /* .line 8 */
} // :goto_0
/* invoke-super {p0}, Lorg/apache/log4j/WriterAppender;->activateOptions()V */
return;
} // .end method
public final void b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 /* invoke-super {p0}, Lorg/apache/log4j/WriterAppender;->b()V */
} // :cond_0
return;
} // .end method
public final Boolean getFollow ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z */
} // .end method
public java.lang.String getTarget ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
} // .end method
public final void setFollow ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/ConsoleAppender;->l:Z */
return;
} // .end method
public void setTarget ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v1 = "System.out"; // const-string v1, "System.out"
/* .line 2 */
v2 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 3 */
	 this.k = v1;
} // :cond_0
final String v1 = "System.err"; // const-string v1, "System.err"
/* .line 4 */
v0 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 5 */
	 this.k = v1;
	 /* .line 6 */
} // :cond_1
(( org.apache.log4j.ConsoleAppender ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/ConsoleAppender;->a(Ljava/lang/String;)V
} // :goto_0
return;
} // .end method
