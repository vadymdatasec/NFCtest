.class public Le/h/d/a/a/o/a/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/h/d/a/a/o/a/b;


# instance fields
.field public final i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

.field public final j:Le/h/d/a/a/n/w/c;

.field public final k:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/o/a/n;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/o/a/n;->j:Le/h/d/a/a/n/w/c;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/o/a/n;->k:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public final a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 13
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/o/a/n;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 14
    new-instance v1, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No badge to read for zone "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Le/h/d/a/a/o/a/b;->h:Lfr/mbs/binary/Octets;

    invoke-direct {v1, p1, v2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public a(Landroid/content/Context;Le/h/c/a/a;)Le/h/d/a/a/o/a/l;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/n;->b(Landroid/content/Context;Le/h/c/a/a;)V

    .line 3
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->e(Le/h/c/a/a;)Le/h/d/a/a/o/a/l;

    move-result-object p1

    return-object p1
.end method

.method public a()Le/h/d/a/a/o/a/m;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/o/a/m;->g:Le/h/d/a/a/o/a/m;

    return-object v0
.end method

.method public final a(Le/h/c/a/a;)Lfr/mbs/binary/Octets;
    .locals 2

    .line 12
    invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/h/c/a/a;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 16
    invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object v0

    const/16 v1, 0x10

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 17
    new-instance v2, Le/h/d/a/a/o/b/a;

    invoke-direct {v2}, Le/h/d/a/a/o/b/a;-><init>()V

    .line 18
    iget-object v3, p0, Le/h/d/a/a/o/a/n;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-virtual {v3, v4}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v3

    .line 19
    iget-object v4, p0, Le/h/d/a/a/o/a/n;->k:Lfr/mbs/binary/Octets;

    invoke-virtual {v2, v3, v4}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-virtual {v4, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 21
    invoke-static {p2}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p2

    iget-object v0, p0, Le/h/d/a/a/o/a/n;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;

    move-result-object p3

    invoke-virtual {v0, p3}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p3

    invoke-virtual {p2, p3}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p2, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 22
    invoke-virtual {v2, v3, p1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    sget-object p2, Le/h/d/a/a/o/a/b;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1

    .line 23
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p3

    const/4 v0, 0x0

    aput-object p3, p2, v0

    const-string p3, "Authentication failed for zone %s, master key is probably wrong!!"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    sget-object p3, Le/h/d/a/a/o/a/b;->e:Lfr/mbs/binary/Octets;

    invoke-direct {p1, p2, p3}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw p1
.end method

.method public final a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 15
    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    iget-object v0, p0, Le/h/d/a/a/o/a/n;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {v0, p2}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    sget-object p2, Le/h/d/a/a/o/a/b;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/o;
        }
    .end annotation

    .line 9
    invoke-static {}, Le/h/d/a/a/h;->c()Le/h/d/a/a/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/h/d/a/a/h;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 10
    :cond_0
    const-class v0, Le/h/d/a/a/o/a/n;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can not reply for locked badge : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    new-instance v0, Lcom/orange/oab/contactless/packid/h/a/o;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Le/h/d/a/a/o/a/b;->e:Lfr/mbs/binary/Octets;

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/orange/oab/contactless/packid/h/a/o;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V

    throw v0
.end method

.method public final a(Le/h/c/a/a;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 4
    invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/n;->d(Le/h/c/a/a;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p2, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid LC value for APDU "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Le/h/d/a/a/o/a/b;->f:Lfr/mbs/binary/Octets;

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw p2

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(ZLcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 6
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z

    move-result v0

    if-eq p1, v0, :cond_2

    .line 7
    new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Conditions of use not satisfied on read badge for zone "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "! The badge is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z

    move-result p2

    const-string v2, "secured"

    const-string v3, "unsecured"

    if-eqz p2, :cond_0

    move-object p2, v2

    goto :goto_0

    :cond_0
    move-object p2, v3

    :goto_0
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " while the read badge transaction is "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "! Warning: configuration inconsistency between card reader and user wallet!"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Le/h/d/a/a/o/a/b;->d:Lfr/mbs/binary/Octets;

    invoke-direct {v0, p1, p2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw v0

    :cond_2
    return-void
.end method

.method public final a(Le/h/c/a/a;I)Z
    .locals 0

    .line 24
    invoke-virtual {p1}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 25
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toInt()I

    move-result p1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Le/h/c/a/a;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 11
    invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/n;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/content/Context;Le/h/c/a/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->c(Le/h/c/a/a;)Z

    move-result v0

    .line 2
    invoke-virtual {p0, p2, v0}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;Z)V

    .line 3
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->b(Le/h/c/a/a;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p2

    .line 4
    invoke-virtual {p0, v0, p2}, Le/h/d/a/a/o/a/n;->a(ZLcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 5
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 6
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 7
    invoke-static {p1, p2}, Le/h/d/a/a/o/a/a;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    return-void
.end method

.method public final b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 8
    invoke-static {p1}, Le/h/d/a/a/i;->f(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 9
    :cond_0
    new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Conditions of use not satisfied on read badge for zone "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "! Cannot perform nfc operation on BLE only badge!"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Le/h/d/a/a/o/a/b;->d:Lfr/mbs/binary/Octets;

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V

    throw v0
.end method

.method public final c(Le/h/c/a/a;)Z
    .locals 1

    const/16 v0, 0x26

    .line 1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;I)Z

    move-result p1

    return p1
.end method

.method public final d(Le/h/c/a/a;)Z
    .locals 1

    const/4 v0, 0x6

    .line 1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;I)Z

    move-result p1

    return p1
.end method

.method public final e(Le/h/c/a/a;)Le/h/d/a/a/o/a/l;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/n;->b(Le/h/c/a/a;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/o/a/n;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 5
    :goto_0
    new-instance v1, Le/h/d/a/a/o/a/l;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-object v1
.end method
