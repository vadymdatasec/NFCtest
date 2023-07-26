public abstract class c.h.k.m {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final c.e.g a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lc/e/g<", */
	 /* "Ljava/lang/String;", */
	 /* "Landroid/graphics/Typeface;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.util.concurrent.ExecutorService b;
public static final java.lang.Object c;
public static final c.e.i d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/e/i<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/ArrayList<", */
/* "Lc/h/m/a<", */
/* "Lc/h/k/l;", */
/* ">;>;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.h.k.m ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Lc/e/g; */
/* const/16 v1, 0x10 */
/* invoke-direct {v0, v1}, Lc/e/g;-><init>(I)V */
final String v0 = "fonts-androidx"; // const-string v0, "fonts-androidx"
/* const/16 v1, 0xa */
/* const/16 v2, 0x2710 */
/* .line 2 */
c.h.k.v .a ( v0,v1,v2 );
/* .line 3 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
/* .line 4 */
/* new-instance v0, Lc/e/i; */
/* invoke-direct {v0}, Lc/e/i;-><init>()V */
return;
} // .end method
public static Integer a ( Object p0 ) {
/* .locals 5 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "WrongConstant" */
/* } */
} // .end annotation
/* .line 40 */
v0 = (( c.h.k.n ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/k/n;->b()I
int v1 = -3; // const/4 v1, -0x3
int v2 = 1; // const/4 v2, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 41 */
p0 = (( c.h.k.n ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/k/n;->b()I
/* if-eq p0, v2, :cond_0 */
} // :cond_0
int p0 = -2; // const/4 p0, -0x2
/* .line 42 */
} // :cond_1
(( c.h.k.n ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/k/n;->a()[Lc/h/k/o;
if ( p0 != null) { // if-eqz p0, :cond_5
/* .line 43 */
/* array-length v0, p0 */
/* if-nez v0, :cond_2 */
/* .line 44 */
} // :cond_2
/* array-length v0, p0 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v0, :cond_5 */
/* aget-object v4, p0, v3 */
/* .line 45 */
v4 = (( c.h.k.o ) v4 ).a ( ); // invoke-virtual {v4}, Lc/h/k/o;->a()I
if ( v4 != null) { // if-eqz v4, :cond_4
/* if-gez v4, :cond_3 */
} // :cond_3
/* move v1, v4 */
} // :goto_1
} // :cond_4
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_5
} // :goto_2
} // .end method
public static android.graphics.Typeface a ( android.content.Context p0, Object p1, Integer p2, java.util.concurrent.Executor p3, Object p4 ) {
/* .locals 4 */
/* .line 12 */
c.h.k.m .a ( p1,p2 );
/* .line 13 */
v1 = c.h.k.m.a;
(( c.e.g ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lc/e/g;->b(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Typeface; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 14 */
/* new-instance p0, Lc/h/k/l; */
/* invoke-direct {p0, v1}, Lc/h/k/l;-><init>(Landroid/graphics/Typeface;)V */
(( c.h.k.c ) p4 ).a ( p0 ); // invoke-virtual {p4, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V
/* .line 15 */
} // :cond_0
/* new-instance v1, Lc/h/k/i; */
/* invoke-direct {v1, p4}, Lc/h/k/i;-><init>(Lc/h/k/c;)V */
/* .line 16 */
p4 = c.h.k.m.c;
/* monitor-enter p4 */
/* .line 17 */
try { // :try_start_0
v2 = c.h.k.m.d;
(( c.e.i ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/util/ArrayList; */
int v3 = 0; // const/4 v3, 0x0
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 18 */
(( java.util.ArrayList ) v2 ).add ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 19 */
/* monitor-exit p4 */
/* .line 20 */
} // :cond_1
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 21 */
(( java.util.ArrayList ) v2 ).add ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 22 */
v1 = c.h.k.m.d;
(( c.e.i ) v1 ).put ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 23 */
/* monitor-exit p4 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 24 */
/* new-instance p4, Lc/h/k/j; */
/* invoke-direct {p4, v0, p0, p1, p2}, Lc/h/k/j;-><init>(Ljava/lang/String;Landroid/content/Context;Lc/h/k/g;I)V */
/* if-nez p3, :cond_2 */
/* .line 25 */
p3 = c.h.k.m.b;
/* .line 26 */
} // :cond_2
/* new-instance p0, Lc/h/k/k; */
/* invoke-direct {p0, v0}, Lc/h/k/k;-><init>(Ljava/lang/String;)V */
c.h.k.v .a ( p3,p4,p0 );
/* :catchall_0 */
/* move-exception p0 */
/* .line 27 */
try { // :try_start_1
/* monitor-exit p4 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p0 */
} // .end method
public static android.graphics.Typeface a ( android.content.Context p0, Object p1, Object p2, Integer p3, Integer p4 ) {
/* .locals 2 */
/* .line 1 */
c.h.k.m .a ( p1,p3 );
/* .line 2 */
v1 = c.h.k.m.a;
(( c.e.g ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lc/e/g;->b(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Typeface; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* new-instance p0, Lc/h/k/l; */
/* invoke-direct {p0, v1}, Lc/h/k/l;-><init>(Landroid/graphics/Typeface;)V */
(( c.h.k.c ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V
} // :cond_0
int v1 = -1; // const/4 v1, -0x1
/* if-ne p4, v1, :cond_1 */
/* .line 4 */
c.h.k.m .a ( v0,p0,p1,p3 );
/* .line 5 */
(( c.h.k.c ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V
/* .line 6 */
p0 = this.a;
/* .line 7 */
} // :cond_1
/* new-instance v1, Lc/h/k/h; */
/* invoke-direct {v1, v0, p0, p1, p3}, Lc/h/k/h;-><init>(Ljava/lang/String;Landroid/content/Context;Lc/h/k/g;I)V */
/* .line 8 */
try { // :try_start_0
p0 = c.h.k.m.b;
c.h.k.v .a ( p0,v1,p4 );
/* check-cast p0, Lc/h/k/l; */
/* .line 9 */
(( c.h.k.c ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V
/* .line 10 */
p0 = this.a;
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 11 */
/* :catch_0 */
/* new-instance p0, Lc/h/k/l; */
int p1 = -3; // const/4 p1, -0x3
/* invoke-direct {p0, p1}, Lc/h/k/l;-><init>(I)V */
(( c.h.k.c ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static c.h.k.l a ( java.lang.String p0, android.content.Context p1, Object p2, Integer p3 ) {
/* .locals 2 */
/* .line 29 */
v0 = c.h.k.m.a;
(( c.e.g ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/e/g;->b(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Typeface; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 30 */
/* new-instance p0, Lc/h/k/l; */
/* invoke-direct {p0, v0}, Lc/h/k/l;-><init>(Landroid/graphics/Typeface;)V */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 31 */
try { // :try_start_0
c.h.k.f .a ( p1,p2,v0 );
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 32 */
v1 = c.h.k.m .a ( p2 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 33 */
/* new-instance p0, Lc/h/k/l; */
/* invoke-direct {p0, v1}, Lc/h/k/l;-><init>(I)V */
/* .line 34 */
} // :cond_1
(( c.h.k.n ) p2 ).a ( ); // invoke-virtual {p2}, Lc/h/k/n;->a()[Lc/h/k/o;
/* .line 35 */
c.h.g.g .a ( p1,v0,p2,p3 );
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 36 */
p2 = c.h.k.m.a;
(( c.e.g ) p2 ).a ( p0, p1 ); // invoke-virtual {p2, p0, p1}, Lc/e/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 37 */
/* new-instance p0, Lc/h/k/l; */
/* invoke-direct {p0, p1}, Lc/h/k/l;-><init>(Landroid/graphics/Typeface;)V */
/* .line 38 */
} // :cond_2
/* new-instance p0, Lc/h/k/l; */
int p1 = -3; // const/4 p1, -0x3
/* invoke-direct {p0, p1}, Lc/h/k/l;-><init>(I)V */
/* .line 39 */
/* :catch_0 */
/* new-instance p0, Lc/h/k/l; */
int p1 = -1; // const/4 p1, -0x1
/* invoke-direct {p0, p1}, Lc/h/k/l;-><init>(I)V */
} // .end method
public static java.lang.String a ( Object p0, Integer p1 ) {
/* .locals 1 */
/* .line 28 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( c.h.k.g ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/k/g;->c()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p0 = "-"; // const-string p0, "-"
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
