public class e.b.a.y.x.g1.f {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.Queue a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Queue<", */
	 /* "Le/b/a/y/x/g1/e;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.x.g1.f ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayDeque; */
/* invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public e.b.a.y.x.g1.e a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
	 v1 = this.a;
	 /* check-cast v1, Le/b/a/y/x/g1/e; */
	 /* .line 3 */
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* if-nez v1, :cond_0 */
	 /* .line 4 */
	 /* new-instance v1, Le/b/a/y/x/g1/e; */
	 /* invoke-direct {v1}, Le/b/a/y/x/g1/e;-><init>()V */
} // :cond_0
/* :catchall_0 */
/* move-exception v1 */
/* .line 5 */
try { // :try_start_1
	 /* monitor-exit v0 */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* throw v1 */
} // .end method
public void a ( Object p0 ) {
	 /* .locals 3 */
	 /* .line 6 */
	 v0 = this.a;
	 /* monitor-enter v0 */
	 /* .line 7 */
	 try { // :try_start_0
		 v1 = 		 v1 = this.a;
		 /* const/16 v2, 0xa */
		 /* if-ge v1, v2, :cond_0 */
		 /* .line 8 */
		 v1 = this.a;
		 /* .line 9 */
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
