.class public final enum Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TransactionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CREDIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

.field public static final enum DEBIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

.field public static final enum INIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

.field public static final enum UNKNOWN:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

.field public static final enum UPDATE:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

.field public static final synthetic d:[Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;


# instance fields
.field public final b:B

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    sget v1, Le/h/d/a/a/c;->transaction_init:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const-string v4, "INIT"

    invoke-direct {v0, v4, v2, v3, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->INIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    .line 2
    new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    sget v1, Le/h/d/a/a/c;->transaction_credit:I

    const/4 v4, 0x1

    const-string v5, "CREDIT"

    invoke-direct {v0, v5, v4, v4, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->CREDIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    .line 3
    new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    sget v1, Le/h/d/a/a/c;->transaction_debit:I

    const/4 v5, 0x2

    const-string v6, "DEBIT"

    invoke-direct {v0, v6, v5, v5, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->DEBIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    .line 4
    new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    sget v1, Le/h/d/a/a/c;->transaction_update:I

    const/4 v6, 0x4

    const-string v7, "UPDATE"

    invoke-direct {v0, v7, v3, v6, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->UPDATE:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    .line 5
    new-instance v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    sget v1, Le/h/d/a/a/c;->transaction_unknown:I

    const-string v7, "UNKNOWN"

    const/16 v8, 0xff

    invoke-direct {v0, v7, v6, v8, v1}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->UNKNOWN:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    const/4 v1, 0x5

    new-array v1, v1, [Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    .line 6
    sget-object v7, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->INIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    aput-object v7, v1, v2

    sget-object v2, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->CREDIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    aput-object v2, v1, v4

    sget-object v2, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->DEBIT:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    aput-object v2, v1, v5

    sget-object v2, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->UPDATE:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    aput-object v2, v1, v3

    aput-object v0, v1, v6

    sput-object v1, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->d:[Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p4, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->c:I

    int-to-byte p1, p3

    .line 3
    iput-byte p1, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->b:B

    return-void
.end method

.method public static synthetic a(B)Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->b(B)Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    move-result-object p0

    return-object p0
.end method

.method public static b(B)Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;
    .locals 5

    .line 1
    invoke-static {}, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->values()[Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    iget-byte v4, v3, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->b:B

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    sget-object p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->UNKNOWN:Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;
    .locals 1

    .line 1
    const-class v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    return-object p0
.end method

.method public static values()[Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;
    .locals 1

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->d:[Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    invoke-virtual {v0}, [Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;

    return-object v0
.end method


# virtual methods
.method public getResourceId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/orange/oab/contactless/packid/domain/aztek/AztecApplicationData$TransactionType;->c:I

    return v0
.end method
