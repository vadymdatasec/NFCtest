.class public Le/h/d/a/a/o/a/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/h/d/a/a/o/a/b;


# instance fields
.field public final i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

.field public final j:Le/h/d/a/a/n/w/c;

.field public final k:Lfr/mbs/binary/Octets;

.field public final l:Lfr/mbs/binary/Octets;

.field public final m:Le/h/d/a/a/o/a/m;


# direct methods
.method public constructor <init>(Le/h/d/a/a/o/a/m;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/o/a/s;->m:Le/h/d/a/a/o/a/m;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/o/a/s;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/o/a/s;->j:Le/h/d/a/a/n/w/c;

    .line 5
    iput-object p4, p0, Le/h/d/a/a/o/a/s;->k:Lfr/mbs/binary/Octets;

    .line 6
    iput-object p5, p0, Le/h/d/a/a/o/a/s;->l:Lfr/mbs/binary/Octets;

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

    .line 14
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/o/a/s;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findTokenByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 15
    new-instance v1, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No token to write for zone "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Le/h/d/a/a/o/a/b;->h:Lfr/mbs/binary/Octets;

    invoke-direct {v1, p1, v2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public a(Landroid/content/Context;Le/h/c/a/a;)Le/h/d/a/a/o/a/l;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 2
    :try_start_0
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/s;->a(Le/h/c/a/a;)Le/h/d/a/a/o/a/l;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    new-instance p2, Lcom/orange/oab/contactless/packid/h/a/a;

    sget-object v0, Le/h/d/a/a/o/a/b;->h:Lfr/mbs/binary/Octets;

    const-string v1, "Unexpected APDU data"

    invoke-direct {p2, v1, v0, p1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final a(Le/h/c/a/a;)Le/h/d/a/a/o/a/l;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 4
    invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 5
    invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->getLastFrom(I)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 6
    invoke-virtual {p0, v0}, Le/h/d/a/a/o/a/s;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v1

    .line 7
    invoke-virtual {p0}, Le/h/d/a/a/o/a/s;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1, p1}, Le/h/d/a/a/o/a/s;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 8
    :cond_0
    invoke-static {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v2

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Le/h/d/a/a/o/a/s;->a(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V

    .line 9
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/o/a/s;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 10
    new-instance p1, Le/h/d/a/a/o/a/l;

    sget-object v1, Le/h/d/a/a/o/a/b;->a:Lfr/mbs/binary/Octets;

    invoke-direct {p1, v1, v0}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-object p1
.end method

.method public a()Le/h/d/a/a/o/a/m;
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/o/a/s;->m:Le/h/d/a/a/o/a/m;

    return-object v0
.end method

.method public a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 11
    new-instance v0, Le/h/d/a/a/o/b/a;

    invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V

    .line 12
    iget-object v1, p0, Le/h/d/a/a/o/a/s;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    iget-object v1, p0, Le/h/d/a/a/o/a/s;->k:Lfr/mbs/binary/Octets;

    iget-object v2, p0, Le/h/d/a/a/o/a/s;->l:Lfr/mbs/binary/Octets;

    invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->xor(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 13
    invoke-virtual {v0, p1, p2}, Le/h/d/a/a/o/b/a;->d(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 21
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/s;->e(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/s;->b(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/s;->d(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/s;->c(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 25
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a;

    sget-object p2, Le/h/d/a/a/o/a/b;->h:Lfr/mbs/binary/Octets;

    const-string v0, "Invalid token header"

    invoke-direct {p1, v0, p2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw p1
.end method

.method public final a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 16
    iget-object v0, p0, Le/h/d/a/a/o/a/s;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    .line 17
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    sub-int/2addr v1, v0

    .line 18
    invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 19
    iget-object v2, p0, Le/h/d/a/a/o/a/s;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {v2, v0}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V

    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-static {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V

    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/o/a/s;->k:Lfr/mbs/binary/Octets;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Le/h/d/a/a/o/a/s;->l:Lfr/mbs/binary/Octets;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z
    .locals 0

    .line 2
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApiVersionNumber()I

    move-result p1

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApiVersionNumber()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getExpirationDate()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getExpirationDate()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    div-long/2addr p1, v2

    cmp-long v2, v0, p1

    if-nez v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getId()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "token to write sequence number = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " actual sequence number ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " -1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.nfc.Write"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I

    move-result p1

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I

    move-result p2

    const/4 v0, 0x1

    sub-int/2addr p2, v0

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
