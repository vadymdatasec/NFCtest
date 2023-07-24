.class public final Lk/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/g;


# instance fields
.field public final b:Lk/o0;

.field public final c:Lk/e1/i/l;

.field public final d:Ll/d;

.field public e:Lk/a0;

.field public final f:Lk/u0;

.field public final g:Z

.field public h:Z


# direct methods
.method public constructor <init>(Lk/o0;Lk/u0;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lk/s0;->b:Lk/o0;

    .line 3
    iput-object p2, p0, Lk/s0;->f:Lk/u0;

    .line 4
    iput-boolean p3, p0, Lk/s0;->g:Z

    .line 5
    new-instance p2, Lk/e1/i/l;

    invoke-direct {p2, p1, p3}, Lk/e1/i/l;-><init>(Lk/o0;Z)V

    iput-object p2, p0, Lk/s0;->c:Lk/e1/i/l;

    .line 6
    new-instance p2, Lk/q0;

    invoke-direct {p2, p0}, Lk/q0;-><init>(Lk/s0;)V

    iput-object p2, p0, Lk/s0;->d:Ll/d;

    .line 7
    invoke-virtual {p1}, Lk/o0;->b()I

    move-result p1

    int-to-long v0, p1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v0, v1, p1}, Ll/a0;->a(JLjava/util/concurrent/TimeUnit;)Ll/a0;

    return-void
.end method

.method public static a(Lk/o0;Lk/u0;Z)Lk/s0;
    .locals 1

    .line 1
    new-instance v0, Lk/s0;

    invoke-direct {v0, p0, p1, p2}, Lk/s0;-><init>(Lk/o0;Lk/u0;Z)V

    .line 2
    invoke-virtual {p0}, Lk/o0;->k()Lk/z;

    move-result-object p0

    invoke-interface {p0, v0}, Lk/z;->a(Lk/g;)Lk/a0;

    move-result-object p0

    iput-object p0, v0, Lk/s0;->e:Lk/a0;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 3
    iget-object v0, p0, Lk/s0;->d:Ll/d;

    invoke-virtual {v0}, Ll/d;->h()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 4
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {v0, p1}, Ljava/io/InterruptedIOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_1
    return-object v0
.end method

.method public a()V
    .locals 1

    .line 6
    iget-object v0, p0, Lk/s0;->c:Lk/e1/i/l;

    invoke-virtual {v0}, Lk/e1/i/l;->a()V

    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, Lk/e1/l/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lk/s0;->c:Lk/e1/i/l;

    invoke-virtual {v1, v0}, Lk/e1/i/l;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public c()Lk/z0;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lk/s0;->h:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lk/s0;->h:Z

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    invoke-virtual {p0}, Lk/s0;->b()V

    .line 6
    iget-object v0, p0, Lk/s0;->d:Ll/d;

    invoke-virtual {v0}, Ll/d;->g()V

    .line 7
    iget-object v0, p0, Lk/s0;->e:Lk/a0;

    invoke-virtual {v0, p0}, Lk/a0;->b(Lk/g;)V

    .line 8
    :try_start_1
    iget-object v0, p0, Lk/s0;->b:Lk/o0;

    invoke-virtual {v0}, Lk/o0;->i()Lk/u;

    move-result-object v0

    invoke-virtual {v0, p0}, Lk/u;->a(Lk/s0;)V

    .line 9
    invoke-virtual {p0}, Lk/s0;->d()Lk/z0;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_0

    .line 10
    iget-object v1, p0, Lk/s0;->b:Lk/o0;

    invoke-virtual {v1}, Lk/o0;->i()Lk/u;

    move-result-object v1

    invoke-virtual {v1, p0}, Lk/u;->b(Lk/s0;)V

    return-object v0

    .line 11
    :cond_0
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 12
    :try_start_3
    invoke-virtual {p0, v0}, Lk/s0;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    .line 13
    iget-object v1, p0, Lk/s0;->e:Lk/a0;

    invoke-virtual {v1, p0, v0}, Lk/a0;->a(Lk/g;Ljava/io/IOException;)V

    .line 14
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 15
    :goto_0
    iget-object v1, p0, Lk/s0;->b:Lk/o0;

    invoke-virtual {v1}, Lk/o0;->i()Lk/u;

    move-result-object v1

    invoke-virtual {v1, p0}, Lk/u;->b(Lk/s0;)V

    throw v0

    .line 16
    :cond_1
    :try_start_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    .line 17
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lk/s0;->clone()Lk/s0;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lk/s0;
    .locals 3

    .line 2
    iget-object v0, p0, Lk/s0;->b:Lk/o0;

    iget-object v1, p0, Lk/s0;->f:Lk/u0;

    iget-boolean v2, p0, Lk/s0;->g:Z

    invoke-static {v0, v1, v2}, Lk/s0;->a(Lk/o0;Lk/u0;Z)Lk/s0;

    move-result-object v0

    return-object v0
.end method

.method public d()Lk/z0;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v0, p0, Lk/s0;->b:Lk/o0;

    invoke-virtual {v0}, Lk/o0;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 3
    iget-object v0, p0, Lk/s0;->c:Lk/e1/i/l;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    new-instance v0, Lk/e1/i/a;

    iget-object v2, p0, Lk/s0;->b:Lk/o0;

    invoke-virtual {v2}, Lk/o0;->h()Lk/t;

    move-result-object v2

    invoke-direct {v0, v2}, Lk/e1/i/a;-><init>(Lk/t;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v0, Lk/e1/g/b;

    iget-object v2, p0, Lk/s0;->b:Lk/o0;

    invoke-virtual {v2}, Lk/o0;->p()Lk/e1/g/f;

    move-result-object v2

    invoke-direct {v0, v2}, Lk/e1/g/b;-><init>(Lk/e1/g/f;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance v0, Lk/e1/h/a;

    iget-object v2, p0, Lk/s0;->b:Lk/o0;

    invoke-direct {v0, v2}, Lk/e1/h/a;-><init>(Lk/o0;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-boolean v0, p0, Lk/s0;->g:Z

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lk/s0;->b:Lk/o0;

    invoke-virtual {v0}, Lk/o0;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 9
    :cond_0
    new-instance v0, Lk/e1/i/c;

    iget-boolean v2, p0, Lk/s0;->g:Z

    invoke-direct {v0, v2}, Lk/e1/i/c;-><init>(Z)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v12, Lk/e1/i/i;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, Lk/s0;->f:Lk/u0;

    iget-object v8, p0, Lk/s0;->e:Lk/a0;

    iget-object v0, p0, Lk/s0;->b:Lk/o0;

    .line 11
    invoke-virtual {v0}, Lk/o0;->e()I

    move-result v9

    iget-object v0, p0, Lk/s0;->b:Lk/o0;

    .line 12
    invoke-virtual {v0}, Lk/o0;->x()I

    move-result v10

    iget-object v0, p0, Lk/s0;->b:Lk/o0;

    invoke-virtual {v0}, Lk/o0;->B()I

    move-result v11

    move-object v0, v12

    move-object v7, p0

    invoke-direct/range {v0 .. v11}, Lk/e1/i/i;-><init>(Ljava/util/List;Lk/e1/h/h;Lk/e1/i/d;Lk/e1/h/c;ILk/u0;Lk/g;Lk/a0;III)V

    .line 13
    iget-object v0, p0, Lk/s0;->f:Lk/u0;

    invoke-interface {v12, v0}, Lk/g0;->a(Lk/u0;)Lk/z0;

    move-result-object v0

    return-object v0
.end method
