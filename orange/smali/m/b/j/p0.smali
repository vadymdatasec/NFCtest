.class public final enum Lm/b/j/p0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm/b/j/p0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lm/b/j/p0;

.field public static final enum c:Lm/b/j/p0;

.field public static final enum d:Lm/b/j/p0;

.field public static final enum e:Lm/b/j/p0;

.field public static final enum f:Lm/b/j/p0;

.field public static final enum g:Lm/b/j/p0;

.field public static final synthetic h:[Lm/b/j/p0;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lm/b/j/p0;

    const/4 v1, 0x0

    const-string v2, "Doctype"

    invoke-direct {v0, v2, v1}, Lm/b/j/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/j/p0;->b:Lm/b/j/p0;

    .line 2
    new-instance v0, Lm/b/j/p0;

    const/4 v2, 0x1

    const-string v3, "StartTag"

    invoke-direct {v0, v3, v2}, Lm/b/j/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/j/p0;->c:Lm/b/j/p0;

    .line 3
    new-instance v0, Lm/b/j/p0;

    const/4 v3, 0x2

    const-string v4, "EndTag"

    invoke-direct {v0, v4, v3}, Lm/b/j/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/j/p0;->d:Lm/b/j/p0;

    .line 4
    new-instance v0, Lm/b/j/p0;

    const/4 v4, 0x3

    const-string v5, "Comment"

    invoke-direct {v0, v5, v4}, Lm/b/j/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/j/p0;->e:Lm/b/j/p0;

    .line 5
    new-instance v0, Lm/b/j/p0;

    const/4 v5, 0x4

    const-string v6, "Character"

    invoke-direct {v0, v6, v5}, Lm/b/j/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/j/p0;->f:Lm/b/j/p0;

    .line 6
    new-instance v0, Lm/b/j/p0;

    const/4 v6, 0x5

    const-string v7, "EOF"

    invoke-direct {v0, v7, v6}, Lm/b/j/p0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm/b/j/p0;->g:Lm/b/j/p0;

    const/4 v7, 0x6

    new-array v7, v7, [Lm/b/j/p0;

    .line 7
    sget-object v8, Lm/b/j/p0;->b:Lm/b/j/p0;

    aput-object v8, v7, v1

    sget-object v1, Lm/b/j/p0;->c:Lm/b/j/p0;

    aput-object v1, v7, v2

    sget-object v1, Lm/b/j/p0;->d:Lm/b/j/p0;

    aput-object v1, v7, v3

    sget-object v1, Lm/b/j/p0;->e:Lm/b/j/p0;

    aput-object v1, v7, v4

    sget-object v1, Lm/b/j/p0;->f:Lm/b/j/p0;

    aput-object v1, v7, v5

    aput-object v0, v7, v6

    sput-object v7, Lm/b/j/p0;->h:[Lm/b/j/p0;

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

.method public static valueOf(Ljava/lang/String;)Lm/b/j/p0;
    .locals 1

    .line 1
    const-class v0, Lm/b/j/p0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm/b/j/p0;

    return-object p0
.end method

.method public static values()[Lm/b/j/p0;
    .locals 1

    .line 1
    sget-object v0, Lm/b/j/p0;->h:[Lm/b/j/p0;

    invoke-virtual {v0}, [Lm/b/j/p0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm/b/j/p0;

    return-object v0
.end method
