.class public final Le/f/a/d/a/i/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/i/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/f/a/d/a/i/m<",
        "TResultT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/lang/Object;

.field public final c:Le/f/a/d/a/i/b;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/f/a/d/a/i/j;->b:Ljava/lang/Object;

    iput-object p1, p0, Le/f/a/d/a/i/j;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Le/f/a/d/a/i/j;->c:Le/f/a/d/a/i/b;

    return-void
.end method

.method public static synthetic a(Le/f/a/d/a/i/j;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/i/j;->b:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic b(Le/f/a/d/a/i/j;)Le/f/a/d/a/i/b;
    .locals 0

    iget-object p0, p0, Le/f/a/d/a/i/j;->c:Le/f/a/d/a/i/b;

    return-object p0
.end method


# virtual methods
.method public final a(Le/f/a/d/a/i/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Le/f/a/d/a/i/d;->d()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Le/f/a/d/a/i/j;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/f/a/d/a/i/j;->c:Le/f/a/d/a/i/b;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Le/f/a/d/a/i/j;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Le/f/a/d/a/i/i;

    invoke-direct {v1, p0, p1}, Le/f/a/d/a/i/i;-><init>(Le/f/a/d/a/i/j;Le/f/a/d/a/i/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    return-void
.end method