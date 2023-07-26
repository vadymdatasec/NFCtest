public class e.f.c.s.j implements e.f.c.s.k {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.Object l;
	 public static final java.util.concurrent.ThreadFactory m;
	 /* # instance fields */
	 public final e.f.c.h a;
	 public final e.f.c.s.u.g b;
	 public final e.f.c.s.t.f c;
	 public final e.f.c.s.s d;
	 public final e.f.c.s.t.d e;
	 public final e.f.c.s.q f;
	 public final java.lang.Object g;
	 public final java.util.concurrent.ExecutorService h;
	 public final java.util.concurrent.ExecutorService i;
	 public java.lang.String j;
	 public final java.util.List k;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/f/c/s/r;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.c.s.j ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Le/f/c/s/h; */
/* invoke-direct {v0}, Le/f/c/s/h;-><init>()V */
return;
} // .end method
public e.f.c.s.j ( ) {
/* .locals 9 */
/* .line 1 */
/* new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor; */
v5 = java.util.concurrent.TimeUnit.SECONDS;
/* new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue; */
/* invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V */
v7 = e.f.c.s.j.m;
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* const-wide/16 v3, 0x1e */
/* move-object v0, v8 */
/* invoke-direct/range {v0 ..v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V */
/* new-instance v3, Le/f/c/s/u/g; */
/* .line 2 */
(( e.f.c.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;
/* invoke-direct {v3, v0, p2, p3}, Le/f/c/s/u/g;-><init>(Landroid/content/Context;Le/f/c/v/h;Le/f/c/p/d;)V */
/* new-instance v4, Le/f/c/s/t/f; */
/* invoke-direct {v4, p1}, Le/f/c/s/t/f;-><init>(Le/f/c/h;)V */
/* new-instance v5, Le/f/c/s/s; */
/* invoke-direct {v5}, Le/f/c/s/s;-><init>()V */
/* new-instance v6, Le/f/c/s/t/d; */
/* invoke-direct {v6, p1}, Le/f/c/s/t/d;-><init>(Le/f/c/h;)V */
/* new-instance v7, Le/f/c/s/q; */
/* invoke-direct {v7}, Le/f/c/s/q;-><init>()V */
/* move-object v0, p0 */
/* move-object v1, v8 */
/* move-object v2, p1 */
/* .line 3 */
/* invoke-direct/range {v0 ..v7}, Le/f/c/s/j;-><init>(Ljava/util/concurrent/ExecutorService;Le/f/c/h;Le/f/c/s/u/g;Le/f/c/s/t/f;Le/f/c/s/s;Le/f/c/s/t/d;Le/f/c/s/q;)V */
return;
} // .end method
public e.f.c.s.j ( ) {
/* .locals 10 */
/* move-object v0, p0 */
/* .line 4 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 5 */
/* new-instance v1, Ljava/lang/Object; */
/* invoke-direct {v1}, Ljava/lang/Object;-><init>()V */
this.g = v1;
/* .line 6 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.k = v1;
/* move-object v1, p2 */
/* .line 7 */
this.a = v1;
/* move-object v1, p3 */
/* .line 8 */
this.b = v1;
/* move-object v1, p4 */
/* .line 9 */
this.c = v1;
/* move-object v1, p5 */
/* .line 10 */
this.d = v1;
/* move-object/from16 v1, p6 */
/* .line 11 */
this.e = v1;
/* move-object/from16 v1, p7 */
/* .line 12 */
this.f = v1;
/* move-object v1, p1 */
/* .line 13 */
this.h = v1;
/* .line 14 */
/* new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor; */
v6 = java.util.concurrent.TimeUnit.SECONDS;
/* new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue; */
/* invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V */
v8 = e.f.c.s.j.m;
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* const-wide/16 v4, 0x1e */
/* move-object v1, v9 */
/* invoke-direct/range {v1 ..v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V */
this.i = v9;
return;
} // .end method
public static void a ( Object p0 ) { //synthethic
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
(( e.f.c.s.j ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/s/j;->c(Z)V
return;
} // .end method
public static void a ( Object p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .line 22 */
(( e.f.c.s.j ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/s/j;->b(Z)V
return;
} // .end method
public static void b ( Object p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( e.f.c.s.j ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/s/j;->c(Z)V
return;
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.c.s.j ) p0 ).j ( ); // invoke-virtual {p0}, Le/f/c/s/j;->j()V
/* .line 2 */
(( e.f.c.s.j ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/c/s/j;->f()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
e.f.a.b.h.n .a ( v0 );
/* .line 4 */
} // :cond_0
(( e.f.c.s.j ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/s/j;->c()Le/f/a/b/h/g;
/* .line 5 */
v1 = this.h;
e.f.c.s.e .a ( p0 );
} // .end method
public e.f.a.b.h.g a ( Boolean p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(Z)", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/s/p;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 7 */
(( e.f.c.s.j ) p0 ).j ( ); // invoke-virtual {p0}, Le/f/c/s/j;->j()V
/* .line 8 */
(( e.f.c.s.j ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/s/j;->b()Le/f/a/b/h/g;
/* .line 9 */
v1 = this.h;
e.f.c.s.f .a ( p0,p1 );
} // .end method
public final e.f.c.s.t.h a ( Object p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/firebase/installations/FirebaseInstallationsException; */
/* } */
} // .end annotation
/* .line 23 */
v0 = this.b;
/* .line 24 */
(( e.f.c.s.j ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/s/j;->d()Ljava/lang/String;
/* .line 25 */
(( e.f.c.s.t.h ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;
/* .line 26 */
(( e.f.c.s.j ) p0 ).i ( ); // invoke-virtual {p0}, Le/f/c/s/j;->i()Ljava/lang/String;
/* .line 27 */
(( e.f.c.s.t.h ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->e()Ljava/lang/String;
/* .line 28 */
(( e.f.c.s.u.g ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Le/f/c/s/u/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/c/s/u/m;
/* .line 29 */
v1 = e.f.c.s.i.b;
(( e.f.c.s.u.m ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/s/u/m;->a()Le/f/c/s/u/l;
v2 = (( java.lang.Enum ) v2 ).ordinal ( ); // invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I
/* aget v1, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* if-eq v1, v2, :cond_2 */
int v0 = 2; // const/4 v0, 0x2
/* if-eq v1, v0, :cond_1 */
int v0 = 3; // const/4 v0, 0x3
/* if-ne v1, v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 30 */
(( e.f.c.s.j ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/s/j;->a(Ljava/lang/String;)V
/* .line 31 */
(( e.f.c.s.t.h ) p1 ).o ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->o()Le/f/c/s/t/h;
/* .line 32 */
} // :cond_0
/* new-instance p1, Lcom/google/firebase/installations/FirebaseInstallationsException; */
v0 = com.google.firebase.installations.FirebaseInstallationsException$a.c;
final String v1 = "Firebase Installations Service is unavailable.Please try again later."; // const-string v1, "Firebase Installations Service is unavailable.Please try again later."
/* invoke-direct {p1, v1, v0}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V */
/* throw p1 */
} // :cond_1
final String v0 = "BAD CONFIG"; // const-string v0, "BAD CONFIG"
/* .line 33 */
(( e.f.c.s.t.h ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/s/t/h;->a(Ljava/lang/String;)Le/f/c/s/t/h;
/* .line 34 */
} // :cond_2
(( e.f.c.s.u.m ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/s/u/m;->b()Ljava/lang/String;
/* .line 35 */
(( e.f.c.s.u.m ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/s/u/m;->c()J
/* move-result-wide v2 */
v0 = this.d;
/* .line 36 */
(( e.f.c.s.s ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/s/s;->a()J
/* move-result-wide v4 */
/* move-object v0, p1 */
/* .line 37 */
/* invoke-virtual/range {v0 ..v5}, Le/f/c/s/t/h;->a(Ljava/lang/String;JJ)Le/f/c/s/t/h; */
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
/* .line 10 */
v0 = this.g;
/* monitor-enter v0 */
/* .line 11 */
try { // :try_start_0
v1 = this.k;
/* .line 12 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public final void a ( Object p0, java.lang.Exception p1 ) {
/* .locals 3 */
/* .line 13 */
v0 = this.g;
/* monitor-enter v0 */
/* .line 14 */
try { // :try_start_0
v1 = this.k;
/* .line 15 */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 16 */
/* check-cast v2, Le/f/c/s/r; */
v2 = /* .line 17 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 18 */
/* .line 19 */
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
public synchronized final void a ( java.lang.String p0 ) {
/* .locals 0 */
/* monitor-enter p0 */
/* .line 20 */
try { // :try_start_0
this.j = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 21 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final e.f.a.b.h.g b ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/s/p;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 2 */
/* new-instance v0, Le/f/a/b/h/h; */
/* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
/* .line 3 */
/* new-instance v1, Le/f/c/s/m; */
v2 = this.d;
/* invoke-direct {v1, v2, v0}, Le/f/c/s/m;-><init>(Le/f/c/s/s;Le/f/a/b/h/h;)V */
/* .line 4 */
(( e.f.c.s.j ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/s/j;->a(Le/f/c/s/r;)V
/* .line 5 */
(( e.f.a.b.h.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
} // .end method
public final void b ( Object p0 ) {
/* .locals 3 */
/* .line 20 */
v0 = e.f.c.s.j.l;
/* monitor-enter v0 */
/* .line 21 */
try { // :try_start_0
v1 = this.a;
/* .line 22 */
(( e.f.c.h ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/h;->b()Landroid/content/Context;
final String v2 = "generatefid.lock"; // const-string v2, "generatefid.lock"
e.f.c.s.d .a ( v1,v2 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 23 */
try { // :try_start_1
v2 = this.c;
(( e.f.c.s.t.f ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/f/c/s/t/f;->a(Le/f/c/s/t/h;)Le/f/c/s/t/h;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 24 */
try { // :try_start_2
(( e.f.c.s.d ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/d;->a()V
/* .line 25 */
} // :cond_0
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 26 */
(( e.f.c.s.d ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/d;->a()V
/* .line 27 */
} // :cond_1
/* throw p1 */
/* :catchall_1 */
/* move-exception p1 */
/* .line 28 */
/* monitor-exit v0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* throw p1 */
} // .end method
public final void b ( Boolean p0 ) {
/* .locals 2 */
/* .line 6 */
(( e.f.c.s.j ) p0 ).g ( ); // invoke-virtual {p0}, Le/f/c/s/j;->g()Le/f/c/s/t/h;
/* .line 7 */
try { // :try_start_0
v1 = (( e.f.c.s.t.h ) v0 ).h ( ); // invoke-virtual {v0}, Le/f/c/s/t/h;->h()Z
/* if-nez v1, :cond_3 */
v1 = (( e.f.c.s.t.h ) v0 ).k ( ); // invoke-virtual {v0}, Le/f/c/s/t/h;->k()Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_0
/* if-nez p1, :cond_2 */
/* .line 8 */
p1 = this.d;
p1 = (( e.f.c.s.s ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/s/s;->a(Le/f/c/s/t/h;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
return;
/* .line 9 */
} // :cond_2
} // :goto_0
(( e.f.c.s.j ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/s/j;->a(Le/f/c/s/t/h;)Le/f/c/s/t/h;
/* .line 10 */
} // :cond_3
} // :goto_1
(( e.f.c.s.j ) p0 ).d ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/s/j;->d(Le/f/c/s/t/h;)Le/f/c/s/t/h;
/* :try_end_0 */
/* .catch Lcom/google/firebase/installations/FirebaseInstallationsException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 11 */
} // :goto_2
(( e.f.c.s.j ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/s/j;->b(Le/f/c/s/t/h;)V
/* .line 12 */
v0 = (( e.f.c.s.t.h ) p1 ).j ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->j()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 13 */
(( e.f.c.s.t.h ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;
(( e.f.c.s.j ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/s/j;->a(Ljava/lang/String;)V
/* .line 14 */
} // :cond_4
v0 = (( e.f.c.s.t.h ) p1 ).h ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 15 */
/* new-instance v0, Lcom/google/firebase/installations/FirebaseInstallationsException; */
v1 = com.google.firebase.installations.FirebaseInstallationsException$a.b;
/* invoke-direct {v0, v1}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V */
(( e.f.c.s.j ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/s/j;->a(Le/f/c/s/t/h;Ljava/lang/Exception;)V
/* .line 16 */
} // :cond_5
v0 = (( e.f.c.s.t.h ) p1 ).i ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 17 */
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted).Firebase Installations will need to create a new Installation ID and auth token.Please retry your last request."; // const-string v1, "Installation ID could not be validated with the Firebase servers (maybe it was deleted).Firebase Installations will need to create a new Installation ID and auth token.Please retry your last request."
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
(( e.f.c.s.j ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/s/j;->a(Le/f/c/s/t/h;Ljava/lang/Exception;)V
/* .line 18 */
} // :cond_6
(( e.f.c.s.j ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/s/j;->e(Le/f/c/s/t/h;)V
} // :goto_3
return;
/* :catch_0 */
/* move-exception p1 */
/* .line 19 */
(( e.f.c.s.j ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/c/s/j;->a(Le/f/c/s/t/h;Ljava/lang/Exception;)V
return;
} // .end method
public final e.f.a.b.h.g c ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/f/a/b/h/h; */
/* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
/* .line 2 */
/* new-instance v1, Le/f/c/s/n; */
/* invoke-direct {v1, v0}, Le/f/c/s/n;-><init>(Le/f/a/b/h/h;)V */
/* .line 3 */
(( e.f.c.s.j ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/s/j;->a(Le/f/c/s/r;)V
/* .line 4 */
(( e.f.a.b.h.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
} // .end method
public final java.lang.String c ( Object p0 ) {
/* .locals 2 */
/* .line 9 */
v0 = this.a;
(( e.f.c.h ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/h;->c()Ljava/lang/String;
final String v1 = "CHIME_ANDROID_SDK"; // const-string v1, "CHIME_ANDROID_SDK"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
v0 = this.a;
v0 = (( e.f.c.h ) v0 ).h ( ); // invoke-virtual {v0}, Le/f/c/h;->h()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 10 */
} // :cond_0
p1 = (( e.f.c.s.t.h ) p1 ).l ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->l()Z
/* if-nez p1, :cond_2 */
/* .line 11 */
} // :cond_1
p1 = this.f;
(( e.f.c.s.q ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/s/q;->a()Ljava/lang/String;
/* .line 12 */
} // :cond_2
p1 = this.e;
(( e.f.c.s.t.d ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/s/t/d;->a()Ljava/lang/String;
/* .line 13 */
v0 = android.text.TextUtils .isEmpty ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 14 */
p1 = this.f;
(( e.f.c.s.q ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/s/q;->a()Ljava/lang/String;
} // :cond_3
} // .end method
public final void c ( Boolean p0 ) {
/* .locals 1 */
/* .line 5 */
(( e.f.c.s.j ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/s/j;->h()Le/f/c/s/t/h;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
(( e.f.c.s.t.h ) v0 ).n ( ); // invoke-virtual {v0}, Le/f/c/s/t/h;->n()Le/f/c/s/t/h;
/* .line 7 */
} // :cond_0
(( e.f.c.s.j ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/s/j;->e(Le/f/c/s/t/h;)V
/* .line 8 */
v0 = this.i;
e.f.c.s.g .a ( p0,p1 );
return;
} // .end method
public final e.f.c.s.t.h d ( Object p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/firebase/installations/FirebaseInstallationsException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.f.c.s.t.h ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( e.f.c.s.t.h ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* const/16 v1, 0xb */
/* if-ne v0, v1, :cond_0 */
/* .line 4 */
v0 = this.e;
(( e.f.c.s.t.d ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/s/t/d;->d()Ljava/lang/String;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* move-object v6, v0 */
/* .line 5 */
v1 = this.b;
/* .line 6 */
(( e.f.c.s.j ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/s/j;->d()Ljava/lang/String;
/* .line 7 */
(( e.f.c.s.t.h ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;
/* .line 8 */
(( e.f.c.s.j ) p0 ).i ( ); // invoke-virtual {p0}, Le/f/c/s/j;->i()Ljava/lang/String;
/* .line 9 */
(( e.f.c.s.j ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/s/j;->e()Ljava/lang/String;
/* .line 10 */
/* invoke-virtual/range {v1 ..v6}, Le/f/c/s/u/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/c/s/u/j; */
/* .line 11 */
v1 = e.f.c.s.i.a;
(( e.f.c.s.u.j ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/s/u/j;->d()Le/f/c/s/u/i;
v2 = (( java.lang.Enum ) v2 ).ordinal ( ); // invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I
/* aget v1, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* if-eq v1, v2, :cond_2 */
int v0 = 2; // const/4 v0, 0x2
/* if-ne v1, v0, :cond_1 */
final String v0 = "BAD CONFIG"; // const-string v0, "BAD CONFIG"
/* .line 12 */
(( e.f.c.s.t.h ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/s/t/h;->a(Ljava/lang/String;)Le/f/c/s/t/h;
/* .line 13 */
} // :cond_1
/* new-instance p1, Lcom/google/firebase/installations/FirebaseInstallationsException; */
v0 = com.google.firebase.installations.FirebaseInstallationsException$a.c;
final String v1 = "Firebase Installations Service is unavailable.Please try again later."; // const-string v1, "Firebase Installations Service is unavailable.Please try again later."
/* invoke-direct {p1, v1, v0}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V */
/* throw p1 */
/* .line 14 */
} // :cond_2
(( e.f.c.s.u.j ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/s/u/j;->b()Ljava/lang/String;
/* .line 15 */
(( e.f.c.s.u.j ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/s/u/j;->c()Ljava/lang/String;
v1 = this.d;
/* .line 16 */
(( e.f.c.s.s ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/s;->a()J
/* move-result-wide v5 */
/* .line 17 */
(( e.f.c.s.u.j ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/s/u/j;->a()Le/f/c/s/u/m;
(( e.f.c.s.u.m ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/s/u/m;->b()Ljava/lang/String;
/* .line 18 */
(( e.f.c.s.u.j ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/s/u/j;->a()Le/f/c/s/u/m;
(( e.f.c.s.u.m ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/s/u/m;->c()J
/* move-result-wide v8 */
/* move-object v2, p1 */
/* .line 19 */
/* invoke-virtual/range {v2 ..v9}, Le/f/c/s/t/h;->a(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Le/f/c/s/t/h; */
} // .end method
public java.lang.String d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( e.f.c.h ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/i;->a()Ljava/lang/String;
} // .end method
public java.lang.String e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( e.f.c.h ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/i;->b()Ljava/lang/String;
} // .end method
public final void e ( Object p0 ) {
/* .locals 3 */
/* .line 2 */
v0 = this.g;
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
v1 = this.k;
/* .line 4 */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 5 */
/* check-cast v2, Le/f/c/s/r; */
v2 = /* .line 6 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 7 */
/* .line 8 */
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
public synchronized final java.lang.String f ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.j;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final e.f.c.s.t.h g ( ) {
/* .locals 3 */
/* .line 1 */
v0 = e.f.c.s.j.l;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = this.a;
/* .line 3 */
(( e.f.c.h ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/h;->b()Landroid/content/Context;
final String v2 = "generatefid.lock"; // const-string v2, "generatefid.lock"
e.f.c.s.d .a ( v1,v2 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 4 */
try { // :try_start_1
v2 = this.c;
/* .line 5 */
(( e.f.c.s.t.f ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/c/s/t/f;->b()Le/f/c/s/t/h;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 6 */
try { // :try_start_2
(( e.f.c.s.d ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/d;->a()V
} // :cond_0
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v2 */
if ( v1 != null) { // if-eqz v1, :cond_1
(( e.f.c.s.d ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/d;->a()V
/* .line 7 */
} // :cond_1
/* throw v2 */
/* :catchall_1 */
/* move-exception v1 */
/* .line 8 */
/* monitor-exit v0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* throw v1 */
} // .end method
public final e.f.c.s.t.h h ( ) {
/* .locals 5 */
/* .line 1 */
v0 = e.f.c.s.j.l;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = this.a;
/* .line 3 */
(( e.f.c.h ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/h;->b()Landroid/content/Context;
final String v2 = "generatefid.lock"; // const-string v2, "generatefid.lock"
e.f.c.s.d .a ( v1,v2 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 4 */
try { // :try_start_1
v2 = this.c;
/* .line 5 */
(( e.f.c.s.t.f ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/c/s/t/f;->b()Le/f/c/s/t/h;
/* .line 6 */
v3 = (( e.f.c.s.t.h ) v2 ).i ( ); // invoke-virtual {v2}, Le/f/c/s/t/h;->i()Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 7 */
(( e.f.c.s.j ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Le/f/c/s/j;->c(Le/f/c/s/t/h;)Ljava/lang/String;
/* .line 8 */
v4 = this.c;
/* .line 9 */
(( e.f.c.s.t.h ) v2 ).b ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/s/t/h;->b(Ljava/lang/String;)Le/f/c/s/t/h;
/* .line 10 */
(( e.f.c.s.t.f ) v4 ).a ( v2 ); // invoke-virtual {v4, v2}, Le/f/c/s/t/f;->a(Le/f/c/s/t/h;)Le/f/c/s/t/h;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 11 */
try { // :try_start_2
(( e.f.c.s.d ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/d;->a()V
} // :cond_1
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v2 */
if ( v1 != null) { // if-eqz v1, :cond_2
(( e.f.c.s.d ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/s/d;->a()V
/* .line 12 */
} // :cond_2
/* throw v2 */
/* :catchall_1 */
/* move-exception v1 */
/* .line 13 */
/* monitor-exit v0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* throw v1 */
} // .end method
public java.lang.String i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( e.f.c.h ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/i;->d()Ljava/lang/String;
} // .end method
public final void j ( ) {
/* .locals 3 */
/* .line 1 */
(( e.f.c.s.j ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/s/j;->e()Ljava/lang/String;
final String v1 = "Please set your Application ID.A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."; // const-string v1, "Please set your Application ID.A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."
e.f.a.b.c.m.h .a ( v0,v1 );
/* .line 2 */
(( e.f.c.s.j ) p0 ).i ( ); // invoke-virtual {p0}, Le/f/c/s/j;->i()Ljava/lang/String;
final String v2 = "Please set your Project ID.A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."; // const-string v2, "Please set your Project ID.A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."
e.f.a.b.c.m.h .a ( v0,v2 );
/* .line 3 */
(( e.f.c.s.j ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/s/j;->d()Ljava/lang/String;
final String v2 = "Please set a valid API key.A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."; // const-string v2, "Please set a valid API key.A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."
e.f.a.b.c.m.h .a ( v0,v2 );
/* .line 4 */
(( e.f.c.s.j ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/s/j;->e()Ljava/lang/String;
v0 = e.f.c.s.s .b ( v0 );
/* .line 5 */
e.f.a.b.c.m.h .a ( v0,v1 );
/* .line 6 */
(( e.f.c.s.j ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/s/j;->d()Ljava/lang/String;
v0 = e.f.c.s.s .a ( v0 );
e.f.a.b.c.m.h .a ( v0,v2 );
return;
} // .end method
