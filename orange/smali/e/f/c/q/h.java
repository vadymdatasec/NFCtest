public abstract class e.f.c.q.h {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.concurrent.Executor a;
	 /* # direct methods */
	 public static e.f.c.q.h ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.c.q.g.a;
		 return;
	 } // .end method
	 public static java.util.concurrent.Executor a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.c.q.h.a;
	 } // .end method
	 public static java.util.concurrent.ExecutorService b ( ) {
		 /* .locals 9 */
		 /* .line 1 */
		 /* new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor; */
		 v5 = java.util.concurrent.TimeUnit.SECONDS;
		 /* new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue; */
		 /* invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V */
		 /* new-instance v7, Le/f/a/b/c/p/l/a; */
		 final String v0 = "firebase-iid-executor"; // const-string v0, "firebase-iid-executor"
		 /* invoke-direct {v7, v0}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V */
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 /* const-wide/16 v3, 0x1e */
		 /* move-object v0, v8 */
		 /* invoke-direct/range {v0 ..v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V */
	 } // .end method
