.class public final enum Lm/b/i/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm/b/i/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lm/b/i/n;

.field public static final enum c:Lm/b/i/n;

.field public static final enum d:Lm/b/i/n;

.field public static final synthetic e:[Lm/b/i/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lm/b/i/n;

    const/4 v1, 0x0

    const-string v2, "ascii"

    invoke-direct {v0, v2, v1}, Lm/b/i/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/i/n;->b:Lm/b/i/n;

    new-instance v0, Lm/b/i/n;

    const/4 v2, 0x1

    const-string v3, "utf"

    invoke-direct {v0, v3, v2}, Lm/b/i/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/i/n;->c:Lm/b/i/n;

    new-instance v0, Lm/b/i/n;

    const/4 v3, 0x2

    const-string v4, "fallback"

    invoke-direct {v0, v4, v3}, Lm/b/i/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/i/n;->d:Lm/b/i/n;

    const/4 v4, 0x3

    new-array v4, v4, [Lm/b/i/n;

    .line 2
    sget-object v5, Lm/b/i/n;->b:Lm/b/i/n;

    aput-object v5, v4, v1

    sget-object v1, Lm/b/i/n;->c:Lm/b/i/n;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lm/b/i/n;->e:[Lm/b/i/n;

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

.method public static synthetic a(Ljava/lang/String;)Lm/b/i/n;
    .locals 0

    .line 1
    invoke-static {p0}, Lm/b/i/n;->b(Ljava/lang/String;)Lm/b/i/n;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Lm/b/i/n;
    .locals 1

    const-string v0, "US-ASCII"

    .line 1
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object p0, Lm/b/i/n;->b:Lm/b/i/n;

    return-object p0

    :cond_0
    const-string v0, "UTF-"

    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 4
    sget-object p0, Lm/b/i/n;->c:Lm/b/i/n;

    return-object p0

    .line 5
    :cond_1
    sget-object p0, Lm/b/i/n;->d:Lm/b/i/n;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lm/b/i/n;
    .locals 1

    .line 1
    const-class v0, Lm/b/i/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm/b/i/n;

    return-object p0
.end method

.method public static values()[Lm/b/i/n;
    .locals 1

    .line 1
    sget-object v0, Lm/b/i/n;->e:[Lm/b/i/n;

    invoke-virtual {v0}, [Lm/b/i/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm/b/i/n;

    return-object v0
.end method
