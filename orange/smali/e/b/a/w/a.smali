.class public Le/b/a/w/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Le/b/a/w/f;


# direct methods
.method public constructor <init>(Le/b/a/w/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/w/a;->a:Le/b/a/w/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/b/a/w/a;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/w/a;->a:Le/b/a/w/f;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Le/b/a/w/a;->a:Le/b/a/w/f;

    invoke-static {v1}, Le/b/a/w/f;->a(Le/b/a/w/f;)Ljava/io/Writer;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 4
    monitor-exit v0

    return-object v2

    .line 5
    :cond_0
    iget-object v1, p0, Le/b/a/w/a;->a:Le/b/a/w/f;

    invoke-static {v1}, Le/b/a/w/f;->c(Le/b/a/w/f;)V

    .line 6
    iget-object v1, p0, Le/b/a/w/a;->a:Le/b/a/w/f;

    invoke-static {v1}, Le/b/a/w/f;->e(Le/b/a/w/f;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    iget-object v1, p0, Le/b/a/w/a;->a:Le/b/a/w/f;

    invoke-static {v1}, Le/b/a/w/f;->f(Le/b/a/w/f;)V

    .line 8
    iget-object v1, p0, Le/b/a/w/a;->a:Le/b/a/w/f;

    const/4 v3, 0x0

    invoke-static {v1, v3}, Le/b/a/w/f;->a(Le/b/a/w/f;I)I

    .line 9
    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
