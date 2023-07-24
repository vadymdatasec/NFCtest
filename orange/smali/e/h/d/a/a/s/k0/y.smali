.class public Le/h/d/a/a/s/k0/y;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final a:Lcom/orange/oab/contactless/packid/hce/user/User;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/hce/user/User;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    return-void
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;",
            ")",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;"
        }
    .end annotation

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_2

    .line 21
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 22
    invoke-static {p1, p2}, Le/h/d/a/a/s/k0/y;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {p2, v2}, Le/h/d/a/a/s/k0/y;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 23
    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    new-instance v3, Le/h/d/a/a/s/k0/g;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Le/h/d/a/a/s/k0/g;-><init>(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    invoke-virtual {v3, p0}, Le/h/d/a/a/s/k0/g;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;"
        }
    .end annotation

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    if-eqz p1, :cond_2

    .line 27
    invoke-static {p1, p2}, Le/h/d/a/a/s/k0/y;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {p1, v2}, Le/h/d/a/a/s/k0/y;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1, p2}, Le/h/d/a/a/s/k0/y;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {p1, v2}, Le/h/d/a/a/s/k0/y;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 29
    invoke-virtual {v2, p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUserId(Ljava/lang/String;)V

    .line 30
    new-instance v3, Le/h/d/a/a/s/k0/c0;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Le/h/d/a/a/s/k0/c0;-><init>(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    invoke-virtual {v3, p0}, Le/h/d/a/a/s/k0/c0;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    goto :goto_0

    .line 31
    :cond_2
    :goto_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    invoke-virtual {v2, p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUserId(Ljava/lang/String;)V

    .line 33
    new-instance v3, Le/h/d/a/a/s/k0/x;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Le/h/d/a/a/s/k0/x;-><init>(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    invoke-virtual {v3, p0}, Le/h/d/a/a/s/k0/z;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 35
    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 19
    invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public a(Landroid/database/sqlite/SQLiteDatabase;)Le/h/d/a/a/p/a/a/a;
    .locals 3

    .line 2
    new-instance v0, Le/h/d/a/a/s/k0/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/h;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/h;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    .line 3
    new-instance v0, Le/h/d/a/a/s/k0/k;

    iget-object v1, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Le/h/d/a/a/s/k0/k;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/k;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    .line 4
    new-instance v0, Le/h/d/a/a/s/k0/s;

    iget-object v1, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/s;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/s;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/s/k0/y;->b(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/s/k0/y;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/lang/String;)Le/h/d/a/a/p/a/a/a;

    move-result-object v0

    .line 7
    iget-object v1, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 8
    iget-object v1, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/y;->c(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;)V

    :cond_0
    return-object v0

    .line 9
    :catch_0
    new-instance v0, Le/h/d/a/a/s/k0/i;

    iget-object v1, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/i;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/i;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    .line 10
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/y;->a(Landroid/database/sqlite/SQLiteDatabase;)Le/h/d/a/a/p/a/a/a;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/lang/String;)Le/h/d/a/a/p/a/a/a;
    .locals 3

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object p2

    .line 16
    :goto_0
    new-instance v0, Le/h/d/a/a/p/a/a/a;

    invoke-direct {v0}, Le/h/d/a/a/p/a/a/a;-><init>()V

    .line 17
    invoke-virtual {v0}, Le/h/d/a/a/p/a/a/a;->b()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v2

    invoke-static {p1, p2, v2}, Le/h/d/a/a/s/k0/y;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 18
    invoke-virtual {v0}, Le/h/d/a/a/p/a/a/a;->a()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v2

    invoke-static {p1, p2, v2, p3}, Le/h/d/a/a/s/k0/y;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/y;->a(Landroid/database/sqlite/SQLiteDatabase;)Le/h/d/a/a/p/a/a/a;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;)Ljava/lang/String;
    .locals 2

    .line 11
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;

    move-result-object p2

    .line 12
    iget-object v0, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v0, p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setId(Ljava/lang/String;)V

    const-string v0, "PersistOrUpdateUser"

    const-string v1, "update user send notification false"

    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    new-instance v0, Le/h/d/a/a/s/k0/e;

    iget-object v1, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/e;-><init>(Lcom/orange/oab/contactless/packid/hce/user/User;)V

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/e;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    return-object p2
.end method

.method public b(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;
    .locals 3

    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1, v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->setId(Ljava/lang/String;)V

    const-string v1, "PersistOrUpdateUser"

    const-string v2, "update user send notification true"

    .line 5
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    new-instance v1, Le/h/d/a/a/s/k0/b0;

    iget-object v2, p0, Le/h/d/a/a/s/k0/y;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-direct {v1, v2}, Le/h/d/a/a/s/k0/b0;-><init>(Lcom/orange/oab/contactless/packid/hce/user/User;)V

    invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/z;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    return-object v0
.end method

.method public final b(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;)Ljava/lang/String;
    .locals 0

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/s/k0/y;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/y;->b(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final c(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;-><init>()V

    .line 2
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setName(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getLogoUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setLogoUrl(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object p2

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->shouldSendEnrollmentNotification()Z

    move-result p2

    invoke-virtual {v0, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setShouldSendEnrollmentNotification(Z)V

    .line 5
    new-instance p2, Le/h/d/a/a/s/k0/a0;

    invoke-direct {p2, v0}, Le/h/d/a/a/s/k0/a0;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V

    invoke-virtual {p2, p1}, Le/h/d/a/a/s/k0/a0;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    return-void
.end method
