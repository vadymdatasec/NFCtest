.class public final enum Le/c/a/x0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le/c/a/x0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le/c/a/x0;

.field public static final enum c:Le/c/a/x0;

.field public static final synthetic d:[Le/c/a/x0;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Le/c/a/x0;

    const/4 v1, 0x0

    const-string v2, "None"

    invoke-direct {v0, v2, v1}, Le/c/a/x0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/x0;->b:Le/c/a/x0;

    .line 2
    new-instance v0, Le/c/a/x0;

    const/4 v2, 0x1

    const-string v3, "NonScalingStroke"

    invoke-direct {v0, v3, v2}, Le/c/a/x0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le/c/a/x0;->c:Le/c/a/x0;

    const/4 v3, 0x2

    new-array v3, v3, [Le/c/a/x0;

    .line 3
    sget-object v4, Le/c/a/x0;->b:Le/c/a/x0;

    aput-object v4, v3, v1

    aput-object v0, v3, v2

    sput-object v3, Le/c/a/x0;->d:[Le/c/a/x0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le/c/a/x0;
    .locals 1

    .line 1
    const-class v0, Le/c/a/x0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le/c/a/x0;

    return-object p0
.end method

.method public static values()[Le/c/a/x0;
    .locals 4

    .line 1
    sget-object v0, Le/c/a/x0;->d:[Le/c/a/x0;

    array-length v1, v0

    new-array v2, v1, [Le/c/a/x0;

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
