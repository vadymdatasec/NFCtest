public abstract class e.a.a.c0.q {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.a.a.c0.p a ( Object p0, java.io.IOException p1, Long p2, Object p3, Object[] p4 ) {
		 /* .locals 9 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Le/a/a/p<", */
		 /* "*>;", */
		 /* "Ljava/io/IOException;", */
		 /* "J", */
		 /* "Le/a/a/c0/k;", */
		 /* "[B)", */
		 /* "Le/a/a/c0/p;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/android/volley/VolleyError; */
	 /* } */
} // .end annotation
/* .line 27 */
/* instance-of v0, p1, Ljava/net/SocketTimeoutException; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 28 */
	 /* new-instance p0, Le/a/a/c0/p; */
	 /* new-instance p1, Lcom/android/volley/TimeoutError; */
	 /* invoke-direct {p1}, Lcom/android/volley/TimeoutError;-><init>()V */
	 final String p2 = "socket"; // const-string p2, "socket"
	 /* invoke-direct {p0, p2, p1, v1}, Le/a/a/c0/p;-><init>(Ljava/lang/String;Lcom/android/volley/VolleyError;Le/a/a/c0/o;)V */
	 /* .line 29 */
} // :cond_0
/* instance-of v0, p1, Ljava/net/MalformedURLException; */
/* if-nez v0, :cond_9 */
if ( p4 != null) { // if-eqz p4, :cond_7
	 /* .line 30 */
	 p1 = 	 (( e.a.a.c0.k ) p4 ).d ( ); // invoke-virtual {p4}, Le/a/a/c0/k;->d()I
	 /* .line 31 */
	 (( e.a.a.p ) p0 ).p ( ); // invoke-virtual {p0}, Le/a/a/p;->p()Ljava/lang/String;
	 if ( p5 != null) { // if-eqz p5, :cond_6
		 /* .line 32 */
		 (( e.a.a.c0.k ) p4 ).c ( ); // invoke-virtual {p4}, Le/a/a/c0/k;->c()Ljava/util/List;
		 /* .line 33 */
		 /* new-instance p4, Le/a/a/l; */
		 int v5 = 0; // const/4 v5, 0x0
		 /* .line 34 */
		 android.os.SystemClock .elapsedRealtime ( );
		 /* move-result-wide v2 */
		 /* sub-long v6, v2, p2 */
		 /* move-object v2, p4 */
		 /* move v3, p1 */
		 /* move-object v4, p5 */
		 /* invoke-direct/range {v2 ..v8}, Le/a/a/l;-><init>(I[BZJLjava/util/List;)V */
		 /* const/16 p2, 0x191 */
		 /* if-eq p1, p2, :cond_5 */
		 /* const/16 p2, 0x193 */
		 /* if-ne p1, p2, :cond_1 */
	 } // :cond_1
	 /* const/16 p2, 0x190 */
	 /* if-lt p1, p2, :cond_3 */
	 /* const/16 p2, 0x1f3 */
	 /* if-le p1, p2, :cond_2 */
	 /* .line 35 */
} // :cond_2
/* new-instance p0, Lcom/android/volley/ClientError; */
/* invoke-direct {p0, p4}, Lcom/android/volley/ClientError;-><init>(Le/a/a/l;)V */
/* throw p0 */
} // :cond_3
} // :goto_0
/* const/16 p2, 0x1f4 */
/* if-lt p1, p2, :cond_4 */
/* const/16 p2, 0x257 */
/* if-gt p1, p2, :cond_4 */
/* .line 36 */
p0 = (( e.a.a.p ) p0 ).w ( ); // invoke-virtual {p0}, Le/a/a/p;->w()Z
if ( p0 != null) { // if-eqz p0, :cond_4
/* .line 37 */
/* new-instance p0, Le/a/a/c0/p; */
/* new-instance p1, Lcom/android/volley/ServerError; */
/* invoke-direct {p1, p4}, Lcom/android/volley/ServerError;-><init>(Le/a/a/l;)V */
final String p2 = "server"; // const-string p2, "server"
/* invoke-direct {p0, p2, p1, v1}, Le/a/a/c0/p;-><init>(Ljava/lang/String;Lcom/android/volley/VolleyError;Le/a/a/c0/o;)V */
/* .line 38 */
} // :cond_4
/* new-instance p0, Lcom/android/volley/ServerError; */
/* invoke-direct {p0, p4}, Lcom/android/volley/ServerError;-><init>(Le/a/a/l;)V */
/* throw p0 */
/* .line 39 */
} // :cond_5
} // :goto_1
/* new-instance p0, Le/a/a/c0/p; */
/* new-instance p1, Lcom/android/volley/AuthFailureError; */
/* invoke-direct {p1, p4}, Lcom/android/volley/AuthFailureError;-><init>(Le/a/a/l;)V */
final String p2 = "auth"; // const-string p2, "auth"
/* invoke-direct {p0, p2, p1, v1}, Le/a/a/c0/p;-><init>(Ljava/lang/String;Lcom/android/volley/VolleyError;Le/a/a/c0/o;)V */
/* .line 40 */
} // :cond_6
/* new-instance p0, Le/a/a/c0/p; */
/* new-instance p1, Lcom/android/volley/NetworkError; */
/* invoke-direct {p1}, Lcom/android/volley/NetworkError;-><init>()V */
final String p2 = "network"; // const-string p2, "network"
/* invoke-direct {p0, p2, p1, v1}, Le/a/a/c0/p;-><init>(Ljava/lang/String;Lcom/android/volley/VolleyError;Le/a/a/c0/o;)V */
/* .line 41 */
} // :cond_7
p0 = (( e.a.a.p ) p0 ).v ( ); // invoke-virtual {p0}, Le/a/a/p;->v()Z
if ( p0 != null) { // if-eqz p0, :cond_8
/* .line 42 */
/* new-instance p0, Le/a/a/c0/p; */
/* new-instance p1, Lcom/android/volley/NoConnectionError; */
/* invoke-direct {p1}, Lcom/android/volley/NoConnectionError;-><init>()V */
final String p2 = "connection"; // const-string p2, "connection"
/* invoke-direct {p0, p2, p1, v1}, Le/a/a/c0/p;-><init>(Ljava/lang/String;Lcom/android/volley/VolleyError;Le/a/a/c0/o;)V */
/* .line 43 */
} // :cond_8
/* new-instance p0, Lcom/android/volley/NoConnectionError; */
/* invoke-direct {p0, p1}, Lcom/android/volley/NoConnectionError;-><init>(Ljava/lang/Throwable;)V */
/* throw p0 */
/* .line 44 */
} // :cond_9
/* new-instance p2, Ljava/lang/RuntimeException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String p4 = "Bad URL "; // const-string p4, "Bad URL "
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.a.a.p ) p0 ).p ( ); // invoke-virtual {p0}, Le/a/a/p;->p()Ljava/lang/String;
(( java.lang.StringBuilder ) p3 ).append ( p0 ); // invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw p2 */
} // .end method
public static e.a.a.l a ( Object p0, Long p1, java.util.List p2 ) {
/* .locals 11 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;J", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;)", */
/* "Le/a/a/l;" */
/* } */
} // .end annotation
/* .line 4 */
(( e.a.a.p ) p0 ).c ( ); // invoke-virtual {p0}, Le/a/a/p;->c()Le/a/a/a;
/* if-nez p0, :cond_0 */
/* .line 5 */
/* new-instance p0, Le/a/a/l; */
/* const/16 v1, 0x130 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* move-object v0, p0 */
/* move-wide v4, p1 */
/* move-object v6, p3 */
/* invoke-direct/range {v0 ..v6}, Le/a/a/l;-><init>(I[BZJLjava/util/List;)V */
/* .line 6 */
} // :cond_0
e.a.a.c0.j .a ( p3,p0 );
/* .line 7 */
/* new-instance p3, Le/a/a/l; */
/* const/16 v5, 0x130 */
v6 = this.a;
int v7 = 1; // const/4 v7, 0x1
/* move-object v4, p3 */
/* move-wide v8, p1 */
/* invoke-direct/range {v4 ..v10}, Le/a/a/l;-><init>(I[BZJLjava/util/List;)V */
} // .end method
public static void a ( Long p0, Object p1, Object[] p2, Integer p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(J", */
/* "Le/a/a/p<", */
/* "*>;[BI)V" */
/* } */
} // .end annotation
/* .line 1 */
/* sget-boolean p4, Le/a/a/a0;->a:Z */
/* if-nez p4, :cond_0 */
/* const-wide/16 v0, 0xbb8 */
/* cmp-long p4, p0, v0 */
/* if-lez p4, :cond_2 */
} // :cond_0
if ( p3 != null) { // if-eqz p3, :cond_1
/* .line 2 */
/* array-length p0, p3 */
/* .line 3 */
} // :cond_1
(( e.a.a.p ) p2 ).m ( ); // invoke-virtual {p2}, Le/a/a/p;->m()Le/a/a/x;
} // :cond_2
return;
} // .end method
public static void a ( Object p0, Object p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;", */
/* "Le/a/a/c0/p;", */
/* ")V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/android/volley/VolleyError; */
/* } */
} // .end annotation
/* .line 19 */
(( e.a.a.p ) p0 ).m ( ); // invoke-virtual {p0}, Le/a/a/p;->m()Le/a/a/x;
/* .line 20 */
v1 = (( e.a.a.p ) p0 ).n ( ); // invoke-virtual {p0}, Le/a/a/p;->n()I
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
int v4 = 2; // const/4 v4, 0x2
/* .line 21 */
try { // :try_start_0
e.a.a.c0.p .a ( p1 );
/* :try_end_0 */
/* .catch Lcom/android/volley/VolleyError; {:try_start_0 ..:try_end_0} :catch_0 */
/* new-array v0, v4, [Ljava/lang/Object; */
/* .line 22 */
e.a.a.c0.p .b ( p1 );
/* aput-object p1, v0, v3 */
java.lang.Integer .valueOf ( v1 );
/* aput-object p1, v0, v2 */
final String p1 = "%s-retry [timeout=%s]"; // const-string p1, "%s-retry [timeout=%s]"
java.lang.String .format ( p1,v0 );
(( e.a.a.p ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/p;->a(Ljava/lang/String;)V
return;
/* :catch_0 */
/* move-exception v0 */
/* new-array v4, v4, [Ljava/lang/Object; */
/* .line 23 */
e.a.a.c0.p .b ( p1 );
/* aput-object p1, v4, v3 */
java.lang.Integer .valueOf ( v1 );
/* aput-object p1, v4, v2 */
final String p1 = "%s-timeout-giveup [timeout=%s]"; // const-string p1, "%s-timeout-giveup [timeout=%s]"
/* .line 24 */
java.lang.String .format ( p1,v4 );
/* .line 25 */
(( e.a.a.p ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 26 */
/* throw v0 */
} // .end method
public static a ( java.io.InputStream p0, Integer p1, Object p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 8 */
/* new-instance v0, Le/a/a/c0/r; */
/* invoke-direct {v0, p2, p1}, Le/a/a/c0/r;-><init>(Le/a/a/c0/d;I)V */
/* const/16 p1, 0x400 */
/* .line 9 */
try { // :try_start_0
(( e.a.a.c0.d ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/a/a/c0/d;->a(I)[B
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 10 */
} // :goto_0
try { // :try_start_1
v1 = (( java.io.InputStream ) p0 ).read ( p1 ); // invoke-virtual {p0, p1}, Ljava/io/InputStream;->read([B)I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
int v2 = 0; // const/4 v2, 0x0
/* .line 11 */
(( e.a.a.c0.r ) v0 ).write ( p1, v2, v1 ); // invoke-virtual {v0, p1, v2, v1}, Le/a/a/c0/r;->write([BII)V
/* .line 12 */
} // :cond_0
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 13 */
try { // :try_start_2
(( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 14 */
/* :catch_0 */
} // :cond_1
(( e.a.a.c0.d ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/a/a/c0/d;->a([B)V
/* .line 15 */
(( e.a.a.c0.r ) v0 ).close ( ); // invoke-virtual {v0}, Le/a/a/c0/r;->close()V
/* :catchall_0 */
/* move-exception v1 */
/* :catchall_1 */
/* move-exception v1 */
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 16 */
try { // :try_start_3
(( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .line 17 */
/* :catch_1 */
} // :cond_2
(( e.a.a.c0.d ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/a/a/c0/d;->a([B)V
/* .line 18 */
(( e.a.a.c0.r ) v0 ).close ( ); // invoke-virtual {v0}, Le/a/a/c0/r;->close()V
/* throw v1 */
} // .end method
