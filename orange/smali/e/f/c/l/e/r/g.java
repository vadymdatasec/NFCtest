public class e.f.c.l.e.r.g {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.nio.charset.Charset g;
	 public static final Integer h;
	 public static final e.f.c.l.e.o.q3.i i;
	 public static final java.util.Comparator j;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Comparator<", */
	 /* "-", */
	 /* "Ljava/io/File;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.io.FilenameFilter k;
/* # instance fields */
public final java.util.concurrent.atomic.AtomicInteger a;
public final java.io.File b;
public final java.io.File c;
public final java.io.File d;
public final java.io.File e;
public final e.f.c.l.e.v.f f;
/* # direct methods */
public static e.f.c.l.e.r.g ( ) {
/* .locals 1 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
/* .line 1 */
java.nio.charset.Charset .forName ( v0 );
/* const/16 v0, 0xf */
/* .line 2 */
/* .line 3 */
/* new-instance v0, Le/f/c/l/e/o/q3/i; */
/* invoke-direct {v0}, Le/f/c/l/e/o/q3/i;-><init>()V */
/* .line 4 */
e.f.c.l.e.r.e .a ( );
/* .line 5 */
e.f.c.l.e.r.f .a ( );
return;
} // .end method
public e.f.c.l.e.r.g ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/io/File; */
final String v1 = "report-persistence"; // const-string v1, "report-persistence"
/* invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 4 */
/* new-instance p1, Ljava/io/File; */
final String v1 = "sessions"; // const-string v1, "sessions"
/* invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
this.b = p1;
/* .line 5 */
/* new-instance p1, Ljava/io/File; */
final String v1 = "priority-reports"; // const-string v1, "priority-reports"
/* invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
this.c = p1;
/* .line 6 */
/* new-instance p1, Ljava/io/File; */
final String v1 = "reports"; // const-string v1, "reports"
/* invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
this.d = p1;
/* .line 7 */
/* new-instance p1, Ljava/io/File; */
final String v1 = "native-reports"; // const-string v1, "native-reports"
/* invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
this.e = p1;
/* .line 8 */
this.f = p2;
return;
} // .end method
public static Integer a ( java.io.File p0, Integer p1 ) {
/* .locals 1 */
/* .line 83 */
e.f.c.l.e.r.c .a ( );
/* .line 84 */
e.f.c.l.e.r.g .a ( p0,v0 );
/* .line 85 */
e.f.c.l.e.r.d .a ( );
java.util.Collections .sort ( p0,v0 );
/* .line 86 */
p0 = e.f.c.l.e.r.g .a ( p0,p1 );
} // .end method
public static Integer a ( java.io.File p0, java.io.File p1 ) { //synthethic
/* .locals 0 */
p0 = e.f.c.l.e.r.g .c ( p0,p1 );
} // .end method
public static Integer a ( java.util.List p0, Integer p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;I)I" */
/* } */
} // .end annotation
v0 = /* .line 96 */
/* .line 97 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Ljava/io/File; */
/* if-gt v0, p1, :cond_0 */
/* .line 98 */
} // :cond_0
e.f.c.l.e.r.g .e ( v1 );
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
} // .end method
public static java.lang.String a ( Integer p0, Boolean p1 ) {
/* .locals 3 */
/* .line 81 */
v0 = java.util.Locale.US;
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/Object; */
java.lang.Integer .valueOf ( p0 );
int v2 = 0; // const/4 v2, 0x0
/* aput-object p0, v1, v2 */
final String p0 = "%010d"; // const-string p0, "%010d"
java.lang.String .format ( v0,p0,v1 );
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "_"; // const-string p1, "_"
} // :cond_0
final String p1 = ""; // const-string p1, ""
/* .line 82 */
} // :goto_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "event"; // const-string v1, "event"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.util.List a ( java.io.File p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/File;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 87 */
e.f.c.l.e.r.g .a ( p0,v0 );
} // .end method
public static java.util.List a ( java.io.File p0, java.io.FileFilter p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/File;", */
/* "Ljava/io/FileFilter;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 92 */
v0 = (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
/* if-nez v0, :cond_0 */
/* .line 93 */
java.util.Collections .emptyList ( );
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 94 */
(( java.io.File ) p0 ).listFiles ( ); // invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
} // :cond_1
(( java.io.File ) p0 ).listFiles ( p1 ); // invoke-virtual {p0, p1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 95 */
java.util.Arrays .asList ( p0 );
} // :cond_2
java.util.Collections .emptyList ( );
} // :goto_1
} // .end method
public static java.util.List a ( java.io.File p0, java.io.FilenameFilter p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/File;", */
/* "Ljava/io/FilenameFilter;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 88 */
v0 = (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
/* if-nez v0, :cond_0 */
/* .line 89 */
java.util.Collections .emptyList ( );
} // :cond_0
/* if-nez p1, :cond_1 */
/* .line 90 */
(( java.io.File ) p0 ).listFiles ( ); // invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
} // :cond_1
(( java.io.File ) p0 ).listFiles ( p1 ); // invoke-virtual {p0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 91 */
java.util.Arrays .asList ( p0 );
} // :cond_2
java.util.Collections .emptyList ( );
} // :goto_1
} // .end method
public static java.util.List a ( java.util.List...p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;)", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 75 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 76 */
/* array-length v1, p0 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_0 */
/* aget-object v5, p0, v3 */
v5 = /* .line 77 */
/* add-int/2addr v4, v5 */
/* add-int/lit8 v3, v3, 0x1 */
/* .line 78 */
} // :cond_0
(( java.util.ArrayList ) v0 ).ensureCapacity ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->ensureCapacity(I)V
/* .line 79 */
/* array-length v1, p0 */
} // :goto_1
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, p0, v2 */
/* .line 80 */
(( java.util.ArrayList ) v0 ).addAll ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
public static void a ( java.io.File p0, java.io.File p1, e.f.c.l.e.o.h2 p2, java.lang.String p3 ) {
/* .locals 2 */
/* .line 58 */
try { // :try_start_0
v0 = e.f.c.l.e.r.g.i;
/* .line 59 */
e.f.c.l.e.r.g .d ( p0 );
(( e.f.c.l.e.o.q3.i ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/q3/i;->b(Ljava/lang/String;)Le/f/c/l/e/o/o3;
(( e.f.c.l.e.o.o3 ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Le/f/c/l/e/o/o3;->a(Le/f/c/l/e/o/h2;)Le/f/c/l/e/o/o3;
/* .line 60 */
/* new-instance v0, Ljava/io/File; */
/* .line 61 */
e.f.c.l.e.r.g .c ( p1 );
/* invoke-direct {v0, p1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
p1 = e.f.c.l.e.r.g.i;
/* .line 62 */
(( e.f.c.l.e.o.q3.i ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/o/q3/i;->a(Le/f/c/l/e/o/o3;)Ljava/lang/String;
/* .line 63 */
e.f.c.l.e.r.g .d ( v0,p1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 64 */
e.f.c.l.e.b .a ( );
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Could not synthesize final native report file for "; // const-string v0, "Could not synthesize final native report file for "
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p0 ); // invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p2 ).a ( p0, p1 ); // invoke-virtual {p2, p0, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :goto_0
return;
} // .end method
public static void a ( java.io.File p0, java.io.File p1, java.util.List p2, Long p3, Boolean p4, java.lang.String p5 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/File;", */
/* "Ljava/io/File;", */
/* "Ljava/util/List<", */
/* "Le/f/c/l/e/o/h3;", */
/* ">;JZ", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 65 */
try { // :try_start_0
v0 = e.f.c.l.e.r.g.i;
/* .line 66 */
e.f.c.l.e.r.g .d ( p0 );
(( e.f.c.l.e.o.q3.i ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/q3/i;->b(Ljava/lang/String;)Le/f/c/l/e/o/o3;
/* .line 67 */
(( e.f.c.l.e.o.o3 ) v0 ).a ( p3, p4, p5, p6 ); // invoke-virtual {v0, p3, p4, p5, p6}, Le/f/c/l/e/o/o3;->a(JZLjava/lang/String;)Le/f/c/l/e/o/o3;
/* .line 68 */
e.f.c.l.e.o.p3 .a ( p2 );
(( e.f.c.l.e.o.o3 ) p3 ).a ( p2 ); // invoke-virtual {p3, p2}, Le/f/c/l/e/o/o3;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/o3;
/* .line 69 */
(( e.f.c.l.e.o.o3 ) p2 ).h ( ); // invoke-virtual {p2}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;
/* if-nez p3, :cond_0 */
return;
/* .line 70 */
} // :cond_0
/* new-instance p4, Ljava/io/File; */
/* .line 71 */
e.f.c.l.e.r.g .c ( p1 );
(( e.f.c.l.e.o.m3 ) p3 ).g ( ); // invoke-virtual {p3}, Le/f/c/l/e/o/m3;->g()Ljava/lang/String;
/* invoke-direct {p4, p1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
p1 = e.f.c.l.e.r.g.i;
/* .line 72 */
(( e.f.c.l.e.o.q3.i ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/o/q3/i;->a(Le/f/c/l/e/o/o3;)Ljava/lang/String;
/* .line 73 */
e.f.c.l.e.r.g .d ( p4,p1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 74 */
e.f.c.l.e.b .a ( );
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String p4 = "Could not synthesize final report file for "; // const-string p4, "Could not synthesize final report file for "
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p0 ); // invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p2 ).a ( p0, p1 ); // invoke-virtual {p2, p0, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :goto_0
return;
} // .end method
public static Boolean a ( java.io.File p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
p0 = e.f.c.l.e.r.g .b ( p0,p1 );
} // .end method
public static Boolean a ( java.lang.String p0, java.io.File p1 ) { //synthethic
/* .locals 1 */
/* .line 34 */
v0 = (( java.io.File ) p1 ).isDirectory ( ); // invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
p0 = (( java.lang.String ) p1 ).equals ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez p0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean a ( java.lang.String p0, java.io.File p1, java.lang.String p2 ) { //synthethic
/* .locals 0 */
/* .line 16 */
p0 = (( java.lang.String ) p2 ).startsWith ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
} // .end method
public static Integer b ( java.io.File p0, java.io.File p1 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
(( java.io.File ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;
p0 = (( java.lang.String ) p1 ).compareTo ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
} // .end method
public static java.util.List b ( java.util.List...p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;)", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 12 */
/* array-length v0, p0 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* aget-object v2, p0, v1 */
/* .line 13 */
v3 = e.f.c.l.e.r.g.j;
java.util.Collections .sort ( v2,v3 );
/* add-int/lit8 v1, v1, 0x1 */
/* .line 14 */
} // :cond_0
e.f.c.l.e.r.g .a ( p0 );
} // .end method
public static Boolean b ( java.io.File p0 ) {
/* .locals 1 */
/* .line 16 */
v0 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
/* if-nez v0, :cond_1 */
p0 = (( java.io.File ) p0 ).mkdirs ( ); // invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
} // :goto_0
int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
public static Boolean b ( java.io.File p0, java.lang.String p1 ) {
/* .locals 0 */
final String p0 = "event"; // const-string p0, "event"
/* .line 15 */
p0 = (( java.lang.String ) p1 ).startsWith ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
final String p0 = "_"; // const-string p0, "_"
p0 = (( java.lang.String ) p1 ).endsWith ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez p0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Integer c ( java.io.File p0, java.io.File p1 ) {
/* .locals 0 */
/* .line 9 */
(( java.io.File ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;
e.f.c.l.e.r.g .d ( p0 );
/* .line 10 */
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
e.f.c.l.e.r.g .d ( p1 );
/* .line 11 */
p0 = (( java.lang.String ) p0 ).compareTo ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
} // .end method
public static java.io.File c ( java.io.File p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 12 */
v0 = e.f.c.l.e.r.g .b ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 13 */
} // :cond_0
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Could not create directory "; // const-string v2, "Could not create directory "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static Boolean c ( java.io.File p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
final String p0 = "event"; // const-string p0, "event"
/* .line 1 */
p0 = (( java.lang.String ) p1 ).startsWith ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
} // .end method
public static java.lang.String d ( java.io.File p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const/16 v0, 0x2000 */
/* new-array v0, v0, [B */
/* .line 14 */
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 15 */
/* new-instance v2, Ljava/io/FileInputStream; */
/* invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* .line 16 */
} // :goto_0
try { // :try_start_0
p0 = (( java.io.FileInputStream ) v2 ).read ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I
/* if-lez p0, :cond_0 */
int v3 = 0; // const/4 v3, 0x0
/* .line 17 */
(( java.io.ByteArrayOutputStream ) v1 ).write ( v0, v3, p0 ); // invoke-virtual {v1, v0, v3, p0}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 18 */
} // :cond_0
/* new-instance p0, Ljava/lang/String; */
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
v1 = e.f.c.l.e.r.g.g;
/* invoke-direct {p0, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 19 */
(( java.io.FileInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
/* :catchall_0 */
/* move-exception p0 */
/* .line 20 */
try { // :try_start_1
(( java.io.FileInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* :catchall_1 */
/* throw p0 */
} // .end method
public static java.lang.String d ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 9 */
int v1 = 0; // const/4 v1, 0x0
(( java.lang.String ) p0 ).substring ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public static void d ( java.io.File p0, java.lang.String p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 10 */
/* new-instance v0, Ljava/io/OutputStreamWriter; */
/* new-instance v1, Ljava/io/FileOutputStream; */
/* invoke-direct {v1, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
p0 = e.f.c.l.e.r.g.g;
/* invoke-direct {v0, v1, p0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V */
/* .line 11 */
try { // :try_start_0
(( java.io.OutputStreamWriter ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 12 */
(( java.io.OutputStreamWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->close()V
return;
/* :catchall_0 */
/* move-exception p0 */
/* .line 13 */
try { // :try_start_1
(( java.io.OutputStreamWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->close()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* :catchall_1 */
/* throw p0 */
} // .end method
public static void e ( java.io.File p0 ) {
/* .locals 4 */
/* if-nez p0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
v0 = (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
(( java.io.File ) p0 ).listFiles ( ); // invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
/* .line 4 */
e.f.c.l.e.r.g .e ( v3 );
/* add-int/lit8 v2, v2, 0x1 */
/* .line 5 */
} // :cond_1
(( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
return;
} // .end method
public static Boolean e ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "event"; // const-string v0, "event"
/* .line 1 */
v0 = (( java.lang.String ) p0 ).startsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "_"; // const-string v0, "_"
p0 = (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
/* # virtual methods */
public final java.util.List a ( java.lang.String p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 25 */
e.f.c.l.e.r.b .a ( p1 );
/* .line 26 */
v0 = this.b;
/* .line 27 */
e.f.c.l.e.r.g .a ( v0,p1 );
/* .line 28 */
v0 = e.f.c.l.e.r.g.j;
java.util.Collections .sort ( p1,v0 );
v0 = /* .line 29 */
/* const/16 v1, 0x8 */
/* if-gt v0, v1, :cond_0 */
/* .line 30 */
v0 = } // :cond_0
/* .line 31 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/io/File; */
/* .line 32 */
e.f.c.l.e.r.g .e ( v2 );
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 33 */
} // .end method
public final void a ( ) {
/* .locals 3 */
/* .line 35 */
v0 = this.f;
/* .line 36 */
/* iget v0, v0, Le/f/c/l/e/v/j/d;->b:I */
/* .line 37 */
(( e.f.c.l.e.r.g ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/r/g;->c()Ljava/util/List;
v2 = /* .line 38 */
/* if-gt v2, v0, :cond_0 */
return;
/* .line 39 */
} // :cond_0
/* .line 40 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Ljava/io/File; */
/* .line 41 */
(( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
} // :cond_1
return;
} // .end method
public void a ( e.f.c.l.e.o.h3 p0, java.lang.String p1, Boolean p2 ) {
/* .locals 4 */
/* .line 8 */
v0 = this.f;
/* .line 9 */
/* iget v0, v0, Le/f/c/l/e/v/j/d;->a:I */
/* .line 10 */
(( e.f.c.l.e.r.g ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/r/g;->c(Ljava/lang/String;)Ljava/io/File;
/* .line 11 */
v2 = e.f.c.l.e.r.g.i;
(( e.f.c.l.e.o.q3.i ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/f/c/l/e/o/q3/i;->a(Le/f/c/l/e/o/h3;)Ljava/lang/String;
/* .line 12 */
v2 = this.a;
v2 = (( java.util.concurrent.atomic.AtomicInteger ) v2 ).getAndIncrement ( ); // invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I
e.f.c.l.e.r.g .a ( v2,p3 );
/* .line 13 */
try { // :try_start_0
/* new-instance v2, Ljava/io/File; */
/* invoke-direct {v2, v1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
e.f.c.l.e.r.g .d ( v2,p1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 14 */
e.f.c.l.e.b .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Could not persist event for session "; // const-string v3, "Could not persist event for session "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p3 ).a ( p2, p1 ); // invoke-virtual {p3, p2, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
/* .line 15 */
} // :goto_0
e.f.c.l.e.r.g .a ( v1,v0 );
return;
} // .end method
public void a ( e.f.c.l.e.o.o3 p0 ) {
/* .locals 4 */
/* .line 1 */
(( e.f.c.l.e.o.o3 ) p1 ).h ( ); // invoke-virtual {p1}, Le/f/c/l/e/o/o3;->h()Le/f/c/l/e/o/m3;
/* if-nez v0, :cond_0 */
/* .line 2 */
e.f.c.l.e.b .a ( );
final String v0 = "Could not get session for report"; // const-string v0, "Could not get session for report"
(( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
return;
/* .line 3 */
} // :cond_0
(( e.f.c.l.e.o.m3 ) v0 ).g ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/m3;->g()Ljava/lang/String;
/* .line 4 */
try { // :try_start_0
(( e.f.c.l.e.r.g ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/r/g;->c(Ljava/lang/String;)Ljava/io/File;
e.f.c.l.e.r.g .c ( v1 );
/* .line 5 */
v2 = e.f.c.l.e.r.g.i;
(( e.f.c.l.e.o.q3.i ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/f/c/l/e/o/q3/i;->a(Le/f/c/l/e/o/o3;)Ljava/lang/String;
/* .line 6 */
/* new-instance v2, Ljava/io/File; */
final String v3 = "report"; // const-string v3, "report"
/* invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
e.f.c.l.e.r.g .d ( v2,p1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 7 */
e.f.c.l.e.b .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Could not persist report for session "; // const-string v3, "Could not persist report for session "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v1 ).a ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :goto_0
return;
} // .end method
public final void a ( java.io.File p0, Long p1 ) {
/* .locals 9 */
/* .line 42 */
v0 = e.f.c.l.e.r.g.k;
e.f.c.l.e.r.g .a ( p1,v0 );
v1 = /* .line 43 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 44 */
e.f.c.l.e.b .a ( );
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Session "; // const-string v0, "Session "
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " has no events."; // const-string p1, " has no events."
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
return;
/* .line 45 */
} // :cond_0
java.util.Collections .sort ( v0 );
/* .line 46 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 47 */
int v1 = 0; // const/4 v1, 0x0
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_3
/* check-cast v3, Ljava/io/File; */
/* .line 48 */
try { // :try_start_0
v4 = e.f.c.l.e.r.g.i;
e.f.c.l.e.r.g .d ( v3 );
(( e.f.c.l.e.o.q3.i ) v4 ).a ( v6 ); // invoke-virtual {v4, v6}, Le/f/c/l/e/o/q3/i;->a(Ljava/lang/String;)Le/f/c/l/e/o/h3;
/* if-nez v5, :cond_2 */
/* .line 49 */
(( java.io.File ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;
v3 = e.f.c.l.e.r.g .e ( v4 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v3 != null) { // if-eqz v3, :cond_1
} // :cond_2
int v3 = 1; // const/4 v3, 0x1
int v5 = 1; // const/4 v5, 0x1
/* :catch_0 */
/* move-exception v4 */
/* .line 50 */
e.f.c.l.e.b .a ( );
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Could not add event to report for "; // const-string v8, "Could not add event to report for "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v3 ); // invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v6 ).a ( v3, v4 ); // invoke-virtual {v6, v3, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* .line 51 */
/* new-instance v1, Ljava/io/File; */
final String v3 = "user"; // const-string v3, "user"
/* invoke-direct {v1, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 52 */
v3 = (( java.io.File ) v1 ).isFile ( ); // invoke-virtual {v1}, Ljava/io/File;->isFile()Z
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 53 */
try { // :try_start_1
e.f.c.l.e.r.g .d ( v1 );
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v1 */
/* .line 54 */
e.f.c.l.e.b .a ( );
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Could not read user ID file in "; // const-string v6, "Could not read user ID file in "
(( java.lang.StringBuilder ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v3 ).a ( v4, v1 ); // invoke-virtual {v3, v4, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
} // :cond_4
} // :goto_1
/* move-object v6, v0 */
/* .line 55 */
/* new-instance v0, Ljava/io/File; */
final String v1 = "report"; // const-string v1, "report"
/* invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 56 */
p1 = this.c;
} // :cond_5
p1 = this.d;
} // :goto_2
/* move-object v1, p1 */
/* move-wide v3, p2 */
/* .line 57 */
/* invoke-static/range {v0 ..v6}, Le/f/c/l/e/r/g;->a(Ljava/io/File;Ljava/io/File;Ljava/util/List;JZLjava/lang/String;)V */
return;
} // .end method
public void a ( java.lang.String p0, Long p1 ) {
/* .locals 4 */
/* .line 17 */
(( e.f.c.l.e.r.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/r/g;->a(Ljava/lang/String;)Ljava/util/List;
/* .line 18 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/io/File; */
/* .line 19 */
e.f.c.l.e.b .a ( );
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Finalizing report for session "; // const-string v3, "Finalizing report for session "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 20 */
(( e.f.c.l.e.r.g ) p0 ).a ( v0, p2, p3 ); // invoke-virtual {p0, v0, p2, p3}, Le/f/c/l/e/r/g;->a(Ljava/io/File;J)V
/* .line 21 */
e.f.c.l.e.r.g .e ( v0 );
/* .line 22 */
} // :cond_0
(( e.f.c.l.e.r.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/r/g;->a()V
return;
} // .end method
public void a ( java.lang.String p0, e.f.c.l.e.o.h2 p1 ) {
/* .locals 3 */
/* .line 23 */
/* new-instance v0, Ljava/io/File; */
(( e.f.c.l.e.r.g ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/r/g;->c(Ljava/lang/String;)Ljava/io/File;
final String v2 = "report"; // const-string v2, "report"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 24 */
v1 = this.e;
e.f.c.l.e.r.g .a ( v0,v1,p2,p1 );
return;
} // .end method
public void b ( ) {
/* .locals 2 */
/* .line 2 */
(( e.f.c.l.e.r.g ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/r/g;->c()Ljava/util/List;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/io/File; */
/* .line 3 */
(( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
} // :cond_0
return;
} // .end method
public void b ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 4 */
e.f.c.l.e.r.a .a ( p1 );
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [Ljava/util/List; */
/* .line 5 */
v1 = this.c;
/* .line 6 */
e.f.c.l.e.r.g .a ( v1,p1 );
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
v1 = this.e;
/* .line 7 */
e.f.c.l.e.r.g .a ( v1,p1 );
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
v1 = this.d;
/* .line 8 */
e.f.c.l.e.r.g .a ( v1,p1 );
int v1 = 2; // const/4 v1, 0x2
/* aput-object p1, v0, v1 */
/* .line 9 */
e.f.c.l.e.r.g .a ( v0 );
/* .line 10 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/io/File; */
/* .line 11 */
(( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
} // :cond_0
return;
} // .end method
public final java.io.File c ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 8 */
/* new-instance v0, Ljava/io/File; */
v1 = this.b;
/* invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public final java.util.List c ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;" */
/* } */
} // .end annotation
int v0 = 2; // const/4 v0, 0x2
/* new-array v1, v0, [Ljava/util/List; */
/* new-array v0, v0, [Ljava/util/List; */
/* .line 2 */
v2 = this.c;
/* .line 3 */
e.f.c.l.e.r.g .a ( v2 );
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v0, v3 */
v2 = this.e;
/* .line 4 */
e.f.c.l.e.r.g .a ( v2 );
int v4 = 1; // const/4 v4, 0x1
/* aput-object v2, v0, v4 */
/* .line 5 */
e.f.c.l.e.r.g .a ( v0 );
/* aput-object v0, v1, v3 */
v0 = this.d;
/* .line 6 */
e.f.c.l.e.r.g .a ( v0 );
/* aput-object v0, v1, v4 */
/* .line 7 */
e.f.c.l.e.r.g .b ( v1 );
} // .end method
public java.util.List d ( ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Le/f/c/l/e/m/e1;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.e.r.g ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/r/g;->c()Ljava/util/List;
/* .line 2 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
v0 = /* .line 3 */
(( java.util.ArrayList ) v1 ).ensureCapacity ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V
/* .line 4 */
(( e.f.c.l.e.r.g ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/r/g;->c()Ljava/util/List;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Ljava/io/File; */
/* .line 5 */
try { // :try_start_0
v3 = e.f.c.l.e.r.g.i;
e.f.c.l.e.r.g .d ( v2 );
(( e.f.c.l.e.o.q3.i ) v3 ).b ( v4 ); // invoke-virtual {v3, v4}, Le/f/c/l/e/o/q3/i;->b(Ljava/lang/String;)Le/f/c/l/e/o/o3;
/* .line 6 */
(( java.io.File ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
e.f.c.l.e.m.e1 .a ( v3,v4 );
(( java.util.ArrayList ) v1 ).add ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v3 */
/* .line 7 */
e.f.c.l.e.b .a ( );
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Could not load report file "; // const-string v6, "Could not load report file "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v6 = "; deleting"; // const-string v6, "; deleting"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v4 ).a ( v5, v3 ); // invoke-virtual {v4, v5, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
/* .line 8 */
(( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
} // :cond_0
} // .end method
