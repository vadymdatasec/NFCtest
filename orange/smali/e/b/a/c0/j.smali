.class public Le/b/a/c0/j;
.super Le/b/a/c0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/b/a/c0/a<",
        "Le/b/a/c0/j;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/b/a/c0/a;-><init>()V

    return-void
.end method

.method public static b(Le/b/a/y/n;)Le/b/a/c0/j;
    .locals 1

    .line 2
    new-instance v0, Le/b/a/c0/j;

    invoke-direct {v0}, Le/b/a/c0/j;-><init>()V

    invoke-virtual {v0, p0}, Le/b/a/c0/a;->a(Le/b/a/y/n;)Le/b/a/c0/a;

    move-result-object p0

    check-cast p0, Le/b/a/c0/j;

    return-object p0
.end method

.method public static b(Le/b/a/y/x/c0;)Le/b/a/c0/j;
    .locals 1

    .line 1
    new-instance v0, Le/b/a/c0/j;

    invoke-direct {v0}, Le/b/a/c0/j;-><init>()V

    invoke-virtual {v0, p0}, Le/b/a/c0/a;->a(Le/b/a/y/x/c0;)Le/b/a/c0/a;

    move-result-object p0

    check-cast p0, Le/b/a/c0/j;

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Le/b/a/c0/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Le/b/a/c0/j;"
        }
    .end annotation

    .line 3
    new-instance v0, Le/b/a/c0/j;

    invoke-direct {v0}, Le/b/a/c0/j;-><init>()V

    invoke-virtual {v0, p0}, Le/b/a/c0/a;->a(Ljava/lang/Class;)Le/b/a/c0/a;

    move-result-object p0

    check-cast p0, Le/b/a/c0/j;

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le/b/a/c0/j;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Le/b/a/c0/a;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Le/b/a/c0/a;->hashCode()I

    move-result v0

    return v0
.end method
