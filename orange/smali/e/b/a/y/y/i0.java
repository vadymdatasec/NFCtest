public class e.b.a.y.y.i0 implements e.b.a.y.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.y.k0 b;
	 public final java.net.URL c;
	 public final java.lang.String d;
	 public java.lang.String e;
	 public java.net.URL f;
	 public volatile g;
	 public Integer h;
	 /* # direct methods */
	 public e.b.a.y.y.i0 ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = e.b.a.y.y.k0.a;
		 /* invoke-direct {p0, p1, v0}, Le/b/a/y/y/i0;-><init>(Ljava/lang/String;Le/b/a/y/y/k0;)V */
		 return;
	 } // .end method
	 public e.b.a.y.y.i0 ( ) {
		 /* .locals 1 */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 8 */
		 this.c = v0;
		 /* .line 9 */
		 e.b.a.e0.r .a ( p1 );
		 this.d = p1;
		 /* .line 10 */
		 e.b.a.e0.r .a ( p2 );
		 /* check-cast p2, Le/b/a/y/y/k0; */
		 this.b = p2;
		 return;
	 } // .end method
	 public e.b.a.y.y.i0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.b.a.y.y.k0.a;
		 /* invoke-direct {p0, p1, v0}, Le/b/a/y/y/i0;-><init>(Ljava/net/URL;Le/b/a/y/y/k0;)V */
		 return;
	 } // .end method
	 public e.b.a.y.y.i0 ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 4 */
		 e.b.a.e0.r .a ( p1 );
		 /* check-cast p1, Ljava/net/URL; */
		 this.c = p1;
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 5 */
		 this.d = p1;
		 /* .line 6 */
		 e.b.a.e0.r .a ( p2 );
		 /* check-cast p2, Le/b/a/y/y/k0; */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.d;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 v0 = this.c;
		 e.b.a.e0.r .a ( v0 );
		 /* check-cast v0, Ljava/net/URL; */
		 (( java.net.URL ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;
	 } // :goto_0
} // .end method
public void a ( java.security.MessageDigest p0 ) {
	 /* .locals 1 */
	 /* .line 2 */
	 (( e.b.a.y.y.i0 ) p0 ).b ( ); // invoke-virtual {p0}, Le/b/a/y/y/i0;->b()[B
	 (( java.security.MessageDigest ) p1 ).update ( v0 ); // invoke-virtual {p1, v0}, Ljava/security/MessageDigest;->update([B)V
	 return;
} // .end method
public final b ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.g;
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 (( e.b.a.y.y.i0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/y/y/i0;->a()Ljava/lang/String;
	 v1 = e.b.a.y.n.a;
	 (( java.lang.String ) v0 ).getBytes ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
	 this.g = v0;
	 /* .line 3 */
} // :cond_0
v0 = this.g;
} // .end method
public java.util.Map c ( ) {
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
/* .line 1 */
v0 = this.b;
} // .end method
public final java.lang.String d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
v0 = this.d;
/* .line 3 */
v1 = android.text.TextUtils .isEmpty ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 4 */
	 v0 = this.c;
	 e.b.a.e0.r .a ( v0 );
	 /* check-cast v0, Ljava/net/URL; */
	 (( java.net.URL ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;
} // :cond_0
final String v1 = "@#&=*+-_.,:!?()/~\'%;$"; // const-string v1, "@#&=*+-_.,:!?()/~\'%;$"
/* .line 5 */
android.net.Uri .encode ( v0,v1 );
this.e = v0;
/* .line 6 */
} // :cond_1
v0 = this.e;
} // .end method
public final java.net.URL e ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.f;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Ljava/net/URL; */
(( e.b.a.y.y.i0 ) p0 ).d ( ); // invoke-virtual {p0}, Le/b/a/y/y/i0;->d()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
this.f = v0;
/* .line 3 */
} // :cond_0
v0 = this.f;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Le/b/a/y/y/i0; */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Le/b/a/y/y/i0; */
/* .line 3 */
(( e.b.a.y.y.i0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/y/y/i0;->a()Ljava/lang/String;
(( e.b.a.y.y.i0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/b/a/y/y/i0;->a()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
p1 = this.b;
p1 = (( java.lang.Object ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_0
} // .end method
public java.net.URL f ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.b.a.y.y.i0 ) p0 ).e ( ); // invoke-virtual {p0}, Le/b/a/y/y/i0;->e()Ljava/net/URL;
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Le/b/a/y/y/i0;->h:I */
/* if-nez v0, :cond_0 */
/* .line 2 */
(( e.b.a.y.y.i0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/y/y/i0;->a()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
/* iput v0, p0, Le/b/a/y/y/i0;->h:I */
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 3 */
v1 = this.b;
v1 = (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
/* add-int/2addr v0, v1 */
/* iput v0, p0, Le/b/a/y/y/i0;->h:I */
/* .line 4 */
} // :cond_0
/* iget v0, p0, Le/b/a/y/y/i0;->h:I */
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( e.b.a.y.y.i0 ) p0 ).a ( ); // invoke-virtual {p0}, Le/b/a/y/y/i0;->a()Ljava/lang/String;
} // .end method
