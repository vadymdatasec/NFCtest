public abstract class e.f.a.b.c.p.i {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.String a;
	 public static Integer b;
	 /* # direct methods */
	 public static e.f.a.b.c.p.i ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public static java.io.BufferedReader a ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 12 */
	 android.os.StrictMode .allowThreadDiskReads ( );
	 /* .line 13 */
	 try { // :try_start_0
		 /* new-instance v1, Ljava/io/BufferedReader; */
		 /* new-instance v2, Ljava/io/FileReader; */
		 /* invoke-direct {v2, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V */
		 /* invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 14 */
		 android.os.StrictMode .setThreadPolicy ( v0 );
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* .line 15 */
		 android.os.StrictMode .setThreadPolicy ( v0 );
		 /* throw p0 */
	 } // .end method
	 public static java.lang.String a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.a.b.c.p.i.a;
		 /* if-nez v0, :cond_1 */
		 /* .line 2 */
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
		 v0 = 		 android.os.Process .myPid ( );
		 /* .line 4 */
	 } // :cond_0
	 /* .line 5 */
	 e.f.a.b.c.p.i .a ( v0 );
	 /* .line 6 */
} // :cond_1
v0 = e.f.a.b.c.p.i.a;
} // .end method
public static java.lang.String a ( Integer p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* if-gtz p0, :cond_0 */
} // :cond_0
/* const/16 v1, 0x19 */
/* .line 7 */
try { // :try_start_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "/proc/"; // const-string v1, "/proc/"
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p0 = "/cmdline"; // const-string p0, "/cmdline"
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.f.a.b.c.p.i .a ( p0 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 8 */
try { // :try_start_1
	 (( java.io.BufferedReader ) p0 ).readLine ( ); // invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
	 (( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
	 /* :try_end_1 */
	 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* .line 9 */
	 e.f.a.b.c.p.g .a ( p0 );
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* :catchall_1 */
	 /* move-exception p0 */
	 /* move-object v3, v0 */
	 /* move-object v0, p0 */
	 /* move-object p0, v3 */
	 /* .line 10 */
} // :goto_0
e.f.a.b.c.p.g .a ( p0 );
/* throw v0 */
/* :catch_0 */
/* move-object p0, v0 */
/* .line 11 */
/* :catch_1 */
e.f.a.b.c.p.g .a ( p0 );
} // :goto_1
} // .end method
