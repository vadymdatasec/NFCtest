.class public abstract synthetic Le/h/d/a/a/o/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/h/a/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isConditionToBeginTransactionReached(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Le/h/d/a/a/r/a;

    invoke-direct {v0, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    .line 3
    new-instance p0, Lcom/orange/oab/contactless/packid/h/a/a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Condition to begin transaction is not satisfied : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Le/h/d/a/a/o/a/b;->e:Lfr/mbs/binary/Octets;

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V

    throw p0
.end method
