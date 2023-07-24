.class public final enum Lcom/orange/business/packid/android/lib/TransactionErrorType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/orange/business/packid/android/lib/TransactionErrorType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ABORT:Lcom/orange/business/packid/android/lib/TransactionErrorType;

.field public static final enum AUTHENTICATION:Lcom/orange/business/packid/android/lib/TransactionErrorType;

.field public static final enum CIPHER:Lcom/orange/business/packid/android/lib/TransactionErrorType;

.field public static final enum GATT_TIMEOUT:Lcom/orange/business/packid/android/lib/TransactionErrorType;

.field public static final enum READ_CHARACTERISTIC:Lcom/orange/business/packid/android/lib/TransactionErrorType;

.field public static final enum WRITE_CHARACTERISTIC:Lcom/orange/business/packid/android/lib/TransactionErrorType;

.field public static final enum WRITE_DESCRIPTOR:Lcom/orange/business/packid/android/lib/TransactionErrorType;

.field public static final synthetic b:[Lcom/orange/business/packid/android/lib/TransactionErrorType;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v1, 0x0

    const-string v2, "WRITE_DESCRIPTOR"

    invoke-direct {v0, v2, v1}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;->WRITE_DESCRIPTOR:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v2, 0x1

    const-string v3, "READ_CHARACTERISTIC"

    invoke-direct {v0, v3, v2}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;->READ_CHARACTERISTIC:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v3, 0x2

    const-string v4, "WRITE_CHARACTERISTIC"

    invoke-direct {v0, v4, v3}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;->WRITE_CHARACTERISTIC:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v4, 0x3

    const-string v5, "GATT_TIMEOUT"

    invoke-direct {v0, v5, v4}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;->GATT_TIMEOUT:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v5, 0x4

    const-string v6, "CIPHER"

    invoke-direct {v0, v6, v5}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;->CIPHER:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v6, 0x5

    const-string v7, "ABORT"

    invoke-direct {v0, v7, v6}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;->ABORT:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    new-instance v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v7, 0x6

    const-string v8, "AUTHENTICATION"

    invoke-direct {v0, v8, v7}, Lcom/orange/business/packid/android/lib/TransactionErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;->AUTHENTICATION:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v8, 0x7

    new-array v8, v8, [Lcom/orange/business/packid/android/lib/TransactionErrorType;

    .line 2
    sget-object v9, Lcom/orange/business/packid/android/lib/TransactionErrorType;->WRITE_DESCRIPTOR:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    aput-object v9, v8, v1

    sget-object v1, Lcom/orange/business/packid/android/lib/TransactionErrorType;->READ_CHARACTERISTIC:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    aput-object v1, v8, v2

    sget-object v1, Lcom/orange/business/packid/android/lib/TransactionErrorType;->WRITE_CHARACTERISTIC:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    aput-object v1, v8, v3

    sget-object v1, Lcom/orange/business/packid/android/lib/TransactionErrorType;->GATT_TIMEOUT:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    aput-object v1, v8, v4

    sget-object v1, Lcom/orange/business/packid/android/lib/TransactionErrorType;->CIPHER:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    aput-object v1, v8, v5

    sget-object v1, Lcom/orange/business/packid/android/lib/TransactionErrorType;->ABORT:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    aput-object v1, v8, v6

    aput-object v0, v8, v7

    sput-object v8, Lcom/orange/business/packid/android/lib/TransactionErrorType;->b:[Lcom/orange/business/packid/android/lib/TransactionErrorType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/orange/business/packid/android/lib/TransactionErrorType;
    .locals 1

    .line 1
    const-class v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/orange/business/packid/android/lib/TransactionErrorType;

    return-object p0
.end method

.method public static values()[Lcom/orange/business/packid/android/lib/TransactionErrorType;
    .locals 1

    .line 1
    sget-object v0, Lcom/orange/business/packid/android/lib/TransactionErrorType;->b:[Lcom/orange/business/packid/android/lib/TransactionErrorType;

    invoke-virtual {v0}, [Lcom/orange/business/packid/android/lib/TransactionErrorType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/orange/business/packid/android/lib/TransactionErrorType;

    return-object v0
.end method
