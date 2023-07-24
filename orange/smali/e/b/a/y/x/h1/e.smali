.class public Le/b/a/y/x/h1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Le/b/a/y/x/h1/f;


# direct methods
.method public constructor <init>(Le/b/a/y/x/h1/f;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/x/h1/e;->c:Le/b/a/y/x/h1/f;

    iput-object p2, p0, Le/b/a/y/x/h1/e;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/e;->c:Le/b/a/y/x/h1/f;

    iget-boolean v0, v0, Le/b/a/y/x/h1/f;->d:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 3
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    .line 4
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 5
    :cond_0
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/h1/e;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 6
    iget-object v1, p0, Le/b/a/y/x/h1/e;->c:Le/b/a/y/x/h1/f;

    iget-object v1, v1, Le/b/a/y/x/h1/f;->c:Le/b/a/y/x/h1/j;

    invoke-interface {v1, v0}, Le/b/a/y/x/h1/j;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
