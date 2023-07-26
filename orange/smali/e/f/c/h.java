public class e.f.c.h {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Object i;
	 public static final java.util.concurrent.Executor j;
	 public static final java.util.Map k;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Le/f/c/h;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.content.Context a;
public final java.lang.String b;
public final e.f.c.i c;
public final e.f.c.k.p d;
public final java.util.concurrent.atomic.AtomicBoolean e;
public final java.util.concurrent.atomic.AtomicBoolean f;
public final e.f.c.k.x g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/c/k/x<", */
/* "Le/f/c/t/a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final java.util.List h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Le/f/c/d;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.c.h ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Le/f/c/f; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Le/f/c/f;-><init>(Le/f/c/c;)V */
/* .line 3 */
/* new-instance v0, Lc/e/b; */
/* invoke-direct {v0}, Lc/e/b;-><init>()V */
return;
} // .end method
public e.f.c.h ( ) {
/* .locals 7 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
this.e = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V */
this.f = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList; */
/* invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V */
this.h = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList; */
/* invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V */
/* .line 6 */
e.f.a.b.c.m.h .a ( p1 );
/* move-object v0, p1 */
/* check-cast v0, Landroid/content/Context; */
this.a = v0;
/* .line 7 */
e.f.a.b.c.m.h .a ( p2 );
this.b = p2;
/* .line 8 */
e.f.a.b.c.m.h .a ( p3 );
/* move-object p2, p3 */
/* check-cast p2, Le/f/c/i; */
this.c = p2;
/* .line 9 */
/* const-class p2, Lcom/google/firebase/components/ComponentDiscoveryService; */
/* .line 10 */
e.f.c.k.j .a ( p1,p2 );
/* .line 11 */
(( e.f.c.k.j ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/c/k/j;->a()Ljava/util/List;
/* .line 12 */
e.f.c.v.e .a ( );
/* .line 13 */
/* new-instance v2, Le/f/c/k/p; */
v3 = e.f.c.h.j;
/* const/16 v4, 0x8 */
/* new-array v4, v4, [Le/f/c/k/e; */
/* const-class v5, Landroid/content/Context; */
/* new-array v6, v1, [Ljava/lang/Class; */
/* .line 14 */
e.f.c.k.e .a ( p1,v5,v6 );
/* aput-object v5, v4, v1 */
/* const-class v5, Le/f/c/h; */
/* new-array v6, v1, [Ljava/lang/Class; */
/* .line 15 */
e.f.c.k.e .a ( p0,v5,v6 );
int v6 = 1; // const/4 v6, 0x1
/* aput-object v5, v4, v6 */
/* const-class v5, Le/f/c/i; */
/* new-array v1, v1, [Ljava/lang/Class; */
/* .line 16 */
e.f.c.k.e .a ( p3,v5,v1 );
int v1 = 2; // const/4 v1, 0x2
/* aput-object p3, v4, v1 */
final String p3 = "fire-android"; // const-string p3, "fire-android"
final String v1 = ""; // const-string v1, ""
/* .line 17 */
e.f.c.v.g .a ( p3,v1 );
int v1 = 3; // const/4 v1, 0x3
/* aput-object p3, v4, v1 */
final String p3 = "fire-core"; // const-string p3, "fire-core"
final String v1 = "19.3.1"; // const-string v1, "19.3.1"
/* .line 18 */
e.f.c.v.g .a ( p3,v1 );
int v1 = 4; // const/4 v1, 0x4
/* aput-object p3, v4, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
final String p3 = "kotlin"; // const-string p3, "kotlin"
/* .line 19 */
e.f.c.v.g .a ( p3,v0 );
} // :cond_0
int p3 = 0; // const/4 p3, 0x0
} // :goto_0
int v0 = 5; // const/4 v0, 0x5
/* aput-object p3, v4, v0 */
int p3 = 6; // const/4 p3, 0x6
/* .line 20 */
e.f.c.v.c .b ( );
/* aput-object v0, v4, p3 */
int p3 = 7; // const/4 p3, 0x7
/* .line 21 */
e.f.c.p.b .a ( );
/* aput-object v0, v4, p3 */
/* invoke-direct {v2, v3, p2, v4}, Le/f/c/k/p;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Iterable;[Le/f/c/k/e;)V */
this.d = v2;
/* .line 22 */
/* new-instance p2, Le/f/c/k/x; */
e.f.c.b .a ( p0,p1 );
/* invoke-direct {p2, p1}, Le/f/c/k/x;-><init>(Le/f/c/r/a;)V */
this.g = p2;
return;
} // .end method
public static e.f.c.h a ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 3 */
v0 = e.f.c.h.i;
/* monitor-enter v0 */
/* .line 4 */
try { // :try_start_0
v1 = e.f.c.h.k;
v1 = final String v2 = "[DEFAULT]"; // const-string v2, "[DEFAULT]"
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
e.f.c.h .j ( );
/* monitor-exit v0 */
/* .line 6 */
} // :cond_0
e.f.c.i .a ( p0 );
/* if-nez v1, :cond_1 */
final String p0 = "FirebaseApp"; // const-string p0, "FirebaseApp"
final String v1 = "Default FirebaseApp failed to initialize because no default options were found.This usually means that com.google.gms:google-services was not applied to your gradle project."; // const-string v1, "Default FirebaseApp failed to initialize because no default options were found.This usually means that com.google.gms:google-services was not applied to your gradle project."
/* .line 7 */
android.util.Log .w ( p0,v1 );
int p0 = 0; // const/4 p0, 0x0
/* .line 8 */
/* monitor-exit v0 */
/* .line 9 */
} // :cond_1
e.f.c.h .a ( p0,v1 );
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 10 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
public static e.f.c.h a ( android.content.Context p0, Object p1 ) {
/* .locals 1 */
final String v0 = "[DEFAULT]"; // const-string v0, "[DEFAULT]"
/* .line 11 */
e.f.c.h .a ( p0,p1,v0 );
} // .end method
public static e.f.c.h a ( android.content.Context p0, Object p1, java.lang.String p2 ) {
/* .locals 4 */
/* .line 12 */
e.f.c.e .a ( p0 );
/* .line 13 */
e.f.c.h .a ( p2 );
/* .line 14 */
(( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* if-nez v0, :cond_0 */
/* .line 15 */
} // :cond_0
(( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 16 */
} // :goto_0
v0 = e.f.c.h.i;
/* monitor-enter v0 */
/* .line 17 */
try { // :try_start_0
v1 = e.f.c.h.k;
v1 = /* .line 18 */
/* if-nez v1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "FirebaseApp name "; // const-string v3, "FirebaseApp name "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = " already exists!"; // const-string v3, " already exists!"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 19 */
e.f.a.b.c.m.h .b ( v1,v2 );
final String v1 = "Application context cannot be null."; // const-string v1, "Application context cannot be null."
/* .line 20 */
e.f.a.b.c.m.h .a ( p0,v1 );
/* .line 21 */
/* new-instance v1, Le/f/c/h; */
/* invoke-direct {v1, p0, p2, p1}, Le/f/c/h;-><init>(Landroid/content/Context;Ljava/lang/String;Le/f/c/i;)V */
/* .line 22 */
p0 = e.f.c.h.k;
/* .line 23 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 24 */
(( e.f.c.h ) v1 ).f ( ); // invoke-virtual {v1}, Le/f/c/h;->f()V
/* :catchall_0 */
/* move-exception p0 */
/* .line 25 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p0 */
} // .end method
public static e.f.c.t.a a ( Object p0, android.content.Context p1 ) { //synthethic
/* .locals 3 */
/* .line 28 */
/* new-instance v0, Le/f/c/t/a; */
/* .line 29 */
(( e.f.c.h ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/h;->e()Ljava/lang/String;
p0 = this.d;
/* const-class v2, Le/f/c/o/c; */
/* .line 30 */
(( e.f.c.k.a ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/f/c/k/a;->a(Ljava/lang/Class;)Ljava/lang/Object;
/* check-cast p0, Le/f/c/o/c; */
/* invoke-direct {v0, p1, v1, p0}, Le/f/c/t/a;-><init>(Landroid/content/Context;Ljava/lang/String;Le/f/c/o/c;)V */
} // .end method
public static java.lang.String a ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 35 */
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
} // .end method
public static void a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( e.f.c.h ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/c/h;->f()V
return;
} // .end method
public static void a ( Object p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .line 2 */
(( e.f.c.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/h;->a(Z)V
return;
} // .end method
public static java.util.concurrent.atomic.AtomicBoolean b ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.e;
} // .end method
public static java.lang.Object i ( ) { //synthethic
/* .locals 1 */
/* .line 1 */
v0 = e.f.c.h.i;
} // .end method
public static e.f.c.h j ( ) {
/* .locals 4 */
/* .line 1 */
v0 = e.f.c.h.i;
/* monitor-enter v0 */
/* .line 2 */
try { // :try_start_0
v1 = e.f.c.h.k;
final String v2 = "[DEFAULT]"; // const-string v2, "[DEFAULT]"
/* check-cast v1, Le/f/c/h; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* monitor-exit v0 */
/* .line 4 */
} // :cond_0
/* new-instance v1, Ljava/lang/IllegalStateException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Default FirebaseApp is not initialized in this process "; // const-string v3, "Default FirebaseApp is not initialized in this process "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
e.f.a.b.c.p.i .a ( );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ".Make sure to call FirebaseApp.initializeApp(Context) first."; // const-string v3, ".Make sure to call FirebaseApp.initializeApp(Context) first."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :catchall_0 */
/* move-exception v1 */
/* .line 6 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
/* # virtual methods */
public java.lang.Object a ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* .line 26 */
(( e.f.c.h ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/h;->a()V
/* .line 27 */
v0 = this.d;
(( e.f.c.k.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/k/a;->a(Ljava/lang/Class;)Ljava/lang/Object;
} // .end method
public final void a ( ) {
/* .locals 2 */
/* .line 31 */
v0 = this.f;
v0 = (( java.util.concurrent.atomic.AtomicBoolean ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
/* xor-int/lit8 v0, v0, 0x1 */
final String v1 = "FirebaseApp was deleted"; // const-string v1, "FirebaseApp was deleted"
e.f.a.b.c.m.h .b ( v0,v1 );
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 2 */
final String v0 = "FirebaseApp"; // const-string v0, "FirebaseApp"
final String v1 = "Notifying background state change listeners."; // const-string v1, "Notifying background state change listeners."
/* .line 32 */
android.util.Log .d ( v0,v1 );
/* .line 33 */
v0 = this.h;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Le/f/c/d; */
/* .line 34 */
} // :cond_0
return;
} // .end method
public android.content.Context b ( ) {
/* .locals 1 */
/* .line 2 */
(( e.f.c.h ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/h;->a()V
/* .line 3 */
v0 = this.a;
} // .end method
public java.lang.String c ( ) {
/* .locals 1 */
/* .line 1 */
(( e.f.c.h ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/h;->a()V
/* .line 2 */
v0 = this.b;
} // .end method
public e.f.c.i d ( ) {
/* .locals 1 */
/* .line 1 */
(( e.f.c.h ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/h;->a()V
/* .line 2 */
v0 = this.c;
} // .end method
public java.lang.String e ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( e.f.c.h ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/h;->c()Ljava/lang/String;
java.nio.charset.Charset .defaultCharset ( );
(( java.lang.String ) v1 ).getBytes ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
e.f.a.b.c.p.c .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "+"; // const-string v1, "+"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 2 */
(( e.f.c.h ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;
(( e.f.c.i ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/i;->b()Ljava/lang/String;
java.nio.charset.Charset .defaultCharset ( );
(( java.lang.String ) v1 ).getBytes ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
/* .line 3 */
e.f.a.b.c.p.c .a ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Le/f/c/h; */
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
v0 = this.b;
/* check-cast p1, Le/f/c/h; */
(( e.f.c.h ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/h;->c()Ljava/lang/String;
p1 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public final void f ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
v0 = c.h.j.e .a ( v0 );
/* xor-int/lit8 v0, v0, 0x1 */
final String v1 = "FirebaseApp"; // const-string v1, "FirebaseApp"
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "; // const-string v2, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 3 */
(( e.f.c.h ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/h;->c()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 4 */
android.util.Log .i ( v1,v0 );
/* .line 5 */
v0 = this.a;
e.f.c.g .a ( v0 );
/* .line 6 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Device unlocked: initializing all Firebase APIs for app "; // const-string v2, "Device unlocked: initializing all Firebase APIs for app "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.f.c.h ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/h;->c()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v0 );
/* .line 7 */
v0 = this.d;
v1 = (( e.f.c.h ) p0 ).h ( ); // invoke-virtual {p0}, Le/f/c/h;->h()Z
(( e.f.c.k.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/k/p;->a(Z)V
} // :goto_0
return;
} // .end method
public Boolean g ( ) {
/* .locals 1 */
/* .line 1 */
(( e.f.c.h ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/h;->a()V
/* .line 2 */
v0 = this.g;
(( e.f.c.k.x ) v0 ).get ( ); // invoke-virtual {v0}, Le/f/c/k/x;->get()Ljava/lang/Object;
/* check-cast v0, Le/f/c/t/a; */
v0 = (( e.f.c.t.a ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/t/a;->a()Z
} // .end method
public Boolean h ( ) {
/* .locals 2 */
/* .line 1 */
(( e.f.c.h ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/h;->c()Ljava/lang/String;
final String v1 = "[DEFAULT]"; // const-string v1, "[DEFAULT]"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
e.f.a.b.c.m.g .a ( p0 );
v1 = this.b;
final String v2 = "name"; // const-string v2, "name"
(( e.f.a.b.c.m.f ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;
v1 = this.c;
final String v2 = "options"; // const-string v2, "options"
(( e.f.a.b.c.m.f ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;
(( e.f.a.b.c.m.f ) v0 ).toString ( ); // invoke-virtual {v0}, Le/f/a/b/c/m/f;->toString()Ljava/lang/String;
} // .end method
