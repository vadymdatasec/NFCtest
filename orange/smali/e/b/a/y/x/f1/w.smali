.class public Le/b/a/y/x/f1/w;
.super Le/b/a/y/x/f1/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/b/a/y/x/f1/f<",
        "Le/b/a/y/x/f1/v;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/b/a/y/x/f1/f;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Le/b/a/y/x/f1/t;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/b/a/y/x/f1/w;->a()Le/b/a/y/x/f1/v;

    move-result-object v0

    return-object v0
.end method

.method public a()Le/b/a/y/x/f1/v;
    .locals 1

    .line 4
    new-instance v0, Le/b/a/y/x/f1/v;

    invoke-direct {v0, p0}, Le/b/a/y/x/f1/v;-><init>(Le/b/a/y/x/f1/w;)V

    return-object v0
.end method

.method public a(ILandroid/graphics/Bitmap$Config;)Le/b/a/y/x/f1/v;
    .locals 1

    .line 2
    invoke-virtual {p0}, Le/b/a/y/x/f1/f;->b()Le/b/a/y/x/f1/t;

    move-result-object v0

    check-cast v0, Le/b/a/y/x/f1/v;

    .line 3
    invoke-virtual {v0, p1, p2}, Le/b/a/y/x/f1/v;->a(ILandroid/graphics/Bitmap$Config;)V

    return-object v0
.end method
