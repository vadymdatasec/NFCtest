.class public abstract Le/d/a/a/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Le/d/a/a/c/c;->b()Z

    move-result v0

    sput-boolean v0, Le/d/a/a/c/c;->a:Z

    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    .line 1
    sget-boolean v0, Le/d/a/a/c/c;->a:Z

    return v0
.end method

.method public static b()Z
    .locals 2

    const-string v0, "a."

    .line 1
    invoke-static {v0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
