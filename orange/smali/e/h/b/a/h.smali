.class public abstract Le/h/b/a/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ILcom/orange/hce/proto/activity/PermissionsActivity;[Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 1

    const-string p4, "$activity"

    invoke-static {p1, p4}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "$permList"

    invoke-static {p2, p4}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p4, 0x2b68

    if-ne p0, p4, :cond_0

    .line 11
    new-instance p0, Landroid/content/Intent;

    const-string p2, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {p0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 p2, 0x10000000

    .line 12
    invoke-virtual {p0, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 13
    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object p2

    const/4 p4, 0x0

    const-string v0, "package"

    invoke-static {v0, p2, p4}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 14
    invoke-virtual {p0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 15
    invoke-virtual {p1, p0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1, p2, p0}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 17
    :goto_0
    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static final a(Lc/b/k/r;I)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1f
    .end annotation

    const-string v0, "activity"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.BLUETOOTH_SCAN"

    .line 21
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "android.permission.BLUETOOTH_CONNECT"

    invoke-static {p0, v1}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final a(Lcom/orange/hce/proto/activity/PermissionsActivity;I)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1e
    .end annotation

    const-string v0, "activity"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 1
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 2
    invoke-static {p0, v1}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Lc/b/k/p;

    invoke-direct {v1, p0}, Lc/b/k/p;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0e0100

    .line 5
    invoke-virtual {v1, v2}, Lc/b/k/p;->b(I)Lc/b/k/p;

    const v2, 0x7f0e00ff

    .line 6
    invoke-virtual {v1, v2}, Lc/b/k/p;->a(I)Lc/b/k/p;

    const v2, 0x7f0e017b

    .line 7
    new-instance v3, Le/h/b/a/c;

    invoke-direct {v3, p1, p0, v0}, Le/h/b/a/c;-><init>(ILcom/orange/hce/proto/activity/PermissionsActivity;[Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, Lc/b/k/p;->b(ILandroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;

    const p1, 0x7f0e00db

    .line 8
    new-instance v0, Le/h/b/a/b;

    invoke-direct {v0, p0}, Le/h/b/a/b;-><init>(Lcom/orange/hce/proto/activity/PermissionsActivity;)V

    invoke-virtual {v1, p1, v0}, Lc/b/k/p;->a(ILandroid/content/DialogInterface$OnClickListener;)Lc/b/k/p;

    .line 9
    invoke-virtual {v1}, Lc/b/k/p;->a()Lc/b/k/q;

    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public static final a(Lcom/orange/hce/proto/activity/PermissionsActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p2, "$activity"

    invoke-static {p0, p2}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lcom/orange/hce/proto/activity/PermissionsActivity;->h(I)V

    .line 20
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/PermissionsActivity;->z()V

    return-void
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permission"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-static {p0, p1}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(Lc/b/k/r;I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1c
    .end annotation

    const-string v0, "activity"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 1
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public static final b(Lcom/orange/hce/proto/activity/PermissionsActivity;I)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1e
    .end annotation

    const-string v0, "activity"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 4
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "android.permission.ACCESS_BACKGROUND_LOCATION"

    invoke-static {p0, v1}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 p1, 0x2b68

    .line 6
    invoke-static {p0, p1}, Le/h/b/a/h;->a(Lcom/orange/hce/proto/activity/PermissionsActivity;I)V

    return-void

    .line 7
    :cond_1
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return-void
.end method

.method public static final c(Lc/b/k/r;I)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    const-string v0, "activity"

    invoke-static {p0, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 1
    invoke-static {p0, v0}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    const-string v2, "android.permission.ACCESS_BACKGROUND_LOCATION"

    if-eqz v1, :cond_0

    .line 2
    invoke-static {p0, v2}, Le/h/b/a/h;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 3
    :cond_0
    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    return-void
.end method
