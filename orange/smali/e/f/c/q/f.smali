.class public Le/f/c/q/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/Object;

.field public static d:Le/f/c/q/h0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le/f/c/q/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/q/f;->a:Landroid/content/Context;

    .line 3
    sget-object p1, Le/f/c/q/a;->a:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Le/f/c/q/f;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Le/f/c/q/f;->a:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Le/f/c/q/f;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static final synthetic a(Landroid/content/Context;Landroid/content/Intent;Le/f/a/b/h/g;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 18
    invoke-static {}, Le/f/a/b/c/p/h;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    invoke-virtual {p2}, Le/f/a/b/h/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x192

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p0, p1}, Le/f/c/q/f;->b(Landroid/content/Context;Landroid/content/Intent;)Le/f/a/b/h/g;

    move-result-object p0

    .line 21
    invoke-static {}, Le/f/c/q/h;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    sget-object p2, Le/f/c/q/e;->a:Le/f/a/b/h/a;

    .line 22
    invoke-virtual {p0, p1, p2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    return-object p2
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Le/f/c/q/h0;
    .locals 2

    .line 12
    sget-object v0, Le/f/c/q/f;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 13
    :try_start_0
    sget-object v1, Le/f/c/q/f;->d:Le/f/c/q/h0;

    if-nez v1, :cond_0

    .line 14
    new-instance v1, Le/f/c/q/h0;

    invoke-direct {v1, p0, p1}, Le/f/c/q/h0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sput-object v1, Le/f/c/q/f;->d:Le/f/c/q/h0;

    .line 15
    :cond_0
    sget-object p0, Le/f/c/q/f;->d:Le/f/c/q/h0;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static final synthetic a(Le/f/a/b/h/g;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 p0, -0x1

    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/content/Intent;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "FirebaseInstanceId"

    const/4 v1, 0x3

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Binding to service"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string v0, "com.google.firebase.MESSAGING_EVENT"

    .line 3
    invoke-static {p0, v0}, Le/f/c/q/f;->a(Landroid/content/Context;Ljava/lang/String;)Le/f/c/q/h0;

    move-result-object p0

    .line 4
    invoke-virtual {p0, p1}, Le/f/c/q/h0;->a(Landroid/content/Intent;)Le/f/a/b/h/g;

    move-result-object p0

    .line 5
    invoke-static {}, Le/f/c/q/h;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    sget-object v0, Le/f/c/q/d;->a:Le/f/a/b/h/a;

    invoke-virtual {p0, p1, v0}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Le/f/a/b/h/g;)Ljava/lang/Integer;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/16 p0, 0x193

    .line 6
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/Integer;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-static {}, Le/f/c/q/w;->b()Le/f/c/q/w;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Le/f/c/q/w;->c(Landroid/content/Context;Landroid/content/Intent;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)Le/f/a/b/h/g;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 5
    invoke-static {}, Le/f/a/b/c/p/h;->h()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v3, 0x1a

    if-lt v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getFlags()I

    move-result v3

    const/high16 v4, 0x10000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v0, :cond_2

    if-nez v1, :cond_2

    .line 8
    invoke-static {p1, p2}, Le/f/c/q/f;->b(Landroid/content/Context;Landroid/content/Intent;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1

    .line 9
    :cond_2
    iget-object v0, p0, Le/f/c/q/f;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Le/f/c/q/b;

    invoke-direct {v1, p1, p2}, Le/f/c/q/b;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    .line 10
    invoke-static {v0, v1}, Le/f/a/b/h/n;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    move-result-object v0

    .line 11
    iget-object v1, p0, Le/f/c/q/f;->b:Ljava/util/concurrent/Executor;

    new-instance v2, Le/f/c/q/c;

    invoke-direct {v2, p1, p2}, Le/f/c/q/c;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->b(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/content/Intent;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "gcm.rawData64"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 2
    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1

    const-string v2, "rawData"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-object v0, p0, Le/f/c/q/f;->a:Landroid/content/Context;

    invoke-virtual {p0, v0, p1}, Le/f/c/q/f;->a(Landroid/content/Context;Landroid/content/Intent;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
