.class public abstract Le/f/a/b/c/n/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Le/f/a/b/c/n/a;


# direct methods
.method public static declared-synchronized a()Le/f/a/b/c/n/a;
    .locals 2

    const-class v0, Le/f/a/b/c/n/b;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Le/f/a/b/c/n/b;->a:Le/f/a/b/c/n/a;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Le/f/a/b/c/n/c;

    invoke-direct {v1}, Le/f/a/b/c/n/c;-><init>()V

    .line 3
    sput-object v1, Le/f/a/b/c/n/b;->a:Le/f/a/b/c/n/a;

    .line 4
    :cond_0
    sget-object v1, Le/f/a/b/c/n/b;->a:Le/f/a/b/c/n/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
