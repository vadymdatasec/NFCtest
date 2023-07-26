public class e.b.a.y.y.a2 implements e.b.a.y.y.w0 {
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
public final e.b.a.y.y.y1 a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/y1<", */
/* "TData;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.y.y.a2 ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/util/HashSet; */
final String v1 = "file"; // const-string v1, "file"
final String v2 = "content"; // const-string v2, "content"
final String v3 = "android.resource"; // const-string v3, "android.resource"
/* filled-new-array {v1, v2, v3}, [Ljava/lang/String; */
/* .line 2 */
java.util.Arrays .asList ( v1 );
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
/* .line 3 */
java.util.Collections .unmodifiableSet ( v0 );
return;
} // .end method
public e.b.a.y.y.a2 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/y/y1<", */
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
/* .locals 0 */
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
/* new-instance p2, Le/b/a/y/y/v0; */
/* new-instance p3, Le/b/a/d0/d; */
/* invoke-direct {p3, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V */
p4 = this.a;
/* invoke-direct {p2, p3, p1}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V */
} // .end method
public e.b.a.y.y.v0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/net/Uri; */
(( e.b.a.y.y.a2 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/a2;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/y/v0;
} // .end method
public Boolean a ( android.net.Uri p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = e.b.a.y.y.a2.b;
p1 = (( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
} // .end method
public Boolean a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Landroid/net/Uri; */
p1 = (( e.b.a.y.y.a2 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/a2;->a(Landroid/net/Uri;)Z
} // .end method
