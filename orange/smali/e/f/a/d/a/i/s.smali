.class public final Le/f/a/d/a/i/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/i/c;
.implements Le/f/a/d/a/i/b;


# instance fields
.field public final a:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Le/f/a/d/a/i/s;->a:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/i/s;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V

    return-void
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 0

    iget-object p1, p0, Le/f/a/d/a/i/s;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Le/f/a/d/a/i/s;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
