.class public Le/b/a/y/x/a0;
.super Le/b/a/y/x/c0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/b/a/y/x/c0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(Le/b/a/y/a;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public a(ZLe/b/a/y/a;Le/b/a/y/c;)Z
    .locals 0

    .line 1
    sget-object p1, Le/b/a/y/a;->e:Le/b/a/y/a;

    if-eq p2, p1, :cond_0

    sget-object p1, Le/b/a/y/a;->f:Le/b/a/y/a;

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method