.class public Le/f/c/u/j0;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public a:Le/f/c/u/k0;

.field public final synthetic b:Le/f/c/u/k0;


# direct methods
.method public constructor <init>(Le/f/c/u/k0;Le/f/c/u/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/u/j0;->b:Le/f/c/u/k0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    iput-object p2, p0, Le/f/c/u/j0;->a:Le/f/c/u/k0;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    invoke-static {}, Le/f/c/u/k0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FirebaseMessaging"

    const-string v1, "Connectivity change received registered"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object v0, p0, Le/f/c/u/j0;->b:Le/f/c/u/k0;

    invoke-static {v0}, Le/f/c/u/k0;->c(Le/f/c/u/k0;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public declared-synchronized onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object p2, p0, Le/f/c/u/j0;->a:Le/f/c/u/k0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    iget-object p2, p0, Le/f/c/u/j0;->a:Le/f/c/u/k0;

    invoke-static {p2}, Le/f/c/u/k0;->a(Le/f/c/u/k0;)Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p2, :cond_1

    .line 4
    monitor-exit p0

    return-void

    .line 5
    :cond_1
    :try_start_2
    invoke-static {}, Le/f/c/u/k0;->b()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "FirebaseMessaging"

    const-string v0, "Connectivity changed. Starting background sync."

    .line 6
    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    :cond_2
    iget-object p2, p0, Le/f/c/u/j0;->a:Le/f/c/u/k0;

    invoke-static {p2}, Le/f/c/u/k0;->b(Le/f/c/u/k0;)Le/f/c/u/i0;

    move-result-object p2

    iget-object v0, p0, Le/f/c/u/j0;->a:Le/f/c/u/k0;

    const-wide/16 v1, 0x0

    invoke-virtual {p2, v0, v1, v2}, Le/f/c/u/i0;->a(Ljava/lang/Runnable;J)V

    .line 8
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Le/f/c/u/j0;->a:Le/f/c/u/k0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
