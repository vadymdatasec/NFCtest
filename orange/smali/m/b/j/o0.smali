.class public abstract Lm/b/j/o0;
.super Lm/b/j/q0;
.source "SourceFile"


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/StringBuilder;

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Lm/b/i/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lm/b/j/q0;-><init>(Lm/b/j/h0;)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lm/b/j/o0;->g:Z

    .line 4
    iput-boolean v0, p0, Lm/b/j/o0;->h:Z

    .line 5
    iput-boolean v0, p0, Lm/b/j/o0;->i:Z

    return-void
.end method


# virtual methods
.method public final a(C)V
    .locals 0

    .line 2
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/j/o0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/o0;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lm/b/j/o0;->d:Ljava/lang/String;

    return-void
.end method

.method public final a([I)V
    .locals 4

    .line 3
    invoke-virtual {p0}, Lm/b/j/o0;->n()V

    .line 4
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 5
    iget-object v3, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(C)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lm/b/j/o0;->n()V

    .line 6
    iget-object v0, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/j/o0;->n()V

    .line 2
    iget-object v0, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iput-object p1, p0, Lm/b/j/o0;->f:Ljava/lang/String;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method

.method public final c(C)V
    .locals 0

    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/b/j/o0;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/o0;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lm/b/j/o0;->b:Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/b/j/o0;->c:Ljava/lang/String;

    return-void
.end method

.method public final d(Ljava/lang/String;)Lm/b/j/o0;
    .locals 0

    .line 1
    iput-object p1, p0, Lm/b/j/o0;->b:Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/b/j/o0;->c:Ljava/lang/String;

    return-object p0
.end method

.method public l()Lm/b/j/o0;
    .locals 2

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lm/b/j/o0;->b:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lm/b/j/o0;->c:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lm/b/j/o0;->d:Ljava/lang/String;

    .line 5
    iget-object v1, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    invoke-static {v1}, Lm/b/j/q0;->a(Ljava/lang/StringBuilder;)V

    .line 6
    iput-object v0, p0, Lm/b/j/o0;->f:Ljava/lang/String;

    const/4 v1, 0x0

    .line 7
    iput-boolean v1, p0, Lm/b/j/o0;->g:Z

    .line 8
    iput-boolean v1, p0, Lm/b/j/o0;->h:Z

    .line 9
    iput-boolean v1, p0, Lm/b/j/o0;->i:Z

    .line 10
    iput-object v0, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    return-object p0
.end method

.method public bridge synthetic l()Lm/b/j/q0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/j/o0;->l()Lm/b/j/o0;

    move-result-object v0

    return-object v0
.end method

.method public final n()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lm/b/j/o0;->h:Z

    .line 2
    iget-object v0, p0, Lm/b/j/o0;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lm/b/j/o0;->f:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/o0;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lm/b/j/o0;->s()V

    :cond_0
    return-void
.end method

.method public final p()Lm/b/i/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    return-object v0
.end method

.method public final q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm/b/j/o0;->i:Z

    return v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/o0;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lm/b/h/j;->a(Z)V

    .line 2
    iget-object v0, p0, Lm/b/j/o0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final s()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm/b/i/b;

    invoke-direct {v0}, Lm/b/i/b;-><init>()V

    iput-object v0, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    .line 3
    :cond_0
    iget-object v0, p0, Lm/b/j/o0;->d:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 4
    iget-boolean v0, p0, Lm/b/j/o0;->h:Z

    if-eqz v0, :cond_2

    .line 5
    new-instance v0, Lm/b/i/a;

    iget-object v1, p0, Lm/b/j/o0;->d:Ljava/lang/String;

    iget-object v2, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    .line 6
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_1

    iget-object v2, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lm/b/j/o0;->f:Ljava/lang/String;

    :goto_0
    invoke-direct {v0, v1, v2}, Lm/b/i/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 7
    :cond_2
    iget-boolean v0, p0, Lm/b/j/o0;->g:Z

    if-eqz v0, :cond_3

    .line 8
    new-instance v0, Lm/b/i/a;

    iget-object v1, p0, Lm/b/j/o0;->d:Ljava/lang/String;

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lm/b/i/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 9
    :cond_3
    new-instance v0, Lm/b/i/c;

    iget-object v1, p0, Lm/b/j/o0;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Lm/b/i/c;-><init>(Ljava/lang/String;)V

    .line 10
    :goto_1
    iget-object v1, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    invoke-virtual {v1, v0}, Lm/b/i/b;->a(Lm/b/i/a;)V

    :cond_4
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lm/b/j/o0;->d:Ljava/lang/String;

    const/4 v1, 0x0

    .line 12
    iput-boolean v1, p0, Lm/b/j/o0;->g:Z

    .line 13
    iput-boolean v1, p0, Lm/b/j/o0;->h:Z

    .line 14
    iget-object v1, p0, Lm/b/j/o0;->e:Ljava/lang/StringBuilder;

    invoke-static {v1}, Lm/b/j/q0;->a(Ljava/lang/StringBuilder;)V

    .line 15
    iput-object v0, p0, Lm/b/j/o0;->f:Ljava/lang/String;

    return-void
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/b/j/o0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final u()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lm/b/j/o0;->g:Z

    return-void
.end method
