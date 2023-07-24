.class public Le/h/d/a/a/s/k;
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
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "badge"

    const-string v2, "delayAfterBadgeOk"

    const-string v3, "INTEGER"

    .line 1
    invoke-virtual {v0, v1, v2, v3}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v2, v0, Le/h/d/a/a/s/h0;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "update badge set delayAfterBadgeOk = tempoAfterBadgeOk"

    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v4, "tempoAfterBadgeOk"

    const-string v5, "nfcOnly"

    const-string v6, "badgeStatus"

    const-string v7, "conditionToBeginTransaction"

    const-string v8, "manualConnectionAllowed"

    const-string v9, "rssiButtonInterval"

    const-string v10, "rssiDurationForButtonComputation"

    const-string v11, "contactlessType"

    const-string v12, "lockable"

    const-string v13, "unlockedDuration"

    const-string v14, "unlockableByZoneID"

    const-string v15, "lockable"

    const-string v16, "unlockedDuration"

    const-string v17, "unlockableByZoneID"

    .line 3
    filled-new-array/range {v4 .. v17}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"

    invoke-virtual {v0, v3, v1, v2}, Le/h/d/a/a/s/h0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method
