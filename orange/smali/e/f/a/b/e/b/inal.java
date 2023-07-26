public class inal implements e.f.a.b.e.b.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Le/f/a/b/e/b/c;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.util.concurrent.ExecutorService a ( java.util.concurrent.ThreadFactory p0, Integer p1 ) {
		 /* .locals 8 */
		 /* .line 1 */
		 /* new-instance p2, Ljava/util/concurrent/ThreadPoolExecutor; */
		 v5 = java.util.concurrent.TimeUnit.SECONDS;
		 /* new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue; */
		 /* invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V */
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 1; // const/4 v2, 0x1
		 /* const-wide/16 v3, 0x3c */
		 /* move-object v0, p2 */
		 /* move-object v7, p1 */
		 /* invoke-direct/range {v0 ..v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 2 */
		 (( java.util.concurrent.ThreadPoolExecutor ) p2 ).allowCoreThreadTimeOut ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
		 /* .line 3 */
		 java.util.concurrent.Executors .unconfigurableExecutorService ( p2 );
	 } // .end method
	 public final java.util.concurrent.ScheduledExecutorService a ( Integer p0, java.util.concurrent.ThreadFactory p1, Integer p2 ) {
		 /* .locals 0 */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 4 */
		 java.util.concurrent.Executors .newScheduledThreadPool ( p1,p2 );
		 /* .line 5 */
		 java.util.concurrent.Executors .unconfigurableScheduledExecutorService ( p1 );
	 } // .end method
