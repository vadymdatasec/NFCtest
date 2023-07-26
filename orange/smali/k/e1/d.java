public class k.e1.d implements java.util.concurrent.ThreadFactory {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String a; //synthetic
	 public final Boolean b; //synthetic
	 /* # direct methods */
	 public k.e1.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* iput-boolean p2, p0, Lk/e1/d;->b:Z */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Thread newThread ( java.lang.Runnable p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/Thread; */
		 v1 = this.a;
		 /* invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V */
		 /* .line 2 */
		 /* iget-boolean p1, p0, Lk/e1/d;->b:Z */
		 (( java.lang.Thread ) v0 ).setDaemon ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V
	 } // .end method
