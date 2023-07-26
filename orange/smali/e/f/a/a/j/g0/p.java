public class e.f.a.a.j.g0.p implements e.f.a.a.j.g0.g {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.f.a.a.j.g0.o a;
	 public final e.f.a.a.j.g0.m b;
	 public final java.util.Map c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Le/f/a/a/j/g0/r;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.a.a.j.g0.p ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Le/f/a/a/j/g0/o; */
/* invoke-direct {v0, p1}, Le/f/a/a/j/g0/o;-><init>(Landroid/content/Context;)V */
/* invoke-direct {p0, v0, p2}, Le/f/a/a/j/g0/p;-><init>(Le/f/a/a/j/g0/o;Le/f/a/a/j/g0/m;)V */
return;
} // .end method
public e.f.a.a.j.g0.p ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.c = v0;
/* .line 4 */
this.a = p1;
/* .line 5 */
this.b = p2;
return;
} // .end method
/* # virtual methods */
public synchronized e.f.a.a.j.g0.r a ( java.lang.String p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
	 v0 = 	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 v0 = this.c;
		 /* check-cast p1, Le/f/a/a/j/g0/r; */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
		 /* .line 3 */
	 } // :cond_0
	 try { // :try_start_1
		 v0 = this.a;
		 (( e.f.a.a.j.g0.o ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/a/j/g0/o;->a(Ljava/lang/String;)Le/f/a/a/j/g0/f;
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* if-nez v0, :cond_1 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 4 */
		 /* monitor-exit p0 */
		 /* .line 5 */
	 } // :cond_1
	 try { // :try_start_2
		 v1 = this.b;
		 (( e.f.a.a.j.g0.m ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/f/a/a/j/g0/m;->a(Ljava/lang/String;)Le/f/a/a/j/g0/l;
		 /* .line 6 */
		 v1 = this.c;
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* .line 7 */
		 /* monitor-exit p0 */
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* monitor-exit p0 */
		 /* throw p1 */
	 } // .end method
