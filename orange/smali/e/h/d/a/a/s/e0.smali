.class public Le/h/d/a/a/s/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/s/e0;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/s/e0;->b:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method

.method public static b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x8

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 1

    const/16 v0, 0x8

    .line 1
    invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/io/File;Le/h/d/a/a/n/w/c;)Lfr/mbs/binary/Octets;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 34
    invoke-static {p1}, Le/f/b/c/s;->b(Ljava/io/File;)[B

    move-result-object p1

    .line 35
    invoke-virtual {p2, p1}, Le/h/d/a/a/n/w/c;->b([B)[B

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 4

    const-string v0, "packid.UserFileToDb"

    const-string v1, "Migrating old user information from file to database"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Le/h/d/a/a/s/e0;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "user.json"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    :try_start_0
    iget-object v2, p0, Le/h/d/a/a/s/e0;->a:Landroid/content/Context;

    invoke-static {v2}, Le/h/d/a/a/n/w/c;->b(Landroid/content/Context;)Le/h/d/a/a/n/w/c;

    move-result-object v2

    .line 5
    invoke-virtual {p0, v1, v2}, Le/h/d/a/a/s/e0;->b(Ljava/io/File;Le/h/d/a/a/n/w/c;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v3

    .line 6
    invoke-virtual {p0, v3, v2}, Le/h/d/a/a/s/e0;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Le/h/d/a/a/n/w/c;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_1
    const-string v3, "Cannot upgrade database"

    .line 7
    invoke-static {v0, v3, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    :goto_0
    invoke-virtual {p0, v1}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V

    goto :goto_2

    :goto_1
    invoke-virtual {p0, v1}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V

    .line 9
    throw v0

    :cond_0
    :goto_2
    return-void
.end method

.method public final a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/io/File;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Le/h/d/a/a/n/w/c;)V
    .locals 3

    const-string v0, "packid.UserFileToDb"

    .line 16
    :try_start_0
    invoke-virtual {p0, p3, p5}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;Le/h/d/a/a/n/w/c;)Lfr/mbs/binary/Octets;

    move-result-object v1

    .line 17
    invoke-virtual {p0, v1}, Le/h/d/a/a/s/e0;->a(Lfr/mbs/binary/Octets;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p5, "Delete badge with old default token data, you need to update user to retrieve the server default token data"

    .line 18
    invoke-static {v0, p5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    new-instance p5, Le/h/d/a/a/s/k0/g;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-direct {p5, v1, p4}, Le/h/d/a/a/s/k0/g;-><init>(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    invoke-virtual {p5, p1}, Le/h/d/a/a/s/k0/g;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    invoke-virtual {p0, p3}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V

    return-void

    .line 21
    :cond_0
    :try_start_1
    invoke-static {v1}, Le/h/d/a/a/s/e0;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-static {v2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v2

    invoke-virtual {p4, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V

    .line 22
    invoke-static {v1}, Le/h/d/a/a/s/e0;->c(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p5, v1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p5

    invoke-virtual {p4, p5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V

    .line 23
    new-instance p5, Le/h/d/a/a/s/k0/c;

    const/4 v1, 0x0

    invoke-direct {p5, p4, v1}, Le/h/d/a/a/s/k0/c;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)V

    invoke-virtual {p5, p1}, Le/h/d/a/a/s/k0/c;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p5

    :try_start_2
    const-string v1, "Cannot update tokens"

    .line 24
    invoke-static {v0, v1, p5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    new-instance v0, Le/h/d/a/a/s/k0/g;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object p2

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-direct {v0, p2, p4}, Le/h/d/a/a/s/k0/g;-><init>(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/g;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    .line 26
    iget-object p1, p0, Le/h/d/a/a/s/e0;->a:Landroid/content/Context;

    const-string p2, "user deleted by migrateToken"

    invoke-static {p1, p2}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V

    .line 27
    iget-object p1, p0, Le/h/d/a/a/s/e0;->a:Landroid/content/Context;

    invoke-static {p1, p5}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 28
    iget-object p1, p0, Le/h/d/a/a/s/e0;->a:Landroid/content/Context;

    const-string p2, "====================="

    invoke-static {p1, p2}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    :goto_0
    invoke-virtual {p0, p3}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V

    return-void

    .line 30
    :goto_1
    invoke-virtual {p0, p3}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V

    .line 31
    throw p1
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/User;Le/h/d/a/a/n/w/c;)V
    .locals 10

    .line 10
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Le/h/d/a/a/s/e0;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, "tokens"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 11
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 12
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v7, v1, v3

    .line 13
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v4

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v8

    .line 14
    iget-object v5, p0, Le/h/d/a/a/s/e0;->b:Landroid/database/sqlite/SQLiteDatabase;

    move-object v4, p0

    move-object v6, p1

    move-object v9, p2

    invoke-virtual/range {v4 .. v9}, Le/h/d/a/a/s/e0;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/io/File;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Le/h/d/a/a/n/w/c;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0, v0}, Le/h/d/a/a/s/e0;->a(Ljava/io/File;)V

    :cond_1
    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 2

    .line 32
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t delete :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "packid.UserFileToDb"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final a(Lfr/mbs/binary/Octets;)Z
    .locals 1

    .line 36
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result p1

    const/16 v0, 0x14

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Ljava/io/File;Le/h/d/a/a/n/w/c;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/orange/oab/contactless/packid/g/u/e;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    new-instance v1, Ljava/lang/String;

    invoke-static {p1}, Le/f/b/c/s;->b(Ljava/io/File;)[B

    move-result-object p1

    invoke-virtual {p2, p1}, Le/h/d/a/a/n/w/c;->b([B)[B

    move-result-object p1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 3
    new-instance p1, Le/h/d/a/a/n/v;

    invoke-direct {p1, p2}, Le/h/d/a/a/n/v;-><init>(Le/h/d/a/a/n/w/c;)V

    invoke-virtual {p1, v0}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    .line 4
    new-instance p2, Le/h/d/a/a/s/k0/y;

    invoke-direct {p2, p1}, Le/h/d/a/a/s/k0/y;-><init>(Lcom/orange/oab/contactless/packid/hce/user/User;)V

    iget-object v0, p0, Le/h/d/a/a/s/e0;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p2, v0}, Le/h/d/a/a/s/k0/y;->a(Landroid/database/sqlite/SQLiteDatabase;)Le/h/d/a/a/p/a/a/a;

    return-object p1
.end method
