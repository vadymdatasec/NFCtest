public class com.orange.hce.proto.broadcastreceivers.InstallReferrerReceiver extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.hce.proto.broadcastreceivers.InstallReferrerReceiver ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 2 */
		 final String v0 = "referrer"; // const-string v0, "referrer"
		 /* .line 1 */
		 (( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "Received the following referrer "; // const-string v1, "Received the following referrer "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v1 = "packid.installRef"; // const-string v1, "packid.installRef"
		 android.util.Log .i ( v1,v0 );
		 if ( p2 != null) { // if-eqz p2, :cond_1
			 final String v0 = "packid"; // const-string v0, "packid"
			 /* .line 3 */
			 v0 = 			 (( java.lang.String ) p2 ).startsWith ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
			 /* if-nez v0, :cond_0 */
		 } // :cond_0
		 final String v0 = "Starting SplashScreenActivity with intent data"; // const-string v0, "Starting SplashScreenActivity with intent data"
		 /* .line 4 */
		 android.util.Log .i ( v1,v0 );
		 /* .line 5 */
		 /* new-instance v0, Landroid/content/Intent; */
		 /* const-class v1, Lcom/orange/hce/proto/activity/SplashScreenActivity; */
		 /* invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 /* .line 6 */
		 android.net.Uri .parse ( p2 );
		 (( android.content.Intent ) v0 ).setData ( p2 ); // invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
		 /* const/high16 p2, 0x10000000 */
		 /* .line 7 */
		 (( android.content.Intent ) v0 ).setFlags ( p2 ); // invoke-virtual {v0, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
		 /* .line 8 */
		 (( android.content.Context ) p1 ).startActivity ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
	 } // :cond_1
} // :goto_0
return;
} // .end method
