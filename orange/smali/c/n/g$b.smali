.class public final enum Lc/n/g$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/n/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/n/g$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc/n/g$b;

.field public static final enum c:Lc/n/g$b;

.field public static final enum d:Lc/n/g$b;

.field public static final enum e:Lc/n/g$b;

.field public static final enum f:Lc/n/g$b;

.field public static final synthetic g:[Lc/n/g$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lc/n/g$b;

    const/4 v1, 0x0

    const-string v2, "DESTROYED"

    invoke-direct {v0, v2, v1}, Lc/n/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$b;->b:Lc/n/g$b;

    .line 2
    new-instance v0, Lc/n/g$b;

    const/4 v2, 0x1

    const-string v3, "INITIALIZED"

    invoke-direct {v0, v3, v2}, Lc/n/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$b;->c:Lc/n/g$b;

    .line 3
    new-instance v0, Lc/n/g$b;

    const/4 v3, 0x2

    const-string v4, "CREATED"

    invoke-direct {v0, v4, v3}, Lc/n/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$b;->d:Lc/n/g$b;

    .line 4
    new-instance v0, Lc/n/g$b;

    const/4 v4, 0x3

    const-string v5, "STARTED"

    invoke-direct {v0, v5, v4}, Lc/n/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$b;->e:Lc/n/g$b;

    .line 5
    new-instance v0, Lc/n/g$b;

    const/4 v5, 0x4

    const-string v6, "RESUMED"

    invoke-direct {v0, v6, v5}, Lc/n/g$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/n/g$b;->f:Lc/n/g$b;

    const/4 v6, 0x5

    new-array v6, v6, [Lc/n/g$b;

    .line 6
    sget-object v7, Lc/n/g$b;->b:Lc/n/g$b;

    aput-object v7, v6, v1

    sget-object v1, Lc/n/g$b;->c:Lc/n/g$b;

    aput-object v1, v6, v2

    sget-object v1, Lc/n/g$b;->d:Lc/n/g$b;

    aput-object v1, v6, v3

    sget-object v1, Lc/n/g$b;->e:Lc/n/g$b;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Lc/n/g$b;->g:[Lc/n/g$b;

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

.method public static valueOf(Ljava/lang/String;)Lc/n/g$b;
    .locals 1

    .line 1
    const-class v0, Lc/n/g$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/n/g$b;

    return-object p0
.end method

.method public static values()[Lc/n/g$b;
    .locals 1

    .line 1
    sget-object v0, Lc/n/g$b;->g:[Lc/n/g$b;

    invoke-virtual {v0}, [Lc/n/g$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/n/g$b;

    return-object v0
.end method


# virtual methods
.method public a(Lc/n/g$b;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
