.class public Lk/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lk/u0;

.field public b:Lk/p0;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lk/b0;

.field public f:Lk/c0;

.field public g:Lk/b1;

.field public h:Lk/z0;

.field public i:Lk/z0;

.field public j:Lk/z0;

.field public k:J

.field public l:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lk/y0;->c:I

    .line 3
    new-instance v0, Lk/c0;

    invoke-direct {v0}, Lk/c0;-><init>()V

    iput-object v0, p0, Lk/y0;->f:Lk/c0;

    return-void
.end method

.method public constructor <init>(Lk/z0;)V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lk/y0;->c:I

    .line 6
    iget-object v0, p1, Lk/z0;->b:Lk/u0;

    iput-object v0, p0, Lk/y0;->a:Lk/u0;

    .line 7
    iget-object v0, p1, Lk/z0;->c:Lk/p0;

    iput-object v0, p0, Lk/y0;->b:Lk/p0;

    .line 8
    iget v0, p1, Lk/z0;->d:I

    iput v0, p0, Lk/y0;->c:I

    .line 9
    iget-object v0, p1, Lk/z0;->e:Ljava/lang/String;

    iput-object v0, p0, Lk/y0;->d:Ljava/lang/String;

    .line 10
    iget-object v0, p1, Lk/z0;->f:Lk/b0;

    iput-object v0, p0, Lk/y0;->e:Lk/b0;

    .line 11
    iget-object v0, p1, Lk/z0;->g:Lk/d0;

    invoke-virtual {v0}, Lk/d0;->a()Lk/c0;

    move-result-object v0

    iput-object v0, p0, Lk/y0;->f:Lk/c0;

    .line 12
    iget-object v0, p1, Lk/z0;->h:Lk/b1;

    iput-object v0, p0, Lk/y0;->g:Lk/b1;

    .line 13
    iget-object v0, p1, Lk/z0;->i:Lk/z0;

    iput-object v0, p0, Lk/y0;->h:Lk/z0;

    .line 14
    iget-object v0, p1, Lk/z0;->j:Lk/z0;

    iput-object v0, p0, Lk/y0;->i:Lk/z0;

    .line 15
    iget-object v0, p1, Lk/z0;->k:Lk/z0;

    iput-object v0, p0, Lk/y0;->j:Lk/z0;

    .line 16
    iget-wide v0, p1, Lk/z0;->l:J

    iput-wide v0, p0, Lk/y0;->k:J

    .line 17
    iget-wide v0, p1, Lk/z0;->m:J

    iput-wide v0, p0, Lk/y0;->l:J

    return-void
.end method


# virtual methods
.method public a(I)Lk/y0;
    .locals 0

    .line 3
    iput p1, p0, Lk/y0;->c:I

    return-object p0
.end method

.method public a(J)Lk/y0;
    .locals 0

    .line 19
    iput-wide p1, p0, Lk/y0;->l:J

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lk/y0;
    .locals 0

    .line 4
    iput-object p1, p0, Lk/y0;->d:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lk/y0;
    .locals 1

    .line 6
    iget-object v0, p0, Lk/y0;->f:Lk/c0;

    invoke-virtual {v0, p1, p2}, Lk/c0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/c0;

    return-object p0
.end method

.method public a(Lk/b0;)Lk/y0;
    .locals 0

    .line 5
    iput-object p1, p0, Lk/y0;->e:Lk/b0;

    return-object p0
.end method

.method public a(Lk/b1;)Lk/y0;
    .locals 0

    .line 8
    iput-object p1, p0, Lk/y0;->g:Lk/b1;

    return-object p0
.end method

.method public a(Lk/d0;)Lk/y0;
    .locals 0

    .line 7
    invoke-virtual {p1}, Lk/d0;->a()Lk/c0;

    move-result-object p1

    iput-object p1, p0, Lk/y0;->f:Lk/c0;

    return-object p0
.end method

.method public a(Lk/p0;)Lk/y0;
    .locals 0

    .line 2
    iput-object p1, p0, Lk/y0;->b:Lk/p0;

    return-object p0
.end method

.method public a(Lk/u0;)Lk/y0;
    .locals 0

    .line 1
    iput-object p1, p0, Lk/y0;->a:Lk/u0;

    return-object p0
.end method

.method public a(Lk/z0;)Lk/y0;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "cacheResponse"

    .line 9
    invoke-virtual {p0, v0, p1}, Lk/y0;->a(Ljava/lang/String;Lk/z0;)V

    .line 10
    :cond_0
    iput-object p1, p0, Lk/y0;->i:Lk/z0;

    return-object p0
.end method

.method public a()Lk/z0;
    .locals 3

    .line 20
    iget-object v0, p0, Lk/y0;->a:Lk/u0;

    if-eqz v0, :cond_3

    .line 21
    iget-object v0, p0, Lk/y0;->b:Lk/p0;

    if-eqz v0, :cond_2

    .line 22
    iget v0, p0, Lk/y0;->c:I

    if-ltz v0, :cond_1

    .line 23
    iget-object v0, p0, Lk/y0;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 24
    new-instance v0, Lk/z0;

    invoke-direct {v0, p0}, Lk/z0;-><init>(Lk/y0;)V

    return-object v0

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "message == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 26
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "code < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lk/y0;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "protocol == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 28
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "request == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(Ljava/lang/String;Lk/z0;)V
    .locals 1

    .line 11
    iget-object v0, p2, Lk/z0;->h:Lk/b1;

    if-nez v0, :cond_3

    .line 12
    iget-object v0, p2, Lk/z0;->i:Lk/z0;

    if-nez v0, :cond_2

    .line 13
    iget-object v0, p2, Lk/z0;->j:Lk/z0;

    if-nez v0, :cond_1

    .line 14
    iget-object p2, p2, Lk/z0;->k:Lk/z0;

    if-nez p2, :cond_0

    return-void

    .line 15
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".priorResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 16
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".cacheResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 17
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".networkResponse != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 18
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".body != null"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public b(J)Lk/y0;
    .locals 0

    .line 4
    iput-wide p1, p0, Lk/y0;->k:J

    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lk/y0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/y0;->f:Lk/c0;

    invoke-virtual {v0, p1, p2}, Lk/c0;->c(Ljava/lang/String;Ljava/lang/String;)Lk/c0;

    return-object p0
.end method

.method public final b(Lk/z0;)V
    .locals 1

    .line 2
    iget-object p1, p1, Lk/z0;->h:Lk/b1;

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "priorResponse.body != null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Lk/z0;)Lk/y0;
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "networkResponse"

    .line 1
    invoke-virtual {p0, v0, p1}, Lk/y0;->a(Ljava/lang/String;Lk/z0;)V

    .line 2
    :cond_0
    iput-object p1, p0, Lk/y0;->h:Lk/z0;

    return-object p0
.end method

.method public d(Lk/z0;)Lk/y0;
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0, p1}, Lk/y0;->b(Lk/z0;)V

    .line 2
    :cond_0
    iput-object p1, p0, Lk/y0;->j:Lk/z0;

    return-object p0
.end method
