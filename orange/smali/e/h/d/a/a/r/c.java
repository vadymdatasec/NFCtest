public class e.h.d.a.a.r.c extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.r.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p2 = 		 e.h.a.a.a.a.b .b ( p1 );
		 /* if-nez p2, :cond_0 */
		 /* .line 2 */
		 /* new-instance p2, Lcom/orange/business/packid/android/lib/PackId; */
		 /* invoke-direct {p2, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
		 (( com.orange.business.packid.android.lib.PackId ) p2 ).startBle ( ); // invoke-virtual {p2}, Lcom/orange/business/packid/android/lib/PackId;->startBle()V
	 } // :cond_0
	 return;
} // .end method
