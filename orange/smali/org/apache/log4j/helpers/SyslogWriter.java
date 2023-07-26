public class org.apache.log4j.helpers.SyslogWriter extends java.io.Writer {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.net.InetAddress b;
	 public final Integer c;
	 public java.net.DatagramSocket d;
	 /* # direct methods */
	 public org.apache.log4j.helpers.SyslogWriter ( ) {
		 /* .locals 6 */
		 final String v0 = ".All logging will FAIL."; // const-string v0, ".All logging will FAIL."
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/io/Writer;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_4
			 final String v1 = "["; // const-string v1, "["
			 /* .line 2 */
			 v2 = 			 (( java.lang.String ) p1 ).indexOf ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
			 int v3 = -1; // const/4 v3, -0x1
			 /* if-ne v2, v3, :cond_1 */
			 /* const/16 v2, 0x3a */
			 v4 = 			 (( java.lang.String ) p1 ).indexOf ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I
			 v2 = 			 (( java.lang.String ) p1 ).lastIndexOf ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->lastIndexOf(I)I
			 /* if-ne v4, v2, :cond_0 */
		 } // :cond_0
	 } // :goto_0
	 int v1 = -1; // const/4 v1, -0x1
	 /* .line 3 */
} // :cond_1
} // :goto_1
try { // :try_start_0
/* new-instance v2, Ljava/net/URL; */
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
final String v5 = "http://"; // const-string v5, "http://"
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v2, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 4 */
(( java.net.URL ) v2 ).getHost ( ); // invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;
if ( v4 != null) { // if-eqz v4, :cond_0
	 /* .line 5 */
	 (( java.net.URL ) v2 ).getHost ( ); // invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;
	 /* .line 6 */
	 v1 = 	 (( java.lang.String ) p1 ).startsWith ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 v1 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 int v4 = 1; // const/4 v4, 0x1
		 /* sub-int/2addr v1, v4 */
		 v1 = 		 (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
		 /* const/16 v5, 0x5d */
		 /* if-ne v1, v5, :cond_2 */
		 /* .line 7 */
		 v1 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* sub-int/2addr v1, v4 */
		 (( java.lang.String ) p1 ).substring ( v4, v1 ); // invoke-virtual {p1, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
		 /* .line 8 */
	 } // :cond_2
	 v1 = 	 (( java.net.URL ) v2 ).getPort ( ); // invoke-virtual {v2}, Ljava/net/URL;->getPort()I
	 /* :try_end_0 */
	 /* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 final String v2 = "Malformed URL: will attempt to interpret as InetAddress."; // const-string v2, "Malformed URL: will attempt to interpret as InetAddress."
	 /* .line 9 */
	 org.apache.log4j.helpers.LogLog .error ( v2,v1 );
} // :goto_2
/* if-ne v1, v3, :cond_3 */
/* const/16 v1, 0x202 */
/* .line 10 */
} // :cond_3
/* iput v1, p0, Lorg/apache/log4j/helpers/SyslogWriter;->c:I */
/* .line 11 */
try { // :try_start_1
java.net.InetAddress .getByName ( p1 );
this.b = v1;
/* :try_end_1 */
/* .catch Ljava/net/UnknownHostException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v1 */
/* .line 12 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Could not find "; // const-string v3, "Could not find "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v2,v1 );
/* .line 13 */
} // :goto_3
try { // :try_start_2
/* new-instance v1, Ljava/net/DatagramSocket; */
/* invoke-direct {v1}, Ljava/net/DatagramSocket;-><init>()V */
this.d = v1;
/* :try_end_2 */
/* .catch Ljava/net/SocketException; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
/* move-exception v1 */
/* .line 14 */
(( java.net.SocketException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/net/SocketException;->printStackTrace()V
/* .line 15 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Could not instantiate DatagramSocket to "; // const-string v3, "Could not instantiate DatagramSocket to "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p1,v1 );
} // :goto_4
return;
/* .line 16 */
} // :cond_4
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "syslogHost"; // const-string v0, "syslogHost"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( java.net.DatagramSocket ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V
} // :cond_0
return;
} // .end method
public void flush ( ) {
/* .locals 0 */
return;
} // .end method
public void write ( java.lang.String p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
(( java.lang.String ) p1 ).getBytes ( ); // invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
/* .line 4 */
/* array-length v0, p1 */
/* const/16 v1, 0x400 */
/* if-lt v0, v1, :cond_0 */
/* const/16 v0, 0x400 */
/* .line 5 */
} // :cond_0
/* new-instance v1, Ljava/net/DatagramPacket; */
v2 = this.b;
/* iget v3, p0, Lorg/apache/log4j/helpers/SyslogWriter;->c:I */
/* invoke-direct {v1, p1, v0, v2, v3}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V */
/* .line 6 */
p1 = this.d;
(( java.net.DatagramSocket ) p1 ).send ( v1 ); // invoke-virtual {p1, v1}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
} // :cond_1
return;
} // .end method
public void write ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V */
(( org.apache.log4j.helpers.SyslogWriter ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/helpers/SyslogWriter;->write(Ljava/lang/String;)V
return;
} // .end method
