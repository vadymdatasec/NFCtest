.class public Le/h/d/a/a/n/n;
.super Le/h/d/a/a/n/m;
.source "SourceFile"


# instance fields
.field public final b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

.field public c:Lfr/mbs/binary/Octets;

.field public final d:Le/h/d/a/a/n/w/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Le/h/d/a/a/n/m;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0, p2}, Le/h/d/a/a/n/n;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p2

    iput-object p2, p0, Le/h/d/a/a/n/n;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 3
    invoke-static {p1}, Le/h/d/a/a/n/w/c;->b(Landroid/content/Context;)Le/h/d/a/a/n/w/c;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/n/n;->d:Le/h/d/a/a/n/w/c;

    return-void
.end method


# virtual methods
.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 2

    .line 1
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Le/h/d/a/a/s/g0;->a(Ljava/lang/String;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    iget-object v1, p0, Le/h/d/a/a/n/n;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0, v1}, Le/h/d/a/a/s/g0;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 3
    iget-object v0, p0, Le/h/d/a/a/n/n;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/n/n;->c:Lfr/mbs/binary/Octets;

    .line 4
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Le/h/d/a/a/n/n;->d:Le/h/d/a/a/n/w/c;

    iget-object v2, p0, Le/h/d/a/a/n/n;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredUrl()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object v1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 5
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 6
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    iget-object v2, p0, Le/h/d/a/a/n/n;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toBase64()Ljava/lang/String;

    move-result-object v2

    const-string v3, "data"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v2, p0, Le/h/d/a/a/n/n;->d:Le/h/d/a/a/n/w/c;

    iget-object v3, p0, Le/h/d/a/a/n/n;->c:Lfr/mbs/binary/Octets;

    invoke-virtual {v2, v3}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toBase64()Ljava/lang/String;

    move-result-object v2

    const-string v3, "signature"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-virtual {p0, v0, v1}, Le/h/d/a/a/n/m;->b(Landroid/net/Uri;Ljava/util/Map;)V

    const-string v0, "packid.TokenUpdater"

    const-string v1, "Updating token on server ..."

    .line 10
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public a(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 11
    new-instance p1, Le/h/d/a/a/n/v;

    iget-object v0, p0, Le/h/d/a/a/n/n;->d:Le/h/d/a/a/n/w/c;

    invoke-direct {p1, v0}, Le/h/d/a/a/n/v;-><init>(Le/h/d/a/a/n/w/c;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Le/h/d/a/a/n/v;->b(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;

    move-result-object p1

    .line 12
    iget-object p2, p0, Le/h/d/a/a/n/n;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {p2, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->updateToken(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;)V

    .line 13
    iget-object p1, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-static {p1}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object p1

    iget-object p2, p0, Le/h/d/a/a/n/n;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    iget-object v0, p0, Le/h/d/a/a/n/n;->c:Lfr/mbs/binary/Octets;

    invoke-virtual {p1, p2, v0}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Z

    move-result p1

    const-string p2, "packid.TokenUpdater"

    if-eqz p1, :cond_0

    const-string p1, "Token synchronised with server"

    .line 14
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Token synchronised"

    .line 15
    invoke-static {p2, p1}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    new-instance p1, Le/h/d/a/a/r/a;

    iget-object p2, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    invoke-direct {p1, p2}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Le/h/d/a/a/r/a;->c()V

    goto :goto_0

    :cond_0
    const-string p1, "Token synchronisation with server canceled, token was probably modified locally during remote update"

    .line 17
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Token synchro canceled"

    .line 18
    invoke-static {p2, p1}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 5

    .line 19
    iget-object v0, p0, Le/h/d/a/a/n/m;->a:Landroid/content/Context;

    sget v1, Le/h/d/a/a/c;->update_token_failed:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Le/h/d/a/a/n/n;->b:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/orange/oab/contactless/packid/report/ReportSender;->send(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
