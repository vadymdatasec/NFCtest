public class e.b.a.y.x.h0 implements e.b.a.y.x.r {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.x.g1.a a;
	 public volatile e.b.a.y.x.g1.c b;
	 /* # direct methods */
	 public e.b.a.y.x.h0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.b.a.y.x.g1.c a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 /* if-nez v0, :cond_2 */
		 /* .line 2 */
		 /* monitor-enter p0 */
		 /* .line 3 */
		 try { // :try_start_0
			 v0 = this.b;
			 /* if-nez v0, :cond_0 */
			 /* .line 4 */
			 v0 = this.a;
			 this.b = v0;
			 /* .line 5 */
		 } // :cond_0
		 v0 = this.b;
		 /* if-nez v0, :cond_1 */
		 /* .line 6 */
		 /* new-instance v0, Le/b/a/y/x/g1/d; */
		 /* invoke-direct {v0}, Le/b/a/y/x/g1/d;-><init>()V */
		 this.b = v0;
		 /* .line 7 */
	 } // :cond_1
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
	 /* .line 8 */
} // :cond_2
} // :goto_0
v0 = this.b;
} // .end method
