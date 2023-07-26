public class e.b.a.z.z implements e.b.a.z.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.z.k0 a; //synthetic
	 /* # direct methods */
	 public e.b.a.z.z ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Boolean p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 e.b.a.e0.t .b ( );
		 /* .line 2 */
		 v0 = this.a;
		 /* monitor-enter v0 */
		 /* .line 3 */
		 try { // :try_start_0
			 /* new-instance v1, Ljava/util/ArrayList; */
			 v2 = this.a;
			 v2 = this.b;
			 /* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
			 /* .line 4 */
			 /* monitor-exit v0 */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 5 */
		 v1 = 		 } // :goto_0
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* check-cast v1, Le/b/a/z/c; */
			 /* .line 6 */
		 } // :cond_0
		 return;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* .line 7 */
		 try { // :try_start_1
			 /* monitor-exit v0 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* throw p1 */
		 } // .end method
