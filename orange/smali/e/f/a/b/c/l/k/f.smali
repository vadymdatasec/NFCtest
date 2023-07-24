.class public Le/f/a/b/c/l/k/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final m:Lcom/google/android/gms/common/api/Status;

.field public static final n:Lcom/google/android/gms/common/api/Status;

.field public static final o:Ljava/lang/Object;

.field public static p:Le/f/a/b/c/l/k/f;


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public final d:Landroid/content/Context;

.field public final e:Le/f/a/b/c/e;

.field public final f:Le/f/a/b/c/m/e;

.field public final g:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Le/f/a/b/c/l/k/a0<",
            "*>;",
            "Le/f/a/b/c/l/k/c<",
            "*>;>;"
        }
    .end annotation
.end field

.field public i:Le/f/a/b/c/l/k/m;

.field public final j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/f/a/b/c/l/k/a0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/f/a/b/c/l/k/a0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final l:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x4

    const-string v2, "Sign-out occurred while this API call was in progress."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Le/f/a/b/c/l/k/f;->m:Lcom/google/android/gms/common/api/Status;

    .line 2
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v2, "The user must be signed in to make this API call."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Le/f/a/b/c/l/k/f;->n:Lcom/google/android/gms/common/api/Status;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le/f/a/b/c/l/k/f;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Le/f/a/b/c/e;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1388

    .line 2
    iput-wide v0, p0, Le/f/a/b/c/l/k/f;->a:J

    const-wide/32 v0, 0x1d4c0

    .line 3
    iput-wide v0, p0, Le/f/a/b/c/l/k/f;->b:J

    const-wide/16 v0, 0x2710

    .line 4
    iput-wide v0, p0, Le/f/a/b/c/l/k/f;->c:J

    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Le/f/a/b/c/l/k/f;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v2, 0x5

    const/high16 v3, 0x3f400000    # 0.75f

    invoke-direct {v0, v2, v3, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    iput-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Le/f/a/b/c/l/k/f;->i:Le/f/a/b/c/l/k/m;

    .line 9
    new-instance v0, Lc/e/d;

    invoke-direct {v0}, Lc/e/d;-><init>()V

    iput-object v0, p0, Le/f/a/b/c/l/k/f;->j:Ljava/util/Set;

    .line 10
    new-instance v0, Lc/e/d;

    invoke-direct {v0}, Lc/e/d;-><init>()V

    iput-object v0, p0, Le/f/a/b/c/l/k/f;->k:Ljava/util/Set;

    .line 11
    iput-object p1, p0, Le/f/a/b/c/l/k/f;->d:Landroid/content/Context;

    .line 12
    new-instance p1, Le/f/a/b/e/a/b;

    invoke-direct {p1, p2, p0}, Le/f/a/b/e/a/b;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Le/f/a/b/c/l/k/f;->l:Landroid/os/Handler;

    .line 13
    iput-object p3, p0, Le/f/a/b/c/l/k/f;->e:Le/f/a/b/c/e;

    .line 14
    new-instance p1, Le/f/a/b/c/m/e;

    invoke-direct {p1, p3}, Le/f/a/b/c/m/e;-><init>(Le/f/a/b/c/f;)V

    iput-object p1, p0, Le/f/a/b/c/l/k/f;->f:Le/f/a/b/c/m/e;

    .line 15
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->l:Landroid/os/Handler;

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public static synthetic a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;
    .locals 0

    .line 22
    iget-object p0, p0, Le/f/a/b/c/l/k/f;->l:Landroid/os/Handler;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Le/f/a/b/c/l/k/f;
    .locals 4

    .line 1
    sget-object v0, Le/f/a/b/c/l/k/f;->o:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Le/f/a/b/c/l/k/f;->p:Le/f/a/b/c/l/k/f;

    if-nez v1, :cond_0

    .line 3
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "GoogleApiHandler"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 4
    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    .line 5
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    .line 6
    new-instance v2, Le/f/a/b/c/l/k/f;

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {}, Le/f/a/b/c/e;->b()Le/f/a/b/c/e;

    move-result-object v3

    invoke-direct {v2, p0, v1, v3}, Le/f/a/b/c/l/k/f;-><init>(Landroid/content/Context;Landroid/os/Looper;Le/f/a/b/c/e;)V

    sput-object v2, Le/f/a/b/c/l/k/f;->p:Le/f/a/b/c/l/k/f;

    .line 8
    :cond_0
    sget-object p0, Le/f/a/b/c/l/k/f;->p:Le/f/a/b/c/l/k/f;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static synthetic b(Le/f/a/b/c/l/k/f;)Landroid/content/Context;
    .locals 0

    .line 2
    iget-object p0, p0, Le/f/a/b/c/l/k/f;->d:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic b()Ljava/lang/Object;
    .locals 1

    .line 3
    sget-object v0, Le/f/a/b/c/l/k/f;->o:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic c(Le/f/a/b/c/l/k/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/f/a/b/c/l/k/f;->a:J

    return-wide v0
.end method

.method public static synthetic c()Lcom/google/android/gms/common/api/Status;
    .locals 1

    .line 2
    sget-object v0, Le/f/a/b/c/l/k/f;->n:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public static synthetic d(Le/f/a/b/c/l/k/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/f/a/b/c/l/k/f;->b:J

    return-wide v0
.end method

.method public static synthetic e(Le/f/a/b/c/l/k/f;)Le/f/a/b/c/m/e;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/a/b/c/l/k/f;->f:Le/f/a/b/c/m/e;

    return-object p0
.end method

.method public static synthetic f(Le/f/a/b/c/l/k/f;)Le/f/a/b/c/l/k/m;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/a/b/c/l/k/f;->i:Le/f/a/b/c/l/k/m;

    return-object p0
.end method

.method public static synthetic g(Le/f/a/b/c/l/k/f;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/a/b/c/l/k/f;->j:Ljava/util/Set;

    return-object p0
.end method

.method public static synthetic h(Le/f/a/b/c/l/k/f;)Le/f/a/b/c/e;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/a/b/c/l/k/f;->e:Le/f/a/b/c/e;

    return-object p0
.end method

.method public static synthetic i(Le/f/a/b/c/l/k/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Le/f/a/b/c/l/k/f;->c:J

    return-wide v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 17
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->l:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final a(Le/f/a/b/c/a;I)V
    .locals 3

    .line 18
    invoke-virtual {p0, p1, p2}, Le/f/a/b/c/l/k/f;->b(Le/f/a/b/c/a;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 19
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->l:Landroid/os/Handler;

    const/4 v1, 0x5

    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v1, p2, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method

.method public final a(Le/f/a/b/c/l/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/c/l/i<",
            "*>;)V"
        }
    .end annotation

    .line 10
    invoke-virtual {p1}, Le/f/a/b/c/l/i;->b()Le/f/a/b/c/l/k/a0;

    move-result-object v0

    .line 11
    iget-object v1, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/b/c/l/k/c;

    if-nez v1, :cond_0

    .line 12
    new-instance v1, Le/f/a/b/c/l/k/c;

    invoke-direct {v1, p0, p1}, Le/f/a/b/c/l/k/c;-><init>(Le/f/a/b/c/l/k/f;Le/f/a/b/c/l/i;)V

    .line 13
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :cond_0
    invoke-virtual {v1}, Le/f/a/b/c/l/k/c;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 15
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->k:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_1
    invoke-virtual {v1}, Le/f/a/b/c/l/k/c;->a()V

    return-void
.end method

.method public final b(Le/f/a/b/c/a;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->e:Le/f/a/b/c/e;

    iget-object v1, p0, Le/f/a/b/c/l/k/f;->d:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p2}, Le/f/a/b/c/e;->a(Landroid/content/Context;Le/f/a/b/c/a;I)Z

    move-result p1

    return p1
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    const-wide/32 v2, 0x493e0

    const-string v4, "GoogleApiManager"

    const/4 v5, 0x0

    const/4 v6, 0x0

    packed-switch v0, :pswitch_data_0

    const/16 p1, 0x1f

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "Unknown message id: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v5

    .line 3
    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le/f/a/b/c/l/k/d;

    .line 4
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-static {p1}, Le/f/a/b/c/l/k/d;->a(Le/f/a/b/c/l/k/d;)Le/f/a/b/c/l/k/a0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 5
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-static {p1}, Le/f/a/b/c/l/k/d;->a(Le/f/a/b/c/l/k/d;)Le/f/a/b/c/l/k/a0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/c/l/k/c;

    invoke-static {v0, p1}, Le/f/a/b/c/l/k/c;->b(Le/f/a/b/c/l/k/c;Le/f/a/b/c/l/k/d;)V

    goto/16 :goto_4

    .line 6
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le/f/a/b/c/l/k/d;

    .line 7
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-static {p1}, Le/f/a/b/c/l/k/d;->a(Le/f/a/b/c/l/k/d;)Le/f/a/b/c/l/k/a0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 8
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-static {p1}, Le/f/a/b/c/l/k/d;->a(Le/f/a/b/c/l/k/d;)Le/f/a/b/c/l/k/a0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/c/l/k/c;

    invoke-static {v0, p1}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/l/k/c;Le/f/a/b/c/l/k/d;)V

    goto/16 :goto_4

    .line 9
    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le/f/a/b/c/l/k/n;

    .line 10
    invoke-virtual {p1}, Le/f/a/b/c/l/k/n;->b()Le/f/a/b/c/l/k/a0;

    move-result-object v0

    .line 11
    iget-object v2, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 12
    invoke-virtual {p1}, Le/f/a/b/c/l/k/n;->a()Le/f/a/b/h/h;

    move-result-object p1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 13
    :cond_0
    iget-object v2, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    .line 14
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/c/l/k/c;

    invoke-static {v0, v5}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/l/k/c;Z)Z

    move-result v0

    .line 15
    invoke-virtual {p1}, Le/f/a/b/c/l/k/n;->a()Le/f/a/b/h/h;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V

    goto/16 :goto_4

    .line 16
    :pswitch_3
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 17
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/b/c/l/k/c;

    invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->p()Z

    goto/16 :goto_4

    .line 18
    :pswitch_4
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 19
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/b/c/l/k/c;

    invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->g()V

    goto/16 :goto_4

    .line 20
    :pswitch_5
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->k:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/c/l/k/a0;

    .line 21
    iget-object v2, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/c/l/k/c;

    invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->j()V

    goto :goto_0

    .line 22
    :cond_1
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->k:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    goto/16 :goto_4

    .line 23
    :pswitch_6
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 24
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/b/c/l/k/c;

    invoke-virtual {p1}, Le/f/a/b/c/l/k/c;->e()V

    goto/16 :goto_4

    .line 25
    :pswitch_7
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le/f/a/b/c/l/i;

    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/i;)V

    goto/16 :goto_4

    .line 26
    :pswitch_8
    invoke-static {}, Le/f/a/b/c/p/h;->a()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 27
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->d:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Landroid/app/Application;

    if-eqz p1, :cond_b

    .line 28
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->d:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    .line 29
    invoke-static {p1}, Le/f/a/b/c/l/k/b;->a(Landroid/app/Application;)V

    .line 30
    invoke-static {}, Le/f/a/b/c/l/k/b;->b()Le/f/a/b/c/l/k/b;

    move-result-object p1

    new-instance v0, Le/f/a/b/c/l/k/p;

    invoke-direct {v0, p0}, Le/f/a/b/c/l/k/p;-><init>(Le/f/a/b/c/l/k/f;)V

    .line 31
    invoke-virtual {p1, v0}, Le/f/a/b/c/l/k/b;->a(Le/f/a/b/c/l/k/a;)V

    .line 32
    invoke-static {}, Le/f/a/b/c/l/k/b;->b()Le/f/a/b/c/l/k/b;

    move-result-object p1

    .line 33
    invoke-virtual {p1, v1}, Le/f/a/b/c/l/k/b;->b(Z)Z

    move-result p1

    if-nez p1, :cond_b

    .line 34
    iput-wide v2, p0, Le/f/a/b/c/l/k/f;->c:J

    goto/16 :goto_4

    .line 35
    :pswitch_9
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le/f/a/b/c/a;

    .line 36
    iget-object v2, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/f/a/b/c/l/k/c;

    .line 37
    invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->b()I

    move-result v5

    if-ne v5, v0, :cond_2

    move-object v6, v3

    :cond_3
    if-eqz v6, :cond_4

    .line 38
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x11

    iget-object v3, p0, Le/f/a/b/c/l/k/f;->e:Le/f/a/b/c/e;

    .line 39
    invoke-virtual {p1}, Le/f/a/b/c/a;->a()I

    move-result v4

    invoke-virtual {v3, v4}, Le/f/a/b/c/e;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 40
    invoke-virtual {p1}, Le/f/a/b/c/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x45

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Error resolution was canceled by the user, original error message: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 41
    invoke-virtual {v6, v0}, Le/f/a/b/c/l/k/c;->a(Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_4

    :cond_4
    const/16 p1, 0x4c

    .line 42
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p1, "Could not find API instance "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " while trying to fail enqueued calls."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-static {v4, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_4

    .line 43
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le/f/a/b/c/l/k/s;

    .line 44
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    iget-object v2, p1, Le/f/a/b/c/l/k/s;->c:Le/f/a/b/c/l/i;

    invoke-virtual {v2}, Le/f/a/b/c/l/i;->b()Le/f/a/b/c/l/k/a0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/c/l/k/c;

    if-nez v0, :cond_5

    .line 45
    iget-object v0, p1, Le/f/a/b/c/l/k/s;->c:Le/f/a/b/c/l/i;

    invoke-virtual {p0, v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/i;)V

    .line 46
    iget-object v0, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    iget-object v2, p1, Le/f/a/b/c/l/k/s;->c:Le/f/a/b/c/l/i;

    invoke-virtual {v2}, Le/f/a/b/c/l/i;->b()Le/f/a/b/c/l/k/a0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/c/l/k/c;

    .line 47
    :cond_5
    invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->d()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Le/f/a/b/c/l/k/f;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    iget v3, p1, Le/f/a/b/c/l/k/s;->b:I

    if-eq v2, v3, :cond_6

    .line 48
    iget-object p1, p1, Le/f/a/b/c/l/k/s;->a:Le/f/a/b/c/l/k/o;

    sget-object v2, Le/f/a/b/c/l/k/f;->m:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, v2}, Le/f/a/b/c/l/k/o;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 49
    invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->j()V

    goto/16 :goto_4

    .line 50
    :cond_6
    iget-object p1, p1, Le/f/a/b/c/l/k/s;->a:Le/f/a/b/c/l/k/o;

    invoke-virtual {v0, p1}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/l/k/o;)V

    goto/16 :goto_4

    .line 51
    :pswitch_b
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/c/l/k/c;

    .line 52
    invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->l()V

    .line 53
    invoke-virtual {v0}, Le/f/a/b/c/l/k/c;->a()V

    goto :goto_1

    .line 54
    :pswitch_c
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Le/f/a/b/c/l/k/b0;

    .line 55
    invoke-virtual {p1}, Le/f/a/b/c/l/k/b0;->a()Ljava/util/Set;

    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/a/b/c/l/k/a0;

    .line 57
    iget-object v3, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/f/a/b/c/l/k/c;

    if-nez v3, :cond_7

    .line 58
    new-instance v0, Le/f/a/b/c/a;

    const/16 v3, 0xd

    invoke-direct {v0, v3}, Le/f/a/b/c/a;-><init>(I)V

    .line 59
    invoke-virtual {p1, v2, v0, v6}, Le/f/a/b/c/l/k/b0;->a(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/a;Ljava/lang/String;)V

    goto :goto_4

    .line 60
    :cond_7
    invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->c()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 61
    sget-object v4, Le/f/a/b/c/a;->f:Le/f/a/b/c/a;

    .line 62
    invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->f()Le/f/a/b/c/l/e;

    move-result-object v3

    invoke-interface {v3}, Le/f/a/b/c/l/e;->d()Ljava/lang/String;

    move-result-object v3

    .line 63
    invoke-virtual {p1, v2, v4, v3}, Le/f/a/b/c/l/k/b0;->a(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/a;Ljava/lang/String;)V

    goto :goto_2

    .line 64
    :cond_8
    invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->m()Le/f/a/b/c/a;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 65
    invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->m()Le/f/a/b/c/a;

    move-result-object v3

    .line 66
    invoke-virtual {p1, v2, v3, v6}, Le/f/a/b/c/l/k/b0;->a(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/a;Ljava/lang/String;)V

    goto :goto_2

    .line 67
    :cond_9
    invoke-virtual {v3, p1}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/l/k/b0;)V

    .line 68
    invoke-virtual {v3}, Le/f/a/b/c/l/k/c;->a()V

    goto :goto_2

    .line 69
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_a

    const-wide/16 v2, 0x2710

    .line 70
    :cond_a
    iput-wide v2, p0, Le/f/a/b/c/l/k/f;->c:J

    .line 71
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->l:Landroid/os/Handler;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 72
    iget-object p1, p0, Le/f/a/b/c/l/k/f;->h:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/a/b/c/l/k/a0;

    .line 73
    iget-object v3, p0, Le/f/a/b/c/l/k/f;->l:Landroid/os/Handler;

    .line 74
    invoke-virtual {v3, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    iget-wide v4, p0, Le/f/a/b/c/l/k/f;->c:J

    .line 75
    invoke-virtual {v3, v2, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_3

    :cond_b
    :goto_4
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_a
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
