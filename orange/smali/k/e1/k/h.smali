.class public Lk/e1/k/h;
.super Ll/k;
.source "SourceFile"


# instance fields
.field public c:Z

.field public d:J

.field public final synthetic e:Lk/e1/k/i;


# direct methods
.method public constructor <init>(Lk/e1/k/i;Ll/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk/e1/k/h;->e:Lk/e1/k/i;

    .line 2
    invoke-direct {p0, p2}, Ll/k;-><init>(Ll/y;)V

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lk/e1/k/h;->c:Z

    const-wide/16 p1, 0x0

    .line 4
    iput-wide p1, p0, Lk/e1/k/h;->d:J

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/IOException;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lk/e1/k/h;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lk/e1/k/h;->c:Z

    .line 3
    iget-object v3, p0, Lk/e1/k/h;->e:Lk/e1/k/i;

    iget-object v1, v3, Lk/e1/k/i;->b:Lk/e1/h/h;

    const/4 v2, 0x0

    iget-wide v4, p0, Lk/e1/k/h;->d:J

    move-object v6, p1

    invoke-virtual/range {v1 .. v6}, Lk/e1/h/h;->a(ZLk/e1/i/d;JLjava/io/IOException;)V

    return-void
.end method

.method public b(Ll/f;J)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ll/k;->c()Ll/y;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Ll/y;->b(Ll/f;J)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-lez p3, :cond_0

    .line 2
    iget-wide v0, p0, Lk/e1/k/h;->d:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lk/e1/k/h;->d:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-wide p1

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p0, p1}, Lk/e1/k/h;->a(Ljava/io/IOException;)V

    .line 4
    throw p1
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Ll/k;->close()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lk/e1/k/h;->a(Ljava/io/IOException;)V

    return-void
.end method
