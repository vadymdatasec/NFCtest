public class e.f.a.a.j.j0.j.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public e.f.a.a.j.l0.a a;
	 public java.util.Map b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Le/f/a/a/d;", */
	 /* "Le/f/a/a/j/j0/j/k;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.a.a.j.j0.j.i ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public e.f.a.a.j.j0.j.i a ( Object p0, Object p1 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
} // .end method
public e.f.a.a.j.j0.j.i a ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
} // .end method
public e.f.a.a.j.j0.j.m a ( ) {
/* .locals 2 */
/* .line 3 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 4 */
	 v0 = 	 v0 = this.b;
	 e.f.a.a.d .values ( );
	 /* array-length v1, v1 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 5 */
	 v0 = this.b;
	 /* .line 6 */
	 /* new-instance v1, Ljava/util/HashMap; */
	 /* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
	 this.b = v1;
	 /* .line 7 */
	 v1 = this.a;
	 e.f.a.a.j.j0.j.m .a ( v1,v0 );
	 /* .line 8 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Not all priorities have been configured"; // const-string v1, "Not all priorities have been configured"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 9 */
} // :cond_1
/* new-instance v0, Ljava/lang/NullPointerException; */
final String v1 = "missing required property: clock"; // const-string v1, "missing required property: clock"
/* invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
