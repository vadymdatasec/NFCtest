.class public abstract Le/f/b/a/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Le/f/b/a/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 2
    invoke-static {}, Le/f/b/a/o;->a()Le/f/b/a/l;

    return-void
.end method

.method public static a()Le/f/b/a/l;
    .locals 2

    .line 2
    new-instance v0, Le/f/b/a/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/f/b/a/n;-><init>(Le/f/b/a/m;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
