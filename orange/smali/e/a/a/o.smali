.class public final enum Le/a/a/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/a/a/o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/a/a/o;

.field public static final enum c:Le/a/a/o;

.field public static final enum d:Le/a/a/o;

.field public static final enum e:Le/a/a/o;

.field public static final synthetic f:[Le/a/a/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Le/a/a/o;

    const/4 v1, 0x0

    const-string v2, "LOW"

    invoke-direct {v0, v2, v1}, Le/a/a/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/a/a/o;->b:Le/a/a/o;

    .line 2
    new-instance v0, Le/a/a/o;

    const/4 v2, 0x1

    const-string v3, "NORMAL"

    invoke-direct {v0, v3, v2}, Le/a/a/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/a/a/o;->c:Le/a/a/o;

    .line 3
    new-instance v0, Le/a/a/o;

    const/4 v3, 0x2

    const-string v4, "HIGH"

    invoke-direct {v0, v4, v3}, Le/a/a/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/a/a/o;->d:Le/a/a/o;

    .line 4
    new-instance v0, Le/a/a/o;

    const/4 v4, 0x3

    const-string v5, "IMMEDIATE"

    invoke-direct {v0, v5, v4}, Le/a/a/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/a/a/o;->e:Le/a/a/o;

    const/4 v5, 0x4

    new-array v5, v5, [Le/a/a/o;

    .line 5
    sget-object v6, Le/a/a/o;->b:Le/a/a/o;

    aput-object v6, v5, v1

    sget-object v1, Le/a/a/o;->c:Le/a/a/o;

    aput-object v1, v5, v2

    sget-object v1, Le/a/a/o;->d:Le/a/a/o;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Le/a/a/o;->f:[Le/a/a/o;

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

.method public static valueOf(Ljava/lang/String;)Le/a/a/o;
    .locals 1

    .line 1
    const-class v0, Le/a/a/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/a/a/o;

    return-object p0
.end method

.method public static values()[Le/a/a/o;
    .locals 1

    .line 1
    sget-object v0, Le/a/a/o;->f:[Le/a/a/o;

    invoke-virtual {v0}, [Le/a/a/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/a/a/o;

    return-object v0
.end method
