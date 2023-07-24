.class public final enum Le/f/a/a/j/g0/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/a/a/j/g0/j;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/a/a/j/g0/j;

.field public static final enum c:Le/f/a/a/j/g0/j;

.field public static final enum d:Le/f/a/a/j/g0/j;

.field public static final synthetic e:[Le/f/a/a/j/g0/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Le/f/a/a/j/g0/j;

    const/4 v1, 0x0

    const-string v2, "OK"

    invoke-direct {v0, v2, v1}, Le/f/a/a/j/g0/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/a/a/j/g0/j;->b:Le/f/a/a/j/g0/j;

    .line 2
    new-instance v0, Le/f/a/a/j/g0/j;

    const/4 v2, 0x1

    const-string v3, "TRANSIENT_ERROR"

    invoke-direct {v0, v3, v2}, Le/f/a/a/j/g0/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/a/a/j/g0/j;->c:Le/f/a/a/j/g0/j;

    .line 3
    new-instance v0, Le/f/a/a/j/g0/j;

    const/4 v3, 0x2

    const-string v4, "FATAL_ERROR"

    invoke-direct {v0, v4, v3}, Le/f/a/a/j/g0/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/a/a/j/g0/j;->d:Le/f/a/a/j/g0/j;

    const/4 v4, 0x3

    new-array v4, v4, [Le/f/a/a/j/g0/j;

    .line 4
    sget-object v5, Le/f/a/a/j/g0/j;->b:Le/f/a/a/j/g0/j;

    aput-object v5, v4, v1

    sget-object v1, Le/f/a/a/j/g0/j;->c:Le/f/a/a/j/g0/j;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Le/f/a/a/j/g0/j;->e:[Le/f/a/a/j/g0/j;

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

.method public static valueOf(Ljava/lang/String;)Le/f/a/a/j/g0/j;
    .locals 1

    .line 1
    const-class v0, Le/f/a/a/j/g0/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/a/a/j/g0/j;

    return-object p0
.end method

.method public static values()[Le/f/a/a/j/g0/j;
    .locals 1

    .line 1
    sget-object v0, Le/f/a/a/j/g0/j;->e:[Le/f/a/a/j/g0/j;

    invoke-virtual {v0}, [Le/f/a/a/j/g0/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/a/a/j/g0/j;

    return-object v0
.end method
