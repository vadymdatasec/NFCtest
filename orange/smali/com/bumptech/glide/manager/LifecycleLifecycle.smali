.class public final Lcom/bumptech/glide/manager/LifecycleLifecycle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/z/m;
.implements Lc/n/i;


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/b/a/z/n;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lc/n/g;


# direct methods
.method public constructor <init>(Lc/n/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/manager/LifecycleLifecycle;->a:Ljava/util/Set;

    .line 3
    iput-object p1, p0, Lcom/bumptech/glide/manager/LifecycleLifecycle;->b:Lc/n/g;

    .line 4
    invoke-virtual {p1, p0}, Lc/n/g;->a(Lc/n/i;)V

    return-void
.end method


# virtual methods
.method public a(Le/b/a/z/n;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/manager/LifecycleLifecycle;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/manager/LifecycleLifecycle;->b:Lc/n/g;

    invoke-virtual {v0}, Lc/n/g;->a()Lc/n/g$b;

    move-result-object v0

    sget-object v1, Lc/n/g$b;->b:Lc/n/g$b;

    if-ne v0, v1, :cond_0

    .line 3
    invoke-interface {p1}, Le/b/a/z/n;->onDestroy()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/manager/LifecycleLifecycle;->b:Lc/n/g;

    invoke-virtual {v0}, Lc/n/g;->a()Lc/n/g$b;

    move-result-object v0

    sget-object v1, Lc/n/g$b;->e:Lc/n/g$b;

    invoke-virtual {v0, v1}, Lc/n/g$b;->a(Lc/n/g$b;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    invoke-interface {p1}, Le/b/a/z/n;->a()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-interface {p1}, Le/b/a/z/n;->b()V

    :goto_0
    return-void
.end method

.method public b(Le/b/a/z/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/manager/LifecycleLifecycle;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onDestroy(Lc/n/j;)V
    .locals 2
    .annotation runtime Lc/n/r;
        value = .enum Lc/n/g$a;->ON_DESTROY:Lc/n/g$a;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/manager/LifecycleLifecycle;->a:Ljava/util/Set;

    invoke-static {v0}, Le/b/a/e0/t;->a(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/z/n;

    .line 2
    invoke-interface {v1}, Le/b/a/z/n;->onDestroy()V

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {p1}, Lc/n/j;->g()Lc/n/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lc/n/g;->b(Lc/n/i;)V

    return-void
.end method

.method public onStart(Lc/n/j;)V
    .locals 1
    .annotation runtime Lc/n/r;
        value = .enum Lc/n/g$a;->ON_START:Lc/n/g$a;
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/bumptech/glide/manager/LifecycleLifecycle;->a:Ljava/util/Set;

    invoke-static {p1}, Le/b/a/e0/t;->a(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/z/n;

    .line 2
    invoke-interface {v0}, Le/b/a/z/n;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onStop(Lc/n/j;)V
    .locals 1
    .annotation runtime Lc/n/r;
        value = .enum Lc/n/g$a;->ON_STOP:Lc/n/g$a;
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/bumptech/glide/manager/LifecycleLifecycle;->a:Ljava/util/Set;

    invoke-static {p1}, Le/b/a/e0/t;->a(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/z/n;

    .line 2
    invoke-interface {v0}, Le/b/a/z/n;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method
