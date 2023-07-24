.class public Le/h/d/a/a/o/a/r;
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
    iput-object p1, p0, Le/h/d/a/a/o/a/r;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/o/a/r;->j:Le/h/d/a/a/n/w/c;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/o/a/r;->k:Lfr/mbs/binary/Octets;

    .line 5
    iput-object p4, p0, Le/h/d/a/a/o/a/r;->l:Lfr/mbs/binary/Octets;

    return-void
.end method


# virtual methods
.method public final a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 13
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/o/a/r;->i:Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findTokenByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 14
    :catch_0
    new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No token found for zone with id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Le/h/d/a/a/o/a/b;->h:Lfr/mbs/binary/Octets;

    invoke-direct {v0, p1, v1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw v0
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
    invoke-virtual {p2}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object p1

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/r;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v1

    .line 4
    invoke-virtual {p2}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p2, v0}, Lfr/mbs/binary/Octets;->getLastFrom(I)Lfr/mbs/binary/Octets;

    move-result-object p2

    .line 5
    invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/r;->b(Lfr/mbs/binary/Octets;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1, p2}, Le/h/d/a/a/o/a/r;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p2

    .line 6
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/o/a/r;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 8
    new-instance p2, Le/h/d/a/a/o/a/l;

    sget-object v0, Le/h/d/a/a/o/a/b;->a:Lfr/mbs/binary/Octets;

    invoke-direct {p2, v0, p1}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-object p2

    .line 9
    :cond_1
    new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a;

    sget-object p2, Le/h/d/a/a/o/a/b;->e:Lfr/mbs/binary/Octets;

    const-string v0, "Unexpected token signature"

    invoke-direct {p1, v0, p2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    throw p1
.end method

.method public a()Le/h/d/a/a/o/a/m;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/o/a/m;->e:Le/h/d/a/a/o/a/m;

    return-object v0
.end method

.method public a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 10
    new-instance v0, Le/h/d/a/a/o/b/a;

    invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V

    .line 11
    iget-object v1, p0, Le/h/d/a/a/o/a/r;->j:Le/h/d/a/a/n/w/c;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    iget-object v1, p0, Le/h/d/a/a/o/a/r;->k:Lfr/mbs/binary/Octets;

    iget-object v2, p0, Le/h/d/a/a/o/a/r;->l:Lfr/mbs/binary/Octets;

    invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->xor(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 12
    invoke-virtual {v0, p1, p2}, Le/h/d/a/a/o/b/a;->d(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lfr/mbs/binary/Octets;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
