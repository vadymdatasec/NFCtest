public abstract class e.h.b.a.p.n {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String a;
	 /* # direct methods */
	 public static e.h.b.a.p.n ( ) {
		 /* .locals 9 */
		 final String v0 = "/system/app/Superuser.apk"; // const-string v0, "/system/app/Superuser.apk"
		 final String v1 = "/sbin/su"; // const-string v1, "/sbin/su"
		 final String v2 = "/system/bin/su"; // const-string v2, "/system/bin/su"
		 final String v3 = "/system/xbin/su"; // const-string v3, "/system/xbin/su"
		 final String v4 = "/data/local/xbin/su"; // const-string v4, "/data/local/xbin/su"
		 final String v5 = "/data/local/bin/su"; // const-string v5, "/data/local/bin/su"
		 final String v6 = "/system/sd/xbin/su"; // const-string v6, "/system/sd/xbin/su"
		 final String v7 = "/system/bin/failsafe/su"; // const-string v7, "/system/bin/failsafe/su"
		 final String v8 = "/data/local/su"; // const-string v8, "/data/local/su"
		 /* .line 1 */
		 /* filled-new-array/range {v0 ..v8}, [Ljava/lang/String; */
		 return;
	 } // .end method
	 public static Boolean a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 e.h.b.a.p.n .b ( );
		 /* if-nez v0, :cond_1 */
		 v0 = e.h.b.a.p.n.a;
		 v0 = 		 e.h.b.a.p.n .a ( v0 );
		 /* if-nez v0, :cond_1 */
		 final String v0 = "su"; // const-string v0, "su"
		 v0 = 		 e.h.b.a.p.n .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public static Boolean a ( java.lang.String p0 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
try { // :try_start_0
java.lang.Runtime .getRuntime ( );
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Ljava/lang/String; */
final String v4 = "/system/xbin/which"; // const-string v4, "/system/xbin/which"
/* aput-object v4, v3, v0 */
int v4 = 1; // const/4 v4, 0x1
/* aput-object p0, v3, v4 */
(( java.lang.Runtime ) v2 ).exec ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Runtime;->exec([Ljava/lang/String;)Ljava/lang/Process;
/* .line 5 */
(( java.lang.Process ) v1 ).getInputStream ( ); // invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
/* .line 6 */
try { // :try_start_1
	 v2 = 	 (( java.io.InputStream ) p0 ).read ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->read()I
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 int v3 = -1; // const/4 v3, -0x1
	 /* if-eq v2, v3, :cond_0 */
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 7 */
try { // :try_start_2
	 (( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
	 /* :try_end_2 */
	 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
} // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 8 */
	 (( java.lang.Process ) v1 ).destroy ( ); // invoke-virtual {v1}, Ljava/lang/Process;->destroy()V
} // :cond_2
/* :catchall_0 */
/* move-exception v2 */
if ( p0 != null) { // if-eqz p0, :cond_3
	 /* .line 9 */
	 try { // :try_start_3
		 (( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
		 /* :try_end_3 */
		 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
		 /* :catchall_1 */
		 /* move-exception p0 */
		 try { // :try_start_4
			 (( java.lang.Throwable ) v2 ).addSuppressed ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
		 } // :cond_3
	 } // :goto_1
	 /* throw v2 */
	 /* :try_end_4 */
	 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
	 /* .catchall {:try_start_4 ..:try_end_4} :catchall_2 */
	 /* :catchall_2 */
	 /* move-exception p0 */
	 if ( v1 != null) { // if-eqz v1, :cond_4
		 /* .line 10 */
		 (( java.lang.Process ) v1 ).destroy ( ); // invoke-virtual {v1}, Ljava/lang/Process;->destroy()V
		 /* .line 11 */
	 } // :cond_4
	 /* throw p0 */
	 /* :catch_0 */
	 /* nop */
	 if ( v1 != null) { // if-eqz v1, :cond_5
		 /* .line 12 */
		 (( java.lang.Process ) v1 ).destroy ( ); // invoke-virtual {v1}, Ljava/lang/Process;->destroy()V
	 } // :cond_5
} // .end method
public static Boolean a ( java.lang.String[] p0 ) {
	 /* .locals 5 */
	 /* .line 2 */
	 /* array-length v0, p0 */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_1 */
/* aget-object v3, p0, v2 */
/* .line 3 */
/* new-instance v4, Ljava/io/File; */
/* invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
v3 = (( java.io.File ) v4 ).exists ( ); // invoke-virtual {v4}, Ljava/io/File;->exists()Z
if ( v3 != null) { // if-eqz v3, :cond_0
	 int p0 = 1; // const/4 p0, 0x1
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public static Boolean b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = android.os.Build.TAGS;
if ( v0 != null) { // if-eqz v0, :cond_0
final String v1 = "test-keys"; // const-string v1, "test-keys"
/* .line 2 */
v0 = (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
