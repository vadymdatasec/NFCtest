.class public final enum Lc/f/a/l/g$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/f/a/l/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/f/a/l/g$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc/f/a/l/g$a;

.field public static final enum c:Lc/f/a/l/g$a;

.field public static final enum d:Lc/f/a/l/g$a;

.field public static final synthetic e:[Lc/f/a/l/g$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lc/f/a/l/g$a;

    const/4 v1, 0x0

    const-string v2, "NONE"

    invoke-direct {v0, v2, v1}, Lc/f/a/l/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/l/g$a;->b:Lc/f/a/l/g$a;

    new-instance v0, Lc/f/a/l/g$a;

    const/4 v2, 0x1

    const-string v3, "STRONG"

    invoke-direct {v0, v3, v2}, Lc/f/a/l/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/l/g$a;->c:Lc/f/a/l/g$a;

    new-instance v0, Lc/f/a/l/g$a;

    const/4 v3, 0x2

    const-string v4, "WEAK"

    invoke-direct {v0, v4, v3}, Lc/f/a/l/g$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/f/a/l/g$a;->d:Lc/f/a/l/g$a;

    const/4 v4, 0x3

    new-array v4, v4, [Lc/f/a/l/g$a;

    sget-object v5, Lc/f/a/l/g$a;->b:Lc/f/a/l/g$a;

    aput-object v5, v4, v1

    sget-object v1, Lc/f/a/l/g$a;->c:Lc/f/a/l/g$a;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lc/f/a/l/g$a;->e:[Lc/f/a/l/g$a;

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

.method public static valueOf(Ljava/lang/String;)Lc/f/a/l/g$a;
    .locals 1

    .line 1
    const-class v0, Lc/f/a/l/g$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/f/a/l/g$a;

    return-object p0
.end method

.method public static values()[Lc/f/a/l/g$a;
    .locals 1

    .line 1
    sget-object v0, Lc/f/a/l/g$a;->e:[Lc/f/a/l/g$a;

    invoke-virtual {v0}, [Lc/f/a/l/g$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/f/a/l/g$a;

    return-object v0
.end method
