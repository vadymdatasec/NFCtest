.class public Le/b/a/z/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/b/a/z/j0;


# direct methods
.method public constructor <init>(Le/b/a/z/j0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/z/f0;->b:Le/b/a/z/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/b/a/z/f0;->b:Le/b/a/z/j0;

    invoke-virtual {v0}, Le/b/a/z/j0;->c()Z

    move-result v1

    iput-boolean v1, v0, Le/b/a/z/j0;->d:Z

    .line 2
    :try_start_0
    iget-object v0, p0, Le/b/a/z/f0;->b:Le/b/a/z/j0;

    iget-object v0, v0, Le/b/a/z/j0;->a:Landroid/content/Context;

    iget-object v1, p0, Le/b/a/z/f0;->b:Le/b/a/z/j0;

    iget-object v1, v1, Le/b/a/z/j0;->f:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 3
    iget-object v0, p0, Le/b/a/z/f0;->b:Le/b/a/z/j0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Le/b/a/z/j0;->e:Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x5

    const-string v2, "ConnectivityMonitor"

    .line 4
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Failed to register"

    .line 5
    invoke-static {v2, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 6
    :cond_0
    iget-object v0, p0, Le/b/a/z/f0;->b:Le/b/a/z/j0;

    const/4 v1, 0x0

    iput-boolean v1, v0, Le/b/a/z/j0;->e:Z

    :goto_0
    return-void
.end method
