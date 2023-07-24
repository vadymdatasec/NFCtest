.class public Le/h/d/a/a/s/e;
.super Le/h/d/a/a/s/h0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/h/d/a/a/s/h0;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "MultiAccountDbMigrator"

    const-string v2, "Begin DB migration to MultiAccount"

    .line 1
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string v2, "cipheredUri"

    const-string v3, "id"

    const-string v4, "simCentric"

    .line 2
    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "CREATE TABLE user (contactlessId TEXT  UNIQUE,email TEXT,firstname TEXT,lastname TEXT,walletId TEXT,cipheredUri TEXT PRIMARY KEY,simCentric BOOLEAN DEFAULT 0,id TEXT UNIQUE);"

    const-string v4, "user"

    invoke-virtual {v0, v3, v4, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v5, "userId"

    const-string v6, "bleSessionTimeout"

    const-string v7, "tempoAfterBadgeOk"

    const-string v8, "delayAfterBadgeOk"

    const-string v9, "nfcOnly"

    const-string v10, "badgeStatus"

    const-string v11, "conditionToBeginTransaction"

    const-string v12, "manualConnectionAllowed"

    const-string v13, "rssiButtonInterval"

    const-string v14, "rssiDurationForButtonComputation"

    const-string v15, "contactlessType"

    const-string v16, "lockable"

    const-string v17, "unlockedDuration"

    const-string v18, "unlockableByZoneID"

    .line 3
    filled-new-array/range {v5 .. v18}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"

    const-string v4, "badge"

    invoke-virtual {v0, v3, v4, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const-string v2, "Begin data migration to MultiAccount"

    .line 4
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    invoke-virtual/range {p0 .. p0}, Le/h/d/a/a/s/e;->b()V

    const-string v2, "End migration to MultiAccount"

    .line 6
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final b()V
    .locals 6

    const-string v0, "MultiAccountDbMigrator"

    .line 1
    :try_start_0
    new-instance v1, Le/h/d/a/a/s/i0;

    iget-object v2, p0, Le/h/d/a/a/s/h0;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Le/h/d/a/a/s/i0;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Le/h/d/a/a/s/i0;->b()Lfr/mbs/binary/Octets;

    move-result-object v1

    .line 2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cipheredUri found "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    new-instance v2, Le/h/d/a/a/s/s0;

    invoke-direct {v2, p0}, Le/h/d/a/a/s/s0;-><init>(Le/h/d/a/a/s/e;)V

    iget-object v3, p0, Le/h/d/a/a/s/h0;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2, v3}, Le/h/d/a/a/s/s0;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v2

    .line 4
    invoke-virtual {v2, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V

    .line 5
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setId(Ljava/lang/String;)V

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "User found for contactlessId: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 8
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUserId(Ljava/lang/String;)V

    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Badge found for with cipheredBadgeID: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;

    move-result-object v5

    invoke-virtual {v5}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    new-instance v4, Le/h/d/a/a/s/a;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v5

    invoke-virtual {v5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object v5

    invoke-direct {v4, p0, v5, v3}, Le/h/d/a/a/s/a;-><init>(Le/h/d/a/a/s/e;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    iget-object v3, p0, Le/h/d/a/a/s/h0;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v4, v3}, Le/h/d/a/a/s/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    goto :goto_0

    .line 11
    :cond_0
    new-instance v1, Le/h/d/a/a/s/c;

    invoke-direct {v1, p0, v2}, Le/h/d/a/a/s/c;-><init>(Le/h/d/a/a/s/e;Lcom/orange/oab/contactless/packid/hce/user/User;)V

    iget-object v2, p0, Le/h/d/a/a/s/h0;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1, v2}, Le/h/d/a/a/s/c;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    .line 12
    new-instance v1, Le/h/d/a/a/s/i0;

    iget-object v2, p0, Le/h/d/a/a/s/h0;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Le/h/d/a/a/s/i0;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Le/h/d/a/a/s/i0;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    const-string v2, "Can\'t migrate User URI file to User DB"

    .line 13
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method
