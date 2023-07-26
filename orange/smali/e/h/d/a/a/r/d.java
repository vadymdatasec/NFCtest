public class e.h.d.a.a.r.d extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.r.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance p2, Landroid/content/Intent; */
		 /* const-class v0, Lcom/orange/oab/contactless/packid/service/UpdateTokenService; */
		 /* invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 /* const-class v0, Lcom/orange/oab/contactless/packid/service/UpdateTokenService; */
		 /* const v1, 0x5d26bf30 */
		 androidx.core.app.JobIntentService .enqueueWork ( p1,v0,v1,p2 );
		 return;
	 } // .end method
