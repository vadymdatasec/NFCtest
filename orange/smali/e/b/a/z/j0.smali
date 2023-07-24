.class public final Le/b/a/z/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/z/a0;


# static fields
.field public static final g:Ljava/util/concurrent/Executor;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/b/a/z/c;

.field public final c:Le/b/a/e0/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/e0/k<",
            "Landroid/net/ConnectivityManager;",
            ">;"
        }
    .end annotation
.end field

.field public volatile d:Z

.field public volatile e:Z

.field public final f:Landroid/content/BroadcastReceiver;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    sput-object v0, Le/b/a/z/j0;->g:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le/b/a/e0/k;Le/b/a/z/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/b/a/e0/k<",
            "Landroid/net/ConnectivityManager;",
            ">;",
            "Le/b/a/z/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/z/e0;

    invoke-direct {v0, p0}, Le/b/a/z/e0;-><init>(Le/b/a/z/j0;)V

    iput-object v0, p0, Le/b/a/z/j0;->f:Landroid/content/BroadcastReceiver;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Le/b/a/z/j0;->a:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Le/b/a/z/j0;->c:Le/b/a/e0/k;

    .line 5
    iput-object p3, p0, Le/b/a/z/j0;->b:Le/b/a/z/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    sget-object v0, Le/b/a/z/j0;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Le/b/a/z/g0;

    invoke-direct {v1, p0}, Le/b/a/z/g0;-><init>(Le/b/a/z/j0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 2
    new-instance v0, Le/b/a/z/i0;

    invoke-direct {v0, p0, p1}, Le/b/a/z/i0;-><init>(Le/b/a/z/j0;Z)V

    invoke-static {v0}, Le/b/a/e0/t;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Z
    .locals 2

    .line 1
    sget-object v0, Le/b/a/z/j0;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Le/b/a/z/f0;

    invoke-direct {v1, p0}, Le/b/a/z/f0;-><init>(Le/b/a/z/j0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0
.end method

.method public c()Z
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iget-object v1, p0, Le/b/a/z/j0;->c:Le/b/a/e0/k;

    invoke-interface {v1}, Le/b/a/e0/k;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :catch_0
    move-exception v1

    const/4 v2, 0x5

    const-string v3, "ConnectivityMonitor"

    .line 3
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "Failed to determine connectivity status when connectivity changed"

    .line 4
    invoke-static {v3, v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    return v0
.end method

.method public d()V
    .locals 2

    .line 1
    sget-object v0, Le/b/a/z/j0;->g:Ljava/util/concurrent/Executor;

    new-instance v1, Le/b/a/z/h0;

    invoke-direct {v1, p0}, Le/b/a/z/h0;-><init>(Le/b/a/z/j0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
