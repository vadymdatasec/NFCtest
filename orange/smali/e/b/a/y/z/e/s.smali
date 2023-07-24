.class public Le/b/a/y/z/e/s;
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

    const/high16 p1, 0x3f800000    # 1.0f

    return p1
.end method
