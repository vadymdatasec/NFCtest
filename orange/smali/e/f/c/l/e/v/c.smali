.class public final enum Le/f/c/l/e/v/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/c/l/e/v/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/c/l/e/v/c;

.field public static final enum c:Le/f/c/l/e/v/c;

.field public static final enum d:Le/f/c/l/e/v/c;

.field public static final synthetic e:[Le/f/c/l/e/v/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Le/f/c/l/e/v/c;

    const/4 v1, 0x0

    const-string v2, "USE_CACHE"

    invoke-direct {v0, v2, v1}, Le/f/c/l/e/v/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/v/c;->b:Le/f/c/l/e/v/c;

    .line 2
    new-instance v0, Le/f/c/l/e/v/c;

    const/4 v2, 0x1

    const-string v3, "SKIP_CACHE_LOOKUP"

    invoke-direct {v0, v3, v2}, Le/f/c/l/e/v/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/v/c;->c:Le/f/c/l/e/v/c;

    .line 3
    new-instance v0, Le/f/c/l/e/v/c;

    const/4 v3, 0x2

    const-string v4, "IGNORE_CACHE_EXPIRATION"

    invoke-direct {v0, v4, v3}, Le/f/c/l/e/v/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/v/c;->d:Le/f/c/l/e/v/c;

    const/4 v4, 0x3

    new-array v4, v4, [Le/f/c/l/e/v/c;

    .line 4
    sget-object v5, Le/f/c/l/e/v/c;->b:Le/f/c/l/e/v/c;

    aput-object v5, v4, v1

    sget-object v1, Le/f/c/l/e/v/c;->c:Le/f/c/l/e/v/c;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Le/f/c/l/e/v/c;->e:[Le/f/c/l/e/v/c;

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

.method public static valueOf(Ljava/lang/String;)Le/f/c/l/e/v/c;
    .locals 1

    .line 1
    const-class v0, Le/f/c/l/e/v/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/c/l/e/v/c;

    return-object p0
.end method

.method public static values()[Le/f/c/l/e/v/c;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/v/c;->e:[Le/f/c/l/e/v/c;

    invoke-virtual {v0}, [Le/f/c/l/e/v/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/c/l/e/v/c;

    return-object v0
.end method
