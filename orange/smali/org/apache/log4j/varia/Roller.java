public class org.apache.log4j.varia.Roller {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static org.apache.log4j.Logger a;
	 public static java.lang.String b;
	 public static Integer c;
	 public static java.lang.Class d; //synthetic
	 /* # direct methods */
	 public static org.apache.log4j.varia.Roller ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.varia.Roller.d;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.varia.Roller"; // const-string v0, "org.apache.log4j.varia.Roller"
		 org.apache.log4j.varia.Roller .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
	 /* .locals 1 */
	 /* .line 1 */
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
	 public static void a ( ) {
		 /* .locals 5 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* .line 5 */
		 try { // :try_start_0
			 /* new-instance v1, Ljava/net/Socket; */
			 v2 = org.apache.log4j.varia.Roller.b;
			 /* invoke-direct {v1, v2, v3}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V */
			 /* .line 6 */
			 /* new-instance v2, Ljava/io/DataOutputStream; */
			 (( java.net.Socket ) v1 ).getOutputStream ( ); // invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
			 /* invoke-direct {v2, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
			 /* .line 7 */
			 /* new-instance v3, Ljava/io/DataInputStream; */
			 (( java.net.Socket ) v1 ).getInputStream ( ); // invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;
			 /* invoke-direct {v3, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
			 final String v1 = "RollOver"; // const-string v1, "RollOver"
			 /* .line 8 */
			 (( java.io.DataOutputStream ) v2 ).writeUTF ( v1 ); // invoke-virtual {v2, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
			 /* .line 9 */
			 (( java.io.DataInputStream ) v3 ).readUTF ( ); // invoke-virtual {v3}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
			 final String v2 = "OK"; // const-string v2, "OK"
			 /* .line 10 */
			 v2 = 			 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* .line 11 */
				 v1 = org.apache.log4j.varia.Roller.a;
				 final String v2 = "Roll over signal acknowledged by remote appender."; // const-string v2, "Roll over signal acknowledged by remote appender."
				 (( org.apache.log4j.Category ) v1 ).info ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
				 /* .line 12 */
			 } // :cond_0
			 v2 = org.apache.log4j.varia.Roller.a;
			 /* new-instance v3, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v4 = "Unexpected return code "; // const-string v4, "Unexpected return code "
			 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v1 = " from remote entity."; // const-string v1, " from remote entity."
			 (( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 (( org.apache.log4j.Category ) v2 ).warn ( v1 ); // invoke-virtual {v2, v1}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;)V
			 /* .line 13 */
			 java.lang.System .exit ( v0 );
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 /* .line 14 */
			 v2 = org.apache.log4j.varia.Roller.a;
			 /* new-instance v3, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v4 = "Could not send roll signal on host "; // const-string v4, "Could not send roll signal on host "
			 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 v4 = org.apache.log4j.varia.Roller.b;
			 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v4 = " port "; // const-string v4, " port "
			 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
			 final String v4 = " ."; // const-string v4, " ."
			 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 (( org.apache.log4j.Category ) v2 ).error ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
			 /* .line 15 */
			 java.lang.System .exit ( v0 );
		 } // :goto_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 16 */
		 java.lang.System .exit ( v0 );
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* .line 3 */
		 try { // :try_start_0
			 p0 = 			 java.lang.Integer .parseInt ( p1 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 4 */
			 /* :catch_0 */
			 /* new-instance p0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {p0}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v0 = "Second argument "; // const-string v0, "Second argument "
			 (( java.lang.StringBuffer ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String p1 = " is not a valid integer."; // const-string p1, " is not a valid integer."
			 (( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.varia.Roller .b ( p0 );
		 } // :goto_0
		 return;
	 } // .end method
	 public static void b ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = java.lang.System.err;
		 (( java.io.PrintStream ) v0 ).println ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* .line 2 */
		 p0 = java.lang.System.err;
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v1 = "Usage: java "; // const-string v1, "Usage: java "
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 v1 = org.apache.log4j.varia.Roller.d;
		 /* if-nez v1, :cond_0 */
		 final String v1 = "org.apache.log4j.varia.Roller"; // const-string v1, "org.apache.log4j.varia.Roller"
		 org.apache.log4j.varia.Roller .a ( v1 );
	 } // :cond_0
	 (( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = "host_name port_number"; // const-string v1, "host_name port_number"
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 (( java.io.PrintStream ) p0 ).println ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 int p0 = 1; // const/4 p0, 0x1
	 /* .line 3 */
	 java.lang.System .exit ( p0 );
	 return;
} // .end method
public static void main ( java.lang.String[] p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 org.apache.log4j.BasicConfigurator .configure ( );
	 /* .line 2 */
	 /* array-length v0, p0 */
	 int v1 = 2; // const/4 v1, 0x2
	 /* if-ne v0, v1, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 3 */
	 /* aget-object v0, p0, v0 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* aget-object p0, p0, v1 */
	 org.apache.log4j.varia.Roller .a ( v0,p0 );
} // :cond_0
final String p0 = "Wrong number of arguments."; // const-string p0, "Wrong number of arguments."
/* .line 4 */
org.apache.log4j.varia.Roller .b ( p0 );
/* .line 5 */
} // :goto_0
org.apache.log4j.varia.Roller .a ( );
return;
} // .end method
