public abstract class e.f.c.u.i extends android.app.Service {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "UnwrappedWakefulBroadcastReceiver" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.concurrent.ExecutorService b;
public android.os.Binder c;
public final java.lang.Object d;
public Integer e;
public Integer f;
/* # direct methods */
public e.f.c.u.i ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroid/app/Service;-><init>()V */
	 /* .line 2 */
	 e.f.c.u.j .b ( );
	 this.b = v0;
	 /* .line 3 */
	 /* new-instance v0, Ljava/lang/Object; */
	 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
	 this.d = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 4 */
	 /* iput v0, p0, Le/f/c/u/i;->f:I */
	 return;
} // .end method
public static e.f.a.b.h.g a ( Object p0, android.content.Intent p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 12 */
	 (( e.f.c.u.i ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/i;->e(Landroid/content/Intent;)Le/f/a/b/h/g;
} // .end method
/* # virtual methods */
public final void a ( android.content.Intent p0 ) {
	 /* .locals 1 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 1 */
		 e.f.c.q.a0 .a ( p1 );
		 /* .line 2 */
	 } // :cond_0
	 p1 = this.d;
	 /* monitor-enter p1 */
	 /* .line 3 */
	 try { // :try_start_0
		 /* iget v0, p0, Le/f/c/u/i;->f:I */
		 /* add-int/lit8 v0, v0, -0x1 */
		 /* iput v0, p0, Le/f/c/u/i;->f:I */
		 /* if-nez v0, :cond_1 */
		 /* .line 4 */
		 /* iget v0, p0, Le/f/c/u/i;->e:I */
		 (( e.f.c.u.i ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/i;->a(I)Z
		 /* .line 5 */
	 } // :cond_1
	 /* monitor-exit p1 */
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
public final void a ( android.content.Intent p0, Object p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 7 */
	 (( e.f.c.u.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/i;->a(Landroid/content/Intent;)V
	 return;
} // .end method
public final void a ( android.content.Intent p0, Object p1 ) { //synthethic
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 8 */
	 try { // :try_start_0
		 (( e.f.c.u.i ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/i;->c(Landroid/content/Intent;)V
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 9 */
		 (( e.f.a.b.h.h ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V
		 return;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* .line 10 */
		 (( e.f.a.b.h.h ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V
		 /* .line 11 */
		 /* throw p1 */
	 } // .end method
	 public Boolean a ( Integer p0 ) {
		 /* .locals 0 */
		 /* .line 6 */
		 p1 = 		 (( android.app.Service ) p0 ).stopSelfResult ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Service;->stopSelfResult(I)Z
	 } // .end method
	 public abstract android.content.Intent b ( android.content.Intent p0 ) {
	 } // .end method
	 public abstract void c ( android.content.Intent p0 ) {
	 } // .end method
	 public abstract Boolean d ( android.content.Intent p0 ) {
	 } // .end method
	 public final e.f.a.b.h.g e ( android.content.Intent p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/content/Intent;", */
		 /* ")", */
		 /* "Le/f/a/b/h/g<", */
		 /* "Ljava/lang/Void;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = 	 (( e.f.c.u.i ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/i;->d(Landroid/content/Intent;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 e.f.a.b.h.n .a ( p1 );
		 /* .line 3 */
	 } // :cond_0
	 /* new-instance v0, Le/f/a/b/h/h; */
	 /* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
	 /* .line 4 */
	 v1 = this.b;
	 /* new-instance v2, Le/f/c/u/e; */
	 /* invoke-direct {v2, p0, p1, v0}, Le/f/c/u/e;-><init>(Le/f/c/u/i;Landroid/content/Intent;Le/f/a/b/h/h;)V */
	 /* .line 5 */
	 (( e.f.a.b.h.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
} // .end method
public synchronized final android.os.IBinder onBind ( android.content.Intent p0 ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 final String p1 = "EnhancedIntentService"; // const-string p1, "EnhancedIntentService"
		 int v0 = 3; // const/4 v0, 0x3
		 /* .line 1 */
		 p1 = 		 android.util.Log .isLoggable ( p1,v0 );
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 final String p1 = "EnhancedIntentService"; // const-string p1, "EnhancedIntentService"
			 final String v0 = "Service received bind request"; // const-string v0, "Service received bind request"
			 /* .line 2 */
			 android.util.Log .d ( p1,v0 );
			 /* .line 3 */
		 } // :cond_0
		 p1 = this.c;
		 /* if-nez p1, :cond_1 */
		 /* .line 4 */
		 /* new-instance p1, Le/f/c/q/d0; */
		 /* new-instance v0, Le/f/c/u/h; */
		 /* invoke-direct {v0, p0}, Le/f/c/u/h;-><init>(Le/f/c/u/i;)V */
		 /* invoke-direct {p1, v0}, Le/f/c/q/d0;-><init>(Le/f/c/q/c0;)V */
		 this.c = p1;
		 /* .line 5 */
	 } // :cond_1
	 p1 = this.c;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit p0 */
	 /* throw p1 */
} // .end method
public void onDestroy ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 /* .line 2 */
	 /* invoke-super {p0}, Landroid/app/Service;->onDestroy()V */
	 return;
} // .end method
public final Integer onStartCommand ( android.content.Intent p0, Integer p1, Integer p2 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 p2 = this.d;
	 /* monitor-enter p2 */
	 /* .line 2 */
	 try { // :try_start_0
		 /* iput p3, p0, Le/f/c/u/i;->e:I */
		 /* .line 3 */
		 /* iget p3, p0, Le/f/c/u/i;->f:I */
		 /* add-int/lit8 p3, p3, 0x1 */
		 /* iput p3, p0, Le/f/c/u/i;->f:I */
		 /* .line 4 */
		 /* monitor-exit p2 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 5 */
		 (( e.f.c.u.i ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/i;->b(Landroid/content/Intent;)Landroid/content/Intent;
		 int p3 = 2; // const/4 p3, 0x2
		 /* if-nez p2, :cond_0 */
		 /* .line 6 */
		 (( e.f.c.u.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/i;->a(Landroid/content/Intent;)V
		 /* .line 7 */
	 } // :cond_0
	 (( e.f.c.u.i ) p0 ).e ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/u/i;->e(Landroid/content/Intent;)Le/f/a/b/h/g;
	 /* .line 8 */
	 v0 = 	 (( e.f.a.b.h.g ) p2 ).d ( ); // invoke-virtual {p2}, Le/f/a/b/h/g;->d()Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 9 */
		 (( e.f.c.u.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/i;->a(Landroid/content/Intent;)V
		 /* .line 10 */
	 } // :cond_1
	 p3 = e.f.c.u.f.a;
	 /* new-instance v0, Le/f/c/u/g; */
	 /* invoke-direct {v0, p0, p1}, Le/f/c/u/g;-><init>(Le/f/c/u/i;Landroid/content/Intent;)V */
	 (( e.f.a.b.h.g ) p2 ).a ( p3, v0 ); // invoke-virtual {p2, p3, v0}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)Le/f/a/b/h/g;
	 int p1 = 3; // const/4 p1, 0x3
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* .line 11 */
	 try { // :try_start_1
		 /* monitor-exit p2 */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* throw p1 */
	 } // .end method
