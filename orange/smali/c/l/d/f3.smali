.class public final enum Lc/l/d/f3;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/l/d/f3;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc/l/d/f3;

.field public static final enum c:Lc/l/d/f3;

.field public static final enum d:Lc/l/d/f3;

.field public static final synthetic e:[Lc/l/d/f3;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lc/l/d/f3;

    const/4 v1, 0x0

    const-string v2, "NONE"

    invoke-direct {v0, v2, v1}, Lc/l/d/f3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/l/d/f3;->b:Lc/l/d/f3;

    .line 2
    new-instance v0, Lc/l/d/f3;

    const/4 v2, 0x1

    const-string v3, "ADDING"

    invoke-direct {v0, v3, v2}, Lc/l/d/f3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/l/d/f3;->c:Lc/l/d/f3;

    .line 3
    new-instance v0, Lc/l/d/f3;

    const/4 v3, 0x2

    const-string v4, "REMOVING"

    invoke-direct {v0, v4, v3}, Lc/l/d/f3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/l/d/f3;->d:Lc/l/d/f3;

    const/4 v4, 0x3

    new-array v4, v4, [Lc/l/d/f3;

    .line 4
    sget-object v5, Lc/l/d/f3;->b:Lc/l/d/f3;

    aput-object v5, v4, v1

    sget-object v1, Lc/l/d/f3;->c:Lc/l/d/f3;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lc/l/d/f3;->e:[Lc/l/d/f3;

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

.method public static valueOf(Ljava/lang/String;)Lc/l/d/f3;
    .locals 1

    .line 1
    const-class v0, Lc/l/d/f3;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/l/d/f3;

    return-object p0
.end method

.method public static values()[Lc/l/d/f3;
    .locals 1

    .line 1
    sget-object v0, Lc/l/d/f3;->e:[Lc/l/d/f3;

    invoke-virtual {v0}, [Lc/l/d/f3;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/l/d/f3;

    return-object v0
.end method
