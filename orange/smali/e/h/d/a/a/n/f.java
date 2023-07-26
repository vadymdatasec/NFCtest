public class e.h.d.a.a.n.f extends e.a.a.c0.s {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.a.a.s t;
	 public final e.h.d.a.a.n.k u;
	 public final e.h.d.a.a.n.j v;
	 public java.util.Map w;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.h.d.a.a.n.f ( ) {
/* .locals 0 */
/* .line 1 */
(( android.net.Uri ) p3 ).toString ( ); // invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;
/* invoke-direct {p0, p2, p3, p4, p5}, Le/a/a/c0/s;-><init>(ILjava/lang/String;Le/a/a/u;Le/a/a/t;)V */
/* .line 2 */
this.t = p1;
/* .line 3 */
this.u = p4;
/* .line 4 */
this.v = p5;
return;
} // .end method
/* # virtual methods */
public e.a.a.v a ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/l;", */
/* ")", */
/* "Le/a/a/v<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 9 */
/* new-instance v0, Ljava/lang/String; */
v1 = this.b;
v2 = this.c;
(( e.h.d.a.a.n.f ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/n/f;->b(Ljava/util/Map;)Ljava/nio/charset/Charset;
/* invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
/* .line 10 */
e.a.a.c0.j .a ( p1 );
e.a.a.v .a ( v0,p1 );
} // .end method
public void a ( com.android.volley.VolleyError p0 ) {
/* .locals 8 */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v1, v0, Le/a/a/l;->a:I */
/* const/16 v2, 0x12f */
/* if-ne v1, v2, :cond_0 */
/* .line 3 */
p1 = this.c;
final String v0 = "Location"; // const-string v0, "Location"
/* check-cast p1, Ljava/lang/String; */
/* .line 4 */
v0 = this.u;
android.net.Uri .parse ( p1 );
(( e.h.d.a.a.n.k ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/n/k;->a(Landroid/net/Uri;)V
/* .line 5 */
/* new-instance v0, Le/h/d/a/a/n/f; */
v3 = this.t;
android.net.Uri .parse ( p1 );
v6 = this.u;
v7 = this.v;
int v4 = 0; // const/4 v4, 0x0
/* move-object v2, v0 */
/* invoke-direct/range {v2 ..v7}, Le/h/d/a/a/n/f;-><init>(Le/a/a/s;ILandroid/net/Uri;Le/h/d/a/a/n/k;Le/h/d/a/a/n/j;)V */
/* .line 6 */
p1 = (( e.a.a.p ) p0 ).u ( ); // invoke-virtual {p0}, Le/a/a/p;->u()Z
(( e.a.a.p ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/a/a/p;->a(Z)Le/a/a/p;
/* .line 7 */
p1 = this.t;
(( e.a.a.s ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/a/a/s;->a(Le/a/a/p;)Le/a/a/p;
/* .line 8 */
} // :cond_0
/* invoke-super {p0, p1}, Le/a/a/p;->a(Lcom/android/volley/VolleyError;)V */
} // :goto_0
return;
} // .end method
public void a ( java.util.Map p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
this.w = p1;
return;
} // .end method
public final java.nio.charset.Charset b ( java.util.Map p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/nio/charset/Charset;" */
/* } */
} // .end annotation
final String v0 = "Content-Type"; // const-string v0, "Content-Type"
v1 = /* .line 1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v0, Ljava/lang/String; */
final String v1 = "charset"; // const-string v1, "charset"
v0 = (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
e.a.a.c0.j .a ( p1 );
java.nio.charset.Charset .forName ( p1 );
/* .line 3 */
} // :cond_0
p1 = java.nio.charset.StandardCharsets.UTF_8;
} // .end method
public java.util.Map e ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
final String v0 = "NFCOffice-client"; // const-string v0, "NFCOffice-client"
final String v1 = "true"; // const-string v1, "true"
/* .line 1 */
java.util.Collections .singletonMap ( v0,v1 );
} // .end method
public java.util.Map g ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/android/volley/AuthFailureError; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.w;
} // .end method
