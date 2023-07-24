.class public final enum Lm/b/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm/b/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lm/b/c;

.field public static final enum d:Lm/b/c;

.field public static final enum e:Lm/b/c;

.field public static final enum f:Lm/b/c;

.field public static final enum g:Lm/b/c;

.field public static final enum h:Lm/b/c;

.field public static final enum i:Lm/b/c;

.field public static final enum j:Lm/b/c;

.field public static final synthetic k:[Lm/b/c;


# instance fields
.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lm/b/c;

    const/4 v1, 0x0

    const-string v2, "GET"

    invoke-direct {v0, v2, v1, v1}, Lm/b/c;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lm/b/c;->c:Lm/b/c;

    new-instance v0, Lm/b/c;

    const/4 v2, 0x1

    const-string v3, "POST"

    invoke-direct {v0, v3, v2, v2}, Lm/b/c;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lm/b/c;->d:Lm/b/c;

    new-instance v0, Lm/b/c;

    const/4 v3, 0x2

    const-string v4, "PUT"

    invoke-direct {v0, v4, v3, v2}, Lm/b/c;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lm/b/c;->e:Lm/b/c;

    new-instance v0, Lm/b/c;

    const/4 v4, 0x3

    const-string v5, "DELETE"

    invoke-direct {v0, v5, v4, v1}, Lm/b/c;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lm/b/c;->f:Lm/b/c;

    new-instance v0, Lm/b/c;

    const/4 v5, 0x4

    const-string v6, "PATCH"

    invoke-direct {v0, v6, v5, v2}, Lm/b/c;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lm/b/c;->g:Lm/b/c;

    new-instance v0, Lm/b/c;

    const/4 v6, 0x5

    const-string v7, "HEAD"

    invoke-direct {v0, v7, v6, v1}, Lm/b/c;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lm/b/c;->h:Lm/b/c;

    new-instance v0, Lm/b/c;

    const/4 v7, 0x6

    const-string v8, "OPTIONS"

    invoke-direct {v0, v8, v7, v1}, Lm/b/c;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lm/b/c;->i:Lm/b/c;

    new-instance v0, Lm/b/c;

    const/4 v8, 0x7

    const-string v9, "TRACE"

    invoke-direct {v0, v9, v8, v1}, Lm/b/c;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lm/b/c;->j:Lm/b/c;

    const/16 v9, 0x8

    new-array v9, v9, [Lm/b/c;

    .line 2
    sget-object v10, Lm/b/c;->c:Lm/b/c;

    aput-object v10, v9, v1

    sget-object v1, Lm/b/c;->d:Lm/b/c;

    aput-object v1, v9, v2

    sget-object v1, Lm/b/c;->e:Lm/b/c;

    aput-object v1, v9, v3

    sget-object v1, Lm/b/c;->f:Lm/b/c;

    aput-object v1, v9, v4

    sget-object v1, Lm/b/c;->g:Lm/b/c;

    aput-object v1, v9, v5

    sget-object v1, Lm/b/c;->h:Lm/b/c;

    aput-object v1, v9, v6

    sget-object v1, Lm/b/c;->i:Lm/b/c;

    aput-object v1, v9, v7

    aput-object v0, v9, v8

    sput-object v9, Lm/b/c;->k:[Lm/b/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-boolean p3, p0, Lm/b/c;->b:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm/b/c;
    .locals 1

    .line 1
    const-class v0, Lm/b/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm/b/c;

    return-object p0
.end method

.method public static values()[Lm/b/c;
    .locals 1

    .line 1
    sget-object v0, Lm/b/c;->k:[Lm/b/c;

    invoke-virtual {v0}, [Lm/b/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm/b/c;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/c;->b:Z

    return v0
.end method
