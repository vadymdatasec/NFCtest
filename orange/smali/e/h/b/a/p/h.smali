.class public abstract Le/h/b/a/p/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Ljava/util/Comparator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "Le/h/b/a/m/d;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/h/b/a/p/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/b/a/p/g;-><init>(Le/h/b/a/p/e;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Comparator<",
            "Le/h/b/a/m/d;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/h/b/a/p/f;

    invoke-direct {v0, p0}, Le/h/b/a/p/f;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
