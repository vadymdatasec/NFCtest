.class public final enum Lcom/orange/oab/contactless/packid/ContactlessType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/orange/oab/contactless/packid/ContactlessType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

.field public static final enum NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

.field public static final enum NFC_AND_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

.field public static final enum NFC_OR_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

.field public static final enum PERSONALISED:Lcom/orange/oab/contactless/packid/ContactlessType;

.field public static final synthetic b:[Lcom/orange/oab/contactless/packid/ContactlessType;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType;

    const-string v1, "NFC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 2
    new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType;

    const-string v1, "BLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 3
    new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType;

    const-string v1, "NFC_AND_BLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC_AND_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 4
    new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType;

    const-string v1, "NFC_OR_BLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC_OR_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    .line 5
    new-instance v0, Lcom/orange/oab/contactless/packid/ContactlessType;

    const-string v1, "PERSONALISED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/orange/oab/contactless/packid/ContactlessType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->PERSONALISED:Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-static {}, Lcom/orange/oab/contactless/packid/ContactlessType;->a()[Lcom/orange/oab/contactless/packid/ContactlessType;

    move-result-object v0

    sput-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->b:[Lcom/orange/oab/contactless/packid/ContactlessType;

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

.method public static final synthetic a()[Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/orange/oab/contactless/packid/ContactlessType;

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC_AND_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->NFC_OR_BLE:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/ContactlessType;->PERSONALISED:Lcom/orange/oab/contactless/packid/ContactlessType;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 1

    const-class v0, Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/orange/oab/contactless/packid/ContactlessType;

    return-object p0
.end method

.method public static values()[Lcom/orange/oab/contactless/packid/ContactlessType;
    .locals 1

    sget-object v0, Lcom/orange/oab/contactless/packid/ContactlessType;->b:[Lcom/orange/oab/contactless/packid/ContactlessType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/orange/oab/contactless/packid/ContactlessType;

    return-object v0
.end method
