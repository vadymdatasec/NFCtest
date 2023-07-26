public class e.h.d.a.a.s.k0.x extends e.h.d.a.a.s.k0.z {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/h/d/a/a/s/k0/z<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final fr.mbs.binary.Octets c;
/* # direct methods */
public e.h.d.a.a.s.k0.x ( ) {
	 /* .locals 1 */
	 final String v0 = "badge"; // const-string v0, "badge"
	 /* .line 1 */
	 /* invoke-direct {p0, p2, v0}, Le/h/d/a/a/s/k0/z;-><init>(Ljava/lang/Object;Ljava/lang/String;)V */
	 /* .line 2 */
	 this.c = p1;
	 return;
} // .end method
/* # virtual methods */
public android.content.ContentValues a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
	 /* .locals 2 */
	 /* .line 2 */
	 /* new-instance v0, Le/h/d/a/a/s/k0/b; */
	 int v1 = 1; // const/4 v1, 0x1
	 /* invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/b;-><init>(Z)V */
	 v1 = this.c;
	 (( e.h.d.a.a.s.k0.b ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Le/h/d/a/a/s/k0/b;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Landroid/content/ContentValues;
} // .end method
public android.content.ContentValues a ( java.lang.Object p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
	 (( e.h.d.a.a.s.k0.x ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/x;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Landroid/content/ContentValues;
} // .end method
