.class public final Le/f/a/b/h/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/a/b/h/g;

.field public final synthetic c:Le/f/a/b/h/w;


# direct methods
.method public constructor <init>(Le/f/a/b/h/w;Le/f/a/b/h/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/b/h/x;->c:Le/f/a/b/h/w;

    iput-object p2, p0, Le/f/a/b/h/x;->b:Le/f/a/b/h/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/a/b/h/x;->c:Le/f/a/b/h/w;

    invoke-static {v0}, Le/f/a/b/h/w;->a(Le/f/a/b/h/w;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/f/a/b/h/x;->c:Le/f/a/b/h/w;

    invoke-static {v1}, Le/f/a/b/h/w;->b(Le/f/a/b/h/w;)Le/f/a/b/h/d;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Le/f/a/b/h/x;->c:Le/f/a/b/h/w;

    invoke-static {v1}, Le/f/a/b/h/w;->b(Le/f/a/b/h/w;)Le/f/a/b/h/d;

    move-result-object v1

    iget-object v2, p0, Le/f/a/b/h/x;->b:Le/f/a/b/h/g;

    invoke-virtual {v2}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;

    move-result-object v2

    invoke-interface {v1, v2}, Le/f/a/b/h/d;->a(Ljava/lang/Exception;)V

    .line 4
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
