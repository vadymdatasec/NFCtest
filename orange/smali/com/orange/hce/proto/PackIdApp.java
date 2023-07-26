public class com.orange.hce.proto.PackIdApp extends android.app.Application {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public com.orange.business.packid.android.lib.PackId b;
	 /* # direct methods */
	 public com.orange.hce.proto.PackIdApp ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/app/Application;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.orange.business.packid.android.lib.PackId a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public void a ( java.lang.String p0 ) { //synthethic
		 /* .locals 2 */
		 final String v0 = "packid.app"; // const-string v0, "packid.app"
		 /* .line 2 */
		 android.util.Log .d ( v0,p1 );
		 final String v0 = "PackIdLibFirebaseMessagingService"; // const-string v0, "PackIdLibFirebaseMessagingService"
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 3 */
		 (( android.app.Application ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* .line 4 */
		 final String v1 = "token"; // const-string v1, "token"
		 return;
	 } // .end method
	 public void onCreate ( ) {
		 /* .locals 4 */
		 final String v0 = "packid.app"; // const-string v0, "packid.app"
		 final String v1 = "Application creation"; // const-string v1, "Application creation"
		 /* .line 1 */
		 android.util.Log .i ( v0,v1 );
		 /* .line 2 */
		 /* invoke-super {p0}, Landroid/app/Application;->onCreate()V */
		 /* .line 3 */
		 e.f.c.h .a ( p0 );
		 /* .line 4 */
		 com.google.firebase.messaging.FirebaseMessaging .c ( );
		 (( com.google.firebase.messaging.FirebaseMessaging ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->a()Le/f/a/b/h/g;
		 /* new-instance v1, Le/h/b/a/a; */
		 /* invoke-direct {v1, p0}, Le/h/b/a/a;-><init>(Lcom/orange/hce/proto/PackIdApp;)V */
		 (( e.f.a.b.h.g ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/e;)Le/f/a/b/h/g;
		 /* .line 5 */
		 /* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
		 /* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
		 this.b = v0;
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 6 */
		 (( com.orange.business.packid.android.lib.PackId ) v0 ).start ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackId;->start(Z)V
		 /* .line 7 */
		 c.p.a.d .a ( p0 );
		 /* new-instance v1, Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver; */
		 /* invoke-direct {v1}, Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver;-><init>()V */
		 /* new-instance v2, Landroid/content/IntentFilter; */
		 final String v3 = "com.orange.oab.contactless.packid.action.USER_UPDATED"; // const-string v3, "com.orange.oab.contactless.packid.action.USER_UPDATED"
		 /* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
		 (( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
		 /* .line 8 */
		 /* new-instance v0, Le/h/b/a/n/h; */
		 /* invoke-direct {v0}, Le/h/b/a/n/h;-><init>()V */
		 /* new-instance v1, Landroid/content/IntentFilter; */
		 final String v2 = "com.orange.oab.contactless.packid.action.SHOW_BADGE"; // const-string v2, "com.orange.oab.contactless.packid.action.SHOW_BADGE"
		 /* invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
		 (( android.app.Application ) p0 ).registerReceiver ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/app/Application;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
		 return;
	 } // .end method
