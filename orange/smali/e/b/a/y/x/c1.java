public class e.b.a.y.x.c1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public final android.os.Handler b;
	 /* # direct methods */
	 public e.b.a.y.x.c1 ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Landroid/os/Handler; */
		 /* .line 3 */
		 android.os.Looper .getMainLooper ( );
		 /* new-instance v2, Le/b/a/y/x/b1; */
		 /* invoke-direct {v2}, Le/b/a/y/x/b1;-><init>()V */
		 /* invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V */
		 this.b = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void a ( e.b.a.y.x.y0 p0, Boolean p1 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Le/b/a/y/x/y0<", */
		 /* "*>;Z)V" */
		 /* } */
	 } // .end annotation
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 /* iget-boolean v0, p0, Le/b/a/y/x/c1;->a:Z */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-nez v0, :cond_1 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 /* iput-boolean v1, p0, Le/b/a/y/x/c1;->a:Z */
		 /* .line 3 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 4 */
		 /* iput-boolean p1, p0, Le/b/a/y/x/c1;->a:Z */
		 /* .line 5 */
	 } // :cond_1
} // :goto_0
p2 = this.b;
(( android.os.Handler ) p2 ).obtainMessage ( v1, p1 ); // invoke-virtual {p2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
(( android.os.Message ) p1 ).sendToTarget ( ); // invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
} // :goto_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
