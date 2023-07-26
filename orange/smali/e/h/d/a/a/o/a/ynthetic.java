public abstract class ynthetic {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( android.content.Context p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/h/a/a; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = 	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isConditionToBeginTransactionReached ( p0 ); // invoke-virtual {p1, p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isConditionToBeginTransactionReached(Landroid/content/Context;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 return;
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance v0, Le/h/d/a/a/r/a; */
	 /* invoke-direct {v0, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
	 int v1 = 0; // const/4 v1, 0x0
	 (( e.h.d.a.a.r.a ) v0 ).a ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
	 /* .line 3 */
	 /* new-instance p0, Lcom/orange/oab/contactless/packid/h/a/a; */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Condition to begin transaction is not satisfied : "; // const-string v1, "Condition to begin transaction is not satisfied : "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getConditionToBeginTransaction ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 v0 = e.h.d.a.a.o.a.b.e;
	 int v1 = 1; // const/4 v1, 0x1
	 /* invoke-direct {p0, p1, v0, v1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V */
	 /* throw p0 */
} // .end method
