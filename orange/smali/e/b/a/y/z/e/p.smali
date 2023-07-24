.class public Le/b/a/y/z/e/p;
.super Le/b/a/y/z/e/u;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/b/a/y/z/e/u;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIII)Le/b/a/y/z/e/t;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/e/p;->b(IIII)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 2
    sget-object p1, Le/b/a/y/z/e/t;->c:Le/b/a/y/z/e/t;

    goto :goto_0

    .line 3
    :cond_0
    sget-object v0, Le/b/a/y/z/e/u;->a:Le/b/a/y/z/e/u;

    invoke-virtual {v0, p1, p2, p3, p4}, Le/b/a/y/z/e/u;->a(IIII)Le/b/a/y/z/e/t;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public b(IIII)F
    .locals 1

    .line 1
    sget-object v0, Le/b/a/y/z/e/u;->a:Le/b/a/y/z/e/u;

    .line 2
    invoke-virtual {v0, p1, p2, p3, p4}, Le/b/a/y/z/e/u;->b(IIII)F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    .line 3
    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1
.end method
