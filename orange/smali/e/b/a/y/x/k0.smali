.class public Le/b/a/y/x/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/o;
.implements Le/b/a/e0/u/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/b/a/y/x/k0$b;,
        Le/b/a/y/x/k0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/x/o<",
        "TR;>;",
        "Le/b/a/e0/u/f;"
    }
.end annotation


# static fields
.field public static final A:Le/b/a/y/x/l0;


# instance fields
.field public final b:Le/b/a/y/x/n0;

.field public final c:Le/b/a/e0/u/l;

.field public final d:Le/b/a/y/x/r0;

.field public final e:Lc/h/m/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/h/m/d<",
            "Le/b/a/y/x/k0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final f:Le/b/a/y/x/l0;

.field public final g:Le/b/a/y/x/o0;

.field public final h:Le/b/a/y/x/h1/k;

.field public final i:Le/b/a/y/x/h1/k;

.field public final j:Le/b/a/y/x/h1/k;

.field public final k:Le/b/a/y/x/h1/k;

.field public final l:Ljava/util/concurrent/atomic/AtomicInteger;

.field public m:Le/b/a/y/n;

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Le/b/a/y/x/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/y0<",
            "*>;"
        }
    .end annotation
.end field

.field public s:Le/b/a/y/a;

.field public t:Z

.field public u:Lcom/bumptech/glide/load/engine/GlideException;

.field public v:Z

.field public w:Le/b/a/y/x/s0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/s0<",
            "*>;"
        }
    .end annotation
.end field

.field public x:Le/b/a/y/x/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/p<",
            "TR;>;"
        }
    .end annotation
.end field

.field public volatile y:Z

.field public z:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/x/l0;

    invoke-direct {v0}, Le/b/a/y/x/l0;-><init>()V

    sput-object v0, Le/b/a/y/x/k0;->A:Le/b/a/y/x/l0;

    return-void
.end method

.method public constructor <init>(Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/o0;Le/b/a/y/x/r0;Lc/h/m/d;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/h1/k;",
            "Le/b/a/y/x/h1/k;",
            "Le/b/a/y/x/h1/k;",
            "Le/b/a/y/x/h1/k;",
            "Le/b/a/y/x/o0;",
            "Le/b/a/y/x/r0;",
            "Lc/h/m/d<",
            "Le/b/a/y/x/k0<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    sget-object v8, Le/b/a/y/x/k0;->A:Le/b/a/y/x/l0;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Le/b/a/y/x/k0;-><init>(Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/o0;Le/b/a/y/x/r0;Lc/h/m/d;Le/b/a/y/x/l0;)V

    return-void
.end method

.method public constructor <init>(Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/h1/k;Le/b/a/y/x/o0;Le/b/a/y/x/r0;Lc/h/m/d;Le/b/a/y/x/l0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/h1/k;",
            "Le/b/a/y/x/h1/k;",
            "Le/b/a/y/x/h1/k;",
            "Le/b/a/y/x/h1/k;",
            "Le/b/a/y/x/o0;",
            "Le/b/a/y/x/r0;",
            "Lc/h/m/d<",
            "Le/b/a/y/x/k0<",
            "*>;>;",
            "Le/b/a/y/x/l0;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Le/b/a/y/x/n0;

    invoke-direct {v0}, Le/b/a/y/x/n0;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    .line 4
    invoke-static {}, Le/b/a/e0/u/l;->b()Le/b/a/e0/u/l;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/k0;->c:Le/b/a/e0/u/l;

    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/k0;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    iput-object p1, p0, Le/b/a/y/x/k0;->h:Le/b/a/y/x/h1/k;

    .line 7
    iput-object p2, p0, Le/b/a/y/x/k0;->i:Le/b/a/y/x/h1/k;

    .line 8
    iput-object p3, p0, Le/b/a/y/x/k0;->j:Le/b/a/y/x/h1/k;

    .line 9
    iput-object p4, p0, Le/b/a/y/x/k0;->k:Le/b/a/y/x/h1/k;

    .line 10
    iput-object p5, p0, Le/b/a/y/x/k0;->g:Le/b/a/y/x/o0;

    .line 11
    iput-object p6, p0, Le/b/a/y/x/k0;->d:Le/b/a/y/x/r0;

    .line 12
    iput-object p7, p0, Le/b/a/y/x/k0;->e:Lc/h/m/d;

    .line 13
    iput-object p8, p0, Le/b/a/y/x/k0;->f:Le/b/a/y/x/l0;

    return-void
.end method


# virtual methods
.method public a()Le/b/a/e0/u/l;
    .locals 1

    .line 36
    iget-object v0, p0, Le/b/a/y/x/k0;->c:Le/b/a/e0/u/l;

    return-object v0
.end method

.method public declared-synchronized a(Le/b/a/y/n;ZZZZ)Le/b/a/y/x/k0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "ZZZZ)",
            "Le/b/a/y/x/k0<",
            "TR;>;"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Le/b/a/y/x/k0;->m:Le/b/a/y/n;

    .line 2
    iput-boolean p2, p0, Le/b/a/y/x/k0;->n:Z

    .line 3
    iput-boolean p3, p0, Le/b/a/y/x/k0;->o:Z

    .line 4
    iput-boolean p4, p0, Le/b/a/y/x/k0;->p:Z

    .line 5
    iput-boolean p5, p0, Le/b/a/y/x/k0;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(I)V
    .locals 2

    monitor-enter p0

    .line 19
    :try_start_0
    invoke-virtual {p0}, Le/b/a/y/x/k0;->e()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, Le/b/a/e0/r;->a(ZLjava/lang/String;)V

    .line 20
    iget-object v0, p0, Le/b/a/y/x/k0;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndAdd(I)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Le/b/a/y/x/k0;->w:Le/b/a/y/x/s0;

    if-eqz p1, :cond_0

    .line 21
    iget-object p1, p0, Le/b/a/y/x/k0;->w:Le/b/a/y/x/s0;

    invoke-virtual {p1}, Le/b/a/y/x/s0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Lcom/bumptech/glide/load/engine/GlideException;)V
    .locals 0

    .line 30
    monitor-enter p0

    .line 31
    :try_start_0
    iput-object p1, p0, Le/b/a/y/x/k0;->u:Lcom/bumptech/glide/load/engine/GlideException;

    .line 32
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-virtual {p0}, Le/b/a/y/x/k0;->f()V

    return-void

    :catchall_0
    move-exception p1

    .line 34
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Le/b/a/c0/k;)V
    .locals 1

    .line 17
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/k0;->u:Lcom/bumptech/glide/load/engine/GlideException;

    invoke-interface {p1, v0}, Le/b/a/c0/k;->a(Lcom/bumptech/glide/load/engine/GlideException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 18
    new-instance v0, Le/b/a/y/x/g;

    invoke-direct {v0, p1}, Le/b/a/y/x/g;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public declared-synchronized a(Le/b/a/c0/k;Ljava/util/concurrent/Executor;)V
    .locals 2

    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/k0;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 8
    iget-object v0, p0, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    invoke-virtual {v0, p1, p2}, Le/b/a/y/x/n0;->a(Le/b/a/c0/k;Ljava/util/concurrent/Executor;)V

    .line 9
    iget-boolean v0, p0, Le/b/a/y/x/k0;->t:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {p0, v1}, Le/b/a/y/x/k0;->a(I)V

    .line 11
    new-instance v0, Le/b/a/y/x/k0$b;

    invoke-direct {v0, p0, p1}, Le/b/a/y/x/k0$b;-><init>(Le/b/a/y/x/k0;Le/b/a/c0/k;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 12
    :cond_0
    iget-boolean v0, p0, Le/b/a/y/x/k0;->v:Z

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {p0, v1}, Le/b/a/y/x/k0;->a(I)V

    .line 14
    new-instance v0, Le/b/a/y/x/k0$a;

    invoke-direct {v0, p0, p1}, Le/b/a/y/x/k0$a;-><init>(Le/b/a/y/x/k0;Le/b/a/c0/k;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 15
    :cond_1
    iget-boolean p1, p0, Le/b/a/y/x/k0;->y:Z

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const-string p1, "Cannot add callbacks to a cancelled EngineJob"

    invoke-static {v1, p1}, Le/b/a/e0/r;->a(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Le/b/a/y/x/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/p<",
            "*>;)V"
        }
    .end annotation

    .line 35
    invoke-virtual {p0}, Le/b/a/y/x/k0;->d()Le/b/a/y/x/h1/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/b/a/y/x/h1/k;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "TR;>;",
            "Le/b/a/y/a;",
            "Z)V"
        }
    .end annotation

    .line 23
    monitor-enter p0

    .line 24
    :try_start_0
    iput-object p1, p0, Le/b/a/y/x/k0;->r:Le/b/a/y/x/y0;

    .line 25
    iput-object p2, p0, Le/b/a/y/x/k0;->s:Le/b/a/y/a;

    .line 26
    iput-boolean p3, p0, Le/b/a/y/x/k0;->z:Z

    .line 27
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    invoke-virtual {p0}, Le/b/a/y/x/k0;->g()V

    return-void

    :catchall_0
    move-exception p1

    .line 29
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b()V
    .locals 2

    .line 7
    invoke-virtual {p0}, Le/b/a/y/x/k0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Le/b/a/y/x/k0;->y:Z

    .line 9
    iget-object v0, p0, Le/b/a/y/x/k0;->x:Le/b/a/y/x/p;

    invoke-virtual {v0}, Le/b/a/y/x/p;->c()V

    .line 10
    iget-object v0, p0, Le/b/a/y/x/k0;->g:Le/b/a/y/x/o0;

    iget-object v1, p0, Le/b/a/y/x/k0;->m:Le/b/a/y/n;

    invoke-interface {v0, p0, v1}, Le/b/a/y/x/o0;->a(Le/b/a/y/x/k0;Le/b/a/y/n;)V

    return-void
.end method

.method public b(Le/b/a/c0/k;)V
    .locals 3

    .line 5
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/k0;->w:Le/b/a/y/x/s0;

    iget-object v1, p0, Le/b/a/y/x/k0;->s:Le/b/a/y/a;

    iget-boolean v2, p0, Le/b/a/y/x/k0;->z:Z

    invoke-interface {p1, v0, v1, v2}, Le/b/a/c0/k;->a(Le/b/a/y/x/y0;Le/b/a/y/a;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 6
    new-instance v0, Le/b/a/y/x/g;

    invoke-direct {v0, p1}, Le/b/a/y/x/g;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public declared-synchronized b(Le/b/a/y/x/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/p<",
            "TR;>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Le/b/a/y/x/k0;->x:Le/b/a/y/x/p;

    .line 2
    invoke-virtual {p1}, Le/b/a/y/x/p;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/y/x/k0;->h:Le/b/a/y/x/h1/k;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Le/b/a/y/x/k0;->d()Le/b/a/y/x/h1/k;

    move-result-object v0

    .line 3
    :goto_0
    invoke-virtual {v0, p1}, Le/b/a/y/x/h1/k;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c()V
    .locals 3

    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/k0;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 11
    invoke-virtual {p0}, Le/b/a/y/x/k0;->e()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, Le/b/a/e0/r;->a(ZLjava/lang/String;)V

    .line 12
    iget-object v0, p0, Le/b/a/y/x/k0;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Can\'t decrement below 0"

    .line 13
    invoke-static {v1, v2}, Le/b/a/e0/r;->a(ZLjava/lang/String;)V

    if-nez v0, :cond_1

    .line 14
    iget-object v0, p0, Le/b/a/y/x/k0;->w:Le/b/a/y/x/s0;

    .line 15
    invoke-virtual {p0}, Le/b/a/y/x/k0;->i()V

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 16
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    .line 17
    invoke-virtual {v0}, Le/b/a/y/x/s0;->g()V

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    .line 18
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized c(Le/b/a/c0/k;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/k0;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 2
    iget-object v0, p0, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    invoke-virtual {v0, p1}, Le/b/a/y/x/n0;->b(Le/b/a/c0/k;)V

    .line 3
    iget-object p1, p0, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    invoke-virtual {p1}, Le/b/a/y/x/n0;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p0}, Le/b/a/y/x/k0;->b()V

    .line 5
    iget-boolean p1, p0, Le/b/a/y/x/k0;->t:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Le/b/a/y/x/k0;->v:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    .line 6
    iget-object p1, p0, Le/b/a/y/x/k0;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-nez p1, :cond_2

    .line 7
    invoke-virtual {p0}, Le/b/a/y/x/k0;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final d()Le/b/a/y/x/h1/k;
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/y/x/k0;->o:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/b/a/y/x/k0;->j:Le/b/a/y/x/h1/k;

    goto :goto_0

    .line 3
    :cond_0
    iget-boolean v0, p0, Le/b/a/y/x/k0;->p:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Le/b/a/y/x/k0;->k:Le/b/a/y/x/h1/k;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Le/b/a/y/x/k0;->i:Le/b/a/y/x/h1/k;

    :goto_0
    return-object v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/y/x/k0;->v:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Le/b/a/y/x/k0;->t:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Le/b/a/y/x/k0;->y:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public f()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/k0;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 3
    iget-boolean v0, p0, Le/b/a/y/x/k0;->y:Z

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Le/b/a/y/x/k0;->i()V

    .line 5
    monitor-exit p0

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    invoke-virtual {v0}, Le/b/a/y/x/n0;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 7
    iget-boolean v0, p0, Le/b/a/y/x/k0;->v:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Le/b/a/y/x/k0;->v:Z

    .line 9
    iget-object v1, p0, Le/b/a/y/x/k0;->m:Le/b/a/y/n;

    .line 10
    iget-object v2, p0, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    invoke-virtual {v2}, Le/b/a/y/x/n0;->a()Le/b/a/y/x/n0;

    move-result-object v2

    .line 11
    invoke-virtual {v2}, Le/b/a/y/x/n0;->size()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {p0, v3}, Le/b/a/y/x/k0;->a(I)V

    .line 12
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, Le/b/a/y/x/k0;->g:Le/b/a/y/x/o0;

    const/4 v3, 0x0

    invoke-interface {v0, p0, v1, v3}, Le/b/a/y/x/o0;->a(Le/b/a/y/x/k0;Le/b/a/y/n;Le/b/a/y/x/s0;)V

    .line 14
    invoke-virtual {v2}, Le/b/a/y/x/n0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/y/x/m0;

    .line 15
    iget-object v2, v1, Le/b/a/y/x/m0;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Le/b/a/y/x/k0$a;

    iget-object v1, v1, Le/b/a/y/x/m0;->a:Le/b/a/c0/k;

    invoke-direct {v3, p0, v1}, Le/b/a/y/x/k0$a;-><init>(Le/b/a/y/x/k0;Le/b/a/c0/k;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0}, Le/b/a/y/x/k0;->c()V

    return-void

    .line 17
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already failed once"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received an exception without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 19
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public g()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/k0;->c:Le/b/a/e0/u/l;

    invoke-virtual {v0}, Le/b/a/e0/u/l;->a()V

    .line 3
    iget-boolean v0, p0, Le/b/a/y/x/k0;->y:Z

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Le/b/a/y/x/k0;->r:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->d()V

    .line 5
    invoke-virtual {p0}, Le/b/a/y/x/k0;->i()V

    .line 6
    monitor-exit p0

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    invoke-virtual {v0}, Le/b/a/y/x/n0;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 8
    iget-boolean v0, p0, Le/b/a/y/x/k0;->t:Z

    if-nez v0, :cond_2

    .line 9
    iget-object v0, p0, Le/b/a/y/x/k0;->f:Le/b/a/y/x/l0;

    iget-object v1, p0, Le/b/a/y/x/k0;->r:Le/b/a/y/x/y0;

    iget-boolean v2, p0, Le/b/a/y/x/k0;->n:Z

    iget-object v3, p0, Le/b/a/y/x/k0;->m:Le/b/a/y/n;

    iget-object v4, p0, Le/b/a/y/x/k0;->d:Le/b/a/y/x/r0;

    invoke-virtual {v0, v1, v2, v3, v4}, Le/b/a/y/x/l0;->a(Le/b/a/y/x/y0;ZLe/b/a/y/n;Le/b/a/y/x/r0;)Le/b/a/y/x/s0;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/k0;->w:Le/b/a/y/x/s0;

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Le/b/a/y/x/k0;->t:Z

    .line 11
    iget-object v1, p0, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    invoke-virtual {v1}, Le/b/a/y/x/n0;->a()Le/b/a/y/x/n0;

    move-result-object v1

    .line 12
    invoke-virtual {v1}, Le/b/a/y/x/n0;->size()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, Le/b/a/y/x/k0;->a(I)V

    .line 13
    iget-object v0, p0, Le/b/a/y/x/k0;->m:Le/b/a/y/n;

    .line 14
    iget-object v2, p0, Le/b/a/y/x/k0;->w:Le/b/a/y/x/s0;

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v3, p0, Le/b/a/y/x/k0;->g:Le/b/a/y/x/o0;

    invoke-interface {v3, p0, v0, v2}, Le/b/a/y/x/o0;->a(Le/b/a/y/x/k0;Le/b/a/y/n;Le/b/a/y/x/s0;)V

    .line 17
    invoke-virtual {v1}, Le/b/a/y/x/n0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/y/x/m0;

    .line 18
    iget-object v2, v1, Le/b/a/y/x/m0;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Le/b/a/y/x/k0$b;

    iget-object v1, v1, Le/b/a/y/x/m0;->a:Le/b/a/c0/k;

    invoke-direct {v3, p0, v1}, Le/b/a/y/x/k0$b;-><init>(Le/b/a/y/x/k0;Le/b/a/c0/k;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p0}, Le/b/a/y/x/k0;->c()V

    return-void

    .line 20
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already have resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 21
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received a resource without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 22
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/y/x/k0;->q:Z

    return v0
.end method

.method public final declared-synchronized i()V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/k0;->m:Le/b/a/y/n;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    invoke-virtual {v0}, Le/b/a/y/x/n0;->clear()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Le/b/a/y/x/k0;->m:Le/b/a/y/n;

    .line 4
    iput-object v0, p0, Le/b/a/y/x/k0;->w:Le/b/a/y/x/s0;

    .line 5
    iput-object v0, p0, Le/b/a/y/x/k0;->r:Le/b/a/y/x/y0;

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Le/b/a/y/x/k0;->v:Z

    .line 7
    iput-boolean v1, p0, Le/b/a/y/x/k0;->y:Z

    .line 8
    iput-boolean v1, p0, Le/b/a/y/x/k0;->t:Z

    .line 9
    iput-boolean v1, p0, Le/b/a/y/x/k0;->z:Z

    .line 10
    iget-object v2, p0, Le/b/a/y/x/k0;->x:Le/b/a/y/x/p;

    invoke-virtual {v2, v1}, Le/b/a/y/x/p;->a(Z)V

    .line 11
    iput-object v0, p0, Le/b/a/y/x/k0;->x:Le/b/a/y/x/p;

    .line 12
    iput-object v0, p0, Le/b/a/y/x/k0;->u:Lcom/bumptech/glide/load/engine/GlideException;

    .line 13
    iput-object v0, p0, Le/b/a/y/x/k0;->s:Le/b/a/y/a;

    .line 14
    iget-object v0, p0, Le/b/a/y/x/k0;->e:Lc/h/m/d;

    invoke-interface {v0, p0}, Lc/h/m/d;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p0

    return-void

    .line 16
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
