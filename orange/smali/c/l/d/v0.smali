.class public Lc/l/d/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lc/l/d/u0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lc/l/d/o1;


# direct methods
.method public constructor <init>(Lc/l/d/o1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    iput-object p1, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    return-void
.end method


# virtual methods
.method public a(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    .locals 3

    .line 9
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, p1, p2, v1}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    .line 13
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p3, :cond_2

    .line 14
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 15
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1, p2}, Lc/l/d/h1;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public a(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V
    .locals 3

    .line 16
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 17
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, p1, p2, p3, v1}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V

    .line 20
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p4, :cond_2

    .line 21
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 22
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1, p2, p3}, Lc/l/d/h1;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public a(Landroidx/fragment/app/Fragment;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->A()Lc/l/d/r0;

    move-result-object v0

    invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v1

    const/4 v2, 0x1

    .line 5
    invoke-virtual {v1, p1, v2}, Lc/l/d/v0;->a(Landroidx/fragment/app/Fragment;Z)V

    .line 6
    :cond_0
    iget-object v1, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/u0;

    if-eqz p2, :cond_2

    .line 7
    iget-boolean v3, v2, Lc/l/d/u0;->b:Z

    if-eqz v3, :cond_1

    .line 8
    :cond_2
    iget-object v2, v2, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v3, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v2, v3, p1, v0}, Lc/l/d/h1;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public b(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, p2, v1}, Lc/l/d/v0;->b(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p3, :cond_2

    .line 6
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 7
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1, p2}, Lc/l/d/h1;->b(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public b(Landroidx/fragment/app/Fragment;Z)V
    .locals 3

    .line 8
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->b(Landroidx/fragment/app/Fragment;Z)V

    .line 12
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p2, :cond_2

    .line 13
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 14
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->a(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public c(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, p2, v1}, Lc/l/d/v0;->c(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p3, :cond_2

    .line 6
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 7
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1, p2}, Lc/l/d/h1;->c(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public c(Landroidx/fragment/app/Fragment;Z)V
    .locals 3

    .line 8
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->c(Landroidx/fragment/app/Fragment;Z)V

    .line 12
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p2, :cond_2

    .line 13
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 14
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->b(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public d(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V
    .locals 3

    .line 8
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, p1, p2, v1}, Lc/l/d/v0;->d(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    .line 12
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p3, :cond_2

    .line 13
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 14
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1, p2}, Lc/l/d/h1;->d(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public d(Landroidx/fragment/app/Fragment;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->d(Landroidx/fragment/app/Fragment;Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p2, :cond_2

    .line 6
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 7
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->c(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public e(Landroidx/fragment/app/Fragment;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->A()Lc/l/d/r0;

    move-result-object v0

    invoke-virtual {v0}, Lc/l/d/r0;->h()Landroid/content/Context;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v1

    .line 4
    invoke-virtual {v1}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v1

    const/4 v2, 0x1

    .line 5
    invoke-virtual {v1, p1, v2}, Lc/l/d/v0;->e(Landroidx/fragment/app/Fragment;Z)V

    .line 6
    :cond_0
    iget-object v1, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/u0;

    if-eqz p2, :cond_2

    .line 7
    iget-boolean v3, v2, Lc/l/d/u0;->b:Z

    if-eqz v3, :cond_1

    .line 8
    :cond_2
    iget-object v2, v2, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v3, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v2, v3, p1, v0}, Lc/l/d/h1;->b(Lc/l/d/o1;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public f(Landroidx/fragment/app/Fragment;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->f(Landroidx/fragment/app/Fragment;Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p2, :cond_2

    .line 6
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 7
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->d(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public g(Landroidx/fragment/app/Fragment;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->g(Landroidx/fragment/app/Fragment;Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p2, :cond_2

    .line 6
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 7
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->e(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public h(Landroidx/fragment/app/Fragment;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->h(Landroidx/fragment/app/Fragment;Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p2, :cond_2

    .line 6
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 7
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->f(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public i(Landroidx/fragment/app/Fragment;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->z()Lc/l/d/o1;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lc/l/d/o1;->C()Lc/l/d/v0;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, p1, v1}, Lc/l/d/v0;->i(Landroidx/fragment/app/Fragment;Z)V

    .line 5
    :cond_0
    iget-object v0, p0, Lc/l/d/v0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/u0;

    if-eqz p2, :cond_2

    .line 6
    iget-boolean v2, v1, Lc/l/d/u0;->b:Z

    if-eqz v2, :cond_1

    .line 7
    :cond_2
    iget-object v1, v1, Lc/l/d/u0;->a:Lc/l/d/h1;

    iget-object v2, p0, Lc/l/d/v0;->b:Lc/l/d/o1;

    invoke-virtual {v1, v2, p1}, Lc/l/d/h1;->g(Lc/l/d/o1;Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    :cond_3
    return-void
.end method
