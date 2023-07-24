.class public final Lk/e1/h/c;
.super Lk/e1/k/r;
.source "SourceFile"

# interfaces
.implements Lk/m;


# instance fields
.field public final b:Lk/o;

.field public final c:Lk/c1;

.field public d:Ljava/net/Socket;

.field public e:Ljava/net/Socket;

.field public f:Lk/b0;

.field public g:Lk/p0;

.field public h:Lk/e1/k/x;

.field public i:Ll/h;

.field public j:Ll/g;

.field public k:Z

.field public l:I

.field public m:I

.field public final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Lk/e1/h/h;",
            ">;>;"
        }
    .end annotation
.end field

.field public o:J


# direct methods
.method public constructor <init>(Lk/o;Lk/c1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lk/e1/k/r;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lk/e1/h/c;->m:I

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/e1/h/c;->n:Ljava/util/List;

    const-wide v0, 0x7fffffffffffffffL

    .line 4
    iput-wide v0, p0, Lk/e1/h/c;->o:J

    .line 5
    iput-object p1, p0, Lk/e1/h/c;->b:Lk/o;

    .line 6
    iput-object p2, p0, Lk/e1/h/c;->c:Lk/c1;

    return-void
.end method


# virtual methods
.method public a(Lk/o0;Lk/g0;Lk/e1/h/h;)Lk/e1/i/d;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketException;
        }
    .end annotation

    .line 155
    iget-object v0, p0, Lk/e1/h/c;->h:Lk/e1/k/x;

    if-eqz v0, :cond_0

    .line 156
    new-instance v0, Lk/e1/k/i;

    iget-object v1, p0, Lk/e1/h/c;->h:Lk/e1/k/x;

    invoke-direct {v0, p1, p2, p3, v1}, Lk/e1/k/i;-><init>(Lk/o0;Lk/g0;Lk/e1/h/h;Lk/e1/k/x;)V

    return-object v0

    .line 157
    :cond_0
    iget-object v0, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-interface {p2}, Lk/g0;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 158
    iget-object v0, p0, Lk/e1/h/c;->i:Ll/h;

    invoke-interface {v0}, Ll/y;->a()Ll/a0;

    move-result-object v0

    invoke-interface {p2}, Lk/g0;->d()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ll/a0;->a(JLjava/util/concurrent/TimeUnit;)Ll/a0;

    .line 159
    iget-object v0, p0, Lk/e1/h/c;->j:Ll/g;

    invoke-interface {v0}, Ll/x;->a()Ll/a0;

    move-result-object v0

    invoke-interface {p2}, Lk/g0;->a()I

    move-result p2

    int-to-long v1, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p2}, Ll/a0;->a(JLjava/util/concurrent/TimeUnit;)Ll/a0;

    .line 160
    new-instance p2, Lk/e1/j/h;

    iget-object v0, p0, Lk/e1/h/c;->i:Ll/h;

    iget-object v1, p0, Lk/e1/h/c;->j:Ll/g;

    invoke-direct {p2, p1, p3, v0, v1}, Lk/e1/j/h;-><init>(Lk/o0;Lk/e1/h/h;Ll/h;Ll/g;)V

    return-object p2
.end method

.method public final a(IILk/u0;Lk/f0;)Lk/u0;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {p4, v1}, Lk/e1/e;->a(Lk/f0;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 120
    :goto_0
    new-instance v0, Lk/e1/j/h;

    iget-object v1, p0, Lk/e1/h/c;->i:Ll/h;

    iget-object v2, p0, Lk/e1/h/c;->j:Ll/g;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Lk/e1/j/h;-><init>(Lk/o0;Lk/e1/h/h;Ll/h;Ll/g;)V

    .line 121
    iget-object v1, p0, Lk/e1/h/c;->i:Ll/h;

    invoke-interface {v1}, Ll/y;->a()Ll/a0;

    move-result-object v1

    int-to-long v4, p1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v4, v5, v2}, Ll/a0;->a(JLjava/util/concurrent/TimeUnit;)Ll/a0;

    .line 122
    iget-object v1, p0, Lk/e1/h/c;->j:Ll/g;

    invoke-interface {v1}, Ll/x;->a()Ll/a0;

    move-result-object v1

    int-to-long v4, p2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v4, v5, v2}, Ll/a0;->a(JLjava/util/concurrent/TimeUnit;)Ll/a0;

    .line 123
    invoke-virtual {p3}, Lk/u0;->c()Lk/d0;

    move-result-object v1

    invoke-virtual {v0, v1, p4}, Lk/e1/j/h;->a(Lk/d0;Ljava/lang/String;)V

    .line 124
    invoke-virtual {v0}, Lk/e1/j/h;->a()V

    const/4 v1, 0x0

    .line 125
    invoke-virtual {v0, v1}, Lk/e1/j/h;->a(Z)Lk/y0;

    move-result-object v1

    .line 126
    invoke-virtual {v1, p3}, Lk/y0;->a(Lk/u0;)Lk/y0;

    .line 127
    invoke-virtual {v1}, Lk/y0;->a()Lk/z0;

    move-result-object p3

    .line 128
    invoke-static {p3}, Lk/e1/i/g;->a(Lk/z0;)J

    move-result-wide v1

    const-wide/16 v4, -0x1

    cmp-long v6, v1, v4

    if-nez v6, :cond_0

    const-wide/16 v1, 0x0

    .line 129
    :cond_0
    invoke-virtual {v0, v1, v2}, Lk/e1/j/h;->b(J)Ll/y;

    move-result-object v0

    const v1, 0x7fffffff

    .line 130
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, v2}, Lk/e1/e;->b(Ll/y;ILjava/util/concurrent/TimeUnit;)Z

    .line 131
    invoke-interface {v0}, Ll/y;->close()V

    .line 132
    invoke-virtual {p3}, Lk/z0;->m()I

    move-result v0

    const/16 v1, 0xc8

    if-eq v0, v1, :cond_4

    const/16 v1, 0x197

    if-ne v0, v1, :cond_3

    .line 133
    iget-object v0, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->a()Lk/a;

    move-result-object v0

    invoke-virtual {v0}, Lk/a;->g()Lk/c;

    move-result-object v0

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-interface {v0, v1, p3}, Lk/c;->a(Lk/c1;Lk/z0;)Lk/u0;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "Connection"

    .line 134
    invoke-virtual {p3, v1}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v1, "close"

    invoke-virtual {v1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    return-object v0

    :cond_1
    move-object p3, v0

    goto/16 :goto_0

    .line 135
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 136
    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unexpected response code for CONNECT: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    invoke-virtual {p3}, Lk/z0;->m()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 138
    :cond_4
    iget-object p1, p0, Lk/e1/h/c;->i:Ll/h;

    invoke-interface {p1}, Ll/h;->b()Ll/f;

    move-result-object p1

    invoke-virtual {p1}, Ll/f;->i()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lk/e1/h/c;->j:Ll/g;

    invoke-interface {p1}, Ll/g;->b()Ll/f;

    move-result-object p1

    invoke-virtual {p1}, Ll/f;->i()Z

    move-result p1

    if-eqz p1, :cond_5

    return-object v3

    .line 139
    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()V
    .locals 1

    .line 161
    iget-object v0, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    invoke-static {v0}, Lk/e1/e;->a(Ljava/net/Socket;)V

    return-void
.end method

.method public final a(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 78
    new-instance v0, Lk/e1/k/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lk/e1/k/p;-><init>(Z)V

    iget-object v1, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    iget-object v2, p0, Lk/e1/h/c;->c:Lk/c1;

    .line 79
    invoke-virtual {v2}, Lk/c1;->a()Lk/a;

    move-result-object v2

    invoke-virtual {v2}, Lk/a;->k()Lk/f0;

    move-result-object v2

    invoke-virtual {v2}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lk/e1/h/c;->i:Ll/h;

    iget-object v4, p0, Lk/e1/h/c;->j:Ll/g;

    invoke-virtual {v0, v1, v2, v3, v4}, Lk/e1/k/p;->a(Ljava/net/Socket;Ljava/lang/String;Ll/h;Ll/g;)Lk/e1/k/p;

    .line 80
    invoke-virtual {v0, p0}, Lk/e1/k/p;->a(Lk/e1/k/r;)Lk/e1/k/p;

    .line 81
    invoke-virtual {v0, p1}, Lk/e1/k/p;->a(I)Lk/e1/k/p;

    .line 82
    invoke-virtual {v0}, Lk/e1/k/p;->a()Lk/e1/k/x;

    move-result-object p1

    iput-object p1, p0, Lk/e1/h/c;->h:Lk/e1/k/x;

    .line 83
    invoke-virtual {p1}, Lk/e1/k/x;->n()V

    return-void
.end method

.method public a(IIIIZLk/g;Lk/a0;)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 1
    iget-object v0, v7, Lk/e1/h/c;->g:Lk/p0;

    if-nez v0, :cond_b

    .line 2
    iget-object v0, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->a()Lk/a;

    move-result-object v0

    invoke-virtual {v0}, Lk/a;->b()Ljava/util/List;

    move-result-object v0

    .line 3
    new-instance v10, Lk/e1/h/b;

    invoke-direct {v10, v0}, Lk/e1/h/b;-><init>(Ljava/util/List;)V

    .line 4
    iget-object v1, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    invoke-virtual {v1}, Lk/a;->j()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_2

    .line 5
    sget-object v1, Lk/q;->h:Lk/q;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->a()Lk/a;

    move-result-object v0

    invoke-virtual {v0}, Lk/a;->k()Lk/f0;

    move-result-object v0

    invoke-virtual {v0}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lk/e1/l/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Lokhttp3/internal/connection/RouteException;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CLEARTEXT communication to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not permitted by network security policy"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 9
    :cond_1
    new-instance v0, Lokhttp3/internal/connection/RouteException;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 10
    :cond_2
    iget-object v0, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->a()Lk/a;

    move-result-object v0

    invoke-virtual {v0}, Lk/a;->e()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lk/p0;->g:Lk/p0;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :goto_0
    const/4 v11, 0x0

    move-object v12, v11

    .line 11
    :goto_1
    :try_start_0
    iget-object v0, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    .line 12
    invoke-virtual/range {v1 .. v6}, Lk/e1/h/c;->a(IIILk/g;Lk/a0;)V

    .line 13
    iget-object v0, v7, Lk/e1/h/c;->d:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move/from16 v13, p1

    move/from16 v14, p2

    goto :goto_2

    :cond_4
    move/from16 v13, p1

    move/from16 v14, p2

    .line 14
    :try_start_1
    invoke-virtual {v7, v13, v14, v8, v9}, Lk/e1/h/c;->a(IILk/g;Lk/a0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_2
    move/from16 v15, p4

    .line 15
    :try_start_2
    invoke-virtual {v7, v10, v15, v8, v9}, Lk/e1/h/c;->a(Lk/e1/h/b;ILk/g;Lk/a0;)V

    .line 16
    iget-object v0, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->b()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, v7, Lk/e1/h/c;->g:Lk/p0;

    invoke-virtual {v9, v8, v0, v1, v2}, Lk/a0;->a(Lk/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lk/p0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 17
    :goto_3
    iget-object v0, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v7, Lk/e1/h/c;->d:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_4

    .line 18
    :cond_5
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Too many tunnel connections attempted: 21"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 19
    new-instance v1, Lokhttp3/internal/connection/RouteException;

    invoke-direct {v1, v0}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    throw v1

    .line 20
    :cond_6
    :goto_4
    iget-object v0, v7, Lk/e1/h/c;->h:Lk/e1/k/x;

    if-eqz v0, :cond_7

    .line 21
    iget-object v1, v7, Lk/e1/h/c;->b:Lk/o;

    monitor-enter v1

    .line 22
    :try_start_3
    iget-object v0, v7, Lk/e1/h/c;->h:Lk/e1/k/x;

    invoke-virtual {v0}, Lk/e1/k/x;->m()I

    move-result v0

    iput v0, v7, Lk/e1/h/c;->m:I

    .line 23
    monitor-exit v1

    goto :goto_5

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_7
    :goto_5
    return-void

    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    move/from16 v13, p1

    move/from16 v14, p2

    :goto_6
    move/from16 v15, p4

    .line 24
    :goto_7
    iget-object v1, v7, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-static {v1}, Lk/e1/e;->a(Ljava/net/Socket;)V

    .line 25
    iget-object v1, v7, Lk/e1/h/c;->d:Ljava/net/Socket;

    invoke-static {v1}, Lk/e1/e;->a(Ljava/net/Socket;)V

    .line 26
    iput-object v11, v7, Lk/e1/h/c;->e:Ljava/net/Socket;

    .line 27
    iput-object v11, v7, Lk/e1/h/c;->d:Ljava/net/Socket;

    .line 28
    iput-object v11, v7, Lk/e1/h/c;->i:Ll/h;

    .line 29
    iput-object v11, v7, Lk/e1/h/c;->j:Ll/g;

    .line 30
    iput-object v11, v7, Lk/e1/h/c;->f:Lk/b0;

    .line 31
    iput-object v11, v7, Lk/e1/h/c;->g:Lk/p0;

    .line 32
    iput-object v11, v7, Lk/e1/h/c;->h:Lk/e1/k/x;

    .line 33
    iget-object v1, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v1, v7, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v1, p7

    move-object/from16 v2, p6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Lk/a0;->a(Lk/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lk/p0;Ljava/io/IOException;)V

    if-nez v12, :cond_8

    .line 34
    new-instance v12, Lokhttp3/internal/connection/RouteException;

    invoke-direct {v12, v0}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    goto :goto_8

    .line 35
    :cond_8
    invoke-virtual {v12, v0}, Lokhttp3/internal/connection/RouteException;->a(Ljava/io/IOException;)V

    :goto_8
    if-eqz p5, :cond_9

    .line 36
    invoke-virtual {v10, v0}, Lk/e1/h/b;->a(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto/16 :goto_1

    .line 37
    :cond_9
    throw v12

    .line 38
    :cond_a
    new-instance v0, Lokhttp3/internal/connection/RouteException;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lokhttp3/internal/connection/RouteException;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 39
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(IIILk/g;Lk/a0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 40
    invoke-virtual {p0}, Lk/e1/h/c;->b()Lk/u0;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lk/u0;->g()Lk/f0;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x15

    if-ge v2, v3, :cond_1

    .line 42
    invoke-virtual {p0, p1, p2, p4, p5}, Lk/e1/h/c;->a(IILk/g;Lk/a0;)V

    .line 43
    invoke-virtual {p0, p2, p3, v0, v1}, Lk/e1/h/c;->a(IILk/u0;Lk/f0;)Lk/u0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 44
    :cond_0
    iget-object v3, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    invoke-static {v3}, Lk/e1/e;->a(Ljava/net/Socket;)V

    const/4 v3, 0x0

    .line 45
    iput-object v3, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    .line 46
    iput-object v3, p0, Lk/e1/h/c;->j:Ll/g;

    .line 47
    iput-object v3, p0, Lk/e1/h/c;->i:Ll/h;

    .line 48
    iget-object v4, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v4}, Lk/c1;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v5}, Lk/c1;->b()Ljava/net/Proxy;

    move-result-object v5

    invoke-virtual {p5, p4, v4, v5, v3}, Lk/a0;->a(Lk/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lk/p0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final a(IILk/g;Lk/a0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->b()Ljava/net/Proxy;

    move-result-object v0

    .line 50
    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    .line 51
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 52
    :cond_0
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lk/a;->i()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    .line 54
    :goto_1
    iput-object v1, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    .line 55
    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {p4, p3, v1, v0}, Lk/a0;->a(Lk/g;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 56
    iget-object p3, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    invoke-virtual {p3, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 57
    :try_start_0
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object p2

    iget-object p3, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    iget-object p4, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {p4}, Lk/c1;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p2, p3, p4, p1}, Lk/e1/l/j;->a(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 58
    :try_start_1
    iget-object p1, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    invoke-static {p1}, Ll/r;->b(Ljava/net/Socket;)Ll/y;

    move-result-object p1

    invoke-static {p1}, Ll/r;->a(Ll/y;)Ll/h;

    move-result-object p1

    iput-object p1, p0, Lk/e1/h/c;->i:Ll/h;

    .line 59
    iget-object p1, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    invoke-static {p1}, Ll/r;->a(Ljava/net/Socket;)Ll/x;

    move-result-object p1

    invoke-static {p1}, Ll/r;->a(Ll/x;)Ll/g;

    move-result-object p1

    iput-object p1, p0, Lk/e1/h/c;->j:Ll/g;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 60
    invoke-virtual {p1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    .line 61
    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 62
    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed to connect to "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {p4}, Lk/c1;->d()Ljava/net/InetSocketAddress;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p2, p1}, Ljava/net/ConnectException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 64
    throw p2
.end method

.method public final a(Lk/e1/h/b;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->a()Lk/a;

    move-result-object v0

    .line 85
    invoke-virtual {v0}, Lk/a;->j()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    .line 86
    :try_start_0
    iget-object v3, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    .line 87
    invoke-virtual {v0}, Lk/a;->k()Lk/f0;

    move-result-object v4

    invoke-virtual {v4}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lk/a;->k()Lk/f0;

    move-result-object v5

    invoke-virtual {v5}, Lk/f0;->j()I

    move-result v5

    const/4 v6, 0x1

    .line 88
    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 89
    :try_start_1
    invoke-virtual {p1, v1}, Lk/e1/h/b;->a(Ljavax/net/ssl/SSLSocket;)Lk/q;

    move-result-object p1

    .line 90
    invoke-virtual {p1}, Lk/q;->c()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 91
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object v3

    .line 92
    invoke-virtual {v0}, Lk/a;->k()Lk/f0;

    move-result-object v4

    invoke-virtual {v4}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lk/a;->e()Ljava/util/List;

    move-result-object v5

    .line 93
    invoke-virtual {v3, v1, v4, v5}, Lk/e1/l/j;->a(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 94
    :cond_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 95
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    .line 96
    invoke-static {v3}, Lk/b0;->a(Ljavax/net/ssl/SSLSession;)Lk/b0;

    move-result-object v4

    .line 97
    invoke-virtual {v0}, Lk/a;->d()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-virtual {v0}, Lk/a;->k()Lk/f0;

    move-result-object v6

    invoke-virtual {v6}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 98
    invoke-virtual {v0}, Lk/a;->a()Lk/j;

    move-result-object v3

    invoke-virtual {v0}, Lk/a;->k()Lk/f0;

    move-result-object v0

    invoke-virtual {v0}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v0

    .line 99
    invoke-virtual {v4}, Lk/b0;->b()Ljava/util/List;

    move-result-object v5

    .line 100
    invoke-virtual {v3, v0, v5}, Lk/j;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 101
    invoke-virtual {p1}, Lk/q;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 102
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object p1

    invoke-virtual {p1, v1}, Lk/e1/l/j;->b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    .line 103
    :cond_1
    iput-object v1, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    .line 104
    invoke-static {v1}, Ll/r;->b(Ljava/net/Socket;)Ll/y;

    move-result-object p1

    invoke-static {p1}, Ll/r;->a(Ll/y;)Ll/h;

    move-result-object p1

    iput-object p1, p0, Lk/e1/h/c;->i:Ll/h;

    .line 105
    iget-object p1, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-static {p1}, Ll/r;->a(Ljava/net/Socket;)Ll/x;

    move-result-object p1

    invoke-static {p1}, Ll/r;->a(Ll/x;)Ll/g;

    move-result-object p1

    iput-object p1, p0, Lk/e1/h/c;->j:Ll/g;

    .line 106
    iput-object v4, p0, Lk/e1/h/c;->f:Lk/b0;

    if-eqz v2, :cond_2

    .line 107
    invoke-static {v2}, Lk/p0;->a(Ljava/lang/String;)Lk/p0;

    move-result-object p1

    goto :goto_0

    .line 108
    :cond_2
    sget-object p1, Lk/p0;->d:Lk/p0;

    :goto_0
    iput-object p1, p0, Lk/e1/h/c;->g:Lk/p0;
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_3

    .line 109
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object p1

    invoke-virtual {p1, v1}, Lk/e1/l/j;->a(Ljavax/net/ssl/SSLSocket;)V

    :cond_3
    return-void

    .line 110
    :cond_4
    :try_start_2
    invoke-virtual {v4}, Lk/b0;->b()Ljava/util/List;

    move-result-object p1

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    .line 111
    new-instance v2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Hostname "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lk/a;->k()Lk/f0;

    move-result-object v0

    invoke-virtual {v0}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n    certificate: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    invoke-static {p1}, Lk/j;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    DN: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n    subjectAltNames: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    invoke-static {p1}, Lk/e1/n/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    move-object v2, v1

    goto :goto_2

    :catch_0
    move-exception p1

    move-object v2, v1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 115
    :goto_1
    :try_start_3
    invoke-static {p1}, Lk/e1/e;->a(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 116
    :cond_5
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    if-eqz v2, :cond_6

    .line 117
    invoke-static {}, Lk/e1/l/j;->c()Lk/e1/l/j;

    move-result-object v0

    invoke-virtual {v0, v2}, Lk/e1/l/j;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 118
    :cond_6
    invoke-static {v2}, Lk/e1/e;->a(Ljava/net/Socket;)V

    throw p1
.end method

.method public final a(Lk/e1/h/b;ILk/g;Lk/a0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->a()Lk/a;

    move-result-object v0

    invoke-virtual {v0}, Lk/a;->j()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_1

    .line 66
    iget-object p1, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {p1}, Lk/c1;->a()Lk/a;

    move-result-object p1

    invoke-virtual {p1}, Lk/a;->e()Ljava/util/List;

    move-result-object p1

    sget-object p3, Lk/p0;->g:Lk/p0;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 67
    iget-object p1, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    iput-object p1, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    .line 68
    sget-object p1, Lk/p0;->g:Lk/p0;

    iput-object p1, p0, Lk/e1/h/c;->g:Lk/p0;

    .line 69
    invoke-virtual {p0, p2}, Lk/e1/h/c;->a(I)V

    return-void

    .line 70
    :cond_0
    iget-object p1, p0, Lk/e1/h/c;->d:Ljava/net/Socket;

    iput-object p1, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    .line 71
    sget-object p1, Lk/p0;->d:Lk/p0;

    iput-object p1, p0, Lk/e1/h/c;->g:Lk/p0;

    return-void

    .line 72
    :cond_1
    invoke-virtual {p4, p3}, Lk/a0;->g(Lk/g;)V

    .line 73
    invoke-virtual {p0, p1}, Lk/e1/h/c;->a(Lk/e1/h/b;)V

    .line 74
    iget-object p1, p0, Lk/e1/h/c;->f:Lk/b0;

    invoke-virtual {p4, p3, p1}, Lk/a0;->a(Lk/g;Lk/b0;)V

    .line 75
    iget-object p1, p0, Lk/e1/h/c;->g:Lk/p0;

    sget-object p3, Lk/p0;->f:Lk/p0;

    if-ne p1, p3, :cond_2

    .line 76
    invoke-virtual {p0, p2}, Lk/e1/h/c;->a(I)V

    :cond_2
    return-void
.end method

.method public a(Lk/e1/k/e0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 169
    sget-object v0, Lk/e1/k/a;->g:Lk/e1/k/a;

    invoke-virtual {p1, v0}, Lk/e1/k/e0;->a(Lk/e1/k/a;)V

    return-void
.end method

.method public a(Lk/e1/k/x;)V
    .locals 1

    .line 170
    iget-object v0, p0, Lk/e1/h/c;->b:Lk/o;

    monitor-enter v0

    .line 171
    :try_start_0
    invoke-virtual {p1}, Lk/e1/k/x;->m()I

    move-result p1

    iput p1, p0, Lk/e1/h/c;->m:I

    .line 172
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lk/a;Lk/c1;)Z
    .locals 4

    .line 140
    iget-object v0, p0, Lk/e1/h/c;->n:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lk/e1/h/c;->m:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_a

    iget-boolean v0, p0, Lk/e1/h/c;->k:Z

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 141
    :cond_0
    sget-object v0, Lk/e1/a;->a:Lk/e1/a;

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lk/e1/a;->a(Lk/a;Lk/a;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    .line 142
    :cond_1
    invoke-virtual {p1}, Lk/a;->k()Lk/f0;

    move-result-object v0

    invoke-virtual {v0}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lk/e1/h/c;->e()Lk/c1;

    move-result-object v1

    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    invoke-virtual {v1}, Lk/a;->k()Lk/f0;

    move-result-object v1

    invoke-virtual {v1}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    return v1

    .line 143
    :cond_2
    iget-object v0, p0, Lk/e1/h/c;->h:Lk/e1/k/x;

    if-nez v0, :cond_3

    return v2

    :cond_3
    if-nez p2, :cond_4

    return v2

    .line 144
    :cond_4
    invoke-virtual {p2}, Lk/c1;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_5

    return v2

    .line 145
    :cond_5
    iget-object v0, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v3, :cond_6

    return v2

    .line 146
    :cond_6
    iget-object v0, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v0}, Lk/c1;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-virtual {p2}, Lk/c1;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/net/InetSocketAddress;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    return v2

    .line 147
    :cond_7
    invoke-virtual {p2}, Lk/c1;->a()Lk/a;

    move-result-object p2

    invoke-virtual {p2}, Lk/a;->d()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, Lk/e1/n/d;->a:Lk/e1/n/d;

    if-eq p2, v0, :cond_8

    return v2

    .line 148
    :cond_8
    invoke-virtual {p1}, Lk/a;->k()Lk/f0;

    move-result-object p2

    invoke-virtual {p0, p2}, Lk/e1/h/c;->a(Lk/f0;)Z

    move-result p2

    if-nez p2, :cond_9

    return v2

    .line 149
    :cond_9
    :try_start_0
    invoke-virtual {p1}, Lk/a;->a()Lk/j;

    move-result-object p2

    invoke-virtual {p1}, Lk/a;->k()Lk/f0;

    move-result-object p1

    invoke-virtual {p1}, Lk/f0;->g()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lk/e1/h/c;->c()Lk/b0;

    move-result-object v0

    invoke-virtual {v0}, Lk/b0;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lk/j;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_a
    :goto_0
    return v2
.end method

.method public a(Lk/f0;)Z
    .locals 4

    .line 150
    invoke-virtual {p1}, Lk/f0;->j()I

    move-result v0

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    invoke-virtual {v1}, Lk/a;->k()Lk/f0;

    move-result-object v1

    invoke-virtual {v1}, Lk/f0;->j()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    .line 151
    :cond_0
    invoke-virtual {p1}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    invoke-virtual {v1}, Lk/a;->k()Lk/f0;

    move-result-object v1

    invoke-virtual {v1}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 152
    iget-object v0, p0, Lk/e1/h/c;->f:Lk/b0;

    if-eqz v0, :cond_1

    sget-object v0, Lk/e1/n/d;->a:Lk/e1/n/d;

    .line 153
    invoke-virtual {p1}, Lk/f0;->g()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lk/e1/h/c;->f:Lk/b0;

    invoke-virtual {v3}, Lk/b0;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/security/cert/X509Certificate;

    .line 154
    invoke-virtual {v0, p1, v3}, Lk/e1/n/d;->a(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v2, 0x1

    :cond_1
    return v2

    :cond_2
    return v1
.end method

.method public a(Z)Z
    .locals 4

    .line 162
    iget-object v0, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isClosed()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 163
    :cond_0
    iget-object v0, p0, Lk/e1/h/c;->h:Lk/e1/k/x;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 164
    invoke-virtual {v0}, Lk/e1/k/x;->l()Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_1
    if-eqz p1, :cond_3

    .line 165
    :try_start_0
    iget-object p1, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    :try_start_1
    iget-object v0, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 167
    iget-object v0, p0, Lk/e1/h/c;->i:Ll/h;

    invoke-interface {v0}, Ll/h;->i()Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    .line 168
    :try_start_2
    iget-object v0, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v1

    :cond_2
    iget-object v0, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-virtual {v0, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    return v2

    :catchall_0
    move-exception v0

    iget-object v3, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v0
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return v1

    :catch_1
    :cond_3
    return v2

    :cond_4
    :goto_0
    return v1
.end method

.method public final b()Lk/u0;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lk/t0;

    invoke-direct {v0}, Lk/t0;-><init>()V

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    .line 2
    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    invoke-virtual {v1}, Lk/a;->k()Lk/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk/t0;->a(Lk/f0;)Lk/t0;

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    .line 3
    invoke-virtual {v0, v1, v2}, Lk/t0;->a(Ljava/lang/String;Lk/x0;)Lk/t0;

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    .line 4
    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    invoke-virtual {v1}, Lk/a;->k()Lk/f0;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lk/e1/e;->a(Lk/f0;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    .line 5
    invoke-virtual {v0, v1, v2}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    .line 6
    invoke-static {}, Lk/e1/f;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "User-Agent"

    invoke-virtual {v0, v2, v1}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;

    .line 7
    invoke-virtual {v0}, Lk/t0;->a()Lk/u0;

    move-result-object v0

    .line 8
    new-instance v1, Lk/y0;

    invoke-direct {v1}, Lk/y0;-><init>()V

    .line 9
    invoke-virtual {v1, v0}, Lk/y0;->a(Lk/u0;)Lk/y0;

    sget-object v2, Lk/p0;->d:Lk/p0;

    .line 10
    invoke-virtual {v1, v2}, Lk/y0;->a(Lk/p0;)Lk/y0;

    const/16 v2, 0x197

    .line 11
    invoke-virtual {v1, v2}, Lk/y0;->a(I)Lk/y0;

    const-string v2, "Preemptive Authenticate"

    .line 12
    invoke-virtual {v1, v2}, Lk/y0;->a(Ljava/lang/String;)Lk/y0;

    sget-object v2, Lk/e1/e;->c:Lk/b1;

    .line 13
    invoke-virtual {v1, v2}, Lk/y0;->a(Lk/b1;)Lk/y0;

    const-wide/16 v2, -0x1

    .line 14
    invoke-virtual {v1, v2, v3}, Lk/y0;->b(J)Lk/y0;

    .line 15
    invoke-virtual {v1, v2, v3}, Lk/y0;->a(J)Lk/y0;

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    .line 16
    invoke-virtual {v1, v2, v3}, Lk/y0;->b(Ljava/lang/String;Ljava/lang/String;)Lk/y0;

    .line 17
    invoke-virtual {v1}, Lk/y0;->a()Lk/z0;

    move-result-object v1

    .line 18
    iget-object v2, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v2}, Lk/c1;->a()Lk/a;

    move-result-object v2

    invoke-virtual {v2}, Lk/a;->g()Lk/c;

    move-result-object v2

    iget-object v3, p0, Lk/e1/h/c;->c:Lk/c1;

    .line 19
    invoke-interface {v2, v3, v1}, Lk/c;->a(Lk/c1;Lk/z0;)Lk/u0;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v0, v1

    :cond_0
    return-object v0
.end method

.method public c()Lk/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/h/c;->f:Lk/b0;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/h/c;->h:Lk/e1/k/x;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Lk/c1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/h/c;->c:Lk/c1;

    return-object v0
.end method

.method public f()Ljava/net/Socket;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/h/c;->e:Ljava/net/Socket;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    .line 2
    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    invoke-virtual {v1}, Lk/a;->k()Lk/f0;

    move-result-object v1

    invoke-virtual {v1}, Lk/f0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    invoke-virtual {v1}, Lk/c1;->a()Lk/a;

    move-result-object v1

    invoke-virtual {v1}, Lk/a;->k()Lk/f0;

    move-result-object v1

    invoke-virtual {v1}, Lk/f0;->j()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    .line 3
    invoke-virtual {v1}, Lk/c1;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/e1/h/c;->c:Lk/c1;

    .line 4
    invoke-virtual {v1}, Lk/c1;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    iget-object v1, p0, Lk/e1/h/c;->f:Lk/b0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lk/b0;->a()Lk/l;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/e1/h/c;->g:Lk/p0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
