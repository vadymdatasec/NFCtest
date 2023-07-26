public abstract class e.h.d.a.a.v.g {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* "A:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public i.h.b.l a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Li/h/b/l<", */
/* "-TA;+TT;>;" */
/* } */
} // .end annotation
} // .end field
public volatile java.lang.Object b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TT;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.h.d.a.a.v.g ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Li/h/b/l<", */
/* "-TA;+TT;>;)V" */
/* } */
} // .end annotation
final String v0 = "creator"; // const-string v0, "creator"
i.h.c.k .c ( p1,v0 );
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public final java.lang.Object a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TA;)TT;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* monitor-enter p0 */
/* .line 3 */
try { // :try_start_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
} // :cond_1
v0 = this.a;
i.h.c.k .a ( v0 );
/* .line 5 */
this.b = v0;
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
this.a = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 7 */
} // :goto_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
