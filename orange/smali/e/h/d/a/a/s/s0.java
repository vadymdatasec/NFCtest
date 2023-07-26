public class e.h.d.a.a.s.s0 extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.h.d.a.a.s.e a; //synthetic
	 /* # direct methods */
	 public e.h.d.a.a.s.s0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.orange.oab.contactless.packid.hce.user.User a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 4 */
		 /* .line 2 */
		 /* new-instance v0, Le/h/d/a/a/s/p0; */
		 /* invoke-direct {v0}, Le/h/d/a/a/s/p0;-><init>()V */
		 (( e.h.d.a.a.s.k0.o ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
		 v1 = 		 /* .line 3 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :cond_0
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 4 */
		 /* check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
		 /* .line 5 */
		 /* new-instance v1, Le/h/d/a/a/s/q0; */
		 v2 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).getWallet ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v3 ).getId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;
		 /* invoke-direct {v1, v2, v3}, Le/h/d/a/a/s/q0;-><init>(Le/h/d/a/a/s/e;Lfr/mbs/binary/Octets;)V */
		 (( e.h.d.a.a.s.k0.o ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
		 /* .line 6 */
		 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).getWallet ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v2 ).getBadges ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
		 /* .line 7 */
		 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).getTenant ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 8 */
			 /* new-instance v1, Le/h/d/a/a/s/k0/p; */
			 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).getTenant ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v2 ).getName ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
			 /* invoke-direct {v1, v2}, Le/h/d/a/a/s/k0/p;-><init>(Ljava/lang/String;)V */
			 (( e.h.d.a.a.s.k0.p ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/p;->b(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
			 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setTenant ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setTenant(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V
		 } // :cond_1
	 } // .end method
	 public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( e.h.d.a.a.s.s0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/s0;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
	 } // .end method
