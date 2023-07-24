.class public abstract Lc/h/k/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lc/h/k/g;IZILandroid/os/Handler;Lc/h/k/p;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    new-instance v0, Lc/h/k/c;

    invoke-direct {v0, p6, p5}, Lc/h/k/c;-><init>(Lc/h/k/p;Landroid/os/Handler;)V

    if-eqz p3, :cond_0

    .line 2
    invoke-static {p0, p1, v0, p2, p4}, Lc/h/k/m;->a(Landroid/content/Context;Lc/h/k/g;Lc/h/k/c;II)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p3, 0x0

    .line 3
    invoke-static {p0, p1, p2, p3, v0}, Lc/h/k/m;->a(Landroid/content/Context;Lc/h/k/g;ILjava/util/concurrent/Executor;Lc/h/k/c;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method
