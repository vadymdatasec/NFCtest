.class public Le/h/d/a/a/s/a;
.super Le/h/d/a/a/s/k0/d;
.source "SourceFile"


# instance fields
.field public final a:Lfr/mbs/binary/Octets;

.field public final b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/e;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V

    .line 2
    iput-object p2, p0, Le/h/d/a/a/s/a;->a:Lfr/mbs/binary/Octets;

    .line 3
    iput-object p3, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/s/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 5

    .line 2
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 3
    iget-object v1, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v1

    const-string v2, "description"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getLogoFile()Ljava/lang/String;

    move-result-object v1

    const-string v2, "logoFile"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v3, "cipheredWalletKey"

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredUrl()Lfr/mbs/binary/Octets;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    iget-object v1, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredUrl()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    :goto_1
    const-string v3, "cipheredUrl"

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v1, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B

    move-result v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    const-string v3, "rssi"

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Byte;)V

    .line 8
    iget-object v1, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;

    move-result-object v1

    const-string v3, "userId"

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    .line 9
    iget-object v3, p0, Le/h/d/a/a/s/a;->a:Lfr/mbs/binary/Octets;

    invoke-virtual {v3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    iget-object v3, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-virtual {v3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    iget-object v3, p0, Le/h/d/a/a/s/a;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-virtual {v3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v1, v4

    const-string v3, "badge"

    const-string v4, "walletId = ? AND cipheredId = ? AND zoneId = ?"

    .line 10
    invoke-virtual {p1, v3, v0, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-object v2
.end method
