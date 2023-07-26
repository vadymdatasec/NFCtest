public class e.f.a.a.j.c0 implements e.f.a.a.j.b0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static volatile e.f.a.a.j.e0 e;
	 /* # instance fields */
	 public final e.f.a.a.j.l0.a a;
	 public final e.f.a.a.j.l0.a b;
	 public final e.f.a.a.j.j0.e c;
	 public final e.f.a.a.j.j0.j.s d;
	 /* # direct methods */
	 public static e.f.a.a.j.c0 ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public e.f.a.a.j.c0 ( ) {
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
		 (( e.f.a.a.j.j0.j.w ) p5 ).a ( ); // invoke-virtual {p5}, Le/f/a/a/j/j0/j/w;->a()V
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = e.f.a.a.j.c0.e;
		 /* if-nez v0, :cond_1 */
		 /* .line 2 */
		 /* const-class v0, Le/f/a/a/j/c0; */
		 /* monitor-enter v0 */
		 /* .line 3 */
		 try { // :try_start_0
			 v1 = e.f.a.a.j.c0.e;
			 /* if-nez v1, :cond_0 */
			 /* .line 4 */
			 e.f.a.a.j.l .m ( );
			 /* .line 5 */
			 /* .line 6 */
			 /* .line 7 */
		 } // :cond_0
		 /* monitor-exit v0 */
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw p0 */
	 } // :cond_1
} // :goto_0
return;
} // .end method
public static e.f.a.a.j.c0 b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = e.f.a.a.j.c0.e;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( e.f.a.a.j.e0 ) v0 ).l ( ); // invoke-virtual {v0}, Le/f/a/a/j/e0;->l()Le/f/a/a/j/c0;
	 /* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Not initialized!"; // const-string v1, "Not initialized!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static java.util.Set b ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/a/j/m;", */
/* ")", */
/* "Ljava/util/Set<", */
/* "Le/f/a/a/b;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 4 */
/* instance-of v0, p0, Le/f/a/a/j/n; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
/* check-cast p0, Le/f/a/a/j/n; */
/* .line 6 */
java.util.Collections .unmodifiableSet ( p0 );
} // :cond_0
final String p0 = "proto"; // const-string p0, "proto"
/* .line 7 */
e.f.a.a.b .a ( p0 );
java.util.Collections .singleton ( p0 );
} // .end method
/* # virtual methods */
public e.f.a.a.g a ( Object p0 ) {
/* .locals 4 */
/* .line 8 */
/* new-instance v0, Le/f/a/a/j/y; */
/* .line 9 */
e.f.a.a.j.c0 .b ( p1 );
/* .line 10 */
e.f.a.a.j.x .d ( );
/* .line 11 */
(( e.f.a.a.j.x$a ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Le/f/a/a/j/x$a;->a(Ljava/lang/String;)Le/f/a/a/j/x$a;
/* .line 12 */
(( e.f.a.a.j.x$a ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/f/a/a/j/x$a;->a([B)Le/f/a/a/j/x$a;
/* .line 13 */
(( e.f.a.a.j.x$a ) v2 ).a ( ); // invoke-virtual {v2}, Le/f/a/a/j/x$a;->a()Le/f/a/a/j/x;
/* invoke-direct {v0, v1, p1, p0}, Le/f/a/a/j/y;-><init>(Ljava/util/Set;Le/f/a/a/j/x;Le/f/a/a/j/b0;)V */
} // .end method
public e.f.a.a.j.j0.j.s a ( ) {
/* .locals 1 */
/* .line 14 */
v0 = this.d;
} // .end method
public final e.f.a.a.j.q a ( Object p0 ) {
/* .locals 4 */
/* .line 19 */
e.f.a.a.j.q .i ( );
v1 = this.a;
/* .line 20 */
/* move-result-wide v1 */
(( e.f.a.a.j.p ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/a/j/p;->a(J)Le/f/a/a/j/p;
v1 = this.b;
/* .line 21 */
/* move-result-wide v1 */
(( e.f.a.a.j.p ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/a/j/p;->b(J)Le/f/a/a/j/p;
/* .line 22 */
(( e.f.a.a.j.w ) p1 ).f ( ); // invoke-virtual {p1}, Le/f/a/a/j/w;->f()Ljava/lang/String;
(( e.f.a.a.j.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Ljava/lang/String;)Le/f/a/a/j/p;
/* new-instance v1, Le/f/a/a/j/o; */
/* .line 23 */
(( e.f.a.a.j.w ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/w;->a()Le/f/a/a/b;
(( e.f.a.a.j.w ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/a/j/w;->c()[B
/* invoke-direct {v1, v2, v3}, Le/f/a/a/j/o;-><init>(Le/f/a/a/b;[B)V */
(( e.f.a.a.j.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Le/f/a/a/j/o;)Le/f/a/a/j/p;
/* .line 24 */
(( e.f.a.a.j.w ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/w;->b()Le/f/a/a/c;
(( e.f.a.a.c ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/c;->a()Ljava/lang/Integer;
(( e.f.a.a.j.p ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/a/j/p;->a(Ljava/lang/Integer;)Le/f/a/a/j/p;
/* .line 25 */
(( e.f.a.a.j.p ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/a/j/p;->a()Le/f/a/a/j/q;
} // .end method
public void a ( Object p0, Object p1 ) {
/* .locals 3 */
/* .line 15 */
v0 = this.c;
/* .line 16 */
(( e.f.a.a.j.w ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/a/a/j/w;->e()Le/f/a/a/j/x;
(( e.f.a.a.j.w ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/w;->b()Le/f/a/a/c;
(( e.f.a.a.c ) v2 ).c ( ); // invoke-virtual {v2}, Le/f/a/a/c;->c()Le/f/a/a/d;
(( e.f.a.a.j.x ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/a/a/j/x;->a(Le/f/a/a/d;)Le/f/a/a/j/x;
/* .line 17 */
(( e.f.a.a.j.c0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/a/j/c0;->a(Le/f/a/a/j/w;)Le/f/a/a/j/q;
/* .line 18 */
return;
} // .end method
