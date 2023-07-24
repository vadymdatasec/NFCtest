.class public Le/f/c/l/e/m/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/f/c/h;

.field public final c:Le/f/c/l/e/m/i1;

.field public d:Le/f/c/l/e/m/c1;

.field public e:Le/f/c/l/e/m/c1;

.field public f:Le/f/c/l/e/m/v0;

.field public final g:Le/f/c/l/e/m/q1;

.field public final h:Le/f/c/l/e/l/b;

.field public final i:Le/f/c/l/e/k/a;

.field public j:Ljava/util/concurrent/ExecutorService;

.field public k:Le/f/c/l/e/m/o;

.field public l:Le/f/c/l/e/a;


# direct methods
.method public constructor <init>(Le/f/c/h;Le/f/c/l/e/m/q1;Le/f/c/l/e/a;Le/f/c/l/e/m/i1;Le/f/c/l/e/l/b;Le/f/c/l/e/k/a;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/m/b1;->b:Le/f/c/h;

    .line 3
    iput-object p4, p0, Le/f/c/l/e/m/b1;->c:Le/f/c/l/e/m/i1;

    .line 4
    invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Le/f/c/l/e/m/b1;->a:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Le/f/c/l/e/m/b1;->g:Le/f/c/l/e/m/q1;

    .line 6
    iput-object p3, p0, Le/f/c/l/e/m/b1;->l:Le/f/c/l/e/a;

    .line 7
    iput-object p5, p0, Le/f/c/l/e/m/b1;->h:Le/f/c/l/e/l/b;

    .line 8
    iput-object p6, p0, Le/f/c/l/e/m/b1;->i:Le/f/c/l/e/k/a;

    .line 9
    iput-object p7, p0, Le/f/c/l/e/m/b1;->j:Ljava/util/concurrent/ExecutorService;

    .line 10
    new-instance p1, Le/f/c/l/e/m/o;

    invoke-direct {p1, p7}, Le/f/c/l/e/m/o;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object p1, p0, Le/f/c/l/e/m/b1;->k:Le/f/c/l/e/m/o;

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/m/b1;Le/f/c/l/e/v/f;)Le/f/a/b/h/g;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/f/c/l/e/m/b1;->a(Le/f/c/l/e/v/f;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Le/f/c/l/e/m/b1;)Le/f/c/l/e/m/c1;
    .locals 0

    .line 2
    iget-object p0, p0, Le/f/c/l/e/m/b1;->d:Le/f/c/l/e/m/c1;

    return-object p0
.end method

.method public static a(Ljava/lang/String;Z)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 26
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p0

    const-string p1, "Configured not to require a build ID."

    invoke-virtual {p0, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    return v0

    .line 27
    :cond_0
    invoke-static {p0}, Le/f/c/l/e/m/j;->b(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const-string p0, "."

    const-string p1, "FirebaseCrashlytics"

    .line 28
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ".     |  | "

    .line 29
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ".     |  |"

    .line 30
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".   \\ |  | /"

    .line 32
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".    \\    /"

    .line 33
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".     \\  /"

    .line 34
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".      \\/"

    .line 35
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."

    .line 37
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".      /\\"

    .line 39
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".     /  \\"

    .line 40
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".    /    \\"

    .line 41
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".   / |  | \\"

    .line 42
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic b(Le/f/c/l/e/m/b1;)Le/f/c/l/e/m/v0;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/b1;->f:Le/f/c/l/e/m/v0;

    return-object p0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    const-string v0, "17.2.2"

    return-object v0
.end method


# virtual methods
.method public final a(Le/f/c/l/e/v/f;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/v/f;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "Collection of crash reports disabled in Crashlytics settings."

    .line 3
    invoke-virtual {p0}, Le/f/c/l/e/m/b1;->d()V

    .line 4
    iget-object v1, p0, Le/f/c/l/e/m/b1;->f:Le/f/c/l/e/m/v0;

    invoke-virtual {v1}, Le/f/c/l/e/m/v0;->a()V

    .line 5
    :try_start_0
    iget-object v1, p0, Le/f/c/l/e/m/b1;->h:Le/f/c/l/e/l/b;

    invoke-static {p0}, Le/f/c/l/e/m/w0;->a(Le/f/c/l/e/m/b1;)Le/f/c/l/e/l/a;

    move-result-object v2

    invoke-interface {v1, v2}, Le/f/c/l/e/l/b;->a(Le/f/c/l/e/l/a;)V

    .line 6
    invoke-interface {p1}, Le/f/c/l/e/v/f;->b()Le/f/c/l/e/v/j/e;

    move-result-object v1

    .line 7
    invoke-interface {v1}, Le/f/c/l/e/v/j/e;->b()Le/f/c/l/e/v/j/c;

    move-result-object v2

    iget-boolean v2, v2, Le/f/c/l/e/v/j/c;->a:Z

    if-nez v2, :cond_0

    .line 8
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 9
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Exception;)Le/f/a/b/h/g;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-virtual {p0}, Le/f/c/l/e/m/b1;->c()V

    return-object p1

    .line 11
    :cond_0
    :try_start_1
    iget-object v0, p0, Le/f/c/l/e/m/b1;->f:Le/f/c/l/e/m/v0;

    invoke-interface {v1}, Le/f/c/l/e/v/j/e;->a()Le/f/c/l/e/v/j/d;

    move-result-object v1

    iget v1, v1, Le/f/c/l/e/v/j/d;->a:I

    invoke-virtual {v0, v1}, Le/f/c/l/e/m/v0;->b(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 12
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Could not finalize previous sessions."

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 13
    :cond_1
    iget-object v0, p0, Le/f/c/l/e/m/b1;->f:Le/f/c/l/e/m/v0;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    invoke-interface {p1}, Le/f/c/l/e/v/f;->a()Le/f/a/b/h/g;

    move-result-object p1

    .line 15
    invoke-virtual {v0, v1, p1}, Le/f/c/l/e/m/v0;->a(FLe/f/a/b/h/g;)Le/f/a/b/h/g;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    invoke-virtual {p0}, Le/f/c/l/e/m/b1;->c()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    :try_start_2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    .line 18
    invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Exception;)Le/f/a/b/h/g;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 20
    invoke-virtual {p0}, Le/f/c/l/e/m/b1;->c()V

    return-object p1

    :goto_0
    invoke-virtual {p0}, Le/f/c/l/e/m/b1;->c()V

    .line 21
    throw p1
.end method

.method public final a()V
    .locals 2

    .line 22
    iget-object v0, p0, Le/f/c/l/e/m/b1;->k:Le/f/c/l/e/m/o;

    new-instance v1, Le/f/c/l/e/m/a1;

    invoke-direct {v1, p0}, Le/f/c/l/e/m/a1;-><init>(Le/f/c/l/e/m/b1;)V

    .line 23
    invoke-virtual {v0, v1}, Le/f/c/l/e/m/o;->b(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    move-result-object v0

    .line 24
    :try_start_0
    invoke-static {v0}, Le/f/c/l/e/m/h2;->a(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    :catch_0
    return-void
.end method

.method public b(Le/f/c/l/e/v/f;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/v/f;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/c/l/e/m/b1;->j:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Le/f/c/l/e/m/x0;

    invoke-direct {v1, p0, p1}, Le/f/c/l/e/m/x0;-><init>(Le/f/c/l/e/m/b1;Le/f/c/l/e/v/f;)V

    invoke-static {v0, v1}, Le/f/c/l/e/m/h2;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 3
    iget-object v0, p0, Le/f/c/l/e/m/b1;->d:Le/f/c/l/e/m/c1;

    invoke-virtual {v0}, Le/f/c/l/e/m/c1;->c()Z

    move-result v0

    return v0
.end method

.method public c()V
    .locals 2

    .line 9
    iget-object v0, p0, Le/f/c/l/e/m/b1;->k:Le/f/c/l/e/m/o;

    new-instance v1, Le/f/c/l/e/m/z0;

    invoke-direct {v1, p0}, Le/f/c/l/e/m/z0;-><init>(Le/f/c/l/e/m/b1;)V

    invoke-virtual {v0, v1}, Le/f/c/l/e/m/o;->b(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    return-void
.end method

.method public final c(Le/f/c/l/e/v/f;)V
    .locals 3

    .line 1
    new-instance v0, Le/f/c/l/e/m/y0;

    invoke-direct {v0, p0, p1}, Le/f/c/l/e/m/y0;-><init>(Le/f/c/l/e/m/b1;Le/f/c/l/e/v/f;)V

    .line 2
    iget-object p1, p0, Le/f/c/l/e/m/b1;->j:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    .line 3
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    .line 4
    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    const-wide/16 v0, 0x4

    .line 5
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Crashlytics timed out during initialization."

    invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 7
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Problem encountered during Crashlytics initialization."

    invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception p1

    .line 8
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Crashlytics was interrupted during initialization."

    invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 30
    iget-object v0, p0, Le/f/c/l/e/m/b1;->k:Le/f/c/l/e/m/o;

    invoke-virtual {v0}, Le/f/c/l/e/m/o;->a()V

    .line 31
    iget-object v0, p0, Le/f/c/l/e/m/b1;->d:Le/f/c/l/e/m/c1;

    invoke-virtual {v0}, Le/f/c/l/e/m/c1;->a()Z

    .line 32
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Initialization marker file created."

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public d(Le/f/c/l/e/v/f;)Z
    .locals 22

    move-object/from16 v1, p0

    .line 1
    iget-object v0, v1, Le/f/c/l/e/m/b1;->a:Landroid/content/Context;

    invoke-static {v0}, Le/f/c/l/e/m/j;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Mapping file ID is: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 3
    iget-object v2, v1, Le/f/c/l/e/m/b1;->a:Landroid/content/Context;

    const/4 v3, 0x1

    const-string v4, "com.crashlytics.RequireBuildId"

    .line 4
    invoke-static {v2, v4, v3}, Le/f/c/l/e/m/j;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    .line 5
    invoke-static {v0, v2}, Le/f/c/l/e/m/b1;->a(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    iget-object v2, v1, Le/f/c/l/e/m/b1;->b:Le/f/c/h;

    invoke-virtual {v2}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v2

    invoke-virtual {v2}, Le/f/c/i;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    .line 7
    :try_start_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Initializing Crashlytics "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Le/f/c/l/e/m/b1;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Le/f/c/l/e/b;->c(Ljava/lang/String;)V

    .line 8
    new-instance v13, Le/f/c/l/e/r/i;

    iget-object v5, v1, Le/f/c/l/e/m/b1;->a:Landroid/content/Context;

    invoke-direct {v13, v5}, Le/f/c/l/e/r/i;-><init>(Landroid/content/Context;)V

    .line 9
    new-instance v5, Le/f/c/l/e/m/c1;

    const-string v6, "crash_marker"

    invoke-direct {v5, v6, v13}, Le/f/c/l/e/m/c1;-><init>(Ljava/lang/String;Le/f/c/l/e/r/h;)V

    iput-object v5, v1, Le/f/c/l/e/m/b1;->e:Le/f/c/l/e/m/c1;

    .line 10
    new-instance v5, Le/f/c/l/e/m/c1;

    const-string v6, "initialization_marker"

    invoke-direct {v5, v6, v13}, Le/f/c/l/e/m/c1;-><init>(Ljava/lang/String;Le/f/c/l/e/r/h;)V

    iput-object v5, v1, Le/f/c/l/e/m/b1;->d:Le/f/c/l/e/m/c1;

    .line 11
    new-instance v10, Le/f/c/l/e/q/c;

    invoke-direct {v10}, Le/f/c/l/e/q/c;-><init>()V

    .line 12
    iget-object v5, v1, Le/f/c/l/e/m/b1;->a:Landroid/content/Context;

    iget-object v6, v1, Le/f/c/l/e/m/b1;->g:Le/f/c/l/e/m/q1;

    invoke-static {v5, v6, v2, v0}, Le/f/c/l/e/m/b;->a(Landroid/content/Context;Le/f/c/l/e/m/q1;Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/m/b;

    move-result-object v15

    .line 13
    new-instance v0, Le/f/c/l/e/x/a;

    iget-object v2, v1, Le/f/c/l/e/m/b1;->a:Landroid/content/Context;

    invoke-direct {v0, v2}, Le/f/c/l/e/x/a;-><init>(Landroid/content/Context;)V

    .line 14
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Installer package name is: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v15, Le/f/c/l/e/m/b;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 15
    new-instance v2, Le/f/c/l/e/m/v0;

    iget-object v8, v1, Le/f/c/l/e/m/b1;->a:Landroid/content/Context;

    iget-object v9, v1, Le/f/c/l/e/m/b1;->k:Le/f/c/l/e/m/o;

    iget-object v11, v1, Le/f/c/l/e/m/b1;->g:Le/f/c/l/e/m/q1;

    iget-object v12, v1, Le/f/c/l/e/m/b1;->c:Le/f/c/l/e/m/i1;

    iget-object v14, v1, Le/f/c/l/e/m/b1;->e:Le/f/c/l/e/m/c1;

    const/16 v16, 0x0

    const/16 v17, 0x0

    iget-object v5, v1, Le/f/c/l/e/m/b1;->l:Le/f/c/l/e/a;

    iget-object v6, v1, Le/f/c/l/e/m/b1;->i:Le/f/c/l/e/k/a;

    move-object v7, v2

    move-object/from16 v18, v5

    move-object/from16 v19, v0

    move-object/from16 v20, v6

    move-object/from16 v21, p1

    invoke-direct/range {v7 .. v21}, Le/f/c/l/e/m/v0;-><init>(Landroid/content/Context;Le/f/c/l/e/m/o;Le/f/c/l/e/q/c;Le/f/c/l/e/m/q1;Le/f/c/l/e/m/i1;Le/f/c/l/e/r/h;Le/f/c/l/e/m/c1;Le/f/c/l/e/m/b;Le/f/c/l/e/t/a;Le/f/c/l/e/t/c;Le/f/c/l/e/a;Le/f/c/l/e/x/b;Le/f/c/l/e/k/a;Le/f/c/l/e/v/f;)V

    iput-object v2, v1, Le/f/c/l/e/m/b1;->f:Le/f/c/l/e/m/v0;

    .line 16
    invoke-virtual/range {p0 .. p0}, Le/f/c/l/e/m/b1;->b()Z

    move-result v0

    .line 17
    invoke-virtual/range {p0 .. p0}, Le/f/c/l/e/m/b1;->a()V

    .line 18
    iget-object v2, v1, Le/f/c/l/e/m/b1;->f:Le/f/c/l/e/m/v0;

    .line 19
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v5

    move-object/from16 v6, p1

    .line 20
    invoke-virtual {v2, v5, v6}, Le/f/c/l/e/m/v0;->a(Ljava/lang/Thread$UncaughtExceptionHandler;Le/f/c/l/e/v/f;)V

    if-eqz v0, :cond_0

    .line 21
    iget-object v0, v1, Le/f/c/l/e/m/b1;->a:Landroid/content/Context;

    invoke-static {v0}, Le/f/c/l/e/m/j;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v2, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    .line 23
    invoke-virtual {v0, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 24
    invoke-virtual/range {p0 .. p1}, Le/f/c/l/e/m/b1;->c(Le/f/c/l/e/v/f;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    .line 25
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v2, "Exception handling initialization successful"

    invoke-virtual {v0, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    return v3

    :catch_0
    move-exception v0

    .line 26
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v2

    const-string v3, "Crashlytics was not started due to an exception during initialization"

    .line 27
    invoke-virtual {v2, v3, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    .line 28
    iput-object v0, v1, Le/f/c/l/e/m/b1;->f:Le/f/c/l/e/m/v0;

    return v4

    .line 29
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
