public class e.f.a.b.c.q.b {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.f.a.b.c.q.b b;
	 /* # instance fields */
	 public e.f.a.b.c.q.a a;
	 /* # direct methods */
	 public static e.f.a.b.c.q.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/a/b/c/q/b; */
		 /* invoke-direct {v0}, Le/f/a/b/c/q/b;-><init>()V */
		 return;
	 } // .end method
	 public e.f.a.b.c.q.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.a = v0;
		 return;
	 } // .end method
	 public static e.f.a.b.c.q.a b ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.a.b.c.q.b.b;
		 (( e.f.a.b.c.q.b ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/f/a/b/c/q/b;->a(Landroid/content/Context;)Le/f/a/b/c/q/a;
	 } // .end method
	 /* # virtual methods */
	 public synchronized final e.f.a.b.c.q.a a ( android.content.Context p0 ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.a;
			 /* if-nez v0, :cond_1 */
			 /* .line 2 */
			 (( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
			 /* if-nez v0, :cond_0 */
		 } // :cond_0
		 (( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 /* .line 3 */
	 } // :goto_0
	 /* new-instance v0, Le/f/a/b/c/q/a; */
	 /* invoke-direct {v0, p1}, Le/f/a/b/c/q/a;-><init>(Landroid/content/Context;)V */
	 this.a = v0;
	 /* .line 4 */
} // :cond_1
p1 = this.a;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
