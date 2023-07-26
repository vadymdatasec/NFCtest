public class e.f.c.l.e.v.e implements e.f.c.l.e.v.f {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final e.f.c.l.e.v.j.g b;
	 public final e.f.c.l.e.v.g c;
	 public final e.f.c.l.e.m.h1 d;
	 public final e.f.c.l.e.v.a e;
	 public final e.f.c.l.e.v.k.d f;
	 public final e.f.c.l.e.m.i1 g;
	 public final java.util.concurrent.atomic.AtomicReference h;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/atomic/AtomicReference<", */
	 /* "Le/f/c/l/e/v/j/e;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.concurrent.atomic.AtomicReference i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/atomic/AtomicReference<", */
/* "Le/f/a/b/h/h<", */
/* "Le/f/c/l/e/v/j/b;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.l.e.v.e ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicReference; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V */
this.h = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicReference; */
/* new-instance v1, Le/f/a/b/h/h; */
/* invoke-direct {v1}, Le/f/a/b/h/h;-><init>()V */
/* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V */
this.i = v0;
/* .line 4 */
this.a = p1;
/* .line 5 */
this.b = p2;
/* .line 6 */
this.d = p3;
/* .line 7 */
this.c = p4;
/* .line 8 */
this.e = p5;
/* .line 9 */
this.f = p6;
/* .line 10 */
this.g = p7;
/* .line 11 */
p1 = this.h;
e.f.c.l.e.v.b .a ( p3 );
(( java.util.concurrent.atomic.AtomicReference ) p1 ).set ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
return;
} // .end method
public static e.f.c.l.e.v.e a ( android.content.Context p0, java.lang.String p1, e.f.c.l.e.m.q1 p2, Object p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, e.f.c.l.e.m.i1 p7 ) {
/* .locals 16 */
/* .line 4 */
/* invoke-virtual/range {p2 ..p2}, Le/f/c/l/e/m/q1;->c()Ljava/lang/String; */
/* .line 5 */
/* new-instance v10, Le/f/c/l/e/m/a2; */
/* invoke-direct {v10}, Le/f/c/l/e/m/a2;-><init>()V */
/* .line 6 */
/* new-instance v11, Le/f/c/l/e/v/g; */
/* invoke-direct {v11, v10}, Le/f/c/l/e/v/g;-><init>(Le/f/c/l/e/m/h1;)V */
/* .line 7 */
/* new-instance v12, Le/f/c/l/e/v/a; */
/* move-object/from16 v13, p0 */
/* invoke-direct {v12, v13}, Le/f/c/l/e/v/a;-><init>(Landroid/content/Context;)V */
/* .line 8 */
v1 = java.util.Locale.US;
int v2 = 1; // const/4 v2, 0x1
/* new-array v3, v2, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object p1, v3, v4 */
final String v5 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"; // const-string v5, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
java.lang.String .format ( v1,v5,v3 );
/* .line 9 */
/* new-instance v14, Le/f/c/l/e/v/k/c; */
/* move-object/from16 v3, p3 */
/* move-object/from16 v5, p6 */
/* invoke-direct {v14, v5, v1, v3}, Le/f/c/l/e/v/k/c;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;)V */
/* .line 10 */
/* invoke-virtual/range {p2 ..p2}, Le/f/c/l/e/m/q1;->d()Ljava/lang/String; */
/* .line 11 */
/* invoke-virtual/range {p2 ..p2}, Le/f/c/l/e/m/q1;->e()Ljava/lang/String; */
/* .line 12 */
/* invoke-virtual/range {p2 ..p2}, Le/f/c/l/e/m/q1;->f()Ljava/lang/String; */
int v1 = 4; // const/4 v1, 0x4
/* new-array v1, v1, [Ljava/lang/String; */
/* .line 13 */
/* invoke-static/range {p0 ..p0}, Le/f/c/l/e/m/j;->e(Landroid/content/Context;)Ljava/lang/String; */
/* aput-object v7, v1, v4 */
/* aput-object p1, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
/* aput-object p5, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
/* aput-object p4, v1, v2 */
/* .line 14 */
e.f.c.l.e.m.j .a ( v1 );
/* .line 15 */
e.f.c.l.e.m.k1 .a ( v0 );
v9 = (( e.f.c.l.e.m.k1 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/k1;->a()I
/* .line 16 */
/* new-instance v15, Le/f/c/l/e/v/j/g; */
/* move-object v0, v15 */
/* move-object/from16 v1, p1 */
/* move-object v2, v3 */
/* move-object v3, v5 */
/* move-object v4, v6 */
/* move-object/from16 v5, p2 */
/* move-object v6, v7 */
/* move-object/from16 v7, p5 */
/* move-object/from16 v8, p4 */
/* invoke-direct/range {v0 ..v9}, Le/f/c/l/e/v/j/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/m/r1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V */
/* .line 17 */
/* new-instance v0, Le/f/c/l/e/v/e; */
/* move-object v1, v0 */
/* move-object/from16 v2, p0 */
/* move-object v3, v15 */
/* move-object v4, v10 */
/* move-object v5, v11 */
/* move-object v6, v12 */
/* move-object v7, v14 */
/* move-object/from16 v8, p7 */
/* invoke-direct/range {v1 ..v8}, Le/f/c/l/e/v/e;-><init>(Landroid/content/Context;Le/f/c/l/e/v/j/g;Le/f/c/l/e/m/h1;Le/f/c/l/e/v/g;Le/f/c/l/e/v/a;Le/f/c/l/e/v/k/d;Le/f/c/l/e/m/i1;)V */
} // .end method
public static e.f.c.l.e.v.j.g a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.b;
} // .end method
public static void a ( Object p0, org.json.JSONObject p1, java.lang.String p2 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.f.c.l.e.v.e ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/c/l/e/v/e;->a(Lorg/json/JSONObject;Ljava/lang/String;)V
return;
} // .end method
public static Boolean a ( Object p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
/* .line 3 */
p0 = (( e.f.c.l.e.v.e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/v/e;->a(Ljava/lang/String;)Z
} // .end method
public static e.f.c.l.e.v.k.d b ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.f;
} // .end method
public static e.f.c.l.e.v.g c ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.c;
} // .end method
public static e.f.c.l.e.v.a d ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.e;
} // .end method
public static java.util.concurrent.atomic.AtomicReference e ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.h;
} // .end method
public static java.util.concurrent.atomic.AtomicReference f ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.i;
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/l/e/v/j/b;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 18 */
v0 = this.i;
(( java.util.concurrent.atomic.AtomicReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
/* check-cast v0, Le/f/a/b/h/h; */
(( e.f.a.b.h.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
} // .end method
public e.f.a.b.h.g a ( Object p0, java.util.concurrent.Executor p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/l/e/v/c;", */
/* "Ljava/util/concurrent/Executor;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 20 */
v0 = (( e.f.c.l.e.v.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/v/e;->c()Z
/* if-nez v0, :cond_0 */
/* .line 21 */
(( e.f.c.l.e.v.e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/c;)Le/f/c/l/e/v/j/f;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 22 */
p2 = this.h;
(( java.util.concurrent.atomic.AtomicReference ) p2 ).set ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
/* .line 23 */
p2 = this.i;
(( java.util.concurrent.atomic.AtomicReference ) p2 ).get ( ); // invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
/* check-cast p2, Le/f/a/b/h/h; */
(( e.f.c.l.e.v.j.f ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/l/e/v/j/f;->c()Le/f/c/l/e/v/j/b;
(( e.f.a.b.h.h ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
int p1 = 0; // const/4 p1, 0x0
/* .line 24 */
e.f.a.b.h.n .a ( p1 );
/* .line 25 */
} // :cond_0
p1 = e.f.c.l.e.v.c.d;
/* .line 26 */
(( e.f.c.l.e.v.e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/c;)Le/f/c/l/e/v/j/f;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 27 */
v0 = this.h;
(( java.util.concurrent.atomic.AtomicReference ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
/* .line 28 */
v0 = this.i;
(( java.util.concurrent.atomic.AtomicReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
/* check-cast v0, Le/f/a/b/h/h; */
(( e.f.c.l.e.v.j.f ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/c/l/e/v/j/f;->c()Le/f/c/l/e/v/j/b;
(( e.f.a.b.h.h ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
/* .line 29 */
} // :cond_1
p1 = this.g;
/* .line 30 */
(( e.f.c.l.e.m.i1 ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/c/l/e/m/i1;->d()Le/f/a/b/h/g;
/* new-instance v0, Le/f/c/l/e/v/d; */
/* invoke-direct {v0, p0}, Le/f/c/l/e/v/d;-><init>(Le/f/c/l/e/v/e;)V */
/* .line 31 */
(( e.f.a.b.h.g ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;
} // .end method
public e.f.a.b.h.g a ( java.util.concurrent.Executor p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/concurrent/Executor;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 19 */
v0 = e.f.c.l.e.v.c.b;
(( e.f.c.l.e.v.e ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/c/l/e/v/e;->a(Le/f/c/l/e/v/c;Ljava/util/concurrent/Executor;)Le/f/a/b/h/g;
} // .end method
public final e.f.c.l.e.v.j.f a ( Object p0 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* .line 32 */
try { // :try_start_0
v1 = e.f.c.l.e.v.c.c;
v1 = (( java.lang.Enum ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_4 */
/* .line 33 */
v1 = this.e;
(( e.f.c.l.e.v.a ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/l/e/v/a;->b()Lorg/json/JSONObject;
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 34 */
v2 = this.c;
(( e.f.c.l.e.v.g ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/f/c/l/e/v/g;->a(Lorg/json/JSONObject;)Le/f/c/l/e/v/j/f;
if ( v2 != null) { // if-eqz v2, :cond_2
final String v3 = "Loaded cached settings: "; // const-string v3, "Loaded cached settings: "
/* .line 35 */
(( e.f.c.l.e.v.e ) p0 ).a ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Le/f/c/l/e/v/e;->a(Lorg/json/JSONObject;Ljava/lang/String;)V
/* .line 36 */
v1 = this.d;
/* move-result-wide v3 */
/* .line 37 */
v1 = e.f.c.l.e.v.c.d;
p1 = (( java.lang.Enum ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_1 */
/* .line 38 */
p1 = (( e.f.c.l.e.v.j.f ) v2 ).a ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Le/f/c/l/e/v/j/f;->a(J)Z
/* if-nez p1, :cond_0 */
/* .line 39 */
} // :cond_0
e.f.c.l.e.b .a ( );
final String v1 = "Cached settings have expired."; // const-string v1, "Cached settings have expired."
(( e.f.c.l.e.b ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 40 */
} // :cond_1
} // :goto_0
try { // :try_start_1
e.f.c.l.e.b .a ( );
final String v0 = "Returning cached settings."; // const-string v0, "Returning cached settings."
(( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* move-object v0, v2 */
/* :catch_0 */
/* move-exception p1 */
/* move-object v0, v2 */
/* .line 41 */
} // :cond_2
try { // :try_start_2
e.f.c.l.e.b .a ( );
final String v1 = "Failed to parse cached settings data."; // const-string v1, "Failed to parse cached settings data."
(( e.f.c.l.e.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
/* .line 42 */
} // :cond_3
e.f.c.l.e.b .a ( );
final String v1 = "No cached settings data found."; // const-string v1, "No cached settings data found."
(( e.f.c.l.e.b ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* :catch_1 */
/* move-exception p1 */
/* .line 43 */
} // :goto_1
e.f.c.l.e.b .a ( );
final String v2 = "Failed to get cached settings"; // const-string v2, "Failed to get cached settings"
(( e.f.c.l.e.b ) v1 ).b ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :cond_4
} // :goto_2
} // .end method
public final void a ( org.json.JSONObject p0, java.lang.String p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .line 44 */
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.json.JSONObject ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
return;
} // .end method
public final Boolean a ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "CommitPrefEdits" */
/* } */
} // .end annotation
/* .line 45 */
v0 = this.a;
e.f.c.l.e.m.j .h ( v0 );
/* .line 46 */
final String v1 = "existing_instance_identifier"; // const-string v1, "existing_instance_identifier"
/* .line 47 */
/* .line 48 */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public e.f.c.l.e.v.j.e b ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.h;
(( java.util.concurrent.atomic.AtomicReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;
/* check-cast v0, Le/f/c/l/e/v/j/e; */
} // .end method
public Boolean c ( ) {
/* .locals 2 */
/* .line 2 */
(( e.f.c.l.e.v.e ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/l/e/v/e;->d()Ljava/lang/String;
/* .line 3 */
v1 = this.b;
v1 = this.f;
/* .line 4 */
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
public final java.lang.String d ( ) {
/* .locals 3 */
/* .line 2 */
v0 = this.a;
e.f.c.l.e.m.j .h ( v0 );
final String v1 = "existing_instance_identifier"; // const-string v1, "existing_instance_identifier"
final String v2 = ""; // const-string v2, ""
/* .line 3 */
} // .end method
