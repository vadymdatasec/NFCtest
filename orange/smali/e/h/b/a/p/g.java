public class e.h.b.a.p.g implements java.util.Comparator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Comparator<", */
	 /* "Le/h/b/a/m/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.h.b.a.p.g ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public e.h.b.a.p.g ( ) { //synthethic
	 /* .locals 0 */
	 /* .line 2 */
	 /* invoke-direct {p0}, Le/h/b/a/p/g;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public Integer a ( Object p0, Object p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = java.lang.String.CASE_INSENSITIVE_ORDER;
	 (( e.h.b.a.m.d ) p1 ).n ( ); // invoke-virtual {p1}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) p1 ).getName ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
	 (( e.h.b.a.m.d ) p2 ).n ( ); // invoke-virtual {p2}, Le/h/b/a/m/d;->n()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
	 p1 = 	 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) p2 ).getName ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
} // .end method
public Integer compare ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p1, Le/h/b/a/m/d; */
	 /* check-cast p2, Le/h/b/a/m/d; */
	 p1 = 	 (( e.h.b.a.p.g ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/b/a/p/g;->a(Le/h/b/a/m/d;Le/h/b/a/m/d;)I
} // .end method
