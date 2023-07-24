.class public Ll/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/x;


# instance fields
.field public final synthetic b:Ll/x;

.field public final synthetic c:Ll/d;


# direct methods
.method public constructor <init>(Ll/d;Ll/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll/a;->c:Ll/d;

    iput-object p2, p0, Ll/a;->b:Ll/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ll/a0;
    .locals 1

    .line 10
    iget-object v0, p0, Ll/a;->c:Ll/d;

    return-object v0
.end method

.method public a(Ll/f;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p1, Ll/f;->c:J

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Ll/b0;->a(JJJ)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_2

    .line 2
    iget-object v2, p1, Ll/f;->b:Ll/u;

    :goto_1
    const-wide/32 v3, 0x10000

    cmp-long v5, v0, v3

    if-gez v5, :cond_1

    .line 3
    iget v3, v2, Ll/u;->c:I

    iget v4, v2, Ll/u;->b:I

    sub-int/2addr v3, v4

    int-to-long v3, v3

    add-long/2addr v0, v3

    cmp-long v3, v0, p2

    if-ltz v3, :cond_0

    move-wide v0, p2

    goto :goto_2

    .line 4
    :cond_0
    iget-object v2, v2, Ll/u;->f:Ll/u;

    goto :goto_1

    :cond_1
    :goto_2
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Ll/a;->c:Ll/d;

    invoke-virtual {v3}, Ll/d;->g()V

    .line 6
    :try_start_0
    iget-object v3, p0, Ll/a;->b:Ll/x;

    invoke-interface {v3, p1, v0, v1}, Ll/x;->a(Ll/f;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr p2, v0

    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Ll/a;->c:Ll/d;

    invoke-virtual {v1, v0}, Ll/d;->a(Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 8
    :try_start_1
    iget-object p2, p0, Ll/a;->c:Ll/d;

    invoke-virtual {p2, p1}, Ll/d;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :goto_3
    iget-object p2, p0, Ll/a;->c:Ll/d;

    invoke-virtual {p2, v2}, Ll/d;->a(Z)V

    throw p1

    :cond_2
    return-void
.end method

.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ll/a;->c:Ll/d;

    invoke-virtual {v0}, Ll/d;->g()V

    .line 2
    :try_start_0
    iget-object v0, p0, Ll/a;->b:Ll/x;

    invoke-interface {v0}, Ll/x;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    .line 3
    iget-object v1, p0, Ll/a;->c:Ll/d;

    invoke-virtual {v1, v0}, Ll/d;->a(Z)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    :try_start_1
    iget-object v1, p0, Ll/a;->c:Ll/d;

    invoke-virtual {v1, v0}, Ll/d;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    :goto_0
    iget-object v1, p0, Ll/a;->c:Ll/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/d;->a(Z)V

    throw v0
.end method

.method public flush()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ll/a;->c:Ll/d;

    invoke-virtual {v0}, Ll/d;->g()V

    .line 2
    :try_start_0
    iget-object v0, p0, Ll/a;->b:Ll/x;

    invoke-interface {v0}, Ll/x;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    .line 3
    iget-object v1, p0, Ll/a;->c:Ll/d;

    invoke-virtual {v1, v0}, Ll/d;->a(Z)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    :try_start_1
    iget-object v1, p0, Ll/a;->c:Ll/d;

    invoke-virtual {v1, v0}, Ll/d;->a(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    :goto_0
    iget-object v1, p0, Ll/a;->c:Ll/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/d;->a(Z)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AsyncTimeout.sink("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/a;->b:Ll/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
