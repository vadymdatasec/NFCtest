public class e.b.a.l {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/Class<", */
	 /* "*>;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.l ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* .line 3 */
e.b.a.k .a ( p1 );
/* invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V */
java.util.Collections .unmodifiableMap ( v0 );
this.a = p1;
return;
} // .end method
/* # virtual methods */
public Boolean a ( java.lang.Class p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "+", */
/* "Ljava/lang/Object;", */
/* ">;)Z" */
/* } */
} // .end annotation
/* .line 1 */
p1 = v0 = this.a;
} // .end method
