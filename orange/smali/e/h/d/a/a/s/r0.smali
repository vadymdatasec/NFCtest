.class public abstract Le/h/d/a/a/s/r0;
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
.method public constructor <init>(Le/h/d/a/a/s/e;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v1, "badge"

    const-string v2, "description"

    move-object v0, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 7

    const-string v0, "cipheredId"

    .line 5
    invoke-static {v0, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v3

    const-string v0, "zoneId"

    .line 6
    invoke-static {v0, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v2

    const-string v0, "cipheredWalletKey"

    .line 7
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v5

    const-string v0, "description"

    .line 8
    invoke-static {v0, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v0, "maskedId"

    .line 9
    invoke-static {v0, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 10
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;)V

    const-string v1, "logoFile"

    .line 11
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLogoFile(Ljava/lang/String;)V

    const-string v1, "cipheredTokenDataSignature"

    .line 12
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V

    const-string v1, "tokenData"

    .line 13
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 14
    :cond_0
    invoke-static {v1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V

    const-string v1, "cipheredUrl"

    .line 15
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredUrl(Lfr/mbs/binary/Octets;)V

    .line 16
    new-instance v1, Ljava/util/Date;

    const-string v2, "regenerationDate"

    invoke-static {v2, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRegenerationDate(Ljava/util/Date;)V

    const-string v1, "isTransactionAllowed"

    .line 17
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

    .line 18
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getShort(I)S

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssi(B)V

    const-string v1, "rssiButtonInterval"

    .line 19
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getShort(I)S

    move-result p1

    int-to-byte p1, p1

    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssiButtonInterval(B)V

    return-object v0
.end method

.method public final a(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 1

    .line 2
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p2

    .line 3
    invoke-interface {p1, p2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 4
    :cond_0
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/r0;->a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1

    return-object p1
.end method
