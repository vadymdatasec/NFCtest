public class e.f.c.p.e {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.f.c.p.e b;
	 /* # instance fields */
	 public final android.content.SharedPreferences a;
	 /* # direct methods */
	 public static e.f.c.p.e ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public e.f.c.p.e ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 final String v0 = "FirebaseAppHeartBeat"; // const-string v0, "FirebaseAppHeartBeat"
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 2 */
		 (( android.content.Context ) p1 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 this.a = p1;
		 return;
	 } // .end method
	 public static synchronized e.f.c.p.e a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* const-class v0, Le/f/c/p/e; */
		 /* monitor-enter v0 */
		 /* .line 1 */
		 try { // :try_start_0
			 v1 = e.f.c.p.e.b;
			 /* if-nez v1, :cond_0 */
			 /* .line 2 */
			 /* new-instance v1, Le/f/c/p/e; */
			 /* invoke-direct {v1, p0}, Le/f/c/p/e;-><init>(Landroid/content/Context;)V */
			 /* .line 3 */
		 } // :cond_0
		 p0 = e.f.c.p.e.b;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit v0 */
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* monitor-exit v0 */
		 /* throw p0 */
	 } // .end method
	 /* # virtual methods */
	 public synchronized Boolean a ( Long p0 ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 final String v0 = "fire-global"; // const-string v0, "fire-global"
			 /* .line 11 */
			 p1 = 			 (( e.f.c.p.e ) p0 ).a ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Le/f/c/p/e;->a(Ljava/lang/String;J)Z
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
		 public synchronized Boolean a ( java.lang.String p0, Long p1 ) {
			 /* .locals 6 */
			 /* monitor-enter p0 */
			 /* .line 4 */
			 try { // :try_start_0
				 v0 = 				 v0 = this.a;
				 int v1 = 1; // const/4 v1, 0x1
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* .line 5 */
					 v0 = this.a;
					 /* const-wide/16 v2, -0x1 */
					 /* move-result-wide v2 */
					 /* sub-long v2, p2, v2 */
					 /* const-wide/32 v4, 0x5265c00 */
					 /* cmp-long v0, v2, v4 */
					 /* if-ltz v0, :cond_0 */
					 /* .line 6 */
					 v0 = this.a;
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 7 */
					 /* monitor-exit p0 */
				 } // :cond_0
				 int p1 = 0; // const/4 p1, 0x0
				 /* .line 8 */
				 /* monitor-exit p0 */
				 /* .line 9 */
			 } // :cond_1
			 try { // :try_start_1
				 v0 = this.a;
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* .line 10 */
				 /* monitor-exit p0 */
				 /* :catchall_0 */
				 /* move-exception p1 */
				 /* monitor-exit p0 */
				 /* throw p1 */
			 } // .end method
