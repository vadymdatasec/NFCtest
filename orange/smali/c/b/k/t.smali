.class public abstract Lc/b/k/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:I = -0x64

.field public static final c:Lc/e/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/d<",
            "Ljava/lang/ref/WeakReference<",
            "Lc/b/k/t;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final d:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc/e/d;

    invoke-direct {v0}, Lc/e/d;-><init>()V

    sput-object v0, Lc/b/k/t;->c:Lc/e/d;

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc/b/k/t;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lc/b/k/s;)Lc/b/k/t;
    .locals 1

    .line 1
    new-instance v0, Lc/b/k/n0;

    invoke-direct {v0, p0, p1}, Lc/b/k/n0;-><init>(Landroid/app/Activity;Lc/b/k/s;)V

    return-object v0
.end method

.method public static a(Landroid/app/Dialog;Lc/b/k/s;)Lc/b/k/t;
    .locals 1

    .line 2
    new-instance v0, Lc/b/k/n0;

    invoke-direct {v0, p0, p1}, Lc/b/k/n0;-><init>(Landroid/app/Dialog;Lc/b/k/s;)V

    return-object v0
.end method

.method public static a(Lc/b/k/t;)V
    .locals 3

    .line 3
    sget-object v0, Lc/b/k/t;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0}, Lc/b/k/t;->c(Lc/b/k/t;)V

    .line 5
    sget-object v1, Lc/b/k/t;->c:Lc/e/d;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lc/e/d;->add(Ljava/lang/Object;)Z

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static b(Lc/b/k/t;)V
    .locals 1

    .line 1
    sget-object v0, Lc/b/k/t;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-static {p0}, Lc/b/k/t;->c(Lc/b/k/t;)V

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static c(Lc/b/k/t;)V
    .locals 3

    .line 1
    sget-object v0, Lc/b/k/t;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lc/b/k/t;->c:Lc/e/d;

    invoke-virtual {v1}, Lc/e/d;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 3
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/b/k/t;

    if-eq v2, p0, :cond_1

    if-nez v2, :cond_0

    .line 5
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 6
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static j()I
    .locals 1

    .line 1
    sget v0, Lc/b/k/t;->b:I

    return v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract a(I)Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation
.end method

.method public abstract a(Landroid/content/Context;)V
.end method

.method public abstract a(Landroid/content/res/Configuration;)V
.end method

.method public abstract a(Landroid/os/Bundle;)V
.end method

.method public abstract a(Landroid/view/View;)V
.end method

.method public abstract a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract a(Landroidx/appcompat/widget/Toolbar;)V
.end method

.method public abstract a(Ljava/lang/CharSequence;)V
.end method

.method public abstract b()Landroid/view/MenuInflater;
.end method

.method public abstract b(Landroid/os/Bundle;)V
.end method

.method public abstract b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract b(I)Z
.end method

.method public abstract c()Lc/b/k/a;
.end method

.method public abstract c(I)V
.end method

.method public abstract c(Landroid/os/Bundle;)V
.end method

.method public abstract d()V
.end method

.method public abstract d(I)V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public abstract g()V
.end method

.method public abstract h()V
.end method

.method public abstract i()V
.end method
