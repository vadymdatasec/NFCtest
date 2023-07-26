public class e.b.a.y.y.c2 implements e.b.a.y.y.w0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<Data:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/y/w0<", */
	 /* "Landroid/net/Uri;", */
	 /* "TData;>;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.util.Set b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final e.b.a.y.y.w0 a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/w0<", */
/* "Le/b/a/y/y/i0;", */
/* "TData;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.y.y.c2 ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/util/HashSet; */
final String v1 = "http"; // const-string v1, "http"
final String v2 = "https"; // const-string v2, "https"
/* filled-new-array {v1, v2}, [Ljava/lang/String; */
/* .line 2 */
java.util.Arrays .asList ( v1 );
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
java.util.Collections .unmodifiableSet ( v0 );
return;
} // .end method
public e.b.a.y.y.c2 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/y/w0<", */
/* "Le/b/a/y/y/i0;", */
/* "TData;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public e.b.a.y.y.v0 a ( android.net.Uri p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/net/Uri;", */
/* "II", */
/* "Le/b/a/y/r;", */
/* ")", */
/* "Le/b/a/y/y/v0<", */
/* "TData;>;" */
/* } */
} // .end annotation
/* .line 3 */
/* new-instance v0, Le/b/a/y/y/i0; */
(( android.net.Uri ) p1 ).toString ( ); // invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Le/b/a/y/y/i0;-><init>(Ljava/lang/String;)V */
/* .line 4 */
p1 = this.a;
} // .end method
public e.b.a.y.y.v0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/net/Uri; */
(( e.b.a.y.y.c2 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/c2;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/y/v0;
} // .end method
public Boolean a ( android.net.Uri p0 ) {
/* .locals 1 */
/* .line 5 */
v0 = e.b.a.y.y.c2.b;
p1 = (( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
} // .end method
public Boolean a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Landroid/net/Uri; */
p1 = (( e.b.a.y.y.c2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/c2;->a(Landroid/net/Uri;)Z
} // .end method
