.class public Le/f/c/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Ljava/lang/Object;

.field public static final j:Ljava/util/concurrent/Executor;

.field public static final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Le/f/c/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Le/f/c/i;

.field public final d:Le/f/c/k/p;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:Le/f/c/k/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/c/k/x<",
            "Le/f/c/t/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f/c/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le/f/c/h;->i:Ljava/lang/Object;

    .line 2
    new-instance v0, Le/f/c/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/f/c/f;-><init>(Le/f/c/c;)V

    sput-object v0, Le/f/c/h;->j:Ljava/util/concurrent/Executor;

    .line 3
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    sput-object v0, Le/f/c/h;->k:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Le/f/c/i;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Le/f/c/h;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Le/f/c/h;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Le/f/c/h;->h:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 6
    invoke-static {p1}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Le/f/c/h;->a:Landroid/content/Context;

    .line 7
    invoke-static {p2}, Le/f/a/b/c/m/h;->a(Ljava/lang/String;)Ljava/lang/String;

    iput-object p2, p0, Le/f/c/h;->b:Ljava/lang/String;

    .line 8
    invoke-static {p3}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object p2, p3

    check-cast p2, Le/f/c/i;

    iput-object p2, p0, Le/f/c/h;->c:Le/f/c/i;

    .line 9
    const-class p2, Lcom/google/firebase/components/ComponentDiscoveryService;

    .line 10
    invoke-static {p1, p2}, Le/f/c/k/j;->a(Landroid/content/Context;Ljava/lang/Class;)Le/f/c/k/j;

    move-result-object p2

    .line 11
    invoke-virtual {p2}, Le/f/c/k/j;->a()Ljava/util/List;

    move-result-object p2

    .line 12
    invoke-static {}, Le/f/c/v/e;->a()Ljava/lang/String;

    move-result-object v0

    .line 13
    new-instance v2, Le/f/c/k/p;

    sget-object v3, Le/f/c/h;->j:Ljava/util/concurrent/Executor;

    const/16 v4, 0x8

    new-array v4, v4, [Le/f/c/k/e;

    const-class v5, Landroid/content/Context;

    new-array v6, v1, [Ljava/lang/Class;

    .line 14
    invoke-static {p1, v5, v6}, Le/f/c/k/e;->a(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Le/f/c/k/e;

    move-result-object v5

    aput-object v5, v4, v1

    const-class v5, Le/f/c/h;

    new-array v6, v1, [Ljava/lang/Class;

    .line 15
    invoke-static {p0, v5, v6}, Le/f/c/k/e;->a(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Le/f/c/k/e;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    const-class v5, Le/f/c/i;

    new-array v1, v1, [Ljava/lang/Class;

    .line 16
    invoke-static {p3, v5, v1}, Le/f/c/k/e;->a(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Le/f/c/k/e;

    move-result-object p3

    const/4 v1, 0x2

    aput-object p3, v4, v1

    const-string p3, "fire-android"

    const-string v1, ""

    .line 17
    invoke-static {p3, v1}, Le/f/c/v/g;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/k/e;

    move-result-object p3

    const/4 v1, 0x3

    aput-object p3, v4, v1

    const-string p3, "fire-core"

    const-string v1, "19.3.1"

    .line 18
    invoke-static {p3, v1}, Le/f/c/v/g;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/k/e;

    move-result-object p3

    const/4 v1, 0x4

    aput-object p3, v4, v1

    if-eqz v0, :cond_0

    const-string p3, "kotlin"

    .line 19
    invoke-static {p3, v0}, Le/f/c/v/g;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/k/e;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const/4 v0, 0x5

    aput-object p3, v4, v0

    const/4 p3, 0x6

    .line 20
    invoke-static {}, Le/f/c/v/c;->b()Le/f/c/k/e;

    move-result-object v0

    aput-object v0, v4, p3

    const/4 p3, 0x7

    .line 21
    invoke-static {}, Le/f/c/p/b;->a()Le/f/c/k/e;

    move-result-object v0

    aput-object v0, v4, p3

    invoke-direct {v2, v3, p2, v4}, Le/f/c/k/p;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Iterable;[Le/f/c/k/e;)V

    iput-object v2, p0, Le/f/c/h;->d:Le/f/c/k/p;

    .line 22
    new-instance p2, Le/f/c/k/x;

    invoke-static {p0, p1}, Le/f/c/b;->a(Le/f/c/h;Landroid/content/Context;)Le/f/c/r/a;

    move-result-object p1

    invoke-direct {p2, p1}, Le/f/c/k/x;-><init>(Le/f/c/r/a;)V

    iput-object p2, p0, Le/f/c/h;->g:Le/f/c/k/x;

    return-void
.end method

.method public static a(Landroid/content/Context;)Le/f/c/h;
    .locals 3

    .line 3
    sget-object v0, Le/f/c/h;->i:Ljava/lang/Object;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Le/f/c/h;->k:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-static {}, Le/f/c/h;->j()Le/f/c/h;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 6
    :cond_0
    invoke-static {p0}, Le/f/c/i;->a(Landroid/content/Context;)Le/f/c/i;

    move-result-object v1

    if-nez v1, :cond_1

    const-string p0, "FirebaseApp"

    const-string v1, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project."

    .line 7
    invoke-static {p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    .line 8
    monitor-exit v0

    return-object p0

    .line 9
    :cond_1
    invoke-static {p0, v1}, Le/f/c/h;->a(Landroid/content/Context;Le/f/c/i;)Le/f/c/h;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Landroid/content/Context;Le/f/c/i;)Le/f/c/h;
    .locals 1

    const-string v0, "[DEFAULT]"

    .line 11
    invoke-static {p0, p1, v0}, Le/f/c/h;->a(Landroid/content/Context;Le/f/c/i;Ljava/lang/String;)Le/f/c/h;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Le/f/c/i;Ljava/lang/String;)Le/f/c/h;
    .locals 4

    .line 12
    invoke-static {p0}, Le/f/c/e;->a(Landroid/content/Context;)V

    .line 13
    invoke-static {p2}, Le/f/c/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 16
    :goto_0
    sget-object v0, Le/f/c/h;->i:Ljava/lang/Object;

    monitor-enter v0

    .line 17
    :try_start_0
    sget-object v1, Le/f/c/h;->k:Ljava/util/Map;

    .line 18
    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FirebaseApp name "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " already exists!"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 19
    invoke-static {v1, v2}, Le/f/a/b/c/m/h;->b(ZLjava/lang/Object;)V

    const-string v1, "Application context cannot be null."

    .line 20
    invoke-static {p0, v1}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    new-instance v1, Le/f/c/h;

    invoke-direct {v1, p0, p2, p1}, Le/f/c/h;-><init>(Landroid/content/Context;Ljava/lang/String;Le/f/c/i;)V

    .line 22
    sget-object p0, Le/f/c/h;->k:Ljava/util/Map;

    invoke-interface {p0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    invoke-virtual {v1}, Le/f/c/h;->f()V

    return-object v1

    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic a(Le/f/c/h;Landroid/content/Context;)Le/f/c/t/a;
    .locals 3

    .line 28
    new-instance v0, Le/f/c/t/a;

    .line 29
    invoke-virtual {p0}, Le/f/c/h;->e()Ljava/lang/String;

    move-result-object v1

    iget-object p0, p0, Le/f/c/h;->d:Le/f/c/k/p;

    const-class v2, Le/f/c/o/c;

    .line 30
    invoke-virtual {p0, v2}, Le/f/c/k/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le/f/c/o/c;

    invoke-direct {v0, p1, v1, p0}, Le/f/c/t/a;-><init>(Landroid/content/Context;Ljava/lang/String;Le/f/c/o/c;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Le/f/c/h;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le/f/c/h;->f()V

    return-void
.end method

.method public static synthetic a(Le/f/c/h;Z)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Le/f/c/h;->a(Z)V

    return-void
.end method

.method public static synthetic b(Le/f/c/h;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/h;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic i()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Le/f/c/h;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public static j()Le/f/c/h;
    .locals 4

    .line 1
    sget-object v0, Le/f/c/h;->i:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Le/f/c/h;->k:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/c/h;

    if-eqz v1, :cond_0

    .line 3
    monitor-exit v0

    return-object v1

    .line 4
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Default FirebaseApp is not initialized in this process "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-static {}, Le/f/a/b/c/p/i;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". Make sure to call FirebaseApp.initializeApp(Context) first."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 26
    invoke-virtual {p0}, Le/f/c/h;->a()V

    .line 27
    iget-object v0, p0, Le/f/c/h;->d:Le/f/c/k/p;

    invoke-virtual {v0, p1}, Le/f/c/k/a;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a()V
    .locals 2

    .line 31
    iget-object v0, p0, Le/f/c/h;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp was deleted"

    invoke-static {v0, v1}, Le/f/a/b/c/m/h;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method public final a(Z)V
    .locals 2

    const-string v0, "FirebaseApp"

    const-string v1, "Notifying background state change listeners."

    .line 32
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    iget-object v0, p0, Le/f/c/h;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/c/d;

    .line 34
    invoke-interface {v1, p1}, Le/f/c/d;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .line 2
    invoke-virtual {p0}, Le/f/c/h;->a()V

    .line 3
    iget-object v0, p0, Le/f/c/h;->a:Landroid/content/Context;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/h;->a()V

    .line 2
    iget-object v0, p0, Le/f/c/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Le/f/c/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/h;->a()V

    .line 2
    iget-object v0, p0, Le/f/c/h;->c:Le/f/c/i;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Le/f/a/b/c/p/c;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v1

    invoke-virtual {v1}, Le/f/c/i;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 3
    invoke-static {v1}, Le/f/a/b/c/p/c;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le/f/c/h;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-object v0, p0, Le/f/c/h;->b:Ljava/lang/String;

    check-cast p1, Le/f/c/h;

    invoke-virtual {p1}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/c/h;->a:Landroid/content/Context;

    invoke-static {v0}, Lc/h/j/e;->a(Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp"

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p0}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    iget-object v0, p0, Le/f/c/h;->a:Landroid/content/Context;

    invoke-static {v0}, Le/f/c/g;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device unlocked: initializing all Firebase APIs for app "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    iget-object v0, p0, Le/f/c/h;->d:Le/f/c/k/p;

    invoke-virtual {p0}, Le/f/c/h;->h()Z

    move-result v1

    invoke-virtual {v0, v1}, Le/f/c/k/p;->a(Z)V

    :goto_0
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/c/h;->a()V

    .line 2
    iget-object v0, p0, Le/f/c/h;->g:Le/f/c/k/x;

    invoke-virtual {v0}, Le/f/c/k/x;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/c/t/a;

    invoke-virtual {v0}, Le/f/c/t/a;->a()Z

    move-result v0

    return v0
.end method

.method public h()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[DEFAULT]"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/h;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Le/f/a/b/c/m/g;->a(Ljava/lang/Object;)Le/f/a/b/c/m/f;

    move-result-object v0

    iget-object v1, p0, Le/f/c/h;->b:Ljava/lang/String;

    const-string v2, "name"

    invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;

    iget-object v1, p0, Le/f/c/h;->c:Le/f/c/i;

    const-string v2, "options"

    invoke-virtual {v0, v2, v1}, Le/f/a/b/c/m/f;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/a/b/c/m/f;

    invoke-virtual {v0}, Le/f/a/b/c/m/f;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
