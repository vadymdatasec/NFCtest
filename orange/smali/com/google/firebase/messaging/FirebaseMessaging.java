public class com.google.firebase.messaging.FirebaseMessaging {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/firebase/messaging/FirebaseMessaging$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static e.f.a.a.g g;
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "FirebaseUnknownNullness" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.content.Context a;
public final e.f.c.h b;
public final com.google.firebase.iid.FirebaseInstanceId c;
public final com.google.firebase.messaging.FirebaseMessaging$a d;
public final java.util.concurrent.Executor e;
public final e.f.a.b.h.g f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/u/i0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.google.firebase.messaging.FirebaseMessaging ( ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/h;", */
/* "Lcom/google/firebase/iid/FirebaseInstanceId;", */
/* "Le/f/c/r/a<", */
/* "Le/f/c/v/h;", */
/* ">;", */
/* "Le/f/c/r/a<", */
/* "Le/f/c/p/d;", */
/* ">;", */
/* "Le/f/c/s/k;", */
/* "Le/f/a/a/g;", */
/* "Le/f/c/o/d;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
try { // :try_start_0
final String v0 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"; // const-string v0, "com.google.firebase.iid.FirebaseInstanceIdReceiver"
/* .line 2 */
java.lang.Class .forName ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3 */
/* .line 4 */
this.b = p1;
/* .line 5 */
this.c = p2;
/* .line 6 */
/* new-instance p6, Lcom/google/firebase/messaging/FirebaseMessaging$a; */
/* invoke-direct {p6, p0, p7}, Lcom/google/firebase/messaging/FirebaseMessaging$a;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Le/f/c/o/d;)V */
this.d = p6;
/* .line 7 */
(( e.f.c.h ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;
this.a = p6;
/* .line 8 */
e.f.c.u.j .a ( );
this.e = p6;
/* .line 9 */
/* new-instance p7, Le/f/c/u/k; */
/* invoke-direct {p7, p0, p2}, Le/f/c/u/k;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/iid/FirebaseInstanceId;)V */
/* .line 10 */
/* new-instance v2, Le/f/c/q/r; */
p6 = this.a;
/* invoke-direct {v2, p6}, Le/f/c/q/r;-><init>(Landroid/content/Context;)V */
v6 = this.a;
/* .line 11 */
e.f.c.u.j .d ( );
/* move-object v0, p1 */
/* move-object v1, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* .line 12 */
/* invoke-static/range {v0 ..v7}, Le/f/c/u/i0;->a(Le/f/c/h;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)Le/f/a/b/h/g; */
this.f = p1;
/* .line 13 */
e.f.c.u.j .e ( );
/* new-instance p3, Le/f/c/u/l; */
/* invoke-direct {p3, p0}, Le/f/c/u/l;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V */
/* .line 14 */
(( e.f.a.b.h.g ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/e;)Le/f/a/b/h/g;
return;
/* .line 15 */
/* :catch_0 */
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "FirebaseMessaging and FirebaseInstanceId versions not compatible.Update to latest version of firebase-messaging."; // const-string p2, "FirebaseMessaging and FirebaseInstanceId versions not compatible.Update to latest version of firebase-messaging."
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public static final e.f.a.b.h.g a ( java.lang.String p0, e.f.c.u.i0 p1 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 4 */
(( e.f.c.u.i0 ) p1 ).c ( p0 ); // invoke-virtual {p1, p0}, Le/f/c/u/i0;->c(Ljava/lang/String;)Le/f/a/b/h/g;
} // .end method
public static e.f.c.h a ( com.google.firebase.messaging.FirebaseMessaging p0 ) { //synthethic
/* .locals 0 */
/* .line 10 */
p0 = this.b;
} // .end method
public static final java.lang.String a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 5 */
(( e.f.a.b.h.g ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->b()Ljava/lang/Object;
/* check-cast p0, Le/f/c/q/p; */
} // .end method
public static final e.f.a.b.h.g b ( java.lang.String p0, e.f.c.u.i0 p1 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 3 */
(( e.f.c.u.i0 ) p1 ).d ( p0 ); // invoke-virtual {p1, p0}, Le/f/c/u/i0;->d(Ljava/lang/String;)Le/f/a/b/h/g;
} // .end method
public static java.util.concurrent.Executor b ( com.google.firebase.messaging.FirebaseMessaging p0 ) { //synthethic
/* .locals 0 */
/* .line 4 */
p0 = this.e;
} // .end method
public static com.google.firebase.iid.FirebaseInstanceId c ( com.google.firebase.messaging.FirebaseMessaging p0 ) { //synthethic
/* .locals 0 */
/* .line 2 */
p0 = this.c;
} // .end method
public static synchronized com.google.firebase.messaging.FirebaseMessaging c ( ) {
/* .locals 2 */
/* const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging; */
/* monitor-enter v0 */
/* .line 1 */
try { // :try_start_0
e.f.c.h .j ( );
com.google.firebase.messaging.FirebaseMessaging .getInstance ( v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* throw v1 */
} // .end method
public static e.f.a.a.g d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = com.google.firebase.messaging.FirebaseMessaging.g;
} // .end method
public static synchronized com.google.firebase.messaging.FirebaseMessaging getInstance ( Object p0 ) {
/* .locals 2 */
/* .annotation build Landroidx/annotation/Keep; */
} // .end annotation
/* const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging; */
/* monitor-enter v0 */
/* .line 1 */
try { // :try_start_0
(( e.f.c.h ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/h;->a(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast p0, Lcom/google/firebase/messaging/FirebaseMessaging; */
final String v1 = "Firebase Messaging component is not present"; // const-string v1, "Firebase Messaging component is not present"
/* .line 2 */
e.f.a.b.c.m.h .a ( p0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v0 */
/* throw p0 */
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( ) {
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
v0 = this.c;
(( com.google.firebase.iid.FirebaseInstanceId ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->e()Le/f/a/b/h/g;
v1 = e.f.c.u.m.a;
/* .line 2 */
(( e.f.a.b.h.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/a;)Le/f/a/b/h/g;
} // .end method
public e.f.a.b.h.g a ( java.lang.String p0 ) {
/* .locals 2 */
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
/* .line 3 */
v0 = this.f;
/* new-instance v1, Le/f/c/u/n; */
/* invoke-direct {v1, p1}, Le/f/c/u/n;-><init>(Ljava/lang/String;)V */
(( e.f.a.b.h.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/f;)Le/f/a/b/h/g;
} // .end method
public final void a ( com.google.firebase.iid.FirebaseInstanceId p0 ) { //synthethic
/* .locals 1 */
/* .line 8 */
v0 = this.d;
v0 = (( com.google.firebase.messaging.FirebaseMessaging$a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging$a;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
(( com.google.firebase.iid.FirebaseInstanceId ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->g()Ljava/lang/String;
} // :cond_0
return;
} // .end method
public final void a ( e.f.c.u.i0 p0 ) { //synthethic
/* .locals 1 */
/* .line 6 */
v0 = (( com.google.firebase.messaging.FirebaseMessaging ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 7 */
(( e.f.c.u.i0 ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/c/u/i0;->d()V
} // :cond_0
return;
} // .end method
public e.f.a.b.h.g b ( java.lang.String p0 ) {
/* .locals 2 */
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
/* .line 2 */
v0 = this.f;
/* new-instance v1, Le/f/c/u/o; */
/* invoke-direct {v1, p1}, Le/f/c/u/o;-><init>(Ljava/lang/String;)V */
(( e.f.a.b.h.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/f;)Le/f/a/b/h/g;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
v0 = (( com.google.firebase.messaging.FirebaseMessaging$a ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging$a;->b()Z
} // .end method
