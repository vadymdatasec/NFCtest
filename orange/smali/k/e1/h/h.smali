.class public final Lk/e1/h/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk/a;

.field public b:Lk/e1/h/e;

.field public c:Lk/c1;

.field public final d:Lk/o;

.field public final e:Lk/g;

.field public final f:Lk/a0;

.field public final g:Ljava/lang/Object;

.field public final h:Lk/e1/h/f;

.field public i:I

.field public j:Lk/e1/h/c;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Lk/e1/i/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk/o;Lk/a;Lk/g;Lk/a0;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lk/e1/h/h;->d:Lk/o;

    .line 3
    iput-object p2, p0, Lk/e1/h/h;->a:Lk/a;

    .line 4
    iput-object p3, p0, Lk/e1/h/h;->e:Lk/g;

    .line 5
    iput-object p4, p0, Lk/e1/h/h;->f:Lk/a0;

    .line 6
    new-instance p1, Lk/e1/h/f;

    invoke-virtual {p0}, Lk/e1/h/h;->i()Lk/e1/h/d;

    move-result-object v0

    invoke-direct {p1, p2, v0, p3, p4}, Lk/e1/h/f;-><init>(Lk/a;Lk/e1/h/d;Lk/g;Lk/a0;)V

    iput-object p1, p0, Lk/e1/h/h;->h:Lk/e1/h/f;

    .line 7
    iput-object p5, p0, Lk/e1/h/h;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(ZZZ)Ljava/net/Socket;
    .locals 1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 91
    iput-object v0, p0, Lk/e1/h/h;->n:Lk/e1/i/d;

    :cond_0
    const/4 p3, 0x1

    if-eqz p2, :cond_1

    .line 92
    iput-boolean p3, p0, Lk/e1/h/h;->l:Z

    .line 93
    :cond_1
    iget-object p2, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    if-eqz p2, :cond_5

    if-eqz p1, :cond_2

    .line 94
    iput-boolean p3, p2, Lk/e1/h/c;->k:Z

    .line 95
    :cond_2
    iget-object p1, p0, Lk/e1/h/h;->n:Lk/e1/i/d;

    if-nez p1, :cond_5

    iget-boolean p1, p0, Lk/e1/h/h;->l:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    iget-boolean p1, p1, Lk/e1/h/c;->k:Z

    if-eqz p1, :cond_5

    .line 96
    :cond_3
    iget-object p1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    invoke-virtual {p0, p1}, Lk/e1/h/h;->a(Lk/e1/h/c;)V

    .line 97
    iget-object p1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    iget-object p1, p1, Lk/e1/h/c;->n:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 98
    iget-object p1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p2

    iput-wide p2, p1, Lk/e1/h/c;->o:J

    .line 99
    sget-object p1, Lk/e1/a;->a:Lk/e1/a;

    iget-object p2, p0, Lk/e1/h/h;->d:Lk/o;

    iget-object p3, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    invoke-virtual {p1, p2, p3}, Lk/e1/a;->a(Lk/o;Lk/e1/h/c;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 100
    iget-object p1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    invoke-virtual {p1}, Lk/e1/h/c;->f()Ljava/net/Socket;

    move-result-object p1

    goto :goto_0

    :cond_4
    move-object p1, v0

    .line 101
    :goto_0
    iput-object v0, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    move-object v0, p1

    :cond_5
    return-object v0
.end method

.method public final a(IIIIZ)Lk/e1/h/c;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 21
    iget-object v2, v1, Lk/e1/h/h;->d:Lk/o;

    monitor-enter v2

    .line 22
    :try_start_0
    iget-boolean v0, v1, Lk/e1/h/h;->l:Z

    if-nez v0, :cond_12

    .line 23
    iget-object v0, v1, Lk/e1/h/h;->n:Lk/e1/i/d;

    if-nez v0, :cond_11

    .line 24
    iget-boolean v0, v1, Lk/e1/h/h;->m:Z

    if-nez v0, :cond_10

    .line 25
    iget-object v0, v1, Lk/e1/h/h;->j:Lk/e1/h/c;

    .line 26
    invoke-virtual/range {p0 .. p0}, Lk/e1/h/h;->g()Ljava/net/Socket;

    move-result-object v3

    .line 27
    iget-object v4, v1, Lk/e1/h/h;->j:Lk/e1/h/c;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    .line 28
    iget-object v0, v1, Lk/e1/h/h;->j:Lk/e1/h/c;

    move-object v4, v5

    goto :goto_0

    :cond_0
    move-object v4, v0

    move-object v0, v5

    .line 29
    :goto_0
    iget-boolean v6, v1, Lk/e1/h/h;->k:Z

    if-nez v6, :cond_1

    move-object v4, v5

    :cond_1
    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v0, :cond_3

    .line 30
    sget-object v8, Lk/e1/a;->a:Lk/e1/a;

    iget-object v9, v1, Lk/e1/h/h;->d:Lk/o;

    iget-object v10, v1, Lk/e1/h/h;->a:Lk/a;

    invoke-virtual {v8, v9, v10, v1, v5}, Lk/e1/a;->a(Lk/o;Lk/a;Lk/e1/h/h;Lk/c1;)Lk/e1/h/c;

    .line 31
    iget-object v8, v1, Lk/e1/h/h;->j:Lk/e1/h/c;

    if-eqz v8, :cond_2

    .line 32
    iget-object v0, v1, Lk/e1/h/h;->j:Lk/e1/h/c;

    move-object v8, v5

    const/4 v9, 0x1

    goto :goto_2

    .line 33
    :cond_2
    iget-object v8, v1, Lk/e1/h/h;->c:Lk/c1;

    goto :goto_1

    :cond_3
    move-object v8, v5

    :goto_1
    const/4 v9, 0x0

    .line 34
    :goto_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 35
    invoke-static {v3}, Lk/e1/e;->a(Ljava/net/Socket;)V

    if-eqz v4, :cond_4

    .line 36
    iget-object v2, v1, Lk/e1/h/h;->f:Lk/a0;

    iget-object v3, v1, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v2, v3, v4}, Lk/a0;->b(Lk/g;Lk/m;)V

    :cond_4
    if-eqz v9, :cond_5

    .line 37
    iget-object v2, v1, Lk/e1/h/h;->f:Lk/a0;

    iget-object v3, v1, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v2, v3, v0}, Lk/a0;->a(Lk/g;Lk/m;)V

    :cond_5
    if-eqz v0, :cond_6

    return-object v0

    :cond_6
    if-nez v8, :cond_8

    .line 38
    iget-object v2, v1, Lk/e1/h/h;->b:Lk/e1/h/e;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lk/e1/h/e;->b()Z

    move-result v2

    if-nez v2, :cond_8

    .line 39
    :cond_7
    iget-object v2, v1, Lk/e1/h/h;->h:Lk/e1/h/f;

    invoke-virtual {v2}, Lk/e1/h/f;->c()Lk/e1/h/e;

    move-result-object v2

    iput-object v2, v1, Lk/e1/h/h;->b:Lk/e1/h/e;

    const/4 v2, 0x1

    goto :goto_3

    :cond_8
    const/4 v2, 0x0

    .line 40
    :goto_3
    iget-object v3, v1, Lk/e1/h/h;->d:Lk/o;

    monitor-enter v3

    .line 41
    :try_start_1
    iget-boolean v4, v1, Lk/e1/h/h;->m:Z

    if-nez v4, :cond_f

    if-eqz v2, :cond_a

    .line 42
    iget-object v2, v1, Lk/e1/h/h;->b:Lk/e1/h/e;

    invoke-virtual {v2}, Lk/e1/h/e;->a()Ljava/util/List;

    move-result-object v2

    .line 43
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v4, :cond_a

    .line 44
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lk/c1;

    .line 45
    sget-object v12, Lk/e1/a;->a:Lk/e1/a;

    iget-object v13, v1, Lk/e1/h/h;->d:Lk/o;

    iget-object v14, v1, Lk/e1/h/h;->a:Lk/a;

    invoke-virtual {v12, v13, v14, v1, v11}, Lk/e1/a;->a(Lk/o;Lk/a;Lk/e1/h/h;Lk/c1;)Lk/e1/h/c;

    .line 46
    iget-object v12, v1, Lk/e1/h/h;->j:Lk/e1/h/c;

    if-eqz v12, :cond_9

    .line 47
    iget-object v0, v1, Lk/e1/h/h;->j:Lk/e1/h/c;

    .line 48
    iput-object v11, v1, Lk/e1/h/h;->c:Lk/c1;

    const/4 v9, 0x1

    goto :goto_5

    :cond_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_a
    :goto_5
    if-nez v9, :cond_c

    if-nez v8, :cond_b

    .line 49
    iget-object v0, v1, Lk/e1/h/h;->b:Lk/e1/h/e;

    invoke-virtual {v0}, Lk/e1/h/e;->c()Lk/c1;

    move-result-object v8

    .line 50
    :cond_b
    iput-object v8, v1, Lk/e1/h/h;->c:Lk/c1;

    .line 51
    iput v7, v1, Lk/e1/h/h;->i:I

    .line 52
    new-instance v0, Lk/e1/h/c;

    iget-object v2, v1, Lk/e1/h/h;->d:Lk/o;

    invoke-direct {v0, v2, v8}, Lk/e1/h/c;-><init>(Lk/o;Lk/c1;)V

    .line 53
    invoke-virtual {v1, v0, v7}, Lk/e1/h/h;->a(Lk/e1/h/c;Z)V

    .line 54
    :cond_c
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v9, :cond_d

    .line 55
    iget-object v2, v1, Lk/e1/h/h;->f:Lk/a0;

    iget-object v3, v1, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v2, v3, v0}, Lk/a0;->a(Lk/g;Lk/m;)V

    return-object v0

    .line 56
    :cond_d
    iget-object v2, v1, Lk/e1/h/h;->e:Lk/g;

    iget-object v3, v1, Lk/e1/h/h;->f:Lk/a0;

    move-object v10, v0

    move/from16 v11, p1

    move/from16 v12, p2

    move/from16 v13, p3

    move/from16 v14, p4

    move/from16 v15, p5

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    invoke-virtual/range {v10 .. v17}, Lk/e1/h/c;->a(IIIIZLk/g;Lk/a0;)V

    .line 57
    invoke-virtual/range {p0 .. p0}, Lk/e1/h/h;->i()Lk/e1/h/d;

    move-result-object v2

    invoke-virtual {v0}, Lk/e1/h/c;->e()Lk/c1;

    move-result-object v3

    invoke-virtual {v2, v3}, Lk/e1/h/d;->a(Lk/c1;)V

    .line 58
    iget-object v2, v1, Lk/e1/h/h;->d:Lk/o;

    monitor-enter v2

    .line 59
    :try_start_2
    iput-boolean v6, v1, Lk/e1/h/h;->k:Z

    .line 60
    sget-object v3, Lk/e1/a;->a:Lk/e1/a;

    iget-object v4, v1, Lk/e1/h/h;->d:Lk/o;

    invoke-virtual {v3, v4, v0}, Lk/e1/a;->b(Lk/o;Lk/e1/h/c;)V

    .line 61
    invoke-virtual {v0}, Lk/e1/h/c;->d()Z

    move-result v3

    if-eqz v3, :cond_e

    .line 62
    sget-object v0, Lk/e1/a;->a:Lk/e1/a;

    iget-object v3, v1, Lk/e1/h/h;->d:Lk/o;

    iget-object v4, v1, Lk/e1/h/h;->a:Lk/a;

    invoke-virtual {v0, v3, v4, v1}, Lk/e1/a;->a(Lk/o;Lk/a;Lk/e1/h/h;)Ljava/net/Socket;

    move-result-object v5

    .line 63
    iget-object v0, v1, Lk/e1/h/h;->j:Lk/e1/h/c;

    .line 64
    :cond_e
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    invoke-static {v5}, Lk/e1/e;->a(Ljava/net/Socket;)V

    .line 66
    iget-object v2, v1, Lk/e1/h/h;->f:Lk/a0;

    iget-object v3, v1, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v2, v3, v0}, Lk/a0;->a(Lk/g;Lk/m;)V

    return-object v0

    :catchall_0
    move-exception v0

    .line 67
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    .line 68
    :cond_f
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    .line 69
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    .line 70
    :cond_10
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "codec != null"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "released"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    .line 73
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0
.end method

.method public final a(IIIIZZ)Lk/e1/h/c;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    :goto_0
    invoke-virtual/range {p0 .. p5}, Lk/e1/h/h;->a(IIIIZ)Lk/e1/h/c;

    move-result-object v0

    .line 14
    iget-object v1, p0, Lk/e1/h/h;->d:Lk/o;

    monitor-enter v1

    .line 15
    :try_start_0
    iget v2, v0, Lk/e1/h/c;->l:I

    if-nez v2, :cond_0

    .line 16
    monitor-exit v1

    return-object v0

    .line 17
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-virtual {v0, p6}, Lk/e1/h/c;->a(Z)Z

    move-result v1

    if-nez v1, :cond_1

    .line 19
    invoke-virtual {p0}, Lk/e1/h/h;->e()V

    goto :goto_0

    :cond_1
    return-object v0

    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Lk/o0;Lk/g0;Z)Lk/e1/i/d;
    .locals 7

    .line 1
    invoke-interface {p2}, Lk/g0;->c()I

    move-result v1

    .line 2
    invoke-interface {p2}, Lk/g0;->d()I

    move-result v2

    .line 3
    invoke-interface {p2}, Lk/g0;->a()I

    move-result v3

    .line 4
    invoke-virtual {p1}, Lk/o0;->s()I

    move-result v4

    .line 5
    invoke-virtual {p1}, Lk/o0;->y()Z

    move-result v5

    move-object v0, p0

    move v6, p3

    .line 6
    :try_start_0
    invoke-virtual/range {v0 .. v6}, Lk/e1/h/h;->a(IIIIZZ)Lk/e1/h/c;

    move-result-object p3

    .line 7
    invoke-virtual {p3, p1, p2, p0}, Lk/e1/h/c;->a(Lk/o0;Lk/g0;Lk/e1/h/h;)Lk/e1/i/d;

    move-result-object p1

    .line 8
    iget-object p2, p0, Lk/e1/h/h;->d:Lk/o;

    monitor-enter p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    :try_start_1
    iput-object p1, p0, Lk/e1/h/h;->n:Lk/e1/i/d;

    .line 10
    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p1

    .line 11
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception p1

    .line 12
    new-instance p2, Lokhttp3/internal/connection/RouteException;

    invoke-direct {p2, p1}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    throw p2
.end method

.method public a()V
    .locals 3

    .line 102
    iget-object v0, p0, Lk/e1/h/h;->d:Lk/o;

    monitor-enter v0

    const/4 v1, 0x1

    .line 103
    :try_start_0
    iput-boolean v1, p0, Lk/e1/h/h;->m:Z

    .line 104
    iget-object v1, p0, Lk/e1/h/h;->n:Lk/e1/i/d;

    .line 105
    iget-object v2, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    .line 106
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 107
    invoke-interface {v1}, Lk/e1/i/d;->cancel()V

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    .line 108
    invoke-virtual {v2}, Lk/e1/h/c;->a()V

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    .line 109
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public a(Ljava/io/IOException;)V
    .locals 6

    .line 110
    iget-object v0, p0, Lk/e1/h/h;->d:Lk/o;

    monitor-enter v0

    .line 111
    :try_start_0
    instance-of v1, p1, Lokhttp3/internal/http2/StreamResetException;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    .line 112
    check-cast p1, Lokhttp3/internal/http2/StreamResetException;

    iget-object p1, p1, Lokhttp3/internal/http2/StreamResetException;->b:Lk/e1/k/a;

    .line 113
    sget-object v1, Lk/e1/k/a;->g:Lk/e1/k/a;

    if-ne p1, v1, :cond_0

    .line 114
    iget p1, p0, Lk/e1/h/h;->i:I

    add-int/2addr p1, v4

    iput p1, p0, Lk/e1/h/h;->i:I

    if-le p1, v4, :cond_5

    .line 115
    iput-object v3, p0, Lk/e1/h/h;->c:Lk/c1;

    goto :goto_0

    .line 116
    :cond_0
    sget-object v1, Lk/e1/k/a;->h:Lk/e1/k/a;

    if-eq p1, v1, :cond_5

    .line 117
    iput-object v3, p0, Lk/e1/h/h;->c:Lk/c1;

    goto :goto_0

    .line 118
    :cond_1
    iget-object v1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    .line 119
    invoke-virtual {v1}, Lk/e1/h/c;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v1, p1, Lokhttp3/internal/http2/ConnectionShutdownException;

    if-eqz v1, :cond_5

    .line 120
    :cond_2
    iget-object v1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    iget v1, v1, Lk/e1/h/c;->l:I

    if-nez v1, :cond_4

    .line 121
    iget-object v1, p0, Lk/e1/h/h;->c:Lk/c1;

    if-eqz v1, :cond_3

    if-eqz p1, :cond_3

    .line 122
    iget-object v1, p0, Lk/e1/h/h;->h:Lk/e1/h/f;

    iget-object v5, p0, Lk/e1/h/h;->c:Lk/c1;

    invoke-virtual {v1, v5, p1}, Lk/e1/h/f;->a(Lk/c1;Ljava/io/IOException;)V

    .line 123
    :cond_3
    iput-object v3, p0, Lk/e1/h/h;->c:Lk/c1;

    :cond_4
    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    .line 124
    :goto_1
    iget-object v1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    .line 125
    invoke-virtual {p0, p1, v2, v4}, Lk/e1/h/h;->a(ZZZ)Ljava/net/Socket;

    move-result-object p1

    .line 126
    iget-object v2, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    if-nez v2, :cond_7

    iget-boolean v2, p0, Lk/e1/h/h;->k:Z

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    move-object v3, v1

    .line 127
    :cond_7
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    invoke-static {p1}, Lk/e1/e;->a(Ljava/net/Socket;)V

    if-eqz v3, :cond_8

    .line 129
    iget-object p1, p0, Lk/e1/h/h;->f:Lk/a0;

    iget-object v0, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {p1, v0, v3}, Lk/a0;->b(Lk/g;Lk/m;)V

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 130
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Lk/e1/h/c;)V
    .locals 3

    .line 136
    iget-object v0, p1, Lk/e1/h/c;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 137
    iget-object v2, p1, Lk/e1/h/c;->n:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/Reference;

    .line 138
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p0, :cond_0

    .line 139
    iget-object p1, p1, Lk/e1/h/c;->n:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 140
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public a(Lk/e1/h/c;Z)V
    .locals 1

    .line 131
    iget-object v0, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    if-nez v0, :cond_0

    .line 132
    iput-object p1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    .line 133
    iput-boolean p2, p0, Lk/e1/h/h;->k:Z

    .line 134
    iget-object p1, p1, Lk/e1/h/c;->n:Ljava/util/List;

    new-instance p2, Lk/e1/h/g;

    iget-object v0, p0, Lk/e1/h/h;->g:Ljava/lang/Object;

    invoke-direct {p2, p0, v0}, Lk/e1/h/g;-><init>(Lk/e1/h/h;Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 135
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public a(ZLk/e1/i/d;JLjava/io/IOException;)V
    .locals 2

    .line 74
    iget-object v0, p0, Lk/e1/h/h;->f:Lk/a0;

    iget-object v1, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v0, v1, p3, p4}, Lk/a0;->b(Lk/g;J)V

    .line 75
    iget-object p3, p0, Lk/e1/h/h;->d:Lk/o;

    monitor-enter p3

    if-eqz p2, :cond_5

    .line 76
    :try_start_0
    iget-object p4, p0, Lk/e1/h/h;->n:Lk/e1/i/d;

    if-ne p2, p4, :cond_5

    const/4 p2, 0x1

    if-nez p1, :cond_0

    .line 77
    iget-object p4, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    iget v0, p4, Lk/e1/h/c;->l:I

    add-int/2addr v0, p2

    iput v0, p4, Lk/e1/h/c;->l:I

    .line 78
    :cond_0
    iget-object p4, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    const/4 v0, 0x0

    .line 79
    invoke-virtual {p0, p1, v0, p2}, Lk/e1/h/h;->a(ZZZ)Ljava/net/Socket;

    move-result-object p1

    .line 80
    iget-object p2, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    move-object p4, v0

    .line 81
    :cond_1
    iget-boolean p2, p0, Lk/e1/h/h;->l:Z

    .line 82
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    invoke-static {p1}, Lk/e1/e;->a(Ljava/net/Socket;)V

    if-eqz p4, :cond_2

    .line 84
    iget-object p1, p0, Lk/e1/h/h;->f:Lk/a0;

    iget-object p3, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {p1, p3, p4}, Lk/a0;->b(Lk/g;Lk/m;)V

    :cond_2
    if-eqz p5, :cond_3

    .line 85
    sget-object p1, Lk/e1/a;->a:Lk/e1/a;

    iget-object p2, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {p1, p2, p5}, Lk/e1/a;->a(Lk/g;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    .line 86
    iget-object p2, p0, Lk/e1/h/h;->f:Lk/a0;

    iget-object p3, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {p2, p3, p1}, Lk/a0;->a(Lk/g;Ljava/io/IOException;)V

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    .line 87
    sget-object p1, Lk/e1/a;->a:Lk/e1/a;

    iget-object p2, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {p1, p2, v0}, Lk/e1/a;->a(Lk/g;Ljava/io/IOException;)Ljava/io/IOException;

    .line 88
    iget-object p1, p0, Lk/e1/h/h;->f:Lk/a0;

    iget-object p2, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {p1, p2}, Lk/a0;->a(Lk/g;)V

    :cond_4
    :goto_0
    return-void

    .line 89
    :cond_5
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "expected "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p5, p0, Lk/e1/h/h;->n:Lk/e1/i/d;

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p5, " but was "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 90
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public b(Lk/e1/h/c;)Ljava/net/Socket;
    .locals 3

    .line 4
    iget-object v0, p0, Lk/e1/h/h;->n:Lk/e1/i/d;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    iget-object v0, v0, Lk/e1/h/c;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 5
    iget-object v0, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    iget-object v0, v0, Lk/e1/h/c;->n:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/Reference;

    .line 6
    invoke-virtual {p0, v1, v2, v2}, Lk/e1/h/h;->a(ZZZ)Ljava/net/Socket;

    move-result-object v1

    .line 7
    iput-object p1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    .line 8
    iget-object p1, p1, Lk/e1/h/c;->n:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v1

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public b()Lk/e1/i/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lk/e1/h/h;->d:Lk/o;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lk/e1/h/h;->n:Lk/e1/i/d;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public declared-synchronized c()Lk/e1/h/c;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lk/e1/h/h;->j:Lk/e1/h/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/h/h;->c:Lk/c1;

    if-nez v0, :cond_2

    iget-object v0, p0, Lk/e1/h/h;->b:Lk/e1/h/e;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lk/e1/h/e;->b()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lk/e1/h/h;->h:Lk/e1/h/f;

    .line 3
    invoke-virtual {v0}, Lk/e1/h/f;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk/e1/h/h;->d:Lk/o;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 3
    invoke-virtual {p0, v2, v3, v3}, Lk/e1/h/h;->a(ZZZ)Ljava/net/Socket;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    if-eqz v3, :cond_0

    const/4 v1, 0x0

    .line 5
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-static {v2}, Lk/e1/e;->a(Ljava/net/Socket;)V

    if-eqz v1, :cond_1

    .line 7
    iget-object v0, p0, Lk/e1/h/h;->f:Lk/a0;

    iget-object v2, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v0, v2, v1}, Lk/a0;->b(Lk/g;Lk/m;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 8
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public f()V
    .locals 5

    .line 1
    iget-object v0, p0, Lk/e1/h/h;->d:Lk/o;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 3
    invoke-virtual {p0, v3, v2, v3}, Lk/e1/h/h;->a(ZZZ)Ljava/net/Socket;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v1, v4

    .line 5
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-static {v2}, Lk/e1/e;->a(Ljava/net/Socket;)V

    if-eqz v1, :cond_1

    .line 7
    sget-object v0, Lk/e1/a;->a:Lk/e1/a;

    iget-object v2, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v0, v2, v4}, Lk/e1/a;->a(Lk/g;Ljava/io/IOException;)Ljava/io/IOException;

    .line 8
    iget-object v0, p0, Lk/e1/h/h;->f:Lk/a0;

    iget-object v2, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v0, v2, v1}, Lk/a0;->b(Lk/g;Lk/m;)V

    .line 9
    iget-object v0, p0, Lk/e1/h/h;->f:Lk/a0;

    iget-object v1, p0, Lk/e1/h/h;->e:Lk/g;

    invoke-virtual {v0, v1}, Lk/a0;->a(Lk/g;)V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 10
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final g()Ljava/net/Socket;
    .locals 2

    .line 1
    iget-object v0, p0, Lk/e1/h/h;->j:Lk/e1/h/c;

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, v0, Lk/e1/h/c;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v1, v1, v0}, Lk/e1/h/h;->a(ZZZ)Ljava/net/Socket;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public h()Lk/c1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/h/h;->c:Lk/c1;

    return-object v0
.end method

.method public final i()Lk/e1/h/d;
    .locals 2

    .line 1
    sget-object v0, Lk/e1/a;->a:Lk/e1/a;

    iget-object v1, p0, Lk/e1/h/h;->d:Lk/o;

    invoke-virtual {v0, v1}, Lk/e1/a;->a(Lk/o;)Lk/e1/h/d;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk/e1/h/h;->c()Lk/e1/h/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lk/e1/h/c;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/e1/h/h;->a:Lk/a;

    invoke-virtual {v0}, Lk/a;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method