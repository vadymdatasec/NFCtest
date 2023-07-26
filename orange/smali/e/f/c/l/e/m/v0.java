public class e.f.c.l.e.m.v0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.Comparator A;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Comparator<", */
	 /* "Ljava/io/File;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.util.Comparator B;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Comparator<", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final java.util.regex.Pattern C;
public static final java.util.Map D;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final java.lang.String E;
public static final java.io.FilenameFilter x;
public static final java.io.FilenameFilter y;
public static final java.io.FilenameFilter z;
/* # instance fields */
public final android.content.Context a;
public final e.f.c.l.e.m.i1 b;
public final e.f.c.l.e.m.c1 c;
public final e.f.c.l.e.m.b2 d;
public final e.f.c.l.e.m.o e;
public final e.f.c.l.e.q.c f;
public final e.f.c.l.e.m.q1 g;
public final e.f.c.l.e.r.h h;
public final e.f.c.l.e.m.b i;
public final e.f.c.l.e.t.c j;
public final e.f.c.l.e.m.q0 k;
public final e.f.c.l.e.n.e l;
public final e.f.c.l.e.t.a m;
public final e.f.c.l.e.t.b n;
public final e.f.c.l.e.a o;
public final e.f.c.l.e.w.d p;
public final java.lang.String q;
public final e.f.c.l.e.k.a r;
public final e.f.c.l.e.m.z1 s;
public e.f.c.l.e.m.g1 t;
public e.f.a.b.h.h u;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/b/h/h<", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public e.f.a.b.h.h v;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/b/h/h<", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public e.f.a.b.h.h w;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/b/h/h<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.c.l.e.m.v0 ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Le/f/c/l/e/m/w; */
final String v1 = "BeginSession"; // const-string v1, "BeginSession"
/* invoke-direct {v0, v1}, Le/f/c/l/e/m/w;-><init>(Ljava/lang/String;)V */
/* .line 2 */
e.f.c.l.e.m.p .a ( );
/* .line 3 */
/* new-instance v0, Le/f/c/l/e/m/b0; */
/* invoke-direct {v0}, Le/f/c/l/e/m/b0;-><init>()V */
/* .line 4 */
/* new-instance v0, Le/f/c/l/e/m/c0; */
/* invoke-direct {v0}, Le/f/c/l/e/m/c0;-><init>()V */
/* .line 5 */
/* new-instance v0, Le/f/c/l/e/m/d0; */
/* invoke-direct {v0}, Le/f/c/l/e/m/d0;-><init>()V */
final String v0 = "([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+"; // const-string v0, "([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+"
/* .line 6 */
java.util.regex.Pattern .compile ( v0 );
final String v0 = "X-CRASHLYTICS-SEND-FLAGS"; // const-string v0, "X-CRASHLYTICS-SEND-FLAGS"
final String v1 = "1"; // const-string v1, "1"
/* .line 7 */
java.util.Collections .singletonMap ( v0,v1 );
final String v0 = "SessionUser"; // const-string v0, "SessionUser"
final String v1 = "SessionApp"; // const-string v1, "SessionApp"
final String v2 = "SessionOS"; // const-string v2, "SessionOS"
final String v3 = "SessionDevice"; // const-string v3, "SessionDevice"
/* .line 8 */
/* filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String; */
return;
} // .end method
public e.f.c.l.e.m.v0 ( ) {
/* .locals 11 */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object/from16 v3, p6 */
/* move-object/from16 v2, p10 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger; */
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v4, v5}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V */
/* .line 3 */
/* new-instance v4, Le/f/a/b/h/h; */
/* invoke-direct {v4}, Le/f/a/b/h/h;-><init>()V */
this.u = v4;
/* .line 4 */
/* new-instance v4, Le/f/a/b/h/h; */
/* invoke-direct {v4}, Le/f/a/b/h/h;-><init>()V */
this.v = v4;
/* .line 5 */
/* new-instance v4, Le/f/a/b/h/h; */
/* invoke-direct {v4}, Le/f/a/b/h/h;-><init>()V */
this.w = v4;
/* .line 6 */
/* new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean; */
/* invoke-direct {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
/* .line 7 */
this.a = v1;
/* move-object v4, p2 */
/* .line 8 */
this.e = v4;
/* move-object v4, p3 */
/* .line 9 */
this.f = v4;
/* move-object v4, p4 */
/* .line 10 */
this.g = v4;
/* move-object/from16 v6, p5 */
/* .line 11 */
this.b = v6;
/* .line 12 */
this.h = v3;
/* move-object/from16 v6, p7 */
/* .line 13 */
this.c = v6;
/* move-object/from16 v6, p8 */
/* .line 14 */
this.i = v6;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 15 */
this.j = v2;
/* .line 16 */
} // :cond_0
(( e.f.c.l.e.m.v0 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->b()Le/f/c/l/e/t/c;
this.j = v2;
} // :goto_0
/* move-object/from16 v2, p11 */
/* .line 17 */
this.o = v2;
/* .line 18 */
/* invoke-interface/range {p12 ..p12}, Le/f/c/l/e/x/b;->a()Ljava/lang/String; */
this.q = v2;
/* move-object/from16 v2, p13 */
/* .line 19 */
this.r = v2;
/* .line 20 */
/* new-instance v2, Le/f/c/l/e/m/b2; */
/* invoke-direct {v2}, Le/f/c/l/e/m/b2;-><init>()V */
this.d = v2;
/* .line 21 */
/* new-instance v2, Le/f/c/l/e/m/q0; */
/* invoke-direct {v2, v3}, Le/f/c/l/e/m/q0;-><init>(Le/f/c/l/e/r/h;)V */
this.k = v2;
/* .line 22 */
/* new-instance v2, Le/f/c/l/e/n/e; */
v7 = this.k;
/* invoke-direct {v2, p1, v7}, Le/f/c/l/e/n/e;-><init>(Landroid/content/Context;Le/f/c/l/e/n/c;)V */
this.l = v2;
int v2 = 0; // const/4 v2, 0x0
/* if-nez p9, :cond_1 */
/* .line 23 */
/* new-instance v7, Le/f/c/l/e/t/a; */
/* new-instance v8, Le/f/c/l/e/m/r0; */
/* invoke-direct {v8, p0, v2}, Le/f/c/l/e/m/r0;-><init>(Le/f/c/l/e/m/v0;Le/f/c/l/e/m/w;)V */
/* invoke-direct {v7, v8}, Le/f/c/l/e/t/a;-><init>(Le/f/c/l/e/t/d;)V */
} // :cond_1
/* move-object/from16 v7, p9 */
/* .line 24 */
} // :goto_1
this.m = v7;
/* .line 25 */
/* new-instance v7, Le/f/c/l/e/m/s0; */
/* invoke-direct {v7, p0, v2}, Le/f/c/l/e/m/s0;-><init>(Le/f/c/l/e/m/v0;Le/f/c/l/e/m/w;)V */
this.n = v7;
/* .line 26 */
/* new-instance v7, Le/f/c/l/e/w/a; */
/* const/16 v2, 0x400 */
int v8 = 1; // const/4 v8, 0x1
/* new-array v8, v8, [Le/f/c/l/e/w/d; */
/* new-instance v9, Le/f/c/l/e/w/c; */
/* const/16 v10, 0xa */
/* invoke-direct {v9, v10}, Le/f/c/l/e/w/c;-><init>(I)V */
/* aput-object v9, v8, v5 */
/* invoke-direct {v7, v2, v8}, Le/f/c/l/e/w/a;-><init>(I[Le/f/c/l/e/w/d;)V */
this.p = v7;
/* .line 27 */
v5 = this.l;
v8 = this.d;
/* move-object v1, p1 */
/* move-object v2, p4 */
/* move-object/from16 v3, p6 */
/* move-object/from16 v4, p8 */
/* move-object v6, v8 */
/* move-object/from16 v8, p14 */
/* .line 28 */
/* invoke-static/range {v1 ..v8}, Le/f/c/l/e/m/z1;->a(Landroid/content/Context;Le/f/c/l/e/m/q1;Le/f/c/l/e/r/h;Le/f/c/l/e/m/b;Le/f/c/l/e/n/e;Le/f/c/l/e/m/b2;Le/f/c/l/e/w/d;Le/f/c/l/e/v/f;)Le/f/c/l/e/m/z1; */
this.s = v1;
return;
} // .end method
public static Long a ( java.util.Date p0 ) { //synthethic
/* .locals 2 */
/* .line 6 */
e.f.c.l.e.m.v0 .b ( p0 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static e.f.c.l.e.t.h.c a ( e.f.c.l.e.m.v0 p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
/* .locals 0 */
/* .line 4 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/t/h/c;
} // .end method
public static java.lang.String a ( java.io.File p0 ) {
/* .locals 2 */
/* .line 29 */
(( java.io.File ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
/* const/16 v1, 0x23 */
(( java.lang.String ) p0 ).substring ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public static java.util.List a ( Object p0, java.lang.String p1, android.content.Context p2, java.io.File p3, Object[] p4 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/l/e/f;", */
/* "Ljava/lang/String;", */
/* "Landroid/content/Context;", */
/* "Ljava/io/File;", */
/* "[B)", */
/* "Ljava/util/List<", */
/* "Le/f/c/l/e/m/u1;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 244 */
/* new-instance v0, Le/f/c/l/e/m/t1; */
/* invoke-direct {v0, p3}, Le/f/c/l/e/m/t1;-><init>(Ljava/io/File;)V */
/* .line 245 */
(( e.f.c.l.e.m.t1 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/m/t1;->b(Ljava/lang/String;)Ljava/io/File;
/* .line 246 */
(( e.f.c.l.e.m.t1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/m/t1;->a(Ljava/lang/String;)Ljava/io/File;
/* .line 247 */
try { // :try_start_0
e.f.c.l.e.p.c .a ( v0,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int p2 = 0; // const/4 p2, 0x0
/* .line 248 */
} // :goto_0
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 249 */
/* new-instance v1, Le/f/c/l/e/m/f; */
final String v2 = "logs_file"; // const-string v2, "logs_file"
final String v3 = "logs"; // const-string v3, "logs"
/* invoke-direct {v1, v2, v3, p4}, Le/f/c/l/e/m/f;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V */
/* .line 250 */
/* new-instance p4, Le/f/c/l/e/m/f; */
final String v1 = "binary_images_file"; // const-string v1, "binary_images_file"
final String v2 = "binaryImages"; // const-string v2, "binaryImages"
/* invoke-direct {p4, v1, v2, p2}, Le/f/c/l/e/m/f;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V */
/* .line 251 */
/* new-instance p2, Le/f/c/l/e/m/p1; */
/* .line 252 */
final String v1 = "crash_meta_file"; // const-string v1, "crash_meta_file"
final String v2 = "metadata"; // const-string v2, "metadata"
/* invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V */
/* .line 253 */
/* .line 254 */
/* new-instance p2, Le/f/c/l/e/m/p1; */
/* .line 255 */
final String v1 = "session_meta_file"; // const-string v1, "session_meta_file"
final String v2 = "session"; // const-string v2, "session"
/* invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V */
/* .line 256 */
/* .line 257 */
/* new-instance p2, Le/f/c/l/e/m/p1; */
/* .line 258 */
final String v1 = "app_meta_file"; // const-string v1, "app_meta_file"
final String v2 = "app"; // const-string v2, "app"
/* invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V */
/* .line 259 */
/* .line 260 */
/* new-instance p2, Le/f/c/l/e/m/p1; */
/* .line 261 */
final String v1 = "device_meta_file"; // const-string v1, "device_meta_file"
final String v2 = "device"; // const-string v2, "device"
/* invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V */
/* .line 262 */
/* .line 263 */
/* new-instance p2, Le/f/c/l/e/m/p1; */
/* .line 264 */
final String v1 = "os_meta_file"; // const-string v1, "os_meta_file"
final String v2 = "os"; // const-string v2, "os"
/* invoke-direct {p2, v1, v2, p4}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V */
/* .line 265 */
/* .line 266 */
/* new-instance p2, Le/f/c/l/e/m/p1; */
/* .line 267 */
final String p4 = "minidump_file"; // const-string p4, "minidump_file"
final String v1 = "minidump"; // const-string v1, "minidump"
/* invoke-direct {p2, p4, v1, p0}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V */
/* .line 268 */
/* .line 269 */
/* new-instance p0, Le/f/c/l/e/m/p1; */
final String p2 = "user_meta_file"; // const-string p2, "user_meta_file"
final String p4 = "user"; // const-string p4, "user"
/* invoke-direct {p0, p2, p4, p3}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V */
/* .line 270 */
/* new-instance p0, Le/f/c/l/e/m/p1; */
final String p2 = "keys_file"; // const-string p2, "keys_file"
final String p3 = "keys"; // const-string p3, "keys"
/* invoke-direct {p0, p2, p3, p1}, Le/f/c/l/e/m/p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V */
} // .end method
public static void a ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.e.m.v0 ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->d()V
return;
} // .end method
public static void a ( e.f.c.l.e.m.v0 p0, Long p1 ) { //synthethic
/* .locals 0 */
/* .line 8 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/c/l/e/m/v0;->a(J)V
return;
} // .end method
public static void a ( e.f.c.l.e.m.v0 p0, Object p1, Boolean p2 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 2 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/v/j/b;Z)V
return;
} // .end method
public static void a ( e.f.c.l.e.m.v0 p0, java.lang.Thread p1, java.lang.Throwable p2, java.lang.String p3, Long p4 ) { //synthethic
/* .locals 0 */
/* .line 7 */
/* invoke-virtual/range {p0 ..p5}, Le/f/c/l/e/m/v0;->a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;J)V */
return;
} // .end method
public static void a ( Object p0, java.io.File p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "Failed to close file input stream."; // const-string v0, "Failed to close file input stream."
/* .line 222 */
v1 = (( java.io.File ) p1 ).exists ( ); // invoke-virtual {p1}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_0 */
/* .line 223 */
e.f.c.l.e.b .a ( );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Tried to include a file that doesn\'t exist: "; // const-string v1, "Tried to include a file that doesn\'t exist: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V
return;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 224 */
try { // :try_start_0
/* new-instance v2, Ljava/io/FileInputStream; */
/* invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 225 */
try { // :try_start_1
(( java.io.File ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/io/File;->length()J
/* move-result-wide v3 */
/* long-to-int p1, v3 */
e.f.c.l.e.m.v0 .a ( v2,p0,p1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 226 */
e.f.c.l.e.m.j .a ( v2,v0 );
return;
/* :catchall_0 */
/* move-exception p0 */
/* move-object v1, v2 */
/* :catchall_1 */
/* move-exception p0 */
} // :goto_0
e.f.c.l.e.m.j .a ( v1,v0 );
/* .line 227 */
/* throw p0 */
} // .end method
public static void a ( Object p0, java.io.File[] p1, java.lang.String p2 ) {
/* .locals 10 */
/* .line 207 */
v0 = e.f.c.l.e.m.j.c;
java.util.Arrays .sort ( p1,v0 );
/* .line 208 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v0, :cond_0 */
/* aget-object v3, p1, v2 */
/* .line 209 */
try { // :try_start_0
e.f.c.l.e.b .a ( );
v5 = java.util.Locale.US;
final String v6 = "Found Non Fatal for session ID %s in %s "; // const-string v6, "Found Non Fatal for session ID %s in %s "
int v7 = 2; // const/4 v7, 0x2
/* new-array v7, v7, [Ljava/lang/Object; */
/* aput-object p2, v7, v1 */
/* .line 210 */
(( java.io.File ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;
int v9 = 1; // const/4 v9, 0x1
/* aput-object v8, v7, v9 */
/* .line 211 */
java.lang.String .format ( v5,v6,v7 );
/* .line 212 */
(( e.f.c.l.e.b ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 213 */
e.f.c.l.e.m.v0 .a ( p0,v3 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v3 */
/* .line 214 */
e.f.c.l.e.b .a ( );
final String v5 = "Error writting non-fatal to session."; // const-string v5, "Error writting non-fatal to session."
(( e.f.c.l.e.b ) v4 ).b ( v5, v3 ); // invoke-virtual {v4, v5, v3}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
return;
} // .end method
public static void a ( java.io.File p0, e.f.c.l.e.m.n0 p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
final String v0 = "Failed to close "; // const-string v0, "Failed to close "
final String v1 = "Failed to flush to append to "; // const-string v1, "Failed to flush to append to "
int v2 = 0; // const/4 v2, 0x0
/* .line 126 */
try { // :try_start_0
/* new-instance v3, Ljava/io/FileOutputStream; */
int v4 = 1; // const/4 v4, 0x1
/* invoke-direct {v3, p0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 127 */
try { // :try_start_1
e.f.c.l.e.s.e .a ( v3 );
/* .line 128 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 129 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v2,p1 );
/* .line 130 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v3,p0 );
return;
/* :catchall_0 */
/* move-exception p1 */
/* :catchall_1 */
/* move-exception p1 */
/* move-object v3, v2 */
/* .line 131 */
} // :goto_0
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v2,v1 );
/* .line 132 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v3,p0 );
/* .line 133 */
/* throw p1 */
} // .end method
public static void a ( java.io.InputStream p0, Object p1, Integer p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 228 */
/* new-array v0, p2, [B */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p2, :cond_0 */
/* sub-int v2, p2, v1 */
/* .line 229 */
v2 = (( java.io.InputStream ) p0 ).read ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I
/* if-ltz v2, :cond_0 */
/* add-int/2addr v1, v2 */
/* .line 230 */
} // :cond_0
(( e.f.c.l.e.s.e ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/s/e;->a([B)V
return;
} // .end method
public static void a ( java.lang.String p0, java.io.File p1 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 3 */
e.f.c.l.e.m.v0 .b ( p0,p1 );
return;
} // .end method
public static Boolean a ( java.io.File p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
final String p0 = ".ae"; // const-string p0, ".ae"
/* .line 9 */
p0 = (( java.lang.String ) p1 ).startsWith ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
} // .end method
public static java.io.File a ( e.f.c.l.e.m.v0 p0, java.io.FilenameFilter p1 ) { //synthethic
/* .locals 0 */
/* .line 5 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
} // .end method
public static java.io.File a ( java.io.File p0, java.io.FilenameFilter p1 ) {
/* .locals 0 */
/* .line 55 */
(( java.io.File ) p0 ).listFiles ( p1 ); // invoke-virtual {p0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
e.f.c.l.e.m.v0 .d ( p0 );
} // .end method
public static Long b ( java.util.Date p0 ) {
/* .locals 4 */
/* .line 12 */
(( java.util.Date ) p0 ).getTime ( ); // invoke-virtual {p0}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x3e8 */
/* div-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public static e.f.c.l.e.m.i1 b ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.b;
} // .end method
public static void b ( java.lang.String p0, java.io.File p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
return;
/* .line 13 */
} // :cond_0
/* new-instance v0, Le/f/c/l/e/m/z; */
/* invoke-direct {v0, p0}, Le/f/c/l/e/m/z;-><init>(Ljava/lang/String;)V */
e.f.c.l.e.m.v0 .a ( p1,v0 );
return;
} // .end method
public static void b ( java.io.File[] p0 ) { //synthethic
/* .locals 0 */
/* .line 2 */
e.f.c.l.e.m.v0 .c ( p0 );
return;
} // .end method
public static e.f.c.l.e.m.o c ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.e;
} // .end method
public static void c ( java.io.File[] p0 ) {
/* .locals 3 */
/* if-nez p0, :cond_0 */
return;
/* .line 16 */
} // :cond_0
/* array-length v0, p0 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
/* aget-object v2, p0, v1 */
/* .line 17 */
(( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public static e.f.a.b.h.g d ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( e.f.c.l.e.m.v0 ) p0 ).q ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->q()Le/f/a/b/h/g;
} // .end method
public static java.io.File d ( java.io.File[] p0 ) {
/* .locals 0 */
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* new-array p0, p0, [Ljava/io/File; */
} // :cond_0
} // .end method
public static e.f.c.l.e.t.a e ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.m;
} // .end method
public static e.f.c.l.e.t.c f ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.j;
} // .end method
public static e.f.c.l.e.m.b g ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.i;
} // .end method
public static e.f.c.l.e.t.b h ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.n;
} // .end method
public static java.lang.String h ( java.lang.String p0 ) { //synthethic
/* .locals 0 */
/* .line 2 */
e.f.c.l.e.m.v0 .i ( p0 );
} // .end method
public static java.lang.String i ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.q;
} // .end method
public static java.lang.String i ( java.lang.String p0 ) {
/* .locals 2 */
final String v0 = "-"; // const-string v0, "-"
final String v1 = ""; // const-string v1, ""
/* .line 2 */
(( java.lang.String ) p0 ).replaceAll ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public static e.f.c.l.e.k.a j ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.r;
} // .end method
public static java.lang.String k ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( e.f.c.l.e.m.v0 ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->f()Ljava/lang/String;
} // .end method
public static e.f.c.l.e.m.c1 l ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.c;
} // .end method
public static e.f.c.l.e.m.z1 m ( e.f.c.l.e.m.v0 p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.s;
} // .end method
public static java.util.regex.Pattern t ( ) { //synthethic
/* .locals 1 */
/* .line 1 */
v0 = e.f.c.l.e.m.v0.C;
} // .end method
public static Boolean u ( ) {
/* .locals 1 */
try { // :try_start_0
final String v0 = "com.google.firebase.crash.FirebaseCrash"; // const-string v0, "com.google.firebase.crash.FirebaseCrash"
/* .line 1 */
java.lang.Class .forName ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
int v0 = 1; // const/4 v0, 0x1
/* :catch_0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Long v ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
e.f.c.l.e.m.v0 .b ( v0 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( Float p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(F", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/l/e/v/j/b;", */
/* ">;)", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 22 */
v0 = this.m;
v0 = (( e.f.c.l.e.t.a ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/t/a;->a()Z
/* if-nez v0, :cond_0 */
/* .line 23 */
e.f.c.l.e.b .a ( );
final String p2 = "No reports are available."; // const-string p2, "No reports are available."
(( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 24 */
p1 = this.u;
int p2 = 0; // const/4 p2, 0x0
java.lang.Boolean .valueOf ( p2 );
(( e.f.a.b.h.h ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
int p1 = 0; // const/4 p1, 0x0
/* .line 25 */
e.f.a.b.h.n .a ( p1 );
/* .line 26 */
} // :cond_0
e.f.c.l.e.b .a ( );
final String v1 = "Unsent reports are available."; // const-string v1, "Unsent reports are available."
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 27 */
(( e.f.c.l.e.m.v0 ) p0 ).s ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->s()Le/f/a/b/h/g;
/* new-instance v1, Le/f/c/l/e/m/k0; */
/* invoke-direct {v1, p0, p2, p1}, Le/f/c/l/e/m/k0;-><init>(Le/f/c/l/e/m/v0;Le/f/a/b/h/g;F)V */
/* .line 28 */
(( e.f.a.b.h.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/f;)Le/f/a/b/h/g;
} // .end method
public final e.f.c.l.e.t.h.c a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 4 */
/* .line 231 */
(( e.f.c.l.e.m.v0 ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;
final String v1 = "com.crashlytics.ApiEndpoint"; // const-string v1, "com.crashlytics.ApiEndpoint"
/* .line 232 */
e.f.c.l.e.m.j .b ( v0,v1 );
/* .line 233 */
/* new-instance v1, Le/f/c/l/e/t/h/d; */
v2 = this.f;
/* .line 234 */
e.f.c.l.e.m.b1 .e ( );
/* invoke-direct {v1, v0, p1, v2, v3}, Le/f/c/l/e/t/h/d;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Ljava/lang/String;)V */
/* .line 235 */
/* new-instance p1, Le/f/c/l/e/t/h/e; */
v2 = this.f;
/* .line 236 */
e.f.c.l.e.m.b1 .e ( );
/* invoke-direct {p1, v0, p2, v2, v3}, Le/f/c/l/e/t/h/e;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Ljava/lang/String;)V */
/* .line 237 */
/* new-instance p2, Le/f/c/l/e/t/h/b; */
/* invoke-direct {p2, v1, p1}, Le/f/c/l/e/t/h/b;-><init>(Le/f/c/l/e/t/h/d;Le/f/c/l/e/t/h/e;)V */
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 76 */
v0 = this.e;
/* new-instance v1, Le/f/c/l/e/m/r; */
/* invoke-direct {v1, p0}, Le/f/c/l/e/m/r;-><init>(Le/f/c/l/e/m/v0;)V */
(( e.f.c.l.e.m.o ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/m/o;->a(Ljava/lang/Runnable;)Le/f/a/b/h/g;
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 30 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/m/v0;->a(IZ)V
return;
} // .end method
public final void a ( Integer p0, Boolean p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* add-int/lit8 v0, p2, 0x8 */
/* .line 31 */
(( e.f.c.l.e.m.v0 ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->c(I)V
/* .line 32 */
(( e.f.c.l.e.m.v0 ) p0 ).p ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->p()[Ljava/io/File;
/* .line 33 */
/* array-length v1, v0 */
/* if-gt v1, p2, :cond_0 */
/* .line 34 */
e.f.c.l.e.b .a ( );
final String p2 = "No open sessions to be closed."; // const-string p2, "No open sessions to be closed."
(( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
return;
/* .line 35 */
} // :cond_0
/* aget-object v1, v0, p2 */
/* .line 36 */
e.f.c.l.e.m.v0 .a ( v1 );
/* .line 37 */
(( e.f.c.l.e.m.v0 ) p0 ).g ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/l/e/m/v0;->g(Ljava/lang/String;)V
/* .line 38 */
v2 = v2 = this.o;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 39 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;)V
/* .line 40 */
v2 = v2 = this.o;
/* if-nez v2, :cond_1 */
/* .line 41 */
e.f.c.l.e.b .a ( );
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Could not finalize native session: "; // const-string v4, "Could not finalize native session: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 42 */
} // :cond_1
(( e.f.c.l.e.m.v0 ) p0 ).a ( v0, p2, p1 ); // invoke-virtual {p0, v0, p2, p1}, Le/f/c/l/e/m/v0;->a([Ljava/io/File;II)V
int p1 = 0; // const/4 p1, 0x0
if ( p2 != null) { // if-eqz p2, :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 43 */
/* aget-object p1, v0, p1 */
/* .line 44 */
e.f.c.l.e.m.v0 .a ( p1 );
e.f.c.l.e.m.v0 .i ( p1 );
/* .line 45 */
} // :cond_2
p2 = this.s;
e.f.c.l.e.m.v0 .v ( );
/* move-result-wide v0 */
(( e.f.c.l.e.m.z1 ) p2 ).a ( v0, v1, p1 ); // invoke-virtual {p2, v0, v1, p1}, Le/f/c/l/e/m/z1;->a(JLjava/lang/String;)V
return;
} // .end method
public final void a ( Long p0 ) {
/* .locals 4 */
/* .line 116 */
try { // :try_start_0
/* new-instance v0, Ljava/io/File; */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = ".ae"; // const-string v3, ".ae"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1, p2 ); // invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
(( java.io.File ) v0 ).createNewFile ( ); // invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 117 */
/* :catch_0 */
e.f.c.l.e.b .a ( );
final String p2 = "Could not write app exception marker."; // const-string p2, "Could not write app exception marker."
(( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
} // :goto_0
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
/* if-nez p1, :cond_0 */
return;
/* .line 52 */
} // :cond_0
try { // :try_start_0
(( e.f.c.l.e.s.c ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/l/e/s/c;->c()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 53 */
e.f.c.l.e.b .a ( );
final String v1 = "Error closing session file stream in the presence of an exception"; // const-string v1, "Error closing session file stream in the presence of an exception"
(( e.f.c.l.e.b ) v0 ).b ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :goto_0
return;
} // .end method
public final void a ( Object p0, java.lang.String p1 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 215 */
v0 = e.f.c.l.e.m.v0.E;
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_1 */
/* aget-object v4, v0, v3 */
/* .line 216 */
/* new-instance v5, Le/f/c/l/e/m/o0; */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = ".cls"; // const-string v7, ".cls"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v5, v6}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V */
/* .line 217 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( v5 ); // invoke-virtual {p0, v5}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
/* .line 218 */
/* array-length v6, v5 */
final String v7 = " data for session ID "; // const-string v7, " data for session ID "
/* if-nez v6, :cond_0 */
/* .line 219 */
e.f.c.l.e.b .a ( );
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Can\'t find "; // const-string v8, "Can\'t find "
(( java.lang.StringBuilder ) v6 ).append ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v5 ).a ( v4 ); // invoke-virtual {v5, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 220 */
} // :cond_0
e.f.c.l.e.b .a ( );
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "Collecting "; // const-string v9, "Collecting "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v4 ); // invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( p2 ); // invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v6 ).a ( v4 ); // invoke-virtual {v6, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 221 */
/* aget-object v4, v5, v2 */
e.f.c.l.e.m.v0 .a ( p1,v4 );
} // :goto_1
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_1
return;
} // .end method
public final void a ( Object p0, java.lang.Thread p1, java.lang.Throwable p2, Long p3, java.lang.String p4, Boolean p5 ) {
/* .locals 25 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* move-object/from16 v0, p0 */
/* .line 138 */
/* new-instance v5, Le/f/c/l/e/w/e; */
v1 = this.p;
/* move-object/from16 v2, p3 */
/* invoke-direct {v5, v2, v1}, Le/f/c/l/e/w/e;-><init>(Ljava/lang/Throwable;Le/f/c/l/e/w/d;)V */
/* .line 139 */
/* invoke-virtual/range {p0 ..p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context; */
/* .line 140 */
e.f.c.l.e.m.e .a ( v1 );
/* .line 141 */
(( e.f.c.l.e.m.e ) v2 ).a ( ); // invoke-virtual {v2}, Le/f/c/l/e/m/e;->a()Ljava/lang/Float;
/* .line 142 */
v18 = (( e.f.c.l.e.m.e ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/c/l/e/m/e;->b()I
/* .line 143 */
v19 = e.f.c.l.e.m.j .f ( v1 );
/* .line 144 */
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getConfiguration ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v14, v2, Landroid/content/res/Configuration;->orientation:I */
/* .line 145 */
e.f.c.l.e.m.j .b ( );
/* move-result-wide v2 */
e.f.c.l.e.m.j .a ( v1 );
/* move-result-wide v6 */
/* sub-long v20, v2, v6 */
/* .line 146 */
android.os.Environment .getDataDirectory ( );
(( java.io.File ) v2 ).getPath ( ); // invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v2 );
/* move-result-wide v22 */
/* .line 147 */
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v2,v1 );
/* .line 148 */
/* new-instance v9, Ljava/util/LinkedList; */
/* invoke-direct {v9}, Ljava/util/LinkedList;-><init>()V */
/* .line 149 */
v7 = this.c;
/* .line 150 */
v2 = this.i;
v15 = this.b;
/* .line 151 */
v2 = this.g;
(( e.f.c.l.e.m.q1 ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/c/l/e/m/q1;->b()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
if ( p7 != null) { // if-eqz p7, :cond_1
/* .line 152 */
java.lang.Thread .getAllStackTraces ( );
v6 = /* .line 153 */
/* new-array v6, v6, [Ljava/lang/Thread; */
/* .line 154 */
v8 = } // :goto_0
if ( v8 != null) { // if-eqz v8, :cond_0
/* check-cast v8, Ljava/util/Map$Entry; */
/* .line 155 */
/* check-cast v10, Ljava/lang/Thread; */
/* aput-object v10, v6, v2 */
/* .line 156 */
v10 = this.p;
/* check-cast v8, [Ljava/lang/StackTraceElement; */
/* add-int/2addr v2, v3 */
} // :cond_0
/* move-object v8, v6 */
} // :cond_1
/* new-array v2, v2, [Ljava/lang/Thread; */
/* move-object v8, v2 */
} // :goto_1
final String v2 = "com.crashlytics.CollectCustomKeys"; // const-string v2, "com.crashlytics.CollectCustomKeys"
/* .line 157 */
v1 = e.f.c.l.e.m.j .a ( v1,v2,v3 );
/* if-nez v1, :cond_2 */
/* .line 158 */
/* new-instance v1, Ljava/util/TreeMap; */
/* invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V */
/* .line 159 */
} // :cond_2
v1 = this.d;
(( e.f.c.l.e.m.b2 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/m/b2;->a()Ljava/util/Map;
if ( v1 != null) { // if-eqz v1, :cond_3
v2 = /* .line 160 */
/* if-le v2, v3, :cond_3 */
/* .line 161 */
/* new-instance v2, Ljava/util/TreeMap; */
/* invoke-direct {v2, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V */
/* move-object v11, v2 */
} // :cond_3
} // :goto_2
/* move-object v11, v1 */
} // :goto_3
/* const/16 v10, 0x8 */
/* .line 162 */
v1 = this.l;
/* .line 163 */
(( e.f.c.l.e.n.e ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/l/e/n/e;->b()[B
/* move-object/from16 v1, p1 */
/* move-wide/from16 v2, p4 */
/* move-object/from16 v4, p6 */
/* move-object/from16 v6, p2 */
/* move-object/from16 v24, v15 */
/* move-object/from16 v15, v16 */
/* move-object/from16 v16, v24 */
/* .line 164 */
/* invoke-static/range {v1 ..v23}, Le/f/c/l/e/s/f;->a(Le/f/c/l/e/s/e;JLjava/lang/String;Le/f/c/l/e/w/e;Ljava/lang/Thread;[Ljava/lang/StackTraceElement;[Ljava/lang/Thread;Ljava/util/List;ILjava/util/Map;[BLandroid/app/ActivityManager$RunningAppProcessInfo;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Float;IZJJ)V */
/* .line 165 */
v1 = this.l;
(( e.f.c.l.e.n.e ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/n/e;->a()V
return;
} // .end method
public synchronized void a ( Object p0, java.lang.Thread p1, java.lang.Throwable p2 ) {
/* .locals 8 */
/* monitor-enter p0 */
/* .line 14 */
try { // :try_start_0
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Crashlytics is handling uncaught exception \""; // const-string v2, "Crashlytics is handling uncaught exception \""
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = "\" from thread "; // const-string v2, "\" from thread "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 15 */
(( java.lang.Thread ) p2 ).getName ( ); // invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 16 */
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 17 */
/* new-instance v4, Ljava/util/Date; */
/* invoke-direct {v4}, Ljava/util/Date;-><init>()V */
/* .line 18 */
v0 = this.e;
/* new-instance v1, Le/f/c/l/e/m/g0; */
/* move-object v2, v1 */
/* move-object v3, p0 */
/* move-object v5, p3 */
/* move-object v6, p2 */
/* move-object v7, p1 */
/* invoke-direct/range {v2 ..v7}, Le/f/c/l/e/m/g0;-><init>(Le/f/c/l/e/m/v0;Ljava/util/Date;Ljava/lang/Throwable;Ljava/lang/Thread;Le/f/c/l/e/v/f;)V */
/* .line 19 */
(( e.f.c.l.e.m.o ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/m/o;->c(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 20 */
try { // :try_start_1
e.f.c.l.e.m.h2 .a ( p1 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 21 */
/* :catch_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final void a ( Object p0, Boolean p1 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 238 */
(( e.f.c.l.e.m.v0 ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;
/* .line 239 */
v1 = this.j;
/* .line 240 */
(( e.f.c.l.e.m.v0 ) p0 ).m ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->m()[Ljava/io/File;
/* array-length v3, v2 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v3, :cond_0 */
/* aget-object v5, v2, v4 */
/* .line 241 */
v6 = this.e;
e.f.c.l.e.m.v0 .b ( v6,v5 );
/* .line 242 */
/* new-instance v6, Le/f/c/l/e/t/g/e; */
v7 = e.f.c.l.e.m.v0.D;
/* invoke-direct {v6, v5, v7}, Le/f/c/l/e/t/g/e;-><init>(Ljava/io/File;Ljava/util/Map;)V */
/* .line 243 */
v5 = this.e;
/* new-instance v7, Le/f/c/l/e/m/t0; */
/* invoke-direct {v7, v0, v6, v1, p2}, Le/f/c/l/e/m/t0;-><init>(Landroid/content/Context;Le/f/c/l/e/t/g/d;Le/f/c/l/e/t/f;Z)V */
(( e.f.c.l.e.m.o ) v5 ).a ( v7 ); // invoke-virtual {v5, v7}, Le/f/c/l/e/m/o;->a(Ljava/lang/Runnable;)Le/f/a/b/h/g;
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_0
return;
} // .end method
public final void a ( java.io.File p0, java.lang.String p1, Integer p2 ) {
/* .locals 10 */
/* .line 166 */
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Collecting session parts for ID "; // const-string v2, "Collecting session parts for ID "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 167 */
/* new-instance v0, Le/f/c/l/e/m/o0; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "SessionCrash"; // const-string v2, "SessionCrash"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V */
/* .line 168 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 169 */
/* array-length v3, v0 */
/* if-lez v3, :cond_0 */
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
/* .line 170 */
} // :goto_0
e.f.c.l.e.b .a ( );
v5 = java.util.Locale.US;
int v6 = 2; // const/4 v6, 0x2
/* new-array v7, v6, [Ljava/lang/Object; */
/* aput-object p2, v7, v2 */
/* .line 171 */
java.lang.Boolean .valueOf ( v3 );
/* aput-object v8, v7, v1 */
final String v8 = "Session %s has fatal exception: %s"; // const-string v8, "Session %s has fatal exception: %s"
java.lang.String .format ( v5,v8,v7 );
(( e.f.c.l.e.b ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 172 */
/* new-instance v4, Le/f/c/l/e/m/o0; */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v5 ).append ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "SessionEvent"; // const-string v7, "SessionEvent"
(( java.lang.StringBuilder ) v5 ).append ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v4, v5}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V */
/* .line 173 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 174 */
/* array-length v5, v4 */
/* if-lez v5, :cond_1 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
/* .line 175 */
} // :goto_1
e.f.c.l.e.b .a ( );
v8 = java.util.Locale.US;
/* new-array v6, v6, [Ljava/lang/Object; */
/* aput-object p2, v6, v2 */
/* .line 176 */
java.lang.Boolean .valueOf ( v5 );
/* aput-object v9, v6, v1 */
final String v1 = "Session %s has non-fatal exceptions: %s"; // const-string v1, "Session %s has non-fatal exceptions: %s"
/* .line 177 */
java.lang.String .format ( v8,v1,v6 );
/* .line 178 */
(( e.f.c.l.e.b ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* if-nez v3, :cond_3 */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 179 */
} // :cond_2
e.f.c.l.e.b .a ( );
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "No events present for session ID "; // const-string v0, "No events present for session ID "
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 180 */
} // :cond_3
} // :goto_2
(( e.f.c.l.e.m.v0 ) p0 ).a ( p2, v4, p3 ); // invoke-virtual {p0, p2, v4, p3}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;[Ljava/io/File;I)[Ljava/io/File;
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 181 */
/* aget-object v0, v0, v2 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
/* .line 182 */
} // :goto_3
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;Ljava/lang/String;[Ljava/io/File;Ljava/io/File;)V
/* .line 183 */
} // :goto_4
e.f.c.l.e.b .a ( );
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Removing session part files for ID "; // const-string v0, "Removing session part files for ID "
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p1 ).a ( p3 ); // invoke-virtual {p1, p3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 184 */
(( e.f.c.l.e.m.v0 ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/m/v0;->c(Ljava/lang/String;)[Ljava/io/File;
e.f.c.l.e.m.v0 .c ( p1 );
return;
} // .end method
public final void a ( java.io.File p0, java.lang.String p1, java.io.File[] p2, java.io.File p3 ) {
/* .locals 9 */
final String v0 = "Failed to close CLS file"; // const-string v0, "Failed to close CLS file"
final String v1 = "Error flushing session file stream"; // const-string v1, "Error flushing session file stream"
int v2 = 1; // const/4 v2, 0x1
if ( p4 != null) { // if-eqz p4, :cond_0
int v3 = 1; // const/4 v3, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 185 */
(( e.f.c.l.e.m.v0 ) p0 ).g ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->g()Ljava/io/File;
} // :cond_1
(( e.f.c.l.e.m.v0 ) p0 ).j ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->j()Ljava/io/File;
/* .line 186 */
} // :goto_1
v5 = (( java.io.File ) v4 ).exists ( ); // invoke-virtual {v4}, Ljava/io/File;->exists()Z
/* if-nez v5, :cond_2 */
/* .line 187 */
(( java.io.File ) v4 ).mkdirs ( ); // invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
/* .line 188 */
try { // :try_start_0
/* new-instance v6, Le/f/c/l/e/s/c; */
/* invoke-direct {v6, v4, p2}, Le/f/c/l/e/s/c;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 189 */
try { // :try_start_1
e.f.c.l.e.s.e .a ( v6 );
/* .line 190 */
e.f.c.l.e.b .a ( );
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Collecting SessionStart data for session ID "; // const-string v8, "Collecting SessionStart data for session ID "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( p2 ); // invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v4 ).a ( v7 ); // invoke-virtual {v4, v7}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 191 */
e.f.c.l.e.m.v0 .a ( v5,p1 );
int p1 = 4; // const/4 p1, 0x4
/* .line 192 */
e.f.c.l.e.m.v0 .v ( );
/* move-result-wide v7 */
(( e.f.c.l.e.s.e ) v5 ).a ( p1, v7, v8 ); // invoke-virtual {v5, p1, v7, v8}, Le/f/c/l/e/s/e;->a(IJ)V
int p1 = 5; // const/4 p1, 0x5
/* .line 193 */
(( e.f.c.l.e.s.e ) v5 ).a ( p1, v3 ); // invoke-virtual {v5, p1, v3}, Le/f/c/l/e/s/e;->a(IZ)V
/* const/16 p1, 0xb */
/* .line 194 */
(( e.f.c.l.e.s.e ) v5 ).d ( p1, v2 ); // invoke-virtual {v5, p1, v2}, Le/f/c/l/e/s/e;->d(II)V
/* const/16 p1, 0xc */
int v2 = 3; // const/4 v2, 0x3
/* .line 195 */
(( e.f.c.l.e.s.e ) v5 ).a ( p1, v2 ); // invoke-virtual {v5, p1, v2}, Le/f/c/l/e/s/e;->a(II)V
/* .line 196 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( v5, p2 ); // invoke-virtual {p0, v5, p2}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/e;Ljava/lang/String;)V
/* .line 197 */
e.f.c.l.e.m.v0 .a ( v5,p3,p2 );
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 198 */
e.f.c.l.e.m.v0 .a ( v5,p4 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 199 */
} // :cond_3
e.f.c.l.e.m.j .a ( v5,v1 );
/* .line 200 */
e.f.c.l.e.m.j .a ( v6,v0 );
/* :catch_0 */
/* move-exception p1 */
/* :catchall_0 */
/* move-exception p1 */
/* move-object v6, v5 */
/* :catch_1 */
/* move-exception p1 */
/* move-object v6, v5 */
/* .line 201 */
} // :goto_2
try { // :try_start_2
e.f.c.l.e.b .a ( );
/* new-instance p4, Ljava/lang/StringBuilder; */
/* invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Failed to write session file for session ID: "; // const-string v2, "Failed to write session file for session ID: "
(( java.lang.StringBuilder ) p4 ).append ( v2 ); // invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).append ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p4 ).toString ( ); // invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p3 ).b ( p2, p1 ); // invoke-virtual {p3, p2, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 202 */
e.f.c.l.e.m.j .a ( v5,v1 );
/* .line 203 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( v6 ); // invoke-virtual {p0, v6}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/c;)V
} // :goto_3
return;
/* :catchall_1 */
/* move-exception p1 */
/* .line 204 */
} // :goto_4
e.f.c.l.e.m.j .a ( v5,v1 );
/* .line 205 */
e.f.c.l.e.m.j .a ( v6,v0 );
/* .line 206 */
/* throw p1 */
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 6 */
/* .line 86 */
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Finalizing native report for session "; // const-string v2, "Finalizing native report for session "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 87 */
v0 = this.o;
/* .line 88 */
/* .line 89 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 90 */
v2 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
/* if-nez v2, :cond_0 */
/* .line 91 */
} // :cond_0
(( java.io.File ) v1 ).lastModified ( ); // invoke-virtual {v1}, Ljava/io/File;->lastModified()J
/* move-result-wide v1 */
/* .line 92 */
/* new-instance v3, Le/f/c/l/e/n/e; */
v4 = this.a;
v5 = this.k;
/* invoke-direct {v3, v4, v5, p1}, Le/f/c/l/e/n/e;-><init>(Landroid/content/Context;Le/f/c/l/e/n/c;Ljava/lang/String;)V */
/* .line 93 */
/* new-instance v4, Ljava/io/File; */
(( e.f.c.l.e.m.v0 ) p0 ).i ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->i()Ljava/io/File;
/* invoke-direct {v4, v5, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 94 */
v5 = (( java.io.File ) v4 ).mkdirs ( ); // invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z
/* if-nez v5, :cond_1 */
/* .line 95 */
e.f.c.l.e.b .a ( );
final String v0 = "Couldn\'t create native sessions directory"; // const-string v0, "Couldn\'t create native sessions directory"
(( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
return;
/* .line 96 */
} // :cond_1
(( e.f.c.l.e.m.v0 ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/c/l/e/m/v0;->a(J)V
/* .line 97 */
(( e.f.c.l.e.m.v0 ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;
/* .line 98 */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
/* .line 99 */
(( e.f.c.l.e.n.e ) v3 ).b ( ); // invoke-virtual {v3}, Le/f/c/l/e/n/e;->b()[B
/* .line 100 */
e.f.c.l.e.m.v0 .a ( v0,p1,v1,v2,v5 );
/* .line 101 */
e.f.c.l.e.m.v1 .a ( v4,v0 );
/* .line 102 */
v1 = this.s;
/* .line 103 */
e.f.c.l.e.m.v0 .i ( p1 );
/* .line 104 */
(( e.f.c.l.e.m.z1 ) v1 ).a ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Le/f/c/l/e/m/z1;->a(Ljava/lang/String;Ljava/util/List;)V
/* .line 105 */
(( e.f.c.l.e.n.e ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/c/l/e/n/e;->a()V
return;
/* .line 106 */
} // :cond_2
} // :goto_0
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "No minidump data found for session "; // const-string v2, "No minidump data found for session "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/b;->d(Ljava/lang/String;)V
return;
} // .end method
public final void a ( java.lang.String p0, Integer p1 ) {
/* .locals 3 */
/* .line 56 */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
/* new-instance v1, Le/f/c/l/e/m/o0; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "SessionEvent"; // const-string p1, "SessionEvent"
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, p1}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V */
p1 = e.f.c.l.e.m.v0.B;
/* .line 57 */
e.f.c.l.e.m.h2 .a ( v0,v1,p2,p1 );
return;
} // .end method
public final void a ( java.lang.String p0, Long p1 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 134 */
v0 = java.util.Locale.US;
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
/* .line 135 */
e.f.c.l.e.m.b1 .e ( );
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
final String v2 = "Crashlytics Android SDK/%s"; // const-string v2, "Crashlytics Android SDK/%s"
java.lang.String .format ( v0,v2,v1 );
/* .line 136 */
/* new-instance v1, Le/f/c/l/e/m/t; */
/* move-object v3, v1 */
/* move-object v4, p0 */
/* move-object v5, p1 */
/* move-object v6, v0 */
/* move-wide v7, p2 */
/* invoke-direct/range {v3 ..v8}, Le/f/c/l/e/m/t;-><init>(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;J)V */
final String v2 = "BeginSession"; // const-string v2, "BeginSession"
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, v2, v1 ); // invoke-virtual {p0, p1, v2, v1}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V
/* .line 137 */
v1 = this.o;
return;
} // .end method
public final void a ( java.lang.String p0, java.lang.String p1, e.f.c.l.e.m.n0 p2 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
final String v0 = "Failed to close session "; // const-string v0, "Failed to close session "
final String v1 = "Failed to flush to session "; // const-string v1, "Failed to flush to session "
final String v2 = " file."; // const-string v2, " file."
int v3 = 0; // const/4 v3, 0x0
/* .line 118 */
try { // :try_start_0
/* new-instance v4, Le/f/c/l/e/s/c; */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( p1 ); // invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v4, v5, p1}, Le/f/c/l/e/s/c;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 119 */
try { // :try_start_1
e.f.c.l.e.s.e .a ( v4 );
/* .line 120 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 121 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v3,p1 );
/* .line 122 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v4,p1 );
return;
/* :catchall_0 */
/* move-exception p1 */
/* :catchall_1 */
/* move-exception p1 */
/* move-object v4, v3 */
/* .line 123 */
} // :goto_0
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v3,p3 );
/* .line 124 */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v4,p2 );
/* .line 125 */
/* throw p1 */
} // .end method
public void a ( java.lang.Thread$UncaughtExceptionHandler p0, Object p1 ) {
/* .locals 2 */
/* .line 10 */
(( e.f.c.l.e.m.v0 ) p0 ).r ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->r()V
/* .line 11 */
/* new-instance v0, Le/f/c/l/e/m/e0; */
/* invoke-direct {v0, p0}, Le/f/c/l/e/m/e0;-><init>(Le/f/c/l/e/m/v0;)V */
/* .line 12 */
/* new-instance v1, Le/f/c/l/e/m/g1; */
/* invoke-direct {v1, v0, p2, p1}, Le/f/c/l/e/m/g1;-><init>(Le/f/c/l/e/m/f1;Le/f/c/l/e/v/f;Ljava/lang/Thread$UncaughtExceptionHandler;)V */
this.t = v1;
/* .line 13 */
java.lang.Thread .setDefaultUncaughtExceptionHandler ( v1 );
return;
} // .end method
public final void a ( java.lang.Thread p0, java.lang.Throwable p1, java.lang.String p2, Long p3 ) {
/* .locals 14 */
final String v1 = "Failed to close fatal exception file output stream."; // const-string v1, "Failed to close fatal exception file output stream."
final String v2 = "Failed to flush to session begin file."; // const-string v2, "Failed to flush to session begin file."
int v3 = 0; // const/4 v3, 0x0
/* .line 107 */
try { // :try_start_0
/* new-instance v4, Le/f/c/l/e/s/c; */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
/* move-object/from16 v6, p3 */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "SessionCrash"; // const-string v6, "SessionCrash"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v4, v0, v5}, Le/f/c/l/e/s/c;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 108 */
try { // :try_start_1
e.f.c.l.e.s.e .a ( v4 );
final String v12 = "crash"; // const-string v12, "crash"
int v13 = 1; // const/4 v13, 0x1
/* move-object v6, p0 */
/* move-object v7, v3 */
/* move-object v8, p1 */
/* move-object/from16 v9, p2 */
/* move-wide/from16 v10, p4 */
/* .line 109 */
/* invoke-virtual/range {v6 ..v13}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/s/e;Ljava/lang/Thread;Ljava/lang/Throwable;JLjava/lang/String;Z)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* :catch_0 */
/* move-exception v0 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v4, v3 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v4, v3 */
/* .line 110 */
} // :goto_0
try { // :try_start_2
e.f.c.l.e.b .a ( );
final String v6 = "An error occurred in the fatal exception logger"; // const-string v6, "An error occurred in the fatal exception logger"
(( e.f.c.l.e.b ) v5 ).b ( v6, v0 ); // invoke-virtual {v5, v6, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 111 */
} // :goto_1
e.f.c.l.e.m.j .a ( v3,v2 );
/* .line 112 */
e.f.c.l.e.m.j .a ( v4,v1 );
return;
/* :catchall_1 */
/* move-exception v0 */
/* .line 113 */
} // :goto_2
e.f.c.l.e.m.j .a ( v3,v2 );
/* .line 114 */
e.f.c.l.e.m.j .a ( v4,v1 );
/* .line 115 */
/* throw v0 */
} // .end method
public void a ( java.io.File[] p0 ) {
/* .locals 8 */
/* .line 77 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 78 */
/* array-length v1, p1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_0 */
/* aget-object v4, p1, v3 */
/* .line 79 */
e.f.c.l.e.b .a ( );
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Found invalid session part file: "; // const-string v7, "Found invalid session part file: "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v5 ).a ( v6 ); // invoke-virtual {v5, v6}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 80 */
e.f.c.l.e.m.v0 .a ( v4 );
/* add-int/lit8 v3, v3, 0x1 */
/* .line 81 */
p1 = } // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
return;
/* .line 82 */
} // :cond_1
/* new-instance p1, Le/f/c/l/e/m/s; */
/* invoke-direct {p1, p0, v0}, Le/f/c/l/e/m/s;-><init>(Le/f/c/l/e/m/v0;Ljava/util/Set;)V */
/* .line 83 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
/* array-length v0, p1 */
} // :goto_1
/* if-ge v2, v0, :cond_2 */
/* aget-object v1, p1, v2 */
/* .line 84 */
e.f.c.l.e.b .a ( );
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Deleting invalid session file: "; // const-string v5, "Deleting invalid session file: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 85 */
(( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
return;
} // .end method
public final void a ( java.io.File[] p0, Integer p1, Integer p2 ) {
/* .locals 5 */
/* .line 46 */
e.f.c.l.e.b .a ( );
final String v1 = "Closing open sessions."; // const-string v1, "Closing open sessions."
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 47 */
} // :goto_0
/* array-length v0, p1 */
/* if-ge p2, v0, :cond_0 */
/* .line 48 */
/* aget-object v0, p1, p2 */
/* .line 49 */
e.f.c.l.e.m.v0 .a ( v0 );
/* .line 50 */
e.f.c.l.e.b .a ( );
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Closing session: "; // const-string v4, "Closing session: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 51 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( v0, v1, p3 ); // invoke-virtual {p0, v0, v1, p3}, Le/f/c/l/e/m/v0;->a(Ljava/io/File;Ljava/lang/String;I)V
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_0
return;
} // .end method
public final void a ( java.io.File[] p0, java.util.Set p1 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([", */
/* "Ljava/io/File;", */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 58 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* aget-object v2, p1, v1 */
/* .line 59 */
(( java.io.File ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
/* .line 60 */
v4 = e.f.c.l.e.m.v0.C;
(( java.util.regex.Pattern ) v4 ).matcher ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/* .line 61 */
v5 = (( java.util.regex.Matcher ) v4 ).matches ( ); // invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z
/* if-nez v5, :cond_0 */
/* .line 62 */
e.f.c.l.e.b .a ( );
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Deleting unknown file: "; // const-string v6, "Deleting unknown file: "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v4 ).a ( v3 ); // invoke-virtual {v4, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 63 */
(( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
} // :cond_0
int v5 = 1; // const/4 v5, 0x1
/* .line 64 */
(( java.util.regex.Matcher ) v4 ).group ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
v4 = /* .line 65 */
/* if-nez v4, :cond_1 */
/* .line 66 */
e.f.c.l.e.b .a ( );
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Trimming session file: "; // const-string v6, "Trimming session file: "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v4 ).a ( v3 ); // invoke-virtual {v4, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 67 */
(( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
} // :cond_1
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
return;
} // .end method
public final java.io.File a ( java.io.FilenameFilter p0 ) {
/* .locals 1 */
/* .line 54 */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
e.f.c.l.e.m.v0 .a ( v0,p1 );
} // .end method
public final java.io.File a ( java.lang.String p0, java.io.File[] p1, Integer p2 ) {
/* .locals 4 */
/* .line 68 */
/* array-length v0, p2 */
/* if-le v0, p3, :cond_0 */
/* .line 69 */
e.f.c.l.e.b .a ( );
v0 = java.util.Locale.US;
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* .line 70 */
java.lang.Integer .valueOf ( p3 );
/* aput-object v3, v1, v2 */
final String v2 = "Trimming down to %d logged exceptions."; // const-string v2, "Trimming down to %d logged exceptions."
/* .line 71 */
java.lang.String .format ( v0,v2,v1 );
/* .line 72 */
(( e.f.c.l.e.b ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 73 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;I)V
/* .line 74 */
/* new-instance p2, Le/f/c/l/e/m/o0; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "SessionEvent"; // const-string p1, "SessionEvent"
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Le/f/c/l/e/m/o0;-><init>(Ljava/lang/String;)V */
/* .line 75 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
} // :cond_0
} // .end method
public final e.f.a.b.h.g b ( Long p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(J)", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 17 */
v0 = e.f.c.l.e.m.v0 .u ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 18 */
e.f.c.l.e.b .a ( );
final String p2 = "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"; // const-string p2, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"
(( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 19 */
e.f.a.b.h.n .a ( p1 );
/* .line 20 */
} // :cond_0
/* new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V */
/* .line 21 */
/* new-instance v1, Le/f/c/l/e/m/a0; */
/* invoke-direct {v1, p0, p1, p2}, Le/f/c/l/e/m/a0;-><init>(Le/f/c/l/e/m/v0;J)V */
e.f.a.b.h.n .a ( v0,v1 );
} // .end method
public final e.f.c.l.e.m.b2 b ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 14 */
v0 = (( e.f.c.l.e.m.v0 ) p0 ).k ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 15 */
p1 = this.d;
/* .line 16 */
} // :cond_0
/* new-instance v0, Le/f/c/l/e/m/t1; */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
/* invoke-direct {v0, v1}, Le/f/c/l/e/m/t1;-><init>(Ljava/io/File;)V */
(( e.f.c.l.e.m.t1 ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/m/t1;->c(Ljava/lang/String;)Le/f/c/l/e/m/b2;
} // :goto_0
} // .end method
public final e.f.c.l.e.t.c b ( ) {
/* .locals 1 */
/* .line 3 */
/* new-instance v0, Le/f/c/l/e/m/l0; */
/* invoke-direct {v0, p0}, Le/f/c/l/e/m/l0;-><init>(Le/f/c/l/e/m/v0;)V */
} // .end method
public Boolean b ( Integer p0 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.e;
(( e.f.c.l.e.m.o ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/o;->a()V
/* .line 5 */
v0 = (( e.f.c.l.e.m.v0 ) p0 ).k ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->k()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
e.f.c.l.e.b .a ( );
final String v0 = "Skipping session finalization because a crash has already occurred."; // const-string v0, "Skipping session finalization because a crash has already occurred."
(( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 7 */
p1 = java.lang.Boolean.FALSE;
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
/* .line 8 */
} // :cond_0
e.f.c.l.e.b .a ( );
final String v1 = "Finalizing previously open sessions."; // const-string v1, "Finalizing previously open sessions."
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
int v0 = 1; // const/4 v0, 0x1
/* .line 9 */
try { // :try_start_0
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/m/v0;->a(IZ)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 10 */
e.f.c.l.e.b .a ( );
final String v1 = "Closed all previously open sessions"; // const-string v1, "Closed all previously open sessions"
(( e.f.c.l.e.b ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* :catch_0 */
/* move-exception p1 */
/* .line 11 */
e.f.c.l.e.b .a ( );
final String v1 = "Unable to finalize previously open sessions."; // const-string v1, "Unable to finalize previously open sessions."
(( e.f.c.l.e.b ) v0 ).b ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void c ( Integer p0 ) {
/* .locals 4 */
/* .line 9 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 10 */
(( e.f.c.l.e.m.v0 ) p0 ).p ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->p()[Ljava/io/File;
/* .line 11 */
/* array-length v2, v1 */
p1 = java.lang.Math .min ( p1,v2 );
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, p1, :cond_0 */
/* .line 12 */
/* aget-object v3, v1, v2 */
e.f.c.l.e.m.v0 .a ( v3 );
/* .line 13 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 14 */
} // :cond_0
p1 = this.l;
(( e.f.c.l.e.n.e ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/n/e;->a(Ljava/util/Set;)V
/* .line 15 */
/* new-instance p1, Le/f/c/l/e/m/m0; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p1, v1}, Le/f/c/l/e/m/m0;-><init>(Le/f/c/l/e/m/w;)V */
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/m/v0;->a([Ljava/io/File;Ljava/util/Set;)V
return;
} // .end method
public Boolean c ( ) {
/* .locals 2 */
/* .line 2 */
v0 = this.c;
v0 = (( e.f.c.l.e.m.c1 ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/c1;->c()Z
/* if-nez v0, :cond_1 */
/* .line 3 */
(( e.f.c.l.e.m.v0 ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->f()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v0 = v1 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 5 */
} // :cond_1
e.f.c.l.e.b .a ( );
final String v1 = "Found previous crash marker."; // const-string v1, "Found previous crash marker."
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 6 */
v0 = this.c;
(( e.f.c.l.e.m.c1 ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/c1;->d()Z
/* .line 7 */
v0 = java.lang.Boolean.TRUE;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
} // .end method
public final java.io.File c ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 8 */
/* new-instance v0, Le/f/c/l/e/m/u0; */
/* invoke-direct {v0, p1}, Le/f/c/l/e/m/u0;-><init>(Ljava/lang/String;)V */
(( e.f.c.l.e.m.v0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
} // .end method
public final void d ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 2 */
e.f.c.l.e.m.v0 .v ( );
/* move-result-wide v0 */
/* .line 3 */
/* new-instance v2, Le/f/c/l/e/m/g; */
v3 = this.g;
/* invoke-direct {v2, v3}, Le/f/c/l/e/m/g;-><init>(Le/f/c/l/e/m/q1;)V */
(( e.f.c.l.e.m.g ) v2 ).toString ( ); // invoke-virtual {v2}, Le/f/c/l/e/m/g;->toString()Ljava/lang/String;
/* .line 4 */
e.f.c.l.e.b .a ( );
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Opening a new session with ID "; // const-string v5, "Opening a new session with ID "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 5 */
v3 = this.o;
/* .line 6 */
(( e.f.c.l.e.m.v0 ) p0 ).a ( v2, v0, v1 ); // invoke-virtual {p0, v2, v0, v1}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;J)V
/* .line 7 */
(( e.f.c.l.e.m.v0 ) p0 ).d ( v2 ); // invoke-virtual {p0, v2}, Le/f/c/l/e/m/v0;->d(Ljava/lang/String;)V
/* .line 8 */
(( e.f.c.l.e.m.v0 ) p0 ).f ( v2 ); // invoke-virtual {p0, v2}, Le/f/c/l/e/m/v0;->f(Ljava/lang/String;)V
/* .line 9 */
(( e.f.c.l.e.m.v0 ) p0 ).e ( v2 ); // invoke-virtual {p0, v2}, Le/f/c/l/e/m/v0;->e(Ljava/lang/String;)V
/* .line 10 */
v3 = this.l;
(( e.f.c.l.e.n.e ) v3 ).b ( v2 ); // invoke-virtual {v3, v2}, Le/f/c/l/e/n/e;->b(Ljava/lang/String;)V
/* .line 11 */
v3 = this.s;
/* .line 12 */
e.f.c.l.e.m.v0 .i ( v2 );
/* .line 13 */
(( e.f.c.l.e.m.z1 ) v3 ).a ( v2, v0, v1 ); // invoke-virtual {v3, v2, v0, v1}, Le/f/c/l/e/m/z1;->a(Ljava/lang/String;J)V
return;
} // .end method
public void d ( Integer p0 ) {
/* .locals 3 */
/* .line 14 */
(( e.f.c.l.e.m.v0 ) p0 ).i ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->i()Ljava/io/File;
/* .line 15 */
(( e.f.c.l.e.m.v0 ) p0 ).g ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->g()Ljava/io/File;
v2 = e.f.c.l.e.m.v0.B;
/* .line 16 */
v0 = e.f.c.l.e.m.h2 .a ( v0,v1,p1,v2 );
/* sub-int/2addr p1, v0 */
/* .line 17 */
(( e.f.c.l.e.m.v0 ) p0 ).j ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->j()Ljava/io/File;
v1 = e.f.c.l.e.m.v0.B;
v0 = e.f.c.l.e.m.h2 .a ( v0,p1,v1 );
/* sub-int/2addr p1, v0 */
/* .line 18 */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
v1 = e.f.c.l.e.m.v0.z;
v2 = e.f.c.l.e.m.v0.B;
e.f.c.l.e.m.h2 .a ( v0,v1,p1,v2 );
return;
} // .end method
public final void d ( java.lang.String p0 ) {
/* .locals 13 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 19 */
v0 = this.g;
(( e.f.c.l.e.m.q1 ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/q1;->b()Ljava/lang/String;
/* .line 20 */
v1 = this.i;
v8 = this.e;
/* .line 21 */
v9 = this.f;
/* .line 22 */
v1 = this.g;
(( e.f.c.l.e.m.q1 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/m/q1;->a()Ljava/lang/String;
/* .line 23 */
v1 = this.i;
v1 = this.c;
/* .line 24 */
e.f.c.l.e.m.k1 .a ( v1 );
v11 = (( e.f.c.l.e.m.k1 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/m/k1;->a()I
/* .line 25 */
/* new-instance v12, Le/f/c/l/e/m/u; */
/* move-object v1, v12 */
/* move-object v2, p0 */
/* move-object v3, v0 */
/* move-object v4, v8 */
/* move-object v5, v9 */
/* move-object v6, v10 */
/* move v7, v11 */
/* invoke-direct/range {v1 ..v7}, Le/f/c/l/e/m/u;-><init>(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V */
final String v1 = "SessionApp"; // const-string v1, "SessionApp"
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, v1, v12 ); // invoke-virtual {p0, p1, v1, v12}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V
/* .line 26 */
v1 = this.o;
v12 = this.q;
/* move-object v2, p1 */
/* move-object v8, v12 */
/* invoke-interface/range {v1 ..v8}, Le/f/c/l/e/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V */
return;
} // .end method
public final android.content.Context e ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.a;
} // .end method
public final void e ( java.lang.String p0 ) {
/* .locals 27 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* move-object/from16 v13, p0 */
/* .line 3 */
/* invoke-virtual/range {p0 ..p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context; */
/* .line 4 */
/* new-instance v1, Landroid/os/StatFs; */
android.os.Environment .getDataDirectory ( );
(( java.io.File ) v2 ).getPath ( ); // invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;
/* invoke-direct {v1, v2}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V */
/* .line 5 */
v16 = e.f.c.l.e.m.j .a ( );
/* .line 6 */
v17 = android.os.Build.MODEL;
/* .line 7 */
java.lang.Runtime .getRuntime ( );
v18 = (( java.lang.Runtime ) v2 ).availableProcessors ( ); // invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I
/* .line 8 */
e.f.c.l.e.m.j .b ( );
/* move-result-wide v19 */
/* .line 9 */
v2 = (( android.os.StatFs ) v1 ).getBlockCount ( ); // invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCount()I
/* int-to-long v2, v2 */
v1 = (( android.os.StatFs ) v1 ).getBlockSize ( ); // invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSize()I
/* int-to-long v4, v1 */
/* mul-long v21, v2, v4 */
/* .line 10 */
v23 = e.f.c.l.e.m.j .i ( v0 );
/* .line 11 */
v24 = e.f.c.l.e.m.j .c ( v0 );
/* .line 12 */
v25 = android.os.Build.MANUFACTURER;
/* .line 13 */
v26 = android.os.Build.PRODUCT;
/* .line 14 */
/* new-instance v14, Le/f/c/l/e/m/x; */
/* move-object v0, v14 */
/* move-object/from16 v1, p0 */
/* move/from16 v2, v16 */
/* move-object/from16 v3, v17 */
/* move/from16 v4, v18 */
/* move-wide/from16 v5, v19 */
/* move-wide/from16 v7, v21 */
/* move/from16 v9, v23 */
/* move/from16 v10, v24 */
/* move-object/from16 v11, v25 */
/* move-object/from16 v12, v26 */
/* invoke-direct/range {v0 ..v12}, Le/f/c/l/e/m/x;-><init>(Le/f/c/l/e/m/v0;ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)V */
final String v0 = "SessionDevice"; // const-string v0, "SessionDevice"
/* move-object/from16 v1, p1 */
(( e.f.c.l.e.m.v0 ) v13 ).a ( v1, v0, v14 ); // invoke-virtual {v13, v1, v0, v14}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V
/* .line 15 */
v14 = this.o;
/* move-object/from16 v15, p1 */
/* invoke-interface/range {v14 ..v26}, Le/f/c/l/e/a;->a(Ljava/lang/String;ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)V */
return;
} // .end method
public final java.lang.String f ( ) {
/* .locals 2 */
/* .line 2 */
(( e.f.c.l.e.m.v0 ) p0 ).p ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->p()[Ljava/io/File;
/* .line 3 */
/* array-length v1, v0 */
/* if-lez v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 4 */
/* aget-object v0, v0, v1 */
e.f.c.l.e.m.v0 .a ( v0 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final void f ( java.lang.String p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 5 */
v0 = android.os.Build$VERSION.RELEASE;
/* .line 6 */
v1 = android.os.Build$VERSION.CODENAME;
/* .line 7 */
(( e.f.c.l.e.m.v0 ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->e()Landroid/content/Context;
v2 = e.f.c.l.e.m.j .j ( v2 );
/* .line 8 */
/* new-instance v3, Le/f/c/l/e/m/v; */
/* invoke-direct {v3, p0, v0, v1, v2}, Le/f/c/l/e/m/v;-><init>(Le/f/c/l/e/m/v0;Ljava/lang/String;Ljava/lang/String;Z)V */
final String v4 = "SessionOS"; // const-string v4, "SessionOS"
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, v4, v3 ); // invoke-virtual {p0, p1, v4, v3}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V
/* .line 9 */
v3 = this.o;
return;
} // .end method
public java.io.File g ( ) {
/* .locals 3 */
/* .line 4 */
/* new-instance v0, Ljava/io/File; */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
final String v2 = "fatal-sessions"; // const-string v2, "fatal-sessions"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public final void g ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 2 */
(( e.f.c.l.e.m.v0 ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/v0;->b(Ljava/lang/String;)Le/f/c/l/e/m/b2;
/* .line 3 */
/* new-instance v1, Le/f/c/l/e/m/y; */
/* invoke-direct {v1, p0, v0}, Le/f/c/l/e/m/y;-><init>(Le/f/c/l/e/m/v0;Le/f/c/l/e/m/b2;)V */
final String v0 = "SessionUser"; // const-string v0, "SessionUser"
(( e.f.c.l.e.m.v0 ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/n0;)V
return;
} // .end method
public java.io.File h ( ) {
/* .locals 1 */
/* .line 3 */
v0 = this.h;
} // .end method
public java.io.File i ( ) {
/* .locals 3 */
/* .line 3 */
/* new-instance v0, Ljava/io/File; */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
final String v2 = "native-sessions"; // const-string v2, "native-sessions"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public java.io.File j ( ) {
/* .locals 3 */
/* .line 2 */
/* new-instance v0, Ljava/io/File; */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
final String v2 = "nonfatal-sessions"; // const-string v2, "nonfatal-sessions"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public Boolean k ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.t;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( e.f.c.l.e.m.g1 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/g1;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.io.File l ( ) {
/* .locals 1 */
/* .line 2 */
v0 = e.f.c.l.e.m.v0.y;
(( e.f.c.l.e.m.v0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
} // .end method
public java.io.File m ( ) {
/* .locals 3 */
/* .line 2 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
/* .line 3 */
(( e.f.c.l.e.m.v0 ) p0 ).g ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->g()Ljava/io/File;
v2 = e.f.c.l.e.m.v0.z;
e.f.c.l.e.m.v0 .a ( v1,v2 );
/* .line 4 */
java.util.Collections .addAll ( v0,v1 );
/* .line 5 */
(( e.f.c.l.e.m.v0 ) p0 ).j ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->j()Ljava/io/File;
v2 = e.f.c.l.e.m.v0.z;
e.f.c.l.e.m.v0 .a ( v1,v2 );
/* .line 6 */
java.util.Collections .addAll ( v0,v1 );
/* .line 7 */
(( e.f.c.l.e.m.v0 ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->h()Ljava/io/File;
v2 = e.f.c.l.e.m.v0.z;
e.f.c.l.e.m.v0 .a ( v1,v2 );
java.util.Collections .addAll ( v0,v1 );
v1 = /* .line 8 */
/* new-array v1, v1, [Ljava/io/File; */
/* check-cast v0, [Ljava/io/File; */
} // .end method
public java.io.File n ( ) {
/* .locals 1 */
/* .line 1 */
(( e.f.c.l.e.m.v0 ) p0 ).i ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->i()Ljava/io/File;
(( java.io.File ) v0 ).listFiles ( ); // invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
e.f.c.l.e.m.v0 .d ( v0 );
} // .end method
public java.io.File o ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.f.c.l.e.m.v0.x;
(( e.f.c.l.e.m.v0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/v0;->a(Ljava/io/FilenameFilter;)[Ljava/io/File;
} // .end method
public final java.io.File p ( ) {
/* .locals 2 */
/* .line 1 */
(( e.f.c.l.e.m.v0 ) p0 ).o ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->o()[Ljava/io/File;
/* .line 2 */
v1 = e.f.c.l.e.m.v0.A;
java.util.Arrays .sort ( v0,v1 );
} // .end method
public final e.f.a.b.h.g q ( ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
(( e.f.c.l.e.m.v0 ) p0 ).l ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/v0;->l()[Ljava/io/File;
/* .line 3 */
/* array-length v2, v1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_0 */
/* aget-object v4, v1, v3 */
/* .line 4 */
try { // :try_start_0
(( java.io.File ) v4 ).getName ( ); // invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;
int v6 = 3; // const/4 v6, 0x3
(( java.lang.String ) v5 ).substring ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
java.lang.Long .parseLong ( v5 );
/* move-result-wide v5 */
/* .line 5 */
(( e.f.c.l.e.m.v0 ) p0 ).b ( v5, v6 ); // invoke-virtual {p0, v5, v6}, Le/f/c/l/e/m/v0;->b(J)Le/f/a/b/h/g;
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 6 */
/* :catch_0 */
e.f.c.l.e.b .a ( );
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Could not parse timestamp from file "; // const-string v7, "Could not parse timestamp from file "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) v4 ).getName ( ); // invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v5 ).a ( v6 ); // invoke-virtual {v5, v6}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 7 */
} // :goto_1
(( java.io.File ) v4 ).delete ( ); // invoke-virtual {v4}, Ljava/io/File;->delete()Z
/* add-int/lit8 v3, v3, 0x1 */
/* .line 8 */
} // :cond_0
e.f.a.b.h.n .a ( v0 );
} // .end method
public void r ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
/* new-instance v1, Le/f/c/l/e/m/q; */
/* invoke-direct {v1, p0}, Le/f/c/l/e/m/q;-><init>(Le/f/c/l/e/m/v0;)V */
(( e.f.c.l.e.m.o ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/m/o;->b(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;
return;
} // .end method
public final e.f.a.b.h.g s ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v0 = (( e.f.c.l.e.m.i1 ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/i1;->b()Z
int v1 = 1; // const/4 v1, 0x1
/* .line 2 */
java.lang.Boolean .valueOf ( v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
e.f.c.l.e.b .a ( );
final String v2 = "Automatic data collection is enabled.Allowing upload."; // const-string v2, "Automatic data collection is enabled.Allowing upload."
(( e.f.c.l.e.b ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 4 */
v0 = this.u;
int v2 = 0; // const/4 v2, 0x0
java.lang.Boolean .valueOf ( v2 );
(( e.f.a.b.h.h ) v0 ).b ( v2 ); // invoke-virtual {v0, v2}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
/* .line 5 */
e.f.a.b.h.n .a ( v1 );
/* .line 6 */
} // :cond_0
e.f.c.l.e.b .a ( );
final String v2 = "Automatic data collection is disabled."; // const-string v2, "Automatic data collection is disabled."
(( e.f.c.l.e.b ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 7 */
e.f.c.l.e.b .a ( );
final String v2 = "Notifying that unsent reports are available."; // const-string v2, "Notifying that unsent reports are available."
(( e.f.c.l.e.b ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 8 */
v0 = this.u;
(( e.f.a.b.h.h ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
/* .line 9 */
v0 = this.b;
/* .line 10 */
(( e.f.c.l.e.m.i1 ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/i1;->c()Le/f/a/b/h/g;
/* new-instance v1, Le/f/c/l/e/m/h0; */
/* invoke-direct {v1, p0}, Le/f/c/l/e/m/h0;-><init>(Le/f/c/l/e/m/v0;)V */
/* .line 11 */
(( e.f.a.b.h.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/f;)Le/f/a/b/h/g;
/* .line 12 */
e.f.c.l.e.b .a ( );
final String v2 = "Waiting for send/deleteUnsentReports to be called."; // const-string v2, "Waiting for send/deleteUnsentReports to be called."
(( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 13 */
v1 = this.v;
(( e.f.a.b.h.h ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
e.f.c.l.e.m.h2 .a ( v0,v1 );
} // .end method
