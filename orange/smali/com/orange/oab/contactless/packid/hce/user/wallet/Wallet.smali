.class public Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEFAULT_WALLET_ID:Lfr/mbs/binary/Octets;


# instance fields
.field public a:Lfr/mbs/binary/Octets;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "F1F1F1F1F1F1F1F1F1F1F1F1F1F1F1F1"

    .line 1
    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    sput-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->DEFAULT_WALLET_ID:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Le/f/b/b/k;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->b:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->a:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public constructor <init>(Lfr/mbs/binary/Octets;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {}, Le/f/b/b/k;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->b:Ljava/util/List;

    .line 6
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->a:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public static defaultWallet(Landroid/content/Context;Le/h/d/a/a/n/w/c;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->DEFAULT_WALLET_ID:Lfr/mbs/binary/Octets;

    invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>(Lfr/mbs/binary/Octets;)V

    .line 2
    iget-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->b:Ljava/util/List;

    invoke-static {p0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->defaultSecuredBadge(Landroid/content/Context;Le/h/d/a/a/n/w/c;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_1
    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    .line 3
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->a:Lfr/mbs/binary/Octets;

    iget-object p1, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 2
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 3
    :cond_1
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException;

    invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException;-><init>(Lfr/mbs/binary/Octets;)V

    throw v0
.end method

.method public findTokenByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 2
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isToken()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 3
    :cond_1
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException;

    invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException;-><init>(Lfr/mbs/binary/Octets;)V

    throw v0
.end method

.method public getBadges()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->b:Ljava/util/List;

    return-object v0
.end method

.method public getId()Lfr/mbs/binary/Octets;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->a:Lfr/mbs/binary/Octets;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/a;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/a;-><init>()V

    throw v0
.end method

.method public getZones()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Le/f/b/b/k;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 3
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 2
    iget-object v1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
