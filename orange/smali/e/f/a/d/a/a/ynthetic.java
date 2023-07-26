public abstract class ynthetic {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.f.a.d.a.a.v a;
	 /* # direct methods */
	 public static synchronized e.f.a.d.a.a.v a ( android.content.Context p0 ) {
		 /* .locals 3 */
		 /* const-class v0, Le/f/a/d/a/a/t; */
		 /* monitor-enter v0 */
		 try { // :try_start_0
			 v1 = e.f.a.d.a.a.t.a;
			 /* if-nez v1, :cond_0 */
			 /* new-instance v1, Le/f/a/d/a/a/u; */
			 int v2 = 0; // const/4 v2, 0x0
			 /* invoke-direct {v1, v2}, Le/f/a/d/a/a/u;-><init>([B)V */
			 /* new-instance v2, Le/f/a/d/a/a/h; */
			 e.f.a.d.a.g.a .a ( p0 );
			 /* invoke-direct {v2, p0}, Le/f/a/d/a/a/h;-><init>(Landroid/content/Context;)V */
			 (( e.f.a.d.a.a.u ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/a/d/a/a/u;->a(Le/f/a/d/a/a/h;)V
			 (( e.f.a.d.a.a.u ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/a/d/a/a/u;->a()Le/f/a/d/a/a/v;
		 } // :cond_0
		 p0 = e.f.a.d.a.a.t.a;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit v0 */
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* monitor-exit v0 */
		 /* throw p0 */
	 } // .end method
