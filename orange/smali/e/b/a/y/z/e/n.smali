.class public Le/b/a/y/z/e/n;
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

    .line 1
    div-int/2addr p2, p4

    div-int/2addr p1, p3

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p2, p1

    :goto_0
    return p2
.end method
