.class public Le/f/a/a/j/g0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/g0/g;


# instance fields
.field public final a:Le/f/a/a/j/g0/o;

.field public final b:Le/f/a/a/j/g0/m;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Le/f/a/a/j/g0/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/f/a/a/j/g0/m;)V
    .locals 1

    .line 1
    new-instance v0, Le/f/a/a/j/g0/o;

    invoke-direct {v0, p1}, Le/f/a/a/j/g0/o;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Le/f/a/a/j/g0/p;-><init>(Le/f/a/a/j/g0/o;Le/f/a/a/j/g0/m;)V

    return-void
.end method

.method public constructor <init>(Le/f/a/a/j/g0/o;Le/f/a/a/j/g0/m;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/f/a/a/j/g0/p;->c:Ljava/util/Map;

    .line 4
    iput-object p1, p0, Le/f/a/a/j/g0/p;->a:Le/f/a/a/j/g0/o;

    .line 5
    iput-object p2, p0, Le/f/a/a/j/g0/p;->b:Le/f/a/a/j/g0/m;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Le/f/a/a/j/g0/r;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/f/a/a/j/g0/p;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/a/j/g0/p;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/a/a/j/g0/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    .line 3
    :cond_0
    :try_start_1
    iget-object v0, p0, Le/f/a/a/j/g0/p;->a:Le/f/a/a/j/g0/o;

    invoke-virtual {v0, p1}, Le/f/a/a/j/g0/o;->a(Ljava/lang/String;)Le/f/a/a/j/g0/f;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    .line 4
    monitor-exit p0

    return-object p1

    .line 5
    :cond_1
    :try_start_2
    iget-object v1, p0, Le/f/a/a/j/g0/p;->b:Le/f/a/a/j/g0/m;

    invoke-virtual {v1, p1}, Le/f/a/a/j/g0/m;->a(Ljava/lang/String;)Le/f/a/a/j/g0/l;

    move-result-object v1

    invoke-interface {v0, v1}, Le/f/a/a/j/g0/f;->create(Le/f/a/a/j/g0/l;)Le/f/a/a/j/g0/r;

    move-result-object v0

    .line 6
    iget-object v1, p0, Le/f/a/a/j/g0/p;->c:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 7
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
