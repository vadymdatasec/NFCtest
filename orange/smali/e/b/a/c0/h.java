public class e.b.a.c0.h implements e.b.a.c0.c implements e.b.a.c0.i {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<R:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/c0/c<", */
	 /* "TR;>;", */
	 /* "Le/b/a/c0/i<", */
	 /* "TR;>;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.b.a.c0.g l;
/* # instance fields */
public final Integer b;
public final Integer c;
public final Boolean d;
public final e.b.a.c0.g e;
public java.lang.Object f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TR;" */
/* } */
} // .end annotation
} // .end field
public e.b.a.c0.d g;
public Boolean h;
public Boolean i;
public Boolean j;
public com.bumptech.glide.load.engine.GlideException k;
/* # direct methods */
public static e.b.a.c0.h ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/b/a/c0/g; */
/* invoke-direct {v0}, Le/b/a/c0/g;-><init>()V */
return;
} // .end method
public e.b.a.c0.h ( ) {
/* .locals 2 */
/* .line 1 */
v0 = e.b.a.c0.h.l;
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, p1, p2, v1, v0}, Le/b/a/c0/h;-><init>(IIZLe/b/a/c0/g;)V */
return;
} // .end method
public e.b.a.c0.h ( ) {
/* .locals 0 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* iput p1, p0, Le/b/a/c0/h;->b:I */
/* .line 4 */
/* iput p2, p0, Le/b/a/c0/h;->c:I */
/* .line 5 */
/* iput-boolean p3, p0, Le/b/a/c0/h;->d:Z */
/* .line 6 */
this.e = p4;
return;
} // .end method
/* # virtual methods */
public synchronized final java.lang.Object a ( java.lang.Long p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Long;", */
/* ")TR;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/util/concurrent/ExecutionException;, */
/* Ljava/lang/InterruptedException;, */
/* Ljava/util/concurrent/TimeoutException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 4 */
try { // :try_start_0
/* iget-boolean v0, p0, Le/b/a/c0/h;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( e.b.a.c0.h ) p0 ).isDone ( ); // invoke-virtual {p0}, Le/b/a/c0/h;->isDone()Z
/* if-nez v0, :cond_0 */
/* .line 5 */
e.b.a.e0.t .a ( );
/* .line 6 */
} // :cond_0
/* iget-boolean v0, p0, Le/b/a/c0/h;->h:Z */
/* if-nez v0, :cond_9 */
/* .line 7 */
/* iget-boolean v0, p0, Le/b/a/c0/h;->j:Z */
/* if-nez v0, :cond_8 */
/* .line 8 */
/* iget-boolean v0, p0, Le/b/a/c0/h;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 9 */
p1 = this.f;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
} // :cond_1
/* const-wide/16 v0, 0x0 */
/* if-nez p1, :cond_2 */
/* .line 10 */
try { // :try_start_1
p1 = this.e;
(( e.b.a.c0.g ) p1 ).a ( p0, v0, v1 ); // invoke-virtual {p1, p0, v0, v1}, Le/b/a/c0/g;->a(Ljava/lang/Object;J)V
/* .line 11 */
} // :cond_2
(( java.lang.Long ) p1 ).longValue ( ); // invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v2 */
/* cmp-long v4, v2, v0 */
/* if-lez v4, :cond_3 */
/* .line 12 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* .line 13 */
(( java.lang.Long ) p1 ).longValue ( ); // invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v2 */
/* add-long/2addr v2, v0 */
/* .line 14 */
} // :goto_0
p1 = (( e.b.a.c0.h ) p0 ).isDone ( ); // invoke-virtual {p0}, Le/b/a/c0/h;->isDone()Z
/* if-nez p1, :cond_3 */
/* cmp-long p1, v0, v2 */
/* if-gez p1, :cond_3 */
/* .line 15 */
p1 = this.e;
/* sub-long v0, v2, v0 */
(( e.b.a.c0.g ) p1 ).a ( p0, v0, v1 ); // invoke-virtual {p1, p0, v0, v1}, Le/b/a/c0/g;->a(Ljava/lang/Object;J)V
/* .line 16 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* .line 17 */
} // :cond_3
} // :goto_1
p1 = java.lang.Thread .interrupted ( );
/* if-nez p1, :cond_7 */
/* .line 18 */
/* iget-boolean p1, p0, Le/b/a/c0/h;->j:Z */
/* if-nez p1, :cond_6 */
/* .line 19 */
/* iget-boolean p1, p0, Le/b/a/c0/h;->h:Z */
/* if-nez p1, :cond_5 */
/* .line 20 */
/* iget-boolean p1, p0, Le/b/a/c0/h;->i:Z */
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 21 */
p1 = this.f;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
/* .line 22 */
} // :cond_4
try { // :try_start_2
/* new-instance p1, Ljava/util/concurrent/TimeoutException; */
/* invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V */
/* throw p1 */
/* .line 23 */
} // :cond_5
/* new-instance p1, Ljava/util/concurrent/CancellationException; */
/* invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V */
/* throw p1 */
/* .line 24 */
} // :cond_6
/* new-instance p1, Ljava/util/concurrent/ExecutionException; */
v0 = this.k;
/* invoke-direct {p1, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V */
/* throw p1 */
/* .line 25 */
} // :cond_7
/* new-instance p1, Ljava/lang/InterruptedException; */
/* invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V */
/* throw p1 */
/* .line 26 */
} // :cond_8
/* new-instance p1, Ljava/util/concurrent/ExecutionException; */
v0 = this.k;
/* invoke-direct {p1, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V */
/* throw p1 */
/* .line 27 */
} // :cond_9
/* new-instance p1, Ljava/util/concurrent/CancellationException; */
/* invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V */
/* throw p1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void a ( ) {
/* .locals 0 */
return;
} // .end method
public void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
return;
} // .end method
public synchronized void a ( Object p0 ) {
/* .locals 0 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
this.g = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 2 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
return;
} // .end method
public synchronized void a ( java.lang.Object p0, Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TR;", */
/* "Le/b/a/c0/p/d<", */
/* "-TR;>;)V" */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 3 */
/* monitor-exit p0 */
return;
} // .end method
public synchronized Boolean a ( com.bumptech.glide.load.engine.GlideException p0, java.lang.Object p1, Object p2, Boolean p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/bumptech/glide/load/engine/GlideException;", */
/* "Ljava/lang/Object;", */
/* "Le/b/a/c0/o/h<", */
/* "TR;>;Z)Z" */
/* } */
} // .end annotation
/* monitor-enter p0 */
int p2 = 1; // const/4 p2, 0x1
/* .line 28 */
try { // :try_start_0
/* iput-boolean p2, p0, Le/b/a/c0/h;->j:Z */
/* .line 29 */
this.k = p1;
/* .line 30 */
p1 = this.e;
(( e.b.a.c0.g ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Le/b/a/c0/g;->a(Ljava/lang/Object;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 31 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized Boolean a ( java.lang.Object p0, java.lang.Object p1, Object p2, Object p3, Boolean p4 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TR;", */
/* "Ljava/lang/Object;", */
/* "Le/b/a/c0/o/h<", */
/* "TR;>;", */
/* "Le/b/a/y/a;", */
/* "Z)Z" */
/* } */
} // .end annotation
/* monitor-enter p0 */
int p2 = 1; // const/4 p2, 0x1
/* .line 32 */
try { // :try_start_0
/* iput-boolean p2, p0, Le/b/a/c0/h;->i:Z */
/* .line 33 */
this.f = p1;
/* .line 34 */
p1 = this.e;
(( e.b.a.c0.g ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Le/b/a/c0/g;->a(Ljava/lang/Object;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 35 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void b ( ) {
/* .locals 0 */
return;
} // .end method
public synchronized void b ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
/* monitor-enter p0 */
/* .line 2 */
/* monitor-exit p0 */
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/b/a/c0/h;->b:I */
/* iget v1, p0, Le/b/a/c0/h;->c:I */
return;
} // .end method
public synchronized e.b.a.c0.d c ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.g;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void c ( android.graphics.drawable.Drawable p0 ) {
/* .locals 0 */
return;
} // .end method
public Boolean cancel ( Boolean p0 ) {
/* .locals 2 */
/* .line 1 */
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
v0 = (( e.b.a.c0.h ) p0 ).isDone ( ); // invoke-virtual {p0}, Le/b/a/c0/h;->isDone()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* monitor-exit p0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Le/b/a/c0/h;->h:Z */
/* .line 5 */
v1 = this.e;
(( e.b.a.c0.g ) v1 ).a ( p0 ); // invoke-virtual {v1, p0}, Le/b/a/c0/g;->a(Ljava/lang/Object;)V
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 6 */
p1 = this.g;
/* .line 7 */
this.g = v1;
/* move-object v1, p1 */
/* .line 8 */
} // :cond_1
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 9 */
} // :cond_2
/* :catchall_0 */
/* move-exception p1 */
/* .line 10 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
public java.lang.Object get ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TR;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/InterruptedException;, */
/* Ljava/util/concurrent/ExecutionException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
try { // :try_start_0
(( e.b.a.c0.h ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/b/a/c0/h;->a(Ljava/lang/Long;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 2 */
/* new-instance v1, Ljava/lang/AssertionError; */
/* invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw v1 */
} // .end method
public java.lang.Object get ( Long p0, java.util.concurrent.TimeUnit p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(J", */
/* "Ljava/util/concurrent/TimeUnit;", */
/* ")TR;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/InterruptedException;, */
/* Ljava/util/concurrent/ExecutionException;, */
/* Ljava/util/concurrent/TimeoutException; */
/* } */
} // .end annotation
/* .line 3 */
(( java.util.concurrent.TimeUnit ) p3 ).toMillis ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J
/* move-result-wide p1 */
java.lang.Long .valueOf ( p1,p2 );
(( e.b.a.c0.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/c0/h;->a(Ljava/lang/Long;)Ljava/lang/Object;
} // .end method
public synchronized Boolean isCancelled ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-boolean v0, p0, Le/b/a/c0/h;->h:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Boolean isDone ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-boolean v0, p0, Le/b/a/c0/h;->h:Z */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Le/b/a/c0/h;->i:Z */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Le/b/a/c0/h;->j:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void onDestroy ( ) {
/* .locals 0 */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "[status="; // const-string v1, "[status="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 2 */
/* monitor-enter p0 */
/* .line 3 */
try { // :try_start_0
/* iget-boolean v1, p0, Le/b/a/c0/h;->h:Z */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "CANCELLED"; // const-string v1, "CANCELLED"
/* .line 4 */
} // :cond_0
/* iget-boolean v1, p0, Le/b/a/c0/h;->j:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
final String v1 = "FAILURE"; // const-string v1, "FAILURE"
/* .line 5 */
} // :cond_1
/* iget-boolean v1, p0, Le/b/a/c0/h;->i:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
final String v1 = "SUCCESS"; // const-string v1, "SUCCESS"
} // :cond_2
final String v1 = "PENDING"; // const-string v1, "PENDING"
/* .line 6 */
v2 = this.g;
/* .line 7 */
} // :goto_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 8 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = ", request=["; // const-string v0, ", request=["
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v0 = "]]"; // const-string v0, "]]"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 9 */
} // :cond_3
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "]"; // const-string v0, "]"
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :catchall_0 */
/* move-exception v0 */
/* .line 10 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
