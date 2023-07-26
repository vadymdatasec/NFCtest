public class com.orange.hce.proto.broadcastreceivers.BootCompletedReceiver extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.hce.proto.broadcastreceivers.BootCompletedReceiver ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 0 */
		 final String p1 = "packid.boot"; // const-string p1, "packid.boot"
		 final String p2 = "Boot completed, starting Pack ID"; // const-string p2, "Boot completed, starting Pack ID"
		 /* .line 1 */
		 android.util.Log .i ( p1,p2 );
		 return;
	 } // .end method
