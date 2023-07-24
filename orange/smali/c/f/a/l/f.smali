.class public final enum Lc/f/a/l/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/f/a/l/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc/f/a/l/f;

.field public static final enum c:Lc/f/a/l/f;

.field public static final synthetic d:[Lc/f/a/l/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lc/f/a/l/f;

    const/4 v1, 0x0

    const-string v2, "RELAXED"

    invoke-direct {v0, v2, v1}, Lc/f/a/l/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/l/f;->b:Lc/f/a/l/f;

    new-instance v0, Lc/f/a/l/f;

    const/4 v2, 0x1

    const-string v3, "STRICT"

    invoke-direct {v0, v3, v2}, Lc/f/a/l/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/l/f;->c:Lc/f/a/l/f;

    const/4 v3, 0x2

    new-array v3, v3, [Lc/f/a/l/f;

    sget-object v4, Lc/f/a/l/f;->b:Lc/f/a/l/f;

    aput-object v4, v3, v1

    aput-object v0, v3, v2

    sput-object v3, Lc/f/a/l/f;->d:[Lc/f/a/l/f;

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

.method public static valueOf(Ljava/lang/String;)Lc/f/a/l/f;
    .locals 1

    .line 1
    const-class v0, Lc/f/a/l/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/f/a/l/f;

    return-object p0
.end method

.method public static values()[Lc/f/a/l/f;
    .locals 1

    .line 1
    sget-object v0, Lc/f/a/l/f;->d:[Lc/f/a/l/f;

    invoke-virtual {v0}, [Lc/f/a/l/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/f/a/l/f;

    return-object v0
.end method
