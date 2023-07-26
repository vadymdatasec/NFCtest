public abstract class e.h.b.a.p.l {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final android.content.IntentFilter a;
	 public static final android.content.IntentFilter b;
	 /* # direct methods */
	 public static e.h.b.a.p.l ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 e.h.b.a.p.l .a ( );
		 /* .line 2 */
		 /* new-instance v0, Landroid/content/IntentFilter; */
		 final String v1 = "android.bluetooth.adapter.action.STATE_CHANGED"; // const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"
		 /* invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
		 /* .line 3 */
		 /* new-instance v0, Landroid/content/IntentFilter; */
		 final String v1 = "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"; // const-string v1, "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"
		 /* invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public static android.content.IntentFilter a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/content/IntentFilter; */
		 /* invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V */
		 final String v1 = "com.orange.oab.contactless.packid.action.USER_UPDATED"; // const-string v1, "com.orange.oab.contactless.packid.action.USER_UPDATED"
		 /* .line 2 */
		 (( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
		 final String v1 = "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"; // const-string v1, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"
		 /* .line 3 */
		 (( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
	 } // .end method
