.class public final Lk/e1/j/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll/x;


# instance fields
.field public final b:Ll/l;

.field public c:Z

.field public d:J

.field public final synthetic e:Lk/e1/j/h;


# direct methods
.method public constructor <init>(Lk/e1/j/h;J)V
    .locals 1

    .line 1
    iput-object p1, p0, Lk/e1/j/e;->e:Lk/e1/j/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ll/l;

    iget-object v0, p0, Lk/e1/j/e;->e:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->d:Ll/g;

    invoke-interface {v0}, Ll/x;->a()Ll/a0;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/l;-><init>(Ll/a0;)V

    iput-object p1, p0, Lk/e1/j/e;->b:Ll/l;

    .line 3
    iput-wide p2, p0, Lk/e1/j/e;->d:J

    return-void
.end method


# virtual methods
.method public a()Ll/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/e1/j/e;->b:Ll/l;

    return-object v0
.end method

.method public a(Ll/f;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget-boolean v0, p0, Lk/e1/j/e;->c:Z

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p1}, Ll/f;->q()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lk/e1/e;->a(JJJ)V

    .line 4
    iget-wide v0, p0, Lk/e1/j/e;->d:J

    cmp-long v2, p2, v0

    if-gtz v2, :cond_0

    .line 5
    iget-object v0, p0, Lk/e1/j/e;->e:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->d:Ll/g;

    invoke-interface {v0, p1, p2, p3}, Ll/x;->a(Ll/f;J)V

    .line 6
    iget-wide v0, p0, Lk/e1/j/e;->d:J

    sub-long/2addr v0, p2

    iput-wide v0, p0, Lk/e1/j/e;->d:J

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "expected "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lk/e1/j/e;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " bytes but received "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lk/e1/j/e;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lk/e1/j/e;->c:Z

    .line 3
    iget-wide v0, p0, Lk/e1/j/e;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    .line 4
    iget-object v0, p0, Lk/e1/j/e;->e:Lk/e1/j/h;

    iget-object v1, p0, Lk/e1/j/e;->b:Ll/l;

    invoke-virtual {v0, v1}, Lk/e1/j/h;->a(Ll/l;)V

    .line 5
    iget-object v0, p0, Lk/e1/j/e;->e:Lk/e1/j/h;

    const/4 v1, 0x3

    iput v1, v0, Lk/e1/j/h;->e:I

    return-void

    .line 6
    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lk/e1/j/e;->c:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lk/e1/j/e;->e:Lk/e1/j/h;

    iget-object v0, v0, Lk/e1/j/h;->d:Ll/g;

    invoke-interface {v0}, Ll/g;->flush()V

    return-void
.end method
