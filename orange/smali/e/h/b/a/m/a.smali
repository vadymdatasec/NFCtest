.class public final enum Le/h/b/a/m/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/b/a/m/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/h/b/a/m/a;

.field public static final enum c:Le/h/b/a/m/a;

.field public static final enum d:Le/h/b/a/m/a;

.field public static final synthetic e:[Le/h/b/a/m/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Le/h/b/a/m/a;

    const/4 v1, 0x0

    const-string v2, "BADGE"

    invoke-direct {v0, v2, v1}, Le/h/b/a/m/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/b/a/m/a;->b:Le/h/b/a/m/a;

    .line 2
    new-instance v0, Le/h/b/a/m/a;

    const/4 v2, 0x1

    const-string v3, "EMPTY_LINE"

    invoke-direct {v0, v3, v2}, Le/h/b/a/m/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/b/a/m/a;->c:Le/h/b/a/m/a;

    .line 3
    new-instance v0, Le/h/b/a/m/a;

    const/4 v3, 0x2

    const-string v4, "HEADER"

    invoke-direct {v0, v4, v3}, Le/h/b/a/m/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/b/a/m/a;->d:Le/h/b/a/m/a;

    const/4 v4, 0x3

    new-array v4, v4, [Le/h/b/a/m/a;

    .line 4
    sget-object v5, Le/h/b/a/m/a;->b:Le/h/b/a/m/a;

    aput-object v5, v4, v1

    sget-object v1, Le/h/b/a/m/a;->c:Le/h/b/a/m/a;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Le/h/b/a/m/a;->e:[Le/h/b/a/m/a;

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

.method public static valueOf(Ljava/lang/String;)Le/h/b/a/m/a;
    .locals 1

    .line 1
    const-class v0, Le/h/b/a/m/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/b/a/m/a;

    return-object p0
.end method

.method public static values()[Le/h/b/a/m/a;
    .locals 1

    .line 1
    sget-object v0, Le/h/b/a/m/a;->e:[Le/h/b/a/m/a;

    invoke-virtual {v0}, [Le/h/b/a/m/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/b/a/m/a;

    return-object v0
.end method
