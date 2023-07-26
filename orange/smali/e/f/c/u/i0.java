public class e.f.c.u.i0 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Long i;
	 /* # instance fields */
	 public final com.google.firebase.iid.FirebaseInstanceId a;
	 public final android.content.Context b;
	 public final e.f.c.q.r c;
	 public final e.f.c.q.o d;
	 public final java.util.Map e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/ArrayDeque<", */
	 /* "Le/f/a/b/h/h<", */
	 /* "Ljava/lang/Void;", */
	 /* ">;>;>;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.concurrent.ScheduledExecutorService f;
public Boolean g;
public final e.f.c.u.g0 h;
/* # direct methods */
public static e.f.c.u.i0 ( ) {
/* .locals 3 */
/* .line 1 */
v0 = java.util.concurrent.TimeUnit.HOURS;
/* const-wide/16 v1, 0x8 */
(( java.util.concurrent.TimeUnit ) v0 ).toSeconds ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J
/* move-result-wide v0 */
/* sput-wide v0, Le/f/c/u/i0;->i:J */
return;
} // .end method
public e.f.c.u.i0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
this.e = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput-boolean v0, p0, Le/f/c/u/i0;->g:Z */
/* .line 4 */
this.a = p1;
/* .line 5 */
this.c = p2;
/* .line 6 */
this.h = p3;
/* .line 7 */
this.d = p4;
/* .line 8 */
this.b = p5;
/* .line 9 */
this.f = p6;
return;
} // .end method
public static e.f.a.b.h.g a ( com.google.firebase.iid.FirebaseInstanceId p0, Object p1, Object p2, android.content.Context p3, java.util.concurrent.ScheduledExecutorService p4 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/firebase/iid/FirebaseInstanceId;", */
/* "Le/f/c/q/r;", */
/* "Le/f/c/q/o;", */
/* "Landroid/content/Context;", */
/* "Ljava/util/concurrent/ScheduledExecutorService;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/u/i0;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 2 */
/* new-instance v6, Le/f/c/u/h0; */
/* move-object v0, v6 */
/* move-object v1, p3 */
/* move-object v2, p4 */
/* move-object v3, p0 */
/* move-object v4, p1 */
/* move-object v5, p2 */
/* invoke-direct/range {v0 ..v5}, Le/f/c/u/h0;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/q/o;)V */
e.f.a.b.h.n .a ( p4,v6 );
} // .end method
public static e.f.a.b.h.g a ( Object p0, com.google.firebase.iid.FirebaseInstanceId p1, Object p2, Object p3, Object p4, Object p5, android.content.Context p6, java.util.concurrent.ScheduledExecutorService p7 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/h;", */
/* "Lcom/google/firebase/iid/FirebaseInstanceId;", */
/* "Le/f/c/q/r;", */
/* "Le/f/c/r/a<", */
/* "Le/f/c/v/h;", */
/* ">;", */
/* "Le/f/c/r/a<", */
/* "Le/f/c/p/d;", */
/* ">;", */
/* "Le/f/c/s/k;", */
/* "Landroid/content/Context;", */
/* "Ljava/util/concurrent/ScheduledExecutorService;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/u/i0;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v6, Le/f/c/q/o; */
/* move-object v0, v6 */
/* move-object v1, p0 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* invoke-direct/range {v0 ..v5}, Le/f/c/q/o;-><init>(Le/f/c/h;Le/f/c/q/r;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V */
e.f.c.u.i0 .a ( p1,p2,v6,p6,p7 );
} // .end method
public static final e.f.c.u.i0 a ( android.content.Context p0, java.util.concurrent.ScheduledExecutorService p1, com.google.firebase.iid.FirebaseInstanceId p2, Object p3, Object p4 ) { //synthethic
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 39 */
e.f.c.u.g0 .a ( p0,p1 );
/* .line 40 */
/* new-instance v7, Le/f/c/u/i0; */
/* move-object v0, v7 */
/* move-object v1, p2 */
/* move-object v2, p3 */
/* move-object v4, p4 */
/* move-object v5, p0 */
/* move-object v6, p1 */
/* invoke-direct/range {v0 ..v6}, Le/f/c/u/i0;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/u/g0;Le/f/c/q/o;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V */
} // .end method
public static java.lang.Object a ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x1e */
/* .line 29 */
try { // :try_start_0
v2 = java.util.concurrent.TimeUnit.SECONDS;
e.f.a.b.h.n .a ( p0,v0,v1,v2 );
/* :try_end_0 */
/* .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* :catch_1 */
/* move-exception p0 */
/* .line 30 */
} // :goto_0
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "SERVICE_NOT_AVAILABLE"; // const-string v1, "SERVICE_NOT_AVAILABLE"
/* invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
/* :catch_2 */
/* move-exception p0 */
/* .line 31 */
(( java.util.concurrent.ExecutionException ) p0 ).getCause ( ); // invoke-virtual {p0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;
/* .line 32 */
/* instance-of v1, v0, Ljava/io/IOException; */
/* if-nez v1, :cond_1 */
/* .line 33 */
/* instance-of v1, v0, Ljava/lang/RuntimeException; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 34 */
/* check-cast v0, Ljava/lang/RuntimeException; */
/* throw v0 */
/* .line 35 */
} // :cond_0
/* new-instance v0, Ljava/io/IOException; */
/* invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
/* .line 36 */
} // :cond_1
/* check-cast v0, Ljava/io/IOException; */
/* throw v0 */
} // .end method
public static Boolean f ( ) {
/* .locals 4 */
int v0 = 3; // const/4 v0, 0x3
final String v1 = "FirebaseMessaging"; // const-string v1, "FirebaseMessaging"
/* .line 1 */
v2 = android.util.Log .isLoggable ( v1,v0 );
/* if-nez v2, :cond_1 */
/* const/16 v3, 0x17 */
/* if-ne v2, v3, :cond_0 */
/* .line 2 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
/* # virtual methods */
public void a ( Long p0 ) {
/* .locals 11 */
int v0 = 1; // const/4 v0, 0x1
/* shl-long v1, p1, v0 */
/* const-wide/16 v3, 0x1e */
/* .line 12 */
java.lang.Math .max ( v3,v4,v1,v2 );
/* move-result-wide v1 */
/* sget-wide v3, Le/f/c/u/i0;->i:J */
java.lang.Math .min ( v1,v2,v3,v4 );
/* move-result-wide v9 */
/* .line 13 */
/* new-instance v1, Le/f/c/u/k0; */
v7 = this.b;
v8 = this.c;
/* move-object v5, v1 */
/* move-object v6, p0 */
/* invoke-direct/range {v5 ..v10}, Le/f/c/u/k0;-><init>(Le/f/c/u/i0;Landroid/content/Context;Le/f/c/q/r;J)V */
/* .line 14 */
(( e.f.c.u.i0 ) p0 ).a ( v1, p1, p2 ); // invoke-virtual {p0, v1, p1, p2}, Le/f/c/u/i0;->a(Ljava/lang/Runnable;J)V
/* .line 15 */
(( e.f.c.u.i0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/i0;->a(Z)V
return;
} // .end method
public final void a ( e.f.c.u.f0 p0 ) {
/* .locals 4 */
/* .line 17 */
v0 = this.e;
/* monitor-enter v0 */
/* .line 18 */
try { // :try_start_0
(( e.f.c.u.f0 ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/u/f0;->c()Ljava/lang/String;
/* .line 19 */
v1 = v1 = this.e;
/* if-nez v1, :cond_0 */
/* .line 20 */
/* monitor-exit v0 */
return;
/* .line 21 */
} // :cond_0
v1 = this.e;
/* check-cast v1, Ljava/util/ArrayDeque; */
/* .line 22 */
(( java.util.ArrayDeque ) v1 ).poll ( ); // invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;
/* check-cast v2, Le/f/a/b/h/h; */
if ( v2 != null) { // if-eqz v2, :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 23 */
(( e.f.a.b.h.h ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V
/* .line 24 */
} // :cond_1
v1 = (( java.util.ArrayDeque ) v1 ).isEmpty ( ); // invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 25 */
v1 = this.e;
/* .line 26 */
} // :cond_2
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public final void a ( e.f.c.u.f0 p0, Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/u/f0;", */
/* "Le/f/a/b/h/h<", */
/* "Ljava/lang/Void;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.e;
/* monitor-enter v0 */
/* .line 4 */
try { // :try_start_0
(( e.f.c.u.f0 ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/u/f0;->c()Ljava/lang/String;
/* .line 5 */
v1 = v1 = this.e;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 6 */
v1 = this.e;
/* check-cast p1, Ljava/util/ArrayDeque; */
/* .line 7 */
} // :cond_0
/* new-instance v1, Ljava/util/ArrayDeque; */
/* invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V */
/* .line 8 */
v2 = this.e;
/* move-object p1, v1 */
/* .line 9 */
} // :goto_0
(( java.util.ArrayDeque ) p1 ).add ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
/* .line 10 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public void a ( java.lang.Runnable p0, Long p1 ) {
/* .locals 2 */
/* .line 16 */
v0 = this.f;
v1 = java.util.concurrent.TimeUnit.SECONDS;
return;
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 27 */
v0 = this.a;
(( com.google.firebase.iid.FirebaseInstanceId ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->e()Le/f/a/b/h/g;
e.f.c.u.i0 .a ( v0 );
/* check-cast v0, Le/f/c/q/p; */
/* .line 28 */
v1 = this.d;
(( e.f.c.q.o ) v1 ).b ( v2, v0, p1 ); // invoke-virtual {v1, v2, v0, p1}, Le/f/c/q/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
e.f.c.u.i0 .a ( p1 );
return;
} // .end method
public synchronized void a ( Boolean p0 ) {
/* .locals 0 */
/* monitor-enter p0 */
/* .line 37 */
try { // :try_start_0
/* iput-boolean p1, p0, Le/f/c/u/i0;->g:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 38 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* .line 11 */
v0 = this.h;
(( e.f.c.u.g0 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/u/g0;->a()Le/f/c/u/f0;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void b ( java.lang.String p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 16 */
v0 = this.a;
(( com.google.firebase.iid.FirebaseInstanceId ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->e()Le/f/a/b/h/g;
e.f.c.u.i0 .a ( v0 );
/* check-cast v0, Le/f/c/q/p; */
/* .line 17 */
v1 = this.d;
/* .line 18 */
(( e.f.c.q.o ) v1 ).c ( v2, v0, p1 ); // invoke-virtual {v1, v2, v0, p1}, Le/f/c/q/o;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
/* .line 19 */
e.f.c.u.i0 .a ( p1 );
return;
} // .end method
public synchronized Boolean b ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 20 */
try { // :try_start_0
/* iget-boolean v0, p0, Le/f/c/u/i0;->g:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public Boolean b ( e.f.c.u.f0 p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
int v1 = 0; // const/4 v1, 0x0
/* .line 1 */
try { // :try_start_0
(( e.f.c.u.f0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/u/f0;->a()Ljava/lang/String;
int v3 = -1; // const/4 v3, -0x1
v4 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
/* const/16 v5, 0x53 */
int v6 = 1; // const/4 v6, 0x1
/* if-eq v4, v5, :cond_1 */
/* const/16 v5, 0x55 */
/* if-eq v4, v5, :cond_0 */
} // :cond_0
final String v4 = "U"; // const-string v4, "U"
v2 = (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
int v3 = 1; // const/4 v3, 0x1
} // :cond_1
final String v4 = "S"; // const-string v4, "S"
v2 = (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v2 != null) { // if-eqz v2, :cond_2
int v3 = 0; // const/4 v3, 0x0
} // :cond_2
} // :goto_0
final String v2 = " succeeded."; // const-string v2, " succeeded."
if ( v3 != null) { // if-eqz v3, :cond_4
/* if-eq v3, v6, :cond_3 */
/* .line 2 */
try { // :try_start_1
v2 = e.f.c.u.i0 .f ( );
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 3 */
java.lang.String .valueOf ( p1 );
java.lang.String .valueOf ( p1 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x18 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "Unknown topic operation"; // const-string v2, "Unknown topic operation"
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "."; // const-string p1, "."
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,p1 );
/* .line 4 */
} // :cond_3
(( e.f.c.u.f0 ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/u/f0;->b()Ljava/lang/String;
(( e.f.c.u.i0 ) p0 ).b ( v3 ); // invoke-virtual {p0, v3}, Le/f/c/u/i0;->b(Ljava/lang/String;)V
/* .line 5 */
v3 = e.f.c.u.i0 .f ( );
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 6 */
(( e.f.c.u.f0 ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/u/f0;->b()Ljava/lang/String;
java.lang.String .valueOf ( p1 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/lit8 v3, v3, 0x23 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "Unsubscribe from topic: "; // const-string v3, "Unsubscribe from topic: "
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,p1 );
/* .line 7 */
} // :cond_4
(( e.f.c.u.f0 ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/u/f0;->b()Ljava/lang/String;
(( e.f.c.u.i0 ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/f/c/u/i0;->a(Ljava/lang/String;)V
/* .line 8 */
v3 = e.f.c.u.i0 .f ( );
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 9 */
(( e.f.c.u.f0 ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/u/f0;->b()Ljava/lang/String;
java.lang.String .valueOf ( p1 );
v3 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* add-int/lit8 v3, v3, 0x1f */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "Subscribe to topic: "; // const-string v3, "Subscribe to topic: "
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,p1 );
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
} // :cond_5
} // :goto_1
/* :catch_0 */
/* move-exception p1 */
/* .line 10 */
(( java.io.IOException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
final String v3 = "SERVICE_NOT_AVAILABLE"; // const-string v3, "SERVICE_NOT_AVAILABLE"
v2 = (( java.lang.String ) v3 ).equals ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_8 */
/* .line 11 */
(( java.io.IOException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
final String v3 = "INTERNAL_SERVER_ERROR"; // const-string v3, "INTERNAL_SERVER_ERROR"
v2 = (( java.lang.String ) v3 ).equals ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 12 */
} // :cond_6
(( java.io.IOException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
/* if-nez v2, :cond_7 */
final String p1 = "Topic operation failed without exception message.Will retry Topic operation."; // const-string p1, "Topic operation failed without exception message.Will retry Topic operation."
/* .line 13 */
android.util.Log .e ( v0,p1 );
/* .line 14 */
} // :cond_7
/* throw p1 */
/* .line 15 */
} // :cond_8
} // :goto_2
(( java.io.IOException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
java.lang.String .valueOf ( p1 );
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, 0x35 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v2 = "Topic operation failed: "; // const-string v2, "Topic operation failed: "
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ".Will retry Topic operation."; // const-string p1, ".Will retry Topic operation."
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,p1 );
} // .end method
public e.f.a.b.h.g c ( e.f.c.u.f0 p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/u/f0;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.h;
(( e.f.c.u.g0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/u/g0;->a(Le/f/c/u/f0;)Z
/* .line 4 */
/* new-instance v0, Le/f/a/b/h/h; */
/* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
/* .line 5 */
(( e.f.c.u.i0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/u/i0;->a(Le/f/c/u/f0;Le/f/a/b/h/h;)V
/* .line 6 */
(( e.f.a.b.h.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
} // .end method
public e.f.a.b.h.g c ( java.lang.String p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.u.f0 .b ( p1 );
(( e.f.c.u.i0 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/i0;->c(Le/f/c/u/f0;)Le/f/a/b/h/g;
/* .line 2 */
(( e.f.c.u.i0 ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/u/i0;->d()V
} // .end method
public final void c ( ) {
/* .locals 2 */
/* .line 7 */
v0 = (( e.f.c.u.i0 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/u/i0;->b()Z
/* if-nez v0, :cond_0 */
/* const-wide/16 v0, 0x0 */
/* .line 8 */
(( e.f.c.u.i0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/f/c/u/i0;->a(J)V
} // :cond_0
return;
} // .end method
public e.f.a.b.h.g d ( java.lang.String p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.u.f0 .c ( p1 );
(( e.f.c.u.i0 ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/u/i0;->c(Le/f/c/u/f0;)Le/f/a/b/h/g;
/* .line 2 */
(( e.f.c.u.i0 ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/u/i0;->d()V
} // .end method
public void d ( ) {
/* .locals 1 */
/* .line 3 */
v0 = (( e.f.c.u.i0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/u/i0;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( e.f.c.u.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/u/i0;->c()V
} // :cond_0
return;
} // .end method
public Boolean e ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
} // :goto_0
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
v0 = this.h;
(( e.f.c.u.g0 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/u/g0;->a()Le/f/c/u/f0;
/* if-nez v0, :cond_1 */
/* .line 3 */
v0 = e.f.c.u.i0 .f ( );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "FirebaseMessaging"; // const-string v0, "FirebaseMessaging"
final String v1 = "topic sync succeeded"; // const-string v1, "topic sync succeeded"
/* .line 4 */
android.util.Log .d ( v0,v1 );
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* monitor-exit p0 */
/* .line 6 */
} // :cond_1
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 7 */
v1 = (( e.f.c.u.i0 ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/i0;->b(Le/f/c/u/f0;)Z
/* if-nez v1, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
} // :cond_2
v1 = this.h;
(( e.f.c.u.g0 ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/u/g0;->b(Le/f/c/u/f0;)Z
/* .line 9 */
(( e.f.c.u.i0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/u/i0;->a(Le/f/c/u/f0;)V
/* :catchall_0 */
/* move-exception v0 */
/* .line 10 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // .end method
