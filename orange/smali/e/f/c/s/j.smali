.class public Le/f/c/s/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/s/k;


# static fields
.field public static final l:Ljava/lang/Object;

.field public static final m:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final a:Le/f/c/h;

.field public final b:Le/f/c/s/u/g;

.field public final c:Le/f/c/s/t/f;

.field public final d:Le/f/c/s/s;

.field public final e:Le/f/c/s/t/d;

.field public final f:Le/f/c/s/q;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/ExecutorService;

.field public final i:Ljava/util/concurrent/ExecutorService;

.field public j:Ljava/lang/String;

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f/c/s/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le/f/c/s/j;->l:Ljava/lang/Object;

    .line 2
    new-instance v0, Le/f/c/s/h;

    invoke-direct {v0}, Le/f/c/s/h;-><init>()V

    sput-object v0, Le/f/c/s/j;->m:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method public constructor <init>(Le/f/c/h;Le/f/c/v/h;Le/f/c/p/d;)V
    .locals 9

    .line 1
    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sget-object v7, Le/f/c/s/j;->m:Ljava/util/concurrent/ThreadFactory;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/16 v3, 0x1e

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    new-instance v3, Le/f/c/s/u/g;

    .line 2
    invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, v0, p2, p3}, Le/f/c/s/u/g;-><init>(Landroid/content/Context;Le/f/c/v/h;Le/f/c/p/d;)V

    new-instance v4, Le/f/c/s/t/f;

    invoke-direct {v4, p1}, Le/f/c/s/t/f;-><init>(Le/f/c/h;)V

    new-instance v5, Le/f/c/s/s;

    invoke-direct {v5}, Le/f/c/s/s;-><init>()V

    new-instance v6, Le/f/c/s/t/d;

    invoke-direct {v6, p1}, Le/f/c/s/t/d;-><init>(Le/f/c/h;)V

    new-instance v7, Le/f/c/s/q;

    invoke-direct {v7}, Le/f/c/s/q;-><init>()V

    move-object v0, p0

    move-object v1, v8

    move-object v2, p1

    .line 3
    invoke-direct/range {v0 .. v7}, Le/f/c/s/j;-><init>(Ljava/util/concurrent/ExecutorService;Le/f/c/h;Le/f/c/s/u/g;Le/f/c/s/t/f;Le/f/c/s/s;Le/f/c/s/t/d;Le/f/c/s/q;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Le/f/c/h;Le/f/c/s/u/g;Le/f/c/s/t/f;Le/f/c/s/s;Le/f/c/s/t/d;Le/f/c/s/q;)V
    .locals 10

    move-object v0, p0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Le/f/c/s/j;->g:Ljava/lang/Object;

    .line 6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Le/f/c/s/j;->k:Ljava/util/List;

    move-object v1, p2

    .line 7
    iput-object v1, v0, Le/f/c/s/j;->a:Le/f/c/h;

    move-object v1, p3

    .line 8
    iput-object v1, v0, Le/f/c/s/j;->b:Le/f/c/s/u/g;

    move-object v1, p4

    .line 9
    iput-object v1, v0, Le/f/c/s/j;->c:Le/f/c/s/t/f;

    move-object v1, p5

    .line 10
    iput-object v1, v0, Le/f/c/s/j;->d:Le/f/c/s/s;

    move-object/from16 v1, p6

    .line 11
    iput-object v1, v0, Le/f/c/s/j;->e:Le/f/c/s/t/d;

    move-object/from16 v1, p7

    .line 12
    iput-object v1, v0, Le/f/c/s/j;->f:Le/f/c/s/q;

    move-object v1, p1

    .line 13
    iput-object v1, v0, Le/f/c/s/j;->h:Ljava/util/concurrent/ExecutorService;

    .line 14
    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sget-object v8, Le/f/c/s/j;->m:Ljava/util/concurrent/ThreadFactory;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-wide/16 v4, 0x1e

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v9, v0, Le/f/c/s/j;->i:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic a(Le/f/c/s/j;)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Le/f/c/s/j;->c(Z)V

    return-void
.end method

.method public static synthetic a(Le/f/c/s/j;Z)V
    .locals 0

    .line 22
    invoke-virtual {p0, p1}, Le/f/c/s/j;->b(Z)V

    return-void
.end method

.method public static synthetic b(Le/f/c/s/j;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/f/c/s/j;->c(Z)V

    return-void
.end method


# virtual methods
.method public a()Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/c/s/j;->j()V

    .line 2
    invoke-virtual {p0}, Le/f/c/s/j;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {v0}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    invoke-virtual {p0}, Le/f/c/s/j;->c()Le/f/a/b/h/g;

    move-result-object v0

    .line 5
    iget-object v1, p0, Le/f/c/s/j;->h:Ljava/util/concurrent/ExecutorService;

    invoke-static {p0}, Le/f/c/s/e;->a(Le/f/c/s/j;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public a(Z)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Le/f/a/b/h/g<",
            "Le/f/c/s/p;",
            ">;"
        }
    .end annotation

    .line 7
    invoke-virtual {p0}, Le/f/c/s/j;->j()V

    .line 8
    invoke-virtual {p0}, Le/f/c/s/j;->b()Le/f/a/b/h/g;

    move-result-object v0

    .line 9
    iget-object v1, p0, Le/f/c/s/j;->h:Ljava/util/concurrent/ExecutorService;

    invoke-static {p0, p1}, Le/f/c/s/f;->a(Le/f/c/s/j;Z)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final a(Le/f/c/s/t/h;)Le/f/c/s/t/h;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/firebase/installations/FirebaseInstallationsException;
        }
    .end annotation

    .line 23
    iget-object v0, p0, Le/f/c/s/j;->b:Le/f/c/s/u/g;

    .line 24
    invoke-virtual {p0}, Le/f/c/s/j;->d()Ljava/lang/String;

    move-result-object v1

    .line 25
    invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;

    move-result-object v2

    .line 26
    invoke-virtual {p0}, Le/f/c/s/j;->i()Ljava/lang/String;

    move-result-object v3

    .line 27
    invoke-virtual {p1}, Le/f/c/s/t/h;->e()Ljava/lang/String;

    move-result-object v4

    .line 28
    invoke-virtual {v0, v1, v2, v3, v4}, Le/f/c/s/u/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/c/s/u/m;

    move-result-object v0

    .line 29
    sget-object v1, Le/f/c/s/i;->b:[I

    invoke-virtual {v0}, Le/f/c/s/u/m;->a()Le/f/c/s/u/l;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, v0}, Le/f/c/s/j;->a(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Le/f/c/s/t/h;->o()Le/f/c/s/t/h;

    move-result-object p1

    return-object p1

    .line 32
    :cond_0
    new-instance p1, Lcom/google/firebase/installations/FirebaseInstallationsException;

    sget-object v0, Lcom/google/firebase/installations/FirebaseInstallationsException$a;->c:Lcom/google/firebase/installations/FirebaseInstallationsException$a;

    const-string v1, "Firebase Installations Service is unavailable. Please try again later."

    invoke-direct {p1, v1, v0}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V

    throw p1

    :cond_1
    const-string v0, "BAD CONFIG"

    .line 33
    invoke-virtual {p1, v0}, Le/f/c/s/t/h;->a(Ljava/lang/String;)Le/f/c/s/t/h;

    move-result-object p1

    return-object p1

    .line 34
    :cond_2
    invoke-virtual {v0}, Le/f/c/s/u/m;->b()Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-virtual {v0}, Le/f/c/s/u/m;->c()J

    move-result-wide v2

    iget-object v0, p0, Le/f/c/s/j;->d:Le/f/c/s/s;

    .line 36
    invoke-virtual {v0}, Le/f/c/s/s;->a()J

    move-result-wide v4

    move-object v0, p1

    .line 37
    invoke-virtual/range {v0 .. v5}, Le/f/c/s/t/h;->a(Ljava/lang/String;JJ)Le/f/c/s/t/h;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/f/c/s/r;)V
    .locals 2

    .line 10
    iget-object v0, p0, Le/f/c/s/j;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Le/f/c/s/j;->k:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Le/f/c/s/t/h;Ljava/lang/Exception;)V
    .locals 3

    .line 13
    iget-object v0, p0, Le/f/c/s/j;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v1, p0, Le/f/c/s/j;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/c/s/r;

    .line 17
    invoke-interface {v2, p1, p2}, Le/f/c/s/r;->a(Le/f/c/s/t/h;Ljava/lang/Exception;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 19
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 20
    :try_start_0
    iput-object p1, p0, Le/f/c/s/j;->j:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b()Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Le/f/c/s/p;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/f/a/b/h/h;

    invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V

    .line 3
    new-instance v1, Le/f/c/s/m;

    iget-object v2, p0, Le/f/c/s/j;->d:Le/f/c/s/s;

    invoke-direct {v1, v2, v0}, Le/f/c/s/m;-><init>(Le/f/c/s/s;Le/f/a/b/h/h;)V

    .line 4
    invoke-virtual {p0, v1}, Le/f/c/s/j;->a(Le/f/c/s/r;)V

    .line 5
    invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method

.method public final b(Le/f/c/s/t/h;)V
    .locals 3

    .line 20
    sget-object v0, Le/f/c/s/j;->l:Ljava/lang/Object;

    monitor-enter v0

    .line 21
    :try_start_0
    iget-object v1, p0, Le/f/c/s/j;->a:Le/f/c/h;

    .line 22
    invoke-virtual {v1}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Le/f/c/s/d;->a(Landroid/content/Context;Ljava/lang/String;)Le/f/c/s/d;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    :try_start_1
    iget-object v2, p0, Le/f/c/s/j;->c:Le/f/c/s/t/f;

    invoke-virtual {v2, p1}, Le/f/c/s/t/f;->a(Le/f/c/s/t/h;)Le/f/c/s/t/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    .line 24
    :try_start_2
    invoke-virtual {v1}, Le/f/c/s/d;->a()V

    .line 25
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_1

    .line 26
    invoke-virtual {v1}, Le/f/c/s/d;->a()V

    .line 27
    :cond_1
    throw p1

    :catchall_1
    move-exception p1

    .line 28
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final b(Z)V
    .locals 2

    .line 6
    invoke-virtual {p0}, Le/f/c/s/j;->g()Le/f/c/s/t/h;

    move-result-object v0

    .line 7
    :try_start_0
    invoke-virtual {v0}, Le/f/c/s/t/h;->h()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Le/f/c/s/t/h;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p1, :cond_2

    .line 8
    iget-object p1, p0, Le/f/c/s/j;->d:Le/f/c/s/s;

    invoke-virtual {p1, v0}, Le/f/c/s/s;->a(Le/f/c/s/t/h;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 9
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Le/f/c/s/j;->a(Le/f/c/s/t/h;)Le/f/c/s/t/h;

    move-result-object p1

    goto :goto_2

    .line 10
    :cond_3
    :goto_1
    invoke-virtual {p0, v0}, Le/f/c/s/j;->d(Le/f/c/s/t/h;)Le/f/c/s/t/h;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/firebase/installations/FirebaseInstallationsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :goto_2
    invoke-virtual {p0, p1}, Le/f/c/s/j;->b(Le/f/c/s/t/h;)V

    .line 12
    invoke-virtual {p1}, Le/f/c/s/t/h;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 13
    invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Le/f/c/s/j;->a(Ljava/lang/String;)V

    .line 14
    :cond_4
    invoke-virtual {p1}, Le/f/c/s/t/h;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 15
    new-instance v0, Lcom/google/firebase/installations/FirebaseInstallationsException;

    sget-object v1, Lcom/google/firebase/installations/FirebaseInstallationsException$a;->b:Lcom/google/firebase/installations/FirebaseInstallationsException$a;

    invoke-direct {v0, v1}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V

    invoke-virtual {p0, p1, v0}, Le/f/c/s/j;->a(Le/f/c/s/t/h;Ljava/lang/Exception;)V

    goto :goto_3

    .line 16
    :cond_5
    invoke-virtual {p1}, Le/f/c/s/t/h;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 17
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Le/f/c/s/j;->a(Le/f/c/s/t/h;Ljava/lang/Exception;)V

    goto :goto_3

    .line 18
    :cond_6
    invoke-virtual {p0, p1}, Le/f/c/s/j;->e(Le/f/c/s/t/h;)V

    :goto_3
    return-void

    :catch_0
    move-exception p1

    .line 19
    invoke-virtual {p0, v0, p1}, Le/f/c/s/j;->a(Le/f/c/s/t/h;Ljava/lang/Exception;)V

    return-void
.end method

.method public final c()Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/a/b/h/h;

    invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V

    .line 2
    new-instance v1, Le/f/c/s/n;

    invoke-direct {v1, v0}, Le/f/c/s/n;-><init>(Le/f/a/b/h/h;)V

    .line 3
    invoke-virtual {p0, v1}, Le/f/c/s/j;->a(Le/f/c/s/r;)V

    .line 4
    invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method

.method public final c(Le/f/c/s/t/h;)Ljava/lang/String;
    .locals 2

    .line 9
    iget-object v0, p0, Le/f/c/s/j;->a:Le/f/c/h;

    invoke-virtual {v0}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CHIME_ANDROID_SDK"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Le/f/c/s/j;->a:Le/f/c/h;

    invoke-virtual {v0}, Le/f/c/h;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    :cond_0
    invoke-virtual {p1}, Le/f/c/s/t/h;->l()Z

    move-result p1

    if-nez p1, :cond_2

    .line 11
    :cond_1
    iget-object p1, p0, Le/f/c/s/j;->f:Le/f/c/s/q;

    invoke-virtual {p1}, Le/f/c/s/q;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 12
    :cond_2
    iget-object p1, p0, Le/f/c/s/j;->e:Le/f/c/s/t/d;

    invoke-virtual {p1}, Le/f/c/s/t/d;->a()Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 14
    iget-object p1, p0, Le/f/c/s/j;->f:Le/f/c/s/q;

    invoke-virtual {p1}, Le/f/c/s/q;->a()Ljava/lang/String;

    move-result-object p1

    :cond_3
    return-object p1
.end method

.method public final c(Z)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Le/f/c/s/j;->h()Le/f/c/s/t/h;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {v0}, Le/f/c/s/t/h;->n()Le/f/c/s/t/h;

    move-result-object v0

    .line 7
    :cond_0
    invoke-virtual {p0, v0}, Le/f/c/s/j;->e(Le/f/c/s/t/h;)V

    .line 8
    iget-object v0, p0, Le/f/c/s/j;->i:Ljava/util/concurrent/ExecutorService;

    invoke-static {p0, p1}, Le/f/c/s/g;->a(Le/f/c/s/j;Z)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Le/f/c/s/t/h;)Le/f/c/s/t/h;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/firebase/installations/FirebaseInstallationsException;
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Le/f/c/s/j;->e:Le/f/c/s/t/d;

    invoke-virtual {v0}, Le/f/c/s/t/d;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v6, v0

    .line 5
    iget-object v1, p0, Le/f/c/s/j;->b:Le/f/c/s/u/g;

    .line 6
    invoke-virtual {p0}, Le/f/c/s/j;->d()Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-virtual {p1}, Le/f/c/s/t/h;->c()Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-virtual {p0}, Le/f/c/s/j;->i()Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-virtual {p0}, Le/f/c/s/j;->e()Ljava/lang/String;

    move-result-object v5

    .line 10
    invoke-virtual/range {v1 .. v6}, Le/f/c/s/u/g;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/c/s/u/j;

    move-result-object v0

    .line 11
    sget-object v1, Le/f/c/s/i;->a:[I

    invoke-virtual {v0}, Le/f/c/s/u/j;->d()Le/f/c/s/u/i;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    const-string v0, "BAD CONFIG"

    .line 12
    invoke-virtual {p1, v0}, Le/f/c/s/t/h;->a(Ljava/lang/String;)Le/f/c/s/t/h;

    move-result-object p1

    return-object p1

    .line 13
    :cond_1
    new-instance p1, Lcom/google/firebase/installations/FirebaseInstallationsException;

    sget-object v0, Lcom/google/firebase/installations/FirebaseInstallationsException$a;->c:Lcom/google/firebase/installations/FirebaseInstallationsException$a;

    const-string v1, "Firebase Installations Service is unavailable. Please try again later."

    invoke-direct {p1, v1, v0}, Lcom/google/firebase/installations/FirebaseInstallationsException;-><init>(Ljava/lang/String;Lcom/google/firebase/installations/FirebaseInstallationsException$a;)V

    throw p1

    .line 14
    :cond_2
    invoke-virtual {v0}, Le/f/c/s/u/j;->b()Ljava/lang/String;

    move-result-object v3

    .line 15
    invoke-virtual {v0}, Le/f/c/s/u/j;->c()Ljava/lang/String;

    move-result-object v4

    iget-object v1, p0, Le/f/c/s/j;->d:Le/f/c/s/s;

    .line 16
    invoke-virtual {v1}, Le/f/c/s/s;->a()J

    move-result-wide v5

    .line 17
    invoke-virtual {v0}, Le/f/c/s/u/j;->a()Le/f/c/s/u/m;

    move-result-object v1

    invoke-virtual {v1}, Le/f/c/s/u/m;->b()Ljava/lang/String;

    move-result-object v7

    .line 18
    invoke-virtual {v0}, Le/f/c/s/u/j;->a()Le/f/c/s/u/m;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/s/u/m;->c()J

    move-result-wide v8

    move-object v2, p1

    .line 19
    invoke-virtual/range {v2 .. v9}, Le/f/c/s/t/h;->a(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Le/f/c/s/t/h;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/s/j;->a:Le/f/c/h;

    invoke-virtual {v0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/i;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/s/j;->a:Le/f/c/h;

    invoke-virtual {v0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/i;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e(Le/f/c/s/t/h;)V
    .locals 3

    .line 2
    iget-object v0, p0, Le/f/c/s/j;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Le/f/c/s/j;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 4
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/c/s/r;

    .line 6
    invoke-interface {v2, p1}, Le/f/c/s/r;->a(Le/f/c/s/t/h;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 8
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized f()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/f/c/s/j;->j:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final g()Le/f/c/s/t/h;
    .locals 3

    .line 1
    sget-object v0, Le/f/c/s/j;->l:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/f/c/s/j;->a:Le/f/c/h;

    .line 3
    invoke-virtual {v1}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Le/f/c/s/d;->a(Landroid/content/Context;Ljava/lang/String;)Le/f/c/s/d;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 4
    :try_start_1
    iget-object v2, p0, Le/f/c/s/j;->c:Le/f/c/s/t/f;

    .line 5
    invoke-virtual {v2}, Le/f/c/s/t/f;->b()Le/f/c/s/t/h;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    .line 6
    :try_start_2
    invoke-virtual {v1}, Le/f/c/s/d;->a()V

    :cond_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Le/f/c/s/d;->a()V

    .line 7
    :cond_1
    throw v2

    :catchall_1
    move-exception v1

    .line 8
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final h()Le/f/c/s/t/h;
    .locals 5

    .line 1
    sget-object v0, Le/f/c/s/j;->l:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/f/c/s/j;->a:Le/f/c/h;

    .line 3
    invoke-virtual {v1}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object v1

    const-string v2, "generatefid.lock"

    invoke-static {v1, v2}, Le/f/c/s/d;->a(Landroid/content/Context;Ljava/lang/String;)Le/f/c/s/d;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 4
    :try_start_1
    iget-object v2, p0, Le/f/c/s/j;->c:Le/f/c/s/t/f;

    .line 5
    invoke-virtual {v2}, Le/f/c/s/t/f;->b()Le/f/c/s/t/h;

    move-result-object v2

    .line 6
    invoke-virtual {v2}, Le/f/c/s/t/h;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 7
    invoke-virtual {p0, v2}, Le/f/c/s/j;->c(Le/f/c/s/t/h;)Ljava/lang/String;

    move-result-object v3

    .line 8
    iget-object v4, p0, Le/f/c/s/j;->c:Le/f/c/s/t/f;

    .line 9
    invoke-virtual {v2, v3}, Le/f/c/s/t/h;->b(Ljava/lang/String;)Le/f/c/s/t/h;

    move-result-object v2

    .line 10
    invoke-virtual {v4, v2}, Le/f/c/s/t/f;->a(Le/f/c/s/t/h;)Le/f/c/s/t/h;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    if-eqz v1, :cond_1

    .line 11
    :try_start_2
    invoke-virtual {v1}, Le/f/c/s/d;->a()V

    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Le/f/c/s/d;->a()V

    .line 12
    :cond_2
    throw v2

    :catchall_1
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/s/j;->a:Le/f/c/h;

    invoke-virtual {v0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/i;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final j()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/f/c/s/j;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v1}, Le/f/a/b/c/m/h;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    invoke-virtual {p0}, Le/f/c/s/j;->i()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v2}, Le/f/a/b/c/m/h;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Le/f/c/s/j;->d()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."

    invoke-static {v0, v2}, Le/f/a/b/c/m/h;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Le/f/c/s/j;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/f/c/s/s;->b(Ljava/lang/String;)Z

    move-result v0

    .line 5
    invoke-static {v0, v1}, Le/f/a/b/c/m/h;->a(ZLjava/lang/Object;)V

    .line 6
    invoke-virtual {p0}, Le/f/c/s/j;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Le/f/c/s/s;->a(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0, v2}, Le/f/a/b/c/m/h;->a(ZLjava/lang/Object;)V

    return-void
.end method
