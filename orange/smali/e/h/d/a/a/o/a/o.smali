.class public Le/h/d/a/a/o/a/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/h/d/a/a/o/a/b;


# instance fields
.field public final i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

.field public final j:Le/h/d/a/a/n/w/c;

.field public final k:Lfr/mbs/binary/Octets;

.field public final l:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/n/w/c;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/o/a/o;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/o/a/o;->j:Le/h/d/a/a/n/w/c;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/o/a/o;->k:Lfr/mbs/binary/Octets;

    .line 5
    iput-object p4, p0, Le/h/d/a/a/o/a/o;->l:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public final a(Le/h/c/a/a;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 30
    invoke-virtual {p1}, Le/h/c/a/a;->g()Lg/a/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toInt()I

    move-result v0

    .line 31
    invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/16 v1, 0x26

    if-eq v0, v1, :cond_0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    :cond_0
    return v0

    .line 32
    :cond_1
    new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent Lc on read token APDU "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Le/h/d/a/a/o/a/b;->g:Lfr/mbs/binary/Octets;

    invoke-direct {v0, p1, v1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw v0
.end method

.method public final a(Le/h/c/a/a;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 18
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/o;->b(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v0

    .line 19
    invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/o;->b(Le/h/c/a/a;)Z

    move-result p1

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z

    move-result v1

    if-eq p1, v1, :cond_2

    .line 20
    new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Conditions of use not satisfied on read badge for zone "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "! The badge is "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z

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

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "! Warning: configuration inconsistency between card reader and user wallet!"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Le/h/d/a/a/o/a/b;->d:Lfr/mbs/binary/Octets;

    invoke-direct {p1, p2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw p1

    :cond_2
    return-object v0
.end method

.method public a(Landroid/content/Context;Le/h/c/a/a;)Le/h/d/a/a/o/a/l;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/o;->a(Le/h/c/a/a;)I

    .line 3
    invoke-virtual {p2}, Le/h/c/a/a;->d()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/h/d/a/a/o/a/o;->a(Lfr/mbs/binary/Octets;)V

    .line 4
    invoke-virtual {p2}, Le/h/c/a/a;->j()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/h/d/a/a/o/a/o;->c(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, v0}, Le/h/d/a/a/o/a/o;->a(Landroid/content/Context;Le/h/c/a/a;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 6
    new-instance p2, Le/h/d/a/a/o/a/l;

    invoke-direct {p2, p1, v0}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-object p2
.end method

.method public a()Le/h/d/a/a/o/a/m;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/o/a/m;->b:Le/h/d/a/a/o/a/m;

    return-object v0
.end method

.method public final a(Landroid/content/Context;Le/h/c/a/a;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;,
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 7
    invoke-virtual {p0, p2, p3}, Le/h/d/a/a/o/a/o;->a(Le/h/c/a/a;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v0

    .line 8
    invoke-static {p1, v0}, Le/h/d/a/a/o/a/a;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 9
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/o;->b(Le/h/c/a/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 10
    new-instance p1, Le/h/d/a/a/o/b/a;

    invoke-direct {p1}, Le/h/d/a/a/o/b/a;-><init>()V

    iget-object v1, p0, Le/h/d/a/a/o/a/o;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p2}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object p2

    const/4 v2, 0x6

    const/16 v3, 0x20

    invoke-virtual {p2, v2, v3}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Le/h/d/a/a/o/b/a;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 11
    iget-object p2, p0, Le/h/d/a/a/o/a/o;->k:Lfr/mbs/binary/Octets;

    const/16 v1, 0x10

    invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {p0, p2, v2, p3}, Le/h/d/a/a/o/a/o;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    .line 12
    iget-object p2, p0, Le/h/d/a/a/o/a/o;->l:Lfr/mbs/binary/Octets;

    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->size()I

    move-result v2

    invoke-virtual {p2, v2}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    .line 13
    iget-object p2, p0, Le/h/d/a/a/o/a/o;->l:Lfr/mbs/binary/Octets;

    invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p2, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    .line 14
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1, p3}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    iget-object p2, p0, Le/h/d/a/a/o/a/o;->k:Lfr/mbs/binary/Octets;

    iget-object p3, p0, Le/h/d/a/a/o/a/o;->l:Lfr/mbs/binary/Octets;

    invoke-virtual {p0, v0, p2, p3}, Le/h/d/a/a/o/a/o;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    sget-object p2, Le/h/d/a/a/o/a/b;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1

    .line 15
    :cond_0
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1, p3}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p0, v0}, Le/h/d/a/a/o/a/o;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    sget-object p2, Le/h/d/a/a/o/a/b;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 26
    iget-object v0, p0, Le/h/d/a/a/o/a/o;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 27
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 22
    iget-object v0, p0, Le/h/d/a/a/o/a/o;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 23
    new-instance v1, Le/h/d/a/a/o/b/a;

    invoke-direct {v1}, Le/h/d/a/a/o/b/a;-><init>()V

    .line 24
    iget-object v2, p0, Le/h/d/a/a/o/a/o;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-virtual {v2, v3}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {p2, p3}, Lfr/mbs/binary/Octets;->xor(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {v1, v2, p2}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p2

    .line 25
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v1, p2, p1}, Le/h/d/a/a/o/b/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lfr/mbs/binary/Octets;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 28
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toInt()I

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 29
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a;

    sget-object v0, Le/h/d/a/a/o/a/b;->f:Lfr/mbs/binary/Octets;

    const-string v1, "Unexpected LE on read token APDU"

    invoke-direct {p1, v1, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw p1
.end method

.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 16
    invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 17
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid nonce received on read token secured for zone "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "!"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object p3, Le/h/d/a/a/o/a/b;->e:Lfr/mbs/binary/Octets;

    invoke-direct {p1, p2, p3}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw p1
.end method

.method public final b(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 2
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/o/a/o;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findTokenByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 3
    new-instance v1, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No token to read for zone "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Le/h/d/a/a/o/a/b;->h:Lfr/mbs/binary/Octets;

    invoke-direct {v1, p1, v2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final b(Le/h/c/a/a;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Le/h/c/a/a;->g()Lg/a/a/a;

    move-result-object p1

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toInt()I

    move-result p1

    const/16 v0, 0x26

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x6

    .line 1
    invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method
