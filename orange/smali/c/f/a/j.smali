.class public final enum Lc/f/a/j;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/f/a/j;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc/f/a/j;

.field public static final enum c:Lc/f/a/j;

.field public static final enum d:Lc/f/a/j;

.field public static final enum e:Lc/f/a/j;

.field public static final enum f:Lc/f/a/j;

.field public static final synthetic g:[Lc/f/a/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lc/f/a/j;

    const/4 v1, 0x0

    const-string v2, "UNRESTRICTED"

    invoke-direct {v0, v2, v1}, Lc/f/a/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/j;->b:Lc/f/a/j;

    .line 2
    new-instance v0, Lc/f/a/j;

    const/4 v2, 0x1

    const-string v3, "CONSTANT"

    invoke-direct {v0, v3, v2}, Lc/f/a/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/j;->c:Lc/f/a/j;

    .line 3
    new-instance v0, Lc/f/a/j;

    const/4 v3, 0x2

    const-string v4, "SLACK"

    invoke-direct {v0, v4, v3}, Lc/f/a/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/j;->d:Lc/f/a/j;

    .line 4
    new-instance v0, Lc/f/a/j;

    const/4 v4, 0x3

    const-string v5, "ERROR"

    invoke-direct {v0, v5, v4}, Lc/f/a/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/j;->e:Lc/f/a/j;

    .line 5
    new-instance v0, Lc/f/a/j;

    const/4 v5, 0x4

    const-string v6, "UNKNOWN"

    invoke-direct {v0, v6, v5}, Lc/f/a/j;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/j;->f:Lc/f/a/j;

    const/4 v6, 0x5

    new-array v6, v6, [Lc/f/a/j;

    .line 6
    sget-object v7, Lc/f/a/j;->b:Lc/f/a/j;

    aput-object v7, v6, v1

    sget-object v1, Lc/f/a/j;->c:Lc/f/a/j;

    aput-object v1, v6, v2

    sget-object v1, Lc/f/a/j;->d:Lc/f/a/j;

    aput-object v1, v6, v3

    sget-object v1, Lc/f/a/j;->e:Lc/f/a/j;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Lc/f/a/j;->g:[Lc/f/a/j;

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

.method public static valueOf(Ljava/lang/String;)Lc/f/a/j;
    .locals 1

    .line 1
    const-class v0, Lc/f/a/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/f/a/j;

    return-object p0
.end method

.method public static values()[Lc/f/a/j;
    .locals 1

    .line 1
    sget-object v0, Lc/f/a/j;->g:[Lc/f/a/j;

    invoke-virtual {v0}, [Lc/f/a/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/f/a/j;

    return-object v0
.end method