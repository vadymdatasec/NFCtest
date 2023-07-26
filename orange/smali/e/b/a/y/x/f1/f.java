public abstract class e.b.a.y.x.f1.f {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T::", */
	 /* "Le/b/a/y/x/f1/t;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.Queue a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Queue<", */
/* "TT;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.x.f1.f ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* const/16 v0, 0x14 */
/* .line 2 */
e.b.a.e0.t .a ( v0 );
this.a = v0;
return;
} // .end method
/* # virtual methods */
public abstract e.b.a.y.x.f1.t a ( ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)V" */
/* } */
} // .end annotation
/* .line 1 */
v0 = v0 = this.a;
/* const/16 v1, 0x14 */
/* if-ge v0, v1, :cond_0 */
/* .line 2 */
v0 = this.a;
} // :cond_0
return;
} // .end method
public e.b.a.y.x.f1.t b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TT;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
/* check-cast v0, Le/b/a/y/x/f1/t; */
/* if-nez v0, :cond_0 */
/* .line 2 */
(( e.b.a.y.x.f1.f ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/y/x/f1/f;->a()Le/b/a/y/x/f1/t;
} // :cond_0
} // .end method
