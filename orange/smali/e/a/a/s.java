public class e.a.a.s {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.concurrent.atomic.AtomicInteger a;
	 public final java.util.Set b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Le/a/a/p<", */
	 /* "*>;>;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.concurrent.PriorityBlockingQueue c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/PriorityBlockingQueue<", */
/* "Le/a/a/p<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.concurrent.PriorityBlockingQueue d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/PriorityBlockingQueue<", */
/* "Le/a/a/p<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
public final e.a.a.b e;
public final e.a.a.j f;
public final e.a.a.w g;
public final e.a.a.k h;
public e.a.a.d i;
public final java.util.List j;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/a/a/r;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.List k;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/a/a/q;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.a.a.s ( ) {
/* .locals 3 */
/* .line 12 */
/* new-instance v0, Le/a/a/h; */
/* new-instance v1, Landroid/os/Handler; */
/* .line 13 */
android.os.Looper .getMainLooper ( );
/* invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* invoke-direct {v0, v1}, Le/a/a/h;-><init>(Landroid/os/Handler;)V */
/* .line 14 */
/* invoke-direct {p0, p1, p2, p3, v0}, Le/a/a/s;-><init>(Le/a/a/b;Le/a/a/j;ILe/a/a/w;)V */
return;
} // .end method
public e.a.a.s ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.b = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue; */
/* invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V */
this.c = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue; */
/* invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V */
this.d = v0;
/* .line 6 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.j = v0;
/* .line 7 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.k = v0;
/* .line 8 */
this.e = p1;
/* .line 9 */
this.f = p2;
/* .line 10 */
/* new-array p1, p3, [Le/a/a/k; */
this.h = p1;
/* .line 11 */
this.g = p4;
return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( java.util.concurrent.atomic.AtomicInteger ) v0 ).incrementAndGet ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
} // .end method
public e.a.a.p a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/a/a/p<", */
/* "TT;>;)", */
/* "Le/a/a/p<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 2 */
(( e.a.a.p ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Le/a/a/p;->a(Le/a/a/s;)Le/a/a/p;
/* .line 3 */
v0 = this.b;
/* monitor-enter v0 */
/* .line 4 */
try { // :try_start_0
v1 = this.b;
/* .line 5 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
v0 = (( e.a.a.s ) p0 ).a ( ); // invoke-virtual {p0}, Le/a/a/s;->a()I
(( e.a.a.p ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->b(I)Le/a/a/p;
final String v0 = "add-to-queue"; // const-string v0, "add-to-queue"
/* .line 7 */
(( e.a.a.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
(( e.a.a.s ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/a/a/s;->a(Le/a/a/p;I)V
/* .line 9 */
(( e.a.a.s ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/s;->b(Le/a/a/p;)V
/* :catchall_0 */
/* move-exception p1 */
/* .line 10 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
public void a ( Object p0, Integer p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;I)V" */
/* } */
} // .end annotation
/* .line 11 */
v0 = this.k;
/* monitor-enter v0 */
/* .line 12 */
try { // :try_start_0
v1 = this.k;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Le/a/a/q; */
/* .line 13 */
/* .line 14 */
} // :cond_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public void b ( ) {
/* .locals 6 */
/* .line 1 */
(( e.a.a.s ) p0 ).c ( ); // invoke-virtual {p0}, Le/a/a/s;->c()V
/* .line 2 */
/* new-instance v0, Le/a/a/d; */
v1 = this.c;
v2 = this.d;
v3 = this.e;
v4 = this.g;
/* invoke-direct {v0, v1, v2, v3, v4}, Le/a/a/d;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Le/a/a/b;Le/a/a/w;)V */
this.i = v0;
/* .line 3 */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
} // :goto_0
v1 = this.h;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_0 */
/* .line 5 */
/* new-instance v1, Le/a/a/k; */
v2 = this.d;
v3 = this.f;
v4 = this.e;
v5 = this.g;
/* invoke-direct {v1, v2, v3, v4, v5}, Le/a/a/k;-><init>(Ljava/util/concurrent/BlockingQueue;Le/a/a/j;Le/a/a/b;Le/a/a/w;)V */
/* .line 6 */
v2 = this.h;
/* aput-object v1, v2, v0 */
/* .line 7 */
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/a/a/p<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 8 */
v0 = (( e.a.a.p ) p1 ).u ( ); // invoke-virtual {p1}, Le/a/a/p;->u()Z
/* if-nez v0, :cond_0 */
/* .line 9 */
(( e.a.a.s ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/s;->d(Le/a/a/p;)V
/* .line 10 */
} // :cond_0
v0 = this.c;
(( java.util.concurrent.PriorityBlockingQueue ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z
} // :goto_0
return;
} // .end method
public void c ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.a.a.d ) v0 ).b ( ); // invoke-virtual {v0}, Le/a/a/d;->b()V
/* .line 3 */
} // :cond_0
v0 = this.h;
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_2 */
/* aget-object v3, v0, v2 */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 4 */
(( e.a.a.k ) v3 ).b ( ); // invoke-virtual {v3}, Le/a/a/k;->b()V
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
return;
} // .end method
public void c ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/a/a/p<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 5 */
v0 = this.b;
/* monitor-enter v0 */
/* .line 6 */
try { // :try_start_0
v1 = this.b;
/* .line 7 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 8 */
v1 = this.j;
/* monitor-enter v1 */
/* .line 9 */
try { // :try_start_1
v0 = this.j;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Le/a/a/r; */
/* .line 10 */
/* .line 11 */
} // :cond_0
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
int v0 = 5; // const/4 v0, 0x5
/* .line 12 */
(( e.a.a.s ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/a/a/s;->a(Le/a/a/p;I)V
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 13 */
try { // :try_start_2
/* monitor-exit v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw p1 */
/* :catchall_1 */
/* move-exception p1 */
/* .line 14 */
try { // :try_start_3
/* monitor-exit v0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* throw p1 */
} // .end method
public void d ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/a/a/p<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.d;
(( java.util.concurrent.PriorityBlockingQueue ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z
return;
} // .end method
