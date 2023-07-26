public class c.c.a.a.c extends c.c.a.a.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static volatile c.c.a.a.c c;
	 /* # instance fields */
	 public c.c.a.a.f a;
	 public c.c.a.a.f b;
	 /* # direct methods */
	 public static c.c.a.a.c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lc/c/a/a/a; */
		 /* invoke-direct {v0}, Lc/c/a/a/a;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/c/a/a/b; */
		 /* invoke-direct {v0}, Lc/c/a/a/b;-><init>()V */
		 return;
	 } // .end method
	 public c.c.a.a.c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/c/a/a/f;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/c/a/a/e; */
		 /* invoke-direct {v0}, Lc/c/a/a/e;-><init>()V */
		 this.b = v0;
		 /* .line 3 */
		 this.a = v0;
		 return;
	 } // .end method
	 public static c.c.a.a.c b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = c.c.a.a.c.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = c.c.a.a.c.c;
			 /* .line 3 */
		 } // :cond_0
		 /* const-class v0, Lc/c/a/a/c; */
		 /* monitor-enter v0 */
		 /* .line 4 */
		 try { // :try_start_0
			 v1 = c.c.a.a.c.c;
			 /* if-nez v1, :cond_1 */
			 /* .line 5 */
			 /* new-instance v1, Lc/c/a/a/c; */
			 /* invoke-direct {v1}, Lc/c/a/a/c;-><init>()V */
			 /* .line 6 */
		 } // :cond_1
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 7 */
		 v0 = c.c.a.a.c.c;
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* .line 8 */
		 try { // :try_start_1
			 /* monitor-exit v0 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* throw v1 */
		 } // .end method
		 /* # virtual methods */
		 public void a ( java.lang.Runnable p0 ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.a;
			 (( c.c.a.a.f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/c/a/a/f;->a(Ljava/lang/Runnable;)V
			 return;
		 } // .end method
		 public Boolean a ( ) {
			 /* .locals 1 */
			 /* .line 2 */
			 v0 = this.a;
			 v0 = 			 (( c.c.a.a.f ) v0 ).a ( ); // invoke-virtual {v0}, Lc/c/a/a/f;->a()Z
		 } // .end method
		 public void b ( java.lang.Runnable p0 ) {
			 /* .locals 1 */
			 /* .line 9 */
			 v0 = this.a;
			 (( c.c.a.a.f ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/c/a/a/f;->b(Ljava/lang/Runnable;)V
			 return;
		 } // .end method
