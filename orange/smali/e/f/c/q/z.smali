.class public Le/f/c/q/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:J

.field public final c:Landroid/os/PowerManager$WakeLock;

.field public final d:Lcom/google/firebase/iid/FirebaseInstanceId;

.field public e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Le/f/c/q/h;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Le/f/c/q/z;->e:Ljava/util/concurrent/ExecutorService;

    .line 3
    iput-object p1, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 4
    iput-wide p2, p0, Le/f/c/q/z;->b:J

    .line 5
    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object p1

    const-string p2, "power"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    const/4 p2, 0x1

    const-string p3, "fiid-sync"

    .line 6
    invoke-virtual {p1, p2, p3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object p1

    iput-object p1, p0, Le/f/c/q/z;->c:Landroid/os/PowerManager$WakeLock;

    const/4 p2, 0x0

    .line 7
    invoke-virtual {p1, p2}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    return-void
.end method

.method public static synthetic a(Le/f/c/q/z;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 0

    .line 8
    iget-object p0, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    return-object p0
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    .line 7
    iget-object v0, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->b()Le/f/c/h;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->b()Le/f/c/h;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[DEFAULT]"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    const-string v1, "FirebaseInstanceId"

    .line 2
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Invoking onNewToken for app: "

    .line 3
    iget-object v2, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v2}, Lcom/google/firebase/iid/FirebaseInstanceId;->b()Le/f/c/h;

    move-result-object v2

    invoke-virtual {v2}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    :goto_0
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.firebase.messaging.NEW_TOKEN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "token"

    .line 5
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    new-instance p1, Le/f/c/q/f;

    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Le/f/c/q/z;->e:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p1, v1, v2}, Le/f/c/q/f;-><init>(Landroid/content/Context;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {p1, v0}, Le/f/c/q/f;->a(Landroid/content/Intent;)Le/f/a/b/h/g;

    :cond_2
    return-void
.end method

.method public b()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "FirebaseInstanceId"

    .line 1
    iget-object v1, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->h()Le/f/c/q/x$a;

    move-result-object v1

    .line 2
    iget-object v2, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v2, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/q/x$a;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    return v3

    :cond_0
    const/4 v2, 0x0

    .line 3
    :try_start_0
    iget-object v4, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v4}, Lcom/google/firebase/iid/FirebaseInstanceId;->a()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    const-string v1, "Token retrieval failed: null"

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_1
    const/4 v5, 0x3

    .line 5
    invoke-static {v0, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "Token successfully retrieved"

    .line 6
    invoke-static {v0, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    if-eqz v1, :cond_3

    if-eqz v1, :cond_4

    .line 7
    iget-object v1, v1, Le/f/c/q/x$a;->a:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 8
    :cond_3
    invoke-virtual {p0, v4}, Le/f/c/q/z;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    return v3

    :catch_0
    const-string v1, "Token retrieval failed with SecurityException. Will retry token retrieval"

    .line 9
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :catch_1
    move-exception v1

    .line 10
    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Le/f/c/q/o;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 11
    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x34

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Token retrieval failed: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Will retry token retrieval"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 12
    :cond_5
    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6

    const-string v1, "Token retrieval failed without exception message. Will retry token retrieval"

    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    .line 14
    :cond_6
    throw v1
.end method

.method public run()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Wakelock"
        }
    .end annotation

    .line 1
    invoke-static {}, Le/f/c/q/w;->b()Le/f/c/q/w;

    move-result-object v0

    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/c/q/z;->c:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    :cond_0
    const/4 v0, 0x0

    .line 3
    :try_start_0
    iget-object v1, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Z)V

    .line 4
    iget-object v1, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->i()Z

    move-result v1

    if-nez v1, :cond_2

    .line 5
    iget-object v1, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v1, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-static {}, Le/f/c/q/w;->b()Le/f/c/q/w;

    move-result-object v0

    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Le/f/c/q/z;->c:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_1
    return-void

    .line 8
    :cond_2
    :try_start_1
    invoke-static {}, Le/f/c/q/w;->b()Le/f/c/q/w;

    move-result-object v1

    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/q/w;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 9
    invoke-virtual {p0}, Le/f/c/q/z;->b()Z

    move-result v1

    if-nez v1, :cond_4

    .line 10
    new-instance v1, Le/f/c/q/y;

    invoke-direct {v1, p0}, Le/f/c/q/y;-><init>(Le/f/c/q/z;)V

    .line 11
    invoke-virtual {v1}, Le/f/c/q/y;->a()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    invoke-static {}, Le/f/c/q/w;->b()Le/f/c/q/w;

    move-result-object v0

    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 13
    iget-object v0, p0, Le/f/c/q/z;->c:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_3
    return-void

    .line 14
    :cond_4
    :try_start_2
    invoke-virtual {p0}, Le/f/c/q/z;->c()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 15
    iget-object v1, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v1, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Z)V

    goto :goto_0

    .line 16
    :cond_5
    iget-object v1, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    iget-wide v2, p0, Le/f/c/q/z;->b:J

    invoke-virtual {v1, v2, v3}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(J)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 17
    :goto_0
    invoke-static {}, Le/f/c/q/w;->b()Le/f/c/q/w;

    move-result-object v0

    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 18
    iget-object v0, p0, Le/f/c/q/z;->c:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_3
    const-string v2, "FirebaseInstanceId"

    .line 19
    invoke-virtual {v1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x5d

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Topic sync or token retrieval failed on hard failure exceptions: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Won\'t retry the operation."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 20
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    iget-object v1, p0, Le/f/c/q/z;->d:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v1, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 22
    invoke-static {}, Le/f/c/q/w;->b()Le/f/c/q/w;

    move-result-object v0

    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/q/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 23
    iget-object v0, p0, Le/f/c/q/z;->c:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_6
    return-void

    .line 24
    :goto_1
    invoke-static {}, Le/f/c/q/w;->b()Le/f/c/q/w;

    move-result-object v1

    invoke-virtual {p0}, Le/f/c/q/z;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/f/c/q/w;->b(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 25
    iget-object v1, p0, Le/f/c/q/z;->c:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 26
    :cond_7
    throw v0
.end method
