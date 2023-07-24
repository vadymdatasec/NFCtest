.class public final enum Le/h/d/a/a/w/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/h/d/a/a/w/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/h/d/a/a/w/f;

.field public static final enum c:Le/h/d/a/a/w/f;

.field public static final synthetic d:[Le/h/d/a/a/w/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le/h/d/a/a/w/f;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le/h/d/a/a/w/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/d/a/a/w/f;->b:Le/h/d/a/a/w/f;

    .line 2
    new-instance v0, Le/h/d/a/a/w/f;

    const-string v1, "KO"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Le/h/d/a/a/w/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/h/d/a/a/w/f;->c:Le/h/d/a/a/w/f;

    invoke-static {}, Le/h/d/a/a/w/f;->a()[Le/h/d/a/a/w/f;

    move-result-object v0

    sput-object v0, Le/h/d/a/a/w/f;->d:[Le/h/d/a/a/w/f;

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

.method public static final synthetic a()[Le/h/d/a/a/w/f;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Le/h/d/a/a/w/f;

    sget-object v1, Le/h/d/a/a/w/f;->b:Le/h/d/a/a/w/f;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Le/h/d/a/a/w/f;->c:Le/h/d/a/a/w/f;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Le/h/d/a/a/w/f;
    .locals 1

    const-class v0, Le/h/d/a/a/w/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/h/d/a/a/w/f;

    return-object p0
.end method

.method public static values()[Le/h/d/a/a/w/f;
    .locals 1

    sget-object v0, Le/h/d/a/a/w/f;->d:[Le/h/d/a/a/w/f;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/h/d/a/a/w/f;

    return-object v0
.end method
