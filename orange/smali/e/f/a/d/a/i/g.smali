.class public final Le/f/a/d/a/i/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/a/d/a/i/d;

.field public final synthetic c:Le/f/a/d/a/i/h;


# direct methods
.method public constructor <init>(Le/f/a/d/a/i/h;Le/f/a/d/a/i/d;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/i/g;->c:Le/f/a/d/a/i/h;

    iput-object p2, p0, Le/f/a/d/a/i/g;->b:Le/f/a/d/a/i/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/i/g;->c:Le/f/a/d/a/i/h;

    invoke-static {v0}, Le/f/a/d/a/i/h;->a(Le/f/a/d/a/i/h;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/f/a/d/a/i/g;->c:Le/f/a/d/a/i/h;

    invoke-static {v1}, Le/f/a/d/a/i/h;->b(Le/f/a/d/a/i/h;)Le/f/a/d/a/i/a;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/f/a/d/a/i/g;->c:Le/f/a/d/a/i/h;

    invoke-static {v1}, Le/f/a/d/a/i/h;->b(Le/f/a/d/a/i/h;)Le/f/a/d/a/i/a;

    move-result-object v1

    iget-object v2, p0, Le/f/a/d/a/i/g;->b:Le/f/a/d/a/i/d;

    invoke-interface {v1, v2}, Le/f/a/d/a/i/a;->a(Le/f/a/d/a/i/d;)V

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
