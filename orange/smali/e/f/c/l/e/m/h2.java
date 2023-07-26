public abstract class e.f.c.l.e.m.h2 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.io.FilenameFilter a;
	 public static final java.util.concurrent.ExecutorService b;
	 /* # direct methods */
	 public static e.f.c.l.e.m.h2 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/c/l/e/m/d2; */
		 /* invoke-direct {v0}, Le/f/c/l/e/m/d2;-><init>()V */
		 final String v0 = "awaitEvenIfOnMainThread task continuation executor"; // const-string v0, "awaitEvenIfOnMainThread task continuation executor"
		 /* .line 2 */
		 e.f.c.l.e.m.o1 .a ( v0 );
		 return;
	 } // .end method
	 public static Integer a ( java.io.File p0, Integer p1, java.util.Comparator p2 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/io/File;", */
		 /* "I", */
		 /* "Ljava/util/Comparator<", */
		 /* "Ljava/io/File;", */
		 /* ">;)I" */
		 /* } */
	 } // .end annotation
	 /* .line 7 */
	 v0 = e.f.c.l.e.m.h2.a;
	 p0 = 	 e.f.c.l.e.m.h2 .a ( p0,v0,p1,p2 );
} // .end method
public static Integer a ( java.io.File p0, java.io.File p1, Integer p2, java.util.Comparator p3 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/io/File;", */
	 /* "Ljava/io/File;", */
	 /* "I", */
	 /* "Ljava/util/Comparator<", */
	 /* "Ljava/io/File;", */
	 /* ">;)I" */
	 /* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
(( java.io.File ) p0 ).listFiles ( ); // invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* .line 3 */
v1 = e.f.c.l.e.m.h2.a;
(( java.io.File ) p1 ).listFiles ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
int v1 = 0; // const/4 v1, 0x0
if ( p0 != null) { // if-eqz p0, :cond_0
} // :cond_0
/* new-array p0, v1, [Ljava/io/File; */
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
/* new-array p1, v1, [Ljava/io/File; */
/* .line 4 */
} // :goto_1
java.util.Arrays .asList ( p0 );
/* .line 5 */
java.util.Arrays .asList ( p1 );
/* .line 6 */
p0 = e.f.c.l.e.m.h2 .a ( v0,p2,p3 );
} // .end method
public static Integer a ( java.io.File p0, java.io.FilenameFilter p1, Integer p2, java.util.Comparator p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/File;", */
/* "Ljava/io/FilenameFilter;", */
/* "I", */
/* "Ljava/util/Comparator<", */
/* "Ljava/io/File;", */
/* ">;)I" */
/* } */
} // .end annotation
/* .line 8 */
(( java.io.File ) p0 ).listFiles ( p1 ); // invoke-virtual {p0, p1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 9 */
} // :cond_0
java.util.Arrays .asList ( p0 );
p0 = e.f.c.l.e.m.h2 .a ( p0,p2,p3 );
} // .end method
public static Integer a ( java.util.List p0, Integer p1, java.util.Comparator p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Ljava/io/File;", */
/* ">;I", */
/* "Ljava/util/Comparator<", */
/* "Ljava/io/File;", */
/* ">;)I" */
/* } */
} // .end annotation
v0 = /* .line 10 */
/* .line 11 */
java.util.Collections .sort ( p0,p2 );
/* .line 12 */
p2 = } // :goto_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* check-cast p2, Ljava/io/File; */
/* if-gt v0, p1, :cond_0 */
/* .line 13 */
} // :cond_0
e.f.c.l.e.m.h2 .a ( p2 );
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
} // .end method
public static e.f.a.b.h.g a ( Object p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;)", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 14 */
/* new-instance v0, Le/f/a/b/h/h; */
/* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
/* .line 15 */
/* new-instance v1, Le/f/c/l/e/m/e2; */
/* invoke-direct {v1, v0}, Le/f/c/l/e/m/e2;-><init>(Le/f/a/b/h/h;)V */
/* .line 16 */
(( e.f.a.b.h.g ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/a;)Le/f/a/b/h/g;
/* .line 17 */
(( e.f.a.b.h.g ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/a;)Le/f/a/b/h/g;
/* .line 18 */
(( e.f.a.b.h.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
} // .end method
public static e.f.a.b.h.g a ( java.util.concurrent.Executor p0, java.util.concurrent.Callable p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/concurrent/Executor;", */
/* "Ljava/util/concurrent/Callable<", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;>;)", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 19 */
/* new-instance v0, Le/f/a/b/h/h; */
/* invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V */
/* .line 20 */
/* new-instance v1, Le/f/c/l/e/m/g2; */
/* invoke-direct {v1, p1, v0}, Le/f/c/l/e/m/g2;-><init>(Ljava/util/concurrent/Callable;Le/f/a/b/h/h;)V */
/* .line 21 */
(( e.f.a.b.h.h ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;
} // .end method
public static java.lang.Object a ( Object p0 ) {
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
/* Ljava/lang/InterruptedException;, */
/* Ljava/util/concurrent/TimeoutException; */
/* } */
} // .end annotation
/* .line 22 */
/* new-instance v0, Ljava/util/concurrent/CountDownLatch; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V */
/* .line 23 */
v1 = e.f.c.l.e.m.h2.b;
e.f.c.l.e.m.c2 .a ( v0 );
(( e.f.a.b.h.g ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
/* .line 24 */
android.os.Looper .getMainLooper ( );
android.os.Looper .myLooper ( );
/* if-ne v1, v2, :cond_0 */
/* const-wide/16 v1, 0x4 */
/* .line 25 */
v3 = java.util.concurrent.TimeUnit.SECONDS;
(( java.util.concurrent.CountDownLatch ) v0 ).await ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
/* .line 26 */
} // :cond_0
(( java.util.concurrent.CountDownLatch ) v0 ).await ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
/* .line 27 */
} // :goto_0
v0 = (( e.f.a.b.h.g ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 28 */
(( e.f.a.b.h.g ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->b()Ljava/lang/Object;
/* .line 29 */
} // :cond_1
v0 = (( e.f.a.b.h.g ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->c()Z
/* if-nez v0, :cond_3 */
/* .line 30 */
v0 = (( e.f.a.b.h.g ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 31 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
(( e.f.a.b.h.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;
/* invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
/* .line 32 */
} // :cond_2
/* new-instance p0, Ljava/util/concurrent/TimeoutException; */
/* invoke-direct {p0}, Ljava/util/concurrent/TimeoutException;-><init>()V */
/* throw p0 */
/* .line 33 */
} // :cond_3
/* new-instance p0, Ljava/util/concurrent/CancellationException; */
final String v0 = "Task is already canceled"; // const-string v0, "Task is already canceled"
/* invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static java.lang.Object a ( java.util.concurrent.CountDownLatch p0, Object p1 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 34 */
(( java.util.concurrent.CountDownLatch ) p0 ).countDown ( ); // invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void a ( java.io.File p0 ) {
/* .locals 4 */
/* .line 35 */
v0 = (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 36 */
(( java.io.File ) p0 ).listFiles ( ); // invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, v0, v2 */
/* .line 37 */
e.f.c.l.e.m.h2 .a ( v3 );
/* add-int/lit8 v2, v2, 0x1 */
/* .line 38 */
} // :cond_0
(( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
return;
} // .end method
