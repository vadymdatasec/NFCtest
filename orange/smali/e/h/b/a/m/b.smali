.class public abstract synthetic Le/h/b/a/m/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->values()[Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Le/h/b/a/m/b;->a:[I

    :try_start_0
    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLING:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Le/h/b/a/m/b;->a:[I

    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->INSTALLATION_FAILURE:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Le/h/b/a/m/b;->a:[I

    sget-object v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;->DELETION_FAILURE:Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
