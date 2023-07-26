public class com.orange.oab.contactless.packid.ble.ContactlessTransaction$a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final android.content.Context b;
public com.orange.oab.contactless.packid.hce.user.User c;
public final com.orange.oab.contactless.packid.hce.user.wallet.Badge d;
/* # direct methods */
public com.orange.oab.contactless.packid.ble.ContactlessTransaction$a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
this.c = p2;
/* .line 4 */
this.d = p3;
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.b;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
v1 = this.c;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getContactlessId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
v2 = this.d;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getZoneId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.r.a ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/h/d/a/a/r/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
/* .line 2 */
try { // :try_start_0
	 /* new-instance v0, Le/h/d/a/a/n/n; */
	 v1 = this.b;
	 v2 = this.d;
	 /* invoke-direct {v0, v1, v2}, Le/h/d/a/a/n/n;-><init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V */
	 (( e.h.d.a.a.n.n ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/n/n;->a()V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 3 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Can\'t update token to server: "; // const-string v2, "Can\'t update token to server: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v1 = "packid.contacless"; // const-string v1, "packid.contacless"
	 android.util.Log .e ( v1,v0 );
} // :goto_0
return;
} // .end method
