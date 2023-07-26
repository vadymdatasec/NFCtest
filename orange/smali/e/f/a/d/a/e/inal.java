public class inal {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T::", */
	 /* "Landroid/os/IInterface;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.util.Map l;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Landroid/os/Handler;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.content.Context a;
public final e.f.a.d.a.e.a b;
public final java.lang.String c;
public final java.util.List d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/f/a/d/a/e/b;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public Boolean e;
public final android.content.Intent f;
public final e.f.a.d.a.e.g g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/d/a/e/g<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public final java.lang.ref.WeakReference h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "Le/f/a/d/a/e/f;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final android.os.IBinder$DeathRecipient i;
public android.content.ServiceConnection j;
public android.os.IInterface k;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static inal ( ) {
/* .locals 1 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
public inal ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Le/f/a/d/a/e/a;", */
/* "Ljava/lang/String;", */
/* "Landroid/content/Intent;", */
/* "Le/f/a/d/a/e/g<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.d = v0;
/* new-instance v0, Le/f/a/d/a/e/c; */
/* invoke-direct {v0, p0}, Le/f/a/d/a/e/c;-><init>(Le/f/a/d/a/e/k;)V */
this.i = v0;
this.a = p1;
this.b = p2;
this.c = p3;
this.f = p4;
this.g = p5;
/* new-instance p1, Ljava/lang/ref/WeakReference; */
int p2 = 0; // const/4 p2, 0x0
/* invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.h = p1;
return;
} // .end method
public static android.os.IInterface a ( Object p0 ) { //synthethic
/* .locals 0 */
p0 = this.k;
} // .end method
public static void a ( Object p0, android.os.IInterface p1 ) { //synthethic
/* .locals 0 */
this.k = p1;
return;
} // .end method
public static void a ( Object p0, Object p1 ) { //synthethic
/* .locals 4 */
v0 = this.k;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_3 */
/* iget-boolean v0, p0, Le/f/a/d/a/e/k;->e:Z */
/* if-nez v0, :cond_3 */
v0 = this.b;
/* new-array v2, v1, [Ljava/lang/Object; */
final String v3 = "Initiate binding to the service."; // const-string v3, "Initiate binding to the service."
(( e.f.a.d.a.e.a ) v0 ).c ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
v0 = this.d;
/* new-instance p1, Le/f/a/d/a/e/j; */
/* invoke-direct {p1, p0}, Le/f/a/d/a/e/j;-><init>(Le/f/a/d/a/e/k;)V */
this.j = p1;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Le/f/a/d/a/e/k;->e:Z */
v2 = this.a;
v3 = this.f;
p1 = (( android.content.Context ) v2 ).bindService ( v3, p1, v0 ); // invoke-virtual {v2, v3, p1, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
/* if-nez p1, :cond_2 */
p1 = this.b;
/* new-array v0, v1, [Ljava/lang/Object; */
final String v2 = "Failed to bind to the service."; // const-string v2, "Failed to bind to the service."
(( e.f.a.d.a.e.a ) p1 ).c ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
/* iput-boolean v1, p0, Le/f/a/d/a/e/k;->e:Z */
p1 = this.d;
} // :cond_0
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Le/f/a/d/a/e/b; */
(( e.f.a.d.a.e.b ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/a/d/a/e/b;->b()Le/f/a/d/a/i/o;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v1, Lcom/google/android/play/core/internal/ar; */
/* invoke-direct {v1}, Lcom/google/android/play/core/internal/ar;-><init>()V */
(( e.f.a.d.a.i.o ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V
} // :cond_1
p0 = this.d;
} // :cond_2
return;
} // :cond_3
/* iget-boolean v0, p0, Le/f/a/d/a/e/k;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.b;
/* new-array v1, v1, [Ljava/lang/Object; */
final String v2 = "Waiting to bind to the service."; // const-string v2, "Waiting to bind to the service."
(( e.f.a.d.a.e.a ) v0 ).c ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
p0 = this.d;
return;
} // :cond_4
(( e.f.a.d.a.e.b ) p1 ).run ( ); // invoke-virtual {p1}, Le/f/a/d/a/e/b;->run()V
return;
} // .end method
public static e.f.a.d.a.e.a b ( Object p0 ) { //synthethic
/* .locals 0 */
p0 = this.b;
} // .end method
public static void b ( Object p0, Object p1 ) { //synthethic
/* .locals 0 */
(( e.f.a.d.a.e.k ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/b;)V
return;
} // .end method
public static android.content.ServiceConnection c ( Object p0 ) { //synthethic
/* .locals 0 */
p0 = this.j;
} // .end method
public static android.content.Context d ( Object p0 ) { //synthethic
/* .locals 0 */
p0 = this.a;
} // .end method
public static e.f.a.d.a.e.g e ( Object p0 ) { //synthethic
/* .locals 0 */
p0 = this.g;
} // .end method
public static void f ( Object p0 ) { //synthethic
/* .locals 4 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* new-array v2, v1, [Ljava/lang/Object; */
final String v3 = "linkToDeath"; // const-string v3, "linkToDeath"
(( e.f.a.d.a.e.a ) v0 ).c ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
try { // :try_start_0
v0 = this.k;
v2 = this.i;
/* :try_end_0 */
/* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception v0 */
p0 = this.b;
/* new-array v1, v1, [Ljava/lang/Object; */
final String v2 = "linkToDeath failed"; // const-string v2, "linkToDeath failed"
(( e.f.a.d.a.e.a ) p0 ).a ( v0, v2, v1 ); // invoke-virtual {p0, v0, v2, v1}, Le/f/a/d/a/e/a;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
public static java.util.List g ( Object p0 ) { //synthethic
/* .locals 0 */
p0 = this.d;
} // .end method
public static void h ( Object p0 ) { //synthethic
/* .locals 4 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* new-array v2, v1, [Ljava/lang/Object; */
final String v3 = "unlinkToDeath"; // const-string v3, "unlinkToDeath"
(( e.f.a.d.a.e.a ) v0 ).c ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
v0 = this.k;
p0 = this.i;
return;
} // .end method
public static void i ( Object p0 ) { //synthethic
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
this.j = v0;
return;
} // .end method
public static void j ( Object p0 ) { //synthethic
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Le/f/a/d/a/e/k;->e:Z */
return;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 1 */
/* new-instance v0, Le/f/a/d/a/e/e; */
/* invoke-direct {v0, p0}, Le/f/a/d/a/e/e;-><init>(Le/f/a/d/a/e/k;)V */
(( e.f.a.d.a.e.k ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/b;)V
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
/* new-instance v0, Le/f/a/d/a/e/d; */
(( e.f.a.d.a.e.b ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/d/a/e/b;->b()Le/f/a/d/a/i/o;
/* invoke-direct {v0, p0, v1, p1}, Le/f/a/d/a/e/d;-><init>(Le/f/a/d/a/e/k;Le/f/a/d/a/i/o;Le/f/a/d/a/e/b;)V */
(( e.f.a.d.a.e.k ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/b;)V
return;
} // .end method
public final android.os.IInterface b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
v0 = this.k;
} // .end method
public final void b ( Object p0 ) {
/* .locals 5 */
v0 = e.f.a.d.a.e.k.l;
/* monitor-enter v0 */
try { // :try_start_0
v1 = e.f.a.d.a.e.k.l;
v1 = v2 = this.c;
/* if-nez v1, :cond_0 */
/* new-instance v1, Landroid/os/HandlerThread; */
v2 = this.c;
/* const/16 v3, 0xa */
/* invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V */
(( android.os.HandlerThread ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V
v2 = e.f.a.d.a.e.k.l;
v3 = this.c;
/* new-instance v4, Landroid/os/Handler; */
(( android.os.HandlerThread ) v1 ).getLooper ( ); // invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
/* invoke-direct {v4, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
} // :cond_0
v1 = e.f.a.d.a.e.k.l;
v2 = this.c;
/* check-cast v1, Landroid/os/Handler; */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
(( android.os.Handler ) v1 ).post ( p1 ); // invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
/* :catchall_0 */
/* move-exception p1 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
public final void c ( ) { //bridge//synthethic
/* .locals 5 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* new-array v2, v1, [Ljava/lang/Object; */
final String v3 = "reportBinderDeath"; // const-string v3, "reportBinderDeath"
(( e.f.a.d.a.e.a ) v0 ).c ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
v0 = this.h;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Le/f/a/d/a/e/f; */
/* if-nez v0, :cond_3 */
v0 = this.b;
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
v3 = this.c;
/* aput-object v3, v2, v1 */
final String v1 = "%s : Binder has died."; // const-string v1, "%s : Binder has died."
(( e.f.a.d.a.e.a ) v0 ).c ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
v0 = this.d;
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Le/f/a/d/a/e/b; */
(( e.f.a.d.a.e.b ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/a/d/a/e/b;->b()Le/f/a/d/a/i/o;
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/16 v3, 0xf */
/* if-ge v2, v3, :cond_1 */
/* new-instance v2, Landroid/os/RemoteException; */
/* invoke-direct {v2}, Landroid/os/RemoteException;-><init>()V */
} // :cond_1
/* new-instance v2, Landroid/os/RemoteException; */
v3 = this.c;
java.lang.String .valueOf ( v3 );
final String v4 = " : Binder has died."; // const-string v4, " : Binder has died."
(( java.lang.String ) v3 ).concat ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v2, v3}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V */
} // :goto_1
(( e.f.a.d.a.i.o ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V
} // :cond_2
v0 = this.d;
return;
} // :cond_3
v2 = this.b;
/* new-array v1, v1, [Ljava/lang/Object; */
final String v3 = "calling onBinderDied"; // const-string v3, "calling onBinderDied"
(( e.f.a.d.a.e.a ) v2 ).c ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
return;
} // .end method
