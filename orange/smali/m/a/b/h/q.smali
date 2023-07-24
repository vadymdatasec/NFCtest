.class public Lm/a/b/h/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lm/a/b/h/r;


# direct methods
.method public constructor <init>(Lm/a/b/h/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/a/b/h/q;->b:Lm/a/b/h/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm/a/b/h/r;Lm/a/b/h/p;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lm/a/b/h/q;-><init>(Lm/a/b/h/r;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    :goto_0
    const-wide/16 v0, 0x3e8

    .line 1
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    :catch_0
    iget-object v0, p0, Lm/a/b/h/q;->b:Lm/a/b/h/r;

    invoke-static {v0}, Lm/a/b/h/r;->a(Lm/a/b/h/r;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 3
    :try_start_1
    iget-object v1, p0, Lm/a/b/h/q;->b:Lm/a/b/h/r;

    invoke-static {v1}, Lm/a/b/h/r;->b(Lm/a/b/h/r;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    monitor-exit v0

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lm/a/b/h/q;->b:Lm/a/b/h/r;

    invoke-static {v1}, Lm/a/b/h/r;->c(Lm/a/b/h/r;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm/a/b/h/j;

    .line 8
    iget-object v7, p0, Lm/a/b/h/q;->b:Lm/a/b/h/r;

    invoke-static {v7}, Lm/a/b/h/r;->d(Lm/a/b/h/r;)Ljava/util/SortedSet;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    if-eqz v5, :cond_1

    .line 9
    iget-object v5, p0, Lm/a/b/h/q;->b:Lm/a/b/h/r;

    invoke-static {v5}, Lm/a/b/h/r;->d(Lm/a/b/h/r;)Ljava/util/SortedSet;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_1

    const/4 v5, 0x1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    if-nez v4, :cond_3

    .line 10
    iget-object v4, p0, Lm/a/b/h/q;->b:Lm/a/b/h/r;

    invoke-static {v4, v6}, Lm/a/b/h/r;->a(Lm/a/b/h/r;Lm/a/b/h/j;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    :goto_3
    const/4 v4, 0x1

    goto :goto_1

    .line 11
    :cond_4
    iget-object v1, p0, Lm/a/b/h/q;->b:Lm/a/b/h/r;

    invoke-static {v1}, Lm/a/b/h/r;->c(Lm/a/b/h/r;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    if-eqz v4, :cond_5

    .line 12
    iget-object v1, p0, Lm/a/b/h/q;->b:Lm/a/b/h/r;

    invoke-static {v1, v5}, Lm/a/b/h/r;->a(Lm/a/b/h/r;Z)V

    .line 13
    :cond_5
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
