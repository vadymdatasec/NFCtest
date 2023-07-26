public class c.h.g.i extends c.h.g.p {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Class b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.lang.reflect.Constructor c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/reflect/Constructor<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public static final java.lang.reflect.Method d;
public static final java.lang.reflect.Method e;
/* # direct methods */
public static c.h.g.i ( ) {
/* .locals 9 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
final String v1 = "android.graphics.FontFamily"; // const-string v1, "android.graphics.FontFamily"
/* .line 1 */
java.lang.Class .forName ( v1 );
int v2 = 0; // const/4 v2, 0x0
/* new-array v3, v2, [Ljava/lang/Class; */
/* .line 2 */
(( java.lang.Class ) v1 ).getConstructor ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
final String v4 = "addFontWeightStyle"; // const-string v4, "addFontWeightStyle"
int v5 = 5; // const/4 v5, 0x5
/* new-array v5, v5, [Ljava/lang/Class; */
/* .line 3 */
/* const-class v6, Ljava/nio/ByteBuffer; */
/* aput-object v6, v5, v2 */
v6 = java.lang.Integer.TYPE;
int v7 = 1; // const/4 v7, 0x1
/* aput-object v6, v5, v7 */
int v6 = 2; // const/4 v6, 0x2
/* const-class v8, Ljava/util/List; */
/* aput-object v8, v5, v6 */
int v6 = 3; // const/4 v6, 0x3
v8 = java.lang.Integer.TYPE;
/* aput-object v8, v5, v6 */
int v6 = 4; // const/4 v6, 0x4
v8 = java.lang.Boolean.TYPE;
/* aput-object v8, v5, v6 */
(( java.lang.Class ) v1 ).getMethod ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 4 */
java.lang.reflect.Array .newInstance ( v1,v7 );
/* .line 5 */
/* const-class v6, Landroid/graphics/Typeface; */
final String v8 = "createFromFamiliesWithDefault"; // const-string v8, "createFromFamiliesWithDefault"
/* new-array v7, v7, [Ljava/lang/Class; */
/* .line 6 */
(( java.lang.Object ) v5 ).getClass ( ); // invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* aput-object v5, v7, v2 */
/* .line 7 */
(( java.lang.Class ) v6 ).getMethod ( v8, v7 ); // invoke-virtual {v6, v8, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v2, v0 */
/* move-object v0, v3 */
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
/* .line 8 */
} // :goto_0
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
final String v3 = "TypefaceCompatApi24Impl"; // const-string v3, "TypefaceCompatApi24Impl"
android.util.Log .e ( v3,v2,v1 );
/* move-object v1, v0 */
/* move-object v2, v1 */
/* move-object v4, v2 */
/* .line 9 */
} // :goto_1
/* .line 10 */
/* .line 11 */
/* .line 12 */
return;
} // .end method
public c.h.g.i ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lc/h/g/p;-><init>()V */
return;
} // .end method
public static android.graphics.Typeface a ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
try { // :try_start_0
v1 = c.h.g.i.b;
int v2 = 1; // const/4 v2, 0x1
java.lang.reflect.Array .newInstance ( v1,v2 );
int v3 = 0; // const/4 v3, 0x0
/* .line 9 */
java.lang.reflect.Array .set ( v1,v3,p0 );
/* .line 10 */
p0 = c.h.g.i.e;
/* new-array v2, v2, [Ljava/lang/Object; */
/* aput-object v1, v2, v3 */
(( java.lang.reflect.Method ) p0 ).invoke ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Landroid/graphics/Typeface; */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public static Boolean a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = c.h.g.i.d;
/* if-nez v0, :cond_0 */
final String v0 = "TypefaceCompatApi24Impl"; // const-string v0, "TypefaceCompatApi24Impl"
final String v1 = "Unable to collect necessary private methods.Fallback to legacy implementation."; // const-string v1, "Unable to collect necessary private methods.Fallback to legacy implementation."
/* .line 2 */
android.util.Log .w ( v0,v1 );
/* .line 3 */
} // :cond_0
v0 = c.h.g.i.d;
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public static Boolean a ( java.lang.Object p0, java.nio.ByteBuffer p1, Integer p2, Integer p3, Boolean p4 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
try { // :try_start_0
v1 = c.h.g.i.d;
int v2 = 5; // const/4 v2, 0x5
/* new-array v2, v2, [Ljava/lang/Object; */
/* aput-object p1, v2, v0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 5 */
java.lang.Integer .valueOf ( p2 );
/* aput-object p2, v2, p1 */
int p1 = 2; // const/4 p1, 0x2
int p2 = 0; // const/4 p2, 0x0
/* aput-object p2, v2, p1 */
int p1 = 3; // const/4 p1, 0x3
java.lang.Integer .valueOf ( p3 );
/* aput-object p2, v2, p1 */
int p1 = 4; // const/4 p1, 0x4
java.lang.Boolean .valueOf ( p4 );
/* aput-object p2, v2, p1 */
/* .line 6 */
(( java.lang.reflect.Method ) v1 ).invoke ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Boolean; */
/* .line 7 */
p0 = (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public static java.lang.Object b ( ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
v0 = c.h.g.i.c;
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
public android.graphics.Typeface a ( android.content.Context p0, android.os.CancellationSignal p1, Object[] p2, Integer p3 ) {
/* .locals 9 */
/* .line 11 */
c.h.g.i .b ( );
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 12 */
} // :cond_0
/* new-instance v2, Lc/e/i; */
/* invoke-direct {v2}, Lc/e/i;-><init>()V */
/* .line 13 */
/* array-length v3, p3 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v3, :cond_4 */
/* aget-object v5, p3, v4 */
/* .line 14 */
(( c.h.k.o ) v5 ).c ( ); // invoke-virtual {v5}, Lc/h/k/o;->c()Landroid/net/Uri;
/* .line 15 */
(( c.e.i ) v2 ).get ( v6 ); // invoke-virtual {v2, v6}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v7, Ljava/nio/ByteBuffer; */
/* if-nez v7, :cond_1 */
/* .line 16 */
c.h.g.q .a ( p1,p2,v6 );
/* .line 17 */
(( c.e.i ) v2 ).put ( v6, v7 ); // invoke-virtual {v2, v6, v7}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
/* if-nez v7, :cond_2 */
/* .line 18 */
} // :cond_2
v6 = (( c.h.k.o ) v5 ).b ( ); // invoke-virtual {v5}, Lc/h/k/o;->b()I
v8 = (( c.h.k.o ) v5 ).d ( ); // invoke-virtual {v5}, Lc/h/k/o;->d()I
/* .line 19 */
v5 = (( c.h.k.o ) v5 ).e ( ); // invoke-virtual {v5}, Lc/h/k/o;->e()Z
/* .line 20 */
v5 = c.h.g.i .a ( v0,v7,v6,v8,v5 );
/* if-nez v5, :cond_3 */
} // :cond_3
/* add-int/lit8 v4, v4, 0x1 */
/* .line 21 */
} // :cond_4
c.h.g.i .a ( v0 );
/* if-nez p1, :cond_5 */
/* .line 22 */
} // :cond_5
android.graphics.Typeface .create ( p1,p4 );
} // .end method
public android.graphics.Typeface a ( android.content.Context p0, Object p1, android.content.res.Resources p2, Integer p3 ) {
/* .locals 7 */
/* .line 23 */
c.h.g.i .b ( );
int v0 = 0; // const/4 v0, 0x0
/* if-nez p4, :cond_0 */
/* .line 24 */
} // :cond_0
(( c.h.f.i.f ) p2 ).a ( ); // invoke-virtual {p2}, Lc/h/f/i/f;->a()[Lc/h/f/i/g;
/* array-length v1, p2 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_3 */
/* aget-object v3, p2, v2 */
/* .line 25 */
v4 = (( c.h.f.i.g ) v3 ).b ( ); // invoke-virtual {v3}, Lc/h/f/i/g;->b()I
c.h.g.q .a ( p1,p3,v4 );
/* if-nez v4, :cond_1 */
/* .line 26 */
} // :cond_1
v5 = (( c.h.f.i.g ) v3 ).c ( ); // invoke-virtual {v3}, Lc/h/f/i/g;->c()I
v6 = (( c.h.f.i.g ) v3 ).e ( ); // invoke-virtual {v3}, Lc/h/f/i/g;->e()I
v3 = (( c.h.f.i.g ) v3 ).f ( ); // invoke-virtual {v3}, Lc/h/f/i/g;->f()Z
v3 = c.h.g.i .a ( p4,v4,v5,v6,v3 );
/* if-nez v3, :cond_2 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
/* .line 27 */
} // :cond_3
c.h.g.i .a ( p4 );
} // .end method
