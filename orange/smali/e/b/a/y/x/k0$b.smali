.class public Le/b/a/y/x/k0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/b/a/y/x/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final b:Le/b/a/c0/k;

.field public final synthetic c:Le/b/a/y/x/k0;


# direct methods
.method public constructor <init>(Le/b/a/y/x/k0;Le/b/a/c0/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/y/x/k0$b;->c:Le/b/a/y/x/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Le/b/a/y/x/k0$b;->b:Le/b/a/c0/k;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/b/a/y/x/k0$b;->b:Le/b/a/c0/k;

    invoke-interface {v0}, Le/b/a/c0/k;->b()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/y/x/k0$b;->c:Le/b/a/y/x/k0;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    iget-object v2, p0, Le/b/a/y/x/k0$b;->c:Le/b/a/y/x/k0;

    iget-object v2, v2, Le/b/a/y/x/k0;->b:Le/b/a/y/x/n0;

    iget-object v3, p0, Le/b/a/y/x/k0$b;->b:Le/b/a/c0/k;

    invoke-virtual {v2, v3}, Le/b/a/y/x/n0;->a(Le/b/a/c0/k;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    iget-object v2, p0, Le/b/a/y/x/k0$b;->c:Le/b/a/y/x/k0;

    iget-object v2, v2, Le/b/a/y/x/k0;->w:Le/b/a/y/x/s0;

    invoke-virtual {v2}, Le/b/a/y/x/s0;->a()V

    .line 5
    iget-object v2, p0, Le/b/a/y/x/k0$b;->c:Le/b/a/y/x/k0;

    iget-object v3, p0, Le/b/a/y/x/k0$b;->b:Le/b/a/c0/k;

    invoke-virtual {v2, v3}, Le/b/a/y/x/k0;->b(Le/b/a/c0/k;)V

    .line 6
    iget-object v2, p0, Le/b/a/y/x/k0$b;->c:Le/b/a/y/x/k0;

    iget-object v3, p0, Le/b/a/y/x/k0$b;->b:Le/b/a/c0/k;

    invoke-virtual {v2, v3}, Le/b/a/y/x/k0;->c(Le/b/a/c0/k;)V

    .line 7
    :cond_0
    iget-object v2, p0, Le/b/a/y/x/k0$b;->c:Le/b/a/y/x/k0;

    invoke-virtual {v2}, Le/b/a/y/x/k0;->c()V

    .line 8
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception v2

    .line 10
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    :catchall_1
    move-exception v1

    .line 11
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method
