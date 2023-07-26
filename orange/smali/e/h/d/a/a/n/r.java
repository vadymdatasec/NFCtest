public class e.h.d.a.a.n.r {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public java.util.List b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.lang.String c;
public e.h.d.a.a.p.a.a.a d;
/* # direct methods */
public e.h.d.a.a.n.r ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Le/h/d/a/a/p/a/a/a; */
/* invoke-direct {v0}, Le/h/d/a/a/p/a/a/a;-><init>()V */
this.d = v0;
/* .line 3 */
this.a = p1;
return;
} // .end method
public static void a ( Object p0, com.orange.oab.contactless.packid.hce.user.User p1, Object p2, Boolean p3, Boolean p4 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.n.r ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/h/d/a/a/n/r;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Le/h/d/a/a/p/a/a/a;ZZ)V
return;
} // .end method
/* # virtual methods */
public final java.util.List a ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 5 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 6 */
v1 = this.a;
e.h.d.a.a.s.m .c ( v1 );
(( e.h.d.a.a.s.g0 ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;
/* .line 7 */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 8 */
v3 = (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).isDefault ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z
/* if-nez v3, :cond_0 */
/* .line 9 */
} // :cond_1
} // .end method
public final void a ( android.content.Context p0, Boolean p1, Boolean p2, java.lang.String p3 ) {
/* .locals 2 */
/* .line 10 */
v0 = v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 11 */
com.orange.oab.contactless.packid.service.Aid .register ( p1 );
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 12 */
/* new-instance p1, Le/h/d/a/a/r/a; */
p2 = this.a;
/* invoke-direct {p1, p2}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
p2 = this.d;
(( e.h.d.a.a.r.a ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/h/d/a/a/r/a;->a(Le/h/d/a/a/p/a/a/a;)V
} // :cond_0
return;
/* .line 13 */
} // :cond_1
try { // :try_start_0
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 14 */
/* new-instance v1, Le/h/d/a/a/n/q; */
/* invoke-direct {v1, p0, p1, v0, p3}, Le/h/d/a/a/n/q;-><init>(Le/h/d/a/a/n/r;Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Z)V */
/* .line 15 */
(( e.h.d.a.a.n.p ) v1 ).a ( v0, p2, p4 ); // invoke-virtual {v1, v0, p2, p4}, Le/h/d/a/a/n/p;->a(Lcom/orange/oab/contactless/packid/hce/user/User;ZLjava/lang/String;)V
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p2 */
/* .line 16 */
/* new-instance p3, Le/h/d/a/a/r/a; */
/* invoke-direct {p3, p1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.r.a ) p3 ).a ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Le/h/d/a/a/r/a;->a(ILjava/lang/Throwable;)V
} // :goto_0
return;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.User p0, Object p1, Boolean p2, Boolean p3 ) {
/* .locals 1 */
/* .line 17 */
v0 = this.b;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 18 */
p1 = this.d;
(( e.h.d.a.a.p.a.a.a ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/h/d/a/a/p/a/a/a;->a(Le/h/d/a/a/p/a/a/a;)V
/* .line 19 */
} // :cond_0
p1 = this.a;
p2 = this.c;
(( e.h.d.a.a.n.r ) p0 ).a ( p1, p3, p4, p2 ); // invoke-virtual {p0, p1, p3, p4, p2}, Le/h/d/a/a/n/r;->a(Landroid/content/Context;ZZLjava/lang/String;)V
return;
} // .end method
public void a ( Boolean p0, Boolean p1, java.lang.String p2 ) {
/* .locals 1 */
/* .line 2 */
(( e.h.d.a.a.n.r ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/r;->a()Ljava/util/List;
this.b = v0;
/* .line 3 */
this.c = p3;
/* .line 4 */
v0 = this.a;
(( e.h.d.a.a.n.r ) p0 ).a ( v0, p1, p2, p3 ); // invoke-virtual {p0, v0, p1, p2, p3}, Le/h/d/a/a/n/r;->a(Landroid/content/Context;ZZLjava/lang/String;)V
return;
} // .end method
