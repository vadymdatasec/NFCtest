public class e.b.a.b0.e {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.concurrent.atomic.AtomicReference a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/atomic/AtomicReference<", */
	 /* "Le/b/a/e0/q;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final c.e.b b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/b<", */
/* "Le/b/a/e0/q;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Class<", */
/* "*>;>;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.b0.e ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicReference; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public java.util.List a ( java.lang.Class p0, java.lang.Class p1, java.lang.Class p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Class<", */
/* "*>;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( java.util.concurrent.atomic.AtomicReference ) v0 ).getAndSet ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Le/b/a/e0/q; */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Le/b/a/e0/q; */
/* invoke-direct {v0, p1, p2, p3}, Le/b/a/e0/q;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V */
/* .line 3 */
} // :cond_0
(( e.b.a.e0.q ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/b/a/e0/q;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
/* .line 4 */
} // :goto_0
p1 = this.b;
/* monitor-enter p1 */
/* .line 5 */
try { // :try_start_0
p2 = this.b;
(( c.e.i ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p2, Ljava/util/List; */
/* .line 6 */
/* monitor-exit p1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 7 */
p1 = this.a;
(( java.util.concurrent.atomic.AtomicReference ) p1 ).set ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
/* :catchall_0 */
/* move-exception p2 */
/* .line 8 */
try { // :try_start_1
/* monitor-exit p1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p2 */
} // .end method
public void a ( java.lang.Class p0, java.lang.Class p1, java.lang.Class p2, java.util.List p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/util/List<", */
/* "Ljava/lang/Class<", */
/* "*>;>;)V" */
/* } */
} // .end annotation
/* .line 9 */
v0 = this.b;
/* monitor-enter v0 */
/* .line 10 */
try { // :try_start_0
v1 = this.b;
/* new-instance v2, Le/b/a/e0/q; */
/* invoke-direct {v2, p1, p2, p3}, Le/b/a/e0/q;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V */
(( c.e.i ) v1 ).put ( v2, p4 ); // invoke-virtual {v1, v2, p4}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 11 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
