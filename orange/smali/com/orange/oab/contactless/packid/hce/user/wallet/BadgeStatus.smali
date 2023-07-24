.class public final enum Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DELETION_FAILURE:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

.field public static final enum INSTALLATION_FAILURE:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

.field public static final enum INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

.field public static final enum INSTALLING:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

.field public static final synthetic b:[Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    const/4 v1, 0x0

    const-string v2, "INSTALLING"

    invoke-direct {v0, v2, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLING:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    .line 2
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    const/4 v2, 0x1

    const-string v3, "INSTALLED"

    invoke-direct {v0, v3, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    .line 3
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    const/4 v3, 0x2

    const-string v4, "DELETION_FAILURE"

    invoke-direct {v0, v4, v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->DELETION_FAILURE:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    .line 4
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    const/4 v4, 0x3

    const-string v5, "INSTALLATION_FAILURE"

    invoke-direct {v0, v5, v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLATION_FAILURE:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    const/4 v5, 0x4

    new-array v5, v5, [Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    .line 5
    sget-object v6, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLING:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    aput-object v6, v5, v1

    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLED:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    aput-object v1, v5, v2

    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->DELETION_FAILURE:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->b:[Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

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

.method public static valueOf(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;
    .locals 1

    .line 1
    const-class v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    return-object p0
.end method

.method public static values()[Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;
    .locals 1

    .line 1
    sget-object v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->b:[Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    invoke-virtual {v0}, [Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    return-object v0
.end method
