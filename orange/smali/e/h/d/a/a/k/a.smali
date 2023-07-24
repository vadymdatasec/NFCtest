.class public Le/h/d/a/a/k/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z
    .locals 1

    if-eqz p0, :cond_0

    .line 11
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;

    move-result-object p0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Lcom/orange/oab/contactless/packid/domain/Transaction;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException;,
            Lcom/orange/oab/contactless/packid/domain/a;,
            Lcom/orange/oab/contactless/packid/domain/b;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-static {v0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;

    move-result-object v0

    .line 2
    invoke-static {p3}, Le/h/d/a/a/k/a;->a(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApplicationData()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-static {v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-virtual {p2, p3}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 4
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getLastTransactionType()Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    move-result-object p2

    sget-object p3, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->INIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    if-eq p2, p3, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->calculateAmount(Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;)I

    move-result p2

    .line 6
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "n\u00b0"

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getReaderNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 7
    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getLastDate()Ljava/util/Date;

    move-result-object v0

    .line 8
    new-instance v1, Lcom/orange/oab/contactless/packid/domain/Transaction;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {v1, p1, p3, v0, p2}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;)V

    return-object v1

    .line 9
    :cond_1
    new-instance p1, Lcom/orange/oab/contactless/packid/domain/b;

    invoke-direct {p1}, Lcom/orange/oab/contactless/packid/domain/b;-><init>()V

    throw p1

    .line 10
    :cond_2
    new-instance p1, Lcom/orange/oab/contactless/packid/domain/a;

    invoke-direct {p1}, Lcom/orange/oab/contactless/packid/domain/a;-><init>()V

    throw p1
.end method
