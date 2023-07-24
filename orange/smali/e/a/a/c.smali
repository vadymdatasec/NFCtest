.class public Le/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/a/a/p;

.field public final synthetic c:Le/a/a/d;


# direct methods
.method public constructor <init>(Le/a/a/d;Le/a/a/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/a/a/c;->c:Le/a/a/d;

    iput-object p2, p0, Le/a/a/c;->b:Le/a/a/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Le/a/a/c;->c:Le/a/a/d;

    invoke-static {v0}, Le/a/a/d;->a(Le/a/a/d;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    iget-object v1, p0, Le/a/a/c;->b:Le/a/a/p;

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_0
    return-void
.end method
