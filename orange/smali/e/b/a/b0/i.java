public class e.b.a.b0.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/b/a/b0/h<", */
	 /* "*>;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.b0.i ( ) {
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
public synchronized e.b.a.y.u a ( java.lang.Class p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Z:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TZ;>;)", */
/* "Le/b/a/y/u<", */
/* "TZ;>;" */
/* } */
} // .end annotation
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
try { // :try_start_0
v1 = v1 = this.a;
} // :goto_0
/* if-ge v0, v1, :cond_1 */
/* .line 4 */
v2 = this.a;
/* check-cast v2, Le/b/a/b0/h; */
/* .line 5 */
v3 = (( e.b.a.b0.h ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/b/a/b0/h;->a(Ljava/lang/Class;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
p1 = this.b;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
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
/* "<Z:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TZ;>;", */
/* "Le/b/a/y/u<", */
/* "TZ;>;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.a;
/* new-instance v1, Le/b/a/b0/h; */
/* invoke-direct {v1, p1, p2}, Le/b/a/b0/h;-><init>(Ljava/lang/Class;Le/b/a/y/u;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 2 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
