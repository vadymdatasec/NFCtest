.class public final enum Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic b:[Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

.field public static final enum none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

.field public static final enum unlockPhoneRequired:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    const/4 v1, 0x0

    const-string v2, "none"

    invoke-direct {v0, v2, v1}, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    new-instance v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    const/4 v2, 0x1

    const-string v3, "unlockPhoneRequired"

    invoke-direct {v0, v3, v2}, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->unlockPhoneRequired:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    .line 2
    sget-object v4, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->none:Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    aput-object v4, v3, v1

    aput-object v0, v3, v2

    sput-object v3, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->b:[Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

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

.method public static valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
    .locals 1

    .line 1
    const-class v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    return-object p0
.end method

.method public static values()[Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
    .locals 1

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->b:[Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    invoke-virtual {v0}, [Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;

    return-object v0
.end method
