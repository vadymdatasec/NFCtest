public class e.f.a.b.g.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.util.concurrent.ScheduledExecutorService l;
	 /* # instance fields */
	 public final java.lang.Object a;
	 public final android.os.PowerManager$WakeLock b;
	 public android.os.WorkSource c;
	 public final Integer d;
	 public final java.lang.String e;
	 public final java.lang.String f;
	 public final android.content.Context g;
	 public Boolean h;
	 public final java.util.Map i;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "[", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Integer j;
public java.util.concurrent.atomic.AtomicInteger k;
/* # direct methods */
public static e.f.a.b.g.a ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/a/b/g/b; */
/* invoke-direct {v0}, Le/f/a/b/g/b;-><init>()V */
return;
} // .end method
public e.f.a.b.g.a ( ) {
/* .locals 7 */
/* if-nez p1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :cond_0
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
} // :goto_0
/* move-object v6, v0 */
int v5 = 0; // const/4 v5, 0x0
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move-object v4, p3 */
/* .line 2 */
/* invoke-direct/range {v1 ..v6}, Le/f/a/b/g/a;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
return;
} // .end method
public e.f.a.b.g.a ( ) {
/* .locals 7 */
int v4 = 0; // const/4 v4, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move-object v3, p3 */
/* move-object v5, p5 */
/* .line 3 */
/* invoke-direct/range {v0 ..v6}, Le/f/a/b/g/a;-><init>(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
return;
} // .end method
public e.f.a.b.g.a ( ) {
/* .locals 1 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "UnwrappedWakeLock" */
/* } */
} // .end annotation
/* .line 4 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 5 */
this.a = p0;
int p4 = 1; // const/4 p4, 0x1
/* .line 6 */
/* iput-boolean p4, p0, Le/f/a/b/g/a;->h:Z */
/* .line 7 */
/* new-instance p4, Ljava/util/HashMap; */
/* invoke-direct {p4}, Ljava/util/HashMap;-><init>()V */
this.i = p4;
/* .line 8 */
/* new-instance p4, Ljava/util/HashSet; */
/* invoke-direct {p4}, Ljava/util/HashSet;-><init>()V */
java.util.Collections .synchronizedSet ( p4 );
/* .line 9 */
/* new-instance p4, Ljava/util/concurrent/atomic/AtomicInteger; */
int p6 = 0; // const/4 p6, 0x0
/* invoke-direct {p4, p6}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V */
this.k = p4;
final String p4 = "WakeLock: context must not be null"; // const-string p4, "WakeLock: context must not be null"
/* .line 10 */
e.f.a.b.c.m.h .a ( p1,p4 );
final String p4 = "WakeLock: wakeLockName must not be empty"; // const-string p4, "WakeLock: wakeLockName must not be empty"
/* .line 11 */
e.f.a.b.c.m.h .a ( p3,p4 );
/* .line 12 */
/* iput p2, p0, Le/f/a/b/g/a;->d:I */
int p4 = 0; // const/4 p4, 0x0
/* .line 13 */
this.f = p4;
/* .line 14 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
this.g = p4;
/* .line 15 */
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String p6 = "com.google.android.gms"; // const-string p6, "com.google.android.gms"
p4 = (( java.lang.String ) p6 ).equals ( p4 ); // invoke-virtual {p6, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez p4, :cond_1 */
final String p4 = "*gcore*:"; // const-string p4, "*gcore*:"
/* .line 16 */
java.lang.String .valueOf ( p3 );
v0 = (( java.lang.String ) p6 ).length ( ); // invoke-virtual {p6}, Ljava/lang/String;->length()I
if ( v0 != null) { // if-eqz v0, :cond_0
(( java.lang.String ) p4 ).concat ( p6 ); // invoke-virtual {p4, p6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
/* new-instance p6, Ljava/lang/String; */
/* invoke-direct {p6, p4}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
/* move-object p4, p6 */
} // :goto_0
this.e = p4;
/* .line 17 */
} // :cond_1
this.e = p3;
} // :goto_1
final String p4 = "power"; // const-string p4, "power"
/* .line 18 */
(( android.content.Context ) p1 ).getSystemService ( p4 ); // invoke-virtual {p1, p4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p4, Landroid/os/PowerManager; */
/* .line 19 */
(( android.os.PowerManager ) p4 ).newWakeLock ( p2, p3 ); // invoke-virtual {p4, p2, p3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
this.b = p2;
/* .line 20 */
p2 = e.f.a.b.c.p.k .a ( p1 );
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 21 */
p2 = e.f.a.b.c.p.j .a ( p5 );
if ( p2 != null) { // if-eqz p2, :cond_2
/* .line 22 */
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 23 */
} // :cond_2
e.f.a.b.c.p.k .a ( p1,p5 );
this.c = p1;
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 24 */
p2 = this.g;
p2 = e.f.a.b.c.p.k .a ( p2 );
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 25 */
p2 = this.c;
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 26 */
(( android.os.WorkSource ) p2 ).add ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/WorkSource;->add(Landroid/os/WorkSource;)Z
/* .line 27 */
} // :cond_3
this.c = p1;
/* .line 28 */
} // :goto_2
p1 = this.c;
/* .line 29 */
try { // :try_start_0
p2 = this.b;
(( android.os.PowerManager$WakeLock ) p2 ).setWorkSource ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/PowerManager$WakeLock;->setWorkSource(Landroid/os/WorkSource;)V
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p1 */
/* .line 30 */
} // :goto_3
(( java.lang.RuntimeException ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;
final String p2 = "WakeLock"; // const-string p2, "WakeLock"
android.util.Log .wtf ( p2,p1 );
/* .line 31 */
} // :cond_4
} // :goto_4
p1 = e.f.a.b.g.a.l;
/* if-nez p1, :cond_5 */
/* .line 32 */
e.f.a.b.c.n.b .a ( );
} // :cond_5
return;
} // .end method
public static void a ( Object p0, Integer p1 ) { //synthethic
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 49 */
(( e.f.a.b.g.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/b/g/a;->a(I)V
return;
} // .end method
/* # virtual methods */
public final java.lang.String a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 46 */
/* iget-boolean v0, p0, Le/f/a/b/g/a;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = android.text.TextUtils .isEmpty ( p1 );
/* if-nez v0, :cond_0 */
} // :cond_0
p1 = this.f;
} // :cond_1
p1 = this.f;
} // .end method
public void a ( ) {
/* .locals 12 */
/* .line 22 */
v0 = this.k;
v0 = (( java.util.concurrent.atomic.AtomicInteger ) v0 ).decrementAndGet ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I
/* if-gez v0, :cond_0 */
/* .line 23 */
v0 = this.e;
java.lang.String .valueOf ( v0 );
final String v1 = " release without a matched acquire!"; // const-string v1, " release without a matched acquire!"
(( java.lang.String ) v0 ).concat ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
final String v1 = "WakeLock"; // const-string v1, "WakeLock"
android.util.Log .e ( v1,v0 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 24 */
(( e.f.a.b.g.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/b/g/a;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 25 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 26 */
try { // :try_start_0
/* iget-boolean v1, p0, Le/f/a/b/g/a;->h:Z */
int v10 = 1; // const/4 v10, 0x1
int v11 = 0; // const/4 v11, 0x0
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 27 */
v1 = this.i;
/* check-cast v1, [Ljava/lang/Integer; */
/* if-nez v1, :cond_1 */
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* .line 28 */
} // :cond_1
/* aget-object v2, v1, v11 */
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* if-ne v2, v10, :cond_2 */
/* .line 29 */
v1 = this.i;
int v1 = 1; // const/4 v1, 0x1
/* .line 30 */
} // :cond_2
/* aget-object v2, v1, v11 */
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* sub-int/2addr v2, v10 */
java.lang.Integer .valueOf ( v2 );
/* aput-object v2, v1, v11 */
} // :goto_1
/* if-nez v1, :cond_4 */
/* .line 31 */
} // :cond_3
/* iget-boolean v1, p0, Le/f/a/b/g/a;->h:Z */
/* if-nez v1, :cond_5 */
/* iget v1, p0, Le/f/a/b/g/a;->j:I */
/* if-ne v1, v10, :cond_5 */
/* .line 32 */
} // :cond_4
e.f.a.b.c.o.d .a ( );
v2 = this.g;
v3 = this.b;
/* .line 33 */
e.f.a.b.c.o.c .a ( v3,v6 );
/* const/16 v4, 0x8 */
v5 = this.e;
int v7 = 0; // const/4 v7, 0x0
/* iget v8, p0, Le/f/a/b/g/a;->d:I */
/* .line 34 */
(( e.f.a.b.g.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/g/a;->b()Ljava/util/List;
/* .line 35 */
/* invoke-virtual/range {v1 ..v9}, Le/f/a/b/c/o/d;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V */
/* .line 36 */
/* iget v1, p0, Le/f/a/b/g/a;->j:I */
/* sub-int/2addr v1, v10 */
/* iput v1, p0, Le/f/a/b/g/a;->j:I */
/* .line 37 */
} // :cond_5
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 38 */
(( e.f.a.b.g.a ) p0 ).a ( v11 ); // invoke-virtual {p0, v11}, Le/f/a/b/g/a;->a(I)V
return;
/* :catchall_0 */
/* move-exception v1 */
/* .line 39 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v1 */
} // .end method
public final void a ( Integer p0 ) {
/* .locals 2 */
/* .line 40 */
p1 = this.b;
p1 = (( android.os.PowerManager$WakeLock ) p1 ).isHeld ( ); // invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 41 */
try { // :try_start_0
p1 = this.b;
(( android.os.PowerManager$WakeLock ) p1 ).release ( ); // invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->release()V
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 42 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* const-class v1, Ljava/lang/RuntimeException; */
v0 = (( java.lang.Object ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 43 */
v0 = this.e;
java.lang.String .valueOf ( v0 );
final String v1 = " was already released!"; // const-string v1, " was already released!"
(( java.lang.String ) v0 ).concat ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
final String v1 = "WakeLock"; // const-string v1, "WakeLock"
android.util.Log .e ( v1,v0,p1 );
/* .line 44 */
} // :goto_0
p1 = this.b;
(( android.os.PowerManager$WakeLock ) p1 ).isHeld ( ); // invoke-virtual {p1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z
/* .line 45 */
} // :cond_0
/* throw p1 */
} // :cond_1
} // :goto_1
return;
} // .end method
public void a ( Long p0 ) {
/* .locals 13 */
/* .line 1 */
v0 = this.k;
(( java.util.concurrent.atomic.AtomicInteger ) v0 ).incrementAndGet ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( e.f.a.b.g.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/b/g/a;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 3 */
v0 = this.a;
/* monitor-enter v0 */
/* .line 4 */
try { // :try_start_0
v1 = v1 = this.i;
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* iget v1, p0, Le/f/a/b/g/a;->j:I */
/* if-lez v1, :cond_1 */
} // :cond_0
v1 = this.b;
v1 = (( android.os.PowerManager$WakeLock ) v1 ).isHeld ( ); // invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z
/* if-nez v1, :cond_1 */
/* .line 5 */
v1 = this.i;
/* .line 6 */
/* iput v2, p0, Le/f/a/b/g/a;->j:I */
/* .line 7 */
} // :cond_1
/* iget-boolean v1, p0, Le/f/a/b/g/a;->h:Z */
int v12 = 1; // const/4 v12, 0x1
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 8 */
v1 = this.i;
/* check-cast v1, [Ljava/lang/Integer; */
/* if-nez v1, :cond_2 */
/* .line 9 */
v1 = this.i;
/* new-array v3, v12, [Ljava/lang/Integer; */
java.lang.Integer .valueOf ( v12 );
/* aput-object v4, v3, v2 */
int v2 = 1; // const/4 v2, 0x1
/* .line 10 */
} // :cond_2
/* aget-object v3, v1, v2 */
v3 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* add-int/2addr v3, v12 */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
} // :goto_0
/* if-nez v2, :cond_4 */
/* .line 11 */
} // :cond_3
/* iget-boolean v1, p0, Le/f/a/b/g/a;->h:Z */
/* if-nez v1, :cond_5 */
/* iget v1, p0, Le/f/a/b/g/a;->j:I */
/* if-nez v1, :cond_5 */
/* .line 12 */
} // :cond_4
e.f.a.b.c.o.d .a ( );
v2 = this.g;
v3 = this.b;
/* .line 13 */
e.f.a.b.c.o.c .a ( v3,v6 );
int v4 = 7; // const/4 v4, 0x7
v5 = this.e;
int v7 = 0; // const/4 v7, 0x0
/* iget v8, p0, Le/f/a/b/g/a;->d:I */
/* .line 14 */
(( e.f.a.b.g.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/g/a;->b()Ljava/util/List;
/* move-wide v10, p1 */
/* .line 15 */
/* invoke-virtual/range {v1 ..v11}, Le/f/a/b/c/o/d;->a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;J)V */
/* .line 16 */
/* iget v1, p0, Le/f/a/b/g/a;->j:I */
/* add-int/2addr v1, v12 */
/* iput v1, p0, Le/f/a/b/g/a;->j:I */
/* .line 17 */
} // :cond_5
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 18 */
v0 = this.b;
(( android.os.PowerManager$WakeLock ) v0 ).acquire ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p1, v0 */
/* if-lez v2, :cond_6 */
/* .line 19 */
v0 = e.f.a.b.g.a.l;
/* new-instance v1, Le/f/a/b/g/c; */
/* invoke-direct {v1, p0}, Le/f/a/b/g/c;-><init>(Le/f/a/b/g/a;)V */
v2 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* .line 20 */
} // :cond_6
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 21 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
} // .end method
public void a ( Boolean p0 ) {
/* .locals 1 */
/* .line 47 */
v0 = this.b;
(( android.os.PowerManager$WakeLock ) v0 ).setReferenceCounted ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V
/* .line 48 */
/* iput-boolean p1, p0, Le/f/a/b/g/a;->h:Z */
return;
} // .end method
public final java.util.List b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
e.f.a.b.c.p.k .a ( v0 );
} // .end method
