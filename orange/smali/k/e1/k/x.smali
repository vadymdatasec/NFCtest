.class public final Lk/e1/k/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final v:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final b:Z

.field public final c:Lk/e1/k/r;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lk/e1/k/e0;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/String;

.field public f:I

.field public g:I

.field public h:Z

.field public final i:Ljava/util/concurrent/ScheduledExecutorService;

.field public final j:Ljava/util/concurrent/ExecutorService;

.field public final k:Lk/e1/k/j0;

.field public l:Z

.field public m:J

.field public n:J

.field public o:Lk/e1/k/k0;

.field public final p:Lk/e1/k/k0;

.field public q:Z

.field public final r:Ljava/net/Socket;

.field public final s:Lk/e1/k/f0;

.field public final t:Lk/e1/k/w;

.field public final u:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 1
    const-class v0, Lk/e1/k/x;

    .line 2
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v1, 0x1

    const-string v8, "OkHttp Http2Connection"

    .line 3
    invoke-static {v8, v1}, Lk/e1/e;->a(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lk/e1/k/x;->v:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Lk/e1/k/p;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, Lk/e1/k/x;->d:Ljava/util/Map;

    const-wide/16 v2, 0x0

    .line 3
    iput-wide v2, v0, Lk/e1/k/x;->m:J

    .line 4
    new-instance v2, Lk/e1/k/k0;

    invoke-direct {v2}, Lk/e1/k/k0;-><init>()V

    iput-object v2, v0, Lk/e1/k/x;->o:Lk/e1/k/k0;

    .line 5
    new-instance v2, Lk/e1/k/k0;

    invoke-direct {v2}, Lk/e1/k/k0;-><init>()V

    iput-object v2, v0, Lk/e1/k/x;->p:Lk/e1/k/k0;

    const/4 v2, 0x0

    .line 6
    iput-boolean v2, v0, Lk/e1/k/x;->q:Z

    .line 7
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v3, v0, Lk/e1/k/x;->u:Ljava/util/Set;

    .line 8
    iget-object v3, v1, Lk/e1/k/p;->f:Lk/e1/k/j0;

    iput-object v3, v0, Lk/e1/k/x;->k:Lk/e1/k/j0;

    .line 9
    iget-boolean v3, v1, Lk/e1/k/p;->g:Z

    iput-boolean v3, v0, Lk/e1/k/x;->b:Z

    .line 10
    iget-object v4, v1, Lk/e1/k/p;->e:Lk/e1/k/r;

    iput-object v4, v0, Lk/e1/k/x;->c:Lk/e1/k/r;

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    .line 11
    :goto_0
    iput v3, v0, Lk/e1/k/x;->g:I

    .line 12
    iget-boolean v6, v1, Lk/e1/k/p;->g:Z

    if-eqz v6, :cond_1

    add-int/2addr v3, v4

    .line 13
    iput v3, v0, Lk/e1/k/x;->g:I

    .line 14
    :cond_1
    iget-boolean v3, v1, Lk/e1/k/p;->g:Z

    const/4 v4, 0x7

    if-eqz v3, :cond_2

    .line 15
    iget-object v3, v0, Lk/e1/k/x;->o:Lk/e1/k/k0;

    const/high16 v6, 0x1000000

    invoke-virtual {v3, v4, v6}, Lk/e1/k/k0;->a(II)Lk/e1/k/k0;

    .line 16
    :cond_2
    iget-object v3, v1, Lk/e1/k/p;->b:Ljava/lang/String;

    iput-object v3, v0, Lk/e1/k/x;->e:Ljava/lang/String;

    .line 17
    new-instance v6, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-array v3, v5, [Ljava/lang/Object;

    iget-object v7, v0, Lk/e1/k/x;->e:Ljava/lang/String;

    aput-object v7, v3, v2

    const-string v7, "OkHttp %s Writer"

    .line 18
    invoke-static {v7, v3}, Lk/e1/e;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lk/e1/e;->a(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v3

    invoke-direct {v6, v5, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iput-object v6, v0, Lk/e1/k/x;->i:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    iget v3, v1, Lk/e1/k/p;->h:I

    if-eqz v3, :cond_3

    .line 20
    new-instance v7, Lk/e1/k/s;

    invoke-direct {v7, v0, v2, v2, v2}, Lk/e1/k/s;-><init>(Lk/e1/k/x;ZII)V

    iget v3, v1, Lk/e1/k/p;->h:I

    int-to-long v8, v3

    int-to-long v10, v3

    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v6 .. v12}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 21
    :cond_3
    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v14, 0x0

    const/4 v15, 0x1

    const-wide/16 v16, 0x3c

    sget-object v18, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v19, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct/range {v19 .. v19}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-array v6, v5, [Ljava/lang/Object;

    iget-object v7, v0, Lk/e1/k/x;->e:Ljava/lang/String;

    aput-object v7, v6, v2

    const-string v2, "OkHttp %s Push Observer"

    .line 22
    invoke-static {v2, v6}, Lk/e1/e;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lk/e1/e;->a(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;

    move-result-object v20

    move-object v13, v3

    invoke-direct/range {v13 .. v20}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v3, v0, Lk/e1/k/x;->j:Ljava/util/concurrent/ExecutorService;

    .line 23
    iget-object v2, v0, Lk/e1/k/x;->p:Lk/e1/k/k0;

    const v3, 0xffff

    invoke-virtual {v2, v4, v3}, Lk/e1/k/k0;->a(II)Lk/e1/k/k0;

    .line 24
    iget-object v2, v0, Lk/e1/k/x;->p:Lk/e1/k/k0;

    const/4 v3, 0x5

    const/16 v4, 0x4000

    invoke-virtual {v2, v3, v4}, Lk/e1/k/k0;->a(II)Lk/e1/k/k0;

    .line 25
    iget-object v2, v0, Lk/e1/k/x;->p:Lk/e1/k/k0;

    invoke-virtual {v2}, Lk/e1/k/k0;->c()I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, v0, Lk/e1/k/x;->n:J

    .line 26
    iget-object v2, v1, Lk/e1/k/p;->a:Ljava/net/Socket;

    iput-object v2, v0, Lk/e1/k/x;->r:Ljava/net/Socket;

    .line 27
    new-instance v2, Lk/e1/k/f0;

    iget-object v3, v1, Lk/e1/k/p;->d:Ll/g;

    iget-boolean v4, v0, Lk/e1/k/x;->b:Z

    invoke-direct {v2, v3, v4}, Lk/e1/k/f0;-><init>(Ll/g;Z)V

    iput-object v2, v0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    .line 28
    new-instance v2, Lk/e1/k/w;

    new-instance v3, Lk/e1/k/a0;

    iget-object v1, v1, Lk/e1/k/p;->c:Ll/h;

    iget-boolean v4, v0, Lk/e1/k/x;->b:Z

    invoke-direct {v3, v1, v4}, Lk/e1/k/a0;-><init>(Ll/h;Z)V

    invoke-direct {v2, v0, v3}, Lk/e1/k/w;-><init>(Lk/e1/k/x;Lk/e1/k/a0;)V

    iput-object v2, v0, Lk/e1/k/x;->t:Lk/e1/k/w;

    return-void
.end method

.method public static synthetic a(Lk/e1/k/x;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lk/e1/k/x;->c()V

    return-void
.end method

.method public static synthetic a(Lk/e1/k/x;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lk/e1/k/x;->l:Z

    return p1
.end method

.method public static synthetic b(Lk/e1/k/x;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lk/e1/k/x;->i:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static synthetic o()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    sget-object v0, Lk/e1/k/x;->v:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(I)Lk/e1/k/e0;
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk/e1/k/e0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(ILjava/util/List;Z)Lk/e1/k/e0;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lk/e1/k/c;",
            ">;Z)",
            "Lk/e1/k/e0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    xor-int/lit8 v6, p3, 0x1

    const/4 v4, 0x0

    .line 5
    iget-object v7, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    monitor-enter v7

    .line 6
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    :try_start_1
    iget v0, p0, Lk/e1/k/x;->g:I

    const v1, 0x3fffffff    # 1.9999999f

    if-le v0, v1, :cond_0

    .line 8
    sget-object v0, Lk/e1/k/a;->g:Lk/e1/k/a;

    invoke-virtual {p0, v0}, Lk/e1/k/x;->a(Lk/e1/k/a;)V

    .line 9
    :cond_0
    iget-boolean v0, p0, Lk/e1/k/x;->h:Z

    if-nez v0, :cond_7

    .line 10
    iget v8, p0, Lk/e1/k/x;->g:I

    .line 11
    iget v0, p0, Lk/e1/k/x;->g:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lk/e1/k/x;->g:I

    .line 12
    new-instance v9, Lk/e1/k/e0;

    const/4 v5, 0x0

    move-object v0, v9

    move v1, v8

    move-object v2, p0

    move v3, v6

    invoke-direct/range {v0 .. v5}, Lk/e1/k/e0;-><init>(ILk/e1/k/x;ZZLk/d0;)V

    if-eqz p3, :cond_2

    .line 13
    iget-wide v0, p0, Lk/e1/k/x;->n:J

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-eqz p3, :cond_2

    iget-wide v0, v9, Lk/e1/k/e0;->b:J

    cmp-long p3, v0, v2

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p3, 0x1

    .line 14
    :goto_1
    invoke-virtual {v9}, Lk/e1/k/e0;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 15
    iget-object v0, p0, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_4

    .line 17
    :try_start_2
    iget-object v0, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {v0, v6, v8, p1, p2}, Lk/e1/k/f0;->a(ZIILjava/util/List;)V

    goto :goto_2

    .line 18
    :cond_4
    iget-boolean v0, p0, Lk/e1/k/x;->b:Z

    if-nez v0, :cond_6

    .line 19
    iget-object v0, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {v0, p1, v8, p2}, Lk/e1/k/f0;->a(IILjava/util/List;)V

    .line 20
    :goto_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p3, :cond_5

    .line 21
    iget-object p1, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {p1}, Lk/e1/k/f0;->flush()V

    :cond_5
    return-object v9

    .line 22
    :cond_6
    :try_start_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "client streams shouldn\'t have associated stream IDs"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 23
    :cond_7
    :try_start_4
    new-instance p1, Lokhttp3/internal/http2/ConnectionShutdownException;

    invoke-direct {p1}, Lokhttp3/internal/http2/ConnectionShutdownException;-><init>()V

    throw p1

    :catchall_0
    move-exception p1

    .line 24
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1

    :catchall_1
    move-exception p1

    .line 25
    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public a(Ljava/util/List;Z)Lk/e1/k/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lk/e1/k/c;",
            ">;Z)",
            "Lk/e1/k/e0;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0, p1, p2}, Lk/e1/k/x;->a(ILjava/util/List;Z)Lk/e1/k/e0;

    move-result-object p1

    return-object p1
.end method

.method public a(IJ)V
    .locals 9

    .line 40
    :try_start_0
    iget-object v0, p0, Lk/e1/k/x;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v8, Lk/e1/k/k;

    const-string v3, "OkHttp Window Update %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lk/e1/k/x;->e:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v8

    move-object v2, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v1 .. v7}, Lk/e1/k/k;-><init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;IJ)V

    .line 42
    invoke-interface {v0, v8}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public a(ILjava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lk/e1/k/c;",
            ">;)V"
        }
    .end annotation

    .line 81
    monitor-enter p0

    .line 82
    :try_start_0
    iget-object v0, p0, Lk/e1/k/x;->u:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    sget-object p2, Lk/e1/k/a;->d:Lk/e1/k/a;

    invoke-virtual {p0, p1, p2}, Lk/e1/k/x;->c(ILk/e1/k/a;)V

    .line 84
    monitor-exit p0

    return-void

    .line 85
    :cond_0
    iget-object v0, p0, Lk/e1/k/x;->u:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 86
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    :try_start_1
    new-instance v0, Lk/e1/k/l;

    const-string v4, "OkHttp %s Push Request[%s]"

    const/4 v1, 0x2

    new-array v5, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lk/e1/k/x;->e:Ljava/lang/String;

    aput-object v2, v5, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v1

    move-object v2, v0

    move-object v3, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v2 .. v7}, Lk/e1/k/l;-><init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;)V

    invoke-virtual {p0, v0}, Lk/e1/k/x;->a(Lk/e1/b;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception p1

    .line 88
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public a(ILk/e1/k/a;)V
    .locals 7

    .line 95
    new-instance v6, Lk/e1/k/o;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    iget-object v0, p0, Lk/e1/k/x;->e:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v0, v3, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v2, "OkHttp %s Push Reset[%s]"

    move-object v0, v6

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lk/e1/k/o;-><init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;ILk/e1/k/a;)V

    invoke-virtual {p0, v6}, Lk/e1/k/x;->a(Lk/e1/b;)V

    return-void
.end method

.method public a(ILl/h;IZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 89
    new-instance v5, Ll/f;

    invoke-direct {v5}, Ll/f;-><init>()V

    int-to-long v0, p3

    .line 90
    invoke-interface {p2, v0, v1}, Ll/h;->d(J)V

    .line 91
    invoke-interface {p2, v5, v0, v1}, Ll/y;->b(Ll/f;J)J

    .line 92
    invoke-virtual {v5}, Ll/f;->q()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-nez p2, :cond_0

    .line 93
    new-instance p2, Lk/e1/k/n;

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Lk/e1/k/x;->e:Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    const-string v2, "OkHttp %s Push Data[%s]"

    move-object v0, p2

    move-object v1, p0

    move v4, p1

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lk/e1/k/n;-><init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;ILl/f;IZ)V

    invoke-virtual {p0, p2}, Lk/e1/k/x;->a(Lk/e1/b;)V

    return-void

    .line 94
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ll/f;->q()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p4, " != "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(IZLl/f;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p4, v1

    if-nez v3, :cond_0

    .line 26
    iget-object p4, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {p4, p2, p1, p3, v0}, Lk/e1/k/f0;->a(ZILl/f;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v3, p4, v1

    if-lez v3, :cond_4

    .line 27
    monitor-enter p0

    .line 28
    :goto_1
    :try_start_0
    iget-wide v3, p0, Lk/e1/k/x;->n:J

    cmp-long v5, v3, v1

    if-gtz v5, :cond_2

    .line 29
    iget-object v3, p0, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    .line 31
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :cond_2
    :try_start_1
    iget-wide v3, p0, Lk/e1/k/x;->n:J

    invoke-static {p4, p5, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    .line 33
    iget-object v3, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {v3}, Lk/e1/k/f0;->l()I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 34
    iget-wide v4, p0, Lk/e1/k/x;->n:J

    int-to-long v6, v3

    sub-long/2addr v4, v6

    iput-wide v4, p0, Lk/e1/k/x;->n:J

    .line 35
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-long/2addr p4, v6

    .line 36
    iget-object v4, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v1

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v3}, Lk/e1/k/f0;->a(ZILl/f;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 37
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 38
    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1

    .line 39
    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_4
    return-void
.end method

.method public final declared-synchronized a(Lk/e1/b;)V
    .locals 1

    monitor-enter p0

    .line 96
    :try_start_0
    invoke-virtual {p0}, Lk/e1/k/x;->l()Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lk/e1/k/x;->j:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Lk/e1/k/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    monitor-enter v0

    .line 52
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 53
    :try_start_1
    iget-boolean v1, p0, Lk/e1/k/x;->h:Z

    if-eqz v1, :cond_0

    .line 54
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 55
    :try_start_3
    iput-boolean v1, p0, Lk/e1/k/x;->h:Z

    .line 56
    iget v1, p0, Lk/e1/k/x;->f:I

    .line 57
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    :try_start_4
    iget-object v2, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    sget-object v3, Lk/e1/e;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lk/e1/k/f0;->a(ILk/e1/k/a;[B)V

    .line 59
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    .line 60
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1

    :catchall_1
    move-exception p1

    .line 61
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    throw p1
.end method

.method public a(Lk/e1/k/a;Lk/e1/k/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 62
    :try_start_0
    invoke-virtual {p0, p1}, Lk/e1/k/x;->a(Lk/e1/k/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, v0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 63
    :goto_0
    monitor-enter p0

    .line 64
    :try_start_1
    iget-object v1, p0, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 65
    iget-object v0, p0, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Lk/e1/k/e0;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk/e1/k/e0;

    .line 66
    iget-object v1, p0, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 67
    :cond_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    .line 68
    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 69
    :try_start_2
    invoke-virtual {v3, p2}, Lk/e1/k/e0;->a(Lk/e1/k/a;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception v3

    if-eqz p1, :cond_1

    move-object p1, v3

    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 70
    :cond_2
    :try_start_3
    iget-object p2, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {p2}, Lk/e1/k/f0;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_3

    :catch_2
    move-exception p2

    if-nez p1, :cond_3

    move-object p1, p2

    .line 71
    :cond_3
    :goto_3
    :try_start_4
    iget-object p2, p0, Lk/e1/k/x;->r:Ljava/net/Socket;

    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_4

    :catch_3
    move-exception p1

    .line 72
    :goto_4
    iget-object p2, p0, Lk/e1/k/x;->i:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p2}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 73
    iget-object p2, p0, Lk/e1/k/x;->j:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    if-nez p1, :cond_4

    return-void

    .line 74
    :cond_4
    throw p1

    :catchall_0
    move-exception p1

    .line 75
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public a(Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 76
    iget-object p1, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {p1}, Lk/e1/k/f0;->c()V

    .line 77
    iget-object p1, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    iget-object v0, p0, Lk/e1/k/x;->o:Lk/e1/k/k0;

    invoke-virtual {p1, v0}, Lk/e1/k/f0;->b(Lk/e1/k/k0;)V

    .line 78
    iget-object p1, p0, Lk/e1/k/x;->o:Lk/e1/k/k0;

    invoke-virtual {p1}, Lk/e1/k/k0;->c()I

    move-result p1

    const v0, 0xffff

    if-eq p1, v0, :cond_0

    .line 79
    iget-object v1, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    const/4 v2, 0x0

    sub-int/2addr p1, v0

    int-to-long v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lk/e1/k/f0;->a(IJ)V

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/Thread;

    iget-object v0, p0, Lk/e1/k/x;->t:Lk/e1/k/w;

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public a(ZII)V
    .locals 2

    if-nez p1, :cond_0

    .line 43
    monitor-enter p0

    .line 44
    :try_start_0
    iget-boolean v0, p0, Lk/e1/k/x;->l:Z

    const/4 v1, 0x1

    .line 45
    iput-boolean v1, p0, Lk/e1/k/x;->l:Z

    .line 46
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 47
    invoke-virtual {p0}, Lk/e1/k/x;->c()V

    return-void

    :catchall_0
    move-exception p1

    .line 48
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 49
    :cond_0
    :try_start_2
    iget-object v0, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {v0, p1, p2, p3}, Lk/e1/k/f0;->a(ZII)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 50
    :catch_0
    invoke-virtual {p0}, Lk/e1/k/x;->c()V

    :goto_0
    return-void
.end method

.method public b(ILjava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lk/e1/k/c;",
            ">;Z)V"
        }
    .end annotation

    .line 3
    :try_start_0
    new-instance v7, Lk/e1/k/m;

    const-string v2, "OkHttp %s Push Headers[%s]"

    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/Object;

    const/4 v0, 0x0

    iget-object v1, p0, Lk/e1/k/x;->e:Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v0, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v3, v0

    move-object v0, v7

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lk/e1/k/m;-><init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;ILjava/util/List;Z)V

    invoke-virtual {p0, v7}, Lk/e1/k/x;->a(Lk/e1/b;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public b(ILk/e1/k/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {v0, p1, p2}, Lk/e1/k/f0;->a(ILk/e1/k/a;)V

    return-void
.end method

.method public b(I)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public declared-synchronized c(I)Lk/e1/k/e0;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk/e1/k/e0;

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final c()V
    .locals 2

    .line 5
    :try_start_0
    sget-object v0, Lk/e1/k/a;->d:Lk/e1/k/a;

    sget-object v1, Lk/e1/k/a;->d:Lk/e1/k/a;

    invoke-virtual {p0, v0, v1}, Lk/e1/k/x;->a(Lk/e1/k/a;Lk/e1/k/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public c(ILk/e1/k/a;)V
    .locals 8

    .line 4
    :try_start_0
    iget-object v0, p0, Lk/e1/k/x;->i:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v7, Lk/e1/k/j;

    const-string v3, "OkHttp %s stream %d"

    const/4 v1, 0x2

    new-array v4, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lk/e1/k/x;->e:Ljava/lang/String;

    aput-object v2, v4, v1

    const/4 v1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    move-object v1, v7

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lk/e1/k/j;-><init>(Lk/e1/k/x;Ljava/lang/String;[Ljava/lang/Object;ILk/e1/k/a;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lk/e1/k/a;->c:Lk/e1/k/a;

    sget-object v1, Lk/e1/k/a;->h:Lk/e1/k/a;

    invoke-virtual {p0, v0, v1}, Lk/e1/k/x;->a(Lk/e1/k/a;Lk/e1/k/a;)V

    return-void
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/e1/k/x;->s:Lk/e1/k/f0;

    invoke-virtual {v0}, Lk/e1/k/f0;->flush()V

    return-void
.end method

.method public declared-synchronized g(J)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-wide v0, p0, Lk/e1/k/x;->m:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lk/e1/k/x;->m:J

    .line 2
    iget-object p1, p0, Lk/e1/k/x;->o:Lk/e1/k/k0;

    invoke-virtual {p1}, Lk/e1/k/k0;->c()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long v2, v0, p1

    if-ltz v2, :cond_0

    const/4 p1, 0x0

    .line 3
    iget-wide v0, p0, Lk/e1/k/x;->m:J

    invoke-virtual {p0, p1, v0, v1}, Lk/e1/k/x;->a(IJ)V

    const-wide/16 p1, 0x0

    .line 4
    iput-wide p1, p0, Lk/e1/k/x;->m:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized l()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lk/e1/k/x;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized m()I
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lk/e1/k/x;->p:Lk/e1/k/k0;

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Lk/e1/k/k0;->b(I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public n()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lk/e1/k/x;->a(Z)V

    return-void
.end method
