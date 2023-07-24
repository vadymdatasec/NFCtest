.class public Lcom/orange/hce/proto/activity/BadgeListActivity$f;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/hce/proto/activity/BadgeListActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lcom/orange/hce/proto/activity/BadgeListActivity;


# direct methods
.method public constructor <init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/orange/hce/proto/activity/BadgeListActivity;Lcom/orange/hce/proto/activity/BadgeListActivity$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/orange/hce/proto/activity/BadgeListActivity$f;-><init>(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final b(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "reason"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    sget-object v0, Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;->ENCRYPTION_ERROR:Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "userUpdateReceiver onReceive "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "reason"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " with reason "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.BadgeList"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-static {v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->c(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    .line 3
    invoke-virtual {p0, p2}, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->b(Landroid/content/Intent;)Z

    move-result v0

    const-string v1, "message"

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Lcom/orange/hce/proto/activity/BadgeListActivity;Ljava/lang/String;)V

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {p0, p2}, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->c(Ljava/lang/String;)V

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v0, "com.orange.oab.contactless.packid.action.USER_UPDATED"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 8
    iget-object p2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-static {p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->d(Lcom/orange/hce/proto/activity/BadgeListActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 9
    iget-object p2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-static {p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->d(Lcom/orange/hce/proto/activity/BadgeListActivity;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 10
    :cond_3
    iget-object p2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-static {p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->e(Lcom/orange/hce/proto/activity/BadgeListActivity;)Landroid/app/ProgressDialog;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 11
    iget-object p2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-static {p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->e(Lcom/orange/hce/proto/activity/BadgeListActivity;)Landroid/app/ProgressDialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/ProgressDialog;->dismiss()V

    .line 12
    iget-object p2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/orange/hce/proto/activity/BadgeListActivity;->a(Lcom/orange/hce/proto/activity/BadgeListActivity;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;

    .line 13
    :cond_4
    new-instance p2, Lcom/orange/business/packid/android/lib/PackId;

    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-direct {p2, v0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/orange/business/packid/android/lib/PackId;->hasBleBadges()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-static {p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->f(Lcom/orange/hce/proto/activity/BadgeListActivity;)Z

    move-result p2

    if-nez p2, :cond_5

    .line 14
    iget-object p2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-static {p2}, Lcom/orange/hce/proto/activity/BadgeListActivity;->g(Lcom/orange/hce/proto/activity/BadgeListActivity;)V

    .line 15
    :cond_5
    invoke-static {p1}, Lcom/orange/hce/proto/widget/PackIdWidgetProvider;->c(Landroid/content/Context;)V

    .line 16
    :cond_6
    :goto_1
    new-instance p2, Lcom/orange/business/packid/android/lib/PackId;

    iget-object v0, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    invoke-direct {p2, v0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 17
    iget-object p2, p0, Lcom/orange/hce/proto/activity/BadgeListActivity$f;->a:Lcom/orange/hce/proto/activity/BadgeListActivity;

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/orange/hce/proto/activity/NoBadgeActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_7
    return-void
.end method
