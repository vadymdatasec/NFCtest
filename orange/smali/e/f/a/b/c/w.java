public abstract class e.f.a.b.c.w extends e.f.a.b.c.u {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.ref.WeakReference c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "[B>;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
public java.lang.ref.WeakReference b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference<", */
/* "[B>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.f.a.b.c.w ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
return;
} // .end method
public e.f.a.b.c.w ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Le/f/a/b/c/u;-><init>([B)V */
/* .line 2 */
p1 = e.f.a.b.c.w.c;
this.b = p1;
return;
} // .end method
/* # virtual methods */
public final e ( ) {
/* .locals 2 */
/* .line 1 */
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
v0 = this.b;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, [B */
/* if-nez v0, :cond_0 */
/* .line 3 */
(( e.f.a.b.c.w ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/a/b/c/w;->f()[B
/* .line 4 */
/* new-instance v1, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.b = v1;
/* .line 5 */
} // :cond_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 6 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public abstract f ( ) {
} // .end method
