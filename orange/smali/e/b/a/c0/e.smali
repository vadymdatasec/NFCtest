.class public final enum Le/b/a/c0/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/b/a/c0/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Le/b/a/c0/e;

.field public static final enum d:Le/b/a/c0/e;

.field public static final enum e:Le/b/a/c0/e;

.field public static final enum f:Le/b/a/c0/e;

.field public static final enum g:Le/b/a/c0/e;

.field public static final synthetic h:[Le/b/a/c0/e;


# instance fields
.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Le/b/a/c0/e;

    const/4 v1, 0x0

    const-string v2, "RUNNING"

    invoke-direct {v0, v2, v1, v1}, Le/b/a/c0/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    .line 2
    new-instance v0, Le/b/a/c0/e;

    const/4 v2, 0x1

    const-string v3, "PAUSED"

    invoke-direct {v0, v3, v2, v1}, Le/b/a/c0/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Le/b/a/c0/e;->d:Le/b/a/c0/e;

    .line 3
    new-instance v0, Le/b/a/c0/e;

    const/4 v3, 0x2

    const-string v4, "CLEARED"

    invoke-direct {v0, v4, v3, v1}, Le/b/a/c0/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    .line 4
    new-instance v0, Le/b/a/c0/e;

    const/4 v4, 0x3

    const-string v5, "SUCCESS"

    invoke-direct {v0, v5, v4, v2}, Le/b/a/c0/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    .line 5
    new-instance v0, Le/b/a/c0/e;

    const/4 v5, 0x4

    const-string v6, "FAILED"

    invoke-direct {v0, v6, v5, v2}, Le/b/a/c0/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Le/b/a/c0/e;->g:Le/b/a/c0/e;

    const/4 v6, 0x5

    new-array v6, v6, [Le/b/a/c0/e;

    .line 6
    sget-object v7, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    aput-object v7, v6, v1

    sget-object v1, Le/b/a/c0/e;->d:Le/b/a/c0/e;

    aput-object v1, v6, v2

    sget-object v1, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    aput-object v1, v6, v3

    sget-object v1, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Le/b/a/c0/e;->h:[Le/b/a/c0/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-boolean p3, p0, Le/b/a/c0/e;->b:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/b/a/c0/e;
    .locals 1

    .line 1
    const-class v0, Le/b/a/c0/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/b/a/c0/e;

    return-object p0
.end method

.method public static values()[Le/b/a/c0/e;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/c0/e;->h:[Le/b/a/c0/e;

    invoke-virtual {v0}, [Le/b/a/c0/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/b/a/c0/e;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/c0/e;->b:Z

    return v0
.end method
