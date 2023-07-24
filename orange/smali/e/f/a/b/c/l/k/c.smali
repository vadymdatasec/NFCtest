.class public final Le/f/a/b/c/l/k/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Le/f/a/b/c/l/k/o;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Le/f/a/b/c/l/e;

.field public final c:Le/f/a/b/c/l/k/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/c/l/k/a0<",
            "TO;>;"
        }
    .end annotation
.end field

.field public final d:Le/f/a/b/c/l/k/l;

.field public final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/f/a/b/c/l/k/b0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Le/f/a/b/c/l/k/i<",
            "*>;",
            "Le/f/a/b/c/l/k/t;",
            ">;"
        }
    .end annotation
.end field

.field public final g:I

.field public final h:Le/f/a/b/c/l/k/v;

.field public i:Z

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f/a/b/c/l/k/d;",
            ">;"
        }
    .end annotation
.end field

.field public k:Le/f/a/b/c/a;

.field public final synthetic l:Le/f/a/b/c/l/k/f;


# direct methods
.method public constructor <init>(Le/f/a/b/c/l/k/f;Le/f/a/b/c/l/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/c/l/i<",
            "TO;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le/f/a/b/c/l/k/c;->e:Ljava/util/Set;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/f/a/b/c/l/k/c;->f:Ljava/util/Map;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/f/a/b/c/l/k/c;->j:Ljava/util/List;

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Le/f/a/b/c/l/k/c;->k:Le/f/a/b/c/a;

    .line 7
    invoke-static {p1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {p2, v1, p0}, Le/f/a/b/c/l/i;->a(Landroid/os/Looper;Le/f/a/b/c/l/k/c;)Le/f/a/b/c/l/e;

    move-result-object v1

    iput-object v1, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    .line 8
    invoke-virtual {p2}, Le/f/a/b/c/l/i;->b()Le/f/a/b/c/l/k/a0;

    move-result-object v1

    iput-object v1, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    .line 9
    new-instance v1, Le/f/a/b/c/l/k/l;

    invoke-direct {v1}, Le/f/a/b/c/l/k/l;-><init>()V

    iput-object v1, p0, Le/f/a/b/c/l/k/c;->d:Le/f/a/b/c/l/k/l;

    .line 10
    invoke-virtual {p2}, Le/f/a/b/c/l/i;->a()I

    move-result v1

    iput v1, p0, Le/f/a/b/c/l/k/c;->g:I

    .line 11
    iget-object v1, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v1}, Le/f/a/b/c/l/e;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 12
    invoke-static {p1}, Le/f/a/b/c/l/k/f;->b(Le/f/a/b/c/l/k/f;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Le/f/a/b/c/l/i;->a(Landroid/content/Context;Landroid/os/Handler;)Le/f/a/b/c/l/k/v;

    move-result-object p1

    iput-object p1, p0, Le/f/a/b/c/l/k/c;->h:Le/f/a/b/c/l/k/v;

    return-void

    .line 13
    :cond_0
    iput-object v0, p0, Le/f/a/b/c/l/k/c;->h:Le/f/a/b/c/l/k/v;

    return-void
.end method

.method public static synthetic a(Le/f/a/b/c/l/k/c;)V
    .locals 0

    .line 71
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->h()V

    return-void
.end method

.method public static synthetic a(Le/f/a/b/c/l/k/c;Le/f/a/b/c/l/k/d;)V
    .locals 0

    .line 70
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/l/k/d;)V

    return-void
.end method

.method public static synthetic a(Le/f/a/b/c/l/k/c;Z)Z
    .locals 0

    const/4 p1, 0x0

    .line 69
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->a(Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Le/f/a/b/c/l/k/c;Le/f/a/b/c/l/k/d;)V
    .locals 0

    .line 46
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->b(Le/f/a/b/c/l/k/d;)V

    return-void
.end method


# virtual methods
.method public final a([Le/f/a/b/c/c;)Le/f/a/b/c/c;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    .line 55
    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_3

    .line 56
    :cond_0
    iget-object v1, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    .line 57
    invoke-interface {v1}, Le/f/a/b/c/l/e;->b()[Le/f/a/b/c/c;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    new-array v1, v2, [Le/f/a/b/c/c;

    .line 58
    :cond_1
    new-instance v3, Lc/e/b;

    array-length v4, v1

    invoke-direct {v3, v4}, Lc/e/b;-><init>(I)V

    .line 59
    array-length v4, v1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v1, v5

    .line 60
    invoke-virtual {v6}, Le/f/a/b/c/c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Le/f/a/b/c/c;->b()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v3, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 61
    :cond_2
    array-length v1, p1

    :goto_1
    if-ge v2, v1, :cond_5

    aget-object v4, p1, v2

    .line 62
    invoke-virtual {v4}, Le/f/a/b/c/c;->a()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 63
    invoke-virtual {v4}, Le/f/a/b/c/c;->a()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v4}, Le/f/a/b/c/c;->b()J

    move-result-wide v7

    cmp-long v9, v5, v7

    if-gez v9, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-object v4

    :cond_5
    :goto_3
    return-object v0
.end method

.method public final a()V
    .locals 4

    .line 44
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 45
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v0}, Le/f/a/b/c/l/e;->c()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v0}, Le/f/a/b/c/l/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->e(Le/f/a/b/c/l/k/f;)Le/f/a/b/c/m/e;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v1}, Le/f/a/b/c/l/k/f;->b(Le/f/a/b/c/l/k/f;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-virtual {v0, v1, v2}, Le/f/a/b/c/m/e;->a(Landroid/content/Context;Le/f/a/b/c/l/e;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 47
    new-instance v1, Le/f/a/b/c/a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Le/f/a/b/c/a;-><init>(ILandroid/app/PendingIntent;)V

    .line 48
    invoke-virtual {p0, v1}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/a;)V

    return-void

    .line 49
    :cond_1
    new-instance v0, Le/f/a/b/c/l/k/e;

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    iget-object v3, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    invoke-direct {v0, v1, v2, v3}, Le/f/a/b/c/l/k/e;-><init>(Le/f/a/b/c/l/k/f;Le/f/a/b/c/l/e;Le/f/a/b/c/l/k/a0;)V

    .line 50
    iget-object v1, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v1}, Le/f/a/b/c/l/e;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 51
    iget-object v1, p0, Le/f/a/b/c/l/k/c;->h:Le/f/a/b/c/l/k/v;

    invoke-virtual {v1, v0}, Le/f/a/b/c/l/k/v;->a(Le/f/a/b/c/l/k/w;)V

    .line 52
    :cond_2
    iget-object v1, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v1, v0}, Le/f/a/b/c/l/e;->a(Le/f/a/b/c/m/a;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final a(I)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->h()V

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {p1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Le/f/a/b/c/l/k/q;

    invoke-direct {v0, p0}, Le/f/a/b/c/l/k/q;-><init>(Le/f/a/b/c/l/k/c;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 35
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 36
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/b/c/l/k/o;

    .line 37
    invoke-virtual {v1, p1}, Le/f/a/b/c/l/k/o;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->clear()V

    return-void
.end method

.method public final a(Le/f/a/b/c/a;)V
    .locals 4

    .line 4
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 5
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->h:Le/f/a/b/c/l/k/v;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Le/f/a/b/c/l/k/v;->e()V

    .line 7
    :cond_0
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->l()V

    .line 8
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->e(Le/f/a/b/c/l/k/f;)Le/f/a/b/c/m/e;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/b/c/m/e;->a()V

    .line 9
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->c(Le/f/a/b/c/a;)V

    .line 10
    invoke-virtual {p1}, Le/f/a/b/c/a;->a()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 11
    invoke-static {}, Le/f/a/b/c/l/k/f;->c()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void

    .line 12
    :cond_1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 13
    iput-object p1, p0, Le/f/a/b/c/l/k/c;->k:Le/f/a/b/c/a;

    return-void

    .line 14
    :cond_2
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->b(Le/f/a/b/c/a;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 15
    :cond_3
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    iget v1, p0, Le/f/a/b/c/l/k/c;->g:I

    invoke-virtual {v0, p1, v1}, Le/f/a/b/c/l/k/f;->b(Le/f/a/b/c/a;I)Z

    move-result v0

    if-nez v0, :cond_6

    .line 16
    invoke-virtual {p1}, Le/f/a/b/c/a;->a()I

    move-result p1

    const/16 v0, 0x12

    if-ne p1, v0, :cond_4

    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Le/f/a/b/c/l/k/c;->i:Z

    .line 18
    :cond_4
    iget-boolean p1, p0, Le/f/a/b/c/l/k/c;->i:Z

    if-eqz p1, :cond_5

    .line 19
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {p1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    .line 20
    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    invoke-static {v0, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v1}, Le/f/a/b/c/l/k/f;->c(Le/f/a/b/c/l/k/f;)J

    move-result-wide v1

    .line 21
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    .line 22
    :cond_5
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    const/16 v0, 0x11

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    .line 23
    invoke-virtual {v1}, Le/f/a/b/c/l/k/a0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x26

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "API: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not available on this device."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 24
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->a(Lcom/google/android/gms/common/api/Status;)V

    :cond_6
    return-void
.end method

.method public final a(Le/f/a/b/c/l/k/b0;)V
    .locals 1

    .line 53
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 54
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Le/f/a/b/c/l/k/d;)V
    .locals 1

    .line 64
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 65
    :cond_0
    iget-boolean p1, p0, Le/f/a/b/c/l/k/c;->i:Z

    if-nez p1, :cond_2

    .line 66
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {p1}, Le/f/a/b/c/l/e;->c()Z

    move-result p1

    if-nez p1, :cond_1

    .line 67
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->a()V

    return-void

    .line 68
    :cond_1
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->i()V

    :cond_2
    return-void
.end method

.method public final a(Le/f/a/b/c/l/k/o;)V
    .locals 1

    .line 25
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 26
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v0}, Le/f/a/b/c/l/e;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->b(Le/f/a/b/c/l/k/o;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->o()V

    return-void

    .line 29
    :cond_0
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void

    .line 30
    :cond_1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 31
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->k:Le/f/a/b/c/a;

    if-eqz p1, :cond_2

    .line 32
    invoke-virtual {p1}, Le/f/a/b/c/a;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 33
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->k:Le/f/a/b/c/a;

    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/a;)V

    return-void

    .line 34
    :cond_2
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->a()V

    return-void
.end method

.method public final a(Z)Z
    .locals 2

    .line 39
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 40
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v0}, Le/f/a/b/c/l/e;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Le/f/a/b/c/l/k/c;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 41
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->d:Le/f/a/b/c/l/k/l;

    invoke-virtual {v0}, Le/f/a/b/c/l/k/l;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 42
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->o()V

    :cond_0
    return v1

    .line 43
    :cond_1
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {p1}, Le/f/a/b/c/l/e;->e()V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final b()I
    .locals 1

    .line 32
    iget v0, p0, Le/f/a/b/c/l/k/c;->g:I

    return v0
.end method

.method public final b(Le/f/a/b/c/l/k/d;)V
    .locals 5

    .line 33
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 34
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 35
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 36
    invoke-static {p1}, Le/f/a/b/c/l/k/d;->b(Le/f/a/b/c/l/k/d;)Le/f/a/b/c/c;

    move-result-object p1

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    iget-object v1, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/a/b/c/l/k/o;

    .line 39
    instance-of v3, v2, Le/f/a/b/c/l/k/u;

    if-eqz v3, :cond_0

    .line 40
    move-object v3, v2

    check-cast v3, Le/f/a/b/c/l/k/u;

    invoke-virtual {v3, p0}, Le/f/a/b/c/l/k/u;->b(Le/f/a/b/c/l/k/c;)[Le/f/a/b/c/c;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 41
    invoke-static {v3, p1}, Le/f/a/b/c/p/b;->a([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 42
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Le/f/a/b/c/l/k/o;

    .line 44
    iget-object v4, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-interface {v4, v3}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    .line 45
    new-instance v4, Lcom/google/android/gms/common/api/UnsupportedApiCallException;

    invoke-direct {v4, p1}, Lcom/google/android/gms/common/api/UnsupportedApiCallException;-><init>(Le/f/a/b/c/c;)V

    invoke-virtual {v3, v4}, Le/f/a/b/c/l/k/o;->a(Ljava/lang/RuntimeException;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final b(Le/f/a/b/c/a;)Z
    .locals 3

    .line 1
    invoke-static {}, Le/f/a/b/c/l/k/f;->b()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v1}, Le/f/a/b/c/l/k/f;->f(Le/f/a/b/c/l/k/f;)Le/f/a/b/c/l/k/m;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v1}, Le/f/a/b/c/l/k/f;->g(Le/f/a/b/c/l/k/f;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v1}, Le/f/a/b/c/l/k/f;->f(Le/f/a/b/c/l/k/f;)Le/f/a/b/c/l/k/m;

    move-result-object v1

    iget v2, p0, Le/f/a/b/c/l/k/c;->g:I

    invoke-virtual {v1, p1, v2}, Le/f/a/b/c/l/k/c0;->a(Le/f/a/b/c/a;I)V

    const/4 p1, 0x1

    .line 4
    monitor-exit v0

    return p1

    :cond_0
    const/4 p1, 0x0

    .line 5
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Le/f/a/b/c/l/k/o;)Z
    .locals 5

    .line 7
    instance-of v0, p1, Le/f/a/b/c/l/k/u;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 8
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->c(Le/f/a/b/c/l/k/o;)V

    return v1

    .line 9
    :cond_0
    move-object v0, p1

    check-cast v0, Le/f/a/b/c/l/k/u;

    .line 10
    invoke-virtual {v0, p0}, Le/f/a/b/c/l/k/u;->b(Le/f/a/b/c/l/k/c;)[Le/f/a/b/c/c;

    move-result-object v2

    invoke-virtual {p0, v2}, Le/f/a/b/c/l/k/c;->a([Le/f/a/b/c/c;)Le/f/a/b/c/c;

    move-result-object v2

    if-nez v2, :cond_1

    .line 11
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->c(Le/f/a/b/c/l/k/o;)V

    return v1

    .line 12
    :cond_1
    invoke-virtual {v0, p0}, Le/f/a/b/c/l/k/u;->c(Le/f/a/b/c/l/k/c;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 13
    new-instance p1, Le/f/a/b/c/l/k/d;

    iget-object v0, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v2, v1}, Le/f/a/b/c/l/k/d;-><init>(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/c;Le/f/a/b/c/l/k/p;)V

    .line 14
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/16 v2, 0xf

    if-ltz v0, :cond_2

    .line 15
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->j:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/b/c/l/k/d;

    .line 16
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 17
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    .line 18
    invoke-static {v1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v1, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v1}, Le/f/a/b/c/l/k/f;->c(Le/f/a/b/c/l/k/f;)J

    move-result-wide v1

    .line 19
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 20
    :cond_2
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v3, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    .line 22
    invoke-static {v3}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v3

    invoke-static {v3, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    iget-object v3, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v3}, Le/f/a/b/c/l/k/f;->c(Le/f/a/b/c/l/k/f;)J

    move-result-wide v3

    .line 23
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 24
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    .line 25
    invoke-static {v2}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v2

    const/16 v3, 0x10

    invoke-static {v2, v3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    .line 26
    invoke-static {v2}, Le/f/a/b/c/l/k/f;->d(Le/f/a/b/c/l/k/f;)J

    move-result-wide v2

    .line 27
    invoke-virtual {v0, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 28
    new-instance p1, Le/f/a/b/c/a;

    const/4 v0, 0x2

    invoke-direct {p1, v0, v1}, Le/f/a/b/c/a;-><init>(ILandroid/app/PendingIntent;)V

    .line 29
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->b(Le/f/a/b/c/a;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 30
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    iget v1, p0, Le/f/a/b/c/l/k/c;->g:I

    invoke-virtual {v0, p1, v1}, Le/f/a/b/c/l/k/f;->b(Le/f/a/b/c/a;I)Z

    goto :goto_0

    .line 31
    :cond_3
    new-instance p1, Lcom/google/android/gms/common/api/UnsupportedApiCallException;

    invoke-direct {p1, v2}, Lcom/google/android/gms/common/api/UnsupportedApiCallException;-><init>(Le/f/a/b/c/c;)V

    invoke-virtual {v0, p1}, Le/f/a/b/c/l/k/o;->a(Ljava/lang/RuntimeException;)V

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Le/f/a/b/c/a;)V
    .locals 4

    .line 5
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/b/c/l/k/b0;

    const/4 v2, 0x0

    .line 6
    sget-object v3, Le/f/a/b/c/a;->f:Le/f/a/b/c/a;

    invoke-static {p1, v3}, Le/f/a/b/c/m/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 7
    iget-object v2, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v2}, Le/f/a/b/c/l/e;->d()Ljava/lang/String;

    move-result-object v2

    .line 8
    :cond_0
    iget-object v3, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    invoke-virtual {v1, v3, p1, v2}, Le/f/a/b/c/l/k/b0;->a(Le/f/a/b/c/l/k/a0;Le/f/a/b/c/a;Ljava/lang/String;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->e:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final c(Le/f/a/b/c/l/k/o;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->d:Le/f/a/b/c/l/k/l;

    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->d()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Le/f/a/b/c/l/k/o;->a(Le/f/a/b/c/l/k/l;Z)V

    .line 2
    :try_start_0
    invoke-virtual {p1, p0}, Le/f/a/b/c/l/k/o;->a(Le/f/a/b/c/l/k/c;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x1

    .line 3
    invoke-virtual {p0, p1}, Le/f/a/b/c/l/k/c;->a(I)V

    .line 4
    iget-object p1, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {p1}, Le/f/a/b/c/l/e;->e()V

    return-void
.end method

.method public final c()Z
    .locals 1

    .line 10
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v0}, Le/f/a/b/c/l/e;->c()Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v0}, Le/f/a/b/c/l/e;->f()Z

    move-result v0

    return v0
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 2
    iget-boolean v0, p0, Le/f/a/b/c/l/k/c;->i:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->a()V

    :cond_0
    return-void
.end method

.method public final f()Le/f/a/b/c/l/e;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    return-object v0
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 2
    iget-boolean v0, p0, Le/f/a/b/c/l/k/c;->i:Z

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->n()V

    .line 4
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->h(Le/f/a/b/c/l/k/f;)Le/f/a/b/c/e;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v1}, Le/f/a/b/c/l/k/f;->b(Le/f/a/b/c/l/k/f;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/a/b/c/e;->a(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0x12

    const/16 v2, 0x8

    if-ne v0, v1, :cond_0

    .line 5
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v1, "Connection timed out while waiting for Google Play services update to complete."

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v1, "API failed to connect while resuming due to an unknown error."

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    .line 7
    :goto_0
    invoke-virtual {p0, v0}, Le/f/a/b/c/l/k/c;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 8
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v0}, Le/f/a/b/c/l/e;->e()V

    :cond_1
    return-void
.end method

.method public final h()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Le/f/a/b/c/l/k/c;->l()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Le/f/a/b/c/l/k/c;->i:Z

    .line 3
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->d:Le/f/a/b/c/l/k/l;

    invoke-virtual {v0}, Le/f/a/b/c/l/k/l;->c()V

    .line 4
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    .line 5
    invoke-static {v1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    const/16 v3, 0x9

    invoke-static {v1, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v2}, Le/f/a/b/c/l/k/f;->c(Le/f/a/b/c/l/k/f;)J

    move-result-wide v2

    .line 6
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 7
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    .line 8
    invoke-static {v1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    const/16 v3, 0xb

    invoke-static {v1, v3, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v2}, Le/f/a/b/c/l/k/f;->d(Le/f/a/b/c/l/k/f;)J

    move-result-wide v2

    .line 9
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 10
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->e(Le/f/a/b/c/l/k/f;)Le/f/a/b/c/m/e;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/b/c/m/e;->a()V

    return-void
.end method

.method public final i()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Le/f/a/b/c/l/k/o;

    .line 2
    iget-object v4, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v4}, Le/f/a/b/c/l/e;->c()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 3
    invoke-virtual {p0, v3}, Le/f/a/b/c/l/k/c;->b(Le/f/a/b/c/l/k/o;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 4
    iget-object v4, p0, Le/f/a/b/c/l/k/c;->a:Ljava/util/Queue;

    invoke-interface {v4, v3}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final j()V
    .locals 6

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 2
    sget-object v0, Le/f/a/b/c/l/k/f;->m:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Le/f/a/b/c/l/k/c;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 3
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->d:Le/f/a/b/c/l/k/l;

    invoke-virtual {v0}, Le/f/a/b/c/l/k/l;->b()V

    .line 4
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->f:Ljava/util/Map;

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Le/f/a/b/c/l/k/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le/f/a/b/c/l/k/i;

    .line 6
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 7
    new-instance v4, Le/f/a/b/c/l/k/z;

    new-instance v5, Le/f/a/b/h/h;

    invoke-direct {v5}, Le/f/a/b/h/h;-><init>()V

    invoke-direct {v4, v3, v5}, Le/f/a/b/c/l/k/z;-><init>(Le/f/a/b/c/l/k/i;Le/f/a/b/h/h;)V

    invoke-virtual {p0, v4}, Le/f/a/b/c/l/k/c;->a(Le/f/a/b/c/l/k/o;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Le/f/a/b/c/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Le/f/a/b/c/a;-><init>(I)V

    invoke-virtual {p0, v0}, Le/f/a/b/c/l/k/c;->c(Le/f/a/b/c/a;)V

    .line 9
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    invoke-interface {v0}, Le/f/a/b/c/l/e;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->b:Le/f/a/b/c/l/e;

    new-instance v1, Le/f/a/b/c/l/k/r;

    invoke-direct {v1, p0}, Le/f/a/b/c/l/k/r;-><init>(Le/f/a/b/c/l/k/c;)V

    invoke-interface {v0, v1}, Le/f/a/b/c/l/e;->a(Le/f/a/b/c/m/b;)V

    :cond_1
    return-void
.end method

.method public final k()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Le/f/a/b/c/l/k/i<",
            "*>;",
            "Le/f/a/b/c/l/k/t;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->f:Ljava/util/Map;

    return-object v0
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le/f/a/b/c/l/k/c;->k:Le/f/a/b/c/a;

    return-void
.end method

.method public final m()Le/f/a/b/c/a;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Le/f/a/b/c/m/h;->a(Landroid/os/Handler;)V

    .line 2
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->k:Le/f/a/b/c/a;

    return-object v0
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Le/f/a/b/c/l/k/c;->i:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xb

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 3
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Le/f/a/b/c/l/k/c;->i:Z

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 2
    iget-object v0, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v0}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    .line 3
    invoke-static {v1}, Le/f/a/b/c/l/k/f;->a(Le/f/a/b/c/l/k/f;)Landroid/os/Handler;

    move-result-object v1

    iget-object v3, p0, Le/f/a/b/c/l/k/c;->c:Le/f/a/b/c/l/k/a0;

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Le/f/a/b/c/l/k/c;->l:Le/f/a/b/c/l/k/f;

    invoke-static {v2}, Le/f/a/b/c/l/k/f;->i(Le/f/a/b/c/l/k/f;)J

    move-result-wide v2

    .line 4
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final p()Z
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Le/f/a/b/c/l/k/c;->a(Z)Z

    move-result v0

    return v0
.end method
