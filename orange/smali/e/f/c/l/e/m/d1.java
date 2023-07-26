public class e.f.c.l.e.m.d1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String e;
	 public static final java.util.Map f;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public final android.content.Context a;
public final e.f.c.l.e.m.q1 b;
public final e.f.c.l.e.m.b c;
public final e.f.c.l.e.w.d d;
/* # direct methods */
public static e.f.c.l.e.m.d1 ( ) {
/* .locals 5 */
/* .line 1 */
v0 = java.util.Locale.US;
int v1 = 1; // const/4 v1, 0x1
/* new-array v2, v1, [Ljava/lang/Object; */
final String v3 = "17.2.2"; // const-string v3, "17.2.2"
int v4 = 0; // const/4 v4, 0x0
/* aput-object v3, v2, v4 */
final String v3 = "Crashlytics Android SDK/%s"; // const-string v3, "Crashlytics Android SDK/%s"
/* .line 2 */
java.lang.String .format ( v0,v3,v2 );
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
int v2 = 5; // const/4 v2, 0x5
/* .line 4 */
java.lang.Integer .valueOf ( v2 );
final String v3 = "armeabi"; // const-string v3, "armeabi"
/* .line 5 */
v0 = e.f.c.l.e.m.d1.f;
int v2 = 6; // const/4 v2, 0x6
java.lang.Integer .valueOf ( v2 );
final String v3 = "armeabi-v7a"; // const-string v3, "armeabi-v7a"
/* .line 6 */
v0 = e.f.c.l.e.m.d1.f;
/* const/16 v2, 0x9 */
java.lang.Integer .valueOf ( v2 );
final String v3 = "arm64-v8a"; // const-string v3, "arm64-v8a"
/* .line 7 */
v0 = e.f.c.l.e.m.d1.f;
java.lang.Integer .valueOf ( v4 );
final String v3 = "x86"; // const-string v3, "x86"
/* .line 8 */
v0 = e.f.c.l.e.m.d1.f;
java.lang.Integer .valueOf ( v1 );
final String v2 = "x86_64"; // const-string v2, "x86_64"
return;
} // .end method
public e.f.c.l.e.m.d1 ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
/* .line 4 */
this.c = p3;
/* .line 5 */
this.d = p4;
return;
} // .end method
public static Integer h ( ) {
/* .locals 4 */
/* .line 1 */
v0 = android.os.Build.CPU_ABI;
/* .line 2 */
v1 = android.text.TextUtils .isEmpty ( v0 );
int v2 = 7; // const/4 v2, 0x7
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 3 */
} // :cond_0
v1 = e.f.c.l.e.m.d1.f;
v3 = java.util.Locale.US;
(( java.lang.String ) v0 ).toLowerCase ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
/* check-cast v0, Ljava/lang/Integer; */
/* if-nez v0, :cond_1 */
/* .line 4 */
} // :cond_1
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
} // .end method
/* # virtual methods */
public final e.f.c.l.e.o.a3 a ( Object p0, java.lang.Thread p1, Integer p2, Integer p3, Boolean p4 ) {
/* .locals 1 */
/* .line 43 */
e.f.c.l.e.o.a3 .e ( );
/* .line 44 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( p1, p2, p3, p5 ); // invoke-virtual {p0, p1, p2, p3, p5}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;Ljava/lang/Thread;IZ)Le/f/c/l/e/o/p3;
/* .line 45 */
(( e.f.c.l.e.o.r2 ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Le/f/c/l/e/o/r2;->b(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/r2;
/* .line 46 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( p1, p3, p4 ); // invoke-virtual {p0, p1, p3, p4}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;II)Le/f/c/l/e/o/t2;
/* .line 47 */
(( e.f.c.l.e.o.r2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/r2;->a(Le/f/c/l/e/o/t2;)Le/f/c/l/e/o/r2;
/* .line 48 */
(( e.f.c.l.e.m.d1 ) p0 ).g ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/d1;->g()Le/f/c/l/e/o/v2;
(( e.f.c.l.e.o.r2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/r2;->a(Le/f/c/l/e/o/v2;)Le/f/c/l/e/o/r2;
/* .line 49 */
(( e.f.c.l.e.m.d1 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/d1;->c()Le/f/c/l/e/o/p3;
(( e.f.c.l.e.o.r2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/r2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/r2;
/* .line 50 */
(( e.f.c.l.e.o.r2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/r2;->a()Le/f/c/l/e/o/a3;
} // .end method
public final e.f.c.l.e.o.b2 a ( ) {
/* .locals 2 */
/* .line 11 */
e.f.c.l.e.o.o3 .l ( );
final String v1 = "17.2.2"; // const-string v1, "17.2.2"
/* .line 12 */
(( e.f.c.l.e.o.b2 ) v0 ).e ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->e(Ljava/lang/String;)Le/f/c/l/e/o/b2;
v1 = this.c;
v1 = this.a;
/* .line 13 */
(( e.f.c.l.e.o.b2 ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->c(Ljava/lang/String;)Le/f/c/l/e/o/b2;
v1 = this.b;
/* .line 14 */
(( e.f.c.l.e.m.q1 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/m/q1;->a()Ljava/lang/String;
(( e.f.c.l.e.o.b2 ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->d(Ljava/lang/String;)Le/f/c/l/e/o/b2;
v1 = this.c;
v1 = this.e;
/* .line 15 */
(( e.f.c.l.e.o.b2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->a(Ljava/lang/String;)Le/f/c/l/e/o/b2;
v1 = this.c;
v1 = this.f;
/* .line 16 */
(( e.f.c.l.e.o.b2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->b(Ljava/lang/String;)Le/f/c/l/e/o/b2;
int v1 = 4; // const/4 v1, 0x4
/* .line 17 */
(( e.f.c.l.e.o.b2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->a(I)Le/f/c/l/e/o/b2;
} // .end method
public final e.f.c.l.e.o.b3 a ( Integer p0, Object p1, java.lang.Thread p2, Integer p3, Integer p4, Boolean p5 ) {
/* .locals 8 */
/* .line 18 */
v0 = this.c;
v0 = this.d;
v1 = this.a;
/* .line 19 */
e.f.c.l.e.m.j .a ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 20 */
/* iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I */
/* const/16 v1, 0x64 */
/* if-eq v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 21 */
} // :goto_0
java.lang.Boolean .valueOf ( v0 );
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 22 */
} // :goto_1
e.f.c.l.e.o.b3 .f ( );
/* .line 23 */
(( e.f.c.l.e.o.o2 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/l/e/o/o2;->a(Ljava/lang/Boolean;)Le/f/c/l/e/o/o2;
/* .line 24 */
(( e.f.c.l.e.o.o2 ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/f/c/l/e/o/o2;->a(I)Le/f/c/l/e/o/o2;
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* move v7, p6 */
/* .line 25 */
/* invoke-virtual/range {v2 ..v7}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;Ljava/lang/Thread;IIZ)Le/f/c/l/e/o/a3; */
/* .line 26 */
(( e.f.c.l.e.o.o2 ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/f/c/l/e/o/o2;->a(Le/f/c/l/e/o/a3;)Le/f/c/l/e/o/o2;
/* .line 27 */
(( e.f.c.l.e.o.o2 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/o/o2;->a()Le/f/c/l/e/o/b3;
} // .end method
public final e.f.c.l.e.o.e3 a ( Integer p0 ) {
/* .locals 8 */
/* .line 28 */
v0 = this.a;
e.f.c.l.e.m.e .a ( v0 );
/* .line 29 */
(( e.f.c.l.e.m.e ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/e;->a()Ljava/lang/Float;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 30 */
(( java.lang.Float ) v1 ).doubleValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->doubleValue()D
/* move-result-wide v1 */
java.lang.Double .valueOf ( v1,v2 );
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 31 */
} // :goto_0
v0 = (( e.f.c.l.e.m.e ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/e;->b()I
/* .line 32 */
v2 = this.a;
v2 = e.f.c.l.e.m.j .f ( v2 );
/* .line 33 */
e.f.c.l.e.m.j .b ( );
/* move-result-wide v3 */
v5 = this.a;
e.f.c.l.e.m.j .a ( v5 );
/* move-result-wide v5 */
/* sub-long/2addr v3, v5 */
/* .line 34 */
android.os.Environment .getDataDirectory ( );
(( java.io.File ) v5 ).getPath ( ); // invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;
e.f.c.l.e.m.j .a ( v5 );
/* move-result-wide v5 */
/* .line 35 */
e.f.c.l.e.o.e3 .g ( );
/* .line 36 */
(( e.f.c.l.e.o.d3 ) v7 ).a ( v1 ); // invoke-virtual {v7, v1}, Le/f/c/l/e/o/d3;->a(Ljava/lang/Double;)Le/f/c/l/e/o/d3;
/* .line 37 */
(( e.f.c.l.e.o.d3 ) v7 ).a ( v0 ); // invoke-virtual {v7, v0}, Le/f/c/l/e/o/d3;->a(I)Le/f/c/l/e/o/d3;
/* .line 38 */
(( e.f.c.l.e.o.d3 ) v7 ).a ( v2 ); // invoke-virtual {v7, v2}, Le/f/c/l/e/o/d3;->a(Z)Le/f/c/l/e/o/d3;
/* .line 39 */
(( e.f.c.l.e.o.d3 ) v7 ).b ( p1 ); // invoke-virtual {v7, p1}, Le/f/c/l/e/o/d3;->b(I)Le/f/c/l/e/o/d3;
/* .line 40 */
(( e.f.c.l.e.o.d3 ) v7 ).b ( v3, v4 ); // invoke-virtual {v7, v3, v4}, Le/f/c/l/e/o/d3;->b(J)Le/f/c/l/e/o/d3;
/* .line 41 */
(( e.f.c.l.e.o.d3 ) v7 ).a ( v5, v6 ); // invoke-virtual {v7, v5, v6}, Le/f/c/l/e/o/d3;->a(J)Le/f/c/l/e/o/d3;
/* .line 42 */
(( e.f.c.l.e.o.d3 ) v7 ).a ( ); // invoke-virtual {v7}, Le/f/c/l/e/o/d3;->a()Le/f/c/l/e/o/e3;
} // .end method
public e.f.c.l.e.o.h3 a ( java.lang.Throwable p0, java.lang.Thread p1, java.lang.String p2, Long p3, Integer p4, Integer p5, Boolean p6 ) {
/* .locals 10 */
/* move-object v7, p0 */
/* .line 2 */
v0 = this.a;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v8, v0, Landroid/content/res/Configuration;->orientation:I */
/* .line 3 */
/* new-instance v2, Le/f/c/l/e/w/e; */
v0 = this.d;
/* move-object v1, p1 */
/* invoke-direct {v2, p1, v0}, Le/f/c/l/e/w/e;-><init>(Ljava/lang/Throwable;Le/f/c/l/e/w/d;)V */
/* .line 4 */
e.f.c.l.e.o.h3 .g ( );
/* move-object v0, p3 */
/* .line 5 */
(( e.f.c.l.e.o.c3 ) v9 ).a ( p3 ); // invoke-virtual {v9, p3}, Le/f/c/l/e/o/c3;->a(Ljava/lang/String;)Le/f/c/l/e/o/c3;
/* move-wide v0, p4 */
/* .line 6 */
(( e.f.c.l.e.o.c3 ) v9 ).a ( p4, p5 ); // invoke-virtual {v9, p4, p5}, Le/f/c/l/e/o/c3;->a(J)Le/f/c/l/e/o/c3;
/* move-object v0, p0 */
/* move v1, v8 */
/* move-object v3, p2 */
/* move/from16 v4, p6 */
/* move/from16 v5, p7 */
/* move/from16 v6, p8 */
/* .line 7 */
/* invoke-virtual/range {v0 ..v6}, Le/f/c/l/e/m/d1;->a(ILe/f/c/l/e/w/e;Ljava/lang/Thread;IIZ)Le/f/c/l/e/o/b3; */
/* .line 8 */
(( e.f.c.l.e.o.c3 ) v9 ).a ( v0 ); // invoke-virtual {v9, v0}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/b3;)Le/f/c/l/e/o/c3;
/* .line 9 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( v8 ); // invoke-virtual {p0, v8}, Le/f/c/l/e/m/d1;->a(I)Le/f/c/l/e/o/e3;
(( e.f.c.l.e.o.c3 ) v9 ).a ( v0 ); // invoke-virtual {v9, v0}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/e3;)Le/f/c/l/e/o/c3;
/* .line 10 */
(( e.f.c.l.e.o.c3 ) v9 ).a ( ); // invoke-virtual {v9}, Le/f/c/l/e/o/c3;->a()Le/f/c/l/e/o/h3;
} // .end method
public e.f.c.l.e.o.o3 a ( java.lang.String p0, Long p1 ) {
/* .locals 1 */
/* .line 1 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/d1;->a()Le/f/c/l/e/o/b2;
(( e.f.c.l.e.m.d1 ) p0 ).b ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/f/c/l/e/m/d1;->b(Ljava/lang/String;J)Le/f/c/l/e/o/m3;
(( e.f.c.l.e.o.b2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/b2;->a(Le/f/c/l/e/o/m3;)Le/f/c/l/e/o/b2;
(( e.f.c.l.e.o.b2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/b2;->a()Le/f/c/l/e/o/o3;
} // .end method
public final e.f.c.l.e.o.p3 a ( Object p0, java.lang.Thread p1, Integer p2, Boolean p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/l/e/w/e;", */
/* "Ljava/lang/Thread;", */
/* "IZ)", */
/* "Le/f/c/l/e/o/p3<", */
/* "Le/f/c/l/e/o/z2;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 51 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 52 */
p1 = this.c;
/* .line 53 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( p2, p1, p3 ); // invoke-virtual {p0, p2, p1, p3}, Le/f/c/l/e/m/d1;->a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/z2;
/* .line 54 */
if ( p4 != null) { // if-eqz p4, :cond_1
/* .line 55 */
java.lang.Thread .getAllStackTraces ( );
/* .line 56 */
} // :cond_0
p3 = } // :goto_0
if ( p3 != null) { // if-eqz p3, :cond_1
/* check-cast p3, Ljava/util/Map$Entry; */
/* .line 57 */
/* check-cast p4, Ljava/lang/Thread; */
/* .line 58 */
v1 = (( java.lang.Object ) p4 ).equals ( p2 ); // invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 59 */
v1 = this.d;
/* .line 60 */
/* check-cast p3, [Ljava/lang/StackTraceElement; */
/* .line 61 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( p4, p3 ); // invoke-virtual {p0, p4, p3}, Le/f/c/l/e/m/d1;->a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Le/f/c/l/e/o/z2;
/* .line 62 */
/* .line 63 */
} // :cond_1
e.f.c.l.e.o.p3 .a ( v0 );
} // .end method
public final e.f.c.l.e.o.p3 a ( java.lang.StackTraceElement[] p0, Integer p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([", */
/* "Ljava/lang/StackTraceElement;", */
/* "I)", */
/* "Le/f/c/l/e/o/p3<", */
/* "Le/f/c/l/e/o/y2;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 70 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 71 */
/* array-length v1, p1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, p1, v2 */
/* .line 72 */
e.f.c.l.e.o.y2 .f ( );
(( e.f.c.l.e.o.x2 ) v4 ).a ( p2 ); // invoke-virtual {v4, p2}, Le/f/c/l/e/o/x2;->a(I)Le/f/c/l/e/o/x2;
(( e.f.c.l.e.m.d1 ) p0 ).a ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Le/f/c/l/e/m/d1;->a(Ljava/lang/StackTraceElement;Le/f/c/l/e/o/x2;)Le/f/c/l/e/o/y2;
/* .line 73 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 74 */
} // :cond_0
e.f.c.l.e.o.p3 .a ( v0 );
} // .end method
public final e.f.c.l.e.o.t2 a ( Object p0, Integer p1, Integer p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 75 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;III)Le/f/c/l/e/o/t2;
} // .end method
public final e.f.c.l.e.o.t2 a ( Object p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 5 */
/* .line 76 */
v0 = this.b;
/* .line 77 */
v1 = this.a;
/* .line 78 */
v2 = this.c;
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_0
/* new-array v2, v3, [Ljava/lang/StackTraceElement; */
/* .line 79 */
} // :goto_0
p1 = this.d;
/* if-lt p4, p3, :cond_1 */
/* move-object v4, p1 */
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 80 */
v4 = this.d;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 81 */
} // :cond_1
e.f.c.l.e.o.t2 .f ( );
/* .line 82 */
(( e.f.c.l.e.o.s2 ) v4 ).b ( v0 ); // invoke-virtual {v4, v0}, Le/f/c/l/e/o/s2;->b(Ljava/lang/String;)Le/f/c/l/e/o/s2;
/* .line 83 */
(( e.f.c.l.e.o.s2 ) v4 ).a ( v1 ); // invoke-virtual {v4, v1}, Le/f/c/l/e/o/s2;->a(Ljava/lang/String;)Le/f/c/l/e/o/s2;
/* .line 84 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( v2, p2 ); // invoke-virtual {p0, v2, p2}, Le/f/c/l/e/m/d1;->a([Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/p3;
e.f.c.l.e.o.p3 .a ( v0 );
(( e.f.c.l.e.o.s2 ) v4 ).a ( v0 ); // invoke-virtual {v4, v0}, Le/f/c/l/e/o/s2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/s2;
/* .line 85 */
(( e.f.c.l.e.o.s2 ) v4 ).a ( v3 ); // invoke-virtual {v4, v3}, Le/f/c/l/e/o/s2;->a(I)Le/f/c/l/e/o/s2;
if ( p1 != null) { // if-eqz p1, :cond_2
/* if-nez v3, :cond_2 */
/* add-int/lit8 p4, p4, 0x1 */
/* .line 86 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/f/c/l/e/m/d1;->a(Le/f/c/l/e/w/e;III)Le/f/c/l/e/o/t2;
/* .line 87 */
(( e.f.c.l.e.o.s2 ) v4 ).a ( p1 ); // invoke-virtual {v4, p1}, Le/f/c/l/e/o/s2;->a(Le/f/c/l/e/o/t2;)Le/f/c/l/e/o/s2;
/* .line 88 */
} // :cond_2
(( e.f.c.l.e.o.s2 ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/c/l/e/o/s2;->a()Le/f/c/l/e/o/t2;
} // .end method
public final e.f.c.l.e.o.y2 a ( java.lang.StackTraceElement p0, e.f.c.l.e.o.x2 p1 ) {
/* .locals 7 */
/* .line 89 */
v0 = (( java.lang.StackTraceElement ) p1 ).isNativeMethod ( ); // invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z
/* const-wide/16 v1, 0x0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 90 */
v0 = (( java.lang.StackTraceElement ) p1 ).getLineNumber ( ); // invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I
/* int-to-long v3, v0 */
java.lang.Math .max ( v3,v4,v1,v2 );
/* move-result-wide v3 */
} // :cond_0
/* move-wide v3, v1 */
/* .line 91 */
} // :goto_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StackTraceElement ) p1 ).getClassName ( ); // invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "."; // const-string v5, "."
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StackTraceElement ) p1 ).getMethodName ( ); // invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 92 */
(( java.lang.StackTraceElement ) p1 ).getFileName ( ); // invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;
/* .line 93 */
v6 = (( java.lang.StackTraceElement ) p1 ).isNativeMethod ( ); // invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z
/* if-nez v6, :cond_1 */
v6 = (( java.lang.StackTraceElement ) p1 ).getLineNumber ( ); // invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I
/* if-lez v6, :cond_1 */
/* .line 94 */
p1 = (( java.lang.StackTraceElement ) p1 ).getLineNumber ( ); // invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I
/* int-to-long v1, p1 */
/* .line 95 */
} // :cond_1
(( e.f.c.l.e.o.x2 ) p2 ).b ( v3, v4 ); // invoke-virtual {p2, v3, v4}, Le/f/c/l/e/o/x2;->b(J)Le/f/c/l/e/o/x2;
(( e.f.c.l.e.o.x2 ) p2 ).b ( v0 ); // invoke-virtual {p2, v0}, Le/f/c/l/e/o/x2;->b(Ljava/lang/String;)Le/f/c/l/e/o/x2;
(( e.f.c.l.e.o.x2 ) p2 ).a ( v5 ); // invoke-virtual {p2, v5}, Le/f/c/l/e/o/x2;->a(Ljava/lang/String;)Le/f/c/l/e/o/x2;
(( e.f.c.l.e.o.x2 ) p2 ).a ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Le/f/c/l/e/o/x2;->a(J)Le/f/c/l/e/o/x2;
(( e.f.c.l.e.o.x2 ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/c/l/e/o/x2;->a()Le/f/c/l/e/o/y2;
} // .end method
public final e.f.c.l.e.o.z2 a ( java.lang.Thread p0, java.lang.StackTraceElement[] p1 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 64 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/f/c/l/e/m/d1;->a(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/z2;
} // .end method
public final e.f.c.l.e.o.z2 a ( java.lang.Thread p0, java.lang.StackTraceElement[] p1, Integer p2 ) {
/* .locals 1 */
/* .line 65 */
e.f.c.l.e.o.z2 .d ( );
/* .line 66 */
(( java.lang.Thread ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;
(( e.f.c.l.e.o.w2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/w2;->a(Ljava/lang/String;)Le/f/c/l/e/o/w2;
/* .line 67 */
(( e.f.c.l.e.o.w2 ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Le/f/c/l/e/o/w2;->a(I)Le/f/c/l/e/o/w2;
/* .line 68 */
(( e.f.c.l.e.m.d1 ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Le/f/c/l/e/m/d1;->a([Ljava/lang/StackTraceElement;I)Le/f/c/l/e/o/p3;
e.f.c.l.e.o.p3 .a ( p1 );
(( e.f.c.l.e.o.w2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/w2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/w2;
/* .line 69 */
(( e.f.c.l.e.o.w2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/w2;->a()Le/f/c/l/e/o/z2;
} // .end method
public final e.f.c.l.e.o.m3 b ( java.lang.String p0, Long p1 ) {
/* .locals 1 */
/* .line 1 */
e.f.c.l.e.o.m3 .n ( );
/* .line 2 */
(( e.f.c.l.e.o.l2 ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Le/f/c/l/e/o/l2;->a(J)Le/f/c/l/e/o/l2;
/* .line 3 */
(( e.f.c.l.e.o.l2 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->b(Ljava/lang/String;)Le/f/c/l/e/o/l2;
p1 = e.f.c.l.e.m.d1.e;
/* .line 4 */
(( e.f.c.l.e.o.l2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Ljava/lang/String;)Le/f/c/l/e/o/l2;
/* .line 5 */
(( e.f.c.l.e.m.d1 ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/d1;->d()Le/f/c/l/e/o/k2;
(( e.f.c.l.e.o.l2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/k2;)Le/f/c/l/e/o/l2;
/* .line 6 */
(( e.f.c.l.e.m.d1 ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/d1;->f()Le/f/c/l/e/o/j3;
(( e.f.c.l.e.o.l2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/j3;)Le/f/c/l/e/o/l2;
/* .line 7 */
(( e.f.c.l.e.m.d1 ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/d1;->e()Le/f/c/l/e/o/n2;
(( e.f.c.l.e.o.l2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/n2;)Le/f/c/l/e/o/l2;
int p1 = 3; // const/4 p1, 0x3
/* .line 8 */
(( e.f.c.l.e.o.l2 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/o/l2;->a(I)Le/f/c/l/e/o/l2;
/* .line 9 */
(( e.f.c.l.e.o.l2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/l2;->a()Le/f/c/l/e/o/m3;
} // .end method
public final e.f.c.l.e.o.q2 b ( ) {
/* .locals 3 */
/* .line 10 */
e.f.c.l.e.o.q2 .f ( );
/* const-wide/16 v1, 0x0 */
/* .line 11 */
(( e.f.c.l.e.o.p2 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/p2;->a(J)Le/f/c/l/e/o/p2;
/* .line 12 */
(( e.f.c.l.e.o.p2 ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/p2;->b(J)Le/f/c/l/e/o/p2;
v1 = this.c;
v1 = this.d;
/* .line 13 */
(( e.f.c.l.e.o.p2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/p2;->a(Ljava/lang/String;)Le/f/c/l/e/o/p2;
v1 = this.c;
v1 = this.b;
/* .line 14 */
(( e.f.c.l.e.o.p2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/p2;->b(Ljava/lang/String;)Le/f/c/l/e/o/p2;
/* .line 15 */
(( e.f.c.l.e.o.p2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/p2;->a()Le/f/c/l/e/o/q2;
} // .end method
public final e.f.c.l.e.o.p3 c ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/c/l/e/o/p3<", */
/* "Le/f/c/l/e/o/q2;", */
/* ">;" */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Le/f/c/l/e/o/q2; */
/* .line 1 */
(( e.f.c.l.e.m.d1 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/d1;->b()Le/f/c/l/e/o/q2;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
e.f.c.l.e.o.p3 .a ( v0 );
} // .end method
public final e.f.c.l.e.o.k2 d ( ) {
/* .locals 2 */
/* .line 1 */
e.f.c.l.e.o.k2 .f ( );
v1 = this.b;
/* .line 2 */
(( e.f.c.l.e.m.q1 ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/c/l/e/m/q1;->b()Ljava/lang/String;
(( e.f.c.l.e.o.i2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->b(Ljava/lang/String;)Le/f/c/l/e/o/i2;
v1 = this.c;
v1 = this.e;
/* .line 3 */
(( e.f.c.l.e.o.i2 ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->d(Ljava/lang/String;)Le/f/c/l/e/o/i2;
v1 = this.c;
v1 = this.f;
/* .line 4 */
(( e.f.c.l.e.o.i2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->a(Ljava/lang/String;)Le/f/c/l/e/o/i2;
v1 = this.b;
/* .line 5 */
(( e.f.c.l.e.m.q1 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/m/q1;->a()Ljava/lang/String;
(( e.f.c.l.e.o.i2 ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->c(Ljava/lang/String;)Le/f/c/l/e/o/i2;
/* .line 6 */
(( e.f.c.l.e.o.i2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/i2;->a()Le/f/c/l/e/o/k2;
} // .end method
public final e.f.c.l.e.o.n2 e ( ) {
/* .locals 11 */
/* .line 1 */
/* new-instance v0, Landroid/os/StatFs; */
android.os.Environment .getDataDirectory ( );
(( java.io.File ) v1 ).getPath ( ); // invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
/* invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V */
/* .line 2 */
v1 = e.f.c.l.e.m.d1 .h ( );
/* .line 3 */
java.lang.Runtime .getRuntime ( );
v2 = (( java.lang.Runtime ) v2 ).availableProcessors ( ); // invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I
/* .line 4 */
e.f.c.l.e.m.j .b ( );
/* move-result-wide v3 */
/* .line 5 */
v5 = (( android.os.StatFs ) v0 ).getBlockCount ( ); // invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I
/* int-to-long v5, v5 */
v0 = (( android.os.StatFs ) v0 ).getBlockSize ( ); // invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I
/* int-to-long v7, v0 */
/* mul-long v5, v5, v7 */
/* .line 6 */
v0 = this.a;
v0 = e.f.c.l.e.m.j .i ( v0 );
/* .line 7 */
v7 = this.a;
v7 = e.f.c.l.e.m.j .c ( v7 );
/* .line 8 */
v8 = android.os.Build.MANUFACTURER;
/* .line 9 */
v9 = android.os.Build.PRODUCT;
/* .line 10 */
e.f.c.l.e.o.n2 .j ( );
/* .line 11 */
(( e.f.c.l.e.o.m2 ) v10 ).a ( v1 ); // invoke-virtual {v10, v1}, Le/f/c/l/e/o/m2;->a(I)Le/f/c/l/e/o/m2;
v1 = android.os.Build.MODEL;
/* .line 12 */
(( e.f.c.l.e.o.m2 ) v10 ).b ( v1 ); // invoke-virtual {v10, v1}, Le/f/c/l/e/o/m2;->b(Ljava/lang/String;)Le/f/c/l/e/o/m2;
/* .line 13 */
(( e.f.c.l.e.o.m2 ) v10 ).b ( v2 ); // invoke-virtual {v10, v2}, Le/f/c/l/e/o/m2;->b(I)Le/f/c/l/e/o/m2;
/* .line 14 */
(( e.f.c.l.e.o.m2 ) v10 ).b ( v3, v4 ); // invoke-virtual {v10, v3, v4}, Le/f/c/l/e/o/m2;->b(J)Le/f/c/l/e/o/m2;
/* .line 15 */
(( e.f.c.l.e.o.m2 ) v10 ).a ( v5, v6 ); // invoke-virtual {v10, v5, v6}, Le/f/c/l/e/o/m2;->a(J)Le/f/c/l/e/o/m2;
/* .line 16 */
(( e.f.c.l.e.o.m2 ) v10 ).a ( v0 ); // invoke-virtual {v10, v0}, Le/f/c/l/e/o/m2;->a(Z)Le/f/c/l/e/o/m2;
/* .line 17 */
(( e.f.c.l.e.o.m2 ) v10 ).c ( v7 ); // invoke-virtual {v10, v7}, Le/f/c/l/e/o/m2;->c(I)Le/f/c/l/e/o/m2;
/* .line 18 */
(( e.f.c.l.e.o.m2 ) v10 ).a ( v8 ); // invoke-virtual {v10, v8}, Le/f/c/l/e/o/m2;->a(Ljava/lang/String;)Le/f/c/l/e/o/m2;
/* .line 19 */
(( e.f.c.l.e.o.m2 ) v10 ).c ( v9 ); // invoke-virtual {v10, v9}, Le/f/c/l/e/o/m2;->c(Ljava/lang/String;)Le/f/c/l/e/o/m2;
/* .line 20 */
(( e.f.c.l.e.o.m2 ) v10 ).a ( ); // invoke-virtual {v10}, Le/f/c/l/e/o/m2;->a()Le/f/c/l/e/o/n2;
} // .end method
public final e.f.c.l.e.o.j3 f ( ) {
/* .locals 2 */
/* .line 1 */
e.f.c.l.e.o.j3 .e ( );
int v1 = 3; // const/4 v1, 0x3
/* .line 2 */
(( e.f.c.l.e.o.i3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->a(I)Le/f/c/l/e/o/i3;
v1 = android.os.Build$VERSION.RELEASE;
/* .line 3 */
(( e.f.c.l.e.o.i3 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->b(Ljava/lang/String;)Le/f/c/l/e/o/i3;
v1 = android.os.Build$VERSION.CODENAME;
/* .line 4 */
(( e.f.c.l.e.o.i3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->a(Ljava/lang/String;)Le/f/c/l/e/o/i3;
v1 = this.a;
/* .line 5 */
v1 = e.f.c.l.e.m.j .j ( v1 );
(( e.f.c.l.e.o.i3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->a(Z)Le/f/c/l/e/o/i3;
/* .line 6 */
(( e.f.c.l.e.o.i3 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/i3;->a()Le/f/c/l/e/o/j3;
} // .end method
public final e.f.c.l.e.o.v2 g ( ) {
/* .locals 3 */
/* .line 1 */
e.f.c.l.e.o.v2 .d ( );
final String v1 = "0"; // const-string v1, "0"
/* .line 2 */
(( e.f.c.l.e.o.u2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/u2;->b(Ljava/lang/String;)Le/f/c/l/e/o/u2;
/* .line 3 */
(( e.f.c.l.e.o.u2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/u2;->a(Ljava/lang/String;)Le/f/c/l/e/o/u2;
/* const-wide/16 v1, 0x0 */
/* .line 4 */
(( e.f.c.l.e.o.u2 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/u2;->a(J)Le/f/c/l/e/o/u2;
/* .line 5 */
(( e.f.c.l.e.o.u2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/u2;->a()Le/f/c/l/e/o/v2;
} // .end method
