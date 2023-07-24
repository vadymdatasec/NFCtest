.class public Le/f/c/u/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Landroid/content/Context;

.field public final c:Le/f/c/u/a0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/f/c/u/a0;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, Le/f/c/u/d;->a:Ljava/util/concurrent/Executor;

    .line 3
    iput-object p1, p0, Le/f/c/u/d;->b:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Le/f/c/u/d;->c:Le/f/c/u/a0;

    return-void
.end method


# virtual methods
.method public final a(Lc/h/e/c0$a;Le/f/c/u/x;)V
    .locals 5

    const-string v0, "FirebaseMessaging"

    if-nez p2, :cond_0

    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Le/f/c/u/x;->m()Le/f/a/b/h/g;

    move-result-object v1

    const-wide/16 v2, 0x5

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v1, v2, v3, v4}, Le/f/a/b/h/n;->a(Le/f/a/b/h/g;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 9
    invoke-virtual {p1, v1}, Lc/h/e/c0$a;->b(Landroid/graphics/Bitmap;)Lc/h/e/c0$a;

    .line 10
    new-instance v2, Lc/h/e/x;

    invoke-direct {v2}, Lc/h/e/x;-><init>()V

    invoke-virtual {v2, v1}, Lc/h/e/x;->b(Landroid/graphics/Bitmap;)Lc/h/e/x;

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lc/h/e/x;->a(Landroid/graphics/Bitmap;)Lc/h/e/x;

    invoke-virtual {p1, v2}, Lc/h/e/c0$a;->a(Lc/h/e/d0;)Lc/h/e/c0$a;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "Failed to download image in time, showing notification without it"

    .line 11
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    invoke-virtual {p2}, Le/f/c/u/x;->close()V

    return-void

    :catch_1
    const-string p1, "Interrupted while downloading image, showing notification without it"

    .line 13
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    invoke-virtual {p2}, Le/f/c/u/x;->close()V

    .line 15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    return-void

    :catch_2
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, 0x1a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "Failed to download image: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final a(Le/f/c/u/a;)V
    .locals 3

    const-string v0, "FirebaseMessaging"

    const/4 v1, 0x3

    .line 17
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Showing notification"

    .line 18
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    :cond_0
    iget-object v0, p0, Le/f/c/u/d;->b:Landroid/content/Context;

    const-string v1, "notification"

    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 21
    iget-object v1, p1, Le/f/c/u/a;->b:Ljava/lang/String;

    iget v2, p1, Le/f/c/u/a;->c:I

    iget-object p1, p1, Le/f/c/u/a;->a:Lc/h/e/c0$a;

    invoke-virtual {p1}, Lc/h/e/c0$a;->a()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    return-void
.end method

.method public a()Z
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/c/u/d;->c:Le/f/c/u/a0;

    const-string v1, "gcm.n.noui"

    invoke-virtual {v0, v1}, Le/f/c/u/a0;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p0}, Le/f/c/u/d;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 3
    :cond_1
    invoke-virtual {p0}, Le/f/c/u/d;->c()Le/f/c/u/x;

    move-result-object v0

    .line 4
    iget-object v2, p0, Le/f/c/u/d;->b:Landroid/content/Context;

    iget-object v3, p0, Le/f/c/u/d;->c:Le/f/c/u/a0;

    .line 5
    invoke-static {v2, v3}, Le/f/c/u/b;->b(Landroid/content/Context;Le/f/c/u/a0;)Le/f/c/u/a;

    move-result-object v2

    .line 6
    iget-object v3, v2, Le/f/c/u/a;->a:Lc/h/e/c0$a;

    invoke-virtual {p0, v3, v0}, Le/f/c/u/d;->a(Lc/h/e/c0$a;Le/f/c/u/x;)V

    .line 7
    invoke-virtual {p0, v2}, Le/f/c/u/d;->a(Le/f/c/u/a;)V

    return v1
.end method

.method public final b()Z
    .locals 5

    .line 1
    iget-object v0, p0, Le/f/c/u/d;->b:Landroid/content/Context;

    const-string v1, "keyguard"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    .line 3
    invoke-virtual {v0}, Landroid/app/KeyguardManager;->inKeyguardRestrictedInputMode()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 4
    :cond_0
    invoke-static {}, Le/f/a/b/c/p/h;->f()Z

    move-result v0

    if-nez v0, :cond_1

    const-wide/16 v2, 0xa

    .line 5
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    .line 6
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 7
    iget-object v2, p0, Le/f/c/u/d;->b:Landroid/content/Context;

    const-string v3, "activity"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/ActivityManager;

    .line 8
    invoke-virtual {v2}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 9
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 10
    iget v4, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v4, v0, :cond_2

    .line 11
    iget v0, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v2, 0x64

    if-ne v0, v2, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    return v1
.end method

.method public final c()Le/f/c/u/x;
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/u/d;->c:Le/f/c/u/a0;

    const-string v1, "gcm.n.image"

    invoke-virtual {v0, v1}, Le/f/c/u/a0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Le/f/c/u/x;->b(Ljava/lang/String;)Le/f/c/u/x;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Le/f/c/u/d;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1}, Le/f/c/u/x;->a(Ljava/util/concurrent/Executor;)V

    :cond_0
    return-object v0
.end method
