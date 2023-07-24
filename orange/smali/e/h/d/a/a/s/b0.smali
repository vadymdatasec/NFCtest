.class public Le/h/d/a/a/s/b0;
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
    .locals 22

    move-object/from16 v1, p0

    const-string v0, "text"

    const-string v2, "badge"

    :try_start_0
    const-string v3, "cipheredId"

    .line 1
    invoke-virtual {v1, v2, v3, v0}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "maskedId"

    .line 2
    invoke-virtual {v1, v2, v3, v0}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    new-instance v0, Le/h/d/a/a/s/x;

    invoke-direct {v0}, Le/h/d/a/a/s/x;-><init>()V

    .line 4
    iget-object v3, v1, Le/h/d/a/a/s/h0;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v3}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object v0

    .line 5
    invoke-virtual {v1, v0}, Le/h/d/a/a/s/b0;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "CREATE TABLE tokenTransaction (id TEXT PRIMARY KEY, zoneId TEXT, transactionDate NUMERIC, amountInCents INTEGER, description TEXT);"

    const-string v3, "tokenTransaction"

    :try_start_1
    const-string v4, "tokenId"

    .line 6
    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v0, v3, v4}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v0, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"

    :try_start_2
    const-string v3, "badgeId"

    const-string v4, "logoFile"

    const-string v5, "regenerationDate"

    const-string v6, "isTransactionAllowed"

    const-string v7, "rssi"

    const-string v8, "rssiButtonInterval"

    const-string v9, "rssiDurationForButtonComputation"

    const-string v10, "userId"

    const-string v11, "bleSessionTimeout"

    const-string v12, "tempoAfterBadgeOk"

    const-string v13, "delayAfterBadgeOk"

    const-string v14, "nfcOnly"

    const-string v15, "badgeStatus"

    const-string v16, "conditionToBeginTransaction"

    const-string v17, "manualConnectionAllowed"

    const-string v18, "contactlessType"

    const-string v19, "lockable"

    const-string v20, "unlockedDuration"

    const-string v21, "unlockableByZoneID"

    .line 7
    filled-new-array/range {v3 .. v21}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    iget-object v2, v1, Le/h/d/a/a/s/h0;->a:Landroid/content/Context;

    sget v3, Le/h/d/a/a/c;->encryption_failed_caused_by_old_version:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/orange/oab/contactless/packid/report/ReportSender;->send(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le/h/d/a/a/s/z;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/s/h0;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/n/w/c;->b(Landroid/content/Context;)Le/h/d/a/a/n/w/c;

    move-result-object v0

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/h/d/a/a/s/z;

    .line 12
    iget-object v2, v1, Le/h/d/a/a/s/z;->b:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v2}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v2

    .line 13
    new-instance v3, Le/h/d/a/a/s/v;

    invoke-direct {v3, v1, v2}, Le/h/d/a/a/s/v;-><init>(Le/h/d/a/a/s/z;Lfr/mbs/binary/Octets;)V

    .line 14
    iget-object v1, p0, Le/h/d/a/a/s/h0;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v3, v1}, Le/h/d/a/a/s/v;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
