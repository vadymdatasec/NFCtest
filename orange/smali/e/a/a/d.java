public class e.a.a.d extends java.lang.Thread {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Boolean h;
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
public final java.util.concurrent.BlockingQueue c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/BlockingQueue<", */
/* "Le/a/a/p<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
public final e.a.a.b d;
public final e.a.a.w e;
public volatile Boolean f;
public final e.a.a.b0 g;
/* # direct methods */
public static e.a.a.d ( ) {
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Le/a/a/a0;->a:Z */
e.a.a.d.h = (v0!= 0);
return;
} // .end method
public e.a.a.d ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/concurrent/BlockingQueue<", */
/* "Le/a/a/p<", */
/* "*>;>;", */
/* "Ljava/util/concurrent/BlockingQueue<", */
/* "Le/a/a/p<", */
/* "*>;>;", */
/* "Le/a/a/b;", */
/* "Le/a/a/w;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Le/a/a/d;->f:Z */
/* .line 3 */
this.b = p1;
/* .line 4 */
this.c = p2;
/* .line 5 */
this.d = p3;
/* .line 6 */
this.e = p4;
/* .line 7 */
/* new-instance p1, Le/a/a/b0; */
/* invoke-direct {p1, p0, p2, p4}, Le/a/a/b0;-><init>(Le/a/a/d;Ljava/util/concurrent/BlockingQueue;Le/a/a/w;)V */
this.g = p1;
return;
} // .end method
public static java.util.concurrent.BlockingQueue a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.c;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.b;
/* check-cast v0, Le/a/a/p; */
/* .line 3 */
(( e.a.a.d ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/a/a/d;->a(Le/a/a/p;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/p<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
final String v0 = "cache-queue-take"; // const-string v0, "cache-queue-take"
/* .line 4 */
(( e.a.a.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
(( e.a.a.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->a(I)V
int v1 = 2; // const/4 v1, 0x2
/* .line 6 */
try { // :try_start_0
v2 = (( e.a.a.p ) p1 ).r ( ); // invoke-virtual {p1}, Le/a/a/p;->r()Z
if ( v2 != null) { // if-eqz v2, :cond_0
final String v0 = "cache-discard-canceled"; // const-string v0, "cache-discard-canceled"
/* .line 7 */
(( e.a.a.p ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->b(Ljava/lang/String;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 8 */
(( e.a.a.p ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V
return;
/* .line 9 */
} // :cond_0
try { // :try_start_1
v2 = this.d;
(( e.a.a.p ) p1 ).d ( ); // invoke-virtual {p1}, Le/a/a/p;->d()Ljava/lang/String;
/* if-nez v2, :cond_2 */
final String v0 = "cache-miss"; // const-string v0, "cache-miss"
/* .line 10 */
(( e.a.a.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 11 */
v0 = this.g;
v0 = (( e.a.a.b0 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/a/a/b0;->b(Le/a/a/p;)Z
/* if-nez v0, :cond_1 */
/* .line 12 */
v0 = this.c;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 13 */
} // :cond_1
(( e.a.a.p ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V
return;
/* .line 14 */
} // :cond_2
try { // :try_start_2
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* .line 15 */
v5 = (( e.a.a.a ) v2 ).a ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Le/a/a/a;->a(J)Z
if ( v5 != null) { // if-eqz v5, :cond_4
final String v0 = "cache-hit-expired"; // const-string v0, "cache-hit-expired"
/* .line 16 */
(( e.a.a.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 17 */
(( e.a.a.p ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/a/a/p;->a(Le/a/a/a;)Le/a/a/p;
/* .line 18 */
v0 = this.g;
v0 = (( e.a.a.b0 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/a/a/b0;->b(Le/a/a/p;)Z
/* if-nez v0, :cond_3 */
/* .line 19 */
v0 = this.c;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 20 */
} // :cond_3
(( e.a.a.p ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V
return;
} // :cond_4
try { // :try_start_3
final String v5 = "cache-hit"; // const-string v5, "cache-hit"
/* .line 21 */
(( e.a.a.p ) p1 ).a ( v5 ); // invoke-virtual {p1, v5}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 22 */
/* new-instance v5, Le/a/a/l; */
v6 = this.a;
v7 = this.g;
/* invoke-direct {v5, v6, v7}, Le/a/a/l;-><init>([BLjava/util/Map;)V */
/* .line 23 */
(( e.a.a.p ) p1 ).a ( v5 ); // invoke-virtual {p1, v5}, Le/a/a/p;->a(Le/a/a/l;)Le/a/a/v;
final String v6 = "cache-hit-parsed"; // const-string v6, "cache-hit-parsed"
/* .line 24 */
(( e.a.a.p ) p1 ).a ( v6 ); // invoke-virtual {p1, v6}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 25 */
v6 = (( e.a.a.v ) v5 ).a ( ); // invoke-virtual {v5}, Le/a/a/v;->a()Z
/* if-nez v6, :cond_6 */
final String v2 = "cache-parsing-failed"; // const-string v2, "cache-parsing-failed"
/* .line 26 */
(( e.a.a.p ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 27 */
v2 = this.d;
(( e.a.a.p ) p1 ).d ( ); // invoke-virtual {p1}, Le/a/a/p;->d()Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
/* .line 28 */
(( e.a.a.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/p;->a(Le/a/a/a;)Le/a/a/p;
/* .line 29 */
v0 = this.g;
v0 = (( e.a.a.b0 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/a/a/b0;->b(Le/a/a/p;)Z
/* if-nez v0, :cond_5 */
/* .line 30 */
v0 = this.c;
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 31 */
} // :cond_5
(( e.a.a.p ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V
return;
/* .line 32 */
} // :cond_6
try { // :try_start_4
v3 = (( e.a.a.a ) v2 ).b ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Le/a/a/a;->b(J)Z
/* if-nez v3, :cond_7 */
/* .line 33 */
v0 = this.e;
} // :cond_7
final String v3 = "cache-hit-refresh-needed"; // const-string v3, "cache-hit-refresh-needed"
/* .line 34 */
(( e.a.a.p ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Le/a/a/p;->a(Ljava/lang/String;)V
/* .line 35 */
(( e.a.a.p ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/a/a/p;->a(Le/a/a/a;)Le/a/a/p;
/* .line 36 */
/* iput-boolean v0, v5, Le/a/a/v;->d:Z */
/* .line 37 */
v0 = this.g;
v0 = (( e.a.a.b0 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/a/a/b0;->b(Le/a/a/p;)Z
/* if-nez v0, :cond_8 */
/* .line 38 */
v0 = this.e;
/* new-instance v2, Le/a/a/c; */
/* invoke-direct {v2, p0, p1}, Le/a/a/c;-><init>(Le/a/a/d;Le/a/a/p;)V */
/* .line 39 */
} // :cond_8
v0 = this.e;
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 40 */
} // :goto_0
(( e.a.a.p ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V
return;
/* :catchall_0 */
/* move-exception v0 */
(( e.a.a.p ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V
/* throw v0 */
} // .end method
public void b ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/a/a/d;->f:Z */
/* .line 2 */
(( java.lang.Thread ) p0 ).interrupt ( ); // invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V
return;
} // .end method
public void run ( ) {
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Le/a/a/d;->h:Z */
/* const/16 v0, 0xa */
/* .line 2 */
android.os.Process .setThreadPriority ( v0 );
/* .line 3 */
v0 = this.d;
/* .line 4 */
} // :cond_0
} // :goto_0
try { // :try_start_0
(( e.a.a.d ) p0 ).a ( ); // invoke-virtual {p0}, Le/a/a/d;->a()V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 5 */
/* :catch_0 */
/* iget-boolean v0, p0, Le/a/a/d;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
return;
} // .end method
