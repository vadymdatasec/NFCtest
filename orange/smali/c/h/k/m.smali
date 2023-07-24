.class public abstract Lc/h/k/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/g<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/concurrent/ExecutorService;

.field public static final c:Ljava/lang/Object;

.field public static final d:Lc/e/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/i<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lc/h/m/a<",
            "Lc/h/k/l;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lc/e/g;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lc/e/g;-><init>(I)V

    sput-object v0, Lc/h/k/m;->a:Lc/e/g;

    const-string v0, "fonts-androidx"

    const/16 v1, 0xa

    const/16 v2, 0x2710

    .line 2
    invoke-static {v0, v1, v2}, Lc/h/k/v;->a(Ljava/lang/String;II)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    sput-object v0, Lc/h/k/m;->b:Ljava/util/concurrent/ExecutorService;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc/h/k/m;->c:Ljava/lang/Object;

    .line 4
    new-instance v0, Lc/e/i;

    invoke-direct {v0}, Lc/e/i;-><init>()V

    sput-object v0, Lc/h/k/m;->d:Lc/e/i;

    return-void
.end method

.method public static a(Lc/h/k/n;)I
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .line 40
    invoke-virtual {p0}, Lc/h/k/n;->b()I

    move-result v0

    const/4 v1, -0x3

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 41
    invoke-virtual {p0}, Lc/h/k/n;->b()I

    move-result p0

    if-eq p0, v2, :cond_0

    return v1

    :cond_0
    const/4 p0, -0x2

    return p0

    .line 42
    :cond_1
    invoke-virtual {p0}, Lc/h/k/n;->a()[Lc/h/k/o;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 43
    array-length v0, p0

    if-nez v0, :cond_2

    goto :goto_2

    .line 44
    :cond_2
    array-length v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_5

    aget-object v4, p0, v3

    .line 45
    invoke-virtual {v4}, Lc/h/k/o;->a()I

    move-result v4

    if-eqz v4, :cond_4

    if-gez v4, :cond_3

    goto :goto_1

    :cond_3
    move v1, v4

    :goto_1
    return v1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return v2
.end method

.method public static a(Landroid/content/Context;Lc/h/k/g;ILjava/util/concurrent/Executor;Lc/h/k/c;)Landroid/graphics/Typeface;
    .locals 4

    .line 12
    invoke-static {p1, p2}, Lc/h/k/m;->a(Lc/h/k/g;I)Ljava/lang/String;

    move-result-object v0

    .line 13
    sget-object v1, Lc/h/k/m;->a:Lc/e/g;

    invoke-virtual {v1, v0}, Lc/e/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    .line 14
    new-instance p0, Lc/h/k/l;

    invoke-direct {p0, v1}, Lc/h/k/l;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p4, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V

    return-object v1

    .line 15
    :cond_0
    new-instance v1, Lc/h/k/i;

    invoke-direct {v1, p4}, Lc/h/k/i;-><init>(Lc/h/k/c;)V

    .line 16
    sget-object p4, Lc/h/k/m;->c:Ljava/lang/Object;

    monitor-enter p4

    .line 17
    :try_start_0
    sget-object v2, Lc/h/k/m;->d:Lc/e/i;

    invoke-virtual {v2, v0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 18
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    monitor-exit p4

    return-object v3

    .line 20
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    sget-object v1, Lc/h/k/m;->d:Lc/e/i;

    invoke-virtual {v1, v0, v2}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    new-instance p4, Lc/h/k/j;

    invoke-direct {p4, v0, p0, p1, p2}, Lc/h/k/j;-><init>(Ljava/lang/String;Landroid/content/Context;Lc/h/k/g;I)V

    if-nez p3, :cond_2

    .line 25
    sget-object p3, Lc/h/k/m;->b:Ljava/util/concurrent/ExecutorService;

    .line 26
    :cond_2
    new-instance p0, Lc/h/k/k;

    invoke-direct {p0, v0}, Lc/h/k/k;-><init>(Ljava/lang/String;)V

    invoke-static {p3, p4, p0}, Lc/h/k/v;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;Lc/h/m/a;)V

    return-object v3

    :catchall_0
    move-exception p0

    .line 27
    :try_start_1
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static a(Landroid/content/Context;Lc/h/k/g;Lc/h/k/c;II)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    invoke-static {p1, p3}, Lc/h/k/m;->a(Lc/h/k/g;I)Ljava/lang/String;

    move-result-object v0

    .line 2
    sget-object v1, Lc/h/k/m;->a:Lc/e/g;

    invoke-virtual {v1, v0}, Lc/e/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    .line 3
    new-instance p0, Lc/h/k/l;

    invoke-direct {p0, v1}, Lc/h/k/l;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p2, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V

    return-object v1

    :cond_0
    const/4 v1, -0x1

    if-ne p4, v1, :cond_1

    .line 4
    invoke-static {v0, p0, p1, p3}, Lc/h/k/m;->a(Ljava/lang/String;Landroid/content/Context;Lc/h/k/g;I)Lc/h/k/l;

    move-result-object p0

    .line 5
    invoke-virtual {p2, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V

    .line 6
    iget-object p0, p0, Lc/h/k/l;->a:Landroid/graphics/Typeface;

    return-object p0

    .line 7
    :cond_1
    new-instance v1, Lc/h/k/h;

    invoke-direct {v1, v0, p0, p1, p3}, Lc/h/k/h;-><init>(Ljava/lang/String;Landroid/content/Context;Lc/h/k/g;I)V

    .line 8
    :try_start_0
    sget-object p0, Lc/h/k/m;->b:Ljava/util/concurrent/ExecutorService;

    invoke-static {p0, v1, p4}, Lc/h/k/v;->a(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Callable;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/h/k/l;

    .line 9
    invoke-virtual {p2, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V

    .line 10
    iget-object p0, p0, Lc/h/k/l;->a:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 11
    :catch_0
    new-instance p0, Lc/h/k/l;

    const/4 p1, -0x3

    invoke-direct {p0, p1}, Lc/h/k/l;-><init>(I)V

    invoke-virtual {p2, p0}, Lc/h/k/c;->a(Lc/h/k/l;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;Lc/h/k/g;I)Lc/h/k/l;
    .locals 2

    .line 29
    sget-object v0, Lc/h/k/m;->a:Lc/e/g;

    invoke-virtual {v0, p0}, Lc/e/g;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    if-eqz v0, :cond_0

    .line 30
    new-instance p0, Lc/h/k/l;

    invoke-direct {p0, v0}, Lc/h/k/l;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 31
    :try_start_0
    invoke-static {p1, p2, v0}, Lc/h/k/f;->a(Landroid/content/Context;Lc/h/k/g;Landroid/os/CancellationSignal;)Lc/h/k/n;

    move-result-object p2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    invoke-static {p2}, Lc/h/k/m;->a(Lc/h/k/n;)I

    move-result v1

    if-eqz v1, :cond_1

    .line 33
    new-instance p0, Lc/h/k/l;

    invoke-direct {p0, v1}, Lc/h/k/l;-><init>(I)V

    return-object p0

    .line 34
    :cond_1
    invoke-virtual {p2}, Lc/h/k/n;->a()[Lc/h/k/o;

    move-result-object p2

    .line 35
    invoke-static {p1, v0, p2, p3}, Lc/h/g/g;->a(Landroid/content/Context;Landroid/os/CancellationSignal;[Lc/h/k/o;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 36
    sget-object p2, Lc/h/k/m;->a:Lc/e/g;

    invoke-virtual {p2, p0, p1}, Lc/e/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    new-instance p0, Lc/h/k/l;

    invoke-direct {p0, p1}, Lc/h/k/l;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    .line 38
    :cond_2
    new-instance p0, Lc/h/k/l;

    const/4 p1, -0x3

    invoke-direct {p0, p1}, Lc/h/k/l;-><init>(I)V

    return-object p0

    .line 39
    :catch_0
    new-instance p0, Lc/h/k/l;

    const/4 p1, -0x1

    invoke-direct {p0, p1}, Lc/h/k/l;-><init>(I)V

    return-object p0
.end method

.method public static a(Lc/h/k/g;I)Ljava/lang/String;
    .locals 1

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lc/h/k/g;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
