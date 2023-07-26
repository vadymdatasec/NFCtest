public class e.f.a.c.s.u {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.ref.WeakReference a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Le/f/a/c/s/t;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Integer b;
public Boolean c;
/* # direct methods */
public e.f.a.c.s.u ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
/* .line 3 */
/* iput p1, p0, Le/f/a/c/s/u;->b:I */
return;
} // .end method
/* # virtual methods */
public Boolean a ( Object p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 1 */
	 v0 = this.a;
	 (( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
	 /* if-ne v0, p1, :cond_0 */
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
