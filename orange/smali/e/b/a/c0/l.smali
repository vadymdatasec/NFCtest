.class public final enum Le/b/a/c0/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/b/a/c0/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/b/a/c0/l;

.field public static final enum c:Le/b/a/c0/l;

.field public static final enum d:Le/b/a/c0/l;

.field public static final enum e:Le/b/a/c0/l;

.field public static final enum f:Le/b/a/c0/l;

.field public static final enum g:Le/b/a/c0/l;

.field public static final synthetic h:[Le/b/a/c0/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Le/b/a/c0/l;

    const/4 v1, 0x0

    const-string v2, "PENDING"

    invoke-direct {v0, v2, v1}, Le/b/a/c0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/c0/l;->b:Le/b/a/c0/l;

    .line 2
    new-instance v0, Le/b/a/c0/l;

    const/4 v2, 0x1

    const-string v3, "RUNNING"

    invoke-direct {v0, v3, v2}, Le/b/a/c0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/c0/l;->c:Le/b/a/c0/l;

    .line 3
    new-instance v0, Le/b/a/c0/l;

    const/4 v3, 0x2

    const-string v4, "WAITING_FOR_SIZE"

    invoke-direct {v0, v4, v3}, Le/b/a/c0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/c0/l;->d:Le/b/a/c0/l;

    .line 4
    new-instance v0, Le/b/a/c0/l;

    const/4 v4, 0x3

    const-string v5, "COMPLETE"

    invoke-direct {v0, v5, v4}, Le/b/a/c0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/c0/l;->e:Le/b/a/c0/l;

    .line 5
    new-instance v0, Le/b/a/c0/l;

    const/4 v5, 0x4

    const-string v6, "FAILED"

    invoke-direct {v0, v6, v5}, Le/b/a/c0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/c0/l;->f:Le/b/a/c0/l;

    .line 6
    new-instance v0, Le/b/a/c0/l;

    const/4 v6, 0x5

    const-string v7, "CLEARED"

    invoke-direct {v0, v7, v6}, Le/b/a/c0/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/c0/l;->g:Le/b/a/c0/l;

    const/4 v7, 0x6

    new-array v7, v7, [Le/b/a/c0/l;

    .line 7
    sget-object v8, Le/b/a/c0/l;->b:Le/b/a/c0/l;

    aput-object v8, v7, v1

    sget-object v1, Le/b/a/c0/l;->c:Le/b/a/c0/l;

    aput-object v1, v7, v2

    sget-object v1, Le/b/a/c0/l;->d:Le/b/a/c0/l;

    aput-object v1, v7, v3

    sget-object v1, Le/b/a/c0/l;->e:Le/b/a/c0/l;

    aput-object v1, v7, v4

    sget-object v1, Le/b/a/c0/l;->f:Le/b/a/c0/l;

    aput-object v1, v7, v5

    aput-object v0, v7, v6

    sput-object v7, Le/b/a/c0/l;->h:[Le/b/a/c0/l;

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

.method public static valueOf(Ljava/lang/String;)Le/b/a/c0/l;
    .locals 1

    .line 1
    const-class v0, Le/b/a/c0/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/b/a/c0/l;

    return-object p0
.end method

.method public static values()[Le/b/a/c0/l;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/c0/l;->h:[Le/b/a/c0/l;

    invoke-virtual {v0}, [Le/b/a/c0/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/b/a/c0/l;

    return-object v0
.end method
