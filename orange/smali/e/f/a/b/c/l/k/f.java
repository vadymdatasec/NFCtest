public class e.f.a.b.c.l.k.f implements android.os.Handler$Callback {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final com.google.android.gms.common.api.Status m;
	 public static final com.google.android.gms.common.api.Status n;
	 public static final java.lang.Object o;
	 public static e.f.a.b.c.l.k.f p;
	 /* # instance fields */
	 public Long a;
	 public Long b;
	 public Long c;
	 public final android.content.Context d;
	 public final e.f.a.b.c.e e;
	 public final e.f.a.b.c.m.e f;
	 public final java.util.concurrent.atomic.AtomicInteger g;
	 public final java.util.Map h;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Le/f/a/b/c/l/k/a0<", */
	 /* "*>;", */
	 /* "Le/f/a/b/c/l/k/c<", */
	 /* "*>;>;" */
	 /* } */
} // .end annotation
} // .end field
public e.f.a.b.c.l.k.m i;
public final java.util.Set j;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Le/f/a/b/c/l/k/a0<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
public final java.util.Set k;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Le/f/a/b/c/l/k/a0<", */
/* "*>;>;" */
/* } */
} // .end annotation
} // .end field
public final android.os.Handler l;
/* # direct methods */
public static e.f.a.b.c.l.k.f ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Lcom/google/android/gms/common/api/Status; */
int v1 = 4; // const/4 v1, 0x4
final String v2 = "Sign-out occurred while this API call was in progress."; // const-string v2, "Sign-out occurred while this API call was in progress."
/* invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V */
/* .line 2 */
/* new-instance v0, Lcom/google/android/gms/common/api/Status; */
final String v2 = "The user must be signed in to make this API call."; // const-string v2, "The user must be signed in to make this API call."
/* invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V */
/* .line 3 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public e.f.a.b.c.l.k.f ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* const-wide/16 v0, 0x1388 */
/* .line 2 */
/* iput-wide v0, p0, Le/f/a/b/c/l/k/f;->a:J */
/* const-wide/32 v0, 0x1d4c0 */
/* .line 3 */
/* iput-wide v0, p0, Le/f/a/b/c/l/k/f;->b:J */
/* const-wide/16 v0, 0x2710 */
/* .line 4 */
/* iput-wide v0, p0, Le/f/a/b/c/l/k/f;->c:J */
/* .line 5 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V */
/* .line 6 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V */
this.g = v0;
/* .line 7 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
int v2 = 5; // const/4 v2, 0x5
/* const/high16 v3, 0x3f400000 # 0.75f */
/* invoke-direct {v0, v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V */
this.h = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
this.i = v0;
/* .line 9 */
/* new-instance v0, Lc/e/d; */
/* invoke-direct {v0}, Lc/e/d;-><init>()V */
this.j = v0;
/* .line 10 */
/* new-instance v0, Lc/e/d; */
/* invoke-direct {v0}, Lc/e/d;-><init>()V */
this.k = v0;
/* .line 11 */
this.d = p1;
/* .line 12 */
/* new-instance p1, Le/f/a/b/e/a/b; */
/* invoke-direct {p1, p2, p0}, Le/f/a/b/e/a/b;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V */
this.l = p1;
/* .line 13 */
this.e = p3;
/* .line 14 */
/* new-instance p1, Le/f/a/b/c/m/e; */
/* invoke-direct {p1, p3}, Le/f/a/b/c/m/e;-><init>(Le/f/a/b/c/f;)V */
this.f = p1;
/* .line 15 */
p1 = this.l;
int p2 = 6; // const/4 p2, 0x6
(( android.os.Handler ) p1 ).obtainMessage ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
(( android.os.Handler ) p1 ).sendMessage ( p2 ); // invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
return;
} // .end method
public static android.os.Handler a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 22 */
p0 = this.l;
} // .end method
public static e.f.a.b.c.l.k.f a ( android.content.Context p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = e.f.a.b.c.l.k.f.o;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = e.f.a.b.c.l.k.f.p;
/* if-nez v1, :cond_0 */
/* .line 3 */
/* new-instance v1, Landroid/os/HandlerThread; */
final String v2 = "GoogleApiHandler"; // const-string v2, "GoogleApiHandler"
/* const/16 v3, 0x9 */
/* invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V */
/* .line 4 */
(( android.os.HandlerThread ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V
/* .line 5 */
(( android.os.HandlerThread ) v1 ).getLooper ( ); // invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
/* .line 6 */
/* new-instance v2, Le/f/a/b/c/l/k/f; */
/* .line 7 */
(( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
e.f.a.b.c.e .b ( );
/* invoke-direct {v2, p0, v1, v3}, Le/f/a/b/c/l/k/f;-><init>(Landroid/content/Context;Landroid/os/Looper;Le/f/a/b/c/e;)V */
/* .line 8 */
} // :cond_0
p0 = e.f.a.b.c.l.k.f.p;
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 9 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static android.content.Context b ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 2 */
p0 = this.d;
} // .end method
public static java.lang.Object b ( ) { //synthethic
/* .locals 1 */
/* .line 3 */
v0 = e.f.a.b.c.l.k.f.o;
} // .end method
public static Long c ( Object p0 ) { //synthethic
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Le/f/a/b/c/l/k/f;->a:J */
/* return-wide v0 */
} // .end method
public static com.google.android.gms.common.api.Status c ( ) { //synthethic
/* .locals 1 */
/* .line 2 */
v0 = e.f.a.b.c.l.k.f.n;
} // .end method
public static Long d ( Object p0 ) { //synthethic
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Le/f/a/b/c/l/k/f;->b:J */
/* return-wide v0 */
} // .end method
public static e.f.a.b.c.m.e e ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.f;
} // .end method
public static e.f.a.b.c.l.k.m f ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.i;
} // .end method
public static java.util.Set g ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.j;
} // .end method
public static e.f.a.b.c.e h ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.e;
} // .end method
public static Long i ( Object p0 ) { //synthethic
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Le/f/a/b/c/l/k/f;->c:J */
/* return-wide v0 */
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 2 */
/* .line 17 */
v0 = this.l;
int v1 = 3; // const/4 v1, 0x3
(( android.os.Handler ) v0 ).obtainMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
(( android.os.Handler ) v0 ).sendMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
return;
} // .end method
public final void a ( Object p0, Integer p1 ) {
/* .locals 3 */
/* .line 18 */
v0 = (( e.f.a.b.c.l.k.f ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/b/c/l/k/f;->b(Le/f/a/b/c/a;I)Z
/* if-nez v0, :cond_0 */
/* .line 19 */
v0 = this.l;
int v1 = 5; // const/4 v1, 0x5
int v2 = 0; // const/4 v2, 0x0
/* .line 20 */
(( android.os.Handler ) v0 ).obtainMessage ( v1, p2, v2, p1 ); // invoke-virtual {v0, v1, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;
/* .line 21 */
(( android.os.Handler ) v0 ).sendMessage ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
} // :cond_0
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/b/c/l/i<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 10 */
(( e.f.a.b.c.l.i ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/b/c/l/i;->b()Le/f/a/b/c/l/k/a0;
/* .line 11 */
v1 = this.h;
/* check-cast v1, Le/f/a/b/c/l/k/c; */
/* if-nez v1, :cond_0 */
/* .line 12 */
/* new-instance v1, Le/f/a/b/c/l/k/c; */
/* invoke-direct {v1, p0, p1}, Le/f/a/b/c/l/k/c;-><init>(Le/f/a/b/c/l/k/f;Le/f/a/b/c/l/i;)V */
/* .line 13 */
p1 = this.h;
/* .line 14 */
} // :cond_0
p1 = (( e.f.a.b.c.l.k.c ) v1 ).d ( ); // invoke-virtual {v1}, Le/f/a/b/c/l/k/c;->d()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 15 */
p1 = this.k;
/* .line 16 */
} // :cond_1
(( e.f.a.b.c.l.k.c ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/a/b/c/l/k/c;->a()V
return;
} // .end method
public final Boolean b ( Object p0, Integer p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
v1 = this.d;
p1 = (( e.f.a.b.c.e ) v0 ).a ( v1, p1, p2 ); // invoke-virtual {v0, v1, p1, p2}, Le/f/a/b/c/e;->a(Landroid/content/Context;Le/f/a/b/c/a;I)Z
} // .end method
public Boolean handleMessage ( android.os.Message p0 ) {
/* .locals 7 */
/* .line 1 */
/* iget v0, p1, Landroid/os/Message;->what:I */
int v1 = 1; // const/4 v1, 0x1
/* const-wide/32 v2, 0x493e0 */
final String v4 = "GoogleApiManager"; // const-string v4, "GoogleApiManager"
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* packed-switch v0, :pswitch_data_0 */
/* const/16 p1, 0x1f */
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p1 = "Unknown message id: "; // const-string p1, "Unknown message id: "
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v4,p1 );
/* .line 3 */
/* :pswitch_0 */
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/l/k/d; */
/* .line 4 */
v0 = this.h;
v0 = e.f.a.b.c.l.k.d .a ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 5 */
v0 = this.h;
e.f.a.b.c.l.k.d .a ( p1 );
/* check-cast v0, Le/f/a/b/c/l/k/c; */
e.f.a.b.c.l.k.c .b ( v0,p1 );
/* goto/16 :goto_4 */
/* .line 6 */
/* :pswitch_1 */
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/l/k/d; */
/* .line 7 */
v0 = this.h;
v0 = e.f.a.b.c.l.k.d .a ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 8 */
v0 = this.h;
e.f.a.b.c.l.k.d .a ( p1 );
/* check-cast v0, Le/f/a/b/c/l/k/c; */
e.f.a.b.c.l.k.c .a ( v0,p1 );
/* goto/16 :goto_4 */
/* .line 9 */
/* :pswitch_2 */
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/l/k/n; */
/* .line 10 */
(( e.f.a.b.c.l.k.n ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/b/c/l/k/n;->b()Le/f/a/b/c/l/k/a0;
/* .line 11 */
v2 = v2 = this.h;
/* if-nez v2, :cond_0 */
/* .line 12 */
(( e.f.a.b.c.l.k.n ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/c/l/k/n;->a()Le/f/a/b/h/h;
java.lang.Boolean .valueOf ( v5 );
(( e.f.a.b.h.h ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V
/* goto/16 :goto_4 */
/* .line 13 */
} // :cond_0
v2 = this.h;
/* .line 14 */
/* check-cast v0, Le/f/a/b/c/l/k/c; */
v0 = e.f.a.b.c.l.k.c .a ( v0,v5 );
/* .line 15 */
(( e.f.a.b.c.l.k.n ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/c/l/k/n;->a()Le/f/a/b/h/h;
java.lang.Boolean .valueOf ( v0 );
(( e.f.a.b.h.h ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V
/* goto/16 :goto_4 */
/* .line 16 */
/* :pswitch_3 */
v0 = this.h;
v0 = v2 = this.obj;
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 17 */
v0 = this.h;
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/l/k/c; */
(( e.f.a.b.c.l.k.c ) p1 ).p ( ); // invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->p()Z
/* goto/16 :goto_4 */
/* .line 18 */
/* :pswitch_4 */
v0 = this.h;
v0 = v2 = this.obj;
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 19 */
v0 = this.h;
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/l/k/c; */
(( e.f.a.b.c.l.k.c ) p1 ).g ( ); // invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->g()V
/* goto/16 :goto_4 */
/* .line 20 */
/* :pswitch_5 */
p1 = this.k;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Le/f/a/b/c/l/k/a0; */
/* .line 21 */
v2 = this.h;
/* check-cast v0, Le/f/a/b/c/l/k/c; */
(( e.f.a.b.c.l.k.c ) v0 ).j ( ); // invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->j()V
/* .line 22 */
} // :cond_1
p1 = this.k;
/* goto/16 :goto_4 */
/* .line 23 */
/* :pswitch_6 */
v0 = this.h;
v0 = v2 = this.obj;
if ( v0 != null) { // if-eqz v0, :cond_b
/* .line 24 */
v0 = this.h;
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/l/k/c; */
(( e.f.a.b.c.l.k.c ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->e()V
/* goto/16 :goto_4 */
/* .line 25 */
/* :pswitch_7 */
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/l/i; */
(( e.f.a.b.c.l.k.f ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/i;)V
/* goto/16 :goto_4 */
/* .line 26 */
/* :pswitch_8 */
p1 = e.f.a.b.c.p.h .a ( );
if ( p1 != null) { // if-eqz p1, :cond_b
/* .line 27 */
p1 = this.d;
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* instance-of p1, p1, Landroid/app/Application; */
if ( p1 != null) { // if-eqz p1, :cond_b
/* .line 28 */
p1 = this.d;
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* check-cast p1, Landroid/app/Application; */
/* .line 29 */
e.f.a.b.c.l.k.b .a ( p1 );
/* .line 30 */
e.f.a.b.c.l.k.b .b ( );
/* new-instance v0, Le/f/a/b/c/l/k/p; */
/* invoke-direct {v0, p0}, Le/f/a/b/c/l/k/p;-><init>(Le/f/a/b/c/l/k/f;)V */
/* .line 31 */
(( e.f.a.b.c.l.k.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/a/b/c/l/k/b;->a(Le/f/a/b/c/l/k/a;)V
/* .line 32 */
e.f.a.b.c.l.k.b .b ( );
/* .line 33 */
p1 = (( e.f.a.b.c.l.k.b ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Le/f/a/b/c/l/k/b;->b(Z)Z
/* if-nez p1, :cond_b */
/* .line 34 */
/* iput-wide v2, p0, Le/f/a/b/c/l/k/f;->c:J */
/* goto/16 :goto_4 */
/* .line 35 */
/* :pswitch_9 */
/* iget v0, p1, Landroid/os/Message;->arg1:I */
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/a; */
/* .line 36 */
v2 = this.h;
v3 = } // :cond_2
if ( v3 != null) { // if-eqz v3, :cond_3
/* check-cast v3, Le/f/a/b/c/l/k/c; */
/* .line 37 */
v5 = (( e.f.a.b.c.l.k.c ) v3 ).b ( ); // invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->b()I
/* if-ne v5, v0, :cond_2 */
/* move-object v6, v3 */
} // :cond_3
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 38 */
/* new-instance v0, Lcom/google/android/gms/common/api/Status; */
/* const/16 v2, 0x11 */
v3 = this.e;
/* .line 39 */
v4 = (( e.f.a.b.c.a ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/c/a;->a()I
(( e.f.a.b.c.e ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/a/b/c/e;->a(I)Ljava/lang/String;
/* .line 40 */
(( e.f.a.b.c.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/b/c/a;->b()Ljava/lang/String;
java.lang.String .valueOf ( v3 );
v4 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
/* add-int/lit8 v4, v4, 0x45 */
java.lang.String .valueOf ( p1 );
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* add-int/2addr v4, v5 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v4 = "Error resolution was canceled by the user, original error message: "; // const-string v4, "Error resolution was canceled by the user, original error message: "
(( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ": "; // const-string v3, ": "
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V */
/* .line 41 */
(( e.f.a.b.c.l.k.c ) v6 ).a ( v0 ); // invoke-virtual {v6, v0}, Le/f/a/b/c/l/k/c;->a(Lcom/google/android/gms/common/api/Status;)V
/* goto/16 :goto_4 */
} // :cond_4
/* const/16 p1, 0x4c */
/* .line 42 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(I)V */
final String p1 = "Could not find API instance "; // const-string p1, "Could not find API instance "
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " while trying to fail enqueued calls."; // const-string p1, " while trying to fail enqueued calls."
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v0, Ljava/lang/Exception; */
/* invoke-direct {v0}, Ljava/lang/Exception;-><init>()V */
android.util.Log .wtf ( v4,p1,v0 );
/* goto/16 :goto_4 */
/* .line 43 */
/* :pswitch_a */
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/l/k/s; */
/* .line 44 */
v0 = this.h;
v2 = this.c;
(( e.f.a.b.c.l.i ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/a/b/c/l/i;->b()Le/f/a/b/c/l/k/a0;
/* check-cast v0, Le/f/a/b/c/l/k/c; */
/* if-nez v0, :cond_5 */
/* .line 45 */
v0 = this.c;
(( e.f.a.b.c.l.k.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/i;)V
/* .line 46 */
v0 = this.h;
v2 = this.c;
(( e.f.a.b.c.l.i ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/a/b/c/l/i;->b()Le/f/a/b/c/l/k/a0;
/* check-cast v0, Le/f/a/b/c/l/k/c; */
/* .line 47 */
} // :cond_5
v2 = (( e.f.a.b.c.l.k.c ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->d()Z
if ( v2 != null) { // if-eqz v2, :cond_6
v2 = this.g;
v2 = (( java.util.concurrent.atomic.AtomicInteger ) v2 ).get ( ); // invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I
/* iget v3, p1, Le/f/a/b/c/l/k/s;->b:I */
/* if-eq v2, v3, :cond_6 */
/* .line 48 */
p1 = this.a;
v2 = e.f.a.b.c.l.k.f.m;
(( e.f.a.b.c.l.k.o ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/f/a/b/c/l/k/o;->a(Lcom/google/android/gms/common/api/Status;)V
/* .line 49 */
(( e.f.a.b.c.l.k.c ) v0 ).j ( ); // invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->j()V
/* goto/16 :goto_4 */
/* .line 50 */
} // :cond_6
p1 = this.a;
(( e.f.a.b.c.l.k.c ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/l/k/o;)V
/* goto/16 :goto_4 */
/* .line 51 */
/* :pswitch_b */
p1 = this.h;
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_b
/* check-cast v0, Le/f/a/b/c/l/k/c; */
/* .line 52 */
(( e.f.a.b.c.l.k.c ) v0 ).l ( ); // invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->l()V
/* .line 53 */
(( e.f.a.b.c.l.k.c ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->a()V
/* .line 54 */
/* :pswitch_c */
p1 = this.obj;
/* check-cast p1, Le/f/a/b/c/l/k/b0; */
/* .line 55 */
(( e.f.a.b.c.l.k.b0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/c/l/k/b0;->a()Ljava/util/Set;
/* .line 56 */
v2 = } // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_b
/* check-cast v2, Le/f/a/b/c/l/k/a0; */
/* .line 57 */
v3 = this.h;
/* check-cast v3, Le/f/a/b/c/l/k/c; */
/* if-nez v3, :cond_7 */
/* .line 58 */
/* new-instance v0, Le/f/a/b/c/a; */
/* const/16 v3, 0xd */
/* invoke-direct {v0, v3}, Le/f/a/b/c/a;-><init>(I)V */
/* .line 59 */
(( e.f.a.b.c.l.k.b0 ) p1 ).a ( v2, v0, v6 ); // invoke-virtual {p1, v2, v0, v6}, Le/f/a/b/c/l/k/b0;->a(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/a;Ljava/lang/String;)V
/* .line 60 */
} // :cond_7
v4 = (( e.f.a.b.c.l.k.c ) v3 ).c ( ); // invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->c()Z
if ( v4 != null) { // if-eqz v4, :cond_8
/* .line 61 */
v4 = e.f.a.b.c.a.f;
/* .line 62 */
(( e.f.a.b.c.l.k.c ) v3 ).f ( ); // invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->f()Le/f/a/b/c/l/e;
/* .line 63 */
(( e.f.a.b.c.l.k.b0 ) p1 ).a ( v2, v4, v3 ); // invoke-virtual {p1, v2, v4, v3}, Le/f/a/b/c/l/k/b0;->a(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/a;Ljava/lang/String;)V
/* .line 64 */
} // :cond_8
(( e.f.a.b.c.l.k.c ) v3 ).m ( ); // invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->m()Le/f/a/b/c/a;
if ( v4 != null) { // if-eqz v4, :cond_9
/* .line 65 */
(( e.f.a.b.c.l.k.c ) v3 ).m ( ); // invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->m()Le/f/a/b/c/a;
/* .line 66 */
(( e.f.a.b.c.l.k.b0 ) p1 ).a ( v2, v3, v6 ); // invoke-virtual {p1, v2, v3, v6}, Le/f/a/b/c/l/k/b0;->a(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/a;Ljava/lang/String;)V
/* .line 67 */
} // :cond_9
(( e.f.a.b.c.l.k.c ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/l/k/b0;)V
/* .line 68 */
(( e.f.a.b.c.l.k.c ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->a()V
/* .line 69 */
/* :pswitch_d */
p1 = this.obj;
/* check-cast p1, Ljava/lang/Boolean; */
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
if ( p1 != null) { // if-eqz p1, :cond_a
/* const-wide/16 v2, 0x2710 */
/* .line 70 */
} // :cond_a
/* iput-wide v2, p0, Le/f/a/b/c/l/k/f;->c:J */
/* .line 71 */
p1 = this.l;
/* const/16 v0, 0xc */
(( android.os.Handler ) p1 ).removeMessages ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V
/* .line 72 */
p1 = this.h;
v2 = } // :goto_3
if ( v2 != null) { // if-eqz v2, :cond_b
/* check-cast v2, Le/f/a/b/c/l/k/a0; */
/* .line 73 */
v3 = this.l;
/* .line 74 */
(( android.os.Handler ) v3 ).obtainMessage ( v0, v2 ); // invoke-virtual {v3, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
/* iget-wide v4, p0, Le/f/a/b/c/l/k/f;->c:J */
/* .line 75 */
(( android.os.Handler ) v3 ).sendMessageDelayed ( v2, v4, v5 ); // invoke-virtual {v3, v2, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
} // :cond_b
} // :goto_4
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_d */
/* :pswitch_c */
/* :pswitch_b */
/* :pswitch_a */
/* :pswitch_9 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_a */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_a */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
