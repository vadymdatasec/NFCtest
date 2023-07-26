public class e.b.a.y.z.i.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.Queue a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Queue<", */
	 /* "Le/b/a/x/e;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.z.i.b ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
e.b.a.e0.t .a ( v0 );
this.a = v0;
return;
} // .end method
/* # virtual methods */
public synchronized e.b.a.x.e a ( java.nio.ByteBuffer p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
	 v0 = this.a;
	 /* check-cast v0, Le/b/a/x/e; */
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 /* new-instance v0, Le/b/a/x/e; */
	 /* invoke-direct {v0}, Le/b/a/x/e;-><init>()V */
	 /* .line 3 */
} // :cond_0
(( e.b.a.x.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/b/a/x/e;->a(Ljava/nio/ByteBuffer;)Le/b/a/x/e;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized void a ( Object p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 4 */
try { // :try_start_0
	 (( e.b.a.x.e ) p1 ).a ( ); // invoke-virtual {p1}, Le/b/a/x/e;->a()V
	 /* .line 5 */
	 v0 = this.a;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 6 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit p0 */
	 /* throw p1 */
} // .end method
