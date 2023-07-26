public class c.h.g.j extends c.h.g.h {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.Class g;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public final java.lang.reflect.Constructor h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/reflect/Constructor<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public final java.lang.reflect.Method i;
public final java.lang.reflect.Method j;
public final java.lang.reflect.Method k;
public final java.lang.reflect.Method l;
public final java.lang.reflect.Method m;
/* # direct methods */
public c.h.g.j ( ) {
/* .locals 8 */
/* .line 1 */
/* invoke-direct {p0}, Lc/h/g/h;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
try { // :try_start_0
(( c.h.g.j ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/g/j;->d()Ljava/lang/Class;
/* .line 3 */
(( c.h.g.j ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Lc/h/g/j;->e(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* .line 4 */
(( c.h.g.j ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lc/h/g/j;->b(Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 5 */
(( c.h.g.j ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lc/h/g/j;->c(Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 6 */
(( c.h.g.j ) p0 ).f ( v1 ); // invoke-virtual {p0, v1}, Lc/h/g/j;->f(Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 7 */
(( c.h.g.j ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/h/g/j;->a(Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 8 */
(( c.h.g.j ) p0 ).d ( v1 ); // invoke-virtual {p0, v1}, Lc/h/g/j;->d(Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
/* .line 9 */
} // :goto_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unable to collect necessary methods for class "; // const-string v3, "Unable to collect necessary methods for class "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "TypefaceCompatApi26Impl"; // const-string v3, "TypefaceCompatApi26Impl"
android.util.Log .e ( v3,v2,v1 );
/* move-object v1, v0 */
/* move-object v2, v1 */
/* move-object v3, v2 */
/* move-object v4, v3 */
/* move-object v5, v4 */
/* move-object v6, v5 */
/* .line 10 */
} // :goto_1
this.g = v0;
/* .line 11 */
this.h = v2;
/* .line 12 */
this.i = v3;
/* .line 13 */
this.j = v4;
/* .line 14 */
this.k = v5;
/* .line 15 */
this.l = v6;
/* .line 16 */
this.m = v1;
return;
} // .end method
private java.lang.Object b ( ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
v0 = this.h;
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Object; */
(( java.lang.reflect.Constructor ) v0 ).newInstance ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public android.graphics.Typeface a ( android.content.Context p0, android.content.res.Resources p1, Integer p2, java.lang.String p3, Integer p4 ) {
/* .locals 8 */
/* .line 47 */
v0 = (( c.h.g.j ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/g/j;->c()Z
/* if-nez v0, :cond_0 */
/* .line 48 */
/* invoke-super/range {p0 ..p5}, Lc/h/g/p;->a(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface; */
/* .line 49 */
} // :cond_0
/* invoke-direct {p0}, Lc/h/g/j;->b()Ljava/lang/Object; */
int p3 = 0; // const/4 p3, 0x0
/* if-nez p2, :cond_1 */
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
int v5 = -1; // const/4 v5, -0x1
int v6 = -1; // const/4 v6, -0x1
int v7 = 0; // const/4 v7, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p4 */
/* .line 50 */
p1 = /* invoke-virtual/range {v0 ..v7}, Lc/h/g/j;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z */
/* if-nez p1, :cond_2 */
/* .line 51 */
(( c.h.g.j ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lc/h/g/j;->b(Ljava/lang/Object;)V
/* .line 52 */
} // :cond_2
p1 = (( c.h.g.j ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Lc/h/g/j;->c(Ljava/lang/Object;)Z
/* if-nez p1, :cond_3 */
/* .line 53 */
} // :cond_3
(( c.h.g.j ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/h/g/j;->a(Ljava/lang/Object;)Landroid/graphics/Typeface;
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, android.os.CancellationSignal p1, Object[] p2, Integer p3 ) {
/* .locals 10 */
/* .line 24 */
/* array-length v0, p3 */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* if-ge v0, v1, :cond_0 */
/* .line 25 */
} // :cond_0
v0 = (( c.h.g.j ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/g/j;->c()Z
/* if-nez v0, :cond_5 */
/* .line 26 */
(( c.h.g.p ) p0 ).a ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Lc/h/g/p;->a([Lc/h/k/o;I)Lc/h/k/o;
/* .line 27 */
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
/* .line 28 */
try { // :try_start_0
(( c.h.k.o ) p3 ).c ( ); // invoke-virtual {p3}, Lc/h/k/o;->c()Landroid/net/Uri;
final String v0 = "r"; // const-string v0, "r"
(( android.content.ContentResolver ) p1 ).openFileDescriptor ( p4, v0, p2 ); // invoke-virtual {p1, p4, v0, p2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
/* if-nez p1, :cond_2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 29 */
(( android.os.ParcelFileDescriptor ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_1
/* .line 30 */
} // :cond_2
try { // :try_start_1
/* new-instance p2, Landroid/graphics/Typeface$Builder; */
(( android.os.ParcelFileDescriptor ) p1 ).getFileDescriptor ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
/* invoke-direct {p2, p4}, Landroid/graphics/Typeface$Builder;-><init>(Ljava/io/FileDescriptor;)V */
/* .line 31 */
p4 = (( c.h.k.o ) p3 ).d ( ); // invoke-virtual {p3}, Lc/h/k/o;->d()I
(( android.graphics.Typeface$Builder ) p2 ).setWeight ( p4 ); // invoke-virtual {p2, p4}, Landroid/graphics/Typeface$Builder;->setWeight(I)Landroid/graphics/Typeface$Builder;
/* .line 32 */
p3 = (( c.h.k.o ) p3 ).e ( ); // invoke-virtual {p3}, Lc/h/k/o;->e()Z
(( android.graphics.Typeface$Builder ) p2 ).setItalic ( p3 ); // invoke-virtual {p2, p3}, Landroid/graphics/Typeface$Builder;->setItalic(Z)Landroid/graphics/Typeface$Builder;
/* .line 33 */
(( android.graphics.Typeface$Builder ) p2 ).build ( ); // invoke-virtual {p2}, Landroid/graphics/Typeface$Builder;->build()Landroid/graphics/Typeface;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 34 */
try { // :try_start_2
(( android.os.ParcelFileDescriptor ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
} // :cond_3
/* :catchall_0 */
/* move-exception p2 */
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 35 */
try { // :try_start_3
(( android.os.ParcelFileDescriptor ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->close()V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* :catchall_1 */
/* move-exception p1 */
try { // :try_start_4
(( java.lang.Throwable ) p2 ).addSuppressed ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
} // :cond_4
} // :goto_0
/* throw p2 */
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
/* :catch_0 */
/* .line 36 */
} // :cond_5
c.h.g.q .a ( p1,p3,p2 );
/* .line 37 */
/* invoke-direct {p0}, Lc/h/g/j;->b()Ljava/lang/Object; */
/* if-nez p2, :cond_6 */
/* .line 38 */
} // :cond_6
/* array-length v0, p3 */
int v3 = 0; // const/4 v3, 0x0
int v9 = 0; // const/4 v9, 0x0
} // :goto_1
/* if-ge v9, v0, :cond_9 */
/* aget-object v4, p3, v9 */
/* .line 39 */
(( c.h.k.o ) v4 ).c ( ); // invoke-virtual {v4}, Lc/h/k/o;->c()Landroid/net/Uri;
/* check-cast v5, Ljava/nio/ByteBuffer; */
/* if-nez v5, :cond_7 */
/* .line 40 */
} // :cond_7
v6 = (( c.h.k.o ) v4 ).b ( ); // invoke-virtual {v4}, Lc/h/k/o;->b()I
v7 = (( c.h.k.o ) v4 ).d ( ); // invoke-virtual {v4}, Lc/h/k/o;->d()I
v8 = (( c.h.k.o ) v4 ).e ( ); // invoke-virtual {v4}, Lc/h/k/o;->e()Z
/* move-object v3, p0 */
/* move-object v4, p2 */
/* .line 41 */
v3 = /* invoke-virtual/range {v3 ..v8}, Lc/h/g/j;->a(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z */
/* if-nez v3, :cond_8 */
/* .line 42 */
(( c.h.g.j ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lc/h/g/j;->b(Ljava/lang/Object;)V
} // :cond_8
int v3 = 1; // const/4 v3, 0x1
} // :goto_2
/* add-int/lit8 v9, v9, 0x1 */
} // :cond_9
/* if-nez v3, :cond_a */
/* .line 43 */
(( c.h.g.j ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lc/h/g/j;->b(Ljava/lang/Object;)V
/* .line 44 */
} // :cond_a
p1 = (( c.h.g.j ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Lc/h/g/j;->c(Ljava/lang/Object;)Z
/* if-nez p1, :cond_b */
/* .line 45 */
} // :cond_b
(( c.h.g.j ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/h/g/j;->a(Ljava/lang/Object;)Landroid/graphics/Typeface;
/* if-nez p1, :cond_c */
/* .line 46 */
} // :cond_c
android.graphics.Typeface .create ( p1,p4 );
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, Object p1, android.content.res.Resources p2, Integer p3 ) {
/* .locals 10 */
/* .line 13 */
v0 = (( c.h.g.j ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/g/j;->c()Z
/* if-nez v0, :cond_0 */
/* .line 14 */
/* invoke-super {p0, p1, p2, p3, p4}, Lc/h/g/h;->a(Landroid/content/Context;Lc/h/f/i/f;Landroid/content/res/Resources;I)Landroid/graphics/Typeface; */
/* .line 15 */
} // :cond_0
/* invoke-direct {p0}, Lc/h/g/j;->b()Ljava/lang/Object; */
int p4 = 0; // const/4 p4, 0x0
/* if-nez p3, :cond_1 */
/* .line 16 */
} // :cond_1
(( c.h.f.i.f ) p2 ).a ( ); // invoke-virtual {p2}, Lc/h/f/i/f;->a()[Lc/h/f/i/g;
/* array-length v8, p2 */
int v0 = 0; // const/4 v0, 0x0
int v9 = 0; // const/4 v9, 0x0
} // :goto_0
/* if-ge v9, v8, :cond_3 */
/* aget-object v0, p2, v9 */
/* .line 17 */
(( c.h.f.i.g ) v0 ).a ( ); // invoke-virtual {v0}, Lc/h/f/i/g;->a()Ljava/lang/String;
/* .line 18 */
v4 = (( c.h.f.i.g ) v0 ).c ( ); // invoke-virtual {v0}, Lc/h/f/i/g;->c()I
v5 = (( c.h.f.i.g ) v0 ).e ( ); // invoke-virtual {v0}, Lc/h/f/i/g;->e()I
v6 = (( c.h.f.i.g ) v0 ).f ( ); // invoke-virtual {v0}, Lc/h/f/i/g;->f()Z
/* .line 19 */
(( c.h.f.i.g ) v0 ).d ( ); // invoke-virtual {v0}, Lc/h/f/i/g;->d()Ljava/lang/String;
android.graphics.fonts.FontVariationAxis .fromFontVariationSettings ( v0 );
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p3 */
/* .line 20 */
v0 = /* invoke-virtual/range {v0 ..v7}, Lc/h/g/j;->a(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;III[Landroid/graphics/fonts/FontVariationAxis;)Z */
/* if-nez v0, :cond_2 */
/* .line 21 */
(( c.h.g.j ) p0 ).b ( p3 ); // invoke-virtual {p0, p3}, Lc/h/g/j;->b(Ljava/lang/Object;)V
} // :cond_2
/* add-int/lit8 v9, v9, 0x1 */
/* .line 22 */
} // :cond_3
p1 = (( c.h.g.j ) p0 ).c ( p3 ); // invoke-virtual {p0, p3}, Lc/h/g/j;->c(Ljava/lang/Object;)Z
/* if-nez p1, :cond_4 */
/* .line 23 */
} // :cond_4
(( c.h.g.j ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Lc/h/g/j;->a(Ljava/lang/Object;)Landroid/graphics/Typeface;
} // .end method
public android.graphics.Typeface a ( java.lang.Object p0 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
try { // :try_start_0
v1 = this.g;
int v2 = 1; // const/4 v2, 0x1
java.lang.reflect.Array .newInstance ( v1,v2 );
int v3 = 0; // const/4 v3, 0x0
/* .line 9 */
java.lang.reflect.Array .set ( v1,v3,p1 );
/* .line 10 */
p1 = this.m;
int v4 = 3; // const/4 v4, 0x3
/* new-array v4, v4, [Ljava/lang/Object; */
/* aput-object v1, v4, v3 */
int v1 = -1; // const/4 v1, -0x1
/* .line 11 */
java.lang.Integer .valueOf ( v1 );
/* aput-object v3, v4, v2 */
int v2 = 2; // const/4 v2, 0x2
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v4, v2 */
/* .line 12 */
(( java.lang.reflect.Method ) p1 ).invoke ( v0, v4 ); // invoke-virtual {p1, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Landroid/graphics/Typeface; */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public java.lang.reflect.Method a ( java.lang.Class p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/NoSuchMethodException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Class; */
final String v1 = "abortCreation"; // const-string v1, "abortCreation"
/* .line 54 */
(( java.lang.Class ) p1 ).getMethod ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
} // .end method
public final Boolean a ( android.content.Context p0, java.lang.Object p1, java.lang.String p2, Integer p3, Integer p4, Integer p5, android.graphics.fonts.FontVariationAxis[] p6 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
try { // :try_start_0
v1 = this.i;
/* const/16 v2, 0x8 */
/* new-array v2, v2, [Ljava/lang/Object; */
/* .line 2 */
(( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
/* aput-object p1, v2, v0 */
int p1 = 1; // const/4 p1, 0x1
/* aput-object p3, v2, p1 */
int p1 = 2; // const/4 p1, 0x2
java.lang.Integer .valueOf ( v0 );
/* aput-object p3, v2, p1 */
int p1 = 3; // const/4 p1, 0x3
java.lang.Boolean .valueOf ( v0 );
/* aput-object p3, v2, p1 */
int p1 = 4; // const/4 p1, 0x4
java.lang.Integer .valueOf ( p4 );
/* aput-object p3, v2, p1 */
int p1 = 5; // const/4 p1, 0x5
/* .line 3 */
java.lang.Integer .valueOf ( p5 );
/* aput-object p3, v2, p1 */
int p1 = 6; // const/4 p1, 0x6
java.lang.Integer .valueOf ( p6 );
/* aput-object p3, v2, p1 */
int p1 = 7; // const/4 p1, 0x7
/* aput-object p7, v2, p1 */
/* .line 4 */
(( java.lang.reflect.Method ) v1 ).invoke ( p2, v2 ); // invoke-virtual {v1, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Boolean; */
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public final Boolean a ( java.lang.Object p0, java.nio.ByteBuffer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
try { // :try_start_0
v1 = this.j;
int v2 = 5; // const/4 v2, 0x5
/* new-array v2, v2, [Ljava/lang/Object; */
/* aput-object p2, v2, v0 */
int p2 = 1; // const/4 p2, 0x1
/* .line 6 */
java.lang.Integer .valueOf ( p3 );
/* aput-object p3, v2, p2 */
int p2 = 2; // const/4 p2, 0x2
int p3 = 0; // const/4 p3, 0x0
/* aput-object p3, v2, p2 */
int p2 = 3; // const/4 p2, 0x3
java.lang.Integer .valueOf ( p4 );
/* aput-object p3, v2, p2 */
int p2 = 4; // const/4 p2, 0x4
java.lang.Integer .valueOf ( p5 );
/* aput-object p3, v2, p2 */
/* .line 7 */
(( java.lang.reflect.Method ) v1 ).invoke ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Boolean; */
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public java.lang.reflect.Method b ( java.lang.Class p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/NoSuchMethodException; */
/* } */
} // .end annotation
/* const/16 v0, 0x8 */
/* new-array v0, v0, [Ljava/lang/Class; */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
/* const-class v2, Landroid/content/res/AssetManager; */
/* aput-object v2, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* const-class v2, Ljava/lang/String; */
/* aput-object v2, v0, v1 */
v1 = java.lang.Integer.TYPE;
int v2 = 2; // const/4 v2, 0x2
/* aput-object v1, v0, v2 */
v1 = java.lang.Boolean.TYPE;
int v2 = 3; // const/4 v2, 0x3
/* aput-object v1, v0, v2 */
v1 = java.lang.Integer.TYPE;
int v2 = 4; // const/4 v2, 0x4
/* aput-object v1, v0, v2 */
int v2 = 5; // const/4 v2, 0x5
/* aput-object v1, v0, v2 */
int v2 = 6; // const/4 v2, 0x6
/* aput-object v1, v0, v2 */
int v1 = 7; // const/4 v1, 0x7
/* const-class v2, [Landroid/graphics/fonts/FontVariationAxis; */
/* aput-object v2, v0, v1 */
final String v1 = "addFontFromAssetManager"; // const-string v1, "addFontFromAssetManager"
(( java.lang.Class ) p1 ).getMethod ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
} // .end method
public final void b ( java.lang.Object p0 ) {
/* .locals 2 */
/* .line 2 */
try { // :try_start_0
v0 = this.l;
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v0 ).invoke ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
return;
} // .end method
public java.lang.reflect.Method c ( java.lang.Class p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/NoSuchMethodException; */
/* } */
} // .end annotation
int v0 = 5; // const/4 v0, 0x5
/* new-array v0, v0, [Ljava/lang/Class; */
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
/* const-class v2, Ljava/nio/ByteBuffer; */
/* aput-object v2, v0, v1 */
v1 = java.lang.Integer.TYPE;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
int v2 = 2; // const/4 v2, 0x2
/* const-class v3, [Landroid/graphics/fonts/FontVariationAxis; */
/* aput-object v3, v0, v2 */
int v2 = 3; // const/4 v2, 0x3
/* aput-object v1, v0, v2 */
int v2 = 4; // const/4 v2, 0x4
/* aput-object v1, v0, v2 */
final String v1 = "addFontFromBuffer"; // const-string v1, "addFontFromBuffer"
(( java.lang.Class ) p1 ).getMethod ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
} // .end method
public final Boolean c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.i;
/* if-nez v0, :cond_0 */
final String v0 = "TypefaceCompatApi26Impl"; // const-string v0, "TypefaceCompatApi26Impl"
final String v1 = "Unable to collect necessary private methods.Fallback to legacy implementation."; // const-string v1, "Unable to collect necessary private methods.Fallback to legacy implementation."
/* .line 2 */
android.util.Log .w ( v0,v1 );
/* .line 3 */
} // :cond_0
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final Boolean c ( java.lang.Object p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
try { // :try_start_0
v1 = this.k;
/* new-array v2, v0, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v1 ).invoke ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Boolean; */
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public java.lang.Class d ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/ClassNotFoundException; */
/* } */
} // .end annotation
final String v0 = "android.graphics.FontFamily"; // const-string v0, "android.graphics.FontFamily"
/* .line 1 */
java.lang.Class .forName ( v0 );
} // .end method
public java.lang.reflect.Method d ( java.lang.Class p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/NoSuchMethodException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
java.lang.reflect.Array .newInstance ( p1,v0 );
/* .line 3 */
/* const-class v1, Landroid/graphics/Typeface; */
int v2 = 3; // const/4 v2, 0x3
/* new-array v2, v2, [Ljava/lang/Class; */
/* .line 4 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v3 = 0; // const/4 v3, 0x0
/* aput-object p1, v2, v3 */
p1 = java.lang.Integer.TYPE;
/* aput-object p1, v2, v0 */
int v3 = 2; // const/4 v3, 0x2
/* aput-object p1, v2, v3 */
final String p1 = "createFromFamiliesWithDefault"; // const-string p1, "createFromFamiliesWithDefault"
/* .line 5 */
(( java.lang.Class ) v1 ).getDeclaredMethod ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 6 */
(( java.lang.reflect.Method ) p1 ).setAccessible ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/reflect/Method;->setAccessible(Z)V
} // .end method
public java.lang.reflect.Constructor e ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Constructor<", */
/* "*>;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/NoSuchMethodException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Class; */
/* .line 1 */
(( java.lang.Class ) p1 ).getConstructor ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
} // .end method
public java.lang.reflect.Method f ( java.lang.Class p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/NoSuchMethodException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/Class; */
final String v1 = "freeze"; // const-string v1, "freeze"
/* .line 1 */
(( java.lang.Class ) p1 ).getMethod ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
} // .end method
