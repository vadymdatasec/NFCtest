.class public final enum Le/f/c/p/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/c/p/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Le/f/c/p/c;

.field public static final enum d:Le/f/c/p/c;

.field public static final enum e:Le/f/c/p/c;

.field public static final enum f:Le/f/c/p/c;

.field public static final synthetic g:[Le/f/c/p/c;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Le/f/c/p/c;

    const/4 v1, 0x0

    const-string v2, "NONE"

    invoke-direct {v0, v2, v1, v1}, Le/f/c/p/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/c/p/c;->c:Le/f/c/p/c;

    .line 2
    new-instance v0, Le/f/c/p/c;

    const/4 v2, 0x1

    const-string v3, "SDK"

    invoke-direct {v0, v3, v2, v2}, Le/f/c/p/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/c/p/c;->d:Le/f/c/p/c;

    .line 3
    new-instance v0, Le/f/c/p/c;

    const/4 v3, 0x2

    const-string v4, "GLOBAL"

    invoke-direct {v0, v4, v3, v3}, Le/f/c/p/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/c/p/c;->e:Le/f/c/p/c;

    .line 4
    new-instance v0, Le/f/c/p/c;

    const/4 v4, 0x3

    const-string v5, "COMBINED"

    invoke-direct {v0, v5, v4, v4}, Le/f/c/p/c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le/f/c/p/c;->f:Le/f/c/p/c;

    const/4 v5, 0x4

    new-array v5, v5, [Le/f/c/p/c;

    .line 5
    sget-object v6, Le/f/c/p/c;->c:Le/f/c/p/c;

    aput-object v6, v5, v1

    sget-object v1, Le/f/c/p/c;->d:Le/f/c/p/c;

    aput-object v1, v5, v2

    sget-object v1, Le/f/c/p/c;->e:Le/f/c/p/c;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Le/f/c/p/c;->g:[Le/f/c/p/c;

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
    iput p3, p0, Le/f/c/p/c;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/f/c/p/c;
    .locals 1

    .line 1
    const-class v0, Le/f/c/p/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/c/p/c;

    return-object p0
.end method

.method public static values()[Le/f/c/p/c;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/p/c;->g:[Le/f/c/p/c;

    invoke-virtual {v0}, [Le/f/c/p/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/c/p/c;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/c/p/c;->b:I

    return v0
.end method
