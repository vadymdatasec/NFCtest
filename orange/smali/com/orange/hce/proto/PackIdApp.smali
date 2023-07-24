.class public Lcom/orange/hce/proto/PackIdApp;
.super Landroid/app/Application;
.source "SourceFile"


# instance fields
.field public b:Lcom/orange/business/packid/android/lib/PackId;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/orange/business/packid/android/lib/PackId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/PackIdApp;->b:Lcom/orange/business/packid/android/lib/PackId;

    return-object v0
.end method

.method public synthetic a(Ljava/lang/String;)V
    .locals 2

    const-string v0, "packid.app"

    .line 2
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "PackIdLibFirebaseMessagingService"

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "token"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public onCreate()V
    .locals 4

    const-string v0, "packid.app"

    const-string v1, "Application creation"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 3
    invoke-static {p0}, Le/f/c/h;->a(Landroid/content/Context;)Le/f/c/h;

    .line 4
    invoke-static {}, Lcom/google/firebase/messaging/FirebaseMessaging;->c()Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->a()Le/f/a/b/h/g;

    move-result-object v0

    new-instance v1, Le/h/b/a/a;

    invoke-direct {v1, p0}, Le/h/b/a/a;-><init>(Lcom/orange/hce/proto/PackIdApp;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/e;)Le/f/a/b/h/g;

    .line 5
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/orange/hce/proto/PackIdApp;->b:Lcom/orange/business/packid/android/lib/PackId;

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackId;->start(Z)V

    .line 7
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    new-instance v1, Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver;

    invoke-direct {v1}, Lcom/orange/oab/contactless/packid/intent/UserUpdatedReceiver;-><init>()V

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.USER_UPDATED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 8
    new-instance v0, Le/h/b/a/n/h;

    invoke-direct {v0}, Le/h/b/a/n/h;-><init>()V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.orange.oab.contactless.packid.action.SHOW_BADGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/Application;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
