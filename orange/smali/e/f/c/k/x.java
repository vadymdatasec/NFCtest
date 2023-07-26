public class e.f.c.k.x implements e.f.c.r.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/f/c/r/a<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.Object c;
/* # instance fields */
public volatile java.lang.Object a;
public volatile e.f.c.r.a b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/c/r/a<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.c.k.x ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public e.f.c.k.x ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/r/a<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
v0 = e.f.c.k.x.c;
this.a = v0;
/* .line 3 */
this.b = p1;
return;
} // .end method
/* # virtual methods */
public java.lang.Object get ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
/* .line 2 */
v1 = e.f.c.k.x.c;
/* if-ne v0, v1, :cond_1 */
/* .line 3 */
/* monitor-enter p0 */
/* .line 4 */
try { // :try_start_0
v0 = this.a;
/* .line 5 */
v1 = e.f.c.k.x.c;
/* if-ne v0, v1, :cond_0 */
/* .line 6 */
v0 = this.b;
/* .line 7 */
this.a = v0;
int v1 = 0; // const/4 v1, 0x0
/* .line 8 */
this.b = v1;
/* .line 9 */
} // :cond_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // :cond_1
} // :goto_0
} // .end method
