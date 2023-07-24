.class public final enum Le/f/b/c/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/b/c/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/b/c/n;

.field public static final synthetic c:[Le/f/b/c/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le/f/b/c/n;

    const-string v1, "APPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le/f/b/c/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/b/c/n;->b:Le/f/b/c/n;

    .line 2
    invoke-static {}, Le/f/b/c/n;->a()[Le/f/b/c/n;

    move-result-object v0

    sput-object v0, Le/f/b/c/n;->c:[Le/f/b/c/n;

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

.method public static synthetic a()[Le/f/b/c/n;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Le/f/b/c/n;

    .line 1
    sget-object v1, Le/f/b/c/n;->b:Le/f/b/c/n;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Le/f/b/c/n;
    .locals 1

    .line 1
    const-class v0, Le/f/b/c/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/b/c/n;

    return-object p0
.end method

.method public static values()[Le/f/b/c/n;
    .locals 1

    .line 1
    sget-object v0, Le/f/b/c/n;->c:[Le/f/b/c/n;

    invoke-virtual {v0}, [Le/f/b/c/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/b/c/n;

    return-object v0
.end method
