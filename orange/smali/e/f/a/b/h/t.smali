.class public final Le/f/a/b/h/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/a/b/h/s;


# direct methods
.method public constructor <init>(Le/f/a/b/h/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/b/h/t;->b:Le/f/a/b/h/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/h/t;->b:Le/f/a/b/h/s;

    invoke-static {v0}, Le/f/a/b/h/s;->a(Le/f/a/b/h/s;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/f/a/b/h/t;->b:Le/f/a/b/h/s;

    invoke-static {v1}, Le/f/a/b/h/s;->b(Le/f/a/b/h/s;)Le/f/a/b/h/b;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Le/f/a/b/h/t;->b:Le/f/a/b/h/s;

    invoke-static {v1}, Le/f/a/b/h/s;->b(Le/f/a/b/h/s;)Le/f/a/b/h/b;

    move-result-object v1

    invoke-interface {v1}, Le/f/a/b/h/b;->a()V

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
