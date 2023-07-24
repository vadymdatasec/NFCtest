.class public abstract Lc/l/d/i3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/l/d/h3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/l/d/h3;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/l/d/i3;->c:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lc/l/d/i3;->d:Z

    .line 5
    iput-boolean v0, p0, Lc/l/d/i3;->e:Z

    .line 6
    iput-object p1, p0, Lc/l/d/i3;->a:Landroid/view/ViewGroup;

    return-void
.end method

.method public static a(Landroid/view/ViewGroup;Lc/l/d/j3;)Lc/l/d/i3;
    .locals 2

    .line 3
    sget v0, Lc/l/b;->special_effects_controller_view_tag:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    .line 4
    instance-of v1, v0, Lc/l/d/i3;

    if-eqz v1, :cond_0

    .line 5
    check-cast v0, Lc/l/d/i3;

    return-object v0

    .line 6
    :cond_0
    invoke-interface {p1, p0}, Lc/l/d/j3;->a(Landroid/view/ViewGroup;)Lc/l/d/i3;

    move-result-object p1

    .line 7
    sget v0, Lc/l/b;->special_effects_controller_view_tag:I

    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    return-object p1
.end method

.method public static a(Landroid/view/ViewGroup;Lc/l/d/o1;)Lc/l/d/i3;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lc/l/d/o1;->F()Lc/l/d/j3;

    move-result-object p1

    .line 2
    invoke-static {p0, p1}, Lc/l/d/i3;->a(Landroid/view/ViewGroup;Lc/l/d/j3;)Lc/l/d/i3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/Fragment;)Lc/l/d/h3;
    .locals 3

    .line 8
    iget-object v0, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/h3;

    .line 9
    invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lc/l/d/h3;->f()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public a()V
    .locals 7

    .line 31
    iget-boolean v0, p0, Lc/l/d/i3;->e:Z

    if-eqz v0, :cond_0

    return-void

    .line 32
    :cond_0
    iget-object v0, p0, Lc/l/d/i3;->a:Landroid/view/ViewGroup;

    invoke-static {v0}, Lc/h/n/v0;->C(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 33
    invoke-virtual {p0}, Lc/l/d/i3;->b()V

    .line 34
    iput-boolean v1, p0, Lc/l/d/i3;->d:Z

    return-void

    .line 35
    :cond_1
    iget-object v0, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    monitor-enter v0

    .line 36
    :try_start_0
    iget-object v2, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 37
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lc/l/d/i3;->c:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 38
    iget-object v3, p0, Lc/l/d/i3;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 39
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/h3;

    const/4 v4, 0x2

    .line 40
    invoke-static {v4}, Lc/l/d/o1;->d(I)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "FragmentManager"

    .line 41
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SpecialEffectsController: Cancelling operation "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    :cond_3
    invoke-virtual {v3}, Lc/l/d/h3;->a()V

    .line 43
    invoke-virtual {v3}, Lc/l/d/h3;->g()Z

    move-result v4

    if-nez v4, :cond_2

    .line 44
    iget-object v4, p0, Lc/l/d/i3;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 45
    :cond_4
    invoke-virtual {p0}, Lc/l/d/i3;->f()V

    .line 46
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    iget-object v3, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 48
    iget-object v3, p0, Lc/l/d/i3;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 49
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/l/d/h3;

    .line 50
    invoke-virtual {v4}, Lc/l/d/h3;->h()V

    goto :goto_1

    .line 51
    :cond_5
    iget-boolean v3, p0, Lc/l/d/i3;->d:Z

    invoke-virtual {p0, v2, v3}, Lc/l/d/i3;->a(Ljava/util/List;Z)V

    .line 52
    iput-boolean v1, p0, Lc/l/d/i3;->d:Z

    .line 53
    :cond_6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public a(Lc/l/d/a2;)V
    .locals 2

    const/4 v0, 0x2

    .line 15
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpecialEffectsController: Enqueuing hide operation for fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    .line 18
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    :cond_0
    sget-object v0, Lc/l/d/g3;->d:Lc/l/d/g3;

    sget-object v1, Lc/l/d/f3;->b:Lc/l/d/f3;

    invoke-virtual {p0, v0, v1, p1}, Lc/l/d/i3;->a(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;)V

    return-void
.end method

.method public a(Lc/l/d/g3;Lc/l/d/a2;)V
    .locals 2

    const/4 v0, 0x2

    .line 10
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpecialEffectsController: Enqueuing add operation for fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    invoke-virtual {p2}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    .line 13
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    :cond_0
    sget-object v0, Lc/l/d/f3;->c:Lc/l/d/f3;

    invoke-virtual {p0, p1, v0, p2}, Lc/l/d/i3;->a(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;)V

    return-void
.end method

.method public final a(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;)V
    .locals 3

    .line 20
    iget-object v0, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    monitor-enter v0

    .line 21
    :try_start_0
    new-instance v1, Lc/h/j/c;

    invoke-direct {v1}, Lc/h/j/c;-><init>()V

    .line 22
    invoke-virtual {p3}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-virtual {p0, v2}, Lc/l/d/i3;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/h3;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 23
    invoke-virtual {v2, p1, p2}, Lc/l/d/h3;->a(Lc/l/d/g3;Lc/l/d/f3;)V

    .line 24
    monitor-exit v0

    return-void

    .line 25
    :cond_0
    new-instance v2, Lc/l/d/d3;

    invoke-direct {v2, p1, p2, p3, v1}, Lc/l/d/d3;-><init>(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;Lc/h/j/c;)V

    .line 26
    iget-object p1, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance p1, Lc/l/d/a3;

    invoke-direct {p1, p0, v2}, Lc/l/d/a3;-><init>(Lc/l/d/i3;Lc/l/d/d3;)V

    invoke-virtual {v2, p1}, Lc/l/d/h3;->a(Ljava/lang/Runnable;)V

    .line 28
    new-instance p1, Lc/l/d/b3;

    invoke-direct {p1, p0, v2}, Lc/l/d/b3;-><init>(Lc/l/d/i3;Lc/l/d/d3;)V

    invoke-virtual {v2, p1}, Lc/l/d/h3;->a(Ljava/lang/Runnable;)V

    .line 29
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public abstract a(Ljava/util/List;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/l/d/h3;",
            ">;Z)V"
        }
    .end annotation
.end method

.method public a(Z)V
    .locals 0

    .line 30
    iput-boolean p1, p0, Lc/l/d/i3;->d:Z

    return-void
.end method

.method public final b(Landroidx/fragment/app/Fragment;)Lc/l/d/h3;
    .locals 3

    .line 1
    iget-object v0, p0, Lc/l/d/i3;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/h3;

    .line 2
    invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lc/l/d/h3;->f()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public b()V
    .locals 9

    .line 8
    iget-object v0, p0, Lc/l/d/i3;->a:Landroid/view/ViewGroup;

    invoke-static {v0}, Lc/h/n/v0;->C(Landroid/view/View;)Z

    move-result v0

    .line 9
    iget-object v1, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    monitor-enter v1

    .line 10
    :try_start_0
    invoke-virtual {p0}, Lc/l/d/i3;->f()V

    .line 11
    iget-object v2, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/h3;

    .line 12
    invoke-virtual {v3}, Lc/l/d/h3;->h()V

    goto :goto_0

    .line 13
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lc/l/d/i3;->c:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/h3;

    .line 15
    invoke-static {v4}, Lc/l/d/o1;->d(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "FragmentManager"

    .line 16
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SpecialEffectsController: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    const-string v6, ""

    goto :goto_2

    .line 17
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Container "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Lc/l/d/i3;->a:Landroid/view/ViewGroup;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " is not attached to window. "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_2
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "Cancelling running operation "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 18
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    :cond_2
    invoke-virtual {v3}, Lc/l/d/h3;->a()V

    goto :goto_1

    .line 20
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/h3;

    .line 22
    invoke-static {v4}, Lc/l/d/o1;->d(I)Z

    move-result v5

    if-eqz v5, :cond_5

    const-string v5, "FragmentManager"

    .line 23
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SpecialEffectsController: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_4

    const-string v7, ""

    goto :goto_4

    .line 24
    :cond_4
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Container "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Lc/l/d/i3;->a:Landroid/view/ViewGroup;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, " is not attached to window. "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :goto_4
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "Cancelling pending operation "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 25
    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    :cond_5
    invoke-virtual {v3}, Lc/l/d/h3;->a()V

    goto :goto_3

    .line 27
    :cond_6
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Lc/l/d/a2;)V
    .locals 2

    const/4 v0, 0x2

    .line 3
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpecialEffectsController: Enqueuing remove operation for fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    .line 6
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    :cond_0
    sget-object v0, Lc/l/d/g3;->b:Lc/l/d/g3;

    sget-object v1, Lc/l/d/f3;->d:Lc/l/d/f3;

    invoke-virtual {p0, v0, v1, p1}, Lc/l/d/i3;->a(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;)V

    return-void
.end method

.method public c()V
    .locals 1

    .line 6
    iget-boolean v0, p0, Lc/l/d/i3;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lc/l/d/i3;->e:Z

    .line 8
    invoke-virtual {p0}, Lc/l/d/i3;->a()V

    :cond_0
    return-void
.end method

.method public c(Lc/l/d/a2;)V
    .locals 2

    const/4 v0, 0x2

    .line 1
    invoke-static {v0}, Lc/l/d/o1;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpecialEffectsController: Enqueuing show operation for fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    .line 4
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    :cond_0
    sget-object v0, Lc/l/d/g3;->c:Lc/l/d/g3;

    sget-object v1, Lc/l/d/f3;->b:Lc/l/d/f3;

    invoke-virtual {p0, v0, v1, p1}, Lc/l/d/i3;->a(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;)V

    return-void
.end method

.method public d()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/i3;->a:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public d(Lc/l/d/a2;)Lc/l/d/f3;
    .locals 2

    .line 2
    invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/l/d/i3;->a(Landroidx/fragment/app/Fragment;)Lc/l/d/h3;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/l/d/h3;->e()Lc/l/d/f3;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/l/d/i3;->b(Landroidx/fragment/app/Fragment;)Lc/l/d/h3;

    move-result-object p1

    if-eqz p1, :cond_2

    if-eqz v0, :cond_1

    .line 5
    sget-object v1, Lc/l/d/f3;->b:Lc/l/d/f3;

    if-ne v0, v1, :cond_2

    .line 6
    :cond_1
    invoke-virtual {p1}, Lc/l/d/h3;->e()Lc/l/d/f3;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0
.end method

.method public e()V
    .locals 6

    .line 1
    iget-object v0, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lc/l/d/i3;->f()V

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lc/l/d/i3;->e:Z

    .line 4
    iget-object v1, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    .line 5
    iget-object v2, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/h3;

    .line 6
    invoke-virtual {v2}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v3

    iget-object v3, v3, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-static {v3}, Lc/l/d/g3;->b(Landroid/view/View;)Lc/l/d/g3;

    move-result-object v3

    .line 7
    invoke-virtual {v2}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object v4

    sget-object v5, Lc/l/d/g3;->c:Lc/l/d/g3;

    if-ne v4, v5, :cond_0

    sget-object v4, Lc/l/d/g3;->c:Lc/l/d/g3;

    if-eq v3, v4, :cond_0

    .line 8
    invoke-virtual {v2}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->V()Z

    move-result v1

    iput-boolean v1, p0, Lc/l/d/i3;->e:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 10
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/l/d/i3;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/h3;

    .line 2
    invoke-virtual {v1}, Lc/l/d/h3;->e()Lc/l/d/f3;

    move-result-object v2

    sget-object v3, Lc/l/d/f3;->c:Lc/l/d/f3;

    if-ne v2, v3, :cond_0

    .line 3
    invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;

    move-result-object v2

    .line 5
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    invoke-static {v2}, Lc/l/d/g3;->a(I)Lc/l/d/g3;

    move-result-object v2

    .line 6
    sget-object v3, Lc/l/d/f3;->b:Lc/l/d/f3;

    invoke-virtual {v1, v2, v3}, Lc/l/d/h3;->a(Lc/l/d/g3;Lc/l/d/f3;)V

    goto :goto_0

    :cond_1
    return-void
.end method
