.class public final enum Le/b/a/y/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/b/a/y/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/b/a/y/a;

.field public static final enum c:Le/b/a/y/a;

.field public static final enum d:Le/b/a/y/a;

.field public static final enum e:Le/b/a/y/a;

.field public static final enum f:Le/b/a/y/a;

.field public static final synthetic g:[Le/b/a/y/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Le/b/a/y/a;

    const/4 v1, 0x0

    const-string v2, "LOCAL"

    invoke-direct {v0, v2, v1}, Le/b/a/y/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/y/a;->b:Le/b/a/y/a;

    .line 2
    new-instance v0, Le/b/a/y/a;

    const/4 v2, 0x1

    const-string v3, "REMOTE"

    invoke-direct {v0, v3, v2}, Le/b/a/y/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/y/a;->c:Le/b/a/y/a;

    .line 3
    new-instance v0, Le/b/a/y/a;

    const/4 v3, 0x2

    const-string v4, "DATA_DISK_CACHE"

    invoke-direct {v0, v4, v3}, Le/b/a/y/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/y/a;->d:Le/b/a/y/a;

    .line 4
    new-instance v0, Le/b/a/y/a;

    const/4 v4, 0x3

    const-string v5, "RESOURCE_DISK_CACHE"

    invoke-direct {v0, v5, v4}, Le/b/a/y/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/y/a;->e:Le/b/a/y/a;

    .line 5
    new-instance v0, Le/b/a/y/a;

    const/4 v5, 0x4

    const-string v6, "MEMORY_CACHE"

    invoke-direct {v0, v6, v5}, Le/b/a/y/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/y/a;->f:Le/b/a/y/a;

    const/4 v6, 0x5

    new-array v6, v6, [Le/b/a/y/a;

    .line 6
    sget-object v7, Le/b/a/y/a;->b:Le/b/a/y/a;

    aput-object v7, v6, v1

    sget-object v1, Le/b/a/y/a;->c:Le/b/a/y/a;

    aput-object v1, v6, v2

    sget-object v1, Le/b/a/y/a;->d:Le/b/a/y/a;

    aput-object v1, v6, v3

    sget-object v1, Le/b/a/y/a;->e:Le/b/a/y/a;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Le/b/a/y/a;->g:[Le/b/a/y/a;

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

.method public static valueOf(Ljava/lang/String;)Le/b/a/y/a;
    .locals 1

    .line 1
    const-class v0, Le/b/a/y/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/b/a/y/a;

    return-object p0
.end method

.method public static values()[Le/b/a/y/a;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/y/a;->g:[Le/b/a/y/a;

    invoke-virtual {v0}, [Le/b/a/y/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/b/a/y/a;

    return-object v0
.end method
