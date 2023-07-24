.class public Le/h/d/a/a/s/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/h/d/a/a/s/q;


# direct methods
.method public constructor <init>(Le/h/d/a/a/s/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    return-void
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "ALTER TABLE badge ADD COLUMN cipheredUrl TEXT;"

    .line 1
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE badge ADD COLUMN isUpToDate BOOLEAN DEFAULT 1;"

    .line 2
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    const-string v0, "CREATE TABLE user (contactlessId TEXT  UNIQUE NOT NULL,email TEXT,firstname TEXT,lastname TEXT,walletId TEXT,tenantName TEXT,cipheredUri TEXT PRIMARY KEY,simCentric BOOLEAN DEFAULT 0,id TEXT UNIQUE,firebaseEnable INTEGER,premium INTEGER,sendEnrolmentNotification BOOLEAN DEFAULT 0);"

    .line 1
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE badge (cipheredId TEXT NOT NULL, maskedId TEXT,zoneId TEXT NOT NULL, walletId TEXT NOT NULL, cipheredWalletKey TEXT,cipheredTokenDataSignature TEXT,tokenData TEXT,description TEXT,logoFile TEXT,cipheredUrl TEXT,regenerationDate INTEGER, isTransactionAllowed BOOLEAN DEFAULT 0, rssi TINYINT DEFAULT -50, rssiButtonInterval TINYINT DEFAULT -127, rssiDurationForButtonComputation TINYINT DEFAULT 2, userId TEXT, bleSessionTimeout INTEGER, delayAfterBadgeOk INTEGER, nfcOnly BOOLEAN NOT NULL DEFAULT 1, contactlessType TEXT,lockable BOOLEAN DEFAULT 0, unlockableByZoneID TEXT,unlockedDuration INTEGER, badgeStatus VARCHAR(255) NOT NULL DEFAULT \'INSTALLED\', conditionToBeginTransaction VARCHAR(255) NOT NULL DEFAULT \'none\', manualConnectionAllowed BOOLEAN NOT NULL DEFAULT 0,PRIMARY KEY (walletId, cipheredId, zoneId, userId),FOREIGN KEY(walletId) REFERENCES user(walletId),FOREIGN KEY(userId) REFERENCES user(id));"

    .line 2
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS tenant (name TEXT  UNIQUE NOT NULL,logoUrl TEXT);"

    .line 3
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 2

    .line 5
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/r;

    invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/r;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User;

    return-object p1
.end method

.method public a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 2

    .line 4
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/u;

    invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/u;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User;

    return-object p1
.end method

.method public a(Ljava/lang/String;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 2

    .line 9
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/q;

    invoke-direct {v1, p1, p2}, Le/h/d/a/a/s/k0/q;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    return-object p1
.end method

.method public a(Lcom/orange/oab/contactless/packid/hce/user/User;)Le/h/d/a/a/p/a/a/a;
    .locals 2

    .line 6
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/y;

    invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/y;-><init>(Lcom/orange/oab/contactless/packid/hce/user/User;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/p/a/a/a;

    return-object p1
.end method

.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/User;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/w;

    invoke-direct {v1}, Le/h/d/a/a/s/k0/w;-><init>()V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 7
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/j;

    invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/j;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    return-void
.end method

.method public a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Z
    .locals 2

    .line 8
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/c;

    invoke-direct {v1, p1, p2}, Le/h/d/a/a/s/k0/c;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public b(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 2

    .line 10
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/s;

    invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/s;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User;

    return-object p1
.end method

.method public b(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 2

    .line 4
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/v;

    invoke-direct {v1, p1}, Le/h/d/a/a/s/k0/v;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->a(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User;

    return-object p1
.end method

.method public b()V
    .locals 2

    const-string v0, "packid.UserRepository"

    const-string v1, "delete Everything"

    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object v0, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v1, Le/h/d/a/a/s/k0/f;

    invoke-direct {v1}, Le/h/d/a/a/s/k0/f;-><init>()V

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    return-void
.end method

.method public b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 3

    .line 7
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 8
    invoke-virtual {p1, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRegenerationDate(Ljava/util/Date;)V

    .line 9
    iget-object v1, p0, Le/h/d/a/a/s/g0;->a:Le/h/d/a/a/s/q;

    new-instance v2, Le/h/d/a/a/s/k0/a;

    invoke-direct {v2, p1, v0}, Le/h/d/a/a/s/k0/a;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/util/Date;)V

    invoke-virtual {v1, v2}, Le/h/d/a/a/s/q;->b(Le/h/d/a/a/s/k0/d;)Ljava/lang/Object;

    return-void
.end method

.method public c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Z

    return-void
.end method
