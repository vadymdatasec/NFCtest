public class com.orange.hce.proto.widget.PackIdWidgetProvider extends android.appwidget.AppWidgetProvider {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.orange.hce.proto.widget.PackIdWidgetProvider ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V */
		 return;
	 } // .end method
	 public static void c ( android.content.Context p0 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 /* .line 2 */
		 /* new-instance v1, Lcom/orange/business/packid/android/lib/PackId; */
		 /* invoke-direct {v1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
		 (( com.orange.business.packid.android.lib.PackId ) v1 ).getUsers ( ); // invoke-virtual {v1}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
	 v2 = 	 } // :cond_0
	 if ( v2 != null) { // if-eqz v2, :cond_2
		 /* check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User; */
		 /* .line 3 */
		 v3 = 		 (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).isPremium ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isPremium()Z
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 /* .line 4 */
			 (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getWallet ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v3 ).getBadges ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
		 } // :cond_1
	 v4 = 	 } // :goto_0
	 if ( v4 != null) { // if-eqz v4, :cond_0
		 /* check-cast v4, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
		 /* .line 5 */
		 /* new-instance v5, Le/h/b/a/m/d; */
		 /* invoke-direct {v5, v4, v2, p0}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/content/Context;)V */
		 /* .line 6 */
		 v4 = 		 e.h.b.a.l.y0 .a ( p0,v5 );
		 if ( v4 != null) { // if-eqz v4, :cond_1
			 /* .line 7 */
			 /* .line 8 */
		 } // :cond_2
		 com.orange.hce.proto.widget.PackIdWidgetService$b .a ( v0 );
		 /* .line 9 */
		 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 e.h.b.a.q.d .c ( p0 );
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( android.content.Context p0, android.appwidget.AppWidgetManager p1, Integer[] p2 ) {
		 /* .locals 10 */
		 /* .line 1 */
		 /* array-length v0, p3 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 /* if-ge v2, v0, :cond_2 */
	 /* aget v3, p3, v2 */
	 final String v4 = "PackIdWidgetProvider"; // const-string v4, "PackIdWidgetProvider"
	 final String v5 = "Update PackId widget"; // const-string v5, "Update PackId widget"
	 /* .line 2 */
	 android.util.Log .i ( v4,v5 );
	 /* .line 3 */
	 /* new-instance v4, Landroid/widget/RemoteViews; */
	 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 /* const v6, 0x7f0b0055 */
	 /* invoke-direct {v4, v5, v6}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V */
	 /* .line 4 */
	 /* new-instance v5, Landroid/content/Intent; */
	 /* const-class v6, Lcom/orange/hce/proto/widget/PackIdWidgetService; */
	 /* invoke-direct {v5, p1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
	 final String v6 = "appWidgetId"; // const-string v6, "appWidgetId"
	 /* .line 5 */
	 (( android.content.Intent ) v5 ).putExtra ( v6, v3 ); // invoke-virtual {v5, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
	 int v6 = 1; // const/4 v6, 0x1
	 /* .line 6 */
	 (( android.content.Intent ) v5 ).toUri ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;
	 android.net.Uri .parse ( v6 );
	 (( android.content.Intent ) v5 ).setData ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
	 /* .line 7 */
	 /* new-instance v6, Landroid/content/Intent; */
	 /* const-class v7, Lcom/orange/hce/proto/activity/SplashScreenActivity; */
	 /* invoke-direct {v6, p1, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
	 /* const/high16 v7, 0x4000000 */
	 /* .line 8 */
	 android.app.PendingIntent .getActivity ( p1,v1,v6,v7 );
	 /* const v8, 0x7f0800de */
	 /* .line 9 */
	 (( android.widget.RemoteViews ) v4 ).setOnClickPendingIntent ( v8, v6 ); // invoke-virtual {v4, v8, v6}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
	 /* const v8, 0x7f08019f */
	 /* .line 10 */
	 (( android.widget.RemoteViews ) v4 ).setOnClickPendingIntent ( v8, v6 ); // invoke-virtual {v4, v8, v6}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V
	 /* .line 11 */
	 /* new-instance v6, Landroid/content/Intent; */
	 /* const-class v9, Lcom/orange/hce/proto/widget/PackIdWidgetProvider; */
	 /* invoke-direct {v6, p1, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
	 /* .line 12 */
	 android.app.PendingIntent .getBroadcast ( p1,v1,v6,v7 );
	 /* const v7, 0x7f080056 */
	 /* .line 13 */
	 (( android.widget.RemoteViews ) v4 ).setPendingIntentTemplate ( v7, v6 ); // invoke-virtual {v4, v7, v6}, Landroid/widget/RemoteViews;->setPendingIntentTemplate(ILandroid/app/PendingIntent;)V
	 /* .line 14 */
	 (( android.widget.RemoteViews ) v4 ).setRemoteAdapter ( v7, v5 ); // invoke-virtual {v4, v7, v5}, Landroid/widget/RemoteViews;->setRemoteAdapter(ILandroid/content/Intent;)V
	 /* .line 15 */
	 (( android.widget.RemoteViews ) v4 ).setEmptyView ( v7, v8 ); // invoke-virtual {v4, v7, v8}, Landroid/widget/RemoteViews;->setEmptyView(II)V
	 /* .line 16 */
	 v5 = 	 (( com.orange.hce.proto.widget.PackIdWidgetProvider ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Landroid/content/Context;)Z
	 /* if-nez v5, :cond_0 */
	 /* const v5, 0x7f0e0178 */
	 /* .line 17 */
	 (( android.content.Context ) p1 ).getText ( v5 ); // invoke-virtual {p1, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
	 (( android.widget.RemoteViews ) v4 ).setTextViewText ( v8, v5 ); // invoke-virtual {v4, v8, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
	 /* .line 18 */
} // :cond_0
v5 = (( com.orange.hce.proto.widget.PackIdWidgetProvider ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->b(Landroid/content/Context;)Z
/* if-nez v5, :cond_1 */
/* const v5, 0x7f0e0179 */
/* .line 19 */
(( android.content.Context ) p1 ).getText ( v5 ); // invoke-virtual {p1, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( android.widget.RemoteViews ) v4 ).setTextViewText ( v8, v5 ); // invoke-virtual {v4, v8, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
} // :cond_1
/* const v5, 0x7f0e017a */
/* .line 20 */
(( android.content.Context ) p1 ).getText ( v5 ); // invoke-virtual {p1, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( android.widget.RemoteViews ) v4 ).setTextViewText ( v8, v5 ); // invoke-virtual {v4, v8, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
/* .line 21 */
} // :goto_1
(( android.appwidget.AppWidgetManager ) p2 ).updateAppWidget ( v3, v4 ); // invoke-virtual {p2, v3, v4}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V
/* .line 22 */
v4 = (( android.widget.RemoteViews ) v4 ).getLayoutId ( ); // invoke-virtual {v4}, Landroid/widget/RemoteViews;->getLayoutId()I
(( android.appwidget.AppWidgetManager ) p2 ).notifyAppWidgetViewDataChanged ( v3, v4 ); // invoke-virtual {p2, v3, v4}, Landroid/appwidget/AppWidgetManager;->notifyAppWidgetViewDataChanged(II)V
/* .line 23 */
(( android.appwidget.AppWidgetManager ) p2 ).notifyAppWidgetViewDataChanged ( v3, v7 ); // invoke-virtual {p2, v3, v7}, Landroid/appwidget/AppWidgetManager;->notifyAppWidgetViewDataChanged(II)V
/* add-int/lit8 v2, v2, 0x1 */
/* goto/16 :goto_0 */
} // :cond_2
return;
} // .end method
public final void a ( android.content.Context p0, fr.mbs.binary.Octets p1, fr.mbs.binary.Octets p2, Object p3, Integer p4 ) {
/* .locals 0 */
/* .line 25 */
com.orange.hce.proto.widget.PackIdWidgetService$b .a ( p2,p3 );
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 26 */
(( e.h.b.a.m.d ) p2 ).a ( p4 ); // invoke-virtual {p2, p4}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V
/* .line 27 */
com.orange.hce.proto.widget.PackIdWidgetService$b .c ( );
/* new-instance p4, Lcom/orange/hce/proto/widget/PackIdWidgetProvider$a; */
/* invoke-direct {p4, p0, p2, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider$a;-><init>(Lcom/orange/hce/proto/widget/PackIdWidgetProvider;Le/h/b/a/m/d;Landroid/content/Context;)V */
(( com.orange.hce.proto.widget.PackIdWidgetProvider ) p0 ).a ( p2, p3, p5, p4 ); // invoke-virtual {p0, p2, p3, p5, p4}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V
/* .line 28 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
e.h.b.a.q.d .c ( p1 );
} // :cond_0
return;
} // .end method
public final void a ( Object p0, java.util.concurrent.ConcurrentHashMap p1, Integer p2, java.util.TimerTask p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/concurrent/ConcurrentHashMap<", */
/* "Le/h/b/a/m/d;", */
/* "Ljava/util/Timer;", */
/* ">;I", */
/* "Ljava/util/TimerTask;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 29 */
(( java.util.concurrent.ConcurrentHashMap ) p2 ).get ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/Timer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 30 */
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
/* .line 31 */
} // :cond_0
/* new-instance v0, Ljava/util/Timer; */
/* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
/* int-to-long v1, p3 */
/* .line 32 */
(( java.util.Timer ) v0 ).schedule ( p4, v1, v2 ); // invoke-virtual {v0, p4, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 33 */
(( java.util.concurrent.ConcurrentHashMap ) p2 ).put ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public final Boolean a ( android.content.Context p0 ) {
/* .locals 1 */
/* .line 24 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
p1 = (( com.orange.business.packid.android.lib.PackId ) v0 ).getUsers ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
/* xor-int/lit8 p1, p1, 0x1 */
} // .end method
public final Boolean b ( android.content.Context p0 ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).getUsers ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 2 */
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getWallet ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v2 ).getBadges ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
v3 = } // :cond_1
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 3 */
/* new-instance v4, Le/h/b/a/m/d; */
/* invoke-direct {v4, v3, v1, p1}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/content/Context;)V */
/* .line 4 */
v3 = e.h.b.a.l.y0 .a ( p1,v4 );
if ( v3 != null) { // if-eqz v3, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void onEnabled ( android.content.Context p0 ) {
/* .locals 0 */
/* .line 1 */
com.orange.hce.proto.widget.PackIdWidgetProvider .c ( p1 );
return;
} // .end method
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 8 */
final String v0 = "ContactLessId"; // const-string v0, "ContactLessId"
/* .line 1 */
v1 = (( android.content.Intent ) p2 ).hasExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
final String v2 = "PackIdWidgetProvider"; // const-string v2, "PackIdWidgetProvider"
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "ZoneId"; // const-string v1, "ZoneId"
v3 = (( android.content.Intent ) p2 ).hasExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
final String v3 = "PackId widget try to badge"; // const-string v3, "PackId widget try to badge"
/* .line 2 */
android.util.Log .i ( v2,v3 );
/* .line 3 */
(( android.content.Intent ) p2 ).getStringExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
java.util.Objects .requireNonNull ( v0 );
/* check-cast v0, Ljava/lang/String; */
fr.mbs.binary.Octets .createOctets ( v0 );
/* .line 4 */
(( android.content.Intent ) p2 ).getStringExtra ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
java.util.Objects .requireNonNull ( p2 );
/* check-cast p2, Ljava/lang/String; */
fr.mbs.binary.Octets .createOctets ( p2 );
/* .line 5 */
/* new-instance p2, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {p2, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) p2 ).startBleTransaction ( v4, v5 ); // invoke-virtual {p2, v4, v5}, Lcom/orange/business/packid/android/lib/PackId;->startBleTransaction(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
/* .line 6 */
v6 = e.h.b.a.m.i.g;
/* const/16 v7, 0x2710 */
/* move-object v2, p0 */
/* move-object v3, p1 */
/* invoke-virtual/range {v2 ..v7}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/i;I)V */
} // :cond_0
final String v0 = "StartApplication"; // const-string v0, "StartApplication"
/* .line 7 */
v0 = (( android.content.Intent ) p2 ).hasExtra ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
final String p2 = "Badge no ble or no manual, start app"; // const-string p2, "Badge no ble or no manual, start app"
/* .line 8 */
android.util.Log .i ( v2,p2 );
/* .line 9 */
/* new-instance p2, Landroid/content/Intent; */
/* const-class v0, Lcom/orange/hce/proto/activity/SplashScreenActivity; */
/* invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* const/high16 v0, 0x10000000 */
/* .line 10 */
(( android.content.Intent ) p2 ).setFlags ( v0 ); // invoke-virtual {p2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
/* .line 11 */
(( android.content.Context ) p1 ).startActivity ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 12 */
} // :cond_1
/* invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V */
} // :goto_0
return;
} // .end method
public void onUpdate ( android.content.Context p0, android.appwidget.AppWidgetManager p1, Integer[] p2 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2, p3}, Landroid/appwidget/AppWidgetProvider;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V */
/* .line 2 */
(( com.orange.hce.proto.widget.PackIdWidgetProvider ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
return;
} // .end method
