.class public Lcom/orange/oab/contactless/packid/service/UpdateUsersService;
.super Landroidx/core/app/JobIntentService;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/core/app/JobIntentService;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;ZZLjava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Le/h/d/a/a/n/r;

    invoke-direct {v0, p1}, Le/h/d/a/a/n/r;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p2, p3, p4}, Le/h/d/a/a/n/r;->a(ZZLjava/lang/String;)V

    return-void
.end method

.method public onHandleWork(Landroid/content/Intent;)V
    .locals 4

    const-string v0, "alertOnNetworkError"

    const/4 v1, 0x1

    .line 1
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    const-string v1, "sendUsersUpdatedIntent"

    const/4 v2, 0x0

    .line 2
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    const-string v2, "firebaseRegistrationId"

    .line 3
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Update user from server "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    const-string v3, "with"

    goto :goto_0

    :cond_0
    const-string v3, "without"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " alert on errors"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "packid.UpUserService"

    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-virtual {p0, p0, v0, v1, p1}, Lcom/orange/oab/contactless/packid/service/UpdateUsersService;->a(Landroid/content/Context;ZZLjava/lang/String;)V

    return-void
.end method
