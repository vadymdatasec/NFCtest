.class public Le/h/d/a/a/s/s0;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final synthetic a:Le/h/d/a/a/s/e;


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/h/d/a/a/s/s0;->a:Le/h/d/a/a/s/e;

    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 4

    .line 2
    new-instance v0, Le/h/d/a/a/s/p0;

    invoke-direct {v0}, Le/h/d/a/a/s/p0;-><init>()V

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 5
    new-instance v1, Le/h/d/a/a/s/q0;

    iget-object v2, p0, Le/h/d/a/a/s/s0;->a:Le/h/d/a/a/s/e;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v3

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Le/h/d/a/a/s/q0;-><init>(Le/h/d/a/a/s/e;Lfr/mbs/binary/Octets;)V

    invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object v1

    .line 6
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v2

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 8
    new-instance v1, Le/h/d/a/a/s/k0/p;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v2

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Le/h/d/a/a/s/k0/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/p;->b(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setTenant(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V

    :cond_1
    return-object v0
.end method

.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/s0;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    return-object p1
.end method
