.class public Le/h/d/a/a/n/p;
.super Le/h/d/a/a/n/m;
.source "SourceFile"


# static fields
.field public static f:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field public b:Z

.field public c:Ljava/lang/String;

.field public d:Lfr/mbs/binary/Octets;

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Le/h/d/a/a/n/p;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/h/d/a/a/n/m;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Z
    .locals 3

    .line 76
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "error"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "invalid.host"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception v0

    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected 403 response content: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "packid.userLoader"

    invoke-static {v1, p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic b(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Pack ID server has not found this user"

    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 19
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    const-string v1, "nfc"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/nfc/NfcManager;

    .line 20
    invoke-virtual {v0}, Landroid/nfc/NfcManager;->getDefaultAdapter()Landroid/nfc/NfcAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "compatible"

    return-object v0

    :cond_0
    const-string v0, "incompatible"

    return-object v0
.end method

.method public final a(Lcom/android/volley/VolleyError;)Ljava/lang/String;
    .locals 2

    .line 81
    new-instance v0, Ljava/lang/String;

    iget-object p1, p1, Lcom/android/volley/VolleyError;->b:Le/a/a/l;

    iget-object p1, p1, Le/a/a/l;->b:[B

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public a(Landroid/net/Uri;)V
    .locals 3

    .line 9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "deviceModel"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "deviceManufacturer"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "libraryVersion"

    const-string v2, "267"

    .line 12
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v2, "osVersion"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    invoke-virtual {p0}, Le/h/d/a/a/n/p;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "applicationVersion"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    invoke-virtual {p0}, Le/h/d/a/a/n/p;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "nfc"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    iget-object v1, p0, Le/h/d/a/a/n/p;->c:Ljava/lang/String;

    const-string v2, "firebaseToken"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    invoke-virtual {v0}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "packid.userLoader"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    invoke-super {p0, p1, v0}, Le/h/d/a/a/n/m;->a(Landroid/net/Uri;Ljava/util/Map;)V

    return-void
.end method

.method public a(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;,
            Lorg/json/JSONException;,
            Le/h/d/a/a/n/e;
        }
    .end annotation

    .line 21
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/n/w/c;->b(Landroid/content/Context;)Le/h/d/a/a/n/w/c;

    move-result-object v0

    .line 22
    new-instance v1, Le/h/d/a/a/n/v;

    invoke-direct {v1, v0}, Le/h/d/a/a/n/v;-><init>(Le/h/d/a/a/n/w/c;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p2

    .line 23
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getApplicationIds()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/h/d/a/a/n/p;->a(Ljava/util/Set;)V

    .line 24
    iget-object v0, p0, Le/h/d/a/a/n/p;->d:Lfr/mbs/binary/Octets;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->b(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-virtual {p2, p1, v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->setUri(Landroid/net/Uri;Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 26
    invoke-virtual {p2, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSendEnrolmentNotification(Z)V

    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p2, v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V

    .line 28
    invoke-virtual {p2, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSendEnrolmentNotification(Z)V

    .line 29
    :goto_0
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_1

    .line 30
    iget-object p1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    const-string v0, "========="

    invoke-static {p1, v0, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 31
    iget-object p1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ALL BADGES WERE DELETED ON UPDATE tenant : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object v3

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V

    .line 32
    iget-object p1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {p1, v0, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 33
    :cond_1
    iget-object p1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {p1}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object p1

    invoke-virtual {p1, p2}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/User;)Le/h/d/a/a/p/a/a/a;

    move-result-object p1

    .line 34
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Le/h/d/a/a/p/a/a/a;)V

    .line 35
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;

    move-result-object p1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->shouldSendEnrollmentNotification()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSendEnrolmentNotification()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 36
    invoke-virtual {p0, p2, v1}, Le/h/d/a/a/n/p;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Z)V

    :cond_2
    return-void
.end method

.method public a(Lcom/orange/oab/contactless/packid/hce/user/User;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Le/h/d/a/a/n/p;->a(Lcom/orange/oab/contactless/packid/hce/user/User;ZLjava/lang/String;)V

    return-void
.end method

.method public a(Lcom/orange/oab/contactless/packid/hce/user/User;ZLjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 2
    iput-boolean p2, p0, Le/h/d/a/a/n/p;->b:Z

    .line 3
    iput-object p3, p0, Le/h/d/a/a/n/p;->c:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;

    move-result-object p2

    iput-object p2, p0, Le/h/d/a/a/n/p;->d:Lfr/mbs/binary/Octets;

    .line 5
    iget-object p2, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getUri(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p2

    .line 6
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSendEnrolmentNotification()Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p3, Le/h/d/a/a/n/p;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p3

    if-nez p3, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSendEnrolmentNotification()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string p3, "sendEnrolmentNotification"

    invoke-virtual {p2, p3, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 8
    :cond_0
    invoke-virtual {p2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Landroid/net/Uri;)V

    return-void
.end method

.method public a(Le/h/d/a/a/p/a/a/a;)V
    .locals 2

    .line 40
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/orange/oab/contactless/packid/service/Aid;->register(Landroid/content/Context;)V

    .line 41
    iget-boolean v0, p0, Le/h/d/a/a/n/p;->e:Z

    if-eqz v0, :cond_0

    .line 42
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->a(Le/h/d/a/a/p/a/a/a;)V

    :cond_0
    return-void
.end method

.method public final a(Lfr/mbs/binary/Octets;)V
    .locals 1

    .line 74
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->b(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 75
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(Lfr/mbs/binary/Octets;I)V
    .locals 2

    .line 70
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;)V

    .line 71
    iget-object p1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    const/4 v0, 0x0

    const-string v1, "========="

    invoke-static {p1, v1, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 72
    iget-object p1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;)V

    .line 73
    iget-object p1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {p1, v1, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->writeToPersistentLog(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .line 37
    iget-object v0, p0, Le/h/d/a/a/n/p;->d:Lfr/mbs/binary/Octets;

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;Lfr/mbs/binary/Octets;)V

    .line 38
    iget-boolean p1, p0, Le/h/d/a/a/n/p;->e:Z

    if-eqz p1, :cond_0

    .line 39
    new-instance p1, Le/h/d/a/a/r/a;

    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-direct {p1, v0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Le/h/d/a/a/r/a;->c()V

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Throwable;Lfr/mbs/binary/Octets;)V
    .locals 2

    .line 43
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    .line 44
    instance-of v1, p1, Lcom/android/volley/NoConnectionError;

    if-nez v1, :cond_8

    instance-of v1, p1, Ljava/net/UnknownHostException;

    if-eqz v1, :cond_0

    goto/16 :goto_0

    .line 45
    :cond_0
    instance-of v1, p1, Le/h/d/a/a/n/e;

    if-eqz v1, :cond_1

    .line 46
    sget p1, Le/h/d/a/a/c;->error_incompatible_application:I

    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;I)V

    .line 47
    sget p1, Le/h/d/a/a/c;->error_incompatible_application:I

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V

    return-void

    :cond_1
    if-nez p2, :cond_2

    .line 48
    sget p1, Le/h/d/a/a/c;->error_invalid_user_url:I

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V

    return-void

    .line 49
    :cond_2
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->f(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 50
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->b(Ljava/lang/Throwable;)I

    move-result p2

    .line 51
    iget-boolean v1, p0, Le/h/d/a/a/n/p;->b:Z

    if-eqz v1, :cond_3

    invoke-virtual {v0, p2}, Le/h/d/a/a/r/a;->a(I)V

    .line 52
    :cond_3
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-virtual {v0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/orange/oab/contactless/packid/report/ReportSender;->send(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 53
    :cond_4
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->e(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 54
    sget p1, Le/h/d/a/a/c;->error_user_transferred:I

    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;I)V

    .line 55
    sget p1, Le/h/d/a/a/c;->error_user_transferred:I

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V

    return-void

    .line 56
    :cond_5
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->g(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 57
    sget p1, Le/h/d/a/a/c;->error_user_not_available:I

    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;I)V

    .line 58
    invoke-virtual {v0}, Le/h/d/a/a/r/a;->c()V

    .line 59
    sget p1, Le/h/d/a/a/c;->error_user_not_available:I

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V

    return-void

    .line 60
    :cond_6
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->c(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 61
    sget p1, Le/h/d/a/a/c;->error_invalid_host:I

    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;I)V

    .line 62
    invoke-virtual {v0}, Le/h/d/a/a/r/a;->c()V

    .line 63
    sget p1, Le/h/d/a/a/c;->error_invalid_host:I

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V

    return-void

    :cond_7
    const-string p2, "packid.userLoader"

    const-string v1, "error occured"

    .line 64
    invoke-static {p2, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 65
    iget-object p2, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    sget v1, Le/h/d/a/a/c;->error_user_update:I

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/orange/oab/contactless/packid/report/ReportSender;->send(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    sget p1, Le/h/d/a/a/c;->error_user_update:I

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V

    return-void

    .line 67
    :cond_8
    :goto_0
    iget-boolean p2, p0, Le/h/d/a/a/n/p;->b:Z

    if-eqz p2, :cond_9

    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->b(Ljava/lang/Throwable;)I

    move-result p1

    invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->a(I)V

    :cond_9
    return-void
.end method

.method public final a(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Le/h/d/a/a/n/e;
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 68
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    new-instance p1, Le/h/d/a/a/n/e;

    invoke-direct {p1}, Le/h/d/a/a/n/e;-><init>()V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/Throwable;I)Z
    .locals 1

    .line 78
    instance-of v0, p1, Lcom/android/volley/VolleyError;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/android/volley/VolleyError;

    iget-object p1, p1, Lcom/android/volley/VolleyError;->b:Le/a/a/l;

    if-eqz p1, :cond_0

    iget p1, p1, Le/a/a/l;->a:I

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final a(Ljava/lang/Throwable;Le/h/d/a/a/n/o;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Le/h/d/a/a/n/o<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 79
    instance-of v0, p1, Lcom/android/volley/VolleyError;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/android/volley/VolleyError;

    iget-object v0, p1, Lcom/android/volley/VolleyError;->b:Le/a/a/l;

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Lcom/android/volley/VolleyError;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Le/h/d/a/a/n/o;->a(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Ljava/lang/Throwable;)I
    .locals 2

    .line 15
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/w/h;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 16
    sget p1, Le/h/d/a/a/c;->error_disconnected:I

    return p1

    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljavax/net/ssl/SSLException;

    const-string v1, "packid.userLoader"

    if-eqz v0, :cond_1

    const-string v0, "SSL error while trying to get user"

    .line 18
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 19
    sget p1, Le/h/d/a/a/c;->error_unsecured_connection:I

    return p1

    :cond_1
    const-string v0, "Error while trying to get user"

    .line 20
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 21
    sget p1, Le/h/d/a/a/c;->error_server_unreachable:I

    return p1
.end method

.method public final b(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 11

    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 6
    invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "deviceModel"

    const-string v4, "deviceManufacturer"

    const-string v5, "libraryVersion"

    const-string v6, "osVersion"

    const-string v7, "applicationVersion"

    const-string v8, "nfc"

    const-string v9, "firebaseToken"

    const-string v10, "sendEnrolmentNotification"

    .line 7
    filled-new-array/range {v3 .. v10}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 8
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 9
    invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 10
    invoke-virtual {v0, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .line 12
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 13
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "packid.userLoader"

    const-string v2, "Cannot get package name"

    .line 14
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string v0, ""

    return-object v0
.end method

.method public b(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Le/h/d/a/a/n/p;->b:Z

    .line 2
    iput-boolean v0, p0, Le/h/d/a/a/n/p;->e:Z

    .line 3
    iput-object p2, p0, Le/h/d/a/a/n/p;->c:Ljava/lang/String;

    .line 4
    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Landroid/net/Uri;)V

    return-void
.end method

.method public final c(Ljava/lang/Throwable;)Z
    .locals 1

    const/16 v0, 0x193

    .line 1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Le/h/d/a/a/n/a;->a:Le/h/d/a/a/n/a;

    .line 2
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;Le/h/d/a/a/n/o;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/n/b;->a:Le/h/d/a/a/n/b;

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;Le/h/d/a/a/n/o;)Z

    move-result p1

    return p1
.end method

.method public final e(Ljava/lang/Throwable;)Z
    .locals 1

    const/16 v0, 0x19a

    .line 1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;I)Z

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/Throwable;)Z
    .locals 1

    const/16 v0, 0x194

    .line 1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->d(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g(Ljava/lang/Throwable;)Z
    .locals 1

    const/16 v0, 0x194

    .line 1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->d(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
