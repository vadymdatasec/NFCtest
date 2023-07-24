.class public Lcom/google/firebase/iid/FirebaseInstanceId;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final h:J

.field public static i:Le/f/c/q/x;

.field public static final j:Ljava/util/regex/Pattern;

.field public static k:Ljava/util/concurrent/ScheduledExecutorService;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Le/f/c/h;

.field public final c:Le/f/c/q/r;

.field public final d:Le/f/c/q/o;

.field public final e:Le/f/c/q/v;

.field public final f:Le/f/c/s/k;

.field public g:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x8

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Lcom/google/firebase/iid/FirebaseInstanceId;->h:J

    const-string v0, "\\AA[\\w-]{38}\\z"

    .line 2
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/iid/FirebaseInstanceId;->j:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Le/f/c/h;Le/f/c/q/r;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/h;",
            "Le/f/c/q/r;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Le/f/c/r/a<",
            "Le/f/c/v/h;",
            ">;",
            "Le/f/c/r/a<",
            "Le/f/c/p/d;",
            ">;",
            "Le/f/c/s/k;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->g:Z

    .line 8
    invoke-static {p1}, Le/f/c/q/r;->a(Le/f/c/h;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    monitor-enter v0

    .line 10
    :try_start_0
    sget-object v1, Lcom/google/firebase/iid/FirebaseInstanceId;->i:Le/f/c/q/x;

    if-nez v1, :cond_0

    .line 11
    new-instance v1, Le/f/c/q/x;

    invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Le/f/c/q/x;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/google/firebase/iid/FirebaseInstanceId;->i:Le/f/c/q/x;

    .line 12
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iput-object p1, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    .line 14
    iput-object p2, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->c:Le/f/c/q/r;

    .line 15
    new-instance v0, Le/f/c/q/o;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v1 .. v6}, Le/f/c/q/o;-><init>(Le/f/c/h;Le/f/c/q/r;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V

    iput-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->d:Le/f/c/q/o;

    .line 16
    iput-object p4, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->a:Ljava/util/concurrent/Executor;

    .line 17
    new-instance p1, Le/f/c/q/v;

    invoke-direct {p1, p3}, Le/f/c/q/v;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->e:Le/f/c/q/v;

    .line 18
    iput-object p7, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->f:Le/f/c/s/k;

    return-void

    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 20
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Le/f/c/h;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/h;",
            "Le/f/c/r/a<",
            "Le/f/c/v/h;",
            ">;",
            "Le/f/c/r/a<",
            "Le/f/c/p/d;",
            ">;",
            "Le/f/c/s/k;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v2, Le/f/c/q/r;

    .line 2
    invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Le/f/c/q/r;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-static {}, Le/f/c/q/h;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    .line 4
    invoke-static {}, Le/f/c/q/h;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    .line 5
    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/iid/FirebaseInstanceId;-><init>(Le/f/c/h;Le/f/c/q/r;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V

    return-void
.end method

.method public static a(Le/f/c/h;)V
    .locals 2

    .line 13
    invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/i;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google."

    .line 14
    invoke-static {v0, v1}, Le/f/a/b/c/m/h;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/i;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase."

    .line 16
    invoke-static {v0, v1}, Le/f/a/b/c/m/h;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/i;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google."

    .line 18
    invoke-static {v0, v1}, Le/f/a/b/c/m/h;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/i;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->b(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options."

    .line 20
    invoke-static {v0, v1}, Le/f/a/b/c/m/h;->a(ZLjava/lang/Object;)V

    .line 21
    invoke-virtual {p0}, Le/f/c/h;->d()Le/f/c/i;

    move-result-object p0

    invoke-virtual {p0}, Le/f/c/i;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Ljava/lang/String;)Z

    move-result p0

    const-string v0, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options."

    .line 22
    invoke-static {p0, v0}, Le/f/a/b/c/m/h;->a(ZLjava/lang/Object;)V

    return-void
.end method

.method public static final synthetic a(Ljava/util/concurrent/CountDownLatch;Le/f/a/b/h/g;)V
    .locals 0

    .line 40
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    .line 23
    sget-object v0, Lcom/google/firebase/iid/FirebaseInstanceId;->j:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0
.end method

.method public static b(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/g<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const-string v0, "Task must not be null"

    .line 7
    invoke-static {p0, v0}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 9
    sget-object v1, Le/f/c/q/j;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Le/f/c/q/k;

    invoke-direct {v2, v0}, Le/f/c/q/k;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {p0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)Le/f/a/b/h/g;

    .line 10
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 11
    invoke-static {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->c(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    const-string v0, ":"

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static c(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/g<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 5
    invoke-virtual {p0}, Le/f/a/b/h/g;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0}, Le/f/a/b/h/g;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Le/f/a/b/h/g;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    invoke-virtual {p0}, Le/f/a/b/h/g;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 10
    :cond_1
    new-instance p0, Ljava/lang/IllegalThreadStateException;

    const-string v0, "Firebase Installations getId Task has timed out."

    invoke-direct {p0, v0}, Ljava/lang/IllegalThreadStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 11
    :cond_2
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "fcm"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gcm"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, "*"

    return-object p0
.end method

.method public static getInstance(Le/f/c/h;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/h;)V

    .line 2
    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {p0, v0}, Le/f/c/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/iid/FirebaseInstanceId;

    const-string v0, "Firebase Instance ID component is not present"

    .line 3
    invoke-static {p0, v0}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public static m()Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 1

    .line 1
    invoke-static {}, Le/f/c/h;->j()Le/f/c/h;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->getInstance(Le/f/c/h;)Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object v0

    return-object v0
.end method

.method public static n()Z
    .locals 4

    const/4 v0, 0x3

    const-string v1, "FirebaseInstanceId"

    .line 1
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-ne v2, v3, :cond_0

    .line 2
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Le/f/a/b/h/g<",
            "Le/f/c/q/p;",
            ">;"
        }
    .end annotation

    .line 24
    invoke-static {p2}, Lcom/google/firebase/iid/FirebaseInstanceId;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 25
    invoke-static {v0}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Le/f/c/q/i;

    invoke-direct {v2, p0, p1, p2}, Le/f/c/q/i;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->b(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Ljava/lang/String;Ljava/lang/String;Le/f/a/b/h/g;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 41
    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->d()Ljava/lang/String;

    move-result-object p3

    .line 42
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/iid/FirebaseInstanceId;->c(Ljava/lang/String;Ljava/lang/String;)Le/f/c/q/x$a;

    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/q/x$a;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 44
    new-instance p1, Le/f/c/q/q;

    iget-object p2, v0, Le/f/c/q/x$a;->a:Ljava/lang/String;

    invoke-direct {p1, p3, p2}, Le/f/c/q/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->e:Le/f/c/q/v;

    new-instance v1, Le/f/c/q/l;

    invoke-direct {v1, p0, p3, p1, p2}, Le/f/c/q/l;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2, v1}, Le/f/c/q/v;->a(Ljava/lang/String;Ljava/lang/String;Le/f/c/q/v$a;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 3

    .line 46
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->d:Le/f/c/q/o;

    invoke-virtual {v0, p1, p2, p3}, Le/f/c/q/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;

    move-result-object v0

    .line 47
    iget-object v1, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->a:Ljava/util/concurrent/Executor;

    new-instance v2, Le/f/c/q/m;

    invoke-direct {v2, p0, p2, p3, p1}, Le/f/c/q/m;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 48
    sget-object v0, Lcom/google/firebase/iid/FirebaseInstanceId;->i:Le/f/c/q/x;

    .line 49
    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->f()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->c:Le/f/c/q/r;

    .line 50
    invoke-virtual {v2}, Le/f/c/q/r;->a()Ljava/lang/String;

    move-result-object v5

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    .line 51
    invoke-virtual/range {v0 .. v5}, Le/f/c/q/x;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    new-instance p1, Le/f/c/q/q;

    invoke-direct {p1, p3, p4}, Le/f/c/q/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/g<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x7530

    .line 29
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1, v0, v1, v2}, Le/f/a/b/h/n;->a(Le/f/a/b/h/g;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 30
    :catch_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "SERVICE_NOT_AVAILABLE"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_1
    move-exception p1

    .line 31
    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 32
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_1

    .line 33
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "INSTANCE_ID_RESET"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 34
    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->j()V

    .line 35
    :cond_0
    check-cast v0, Ljava/io/IOException;

    throw v0

    .line 36
    :cond_1
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_2

    .line 37
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 38
    :cond_2
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public a()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-static {v0}, Le/f/c/q/r;->a(Le/f/c/h;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "*"

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized a(J)V
    .locals 5

    monitor-enter p0

    const-wide/16 v0, 0x1e

    const/4 v2, 0x1

    shl-long v3, p1, v2

    .line 3
    :try_start_0
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sget-wide v3, Lcom/google/firebase/iid/FirebaseInstanceId;->h:J

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 4
    new-instance v3, Le/f/c/q/z;

    invoke-direct {v3, p0, v0, v1}, Le/f/c/q/z;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;J)V

    .line 5
    invoke-virtual {p0, v3, p1, p2}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Ljava/lang/Runnable;J)V

    .line 6
    iput-boolean v2, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Ljava/lang/Runnable;J)V
    .locals 5

    .line 8
    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    monitor-enter v0

    .line 9
    :try_start_0
    sget-object v1, Lcom/google/firebase/iid/FirebaseInstanceId;->k:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v1, :cond_0

    .line 10
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v2, 0x1

    new-instance v3, Le/f/a/b/c/p/l/a;

    const-string v4, "FirebaseInstanceId"

    invoke-direct {v3, v4}, Le/f/a/b/c/p/l/a;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v1, Lcom/google/firebase/iid/FirebaseInstanceId;->k:Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    :cond_0
    sget-object v1, Lcom/google/firebase/iid/FirebaseInstanceId;->k:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, p1, p2, p3, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 12
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public declared-synchronized a(Z)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-boolean p1, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Le/f/c/q/x$a;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 39
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->c:Le/f/c/q/r;

    invoke-virtual {v0}, Le/f/c/q/r;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/f/c/q/x$a;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public b()Le/f/c/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-static {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/h;)V

    .line 4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/c/q/p;

    invoke-interface {p1}, Le/f/c/q/p;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "MAIN_THREAD"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)Le/f/c/q/x$a;
    .locals 2

    .line 4
    sget-object v0, Lcom/google/firebase/iid/FirebaseInstanceId;->i:Le/f/c/q/x;

    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Le/f/c/q/x;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/c/q/x$a;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-static {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/h;)V

    .line 2
    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->l()V

    .line 3
    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/firebase/iid/FirebaseInstanceId;->i:Le/f/c/q/x;

    iget-object v1, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-virtual {v1}, Le/f/c/h;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/q/x;->c(Ljava/lang/String;)J

    .line 2
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->f:Le/f/c/s/k;

    invoke-interface {v0}, Le/f/c/s/k;->a()Le/f/a/b/h/g;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->b(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public e()Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Le/f/c/q/p;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-static {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/h;)V

    .line 2
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-static {v0}, Le/f/c/q/r;->a(Le/f/c/h;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "*"

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-virtual {v0}, Le/f/c/h;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[DEFAULT]"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-virtual {v0}, Le/f/c/h;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-static {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/h;)V

    .line 2
    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->h()Le/f/c/q/x$a;

    move-result-object v0

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/q/x$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->k()V

    .line 5
    :cond_0
    invoke-static {v0}, Le/f/c/q/x$a;->a(Le/f/c/q/x$a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Le/f/c/q/x$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->b:Le/f/c/h;

    invoke-static {v0}, Le/f/c/q/r;->a(Le/f/c/h;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "*"

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->c(Ljava/lang/String;Ljava/lang/String;)Le/f/c/q/x$a;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->c:Le/f/c/q/r;

    invoke-virtual {v0}, Le/f/c/q/r;->e()Z

    move-result v0

    return v0
.end method

.method public declared-synchronized j()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    sget-object v0, Lcom/google/firebase/iid/FirebaseInstanceId;->i:Le/f/c/q/x;

    invoke-virtual {v0}, Le/f/c/q/x;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized k()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/google/firebase/iid/FirebaseInstanceId;->g:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final l()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->h()Le/f/c/q/x$a;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->a(Le/f/c/q/x$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/google/firebase/iid/FirebaseInstanceId;->k()V

    :cond_0
    return-void
.end method
