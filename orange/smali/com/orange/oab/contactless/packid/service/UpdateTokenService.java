public class com.orange.oab.contactless.packid.service.UpdateTokenService extends androidx.core.app.JobIntentService {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.oab.contactless.packid.service.UpdateTokenService ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroidx/core/app/JobIntentService;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( com.orange.oab.contactless.packid.hce.user.User p0, java.util.Date p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( com.orange.oab.contactless.packid.hce.user.User ) p1 ).getWallet ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) p1 ).getBadges ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
	 } // :cond_0
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
	 /* .line 2 */
	 v1 = 	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).isToken ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isToken()Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 3 */
		 (( com.orange.oab.contactless.packid.service.UpdateTokenService ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lcom/orange/oab/contactless/packid/service/UpdateTokenService;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/util/Date;)V
	 } // :cond_1
	 return;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, java.util.Date p1 ) {
	 /* .locals 3 */
	 /* .line 4 */
	 try { // :try_start_0
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getRegenerationDate ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRegenerationDate()Ljava/util/Date;
		 p2 = 		 (( java.util.Date ) v0 ).after ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/Date;->after(Ljava/util/Date;)Z
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 return;
		 } // :cond_0
		 final String p2 = "packid.UpdateTkService"; // const-string p2, "packid.UpdateTkService"
		 /* .line 5 */
		 try { // :try_start_1
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "Updating token for zone "; // const-string v1, "Updating token for zone "
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .d ( p2,v0 );
			 /* .line 6 */
			 /* new-instance p2, Le/h/d/a/a/n/n; */
			 /* invoke-direct {p2, p0, p1}, Le/h/d/a/a/n/n;-><init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V */
			 (( e.h.d.a.a.n.n ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/d/a/a/n/n;->a()V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p2 */
			 /* .line 7 */
			 int v1 = 1; // const/4 v1, 0x1
			 /* new-array v1, v1, [Ljava/lang/Object; */
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
			 int v2 = 0; // const/4 v2, 0x0
			 /* aput-object p1, v1, v2 */
			 (( android.app.Service ) p0 ).getString ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Service;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
			 com.orange.oab.contactless.packid.report.ReportSender .send ( p1,p2 );
		 } // :goto_0
		 return;
	 } // .end method
	 public void onHandleWork ( android.content.Intent p0 ) {
		 /* .locals 2 */
		 final String p1 = "packid.UpdateTkService"; // const-string p1, "packid.UpdateTkService"
		 final String v0 = "Handling tokens update"; // const-string v0, "Handling tokens update"
		 /* .line 1 */
		 android.util.Log .d ( p1,v0 );
		 /* .line 2 */
		 e.h.d.a.a.s.m .c ( p0 );
		 (( e.h.d.a.a.s.g0 ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;
	 v0 = 	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
		 /* .line 3 */
		 /* new-instance v1, Ljava/util/Date; */
		 /* invoke-direct {v1}, Ljava/util/Date;-><init>()V */
		 (( com.orange.oab.contactless.packid.service.UpdateTokenService ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/orange/oab/contactless/packid/service/UpdateTokenService;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/Date;)V
	 } // :cond_0
	 return;
} // .end method
