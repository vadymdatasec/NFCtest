public class com.orange.hce.proto.activity.NoBadgeActivity extends c.b.k.r {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/orange/hce/proto/activity/NoBadgeActivity$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public com.orange.hce.proto.activity.NoBadgeActivity$a q;
public android.app.ProgressDialog r;
public e.h.b.a.n.g s;
/* # direct methods */
public com.orange.hce.proto.activity.NoBadgeActivity ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lc/b/k/r;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a; */
	 /* invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;-><init>(Lcom/orange/hce/proto/activity/NoBadgeActivity;)V */
	 this.q = v0;
	 /* .line 3 */
	 /* new-instance v0, Le/h/b/a/n/g; */
	 /* invoke-direct {v0, p0}, Le/h/b/a/n/g;-><init>(Landroid/app/Activity;)V */
	 this.s = v0;
	 return;
} // .end method
public static android.app.ProgressDialog a ( com.orange.hce.proto.activity.NoBadgeActivity p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = this.r;
} // .end method
public static void a ( com.orange.hce.proto.activity.NoBadgeActivity p0, java.lang.String p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 2 */
	 (( com.orange.hce.proto.activity.NoBadgeActivity ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->b(Ljava/lang/String;)V
	 return;
} // .end method
public static void b ( com.orange.hce.proto.activity.NoBadgeActivity p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 (( com.orange.hce.proto.activity.NoBadgeActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->s()V
	 return;
} // .end method
/* # virtual methods */
public void a ( android.app.ProgressDialog p0 ) { //synthethic
	 /* .locals 3 */
	 /* .line 3 */
	 try { // :try_start_0
		 /* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
		 /* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
		 (( com.orange.business.packid.android.lib.PackId ) v0 ).createDefaultUser ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->createDefaultUser()Lcom/orange/oab/contactless/packid/hce/user/User;
		 /* if-nez v0, :cond_0 */
		 /* .line 4 */
		 /* new-instance v0, Landroid/app/AlertDialog$Builder; */
		 /* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
		 /* const v1, 0x7f0e005d */
		 /* .line 5 */
		 (( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;
		 /* const v1, 0x7f0e0064 */
		 /* new-instance v2, Le/h/b/a/l/b0; */
		 /* invoke-direct {v2, p0}, Le/h/b/a/l/b0;-><init>(Lcom/orange/hce/proto/activity/NoBadgeActivity;)V */
		 /* .line 6 */
		 (( android.app.AlertDialog$Builder ) v0 ).setNeutralButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 /* .line 7 */
		 (( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
		 (( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
		 /* .line 8 */
	 } // :cond_0
	 /* new-instance v0, Landroid/content/Intent; */
	 /* const-class v1, Lcom/orange/hce/proto/activity/BadgeListActivity; */
	 /* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
	 (( android.app.Activity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
	 /* .line 9 */
	 (( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 10 */
} // :goto_0
(( android.app.ProgressDialog ) p1 ).dismiss ( ); // invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V
return;
/* :catchall_0 */
/* move-exception v0 */
(( android.app.ProgressDialog ) p1 ).dismiss ( ); // invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V
/* .line 11 */
/* throw v0 */
} // .end method
public void a ( android.content.DialogInterface p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 12 */
(( android.app.Activity ) p0 ).finishAffinity ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
return;
} // .end method
public final void b ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 2 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* const v0, 0x7f0e0064 */
int v1 = 0; // const/4 v1, 0x0
(( android.app.AlertDialog$Builder ) p1 ).setNeutralButton ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) p1 ).create ( ); // invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 3 */
(( android.app.AlertDialog ) p1 ).show ( ); // invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V
return;
} // .end method
public void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3}, Lc/l/d/f0;->onActivityResult(IILandroid/content/Intent;)V */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
/* if-ne p2, p1, :cond_0 */
final String p1 = "FOLLOW-USER"; // const-string p1, "FOLLOW-USER"
final String p2 = "NoBadgeActivity#onActivityResult"; // const-string p2, "NoBadgeActivity#onActivityResult"
/* .line 2 */
android.util.Log .d ( p1,p2 );
/* .line 3 */
c.p.a.d .a ( p0 );
p2 = this.q;
v1 = e.h.b.a.p.l.a;
(( c.p.a.d ) p1 ).a ( p2, v1 ); // invoke-virtual {p1, p2, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* const p1, 0x7f0e00c0 */
/* .line 4 */
(( android.app.Activity ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
/* const p2, 0x7f0e0118 */
(( android.app.Activity ) p0 ).getString ( p2 ); // invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
android.app.ProgressDialog .show ( p0,p1,p2,v0 );
this.r = p1;
/* .line 5 */
(( android.content.Intent ) p3 ).getData ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;
/* .line 6 */
/* new-instance p2, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {p2, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( android.app.Activity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
int v0 = 0; // const/4 v0, 0x0
final String v1 = "PackIdLibFirebaseMessagingService"; // const-string v1, "PackIdLibFirebaseMessagingService"
(( android.content.Context ) p3 ).getSharedPreferences ( v1, v0 ); // invoke-virtual {p3, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
final String v0 = "token"; // const-string v0, "token"
final String v1 = ""; // const-string v1, ""
(( com.orange.business.packid.android.lib.PackId ) p2 ).register ( p1, p3 ); // invoke-virtual {p2, p1, p3}, Lcom/orange/business/packid/android/lib/PackId;->register(Landroid/net/Uri;Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
public void onBackToEmailClick ( android.view.View p0 ) {
/* .locals 0 */
/* .line 1 */
(( android.app.Activity ) p0 ).finishAndRemoveTask ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finishAndRemoveTask()V
return;
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V */
/* const p1, 0x7f0b0022 */
/* .line 2 */
(( c.b.k.r ) p0 ).setContentView ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V
/* const p1, 0x7f0800ee */
/* .line 3 */
(( c.b.k.r ) p0 ).findViewById ( p1 ); // invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;
int v0 = 0; // const/4 v0, 0x0
(( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
return;
} // .end method
public void onDestroy ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0}, Lc/b/k/r;->onDestroy()V */
/* .line 2 */
(( com.orange.hce.proto.activity.NoBadgeActivity ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->s()V
return;
} // .end method
public void onPause ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onPause()V */
/* .line 2 */
c.p.a.d .a ( p0 );
v1 = this.s;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
return;
} // .end method
public void onQrCodeClick ( android.view.View p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance p1, Landroid/content/Intent; */
/* const-class v0, Lcom/orange/hce/proto/activity/QrCodeActivity; */
/* invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
int v0 = 1; // const/4 v0, 0x1
(( androidx.activity.ComponentActivity ) p0 ).startActivityForResult ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V
return;
} // .end method
public void onResume ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0}, Lc/l/d/f0;->onResume()V */
final String v0 = "FOLLOW-USER"; // const-string v0, "FOLLOW-USER"
final String v1 = "NoBadgeActivity#onResume"; // const-string v1, "NoBadgeActivity#onResume"
/* .line 2 */
android.util.Log .d ( v0,v1 );
/* .line 3 */
c.p.a.d .a ( p0 );
v1 = this.s;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"; // const-string v3, "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( c.p.a.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
/* .line 4 */
(( android.app.Activity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;
/* check-cast v0, Lcom/orange/hce/proto/PackIdApp; */
(( com.orange.hce.proto.PackIdApp ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;
/* .line 5 */
(( com.orange.business.packid.android.lib.PackId ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->start()V
/* .line 6 */
v0 = (( com.orange.business.packid.android.lib.PackId ) v0 ).getUsers ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
/* if-nez v0, :cond_0 */
/* .line 7 */
(( android.app.Activity ) p0 ).finish ( ); // invoke-virtual {p0}, Landroid/app/Activity;->finish()V
} // :cond_0
return;
} // .end method
public void onTestBadgeClick ( android.view.View p0 ) {
/* .locals 2 */
/* const p1, 0x7f0e0087 */
/* .line 1 */
(( android.app.Activity ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
/* const v0, 0x7f0e0118 */
(( android.app.Activity ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
android.app.ProgressDialog .show ( p0,p1,v0,v1 );
/* .line 2 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Le/h/b/a/l/a0; */
/* invoke-direct {v1, p0, p1}, Le/h/b/a/l/a0;-><init>(Lcom/orange/hce/proto/activity/NoBadgeActivity;Landroid/app/ProgressDialog;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 3 */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
return;
} // .end method
public final void s ( ) {
/* .locals 2 */
/* .line 1 */
c.p.a.d .a ( p0 );
v1 = this.q;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
/* .line 2 */
c.p.a.d .a ( p0 );
v1 = this.s;
(( c.p.a.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V
return;
} // .end method
