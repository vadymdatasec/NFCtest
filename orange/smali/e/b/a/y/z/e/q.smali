.class public Le/b/a/y/z/e/q;
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
    .locals 0

    .line 1
    sget-object p1, Le/b/a/y/z/e/t;->c:Le/b/a/y/z/e/t;

    return-object p1
.end method

.method public b(IIII)F
    .locals 0

    int-to-float p3, p3

    int-to-float p1, p1

    div-float/2addr p3, p1

    int-to-float p1, p4

    int-to-float p2, p2

    div-float/2addr p1, p2

    .line 1
    invoke-static {p3, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    return p1
.end method
