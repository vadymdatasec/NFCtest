public class e.a.a.k extends java.lang.Thread {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.concurrent.BlockingQueue b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/BlockingQueue<", */
	 /* "Le/a/a/p<", */
	 /* "*>;>;" */
	 /* } */
} // .end annotation
} // .end field
public final e.a.a.j c;
public final e.a.a.b d;
public final e.a.a.w e;
public volatile Boolean f;
/* # direct methods */
public e.a.a.k ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/concurrent/BlockingQueue<", */
/* "Le/a/a/p<", */
/* "*>;>;", */
/* "Le/a/a/j;", */
/* "Le/a/a/b;", */
/* "Le/a/a/w;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Le/a/a/k;->f:Z */
/* .line 3 */
this.b = p1;
/* .line 4 */
this.c = p2;
/* .line 5 */
this.d = p3;
/* .line 6 */
this.e = p4;
return;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.b;
/* check-cast v0, Le/a/a/p; */
/* .line 4 */
(( e.a.a.k ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/a/a/k;->b(Le/a/a/p;)V
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/TargetApi; */
/* value = 0xe */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* const/16 v1, 0xe */
/* if-lt v0, v1, :cond_0 */
/* .line 2 */
p1 = (( e.a.a.p ) p1 ).o ( ); // invoke-virtual {p1}, Le/a/a/p;->o()I
android.net.TrafficStats .setThreadStatsTag ( p1 );
} // :cond_0
return;
} // .end method
public final void a ( Object p0, com.android.volley.VolleyError p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;", */
/* "Lcom/android/volley/VolleyError;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 5 */
(( e.a.a.p ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Le/a/a/p;->b(Lcom/android/volley/VolleyError;)Lcom/android/volley/VolleyError;
/* .line 6 */
v0 = this.e;
return;
} // .end method
public void b ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/a/a/k;->f:Z */
/* .line 2 */
(( java.lang.Thread ) p0 ).interrupt ( ); // invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 3 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
int v2 = 3; // const/4 v2, 0x3
/* .line 4 */
(( e.a.a.p ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V
int v2 = 4; // const/4 v2, 0x4
try { // :try_start_0
final String v3 = "network-queue-take"; // const-string v3, "network-queue-take"
/* .line 5 */
(( e.a.a.p ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 6 */
v3 = (( e.a.a.p ) p1 ).r ( ); // invoke-virtual {p1}, Le/a/a/p;->r()Z
if ( v3 != null) { // if-eqz v3, :cond_0
final String v3 = "network-discard-cancelled"; // const-string v3, "network-discard-cancelled"
/* .line 7 */
(( e.a.a.p ) p1 ).b ( v3 ); // invoke-virtual {p1, v3}, Le/a/a/p;->b(Ljava/lang/String;)V
/* .line 8 */
(( e.a.a.p ) p1 ).t ( ); // invoke-virtual {p1}, Le/a/a/p;->t()V
/* :try_end_0 */
/* .catch Lcom/android/volley/VolleyError; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 9 */
(( e.a.a.p ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V
return;
/* .line 10 */
} // :cond_0
try { // :try_start_1
(( e.a.a.k ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/k;->a(Le/a/a/p;)V
/* .line 11 */
v3 = this.c;
final String v4 = "network-http-complete"; // const-string v4, "network-http-complete"
/* .line 12 */
(( e.a.a.p ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 13 */
/* iget-boolean v4, v3, Le/a/a/l;->e:Z */
if ( v4 != null) { // if-eqz v4, :cond_1
v4 = (( e.a.a.p ) p1 ).q ( ); // invoke-virtual {p1}, Le/a/a/p;->q()Z
if ( v4 != null) { // if-eqz v4, :cond_1
final String v3 = "not-modified"; // const-string v3, "not-modified"
/* .line 14 */
(( e.a.a.p ) p1 ).b ( v3 ); // invoke-virtual {p1, v3}, Le/a/a/p;->b(Ljava/lang/String;)V
/* .line 15 */
(( e.a.a.p ) p1 ).t ( ); // invoke-virtual {p1}, Le/a/a/p;->t()V
/* :try_end_1 */
/* .catch Lcom/android/volley/VolleyError; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 16 */
(( e.a.a.p ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V
return;
/* .line 17 */
} // :cond_1
try { // :try_start_2
(( e.a.a.p ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Le/a/a/p;->a(Le/a/a/l;)Le/a/a/v;
final String v4 = "network-parse-complete"; // const-string v4, "network-parse-complete"
/* .line 18 */
(( e.a.a.p ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 19 */
v4 = (( e.a.a.p ) p1 ).u ( ); // invoke-virtual {p1}, Le/a/a/p;->u()Z
if ( v4 != null) { // if-eqz v4, :cond_2
v4 = this.b;
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 20 */
v4 = this.d;
(( e.a.a.p ) p1 ).d ( ); // invoke-virtual {p1}, Le/a/a/p;->d()Ljava/lang/String;
v6 = this.b;
final String v4 = "network-cache-written"; // const-string v4, "network-cache-written"
/* .line 21 */
(( e.a.a.p ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 22 */
} // :cond_2
(( e.a.a.p ) p1 ).s ( ); // invoke-virtual {p1}, Le/a/a/p;->s()V
/* .line 23 */
v4 = this.e;
/* .line 24 */
(( e.a.a.p ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Le/a/a/p;->a(Le/a/a/v;)V
/* :try_end_2 */
/* .catch Lcom/android/volley/VolleyError; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* :catch_0 */
/* move-exception v3 */
/* .line 25 */
try { // :try_start_3
(( java.lang.Exception ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;
/* .line 26 */
/* new-instance v4, Lcom/android/volley/VolleyError; */
/* invoke-direct {v4, v3}, Lcom/android/volley/VolleyError;-><init>(Ljava/lang/Throwable;)V */
/* .line 27 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v5 */
/* sub-long/2addr v5, v0 */
(( com.android.volley.VolleyError ) v4 ).a ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Lcom/android/volley/VolleyError;->a(J)V
/* .line 28 */
v0 = this.e;
/* .line 29 */
(( e.a.a.p ) p1 ).t ( ); // invoke-virtual {p1}, Le/a/a/p;->t()V
/* :catch_1 */
/* move-exception v3 */
/* .line 30 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v4 */
/* sub-long/2addr v4, v0 */
(( com.android.volley.VolleyError ) v3 ).a ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lcom/android/volley/VolleyError;->a(J)V
/* .line 31 */
(( e.a.a.k ) p0 ).a ( p1, v3 ); // invoke-virtual {p0, p1, v3}, Le/a/a/k;->a(Le/a/a/p;Lcom/android/volley/VolleyError;)V
/* .line 32 */
(( e.a.a.p ) p1 ).t ( ); // invoke-virtual {p1}, Le/a/a/p;->t()V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 33 */
} // :goto_0
(( e.a.a.p ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V
return;
} // :goto_1
(( e.a.a.p ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V
/* throw v0 */
} // .end method
public void run ( ) {
/* .locals 1 */
/* const/16 v0, 0xa */
/* .line 1 */
android.os.Process .setThreadPriority ( v0 );
/* .line 2 */
} // :cond_0
} // :goto_0
try { // :try_start_0
(( e.a.a.k ) p0 ).a ( ); // invoke-virtual {p0}, Le/a/a/k;->a()V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3 */
/* :catch_0 */
/* iget-boolean v0, p0, Le/a/a/k;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
return;
} // .end method
