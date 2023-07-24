.class public abstract Le/f/b/d/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(DD)D
    .locals 1

    .line 1
    invoke-static {p0, p1}, Le/f/b/e/a;->a(D)Z

    move-result v0

    if-eqz v0, :cond_0

    return-wide p2

    .line 2
    :cond_0
    invoke-static {p2, p3}, Le/f/b/e/a;->a(D)Z

    move-result v0

    if-nez v0, :cond_2

    cmpl-double v0, p0, p2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/high16 p0, 0x7ff8000000000000L    # Double.NaN

    :cond_2
    :goto_0
    return-wide p0
.end method
