.class public final enum Le/f/e/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/e/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/e/d;

.field public static final enum c:Le/f/e/d;

.field public static final enum d:Le/f/e/d;

.field public static final enum e:Le/f/e/d;

.field public static final enum f:Le/f/e/d;

.field public static final enum g:Le/f/e/d;

.field public static final enum h:Le/f/e/d;

.field public static final enum i:Le/f/e/d;

.field public static final enum j:Le/f/e/d;

.field public static final enum k:Le/f/e/d;

.field public static final enum l:Le/f/e/d;

.field public static final synthetic m:[Le/f/e/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 1
    const-class v0, [I

    new-instance v1, Le/f/e/d;

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "OTHER"

    invoke-direct {v1, v4, v3, v2}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->b:Le/f/e/d;

    .line 2
    new-instance v1, Le/f/e/d;

    const-class v2, Ljava/lang/Void;

    const/4 v4, 0x1

    const-string v5, "PURE_BARCODE"

    invoke-direct {v1, v5, v4, v2}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->c:Le/f/e/d;

    .line 3
    new-instance v1, Le/f/e/d;

    const-class v2, Ljava/util/List;

    const/4 v5, 0x2

    const-string v6, "POSSIBLE_FORMATS"

    invoke-direct {v1, v6, v5, v2}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->d:Le/f/e/d;

    .line 4
    new-instance v1, Le/f/e/d;

    const-class v2, Ljava/lang/Void;

    const/4 v6, 0x3

    const-string v7, "TRY_HARDER"

    invoke-direct {v1, v7, v6, v2}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->e:Le/f/e/d;

    .line 5
    new-instance v1, Le/f/e/d;

    const-class v2, Ljava/lang/String;

    const/4 v7, 0x4

    const-string v8, "CHARACTER_SET"

    invoke-direct {v1, v8, v7, v2}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->f:Le/f/e/d;

    .line 6
    new-instance v1, Le/f/e/d;

    const/4 v2, 0x5

    const-string v8, "ALLOWED_LENGTHS"

    invoke-direct {v1, v8, v2, v0}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->g:Le/f/e/d;

    .line 7
    new-instance v1, Le/f/e/d;

    const-class v8, Ljava/lang/Void;

    const/4 v9, 0x6

    const-string v10, "ASSUME_CODE_39_CHECK_DIGIT"

    invoke-direct {v1, v10, v9, v8}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->h:Le/f/e/d;

    .line 8
    new-instance v1, Le/f/e/d;

    const-class v8, Ljava/lang/Void;

    const/4 v10, 0x7

    const-string v11, "ASSUME_GS1"

    invoke-direct {v1, v11, v10, v8}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->i:Le/f/e/d;

    .line 9
    new-instance v1, Le/f/e/d;

    const-class v8, Ljava/lang/Void;

    const/16 v11, 0x8

    const-string v12, "RETURN_CODABAR_START_END"

    invoke-direct {v1, v12, v11, v8}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->j:Le/f/e/d;

    .line 10
    new-instance v1, Le/f/e/d;

    const-class v8, Le/f/e/m;

    const/16 v12, 0x9

    const-string v13, "NEED_RESULT_POINT_CALLBACK"

    invoke-direct {v1, v13, v12, v8}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->k:Le/f/e/d;

    .line 11
    new-instance v1, Le/f/e/d;

    const/16 v8, 0xa

    const-string v13, "ALLOWED_EAN_EXTENSIONS"

    invoke-direct {v1, v13, v8, v0}, Le/f/e/d;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Le/f/e/d;->l:Le/f/e/d;

    const/16 v0, 0xb

    new-array v0, v0, [Le/f/e/d;

    .line 12
    sget-object v13, Le/f/e/d;->b:Le/f/e/d;

    aput-object v13, v0, v3

    sget-object v3, Le/f/e/d;->c:Le/f/e/d;

    aput-object v3, v0, v4

    sget-object v3, Le/f/e/d;->d:Le/f/e/d;

    aput-object v3, v0, v5

    sget-object v3, Le/f/e/d;->e:Le/f/e/d;

    aput-object v3, v0, v6

    sget-object v3, Le/f/e/d;->f:Le/f/e/d;

    aput-object v3, v0, v7

    sget-object v3, Le/f/e/d;->g:Le/f/e/d;

    aput-object v3, v0, v2

    sget-object v2, Le/f/e/d;->h:Le/f/e/d;

    aput-object v2, v0, v9

    sget-object v2, Le/f/e/d;->i:Le/f/e/d;

    aput-object v2, v0, v10

    sget-object v2, Le/f/e/d;->j:Le/f/e/d;

    aput-object v2, v0, v11

    sget-object v2, Le/f/e/d;->k:Le/f/e/d;

    aput-object v2, v0, v12

    aput-object v1, v0, v8

    sput-object v0, Le/f/e/d;->m:[Le/f/e/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/f/e/d;
    .locals 1

    .line 1
    const-class v0, Le/f/e/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/e/d;

    return-object p0
.end method

.method public static values()[Le/f/e/d;
    .locals 1

    .line 1
    sget-object v0, Le/f/e/d;->m:[Le/f/e/d;

    invoke-virtual {v0}, [Le/f/e/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/e/d;

    return-object v0
.end method
