.class public Le/b/a/z/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/z/c;


# instance fields
.field public final synthetic a:Le/b/a/z/k0;


# direct methods
.method public constructor <init>(Le/b/a/z/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/z/z;->a:Le/b/a/z/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    .line 1
    invoke-static {}, Le/b/a/e0/t;->b()V

    .line 2
    iget-object v0, p0, Le/b/a/z/z;->a:Le/b/a/z/k0;

    monitor-enter v0

    .line 3
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Le/b/a/z/z;->a:Le/b/a/z/k0;

    iget-object v2, v2, Le/b/a/z/k0;->b:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/b/a/z/c;

    .line 6
    invoke-interface {v1, p1}, Le/b/a/z/c;->a(Z)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
