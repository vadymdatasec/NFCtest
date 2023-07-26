public class c.h.g.h extends c.h.g.p {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.Class b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public static java.lang.reflect.Constructor c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/reflect/Constructor<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public static java.lang.reflect.Method d;
public static java.lang.reflect.Method e;
public static Boolean f;
/* # direct methods */
public static c.h.g.h ( ) {
/* .locals 0 */
return;
} // .end method
public c.h.g.h ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lc/h/g/p;-><init>()V */
return;
} // .end method
public static android.graphics.Typeface a ( java.lang.Object p0 ) {
/* .locals 4 */
/* .line 18 */
c.h.g.h .a ( );
/* .line 19 */
try { // :try_start_0
v0 = c.h.g.h.b;
int v1 = 1; // const/4 v1, 0x1
java.lang.reflect.Array .newInstance ( v0,v1 );
int v2 = 0; // const/4 v2, 0x0
/* .line 20 */
java.lang.reflect.Array .set ( v0,v2,p0 );
/* .line 21 */
p0 = c.h.g.h.e;
int v3 = 0; // const/4 v3, 0x0
/* new-array v1, v1, [Ljava/lang/Object; */
/* aput-object v0, v1, v2 */
(( java.lang.reflect.Method ) p0 ).invoke ( v3, v1 ); // invoke-virtual {p0, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Landroid/graphics/Typeface; */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* :catch_1 */
/* move-exception p0 */
/* .line 22 */
} // :goto_0
/* new-instance v0, Ljava/lang/RuntimeException; */
/* invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public static void a ( ) {
/* .locals 9 */
/* .line 1 */
/* sget-boolean v0, Lc/h/g/h;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
c.h.g.h.f = (v0!= 0);
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
final String v2 = "android.graphics.FontFamily"; // const-string v2, "android.graphics.FontFamily"
/* .line 3 */
java.lang.Class .forName ( v2 );
int v3 = 0; // const/4 v3, 0x0
/* new-array v4, v3, [Ljava/lang/Class; */
/* .line 4 */
(( java.lang.Class ) v2 ).getConstructor ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
final String v5 = "addFontWeightStyle"; // const-string v5, "addFontWeightStyle"
int v6 = 3; // const/4 v6, 0x3
/* new-array v6, v6, [Ljava/lang/Class; */
/* .line 5 */
/* const-class v7, Ljava/lang/String; */
/* aput-object v7, v6, v3 */
v7 = java.lang.Integer.TYPE;
/* aput-object v7, v6, v0 */
int v7 = 2; // const/4 v7, 0x2
v8 = java.lang.Boolean.TYPE;
/* aput-object v8, v6, v7 */
(( java.lang.Class ) v2 ).getMethod ( v5, v6 ); // invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 6 */
java.lang.reflect.Array .newInstance ( v2,v0 );
/* .line 7 */
/* const-class v7, Landroid/graphics/Typeface; */
final String v8 = "createFromFamiliesWithDefault"; // const-string v8, "createFromFamiliesWithDefault"
/* new-array v0, v0, [Ljava/lang/Class; */
/* .line 8 */
(( java.lang.Object ) v6 ).getClass ( ); // invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* aput-object v6, v0, v3 */
/* .line 9 */
(( java.lang.Class ) v7 ).getMethod ( v8, v0 ); // invoke-virtual {v7, v8, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v0, v1 */
/* move-object v1, v4 */
/* :catch_0 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
/* .line 10 */
} // :goto_0
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
final String v3 = "TypefaceCompatApi21Impl"; // const-string v3, "TypefaceCompatApi21Impl"
android.util.Log .e ( v3,v2,v0 );
/* move-object v0, v1 */
/* move-object v2, v0 */
/* move-object v5, v2 */
/* .line 11 */
} // :goto_1
/* .line 12 */
/* .line 13 */
/* .line 14 */
return;
} // .end method
public static Boolean a ( java.lang.Object p0, java.lang.String p1, Integer p2, Boolean p3 ) {
/* .locals 3 */
/* .line 23 */
c.h.g.h .a ( );
/* .line 24 */
try { // :try_start_0
v0 = c.h.g.h.d;
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
int p1 = 1; // const/4 p1, 0x1
/* .line 25 */
java.lang.Integer .valueOf ( p2 );
/* aput-object p2, v1, p1 */
int p1 = 2; // const/4 p1, 0x2
java.lang.Boolean .valueOf ( p3 );
/* aput-object p2, v1, p1 */
/* .line 26 */
(( java.lang.reflect.Method ) v0 ).invoke ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Boolean; */
/* .line 27 */
p0 = (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* :catch_1 */
/* move-exception p0 */
/* .line 28 */
} // :goto_0
/* new-instance p1, Ljava/lang/RuntimeException; */
/* invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw p1 */
} // .end method
public static java.lang.Object b ( ) {
/* .locals 2 */
/* .line 1 */
c.h.g.h .a ( );
/* .line 2 */
try { // :try_start_0
v0 = c.h.g.h.c;
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Object; */
(( java.lang.reflect.Constructor ) v0 ).newInstance ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
/* :catch_2 */
/* move-exception v0 */
/* .line 3 */
} // :goto_0
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
/* # virtual methods */
public android.graphics.Typeface a ( android.content.Context p0, android.os.CancellationSignal p1, Object[] p2, Integer p3 ) {
/* .locals 3 */
/* .line 29 */
/* array-length v0, p3 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-ge v0, v2, :cond_0 */
/* .line 30 */
} // :cond_0
(( c.h.g.p ) p0 ).a ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Lc/h/g/p;->a([Lc/h/k/o;I)Lc/h/k/o;
/* .line 31 */
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
/* .line 32 */
try { // :try_start_0
(( c.h.k.o ) p3 ).c ( ); // invoke-virtual {p3}, Lc/h/k/o;->c()Landroid/net/Uri;
final String v0 = "r"; // const-string v0, "r"
(( android.content.ContentResolver ) p4 ).openFileDescriptor ( p3, v0, p2 ); // invoke-virtual {p4, p3, v0, p2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
/* if-nez p2, :cond_2 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 33 */
(( android.os.ParcelFileDescriptor ) p2 ).close ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_1
/* .line 34 */
} // :cond_2
try { // :try_start_1
(( c.h.g.h ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/h/g/h;->a(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 35 */
p4 = (( java.io.File ) p3 ).canRead ( ); // invoke-virtual {p3}, Ljava/io/File;->canRead()Z
/* if-nez p4, :cond_3 */
/* .line 36 */
} // :cond_3
android.graphics.Typeface .createFromFile ( p3 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 37 */
try { // :try_start_2
(( android.os.ParcelFileDescriptor ) p2 ).close ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
} // :cond_4
/* .line 38 */
} // :cond_5
} // :goto_0
try { // :try_start_3
/* new-instance p3, Ljava/io/FileInputStream; */
(( android.os.ParcelFileDescriptor ) p2 ).getFileDescriptor ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
/* invoke-direct {p3, p4}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
/* .line 39 */
try { // :try_start_4
/* invoke-super {p0, p1, p3}, Lc/h/g/p;->a(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface; */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 40 */
try { // :try_start_5
(( java.io.FileInputStream ) p3 ).close ( ); // invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 41 */
try { // :try_start_6
	 (( android.os.ParcelFileDescriptor ) p2 ).close ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
	 /* :try_end_6 */
	 /* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_0 */
} // :cond_6
/* :catchall_0 */
/* move-exception p1 */
/* .line 42 */
try { // :try_start_7
	 (( java.io.FileInputStream ) p3 ).close ( ); // invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V
	 /* :try_end_7 */
	 /* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
	 /* :catchall_1 */
	 /* move-exception p3 */
	 try { // :try_start_8
		 (( java.lang.Throwable ) p1 ).addSuppressed ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
	 } // :goto_1
	 /* throw p1 */
	 /* :try_end_8 */
	 /* .catchall {:try_start_8 ..:try_end_8} :catchall_2 */
	 /* :catchall_2 */
	 /* move-exception p1 */
	 if ( p2 != null) { // if-eqz p2, :cond_7
		 /* .line 43 */
		 try { // :try_start_9
			 (( android.os.ParcelFileDescriptor ) p2 ).close ( ); // invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->close()V
			 /* :try_end_9 */
			 /* .catchall {:try_start_9 ..:try_end_9} :catchall_3 */
			 /* :catchall_3 */
			 /* move-exception p2 */
			 try { // :try_start_a
				 (( java.lang.Throwable ) p1 ).addSuppressed ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
			 } // :cond_7
		 } // :goto_2
		 /* throw p1 */
		 /* :try_end_a */
		 /* .catch Ljava/io/IOException; {:try_start_a ..:try_end_a} :catch_0 */
		 /* :catch_0 */
	 } // .end method
	 public android.graphics.Typeface a ( android.content.Context p0, Object p1, android.content.res.Resources p2, Integer p3 ) {
		 /* .locals 7 */
		 /* .line 44 */
		 c.h.g.h .b ( );
		 /* .line 45 */
		 (( c.h.f.i.f ) p2 ).a ( ); // invoke-virtual {p2}, Lc/h/f/i/f;->a()[Lc/h/f/i/g;
		 /* array-length v0, p2 */
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-ge v1, v0, :cond_3 */
	 /* aget-object v2, p2, v1 */
	 /* .line 46 */
	 c.h.g.q .a ( p1 );
	 int v4 = 0; // const/4 v4, 0x0
	 /* if-nez v3, :cond_0 */
	 /* .line 47 */
} // :cond_0
try { // :try_start_0
	 v5 = 	 (( c.h.f.i.g ) v2 ).b ( ); // invoke-virtual {v2}, Lc/h/f/i/g;->b()I
	 v5 = 	 c.h.g.q .a ( v3,p3,v5 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* if-nez v5, :cond_1 */
	 /* .line 48 */
	 (( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
	 /* .line 49 */
} // :cond_1
try { // :try_start_1
	 (( java.io.File ) v3 ).getPath ( ); // invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;
	 v6 = 	 (( c.h.f.i.g ) v2 ).e ( ); // invoke-virtual {v2}, Lc/h/f/i/g;->e()I
	 v2 = 	 (( c.h.f.i.g ) v2 ).f ( ); // invoke-virtual {v2}, Lc/h/f/i/g;->f()Z
	 v2 = 	 c.h.g.h .a ( p4,v5,v6,v2 );
	 /* :try_end_1 */
	 /* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* if-nez v2, :cond_2 */
	 /* .line 50 */
	 (( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
} // :cond_2
(( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
/* add-int/lit8 v1, v1, 0x1 */
/* :catchall_0 */
/* move-exception p1 */
(( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
/* .line 51 */
/* throw p1 */
/* .line 52 */
/* :catch_0 */
(( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
/* .line 53 */
} // :cond_3
c.h.g.h .a ( p4 );
} // .end method
public final java.io.File a ( android.os.ParcelFileDescriptor p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 15 */
try { // :try_start_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "/proc/self/fd/"; // const-string v2, "/proc/self/fd/"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = (( android.os.ParcelFileDescriptor ) p1 ).getFd ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFd()I
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.system.Os .readlink ( p1 );
/* .line 16 */
android.system.Os .stat ( p1 );
/* iget v1, v1, Landroid/system/StructStat;->st_mode:I */
v1 = android.system.OsConstants .S_ISREG ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 17 */
	 /* new-instance v1, Ljava/io/File; */
	 /* invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 /* :try_end_0 */
	 /* .catch Landroid/system/ErrnoException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
} // :cond_0
} // .end method
