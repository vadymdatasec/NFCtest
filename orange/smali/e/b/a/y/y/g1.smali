.class public Le/b/a/y/y/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Le/b/a/y/y/f1;

.field public static final f:Le/b/a/y/y/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/y/w0<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/y/y/e1<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final b:Le/b/a/y/y/f1;

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/b/a/y/y/e1<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final d:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/y/f1;

    invoke-direct {v0}, Le/b/a/y/y/f1;-><init>()V

    sput-object v0, Le/b/a/y/y/g1;->e:Le/b/a/y/y/f1;

    .line 2
    new-instance v0, Le/b/a/y/y/d1;

    invoke-direct {v0}, Le/b/a/y/y/d1;-><init>()V

    sput-object v0, Le/b/a/y/y/g1;->f:Le/b/a/y/y/w0;

    return-void
.end method

.method public constructor <init>(Lc/h/m/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/h/m/d<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Le/b/a/y/y/g1;->e:Le/b/a/y/y/f1;

    invoke-direct {p0, p1, v0}, Le/b/a/y/y/g1;-><init>(Lc/h/m/d;Le/b/a/y/y/f1;)V

    return-void
.end method

.method public constructor <init>(Lc/h/m/d;Le/b/a/y/y/f1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/h/m/d<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;",
            "Le/b/a/y/y/f1;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/b/a/y/y/g1;->a:Ljava/util/List;

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le/b/a/y/y/g1;->c:Ljava/util/Set;

    .line 5
    iput-object p1, p0, Le/b/a/y/y/g1;->d:Lc/h/m/d;

    .line 6
    iput-object p2, p0, Le/b/a/y/y/g1;->b:Le/b/a/y/y/f1;

    return-void
.end method

.method public static a()Le/b/a/y/y/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">()",
            "Le/b/a/y/y/w0<",
            "TModel;TData;>;"
        }
    .end annotation

    .line 31
    sget-object v0, Le/b/a/y/y/g1;->f:Le/b/a/y/y/w0;

    return-object v0
.end method


# virtual methods
.method public final a(Le/b/a/y/y/e1;)Le/b/a/y/y/w0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b/a/y/y/e1<",
            "**>;)",
            "Le/b/a/y/y/w0<",
            "TModel;TData;>;"
        }
    .end annotation

    .line 30
    iget-object p1, p1, Le/b/a/y/y/e1;->c:Le/b/a/y/y/x0;

    invoke-interface {p1, p0}, Le/b/a/y/y/x0;->a(Le/b/a/y/y/g1;)Le/b/a/y/y/w0;

    move-result-object p1

    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/b/a/y/y/w0;

    return-object p1
.end method

.method public declared-synchronized a(Ljava/lang/Class;Ljava/lang/Class;)Le/b/a/y/y/w0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TModel;>;",
            "Ljava/lang/Class<",
            "TData;>;)",
            "Le/b/a/y/y/w0<",
            "TModel;TData;>;"
        }
    .end annotation

    monitor-enter p0

    .line 15
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    iget-object v1, p0, Le/b/a/y/y/g1;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/b/a/y/y/e1;

    .line 17
    iget-object v6, p0, Le/b/a/y/y/g1;->c:Ljava/util/Set;

    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {v5, p1, p2}, Le/b/a/y/y/e1;->a(Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 19
    iget-object v6, p0, Le/b/a/y/y/g1;->c:Ljava/util/Set;

    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-virtual {p0, v5}, Le/b/a/y/y/g1;->a(Le/b/a/y/y/e1;)Le/b/a/y/y/w0;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    iget-object v6, p0, Le/b/a/y/y/g1;->c:Ljava/util/Set;

    invoke-interface {v6, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v3, :cond_3

    .line 23
    iget-object p1, p0, Le/b/a/y/y/g1;->b:Le/b/a/y/y/f1;

    iget-object p2, p0, Le/b/a/y/y/g1;->d:Lc/h/m/d;

    invoke-virtual {p1, v0, p2}, Le/b/a/y/y/f1;->a(Ljava/util/List;Lc/h/m/d;)Le/b/a/y/y/c1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    .line 24
    :cond_3
    :try_start_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v3, :cond_4

    .line 25
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/y/y/w0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_4
    if-eqz v4, :cond_5

    .line 26
    :try_start_2
    invoke-static {}, Le/b/a/y/y/g1;->a()Le/b/a/y/y/w0;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object p1

    .line 27
    :cond_5
    :try_start_3
    new-instance v0, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;

    invoke-direct {v0, p1, p2}, Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    .line 28
    :try_start_4
    iget-object p2, p0, Le/b/a/y/y/g1;->c:Ljava/util/Set;

    invoke-interface {p2}, Ljava/util/Set;->clear()V

    .line 29
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/Class;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TModel;>;)",
            "Ljava/util/List<",
            "Le/b/a/y/y/w0<",
            "TModel;*>;>;"
        }
    .end annotation

    monitor-enter p0

    .line 5
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    iget-object v1, p0, Le/b/a/y/y/g1;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/b/a/y/y/e1;

    .line 7
    iget-object v3, p0, Le/b/a/y/y/g1;->c:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v2, p1}, Le/b/a/y/y/e1;->a(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 9
    iget-object v3, p0, Le/b/a/y/y/g1;->c:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {p0, v2}, Le/b/a/y/y/g1;->a(Le/b/a/y/y/e1;)Le/b/a/y/y/w0;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    iget-object v3, p0, Le/b/a/y/y/g1;->c:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 12
    :cond_2
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    .line 13
    :try_start_1
    iget-object v0, p0, Le/b/a/y/y/g1;->c:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 14
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TModel;>;",
            "Ljava/lang/Class<",
            "TData;>;",
            "Le/b/a/y/y/x0<",
            "+TModel;+TData;>;)V"
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x1

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2, p3, v0}, Le/b/a/y/y/g1;->a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TModel;>;",
            "Ljava/lang/Class<",
            "TData;>;",
            "Le/b/a/y/y/x0<",
            "+TModel;+TData;>;Z)V"
        }
    .end annotation

    .line 3
    new-instance v0, Le/b/a/y/y/e1;

    invoke-direct {v0, p1, p2, p3}, Le/b/a/y/y/e1;-><init>(Ljava/lang/Class;Ljava/lang/Class;Le/b/a/y/y/x0;)V

    .line 4
    iget-object p1, p0, Le/b/a/y/y/g1;->a:Ljava/util/List;

    if-eqz p4, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1, p2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized b(Ljava/lang/Class;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Le/b/a/y/y/g1;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/b/a/y/y/e1;

    .line 3
    iget-object v3, v2, Le/b/a/y/y/e1;->b:Ljava/lang/Class;

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2, p1}, Le/b/a/y/y/e1;->a(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    iget-object v2, v2, Le/b/a/y/y/e1;->b:Ljava/lang/Class;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 5
    :cond_1
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
