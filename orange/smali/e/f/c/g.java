public class e.f.c.g extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/TargetApi; */
	 /* value = 0x18 */
} // .end annotation
/* # static fields */
public static java.util.concurrent.atomic.AtomicReference b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/atomic/AtomicReference<", */
/* "Le/f/c/g;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.content.Context a;
/* # direct methods */
public static e.f.c.g ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicReference; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V */
return;
} // .end method
public e.f.c.g ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
public static void a ( android.content.Context p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
e.f.c.g .b ( p0 );
return;
} // .end method
public static void b ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = e.f.c.g.b;
(( java.util.concurrent.atomic.AtomicReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Le/f/c/g; */
/* invoke-direct {v0, p0}, Le/f/c/g;-><init>(Landroid/content/Context;)V */
/* .line 3 */
v1 = e.f.c.g.b;
int v2 = 0; // const/4 v2, 0x0
v1 = (( java.util.concurrent.atomic.AtomicReference ) v1 ).compareAndSet ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
/* new-instance v1, Landroid/content/IntentFilter; */
final String v2 = "android.intent.action.USER_UNLOCKED"; // const-string v2, "android.intent.action.USER_UNLOCKED"
/* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
/* .line 5 */
(( android.content.Context ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.a;
(( android.content.Context ) v0 ).unregisterReceiver ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
return;
} // .end method
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 1 */
/* .line 1 */
e.f.c.h .i ( );
/* monitor-enter p1 */
/* .line 2 */
try { // :try_start_0
p2 = e.f.c.h.k;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Le/f/c/h; */
/* .line 3 */
e.f.c.h .a ( v0 );
/* .line 4 */
} // :cond_0
/* monitor-exit p1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 5 */
(( e.f.c.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/g;->a()V
return;
/* :catchall_0 */
/* move-exception p2 */
/* .line 6 */
try { // :try_start_1
/* monitor-exit p1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p2 */
} // .end method
