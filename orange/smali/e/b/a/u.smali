.class public Le/b/a/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Le/b/a/z/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/b/a/u$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/content/ComponentCallbacks2;",
        "Le/b/a/z/n;",
        "Ljava/lang/Object<",
        "Le/b/a/s<",
        "Landroid/graphics/drawable/Drawable;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final m:Le/b/a/c0/j;


# instance fields
.field public final b:Le/b/a/d;

.field public final c:Landroid/content/Context;

.field public final d:Le/b/a/z/m;

.field public final e:Le/b/a/z/x;

.field public final f:Le/b/a/z/w;

.field public final g:Le/b/a/z/m0;

.field public final h:Ljava/lang/Runnable;

.field public final i:Le/b/a/z/d;

.field public final j:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Le/b/a/c0/i<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public k:Le/b/a/c0/j;

.field public l:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Landroid/graphics/Bitmap;

    invoke-static {v0}, Le/b/a/c0/j;->b(Ljava/lang/Class;)Le/b/a/c0/j;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/c0/a;->E()Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    sput-object v0, Le/b/a/u;->m:Le/b/a/c0/j;

    .line 2
    const-class v0, Le/b/a/y/z/i/f;

    invoke-static {v0}, Le/b/a/c0/j;->b(Ljava/lang/Class;)Le/b/a/c0/j;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/c0/a;->E()Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    .line 3
    sget-object v0, Le/b/a/y/x/c0;->b:Le/b/a/y/x/c0;

    .line 4
    invoke-static {v0}, Le/b/a/c0/j;->b(Le/b/a/y/x/c0;)Le/b/a/c0/j;

    move-result-object v0

    sget-object v1, Le/b/a/n;->e:Le/b/a/n;

    invoke-virtual {v0, v1}, Le/b/a/c0/a;->a(Le/b/a/n;)Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Le/b/a/c0/a;->a(Z)Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    return-void
.end method

.method public constructor <init>(Le/b/a/d;Le/b/a/z/m;Le/b/a/z/w;Landroid/content/Context;)V
    .locals 7

    .line 1
    new-instance v4, Le/b/a/z/x;

    invoke-direct {v4}, Le/b/a/z/x;-><init>()V

    .line 2
    invoke-virtual {p1}, Le/b/a/d;->d()Le/b/a/z/e;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    .line 3
    invoke-direct/range {v0 .. v6}, Le/b/a/u;-><init>(Le/b/a/d;Le/b/a/z/m;Le/b/a/z/w;Le/b/a/z/x;Le/b/a/z/e;Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Le/b/a/d;Le/b/a/z/m;Le/b/a/z/w;Le/b/a/z/x;Le/b/a/z/e;Landroid/content/Context;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Le/b/a/z/m0;

    invoke-direct {v0}, Le/b/a/z/m0;-><init>()V

    iput-object v0, p0, Le/b/a/u;->g:Le/b/a/z/m0;

    .line 6
    new-instance v0, Le/b/a/t;

    invoke-direct {v0, p0}, Le/b/a/t;-><init>(Le/b/a/u;)V

    iput-object v0, p0, Le/b/a/u;->h:Ljava/lang/Runnable;

    .line 7
    iput-object p1, p0, Le/b/a/u;->b:Le/b/a/d;

    .line 8
    iput-object p2, p0, Le/b/a/u;->d:Le/b/a/z/m;

    .line 9
    iput-object p3, p0, Le/b/a/u;->f:Le/b/a/z/w;

    .line 10
    iput-object p4, p0, Le/b/a/u;->e:Le/b/a/z/x;

    .line 11
    iput-object p6, p0, Le/b/a/u;->c:Landroid/content/Context;

    .line 12
    invoke-virtual {p6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    new-instance p6, Le/b/a/u$a;

    invoke-direct {p6, p0, p4}, Le/b/a/u$a;-><init>(Le/b/a/u;Le/b/a/z/x;)V

    .line 13
    invoke-interface {p5, p3, p6}, Le/b/a/z/e;->a(Landroid/content/Context;Le/b/a/z/c;)Le/b/a/z/d;

    move-result-object p3

    iput-object p3, p0, Le/b/a/u;->i:Le/b/a/z/d;

    .line 14
    invoke-virtual {p1, p0}, Le/b/a/d;->a(Le/b/a/u;)V

    .line 15
    invoke-static {}, Le/b/a/e0/t;->d()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 16
    iget-object p3, p0, Le/b/a/u;->h:Ljava/lang/Runnable;

    invoke-static {p3}, Le/b/a/e0/t;->a(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p2, p0}, Le/b/a/z/m;->a(Le/b/a/z/n;)V

    .line 18
    :goto_0
    iget-object p3, p0, Le/b/a/u;->i:Le/b/a/z/d;

    invoke-interface {p2, p3}, Le/b/a/z/m;->a(Le/b/a/z/n;)V

    .line 19
    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    invoke-virtual {p1}, Le/b/a/d;->f()Le/b/a/j;

    move-result-object p3

    invoke-virtual {p3}, Le/b/a/j;->b()Ljava/util/List;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Le/b/a/u;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    invoke-virtual {p1}, Le/b/a/d;->f()Le/b/a/j;

    move-result-object p1

    invoke-virtual {p1}, Le/b/a/j;->c()Le/b/a/c0/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/u;->a(Le/b/a/c0/j;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Le/b/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Le/b/a/s<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 7
    invoke-virtual {p0}, Le/b/a/u;->e()Le/b/a/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/s;->a(Landroid/net/Uri;)Le/b/a/s;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Class;)Le/b/a/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResourceType:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TResourceType;>;)",
            "Le/b/a/s<",
            "TResourceType;>;"
        }
    .end annotation

    .line 9
    new-instance v0, Le/b/a/s;

    iget-object v1, p0, Le/b/a/u;->b:Le/b/a/d;

    iget-object v2, p0, Le/b/a/u;->c:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p1, v2}, Le/b/a/s;-><init>(Le/b/a/d;Le/b/a/u;Ljava/lang/Class;Landroid/content/Context;)V

    return-object v0
.end method

.method public a(Ljava/lang/Integer;)Le/b/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Le/b/a/s<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 8
    invoke-virtual {p0}, Le/b/a/u;->e()Le/b/a/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/s;->a(Ljava/lang/Integer;)Le/b/a/s;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;)Le/b/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le/b/a/s<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 6
    invoke-virtual {p0}, Le/b/a/u;->e()Le/b/a/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/s;->a(Ljava/lang/String;)Le/b/a/s;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized a()V
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Le/b/a/u;->k()V

    .line 4
    iget-object v0, p0, Le/b/a/u;->g:Le/b/a/z/m0;

    invoke-virtual {v0}, Le/b/a/z/m0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized a(Le/b/a/c0/j;)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Le/b/a/c0/a;->clone()Le/b/a/c0/a;

    move-result-object p1

    check-cast p1, Le/b/a/c0/j;

    invoke-virtual {p1}, Le/b/a/c0/a;->a()Le/b/a/c0/a;

    move-result-object p1

    check-cast p1, Le/b/a/c0/j;

    iput-object p1, p0, Le/b/a/u;->k:Le/b/a/c0/j;
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

.method public a(Le/b/a/c0/o/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/o/h<",
            "*>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Le/b/a/u;->c(Le/b/a/c0/o/h;)V

    return-void
.end method

.method public declared-synchronized a(Le/b/a/c0/o/h;Le/b/a/c0/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/o/h<",
            "*>;",
            "Le/b/a/c0/d;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    .line 11
    :try_start_0
    iget-object v0, p0, Le/b/a/u;->g:Le/b/a/z/m0;

    invoke-virtual {v0, p1}, Le/b/a/z/m0;->a(Le/b/a/c0/o/h;)V

    .line 12
    iget-object p1, p0, Le/b/a/u;->e:Le/b/a/z/x;

    invoke-virtual {p1, p2}, Le/b/a/z/x;->b(Le/b/a/c0/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(Ljava/lang/Class;)Le/b/a/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Le/b/a/v<",
            "*TT;>;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Le/b/a/u;->b:Le/b/a/d;

    invoke-virtual {v0}, Le/b/a/d;->f()Le/b/a/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/j;->a(Ljava/lang/Class;)Le/b/a/v;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Le/b/a/u;->j()V

    .line 2
    iget-object v0, p0, Le/b/a/u;->g:Le/b/a/z/m0;

    invoke-virtual {v0}, Le/b/a/z/m0;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b(Le/b/a/c0/o/h;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/o/h<",
            "*>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 4
    :try_start_0
    invoke-interface {p1}, Le/b/a/c0/o/h;->c()Le/b/a/c0/d;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 5
    monitor-exit p0

    return v1

    .line 6
    :cond_0
    :try_start_1
    iget-object v2, p0, Le/b/a/u;->e:Le/b/a/z/x;

    invoke-virtual {v2, v0}, Le/b/a/z/x;->a(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Le/b/a/u;->g:Le/b/a/z/m0;

    invoke-virtual {v0, p1}, Le/b/a/z/m0;->b(Le/b/a/c0/o/h;)V

    const/4 v0, 0x0

    .line 8
    invoke-interface {p1, v0}, Le/b/a/c0/o/h;->a(Le/b/a/c0/d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    monitor-exit p0

    return v1

    :cond_1
    const/4 p1, 0x0

    .line 10
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final c(Le/b/a/c0/o/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/c0/o/h<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/b/a/u;->b(Le/b/a/c0/o/h;)Z

    move-result v0

    .line 2
    invoke-interface {p1}, Le/b/a/c0/o/h;->c()Le/b/a/c0/d;

    move-result-object v1

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Le/b/a/u;->b:Le/b/a/d;

    invoke-virtual {v0, p1}, Le/b/a/d;->a(Le/b/a/c0/o/h;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 4
    invoke-interface {p1, v0}, Le/b/a/c0/o/h;->a(Le/b/a/c0/d;)V

    .line 5
    invoke-interface {v1}, Le/b/a/c0/d;->clear()V

    :cond_0
    return-void
.end method

.method public d()Le/b/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/b/a/s<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Le/b/a/u;->a(Ljava/lang/Class;)Le/b/a/s;

    move-result-object v0

    sget-object v1, Le/b/a/u;->m:Le/b/a/c0/j;

    invoke-virtual {v0, v1}, Le/b/a/s;->a(Le/b/a/c0/a;)Le/b/a/s;

    move-result-object v0

    return-object v0
.end method

.method public e()Le/b/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/b/a/s<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Le/b/a/u;->a(Ljava/lang/Class;)Le/b/a/s;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/u;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public declared-synchronized g()Le/b/a/c0/j;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/u;->k:Le/b/a/c0/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized h()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/u;->e:Le/b/a/z/x;

    invoke-virtual {v0}, Le/b/a/z/x;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized i()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Le/b/a/u;->h()V

    .line 2
    iget-object v0, p0, Le/b/a/u;->f:Le/b/a/z/w;

    invoke-interface {v0}, Le/b/a/z/w;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/u;

    .line 3
    invoke-virtual {v1}, Le/b/a/u;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 4
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized j()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/u;->e:Le/b/a/z/x;

    invoke-virtual {v0}, Le/b/a/z/x;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized k()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/u;->e:Le/b/a/z/x;

    invoke-virtual {v0}, Le/b/a/z/x;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public declared-synchronized onDestroy()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/u;->g:Le/b/a/z/m0;

    invoke-virtual {v0}, Le/b/a/z/m0;->onDestroy()V

    .line 2
    iget-object v0, p0, Le/b/a/u;->g:Le/b/a/z/m0;

    invoke-virtual {v0}, Le/b/a/z/m0;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/c0/o/h;

    .line 3
    invoke-virtual {p0, v1}, Le/b/a/u;->a(Le/b/a/c0/o/h;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Le/b/a/u;->g:Le/b/a/z/m0;

    invoke-virtual {v0}, Le/b/a/z/m0;->d()V

    .line 5
    iget-object v0, p0, Le/b/a/u;->e:Le/b/a/z/x;

    invoke-virtual {v0}, Le/b/a/z/x;->a()V

    .line 6
    iget-object v0, p0, Le/b/a/u;->d:Le/b/a/z/m;

    invoke-interface {v0, p0}, Le/b/a/z/m;->b(Le/b/a/z/n;)V

    .line 7
    iget-object v0, p0, Le/b/a/u;->d:Le/b/a/z/m;

    iget-object v1, p0, Le/b/a/u;->i:Le/b/a/z/d;

    invoke-interface {v0, v1}, Le/b/a/z/m;->b(Le/b/a/z/n;)V

    .line 8
    iget-object v0, p0, Le/b/a/u;->h:Ljava/lang/Runnable;

    invoke-static {v0}, Le/b/a/e0/t;->b(Ljava/lang/Runnable;)V

    .line 9
    iget-object v0, p0, Le/b/a/u;->b:Le/b/a/d;

    invoke-virtual {v0, p0}, Le/b/a/d;->b(Le/b/a/u;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onLowMemory()V
    .locals 0

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    const/16 v0, 0x3c

    if-ne p1, v0, :cond_0

    .line 1
    iget-boolean p1, p0, Le/b/a/u;->l:Z

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Le/b/a/u;->i()V

    :cond_0
    return-void
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{tracker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/u;->e:Le/b/a/z/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", treeNode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/u;->f:Le/b/a/z/w;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
