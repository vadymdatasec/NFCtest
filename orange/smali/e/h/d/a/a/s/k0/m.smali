.class public Le/h/d/a/a/s/k0/m;
.super Le/h/d/a/a/s/k0/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/h/d/a/a/s/k0/o<",
        "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v2, "description"

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "badge"

    .line 2
    invoke-direct {p0, v0, p1, p2, p3}, Le/h/d/a/a/s/k0/m;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Landroid/database/Cursor;Ljava/lang/String;)Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Le/h/d/a/a/s/k0/m;->g(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_1

    .line 2
    invoke-interface {p0, p1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static e(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    .line 2
    invoke-interface {p0, p1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 3
    :cond_0
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_1

    .line 2
    invoke-interface {p0, p1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static g(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result p1

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 7

    const-string v0, "cipheredId"

    .line 2
    invoke-static {p1, v0}, Le/h/d/a/a/s/k0/m;->g(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v3

    const-string v0, "zoneId"

    .line 3
    invoke-static {p1, v0}, Le/h/d/a/a/s/k0/m;->g(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v2

    const-string v0, "cipheredWalletKey"

    .line 4
    invoke-static {p1, v0}, Le/h/d/a/a/s/k0/m;->e(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v5

    const-string v0, "description"

    .line 5
    invoke-static {p1, v0}, Le/h/d/a/a/s/k0/m;->g(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v0, "maskedId"

    .line 6
    invoke-static {p1, v0}, Le/h/d/a/a/s/k0/m;->g(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 7
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;)V

    const-string v1, "logoFile"

    .line 8
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->g(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLogoFile(Ljava/lang/String;)V

    const-string v1, "cipheredTokenDataSignature"

    .line 9
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->e(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V

    const-string v1, "tokenData"

    .line 10
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->e(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {v1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V

    const-string v1, "cipheredUrl"

    .line 12
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->e(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredUrl(Lfr/mbs/binary/Octets;)V

    .line 13
    new-instance v1, Ljava/util/Date;

    const-string v2, "regenerationDate"

    invoke-static {v2, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRegenerationDate(Ljava/util/Date;)V

    const-string v1, "isTransactionAllowed"

    .line 14
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTransactionAllowed(Z)V

    const-string v1, "rssi"

    .line 15
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getShort(I)S

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssi(B)V

    const-string v1, "rssiButtonInterval"

    .line 16
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getShort(I)S

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssiButtonInterval(B)V

    const-string v1, "userId"

    .line 17
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->g(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUserId(Ljava/lang/String;)V

    const-string v1, "bleSessionTimeout"

    .line 18
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setBleSessionTimeout(Ljava/lang/Integer;)V

    const-string v1, "delayAfterBadgeOk"

    .line 19
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setDelayAfterBadgeOk(Ljava/lang/Integer;)V

    .line 20
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/s/k0/m;->a(Landroid/database/Cursor;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    const-string v1, "lockable"

    .line 21
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/m;->a(Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLockable(Z)V

    const-string v1, "unlockableByZoneID"

    .line 22
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->e(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUnlockableByZoneID(Lfr/mbs/binary/Octets;)V

    const-string v1, "unlockedDuration"

    .line 23
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUnlockedDuration(Ljava/lang/Integer;)V

    const-string v1, "badgeStatus"

    .line 24
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->c(Landroid/database/Cursor;Ljava/lang/String;)Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setStatus(Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;)V

    const-string v1, "conditionToBeginTransaction"

    .line 25
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->g(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setConditionToBeginTransaction(Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;)V

    const-string v1, "manualConnectionAllowed"

    .line 26
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/m;->a(Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setManualConnectionAllowed(Z)V

    .line 27
    invoke-static {}, Le/h/d/a/a/h;->c()Le/h/d/a/a/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/h/d/a/a/h;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLocked(Z)V

    const-string v1, "rssiDurationForButtonComputation"

    .line 28
    invoke-static {p1, v1}, Le/h/d/a/a/s/k0/m;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 29
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x2

    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssiDurationForButtonComputation(Ljava/lang/Integer;)V

    return-object v0
.end method

.method public bridge synthetic a(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/m;->a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1

    return-object p1
.end method

.method public final a(Landroid/database/Cursor;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 1

    .line 31
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/m;->b(Landroid/database/Cursor;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/s/k0/m;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/database/Cursor;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/database/Cursor;)V
    .locals 2

    const-string v0, "contactlessType"

    .line 33
    invoke-virtual {p0, p2, v0}, Le/h/d/a/a/s/k0/m;->b(Landroid/database/Cursor;Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessType(Lcom/orange/oab/contactless/packid/ContactlessType;)V

    .line 35
    invoke-virtual {p0, v0}, Le/h/d/a/a/s/k0/m;->a(Lcom/orange/oab/contactless/packid/ContactlessType;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    new-instance v0, Le/h/d/a/a/l;

    invoke-direct {v0}, Le/h/d/a/a/l;-><init>()V

    const-string v1, "contactlessTypePersonalisedUp"

    .line 37
    invoke-virtual {p0, p2, v1}, Le/h/d/a/a/s/k0/m;->b(Landroid/database/Cursor;Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/l;->b(Lcom/orange/oab/contactless/packid/ContactlessType;)V

    const-string v1, "contactlessTypePersonalisedDown"

    .line 38
    invoke-virtual {p0, p2, v1}, Le/h/d/a/a/s/k0/m;->b(Landroid/database/Cursor;Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/l;->a(Lcom/orange/oab/contactless/packid/ContactlessType;)V

    const-string v1, "contactlessTypePersonalisedVersion"

    .line 39
    invoke-static {p2, v1}, Le/h/d/a/a/s/k0/m;->d(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Le/h/d/a/a/l;->a(Ljava/lang/Integer;)V

    .line 40
    invoke-virtual {p1, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessTypeInformation(Le/h/d/a/a/l;)V

    :cond_0
    return-void
.end method

.method public final a(Landroid/database/Cursor;Ljava/lang/String;)Z
    .locals 0

    .line 30
    invoke-static {p2, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result p2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getShort(I)S

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final a(Lcom/orange/oab/contactless/packid/ContactlessType;)Z
    .locals 1

    .line 41
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->PERSONALISED:Lcom/orange/oab/contactless/packid/ContactlessType;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Landroid/database/Cursor;Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 0

    .line 2
    invoke-static {p1, p2}, Le/h/d/a/a/s/k0/m;->f(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/orange/oab/contactless/packid/ContactlessType;->valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/database/Cursor;)Z
    .locals 1

    const-string v0, "contactlessType"

    .line 1
    invoke-static {p1, v0}, Le/h/d/a/a/s/k0/m;->f(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
