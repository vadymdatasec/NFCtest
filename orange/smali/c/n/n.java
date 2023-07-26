public class c.n.n implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.lifecycle.LiveData b; //synthetic
	 /* # direct methods */
	 public c.n.n ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = this.a;
		 /* monitor-enter v0 */
		 /* .line 2 */
		 try { // :try_start_0
			 v1 = this.b;
			 v1 = this.f;
			 /* .line 3 */
			 v2 = this.b;
			 v3 = androidx.lifecycle.LiveData.j;
			 this.f = v3;
			 /* .line 4 */
			 /* monitor-exit v0 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 5 */
			 v0 = this.b;
			 (( androidx.lifecycle.LiveData ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/lifecycle/LiveData;->a(Ljava/lang/Object;)V
			 return;
			 /* :catchall_0 */
			 /* move-exception v1 */
			 /* .line 6 */
			 try { // :try_start_1
				 /* monitor-exit v0 */
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* throw v1 */
			 } // .end method
