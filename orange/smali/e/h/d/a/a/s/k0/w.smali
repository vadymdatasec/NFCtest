.class public Le/h/d/a/a/s/k0/w;
.super Le/h/d/a/a/s/k0/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/h/d/a/a/s/k0/o<",
        "Lcom/orange/oab/contactless/packid/hce/user/User;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, v0}, Le/h/d/a/a/s/k0/w;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 6

    const-string v1, "user"

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    .line 1
    invoke-direct/range {v0 .. v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 3

    .line 10
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;-><init>()V

    const-string v1, "email"

    .line 11
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setEmail(Ljava/lang/String;)V

    const-string v1, "firstname"

    .line 12
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirstname(Ljava/lang/String;)V

    const-string v1, "lastname"

    .line 13
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setLastname(Ljava/lang/String;)V

    .line 14
    new-instance v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    const-string v2, "walletId"

    invoke-virtual {p0, p1, v2}, Le/h/d/a/a/s/k0/w;->b(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setWallet(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)V

    const-string v1, "contactlessId"

    .line 15
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->b(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setContactlessId(Lfr/mbs/binary/Octets;)V

    const-string v1, "cipheredUri"

    .line 16
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->b(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V

    const-string v1, "id"

    .line 17
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setId(Ljava/lang/String;)V

    const-string v1, "simCentric"

    .line 18
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSimCentric(Z)V

    const-string v1, "firebaseEnable"

    .line 19
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirebaseEnable(Z)V

    const-string v1, "premium"

    .line 20
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setPremium(Z)V

    const-string v1, "sendEnrolmentNotification"

    .line 21
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSendEnrolmentNotification(Z)V

    const-string v1, "tenantName"

    .line 22
    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 23
    new-instance v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    invoke-direct {v1, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setTenant(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic a(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            ")",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/User;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-super {p0, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 5
    new-instance v3, Le/h/d/a/a/s/k0/l;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Le/h/d/a/a/s/k0/l;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Le/h/d/a/a/s/k0/l;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object v3

    .line 6
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v4

    invoke-virtual {v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v3

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->isDefault()Z

    move-result v3

    if-nez v3, :cond_0

    .line 8
    new-instance v3, Le/h/d/a/a/s/k0/p;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v4

    invoke-virtual {v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Le/h/d/a/a/s/k0/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Le/h/d/a/a/s/k0/p;->b(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v3

    .line 9
    invoke-virtual {v2, v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->setTenant(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final a(Landroid/database/Cursor;Ljava/lang/String;)Z
    .locals 2

    .line 24
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-eq p2, v1, :cond_0

    .line 25
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getShort(I)S

    move-result p1

    if-lez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final b(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    .line 3
    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 2
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
