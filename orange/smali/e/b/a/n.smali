.class public final enum Le/b/a/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/b/a/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/b/a/n;

.field public static final enum c:Le/b/a/n;

.field public static final enum d:Le/b/a/n;

.field public static final enum e:Le/b/a/n;

.field public static final synthetic f:[Le/b/a/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Le/b/a/n;

    const/4 v1, 0x0

    const-string v2, "IMMEDIATE"

    invoke-direct {v0, v2, v1}, Le/b/a/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/n;->b:Le/b/a/n;

    .line 2
    new-instance v0, Le/b/a/n;

    const/4 v2, 0x1

    const-string v3, "HIGH"

    invoke-direct {v0, v3, v2}, Le/b/a/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/n;->c:Le/b/a/n;

    .line 3
    new-instance v0, Le/b/a/n;

    const/4 v3, 0x2

    const-string v4, "NORMAL"

    invoke-direct {v0, v4, v3}, Le/b/a/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/n;->d:Le/b/a/n;

    .line 4
    new-instance v0, Le/b/a/n;

    const/4 v4, 0x3

    const-string v5, "LOW"

    invoke-direct {v0, v5, v4}, Le/b/a/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/n;->e:Le/b/a/n;

    const/4 v5, 0x4

    new-array v5, v5, [Le/b/a/n;

    .line 5
    sget-object v6, Le/b/a/n;->b:Le/b/a/n;

    aput-object v6, v5, v1

    sget-object v1, Le/b/a/n;->c:Le/b/a/n;

    aput-object v1, v5, v2

    sget-object v1, Le/b/a/n;->d:Le/b/a/n;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Le/b/a/n;->f:[Le/b/a/n;

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

.method public static valueOf(Ljava/lang/String;)Le/b/a/n;
    .locals 1

    .line 1
    const-class v0, Le/b/a/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/b/a/n;

    return-object p0
.end method

.method public static values()[Le/b/a/n;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/n;->f:[Le/b/a/n;

    invoke-virtual {v0}, [Le/b/a/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/b/a/n;

    return-object v0
.end method
