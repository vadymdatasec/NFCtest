public class e.b.a.y.y.d2.d implements e.b.a.y.y.w0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/y/w0<", */
	 /* "Landroid/net/Uri;", */
	 /* "Ljava/io/InputStream;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.content.Context a;
/* # direct methods */
public e.b.a.y.y.d2.d ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 (( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
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
	 /* "Ljava/io/InputStream;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .line 3 */
p2 = e.b.a.y.w.w.b .a ( p2,p3 );
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 4 */
	 /* new-instance p2, Le/b/a/y/y/v0; */
	 /* new-instance p3, Le/b/a/d0/d; */
	 /* invoke-direct {p3, p1}, Le/b/a/d0/d;-><init>(Ljava/lang/Object;)V */
	 p4 = this.a;
	 e.b.a.y.w.w.e .a ( p4,p1 );
	 /* invoke-direct {p2, p3, p1}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public e.b.a.y.y.v0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Landroid/net/Uri; */
(( e.b.a.y.y.d2.d ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/d2/d;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/y/v0;
} // .end method
public Boolean a ( android.net.Uri p0 ) {
/* .locals 0 */
/* .line 5 */
p1 = e.b.a.y.w.w.b .a ( p1 );
} // .end method
public Boolean a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Landroid/net/Uri; */
p1 = (( e.b.a.y.y.d2.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/d2/d;->a(Landroid/net/Uri;)Z
} // .end method
