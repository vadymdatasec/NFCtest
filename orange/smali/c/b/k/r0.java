public abstract class c.b.k.r0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.reflect.Field a;
	 public static Boolean b;
	 public static java.lang.Class c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public static Boolean d;
public static java.lang.reflect.Field e;
public static Boolean f;
public static java.lang.reflect.Field g;
public static Boolean h;
/* # direct methods */
public static void a ( android.content.res.Resources p0 ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1c */
/* if-lt v0, v1, :cond_0 */
return;
} // :cond_0
/* const/16 v1, 0x18 */
/* if-lt v0, v1, :cond_1 */
/* .line 2 */
c.b.k.r0 .d ( p0 );
} // :cond_1
/* const/16 v1, 0x17 */
/* if-lt v0, v1, :cond_2 */
/* .line 3 */
c.b.k.r0 .c ( p0 );
} // :cond_2
/* const/16 v1, 0x15 */
/* if-lt v0, v1, :cond_3 */
/* .line 4 */
c.b.k.r0 .b ( p0 );
} // :cond_3
} // :goto_0
return;
} // .end method
public static void a ( java.lang.Object p0 ) {
/* .locals 4 */
/* .line 5 */
/* sget-boolean v0, Lc/b/k/r0;->d:Z */
int v1 = 1; // const/4 v1, 0x1
final String v2 = "ResourcesFlusher"; // const-string v2, "ResourcesFlusher"
/* if-nez v0, :cond_0 */
try { // :try_start_0
final String v0 = "android.content.res.ThemedResourceCache"; // const-string v0, "android.content.res.ThemedResourceCache"
/* .line 6 */
java.lang.Class .forName ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v3 = "Could not find ThemedResourceCache class"; // const-string v3, "Could not find ThemedResourceCache class"
/* .line 7 */
android.util.Log .e ( v2,v3,v0 );
/* .line 8 */
} // :goto_0
c.b.k.r0.d = (v1!= 0);
/* .line 9 */
} // :cond_0
v0 = c.b.k.r0.c;
/* if-nez v0, :cond_1 */
return;
/* .line 10 */
} // :cond_1
/* sget-boolean v3, Lc/b/k/r0;->f:Z */
/* if-nez v3, :cond_2 */
try { // :try_start_1
final String v3 = "mUnthemedEntries"; // const-string v3, "mUnthemedEntries"
/* .line 11 */
(( java.lang.Class ) v0 ).getDeclaredField ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 12 */
(( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
final String v3 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"; // const-string v3, "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
/* .line 13 */
android.util.Log .e ( v2,v3,v0 );
/* .line 14 */
} // :goto_1
c.b.k.r0.f = (v1!= 0);
/* .line 15 */
} // :cond_2
v0 = c.b.k.r0.e;
/* if-nez v0, :cond_3 */
return;
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
/* .line 16 */
try { // :try_start_2
(( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Landroid/util/LongSparseArray; */
/* :try_end_2 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_2 ..:try_end_2} :catch_2 */
/* move-object v1, p0 */
/* :catch_2 */
/* move-exception p0 */
final String v0 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"; // const-string v0, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
/* .line 17 */
android.util.Log .e ( v2,v0,p0 );
} // :goto_2
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 18 */
(( android.util.LongSparseArray ) v1 ).clear ( ); // invoke-virtual {v1}, Landroid/util/LongSparseArray;->clear()V
} // :cond_4
return;
} // .end method
public static void b ( android.content.res.Resources p0 ) {
/* .locals 4 */
/* .line 1 */
/* sget-boolean v0, Lc/b/k/r0;->b:Z */
final String v1 = "ResourcesFlusher"; // const-string v1, "ResourcesFlusher"
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
try { // :try_start_0
/* const-class v2, Landroid/content/res/Resources; */
final String v3 = "mDrawableCache"; // const-string v3, "mDrawableCache"
(( java.lang.Class ) v2 ).getDeclaredField ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 3 */
(( java.lang.reflect.Field ) v2 ).setAccessible ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
final String v3 = "Could not retrieve Resources#mDrawableCache field"; // const-string v3, "Could not retrieve Resources#mDrawableCache field"
/* .line 4 */
android.util.Log .e ( v1,v3,v2 );
/* .line 5 */
} // :goto_0
c.b.k.r0.b = (v0!= 0);
/* .line 6 */
} // :cond_0
v0 = c.b.k.r0.a;
if ( v0 != null) { // if-eqz v0, :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 7 */
try { // :try_start_1
(( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/util/Map; */
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
/* move-object v2, p0 */
/* :catch_1 */
/* move-exception p0 */
final String v0 = "Could not retrieve value from Resources#mDrawableCache"; // const-string v0, "Could not retrieve value from Resources#mDrawableCache"
/* .line 8 */
android.util.Log .e ( v1,v0,p0 );
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 9 */
} // :cond_1
return;
} // .end method
public static void c ( android.content.res.Resources p0 ) {
/* .locals 4 */
/* .line 1 */
/* sget-boolean v0, Lc/b/k/r0;->b:Z */
final String v1 = "ResourcesFlusher"; // const-string v1, "ResourcesFlusher"
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
try { // :try_start_0
/* const-class v2, Landroid/content/res/Resources; */
final String v3 = "mDrawableCache"; // const-string v3, "mDrawableCache"
(( java.lang.Class ) v2 ).getDeclaredField ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 3 */
(( java.lang.reflect.Field ) v2 ).setAccessible ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
final String v3 = "Could not retrieve Resources#mDrawableCache field"; // const-string v3, "Could not retrieve Resources#mDrawableCache field"
/* .line 4 */
android.util.Log .e ( v1,v3,v2 );
/* .line 5 */
} // :goto_0
c.b.k.r0.b = (v0!= 0);
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
v2 = c.b.k.r0.a;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 7 */
try { // :try_start_1
(( java.lang.reflect.Field ) v2 ).get ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception p0 */
final String v2 = "Could not retrieve value from Resources#mDrawableCache"; // const-string v2, "Could not retrieve value from Resources#mDrawableCache"
/* .line 8 */
android.util.Log .e ( v1,v2,p0 );
} // :cond_1
} // :goto_1
/* if-nez v0, :cond_2 */
return;
/* .line 9 */
} // :cond_2
c.b.k.r0 .a ( v0 );
return;
} // .end method
public static void d ( android.content.res.Resources p0 ) {
/* .locals 5 */
/* .line 1 */
/* sget-boolean v0, Lc/b/k/r0;->h:Z */
int v1 = 1; // const/4 v1, 0x1
final String v2 = "ResourcesFlusher"; // const-string v2, "ResourcesFlusher"
/* if-nez v0, :cond_0 */
/* .line 2 */
try { // :try_start_0
/* const-class v0, Landroid/content/res/Resources; */
final String v3 = "mResourcesImpl"; // const-string v3, "mResourcesImpl"
(( java.lang.Class ) v0 ).getDeclaredField ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 3 */
(( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v3 = "Could not retrieve Resources#mResourcesImpl field"; // const-string v3, "Could not retrieve Resources#mResourcesImpl field"
/* .line 4 */
android.util.Log .e ( v2,v3,v0 );
/* .line 5 */
} // :goto_0
c.b.k.r0.h = (v1!= 0);
/* .line 6 */
} // :cond_0
v0 = c.b.k.r0.g;
/* if-nez v0, :cond_1 */
return;
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 7 */
try { // :try_start_1
(( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception p0 */
final String v0 = "Could not retrieve value from Resources#mResourcesImpl"; // const-string v0, "Could not retrieve value from Resources#mResourcesImpl"
/* .line 8 */
android.util.Log .e ( v2,v0,p0 );
/* move-object p0, v3 */
} // :goto_1
/* if-nez p0, :cond_2 */
return;
/* .line 9 */
} // :cond_2
/* sget-boolean v0, Lc/b/k/r0;->b:Z */
/* if-nez v0, :cond_3 */
/* .line 10 */
try { // :try_start_2
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
final String v4 = "mDrawableCache"; // const-string v4, "mDrawableCache"
(( java.lang.Class ) v0 ).getDeclaredField ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 11 */
(( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchFieldException; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
/* move-exception v0 */
final String v4 = "Could not retrieve ResourcesImpl#mDrawableCache field"; // const-string v4, "Could not retrieve ResourcesImpl#mDrawableCache field"
/* .line 12 */
android.util.Log .e ( v2,v4,v0 );
/* .line 13 */
} // :goto_2
c.b.k.r0.b = (v1!= 0);
/* .line 14 */
} // :cond_3
v0 = c.b.k.r0.a;
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 15 */
try { // :try_start_3
(( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_3 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_3 ..:try_end_3} :catch_3 */
/* :catch_3 */
/* move-exception p0 */
final String v0 = "Could not retrieve value from ResourcesImpl#mDrawableCache"; // const-string v0, "Could not retrieve value from ResourcesImpl#mDrawableCache"
/* .line 16 */
android.util.Log .e ( v2,v0,p0 );
} // :cond_4
} // :goto_3
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 17 */
c.b.k.r0 .a ( v3 );
} // :cond_5
return;
} // .end method
