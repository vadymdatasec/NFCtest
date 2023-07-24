.class public final enum Le/b/a/y/z/e/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/b/a/y/z/e/t;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/b/a/y/z/e/t;

.field public static final enum c:Le/b/a/y/z/e/t;

.field public static final synthetic d:[Le/b/a/y/z/e/t;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Le/b/a/y/z/e/t;

    const/4 v1, 0x0

    const-string v2, "MEMORY"

    invoke-direct {v0, v2, v1}, Le/b/a/y/z/e/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/y/z/e/t;->b:Le/b/a/y/z/e/t;

    .line 2
    new-instance v0, Le/b/a/y/z/e/t;

    const/4 v2, 0x1

    const-string v3, "QUALITY"

    invoke-direct {v0, v3, v2}, Le/b/a/y/z/e/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/b/a/y/z/e/t;->c:Le/b/a/y/z/e/t;

    const/4 v3, 0x2

    new-array v3, v3, [Le/b/a/y/z/e/t;

    .line 3
    sget-object v4, Le/b/a/y/z/e/t;->b:Le/b/a/y/z/e/t;

    aput-object v4, v3, v1

    aput-object v0, v3, v2

    sput-object v3, Le/b/a/y/z/e/t;->d:[Le/b/a/y/z/e/t;

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

.method public static valueOf(Ljava/lang/String;)Le/b/a/y/z/e/t;
    .locals 1

    .line 1
    const-class v0, Le/b/a/y/z/e/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/b/a/y/z/e/t;

    return-object p0
.end method

.method public static values()[Le/b/a/y/z/e/t;
    .locals 1

    .line 1
    sget-object v0, Le/b/a/y/z/e/t;->d:[Le/b/a/y/z/e/t;

    invoke-virtual {v0}, [Le/b/a/y/z/e/t;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/b/a/y/z/e/t;

    return-object v0
.end method
