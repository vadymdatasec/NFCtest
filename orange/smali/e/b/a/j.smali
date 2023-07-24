.class public Le/b/a/j;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# static fields
.field public static final k:Le/b/a/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/v<",
            "**>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Le/b/a/y/x/f1/b;

.field public final b:Le/b/a/e0/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/e0/k<",
            "Lcom/bumptech/glide/Registry;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/b/a/c0/o/f;

.field public final d:Le/b/a/c;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/v<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final g:Le/b/a/y/x/j0;

.field public final h:Le/b/a/l;

.field public final i:I

.field public j:Le/b/a/c0/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/b;

    invoke-direct {v0}, Le/b/a/b;-><init>()V

    sput-object v0, Le/b/a/j;->k:Le/b/a/v;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le/b/a/y/x/f1/b;Le/b/a/e0/k;Le/b/a/c0/o/f;Le/b/a/c;Ljava/util/Map;Ljava/util/List;Le/b/a/y/x/j0;Le/b/a/l;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Le/b/a/y/x/f1/b;",
            "Le/b/a/e0/k<",
            "Lcom/bumptech/glide/Registry;",
            ">;",
            "Le/b/a/c0/o/f;",
            "Le/b/a/c;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Le/b/a/v<",
            "**>;>;",
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "Ljava/lang/Object;",
            ">;>;",
            "Le/b/a/y/x/j0;",
            "Le/b/a/l;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p2, p0, Le/b/a/j;->a:Le/b/a/y/x/f1/b;

    .line 3
    iput-object p4, p0, Le/b/a/j;->c:Le/b/a/c0/o/f;

    .line 4
    iput-object p5, p0, Le/b/a/j;->d:Le/b/a/c;

    .line 5
    iput-object p7, p0, Le/b/a/j;->e:Ljava/util/List;

    .line 6
    iput-object p6, p0, Le/b/a/j;->f:Ljava/util/Map;

    .line 7
    iput-object p8, p0, Le/b/a/j;->g:Le/b/a/y/x/j0;

    .line 8
    iput-object p9, p0, Le/b/a/j;->h:Le/b/a/l;

    .line 9
    iput p10, p0, Le/b/a/j;->i:I

    .line 10
    invoke-static {p3}, Le/b/a/e0/l;->a(Le/b/a/e0/k;)Le/b/a/e0/k;

    move-result-object p1

    iput-object p1, p0, Le/b/a/j;->b:Le/b/a/e0/k;

    return-void
.end method


# virtual methods
.method public a(Landroid/widget/ImageView;Ljava/lang/Class;)Le/b/a/c0/o/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/widget/ImageView;",
            "Ljava/lang/Class<",
            "TX;>;)",
            "Le/b/a/c0/o/k<",
            "Landroid/widget/ImageView;",
            "TX;>;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Le/b/a/j;->c:Le/b/a/c0/o/f;

    invoke-virtual {v0, p1, p2}, Le/b/a/c0/o/f;->a(Landroid/widget/ImageView;Ljava/lang/Class;)Le/b/a/c0/o/k;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Class;)Le/b/a/v;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Le/b/a/v<",
            "*TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/j;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/v;

    if-nez v0, :cond_1

    .line 2
    iget-object v1, p0, Le/b/a/j;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/v;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    .line 5
    sget-object v0, Le/b/a/j;->k:Le/b/a/v;

    :cond_2
    return-object v0
.end method

.method public a()Le/b/a/y/x/f1/b;
    .locals 1

    .line 7
    iget-object v0, p0, Le/b/a/j;->a:Le/b/a/y/x/f1/b;

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Le/b/a/c0/i<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/j;->e:Ljava/util/List;

    return-object v0
.end method

.method public declared-synchronized c()Le/b/a/c0/j;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/j;->j:Le/b/a/c0/j;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/b/a/j;->d:Le/b/a/c;

    invoke-interface {v0}, Le/b/a/c;->a()Le/b/a/c0/j;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/c0/a;->E()Le/b/a/c0/a;

    move-result-object v0

    check-cast v0, Le/b/a/c0/j;

    iput-object v0, p0, Le/b/a/j;->j:Le/b/a/c0/j;

    .line 3
    :cond_0
    iget-object v0, p0, Le/b/a/j;->j:Le/b/a/c0/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()Le/b/a/y/x/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/j;->g:Le/b/a/y/x/j0;

    return-object v0
.end method

.method public e()Le/b/a/l;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/j;->h:Le/b/a/l;

    return-object v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Le/b/a/j;->i:I

    return v0
.end method

.method public g()Lcom/bumptech/glide/Registry;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/j;->b:Le/b/a/e0/k;

    invoke-interface {v0}, Le/b/a/e0/k;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/Registry;

    return-object v0
.end method
