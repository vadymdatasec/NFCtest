public class e.f.c.l.e.m.z1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.c.l.e.m.d1 a;
	 public final e.f.c.l.e.r.g b;
	 public final e.f.c.l.e.u.c c;
	 public final e.f.c.l.e.n.e d;
	 public final e.f.c.l.e.m.b2 e;
	 /* # direct methods */
	 public e.f.c.l.e.m.z1 ( ) {
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
		 /* .line 6 */
		 this.e = p5;
		 return;
	 } // .end method
	 public static Integer a ( e.f.c.l.e.o.d2 p0, e.f.c.l.e.o.d2 p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 66 */
		 (( e.f.c.l.e.o.d2 ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/o/d2;->a()Ljava/lang/String;
		 (( e.f.c.l.e.o.d2 ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/l/e/o/d2;->a()Ljava/lang/String;
		 p0 = 		 (( java.lang.String ) p0 ).compareTo ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
	 } // .end method
	 public static e.f.c.l.e.m.z1 a ( android.content.Context p0, e.f.c.l.e.m.q1 p1, Object p2, Object p3, Object p4, e.f.c.l.e.m.b2 p5, Object p6, Object p7 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/io/File; */
		 /* invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 /* new-instance v2, Le/f/c/l/e/m/d1; */
		 /* invoke-direct {v2, p0, p1, p3, p6}, Le/f/c/l/e/m/d1;-><init>(Landroid/content/Context;Le/f/c/l/e/m/q1;Le/f/c/l/e/m/b;Le/f/c/l/e/w/d;)V */
		 /* .line 3 */
		 /* new-instance v3, Le/f/c/l/e/r/g; */
		 /* invoke-direct {v3, v0, p7}, Le/f/c/l/e/r/g;-><init>(Ljava/io/File;Le/f/c/l/e/v/f;)V */
		 /* .line 4 */
		 e.f.c.l.e.u.c .a ( p0 );
		 /* .line 5 */
		 /* new-instance p0, Le/f/c/l/e/m/z1; */
		 /* move-object v1, p0 */
		 /* move-object v5, p4 */
		 /* move-object v6, p5 */
		 /* invoke-direct/range {v1 ..v6}, Le/f/c/l/e/m/z1;-><init>(Le/f/c/l/e/m/d1;Le/f/c/l/e/r/g;Le/f/c/l/e/u/c;Le/f/c/l/e/n/e;Le/f/c/l/e/m/b2;)V */
	 } // .end method
	 public static java.util.List a ( java.util.Map p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/Map<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;)", */
		 /* "Ljava/util/List<", */
		 /* "Le/f/c/l/e/o/d2;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 60 */
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 v1 = 	 /* .line 61 */
	 (( java.util.ArrayList ) v0 ).ensureCapacity ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V
	 /* .line 62 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* check-cast v1, Ljava/util/Map$Entry; */
	 /* .line 63 */
	 e.f.c.l.e.o.d2 .c ( );
	 /* check-cast v3, Ljava/lang/String; */
	 (( e.f.c.l.e.o.c2 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/f/c/l/e/o/c2;->a(Ljava/lang/String;)Le/f/c/l/e/o/c2;
	 /* check-cast v1, Ljava/lang/String; */
	 (( e.f.c.l.e.o.c2 ) v2 ).b ( v1 ); // invoke-virtual {v2, v1}, Le/f/c/l/e/o/c2;->b(Ljava/lang/String;)Le/f/c/l/e/o/c2;
	 (( e.f.c.l.e.o.c2 ) v2 ).a ( ); // invoke-virtual {v2}, Le/f/c/l/e/o/c2;->a()Le/f/c/l/e/o/d2;
	 /* .line 64 */
	 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 /* .line 65 */
} // :cond_0
e.f.c.l.e.m.y1 .a ( );
java.util.Collections .sort ( v0,p0 );
} // .end method
public static Boolean a ( e.f.c.l.e.m.z1 p0, Object p1 ) { //synthethic
/* .locals 0 */
p0 = (( e.f.c.l.e.m.z1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/z1;->a(Le/f/a/b/h/g;)Z
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( java.util.concurrent.Executor p0, e.f.c.l.e.m.j1 p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/concurrent/Executor;", */
/* "Le/f/c/l/e/m/j1;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 19 */
v0 = e.f.c.l.e.m.j1.b;
/* if-ne p2, v0, :cond_0 */
/* .line 20 */
e.f.c.l.e.b .a ( );
final String p2 = "Send via DataTransport disabled.Removing DataTransport reports."; // const-string p2, "Send via DataTransport disabled.Removing DataTransport reports."
(( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 21 */
p1 = this.b;
(( e.f.c.l.e.r.g ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/l/e/r/g;->b()V
int p1 = 0; // const/4 p1, 0x0
/* .line 22 */
e.f.a.b.h.n .a ( p1 );
/* .line 23 */
} // :cond_0
v0 = this.b;
/* .line 24 */
(( e.f.c.l.e.r.g ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/c/l/e/r/g;->d()Ljava/util/List;
/* .line 25 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 26 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Le/f/c/l/e/m/e1; */
/* .line 27 */
(( e.f.c.l.e.m.e1 ) v2 ).a ( ); // invoke-virtual {v2}, Le/f/c/l/e/m/e1;->a()Le/f/c/l/e/o/o3;
(( e.f.c.l.e.o.o3 ) v3 ).i ( ); // invoke-virtual {v3}, Le/f/c/l/e/o/o3;->i()Le/f/c/l/e/o/n3;
v4 = e.f.c.l.e.o.n3.d;
/* if-ne v3, v4, :cond_1 */
v3 = e.f.c.l.e.m.j1.d;
/* if-eq p2, v3, :cond_1 */
/* .line 28 */
e.f.c.l.e.b .a ( );
final String v4 = "Send native reports via DataTransport disabled.Removing DataTransport reports."; // const-string v4, "Send native reports via DataTransport disabled.Removing DataTransport reports."
/* .line 29 */
(( e.f.c.l.e.b ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 30 */
v3 = this.b;
(( e.f.c.l.e.m.e1 ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/c/l/e/m/e1;->b()Ljava/lang/String;
(( e.f.c.l.e.r.g ) v3 ).b ( v2 ); // invoke-virtual {v3, v2}, Le/f/c/l/e/r/g;->b(Ljava/lang/String;)V
/* .line 31 */
} // :cond_1
v3 = this.c;
/* .line 32 */
(( e.f.c.l.e.u.c ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Le/f/c/l/e/u/c;->a(Le/f/c/l/e/m/e1;)Le/f/a/b/h/g;
e.f.c.l.e.m.x1 .a ( p0 );
/* .line 33 */
(( e.f.a.b.h.g ) v2 ).a ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
/* .line 34 */
/* .line 35 */
} // :cond_2
e.f.a.b.h.n .a ( v1 );
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 18 */
v0 = this.b;
(( e.f.c.l.e.r.g ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/l/e/r/g;->b()V
return;
} // .end method
public void a ( Long p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 17 */
v0 = this.b;
(( e.f.c.l.e.r.g ) v0 ).a ( p3, p1, p2 ); // invoke-virtual {v0, p3, p1, p2}, Le/f/c/l/e/r/g;->a(Ljava/lang/String;J)V
return;
} // .end method
public void a ( java.lang.String p0, Long p1 ) {
/* .locals 1 */
/* .line 6 */
v0 = this.a;
(( e.f.c.l.e.m.d1 ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/f/c/l/e/m/d1;->a(Ljava/lang/String;J)Le/f/c/l/e/o/o3;
/* .line 7 */
p2 = this.b;
(( e.f.c.l.e.r.g ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/f/c/l/e/r/g;->a(Le/f/c/l/e/o/o3;)V
return;
} // .end method
public void a ( java.lang.String p0, java.util.List p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List<", */
/* "Le/f/c/l/e/m/u1;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 10 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 11 */
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Le/f/c/l/e/m/u1; */
/* .line 12 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 13 */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 14 */
} // :cond_1
p2 = this.b;
/* .line 15 */
e.f.c.l.e.o.h2 .c ( );
e.f.c.l.e.o.p3 .a ( v0 );
(( e.f.c.l.e.o.e2 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/l/e/o/e2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/e2;
(( e.f.c.l.e.o.e2 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/o/e2;->a()Le/f/c/l/e/o/h2;
/* .line 16 */
(( e.f.c.l.e.r.g ) p2 ).a ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Le/f/c/l/e/r/g;->a(Ljava/lang/String;Le/f/c/l/e/o/h2;)V
return;
} // .end method
public void a ( java.lang.Throwable p0, java.lang.Thread p1, java.lang.String p2, Long p3 ) {
/* .locals 10 */
/* .line 8 */
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Persisting fatal event for session "; // const-string v2, "Persisting fatal event for session "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
final String v6 = "crash"; // const-string v6, "crash"
int v9 = 1; // const/4 v9, 0x1
/* move-object v2, p0 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* move-object v5, p3 */
/* move-wide v7, p4 */
/* .line 9 */
/* invoke-virtual/range {v2 ..v9}, Le/f/c/l/e/m/z1;->a(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V */
return;
} // .end method
public final void a ( java.lang.Throwable p0, java.lang.Thread p1, java.lang.String p2, java.lang.String p3, Long p4, Boolean p5 ) {
/* .locals 11 */
/* move-object v0, p0 */
final String v1 = "crash"; // const-string v1, "crash"
/* move-object v5, p4 */
/* .line 36 */
v1 = (( java.lang.String ) p4 ).equals ( v1 ); // invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 37 */
v2 = this.a;
int v8 = 4; // const/4 v8, 0x4
/* const/16 v9, 0x8 */
/* move-object v3, p1 */
/* move-object v4, p2 */
/* move-wide/from16 v6, p5 */
/* move/from16 v10, p7 */
/* .line 38 */
/* invoke-virtual/range {v2 ..v10}, Le/f/c/l/e/m/d1;->a(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Le/f/c/l/e/o/h3; */
/* .line 39 */
(( e.f.c.l.e.o.h3 ) v2 ).f ( ); // invoke-virtual {v2}, Le/f/c/l/e/o/h3;->f()Le/f/c/l/e/o/c3;
/* .line 40 */
v4 = this.d;
(( e.f.c.l.e.n.e ) v4 ).c ( ); // invoke-virtual {v4}, Le/f/c/l/e/n/e;->c()Ljava/lang/String;
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 41 */
e.f.c.l.e.o.g3 .b ( );
(( e.f.c.l.e.o.f3 ) v5 ).a ( v4 ); // invoke-virtual {v5, v4}, Le/f/c/l/e/o/f3;->a(Ljava/lang/String;)Le/f/c/l/e/o/f3;
(( e.f.c.l.e.o.f3 ) v5 ).a ( ); // invoke-virtual {v5}, Le/f/c/l/e/o/f3;->a()Le/f/c/l/e/o/g3;
/* .line 42 */
(( e.f.c.l.e.o.c3 ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/g3;)Le/f/c/l/e/o/c3;
/* .line 43 */
} // :cond_0
e.f.c.l.e.b .a ( );
final String v5 = "No log data to include with this event."; // const-string v5, "No log data to include with this event."
(( e.f.c.l.e.b ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 44 */
} // :goto_0
v4 = this.e;
/* .line 45 */
(( e.f.c.l.e.m.b2 ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/c/l/e/m/b2;->a()Ljava/util/Map;
e.f.c.l.e.m.z1 .a ( v4 );
v5 = /* .line 46 */
/* if-nez v5, :cond_1 */
/* .line 47 */
(( e.f.c.l.e.o.h3 ) v2 ).a ( ); // invoke-virtual {v2}, Le/f/c/l/e/o/h3;->a()Le/f/c/l/e/o/b3;
/* .line 48 */
(( e.f.c.l.e.o.b3 ) v2 ).e ( ); // invoke-virtual {v2}, Le/f/c/l/e/o/b3;->e()Le/f/c/l/e/o/o2;
/* .line 49 */
e.f.c.l.e.o.p3 .a ( v4 );
(( e.f.c.l.e.o.o2 ) v2 ).a ( v4 ); // invoke-virtual {v2, v4}, Le/f/c/l/e/o/o2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/o2;
/* .line 50 */
(( e.f.c.l.e.o.o2 ) v2 ).a ( ); // invoke-virtual {v2}, Le/f/c/l/e/o/o2;->a()Le/f/c/l/e/o/b3;
/* .line 51 */
(( e.f.c.l.e.o.c3 ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/b3;)Le/f/c/l/e/o/c3;
/* .line 52 */
} // :cond_1
v2 = this.b;
(( e.f.c.l.e.o.c3 ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/c/l/e/o/c3;->a()Le/f/c/l/e/o/h3;
/* move-object v4, p3 */
(( e.f.c.l.e.r.g ) v2 ).a ( v3, p3, v1 ); // invoke-virtual {v2, v3, p3, v1}, Le/f/c/l/e/r/g;->a(Le/f/c/l/e/o/h3;Ljava/lang/String;Z)V
return;
} // .end method
public final Boolean a ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/b/h/g<", */
/* "Le/f/c/l/e/m/e1;", */
/* ">;)Z" */
/* } */
} // .end annotation
/* .line 53 */
v0 = (( e.f.a.b.h.g ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/a/b/h/g;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 54 */
(( e.f.a.b.h.g ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/b/h/g;->b()Ljava/lang/Object;
/* check-cast p1, Le/f/c/l/e/m/e1; */
/* .line 55 */
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Crashlytics report successfully enqueued to DataTransport: "; // const-string v2, "Crashlytics report successfully enqueued to DataTransport: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 56 */
(( e.f.c.l.e.m.e1 ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/l/e/m/e1;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 57 */
v0 = this.b;
(( e.f.c.l.e.m.e1 ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/l/e/m/e1;->b()Ljava/lang/String;
(( e.f.c.l.e.r.g ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/r/g;->b(Ljava/lang/String;)V
int p1 = 1; // const/4 p1, 0x1
/* .line 58 */
} // :cond_0
e.f.c.l.e.b .a ( );
/* .line 59 */
(( e.f.a.b.h.g ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;
final String v1 = "Crashlytics report could not be enqueued to DataTransport"; // const-string v1, "Crashlytics report could not be enqueued to DataTransport"
(( e.f.c.l.e.b ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
int p1 = 0; // const/4 p1, 0x0
} // .end method
