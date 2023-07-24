.class public final enum Le/c/a/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/c/a/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/c/a/b;

.field public static final enum c:Le/c/a/b;

.field public static final enum d:Le/c/a/b;

.field public static final enum e:Le/c/a/b;

.field public static final synthetic f:[Le/c/a/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Le/c/a/b;

    const/4 v1, 0x0

    const-string v2, "EXISTS"

    invoke-direct {v0, v2, v1}, Le/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/b;->b:Le/c/a/b;

    .line 2
    new-instance v0, Le/c/a/b;

    const/4 v2, 0x1

    const-string v3, "EQUALS"

    invoke-direct {v0, v3, v2}, Le/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/b;->c:Le/c/a/b;

    .line 3
    new-instance v0, Le/c/a/b;

    const/4 v3, 0x2

    const-string v4, "INCLUDES"

    invoke-direct {v0, v4, v3}, Le/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/b;->d:Le/c/a/b;

    .line 4
    new-instance v0, Le/c/a/b;

    const/4 v4, 0x3

    const-string v5, "DASHMATCH"

    invoke-direct {v0, v5, v4}, Le/c/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/b;->e:Le/c/a/b;

    const/4 v5, 0x4

    new-array v5, v5, [Le/c/a/b;

    .line 5
    sget-object v6, Le/c/a/b;->b:Le/c/a/b;

    aput-object v6, v5, v1

    sget-object v1, Le/c/a/b;->c:Le/c/a/b;

    aput-object v1, v5, v2

    sget-object v1, Le/c/a/b;->d:Le/c/a/b;

    aput-object v1, v5, v3

    aput-object v0, v5, v4

    sput-object v5, Le/c/a/b;->f:[Le/c/a/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/c/a/b;
    .locals 1

    .line 1
    const-class v0, Le/c/a/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/c/a/b;

    return-object p0
.end method

.method public static values()[Le/c/a/b;
    .locals 4

    .line 1
    sget-object v0, Le/c/a/b;->f:[Le/c/a/b;

    array-length v1, v0

    new-array v2, v1, [Le/c/a/b;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
