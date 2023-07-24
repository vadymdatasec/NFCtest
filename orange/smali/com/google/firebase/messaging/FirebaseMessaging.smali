.class public Lcom/google/firebase/messaging/FirebaseMessaging;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/messaging/FirebaseMessaging$a;
    }
.end annotation


# static fields
.field public static g:Le/f/a/a/g;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "FirebaseUnknownNullness"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/f/c/h;

.field public final c:Lcom/google/firebase/iid/FirebaseInstanceId;

.field public final d:Lcom/google/firebase/messaging/FirebaseMessaging$a;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Le/f/a/b/h/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/g<",
            "Le/f/c/u/i0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/f/c/h;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;Le/f/a/a/g;Le/f/c/o/d;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/h;",
            "Lcom/google/firebase/iid/FirebaseInstanceId;",
            "Le/f/c/r/a<",
            "Le/f/c/v/h;",
            ">;",
            "Le/f/c/r/a<",
            "Le/f/c/p/d;",
            ">;",
            "Le/f/c/s/k;",
            "Le/f/a/a/g;",
            "Le/f/c/o/d;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    const-string v0, "com.google.firebase.iid.FirebaseInstanceIdReceiver"

    .line 2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    sput-object p6, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Le/f/a/a/g;

    .line 4
    iput-object p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Le/f/c/h;

    .line 5
    iput-object p2, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 6
    new-instance p6, Lcom/google/firebase/messaging/FirebaseMessaging$a;

    invoke-direct {p6, p0, p7}, Lcom/google/firebase/messaging/FirebaseMessaging$a;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Le/f/c/o/d;)V

    iput-object p6, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Lcom/google/firebase/messaging/FirebaseMessaging$a;

    .line 7
    invoke-virtual {p1}, Le/f/c/h;->b()Landroid/content/Context;

    move-result-object p6

    iput-object p6, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Landroid/content/Context;

    .line 8
    invoke-static {}, Le/f/c/u/j;->a()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p6

    iput-object p6, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Ljava/util/concurrent/Executor;

    .line 9
    new-instance p7, Le/f/c/u/k;

    invoke-direct {p7, p0, p2}, Le/f/c/u/k;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;Lcom/google/firebase/iid/FirebaseInstanceId;)V

    invoke-interface {p6, p7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 10
    new-instance v2, Le/f/c/q/r;

    iget-object p6, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Landroid/content/Context;

    invoke-direct {v2, p6}, Le/f/c/q/r;-><init>(Landroid/content/Context;)V

    iget-object v6, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Landroid/content/Context;

    .line 11
    invoke-static {}, Le/f/c/u/j;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v7

    move-object v0, p1

    move-object v1, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 12
    invoke-static/range {v0 .. v7}, Le/f/c/u/i0;->a(Le/f/c/h;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)Le/f/a/b/h/g;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Le/f/a/b/h/g;

    .line 13
    invoke-static {}, Le/f/c/u/j;->e()Ljava/util/concurrent/Executor;

    move-result-object p2

    new-instance p3, Le/f/c/u/l;

    invoke-direct {p3, p0}, Le/f/c/u/l;-><init>(Lcom/google/firebase/messaging/FirebaseMessaging;)V

    .line 14
    invoke-virtual {p1, p2, p3}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/e;)Le/f/a/b/h/g;

    return-void

    .line 15
    :catch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FirebaseMessaging and FirebaseInstanceId versions not compatible. Update to latest version of firebase-messaging."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic a(Ljava/lang/String;Le/f/c/u/i0;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 4
    invoke-virtual {p1, p0}, Le/f/c/u/i0;->c(Ljava/lang/String;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/google/firebase/messaging/FirebaseMessaging;)Le/f/c/h;
    .locals 0

    .line 10
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Le/f/c/h;

    return-object p0
.end method

.method public static final synthetic a(Le/f/a/b/h/g;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 5
    invoke-virtual {p0}, Le/f/a/b/h/g;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le/f/c/q/p;

    invoke-interface {p0}, Le/f/c/q/p;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/lang/String;Le/f/c/u/i0;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 3
    invoke-virtual {p1, p0}, Le/f/c/u/i0;->d(Ljava/lang/String;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/google/firebase/messaging/FirebaseMessaging;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->e:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public static synthetic c(Lcom/google/firebase/messaging/FirebaseMessaging;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lcom/google/firebase/iid/FirebaseInstanceId;

    return-object p0
.end method

.method public static declared-synchronized c()Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 2

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {}, Le/f/c/h;->j()Le/f/c/h;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance(Le/f/c/h;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static d()Le/f/a/a/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Le/f/a/a/g;

    return-object v0
.end method

.method public static declared-synchronized getInstance(Le/f/c/h;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-class v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-virtual {p0, v0}, Le/f/c/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-string v1, "Firebase Messaging component is not present"

    .line 2
    invoke-static {p0, v1}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public a()Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->c:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->e()Le/f/a/b/h/g;

    move-result-object v0

    sget-object v1, Le/f/c/u/m;->a:Le/f/a/b/h/a;

    .line 2
    invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Le/f/a/b/h/g;

    new-instance v1, Le/f/c/u/n;

    invoke-direct {v1, p1}, Le/f/c/u/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/f;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic a(Lcom/google/firebase/iid/FirebaseInstanceId;)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Lcom/google/firebase/messaging/FirebaseMessaging$a;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging$a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->g()Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final synthetic a(Le/f/c/u/i0;)V
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/google/firebase/messaging/FirebaseMessaging;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p1}, Le/f/c/u/i0;->d()V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->f:Le/f/a/b/h/g;

    new-instance v1, Le/f/c/u/o;

    invoke-direct {v1, p1}, Le/f/c/u/o;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/g;->a(Le/f/a/b/h/f;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/FirebaseMessaging;->d:Lcom/google/firebase/messaging/FirebaseMessaging$a;

    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging$a;->b()Z

    move-result v0

    return v0
.end method
