public class e.b.a.y.y.d implements e.b.a.y.y.w0 {
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
public static final Integer c;
/* # instance fields */
public final android.content.res.AssetManager a;
public final e.b.a.y.y.a b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/a<", */
/* "TData;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.y.y.d ( ) {
/* .locals 0 */
return;
} // .end method
public e.b.a.y.y.d ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/res/AssetManager;", */
/* "Le/b/a/y/y/a<", */
/* "TData;>;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
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
(( android.net.Uri ) p1 ).toString ( ); // invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;
(( java.lang.String ) p2 ).substring ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 4 */
/* new-instance p3, Le/b/a/y/y/v0; */
/* new-instance p4, Le/b/a/d0/d; */
/* invoke-direct {p4, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V */
p1 = this.b;
v0 = this.a;
/* invoke-direct {p3, p4, p1}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V */
} // .end method
public e.b.a.y.y.v0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/net/Uri; */
(( e.b.a.y.y.d ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/d;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/y/v0;
} // .end method
public Boolean a ( android.net.Uri p0 ) {
/* .locals 2 */
/* .line 5 */
(( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v1 = "file"; // const-string v1, "file"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
v0 = (( android.net.Uri ) p1 ).getPathSegments ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;
/* if-nez v0, :cond_0 */
/* .line 7 */
(( android.net.Uri ) p1 ).getPathSegments ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;
final String v0 = "android_asset"; // const-string v0, "android_asset"
p1 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
public Boolean a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Landroid/net/Uri; */
p1 = (( e.b.a.y.y.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/d;->a(Landroid/net/Uri;)Z
} // .end method
