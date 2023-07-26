public abstract class c.h.e.k {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Class a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.lang.reflect.Field b;
public static final java.lang.reflect.Field c;
public static final java.lang.reflect.Method d;
public static final java.lang.reflect.Method e;
public static final java.lang.reflect.Method f;
public static final android.os.Handler g;
/* # direct methods */
public static c.h.e.k ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* .line 2 */
c.h.e.k .a ( );
/* .line 3 */
c.h.e.k .b ( );
/* .line 4 */
c.h.e.k .c ( );
/* .line 5 */
v0 = c.h.e.k.a;
c.h.e.k .b ( v0 );
/* .line 6 */
v0 = c.h.e.k.a;
c.h.e.k .a ( v0 );
/* .line 7 */
v0 = c.h.e.k.a;
c.h.e.k .c ( v0 );
return;
} // .end method
public static java.lang.Class a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
try { // :try_start_0
final String v0 = "android.app.ActivityThread"; // const-string v0, "android.app.ActivityThread"
/* .line 25 */
java.lang.Class .forName ( v0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static java.lang.reflect.Method a ( java.lang.Class p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* if-nez p0, :cond_0 */
} // :cond_0
try { // :try_start_0
final String v1 = "performStopActivity"; // const-string v1, "performStopActivity"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
/* .line 23 */
/* const-class v4, Landroid/os/IBinder; */
/* aput-object v4, v2, v3 */
v3 = java.lang.Boolean.TYPE;
int v4 = 1; // const/4 v4, 0x1
/* aput-object v3, v2, v4 */
(( java.lang.Class ) p0 ).getDeclaredMethod ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 24 */
(( java.lang.reflect.Method ) p0 ).setAccessible ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/reflect/Method;->setAccessible(Z)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
} // .end method
public static Boolean a ( android.app.Activity p0 ) {
/* .locals 9 */
/* .line 1 */
int v1 = 1; // const/4 v1, 0x1
/* const/16 v2, 0x1c */
/* if-lt v0, v2, :cond_0 */
/* .line 2 */
(( android.app.Activity ) p0 ).recreate ( ); // invoke-virtual {p0}, Landroid/app/Activity;->recreate()V
/* .line 3 */
} // :cond_0
v0 = c.h.e.k .d ( );
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = c.h.e.k.f;
/* if-nez v0, :cond_1 */
/* .line 4 */
} // :cond_1
v0 = c.h.e.k.e;
/* if-nez v0, :cond_2 */
v0 = c.h.e.k.d;
/* if-nez v0, :cond_2 */
/* .line 5 */
} // :cond_2
try { // :try_start_0
v0 = c.h.e.k.c;
(( java.lang.reflect.Field ) v0 ).get ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* if-nez v0, :cond_3 */
/* .line 6 */
} // :cond_3
v3 = c.h.e.k.b;
(( java.lang.reflect.Field ) v3 ).get ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* if-nez v3, :cond_4 */
/* .line 7 */
} // :cond_4
(( android.app.Activity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;
/* .line 8 */
/* new-instance v5, Lc/h/e/j; */
/* invoke-direct {v5, p0}, Lc/h/e/j;-><init>(Landroid/app/Activity;)V */
/* .line 9 */
(( android.app.Application ) v4 ).registerActivityLifecycleCallbacks ( v5 ); // invoke-virtual {v4, v5}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
/* .line 10 */
v6 = c.h.e.k.g;
/* new-instance v7, Lc/h/e/g; */
/* invoke-direct {v7, v5, v0}, Lc/h/e/g;-><init>(Lc/h/e/j;Ljava/lang/Object;)V */
(( android.os.Handler ) v6 ).post ( v7 ); // invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 11 */
try { // :try_start_1
v6 = c.h.e.k .d ( );
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 12 */
p0 = c.h.e.k.f;
/* const/16 v6, 0x9 */
/* new-array v6, v6, [Ljava/lang/Object; */
/* aput-object v0, v6, v2 */
int v0 = 0; // const/4 v0, 0x0
/* aput-object v0, v6, v1 */
int v7 = 2; // const/4 v7, 0x2
/* aput-object v0, v6, v7 */
int v7 = 3; // const/4 v7, 0x3
/* .line 13 */
java.lang.Integer .valueOf ( v2 );
/* aput-object v8, v6, v7 */
int v7 = 4; // const/4 v7, 0x4
java.lang.Boolean .valueOf ( v2 );
/* aput-object v8, v6, v7 */
int v7 = 5; // const/4 v7, 0x5
/* aput-object v0, v6, v7 */
int v7 = 6; // const/4 v7, 0x6
/* aput-object v0, v6, v7 */
int v0 = 7; // const/4 v0, 0x7
java.lang.Boolean .valueOf ( v2 );
/* aput-object v7, v6, v0 */
/* const/16 v0, 0x8 */
java.lang.Boolean .valueOf ( v2 );
/* aput-object v7, v6, v0 */
/* .line 14 */
(( java.lang.reflect.Method ) p0 ).invoke ( v3, v6 ); // invoke-virtual {p0, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 15 */
} // :cond_5
(( android.app.Activity ) p0 ).recreate ( ); // invoke-virtual {p0}, Landroid/app/Activity;->recreate()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 16 */
} // :goto_0
try { // :try_start_2
p0 = c.h.e.k.g;
/* new-instance v0, Lc/h/e/h; */
/* invoke-direct {v0, v4, v5}, Lc/h/e/h;-><init>(Landroid/app/Application;Lc/h/e/j;)V */
(( android.os.Handler ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* :catchall_0 */
/* move-exception p0 */
v0 = c.h.e.k.g;
/* new-instance v1, Lc/h/e/h; */
/* invoke-direct {v1, v4, v5}, Lc/h/e/h;-><init>(Landroid/app/Application;Lc/h/e/j;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 17 */
/* throw p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* :catchall_1 */
} // .end method
public static Boolean a ( java.lang.Object p0, Integer p1, android.app.Activity p2 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 18 */
try { // :try_start_0
v1 = c.h.e.k.c;
(( java.lang.reflect.Field ) v1 ).get ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* if-ne v1, p0, :cond_1 */
/* .line 19 */
p0 = (( java.lang.Object ) p2 ).hashCode ( ); // invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I
/* if-eq p0, p1, :cond_0 */
/* .line 20 */
} // :cond_0
p0 = c.h.e.k.b;
(( java.lang.reflect.Field ) p0 ).get ( p2 ); // invoke-virtual {p0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 21 */
p1 = c.h.e.k.g;
/* new-instance p2, Lc/h/e/i; */
/* invoke-direct {p2, p0, v1}, Lc/h/e/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V */
(( android.os.Handler ) p1 ).postAtFrontOfQueue ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
} // :goto_0
/* :catchall_0 */
/* move-exception p0 */
final String p1 = "ActivityRecreator"; // const-string p1, "ActivityRecreator"
final String p2 = "Exception while fetching field values"; // const-string p2, "Exception while fetching field values"
/* .line 22 */
android.util.Log .e ( p1,p2,p0 );
} // .end method
public static java.lang.reflect.Field b ( ) {
/* .locals 2 */
/* .line 3 */
try { // :try_start_0
/* const-class v0, Landroid/app/Activity; */
final String v1 = "mMainThread"; // const-string v1, "mMainThread"
(( java.lang.Class ) v0 ).getDeclaredField ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
(( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static java.lang.reflect.Method b ( java.lang.Class p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* if-nez p0, :cond_0 */
} // :cond_0
try { // :try_start_0
final String v1 = "performStopActivity"; // const-string v1, "performStopActivity"
int v2 = 3; // const/4 v2, 0x3
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
/* .line 1 */
/* const-class v4, Landroid/os/IBinder; */
/* aput-object v4, v2, v3 */
v3 = java.lang.Boolean.TYPE;
int v4 = 1; // const/4 v4, 0x1
/* aput-object v3, v2, v4 */
int v3 = 2; // const/4 v3, 0x2
/* const-class v5, Ljava/lang/String; */
/* aput-object v5, v2, v3 */
(( java.lang.Class ) p0 ).getDeclaredMethod ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 2 */
(( java.lang.reflect.Method ) p0 ).setAccessible ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/reflect/Method;->setAccessible(Z)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
} // .end method
public static java.lang.reflect.Field c ( ) {
/* .locals 2 */
/* .line 4 */
try { // :try_start_0
/* const-class v0, Landroid/app/Activity; */
final String v1 = "mToken"; // const-string v1, "mToken"
(( java.lang.Class ) v0 ).getDeclaredField ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
int v1 = 1; // const/4 v1, 0x1
/* .line 5 */
(( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static java.lang.reflect.Method c ( java.lang.Class p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = c.h.e.k .d ( );
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-nez p0, :cond_0 */
} // :cond_0
try { // :try_start_0
final String v0 = "requestRelaunchActivity"; // const-string v0, "requestRelaunchActivity"
/* const/16 v2, 0x9 */
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
/* .line 2 */
/* const-class v4, Landroid/os/IBinder; */
/* aput-object v4, v2, v3 */
/* const-class v3, Ljava/util/List; */
int v4 = 1; // const/4 v4, 0x1
/* aput-object v3, v2, v4 */
int v3 = 2; // const/4 v3, 0x2
/* const-class v5, Ljava/util/List; */
/* aput-object v5, v2, v3 */
int v3 = 3; // const/4 v3, 0x3
v5 = java.lang.Integer.TYPE;
/* aput-object v5, v2, v3 */
int v3 = 4; // const/4 v3, 0x4
v5 = java.lang.Boolean.TYPE;
/* aput-object v5, v2, v3 */
int v3 = 5; // const/4 v3, 0x5
/* const-class v5, Landroid/content/res/Configuration; */
/* aput-object v5, v2, v3 */
int v3 = 6; // const/4 v3, 0x6
/* const-class v5, Landroid/content/res/Configuration; */
/* aput-object v5, v2, v3 */
int v3 = 7; // const/4 v3, 0x7
v5 = java.lang.Boolean.TYPE;
/* aput-object v5, v2, v3 */
/* const/16 v3, 0x8 */
v5 = java.lang.Boolean.TYPE;
/* aput-object v5, v2, v3 */
(( java.lang.Class ) p0 ).getDeclaredMethod ( v0, v2 ); // invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 3 */
(( java.lang.reflect.Method ) p0 ).setAccessible ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/reflect/Method;->setAccessible(Z)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
} // :cond_1
} // :goto_0
} // .end method
public static Boolean d ( ) {
/* .locals 2 */
/* .line 1 */
/* const/16 v1, 0x1a */
/* if-eq v0, v1, :cond_1 */
/* const/16 v1, 0x1b */
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
