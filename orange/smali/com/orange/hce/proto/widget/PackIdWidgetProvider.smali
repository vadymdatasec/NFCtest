.class public Lcom/orange/hce/proto/widget/PackIdWidgetProvider;
.super Landroid/appwidget/AppWidgetProvider;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v1, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 3
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isPremium()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v3

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 5
    new-instance v5, Le/h/b/a/m/d;

    invoke-direct {v5, v4, v2, p0}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/content/Context;)V

    .line 6
    invoke-static {p0, v5}, Le/h/b/a/l/y0;->a(Landroid/content/Context;Le/h/b/a/m/d;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 7
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_2
    invoke-static {v0}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Ljava/util/List;)V

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Le/h/b/a/q/d;->c(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 10

    .line 1
    array-length v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget v3, p3, v2

    const-string v4, "PackIdWidgetProvider"

    const-string v5, "Update PackId widget"

    .line 2
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v4, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f0b0055

    invoke-direct {v4, v5, v6}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 4
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/orange/hce/proto/widget/PackIdWidgetService;

    invoke-direct {v5, p1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v6, "appWidgetId"

    .line 5
    invoke-virtual {v5, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/4 v6, 0x1

    .line 6
    invoke-virtual {v5, v6}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 7
    new-instance v6, Landroid/content/Intent;

    const-class v7, Lcom/orange/hce/proto/activity/SplashScreenActivity;

    invoke-direct {v6, p1, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v7, 0x4000000

    .line 8
    invoke-static {p1, v1, v6, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    const v8, 0x7f0800de

    .line 9
    invoke-virtual {v4, v8, v6}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    const v8, 0x7f08019f

    .line 10
    invoke-virtual {v4, v8, v6}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 11
    new-instance v6, Landroid/content/Intent;

    const-class v9, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;

    invoke-direct {v6, p1, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 12
    invoke-static {p1, v1, v6, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    const v7, 0x7f080056

    .line 13
    invoke-virtual {v4, v7, v6}, Landroid/widget/RemoteViews;->setPendingIntentTemplate(ILandroid/app/PendingIntent;)V

    .line 14
    invoke-virtual {v4, v7, v5}, Landroid/widget/RemoteViews;->setRemoteAdapter(ILandroid/content/Intent;)V

    .line 15
    invoke-virtual {v4, v7, v8}, Landroid/widget/RemoteViews;->setEmptyView(II)V

    .line 16
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_0

    const v5, 0x7f0e0178

    .line 17
    invoke-virtual {p1, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v8, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->b(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_1

    const v5, 0x7f0e0179

    .line 19
    invoke-virtual {p1, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v8, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    const v5, 0x7f0e017a

    .line 20
    invoke-virtual {p1, v5}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v8, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 21
    :goto_1
    invoke-virtual {p2, v3, v4}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    .line 22
    invoke-virtual {v4}, Landroid/widget/RemoteViews;->getLayoutId()I

    move-result v4

    invoke-virtual {p2, v3, v4}, Landroid/appwidget/AppWidgetManager;->notifyAppWidgetViewDataChanged(II)V

    .line 23
    invoke-virtual {p2, v3, v7}, Landroid/appwidget/AppWidgetManager;->notifyAppWidgetViewDataChanged(II)V

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method public final a(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/i;I)V
    .locals 0

    .line 25
    invoke-static {p2, p3}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/b/a/m/d;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 26
    invoke-virtual {p2, p4}, Le/h/b/a/m/d;->a(Le/h/b/a/m/i;)V

    .line 27
    invoke-static {}, Lcom/orange/hce/proto/widget/PackIdWidgetService$b;->c()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p3

    new-instance p4, Lcom/orange/hce/proto/widget/PackIdWidgetProvider$a;

    invoke-direct {p4, p0, p2, p1}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider$a;-><init>(Lcom/orange/hce/proto/widget/PackIdWidgetProvider;Le/h/b/a/m/d;Landroid/content/Context;)V

    invoke-virtual {p0, p2, p3, p5, p4}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V

    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Le/h/b/a/q/d;->c(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public final a(Le/h/b/a/m/d;Ljava/util/concurrent/ConcurrentHashMap;ILjava/util/TimerTask;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/h/b/a/m/d;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Le/h/b/a/m/d;",
            "Ljava/util/Timer;",
            ">;I",
            "Ljava/util/TimerTask;",
            ")V"
        }
    .end annotation

    .line 29
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 31
    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    int-to-long v1, p3

    .line 32
    invoke-virtual {v0, p4, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 33
    invoke-virtual {p2, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Landroid/content/Context;)Z
    .locals 1

    .line 24
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final b(Landroid/content/Context;)Z
    .locals 5

    .line 1
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 2
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v2

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 3
    new-instance v4, Le/h/b/a/m/d;

    invoke-direct {v4, v3, v1, p1}, Le/h/b/a/m/d;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/content/Context;)V

    .line 4
    invoke-static {p1, v4}, Le/h/b/a/l/y0;->a(Landroid/content/Context;Le/h/b/a/m/d;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public onEnabled(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->c(Landroid/content/Context;)V

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const-string v0, "ContactLessId"

    .line 1
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "PackIdWidgetProvider"

    if-eqz v1, :cond_0

    const-string v1, "ZoneId"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "PackId widget try to badge"

    .line 2
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v4

    .line 4
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v5

    .line 5
    new-instance p2, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {p2, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, v4, v5}, Lcom/orange/business/packid/android/lib/PackId;->startBleTransaction(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    .line 6
    sget-object v6, Le/h/b/a/m/i;->g:Le/h/b/a/m/i;

    const/16 v7, 0x2710

    move-object v2, p0

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Le/h/b/a/m/i;I)V

    goto :goto_0

    :cond_0
    const-string v0, "StartApplication"

    .line 7
    invoke-virtual {p2, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p2, "Badge no ble or no manual, start app"

    .line 8
    invoke-static {v2, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/orange/hce/proto/activity/SplashScreenActivity;

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x10000000

    .line 10
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 11
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    :goto_0
    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/appwidget/AppWidgetProvider;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->a(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    return-void
.end method
