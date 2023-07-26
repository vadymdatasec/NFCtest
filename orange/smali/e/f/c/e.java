public class e.f.c.e implements e.f.a.b.c.l.k.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/TargetApi; */
	 /* value = 0xe */
} // .end annotation
/* # static fields */
public static java.util.concurrent.atomic.AtomicReference a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/atomic/AtomicReference<", */
/* "Le/f/c/e;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.c.e ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicReference; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V */
return;
} // .end method
public e.f.c.e ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static void a ( android.content.Context p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
e.f.c.e .b ( p0 );
return;
} // .end method
public static void b ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = e.f.a.b.c.p.h .a ( );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
(( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* instance-of v0, v0, Landroid/app/Application; */
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
(( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* check-cast p0, Landroid/app/Application; */
/* .line 4 */
v0 = e.f.c.e.a;
(( java.util.concurrent.atomic.AtomicReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
/* if-nez v0, :cond_1 */
/* .line 5 */
/* new-instance v0, Le/f/c/e; */
/* invoke-direct {v0}, Le/f/c/e;-><init>()V */
/* .line 6 */
v1 = e.f.c.e.a;
int v2 = 0; // const/4 v2, 0x0
v1 = (( java.util.concurrent.atomic.AtomicReference ) v1 ).compareAndSet ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 7 */
e.f.a.b.c.l.k.b .a ( p0 );
/* .line 8 */
e.f.a.b.c.l.k.b .b ( );
(( e.f.a.b.c.l.k.b ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/b/c/l/k/b;->a(Le/f/a/b/c/l/k/a;)V
} // :cond_1
} // :goto_0
return;
} // .end method
/* # virtual methods */
public void a ( Boolean p0 ) {
/* .locals 4 */
/* .line 2 */
e.f.c.h .i ( );
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
/* new-instance v1, Ljava/util/ArrayList; */
v2 = e.f.c.h.k;
/* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
(( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Le/f/c/h; */
/* .line 4 */
e.f.c.h .b ( v2 );
v3 = (( java.util.concurrent.atomic.AtomicBoolean ) v3 ).get ( ); // invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 5 */
e.f.c.h .a ( v2,p1 );
/* .line 6 */
} // :cond_1
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
