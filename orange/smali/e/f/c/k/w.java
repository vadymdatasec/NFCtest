public class e.f.c.k.w implements e.f.c.o.d implements e.f.c.o.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;", */
	 /* "Ljava/util/concurrent/ConcurrentHashMap<", */
	 /* "Le/f/c/o/b<", */
	 /* "Ljava/lang/Object;", */
	 /* ">;", */
	 /* "Ljava/util/concurrent/Executor;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
public java.util.Queue b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Queue<", */
/* "Le/f/c/o/a<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.concurrent.Executor c;
/* # direct methods */
public e.f.c.k.w ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayDeque; */
/* invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V */
this.b = v0;
/* .line 4 */
this.c = p1;
return;
} // .end method
public static void a ( java.util.Map$Entry p0, Object p1 ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p0, Le/f/c/o/b; */
return;
} // .end method
/* # virtual methods */
public synchronized final java.util.Set a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/o/a<", */
/* "*>;)", */
/* "Ljava/util/Set<", */
/* "Ljava/util/Map$Entry<", */
/* "Le/f/c/o/b<", */
/* "Ljava/lang/Object;", */
/* ">;", */
/* "Ljava/util/concurrent/Executor;", */
/* ">;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
v0 = this.a;
(( e.f.c.o.a ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/o/a;->a()Ljava/lang/Class;
/* check-cast p1, Ljava/util/Map; */
/* if-nez p1, :cond_0 */
/* .line 3 */
java.util.Collections .emptySet ( );
} // :cond_0
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 12 */
/* monitor-enter p0 */
/* .line 13 */
try { // :try_start_0
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 14 */
v0 = this.b;
/* .line 15 */
this.b = v1;
/* move-object v1, v0 */
/* .line 16 */
} // :cond_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 17 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/f/c/o/a; */
/* .line 18 */
(( e.f.c.k.w ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/k/w;->b(Le/f/c/o/a;)V
} // :cond_1
return;
/* :catchall_0 */
/* move-exception v0 */
/* .line 19 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
public void a ( java.lang.Class p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TT;>;", */
/* "Le/f/c/o/b<", */
/* "-TT;>;)V" */
/* } */
} // .end annotation
/* .line 11 */
v0 = this.c;
(( e.f.c.k.w ) p0 ).a ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Le/f/c/k/w;->a(Ljava/lang/Class;Ljava/util/concurrent/Executor;Le/f/c/o/b;)V
return;
} // .end method
public synchronized void a ( java.lang.Class p0, java.util.concurrent.Executor p1, Object p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TT;>;", */
/* "Ljava/util/concurrent/Executor;", */
/* "Le/f/c/o/b<", */
/* "-TT;>;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 4 */
try { // :try_start_0
e.f.c.k.y .a ( p1 );
/* .line 5 */
e.f.c.k.y .a ( p3 );
/* .line 6 */
e.f.c.k.y .a ( p2 );
/* .line 7 */
v0 = v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 8 */
v0 = this.a;
/* new-instance v1, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
/* .line 9 */
} // :cond_0
v0 = this.a;
/* check-cast p1, Ljava/util/concurrent/ConcurrentHashMap; */
(( java.util.concurrent.ConcurrentHashMap ) p1 ).put ( p3, p2 ); // invoke-virtual {p1, p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 10 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void b ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/o/a<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.k.y .a ( p1 );
/* .line 2 */
/* monitor-enter p0 */
/* .line 3 */
try { // :try_start_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v0 = this.b;
/* .line 5 */
/* monitor-exit p0 */
return;
/* .line 6 */
} // :cond_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 7 */
(( e.f.c.k.w ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/k/w;->a(Le/f/c/o/a;)Ljava/util/Set;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 8 */
/* check-cast v2, Ljava/util/concurrent/Executor; */
e.f.c.k.v .a ( v1,p1 );
} // :cond_1
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 9 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
