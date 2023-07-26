public class e.f.a.b.b.e {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Integer h;
	 public static android.app.PendingIntent i;
	 public static final java.util.concurrent.Executor j;
	 /* # instance fields */
	 public final c.e.i a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/i<", */
	 /* "Ljava/lang/String;", */
	 /* "Le/f/a/b/h/h<", */
	 /* "Landroid/os/Bundle;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
public final android.content.Context b;
public final e.f.a.b.b.w c;
public final java.util.concurrent.ScheduledExecutorService d;
public android.os.Messenger e;
public android.os.Messenger f;
public e.f.a.b.b.g g;
/* # direct methods */
public static e.f.a.b.b.e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.f.a.b.b.e0.a;
return;
} // .end method
public e.f.a.b.b.e ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/e/i; */
/* invoke-direct {v0}, Lc/e/i;-><init>()V */
this.a = v0;
/* .line 3 */
this.b = p1;
/* .line 4 */
/* new-instance v0, Le/f/a/b/b/w; */
/* invoke-direct {v0, p1}, Le/f/a/b/b/w;-><init>(Landroid/content/Context;)V */
this.c = v0;
/* .line 5 */
/* new-instance p1, Landroid/os/Messenger; */
/* new-instance v0, Le/f/a/b/b/d0; */
/* .line 6 */
android.os.Looper .getMainLooper ( );
/* invoke-direct {v0, p0, v1}, Le/f/a/b/b/d0;-><init>(Le/f/a/b/b/e;Landroid/os/Looper;)V */
/* invoke-direct {p1, v0}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V */
this.e = p1;
/* .line 7 */
/* new-instance p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor; */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V */
/* .line 8 */
v1 = java.util.concurrent.TimeUnit.SECONDS;
/* const-wide/16 v2, 0x3c */
(( java.util.concurrent.ScheduledThreadPoolExecutor ) p1 ).setKeepAliveTime ( v2, v3, v1 ); // invoke-virtual {p1, v2, v3, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setKeepAliveTime(JLjava/util/concurrent/TimeUnit;)V
/* .line 9 */
(( java.util.concurrent.ScheduledThreadPoolExecutor ) p1 ).allowCoreThreadTimeOut ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
/* .line 10 */
this.d = p1;
return;
} // .end method
public static final android.os.Bundle a ( Object p0 ) { //synthethic
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 79 */
v0 = (( e.f.a.b.h.g ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 80 */
(( e.f.a.b.h.g ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->b()Ljava/lang/Object;
/* check-cast p0, Landroid/os/Bundle; */
} // :cond_0
int v0 = 3; // const/4 v0, 0x3
final String v1 = "Rpc"; // const-string v1, "Rpc"
/* .line 81 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 82 */
(( e.f.a.b.h.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;
java.lang.String .valueOf ( v0 );
java.lang.String .valueOf ( v0 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x16 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "Error making request: "; // const-string v2, "Error making request: "
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v0 );
/* .line 83 */
} // :cond_1
/* new-instance v0, Ljava/io/IOException; */
(( e.f.a.b.h.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;
final String v1 = "SERVICE_NOT_AVAILABLE"; // const-string v1, "SERVICE_NOT_AVAILABLE"
/* invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public static synchronized java.lang.String a ( ) {
/* .locals 3 */
/* const-class v0, Le/f/a/b/b/e; */
/* monitor-enter v0 */
/* .line 67 */
try { // :try_start_0
/* add-int/lit8 v2, v1, 0x1 */
java.lang.Integer .toString ( v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* throw v1 */
} // .end method
public static synchronized void a ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 3 */
/* const-class v0, Le/f/a/b/b/e; */
/* monitor-enter v0 */
/* .line 45 */
try { // :try_start_0
	 v1 = e.f.a.b.b.e.i;
	 /* if-nez v1, :cond_0 */
	 /* .line 46 */
	 /* new-instance v1, Landroid/content/Intent; */
	 /* invoke-direct {v1}, Landroid/content/Intent;-><init>()V */
	 final String v2 = "com.google.example.invalidpackage"; // const-string v2, "com.google.example.invalidpackage"
	 /* .line 47 */
	 (( android.content.Intent ) v1 ).setPackage ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 48 */
	 android.app.PendingIntent .getBroadcast ( p0,v2,v1,v2 );
} // :cond_0
final String p0 = "app"; // const-string p0, "app"
/* .line 49 */
v1 = e.f.a.b.b.e.i;
(( android.content.Intent ) p1 ).putExtra ( p0, v1 ); // invoke-virtual {p1, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 50 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* throw p0 */
} // .end method
public static void a ( Object p0, android.os.Message p1 ) { //synthethic
/* .locals 0 */
/* .line 84 */
(( e.f.a.b.b.e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/b/b/e;->a(Landroid/os/Message;)V
return;
} // .end method
public static final void a ( Object p0 ) { //synthethic
/* .locals 2 */
/* .line 73 */
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "TIMEOUT"; // const-string v1, "TIMEOUT"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
p0 = (( e.f.a.b.h.h ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/b/h/h;->b(Ljava/lang/Exception;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
	 final String p0 = "Rpc"; // const-string p0, "Rpc"
	 final String v0 = "No response"; // const-string v0, "No response"
	 /* .line 74 */
	 android.util.Log .w ( p0,v0 );
} // :cond_0
return;
} // .end method
public static final e.f.a.b.h.g c ( android.os.Bundle p0 ) { //synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.f.a.b.b.e .d ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 2 */
e.f.a.b.h.n .a ( p0 );
/* .line 3 */
} // :cond_0
e.f.a.b.h.n .a ( p0 );
} // .end method
public static Boolean d ( android.os.Bundle p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
final String v0 = "google.messenger"; // const-string v0, "google.messenger"
/* .line 1 */
p0 = (( android.os.Bundle ) p0 ).containsKey ( v0 ); // invoke-virtual {p0, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
	 int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( android.os.Bundle p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/os/Bundle;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Landroid/os/Bundle;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 57 */
v0 = this.c;
v0 = (( e.f.a.b.b.w ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/a/b/b/w;->b()I
int v1 = 1; // const/4 v1, 0x1
/* const v2, 0xb71b00 */
/* if-lt v0, v2, :cond_0 */
/* .line 58 */
v0 = this.b;
/* .line 59 */
e.f.a.b.b.k .a ( v0 );
/* .line 60 */
(( e.f.a.b.b.k ) v0 ).b ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/f/a/b/b/k;->b(ILandroid/os/Bundle;)Le/f/a/b/h/g;
/* .line 61 */
v0 = e.f.a.b.b.e.j;
v1 = e.f.a.b.b.y.a;
(( e.f.a.b.h.g ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
/* .line 62 */
} // :cond_0
v0 = this.c;
/* .line 63 */
v0 = (( e.f.a.b.b.w ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/b/w;->a()I
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-nez v1, :cond_2 */
/* .line 64 */
/* new-instance p1, Ljava/io/IOException; */
final String v0 = "MISSING_INSTANCEID_SERVICE"; // const-string v0, "MISSING_INSTANCEID_SERVICE"
/* invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
e.f.a.b.h.n .a ( p1 );
/* .line 65 */
} // :cond_2
(( e.f.a.b.b.e ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/b/b/e;->b(Landroid/os/Bundle;)Le/f/a/b/h/g;
v1 = e.f.a.b.b.e.j;
/* new-instance v2, Le/f/a/b/b/a0; */
/* invoke-direct {v2, p0, p1}, Le/f/a/b/b/a0;-><init>(Le/f/a/b/b/e;Landroid/os/Bundle;)V */
/* .line 66 */
(( e.f.a.b.h.g ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->b(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
} // .end method
public final e.f.a.b.h.g a ( android.os.Bundle p0, Object p1 ) { //synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 75 */
v0 = (( e.f.a.b.h.g ) p2 ).e ( ); // invoke-virtual {p2}, Le/f/a/b/h/g;->e()Z
/* if-nez v0, :cond_0 */
/* .line 76 */
} // :cond_0
(( e.f.a.b.h.g ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/a/b/h/g;->b()Ljava/lang/Object;
/* check-cast v0, Landroid/os/Bundle; */
v0 = e.f.a.b.b.e .d ( v0 );
/* if-nez v0, :cond_1 */
/* .line 77 */
} // :cond_1
(( e.f.a.b.b.e ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/b/b/e;->b(Landroid/os/Bundle;)Le/f/a/b/h/g;
p2 = e.f.a.b.b.e.j;
v0 = e.f.a.b.b.b0.a;
/* .line 78 */
(( e.f.a.b.h.g ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;
} // .end method
public final void a ( android.os.Message p0 ) {
/* .locals 7 */
if ( p1 != null) { // if-eqz p1, :cond_14
/* .line 1 */
v0 = this.obj;
/* instance-of v1, v0, Landroid/content/Intent; */
if ( v1 != null) { // if-eqz v1, :cond_14
/* .line 2 */
/* check-cast v0, Landroid/content/Intent; */
/* .line 3 */
/* new-instance v1, Le/f/a/b/b/f; */
/* invoke-direct {v1}, Le/f/a/b/b/f;-><init>()V */
(( android.content.Intent ) v0 ).setExtrasClassLoader ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V
final String v1 = "google.messenger"; // const-string v1, "google.messenger"
/* .line 4 */
v1 = (( android.content.Intent ) v0 ).hasExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
final String v1 = "google.messenger"; // const-string v1, "google.messenger"
/* .line 5 */
(( android.content.Intent ) v0 ).getParcelableExtra ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
/* .line 6 */
/* instance-of v1, v0, Le/f/a/b/b/g; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
/* move-object v1, v0 */
/* check-cast v1, Le/f/a/b/b/g; */
this.g = v1;
/* .line 8 */
} // :cond_0
/* instance-of v1, v0, Landroid/os/Messenger; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 9 */
/* check-cast v0, Landroid/os/Messenger; */
this.f = v0;
/* .line 10 */
} // :cond_1
p1 = this.obj;
/* check-cast p1, Landroid/content/Intent; */
/* .line 11 */
(( android.content.Intent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "com.google.android.c2dm.intent.REGISTRATION"; // const-string v1, "com.google.android.c2dm.intent.REGISTRATION"
/* .line 12 */
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v2 = 3; // const/4 v2, 0x3
/* if-nez v1, :cond_4 */
final String p1 = "Rpc"; // const-string p1, "Rpc"
/* .line 13 */
p1 = android.util.Log .isLoggable ( p1,v2 );
if ( p1 != null) { // if-eqz p1, :cond_3
final String p1 = "Unexpected response action: "; // const-string p1, "Unexpected response action: "
/* .line 14 */
java.lang.String .valueOf ( v0 );
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_2
(( java.lang.String ) p1 ).concat ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_2
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object p1, v0 */
} // :goto_0
final String v0 = "Rpc"; // const-string v0, "Rpc"
android.util.Log .d ( v0,p1 );
} // :cond_3
return;
} // :cond_4
final String v0 = "registration_id"; // const-string v0, "registration_id"
/* .line 15 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v0, :cond_5 */
final String v0 = "unregistered"; // const-string v0, "unregistered"
/* .line 16 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
} // :cond_5
int v1 = 2; // const/4 v1, 0x2
int v3 = 1; // const/4 v3, 0x1
/* if-nez v0, :cond_f */
final String v0 = "error"; // const-string v0, "error"
/* .line 17 */
(( android.content.Intent ) p1 ).getStringExtra ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v0, :cond_6 */
/* .line 18 */
(( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
java.lang.String .valueOf ( p1 );
java.lang.String .valueOf ( p1 );
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/lit8 v0, v0, 0x31 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v0 = "Unexpected response, no error or registration id "; // const-string v0, "Unexpected response, no error or registration id "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "Rpc"; // const-string v0, "Rpc"
android.util.Log .w ( v0,p1 );
return;
} // :cond_6
final String v4 = "Rpc"; // const-string v4, "Rpc"
/* .line 19 */
v4 = android.util.Log .isLoggable ( v4,v2 );
if ( v4 != null) { // if-eqz v4, :cond_8
final String v4 = "Received InstanceID error "; // const-string v4, "Received InstanceID error "
/* .line 20 */
java.lang.String .valueOf ( v0 );
v6 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
if ( v6 != null) { // if-eqz v6, :cond_7
(( java.lang.String ) v4 ).concat ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_7
/* new-instance v5, Ljava/lang/String; */
/* invoke-direct {v5, v4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object v4, v5 */
} // :goto_1
final String v5 = "Rpc"; // const-string v5, "Rpc"
android.util.Log .d ( v5,v4 );
} // :cond_8
final String v4 = "|"; // const-string v4, "|"
/* .line 21 */
v4 = (( java.lang.String ) v0 ).startsWith ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_d
final String v4 = "\\|"; // const-string v4, "\\|"
/* .line 22 */
(( java.lang.String ) v0 ).split ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 23 */
/* array-length v5, v4 */
/* if-le v5, v1, :cond_b */
/* aget-object v5, v4, v3 */
final String v6 = "ID"; // const-string v6, "ID"
v5 = (( java.lang.String ) v6 ).equals ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v5, :cond_9 */
/* .line 24 */
} // :cond_9
/* aget-object v0, v4, v1 */
/* .line 25 */
/* aget-object v1, v4, v2 */
final String v2 = ":"; // const-string v2, ":"
/* .line 26 */
v2 = (( java.lang.String ) v1 ).startsWith ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_a
/* .line 27 */
(( java.lang.String ) v1 ).substring ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // :cond_a
final String v2 = "error"; // const-string v2, "error"
/* .line 28 */
(( android.content.Intent ) p1 ).putExtra ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
(( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
(( e.f.a.b.b.e ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/a/b/b/e;->a(Ljava/lang/String;Landroid/os/Bundle;)V
return;
} // :cond_b
} // :goto_2
final String p1 = "Unexpected structured response "; // const-string p1, "Unexpected structured response "
/* .line 29 */
java.lang.String .valueOf ( v0 );
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_c
(( java.lang.String ) p1 ).concat ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_c
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object p1, v0 */
} // :goto_3
final String v0 = "Rpc"; // const-string v0, "Rpc"
android.util.Log .w ( v0,p1 );
return;
/* .line 30 */
} // :cond_d
v4 = this.a;
/* monitor-enter v4 */
int v0 = 0; // const/4 v0, 0x0
/* .line 31 */
} // :goto_4
try { // :try_start_0
v1 = this.a;
v1 = (( c.e.i ) v1 ).size ( ); // invoke-virtual {v1}, Lc/e/i;->size()I
/* if-ge v0, v1, :cond_e */
/* .line 32 */
v1 = this.a;
(( c.e.i ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lc/e/i;->c(I)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
(( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
(( e.f.a.b.b.e ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/a/b/b/e;->a(Ljava/lang/String;Landroid/os/Bundle;)V
/* add-int/lit8 v0, v0, 0x1 */
/* .line 33 */
} // :cond_e
/* monitor-exit v4 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v4 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // :cond_f
final String v4 = "\\|ID\\|([^|]+)\\|:?+(.*)"; // const-string v4, "\\|ID\\|([^|]+)\\|:?+(.*)"
/* .line 34 */
java.util.regex.Pattern .compile ( v4 );
/* .line 35 */
(( java.util.regex.Pattern ) v4 ).matcher ( v0 ); // invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/* .line 36 */
v5 = (( java.util.regex.Matcher ) v4 ).matches ( ); // invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z
/* if-nez v5, :cond_12 */
final String p1 = "Rpc"; // const-string p1, "Rpc"
/* .line 37 */
p1 = android.util.Log .isLoggable ( p1,v2 );
if ( p1 != null) { // if-eqz p1, :cond_11
final String p1 = "Unexpected response string: "; // const-string p1, "Unexpected response string: "
/* .line 38 */
java.lang.String .valueOf ( v0 );
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_10
(( java.lang.String ) p1 ).concat ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_10
/* new-instance v0, Ljava/lang/String; */
/* invoke-direct {v0, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object p1, v0 */
} // :goto_5
final String v0 = "Rpc"; // const-string v0, "Rpc"
android.util.Log .d ( v0,p1 );
} // :cond_11
return;
/* .line 39 */
} // :cond_12
(( java.util.regex.Matcher ) v4 ).group ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
/* .line 40 */
(( java.util.regex.Matcher ) v4 ).group ( v1 ); // invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_13
/* .line 41 */
(( android.content.Intent ) p1 ).getExtras ( ); // invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
final String v2 = "registration_id"; // const-string v2, "registration_id"
/* .line 42 */
(( android.os.Bundle ) p1 ).putString ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 43 */
(( e.f.a.b.b.e ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/a/b/b/e;->a(Ljava/lang/String;Landroid/os/Bundle;)V
} // :cond_13
return;
} // :cond_14
final String p1 = "Rpc"; // const-string p1, "Rpc"
final String v0 = "Dropping invalid message"; // const-string v0, "Dropping invalid message"
/* .line 44 */
android.util.Log .w ( p1,v0 );
return;
} // .end method
public final void a ( java.lang.String p0, android.os.Bundle p1 ) {
/* .locals 3 */
/* .line 51 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 52 */
try { // :try_start_0
v1 = this.a;
(( c.e.i ) v1 ).remove ( p1 ); // invoke-virtual {v1, p1}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Le/f/a/b/h/h; */
/* if-nez v1, :cond_1 */
final String p2 = "Rpc"; // const-string p2, "Rpc"
final String v1 = "Missing callback for "; // const-string v1, "Missing callback for "
/* .line 53 */
java.lang.String .valueOf ( p1 );
v2 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
if ( v2 != null) { // if-eqz v2, :cond_0
(( java.lang.String ) v1 ).concat ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
/* new-instance p1, Ljava/lang/String; */
/* invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_0
android.util.Log .w ( p2,p1 );
/* .line 54 */
/* monitor-exit v0 */
return;
/* .line 55 */
} // :cond_1
(( e.f.a.b.h.h ) v1 ).a ( p2 ); // invoke-virtual {v1, p2}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V
/* .line 56 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public final void a ( java.lang.String p0, java.util.concurrent.ScheduledFuture p1, Object p2 ) { //synthethic
/* .locals 1 */
/* .line 68 */
p3 = this.a;
/* monitor-enter p3 */
/* .line 69 */
try { // :try_start_0
v0 = this.a;
(( c.e.i ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 70 */
/* monitor-exit p3 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 71 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 72 */
try { // :try_start_1
/* monitor-exit p3 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
public final e.f.a.b.h.g b ( android.os.Bundle p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/os/Bundle;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Landroid/os/Bundle;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.a.b.b.e .a ( );
/* .line 2 */
/* new-instance v1, Le/f/a/b/h/h; */
/* invoke-direct {v1}, Le/f/a/b/h/h;-><init>()V */
/* .line 3 */
v2 = this.a;
/* monitor-enter v2 */
/* .line 4 */
try { // :try_start_0
v3 = this.a;
(( c.e.i ) v3 ).put ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 5 */
/* monitor-exit v2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
/* new-instance v2, Landroid/content/Intent; */
/* invoke-direct {v2}, Landroid/content/Intent;-><init>()V */
final String v3 = "com.google.android.gms"; // const-string v3, "com.google.android.gms"
/* .line 7 */
(( android.content.Intent ) v2 ).setPackage ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
/* .line 8 */
v3 = this.c;
v3 = (( e.f.a.b.b.w ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/a/b/b/w;->a()I
int v4 = 2; // const/4 v4, 0x2
/* if-ne v3, v4, :cond_0 */
final String v3 = "com.google.iid.TOKEN_REQUEST"; // const-string v3, "com.google.iid.TOKEN_REQUEST"
/* .line 9 */
(( android.content.Intent ) v2 ).setAction ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
} // :cond_0
final String v3 = "com.google.android.c2dm.intent.REGISTER"; // const-string v3, "com.google.android.c2dm.intent.REGISTER"
/* .line 10 */
(( android.content.Intent ) v2 ).setAction ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
/* .line 11 */
} // :goto_0
(( android.content.Intent ) v2 ).putExtras ( p1 ); // invoke-virtual {v2, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 12 */
p1 = this.b;
e.f.a.b.b.e .a ( p1,v2 );
/* .line 13 */
java.lang.String .valueOf ( v0 );
p1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/lit8 p1, p1, 0x5 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, p1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p1 = "|ID|"; // const-string p1, "|ID|"
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "|"; // const-string p1, "|"
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v3 = "kid"; // const-string v3, "kid"
(( android.content.Intent ) v2 ).putExtra ( v3, p1 ); // invoke-virtual {v2, v3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
int p1 = 3; // const/4 p1, 0x3
final String v3 = "Rpc"; // const-string v3, "Rpc"
/* .line 14 */
v3 = android.util.Log .isLoggable ( v3,p1 );
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 15 */
(( android.content.Intent ) v2 ).getExtras ( ); // invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
java.lang.String .valueOf ( v3 );
java.lang.String .valueOf ( v3 );
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* add-int/lit8 v5, v5, 0x8 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v5 = "Sending "; // const-string v5, "Sending "
(( java.lang.StringBuilder ) v6 ).append ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v5 = "Rpc"; // const-string v5, "Rpc"
android.util.Log .d ( v5,v3 );
/* .line 16 */
} // :cond_1
v3 = this.e;
final String v5 = "google.messenger"; // const-string v5, "google.messenger"
(( android.content.Intent ) v2 ).putExtra ( v5, v3 ); // invoke-virtual {v2, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
/* .line 17 */
v3 = this.f;
/* if-nez v3, :cond_2 */
v3 = this.g;
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 18 */
} // :cond_2
android.os.Message .obtain ( );
/* .line 19 */
this.obj = v2;
/* .line 20 */
try { // :try_start_1
v5 = this.f;
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 21 */
v5 = this.f;
(( android.os.Messenger ) v5 ).send ( v3 ); // invoke-virtual {v5, v3}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
/* .line 22 */
} // :cond_3
v5 = this.g;
(( e.f.a.b.b.g ) v5 ).a ( v3 ); // invoke-virtual {v5, v3}, Le/f/a/b/b/g;->a(Landroid/os/Message;)V
/* :try_end_1 */
/* .catch Landroid/os/RemoteException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* nop */
final String v3 = "Rpc"; // const-string v3, "Rpc"
/* .line 23 */
p1 = android.util.Log .isLoggable ( v3,p1 );
if ( p1 != null) { // if-eqz p1, :cond_4
final String p1 = "Rpc"; // const-string p1, "Rpc"
final String v3 = "Messenger failed, fallback to startService"; // const-string v3, "Messenger failed, fallback to startService"
/* .line 24 */
android.util.Log .d ( p1,v3 );
/* .line 25 */
} // :cond_4
p1 = this.c;
p1 = (( e.f.a.b.b.w ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/b/w;->a()I
/* if-ne p1, v4, :cond_5 */
/* .line 26 */
p1 = this.b;
(( android.content.Context ) p1 ).sendBroadcast ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
/* .line 27 */
} // :cond_5
p1 = this.b;
(( android.content.Context ) p1 ).startService ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
/* .line 28 */
} // :goto_1
p1 = this.d;
/* new-instance v2, Le/f/a/b/b/z; */
/* invoke-direct {v2, v1}, Le/f/a/b/b/z;-><init>(Le/f/a/b/h/h;)V */
/* const-wide/16 v3, 0x1e */
v5 = java.util.concurrent.TimeUnit.SECONDS;
/* .line 29 */
/* .line 30 */
(( e.f.a.b.h.h ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
v3 = e.f.a.b.b.e.j;
/* new-instance v4, Le/f/a/b/b/c0; */
/* invoke-direct {v4, p0, v0, p1}, Le/f/a/b/b/c0;-><init>(Le/f/a/b/b/e;Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;)V */
/* .line 31 */
(( e.f.a.b.h.g ) v2 ).a ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)Le/f/a/b/h/g;
/* .line 32 */
(( e.f.a.b.h.h ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
/* :catchall_0 */
/* move-exception p1 */
/* .line 33 */
try { // :try_start_2
/* monitor-exit v2 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw p1 */
} // .end method
