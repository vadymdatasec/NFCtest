.class public Lcom/orange/hce/proto/activity/NoBadgeActivity$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/hce/proto/activity/NoBadgeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lcom/orange/hce/proto/activity/NoBadgeActivity;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/activity/NoBadgeActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    invoke-static {v0}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->a(Lcom/orange/hce/proto/activity/NoBadgeActivity;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.orange.oab.contactless.packid.action.USER_UPDATED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object p2, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    const/4 v0, 0x0

    const-string v1, "BadgeListActivity"

    invoke-virtual {p2, v1, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p2

    .line 4
    new-instance v1, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v1, p1}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/orange/business/packid/android/lib/PackId;->hasBleBadges()Z

    move-result v1

    const-string v2, "NoBadgeActivity"

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    const-string v3, "hasSeePermissionsActivity"

    invoke-interface {p2, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    new-instance v1, Landroid/content/Intent;

    const-class v4, Lcom/orange/hce/proto/activity/PermissionsActivity;

    invoke-direct {v1, p1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    iget-object p1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    invoke-virtual {p1, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 7
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 8
    iget-object p1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->b(Lcom/orange/hce/proto/activity/NoBadgeActivity;)V

    const-string p1, "Starting PermissionsActivity"

    .line 9
    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 10
    :cond_0
    new-instance p2, Landroid/content/Intent;

    const-class v0, Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 11
    iget-object p1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 12
    iget-object p1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->b(Lcom/orange/hce/proto/activity/NoBadgeActivity;)V

    const-string p1, "Starting BadgeListActivity"

    .line 13
    invoke-static {v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    :goto_0
    iget-object p1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_1

    .line 15
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 16
    iget-object p1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    const-string v0, "message"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->a(Lcom/orange/hce/proto/activity/NoBadgeActivity;Ljava/lang/String;)V

    .line 17
    iget-object p1, p0, Lcom/orange/hce/proto/activity/NoBadgeActivity$a;->a:Lcom/orange/hce/proto/activity/NoBadgeActivity;

    invoke-static {p1}, Lcom/orange/hce/proto/activity/NoBadgeActivity;->b(Lcom/orange/hce/proto/activity/NoBadgeActivity;)V

    :cond_2
    :goto_1
    return-void
.end method
