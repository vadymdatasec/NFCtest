.class public abstract Le/f/a/a/j/j0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/j0/j/m;Le/f/a/a/j/l0/a;)Le/f/a/a/j/j0/j/y;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 2
    new-instance p3, Le/f/a/a/j/j0/j/g;

    invoke-direct {p3, p0, p1, p2}, Le/f/a/a/j/j0/j/g;-><init>(Landroid/content/Context;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/j0/j/m;)V

    return-object p3

    .line 3
    :cond_0
    new-instance v0, Le/f/a/a/j/j0/j/a;

    invoke-direct {v0, p0, p1, p3, p2}, Le/f/a/a/j/j0/j/a;-><init>(Landroid/content/Context;Le/f/a/a/j/j0/k/e;Le/f/a/a/j/l0/a;Le/f/a/a/j/j0/j/m;)V

    return-object v0
.end method
