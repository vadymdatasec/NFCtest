public class e.f.c.s.h implements java.util.concurrent.ThreadFactory {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.concurrent.atomic.AtomicInteger a;
	 /* # direct methods */
	 public e.f.c.s.h ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Thread newThread ( java.lang.Runnable p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/Thread; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 v2 = this.a;
		 /* .line 2 */
		 v2 = 		 (( java.util.concurrent.atomic.AtomicInteger ) v2 ).getAndIncrement ( ); // invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I
		 java.lang.Integer .valueOf ( v2 );
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object v2, v1, v3 */
		 final String v2 = "firebase-installations-executor-%d"; // const-string v2, "firebase-installations-executor-%d"
		 java.lang.String .format ( v2,v1 );
		 /* invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V */
	 } // .end method
