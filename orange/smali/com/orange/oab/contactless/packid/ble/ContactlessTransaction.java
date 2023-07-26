public class com.orange.oab.contactless.packid.ble.ContactlessTransaction {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;, */
	 /* Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer TRANSACTION_TIMEOUT;
public static android.os.Handler a;
public static java.lang.Runnable b;
/* # direct methods */
public static com.orange.oab.contactless.packid.ble.ContactlessTransaction ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Landroid/os/Handler; */
	 android.os.Looper .getMainLooper ( );
	 /* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
	 return;
} // .end method
public com.orange.oab.contactless.packid.ble.ContactlessTransaction ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static void dismissTransactionNotification ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 v0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction.a;
	 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction.b;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.os.Handler ) v0 ).removeCallbacks ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;Ljava/lang/Object;)V
	 return;
} // .end method
public static void setupAbortionTimeout ( android.content.Context p0, com.orange.oab.contactless.packid.hce.user.User p1, com.orange.oab.contactless.packid.hce.user.wallet.Badge p2 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction.a;
	 v1 = com.orange.oab.contactless.packid.ble.ContactlessTransaction.b;
	 (( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
	 /* .line 2 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a; */
	 /* invoke-direct {v0, p0, p1, p2}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;-><init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V */
	 /* .line 3 */
	 p0 = com.orange.oab.contactless.packid.ble.ContactlessTransaction.a;
	 /* const-wide/16 p1, 0x2710 */
	 (( android.os.Handler ) p0 ).postDelayed ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
	 return;
} // .end method
