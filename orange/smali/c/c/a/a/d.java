public class c.c.a.a.d implements java.util.concurrent.ThreadFactory {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.concurrent.atomic.AtomicInteger a;
	 /* # direct methods */
	 public c.c.a.a.d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger; */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Thread newThread ( java.lang.Runnable p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/Thread; */
		 /* invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
		 int p1 = 1; // const/4 p1, 0x1
		 /* new-array p1, p1, [Ljava/lang/Object; */
		 /* .line 2 */
		 v1 = this.a;
		 v1 = 		 (( java.util.concurrent.atomic.AtomicInteger ) v1 ).getAndIncrement ( ); // invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I
		 java.lang.Integer .valueOf ( v1 );
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v1, p1, v2 */
		 final String v1 = "arch_disk_io_%d"; // const-string v1, "arch_disk_io_%d"
		 java.lang.String .format ( v1,p1 );
		 (( java.lang.Thread ) v0 ).setName ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
	 } // .end method
