.class public Le/f/c/l/e/k/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/l/e/k/b;
.implements Le/f/c/l/e/k/a;


# instance fields
.field public final a:Le/f/c/l/e/k/e;

.field public final b:I

.field public final c:Ljava/util/concurrent/TimeUnit;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public constructor <init>(Le/f/c/l/e/k/e;ILjava/util/concurrent/TimeUnit;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/f/c/l/e/k/c;->d:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Le/f/c/l/e/k/c;->a:Le/f/c/l/e/k/e;

    .line 4
    iput p2, p0, Le/f/c/l/e/k/c;->b:I

    .line 5
    iput-object p3, p0, Le/f/c/l/e/k/c;->c:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/c/l/e/k/c;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    const-string v2, "Logging Crashlytics event to Firebase"

    invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 3
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v1, p0, Le/f/c/l/e/k/c;->e:Ljava/util/concurrent/CountDownLatch;

    .line 4
    iget-object v1, p0, Le/f/c/l/e/k/c;->a:Le/f/c/l/e/k/e;

    invoke-virtual {v1, p1, p2}, Le/f/c/l/e/k/e;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 5
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "Awaiting app exception callback from FA..."

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :try_start_1
    iget-object p1, p0, Le/f/c/l/e/k/c;->e:Ljava/util/concurrent/CountDownLatch;

    iget p2, p0, Le/f/c/l/e/k/c;->b:I

    int-to-long v1, p2

    iget-object p2, p0, Le/f/c/l/e/k/c;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2, p2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 7
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "App exception callback received from FA listener."

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "Timeout exceeded while awaiting app exception callback from FA listener."

    .line 9
    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 10
    :catch_0
    :try_start_2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "Interrupted while awaiting app exception callback from FA listener."

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Le/f/c/l/e/k/c;->e:Ljava/util/concurrent/CountDownLatch;

    .line 12
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
