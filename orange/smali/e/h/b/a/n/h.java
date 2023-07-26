public class e.h.b.a.n.h extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.b.a.n.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "intent received:"; // const-string v1, "intent received:"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v0 = "packid.ShowBdgRcvr"; // const-string v0, "packid.ShowBdgRcvr"
		 android.util.Log .i ( v0,p2 );
		 /* .line 2 */
		 /* new-instance p2, Landroid/content/Intent; */
		 /* const-class v0, Lcom/orange/hce/proto/activity/BadgeListActivity; */
		 /* invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 /* .line 3 */
		 /* new-instance v0, Landroid/os/Bundle; */
		 /* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
		 /* .line 4 */
		 (( android.content.Intent ) p2 ).putExtras ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
		 /* const v0, 0x10008000 */
		 /* .line 5 */
		 (( android.content.Intent ) p2 ).setFlags ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
		 /* .line 6 */
		 (( android.content.Context ) p1 ).startActivity ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
		 return;
	 } // .end method
