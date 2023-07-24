.class public final Lk/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final b:Lk/u0;

.field public final c:Lk/p0;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public final f:Lk/b0;

.field public final g:Lk/d0;

.field public final h:Lk/b1;

.field public final i:Lk/z0;

.field public final j:Lk/z0;

.field public final k:Lk/z0;

.field public final l:J

.field public final m:J

.field public volatile n:Lk/f;


# direct methods
.method public constructor <init>(Lk/y0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lk/y0;->a:Lk/u0;

    iput-object v0, p0, Lk/z0;->b:Lk/u0;

    .line 3
    iget-object v0, p1, Lk/y0;->b:Lk/p0;

    iput-object v0, p0, Lk/z0;->c:Lk/p0;

    .line 4
    iget v0, p1, Lk/y0;->c:I

    iput v0, p0, Lk/z0;->d:I

    .line 5
    iget-object v0, p1, Lk/y0;->d:Ljava/lang/String;

    iput-object v0, p0, Lk/z0;->e:Ljava/lang/String;

    .line 6
    iget-object v0, p1, Lk/y0;->e:Lk/b0;

    iput-object v0, p0, Lk/z0;->f:Lk/b0;

    .line 7
    iget-object v0, p1, Lk/y0;->f:Lk/c0;

    invoke-virtual {v0}, Lk/c0;->a()Lk/d0;

    move-result-object v0

    iput-object v0, p0, Lk/z0;->g:Lk/d0;

    .line 8
    iget-object v0, p1, Lk/y0;->g:Lk/b1;

    iput-object v0, p0, Lk/z0;->h:Lk/b1;

    .line 9
    iget-object v0, p1, Lk/y0;->h:Lk/z0;

    iput-object v0, p0, Lk/z0;->i:Lk/z0;

    .line 10
    iget-object v0, p1, Lk/y0;->i:Lk/z0;

    iput-object v0, p0, Lk/z0;->j:Lk/z0;

    .line 11
    iget-object v0, p1, Lk/y0;->j:Lk/z0;

    iput-object v0, p0, Lk/z0;->k:Lk/z0;

    .line 12
    iget-wide v0, p1, Lk/y0;->k:J

    iput-wide v0, p0, Lk/z0;->l:J

    .line 13
    iget-wide v0, p1, Lk/y0;->l:J

    iput-wide v0, p0, Lk/z0;->m:J

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/z0;->g:Lk/d0;

    invoke-virtual {v0, p1}, Lk/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object p2, p1

    :cond_0
    return-object p2
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lk/z0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c()Lk/b1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/z0;->h:Lk/b1;

    return-object v0
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk/z0;->h:Lk/b1;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lk/b1;->close()V

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l()Lk/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/z0;->n:Lk/f;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lk/z0;->g:Lk/d0;

    invoke-static {v0}, Lk/f;->a(Lk/d0;)Lk/f;

    move-result-object v0

    iput-object v0, p0, Lk/z0;->n:Lk/f;

    :goto_0
    return-object v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget v0, p0, Lk/z0;->d:I

    return v0
.end method

.method public n()Lk/b0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/z0;->f:Lk/b0;

    return-object v0
.end method

.method public o()Lk/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/z0;->g:Lk/d0;

    return-object v0
.end method

.method public p()Lk/y0;
    .locals 1

    .line 1
    new-instance v0, Lk/y0;

    invoke-direct {v0, p0}, Lk/y0;-><init>(Lk/z0;)V

    return-object v0
.end method

.method public q()Lk/z0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/z0;->k:Lk/z0;

    return-object v0
.end method

.method public r()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lk/z0;->m:J

    return-wide v0
.end method

.method public s()Lk/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/z0;->b:Lk/u0;

    return-object v0
.end method

.method public t()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lk/z0;->l:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/z0;->c:Lk/p0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lk/z0;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/z0;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lk/z0;->b:Lk/u0;

    .line 2
    invoke-virtual {v1}, Lk/u0;->g()Lk/f0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
