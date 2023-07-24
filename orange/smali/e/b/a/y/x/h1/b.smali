.class public final Le/b/a/y/x/h1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:I

.field public c:I

.field public final d:Ljava/util/concurrent/ThreadFactory;

.field public e:Le/b/a/y/x/h1/j;

.field public f:Ljava/lang/String;

.field public g:J


# direct methods
.method public constructor <init>(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/b/a/y/x/h1/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/b/a/y/x/h1/d;-><init>(Le/b/a/y/x/h1/a;)V

    iput-object v0, p0, Le/b/a/y/x/h1/b;->d:Ljava/util/concurrent/ThreadFactory;

    .line 3
    sget-object v0, Le/b/a/y/x/h1/j;->b:Le/b/a/y/x/h1/j;

    iput-object v0, p0, Le/b/a/y/x/h1/b;->e:Le/b/a/y/x/h1/j;

    .line 4
    iput-boolean p1, p0, Le/b/a/y/x/h1/b;->a:Z

    return-void
.end method


# virtual methods
.method public a(I)Le/b/a/y/x/h1/b;
    .locals 0

    .line 1
    iput p1, p0, Le/b/a/y/x/h1/b;->b:I

    .line 2
    iput p1, p0, Le/b/a/y/x/h1/b;->c:I

    return-object p0
.end method

.method public a(Ljava/lang/String;)Le/b/a/y/x/h1/b;
    .locals 0

    .line 3
    iput-object p1, p0, Le/b/a/y/x/h1/b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public a()Le/b/a/y/x/h1/k;
    .locals 12

    .line 4
    iget-object v0, p0, Le/b/a/y/x/h1/b;->f:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    iget v2, p0, Le/b/a/y/x/h1/b;->b:I

    iget v3, p0, Le/b/a/y/x/h1/b;->c:I

    iget-wide v4, p0, Le/b/a/y/x/h1/b;->g:J

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v8, Le/b/a/y/x/h1/f;

    iget-object v1, p0, Le/b/a/y/x/h1/b;->d:Ljava/util/concurrent/ThreadFactory;

    iget-object v9, p0, Le/b/a/y/x/h1/b;->f:Ljava/lang/String;

    iget-object v10, p0, Le/b/a/y/x/h1/b;->e:Le/b/a/y/x/h1/j;

    iget-boolean v11, p0, Le/b/a/y/x/h1/b;->a:Z

    invoke-direct {v8, v1, v9, v10, v11}, Le/b/a/y/x/h1/f;-><init>(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;Le/b/a/y/x/h1/j;Z)V

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 6
    iget-wide v1, p0, Le/b/a/y/x/h1/b;->g:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 8
    :cond_0
    new-instance v1, Le/b/a/y/x/h1/k;

    invoke-direct {v1, v0}, Le/b/a/y/x/h1/k;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-object v1

    .line 9
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Name must be non-null and non-empty, but given: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/b/a/y/x/h1/b;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
