.class public final enum Le/e/a/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/e/a/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/e/a/h;

.field public static final synthetic c:[Le/e/a/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Le/e/a/h;

    new-instance v1, Le/e/a/h;

    const/4 v2, 0x0

    const-string v3, "VIEW_LAYOUT"

    invoke-direct {v1, v3, v2}, Le/e/a/h;-><init>(Ljava/lang/String;I)V

    sput-object v1, Le/e/a/h;->b:Le/e/a/h;

    aput-object v1, v0, v2

    new-instance v1, Le/e/a/h;

    const/4 v2, 0x1

    const-string v3, "VIEW_SURFACE"

    invoke-direct {v1, v3, v2}, Le/e/a/h;-><init>(Ljava/lang/String;I)V

    aput-object v1, v0, v2

    sput-object v0, Le/e/a/h;->c:[Le/e/a/h;

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

.method public static valueOf(Ljava/lang/String;)Le/e/a/h;
    .locals 1

    const-class v0, Le/e/a/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/e/a/h;

    return-object p0
.end method

.method public static values()[Le/e/a/h;
    .locals 1

    sget-object v0, Le/e/a/h;->c:[Le/e/a/h;

    invoke-virtual {v0}, [Le/e/a/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/e/a/h;

    return-object v0
.end method
