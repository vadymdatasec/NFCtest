public abstract class e.f.a.d.a.e.b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.f.a.d.a.i.o b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/a/d/a/i/o<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.a.d.a.e.b ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
this.b = v0;
return;
} // .end method
public e.f.a.d.a.e.b ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/d/a/i/o<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.b = p1;
return;
} // .end method
/* # virtual methods */
public abstract void a ( ) {
} // .end method
public final e.f.a.d.a.i.o b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/f/a/d/a/i/o<", */
/* "*>;" */
/* } */
} // .end annotation
v0 = this.b;
} // .end method
public final void run ( ) {
/* .locals 2 */
try { // :try_start_0
(( e.f.a.d.a.e.b ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/d/a/e/b;->a()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
return;
/* :catch_0 */
/* move-exception v0 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
(( e.f.a.d.a.i.o ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V
} // :cond_0
return;
} // .end method
