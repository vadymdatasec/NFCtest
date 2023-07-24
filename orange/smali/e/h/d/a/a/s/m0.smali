.class public Le/h/d/a/a/s/m0;
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
    .locals 23

    move-object/from16 v0, p0

    const-string v1, "badge"

    const-string v2, "regenerationDate"

    const-string v3, "INTEGER"

    .line 1
    invoke-virtual {v0, v1, v2, v3}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v2, v0, Le/h/d/a/a/s/h0;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "update badge set regenerationDate = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v4, Ljava/util/Date;

    const-wide/16 v5, 0x0

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " where tokenData is not null"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v4, "isTransactionAllowed"

    const-string v5, "rssi"

    const-string v6, "rssiButtonInterval"

    const-string v7, "rssiDurationForButtonComputation"

    const-string v8, "userId"

    const-string v9, "bleSessionTimeout"

    const-string v10, "tempoAfterBadgeOk"

    const-string v11, "delayAfterBadgeOk"

    const-string v12, "nfcOnly"

    const-string v13, "badgeStatus"

    const-string v14, "conditionToBeginTransaction"

    const-string v15, "manualConnectionAllowed"

    const-string v16, "contactlessType"

    const-string v17, "lockable"

    const-string v18, "unlockedDuration"

    const-string v19, "unlockableByZoneID"

    const-string v20, "lockable"

    const-string v21, "unlockedDuration"

    const-string v22, "unlockableByZoneID"

    .line 3
    filled-new-array/range {v4 .. v22}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"

    invoke-virtual {v0, v3, v1, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
