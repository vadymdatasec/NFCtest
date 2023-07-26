public class e.f.c.v.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static volatile e.f.c.v.d b;
	 /* # instance fields */
	 public final java.util.Set a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Le/f/c/v/f;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.v.d ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.a = v0;
return;
} // .end method
public static e.f.c.v.d b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = e.f.c.v.d.b;
/* if-nez v0, :cond_1 */
/* .line 2 */
/* const-class v1, Le/f/c/v/d; */
/* monitor-enter v1 */
/* .line 3 */
try { // :try_start_0
	 v0 = e.f.c.v.d.b;
	 /* if-nez v0, :cond_0 */
	 /* .line 4 */
	 /* new-instance v0, Le/f/c/v/d; */
	 /* invoke-direct {v0}, Le/f/c/v/d;-><init>()V */
	 /* .line 5 */
} // :cond_0
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // :cond_1
} // :goto_0
} // .end method
/* # virtual methods */
public java.util.Set a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Le/f/c/v/f;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = this.a;
java.util.Collections .unmodifiableSet ( v1 );
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* .line 3 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
