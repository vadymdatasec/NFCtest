public abstract class e.f.a.d.a.b.v1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.f.a.d.a.b.d a;
	 /* # direct methods */
	 public static Long a ( Object[] p0, Integer p1 ) {
		 /* .locals 2 */
		 v0 = 		 e.f.a.d.a.b.v1 .b ( p0,p1 );
		 /* add-int/lit8 p1, p1, 0x2 */
		 p0 = 		 e.f.a.d.a.b.v1 .b ( p0,p1 );
		 /* shl-int/lit8 p0, p0, 0x10 */
		 /* or-int/2addr p0, v0 */
		 /* int-to-long p0, p0 */
		 /* const-wide v0, 0xffffffffL */
		 /* and-long/2addr p0, v0 */
		 /* return-wide p0 */
	 } // .end method
	 public static synchronized e.f.a.d.a.b.d a ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* const-class v0, Le/f/a/d/a/b/v1; */
		 /* monitor-enter v0 */
		 try { // :try_start_0
			 v1 = e.f.a.d.a.b.v1.a;
			 /* if-nez v1, :cond_0 */
			 /* new-instance v1, Le/f/a/d/a/b/o0; */
			 int v2 = 0; // const/4 v2, 0x0
			 /* invoke-direct {v1, v2}, Le/f/a/d/a/b/o0;-><init>([B)V */
			 /* new-instance v2, Le/f/a/d/a/b/a3; */
			 e.f.a.d.a.g.a .a ( p0 );
			 /* invoke-direct {v2, p0}, Le/f/a/d/a/b/a3;-><init>(Landroid/content/Context;)V */
			 (( e.f.a.d.a.b.o0 ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/a/d/a/b/o0;->a(Le/f/a/d/a/b/a3;)V
			 (( e.f.a.d.a.b.o0 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/a/d/a/b/o0;->a()Le/f/a/d/a/b/d;
		 } // :cond_0
		 p0 = e.f.a.d.a.b.v1.a;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit v0 */
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* monitor-exit v0 */
		 /* throw p0 */
	 } // .end method
	 public static java.lang.String a ( java.util.List p0 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Ljava/io/File;", */
		 /* ">;)", */
		 /* "Ljava/lang/String;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/security/NoSuchAlgorithmException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
final String v0 = "SHA256"; // const-string v0, "SHA256"
java.security.MessageDigest .getInstance ( v0 );
/* const/16 v1, 0x2000 */
/* new-array v1, v1, [B */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Ljava/io/File; */
/* new-instance v3, Ljava/io/FileInputStream; */
/* invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
} // :cond_0
try { // :try_start_0
v2 = (( java.io.InputStream ) v3 ).read ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/InputStream;->read([B)I
/* if-lez v2, :cond_1 */
int v4 = 0; // const/4 v4, 0x0
(( java.security.MessageDigest ) v0 ).update ( v1, v4, v2 ); // invoke-virtual {v0, v1, v4, v2}, Ljava/security/MessageDigest;->update([BII)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_1
int v4 = -1; // const/4 v4, -0x1
/* if-ne v2, v4, :cond_0 */
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :catchall_0 */
/* move-exception p0 */
try { // :try_start_1
(( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
e.f.a.d.a.e.w .a ( p0,v0 );
} // :goto_1
/* throw p0 */
} // :cond_2
(( java.security.MessageDigest ) v0 ).digest ( ); // invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
/* const/16 v0, 0xb */
android.util.Base64 .encodeToString ( p0,v0 );
} // .end method
public static Boolean a ( Integer p0 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* if-eq p0, v0, :cond_1 */
int v1 = 7; // const/4 v1, 0x7
/* if-eq p0, v1, :cond_1 */
int v1 = 2; // const/4 v1, 0x2
/* if-ne p0, v1, :cond_0 */
} // :cond_0
int v1 = 3; // const/4 v1, 0x3
/* if-eq p0, v1, :cond_1 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
} // .end method
public static Boolean a ( Integer p0, Integer p1 ) {
/* .locals 4 */
int v0 = 5; // const/4 v0, 0x5
int v1 = 1; // const/4 v1, 0x1
/* if-ne p0, v0, :cond_1 */
/* if-ne p1, v0, :cond_0 */
int p0 = 5; // const/4 p0, 0x5
} // :cond_0
} // :cond_1
} // :goto_0
int v2 = 6; // const/4 v2, 0x6
/* if-ne p0, v2, :cond_3 */
/* if-eq p1, v2, :cond_3 */
/* if-ne p1, v0, :cond_2 */
} // :cond_2
} // :cond_3
} // :goto_1
int v0 = 4; // const/4 v0, 0x4
/* if-ne p0, v0, :cond_5 */
/* if-ne p1, v0, :cond_4 */
} // :cond_4
} // :cond_5
} // :goto_2
int v0 = 3; // const/4 v0, 0x3
/* const/16 v2, 0x8 */
int v3 = 2; // const/4 v3, 0x2
/* if-ne p0, v0, :cond_7 */
/* if-eq p1, v3, :cond_6 */
int v0 = 7; // const/4 v0, 0x7
/* if-eq p1, v0, :cond_6 */
/* if-eq p1, v1, :cond_6 */
/* if-eq p1, v2, :cond_6 */
} // :cond_6
} // :cond_7
} // :goto_3
/* if-ne p0, v3, :cond_9 */
/* if-eq p1, v1, :cond_8 */
/* if-ne p1, v2, :cond_9 */
} // :cond_8
} // :cond_9
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Integer b ( Object[] p0, Integer p1 ) {
/* .locals 1 */
/* aget-byte v0, p0, p1 */
/* and-int/lit16 v0, v0, 0xff */
/* add-int/lit8 p1, p1, 0x1 */
/* aget-byte p0, p0, p1 */
/* and-int/lit16 p0, p0, 0xff */
/* shl-int/lit8 p0, p0, 0x8 */
/* or-int/2addr p0, v0 */
} // .end method
public static Boolean b ( Integer p0 ) {
/* .locals 1 */
int v0 = 5; // const/4 v0, 0x5
/* if-eq p0, v0, :cond_1 */
int v0 = 6; // const/4 v0, 0x6
/* if-eq p0, v0, :cond_1 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p0, v0, :cond_0 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static Boolean c ( Integer p0 ) {
/* .locals 1 */
int v0 = 2; // const/4 v0, 0x2
/* if-eq p0, v0, :cond_1 */
int v0 = 7; // const/4 v0, 0x7
/* if-eq p0, v0, :cond_1 */
int v0 = 3; // const/4 v0, 0x3
/* if-ne p0, v0, :cond_0 */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // .end method
