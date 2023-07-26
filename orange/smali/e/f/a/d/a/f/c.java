public abstract class e.f.a.d.a.f.c {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<StateT:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.f.a.d.a.e.a a;
public final android.content.IntentFilter b;
public final android.content.Context c;
public final java.util.Set d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Le/f/a/d/a/f/a<", */
/* "TStateT;>;>;" */
/* } */
} // .end annotation
} // .end field
public e.f.a.d.a.f.b e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/d/a/f/b;" */
/* } */
} // .end annotation
} // .end field
public volatile Boolean f;
/* # direct methods */
public e.f.a.d.a.f.c ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.d = v0;
int v0 = 0; // const/4 v0, 0x0
this.e = v0;
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Le/f/a/d/a/f/c;->f:Z */
this.a = p1;
this.b = p2;
e.f.a.d.a.g.a .a ( p3 );
this.c = p1;
return;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 3 */
/* iget-boolean v0, p0, Le/f/a/d/a/f/c;->f:Z */
/* if-nez v0, :cond_0 */
v0 = v0 = this.d;
/* if-nez v0, :cond_1 */
} // :cond_0
v0 = this.e;
/* if-nez v0, :cond_1 */
/* new-instance v0, Le/f/a/d/a/f/b; */
/* invoke-direct {v0, p0}, Le/f/a/d/a/f/b;-><init>(Le/f/a/d/a/f/c;)V */
this.e = v0;
v1 = this.c;
v2 = this.b;
(( android.content.Context ) v1 ).registerReceiver ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
} // :cond_1
/* iget-boolean v0, p0, Le/f/a/d/a/f/c;->f:Z */
/* if-nez v0, :cond_2 */
v0 = v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_2
v1 = this.c;
(( android.content.Context ) v1 ).unregisterReceiver ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
int v0 = 0; // const/4 v0, 0x0
this.e = v0;
} // :cond_2
return;
} // .end method
public abstract void a ( android.content.Context p0, android.content.Intent p1 ) {
} // .end method
public synchronized final void a ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TStateT;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
try { // :try_start_0
/* new-instance v0, Ljava/util/HashSet; */
v1 = this.d;
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
(( java.util.HashSet ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Le/f/a/d/a/f/a; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized final void a ( Boolean p0 ) {
/* .locals 0 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput-boolean p1, p0, Le/f/a/d/a/f/c;->f:Z */
(( e.f.a.d.a.f.c ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/d/a/f/c;->a()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized final Boolean b ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.e;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
