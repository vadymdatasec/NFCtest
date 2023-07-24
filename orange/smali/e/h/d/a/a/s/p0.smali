.class public Le/h/d/a/a/s/p0;
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
    .locals 6

    const-string v1, "user"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 4

    .line 2
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;-><init>()V

    const-string v1, "email"

    .line 3
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setEmail(Ljava/lang/String;)V

    const-string v1, "firstname"

    .line 4
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirstname(Ljava/lang/String;)V

    const-string v1, "lastname"

    .line 5
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setLastname(Ljava/lang/String;)V

    .line 6
    new-instance v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    const-string v2, "walletId"

    invoke-static {v2, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setWallet(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)V

    const-string v1, "contactlessId"

    .line 7
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-static {v1}, Le/f/b/a/q;->a(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setContactlessId(Lfr/mbs/binary/Octets;)V

    const-string v1, "cipheredUri"

    .line 9
    invoke-static {v1, p1}, Le/h/d/a/a/m;->a(Ljava/lang/String;Landroid/database/Cursor;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-static {p1}, Le/f/b/a/q;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v3

    :goto_1
    invoke-virtual {v0, v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V

    return-object v0
.end method

.method public bridge synthetic a(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/p0;->a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    return-object p1
.end method
