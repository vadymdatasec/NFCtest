.class public final Lk/e1/k/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/x;


# instance fields
.field public final b:Ll/f;

.field public c:Z

.field public d:Z

.field public final synthetic e:Lk/e1/k/e0;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk/e1/k/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ll/f;

    invoke-direct {p1}, Ll/f;-><init>()V

    iput-object p1, p0, Lk/e1/k/b0;->b:Ll/f;

    return-void
.end method


# virtual methods
.method public a()Ll/a0;
    .locals 1

    .line 18
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v0, v0, Lk/e1/k/e0;->k:Lk/e1/k/d0;

    return-object v0
.end method

.method public a(Ll/f;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/e1/k/b0;->b:Ll/f;

    invoke-virtual {v0, p1, p2, p3}, Ll/f;->a(Ll/f;J)V

    .line 2
    :goto_0
    iget-object p1, p0, Lk/e1/k/b0;->b:Ll/f;

    invoke-virtual {p1}, Ll/f;->q()J

    move-result-wide p1

    const-wide/16 v0, 0x4000

    cmp-long p3, p1, v0

    if-ltz p3, :cond_0

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lk/e1/k/b0;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v1, v1, Lk/e1/k/e0;->k:Lk/e1/k/d0;

    invoke-virtual {v1}, Ll/d;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 6
    :goto_0
    :try_start_1
    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-wide v1, v1, Lk/e1/k/e0;->b:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    iget-boolean v1, p0, Lk/e1/k/b0;->d:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lk/e1/k/b0;->c:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v1, v1, Lk/e1/k/e0;->l:Lk/e1/k/a;

    if-nez v1, :cond_0

    .line 7
    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    invoke-virtual {v1}, Lk/e1/k/e0;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 8
    :cond_0
    :try_start_2
    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v1, v1, Lk/e1/k/e0;->k:Lk/e1/k/d0;

    invoke-virtual {v1}, Lk/e1/k/d0;->k()V

    .line 9
    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    invoke-virtual {v1}, Lk/e1/k/e0;->b()V

    .line 10
    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-wide v1, v1, Lk/e1/k/e0;->b:J

    iget-object v3, p0, Lk/e1/k/b0;->b:Ll/f;

    invoke-virtual {v3}, Ll/f;->q()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    .line 11
    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-wide v2, v1, Lk/e1/k/e0;->b:J

    sub-long/2addr v2, v9

    iput-wide v2, v1, Lk/e1/k/e0;->b:J

    .line 12
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 13
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v0, v0, Lk/e1/k/e0;->k:Lk/e1/k/d0;

    invoke-virtual {v0}, Ll/d;->g()V

    .line 14
    :try_start_3
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v5, v0, Lk/e1/k/e0;->d:Lk/e1/k/x;

    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget v6, v0, Lk/e1/k/e0;->c:I

    if-eqz p1, :cond_1

    iget-object p1, p0, Lk/e1/k/b0;->b:Ll/f;

    invoke-virtual {p1}, Ll/f;->q()J

    move-result-wide v0

    cmp-long p1, v9, v0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    const/4 v7, 0x0

    :goto_1
    iget-object v8, p0, Lk/e1/k/b0;->b:Ll/f;

    invoke-virtual/range {v5 .. v10}, Lk/e1/k/x;->a(IZLl/f;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 15
    iget-object p1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object p1, p1, Lk/e1/k/e0;->k:Lk/e1/k/d0;

    invoke-virtual {p1}, Lk/e1/k/d0;->k()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v0, v0, Lk/e1/k/e0;->k:Lk/e1/k/d0;

    invoke-virtual {v0}, Lk/e1/k/d0;->k()V

    throw p1

    :catchall_1
    move-exception p1

    .line 16
    :try_start_4
    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v1, v1, Lk/e1/k/e0;->k:Lk/e1/k/d0;

    invoke-virtual {v1}, Lk/e1/k/d0;->k()V

    throw p1

    :catchall_2
    move-exception p1

    .line 17
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method public close()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Lk/e1/k/b0;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 3
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 4
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v0, v0, Lk/e1/k/e0;->i:Lk/e1/k/b0;

    iget-boolean v0, v0, Lk/e1/k/b0;->d:Z

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 5
    iget-object v0, p0, Lk/e1/k/b0;->b:Ll/f;

    invoke-virtual {v0}, Ll/f;->q()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    .line 6
    :goto_0
    iget-object v0, p0, Lk/e1/k/b0;->b:Ll/f;

    invoke-virtual {v0}, Ll/f;->q()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    .line 7
    invoke-virtual {p0, v1}, Lk/e1/k/b0;->a(Z)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v2, v0, Lk/e1/k/e0;->d:Lk/e1/k/x;

    iget v3, v0, Lk/e1/k/e0;->c:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Lk/e1/k/x;->a(IZLl/f;J)V

    .line 9
    :cond_2
    iget-object v2, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    monitor-enter v2

    .line 10
    :try_start_1
    iput-boolean v1, p0, Lk/e1/k/b0;->c:Z

    .line 11
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v0, v0, Lk/e1/k/e0;->d:Lk/e1/k/x;

    invoke-virtual {v0}, Lk/e1/k/x;->flush()V

    .line 13
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    invoke-virtual {v0}, Lk/e1/k/e0;->a()V

    return-void

    :catchall_0
    move-exception v0

    .line 14
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    .line 15
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public flush()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    invoke-virtual {v1}, Lk/e1/k/e0;->b()V

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :goto_0
    iget-object v0, p0, Lk/e1/k/b0;->b:Ll/f;

    invoke-virtual {v0}, Ll/f;->q()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lk/e1/k/b0;->a(Z)V

    .line 6
    iget-object v0, p0, Lk/e1/k/b0;->e:Lk/e1/k/e0;

    iget-object v0, v0, Lk/e1/k/e0;->d:Lk/e1/k/x;

    invoke-virtual {v0}, Lk/e1/k/x;->flush()V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 7
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
