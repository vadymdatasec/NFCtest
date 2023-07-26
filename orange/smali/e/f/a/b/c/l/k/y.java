public abstract class e.f.a.b.c.l.k.y extends e.f.a.b.c.l.k.u {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Le/f/a/b/c/l/k/u;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.f.a.b.h.h a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/a/b/h/h<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.a.b.c.l.k.y ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Le/f/a/b/h/h<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0, p1}, Le/f/a/b/c/l/k/u;-><init>(I)V */
/* .line 2 */
this.a = p2;
return;
} // .end method
/* # virtual methods */
public void a ( com.google.android.gms.common.api.Status p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* new-instance v1, Lcom/google/android/gms/common/api/ApiException; */
/* invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V */
(( e.f.a.b.h.h ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Exception;)Z
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/b/c/l/k/c<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/DeadObjectException; */
/* } */
} // .end annotation
/* .line 3 */
try { // :try_start_0
(( e.f.a.b.c.l.k.y ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/y;->d(Le/f/a/b/c/l/k/c;)V
/* :try_end_0 */
/* .catch Landroid/os/DeadObjectException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Landroid/os/RemoteException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
/* .line 4 */
(( e.f.a.b.c.l.k.y ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/y;->a(Ljava/lang/RuntimeException;)V
return;
/* :catch_1 */
/* move-exception p1 */
/* .line 5 */
e.f.a.b.c.l.k.o .b ( p1 );
(( e.f.a.b.c.l.k.y ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/y;->a(Lcom/google/android/gms/common/api/Status;)V
return;
/* :catch_2 */
/* move-exception p1 */
/* .line 6 */
e.f.a.b.c.l.k.o .b ( p1 );
(( e.f.a.b.c.l.k.y ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/b/c/l/k/y;->a(Lcom/google/android/gms/common/api/Status;)V
/* .line 7 */
/* throw p1 */
} // .end method
public void a ( java.lang.RuntimeException p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.a;
(( e.f.a.b.h.h ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/f/a/b/h/h;->b(Ljava/lang/Exception;)Z
return;
} // .end method
public abstract void d ( Object p0 ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/b/c/l/k/c<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/os/RemoteException; */
/* } */
} // .end annotation
} // .end method
