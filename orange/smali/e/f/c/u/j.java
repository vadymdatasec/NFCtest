public abstract class e.f.c.u.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.util.concurrent.Executor a ( java.lang.String p0 ) {
		 /* .locals 9 */
		 /* .line 1 */
		 /* new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor; */
		 v5 = java.util.concurrent.TimeUnit.SECONDS;
		 /* new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue; */
		 /* invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V */
		 /* new-instance v7, Le/f/a/b/c/p/l/a; */
		 /* invoke-direct {v7, p0}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V */
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 /* const-wide/16 v3, 0x1e */
		 /* move-object v0, v8 */
		 /* invoke-direct/range {v0 ..v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V */
	 } // .end method
	 public static java.util.concurrent.ScheduledExecutorService a ( ) {
		 /* .locals 3 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor; */
		 /* new-instance v1, Le/f/a/b/c/p/l/a; */
		 final String v2 = "Firebase-Messaging-Init"; // const-string v2, "Firebase-Messaging-Init"
		 /* invoke-direct {v1, v2}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V */
	 } // .end method
	 public static java.util.concurrent.ExecutorService b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 e.f.a.b.e.d.a .a ( );
		 /* new-instance v1, Le/f/a/b/c/p/l/a; */
		 final String v2 = "Firebase-Messaging-Intent-Handle"; // const-string v2, "Firebase-Messaging-Intent-Handle"
		 /* invoke-direct {v1, v2}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
	 } // .end method
	 public static java.util.concurrent.ExecutorService c ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/a/b/c/p/l/a; */
		 final String v1 = "Firebase-Messaging-Network-Io"; // const-string v1, "Firebase-Messaging-Network-Io"
		 /* invoke-direct {v0, v1}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V */
		 java.util.concurrent.Executors .newSingleThreadExecutor ( v0 );
	 } // .end method
	 public static java.util.concurrent.ScheduledExecutorService d ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor; */
		 /* new-instance v1, Le/f/a/b/c/p/l/a; */
		 final String v2 = "Firebase-Messaging-Topics-Io"; // const-string v2, "Firebase-Messaging-Topics-Io"
		 /* invoke-direct {v1, v2}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v0, v2, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V */
	 } // .end method
	 public static java.util.concurrent.Executor e ( ) {
		 /* .locals 1 */
		 final String v0 = "Firebase-Messaging-Trigger-Topics-Io"; // const-string v0, "Firebase-Messaging-Trigger-Topics-Io"
		 /* .line 1 */
		 e.f.c.u.j .a ( v0 );
	 } // .end method
