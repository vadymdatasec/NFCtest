public class e.b.a.b0.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.b.a.y.x.v0 c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/b/a/y/x/v0<", */
	 /* "***>;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public final c.e.b a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/b<", */
/* "Le/b/a/e0/q;", */
/* "Le/b/a/y/x/v0<", */
/* "***>;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.concurrent.atomic.AtomicReference b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/atomic/AtomicReference<", */
/* "Le/b/a/e0/q;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.b0.d ( ) {
/* .locals 14 */
/* .line 1 */
/* new-instance v6, Le/b/a/y/x/v0; */
/* const-class v1, Ljava/lang/Object; */
/* const-class v2, Ljava/lang/Object; */
/* const-class v3, Ljava/lang/Object; */
/* new-instance v0, Le/b/a/y/x/w; */
/* const-class v8, Ljava/lang/Object; */
/* const-class v9, Ljava/lang/Object; */
/* const-class v10, Ljava/lang/Object; */
/* .line 2 */
java.util.Collections .emptyList ( );
/* new-instance v12, Le/b/a/y/z/j/h; */
/* invoke-direct {v12}, Le/b/a/y/z/j/h;-><init>()V */
int v13 = 0; // const/4 v13, 0x0
/* move-object v7, v0 */
/* invoke-direct/range {v7 ..v13}, Le/b/a/y/x/w;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Le/b/a/y/z/j/e;Lc/h/m/d;)V */
/* .line 3 */
java.util.Collections .singletonList ( v0 );
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, v6 */
/* invoke-direct/range {v0 ..v5}, Le/b/a/y/x/v0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lc/h/m/d;)V */
return;
} // .end method
public e.b.a.b0.d ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicReference; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public e.b.a.y.x.v0 a ( java.lang.Class p0, java.lang.Class p1, java.lang.Class p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Data:", */
/* "Ljava/lang/Object;", */
/* "TResource:", */
/* "Ljava/lang/Object;", */
/* "Transcode:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TData;>;", */
/* "Ljava/lang/Class<", */
/* "TTResource;>;", */
/* "Ljava/lang/Class<", */
/* "TTranscode;>;)", */
/* "Le/b/a/y/x/v0<", */
/* "TData;TTResource;TTranscode;>;" */
/* } */
} // .end annotation
/* .line 2 */
(( e.b.a.b0.d ) p0 ).b ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/b0/d;->b(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/e0/q;
/* .line 3 */
p2 = this.a;
/* monitor-enter p2 */
/* .line 4 */
try { // :try_start_0
p3 = this.a;
(( c.e.i ) p3 ).get ( p1 ); // invoke-virtual {p3, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p3, Le/b/a/y/x/v0; */
/* .line 5 */
/* monitor-exit p2 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
p2 = this.b;
(( java.util.concurrent.atomic.AtomicReference ) p2 ).set ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
/* :catchall_0 */
/* move-exception p1 */
/* .line 7 */
try { // :try_start_1
/* monitor-exit p2 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
public void a ( java.lang.Class p0, java.lang.Class p1, java.lang.Class p2, e.b.a.y.x.v0 p3 ) {
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
/* "Le/b/a/y/x/v0<", */
/* "***>;)V" */
/* } */
} // .end annotation
/* .line 8 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 9 */
try { // :try_start_0
v1 = this.a;
/* new-instance v2, Le/b/a/e0/q; */
/* invoke-direct {v2, p1, p2, p3}, Le/b/a/e0/q;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V */
if ( p4 != null) { // if-eqz p4, :cond_0
/* .line 10 */
} // :cond_0
p4 = e.b.a.b0.d.c;
/* .line 11 */
} // :goto_0
(( c.e.i ) v1 ).put ( v2, p4 ); // invoke-virtual {v1, v2, p4}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 12 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public Boolean a ( e.b.a.y.x.v0 p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/v0<", */
/* "***>;)Z" */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.b.a.b0.d.c;
p1 = (( java.lang.Object ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // .end method
public final e.b.a.e0.q b ( java.lang.Class p0, java.lang.Class p1, java.lang.Class p2 ) {
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
/* "Le/b/a/e0/q;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
(( java.util.concurrent.atomic.AtomicReference ) v0 ).getAndSet ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Le/b/a/e0/q; */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Le/b/a/e0/q; */
/* invoke-direct {v0}, Le/b/a/e0/q;-><init>()V */
/* .line 3 */
} // :cond_0
(( e.b.a.e0.q ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/b/a/e0/q;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
} // .end method
