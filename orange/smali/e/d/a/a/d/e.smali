.class public final enum Le/d/a/a/d/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/d/a/a/d/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/d/a/a/d/e;

.field public static final enum c:Le/d/a/a/d/e;

.field public static final enum d:Le/d/a/a/d/e;

.field public static final enum e:Le/d/a/a/d/e;

.field public static final enum f:Le/d/a/a/d/e;

.field public static final enum g:Le/d/a/a/d/e;

.field public static final synthetic h:[Le/d/a/a/d/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le/d/a/a/d/e;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le/d/a/a/d/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/d/a/a/d/e;->b:Le/d/a/a/d/e;

    .line 2
    new-instance v0, Le/d/a/a/d/e;

    const-string v1, "FAILED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Le/d/a/a/d/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/d/a/a/d/e;->c:Le/d/a/a/d/e;

    .line 3
    new-instance v0, Le/d/a/a/d/e;

    const-string v1, "FAILED_CERTIFICATE_CHAIN_NOT_TRUSTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Le/d/a/a/d/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/d/a/a/d/e;->d:Le/d/a/a/d/e;

    .line 4
    new-instance v0, Le/d/a/a/d/e;

    const-string v1, "ERROR_INVALID_PARAMETERS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Le/d/a/a/d/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/d/a/a/d/e;->e:Le/d/a/a/d/e;

    .line 5
    new-instance v0, Le/d/a/a/d/e;

    const-string v1, "FAILED_USER_DEFINED_TRUST_ANCHOR"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Le/d/a/a/d/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/d/a/a/d/e;->f:Le/d/a/a/d/e;

    .line 6
    new-instance v0, Le/d/a/a/d/e;

    const-string v1, "ERROR_COULD_NOT_GENERATE_SPKI_HASH"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Le/d/a/a/d/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/d/a/a/d/e;->g:Le/d/a/a/d/e;

    .line 7
    invoke-static {}, Le/d/a/a/d/e;->a()[Le/d/a/a/d/e;

    move-result-object v0

    sput-object v0, Le/d/a/a/d/e;->h:[Le/d/a/a/d/e;

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

.method public static synthetic a()[Le/d/a/a/d/e;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Le/d/a/a/d/e;

    .line 1
    sget-object v1, Le/d/a/a/d/e;->b:Le/d/a/a/d/e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Le/d/a/a/d/e;->c:Le/d/a/a/d/e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Le/d/a/a/d/e;->d:Le/d/a/a/d/e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Le/d/a/a/d/e;->e:Le/d/a/a/d/e;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Le/d/a/a/d/e;->f:Le/d/a/a/d/e;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Le/d/a/a/d/e;->g:Le/d/a/a/d/e;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Le/d/a/a/d/e;
    .locals 1

    .line 1
    const-class v0, Le/d/a/a/d/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/d/a/a/d/e;

    return-object p0
.end method

.method public static values()[Le/d/a/a/d/e;
    .locals 1

    .line 1
    sget-object v0, Le/d/a/a/d/e;->h:[Le/d/a/a/d/e;

    invoke-virtual {v0}, [Le/d/a/a/d/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/d/a/a/d/e;

    return-object v0
.end method
