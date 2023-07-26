public class e.f.c.l.e.m.m1 implements java.util.concurrent.ThreadFactory {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String a; //synthetic
	 public final java.util.concurrent.atomic.AtomicLong b; //synthetic
	 /* # direct methods */
	 public e.f.c.l.e.m.m1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Thread newThread ( java.lang.Runnable p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 java.util.concurrent.Executors .defaultThreadFactory ( );
		 /* new-instance v1, Le/f/c/l/e/m/l1; */
		 /* invoke-direct {v1, p0, p1}, Le/f/c/l/e/m/l1;-><init>(Le/f/c/l/e/m/m1;Ljava/lang/Runnable;)V */
		 /* .line 2 */
		 /* .line 3 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 v1 = this.a;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.b;
		 (( java.util.concurrent.atomic.AtomicLong ) v1 ).getAndIncrement ( ); // invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J
		 /* move-result-wide v1 */
		 (( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.lang.Thread ) p1 ).setName ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
	 } // .end method
