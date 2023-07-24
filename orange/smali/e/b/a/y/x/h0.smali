.class public Le/b/a/y/x/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/r;


# instance fields
.field public final a:Le/b/a/y/x/g1/a;

.field public volatile b:Le/b/a/y/x/g1/c;


# direct methods
.method public constructor <init>(Le/b/a/y/x/g1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/x/h0;->a:Le/b/a/y/x/g1/a;

    return-void
.end method


# virtual methods
.method public a()Le/b/a/y/x/g1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h0;->b:Le/b/a/y/x/g1/c;

    if-nez v0, :cond_2

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/h0;->b:Le/b/a/y/x/g1/c;

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Le/b/a/y/x/h0;->a:Le/b/a/y/x/g1/a;

    invoke-interface {v0}, Le/b/a/y/x/g1/a;->a()Le/b/a/y/x/g1/c;

    move-result-object v0

    iput-object v0, p0, Le/b/a/y/x/h0;->b:Le/b/a/y/x/g1/c;

    .line 5
    :cond_0
    iget-object v0, p0, Le/b/a/y/x/h0;->b:Le/b/a/y/x/g1/c;

    if-nez v0, :cond_1

    .line 6
    new-instance v0, Le/b/a/y/x/g1/d;

    invoke-direct {v0}, Le/b/a/y/x/g1/d;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/h0;->b:Le/b/a/y/x/g1/c;

    .line 7
    :cond_1
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 8
    :cond_2
    :goto_0
    iget-object v0, p0, Le/b/a/y/x/h0;->b:Le/b/a/y/x/g1/c;

    return-object v0
.end method
