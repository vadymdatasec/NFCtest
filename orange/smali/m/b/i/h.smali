.class public final enum Lm/b/i/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm/b/i/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lm/b/i/h;

.field public static final enum c:Lm/b/i/h;

.field public static final enum d:Lm/b/i/h;

.field public static final synthetic e:[Lm/b/i/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lm/b/i/h;

    const/4 v1, 0x0

    const-string v2, "noQuirks"

    invoke-direct {v0, v2, v1}, Lm/b/i/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/i/h;->b:Lm/b/i/h;

    new-instance v0, Lm/b/i/h;

    const/4 v2, 0x1

    const-string v3, "quirks"

    invoke-direct {v0, v3, v2}, Lm/b/i/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/i/h;->c:Lm/b/i/h;

    new-instance v0, Lm/b/i/h;

    const/4 v3, 0x2

    const-string v4, "limitedQuirks"

    invoke-direct {v0, v4, v3}, Lm/b/i/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/i/h;->d:Lm/b/i/h;

    const/4 v4, 0x3

    new-array v4, v4, [Lm/b/i/h;

    .line 2
    sget-object v5, Lm/b/i/h;->b:Lm/b/i/h;

    aput-object v5, v4, v1

    sget-object v1, Lm/b/i/h;->c:Lm/b/i/h;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lm/b/i/h;->e:[Lm/b/i/h;

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

.method public static valueOf(Ljava/lang/String;)Lm/b/i/h;
    .locals 1

    .line 1
    const-class v0, Lm/b/i/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm/b/i/h;

    return-object p0
.end method

.method public static values()[Lm/b/i/h;
    .locals 1

    .line 1
    sget-object v0, Lm/b/i/h;->e:[Lm/b/i/h;

    invoke-virtual {v0}, [Lm/b/i/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm/b/i/h;

    return-object v0
.end method
