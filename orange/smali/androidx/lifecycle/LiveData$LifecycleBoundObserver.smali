.class public Landroidx/lifecycle/LiveData$LifecycleBoundObserver;
.super Landroidx/lifecycle/LiveData$b;
.source "SourceFile"

# interfaces
.implements Lc/n/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/LiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LifecycleBoundObserver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/LiveData<",
        "TT;>.b;",
        "Lc/n/h;"
    }
.end annotation


# instance fields
.field public final e:Lc/n/j;

.field public final synthetic f:Landroidx/lifecycle/LiveData;


# virtual methods
.method public a()V
    .locals 1

    .line 6
    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lc/n/j;

    invoke-interface {v0}, Lc/n/j;->g()Lc/n/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lc/n/g;->b(Lc/n/i;)V

    return-void
.end method

.method public a(Lc/n/j;Lc/n/g$a;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lc/n/j;

    invoke-interface {p1}, Lc/n/j;->g()Lc/n/g;

    move-result-object p1

    invoke-virtual {p1}, Lc/n/g;->a()Lc/n/g$b;

    move-result-object p1

    .line 2
    sget-object p2, Lc/n/g$b;->b:Lc/n/g$b;

    if-ne p1, p2, :cond_0

    .line 3
    iget-object p1, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->f:Landroidx/lifecycle/LiveData;

    iget-object p2, p0, Landroidx/lifecycle/LiveData$b;->a:Lc/n/q;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/LiveData;->b(Lc/n/q;)V

    return-void

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eq p2, p1, :cond_1

    .line 4
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->b()Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/lifecycle/LiveData$b;->a(Z)V

    .line 5
    iget-object p2, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lc/n/j;

    invoke-interface {p2}, Lc/n/j;->g()Lc/n/g;

    move-result-object p2

    invoke-virtual {p2}, Lc/n/g;->a()Lc/n/g$b;

    move-result-object p2

    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->e:Lc/n/j;

    invoke-interface {v0}, Lc/n/j;->g()Lc/n/g;

    move-result-object v0

    invoke-virtual {v0}, Lc/n/g;->a()Lc/n/g$b;

    move-result-object v0

    sget-object v1, Lc/n/g$b;->e:Lc/n/g$b;

    invoke-virtual {v0, v1}, Lc/n/g$b;->a(Lc/n/g$b;)Z

    move-result v0

    return v0
.end method
