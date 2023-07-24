.class public final enum Le/f/e/s/d/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/e/s/d/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/e/s/d/f;

.field public static final enum c:Le/f/e/s/d/f;

.field public static final enum d:Le/f/e/s/d/f;

.field public static final enum e:Le/f/e/s/d/f;

.field public static final enum f:Le/f/e/s/d/f;

.field public static final enum g:Le/f/e/s/d/f;

.field public static final synthetic h:[Le/f/e/s/d/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Le/f/e/s/d/f;

    const/4 v1, 0x0

    const-string v2, "ALPHA"

    invoke-direct {v0, v2, v1}, Le/f/e/s/d/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    .line 2
    new-instance v0, Le/f/e/s/d/f;

    const/4 v2, 0x1

    const-string v3, "LOWER"

    invoke-direct {v0, v3, v2}, Le/f/e/s/d/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/e/s/d/f;->c:Le/f/e/s/d/f;

    .line 3
    new-instance v0, Le/f/e/s/d/f;

    const/4 v3, 0x2

    const-string v4, "MIXED"

    invoke-direct {v0, v4, v3}, Le/f/e/s/d/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/e/s/d/f;->d:Le/f/e/s/d/f;

    .line 4
    new-instance v0, Le/f/e/s/d/f;

    const/4 v4, 0x3

    const-string v5, "PUNCT"

    invoke-direct {v0, v5, v4}, Le/f/e/s/d/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/e/s/d/f;->e:Le/f/e/s/d/f;

    .line 5
    new-instance v0, Le/f/e/s/d/f;

    const/4 v5, 0x4

    const-string v6, "ALPHA_SHIFT"

    invoke-direct {v0, v6, v5}, Le/f/e/s/d/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/e/s/d/f;->f:Le/f/e/s/d/f;

    .line 6
    new-instance v0, Le/f/e/s/d/f;

    const/4 v6, 0x5

    const-string v7, "PUNCT_SHIFT"

    invoke-direct {v0, v7, v6}, Le/f/e/s/d/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/e/s/d/f;->g:Le/f/e/s/d/f;

    const/4 v7, 0x6

    new-array v7, v7, [Le/f/e/s/d/f;

    .line 7
    sget-object v8, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    aput-object v8, v7, v1

    sget-object v1, Le/f/e/s/d/f;->c:Le/f/e/s/d/f;

    aput-object v1, v7, v2

    sget-object v1, Le/f/e/s/d/f;->d:Le/f/e/s/d/f;

    aput-object v1, v7, v3

    sget-object v1, Le/f/e/s/d/f;->e:Le/f/e/s/d/f;

    aput-object v1, v7, v4

    sget-object v1, Le/f/e/s/d/f;->f:Le/f/e/s/d/f;

    aput-object v1, v7, v5

    aput-object v0, v7, v6

    sput-object v7, Le/f/e/s/d/f;->h:[Le/f/e/s/d/f;

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

.method public static valueOf(Ljava/lang/String;)Le/f/e/s/d/f;
    .locals 1

    .line 1
    const-class v0, Le/f/e/s/d/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/e/s/d/f;

    return-object p0
.end method

.method public static values()[Le/f/e/s/d/f;
    .locals 1

    .line 1
    sget-object v0, Le/f/e/s/d/f;->h:[Le/f/e/s/d/f;

    invoke-virtual {v0}, [Le/f/e/s/d/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/e/s/d/f;

    return-object v0
.end method
