.class public Lcom/orange/oab/contactless/packid/service/PackIdUserService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;
    }
.end annotation


# instance fields
.field public final b:Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;

    invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdUserService;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdUserService;->b:Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;

    return-void
.end method


# virtual methods
.method public createDefaultUser()Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 1

    .line 1
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->createDefaultUser()Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v0

    return-object v0
.end method

.method public delete()V
    .locals 1

    .line 1
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->clear()V

    return-void
.end method

.method public get()Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/service/NoUserException;,
            Lcom/orange/oab/contactless/packid/service/MultiUsersException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdUserService;->getAll()Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User;

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Lcom/orange/oab/contactless/packid/service/MultiUsersException;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/service/MultiUsersException;-><init>()V

    throw v0
.end method

.method public get(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/service/NoUserException;
        }
    .end annotation

    .line 5
    invoke-static {p0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 6
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/service/NoUserException;

    invoke-direct {p1}, Lcom/orange/oab/contactless/packid/service/NoUserException;-><init>()V

    throw p1
.end method

.method public getAll()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/User;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/service/NoUserException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lcom/orange/oab/contactless/packid/service/NoUserException;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/service/NoUserException;-><init>()V

    throw v0
.end method

.method public isHceFeatureSupported()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Service;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.nfc.hce"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public isNfcEnabled()Z
    .locals 1

    const-string v0, "nfc"

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Service;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/nfc/NfcManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/nfc/NfcManager;->getDefaultAdapter()Landroid/nfc/NfcAdapter;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string p1, "packid.UserService"

    const-string v0, "onBind called"

    .line 1
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdUserService;->b:Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;

    return-object p1
.end method

.method public register(Landroid/net/Uri;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;->register(Landroid/net/Uri;)V

    return-void
.end method

.method public update()V
    .locals 2

    .line 1
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackId;->update(Z)V

    return-void
.end method

.method public update(Z)V
    .locals 1

    .line 2
    new-instance v0, Lcom/orange/business/packid/android/lib/PackId;

    invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;->update(Z)V

    return-void
.end method
