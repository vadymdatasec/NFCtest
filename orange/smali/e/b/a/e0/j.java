public class e.b.a.e0.j implements e.b.a.e0.k {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/e0/k<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public volatile java.lang.Object a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.e0.k b; //synthetic
/* # direct methods */
public e.b.a.e0.j ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.Object get ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_1 */
/* .line 2 */
/* monitor-enter p0 */
/* .line 3 */
try { // :try_start_0
v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 4 */
v0 = this.b;
e.b.a.e0.r .a ( v0 );
this.a = v0;
/* .line 5 */
} // :cond_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
/* .line 6 */
} // :cond_1
} // :goto_0
v0 = this.a;
} // .end method
