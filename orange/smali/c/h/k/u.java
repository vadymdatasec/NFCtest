public class c.h.k.u implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Runnable;" */
	 /* } */
} // .end annotation
/* # instance fields */
public java.util.concurrent.Callable b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/concurrent/Callable<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public c.h.m.a c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lc/h/m/a<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
public android.os.Handler d;
/* # direct methods */
public c.h.k.u ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/os/Handler;", */
/* "Ljava/util/concurrent/Callable<", */
/* "TT;>;", */
/* "Lc/h/m/a<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p2;
/* .line 3 */
this.c = p3;
/* .line 4 */
this.d = p1;
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :goto_0
v1 = this.c;
/* .line 3 */
v2 = this.d;
/* new-instance v3, Lc/h/k/t; */
/* invoke-direct {v3, p0, v1, v0}, Lc/h/k/t;-><init>(Lc/h/k/u;Lc/h/m/a;Ljava/lang/Object;)V */
(( android.os.Handler ) v2 ).post ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
