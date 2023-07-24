.class public final Le/h/d/a/a/w/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li/h/c/g;)V
    .locals 0

    invoke-direct {p0}, Le/h/d/a/a/w/q;-><init>()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Le/h/d/a/a/w/r;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {}, Le/h/d/a/a/w/r;->b()Le/h/d/a/a/w/r;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Le/h/d/a/a/w/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/w/r;-><init>(Li/h/c/g;)V

    invoke-static {v0}, Le/h/d/a/a/w/r;->a(Le/h/d/a/a/w/r;)V

    .line 3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0}, Le/h/d/a/a/w/r;->a(Ljava/util/Map;)V

    .line 4
    :cond_0
    invoke-static {}, Le/h/d/a/a/w/r;->b()Le/h/d/a/a/w/r;

    move-result-object v0

    invoke-static {v0}, Li/h/c/k;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
