public class e.b.a.y.y.d2.b implements e.b.a.y.y.w0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/y/w0<", */
	 /* "Le/b/a/y/y/i0;", */
	 /* "Ljava/io/InputStream;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.b.a.y.q b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/q<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final e.b.a.y.y.u0 a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/y/u0<", */
/* "Le/b/a/y/y/i0;", */
/* "Le/b/a/y/y/i0;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.y.y.d2.b ( ) {
/* .locals 2 */
/* const/16 v0, 0x9c4 */
/* .line 1 */
java.lang.Integer .valueOf ( v0 );
final String v1 = "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"; // const-string v1, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"
e.b.a.y.q .a ( v1,v0 );
return;
} // .end method
public e.b.a.y.y.d2.b ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/y/u0<", */
/* "Le/b/a/y/y/i0;", */
/* "Le/b/a/y/y/i0;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public e.b.a.y.y.v0 a ( e.b.a.y.y.i0 p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/y/i0;", */
/* "II", */
/* "Le/b/a/y/r;", */
/* ")", */
/* "Le/b/a/y/y/v0<", */
/* "Ljava/io/InputStream;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 3 */
p2 = this.a;
if ( p2 != null) { // if-eqz p2, :cond_1
int p3 = 0; // const/4 p3, 0x0
/* .line 4 */
(( e.b.a.y.y.u0 ) p2 ).a ( p1, p3, p3 ); // invoke-virtual {p2, p1, p3, p3}, Le/b/a/y/y/u0;->a(Ljava/lang/Object;II)Ljava/lang/Object;
/* check-cast p2, Le/b/a/y/y/i0; */
/* if-nez p2, :cond_0 */
/* .line 5 */
p2 = this.a;
(( e.b.a.y.y.u0 ) p2 ).a ( p1, p3, p3, p1 ); // invoke-virtual {p2, p1, p3, p3, p1}, Le/b/a/y/y/u0;->a(Ljava/lang/Object;IILjava/lang/Object;)V
} // :cond_0
/* move-object p1, p2 */
/* .line 6 */
} // :cond_1
} // :goto_0
p2 = e.b.a.y.y.d2.b.b;
(( e.b.a.y.r ) p4 ).a ( p2 ); // invoke-virtual {p4, p2}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
/* check-cast p2, Ljava/lang/Integer; */
p2 = (( java.lang.Integer ) p2 ).intValue ( ); // invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I
/* .line 7 */
/* new-instance p3, Le/b/a/y/y/v0; */
/* new-instance p4, Le/b/a/y/w/p; */
/* invoke-direct {p4, p1, p2}, Le/b/a/y/w/p;-><init>(Le/b/a/y/y/i0;I)V */
/* invoke-direct {p3, p1, p4}, Le/b/a/y/y/v0;-><init>(Le/b/a/y/n;Le/b/a/y/w/e;)V */
} // .end method
public e.b.a.y.y.v0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Le/b/a/y/y/i0; */
(( e.b.a.y.y.d2.b ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/y/d2/b;->a(Le/b/a/y/y/i0;IILe/b/a/y/r;)Le/b/a/y/y/v0;
} // .end method
public Boolean a ( e.b.a.y.y.i0 p0 ) {
/* .locals 0 */
int p1 = 1; // const/4 p1, 0x1
} // .end method
public Boolean a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 2 */
/* check-cast p1, Le/b/a/y/y/i0; */
p1 = (( e.b.a.y.y.d2.b ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/y/d2/b;->a(Le/b/a/y/y/i0;)Z
} // .end method
