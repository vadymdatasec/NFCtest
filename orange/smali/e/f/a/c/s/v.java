public class e.f.a.c.s.v {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static e.f.a.c.s.v e;
	 /* # instance fields */
	 public final java.lang.Object a;
	 public final android.os.Handler b;
	 public e.f.a.c.s.u c;
	 public e.f.a.c.s.u d;
	 /* # direct methods */
	 public e.f.a.c.s.v ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/Object; */
		 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
		 this.a = v0;
		 /* .line 3 */
		 /* new-instance v0, Landroid/os/Handler; */
		 /* .line 4 */
		 android.os.Looper .getMainLooper ( );
		 /* new-instance v2, Le/f/a/c/s/s; */
		 /* invoke-direct {v2, p0}, Le/f/a/c/s/s;-><init>(Le/f/a/c/s/v;)V */
		 /* invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V */
		 this.b = v0;
		 return;
	 } // .end method
	 public static e.f.a.c.s.v b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.a.c.s.v.e;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 /* new-instance v0, Le/f/a/c/s/v; */
		 /* invoke-direct {v0}, Le/f/a/c/s/v;-><init>()V */
		 /* .line 3 */
	 } // :cond_0
	 v0 = e.f.a.c.s.v.e;
} // .end method
/* # virtual methods */
public final void a ( ) {
	 /* .locals 2 */
	 /* .line 25 */
	 v0 = this.d;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 26 */
		 this.c = v0;
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 27 */
		 this.d = v1;
		 /* .line 28 */
		 v0 = this.a;
		 (( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
		 /* check-cast v0, Le/f/a/c/s/t; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 29 */
			 /* .line 30 */
		 } // :cond_0
		 this.c = v1;
	 } // :cond_1
} // :goto_0
return;
} // .end method
public void a ( Integer p0, Object p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
	 v1 = 	 (( e.f.a.c.s.v ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 3 */
		 p2 = this.c;
		 /* iput p1, p2, Le/f/a/c/s/u;->b:I */
		 /* .line 4 */
		 p1 = this.b;
		 p2 = this.c;
		 (( android.os.Handler ) p1 ).removeCallbacksAndMessages ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
		 /* .line 5 */
		 p1 = this.c;
		 (( e.f.a.c.s.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/u;)V
		 /* .line 6 */
		 /* monitor-exit v0 */
		 return;
		 /* .line 7 */
	 } // :cond_0
	 v1 = 	 (( e.f.a.c.s.v ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/f/a/c/s/v;->c(Le/f/a/c/s/t;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 8 */
		 p2 = this.d;
		 /* iput p1, p2, Le/f/a/c/s/u;->b:I */
		 /* .line 9 */
	 } // :cond_1
	 /* new-instance v1, Le/f/a/c/s/u; */
	 /* invoke-direct {v1, p1, p2}, Le/f/a/c/s/u;-><init>(ILe/f/a/c/s/t;)V */
	 this.d = v1;
	 /* .line 10 */
} // :goto_0
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_2
	 p1 = this.c;
	 int p2 = 4; // const/4 p2, 0x4
	 /* .line 11 */
	 p1 = 	 (( e.f.a.c.s.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/c/s/v;->a(Le/f/a/c/s/u;I)Z
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 /* .line 12 */
		 /* monitor-exit v0 */
		 return;
	 } // :cond_2
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 13 */
	 this.c = p1;
	 /* .line 14 */
	 (( e.f.a.c.s.v ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/s/v;->a()V
	 /* .line 15 */
	 /* monitor-exit v0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw p1 */
} // .end method
public void a ( Object p0, Integer p1 ) {
	 /* .locals 2 */
	 /* .line 16 */
	 v0 = this.a;
	 /* monitor-enter v0 */
	 /* .line 17 */
	 try { // :try_start_0
		 v1 = 		 (( e.f.a.c.s.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 18 */
			 p1 = this.c;
			 (( e.f.a.c.s.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/c/s/v;->a(Le/f/a/c/s/u;I)Z
			 /* .line 19 */
		 } // :cond_0
		 p1 = 		 (( e.f.a.c.s.v ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->c(Le/f/a/c/s/t;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 20 */
			 p1 = this.d;
			 (( e.f.a.c.s.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/c/s/v;->a(Le/f/a/c/s/u;I)Z
			 /* .line 21 */
		 } // :cond_1
	 } // :goto_0
	 /* monitor-exit v0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw p1 */
} // .end method
public void a ( Object p0 ) {
	 /* .locals 2 */
	 /* .line 34 */
	 v0 = this.a;
	 /* monitor-enter v0 */
	 /* .line 35 */
	 try { // :try_start_0
		 v1 = this.c;
		 /* if-eq v1, p1, :cond_0 */
		 v1 = this.d;
		 /* if-ne v1, p1, :cond_1 */
	 } // :cond_0
	 int v1 = 2; // const/4 v1, 0x2
	 /* .line 36 */
	 (( e.f.a.c.s.v ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/f/a/c/s/v;->a(Le/f/a/c/s/u;I)Z
	 /* .line 37 */
} // :cond_1
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 2 */
/* .line 22 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 23 */
try { // :try_start_0
	 v1 = 	 (( e.f.a.c.s.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z
	 /* if-nez v1, :cond_1 */
	 p1 = 	 (( e.f.a.c.s.v ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->c(Le/f/a/c/s/t;)Z
	 if ( p1 != null) { // if-eqz p1, :cond_0
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 24 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public final Boolean a ( Object p0, Integer p1 ) {
/* .locals 2 */
/* .line 31 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Le/f/a/c/s/t; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 32 */
v1 = this.b;
(( android.os.Handler ) v1 ).removeCallbacksAndMessages ( p1 ); // invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
/* .line 33 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void b ( Object p0 ) {
/* .locals 4 */
/* .line 5 */
/* iget v0, p1, Le/f/a/c/s/u;->b:I */
int v1 = -2; // const/4 v1, -0x2
/* if-ne v0, v1, :cond_0 */
return;
} // :cond_0
/* const/16 v1, 0xabe */
/* if-lez v0, :cond_1 */
} // :cond_1
int v2 = -1; // const/4 v2, -0x1
/* if-ne v0, v2, :cond_2 */
/* const/16 v0, 0x5dc */
} // :cond_2
/* const/16 v0, 0xabe */
/* .line 6 */
} // :goto_0
v1 = this.b;
(( android.os.Handler ) v1 ).removeCallbacksAndMessages ( p1 ); // invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
/* .line 7 */
v1 = this.b;
int v2 = 0; // const/4 v2, 0x0
android.os.Message .obtain ( v1,v2,p1 );
/* int-to-long v2, v0 */
(( android.os.Handler ) v1 ).sendMessageDelayed ( p1, v2, v3 ); // invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
return;
} // .end method
public final Boolean b ( Object p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( e.f.a.c.s.u ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/s/u;->a(Le/f/a/c/s/t;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean c ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( e.f.a.c.s.u ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/c/s/u;->a(Le/f/a/c/s/t;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void d ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
p1 = (( e.f.a.c.s.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
this.c = p1;
/* .line 4 */
p1 = this.d;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
(( e.f.a.c.s.v ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/c/s/v;->a()V
/* .line 6 */
} // :cond_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public void e ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
p1 = (( e.f.a.c.s.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 3 */
p1 = this.c;
(( e.f.a.c.s.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/u;)V
/* .line 4 */
} // :cond_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public void f ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
p1 = (( e.f.a.c.s.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.c;
/* iget-boolean p1, p1, Le/f/a/c/s/u;->c:Z */
/* if-nez p1, :cond_0 */
/* .line 3 */
p1 = this.c;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p1, Le/f/a/c/s/u;->c:Z */
/* .line 4 */
p1 = this.b;
v1 = this.c;
(( android.os.Handler ) p1 ).removeCallbacksAndMessages ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
/* .line 5 */
} // :cond_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public void g ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
p1 = (( e.f.a.c.s.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.c;
/* iget-boolean p1, p1, Le/f/a/c/s/u;->c:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 3 */
	 p1 = this.c;
	 int v1 = 0; // const/4 v1, 0x0
	 /* iput-boolean v1, p1, Le/f/a/c/s/u;->c:Z */
	 /* .line 4 */
	 p1 = this.c;
	 (( e.f.a.c.s.v ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/u;)V
	 /* .line 5 */
} // :cond_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
