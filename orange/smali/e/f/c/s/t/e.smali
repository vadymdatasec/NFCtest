.class public final enum Le/f/c/s/t/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/c/s/t/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/c/s/t/e;

.field public static final enum c:Le/f/c/s/t/e;

.field public static final enum d:Le/f/c/s/t/e;

.field public static final enum e:Le/f/c/s/t/e;

.field public static final enum f:Le/f/c/s/t/e;

.field public static final synthetic g:[Le/f/c/s/t/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Le/f/c/s/t/e;

    const/4 v1, 0x0

    const-string v2, "ATTEMPT_MIGRATION"

    invoke-direct {v0, v2, v1}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/s/t/e;->b:Le/f/c/s/t/e;

    .line 2
    new-instance v0, Le/f/c/s/t/e;

    const/4 v2, 0x1

    const-string v3, "NOT_GENERATED"

    invoke-direct {v0, v3, v2}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/s/t/e;->c:Le/f/c/s/t/e;

    .line 3
    new-instance v0, Le/f/c/s/t/e;

    const/4 v3, 0x2

    const-string v4, "UNREGISTERED"

    invoke-direct {v0, v4, v3}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/s/t/e;->d:Le/f/c/s/t/e;

    .line 4
    new-instance v0, Le/f/c/s/t/e;

    const/4 v4, 0x3

    const-string v5, "REGISTERED"

    invoke-direct {v0, v5, v4}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/s/t/e;->e:Le/f/c/s/t/e;

    .line 5
    new-instance v0, Le/f/c/s/t/e;

    const/4 v5, 0x4

    const-string v6, "REGISTER_ERROR"

    invoke-direct {v0, v6, v5}, Le/f/c/s/t/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/s/t/e;->f:Le/f/c/s/t/e;

    const/4 v6, 0x5

    new-array v6, v6, [Le/f/c/s/t/e;

    .line 6
    sget-object v7, Le/f/c/s/t/e;->b:Le/f/c/s/t/e;

    aput-object v7, v6, v1

    sget-object v1, Le/f/c/s/t/e;->c:Le/f/c/s/t/e;

    aput-object v1, v6, v2

    sget-object v1, Le/f/c/s/t/e;->d:Le/f/c/s/t/e;

    aput-object v1, v6, v3

    sget-object v1, Le/f/c/s/t/e;->e:Le/f/c/s/t/e;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Le/f/c/s/t/e;->g:[Le/f/c/s/t/e;

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

.method public static valueOf(Ljava/lang/String;)Le/f/c/s/t/e;
    .locals 1

    .line 1
    const-class v0, Le/f/c/s/t/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/c/s/t/e;

    return-object p0
.end method

.method public static values()[Le/f/c/s/t/e;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/s/t/e;->g:[Le/f/c/s/t/e;

    invoke-virtual {v0}, [Le/f/c/s/t/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/c/s/t/e;

    return-object v0
.end method
