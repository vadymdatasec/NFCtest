public class e.h.d.a.a.n.k implements e.a.a.u {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/a/a/u<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.net.Uri a;
public android.net.Uri b;
public final e.h.d.a.a.n.m c; //synthetic
/* # direct methods */
public e.h.d.a.a.n.k ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.c = p1;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.a = p2;
	 return;
} // .end method
/* # virtual methods */
public void a ( android.net.Uri p0 ) {
	 /* .locals 0 */
	 /* .line 4 */
	 this.b = p1;
	 return;
} // .end method
public void a ( java.lang.Object p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 3 */
	 /* check-cast p1, Ljava/lang/String; */
	 (( e.h.d.a.a.n.k ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/k;->a(Ljava/lang/String;)V
	 return;
} // .end method
public void a ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.c;
		 v1 = this.b;
		 /* if-nez v1, :cond_0 */
		 v1 = this.a;
	 } // :cond_0
	 v1 = this.b;
} // :goto_0
(( e.h.d.a.a.n.m ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/h/d/a/a/n/m;->a(Landroid/net/Uri;Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 2 */
v0 = this.c;
(( e.h.d.a.a.n.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/n/m;->a(Ljava/lang/Throwable;)V
} // :goto_1
return;
} // .end method
