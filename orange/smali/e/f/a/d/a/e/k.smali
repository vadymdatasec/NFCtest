.class public final Le/f/a/d/a/e/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/f/a/d/a/e/a;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f/a/d/a/e/b;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z

.field public final f:Landroid/content/Intent;

.field public final g:Le/f/a/d/a/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/g<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Le/f/a/d/a/e/f;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Landroid/os/IBinder$DeathRecipient;

.field public j:Landroid/content/ServiceConnection;

.field public k:Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Le/f/a/d/a/e/k;->l:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le/f/a/d/a/e/a;Ljava/lang/String;Landroid/content/Intent;Le/f/a/d/a/e/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/f/a/d/a/e/a;",
            "Ljava/lang/String;",
            "Landroid/content/Intent;",
            "Le/f/a/d/a/e/g<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/f/a/d/a/e/k;->d:Ljava/util/List;

    new-instance v0, Le/f/a/d/a/e/c;

    invoke-direct {v0, p0}, Le/f/a/d/a/e/c;-><init>(Le/f/a/d/a/e/k;)V

    iput-object v0, p0, Le/f/a/d/a/e/k;->i:Landroid/os/IBinder$DeathRecipient;

    iput-object p1, p0, Le/f/a/d/a/e/k;->a:Landroid/content/Context;

    iput-object p2, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    iput-object p3, p0, Le/f/a/d/a/e/k;->c:Ljava/lang/String;

    iput-object p4, p0, Le/f/a/d/a/e/k;->f:Landroid/content/Intent;

    iput-object p5, p0, Le/f/a/d/a/e/k;->g:Le/f/a/d/a/e/g;

    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Le/f/a/d/a/e/k;->h:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static synthetic a(Le/f/a/d/a/e/k;)Landroid/os/IInterface;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/e/k;->k:Landroid/os/IInterface;

    return-object p0
.end method

.method public static synthetic a(Le/f/a/d/a/e/k;Landroid/os/IInterface;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/e/k;->k:Landroid/os/IInterface;

    return-void
.end method

.method public static synthetic a(Le/f/a/d/a/e/k;Le/f/a/d/a/e/b;)V
    .locals 4

    iget-object v0, p0, Le/f/a/d/a/e/k;->k:Landroid/os/IInterface;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Le/f/a/d/a/e/k;->e:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Initiate binding to the service."

    invoke-virtual {v0, v3, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Le/f/a/d/a/e/k;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Le/f/a/d/a/e/j;

    invoke-direct {p1, p0}, Le/f/a/d/a/e/j;-><init>(Le/f/a/d/a/e/k;)V

    iput-object p1, p0, Le/f/a/d/a/e/k;->j:Landroid/content/ServiceConnection;

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/f/a/d/a/e/k;->e:Z

    iget-object v2, p0, Le/f/a/d/a/e/k;->a:Landroid/content/Context;

    iget-object v3, p0, Le/f/a/d/a/e/k;->f:Landroid/content/Intent;

    invoke-virtual {v2, v3, p1, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "Failed to bind to the service."

    invoke-virtual {p1, v2, v0}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean v1, p0, Le/f/a/d/a/e/k;->e:Z

    iget-object p1, p0, Le/f/a/d/a/e/k;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/d/a/e/b;

    invoke-virtual {v0}, Le/f/a/d/a/e/b;->b()Le/f/a/d/a/i/o;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/play/core/internal/ar;

    invoke-direct {v1}, Lcom/google/android/play/core/internal/ar;-><init>()V

    invoke-virtual {v0, v1}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    iget-object p0, p0, Le/f/a/d/a/e/k;->d:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    :cond_2
    return-void

    :cond_3
    iget-boolean v0, p0, Le/f/a/d/a/e/k;->e:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Waiting to bind to the service."

    invoke-virtual {v0, v2, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p0, p0, Le/f/a/d/a/e/k;->d:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_4
    invoke-virtual {p1}, Le/f/a/d/a/e/b;->run()V

    return-void
.end method

.method public static synthetic b(Le/f/a/d/a/e/k;)Le/f/a/d/a/e/a;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    return-object p0
.end method

.method public static synthetic b(Le/f/a/d/a/e/k;Le/f/a/d/a/e/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/b;)V

    return-void
.end method

.method public static synthetic c(Le/f/a/d/a/e/k;)Landroid/content/ServiceConnection;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/e/k;->j:Landroid/content/ServiceConnection;

    return-object p0
.end method

.method public static synthetic d(Le/f/a/d/a/e/k;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/e/k;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic e(Le/f/a/d/a/e/k;)Le/f/a/d/a/e/g;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/e/k;->g:Le/f/a/d/a/e/g;

    return-object p0
.end method

.method public static synthetic f(Le/f/a/d/a/e/k;)V
    .locals 4

    iget-object v0, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "linkToDeath"

    invoke-virtual {v0, v3, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Le/f/a/d/a/e/k;->k:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v2, p0, Le/f/a/d/a/e/k;->i:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, v2, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object p0, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "linkToDeath failed"

    invoke-virtual {p0, v0, v2, v1}, Le/f/a/d/a/e/a;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g(Le/f/a/d/a/e/k;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/e/k;->d:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic h(Le/f/a/d/a/e/k;)V
    .locals 4

    iget-object v0, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "unlinkToDeath"

    invoke-virtual {v0, v3, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Le/f/a/d/a/e/k;->k:Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object p0, p0, Le/f/a/d/a/e/k;->i:Landroid/os/IBinder$DeathRecipient;

    invoke-interface {v0, p0, v1}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    return-void
.end method

.method public static synthetic i(Le/f/a/d/a/e/k;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Le/f/a/d/a/e/k;->j:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static synthetic j(Le/f/a/d/a/e/k;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Le/f/a/d/a/e/k;->e:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    new-instance v0, Le/f/a/d/a/e/e;

    invoke-direct {v0, p0}, Le/f/a/d/a/e/e;-><init>(Le/f/a/d/a/e/k;)V

    invoke-virtual {p0, v0}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/b;)V

    return-void
.end method

.method public final a(Le/f/a/d/a/e/b;)V
    .locals 2

    new-instance v0, Le/f/a/d/a/e/d;

    invoke-virtual {p1}, Le/f/a/d/a/e/b;->b()Le/f/a/d/a/i/o;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Le/f/a/d/a/e/d;-><init>(Le/f/a/d/a/e/k;Le/f/a/d/a/i/o;Le/f/a/d/a/e/b;)V

    invoke-virtual {p0, v0}, Le/f/a/d/a/e/k;->b(Le/f/a/d/a/e/b;)V

    return-void
.end method

.method public final b()Landroid/os/IInterface;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/e/k;->k:Landroid/os/IInterface;

    return-object v0
.end method

.method public final b(Le/f/a/d/a/e/b;)V
    .locals 5

    sget-object v0, Le/f/a/d/a/e/k;->l:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    sget-object v1, Le/f/a/d/a/e/k;->l:Ljava/util/Map;

    iget-object v2, p0, Le/f/a/d/a/e/k;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/HandlerThread;

    iget-object v2, p0, Le/f/a/d/a/e/k;->c:Ljava/lang/String;

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    sget-object v2, Le/f/a/d/a/e/k;->l:Ljava/util/Map;

    iget-object v3, p0, Le/f/a/d/a/e/k;->c:Ljava/lang/String;

    new-instance v4, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v4, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v1, Le/f/a/d/a/e/k;->l:Ljava/util/Map;

    iget-object v2, p0, Le/f/a/d/a/e/k;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final bridge synthetic c()V
    .locals 5

    iget-object v0, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "reportBinderDeath"

    invoke-virtual {v0, v3, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Le/f/a/d/a/e/k;->h:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/d/a/e/f;

    if-nez v0, :cond_3

    iget-object v0, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Le/f/a/d/a/e/k;->c:Ljava/lang/String;

    aput-object v3, v2, v1

    const-string v1, "%s : Binder has died."

    invoke-virtual {v0, v1, v2}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Le/f/a/d/a/e/k;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/d/a/e/b;

    invoke-virtual {v1}, Le/f/a/d/a/e/b;->b()Le/f/a/d/a/i/o;

    move-result-object v1

    if-eqz v1, :cond_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xf

    if-ge v2, v3, :cond_1

    new-instance v2, Landroid/os/RemoteException;

    invoke-direct {v2}, Landroid/os/RemoteException;-><init>()V

    goto :goto_1

    :cond_1
    new-instance v2, Landroid/os/RemoteException;

    iget-object v3, p0, Le/f/a/d/a/e/k;->c:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, " : Binder has died."

    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v1, v2}, Le/f/a/d/a/i/o;->b(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Le/f/a/d/a/e/k;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :cond_3
    iget-object v2, p0, Le/f/a/d/a/e/k;->b:Le/f/a/d/a/e/a;

    new-array v1, v1, [Ljava/lang/Object;

    const-string v3, "calling onBinderDied"

    invoke-virtual {v2, v3, v1}, Le/f/a/d/a/e/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0}, Le/f/a/d/a/e/f;->a()V

    return-void
.end method
