public abstract class c.h.k.v {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.Object a ( java.util.concurrent.ExecutorService p0, java.util.concurrent.Callable p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Ljava/util/concurrent/ExecutorService;", */
		 /* "Ljava/util/concurrent/Callable<", */
		 /* "TT;>;I)TT;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/InterruptedException; */
	 /* } */
} // .end annotation
/* .line 3 */
/* int-to-long p1, p2 */
/* .line 4 */
try { // :try_start_0
	 v0 = java.util.concurrent.TimeUnit.MILLISECONDS;
	 /* :try_end_0 */
	 /* .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 5 */
	 /* :catch_0 */
	 /* new-instance p0, Ljava/lang/InterruptedException; */
	 final String p1 = "timeout"; // const-string p1, "timeout"
	 /* invoke-direct {p0, p1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
	 /* :catch_1 */
	 /* move-exception p0 */
	 /* .line 6 */
	 /* throw p0 */
	 /* :catch_2 */
	 /* move-exception p0 */
	 /* .line 7 */
	 /* new-instance p1, Ljava/lang/RuntimeException; */
	 /* invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw p1 */
} // .end method
public static java.util.concurrent.ThreadPoolExecutor a ( java.lang.String p0, Integer p1, Integer p2 ) {
	 /* .locals 8 */
	 /* .line 8 */
	 /* new-instance v7, Lc/h/k/s; */
	 /* invoke-direct {v7, p0, p1}, Lc/h/k/s;-><init>(Ljava/lang/String;I)V */
	 /* .line 9 */
	 /* new-instance p0, Ljava/util/concurrent/ThreadPoolExecutor; */
	 /* int-to-long v3, p2 */
	 v5 = java.util.concurrent.TimeUnit.MILLISECONDS;
	 /* new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque; */
	 /* invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 1; // const/4 v2, 0x1
	 /* move-object v0, p0 */
	 /* invoke-direct/range {v0 ..v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V */
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 10 */
	 (( java.util.concurrent.ThreadPoolExecutor ) p0 ).allowCoreThreadTimeOut ( p1 ); // invoke-virtual {p0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V
} // .end method
public static void a ( java.util.concurrent.Executor p0, java.util.concurrent.Callable p1, Object p2 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(", */
	 /* "Ljava/util/concurrent/Executor;", */
	 /* "Ljava/util/concurrent/Callable<", */
	 /* "TT;>;", */
	 /* "Lc/h/m/a<", */
	 /* "TT;>;)V" */
	 /* } */
} // .end annotation
/* .line 1 */
c.h.k.d .a ( );
/* .line 2 */
/* new-instance v1, Lc/h/k/u; */
/* invoke-direct {v1, v0, p1, p2}, Lc/h/k/u;-><init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;Lc/h/m/a;)V */
return;
} // .end method
