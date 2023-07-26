public abstract class e.f.c.l.e.m.o1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.util.concurrent.ExecutorService a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 e.f.c.l.e.m.o1 .b ( p0 );
		 /* .line 2 */
		 java.util.concurrent.Executors .newSingleThreadExecutor ( v0 );
		 /* .line 3 */
		 e.f.c.l.e.m.o1 .a ( p0,v0 );
	 } // .end method
	 public static final void a ( java.lang.String p0, java.util.concurrent.ExecutorService p1 ) {
		 /* .locals 3 */
		 /* .line 4 */
		 v0 = java.util.concurrent.TimeUnit.SECONDS;
		 /* const-wide/16 v1, 0x2 */
		 e.f.c.l.e.m.o1 .a ( p0,p1,v1,v2,v0 );
		 return;
	 } // .end method
	 public static final void a ( java.lang.String p0, java.util.concurrent.ExecutorService p1, Long p2, java.util.concurrent.TimeUnit p3 ) {
		 /* .locals 9 */
		 /* .line 5 */
		 java.lang.Runtime .getRuntime ( );
		 /* new-instance v1, Ljava/lang/Thread; */
		 /* new-instance v8, Le/f/c/l/e/m/n1; */
		 /* move-object v2, v8 */
		 /* move-object v3, p0 */
		 /* move-object v4, p1 */
		 /* move-wide v5, p2 */
		 /* move-object v7, p4 */
		 /* invoke-direct/range {v2 ..v7}, Le/f/c/l/e/m/n1;-><init>(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;JLjava/util/concurrent/TimeUnit;)V */
		 /* new-instance p1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String p2 = "Crashlytics Shutdown Hook for "; // const-string p2, "Crashlytics Shutdown Hook for "
		 (( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v1, v8, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V */
		 /* .line 6 */
		 (( java.lang.Runtime ) v0 ).addShutdownHook ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V
		 return;
	 } // .end method
	 public static final java.util.concurrent.ThreadFactory b ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicLong; */
		 /* const-wide/16 v1, 0x1 */
		 /* invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V */
		 /* .line 2 */
		 /* new-instance v1, Le/f/c/l/e/m/m1; */
		 /* invoke-direct {v1, p0, v0}, Le/f/c/l/e/m/m1;-><init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicLong;)V */
	 } // .end method
