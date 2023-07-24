.class public Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final b:Landroid/content/Context;

.field public c:Lcom/orange/oab/contactless/packid/hce/user/User;

.field public final d:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;->b:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;->c:Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 4
    iput-object p3, p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;->d:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;->c:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v1

    iget-object v2, p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;->d:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Le/h/d/a/a/r/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    .line 2
    :try_start_0
    new-instance v0, Le/h/d/a/a/n/n;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$a;->d:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-direct {v0, v1, v2}, Le/h/d/a/a/n/n;-><init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    invoke-virtual {v0}, Le/h/d/a/a/n/n;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t update token to server: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.contacless"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
