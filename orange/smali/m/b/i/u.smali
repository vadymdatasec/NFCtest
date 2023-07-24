.class public Lm/b/i/u;
.super Lm/b/i/t;
.source "SourceFile"


# instance fields
.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm/b/i/t;-><init>()V

    .line 2
    iput-object p2, p0, Lm/b/i/t;->e:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Lm/b/i/u;->h:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/StringBuilder;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p0

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lm/b/i/u;->r()V

    .line 7
    invoke-super {p0, p1}, Lm/b/i/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a()Lm/b/i/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lm/b/i/u;->r()V

    .line 3
    invoke-super {p0}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;
    .locals 0

    .line 4
    invoke-virtual {p0}, Lm/b/i/u;->r()V

    .line 5
    invoke-super {p0, p1, p2}, Lm/b/i/t;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/t;

    return-object p0
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    invoke-virtual {p0}, Lm/b/i/u;->r()V

    .line 7
    invoke-super {p0, p1}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lm/b/i/g;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lm/b/i/t;->p()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lm/b/i/t;->b:Lm/b/i/t;

    instance-of v1, v0, Lm/b/i/l;

    if-eqz v1, :cond_0

    check-cast v0, Lm/b/i/l;

    invoke-virtual {v0}, Lm/b/i/l;->B()Lm/b/j/g0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/g0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lm/b/i/u;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p3}, Lm/b/i/g;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lm/b/i/t;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lm/b/i/u;->t()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lm/b/i/t;->a(Ljava/lang/Appendable;ILm/b/i/g;)V

    .line 3
    :cond_2
    invoke-virtual {p3}, Lm/b/i/g;->g()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lm/b/i/t;->l()Lm/b/i/t;

    move-result-object p2

    instance-of p2, p2, Lm/b/i/l;

    if-eqz p2, :cond_3

    .line 4
    invoke-virtual {p0}, Lm/b/i/t;->l()Lm/b/i/t;

    move-result-object p2

    invoke-static {p2}, Lm/b/i/l;->g(Lm/b/i/t;)Z

    move-result p2

    if-nez p2, :cond_3

    const/4 p2, 0x1

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    const/4 v4, 0x0

    .line 5
    :goto_0
    invoke-virtual {p0}, Lm/b/i/u;->s()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    move-object v2, p3

    invoke-static/range {v0 .. v5}, Lm/b/i/p;->a(Ljava/lang/Appendable;Ljava/lang/String;Lm/b/i/g;ZZZ)V

    return-void
.end method

.method public c(Ljava/lang/Appendable;ILm/b/i/g;)V
    .locals 0

    return-void
.end method

.method public c(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lm/b/i/u;->r()V

    .line 2
    invoke-super {p0, p1}, Lm/b/i/t;->c(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const-string v0, "#text"

    return-object v0
.end method

.method public final r()V
    .locals 3

    .line 1
    iget-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lm/b/i/b;

    invoke-direct {v0}, Lm/b/i/b;-><init>()V

    iput-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    .line 3
    iget-object v1, p0, Lm/b/i/u;->h:Ljava/lang/String;

    const-string v2, "text"

    invoke-virtual {v0, v2, v1}, Lm/b/i/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public s()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lm/b/i/t;->d:Lm/b/i/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lm/b/i/u;->h:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v1, "text"

    invoke-virtual {v0, v1}, Lm/b/i/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public t()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/i/u;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm/b/h/i;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm/b/i/t;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
