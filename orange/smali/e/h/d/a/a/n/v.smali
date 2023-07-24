.class public Le/h/d/a/a/n/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/h/d/a/a/n/w/c;


# direct methods
.method public constructor <init>(Le/h/d/a/a/n/w/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/n/v;->a:Le/h/d/a/a/n/w/c;

    return-void
.end method

.method public static a(Lorg/json/JSONObject;Ljava/lang/String;)Lfr/mbs/binary/Octets;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 26
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static f(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p0, :cond_0

    const-string v0, "status"

    .line 1
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ContactlessType;)Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 0

    .line 17
    invoke-virtual {p3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/orange/oab/contactless/packid/ContactlessType;->valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object p1

    return-object p1
.end method

.method public a(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const-string v0, "UserParser"

    const-string v1, "PrivateRef: fetch json from server to create an User"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;-><init>()V

    const-string v1, "contactlessId"

    const-string v2, "00000001"

    .line 3
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setContactlessId(Lfr/mbs/binary/Octets;)V

    const/4 v1, 0x0

    const-string v2, "firstname"

    .line 4
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirstname(Ljava/lang/String;)V

    const-string v2, "lastname"

    .line 5
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setLastname(Ljava/lang/String;)V

    const-string v2, "email"

    .line 6
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setEmail(Ljava/lang/String;)V

    const-string v1, "applicationIds"

    .line 7
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {p0, v1}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONArray;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setApplicationIds(Ljava/util/Set;)V

    const-string v1, "wallet"

    .line 8
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p0, v1}, Le/h/d/a/a/n/v;->e(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setWallet(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)V

    const/4 v1, 0x0

    const-string v2, "simCentric"

    .line 9
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSimCentric(Z)V

    const-string v2, "tenant"

    .line 10
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {p0, v2}, Le/h/d/a/a/n/v;->d(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setTenant(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V

    const-string v2, "firebaseEnable"

    .line 11
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirebaseEnable(Z)V

    const-string v2, "premium"

    .line 12
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setPremium(Z)V

    return-object v0
.end method

.method public final a(Lorg/json/JSONArray;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 13
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    if-eqz p1, :cond_1

    .line 14
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 16
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lorg/json/JSONObject;)V
    .locals 5

    .line 18
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v0

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->PERSONALISED:Lcom/orange/oab/contactless/packid/ContactlessType;

    if-ne v0, v1, :cond_1

    const-string v0, "androidPersonalisedContactlessInformation"

    .line 19
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    const/16 v0, 0xc

    if-nez p2, :cond_0

    .line 20
    new-instance p2, Le/h/d/a/a/l;

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v2, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-direct {p2, v1, v0, v2}, Le/h/d/a/a/l;-><init>(Lcom/orange/oab/contactless/packid/ContactlessType;Ljava/lang/Integer;Lcom/orange/oab/contactless/packid/ContactlessType;)V

    invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessTypeInformation(Le/h/d/a/a/l;)V

    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, Le/h/d/a/a/l;

    sget-object v2, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    const-string v3, "contactlessDown"

    .line 22
    invoke-virtual {p0, p2, v3, v2}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ContactlessType;)Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v2

    const-string v3, "contactlessVersionThreshold"

    .line 23
    invoke-virtual {p2, v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v3, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    const-string v4, "contactlessUp"

    .line 24
    invoke-virtual {p0, p2, v4, v3}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ContactlessType;)Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object p2

    invoke-direct {v1, v2, v0, p2}, Le/h/d/a/a/l;-><init>(Lcom/orange/oab/contactless/packid/ContactlessType;Ljava/lang/Integer;Lcom/orange/oab/contactless/packid/ContactlessType;)V

    .line 25
    invoke-virtual {p1, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessTypeInformation(Le/h/d/a/a/l;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public b(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;-><init>()V

    const-string v1, "data"

    .line 2
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createFromBase64(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-static {v1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v1

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;->a:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    .line 3
    iget-object v1, p0, Le/h/d/a/a/n/v;->a:Le/h/d/a/a/n/w/c;

    const-string v2, "signature"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lfr/mbs/binary/Octets;->createFromBase64(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;->b:Lfr/mbs/binary/Octets;

    const-string v1, "url"

    .line 4
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Le/h/d/a/a/n/v;->a:Le/h/d/a/a/n/w/c;

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createWithUtf8String(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v2, v1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;->c:Lfr/mbs/binary/Octets;

    .line 5
    new-instance v1, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-string v4, "maxCacheAge"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x3c

    mul-long v4, v4, v6

    const-wide/16 v6, 0x3e8

    mul-long v4, v4, v6

    add-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;->d:Ljava/util/Date;

    return-object v0
.end method

.method public final c(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const-string v0, "zoneid"

    .line 1
    invoke-static {p1, v0}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v2

    const-string v0, "badgeid"

    .line 2
    invoke-static {p1, v0}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    const-string v1, "walletkey"

    .line 3
    invoke-static {p1, v1}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const/4 v7, 0x0

    if-nez v1, :cond_0

    move-object v5, v7

    goto :goto_0

    .line 4
    :cond_0
    iget-object v3, p0, Le/h/d/a/a/n/v;->a:Le/h/d/a/a/n/w/c;

    invoke-virtual {v3, v1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    move-object v5, v1

    :goto_0
    const-string v1, "description"

    .line 5
    invoke-virtual {p1, v1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 6
    invoke-static {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->mask(Lfr/mbs/binary/Octets;)Ljava/lang/String;

    move-result-object v4

    .line 7
    new-instance v8, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    iget-object v1, p0, Le/h/d/a/a/n/v;->a:Le/h/d/a/a/n/w/c;

    invoke-virtual {v1, v0}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v3

    move-object v1, v8

    invoke-direct/range {v1 .. v6}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;)V

    const-string v0, "logoFile"

    .line 8
    invoke-virtual {p1, v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLogoFile(Ljava/lang/String;)V

    const/16 v0, -0x32

    const-string v1, "rssi"

    .line 9
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssi(B)V

    const/16 v0, -0x7f

    const-string v1, "rssiButtonInterval"

    .line 10
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssiButtonInterval(B)V

    .line 11
    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    const-string v1, "contactlessType"

    invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ContactlessType;)Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessType(Lcom/orange/oab/contactless/packid/ContactlessType;)V

    .line 12
    invoke-virtual {p0, v8, p1}, Le/h/d/a/a/n/v;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lorg/json/JSONObject;)V

    const-string v0, "lockable"

    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLockable(Z)V

    const-string v0, "unlockedDuration"

    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUnlockedDuration(Ljava/lang/Integer;)V

    const-string v0, "unlockableByZoneID"

    .line 15
    invoke-static {p1, v0}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUnlockableByZoneID(Lfr/mbs/binary/Octets;)V

    .line 16
    invoke-static {p1}, Le/h/d/a/a/n/v;->f(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setStatus(Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;)V

    const-string v0, "bleSessionTimeout"

    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v7

    :goto_1
    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setBleSessionTimeout(Ljava/lang/Integer;)V

    const-string v0, "delayAfterBadgeOk"

    .line 18
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_2
    invoke-virtual {v8, v7}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setDelayAfterBadgeOk(Ljava/lang/Integer;)V

    const-string v0, "minimumConditionToBeginTransaction"

    .line 19
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    move-result-object v0

    goto :goto_2

    :cond_3
    sget-object v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    :goto_2
    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setConditionToBeginTransaction(Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;)V

    const/4 v0, 0x0

    const-string v1, "manualConnectionAllowed"

    .line 20
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setManualConnectionAllowed(Z)V

    const-string v0, "token"

    .line 21
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 22
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Le/h/d/a/a/n/v;->b(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->updateToken(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;)V

    :cond_4
    const-string v0, "url"

    .line 24
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 25
    iget-object v1, p0, Le/h/d/a/a/n/v;->a:Le/h/d/a/a/n/w/c;

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createWithUtf8String(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v8, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredUrl(Lfr/mbs/binary/Octets;)V

    :cond_5
    return-object v8
.end method

.method public final d(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;-><init>()V

    const-string v1, "name"

    .line 2
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setName(Ljava/lang/String;)V

    const-string v1, "logoURL"

    .line 3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setLogoUrl(Ljava/lang/String;)V

    const-string v1, "shouldSendEnrollmentNotification"

    .line 4
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setShouldSendEnrollmentNotification(Z)V

    return-object v0
.end method

.method public final e(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    const-string v1, "walletid"

    invoke-static {p1, v1}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>(Lfr/mbs/binary/Octets;)V

    if-eqz p1, :cond_0

    const-string v1, "badges"

    .line 2
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 4
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 5
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, v2}, Le/h/d/a/a/n/v;->c(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
