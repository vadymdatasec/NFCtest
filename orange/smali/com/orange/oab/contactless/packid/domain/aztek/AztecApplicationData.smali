.class public Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;
    }
.end annotation


# static fields
.field public static final APPLICATION_DATA_SIZE:I = 0x50

.field public static final MASK_FOR_YEAR_MONTH_DAY:Lfr/mbs/binary/Octets;


# instance fields
.field public b:I

.field public c:Ljava/lang/String;

.field public d:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

.field public e:S

.field public f:Ljava/util/Date;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "FF1F3F3F7F"

    .line 1
    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v0

    sput-object v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->MASK_FOR_YEAR_MONTH_DAY:Lfr/mbs/binary/Octets;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lfr/mbs/binary/Octets;)Ljava/util/Date;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyMMddHHmm"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0
.end method

.method public static parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;

    invoke-direct {v0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;-><init>()V

    .line 2
    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    const/16 v2, 0x50

    if-lt v1, v2, :cond_0

    const/16 v1, 0x20

    const/4 v2, 0x2

    .line 3
    invoke-virtual {p0, v1, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->reverse()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toInt()I

    move-result v1

    iput v1, v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I

    const/16 v1, 0x12

    const/4 v2, 0x4

    .line 4
    invoke-virtual {p0, v1, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->reverse()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->c:Ljava/lang/String;

    .line 5
    :try_start_0
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object v1

    const/16 v3, 0x18

    invoke-virtual {p0, v3, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    const/16 v2, 0x1d

    invoke-virtual {p0, v2}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;

    move-result-object v1

    .line 6
    sget-object v2, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->MASK_FOR_YEAR_MONTH_DAY:Lfr/mbs/binary/Octets;

    invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->and(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-static {v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->a(Lfr/mbs/binary/Octets;)Ljava/util/Date;

    move-result-object v1

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->f:Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "packid.AztecData"

    const-string v3, "Error while retrieving date"

    .line 7
    invoke-static {v2, v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    const/16 v1, 0x3e

    const/4 v2, 0x1

    .line 8
    invoke-virtual {p0, v1, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object v1

    const/4 v3, 0x0

    aget-byte v1, v1, v3

    shr-int/lit8 v1, v1, 0x5

    int-to-byte v1, v1

    invoke-static {v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->a(B)Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    move-result-object v1

    iput-object v1, v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->d:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    const/16 v1, 0x26

    .line 9
    invoke-virtual {p0, v1, v2}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p0

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toShort()S

    move-result p0

    iput-short p0, v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->e:S

    return-object v0

    .line 10
    :cond_0
    new-instance v0, Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Application data size expected to be 80 but is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public calculateAmount(Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->getCurrentBalance()I

    move-result p1

    .line 2
    :goto_0
    iget v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public getCurrentBalance()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I

    return v0
.end method

.method public getFreeItem()S
    .locals 1

    .line 1
    iget-short v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->e:S

    return v0
.end method

.method public getLastDate()Ljava/util/Date;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->f:Ljava/util/Date;

    return-object v0
.end method

.method public getLastTransactionType()Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->d:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    return-object v0
.end method

.method public getReaderNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->c:Ljava/lang/String;

    return-object v0
.end method

.method public setCurrentBalance(S)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Le/f/b/a/j;->a(Ljava/lang/Object;)Le/f/b/a/j$a;

    move-result-object v0

    iget v1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->b:I

    const-string v2, "currentBalance"

    .line 2
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->c:Ljava/lang/String;

    const-string v2, "readerNumber"

    .line 3
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->d:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    const-string v2, "lastTransactionType"

    .line 4
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->f:Ljava/util/Date;

    const-string v2, "lastDate"

    .line 5
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;

    iget-short v1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;->e:S

    const-string v2, "freeItem"

    .line 6
    invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;I)Le/f/b/a/j$a;

    .line 7
    invoke-virtual {v0}, Le/f/b/a/j$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
