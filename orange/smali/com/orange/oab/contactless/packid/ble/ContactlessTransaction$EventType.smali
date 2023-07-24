.class public final enum Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "EventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DONE:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

.field public static final enum ERROR:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

.field public static final enum INSUFFICIENT_SECURITY:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

.field public static final enum INTERRUPTED:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

.field public static final enum START:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

.field public static final synthetic b:[Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v1, 0x0

    const-string v2, "START"

    invoke-direct {v0, v2, v1}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->START:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v2, 0x1

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v2}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->ERROR:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v3, 0x2

    const-string v4, "INTERRUPTED"

    invoke-direct {v0, v4, v3}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->INTERRUPTED:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v4, 0x3

    const-string v5, "INSUFFICIENT_SECURITY"

    invoke-direct {v0, v5, v4}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->INSUFFICIENT_SECURITY:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    new-instance v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v5, 0x4

    const-string v6, "DONE"

    invoke-direct {v0, v6, v5}, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->DONE:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    const/4 v6, 0x5

    new-array v6, v6, [Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    .line 2
    sget-object v7, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->START:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    aput-object v7, v6, v1

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->ERROR:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    aput-object v1, v6, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->INTERRUPTED:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    aput-object v1, v6, v3

    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->INSUFFICIENT_SECURITY:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->b:[Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;
    .locals 1

    .line 1
    const-class v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    return-object p0
.end method

.method public static values()[Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;
    .locals 1

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->b:[Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    invoke-virtual {v0}, [Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    return-object v0
.end method
