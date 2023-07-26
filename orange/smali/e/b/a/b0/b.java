public class e.b.a.b0.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/b/a/b0/a<", */
	 /* "*>;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.b0.b ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public synchronized e.b.a.y.d a ( java.lang.Class p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TT;>;)", */
/* "Le/b/a/y/d<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.a;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/b/a/b0/a; */
/* .line 2 */
v2 = (( e.b.a.b0.a ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/b/a/b0/a;->a(Ljava/lang/Class;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 3 */
	 p1 = this.b;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized void a ( java.lang.Class p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TT;>;", */
/* "Le/b/a/y/d<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 5 */
try { // :try_start_0
v0 = this.a;
/* new-instance v1, Le/b/a/b0/a; */
/* invoke-direct {v1, p1, p2}, Le/b/a/b0/a;-><init>(Ljava/lang/Class;Le/b/a/y/d;)V */
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
