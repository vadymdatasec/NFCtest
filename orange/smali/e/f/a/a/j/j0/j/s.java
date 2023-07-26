public class e.f.a.a.j.j0.j.s {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final e.f.a.a.j.g0.g b;
	 public final e.f.a.a.j.j0.k.e c;
	 public final e.f.a.a.j.j0.j.y d;
	 public final java.util.concurrent.Executor e;
	 public final e.f.a.a.j.k0.b f;
	 public final e.f.a.a.j.l0.a g;
	 /* # direct methods */
	 public e.f.a.a.j.j0.j.s ( ) {
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
		 /* .line 7 */
		 this.f = p6;
		 /* .line 8 */
		 this.g = p7;
		 return;
	 } // .end method
	 public static java.lang.Iterable a ( Object p0, Object p1 ) { //synthethic
		 /* .locals 0 */
		 /* .line 29 */
		 p0 = this.c;
	 } // .end method
	 public static java.lang.Object a ( Object p0, Object p1, java.lang.Iterable p2, Object p3, Integer p4 ) { //synthethic
		 /* .locals 5 */
		 /* .line 30 */
		 (( e.f.a.a.j.g0.k ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/g0/k;->b()Le/f/a/a/j/g0/j;
		 v1 = e.f.a.a.j.g0.j.c;
		 int v2 = 1; // const/4 v2, 0x1
		 /* if-ne v0, v1, :cond_0 */
		 /* .line 31 */
		 p1 = this.c;
		 /* .line 32 */
		 p0 = this.d;
		 /* add-int/2addr p4, v2 */
		 /* .line 33 */
	 } // :cond_0
	 p4 = this.c;
	 /* .line 34 */
	 (( e.f.a.a.j.g0.k ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/g0/k;->b()Le/f/a/a/j/g0/j;
	 p4 = e.f.a.a.j.g0.j.b;
	 /* if-ne p2, p4, :cond_1 */
	 /* .line 35 */
	 p2 = this.c;
	 p4 = this.g;
	 /* .line 36 */
	 /* move-result-wide v0 */
	 (( e.f.a.a.j.g0.k ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/g0/k;->a()J
	 /* move-result-wide v3 */
	 /* add-long/2addr v0, v3 */
	 /* .line 37 */
	 /* .line 38 */
} // :cond_1
p1 = p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 39 */
	 p0 = this.d;
} // :cond_2
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.Object a ( Object p0, Object p1, Integer p2 ) { //synthethic
/* .locals 0 */
/* .line 13 */
p0 = this.d;
/* add-int/lit8 p2, p2, 0x1 */
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void a ( Object p0, Object p1, Integer p2, java.lang.Runnable p3 ) { //synthethic
/* .locals 2 */
/* .line 6 */
try { // :try_start_0
v0 = this.f;
v1 = this.c;
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
e.f.a.a.j.j0.j.q .a ( v1 );
/* .line 7 */
v0 = (( e.f.a.a.j.j0.j.s ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/j/s;->a()Z
/* if-nez v0, :cond_0 */
/* .line 8 */
v0 = this.f;
e.f.a.a.j.j0.j.r .a ( p0,p1,p2 );
/* .line 9 */
} // :cond_0
(( e.f.a.a.j.j0.j.s ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/a/j/j0/j/s;->a(Le/f/a/a/j/x;I)V
/* :try_end_0 */
/* .catch Lcom/google/android/datatransport/runtime/synchronization/SynchronizationException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 10 */
/* :catch_0 */
try { // :try_start_1
p0 = this.d;
/* add-int/lit8 p2, p2, 0x1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 11 */
} // :goto_0
return;
} // :goto_1
/* .line 12 */
/* throw p0 */
} // .end method
/* # virtual methods */
public void a ( Object p0, Integer p1 ) {
/* .locals 5 */
/* .line 14 */
v0 = this.b;
(( e.f.a.a.j.x ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;
/* .line 15 */
v1 = this.f;
e.f.a.a.j.j0.j.o .a ( p0,p1 );
/* .line 16 */
/* check-cast v1, Ljava/lang/Iterable; */
v2 = /* .line 17 */
/* if-nez v2, :cond_0 */
return;
} // :cond_0
/* if-nez v0, :cond_1 */
final String v0 = "Uploader"; // const-string v0, "Uploader"
final String v2 = "Unknown backend for %s, deleting event batch for it..."; // const-string v2, "Unknown backend for %s, deleting event batch for it..."
/* .line 18 */
e.f.a.a.j.h0.a .a ( v0,v2,p1 );
/* .line 19 */
e.f.a.a.j.g0.k .c ( );
/* .line 20 */
} // :cond_1
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
/* .line 21 */
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_2
/* check-cast v4, Le/f/a/a/j/j0/k/l; */
/* .line 22 */
(( e.f.a.a.j.j0.k.l ) v4 ).a ( ); // invoke-virtual {v4}, Le/f/a/a/j/j0/k/l;->a()Le/f/a/a/j/q;
/* .line 23 */
} // :cond_2
e.f.a.a.j.g0.i .c ( );
/* .line 24 */
(( e.f.a.a.j.g0.h ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Le/f/a/a/j/g0/h;->a(Ljava/lang/Iterable;)Le/f/a/a/j/g0/h;
/* .line 25 */
(( e.f.a.a.j.x ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->b()[B
(( e.f.a.a.j.g0.h ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Le/f/a/a/j/g0/h;->a([B)Le/f/a/a/j/g0/h;
/* .line 26 */
(( e.f.a.a.j.g0.h ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/a/a/j/g0/h;->a()Le/f/a/a/j/g0/i;
/* .line 27 */
/* .line 28 */
} // :goto_1
v2 = this.f;
e.f.a.a.j.j0.j.p .a ( p0,v0,v1,p1,p2 );
return;
} // .end method
public void a ( Object p0, Integer p1, java.lang.Runnable p2 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.e;
e.f.a.a.j.j0.j.n .a ( p0,p1,p2,p3 );
return;
} // .end method
public Boolean a ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
final String v1 = "connectivity"; // const-string v1, "connectivity"
/* .line 2 */
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/ConnectivityManager; */
/* .line 3 */
(( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v0 = (( android.net.NetworkInfo ) v0 ).isConnected ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
