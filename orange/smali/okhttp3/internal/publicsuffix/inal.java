public class inal {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e;
	 public static final java.lang.String f;
	 public static final java.lang.String g;
	 public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase h;
	 /* # instance fields */
	 public final java.util.concurrent.atomic.AtomicBoolean a;
	 public final java.util.concurrent.CountDownLatch b;
	 public c;
	 public d;
	 /* # direct methods */
	 public static inal ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [B */
		 /* const/16 v1, 0x2a */
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-byte v1, v0, v2 */
		 /* .line 1 */
		 /* new-array v0, v2, [Ljava/lang/String; */
		 /* .line 2 */
		 final String v0 = "*"; // const-string v0, "*"
		 /* .line 3 */
		 /* filled-new-array {v0}, [Ljava/lang/String; */
		 /* .line 4 */
		 /* new-instance v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase; */
		 /* invoke-direct {v0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
		 this.a = v0;
		 /* .line 3 */
		 /* new-instance v0, Ljava/util/concurrent/CountDownLatch; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V */
		 this.b = v0;
		 return;
	 } // .end method
	 public static java.lang.String a ( Object[] p0, Object[] p1, Integer p2 ) {
		 /* .locals 17 */
		 /* move-object/from16 v0, p0 */
		 /* move-object/from16 v1, p1 */
		 /* .line 41 */
		 /* array-length v2, v0 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
	 } // :goto_0
	 /* if-ge v4, v2, :cond_c */
	 /* add-int v5, v4, v2 */
	 /* .line 42 */
	 /* div-int/lit8 v5, v5, 0x2 */
} // :goto_1
/* const/16 v6, 0xa */
int v7 = -1; // const/4 v7, -0x1
/* if-le v5, v7, :cond_0 */
/* .line 43 */
/* aget-byte v8, v0, v5 */
/* if-eq v8, v6, :cond_0 */
/* add-int/lit8 v5, v5, -0x1 */
} // :cond_0
/* add-int/lit8 v5, v5, 0x1 */
int v8 = 1; // const/4 v8, 0x1
int v9 = 1; // const/4 v9, 0x1
} // :goto_2
/* add-int v10, v5, v9 */
/* .line 44 */
/* aget-byte v11, v0, v10 */
/* if-eq v11, v6, :cond_1 */
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_1
/* sub-int v6, v10, v5 */
/* move/from16 v11, p2 */
int v9 = 0; // const/4 v9, 0x0
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
} // :goto_3
if ( v9 != null) { // if-eqz v9, :cond_2
/* const/16 v9, 0x2e */
int v14 = 0; // const/4 v14, 0x0
/* .line 45 */
} // :cond_2
/* aget-object v14, v1, v11 */
/* aget-byte v14, v14, v12 */
/* and-int/lit16 v14, v14, 0xff */
/* move/from16 v16, v14 */
/* move v14, v9 */
/* move/from16 v9, v16 */
} // :goto_4
/* add-int v15, v5, v13 */
/* .line 46 */
/* aget-byte v15, v0, v15 */
/* and-int/lit16 v15, v15, 0xff */
/* sub-int/2addr v9, v15 */
if ( v9 != null) { // if-eqz v9, :cond_3
} // :cond_3
/* add-int/lit8 v13, v13, 0x1 */
/* add-int/lit8 v12, v12, 0x1 */
/* if-ne v13, v6, :cond_4 */
/* .line 47 */
} // :cond_4
/* aget-object v15, v1, v11 */
/* array-length v15, v15 */
/* if-ne v15, v12, :cond_b */
/* .line 48 */
/* array-length v14, v1 */
/* sub-int/2addr v14, v8 */
/* if-ne v11, v14, :cond_a */
} // :goto_5
/* if-gez v9, :cond_5 */
} // :goto_6
/* add-int/lit8 v5, v5, -0x1 */
/* move v2, v5 */
} // :cond_5
/* if-lez v9, :cond_6 */
} // :goto_7
/* add-int/lit8 v4, v10, 0x1 */
} // :cond_6
/* sub-int v7, v6, v13 */
/* .line 49 */
/* aget-object v8, v1, v11 */
/* array-length v8, v8 */
/* sub-int/2addr v8, v12 */
} // :goto_8
/* add-int/lit8 v11, v11, 0x1 */
/* .line 50 */
/* array-length v9, v1 */
/* if-ge v11, v9, :cond_7 */
/* .line 51 */
/* aget-object v9, v1, v11 */
/* array-length v9, v9 */
/* add-int/2addr v8, v9 */
} // :cond_7
/* if-ge v8, v7, :cond_8 */
} // :cond_8
/* if-le v8, v7, :cond_9 */
/* .line 52 */
} // :cond_9
/* new-instance v1, Ljava/lang/String; */
v2 = k.e1.e.i;
/* invoke-direct {v1, v0, v5, v6, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V */
} // :cond_a
/* add-int/lit8 v11, v11, 0x1 */
int v9 = 1; // const/4 v9, 0x1
int v12 = -1; // const/4 v12, -0x1
} // :cond_b
/* move v9, v14 */
} // :cond_c
int v1 = 0; // const/4 v1, 0x0
} // :goto_9
} // .end method
public static okhttp3.internal.publicsuffix.PublicSuffixDatabase c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.h;
} // .end method
/* # virtual methods */
public java.lang.String a ( java.lang.String p0 ) {
/* .locals 7 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 1 */
java.net.IDN .toUnicode ( p1 );
final String v1 = "\\."; // const-string v1, "\\."
/* .line 2 */
(( java.lang.String ) v0 ).split ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 3 */
(( okhttp3.internal.publicsuffix.PublicSuffixDatabase ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a([Ljava/lang/String;)[Ljava/lang/String;
/* .line 4 */
/* array-length v3, v0 */
/* array-length v4, v2 */
/* const/16 v5, 0x21 */
int v6 = 0; // const/4 v6, 0x0
/* if-ne v3, v4, :cond_0 */
/* aget-object v3, v2, v6 */
v3 = (( java.lang.String ) v3 ).charAt ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C
/* if-eq v3, v5, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
} // :cond_0
/* aget-object v3, v2, v6 */
v3 = (( java.lang.String ) v3 ).charAt ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C
/* if-ne v3, v5, :cond_1 */
/* .line 6 */
/* array-length v0, v0 */
/* array-length v2, v2 */
/* .line 7 */
} // :cond_1
/* array-length v0, v0 */
/* array-length v2, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // :goto_0
/* sub-int/2addr v0, v2 */
/* .line 8 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 9 */
(( java.lang.String ) p1 ).split ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 10 */
} // :goto_1
/* array-length v1, p1 */
/* if-ge v0, v1, :cond_2 */
/* .line 11 */
/* aget-object v1, p1, v0 */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x2e */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v0, 0x1 */
/* .line 12 */
} // :cond_2
p1 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 p1, p1, -0x1 */
(( java.lang.StringBuilder ) v2 ).deleteCharAt ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
/* .line 13 */
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 14 */
} // :cond_3
/* new-instance p1, Ljava/lang/NullPointerException; */
final String v0 = "domain == null"; // const-string v0, "domain == null"
/* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void a ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 53 */
/* const-class v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase; */
final String v1 = "publicsuffixes.gz"; // const-string v1, "publicsuffixes.gz"
(( java.lang.Class ) v0 ).getResourceAsStream ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
/* if-nez v0, :cond_0 */
return;
/* .line 54 */
} // :cond_0
/* new-instance v1, Ll/m; */
l.r .a ( v0 );
/* invoke-direct {v1, v0}, Ll/m;-><init>(Ll/y;)V */
l.r .a ( v1 );
/* .line 55 */
v1 = try { // :try_start_0
/* .line 56 */
/* new-array v1, v1, [B */
/* .line 57 */
v2 = /* .line 58 */
/* .line 59 */
/* new-array v2, v2, [B */
/* .line 60 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 61 */
k.e1.e .a ( v0 );
/* .line 62 */
/* monitor-enter p0 */
/* .line 63 */
try { // :try_start_1
this.c = v1;
/* .line 64 */
this.d = v2;
/* .line 65 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 66 */
v0 = this.b;
(( java.util.concurrent.CountDownLatch ) v0 ).countDown ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
return;
/* :catchall_0 */
/* move-exception v0 */
/* .line 67 */
try { // :try_start_2
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
/* .line 68 */
k.e1.e .a ( v0 );
/* throw v1 */
} // .end method
public final java.lang.String a ( java.lang.String[] p0 ) {
/* .locals 8 */
/* .line 15 */
v0 = this.a;
v0 = (( java.util.concurrent.atomic.AtomicBoolean ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-nez v0, :cond_0 */
v0 = this.a;
v0 = (( java.util.concurrent.atomic.AtomicBoolean ) v0 ).compareAndSet ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 16 */
(( okhttp3.internal.publicsuffix.PublicSuffixDatabase ) p0 ).b ( ); // invoke-virtual {p0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b()V
/* .line 17 */
} // :cond_0
try { // :try_start_0
v0 = this.b;
(( java.util.concurrent.CountDownLatch ) v0 ).await ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 18 */
/* :catch_0 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
/* .line 19 */
} // :goto_0
/* monitor-enter p0 */
/* .line 20 */
try { // :try_start_1
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_d
/* .line 21 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 22 */
/* array-length v0, p1 */
/* new-array v3, v0, [[B */
int v4 = 0; // const/4 v4, 0x0
/* .line 23 */
} // :goto_1
/* array-length v5, p1 */
/* if-ge v4, v5, :cond_1 */
/* .line 24 */
/* aget-object v5, p1, v4 */
v6 = k.e1.e.i;
(( java.lang.String ) v5 ).getBytes ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
/* aput-object v5, v3, v4 */
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_2
int v4 = 0; // const/4 v4, 0x0
/* if-ge p1, v0, :cond_3 */
/* .line 25 */
v5 = this.c;
okhttp3.internal.publicsuffix.PublicSuffixDatabase .a ( v5,v3,p1 );
if ( v5 != null) { // if-eqz v5, :cond_2
} // :cond_2
/* add-int/lit8 p1, p1, 0x1 */
} // :cond_3
/* move-object v5, v4 */
} // :goto_3
/* if-le v0, v2, :cond_5 */
/* .line 26 */
(( B ) v3 ).clone ( ); // invoke-virtual {v3}, [[B->clone()Ljava/lang/Object;
/* check-cast p1, [[B */
int v6 = 0; // const/4 v6, 0x0
/* .line 27 */
} // :goto_4
/* array-length v7, p1 */
/* sub-int/2addr v7, v2 */
/* if-ge v6, v7, :cond_5 */
/* .line 28 */
v7 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.e;
/* aput-object v7, p1, v6 */
/* .line 29 */
v7 = this.c;
okhttp3.internal.publicsuffix.PublicSuffixDatabase .a ( v7,p1,v6 );
if ( v7 != null) { // if-eqz v7, :cond_4
} // :cond_4
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_5
/* move-object v7, v4 */
} // :goto_5
if ( v7 != null) { // if-eqz v7, :cond_7
} // :goto_6
/* add-int/lit8 p1, v0, -0x1 */
/* if-ge v1, p1, :cond_7 */
/* .line 30 */
p1 = this.d;
okhttp3.internal.publicsuffix.PublicSuffixDatabase .a ( p1,v3,v1 );
if ( p1 != null) { // if-eqz p1, :cond_6
/* move-object v4, p1 */
} // :cond_6
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_7
} // :goto_7
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 31 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "!"; // const-string v0, "!"
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "\\."; // const-string v0, "\\."
/* .line 32 */
(( java.lang.String ) p1 ).split ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
} // :cond_8
/* if-nez v5, :cond_9 */
/* if-nez v7, :cond_9 */
/* .line 33 */
p1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.g;
} // :cond_9
if ( v5 != null) { // if-eqz v5, :cond_a
final String p1 = "\\."; // const-string p1, "\\."
/* .line 34 */
(( java.lang.String ) v5 ).split ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 35 */
} // :cond_a
p1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f;
} // :goto_8
if ( v7 != null) { // if-eqz v7, :cond_b
final String v0 = "\\."; // const-string v0, "\\."
/* .line 36 */
(( java.lang.String ) v7 ).split ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 37 */
} // :cond_b
v0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f;
/* .line 38 */
} // :goto_9
/* array-length v1, p1 */
/* array-length v2, v0 */
/* if-le v1, v2, :cond_c */
} // :cond_c
/* move-object p1, v0 */
} // :goto_a
/* .line 39 */
} // :cond_d
try { // :try_start_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Unable to load publicsuffixes.gz resource from the classpath."; // const-string v0, "Unable to load publicsuffixes.gz resource from the classpath."
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 40 */
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw p1 */
} // .end method
public final void b ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
try { // :try_start_0
(( okhttp3.internal.publicsuffix.PublicSuffixDatabase ) p0 ).a ( ); // invoke-virtual {p0}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a()V
/* :try_end_0 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // :cond_0
return;
/* :catchall_0 */
/* move-exception v1 */
/* :catch_0 */
/* move-exception v1 */
/* .line 3 */
try { // :try_start_1
k.e1.l.j .c ( );
int v3 = 5; // const/4 v3, 0x5
final String v4 = "Failed to read public suffix list"; // const-string v4, "Failed to read public suffix list"
(( k.e1.l.j ) v2 ).a ( v3, v4, v1 ); // invoke-virtual {v2, v3, v4, v1}, Lk/e1/l/j;->a(ILjava/lang/String;Ljava/lang/Throwable;)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // :cond_1
return;
/* .line 5 */
/* :catch_1 */
try { // :try_start_2
java.lang.Thread .interrupted ( );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // :cond_2
/* throw v1 */
} // .end method
