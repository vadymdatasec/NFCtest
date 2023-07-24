.class public final enum Le/f/c/l/e/m/j1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/c/l/e/m/j1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/c/l/e/m/j1;

.field public static final enum c:Le/f/c/l/e/m/j1;

.field public static final enum d:Le/f/c/l/e/m/j1;

.field public static final synthetic e:[Le/f/c/l/e/m/j1;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Le/f/c/l/e/m/j1;

    const/4 v1, 0x0

    const-string v2, "NONE"

    invoke-direct {v0, v2, v1}, Le/f/c/l/e/m/j1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/j1;->b:Le/f/c/l/e/m/j1;

    .line 2
    new-instance v0, Le/f/c/l/e/m/j1;

    const/4 v2, 0x1

    const-string v3, "JAVA_ONLY"

    invoke-direct {v0, v3, v2}, Le/f/c/l/e/m/j1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/j1;->c:Le/f/c/l/e/m/j1;

    .line 3
    new-instance v0, Le/f/c/l/e/m/j1;

    const/4 v3, 0x2

    const-string v4, "ALL"

    invoke-direct {v0, v4, v3}, Le/f/c/l/e/m/j1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/c/l/e/m/j1;->d:Le/f/c/l/e/m/j1;

    const/4 v4, 0x3

    new-array v4, v4, [Le/f/c/l/e/m/j1;

    .line 4
    sget-object v5, Le/f/c/l/e/m/j1;->b:Le/f/c/l/e/m/j1;

    aput-object v5, v4, v1

    sget-object v1, Le/f/c/l/e/m/j1;->c:Le/f/c/l/e/m/j1;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Le/f/c/l/e/m/j1;->e:[Le/f/c/l/e/m/j1;

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

.method public static a(Le/f/c/l/e/v/j/b;)Le/f/c/l/e/m/j1;
    .locals 4

    .line 4
    iget v0, p0, Le/f/c/l/e/v/j/b;->g:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    iget p0, p0, Le/f/c/l/e/v/j/b;->h:I

    if-ne p0, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 6
    :goto_1
    invoke-static {v0, v1}, Le/f/c/l/e/m/j1;->a(ZZ)Le/f/c/l/e/m/j1;

    move-result-object p0

    return-object p0
.end method

.method public static a(ZZ)Le/f/c/l/e/m/j1;
    .locals 0

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Le/f/c/l/e/m/j1;->b:Le/f/c/l/e/m/j1;

    return-object p0

    :cond_0
    if-nez p1, :cond_1

    .line 2
    sget-object p0, Le/f/c/l/e/m/j1;->c:Le/f/c/l/e/m/j1;

    return-object p0

    .line 3
    :cond_1
    sget-object p0, Le/f/c/l/e/m/j1;->d:Le/f/c/l/e/m/j1;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Le/f/c/l/e/m/j1;
    .locals 1

    .line 1
    const-class v0, Le/f/c/l/e/m/j1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/c/l/e/m/j1;

    return-object p0
.end method

.method public static values()[Le/f/c/l/e/m/j1;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/m/j1;->e:[Le/f/c/l/e/m/j1;

    invoke-virtual {v0}, [Le/f/c/l/e/m/j1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/c/l/e/m/j1;

    return-object v0
.end method
