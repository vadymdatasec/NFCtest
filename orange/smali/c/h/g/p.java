public class c.h.g.p {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.concurrent.ConcurrentHashMap a;
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "BanConcurrentHashMap" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Ljava/lang/Long;", */
/* "Lc/h/f/i/f;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.h.g.p ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.a = v0;
return;
} // .end method
public static java.lang.Object a ( java.lang.Object[] p0, Integer p1, Object p2 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">([TT;I", */
/* "Lc/h/g/o<", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* and-int/lit8 v0, p1, 0x1 */
/* if-nez v0, :cond_0 */
/* const/16 v0, 0x190 */
} // :cond_0
/* const/16 v0, 0x2bc */
} // :goto_0
/* and-int/lit8 p1, p1, 0x2 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
if ( p1 != null) { // if-eqz p1, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_1
int v3 = 0; // const/4 v3, 0x0
/* const v4, 0x7fffffff */
/* .line 1 */
/* array-length v5, p0 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_2
/* if-ge v6, v5, :cond_5 */
/* aget-object v7, p0, v6 */
v8 = /* .line 2 */
/* sub-int/2addr v8, v0 */
v8 = java.lang.Math .abs ( v8 );
/* mul-int/lit8 v8, v8, 0x2 */
v9 = /* .line 3 */
/* if-ne v9, p1, :cond_2 */
int v9 = 0; // const/4 v9, 0x0
} // :cond_2
int v9 = 1; // const/4 v9, 0x1
} // :goto_3
/* add-int/2addr v8, v9 */
if ( v3 != null) { // if-eqz v3, :cond_3
/* if-le v4, v8, :cond_4 */
} // :cond_3
/* move-object v3, v7 */
/* move v4, v8 */
} // :cond_4
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_5
} // .end method
public static Long b ( android.graphics.Typeface p0 ) {
/* .locals 6 */
final String v0 = "Could not retrieve font from family."; // const-string v0, "Could not retrieve font from family."
final String v1 = "TypefaceCompatBaseImpl"; // const-string v1, "TypefaceCompatBaseImpl"
/* const-wide/16 v2, 0x0 */
/* if-nez p0, :cond_0 */
/* return-wide v2 */
/* .line 1 */
} // :cond_0
try { // :try_start_0
/* const-class v4, Landroid/graphics/Typeface; */
final String v5 = "native_instance"; // const-string v5, "native_instance"
(( java.lang.Class ) v4 ).getDeclaredField ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
int v5 = 1; // const/4 v5, 0x1
/* .line 2 */
(( java.lang.reflect.Field ) v4 ).setAccessible ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* .line 3 */
(( java.lang.reflect.Field ) v4 ).get ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Number; */
/* .line 4 */
(( java.lang.Number ) p0 ).longValue ( ); // invoke-virtual {p0}, Ljava/lang/Number;->longValue()J
/* move-result-wide v0 */
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* return-wide v0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 5 */
android.util.Log .e ( v1,v0,p0 );
/* return-wide v2 */
/* :catch_1 */
/* move-exception p0 */
/* .line 6 */
android.util.Log .e ( v1,v0,p0 );
/* return-wide v2 */
} // .end method
/* # virtual methods */
public android.graphics.Typeface a ( android.content.Context p0, android.content.res.Resources p1, Integer p2, java.lang.String p3, Integer p4 ) {
/* .locals 0 */
/* .line 24 */
c.h.g.q .a ( p1 );
int p4 = 0; // const/4 p4, 0x0
/* if-nez p1, :cond_0 */
/* .line 25 */
} // :cond_0
try { // :try_start_0
p2 = c.h.g.q .a ( p1,p2,p3 );
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez p2, :cond_1 */
/* .line 26 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* .line 27 */
} // :cond_1
try { // :try_start_1
(( java.io.File ) p1 ).getPath ( ); // invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;
android.graphics.Typeface .createFromFile ( p2 );
/* :try_end_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 28 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* :catchall_0 */
/* move-exception p2 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* .line 29 */
/* throw p2 */
/* .line 30 */
/* :catch_0 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, android.os.CancellationSignal p1, Object[] p2, Integer p3 ) {
/* .locals 2 */
/* .line 12 */
/* array-length p2, p3 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* if-ge p2, v1, :cond_0 */
/* .line 13 */
} // :cond_0
(( c.h.g.p ) p0 ).a ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Lc/h/g/p;->a([Lc/h/k/o;I)Lc/h/k/o;
/* .line 14 */
try { // :try_start_0
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
(( c.h.k.o ) p2 ).c ( ); // invoke-virtual {p2}, Lc/h/k/o;->c()Landroid/net/Uri;
(( android.content.ContentResolver ) p3 ).openInputStream ( p2 ); // invoke-virtual {p3, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 15 */
try { // :try_start_1
(( c.h.g.p ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/h/g/p;->a(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 16 */
c.h.g.q .a ( p2 );
/* :catchall_0 */
/* move-exception p1 */
/* move-object v0, p2 */
/* :catchall_1 */
/* move-exception p1 */
} // :goto_0
c.h.g.q .a ( v0 );
/* .line 17 */
/* throw p1 */
/* :catch_0 */
/* move-object p2, v0 */
/* .line 18 */
/* :catch_1 */
c.h.g.q .a ( p2 );
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, Object p1, android.content.res.Resources p2, Integer p3 ) {
/* .locals 2 */
/* .line 20 */
(( c.h.g.p ) p0 ).a ( p2, p4 ); // invoke-virtual {p0, p2, p4}, Lc/h/g/p;->a(Lc/h/f/i/f;I)Lc/h/f/i/g;
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 21 */
} // :cond_0
v1 = (( c.h.f.i.g ) v0 ).b ( ); // invoke-virtual {v0}, Lc/h/f/i/g;->b()I
(( c.h.f.i.g ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/f/i/g;->a()Ljava/lang/String;
/* .line 22 */
c.h.g.g .a ( p1,p3,v1,v0,p4 );
/* .line 23 */
(( c.h.g.p ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/h/g/p;->a(Landroid/graphics/Typeface;Lc/h/f/i/f;)V
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, java.io.InputStream p1 ) {
/* .locals 1 */
/* .line 5 */
c.h.g.q .a ( p1 );
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 6 */
} // :cond_0
try { // :try_start_0
p2 = c.h.g.q .a ( p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez p2, :cond_1 */
/* .line 7 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* .line 8 */
} // :cond_1
try { // :try_start_1
(( java.io.File ) p1 ).getPath ( ); // invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;
android.graphics.Typeface .createFromFile ( p2 );
/* :try_end_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 9 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* :catchall_0 */
/* move-exception p2 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
/* .line 10 */
/* throw p2 */
/* .line 11 */
/* :catch_0 */
(( java.io.File ) p1 ).delete ( ); // invoke-virtual {p1}, Ljava/io/File;->delete()Z
} // .end method
public c.h.f.i.f a ( android.graphics.Typeface p0 ) {
/* .locals 4 */
/* .line 31 */
c.h.g.p .b ( p1 );
/* move-result-wide v0 */
/* const-wide/16 v2, 0x0 */
/* cmp-long p1, v0, v2 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 32 */
} // :cond_0
p1 = this.a;
java.lang.Long .valueOf ( v0,v1 );
(( java.util.concurrent.ConcurrentHashMap ) p1 ).get ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/h/f/i/f; */
} // .end method
public final c.h.f.i.g a ( Object p0, Integer p1 ) {
/* .locals 1 */
/* .line 19 */
(( c.h.f.i.f ) p1 ).a ( ); // invoke-virtual {p1}, Lc/h/f/i/f;->a()[Lc/h/f/i/g;
/* new-instance v0, Lc/h/g/n; */
/* invoke-direct {v0, p0}, Lc/h/g/n;-><init>(Lc/h/g/p;)V */
c.h.g.p .a ( p1,p2,v0 );
/* check-cast p1, Lc/h/f/i/g; */
} // .end method
public c.h.k.o a ( Object[] p0, Integer p1 ) {
/* .locals 1 */
/* .line 4 */
/* new-instance v0, Lc/h/g/m; */
/* invoke-direct {v0, p0}, Lc/h/g/m;-><init>(Lc/h/g/p;)V */
c.h.g.p .a ( p1,p2,v0 );
/* check-cast p1, Lc/h/k/o; */
} // .end method
public final void a ( android.graphics.Typeface p0, Object p1 ) {
/* .locals 4 */
/* .line 33 */
c.h.g.p .b ( p1 );
/* move-result-wide v0 */
/* const-wide/16 v2, 0x0 */
/* cmp-long p1, v0, v2 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 34 */
p1 = this.a;
java.lang.Long .valueOf ( v0,v1 );
(( java.util.concurrent.ConcurrentHashMap ) p1 ).put ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
return;
} // .end method
