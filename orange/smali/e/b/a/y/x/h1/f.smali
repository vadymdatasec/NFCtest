.class public final Le/b/a/y/x/h1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public final a:Ljava/util/concurrent/ThreadFactory;

.field public final b:Ljava/lang/String;

.field public final c:Le/b/a/y/x/h1/j;

.field public final d:Z

.field public final e:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;Le/b/a/y/x/h1/j;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/h1/f;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    iput-object p1, p0, Le/b/a/y/x/h1/f;->a:Ljava/util/concurrent/ThreadFactory;

    .line 4
    iput-object p2, p0, Le/b/a/y/x/h1/f;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Le/b/a/y/x/h1/f;->c:Le/b/a/y/x/h1/j;

    .line 6
    iput-boolean p4, p0, Le/b/a/y/x/h1/f;->d:Z

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/f;->a:Ljava/util/concurrent/ThreadFactory;

    new-instance v1, Le/b/a/y/x/h1/e;

    invoke-direct {v1, p0, p1}, Le/b/a/y/x/h1/e;-><init>(Le/b/a/y/x/h1/f;Ljava/lang/Runnable;)V

    .line 2
    invoke-interface {v0, v1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p1

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "glide-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/h1/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-thread-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/h1/f;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-object p1
.end method
