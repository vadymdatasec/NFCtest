.class public final enum Lm/b/j/s;
.super Lm/b/j/b0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lm/b/j/b0;-><init>(Ljava/lang/String;ILm/b/j/m;)V

    return-void
.end method


# virtual methods
.method public a(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lm/b/j/q0;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lm/b/j/q0;->g()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lm/b/j/q0;->b()Lm/b/j/j0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/j0;)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-static {p1}, Lm/b/j/b0;->a(Lm/b/j/q0;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    .line 6
    :cond_2
    invoke-virtual {p1}, Lm/b/j/q0;->k()Z

    move-result v0

    const-string v3, "html"

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 8
    sget-object p1, Lm/b/j/b0;->d:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    :goto_0
    return v2

    .line 9
    :cond_3
    invoke-virtual {p1}, Lm/b/j/q0;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    const-string v2, "head"

    const-string v4, "body"

    const-string v5, "br"

    filled-new-array {v2, v4, v3, v5}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 10
    invoke-virtual {p0, p1, p2}, Lm/b/j/s;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 11
    :cond_4
    invoke-virtual {p1}, Lm/b/j/q0;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 12
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v1

    .line 13
    :cond_5
    invoke-virtual {p0, p1, p2}, Lm/b/j/s;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1
.end method

.method public final b(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 1

    const-string v0, "html"

    .line 1
    invoke-virtual {p2, v0}, Lm/b/j/b;->k(Ljava/lang/String;)Lm/b/i/l;

    .line 2
    sget-object v0, Lm/b/j/b0;->d:Lm/b/j/b0;

    invoke-virtual {p2, v0}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    .line 3
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1
.end method
