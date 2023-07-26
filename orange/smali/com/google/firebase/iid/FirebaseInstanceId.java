public class com.google.firebase.iid.FirebaseInstanceId {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* # static fields */
public static final Long h;
public static e.f.c.q.x i;
public static final java.util.regex.Pattern j;
public static java.util.concurrent.ScheduledExecutorService k;
/* # instance fields */
public final java.util.concurrent.Executor a;
public final e.f.c.h b;
public final e.f.c.q.r c;
public final e.f.c.q.o d;
public final e.f.c.q.v e;
public final e.f.c.s.k f;
public Boolean g;
/* # direct methods */
public static com.google.firebase.iid.FirebaseInstanceId ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 v0 = java.util.concurrent.TimeUnit.HOURS;
	 /* const-wide/16 v1, 0x8 */
	 (( java.util.concurrent.TimeUnit ) v0 ).toSeconds ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J
	 /* move-result-wide v0 */
	 /* sput-wide v0, Lcom/google/firebase/iid/FirebaseInstanceId;->h:J */
	 final String v0 = "\\AA[\\w-]{38}\\z"; // const-string v0, "\\AA[\\w-]{38}\\z"
	 /* .line 2 */
	 java.util.regex.Pattern .compile ( v0 );
	 return;
} // .end method
public com.google.firebase.iid.FirebaseInstanceId ( ) {
	 /* .locals 7 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Le/f/c/h;", */
	 /* "Le/f/c/q/r;", */
	 /* "Ljava/util/concurrent/Executor;", */
	 /* "Ljava/util/concurrent/Executor;", */
	 /* "Le/f/c/r/a<", */
	 /* "Le/f/c/v/h;", */
	 /* ">;", */
	 /* "Le/f/c/r/a<", */
	 /* "Le/f/c/p/d;", */
	 /* ">;", */
	 /* "Le/f/c/s/k;", */
	 /* ")V" */
	 /* } */
} // .end annotation
/* .line 6 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
/* iput-boolean v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->g:Z */
/* .line 8 */
e.f.c.q.r .a ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 9 */
	 /* const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId; */
	 /* monitor-enter v0 */
	 /* .line 10 */
	 try { // :try_start_0
		 v1 = com.google.firebase.iid.FirebaseInstanceId.i;
		 /* if-nez v1, :cond_0 */
		 /* .line 11 */
		 /* new-instance v1, Le/f/c/q/x; */
		 (( e.f.c.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;
		 /* invoke-direct {v1, v2}, Le/f/c/q/x;-><init>(Landroid/content/Context;)V */
		 /* .line 12 */
	 } // :cond_0
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 13 */
	 this.b = p1;
	 /* .line 14 */
	 this.c = p2;
	 /* .line 15 */
	 /* new-instance v0, Le/f/c/q/o; */
	 /* move-object v1, v0 */
	 /* move-object v2, p1 */
	 /* move-object v3, p2 */
	 /* move-object v4, p5 */
	 /* move-object v5, p6 */
	 /* move-object v6, p7 */
	 /* invoke-direct/range {v1 ..v6}, Le/f/c/q/o;-><init>(Le/f/c/h;Le/f/c/q/r;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V */
	 this.d = v0;
	 /* .line 16 */
	 this.a = p4;
	 /* .line 17 */
	 /* new-instance p1, Le/f/c/q/v; */
	 /* invoke-direct {p1, p3}, Le/f/c/q/v;-><init>(Ljava/util/concurrent/Executor;)V */
	 this.e = p1;
	 /* .line 18 */
	 this.f = p7;
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* .line 19 */
	 try { // :try_start_1
		 /* monitor-exit v0 */
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* throw p1 */
		 /* .line 20 */
	 } // :cond_1
	 /* new-instance p1, Ljava/lang/IllegalStateException; */
	 final String p2 = "FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID"; // const-string p2, "FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID"
	 /* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
public com.google.firebase.iid.FirebaseInstanceId ( ) {
	 /* .locals 8 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Le/f/c/h;", */
	 /* "Le/f/c/r/a<", */
	 /* "Le/f/c/v/h;", */
	 /* ">;", */
	 /* "Le/f/c/r/a<", */
	 /* "Le/f/c/p/d;", */
	 /* ">;", */
	 /* "Le/f/c/s/k;", */
	 /* ")V" */
	 /* } */
} // .end annotation
/* .line 1 */
/* new-instance v2, Le/f/c/q/r; */
/* .line 2 */
(( e.f.c.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;
/* invoke-direct {v2, v0}, Le/f/c/q/r;-><init>(Landroid/content/Context;)V */
/* .line 3 */
e.f.c.q.h .b ( );
/* .line 4 */
e.f.c.q.h .b ( );
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v5, p2 */
/* move-object v6, p3 */
/* move-object v7, p4 */
/* .line 5 */
/* invoke-direct/range {v0 ..v7}, Lcom/google/firebase/iid/FirebaseInstanceId;-><init>(Le/f/c/h;Le/f/c/q/r;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V */
return;
} // .end method
public static void a ( Object p0 ) {
/* .locals 2 */
/* .line 13 */
(( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/i;->d()Ljava/lang/String;
final String v1 = "Please set your project ID.A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google."; // const-string v1, "Please set your project ID.A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google."
/* .line 14 */
e.f.a.b.c.m.h .a ( v0,v1 );
/* .line 15 */
(( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/i;->b()Ljava/lang/String;
final String v1 = "Please set your Application ID.A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase."; // const-string v1, "Please set your Application ID.A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase."
/* .line 16 */
e.f.a.b.c.m.h .a ( v0,v1 );
/* .line 17 */
(( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/i;->a()Ljava/lang/String;
final String v1 = "Please set a valid API key.A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google."; // const-string v1, "Please set a valid API key.A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google."
/* .line 18 */
e.f.a.b.c.m.h .a ( v0,v1 );
/* .line 19 */
(( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/i;->b()Ljava/lang/String;
v0 = com.google.firebase.iid.FirebaseInstanceId .b ( v0 );
final String v1 = "Please set your Application ID.A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."; // const-string v1, "Please set your Application ID.A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."
/* .line 20 */
e.f.a.b.c.m.h .a ( v0,v1 );
/* .line 21 */
(( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/i;->a()Ljava/lang/String;
p0 = com.google.firebase.iid.FirebaseInstanceId .a ( p0 );
final String v0 = "Please set a valid API key.A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."; // const-string v0, "Please set a valid API key.A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."
/* .line 22 */
e.f.a.b.c.m.h .a ( p0,v0 );
return;
} // .end method
public static final void a ( java.util.concurrent.CountDownLatch p0, Object p1 ) { //synthethic
/* .locals 0 */
/* .line 40 */
(( java.util.concurrent.CountDownLatch ) p0 ).countDown ( ); // invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
return;
} // .end method
public static Boolean a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 23 */
v0 = com.google.firebase.iid.FirebaseInstanceId.j;
(( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
p0 = (( java.util.regex.Matcher ) p0 ).matches ( ); // invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z
} // .end method
public static java.lang.Object b ( Object p0 ) {
/* .locals 4 */
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
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
final String v0 = "Task must not be null"; // const-string v0, "Task must not be null"
/* .line 7 */
e.f.a.b.c.m.h .a ( p0,v0 );
/* .line 8 */
/* new-instance v0, Ljava/util/concurrent/CountDownLatch; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V */
/* .line 9 */
v1 = e.f.c.q.j.a;
/* new-instance v2, Le/f/c/q/k; */
/* invoke-direct {v2, v0}, Le/f/c/q/k;-><init>(Ljava/util/concurrent/CountDownLatch;)V */
(( e.f.a.b.h.g ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)Le/f/a/b/h/g;
/* .line 10 */
v1 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* const-wide/16 v2, 0x7530 */
(( java.util.concurrent.CountDownLatch ) v0 ).await ( v2, v3, v1 ); // invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
/* .line 11 */
com.google.firebase.iid.FirebaseInstanceId .c ( p0 );
} // .end method
public static Boolean b ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = ":"; // const-string v0, ":"
/* .line 2 */
p0 = (( java.lang.String ) p0 ).contains ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
} // .end method
public static java.lang.Object c ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* .line 5 */
v0 = (( e.f.a.b.h.g ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
(( e.f.a.b.h.g ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->b()Ljava/lang/Object;
/* .line 7 */
} // :cond_0
v0 = (( e.f.a.b.h.g ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->c()Z
/* if-nez v0, :cond_2 */
/* .line 8 */
v0 = (( e.f.a.b.h.g ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 9 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
(( e.f.a.b.h.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
/* .line 10 */
} // :cond_1
/* new-instance p0, Ljava/lang/IllegalThreadStateException; */
final String v0 = "Firebase Installations getId Task has timed out."; // const-string v0, "Firebase Installations getId Task has timed out."
/* invoke-direct {p0, v0}, Ljava/lang/IllegalThreadStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 11 */
} // :cond_2
/* new-instance p0, Ljava/util/concurrent/CancellationException; */
final String v0 = "Task is already canceled"; // const-string v0, "Task is already canceled"
/* invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static java.lang.String c ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 12 */
v0 = (( java.lang.String ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z
/* if-nez v0, :cond_1 */
final String v0 = "fcm"; // const-string v0, "fcm"
v0 = (( java.lang.String ) p0 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
final String v0 = "gcm"; // const-string v0, "gcm"
v0 = (( java.lang.String ) p0 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
} // :cond_1
} // :goto_0
final String p0 = "*"; // const-string p0, "*"
} // .end method
public static com.google.firebase.iid.FirebaseInstanceId getInstance ( Object p0 ) {
/* .locals 1 */
/* .annotation build Landroidx/annotation/Keep; */
} // .end annotation
/* .line 1 */
com.google.firebase.iid.FirebaseInstanceId .a ( p0 );
/* .line 2 */
/* const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId; */
(( e.f.c.h ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/h;->a(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast p0, Lcom/google/firebase/iid/FirebaseInstanceId; */
final String v0 = "Firebase Instance ID component is not present"; // const-string v0, "Firebase Instance ID component is not present"
/* .line 3 */
e.f.a.b.c.m.h .a ( p0,v0 );
} // .end method
public static com.google.firebase.iid.FirebaseInstanceId m ( ) {
/* .locals 1 */
/* .line 1 */
e.f.c.h .j ( );
com.google.firebase.iid.FirebaseInstanceId .getInstance ( v0 );
} // .end method
public static Boolean n ( ) {
/* .locals 4 */
int v0 = 3; // const/4 v0, 0x3
final String v1 = "FirebaseInstanceId"; // const-string v1, "FirebaseInstanceId"
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
public final e.f.a.b.h.g a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/q/p;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 24 */
com.google.firebase.iid.FirebaseInstanceId .c ( p2 );
int v0 = 0; // const/4 v0, 0x0
/* .line 25 */
e.f.a.b.h.n .a ( v0 );
/* .line 26 */
v1 = this.a;
/* new-instance v2, Le/f/c/q/i; */
/* invoke-direct {v2, p0, p1, p2}, Le/f/c/q/i;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 27 */
(( e.f.a.b.h.g ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->b(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
} // .end method
public final e.f.a.b.h.g a ( java.lang.String p0, java.lang.String p1, Object p2 ) { //synthethic
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 41 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->d()Ljava/lang/String;
/* .line 42 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/firebase/iid/FirebaseInstanceId;->c(Ljava/lang/String;Ljava/lang/String;)Le/f/c/q/x$a;
/* .line 43 */
v1 = (( com.google.firebase.iid.FirebaseInstanceId ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/q/x$a;)Z
/* if-nez v1, :cond_0 */
/* .line 44 */
/* new-instance p1, Le/f/c/q/q; */
p2 = this.a;
/* invoke-direct {p1, p3, p2}, Le/f/c/q/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
e.f.a.b.h.n .a ( p1 );
/* .line 45 */
} // :cond_0
v0 = this.e;
/* new-instance v1, Le/f/c/q/l; */
/* invoke-direct {v1, p0, p3, p1, p2}, Le/f/c/q/l;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
(( e.f.c.q.v ) v0 ).a ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Le/f/c/q/v;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/q/v$a;)Le/f/a/b/h/g;
} // .end method
public final e.f.a.b.h.g a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
/* .locals 3 */
/* .line 46 */
v0 = this.d;
(( e.f.c.q.o ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/f/c/q/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
/* .line 47 */
v1 = this.a;
/* new-instance v2, Le/f/c/q/m; */
/* invoke-direct {v2, p0, p2, p3, p1}, Le/f/c/q/m;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
(( e.f.a.b.h.g ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;
} // .end method
public final e.f.a.b.h.g a ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) { //synthethic
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 48 */
v0 = com.google.firebase.iid.FirebaseInstanceId.i;
/* .line 49 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->f()Ljava/lang/String;
v2 = this.c;
/* .line 50 */
(( e.f.c.q.r ) v2 ).a ( ); // invoke-virtual {v2}, Le/f/c/q/r;->a()Ljava/lang/String;
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p4 */
/* .line 51 */
/* invoke-virtual/range {v0 ..v5}, Le/f/c/q/x;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 52 */
/* new-instance p1, Le/f/c/q/q; */
/* invoke-direct {p1, p3, p4}, Le/f/c/q/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
e.f.a.b.h.n .a ( p1 );
} // .end method
public final java.lang.Object a ( Object p0 ) {
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
/* const-wide/16 v0, 0x7530 */
/* .line 29 */
try { // :try_start_0
v2 = java.util.concurrent.TimeUnit.MILLISECONDS;
e.f.a.b.h.n .a ( p1,v0,v1,v2 );
/* :try_end_0 */
/* .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 30 */
/* :catch_0 */
/* new-instance p1, Ljava/io/IOException; */
final String v0 = "SERVICE_NOT_AVAILABLE"; // const-string v0, "SERVICE_NOT_AVAILABLE"
/* invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :catch_1 */
/* move-exception p1 */
/* .line 31 */
(( java.util.concurrent.ExecutionException ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;
/* .line 32 */
/* instance-of v1, v0, Ljava/io/IOException; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 33 */
(( java.lang.Throwable ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
final String v1 = "INSTANCE_ID_RESET"; // const-string v1, "INSTANCE_ID_RESET"
p1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 34 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->j()V
/* .line 35 */
} // :cond_0
/* check-cast v0, Ljava/io/IOException; */
/* throw v0 */
/* .line 36 */
} // :cond_1
/* instance-of v1, v0, Ljava/lang/RuntimeException; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 37 */
/* check-cast v0, Ljava/lang/RuntimeException; */
/* throw v0 */
/* .line 38 */
} // :cond_2
/* new-instance v0, Ljava/io/IOException; */
/* invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public java.lang.String a ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 28 */
v0 = this.b;
e.f.c.q.r .a ( v0 );
final String v1 = "*"; // const-string v1, "*"
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).b ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public synchronized void a ( Long p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
/* const-wide/16 v0, 0x1e */
int v2 = 1; // const/4 v2, 0x1
/* shl-long v3, p1, v2 */
/* .line 3 */
try { // :try_start_0
java.lang.Math .max ( v0,v1,v3,v4 );
/* move-result-wide v0 */
/* sget-wide v3, Lcom/google/firebase/iid/FirebaseInstanceId;->h:J */
java.lang.Math .min ( v0,v1,v3,v4 );
/* move-result-wide v0 */
/* .line 4 */
/* new-instance v3, Le/f/c/q/z; */
/* invoke-direct {v3, p0, v0, v1}, Le/f/c/q/z;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;J)V */
/* .line 5 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).a ( v3, p1, p2 ); // invoke-virtual {p0, v3, p1, p2}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Ljava/lang/Runnable;J)V
/* .line 6 */
/* iput-boolean v2, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->g:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 7 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void a ( java.lang.Runnable p0, Long p1 ) {
/* .locals 5 */
/* .line 8 */
/* const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId; */
/* monitor-enter v0 */
/* .line 9 */
try { // :try_start_0
v1 = com.google.firebase.iid.FirebaseInstanceId.k;
/* if-nez v1, :cond_0 */
/* .line 10 */
/* new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor; */
int v2 = 1; // const/4 v2, 0x1
/* new-instance v3, Le/f/a/b/c/p/l/a; */
final String v4 = "FirebaseInstanceId"; // const-string v4, "FirebaseInstanceId"
/* invoke-direct {v3, v4}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v1, v2, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V */
/* .line 11 */
} // :cond_0
v1 = com.google.firebase.iid.FirebaseInstanceId.k;
v2 = java.util.concurrent.TimeUnit.SECONDS;
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
public synchronized void a ( Boolean p0 ) {
/* .locals 0 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iput-boolean p1, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->g:Z */
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
public Boolean a ( e.f.c.q.x$a p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 39 */
v0 = this.c;
(( e.f.c.q.r ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/q/r;->a()Ljava/lang/String;
p1 = (( e.f.c.q.x$a ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/q/x$a;->a(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public e.f.c.h b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public java.lang.String b ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 3 */
v0 = this.b;
com.google.firebase.iid.FirebaseInstanceId .a ( v0 );
/* .line 4 */
android.os.Looper .getMainLooper ( );
android.os.Looper .myLooper ( );
/* if-eq v0, v1, :cond_0 */
/* .line 5 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/a/b/h/g;)Ljava/lang/Object;
/* check-cast p1, Le/f/c/q/p; */
/* .line 6 */
} // :cond_0
/* new-instance p1, Ljava/io/IOException; */
final String p2 = "MAIN_THREAD"; // const-string p2, "MAIN_THREAD"
/* invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public e.f.c.q.x$a c ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 4 */
v0 = com.google.firebase.iid.FirebaseInstanceId.i;
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).f ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->f()Ljava/lang/String;
(( e.f.c.q.x ) v0 ).b ( v1, p1, p2 ); // invoke-virtual {v0, v1, p1, p2}, Le/f/c/q/x;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/c/q/x$a;
} // .end method
public java.lang.String c ( ) {
/* .locals 1 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
v0 = this.b;
com.google.firebase.iid.FirebaseInstanceId .a ( v0 );
/* .line 2 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).l ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->l()V
/* .line 3 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->d()Ljava/lang/String;
} // .end method
public java.lang.String d ( ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
v0 = com.google.firebase.iid.FirebaseInstanceId.i;
v1 = this.b;
(( e.f.c.h ) v1 ).e ( ); // invoke-virtual {v1}, Le/f/c/h;->e()Ljava/lang/String;
(( e.f.c.q.x ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/q/x;->c(Ljava/lang/String;)J
/* .line 2 */
v0 = this.f;
com.google.firebase.iid.FirebaseInstanceId .b ( v0 );
/* check-cast v0, Ljava/lang/String; */
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
/* new-instance v1, Ljava/lang/IllegalStateException; */
/* invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public e.f.a.b.h.g e ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/q/p;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
v0 = this.b;
com.google.firebase.iid.FirebaseInstanceId .a ( v0 );
/* .line 2 */
v0 = this.b;
e.f.c.q.r .a ( v0 );
final String v1 = "*"; // const-string v1, "*"
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
} // .end method
public final java.lang.String f ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
(( e.f.c.h ) v0 ).c ( ); // invoke-virtual {v0}, Le/f/c/h;->c()Ljava/lang/String;
final String v1 = "[DEFAULT]"; // const-string v1, "[DEFAULT]"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = ""; // const-string v0, ""
/* .line 2 */
} // :cond_0
v0 = this.b;
(( e.f.c.h ) v0 ).e ( ); // invoke-virtual {v0}, Le/f/c/h;->e()Ljava/lang/String;
} // .end method
public java.lang.String g ( ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
v0 = this.b;
com.google.firebase.iid.FirebaseInstanceId .a ( v0 );
/* .line 2 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).h ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->h()Le/f/c/q/x$a;
/* .line 3 */
v1 = (( com.google.firebase.iid.FirebaseInstanceId ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/q/x$a;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).k ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->k()V
/* .line 5 */
} // :cond_0
e.f.c.q.x$a .a ( v0 );
} // .end method
public e.f.c.q.x$a h ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
e.f.c.q.r .a ( v0 );
final String v1 = "*"; // const-string v1, "*"
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).c ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->c(Ljava/lang/String;Ljava/lang/String;)Le/f/c/q/x$a;
} // .end method
public Boolean i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
v0 = (( e.f.c.q.r ) v0 ).e ( ); // invoke-virtual {v0}, Le/f/c/q/r;->e()Z
} // .end method
public synchronized void j ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = com.google.firebase.iid.FirebaseInstanceId.i;
(( e.f.c.q.x ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/q/x;->a()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 2 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void k ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->g:Z */
/* if-nez v0, :cond_0 */
/* const-wide/16 v0, 0x0 */
/* .line 2 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(J)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final void l ( ) {
/* .locals 1 */
/* .line 1 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).h ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->h()Le/f/c/q/x$a;
/* .line 2 */
v0 = (( com.google.firebase.iid.FirebaseInstanceId ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/q/x$a;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( com.google.firebase.iid.FirebaseInstanceId ) p0 ).k ( ); // invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->k()V
} // :cond_0
return;
} // .end method
