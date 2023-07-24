.class public Le/h/d/a/a/w/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Le/h/d/a/a/w/t;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/w/u;->b:Ljava/util/Map;

    .line 3
    iput-object p1, p0, Le/h/d/a/a/w/u;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
    .locals 1

    .line 2
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/w/u;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/d/a/a/w/t;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object p1, v0, Le/h/d/a/a/w/t;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    return-object p1

    .line 4
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/w/u;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, p2, v0}, Le/h/d/a/a/w/u;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/User;)V

    if-nez v0, :cond_1

    const-string p1, "packid.RssiCache"

    const-string p2, "No user matching contactless id"

    .line 6
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-object v0
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/h/d/a/a/w/u;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/User;)V
    .locals 2

    .line 7
    new-instance v0, Le/h/d/a/a/w/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/w/t;-><init>(Le/h/d/a/a/w/s;)V

    .line 8
    iput-object p3, v0, Le/h/d/a/a/w/t;->a:Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 9
    iget-object p3, p0, Le/h/d/a/a/w/u;->b:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/d/a/a/w/t;
    .locals 2

    .line 4
    iget-object v0, p0, Le/h/d/a/a/w/u;->b:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/w/t;

    return-object p1
.end method

.method public b()V
    .locals 5

    .line 1
    iget-object v0, p0, Le/h/d/a/a/w/u;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v0

    invoke-virtual {v0}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 2
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v2

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 3
    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-virtual {p0, v4, v3, v1}, Le/h/d/a/a/w/u;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/User;)V

    goto :goto_0

    :cond_1
    return-void
.end method
