.class public final enum Le/f/c/l/e/m/k1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/c/l/e/m/k1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Le/f/c/l/e/m/k1;

.field public static final enum d:Le/f/c/l/e/m/k1;

.field public static final enum e:Le/f/c/l/e/m/k1;

.field public static final enum f:Le/f/c/l/e/m/k1;

.field public static final synthetic g:[Le/f/c/l/e/m/k1;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Le/f/c/l/e/m/k1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "DEVELOPER"

    invoke-direct {v0, v3, v1, v2}, Le/f/c/l/e/m/k1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/c/l/e/m/k1;->c:Le/f/c/l/e/m/k1;

    .line 2
    new-instance v0, Le/f/c/l/e/m/k1;

    const/4 v3, 0x2

    const-string v4, "USER_SIDELOAD"

    invoke-direct {v0, v4, v2, v3}, Le/f/c/l/e/m/k1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/c/l/e/m/k1;->d:Le/f/c/l/e/m/k1;

    .line 3
    new-instance v0, Le/f/c/l/e/m/k1;

    const/4 v4, 0x3

    const-string v5, "TEST_DISTRIBUTION"

    invoke-direct {v0, v5, v3, v4}, Le/f/c/l/e/m/k1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/c/l/e/m/k1;->e:Le/f/c/l/e/m/k1;

    .line 4
    new-instance v0, Le/f/c/l/e/m/k1;

    const/4 v5, 0x4

    const-string v6, "APP_STORE"

    invoke-direct {v0, v6, v4, v5}, Le/f/c/l/e/m/k1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/c/l/e/m/k1;->f:Le/f/c/l/e/m/k1;

    new-array v5, v5, [Le/f/c/l/e/m/k1;

    .line 5
    sget-object v6, Le/f/c/l/e/m/k1;->c:Le/f/c/l/e/m/k1;

    aput-object v6, v5, v1

    sget-object v1, Le/f/c/l/e/m/k1;->d:Le/f/c/l/e/m/k1;

    aput-object v1, v5, v2

    sget-object v1, Le/f/c/l/e/m/k1;->e:Le/f/c/l/e/m/k1;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Le/f/c/l/e/m/k1;->g:[Le/f/c/l/e/m/k1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Le/f/c/l/e/m/k1;->b:I

    return-void
.end method

.method public static a(Ljava/lang/String;)Le/f/c/l/e/m/k1;
    .locals 0

    if-eqz p0, :cond_0

    .line 2
    sget-object p0, Le/f/c/l/e/m/k1;->f:Le/f/c/l/e/m/k1;

    goto :goto_0

    :cond_0
    sget-object p0, Le/f/c/l/e/m/k1;->c:Le/f/c/l/e/m/k1;

    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Le/f/c/l/e/m/k1;
    .locals 1

    .line 1
    const-class v0, Le/f/c/l/e/m/k1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/c/l/e/m/k1;

    return-object p0
.end method

.method public static values()[Le/f/c/l/e/m/k1;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/l/e/m/k1;->g:[Le/f/c/l/e/m/k1;

    invoke-virtual {v0}, [Le/f/c/l/e/m/k1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/c/l/e/m/k1;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/c/l/e/m/k1;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Le/f/c/l/e/m/k1;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
