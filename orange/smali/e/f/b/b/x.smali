.class public abstract enum Le/f/b/b/x;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/f/b/b/x;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/f/b/b/x;

.field public static final enum c:Le/f/b/b/x;

.field public static final synthetic d:[Le/f/b/b/x;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Le/f/b/b/v;

    const-string v1, "STRONG"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le/f/b/b/v;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/b/b/x;->b:Le/f/b/b/x;

    .line 2
    new-instance v0, Le/f/b/b/w;

    const-string v1, "WEAK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Le/f/b/b/w;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/f/b/b/x;->c:Le/f/b/b/x;

    .line 3
    invoke-static {}, Le/f/b/b/x;->b()[Le/f/b/b/x;

    move-result-object v0

    sput-object v0, Le/f/b/b/x;->d:[Le/f/b/b/x;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILe/f/b/b/m;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Le/f/b/b/x;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic b()[Le/f/b/b/x;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Le/f/b/b/x;

    .line 1
    sget-object v1, Le/f/b/b/x;->b:Le/f/b/b/x;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Le/f/b/b/x;->c:Le/f/b/b/x;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Le/f/b/b/x;
    .locals 1

    .line 1
    const-class v0, Le/f/b/b/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/f/b/b/x;

    return-object p0
.end method

.method public static values()[Le/f/b/b/x;
    .locals 1

    .line 1
    sget-object v0, Le/f/b/b/x;->d:[Le/f/b/b/x;

    invoke-virtual {v0}, [Le/f/b/b/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/b/b/x;

    return-object v0
.end method


# virtual methods
.method public abstract a()Le/f/b/a/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/a/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method
