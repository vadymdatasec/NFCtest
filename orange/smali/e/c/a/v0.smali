.class public final enum Le/c/a/v0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/c/a/v0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/c/a/v0;

.field public static final enum c:Le/c/a/v0;

.field public static final enum d:Le/c/a/v0;

.field public static final enum e:Le/c/a/v0;

.field public static final enum f:Le/c/a/v0;

.field public static final synthetic g:[Le/c/a/v0;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Le/c/a/v0;

    const/4 v1, 0x0

    const-string v2, "None"

    invoke-direct {v0, v2, v1}, Le/c/a/v0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/v0;->b:Le/c/a/v0;

    .line 2
    new-instance v0, Le/c/a/v0;

    const/4 v2, 0x1

    const-string v3, "Underline"

    invoke-direct {v0, v3, v2}, Le/c/a/v0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/v0;->c:Le/c/a/v0;

    .line 3
    new-instance v0, Le/c/a/v0;

    const/4 v3, 0x2

    const-string v4, "Overline"

    invoke-direct {v0, v4, v3}, Le/c/a/v0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/v0;->d:Le/c/a/v0;

    .line 4
    new-instance v0, Le/c/a/v0;

    const/4 v4, 0x3

    const-string v5, "LineThrough"

    invoke-direct {v0, v5, v4}, Le/c/a/v0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/v0;->e:Le/c/a/v0;

    .line 5
    new-instance v0, Le/c/a/v0;

    const/4 v5, 0x4

    const-string v6, "Blink"

    invoke-direct {v0, v6, v5}, Le/c/a/v0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/v0;->f:Le/c/a/v0;

    const/4 v6, 0x5

    new-array v6, v6, [Le/c/a/v0;

    .line 6
    sget-object v7, Le/c/a/v0;->b:Le/c/a/v0;

    aput-object v7, v6, v1

    sget-object v1, Le/c/a/v0;->c:Le/c/a/v0;

    aput-object v1, v6, v2

    sget-object v1, Le/c/a/v0;->d:Le/c/a/v0;

    aput-object v1, v6, v3

    sget-object v1, Le/c/a/v0;->e:Le/c/a/v0;

    aput-object v1, v6, v4

    aput-object v0, v6, v5

    sput-object v6, Le/c/a/v0;->g:[Le/c/a/v0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/c/a/v0;
    .locals 1

    .line 1
    const-class v0, Le/c/a/v0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/c/a/v0;

    return-object p0
.end method

.method public static values()[Le/c/a/v0;
    .locals 4

    .line 1
    sget-object v0, Le/c/a/v0;->g:[Le/c/a/v0;

    array-length v1, v0

    new-array v2, v1, [Le/c/a/v0;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
