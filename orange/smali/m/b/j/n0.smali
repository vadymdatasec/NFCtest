.class public final Lm/b/j/n0;
.super Lm/b/j/o0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lm/b/j/o0;-><init>()V

    .line 2
    new-instance v0, Lm/b/i/b;

    invoke-direct {v0}, Lm/b/i/b;-><init>()V

    iput-object v0, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    .line 3
    sget-object v0, Lm/b/j/p0;->c:Lm/b/j/p0;

    iput-object v0, p0, Lm/b/j/q0;->a:Lm/b/j/p0;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lm/b/i/b;)Lm/b/j/n0;
    .locals 0

    .line 1
    iput-object p1, p0, Lm/b/j/o0;->b:Ljava/lang/String;

    .line 2
    iput-object p2, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/b/j/o0;->c:Ljava/lang/String;

    return-object p0
.end method

.method public l()Lm/b/j/o0;
    .locals 1

    .line 2
    invoke-super {p0}, Lm/b/j/o0;->l()Lm/b/j/o0;

    .line 3
    new-instance v0, Lm/b/i/b;

    invoke-direct {v0}, Lm/b/i/b;-><init>()V

    iput-object v0, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    return-object p0
.end method

.method public bridge synthetic l()Lm/b/j/q0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lm/b/j/n0;->l()Lm/b/j/o0;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    const-string v1, ">"

    const-string v2, "<"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm/b/i/b;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm/b/j/o0;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lm/b/j/o0;->j:Lm/b/i/b;

    invoke-virtual {v2}, Lm/b/i/b;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm/b/j/o0;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
