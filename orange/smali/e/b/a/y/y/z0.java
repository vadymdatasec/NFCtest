public class e.b.a.y.y.z0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;", */
	 /* "Le/b/a/y/y/y0<", */
	 /* "*>;>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.y.z0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public java.util.List a ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Model:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TModel;>;)", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/y/w0<", */
/* "TModel;*>;>;" */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.a;
/* check-cast p1, Le/b/a/y/y/y0; */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
} // :cond_0
p1 = this.a;
} // :goto_0
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
return;
} // .end method
public void a ( java.lang.Class p0, java.util.List p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<Model:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/lang/Class<", */
/* "TModel;>;", */
/* "Ljava/util/List<", */
/* "Le/b/a/y/y/w0<", */
/* "TModel;*>;>;)V" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.a;
/* new-instance v1, Le/b/a/y/y/y0; */
/* invoke-direct {v1, p2}, Le/b/a/y/y/y0;-><init>(Ljava/util/List;)V */
/* check-cast p2, Le/b/a/y/y/y0; */
/* if-nez p2, :cond_0 */
return;
/* .line 3 */
} // :cond_0
/* new-instance p2, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Already cached loaders for model: "; // const-string v1, "Already cached loaders for model: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
