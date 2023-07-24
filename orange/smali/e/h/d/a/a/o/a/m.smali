.class public final enum Le/h/d/a/a/o/a/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/d/a/a/o/a/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/h/d/a/a/o/a/m;

.field public static final enum c:Le/h/d/a/a/o/a/m;

.field public static final enum d:Le/h/d/a/a/o/a/m;

.field public static final enum e:Le/h/d/a/a/o/a/m;

.field public static final enum f:Le/h/d/a/a/o/a/m;

.field public static final enum g:Le/h/d/a/a/o/a/m;

.field public static final synthetic h:[Le/h/d/a/a/o/a/m;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Le/h/d/a/a/o/a/m;

    const/4 v1, 0x0

    const-string v2, "READ_TOKEN"

    invoke-direct {v0, v2, v1}, Le/h/d/a/a/o/a/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/d/a/a/o/a/m;->b:Le/h/d/a/a/o/a/m;

    new-instance v0, Le/h/d/a/a/o/a/m;

    const/4 v2, 0x1

    const-string v3, "SELECT"

    invoke-direct {v0, v3, v2}, Le/h/d/a/a/o/a/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/d/a/a/o/a/m;->c:Le/h/d/a/a/o/a/m;

    new-instance v0, Le/h/d/a/a/o/a/m;

    const/4 v3, 0x2

    const-string v4, "WRITE_TOKEN"

    invoke-direct {v0, v4, v3}, Le/h/d/a/a/o/a/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/d/a/a/o/a/m;->d:Le/h/d/a/a/o/a/m;

    new-instance v0, Le/h/d/a/a/o/a/m;

    const/4 v4, 0x3

    const-string v5, "TRANSACTION_DONE"

    invoke-direct {v0, v5, v4}, Le/h/d/a/a/o/a/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/d/a/a/o/a/m;->e:Le/h/d/a/a/o/a/m;

    new-instance v0, Le/h/d/a/a/o/a/m;

    const/4 v5, 0x4

    const-string v6, "DELAYED_WRITE_TOKEN"

    invoke-direct {v0, v6, v5}, Le/h/d/a/a/o/a/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/d/a/a/o/a/m;->f:Le/h/d/a/a/o/a/m;

    new-instance v0, Le/h/d/a/a/o/a/m;

    const/4 v6, 0x5

    const-string v7, "READ_BADGE"

    invoke-direct {v0, v7, v6}, Le/h/d/a/a/o/a/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/d/a/a/o/a/m;->g:Le/h/d/a/a/o/a/m;

    const/4 v7, 0x6

    new-array v7, v7, [Le/h/d/a/a/o/a/m;

    .line 2
    sget-object v8, Le/h/d/a/a/o/a/m;->b:Le/h/d/a/a/o/a/m;

    aput-object v8, v7, v1

    sget-object v1, Le/h/d/a/a/o/a/m;->c:Le/h/d/a/a/o/a/m;

    aput-object v1, v7, v2

    sget-object v1, Le/h/d/a/a/o/a/m;->d:Le/h/d/a/a/o/a/m;

    aput-object v1, v7, v3

    sget-object v1, Le/h/d/a/a/o/a/m;->e:Le/h/d/a/a/o/a/m;

    aput-object v1, v7, v4

    sget-object v1, Le/h/d/a/a/o/a/m;->f:Le/h/d/a/a/o/a/m;

    aput-object v1, v7, v5

    aput-object v0, v7, v6

    sput-object v7, Le/h/d/a/a/o/a/m;->h:[Le/h/d/a/a/o/a/m;

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

.method public static valueOf(Ljava/lang/String;)Le/h/d/a/a/o/a/m;
    .locals 1

    .line 1
    const-class v0, Le/h/d/a/a/o/a/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/d/a/a/o/a/m;

    return-object p0
.end method

.method public static values()[Le/h/d/a/a/o/a/m;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/o/a/m;->h:[Le/h/d/a/a/o/a/m;

    invoke-virtual {v0}, [Le/h/d/a/a/o/a/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/d/a/a/o/a/m;

    return-object v0
.end method
