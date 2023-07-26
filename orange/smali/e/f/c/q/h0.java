public class e.f.c.q.h0 implements android.content.ServiceConnection {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final android.content.Intent b;
	 public final java.util.concurrent.ScheduledExecutorService c;
	 public final java.util.Queue d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Queue<", */
	 /* "Le/f/c/q/g0;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public e.f.c.q.d0 e;
public Boolean f;
/* # direct methods */
public e.f.c.q.h0 ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor; */
/* new-instance v1, Le/f/a/b/c/p/l/a; */
final String v2 = "Firebase-FirebaseInstanceIdServiceConnection"; // const-string v2, "Firebase-FirebaseInstanceIdServiceConnection"
/* invoke-direct {v1, v2}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V */
/* invoke-direct {p0, p1, p2, v0}, Le/f/c/q/h0;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/concurrent/ScheduledExecutorService;)V */
return;
} // .end method
public e.f.c.q.h0 ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayDeque; */
/* invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V */
this.d = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput-boolean v0, p0, Le/f/c/q/h0;->f:Z */
/* .line 5 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.a = p1;
/* .line 6 */
/* new-instance p1, Landroid/content/Intent; */
/* invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
p2 = this.a;
(( android.content.Context ) p2 ).getPackageName ( ); // invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( android.content.Intent ) p1 ).setPackage ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
this.b = p1;
/* .line 7 */
this.c = p3;
return;
} // .end method
/* # virtual methods */
public synchronized e.f.a.b.h.g a ( android.content.Intent p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Intent;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
try { // :try_start_0
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
int v1 = 3; // const/4 v1, 0x3
/* .line 1 */
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
	 final String v1 = "new intent queued in the bind-strategy delivery"; // const-string v1, "new intent queued in the bind-strategy delivery"
	 /* .line 2 */
	 android.util.Log .d ( v0,v1 );
	 /* .line 3 */
} // :cond_0
/* new-instance v0, Le/f/c/q/g0; */
/* invoke-direct {v0, p1}, Le/f/c/q/g0;-><init>(Landroid/content/Intent;)V */
/* .line 4 */
p1 = this.c;
(( e.f.c.q.g0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/q/g0;->a(Ljava/util/concurrent/ScheduledExecutorService;)V
/* .line 5 */
p1 = this.d;
/* .line 6 */
(( e.f.c.q.h0 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/q/h0;->b()V
/* .line 7 */
(( e.f.c.q.g0 ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/q/g0;->b()Le/f/a/b/h/g;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final void a ( ) {
/* .locals 1 */
/* .line 8 */
} // :goto_0
v0 = v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 9 */
v0 = this.d;
/* check-cast v0, Le/f/c/q/g0; */
(( e.f.c.q.g0 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/q/g0;->a()V
} // :cond_0
return;
} // .end method
public synchronized final void b ( ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
int v1 = 3; // const/4 v1, 0x3
/* .line 1 */
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
final String v2 = "flush queue called"; // const-string v2, "flush queue called"
/* .line 2 */
android.util.Log .d ( v0,v2 );
/* .line 3 */
} // :cond_0
} // :goto_0
v0 = v0 = this.d;
/* if-nez v0, :cond_4 */
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
/* .line 4 */
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
final String v2 = "found intent to be delivered"; // const-string v2, "found intent to be delivered"
/* .line 5 */
android.util.Log .d ( v0,v2 );
/* .line 6 */
} // :cond_1
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.e;
v0 = (( android.os.Binder ) v0 ).isBinderAlive ( ); // invoke-virtual {v0}, Landroid/os/Binder;->isBinderAlive()Z
if ( v0 != null) { // if-eqz v0, :cond_3
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
/* .line 7 */
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_2
	 final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
	 final String v2 = "binder is alive, sending the intent."; // const-string v2, "binder is alive, sending the intent."
	 /* .line 8 */
	 android.util.Log .d ( v0,v2 );
	 /* .line 9 */
} // :cond_2
v0 = this.d;
/* check-cast v0, Le/f/c/q/g0; */
/* .line 10 */
v2 = this.e;
(( e.f.c.q.d0 ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Le/f/c/q/d0;->a(Le/f/c/q/g0;)V
/* .line 11 */
} // :cond_3
(( e.f.c.q.h0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/q/h0;->c()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 12 */
/* monitor-exit p0 */
return;
/* .line 13 */
} // :cond_4
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final void c ( ) {
/* .locals 5 */
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
int v1 = 3; // const/4 v1, 0x3
/* .line 1 */
v1 = android.util.Log .isLoggable ( v0,v1 );
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
/* iget-boolean v1, p0, Le/f/c/q/h0;->f:Z */
/* xor-int/2addr v1, v2 */
/* const/16 v3, 0x27 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "binder is dead.start connection? "; // const-string v3, "binder is dead.start connection? "
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 3 */
} // :cond_0
/* iget-boolean v1, p0, Le/f/c/q/h0;->f:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
return;
/* .line 4 */
} // :cond_1
/* iput-boolean v2, p0, Le/f/c/q/h0;->f:Z */
/* .line 5 */
try { // :try_start_0
e.f.a.b.c.o.a .a ( );
v2 = this.a;
v3 = this.b;
/* const/16 v4, 0x41 */
/* .line 6 */
v1 = (( e.f.a.b.c.o.a ) v1 ).a ( v2, v3, p0, v4 ); // invoke-virtual {v1, v2, v3, p0, v4}, Le/f/a/b/c/o/a;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
if ( v1 != null) { // if-eqz v1, :cond_2
return;
} // :cond_2
final String v1 = "binding to the service failed"; // const-string v1, "binding to the service failed"
/* .line 7 */
android.util.Log .e ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
final String v2 = "Exception while binding the service"; // const-string v2, "Exception while binding the service"
/* .line 8 */
android.util.Log .e ( v0,v2,v1 );
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
/* iput-boolean v0, p0, Le/f/c/q/h0;->f:Z */
/* .line 10 */
(( e.f.c.q.h0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/h0;->a()V
return;
} // .end method
public synchronized void onServiceConnected ( android.content.ComponentName p0, android.os.IBinder p1 ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
int v1 = 3; // const/4 v1, 0x3
/* .line 1 */
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
/* .line 2 */
java.lang.String .valueOf ( p1 );
java.lang.String .valueOf ( p1 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x14 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "onServiceConnected: "; // const-string v1, "onServiceConnected: "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* iput-boolean p1, p0, Le/f/c/q/h0;->f:Z */
/* .line 4 */
/* instance-of p1, p2, Le/f/c/q/d0; */
/* if-nez p1, :cond_1 */
final String p1 = "FirebaseInstanceId"; // const-string p1, "FirebaseInstanceId"
/* .line 5 */
java.lang.String .valueOf ( p2 );
java.lang.String .valueOf ( p2 );
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/lit8 v0, v0, 0x1c */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v0 = "Invalid service connection: "; // const-string v0, "Invalid service connection: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( p1,p2 );
/* .line 6 */
(( e.f.c.q.h0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/q/h0;->a()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 7 */
/* monitor-exit p0 */
return;
/* .line 8 */
} // :cond_1
try { // :try_start_1
/* check-cast p2, Le/f/c/q/d0; */
this.e = p2;
/* .line 9 */
(( e.f.c.q.h0 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/q/h0;->b()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 10 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void onServiceDisconnected ( android.content.ComponentName p0 ) {
/* .locals 3 */
final String v0 = "FirebaseInstanceId"; // const-string v0, "FirebaseInstanceId"
int v1 = 3; // const/4 v1, 0x3
/* .line 1 */
v1 = android.util.Log .isLoggable ( v0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
java.lang.String .valueOf ( p1 );
java.lang.String .valueOf ( p1 );
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v1, 0x17 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v1 = "onServiceDisconnected: "; // const-string v1, "onServiceDisconnected: "
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,p1 );
/* .line 3 */
} // :cond_0
(( e.f.c.q.h0 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/q/h0;->b()V
return;
} // .end method
