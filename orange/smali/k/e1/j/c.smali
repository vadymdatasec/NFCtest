.class public final Lk/e1/j/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/x;


# instance fields
.field public final b:Ll/l;

.field public c:Z

.field public final synthetic d:Lk/e1/j/h;


# direct methods
.method public constructor <init>(Lk/e1/j/h;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ll/l;

    iget-object v0, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->d:Ll/g;

    invoke-interface {v0}, Ll/x;->a()Ll/a0;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/l;-><init>(Ll/a0;)V

    iput-object p1, p0, Lk/e1/j/c;->b:Ll/l;

    return-void
.end method


# virtual methods
.method public a()Ll/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/j/c;->b:Ll/l;

    return-object v0
.end method

.method public a(Ll/f;J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-boolean v0, p0, Lk/e1/j/c;->c:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->d:Ll/g;

    invoke-interface {v0, p2, p3}, Ll/g;->a(J)Ll/g;

    .line 4
    iget-object v0, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->d:Ll/g;

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Ll/g;->a(Ljava/lang/String;)Ll/g;

    .line 5
    iget-object v0, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->d:Ll/g;

    invoke-interface {v0, p1, p2, p3}, Ll/x;->a(Ll/f;J)V

    .line 6
    iget-object p1, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    iget-object p1, p1, Lk/e1/j/h;->d:Ll/g;

    invoke-interface {p1, v1}, Ll/g;->a(Ljava/lang/String;)Ll/g;

    return-void

    .line 7
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public declared-synchronized close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lk/e1/j/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    :try_start_1
    iput-boolean v0, p0, Lk/e1/j/c;->c:Z

    .line 3
    iget-object v0, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->d:Ll/g;

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Ll/g;->a(Ljava/lang/String;)Ll/g;

    .line 4
    iget-object v0, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    iget-object v1, p0, Lk/e1/j/c;->b:Ll/l;

    invoke-virtual {v0, v1}, Lk/e1/j/h;->a(Ll/l;)V

    .line 5
    iget-object v0, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    const/4 v1, 0x3

    iput v1, v0, Lk/e1/j/h;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lk/e1/j/c;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 2
    :cond_0
    :try_start_1
    iget-object v0, p0, Lk/e1/j/c;->d:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->d:Ll/g;

    invoke-interface {v0}, Ll/g;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
