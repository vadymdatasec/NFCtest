.class public final enum Le/f/c/l/e/q/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/c/l/e/q/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/c/l/e/q/a;

.field public static final enum c:Le/f/c/l/e/q/a;

.field public static final enum d:Le/f/c/l/e/q/a;

.field public static final enum e:Le/f/c/l/e/q/a;

.field public static final synthetic f:[Le/f/c/l/e/q/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Le/f/c/l/e/q/a;

    const/4 v1, 0x0

    const-string v2, "GET"

    invoke-direct {v0, v2, v1}, Le/f/c/l/e/q/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/q/a;->b:Le/f/c/l/e/q/a;

    .line 2
    new-instance v0, Le/f/c/l/e/q/a;

    const/4 v2, 0x1

    const-string v3, "POST"

    invoke-direct {v0, v3, v2}, Le/f/c/l/e/q/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/q/a;->c:Le/f/c/l/e/q/a;

    .line 3
    new-instance v0, Le/f/c/l/e/q/a;

    const/4 v3, 0x2

    const-string v4, "PUT"

    invoke-direct {v0, v4, v3}, Le/f/c/l/e/q/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/q/a;->d:Le/f/c/l/e/q/a;

    .line 4
    new-instance v0, Le/f/c/l/e/q/a;

    const/4 v4, 0x3

    const-string v5, "DELETE"

    invoke-direct {v0, v5, v4}, Le/f/c/l/e/q/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/q/a;->e:Le/f/c/l/e/q/a;

    const/4 v5, 0x4

    new-array v5, v5, [Le/f/c/l/e/q/a;

    .line 5
    sget-object v6, Le/f/c/l/e/q/a;->b:Le/f/c/l/e/q/a;

    aput-object v6, v5, v1

    sget-object v1, Le/f/c/l/e/q/a;->c:Le/f/c/l/e/q/a;

    aput-object v1, v5, v2

    sget-object v1, Le/f/c/l/e/q/a;->d:Le/f/c/l/e/q/a;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Le/f/c/l/e/q/a;->f:[Le/f/c/l/e/q/a;

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

.method public static valueOf(Ljava/lang/String;)Le/f/c/l/e/q/a;
    .locals 1

    .line 1
    const-class v0, Le/f/c/l/e/q/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/c/l/e/q/a;

    return-object p0
.end method

.method public static values()[Le/f/c/l/e/q/a;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/q/a;->f:[Le/f/c/l/e/q/a;

    invoke-virtual {v0}, [Le/f/c/l/e/q/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/c/l/e/q/a;

    return-object v0
.end method
