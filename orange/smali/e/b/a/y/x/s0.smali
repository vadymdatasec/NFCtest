.class public Le/b/a/y/x/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/y0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/y/x/y0<",
        "TZ;>;"
    }
.end annotation


# instance fields
.field public final b:Z

.field public final c:Z

.field public final d:Le/b/a/y/x/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/b/a/y/x/y0<",
            "TZ;>;"
        }
    .end annotation
.end field

.field public final e:Le/b/a/y/x/r0;

.field public final f:Le/b/a/y/n;

.field public g:I

.field public h:Z


# direct methods
.method public constructor <init>(Le/b/a/y/x/y0;ZZLe/b/a/y/n;Le/b/a/y/x/r0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "TZ;>;ZZ",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/r0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Le/b/a/y/x/y0;

    iput-object p1, p0, Le/b/a/y/x/s0;->d:Le/b/a/y/x/y0;

    .line 3
    iput-boolean p2, p0, Le/b/a/y/x/s0;->b:Z

    .line 4
    iput-boolean p3, p0, Le/b/a/y/x/s0;->c:Z

    .line 5
    iput-object p4, p0, Le/b/a/y/x/s0;->f:Le/b/a/y/n;

    .line 6
    invoke-static {p5}, Le/b/a/e0/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p5, Le/b/a/y/x/r0;

    iput-object p5, p0, Le/b/a/y/x/s0;->e:Le/b/a/y/x/r0;

    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Le/b/a/y/x/s0;->h:Z

    if-nez v0, :cond_0

    .line 2
    iget v0, p0, Le/b/a/y/x/s0;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Le/b/a/y/x/s0;->g:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    .line 4
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot acquire a recycled resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/s0;->d:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->b()I

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TZ;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/s0;->d:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->c()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized d()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget v0, p0, Le/b/a/y/x/s0;->g:I

    if-gtz v0, :cond_2

    .line 2
    iget-boolean v0, p0, Le/b/a/y/x/s0;->h:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Le/b/a/y/x/s0;->h:Z

    .line 4
    iget-boolean v0, p0, Le/b/a/y/x/s0;->c:Z

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Le/b/a/y/x/s0;->d:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :cond_0
    monitor-exit p0

    return-void

    .line 7
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot recycle a resource that has already been recycled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot recycle a resource while it is still acquired"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public e()Le/b/a/y/x/y0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/b/a/y/x/y0<",
            "TZ;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/s0;->d:Le/b/a/y/x/y0;

    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/b/a/y/x/s0;->b:Z

    return v0
.end method

.method public g()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Le/b/a/y/x/s0;->g:I

    if-lez v0, :cond_2

    .line 3
    iget v0, p0, Le/b/a/y/x/s0;->g:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Le/b/a/y/x/s0;->g:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 4
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 5
    iget-object v0, p0, Le/b/a/y/x/s0;->e:Le/b/a/y/x/r0;

    iget-object v1, p0, Le/b/a/y/x/s0;->f:Le/b/a/y/n;

    invoke-interface {v0, v1, p0}, Le/b/a/y/x/r0;->a(Le/b/a/y/n;Le/b/a/y/x/s0;)V

    :cond_1
    return-void

    .line 6
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot release a recycled or not yet acquired resource"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 7
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TZ;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/s0;->d:Le/b/a/y/x/y0;

    invoke-interface {v0}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EngineResource{isMemoryCacheable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Le/b/a/y/x/s0;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", listener="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/s0;->e:Le/b/a/y/x/r0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/s0;->f:Le/b/a/y/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", acquired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/b/a/y/x/s0;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isRecycled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Le/b/a/y/x/s0;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", resource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/b/a/y/x/s0;->d:Le/b/a/y/x/y0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
