public class com.orange.oab.contactless.packid.intent.UserUpdatedReceiver extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.oab.contactless.packid.intent.UserUpdatedReceiver ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 public static java.util.List a ( android.content.Intent p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/content/Intent;", */
		 /* "Ljava/lang/String;", */
		 /* ")", */
		 /* "Ljava/util/List<", */
		 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .line 5 */
	 (( android.content.Intent ) p0 ).getSerializableExtra ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;
	 /* check-cast p0, Ljava/util/List; */
} // .end method
/* # virtual methods */
public final void a ( android.content.Context p0, android.content.Intent p1, java.lang.String p2, Integer p3 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 com.orange.oab.contactless.packid.intent.UserUpdatedReceiver .a ( p2,p3 );
	 /* .line 2 */
p3 = } // :goto_0
if ( p3 != null) { // if-eqz p3, :cond_0
	 /* check-cast p3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
	 /* .line 3 */
	 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 int v1 = 1; // const/4 v1, 0x1
	 /* new-array v1, v1, [Ljava/lang/Object; */
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getDescription ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
	 int v2 = 0; // const/4 v2, 0x0
	 /* aput-object p3, v1, v2 */
	 (( android.content.res.Resources ) v0 ).getString ( p4, v1 ); // invoke-virtual {v0, p4, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
	 /* .line 4 */
	 android.widget.Toast .makeText ( p1,p3,v2 );
	 (( android.widget.Toast ) p3 ).show ( ); // invoke-virtual {p3}, Landroid/widget/Toast;->show()V
} // :cond_0
return;
} // .end method
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 2 */
/* .line 1 */
final String v1 = "addedBadges"; // const-string v1, "addedBadges"
(( com.orange.oab.contactless.packid.intent.UserUpdatedReceiver ) p0 ).a ( p1, p2, v1, v0 ); // invoke-virtual {p0, p1, p2, v1, v0}, Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;I)V
/* .line 2 */
final String v1 = "removedBadges"; // const-string v1, "removedBadges"
(( com.orange.oab.contactless.packid.intent.UserUpdatedReceiver ) p0 ).a ( p1, p2, v1, v0 ); // invoke-virtual {p0, p1, p2, v1, v0}, Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver;->a(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;I)V
return;
} // .end method
