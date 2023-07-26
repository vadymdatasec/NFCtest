public class org.apache.log4j.helpers.LogLog {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String CONFIG_DEBUG_KEY;
	 public static final java.lang.String DEBUG_KEY;
	 public static Boolean a;
	 public static Boolean b;
	 /* # direct methods */
	 public static org.apache.log4j.helpers.LogLog ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 final String v1 = "log4j.debug"; // const-string v1, "log4j.debug"
		 /* .line 1 */
		 org.apache.log4j.helpers.OptionConverter .getSystemProperty ( v1,v0 );
		 /* if-nez v1, :cond_0 */
		 final String v1 = "log4j.configDebug"; // const-string v1, "log4j.configDebug"
		 /* .line 2 */
		 org.apache.log4j.helpers.OptionConverter .getSystemProperty ( v1,v0 );
	 } // :cond_0
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 3 */
		 v0 = 		 org.apache.log4j.helpers.OptionConverter .toBoolean ( v1,v0 );
		 org.apache.log4j.helpers.LogLog.a = (v0!= 0);
	 } // :cond_1
	 return;
} // .end method
public org.apache.log4j.helpers.LogLog ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static void debug ( java.lang.String p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* sget-boolean v0, Lorg/apache/log4j/helpers/LogLog;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* sget-boolean v0, Lorg/apache/log4j/helpers/LogLog;->b:Z */
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 v0 = java.lang.System.out;
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "log4j: "; // const-string v2, "log4j: "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v0 ).println ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 } // :cond_0
	 return;
} // .end method
public static void debug ( java.lang.String p0, java.lang.Throwable p1 ) {
	 /* .locals 3 */
	 /* .line 3 */
	 /* sget-boolean v0, Lorg/apache/log4j/helpers/LogLog;->a:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* sget-boolean v0, Lorg/apache/log4j/helpers/LogLog;->b:Z */
		 /* if-nez v0, :cond_0 */
		 /* .line 4 */
		 v0 = java.lang.System.out;
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "log4j: "; // const-string v2, "log4j: "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v0 ).println ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 5 */
			 p0 = java.lang.System.out;
			 (( java.lang.Throwable ) p1 ).printStackTrace ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public static void error ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* sget-boolean v0, Lorg/apache/log4j/helpers/LogLog;->b:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 return;
			 /* .line 2 */
		 } // :cond_0
		 v0 = java.lang.System.err;
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "log4j:ERROR "; // const-string v2, "log4j:ERROR "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v0 ).println ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 return;
	 } // .end method
	 public static void error ( java.lang.String p0, java.lang.Throwable p1 ) {
		 /* .locals 3 */
		 /* .line 3 */
		 /* sget-boolean v0, Lorg/apache/log4j/helpers/LogLog;->b:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 return;
			 /* .line 4 */
		 } // :cond_0
		 v0 = java.lang.System.err;
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "log4j:ERROR "; // const-string v2, "log4j:ERROR "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v0 ).println ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 5 */
			 (( java.lang.Throwable ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
		 } // :cond_1
		 return;
	 } // .end method
	 public static void setInternalDebugging ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 org.apache.log4j.helpers.LogLog.a = (p0!= 0);
		 return;
	 } // .end method
	 public static void setQuietMode ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 org.apache.log4j.helpers.LogLog.b = (p0!= 0);
		 return;
	 } // .end method
	 public static void warn ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* sget-boolean v0, Lorg/apache/log4j/helpers/LogLog;->b:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 return;
			 /* .line 2 */
		 } // :cond_0
		 v0 = java.lang.System.err;
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "log4j:WARN "; // const-string v2, "log4j:WARN "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v0 ).println ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 return;
	 } // .end method
	 public static void warn ( java.lang.String p0, java.lang.Throwable p1 ) {
		 /* .locals 3 */
		 /* .line 3 */
		 /* sget-boolean v0, Lorg/apache/log4j/helpers/LogLog;->b:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 return;
			 /* .line 4 */
		 } // :cond_0
		 v0 = java.lang.System.err;
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "log4j:WARN "; // const-string v2, "log4j:WARN "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v0 ).println ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 5 */
			 (( java.lang.Throwable ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
		 } // :cond_1
		 return;
	 } // .end method
