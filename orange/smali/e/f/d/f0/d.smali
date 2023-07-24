.class public final enum Le/f/d/f0/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/d/f0/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/d/f0/d;

.field public static final enum c:Le/f/d/f0/d;

.field public static final enum d:Le/f/d/f0/d;

.field public static final enum e:Le/f/d/f0/d;

.field public static final enum f:Le/f/d/f0/d;

.field public static final enum g:Le/f/d/f0/d;

.field public static final enum h:Le/f/d/f0/d;

.field public static final enum i:Le/f/d/f0/d;

.field public static final synthetic j:[Le/f/d/f0/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Le/f/d/f0/d;

    const/4 v1, 0x0

    const-string v2, "EMPTY_ARRAY"

    invoke-direct {v0, v2, v1}, Le/f/d/f0/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/f0/d;->b:Le/f/d/f0/d;

    .line 2
    new-instance v0, Le/f/d/f0/d;

    const/4 v2, 0x1

    const-string v3, "NONEMPTY_ARRAY"

    invoke-direct {v0, v3, v2}, Le/f/d/f0/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/f0/d;->c:Le/f/d/f0/d;

    .line 3
    new-instance v0, Le/f/d/f0/d;

    const/4 v3, 0x2

    const-string v4, "EMPTY_OBJECT"

    invoke-direct {v0, v4, v3}, Le/f/d/f0/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/f0/d;->d:Le/f/d/f0/d;

    .line 4
    new-instance v0, Le/f/d/f0/d;

    const/4 v4, 0x3

    const-string v5, "DANGLING_NAME"

    invoke-direct {v0, v5, v4}, Le/f/d/f0/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/f0/d;->e:Le/f/d/f0/d;

    .line 5
    new-instance v0, Le/f/d/f0/d;

    const/4 v5, 0x4

    const-string v6, "NONEMPTY_OBJECT"

    invoke-direct {v0, v6, v5}, Le/f/d/f0/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/f0/d;->f:Le/f/d/f0/d;

    .line 6
    new-instance v0, Le/f/d/f0/d;

    const/4 v6, 0x5

    const-string v7, "EMPTY_DOCUMENT"

    invoke-direct {v0, v7, v6}, Le/f/d/f0/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/f0/d;->g:Le/f/d/f0/d;

    .line 7
    new-instance v0, Le/f/d/f0/d;

    const/4 v7, 0x6

    const-string v8, "NONEMPTY_DOCUMENT"

    invoke-direct {v0, v8, v7}, Le/f/d/f0/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/f0/d;->h:Le/f/d/f0/d;

    .line 8
    new-instance v0, Le/f/d/f0/d;

    const/4 v8, 0x7

    const-string v9, "CLOSED"

    invoke-direct {v0, v9, v8}, Le/f/d/f0/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/d/f0/d;->i:Le/f/d/f0/d;

    const/16 v9, 0x8

    new-array v9, v9, [Le/f/d/f0/d;

    .line 9
    sget-object v10, Le/f/d/f0/d;->b:Le/f/d/f0/d;

    aput-object v10, v9, v1

    sget-object v1, Le/f/d/f0/d;->c:Le/f/d/f0/d;

    aput-object v1, v9, v2

    sget-object v1, Le/f/d/f0/d;->d:Le/f/d/f0/d;

    aput-object v1, v9, v3

    sget-object v1, Le/f/d/f0/d;->e:Le/f/d/f0/d;

    aput-object v1, v9, v4

    sget-object v1, Le/f/d/f0/d;->f:Le/f/d/f0/d;

    aput-object v1, v9, v5

    sget-object v1, Le/f/d/f0/d;->g:Le/f/d/f0/d;

    aput-object v1, v9, v6

    sget-object v1, Le/f/d/f0/d;->h:Le/f/d/f0/d;

    aput-object v1, v9, v7

    aput-object v0, v9, v8

    sput-object v9, Le/f/d/f0/d;->j:[Le/f/d/f0/d;

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

.method public static valueOf(Ljava/lang/String;)Le/f/d/f0/d;
    .locals 1

    .line 1
    const-class v0, Le/f/d/f0/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/d/f0/d;

    return-object p0
.end method

.method public static values()[Le/f/d/f0/d;
    .locals 1

    .line 1
    sget-object v0, Le/f/d/f0/d;->j:[Le/f/d/f0/d;

    invoke-virtual {v0}, [Le/f/d/f0/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/d/f0/d;

    return-object v0
.end method
