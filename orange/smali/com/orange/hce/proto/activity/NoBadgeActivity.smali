.class public Lcom/orange/hce/proto/activity/NoBadgeActivity;
.super Lc/b/k/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/hce/proto/activity/NoBadgeActivity$a;
    }
.end annotation


# instance fields
.field public q:Lcom/orange/hce/proto/activity/NoBadgeActivity$a;

.field public r:Landroid/app/ProgressDialog;

.field public s:Le/h/b/a/n/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/b/k/r;-><init>()V

    .line 2
    new-instance v0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;

    invoke-direct {v0, p0}, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;-><init>(Lcom/orange/hce/proto/activity/NoBadgeActivity;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity;->q:Lcom/orange/hce/proto/activity/NoBadgeActivity$a;

    .line 3
    new-instance v0, Le/h/b/a/n/g;

    invoke-direct {v0, p0}, Le/h/b/a/n/g;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity;->s:Le/h/b/a/n/g;

    return-void
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/NoBadgeActivity;)Landroid/app/ProgressDialog;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity;->r:Landroid/app/ProgressDialog;

    return-object p0
.end method

.method public static synthetic a(Lcom/orange/hce/proto/activity/NoBadgeActivity;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/orange/hce/proto/activity/NoBadgeActivity;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->s()V

    return-void
.end method


# virtual methods
.method public synthetic a(Landroid/app/ProgressDialog;)V
    .locals 3

    .line 3
    :try_start_0
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->createDefaultUser()Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0e005d

    .line 5
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0e0064

    new-instance v2, Le/h/b/a/l/b0;

    invoke-direct {v2, p0}, Le/h/b/a/l/b0;-><init>(Lcom/orange/hce/proto/activity/NoBadgeActivity;)V

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :goto_0
    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 11
    throw v0
.end method

.method public synthetic a(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    const v0, 0x7f0e0064

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Lc/l/d/f0;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    const-string p1, "FOLLOW-USER"

    const-string p2, "NoBadgeActivity#onActivityResult"

    .line 2
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object p1

    iget-object p2, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity;->q:Lcom/orange/hce/proto/activity/NoBadgeActivity$a;

    sget-object v1, Le/h/b/a/p/l;->a:Landroid/content/IntentFilter;

    invoke-virtual {p1, p2, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    const p1, 0x7f0e00c0

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const p2, 0x7f0e0118

    invoke-virtual {p0, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2, v0}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity;->r:Landroid/app/ProgressDialog;

    .line 5
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    .line 6
    new-instance p2, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {p2, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    const/4 v0, 0x0

    const-string v1, "PackIdLibFirebaseMessagingService"

    invoke-virtual {p3, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p3

    const-string v0, "token"

    const-string v1, ""

    invoke-interface {p3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Lcom/orange/business/packid/android/lib/PackId;->register(Landroid/net/Uri;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onBackToEmailClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAndRemoveTask()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0022

    .line 2
    invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V

    const p1, 0x7f0800ee

    .line 3
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lc/b/k/r;->onDestroy()V

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->s()V

    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onPause()V

    .line 2
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity;->s:Le/h/b/a/n/g;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public onQrCodeClick(Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/orange/hce/proto/activity/QrCodeActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onResume()V

    const-string v0, "FOLLOW-USER"

    const-string v1, "NoBadgeActivity#onResume"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity;->s:Le/h/b/a/n/g;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/orange/hce/proto/PackIdApp;

    invoke-virtual {v0}, Lcom/orange/hce/proto/PackIdApp;->a()Lcom/orange/business/packid/android/lib/PackId;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->start()V

    .line 6
    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public onTestBadgeClick(Landroid/view/View;)V
    .locals 2

    const p1, 0x7f0e0087

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f0e0118

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object p1

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Le/h/b/a/l/a0;

    invoke-direct {v1, p0, p1}, Le/h/b/a/l/a0;-><init>(Lcom/orange/hce/proto/activity/NoBadgeActivity;Landroid/app/ProgressDialog;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity;->q:Lcom/orange/hce/proto/activity/NoBadgeActivity$a;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 2
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity;->s:Le/h/b/a/n/g;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
