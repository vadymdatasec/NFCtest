public abstract class e.h.d.a.a.n.m {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 /* # direct methods */
	 public e.h.d.a.a.n.m ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Integer p0, android.net.Uri p1, java.util.Map p2 ) {
		 /* .locals 8 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(I", */
		 /* "Landroid/net/Uri;", */
		 /* "Ljava/util/Map<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;)V" */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 v0 = this.a;
	 e.h.d.a.a.n.h .a ( v0 );
	 /* .line 3 */
	 /* new-instance v7, Le/h/d/a/a/n/f; */
	 /* new-instance v5, Le/h/d/a/a/n/k; */
	 /* invoke-direct {v5, p0, p2}, Le/h/d/a/a/n/k;-><init>(Le/h/d/a/a/n/m;Landroid/net/Uri;)V */
	 /* new-instance v6, Le/h/d/a/a/n/j; */
	 /* invoke-direct {v6, p0}, Le/h/d/a/a/n/j;-><init>(Le/h/d/a/a/n/m;)V */
	 /* move-object v1, v7 */
	 /* move-object v2, v0 */
	 /* move v3, p1 */
	 /* move-object v4, p2 */
	 /* invoke-direct/range {v1 ..v6}, Le/h/d/a/a/n/f;-><init>(Le/a/a/s;ILandroid/net/Uri;Le/h/d/a/a/n/k;Le/h/d/a/a/n/j;)V */
	 /* .line 4 */
	 (( e.h.d.a.a.n.f ) v7 ).a ( p3 ); // invoke-virtual {v7, p3}, Le/h/d/a/a/n/f;->a(Ljava/util/Map;)V
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 5 */
	 (( e.a.a.p ) v7 ).a ( p1 ); // invoke-virtual {v7, p1}, Le/a/a/p;->a(Z)Le/a/a/p;
	 /* .line 6 */
	 /* new-instance p1, Le/h/d/a/a/n/l; */
	 /* invoke-direct {p1}, Le/h/d/a/a/n/l;-><init>()V */
	 (( e.a.a.p ) v7 ).a ( p1 ); // invoke-virtual {v7, p1}, Le/a/a/p;->a(Le/a/a/x;)Le/a/a/p;
	 /* .line 7 */
	 (( e.a.a.s ) v0 ).a ( v7 ); // invoke-virtual {v0, v7}, Le/a/a/s;->a(Le/a/a/p;)Le/a/a/p;
	 return;
} // .end method
public abstract void a ( android.net.Uri p0, java.lang.String p1 ) {
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/g/u/e;, */
	 /* Lorg/json/JSONException;, */
	 /* Le/h/d/a/a/n/e; */
	 /* } */
} // .end annotation
} // .end method
public void a ( android.net.Uri p0, java.util.Map p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/net/Uri;", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
(( e.h.d.a.a.n.m ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/n/m;->c(Landroid/net/Uri;Ljava/util/Map;)Landroid/net/Uri;
int p2 = 0; // const/4 p2, 0x0
int v0 = 0; // const/4 v0, 0x0
(( e.h.d.a.a.n.m ) p0 ).a ( p2, p1, v0 ); // invoke-virtual {p0, p2, p1, v0}, Le/h/d/a/a/n/m;->a(ILandroid/net/Uri;Ljava/util/Map;)V
return;
} // .end method
public abstract void a ( java.lang.Throwable p0 ) {
} // .end method
public void b ( android.net.Uri p0, java.util.Map p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/net/Uri;", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
int v0 = 2; // const/4 v0, 0x2
/* .line 1 */
(( e.h.d.a.a.n.m ) p0 ).a ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Le/h/d/a/a/n/m;->a(ILandroid/net/Uri;Ljava/util/Map;)V
return;
} // .end method
public final android.net.Uri c ( android.net.Uri p0, java.util.Map p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/net/Uri;", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Landroid/net/Uri;" */
/* } */
} // .end annotation
/* if-nez p2, :cond_0 */
/* .line 1 */
} // :cond_0
(( android.net.Uri ) p1 ).toString ( ); // invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;
android.net.Uri .parse ( p1 );
(( android.net.Uri ) p1 ).buildUpon ( ); // invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;
/* .line 2 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 3 */
/* check-cast v1, Ljava/lang/String; */
/* check-cast v0, Ljava/lang/String; */
(( android.net.Uri$Builder ) p1 ).appendQueryParameter ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 4 */
} // :cond_1
(( android.net.Uri$Builder ) p1 ).build ( ); // invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
} // .end method
