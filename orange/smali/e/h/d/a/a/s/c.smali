.class public Le/h/d/a/a/s/c;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final a:Lcom/orange/oab/contactless/packid/hce/user/User;


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/e;Lcom/orange/oab/contactless/packid/hce/user/User;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p2, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/c;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 4

    .line 2
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 3
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getEmail()Ljava/lang/String;

    move-result-object v1

    const-string v2, "email"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getFirstname()Ljava/lang/String;

    move-result-object v1

    const-string v2, "firstname"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getLastname()Ljava/lang/String;

    move-result-object v1

    const-string v2, "lastname"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    const-string v2, "walletId"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v3, "contactlessId"

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 9
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    :goto_1
    const-string v3, "cipheredUri"

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    :cond_2
    iget-object v1, p0, Le/h/d/a/a/s/c;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v3, "id"

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "user"

    .line 11
    invoke-virtual {p1, v1, v0, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-object v2
.end method
